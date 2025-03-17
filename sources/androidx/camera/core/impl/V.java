package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.impl.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class V {

    /* renamed from: i  reason: collision with root package name */
    public static final X.a<Integer> f16779i = X.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: j  reason: collision with root package name */
    public static final X.a<Integer> f16780j = X.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final X.a<Range<Integer>> f16781k = X.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* renamed from: a  reason: collision with root package name */
    final List<C5019e0> f16782a;

    /* renamed from: b  reason: collision with root package name */
    final X f16783b;

    /* renamed from: c  reason: collision with root package name */
    final int f16784c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f16785d;

    /* renamed from: e  reason: collision with root package name */
    final List<C5040p> f16786e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16787f;

    /* renamed from: g  reason: collision with root package name */
    private final g1 f16788g;

    /* renamed from: h  reason: collision with root package name */
    private final C5059z f16789h;

    public interface b {
        void a(o1<?> o1Var, a aVar);
    }

    V(List<C5019e0> list, X x10, int i10, boolean z10, List<C5040p> list2, boolean z11, g1 g1Var, C5059z zVar) {
        this.f16782a = list;
        this.f16783b = x10;
        this.f16784c = i10;
        this.f16786e = Collections.unmodifiableList(list2);
        this.f16787f = z11;
        this.f16788g = g1Var;
        this.f16789h = zVar;
        this.f16785d = z10;
    }

    public static V b() {
        return new a().h();
    }

    public List<C5040p> c() {
        return this.f16786e;
    }

    public C5059z d() {
        return this.f16789h;
    }

    public Range<Integer> e() {
        Range<Integer> range = (Range) this.f16783b.g(f16781k, c1.f16864a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object d10 = this.f16788g.d("CAPTURE_CONFIG_ID_KEY");
        if (d10 == null) {
            return -1;
        }
        return ((Integer) d10).intValue();
    }

    public X g() {
        return this.f16783b;
    }

    public int h() {
        Integer num = (Integer) this.f16783b.g(o1.f16979G, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List<C5019e0> i() {
        return Collections.unmodifiableList(this.f16782a);
    }

    public g1 j() {
        return this.f16788g;
    }

    public int k() {
        return this.f16784c;
    }

    public int l() {
        Integer num = (Integer) this.f16783b.g(o1.f16980H, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f16785d;
    }

    public boolean n() {
        return this.f16787f;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<C5019e0> f16790a;

        /* renamed from: b  reason: collision with root package name */
        private D0 f16791b;

        /* renamed from: c  reason: collision with root package name */
        private int f16792c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f16793d;

        /* renamed from: e  reason: collision with root package name */
        private List<C5040p> f16794e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f16795f;

        /* renamed from: g  reason: collision with root package name */
        private G0 f16796g;

        /* renamed from: h  reason: collision with root package name */
        private C5059z f16797h;

        public a() {
            this.f16790a = new HashSet();
            this.f16791b = E0.b0();
            this.f16792c = -1;
            this.f16793d = false;
            this.f16794e = new ArrayList();
            this.f16795f = false;
            this.f16796g = G0.g();
        }

        public static a j(o1<?> o1Var) {
            b p10 = o1Var.p((b) null);
            if (p10 != null) {
                a aVar = new a();
                p10.a(o1Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o1Var.t(o1Var.toString()));
        }

        public static a k(V v10) {
            return new a(v10);
        }

        public void a(Collection<C5040p> collection) {
            for (C5040p c10 : collection) {
                c(c10);
            }
        }

        public void b(g1 g1Var) {
            this.f16796g.f(g1Var);
        }

        public void c(C5040p pVar) {
            if (!this.f16794e.contains(pVar)) {
                this.f16794e.add(pVar);
            }
        }

        public <T> void d(X.a<T> aVar, T t10) {
            this.f16791b.q(aVar, t10);
        }

        public void e(X x10) {
            for (X.a next : x10.e()) {
                Object g10 = this.f16791b.g(next, null);
                Object a10 = x10.a(next);
                if (g10 instanceof C0) {
                    ((C0) g10).a(((C0) a10).c());
                } else {
                    if (a10 instanceof C0) {
                        a10 = ((C0) a10).clone();
                    }
                    this.f16791b.o(next, x10.h(next), a10);
                }
            }
        }

        public void f(C5019e0 e0Var) {
            this.f16790a.add(e0Var);
        }

        public void g(String str, Object obj) {
            this.f16796g.i(str, obj);
        }

        public V h() {
            return new V(new ArrayList(this.f16790a), J0.Z(this.f16791b), this.f16792c, this.f16793d, new ArrayList(this.f16794e), this.f16795f, g1.c(this.f16796g), this.f16797h);
        }

        public void i() {
            this.f16790a.clear();
        }

        public Range<Integer> l() {
            return (Range) this.f16791b.g(V.f16781k, c1.f16864a);
        }

        public Set<C5019e0> m() {
            return this.f16790a;
        }

        public int n() {
            return this.f16792c;
        }

        public boolean o(C5040p pVar) {
            return this.f16794e.remove(pVar);
        }

        public void p(C5059z zVar) {
            this.f16797h = zVar;
        }

        public void q(Range<Integer> range) {
            d(V.f16781k, range);
        }

        public void r(int i10) {
            this.f16796g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
        }

        public void s(X x10) {
            this.f16791b = E0.c0(x10);
        }

        public void t(boolean z10) {
            this.f16793d = z10;
        }

        public void u(int i10) {
            if (i10 != 0) {
                d(o1.f16979G, Integer.valueOf(i10));
            }
        }

        public void v(int i10) {
            this.f16792c = i10;
        }

        public void w(boolean z10) {
            this.f16795f = z10;
        }

        public void x(int i10) {
            if (i10 != 0) {
                d(o1.f16980H, Integer.valueOf(i10));
            }
        }

        private a(V v10) {
            HashSet hashSet = new HashSet();
            this.f16790a = hashSet;
            this.f16791b = E0.b0();
            this.f16792c = -1;
            this.f16793d = false;
            this.f16794e = new ArrayList();
            this.f16795f = false;
            this.f16796g = G0.g();
            hashSet.addAll(v10.f16782a);
            this.f16791b = E0.c0(v10.f16783b);
            this.f16792c = v10.f16784c;
            this.f16794e.addAll(v10.c());
            this.f16795f = v10.n();
            this.f16796g = G0.h(v10.j());
            this.f16793d = v10.f16785d;
        }
    }
}
