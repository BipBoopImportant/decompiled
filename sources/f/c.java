package F;

import android.media.EncoderProfiles;
import androidx.camera.core.impl.C5031k0;
import java.util.ArrayList;
import java.util.List;

class c {
    public static C5031k0 a(EncoderProfiles encoderProfiles) {
        return C5031k0.b.h(encoderProfiles.getDefaultDurationSeconds(), encoderProfiles.getRecommendedFileFormat(), b(encoderProfiles.getAudioProfiles()), c(encoderProfiles.getVideoProfiles()));
    }

    private static List<C5031k0.a> b(List<EncoderProfiles.AudioProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile next : list) {
            arrayList.add(C5031k0.a.a(next.getCodec(), next.getMediaType(), next.getBitrate(), next.getSampleRate(), next.getChannels(), next.getProfile()));
        }
        return arrayList;
    }

    private static List<C5031k0.c> c(List<EncoderProfiles.VideoProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.VideoProfile next : list) {
            arrayList.add(C5031k0.c.a(next.getCodec(), next.getMediaType(), next.getBitrate(), next.getFrameRate(), next.getWidth(), next.getHeight(), next.getProfile(), next.getBitDepth(), next.getChromaSubsampling(), next.getHdrFormat()));
        }
        return arrayList;
    }
}
