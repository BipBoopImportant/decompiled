package T3;

import N3.C6663a;
import N3.O;
import T3.C6695e;
import java.util.Collections;
import q3.C5807s;
import t3.B;

/* renamed from: T3.a  reason: case insensitive filesystem */
final class C6691a extends C6695e {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f39979e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f39980b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39981c;

    /* renamed from: d  reason: collision with root package name */
    private int f39982d;

    public C6691a(O o10) {
        super(o10);
    }

    /* access modifiers changed from: protected */
    public boolean b(B b10) {
        if (!this.f39980b) {
            int H10 = b10.H();
            int i10 = (H10 >> 4) & 15;
            this.f39982d = i10;
            if (i10 == 2) {
                this.f40003a.e(new C5807s.b().s0("audio/mpeg").Q(1).t0(f39979e[(H10 >> 2) & 3]).M());
                this.f39981c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f40003a.e(new C5807s.b().s0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").Q(1).t0(8000).M());
                this.f39981c = true;
            } else if (i10 != 10) {
                throw new C6695e.a("Audio format not supported: " + this.f39982d);
            }
            this.f39980b = true;
        } else {
            b10.X(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(B b10, long j10) {
        if (this.f39982d == 2) {
            int a10 = b10.a();
            this.f40003a.a(b10, a10);
            this.f40003a.c(j10, 1, a10, 0, (O.a) null);
            return true;
        }
        int H10 = b10.H();
        if (H10 == 0 && !this.f39981c) {
            int a11 = b10.a();
            byte[] bArr = new byte[a11];
            b10.l(bArr, 0, a11);
            C6663a.b e10 = C6663a.e(bArr);
            this.f40003a.e(new C5807s.b().s0("audio/mp4a-latm").R(e10.f38813c).Q(e10.f38812b).t0(e10.f38811a).f0(Collections.singletonList(bArr)).M());
            this.f39981c = true;
            return false;
        } else if (this.f39982d == 10 && H10 != 1) {
            return false;
        } else {
            int a12 = b10.a();
            this.f40003a.a(b10, a12);
            this.f40003a.c(j10, 1, a12, 0, (O.a) null);
            return true;
        }
    }
}
