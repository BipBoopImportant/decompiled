package nts;

/* renamed from: nts.આ  reason: contains not printable characters */
public abstract class C3701 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] f908 = null;

    /* renamed from: Е  reason: contains not printable characters */
    public int f909;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public C4124[] f910;

    /* renamed from: ખ  reason: contains not printable characters */
    public int f911;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f912;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f913;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f914;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f915 = null;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public C4124[] f916;

    /* renamed from: ϴ  reason: contains not printable characters */
    public abstract void m896();

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m897(int i10) {
        this.f909 = i10;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public abstract C4193 m899(byte[] bArr, byte[] bArr2);

    /* renamed from: ગ  reason: contains not printable characters */
    public void m901(byte[] bArr) {
        m900(bArr.length * 8);
        this.f915 = (byte[]) bArr.clone();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public abstract C4193 m903(byte[] bArr, byte[] bArr2);

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m905(byte[] bArr) {
        this.f914 = bArr.length * 8;
        this.f908 = (byte[]) bArr.clone();
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public abstract void m906();

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m907(int i10) {
        this.f911 = i10;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m908() {
        return this.f912;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 m898() {
        if (this.f915 == null) {
            m896();
        }
        if (this.f908 == null) {
            m906();
        }
        return m899(this.f915, this.f908);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4193 m902() {
        return m903(this.f915, this.f908);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m904(int i10) {
        for (int i11 = 0; i11 < this.f910.length; i11++) {
            C4124 r12 = this.f916[i11];
            if (r12.f3578 > 0) {
                for (int i12 = r12.f3577; i12 <= r12.f3576; i12 += r12.f3578) {
                    if (i12 == i10) {
                        this.f912 = i10;
                        return;
                    }
                }
                continue;
            } else {
                if (!(i10 == r12.f3577 || i10 == r12.f3576)) {
                }
                this.f912 = i10;
                return;
            }
        }
        throw new C3738(C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 41, 43, 79));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m900(int i10) {
        int i11 = 0;
        while (true) {
            C4124[] r22 = this.f910;
            if (i11 < r22.length) {
                C4124 r23 = r22[i11];
                int i12 = r23.f3577;
                while (i12 != i10) {
                    if (i12 == r23.f3576) {
                        i11++;
                    } else {
                        i12 += r23.f3578;
                    }
                }
                this.f913 = i10;
                return;
            }
            throw new C3738(C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 0, 41, 90));
        }
    }
}
