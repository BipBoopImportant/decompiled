package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LoggerManager {
    private static final String CONF_LOGGER = "logger.";
    private static final Pattern CONF_LOGGER_REGEX = Pattern.compile("(.*?):(.*?)(:(.*))?");
    private static final String CONF_ROOT = "root";
    private static final Handler DEFAULT_HANDLER;
    private static final Logger DEFAULT_LOGGER;
    private static final Map<String, Handler> HANDLER_MAP = Collections.unmodifiableMap(loadConfiguration());
    private static final Map<String, Logger> LOGGER_CACHE = new WeakHashMap();
    private static final int MAX_LOG_TAG_LENGTH = 23;
    private static final String PROPERTIES_NAME = "android-logger.properties";

    static {
        PatternHandler patternHandler = new PatternHandler(Logger.Level.VERBOSE, "%logger", "%date %caller%n");
        DEFAULT_HANDLER = patternHandler;
        DEFAULT_LOGGER = new SimpleLogger("ROOT", patternHandler);
    }

    private LoggerManager() {
        throw new UnsupportedOperationException();
    }

    private static Handler decodeHandler(String str) {
        Matcher matcher = CONF_LOGGER_REGEX.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(4);
            if (group2.length() > 23) {
                String substring = group2.substring(0, 23);
                DEFAULT_LOGGER.w("Android doesn't support tags %d characters longer. Tag '%s' will be trimmed to '%s'", 23, group2, substring);
                group2 = substring;
            }
            try {
                return new PatternHandler(Logger.Level.valueOf(group), group2, group3);
            } catch (IllegalArgumentException unused) {
                DEFAULT_LOGGER.w("Cannot parse '%s' as logging level. Only %s are allowed", group, Arrays.toString(Logger.Level.values()));
                return null;
            }
        } else {
            DEFAULT_LOGGER.w("Wrong format of logger configuration: '%s'", str);
            return null;
        }
    }

    private static Handler findHandler(String str) {
        String str2 = null;
        if (str != null) {
            for (String next : HANDLER_MAP.keySet()) {
                if (next != null && str.startsWith(next)) {
                    if ((next.length() >= str.length() || str.charAt(next.length()) == '.' || str.charAt(next.length()) == '$') && (str2 == null || str2.length() < next.length())) {
                        str2 = next;
                    }
                }
            }
        }
        Handler handler = HANDLER_MAP.get(str2);
        return handler != null ? handler : DEFAULT_HANDLER;
    }

    public static Logger getLogger(String str) {
        Logger logger;
        Map<String, Logger> map = LOGGER_CACHE;
        synchronized (map) {
            logger = map.get(str);
        }
        if (logger == null) {
            logger = new SimpleLogger(str, findHandler(str));
            synchronized (map) {
                map.put(logger.getName(), logger);
            }
        }
        return logger;
    }

    private static Map<String, Handler> loadConfiguration() {
        HashMap hashMap = new HashMap();
        Properties properties = new Properties();
        try {
            loadProperties(properties);
            if (!properties.propertyNames().hasMoreElements()) {
                DEFAULT_LOGGER.e("Logger configuration file is empty. Default configuration will be used");
                hashMap.put((Object) null, DEFAULT_HANDLER);
                return hashMap;
            }
            Enumeration<?> propertyNames = properties.propertyNames();
            while (propertyNames.hasMoreElements()) {
                String str = (String) propertyNames.nextElement();
                Handler decodeHandler = decodeHandler(properties.getProperty(str));
                if (decodeHandler != null) {
                    if (str.equals(CONF_ROOT)) {
                        hashMap.put((Object) null, decodeHandler);
                    } else if (str.startsWith(CONF_LOGGER)) {
                        String substring = str.substring(7);
                        if (substring.equalsIgnoreCase("ROOT")) {
                            substring = null;
                        }
                        hashMap.put(substring, decodeHandler);
                    } else {
                        DEFAULT_LOGGER.e("unknown key '%s' in '%s' file", str, PROPERTIES_NAME);
                    }
                }
            }
            if (!hashMap.containsKey((Object) null)) {
                hashMap.put((Object) null, DEFAULT_HANDLER);
            }
            return hashMap;
        } catch (IOException e10) {
            DEFAULT_LOGGER.e(e10, "Cannot configure logger from '%s'. Default configuration will be used", PROPERTIES_NAME);
            hashMap.put((Object) null, DEFAULT_HANDLER);
            return hashMap;
        }
    }

    private static void loadProperties(Properties properties) {
        InputStream inputStream = null;
        try {
            InputStream resourceAsStream = LoggerManager.class.getClassLoader().getResourceAsStream(PROPERTIES_NAME);
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
            } else {
                resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream(PROPERTIES_NAME);
                if (resourceAsStream != null) {
                    properties.load(resourceAsStream);
                }
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public static Logger getLogger(Class<?> cls) {
        return getLogger(cls == null ? null : cls.getName());
    }

    public static Logger getLogger() {
        return getLogger(Utils.getCallerClassName());
    }
}
