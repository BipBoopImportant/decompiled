package nts;

/* renamed from: nts.ම  reason: contains not printable characters */
public class C3744 extends C3910 {

    /* renamed from: nts.ම$ગ  reason: contains not printable characters */
    public class C3745 extends C3755 implements C3776 {

        /* renamed from: и  reason: contains not printable characters */
        public final /* synthetic */ C3744 f1112;

        /* renamed from: ࡑ  reason: contains not printable characters */
        public final byte[] f1113;

        /* renamed from: ᘺ  reason: contains not printable characters */
        public final C3747 f1114;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3745(C3744 r15, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11) {
            super(bArr2, 16, 16, 1, 1, i11);
            this.f1112 = r15;
            C3747 r02 = new C3747(r15);
            this.f1114 = r02;
            this.f104 = true;
            this.f102 = true;
            this.f1113 = bArr;
            C3658.m701(r02, true, bArr, bArr2, bArr3, i10);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m1155(byte[] bArr) {
        }

        /* renamed from: ᅯ  reason: contains not printable characters */
        public void m1159(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            C3658.m702(this.f1114, bArr, i10, i11, bArr2, i12);
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public void m1160() {
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m1156(byte[] bArr, byte[] bArr2, int i10) {
            C3658.m701(this.f1114, true, this.f1113, bArr, bArr2, i10);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1158(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            C3747 r12 = this.f1114;
            r12.f1124 = new byte[r12.f1128];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            C3747 r42 = this.f1114;
            C3658.m703(r42, bArr2, r42.f1124);
            return bArr2;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1157() {
            return this.f1114.f1124;
        }
    }

    /* renamed from: nts.ම$ഇ  reason: contains not printable characters */
    public class C3746 extends C3793 implements C3776 {

        /* renamed from: и  reason: contains not printable characters */
        public final /* synthetic */ C3744 f1115;

        /* renamed from: ࡑ  reason: contains not printable characters */
        public final byte[] f1116;

        /* renamed from: ᘺ  reason: contains not printable characters */
        public final C3747 f1117;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3746(C3744 r15, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i10, int i11) {
            super(bArr2, 16, 16, 1, 1, i11);
            this.f1115 = r15;
            C3747 r02 = new C3747(r15);
            this.f1117 = r02;
            this.f104 = true;
            this.f102 = true;
            this.f1116 = bArr;
            r02.f1124 = bArr4;
            C3658.m701(r02, false, bArr, bArr2, bArr3, i10);
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m1162(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
            C3658.m701(this.f1117, false, this.f1116, bArr, bArr2, i10);
        }

        /* renamed from: ᅯ  reason: contains not printable characters */
        public void m1165(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            C3658.m702(this.f1117, bArr, i10, i11, bArr2, i12);
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public void m1166() {
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1164(byte[] bArr, int i10, int i11) {
            C3747 r02 = this.f1117;
            int i12 = 0;
            if (r02.f1124.length > 0 || r02.f1128 == 0) {
                String r03 = C3727.m1052("\u0012&#e/635n-)m9;-*?1=06}Iod`nn)|h&aa`pxpk$=uulxt~r5wzbyu]\u0001YML\u0004", 22, 38, 63);
                C3747 r12 = this.f1117;
                int i13 = r12.f1128;
                if (i13 == r12.f1124.length) {
                    byte[] bArr2 = new byte[i11];
                    byte[] bArr3 = new byte[i13];
                    System.arraycopy(bArr, i10, bArr2, 0, i11);
                    C3658.m703(this.f1117, bArr2, bArr3);
                    while (true) {
                        C3747 r72 = this.f1117;
                        if (i12 >= r72.f1128) {
                            return bArr2;
                        }
                        if (bArr3[i12] == r72.f1124[i12]) {
                            i12++;
                        } else {
                            throw new C3625((Throwable) null, 2001, r03);
                        }
                    }
                } else {
                    throw new C3625((Throwable) null, 2001, r03);
                }
            } else {
                throw new C3625((Throwable) null, 0, C3727.m1052("\u0012&#e/635n-)m9;-*?1=06}Iod`nn)|h&aa`pxpk$=uulxt~r5wzbyu]\u0001YML\u0004", 0, 22, 80));
            }
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1163() {
            return this.f1117.f1124;
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public void m1161(byte[] bArr) {
            this.f1117.f1124 = bArr;
        }
    }

    /* renamed from: nts.ම$ᐳ  reason: contains not printable characters */
    public class C3747 {

        /* renamed from: ϴ  reason: contains not printable characters */
        public int[] f1118 = null;

        /* renamed from: Е  reason: contains not printable characters */
        public C3874 f1119 = null;

        /* renamed from: и  reason: contains not printable characters */
        public byte[] f1120 = null;

        /* renamed from: ࡏ  reason: contains not printable characters */
        public byte[] f1121 = null;

        /* renamed from: ࡑ  reason: contains not printable characters */
        public byte[] f1122 = null;

        /* renamed from: ખ  reason: contains not printable characters */
        public byte[] f1123 = new byte[16];

        /* renamed from: ગ  reason: contains not printable characters */
        public byte[] f1124 = null;

        /* renamed from: ഇ  reason: contains not printable characters */
        public boolean f1125 = false;

        /* renamed from: ഗ  reason: contains not printable characters */
        public int f1126 = 0;

        /* renamed from: ᅯ  reason: contains not printable characters */
        public byte[] f1127 = new byte[16];

        /* renamed from: ᐳ  reason: contains not printable characters */
        public int f1128 = 12;

        /* renamed from: ᖑ  reason: contains not printable characters */
        public byte[] f1129 = null;

        /* renamed from: ᘺ  reason: contains not printable characters */
        public byte[] f1130 = new byte[16];

        /* renamed from: ᜇ  reason: contains not printable characters */
        public byte[] f1131 = null;

        /* renamed from: ᢼ  reason: contains not printable characters */
        public byte[] f1132 = new byte[16];

        /* renamed from: ṧ  reason: contains not printable characters */
        public long f1133 = 0;

        /* renamed from: ⱑ  reason: contains not printable characters */
        public long f1134 = 0;

        /* renamed from: ⴸ  reason: contains not printable characters */
        public byte[] f1135 = new byte[24];

        /* renamed from: ⶊ  reason: contains not printable characters */
        public int[] f1136 = null;

        /* renamed from: ⶏ  reason: contains not printable characters */
        public int f1137 = 0;

        public C3747(C3744 r42) {
        }
    }

    public C3744() {
        this.f916 = new C4124[]{new C4124(128, 128, 0)};
        this.f910 = new C4124[]{new C4124(128, 256, 64)};
        this.f1848 = new C4124[]{new C4124(8, 128, 8)};
        this.f913 = 256;
        this.f912 = 128;
        this.f914 = 128;
        m2030(96);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1151() {
        m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3776 m1152(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new C3745(this, bArr, bArr2, bArr3, this.f1850, this.f914);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1154() {
        m2029(C3990.m2428(11));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3776 m1153(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return new C3746(this, bArr, bArr2, bArr3, bArr4, this.f1850, this.f914);
    }
}
