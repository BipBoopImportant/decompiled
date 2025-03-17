package zE;

import android.os.AsyncTask;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import yE.C15298a;

/* renamed from: zE.b  reason: case insensitive filesystem */
class C15338b {

    /* renamed from: a  reason: collision with root package name */
    protected final a f132540a;

    /* renamed from: b  reason: collision with root package name */
    private final Logger f132541b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Map<String, Object>> f132542c;

    /* renamed from: d  reason: collision with root package name */
    private final C3277b f132543d;

    /* renamed from: zE.b$a */
    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final C15298a f132544a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f132545b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final Logger f132546c;

        /* renamed from: d  reason: collision with root package name */
        private final String f132547d;

        /* renamed from: zE.b$a$a  reason: collision with other inner class name */
        class C3276a extends AsyncTask<Void, Void, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Map f132548a;

            C3276a(Map map) {
                this.f132548a = map;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Boolean doInBackground(Void[] voidArr) {
                try {
                    boolean d10 = a.this.f132544a.d(a.this.c(), C15339c.b(this.f132548a).toString());
                    if (d10) {
                        a.this.f132546c.info("Saved user profiles to disk.");
                    } else {
                        a.this.f132546c.warn("Unable to save user profiles to disk.");
                    }
                    return Boolean.valueOf(d10);
                } catch (Exception e10) {
                    a.this.f132546c.error("Unable to serialize user profiles to save to disk.", (Throwable) e10);
                    return Boolean.FALSE;
                }
            }
        }

        public a(C15298a aVar, Executor executor, Logger logger, String str) {
            this.f132544a = aVar;
            this.f132545b = executor;
            this.f132546c = logger;
            this.f132547d = str;
        }

        /* access modifiers changed from: package-private */
        public String c() {
            return String.format("optly-user-profile-service-%s.json", new Object[]{this.f132547d});
        }

        /* access modifiers changed from: package-private */
        public JSONObject d() {
            String c10 = this.f132544a.c(c());
            if (c10 != null) {
                return new JSONObject(c10);
            }
            this.f132546c.warn("Unable to load user profile cache from disk.");
            return new JSONObject();
        }

        /* access modifiers changed from: package-private */
        public void e(Map<String, Map<String, Object>> map) {
            new C3276a(map).executeOnExecutor(this.f132545b, new Void[0]);
        }
    }

    /* renamed from: zE.b$b  reason: collision with other inner class name */
    static class C3277b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final C15298a f132550a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f132551b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final Logger f132552c;

        /* renamed from: d  reason: collision with root package name */
        private final String f132553d;

        /* renamed from: zE.b$b$a */
        class a extends AsyncTask<Void, Void, Boolean> {
            a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Boolean doInBackground(Void[] voidArr) {
                boolean a10 = C3277b.this.f132550a.a(C3277b.this.d());
                Boolean valueOf = Boolean.valueOf(a10);
                if (a10) {
                    C3277b.this.f132552c.info("Deleted legacy user profile from disk.");
                } else {
                    C3277b.this.f132552c.warn("Unable to delete legacy user profile from disk.");
                }
                return valueOf;
            }
        }

        C3277b(C15298a aVar, Executor executor, Logger logger, String str) {
            this.f132550a = aVar;
            this.f132551b = executor;
            this.f132552c = logger;
            this.f132553d = str;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            new a().executeOnExecutor(this.f132551b, new Void[0]);
        }

        /* access modifiers changed from: package-private */
        public String d() {
            return String.format("optly-user-profile-%s.json", new Object[]{this.f132553d});
        }

        /* access modifiers changed from: package-private */
        public JSONObject e() {
            String c10 = this.f132550a.c(d());
            if (c10 == null) {
                this.f132552c.info("Legacy user profile cache not found.");
                return null;
            }
            try {
                return new JSONObject(c10);
            } catch (JSONException e10) {
                this.f132552c.warn("Unable to parse legacy user profiles. Will delete legacy user profile cache file.", (Throwable) e10);
                c();
                return null;
            }
        }
    }

    C15338b(a aVar, Logger logger, Map<String, Map<String, Object>> map, C3277b bVar) {
        this.f132541b = logger;
        this.f132540a = aVar;
        this.f132542c = map;
        this.f132543d = bVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f132542c.clear();
        this.f132540a.e(this.f132542c);
        this.f132541b.info("User profile cache cleared.");
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> b(String str) {
        if (str == null) {
            this.f132541b.error("Unable to lookup user profile because user ID was null.");
            return null;
        } else if (!str.isEmpty()) {
            return this.f132542c.get(str);
        } else {
            this.f132541b.error("Unable to lookup user profile because user ID was empty.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        JSONObject e10 = this.f132543d.e();
        if (e10 == null) {
            this.f132541b.info("No legacy user profiles to migrate.");
            return;
        }
        try {
            Iterator<String> keys = e10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject = e10.getJSONObject(next);
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                Iterator<String> keys2 = jSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    String string = jSONObject.getString(next2);
                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                    concurrentHashMap2.put("variation_id", string);
                    concurrentHashMap.put(next2, concurrentHashMap2);
                }
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                concurrentHashMap3.put("user_id", next);
                concurrentHashMap3.put("experiment_bucket_map", concurrentHashMap);
                e(concurrentHashMap3);
            }
        } catch (JSONException e11) {
            this.f132541b.warn("Unable to deserialize legacy user profiles. Will delete legacy user profile cache file.", (Throwable) e11);
        } catch (Throwable th2) {
            this.f132543d.c();
            throw th2;
        }
        this.f132543d.c();
    }

    public void d(Set<String> set) {
        for (String str : this.f132542c.keySet()) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f132542c.get(str).get("experiment_bucket_map");
            if (concurrentHashMap != null && concurrentHashMap.keySet().size() > 100) {
                for (String str2 : concurrentHashMap.keySet()) {
                    if (!set.contains(str2)) {
                        concurrentHashMap.remove(str2);
                    }
                }
            }
        }
        this.f132540a.e(this.f132542c);
    }

    /* access modifiers changed from: package-private */
    public void e(Map<String, Object> map) {
        String str = (String) map.get("user_id");
        if (str == null) {
            this.f132541b.error("Unable to save user profile because user ID was null.");
        } else if (str.isEmpty()) {
            this.f132541b.error("Unable to save user profile because user ID was empty.");
        } else {
            this.f132542c.put(str, map);
            this.f132540a.e(this.f132542c);
            this.f132541b.info("Saved user profile for {}.", (Object) str);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        c();
        try {
            Map<String, Map<String, Object>> a10 = C15339c.a(this.f132540a.d());
            this.f132542c.clear();
            this.f132542c.putAll(a10);
            this.f132541b.info("Loaded user profile cache from disk.");
        } catch (Exception e10) {
            a();
            this.f132541b.error("Unable to parse user profile cache from disk.", (Throwable) e10);
        }
    }
}
