package F;

import C.C4391e0;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.core.impl.C5031k0;

public final class a {
    public static C5031k0 a(CamcorderProfile camcorderProfile) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            C4391e0.l("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i10 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return d.a(camcorderProfile);
    }

    public static C5031k0 b(EncoderProfiles encoderProfiles) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return c.a(encoderProfiles);
        }
        if (i10 >= 31) {
            return b.a(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i10 + ". Version 31 or higher required.");
    }
}
