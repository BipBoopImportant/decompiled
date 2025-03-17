package ha;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;

final class U1 implements C9703d {

    /* renamed from: a  reason: collision with root package name */
    static final U1 f52253a = new U1();

    /* renamed from: b  reason: collision with root package name */
    private static final C9702c f52254b;

    /* renamed from: c  reason: collision with root package name */
    private static final C9702c f52255c;

    /* renamed from: d  reason: collision with root package name */
    private static final C9702c f52256d;

    /* renamed from: e  reason: collision with root package name */
    private static final C9702c f52257e;

    /* renamed from: f  reason: collision with root package name */
    private static final C9702c f52258f;

    /* renamed from: g  reason: collision with root package name */
    private static final C9702c f52259g;

    /* renamed from: h  reason: collision with root package name */
    private static final C9702c f52260h;

    static {
        C9702c.b a10 = C9702c.a("errorCode");
        O0 o02 = new O0();
        o02.a(1);
        f52254b = a10.b(o02.b()).a();
        C9702c.b a11 = C9702c.a("hasResult");
        O0 o03 = new O0();
        o03.a(2);
        f52255c = a11.b(o03.b()).a();
        C9702c.b a12 = C9702c.a("isColdCall");
        O0 o04 = new O0();
        o04.a(3);
        f52256d = a12.b(o04.b()).a();
        C9702c.b a13 = C9702c.a("imageInfo");
        O0 o05 = new O0();
        o05.a(4);
        f52257e = a13.b(o05.b()).a();
        C9702c.b a14 = C9702c.a("options");
        O0 o06 = new O0();
        o06.a(5);
        f52258f = a14.b(o06.b()).a();
        C9702c.b a15 = C9702c.a("detectedBarcodeFormats");
        O0 o07 = new O0();
        o07.a(6);
        f52259g = a15.b(o07.b()).a();
        C9702c.b a16 = C9702c.a("detectedBarcodeValueTypes");
        O0 o08 = new O0();
        o08.a(7);
        f52260h = a16.b(o08.b()).a();
    }

    private U1() {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C8020h1 h1Var = (C8020h1) obj;
        C9704e eVar = (C9704e) obj2;
        eVar.b(f52254b, h1Var.c());
        eVar.b(f52255c, (Object) null);
        eVar.b(f52256d, h1Var.e());
        eVar.b(f52257e, (Object) null);
        eVar.b(f52258f, h1Var.d());
        eVar.b(f52259g, h1Var.a());
        eVar.b(f52260h, h1Var.b());
    }
}
