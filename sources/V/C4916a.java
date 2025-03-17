package V;

import V.C4917b;
import android.util.Range;

/* renamed from: V.a  reason: case insensitive filesystem */
public abstract class C4916a {

    /* renamed from: a  reason: collision with root package name */
    public static final Range<Integer> f14387a = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final Range<Integer> f14388b = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public static final C4916a f14389c = a().c(0).a();

    /* renamed from: V.a$a  reason: collision with other inner class name */
    public static abstract class C0208a {
        C0208a() {
        }

        public abstract C4916a a();

        public abstract C0208a b(Range<Integer> range);

        public abstract C0208a c(int i10);

        public abstract C0208a d(Range<Integer> range);

        public abstract C0208a e(int i10);
    }

    C4916a() {
    }

    public static C0208a a() {
        return new C4917b.C0209b().f(-1).e(-1).c(-1).b(f14387a).d(f14388b);
    }

    public abstract Range<Integer> b();

    public abstract int c();

    public abstract Range<Integer> d();

    public abstract int e();

    public abstract int f();
}
