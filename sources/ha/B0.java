package ha;

import java.util.AbstractMap;

final class B0 extends C8059l0 {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0 f51796d;

    B0(C0 c02) {
        this.f51796d = c02;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C8167w.a(i10, this.f51796d.f51822e, "index");
        C0 c02 = this.f51796d;
        int i11 = i10 + i10;
        Object obj = c02.f51821d[i11];
        obj.getClass();
        Object obj2 = c02.f51821d[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.f51796d.f51822e;
    }
}
