package cJ;

import HJ.C15854t;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: cJ.d  reason: case insensitive filesystem */
public final class C17067d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f141249e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final C17069f f141250f;

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f141251g;

    /* renamed from: a  reason: collision with root package name */
    private final String f141252a;

    /* renamed from: b  reason: collision with root package name */
    private transient C17066c f141253b;

    /* renamed from: c  reason: collision with root package name */
    private transient C17067d f141254c;

    /* renamed from: d  reason: collision with root package name */
    private transient C17069f f141255d;

    /* renamed from: cJ.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17067d a(C17069f fVar) {
            C17542s.j(fVar, "shortName");
            String b10 = fVar.b();
            C17542s.i(b10, "asString(...)");
            return new C17067d(b10, C17066c.f141246d.i(), fVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    static {
        C17069f D10 = C17069f.D("<root>");
        C17542s.i(D10, "special(...)");
        f141250f = D10;
        Pattern compile = Pattern.compile("\\.");
        C17542s.i(compile, "compile(...)");
        f141251g = compile;
    }

    public /* synthetic */ C17067d(String str, C17067d dVar, C17069f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dVar, fVar);
    }

    private final void c() {
        int d10 = d(this.f141252a);
        if (d10 >= 0) {
            String substring = this.f141252a.substring(d10 + 1);
            C17542s.i(substring, "substring(...)");
            this.f141255d = C17069f.n(substring);
            String substring2 = this.f141252a.substring(0, d10);
            C17542s.i(substring2, "substring(...)");
            this.f141254c = new C17067d(substring2);
            return;
        }
        this.f141255d = C17069f.n(this.f141252a);
        this.f141254c = C17066c.f141246d.i();
    }

    private final int d(String str) {
        int length = str.length() - 1;
        boolean z10 = false;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt == '.' && !z10) {
                return length;
            }
            if (charAt == '`') {
                z10 = !z10;
            } else if (charAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    private static final List<C17069f> i(C17067d dVar) {
        if (dVar.e()) {
            return new ArrayList();
        }
        List<C17069f> i10 = i(dVar.g());
        i10.add(dVar.j());
        return i10;
    }

    public final String a() {
        return this.f141252a;
    }

    public final C17067d b(C17069f fVar) {
        String str;
        C17542s.j(fVar, "name");
        if (e()) {
            str = fVar.b();
        } else {
            str = this.f141252a + '.' + fVar.b();
        }
        C17542s.g(str);
        return new C17067d(str, this, fVar);
    }

    public final boolean e() {
        return this.f141252a.length() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17067d) && C17542s.e(this.f141252a, ((C17067d) obj).f141252a);
    }

    public final boolean f() {
        return this.f141253b != null || C15854t.r0(a(), '<', 0, false, 6, (Object) null) < 0;
    }

    public final C17067d g() {
        C17067d dVar = this.f141254c;
        if (dVar != null) {
            return dVar;
        }
        if (!e()) {
            c();
            C17067d dVar2 = this.f141254c;
            C17542s.g(dVar2);
            return dVar2;
        }
        throw new IllegalStateException("root");
    }

    public final List<C17069f> h() {
        return i(this);
    }

    public int hashCode() {
        return this.f141252a.hashCode();
    }

    public final C17069f j() {
        C17069f fVar = this.f141255d;
        if (fVar != null) {
            return fVar;
        }
        if (!e()) {
            c();
            C17069f fVar2 = this.f141255d;
            C17542s.g(fVar2);
            return fVar2;
        }
        throw new IllegalStateException("root");
    }

    public final C17069f k() {
        return e() ? f141250f : j();
    }

    public final boolean l(C17069f fVar) {
        C17542s.j(fVar, "segment");
        if (e()) {
            return false;
        }
        int r02 = C15854t.r0(this.f141252a, '.', 0, false, 6, (Object) null);
        if (r02 == -1) {
            r02 = this.f141252a.length();
        }
        int i10 = r02;
        String b10 = fVar.b();
        C17542s.i(b10, "asString(...)");
        return i10 == b10.length() && C15854t.L(this.f141252a, 0, b10, 0, i10, false, 16, (Object) null);
    }

    public final C17066c m() {
        C17066c cVar = this.f141253b;
        if (cVar != null) {
            return cVar;
        }
        C17066c cVar2 = new C17066c(this);
        this.f141253b = cVar2;
        return cVar2;
    }

    public String toString() {
        if (!e()) {
            return this.f141252a;
        }
        String b10 = f141250f.b();
        C17542s.i(b10, "asString(...)");
        return b10;
    }

    public C17067d(String str, C17066c cVar) {
        C17542s.j(str, "fqName");
        C17542s.j(cVar, "safe");
        this.f141252a = str;
        this.f141253b = cVar;
    }

    public C17067d(String str) {
        C17542s.j(str, "fqName");
        this.f141252a = str;
    }

    private C17067d(String str, C17067d dVar, C17069f fVar) {
        this.f141252a = str;
        this.f141254c = dVar;
        this.f141255d = fVar;
    }
}
