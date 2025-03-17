package h4;

import N3.C6656B;
import N3.C6665c;
import N3.C6668f;
import N3.C6669g;
import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.N;
import N3.O;
import N3.r;
import N3.u;
import Y3.C6732c;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import k4.s;
import k4.t;
import kb.C9967v;
import q3.A;
import q3.C5803n;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.H;
import t3.q;
import u3.b;
import u3.e;
import u3.g;

public class h implements C6678p {
    @Deprecated

    /* renamed from: M  reason: collision with root package name */
    public static final u f51481M = new f();

    /* renamed from: N  reason: collision with root package name */
    private static final byte[] f51482N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: O  reason: collision with root package name */
    private static final C5807s f51483O = new C5807s.b().s0("application/x-emsg").M();

    /* renamed from: A  reason: collision with root package name */
    private long f51484A;

    /* renamed from: B  reason: collision with root package name */
    private long f51485B;

    /* renamed from: C  reason: collision with root package name */
    private b f51486C;

    /* renamed from: D  reason: collision with root package name */
    private int f51487D;

    /* renamed from: E  reason: collision with root package name */
    private int f51488E;

    /* renamed from: F  reason: collision with root package name */
    private int f51489F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f51490G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f51491H;

    /* renamed from: I  reason: collision with root package name */
    private r f51492I;

    /* renamed from: J  reason: collision with root package name */
    private O[] f51493J;

    /* renamed from: K  reason: collision with root package name */
    private O[] f51494K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f51495L;

    /* renamed from: a  reason: collision with root package name */
    private final s.a f51496a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51497b;

    /* renamed from: c  reason: collision with root package name */
    private final s f51498c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C5807s> f51499d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<b> f51500e;

    /* renamed from: f  reason: collision with root package name */
    private final B f51501f;

    /* renamed from: g  reason: collision with root package name */
    private final B f51502g;

    /* renamed from: h  reason: collision with root package name */
    private final B f51503h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f51504i;

    /* renamed from: j  reason: collision with root package name */
    private final B f51505j;

    /* renamed from: k  reason: collision with root package name */
    private final H f51506k;

    /* renamed from: l  reason: collision with root package name */
    private final C6732c f51507l;

    /* renamed from: m  reason: collision with root package name */
    private final B f51508m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque<b.C0471b> f51509n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayDeque<a> f51510o;

    /* renamed from: p  reason: collision with root package name */
    private final g f51511p;

    /* renamed from: q  reason: collision with root package name */
    private final O f51512q;

    /* renamed from: r  reason: collision with root package name */
    private C9967v<N> f51513r;

    /* renamed from: s  reason: collision with root package name */
    private int f51514s;

    /* renamed from: t  reason: collision with root package name */
    private int f51515t;

    /* renamed from: u  reason: collision with root package name */
    private long f51516u;

    /* renamed from: v  reason: collision with root package name */
    private int f51517v;

    /* renamed from: w  reason: collision with root package name */
    private B f51518w;

    /* renamed from: x  reason: collision with root package name */
    private long f51519x;

    /* renamed from: y  reason: collision with root package name */
    private int f51520y;

    /* renamed from: z  reason: collision with root package name */
    private long f51521z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f51522a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f51523b;

        /* renamed from: c  reason: collision with root package name */
        public final int f51524c;

