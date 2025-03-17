package cJ;

import HJ.C15854t;
import com.optimizely.ab.config.FeatureVariable;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: cJ.b  reason: case insensitive filesystem */
public final class C17065b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f141241d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17066c f141242a;

    /* renamed from: b  reason: collision with root package name */
    private final C17066c f141243b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f141244c;

    /* renamed from: cJ.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C17065b b(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(str, z10);
        }

        public final C17065b a(String str, boolean z10) {
            String str2;
            String str3;
            C17542s.j(str, FeatureVariable.STRING_TYPE);
            int r02 = C15854t.r0(str, '`', 0, false, 6, (Object) null);
            if (r02 == -1) {
                r02 = str.length();
            }
            int z02 = C15854t.z0(str, "/", r02, false, 4, (Object) null);
            if (z02 == -1) {
                str2 = C15854t.Q(str, "`", "", false, 4, (Object) null);
                str3 = "";
            } else {
                String substring = str.substring(0, z02);
                C17542s.i(substring, "substring(...)");
                String P10 = C15854t.P(substring, '/', '.', false, 4, (Object) null);
                String substring2 = str.substring(z02 + 1);
                C17542s.i(substring2, "substring(...)");
                str2 = C15854t.Q(substring2, "`", "", false, 4, (Object) null);
                str3 = P10;
            }
            return new C17065b(new C17066c(str3), new C17066c(str2), z10);
        }

        public final C17065b c(C17066c cVar) {
            C17542s.j(cVar, "topLevelFqName");
            return new C17065b(cVar.d(), cVar.f());
        }

        private a() {
        }
    }

    public C17065b(C17066c cVar, C17066c cVar2, boolean z10) {
        C17542s.j(cVar, "packageFqName");
        C17542s.j(cVar2, "relativeClassName");
        this.f141242a = cVar;
        this.f141243b = cVar2;
        this.f141244c = z10;
        cVar2.c();
    }

    private static final String c(C17066c cVar) {
        String a10 = cVar.a();
        if (!C15854t.c0(a10, '/', false, 2, (Object) null)) {
            return a10;
        }
        return '`' + a10 + '`';
    }

    public static final C17065b k(C17066c cVar) {
        return f141241d.c(cVar);
    }

    public final C17066c a() {
        if (this.f141242a.c()) {
            return this.f141243b;
        }
        return new C17066c(this.f141242a.a() + '.' + this.f141243b.a());
    }

    public final String b() {
        if (this.f141242a.c()) {
            return c(this.f141243b);
        }
        return C15854t.P(this.f141242a.a(), '.', '/', false, 4, (Object) null) + "/" + c(this.f141243b);
    }

    public final C17065b d(C17069f fVar) {
        C17542s.j(fVar, "name");
        return new C17065b(this.f141242a, this.f141243b.b(fVar), this.f141244c);
    }

    public final C17065b e() {
        C17066c d10 = this.f141243b.d();
        if (!d10.c()) {
            return new C17065b(this.f141242a, d10, this.f141244c);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17065b)) {
            return false;
        }
        C17065b bVar = (C17065b) obj;
        return C17542s.e(this.f141242a, bVar.f141242a) && C17542s.e(this.f141243b, bVar.f141243b) && this.f141244c == bVar.f141244c;
    }

    public final C17066c f() {
        return this.f141242a;
    }

    public final C17066c g() {
        return this.f141243b;
    }

    public final C17069f h() {
        return this.f141243b.f();
    }

    public int hashCode() {
        return (((this.f141242a.hashCode() * 31) + this.f141243b.hashCode()) * 31) + Boolean.hashCode(this.f141244c);
    }

    public final boolean i() {
        return this.f141244c;
    }

    public final boolean j() {
        return !this.f141243b.d().c();
    }

    public String toString() {
        if (!this.f141242a.c()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17065b(C17066c cVar, C17069f fVar) {
        this(cVar, C17066c.f141245c.a(fVar), false);
        C17542s.j(cVar, "packageFqName");
        C17542s.j(fVar, "topLevelName");
    }
}
