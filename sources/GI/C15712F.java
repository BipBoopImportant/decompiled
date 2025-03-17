package GI;

import AI.C15429j;
import DI.C15532C;
import DI.C15537H;
import DI.C15538I;
import DI.C15545P;
import DI.C15551W;
import DI.C15566m;
import DI.C15568o;
import EI.C15649h;
import GI.C15715I;
import XH.C16824o;
import XH.C16825p;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import YH.g0;
import cJ.C17066c;
import cJ.C17069f;
import dJ.C17171a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tJ.C17987g;
import tJ.C17994n;

/* renamed from: GI.F  reason: case insensitive filesystem */
public final class C15712F extends C15743m implements C15538I {

    /* renamed from: c  reason: collision with root package name */
    private final C17994n f134484c;

    /* renamed from: d  reason: collision with root package name */
    private final C15429j f134485d;

    /* renamed from: e  reason: collision with root package name */
    private final C17069f f134486e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<C15537H<?>, Object> f134487f;

    /* renamed from: g  reason: collision with root package name */
    private final C15715I f134488g;

    /* renamed from: h  reason: collision with root package name */
    private C15708B f134489h;

    /* renamed from: i  reason: collision with root package name */
    private C15545P f134490i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f134491j;

    /* renamed from: k  reason: collision with root package name */
    private final C17987g<C17066c, C15551W> f134492k;

    /* renamed from: l  reason: collision with root package name */
    private final C16824o f134493l;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15712F(C17069f fVar, C17994n nVar, C15429j jVar, C17171a aVar) {
        this(fVar, nVar, jVar, aVar, (Map) null, (C17069f) null, 48, (DefaultConstructorMarker) null);
        C17542s.j(fVar, "moduleName");
        C17542s.j(nVar, "storageManager");
        C17542s.j(jVar, "builtIns");
    }

    private final String L0() {
        String fVar = getName().toString();
        C17542s.i(fVar, "toString(...)");
        return fVar;
    }

    private final C15742l N0() {
        return (C15742l) this.f134493l.getValue();
    }

    private final boolean P0() {
        return this.f134490i != null;
    }

    /* access modifiers changed from: private */
    public static final C15742l R0(C15712F f10) {
        C15708B b10 = f10.f134489h;
        if (b10 != null) {
            List<C15712F> a10 = b10.a();
            f10.K0();
            a10.contains(f10);
            Iterable<C15712F> iterable = a10;
            for (C15712F P02 : iterable) {
                P02.P0();
            }
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C15712F f11 : iterable) {
                C15545P p10 = f11.f134490i;
                C17542s.g(p10);
                arrayList.add(p10);
            }
            return new C15742l(arrayList, "CompositeProvider@ModuleDescriptor for " + f10.getName());
        }
        throw new AssertionError("Dependencies of module " + f10.L0() + " were not set before querying module content");
    }

    /* access modifiers changed from: private */
    public static final C15551W S0(C15712F f10, C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return f10.f134488g.a(f10, cVar, f10.f134484c);
    }

    public List<C15538I> A0() {
        C15708B b10 = this.f134489h;
        if (b10 != null) {
            return b10.b();
        }
        throw new AssertionError("Dependencies of module " + L0() + " were not set");
    }

    public void K0() {
        if (!Q0()) {
            C15532C.a(this);
        }
    }

    public final C15545P M0() {
        K0();
        return N0();
    }

    public final void O0(C15545P p10) {
        C17542s.j(p10, "providerForModuleContent");
        P0();
        this.f134490i = p10;
    }

    public boolean Q0() {
        return this.f134491j;
    }

    public final void T0(C15708B b10) {
        C17542s.j(b10, "dependencies");
        this.f134489h = b10;
    }

    public final void U0(List<C15712F> list) {
        C17542s.j(list, "descriptors");
        V0(list, g0.d());
    }

    public final void V0(List<C15712F> list, Set<C15712F> set) {
        C17542s.j(list, "descriptors");
        C17542s.j(set, "friends");
        T0(new C15709C(list, set, C16877v.n(), g0.d()));
    }

    public final void W0(C15712F... fArr) {
        C17542s.j(fArr, "descriptors");
        U0(C16870n.c1(fArr));
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return C15538I.a.a(this, oVar, d10);
    }

    public C15566m b() {
        return C15538I.a.b(this);
    }

    public <T> T l0(C15537H<T> h10) {
        C17542s.j(h10, "capability");
        T t10 = this.f134487f.get(h10);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    public C15429j p() {
        return this.f134485d;
    }

    public Collection<C17066c> s(C17066c cVar, C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(cVar, "fqName");
        C17542s.j(lVar, "nameFilter");
        K0();
        return M0().s(cVar, lVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!Q0()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        C15545P p10 = this.f134490i;
        sb2.append(p10 != null ? p10.getClass().getSimpleName() : null);
        return sb2.toString();
    }

    public C15551W v0(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        K0();
        return this.f134492k.invoke(cVar);
    }

    public boolean z(C15538I i10) {
        C17542s.j(i10, "targetModule");
        if (C17542s.e(this, i10)) {
            return true;
        }
        C15708B b10 = this.f134489h;
        C17542s.g(b10);
        return C16877v.l0(b10.c(), i10) || A0().contains(i10) || i10.A0().contains(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15712F(C17069f fVar, C17994n nVar, C15429j jVar, C17171a aVar, Map map, C17069f fVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, nVar, jVar, (i10 & 8) != 0 ? null : aVar, (i10 & 16) != 0 ? X.j() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15712F(C17069f fVar, C17994n nVar, C15429j jVar, C17171a aVar, Map<C15537H<?>, ? extends Object> map, C17069f fVar2) {
        super(C15649h.f134231V.b(), fVar);
        C17542s.j(fVar, "moduleName");
        C17542s.j(nVar, "storageManager");
        C17542s.j(jVar, "builtIns");
        C17542s.j(map, "capabilities");
        this.f134484c = nVar;
        this.f134485d = jVar;
        this.f134486e = fVar2;
        if (fVar.B()) {
            this.f134487f = map;
            C15715I i10 = (C15715I) l0(C15715I.f134504a.a());
            this.f134488g = i10 == null ? C15715I.b.f134507b : i10;
            this.f134491j = true;
            this.f134492k = nVar.g(new C15710D(this));
            this.f134493l = C16825p.b(new C15711E(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + fVar);
    }
}
