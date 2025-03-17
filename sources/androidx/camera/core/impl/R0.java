package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class R0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<N0> f16774a;

    public R0(List<N0> list) {
        this.f16774a = new ArrayList(list);
    }

    public static String d(R0 r02) {
        ArrayList arrayList = new ArrayList();
        for (N0 n02 : r02.f16774a) {
            arrayList.add(n02.getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public boolean a(Class<? extends N0> cls) {
        for (N0 n02 : this.f16774a) {
            if (cls.isAssignableFrom(n02.getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends N0> T b(Class<T> cls) {
        Iterator<N0> it = this.f16774a.iterator();
        while (it.hasNext()) {
            T t10 = (N0) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    public <T extends N0> List<T> c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (N0 next : this.f16774a) {
            if (cls.isAssignableFrom(next.getClass())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
