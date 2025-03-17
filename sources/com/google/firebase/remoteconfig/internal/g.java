package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class g {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final Date f68742h = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f68743a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f68744b;

    /* renamed from: c  reason: collision with root package name */
    private Date f68745c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f68746d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f68747e;

    /* renamed from: f  reason: collision with root package name */
    private long f68748f;

    /* renamed from: g  reason: collision with root package name */
    private JSONArray f68749g;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f68750a;

        /* renamed from: b  reason: collision with root package name */
        private Date f68751b;

        /* renamed from: c  reason: collision with root package name */
        private JSONArray f68752c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f68753d;

        /* renamed from: e  reason: collision with root package name */
        private long f68754e;

        /* renamed from: f  reason: collision with root package name */
        private JSONArray f68755f;

        public g a() {
            return new g(this.f68750a, this.f68751b, this.f68752c, this.f68753d, this.f68754e, this.f68755f);
        }

        public b b(JSONObject jSONObject) {
            try {
                this.f68750a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b c(JSONArray jSONArray) {
            try {
                this.f68752c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(Date date) {
            this.f68751b = date;
            return this;
        }

        public b e(JSONObject jSONObject) {
            try {
                this.f68753d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b f(JSONArray jSONArray) {
            try {
                this.f68755f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(long j10) {
            this.f68754e = j10;
            return this;
        }

        private b() {
            this.f68750a = new JSONObject();
            this.f68751b = g.f68742h;
            this.f68752c = new JSONArray();
            this.f68753d = new JSONObject();
            this.f68754e = 0;
            this.f68755f = new JSONArray();
        }
    }

    static g b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    private Map<String, Map<String, String>> c() {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < j().length(); i10++) {
            JSONObject jSONObject = j().getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string3 = jSONArray.getString(i11);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
        }
        return hashMap;
    }

    private static g d(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public JSONArray e() {
        return this.f68746d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f68743a.toString().equals(((g) obj).toString());
    }

    public Set<String> f(g gVar) {
        JSONObject g10 = d(gVar.f68743a).g();
        Map<String, Map<String, String>> c10 = c();
        Map<String, Map<String, String>> c11 = gVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = g().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!gVar.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(gVar.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !gVar.i().has(next)) || (!i().has(next) && gVar.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && gVar.i().has(next) && !i().getJSONObject(next).toString().equals(gVar.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (c10.containsKey(next) != c11.containsKey(next)) {
                hashSet.add(next);
            } else if (!c10.containsKey(next) || !c11.containsKey(next) || c10.get(next).equals(c11.get(next))) {
                g10.remove(next);
            } else {
                hashSet.add(next);
            }
        }
        Iterator<String> keys2 = g10.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f68744b;
    }

    public Date h() {
        return this.f68745c;
    }

    public int hashCode() {
        return this.f68743a.hashCode();
    }

    public JSONObject i() {
        return this.f68747e;
    }

    public JSONArray j() {
        return this.f68749g;
    }

    public long k() {
        return this.f68748f;
    }

    public String toString() {
        return this.f68743a.toString();
    }

    private g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f68744b = jSONObject;
        this.f68745c = date;
        this.f68746d = jSONArray;
        this.f68747e = jSONObject2;
        this.f68748f = j10;
        this.f68749g = jSONArray2;
        this.f68743a = jSONObject3;
    }
}