        public a(long j10, boolean z10, int i10) {
            this.f51522a = j10;
            this.f51523b = z10;
            this.f51524c = i10;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final O f51525a;

        /* renamed from: b  reason: collision with root package name */
        public final u f51526b = new u();

        /* renamed from: c  reason: collision with root package name */
        public final B f51527c = new B();

        /* renamed from: d  reason: collision with root package name */
        public v f51528d;

        /* renamed from: e  reason: collision with root package name */
        public c f51529e;

        /* renamed from: f  reason: collision with root package name */
        public int f51530f;

        /* renamed from: g  reason: collision with root package name */
        public int f51531g;

        /* renamed from: h  reason: collision with root package name */
        public int f51532h;

        /* renamed from: i  reason: collision with root package name */
        public int f51533i;

        /* renamed from: j  reason: collision with root package name */
        private final B f51534j = new B(1);

        /* renamed from: k  reason: collision with root package name */
        private final B f51535k = new B();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public boolean f51536l;

        public b(O o10, v vVar, c cVar) {
            this.f51525a = o10;
            this.f51528d = vVar;
            this.f51529e = cVar;
            j(vVar, cVar);
        }

        public int c() {
            int i10 = !this.f51536l ? this.f51528d.f51633g[this.f51530f] : this.f51526b.f51619k[this.f51530f] ? 1 : 0;
            return g() != null ? i10 | CatalogRepository.FETCH_FLAG_SDB : i10;
        }

        public long d() {
            return !this.f51536l ? this.f51528d.f51629c[this.f51530f] : this.f51526b.f51615g[this.f51532h];
        }

        public long e() {
            return !this.f51536l ? this.f51528d.f51632f[this.f51530f] : this.f51526b.c(this.f51530f);
        }

        public int f() {
            return !this.f51536l ? this.f51528d.f51630d[this.f51530f] : this.f51526b.f51617i[this.f51530f];
        }

        public t g() {
            if (!this.f51536l) {
                return null;
            }
            int i10 = ((c) t3.N.i(this.f51526b.f51609a)).f51469a;
            t tVar = this.f51526b.f51622n;
            if (tVar == null) {
                tVar = this.f51528d.f51627a.b(i10);
            }
            if (tVar == null || !tVar.f51604a) {
                return null;
            }
            return tVar;
        }

        public boolean h() {
            this.f51530f++;
            if (!this.f51536l) {
                return false;
            }
            int i10 = this.f51531g + 1;
            this.f51531g = i10;
            int[] iArr = this.f51526b.f51616h;
            int i11 = this.f51532h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f51532h = i11 + 1;
            this.f51531g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            B b10;
            t g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i12 = g10.f51607d;
            if (i12 != 0) {
                b10 = this.f51526b.f51623o;
            } else {
                byte[] bArr = (byte[]) t3.N.i(g10.f51608e);
                this.f51535k.U(bArr, bArr.length);
                B b11 = this.f51535k;
                i12 = bArr.length;
                b10 = b11;
            }
            boolean g11 = this.f51526b.g(this.f51530f);
            boolean z10 = g11 || i11 != 0;
            this.f51534j.e()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f51534j.W(0);
            this.f51525a.b(this.f51534j, 1, 1);
            this.f51525a.b(b10, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!g11) {
                this.f51527c.S(8);
                byte[] e10 = this.f51527c.e();
                e10[0] = 0;
                e10[1] = 1;
                e10[2] = (byte) ((i11 >> 8) & 255);
                e10[3] = (byte) (i11 & 255);
                e10[4] = (byte) ((i10 >> 24) & 255);
                e10[5] = (byte) ((i10 >> 16) & 255);
                e10[6] = (byte) ((i10 >> 8) & 255);
                e10[7] = (byte) (i10 & 255);
                this.f51525a.b(this.f51527c, 8, 1);
                return i12 + 9;
            }
            B b12 = this.f51526b.f51623o;
            int P10 = b12.P();
            b12.X(-2);
            int i13 = (P10 * 6) + 2;
            if (i11 != 0) {
                this.f51527c.S(i13);
                byte[] e11 = this.f51527c.e();
                b12.l(e11, 0, i13);
                int i14 = (((e11[2] & 255) << 8) | (e11[3] & 255)) + i11;
                e11[2] = (byte) ((i14 >> 8) & 255);
                e11[3] = (byte) (i14 & 255);
                b12 = this.f51527c;
            }
            this.f51525a.b(b12, i13, 1);
            return i12 + 1 + i13;
        }

        public void j(v vVar, c cVar) {
            this.f51528d = vVar;
            this.f51529e = cVar;
            this.f51525a.e(vVar.f51627a.f51598g);
            k();
        }

        public void k() {
            this.f51526b.f();
            this.f51530f = 0;
            this.f51532h = 0;
            this.f51531g = 0;
            this.f51533i = 0;
            this.f51536l = false;
        }

        public void l(long j10) {
            int i10 = this.f51530f;
            while (true) {
                u uVar = this.f51526b;
                if (i10 < uVar.f51614f && uVar.c(i10) <= j10) {
                    if (this.f51526b.f51619k[i10]) {
                        this.f51533i = i10;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        public void m() {
            t g10 = g();
            if (g10 != null) {
                B b10 = this.f51526b.f51623o;
                int i10 = g10.f51607d;
                if (i10 != 0) {
                    b10.X(i10);
                }
                if (this.f51526b.g(this.f51530f)) {
                    b10.X(b10.P() * 6);
                }
            }
        }

        public void n(C5803n nVar) {
            t b10 = this.f51528d.f51627a.b(((c) t3.N.i(this.f51526b.f51609a)).f51469a);
            this.f51525a.e(this.f51528d.f51627a.f51598g.b().X(nVar.b(b10 != null ? b10.f51605b : null)).M());
        }
    }

    public h(s.a aVar, int i10) {
        this(aVar, i10, (H) null, (s) null, C9967v.E(), (O) null);
    }

    private static void A(b.C0471b bVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = bVar.f30069d.size();
        for (int i11 = 0; i11 < size; i11++) {
            b.C0471b bVar2 = bVar.f30069d.get(i11);
            if (bVar2.f30066a == 1953653094) {
                J(bVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void B(B b10, u uVar) {
        b10.W(8);
        int q10 = b10.q();
        if ((C7925b.l(q10) & 1) == 1) {
            b10.X(8);
        }
        int L10 = b10.L();
        if (L10 == 1) {
            uVar.f51612d += C7925b.m(q10) == 0 ? b10.J() : b10.O();
            return;
        }
        throw q3.B.a("Unexpected saio entry count: " + L10, (Throwable) null);
    }

    private static void C(t tVar, B b10, u uVar) {
        int i10;
        int i11 = tVar.f51607d;
        b10.W(8);
        boolean z10 = true;
        if ((C7925b.l(b10.q()) & 1) == 1) {
            b10.X(8);
        }
        int H10 = b10.H();
        int L10 = b10.L();
        if (L10 <= uVar.f51614f) {
            if (H10 == 0) {
                boolean[] zArr = uVar.f51621m;
                i10 = 0;
                for (int i12 = 0; i12 < L10; i12++) {
                    int H11 = b10.H();
                    i10 += H11;
                    zArr[i12] = H11 > i11;
                }
            } else {
                if (H10 <= i11) {
                    z10 = false;
                }
                i10 = H10 * L10;
                Arrays.fill(uVar.f51621m, 0, L10, z10);
            }
            Arrays.fill(uVar.f51621m, L10, uVar.f51614f, false);
            if (i10 > 0) {
                uVar.d(i10);
                return;
            }
            return;
        }
        throw q3.B.a("Saiz sample count " + L10 + " is greater than fragment sample count" + uVar.f51614f, (Throwable) null);
    }

    private static void D(b.C0471b bVar, String str, u uVar) {
        b.C0471b bVar2 = bVar;
        u uVar2 = uVar;
        byte[] bArr = null;
        B b10 = null;
        B b11 = null;
        for (int i10 = 0; i10 < bVar2.f30068c.size(); i10++) {
            b.c cVar = bVar2.f30068c.get(i10);
            B b12 = cVar.f30070b;
            int i11 = cVar.f30066a;
            if (i11 == 1935828848) {
                b12.W(12);
                if (b12.q() == 1936025959) {
                    b10 = b12;
                }
            } else if (i11 == 1936158820) {
                b12.W(12);
                if (b12.q() == 1936025959) {
                    b11 = b12;
                }
            }
        }
        if (b10 != null && b11 != null) {
            b10.W(8);
            int m10 = C7925b.m(b10.q());
            b10.X(4);
            if (m10 == 1) {
                b10.X(4);
            }
            if (b10.q() == 1) {
                b11.W(8);
                int m11 = C7925b.m(b11.q());
                b11.X(4);
                if (m11 == 1) {
                    if (b11.J() == 0) {
                        throw q3.B.c("Variable length description in sgpd found (unsupported)");
                    }
                } else if (m11 >= 2) {
                    b11.X(4);
                }
                if (b11.J() == 1) {
                    b11.X(1);
                    int H10 = b11.H();
                    int i12 = (H10 & 240) >> 4;
                    int i13 = H10 & 15;
                    boolean z10 = b11.H() == 1;
                    if (z10) {
                        int H11 = b11.H();
                        byte[] bArr2 = new byte[16];
                        b11.l(bArr2, 0, 16);
                        if (H11 == 0) {
                            int H12 = b11.H();
                            bArr = new byte[H12];
                            b11.l(bArr, 0, H12);
                        }
                        uVar2.f51620l = true;
                        uVar2.f51622n = new t(z10, str, H11, bArr2, i12, i13, bArr);
                        return;
                    }
                    return;
                }
                throw q3.B.c("Entry count in sgpd != 1 (unsupported).");
            }
            throw q3.B.c("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static void E(B b10, int i10, u uVar) {
        b10.W(i10 + 8);
        int l10 = C7925b.l(b10.q());
        if ((l10 & 1) == 0) {
            boolean z10 = (l10 & 2) != 0;
            int L10 = b10.L();
            if (L10 == 0) {
                Arrays.fill(uVar.f51621m, 0, uVar.f51614f, false);
            } else if (L10 == uVar.f51614f) {
                Arrays.fill(uVar.f51621m, 0, L10, z10);
                uVar.d(b10.a());
                uVar.b(b10);
            } else {
                throw q3.B.a("Senc sample count " + L10 + " is different from fragment sample count" + uVar.f51614f, (Throwable) null);
            }
        } else {
            throw q3.B.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    private static void F(B b10, u uVar) {
        E(b10, 0, uVar);
    }

    private static Pair<Long, C6669g> G(B b10, long j10) {
        long O10;
        long O11;
        B b11 = b10;
        b11.W(8);
        int m10 = C7925b.m(b10.q());
        b11.X(4);
        long J10 = b10.J();
        if (m10 == 0) {
            O10 = b10.J();
            O11 = b10.J();
        } else {
            O10 = b10.O();
            O11 = b10.O();
        }
        long j11 = O10;
        long j12 = j10 + O11;
        long Z02 = t3.N.Z0(j11, 1000000, J10);
        b11.X(2);
        int P10 = b10.P();
        int[] iArr = new int[P10];
        long[] jArr = new long[P10];
        long[] jArr2 = new long[P10];
        long[] jArr3 = new long[P10];
        long j13 = Z02;
        long j14 = j11;
        int i10 = 0;
        long j15 = j14;
        while (i10 < P10) {
            int q10 = b10.q();
            if ((q10 & Integer.MIN_VALUE) == 0) {
                long J11 = b10.J();
                iArr[i10] = q10 & Integer.MAX_VALUE;
                jArr[i10] = j12;
                jArr3[i10] = j13;
                long j16 = j15 + J11;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i11 = P10;
                int[] iArr2 = iArr;
                long Z03 = t3.N.Z0(j16, 1000000, J10);
                jArr4[i10] = Z03 - jArr5[i10];
                b11.X(4);
                j12 += (long) iArr2[i10];
                i10++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                P10 = i11;
                long j17 = Z03;
                j15 = j16;
                j13 = j17;
            } else {
                throw q3.B.a("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(Z02), new C6669g(iArr, jArr, jArr2, jArr3));
    }

    private static long H(B b10) {
        b10.W(8);
        return C7925b.m(b10.q()) == 1 ? b10.O() : b10.J();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.util.SparseArray<h4.h$b>, android.util.SparseArray] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static h4.h.b I(t3.B r4, android.util.SparseArray<h4.h.b> r5, boolean r6) {
        /*
            r0 = 8
            r4.W(r0)
            int r0 = r4.q()
            int r0 = h4.C7925b.l(r0)
            int r1 = r4.q()
            if (r6 == 0) goto L_0x001b
            r6 = 0
            java.lang.Object r5 = r5.valueAt(r6)
        L_0x0018:
            h4.h$b r5 = (h4.h.b) r5
            goto L_0x0020
        L_0x001b:
            java.lang.Object r5 = r5.get(r1)
            goto L_0x0018
        L_0x0020:
            if (r5 != 0) goto L_0x0024
            r4 = 0
            return r4
        L_0x0024:
            r6 = r0 & 1
            if (r6 == 0) goto L_0x0032
            long r1 = r4.O()
            h4.u r6 = r5.f51526b
            r6.f51611c = r1
            r6.f51612d = r1
        L_0x0032:
            h4.c r6 = r5.f51529e
            r1 = r0 & 2
            if (r1 == 0) goto L_0x003f
            int r1 = r4.q()
            int r1 = r1 + -1
            goto L_0x0041
        L_0x003f:
            int r1 = r6.f51469a
        L_0x0041:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x004a
            int r2 = r4.q()
            goto L_0x004c
        L_0x004a:
            int r2 = r6.f51470b
        L_0x004c:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x0055
            int r3 = r4.q()
            goto L_0x0057
        L_0x0055:
            int r3 = r6.f51471c
        L_0x0057:
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0060
            int r4 = r4.q()
            goto L_0x0062
        L_0x0060:
            int r4 = r6.f51472d
        L_0x0062:
            h4.u r6 = r5.f51526b
            h4.c r0 = new h4.c
            r0.<init>(r1, r2, r3, r4)
            r6.f51609a = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.I(t3.B, android.util.SparseArray, boolean):h4.h$b");
    }

    private static void J(b.C0471b bVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        b I10 = I(((b.c) C5950a.e(bVar.e(1952868452))).f30070b, sparseArray, z10);
        if (I10 != null) {
            u uVar = I10.f51526b;
            long j10 = uVar.f51625q;
            boolean z11 = uVar.f51626r;
            I10.k();
            boolean unused = I10.f51536l = true;
            b.c e10 = bVar.e(1952867444);
            if (e10 == null || (i10 & 2) != 0) {
                uVar.f51625q = j10;
                uVar.f51626r = z11;
            } else {
                uVar.f51625q = H(e10.f30070b);
                uVar.f51626r = true;
            }
            M(bVar, I10, i10);
            t b10 = I10.f51528d.f51627a.b(((c) C5950a.e(uVar.f51609a)).f51469a);
            b.c e11 = bVar.e(1935763834);
            if (e11 != null) {
                C((t) C5950a.e(b10), e11.f30070b, uVar);
            }
            b.c e12 = bVar.e(1935763823);
            if (e12 != null) {
                B(e12.f30070b, uVar);
            }
            b.c e13 = bVar.e(1936027235);
            if (e13 != null) {
                F(e13.f30070b, uVar);
            }
            D(bVar, b10 != null ? b10.f51605b : null, uVar);
            int size = bVar.f30068c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b.c cVar = bVar.f30068c.get(i11);
                if (cVar.f30066a == 1970628964) {
                    N(cVar.f30070b, uVar, bArr);
                }
            }
        }
    }

    private static Pair<Integer, c> K(B b10) {
        b10.W(12);
        return Pair.create(Integer.valueOf(b10.q()), new c(b10.q() - 1, b10.q(), b10.q(), b10.q()));
    }

    private static int L(b bVar, int i10, int i11, B b10, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        b bVar2 = bVar;
        b10.W(8);
        int l10 = C7925b.l(b10.q());
        s sVar = bVar2.f51528d.f51627a;
        u uVar = bVar2.f51526b;
        c cVar = (c) t3.N.i(uVar.f51609a);
        uVar.f51616h[i10] = b10.L();
        long[] jArr = uVar.f51615g;
        long j10 = uVar.f51611c;
        jArr[i10] = j10;
        if ((l10 & 1) != 0) {
            jArr[i10] = j10 + ((long) b10.q());
        }
        boolean z15 = (l10 & 4) != 0;
        int i16 = cVar.f51472d;
        if (z15) {
            i16 = b10.q();
        }
        boolean z16 = (l10 & 256) != 0;
        boolean z17 = (l10 & 512) != 0;
        boolean z18 = (l10 & 1024) != 0;
        boolean z19 = (l10 & RecyclerView.n.FLAG_MOVED) != 0;
        long j11 = p(sVar) ? ((long[]) t3.N.i(sVar.f51601j))[0] : 0;
        int[] iArr = uVar.f51617i;
        long[] jArr2 = uVar.f51618j;
        boolean[] zArr = uVar.f51619k;
        int i17 = i16;
        boolean z20 = sVar.f51593b == 2 && (i11 & 1) != 0;
        int i18 = i12 + uVar.f51616h[i10];
        boolean z21 = z20;
        long[] jArr3 = jArr2;
        boolean[] zArr2 = zArr;
        long j12 = sVar.f51594c;
        long j13 = uVar.f51625q;
        int i19 = i12;
        while (i19 < i18) {
            int f10 = f(z16 ? b10.q() : cVar.f51470b);
            if (z17) {
                i13 = b10.q();
                z10 = z16;
            } else {
                z10 = z16;
                i13 = cVar.f51471c;
            }
            int f11 = f(i13);
            if (z18) {
                z11 = z15;
                i14 = b10.q();
            } else if (i19 != 0 || !z15) {
                z11 = z15;
                i14 = cVar.f51472d;
            } else {
                z11 = z15;
                i14 = i17;
            }
            if (z19) {
                z14 = z19;
                z13 = z17;
                z12 = z18;
                i15 = b10.q();
            } else {
                z14 = z19;
                z13 = z17;
                z12 = z18;
                i15 = 0;
            }
            long Z02 = t3.N.Z0((((long) i15) + j13) - j11, 1000000, j12);
            jArr3[i19] = Z02;
            if (!uVar.f51626r) {
                jArr3[i19] = Z02 + bVar2.f51528d.f51634h;
            }
            iArr[i19] = f11;
            zArr2[i19] = ((i14 >> 16) & 1) == 0 && (!z21 || i19 == 0);
            j13 += (long) f10;
            i19++;
            bVar2 = bVar;
            z16 = z10;
            z15 = z11;
            z19 = z14;
            z17 = z13;
            z18 = z12;
        }
        uVar.f51625q = j13;
        return i18;
    }

    private static void M(b.C0471b bVar, b bVar2, int i10) {
        List<b.c> list = bVar.f30068c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            b.c cVar = list.get(i13);
            if (cVar.f30066a == 1953658222) {
                B b10 = cVar.f30070b;
                b10.W(12);
                int L10 = b10.L();
                if (L10 > 0) {
                    i12 += L10;
                    i11++;
                }
            }
        }
        bVar2.f51532h = 0;
        bVar2.f51531g = 0;
        bVar2.f51530f = 0;
        bVar2.f51526b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            b.c cVar2 = list.get(i16);
            if (cVar2.f30066a == 1953658222) {
                i15 = L(bVar2, i14, i10, cVar2.f30070b, i15);
                i14++;
            }
        }
    }

    private static void N(B b10, u uVar, byte[] bArr) {
        b10.W(8);
        b10.l(bArr, 0, 16);
        if (Arrays.equals(bArr, f51482N)) {
            E(b10, 16, uVar);
        }
    }

    private void O(long j10) {
        while (!this.f51509n.isEmpty() && this.f51509n.peek().f30067b == j10) {
            t(this.f51509n.pop());
        }
        g();
    }

    private boolean P(C6679q qVar) {
        if (this.f51517v == 0) {
            if (!qVar.g(this.f51508m.e(), 0, 8, true)) {
                return false;
            }
            this.f51517v = 8;
            this.f51508m.W(0);
            this.f51516u = this.f51508m.J();
            this.f51515t = this.f51508m.q();
        }
        long j10 = this.f51516u;
        if (j10 == 1) {
            qVar.readFully(this.f51508m.e(), 8, 8);
            this.f51517v += 8;
            this.f51516u = this.f51508m.O();
        } else if (j10 == 0) {
            long length = qVar.getLength();
            if (length == -1 && !this.f51509n.isEmpty()) {
                length = this.f51509n.peek().f30067b;
            }
            if (length != -1) {
                this.f51516u = (length - qVar.getPosition()) + ((long) this.f51517v);
            }
        }
        if (this.f51516u >= ((long) this.f51517v)) {
            long position = qVar.getPosition() - ((long) this.f51517v);
            int i10 = this.f51515t;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.f51495L) {
                this.f51492I.n(new J.b(this.f51484A, position));
                this.f51495L = true;
            }
            if (this.f51515t == 1836019558) {
                int size = this.f51500e.size();
                for (int i11 = 0; i11 < size; i11++) {
                    u uVar = this.f51500e.valueAt(i11).f51526b;
                    uVar.f51610b = position;
                    uVar.f51612d = position;
                    uVar.f51611c = position;
                }
            }
            int i12 = this.f51515t;
            if (i12 == 1835295092) {
                this.f51486C = null;
                this.f51519x = position + this.f51516u;
                this.f51514s = 2;
                return true;
            }
            if (T(i12)) {
                long position2 = (qVar.getPosition() + this.f51516u) - 8;
                this.f51509n.push(new b.C0471b(this.f51515t, position2));
                if (this.f51516u == ((long) this.f51517v)) {
                    O(position2);
                } else {
                    g();
                }
            } else if (U(this.f51515t)) {
                if (this.f51517v != 8) {
                    throw q3.B.c("Leaf atom defines extended atom size (unsupported).");
                } else if (this.f51516u <= 2147483647L) {
                    B b10 = new B((int) this.f51516u);
                    System.arraycopy(this.f51508m.e(), 0, b10.e(), 0, 8);
                    this.f51518w = b10;
                    this.f51514s = 1;
                } else {
                    throw q3.B.c("Leaf atom with length > 2147483647 (unsupported).");
                }
            } else if (this.f51516u <= 2147483647L) {
                this.f51518w = null;
                this.f51514s = 1;
            } else {
                throw q3.B.c("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw q3.B.c("Atom size less than header length (unsupported).");
    }

    private void Q(C6679q qVar) {
        int i10 = ((int) this.f51516u) - this.f51517v;
        B b10 = this.f51518w;
        if (b10 != null) {
            qVar.readFully(b10.e(), 8, i10);
            v(new b.c(this.f51515t, b10), qVar.getPosition());
        } else {
            qVar.k(i10);
        }
        O(qVar.getPosition());
    }

    private void R(C6679q qVar) {
        int size = this.f51500e.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = this.f51500e.valueAt(i10).f51526b;
            if (uVar.f51624p) {
                long j11 = uVar.f51612d;
                if (j11 < j10) {
                    bVar = this.f51500e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f51514s = 3;
            return;
        }
        int position = (int) (j10 - qVar.getPosition());
        if (position >= 0) {
            qVar.k(position);
            bVar.f51526b.a(qVar);
            return;
        }
        throw q3.B.a("Offset to encryption data was negative.", (Throwable) null);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v8 */
    private boolean S(C6679q qVar) {
        boolean z10;
        int i10;
        int i11;
        C6679q qVar2 = qVar;
        b bVar = this.f51486C;
        boolean z11 = false;
        if (bVar == null) {
            bVar = m(this.f51500e);
            if (bVar == null) {
                int position = (int) (this.f51519x - qVar.getPosition());
                if (position >= 0) {
                    qVar2.k(position);
                    g();
                    return false;
                }
                throw q3.B.a("Offset to end of mdat was negative.", (Throwable) null);
            }
            int d10 = (int) (bVar.d() - qVar.getPosition());
            if (d10 < 0) {
                q.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d10 = 0;
            }
            qVar2.k(d10);
            this.f51486C = bVar;
        }
        int i12 = 4;
        ? r92 = 1;
        if (this.f51514s == 3) {
            this.f51487D = bVar.f();
            this.f51490G = (this.f51497b & 64) == 0 || !Objects.equals(bVar.f51528d.f51627a.f51598g.f28244o, "video/avc");
            if (bVar.f51530f < bVar.f51533i) {
                qVar2.k(this.f51487D);
                bVar.m();
                if (!bVar.h()) {
                    this.f51486C = null;
                }
                this.f51514s = 3;
                return true;
            }
            if (bVar.f51528d.f51627a.f51599h == 1) {
                this.f51487D -= 8;
                qVar2.k(8);
            }
            if ("audio/ac4".equals(bVar.f51528d.f51627a.f51598g.f28244o)) {
                this.f51488E = bVar.i(this.f51487D, 7);
                C6665c.a(this.f51487D, this.f51505j);
                bVar.f51525a.a(this.f51505j, 7);
                this.f51488E += 7;
            } else {
                this.f51488E = bVar.i(this.f51487D, 0);
            }
            this.f51487D += this.f51488E;
            this.f51514s = 4;
            this.f51489F = 0;
        }
        s sVar = bVar.f51528d.f51627a;
        O o10 = bVar.f51525a;
        long e10 = bVar.e();
        H h10 = this.f51506k;
        if (h10 != null) {
            e10 = h10.a(e10);
        }
        long j10 = e10;
        if (sVar.f51602k == 0) {
            while (true) {
                int i13 = this.f51488E;
                int i14 = this.f51487D;
                if (i13 >= i14) {
                    break;
                }
                this.f51488E += o10.d(qVar2, i14 - i13, false);
            }
        } else {
            byte[] e11 = this.f51502g.e();
            e11[0] = 0;
            e11[1] = 0;
            e11[2] = 0;
            int i15 = sVar.f51602k;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.f51488E < this.f51487D) {
                int i18 = this.f51489F;
                if (i18 == 0) {
                    qVar2.readFully(e11, i17, i16);
                    this.f51502g.W(z11);
                    int q10 = this.f51502g.q();
                    if (q10 >= r92) {
                        this.f51489F = q10 - 1;
                        this.f51501f.W(z11);
                        o10.a(this.f51501f, i12);
                        o10.a(this.f51502g, r92);
                        this.f51491H = (this.f51494K.length <= 0 || !e.l(sVar.f51598g, e11[i12])) ? z11 : r92;
                        this.f51488E += 5;
                        this.f51487D += i17;
                        if (!this.f51490G && Objects.equals(bVar.f51528d.f51627a.f51598g.f28244o, "video/avc") && e.k(e11[i12])) {
                            this.f51490G = r92;
                        }
                        z10 = r92;
                    } else {
                        throw q3.B.a("Invalid NAL length", (Throwable) null);
                    }
                } else {
                    if (this.f51491H) {
                        this.f51503h.S(i18);
                        qVar2.readFully(this.f51503h.e(), z11 ? 1 : 0, this.f51489F);
                        o10.a(this.f51503h, this.f51489F);
                        i11 = this.f51489F;
                        int I10 = e.I(this.f51503h.e(), this.f51503h.g());
                        this.f51503h.W((Objects.equals(sVar.f51598g.f28244o, "video/hevc") || A.b(sVar.f51598g.f28240k, "video/hevc")) ? 1 : 0);
                        this.f51503h.V(I10);
                        if (sVar.f51598g.f28246q != -1) {
                            int e12 = this.f51511p.e();
                            int i19 = sVar.f51598g.f28246q;
                            if (e12 != i19) {
                                this.f51511p.f(i19);
                            }
                        } else if (this.f51511p.e() != 0) {
                            this.f51511p.f(0);
                        }
                        this.f51511p.a(j10, this.f51503h);
                        i10 = 4;
                        if ((bVar.c() & 4) != 0) {
                            this.f51511p.c();
                        }
                    } else {
                        i10 = i12;
                        i11 = o10.d(qVar2, i18, z11);
                    }
                    this.f51488E += i11;
                    this.f51489F -= i11;
                    i12 = i10;
                    z11 = false;
                    z10 = true;
                }
                r92 = z10;
            }
        }
        int c10 = bVar.c();
        if ((this.f51497b & 64) != 0 && !this.f51490G) {
            c10 |= 67108864;
        }
        int i20 = c10;
        t g10 = bVar.g();
        o10.c(j10, i20, this.f51487D, 0, g10 != null ? g10.f51606c : null);
        y(j10);
        if (!bVar.h()) {
            this.f51486C = null;
        }
        this.f51514s = 3;
        return true;
    }

    private static boolean T(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean U(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static int f(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw q3.B.a("Unexpected negative value: " + i10, (Throwable) null);
    }

    private void g() {
        this.f51514s = 0;
        this.f51517v = 0;
    }

    private c k(SparseArray<c> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (c) C5950a.e(sparseArray.get(i10));
    }

    private static C5803n l(List<b.c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            b.c cVar = list.get(i10);
            if (cVar.f30066a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] e10 = cVar.f30070b.e();
                UUID f10 = o.f(e10);
                if (f10 == null) {
                    q.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C5803n.b(f10, "video/mp4", e10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C5803n((List<C5803n.b>) arrayList);
    }

    private static b m(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f51536l || valueAt.f51530f != valueAt.f51528d.f51628b) && (!valueAt.f51536l || valueAt.f51532h != valueAt.f51526b.f51613e)) {
                long d10 = valueAt.d();
                if (d10 < j10) {
                    bVar = valueAt;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    private void o() {
        int i10;
        O[] oArr = new O[2];
        this.f51493J = oArr;
        O o10 = this.f51512q;
        int i11 = 0;
        if (o10 != null) {
            oArr[0] = o10;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f51497b & 4) != 0) {
            oArr[i10] = this.f51492I.t(100, 5);
            i12 = CheckoutActivity.RESULT_CANCELED;
            i10++;
        }
        O[] oArr2 = (O[]) t3.N.U0(this.f51493J, i10);
        this.f51493J = oArr2;
        for (O e10 : oArr2) {
            e10.e(f51483O);
        }
        this.f51494K = new O[this.f51499d.size()];
        while (i11 < this.f51494K.length) {
            O t10 = this.f51492I.t(i12, 3);
            t10.e(this.f51499d.get(i11));
            this.f51494K[i11] = t10;
            i11++;
            i12++;
        }
    }

    private static boolean p(s sVar) {
        long[] jArr = sVar.f51600i;
        if (jArr == null || jArr.length != 1 || sVar.f51601j == null) {
            return false;
        }
        long j10 = jArr[0];
        if (j10 == 0) {
            return true;
        }
        return t3.N.Z0(j10, 1000000, sVar.f51595d) + t3.N.Z0(sVar.f51601j[0], 1000000, sVar.f51594c) >= sVar.f51596e;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(long j10, B b10) {
        C6668f.a(j10, b10, this.f51494K);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] r() {
        return new C6678p[]{new h(s.a.f54127a, 32)};
    }

    private void t(b.C0471b bVar) {
        int i10 = bVar.f30066a;
        if (i10 == 1836019574) {
            x(bVar);
        } else if (i10 == 1836019558) {
            w(bVar);
        } else if (!this.f51509n.isEmpty()) {
            this.f51509n.peek().b(bVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void u(t3.B r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            N3.O[] r2 = r0.f51493J
            int r2 = r2.length
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            r2 = 8
            r1.W(r2)
            int r2 = r28.q()
            int r2 = h4.C7925b.m(r2)
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0074
            if (r2 == r3) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentedMp4Extractor"
            t3.q.h(r2, r1)
            return
        L_0x0038:
            long r12 = r28.J()
            long r6 = r28.O()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            long r14 = t3.N.Z0(r6, r8, r10)
            long r6 = r28.J()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = t3.N.Z0(r6, r8, r10)
            long r8 = r28.J()
            java.lang.String r2 = r28.B()
            java.lang.Object r2 = t3.C5950a.e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r10 = r28.B()
            java.lang.Object r10 = t3.C5950a.e(r10)
            java.lang.String r10 = (java.lang.String) r10
            r20 = r2
            r22 = r6
            r24 = r8
            r21 = r10
            r8 = r4
            goto L_0x00be
        L_0x0074:
            java.lang.String r2 = r28.B()
            java.lang.Object r2 = t3.C5950a.e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r28.B()
            java.lang.Object r6 = t3.C5950a.e(r6)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            long r6 = r28.J()
            long r11 = r28.J()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r6
            long r8 = t3.N.Z0(r11, r13, r15)
            long r11 = r0.f51485B
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00a3
            long r11 = r11 + r8
            r17 = r11
            goto L_0x00a5
        L_0x00a3:
            r17 = r4
        L_0x00a5:
            long r11 = r28.J()
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = r6
            long r6 = t3.N.Z0(r11, r13, r15)
            long r11 = r28.J()
            r20 = r2
            r22 = r6
            r21 = r10
            r24 = r11
            r14 = r17
        L_0x00be:
            int r2 = r28.a()
            byte[] r2 = new byte[r2]
            int r6 = r28.a()
            r7 = 0
            r1.l(r2, r7, r6)
            Y3.a r1 = new Y3.a
            r19 = r1
            r26 = r2
            r19.<init>(r20, r21, r22, r24, r26)
            t3.B r2 = new t3.B
            Y3.c r6 = r0.f51507l
            byte[] r1 = r6.a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.a()
            N3.O[] r6 = r0.f51493J
            int r10 = r6.length
            r11 = r7
        L_0x00e8:
            if (r11 >= r10) goto L_0x00f5
            r12 = r6[r11]
            r2.W(r7)
            r12.a(r2, r1)
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f5:
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0109
            java.util.ArrayDeque<h4.h$a> r2 = r0.f51510o
            h4.h$a r4 = new h4.h$a
            r4.<init>(r8, r3, r1)
            r2.addLast(r4)
            int r2 = r0.f51520y
            int r2 = r2 + r1
            r0.f51520y = r2
            goto L_0x015a
        L_0x0109:
            java.util.ArrayDeque<h4.h$a> r2 = r0.f51510o
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0121
            java.util.ArrayDeque<h4.h$a> r2 = r0.f51510o
            h4.h$a r3 = new h4.h$a
            r3.<init>(r14, r7, r1)
            r2.addLast(r3)
            int r2 = r0.f51520y
            int r2 = r2 + r1
            r0.f51520y = r2
            goto L_0x015a
        L_0x0121:
            t3.H r2 = r0.f51506k
            if (r2 == 0) goto L_0x013b
            boolean r2 = r2.g()
            if (r2 != 0) goto L_0x013b
            java.util.ArrayDeque<h4.h$a> r2 = r0.f51510o
            h4.h$a r3 = new h4.h$a
            r3.<init>(r14, r7, r1)
            r2.addLast(r3)
            int r2 = r0.f51520y
            int r2 = r2 + r1
            r0.f51520y = r2
            goto L_0x015a
        L_0x013b:
            t3.H r2 = r0.f51506k
            if (r2 == 0) goto L_0x0143
            long r14 = r2.a(r14)
        L_0x0143:
            N3.O[] r2 = r0.f51493J
            int r3 = r2.length
        L_0x0146:
            if (r7 >= r3) goto L_0x015a
            r16 = r2[r7]
            r21 = 0
            r22 = 0
            r19 = 1
            r17 = r14
            r20 = r1
            r16.c(r17, r19, r20, r21, r22)
            int r7 = r7 + 1
            goto L_0x0146
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.u(t3.B):void");
    }

    private void v(b.c cVar, long j10) {
        if (!this.f51509n.isEmpty()) {
            this.f51509n.peek().c(cVar);
            return;
        }
        int i10 = cVar.f30066a;
        if (i10 == 1936286840) {
            Pair<Long, C6669g> G10 = G(cVar.f30070b, j10);
            this.f51485B = ((Long) G10.first).longValue();
            this.f51492I.n((J) G10.second);
            this.f51495L = true;
        } else if (i10 == 1701671783) {
            u(cVar.f30070b);
        }
    }

    private void w(b.C0471b bVar) {
        A(bVar, this.f51500e, this.f51498c != null, this.f51497b, this.f51504i);
        C5803n l10 = l(bVar.f30068c);
        if (l10 != null) {
            int size = this.f51500e.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f51500e.valueAt(i10).n(l10);
            }
        }
        if (this.f51521z != -9223372036854775807L) {
            int size2 = this.f51500e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f51500e.valueAt(i11).l(this.f51521z);
            }
            this.f51521z = -9223372036854775807L;
        }
    }

    private void x(b.C0471b bVar) {
        int i10 = 0;
        boolean z10 = true;
        C5950a.h(this.f51498c == null, "Unexpected moov box.");
        C5803n l10 = l(bVar.f30068c);
        b.C0471b bVar2 = (b.C0471b) C5950a.e(bVar.d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = bVar2.f30068c.size();
        long j10 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            b.c cVar = bVar2.f30068c.get(i11);
            int i12 = cVar.f30066a;
            if (i12 == 1953654136) {
                Pair<Integer, c> K10 = K(cVar.f30070b);
                sparseArray.put(((Integer) K10.first).intValue(), (c) K10.second);
            } else if (i12 == 1835362404) {
                j10 = z(cVar.f30070b);
            }
        }
        List<v> D10 = C7925b.D(bVar, new C6656B(), j10, l10, (this.f51497b & 16) != 0, false, new e(this));
        int size2 = D10.size();
        if (this.f51500e.size() == 0) {
            while (i10 < size2) {
                v vVar = D10.get(i10);
                s sVar = vVar.f51627a;
                this.f51500e.put(sVar.f51592a, new b(this.f51492I.t(i10, sVar.f51593b), vVar, k(sparseArray, sVar.f51592a)));
                this.f51484A = Math.max(this.f51484A, sVar.f51596e);
                i10++;
            }
            this.f51492I.r();
            return;
        }
        if (this.f51500e.size() != size2) {
            z10 = false;
        }
        C5950a.g(z10);
        while (i10 < size2) {
            v vVar2 = D10.get(i10);
            s sVar2 = vVar2.f51627a;
            this.f51500e.get(sVar2.f51592a).j(vVar2, k(sparseArray, sVar2.f51592a));
            i10++;
        }
    }

    private void y(long j10) {
        while (!this.f51510o.isEmpty()) {
            a removeFirst = this.f51510o.removeFirst();
            this.f51520y -= removeFirst.f51524c;
            long j11 = removeFirst.f51522a;
            if (removeFirst.f51523b) {
                j11 += j10;
            }
            H h10 = this.f51506k;
            if (h10 != null) {
                j11 = h10.a(j11);
            }
            for (O c10 : this.f51493J) {
                c10.c(j11, 1, removeFirst.f51524c, this.f51520y, (O.a) null);
            }
        }
    }

    private static long z(B b10) {
        b10.W(8);
        return C7925b.m(b10.q()) == 0 ? b10.J() : b10.O();
    }

    public void a(long j10, long j11) {
        int size = this.f51500e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f51500e.valueAt(i10).k();
        }
        this.f51510o.clear();
        this.f51520y = 0;
        this.f51511p.c();
        this.f51521z = j11;
        this.f51509n.clear();
        g();
    }

    public void b(r rVar) {
        if ((this.f51497b & 32) == 0) {
            rVar = new t(rVar, this.f51496a);
        }
        this.f51492I = rVar;
        g();
        o();
        s sVar = this.f51498c;
        if (sVar != null) {
            this.f51500e.put(0, new b(this.f51492I.t(0, sVar.f51593b), new v(this.f51498c, new long[0], new int[0], 0, new long[0], new int[0], 0), new c(0, 0, 0, 0)));
            this.f51492I.r();
        }
    }

    public boolean h(C6679q qVar) {
        N b10 = r.b(qVar);
        this.f51513r = b10 != null ? C9967v.F(b10) : C9967v.E();
        return b10 == null;
    }

    public int j(C6679q qVar, I i10) {
        while (true) {
            int i11 = this.f51514s;
            if (i11 != 0) {
                if (i11 == 1) {
                    Q(qVar);
                } else if (i11 == 2) {
                    R(qVar);
                } else if (S(qVar)) {
                    return 0;
                }
            } else if (!P(qVar)) {
                this.f51511p.c();
                return -1;
            }
        }
    }

    /* renamed from: n */
    public C9967v<N> i() {
        return this.f51513r;
    }

    public void release() {
    }

    /* access modifiers changed from: protected */
    public s s(s sVar) {
        return sVar;
    }

    public h(s.a aVar, int i10, H h10, s sVar, List<C5807s> list, O o10) {
        this.f51496a = aVar;
        this.f51497b = i10;
        this.f51506k = h10;
        this.f51498c = sVar;
        this.f51499d = Collections.unmodifiableList(list);
        this.f51512q = o10;
        this.f51507l = new C6732c();
        this.f51508m = new B(16);
        this.f51501f = new B(e.f30076a);
        this.f51502g = new B(5);
        this.f51503h = new B();
        byte[] bArr = new byte[16];
        this.f51504i = bArr;
        this.f51505j = new B(bArr);
        this.f51509n = new ArrayDeque<>();
        this.f51510o = new ArrayDeque<>();
        this.f51500e = new SparseArray<>();
        this.f51513r = C9967v.E();
        this.f51484A = -9223372036854775807L;
        this.f51521z = -9223372036854775807L;
        this.f51485B = -9223372036854775807L;
        this.f51492I = r.f38935b0;
        this.f51493J = new O[0];
        this.f51494K = new O[0];
        this.f51511p = new g(new g(this));
    }
}
