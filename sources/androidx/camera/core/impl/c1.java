package androidx.camera.core.impl;

import C.C4417z;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C5034m;

public abstract class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Range<Integer> f16864a = new Range<>(0, 0);

    public static abstract class a {
        a() {
        }

        public abstract c1 a();

        public abstract a b(C4417z zVar);

        public abstract a c(Range<Integer> range);

        public abstract a d(X x10);

        public abstract a e(Size size);

        public abstract a f(boolean z10);
    }

    public static a a(Size size) {
        return new C5034m.b().e(size).c(f16864a).b(C4417z.f5465d).f(false);
    }

    public abstract C4417z b();

    public abstract Range<Integer> c();

    public abstract X d();

    public abstract Size e();

    public abstract boolean f();

    public abstract a g();
}
