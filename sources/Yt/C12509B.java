package yt;

import E1.I;
import Et.a;
import G1.C4504g;
import J1.j;
import ND.C13284f;
import QJ.Q;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import SC.C13651w0;
import SC.W1;
import SC.Z1;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.L;
import U0.M;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.compose.ui.platform.C5135u0;
import androidx.compose.ui.window.h;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import e.C5281d;
import h9.C7940a;
import h9.C7945f;
import h9.C7946g;
import h9.C7947h;
import i1.C5437c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import p1.i1;
import tK.C18029u;
import tK.C18030v;
import yt.f;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001ay\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2*\u0010\u0012\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00110\u000e2\u0016\u0010\u0013\u001a\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00060\u00042\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000eH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001ay\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2*\u0010\u0012\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00110\u000e2\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00060\u00042\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000eH\u0003¢\u0006\u0004\b\u0017\u0010\u0016\u001a?\u0010\u001c\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000eH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010!\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001eH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020#*\u00020#H\u0002¢\u0006\u0004\b$\u0010%*\f\b\u0002\u0010&\"\u00020\u000f2\u00020\u000f¨\u0006+²\u0006\u000e\u0010'\u001a\u00020\u00118\n@\nX\u0002²\u0006\f\u0010)\u001a\u00020(8\nX\u0002²\u0006\u000e\u0010*\u001a\u00020\u00118\n@\nX\u0002²\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00188\n@\nX\u0002"}, d2 = {"LEt/a;", "viewModel", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "Lyt/f;", "LXH/N;", "action", "u", "(LEt/a;Landroidx/lifecycle/y;LnI/l;LU0/m;II)V", "P", "(LU0/m;I)V", "", "url", "Lkotlin/Function2;", "Lyt/f$c;", "Lcom/ingka/ikea/instore/impl/foodmobile/composable/RedirectActions;", "", "shouldOverrideUrlLoading", "redirectAction", "onNavigateBack", "s", "(Ljava/lang/String;LnI/p;LnI/l;LnI/p;LU0/m;I)V", "K", "Landroid/webkit/WebView;", "webView", "Lh9/g;", "navigator", "R", "(Landroid/webkit/WebView;Lh9/g;LnI/p;LU0/m;I)V", "Lkotlin/Function0;", "continueClicked", "exitClicked", "q", "(LnI/a;LnI/a;LU0/m;I)V", "Landroidx/compose/ui/d;", "W", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "RedirectActions", "showConfirmExitDialog", "LEt/a$b;", "state", "changeStoreClicked", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yt.B  reason: case insensitive filesystem */
public final class C12509B {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yt.B$a */
    /* synthetic */ class a extends C17540p implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Et.a f107270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<f, C16807N> f107271b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f107272c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Et.a aVar, C17642l<? super f, C16807N> lVar, C4899r0<Boolean> r0Var) {
            super(0, C17542s.a.class, "handleClose", "FoodMobileScreen$handleClose(Lcom/ingka/ikea/instore/impl/foodmobile/viewmodel/FoodMobileViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V", 0);
            this.f107270a = aVar;
            this.f107271b = lVar;
            this.f107272c = r0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            C12509B.v(this.f107270a, this.f107271b, this.f107272c);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"yt/B$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yt.B$b */
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5221y f107273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5218v f107274b;

        public b(C5221y yVar, C5218v vVar) {
            this.f107273a = yVar;
            this.f107274b = vVar;
        }

        public void b() {
            this.f107273a.getLifecycle().g(this.f107274b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yt.B$c */
    /* synthetic */ class c extends C17540p implements p<String, C17642l<? super f.c, ? extends C16807N>, Boolean> {
        c(Object obj) {
            super(2, obj, Et.a.class, "shouldOverrideUrlLoading", "shouldOverrideUrlLoading(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(String str, C17642l<? super f.c, C16807N> lVar) {
            C17542s.j(lVar, "p1");
            return Boolean.valueOf(((Et.a) this.receiver).z(str, lVar));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yt.B$d */
    static final class d implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f107275a = new d();

        d() {
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$composed");
            mVar.W(-827962178);
            if (C4895p.J()) {
                C4895p.S(-827962178, i10, -1, "com.ingka.ikea.instore.impl.foodmobile.composable.backdrop.<anonymous> (FoodMobileScreen.kt:314)");
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

    /* access modifiers changed from: private */
    public static final C16807N A(Et.a aVar, C17642l lVar, C4899r0 r0Var, C4899r0 r0Var2, f.c cVar) {
        C17542s.j(cVar, "it");
        if (!(cVar instanceof f.c.a) || aVar.u()) {
            lVar.invoke(cVar);
        } else {
            x(r0Var, true);
            I(r0Var2, true);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(Et.a aVar, String str, String str2) {
        if (!(str == null || str2 == null)) {
            aVar.b(new a.C1545a.C1546a(str, str2));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(Et.a aVar, C4899r0 r0Var) {
        aVar.b(a.C1545a.d.f80785a);
        I(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(Et.a aVar, C17642l lVar, C4899r0 r0Var) {
        aVar.b(a.C1545a.b.f80783a);
        if (w(r0Var)) {
            x(r0Var, false);
            lVar.invoke(f.c.a.f107289a);
        } else {
            lVar.invoke(f.b.f107288a);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(Et.a aVar, C5221y yVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        u(aVar, yVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final L F(C5221y yVar, Et.a aVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        C12508A a10 = new C12508A(aVar);
        yVar.getLifecycle().c(a10);
        return new b(yVar, a10);
    }

    /* access modifiers changed from: private */
    public static final void G(Et.a aVar, C5221y yVar, r.a aVar2) {
        C17542s.j(yVar, "<unused var>");
        C17542s.j(aVar2, "event");
        if (aVar2 == r.a.ON_DESTROY) {
            aVar.b(a.C1545a.g.f80788a);
        }
    }

    private static final boolean H(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void I(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final a.b J(A1<a.b> a12) {
        return a12.getValue();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private static final void K(String str, p<? super String, ? super C17642l<? super f.c, C16807N>, Boolean> pVar, C17642l<? super f.c, C16807N> lVar, p<? super String, ? super String, C16807N> pVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        p<? super String, ? super C17642l<? super f.c, C16807N>, Boolean> pVar3 = pVar;
        C17642l<? super f.c, C16807N> lVar2 = lVar;
        p<? super String, ? super String, C16807N> pVar4 = pVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(-2050656841);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2050656841, i11, -1, "com.ingka.ikea.instore.impl.foodmobile.composable.FoodMobileWebView (FoodMobileScreen.kt:199)");
            }
            C7947h d10 = C7945f.d(str2, (Map<String, String>) null, k10, i11 & 14, 2);
            k10.W(-787131796);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = new C12510C(pVar3, lVar2);
                k10.u(D10);
            }
            C12510C c10 = (C12510C) D10;
            k10.P();
            C7946g c11 = C7945f.c((Q) null, k10, 0, 1);
            k10.W(-787125374);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = u1.e((Object) null, (o1) null, 2, (Object) null);
                k10.u(D11);
            }
            C4899r0 r0Var = (C4899r0) D11;
            k10.P();
            R(L(r0Var), c11, pVar4, k10, (i11 >> 3) & 896);
            androidx.compose.ui.d f10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
            k10.W(-787114459);
            Object D12 = k10.D();
            if (D12 == aVar.a()) {
                D12 = new o(r0Var);
                k10.u(D12);
            }
            k10.P();
            C7947h hVar = d10;
            mVar2 = k10;
            C13284f.f(hVar, f10, false, c11, (C17642l) D12, (C17642l<? super WebView, C16807N>) null, c10, (C7940a) null, (C17642l<? super Context, ? extends WebView>) null, k10, 1597872, 416);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new p(str, pVar, lVar, pVar2, i10));
        }
    }

    private static final WebView L(C4899r0<WebView> r0Var) {
        return r0Var.getValue();
    }

    private static final void M(C4899r0<WebView> r0Var, WebView webView) {
        r0Var.setValue(webView);
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C4899r0 r0Var, WebView webView) {
        C17542s.j(webView, "view");
        M(r0Var, webView);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(String str, p pVar, C17642l lVar, p pVar2, int i10, C4889m mVar, int i11) {
        K(str, pVar, lVar, pVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void P(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-1617956907);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1617956907, i10, -1, "com.ingka.ikea.instore.impl.foodmobile.composable.FullScreenLoading (FoodMobileScreen.kt:159)");
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
            n10.a(new n(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(int i10, C4889m mVar, int i11) {
        P(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void R(WebView webView, C7946g gVar, p<? super String, ? super String, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1085550489);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(webView) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(gVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(pVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1085550489, i11, -1, "com.ingka.ikea.instore.impl.foodmobile.composable.TrackWebViewBackPress (FoodMobileScreen.kt:229)");
            }
            boolean b10 = gVar.b();
            k10.W(1074303750);
            boolean F10 = ((i11 & 896) == 256) | k10.F(webView);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new q(webView, pVar);
                k10.u(D10);
            }
            k10.P();
            C5281d.a(b10, (C17631a) D10, k10, 0, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new r(webView, gVar, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N S(WebView webView, p pVar) {
        WebHistoryItem itemAtIndex;
        WebHistoryItem currentItem;
        String str = null;
        WebBackForwardList copyBackForwardList = webView != null ? webView.copyBackForwardList() : null;
        String url = (copyBackForwardList == null || (currentItem = copyBackForwardList.getCurrentItem()) == null) ? null : currentItem.getUrl();
        int max = Math.max(copyBackForwardList != null ? copyBackForwardList.getCurrentIndex() - 1 : 0, 0);
        if (!(copyBackForwardList == null || (itemAtIndex = copyBackForwardList.getItemAtIndex(max)) == null)) {
            str = itemAtIndex.getUrl();
        }
        if (!(url == null || str == null)) {
            pVar.invoke(Uri.parse(url).getPath(), Uri.parse(str).getPath());
        }
        if (webView != null) {
            webView.goBack();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T(WebView webView, C7946g gVar, p pVar, int i10, C4889m mVar, int i11) {
        R(webView, gVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final androidx.compose.ui.d W(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.c(dVar, (C17642l) null, d.f107275a, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void q(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(230736468);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(230736468, i11, -1, "com.ingka.ikea.instore.impl.foodmobile.composable.ConfirmExitDialog (FoodMobileScreen.kt:258)");
            }
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d W10 = W(J.f(aVar3, 0.0f, 1, (Object) null));
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, W10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar4.a();
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
            F1.c(a12, h10, aVar4.c());
            F1.c(a12, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar4.d());
            C5079j jVar = C5079j.f18125a;
            androidx.compose.ui.d a13 = C5116k1.a(aVar3, "DONT_LOSE_ORDER_DIALOG");
            String b11 = j.b(st.c.f102743W, k10, 0);
            W1 w12 = new W1(j.b(st.c.f102739U, k10, 0), aVar2);
            W1 w13 = new W1(j.b(st.c.f102737T, k10, 0), aVar);
            C13651w0 w0Var = C13651w0.Stacked;
            p<C4889m, Integer, C16807N> a14 = C12511a.f107278a.a();
            int i12 = W1.f116045c;
            Z1.c(b11, w12, w13, aVar, a13, w0Var, (h) null, a14, k10, (i12 << 6) | (i12 << 3) | 12804096 | ((i11 << 9) & 7168), 64);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new z(aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        q(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void s(String str, p<? super String, ? super C17642l<? super f.c, C16807N>, Boolean> pVar, C17642l<? super f.c, C16807N> lVar, p<? super String, ? super String, C16807N> pVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-50127529);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(pVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-50127529, i11, -1, "com.ingka.ikea.instore.impl.foodmobile.composable.FoodMobileContent (FoodMobileScreen.kt:177)");
            }
            if (!((Boolean) k10.Q(C5135u0.a())).booleanValue()) {
                k10.W(296588693);
                K(str, pVar, lVar, pVar2, k10, i11 & 8190);
                k10.P();
            } else {
                k10.W(296801973);
                C5077h.a(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), k10, 6);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new m(str, pVar, lVar, pVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N t(String str, p pVar, C17642l lVar, p pVar2, int i10, C4889m mVar, int i11) {
        s(str, pVar, lVar, pVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: uI.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: nI.p} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0098, code lost:
        if ((r38 & 2) != 0) goto L_0x009a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void u(Et.a r33, androidx.lifecycle.C5221y r34, nI.C17642l<? super yt.f, XH.C16807N> r35, U0.C4889m r36, int r37, int r38) {
        /*
            r1 = r33
            r3 = r35
            r4 = r37
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            r0 = 1006179116(0x3bf9132c, float:0.0076011624)
            r2 = r36
            U0.m r2 = r2.k(r0)
            int r15 = r2.a()
            r14 = 1
            r5 = r38 & 1
            r12 = 2
            r13 = 4
            if (r5 == 0) goto L_0x0027
            r5 = r4 | 6
            goto L_0x0040
        L_0x0027:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x003f
            r5 = r4 & 8
            if (r5 != 0) goto L_0x0034
            boolean r5 = r2.V(r1)
            goto L_0x0038
        L_0x0034:
            boolean r5 = r2.F(r1)
        L_0x0038:
            if (r5 == 0) goto L_0x003c
            r5 = r13
            goto L_0x003d
        L_0x003c:
            r5 = r12
        L_0x003d:
            r5 = r5 | r4
            goto L_0x0040
        L_0x003f:
            r5 = r4
        L_0x0040:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x0059
            r6 = r38 & 2
            if (r6 != 0) goto L_0x0053
            r6 = r34
            boolean r7 = r2.F(r6)
            if (r7 == 0) goto L_0x0055
            r7 = 32
            goto L_0x0057
        L_0x0053:
            r6 = r34
        L_0x0055:
            r7 = 16
        L_0x0057:
            r5 = r5 | r7
            goto L_0x005b
        L_0x0059:
            r6 = r34
        L_0x005b:
            r7 = r38 & 4
            r11 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0064
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0064:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0073
            boolean r7 = r2.F(r3)
            if (r7 == 0) goto L_0x0070
            r7 = r11
            goto L_0x0072
        L_0x0070:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r5 = r5 | r7
        L_0x0073:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0085
            boolean r7 = r2.l()
            if (r7 != 0) goto L_0x0080
            goto L_0x0085
        L_0x0080:
            r2.L()
            goto L_0x0434
        L_0x0085:
            r2.G()
            r7 = r4 & 1
            if (r7 == 0) goto L_0x009f
            boolean r7 = r2.O()
            if (r7 == 0) goto L_0x0093
            goto L_0x009f
        L_0x0093:
            r2.L()
            r7 = r38 & 2
            if (r7 == 0) goto L_0x009c
        L_0x009a:
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x009c:
            r9 = r5
            r10 = r6
            goto L_0x00ae
        L_0x009f:
            r7 = r38 & 2
            if (r7 == 0) goto L_0x009c
            U0.I0 r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            java.lang.Object r6 = r2.Q(r6)
            androidx.lifecycle.y r6 = (androidx.lifecycle.C5221y) r6
            goto L_0x009a
        L_0x00ae:
            r2.y()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00bd
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.instore.impl.foodmobile.composable.FoodMobileScreen (FoodMobileScreen.kt:68)"
            U0.C4895p.S(r0, r9, r5, r6)
        L_0x00bd:
            r0 = 0
            yl.C12376c.c(r2, r0)
            r5 = -125446801(0xfffffffff885d56f, float:-2.1715763E34)
            r2.W(r5)
            r8 = r9 & 14
            if (r8 == r13) goto L_0x00d8
            r5 = r9 & 8
            if (r5 == 0) goto L_0x00d6
            boolean r5 = r2.F(r1)
            if (r5 == 0) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            r5 = r0
            goto L_0x00d9
        L_0x00d8:
            r5 = r14
        L_0x00d9:
            boolean r6 = r2.F(r10)
            r5 = r5 | r6
            java.lang.Object r6 = r2.D()
            if (r5 != 0) goto L_0x00ec
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00f4
        L_0x00ec:
            yt.l r6 = new yt.l
            r6.<init>(r10, r1)
            r2.u(r6)
        L_0x00f4:
            nI.l r6 = (nI.C17642l) r6
            r2.P()
            int r5 = r9 >> 3
            r5 = r5 & 14
            U0.P.c(r10, r6, r2, r5)
            r5 = -125434704(0xfffffffff88604b0, float:-2.1745714E34)
            r2.W(r5)
            java.lang.Object r5 = r2.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r6 = r17.a()
            r7 = 0
            if (r5 != r6) goto L_0x011c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            U0.r0 r5 = U0.u1.e(r5, r7, r12, r7)
            r2.u(r5)
        L_0x011c:
            r6 = r5
            U0.r0 r6 = (U0.C4899r0) r6
            r2.P()
            r5 = -125424229(0xfffffffff8862d9b, float:-2.177165E34)
            r2.W(r5)
            if (r8 == r13) goto L_0x0137
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0135
            boolean r5 = r2.F(r1)
            if (r5 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r5 = r0
            goto L_0x0138
        L_0x0137:
            r5 = r14
        L_0x0138:
            r36 = r15
            r15 = r9 & 896(0x380, float:1.256E-42)
            if (r15 != r11) goto L_0x0141
            r16 = r14
            goto L_0x0143
        L_0x0141:
            r16 = r0
        L_0x0143:
            r5 = r5 | r16
            java.lang.Object r7 = r2.D()
            if (r5 != 0) goto L_0x0151
            java.lang.Object r5 = r17.a()
            if (r7 != r5) goto L_0x0159
        L_0x0151:
            yt.B$a r7 = new yt.B$a
            r7.<init>(r1, r3, r6)
            r2.u(r7)
        L_0x0159:
            uI.h r7 = (uI.C18059h) r7
            r2.P()
            nI.a r7 = (nI.C17631a) r7
            e.C5281d.a(r0, r7, r2, r0, r14)
            r5 = -125422575(0xfffffffff8863411, float:-2.1775744E34)
            r2.W(r5)
            if (r8 == r13) goto L_0x0178
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0176
            boolean r5 = r2.F(r1)
            if (r5 == 0) goto L_0x0176
            goto L_0x0178
        L_0x0176:
            r5 = r0
            goto L_0x0179
        L_0x0178:
            r5 = r14
        L_0x0179:
            java.lang.Object r7 = r2.D()
            if (r5 != 0) goto L_0x0185
            java.lang.Object r5 = r17.a()
            if (r7 != r5) goto L_0x018d
        L_0x0185:
            yt.B$c r7 = new yt.B$c
            r7.<init>(r1)
            r2.u(r7)
        L_0x018d:
            r18 = r7
            uI.h r18 = (uI.C18059h) r18
            r2.P()
            TJ.P r5 = r33.getState()
            r16 = r9 & 112(0x70, float:1.57E-43)
            r19 = 6
            r7 = 0
            r20 = 0
            r21 = r6
            r6 = r10
            r14 = 0
            r23 = r8
            r8 = r20
            r20 = r9
            r9 = r2
            r24 = r10
            r10 = r16
            r11 = r19
            U0.A1 r19 = j3.a.c(r5, r6, r7, r8, r9, r10, r11)
            r5 = -125418000(0xfffffffff88645f0, float:-2.1787071E34)
            r2.W(r5)
            java.lang.Object r5 = r2.D()
            java.lang.Object r6 = r17.a()
            if (r5 != r6) goto L_0x01cd
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            U0.r0 r5 = U0.u1.e(r5, r14, r12, r14)
            r2.u(r5)
        L_0x01cd:
            r14 = r5
            U0.r0 r14 = (U0.C4899r0) r14
            r2.P()
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r2, r0)
            int r7 = U0.C4883j.a(r2, r0)
            U0.y r8 = r2.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r2, r5)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r2.m()
            if (r11 != 0) goto L_0x0200
            U0.C4883j.c()
        L_0x0200:
            r2.I()
            boolean r11 = r2.i()
            if (r11 == 0) goto L_0x020d
            r2.p(r10)
            goto L_0x0210
        L_0x020d:
            r2.t()
        L_0x0210:
            U0.m r10 = U0.F1.a(r2)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r9.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r9.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x023a
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x0248
        L_0x023a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x0248:
            nI.p r6 = r9.d()
            U0.F1.c(r10, r5, r6)
            s0.h r5 = s0.C5862h.f28810a
            r5 = -1292302513(0xffffffffb2f9074f, float:-2.8990739E-8)
            r2.W(r5)
            ol.v r5 = ol.v.CLOSE
            r6 = 2036525170(0x7962e872, float:7.3635853E34)
            r2.W(r6)
            r12 = r23
            if (r12 == r13) goto L_0x0272
            r6 = r20 & 8
            if (r6 == 0) goto L_0x026e
            boolean r6 = r2.F(r1)
            if (r6 == 0) goto L_0x026e
            goto L_0x0272
        L_0x026e:
            r6 = r0
        L_0x026f:
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0274
        L_0x0272:
            r6 = 1
            goto L_0x026f
        L_0x0274:
            if (r15 != r11) goto L_0x0278
            r7 = 1
            goto L_0x0279
        L_0x0278:
            r7 = r0
        L_0x0279:
            r6 = r6 | r7
            java.lang.Object r7 = r2.D()
            if (r6 != 0) goto L_0x028a
            java.lang.Object r6 = r17.a()
            if (r7 != r6) goto L_0x0287
            goto L_0x028a
        L_0x0287:
            r10 = r21
            goto L_0x0294
        L_0x028a:
            yt.s r7 = new yt.s
            r10 = r21
            r7.<init>(r1, r3, r10)
            r2.u(r7)
        L_0x0294:
            r6 = r7
            nI.a r6 = (nI.C17631a) r6
            r2.P()
            Et.a$b r7 = J(r19)
            java.lang.String r8 = r7.d()
            r16 = 6
            r21 = 500(0x1f4, float:7.0E-43)
            r7 = 0
            r9 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = r10
            r10 = r23
            r11 = r25
            r29 = r12
            r12 = r26
            r13 = r27
            r30 = r14
            r22 = 1
            r14 = r2
            r31 = r36
            r32 = r15
            r15 = r16
            r16 = r21
            ol.p.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            Et.a$b r5 = J(r19)
            boolean r5 = r5.c()
            if (r5 == 0) goto L_0x02ef
            r5 = -1292038270(0xffffffffb2fd0f82, float:-2.9460129E-8)
            r2.W(r5)
            P(r2, r0)
            r2.P()
            r14 = r28
            r12 = r29
            r0 = r30
            r15 = r32
            r11 = 4
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x03b2
        L_0x02ef:
            r5 = -1291937644(0xffffffffb2fe9894, float:-2.9638876E-8)
            r2.W(r5)
            Et.a$b r5 = J(r19)
            java.lang.String r5 = r5.e()
            if (r5 != 0) goto L_0x0327
            r6 = r31
            r2.q(r6)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x030d
            U0.C4895p.R()
        L_0x030d:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x0326
            yt.t r7 = new yt.t
            r0 = r7
            r1 = r33
            r2 = r24
            r3 = r35
            r4 = r37
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0326:
            return
        L_0x0327:
            r6 = r18
            nI.p r6 = (nI.p) r6
            r7 = 2036541837(0x7963298d, float:7.3718384E34)
            r2.W(r7)
            r12 = r29
            r11 = 4
            if (r12 == r11) goto L_0x0347
            r7 = r20 & 8
            if (r7 == 0) goto L_0x0341
            boolean r7 = r2.F(r1)
            if (r7 == 0) goto L_0x0341
            goto L_0x0347
        L_0x0341:
            r14 = r0
        L_0x0342:
            r15 = r32
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x034a
        L_0x0347:
            r14 = r22
            goto L_0x0342
        L_0x034a:
            if (r15 != r13) goto L_0x034f
            r7 = r22
            goto L_0x0350
        L_0x034f:
            r7 = r0
        L_0x0350:
            r7 = r7 | r14
            java.lang.Object r8 = r2.D()
            if (r7 != 0) goto L_0x0363
            java.lang.Object r7 = r17.a()
            if (r8 != r7) goto L_0x035e
            goto L_0x0363
        L_0x035e:
            r14 = r28
            r10 = r30
            goto L_0x036f
        L_0x0363:
            yt.u r8 = new yt.u
            r14 = r28
            r10 = r30
            r8.<init>(r1, r3, r10, r14)
            r2.u(r8)
        L_0x036f:
            r7 = r8
            nI.l r7 = (nI.C17642l) r7
            r2.P()
            r8 = 2036556210(0x796361b2, float:7.3789555E34)
            r2.W(r8)
            if (r12 == r11) goto L_0x038a
            r8 = r20 & 8
            if (r8 == 0) goto L_0x0388
            boolean r8 = r2.F(r1)
            if (r8 == 0) goto L_0x0388
            goto L_0x038a
        L_0x0388:
            r8 = r0
            goto L_0x038c
        L_0x038a:
            r8 = r22
        L_0x038c:
            java.lang.Object r9 = r2.D()
            if (r8 != 0) goto L_0x0398
            java.lang.Object r8 = r17.a()
            if (r9 != r8) goto L_0x03a0
        L_0x0398:
            yt.v r9 = new yt.v
            r9.<init>(r1)
            r2.u(r9)
        L_0x03a0:
            r8 = r9
            nI.p r8 = (nI.p) r8
            r2.P()
            r16 = 0
            r9 = r2
            r0 = r10
            r10 = r16
            s(r5, r6, r7, r8, r9, r10)
            r2.P()
        L_0x03b2:
            r2.P()
            r2.x()
            boolean r5 = H(r14)
            if (r5 == 0) goto L_0x0429
            r5 = -125369717(0xfffffffff887028b, float:-2.1906614E34)
            r2.W(r5)
            if (r12 == r11) goto L_0x03d3
            r5 = r20 & 8
            if (r5 == 0) goto L_0x03d1
            boolean r5 = r2.F(r1)
            if (r5 == 0) goto L_0x03d1
            goto L_0x03d3
        L_0x03d1:
            r5 = 0
            goto L_0x03d5
        L_0x03d3:
            r5 = r22
        L_0x03d5:
            java.lang.Object r6 = r2.D()
            if (r5 != 0) goto L_0x03e1
            java.lang.Object r5 = r17.a()
            if (r6 != r5) goto L_0x03e9
        L_0x03e1:
            yt.w r6 = new yt.w
            r6.<init>(r1, r14)
            r2.u(r6)
        L_0x03e9:
            nI.a r6 = (nI.C17631a) r6
            r2.P()
            r5 = -125364571(0xfffffffff88716a5, float:-2.1919355E34)
            r2.W(r5)
            if (r12 == r11) goto L_0x0403
            r5 = r20 & 8
            if (r5 == 0) goto L_0x0401
            boolean r5 = r2.F(r1)
            if (r5 == 0) goto L_0x0401
            goto L_0x0403
        L_0x0401:
            r14 = 0
            goto L_0x0405
        L_0x0403:
            r14 = r22
        L_0x0405:
            if (r15 != r13) goto L_0x0408
            goto L_0x040a
        L_0x0408:
            r22 = 0
        L_0x040a:
            r5 = r14 | r22
            java.lang.Object r7 = r2.D()
            if (r5 != 0) goto L_0x0418
            java.lang.Object r5 = r17.a()
            if (r7 != r5) goto L_0x0420
        L_0x0418:
            yt.x r7 = new yt.x
            r7.<init>(r1, r3, r0)
            r2.u(r7)
        L_0x0420:
            nI.a r7 = (nI.C17631a) r7
            r2.P()
            r0 = 0
            q(r6, r7, r2, r0)
        L_0x0429:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0432
            U0.C4895p.R()
        L_0x0432:
            r6 = r24
        L_0x0434:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x044c
            yt.y r8 = new yt.y
            r0 = r8
            r1 = r33
            r2 = r6
            r3 = r35
            r4 = r37
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x044c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.C12509B.u(Et.a, androidx.lifecycle.y, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void v(Et.a aVar, C17642l<? super f, C16807N> lVar, C4899r0<Boolean> r0Var) {
        if (aVar.u()) {
            aVar.b(a.C1545a.e.f80786a);
            lVar.invoke(f.a.f107287a);
            return;
        }
        I(r0Var, true);
    }

    private static final boolean w(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void x(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N y(Et.a aVar, C17642l lVar, C4899r0 r0Var) {
        aVar.b(a.C1545a.c.f80784a);
        v(aVar, lVar, r0Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(Et.a aVar, C5221y yVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        u(aVar, yVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
