package qJ;

import DI.i0;
import XI.C16830c;
import ZI.C17005b;
import ZI.c;
import ZI.g;
import cJ.C17065b;
import cJ.C17066c;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qJ.N  reason: case insensitive filesystem */
public abstract class C17801N {

    /* renamed from: a  reason: collision with root package name */
    private final c f146503a;

    /* renamed from: b  reason: collision with root package name */
    private final g f146504b;

    /* renamed from: c  reason: collision with root package name */
    private final i0 f146505c;

    /* renamed from: qJ.N$a */
    public static final class a extends C17801N {

        /* renamed from: d  reason: collision with root package name */
        private final C16830c f146506d;

        /* renamed from: e  reason: collision with root package name */
        private final a f146507e;

        /* renamed from: f  reason: collision with root package name */
        private final C17065b f146508f;

        /* renamed from: g  reason: collision with root package name */
        private final C16830c.C3435c f146509g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f146510h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f146511i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C16830c cVar, c cVar2, g gVar, i0 i0Var, a aVar) {
            super(cVar2, gVar, i0Var, (DefaultConstructorMarker) null);
            C17542s.j(cVar, "classProto");
            C17542s.j(cVar2, "nameResolver");
            C17542s.j(gVar, "typeTable");
            this.f146506d = cVar;
            this.f146507e = aVar;
            this.f146508f = C17799L.a(cVar2, cVar.z0());
            C16830c.C3435c d10 = C17005b.f140816f.d(cVar.y0());
            this.f146509g = d10 == null ? C16830c.C3435c.CLASS : d10;
            Boolean f10 = C17005b.f140817g.d(cVar.y0());
            C17542s.i(f10, "get(...)");
            this.f146510h = f10.booleanValue();
            Boolean f11 = C17005b.f140818h.d(cVar.y0());
            C17542s.i(f11, "get(...)");
            this.f146511i = f11.booleanValue();
        }

        public C17066c a() {
            return this.f146508f.a();
        }

        public final C17065b e() {
            return this.f146508f;
        }

        public final C16830c f() {
            return this.f146506d;
        }

        public final C16830c.C3435c g() {
            return this.f146509g;
        }

        public final a h() {
            return this.f146507e;
        }

        public final boolean i() {
            return this.f146510h;
        }
    }

    /* renamed from: qJ.N$b */
    public static final class b extends C17801N {

        /* renamed from: d  reason: collision with root package name */
        private final C17066c f146512d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17066c cVar, c cVar2, g gVar, i0 i0Var) {
            super(cVar2, gVar, i0Var, (DefaultConstructorMarker) null);
            C17542s.j(cVar, "fqName");
            C17542s.j(cVar2, "nameResolver");
            C17542s.j(gVar, "typeTable");
            this.f146512d = cVar;
        }

        public C17066c a() {
            return this.f146512d;
        }
    }

    public /* synthetic */ C17801N(c cVar, g gVar, i0 i0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, gVar, i0Var);
    }

    public abstract C17066c a();

    public final c b() {
        return this.f146503a;
    }

    public final i0 c() {
        return this.f146505c;
    }

    public final g d() {
        return this.f146504b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    private C17801N(c cVar, g gVar, i0 i0Var) {
        this.f146503a = cVar;
        this.f146504b = gVar;
        this.f146505c = i0Var;
    }
}
