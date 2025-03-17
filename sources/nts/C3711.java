package nts;

/* renamed from: nts.ଅ  reason: contains not printable characters */
public abstract class C3711 implements C3900 {

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 f955;

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3701 f956;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean f957;

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] m993(byte[] bArr, int i10, int i11, boolean z10) {
        if (z10) {
            return this.f955.m3723(bArr, i10, i11);
        }
        byte[] bArr2 = new byte[i11];
        int r72 = this.f955.m3722(bArr, i10, i11, bArr2, 0);
        if (r72 == i11) {
            return bArr2;
        }
        byte[] bArr3 = new byte[r72];
        System.arraycopy(bArr2, 0, bArr3, 0, r72);
        return bArr3;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m994(byte[] bArr, int i10, int i11, boolean z10) {
        if (z10) {
            byte[] r82 = this.f955.m3723(bArr, i10, i11);
            byte[] r92 = ((C3776) this.f955).m1256();
            byte[] bArr2 = new byte[(r82.length + r92.length)];
            System.arraycopy(r82, 0, bArr2, 0, r82.length);
            System.arraycopy(r92, 0, bArr2, r82.length, r92.length);
            return bArr2;
        }
        byte[] bArr3 = new byte[i11];
        int r83 = this.f955.m3722(bArr, i10, i11, bArr3, 0);
        if (r83 == i11) {
            return bArr3;
        }
        byte[] bArr4 = new byte[r83];
        System.arraycopy(bArr3, 0, bArr4, 0, r83);
        return bArr4;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m996(byte[] bArr, int i10, int i11, boolean z10) {
        if (z10) {
            return this.f955.m3723(bArr, i10, i11);
        }
        byte[] bArr2 = new byte[i11];
        int r72 = this.f955.m3722(bArr, i10, i11, bArr2, 0);
        if (r72 == i11) {
            return bArr2;
        }
        byte[] bArr3 = new byte[r72];
        System.arraycopy(bArr2, 0, bArr3, 0, r72);
        return bArr3;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m997(byte[] bArr, int i10, int i11, boolean z10) {
        if (z10) {
            int i12 = ((C3910) this.f956).f1850 / 8;
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, (i10 + i11) - i12, bArr2, 0, i12);
            ((C3776) this.f955).m1255(bArr2);
            return this.f955.m3723(bArr, i10, i11 - i12);
        }
        byte[] bArr3 = new byte[i11];
        int r82 = this.f955.m3722(bArr, i10, i11, bArr3, 0);
        if (r82 == i11) {
            return bArr3;
        }
        byte[] bArr4 = new byte[r82];
        System.arraycopy(bArr3, 0, bArr4, 0, r82);
        return bArr4;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m995(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr.length > 0) {
            C3701 r02 = this.f956;
            if (r02 instanceof C3935) {
                ((C3935) r02).m905(bArr);
            } else {
                r02.m905(bArr);
            }
        }
        ((C3910) this.f956).m2030(i10 * 8);
        C3910 r32 = (C3910) this.f956;
        r32.getClass();
        r32.f1849 = (byte[]) bArr2.clone();
        if (this.f957) {
            this.f955 = this.f956.m902();
        } else {
            this.f955 = this.f956.m898();
        }
    }
}
