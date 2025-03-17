package ha;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;

final class N4 implements C9703d {

    /* renamed from: a  reason: collision with root package name */
    static final N4 f52066a = new N4();

    /* renamed from: b  reason: collision with root package name */
    private static final C9702c f52067b;

    /* renamed from: c  reason: collision with root package name */
    private static final C9702c f52068c;

    /* renamed from: d  reason: collision with root package name */
    private static final C9702c f52069d;

    /* renamed from: e  reason: collision with root package name */
    private static final C9702c f52070e;

    /* renamed from: f  reason: collision with root package name */
    private static final C9702c f52071f;

    /* renamed from: g  reason: collision with root package name */
    private static final C9702c f52072g;

    static {
        C9702c.b a10 = C9702c.a("appName");
        O0 o02 = new O0();
        o02.a(1);
        f52067b = a10.b(o02.b()).a();
        C9702c.b a11 = C9702c.a("sessionId");
        O0 o03 = new O0();
        o03.a(2);
        f52068c = a11.b(o03.b()).a();
        C9702c.b a12 = C9702c.a("startZoomLevel");
        O0 o04 = new O0();
        o04.a(3);
        f52069d = a12.b(o04.b()).a();
        C9702c.b a13 = C9702c.a("endZoomLevel");
        O0 o05 = new O0();
        o05.a(4);
        f52070e = a13.b(o05.b()).a();
        C9702c.b a14 = C9702c.a("durationMs");
        O0 o06 = new O0();
        o06.a(5);
        f52071f = a14.b(o06.b()).a();
        C9702c.b a15 = C9702c.a("predictedArea");
        O0 o07 = new O0();
        o07.a(6);
        f52072g = a15.b(o07.b()).a();
    }

    private N4() {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        A7 a72 = (A7) obj;
        C9704e eVar = (C9704e) obj2;
        eVar.b(f52067b, a72.e());
        eVar.b(f52068c, a72.f());
        eVar.b(f52069d, a72.c());
        eVar.b(f52070e, a72.b());
        eVar.b(f52071f, a72.d());
        eVar.b(f52072g, a72.a());
    }
}
