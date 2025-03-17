package com.optimizely.ab.config.audience;

import com.optimizely.ab.config.ProjectConfig;
import java.util.List;
import java.util.Map;

public class OrCondition<T> implements Condition<T> {
    private static final String OPERAND = "OR";
    private final List<Condition> conditions;

    public OrCondition(List<Condition> list) {
        this.conditions = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OrCondition)) {
            return false;
        }
        return this.conditions.equals(((OrCondition) obj).getConditions());
    }

    public Boolean evaluate(ProjectConfig projectConfig, Map<String, ?> map) {
        List<Condition> list = this.conditions;
        if (list == null) {
            return null;
        }
        boolean z10 = false;
        for (Condition evaluate : list) {
            Boolean evaluate2 = evaluate.evaluate(projectConfig, map);
            if (evaluate2 == null) {
                z10 = true;
            } else if (evaluate2.booleanValue()) {
                return Boolean.TRUE;
            }
        }
        if (z10) {
            return null;
        }
        return Boolean.FALSE;
    }

    public List<Condition> getConditions() {
        return this.conditions;
    }

    public String getOperandOrId() {
        return OPERAND;
    }

    public int hashCode() {
        return this.conditions.hashCode();
    }

    public String toJson() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[\"or\", ");
        for (int i10 = 0; i10 < this.conditions.size(); i10++) {
            sb2.append(this.conditions.get(i10).toJson());
            if (i10 < this.conditions.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[or, ");
        for (int i10 = 0; i10 < this.conditions.size(); i10++) {
            sb2.append(this.conditions.get(i10));
            if (i10 < this.conditions.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
