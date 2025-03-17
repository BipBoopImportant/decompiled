package ha;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;

/* renamed from: ha.l3  reason: case insensitive filesystem */
final class C8062l3 implements C9703d {

    /* renamed from: a  reason: collision with root package name */
    static final C8062l3 f52633a = new C8062l3();

    /* renamed from: b  reason: collision with root package name */
    private static final C9702c f52634b;

    /* renamed from: c  reason: collision with root package name */
    private static final C9702c f52635c;

    /* renamed from: d  reason: collision with root package name */
    private static final C9702c f52636d;

    /* renamed from: e  reason: collision with root package name */
    private static final C9702c f52637e;

    /* renamed from: f  reason: collision with root package name */
    private static final C9702c f52638f;

    /* renamed from: g  reason: collision with root package name */
    private static final C9702c f52639g;

    /* renamed from: h  reason: collision with root package name */
    private static final C9702c f52640h;

    /* renamed from: i  reason: collision with root package name */
    private static final C9702c f52641i;

    /* renamed from: j  reason: collision with root package name */
    private static final C9702c f52642j;

    /* renamed from: k  reason: collision with root package name */
    private static final C9702c f52643k;

    static {
        C9702c.b a10 = C9702c.a("durationMs");
        O0 o02 = new O0();
        o02.a(1);
        f52634b = a10.b(o02.b()).a();
        C9702c.b a11 = C9702c.a("errorCode");
        O0 o03 = new O0();
        o03.a(2);
        f52635c = a11.b(o03.b()).a();
        C9702c.b a12 = C9702c.a("isColdCall");
        O0 o04 = new O0();
        o04.a(3);
        f52636d = a12.b(o04.b()).a();
        C9702c.b a13 = C9702c.a("autoManageModelOnBackground");
        O0 o05 = new O0();
        o05.a(4);
        f52637e = a13.b(o05.b()).a();
        C9702c.b a14 = C9702c.a("autoManageModelOnLowMemory");
        O0 o06 = new O0();
        o06.a(5);
        f52638f = a14.b(o06.b()).a();
        C9702c.b a15 = C9702c.a("isNnApiEnabled");
        O0 o07 = new O0();
        o07.a(6);
        f52639g = a15.b(o07.b()).a();
        C9702c.b a16 = C9702c.a("eventsCount");
        O0 o08 = new O0();
        o08.a(7);
        f52640h = a16.b(o08.b()).a();
        C9702c.b a17 = C9702c.a("otherErrors");
        O0 o09 = new O0();
        o09.a(8);
        f52641i = a17.b(o09.b()).a();
        C9702c.b a18 = C9702c.a("remoteConfigValueForAcceleration");
        O0 o010 = new O0();
        o010.a(9);
        f52642j = a18.b(o010.b()).a();
        C9702c.b a19 = C9702c.a("isAccelerated");
        O0 o011 = new O0();
        o011.a(10);
        f52643k = a19.b(o011.b()).a();
    }

    private C8062l3() {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        S5 s52 = (S5) obj;
        C9704e eVar = (C9704e) obj2;
        eVar.b(f52634b, s52.e());
        eVar.b(f52635c, s52.a());
        eVar.b(f52636d, s52.d());
        eVar.b(f52637e, s52.b());
        eVar.b(f52638f, s52.c());
        eVar.b(f52639g, (Object) null);
        eVar.b(f52640h, (Object) null);
        eVar.b(f52641i, (Object) null);
        eVar.b(f52642j, (Object) null);
        eVar.b(f52643k, (Object) null);
    }
}
