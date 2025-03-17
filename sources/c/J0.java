package C;

import H2.i;
import android.util.Rational;

public final class J0 {

    /* renamed from: a  reason: collision with root package name */
    private int f5254a;

    /* renamed from: b  reason: collision with root package name */
    private Rational f5255b;

    /* renamed from: c  reason: collision with root package name */
    private int f5256c;

    /* renamed from: d  reason: collision with root package name */
    private int f5257d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f5258a = 1;

        /* renamed from: b  reason: collision with root package name */
        private final Rational f5259b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5260c;

        /* renamed from: d  reason: collision with root package name */
        private int f5261d = 0;

        public a(Rational rational, int i10) {
            this.f5259b = rational;
            this.f5260c = i10;
        }

        public J0 a() {
            i.h(this.f5259b, "The crop aspect ratio must be set.");
            return new J0(this.f5258a, this.f5259b, this.f5260c, this.f5261d);
        }

        public a b(int i10) {
            this.f5261d = i10;
            return this;
        }

        public a c(int i10) {
            this.f5258a = i10;
            return this;
        }
    }

    J0(int i10, Rational rational, int i11, int i12) {
        this.f5254a = i10;
        this.f5255b = rational;
        this.f5256c = i11;
        this.f5257d = i12;
    }

    public Rational a() {
        return this.f5255b;
    }

    public int b() {
        return this.f5257d;
    }

    public int c() {
        return this.f5256c;
    }

    public int d() {
        return this.f5254a;
    }
}
