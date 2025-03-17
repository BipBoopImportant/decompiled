package JH;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"LJH/t;", "", "<init>", "()V", "", "b", "Z", "a", "()Z", "IS_BROWSER", "c", "getIS_NODE", "IS_NODE", "d", "getIS_JVM", "IS_JVM", "e", "getIS_NATIVE", "IS_NATIVE", "f", "IS_DEVELOPMENT_MODE", "g", "getIS_NEW_MM_ENABLED", "IS_NEW_MM_ENABLED", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f135734a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f135735b;

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f135736c;

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f135737d;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f135738e;

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f135739f;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f135740g;

    static {
        t tVar = new t();
        f135734a = tVar;
        boolean z10 = false;
        f135735b = u.a(tVar) == s.Browser;
        f135736c = u.a(tVar) == s.Node;
        f135737d = u.a(tVar) == s.Jvm;
        if (u.a(tVar) == s.Native) {
            z10 = true;
        }
        f135738e = z10;
        f135739f = u.b(tVar);
        f135740g = u.c(tVar);
    }

    private t() {
    }

    public final boolean a() {
        return f135735b;
    }

    public final boolean b() {
        return f135739f;
    }
}
