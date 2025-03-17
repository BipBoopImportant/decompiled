package ia;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;

/* renamed from: ia.p1  reason: case insensitive filesystem */
final class C8327p1 implements C9703d {

    /* renamed from: a  reason: collision with root package name */
    static final C8327p1 f53762a = new C8327p1();

    /* renamed from: b  reason: collision with root package name */
    private static final C9702c f53763b;

    /* renamed from: c  reason: collision with root package name */
    private static final C9702c f53764c;

    /* renamed from: d  reason: collision with root package name */
    private static final C9702c f53765d;

    /* renamed from: e  reason: collision with root package name */
    private static final C9702c f53766e;

    /* renamed from: f  reason: collision with root package name */
    private static final C9702c f53767f;

    /* renamed from: g  reason: collision with root package name */
    private static final C9702c f53768g;

    /* renamed from: h  reason: collision with root package name */
    private static final C9702c f53769h;

    static {
        C9702c.b a10 = C9702c.a("durationMs");
        C8255f fVar = new C8255f();
        fVar.a(1);
        f53763b = a10.b(fVar.b()).a();
        C9702c.b a11 = C9702c.a("imageSource");
        C8255f fVar2 = new C8255f();
        fVar2.a(2);
        f53764c = a11.b(fVar2.b()).a();
        C9702c.b a12 = C9702c.a("imageFormat");
        C8255f fVar3 = new C8255f();
        fVar3.a(3);
        f53765d = a12.b(fVar3.b()).a();
        C9702c.b a13 = C9702c.a("imageByteSize");
        C8255f fVar4 = new C8255f();
        fVar4.a(4);
        f53766e = a13.b(fVar4.b()).a();
        C9702c.b a14 = C9702c.a("imageWidth");
        C8255f fVar5 = new C8255f();
        fVar5.a(5);
        f53767f = a14.b(fVar5.b()).a();
        C9702c.b a15 = C9702c.a("imageHeight");
        C8255f fVar6 = new C8255f();
        fVar6.a(6);
        f53768g = a15.b(fVar6.b()).a();
        C9702c.b a16 = C9702c.a("rotationDegrees");
        C8255f fVar7 = new C8255f();
        fVar7.a(7);
        f53769h = a16.b(fVar7.b()).a();
    }

    private C8327p1() {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        A3 a32 = (A3) obj;
        C9704e eVar = (C9704e) obj2;
        eVar.b(f53763b, a32.g());
        eVar.b(f53764c, a32.b());
        eVar.b(f53765d, a32.a());
        eVar.b(f53766e, a32.c());
        eVar.b(f53767f, a32.e());
        eVar.b(f53768g, a32.d());
        eVar.b(f53769h, a32.f());
    }
}
