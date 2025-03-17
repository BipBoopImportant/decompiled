package Wm;

import E1.I;
import G1.C4504g;
import ND.C13284f;
import O0.e1;
import O0.g1;
import QJ.Q;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.y;
import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.ingka.ikea.boka.impl.sandbox.BokaSandboxViewModel;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import h9.C7940a;
import h9.C7942c;
import h9.C7945f;
import h9.C7946g;
import h9.C7947h;
import i1.C5437c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import ol.u;
import ol.v;
import p1.i1;
import s0.C5842M;
import s0.C5848T;
import s0.C5862h;
import tK.C18030v;
import uI.C18059h;
import yl.C12376c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u001a;\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000e0\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000e0\u0002H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u0002"}, d2 = {"Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel;", "viewModel", "Lkotlin/Function1;", "", "LXH/N;", "onBookingComplete", "Lkotlin/Function0;", "onBookingCancelled", "g", "(Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel;LnI/l;LnI/a;LU0/m;I)V", "Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$a;", "state", "onCloseClicked", "onPageLoadComplete", "", "shouldOverrideUrl", "e", "(Lcom/ingka/ikea/boka/impl/sandbox/BokaSandboxViewModel$a;LnI/a;LnI/a;LnI/l;LU0/m;I)V", "l", "(LU0/m;I)V", "url", "j", "(Ljava/lang/String;LnI/a;LnI/l;LU0/m;I)V", "boka-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.boka.impl.sandbox.compose.BokaSandboxScreenKt$BokaSandboxScreen$1$1", f = "BokaSandboxScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89062c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f89063d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f89064e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<BokaSandboxViewModel.a> f89065f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar, A1<BokaSandboxViewModel.a> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f89063d = lVar;
            this.f89064e = aVar;
            this.f89065f = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f89063d, this.f89064e, this.f89065f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f89062c == 0) {
                y.b(obj);
                BokaSandboxViewModel.b d10 = e.h(this.f89065f).d();
                if (C17542s.e(d10, BokaSandboxViewModel.b.C2080b.f93325a)) {
                    this.f89063d.invoke(e.h(this.f89065f).c());
                } else if (C17542s.e(d10, BokaSandboxViewModel.b.a.f93324a)) {
                    this.f89064e.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
        b(Object obj) {
            super(0, obj, BokaSandboxViewModel.class, "onCloseClicked", "onCloseClicked()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((BokaSandboxViewModel) this.receiver).F();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17642l<String, Boolean> {
        c(Object obj) {
            super(1, obj, BokaSandboxViewModel.class, "shouldOverrideUrlLoading", "shouldOverrideUrlLoading(Ljava/lang/String;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(((BokaSandboxViewModel) this.receiver).I(str));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends C17540p implements C17631a<C16807N> {
        d(Object obj) {
            super(0, obj, BokaSandboxViewModel.class, "onPageLoadComplete", "onPageLoadComplete()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((BokaSandboxViewModel) this.receiver).G();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.boka.impl.sandbox.compose.BokaSandboxScreenKt$BokaWebView$1$1", f = "BokaSandboxScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Wm.e$e  reason: collision with other inner class name */
    static final class C1893e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89066c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C7947h f89067d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f89068e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1893e(C7947h hVar, C17631a<C16807N> aVar, C17164e<? super C1893e> eVar) {
            super(2, eVar);
            this.f89067d = hVar;
            this.f89068e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1893e(this.f89067d, this.f89068e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1893e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f89066c == 0) {
                y.b(obj);
                if (C17542s.e(this.f89067d.d(), C7942c.a.f51670b)) {
                    this.f89068e.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void e(BokaSandboxViewModel.a aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17642l<? super String, Boolean> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        BokaSandboxViewModel.a aVar4 = aVar;
        C17631a<C16807N> aVar5 = aVar2;
        C17631a<C16807N> aVar6 = aVar3;
        C17642l<? super String, Boolean> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(aVar4, "state");
        C17542s.j(aVar5, "onCloseClicked");
        C17542s.j(aVar6, "onPageLoadComplete");
        C17542s.j(lVar2, "shouldOverrideUrl");
        C4889m k10 = mVar.k(-744980936);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(aVar4) : k10.F(aVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar5) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar6) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i13 = i11;
        if ((i13 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-744980936, i13, -1, "com.ingka.ikea.boka.impl.sandbox.compose.BokaSandboxContent (BokaSandboxScreen.kt:77)");
            }
            d.a aVar7 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d f10 = J.f(aVar7, 0.0f, 1, (Object) null);
            C5437c.a aVar8 = C5437c.f24302a;
            I h10 = C5077h.h(aVar8.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f10);
            C4504g.a aVar9 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar9.a();
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
            F1.c(a12, h10, aVar9.c());
            F1.c(a12, s10, aVar9.e());
            p<C4504g, Integer, C16807N> b10 = aVar9.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar9.d());
            C5079j jVar = C5079j.f18125a;
            androidx.compose.ui.d f11 = J.f(aVar7, 0.0f, 1, (Object) null);
            I a13 = C5080k.a(C5073d.f18068a.g(), aVar8.k(), k10, 0);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, f11);
            C17631a<C4504g> a15 = aVar9.a();
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
            F1.c(a16, a13, aVar9.c());
            F1.c(a16, s11, aVar9.e());
            p<C4504g, Integer, C16807N> b11 = aVar9.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b11);
            }
            F1.c(a16, e11, aVar9.d());
            C5862h hVar = C5862h.f28810a;
            int i14 = i13;
            ol.p.c(v.CLOSE, aVar2, (androidx.compose.ui.d) null, (String) null, (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, k10, (i13 & 112) | 6, 508);
            mVar2 = k10;
            mVar2.W(-296308426);
            if ((aVar.d() instanceof BokaSandboxViewModel.b.e) || (aVar.d() instanceof BokaSandboxViewModel.b.f)) {
                j(aVar.e(), aVar6, lVar2, mVar2, (i14 >> 3) & 1008);
            }
            mVar2.P();
            mVar2.x();
            mVar2.W(-604935802);
            if ((aVar.d() instanceof BokaSandboxViewModel.b.d) || (aVar.d() instanceof BokaSandboxViewModel.b.e)) {
                l(mVar2, 0);
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
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new a(aVar, aVar2, aVar3, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(BokaSandboxViewModel.a aVar, C17631a aVar2, C17631a aVar3, C17642l lVar, int i10, C4889m mVar, int i11) {
        e(aVar, aVar2, aVar3, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void g(BokaSandboxViewModel bokaSandboxViewModel, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(bokaSandboxViewModel, "viewModel");
        C17542s.j(lVar, "onBookingComplete");
        C17542s.j(aVar, "onBookingCancelled");
        C4889m k10 = mVar.k(1985972038);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(bokaSandboxViewModel) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1985972038, i12, -1, "com.ingka.ikea.boka.impl.sandbox.compose.BokaSandboxScreen (BokaSandboxScreen.kt:51)");
            }
            A1<BokaSandboxViewModel.a> c10 = j3.a.c(bokaSandboxViewModel.getState(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            C12376c.c(k10, 0);
            BokaSandboxViewModel.a h10 = h(c10);
            k10.W(490539244);
            boolean z10 = true;
            boolean V10 = k10.V(c10) | ((i12 & 112) == 32);
            if ((i12 & 896) != 256) {
                z10 = false;
            }
            boolean z11 = V10 | z10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new a(lVar, aVar, c10, (C17164e<? super a>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(h10, (p) D10, k10, 0);
            BokaSandboxViewModel.a h11 = h(c10);
            k10.W(490549046);
            boolean F10 = k10.F(bokaSandboxViewModel);
            Object D11 = k10.D();
            if (F10 || D11 == C4889m.f14007a.a()) {
                D11 = new b(bokaSandboxViewModel);
                k10.u(D11);
            }
            C18059h hVar = (C18059h) D11;
            k10.P();
            k10.W(490550816);
            boolean F11 = k10.F(bokaSandboxViewModel);
            Object D12 = k10.D();
            if (F11 || D12 == C4889m.f14007a.a()) {
                D12 = new c(bokaSandboxViewModel);
                k10.u(D12);
            }
            C18059h hVar2 = (C18059h) D12;
            k10.P();
            k10.W(490552922);
            boolean F12 = k10.F(bokaSandboxViewModel);
            Object D13 = k10.D();
            if (F12 || D13 == C4889m.f14007a.a()) {
                D13 = new d(bokaSandboxViewModel);
                k10.u(D13);
            }
            k10.P();
            e(h11, (C17631a) hVar, (C17631a) ((C18059h) D13), (C17642l) hVar2, k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new d(bokaSandboxViewModel, lVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final BokaSandboxViewModel.a h(A1<BokaSandboxViewModel.a> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N i(BokaSandboxViewModel bokaSandboxViewModel, C17642l lVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        g(bokaSandboxViewModel, lVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private static final void j(String str, C17631a<C16807N> aVar, C17642l<? super String, Boolean> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C17631a<C16807N> aVar2 = aVar;
        C17642l<? super String, Boolean> lVar2 = lVar;
        int i12 = i10;
        C4889m k10 = mVar.k(889670161);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(889670161, i11, -1, "com.ingka.ikea.boka.impl.sandbox.compose.BokaWebView (BokaSandboxScreen.kt:129)");
            }
            C7947h d10 = C7945f.d(str2, (Map<String, String>) null, k10, i11 & 14, 2);
            boolean z10 = false;
            C7946g c10 = C7945f.c((Q) null, k10, 0, 1);
            k10.W(206210256);
            Object D10 = k10.D();
            C4889m.a aVar3 = C4889m.f14007a;
            if (D10 == aVar3.a()) {
                D10 = new f(lVar2);
                k10.u(D10);
            }
            f fVar = (f) D10;
            k10.P();
            C7942c d11 = d10.d();
            k10.W(206213554);
            boolean V10 = k10.V(d10);
            if ((i11 & 112) == 32) {
                z10 = true;
            }
            boolean z11 = V10 | z10;
            Object D11 = k10.D();
            if (z11 || D11 == aVar3.a()) {
                D11 = new C1893e(d10, aVar2, (C17164e<? super C1893e>) null);
                k10.u(D11);
            }
            k10.P();
            P.g(d11, (p) D11, k10, C7942c.f51669a);
            mVar2 = k10;
            C13284f.f(d10, J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), true, c10, (C17642l<? super WebView, C16807N>) null, (C17642l<? super WebView, C16807N>) null, fVar, (C7940a) null, (C17642l<? super Context, ? extends WebView>) null, k10, 1573296, 432);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new b(str2, aVar2, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(String str, C17631a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        j(str, aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void l(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(2142196732);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2142196732, i10, -1, "com.ingka.ikea.boka.impl.sandbox.compose.FullScreenLoading (BokaSandboxScreen.kt:106)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d f10 = J.f(androidx.compose.foundation.b.d(C5116k1.a(aVar, "LOADING_OVERLAY"), C18030v.f147664a.a(k10, C18030v.f147665b).k0(), (i1) null, 2, (Object) null), 0.0f, 1, (Object) null);
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
            C13605k1.b(A.c(C5079j.f18125a.a(aVar, aVar2.b()), 0.0f, h.B((float) -16), 1, (Object) null), C13597i1.Primary, C13593h1.Large, k10, 432, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m(int i10, C4889m mVar, int i11) {
        l(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
