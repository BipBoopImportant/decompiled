package VI;

import AI.C15434o;
import DI.C15538I;
import DI.C15543N;
import DI.l0;
import LI.C16016c;
import MI.C16040A;
import MI.C16043D;
import MI.C16060d;
import MI.C16076u;
import MI.C16077v;
import NI.C16105i;
import NI.j;
import NI.o;
import PI.C16194d;
import PI.C16195e;
import PI.C16200j;
import PI.C16204n;
import SI.C16421b;
import TI.C16497a;
import UI.C16586g;
import UI.m0;
import VI.C16662D;
import YH.C16877v;
import bJ.C17046e;
import cJ.C17065b;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lJ.C17559f;
import mJ.C17607b;
import qJ.C17825m;
import qJ.C17827o;
import qJ.C17835w;
import tJ.C17994n;
import uJ.C18144y;
import vJ.p;
import vJ.q;
import xJ.C18674a;

/* renamed from: VI.l  reason: case insensitive filesystem */
public final class C16680l {

    /* renamed from: VI.l$a */
    public static final class a implements C16040A {
        a() {
        }

        public List<C16497a> a(C17065b bVar) {
            C17542s.j(bVar, "classId");
            return null;
        }
    }

    public static final C16679k a(C15538I i10, C17994n nVar, C15543N n10, C16200j jVar, C16690v vVar, C16682n nVar2, C17835w wVar, C17046e eVar) {
        C17994n nVar3 = nVar;
        C15543N n11 = n10;
        C16690v vVar2 = vVar;
        C16682n nVar4 = nVar2;
        C17046e eVar2 = eVar;
        C17542s.j(i10, "module");
        C17542s.j(nVar3, "storageManager");
        C17542s.j(n11, "notFoundClasses");
        C16200j jVar2 = jVar;
        C17542s.j(jVar2, "lazyJavaPackageFragmentProvider");
        C17542s.j(vVar2, "reflectKotlinClassFinder");
        C17542s.j(nVar4, "deserializedDescriptorResolver");
        C17835w wVar2 = wVar;
        C17542s.j(wVar2, "errorReporter");
        C17542s.j(eVar2, "jvmMetadataVersion");
        C16683o oVar = new C16683o(vVar2, nVar4);
        C16676h a10 = C16677i.a(i10, n11, nVar3, vVar2, eVar2);
        return new C16679k(nVar3, i10, C17827o.a.f146589a, oVar, a10, jVar2, n11, wVar2, C16016c.a.f136089a, C17825m.f146565a.a(), p.f149068b.a(), new C18674a(C16877v.e(C18144y.f147952a)));
    }

    public static final C16200j b(C16076u uVar, C15538I i10, C17994n nVar, C15543N n10, C16690v vVar, C16682n nVar2, C17835w wVar, C16421b bVar, C16204n nVar3, C16662D d10) {
        C17994n nVar4 = nVar;
        C17542s.j(uVar, "javaClassFinder");
        C17542s.j(i10, "module");
        C17542s.j(nVar4, "storageManager");
        C17542s.j(n10, "notFoundClasses");
        C17542s.j(vVar, "reflectKotlinClassFinder");
        C17542s.j(nVar2, "deserializedDescriptorResolver");
        C17542s.j(wVar, "errorReporter");
        C17542s.j(bVar, "javaSourceElementFactory");
        C17542s.j(nVar3, "singleModuleClassResolver");
        C17542s.j(d10, "packagePartProvider");
        o oVar = o.f136570a;
        o oVar2 = oVar;
        C17542s.i(oVar, "DO_NOTHING");
        j jVar = j.f136563a;
        j jVar2 = jVar;
        C17542s.i(jVar, "EMPTY");
        C16105i.a aVar = C16105i.a.f136562a;
        C16194d dVar = r0;
        C17607b bVar2 = r14;
        C17607b bVar3 = new C17607b(nVar4, C16877v.n());
        l0.a aVar2 = l0.a.f133844a;
        C16016c.a aVar3 = C16016c.a.f136089a;
        C16076u uVar2 = uVar;
        C15434o oVar3 = r2;
        C15434o oVar4 = new C15434o(i10, n10);
        C16060d dVar2 = r0;
        C16043D.b bVar4 = C16043D.f136271d;
        C16060d dVar3 = new C16060d(bVar4.a());
        m0 m0Var = r0;
        C16195e.a aVar4 = C16195e.a.f137178a;
        C16195e.a aVar5 = aVar4;
        m0 m0Var2 = new m0(new C16586g(aVar4));
        C16077v.a aVar6 = C16077v.a.f136393a;
        q a10 = p.f149068b.a();
        C16043D a11 = bVar4.a();
        a aVar7 = r0;
        a aVar8 = new a();
        C17994n nVar5 = nVar;
        C16076u uVar3 = uVar2;
        C16690v vVar2 = vVar;
        C16194d dVar4 = new C16194d(nVar5, uVar3, vVar2, nVar2, oVar2, wVar, jVar2, aVar, bVar2, bVar, nVar3, d10, aVar2, aVar3, i10, oVar3, dVar2, m0Var, aVar6, aVar5, a10, a11, aVar7, (C17559f) null, 8388608, (DefaultConstructorMarker) null);
        return new C16200j(dVar);
    }

    public static /* synthetic */ C16200j c(C16076u uVar, C15538I i10, C17994n nVar, C15543N n10, C16690v vVar, C16682n nVar2, C17835w wVar, C16421b bVar, C16204n nVar3, C16662D d10, int i11, Object obj) {
        return b(uVar, i10, nVar, n10, vVar, nVar2, wVar, bVar, nVar3, (i11 & 512) != 0 ? C16662D.a.f139316a : d10);
    }
}
