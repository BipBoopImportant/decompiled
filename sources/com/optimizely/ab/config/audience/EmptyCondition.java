package com.optimizely.ab.config.audience;

import com.optimizely.ab.config.ProjectConfig;
import java.util.Map;

public class EmptyCondition<T> implements Condition<T> {
    public Boolean evaluate(ProjectConfig projectConfig, Map<String, ?> map) {
        return Boolean.TRUE;
    }

    public String getOperandOrId() {
        return null;
    }

    public String toJson() {
        return null;
    }
}
