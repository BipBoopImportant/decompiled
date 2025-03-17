package com.optimizely.ab.config.audience;

import com.optimizely.ab.config.ProjectConfig;
import java.util.Map;

public interface Condition<T> {
    Boolean evaluate(ProjectConfig projectConfig, Map<String, ?> map);

    String getOperandOrId();

    String toJson();
}
