package nts;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;

/* renamed from: nts.Ớ  reason: contains not printable characters */
public class C4090 extends C3837 {

    /* renamed from: и  reason: contains not printable characters */
    public int f3471;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3646 f3472;

    public C4090() {
        this.f3472 = null;
        this.f3471 = 0;
        this.f3542 = 4;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3227(C3796 r52) {
        byte[] bArr = this.f3541;
        if (bArr.length == 0) {
            boolean z10 = C3596.f366;
            new Vector();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i10 = this.f3542 | 32;
            C3707 r22 = new C3707();
            if (i10 != 0) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream2.write(i10);
                    byteArrayOutputStream2.write(128);
                    r22.f933 = 2;
                    byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
                    if (r22.f933 != 0) {
                        byteArrayOutputStream2.write(new byte[2]);
                    }
                    r22.f934 = byteArrayOutputStream2.toByteArray();
                } catch (IOException e10) {
                    throw new C3625((Throwable) e10, C3625.m589(e10));
                }
            } else {
                r22.f934 = byteArrayOutputStream.toByteArray();
                r22.f933 = 0;
            }
            r52.m1336(r22);
            return;
        }
        r52.m1346(bArr, this.f3542);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r3 = r6.f3539;
     */
    /* renamed from: ⶊ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m3228(byte[] r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.f3540
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0055
        L_0x0006:
            boolean r0 = r6.f3546
            if (r0 != 0) goto L_0x00e8
            r6.f3538 = r2
            int r0 = r6.m3282(r7, r8)
            r6.f3540 = r1
            boolean r3 = r6.f3546
            if (r3 == 0) goto L_0x0018
            goto L_0x00e8
        L_0x0018:
            boolean r4 = r6.f3538
            if (r4 != 0) goto L_0x001f
            r6.f3538 = r1
            return r8
        L_0x001f:
            if (r3 == 0) goto L_0x0023
            goto L_0x00e8
        L_0x0023:
            int r3 = r6.f3548
            if (r3 <= 0) goto L_0x0054
            int r3 = r6.f3539
            int r4 = r0 + r3
            int r5 = r7.length
            if (r4 >= r5) goto L_0x0054
            nts.ټ r8 = r6.f3472
            if (r8 == 0) goto L_0x0036
            r8.m644(r7, r0, r3)
            goto L_0x0050
        L_0x0036:
            byte[] r8 = r6.f3541
            byte[] r8 = nts.C3823.m1636((byte[]) r8)
            int r3 = r8.length
            int r4 = r6.f3539
            int r3 = r3 + r4
            byte[] r3 = new byte[r3]
            r6.f3541 = r3
            int r4 = r8.length
            java.lang.System.arraycopy(r8, r2, r3, r2, r4)
            byte[] r3 = r6.f3541
            int r8 = r8.length
            int r4 = r6.f3539
            java.lang.System.arraycopy(r7, r0, r3, r8, r4)
        L_0x0050:
            int r8 = r6.f3539
            int r8 = r8 + r0
            goto L_0x0006
        L_0x0054:
            return r8
        L_0x0055:
            boolean r0 = r6.f3538
            if (r0 == 0) goto L_0x00c7
            int r3 = r6.f3539
            int r4 = r8 + r3
            int r5 = r7.length
            if (r4 > r5) goto L_0x00c7
            int r0 = r6.f3548
            r5 = 32
            r0 = r0 & r5
            if (r0 != r5) goto L_0x00b5
        L_0x0067:
            boolean r0 = r6.f3546
            if (r0 != 0) goto L_0x00b2
            if (r8 >= r4) goto L_0x00b2
            r6.f3538 = r2
            int r8 = r6.m3282(r7, r8)
            boolean r0 = r6.f3546
            if (r0 != 0) goto L_0x00b2
            if (r8 <= r4) goto L_0x007a
            goto L_0x00b2
        L_0x007a:
            boolean r0 = r6.f3538
            if (r0 != 0) goto L_0x0081
            r6.f3538 = r1
            goto L_0x00b2
        L_0x0081:
            int r0 = r6.f3548
            if (r0 <= 0) goto L_0x00b2
            int r0 = r6.f3539
            int r3 = r8 + r0
            int r5 = r7.length
            if (r3 > r5) goto L_0x00b2
            nts.ټ r3 = r6.f3472
            if (r3 == 0) goto L_0x0094
            r3.m644(r7, r8, r0)
            goto L_0x00ae
        L_0x0094:
            byte[] r0 = r6.f3541
            byte[] r0 = nts.C3823.m1636((byte[]) r0)
            int r3 = r0.length
            int r5 = r6.f3539
            int r3 = r3 + r5
            byte[] r3 = new byte[r3]
            r6.f3541 = r3
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r2, r3, r2, r5)
            byte[] r3 = r6.f3541
            int r0 = r0.length
            int r5 = r6.f3539
            java.lang.System.arraycopy(r7, r8, r3, r0, r5)
        L_0x00ae:
            int r0 = r6.f3539
            int r8 = r8 + r0
            goto L_0x0067
        L_0x00b2:
            r6.f3546 = r1
            return r4
        L_0x00b5:
            nts.ټ r0 = r6.f3472
            if (r0 == 0) goto L_0x00bd
            r0.m644(r7, r8, r3)
            goto L_0x00c3
        L_0x00bd:
            byte[] r0 = nts.C3823.m1630(r7, r8, r3)
            r6.f3541 = r0
        L_0x00c3:
            int r0 = r6.f3539
            int r8 = r8 + r0
            goto L_0x00e8
        L_0x00c7:
            if (r0 == 0) goto L_0x00ed
            nts.ټ r0 = r6.f3472
            if (r0 == 0) goto L_0x00ed
            int r0 = r6.f3539
            int r1 = r6.f3471
            int r0 = r0 - r1
            int r1 = r7.length
            int r1 = r1 - r8
            int r0 = java.lang.Math.min(r0, r1)
            nts.ټ r1 = r6.f3472
            r1.m644(r7, r8, r0)
            int r8 = r8 + r0
            int r1 = r6.f3471
            int r1 = r1 + r0
            r6.f3471 = r1
            int r0 = r6.f3539
            if (r1 >= r0) goto L_0x00e8
            return r8
        L_0x00e8:
            int r7 = r6.m3274(r7, r8)
            return r7
        L_0x00ed:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4090.m3228(byte[], int):int");
    }

    public C4090(C3646 r22) {
        this.f3542 = 4;
        this.f3472 = r22;
        this.f3471 = 0;
    }
}
