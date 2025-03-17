package sJ;

import DI.C15555b;
import DI.C15566m;
import DI.C15579z;
import DI.h0;
import DI.i0;
import EI.C15649h;
import GI.C15721O;
import GI.C15749s;
import XI.i;
import ZI.c;
import ZI.g;
import ZI.h;
import cJ.C17069f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sJ.O  reason: case insensitive filesystem */
public final class C17919O extends C15721O implements C17925b {

    /* renamed from: E  reason: collision with root package name */
    private final i f147029E;

    /* renamed from: F  reason: collision with root package name */
    private final c f147030F;

    /* renamed from: G  reason: collision with root package name */
    private final g f147031G;

    /* renamed from: H  reason: collision with root package name */
    private final h f147032H;

    /* renamed from: I  reason: collision with root package name */
    private final C17942s f147033I;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17919O(C15566m mVar, h0 h0Var, C15649h hVar, C17069f fVar, C15555b.a aVar, i iVar, c cVar, g gVar, h hVar2, C17942s sVar, i0 i0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, h0Var, hVar, fVar, aVar, iVar, cVar, gVar, hVar2, sVar, (i10 & 1024) != 0 ? null : i0Var);
    }

    public g G() {
        return this.f147031G;
    }

    public c J() {
        return this.f147030F;
    }

    public C17942s K() {
        return this.f147033I;
    }

    /* access modifiers changed from: protected */
    public C15749s L0(C15566m mVar, C15579z zVar, C15555b.a aVar, C17069f fVar, C15649h hVar, i0 i0Var) {
        C17069f fVar2;
        C15566m mVar2 = mVar;
        C17542s.j(mVar, "newOwner");
        C17542s.j(aVar, "kind");
        C17542s.j(hVar, "annotations");
        C17542s.j(i0Var, "source");
        h0 h0Var = (h0) zVar;
        if (fVar == null) {
            C17069f name = getName();
            C17542s.i(name, "getName(...)");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        C17919O o10 = new C17919O(mVar, h0Var, hVar, fVar2, aVar, h0(), J(), G(), q1(), K(), i0Var);
        o10.Y0(Q0());
        return o10;
    }

    /* renamed from: p1 */
    public i h0() {
        return this.f147029E;
    }

    public h q1() {
        return this.f147032H;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17919O(C15566m mVar, h0 h0Var, C15649h hVar, C17069f fVar, C15555b.a aVar, i iVar, c cVar, g gVar, h hVar2, C17942s sVar, i0 i0Var) {
        super(mVar, h0Var, hVar, fVar, aVar, i0Var == null ? i0.f133841a : i0Var);
        i iVar2 = iVar;
        c cVar2 = cVar;
        g gVar2 = gVar;
        h hVar3 = hVar2;
        C15566m mVar2 = mVar;
        C17542s.j(mVar, "containingDeclaration");
        C15649h hVar4 = hVar;
        C17542s.j(hVar, "annotations");
        C17542s.j(fVar, "name");
        C17542s.j(aVar, "kind");
        C17542s.j(iVar2, "proto");
        C17542s.j(cVar2, "nameResolver");
        C17542s.j(gVar2, "typeTable");
        C17542s.j(hVar3, "versionRequirementTable");
        this.f147029E = iVar2;
        this.f147030F = cVar2;
        this.f147031G = gVar2;
        this.f147032H = hVar3;
        this.f147033I = sVar;
    }
}
