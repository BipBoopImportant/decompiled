package ga;

import java.util.AbstractMap;

/* renamed from: ga.u  reason: case insensitive filesystem */
final class C7918u extends C7912n {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C7919v f51415d;

    C7918u(C7919v vVar) {
        this.f51415d = vVar;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C7902d.a(i10, this.f51415d.f51418e, "index");
        C7919v vVar = this.f51415d;
        int i11 = i10 + i10;
        Object obj = vVar.f51417d[i11];
        obj.getClass();
        Object obj2 = vVar.f51417d[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.f51415d.f51418e;
    }
}
