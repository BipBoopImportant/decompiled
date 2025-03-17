package n4;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import k4.C8421e;
import k4.s;
import s3.a;
import t3.B;
import t3.C5957h;
import t3.N;

/* renamed from: n4.a  reason: case insensitive filesystem */
public final class C8569a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final B f55071a = new B();

    /* renamed from: b  reason: collision with root package name */
    private final B f55072b = new B();

    /* renamed from: c  reason: collision with root package name */
    private final C0878a f55073c = new C0878a();

    /* renamed from: d  reason: collision with root package name */
    private Inflater f55074d;

    /* renamed from: n4.a$a  reason: collision with other inner class name */
    private static final class C0878a {

        /* renamed from: a  reason: collision with root package name */
        private final B f55075a = new B();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f55076b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f55077c;

        /* renamed from: d  reason: collision with root package name */
        private int f55078d;

        /* renamed from: e  reason: collision with root package name */
        private int f55079e;

        /* renamed from: f  reason: collision with root package name */
        private int f55080f;

        /* renamed from: g  reason: collision with root package name */
        private int f55081g;

        /* renamed from: h  reason: collision with root package name */
        private int f55082h;

        /* renamed from: i  reason: collision with root package name */
        private int f55083i;

        /* access modifiers changed from: private */
        public void e(B b10, int i10) {
            int K10;
            if (i10 >= 4) {
                b10.X(3);
                int i11 = i10 - 4;
                if ((b10.H() & 128) != 0) {
                    if (i11 >= 7 && (K10 = b10.K()) >= 4) {
                        this.f55082h = b10.P();
                        this.f55083i = b10.P();
                        this.f55075a.S(K10 - 4);
                        i11 = i10 - 11;
                    } else {
                        return;
                    }
                }
                int f10 = this.f55075a.f();
                int g10 = this.f55075a.g();
                if (f10 < g10 && i11 > 0) {
                    int min = Math.min(i11, g10 - f10);
                    b10.l(this.f55075a.e(), f10, min);
                    this.f55075a.W(f10 + min);
                }
            }
        }

        /* access modifiers changed from: private */
        public void f(B b10, int i10) {
            if (i10 >= 19) {
                this.f55078d = b10.P();
                this.f55079e = b10.P();
                b10.X(11);
                this.f55080f = b10.P();
                this.f55081g = b10.P();
            }
        }

        /* access modifiers changed from: private */
        public void g(B b10, int i10) {
            if (i10 % 5 == 2) {
                b10.X(2);
                Arrays.fill(this.f55076b, 0);
                int i11 = i10 / 5;
                for (int i12 = 0; i12 < i11; i12++) {
                    int H10 = b10.H();
                    int H11 = b10.H();
                    int H12 = b10.H();
                    int H13 = b10.H();
                    double d10 = (double) H11;
                    double d11 = (double) (H12 - 128);
                    double d12 = (double) (H13 - 128);
                    this.f55076b[H10] = (N.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (b10.H() << 24) | (N.p((int) ((1.402d * d11) + d10), 0, 255) << 16) | N.p((int) (d10 + (d12 * 1.772d)), 0, 255);
                }
                this.f55077c = true;
            }
        }

        public a d() {
            int H10;
            if (this.f55078d == 0 || this.f55079e == 0 || this.f55082h == 0 || this.f55083i == 0 || this.f55075a.g() == 0 || this.f55075a.f() != this.f55075a.g() || !this.f55077c) {
                return null;
            }
            this.f55075a.W(0);
            int i10 = this.f55082h * this.f55083i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int H11 = this.f55075a.H();
                if (H11 != 0) {
                    H10 = i11 + 1;
                    iArr[i11] = this.f55076b[H11];
                } else {
                    int H12 = this.f55075a.H();
                    if (H12 != 0) {
                        H10 = ((H12 & 64) == 0 ? H12 & 63 : ((H12 & 63) << 8) | this.f55075a.H()) + i11;
                        Arrays.fill(iArr, i11, H10, (H12 & 128) == 0 ? this.f55076b[0] : this.f55076b[this.f55075a.H()]);
                    }
                }
                i11 = H10;
            }
            return new a.b().f(Bitmap.createBitmap(iArr, this.f55082h, this.f55083i, Bitmap.Config.ARGB_8888)).k(((float) this.f55080f) / ((float) this.f55078d)).l(0).h(((float) this.f55081g) / ((float) this.f55079e), 0).i(0).n(((float) this.f55082h) / ((float) this.f55078d)).g(((float) this.f55083i) / ((float) this.f55079e)).a();
        }

        public void h() {
            this.f55078d = 0;
            this.f55079e = 0;
            this.f55080f = 0;
            this.f55081g = 0;
            this.f55082h = 0;
            this.f55083i = 0;
            this.f55075a.S(0);
            this.f55077c = false;
        }
    }

    private void e(B b10) {
        if (b10.a() > 0 && b10.j() == 120) {
            if (this.f55074d == null) {
                this.f55074d = new Inflater();
            }
            if (N.z0(b10, this.f55072b, this.f55074d)) {
                b10.U(this.f55072b.e(), this.f55072b.g());
            }
        }
    }

    private static a f(B b10, C0878a aVar) {
        int g10 = b10.g();
        int H10 = b10.H();
        int P10 = b10.P();
        int f10 = b10.f() + P10;
        a aVar2 = null;
        if (f10 > g10) {
            b10.W(g10);
            return null;
        }
        if (H10 != 128) {
            switch (H10) {
                case 20:
                    aVar.g(b10, P10);
                    break;
                case 21:
                    aVar.e(b10, P10);
                    break;
                case 22:
                    aVar.f(b10, P10);
                    break;
            }
        } else {
            aVar2 = aVar.d();
            aVar.h();
        }
        b10.W(f10);
        return aVar2;
    }

    public void c(byte[] bArr, int i10, int i11, s.b bVar, C5957h<C8421e> hVar) {
        this.f55071a.U(bArr, i11 + i10);
        this.f55071a.W(i10);
        e(this.f55071a);
        this.f55073c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f55071a.a() >= 3) {
            a f10 = f(this.f55071a, this.f55073c);
            if (f10 != null) {
                arrayList.add(f10);
            }
        }
        hVar.accept(new C8421e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public int d() {
        return 2;
    }
}
