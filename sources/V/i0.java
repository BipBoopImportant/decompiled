package V;

import V.C4923h;
import android.util.Range;
import java.util.Arrays;

public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Range<Integer> f14455a = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final Range<Integer> f14456b = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public static final C4930o f14457c;

    public static abstract class a {
        a() {
        }

        public abstract i0 a();

        /* access modifiers changed from: package-private */
        public abstract a b(int i10);

        public abstract a c(Range<Integer> range);

        public abstract a d(Range<Integer> range);

        public abstract a e(C4930o oVar);
    }

    static {
        C4927l lVar = C4927l.f14461c;
        f14457c = C4930o.c(Arrays.asList(new C4927l[]{lVar, C4927l.f14460b, C4927l.f14459a}), C4925j.a(lVar));
    }

    i0() {
    }

    public static a a() {
        return new C4923h.b().e(f14457c).d(f14455a).c(f14456b).b(-1);
    }

    /* access modifiers changed from: package-private */
    public abstract int b();

    public abstract Range<Integer> c();

    public abstract Range<Integer> d();

    public abstract C4930o e();

    public abstract a f();
}
