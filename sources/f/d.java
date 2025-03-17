package F;

import android.media.CamcorderProfile;
import androidx.camera.core.impl.C5031k0;
import java.util.ArrayList;
import java.util.List;

class d {
    public static C5031k0 a(CamcorderProfile camcorderProfile) {
        return C5031k0.b.h(camcorderProfile.duration, camcorderProfile.fileFormat, b(camcorderProfile), c(camcorderProfile));
    }

    private static List<C5031k0.a> b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.audioCodec;
        arrayList.add(C5031k0.a.a(i10, C5031k0.g(i10), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, C5031k0.c(camcorderProfile.audioCodec)));
        return arrayList;
    }

    private static List<C5031k0.c> c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.videoCodec;
        arrayList.add(C5031k0.c.a(i10, C5031k0.d(i10), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
