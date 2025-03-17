package nts;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* renamed from: nts.δ  reason: contains not printable characters */
public class C3569 extends C4191 {
    public C3569() {
        this.f625 = 512;
        this.f4029 = ModuleDescriptor.MODULE_VERSION;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m218() {
        byte[] bArr = this.f4031;
        int i10 = this.f4028;
        int i11 = this.f4029;
        byte[] bArr2 = new byte[((i10 + i11) - (i10 % i11))];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        bArr2[i10] = 31;
        int i12 = this.f4029 - 1;
        bArr2[i12] = (byte) (bArr2[i12] ^ Byte.MIN_VALUE);
        this.f624 = new byte[(this.f625 / 8)];
        int i13 = 0;
        while (i13 < this.f625 / 8) {
            m3704(bArr2, this.f4029);
            for (int i14 = 0; i14 < 5; i14++) {
                for (int i15 = 0; i15 < 5; i15++) {
                    if ((i14 * 5) + i15 < this.f4029 / 8) {
                        long j10 = this.f4030[i15][i14];
                        for (int i16 = 0; i16 < 8 && i13 < this.f625 / 8; i16++) {
                            this.f624[i13] = (byte) ((int) j10);
                            i13++;
                            j10 >>= 8;
                        }
                    }
                }
            }
            bArr2 = new byte[this.f4029];
        }
        return this.f624;
    }
}
