package a9;

import d9.C7761g;
import d9.C7771q;
import d9.F;
import d9.O;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.f1  reason: case insensitive filesystem */
public final class C6823f1 extends N {

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f42548b;

    public C6823f1(ArrayList arrayList) {
        C17542s.j(arrayList, "urls");
        this.f42548b = arrayList;
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7771q.a aVar = C7771q.f50815b;
        O.a m10 = O.m();
        C17542s.i(m10, "newBuilder()");
        C7771q a11 = aVar.a(m10);
        for (String b10 : this.f42548b) {
            a11.b(a11.c(), b10);
        }
        a10.k(a11.a());
        return a10.a();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6823f1) && C17542s.e(this.f42548b, ((C6823f1) obj).f42548b);
    }

    public final int hashCode() {
        return this.f42548b.hashCode() + 31;
    }
}
