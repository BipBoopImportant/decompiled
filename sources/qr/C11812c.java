package qr;

import E1.I;
import G1.C4504g;
import LC.C13181e;
import SC.C13575d;
import SC.H2;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import com.ingka.ikea.core.model.Image;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5601g;
import nI.C17631a;
import nI.p;
import nI.q;
import p1.i1;
import s0.C5834E;
import s0.C5843N;
import s0.C5844O;
import s0.C5857c;
import s0.C5862h;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u001b8CX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LIq/a;", "model", "Lkotlin/Function0;", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Ls0/c;", "action", "Lp1/i1;", "shape", "Ln0/g;", "border", "c", "(LIq/a;LnI/a;Landroidx/compose/ui/d;LnI/q;Lp1/i1;Ln0/g;LU0/m;II)V", "e", "(Landroidx/compose/ui/d;LU0/m;II)V", "Lc2/h;", "a", "F", "CardMaxWidth", "b", "TextMinHeight", "Ls0/E;", "Ls0/E;", "TextHorizontalPadding", "Lp1/v0;", "g", "(LU0/m;I)J", "TextBackgroundColor", "familyrewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: qr.c  reason: case insensitive filesystem */
public final class C11812c {

    /* renamed from: a  reason: collision with root package name */
    private static final float f101943a = h.B((float) 328);

    /* renamed from: b  reason: collision with root package name */
    private static final float f101944b = h.B((float) 92);

