package Sb;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;
import gc.C9721a;
import gc.C9722b;

public final class a implements C9721a {

    /* renamed from: a  reason: collision with root package name */
    public static final C9721a f63259a = new a();

    /* renamed from: Sb.a$a  reason: collision with other inner class name */
    private static final class C1088a implements C9703d<j> {

        /* renamed from: a  reason: collision with root package name */
        static final C1088a f63260a = new C1088a();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f63261b = C9702c.d("rolloutId");

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f63262c = C9702c.d("parameterKey");

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f63263d = C9702c.d("parameterValue");

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f63264e = C9702c.d("variantId");

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f63265f = C9702c.d("templateVersion");

        private C1088a() {
        }

        /* renamed from: b */
        public void a(j jVar, C9704e eVar) {
            eVar.b(f63261b, jVar.e());
            eVar.b(f63262c, jVar.c());
            eVar.b(f63263d, jVar.d());
            eVar.b(f63264e, jVar.g());
            eVar.e(f63265f, jVar.f());
        }
    }

    private a() {
    }

    public void a(C9722b<?> bVar) {
        C1088a aVar = C1088a.f63260a;
        bVar.a(j.class, aVar);
        bVar.a(b.class, aVar);
    }
}
