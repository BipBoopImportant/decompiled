package androidx.media;

import androidx.versionedparcelable.a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f22369a = aVar.p(audioAttributesImplBase.f22369a, 1);
        audioAttributesImplBase.f22370b = aVar.p(audioAttributesImplBase.f22370b, 2);
        audioAttributesImplBase.f22371c = aVar.p(audioAttributesImplBase.f22371c, 3);
        audioAttributesImplBase.f22372d = aVar.p(audioAttributesImplBase.f22372d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f22369a, 1);
        aVar.F(audioAttributesImplBase.f22370b, 2);
        aVar.F(audioAttributesImplBase.f22371c, 3);
        aVar.F(audioAttributesImplBase.f22372d, 4);
    }
}
