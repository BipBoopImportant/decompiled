package nH;

import WH.C16729a;

/* renamed from: nH.h  reason: case insensitive filesystem */
public final class C17629h {

    /* renamed from: nH.h$a */
    class a implements C17628g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16729a f144813a;

        a(C16729a aVar) {
            this.f144813a = aVar;
        }

        public T get() {
            return this.f144813a.get();
        }
    }

    public static <T> C17628g<T> a(C16729a<T> aVar) {
        C17627f.b(aVar);
        return new a(aVar);
    }
}
