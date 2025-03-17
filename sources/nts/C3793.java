package nts;

/* renamed from: nts.ᆆ  reason: contains not printable characters */
public abstract class C3793 extends C3560 {
    public C3793(byte[] bArr, int i10, int i11, int i12, int i13, int i14) {
        super(bArr, i10, i11, i12, i13, i14);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1296(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
        byte[] bArr3 = new byte[this.f103];
        while (i11 > 0) {
            System.arraycopy(this.f99, 0, bArr3, 0, this.f103);
            m1302();
            byte[] bArr4 = this.f99;
            int i13 = i10 + 1;
            bArr2[i12] = (byte) (bArr[i10] ^ bArr4[0]);
            i11--;
            int i14 = this.f103 - 1;
            bArr4[i14] = bArr4[0];
            System.arraycopy(bArr3, 1, bArr4, 0, i14);
            i12++;
            i10 = i13;
        }
        System.arraycopy(this.f99, 0, this.f108, 0, this.f103);
    }

    /* renamed from: Е  reason: contains not printable characters */
    public void m1297(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
        while (i11 > 0) {
            m1302();
            int min = Math.min(i11, this.f103);
            int i13 = 0;
            while (i13 < min) {
                byte[] bArr3 = this.f99;
                byte b10 = bArr3[i13];
                byte b11 = bArr[i10];
                i10++;
                bArr3[i13] = b11;
                bArr2[i12] = (byte) (b10 ^ b11);
                i13++;
                i11--;
                i12++;
            }
        }
        System.arraycopy(this.f99, 0, this.f108, 0, this.f103);
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public void m1298(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        while (i11 > 0) {
            System.arraycopy(bArr, i10, this.f99, 0, this.f103);
            i10 += this.f103;
            m1302();
            System.arraycopy(this.f99, 0, bArr2, i12, this.f103);
            int i13 = this.f103;
            i12 += i13;
            i11 -= i13;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1299(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
    }

    /* renamed from: ᅯ  reason: contains not printable characters */
    public void m1301(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = this.f99;
        if (bArr3 == null || bArr3.length != i11) {
            this.f99 = new byte[i11];
        }
        System.arraycopy(bArr, i10, this.f99, 0, i11);
        m1302();
        System.arraycopy(this.f99, 0, bArr2, i12, i11);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public abstract void m1302();

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1303(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
        byte[] bArr3 = new byte[this.f103];
        while (i11 > 0) {
            System.arraycopy(this.f99, 0, bArr3, 0, this.f103);
            m1302();
            byte[] bArr4 = this.f99;
            byte b10 = bArr4[0];
            byte b11 = bArr[i10];
            int i13 = this.f103 - 1;
            i10++;
            bArr4[i13] = b11;
            bArr2[i12] = (byte) (b10 ^ b11);
            i11--;
            System.arraycopy(bArr3, 1, bArr4, 0, i13);
            i12++;
        }
        System.arraycopy(this.f99, 0, this.f108, 0, this.f103);
    }

    /* renamed from: ⴸ  reason: contains not printable characters */
    public void m1304(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
        while (i11 > 0) {
            m1302();
            int min = Math.min(i11, this.f103);
            int i13 = 0;
            while (i13 < min) {
                bArr2[i12] = (byte) (bArr[i10] ^ this.f99[i13]);
                i13++;
                i11--;
                i12++;
                i10++;
            }
        }
        System.arraycopy(this.f99, 0, this.f108, 0, this.f103);
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public void m1305(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        while (i11 > 0) {
            System.arraycopy(bArr, i10, this.f99, 0, this.f103);
            m1302();
            int i14 = 0;
            while (true) {
                i13 = this.f103;
                if (i14 >= i13) {
                    break;
                }
                byte[] bArr3 = this.f99;
                byte b10 = bArr3[i14];
                byte[] bArr4 = this.f108;
                bArr3[i14] = (byte) (b10 ^ bArr4[i14]);
                bArr4[i14] = bArr[i10];
                i14++;
                i10++;
            }
            System.arraycopy(this.f99, 0, bArr2, i12, i13);
            int i15 = this.f103;
            i12 += i15;
            i11 -= i15;
        }
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public void m1306(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        while (i11 > 0) {
            int i13 = 0;
            System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
            m1302();
            int i14 = this.f103;
            if (i11 < i14) {
                i14 = i11;
            }
            while (i13 < i14) {
                bArr2[i12] = (byte) (bArr[i10] ^ this.f99[i13]);
                i13++;
                i12++;
                i10++;
            }
            i11 -= i14;
            m160(this.f108);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m1300(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i11;
        if (i10 + i12 > bArr.length) {
            throw new Exception(C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 390, 58, 2));
        } else if (this.f102) {
            byte[] bArr2 = new byte[i12];
            m1301(bArr, i10, i11, bArr2, 0);
            return bArr2;
        } else {
            int i13 = this.f109;
            if (i13 == 5) {
                byte[] bArr3 = new byte[(this.f107 + i12)];
                int r72 = m157(bArr, i10, i11, bArr3, 0);
                int i14 = this.f107;
                int i15 = this.f103;
                if (i14 > i15) {
                    byte[] bArr4 = new byte[i15];
                    System.arraycopy(this.f108, 0, bArr4, 0, i15);
                    byte[] bArr5 = this.f100;
                    int i16 = this.f103;
                    System.arraycopy(bArr5, i16, this.f108, 0, this.f107 - i16);
                    int i17 = this.f107 - this.f103;
                    while (true) {
                        int i18 = this.f103;
                        if (i17 < i18) {
                            this.f108[i17] = 0;
                            i17++;
                        } else {
                            byte[] bArr6 = new byte[i18];
                            m1305(this.f100, 0, i18, bArr6, 0);
                            System.arraycopy(bArr4, 0, this.f108, 0, this.f103);
                            int i19 = this.f103;
                            byte[] bArr7 = new byte[i19];
                            System.arraycopy(this.f100, i19, bArr7, 0, this.f107 - i19);
                            int i20 = this.f107;
                            int i21 = this.f103;
                            int i22 = i20 - i21;
                            System.arraycopy(bArr6, i22, bArr7, i22, (i21 * 2) - i20);
                            int i23 = this.f103;
                            byte[] bArr8 = new byte[i23];
                            m1305(bArr7, 0, i23, bArr8, 0);
                            byte[] bArr9 = new byte[(this.f107 + r72)];
                            System.arraycopy(bArr3, 0, bArr9, 0, r72);
                            System.arraycopy(bArr8, 0, bArr9, r72, i23);
                            System.arraycopy(bArr6, 0, bArr9, r72 + i23, this.f107 - this.f103);
                            return bArr9;
                        }
                    }
                } else {
                    throw new Exception(C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 334, 56, 30));
                }
            } else if (i13 == 3 || ((i13 == 4 && this.f101 == 1) || ((i13 == 6 && this.f101 == 1) || i12 % this.f103 == 0))) {
                byte[] bArr10 = new byte[i12];
                m159(bArr, i10, i11, bArr10, 0);
                if (this.f109 == 3) {
                    return bArr10;
                }
                int i24 = this.f101;
                if (i24 != 2) {
                    if (i24 == 3) {
                        b10 = 0;
                        while (i12 > b10) {
                            int i25 = b10 + 1;
                            if (bArr10[i12 - i25] != 0) {
                                break;
                            }
                            b10 = i25;
                        }
                    } else if (!(i24 == 4 || i24 == 5)) {
                        b10 = 0;
                    }
                    if (b10 >= 0 || b10 > i12) {
                        throw new C3738(C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 492, 69, 114));
                    } else if (b10 <= 0) {
                        return bArr10;
                    } else {
                        int i26 = i12 - b10;
                        byte[] bArr11 = new byte[i26];
                        System.arraycopy(bArr10, 0, bArr11, 0, i26);
                        return bArr11;
                    }
                }
                b10 = bArr10[i12 - 1];
                if (b10 >= 0) {
                }
                throw new C3738(C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 492, 69, 114));
            } else {
                throw new Exception(C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 448, 44, 41));
            }
        }
    }
}
