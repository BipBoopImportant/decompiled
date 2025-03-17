package nts;

import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;

/* renamed from: nts.ᄘ  reason: contains not printable characters */
public class C3784 extends C3903 {

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static BigInteger f1289;

    /* renamed from: ϴ  reason: contains not printable characters */
    public BigInteger f1290;

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f1291;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public BigInteger f1292;

    /* renamed from: ખ  reason: contains not printable characters */
    public BigInteger f1293;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int f1294;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public BigInteger f1295;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public BigInteger f1296;

    static {
        BigInteger valueOf = BigInteger.valueOf(2);
        f1289 = valueOf;
        valueOf.pow(160);
    }

    public C3784() {
        this(false);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1272(C4097 r62) {
        if (r62.f3494 != null) {
            BigInteger bigInteger = new BigInteger(1, r62.f3494);
            if (!(bigInteger.intValue() == 0 || r62.f3493 == null)) {
                BigInteger bigInteger2 = new BigInteger(1, r62.f3493);
                if (!(bigInteger2.intValue() == 0 || r62.f3495 == null || (r62.f3492 == null && r62.f3496 == null))) {
                    if (!this.f1291 || C3990.m2427(this.f3574, bigInteger.bitLength())) {
                        this.f3575 = bigInteger.bitLength();
                        this.f1290 = bigInteger;
                        this.f1295 = bigInteger2;
                        this.f1296 = new BigInteger(1, r62.f3495);
                        if (r62.f3492 != null) {
                            this.f1292 = new BigInteger(1, r62.f3492);
                        }
                        if (r62.f3496 != null) {
                            this.f1293 = new BigInteger(1, r62.f3496);
                            return;
                        }
                        return;
                    }
                    C3990.m2422(this.f3574);
                    throw null;
                }
            }
        }
        throw new C3738(C3727.m1052("AUSxVE]lzk\u000b\\L\\NMDVFVV\u0006IWM\u001aHYI\u0010\f/#\"$>i;.!+d4+5(0+)|:z)*> 4 6r:5\u0016@\u0015/)-+2(g; -%-9;=5q4<&87#jH^YTZV[U\u0010wat\u0014GW[IFOYI]]\u0001AQG\u0005MIPxtr~3eqw\\ray½§­Üé÷éõíéðìþãüáâ¬¶¼ÎÎÌÁÜÀÆÙÎÁÄÕË×ÉÏÏÓÏÍÖÏÒÉ×æêç¶«·±®¹¶³¢¼ ¾¸¸¤¸º¡¸¥¾£êéëëöêìóäëîÿáýãååùåçüåøãÿìöüF\\FR]U#%,\u0014\u0002\u0013s'<199-/)9.~-%07*6 f\u0014\u0000\b{gl\u001e\u0006\u000eBDD_T&>6KANW\\.6>UPPOD6.&Z[^GL\u0002\u001cOBXBVYQ'!(7ymk@n}eA[Q \n\u0014\n\u0016\u000e\n\u0013\u000f\u001d\u0000\u001f\u0002\u0001\f\u0016\u001cnnl\u0003\u001e\u0002\u0004\u001b\f\u0003\u0006\u0017\t\u0015\u000b\r\r\u0011\r\u000f\u0014\r\u0010\u000b\u0015û÷úÛÁË¾½¿¦¼¶ÄÃÄóéóçèàÏÙÈ¨üçêââöôòâõ¥öþëìñíû½ÏÛÓ ¼·ÅÝÕýåíõíåíõýÙÇüúóì{oiBlg8,*\u001a'(\",662$M[J*}m}olewgww'hvl;ixh1\u0001\u001c\u001f\u001aWC@\u0019\u0016\u0017M\u0015VJ\b\u0014\u001eWIJMLPNH_\u000b\u001f\u0019\u0010\u0004\u001f.k/9,a<& q", 88, 37, 68));
    }

    public C3784(boolean z10) {
        new C3610();
        this.f1290 = null;
        this.f1295 = null;
        this.f1296 = null;
        this.f1292 = null;
        this.f1293 = null;
        this.f1294 = 0;
        this.f1291 = z10;
        this.f3574 = new C4124[]{new C4124(512, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, 64)};
        this.f3575 = 1024;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        r4 = r11[3];
        r5 = r4 & 255;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m1273(byte[] r9, java.lang.String r10, byte[] r11) {
        /*
            r8 = this;
            java.lang.String r0 = "AUSxVE]lzk\u000b\\L\\NMDVFVV\u0006IWM\u001aHYI\u0010\f/#\"$>i;.!+d4+5(0+)|:z)*> 4 6r:5\u0016@\u0015/)-+2(g; -%-9;=5q4<&87#jH^YTZV[U\u0010wat\u0014GW[IFOYI]]\u0001AQG\u0005MIPxtr~3eqw\\ray½§­Üé÷éõíéðìþãüáâ¬¶¼ÎÎÌÁÜÀÆÙÎÁÄÕË×ÉÏÏÓÏÍÖÏÒÉ×æêç¶«·±®¹¶³¢¼ ¾¸¸¤¸º¡¸¥¾£êéëëöêìóäëîÿáýãååùåçüåøãÿìöüF\\FR]U#%,\u0014\u0002\u0013s'<199-/)9.~-%07*6 f\u0014\u0000\b{gl\u001e\u0006\u000eBDD_T&>6KANW\\.6>UPPOD6.&Z[^GL\u0002\u001cOBXBVYQ'!(7ymk@n}eA[Q \n\u0014\n\u0016\u000e\n\u0013\u000f\u001d\u0000\u001f\u0002\u0001\f\u0016\u001cnnl\u0003\u001e\u0002\u0004\u001b\f\u0003\u0006\u0017\t\u0015\u000b\r\r\u0011\r\u000f\u0014\r\u0010\u000b\u0015û÷úÛÁË¾½¿¦¼¶ÄÃÄóéóçèàÏÙÈ¨üçêââöôòâõ¥öþëìñíû½ÏÛÓ ¼·ÅÝÕýåíõíåíõýÙÇüúóì{oiBlg8,*\u001a'(\",662$M[J*}m}olewgww'hvl;ixh1\u0001\u001c\u001f\u001aWC@\u0019\u0016\u0017M\u0015VJ\b\u0014\u001eWIJMLPNH_\u000b\u001f\u0019\u0010\u0004\u001f.k/9,a<& q"
            if (r9 == 0) goto L_0x01b9
            if (r10 == 0) goto L_0x01a9
            r1 = 351(0x15f, float:4.92E-43)
            r2 = 73
            r3 = 4
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r3, (int) r2)
            boolean r1 = r10.equals(r1)
            r2 = 6
            if (r1 != 0) goto L_0x00a8
            r1 = 13
            r4 = 85
            r5 = 355(0x163, float:4.97E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r5, (int) r1, (int) r4)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a8
            r1 = 368(0x170, float:5.16E-43)
            r4 = 41
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r2, (int) r4)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a8
            r1 = 374(0x176, float:5.24E-43)
            r4 = 81
            r5 = 22
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r5, (int) r4)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a8
            r1 = 396(0x18c, float:5.55E-43)
            r4 = 65
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r2, (int) r4)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a8
            r1 = 402(0x192, float:5.63E-43)
            r4 = 35
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r5, (int) r4)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a8
            r1 = 424(0x1a8, float:5.94E-43)
            r4 = 38
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r2, (int) r4)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a8
            r1 = 430(0x1ae, float:6.03E-43)
            r4 = 28
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r5, (int) r4)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a8
            r1 = 452(0x1c4, float:6.33E-43)
            r4 = 55
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r2, (int) r4)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a8
            r1 = 458(0x1ca, float:6.42E-43)
            r4 = 106(0x6a, float:1.49E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r5, (int) r4)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a8
            r1 = 9
            r4 = 72
            r5 = 480(0x1e0, float:6.73E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r5, (int) r1, (int) r4)
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x01a9
        L_0x00a8:
            if (r11 == 0) goto L_0x0199
            java.math.BigInteger r10 = r8.f1296
            if (r10 == 0) goto L_0x0189
            int r10 = r11.length
            int r0 = r9.length
            r1 = 0
            if (r10 >= r0) goto L_0x00b5
            goto L_0x0188
        L_0x00b5:
            int r10 = r11.length
            r0 = 1
            if (r10 >= r2) goto L_0x00ba
            goto L_0x0104
        L_0x00ba:
            byte r10 = r11[r1]
            r2 = 48
            if (r10 == r2) goto L_0x00c1
            goto L_0x0104
        L_0x00c1:
            byte r10 = r11[r0]
            r2 = r10 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r0
            int r4 = r11.length
            if (r2 <= r4) goto L_0x00ca
            goto L_0x0104
        L_0x00ca:
            r2 = 2
            byte r4 = r11[r2]
            if (r4 == r2) goto L_0x00d0
            goto L_0x0104
        L_0x00d0:
            r4 = 3
            byte r4 = r11[r4]
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r5 + 4
            int r7 = r11.length
            if (r6 < r7) goto L_0x00db
            goto L_0x0104
        L_0x00db:
            int r5 = r5 + 5
            byte r6 = r11[r6]
            if (r6 == r2) goto L_0x00e2
            goto L_0x0104
        L_0x00e2:
            byte r2 = r11[r5]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r2
            int r2 = r11.length
            if (r5 >= r2) goto L_0x0104
            byte[] r2 = new byte[r4]
            java.lang.System.arraycopy(r11, r3, r2, r1, r4)
            int r5 = r4 + 5
            int r6 = r4 + 6
            byte r5 = r11[r5]
            if (r5 > 0) goto L_0x00f9
            goto L_0x0188
        L_0x00f9:
            byte[] r7 = new byte[r5]
            java.lang.System.arraycopy(r11, r6, r7, r1, r5)
            int r5 = r5 + r4
            int r5 = r5 + r3
            if (r10 == r5) goto L_0x011b
            goto L_0x0188
        L_0x0104:
            int r10 = r9.length
            byte[] r2 = new byte[r10]
            int r10 = r9.length
            java.lang.System.arraycopy(r11, r1, r2, r1, r10)
            int r10 = r11.length
            int r3 = r9.length
            int r10 = r10 - r3
            if (r10 > 0) goto L_0x0112
            goto L_0x0188
        L_0x0112:
            byte[] r7 = new byte[r10]
            int r10 = r9.length
            int r3 = r11.length
            int r4 = r9.length
            int r3 = r3 - r4
            java.lang.System.arraycopy(r11, r10, r7, r1, r3)
        L_0x011b:
            java.math.BigInteger r10 = new java.math.BigInteger
            r10.<init>(r0, r2)
            java.math.BigInteger r11 = new java.math.BigInteger
            r11.<init>(r0, r7)
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            int r3 = r2.compareTo(r10)
            if (r3 >= 0) goto L_0x0188
            java.math.BigInteger r3 = r8.f1295
            int r3 = r3.compareTo(r10)
            if (r3 > 0) goto L_0x0136
            goto L_0x0188
        L_0x0136:
            int r2 = r2.compareTo(r11)
            if (r2 >= 0) goto L_0x0188
            java.math.BigInteger r2 = r8.f1295
            int r2 = r2.compareTo(r11)
            if (r2 > 0) goto L_0x0145
            goto L_0x0188
        L_0x0145:
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0, r9)
            java.math.BigInteger r9 = r8.f1295
            java.math.BigInteger r9 = r11.modInverse(r9)
            java.math.BigInteger r11 = r1.multiply(r9)
            java.math.BigInteger r0 = r8.f1295
            java.math.BigInteger r11 = r11.mod(r0)
            java.math.BigInteger r9 = r10.multiply(r9)
            java.math.BigInteger r0 = r8.f1295
            java.math.BigInteger r9 = r9.mod(r0)
            java.math.BigInteger r0 = r8.f1296
            java.math.BigInteger r1 = r8.f1290
            java.math.BigInteger r11 = r0.modPow(r11, r1)
            java.math.BigInteger r0 = r8.f1292
            java.math.BigInteger r1 = r8.f1290
            java.math.BigInteger r9 = r0.modPow(r9, r1)
            java.math.BigInteger r9 = r11.multiply(r9)
            java.math.BigInteger r11 = r8.f1290
            java.math.BigInteger r9 = r9.mod(r11)
            java.math.BigInteger r11 = r8.f1295
            java.math.BigInteger r9 = r9.mod(r11)
            boolean r1 = r9.equals(r10)
        L_0x0188:
            return r1
        L_0x0189:
            nts.ඍ r9 = new nts.ඍ
            r10 = 23
            r11 = 88
            r1 = 582(0x246, float:8.16E-43)
            java.lang.String r10 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r10, (int) r11)
            r9.<init>(r10)
            throw r9
        L_0x0199:
            nts.ػ r9 = new nts.ػ
            r10 = 12
            r11 = 124(0x7c, float:1.74E-43)
            r1 = 570(0x23a, float:7.99E-43)
            java.lang.String r10 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r10, (int) r11)
            r9.<init>(r10)
            throw r9
        L_0x01a9:
            nts.ඍ r9 = new nts.ඍ
            r10 = 74
            r11 = 40
            r1 = 489(0x1e9, float:6.85E-43)
            java.lang.String r10 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r10, (int) r11)
            r9.<init>(r10)
            throw r9
        L_0x01b9:
            nts.ػ r9 = new nts.ػ
            r10 = 7
            r11 = 84
            r1 = 344(0x158, float:4.82E-43)
            java.lang.String r10 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r10, (int) r11)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3784.m1273(byte[], java.lang.String, byte[]):boolean");
    }
}
