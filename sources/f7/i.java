package F7;

import Y7.k;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private final g<a, Object> f35474a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    private final b f35475b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f35476c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, a<?>> f35477d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final int f35478e;

    /* renamed from: f  reason: collision with root package name */
    private int f35479f;

    private static final class a implements l {

        /* renamed from: a  reason: collision with root package name */
        private final b f35480a;

        /* renamed from: b  reason: collision with root package name */
        int f35481b;

        /* renamed from: c  reason: collision with root package name */
        private Class<?> f35482c;

        a(b bVar) {
            this.f35480a = bVar;
        }

        public void a() {
            this.f35480a.c(this);
        }

        /* access modifiers changed from: package-private */
        public void b(int i10, Class<?> cls) {
            this.f35481b = i10;
            this.f35482c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35481b == aVar.f35481b && this.f35482c == aVar.f35482c;
        }

        public int hashCode() {
            int i10 = this.f35481b * 31;
            Class<?> cls = this.f35482c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f35481b + "array=" + this.f35482c + '}';
        }
    }

    private static final class b extends c<a> {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        /* access modifiers changed from: package-private */
        public a e(int i10, Class<?> cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f35478e = i10;
    }

    private void f(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> m10 = m(cls);
        Integer num = m10.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        } else if (num.intValue() == 1) {
            m10.remove(Integer.valueOf(i10));
        } else {
            m10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
        }
    }

    private void g() {
        h(this.f35478e);
    }

    private void h(int i10) {
        while (this.f35479f > i10) {
            Object f10 = this.f35474a.f();
            k.d(f10);
            a i11 = i(f10);
            this.f35479f -= i11.c(f10) * i11.b();
            f(i11.c(f10), f10.getClass());
            if (Log.isLoggable(i11.a(), 2)) {
                Log.v(i11.a(), "evicted: " + i11.c(f10));
            }
        }
    }

    private <T> a<T> i(T t10) {
        return j(t10.getClass());
    }

    private <T> a<T> j(Class<T> cls) {
        a<T> aVar = this.f35477d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else if (cls.equals(byte[].class)) {
                aVar = new f();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f35477d.put(cls, aVar);
        }
        return aVar;
    }

    private <T> T k(a aVar) {
        return this.f35474a.a(aVar);
    }

    private <T> T l(a aVar, Class<T> cls) {
        a<T> j10 = j(cls);
        T k10 = k(aVar);
        if (k10 != null) {
            this.f35479f -= j10.c(k10) * j10.b();
            f(j10.c(k10), cls);
        }
        if (k10 != null) {
            return k10;
        }
        if (Log.isLoggable(j10.a(), 2)) {
            Log.v(j10.a(), "Allocated " + aVar.f35481b + " bytes");
        }
        return j10.newArray(aVar.f35481b);
    }

    private NavigableMap<Integer, Integer> m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f35476c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f35476c.put(cls, treeMap);
        return treeMap;
    }

    private boolean n() {
        int i10 = this.f35479f;
        return i10 == 0 || this.f35478e / i10 >= 2;
    }

    private boolean o(int i10) {
        return i10 <= this.f35478e / 2;
    }

    private boolean p(int i10, Integer num) {
        return num != null && (n() || num.intValue() <= i10 * 8);
    }

    public synchronized void a(int i10) {
        if (i10 >= 40) {
            try {
                b();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        } else if (i10 >= 20 || i10 == 15) {
            h(this.f35478e / 2);
        }
    }

    public synchronized void b() {
        h(0);
    }

    public synchronized <T> T c(int i10, Class<T> cls) {
        Integer ceilingKey;
        try {
            ceilingKey = m(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return l(p(i10, ceilingKey) ? this.f35475b.e(ceilingKey.intValue(), cls) : this.f35475b.e(i10, cls), cls);
    }

    public synchronized <T> T d(int i10, Class<T> cls) {
        return l(this.f35475b.e(i10, cls), cls);
    }

    public synchronized <T> void e(T t10) {
        Class<?> cls = t10.getClass();
        a<?> j10 = j(cls);
        int c10 = j10.c(t10);
        int b10 = j10.b() * c10;
        if (o(b10)) {
            a e10 = this.f35475b.e(c10, cls);
            this.f35474a.d(e10, t10);
            NavigableMap<Integer, Integer> m10 = m(cls);
            Integer num = m10.get(Integer.valueOf(e10.f35481b));
            Integer valueOf = Integer.valueOf(e10.f35481b);
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            m10.put(valueOf, Integer.valueOf(i10));
            this.f35479f += b10;
            g();
        }
    }
}
