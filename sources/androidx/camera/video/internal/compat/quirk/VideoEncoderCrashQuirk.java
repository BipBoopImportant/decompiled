package androidx.camera.video.internal.compat.quirk;

import V.C4927l;
import android.os.Build;
import androidx.camera.core.impl.I;

public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    private static boolean f() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }

    public boolean c(I i10, C4927l lVar) {
        return f() && i10.f() == 0 && lVar == C4927l.f14459a;
    }
}
