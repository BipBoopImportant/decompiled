package z6;

import J6.a;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import w6.C8923e;

/* renamed from: z6.a  reason: case insensitive filesystem */
public abstract class C9019a<K, A> {

    /* renamed from: a  reason: collision with root package name */
    final List<b> f58419a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    private boolean f58420b = false;

    /* renamed from: c  reason: collision with root package name */
    private final d<K> f58421c;

    /* renamed from: d  reason: collision with root package name */
    protected float f58422d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    protected J6.c<A> f58423e;

    /* renamed from: f  reason: collision with root package name */
    private A f58424f = null;

    /* renamed from: g  reason: collision with root package name */
    private float f58425g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f58426h = -1.0f;

    /* renamed from: z6.a$b */
    public interface b {
        void a();
    }

    /* renamed from: z6.a$c */
    private static final class c<T> implements d<T> {
        private c() {
        }

        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        public a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        public boolean c(float f10) {
            return false;
        }

        public float d() {
            return 0.0f;
        }

        public float e() {
            return 1.0f;
        }

        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: z6.a$d */
    private interface d<T> {
        boolean a(float f10);

        a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* renamed from: z6.a$e */
    private static final class e<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends a<T>> f58427a;

        /* renamed from: b  reason: collision with root package name */
        private a<T> f58428b;

        /* renamed from: c  reason: collision with root package name */
        private a<T> f58429c = null;

        /* renamed from: d  reason: collision with root package name */
        private float f58430d = -1.0f;

        e(List<? extends a<T>> list) {
            this.f58427a = list;
            this.f58428b = f(0.0f);
        }

        private a<T> f(float f10) {
            List<? extends a<T>> list = this.f58427a;
            a<T> aVar = (a) list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f58427a.size() - 2; size >= 1; size--) {
                a<T> aVar2 = (a) this.f58427a.get(size);
                if (this.f58428b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return (a) this.f58427a.get(0);
        }

        public boolean a(float f10) {
            a<T> aVar = this.f58429c;
            a<T> aVar2 = this.f58428b;
            if (aVar == aVar2 && this.f58430d == f10) {
                return true;
            }
            this.f58429c = aVar2;
            this.f58430d = f10;
            return false;
        }

        public a<T> b() {
            return this.f58428b;
        }

        public boolean c(float f10) {
            if (this.f58428b.a(f10)) {
                return !this.f58428b.i();
            }
            this.f58428b = f(f10);
            return true;
        }

        public float d() {
            return ((a) this.f58427a.get(0)).f();
        }

        public float e() {
            List<? extends a<T>> list = this.f58427a;
            return ((a) list.get(list.size() - 1)).c();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: z6.a$f */
    private static final class f<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final a<T> f58431a;

        /* renamed from: b  reason: collision with root package name */
        private float f58432b = -1.0f;

        f(List<? extends a<T>> list) {
            this.f58431a = (a) list.get(0);
        }

        public boolean a(float f10) {
            if (this.f58432b == f10) {
                return true;
            }
            this.f58432b = f10;
            return false;
        }

        public a<T> b() {
            return this.f58431a;
        }

        public boolean c(float f10) {
            return !this.f58431a.i();
        }

        public float d() {
            return this.f58431a.f();
        }

        public float e() {
            return this.f58431a.c();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    C9019a(List<? extends a<K>> list) {
        this.f58421c = o(list);
    }

    private float g() {
        if (this.f58425g == -1.0f) {
            this.f58425g = this.f58421c.d();
        }
        return this.f58425g;
    }

    private static <T> d<T> o(List<? extends a<T>> list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f58419a.add(bVar);
    }

    /* access modifiers changed from: protected */
    public a<K> b() {
        C8923e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        a<K> b10 = this.f58421c.b();
        C8923e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        return b10;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        if (this.f58426h == -1.0f) {
            this.f58426h = this.f58421c.e();
        }
        return this.f58426h;
    }

    /* access modifiers changed from: protected */
    public float d() {
        a b10 = b();
        if (b10 == null || b10.i()) {
            return 0.0f;
        }
        return b10.f37353d.getInterpolation(e());
    }

    /* access modifiers changed from: package-private */
    public float e() {
        if (this.f58420b) {
            return 0.0f;
        }
        a b10 = b();
        if (b10.i()) {
            return 0.0f;
        }
        return (this.f58422d - b10.f()) / (b10.c() - b10.f());
    }

    public float f() {
        return this.f58422d;
    }

    public A h() {
        float e10 = e();
        if (this.f58423e == null && this.f58421c.a(e10)) {
            return this.f58424f;
        }
        a b10 = b();
        Interpolator interpolator = b10.f37354e;
        A i10 = (interpolator == null || b10.f37355f == null) ? i(b10, d()) : j(b10, e10, interpolator.getInterpolation(e10), b10.f37355f.getInterpolation(e10));
        this.f58424f = i10;
        return i10;
    }

    /* access modifiers changed from: package-private */
    public abstract A i(a<K> aVar, float f10);

    /* access modifiers changed from: protected */
    public A j(a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        C8923e.b("BaseKeyframeAnimation#notifyListeners");
        for (int i10 = 0; i10 < this.f58419a.size(); i10++) {
            this.f58419a.get(i10).a();
        }
        C8923e.c("BaseKeyframeAnimation#notifyListeners");
    }

    public void l() {
        this.f58420b = true;
    }

    public void m(float f10) {
        C8923e.b("BaseKeyframeAnimation#setProgress");
        if (this.f58421c.isEmpty()) {
            C8923e.c("BaseKeyframeAnimation#setProgress");
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f58422d) {
            C8923e.c("BaseKeyframeAnimation#setProgress");
            return;
        }
        this.f58422d = f10;
        if (this.f58421c.c(f10)) {
            k();
        }
        C8923e.c("BaseKeyframeAnimation#setProgress");
    }

    public void n(J6.c<A> cVar) {
        J6.c<A> cVar2 = this.f58423e;
        if (cVar2 != null) {
            cVar2.c((C9019a<?, ?>) null);
        }
        this.f58423e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
