package com.optimizely.ab.config.audience;

import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.audience.match.MatchRegistry;
import com.optimizely.ab.config.audience.match.UnexpectedValueTypeException;
import com.optimizely.ab.config.audience.match.UnknownMatchTypeException;
import com.optimizely.ab.config.audience.match.UnknownValueTypeException;
import java.util.Collections;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserAttribute<T> implements Condition<T> {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) UserAttribute.class);
    private final String match;
    private final String name;
    private final String type;
    private final Object value;

    public UserAttribute(String str, String str2, String str3, Object obj) {
        this.name = str;
        this.type = str2;
        this.match = str3;
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserAttribute userAttribute = (UserAttribute) obj;
        if (!this.name.equals(userAttribute.name) || !this.type.equals(userAttribute.type)) {
            return false;
        }
        String str = this.match;
        if (str == null ? userAttribute.match != null : !str.equals(userAttribute.match)) {
            return false;
        }
        Object obj2 = this.value;
        Object obj3 = userAttribute.value;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public Boolean evaluate(ProjectConfig projectConfig, Map<String, ?> map) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        Object obj = map.get(this.name);
        if (!"custom_attribute".equals(this.type)) {
            logger.warn("Audience condition \"{}\" uses an unknown condition type. You may need to upgrade to a newer release of the Optimizely SDK.", (Object) this);
            return null;
        }
        try {
            Boolean eval = MatchRegistry.getMatch(this.match).eval(this.value, obj);
            if (eval != null) {
                return eval;
            }
            throw new UnknownValueTypeException();
        } catch (UnknownValueTypeException unused) {
            if (!map.containsKey(this.name)) {
                logger.debug("Audience condition \"{}\" evaluated to UNKNOWN because no value was passed for user attribute \"{}\"", (Object) this, (Object) this.name);
            } else if (obj != null) {
                logger.warn("Audience condition \"{}\" evaluated to UNKNOWN because a value of type \"{}\" was passed for user attribute \"{}\"", this, obj.getClass().getCanonicalName(), this.name);
            } else {
                logger.debug("Audience condition \"{}\" evaluated to UNKNOWN because a null value was passed for user attribute \"{}\"", (Object) this, (Object) this.name);
            }
            return null;
        } catch (UnexpectedValueTypeException | UnknownMatchTypeException e10) {
            Logger logger2 = logger;
            logger2.warn("Audience condition \"{}\" " + e10.getMessage(), (Object) this);
            return null;
        } catch (NullPointerException e11) {
            Logger logger3 = logger;
            String str = this.match;
            if (str == null) {
                str = "legacy condition";
            }
            logger3.error("attribute or value null for match {}", (Object) str, (Object) e11);
            return null;
        }
    }

    public String getMatch() {
        return this.match;
    }

    public String getName() {
        return this.name;
    }

    public String getOperandOrId() {
        return null;
    }

    public String getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public String getValueStr() {
        Object obj = this.value;
        return obj == null ? "null" : obj instanceof String ? String.format("%s", new Object[]{obj}) : obj.toString();
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.match;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Object obj = this.value;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toJson() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.name != null) {
            sb2.append("{\"name\":\"" + this.name + "\"");
        }
        if (this.type != null) {
            sb2.append(", \"type\":\"" + this.type + "\"");
        }
        if (this.match != null) {
            sb2.append(", \"match\":\"" + this.match + "\"");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(", \"value\":");
        if (this.value instanceof String) {
            str = "\"" + getValueStr() + "\"";
        } else {
            str = getValueStr();
        }
        sb3.append(str);
        sb3.append("}");
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{name='");
        sb2.append(this.name);
        sb2.append("', type='");
        sb2.append(this.type);
        sb2.append("', match='");
        sb2.append(this.match);
        sb2.append("', value=");
        if (this.value instanceof String) {
            str = "'" + getValueStr() + "'";
        } else {
            str = getValueStr();
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
