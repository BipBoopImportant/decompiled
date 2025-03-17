package nts;

import java.io.OutputStream;

/* renamed from: nts.ᣲ  reason: contains not printable characters */
public class C3991 extends C3664 {

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static byte[] f2632 = {120, -100};

    /* renamed from: ⶏ  reason: contains not printable characters */
    public C3698 f2633 = new C3698();

    public C3991(OutputStream outputStream) {
        super(outputStream);
    }

    public void write(byte[] bArr, int i10, int i11) {
        super.write(bArr, i10, i11);
        this.f2633.m891(bArr, i10, i11);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m2439() {
        this.f779.m348(f2632, 0, 2);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2440() {
        byte[] r02 = this.f2633.m889();
        this.f779.m348(r02, 0, r02.length);
    }
}
