package a0;

import a0.i0;
import android.util.Size;
import androidx.camera.core.impl.h1;

/* renamed from: a0.c  reason: case insensitive filesystem */
final class C4959c extends i0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f15071a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15072b;

    /* renamed from: c  reason: collision with root package name */
    private final h1 f15073c;

    /* renamed from: d  reason: collision with root package name */
    private final Size f15074d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15075e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f15076f;

    /* renamed from: g  reason: collision with root package name */
    private final int f15077g;

    /* renamed from: h  reason: collision with root package name */
    private final int f15078h;

    /* renamed from: i  reason: collision with root package name */
    private final int f15079i;

    /* renamed from: a0.c$b */
    static final class b extends i0.a {

        /* renamed from: a  reason: collision with root package name */
        private String f15080a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f15081b;

        /* renamed from: c  reason: collision with root package name */
        private h1 f15082c;

        /* renamed from: d  reason: collision with root package name */
        private Size f15083d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f15084e;

        /* renamed from: f  reason: collision with root package name */
        private j0 f15085f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f15086g;

        /* renamed from: h  reason: collision with root package name */
        private Integer f15087h;

        /* renamed from: i  reason: collision with root package name */
        private Integer f15088i;

        b() {
        }

        public i0 a() {
            String str = "";
            if (this.f15080a == null) {
                str = str + " mimeType";
            }
            if (this.f15081b == null) {
                str = str + " profile";
            }
            if (this.f15082c == null) {
                str = str + " inputTimebase";
            }
            if (this.f15083d == null) {
                str = str + " resolution";
            }
            if (this.f15084e == null) {
                str = str + " colorFormat";
            }
            if (this.f15085f == null) {
                str = str + " dataSpace";
            }
            if (this.f15086g == null) {
                str = str + " frameRate";
            }
            if (this.f15087h == null) {
                str = str + " IFrameInterval";
            }
            if (this.f15088i == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new C4959c(this.f15080a, this.f15081b.intValue(), this.f15082c, this.f15083d, this.f15084e.intValue(), this.f15085f, this.f15086g.intValue(), this.f15087h.intValue(), this.f15088i.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public i0.a b(int i10) {
            this.f15088i = Integer.valueOf(i10);
            return this;
        }

        public i0.a c(int i10) {
            this.f15084e = Integer.valueOf(i10);
            return this;
        }

        public i0.a d(j0 j0Var) {
            if (j0Var != null) {
                this.f15085f = j0Var;
                return this;
            }
            throw new NullPointerException("Null dataSpace");
        }

        public i0.a e(int i10) {
            this.f15086g = Integer.valueOf(i10);
            return this;
        }

        public i0.a f(int i10) {
            this.f15087h = Integer.valueOf(i10);
            return this;
        }

        public i0.a g(h1 h1Var) {
            if (h1Var != null) {
                this.f15082c = h1Var;
                return this;
            }
            throw new NullPointerException("Null inputTimebase");
        }

        public i0.a h(String str) {
            if (str != null) {
                this.f15080a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        public i0.a i(int i10) {
            this.f15081b = Integer.valueOf(i10);
            return this;
        }

        public i0.a j(Size size) {
            if (size != null) {
                this.f15083d = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }
    }

    public String a() {
        return this.f15071a;
    }

    public h1 c() {
        return this.f15073c;
    }

    public int e() {
        return this.f15079i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f15071a.equals(i0Var.a()) && this.f15072b == i0Var.j() && this.f15073c.equals(i0Var.c()) && this.f15074d.equals(i0Var.k()) && this.f15075e == i0Var.f() && this.f15076f.equals(i0Var.g()) && this.f15077g == i0Var.h() && this.f15078h == i0Var.i() && this.f15079i == i0Var.e();
    }

    public int f() {
        return this.f15075e;
    }

    public j0 g() {
        return this.f15076f;
    }

    public int h() {
        return this.f15077g;
    }

    public int hashCode() {
        return ((((((((((((((((this.f15071a.hashCode() ^ 1000003) * 1000003) ^ this.f15072b) * 1000003) ^ this.f15073c.hashCode()) * 1000003) ^ this.f15074d.hashCode()) * 1000003) ^ this.f15075e) * 1000003) ^ this.f15076f.hashCode()) * 1000003) ^ this.f15077g) * 1000003) ^ this.f15078h) * 1000003) ^ this.f15079i;
    }

    public int i() {
        return this.f15078h;
    }

    public int j() {
        return this.f15072b;
    }

    public Size k() {
        return this.f15074d;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f15071a + ", profile=" + this.f15072b + ", inputTimebase=" + this.f15073c + ", resolution=" + this.f15074d + ", colorFormat=" + this.f15075e + ", dataSpace=" + this.f15076f + ", frameRate=" + this.f15077g + ", IFrameInterval=" + this.f15078h + ", bitrate=" + this.f15079i + "}";
    }

    private C4959c(String str, int i10, h1 h1Var, Size size, int i11, j0 j0Var, int i12, int i13, int i14) {
        this.f15071a = str;
        this.f15072b = i10;
        this.f15073c = h1Var;
        this.f15074d = size;
        this.f15075e = i11;
        this.f15076f = j0Var;
        this.f15077g = i12;
        this.f15078h = i13;
        this.f15079i = i14;
    }
}
