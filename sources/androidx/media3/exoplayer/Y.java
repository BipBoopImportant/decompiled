package androidx.media3.exoplayer;

import jb.j;
import t3.C5950a;

public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public final long f22618a;

    /* renamed from: b  reason: collision with root package name */
    public final float f22619b;

    /* renamed from: c  reason: collision with root package name */
    public final long f22620c;

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f22621a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f22622b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f22623c;

        public Y d() {
            return new Y(this);
        }

        public b e(long j10) {
            C5950a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f22623c = j10;
            return this;
        }

        public b f(long j10) {
            this.f22621a = j10;
            return this;
        }

        public b g(float f10) {
            C5950a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f22622b = f10;
            return this;
        }

        public b() {
            this.f22621a = -9223372036854775807L;
            this.f22622b = -3.4028235E38f;
            this.f22623c = -9223372036854775807L;
        }

        private b(Y y10) {
            this.f22621a = y10.f22618a;
            this.f22622b = y10.f22619b;
            this.f22623c = y10.f22620c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        return this.f22618a == y10.f22618a && this.f22619b == y10.f22619b && this.f22620c == y10.f22620c;
    }

    public int hashCode() {
        return j.b(Long.valueOf(this.f22618a), Float.valueOf(this.f22619b), Long.valueOf(this.f22620c));
    }

    private Y(b bVar) {
        this.f22618a = bVar.f22621a;
        this.f22619b = bVar.f22622b;
        this.f22620c = bVar.f22623c;
    }
}
