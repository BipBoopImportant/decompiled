package com.optimizely.ab.config.parser;

import com.optimizely.ab.config.ProjectConfig;

public interface ConfigParser {
    <T> T fromJson(String str, Class<T> cls);

    ProjectConfig parseProjectConfig(String str);

    String toJson(Object obj);
}
