package l9;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;
import gc.C9721a;
import gc.C9722b;
import ic.C9833a;
import o9.C8611a;
import o9.C8612b;
import o9.C8613c;
import o9.C8614d;
import o9.C8615e;
import o9.C8616f;

/* renamed from: l9.a  reason: case insensitive filesystem */
public final class C8543a implements C9721a {

    /* renamed from: a  reason: collision with root package name */
    public static final C9721a f54818a = new C8543a();

    /* renamed from: l9.a$a  reason: collision with other inner class name */
    private static final class C0872a implements C9703d<C8611a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0872a f54819a = new C0872a();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f54820b = C9702c.a("window").b(C9833a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f54821c = C9702c.a("logSourceMetrics").b(C9833a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f54822d = C9702c.a("globalMetrics").b(C9833a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f54823e = C9702c.a("appNamespace").b(C9833a.b().c(4).a()).a();

        private C0872a() {
        }

        /* renamed from: b */
        public void a(C8611a aVar, C9704e eVar) {
            eVar.b(f54820b, aVar.d());
            eVar.b(f54821c, aVar.c());
            eVar.b(f54822d, aVar.b());
            eVar.b(f54823e, aVar.a());
        }
    }

    /* renamed from: l9.a$b */
    private static final class b implements C9703d<C8612b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f54824a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f54825b = C9702c.a("storageMetrics").b(C9833a.b().c(1).a()).a();

        private b() {
        }

        /* renamed from: b */
        public void a(C8612b bVar, C9704e eVar) {
            eVar.b(f54825b, bVar.a());
        }
    }

    /* renamed from: l9.a$c */
    private static final class c implements C9703d<C8613c> {

        /* renamed from: a  reason: collision with root package name */
        static final c f54826a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f54827b = C9702c.a("eventsDroppedCount").b(C9833a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f54828c = C9702c.a("reason").b(C9833a.b().c(3).a()).a();

        private c() {
        }

        /* renamed from: b */
        public void a(C8613c cVar, C9704e eVar) {
            eVar.e(f54827b, cVar.a());
            eVar.b(f54828c, cVar.b());
        }
    }

    /* renamed from: l9.a$d */
    private static final class d implements C9703d<C8614d> {

        /* renamed from: a  reason: collision with root package name */
        static final d f54829a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f54830b = C9702c.a("logSource").b(C9833a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f54831c = C9702c.a("logEventDropped").b(C9833a.b().c(2).a()).a();

        private d() {
        }

        /* renamed from: b */
        public void a(C8614d dVar, C9704e eVar) {
            eVar.b(f54830b, dVar.b());
            eVar.b(f54831c, dVar.a());
        }
    }

    /* renamed from: l9.a$e */
    private static final class e implements C9703d<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f54832a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f54833b = C9702c.d("clientMetrics");

        private e() {
        }

        /* renamed from: b */
        public void a(m mVar, C9704e eVar) {
            eVar.b(f54833b, mVar.b());
        }
    }

    /* renamed from: l9.a$f */
    private static final class f implements C9703d<C8615e> {

        /* renamed from: a  reason: collision with root package name */
        static final f f54834a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f54835b = C9702c.a("currentCacheSizeBytes").b(C9833a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f54836c = C9702c.a("maxCacheSizeBytes").b(C9833a.b().c(2).a()).a();

        private f() {
        }

        /* renamed from: b */
        public void a(C8615e eVar, C9704e eVar2) {
            eVar2.e(f54835b, eVar.a());
            eVar2.e(f54836c, eVar.b());
        }
    }

    /* renamed from: l9.a$g */
    private static final class g implements C9703d<C8616f> {

        /* renamed from: a  reason: collision with root package name */
        static final g f54837a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f54838b = C9702c.a("startMs").b(C9833a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f54839c = C9702c.a("endMs").b(C9833a.b().c(2).a()).a();

        private g() {
        }

        /* renamed from: b */
        public void a(C8616f fVar, C9704e eVar) {
            eVar.e(f54838b, fVar.b());
            eVar.e(f54839c, fVar.a());
        }
    }

    private C8543a() {
    }

    public void a(C9722b<?> bVar) {
        bVar.a(m.class, e.f54832a);
        bVar.a(C8611a.class, C0872a.f54819a);
        bVar.a(C8616f.class, g.f54837a);
        bVar.a(C8614d.class, d.f54829a);
        bVar.a(C8613c.class, c.f54826a);
        bVar.a(C8612b.class, b.f54824a);
        bVar.a(C8615e.class, f.f54834a);
    }
}
