package nts;

import java.io.OutputStream;
import java.util.Vector;

/* renamed from: nts.а  reason: contains not printable characters */
public class C3590 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f334 = 0;

    /* renamed from: ગ  reason: contains not printable characters */
    public C3883 f335;

    /* renamed from: ഇ  reason: contains not printable characters */
    public OutputStream f336;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] f337 = new byte[1000];

    /* renamed from: ⶊ  reason: contains not printable characters */
    public boolean f338 = false;

    public C3590(OutputStream outputStream, C3883 r32) {
        new Vector();
        new Vector();
        this.f336 = outputStream;
        this.f335 = r32;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m348(byte[] bArr, int i10, int i11) {
        int i12 = this.f334;
        if (i12 != 0) {
            OutputStream outputStream = this.f336;
            if (outputStream != null) {
                outputStream.write(this.f337, 0, i12);
            }
            C3883 r02 = this.f335;
            if (r02 != null) {
                r02.m1942(this.f337, 0, this.f334);
            }
            this.f334 = 0;
        }
        if (i11 != 0) {
            OutputStream outputStream2 = this.f336;
            if (outputStream2 != null) {
                outputStream2.write(bArr, i10, i11);
            }
            C3883 r03 = this.f335;
            if (r03 != null) {
                r03.m1942(bArr, i10, i11);
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m347(int i10) {
        int i11 = this.f334;
        byte[] bArr = this.f337;
        if (i11 == bArr.length) {
            OutputStream outputStream = this.f336;
            if (outputStream != null) {
                outputStream.write(bArr, 0, bArr.length);
            }
            C3883 r02 = this.f335;
            if (r02 != null) {
                byte[] bArr2 = this.f337;
                r02.m1942(bArr2, 0, bArr2.length);
            }
            this.f334 = 0;
        }
        byte[] bArr3 = this.f337;
        int i12 = this.f334;
        this.f334 = i12 + 1;
        bArr3[i12] = (byte) i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m346() {
        m348((byte[]) null, 0, 0);
        OutputStream outputStream = this.f336;
        if (outputStream != null) {
            outputStream.flush();
        }
    }
}
