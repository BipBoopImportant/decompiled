package kb;

import java.util.Comparator;

/* renamed from: kb.n  reason: case insensitive filesystem */
public abstract class C9959n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C9959n f74995a = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C9959n f74996b = new b(-1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C9959n f74997c = new b(1);

    /* renamed from: kb.n$a */
    class a extends C9959n {
        a() {
            super((a) null);
        }

        public C9959n d(int i10, int i11) {
            return k(Integer.compare(i10, i11));
        }

        public C9959n e(long j10, long j11) {
            return k(Long.compare(j10, j11));
        }

        public <T> C9959n f(T t10, T t11, Comparator<T> comparator) {
            return k(comparator.compare(t10, t11));
        }

        public C9959n g(boolean z10, boolean z11) {
            return k(Boolean.compare(z10, z11));
        }

        public C9959n h(boolean z10, boolean z11) {
            return k(Boolean.compare(z11, z10));
        }

        public int i() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public C9959n k(int i10) {
            return i10 < 0 ? C9959n.f74996b : i10 > 0 ? C9959n.f74997c : C9959n.f74995a;
        }
    }

    /* renamed from: kb.n$b */
    private static final class b extends C9959n {

        /* renamed from: d  reason: collision with root package name */
        final int f74998d;

        b(int i10) {
            super((a) null);
            this.f74998d = i10;
        }

        public C9959n d(int i10, int i11) {
            return this;
        }

        public C9959n e(long j10, long j11) {
            return this;
        }

        public <T> C9959n f(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        public C9959n g(boolean z10, boolean z11) {
            return this;
        }

        public C9959n h(boolean z10, boolean z11) {
            return this;
        }

        public int i() {
            return this.f74998d;
        }
    }

    /* synthetic */ C9959n(a aVar) {
        this();
    }

    public static C9959n j() {
        return f74995a;
    }

    public abstract C9959n d(int i10, int i11);

    public abstract C9959n e(long j10, long j11);

    public abstract <T> C9959n f(T t10, T t11, Comparator<T> comparator);

    public abstract C9959n g(boolean z10, boolean z11);

    public abstract C9959n h(boolean z10, boolean z11);

    public abstract int i();

    private C9959n() {
    }
}
