package V;

import V.C4916a;
import android.util.Range;

/* renamed from: V.b  reason: case insensitive filesystem */
final class C4917b extends C4916a {

    /* renamed from: d  reason: collision with root package name */
    private final Range<Integer> f14391d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14392e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14393f;

    /* renamed from: g  reason: collision with root package name */
    private final Range<Integer> f14394g;

    /* renamed from: h  reason: collision with root package name */
    private final int f14395h;

    /* renamed from: V.b$b  reason: collision with other inner class name */
    static final class C0209b extends C4916a.C0208a {

        /* renamed from: a  reason: collision with root package name */
        private Range<Integer> f14396a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f14397b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f14398c;

        /* renamed from: d  reason: collision with root package name */
        private Range<Integer> f14399d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f14400e;

        C0209b() {
        }

        public C4916a a() {
            String str = "";
            if (this.f14396a == null) {
                str = str + " bitrate";
            }
            if (this.f14397b == null) {
                str = str + " sourceFormat";
            }
            if (this.f14398c == null) {
                str = str + " source";
            }
            if (this.f14399d == null) {
                str = str + " sampleRate";
            }
            if (this.f14400e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C4917b(this.f14396a, this.f14397b.intValue(), this.f14398c.intValue(), this.f14399d, this.f14400e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public C4916a.C0208a b(Range<Integer> range) {
            if (range != null) {
                this.f14396a = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        public C4916a.C0208a c(int i10) {
            this.f14400e = Integer.valueOf(i10);
            return this;
        }

        public C4916a.C0208a d(Range<Integer> range) {
            if (range != null) {
                this.f14399d = range;
                return this;
            }
            throw new NullPointerException("Null sampleRate");
        }

        public C4916a.C0208a e(int i10) {
            this.f14398c = Integer.valueOf(i10);
            return this;
        }

        public C4916a.C0208a f(int i10) {
            this.f14397b = Integer.valueOf(i10);
            return this;
        }
    }

    public Range<Integer> b() {
        return this.f14391d;
    }

    public int c() {
        return this.f14395h;
    }

    public Range<Integer> d() {
        return this.f14394g;
    }

    public int e() {
        return this.f14393f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4916a)) {
            return false;
        }
        C4916a aVar = (C4916a) obj;
        return this.f14391d.equals(aVar.b()) && this.f14392e == aVar.f() && this.f14393f == aVar.e() && this.f14394g.equals(aVar.d()) && this.f14395h == aVar.c();
    }

    public int f() {
        return this.f14392e;
    }

    public int hashCode() {
        return ((((((((this.f14391d.hashCode() ^ 1000003) * 1000003) ^ this.f14392e) * 1000003) ^ this.f14393f) * 1000003) ^ this.f14394g.hashCode()) * 1000003) ^ this.f14395h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f14391d + ", sourceFormat=" + this.f14392e + ", source=" + this.f14393f + ", sampleRate=" + this.f14394g + ", channelCount=" + this.f14395h + "}";
    }

    private C4917b(Range<Integer> range, int i10, int i11, Range<Integer> range2, int i12) {
        this.f14391d = range;
        this.f14392e = i10;
        this.f14393f = i11;
        this.f14394g = range2;
        this.f14395h = i12;
    }
}
