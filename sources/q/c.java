package Q;

import android.opengl.EGLSurface;

final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private final EGLSurface f11906a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11907b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11908c;

    c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface != null) {
            this.f11906a = eGLSurface;
            this.f11907b = i10;
            this.f11908c = i11;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    public EGLSurface a() {
        return this.f11906a;
    }

    public int b() {
        return this.f11908c;
    }

    public int c() {
        return this.f11907b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f11906a.equals(gVar.a()) && this.f11907b == gVar.c() && this.f11908c == gVar.b();
    }

    public int hashCode() {
        return ((((this.f11906a.hashCode() ^ 1000003) * 1000003) ^ this.f11907b) * 1000003) ^ this.f11908c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f11906a + ", width=" + this.f11907b + ", height=" + this.f11908c + "}";
    }
}
