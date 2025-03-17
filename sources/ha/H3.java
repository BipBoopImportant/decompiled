package ha;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;

final class H3 implements C9703d {

    /* renamed from: a  reason: collision with root package name */
    static final H3 f51942a = new H3();

    /* renamed from: b  reason: collision with root package name */
    private static final C9702c f51943b;

    /* renamed from: c  reason: collision with root package name */
    private static final C9702c f51944c;

    /* renamed from: d  reason: collision with root package name */
    private static final C9702c f51945d;

    /* renamed from: e  reason: collision with root package name */
    private static final C9702c f51946e;

    /* renamed from: f  reason: collision with root package name */
    private static final C9702c f51947f;

    static {
        C9702c.b a10 = C9702c.a("inferenceCommonLogEvent");
        O0 o02 = new O0();
        o02.a(1);
        f51943b = a10.b(o02.b()).a();
        C9702c.b a11 = C9702c.a("options");
        O0 o03 = new O0();
        o03.a(2);
        f51944c = a11.b(o03.b()).a();
        C9702c.b a12 = C9702c.a("detectedBarcodeFormats");
        O0 o04 = new O0();
        o04.a(3);
        f51945d = a12.b(o04.b()).a();
        C9702c.b a13 = C9702c.a("detectedBarcodeValueTypes");
        O0 o05 = new O0();
        o05.a(4);
        f51946e = a13.b(o05.b()).a();
        C9702c.b a14 = C9702c.a("imageInfo");
        O0 o06 = new O0();
        o06.a(5);
        f51947f = a14.b(o06.b()).a();
    }

    private H3() {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C8154u6 u6Var = (C8154u6) obj;
        C9704e eVar = (C9704e) obj2;
        eVar.b(f51943b, u6Var.d());
        eVar.b(f51944c, u6Var.e());
        eVar.b(f51945d, u6Var.a());
        eVar.b(f51946e, u6Var.b());
        eVar.b(f51947f, u6Var.c());
    }
}
