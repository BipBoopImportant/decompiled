package me.saket.telephoto.zoomable;

import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import rK.C17865F;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LpK/i;", "zoomSpec", "", "autoApplyTransformations", "Lme/saket/telephoto/zoomable/h;", "hardwareShortcutsSpec", "LpK/n;", "a", "(LpK/i;ZLme/saket/telephoto/zoomable/h;LU0/m;II)LpK/n;", "zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lme/saket/telephoto/zoomable/j;", "b", "()Lme/saket/telephoto/zoomable/j;"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements C17631a<j> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f144800c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10) {
            super(0);
            this.f144800c = z10;
        }

        /* renamed from: b */
        public final j invoke() {
            return new j((C17865F) null, this.f144800c, 1, (DefaultConstructorMarker) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final pK.C17769n a(pK.C17764i r11, boolean r12, me.saket.telephoto.zoomable.h r13, U0.C4889m r14, int r15, int r16) {
        /*
            r7 = r14
            r0 = r15
            r1 = 1456098696(0x56ca4d88, float:1.11217171E14)
            r14.C(r1)
            r2 = r16 & 1
            r3 = 3
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x0017
            pK.i r2 = new pK.i
            r6 = 0
            r2.<init>(r6, r5, r3, r4)
            r8 = r2
            goto L_0x0018
        L_0x0017:
            r8 = r11
        L_0x0018:
            r2 = r16 & 2
            r6 = 1
            if (r2 == 0) goto L_0x001f
            r2 = r6
            goto L_0x0020
        L_0x001f:
            r2 = r12
        L_0x0020:
            r9 = r16 & 4
            if (r9 == 0) goto L_0x002a
            me.saket.telephoto.zoomable.h r9 = new me.saket.telephoto.zoomable.h
            r9.<init>(r5, r4, r3, r4)
            goto L_0x002b
        L_0x002a:
            r9 = r13
        L_0x002b:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0037
            r3 = -1
            java.lang.String r4 = "me.saket.telephoto.zoomable.rememberZoomableState (ZoomableState.kt:36)"
            U0.C4895p.S(r1, r15, r3, r4)
        L_0x0037:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            me.saket.telephoto.zoomable.j$c r3 = me.saket.telephoto.zoomable.j.f144630r
            f1.k r3 = r3.a()
            r4 = -223794607(0xfffffffff2a92a51, float:-6.701328E30)
            r14.C(r4)
            r4 = r0 & 112(0x70, float:1.57E-43)
            r4 = r4 ^ 48
            r10 = 32
            if (r4 <= r10) goto L_0x0053
            boolean r4 = r14.b(r2)
            if (r4 != 0) goto L_0x0057
        L_0x0053:
            r0 = r0 & 48
            if (r0 != r10) goto L_0x0058
        L_0x0057:
            r5 = r6
        L_0x0058:
            java.lang.Object r0 = r14.D()
            if (r5 != 0) goto L_0x0066
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r0 != r4) goto L_0x006e
        L_0x0066:
            me.saket.telephoto.zoomable.s$a r0 = new me.saket.telephoto.zoomable.s$a
            r0.<init>(r2)
            r14.u(r0)
        L_0x006e:
            r4 = r0
            nI.a r4 = (nI.C17631a) r4
            r14.U()
            r5 = 72
            r6 = 4
            r2 = 0
            r0 = r1
            r1 = r3
            r3 = r4
            r4 = r14
            java.lang.Object r0 = f1.C5301c.e(r0, r1, r2, r3, r4, r5, r6)
            me.saket.telephoto.zoomable.j r0 = (me.saket.telephoto.zoomable.j) r0
            r0.c0(r8)
            r0.X(r9)
            U0.I0 r1 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r1 = r14.Q(r1)
            c2.t r1 = (c2.t) r1
            r0.Y(r1)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x009e
            U0.C4895p.R()
        L_0x009e:
            r14.U()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.saket.telephoto.zoomable.s.a(pK.i, boolean, me.saket.telephoto.zoomable.h, U0.m, int, int):pK.n");
    }
}