    /* renamed from: c  reason: collision with root package name */
    private static final C5834E f101945c = D.c(h.B((float) 16), 0.0f, 2, (Object) null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qr.c$a */
    static final class a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Image f101946a;

        a(Image image) {
            this.f101946a = image;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$ImageWithLoading");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(cVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-942616152, i10, -1, "com.ingka.ikea.familyrewards.presentation.card.BaseRewardCard.<anonymous>.<anonymous>.<anonymous> (BaseRewardCard.kt:95)");
                }
                d d10 = b.d(cVar.e(d.f18749a), C13575d.a(mVar, 0).m0(), (i1) null, 2, (Object) null);
                C5437c e10 = C5437c.f24302a.e();
                Image image = this.f101946a;
                I h10 = C5077h.h(e10, false);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e11 = c.e(mVar, d10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, h10, aVar.c());
                F1.c(a12, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e11, aVar.d());
                C5079j jVar = C5079j.f18125a;
                C13181e.f111832a.c(image.A0(), (d) null, 0, mVar, C13181e.f111833b << 9, 6);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(Iq.a r45, nI.C17631a<XH.C16807N> r46, androidx.compose.ui.d r47, nI.q<? super s0.C5857c, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r48, p1.i1 r49, n0.C5601g r50, U0.C4889m r51, int r52, int r53) {
        /*
            r1 = r45
            r11 = r46
            r12 = r52
            r0 = 32
            r13 = 16
            r14 = 48
            r15 = 6
            java.lang.String r2 = "model"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "onClick"
            kotlin.jvm.internal.C17542s.j(r11, r2)
            r2 = 1778474600(0x6a015e68, float:3.9099312E25)
            r3 = r51
            U0.m r10 = r3.k(r2)
            r9 = 1
            r3 = r53 & 1
            r8 = 4
            r7 = 2
            if (r3 == 0) goto L_0x002a
            r3 = r12 | 6
            goto L_0x0043
        L_0x002a:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x0042
            r3 = r12 & 8
            if (r3 != 0) goto L_0x0037
            boolean r3 = r10.V(r1)
            goto L_0x003b
        L_0x0037:
            boolean r3 = r10.F(r1)
        L_0x003b:
            if (r3 == 0) goto L_0x003f
            r3 = r8
            goto L_0x0040
        L_0x003f:
            r3 = r7
        L_0x0040:
            r3 = r3 | r12
            goto L_0x0043
        L_0x0042:
            r3 = r12
        L_0x0043:
            r4 = r53 & 2
            if (r4 == 0) goto L_0x0049
            r3 = r3 | r14
            goto L_0x0057
        L_0x0049:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x0057
            boolean r4 = r10.F(r11)
            if (r4 == 0) goto L_0x0055
            r4 = r0
            goto L_0x0056
        L_0x0055:
            r4 = r13
        L_0x0056:
            r3 = r3 | r4
        L_0x0057:
            r4 = r53 & 4
            if (r4 == 0) goto L_0x0060
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x005d:
            r5 = r47
            goto L_0x0072
        L_0x0060:
            r5 = r12 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x005d
            r5 = r47
            boolean r6 = r10.V(r5)
            if (r6 == 0) goto L_0x006f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r3 = r3 | r6
        L_0x0072:
            r6 = r53 & 8
            if (r6 == 0) goto L_0x007b
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0078:
            r7 = r48
            goto L_0x008e
        L_0x007b:
            r7 = r12 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0078
            r7 = r48
            boolean r16 = r10.F(r7)
            if (r16 == 0) goto L_0x008a
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r3 = r3 | r16
        L_0x008e:
            r16 = r53 & 16
            if (r16 == 0) goto L_0x0097
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0094:
            r8 = r49
            goto L_0x00aa
        L_0x0097:
            r8 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0094
            r8 = r49
            boolean r18 = r10.V(r8)
            if (r18 == 0) goto L_0x00a6
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r3 = r3 | r18
        L_0x00aa:
            r0 = r53 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x00b5
            r3 = r3 | r18
            r15 = r50
            goto L_0x00c8
        L_0x00b5:
            r18 = r12 & r18
            r15 = r50
            if (r18 != 0) goto L_0x00c8
            boolean r18 = r10.V(r15)
            if (r18 == 0) goto L_0x00c4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r3 = r3 | r18
        L_0x00c8:
            r18 = 74899(0x12493, float:1.04956E-40)
            r13 = r3 & r18
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00e3
            boolean r13 = r10.l()
            if (r13 != 0) goto L_0x00d9
            goto L_0x00e3
        L_0x00d9:
            r10.L()
            r3 = r5
            r4 = r7
            r5 = r8
            r1 = r10
            r6 = r15
            goto L_0x0552
        L_0x00e3:
            if (r4 == 0) goto L_0x00e9
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r13 = r4
            goto L_0x00ea
        L_0x00e9:
            r13 = r5
        L_0x00ea:
            r14 = 0
            if (r6 == 0) goto L_0x00ee
            r7 = r14
        L_0x00ee:
            if (r16 == 0) goto L_0x00f5
            p1.i1 r4 = p1.c1.a()
            r8 = r4
        L_0x00f5:
            r6 = 0
            if (r0 == 0) goto L_0x0108
            float r0 = (float) r6
            float r0 = c2.h.B(r0)
            p1.v0$a r4 = p1.C5747v0.f27350b
            long r4 = r4.h()
            n0.g r0 = n0.C5602h.a(r0, r4)
            r15 = r0
        L_0x0108:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0114
            r0 = -1
            java.lang.String r4 = "com.ingka.ikea.familyrewards.presentation.card.BaseRewardCard (BaseRewardCard.kt:69)"
            U0.C4895p.S(r2, r3, r0, r4)
        L_0x0114:
            com.ingka.ikea.core.model.Image r0 = r45.k()
            java.lang.String r2 = "BaseRewardCardTestTag-Root"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r13, r2)
            float r4 = f101943a
            r5 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.A(r2, r5, r4, r9, r14)
            androidx.compose.ui.d r2 = m1.e.a(r2, r8)
            androidx.compose.ui.d r2 = n0.C5599e.e(r2, r15, r8)
            r4 = -198398660(0xfffffffff42cad3c, float:-5.472343E31)
            r10.W(r4)
            java.lang.Object r4 = r10.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r5 = r16.a()
            if (r4 != r5) goto L_0x0146
            r0.m r4 = r0.l.a()
            r10.u(r4)
        L_0x0146:
            r0.m r4 = (r0.m) r4
            r10.P()
            tK.h r5 = SC.C13575d.a(r10, r6)
            long r20 = r5.T()
            r22 = 3
            r23 = 0
            r18 = 0
            r19 = 0
            n0.I r5 = I0.C4588v0.f(r18, r19, r20, r22, r23)
            r16 = 28
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r42 = r3
            r3 = r4
            r4 = r5
            r5 = r19
            r14 = r6
            r6 = r20
            r43 = r7
            r7 = r21
            r44 = r8
            r8 = r46
            r9 = r16
            r1 = r10
            r10 = r18
            androidx.compose.ui.d r2 = androidx.compose.foundation.d.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r3.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r6 = r5.k()
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r6, r1, r14)
            int r6 = U0.C4883j.a(r1, r14)
            U0.y r7 = r1.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r1, r2)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r1.m()
            if (r10 != 0) goto L_0x01ae
            U0.C4883j.c()
        L_0x01ae:
            r1.I()
            boolean r10 = r1.i()
            if (r10 == 0) goto L_0x01bb
            r1.p(r9)
            goto L_0x01be
        L_0x01bb:
            r1.t()
        L_0x01be:
            U0.m r9 = U0.F1.a(r1)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r4, r10)
            nI.p r4 = r8.e()
            U0.F1.c(r9, r7, r4)
            nI.p r4 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x01e8
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x01f6
        L_0x01e8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r4)
        L_0x01f6:
            nI.p r4 = r8.d()
            U0.F1.c(r9, r2, r4)
            s0.h r2 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r4 = 1
            r6 = 0
            r7 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.h(r2, r7, r4, r6)
            r10 = 1071877689(0x3fe38e39, float:1.7777778)
            r7 = 2
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.C5074e.b(r9, r10, r14, r7, r6)
            tK.h r6 = SC.C13575d.a(r1, r14)
            long r17 = r6.m0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            i1.c r9 = r5.o()
            E1.I r9 = androidx.compose.foundation.layout.C5077h.h(r9, r14)
            int r10 = U0.C4883j.a(r1, r14)
            U0.y r14 = r1.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r1, r6)
            nI.a r7 = r8.a()
            U0.f r16 = r1.m()
            if (r16 != 0) goto L_0x0243
            U0.C4883j.c()
        L_0x0243:
            r1.I()
            boolean r16 = r1.i()
            if (r16 == 0) goto L_0x0250
            r1.p(r7)
            goto L_0x0253
        L_0x0250:
            r1.t()
        L_0x0253:
            U0.m r7 = U0.F1.a(r1)
            nI.p r4 = r8.c()
            U0.F1.c(r7, r9, r4)
            nI.p r4 = r8.e()
            U0.F1.c(r7, r14, r4)
            nI.p r4 = r8.b()
            boolean r9 = r7.i()
            if (r9 != 0) goto L_0x027d
            java.lang.Object r9 = r7.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r14)
            if (r9 != 0) goto L_0x028b
        L_0x027d:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r7.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r7.w(r9, r4)
        L_0x028b:
            nI.p r4 = r8.d()
            U0.F1.c(r7, r6, r4)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            r6 = 663785215(0x27908eff, float:4.0123066E-15)
            r1.W(r6)
            if (r0 == 0) goto L_0x02d8
            java.lang.String r16 = r0.getUrl()
            java.lang.String r17 = r0.A0()
            java.lang.String r6 = "BaseRewardCardTestTag-Image"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r2, r6)
            androidx.compose.ui.d r18 = r4.e(r6)
            qr.c$a r6 = new qr.c$a
            r6.<init>(r0)
            r0 = 54
            r7 = -942616152(0xffffffffc7d0d1a8, float:-106915.31)
            r9 = 1
            c1.a r27 = c1.c.e(r7, r9, r6, r1, r0)
            r30 = 48
            r31 = 1528(0x5f8, float:2.141E-42)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 1
            r26 = 0
            r29 = 805306368(0x30000000, float:4.656613E-10)
            r28 = r1
            LC.h.c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x02d8:
            r1.P()
            r1.x()
            r0 = 3
            r6 = 0
            androidx.compose.ui.d r0 = androidx.compose.animation.f.b(r2, r6, r6, r0, r6)
            r7 = 1
            r9 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r9, r7, r6)
            float r7 = f101944b
            r10 = 2
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.k(r0, r7, r9, r10, r6)
            r0 = 0
            long r17 = g(r1, r0)
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            i1.c$c r6 = r5.i()
            androidx.compose.foundation.layout.d$e r7 = r3.f()
            r9 = 48
            E1.I r6 = androidx.compose.foundation.layout.G.b(r7, r6, r1, r9)
            r7 = 0
            int r9 = U0.C4883j.a(r1, r7)
            U0.y r7 = r1.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r1, r0)
            nI.a r10 = r8.a()
            U0.f r14 = r1.m()
            if (r14 != 0) goto L_0x0328
            U0.C4883j.c()
        L_0x0328:
            r1.I()
            boolean r14 = r1.i()
            if (r14 == 0) goto L_0x0335
            r1.p(r10)
            goto L_0x0338
        L_0x0335:
            r1.t()
        L_0x0338:
            U0.m r10 = U0.F1.a(r1)
            nI.p r14 = r8.c()
            U0.F1.c(r10, r6, r14)
            nI.p r6 = r8.e()
            U0.F1.c(r10, r7, r6)
            nI.p r6 = r8.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x0362
            java.lang.Object r7 = r10.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r14)
            if (r7 != 0) goto L_0x0370
        L_0x0362:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.w(r7, r6)
        L_0x0370:
            nI.p r6 = r8.d()
            U0.F1.c(r10, r0, r6)
            s0.N r16 = s0.C5843N.f28726a
            r0 = 16
            float r0 = (float) r0
            float r6 = c2.h.B(r0)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.y(r2, r6)
            r7 = 6
            s0.C5844O.a(r6, r1, r7)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r2
            androidx.compose.ui.d r6 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$b r7 = r5.k()
            r9 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r7, r1, r9)
            int r7 = U0.C4883j.a(r1, r9)
            U0.y r9 = r1.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r1, r6)
            nI.a r10 = r8.a()
            U0.f r14 = r1.m()
            if (r14 != 0) goto L_0x03bc
            U0.C4883j.c()
        L_0x03bc:
            r1.I()
            boolean r14 = r1.i()
            if (r14 == 0) goto L_0x03c9
            r1.p(r10)
            goto L_0x03cc
        L_0x03c9:
            r1.t()
        L_0x03cc:
            U0.m r10 = U0.F1.a(r1)
            nI.p r14 = r8.c()
            U0.F1.c(r10, r3, r14)
            nI.p r3 = r8.e()
            U0.F1.c(r10, r9, r3)
            nI.p r3 = r8.b()
            boolean r9 = r10.i()
            if (r9 != 0) goto L_0x03f6
            java.lang.Object r9 = r10.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r14)
            if (r9 != 0) goto L_0x0404
        L_0x03f6:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r10.u(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r3)
        L_0x0404:
            nI.p r3 = r8.d()
            U0.F1.c(r10, r6, r3)
            IC.e r16 = r45.l()
            TC.b$a$c r17 = TC.C13679b.a.c.f116681a
            r3 = 0
            tK.h r6 = SC.C13575d.a(r1, r3)
            long r19 = r6.H0()
            java.lang.String r3 = "BaseRewardCardTestTag-Label"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r2, r3)
            r6 = 1
            r7 = 0
            r9 = 0
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.J.h(r3, r9, r6, r7)
            int r3 = IC.C13023e.f110931a
            r6 = r3 | 432(0x1b0, float:6.05E-43)
            r39 = r6
            r40 = 0
            r41 = 262128(0x3fff0, float:3.6732E-40)
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = r1
            SC.C13607l.i(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r6 = 4
            float r6 = (float) r6
            float r7 = c2.h.B(r6)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.i(r2, r7)
            r9 = 6
            s0.C5844O.a(r7, r1, r9)
            IC.e r16 = r45.getTitle()
            TC.b$b$f r17 = TC.C13679b.C2857b.f.f116688a
            r7 = 0
            tK.h r9 = SC.C13575d.a(r1, r7)
            long r19 = r9.G0()
            java.lang.String r7 = "BaseRewardCardTestTag-Title"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r2, r7)
            r9 = 1
            r10 = 0
            r14 = 0
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.J.h(r7, r14, r9, r10)
            r3 = r3 | 432(0x1b0, float:6.05E-43)
            r39 = r3
            r40 = 196608(0x30000, float:2.75506E-40)
            r41 = 229360(0x37ff0, float:3.21402E-40)
            r35 = 2
            SC.C13607l.i(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1.x()
            r7 = r43
            if (r7 == 0) goto L_0x0529
            r0 = -895562707(0xffffffffca9ecc2d, float:-5203478.5)
            r1.W(r0)
            float r0 = c2.h.B(r6)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r2, r0)
            r3 = 6
            s0.C5844O.a(r0, r1, r3)
            i1.c r0 = r5.o()
            r3 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5077h.h(r0, r3)
            int r3 = U0.C4883j.a(r1, r3)
            U0.y r5 = r1.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r1, r2)
            nI.a r6 = r8.a()
            U0.f r9 = r1.m()
            if (r9 != 0) goto L_0x04c6
            U0.C4883j.c()
        L_0x04c6:
            r1.I()
            boolean r9 = r1.i()
            if (r9 == 0) goto L_0x04d3
            r1.p(r6)
            goto L_0x04d6
        L_0x04d3:
            r1.t()
        L_0x04d6:
            U0.m r6 = U0.F1.a(r1)
            nI.p r9 = r8.c()
            U0.F1.c(r6, r0, r9)
            nI.p r0 = r8.e()
            U0.F1.c(r6, r5, r0)
            nI.p r0 = r8.b()
            boolean r5 = r6.i()
            if (r5 != 0) goto L_0x0500
            java.lang.Object r5 = r6.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x050e
        L_0x0500:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6.u(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r0)
        L_0x050e:
            nI.p r0 = r8.d()
            U0.F1.c(r6, r2, r0)
            r3 = 6
            int r0 = r42 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.invoke(r4, r1, r0)
            r1.x()
            r1.P()
            goto L_0x053e
        L_0x0529:
            r3 = 6
            r4 = -895429934(0xffffffffcaa0d2d2, float:-5269865.0)
            r1.W(r4)
            float r0 = c2.h.B(r0)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r2, r0)
            s0.C5844O.a(r0, r1, r3)
            r1.P()
        L_0x053e:
            r1.x()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x054d
            U0.C4895p.R()
        L_0x054d:
            r4 = r7
            r3 = r13
            r6 = r15
            r5 = r44
        L_0x0552:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x0569
            qr.a r10 = new qr.a
            r0 = r10
            r1 = r45
            r2 = r46
            r7 = r52
            r8 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0569:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qr.C11812c.c(Iq.a, nI.a, androidx.compose.ui.d, nI.q, p1.i1, n0.g, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(Iq.a aVar, C17631a aVar2, d dVar, q qVar, i1 i1Var, C5601g gVar, int i10, int i11, C4889m mVar, int i12) {
        c(aVar, aVar2, dVar, qVar, i1Var, gVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void e(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        d dVar3;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-1090297576);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            dVar3 = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-1090297576, i12, -1, "com.ingka.ikea.familyrewards.presentation.card.LoadingCard (BaseRewardCard.kt:155)");
            }
            d A10 = J.A(C5116k1.a(dVar3, "BaseRewardCardTestTag-Root"), 0.0f, f101943a, 1, (Object) null);
            C5073d dVar4 = C5073d.f18068a;
            C5073d.m g10 = dVar4.g();
            C5437c.a aVar = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, A10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            d.a aVar3 = d.f18749a;
            H2.b(C5074e.b(J.h(aVar3, 0.0f, 1, (Object) null), 1.7777778f, false, 2, (Object) null), false, k10, 6, 2);
            d h10 = D.h(b.d(J.k(J.h(aVar3, 0.0f, 1, (Object) null), f101944b, 0.0f, 2, (Object) null), g(k10, 0), (i1) null, 2, (Object) null), f101945c);
            I b11 = G.b(dVar4.f(), aVar.i(), k10, 48);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, h10);
            C17631a<C4504g> a15 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, b11, aVar2.c());
            F1.c(a16, s11, aVar2.e());
            p<C4504g, Integer, C16807N> b12 = aVar2.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            I a17 = C5080k.a(dVar4.g(), aVar.k(), k10, 0);
            int a18 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            d e12 = c.e(k10, aVar3);
            C17631a<C4504g> a19 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a19);
            } else {
                k10.t();
            }
            C4889m a20 = F1.a(k10);
            F1.c(a20, a17, aVar2.c());
            F1.c(a20, s12, aVar2.e());
            p<C4504g, Integer, C16807N> b13 = aVar2.b();
            if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                a20.u(Integer.valueOf(a18));
                a20.w(Integer.valueOf(a18), b13);
            }
            F1.c(a20, e12, aVar2.d());
            H2.b(J.g(J.i(aVar3, h.B((float) 12)), 0.5f), false, k10, 6, 2);
            C5844O.a(J.i(aVar3, h.B((float) 4)), k10, 6);
            H2.b(J.g(J.i(aVar3, h.B((float) 16)), 0.4f), false, k10, 6, 2);
            k10.x();
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            dVar3 = dVar2;
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C11811b(dVar3, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final long g(C4889m mVar, int i10) {
        mVar.W(449040409);
        if (C4895p.J()) {
            C4895p.S(449040409, i10, -1, "com.ingka.ikea.familyrewards.presentation.card.<get-TextBackgroundColor> (BaseRewardCard.kt:59)");
        }
        long l02 = C13575d.a(mVar, 0).l0();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return l02;
    }
}
