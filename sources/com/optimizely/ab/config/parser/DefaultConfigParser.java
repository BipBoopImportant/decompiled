package com.optimizely.ab.config.parser;

import FE.C12875g;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class DefaultConfigParser {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) DefaultConfigParser.class);

    public enum ConfigParserSupplier {
        GSON_CONFIG_PARSER("com.google.gson.Gson", new a()),
        JACKSON_CONFIG_PARSER("com.fasterxml.jackson.databind.ObjectMapper", new b()),
        JSON_CONFIG_PARSER("org.json.JSONObject", new c()),
        JSON_SIMPLE_CONFIG_PARSER("org.json.simple.JSONObject", new d());
        
        private final String className;
        private final ParserSupplier supplier;

        private ConfigParserSupplier(String str, ParserSupplier parserSupplier) {
            this.className = str;
            this.supplier = parserSupplier;
        }

        /* access modifiers changed from: private */
        public boolean isPresent() {
            try {
                Class.forName(this.className);
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public ConfigParser get() {
            return this.supplier.get();
        }
    }

    private static class LazyHolder {
        /* access modifiers changed from: private */
        public static final ConfigParser INSTANCE = DefaultConfigParser.create();

        private LazyHolder() {
        }
    }

    @FunctionalInterface
    public interface ParserSupplier {
        ConfigParser get();
    }

    private DefaultConfigParser() {
    }

    /* access modifiers changed from: private */
    public static ConfigParser create() {
        String a10 = C12875g.a("default_parser");
        if (a10 != null) {
            try {
                ConfigParserSupplier valueOf = ConfigParserSupplier.valueOf(a10);
                if (valueOf.isPresent()) {
                    ConfigParser configParser = valueOf.get();
                    logger.debug("using json parser: {}, based on override config", (Object) configParser.getClass().getSimpleName());
                    return configParser;
                }
                logger.warn("configured parser {} is not available in the classpath", (Object) a10);
            } catch (IllegalArgumentException unused) {
                logger.warn("configured parser {} is not a valid value", (Object) a10);
            }
        }
        ConfigParserSupplier[] values = ConfigParserSupplier.values();
        int length = values.length;
        int i10 = 0;
        while (i10 < length) {
            ConfigParserSupplier configParserSupplier = values[i10];
            if (!configParserSupplier.isPresent()) {
                i10++;
            } else {
                ConfigParser configParser2 = configParserSupplier.get();
                logger.info("using json parser: {}", (Object) configParser2.getClass().getSimpleName());
                return configParser2;
            }
        }
        throw new MissingJsonParserException("unable to locate a JSON parser. Please see <link> for more information");
    }

    public static ConfigParser getInstance() {
        return LazyHolder.INSTANCE;
    }
}
