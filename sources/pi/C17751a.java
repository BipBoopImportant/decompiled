package pI;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0012"}, d2 = {"LpI/a;", "", "<init>", "()V", "", "b", "D", "LN2", "c", "epsilon", "d", "taylor_2_bound", "e", "taylor_n_bound", "f", "upper_taylor_2_bound", "g", "upper_taylor_n_bound", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pI.a  reason: case insensitive filesystem */
final class C17751a {

    /* renamed from: a  reason: collision with root package name */
    public static final C17751a f146338a = new C17751a();

    /* renamed from: b  reason: collision with root package name */
    public static final double f146339b = Math.log(2.0d);

    /* renamed from: c  reason: collision with root package name */
    public static final double f146340c;

    /* renamed from: d  reason: collision with root package name */
    public static final double f146341d;

    /* renamed from: e  reason: collision with root package name */
    public static final double f146342e;

    /* renamed from: f  reason: collision with root package name */
    public static final double f146343f;

    /* renamed from: g  reason: collision with root package name */
    public static final double f146344g;

    static {
        double ulp = Math.ulp(1.0d);
        f146340c = ulp;
        double sqrt = Math.sqrt(ulp);
        f146341d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f146342e = sqrt2;
        double d10 = (double) 1;
        f146343f = d10 / sqrt;
        f146344g = d10 / sqrt2;
    }

    private C17751a() {
    }
}
