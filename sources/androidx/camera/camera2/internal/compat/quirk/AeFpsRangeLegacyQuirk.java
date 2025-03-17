package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.impl.N0;
import w.B;

public class AeFpsRangeLegacyQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private final Range<Integer> f16617a;

    public AeFpsRangeLegacyQuirk(B b10) {
        this.f16617a = i((Range[]) b10.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private Range<Integer> f(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    static boolean h(B b10) {
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private Range<Integer> i(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (!(rangeArr == null || rangeArr.length == 0)) {
            for (Range<Integer> f10 : rangeArr) {
                Range<Integer> f11 = f(f10);
                if (f11.getUpper().intValue() == 30 && (range == null || f11.getLower().intValue() < range.getLower().intValue())) {
                    range = f11;
                }
            }
        }
        return range;
    }

    public Range<Integer> g() {
        return this.f16617a;
    }
}
