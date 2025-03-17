package v;

import C.C4391e0;
import G.d;
import N.f;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5048t0;
import androidx.camera.core.impl.C5050u0;
import androidx.camera.core.impl.X0;
import androidx.camera.core.n;
import androidx.camera.core.p;
import androidx.camera.core.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import ob.C10101e;
import w.B;

final class u2 implements q2 {

    /* renamed from: a  reason: collision with root package name */
    private final B f30713a;

    /* renamed from: b  reason: collision with root package name */
    final f f30714b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30715c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30716d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f30717e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30718f = false;

    /* renamed from: g  reason: collision with root package name */
    q f30719g;

    /* renamed from: h  reason: collision with root package name */
    private C5040p f30720h;

    /* renamed from: i  reason: collision with root package name */
    private C5019e0 f30721i;

    /* renamed from: j  reason: collision with root package name */
    ImageWriter f30722j;

    class a extends CameraCaptureSession.StateCallback {
        a() {
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                u2.this.f30722j = K.a.c(inputSurface, 1);
            }
        }
    }

    u2(B b10) {
        boolean z10 = false;
        this.f30713a = b10;
        this.f30717e = v2.a(b10, 4);
        this.f30718f = b.b(ZslDisablerQuirk.class) != null ? true : z10;
        this.f30714b = new f(3, new r2());
    }

    private void j() {
        f fVar = this.f30714b;
        while (!fVar.isEmpty()) {
            ((n) fVar.a()).close();
        }
        C5019e0 e0Var = this.f30721i;
        if (e0Var != null) {
            q qVar = this.f30719g;
            if (qVar != null) {
                e0Var.k().a(new t2(qVar), H.a.d());
                this.f30719g = null;
            }
            e0Var.d();
            this.f30721i = null;
        }
        ImageWriter imageWriter = this.f30722j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f30722j = null;
        }
    }

    private Map<Integer, Size> k(B b10) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) b10.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            C4391e0.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i10 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new d(true));
                hashMap.put(Integer.valueOf(i10), inputSizes[0]);
            }
        }
        return hashMap;
    }

    private boolean l(B b10, int i10) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) b10.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i10)) == null) {
            return false;
        }
        for (int i11 : validOutputFormatsForInput) {
            if (i11 == 256) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(C5048t0 t0Var) {
        try {
            n b10 = t0Var.b();
            if (b10 != null) {
                this.f30714b.c(b10);
            }
        } catch (IllegalStateException e10) {
            C4391e0.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    public boolean a() {
        return this.f30715c;
    }

    public void b(X0.b bVar) {
        j();
        if (this.f30715c) {
            bVar.z(1);
        } else if (this.f30718f) {
            bVar.z(1);
        } else {
            Map<Integer, Size> k10 = k(this.f30713a);
            if (!this.f30717e || k10.isEmpty() || !k10.containsKey(34) || !l(this.f30713a, 34)) {
                bVar.z(1);
                return;
            }
            Size size = k10.get(34);
            p pVar = new p(size.getWidth(), size.getHeight(), 34, 9);
            this.f30720h = pVar.m();
            this.f30719g = new q(pVar);
            pVar.f(new s2(this), H.a.c());
            C5050u0 u0Var = new C5050u0(this.f30719g.getSurface(), new Size(this.f30719g.getWidth(), this.f30719g.getHeight()), 34);
            this.f30721i = u0Var;
            q qVar = this.f30719g;
            C10101e<Void> k11 = u0Var.k();
            Objects.requireNonNull(qVar);
            k11.a(new t2(qVar), H.a.d());
            bVar.l(this.f30721i);
            bVar.e(this.f30720h);
            bVar.k(new a());
            bVar.w(new InputConfiguration(this.f30719g.getWidth(), this.f30719g.getHeight(), this.f30719g.c()));
        }
    }

    public void c(boolean z10) {
        this.f30716d = z10;
    }

    public void d(boolean z10) {
        this.f30715c = z10;
    }

    public n e() {
        try {
            return (n) this.f30714b.a();
        } catch (NoSuchElementException unused) {
            C4391e0.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    public boolean f(n nVar) {
        Image k10 = nVar.k();
        ImageWriter imageWriter = this.f30722j;
        if (!(imageWriter == null || k10 == null)) {
            try {
                K.a.d(imageWriter, k10);
                return true;
            } catch (IllegalStateException e10) {
                C4391e0.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
            }
        }
        return false;
    }

    public boolean g() {
        return this.f30716d;
    }
}
