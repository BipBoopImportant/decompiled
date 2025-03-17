package sJ;

import DI.C15555b;
import DI.C15558e;
import DI.C15565l;
import DI.C15566m;
import DI.C15579z;
import DI.i0;
import EI.C15649h;
import GI.C15739i;
import XI.C16831d;
import ZI.c;
import ZI.g;
import ZI.h;
import cJ.C17069f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sJ.c  reason: case insensitive filesystem */
public final class C17926c extends C15739i implements C17925b {

    /* renamed from: F  reason: collision with root package name */
    private final C16831d f147049F;

    /* renamed from: G  reason: collision with root package name */
    private final c f147050G;

    /* renamed from: H  reason: collision with root package name */
    private final g f147051H;

    /* renamed from: I  reason: collision with root package name */
    private final h f147052I;

    /* renamed from: J  reason: collision with root package name */
    private final C17942s f147053J;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17926c(C15558e eVar, C15565l lVar, C15649h hVar, boolean z10, C15555b.a aVar, C16831d dVar, c cVar, g gVar, h hVar2, C17942s sVar, i0 i0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, lVar, hVar, z10, aVar, dVar, cVar, gVar, hVar2, sVar, (i10 & 1024) != 0 ? null : i0Var);
    }

    public boolean E() {
        return false;
    }

    public g G() {
        return this.f147051H;
    }

    public c J() {
        return this.f147050G;
    }

    public C17942s K() {
        return this.f147053J;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s1 */
    public C17926c o1(C15566m mVar, C15579z zVar, C15555b.a aVar, C17069f fVar, C15649h hVar, i0 i0Var) {
        C17542s.j(mVar, "newOwner");
        C15555b.a aVar2 = aVar;
        C17542s.j(aVar2, "kind");
        C15649h hVar2 = hVar;
        C17542s.j(hVar2, "annotations");
        i0 i0Var2 = i0Var;
        C17542s.j(i0Var2, "source");
        C17926c cVar = new C17926c((C15558e) mVar, (C15565l) zVar, hVar2, this.f134613E, aVar2, h0(), J(), G(), u1(), K(), i0Var2);
        cVar.Y0(Q0());
        return cVar;
    }

    /* renamed from: t1 */
    public C16831d h0() {
        return this.f147049F;
    }

    public h u1() {
        return this.f147052I;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17926c(C15558e eVar, C15565l lVar, C15649h hVar, boolean z10, C15555b.a aVar, C16831d dVar, c cVar, g gVar, h hVar2, C17942s sVar, i0 i0Var) {
        super(eVar, lVar, hVar, z10, aVar, i0Var == null ? i0.f133841a : i0Var);
        C16831d dVar2 = dVar;
        c cVar2 = cVar;
        g gVar2 = gVar;
        h hVar3 = hVar2;
        C15558e eVar2 = eVar;
        C17542s.j(eVar, "containingDeclaration");
        C15649h hVar4 = hVar;
        C17542s.j(hVar, "annotations");
        C17542s.j(aVar, "kind");
        C17542s.j(dVar2, "proto");
        C17542s.j(cVar2, "nameResolver");
        C17542s.j(gVar2, "typeTable");
        C17542s.j(hVar3, "versionRequirementTable");
        this.f147049F = dVar2;
        this.f147050G = cVar2;
        this.f147051H = gVar2;
        this.f147052I = hVar3;
        this.f147053J = sVar;
    }
}
