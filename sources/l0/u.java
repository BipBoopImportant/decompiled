package l0;

import kotlin.Metadata;
import m0.C5548j;
import m0.C5559o0;
import p1.C5747v0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lp1/v0;", "targetValue", "Lm0/i;", "animationSpec", "", "label", "Lkotlin/Function1;", "LXH/N;", "finishedListener", "LU0/A1;", "a", "(JLm0/i;Ljava/lang/String;LnI/l;LU0/m;II)LU0/A1;", "Lm0/o0;", "Lm0/o0;", "colorDefaultSpring", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final C5559o0<C5747v0> f25437a = C5548j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: m0.z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: m0.o0<p1.v0>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final U0.A1<p1.C5747v0> a(long r10, m0.C5546i<p1.C5747v0> r12, java.lang.String r13, nI.C17642l<? super p1.C5747v0, XH.C16807N> r14, U0.C4889m r15, int r16, int r17) {
        /*
            r6 = r15
            r0 = r16
            r1 = r17 & 2
            if (r1 == 0) goto L_0x000b
            m0.o0<p1.v0> r1 = f25437a
            r2 = r1
            goto L_0x000c
        L_0x000b:
            r2 = r12
        L_0x000c:
            r1 = r17 & 4
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = "ColorAnimation"
            r4 = r1
            goto L_0x0015
        L_0x0014:
            r4 = r13
        L_0x0015:
            r1 = r17 & 8
            if (r1 == 0) goto L_0x001c
            r1 = 0
            r5 = r1
            goto L_0x001d
        L_0x001c:
            r5 = r14
        L_0x001d:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x002c
            r1 = -1
            java.lang.String r3 = "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)"
            r7 = -451899108(0xffffffffe510911c, float:-4.26686E22)
            U0.C4895p.S(r7, r0, r1, r3)
        L_0x002c:
            q1.c r1 = p1.C5747v0.t(r10)
            boolean r1 = r15.V(r1)
            java.lang.Object r3 = r15.D()
            if (r1 != 0) goto L_0x0042
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0056
        L_0x0042:
            p1.v0$a r1 = p1.C5747v0.f27350b
            nI.l r1 = l0.h.a(r1)
            q1.c r3 = p1.C5747v0.t(r10)
            java.lang.Object r1 = r1.invoke(r3)
            r3 = r1
            m0.z0 r3 = (m0.z0) r3
            r15.u(r3)
        L_0x0056:
            r1 = r3
            m0.z0 r1 = (m0.z0) r1
            p1.v0 r3 = p1.C5747v0.k(r10)
            r7 = r0 & 14
            int r8 = r0 << 3
            r8 = r8 & 896(0x380, float:1.256E-42)
            r7 = r7 | r8
            int r0 = r0 << 6
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r0
            r7 = r7 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r8
            r7 = r7 | r0
            r8 = 8
            r9 = 0
            r0 = r3
            r3 = r9
            r6 = r15
            U0.A1 r0 = m0.C5534c.f(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0082
            U0.C4895p.R()
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.u.a(long, m0.i, java.lang.String, nI.l, U0.m, int, int):U0.A1");
    }
}
