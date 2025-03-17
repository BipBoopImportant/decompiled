package Kv;

import U0.C4889m;
import U0.C4895p;
import androidx.compose.ui.platform.C5100f0;
import c2.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5523B;
import m0.C5546i;
import m0.C5548j;
import m0.C5559o0;
import m0.C5570z;
import nI.C17631a;
import nI.C17642l;
import p0.C5685c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001aS\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\" \u0010\u0019\u001a\u00020\u00108\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"LKv/x;", "g", "(LU0/m;I)LKv/x;", "Lm0/i;", "", "snapAnimationSpec", "Lm0/z;", "decayAnimationSpec", "Lkotlin/Function1;", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lp0/c;", "LKv/d;", "e", "(Lm0/i;Lm0/z;LnI/l;LnI/a;LU0/m;I)Lp0/c;", "Lc2/h;", "a", "F", "VelocityThreshold", "b", "d", "()F", "getContentBackgroundRadius$annotations", "()V", "ContentBackgroundRadius", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class B {

    /* renamed from: a  reason: collision with root package name */
    private static final float f37952a = h.B((float) 125);

    /* renamed from: b  reason: collision with root package name */
    private static final float f37953b = h.B((float) 20);

    public static final float d() {
        return f37953b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final p0.C5685c<Kv.d> e(m0.C5546i<java.lang.Float> r10, m0.C5570z<java.lang.Float> r11, nI.C17642l<? super java.lang.Float, java.lang.Float> r12, nI.C17631a<java.lang.Float> r13, U0.C4889m r14, int r15) {
        /*
            r0 = 1195820344(0x4746c538, float:50885.22)
            r14.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.membership.impl.compose.member.scaffold.rememberAnchoredDraggableState (MembershipState.kt:72)"
            U0.C4895p.S(r0, r15, r1, r2)
        L_0x0012:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            p0.c$b r2 = p0.C5685c.f26943p
            r8 = 16
            r9 = 0
            r7 = 0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            f1.k r2 = p0.C5685c.b.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = 1108894013(0x4218613d, float:38.09496)
            r14.W(r3)
            r3 = r15 & 896(0x380, float:1.256E-42)
            r3 = r3 ^ 384(0x180, float:5.38E-43)
            r4 = 1
            r5 = 256(0x100, float:3.59E-43)
            if (r3 <= r5) goto L_0x0038
            boolean r3 = r14.V(r12)
            if (r3 != 0) goto L_0x003c
        L_0x0038:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != r5) goto L_0x003e
        L_0x003c:
            r3 = r4
            goto L_0x003f
        L_0x003e:
            r3 = r0
        L_0x003f:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 ^ 3072(0xc00, float:4.305E-42)
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 <= r6) goto L_0x004d
            boolean r5 = r14.V(r13)
            if (r5 != 0) goto L_0x0051
        L_0x004d:
            r15 = r15 & 3072(0xc00, float:4.305E-42)
            if (r15 != r6) goto L_0x0052
        L_0x0051:
            r0 = r4
        L_0x0052:
            r15 = r3 | r0
            boolean r0 = r14.F(r10)
            r15 = r15 | r0
            boolean r0 = r14.F(r11)
            r15 = r15 | r0
            java.lang.Object r0 = r14.D()
            if (r15 != 0) goto L_0x006c
            U0.m$a r15 = U0.C4889m.f14007a
            java.lang.Object r15 = r15.a()
            if (r0 != r15) goto L_0x0074
        L_0x006c:
            Kv.A r0 = new Kv.A
            r0.<init>(r12, r13, r10, r11)
            r14.u(r0)
        L_0x0074:
            r4 = r0
            nI.a r4 = (nI.C17631a) r4
            r14.P()
            r6 = 0
            r7 = 4
            r3 = 0
            r5 = r14
            java.lang.Object r10 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            p0.c r10 = (p0.C5685c) r10
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x008d
            U0.C4895p.R()
        L_0x008d:
            r14.P()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Kv.B.e(m0.i, m0.z, nI.l, nI.a, U0.m, int):p0.c");
    }

    /* access modifiers changed from: private */
    public static final C5685c f(C17642l lVar, C17631a aVar, C5546i iVar, C5570z zVar) {
        return new C5685c(d.Floating, lVar, aVar, iVar, zVar, (C17642l) null, 32, (DefaultConstructorMarker) null);
    }

    public static final x g(C4889m mVar, int i10) {
        mVar.W(2089702025);
        if (C4895p.J()) {
            C4895p.S(2089702025, i10, -1, "com.ingka.ikea.membership.impl.compose.member.scaffold.rememberMembershipScaffoldState (MembershipState.kt:50)");
        }
        float H12 = ((d) mVar.Q(C5100f0.e())).H1(f37952a);
        C5559o0 h10 = C5548j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        C5570z c10 = C5523B.c(0.0f, 0.0f, 3, (Object) null);
        mVar.W(1589754351);
        Object D10 = mVar.D();
        C4889m.a aVar = C4889m.f14007a;
        if (D10 == aVar.a()) {
            D10 = new y();
            mVar.u(D10);
        }
        C17642l lVar = (C17642l) D10;
        mVar.P();
        mVar.W(1589757130);
        boolean c11 = mVar.c(H12);
        Object D11 = mVar.D();
        if (c11 || D11 == aVar.a()) {
            D11 = new z(H12);
            mVar.u(D11);
        }
        mVar.P();
        C5685c<d> e10 = e(h10, c10, lVar, (C17631a) D11, mVar, 390);
        long a10 = g.f37976a.a(mVar, 6);
        mVar.W(1589760313);
        boolean V10 = mVar.V(e10);
        Object D12 = mVar.D();
        if (V10 || D12 == aVar.a()) {
            D12 = new x(e10, a10, (DefaultConstructorMarker) null);
            mVar.u(D12);
        }
        x xVar = (x) D12;
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return xVar;
    }

    /* access modifiers changed from: private */
    public static final float h(float f10) {
        return f10 * 0.1f;
    }

    /* access modifiers changed from: private */
    public static final float i(float f10) {
        return f10;
    }
}
