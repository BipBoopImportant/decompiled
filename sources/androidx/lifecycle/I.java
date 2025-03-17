package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p.C5677b;

public class I<T> extends K<T> {

    /* renamed from: c  reason: collision with root package name */
    private C5677b<F<?>, a<?>> f22154c = new C5677b<>();

    private static class a<V> implements L<V> {

        /* renamed from: a  reason: collision with root package name */
        final F<V> f22155a;

        /* renamed from: b  reason: collision with root package name */
        final L<? super V> f22156b;

        /* renamed from: c  reason: collision with root package name */
        int f22157c = -1;

        a(F<V> f10, L<? super V> l10) {
            this.f22155a = f10;
            this.f22156b = l10;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f22155a.observeForever(this);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f22155a.removeObserver(this);
        }

        public void onChanged(V v10) {
            if (this.f22157c != this.f22155a.getVersion()) {
                this.f22157c = this.f22155a.getVersion();
                this.f22156b.onChanged(v10);
            }
        }
    }

    public I() {
    }

    public <S> void b(F<S> f10, L<? super S> l10) {
        if (f10 != null) {
            a aVar = new a(f10, l10);
            a p10 = this.f22154c.p(f10, aVar);
            if (p10 != null && p10.f22156b != l10) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (p10 == null && hasActiveObservers()) {
                aVar.a();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }

    public <S> void c(F<S> f10) {
        a q10 = this.f22154c.q(f10);
        if (q10 != null) {
            q10.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        Iterator<Map.Entry<F<?>, a<?>>> it = this.f22154c.iterator();
        while (it.hasNext()) {
            ((a) it.next().getValue()).a();
        }
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
        Iterator<Map.Entry<F<?>, a<?>>> it = this.f22154c.iterator();
        while (it.hasNext()) {
            ((a) it.next().getValue()).b();
        }
    }

    public I(T t10) {
        super(t10);
    }
}
