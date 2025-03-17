package FE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: FE.g  reason: case insensitive filesystem */
public final class C12875g {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f109759a;

    /* renamed from: b  reason: collision with root package name */
    private static Properties f109760b;

    static {
        Logger logger = LoggerFactory.getLogger((Class<?>) C12875g.class);
        f109759a = logger;
        InputStream inputStream = null;
        try {
            InputStream c10 = c("optimizely.properties");
            if (c10 != null) {
                Properties properties = new Properties();
                f109760b = properties;
                properties.load(c10);
            } else {
                logger.debug("Optimizely properties file not found in filesystem or classpath: '{}'.", (Object) "optimizely.properties");
            }
            if (c10 != null) {
                try {
                    c10.close();
                } catch (IOException e10) {
                    f109759a.warn("Error closing properties file.", (Throwable) e10);
                }
            }
        } catch (Exception e11) {
            f109759a.error("Error loading Optimizely properties file '{}': ", (Object) "optimizely.properties", (Object) e11);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    f109759a.warn("Error closing properties file.", (Throwable) e12);
                }
            }
            throw th2;
        }
    }

    public static String a(String str) {
        return b(str, (String) null);
    }

    public static String b(String str, String str2) {
        String property = System.getProperty("optimizely." + str.toLowerCase());
        if (property != null) {
            f109759a.debug("Found {}={} in Java System Properties.", (Object) str, (Object) property);
            return property.trim();
        }
        String str3 = System.getenv("OPTIMIZELY_" + str.replace(".", "_").toUpperCase());
        if (str3 != null) {
            f109759a.debug("Found {}={} in System Environment Variables.", (Object) str, (Object) str3);
            return str3.trim();
        }
        Properties properties = f109760b;
        String property2 = properties == null ? null : properties.getProperty(str);
        if (property2 == null) {
            return str2;
        }
        f109759a.debug("Found {}={} in {}.", str, property2, "optimizely.properties");
        return property2.trim();
    }

    private static InputStream c(String str) {
        File file = new File(str);
        return (!file.isFile() || !file.canRead()) ? Thread.currentThread().getContextClassLoader().getResourceAsStream(str) : new FileInputStream(file);
    }

    public static Integer d(String str, Integer num) {
        String a10 = a(str);
        if (a10 == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a10));
        } catch (NumberFormatException e10) {
            f109759a.warn("Cannot convert {} to an integer.", (Object) a10, (Object) e10);
            return num;
        }
    }

    public static Long e(String str, Long l10) {
        String a10 = a(str);
        if (a10 == null) {
            return l10;
        }
        try {
            return Long.valueOf(Long.parseLong(a10));
        } catch (NumberFormatException e10) {
            f109759a.warn("Cannot convert {} to an long.", (Object) a10, (Object) e10);
            return l10;
        }
    }
}
