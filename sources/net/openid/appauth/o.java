package net.openid.appauth;

import AK.g;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class o {

    static final class a extends b<Boolean> {
        a(String str, boolean z10) {
            super(str, Boolean.valueOf(z10));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Boolean a(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f145154a;

        /* renamed from: b  reason: collision with root package name */
        public final T f145155b;

        b(String str, T t10) {
            this.f145154a = str;
            this.f145155b = t10;
        }

        /* access modifiers changed from: package-private */
        public abstract T a(String str);
    }

    static abstract class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f145156a;

        /* renamed from: b  reason: collision with root package name */
        public final List<T> f145157b;

        c(String str, List<T> list) {
            this.f145156a = str;
            this.f145157b = list;
        }
    }

    static final class d extends b<String> {
        d(String str, String str2) {
            super(str, str2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String a(String str) {
            return str;
        }

        d(String str) {
            this(str, (String) null);
        }
    }

    static final class e extends c<String> {
        e(String str) {
            super(str, (List) null);
        }

        e(String str, List<String> list) {
            super(str, list);
        }
    }

    static final class f extends b<Uri> {
        f(String str, Uri uri) {
            super(str, uri);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Uri a(String str) {
            return Uri.parse(str);
        }

        f(String str) {
            this(str, (Uri) null);
        }
    }

    public static <T> T a(JSONObject jSONObject, b<T> bVar) {
        try {
            return !jSONObject.has(bVar.f145154a) ? bVar.f145155b : bVar.a(jSONObject.getString(bVar.f145154a));
        } catch (JSONException e10) {
            throw new IllegalStateException("unexpected JSONException", e10);
        }
    }

    public static JSONObject b(JSONObject jSONObject, String str) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return optJSONObject;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Long c(JSONObject jSONObject, String str) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static String d(JSONObject jSONObject, String str) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            if (string != null) {
                return string;
            }
            throw new JSONException("field \"" + str + "\" is mapped to a null value");
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    public static String e(JSONObject jSONObject, String str) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static List<String> f(JSONObject jSONObject, String str) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (jSONObject.has(str)) {
            return t(jSONObject.getJSONArray(str));
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    public static Map<String, String> g(JSONObject jSONObject, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return linkedHashMap;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, (String) g.e(jSONObject2.getString(next), "additional parameter values must not be null"));
        }
        return linkedHashMap;
    }

    public static Uri h(JSONObject jSONObject, String str) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Uri i(JSONObject jSONObject, String str) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static JSONObject j(Map<String, String> map) {
        g.d(map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            g.e((String) next.getKey(), "map entries must not have null keys");
            g.e((String) next.getValue(), "map entries must not have null values");
            l(jSONObject, (String) next.getKey(), (String) next.getValue());
        }
        return jSONObject;
    }

    public static void k(JSONObject jSONObject, String str, int i10) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        g.e(Integer.valueOf(i10), "value must not be null");
        try {
            jSONObject.put(str, i10);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void l(JSONObject jSONObject, String str, String str2) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        g.e(str2, "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void m(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        g.e(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void n(JSONObject jSONObject, String str, Uri uri) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (uri != null) {
            try {
                jSONObject.put(str, uri.toString());
            } catch (JSONException e10) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e10);
            }
        }
    }

    public static void o(JSONObject jSONObject, String str, Long l10) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (l10 != null) {
            try {
                jSONObject.put(str, l10);
            } catch (JSONException e10) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e10);
            }
        }
    }

    public static void p(JSONObject jSONObject, String str, String str2) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (str2 != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e10) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e10);
            }
        }
    }

    public static void q(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        g.e(jSONObject, "json must not be null");
        g.e(str, "field must not be null");
        if (jSONObject2 != null) {
            try {
                jSONObject.put(str, jSONObject2);
            } catch (JSONException e10) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e10);
            }
        }
    }

    public static List<Object> r(JSONArray jSONArray) {
        g.e(jSONArray, "jsonArray must not be null");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = r((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = s((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map<String, Object> s(JSONObject jSONObject) {
        g.e(jSONObject, "json must not be null");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = r((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = s((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static List<String> t(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(g.d(jSONArray.get(i10)).toString());
            }
        }
        return arrayList;
    }
}
