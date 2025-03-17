package Tb;

import Tb.F;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fc.C9702c;
import fc.C9703d;
import fc.C9704e;
import gc.C9721a;
import gc.C9722b;

/* renamed from: Tb.a  reason: case insensitive filesystem */
public final class C9273a implements C9721a {

    /* renamed from: a  reason: collision with root package name */
    public static final C9721a f63459a = new C9273a();

    /* renamed from: Tb.a$a  reason: collision with other inner class name */
    private static final class C1111a implements C9703d<F.a.C1093a> {

        /* renamed from: a  reason: collision with root package name */
        static final C1111a f63460a = new C1111a();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63461b = C9702c.d("arch");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63462c = C9702c.d("libraryName");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63463d = C9702c.d("buildId");

        private C1111a() {
        }

        /* renamed from: b */
        public void a(F.a.C1093a aVar, C9704e eVar) {
            eVar.b(f63461b, aVar.b());
            eVar.b(f63462c, aVar.d());
            eVar.b(f63463d, aVar.c());
        }
    }

    /* renamed from: Tb.a$b */
    private static final class b implements C9703d<F.a> {

        /* renamed from: a  reason: collision with root package name */
        static final b f63464a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63465b = C9702c.d("pid");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63466c = C9702c.d("processName");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63467d = C9702c.d("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63468e = C9702c.d("importance");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63469f = C9702c.d("pss");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f63470g = C9702c.d("rss");

        /* renamed from: h  reason: collision with root package name */
        private static final C9702c f63471h = C9702c.d("timestamp");

        /* renamed from: i  reason: collision with root package name */
        private static final C9702c f63472i = C9702c.d("traceFile");

        /* renamed from: j  reason: collision with root package name */
        private static final C9702c f63473j = C9702c.d("buildIdMappingForArch");

        private b() {
        }

        /* renamed from: b */
        public void a(F.a aVar, C9704e eVar) {
            eVar.d(f63465b, aVar.d());
            eVar.b(f63466c, aVar.e());
            eVar.d(f63467d, aVar.g());
            eVar.d(f63468e, aVar.c());
            eVar.e(f63469f, aVar.f());
            eVar.e(f63470g, aVar.h());
            eVar.e(f63471h, aVar.i());
            eVar.b(f63472i, aVar.j());
            eVar.b(f63473j, aVar.b());
        }
    }

    /* renamed from: Tb.a$c */
    private static final class c implements C9703d<F.c> {

        /* renamed from: a  reason: collision with root package name */
        static final c f63474a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63475b = C9702c.d("key");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63476c = C9702c.d("value");

        private c() {
        }

        /* renamed from: b */
        public void a(F.c cVar, C9704e eVar) {
            eVar.b(f63475b, cVar.b());
            eVar.b(f63476c, cVar.c());
        }
    }

    /* renamed from: Tb.a$d */
    private static final class d implements C9703d<F> {

        /* renamed from: a  reason: collision with root package name */
        static final d f63477a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63478b = C9702c.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63479c = C9702c.d("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63480d = C9702c.d("platform");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63481e = C9702c.d("installationUuid");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63482f = C9702c.d("firebaseInstallationId");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f63483g = C9702c.d("firebaseAuthenticationToken");

        /* renamed from: h  reason: collision with root package name */
        private static final C9702c f63484h = C9702c.d("appQualitySessionId");

        /* renamed from: i  reason: collision with root package name */
        private static final C9702c f63485i = C9702c.d("buildVersion");

        /* renamed from: j  reason: collision with root package name */
        private static final C9702c f63486j = C9702c.d("displayVersion");

        /* renamed from: k  reason: collision with root package name */
        private static final C9702c f63487k = C9702c.d("session");

        /* renamed from: l  reason: collision with root package name */
        private static final C9702c f63488l = C9702c.d("ndkPayload");

        /* renamed from: m  reason: collision with root package name */
        private static final C9702c f63489m = C9702c.d("appExitInfo");

        private d() {
        }

        /* renamed from: b */
        public void a(F f10, C9704e eVar) {
            eVar.b(f63478b, f10.m());
            eVar.b(f63479c, f10.i());
            eVar.d(f63480d, f10.l());
            eVar.b(f63481e, f10.j());
            eVar.b(f63482f, f10.h());
            eVar.b(f63483g, f10.g());
            eVar.b(f63484h, f10.d());
            eVar.b(f63485i, f10.e());
            eVar.b(f63486j, f10.f());
            eVar.b(f63487k, f10.n());
            eVar.b(f63488l, f10.k());
            eVar.b(f63489m, f10.c());
        }
    }

