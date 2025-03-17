package FE;

import com.google.gson.internal.g;
import com.optimizely.ab.config.audience.AndCondition;
import com.optimizely.ab.config.audience.AudienceIdCondition;
import com.optimizely.ab.config.audience.Condition;
import com.optimizely.ab.config.audience.EmptyCondition;
import com.optimizely.ab.config.audience.NotCondition;
import com.optimizely.ab.config.audience.NullCondition;
import com.optimizely.ab.config.audience.OrCondition;
import com.optimizely.ab.config.audience.UserAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: FE.b  reason: case insensitive filesystem */
public class C12870b {

    /* renamed from: a  reason: collision with root package name */
    static Logger f109756a = LoggerFactory.getLogger((Class<?>) C12870b.class);

    private static Condition a(String str, List<Condition> list) {
        str.hashCode();
        if (str.equals("and")) {
            return new AndCondition(list);
        }
        if (!str.equals("not")) {
            return new OrCondition(list);
        }
        return new NotCondition(list.isEmpty() ? new NullCondition() : list.get(0));
    }

    public static String b(Object obj) {
        if (obj == null || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3555:
                if (str.equals("or")) {
                    c10 = 0;
                    break;
                }
                break;
            case 96727:
                if (str.equals("and")) {
                    c10 = 1;
                    break;
                }
                break;
            case 109267:
                if (str.equals("not")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
                return str;
            default:
                return null;
        }
    }

    public static <T> Condition c(Class<T> cls, Object obj) {
        Class<UserAttribute> cls2 = UserAttribute.class;
        if (obj instanceof List) {
            return d(cls, (List) obj);
        }
        if (obj instanceof String) {
            AudienceIdCondition audienceIdCondition = new AudienceIdCondition((String) obj);
            if (cls.isInstance(audienceIdCondition)) {
                return audienceIdCondition;
            }
            throw new C12874f(String.format("Expected AudienceIdCondition got %s", new Object[]{cls.getCanonicalName()}));
        }
        try {
            if (obj instanceof g) {
                if (cls == cls2) {
                    g gVar = (g) obj;
                    return new UserAttribute((String) gVar.get("name"), (String) gVar.get("type"), (String) gVar.get("match"), gVar.get("value"));
                }
                throw new C12874f(String.format("Expected UserAttributes got %s", new Object[]{cls.getCanonicalName()}));
            }
        } catch (NoClassDefFoundError unused) {
            f109756a.debug("parser: gson library not loaded");
        }
        try {
            if (obj instanceof JSONObject) {
                if (cls == cls2) {
                    JSONObject jSONObject = (JSONObject) obj;
                    return new UserAttribute((String) jSONObject.get("name"), (String) jSONObject.get("type"), (String) jSONObject.get("match"), jSONObject.get("value"));
                }
                throw new C12874f(String.format("Expected UserAttributes got %s", new Object[]{cls.getCanonicalName()}));
            }
        } catch (NoClassDefFoundError unused2) {
            f109756a.debug("parser: simple json not found");
        }
        try {
            if (obj instanceof JSONArray) {
                return e(cls, (JSONArray) obj);
            }
            if (obj instanceof org.json.JSONObject) {
                if (cls == cls2) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                    Object obj2 = null;
                    String str = jSONObject2.has("match") ? (String) jSONObject2.get("match") : null;
                    if (jSONObject2.has("value")) {
                        obj2 = jSONObject2.get("value");
                    }
                    return new UserAttribute((String) jSONObject2.get("name"), (String) jSONObject2.get("type"), str, obj2);
                }
                throw new C12874f(String.format("Expected UserAttributes got %s", new Object[]{cls.getCanonicalName()}));
            }
            if (cls == cls2) {
                Map map = (Map) obj;
                return new UserAttribute((String) map.get("name"), (String) map.get("type"), (String) map.get("match"), map.get("value"));
            }
            throw new C12874f(String.format("Expected UserAttributes got %s", new Object[]{cls.getCanonicalName()}));
        } catch (NoClassDefFoundError unused3) {
            f109756a.debug("parser: json package not found.");
        }
    }

    public static <T> Condition d(Class<T> cls, List<Object> list) {
        if (list.size() == 0) {
            return new EmptyCondition();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        String b10 = b(list.get(0));
        if (b10 != null) {
            i10 = 1;
        } else {
            b10 = "or";
        }
        while (i10 < list.size()) {
            arrayList.add(c(cls, list.get(i10)));
            i10++;
        }
        return a(b10, arrayList);
    }

    public static <T> Condition e(Class<T> cls, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return new EmptyCondition();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        String b10 = b(jSONArray.get(0));
        if (b10 != null) {
            i10 = 1;
        } else {
            b10 = "or";
        }
        while (i10 < jSONArray.length()) {
            arrayList.add(c(cls, jSONArray.get(i10)));
            i10++;
        }
        return a(b10, arrayList);
    }
}
