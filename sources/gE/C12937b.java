package GE;

import GE.C12939d;
import com.optimizely.ab.bucketing.c;
import com.optimizely.ab.config.Variation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: GE.b  reason: case insensitive filesystem */
public final class C12937b {

    /* renamed from: a  reason: collision with root package name */
    protected String f110450a;

    /* renamed from: b  reason: collision with root package name */
    protected String f110451b;

    /* renamed from: c  reason: collision with root package name */
    protected Map<String, ?> f110452c;

    /* renamed from: d  reason: collision with root package name */
    protected Map<String, ?> f110453d;

    /* renamed from: GE.b$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f110454a;

        /* renamed from: b  reason: collision with root package name */
        private String f110455b;

        /* renamed from: c  reason: collision with root package name */
        private Variation f110456c;

        /* renamed from: d  reason: collision with root package name */
        private String f110457d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, ?> f110458e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, Object> f110459f;

        public C12937b a() {
            if (this.f110454a == null) {
                throw new com.optimizely.ab.c("type not set");
            } else if (this.f110455b != null) {
                HashMap hashMap = new HashMap();
                this.f110459f = hashMap;
                hashMap.put("experimentKey", this.f110455b);
                Map<String, Object> map = this.f110459f;
                Variation variation = this.f110456c;
                map.put("variationKey", variation != null ? variation.getKey() : null);
                return new C12937b(this.f110454a, this.f110457d, this.f110458e, this.f110459f);
            } else {
                throw new com.optimizely.ab.c("experimentKey not set");
            }
        }

        public a b(Map<String, ?> map) {
            this.f110458e = map;
            return this;
        }

        public a c(String str) {
            this.f110455b = str;
            return this;
        }

        public a d(String str) {
            this.f110454a = str;
            return this;
        }

        public a e(String str) {
            this.f110457d = str;
            return this;
        }

