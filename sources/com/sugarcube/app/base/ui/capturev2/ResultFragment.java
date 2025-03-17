package com.sugarcube.app.base.ui.capturev2;

import OE.n;
import QE.C13442t;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.L;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.t;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState;
import com.sugarcube.core.analytics.Trackable;
import hF.C14540b;
import hF.C14542d;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020!8\u0014X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/ResultFragment;", "Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "<init>", "()V", "LQE/t;", "binding", "R0", "(LQE/t;)LQE/t;", "", "isLoggedIn", "LXH/N;", "O0", "(Z)V", "f1", "d1", "e1", "g1", "Landroid/net/Uri;", "uri", "c1", "(Landroid/net/Uri;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LhF/b;", "M", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "Lcom/sugarcube/app/base/ui/capturev2/H0;", "N", "LXH/o;", "Q0", "()Lcom/sugarcube/app/base/ui/capturev2/H0;", "resultModel", "O", "Z", "wasSaved", "P", "LQE/t;", "_binding", "P0", "()LQE/t;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResultFragment extends Hilt_ResultFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C14540b f123560M = C14540b.Results;

    /* renamed from: N  reason: collision with root package name */
    private final C16824o f123561N = W.b(this, P.b(H0.class), new b(this), new c((C17631a) null, this), new d(this));

    /* renamed from: O  reason: collision with root package name */
    private boolean f123562O;

    /* renamed from: P  reason: collision with root package name */
    private C13442t f123563P;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f123564a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f123564a = lVar;
        }

        public final C16818i<?> c() {
            return this.f123564a;
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
            this.f123564a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123565c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f123565c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f123565c.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f123566c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f123567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar, C5187o oVar) {
            super(0);
            this.f123566c = aVar;
            this.f123567d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f123566c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0016
            L_0x000c:
                androidx.fragment.app.o r0 = r1.f123567d
                androidx.fragment.app.t r0 = r0.requireActivity()
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.ResultFragment.c.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123568c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f123568c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f123568c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    private final void O0(boolean z10) {
        C13442t P02 = P0();
        if (z10) {
            P02.f114715h.setVisibility(0);
            P02.f114709b.setText(getText(n.f113465u1));
            P02.f114712e.setVisibility(8);
            return;
        }
        P02.f114712e.setVisibility(0);
        P02.f114709b.setText(getText(n.f113282T0));
        P02.f114715h.setVisibility(8);
    }

    private final C13442t P0() {
        C13442t tVar = this.f123563P;
        C17542s.g(tVar);
        return tVar;
    }

    private final H0 Q0() {
        return (H0) this.f123561N.getValue();
    }

    private final C13442t R0(C13442t tVar) {
        n0().J0();
        n0().k1().observe(getViewLifecycleOwner(), new a(new C14246z0(this, tVar)));
        return tVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N S0(ResultFragment resultFragment, C13442t tVar, File file) {
        if (file != null) {
            t c10 = resultFragment.n0().o1().c();
            c10.k(file);
            c10.m(file).h().d(tVar.f114713f);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T0(ResultFragment resultFragment, PrivacyPolicyFeatureState privacyPolicyFeatureState) {
        if (C17542s.e(privacyPolicyFeatureState.getShowDialog(), Boolean.TRUE)) {
            resultFragment.Q0().U();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U0(ResultFragment resultFragment, Boolean bool) {
        if (bool.booleanValue()) {
            resultFragment.f123562O = true;
            resultFragment.P0().f114714g.setVisibility(8);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N V0(ResultFragment resultFragment, Uri uri) {
        if (uri != null) {
            resultFragment.c1(uri);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(ResultFragment resultFragment, K k10, Boolean bool) {
        C17542s.g(bool);
        resultFragment.O0(bool.booleanValue());
        if (bool.booleanValue() && k10.f144344a) {
            k10.f144344a = false;
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void X0(ResultFragment resultFragment, View view) {
        BaseFragment.z0(resultFragment, C14542d.GoToRooms, (Trackable) null, 2, (Object) null);
        resultFragment.d1();
    }

    /* access modifiers changed from: private */
    public static final void Y0(ResultFragment resultFragment, View view) {
        BaseFragment.z0(resultFragment, C14542d.MaybeLater, (Trackable) null, 2, (Object) null);
        resultFragment.d1();
    }

    /* access modifiers changed from: private */
    public static final void Z0(ResultFragment resultFragment, K k10, View view) {
        if (resultFragment.f123562O) {
            k10.f144344a = true;
            BaseFragment.z0(resultFragment, C14542d.Login, (Trackable) null, 2, (Object) null);
            resultFragment.e1();
        }
    }

    /* access modifiers changed from: private */
    public static final void a1(ResultFragment resultFragment, K k10, View view) {
        if (resultFragment.f123562O) {
            k10.f144344a = true;
            BaseFragment.z0(resultFragment, C14542d.Signup, (Trackable) null, 2, (Object) null);
            resultFragment.g1();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N b1(ResultFragment resultFragment, Boolean bool) {
        if (bool.booleanValue()) {
            resultFragment.f1();
        }
        return C16807N.f139792a;
    }

    private final void c1(Uri uri) {
        try {
            Intent data = new Intent("android.intent.action.VIEW").setData(uri);
            C17542s.i(data, "setData(...)");
            startActivity(data);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            Q0().R();
            throw th2;
        }
        Q0().R();
    }

    private final void d1() {
        if (this.f123562O) {
            n0().G1();
        }
    }

    private final void e1() {
        C5191t activity = getActivity();
        if (activity != null) {
            Q0().T(activity);
        }
    }

    private final void f1() {
        ConstraintLayout b10 = P0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        String string = getResources().getString(n.f113336b5);
        C17542s.i(string, "getString(...)");
        Snackbar q02 = Snackbar.q0(b10, string, -1);
        C17542s.i(q02, "make(...)");
        Q0().S();
        View K10 = q02.K();
        C17542s.i(K10, "getView(...)");
        K10.setBackgroundColor(-16777216);
        q02.b0();
    }

    private final void g1() {
        C5191t activity = getActivity();
        if (activity != null) {
            Q0().c0(activity);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C13442t c10 = C13442t.c(layoutInflater, viewGroup, false);
        TextView textView = c10.f114717j;
        CharSequence text = getText(n.f113197F);
        textView.setText(Html.fromHtml("<u>" + text + "</u>", 0));
        this.f123563P = c10;
        ConstraintLayout b10 = P0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        R0(P0());
        e0.a(Q0().P()).observe(getViewLifecycleOwner(), new a(new C14229q0(this)));
        C13442t P02 = P0();
        K k10 = new K();
        Q0().Q().observe(getViewLifecycleOwner(), new a(new C14230r0(this, k10)));
        P02.f114711d.setOnClickListener(new C14232s0(this));
        P02.f114717j.setOnClickListener(new C14234t0(this));
        P02.f114716i.setOnClickListener(new C14236u0(this, k10));
        P02.f114719l.setOnClickListener(new C14238v0(this, k10));
        e0.a(Q0().N()).observe(getViewLifecycleOwner(), new a(new C14240w0(this)));
        Q0().O().observe(getViewLifecycleOwner(), new a(new C14242x0(this)));
        n0().s1().observe(getViewLifecycleOwner(), new a(new C14244y0(this)));
        C5191t activity = getActivity();
        if (activity != null) {
            P0().f114714g.setVisibility(0);
            n0().L0(activity);
        }
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123560M;
    }
}
