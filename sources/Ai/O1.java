package Ai;

import Ai.J1;
import Bi.C10619a;
import Bi.C10620b;
import E1.I;
import Ei.C10679N;
import G1.C4504g;
import HJ.C15854t;
import J1.j;
import N1.P;
import ND.C13284f;
import O0.e1;
import O0.g1;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import SC.C13607l;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import Y1.k;
import YH.C16877v;
import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.d;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import e.C5281d;
import eI.C17187b;
import h9.C7941b;
import h9.C7944e;
import h9.C7945f;
import h9.C7946g;
import h9.C7947h;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import ol.u;
import ol.v;
import p1.C5747v0;
import p1.i1;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import s0.C5842M;
import s0.C5848T;
import s0.C5862h;
import tK.C18029u;
import tK.C18030v;
import uI.C18059h;
import yl.C12376c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0014\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u0002"}, d2 = {"LEi/N;", "viewModel", "Lkotlin/Function1;", "LAi/J1;", "LXH/N;", "action", "k", "(LEi/N;LnI/l;LU0/m;I)V", "", "url", "Lh9/b;", "accompanistWebViewClient", "i", "(Ljava/lang/String;Lh9/b;LU0/m;I)V", "g", "(LU0/m;I)V", "Lkotlin/Function0;", "onDismiss", "", "errorMessage", "e", "(LnI/a;ILU0/m;II)V", "Landroidx/compose/ui/d;", "p", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d;", "state", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class O1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f78555a;

        a(int i10) {
            this.f78555a = i10;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1312854291, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ErrorPrompt.<anonymous>.<anonymous> (WebViewScreen.kt:170)");
                }
                C13607l.j(j.b(this.f78555a, mVar, 0), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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
    /* synthetic */ class b extends C17540p implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<J1, C16807N> f78556a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17642l<? super J1, C16807N> lVar) {
            super(0, C17542s.a.class, "handleClose", "WebViewScreen$handleClose(Lkotlin/jvm/functions/Function1;)V", 0);
            this.f78556a = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            O1.l(this.f78556a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<J1, C16807N> f78557a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17642l<? super J1, C16807N> lVar) {
            super(0, C17542s.a.class, "handleClose", "WebViewScreen$handleClose(Lkotlin/jvm/functions/Function1;)V", 0);
            this.f78557a = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            O1.l(this.f78557a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.WebViewScreenKt$WebViewScreen$2$2$1", f = "WebViewScreen.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78558c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<J1, C16807N> f78559d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17642l<? super J1, C16807N> lVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f78559d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f78559d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f78558c == 0) {
                y.b(obj);
                this.f78559d.invoke(J1.c.f78515a);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.WebViewScreenKt$WebViewScreen$2$3$1$1", f = "WebViewScreen.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78560c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<J1, C16807N> f78561d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f78562e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17642l<? super J1, C16807N> lVar, String str, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f78561d = lVar;
            this.f78562e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f78561d, this.f78562e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f78560c == 0) {
                y.b(obj);
                this.f78561d.invoke(new J1.b(this.f78562e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<J1, C16807N> f78563a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C17642l<? super J1, C16807N> lVar) {
            super(0, C17542s.a.class, "handleClose", "WebViewScreen$handleClose(Lkotlin/jvm/functions/Function1;)V", 0);
            this.f78563a = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            O1.l(this.f78563a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g extends C17540p implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<J1, C16807N> f78564a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C17642l<? super J1, C16807N> lVar) {
            super(0, C17542s.a.class, "handleClose", "WebViewScreen$handleClose(Lkotlin/jvm/functions/Function1;)V", 0);
            this.f78564a = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            O1.l(this.f78564a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends C17540p implements C17642l<WebResourceRequest, Boolean> {
        h(Object obj) {
            super(1, obj, C10679N.class, "interceptUrlLoading", "interceptUrlLoading(Landroid/webkit/WebResourceRequest;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(WebResourceRequest webResourceRequest) {
            return Boolean.valueOf(((C10679N) this.receiver).a(webResourceRequest));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f78565a = new i();

        i() {
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$composed");
            mVar.W(-371908468);
            if (C4895p.J()) {
                C4895p.S(-371908468, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.backdrop.<anonymous> (WebViewScreen.kt:191)");
            }
            androidx.compose.ui.d d10 = androidx.compose.foundation.b.d(dVar, C5747v0.o(C18030v.f147664a.a(mVar, C18030v.f147665b).x0(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (i1) null, 2, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return d10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void e(nI.C17631a<XH.C16807N> r20, int r21, U0.C4889m r22, int r23, int r24) {
        /*
            r9 = r20
            r10 = r23
            r11 = r24
            r0 = 2
            r1 = -802087457(0xffffffffd0311ddf, float:-1.18860995E10)
            r2 = r22
            U0.m r12 = r2.k(r1)
            r2 = 1
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0018
            r3 = r10 | 6
            goto L_0x0028
        L_0x0018:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0027
            boolean r3 = r12.F(r9)
            if (r3 == 0) goto L_0x0024
            r3 = 4
            goto L_0x0025
        L_0x0024:
            r3 = r0
        L_0x0025:
            r3 = r3 | r10
            goto L_0x0028
        L_0x0027:
            r3 = r10
        L_0x0028:
            r4 = r10 & 48
            if (r4 != 0) goto L_0x0041
            r4 = r11 & 2
            if (r4 != 0) goto L_0x003b
            r4 = r21
            boolean r5 = r12.d(r4)
            if (r5 == 0) goto L_0x003d
            r5 = 32
            goto L_0x003f
        L_0x003b:
            r4 = r21
        L_0x003d:
            r5 = 16
        L_0x003f:
            r3 = r3 | r5
            goto L_0x0043
        L_0x0041:
            r4 = r21
        L_0x0043:
            r5 = r3 & 19
            r6 = 18
            if (r5 != r6) goto L_0x0056
            boolean r5 = r12.l()
            if (r5 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r12.L()
            r13 = r4
            goto L_0x0160
        L_0x0056:
            r12.G()
            r5 = r10 & 1
            if (r5 == 0) goto L_0x006e
            boolean r5 = r12.O()
            if (r5 == 0) goto L_0x0064
            goto L_0x006e
        L_0x0064:
            r12.L()
            r0 = r0 & r11
            if (r0 == 0) goto L_0x006c
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x006c:
            r13 = r4
            goto L_0x0076
        L_0x006e:
            r0 = r0 & r11
            if (r0 == 0) goto L_0x006c
            int r0 = Oo.b.f84812v3
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            r13 = r0
        L_0x0076:
            r12.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0085
            r0 = -1
            java.lang.String r4 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ErrorPrompt (WebViewScreen.kt:154)"
            U0.C4895p.S(r1, r3, r0, r4)
        L_0x0085:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r1 = 0
            r4 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.f(r0, r1, r2, r4)
            androidx.compose.ui.d r1 = p(r1)
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.o()
            r5 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r5)
            int r6 = U0.C4883j.a(r12, r5)
            U0.y r7 = r12.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r12, r1)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r14 = r8.a()
            U0.f r15 = r12.m()
            if (r15 != 0) goto L_0x00b7
            U0.C4883j.c()
        L_0x00b7:
            r12.I()
            boolean r15 = r12.i()
            if (r15 == 0) goto L_0x00c4
            r12.p(r14)
            goto L_0x00c7
        L_0x00c4:
            r12.t()
        L_0x00c7:
            U0.m r14 = U0.F1.a(r12)
            nI.p r15 = r8.c()
            U0.F1.c(r14, r4, r15)
            nI.p r4 = r8.e()
            U0.F1.c(r14, r7, r4)
            nI.p r4 = r8.b()
            boolean r7 = r14.i()
            if (r7 != 0) goto L_0x00f1
            java.lang.Object r7 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r15)
            if (r7 != 0) goto L_0x00ff
        L_0x00f1:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r14.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.w(r6, r4)
        L_0x00ff:
            nI.p r4 = r8.d()
            U0.F1.c(r14, r1, r4)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            java.lang.String r1 = "ERROR_MESSAGE"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            int r0 = Oo.b.f84370F2
            java.lang.String r0 = J1.j.b(r0, r12, r5)
            SC.W1 r1 = new SC.W1
            int r6 = Oo.b.f84330B2
            java.lang.String r5 = J1.j.b(r6, r12, r5)
            r1.<init>(r5, r9)
            androidx.compose.ui.window.h r5 = new androidx.compose.ui.window.h
            r18 = 4
            r19 = 0
            r15 = 1
            r16 = 0
            r17 = 0
            r14 = r5
            r14.<init>((boolean) r15, (boolean) r16, (boolean) r17, (int) r18, (kotlin.jvm.internal.DefaultConstructorMarker) r19)
            Ai.O1$a r6 = new Ai.O1$a
            r6.<init>(r13)
            r7 = 54
            r8 = 1312854291(0x4e409113, float:8.0768326E8)
            c1.a r6 = c1.c.e(r8, r2, r6, r12, r7)
            int r2 = SC.W1.f116045c
            int r2 = r2 << 3
            r7 = 224256(0x36c00, float:3.1425E-40)
            r2 = r2 | r7
            int r3 = r3 << 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r7 = r2 | r3
            r8 = 0
            r2 = r20
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r12
            SC.Z1.d(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r12.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0160
            U0.C4895p.R()
        L_0x0160:
            U0.Y0 r0 = r12.n()
            if (r0 == 0) goto L_0x016e
            Ai.L1 r1 = new Ai.L1
            r1.<init>(r9, r13, r10, r11)
            r0.a(r1)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.O1.e(nI.a, int, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17631a aVar, int i10, int i11, int i12, C4889m mVar, int i13) {
        e(aVar, i10, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    public static final void g(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-1500398429);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1500398429, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.FullScreenLoading (WebViewScreen.kt:138)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d f10 = J.f(aVar, 0.0f, 1, (Object) null);
            C5437c.a aVar2 = C5437c.f24302a;
            I h10 = C5077h.h(aVar2.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, h10, aVar3.c());
            F1.c(a12, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar3.d());
            C13605k1.b(D.m(C5079j.f18125a.a(aVar, aVar2.e()), 0.0f, 0.0f, 0.0f, C18029u.f147649a.e(), 7, (Object) null), (C13597i1) null, (C13593h1) null, k10, 0, 6);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new M1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(int i10, C4889m mVar, int i11) {
        g(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private static final void i(String str, C7941b bVar, C4889m mVar, int i10) {
        int i11;
        String str2;
        List<C7944e> list;
        Iterator it;
        Iterator it2;
        String str3 = str;
        C7941b bVar2 = bVar;
        int i12 = i10;
        C4889m k10 = mVar.k(984239975);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= (i12 & 64) == 0 ? k10.V(bVar2) : k10.F(bVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(984239975, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.WebViewContent (WebViewScreen.kt:115)");
            }
            C7947h d10 = C7945f.d(str3, (Map<String, String>) null, k10, i11 & 14, 2);
            androidx.compose.ui.d f10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
            k10.W(388023273);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new C10619a();
                k10.u(D10);
            }
            k10.P();
            C13284f.f(d10, f10, false, (C7946g) null, (C17642l<? super WebView, C16807N>) null, (C17642l<? super WebView, C16807N>) null, bVar, (C10619a) D10, (C17642l<? super Context, ? extends WebView>) null, k10, (C7941b.f51666c << 18) | 12582960 | ((i11 << 15) & 3670016), 316);
            boolean h10 = d10.h();
            String str4 = DslKt.INDICATOR_BACKGROUND;
            Class<C7947h> cls = C7947h.class;
            if (h10) {
                qv.e eVar = qv.e.DEBUG;
                ArrayList arrayList = new ArrayList();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                Iterator it3 = arrayList.iterator();
                String str5 = null;
                String str6 = null;
                while (it3.hasNext()) {
                    C11819b bVar3 = (C11819b) it3.next();
                    if (str6 == null) {
                        String a10 = C11818a.a("WebView state is loading, " + d10.c(), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str6 = C11820c.a(a10);
                    }
                    if (str5 == null) {
                        String name = cls.getName();
                        C17542s.g(name);
                        it2 = it3;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (!(o12.length() == 0)) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        it2 = it3;
                    }
                    bVar3.a(eVar, str5, false, (Throwable) null, str6);
                    it3 = it2;
                }
            } else {
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                String str7 = null;
                String str8 = null;
                while (it4.hasNext()) {
                    C11819b bVar4 = (C11819b) it4.next();
                    if (str8 == null) {
                        String a11 = C11818a.a("WebView state stopped loading, " + d10.c(), (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str8 = C11820c.a(a11);
                    }
                    if (str7 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        it = it4;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (!(o13.length() == 0)) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        it = it4;
                    }
                    bVar4.a(eVar2, str7, false, (Throwable) null, str8);
                    it4 = it;
                }
            }
            List<C7944e> A10 = d10.b().A();
            if (!A10.isEmpty()) {
                qv.e eVar3 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str9 = null;
                String str10 = null;
                for (C11819b bVar5 : arrayList3) {
                    if (str9 == null) {
                        String a12 = C11818a.a("WebView state errors: " + C16877v.t1(A10), (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str9 = C11820c.a(a12);
                    }
                    if (str10 == null) {
                        String name3 = cls.getName();
                        C17542s.g(name3);
                        list = A10;
                        str2 = str4;
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (!(o14.length() == 0)) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name3;
                    } else {
                        list = A10;
                        str2 = str4;
                    }
                    bVar5.a(eVar3, str10, false, (Throwable) null, str9);
                    A10 = list;
                    str4 = str2;
                }
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new N1(str, bVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(String str, C7941b bVar, int i10, C4889m mVar, int i11) {
        i(str, bVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public static final void k(C10679N n10, C17642l<? super J1, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        int i12;
        int i13;
        C10679N n11 = n10;
        C17642l<? super J1, C16807N> lVar2 = lVar;
        int i14 = i10;
        C17542s.j(n11, "viewModel");
        C17542s.j(lVar2, "action");
        C4889m k10 = mVar.k(-727433161);
        if ((i14 & 6) == 0) {
            i11 = ((i14 & 8) == 0 ? k10.V(n11) : k10.F(n11) ? 4 : 2) | i14;
        } else {
            i11 = i14;
        }
        if ((i14 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-727433161, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.WebViewScreen (WebViewScreen.kt:58)");
            }
            boolean z10 = false;
            C12376c.c(k10, 0);
            k10.W(1138144667);
            int i15 = i11 & 112;
            boolean z11 = i15 == 32;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new b(lVar2);
                k10.u(D10);
            }
            k10.P();
            C5281d.a(false, (C17631a) ((C18059h) D10), k10, 0, 1);
            d.a aVar = androidx.compose.ui.d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
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
            v vVar = v.BACK;
            k10.W(-82987750);
            boolean z12 = i15 == 32;
            Object D11 = k10.D();
            if (z12 || D11 == C4889m.f14007a.a()) {
                D11 = new c(lVar2);
                k10.u(D11);
            }
            k10.P();
            int i16 = i15;
            C4889m mVar3 = k10;
            ol.p.c(vVar, (C17631a) ((C18059h) D11), (androidx.compose.ui.d) null, (String) null, (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, k10, 6, 508);
            com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.d n12 = n(j3.a.c(n10.getState(), (C5221y) null, (r.b) null, (C17168i) null, mVar3, 0, 7));
            if (C17542s.e(n12, d.c.f91039a)) {
                mVar2 = mVar3;
                mVar2.W(1722516866);
                g(mVar2, 0);
                mVar2.P();
            } else {
                mVar2 = mVar3;
                if (n12 instanceof d.a) {
                    mVar2.W(1722636681);
                    mVar2.W(-82978491);
                    d.a aVar3 = (d.a) n12;
                    if (aVar3.b()) {
                        C16807N n13 = C16807N.f139792a;
                        mVar2.W(-82976246);
                        i13 = 32;
                        boolean z13 = i16 == 32;
                        Object D12 = mVar2.D();
                        if (z13 || D12 == C4889m.f14007a.a()) {
                            D12 = new d(lVar2, (C17164e<? super d>) null);
                            mVar2.u(D12);
                        }
                        mVar2.P();
                        i12 = 6;
                        U0.P.g(n13, (p) D12, mVar2, 6);
                    } else {
                        i13 = 32;
                        i12 = 6;
                    }
                    mVar2.P();
                    String c10 = aVar3.c();
                    mVar2.W(-82971096);
                    if (c10 != null) {
                        C16807N n14 = C16807N.f139792a;
                        mVar2.W(-272210921);
                        if (i16 == i13) {
                            z10 = true;
                        }
                        boolean V10 = mVar2.V(c10) | z10;
                        Object D13 = mVar2.D();
                        if (V10 || D13 == C4889m.f14007a.a()) {
                            D13 = new e(lVar2, c10, (C17164e<? super e>) null);
                            mVar2.u(D13);
                        }
                        mVar2.P();
                        U0.P.g(n14, (p) D13, mVar2, i12);
                    }
                    mVar2.P();
                    mVar2.W(-82963556);
                    Object D14 = mVar2.D();
                    if (D14 == C4889m.f14007a.a()) {
                        D14 = new C10620b(new h(n11));
                        mVar2.u(D14);
                    }
                    mVar2.P();
                    i(aVar3.a(), (C10620b) D14, mVar2, 48);
                    mVar2.P();
                } else if (n12 instanceof d.b) {
                    mVar2.W(1723502356);
                    mVar2.W(-82948614);
                    boolean z14 = i16 == 32;
                    Object D15 = mVar2.D();
                    if (z14 || D15 == C4889m.f14007a.a()) {
                        D15 = new f(lVar2);
                        mVar2.u(D15);
                    }
                    mVar2.P();
                    e((C17631a) ((C18059h) D15), ((d.b) n12).a(), mVar2, 0, 0);
                    mVar2.P();
                } else if (C17542s.e(n12, d.C1991d.f91040a)) {
                    mVar2.W(1723705096);
                    mVar2.W(-82942022);
                    boolean z15 = i16 == 32;
                    Object D16 = mVar2.D();
                    if (z15 || D16 == C4889m.f14007a.a()) {
                        D16 = new g(lVar2);
                        mVar2.u(D16);
                    }
                    mVar2.P();
                    e((C17631a) ((C18059h) D16), 0, mVar2, 0, 2);
                    mVar2.P();
                } else {
                    mVar2.W(-82983178);
                    mVar2.P();
                    throw new t();
                }
            }
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n15 = mVar2.n();
        if (n15 != null) {
            n15.a(new K1(n11, lVar2, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final void l(C17642l<? super J1, C16807N> lVar) {
        lVar.invoke(J1.a.f78513a);
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C10679N n10, C17642l lVar, int i10, C4889m mVar, int i11) {
        k(n10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.d n(A1<? extends com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.d> a12) {
        return (com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.d) a12.getValue();
    }

    private static final androidx.compose.ui.d p(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.c(dVar, (C17642l) null, i.f78565a, 1, (Object) null);
    }
}
