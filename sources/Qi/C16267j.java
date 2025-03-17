package QI;

import CI.C15497d;
import DI.C15538I;
import DI.C15558e;
import DI.C15578y;
import DI.n0;
import DI.u0;
import EI.C15646e;
import MI.C16048I;
import NI.C16097a;
import OI.C16165g;
import PI.C16201k;
import RI.C16378b;
import SI.C16420a;
import TI.C16497a;
import TI.C16498b;
import TI.C16499c;
import TI.C16501e;
import TI.C16503g;
import TI.h;
import TI.m;
import TI.o;
import TI.x;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import fJ.n;
import iJ.C17367a;
import iJ.C17373g;
import iJ.C17375i;
import iJ.C17377k;
import iJ.C17386t;
import iJ.C17388v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import tJ.C17989i;
import tJ.C17990j;
import tJ.C17993m;
import uI.C18064m;
import uJ.C18096U;
import uJ.C18100Y;
import uJ.C18113f0;
import uJ.L0;
import uJ.Q0;
import wJ.C18229k;
import wJ.C18230l;

/* renamed from: QI.j  reason: case insensitive filesystem */
public final class C16267j implements C16165g {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f137493i;

    /* renamed from: a  reason: collision with root package name */
    private final C16201k f137494a;

    /* renamed from: b  reason: collision with root package name */
    private final C16497a f137495b;

    /* renamed from: c  reason: collision with root package name */
    private final C17990j f137496c;

    /* renamed from: d  reason: collision with root package name */
    private final C17989i f137497d;

    /* renamed from: e  reason: collision with root package name */
    private final C16420a f137498e;

    /* renamed from: f  reason: collision with root package name */
    private final C17989i f137499f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f137500g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f137501h;

    static {
        Class<C16267j> cls = C16267j.class;
        f137493i = new C18064m[]{P.h(new G(cls, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), P.h(new G(cls, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), P.h(new G(cls, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    }

    public C16267j(C16201k kVar, C16497a aVar, boolean z10) {
        C17542s.j(kVar, "c");
        C17542s.j(aVar, "javaAnnotation");
        this.f137494a = kVar;
        this.f137495b = aVar;
        this.f137496c = kVar.e().a(new C16264g(this));
        this.f137497d = kVar.e().d(new C16265h(this));
        this.f137498e = kVar.a().t().a(aVar);
        this.f137499f = kVar.e().d(new C16266i(this));
        this.f137500g = aVar.d();
        this.f137501h = aVar.H() || z10;
    }

    /* access modifiers changed from: private */
    public static final Map g(C16267j jVar) {
        ArrayList arrayList = new ArrayList();
        for (C16498b bVar : jVar.f137495b.i()) {
            C17069f name = bVar.getName();
            if (name == null) {
                name = C16048I.f136291c;
            }
            C17373g<?> n10 = jVar.n(bVar);
            v<A, B> a10 = n10 != null ? C16796C.a(name, n10) : null;
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return X.v(arrayList);
    }

    private final C15558e h(C17066c cVar) {
        return C15578y.d(this.f137494a.d(), C17065b.f141241d.c(cVar), this.f137494a.a().b().f().r());
    }

    /* access modifiers changed from: private */
    public static final C17066c j(C16267j jVar) {
        C17065b k10 = jVar.f137495b.k();
        if (k10 != null) {
            return k10.a();
        }
        return null;
    }

    private final C17373g<?> n(C16498b bVar) {
        if (bVar instanceof o) {
            return C17375i.f(C17375i.f143504a, ((o) bVar).getValue(), (C15538I) null, 2, (Object) null);
        }
        if (bVar instanceof m) {
            m mVar = (m) bVar;
            return q(mVar.d(), mVar.e());
        } else if (bVar instanceof C16501e) {
            C16501e eVar = (C16501e) bVar;
            C17069f name = eVar.getName();
            if (name == null) {
                name = C16048I.f136291c;
            }
            C17542s.g(name);
            return p(name, eVar.c());
        } else if (bVar instanceof C16499c) {
            return o(((C16499c) bVar).a());
        } else {
            if (bVar instanceof h) {
                return r(((h) bVar).b());
            }
            return null;
        }
    }

    private final C17373g<?> o(C16497a aVar) {
        return new C17367a(new C16267j(this.f137494a, aVar, false, 4, (DefaultConstructorMarker) null));
    }

    private final C17373g<?> p(C17069f fVar, List<? extends C16498b> list) {
        C18096U u10;
        if (C18100Y.a(getType())) {
            return null;
        }
        C15558e l10 = C17506e.l(this);
        C17542s.g(l10);
        u0 b10 = C16097a.b(fVar, l10);
        if (b10 == null || (u10 = b10.getType()) == null) {
            u10 = this.f137494a.a().m().p().m(Q0.INVARIANT, C18230l.d(C18229k.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            C17542s.i(u10, "getArrayType(...)");
        }
        Iterable<C16498b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16498b n10 : iterable) {
            Object n11 = n(n10);
            if (n11 == null) {
                n11 = new C17388v();
            }
            arrayList.add(n11);
        }
        return C17375i.f143504a.c(arrayList, u10);
    }

    private final C17373g<?> q(C17065b bVar, C17069f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new C17377k(bVar, fVar);
    }

    private final C17373g<?> r(x xVar) {
        return C17386t.f143521b.a(this.f137494a.g().p(xVar, C16378b.b(L0.COMMON, false, false, (n0) null, 7, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final C18113f0 s(C16267j jVar) {
        C17066c f10 = jVar.f();
        if (f10 == null) {
            return C18230l.d(C18229k.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, jVar.f137495b.toString());
        }
        C15558e f11 = C15497d.f(C15497d.f133512a, f10, jVar.f137494a.d().p(), (Integer) null, 4, (Object) null);
        if (f11 == null) {
            C16503g u10 = jVar.f137495b.u();
            f11 = u10 != null ? jVar.f137494a.a().n().a(u10) : null;
            if (f11 == null) {
                f11 = jVar.h(f10);
            }
        }
        return f11.r();
    }

    public Map<C17069f, C17373g<?>> a() {
        return (Map) C17993m.a(this.f137499f, this, f137493i[2]);
    }

    public boolean d() {
        return this.f137500g;
    }

    public C17066c f() {
        return (C17066c) C17993m.b(this.f137496c, this, f137493i[0]);
    }

    /* renamed from: k */
    public C16420a i() {
        return this.f137498e;
    }

    /* renamed from: l */
    public C18113f0 getType() {
        return (C18113f0) C17993m.a(this.f137497d, this, f137493i[1]);
    }

    public final boolean m() {
        return this.f137501h;
    }

    public String toString() {
        return n.O(n.f143180h, this, (C15646e) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16267j(C16201k kVar, C16497a aVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, aVar, (i10 & 4) != 0 ? false : z10);
    }
}
