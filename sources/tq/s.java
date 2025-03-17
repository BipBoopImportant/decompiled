package tq;

import LC.C13181e;
import N5.f;
import N5.h;
import N5.q;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import TJ.C16505B;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.animation.g;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.C5507b;
import l0.i;
import m0.C5525D;
import m0.C5548j;
import nI.r;
import pK.C17767l;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u0002"}, d2 = {"", "url", "altText", "LpK/l;", "zoomState", "testTag", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "e", "(Ljava/lang/String;Ljava/lang/String;LpK/l;Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "Ltq/n;", "loadingState", "", "imageAlpha", "enlargeimages-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<C5507b, n, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f103343a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: tq.s$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2458a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f103344a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    tq.n[] r0 = tq.n.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    tq.n r1 = tq.n.ShowLoading     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    tq.n r1 = tq.n.ShowError     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f103344a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: tq.s.a.C2458a.<clinit>():void");
            }
        }

        a(String str) {
            this.f103343a = str;
        }

        public final void a(C5507b bVar, n nVar, C4889m mVar, int i10) {
            C17542s.j(bVar, "$this$AnimatedContent");
            C17542s.j(nVar, "state");
            if (C4895p.J()) {
                C4895p.S(1009613634, i10, -1, "com.ingka.ikea.enlargeimages.impl.presentation.ZoomableImage.<anonymous>.<anonymous> (ZoomableImage.kt:110)");
            }
            int i11 = C2458a.f103344a[nVar.ordinal()];
            if (i11 == 1) {
                mVar.W(37728381);
                C13605k1.b((d) null, C13597i1.Emphasised, C13593h1.Large, mVar, 432, 1);
                mVar.P();
            } else if (i11 != 2) {
                mVar.W(37740761);
                mVar.P();
            } else {
                mVar.W(37738313);
                C13181e.f111832a.c(this.f103343a, (d) null, 0, mVar, C13181e.f111833b << 9, 6);
                mVar.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5507b) obj, (n) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"tq/s$b", "LN5/h$b;", "LN5/h;", "request", "LXH/N;", "c", "(LN5/h;)V", "d", "LN5/f;", "result", "b", "(LN5/h;LN5/f;)V", "LN5/q;", "a", "(LN5/h;LN5/q;)V", "enlargeimages-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements h.b {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16505B<n> f103345c;

        b(C16505B<n> b10) {
            this.f103345c = b10;
        }

        public void a(h hVar, q qVar) {
            C17542s.j(hVar, "request");
            C17542s.j(qVar, "result");
            this.f103345c.setValue(n.ShowImage);
        }

        public void b(h hVar, f fVar) {
            C17542s.j(hVar, "request");
            C17542s.j(fVar, "result");
            this.f103345c.setValue(n.ShowError);
        }

        public void c(h hVar) {
            C17542s.j(hVar, "request");
            this.f103345c.setValue(n.ShowLoading);
        }

        public void d(h hVar) {
            C17542s.j(hVar, "request");
            this.f103345c.setValue(n.ShowImage);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: TJ.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: TJ.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: N5.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r23, java.lang.String r24, pK.C17767l r25, java.lang.String r26, androidx.compose.ui.d r27, U0.C4889m r28, int r29, int r30) {
        /*
            r1 = r23
            r0 = r24
            r5 = r25
            r3 = r26
            r2 = r29
            r4 = 16
            r6 = 2
            r7 = 6
            java.lang.String r8 = "url"
            kotlin.jvm.internal.C17542s.j(r1, r8)
            java.lang.String r8 = "altText"
            kotlin.jvm.internal.C17542s.j(r0, r8)
            java.lang.String r8 = "zoomState"
            kotlin.jvm.internal.C17542s.j(r5, r8)
            java.lang.String r8 = "testTag"
            kotlin.jvm.internal.C17542s.j(r3, r8)
            r8 = 1561010134(0x5d0b1fd6, float:6.2656041E17)
            r9 = r28
            U0.m r15 = r9.k(r8)
            r14 = 1
            r9 = r30 & 1
            r13 = 4
            if (r9 == 0) goto L_0x0034
            r9 = r2 | 6
            goto L_0x0044
        L_0x0034:
            r9 = r2 & 6
            if (r9 != 0) goto L_0x0043
            boolean r9 = r15.V(r1)
            if (r9 == 0) goto L_0x0040
            r9 = r13
            goto L_0x0041
        L_0x0040:
            r9 = r6
        L_0x0041:
            r9 = r9 | r2
            goto L_0x0044
        L_0x0043:
            r9 = r2
        L_0x0044:
            r6 = r30 & 2
            if (r6 == 0) goto L_0x004b
            r9 = r9 | 48
            goto L_0x005a
        L_0x004b:
            r6 = r2 & 48
            if (r6 != 0) goto L_0x005a
            boolean r6 = r15.V(r0)
            if (r6 == 0) goto L_0x0058
            r6 = 32
            goto L_0x0059
        L_0x0058:
            r6 = r4
        L_0x0059:
            r9 = r9 | r6
        L_0x005a:
            r6 = r30 & 4
            if (r6 == 0) goto L_0x0061
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0071
        L_0x0061:
            r6 = r2 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0071
            boolean r6 = r15.V(r5)
            if (r6 == 0) goto L_0x006e
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0070
        L_0x006e:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0070:
            r9 = r9 | r6
        L_0x0071:
            r6 = r30 & 8
            if (r6 == 0) goto L_0x0078
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x0088
        L_0x0078:
            r6 = r2 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0088
            boolean r6 = r15.V(r3)
            if (r6 == 0) goto L_0x0085
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r9 = r9 | r6
        L_0x0088:
            r4 = r30 & 16
            if (r4 == 0) goto L_0x0092
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r6 = r27
        L_0x0090:
            r12 = r9
            goto L_0x00a5
        L_0x0092:
            r6 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008e
            r6 = r27
            boolean r10 = r15.V(r6)
            if (r10 == 0) goto L_0x00a1
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r9 = r9 | r10
            goto L_0x0090
        L_0x00a5:
            r9 = r12 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r10) goto L_0x00ba
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x00b2
            goto L_0x00ba
        L_0x00b2:
            r15.L()
            r5 = r6
            r22 = r15
            goto L_0x02d7
        L_0x00ba:
            if (r4 == 0) goto L_0x00bf
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r6 = r4
        L_0x00bf:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00cb
            r4 = -1
            java.lang.String r9 = "com.ingka.ikea.enlargeimages.impl.presentation.ZoomableImage (ZoomableImage.kt:51)"
            U0.C4895p.S(r8, r12, r4, r9)
        L_0x00cb:
            r4 = -553747267(0xffffffffdefe7cbd, float:-9.1688698E18)
            r15.W(r4)
            r4 = r12 & 14
            r8 = 0
            if (r4 != r13) goto L_0x00d8
            r9 = r14
            goto L_0x00d9
        L_0x00d8:
            r9 = r8
        L_0x00d9:
            java.lang.Object r10 = r15.D()
            if (r9 != 0) goto L_0x00e7
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x00f0
        L_0x00e7:
            tq.n r9 = tq.n.ShowImage
            TJ.B r10 = TJ.C16521S.a(r9)
            r15.u(r10)
        L_0x00f0:
            r11 = r10
            TJ.B r11 = (TJ.C16505B) r11
            r15.P()
            r9 = -553743793(0xffffffffdefe8a4f, float:-9.1707796E18)
            r15.W(r9)
            boolean r9 = r15.V(r11)
            java.lang.Object r10 = r15.D()
            if (r9 != 0) goto L_0x010e
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x011a
        L_0x010e:
            tq.o r9 = new tq.o
            r9.<init>()
            TJ.g r10 = TJ.C16534i.r(r11, r9)
            r15.u(r10)
        L_0x011a:
            r9 = r10
            TJ.g r9 = (TJ.C16532g) r9
            r15.P()
            tq.n r10 = tq.n.ShowImage
            r16 = 48
            r17 = 14
            r18 = 0
            r19 = 0
            r20 = 0
            r27 = r10
            r21 = r11
            r11 = r18
            r22 = r12
            r12 = r19
            r13 = r20
            r14 = r15
            r28 = r15
            r15 = r16
            r16 = r17
            U0.A1 r17 = j3.a.b(r9, r10, r11, r12, r13, r14, r15, r16)
            tq.n r9 = j(r17)
            r15 = 0
            if (r9 != r10) goto L_0x014d
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x014e
        L_0x014d:
            r9 = r15
        L_0x014e:
            r10 = 200(0xc8, float:2.8E-43)
            r14 = 0
            m0.y0 r10 = m0.C5548j.j(r10, r8, r14, r7, r14)
            r7 = 3120(0xc30, float:4.372E-42)
            r16 = 20
            r11 = 0
            java.lang.String r12 = "image alpha"
            r13 = 0
            r14 = r28
            r15 = r7
            U0.A1 r7 = m0.C5534c.d(r9, r10, r11, r12, r13, r14, r15, r16)
            U0.I0 r9 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            r15 = r28
            java.lang.Object r9 = r15.Q(r9)
            android.content.Context r9 = (android.content.Context) r9
            r10 = -553722194(0xffffffffdefedeae, float:-9.1826538E18)
            r15.W(r10)
            r10 = 4
            if (r4 != r10) goto L_0x017b
            r14 = 1
            goto L_0x017c
        L_0x017b:
            r14 = r8
        L_0x017c:
            java.lang.Object r4 = r15.D()
            if (r14 != 0) goto L_0x018a
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r4 != r10) goto L_0x01a5
        L_0x018a:
            N5.h$a r4 = new N5.h$a
            r4.<init>(r9)
            N5.h$a r4 = r4.b(r1)
            tq.s$b r9 = new tq.s$b
            r10 = r21
            r9.<init>(r10)
            N5.h$a r4 = r4.e(r9)
            N5.h r4 = r4.a()
            r15.u(r4)
        L_0x01a5:
            r20 = r4
            N5.h r20 = (N5.h) r20
            r15.P()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.e()
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r8)
            int r8 = U0.C4883j.a(r15, r8)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r15, r6)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r15.m()
            if (r13 != 0) goto L_0x01d1
            U0.C4883j.c()
        L_0x01d1:
            r15.I()
            boolean r13 = r15.i()
            if (r13 == 0) goto L_0x01de
            r15.p(r12)
            goto L_0x01e1
        L_0x01de:
            r15.t()
        L_0x01e1:
            U0.m r12 = U0.F1.a(r15)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r4, r13)
            nI.p r4 = r11.e()
            U0.F1.c(r12, r9, r4)
            nI.p r4 = r11.b()
            boolean r9 = r12.i()
            if (r9 != 0) goto L_0x020b
            java.lang.Object r9 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x0219
        L_0x020b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.w(r8, r4)
        L_0x0219:
            nI.p r4 = r11.d()
            U0.F1.c(r12, r10, r4)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            tq.n r9 = j(r17)
            r4 = 28088718(0x1ac998e, float:6.340316E-38)
            r15.W(r4)
            java.lang.Object r4 = r15.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r10 = r8.a()
            if (r4 != r10) goto L_0x0240
            tq.p r4 = new tq.p
            r4.<init>()
            r15.u(r4)
        L_0x0240:
            r11 = r4
            nI.l r11 = (nI.C17642l) r11
            r15.P()
            tq.s$a r4 = new tq.s$a
            r4.<init>(r0)
            r10 = 54
            r12 = 1009613634(0x3c2d7b42, float:0.010588469)
            r14 = 1
            c1.a r4 = c1.c.e(r12, r14, r4, r15, r10)
            r17 = 1597824(0x186180, float:2.239028E-39)
            r18 = 42
            r10 = 0
            r12 = 0
            java.lang.String r13 = "loading state"
            r16 = 0
            r14 = r16
            r28 = r15
            r15 = r4
            r16 = r28
            androidx.compose.animation.a.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r9 = 1
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.f(r4, r10, r9, r11)
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r4, r3)
            r9 = 28119024(0x1ad0ff0, float:6.357303E-38)
            r15 = r28
            r15.W(r9)
            boolean r9 = r15.V(r7)
            java.lang.Object r10 = r15.D()
            if (r9 != 0) goto L_0x028f
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x0297
        L_0x028f:
            tq.q r10 = new tq.q
            r10.<init>(r7)
            r15.u(r10)
        L_0x0297:
            nI.l r10 = (nI.C17642l) r10
            r15.P()
            androidx.compose.ui.d r4 = androidx.compose.ui.graphics.b.a(r4, r10)
            r7 = r22 & 112(0x70, float:1.57E-43)
            int r8 = r22 << 3
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r17 = r7 | r8
            r18 = 0
            r19 = 16368(0x3ff0, float:2.2936E-41)
            r7 = 0
            r21 = r6
            r6 = r7
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r22 = r15
            r15 = r16
            r2 = r20
            r3 = r24
            r5 = r25
            r16 = r22
            qK.C17843e.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r22.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x02d5
            U0.C4895p.R()
        L_0x02d5:
            r5 = r21
        L_0x02d7:
            U0.Y0 r8 = r22.n()
            if (r8 == 0) goto L_0x02f2
            tq.r r9 = new tq.r
            r0 = r9
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r29
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x02f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tq.s.e(java.lang.String, java.lang.String, pK.l, java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final i f(androidx.compose.animation.d dVar) {
        C17542s.j(dVar, "$this$AnimatedContent");
        return androidx.compose.animation.a.e(g.o(C5548j.j(220, 90, (C5525D) null, 4, (Object) null), 0.0f, 2, (Object) null), g.q(C5548j.j(90, 0, (C5525D) null, 6, (Object) null), 0.0f, 2, (Object) null));
    }

    /* access modifiers changed from: private */
    public static final C16807N g(A1 a12, c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.d(k(a12));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(String str, String str2, C17767l lVar, String str3, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(str, str2, lVar, str3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final long i(n nVar) {
        C17542s.j(nVar, "it");
        return nVar == n.ShowLoading ? 200 : 0;
    }

    private static final n j(A1<? extends n> a12) {
        return (n) a12.getValue();
    }

    private static final float k(A1<Float> a12) {
        return a12.getValue().floatValue();
    }
}
