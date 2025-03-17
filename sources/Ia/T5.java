package ia;

import java.util.AbstractMap;

final class T5 extends N5 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ U5 f53422c;

    T5(U5 u52) {
        this.f53422c = u52;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        G1.a(i10, this.f53422c.f53434e, "index");
        U5 u52 = this.f53422c;
        int i11 = i10 + i10;
        Object obj = u52.f53433d[i11];
        obj.getClass();
        Object obj2 = u52.f53433d[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.f53422c.f53434e;
    }
}
