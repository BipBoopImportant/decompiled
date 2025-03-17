package C;

import C.C4390e;
import android.graphics.Rect;
import android.util.Size;

public class q0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f5400a;

    static abstract class a {

        /* renamed from: C.q0$a$a  reason: collision with other inner class name */
        static abstract class C0032a {
            C0032a() {
            }

            /* access modifiers changed from: package-private */
            public abstract a a();

            /* access modifiers changed from: package-private */
            public abstract C0032a b(Rect rect);

            /* access modifiers changed from: package-private */
            public abstract C0032a c(int i10);
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        public abstract Rect a();

        /* access modifiers changed from: package-private */
        public abstract Size b();

        /* access modifiers changed from: package-private */
        public abstract int c();
    }

    public q0(Size size, Rect rect, int i10) {
        this.f5400a = new C4390e.b().d(size).b(rect).c(i10).a();
    }

    public Size a() {
        return this.f5400a.b();
    }

    public boolean equals(Object obj) {
        return this.f5400a.equals(obj);
    }

    public int hashCode() {
        return this.f5400a.hashCode();
    }

    public String toString() {
        return this.f5400a.toString();
    }
}
