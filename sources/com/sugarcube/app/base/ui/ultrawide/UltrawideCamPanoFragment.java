package com.sugarcube.app.base.ui.ultrawide;

import B.g;
import B.h;
import B.j;
import C.C4400j;
import C.C4407o;
import C.C4408p;
import C.U;
import C.V;
import C.q0;
import QE.S;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YE.C13868b;
import YH.C16870n;
import YH.C16877v;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.n;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import ob.C10101e;
import u2.C6012a;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\b2\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\u0004\u0012\u00020\b0\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020\b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u001aH\u0002¢\u0006\u0004\b!\u0010\u001fJ+\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0003R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00109\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u00148\u0002XD¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u0004\u0018\u00010=8BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideCamPanoFragment;", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideFragment;", "<init>", "()V", "LT/g;", "provider", "Landroidx/camera/view/PreviewView;", "viewFinder", "LXH/N;", "N0", "(LT/g;Landroidx/camera/view/PreviewView;)V", "LC/j;", "camera", "P0", "(LC/j;)V", "LC/p;", "cameraInfo", "", "Q0", "(LC/p;)Ljava/lang/String;", "", "isRotated", "", "zoom", "Y0", "(LC/p;ZF)V", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "a1", "(LnI/l;)V", "onDone", "Z0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "Ljava/util/concurrent/ExecutorService;", "P", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "LC/U;", "Q", "LC/U;", "imageCapture", "Landroid/hardware/camera2/CameraManager;", "R", "LXH/o;", "R0", "()Landroid/hardware/camera2/CameraManager;", "cameraManager", "S", "Z", "takePictureInFile", "Lcom/sugarcube/app/base/ui/ultrawide/p0;", "S0", "()Lcom/sugarcube/app/base/ui/ultrawide/p0;", "sensor", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawideCamPanoFragment extends Hilt_UltrawideCamPanoFragment {

    /* renamed from: P  reason: collision with root package name */
    private ExecutorService f125455P;

    /* renamed from: Q  reason: collision with root package name */
    private U f125456Q;

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f125457R = C16825p.b(new B(this));
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public final boolean f125458S;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f125459a;

        static {
            int[] iArr = new int[PreviewView.e.values().length];
            try {
                iArr[PreviewView.e.STREAMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f125459a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/app/base/ui/ultrawide/UltrawideCamPanoFragment$b", "LC/o;", "", "LC/p;", "cameraInfos", "b", "(Ljava/util/List;)Ljava/util/List;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C4407o {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UltrawideCamPanoFragment f125460b;

        b(UltrawideCamPanoFragment ultrawideCamPanoFragment) {
            this.f125460b = ultrawideCamPanoFragment;
        }

        public List<C4408p> b(List<C4408p> list) {
            C17542s.j(list, "cameraInfos");
            String str = "camera selector filter size=" + list.size();
            Log.d(AnyKt.SUGARCUBE_TAG, str);
            C13868b.f118106a.b(str, YE.e.Capture);
            UltrawideCamPanoFragment ultrawideCamPanoFragment = this.f125460b;
            int i10 = 0;
            for (Object next : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                C4408p pVar = (C4408p) next;
                String I02 = ultrawideCamPanoFragment.Q0(pVar);
                h a10 = h.a(pVar);
                C17542s.i(a10, "from(...)");
                String str2 = "[" + i10 + "] filter info " + pVar + " " + a10 + " " + I02;
                Log.d(AnyKt.SUGARCUBE_TAG, str2);
                C13868b.f118106a.b(str2, YE.e.Capture);
                if (C17542s.e(I02, ultrawideCamPanoFragment.x0().v1())) {
                    Log.d(AnyKt.SUGARCUBE_TAG, "return " + I02);
                    return C16877v.t(pVar);
                }
                i10 = i11;
            }
            Log.d(AnyKt.SUGARCUBE_TAG, "return all infos");
            return C16877v.w1(list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideCamPanoFragment$onCreateView$1$3$2", f = "UltrawideCamPanoFragment.kt", l = {147}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f125461c;

        /* renamed from: d  reason: collision with root package name */
        int f125462d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UltrawideCamPanoFragment f125463e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ S f125464f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UltrawideCamPanoFragment ultrawideCamPanoFragment, S s10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f125463e = ultrawideCamPanoFragment;
            this.f125464f = s10;
        }

        /* access modifiers changed from: private */
        public static final void B(S s10) {
            s10.f114438e.setVisibility(8);
            s10.f114439f.setVisibility(0);
            s10.f114437d.setVisibility(0);
            s10.f114436c.setVisibility(0);
        }

        /* access modifiers changed from: private */
        public static final C16807N q(UltrawideCamPanoFragment ultrawideCamPanoFragment, S s10, boolean z10) {
            ultrawideCamPanoFragment.a1(new J(ultrawideCamPanoFragment, s10));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N s(UltrawideCamPanoFragment ultrawideCamPanoFragment, S s10, Exception exc) {
            C5191t activity = ultrawideCamPanoFragment.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new L(s10));
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final void t(S s10) {
            s10.f114438e.setVisibility(8);
            s10.f114439f.setVisibility(0);
            s10.f114437d.setVisibility(0);
            s10.f114436c.setVisibility(0);
        }

        /* access modifiers changed from: private */
        public static final C16807N v(UltrawideCamPanoFragment ultrawideCamPanoFragment, S s10, Exception exc) {
            C5191t activity = ultrawideCamPanoFragment.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new K(s10));
            }
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f125463e, this.f125464f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125462d;
            if (i10 == 0) {
                y.b(obj);
                p0 J02 = this.f125463e.S0();
                if (J02 != null) {
                    p0.i(J02, 0, 1, (Object) null);
                }
                if (this.f125463e.f125458S) {
                    UltrawideCamPanoFragment ultrawideCamPanoFragment = this.f125463e;
                    ultrawideCamPanoFragment.Z0(new H(ultrawideCamPanoFragment, this.f125464f));
                    return C16807N.f139792a;
                }
                this.f125461c = J02;
                this.f125462d = 1;
                if (C16297b0.b(200, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                p0 p0Var = (p0) this.f125461c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UltrawideCamPanoFragment ultrawideCamPanoFragment2 = this.f125463e;
            ultrawideCamPanoFragment2.a1(new I(ultrawideCamPanoFragment2, this.f125464f));
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f125465a;

        d(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f125465a = lVar;
        }

        public final C16818i<?> c() {
            return this.f125465a;
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
            this.f125465a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/sugarcube/app/base/ui/ultrawide/UltrawideCamPanoFragment$e", "LC/U$f;", "LC/U$h;", "outputFileResults", "LXH/N;", "d", "(LC/U$h;)V", "LC/V;", "exception", "e", "(LC/V;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements U.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f125466a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f125467b;

        e(File file, C17642l<? super Boolean, C16807N> lVar) {
            this.f125466a = file;
            this.f125467b = lVar;
        }

        public void d(U.h hVar) {
            C17542s.j(hVar, "outputFileResults");
            File file = this.f125466a;
            Log.d(AnyKt.SUGARCUBE_TAG, "TakePicture - Done " + file);
            this.f125467b.invoke(Boolean.TRUE);
        }

        public void e(V v10) {
            C17542s.j(v10, "exception");
            File file = this.f125466a;
            Log.d(AnyKt.SUGARCUBE_TAG, "TakePicture - Error " + file, v10);
            this.f125467b.invoke(Boolean.FALSE);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/sugarcube/app/base/ui/ultrawide/UltrawideCamPanoFragment$f", "LC/U$e;", "Landroidx/camera/core/n;", "image", "LXH/N;", "c", "(Landroidx/camera/core/n;)V", "LC/V;", "exception", "d", "(LC/V;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends U.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UltrawideCamPanoFragment f125468a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Exception, C16807N> f125469b;

        f(UltrawideCamPanoFragment ultrawideCamPanoFragment, C17642l<? super Exception, C16807N> lVar) {
            this.f125468a = ultrawideCamPanoFragment;
            this.f125469b = lVar;
        }

        /* access modifiers changed from: private */
        public static final void g(UltrawideCamPanoFragment ultrawideCamPanoFragment) {
            C8951o.f0(androidx.navigation.fragment.a.a(ultrawideCamPanoFragment), Kreativ.Capture.d.g.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
        }

        public void c(n nVar) {
            C17542s.j(nVar, "image");
            ByteBuffer p10 = nVar.A1()[0].p();
            C17542s.i(p10, "getBuffer(...)");
            int remaining = p10.remaining();
            byte[] bArr = new byte[remaining];
            p10.get(bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
            long a10 = nVar.F2().a();
            Matrix d10 = nVar.F2().d();
            C17542s.i(d10, "getSensorToBufferTransformMatrix(...)");
            float[] fArr = new float[9];
            d10.getValues(fArr);
            int e10 = nVar.F2().e();
            Rect cropRect = nVar.getCropRect();
            C17542s.i(cropRect, "getCropRect(...)");
            int format = nVar.getFormat();
            nVar.close();
            List<Float> Z02 = C16870n.Z0(fArr);
            Log.d(AnyKt.SUGARCUBE_TAG, "takePicture - got image " + e10 + " " + Z02 + " " + cropRect + " " + format);
            try {
                p0 J02 = this.f125468a.S0();
                if (J02 != null) {
                    UltrawideCamPanoFragment ultrawideCamPanoFragment = this.f125468a;
                    C14294e m10 = J02.m(a10);
                    I0 x02 = ultrawideCamPanoFragment.x0();
                    C17542s.g(decodeByteArray);
                    x02.R0(decodeByteArray, a10, m10, m10.c(), 0, 0);
                }
                this.f125468a.t0();
                C5191t activity = this.f125468a.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new M(this.f125468a));
                }
            } catch (ConcurrentModificationException e11) {
                Log.e(AnyKt.SUGARCUBE_TAG, "TakePicture - onCaptureSuccess error processing sensor data", e11);
                this.f125469b.invoke(e11);
            }
        }

        public void d(V v10) {
            C17542s.j(v10, "exception");
            Log.d(AnyKt.SUGARCUBE_TAG, "TakePicture - Error", v10);
            this.f125469b.invoke(v10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0110 A[Catch:{ Exception -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0144 A[Catch:{ Exception -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x014e A[Catch:{ Exception -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0153 A[Catch:{ Exception -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x019e A[Catch:{ Exception -> 0x0117 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void N0(T.g r14, androidx.camera.view.PreviewView r15) {
        /*
            r13 = this;
            r0 = 0
            android.view.Display r1 = r15.getDisplay()
            r2 = 1
            if (r1 == 0) goto L_0x000d
            int r1 = r1.getRotation()
            goto L_0x000e
        L_0x000d:
            r1 = r2
        L_0x000e:
            com.sugarcube.app.base.ui.ultrawide.I0 r3 = r13.x0()
            java.lang.String r3 = r3.v1()
            r4 = 0
            if (r3 == 0) goto L_0x0048
            android.hardware.camera2.CameraManager r5 = r13.R0()     // Catch:{ Exception -> 0x002f }
            android.hardware.camera2.CameraCharacteristics r3 = r5.getCameraCharacteristics(r3)     // Catch:{ Exception -> 0x002f }
            java.lang.String r5 = "getCameraCharacteristics(...)"
            kotlin.jvm.internal.C17542s.i(r3, r5)     // Catch:{ Exception -> 0x002f }
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE     // Catch:{ Exception -> 0x002f }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ Exception -> 0x002f }
            android.util.Size r3 = (android.util.Size) r3     // Catch:{ Exception -> 0x002f }
            goto L_0x0049
        L_0x002f:
            r3 = move-exception
            YE.b r5 = YE.C13868b.f118106a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "bindCameraUseCases "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            YE.e r6 = YE.e.Capture
            r5.b(r3, r6)
        L_0x0048:
            r3 = r4
        L_0x0049:
            C.q$a r5 = new C.q$a
            r5.<init>()
            C.q$a r5 = r5.c(r2)
            com.sugarcube.app.base.ui.ultrawide.UltrawideCamPanoFragment$b r6 = new com.sugarcube.app.base.ui.ultrawide.UltrawideCamPanoFragment$b
            r6.<init>(r13)
            C.q$a r5 = r5.a(r6)
            C.q r5 = r5.b()
            java.lang.String r6 = "build(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            C.p0$a r7 = new C.p0$a
            r7.<init>()
            C.p0$a r7 = r7.b(r1)
            C.p0 r7 = r7.f()
            kotlin.jvm.internal.C17542s.i(r7, r6)
            C.U$b r8 = new C.U$b
            r8.<init>()
            C.U$b r8 = r8.i(r0)
            C.U$b r1 = r8.b(r1)
            java.lang.String r8 = "setTargetRotation(...)"
            kotlin.jvm.internal.C17542s.i(r1, r8)
            java.lang.String r8 = ")"
            java.lang.String r9 = "Sugarcube"
            if (r3 == 0) goto L_0x00cd
            R.c$a r10 = new R.c$a
            r10.<init>()
            R.d r11 = new R.d
            r12 = 4
            r11.<init>(r3, r12)
            R.c$a r10 = r10.f(r11)
            R.a r11 = new R.a
            r11.<init>(r0, r2)
            R.c$a r10 = r10.d(r11)
            R.c r10 = r10.a()
            kotlin.jvm.internal.C17542s.i(r10, r6)
            r1.c(r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "ImageCapture.setTargetResolution("
            r6.append(r10)
            r6.append(r3)
            r6.append(r8)
            java.lang.String r3 = r6.toString()
            android.util.Log.d(r9, r3)
            YE.b r6 = YE.C13868b.f118106a
            YE.e r8 = YE.e.Capture
            r6.b(r3, r8)
            goto L_0x0103
        L_0x00cd:
            R.c$a r3 = new R.c$a
            r3.<init>()
            R.a r10 = new R.a
            r10.<init>(r0, r2)
            R.c$a r3 = r3.d(r10)
            R.c r3 = r3.a()
            kotlin.jvm.internal.C17542s.i(r3, r6)
            r1.c(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "ImageCapture.setTargetAspectRatio("
            r3.append(r6)
            r3.append(r0)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r9, r3)
            YE.b r6 = YE.C13868b.f118106a
            YE.e r8 = YE.e.Capture
            r6.b(r3, r8)
        L_0x0103:
            C.U r1 = r1.f()
            r13.f125456Q = r1
            r14.B()
            C.U r1 = r13.f125456Q     // Catch:{ Exception -> 0x0117 }
            if (r1 != 0) goto L_0x011a
            java.lang.String r1 = "imageCapture"
            kotlin.jvm.internal.C17542s.z(r1)     // Catch:{ Exception -> 0x0117 }
            r1 = r4
            goto L_0x011a
        L_0x0117:
            r14 = move-exception
            goto L_0x01a3
        L_0x011a:
            r3 = 2
            C.H0[] r3 = new C.H0[r3]     // Catch:{ Exception -> 0x0117 }
            r3[r0] = r7     // Catch:{ Exception -> 0x0117 }
            r3[r2] = r1     // Catch:{ Exception -> 0x0117 }
            C.j r14 = r14.o(r13, r5, r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r1 = "bindToLifecycle(...)"
            kotlin.jvm.internal.C17542s.i(r14, r1)     // Catch:{ Exception -> 0x0117 }
            C.p0$c r15 = r15.getSurfaceProvider()     // Catch:{ Exception -> 0x0117 }
            r7.o0(r15)     // Catch:{ Exception -> 0x0117 }
            r13.P0(r14)     // Catch:{ Exception -> 0x0117 }
            C.p r15 = r14.b()     // Catch:{ Exception -> 0x0117 }
            androidx.lifecycle.F r15 = r15.q()     // Catch:{ Exception -> 0x0117 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ Exception -> 0x0117 }
            C.K0 r15 = (C.K0) r15     // Catch:{ Exception -> 0x0117 }
            if (r15 == 0) goto L_0x014c
            float r15 = r15.c()     // Catch:{ Exception -> 0x0117 }
            java.lang.Float r4 = java.lang.Float.valueOf(r15)     // Catch:{ Exception -> 0x0117 }
        L_0x014c:
            if (r4 == 0) goto L_0x0153
            float r15 = r4.floatValue()     // Catch:{ Exception -> 0x0117 }
            goto L_0x0155
        L_0x0153:
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x0155:
            C.k r1 = r14.a()     // Catch:{ Exception -> 0x0117 }
            r1.f(r15)     // Catch:{ Exception -> 0x0117 }
            int r1 = r7.h0()     // Catch:{ Exception -> 0x0117 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0117 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0117 }
            r3.<init>()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r5 = "camera minZoomRatio="
            r3.append(r5)     // Catch:{ Exception -> 0x0117 }
            r3.append(r4)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = " zoom="
            r3.append(r4)     // Catch:{ Exception -> 0x0117 }
            r3.append(r15)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = " targetRotation="
            r3.append(r4)     // Catch:{ Exception -> 0x0117 }
            r3.append(r1)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0117 }
            android.util.Log.d(r9, r1)     // Catch:{ Exception -> 0x0117 }
            YE.b r3 = YE.C13868b.f118106a     // Catch:{ Exception -> 0x0117 }
            YE.e r4 = YE.e.Capture     // Catch:{ Exception -> 0x0117 }
            r3.b(r1, r4)     // Catch:{ Exception -> 0x0117 }
            C.p r14 = r14.b()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r1 = "getCameraInfo(...)"
            kotlin.jvm.internal.C17542s.i(r14, r1)     // Catch:{ Exception -> 0x0117 }
            int r1 = r7.h0()     // Catch:{ Exception -> 0x0117 }
            if (r1 != 0) goto L_0x019f
            r0 = r2
        L_0x019f:
            r13.Y0(r14, r0, r15)     // Catch:{ Exception -> 0x0117 }
            goto L_0x01a8
        L_0x01a3:
            java.lang.String r15 = "Use case binding failed"
            android.util.Log.e(r9, r15, r14)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.UltrawideCamPanoFragment.N0(T.g, androidx.camera.view.PreviewView):void");
    }

    /* access modifiers changed from: private */
    public static final CameraManager O0(UltrawideCamPanoFragment ultrawideCamPanoFragment) {
        Object systemService = ultrawideCamPanoFragment.requireContext().getSystemService("camera");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return (CameraManager) systemService;
    }

    private final void P0(C4400j jVar) {
        try {
            j.a aVar = new j.a();
            aVar.g(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            aVar.g(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            g n10 = g.n(jVar.a());
            C17542s.i(n10, "from(...)");
            C17542s.g(n10.g(aVar.c()));
        } catch (Exception e10) {
            String str = "configNoStabilization failed " + e10.getMessage();
            Log.d(AnyKt.SUGARCUBE_TAG, str);
            C13868b.f118106a.b(str, YE.e.Capture);
        }
    }

    /* access modifiers changed from: private */
    public final String Q0(C4408p pVar) {
        String str;
        try {
            h a10 = h.a(pVar);
            C17542s.i(a10, "from(...)");
            str = a10.b();
        } catch (Exception e10) {
            String str2 = "getCameraId(" + pVar + ") failed " + e10.getMessage();
            Log.d(AnyKt.SUGARCUBE_TAG, str2);
            C13868b.f118106a.b(str2, YE.e.Capture);
            str = null;
        }
        if (str != null) {
            return str;
        }
        String v12 = x0().v1();
        return v12 == null ? "0" : v12;
    }

    private final CameraManager R0() {
        return (CameraManager) this.f125457R.getValue();
    }

    /* access modifiers changed from: private */
    public final p0 S0() {
        C14304j w02 = w0();
        if (w02 != null) {
            return w02.A();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C16807N T0(UltrawideCamPanoFragment ultrawideCamPanoFragment) {
        ultrawideCamPanoFragment.u0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void U0(C5191t tVar, UltrawideCamPanoFragment ultrawideCamPanoFragment, S s10) {
        C10101e<T.g> t10 = T.g.t(tVar);
        t10.a(new G(t10, ultrawideCamPanoFragment, s10), C6012a.h(tVar));
    }

    /* access modifiers changed from: private */
    public static final void V0(C10101e eVar, UltrawideCamPanoFragment ultrawideCamPanoFragment, S s10) {
        T.g gVar = (T.g) eVar.get();
        if (gVar != null) {
            PreviewView previewView = s10.f114440g;
            C17542s.i(previewView, "viewFinder");
            ultrawideCamPanoFragment.N0(gVar, previewView);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(S s10, PreviewView.e eVar) {
        if ((eVar == null ? -1 : a.f125459a[eVar.ordinal()]) == 1) {
            s10.f114438e.setVisibility(8);
            s10.f114439f.setVisibility(0);
            s10.f114437d.setVisibility(0);
            s10.f114436c.setVisibility(0);
        } else {
            s10.f114438e.setVisibility(0);
            s10.f114439f.setVisibility(8);
            s10.f114437d.setVisibility(8);
            s10.f114436c.setVisibility(8);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void X0(UltrawideCamPanoFragment ultrawideCamPanoFragment, S s10, View view) {
        p0 S02 = ultrawideCamPanoFragment.S0();
        if (S02 != null) {
            ultrawideCamPanoFragment.x0().T1(S02.l());
        }
        s10.f114438e.setVisibility(0);
        s10.f114439f.setVisibility(8);
        s10.f114437d.setVisibility(8);
        s10.f114436c.setVisibility(8);
        F0 unused = C16314k.d(C5222z.a(ultrawideCamPanoFragment), (C17168i) null, (T) null, new c(ultrawideCamPanoFragment, s10, (C17164e<? super c>) null), 3, (Object) null);
    }

    private final void Y0(C4408p pVar, boolean z10, float f10) {
        Size size;
        String Q02 = Q0(pVar);
        CameraCharacteristics cameraCharacteristics = R0().getCameraCharacteristics(Q02);
        C17542s.i(cameraCharacteristics, "getCameraCharacteristics(...)");
        U u10 = this.f125456Q;
        if (u10 == null) {
            C17542s.z("imageCapture");
            u10 = null;
        }
        q0 p02 = u10.p0();
        if ((p02 == null || (size = p02.a()) == null) && (size = (Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE)) == null) {
            size = new Size(0, 0);
        }
        C14286a a10 = C14286a.f125581f.a(cameraCharacteristics, size, f10);
        String str = "setIntrinsics(" + Q02 + "," + z10 + "," + f10 + ") -> " + a10;
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, YE.e.Capture);
        x0().S1(a10);
    }

    /* access modifiers changed from: private */
    public final void Z0(C17642l<? super Boolean, C16807N> lVar) {
        File l12 = x0().l1();
        Log.d(AnyKt.SUGARCUBE_TAG, "takePicture - start " + l12);
        U.g a10 = new U.g.a(l12).a();
        C17542s.i(a10, "build(...)");
        U u10 = this.f125456Q;
        ExecutorService executorService = null;
        if (u10 == null) {
            C17542s.z("imageCapture");
            u10 = null;
        }
        ExecutorService executorService2 = this.f125455P;
        if (executorService2 == null) {
            C17542s.z("cameraExecutor");
        } else {
            executorService = executorService2;
        }
        u10.B0(a10, executorService, new e(l12, lVar));
    }

    /* access modifiers changed from: private */
    public final void a1(C17642l<? super Exception, C16807N> lVar) {
        Log.d(AnyKt.SUGARCUBE_TAG, "takePicture - start");
        U u10 = this.f125456Q;
        ExecutorService executorService = null;
        if (u10 == null) {
            C17542s.z("imageCapture");
            u10 = null;
        }
        ExecutorService executorService2 = this.f125455P;
        if (executorService2 == null) {
            C17542s.z("cameraExecutor");
        } else {
            executorService = executorService2;
        }
        u10.A0(executorService, new f(this, lVar));
    }

    @SuppressLint({"RestrictedApi"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        S c10 = S.c(layoutInflater, viewGroup, false);
        y0(true);
        v0();
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114435b;
        C17542s.i(floatingActionButton, "cancelButton");
        z0(b10, floatingActionButton, new C(this));
        c10.f114438e.setVisibility(0);
        this.f125455P = Executors.newSingleThreadExecutor();
        C5191t activity = getActivity();
        if (activity != null) {
            c10.f114440g.post(new D(activity, this, c10));
            c10.f114440g.getPreviewStreamState().observe(getViewLifecycleOwner(), new d(new E(c10)));
        }
        c10.f114439f.setOnClickListener(new F(this, c10));
        x0().R1("CAMPANO");
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.d(AnyKt.SUGARCUBE_TAG, "UltrawideCamPanoFragment onDestroyView");
        ExecutorService executorService = this.f125455P;
        if (executorService == null) {
            C17542s.z("cameraExecutor");
            executorService = null;
        }
        executorService.shutdown();
    }
}
