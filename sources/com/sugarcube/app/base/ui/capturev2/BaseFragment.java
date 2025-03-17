package com.sugarcube.app.base.ui.capturev2;

import JF.T;
import JF.Z;
import QE.C13438o;
import XH.C16824o;
import YH.C16877v;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.media3.exoplayer.ExoPlayer;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import com.sugarcube.core.analytics.Trackable;
import hF.C14540b;
import hF.C14542d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import nI.C17631a;
import q3.E;
import q3.w;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J#\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0004¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0004¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010)\u001a\u0004\u0018\u00010&H\u0004¢\u0006\u0004\b+\u0010,J:\u00106\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\b\u00105\u001a\u0004\u0018\u000104H\u0001¢\u0006\u0004\b6\u00107R\u001c\u0010=\u001a\u0004\u0018\u0001088\u0014X\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8DX\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010J\u001a\u0002018\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010N\u001a\u0004\u0018\u00010K8DX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010R\u001a\u0004\u0018\u00010O8DX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "onResume", "onPause", "LhF/d;", "action", "Lcom/sugarcube/core/analytics/Trackable;", "trackable", "y0", "(LhF/d;Lcom/sugarcube/core/analytics/Trackable;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Landroid/widget/ImageButton;", "cancelButton", "u0", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageButton;)V", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "asset", "Landroid/net/Uri;", "r0", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)Landroid/net/Uri;", "uri", "Lq3/E;", "x0", "(Landroid/net/Uri;)Lq3/E;", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "LhF/b;", "E", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "Lcom/sugarcube/app/base/ui/capturev2/h1;", "F", "LXH/o;", "n0", "()Lcom/sugarcube/app/base/ui/capturev2/h1;", "model", "G", "Z", "getShowWarnings", "()Z", "t0", "(Z)V", "showWarnings", "Lcom/sugarcube/app/base/ui/capturev2/q;", "m0", "()Lcom/sugarcube/app/base/ui/capturev2/q;", "arSurface", "Lcom/sugarcube/app/base/ui/capturev2/U;", "o0", "()Lcom/sugarcube/app/base/ui/capturev2/U;", "sensor", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseFragment extends C5187o implements SystemUiDelegate {

    /* renamed from: D  reason: collision with root package name */
    private final /* synthetic */ T f123363D = new T();

    /* renamed from: E  reason: collision with root package name */
    private final C14540b f123364E;

    /* renamed from: F  reason: collision with root package name */
    private final C16824o f123365F = W.b(this, P.b(h1.class), new a(this), new b((C17631a) null, this), new c(this));

    /* renamed from: G  reason: collision with root package name */
    private boolean f123366G;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123367c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f123367c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f123367c.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f123368c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f123369d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar, C5187o oVar) {
            super(0);
            this.f123368c = aVar;
            this.f123369d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f123368c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0016
            L_0x000c:
                androidx.fragment.app.o r0 = r1.f123369d
                androidx.fragment.app.t r0 = r0.requireActivity()
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.BaseFragment.b.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123370c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f123370c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f123370c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* access modifiers changed from: private */
    public static final void s0(BaseFragment baseFragment, Object obj) {
        if (obj != null) {
            baseFragment.n0().K0();
            C8951o.f0(androidx.navigation.fragment.a.a(baseFragment), obj, (C) null, (I.a) null, 6, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void v0(ImageButton imageButton, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        C17542s.g(view);
        Z.g(view, C16877v.e(imageButton));
    }

    /* access modifiers changed from: private */
    public static final void w0(BaseFragment baseFragment, View view) {
        baseFragment.n0().x1(baseFragment.q0());
    }

    public static /* synthetic */ void z0(BaseFragment baseFragment, C14542d dVar, Trackable trackable, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                trackable = null;
            }
            baseFragment.y0(dVar, trackable);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAction");
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f123363D.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    /* access modifiers changed from: protected */
    public final C14228q m0() {
        C5191t activity = getActivity();
        if (activity == null || !(activity instanceof CaptureActivity)) {
            return null;
        }
        return ((CaptureActivity) activity).D0();
    }

    /* access modifiers changed from: protected */
    public final h1 n0() {
        return (h1) this.f123365F.getValue();
    }

    /* access modifiers changed from: protected */
    public final U o0() {
        C5191t activity = getActivity();
        if (activity == null || !(activity instanceof CaptureActivity)) {
            return null;
        }
        return ((CaptureActivity) activity).F0();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h1 n02 = n0();
        String simpleName = getClass().getSimpleName();
        Bundle arguments = getArguments();
        String bundle2 = arguments != null ? arguments.toString() : null;
        h1.R1(n02, simpleName + " onCreate arguments " + bundle2, (Throwable) null, 2, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        ConstraintLayout b10 = C13438o.c(layoutInflater, viewGroup, false).getRoot();
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SystemUiDelegate.a.a(this, requireActivity, viewLifecycleOwner, false, false, (Integer) null, 24, (Object) null);
        C17542s.i(b10, "also(...)");
        return b10;
    }

    public void onPause() {
        super.onPause();
        if (this.f123366G) {
            n0().L();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f123366G) {
            n0().M();
        }
    }

    public void onStart() {
        super.onStart();
        z0(this, C14542d.Start, (Trackable) null, 2, (Object) null);
    }

    public void onStop() {
        super.onStop();
        z0(this, C14542d.End, (Trackable) null, 2, (Object) null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        h1.R1(n0(), "capture BaseFragment: observe navDirections", (Throwable) null, 2, (Object) null);
        n0().g1().observe(getViewLifecycleOwner(), new C14231s(this));
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123364E;
    }

    /* access modifiers changed from: protected */
    public final Uri r0(VideoAsset videoAsset) {
        C17542s.j(videoAsset, "asset");
        return n0().T0().get(videoAsset);
    }

    /* access modifiers changed from: protected */
    public final void t0(boolean z10) {
        this.f123366G = z10;
    }

    /* access modifiers changed from: protected */
    public final void u0(ConstraintLayout constraintLayout, ImageButton imageButton) {
        C17542s.j(constraintLayout, "root");
        C17542s.j(imageButton, "cancelButton");
        constraintLayout.addOnLayoutChangeListener(new C14233t(imageButton));
        imageButton.setOnClickListener(new C14235u(this));
    }

    /* access modifiers changed from: protected */
    public final E x0(Uri uri) {
        C5191t activity = getActivity();
        ExoPlayer f10 = activity != null ? new ExoPlayer.b(activity).f() : null;
        if (!(uri == null || f10 == null)) {
            f10.O(w.b(uri));
        }
        if (f10 != null) {
            f10.Z(2);
        }
        if (f10 != null) {
            f10.d();
        }
        return f10;
    }

    /* access modifiers changed from: protected */
    public void y0(C14542d dVar, Trackable trackable) {
        C17542s.j(dVar, "action");
        C14540b q02 = q0();
        if (q02 != null) {
            n0().q2(q02, dVar, trackable != null ? C16877v.e(trackable) : null);
        }
    }
}
