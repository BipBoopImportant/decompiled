package v;

import B.h;
import C.C4408p;
import C.K0;
import G.c;
import H2.i;
import android.hardware.camera2.CameraCharacteristics;
import androidx.lifecycle.F;
import w.B;

/* renamed from: v.H0  reason: case insensitive filesystem */
public class C6030H0 implements C4408p {

    /* renamed from: a  reason: collision with root package name */
    private final String f30208a;

    /* renamed from: b  reason: collision with root package name */
    private final B f30209b;

    /* renamed from: c  reason: collision with root package name */
    private final h f30210c;

    public int c() {
        return o(0);
    }

    public String d() {
        return this.f30208a;
    }

    public int f() {
        Integer num = (Integer) this.f30209b.a(CameraCharacteristics.LENS_FACING);
        i.b(num != null, "Unable to get the lens facing of the camera.");
        return B1.a(num.intValue());
    }

    public F<Integer> l() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    public int o(int i10) {
        int s10 = s();
        int b10 = c.b(i10);
        boolean z10 = true;
        if (1 != f()) {
            z10 = false;
        }
        return c.a(b10, s10, z10);
    }

    public F<K0> q() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    public h r() {
        return this.f30210c;
    }

    /* access modifiers changed from: package-private */
    public int s() {
        Integer num = (Integer) this.f30209b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        i.g(num);
        return num.intValue();
    }
}
