package C7;

import E7.v;
import android.content.Context;
import java.security.MessageDigest;
import java.util.Collection;

public class g<T> implements m<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Collection<? extends m<T>> f33750b;

    public g(Collection<? extends m<T>> collection) {
        if (!collection.isEmpty()) {
            this.f33750b = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    public v<T> a(Context context, v<T> vVar, int i10, int i11) {
        v<T> vVar2 = vVar;
        for (m a10 : this.f33750b) {
            v<T> a11 = a10.a(context, vVar2, i10, i11);
            if (vVar2 != null && !vVar2.equals(vVar) && !vVar2.equals(a11)) {
                vVar2.c();
            }
            vVar2 = a11;
        }
        return vVar2;
    }

    public void b(MessageDigest messageDigest) {
        for (m b10 : this.f33750b) {
            b10.b(messageDigest);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f33750b.equals(((g) obj).f33750b);
        }
        return false;
    }

    public int hashCode() {
        return this.f33750b.hashCode();
    }
}
