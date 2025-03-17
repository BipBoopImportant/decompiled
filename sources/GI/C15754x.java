package GI;

import DI.C15544O;
import DI.C15549U;
import DI.C15551W;
import DI.C15568o;
import EI.C15649h;
import YH.C16877v;
import cJ.C17066c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nJ.C17647b;
import nJ.C17654i;
import nJ.C17656k;
import tJ.C17989i;
import tJ.C17993m;
import tJ.C17994n;
import uI.C18064m;

/* renamed from: GI.x  reason: case insensitive filesystem */
public class C15754x extends C15743m implements C15551W {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f134703h;

    /* renamed from: c  reason: collision with root package name */
    private final C15712F f134704c;

    /* renamed from: d  reason: collision with root package name */
    private final C17066c f134705d;

    /* renamed from: e  reason: collision with root package name */
    private final C17989i f134706e;

    /* renamed from: f  reason: collision with root package name */
    private final C17989i f134707f;

    /* renamed from: g  reason: collision with root package name */
    private final C17656k f134708g;

    static {
        Class<C15754x> cls = C15754x.class;
        f134703h = new C18064m[]{P.h(new G(cls, "fragments", "getFragments()Ljava/util/List;", 0)), P.h(new G(cls, "empty", "getEmpty()Z", 0))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15754x(C15712F f10, C17066c cVar, C17994n nVar) {
        super(C15649h.f134231V.b(), cVar.g());
        C17542s.j(f10, "module");
        C17542s.j(cVar, "fqName");
        C17542s.j(nVar, "storageManager");
        this.f134704c = f10;
        this.f134705d = cVar;
        this.f134706e = nVar.d(new C15751u(this));
        this.f134707f = nVar.d(new C15752v(this));
        this.f134708g = new C17654i(nVar, new C15753w(this));
    }

    /* access modifiers changed from: private */
    public static final boolean L0(C15754x xVar) {
        return C15549U.b(xVar.C0().M0(), xVar.f());
    }

    /* access modifiers changed from: private */
    public static final List M0(C15754x xVar) {
        return C15549U.c(xVar.C0().M0(), xVar.f());
    }

    /* access modifiers changed from: private */
    public static final C17656k Q0(C15754x xVar) {
        if (xVar.isEmpty()) {
            return C17656k.b.f144864b;
        }
        Iterable<C15544O> k02 = xVar.k0();
        ArrayList arrayList = new ArrayList(C16877v.y(k02, 10));
        for (C15544O q10 : k02) {
            arrayList.add(q10.q());
        }
        List W02 = C16877v.W0(arrayList, new C15722P(xVar.C0(), xVar.f()));
        C17647b.a aVar = C17647b.f144817d;
        return aVar.a("package view scope for " + xVar.f() + " in " + xVar.C0().getName(), W02);
    }

    /* renamed from: N0 */
    public C15551W b() {
        if (f().c()) {
            return null;
        }
        return C0().v0(f().d());
    }

    /* access modifiers changed from: protected */
    public final boolean O0() {
        return ((Boolean) C17993m.a(this.f134707f, this, f134703h[1])).booleanValue();
    }

    /* renamed from: P0 */
    public C15712F C0() {
        return this.f134704c;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        C17542s.j(oVar, "visitor");
        return oVar.f(this, d10);
    }

    public boolean equals(Object obj) {
        C15551W w10 = obj instanceof C15551W ? (C15551W) obj : null;
        return w10 != null && C17542s.e(f(), w10.f()) && C17542s.e(C0(), w10.C0());
    }

    public C17066c f() {
        return this.f134705d;
    }

    public int hashCode() {
        return (C0().hashCode() * 31) + f().hashCode();
    }

    public boolean isEmpty() {
        return O0();
    }

    public List<C15544O> k0() {
        return (List) C17993m.a(this.f134706e, this, f134703h[0]);
    }

    public C17656k q() {
        return this.f134708g;
    }
}
