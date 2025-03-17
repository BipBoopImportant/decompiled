package nts;

/* renamed from: nts.ሐ  reason: contains not printable characters */
public class C3811 extends C3910 {

    /* renamed from: nts.ሐ$ગ  reason: contains not printable characters */
    public class C3812 extends C3755 implements C3776 {

        /* renamed from: и  reason: contains not printable characters */
        public byte[] f1513;

        /* renamed from: ࡑ  reason: contains not printable characters */
        public byte[] f1514;

        /* renamed from: ᖑ  reason: contains not printable characters */
        public int f1515;

        /* renamed from: ᘺ  reason: contains not printable characters */
        public C3761 f1516;

        public C3812(C3811 r82, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11) {
            super(bArr2, 16, 16, 1, 1, i11);
            C3761 r83 = new C3761();
            this.f1516 = r83;
            this.f104 = true;
            this.f102 = true;
            int[] iArr = new int[64];
            r83.f1202 = iArr;
            this.f1514 = bArr2;
            this.f1513 = bArr3;
            this.f1515 = i10;
            r83.f1200 = C3724.m1025(bArr, 0, bArr.length, iArr, new int[64]);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m1556(byte[] bArr) {
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public void m1560() {
            this.f99 = m1561(this.f99);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m1557(byte[] bArr, byte[] bArr2, int i10) {
            this.f1514 = bArr;
            this.f1513 = bArr2;
            this.f1515 = i10;
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public byte[] m1561(byte[] bArr) {
            C3761 r02 = this.f1516;
            if (r02.f1212 != 2) {
                C3795.m1310(r02);
                C3795.m1311(this.f1516, this.f1514);
                C3795.m1315(this.f1516, this.f1513);
            }
            byte[] bArr2 = new byte[bArr.length];
            C3795.m1316(this.f1516, bArr, bArr2, true);
            return bArr2;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1559(byte[] bArr, int i10, int i11) {
            if (i10 + i11 <= bArr.length) {
                byte[] bArr2 = new byte[i11];
                byte[] bArr3 = new byte[i11];
                System.arraycopy(bArr, i10, bArr3, 0, i11);
                byte[] r42 = m1561(bArr3);
                byte[] bArr4 = new byte[(this.f1515 / 8)];
                C3795.m1317(this.f1516, bArr4);
                this.f1516.f1209 = bArr4;
                return r42;
            }
            throw new Exception(C3727.m1052("v^]IXH\u001f__T\u0013^PZPBA\bHE@NF@@TJMK\u0004@I|k;xxeppu0q}`zse)gm*l~}ox.\u000e&%1 0g'',k&(\"(:9p0=86>88,253|81\u0004\u0013C\u0000\u0000\u001d\b\b\rH\t\u0005\u0018\u0002\u000b\u001dQ\u001f\u0015R\u0014\u0006\u0005\u0017\u0000V\f8={1(-+p37s'%34!/#.(cÞøó÷ùù¾ëÿ±öö÷çïçü³ªââûïãéå¢àíõîâÊÎÚÛ", 0, 58, 3));
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1558() {
            return this.f1516.f1209;
        }
    }

    /* renamed from: nts.ሐ$ഇ  reason: contains not printable characters */
    public class C3813 extends C3793 implements C3776 {

        /* renamed from: и  reason: contains not printable characters */
        public byte[] f1517;

        /* renamed from: ࡑ  reason: contains not printable characters */
        public byte[] f1518;

        /* renamed from: ᖑ  reason: contains not printable characters */
        public byte[] f1519;

        /* renamed from: ᘺ  reason: contains not printable characters */
        public C3761 f1520;

        /* renamed from: ᜇ  reason: contains not printable characters */
        public int f1521;

        public C3813(C3811 r82, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i10, int i11) {
            super(bArr2, 16, 16, 1, 1, i11);
            C3761 r83 = new C3761();
            this.f1520 = r83;
            this.f104 = true;
            this.f102 = true;
            int[] iArr = new int[64];
            r83.f1202 = iArr;
            this.f1518 = bArr2;
            this.f1517 = bArr3;
            this.f1519 = bArr4;
            this.f1521 = i10;
            r83.f1200 = C3724.m1025(bArr, 0, bArr.length, iArr, new int[64]);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m1563(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
            this.f1518 = bArr;
            this.f1517 = bArr2;
            this.f1519 = bArr3;
            this.f1521 = i10;
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public void m1566() {
            this.f99 = m1567(this.f99);
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public byte[] m1567(byte[] bArr) {
            C3761 r02 = this.f1520;
            if (r02.f1212 != 2) {
                C3795.m1310(r02);
                C3795.m1311(this.f1520, this.f1518);
                C3795.m1315(this.f1520, this.f1517);
            }
            byte[] bArr2 = new byte[bArr.length];
            C3795.m1316(this.f1520, bArr2, bArr, false);
            return bArr2;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1565(byte[] bArr, int i10, int i11) {
            if (i10 + i11 <= bArr.length) {
                int i12 = 0;
                if (this.f1519.length > 0 || this.f1521 == 0) {
                    String r02 = C3727.m1052("v^]IXH\u001f__T\u0013^PZPBA\bHE@NF@@TJMK\u0004@I|k;xxeppu0q}`zse)gm*l~}ox.\u000e&%1 0g'',k&(\"(:9p0=86>88,253|81\u0004\u0013C\u0000\u0000\u001d\b\b\rH\t\u0005\u0018\u0002\u000b\u001dQ\u001f\u0015R\u0014\u0006\u0005\u0017\u0000V\f8={1(-+p37s'%34!/#.(cÞøó÷ùù¾ëÿ±öö÷çïçü³ªââûïãéå¢àíõîâÊÎÚÛ", 138, 38, 52);
                    if (this.f1521 / 8 == this.f1519.length) {
                        byte[] bArr2 = new byte[i11];
                        System.arraycopy(bArr, i10, bArr2, 0, i11);
                        byte[] r72 = m1567(bArr2);
                        byte[] bArr3 = new byte[this.f1519.length];
                        C3795.m1317(this.f1520, bArr3);
                        while (true) {
                            byte[] bArr4 = this.f1519;
                            if (i12 >= bArr4.length) {
                                return r72;
                            }
                            if (bArr3[i12] == bArr4[i12]) {
                                i12++;
                            } else {
                                throw new C3625((Throwable) null, 2001, r02);
                            }
                        }
                    } else {
                        throw new C3625((Throwable) null, 2001, r02);
                    }
                } else {
                    throw new C3625(0, C3727.m1052("v^]IXH\u001f__T\u0013^PZPBA\bHE@NF@@TJMK\u0004@I|k;xxeppu0q}`zse)gm*l~}ox.\u000e&%1 0g'',k&(\"(:9p0=86>88,253|81\u0004\u0013C\u0000\u0000\u001d\b\b\rH\t\u0005\u0018\u0002\u000b\u001dQ\u001f\u0015R\u0014\u0006\u0005\u0017\u0000V\f8={1(-+p37s'%34!/#.(cÞøó÷ùù¾ëÿ±öö÷çïçü³ªââûïãéå¢àíõîâÊÎÚÛ", 116, 22, 58));
                }
            } else {
                throw new Exception(C3727.m1052("v^]IXH\u001f__T\u0013^PZPBA\bHE@NF@@TJMK\u0004@I|k;xxeppu0q}`zse)gm*l~}ox.\u000e&%1 0g'',k&(\"(:9p0=86>88,253|81\u0004\u0013C\u0000\u0000\u001d\b\b\rH\t\u0005\u0018\u0002\u000b\u001dQ\u001f\u0015R\u0014\u0006\u0005\u0017\u0000V\f8={1(-+p37s'%34!/#.(cÞøó÷ùù¾ëÿ±öö÷çïçü³ªââûïãéå¢àíõîâÊÎÚÛ", 58, 58, 65));
            }
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1564() {
            return this.f1519;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m1562(byte[] bArr) {
            this.f1519 = bArr;
        }
    }

    public C3811() {
        this.f916 = new C4124[]{new C4124(128, 128, 0)};
        this.f910 = new C4124[]{new C4124(128, 256, 8)};
        this.f1848 = new C4124[]{new C4124(96, 128, 8)};
        this.f913 = 256;
        this.f912 = 128;
        this.f914 = 128;
        m2030(96);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1552() {
        m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3776 m1553(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new C3812(this, bArr, bArr2, bArr3, this.f1850, this.f914);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1555() {
        m2029(C3990.m2428(12));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3776 m1554(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return new C3813(this, bArr, bArr2, bArr3, bArr4, this.f1850, this.f914);
    }
}
