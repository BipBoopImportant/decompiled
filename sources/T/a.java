package T;

import J.f;
import T.c;
import androidx.lifecycle.C5221y;

final class a extends c.a {

    /* renamed from: a  reason: collision with root package name */
    private final C5221y f13460a;

    /* renamed from: b  reason: collision with root package name */
    private final f.b f13461b;

    a(C5221y yVar, f.b bVar) {
        if (yVar != null) {
            this.f13460a = yVar;
            if (bVar != null) {
                this.f13461b = bVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public f.b b() {
        return this.f13461b;
    }

    public C5221y c() {
        return this.f13460a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c.a)) {
            return false;
        }
        c.a aVar = (c.a) obj;
        return this.f13460a.equals(aVar.c()) && this.f13461b.equals(aVar.b());
    }

    public int hashCode() {
        return ((this.f13460a.hashCode() ^ 1000003) * 1000003) ^ this.f13461b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f13460a + ", cameraId=" + this.f13461b + "}";
    }
}
