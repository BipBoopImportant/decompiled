package nts;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: nts.ߦ  reason: contains not printable characters */
public class C3664 extends OutputStream {

    /* renamed from: ϴ  reason: contains not printable characters */
    public boolean f778;

    /* renamed from: ગ  reason: contains not printable characters */
    public C3590 f779;

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4204 f780;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean f781;

    public C3664() {
        this.f781 = false;
        this.f779 = null;
        this.f780 = null;
        this.f778 = false;
    }

    public void close() {
        if (!this.f778) {
            if (!this.f781) {
                m718();
            }
            C4204 r02 = this.f780;
            r02.f4062.f3344 = 1;
            while (true) {
                C4070 r12 = r02.f4062;
                if (r12.f3344 == 2 && r12.f3346.m3245()) {
                    break;
                }
                r02.m3760();
            }
            r02.f4064.m346();
            m719();
            this.f779.m346();
            C3590 r03 = this.f779;
            r03.m348((byte[]) null, 0, 0);
            OutputStream outputStream = r03.f336;
            if (outputStream != null && r03.f338) {
                outputStream.close();
            }
            this.f778 = true;
        }
    }

    public void flush() {
        if (!this.f778) {
            C4204 r02 = this.f780;
            r02.f4062.f3344 = 3;
            while (true) {
                C4070 r12 = r02.f4062;
                if (r12.f3344 == 0 && r12.f3346.m3245()) {
                    C4070 r13 = r02.f4062;
                    byte[] bArr = r02.f4063;
                    int length = bArr.length;
                    C4096 r52 = r13.f3346;
                    if (r52.f3490 > 0) {
                        r52.m3244(0, 3);
                        r13.f3346.m3243();
                        r13.f3346.m3244(0, 16);
                        r13.f3346.m3244(65535, 16);
                    }
                    int r14 = r13.f3346.m3242(bArr, 0, length);
                    if (r14 > 0) {
                        r02.f4064.m348(r02.f4063, 0, r14);
                    }
                    r02.f4064.m346();
                    this.f779.m346();
                    return;
                } else if (r02.m3760() <= 0) {
                    C4070 r15 = r02.f4062;
                    if (r15.f3344 != 0 || !r15.f3346.m3245()) {
                    }
                }
            }
            throw new C3625((Throwable) null, 199, C3727.m1052("+\r\u0006\u0002\f\fK\u001e\nD\u0003\u0003\u0007\f\u0002\u0016\u0018\\\u0016\u0010\t\r\u000fTwMACJB\u0004QE\u000bLLHCMYW\u0013Q]Z\u0017][JNL\u0017", 24, 28, 38));
        }
        throw new IOException(C3727.m1052("+\u0010\u0012\u0017\u0015\u0015B\u0010\u0018\u001f\u000b\u000e\u0005I\u001d\n\u0007U\u0017\u001b\u0002\u0014\u0013\u0017\u0005]\u001d\u0013\u0017\n\u001f\u001fj\u000312 ?g-+..0i!:8m=5p39\":1)uAzx}(zruado#w`m?}qh~y}o7wy}`uu\u0000", 59, 33, 20));
    }

    public void write(int i10) {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m718() {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m719() {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m720(int i10) {
        C4204 r02 = this.f780;
        r02.f4064.m347((byte) i10);
        r02.f4064.m347((byte) (i10 >> 8));
        r02.f4064.m347((byte) (i10 >> 16));
        r02.f4064.m347((byte) (i10 >> 24));
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r9 = r9 - r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f778
            java.lang.String r1 = "+\u0010\u0012\u0017\u0015\u0015B\u0010\u0018\u001f\u000b\u000e\u0005I\u001d\n\u0007U\u0017\u001b\u0002\u0014\u0013\u0017\u0005]\u001d\u0013\u0017\n\u001f\u001fj\u000312 ?g-+..0i!:8m=5p39\":1)uAzx}(zruado#w`m?}qh~y}o7wy}`uu\u0000"
            r2 = 33
            r3 = 0
            if (r0 != 0) goto L_0x0077
            if (r8 < 0) goto L_0x0069
            int r0 = r8 + r9
            int r4 = r7.length
            if (r0 > r4) goto L_0x0069
            boolean r0 = r6.f781
            if (r0 != 0) goto L_0x001a
            r6.m718()
            r0 = 1
            r6.f781 = r0
        L_0x001a:
            nts.カ r0 = r6.f780
            r0.getClass()
        L_0x001f:
            if (r9 <= 0) goto L_0x0068
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r9 >= r1) goto L_0x0026
            r1 = r9
        L_0x0026:
            nts.ᶞ r2 = r0.f4062
            r2.f3343 = r7
            r2.f3350 = r8
            int r8 = r8 + r1
            r2.f3351 = r8
        L_0x002f:
            nts.ᶞ r2 = r0.f4062
            int r4 = r2.f3350
            int r5 = r2.f3351
            if (r4 != r5) goto L_0x0041
            nts.Ἢ r2 = r2.f3346
            boolean r2 = r2.m3245()
            if (r2 == 0) goto L_0x0041
            int r9 = r9 - r1
            goto L_0x001f
        L_0x0041:
            int r2 = r0.m3760()
            if (r2 > 0) goto L_0x002f
            nts.ᶞ r2 = r0.f4062
            int r4 = r2.f3350
            int r5 = r2.f3351
            if (r4 != r5) goto L_0x0058
            nts.Ἢ r2 = r2.f3346
            boolean r2 = r2.m3245()
            if (r2 == 0) goto L_0x0058
            goto L_0x002f
        L_0x0058:
            java.io.IOException r7 = new java.io.IOException
            r8 = 24
            r9 = 117(0x75, float:1.64E-43)
            java.lang.String r0 = "+\r\u0006\u0002\f\fK\u001e\nD\u0003\u0003\u0007\f\u0002\u0016\u0018\\\u0016\u0010\t\r\u000fTwMACJB\u0004QE\u000bLLHCMYW\u0013Q]Z\u0017][JNL\u0017"
            java.lang.String r8 = nts.C3727.m1052((java.lang.String) r0, (int) r3, (int) r8, (int) r9)
            r7.<init>(r8)
            throw r7
        L_0x0068:
            return
        L_0x0069:
            java.lang.ArrayIndexOutOfBoundsException r7 = new java.lang.ArrayIndexOutOfBoundsException
            r8 = 26
            r9 = 121(0x79, float:1.7E-43)
            java.lang.String r8 = nts.C3727.m1052((java.lang.String) r1, (int) r2, (int) r8, (int) r9)
            r7.<init>(r8)
            throw r7
        L_0x0077:
            java.io.IOException r7 = new java.io.IOException
            r8 = 69
            java.lang.String r8 = nts.C3727.m1052((java.lang.String) r1, (int) r3, (int) r2, (int) r8)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3664.write(byte[], int, int):void");
    }

    public C3664(OutputStream outputStream) {
        this.f780 = null;
        this.f779 = null;
        this.f781 = false;
        this.f778 = true;
        C3590 r22 = new C3590(outputStream, (C3883) null);
        this.f779 = r22;
        this.f780 = new C4204(r22);
        this.f781 = false;
        this.f778 = false;
    }
}
