package com.sugarcube.app.base.ui.disclaimer;

import EK.C15673a;
import I0.L0;
import JF.T;
import OE.C13313e;
import OE.n;
import OE.q;
import U0.C4889m;
import U0.C4895p;
import VE.C13760b;
import XH.C16807N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
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

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/sugarcube/app/base/ui/disclaimer/DeviceBlacklistDisclaimerFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "LXH/N;", "v0", "t0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "LOE/e;", "J", "LOE/e;", "getInstallationConfig", "()LOE/e;", "setInstallationConfig", "(LOE/e;)V", "installationConfig", "Lcom/sugarcube/app/base/network/NetworkClient;", "K", "Lcom/sugarcube/app/base/network/NetworkClient;", "getNetworkClient", "()Lcom/sugarcube/app/base/network/NetworkClient;", "setNetworkClient", "(Lcom/sugarcube/app/base/network/NetworkClient;)V", "networkClient", "LOE/q;", "L", "LOE/q;", "u0", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceBlacklistDisclaimerFragment extends e implements SystemUiDelegate {

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f124113I = new T();

    /* renamed from: J  reason: collision with root package name */
    public C13313e f124114J;

    /* renamed from: K  reason: collision with root package name */
    public NetworkClient f124115K;

    /* renamed from: L  reason: collision with root package name */
    public q f124116L;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeviceBlacklistDisclaimerFragment f124117a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.disclaimer.DeviceBlacklistDisclaimerFragment$a$a  reason: collision with other inner class name */
        static final class C3045a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ DeviceBlacklistDisclaimerFragment f124118a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.sugarcube.app.base.ui.disclaimer.DeviceBlacklistDisclaimerFragment$a$a$a  reason: collision with other inner class name */
            static final class C3046a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ DeviceBlacklistDisclaimerFragment f124119a;

                C3046a(DeviceBlacklistDisclaimerFragment deviceBlacklistDisclaimerFragment) {
                    this.f124119a = deviceBlacklistDisclaimerFragment;
                }

                /* access modifiers changed from: private */
                public static final C16807N e(DeviceBlacklistDisclaimerFragment deviceBlacklistDisclaimerFragment) {
                    deviceBlacklistDisclaimerFragment.v0();
                    return C16807N.f139792a;
                }

                /* access modifiers changed from: private */
                public static final C16807N f(DeviceBlacklistDisclaimerFragment deviceBlacklistDisclaimerFragment) {
                    deviceBlacklistDisclaimerFragment.t0();
                    return C16807N.f139792a;
                }

                public final void c(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(-1654376187, i10, -1, "com.sugarcube.app.base.ui.disclaimer.DeviceBlacklistDisclaimerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeviceBlacklistDisclaimerFragment.kt:61)");
                        }
                        C14570j.b bVar = C14570j.b.f127698g;
                        mVar.W(-1266197191);
                        boolean F10 = mVar.F(this.f124119a);
                        DeviceBlacklistDisclaimerFragment deviceBlacklistDisclaimerFragment = this.f124119a;
                        Object D10 = mVar.D();
                        if (F10 || D10 == C4889m.f14007a.a()) {
                            D10 = new c(deviceBlacklistDisclaimerFragment);
                            mVar.u(D10);
                        }
                        C17631a aVar = (C17631a) D10;
                        mVar.P();
                        mVar.W(-1266193503);
                        boolean F11 = mVar.F(this.f124119a);
                        DeviceBlacklistDisclaimerFragment deviceBlacklistDisclaimerFragment2 = this.f124119a;
                        Object D11 = mVar.D();
                        if (F11 || D11 == C4889m.f14007a.a()) {
                            D11 = new d(deviceBlacklistDisclaimerFragment2);
                            mVar.u(D11);
                        }
                        mVar.P();
                        C14574n.d(bVar, aVar, (C17631a) D11, mVar, 6);
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

            C3045a(DeviceBlacklistDisclaimerFragment deviceBlacklistDisclaimerFragment) {
                this.f124118a = deviceBlacklistDisclaimerFragment;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-386754615, i10, -1, "com.sugarcube.app.base.ui.disclaimer.DeviceBlacklistDisclaimerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (DeviceBlacklistDisclaimerFragment.kt:60)");
                    }
                    L0.a((d) null, (i1) null, C18030v.f147664a.a(mVar, C18030v.f147665b).q0().c(), 0, (C5601g) null, 0.0f, c.e(-1654376187, true, new C3046a(this.f124118a), mVar, 54), mVar, 1572864, 59);
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

        a(DeviceBlacklistDisclaimerFragment deviceBlacklistDisclaimerFragment) {
            this.f124117a = deviceBlacklistDisclaimerFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1388964341, i10, -1, "com.sugarcube.app.base.ui.disclaimer.DeviceBlacklistDisclaimerFragment.onCreateView.<anonymous>.<anonymous> (DeviceBlacklistDisclaimerFragment.kt:58)");
                }
                Z.g(false, C15673a.a(), c.e(-386754615, true, new C3045a(this.f124117a), mVar, 54), mVar, 390, 0);
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
        String d10 = C13760b.f117438d.d(u0().getCountry(), u0().getLanguage());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TITLE", n.f113462t5);
        intent.putExtra("android.intent.extra.TEXT", d10);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    /* access modifiers changed from: private */
    public final void v0() {
        NavHostFragment.f43464H.a(this).k0();
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f124113I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SystemUiDelegate.a.a(this, requireActivity, viewLifecycleOwner, true, true, (Integer) null, 16, (Object) null);
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new s1.c(viewLifecycleOwner2));
        composeView.setContent(c.c(-1388964341, true, new a(this)));
        return composeView;
    }

    public final q u0() {
        q qVar = this.f124116L;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }
}
