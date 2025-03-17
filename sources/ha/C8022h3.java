package ha;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;

/* renamed from: ha.h3  reason: case insensitive filesystem */
final class C8022h3 implements C9703d {

    /* renamed from: a  reason: collision with root package name */
    static final C8022h3 f52564a = new C8022h3();

    /* renamed from: b  reason: collision with root package name */
    private static final C9702c f52565b;

    /* renamed from: c  reason: collision with root package name */
    private static final C9702c f52566c;

    /* renamed from: d  reason: collision with root package name */
    private static final C9702c f52567d;

    /* renamed from: e  reason: collision with root package name */
    private static final C9702c f52568e;

    static {
        C9702c.b a10 = C9702c.a("imageFormat");
        O0 o02 = new O0();
        o02.a(1);
        f52565b = a10.b(o02.b()).a();
        C9702c.b a11 = C9702c.a("originalImageSize");
        O0 o03 = new O0();
        o03.a(2);
        f52566c = a11.b(o03.b()).a();
        C9702c.b a12 = C9702c.a("compressedImageSize");
        O0 o04 = new O0();
        o04.a(3);
        f52567d = a12.b(o04.b()).a();
        C9702c.b a13 = C9702c.a("isOdmlImage");
        O0 o05 = new O0();
        o05.a(4);
        f52568e = a13.b(o05.b()).a();
    }

    private C8022h3() {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        M5 m52 = (M5) obj;
        C9704e eVar = (C9704e) obj2;
        eVar.b(f52565b, m52.a());
        eVar.b(f52566c, m52.b());
        eVar.b(f52567d, (Object) null);
        eVar.b(f52568e, (Object) null);
    }
}
