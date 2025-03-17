package v;

import C.C4391e0;
import G.h;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.impl.C5045s;
import androidx.camera.core.impl.C5047t;
import androidx.camera.core.impl.C5049u;
import androidx.camera.core.impl.C5051v;
import androidx.camera.core.impl.C5053w;
import androidx.camera.core.impl.C5055x;
import androidx.camera.core.impl.C5057y;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.impl.g1;
import java.nio.BufferUnderflowException;

/* renamed from: v.g  reason: case insensitive filesystem */
public class C6067g implements C5059z {

    /* renamed from: a  reason: collision with root package name */
    private final g1 f30559a;

    /* renamed from: b  reason: collision with root package name */
    private final CaptureResult f30560b;

    public C6067g(g1 g1Var, CaptureResult captureResult) {
        this.f30559a = g1Var;
        this.f30560b = captureResult;
    }

    public long a() {
        Long l10 = (Long) this.f30560b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1;
        }
        return l10.longValue();
    }

    public g1 b() {
        return this.f30559a;
    }

    public void c(h.b bVar) {
        super.c(bVar);
        try {
            Integer num = (Integer) this.f30560b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            C4391e0.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.f30560b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.f30560b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer num2 = (Integer) this.f30560b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            Integer num3 = (Integer) this.f30560b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num3 != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (((float) num3.intValue()) / 100.0f)));
            }
            bVar.k(num2.intValue());
        }
        Float f11 = (Float) this.f30560b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num4 = (Integer) this.f30560b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            h.c cVar = h.c.AUTO;
            if (num4.intValue() == 0) {
                cVar = h.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    public C5057y d() {
        Integer num = (Integer) this.f30560b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return C5057y.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return C5057y.NONE;
        }
        if (intValue == 2) {
            return C5057y.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return C5057y.FIRED;
        }
        C4391e0.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return C5057y.UNKNOWN;
    }

    public C5053w e() {
        Integer num = (Integer) this.f30560b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return C5053w.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return C5053w.OFF;
            case 1:
                return C5053w.AUTO;
            case 2:
                return C5053w.INCANDESCENT;
            case 3:
                return C5053w.FLUORESCENT;
            case 4:
                return C5053w.WARM_FLUORESCENT;
            case 5:
                return C5053w.DAYLIGHT;
            case 6:
                return C5053w.CLOUDY_DAYLIGHT;
            case 7:
                return C5053w.TWILIGHT;
            case 8:
                return C5053w.SHADE;
            default:
                return C5053w.UNKNOWN;
        }
    }

    public CaptureResult f() {
        return this.f30560b;
    }

    public C5045s g() {
        Integer num = (Integer) this.f30560b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return C5045s.UNKNOWN;
        }
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? C5045s.UNKNOWN : Build.VERSION.SDK_INT >= 28 ? C5045s.ON_EXTERNAL_FLASH : C5045s.UNKNOWN : C5045s.ON_AUTO_FLASH_REDEYE : C5045s.ON_ALWAYS_FLASH : C5045s.ON_AUTO_FLASH : C5045s.ON : C5045s.OFF;
    }

    public C5051v h() {
        Integer num = (Integer) this.f30560b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return C5051v.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return C5051v.INACTIVE;
            case 1:
            case 3:
                return C5051v.SCANNING;
            case 2:
                return C5051v.PASSIVE_FOCUSED;
            case 4:
                return C5051v.LOCKED_FOCUSED;
            case 5:
                return C5051v.LOCKED_NOT_FOCUSED;
            case 6:
                return C5051v.PASSIVE_NOT_FOCUSED;
            default:
                C4391e0.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return C5051v.UNKNOWN;
        }
    }

    public C5055x i() {
        Integer num = (Integer) this.f30560b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return C5055x.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return C5055x.INACTIVE;
        }
        if (intValue == 1) {
            return C5055x.METERING;
        }
        if (intValue == 2) {
            return C5055x.CONVERGED;
        }
        if (intValue == 3) {
            return C5055x.LOCKED;
        }
        C4391e0.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return C5055x.UNKNOWN;
    }

    public C5049u j() {
        Integer num = (Integer) this.f30560b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return C5049u.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return C5049u.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return C5049u.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                C4391e0.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return C5049u.UNKNOWN;
            }
        }
        return C5049u.OFF;
    }

    public C5047t k() {
        Integer num = (Integer) this.f30560b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return C5047t.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return C5047t.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return C5047t.CONVERGED;
            }
            if (intValue == 3) {
                return C5047t.LOCKED;
            }
            if (intValue == 4) {
                return C5047t.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                C4391e0.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return C5047t.UNKNOWN;
            }
        }
        return C5047t.SEARCHING;
    }

    public C6067g(CaptureResult captureResult) {
        this(g1.b(), captureResult);
    }
}
