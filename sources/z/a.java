package Z;

import Z.f;
import androidx.camera.core.impl.C5031k0;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f14888a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14889b;

    /* renamed from: c  reason: collision with root package name */
    private final C5031k0.c f14890c;

    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f14891a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f14892b;

        /* renamed from: c  reason: collision with root package name */
        private C5031k0.c f14893c;

        b() {
        }

        public f b() {
            String str = "";
            if (this.f14891a == null) {
                str = str + " mimeType";
            }
            if (this.f14892b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new a(this.f14891a, this.f14892b.intValue(), this.f14893c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a c(C5031k0.c cVar) {
            this.f14893c = cVar;
            return this;
        }

        /* access modifiers changed from: protected */
        public f.a d(String str) {
            if (str != null) {
                this.f14891a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        /* renamed from: e */
        public f.a a(int i10) {
            this.f14892b = Integer.valueOf(i10);
            return this;
        }
    }

    public String a() {
        return this.f14888a;
    }

    public int b() {
        return this.f14889b;
    }

    public C5031k0.c d() {
        return this.f14890c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f14888a.equals(fVar.a()) && this.f14889b == fVar.b()) {
            C5031k0.c cVar = this.f14890c;
            if (cVar == null) {
                if (fVar.d() == null) {
                    return true;
                }
            } else if (cVar.equals(fVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f14888a.hashCode() ^ 1000003) * 1000003) ^ this.f14889b) * 1000003;
        C5031k0.c cVar = this.f14890c;
        return hashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f14888a + ", profile=" + this.f14889b + ", compatibleVideoProfile=" + this.f14890c + "}";
    }

    private a(String str, int i10, C5031k0.c cVar) {
        this.f14888a = str;
        this.f14889b = i10;
        this.f14890c = cVar;
    }
}
