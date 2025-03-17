package com.sugarcube.app.base.ui.disclaimer;

import EK.C15673a;
import I0.L0;
import OE.C13313e;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16818i;
import XH.y;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import androidx.navigation.fragment.NavHostFragment;
import c1.c;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.app.base.network.NetworkStatus;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import iF.C14570j;
import iF.C14574n;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.i1;
import tK.C18030v;
import tK.Z;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/app/base/ui/disclaimer/UnavailableDisclaimerFragment;", "Landroidx/fragment/app/o;", "<init>", "()V", "LXH/N;", "v0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LOE/e;", "I", "LOE/e;", "t0", "()LOE/e;", "setInstallationConfig", "(LOE/e;)V", "installationConfig", "Lcom/sugarcube/app/base/network/NetworkClient;", "J", "Lcom/sugarcube/app/base/network/NetworkClient;", "u0", "()Lcom/sugarcube/app/base/network/NetworkClient;", "setNetworkClient", "(Lcom/sugarcube/app/base/network/NetworkClient;)V", "networkClient", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnavailableDisclaimerFragment extends Hilt_UnavailableDisclaimerFragment {

    /* renamed from: I  reason: collision with root package name */
    public C13313e f124130I;

    /* renamed from: J  reason: collision with root package name */
    public NetworkClient f124131J;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UnavailableDisclaimerFragment f124132a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.disclaimer.UnavailableDisclaimerFragment$a$a  reason: collision with other inner class name */
        static final class C3047a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ UnavailableDisclaimerFragment f124133a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.sugarcube.app.base.ui.disclaimer.UnavailableDisclaimerFragment$a$a$a  reason: collision with other inner class name */
            static final class C3048a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ UnavailableDisclaimerFragment f124134a;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
                @f(c = "com.sugarcube.app.base.ui.disclaimer.UnavailableDisclaimerFragment$onCreateView$2$1$1$1$2$1$1", f = "UnavailableDisclaimerFragment.kt", l = {62}, m = "invokeSuspend")
                /* renamed from: com.sugarcube.app.base.ui.disclaimer.UnavailableDisclaimerFragment$a$a$a$a  reason: collision with other inner class name */
                static final class C3049a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f124135c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ UnavailableDisclaimerFragment f124136d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C3049a(UnavailableDisclaimerFragment unavailableDisclaimerFragment, C17164e<? super C3049a> eVar) {
                        super(2, eVar);
                        this.f124136d = unavailableDisclaimerFragment;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C3049a(this.f124136d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C3049a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f124135c;
                        if (i10 == 0) {
                            y.b(obj);
                            NetworkClient u02 = this.f124136d.u0();
                            int c10 = this.f124136d.t0().c();
                            this.f124135c = 1;
                            if (NetworkClient.DefaultImpls.checkStatus$default(u02, c10, (Boolean) null, this, 2, (Object) null) == f10) {
                                return f10;
                            }
                        } else if (i10 == 1) {
                            y.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return C16807N.f139792a;
                    }
                }

                C3048a(UnavailableDisclaimerFragment unavailableDisclaimerFragment) {
                    this.f124134a = unavailableDisclaimerFragment;
                }

                /* access modifiers changed from: private */
                public static final C16807N e(UnavailableDisclaimerFragment unavailableDisclaimerFragment) {
                    unavailableDisclaimerFragment.v0();
                    return C16807N.f139792a;
                }

                /* access modifiers changed from: private */
                public static final C16807N f(UnavailableDisclaimerFragment unavailableDisclaimerFragment) {
                    F0 unused = C16314k.d(C5222z.a(unavailableDisclaimerFragment), (C17168i) null, (T) null, new C3049a(unavailableDisclaimerFragment, (C17164e<? super C3049a>) null), 3, (Object) null);
                    return C16807N.f139792a;
                }

                public final void c(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(977461619, i10, -1, "com.sugarcube.app.base.ui.disclaimer.UnavailableDisclaimerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UnavailableDisclaimerFragment.kt:54)");
                        }
                        C14570j.c cVar = C14570j.c.f127699g;
                        mVar.W(-2061893744);
                        boolean F10 = mVar.F(this.f124134a);
                        UnavailableDisclaimerFragment unavailableDisclaimerFragment = this.f124134a;
                        Object D10 = mVar.D();
                        if (F10 || D10 == C4889m.f14007a.a()) {
                            D10 = new f(unavailableDisclaimerFragment);
                            mVar.u(D10);
                        }
                        C17631a aVar = (C17631a) D10;
                        mVar.P();
                        mVar.W(-2061889911);
                        boolean F11 = mVar.F(this.f124134a);
                        UnavailableDisclaimerFragment unavailableDisclaimerFragment2 = this.f124134a;
                        Object D11 = mVar.D();
                        if (F11 || D11 == C4889m.f14007a.a()) {
                            D11 = new g(unavailableDisclaimerFragment2);
                            mVar.u(D11);
                        }
                        mVar.P();
                        C14574n.d(cVar, aVar, (C17631a) D11, mVar, 6);
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

            C3047a(UnavailableDisclaimerFragment unavailableDisclaimerFragment) {
                this.f124133a = unavailableDisclaimerFragment;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1444002761, i10, -1, "com.sugarcube.app.base.ui.disclaimer.UnavailableDisclaimerFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (UnavailableDisclaimerFragment.kt:53)");
                    }
                    L0.a((d) null, (i1) null, C18030v.f147664a.a(mVar, C18030v.f147665b).q0().c(), 0, (C5601g) null, 0.0f, c.e(977461619, true, new C3048a(this.f124133a), mVar, 54), mVar, 1572864, 59);
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

        a(UnavailableDisclaimerFragment unavailableDisclaimerFragment) {
            this.f124132a = unavailableDisclaimerFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1318247303, i10, -1, "com.sugarcube.app.base.ui.disclaimer.UnavailableDisclaimerFragment.onCreateView.<anonymous>.<anonymous> (UnavailableDisclaimerFragment.kt:51)");
                }
                Z.g(false, C15673a.a(), c.e(-1444002761, true, new C3047a(this.f124132a), mVar, 54), mVar, 390, 0);
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
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f124137a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124137a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124137a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f124137a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public final void v0() {
        NavHostFragment.f43464H.a(this).k0();
    }

    /* access modifiers changed from: private */
    public static final C16807N w0(UnavailableDisclaimerFragment unavailableDisclaimerFragment, NetworkStatus networkStatus) {
        if (!networkStatus.getOutage()) {
            unavailableDisclaimerFragment.v0();
        }
        return C16807N.f139792a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        u0().getNetworkStatus().observe(getViewLifecycleOwner(), new b(new uF.c(this)));
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new s1.c(viewLifecycleOwner));
        composeView.setContent(c.c(-1318247303, true, new a(this)));
        return composeView;
    }

    public final C13313e t0() {
        C13313e eVar = this.f124130I;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("installationConfig");
        return null;
    }

    public final NetworkClient u0() {
        NetworkClient networkClient = this.f124131J;
        if (networkClient != null) {
            return networkClient;
        }
        C17542s.z("networkClient");
        return null;
    }
}
