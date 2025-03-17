package nts;

/* renamed from: nts.ጐ  reason: contains not printable characters */
public class C3845 extends C3638 {

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static final long[] f1614 = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: ϴ  reason: contains not printable characters */
    public long[] f1615 = new long[8];

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f1616 = false;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public long f1617 = 0;

    /* renamed from: ખ  reason: contains not printable characters */
    public long f1618 = 0;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public boolean f1619 = false;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f1620 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f1621 = new byte[128];

    public C3845() {
        this.f625 = 512;
        m1765();
    }

    public Object clone() {
        C3845 r02 = new C3845();
        m1768(r02);
        return r02;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1765() {
        this.f1618 = 0;
        this.f1617 = 0;
        this.f1620 = 0;
        long[] jArr = this.f1615;
        jArr[0] = 7640891576956012808L;
        jArr[1] = -4942790177534073029L;
        jArr[2] = 4354685564936845355L;
        jArr[3] = -6534734903238641935L;
        jArr[4] = 5840696475078001361L;
        jArr[5] = -7276294671716946913L;
        jArr[6] = 2270897969802886507L;
        jArr[7] = 6620516959819538809L;
        this.f1616 = false;
        this.f1619 = false;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1766(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            while (i11 > 0 && !this.f1619) {
                i11--;
                byte[] bArr2 = this.f1621;
                int i12 = this.f1620;
                int i13 = i12 + 1;
                this.f1620 = i13;
                int i14 = i10 + 1;
                bArr2[i12] = bArr[i10];
                long j10 = this.f1618 + 8;
                this.f1618 = j10;
                if (j10 == 0) {
                    long j11 = this.f1617 + 1;
                    this.f1617 = j11;
                    if (j11 == 0) {
                        this.f1619 = true;
                    }
                }
                if (i13 == 128) {
                    m1770();
                }
                i10 = i14;
            }
            return;
        }
        throw new C3641(C3727.m1052("BFPD", 0, 4, 34));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final long m1767(long j10, int i10) {
        return (j10 << (64 - i10)) | (j10 >>> i10);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m1769() {
        int i10 = 0;
        if (!this.f1616) {
            int i11 = this.f1620;
            if (i11 <= 111) {
                byte[] bArr = this.f1621;
                this.f1620 = i11 + 1;
                bArr[i11] = Byte.MIN_VALUE;
                while (true) {
                    int i12 = this.f1620;
                    if (i12 >= 112) {
                        break;
                    }
                    byte[] bArr2 = this.f1621;
                    this.f1620 = i12 + 1;
                    bArr2[i12] = 0;
                }
            } else {
                byte[] bArr3 = this.f1621;
                this.f1620 = i11 + 1;
                bArr3[i11] = Byte.MIN_VALUE;
                while (true) {
                    int i13 = this.f1620;
                    if (i13 >= 128) {
                        break;
                    }
                    byte[] bArr4 = this.f1621;
                    this.f1620 = i13 + 1;
                    bArr4[i13] = 0;
                }
                m1770();
                while (true) {
                    int i14 = this.f1620;
                    if (i14 >= 112) {
                        break;
                    }
                    byte[] bArr5 = this.f1621;
                    this.f1620 = i14 + 1;
                    bArr5[i14] = 0;
                }
            }
            byte[] bArr6 = this.f1621;
            long j10 = this.f1617;
            bArr6[112] = (byte) ((int) (j10 >>> 56));
            bArr6[113] = (byte) ((int) (j10 >>> 48));
            bArr6[114] = (byte) ((int) (j10 >>> 40));
            bArr6[115] = (byte) ((int) (j10 >>> 32));
            bArr6[116] = (byte) ((int) (j10 >>> 24));
            bArr6[117] = (byte) ((int) (j10 >>> 16));
            bArr6[118] = (byte) ((int) (j10 >>> 8));
            bArr6[119] = (byte) ((int) j10);
            long j11 = this.f1618;
            bArr6[120] = (byte) ((int) (j11 >>> 56));
            bArr6[121] = (byte) ((int) (j11 >>> 48));
            bArr6[122] = (byte) ((int) (j11 >>> 40));
            bArr6[123] = (byte) ((int) (j11 >>> 32));
            bArr6[124] = (byte) ((int) (j11 >>> 24));
            bArr6[125] = (byte) ((int) (j11 >>> 16));
            bArr6[126] = (byte) ((int) (j11 >>> 8));
            bArr6[127] = (byte) ((int) j11);
            m1770();
            int i15 = 0;
            while (true) {
                byte[] bArr7 = this.f1621;
                if (i15 >= bArr7.length) {
                    break;
                }
                bArr7[i15] = 0;
                i15++;
            }
            this.f1618 = 0;
            this.f1617 = 0;
            this.f1616 = true;
        }
        this.f624 = new byte[(this.f625 / 8)];
        while (true) {
            byte[] bArr8 = this.f624;
            if (i10 >= bArr8.length) {
                return bArr8;
            }
            bArr8[i10] = (byte) ((int) (this.f1615[i10 >>> 3] >>> (((7 - i10) & 7) << 3)));
            i10++;
        }
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public final void m1770() {
        int i10;
        int i11 = 80;
        long[] jArr = new long[80];
        int i12 = 0;
        while (true) {
            if (i12 >= 16) {
                break;
            }
            byte[] bArr = this.f1621;
            int i13 = i12 * 8;
            long j10 = (((long) bArr[i13]) << 56) & -72057594037927936L;
            jArr[i12] = j10;
            long j11 = j10 | ((((long) bArr[i13 + 1]) << 48) & 71776119061217280L);
            jArr[i12] = j11;
            long j12 = j11 | ((((long) bArr[i13 + 2]) << 40) & 280375465082880L);
            jArr[i12] = j12;
            long j13 = j12 | ((((long) bArr[i13 + 3]) << 32) & 1095216660480L);
            jArr[i12] = j13;
            long j14 = j13 | (((long) (bArr[i13 + 4] << 24)) & 4278190080L);
            jArr[i12] = j14;
            long j15 = j14 | (((long) (bArr[i13 + 5] << 16)) & 16711680);
            jArr[i12] = j15;
            long j16 = (((long) (bArr[i13 + 6] << 8)) & 65280) | j15;
            jArr[i12] = j16;
            jArr[i12] = j16 | (((long) bArr[i13 + 7]) & 255);
            i12++;
        }
        for (i10 = 16; i10 < 80; i10++) {
            int i14 = i10 - 15;
            int i15 = i10 - 2;
            jArr[i10] = jArr[i10 - 16] + ((jArr[i14] >>> 7) ^ (m1767(jArr[i14], 1) ^ m1767(jArr[i14], 8))) + jArr[i10 - 7] + ((m1767(jArr[i15], 19) ^ m1767(jArr[i15], 61)) ^ (jArr[i15] >>> 6));
        }
        long[] jArr2 = this.f1615;
        long j17 = jArr2[0];
        long j18 = jArr2[1];
        long j19 = jArr2[2];
        long j20 = jArr2[3];
        long j21 = jArr2[4];
        long j22 = jArr2[5];
        long j23 = jArr2[6];
        long j24 = jArr2[7];
        int i16 = 0;
        long j25 = j21;
        while (i16 < i11) {
            long r28 = ((m1767(j17, 28) ^ m1767(j17, 34)) ^ m1767(j17, 39)) + (((j17 & j18) ^ (j17 & j19)) ^ (j18 & j19));
            long j26 = j17;
            long r26 = j24 + ((m1767(j25, 14) ^ m1767(j25, 18)) ^ m1767(j25, 41)) + ((j25 & j22) ^ ((~j25) & j23)) + f1614[i16] + jArr[i16];
            long j27 = j20 + r26;
            long j28 = r26 + r28;
            i16++;
            j24 = j23;
            i11 = 80;
            j23 = j22;
            j22 = j25;
            j25 = j27;
            j17 = j28;
            j20 = j19;
            j19 = j18;
            j18 = j26;
        }
        long[] jArr3 = this.f1615;
        jArr3[0] = jArr3[0] + j17;
        jArr3[1] = jArr3[1] + j18;
        jArr3[2] = jArr3[2] + j19;
        jArr3[3] = jArr3[3] + j20;
        jArr3[4] = jArr3[4] + j25;
        jArr3[5] = jArr3[5] + j22;
        jArr3[6] = jArr3[6] + j23;
        jArr3[7] = jArr3[7] + j24;
        this.f1620 = 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1768(C3845 r72) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f1615;
            if (i11 >= jArr.length) {
                break;
            }
            r72.f1615[i11] = jArr[i11];
            i11++;
        }
        r72.f1620 = this.f1620;
        while (true) {
            byte[] bArr = this.f1621;
            if (i10 < bArr.length) {
                r72.f1621[i10] = bArr[i10];
                i10++;
            } else {
                r72.f1617 = this.f1617;
                r72.f1618 = this.f1618;
                r72.f1616 = this.f1616;
                r72.f1619 = this.f1619;
                return;
            }
        }
    }
}