    /* renamed from: Tb.a$e */
    private static final class e implements C9703d<F.d> {

        /* renamed from: a  reason: collision with root package name */
        static final e f63490a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63491b = C9702c.d("files");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63492c = C9702c.d("orgId");

        private e() {
        }

        /* renamed from: b */
        public void a(F.d dVar, C9704e eVar) {
            eVar.b(f63491b, dVar.b());
            eVar.b(f63492c, dVar.c());
        }
    }

    /* renamed from: Tb.a$f */
    private static final class f implements C9703d<F.d.b> {

        /* renamed from: a  reason: collision with root package name */
        static final f f63493a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63494b = C9702c.d("filename");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63495c = C9702c.d("contents");

        private f() {
        }

        /* renamed from: b */
        public void a(F.d.b bVar, C9704e eVar) {
            eVar.b(f63494b, bVar.c());
            eVar.b(f63495c, bVar.b());
        }
    }

    /* renamed from: Tb.a$g */
    private static final class g implements C9703d<F.e.a> {

        /* renamed from: a  reason: collision with root package name */
        static final g f63496a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63497b = C9702c.d("identifier");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63498c = C9702c.d("version");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63499d = C9702c.d("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63500e = C9702c.d("organization");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63501f = C9702c.d("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f63502g = C9702c.d("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        private static final C9702c f63503h = C9702c.d("developmentPlatformVersion");

        private g() {
        }

        /* renamed from: b */
        public void a(F.e.a aVar, C9704e eVar) {
            eVar.b(f63497b, aVar.e());
            eVar.b(f63498c, aVar.h());
            eVar.b(f63499d, aVar.d());
            eVar.b(f63500e, aVar.g());
            eVar.b(f63501f, aVar.f());
            eVar.b(f63502g, aVar.b());
            eVar.b(f63503h, aVar.c());
        }
    }

    /* renamed from: Tb.a$h */
    private static final class h implements C9703d<F.e.a.b> {

        /* renamed from: a  reason: collision with root package name */
        static final h f63504a = new h();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63505b = C9702c.d("clsId");

        private h() {
        }

        /* renamed from: b */
        public void a(F.e.a.b bVar, C9704e eVar) {
            eVar.b(f63505b, bVar.a());
        }
    }

    /* renamed from: Tb.a$i */
    private static final class i implements C9703d<F.e.c> {

        /* renamed from: a  reason: collision with root package name */
        static final i f63506a = new i();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63507b = C9702c.d("arch");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63508c = C9702c.d("model");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63509d = C9702c.d("cores");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63510e = C9702c.d("ram");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63511f = C9702c.d("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f63512g = C9702c.d("simulator");

        /* renamed from: h  reason: collision with root package name */
        private static final C9702c f63513h = C9702c.d("state");

        /* renamed from: i  reason: collision with root package name */
        private static final C9702c f63514i = C9702c.d("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        private static final C9702c f63515j = C9702c.d("modelClass");

        private i() {
        }

        /* renamed from: b */
        public void a(F.e.c cVar, C9704e eVar) {
            eVar.d(f63507b, cVar.b());
            eVar.b(f63508c, cVar.f());
            eVar.d(f63509d, cVar.c());
            eVar.e(f63510e, cVar.h());
            eVar.e(f63511f, cVar.d());
            eVar.f(f63512g, cVar.j());
            eVar.d(f63513h, cVar.i());
            eVar.b(f63514i, cVar.e());
            eVar.b(f63515j, cVar.g());
        }
    }

    /* renamed from: Tb.a$j */
    private static final class j implements C9703d<F.e> {

        /* renamed from: a  reason: collision with root package name */
        static final j f63516a = new j();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63517b = C9702c.d("generator");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63518c = C9702c.d("identifier");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63519d = C9702c.d("appQualitySessionId");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63520e = C9702c.d("startedAt");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63521f = C9702c.d("endedAt");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f63522g = C9702c.d("crashed");

        /* renamed from: h  reason: collision with root package name */
        private static final C9702c f63523h = C9702c.d("app");

        /* renamed from: i  reason: collision with root package name */
        private static final C9702c f63524i = C9702c.d("user");

        /* renamed from: j  reason: collision with root package name */
        private static final C9702c f63525j = C9702c.d("os");

        /* renamed from: k  reason: collision with root package name */
        private static final C9702c f63526k = C9702c.d("device");

        /* renamed from: l  reason: collision with root package name */
        private static final C9702c f63527l = C9702c.d("events");

        /* renamed from: m  reason: collision with root package name */
        private static final C9702c f63528m = C9702c.d("generatorType");

        private j() {
        }

        /* renamed from: b */
        public void a(F.e eVar, C9704e eVar2) {
            eVar2.b(f63517b, eVar.g());
            eVar2.b(f63518c, eVar.j());
            eVar2.b(f63519d, eVar.c());
            eVar2.e(f63520e, eVar.l());
            eVar2.b(f63521f, eVar.e());
            eVar2.f(f63522g, eVar.n());
            eVar2.b(f63523h, eVar.b());
            eVar2.b(f63524i, eVar.m());
            eVar2.b(f63525j, eVar.k());
            eVar2.b(f63526k, eVar.d());
            eVar2.b(f63527l, eVar.f());
            eVar2.d(f63528m, eVar.h());
        }
    }

    /* renamed from: Tb.a$k */
    private static final class k implements C9703d<F.e.d.a> {

        /* renamed from: a  reason: collision with root package name */
        static final k f63529a = new k();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63530b = C9702c.d("execution");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63531c = C9702c.d("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63532d = C9702c.d("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63533e = C9702c.d("background");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63534f = C9702c.d("currentProcessDetails");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f63535g = C9702c.d("appProcessDetails");

        /* renamed from: h  reason: collision with root package name */
        private static final C9702c f63536h = C9702c.d("uiOrientation");

        private k() {
        }

        /* renamed from: b */
        public void a(F.e.d.a aVar, C9704e eVar) {
            eVar.b(f63530b, aVar.f());
            eVar.b(f63531c, aVar.e());
            eVar.b(f63532d, aVar.g());
            eVar.b(f63533e, aVar.c());
            eVar.b(f63534f, aVar.d());
            eVar.b(f63535g, aVar.b());
            eVar.d(f63536h, aVar.h());
        }
    }

    /* renamed from: Tb.a$l */
    private static final class l implements C9703d<F.e.d.a.b.C1097a> {

        /* renamed from: a  reason: collision with root package name */
        static final l f63537a = new l();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63538b = C9702c.d("baseAddress");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63539c = C9702c.d("size");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63540d = C9702c.d("name");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63541e = C9702c.d("uuid");

        private l() {
        }

        /* renamed from: b */
        public void a(F.e.d.a.b.C1097a aVar, C9704e eVar) {
            eVar.e(f63538b, aVar.b());
            eVar.e(f63539c, aVar.d());
            eVar.b(f63540d, aVar.c());
            eVar.b(f63541e, aVar.f());
        }
    }

    /* renamed from: Tb.a$m */
    private static final class m implements C9703d<F.e.d.a.b> {

        /* renamed from: a  reason: collision with root package name */
        static final m f63542a = new m();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63543b = C9702c.d("threads");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63544c = C9702c.d("exception");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63545d = C9702c.d("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63546e = C9702c.d("signal");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63547f = C9702c.d("binaries");

        private m() {
        }

        /* renamed from: b */
        public void a(F.e.d.a.b bVar, C9704e eVar) {
            eVar.b(f63543b, bVar.f());
            eVar.b(f63544c, bVar.d());
            eVar.b(f63545d, bVar.b());
            eVar.b(f63546e, bVar.e());
            eVar.b(f63547f, bVar.c());
        }
    }

    /* renamed from: Tb.a$n */
    private static final class n implements C9703d<F.e.d.a.b.c> {

        /* renamed from: a  reason: collision with root package name */
        static final n f63548a = new n();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63549b = C9702c.d("type");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63550c = C9702c.d("reason");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63551d = C9702c.d("frames");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63552e = C9702c.d("causedBy");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63553f = C9702c.d("overflowCount");

        private n() {
        }

        /* renamed from: b */
        public void a(F.e.d.a.b.c cVar, C9704e eVar) {
            eVar.b(f63549b, cVar.f());
            eVar.b(f63550c, cVar.e());
            eVar.b(f63551d, cVar.c());
            eVar.b(f63552e, cVar.b());
            eVar.d(f63553f, cVar.d());
        }
    }

    /* renamed from: Tb.a$o */
    private static final class o implements C9703d<F.e.d.a.b.C1101d> {

        /* renamed from: a  reason: collision with root package name */
        static final o f63554a = new o();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63555b = C9702c.d("name");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63556c = C9702c.d("code");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63557d = C9702c.d(PlaceTypes.ADDRESS);

        private o() {
        }

        /* renamed from: b */
        public void a(F.e.d.a.b.C1101d dVar, C9704e eVar) {
            eVar.b(f63555b, dVar.d());
            eVar.b(f63556c, dVar.c());
            eVar.e(f63557d, dVar.b());
        }
    }

    /* renamed from: Tb.a$p */
    private static final class p implements C9703d<F.e.d.a.b.C1103e> {

        /* renamed from: a  reason: collision with root package name */
        static final p f63558a = new p();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63559b = C9702c.d("name");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63560c = C9702c.d("importance");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63561d = C9702c.d("frames");

        private p() {
        }

        /* renamed from: b */
        public void a(F.e.d.a.b.C1103e eVar, C9704e eVar2) {
            eVar2.b(f63559b, eVar.d());
            eVar2.d(f63560c, eVar.c());
            eVar2.b(f63561d, eVar.b());
        }
    }

    /* renamed from: Tb.a$q */
    private static final class q implements C9703d<F.e.d.a.b.C1103e.C1105b> {

        /* renamed from: a  reason: collision with root package name */
        static final q f63562a = new q();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63563b = C9702c.d("pc");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63564c = C9702c.d("symbol");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63565d = C9702c.d("file");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63566e = C9702c.d("offset");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63567f = C9702c.d("importance");

        private q() {
        }

        /* renamed from: b */
        public void a(F.e.d.a.b.C1103e.C1105b bVar, C9704e eVar) {
            eVar.e(f63563b, bVar.e());
            eVar.b(f63564c, bVar.f());
            eVar.b(f63565d, bVar.b());
            eVar.e(f63566e, bVar.d());
            eVar.d(f63567f, bVar.c());
        }
    }

    /* renamed from: Tb.a$r */
    private static final class r implements C9703d<F.e.d.a.c> {

        /* renamed from: a  reason: collision with root package name */
        static final r f63568a = new r();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63569b = C9702c.d("processName");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63570c = C9702c.d("pid");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63571d = C9702c.d("importance");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63572e = C9702c.d("defaultProcess");

        private r() {
        }

        /* renamed from: b */
        public void a(F.e.d.a.c cVar, C9704e eVar) {
            eVar.b(f63569b, cVar.d());
            eVar.d(f63570c, cVar.c());
            eVar.d(f63571d, cVar.b());
            eVar.f(f63572e, cVar.e());
        }
    }

    /* renamed from: Tb.a$s */
    private static final class s implements C9703d<F.e.d.c> {

        /* renamed from: a  reason: collision with root package name */
        static final s f63573a = new s();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63574b = C9702c.d("batteryLevel");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63575c = C9702c.d("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63576d = C9702c.d("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63577e = C9702c.d("orientation");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63578f = C9702c.d("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f63579g = C9702c.d("diskUsed");

        private s() {
        }

        /* renamed from: b */
        public void a(F.e.d.c cVar, C9704e eVar) {
            eVar.b(f63574b, cVar.b());
            eVar.d(f63575c, cVar.c());
            eVar.f(f63576d, cVar.g());
            eVar.d(f63577e, cVar.e());
            eVar.e(f63578f, cVar.f());
            eVar.e(f63579g, cVar.d());
        }
    }

    /* renamed from: Tb.a$t */
    private static final class t implements C9703d<F.e.d> {

        /* renamed from: a  reason: collision with root package name */
        static final t f63580a = new t();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63581b = C9702c.d("timestamp");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63582c = C9702c.d("type");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63583d = C9702c.d("app");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63584e = C9702c.d("device");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63585f = C9702c.d("log");

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f63586g = C9702c.d("rollouts");

        private t() {
        }

        /* renamed from: b */
        public void a(F.e.d dVar, C9704e eVar) {
            eVar.e(f63581b, dVar.f());
            eVar.b(f63582c, dVar.g());
            eVar.b(f63583d, dVar.b());
            eVar.b(f63584e, dVar.c());
            eVar.b(f63585f, dVar.d());
            eVar.b(f63586g, dVar.e());
        }
    }

    /* renamed from: Tb.a$u */
    private static final class u implements C9703d<F.e.d.C1108d> {

        /* renamed from: a  reason: collision with root package name */
        static final u f63587a = new u();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63588b = C9702c.d("content");

        private u() {
        }

        /* renamed from: b */
        public void a(F.e.d.C1108d dVar, C9704e eVar) {
            eVar.b(f63588b, dVar.b());
        }
    }

    /* renamed from: Tb.a$v */
    private static final class v implements C9703d<F.e.d.C1109e> {

        /* renamed from: a  reason: collision with root package name */
        static final v f63589a = new v();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63590b = C9702c.d("rolloutVariant");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63591c = C9702c.d("parameterKey");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63592d = C9702c.d("parameterValue");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63593e = C9702c.d("templateVersion");

        private v() {
        }

        /* renamed from: b */
        public void a(F.e.d.C1109e eVar, C9704e eVar2) {
            eVar2.b(f63590b, eVar.d());
            eVar2.b(f63591c, eVar.b());
            eVar2.b(f63592d, eVar.c());
            eVar2.e(f63593e, eVar.e());
        }
    }

    /* renamed from: Tb.a$w */
    private static final class w implements C9703d<F.e.d.C1109e.b> {

        /* renamed from: a  reason: collision with root package name */
        static final w f63594a = new w();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63595b = C9702c.d("rolloutId");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63596c = C9702c.d("variantId");

        private w() {
        }

        /* renamed from: b */
        public void a(F.e.d.C1109e.b bVar, C9704e eVar) {
            eVar.b(f63595b, bVar.b());
            eVar.b(f63596c, bVar.c());
        }
    }

    /* renamed from: Tb.a$x */
    private static final class x implements C9703d<F.e.d.f> {

        /* renamed from: a  reason: collision with root package name */
        static final x f63597a = new x();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63598b = C9702c.d("assignments");

        private x() {
        }

        /* renamed from: b */
        public void a(F.e.d.f fVar, C9704e eVar) {
            eVar.b(f63598b, fVar.b());
        }
    }

    /* renamed from: Tb.a$y */
    private static final class y implements C9703d<F.e.C1110e> {

        /* renamed from: a  reason: collision with root package name */
        static final y f63599a = new y();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63600b = C9702c.d("platform");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63601c = C9702c.d("version");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63602d = C9702c.d("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63603e = C9702c.d("jailbroken");

        private y() {
        }

        /* renamed from: b */
        public void a(F.e.C1110e eVar, C9704e eVar2) {
            eVar2.d(f63600b, eVar.c());
            eVar2.b(f63601c, eVar.d());
            eVar2.b(f63602d, eVar.b());
            eVar2.f(f63603e, eVar.e());
        }
    }

    /* renamed from: Tb.a$z */
    private static final class z implements C9703d<F.e.f> {

        /* renamed from: a  reason: collision with root package name */
        static final z f63604a = new z();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63605b = C9702c.d("identifier");

        private z() {
        }

        /* renamed from: b */
        public void a(F.e.f fVar, C9704e eVar) {
            eVar.b(f63605b, fVar.b());
        }
    }

    private C9273a() {
    }

    public void a(C9722b<?> bVar) {
        d dVar = d.f63477a;
        bVar.a(F.class, dVar);
        bVar.a(C9274b.class, dVar);
        j jVar = j.f63516a;
        bVar.a(F.e.class, jVar);
        bVar.a(h.class, jVar);
        g gVar = g.f63496a;
        bVar.a(F.e.a.class, gVar);
        bVar.a(i.class, gVar);
        h hVar = h.f63504a;
        bVar.a(F.e.a.b.class, hVar);
        bVar.a(j.class, hVar);
        z zVar = z.f63604a;
        bVar.a(F.e.f.class, zVar);
        bVar.a(A.class, zVar);
        y yVar = y.f63599a;
        bVar.a(F.e.C1110e.class, yVar);
        bVar.a(z.class, yVar);
        i iVar = i.f63506a;
        bVar.a(F.e.c.class, iVar);
        bVar.a(k.class, iVar);
        t tVar = t.f63580a;
        bVar.a(F.e.d.class, tVar);
        bVar.a(l.class, tVar);
        k kVar = k.f63529a;
        bVar.a(F.e.d.a.class, kVar);
        bVar.a(m.class, kVar);
        m mVar = m.f63542a;
        bVar.a(F.e.d.a.b.class, mVar);
        bVar.a(n.class, mVar);
        p pVar = p.f63558a;
        bVar.a(F.e.d.a.b.C1103e.class, pVar);
        bVar.a(r.class, pVar);
        q qVar = q.f63562a;
        bVar.a(F.e.d.a.b.C1103e.C1105b.class, qVar);
        bVar.a(s.class, qVar);
        n nVar = n.f63548a;
        bVar.a(F.e.d.a.b.c.class, nVar);
        bVar.a(p.class, nVar);
        b bVar2 = b.f63464a;
        bVar.a(F.a.class, bVar2);
        bVar.a(C9275c.class, bVar2);
        C1111a aVar = C1111a.f63460a;
        bVar.a(F.a.C1093a.class, aVar);
        bVar.a(C9276d.class, aVar);
        o oVar = o.f63554a;
        bVar.a(F.e.d.a.b.C1101d.class, oVar);
        bVar.a(q.class, oVar);
        l lVar = l.f63537a;
        bVar.a(F.e.d.a.b.C1097a.class, lVar);
        bVar.a(o.class, lVar);
        c cVar = c.f63474a;
        bVar.a(F.c.class, cVar);
        bVar.a(C9277e.class, cVar);
        r rVar = r.f63568a;
        bVar.a(F.e.d.a.c.class, rVar);
        bVar.a(t.class, rVar);
        s sVar = s.f63573a;
        bVar.a(F.e.d.c.class, sVar);
        bVar.a(u.class, sVar);
        u uVar = u.f63587a;
        bVar.a(F.e.d.C1108d.class, uVar);
        bVar.a(v.class, uVar);
        x xVar = x.f63597a;
        bVar.a(F.e.d.f.class, xVar);
        bVar.a(y.class, xVar);
        v vVar = v.f63589a;
        bVar.a(F.e.d.C1109e.class, vVar);
        bVar.a(w.class, vVar);
        w wVar = w.f63594a;
        bVar.a(F.e.d.C1109e.b.class, wVar);
        bVar.a(x.class, wVar);
        e eVar = e.f63490a;
        bVar.a(F.d.class, eVar);
        bVar.a(C9278f.class, eVar);
        f fVar = f.f63493a;
        bVar.a(F.d.b.class, fVar);
        bVar.a(C9279g.class, fVar);
    }
}
