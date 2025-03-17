package com.sugarcube.app.base.ui.ultrawide;

import OE.n;
import QE.T;
import XH.C16807N;
import XH.C16818i;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.L;
import androidx.lifecycle.e0;
import com.google.android.material.snackbar.Snackbar;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.K;
import nI.C17642l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0011\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000bJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u001b8BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideDoneFragment;", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideFragment;", "<init>", "()V", "", "isLoggedIn", "LXH/N;", "J0", "(Z)V", "V0", "T0", "()LXH/N;", "U0", "W0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "LQE/T;", "P", "LQE/T;", "_binding", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "Q", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "K0", "()Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "setAccountInteractions", "(Lcom/sugarcube/app/base/external/interactions/AccountInteractions;)V", "accountInteractions", "L0", "()LQE/T;", "binding", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawideDoneFragment extends C14290c {

    /* renamed from: P  reason: collision with root package name */
    private T f125470P;

    /* renamed from: Q  reason: collision with root package name */
    public AccountInteractions f125471Q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f125472a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f125472a = lVar;
        }

        public final C16818i<?> c() {
            return this.f125472a;
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
            this.f125472a.invoke(obj);
        }
    }

    private final void J0(boolean z10) {
        T L02 = L0();
        if (z10) {
            L02.f114447g.setVisibility(0);
            L02.f114442b.setText(getText(n.f113465u1));
            L02.f114445e.setVisibility(8);
            return;
        }
        L02.f114445e.setVisibility(0);
        L02.f114442b.setText(getText(n.f113282T0));
        L02.f114447g.setVisibility(8);
    }

    private final T L0() {
        T t10 = this.f125470P;
        C17542s.g(t10);
        return t10;
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(UltrawideDoneFragment ultrawideDoneFragment, K k10, Boolean bool) {
        C17542s.g(bool);
        ultrawideDoneFragment.J0(bool.booleanValue());
        if (bool.booleanValue() && k10.f144344a) {
            k10.f144344a = false;
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void N0(UltrawideDoneFragment ultrawideDoneFragment, View view) {
        I0 x02 = ultrawideDoneFragment.x0();
        x02.u1().b().captureEndGoToRooms(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
        ultrawideDoneFragment.T0();
    }

    /* access modifiers changed from: private */
    public static final void O0(UltrawideDoneFragment ultrawideDoneFragment, View view) {
        I0 x02 = ultrawideDoneFragment.x0();
        x02.u1().b().captureEndMaybeLater(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
        ultrawideDoneFragment.T0();
    }

    /* access modifiers changed from: private */
    public static final void P0(K k10, UltrawideDoneFragment ultrawideDoneFragment, View view) {
        k10.f144344a = true;
        I0 x02 = ultrawideDoneFragment.x0();
        x02.u1().b().captureEndLogin(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
        ultrawideDoneFragment.U0();
    }

    /* access modifiers changed from: private */
    public static final void Q0(K k10, UltrawideDoneFragment ultrawideDoneFragment, View view) {
        k10.f144344a = true;
        I0 x02 = ultrawideDoneFragment.x0();
        x02.u1().b().captureEndSignup(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
        ultrawideDoneFragment.W0();
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(UltrawideDoneFragment ultrawideDoneFragment, Boolean bool) {
        if (bool.booleanValue()) {
            ultrawideDoneFragment.V0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S0(UltrawideDoneFragment ultrawideDoneFragment, PrivacyPolicyFeatureState privacyPolicyFeatureState) {
        if (C17542s.e(privacyPolicyFeatureState.getShowDialog(), Boolean.TRUE)) {
            ultrawideDoneFragment.x0().i2();
        }
        return C16807N.f139792a;
    }

    private final C16807N T0() {
        C5191t activity = getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return C16807N.f139792a;
    }

    private final C16807N U0() {
        C5191t activity = getActivity();
        if (activity == null) {
            return null;
        }
        K0().navigateLogin(activity);
        return C16807N.f139792a;
    }

    private final void V0() {
        ConstraintLayout b10 = L0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        String string = getResources().getString(n.f113336b5);
        C17542s.i(string, "getString(...)");
        Snackbar q02 = Snackbar.q0(b10, string, -1);
        C17542s.i(q02, "make(...)");
        x0().U1();
        View K10 = q02.K();
        C17542s.i(K10, "getView(...)");
        K10.setBackgroundColor(-16777216);
        q02.b0();
    }

    private final C16807N W0() {
        C5191t activity = getActivity();
        if (activity == null) {
            return null;
        }
        K0().navigateSignup(activity);
        return C16807N.f139792a;
    }

    public final AccountInteractions K0() {
        AccountInteractions accountInteractions = this.f125471Q;
        if (accountInteractions != null) {
            return accountInteractions;
        }
        C17542s.z("accountInteractions");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        T c10 = T.c(layoutInflater, viewGroup, false);
        x0().u1().c().m(new File(x0().r1(), "mosaic.png")).d(c10.f114446f);
        TextView textView = c10.f114449i;
        CharSequence text = getText(n.f113197F);
        textView.setText(Html.fromHtml("<u>" + text + "</u>", 0));
        this.f125470P = c10;
        ConstraintLayout b10 = L0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onResume() {
        super.onResume();
        J0(C17542s.e(x0().I1().getValue(), Boolean.TRUE));
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        T L02 = L0();
        K k10 = new K();
        x0().I1().observe(getViewLifecycleOwner(), new a(new N(this, k10)));
        L02.f114444d.setOnClickListener(new O(this));
        L02.f114449i.setOnClickListener(new P(this));
        L02.f114448h.setOnClickListener(new Q(k10, this));
        L02.f114451k.setOnClickListener(new S(k10, this));
        e0.a(x0().m1()).observe(getViewLifecycleOwner(), new a(new T(this)));
        x0().n1().observe(getViewLifecycleOwner(), new a(new U(this)));
    }
}
