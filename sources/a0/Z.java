package a0;

import android.media.MediaCodecInfo;
import java.util.Objects;

public abstract class Z implements Y {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodecInfo f15067a;

    /* renamed from: b  reason: collision with root package name */
    protected final MediaCodecInfo.CodecCapabilities f15068b;

    Z(MediaCodecInfo mediaCodecInfo, String str) {
        this.f15067a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f15068b = capabilitiesForType;
        } catch (RuntimeException e10) {
            throw new d0("Unable to get CodecCapabilities for mime: " + str, e10);
        }
    }
}
