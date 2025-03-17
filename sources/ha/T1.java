package ha;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;

final class T1 implements C9703d {

    /* renamed from: a  reason: collision with root package name */
    static final T1 f52224a = new T1();

    /* renamed from: b  reason: collision with root package name */
    private static final C9702c f52225b;

    /* renamed from: c  reason: collision with root package name */
    private static final C9702c f52226c;

    /* renamed from: d  reason: collision with root package name */
    private static final C9702c f52227d;

    static {
        C9702c.b a10 = C9702c.a("logEventKey");
        O0 o02 = new O0();
        o02.a(1);
        f52225b = a10.b(o02.b()).a();
        C9702c.b a11 = C9702c.a("eventCount");
        O0 o03 = new O0();
        o03.a(2);
        f52226c = a11.b(o03.b()).a();
        C9702c.b a12 = C9702c.a("inferenceDurationStats");
        O0 o04 = new O0();
        o04.a(3);
        f52227d = a12.b(o04.b()).a();
    }

    private T1() {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C8040j1 j1Var = (C8040j1) obj;
        C9704e eVar = (C9704e) obj2;
        eVar.b(f52225b, j1Var.a());
        eVar.b(f52226c, j1Var.c());
        eVar.b(f52227d, j1Var.b());
    }
}
