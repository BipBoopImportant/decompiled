package qr;

import Iq.a;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c1.c;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.C5507b;
import m0.C5548j;
import m0.C5559o0;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p1.C5747v0;
import p1.p1;
import s0.C5857c;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&²\u0006\f\u0010#\u001a\u00020\"8\nX\u0002²\u0006\f\u0010%\u001a\u00020$8\nX\u0002"}, d2 = {"LIq/a$c;", "model", "Lkotlin/Function0;", "LXH/N;", "onClick", "Lkotlin/Function1;", "", "onRedeemClick", "Landroidx/compose/ui/d;", "modifier", "enabled", "loading", "redeemed", "g", "(LIq/a$c;LnI/a;LnI/l;Landroidx/compose/ui/d;ZZZLU0/m;II)V", "d", "(ZZZLnI/l;LU0/m;I)V", "Landroidx/compose/animation/i;", "n", "()Landroidx/compose/animation/i;", "Landroidx/compose/animation/k;", "o", "()Landroidx/compose/animation/k;", "l", "m", "Lm0/o0;", "", "a", "Lm0/o0;", "spring", "Landroidx/compose/ui/graphics/f;", "b", "J", "applyTransformOrigin", "Lp1/v0;", "borderColor", "Lc2/h;", "borderWidth", "familyrewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final C5559o0<Float> f101963a = C5548j.h(0.65f, 200.0f, (Object) null, 4, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f101964b = p1.a(0.75f, 0.5f);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<C5507b, Boolean, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f101965a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f101966b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f101967c;

        a(boolean z10, boolean z11, C17642l<? super Boolean, C16807N> lVar) {
            this.f101965a = z10;
            this.f101966b = z11;
            this.f101967c = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar) {
            lVar.invoke(Boolean.FALSE);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar) {
            lVar.invoke(Boolean.TRUE);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(l0.C5507b r23, boolean r24, U0.C4889m r25, int r26) {
            /*
                r22 = this;
                r0 = r22
                r14 = r25
                java.lang.String r1 = "$this$AnimatedContent"
                r2 = r23
                kotlin.jvm.internal.C17542s.j(r2, r1)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x001c
                r1 = -1
                java.lang.String r2 = "com.ingka.ikea.familyrewards.presentation.card.ActionContent.<anonymous> (RedeemableRewardCard.kt:106)"
                r3 = -1589520425(0xffffffffa141d7d7, float:-6.5676605E-19)
                r4 = r26
                U0.C4895p.S(r3, r4, r1, r2)
            L_0x001c:
                r1 = 1
                r2 = 0
                if (r24 == 0) goto L_0x009d
                r3 = 84304171(0x506612b, float:6.318497E-36)
                r14.W(r3)
                int r3 = uK.C18146a.f148661u1
                int r4 = Oo.b.f84647g3
                java.lang.String r4 = J1.j.b(r4, r14, r2)
                SC.H0 r5 = SC.H0.Emphasised
                SC.G0 r6 = SC.G0.XSmall
                boolean r7 = r0.f101965a
                if (r7 != 0) goto L_0x003d
                boolean r7 = r0.f101966b
                if (r7 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r7 = r2
                goto L_0x003e
            L_0x003d:
                r7 = r1
            L_0x003e:
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                java.lang.String r2 = "RedeemableRewardCardTestTag-RedeemedButton"
                androidx.compose.ui.d r15 = androidx.compose.ui.platform.C5116k1.a(r1, r2)
                r1 = 12
                float r1 = (float) r1
                float r18 = c2.h.B(r1)
                r20 = 11
                r21 = 0
                r16 = 0
                r17 = 0
                r19 = 0
                androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r15, r16, r17, r18, r19, r20, r21)
                boolean r9 = r0.f101966b
                r1 = 1803846421(0x6b848315, float:3.2039445E26)
                r14.W(r1)
                nI.l<java.lang.Boolean, XH.N> r1 = r0.f101967c
                boolean r1 = r14.V(r1)
                nI.l<java.lang.Boolean, XH.N> r2 = r0.f101967c
                java.lang.Object r10 = r25.D()
                if (r1 != 0) goto L_0x0079
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r10 != r1) goto L_0x0081
            L_0x0079:
                qr.g r10 = new qr.g
                r10.<init>(r2)
                r14.u(r10)
            L_0x0081:
                nI.a r10 = (nI.C17631a) r10
                r25.P()
                r11 = 221568(0x36180, float:3.10483E-40)
                r12 = 64
                r13 = 0
                r1 = r3
                r2 = r4
                r3 = r8
                r4 = r7
                r7 = r13
                r8 = r9
                r9 = r10
                r10 = r25
                SC.F0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r25.P()
                goto L_0x0112
            L_0x009d:
                r3 = 84963789(0x51071cd, float:6.7917494E-36)
                r14.W(r3)
                int r3 = Oo.b.f84557Y
                java.lang.String r3 = J1.j.b(r3, r14, r2)
                SC.M r5 = SC.M.XSmall
                boolean r4 = r0.f101965a
                if (r4 != 0) goto L_0x00b6
                boolean r4 = r0.f101966b
                if (r4 == 0) goto L_0x00b4
                goto L_0x00b6
            L_0x00b4:
                r4 = r2
                goto L_0x00b7
            L_0x00b6:
                r4 = r1
            L_0x00b7:
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                java.lang.String r2 = "RedeemableRewardCardTestTag-UseButton"
                androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r1, r2)
                r1 = 16
                float r1 = (float) r1
                float r9 = c2.h.B(r1)
                r11 = 11
                r12 = 0
                r7 = 0
                r8 = 0
                r10 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r6, r7, r8, r9, r10, r11, r12)
                boolean r6 = r0.f101966b
                r1 = 1803860788(0x6b84bb34, float:3.209245E26)
                r14.W(r1)
                nI.l<java.lang.Boolean, XH.N> r1 = r0.f101967c
                boolean r1 = r14.V(r1)
                nI.l<java.lang.Boolean, XH.N> r7 = r0.f101967c
                java.lang.Object r8 = r25.D()
                if (r1 != 0) goto L_0x00ee
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r8 != r1) goto L_0x00f6
            L_0x00ee:
                qr.h r8 = new qr.h
                r8.<init>(r7)
                r14.u(r8)
            L_0x00f6:
                r10 = r8
                nI.a r10 = (nI.C17631a) r10
                r25.P()
                r12 = 24624(0x6030, float:3.4506E-41)
                r13 = 456(0x1c8, float:6.39E-43)
                r7 = 0
                r8 = 0
                r9 = 0
                r11 = 0
                r1 = r3
                r3 = r4
                r4 = r7
                r7 = r8
                r8 = r9
                r9 = r11
                r11 = r25
                SC.L.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r25.P()
            L_0x0112:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x011b
                U0.C4895p.R()
            L_0x011b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qr.i.a.c(l0.b, boolean, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            c((C5507b) obj, ((Boolean) obj2).booleanValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f101968a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f101969b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f101970c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f101971d;

        b(boolean z10, boolean z11, boolean z12, C17642l<? super Boolean, C16807N> lVar) {
            this.f101968a = z10;
            this.f101969b = z11;
            this.f101970c = z12;
            this.f101971d = lVar;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$BaseRewardCard");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1518696331, i10, -1, "com.ingka.ikea.familyrewards.presentation.card.RedeemableRewardCard.<anonymous> (RedeemableRewardCard.kt:78)");
                }
                i.d(this.f101968a, this.f101969b, this.f101970c, this.f101971d, mVar, 0);
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

    /* access modifiers changed from: private */
    public static final void d(boolean z10, boolean z11, boolean z12, C17642l<? super Boolean, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        boolean z13 = z11;
        boolean z14 = z12;
        C17642l<? super Boolean, C16807N> lVar2 = lVar;
        int i12 = i10;
        C4889m k10 = mVar.k(941144954);
        boolean z15 = z10;
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z15) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z14) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(941144954, i11, -1, "com.ingka.ikea.familyrewards.presentation.card.ActionContent (RedeemableRewardCard.kt:94)");
            }
            C5437c f10 = C5437c.f24302a.f();
            Boolean valueOf = Boolean.valueOf(z10);
            k10.W(-1677710578);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new e();
                k10.u(D10);
            }
            k10.P();
            androidx.compose.animation.a.a(valueOf, (d) null, (C17642l) D10, f10, (String) null, (C17642l) null, c.e(-1589520425, true, new a(z13, z14, lVar2), k10, 54), k10, (i11 & 14) | 1576320, 50);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new f(z10, z11, z12, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final l0.i e(androidx.compose.animation.d dVar) {
        C17542s.j(dVar, "$this$AnimatedContent");
        return dVar.c(((Boolean) dVar.a()).booleanValue() ? androidx.compose.animation.a.e(n(), m()) : androidx.compose.animation.a.e(l(), o()), androidx.compose.animation.a.d(false, (p) null, 2, (Object) null));
    }

    /* access modifiers changed from: private */
    public static final C16807N f(boolean z10, boolean z11, boolean z12, C17642l lVar, int i10, C4889m mVar, int i11) {
        d(z10, z11, z12, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(Iq.a.c r21, nI.C17631a<XH.C16807N> r22, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r23, androidx.compose.ui.d r24, boolean r25, boolean r26, boolean r27, U0.C4889m r28, int r29, int r30) {
        /*
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r29
            java.lang.String r0 = "model"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onRedeemClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 1913252940(0x7209ec4c, float:2.7318472E30)
            r1 = r28
            U0.m r13 = r1.k(r0)
            r1 = r30 & 1
            if (r1 == 0) goto L_0x0027
            r1 = r12 | 6
            goto L_0x0040
        L_0x0027:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x003f
            r1 = r12 & 8
            if (r1 != 0) goto L_0x0034
            boolean r1 = r13.V(r9)
            goto L_0x0038
        L_0x0034:
            boolean r1 = r13.F(r9)
        L_0x0038:
            if (r1 == 0) goto L_0x003c
            r1 = 4
            goto L_0x003d
        L_0x003c:
            r1 = 2
        L_0x003d:
            r1 = r1 | r12
            goto L_0x0040
        L_0x003f:
            r1 = r12
        L_0x0040:
            r2 = r30 & 2
            if (r2 == 0) goto L_0x0047
            r1 = r1 | 48
            goto L_0x0057
        L_0x0047:
            r2 = r12 & 48
            if (r2 != 0) goto L_0x0057
            boolean r2 = r13.F(r10)
            if (r2 == 0) goto L_0x0054
            r2 = 32
            goto L_0x0056
        L_0x0054:
            r2 = 16
        L_0x0056:
            r1 = r1 | r2
        L_0x0057:
            r2 = r30 & 4
            if (r2 == 0) goto L_0x005e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r2 = r12 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x006e
            boolean r2 = r13.F(r11)
            if (r2 == 0) goto L_0x006b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r1 = r1 | r2
        L_0x006e:
            r2 = r30 & 8
            if (r2 == 0) goto L_0x0077
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0074:
            r3 = r24
            goto L_0x0089
        L_0x0077:
            r3 = r12 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0074
            r3 = r24
            boolean r4 = r13.V(r3)
            if (r4 == 0) goto L_0x0086
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r1 = r1 | r4
        L_0x0089:
            r4 = r30 & 16
            if (r4 == 0) goto L_0x0092
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x008f:
            r5 = r25
            goto L_0x00a4
        L_0x0092:
            r5 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x008f
            r5 = r25
            boolean r6 = r13.b(r5)
            if (r6 == 0) goto L_0x00a1
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r6
        L_0x00a4:
            r6 = r30 & 32
            r7 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L_0x00ae
            r1 = r1 | r7
        L_0x00ab:
            r7 = r26
            goto L_0x00bf
        L_0x00ae:
            r7 = r7 & r12
            if (r7 != 0) goto L_0x00ab
            r7 = r26
            boolean r8 = r13.b(r7)
            if (r8 == 0) goto L_0x00bc
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r1 = r1 | r8
        L_0x00bf:
            r8 = r30 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            if (r8 == 0) goto L_0x00c9
            r1 = r1 | r15
        L_0x00c6:
            r15 = r27
            goto L_0x00db
        L_0x00c9:
            r15 = r15 & r12
            if (r15 != 0) goto L_0x00c6
            r15 = r27
            boolean r16 = r13.b(r15)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r16
        L_0x00db:
            r16 = 599187(0x92493, float:8.3964E-40)
            r14 = r1 & r16
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r0) goto L_0x00f4
            boolean r0 = r13.l()
            if (r0 != 0) goto L_0x00ec
            goto L_0x00f4
        L_0x00ec:
            r13.L()
            r4 = r3
            r6 = r7
            r7 = r15
            goto L_0x01c1
        L_0x00f4:
            if (r2 == 0) goto L_0x00fa
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r14 = r0
            goto L_0x00fb
        L_0x00fa:
            r14 = r3
        L_0x00fb:
            r0 = 1
            if (r4 == 0) goto L_0x00ff
            r5 = r0
        L_0x00ff:
            r2 = 0
            if (r6 == 0) goto L_0x0103
            r7 = r2
        L_0x0103:
            if (r8 == 0) goto L_0x0106
            r15 = r2
        L_0x0106:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0115
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.familyrewards.presentation.card.RedeemableRewardCard (RedeemableRewardCard.kt:62)"
            r6 = 1913252940(0x7209ec4c, float:2.7318472E30)
            U0.C4895p.S(r6, r1, r3, r4)
        L_0x0115:
            if (r15 == 0) goto L_0x0129
            r3 = 1748446861(0x68372e8d, float:3.460207E24)
            r13.W(r3)
            tK.h r2 = SC.C13575d.a(r13, r2)
            long r2 = r2.u0()
        L_0x0125:
            r13.P()
            goto L_0x0138
        L_0x0129:
            r3 = 1748447874(0x68373282, float:3.460499E24)
            r13.W(r3)
            tK.h r2 = SC.C13575d.a(r13, r2)
            long r2 = r2.m0()
            goto L_0x0125
        L_0x0138:
            r8 = 0
            r16 = 14
            r4 = 0
            r6 = 0
            r17 = 0
            r18 = r1
            r1 = r2
            r3 = r4
            r4 = r6
            r6 = r5
            r5 = r17
            r19 = r6
            r6 = r13
            r20 = r7
            r7 = r8
            r8 = r16
            U0.A1 r8 = l0.u.a(r1, r3, r4, r5, r6, r7, r8)
            if (r15 == 0) goto L_0x015c
            r1 = 2
            float r1 = (float) r1
        L_0x0157:
            float r1 = c2.h.B(r1)
            goto L_0x015e
        L_0x015c:
            float r1 = (float) r0
            goto L_0x0157
        L_0x015e:
            r6 = 0
            r7 = 14
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r13
            U0.A1 r1 = m0.C5534c.c(r1, r2, r3, r4, r5, r6, r7)
            r2 = 8
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            A0.f r4 = A0.g.e(r2)
            float r1 = i(r1)
            long r2 = h(r8)
            n0.g r5 = n0.C5602h.a(r1, r2)
            qr.i$b r1 = new qr.i$b
            r8 = r19
            r7 = r20
            r1.<init>(r15, r8, r7, r11)
            r2 = 54
            r3 = -1518696331(0xffffffffa57a8875, float:-2.1730277E-16)
            c1.a r3 = c1.c.e(r3, r0, r1, r13, r2)
            r0 = r18 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r1 = r18 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r18 >> 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r16 = r0 | r1
            r17 = 0
            r0 = r21
            r1 = r22
            r2 = r14
            r6 = r13
            r18 = r7
            r7 = r16
            r16 = r8
            r8 = r17
            qr.C11812c.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01bb
            U0.C4895p.R()
        L_0x01bb:
            r4 = r14
            r7 = r15
            r5 = r16
            r6 = r18
        L_0x01c1:
            U0.Y0 r13 = r13.n()
            if (r13 == 0) goto L_0x01da
            qr.d r14 = new qr.d
            r0 = r14
            r1 = r21
            r2 = r22
            r3 = r23
            r8 = r29
            r9 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.a(r14)
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qr.i.g(Iq.a$c, nI.a, nI.l, androidx.compose.ui.d, boolean, boolean, boolean, U0.m, int, int):void");
    }

    private static final long h(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    private static final float i(A1<h> a12) {
        return a12.getValue().G();
    }

    /* access modifiers changed from: private */
    public static final C16807N j(a.c cVar, C17631a aVar, C17642l lVar, d dVar, boolean z10, boolean z11, boolean z12, int i10, int i11, C4889m mVar, int i12) {
        g(cVar, aVar, lVar, dVar, z10, z11, z12, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final androidx.compose.animation.i l() {
        C5559o0<Float> o0Var = f101963a;
        return g.s(o0Var, 0.0f, f101964b, 2, (Object) null).c(g.o(o0Var, 0.0f, 2, (Object) null));
    }

    private static final k m() {
        C5559o0<Float> o0Var = f101963a;
        return g.u(o0Var, 0.0f, f101964b, 2, (Object) null).c(g.q(o0Var, 0.0f, 2, (Object) null));
    }

    private static final androidx.compose.animation.i n() {
        C5559o0<Float> o0Var = f101963a;
        return g.s(o0Var, 0.0f, 0, 6, (Object) null).c(g.o(o0Var, 0.0f, 2, (Object) null));
    }

    private static final k o() {
        C5559o0<Float> o0Var = f101963a;
        return g.u(o0Var, 0.0f, 0, 6, (Object) null).c(g.q(o0Var, 0.0f, 2, (Object) null));
    }
}
