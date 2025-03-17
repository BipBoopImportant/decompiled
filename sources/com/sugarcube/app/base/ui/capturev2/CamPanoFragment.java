package com.sugarcube.app.base.ui.capturev2;

import B.g;
import B.h;
import B.j;
import C.C4400j;
import C.C4407o;
import C.C4408p;
import C.U;
import C.V;
import C.q0;
import QE.C13439p;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16870n;
import YH.C16877v;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
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
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import hF.C14540b;
import hF.C14541c;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import ob.C10101e;
import u2.C6012a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\b2\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\u0004\u0012\u00020\b0\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u0003R\u001a\u0010/\u001a\u00020*8\u0014X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/CamPanoFragment;", "Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "<init>", "()V", "LT/g;", "provider", "Landroidx/camera/view/PreviewView;", "viewFinder", "LXH/N;", "M0", "(LT/g;Landroidx/camera/view/PreviewView;)V", "LC/j;", "camera", "O0", "(LC/j;)V", "LC/p;", "cameraInfo", "", "P0", "(LC/p;)Ljava/lang/String;", "", "isRotated", "", "zoom", "V0", "(LC/p;ZF)V", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "W0", "(LnI/l;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "LhF/b;", "M", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "Ljava/util/concurrent/ExecutorService;", "N", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "LC/U;", "O", "LC/U;", "imageCapture", "Landroid/hardware/camera2/CameraManager;", "P", "LXH/o;", "Q0", "()Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lcom/sugarcube/app/base/ui/capturev2/W;", "Q", "Lcom/sugarcube/app/base/ui/capturev2/W;", "panoIntrinsics", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CamPanoFragment extends Hilt_CamPanoFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C14540b f123374M = C14540b.Snap;

    /* renamed from: N  reason: collision with root package name */
    private ExecutorService f123375N;

    /* renamed from: O  reason: collision with root package name */
    private U f123376O;

    /* renamed from: P  reason: collision with root package name */
    private final C16824o f123377P = C16825p.b(new C14241x(this));
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public W f123378Q = new W(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, (DefaultConstructorMarker) null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f123379a;

        static {
            int[] iArr = new int[PreviewView.e.values().length];
            try {
                iArr[PreviewView.e.STREAMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f123379a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/app/base/ui/capturev2/CamPanoFragment$b", "LC/o;", "", "LC/p;", "cameraInfos", "b", "(Ljava/util/List;)Ljava/util/List;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C4407o {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CamPanoFragment f123380b;

        b(CamPanoFragment camPanoFragment) {
            this.f123380b = camPanoFragment;
        }

        public List<C4408p> b(List<C4408p> list) {
            C17542s.j(list, "cameraInfos");
            h1 n02 = this.f123380b.n0();
            int size = list.size();
            h1.R1(n02, "camera selector filter size=" + size, (Throwable) null, 2, (Object) null);
            CamPanoFragment camPanoFragment = this.f123380b;
            int i10 = 0;
            for (Object next : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                C4408p pVar = (C4408p) next;
                String J02 = camPanoFragment.P0(pVar);
                h1 n03 = camPanoFragment.n0();
                h1.R1(n03, "[" + i10 + "] filter info " + pVar + " " + J02, (Throwable) null, 2, (Object) null);
                if (C17542s.e(J02, camPanoFragment.n0().q1())) {
                    return C16877v.t(pVar);
                }
                i10 = i11;
            }
            return C16877v.w1(list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.CamPanoFragment$onCreateView$1$2$1", f = "CamPanoFragment.kt", l = {121}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f123381c;

        /* renamed from: d  reason: collision with root package name */
        int f123382d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CamPanoFragment f123383e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13439p f123384f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CamPanoFragment camPanoFragment, C13439p pVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f123383e = camPanoFragment;
            this.f123384f = pVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(CamPanoFragment camPanoFragment, C13439p pVar, Exception exc) {
            C5191t activity = camPanoFragment.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new D(pVar));
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final void m(C13439p pVar) {
            pVar.f114678e.setVisibility(8);
            pVar.f114679f.setVisibility(0);
            pVar.f114677d.setVisibility(0);
            pVar.f114676c.setVisibility(0);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f123383e, this.f123384f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123382d;
            if (i10 == 0) {
                y.b(obj);
                U o02 = this.f123383e.o0();
                if (o02 != null) {
                    U.l(o02, 0, 1, (Object) null);
                }
                this.f123381c = o02;
                this.f123382d = 1;
                if (C16297b0.b(200, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                U u10 = (U) this.f123381c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CamPanoFragment camPanoFragment = this.f123383e;
            camPanoFragment.W0(new C(camPanoFragment, this.f123384f));
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f123385a;

        d(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f123385a = lVar;
        }

        public final C16818i<?> c() {
            return this.f123385a;
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
            this.f123385a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/sugarcube/app/base/ui/capturev2/CamPanoFragment$e", "LC/U$e;", "Landroidx/camera/core/n;", "image", "LXH/N;", "c", "(Landroidx/camera/core/n;)V", "LC/V;", "exception", "d", "(LC/V;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends U.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CamPanoFragment f123386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Exception, C16807N> f123387b;

        e(CamPanoFragment camPanoFragment, C17642l<? super Exception, C16807N> lVar) {
            this.f123386a = camPanoFragment;
            this.f123387b = lVar;
        }

        public void c(n nVar) {
            R0 p10;
            C17542s.j(nVar, "image");
            ByteBuffer p11 = nVar.A1()[0].p();
            C17542s.i(p11, "getBuffer(...)");
            int remaining = p11.remaining();
            byte[] bArr = new byte[remaining];
            p11.get(bArr);
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
            h1 n02 = this.f123386a.n0();
            List<Float> Z02 = C16870n.Z0(fArr);
            h1.R1(n02, "takePicture - got image " + e10 + " " + Z02 + " " + cropRect + " " + format, (Throwable) null, 2, (Object) null);
            U o02 = this.f123386a.o0();
            if (o02 == null || (p10 = o02.p(a10)) == null) {
                this.f123387b.invoke(new Exception("could not get sensor data"));
                return;
            }
            C17642l<Exception, C16807N> lVar = this.f123387b;
            CamPanoFragment camPanoFragment = this.f123386a;
            if (decodeByteArray != null) {
                camPanoFragment.n0().H0(p10, decodeByteArray, a10, camPanoFragment.f123378Q);
                camPanoFragment.n0().w1();
                return;
            }
            lVar.invoke(new Exception("could not get image"));
        }

        public void d(V v10) {
            C17542s.j(v10, "exception");
            this.f123386a.n0().Q1("TakePicture - Error", v10);
            this.f123387b.invoke(v10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0105 A[Catch:{ Exception -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0138 A[Catch:{ Exception -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0141 A[Catch:{ Exception -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0144 A[Catch:{ Exception -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0149 A[Catch:{ Exception -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0191 A[Catch:{ Exception -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void M0(T.g r14, androidx.camera.view.PreviewView r15) {
        /*
            r13 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            android.view.Display r3 = r15.getDisplay()
            int r3 = r3.getRotation()
            com.sugarcube.app.base.ui.capturev2.h1 r4 = r13.n0()
            java.lang.String r4 = r4.q1()
            r5 = 0
            if (r4 == 0) goto L_0x0045
            android.hardware.camera2.CameraManager r6 = r13.Q0()     // Catch:{ Exception -> 0x002c }
            android.hardware.camera2.CameraCharacteristics r4 = r6.getCameraCharacteristics(r4)     // Catch:{ Exception -> 0x002c }
            java.lang.String r6 = "getCameraCharacteristics(...)"
            kotlin.jvm.internal.C17542s.i(r4, r6)     // Catch:{ Exception -> 0x002c }
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE     // Catch:{ Exception -> 0x002c }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ Exception -> 0x002c }
            android.util.Size r4 = (android.util.Size) r4     // Catch:{ Exception -> 0x002c }
            goto L_0x0046
        L_0x002c:
            r4 = move-exception
            com.sugarcube.app.base.ui.capturev2.h1 r6 = r13.n0()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "bindCameraUseCases "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            r6.Q1(r7, r4)
        L_0x0045:
            r4 = r5
        L_0x0046:
            C.q$a r6 = new C.q$a
            r6.<init>()
            C.q$a r6 = r6.c(r2)
            com.sugarcube.app.base.ui.capturev2.CamPanoFragment$b r7 = new com.sugarcube.app.base.ui.capturev2.CamPanoFragment$b
            r7.<init>(r13)
            C.q$a r6 = r6.a(r7)
            C.q r6 = r6.b()
            java.lang.String r7 = "build(...)"
            kotlin.jvm.internal.C17542s.i(r6, r7)
            C.p0$a r8 = new C.p0$a
            r8.<init>()
            C.p0$a r8 = r8.b(r3)
            C.p0 r8 = r8.f()
            kotlin.jvm.internal.C17542s.i(r8, r7)
            C.U$b r9 = new C.U$b
            r9.<init>()
            C.U$b r9 = r9.i(r1)
            C.U$b r3 = r9.b(r3)
            java.lang.String r9 = "setTargetRotation(...)"
            kotlin.jvm.internal.C17542s.i(r3, r9)
            java.lang.String r9 = ")"
            if (r4 == 0) goto L_0x00c5
            R.c$a r10 = new R.c$a
            r10.<init>()
            R.d r11 = new R.d
            r12 = 4
            r11.<init>(r4, r12)
            R.c$a r10 = r10.f(r11)
            R.a r11 = new R.a
            r11.<init>(r1, r2)
            R.c$a r10 = r10.d(r11)
            R.c r10 = r10.a()
            kotlin.jvm.internal.C17542s.i(r10, r7)
            r3.c(r10)
            com.sugarcube.app.base.ui.capturev2.h1 r7 = r13.n0()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "ImageCapture.setTargetResolution("
            r10.append(r11)
            r10.append(r4)
            r10.append(r9)
            java.lang.String r4 = r10.toString()
            com.sugarcube.app.base.ui.capturev2.h1.R1(r7, r4, r5, r0, r5)
            goto L_0x00f8
        L_0x00c5:
            R.c$a r4 = new R.c$a
            r4.<init>()
            R.a r10 = new R.a
            r10.<init>(r1, r2)
            R.c$a r4 = r4.d(r10)
            R.c r4 = r4.a()
            kotlin.jvm.internal.C17542s.i(r4, r7)
            r3.c(r4)
            com.sugarcube.app.base.ui.capturev2.h1 r4 = r13.n0()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "ImageCapture.setTargetAspectRatio("
            r7.append(r10)
            r7.append(r1)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.sugarcube.app.base.ui.capturev2.h1.R1(r4, r7, r5, r0, r5)
        L_0x00f8:
            C.U r3 = r3.f()
            r13.f123376O = r3
            r14.B()
            C.U r3 = r13.f123376O     // Catch:{ Exception -> 0x010c }
            if (r3 != 0) goto L_0x010f
            java.lang.String r3 = "imageCapture"
            kotlin.jvm.internal.C17542s.z(r3)     // Catch:{ Exception -> 0x010c }
            r3 = r5
            goto L_0x010f
        L_0x010c:
            r14 = move-exception
            goto L_0x0196
        L_0x010f:
            C.H0[] r4 = new C.H0[r0]     // Catch:{ Exception -> 0x010c }
            r4[r1] = r8     // Catch:{ Exception -> 0x010c }
            r4[r2] = r3     // Catch:{ Exception -> 0x010c }
            C.j r14 = r14.o(r13, r6, r4)     // Catch:{ Exception -> 0x010c }
            java.lang.String r3 = "bindToLifecycle(...)"
            kotlin.jvm.internal.C17542s.i(r14, r3)     // Catch:{ Exception -> 0x010c }
            C.p0$c r15 = r15.getSurfaceProvider()     // Catch:{ Exception -> 0x010c }
            r8.o0(r15)     // Catch:{ Exception -> 0x010c }
            r13.O0(r14)     // Catch:{ Exception -> 0x010c }
            C.p r15 = r14.b()     // Catch:{ Exception -> 0x010c }
            androidx.lifecycle.F r15 = r15.q()     // Catch:{ Exception -> 0x010c }
            java.lang.Object r15 = r15.getValue()     // Catch:{ Exception -> 0x010c }
            C.K0 r15 = (C.K0) r15     // Catch:{ Exception -> 0x010c }
            if (r15 == 0) goto L_0x0141
            float r15 = r15.c()     // Catch:{ Exception -> 0x010c }
            java.lang.Float r15 = java.lang.Float.valueOf(r15)     // Catch:{ Exception -> 0x010c }
            goto L_0x0142
        L_0x0141:
            r15 = r5
        L_0x0142:
            if (r15 == 0) goto L_0x0149
            float r3 = r15.floatValue()     // Catch:{ Exception -> 0x010c }
            goto L_0x014b
        L_0x0149:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x014b:
            C.k r4 = r14.a()     // Catch:{ Exception -> 0x010c }
            r4.f(r3)     // Catch:{ Exception -> 0x010c }
            com.sugarcube.app.base.ui.capturev2.h1 r4 = r13.n0()     // Catch:{ Exception -> 0x010c }
            int r6 = r8.h0()     // Catch:{ Exception -> 0x010c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x010c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010c }
            r7.<init>()     // Catch:{ Exception -> 0x010c }
            java.lang.String r9 = "camera minZoomRatio="
            r7.append(r9)     // Catch:{ Exception -> 0x010c }
            r7.append(r15)     // Catch:{ Exception -> 0x010c }
            java.lang.String r15 = " zoom="
            r7.append(r15)     // Catch:{ Exception -> 0x010c }
            r7.append(r3)     // Catch:{ Exception -> 0x010c }
            java.lang.String r15 = " targetRotation="
            r7.append(r15)     // Catch:{ Exception -> 0x010c }
            r7.append(r6)     // Catch:{ Exception -> 0x010c }
            java.lang.String r15 = r7.toString()     // Catch:{ Exception -> 0x010c }
            com.sugarcube.app.base.ui.capturev2.h1.R1(r4, r15, r5, r0, r5)     // Catch:{ Exception -> 0x010c }
            C.p r14 = r14.b()     // Catch:{ Exception -> 0x010c }
            java.lang.String r15 = "getCameraInfo(...)"
            kotlin.jvm.internal.C17542s.i(r14, r15)     // Catch:{ Exception -> 0x010c }
            int r15 = r8.h0()     // Catch:{ Exception -> 0x010c }
            if (r15 != 0) goto L_0x0192
            r1 = r2
        L_0x0192:
            r13.V0(r14, r1, r3)     // Catch:{ Exception -> 0x010c }
            goto L_0x019f
        L_0x0196:
            com.sugarcube.app.base.ui.capturev2.h1 r15 = r13.n0()
            java.lang.String r0 = "Use case binding failed"
            r15.Q1(r0, r14)
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.CamPanoFragment.M0(T.g, androidx.camera.view.PreviewView):void");
    }

    /* access modifiers changed from: private */
    public static final CameraManager N0(CamPanoFragment camPanoFragment) {
        Object systemService = camPanoFragment.requireContext().getSystemService("camera");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return (CameraManager) systemService;
    }

    private final void O0(C4400j jVar) {
        try {
            j.a aVar = new j.a();
            aVar.g(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            aVar.g(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            g n10 = g.n(jVar.a());
            C17542s.i(n10, "from(...)");
            C17542s.g(n10.g(aVar.c()));
        } catch (Exception e10) {
            h1 n02 = n0();
            String message = e10.getMessage();
            h1.R1(n02, "configNoStabilization failed " + message, (Throwable) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final String P0(C4408p pVar) {
        String str;
        try {
            h a10 = h.a(pVar);
            C17542s.i(a10, "from(...)");
            str = a10.b();
        } catch (Exception e10) {
            h1 n02 = n0();
            String message = e10.getMessage();
            h1.R1(n02, "getCameraId(" + pVar + ") failed " + message, (Throwable) null, 2, (Object) null);
            str = null;
        }
        if (str != null) {
            return str;
        }
        String q12 = n0().q1();
        return q12 == null ? "0" : q12;
    }

    private final CameraManager Q0() {
        return (CameraManager) this.f123377P.getValue();
    }

    /* access modifiers changed from: private */
    public static final void R0(C5191t tVar, CamPanoFragment camPanoFragment, C13439p pVar) {
        C10101e<T.g> t10 = T.g.t(tVar);
        t10.a(new B(t10, camPanoFragment, pVar), C6012a.h(tVar));
    }

    /* access modifiers changed from: private */
    public static final void S0(C10101e eVar, CamPanoFragment camPanoFragment, C13439p pVar) {
        T.g gVar = (T.g) eVar.get();
        if (gVar != null) {
            PreviewView previewView = pVar.f114680g;
            C17542s.i(previewView, "viewFinder");
            camPanoFragment.M0(gVar, previewView);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N T0(C13439p pVar, PreviewView.e eVar) {
        if ((eVar == null ? -1 : a.f123379a[eVar.ordinal()]) == 1) {
            pVar.f114678e.setVisibility(8);
            pVar.f114679f.setVisibility(0);
            pVar.f114677d.setVisibility(0);
            pVar.f114676c.setVisibility(0);
        } else {
            pVar.f114678e.setVisibility(0);
            pVar.f114679f.setVisibility(8);
            pVar.f114677d.setVisibility(8);
            pVar.f114676c.setVisibility(8);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void U0(CamPanoFragment camPanoFragment, C13439p pVar, View view) {
        camPanoFragment.n0().V1();
        pVar.f114678e.setVisibility(0);
        pVar.f114679f.setVisibility(8);
        pVar.f114677d.setVisibility(8);
        pVar.f114676c.setVisibility(8);
        F0 unused = C16314k.d(C5222z.a(camPanoFragment), (C17168i) null, (T) null, new c(camPanoFragment, pVar, (C17164e<? super c>) null), 3, (Object) null);
    }

    private final void V0(C4408p pVar, boolean z10, float f10) {
        Size size;
        String P02 = P0(pVar);
        CameraCharacteristics cameraCharacteristics = Q0().getCameraCharacteristics(P02);
        C17542s.i(cameraCharacteristics, "getCameraCharacteristics(...)");
        U u10 = this.f123376O;
        if (u10 == null) {
            C17542s.z("imageCapture");
            u10 = null;
        }
        q0 p02 = u10.p0();
        if ((p02 == null || (size = p02.a()) == null) && (size = (Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE)) == null) {
            size = new Size(0, 0);
        }
        this.f123378Q = W.f123656f.a(cameraCharacteristics, size, f10);
        h1.R1(n0(), "setIntrinsics(" + P02 + "," + z10 + "," + f10 + ") -> " + this.f123378Q, (Throwable) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void W0(C17642l<? super Exception, C16807N> lVar) {
        ExecutorService executorService = null;
        h1.R1(n0(), "takePicture - start", (Throwable) null, 2, (Object) null);
        U u10 = this.f123376O;
        if (u10 == null) {
            C17542s.z("imageCapture");
            u10 = null;
        }
        ExecutorService executorService2 = this.f123375N;
        if (executorService2 == null) {
            C17542s.z("cameraExecutor");
        } else {
            executorService = executorService2;
        }
        u10.A0(executorService, new e(this, lVar));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C13439p c10 = C13439p.c(layoutInflater, viewGroup, false);
        t0(true);
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114675b;
        C17542s.i(floatingActionButton, "cancelButton");
        u0(b10, floatingActionButton);
        c10.f114678e.setVisibility(0);
        this.f123375N = Executors.newSingleThreadExecutor();
        C5191t activity = getActivity();
        if (activity != null) {
            c10.f114680g.post(new C14243y(activity, this, c10));
            c10.f114680g.getPreviewStreamState().observe(getViewLifecycleOwner(), new d(new C14245z(c10)));
        }
        c10.f114679f.setOnClickListener(new A(this, c10));
        n0().a2(C14541c.CAMPANO);
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onDestroyView() {
        super.onDestroyView();
        ExecutorService executorService = null;
        h1.R1(n0(), "CamPanoFragment onDestroyView", (Throwable) null, 2, (Object) null);
        ExecutorService executorService2 = this.f123375N;
        if (executorService2 == null) {
            C17542s.z("cameraExecutor");
        } else {
            executorService = executorService2;
        }
        executorService.shutdown();
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123374M;
    }
}
