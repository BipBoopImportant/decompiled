package nts;

/* renamed from: nts.ᗹ  reason: contains not printable characters */
public class C3932 extends C3638 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public C4193 f2225;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public byte[] f2226;

    /* renamed from: ખ  reason: contains not printable characters */
    public int f2227;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3935 f2228;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f2229;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f2230;

    public C3932(C3935 r12, byte[] bArr, byte[] bArr2, int i10, int i11) {
        this.f625 = i10;
        this.f2228 = r12;
        r12.m907(1);
        this.f2228.m897(i11);
        this.f2229 = bArr;
        this.f2230 = bArr2;
        this.f2226 = new byte[(r12.m908() / 8)];
        m2090();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m2090() {
        this.f2227 = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f2226;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = 0;
            i10++;
        }
        C4193 r02 = this.f2225;
        if (r02 == null || !r02.m3721()) {
            this.f2225 = this.f2228.m899(this.f2229, this.f2230);
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m2091(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f2226;
        int length = bArr2.length;
        int i12 = this.f2227;
        int i13 = length - i12;
        if (i11 > i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i13);
            try {
                C4193 r12 = this.f2225;
                byte[] bArr3 = this.f2226;
                r12.m3722(bArr3, 0, length, bArr3, 0);
                this.f2227 = 0;
                i11 -= i13;
                i10 += i13;
                while (i11 > length) {
                    try {
                        this.f2225.m3722(bArr, i10, length, this.f2226, 0);
                        i11 -= length;
                        i10 += length;
                    } catch (Exception e10) {
                        throw new C3738(e10.toString());
                    }
                }
            } catch (Exception e11) {
                throw new C3738(e11.toString());
            }
        }
        System.arraycopy(bArr, i10, this.f2226, this.f2227, i11);
        this.f2227 += i11;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2092(byte b10) {
        int i10 = this.f2227;
        byte[] bArr = this.f2226;
        if (i10 == bArr.length) {
            try {
                this.f2225.m3722(bArr, 0, bArr.length, bArr, 0);
                this.f2227 = 0;
            } catch (Exception e10) {
                throw new C3738(e10.toString());
            }
        }
        byte[] bArr2 = this.f2226;
        int i11 = this.f2227;
        this.f2227 = i11 + 1;
        bArr2[i11] = b10;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m2093() {
        try {
            byte[] r02 = this.f2225.m3723(this.f2226, 0, this.f2227);
            int i10 = this.f2227;
            int i11 = this.f2228.f912 / 8;
            if (i10 == i11) {
                byte[] bArr = new byte[i11];
                System.arraycopy(r02, 0, bArr, 0, i11);
                r02 = bArr;
            }
            m2090();
            return r02;
        } catch (Exception e10) {
            throw new C3738(e10.toString());
        }
    }
}
