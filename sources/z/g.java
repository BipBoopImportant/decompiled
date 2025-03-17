package z;

import C.C4391e0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import java.nio.BufferUnderflowException;

public final class g {
    public static boolean a(C6266c cVar) {
        return b(false, cVar);
    }

    public static boolean b(boolean z10, C6266c cVar) {
        Boolean bool;
        try {
            bool = (Boolean) cVar.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e10) {
            if (b.b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                C4391e0.a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)}));
            } else {
                C4391e0.d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)}), e10);
            }
            if (!z10) {
                bool = Boolean.FALSE;
            } else {
                throw e10;
            }
        }
        if (bool == null) {
            C4391e0.l("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
