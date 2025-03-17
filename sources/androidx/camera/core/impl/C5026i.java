package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* renamed from: androidx.camera.core.impl.i  reason: case insensitive filesystem */
final class C5026i extends K0 {

    /* renamed from: a  reason: collision with root package name */
    private final Surface f16916a;

    /* renamed from: b  reason: collision with root package name */
    private final Size f16917b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16918c;

    C5026i(Surface surface, Size size, int i10) {
        if (surface != null) {
            this.f16916a = surface;
            if (size != null) {
                this.f16917b = size;
                this.f16918c = i10;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surface");
    }

    public int b() {
        return this.f16918c;
    }

    public Size c() {
        return this.f16917b;
    }

    public Surface d() {
        return this.f16916a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        return this.f16916a.equals(k02.d()) && this.f16917b.equals(k02.c()) && this.f16918c == k02.b();
    }

    public int hashCode() {
        return ((((this.f16916a.hashCode() ^ 1000003) * 1000003) ^ this.f16917b.hashCode()) * 1000003) ^ this.f16918c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f16916a + ", size=" + this.f16917b + ", imageFormat=" + this.f16918c + "}";
    }
}
