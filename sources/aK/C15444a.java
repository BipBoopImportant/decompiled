package AK;

import BK.C15481a;
import BK.C15483c;
import CK.C15520a;
import CK.C15521b;

/* renamed from: AK.a  reason: case insensitive filesystem */
public class C15444a {

    /* renamed from: d  reason: collision with root package name */
    public static final C15444a f133157d = new b().a();

    /* renamed from: a  reason: collision with root package name */
    private final C15483c f133158a;

    /* renamed from: b  reason: collision with root package name */
    private final C15520a f133159b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f133160c;

    /* renamed from: AK.a$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private C15483c f133161a = C15481a.f133413a;

        /* renamed from: b  reason: collision with root package name */
        private C15520a f133162b = C15521b.f133570a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f133163c;

        public C15444a a() {
            return new C15444a(this.f133161a, this.f133162b, Boolean.valueOf(this.f133163c));
        }
    }

    public C15483c a() {
        return this.f133158a;
    }

    public C15520a b() {
        return this.f133159b;
    }

    public boolean c() {
        return this.f133160c;
    }

    private C15444a(C15483c cVar, C15520a aVar, Boolean bool) {
        this.f133158a = cVar;
        this.f133159b = aVar;
        this.f133160c = bool.booleanValue();
    }
}
