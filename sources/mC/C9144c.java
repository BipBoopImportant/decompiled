package Mc;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;
import gc.C9721a;
import gc.C9722b;

/* renamed from: Mc.c  reason: case insensitive filesystem */
public final class C9144c implements C9721a {

    /* renamed from: a  reason: collision with root package name */
    public static final C9721a f61771a = new C9144c();

    /* renamed from: Mc.c$a */
    private static final class a implements C9703d<C9142a> {

        /* renamed from: a  reason: collision with root package name */
        static final a f61772a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f61773b = C9702c.d("packageName");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f61774c = C9702c.d("versionName");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f61775d = C9702c.d("appBuildVersion");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f61776e = C9702c.d("deviceManufacturer");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f61777f = C9702c.d("currentProcessDetails");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f61778g = C9702c.d("appProcessDetails");

        private a() {
        }

        /* renamed from: b */
        public void a(C9142a aVar, C9704e eVar) {
            eVar.b(f61773b, aVar.e());
            eVar.b(f61774c, aVar.f());
            eVar.b(f61775d, aVar.a());
            eVar.b(f61776e, aVar.d());
            eVar.b(f61777f, aVar.c());
            eVar.b(f61778g, aVar.b());
        }
    }

    /* renamed from: Mc.c$b */
    private static final class b implements C9703d<C9143b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f61779a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f61780b = C9702c.d("appId");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f61781c = C9702c.d("deviceModel");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f61782d = C9702c.d("sessionSdkVersion");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f61783e = C9702c.d("osVersion");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f61784f = C9702c.d("logEnvironment");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f61785g = C9702c.d("androidAppInfo");

        private b() {
        }

        /* renamed from: b */
        public void a(C9143b bVar, C9704e eVar) {
            eVar.b(f61780b, bVar.b());
            eVar.b(f61781c, bVar.c());
            eVar.b(f61782d, bVar.f());
            eVar.b(f61783e, bVar.e());
            eVar.b(f61784f, bVar.d());
            eVar.b(f61785g, bVar.a());
        }
    }

    /* renamed from: Mc.c$c  reason: collision with other inner class name */
    private static final class C1030c implements C9703d<C9146e> {

        /* renamed from: a  reason: collision with root package name */
        static final C1030c f61786a = new C1030c();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f61787b = C9702c.d("performance");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f61788c = C9702c.d("crashlytics");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f61789d = C9702c.d("sessionSamplingRate");

        private C1030c() {
        }

        /* renamed from: b */
        public void a(C9146e eVar, C9704e eVar2) {
            eVar2.b(f61787b, eVar.b());
            eVar2.b(f61788c, eVar.a());
            eVar2.c(f61789d, eVar.c());
        }
    }

    /* renamed from: Mc.c$d */
    private static final class d implements C9703d<u> {

        /* renamed from: a  reason: collision with root package name */
        static final d f61790a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f61791b = C9702c.d("processName");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f61792c = C9702c.d("pid");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f61793d = C9702c.d("importance");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f61794e = C9702c.d("defaultProcess");

        private d() {
        }

        /* renamed from: b */
        public void a(u uVar, C9704e eVar) {
            eVar.b(f61791b, uVar.c());
            eVar.d(f61792c, uVar.b());
            eVar.d(f61793d, uVar.a());
            eVar.f(f61794e, uVar.d());
        }
    }

    /* renamed from: Mc.c$e */
    private static final class e implements C9703d<z> {

        /* renamed from: a  reason: collision with root package name */
        static final e f61795a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f61796b = C9702c.d("eventType");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f61797c = C9702c.d("sessionData");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f61798d = C9702c.d("applicationInfo");

        private e() {
        }

        /* renamed from: b */
        public void a(z zVar, C9704e eVar) {
            eVar.b(f61796b, zVar.b());
            eVar.b(f61797c, zVar.c());
            eVar.b(f61798d, zVar.a());
        }
    }

    /* renamed from: Mc.c$f */
    private static final class f implements C9703d<C> {

        /* renamed from: a  reason: collision with root package name */
        static final f f61799a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f61800b = C9702c.d("sessionId");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f61801c = C9702c.d("firstSessionId");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f61802d = C9702c.d("sessionIndex");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f61803e = C9702c.d("eventTimestampUs");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f61804f = C9702c.d("dataCollectionStatus");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f61805g = C9702c.d("firebaseInstallationId");

        /* renamed from: h  reason: collision with root package name */
        private static final C9702c f61806h = C9702c.d("firebaseAuthenticationToken");

        private f() {
        }

        /* renamed from: b */
        public void a(C c10, C9704e eVar) {
            eVar.b(f61800b, c10.f());
            eVar.b(f61801c, c10.e());
            eVar.d(f61802d, c10.g());
            eVar.e(f61803e, c10.b());
            eVar.b(f61804f, c10.a());
            eVar.b(f61805g, c10.d());
            eVar.b(f61806h, c10.c());
        }
    }

    private C9144c() {
    }

    public void a(C9722b<?> bVar) {
        bVar.a(z.class, e.f61795a);
        bVar.a(C.class, f.f61799a);
        bVar.a(C9146e.class, C1030c.f61786a);
        bVar.a(C9143b.class, b.f61779a);
        bVar.a(C9142a.class, a.f61772a);
        bVar.a(u.class, d.f61790a);
    }
}
