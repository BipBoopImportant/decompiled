package nts;

/* renamed from: nts.ʮ  reason: contains not printable characters */
public abstract class C3560 implements C4193 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] f99;

    /* renamed from: Е  reason: contains not printable characters */
    public byte[] f100;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f101;

    /* renamed from: ખ  reason: contains not printable characters */
    public boolean f102;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f103;

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean f104 = false;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int f105;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f106;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int f107;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f108;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f109;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3560(byte[] r2, int r3, int r4, int r5, int r6, int r7) {
        /*
            r1 = this;
            r1.<init>()
            r4 = 0
            r1.f104 = r4
            r0 = 0
            r1.f99 = r0
            r1.f108 = r0
            r1.f102 = r4
            r1.f100 = r0
            r1.f107 = r4
            r1.f105 = r4
            r1.f103 = r3
            r1.f106 = r7
            r1.f109 = r5
            r1.f101 = r6
            if (r2 == 0) goto L_0x0024
            java.lang.Object r2 = r2.clone()
            r0 = r2
            byte[] r0 = (byte[]) r0
        L_0x0024:
            r1.f108 = r0
            int r2 = r1.f103
            byte[] r3 = new byte[r2]
            r1.f99 = r3
            int r2 = r2 * 2
            byte[] r2 = new byte[r2]
            r1.f100 = r2
            r1.f107 = r4
            r1.f105 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3560.<init>(byte[], int, int, int, int, int):void");
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public abstract void m155(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    /* renamed from: Е  reason: contains not printable characters */
    public abstract void m156(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int m157(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        while (true) {
            i13 = this.f107;
            i14 = i13 + i11;
            i15 = i14 - i16;
            int i17 = this.f103;
            if (i15 <= i17 * 2) {
                break;
            }
            i16 += i17;
        }
        if (i16 > 0) {
            byte[] bArr3 = new byte[i14];
            System.arraycopy(this.f100, 0, bArr3, 0, i13);
            System.arraycopy(bArr, i10, bArr3, this.f107, i11);
            m166(bArr3, 0, i16, bArr2, i12);
            this.f107 = i15;
            System.arraycopy(bArr3, i16, this.f100, 0, i15);
        } else {
            System.arraycopy(bArr, i10, this.f100, i13, i11);
            this.f107 += i11;
        }
        return i16;
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public abstract void m158(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m161() {
        return this.f104;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m162(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i10 + i11 > bArr.length) {
            throw new Exception(C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 0, 64, 78));
        } else if (i12 + i11 > bArr2.length) {
            throw new Exception(C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 64, 65, 96));
        } else if (this.f102) {
            m163(bArr, i10, i11, bArr2, i12);
            return i11;
        } else {
            int i13 = this.f109;
            if (!(i13 == 4 || i13 == 3 || (i13 == 6 && this.f101 == 1))) {
                int i14 = this.f103;
                i11 = (i11 / i14) * i14;
            }
            return m159(bArr, i10, i11, bArr2, i12);
        }
    }

    /* renamed from: ᅯ  reason: contains not printable characters */
    public abstract void m163(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    /* renamed from: ᐳ  reason: contains not printable characters */
    public abstract void m164(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    /* renamed from: ⴸ  reason: contains not printable characters */
    public abstract void m165(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    /* renamed from: ⶊ  reason: contains not printable characters */
    public abstract void m166(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    /* renamed from: ⶏ  reason: contains not printable characters */
    public abstract void m167(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    /* renamed from: ગ  reason: contains not printable characters */
    public int m159(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = this.f109;
        if (i13 == 2) {
            m158(bArr, i10, i11, bArr2, i12);
        } else if (i13 == 1) {
            m166(bArr, i10, i11, bArr2, i12);
        } else if (i13 == 3) {
            if (this.f106 == 8) {
                m155(bArr, i10, i11, bArr2, i12);
            } else {
                m165(bArr, i10, i11, bArr2, i12);
            }
        } else if (i13 == 4) {
            if (this.f106 == 8) {
                m164(bArr, i10, i11, bArr2, i12);
            } else {
                m156(bArr, i10, i11, bArr2, i12);
            }
        } else if (i13 == 5) {
            return m157(bArr, i10, i11, bArr2, i12);
        } else {
            if (i13 == 6) {
                m167(bArr, i10, i11, bArr2, i12);
            }
        }
        return i11;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m160(byte[] bArr) {
        int length = bArr.length - 1;
        while (length >= 0) {
            byte b10 = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b10;
            if (b10 == 0) {
                length--;
            } else {
                return;
            }
        }
    }
}
