package VI;

import AI.C15429j;
import CI.C15504k;
import CI.C15516w;
import DI.C15538I;
import DI.C15543N;
import FI.C15685a;
import FI.C15687c;
import GI.C15712F;
import GI.C15742l;
import LI.C16016c;
import MI.C16076u;
import NI.j;
import PI.C16200j;
import PI.C16205o;
import SI.C16421b;
import YH.C16877v;
import bJ.C17046e;
import bJ.C17050i;
import cJ.C17069f;
import dJ.C17171a;
import eJ.C17196g;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lJ.C17556c;
import mJ.C17607b;
import qJ.C17789B;
import qJ.C17825m;
import qJ.C17826n;
import qJ.C17827o;
import qJ.C17835w;
import qJ.C17838z;
import tJ.C17986f;
import tJ.C17994n;
import vJ.p;
import xJ.C18674a;

/* renamed from: VI.k  reason: case insensitive filesystem */
public final class C16679k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f139386b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17826n f139387a;

    /* renamed from: VI.k$a */
    public static final class a {

        /* renamed from: VI.k$a$a  reason: collision with other inner class name */
        public static final class C3416a {

            /* renamed from: a  reason: collision with root package name */
            private final C16679k f139388a;

            /* renamed from: b  reason: collision with root package name */
            private final C16682n f139389b;

            public C3416a(C16679k kVar, C16682n nVar) {
                C17542s.j(kVar, "deserializationComponentsForJava");
                C17542s.j(nVar, "deserializedDescriptorResolver");
                this.f139388a = kVar;
                this.f139389b = nVar;
            }

            public final C16679k a() {
                return this.f139388a;
            }

            public final C16682n b() {
                return this.f139389b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3416a a(C16690v vVar, C16690v vVar2, C16076u uVar, String str, C17835w wVar, C16421b bVar) {
            String str2 = str;
            C17542s.j(vVar, "kotlinClassFinder");
            C17542s.j(vVar2, "jvmBuiltInsKotlinClassFinder");
            C16076u uVar2 = uVar;
            C17542s.j(uVar2, "javaClassFinder");
            C17542s.j(str2, "moduleName");
            C17542s.j(wVar, "errorReporter");
            C16421b bVar2 = bVar;
            C17542s.j(bVar2, "javaSourceElementFactory");
            C17986f fVar = new C17986f("DeserializationComponentsForJava.ModuleData");
            C15504k kVar = new C15504k(fVar, C15504k.a.FROM_DEPENDENCIES);
            C17069f D10 = C17069f.D('<' + str2 + '>');
            C17542s.i(D10, "special(...)");
            C15712F f10 = new C15712F(D10, fVar, kVar, (C17171a) null, (Map) null, (C17069f) null, 56, (DefaultConstructorMarker) null);
            kVar.F0(f10);
            kVar.N0(f10, true);
            C16682n nVar = new C16682n();
            C16205o oVar = new C16205o();
            C15543N n10 = new C15543N(fVar, f10);
            C16690v vVar3 = vVar;
            C15543N n11 = n10;
            C16205o oVar2 = oVar;
            C17835w wVar2 = wVar;
            C16682n nVar2 = nVar;
            C15712F f11 = f10;
            C15504k kVar2 = kVar;
            C16200j c10 = C16680l.c(uVar2, f10, fVar, n10, vVar3, nVar, wVar2, bVar2, oVar2, (C16662D) null, 512, (Object) null);
            C16679k a10 = C16680l.a(f11, fVar, n11, c10, vVar3, nVar2, wVar2, C17046e.f141178i);
            C16682n nVar3 = nVar2;
            nVar3.o(a10);
            j jVar = j.f136563a;
            C17542s.i(jVar, "EMPTY");
            C17556c cVar = new C17556c(c10, jVar);
            oVar2.c(cVar);
            C15516w wVar3 = new C15516w(fVar, vVar2, f11, n11, kVar2.M0(), kVar2.M0(), C17827o.a.f146589a, p.f149068b.a(), new C17607b(fVar, C16877v.n()));
            C15712F f12 = f11;
            f12.W0(f11);
            List q10 = C16877v.q(cVar.a(), wVar3);
            f12.O0(new C15742l(q10, "CompositeProvider@RuntimeModuleData for " + f12));
            return new C3416a(a10, nVar3);
        }

        private a() {
        }
    }

    public C16679k(C17994n nVar, C15538I i10, C17827o oVar, C16683o oVar2, C16676h hVar, C16200j jVar, C15543N n10, C17835w wVar, C16016c cVar, C17825m mVar, p pVar, C18674a aVar) {
        C15685a aVar2;
        C15687c cVar2;
        C17994n nVar2 = nVar;
        C17542s.j(nVar2, "storageManager");
        C17542s.j(i10, "moduleDescriptor");
        C17542s.j(oVar, "configuration");
        C17542s.j(oVar2, "classDataFinder");
        C17542s.j(hVar, "annotationAndConstantLoader");
        C17542s.j(jVar, "packageFragmentProvider");
        C17542s.j(n10, "notFoundClasses");
        C17542s.j(wVar, "errorReporter");
        C17542s.j(cVar, "lookupTracker");
        C17542s.j(mVar, "contractDeserializer");
        C17542s.j(pVar, "kotlinTypeChecker");
        C17542s.j(aVar, "typeAttributeTranslators");
        C15429j p10 = i10.p();
        C15504k kVar = p10 instanceof C15504k ? (C15504k) p10 : null;
        C17789B.a aVar3 = C17789B.a.f146469a;
        C16684p pVar2 = C16684p.f139400a;
        Iterable n11 = C16877v.n();
        C15685a aVar4 = (kVar == null || (aVar2 = kVar.M0()) == null) ? C15685a.C3308a.f134401a : aVar2;
        C15687c cVar3 = (kVar == null || (cVar2 = kVar.M0()) == null) ? C15687c.b.f134403a : cVar2;
        C17196g a10 = C17050i.f141191a.a();
        C17607b bVar = r0;
        C17607b bVar2 = new C17607b(nVar2, C16877v.n());
        C17826n nVar3 = r0;
        C17826n nVar4 = new C17826n(nVar, i10, oVar, oVar2, hVar, jVar, aVar3, wVar, cVar, pVar2, n11, n10, mVar, aVar4, cVar3, a10, pVar, bVar, aVar.a(), C17838z.f146618a);
        this.f139387a = nVar3;
    }

    public final C17826n a() {
        return this.f139387a;
    }
}
