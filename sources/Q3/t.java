package q3;

import t3.C5950a;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public final C5798i f28294a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28295b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28296c;

    /* renamed from: d  reason: collision with root package name */
    public final float f28297d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28298e;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private C5798i f28299a;

        /* renamed from: b  reason: collision with root package name */
        private int f28300b;

        /* renamed from: c  reason: collision with root package name */
        private int f28301c;

        /* renamed from: d  reason: collision with root package name */
        private float f28302d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        private long f28303e;

        public b(C5798i iVar, int i10, int i11) {
            this.f28299a = iVar;
            this.f28300b = i10;
            this.f28301c = i11;
        }

        public t a() {
            return new t(this.f28299a, this.f28300b, this.f28301c, this.f28302d, this.f28303e);
        }

        public b b(float f10) {
            this.f28302d = f10;
            return this;
        }
    }

    private t(C5798i iVar, int i10, int i11, float f10, long j10) {
        boolean z10 = false;
        boolean z11 = i10 > 0;
        C5950a.b(z11, "width must be positive, but is: " + i10);
        z10 = i11 > 0 ? true : z10;
        C5950a.b(z10, "height must be positive, but is: " + i11);
        this.f28294a = iVar;
        this.f28295b = i10;
        this.f28296c = i11;
        this.f28297d = f10;
        this.f28298e = j10;
    }
}
