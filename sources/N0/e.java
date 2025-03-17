package N0;

import U0.A1;
import XH.C16814e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"LN0/e;", "LN0/f;", "", "bounded", "Lc2/h;", "radius", "LU0/A1;", "Lp1/v0;", "color", "<init>", "(ZFLU0/A1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lr0/k;", "interactionSource", "LN0/g;", "rippleAlpha", "LN0/l;", "c", "(Lr0/k;ZFLU0/A1;LU0/A1;LU0/m;I)LN0/l;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class e extends f {
    public /* synthetic */ e(boolean z10, float f10, A1 a12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, a12);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: N0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: N0.a} */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r15 == U0.C4889m.f14007a.a()) goto L_0x005e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N0.l c(r0.k r9, boolean r10, float r11, U0.A1<p1.C5747v0> r12, U0.A1<N0.g> r13, U0.C4889m r14, int r15) {
        /*
            r8 = this;
            r0 = 331259447(0x13be9e37, float:4.8118755E-27)
            r14.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:92)"
            U0.C4895p.S(r0, r15, r1, r2)
        L_0x0012:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r0 = r14.Q(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup r6 = N0.q.e(r0)
            r0 = r15 & 14
            r0 = r0 ^ 6
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L_0x002f
            boolean r9 = r14.V(r9)
            if (r9 != 0) goto L_0x0033
        L_0x002f:
            r9 = r15 & 6
            if (r9 != r3) goto L_0x0035
        L_0x0033:
            r9 = r2
            goto L_0x0036
        L_0x0035:
            r9 = r1
        L_0x0036:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r15
            r3 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 ^ r3
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r0 <= r4) goto L_0x0046
            boolean r0 = r14.V(r8)
            if (r0 != 0) goto L_0x0049
        L_0x0046:
            r15 = r15 & r3
            if (r15 != r4) goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            r9 = r9 | r1
            boolean r15 = r14.V(r6)
            r9 = r9 | r15
            java.lang.Object r15 = r14.D()
            if (r9 != 0) goto L_0x005e
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r15 != r9) goto L_0x006c
        L_0x005e:
            N0.a r15 = new N0.a
            r7 = 0
            r1 = r15
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r14.u(r15)
        L_0x006c:
            N0.a r15 = (N0.a) r15
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0077
            U0.C4895p.R()
        L_0x0077:
            r14.P()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.e.c(r0.k, boolean, float, U0.A1, U0.A1, U0.m, int):N0.l");
    }

    private e(boolean z10, float f10, A1<C5747v0> a12) {
        super(z10, f10, a12, (DefaultConstructorMarker) null);
    }
}
