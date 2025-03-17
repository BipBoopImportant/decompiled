package CI;

import AI.C15422c;
import AI.C15435p;
import DI.C15535F;
import DI.C15538I;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15566m;
import DI.i0;
import FI.C15686b;
import GI.C15741k;
import YH.C16877v;
import YH.g0;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17067d;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17642l;
import tJ.C17989i;
import tJ.C17993m;
import tJ.C17994n;
import uI.C18064m;

/* renamed from: CI.g  reason: case insensitive filesystem */
public final class C15500g implements C15686b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f133516d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f133517e = {P.h(new G(C15500g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* renamed from: f  reason: collision with root package name */
    private static final C17066c f133518f = C15435p.f133015A;

    /* renamed from: g  reason: collision with root package name */
    private static final C17069f f133519g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C17065b f133520h;

    /* renamed from: a  reason: collision with root package name */
    private final C15538I f133521a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<C15538I, C15566m> f133522b;

    /* renamed from: c  reason: collision with root package name */
    private final C17989i f133523c;

    /* renamed from: CI.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17065b a() {
            return C15500g.f133520h;
        }

        private a() {
        }
    }

    static {
        C17067d dVar = C15435p.a.f133096d;
        f133519g = dVar.j();
        f133520h = C17065b.f141241d.c(dVar.m());
    }

    public C15500g(C17994n nVar, C15538I i10, C17642l<? super C15538I, ? extends C15566m> lVar) {
        C17542s.j(nVar, "storageManager");
        C17542s.j(i10, "moduleDescriptor");
        C17542s.j(lVar, "computeContainingDeclaration");
        this.f133521a = i10;
        this.f133522b = lVar;
        this.f133523c = nVar.d(new C15498e(this, nVar));
    }

    /* access modifiers changed from: private */
    public static final C15422c d(C15538I i10) {
        C17542s.j(i10, "module");
        ArrayList arrayList = new ArrayList();
        for (Object next : i10.v0(f133518f).k0()) {
            if (next instanceof C15422c) {
                arrayList.add(next);
            }
        }
        return (C15422c) C16877v.w0(arrayList);
    }

    /* access modifiers changed from: private */
    public static final C15741k h(C15500g gVar, C17994n nVar) {
        C15741k kVar = new C15741k(gVar.f133522b.invoke(gVar.f133521a), f133519g, C15535F.ABSTRACT, C15559f.INTERFACE, C16877v.e(gVar.f133521a.p().i()), i0.f133841a, false, nVar);
        kVar.K0(new C15494a(nVar, kVar), g0.d(), (C15557d) null);
        return kVar;
    }

    private final C15741k i() {
        return (C15741k) C17993m.a(this.f133523c, this, f133517e[0]);
    }

    public boolean a(C17066c cVar, C17069f fVar) {
        C17542s.j(cVar, "packageFqName");
        C17542s.j(fVar, "name");
        return C17542s.e(fVar, f133519g) && C17542s.e(cVar, f133518f);
    }

    public C15558e b(C17065b bVar) {
        C17542s.j(bVar, "classId");
        if (C17542s.e(bVar, f133520h)) {
            return i();
        }
        return null;
    }

    public Collection<C15558e> c(C17066c cVar) {
        C17542s.j(cVar, "packageFqName");
        return C17542s.e(cVar, f133518f) ? g0.c(i()) : g0.d();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15500g(C17994n nVar, C15538I i10, C17642l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, i10, (i11 & 4) != 0 ? C15499f.f133515a : lVar);
    }
}
