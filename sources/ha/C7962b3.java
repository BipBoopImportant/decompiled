package ha;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;

/* renamed from: ha.b3  reason: case insensitive filesystem */
final class C7962b3 implements C9703d {

    /* renamed from: a  reason: collision with root package name */
    static final C7962b3 f52438a = new C7962b3();

    /* renamed from: b  reason: collision with root package name */
    private static final C9702c f52439b;

    /* renamed from: c  reason: collision with root package name */
    private static final C9702c f52440c;

    /* renamed from: d  reason: collision with root package name */
    private static final C9702c f52441d;

    /* renamed from: e  reason: collision with root package name */
    private static final C9702c f52442e;

    /* renamed from: f  reason: collision with root package name */
    private static final C9702c f52443f;

    /* renamed from: g  reason: collision with root package name */
    private static final C9702c f52444g;

    static {
        C9702c.b a10 = C9702c.a("maxMs");
        O0 o02 = new O0();
        o02.a(1);
        f52439b = a10.b(o02.b()).a();
        C9702c.b a11 = C9702c.a("minMs");
        O0 o03 = new O0();
        o03.a(2);
        f52440c = a11.b(o03.b()).a();
        C9702c.b a12 = C9702c.a("avgMs");
        O0 o04 = new O0();
        o04.a(3);
        f52441d = a12.b(o04.b()).a();
        C9702c.b a13 = C9702c.a("firstQuartileMs");
        O0 o05 = new O0();
        o05.a(4);
        f52442e = a13.b(o05.b()).a();
        C9702c.b a14 = C9702c.a("medianMs");
        O0 o06 = new O0();
        o06.a(5);
        f52443f = a14.b(o06.b()).a();
        C9702c.b a15 = C9702c.a("thirdQuartileMs");
        O0 o07 = new O0();
        o07.a(6);
        f52444g = a15.b(o07.b()).a();
    }

    private C7962b3() {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        F5 f52 = (F5) obj;
        C9704e eVar = (C9704e) obj2;
        eVar.b(f52439b, f52.c());
        eVar.b(f52440c, f52.e());
        eVar.b(f52441d, f52.a());
        eVar.b(f52442e, f52.b());
        eVar.b(f52443f, f52.d());
        eVar.b(f52444g, f52.f());
    }
}