        public a f(Variation variation) {
            this.f110456c = variation;
            return this;
        }
    }

    /* renamed from: GE.b$b  reason: collision with other inner class name */
    public static class C2654b {

        /* renamed from: a  reason: collision with root package name */
        private String f110460a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f110461b;

        /* renamed from: c  reason: collision with root package name */
        private C12943h f110462c;

        /* renamed from: d  reason: collision with root package name */
        private c.a f110463d;

        /* renamed from: e  reason: collision with root package name */
        private String f110464e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, ?> f110465f;

        /* renamed from: g  reason: collision with root package name */
        private Map<String, Object> f110466g;

        public C12937b a() {
            if (this.f110463d == null) {
                throw new com.optimizely.ab.c("source not set");
            } else if (this.f110460a == null) {
                throw new com.optimizely.ab.c("featureKey not set");
            } else if (this.f110461b != null) {
                HashMap hashMap = new HashMap();
                this.f110466g = hashMap;
                hashMap.put("featureKey", this.f110460a);
                this.f110466g.put("featureEnabled", this.f110461b);
                this.f110466g.put("source", this.f110463d.toString());
                this.f110466g.put("sourceInfo", this.f110462c.get());
                return new C12937b(C12939d.a.FEATURE.toString(), this.f110464e, this.f110465f, this.f110466g);
            } else {
                throw new com.optimizely.ab.c("featureEnabled not set");
            }
        }

        public C2654b b(Map<String, ?> map) {
            this.f110465f = map;
            return this;
        }

        public C2654b c(Boolean bool) {
            this.f110461b = bool;
            return this;
        }

        public C2654b d(String str) {
            this.f110460a = str;
            return this;
        }

        public C2654b e(c.a aVar) {
            this.f110463d = aVar;
            return this;
        }

        public C2654b f(C12943h hVar) {
            this.f110462c = hVar;
            return this;
        }

        public C2654b g(String str) {
            this.f110464e = str;
            return this;
        }
    }

    /* renamed from: GE.b$c */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private C12939d.a f110467a;

        /* renamed from: b  reason: collision with root package name */
        private String f110468b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f110469c;

        /* renamed from: d  reason: collision with root package name */
        private com.optimizely.ab.bucketing.c f110470d;

        /* renamed from: e  reason: collision with root package name */
        private String f110471e;

        /* renamed from: f  reason: collision with root package name */
        private String f110472f;

        /* renamed from: g  reason: collision with root package name */
        private Object f110473g;

        /* renamed from: h  reason: collision with root package name */
        private Object f110474h;

        /* renamed from: i  reason: collision with root package name */
        private String f110475i;

        /* renamed from: j  reason: collision with root package name */
        private Map<String, ?> f110476j;

        /* renamed from: k  reason: collision with root package name */
        private Map<String, Object> f110477k;

        protected c() {
        }

        public C12937b a() {
            if (this.f110468b == null) {
                throw new com.optimizely.ab.c("featureKey not set");
            } else if (this.f110469c != null) {
                HashMap hashMap = new HashMap();
                this.f110477k = hashMap;
                hashMap.put("featureKey", this.f110468b);
                this.f110477k.put("featureEnabled", this.f110469c);
                Object obj = this.f110474h;
                if (obj != null) {
                    this.f110467a = C12939d.a.ALL_FEATURE_VARIABLES;
                    this.f110477k.put("variableValues", obj);
                } else {
                    this.f110467a = C12939d.a.FEATURE_VARIABLE;
                    String str = this.f110471e;
                    if (str == null) {
                        throw new com.optimizely.ab.c("variableKey not set");
                    } else if (this.f110472f != null) {
                        this.f110477k.put("variableKey", str);
                        this.f110477k.put("variableType", this.f110472f.toString());
                        this.f110477k.put("variableValue", this.f110473g);
                    } else {
                        throw new com.optimizely.ab.c("variableType not set");
                    }
                }
                C12943h gVar = new C12942g();
                com.optimizely.ab.bucketing.c cVar = this.f110470d;
                if (cVar == null || !c.a.FEATURE_TEST.equals(cVar.f122303c)) {
                    this.f110477k.put("source", c.a.ROLLOUT.toString());
                } else {
                    gVar = new C12938c(this.f110470d.f122301a.getKey(), this.f110470d.f122302b.getKey());
                    this.f110477k.put("source", this.f110470d.f122303c.toString());
                }
                this.f110477k.put("sourceInfo", gVar.get());
                return new C12937b(this.f110467a.toString(), this.f110475i, this.f110476j, this.f110477k);
            } else {
                throw new com.optimizely.ab.c("featureEnabled not set");
            }
        }

        public c b(Map<String, ?> map) {
            this.f110476j = map;
            return this;
        }

        public c c(com.optimizely.ab.bucketing.c cVar) {
            this.f110470d = cVar;
            return this;
        }

        public c d(boolean z10) {
            this.f110469c = Boolean.valueOf(z10);
            return this;
        }

        public c e(String str) {
            this.f110468b = str;
            return this;
        }

        public c f(String str) {
            this.f110475i = str;
            return this;
        }

        public c g(String str) {
            this.f110471e = str;
            return this;
        }

        public c h(String str) {
            this.f110472f = str;
            return this;
        }

        public c i(Object obj) {
            this.f110473g = obj;
            return this;
        }

        public c j(Object obj) {
            this.f110474h = obj;
            return this;
        }
    }

    /* renamed from: GE.b$d */
    public static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f110478a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Boolean f110479b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Object f110480c;

        /* renamed from: d  reason: collision with root package name */
        private String f110481d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, ?> f110482e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f110483f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public String f110484g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public List<String> f110485h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public Boolean f110486i;

        /* renamed from: j  reason: collision with root package name */
        private Map<String, Object> f110487j;

        /* renamed from: GE.b$d$a */
        class a extends HashMap<String, Object> {
            a() {
                put("flagKey", d.this.f110478a);
                put("enabled", d.this.f110479b);
                put("variables", d.this.f110480c);
                put("variationKey", d.this.f110483f);
                put("ruleKey", d.this.f110484g);
                put("reasons", d.this.f110485h);
                put("decisionEventDispatched", d.this.f110486i);
            }
        }

        public C12937b h() {
            if (this.f110478a == null) {
                throw new com.optimizely.ab.c("flagKey not set");
            } else if (this.f110479b != null) {
                this.f110487j = new a();
                return new C12937b(C12939d.a.FLAG.toString(), this.f110481d, this.f110482e, this.f110487j);
            } else {
                throw new com.optimizely.ab.c("enabled not set");
            }
        }

        public d i(Map<String, ?> map) {
            this.f110482e = map;
            return this;
        }

        public d j(Boolean bool) {
            this.f110486i = bool;
            return this;
        }

        public d k(Boolean bool) {
            this.f110479b = bool;
            return this;
        }

        public d l(String str) {
            this.f110478a = str;
            return this;
        }

        public d m(List<String> list) {
            this.f110485h = list;
            return this;
        }

        public d n(String str) {
            this.f110484g = str;
            return this;
        }

        public d o(String str) {
            this.f110481d = str;
            return this;
        }

        public d p(Object obj) {
            this.f110480c = obj;
            return this;
        }

        public d q(String str) {
            this.f110483f = str;
            return this;
        }
    }

    protected C12937b() {
    }

    public static a a() {
        return new a();
    }

    public static C2654b b() {
        return new C2654b();
    }

    public static c c() {
        return new c();
    }

    public static d d() {
        return new d();
    }

    public String toString() {
        return "DecisionNotification{" + "type='" + this.f110450a + '\'' + ", userId='" + this.f110451b + '\'' + ", attributes=" + this.f110452c + ", decisionInfo=" + this.f110453d + '}';
    }

    protected C12937b(String str, String str2, Map<String, ?> map, Map<String, ?> map2) {
        this.f110450a = str;
        this.f110451b = str2;
        this.f110452c = map == null ? new HashMap<>() : map;
        this.f110453d = map2;
    }
}
