package QI;

import DI.C15558e;
import DI.i0;
import EI.C15649h;
import EJ.C15662c;
import GI.C15714H;
import PI.C16193c;
import PI.C16198h;
import PI.C16201k;
import TI.C16503g;
import TI.u;
import TI.z;
import VI.C16691w;
import VI.C16692x;
import VI.C16693y;
import WI.C16730a;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import bJ.C17046e;
import cJ.C17065b;
import cJ.C17066c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import lJ.C17557d;
import tJ.C17989i;
import tJ.C17993m;
import uI.C18064m;

/* renamed from: QI.D  reason: case insensitive filesystem */
public final class C16252D extends C15714H {

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f137405o;

    /* renamed from: g  reason: collision with root package name */
    private final u f137406g;

    /* renamed from: h  reason: collision with root package name */
    private final C16201k f137407h;

    /* renamed from: i  reason: collision with root package name */
    private final C17046e f137408i;

    /* renamed from: j  reason: collision with root package name */
    private final C17989i f137409j;

    /* renamed from: k  reason: collision with root package name */
    private final C16263f f137410k;

    /* renamed from: l  reason: collision with root package name */
    private final C17989i<List<C17066c>> f137411l;

    /* renamed from: m  reason: collision with root package name */
    private final C15649h f137412m;

    /* renamed from: n  reason: collision with root package name */
    private final C17989i f137413n;

    /* renamed from: QI.D$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f137414a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                WI.a$a[] r0 = WI.C16730a.C3422a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                WI.a$a r1 = WI.C16730a.C3422a.MULTIFILE_CLASS_PART     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                WI.a$a r1 = WI.C16730a.C3422a.FILE_FACADE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f137414a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QI.C16252D.a.<clinit>():void");
        }
    }

    static {
        Class<C16252D> cls = C16252D.class;
        f137405o = new C18064m[]{P.h(new G(cls, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0)), P.h(new G(cls, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16252D(C16201k kVar, u uVar) {
        super(kVar.d(), uVar.f());
        C17542s.j(kVar, "outerContext");
        C17542s.j(uVar, "jPackage");
        this.f137406g = uVar;
        C16201k f10 = C16193c.f(kVar, this, (z) null, 0, 6, (Object) null);
        this.f137407h = f10;
        this.f137408i = C15662c.a(kVar.a().b().f().g());
        this.f137409j = f10.e().d(new C16249A(this));
        this.f137410k = new C16263f(f10, uVar, this);
        this.f137411l = f10.e().h(new C16250B(this), C16877v.n());
        this.f137412m = f10.a().i().b() ? C15649h.f134231V.b() : C16198h.a(f10, uVar);
        this.f137413n = f10.e().d(new C16251C(this));
    }

    /* access modifiers changed from: private */
    public static final Map M0(C16252D d10) {
        ArrayList arrayList = new ArrayList();
        for (String str : d10.f137407h.a().o().a(d10.f().a())) {
            C17065b.a aVar = C17065b.f141241d;
            C17066c e10 = C17557d.d(str).e();
            C17542s.i(e10, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            C16692x b10 = C16691w.b(d10.f137407h.a().j(), aVar.c(e10), d10.f137408i);
            v a10 = b10 != null ? C16796C.a(str, b10) : null;
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return X.v(arrayList);
    }

    /* access modifiers changed from: private */
    public static final HashMap R0(C16252D d10) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : d10.O0().entrySet()) {
            C17557d d11 = C17557d.d((String) next.getKey());
            C17542s.i(d11, "byInternalName(...)");
            C16730a b10 = ((C16692x) next.getValue()).b();
            int i10 = a.f137414a[b10.c().ordinal()];
            if (i10 == 1) {
                String e10 = b10.e();
                if (e10 != null) {
                    hashMap.put(d11, C17557d.d(e10));
                }
            } else if (i10 == 2) {
                hashMap.put(d11, d11);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static final List S0(C16252D d10) {
        Iterable<u> w10 = d10.f137406g.w();
        ArrayList arrayList = new ArrayList(C16877v.y(w10, 10));
        for (u f10 : w10) {
            arrayList.add(f10.f());
        }
        return arrayList;
    }

    public final C15558e N0(C16503g gVar) {
        C17542s.j(gVar, "jClass");
        return this.f137410k.i().k0(gVar);
    }

    public final Map<String, C16692x> O0() {
        return (Map) C17993m.a(this.f137409j, this, f137405o[0]);
    }

    /* renamed from: P0 */
    public C16263f q() {
        return this.f137410k;
    }

    public final List<C17066c> Q0() {
        return (List) this.f137411l.invoke();
    }

    public C15649h getAnnotations() {
        return this.f137412m;
    }

    public i0 i() {
        return new C16693y(this);
    }

    public String toString() {
        return "Lazy Java package fragment: " + f() + " of module " + this.f137407h.a().m();
    }
}
