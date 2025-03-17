package b4;

import W3.C6712b;
import W3.C6713c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import jb.C9892c;
import kb.C9967v;
import q3.A;
import q3.z;
import t3.B;
import t3.N;
import t3.q;

public final class h extends C6713c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f45389b = new g();

    /* renamed from: a  reason: collision with root package name */
    private final a f45390a;

    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f45391a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f45392b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f45393c;

        public b(int i10, boolean z10, int i11) {
            this.f45391a = i10;
            this.f45392b = z10;
            this.f45393c = i11;
        }
    }

    public h() {
        this((a) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean A(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static int B(B b10, int i10) {
        byte[] e10 = b10.e();
        int f10 = b10.f();
        int i11 = f10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= f10 + i10) {
                return i10;
            }
            if ((e10[i11] & 255) == 255 && e10[i12] == 0) {
                System.arraycopy(e10, i11 + 2, e10, i12, (i10 - (i11 - f10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        if ((r10 & 1) != 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        if ((r10 & 128) != 0) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b A[SYNTHETIC, Splitter:B:48:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean C(t3.B r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.f()
        L_0x0008:
            int r3 = r18.a()     // Catch:{ all -> 0x0022 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0025
            int r7 = r18.q()     // Catch:{ all -> 0x0022 }
            long r8 = r18.J()     // Catch:{ all -> 0x0022 }
            int r10 = r18.P()     // Catch:{ all -> 0x0022 }
            goto L_0x002f
        L_0x0022:
            r0 = move-exception
            goto L_0x00b2
        L_0x0025:
            int r7 = r18.K()     // Catch:{ all -> 0x0022 }
            int r8 = r18.K()     // Catch:{ all -> 0x0022 }
            long r8 = (long) r8
            r10 = r6
        L_0x002f:
            r11 = 0
            if (r7 != 0) goto L_0x003d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003d
            if (r10 != 0) goto L_0x003d
            r1.W(r2)
            return r4
        L_0x003d:
            r7 = 4
            if (r0 != r7) goto L_0x006e
            if (r21 != 0) goto L_0x006e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x004e
            r1.W(r2)
            return r6
        L_0x004e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006e:
            if (r0 != r7) goto L_0x007e
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0076
            r3 = r4
            goto L_0x0077
        L_0x0076:
            r3 = r6
        L_0x0077:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x007c
            goto L_0x008e
        L_0x007c:
            r4 = r6
            goto L_0x008e
        L_0x007e:
            if (r0 != r3) goto L_0x008c
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0086
            r3 = r4
            goto L_0x0087
        L_0x0086:
            r3 = r6
        L_0x0087:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x007c
            goto L_0x008e
        L_0x008c:
            r3 = r6
            r4 = r3
        L_0x008e:
            if (r4 == 0) goto L_0x0092
            int r3 = r3 + 4
        L_0x0092:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x009b
            r1.W(r2)
            return r6
        L_0x009b:
            int r3 = r18.a()     // Catch:{ all -> 0x0022 }
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a8
            r1.W(r2)
            return r6
        L_0x00a8:
            int r3 = (int) r8
            r1.X(r3)     // Catch:{ all -> 0x0022 }
            goto L_0x0008
        L_0x00ae:
            r1.W(r2)
            return r4
        L_0x00b2:
            r1.W(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.h.C(t3.B, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? N.f29467f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static C7057a f(B b10, int i10, int i11) {
        int i12;
        String str;
        int H10 = b10.H();
        Charset w10 = w(H10);
        int i13 = i10 - 1;
        byte[] bArr = new byte[i13];
        b10.l(bArr, 0, i13);
        if (i11 == 2) {
            str = "image/" + C9892c.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i12 = 2;
        } else {
            i12 = z(bArr, 0);
            String e10 = C9892c.e(new String(bArr, 0, i12, StandardCharsets.ISO_8859_1));
            if (e10.indexOf(47) == -1) {
                str = "image/" + e10;
            } else {
                str = e10;
            }
        }
        int i14 = i12 + 2;
        int y10 = y(bArr, i14, H10);
        return new C7057a(str, new String(bArr, i14, y10 - i14, w10), bArr[i12 + 1] & 255, d(bArr, y10 + v(H10), i13));
    }

    private static C7058b g(B b10, int i10, String str) {
        byte[] bArr = new byte[i10];
        b10.l(bArr, 0, i10);
        return new C7058b(str, bArr);
    }

    private static c h(B b10, int i10, int i11, boolean z10, int i12, a aVar) {
        B b11 = b10;
        int f10 = b10.f();
        int z11 = z(b10.e(), f10);
        String str = new String(b10.e(), f10, z11 - f10, StandardCharsets.ISO_8859_1);
        b10.W(z11 + 1);
        int q10 = b10.q();
        int q11 = b10.q();
        long J10 = b10.J();
        long j10 = J10 == 4294967295L ? -1 : J10;
        long J11 = b10.J();
        long j11 = J11 == 4294967295L ? -1 : J11;
        ArrayList arrayList = new ArrayList();
        int i13 = f10 + i10;
        while (b10.f() < i13) {
            i k10 = k(i11, b10, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new c(str, q10, q11, j10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(B b10, int i10, int i11, boolean z10, int i12, a aVar) {
        B b11 = b10;
        int f10 = b10.f();
        int z11 = z(b10.e(), f10);
        String str = new String(b10.e(), f10, z11 - f10, StandardCharsets.ISO_8859_1);
        b11.W(z11 + 1);
        int H10 = b10.H();
        boolean z12 = (H10 & 2) != 0;
        boolean z13 = (H10 & 1) != 0;
        int H11 = b10.H();
        String[] strArr = new String[H11];
        for (int i13 = 0; i13 < H11; i13++) {
            int f11 = b10.f();
            int z14 = z(b10.e(), f11);
            strArr[i13] = new String(b10.e(), f11, z14 - f11, StandardCharsets.ISO_8859_1);
            b11.W(z14 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = f10 + i10;
        while (b10.f() < i14) {
            i k10 = k(i11, b11, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new d(str, z12, z13, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(B b10, int i10) {
        if (i10 < 4) {
            return null;
        }
        int H10 = b10.H();
        Charset w10 = w(H10);
        byte[] bArr = new byte[3];
        b10.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        b10.l(bArr2, 0, i11);
        int y10 = y(bArr2, 0, H10);
        String str2 = new String(bArr2, 0, y10, w10);
        int v10 = y10 + v(H10);
        return new e(str, str2, p(bArr2, v10, y(bArr2, v10, H10), w10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0193, code lost:
        if (r13 == 67) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static b4.i k(int r20, t3.B r21, boolean r22, int r23, b4.h.a r24) {
        /*
            r7 = r20
            r8 = r21
            int r9 = r21.H()
            int r10 = r21.H()
            int r11 = r21.H()
            r12 = 3
            if (r7 < r12) goto L_0x0019
            int r1 = r21.H()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r7 != r14) goto L_0x003c
            int r1 = r21.L()
            if (r22 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r7 != r12) goto L_0x0043
            int r1 = r21.L()
            goto L_0x003a
        L_0x0043:
            int r1 = r21.K()
            goto L_0x003a
        L_0x0048:
            if (r7 < r12) goto L_0x0050
            int r1 = r21.P()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r11 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r21.g()
            r8.W(r0)
            return r16
        L_0x0067:
            int r1 = r21.f()
            int r5 = r1 + r15
            int r1 = r21.g()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            t3.q.h(r4, r0)
            int r0 = r21.g()
            r8.W(r0)
            return r16
        L_0x0082:
            if (r24 == 0) goto L_0x009a
            r1 = r24
            r2 = r20
            r3 = r9
            r17 = r4
            r4 = r10
            r14 = r5
            r5 = r11
            r0 = r6
            r6 = r13
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r8.W(r14)
            return r16
        L_0x009a:
            r17 = r4
            r14 = r5
            r0 = r6
        L_0x009e:
            r1 = 1
            if (r7 != r12) goto L_0x00bd
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00a7
            r2 = r1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            r3 = r0 & 64
            if (r3 == 0) goto L_0x00ae
            r3 = r1
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            r0 = r0 & 32
            if (r0 == 0) goto L_0x00b5
            r0 = r1
            goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            r18 = r2
            r5 = 0
            r2 = r0
            r0 = r18
            goto L_0x00ed
        L_0x00bd:
            r2 = 4
            if (r7 != r2) goto L_0x00e7
            r2 = r0 & 64
            if (r2 == 0) goto L_0x00c6
            r2 = r1
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            r3 = r0 & 8
            if (r3 == 0) goto L_0x00cd
            r3 = r1
            goto L_0x00ce
        L_0x00cd:
            r3 = 0
        L_0x00ce:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x00d4
            r4 = r1
            goto L_0x00d5
        L_0x00d4:
            r4 = 0
        L_0x00d5:
            r5 = r0 & 2
            if (r5 == 0) goto L_0x00db
            r5 = r1
            goto L_0x00dc
        L_0x00db:
            r5 = 0
        L_0x00dc:
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00e1
            r0 = r1
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            r18 = r0
            r0 = r3
            r3 = r4
            goto L_0x00ed
        L_0x00e7:
            r0 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r18 = 0
        L_0x00ed:
            if (r0 != 0) goto L_0x00f1
            if (r3 == 0) goto L_0x00f5
        L_0x00f1:
            r2 = r17
            goto L_0x022b
        L_0x00f5:
            if (r2 == 0) goto L_0x00fc
            int r15 = r15 + -1
            r8.X(r1)
        L_0x00fc:
            if (r18 == 0) goto L_0x0104
            int r15 = r15 + -4
            r0 = 4
            r8.X(r0)
        L_0x0104:
            if (r5 == 0) goto L_0x010a
            int r15 = B(r8, r15)
        L_0x010a:
            r0 = 84
            r1 = 88
            r2 = 2
            if (r9 != r0) goto L_0x0128
            if (r10 != r1) goto L_0x0128
            if (r11 != r1) goto L_0x0128
            if (r7 == r2) goto L_0x0119
            if (r13 != r1) goto L_0x0128
        L_0x0119:
            b4.n r0 = s(r8, r15)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x011f:
            r0 = move-exception
            goto L_0x01ff
        L_0x0122:
            r0 = move-exception
            goto L_0x0203
        L_0x0125:
            r0 = move-exception
            goto L_0x0203
        L_0x0128:
            if (r9 != r0) goto L_0x0134
            java.lang.String r0 = x(r7, r9, r10, r11, r13)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            b4.n r0 = q(r8, r15, r0)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x0134:
            r3 = 87
            if (r9 != r3) goto L_0x0146
            if (r10 != r1) goto L_0x0146
            if (r11 != r1) goto L_0x0146
            if (r7 == r2) goto L_0x0140
            if (r13 != r1) goto L_0x0146
        L_0x0140:
            b4.o r0 = u(r8, r15)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x0146:
            if (r9 != r3) goto L_0x0152
            java.lang.String r0 = x(r7, r9, r10, r11, r13)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            b4.o r0 = t(r8, r15, r0)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x0152:
            r1 = 73
            r3 = 80
            if (r9 != r3) goto L_0x0168
            r4 = 82
            if (r10 != r4) goto L_0x0168
            if (r11 != r1) goto L_0x0168
            r4 = 86
            if (r13 != r4) goto L_0x0168
            b4.m r0 = o(r8, r15)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x0168:
            r4 = 71
            r5 = 79
            if (r9 != r4) goto L_0x0180
            r4 = 69
            if (r10 != r4) goto L_0x0180
            if (r11 != r5) goto L_0x0180
            r4 = 66
            if (r13 == r4) goto L_0x017a
            if (r7 != r2) goto L_0x0180
        L_0x017a:
            b4.f r0 = l(r8, r15)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x0180:
            r4 = 65
            r6 = 67
            if (r7 != r2) goto L_0x018d
            if (r9 != r3) goto L_0x019b
            if (r10 != r1) goto L_0x019b
            if (r11 != r6) goto L_0x019b
            goto L_0x0195
        L_0x018d:
            if (r9 != r4) goto L_0x019b
            if (r10 != r3) goto L_0x019b
            if (r11 != r1) goto L_0x019b
            if (r13 != r6) goto L_0x019b
        L_0x0195:
            b4.a r0 = f(r8, r15, r7)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x019b:
            r1 = 77
            if (r9 != r6) goto L_0x01ac
            if (r10 != r5) goto L_0x01ac
            if (r11 != r1) goto L_0x01ac
            if (r13 == r1) goto L_0x01a7
            if (r7 != r2) goto L_0x01ac
        L_0x01a7:
            b4.e r0 = j(r8, r15)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x01ac:
            if (r9 != r6) goto L_0x01c6
            r2 = 72
            if (r10 != r2) goto L_0x01c6
            if (r11 != r4) goto L_0x01c6
            if (r13 != r3) goto L_0x01c6
            r1 = r21
            r2 = r15
            r3 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            b4.c r0 = h(r1, r2, r3, r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x01c6:
            if (r9 != r6) goto L_0x01de
            if (r10 != r0) goto L_0x01de
            if (r11 != r5) goto L_0x01de
            if (r13 != r6) goto L_0x01de
            r1 = r21
            r2 = r15
            r3 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            b4.d r0 = i(r1, r2, r3, r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x01de:
            if (r9 != r1) goto L_0x01ed
            r1 = 76
            if (r10 != r1) goto L_0x01ed
            if (r11 != r1) goto L_0x01ed
            if (r13 != r0) goto L_0x01ed
            b4.l r0 = n(r8, r15)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            goto L_0x01f5
        L_0x01ed:
            java.lang.String r0 = x(r7, r9, r10, r11, r13)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
            b4.b r0 = g(r8, r15, r0)     // Catch:{ OutOfMemoryError -> 0x0125, Exception -> 0x0122, all -> 0x011f }
        L_0x01f5:
            r8.W(r14)
            r19 = r16
            r16 = r0
            r0 = r19
            goto L_0x0206
        L_0x01ff:
            r8.W(r14)
            throw r0
        L_0x0203:
            r8.W(r14)
        L_0x0206:
            if (r16 != 0) goto L_0x022a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to decode frame: id="
            r1.append(r2)
            java.lang.String r2 = x(r7, r9, r10, r11, r13)
            r1.append(r2)
            java.lang.String r2 = ", frameSize="
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r2 = r17
            t3.q.i(r2, r1, r0)
        L_0x022a:
            return r16
        L_0x022b:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            t3.q.h(r2, r0)
            r8.W(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.h.k(int, t3.B, boolean, int, b4.h$a):b4.i");
    }

    private static f l(B b10, int i10) {
        int H10 = b10.H();
        Charset w10 = w(H10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b10.l(bArr, 0, i11);
        int z10 = z(bArr, 0);
        String r10 = A.r(new String(bArr, 0, z10, StandardCharsets.ISO_8859_1));
        int i12 = z10 + 1;
        int y10 = y(bArr, i12, H10);
        String p10 = p(bArr, i12, y10, w10);
        int v10 = y10 + v(H10);
        int y11 = y(bArr, v10, H10);
        return new f(r10, p10, p(bArr, v10, y11, w10), d(bArr, y11 + v(H10), i11));
    }

    private static b m(B b10) {
        if (b10.a() < 10) {
            q.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int K10 = b10.K();
        if (K10 != 4801587) {
            q.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", new Object[]{Integer.valueOf(K10)}));
            return null;
        }
        int H10 = b10.H();
        boolean z10 = true;
        b10.X(1);
        int H11 = b10.H();
        int G10 = b10.G();
        if (H10 == 2) {
            if ((H11 & 64) != 0) {
                q.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (H10 == 3) {
            if ((H11 & 64) != 0) {
                int q10 = b10.q();
                b10.X(q10);
                G10 -= q10 + 4;
            }
        } else if (H10 == 4) {
            if ((H11 & 64) != 0) {
                int G11 = b10.G();
                b10.X(G11 - 4);
                G10 -= G11;
            }
            if ((H11 & 16) != 0) {
                G10 -= 10;
            }
        } else {
            q.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + H10);
            return null;
        }
        if (H10 >= 4 || (H11 & 128) == 0) {
            z10 = false;
        }
        return new b(H10, z10, G10);
    }

    private static l n(B b10, int i10) {
        int P10 = b10.P();
        int K10 = b10.K();
        int K11 = b10.K();
        int H10 = b10.H();
        int H11 = b10.H();
        t3.A a10 = new t3.A();
        a10.m(b10);
        int i11 = ((i10 - 10) * 8) / (H10 + H11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = a10.h(H10);
            int h11 = a10.h(H11);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new l(P10, K10, K11, iArr, iArr2);
    }

    private static m o(B b10, int i10) {
        byte[] bArr = new byte[i10];
        b10.l(bArr, 0, i10);
        int z10 = z(bArr, 0);
        return new m(new String(bArr, 0, z10, StandardCharsets.ISO_8859_1), d(bArr, z10 + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static n q(B b10, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int H10 = b10.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b10.l(bArr, 0, i11);
        return new n(str, (String) null, r(bArr, H10, 0));
    }

    private static C9967v<String> r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return C9967v.F("");
        }
        C9967v.a t10 = C9967v.t();
        int y10 = y(bArr, i11, i10);
        while (i11 < y10) {
            t10.a(new String(bArr, i11, y10 - i11, w(i10)));
            i11 = v(i10) + y10;
            y10 = y(bArr, i11, i10);
        }
        C9967v<String> k10 = t10.k();
        return k10.isEmpty() ? C9967v.F("") : k10;
    }

    private static n s(B b10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int H10 = b10.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b10.l(bArr, 0, i11);
        int y10 = y(bArr, 0, H10);
        return new n("TXXX", new String(bArr, 0, y10, w(H10)), r(bArr, H10, y10 + v(H10)));
    }

    private static o t(B b10, int i10, String str) {
        byte[] bArr = new byte[i10];
        b10.l(bArr, 0, i10);
        return new o(str, (String) null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static o u(B b10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int H10 = b10.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b10.l(bArr, 0, i11);
        int y10 = y(bArr, 0, H10);
        String str = new String(bArr, 0, y10, w(H10));
        int v10 = y10 + v(H10);
        return new o("WXXX", str, p(bArr, v10, z(bArr, v10), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)}) : String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int z10 = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return z10;
        }
        while (z10 < bArr.length - 1) {
            if ((z10 - i10) % 2 == 0 && bArr[z10 + 1] == 0) {
                return z10;
            }
            z10 = z(bArr, z10 + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    public z b(C6712b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public z e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        B b10 = new B(bArr, i10);
        b m10 = m(b10);
        if (m10 == null) {
            return null;
        }
        int f10 = b10.f();
        int i11 = m10.f45391a == 2 ? 6 : 10;
        int b11 = m10.f45393c;
        if (m10.f45392b) {
            b11 = B(b10, m10.f45393c);
        }
        b10.V(f10 + b11);
        boolean z10 = false;
        if (!C(b10, m10.f45391a, i11, false)) {
            if (m10.f45391a != 4 || !C(b10, 4, i11, true)) {
                q.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m10.f45391a);
                return null;
            }
            z10 = true;
        }
        while (b10.a() >= i11) {
            i k10 = k(m10.f45391a, b10, z10, i11, this.f45390a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new z((List<? extends z.b>) arrayList);
    }

    public h(a aVar) {
        this.f45390a = aVar;
    }
}
