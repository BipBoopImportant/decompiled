package Kb;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Kb.c  reason: case insensitive filesystem */
public final class C9128c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f61424a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<E<? super T>> f61425b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<q> f61426c;

    /* renamed from: d  reason: collision with root package name */
    private final int f61427d;

    /* renamed from: e  reason: collision with root package name */
    private final int f61428e;

    /* renamed from: f  reason: collision with root package name */
    private final g<T> f61429f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<Class<?>> f61430g;

    public static <T> b<T> c(E<T> e10) {
        return new b<>((E) e10, new E[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(E<T> e10, E<? super T>... eArr) {
        return new b<>((E) e10, (E[]) eArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>((Class) cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>((Class) cls, (Class[]) clsArr);
    }

    public static <T> C9128c<T> l(T t10, Class<T> cls) {
        return m(cls).f(new C9126a(t10)).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).g();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, C9129d dVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, C9129d dVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> C9128c<T> s(T t10, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).f(new C9127b(t10)).d();
    }

    public Set<q> g() {
        return this.f61426c;
    }

    public g<T> h() {
        return this.f61429f;
    }

    public String i() {
        return this.f61424a;
    }

    public Set<E<? super T>> j() {
        return this.f61425b;
    }

    public Set<Class<?>> k() {
        return this.f61430g;
    }

    public boolean n() {
        return this.f61427d == 1;
    }

    public boolean o() {
        return this.f61427d == 2;
    }

    public boolean p() {
        return this.f61428e == 0;
    }

    public C9128c<T> t(g<T> gVar) {
        return new C9128c(this.f61424a, this.f61425b, this.f61426c, this.f61427d, this.f61428e, gVar, this.f61430g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f61425b.toArray()) + ">{" + this.f61427d + ", type=" + this.f61428e + ", deps=" + Arrays.toString(this.f61426c.toArray()) + "}";
    }

    /* renamed from: Kb.c$b */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f61431a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<E<? super T>> f61432b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<q> f61433c;

        /* renamed from: d  reason: collision with root package name */
        private int f61434d;

        /* renamed from: e  reason: collision with root package name */
        private int f61435e;

        /* renamed from: f  reason: collision with root package name */
        private g<T> f61436f;

        /* renamed from: g  reason: collision with root package name */
        private final Set<Class<?>> f61437g;

        /* access modifiers changed from: private */
        public b<T> g() {
            this.f61435e = 1;
            return this;
        }

        private b<T> i(int i10) {
            D.d(this.f61434d == 0, "Instantiation type has already been set.");
            this.f61434d = i10;
            return this;
        }

        private void j(E<?> e10) {
            D.a(!this.f61432b.contains(e10), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            D.c(qVar, "Null dependency");
            j(qVar.c());
            this.f61433c.add(qVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public C9128c<T> d() {
            D.d(this.f61436f != null, "Missing required property: factory.");
            return new C9128c(this.f61431a, new HashSet(this.f61432b), new HashSet(this.f61433c), this.f61434d, this.f61435e, this.f61436f, this.f61437g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(g<T> gVar) {
            this.f61436f = (g) D.c(gVar, "Null factory");
            return this;
        }

        public b<T> h(String str) {
            this.f61431a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f61431a = null;
            HashSet hashSet = new HashSet();
            this.f61432b = hashSet;
            this.f61433c = new HashSet();
            this.f61434d = 0;
            this.f61435e = 0;
            this.f61437g = new HashSet();
            D.c(cls, "Null interface");
            hashSet.add(E.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                D.c(cls2, "Null interface");
                this.f61432b.add(E.b(cls2));
            }
        }

        @SafeVarargs
        private b(E<T> e10, E<? super T>... eArr) {
            this.f61431a = null;
            HashSet hashSet = new HashSet();
            this.f61432b = hashSet;
            this.f61433c = new HashSet();
            this.f61434d = 0;
            this.f61435e = 0;
            this.f61437g = new HashSet();
            D.c(e10, "Null interface");
            hashSet.add(e10);
            for (E<? super T> c10 : eArr) {
                D.c(c10, "Null interface");
            }
            Collections.addAll(this.f61432b, eArr);
        }
    }

    private C9128c(String str, Set<E<? super T>> set, Set<q> set2, int i10, int i11, g<T> gVar, Set<Class<?>> set3) {
        this.f61424a = str;
        this.f61425b = Collections.unmodifiableSet(set);
        this.f61426c = Collections.unmodifiableSet(set2);
        this.f61427d = i10;
        this.f61428e = i11;
        this.f61429f = gVar;
        this.f61430g = Collections.unmodifiableSet(set3);
    }
}
