package E7;

import C7.f;
import java.security.MessageDigest;

final class d implements f {

    /* renamed from: b  reason: collision with root package name */
    private final f f35036b;

    /* renamed from: c  reason: collision with root package name */
    private final f f35037c;

    d(f fVar, f fVar2) {
        this.f35036b = fVar;
        this.f35037c = fVar2;
    }

    public void b(MessageDigest messageDigest) {
        this.f35036b.b(messageDigest);
        this.f35037c.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f35036b.equals(dVar.f35036b) && this.f35037c.equals(dVar.f35037c);
    }

    public int hashCode() {
        return (this.f35036b.hashCode() * 31) + this.f35037c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f35036b + ", signature=" + this.f35037c + '}';
    }
}
