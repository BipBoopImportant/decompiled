package V;

import V.i0;
import android.util.Range;

/* renamed from: V.h  reason: case insensitive filesystem */
final class C4923h extends i0 {

    /* renamed from: d  reason: collision with root package name */
    private final C4930o f14443d;

    /* renamed from: e  reason: collision with root package name */
    private final Range<Integer> f14444e;

    /* renamed from: f  reason: collision with root package name */
    private final Range<Integer> f14445f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14446g;

    /* renamed from: V.h$b */
    static final class b extends i0.a {

        /* renamed from: a  reason: collision with root package name */
        private C4930o f14447a;

        /* renamed from: b  reason: collision with root package name */
        private Range<Integer> f14448b;

        /* renamed from: c  reason: collision with root package name */
        private Range<Integer> f14449c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f14450d;

        public i0 a() {
            String str = "";
            if (this.f14447a == null) {
                str = str + " qualitySelector";
            }
            if (this.f14448b == null) {
                str = str + " frameRate";
            }
            if (this.f14449c == null) {
                str = str + " bitrate";
            }
            if (this.f14450d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C4923h(this.f14447a, this.f14448b, this.f14449c, this.f14450d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public i0.a b(int i10) {
            this.f14450d = Integer.valueOf(i10);
            return this;
        }

        public i0.a c(Range<Integer> range) {
            if (range != null) {
                this.f14449c = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        public i0.a d(Range<Integer> range) {
            if (range != null) {
                this.f14448b = range;
                return this;
            }
            throw new NullPointerException("Null frameRate");
        }

        public i0.a e(C4930o oVar) {
            if (oVar != null) {
                this.f14447a = oVar;
                return this;
            }
            throw new NullPointerException("Null qualitySelector");
        }

        b() {
        }

        private b(i0 i0Var) {
            this.f14447a = i0Var.e();
            this.f14448b = i0Var.d();
            this.f14449c = i0Var.c();
            this.f14450d = Integer.valueOf(i0Var.b());
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f14446g;
    }

    public Range<Integer> c() {
        return this.f14445f;
    }

    public Range<Integer> d() {
        return this.f14444e;
    }

    public C4930o e() {
        return this.f14443d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f14443d.equals(i0Var.e()) && this.f14444e.equals(i0Var.d()) && this.f14445f.equals(i0Var.c()) && this.f14446g == i0Var.b();
    }

    public i0.a f() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.f14443d.hashCode() ^ 1000003) * 1000003) ^ this.f14444e.hashCode()) * 1000003) ^ this.f14445f.hashCode()) * 1000003) ^ this.f14446g;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f14443d + ", frameRate=" + this.f14444e + ", bitrate=" + this.f14445f + ", aspectRatio=" + this.f14446g + "}";
    }

    private C4923h(C4930o oVar, Range<Integer> range, Range<Integer> range2, int i10) {
        this.f14443d = oVar;
        this.f14444e = range;
        this.f14445f = range2;
        this.f14446g = i10;
    }
}
