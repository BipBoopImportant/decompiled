package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f22367a;

    /* renamed from: b  reason: collision with root package name */
    public int f22368b;

    public AudioAttributesImplApi21() {
        this.f22368b = -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f22367a.equals(((AudioAttributesImplApi21) obj).f22367a);
    }

    public int hashCode() {
        return this.f22367a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f22367a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f22367a = audioAttributes;
        this.f22368b = i10;
    }
}
