package Tb;

import Tb.F;

final class t extends F.e.d.a.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f63810a;

    /* renamed from: b  reason: collision with root package name */
    private final int f63811b;

    /* renamed from: c  reason: collision with root package name */
    private final int f63812c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f63813d;

    static final class b extends F.e.d.a.c.C1107a {

        /* renamed from: a  reason: collision with root package name */
        private String f63814a;

        /* renamed from: b  reason: collision with root package name */
        private int f63815b;

        /* renamed from: c  reason: collision with root package name */
        private int f63816c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f63817d;

        /* renamed from: e  reason: collision with root package name */
        private byte f63818e;

        b() {
        }

        public F.e.d.a.c a() {
            String str;
            if (this.f63818e == 7 && (str = this.f63814a) != null) {
                return new t(str, this.f63815b, this.f63816c, this.f63817d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63814a == null) {
                sb2.append(" processName");
            }
            if ((this.f63818e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f63818e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f63818e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.a.c.C1107a b(boolean z10) {
            this.f63817d = z10;
            this.f63818e = (byte) (this.f63818e | 4);
            return this;
        }

        public F.e.d.a.c.C1107a c(int i10) {
            this.f63816c = i10;
            this.f63818e = (byte) (this.f63818e | 2);
            return this;
        }

        public F.e.d.a.c.C1107a d(int i10) {
            this.f63815b = i10;
            this.f63818e = (byte) (this.f63818e | 1);
            return this;
        }

        public F.e.d.a.c.C1107a e(String str) {
            if (str != null) {
                this.f63814a = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
    }

    public int b() {
        return this.f63812c;
    }

    public int c() {
        return this.f63811b;
    }

    public String d() {
        return this.f63810a;
    }

    public boolean e() {
        return this.f63813d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.c)) {
            return false;
        }
        F.e.d.a.c cVar = (F.e.d.a.c) obj;
        return this.f63810a.equals(cVar.d()) && this.f63811b == cVar.c() && this.f63812c == cVar.b() && this.f63813d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f63810a.hashCode() ^ 1000003) * 1000003) ^ this.f63811b) * 1000003) ^ this.f63812c) * 1000003) ^ (this.f63813d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f63810a + ", pid=" + this.f63811b + ", importance=" + this.f63812c + ", defaultProcess=" + this.f63813d + "}";
    }

    private t(String str, int i10, int i11, boolean z10) {
        this.f63810a = str;
        this.f63811b = i10;
        this.f63812c = i11;
        this.f63813d = z10;
    }
}
