package sJ;

import DI.C15535F;
import DI.C15555b;
import DI.C15566m;
import DI.C15574u;
import DI.a0;
import DI.i0;
import GI.C15717K;
import XI.n;
import ZI.C17005b;
import ZI.c;
import ZI.g;
import ZI.h;
import cJ.C17069f;
import kotlin.jvm.internal.C17542s;

/* renamed from: sJ.N  reason: case insensitive filesystem */
public final class C17918N extends C15717K implements C17925b {

    /* renamed from: C  reason: collision with root package name */
    private final n f147024C;

    /* renamed from: D  reason: collision with root package name */
    private final c f147025D;

    /* renamed from: E  reason: collision with root package name */
    private final g f147026E;

    /* renamed from: F  reason: collision with root package name */
    private final h f147027F;

    /* renamed from: G  reason: collision with root package name */
    private final C17942s f147028G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17918N(DI.C15566m r18, DI.a0 r19, EI.C15649h r20, DI.C15535F r21, DI.C15574u r22, boolean r23, cJ.C17069f r24, DI.C15555b.a r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, XI.n r31, ZI.c r32, ZI.g r33, ZI.h r34, sJ.C17942s r35) {
        /*
            r17 = this;
            r15 = r31
            r14 = r32
            r13 = r33
            r12 = r34
            java.lang.String r0 = "containingDeclaration"
            r1 = r18
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "annotations"
            r3 = r20
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "modality"
            r4 = r21
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "visibility"
            r5 = r22
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "name"
            r7 = r24
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "kind"
            r8 = r25
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            DI.i0 r9 = DI.i0.f133841a
            r16 = 0
            r0 = r17
            r2 = r19
            r6 = r23
            r10 = r26
            r11 = r27
            r12 = r30
            r13 = r16
            r14 = r28
            r15 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r31
            r0.f147024C = r1
            r1 = r32
            r0.f147025D = r1
            r1 = r33
            r0.f147026E = r1
            r1 = r34
            r0.f147027F = r1
            r1 = r35
            r0.f147028G = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sJ.C17918N.<init>(DI.m, DI.a0, EI.h, DI.F, DI.u, boolean, cJ.f, DI.b$a, boolean, boolean, boolean, boolean, boolean, XI.n, ZI.c, ZI.g, ZI.h, sJ.s):void");
    }

    public g G() {
        return this.f147026E;
    }

    public c J() {
        return this.f147025D;
    }

    public C17942s K() {
        return this.f147028G;
    }

    /* access modifiers changed from: protected */
    public C15717K P0(C15566m mVar, C15535F f10, C15574u uVar, a0 a0Var, C15555b.a aVar, C17069f fVar, i0 i0Var) {
        a0 a0Var2 = a0Var;
        C17069f fVar2 = fVar;
        C17542s.j(mVar, "newOwner");
        C17542s.j(f10, "newModality");
        C17542s.j(uVar, "newVisibility");
        C17542s.j(aVar, "kind");
        C17542s.j(fVar, "newName");
        C17542s.j(i0Var, "source");
        return new C17918N(mVar, a0Var2, getAnnotations(), f10, uVar, N(), fVar2, aVar, z0(), c0(), isExternal(), D(), m0(), h0(), J(), G(), g1(), K());
    }

    /* renamed from: f1 */
    public n h0() {
        return this.f147024C;
    }

    public h g1() {
        return this.f147027F;
    }

    public boolean isExternal() {
        Boolean f10 = C17005b.f140799E.d(h0().V());
        C17542s.i(f10, "get(...)");
        return f10.booleanValue();
    }
}
