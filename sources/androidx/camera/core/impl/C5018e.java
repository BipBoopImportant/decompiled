package androidx.camera.core.impl;

import androidx.camera.core.impl.C5031k0;

/* renamed from: androidx.camera.core.impl.e  reason: case insensitive filesystem */
final class C5018e extends C5031k0.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f16871a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16872b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16873c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16874d;

    /* renamed from: e  reason: collision with root package name */
    private final int f16875e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16876f;

    C5018e(int i10, String str, int i11, int i12, int i13, int i14) {
        this.f16871a = i10;
        if (str != null) {
            this.f16872b = str;
            this.f16873c = i11;
            this.f16874d = i12;
            this.f16875e = i13;
            this.f16876f = i14;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    public int b() {
        return this.f16873c;
    }

    public int c() {
        return this.f16875e;
    }

    public int d() {
        return this.f16871a;
    }

    public String e() {
        return this.f16872b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5031k0.a)) {
            return false;
        }
        C5031k0.a aVar = (C5031k0.a) obj;
        return this.f16871a == aVar.d() && this.f16872b.equals(aVar.e()) && this.f16873c == aVar.b() && this.f16874d == aVar.g() && this.f16875e == aVar.c() && this.f16876f == aVar.f();
    }

    public int f() {
        return this.f16876f;
    }

    public int g() {
        return this.f16874d;
    }

    public int hashCode() {
        return ((((((((((this.f16871a ^ 1000003) * 1000003) ^ this.f16872b.hashCode()) * 1000003) ^ this.f16873c) * 1000003) ^ this.f16874d) * 1000003) ^ this.f16875e) * 1000003) ^ this.f16876f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f16871a + ", mediaType=" + this.f16872b + ", bitrate=" + this.f16873c + ", sampleRate=" + this.f16874d + ", channels=" + this.f16875e + ", profile=" + this.f16876f + "}";
    }
}
