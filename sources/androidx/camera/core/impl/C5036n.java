package androidx.camera.core.impl;

import androidx.camera.core.impl.e1;

/* renamed from: androidx.camera.core.impl.n  reason: case insensitive filesystem */
final class C5036n extends e1 {

    /* renamed from: a  reason: collision with root package name */
    private final e1.b f16954a;

    /* renamed from: b  reason: collision with root package name */
    private final e1.a f16955b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16956c;

    C5036n(e1.b bVar, e1.a aVar, long j10) {
        if (bVar != null) {
            this.f16954a = bVar;
            if (aVar != null) {
                this.f16955b = aVar;
                this.f16956c = j10;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }

    public e1.a c() {
        return this.f16955b;
    }

    public e1.b d() {
        return this.f16954a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f16954a.equals(e1Var.d()) && this.f16955b.equals(e1Var.c()) && this.f16956c == e1Var.f();
    }

    public long f() {
        return this.f16956c;
    }

    public int hashCode() {
        long j10 = this.f16956c;
        return ((((this.f16954a.hashCode() ^ 1000003) * 1000003) ^ this.f16955b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f16954a + ", configSize=" + this.f16955b + ", streamUseCase=" + this.f16956c + "}";
    }
}
