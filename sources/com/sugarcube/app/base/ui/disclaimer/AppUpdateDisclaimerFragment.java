package com.sugarcube.app.base.ui.disclaimer;

import EK.C15673a;
import I0.L0;
import JF.C13084F;
import OE.C13313e;
import OE.q;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5221y;
import androidx.navigation.fragment.NavHostFragment;
import c1.c;
import com.sugarcube.app.base.network.NetworkClient;
import iF.C14570j;
import iF.C14574n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5601g;
import nI.C17631a;
import nI.p;
import p1.i1;
import tK.C18030v;
import tK.Z;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/sugarcube/app/base/ui/disclaimer/AppUpdateDisclaimerFragment;", "Landroidx/fragment/app/o;", "<init>", "()V", "LXH/N;", "t0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LOE/e;", "I", "LOE/e;", "getInstallationConfig", "()LOE/e;", "setInstallationConfig", "(LOE/e;)V", "installationConfig", "Lcom/sugarcube/app/base/network/NetworkClient;", "J", "Lcom/sugarcube/app/base/network/NetworkClient;", "getNetworkClient", "()Lcom/sugarcube/app/base/network/NetworkClient;", "setNetworkClient", "(Lcom/sugarcube/app/base/network/NetworkClient;)V", "networkClient", "LOE/q;", "K", "LOE/q;", "s0", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppUpdateDisclaimerFragment extends Hilt_AppUpdateDisclaimerFragment {

    /* renamed from: I  reason: collision with root package name */
    public C13313e f124107I;

    /* renamed from: J  reason: collision with root package name */
    public NetworkClient f124108J;

    /* renamed from: K  reason: collision with root package name */
    public q f124109K;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AppUpdateDisclaimerFragment f124110a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.disclaimer.AppUpdateDisclaimerFragment$a$a  reason: collision with other inner class name */
        static final class C3043a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AppUpdateDisclaimerFragment f124111a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.sugarcube.app.base.ui.disclaimer.AppUpdateDisclaimerFragment$a$a$a  reason: collision with other inner class name */
            static final class C3044a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ AppUpdateDisclaimerFragment f124112a;

                C3044a(AppUpdateDisclaimerFragment appUpdateDisclaimerFragment) {
                    this.f124112a = appUpdateDisclaimerFragment;
                }

                /* access modifiers changed from: private */
                public static final C16807N e(AppUpdateDisclaimerFragment appUpdateDisclaimerFragment) {
                    appUpdateDisclaimerFragment.t0();
                    return C16807N.f139792a;
                }

                /* access modifiers changed from: private */
                public static final C16807N f(AppUpdateDisclaimerFragment appUpdateDisclaimerFragment) {
                    C5191t activity = appUpdateDisclaimerFragment.getActivity();
                    if (activity != null) {
                        C13084F.j(activity);
                    }
                    return C16807N.f139792a;
                }

                public final void c(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(-2087917825, i10, -1, "com.sugarcube.app.base.ui.disclaimer.AppUpdateDisclaimerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppUpdateDisclaimerFragment.kt:52)");
                        }
                        C14570j.a aVar = C14570j.a.f127697g;
                        mVar.W(47217622);
                        boolean F10 = mVar.F(this.f124112a);
                        AppUpdateDisclaimerFragment appUpdateDisclaimerFragment = this.f124112a;
                        Object D10 = mVar.D();
                        if (F10 || D10 == C4889m.f14007a.a()) {
                            D10 = new a(appUpdateDisclaimerFragment);
                            mVar.u(D10);
                        }
                        C17631a aVar2 = (C17631a) D10;
                        mVar.P();
                        mVar.W(47221320);
                        boolean F11 = mVar.F(this.f124112a);
                        AppUpdateDisclaimerFragment appUpdateDisclaimerFragment2 = this.f124112a;
                        Object D11 = mVar.D();
                        if (F11 || D11 == C4889m.f14007a.a()) {
                            D11 = new b(appUpdateDisclaimerFragment2);
                            mVar.u(D11);
                        }
                        mVar.P();
                        C14574n.d(aVar, aVar2, (C17631a) D11, mVar, 6);
                        if (C4895p.J()) {
                            C4895p.R();
                            return;
                        }
                        return;
                    }
                    mVar.L();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    c((C4889m) obj, ((Number) obj2).intValue());
                    return C16807N.f139792a;
                }
            }

            C3043a(AppUpdateDisclaimerFragment appUpdateDisclaimerFragment) {
                this.f124111a = appUpdateDisclaimerFragment;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(952126403, i10, -1, "com.sugarcube.app.base.ui.disclaimer.AppUpdateDisclaimerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (AppUpdateDisclaimerFragment.kt:51)");
                    }
                    L0.a((d) null, (i1) null, C18030v.f147664a.a(mVar, C18030v.f147665b).q0().c(), 0, (C5601g) null, 0.0f, c.e(-2087917825, true, new C3044a(this.f124111a), mVar, 54), mVar, 1572864, 59);
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

        a(AppUpdateDisclaimerFragment appUpdateDisclaimerFragment) {
            this.f124110a = appUpdateDisclaimerFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(95264005, i10, -1, "com.sugarcube.app.base.ui.disclaimer.AppUpdateDisclaimerFragment.onCreateView.<anonymous>.<anonymous> (AppUpdateDisclaimerFragment.kt:49)");
                }
                Z.g(false, C15673a.a(), c.e(952126403, true, new C3043a(this.f124110a), mVar, 54), mVar, 390, 0);
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

    /* access modifiers changed from: private */
    public final void t0() {
        NavHostFragment.f43464H.a(this).k0();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        s0().b().galleryUpgradeWall();
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new s1.c(viewLifecycleOwner));
        composeView.setContent(c.c(95264005, true, new a(this)));
        return composeView;
    }

    public final q s0() {
        q qVar = this.f124109K;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }
}
