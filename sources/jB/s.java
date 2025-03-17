package jb;

import java.io.Serializable;

public final class s {

    static class a<T> implements r<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private transient Object f74808a = new Object();

        /* renamed from: b  reason: collision with root package name */
        final r<T> f74809b;

        /* renamed from: c  reason: collision with root package name */
        volatile transient boolean f74810c;

        /* renamed from: d  reason: collision with root package name */
        transient T f74811d;

        a(r<T> rVar) {
            this.f74809b = (r) l.j(rVar);
        }

        public T get() {
            if (!this.f74810c) {
                synchronized (this.f74808a) {
                    try {
                        if (!this.f74810c) {
                            T t10 = this.f74809b.get();
                            this.f74811d = t10;
                            this.f74810c = true;
                            return t10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return i.a(this.f74811d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f74810c) {
                obj = "<supplier that returned " + this.f74811d + ">";
            } else {
                obj = this.f74809b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    static class b<T> implements r<T> {

        /* renamed from: d  reason: collision with root package name */
        private static final r<Void> f74812d = new t();

        /* renamed from: a  reason: collision with root package name */
        private final Object f74813a = new Object();

        /* renamed from: b  reason: collision with root package name */
        private volatile r<T> f74814b;

        /* renamed from: c  reason: collision with root package name */
        private T f74815c;

        b(r<T> rVar) {
            this.f74814b = (r) l.j(rVar);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ Void b() {
            throw new IllegalStateException();
        }

        public T get() {
            r<T> rVar = this.f74814b;
            r<Void> rVar2 = f74812d;
            if (rVar != rVar2) {
                synchronized (this.f74813a) {
                    try {
                        if (this.f74814b != rVar2) {
                            T t10 = this.f74814b.get();
                            this.f74815c = t10;
                            this.f74814b = rVar2;
                            return t10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return i.a(this.f74815c);
        }

        public String toString() {
            Object obj = this.f74814b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f74812d) {
                obj = "<supplier that returned " + this.f74815c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class c<T> implements r<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final T f74816a;

        c(T t10) {
            this.f74816a = t10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return j.a(this.f74816a, ((c) obj).f74816a);
            }
            return false;
        }

        public T get() {
            return this.f74816a;
        }

        public int hashCode() {
            return j.b(this.f74816a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f74816a + ")";
        }
    }

    public static <T> r<T> a(r<T> rVar) {
        return ((rVar instanceof b) || (rVar instanceof a)) ? rVar : rVar instanceof Serializable ? new a(rVar) : new b(rVar);
    }

    public static <T> r<T> b(T t10) {
        return new c(t10);
    }
}
