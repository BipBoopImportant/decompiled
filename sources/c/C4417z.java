package C;

/* renamed from: C.z  reason: case insensitive filesystem */
public final class C4417z {

    /* renamed from: c  reason: collision with root package name */
    public static final C4417z f5464c = new C4417z(0, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final C4417z f5465d = new C4417z(1, 8);

    /* renamed from: e  reason: collision with root package name */
    public static final C4417z f5466e = new C4417z(2, 10);

    /* renamed from: f  reason: collision with root package name */
    public static final C4417z f5467f = new C4417z(3, 10);

    /* renamed from: g  reason: collision with root package name */
    public static final C4417z f5468g = new C4417z(4, 10);

    /* renamed from: h  reason: collision with root package name */
    public static final C4417z f5469h = new C4417z(5, 10);

    /* renamed from: i  reason: collision with root package name */
    public static final C4417z f5470i = new C4417z(6, 10);

    /* renamed from: j  reason: collision with root package name */
    public static final C4417z f5471j = new C4417z(6, 8);

    /* renamed from: a  reason: collision with root package name */
    private final int f5472a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5473b;

    public C4417z(int i10, int i11) {
        this.f5472a = i10;
        this.f5473b = i11;
    }

    private static String c(int i10) {
        switch (i10) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.f5473b;
    }

    public int b() {
        return this.f5472a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4417z)) {
            return false;
        }
        C4417z zVar = (C4417z) obj;
        return this.f5472a == zVar.b() && this.f5473b == zVar.a();
    }

    public int hashCode() {
        return ((this.f5472a ^ 1000003) * 1000003) ^ this.f5473b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f5472a) + ", bitDepth=" + this.f5473b + "}";
    }
}
