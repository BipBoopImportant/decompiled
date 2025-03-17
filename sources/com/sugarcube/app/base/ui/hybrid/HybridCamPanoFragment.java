package com.sugarcube.app.base.ui.hybrid;

import C.C4400j;
import C.C4409q;
import C.U;
import C.V;
import C.p0;
import C.q0;
import JF.r;
import OE.n;
import PE.C13341c;
import QE.I;
import T.g;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.common.R;
import com.sugarcube.core.logger.AnyKt;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ob.C10101e;
import q3.E;
import q3.w;
import u2.C6012a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0003R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u001b\u0010M\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridCamPanoFragment;", "Lcom/sugarcube/app/base/ui/hybrid/HybridPanoFragment;", "<init>", "()V", "LT/g;", "provider", "Landroidx/camera/view/PreviewView;", "viewFinder", "LXH/N;", "W0", "(LT/g;Landroidx/camera/view/PreviewView;)V", "LC/j;", "it", "", "isRotated", "e1", "(LC/j;Z)V", "", "targetIdx", "f1", "(I)V", "g1", "Landroid/graphics/Bitmap;", "bitmap", "V0", "(Landroid/graphics/Bitmap;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "onStop", "onDestroyView", "Ljava/util/concurrent/ExecutorService;", "P", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "LC/U;", "Q", "LC/U;", "imageCapture", "Lcom/sugarcube/app/base/ui/hybrid/i0;", "R", "Lcom/sugarcube/app/base/ui/hybrid/i0;", "hybridSensor", "Landroid/widget/TextView;", "S", "Landroid/widget/TextView;", "captionTextView", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetView;", "T", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetView;", "panoView", "Landroid/widget/ImageView;", "U", "Landroid/widget/ImageView;", "scaleImageView", "Lq3/E;", "X", "Lq3/E;", "player", "Y", "I", "currentTarget", "Z", "targetIndex", "Landroid/hardware/camera2/CameraManager;", "y0", "LXH/o;", "Y0", "()Landroid/hardware/camera2/CameraManager;", "cameraManager", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridCamPanoFragment extends Hilt_HybridCamPanoFragment {

    /* renamed from: P  reason: collision with root package name */
    private ExecutorService f124783P;

    /* renamed from: Q  reason: collision with root package name */
    private U f124784Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public C14264i0 f124785R;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public TextView f124786S;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public PanoTargetView f124787T;
    /* access modifiers changed from: private */

    /* renamed from: U  reason: collision with root package name */
    public ImageView f124788U;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public E f124789X;
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public int f124790Y = -1;
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public int f124791Z;

    /* renamed from: y0  reason: collision with root package name */
    private final C16824o f124792y0 = C16825p.b(new L(this));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/hybrid/HybridCamPanoFragment$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "LXH/N;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HybridCamPanoFragment f124793a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f124794b;

        a(HybridCamPanoFragment hybridCamPanoFragment, int i10) {
            this.f124793a = hybridCamPanoFragment;
            this.f124794b = i10;
        }

        public void onAnimationEnd(Animation animation) {
            ImageView R02 = this.f124793a.f124788U;
            PanoTargetView panoTargetView = null;
            if (R02 == null) {
                C17542s.z("scaleImageView");
                R02 = null;
            }
            R02.setVisibility(8);
            PanoTargetView P02 = this.f124793a.f124787T;
            if (P02 == null) {
                C17542s.z("panoView");
                P02 = null;
            }
            P02.setVisibility(0);
            PanoTargetView P03 = this.f124793a.f124787T;
            if (P03 == null) {
                C17542s.z("panoView");
                P03 = null;
            }
            P03.h(this.f124794b);
            this.f124793a.E0(this.f124794b);
            PanoTargetView P04 = this.f124793a.f124787T;
            if (P04 == null) {
                C17542s.z("panoView");
            } else {
                panoTargetView = P04;
            }
            if (panoTargetView.f()) {
                this.f124793a.B0();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/sugarcube/app/base/ui/hybrid/HybridCamPanoFragment$b", "Lcom/sugarcube/app/base/ui/hybrid/PanoTargetListener;", "", "targetIdx", "LXH/N;", "targetAcquired", "(I)V", "targetLost", "targetSaving", "targetDone", "", "angles", "updateAngles", "([F)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements PanoTargetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HybridCamPanoFragment f124795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ I f124796b;

        b(HybridCamPanoFragment hybridCamPanoFragment, I i10) {
            this.f124795a = hybridCamPanoFragment;
            this.f124796b = i10;
        }

        public void targetAcquired(int i10) {
            Log.d(AnyKt.SUGARCUBE_TAG, "targetAcquired[" + i10 + "]");
            TextView M02 = this.f124795a.f124786S;
            if (M02 == null) {
                C17542s.z("captionTextView");
                M02 = null;
            }
            M02.setText(n.f113222J0);
            this.f124795a.f124790Y = i10;
            this.f124795a.f1(i10);
            this.f124796b.f114371f.setVisibility(0);
        }

        public void targetDone(int i10) {
            E Q02;
            this.f124796b.f114371f.setVisibility(8);
            if (i10 == 0 && (Q02 = this.f124795a.f124789X) != null) {
                Q02.O(w.b(this.f124795a.v0(VideoAsset.CAPTURE_ICON_SNAP_RIGHT)));
            }
        }

        public void targetLost(int i10) {
            int N02 = this.f124795a.f124790Y;
            Log.d(AnyKt.SUGARCUBE_TAG, "targetLost[" + i10 + "] current=" + N02);
            if (i10 == this.f124795a.f124790Y) {
                this.f124795a.f124790Y = -1;
                this.f124796b.f114371f.setVisibility(8);
            }
        }

        public void targetSaving(int i10) {
            this.f124796b.f114371f.setVisibility(0);
            this.f124795a.f124791Z = i10 + 1;
        }

        public void updateAngles(float[] fArr) {
            C17542s.j(fArr, "angles");
            C14264i0 O02 = this.f124795a.f124785R;
            if (O02 == null) {
                C17542s.z("hybridSensor");
                O02 = null;
            }
            O02.j(fArr, this.f124795a.u0().m1());
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/sugarcube/app/base/ui/hybrid/HybridCamPanoFragment$c", "LC/U$e;", "Landroidx/camera/core/n;", "image", "LXH/N;", "c", "(Landroidx/camera/core/n;)V", "LC/V;", "exception", "d", "(LC/V;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends U.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f124797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HybridCamPanoFragment f124798b;

        c(int i10, HybridCamPanoFragment hybridCamPanoFragment) {
            this.f124797a = i10;
            this.f124798b = hybridCamPanoFragment;
        }

        /* access modifiers changed from: private */
        public static final void g(HybridCamPanoFragment hybridCamPanoFragment, Bitmap bitmap, int i10) {
            hybridCamPanoFragment.V0(bitmap, i10);
        }

        public void c(androidx.camera.core.n nVar) {
            C17542s.j(nVar, "image");
            ByteBuffer p10 = nVar.A1()[0].p();
            C17542s.i(p10, "getBuffer(...)");
            int remaining = p10.remaining();
            byte[] bArr = new byte[remaining];
            p10.get(bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
            nVar.close();
            Log.d(AnyKt.SUGARCUBE_TAG, "takePicture[" + this.f124797a + "," + this.f124798b.f124790Y + "] got image");
            if (this.f124798b.f124790Y == this.f124797a) {
                this.f124798b.f124790Y = -1;
                PanoTargetView P02 = this.f124798b.f124787T;
                C14264i0 i0Var = null;
                if (P02 == null) {
                    C17542s.z("panoView");
                    P02 = null;
                }
                P02.j(this.f124797a);
                long a10 = nVar.F2().a();
                C17542s.g(decodeByteArray);
                Bitmap e10 = C13341c.e(decodeByteArray);
                E0 u02 = this.f124798b.u0();
                C14264i0 O02 = this.f124798b.f124785R;
                if (O02 == null) {
                    C17542s.z("hybridSensor");
                } else {
                    i0Var = O02;
                }
                E0.W0(u02, e10, a10, i0Var.p(a10), (float[]) null, 0, 0.0f, 0, 120, (Object) null);
                C5191t activity = this.f124798b.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new O(this.f124798b, e10, this.f124797a));
                }
            }
        }

        public void d(V v10) {
            C17542s.j(v10, "exception");
            int i10 = this.f124797a;
            Log.d(AnyKt.SUGARCUBE_TAG, "TakePicture[" + i10 + "] Error", v10);
        }
    }

    /* access modifiers changed from: private */
    public final void V0(Bitmap bitmap, int i10) {
        Log.d(AnyKt.SUGARCUBE_TAG, "animateImage[" + i10 + "]");
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.sc_scale_down);
        loadAnimation.setAnimationListener(new a(this, i10));
        PanoTargetView panoTargetView = this.f124787T;
        ImageView imageView = null;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        panoTargetView.setVisibility(8);
        g1();
        ImageView imageView2 = this.f124788U;
        if (imageView2 == null) {
            C17542s.z("scaleImageView");
        } else {
            imageView = imageView2;
        }
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        imageView.startAnimation(loadAnimation);
    }

    private final void W0(g gVar, PreviewView previewView) {
        int rotation = previewView.getDisplay().getRotation();
        boolean z10 = true;
        C4409q b10 = new C4409q.a().c(1).b();
        C17542s.g(b10);
        p0 f10 = new p0.a().m(0).b(rotation).f();
        C17542s.i(f10, "build(...)");
        this.f124784Q = new U.b().i(0).p(0).b(rotation).f();
        gVar.B();
        try {
            U u10 = this.f124784Q;
            if (u10 == null) {
                C17542s.z("imageCapture");
                u10 = null;
            }
            C4400j o10 = gVar.o(this, b10, f10, u10);
            C17542s.i(o10, "bindToLifecycle(...)");
            f10.o0(previewView.getSurfaceProvider());
            if (f10.h0() != 0) {
                z10 = false;
            }
            e1(o10, z10);
        } catch (Exception e10) {
            Log.e(AnyKt.SUGARCUBE_TAG, "Use case binding failed", e10);
        }
    }

    /* access modifiers changed from: private */
    public static final CameraManager X0(HybridCamPanoFragment hybridCamPanoFragment) {
        Object systemService = hybridCamPanoFragment.requireContext().getSystemService("camera");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return (CameraManager) systemService;
    }

    private final CameraManager Y0() {
        return (CameraManager) this.f124792y0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N Z0(HybridCamPanoFragment hybridCamPanoFragment) {
        hybridCamPanoFragment.C0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void a1(C5191t tVar, HybridCamPanoFragment hybridCamPanoFragment, I i10) {
        C10101e<g> t10 = g.t(tVar);
        t10.a(new N(t10, hybridCamPanoFragment, i10), C6012a.h(tVar));
    }

    /* access modifiers changed from: private */
    public static final void b1(C10101e eVar, HybridCamPanoFragment hybridCamPanoFragment, I i10) {
        g gVar = (g) eVar.get();
        if (gVar != null) {
            PreviewView previewView = i10.f114376k;
            C17542s.i(previewView, "viewFinder");
            hybridCamPanoFragment.W0(gVar, previewView);
        }
    }

    /* access modifiers changed from: private */
    public static final void c1(HybridCamPanoFragment hybridCamPanoFragment, I i10, View view) {
        E0 u02 = hybridCamPanoFragment.u0();
        C14264i0 i0Var = hybridCamPanoFragment.f124785R;
        if (i0Var == null) {
            C17542s.z("hybridSensor");
            i0Var = null;
        }
        u02.Z1(i0Var.o());
        i10.f114375j.setVisibility(8);
        i10.f114369d.setVisibility(8);
        i10.f114373h.setVisibility(0);
        i10.f114371f.setVisibility(8);
        hybridCamPanoFragment.g1();
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(HybridCamPanoFragment hybridCamPanoFragment) {
        PanoTargetView panoTargetView = hybridCamPanoFragment.f124787T;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        panoTargetView.invalidate();
        return C16807N.f139792a;
    }

    private final void e1(C4400j jVar, boolean z10) {
        Size size;
        CameraCharacteristics cameraCharacteristics = Y0().getCameraCharacteristics("0");
        C17542s.i(cameraCharacteristics, "getCameraCharacteristics(...)");
        U u10 = null;
        v b10 = r.b(cameraCharacteristics, z10, 0.0f, 2, (Object) null);
        Log.d(AnyKt.SUGARCUBE_TAG, "Pano setFOV(" + b10 + ")");
        PanoTargetView panoTargetView = this.f124787T;
        if (panoTargetView == null) {
            C17542s.z("panoView");
            panoTargetView = null;
        }
        panoTargetView.g(((Number) b10.c()).floatValue(), ((Number) b10.d()).floatValue());
        float[] fArr = new float[9];
        U u11 = this.f124784Q;
        if (u11 == null) {
            C17542s.z("imageCapture");
        } else {
            u10 = u11;
        }
        q0 p02 = u10.p0();
        if (p02 == null || (size = p02.a()) == null) {
            size = new Size(0, 0);
        }
        r.d(fArr, cameraCharacteristics, size, 0.0f, 4, (Object) null);
        u0().Y1(fArr);
    }

    /* access modifiers changed from: private */
    public final void f1(int i10) {
        Log.d(AnyKt.SUGARCUBE_TAG, "takePicture[" + i10 + "] start");
        C14264i0 i0Var = this.f124785R;
        ExecutorService executorService = null;
        if (i0Var == null) {
            C17542s.z("hybridSensor");
            i0Var = null;
        }
        C14264i0.i(i0Var, 0, 1, (Object) null);
        U u10 = this.f124784Q;
        if (u10 == null) {
            C17542s.z("imageCapture");
            u10 = null;
        }
        ExecutorService executorService2 = this.f124783P;
        if (executorService2 == null) {
            C17542s.z("cameraExecutor");
        } else {
            executorService = executorService2;
        }
        u10.A0(executorService, new c(i10, this));
    }

    private final void g1() {
        Log.d(AnyKt.SUGARCUBE_TAG, "updateCaptionText => target #" + this.f124791Z);
        int i10 = this.f124791Z + 1;
        TextView textView = this.f124786S;
        TextView textView2 = null;
        if (textView == null) {
            C17542s.z("captionTextView");
            textView = null;
        }
        textView.setVisibility(0);
        int i11 = this.f124791Z;
        if (i11 == 0) {
            TextView textView3 = this.f124786S;
            if (textView3 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView3;
            }
            textView2.setText(getString(n.f113270R0, String.valueOf(i10)));
        } else if (i11 == 1 || i11 == 2 || i11 == 3) {
            TextView textView4 = this.f124786S;
            if (textView4 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView4;
            }
            textView2.setText(getString(n.f113210H0, String.valueOf(i10)));
        } else if (i11 != 4) {
            TextView textView5 = this.f124786S;
            if (textView5 == null) {
                C17542s.z("captionTextView");
            } else {
                textView2 = textView5;
            }
            textView2.setVisibility(8);
        } else {
            TextView textView6 = this.f124786S;
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
        I c10 = I.c(layoutInflater, viewGroup, false);
        w0(true);
        D0();
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114367b;
        C17542s.i(floatingActionButton, "cancelButton");
        x0(b10, floatingActionButton, new I(this));
        E A02 = A0(v0(VideoAsset.CAPTURE_ICON_SNAP_LEFT));
        this.f124789X = A02;
        c10.f114372g.setPlayer(A02);
        c10.f114370e.setClipToOutline(true);
        this.f124787T = c10.f114373h;
        this.f124788U = c10.f114374i;
        this.f124783P = Executors.newSingleThreadExecutor();
        C5191t activity = getActivity();
        if (activity != null) {
            c10.f114376k.post(new J(activity, this, c10));
            this.f124785R = new C14264i0(activity);
            PanoTargetView panoTargetView = this.f124787T;
            if (panoTargetView == null) {
                C17542s.z("panoView");
                panoTargetView = null;
            }
            panoTargetView.setListener(new b(this, c10));
        }
        this.f124786S = c10.f114368c;
        c10.f114375j.setOnClickListener(new K(this, c10));
        u0().X1("CAMPANO");
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.d(AnyKt.SUGARCUBE_TAG, "HybridCamPanoFragment onDestroyView");
        ExecutorService executorService = this.f124783P;
        if (executorService == null) {
            C17542s.z("cameraExecutor");
            executorService = null;
        }
        executorService.shutdown();
    }

    public void onPause() {
        super.onPause();
        C14264i0 i0Var = this.f124785R;
        if (i0Var == null) {
            C17542s.z("hybridSensor");
            i0Var = null;
        }
        i0Var.y();
    }

    public void onResume() {
        super.onResume();
        E e10 = this.f124789X;
        if (e10 != null) {
            e10.q(true);
        }
        C14264i0 i0Var = this.f124785R;
        if (i0Var == null) {
            C17542s.z("hybridSensor");
            i0Var = null;
        }
        C14264i0.w(i0Var, 0, new M(this), 1, (Object) null);
    }

    public void onStop() {
        super.onStop();
        E e10 = this.f124789X;
        if (e10 != null) {
            e10.stop();
        }
        E e11 = this.f124789X;
        if (e11 != null) {
            e11.release();
        }
    }
}
