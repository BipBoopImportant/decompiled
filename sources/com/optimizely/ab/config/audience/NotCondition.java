package com.optimizely.ab.config.audience;

import com.optimizely.ab.config.ProjectConfig;
import java.util.Map;

public class NotCondition<T> implements Condition<T> {
    private static final String OPERAND = "NOT";
    private final Condition condition;

    public NotCondition(Condition condition2) {
        this.condition = condition2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NotCondition)) {
            return false;
        }
        return this.condition.equals(((NotCondition) obj).getCondition());
    }

    public Boolean evaluate(ProjectConfig projectConfig, Map<String, ?> map) {
        Condition condition2 = this.condition;
        Boolean evaluate = condition2 == null ? null : condition2.evaluate(projectConfig, map);
        if (evaluate == null) {
            return null;
        }
        return Boolean.valueOf(!evaluate.booleanValue());
    }

    public Condition getCondition() {
        return this.condition;
    }

    public String getOperandOrId() {
        return OPERAND;
    }

    public int hashCode() {
        return this.condition.hashCode();
    }

    public String toJson() {
        return "[\"not\", " + this.condition.toJson() + "]";
    }

    public String toString() {
        return "[not, " + this.condition + "]";
    }
}
