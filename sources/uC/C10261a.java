package uc;

import ic.C9835c;
import ic.C9836d;

/* renamed from: uc.a  reason: case insensitive filesystem */
public final class C10261a {

    /* renamed from: p  reason: collision with root package name */
    private static final C10261a f76951p = new C1419a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f76952a;

    /* renamed from: b  reason: collision with root package name */
    private final String f76953b;

    /* renamed from: c  reason: collision with root package name */
    private final String f76954c;

    /* renamed from: d  reason: collision with root package name */
    private final c f76955d;

    /* renamed from: e  reason: collision with root package name */
    private final d f76956e;

    /* renamed from: f  reason: collision with root package name */
    private final String f76957f;

    /* renamed from: g  reason: collision with root package name */
    private final String f76958g;

    /* renamed from: h  reason: collision with root package name */
    private final int f76959h;

    /* renamed from: i  reason: collision with root package name */
    private final int f76960i;

    /* renamed from: j  reason: collision with root package name */
    private final String f76961j;

    /* renamed from: k  reason: collision with root package name */
    private final long f76962k;

    /* renamed from: l  reason: collision with root package name */
    private final b f76963l;

    /* renamed from: m  reason: collision with root package name */
    private final String f76964m;

    /* renamed from: n  reason: collision with root package name */
    private final long f76965n;

    /* renamed from: o  reason: collision with root package name */
    private final String f76966o;

    /* renamed from: uc.a$a  reason: collision with other inner class name */
    public static final class C1419a {

        /* renamed from: a  reason: collision with root package name */
        private long f76967a = 0;

        /* renamed from: b  reason: collision with root package name */
        private String f76968b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f76969c = "";

        /* renamed from: d  reason: collision with root package name */
        private c f76970d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f76971e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f76972f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f76973g = "";

        /* renamed from: h  reason: collision with root package name */
        private int f76974h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f76975i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f76976j = "";

        /* renamed from: k  reason: collision with root package name */
        private long f76977k = 0;

        /* renamed from: l  reason: collision with root package name */
        private b f76978l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        private String f76979m = "";

        /* renamed from: n  reason: collision with root package name */
        private long f76980n = 0;

        /* renamed from: o  reason: collision with root package name */
        private String f76981o = "";

        C1419a() {
        }

        public C10261a a() {
            return new C10261a(this.f76967a, this.f76968b, this.f76969c, this.f76970d, this.f76971e, this.f76972f, this.f76973g, this.f76974h, this.f76975i, this.f76976j, this.f76977k, this.f76978l, this.f76979m, this.f76980n, this.f76981o);
        }

        public C1419a b(String str) {
            this.f76979m = str;
            return this;
        }

        public C1419a c(String str) {
            this.f76973g = str;
            return this;
        }

        public C1419a d(String str) {
            this.f76981o = str;
            return this;
        }

        public C1419a e(b bVar) {
            this.f76978l = bVar;
            return this;
        }

        public C1419a f(String str) {
            this.f76969c = str;
            return this;
        }

        public C1419a g(String str) {
            this.f76968b = str;
            return this;
        }

        public C1419a h(c cVar) {
            this.f76970d = cVar;
            return this;
        }

        public C1419a i(String str) {
            this.f76972f = str;
            return this;
        }

        public C1419a j(int i10) {
            this.f76974h = i10;
            return this;
        }

        public C1419a k(long j10) {
            this.f76967a = j10;
            return this;
        }

        public C1419a l(d dVar) {
            this.f76971e = dVar;
            return this;
        }

        public C1419a m(String str) {
            this.f76976j = str;
            return this;
        }

        public C1419a n(int i10) {
            this.f76975i = i10;
            return this;
        }
    }

    /* renamed from: uc.a$b */
    public enum b implements C9835c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        private b(int i10) {
            this.number_ = i10;
        }

        public int d() {
            return this.number_;
        }
    }

    /* renamed from: uc.a$c */
    public enum c implements C9835c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        private c(int i10) {
            this.number_ = i10;
        }

        public int d() {
            return this.number_;
        }
    }

    /* renamed from: uc.a$d */
    public enum d implements C9835c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        private d(int i10) {
            this.number_ = i10;
        }

        public int d() {
            return this.number_;
        }
    }

    C10261a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f76952a = j10;
        this.f76953b = str;
        this.f76954c = str2;
        this.f76955d = cVar;
        this.f76956e = dVar;
        this.f76957f = str3;
        this.f76958g = str4;
        this.f76959h = i10;
        this.f76960i = i11;
        this.f76961j = str5;
        this.f76962k = j11;
        this.f76963l = bVar;
        this.f76964m = str6;
        this.f76965n = j12;
        this.f76966o = str7;
    }

    public static C1419a p() {
        return new C1419a();
    }

    @C9836d(tag = 13)
    public String a() {
        return this.f76964m;
    }

    @C9836d(tag = 11)
    public long b() {
        return this.f76962k;
    }

    @C9836d(tag = 14)
    public long c() {
        return this.f76965n;
    }

    @C9836d(tag = 7)
    public String d() {
        return this.f76958g;
    }

    @C9836d(tag = 15)
    public String e() {
        return this.f76966o;
    }

    @C9836d(tag = 12)
    public b f() {
        return this.f76963l;
    }

    @C9836d(tag = 3)
    public String g() {
        return this.f76954c;
    }

    @C9836d(tag = 2)
    public String h() {
        return this.f76953b;
    }

    @C9836d(tag = 4)
    public c i() {
        return this.f76955d;
    }

    @C9836d(tag = 6)
    public String j() {
        return this.f76957f;
    }

    @C9836d(tag = 8)
    public int k() {
        return this.f76959h;
    }

    @C9836d(tag = 1)
    public long l() {
        return this.f76952a;
    }

    @C9836d(tag = 5)
    public d m() {
        return this.f76956e;
    }

    @C9836d(tag = 10)
    public String n() {
        return this.f76961j;
    }

    @C9836d(tag = 9)
    public int o() {
        return this.f76960i;
    }
}
