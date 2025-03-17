package com.sugarcube.app.base.ui.hybrid;

import OE.n;
import PE.C13341c;
import QE.F;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16818i;
import XH.t;
import XH.v;
import XH.y;
import YE.C13868b;
import YE.e;
import android.graphics.Bitmap;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.common.R;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.q;
import q3.E;
import q3.w;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003JO\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010=\u001a\u0004\u0018\u00010:8BX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridARPanoFragment;", "Lcom/sugarcube/app/base/ui/hybrid/HybridPanoFragment;", "<init>", "()V", "LXH/N;", "b1", "Landroid/graphics/Bitmap;", "bitmap", "", "rotation", "intrinsics", "", "tracking", "", "pixelIntensity", "", "timestamp", "imageTimestamp", "targetIdx", "Z0", "(Landroid/graphics/Bitmap;[F[FIFJJI)V", "S0", "(Landroid/graphics/Bitmap;I)V", "a1", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "onStop", "onDestroyView", "Landroid/widget/TextView;", "P", "Landroid/widget/TextView;", "captionTextView", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetView;", "Q", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetView;", "panoView", "Landroid/widget/ImageView;", "R", "Landroid/widget/ImageView;", "scaleImageView", "Lq3/E;", "S", "Lq3/E;", "player", "T", "I", "currentTarget", "U", "targetIndex", "Lcom/sugarcube/app/base/ui/hybrid/i0;", "T0", "()Lcom/sugarcube/app/base/ui/hybrid/i0;", "hybridSensor", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridARPanoFragment extends Hilt_HybridARPanoFragment {
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public TextView f124721P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public PanoTargetView f124722Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public ImageView f124723R;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public E f124724S;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public int f124725T = -1;

    /* renamed from: U  reason: collision with root package name */
    private int f124726U;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/hybrid/HybridARPanoFragment$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "LXH/N;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HybridARPanoFragment f124727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f124728b;

        a(HybridARPanoFragment hybridARPanoFragment, int i10) {
            this.f124727a = hybridARPanoFragment;
            this.f124728b = i10;
        }

        public void onAnimationEnd(Animation animation) {
            ImageView Q02 = this.f124727a.f124723R;
            PanoTargetView panoTargetView = null;
            if (Q02 == null) {
                C17542s.z("scaleImageView");
                Q02 = null;
            }
            Q02.setVisibility(8);
            PanoTargetView O02 = this.f124727a.f124722Q;
            if (O02 == null) {
                C17542s.z("panoView");
                O02 = null;
            }
            O02.setVisibility(0);
            PanoTargetView O03 = this.f124727a.f124722Q;
            if (O03 == null) {
                C17542s.z("panoView");
                O03 = null;
            }
            O03.h(this.f124728b);
            this.f124727a.E0(this.f124728b);
            PanoTargetView O04 = this.f124727a.f124722Q;
            if (O04 == null) {
                C17542s.z("panoView");
            } else {
                panoTargetView = O04;
            }
            if (panoTargetView.f()) {
                this.f124727a.B0();
                C8951o.f0(androidx.navigation.fragment.a.a(this.f124727a), Kreativ.Capture.Hybrid.i.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/sugarcube/app/base/ui/hybrid/HybridARPanoFragment$b", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetListener;", "", "targetIdx", "LXH/N;", "targetAcquired", "(I)V", "targetLost", "targetSaving", "targetDone", "", "angles", "updateAngles", "([F)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements PanoTargetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HybridARPanoFragment f124729a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F f124730b;

        b(HybridARPanoFragment hybridARPanoFragment, F f10) {
            this.f124729a = hybridARPanoFragment;
            this.f124730b = f10;
        }

        public void targetAcquired(int i10) {
            TextView L02 = this.f124729a.f124721P;
            if (L02 == null) {
                C17542s.z("captionTextView");
                L02 = null;
            }
            L02.setText(n.f113222J0);
            this.f124729a.f124725T = i10;
            this.f124730b.f114351f.setVisibility(0);
            C14264i0 N02 = this.f124729a.T0();
            if (N02 != null) {
                C14264i0.i(N02, 0, 1, (Object) null);
            }
        }

        public void targetDone(int i10) {
            E P02;
            this.f124730b.f114351f.setVisibility(8);
            if (i10 == 0 && (P02 = this.f124729a.f124724S) != null) {
                P02.O(w.b(this.f124729a.v0(VideoAsset.CAPTURE_ICON_SNAP_RIGHT)));
            }
        }

        public void targetLost(int i10) {
            if (i10 == this.f124729a.f124725T) {
                this.f124729a.f124725T = -1;
                this.f124730b.f114351f.setVisibility(8);
            }
        }

        public void targetSaving(int i10) {
        }

        public void updateAngles(float[] fArr) {
            C17542s.j(fArr, "angles");
            this.f124729a.u0().Z0(fArr);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f124731a;

        c(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124731a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124731a;
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
            this.f124731a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.hybrid.HybridARPanoFragment$saveImage$1", f = "HybridARPanoFragment.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124732c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HybridARPanoFragment f124733d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float[] f124734e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Bitmap f124735f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f124736g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float[] f124737h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f124738i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f124739j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f124740k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(HybridARPanoFragment hybridARPanoFragment, float[] fArr, Bitmap bitmap, long j10, float[] fArr2, int i10, float f10, int i11, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f124733d = hybridARPanoFragment;
            this.f124734e = fArr;
            this.f124735f = bitmap;
            this.f124736g = j10;
            this.f124737h = fArr2;
            this.f124738i = i10;
            this.f124739j = f10;
            this.f124740k = i11;
        }

        /* access modifiers changed from: private */
        public static final void j(HybridARPanoFragment hybridARPanoFragment, Bitmap bitmap, int i10) {
            hybridARPanoFragment.S0(bitmap, i10);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f124733d, this.f124734e, this.f124735f, this.f124736g, this.f124737h, this.f124738i, this.f124739j, this.f124740k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f124732c == 0) {
                y.b(obj);
                this.f124733d.u0().Y1(this.f124734e);
                C14264i0 N02 = this.f124733d.T0();
                if (N02 != null) {
                    Bitmap bitmap = this.f124735f;
                    HybridARPanoFragment hybridARPanoFragment = this.f124733d;
                    long j10 = this.f124736g;
                    float[] fArr = this.f124737h;
                    int i10 = this.f124738i;
                    float f10 = this.f124739j;
                    int i11 = this.f124740k;
                    Bitmap e10 = C13341c.e(bitmap);
                    hybridARPanoFragment.u0().V0(e10, j10, N02.p(j10), fArr, i10, f10, i11);
                    C5191t activity = hybridARPanoFragment.getActivity();
                    if (activity != null) {
                        activity.runOnUiThread(new C14265j(hybridARPanoFragment, e10, i11));
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    public final void S0(Bitmap bitmap, int i10) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.sc_scale_down);
        loadAnimation.setAnimationListener(new a(this, i10));
        PanoTargetView panoTargetView = this.f124722Q;
        ImageView imageView = null;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        panoTargetView.setVisibility(8);
        b1();
        ImageView imageView2 = this.f124723R;
        if (imageView2 == null) {
            C17542s.z("scaleImageView");
        } else {
            imageView = imageView2;
        }
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        imageView.startAnimation(loadAnimation);
    }

    /* access modifiers changed from: private */
    public final C14264i0 T0() {
        C14275o t02 = t0();
        if (t02 != null) {
            return t02.z();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C16807N U0(HybridARPanoFragment hybridARPanoFragment) {
        hybridARPanoFragment.C0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void V0(HybridARPanoFragment hybridARPanoFragment, F f10, View view) {
        hybridARPanoFragment.u0().S1();
        C14264i0 T02 = hybridARPanoFragment.T0();
        if (T02 != null) {
            hybridARPanoFragment.u0().Z1(T02.o());
        }
        f10.f114355j.setVisibility(8);
        f10.f114349d.setVisibility(8);
        f10.f114353h.setVisibility(0);
        f10.f114351f.setVisibility(8);
        hybridARPanoFragment.b1();
        hybridARPanoFragment.a1();
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(F f10, Boolean bool) {
        boolean isEnabled = f10.f114355j.isEnabled();
        Log.d(AnyKt.SUGARCUBE_TAG, "arInitDone changed - " + bool + " " + isEnabled);
        if (bool != null) {
            if (C17542s.e(bool, Boolean.FALSE) || C17542s.e(bool, Boolean.TRUE)) {
                Log.d(AnyKt.SUGARCUBE_TAG, "show startButton");
                C13868b.f118106a.b("show startButton", e.Capture);
                f10.f114348c.setText(n.f113464u0);
                f10.f114355j.setVisibility(0);
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        r12 = (java.lang.Long) r14.get(android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N X0(com.sugarcube.app.base.ui.hybrid.HybridARPanoFragment r11, com.sugarcube.app.base.ui.hybrid.M0 r12, android.media.Image r13, android.hardware.camera2.TotalCaptureResult r14) {
        /*
            java.lang.String r0 = "sharedCameraSession"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r12 = "image"
            kotlin.jvm.internal.C17542s.j(r13, r12)
            int r10 = r11.f124725T
            if (r10 < 0) goto L_0x0056
            android.content.Context r12 = r11.getContext()
            if (r12 == 0) goto L_0x0056
            r0 = -1
            r11.f124725T = r0
            android.graphics.Bitmap r1 = PE.C13341c.b(r13, r12)
            com.sugarcube.app.base.ui.hybrid.E0 r12 = r11.u0()
            float[] r2 = r12.M1()
            com.sugarcube.app.base.ui.hybrid.E0 r12 = r11.u0()
            float[] r3 = r12.L1()
            com.sugarcube.app.base.ui.hybrid.E0 r12 = r11.u0()
            int r4 = r12.N1()
            com.sugarcube.app.base.ui.hybrid.E0 r12 = r11.u0()
            float r5 = r12.J1()
            if (r14 == 0) goto L_0x004c
            android.hardware.camera2.CaptureResult$Key r12 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP
            java.lang.Object r12 = r14.get(r12)
            java.lang.Long r12 = (java.lang.Long) r12
            if (r12 == 0) goto L_0x004c
            long r6 = r12.longValue()
            goto L_0x004e
        L_0x004c:
            r6 = 0
        L_0x004e:
            long r8 = r13.getTimestamp()
            r0 = r11
            r0.Z0(r1, r2, r3, r4, r5, r6, r8, r10)
        L_0x0056:
            XH.N r11 = XH.C16807N.f139792a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.HybridARPanoFragment.X0(com.sugarcube.app.base.ui.hybrid.HybridARPanoFragment, com.sugarcube.app.base.ui.hybrid.M0, android.media.Image, android.hardware.camera2.TotalCaptureResult):XH.N");
    }

    /* access modifiers changed from: private */
    public static final C16807N Y0(HybridARPanoFragment hybridARPanoFragment) {
        PanoTargetView panoTargetView = hybridARPanoFragment.f124722Q;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        panoTargetView.invalidate();
        return C16807N.f139792a;
    }

    private final void Z0(Bitmap bitmap, float[] fArr, float[] fArr2, int i10, float f10, long j10, long j11, int i11) {
        long j12 = j10;
        long j13 = j11;
        int i12 = i11;
        PanoTargetView panoTargetView = this.f124722Q;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        if (panoTargetView.j(i12)) {
            this.f124726U = i12 + 1;
            C13868b bVar = C13868b.f118106a;
            bVar.b("saveImage[" + i12 + "] save " + j12 + " " + j13, e.Capture);
            F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new d(this, fArr2, bitmap, j11, fArr, i10, f10, i11, (C17164e<? super d>) null), 3, (Object) null);
            return;
        }
        C13868b bVar2 = C13868b.f118106a;
        bVar2.b("saveImage[" + i12 + "] ignore " + j12 + " " + j13, e.Capture);
    }

    private final void a1() {
        v<Float, Float> v10;
        C14275o t02 = t0();
        if (!(t02 == null || (v10 = t02.v()) == null)) {
            PanoTargetView panoTargetView = this.f124722Q;
            if (panoTargetView == null) {
                C17542s.z("panoView");
                panoTargetView = null;
            }
            panoTargetView.g(v10.c().floatValue(), v10.d().floatValue());
        }
        u0().Y1(new float[9]);
    }

    private final void b1() {
        int i10 = this.f124726U + 1;
        TextView textView = this.f124721P;
        TextView textView2 = null;
        if (textView == null) {
            C17542s.z("captionTextView");
            textView = null;
        }
        textView.setVisibility(0);
        int i11 = this.f124726U;
        if (i11 == 0) {
            TextView textView3 = this.f124721P;
            if (textView3 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView3;
            }
            textView2.setText(getString(n.f113270R0, String.valueOf(i10)));
        } else if (i11 == 1 || i11 == 2 || i11 == 3) {
            TextView textView4 = this.f124721P;
            if (textView4 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView4;
            }
            textView2.setText(getString(n.f113210H0, String.valueOf(i10)));
        } else if (i11 != 4) {
            TextView textView5 = this.f124721P;
            if (textView5 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView5;
            }
            textView2.setVisibility(8);
        } else {
            TextView textView6 = this.f124721P;
            if (textView6 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView6;
            }
            textView2.setText(getString(n.f113394k0, String.valueOf(i10)));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        F c10 = F.c(layoutInflater, viewGroup, false);
        w0(true);
        D0();
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114347b;
        C17542s.i(floatingActionButton, "cancelButton");
        x0(b10, floatingActionButton, new C14255e(this));
        E A02 = A0(v0(VideoAsset.CAPTURE_ICON_SNAP_LEFT));
        this.f124724S = A02;
        c10.f114352g.setPlayer(A02);
        c10.f114350e.setClipToOutline(true);
        PanoTargetView panoTargetView = c10.f114353h;
        this.f124722Q = panoTargetView;
        this.f124723R = c10.f114354i;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        panoTargetView.setListener(new b(this, c10));
        this.f124721P = c10.f114348c;
        c10.f114355j.setOnClickListener(new C14257f(this, c10));
        c10.f114348c.setText(n.f113451s1);
        c10.f114355j.setVisibility(8);
        u0().b1().observe(getViewLifecycleOwner(), new c(new C14259g(c10)));
        u0().X1("ARPANO");
        u0().B2(t0());
        C5191t activity = getActivity();
        if (activity != null) {
            u0().W1(activity, new C14261h(this));
        }
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
        C14264i0 T02 = T0();
        if (T02 != null) {
            T02.y();
        }
    }

    public void onResume() {
        super.onResume();
        E e10 = this.f124724S;
        if (e10 != null) {
            e10.q(true);
        }
        C14264i0 T02 = T0();
        if (T02 != null) {
            C14264i0.w(T02, 0, new C14263i(this), 1, (Object) null);
        }
    }

    public void onStop() {
        super.onStop();
        E e10 = this.f124724S;
        if (e10 != null) {
            e10.stop();
        }
        E e11 = this.f124724S;
        if (e11 != null) {
            e11.release();
        }
        u0().H2();
        C5191t activity = getActivity();
        if (activity != null) {
            u0().W1(activity, (q<? super M0, ? super Image, ? super TotalCaptureResult, C16807N>) null);
        }
    }
}
