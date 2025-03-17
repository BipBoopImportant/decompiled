package androidx.camera.core.impl;

import androidx.camera.core.impl.C5031k0;

/* renamed from: androidx.camera.core.impl.g  reason: case insensitive filesystem */
final class C5022g extends C5031k0.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f16897a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16898b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16899c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16900d;

    /* renamed from: e  reason: collision with root package name */
    private final int f16901e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16902f;

    /* renamed from: g  reason: collision with root package name */
    private final int f16903g;

    /* renamed from: h  reason: collision with root package name */
    private final int f16904h;

    /* renamed from: i  reason: collision with root package name */
    private final int f16905i;

    /* renamed from: j  reason: collision with root package name */
    private final int f16906j;

    C5022g(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f16897a = i10;
        if (str != null) {
            this.f16898b = str;
            this.f16899c = i11;
            this.f16900d = i12;
            this.f16901e = i13;
            this.f16902f = i14;
            this.f16903g = i15;
            this.f16904h = i16;
            this.f16905i = i17;
            this.f16906j = i18;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    public int b() {
        return this.f16904h;
    }

    public int c() {
        return this.f16899c;
    }

    public int d() {
        return this.f16905i;
    }

    public int e() {
        return this.f16897a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5031k0.c)) {
            return false;
        }
        C5031k0.c cVar = (C5031k0.c) obj;
        return this.f16897a == cVar.e() && this.f16898b.equals(cVar.i()) && this.f16899c == cVar.c() && this.f16900d == cVar.f() && this.f16901e == cVar.k() && this.f16902f == cVar.h() && this.f16903g == cVar.j() && this.f16904h == cVar.b() && this.f16905i == cVar.d() && this.f16906j == cVar.g();
    }

    public int f() {
        return this.f16900d;
    }

    public int g() {
        return this.f16906j;
    }

    public int h() {
        return this.f16902f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f16897a ^ 1000003) * 1000003) ^ this.f16898b.hashCode()) * 1000003) ^ this.f16899c) * 1000003) ^ this.f16900d) * 1000003) ^ this.f16901e) * 1000003) ^ this.f16902f) * 1000003) ^ this.f16903g) * 1000003) ^ this.f16904h) * 1000003) ^ this.f16905i) * 1000003) ^ this.f16906j;
    }

    public String i() {
        return this.f16898b;
    }

    public int j() {
        return this.f16903g;
    }

    public int k() {
        return this.f16901e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f16897a + ", mediaType=" + this.f16898b + ", bitrate=" + this.f16899c + ", frameRate=" + this.f16900d + ", width=" + this.f16901e + ", height=" + this.f16902f + ", profile=" + this.f16903g + ", bitDepth=" + this.f16904h + ", chromaSubsampling=" + this.f16905i + ", hdrFormat=" + this.f16906j + "}";
    }
}
