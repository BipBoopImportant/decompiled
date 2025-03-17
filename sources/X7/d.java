package X7;

import C7.f;
import Y7.k;
import java.security.MessageDigest;

public final class d implements f {

    /* renamed from: b  reason: collision with root package name */
    private final Object f40764b;

    public d(Object obj) {
        this.f40764b = k.d(obj);
    }

    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f40764b.toString().getBytes(f.f33749a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f40764b.equals(((d) obj).f40764b);
        }
        return false;
    }

    public int hashCode() {
        return this.f40764b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f40764b + '}';
    }
}
