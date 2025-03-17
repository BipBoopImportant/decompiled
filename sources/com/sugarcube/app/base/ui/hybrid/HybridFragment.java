package com.sugarcube.app.base.ui.hybrid;

import JF.T;
import JF.Z;
import XH.C16807N;
import XH.C16824o;
import YH.C16877v;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
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
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import nI.C17631a;
import q3.E;
import q3.w;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J!\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J-\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010)\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u00020$8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001b\u0010?\u001a\u00020:8DX\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010C\u001a\u0004\u0018\u00010@8DX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "LXH/N;", "onResume", "onPause", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Landroid/widget/ImageButton;", "cancelButton", "Lkotlin/Function0;", "negativeAnalytics", "x0", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageButton;LnI/a;)V", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "asset", "Landroid/net/Uri;", "v0", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)Landroid/net/Uri;", "uri", "Lq3/E;", "A0", "(Landroid/net/Uri;)Lq3/E;", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "Lcom/sugarcube/app/base/external/config/a;", "J", "Lcom/sugarcube/app/base/external/config/a;", "getConfig", "()Lcom/sugarcube/app/base/external/config/a;", "setConfig", "(Lcom/sugarcube/app/base/external/config/a;)V", "config", "K", "Z", "getShowWarnings", "()Z", "w0", "(Z)V", "showWarnings", "Lcom/sugarcube/app/base/ui/hybrid/E0;", "L", "LXH/o;", "u0", "()Lcom/sugarcube/app/base/ui/hybrid/E0;", "model", "Lcom/sugarcube/app/base/ui/hybrid/o;", "t0", "()Lcom/sugarcube/app/base/ui/hybrid/o;", "arSurface", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridFragment extends Hilt_HybridFragment implements SystemUiDelegate {

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f124821I = new T();

    /* renamed from: J  reason: collision with root package name */
    public com.sugarcube.app.base.external.config.a f124822J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f124823K;

    /* renamed from: L  reason: collision with root package name */
    private final C16824o f124824L = W.b(this, P.b(E0.class), new a(this), new b((C17631a) null, this), new c(this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f124825c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f124825c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f124825c.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f124826c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f124827d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar, C5187o oVar) {
            super(0);
            this.f124826c = aVar;
            this.f124827d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f124826c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0016
            L_0x000c:
                androidx.fragment.app.o r0 = r1.f124827d
                androidx.fragment.app.t r0 = r0.requireActivity()
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.HybridFragment.b.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f124828c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f124828c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f124828c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* access modifiers changed from: private */
    public static final void y0(ImageButton imageButton, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        C17542s.g(view);
        Z.g(view, C16877v.e(imageButton));
    }

    /* access modifiers changed from: private */
    public static final void z0(HybridFragment hybridFragment, C17631a aVar, View view) {
        hybridFragment.u0().C1(aVar);
    }

    /* access modifiers changed from: protected */
    public final E A0(Uri uri) {
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

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f124821I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
        if (this.f124823K) {
            u0().L();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f124823K) {
            u0().M();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SystemUiDelegate.a.a(this, requireActivity, viewLifecycleOwner, false, false, 1, 8, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final C14275o t0() {
        C5191t activity = getActivity();
        if (activity == null || !(activity instanceof HybridActivity)) {
            return null;
        }
        return ((HybridActivity) activity).H0();
    }

    /* access modifiers changed from: protected */
    public final E0 u0() {
        return (E0) this.f124824L.getValue();
    }

    /* access modifiers changed from: protected */
    public final Uri v0(VideoAsset videoAsset) {
        C17542s.j(videoAsset, "asset");
        return u0().z1(videoAsset);
    }

    /* access modifiers changed from: protected */
    public final void w0(boolean z10) {
        this.f124823K = z10;
    }

    /* access modifiers changed from: protected */
    public final void x0(ConstraintLayout constraintLayout, ImageButton imageButton, C17631a<C16807N> aVar) {
        C17542s.j(constraintLayout, "root");
        C17542s.j(imageButton, "cancelButton");
        C17542s.j(aVar, "negativeAnalytics");
        constraintLayout.addOnLayoutChangeListener(new W(imageButton));
        imageButton.setOnClickListener(new X(this, aVar));
    }
}
