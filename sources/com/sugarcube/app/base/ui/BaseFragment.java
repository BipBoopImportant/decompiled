package com.sugarcube.app.base.ui;

import OE.C13313e;
import OE.q;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import com.sugarcube.app.base.data.asset.VideoAssetRepository;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.app.base.network.NetworkStatus;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0003R(\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/sugarcube/app/base/ui/BaseFragment;", "Landroidx/fragment/app/o;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onResume", "onDestroy", "LOE/q;", "D", "LOE/q;", "q0", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "getSugarcube$annotations", "sugarcube", "LOE/e;", "E", "LOE/e;", "n0", "()LOE/e;", "setInstallationConfig", "(LOE/e;)V", "installationConfig", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "F", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "m0", "()Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "setAssetRepository", "(Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;)V", "assetRepository", "Lcom/sugarcube/app/base/network/NetworkClient;", "G", "Lcom/sugarcube/app/base/network/NetworkClient;", "o0", "()Lcom/sugarcube/app/base/network/NetworkClient;", "setNetworkClient", "(Lcom/sugarcube/app/base/network/NetworkClient;)V", "networkClient", "Landroidx/appcompat/widget/Toolbar;", "H", "Landroidx/appcompat/widget/Toolbar;", "baseToolbar", "Landroid/app/Dialog;", "I", "Landroid/app/Dialog;", "dialog", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseFragment extends C5187o {

    /* renamed from: D  reason: collision with root package name */
    public q f123238D;

    /* renamed from: E  reason: collision with root package name */
    public C13313e f123239E;

    /* renamed from: F  reason: collision with root package name */
    public VideoAssetRepository f123240F;

    /* renamed from: G  reason: collision with root package name */
    public NetworkClient f123241G;

    /* renamed from: H  reason: collision with root package name */
    private Toolbar f123242H;

    /* renamed from: I  reason: collision with root package name */
    private Dialog f123243I;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.BaseFragment$onResume$1", f = "BaseFragment.kt", l = {75}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123244c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BaseFragment f123245d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BaseFragment baseFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f123245d = baseFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f123245d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123244c;
            if (i10 == 0) {
                y.b(obj);
                NetworkClient o02 = this.f123245d.o0();
                int c10 = this.f123245d.n0().c();
                this.f123244c = 1;
                if (NetworkClient.DefaultImpls.checkStatus$default(o02, c10, (Boolean) null, this, 2, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/app/base/ui/BaseFragment$b", "Landroidx/lifecycle/L;", "Lcom/sugarcube/app/base/network/NetworkStatus;", "networkStatus", "LXH/N;", "a", "(Lcom/sugarcube/app/base/network/NetworkStatus;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L<NetworkStatus> {
        b() {
        }

        /* renamed from: a */
        public void onChanged(NetworkStatus networkStatus) {
            C17542s.j(networkStatus, "networkStatus");
        }
    }

    public final VideoAssetRepository m0() {
        VideoAssetRepository videoAssetRepository = this.f123240F;
        if (videoAssetRepository != null) {
            return videoAssetRepository;
        }
        C17542s.z("assetRepository");
        return null;
    }

    public final C13313e n0() {
        C13313e eVar = this.f123239E;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("installationConfig");
        return null;
    }

    public final NetworkClient o0() {
        NetworkClient networkClient = this.f123241G;
        if (networkClient != null) {
            return networkClient;
        }
        C17542s.z("networkClient");
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.f123243I;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void onDestroyView() {
        Toolbar toolbar = this.f123242H;
        if (toolbar != null) {
            C5191t activity = getActivity();
            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
            if (appCompatActivity != null && C17542s.e(appCompatActivity.getSupportActionBar(), toolbar)) {
                appCompatActivity.setSupportActionBar((Toolbar) null);
            }
            this.f123242H = null;
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        o0().getNetworkStatus().observe(getViewLifecycleOwner(), new b());
    }

    public final q q0() {
        q qVar = this.f123238D;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }
}
