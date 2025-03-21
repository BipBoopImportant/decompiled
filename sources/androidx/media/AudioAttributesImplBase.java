package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f22369a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f22370b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f22371c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f22372d = -1;

    public int a() {
        return this.f22370b;
    }

    public int b() {
        int i10 = this.f22371c;
        int c10 = c();
        if (c10 == 6) {
            i10 |= 4;
        } else if (c10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f22372d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f22371c, this.f22369a);
    }

    public int d() {
        return this.f22369a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f22370b == audioAttributesImplBase.a() && this.f22371c == audioAttributesImplBase.b() && this.f22369a == audioAttributesImplBase.d() && this.f22372d == audioAttributesImplBase.f22372d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22370b), Integer.valueOf(this.f22371c), Integer.valueOf(this.f22369a), Integer.valueOf(this.f22372d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f22372d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f22372d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f22369a));
        sb2.append(" content=");
        sb2.append(this.f22370b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f22371c).toUpperCase());
        return sb2.toString();
    }
}
