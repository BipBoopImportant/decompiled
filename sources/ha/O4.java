package ha;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;

final class O4 implements C9703d {

    /* renamed from: a  reason: collision with root package name */
    static final O4 f52114a = new O4();

    /* renamed from: b  reason: collision with root package name */
    private static final C9702c f52115b;

    /* renamed from: c  reason: collision with root package name */
    private static final C9702c f52116c;

    /* renamed from: d  reason: collision with root package name */
    private static final C9702c f52117d;

    /* renamed from: e  reason: collision with root package name */
    private static final C9702c f52118e;

    /* renamed from: f  reason: collision with root package name */
    private static final C9702c f52119f;

    static {
        C9702c.b a10 = C9702c.a("xMin");
        O0 o02 = new O0();
        o02.a(1);
        f52115b = a10.b(o02.b()).a();
        C9702c.b a11 = C9702c.a("yMin");
        O0 o03 = new O0();
        o03.a(2);
        f52116c = a11.b(o03.b()).a();
        C9702c.b a12 = C9702c.a("xMax");
        O0 o04 = new O0();
        o04.a(3);
        f52117d = a12.b(o04.b()).a();
        C9702c.b a13 = C9702c.a("yMax");
        O0 o05 = new O0();
        o05.a(4);
        f52118e = a13.b(o05.b()).a();
        C9702c.b a14 = C9702c.a("confidenceScore");
        O0 o06 = new O0();
        o06.a(5);
        f52119f = a14.b(o06.b()).a();
    }

    private O4() {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C8205z7 z7Var = (C8205z7) obj;
        C9704e eVar = (C9704e) obj2;
        eVar.b(f52115b, z7Var.c());
        eVar.b(f52116c, z7Var.e());
        eVar.b(f52117d, z7Var.b());
        eVar.b(f52118e, z7Var.d());
        eVar.b(f52119f, z7Var.a());
    }
}
