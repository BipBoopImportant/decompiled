package Ai;

import Al.d;
import E1.I;
import Ei.C10696q;
import G1.C4504g;
import Hx.c;
import IC.C13023e;
import KJ.C15987c;
import L1.i;
import L1.o;
import L1.x;
import N1.P;
import O0.V;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13585f1;
import SC.C13589g1;
import SC.C13607l;
import SC.C13611m;
import SC.C13643u0;
import SC.R0;
import TC.C13679b;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import g1.C5353v;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5747v0;
import r0.m;
import s0.C5842M;
import s0.C5843N;
import s0.C5862h;
import tK.C18030v;
import uK.C18146a;
import wi.C12272a;

@Metadata(d1 = {"\u0000r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0001\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a=\u0010 \u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\"\u0010\u0018\u001a\u0010.\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010&2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00022\u0006\u0010+\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010,2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b.\u0010/\u001a+\u00102\u001a\u00020\u00062\u0006\u00100\u001a\u00020)2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b2\u00103\u001a!\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\b\u00104\u001a\u0004\u0018\u00010&H\u0003¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"", "orderId", "LKJ/c;", "LEi/q$a;", "deliveryMethods", "Lkotlin/Function2;", "LXH/N;", "viewProductsCallback", "Lkotlin/Function1;", "onItemClicked", "onTrackingLinkClicked", "LHx/c$d$e;", "onRescheduleDeliveryMethod", "Landroidx/compose/ui/d;", "modifier", "p", "(Ljava/lang/String;LKJ/c;LnI/p;LnI/l;LnI/l;LnI/p;Landroidx/compose/ui/d;LU0/m;II)V", "", "index", "LEi/q$a$b;", "location", "v", "(ILEi/q$a$b;LU0/m;I)V", "t", "(LU0/m;I)V", "LEi/q$a$a;", "header", "", "isExpandable", "isSectionExpanded", "Lkotlin/Function0;", "onHeaderClicked", "l", "(ILEi/q$a$a;ZZLnI/a;LU0/m;I)V", "n", "testTag", "LAl/d;", "trackingStatus", "LIC/e;", "title", "message", "LEi/q$a$c$a;", "tracking", "isLastStep", "LEi/q$a$d;", "deliveryMethodReschedule", "y", "(Ljava/lang/String;LAl/d;LIC/e;LIC/e;LKJ/c;ZLEi/q$a$d;LnI/l;LnI/p;LU0/m;I)V", "trackingLink", "onLinkClicked", "A", "(LEi/q$a$c$a;LnI/l;LU0/m;I)V", "titlePrefix", "E", "(LIC/e;LIC/e;LU0/m;I)Ljava/lang/String;", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C10696q.a.c.C1532a> f78434a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f78435b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C10696q.a.d f78436c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f78437d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<String, c.d.e, C16807N> f78438e;

        a(C15987c<C10696q.a.c.C1532a> cVar, d dVar, C10696q.a.d dVar2, C17642l<? super String, C16807N> lVar, p<? super String, ? super c.d.e, C16807N> pVar) {
            this.f78434a = cVar;
            this.f78435b = dVar;
            this.f78436c = dVar2;
            this.f78437d = lVar;
            this.f78438e = pVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(p pVar, C10696q.a.d dVar) {
            pVar.invoke(dVar.b(), dVar.a());
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r17, int r18) {
            /*
                r16 = this;
                r0 = r16
                r11 = r17
                r1 = r18
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0017
                boolean r2 = r17.l()
                if (r2 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r17.L()
                goto L_0x00d4
            L_0x0017:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0026
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.OrderTrackingStep.<anonymous> (OrderTracking.kt:340)"
                r4 = -329548635(0xffffffffec5b7ca5, float:-1.0613735E27)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0026:
                r1 = 1962478341(0x74f90b05, float:1.5784978E32)
                r11.W(r1)
                KJ.c<Ei.q$a$c$a> r1 = r0.f78434a
                nI.l<java.lang.String, XH.N> r2 = r0.f78437d
                java.util.Iterator r1 = r1.iterator()
            L_0x0034:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0046
                java.lang.Object r3 = r1.next()
                Ei.q$a$c$a r3 = (Ei.C10696q.a.c.C1532a) r3
                int r4 = IC.C13023e.f110931a
                Ai.C0.A(r3, r2, r11, r4)
                goto L_0x0034
            L_0x0046:
                r17.P()
                Al.d r1 = r0.f78435b
                Al.d r2 = Al.d.ACTIVE
                if (r1 != r2) goto L_0x00b8
                Ei.q$a$d r1 = r0.f78436c
                if (r1 != 0) goto L_0x0055
                goto L_0x00cb
            L_0x0055:
                nI.p<java.lang.String, Hx.c$d$e, XH.N> r2 = r0.f78438e
                androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
                r4 = 8
                float r4 = (float) r4
                float r5 = c2.h.B(r4)
                r8 = 13
                r9 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r3, r4, r5, r6, r7, r8, r9)
                int r4 = wi.C12272a.f105796Z
                r5 = 0
                java.lang.String r4 = J1.j.b(r4, r11, r5)
                SC.N r5 = SC.N.Secondary
                SC.M r6 = SC.M.Small
                r7 = -1419022949(0xffffffffab6b6d9b, float:-8.364088E-13)
                r11.W(r7)
                boolean r7 = r11.V(r2)
                boolean r8 = r11.F(r1)
                r7 = r7 | r8
                java.lang.Object r8 = r17.D()
                if (r7 != 0) goto L_0x0092
                U0.m$a r7 = U0.C4889m.f14007a
                java.lang.Object r7 = r7.a()
                if (r8 != r7) goto L_0x009a
            L_0x0092:
                Ai.B0 r8 = new Ai.B0
                r8.<init>(r2, r1)
                r11.u(r8)
            L_0x009a:
                r10 = r8
                nI.a r10 = (nI.C17631a) r10
                r17.P()
                r12 = 27696(0x6c30, float:3.881E-41)
                r13 = 484(0x1e4, float:6.78E-43)
                r7 = 0
                r8 = 0
                r9 = 0
                r14 = 0
                r15 = 0
                r1 = r4
                r2 = r3
                r3 = r7
                r4 = r5
                r5 = r6
                r6 = r8
                r7 = r9
                r8 = r14
                r9 = r15
                r11 = r17
                SC.L.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x00cb
            L_0x00b8:
                Al.d r2 = Al.d.PAST
                if (r1 == r2) goto L_0x00cb
                Al.d r2 = Al.d.FUTURE
                if (r1 == r2) goto L_0x00cb
                Al.d r2 = Al.d.WARNING
                if (r1 != r2) goto L_0x00c5
                goto L_0x00cb
            L_0x00c5:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x00cb:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00d4
                U0.C4895p.R()
            L_0x00d4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.C0.a.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13023e f78439a;

        b(C13023e eVar) {
            this.f78439a = eVar;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2072468407, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.TrackingDetails.<anonymous>.<anonymous>.<anonymous> (OrderTracking.kt:393)");
                }
                C13607l.j(this.f78439a.a(mVar2, C13023e.f110931a), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, C18030v.f147664a.a(mVar2, C18030v.f147665b).I0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262132);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A(Ei.C10696q.a.c.C1532a r34, nI.C17642l<? super java.lang.String, XH.C16807N> r35, U0.C4889m r36, int r37) {
        /*
            r0 = r34
            r1 = r35
            r2 = r37
            r3 = 48
            r4 = 8
            r5 = -1760207941(0xffffffff97155bbb, float:-4.8260277E-25)
            r6 = r36
            U0.m r15 = r6.k(r5)
            r6 = r2 & 6
            if (r6 != 0) goto L_0x002b
            r6 = r2 & 8
            if (r6 != 0) goto L_0x0020
            boolean r6 = r15.V(r0)
            goto L_0x0024
        L_0x0020:
            boolean r6 = r15.F(r0)
        L_0x0024:
            if (r6 == 0) goto L_0x0028
            r6 = 4
            goto L_0x0029
        L_0x0028:
            r6 = 2
        L_0x0029:
            r6 = r6 | r2
            goto L_0x002c
        L_0x002b:
            r6 = r2
        L_0x002c:
            r7 = r2 & 48
            r14 = 32
            if (r7 != 0) goto L_0x003d
            boolean r7 = r15.F(r1)
            if (r7 == 0) goto L_0x003a
            r7 = r14
            goto L_0x003c
        L_0x003a:
            r7 = 16
        L_0x003c:
            r6 = r6 | r7
        L_0x003d:
            r13 = r6
            r6 = r13 & 19
            r7 = 18
            if (r6 != r7) goto L_0x0051
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            r15.L()
            r4 = r15
            goto L_0x01f5
        L_0x0051:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x005d
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.TrackingDetails (OrderTracking.kt:380)"
            U0.C4895p.S(r5, r13, r6, r7)
        L_0x005d:
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            float r4 = (float) r4
            float r18 = c2.h.B(r4)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r5
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r7.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r8 = r8.k()
            r11 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r15, r11)
            int r8 = U0.C4883j.a(r15, r11)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r12 = r10.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00a0
            U0.C4883j.c()
        L_0x00a0:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00ad
            r15.p(r12)
            goto L_0x00b0
        L_0x00ad:
            r15.t()
        L_0x00b0:
            U0.m r12 = U0.F1.a(r15)
            nI.p r11 = r10.c()
            U0.F1.c(r12, r7, r11)
            nI.p r7 = r10.e()
            U0.F1.c(r12, r9, r7)
            nI.p r7 = r10.b()
            boolean r9 = r12.i()
            if (r9 != 0) goto L_0x00da
            java.lang.Object r9 = r12.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x00e8
        L_0x00da:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.w(r8, r7)
        L_0x00e8:
            nI.p r7 = r10.d()
            U0.F1.c(r12, r6, r7)
            s0.h r6 = s0.C5862h.f28810a
            IC.e r6 = r34.a()
            r7 = 1604524047(0x5fa3180f, float:2.350432E19)
            r15.W(r7)
            if (r6 != 0) goto L_0x0104
            r33 = r13
            r36 = r15
            r32 = 0
            goto L_0x0149
        L_0x0104:
            int r7 = IC.C13023e.f110931a
            java.lang.String r6 = r6.a(r15, r7)
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            tK.v r8 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r8 = r8.a(r15, r9)
            long r9 = r8.I0()
            r30 = 0
            r31 = 262132(0x3fff4, float:3.67325E-40)
            r8 = 0
            r11 = 0
            r32 = 0
            r16 = 0
            r33 = r13
            r13 = r16
            r14 = r16
            r36 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 48
            r28 = r36
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0149:
            r36.P()
            IC.e r6 = r34.c()
            r7 = 1604531282(0x5fa33452, float:2.352023E19)
            r15 = r36
            r15.W(r7)
            r11 = 1
            if (r6 != 0) goto L_0x015c
            goto L_0x016e
        L_0x015c:
            Ai.C0$b r7 = new Ai.C0$b
            r7.<init>(r6)
            r6 = 54
            r8 = 2072468407(0x7b875bb7, float:1.4056405E36)
            c1.a r6 = c1.c.e(r8, r11, r7, r15, r6)
            r7 = 0
            H0.C4545x.b(r7, r6, r15, r3, r11)
        L_0x016e:
            r15.P()
            Ei.q$a$c$a$a r3 = r34.b()
            r6 = 1604540491(0x5fa3584b, float:2.354048E19)
            r15.W(r6)
            if (r3 != 0) goto L_0x017f
            r4 = r15
            goto L_0x01e6
        L_0x017f:
            float r18 = c2.h.B(r4)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r5
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            IC.e r4 = r3.a()
            int r5 = IC.C13023e.f110931a
            java.lang.String r6 = r4.a(r15, r5)
            int r4 = uK.C18146a.f147996C6
            SC.N r9 = SC.N.Secondary
            SC.M r10 = SC.M.Small
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r4 = -1495024760(0xffffffffa6e3bb88, float:-1.580212E-15)
            r15.W(r4)
            r4 = r33 & 112(0x70, float:1.57E-43)
            r5 = 32
            if (r4 != r5) goto L_0x01b4
            goto L_0x01b6
        L_0x01b4:
            r11 = r32
        L_0x01b6:
            boolean r4 = r15.F(r3)
            r4 = r4 | r11
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x01c9
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x01d1
        L_0x01c9:
            Ai.A0 r5 = new Ai.A0
            r5.<init>(r1, r3)
            r15.u(r5)
        L_0x01d1:
            r3 = r5
            nI.a r3 = (nI.C17631a) r3
            r15.P()
            r17 = 27696(0x6c30, float:3.881E-41)
            r18 = 420(0x1a4, float:5.89E-43)
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r4 = r15
            r15 = r3
            r16 = r4
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x01e6:
            r4.P()
            r4.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01f5
            U0.C4895p.R()
        L_0x01f5:
            U0.Y0 r3 = r4.n()
            if (r3 == 0) goto L_0x0203
            Ai.r0 r4 = new Ai.r0
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C0.A(Ei.q$a$c$a, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C17642l lVar, C10696q.a.c.C1532a.C1533a aVar) {
        lVar.invoke(aVar.b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C10696q.a.c.C1532a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        A(aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final String E(C13023e eVar, C13023e eVar2, C4889m mVar, int i10) {
        mVar.W(494838916);
        if (C4895p.J()) {
            C4895p.S(494838916, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.formatDeliveryTitle (OrderTracking.kt:464)");
        }
        StringBuilder sb2 = new StringBuilder();
        mVar.W(1452806336);
        String a10 = eVar2 == null ? null : eVar2.a(mVar, C13023e.f110931a | ((i10 >> 3) & 14));
        mVar.P();
        if (a10 != null) {
            sb2.append(a10);
            sb2.append(" ");
        }
        sb2.append(eVar.a(mVar, C13023e.f110931a | (i10 & 14)));
        String sb3 = sb2.toString();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return sb3;
    }

    private static final void l(int i10, C10696q.a.C1531a aVar, boolean z10, boolean z11, C17631a<C16807N> aVar2, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        Integer num;
        C4889m mVar3;
        int i13 = i10;
        C10696q.a.C1531a aVar3 = aVar;
        boolean z12 = z10;
        boolean z13 = z11;
        int i14 = i11;
        C4889m k10 = mVar.k(-560770092);
        if ((i14 & 6) == 0) {
            i12 = (k10.d(i13) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= (i14 & 64) == 0 ? k10.V(aVar3) : k10.F(aVar3) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i12 |= k10.b(z12) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i12 |= k10.b(z13) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C17631a<C16807N> aVar4 = aVar2;
        if ((i14 & 24576) == 0) {
            i12 |= k10.F(aVar4) ? 16384 : 8192;
        }
        if ((i12 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-560770092, i12, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.DeliveryMethodHeader (OrderTracking.kt:207)");
            }
            C13023e a10 = aVar.a();
            k10.W(814747555);
            String a11 = a10 == null ? null : a10.a(k10, C13023e.f110931a);
            k10.P();
            int c10 = aVar.c();
            C13023e d10 = aVar.d();
            C13023e e10 = aVar.e();
            int i15 = C13023e.f110931a;
            String E10 = E(d10, e10, k10, (i15 << 3) | i15);
            C13023e b10 = aVar.b();
            k10.W(814754083);
            String a12 = b10 == null ? null : b10.a(k10, i15);
            k10.P();
            androidx.compose.ui.d d11 = z12 ? androidx.compose.foundation.d.d(androidx.compose.ui.d.f18749a, false, (String) null, (i) null, aVar2, 7, (Object) null) : androidx.compose.ui.d.f18749a;
            if (!z12) {
                num = null;
            } else {
                num = z13 ? Integer.valueOf(C18146a.f148171O1) : Integer.valueOf(C18146a.f148036F1);
            }
            D0 d02 = D0.f78440a;
            float f10 = (float) 24;
            androidx.compose.ui.d k11 = D.k(e.i(J.h(C5116k1.a(d11, d02.d(i13)), 0.0f, 1, (Object) null)), 0.0f, h.B(f10), 1, (Object) null);
            C5437c.a aVar5 = C5437c.f24302a;
            C5437c.C0386c i16 = aVar5.i();
            C5073d dVar = C5073d.f18068a;
            I b11 = G.b(dVar.f(), i16, k10, 48);
            int a13 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, k11);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a14 = aVar6.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a14);
            } else {
                k10.t();
            }
            C4889m a15 = F1.a(k10);
            F1.c(a15, b11, aVar6.c());
            F1.c(a15, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b12 = aVar6.b();
            if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.w(Integer.valueOf(a13), b12);
            }
            F1.c(a15, e11, aVar6.d());
            C5843N n10 = C5843N.f28726a;
            d.a aVar7 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d c11 = n10.c(J.y(aVar7, h.B(f10)), aVar5.l());
            I h10 = C5077h.h(aVar5.o(), false);
            int a16 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, c11);
            C17631a<C4504g> a17 = aVar6.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a17);
            } else {
                k10.t();
            }
            C4889m a18 = F1.a(k10);
            F1.c(a18, h10, aVar6.c());
            F1.c(a18, s11, aVar6.e());
            p<C4504g, Integer, C16807N> b13 = aVar6.b();
            if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.w(Integer.valueOf(a16), b13);
            }
            F1.c(a18, e12, aVar6.d());
            C5079j jVar = C5079j.f18125a;
            D0 d03 = d02;
            float f11 = f10;
            V.a(J1.e.c(c10, k10, 0), (String) null, (androidx.compose.ui.d) null, 0, k10, 48, 12);
            k10.x();
            androidx.compose.ui.d c12 = n10.c(D.m(C5842M.e(n10, aVar7, 1.0f, false, 2, (Object) null), h.B((float) 16), 0.0f, 0.0f, 0.0f, 14, (Object) null), aVar5.l());
            I a19 = C5080k.a(dVar.g(), aVar5.k(), k10, 0);
            int a20 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, c12);
            C17631a<C4504g> a21 = aVar6.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a21);
            } else {
                k10.t();
            }
            C4889m a22 = F1.a(k10);
            F1.c(a22, a19, aVar6.c());
            F1.c(a22, s12, aVar6.e());
            p<C4504g, Integer, C16807N> b14 = aVar6.b();
            if (a22.i() || !C17542s.e(a22.D(), Integer.valueOf(a20))) {
                a22.u(Integer.valueOf(a20));
                a22.w(Integer.valueOf(a20), b14);
            }
            F1.c(a22, e13, aVar6.d());
            C5862h hVar = C5862h.f28810a;
            D0 d04 = d03;
            androidx.compose.ui.d a23 = C5116k1.a(aVar7, d04.c(i13));
            C13679b.C2857b.f fVar = C13679b.C2857b.f.f116688a;
            C4889m mVar4 = k10;
            C13607l.j(E10, fVar, a23, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, 48, 0, 262136);
            C4889m mVar5 = mVar4;
            mVar5.W(-1216873044);
            if (a12 == null) {
                mVar3 = mVar5;
            } else {
                mVar3 = mVar5;
                C13607l.j(a12, fVar, C5116k1.a(aVar7, d04.b(i13)), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262136);
                C16807N n11 = C16807N.f139792a;
            }
            mVar3.P();
            C4889m mVar6 = mVar3;
            mVar6.W(-1216862187);
            if (a11 == null) {
                mVar2 = mVar6;
            } else {
                androidx.compose.ui.d m10 = D.m(C5116k1.a(aVar7, d04.a(i13)), 0.0f, h.B((float) 8), 0.0f, 0.0f, 13, (Object) null);
                mVar2 = mVar6;
                C13607l.j(a11, C13679b.a.C2856b.f116680a, m10, C18030v.f147664a.a(mVar6, C18030v.f147665b).I0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262128);
                C16807N n12 = C16807N.f139792a;
            }
            mVar2.P();
            mVar2.x();
            mVar2.W(780907831);
            if (num != null) {
                int intValue = num.intValue();
                androidx.compose.ui.d y10 = J.y(aVar7, h.B(f11));
                I h11 = C5077h.h(aVar5.o(), false);
                int a24 = C4883j.a(mVar2, 0);
                C4912y s13 = mVar2.s();
                androidx.compose.ui.d e14 = androidx.compose.ui.c.e(mVar2, y10);
                C17631a<C4504g> a25 = aVar6.a();
                if (mVar2.m() == null) {
                    C4883j.c();
                }
                mVar2.I();
                if (mVar2.i()) {
                    mVar2.p(a25);
                } else {
                    mVar2.t();
                }
                C4889m a26 = F1.a(mVar2);
                F1.c(a26, h11, aVar6.c());
                F1.c(a26, s13, aVar6.e());
                p<C4504g, Integer, C16807N> b15 = aVar6.b();
                if (a26.i() || !C17542s.e(a26.D(), Integer.valueOf(a24))) {
                    a26.u(Integer.valueOf(a24));
                    a26.w(Integer.valueOf(a24), b15);
                }
                F1.c(a26, e14, aVar6.d());
                V.a(J1.e.c(intValue, mVar2, 0), (String) null, (androidx.compose.ui.d) null, 0, mVar2, 48, 12);
                mVar2.x();
                C16807N n13 = C16807N.f139792a;
            }
            mVar2.P();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n14 = mVar2.n();
        if (n14 != null) {
            n14.a(new C10608u0(i10, aVar, z10, z11, aVar2, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m(int i10, C10696q.a.C1531a aVar, boolean z10, boolean z11, C17631a aVar2, int i11, C4889m mVar, int i12) {
        l(i10, aVar, z10, z11, aVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    private static final void n(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(1970253483);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1970253483, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.MultipleDeliveriesDisclaimer (OrderTracking.kt:300)");
            }
            R0.e(J1.j.b(C12272a.f105747A0, k10, 0), C13611m.INFORMATIVE, false, e.i(C5116k1.a(androidx.compose.ui.d.f18749a, "SPLIT_DELIVERY_MESSAGE_TEST_TAG")), J1.j.b(C12272a.f105749B0, k10, 0), false, k10, 432, 32);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10610v0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(int i10, C4889m mVar, int i11) {
        n(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: g1.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(java.lang.String r28, KJ.C15987c<Ei.C10696q.a> r29, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r30, nI.C17642l<? super java.lang.String, XH.C16807N> r31, nI.C17642l<? super java.lang.String, XH.C16807N> r32, nI.p<? super java.lang.String, ? super Hx.c.d.e, XH.C16807N> r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r1 = r28
            r2 = r29
            r3 = r30
            r12 = r31
            r0 = r32
            r11 = r33
            r10 = r36
            r4 = 16
            r5 = 32
            r6 = 2
            java.lang.String r7 = "orderId"
            kotlin.jvm.internal.C17542s.j(r1, r7)
            java.lang.String r7 = "deliveryMethods"
            kotlin.jvm.internal.C17542s.j(r2, r7)
            java.lang.String r7 = "viewProductsCallback"
            kotlin.jvm.internal.C17542s.j(r3, r7)
            java.lang.String r7 = "onItemClicked"
            kotlin.jvm.internal.C17542s.j(r12, r7)
            java.lang.String r7 = "onTrackingLinkClicked"
            kotlin.jvm.internal.C17542s.j(r0, r7)
            java.lang.String r7 = "onRescheduleDeliveryMethod"
            kotlin.jvm.internal.C17542s.j(r11, r7)
            r7 = 1571865744(0x5db0c490, float:1.592183E18)
            r8 = r35
            U0.m r9 = r8.k(r7)
            r8 = 1
            r13 = r37 & 1
            r15 = 4
            if (r13 == 0) goto L_0x0043
            r13 = r10 | 6
            goto L_0x0053
        L_0x0043:
            r13 = r10 & 6
            if (r13 != 0) goto L_0x0052
            boolean r13 = r9.V(r1)
            if (r13 == 0) goto L_0x004f
            r13 = r15
            goto L_0x0050
        L_0x004f:
            r13 = r6
        L_0x0050:
            r13 = r13 | r10
            goto L_0x0053
        L_0x0052:
            r13 = r10
        L_0x0053:
            r6 = r37 & 2
            if (r6 == 0) goto L_0x005a
            r13 = r13 | 48
            goto L_0x0068
        L_0x005a:
            r6 = r10 & 48
            if (r6 != 0) goto L_0x0068
            boolean r6 = r9.F(r2)
            if (r6 == 0) goto L_0x0066
            r6 = r5
            goto L_0x0067
        L_0x0066:
            r6 = r4
        L_0x0067:
            r13 = r13 | r6
        L_0x0068:
            r6 = r37 & 4
            if (r6 == 0) goto L_0x006f
            r13 = r13 | 384(0x180, float:5.38E-43)
            goto L_0x007f
        L_0x006f:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x007f
            boolean r6 = r9.F(r3)
            if (r6 == 0) goto L_0x007c
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x007e
        L_0x007c:
            r6 = 128(0x80, float:1.794E-43)
        L_0x007e:
            r13 = r13 | r6
        L_0x007f:
            r6 = r37 & 8
            if (r6 == 0) goto L_0x0086
            r13 = r13 | 3072(0xc00, float:4.305E-42)
            goto L_0x0096
        L_0x0086:
            r6 = r10 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0096
            boolean r6 = r9.F(r12)
            if (r6 == 0) goto L_0x0093
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0095
        L_0x0093:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0095:
            r13 = r13 | r6
        L_0x0096:
            r4 = r37 & 16
            if (r4 == 0) goto L_0x009d
            r13 = r13 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ad
        L_0x009d:
            r4 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x00ad
            boolean r4 = r9.F(r0)
            if (r4 == 0) goto L_0x00aa
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ac
        L_0x00aa:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00ac:
            r13 = r13 | r4
        L_0x00ad:
            r4 = r37 & 32
            r5 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00b5
            r13 = r13 | r5
            goto L_0x00c5
        L_0x00b5:
            r4 = r10 & r5
            if (r4 != 0) goto L_0x00c5
            boolean r4 = r9.F(r11)
            if (r4 == 0) goto L_0x00c2
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r13 = r13 | r4
        L_0x00c5:
            r4 = r37 & 64
            r5 = 1572864(0x180000, float:2.204052E-39)
            if (r4 == 0) goto L_0x00d0
            r13 = r13 | r5
        L_0x00cc:
            r5 = r34
        L_0x00ce:
            r6 = r13
            goto L_0x00e2
        L_0x00d0:
            r5 = r5 & r10
            if (r5 != 0) goto L_0x00cc
            r5 = r34
            boolean r6 = r9.V(r5)
            if (r6 == 0) goto L_0x00de
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r13 = r13 | r6
            goto L_0x00ce
        L_0x00e2:
            r13 = 599187(0x92493, float:8.3964E-40)
            r13 = r13 & r6
            r14 = 599186(0x92492, float:8.39638E-40)
            if (r13 != r14) goto L_0x00f9
            boolean r13 = r9.l()
            if (r13 != 0) goto L_0x00f2
            goto L_0x00f9
        L_0x00f2:
            r9.L()
            r7 = r5
            r14 = r9
            goto L_0x046d
        L_0x00f9:
            if (r4 == 0) goto L_0x00fe
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r5 = r4
        L_0x00fe:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x010a
            r4 = -1
            java.lang.String r13 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.OrderTrackingContent (OrderTracking.kt:70)"
            U0.C4895p.S(r7, r6, r4, r13)
        L_0x010a:
            r4 = 0
            r7 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r5, r4, r8, r7)
            androidx.compose.foundation.layout.d r13 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r13 = r13.g()
            i1.c$a r14 = i1.C5437c.f24302a
            i1.c$b r14 = r14.k()
            r11 = 0
            E1.I r13 = androidx.compose.foundation.layout.C5080k.a(r13, r14, r9, r11)
            int r14 = U0.C4883j.a(r9, r11)
            U0.y r7 = r9.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r9, r4)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r15 = r16.a()
            U0.f r18 = r9.m()
            if (r18 != 0) goto L_0x013c
            U0.C4883j.c()
        L_0x013c:
            r9.I()
            boolean r18 = r9.i()
            if (r18 == 0) goto L_0x0149
            r9.p(r15)
            goto L_0x014c
        L_0x0149:
            r9.t()
        L_0x014c:
            U0.m r15 = U0.F1.a(r9)
            nI.p r11 = r16.c()
            U0.F1.c(r15, r13, r11)
            nI.p r11 = r16.e()
            U0.F1.c(r15, r7, r11)
            nI.p r7 = r16.b()
            boolean r11 = r15.i()
            if (r11 != 0) goto L_0x0176
            java.lang.Object r11 = r15.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r13)
            if (r11 != 0) goto L_0x0184
        L_0x0176:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r15.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r15.w(r11, r7)
        L_0x0184:
            nI.p r7 = r16.d()
            U0.F1.c(r15, r4, r7)
            s0.h r4 = s0.C5862h.f28810a
            r4 = -501817505(0xffffffffe216df5f, float:-6.957768E20)
            r9.W(r4)
            java.util.Iterator r4 = r29.iterator()
            r7 = 0
        L_0x0198:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x01f6
            java.lang.Object r11 = r4.next()
            int r22 = r7 + 1
            if (r7 >= 0) goto L_0x01a9
            YH.C16877v.x()
        L_0x01a9:
            Ei.q$a r11 = (Ei.C10696q.a) r11
            zi.a r11 = r11.b()
            r13 = -501815159(0xffffffffe216e889, float:-6.959419E20)
            r9.W(r13)
            if (r11 != 0) goto L_0x01ba
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x01f0
        L_0x01ba:
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            Ai.D0 r14 = Ai.D0.f78440a
            java.lang.String r7 = r14.e(r7)
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r13, r7)
            androidx.compose.ui.d r16 = TC.e.i(r7)
            int r7 = r11.b()
            r13 = 0
            java.lang.String r7 = J1.j.b(r7, r9, r13)
            int r11 = r11.a()
            java.lang.String r11 = J1.j.b(r11, r9, r13)
            SC.m r14 = SC.C13611m.NEGATIVE
            r20 = 432(0x1b0, float:6.05E-43)
            r21 = 32
            r15 = 1
            r18 = 0
            r13 = r11
            r11 = 256(0x100, float:3.59E-43)
            r17 = r7
            r19 = r9
            SC.R0.e(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            XH.N r7 = XH.C16807N.f139792a
        L_0x01f0:
            r9.P()
            r7 = r22
            goto L_0x0198
        L_0x01f6:
            r11 = 256(0x100, float:3.59E-43)
            r9.P()
            int r4 = r29.size()
            if (r4 <= r8) goto L_0x0203
            r7 = r8
            goto L_0x0204
        L_0x0203:
            r7 = 0
        L_0x0204:
            r4 = -501795173(0xffffffffe217369b, float:-6.973483E20)
            r9.W(r4)
            if (r7 == 0) goto L_0x0210
            r4 = 0
            n(r9, r4)
        L_0x0210:
            r9.P()
            r4 = -501791505(0xffffffffe21744ef, float:-6.976064E20)
            r9.W(r4)
            boolean r4 = r9.V(r2)
            java.lang.Object r13 = r9.D()
            if (r4 != 0) goto L_0x022b
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r13 != r4) goto L_0x0264
        L_0x022b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r13 = 10
            int r13 = YH.C16877v.y(r2, r13)
            r4.<init>(r13)
            java.util.Iterator r13 = r29.iterator()
            r14 = 0
        L_0x023b:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x025d
            java.lang.Object r15 = r13.next()
            int r16 = r14 + 1
            if (r14 >= 0) goto L_0x024c
            YH.C16877v.x()
        L_0x024c:
            Ei.q$a r15 = (Ei.C10696q.a) r15
            if (r14 != 0) goto L_0x0252
            r14 = r8
            goto L_0x0253
        L_0x0252:
            r14 = 0
        L_0x0253:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r4.add(r14)
            r14 = r16
            goto L_0x023b
        L_0x025d:
            g1.v r13 = U0.p1.t(r4)
            r9.u(r13)
        L_0x0264:
            r4 = r13
            g1.v r4 = (g1.C5353v) r4
            r9.P()
            r13 = -501782026(0xffffffffe21769f6, float:-6.982734E20)
            r9.W(r13)
            java.util.Iterator r24 = r29.iterator()
            r15 = 0
        L_0x0275:
            boolean r13 = r24.hasNext()
            if (r13 == 0) goto L_0x045b
            java.lang.Object r13 = r24.next()
            int r25 = r15 + 1
            if (r15 >= 0) goto L_0x0286
            YH.C16877v.x()
        L_0x0286:
            r14 = r13
            Ei.q$a r14 = (Ei.C10696q.a) r14
            java.lang.Object r13 = r4.get(r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x029a
            if (r7 != 0) goto L_0x0298
            goto L_0x029a
        L_0x0298:
            r13 = 0
            goto L_0x029b
        L_0x029a:
            r13 = r8
        L_0x029b:
            Ei.q$a$a r16 = r14.c()
            r11 = 1212648011(0x48478a4b, float:204329.17)
            r9.W(r11)
            boolean r11 = r9.V(r4)
            boolean r17 = r9.d(r15)
            r11 = r11 | r17
            boolean r17 = r9.b(r13)
            r11 = r11 | r17
            boolean r17 = r9.b(r7)
            r11 = r11 | r17
            java.lang.Object r8 = r9.D()
            if (r11 != 0) goto L_0x02c9
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r8 != r11) goto L_0x02d1
        L_0x02c9:
            Ai.q0 r8 = new Ai.q0
            r8.<init>(r4, r15, r13, r7)
            r9.u(r8)
        L_0x02d1:
            r17 = r8
            nI.a r17 = (nI.C17631a) r17
            r9.P()
            int r8 = IC.C13023e.f110931a
            int r19 = r8 << 3
            r8 = r13
            r13 = r15
            r11 = r14
            r14 = r16
            r0 = r15
            r15 = r7
            r16 = r8
            r18 = r9
            l(r13, r14, r15, r16, r17, r18, r19)
            r13 = -501764459(0xffffffffe217ae95, float:-6.995096E20)
            r9.W(r13)
            if (r8 == 0) goto L_0x0433
            r8 = 1212654682(0x4847a45a, float:204433.4)
            r9.W(r8)
            java.util.List r8 = r11.g()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r13 = 0
        L_0x0303:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x0373
            java.lang.Object r14 = r8.next()
            r26 = 1
            int r27 = r13 + 1
            if (r13 >= 0) goto L_0x0316
            YH.C16877v.x()
        L_0x0316:
            Ei.q$a$c r14 = (Ei.C10696q.a.c) r14
            Ai.D0 r15 = Ai.D0.f78440a
            java.lang.String r15 = r15.g(r0, r13)
            Al.d r16 = r14.d()
            IC.e r17 = r14.b()
            IC.e r18 = r14.a()
            KJ.c r19 = r14.c()
            java.util.List r14 = r11.g()
            int r14 = YH.C16877v.p(r14)
            if (r13 != r14) goto L_0x033b
            r20 = r26
            goto L_0x033d
        L_0x033b:
            r20 = 0
        L_0x033d:
            Ei.q$a$d r21 = r11.f()
            int r13 = IC.C13023e.f110931a
            int r14 = r13 << 6
            int r22 = r13 << 9
            r14 = r14 | r22
            int r13 = r13 << 12
            r13 = r13 | r14
            int r14 = r6 << 9
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r14 & r22
            r13 = r13 | r22
            r22 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = r14 & r22
            r23 = r13 | r14
            r13 = r15
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r32
            r21 = r33
            r22 = r9
            y(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r13 = r27
            goto L_0x0303
        L_0x0373:
            r26 = 1
            r9.P()
            Ei.q$a$b r8 = r11.e()
            r13 = 1212684455(0x484818a7, float:204898.61)
            r9.W(r13)
            if (r8 != 0) goto L_0x0385
            goto L_0x038e
        L_0x0385:
            int r13 = IC.C13023e.f110931a
            int r13 = r13 << 3
            v(r0, r8, r9, r13)
            XH.N r8 = XH.C16807N.f139792a
        L_0x038e:
            r9.P()
            java.util.List r8 = r11.a()
            r13 = r8
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x039f
            goto L_0x03a0
        L_0x039f:
            r8 = 0
        L_0x03a0:
            r13 = 1212690294(0x48482f76, float:204989.84)
            r9.W(r13)
            if (r8 != 0) goto L_0x03b9
            r17 = r4
            r13 = r5
            r18 = r6
            r20 = r7
            r14 = r9
            r21 = r26
            r2 = 0
            r16 = 256(0x100, float:3.59E-43)
            r19 = 0
            goto L_0x0426
        L_0x03b9:
            int r13 = wi.C12272a.f105821h1
            r14 = 0
            java.lang.String r13 = J1.j.b(r13, r9, r14)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            KJ.c r8 = KJ.C15985a.h(r8)
            r15 = 1352714799(0x50a0ca2f, float:2.15808389E10)
            r9.W(r15)
            r15 = r6 & 896(0x380, float:1.256E-42)
            r14 = 256(0x100, float:3.59E-43)
            if (r15 != r14) goto L_0x03d5
            r15 = r26
            goto L_0x03d6
        L_0x03d5:
            r15 = 0
        L_0x03d6:
            r14 = r6 & 14
            r2 = 4
            if (r14 != r2) goto L_0x03de
            r14 = r26
            goto L_0x03df
        L_0x03de:
            r14 = 0
        L_0x03df:
            r14 = r14 | r15
            boolean r15 = r9.F(r11)
            r14 = r14 | r15
            java.lang.Object r15 = r9.D()
            if (r14 != 0) goto L_0x03f3
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r14 = r14.a()
            if (r15 != r14) goto L_0x03fb
        L_0x03f3:
            Ai.s0 r15 = new Ai.s0
            r15.<init>(r3, r1, r11)
            r9.u(r15)
        L_0x03fb:
            r11 = r15
            nI.a r11 = (nI.C17631a) r11
            r9.P()
            r14 = r6 & 7168(0x1c00, float:1.0045E-41)
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
            r15 = 0
            r16 = 0
            r17 = r4
            r4 = r13
            r13 = r5
            r5 = r8
            r18 = r6
            r6 = r11
            r20 = r7
            r19 = 0
            r7 = r31
            r21 = r26
            r8 = r16
            r11 = r9
            r10 = r14
            r14 = r11
            r2 = 0
            r16 = 256(0x100, float:3.59E-43)
            r11 = r15
            Ai.N0.d(r4, r5, r6, r7, r8, r9, r10, r11)
            XH.N r4 = XH.C16807N.f139792a
        L_0x0426:
            r14.P()
            int r4 = YH.C16877v.p(r29)
            if (r0 == r4) goto L_0x0442
            t(r14, r2)
            goto L_0x0442
        L_0x0433:
            r17 = r4
            r13 = r5
            r18 = r6
            r20 = r7
            r14 = r9
            r2 = 0
            r16 = 256(0x100, float:3.59E-43)
            r19 = 0
            r21 = 1
        L_0x0442:
            r14.P()
            r2 = r29
            r0 = r32
            r10 = r36
            r5 = r13
            r9 = r14
            r11 = r16
            r4 = r17
            r6 = r18
            r7 = r20
            r8 = r21
            r15 = r25
            goto L_0x0275
        L_0x045b:
            r13 = r5
            r14 = r9
            r14.P()
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x046c
            U0.C4895p.R()
        L_0x046c:
            r7 = r13
        L_0x046d:
            U0.Y0 r10 = r14.n()
            if (r10 == 0) goto L_0x048c
            Ai.t0 r11 = new Ai.t0
            r0 = r11
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r8 = r36
            r9 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x048c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C0.p(java.lang.String, KJ.c, nI.p, nI.l, nI.l, nI.p, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(p pVar, String str, C10696q.a aVar) {
        pVar.invoke(str, aVar.d());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C5353v vVar, int i10, boolean z10, boolean z11) {
        vVar.set(i10, Boolean.valueOf(!z10 || !z11));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(String str, C15987c cVar, p pVar, C17642l lVar, C17642l lVar2, p pVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        p(str, cVar, pVar, lVar, lVar2, pVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void t(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(1242325460);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1242325460, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.OrderTrackingDivider (OrderTracking.kt:192)");
            }
            C13643u0.c(D.k(e.i(androidx.compose.ui.d.f18749a), 0.0f, h.B((float) 16), 1, (Object) null), 0.0f, 0, k10, 0, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10618z0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(int i10, C4889m mVar, int i11) {
        t(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void v(int i10, C10696q.a.b bVar, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        int i13 = i10;
        C10696q.a.b bVar2 = bVar;
        int i14 = i11;
        C4889m k10 = mVar.k(-170814974);
        if ((i14 & 6) == 0) {
            i12 = (k10.d(i13) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= (i14 & 64) == 0 ? k10.V(bVar2) : k10.F(bVar2) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-170814974, i12, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.OrderTrackingLocation (OrderTracking.kt:166)");
            }
            androidx.compose.ui.d a10 = C5116k1.a(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), D0.f78440a.f(i13));
            k10.W(-1085330222);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new C10614x0();
                k10.u(D10);
            }
            k10.P();
            androidx.compose.ui.d m10 = D.m(o.c(a10, true, (C17642l) D10), 0.0f, h.B((float) 16), 0.0f, 0.0f, 13, (Object) null);
            C13023e b10 = bVar.b();
            int i15 = C13023e.f110931a;
            String a11 = b10.a(k10, i15);
            C13023e a12 = bVar.a();
            k10.W(-1085324915);
            String a13 = a12 == null ? null : a12.a(k10, i15);
            k10.P();
            C13573c1.a aVar = r9;
            C13573c1.a aVar2 = new C13573c1.a(C18146a.f148086I6, (String) null, (C5437c.C0386c) null, (C5747v0) null, 12, (DefaultConstructorMarker) null);
            String str = a11;
            mVar2 = k10;
            C13585f1.c(str, (C17631a<C16807N>) null, m10, a13, aVar, (C13569b1) null, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, (C13589g1) null, 0.0f, true, false, (m) null, mVar2, (C13573c1.a.f116164f << 12) | 48, 6, 7136);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10616y0(i13, bVar2, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(int i10, C10696q.a.b bVar, int i11, C4889m mVar, int i12) {
        v(i10, bVar, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    private static final void y(String str, Al.d dVar, C13023e eVar, C13023e eVar2, C15987c<C10696q.a.c.C1532a> cVar, boolean z10, C10696q.a.d dVar2, C17642l<? super String, C16807N> lVar, p<? super String, ? super c.d.e, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        String str2 = str;
        C13023e eVar3 = eVar;
        C13023e eVar4 = eVar2;
        C15987c<C10696q.a.c.C1532a> cVar2 = cVar;
        int i12 = i10;
        C4889m k10 = mVar.k(520347680);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        Al.d dVar3 = dVar;
        if ((i12 & 48) == 0) {
            i11 |= k10.V(dVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= (i12 & 512) == 0 ? k10.V(eVar3) : k10.F(eVar3) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? k10.V(eVar4) : k10.F(eVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= (32768 & i12) == 0 ? k10.V(cVar2) : k10.F(cVar2) ? 16384 : 8192;
        }
        boolean z11 = z10;
        if ((i12 & ImageMetadata.EDGE_MODE) == 0) {
            i11 |= k10.b(z11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        C10696q.a.d dVar4 = dVar2;
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(dVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        C17642l<? super String, C16807N> lVar2 = lVar;
        if ((12582912 & i12) == 0) {
            i11 |= k10.F(lVar2) ? 8388608 : 4194304;
        }
        p<? super String, ? super c.d.e, C16807N> pVar2 = pVar;
        if ((100663296 & i12) == 0) {
            i11 |= k10.F(pVar2) ? 67108864 : 33554432;
        }
        int i13 = i11;
        if ((38347923 & i13) != 38347922 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(520347680, i13, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.OrderTrackingStep (OrderTracking.kt:330)");
            }
            androidx.compose.ui.d i14 = e.i(C5116k1.a(androidx.compose.ui.d.f18749a, str2));
            int i15 = C13023e.f110931a;
            String a10 = eVar3.a(k10, ((i13 >> 6) & 14) | i15);
            k10.W(-116689724);
            String a11 = eVar4 == null ? null : eVar4.a(k10, i15 | ((i13 >> 9) & 14));
            k10.P();
            a aVar = r5;
            a aVar2 = new a(cVar, dVar, dVar2, lVar, pVar);
            int i16 = i13 >> 3;
            Al.c.c(dVar, a10, a11, i14, z10, c1.c.e(-329548635, true, aVar, k10, 54), k10, (i16 & 14) | ImageMetadata.EDGE_MODE | (i16 & 57344), 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10612w0(str, dVar, eVar, eVar2, cVar, z10, dVar2, lVar, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(String str, Al.d dVar, C13023e eVar, C13023e eVar2, C15987c cVar, boolean z10, C10696q.a.d dVar2, C17642l lVar, p pVar, int i10, C4889m mVar, int i11) {
        y(str, dVar, eVar, eVar2, cVar, z10, dVar2, lVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
