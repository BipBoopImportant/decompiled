package a0;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* renamed from: a0.b  reason: case insensitive filesystem */
public class C4958b extends Z implements Y {

    /* renamed from: c  reason: collision with root package name */
    private final MediaCodecInfo.AudioCapabilities f15069c;

    C4958b(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f15068b.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.f15069c = audioCapabilities;
    }
}
