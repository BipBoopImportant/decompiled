package nts;

/* renamed from: nts.ঽ  reason: contains not printable characters */
public class C3691 extends C3910 {

    /* renamed from: и  reason: contains not printable characters */
    public long f891 = 0;

    /* renamed from: nts.ঽ$ગ  reason: contains not printable characters */
    public class C3692 extends C3755 implements C3776 {

        /* renamed from: ᘺ  reason: contains not printable characters */
        public C3983 f892;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3692(C3691 r18, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, long j10, boolean z10) {
            super(bArr2, 16, 16, 1, 1, 16);
            C3983 r82 = new C3983();
            this.f892 = r82;
            this.f104 = true;
            this.f102 = true;
            r82.m2372(bArr, bArr2, bArr3, (byte[]) null, i10, j10, true);
            this.f892.m2370(z10);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m864(byte[] bArr, byte[] bArr2, int i10) {
            this.f892.m2371(bArr, bArr2, (byte[]) null, i10);
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public void m867() {
            C3983 r02 = this.f892;
            byte[] r12 = r02.m2374(this.f99, true);
            r02.f2570 = true;
            this.f99 = r12;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m866(byte[] bArr, int i10, int i11) {
            return this.f892.m2373(bArr, i10, i11);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m865() {
            return this.f892.f2571;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m863(byte[] bArr) {
            throw new C3625(0, C3727.m1052("Q{ueiaf3|pqwm:haq&saf,", 0, 23, 3));
        }
    }

    /* renamed from: nts.ঽ$ഇ  reason: contains not printable characters */
    public class C3693 extends C3793 implements C3776 {

        /* renamed from: ᘺ  reason: contains not printable characters */
        public C3983 f893;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3693(C3691 r18, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, long j10, boolean z10) {
            super(bArr2, 16, 16, 1, 1, 16);
            C3983 r82 = new C3983();
            this.f893 = r82;
            this.f104 = true;
            this.f102 = true;
            r82.m2372(bArr, bArr2, bArr3, bArr4, 16, j10, false);
            this.f893.m2370(z10);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m869(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
            this.f893.m2371(bArr, bArr2, bArr3, i10);
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public void m872() {
            C3983 r02 = this.f893;
            byte[] r12 = r02.m2374(this.f99, false);
            r02.f2570 = false;
            this.f99 = r12;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m871(byte[] bArr, int i10, int i11) {
            return this.f893.m2373(bArr, i10, i11);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m870() {
            return this.f893.f2571;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m868(byte[] bArr) {
            this.f893.f2571 = bArr;
        }
    }

    public C3691() {
        this.f916 = new C4124[]{new C4124(128, 128, 0)};
        this.f910 = new C4124[]{new C4124(256, 256, 0)};
        this.f1848 = new C4124[]{new C4124(128, 128, 64)};
        this.f913 = 256;
        this.f912 = 128;
        this.f914 = 128;
        m2030(128);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m859() {
        m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3776 m860(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new C3692(this, bArr, bArr2, bArr3, this.f1850, this.f891, false);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m862() {
        m2029(C3990.m2428(12));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3776 m861(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return new C3693(this, bArr, bArr2, bArr3, bArr4, this.f891, false);
    }
}
