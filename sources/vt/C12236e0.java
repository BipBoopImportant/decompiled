package vt;

import It.C;
import It.C10749l;
import It.q;
import J1.j;
import KJ.C15987c;
import O0.C4725e0;
import O0.G0;
import SC.C13656x1;
import SC.C13660y1;
import SC.C13664z1;
import SC.J;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5850V;
import s0.C5872r;
import st.c;
import uK.C18146a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ac\u0010\u000e\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0012\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aO\u0010\u0014\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH\u0003¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LKJ/c;", "LIt/C;", "shortcuts", "", "isExpandedWidth", "open", "Lkotlin/Function0;", "LXH/N;", "onDismiss", "Lkotlin/Function1;", "LIt/q;", "action", "LIt/l;", "analyticsAction", "e", "(LKJ/c;ZZLnI/a;LnI/l;LnI/l;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "j", "(LKJ/c;LnI/l;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "g", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vt.e0  reason: case insensitive filesystem */
public final class C12236e0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.e0$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f105575a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15987c<C> f105576b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105577c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<q, C16807N> f105578d;

        a(boolean z10, C15987c<? extends C> cVar, C17642l<? super C10749l, C16807N> lVar, C17642l<? super q, C16807N> lVar2) {
            this.f105575a = z10;
            this.f105576b = cVar;
            this.f105577c = lVar;
            this.f105578d = lVar2;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-480478275, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.ShortcutOverflowBottomSheet.<anonymous> (ShortcutOverflowBottomSheet.kt:54)");
                }
                d j10 = D.j(d.f18749a, h.B((float) 16), h.B((float) 24));
                if (this.f105575a) {
                    mVar.W(-1237829557);
                    C12236e0.g(this.f105576b, this.f105577c, j10, this.f105578d, mVar, 384, 0);
                    mVar.P();
                } else {
                    mVar.W(-1237580596);
                    C12236e0.j(this.f105576b, this.f105577c, j10, this.f105578d, mVar, 384, 0);
                    mVar.P();
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.e0$b */
    static final class b implements nI.q<C5872r, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C> f105579a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<q, C16807N> f105580b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105581c;

        b(C15987c<? extends C> cVar, C17642l<? super q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
            this.f105579a = cVar;
            this.f105580b = lVar;
            this.f105581c = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C c10, C17642l lVar, C17642l lVar2) {
            c10.a(lVar, lVar2);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5872r r11, U0.C4889m r12, int r13) {
            /*
                r10 = this;
                java.lang.String r0 = "$this$FlowRow"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                r11 = r13 & 17
                r0 = 16
                if (r11 != r0) goto L_0x0017
                boolean r11 = r12.l()
                if (r11 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r12.L()
                goto L_0x00aa
            L_0x0017:
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x0026
                r11 = -1
                java.lang.String r0 = "com.ingka.ikea.instore.impl.composables.storeselected.ShortcutsPortrait.<anonymous> (ShortcutOverflowBottomSheet.kt:106)"
                r1 = -1944581309(0xffffffff8c180b43, float:-1.1713043E-31)
                U0.C4895p.S(r1, r13, r11, r0)
            L_0x0026:
                r11 = -212333072(0xfffffffff3580df0, float:-1.7117597E31)
                r12.W(r11)
                KJ.c<It.C> r11 = r10.f105579a
                nI.l<It.q, XH.N> r13 = r10.f105580b
                nI.l<It.l, XH.N> r0 = r10.f105581c
                java.util.Iterator r11 = r11.iterator()
            L_0x0036:
                boolean r1 = r11.hasNext()
                if (r1 == 0) goto L_0x008e
                java.lang.Object r1 = r11.next()
                r2 = r1
                It.C r2 = (It.C) r2
                androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
                r1 = 24
                float r1 = (float) r1
                float r7 = c2.h.B(r1)
                r8 = 7
                r9 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r3, r4, r5, r6, r7, r8, r9)
                r1 = 32250560(0x1ec1ac0, float:8.673109E-38)
                r12.W(r1)
                boolean r1 = r12.F(r2)
                boolean r3 = r12.V(r13)
                r1 = r1 | r3
                boolean r3 = r12.V(r0)
                r1 = r1 | r3
                java.lang.Object r3 = r12.D()
                if (r1 != 0) goto L_0x0077
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x007f
            L_0x0077:
                vt.f0 r3 = new vt.f0
                r3.<init>(r2, r13, r0)
                r12.u(r3)
            L_0x007f:
                r5 = r3
                nI.a r5 = (nI.C17631a) r5
                r12.P()
                r7 = 432(0x1b0, float:6.05E-43)
                r8 = 0
                r3 = 0
                r6 = r12
                vt.Z.d(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x0036
            L_0x008e:
                r12.P()
                androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
                vt.g0 r13 = vt.C12240g0.f105595a
                float r13 = r13.a()
                androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.y(r11, r13)
                r13 = 6
                androidx.compose.foundation.layout.C5077h.a(r11, r12, r13)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x00aa
                U0.C4895p.R()
            L_0x00aa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vt.C12236e0.b.b(s0.r, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5872r) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void e(C15987c<? extends C> cVar, boolean z10, boolean z11, C17631a<C16807N> aVar, C17642l<? super q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15987c<? extends C> cVar2 = cVar;
        boolean z12 = z10;
        C17631a<C16807N> aVar2 = aVar;
        C17642l<? super q, C16807N> lVar3 = lVar;
        C17642l<? super C10749l, C16807N> lVar4 = lVar2;
        int i12 = i10;
        C17542s.j(cVar2, "shortcuts");
        C17542s.j(aVar2, "onDismiss");
        C17542s.j(lVar3, "action");
        C17542s.j(lVar4, "analyticsAction");
        C4889m k10 = mVar.k(1909727483);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(cVar2) : k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z12) ? 32 : 16;
        }
        boolean z13 = z11;
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z13) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(lVar3) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(lVar4) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1909727483, i11, -1, "com.ingka.ikea.instore.impl.composables.storeselected.ShortcutOverflowBottomSheet (ShortcutOverflowBottomSheet.kt:48)");
            }
            mVar2 = k10;
            J.c(z11, new C13656x1.b(j.b(c.f102802r, k10, 0), new C13660y1(C18146a.f148097J2, j.b(Oo.b.f84665i, k10, 0), aVar2), (C13660y1) null), aVar, C5116k1.a(d.f18749a, "ShortcutOverflowBottomSheet"), C4725e0.l(true, (C17642l<? super G0, Boolean>) null, k10, 6, 2), (C13664z1) null, false, 0, 0.0f, C5850V.a(0, 0, 0, 0), c1.c.e(-480478275, true, new a(z12, cVar2, lVar4, lVar3), k10, 54), mVar2, ((i11 >> 6) & 14) | 3072 | (C13656x1.b.f116494d << 3) | ((i11 >> 3) & 896), 6, 480);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C12228a0(cVar, z10, z11, aVar, lVar, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C15987c cVar, boolean z10, boolean z11, C17631a aVar, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        e(cVar, z10, z11, aVar, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(KJ.C15987c<? extends It.C> r23, nI.C17642l<? super It.C10749l, XH.C16807N> r24, androidx.compose.ui.d r25, nI.C17642l<? super It.q, XH.C16807N> r26, U0.C4889m r27, int r28, int r29) {
        /*
            r1 = r23
            r2 = r24
            r4 = r26
            r5 = r28
            r0 = 2
            r3 = 4
            r6 = 8
            r7 = 6
            r8 = -1504834336(0xffffffffa64e0ce0, float:-7.1488056E-16)
            r9 = r27
            U0.m r15 = r9.k(r8)
            r14 = 1
            r9 = r29 & 1
            if (r9 == 0) goto L_0x001e
            r9 = r5 | 6
            goto L_0x0037
        L_0x001e:
            r9 = r5 & 6
            if (r9 != 0) goto L_0x0036
            r9 = r5 & 8
            if (r9 != 0) goto L_0x002b
            boolean r9 = r15.V(r1)
            goto L_0x002f
        L_0x002b:
            boolean r9 = r15.F(r1)
        L_0x002f:
            if (r9 == 0) goto L_0x0033
            r9 = r3
            goto L_0x0034
        L_0x0033:
            r9 = r0
        L_0x0034:
            r9 = r9 | r5
            goto L_0x0037
        L_0x0036:
            r9 = r5
        L_0x0037:
            r0 = r29 & 2
            r13 = 32
            if (r0 == 0) goto L_0x0040
            r9 = r9 | 48
            goto L_0x004f
        L_0x0040:
            r0 = r5 & 48
            if (r0 != 0) goto L_0x004f
            boolean r0 = r15.F(r2)
            if (r0 == 0) goto L_0x004c
            r0 = r13
            goto L_0x004e
        L_0x004c:
            r0 = 16
        L_0x004e:
            r9 = r9 | r0
        L_0x004f:
            r0 = r29 & 4
            if (r0 == 0) goto L_0x0058
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r3 = r25
            goto L_0x006a
        L_0x0058:
            r3 = r5 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0055
            r3 = r25
            boolean r10 = r15.V(r3)
            if (r10 == 0) goto L_0x0067
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r9 = r9 | r10
        L_0x006a:
            r10 = r29 & 8
            r12 = 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0074
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0072:
            r11 = r9
            goto L_0x0084
        L_0x0074:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0072
            boolean r10 = r15.F(r4)
            if (r10 == 0) goto L_0x0080
            r10 = r12
            goto L_0x0082
        L_0x0080:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r9 = r9 | r10
            goto L_0x0072
        L_0x0084:
            r9 = r11 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0098
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x0091
            goto L_0x0098
        L_0x0091:
            r15.L()
            r18 = r15
            goto L_0x01ba
        L_0x0098:
            if (r0 == 0) goto L_0x009d
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x009e
        L_0x009d:
            r0 = r3
        L_0x009e:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00aa
            r3 = -1
            java.lang.String r9 = "com.ingka.ikea.instore.impl.composables.storeselected.ShortcutsLandscape (ShortcutOverflowBottomSheet.kt:127)"
            U0.C4895p.S(r8, r11, r3, r9)
        L_0x00aa:
            r3 = 0
            androidx.compose.foundation.o r17 = androidx.compose.foundation.m.c(r3, r15, r3, r14)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r0
            androidx.compose.ui.d r8 = androidx.compose.foundation.m.b(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r9 = androidx.compose.foundation.layout.C5073d.f18068a
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.foundation.layout.d$f r6 = r9.n(r6)
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$c r9 = r9.l()
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r9, r15, r7)
            int r7 = U0.C4883j.a(r15, r3)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r8)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r3 = r10.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00ef
            U0.C4883j.c()
        L_0x00ef:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00fc
            r15.p(r3)
            goto L_0x00ff
        L_0x00fc:
            r15.t()
        L_0x00ff:
            U0.m r3 = U0.F1.a(r15)
            nI.p r14 = r10.c()
            U0.F1.c(r3, r6, r14)
            nI.p r6 = r10.e()
            U0.F1.c(r3, r9, r6)
            nI.p r6 = r10.b()
            boolean r9 = r3.i()
            if (r9 != 0) goto L_0x0129
            java.lang.Object r9 = r3.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r14)
            if (r9 != 0) goto L_0x0137
        L_0x0129:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r3.u(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.w(r7, r6)
        L_0x0137:
            nI.p r6 = r10.d()
            U0.F1.c(r3, r8, r6)
            s0.N r3 = s0.C5843N.f28726a
            r3 = 340291943(0x14487167, float:1.0119784E-26)
            r15.W(r3)
            java.util.Iterator r3 = r23.iterator()
        L_0x014a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01a8
            java.lang.Object r6 = r3.next()
            r9 = r6
            It.C r9 = (It.C) r9
            r6 = -1564923240(0xffffffffa2b92a98, float:-5.018945E-18)
            r15.W(r6)
            boolean r6 = r15.F(r9)
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != r12) goto L_0x0167
            r7 = 1
            goto L_0x0168
        L_0x0167:
            r7 = 0
        L_0x0168:
            r6 = r6 | r7
            r7 = r11 & 112(0x70, float:1.57E-43)
            if (r7 != r13) goto L_0x016f
            r7 = 1
            goto L_0x0170
        L_0x016f:
            r7 = 0
        L_0x0170:
            r6 = r6 | r7
            java.lang.Object r7 = r15.D()
            if (r6 != 0) goto L_0x017f
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0187
        L_0x017f:
            vt.b0 r7 = new vt.b0
            r7.<init>(r9, r4, r2)
            r15.u(r7)
        L_0x0187:
            r6 = r7
            nI.a r6 = (nI.C17631a) r6
            r15.P()
            r14 = 48
            r7 = 4
            r10 = 0
            r8 = 0
            r16 = r11
            r11 = r8
            r8 = r12
            r12 = r6
            r6 = r13
            r13 = r15
            r17 = 1
            r18 = r15
            r15 = r7
            vt.Z.d(r9, r10, r11, r12, r13, r14, r15)
            r13 = r6
            r12 = r8
            r11 = r16
            r15 = r18
            goto L_0x014a
        L_0x01a8:
            r18 = r15
            r18.P()
            r18.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01b9
            U0.C4895p.R()
        L_0x01b9:
            r3 = r0
        L_0x01ba:
            U0.Y0 r7 = r18.n()
            if (r7 == 0) goto L_0x01d3
            vt.c0 r8 = new vt.c0
            r0 = r8
            r1 = r23
            r2 = r24
            r4 = r26
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.C12236e0.g(KJ.c, nI.l, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C c10, C17642l lVar, C17642l lVar2) {
        c10.a(lVar, lVar2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C15987c cVar, C17642l lVar, d dVar, C17642l lVar2, int i10, int i11, C4889m mVar, int i12) {
        g(cVar, lVar, dVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(KJ.C15987c<? extends It.C> r17, nI.C17642l<? super It.C10749l, XH.C16807N> r18, androidx.compose.ui.d r19, nI.C17642l<? super It.q, XH.C16807N> r20, U0.C4889m r21, int r22, int r23) {
        /*
            r1 = r17
            r2 = r18
            r4 = r20
            r5 = r22
            r0 = -606483554(0xffffffffdbd9cb9e, float:-1.22607899E17)
            r3 = r21
            U0.m r3 = r3.k(r0)
            r6 = r23 & 1
            if (r6 == 0) goto L_0x0018
            r6 = r5 | 6
            goto L_0x0031
        L_0x0018:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0030
            r6 = r5 & 8
            if (r6 != 0) goto L_0x0025
            boolean r6 = r3.V(r1)
            goto L_0x0029
        L_0x0025:
            boolean r6 = r3.F(r1)
        L_0x0029:
            if (r6 == 0) goto L_0x002d
            r6 = 4
            goto L_0x002e
        L_0x002d:
            r6 = 2
        L_0x002e:
            r6 = r6 | r5
            goto L_0x0031
        L_0x0030:
            r6 = r5
        L_0x0031:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0038
            r6 = r6 | 48
            goto L_0x0048
        L_0x0038:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0048
            boolean r7 = r3.F(r2)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r6 = r6 | r7
        L_0x0048:
            r7 = r23 & 4
            if (r7 == 0) goto L_0x0051
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r19
            goto L_0x0063
        L_0x0051:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r19
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r6 = r6 | r9
        L_0x0063:
            r9 = r23 & 8
            if (r9 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007a
            boolean r9 = r3.F(r4)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r6 = r6 | r9
        L_0x007a:
            r9 = r6 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008b
            boolean r9 = r3.l()
            if (r9 != 0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            r3.L()
            goto L_0x00d4
        L_0x008b:
            if (r7 == 0) goto L_0x0091
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r15 = r7
            goto L_0x0092
        L_0x0091:
            r15 = r8
        L_0x0092:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x009e
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.instore.impl.composables.storeselected.ShortcutsPortrait (ShortcutOverflowBottomSheet.kt:100)"
            U0.C4895p.S(r0, r6, r7, r8)
        L_0x009e:
            r0 = 0
            r6 = 0
            r7 = 1
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r15, r0, r7, r6)
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r0 = r0.e()
            vt.e0$b r8 = new vt.e0$b
            r8.<init>(r1, r4, r2)
            r9 = 54
            r10 = -1944581309(0xffffffff8c180b43, float:-1.1713043E-31)
            c1.a r12 = c1.c.e(r10, r7, r8, r3, r9)
            r14 = 1575984(0x180c30, float:2.208424E-39)
            r16 = 52
            r8 = 0
            r9 = 3
            r10 = 0
            r11 = 0
            r7 = r0
            r13 = r3
            r0 = r15
            r15 = r16
            androidx.compose.foundation.layout.p.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00d3
            U0.C4895p.R()
        L_0x00d3:
            r8 = r0
        L_0x00d4:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x00ee
            vt.d0 r9 = new vt.d0
            r0 = r9
            r1 = r17
            r2 = r18
            r3 = r8
            r4 = r20
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r9)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.C12236e0.j(KJ.c, nI.l, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C15987c cVar, C17642l lVar, d dVar, C17642l lVar2, int i10, int i11, C4889m mVar, int i12) {
        j(cVar, lVar, dVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
