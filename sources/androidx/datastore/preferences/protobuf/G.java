package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5172z;
import java.util.List;

final class G implements F {
    G() {
    }

    static <E> C5172z.i<E> d(Object obj, long j10) {
        return (C5172z.i) r0.z(obj, j10);
    }

    public void a(Object obj, long j10) {
        d(obj, j10).o();
    }

    public <E> void b(Object obj, Object obj2, long j10) {
        C5172z.i d10 = d(obj, j10);
        C5172z.i d11 = d(obj2, j10);
        int size = d10.size();
        int size2 = d11.size();
        if (size > 0 && size2 > 0) {
            if (!d10.u()) {
                d10 = d10.f(size2 + size);
            }
            d10.addAll(d11);
        }
        if (size > 0) {
            d11 = d10;
        }
        r0.O(obj, j10, d11);
    }

    public <L> List<L> c(Object obj, long j10) {
        C5172z.i d10 = d(obj, j10);
        if (d10.u()) {
            return d10;
        }
        int size = d10.size();
        C5172z.i f10 = d10.f(size == 0 ? 10 : size * 2);
        r0.O(obj, j10, f10);
        return f10;
    }
}
