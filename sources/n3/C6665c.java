package N3;

import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import t3.A;
import t3.B;

/* renamed from: N3.c  reason: case insensitive filesystem */
public final class C6665c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f38827a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, Constants.MINIMAL_ERROR_STATUS_CODE, Constants.MINIMAL_ERROR_STATUS_CODE, RecyclerView.n.FLAG_MOVED};

    /* renamed from: N3.c$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f38828a;

        /* renamed from: b  reason: collision with root package name */
        public int f38829b;

        /* renamed from: c  reason: collision with root package name */
        public int f38830c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f38831d;

        /* renamed from: e  reason: collision with root package name */
        public int f38832e;

        /* renamed from: f  reason: collision with root package name */
        public int f38833f;

        private b() {
            this.f38828a = true;
            this.f38829b = -1;
            this.f38830c = -1;
            this.f38831d = true;
            this.f38832e = 2;
            this.f38833f = 0;
        }
    }

    /* renamed from: N3.c$c  reason: collision with other inner class name */
    public static final class C0612c {

        /* renamed from: a  reason: collision with root package name */
        public final int f38834a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38835b;

        /* renamed from: c  reason: collision with root package name */
        public final int f38836c;

        /* renamed from: d  reason: collision with root package name */
        public final int f38837d;

        /* renamed from: e  reason: collision with root package name */
        public final int f38838e;

        private C0612c(int i10, int i11, int i12, int i13, int i14) {
            this.f38834a = i10;
            this.f38836c = i11;
            this.f38835b = i12;
            this.f38837d = i13;
            this.f38838e = i14;
        }
    }

    public static void a(int i10, B b10) {
        b10.S(7);
        byte[] e10 = b10.e();
        e10[0] = -84;
        e10[1] = 64;
        e10[2] = -1;
        e10[3] = -1;
        e10[4] = (byte) ((i10 >> 16) & 255);
        e10[5] = (byte) ((i10 >> 8) & 255);
        e10[6] = (byte) (i10 & 255);
    }

    private static int b(int i10, boolean z10, int i11) {
        int c10 = c(i10);
        if (i10 != 11 && i10 != 12 && i10 != 13 && i10 != 14) {
            return c10;
        }
        if (!z10) {
            c10 -= 2;
        }
        return i11 != 0 ? i11 != 1 ? c10 : c10 - 2 : c10 - 4;
    }

    private static int c(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x018f, code lost:
        r4 = r0.h(3);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0197, code lost:
        if (r2 >= (r4 + 2)) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0199, code lost:
        i(r0, r6);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x019f, code lost:
        if (r14 != 0) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a1, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a3, code lost:
        if (r4 >= 3) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a5, code lost:
        h(r0, r6);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ab, code lost:
        r2 = 3;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ad, code lost:
        if (r4 >= r2) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01af, code lost:
        i(r0, r6);
        r4 = r4 + 1;
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01b6, code lost:
        if (r14 != 0) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b8, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b9, code lost:
        if (r2 >= 2) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01bb, code lost:
        h(r0, r6);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c1, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c2, code lost:
        if (r2 >= 2) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01c4, code lost:
        i(r0, r6);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01ca, code lost:
        if (r14 != 0) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01cc, code lost:
        h(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d0, code lost:
        i(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01d3, code lost:
        r0.q();
        r2 = r0.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01da, code lost:
        if (r2 == false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01dc, code lost:
        r2 = r0.h(7);
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01e2, code lost:
        if (r4 >= r2) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01e4, code lost:
        r0.r(15);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ec, code lost:
        if (r14 <= 0) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f2, code lost:
        if (r0.g() == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f8, code lost:
        if (k(r0) == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0201, code lost:
        throw q3.B.c("Can't parse bitrate DSI.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0206, code lost:
        if (r0.g() == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0208, code lost:
        r0.c();
        r0.s(r0.h(16));
        r2 = r0.h(5);
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x021a, code lost:
        if (r11 >= r2) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x021c, code lost:
        r0.r(3);
        r0.r(8);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0228, code lost:
        r0.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x022e, code lost:
        if (r3 != 1) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0230, code lost:
        r1 = ((r1 - r0.b()) / 8) - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0237, code lost:
        if (r5 < r1) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0239, code lost:
        r0.s(r5 - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0244, code lost:
        throw q3.B.c("pres_bytes is smaller than presentation bytes read.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0247, code lost:
        if (r6.f38828a == false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x024c, code lost:
        if (r6.f38829b == -1) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0264, code lost:
        throw q3.B.c("Can't determine channel mode of presentation " + r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cb, code lost:
        if (r9 != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cd, code lost:
        if (r10 != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if (r11 != 6) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d2, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d5, code lost:
        r6.f38833f = r0.h(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        if (r0.g() == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e1, code lost:
        r0.r(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e4, code lost:
        r0.r(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e8, code lost:
        if (r3 != 1) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ea, code lost:
        if (r14 == 1) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ec, code lost:
        if (r14 != 2) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ee, code lost:
        r0.r(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        r0.r(5);
        r0.r(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        if (r3 != 1) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fb, code lost:
        if (r14 <= 0) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        r6.f38828a = r0.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        if (r6.f38828a == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0107, code lost:
        if (r14 == 1) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0109, code lost:
        if (r14 != 2) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010b, code lost:
        r2 = r0.h(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010f, code lost:
        if (r2 < 0) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0113, code lost:
        if (r2 > 15) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0115, code lost:
        r6.f38829b = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0119, code lost:
        if (r2 < 11) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011d, code lost:
        if (r2 > 14) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011f, code lost:
        r6.f38831d = r0.g();
        r6.f38832e = r0.h(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        r0.r(24);
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0132, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0133, code lost:
        if (r14 == r2) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0135, code lost:
        if (r14 != 2) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013b, code lost:
        if (r0.g() == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0141, code lost:
        if (r0.g() == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0143, code lost:
        r0.r(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014a, code lost:
        if (r0.g() == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014c, code lost:
        r0.q();
        r2 = 8;
        r4 = r0.h(8);
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0156, code lost:
        if (r13 >= r4) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0158, code lost:
        r0.r(r2);
        r13 = r13 + 1;
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0160, code lost:
        if (r9 != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0162, code lost:
        if (r10 == false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0166, code lost:
        r0.q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0169, code lost:
        if (r11 == 0) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016c, code lost:
        if (r11 == 1) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016e, code lost:
        if (r11 == 2) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0171, code lost:
        if (r11 == 3) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0174, code lost:
        if (r11 == 4) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0177, code lost:
        if (r11 == 5) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0179, code lost:
        r4 = r0.h(7);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017f, code lost:
        if (r2 >= r4) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0181, code lost:
        r0.r(8);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0189, code lost:
        if (r14 != 0) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x018b, code lost:
        h(r0, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static q3.C5807s d(t3.B r18, java.lang.String r19, java.lang.String r20, q3.C5803n r21) {
        /*
            t3.A r0 = new t3.A
            r0.<init>()
            r1 = r18
            r0.m(r1)
            int r1 = r0.b()
            r2 = 3
            int r3 = r0.h(r2)
            r4 = 1
            if (r3 > r4) goto L_0x02b6
            r5 = 7
            int r6 = r0.h(r5)
            boolean r7 = r0.g()
            if (r7 == 0) goto L_0x0025
            r7 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0028
        L_0x0025:
            r7 = 44100(0xac44, float:6.1797E-41)
        L_0x0028:
            r8 = 4
            r0.r(r8)
            r9 = 9
            int r9 = r0.h(r9)
            r10 = 16
            if (r6 <= r4) goto L_0x0063
            if (r3 == 0) goto L_0x004d
            boolean r6 = r0.g()
            if (r6 == 0) goto L_0x0063
            r0.r(r10)
            boolean r6 = r0.g()
            if (r6 == 0) goto L_0x0063
            r6 = 128(0x80, float:1.794E-43)
            r0.r(r6)
            goto L_0x0063
        L_0x004d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid AC-4 DSI version: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            q3.B r0 = q3.B.c(r0)
            throw r0
        L_0x0063:
            if (r3 != r4) goto L_0x0076
            boolean r6 = k(r0)
            if (r6 == 0) goto L_0x006f
            r0.c()
            goto L_0x0076
        L_0x006f:
            java.lang.String r0 = "Invalid AC-4 DSI bitrate."
            q3.B r0 = q3.B.c(r0)
            throw r0
        L_0x0076:
            N3.c$b r6 = new N3.c$b
            r11 = 0
            r6.<init>()
            r12 = 0
        L_0x007d:
            if (r12 >= r9) goto L_0x0265
            r13 = 5
            r14 = 8
            r15 = 2
            if (r3 != 0) goto L_0x0099
            boolean r9 = r0.g()
            int r16 = r0.h(r13)
            int r17 = r0.h(r13)
            r11 = r16
            r14 = r17
            r5 = 0
            r8 = 0
            r10 = 0
            goto L_0x00cb
        L_0x0099:
            int r11 = r0.h(r14)
            int r5 = r0.h(r14)
            r8 = 255(0xff, float:3.57E-43)
            if (r5 != r8) goto L_0x00aa
            int r8 = r0.h(r10)
            int r5 = r5 + r8
        L_0x00aa:
            if (r11 <= r15) goto L_0x00b6
            int r5 = r5 * 8
            r0.r(r5)
            int r12 = r12 + 1
            r5 = 7
            r8 = 4
            goto L_0x007d
        L_0x00b6:
            int r8 = r0.b()
            int r8 = r1 - r8
            int r8 = r8 / r14
            int r9 = r0.h(r13)
            r10 = 31
            if (r9 != r10) goto L_0x00c7
            r10 = r4
            goto L_0x00c8
        L_0x00c7:
            r10 = 0
        L_0x00c8:
            r14 = r11
            r11 = r9
            r9 = 0
        L_0x00cb:
            if (r9 != 0) goto L_0x00d5
            if (r10 != 0) goto L_0x00d5
            r4 = 6
            if (r11 != r4) goto L_0x00d5
            r2 = 1
            goto L_0x01da
        L_0x00d5:
            int r4 = r0.h(r2)
            r6.f38833f = r4
            boolean r4 = r0.g()
            if (r4 == 0) goto L_0x00e4
            r0.r(r13)
        L_0x00e4:
            r0.r(r15)
            r4 = 1
            if (r3 != r4) goto L_0x00f1
            if (r14 == r4) goto L_0x00ee
            if (r14 != r15) goto L_0x00f1
        L_0x00ee:
            r0.r(r15)
        L_0x00f1:
            r0.r(r13)
            r2 = 10
            r0.r(r2)
            if (r3 != r4) goto L_0x0160
            if (r14 <= 0) goto L_0x0103
            boolean r2 = r0.g()
            r6.f38828a = r2
        L_0x0103:
            boolean r2 = r6.f38828a
            if (r2 == 0) goto L_0x0132
            if (r14 == r4) goto L_0x010b
            if (r14 != r15) goto L_0x012b
        L_0x010b:
            int r2 = r0.h(r13)
            if (r2 < 0) goto L_0x0117
            r4 = 15
            if (r2 > r4) goto L_0x0117
            r6.f38829b = r2
        L_0x0117:
            r4 = 11
            if (r2 < r4) goto L_0x012b
            r4 = 14
            if (r2 > r4) goto L_0x012b
            boolean r2 = r0.g()
            r6.f38831d = r2
            int r2 = r0.h(r15)
            r6.f38832e = r2
        L_0x012b:
            r2 = 24
            r0.r(r2)
            r2 = 1
            goto L_0x0133
        L_0x0132:
            r2 = r4
        L_0x0133:
            if (r14 == r2) goto L_0x0137
            if (r14 != r15) goto L_0x0160
        L_0x0137:
            boolean r2 = r0.g()
            if (r2 == 0) goto L_0x0146
            boolean r2 = r0.g()
            if (r2 == 0) goto L_0x0146
            r0.r(r15)
        L_0x0146:
            boolean r2 = r0.g()
            if (r2 == 0) goto L_0x0160
            r0.q()
            r2 = 8
            int r4 = r0.h(r2)
            r13 = 0
        L_0x0156:
            if (r13 >= r4) goto L_0x0160
            r0.r(r2)
            int r13 = r13 + 1
            r2 = 8
            goto L_0x0156
        L_0x0160:
            if (r9 != 0) goto L_0x01ca
            if (r10 == 0) goto L_0x0166
            goto L_0x01ca
        L_0x0166:
            r0.q()
            if (r11 == 0) goto L_0x01b6
            r2 = 1
            if (r11 == r2) goto L_0x01b6
            if (r11 == r15) goto L_0x01b6
            r2 = 3
            if (r11 == r2) goto L_0x019f
            r2 = 4
            if (r11 == r2) goto L_0x019f
            r2 = 5
            if (r11 == r2) goto L_0x0189
            r2 = 7
            int r4 = r0.h(r2)
            r2 = 0
        L_0x017f:
            if (r2 >= r4) goto L_0x01d3
            r9 = 8
            r0.r(r9)
            int r2 = r2 + 1
            goto L_0x017f
        L_0x0189:
            if (r14 != 0) goto L_0x018f
            h(r0, r6)
            goto L_0x01d3
        L_0x018f:
            r2 = 3
            int r4 = r0.h(r2)
            r2 = 0
        L_0x0195:
            int r9 = r4 + 2
            if (r2 >= r9) goto L_0x01d3
            i(r0, r6)
            int r2 = r2 + 1
            goto L_0x0195
        L_0x019f:
            if (r14 != 0) goto L_0x01ab
            r2 = 3
            r4 = 0
        L_0x01a3:
            if (r4 >= r2) goto L_0x01d3
            h(r0, r6)
            int r4 = r4 + 1
            goto L_0x01a3
        L_0x01ab:
            r2 = 3
            r4 = 0
        L_0x01ad:
            if (r4 >= r2) goto L_0x01d3
            i(r0, r6)
            int r4 = r4 + 1
            r2 = 3
            goto L_0x01ad
        L_0x01b6:
            if (r14 != 0) goto L_0x01c1
            r2 = 0
        L_0x01b9:
            if (r2 >= r15) goto L_0x01d3
            h(r0, r6)
            int r2 = r2 + 1
            goto L_0x01b9
        L_0x01c1:
            r2 = 0
        L_0x01c2:
            if (r2 >= r15) goto L_0x01d3
            i(r0, r6)
            int r2 = r2 + 1
            goto L_0x01c2
        L_0x01ca:
            if (r14 != 0) goto L_0x01d0
            h(r0, r6)
            goto L_0x01d3
        L_0x01d0:
            i(r0, r6)
        L_0x01d3:
            r0.q()
            boolean r2 = r0.g()
        L_0x01da:
            if (r2 == 0) goto L_0x01ec
            r2 = 7
            int r2 = r0.h(r2)
            r4 = 0
        L_0x01e2:
            if (r4 >= r2) goto L_0x01ec
            r9 = 15
            r0.r(r9)
            int r4 = r4 + 1
            goto L_0x01e2
        L_0x01ec:
            if (r14 <= 0) goto L_0x0228
            boolean r2 = r0.g()
            if (r2 == 0) goto L_0x0202
            boolean r2 = k(r0)
            if (r2 == 0) goto L_0x01fb
            goto L_0x0202
        L_0x01fb:
            java.lang.String r0 = "Can't parse bitrate DSI."
            q3.B r0 = q3.B.c(r0)
            throw r0
        L_0x0202:
            boolean r2 = r0.g()
            if (r2 == 0) goto L_0x0228
            r0.c()
            r2 = 16
            int r2 = r0.h(r2)
            r0.s(r2)
            r2 = 5
            int r2 = r0.h(r2)
            r11 = 0
        L_0x021a:
            if (r11 >= r2) goto L_0x0228
            r4 = 3
            r0.r(r4)
            r9 = 8
            r0.r(r9)
            int r11 = r11 + 1
            goto L_0x021a
        L_0x0228:
            r9 = 8
            r0.c()
            r2 = 1
            if (r3 != r2) goto L_0x0245
            int r2 = r0.b()
            int r1 = r1 - r2
            int r1 = r1 / r9
            int r1 = r1 - r8
            if (r5 < r1) goto L_0x023e
            int r5 = r5 - r1
            r0.s(r5)
            goto L_0x0245
        L_0x023e:
            java.lang.String r0 = "pres_bytes is smaller than presentation bytes read."
            q3.B r0 = q3.B.c(r0)
            throw r0
        L_0x0245:
            boolean r0 = r6.f38828a
            if (r0 == 0) goto L_0x0265
            int r0 = r6.f38829b
            r1 = -1
            if (r0 == r1) goto L_0x024f
            goto L_0x0265
        L_0x024f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't determine channel mode of presentation "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            q3.B r0 = q3.B.c(r0)
            throw r0
        L_0x0265:
            boolean r0 = r6.f38828a
            if (r0 == 0) goto L_0x0274
            int r0 = r6.f38829b
            boolean r1 = r6.f38831d
            int r2 = r6.f38832e
            int r0 = b(r0, r1, r2)
            goto L_0x0283
        L_0x0274:
            int r0 = r6.f38830c
            r1 = 1
            int r0 = r0 + r1
            int r1 = r6.f38833f
            r2 = 4
            if (r1 != r2) goto L_0x0283
            r1 = 17
            if (r0 != r1) goto L_0x0283
            r0 = 21
        L_0x0283:
            if (r0 <= 0) goto L_0x02af
            q3.s$b r1 = new q3.s$b
            r1.<init>()
            r2 = r19
            q3.s$b r1 = r1.e0(r2)
            java.lang.String r2 = "audio/ac4"
            q3.s$b r1 = r1.s0(r2)
            q3.s$b r0 = r1.Q(r0)
            q3.s$b r0 = r0.t0(r7)
            r1 = r21
            q3.s$b r0 = r0.X(r1)
            r1 = r20
            q3.s$b r0 = r0.i0(r1)
            q3.s r0 = r0.M()
            return r0
        L_0x02af:
            java.lang.String r0 = "Can't determine channel count of presentation."
            q3.B r0 = q3.B.c(r0)
            throw r0
        L_0x02b6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported AC-4 DSI version: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            q3.B r0 = q3.B.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.C6665c.d(t3.B, java.lang.String, java.lang.String, q3.n):q3.s");
    }

    public static int e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return f(new A(bArr)).f38838e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        if (r11 != 11) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r11 != 11) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r11 != 8) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static N3.C6665c.C0612c f(t3.A r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r11.h(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L_0x002f
            int r4 = j(r11, r0)
            int r1 = r1 + r4
        L_0x002f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L_0x0045
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L_0x0045
            r11.r(r0)
        L_0x0045:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L_0x0053
            r9 = r7
            goto L_0x0054
        L_0x0053:
            r9 = r6
        L_0x0054:
            int r11 = r11.h(r3)
            if (r9 != r6) goto L_0x0063
            r4 = 13
            if (r11 != r4) goto L_0x0063
            int[] r0 = f38827a
            r11 = r0[r11]
            goto L_0x0091
        L_0x0063:
            if (r9 != r7) goto L_0x0090
            int[] r4 = f38827a
            int r6 = r4.length
            if (r11 >= r6) goto L_0x0090
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L_0x008b
            r7 = 11
            if (r1 == r0) goto L_0x0086
            if (r1 == r2) goto L_0x008b
            if (r1 == r3) goto L_0x007c
            goto L_0x0084
        L_0x007c:
            if (r11 == r2) goto L_0x0082
            if (r11 == r6) goto L_0x0082
            if (r11 != r7) goto L_0x0084
        L_0x0082:
            int r4 = r4 + 1
        L_0x0084:
            r11 = r4
            goto L_0x0091
        L_0x0086:
            if (r11 == r6) goto L_0x0082
            if (r11 != r7) goto L_0x0084
            goto L_0x0082
        L_0x008b:
            if (r11 == r2) goto L_0x0082
            if (r11 != r6) goto L_0x0084
            goto L_0x0082
        L_0x0090:
            r11 = 0
        L_0x0091:
            N3.c$c r0 = new N3.c$c
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.C6665c.f(t3.A):N3.c$c");
    }

    public static int g(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b10 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b10 == 65535) {
            b10 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return b10 + i11;
    }

    private static void h(A a10, b bVar) {
        int h10 = a10.h(5);
        a10.r(2);
        if (a10.g()) {
            a10.r(5);
        }
        if (h10 >= 7 && h10 <= 10) {
            a10.q();
        }
        if (a10.g()) {
            int h11 = a10.h(3);
            if (bVar.f38829b == -1 && h10 >= 0 && h10 <= 15 && (h11 == 0 || h11 == 1)) {
                bVar.f38829b = h10;
            }
            if (a10.g()) {
                l(a10);
            }
        }
    }

    private static void i(A a10, b bVar) {
        a10.r(2);
        boolean g10 = a10.g();
        int h10 = a10.h(8);
        for (int i10 = 0; i10 < h10; i10++) {
            a10.r(2);
            if (a10.g()) {
                a10.r(5);
            }
            if (g10) {
                a10.r(24);
            } else {
                if (a10.g()) {
                    if (!a10.g()) {
                        a10.r(4);
                    }
                    bVar.f38830c = a10.h(6) + 1;
                }
                a10.r(4);
            }
        }
        if (a10.g()) {
            a10.r(3);
            if (a10.g()) {
                l(a10);
            }
        }
    }

    private static int j(A a10, int i10) {
        int i11 = 0;
        while (true) {
            int h10 = i11 + a10.h(i10);
            if (!a10.g()) {
                return h10;
            }
            i11 = (h10 + 1) << i10;
        }
    }

    private static boolean k(A a10) {
        if (a10.b() < 66) {
            return false;
        }
        a10.r(66);
        return true;
    }

    private static void l(A a10) {
        int h10 = a10.h(6);
        if (h10 < 2 || h10 > 42) {
            throw q3.B.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", new Object[]{Integer.valueOf(h10)}));
        }
        a10.r(h10 * 8);
    }
}
