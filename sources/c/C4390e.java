package C;

import C.q0;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: C.e  reason: case insensitive filesystem */
final class C4390e extends q0.a {

    /* renamed from: a  reason: collision with root package name */
    private final Size f5331a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f5332b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5333c;

    /* renamed from: C.e$b */
    static final class b extends q0.a.C0032a {

        /* renamed from: a  reason: collision with root package name */
        private Size f5334a;

        /* renamed from: b  reason: collision with root package name */
        private Rect f5335b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f5336c;

        b() {
        }

        /* access modifiers changed from: package-private */
        public q0.a a() {
            String str = "";
            if (this.f5334a == null) {
                str = str + " resolution";
            }
            if (this.f5335b == null) {
                str = str + " cropRect";
            }
            if (this.f5336c == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new C4390e(this.f5334a, this.f5335b, this.f5336c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public q0.a.C0032a b(Rect rect) {
            if (rect != null) {
                this.f5335b = rect;
                return this;
            }
            throw new NullPointerException("Null cropRect");
        }

        /* access modifiers changed from: package-private */
        public q0.a.C0032a c(int i10) {
            this.f5336c = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public q0.a.C0032a d(Size size) {
            if (size != null) {
                this.f5334a = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }
    }

    /* access modifiers changed from: package-private */
    public Rect a() {
        return this.f5332b;
    }

    /* access modifiers changed from: package-private */
    public Size b() {
        return this.f5331a;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f5333c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0.a)) {
            return false;
        }
        q0.a aVar = (q0.a) obj;
        return this.f5331a.equals(aVar.b()) && this.f5332b.equals(aVar.a()) && this.f5333c == aVar.c();
    }

    public int hashCode() {
        return ((((this.f5331a.hashCode() ^ 1000003) * 1000003) ^ this.f5332b.hashCode()) * 1000003) ^ this.f5333c;
    }

    public String toString() {
        return "ResolutionInfoInternal{resolution=" + this.f5331a + ", cropRect=" + this.f5332b + ", rotationDegrees=" + this.f5333c + "}";
    }

    private C4390e(Size size, Rect rect, int i10) {
        this.f5331a = size;
        this.f5332b = rect;
        this.f5333c = i10;
    }
}
