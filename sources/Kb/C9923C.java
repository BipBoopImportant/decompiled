package kb;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jb.l;
import jb.m;

/* renamed from: kb.C  reason: case insensitive filesystem */
public final class C9923C {

    /* renamed from: kb.C$a */
    class a extends C9947b<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Iterator f74859c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f74860d;

        a(Iterator it, m mVar) {
            this.f74859c = it;
            this.f74860d = mVar;
        }

        /* access modifiers changed from: protected */
        public T a() {
            while (this.f74859c.hasNext()) {
                T next = this.f74859c.next();
                if (this.f74860d.apply(next)) {
                    return next;
                }
            }
            return c();
        }
    }

    /* renamed from: kb.C$b */
    private static final class b<T> extends C9946a<T> {

        /* renamed from: d  reason: collision with root package name */
        static final f0<Object> f74861d = new b(new Object[0], 0);

        /* renamed from: c  reason: collision with root package name */
        private final T[] f74862c;

        b(T[] tArr, int i10) {
            super(tArr.length, i10);
            this.f74862c = tArr;
        }

        /* access modifiers changed from: protected */
        public T a(int i10) {
            return this.f74862c[i10];
        }
    }

    /* renamed from: kb.C$c */
    private enum c implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            C9954i.c(false);
        }
    }

    /* renamed from: kb.C$d */
    private static final class d<T> extends e0<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f74863a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f74864b;

        d(T t10) {
            this.f74863a = t10;
        }

        public boolean hasNext() {
            return !this.f74864b;
        }

        public T next() {
            if (!this.f74864b) {
                this.f74864b = true;
                return this.f74863a;
            }
            throw new NoSuchElementException();
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        l.j(collection);
        l.j(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static <T> boolean b(Iterator<T> it, m<? super T> mVar) {
        return n(it, mVar) != -1;
    }

    static void c(Iterator<?> it) {
        l.j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = jb.j.a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.C9923C.e(java.util.Iterator, java.util.Iterator):boolean");
    }

    static <T> e0<T> f() {
        return g();
    }

    static <T> f0<T> g() {
        return b.f74861d;
    }

    static <T> Iterator<T> h() {
        return c.INSTANCE;
    }

    public static <T> e0<T> i(Iterator<T> it, m<? super T> mVar) {
        l.j(it);
        l.j(mVar);
        return new a(it, mVar);
    }

    public static <T> T j(Iterator<T> it, m<? super T> mVar) {
        l.j(it);
        l.j(mVar);
        while (it.hasNext()) {
            T next = it.next();
            if (mVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T k(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T l(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> T m(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static <T> int n(Iterator<T> it, m<? super T> mVar) {
        l.k(mVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (mVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static <T> T o(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean p(Iterator<?> it, Collection<?> collection) {
        l.j(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean q(Iterator<T> it, m<? super T> mVar) {
        l.j(mVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (mVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> e0<T> r(T t10) {
        return new d(t10);
    }
}
