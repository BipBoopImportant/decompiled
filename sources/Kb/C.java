package Kb;

import mc.C10035a;
import mc.C10036b;

class C<T> implements C10036b<T>, C10035a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final C10035a.C1373a<Object> f61407c = new z();

    /* renamed from: d  reason: collision with root package name */
    private static final C10036b<Object> f61408d = new A();

    /* renamed from: a  reason: collision with root package name */
    private C10035a.C1373a<T> f61409a;

    /* renamed from: b  reason: collision with root package name */
    private volatile C10036b<T> f61410b;

    private C(C10035a.C1373a<T> aVar, C10036b<T> bVar) {
        this.f61409a = aVar;
        this.f61410b = bVar;
    }

    static <T> C<T> e() {
        return new C<>(f61407c, f61408d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(C10036b bVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(C10035a.C1373a aVar, C10035a.C1373a aVar2, C10036b bVar) {
        aVar.a(bVar);
        aVar2.a(bVar);
    }

    static <T> C<T> i(C10036b<T> bVar) {
        return new C<>((C10035a.C1373a) null, bVar);
    }

    public void a(C10035a.C1373a<T> aVar) {
        C10036b<T> bVar;
        C10036b<T> bVar2;
        C10036b<T> bVar3 = this.f61410b;
        C10036b<Object> bVar4 = f61408d;
        if (bVar3 != bVar4) {
            aVar.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f61410b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                this.f61409a = new B(this.f61409a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.a(bVar);
        }
    }

    public T get() {
        return this.f61410b.get();
    }

    /* access modifiers changed from: package-private */
    public void j(C10036b<T> bVar) {
        C10035a.C1373a<T> aVar;
        if (this.f61410b == f61408d) {
            synchronized (this) {
                aVar = this.f61409a;
                this.f61409a = null;
                this.f61410b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
