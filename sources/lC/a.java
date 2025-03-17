package Lc;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;
import gc.C9721a;
import gc.C9722b;

public final class a implements C9721a {

    /* renamed from: a  reason: collision with root package name */
    public static final C9721a f61576a = new a();

    /* renamed from: Lc.a$a  reason: collision with other inner class name */
    private static final class C1022a implements C9703d<d> {

        /* renamed from: a  reason: collision with root package name */
        static final C1022a f61577a = new C1022a();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f61578b = C9702c.d("rolloutId");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f61579c = C9702c.d("variantId");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f61580d = C9702c.d("parameterKey");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f61581e = C9702c.d("parameterValue");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f61582f = C9702c.d("templateVersion");

        private C1022a() {
        }

        /* renamed from: b */
        public void a(d dVar, C9704e eVar) {
            eVar.b(f61578b, dVar.d());
            eVar.b(f61579c, dVar.f());
            eVar.b(f61580d, dVar.b());
            eVar.b(f61581e, dVar.c());
            eVar.e(f61582f, dVar.e());
        }
    }

    private a() {
    }

    public void a(C9722b<?> bVar) {
        C1022a aVar = C1022a.f61577a;
        bVar.a(d.class, aVar);
        bVar.a(b.class, aVar);
    }
}
