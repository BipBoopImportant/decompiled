package J;

import J.f;
import androidx.camera.core.impl.C5039o0;

final class a extends f.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f8741a;

    /* renamed from: b  reason: collision with root package name */
    private final C5039o0 f8742b;

    a(String str, C5039o0 o0Var) {
        if (str != null) {
            this.f8741a = str;
            if (o0Var != null) {
                this.f8742b = o0Var;
                return;
            }
            throw new NullPointerException("Null cameraConfigId");
        }
        throw new NullPointerException("Null cameraIdString");
    }

    public C5039o0 b() {
        return this.f8742b;
    }

    public String c() {
        return this.f8741a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f8741a.equals(bVar.c()) && this.f8742b.equals(bVar.b());
    }

    public int hashCode() {
        return ((this.f8741a.hashCode() ^ 1000003) * 1000003) ^ this.f8742b.hashCode();
    }

    public String toString() {
        return "CameraId{cameraIdString=" + this.f8741a + ", cameraConfigId=" + this.f8742b + "}";
    }
}
