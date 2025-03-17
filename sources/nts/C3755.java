package nts;

/* renamed from: nts.ๆ  reason: contains not printable characters */
public abstract class C3755 extends C3560 {
    public C3755(byte[] bArr, int i10, int i11, int i12, int i13, int i14) {
        super(bArr, i10, i11, i12, i13, i14);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1172(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
        byte[] bArr3 = new byte[this.f103];
        while (i11 > 0) {
            System.arraycopy(this.f99, 0, bArr3, 0, this.f103);
            m1178();
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
    public void m1173(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
        while (i11 > 0) {
            m1178();
            int min = Math.min(i11, this.f103);
            int i13 = 0;
            while (i13 < min) {
                byte[] bArr3 = this.f99;
                int i14 = i10 + 1;
                byte b10 = (byte) (bArr[i10] ^ bArr3[i13]);
                bArr3[i13] = b10;
                bArr2[i12] = b10;
                i13++;
                i11--;
                i12++;
                i10 = i14;
            }
        }
        System.arraycopy(this.f99, 0, this.f108, 0, this.f103);
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public void m1174(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        while (i11 > 0) {
            System.arraycopy(bArr, i10, this.f99, 0, this.f103);
            i10 += this.f103;
            m1178();
            System.arraycopy(this.f99, 0, bArr2, i12, this.f103);
            int i13 = this.f103;
            i12 += i13;
            i11 -= i13;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1175(byte[] bArr, byte[] bArr2, int i10) {
    }

    /* renamed from: ᅯ  reason: contains not printable characters */
    public void m1177(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = this.f99;
        if (bArr3 == null || bArr3.length != i11) {
            this.f99 = new byte[i11];
        }
        System.arraycopy(bArr, i10, this.f99, 0, i11);
        m1178();
        System.arraycopy(this.f99, 0, bArr2, i12, i11);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public abstract void m1178();

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1179(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
        byte[] bArr3 = new byte[this.f103];
        while (i11 > 0) {
            System.arraycopy(this.f99, 0, bArr3, 0, this.f103);
            m1178();
            byte[] bArr4 = this.f99;
            int i13 = i10 + 1;
            byte b10 = (byte) (bArr[i10] ^ bArr4[0]);
            int i14 = this.f103 - 1;
            bArr4[i14] = b10;
            bArr2[i12] = b10;
            i11--;
            System.arraycopy(bArr3, 1, bArr4, 0, i14);
            i10 = i13;
            i12++;
        }
        System.arraycopy(this.f99, 0, this.f108, 0, this.f103);
    }

    /* renamed from: ⴸ  reason: contains not printable characters */
    public void m1180(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
        while (i11 > 0) {
            m1178();
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
    public void m1181(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
        while (i11 > 0) {
            int i13 = 0;
            while (i13 < this.f103) {
                byte[] bArr3 = this.f99;
                bArr3[i13] = (byte) (bArr[i10] ^ bArr3[i13]);
                i13++;
                i10++;
            }
            m1178();
            System.arraycopy(this.f99, 0, bArr2, i12, this.f103);
            int i14 = this.f103;
            i12 += i14;
            i11 -= i14;
        }
        System.arraycopy(this.f99, 0, this.f108, 0, this.f103);
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public void m1182(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        while (i11 > 0) {
            if (this.f105 == 0) {
                System.arraycopy(this.f108, 0, this.f99, 0, this.f103);
                m1178();
            }
            int i13 = this.f105;
            int i14 = this.f103 - i13;
            if (i14 > i11) {
                this.f105 = i13 + i11;
                i14 = i11;
            } else {
                m160(this.f108);
                this.f105 = 0;
            }
            int i15 = i13 + i14;
            while (i13 < i15) {
                bArr2[i12] = (byte) (bArr[i10] ^ this.f99[i13]);
                i13++;
                i12++;
                i10++;
            }
            i11 -= i14;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m1176(byte[] bArr, int i10, int i11) {
        int i12;
        byte b10;
        byte[] bArr2 = bArr;
        int i13 = i10;
        int i14 = i11;
        if (i13 + i14 > bArr2.length) {
            throw new Exception(C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 183, 58, 34));
        } else if (this.f102) {
            byte[] bArr3 = new byte[i14];
            m1177(bArr, i10, i11, bArr3, 0);
            return bArr3;
        } else {
            int i15 = this.f109;
            if (i15 == 5) {
                byte[] bArr4 = new byte[(this.f107 + i14)];
                int r10 = m157(bArr, i10, i11, bArr4, 0);
                int i16 = this.f107;
                int i17 = this.f103;
                if (i16 > i17) {
                    byte[] bArr5 = new byte[i17];
                    m1181(this.f100, 0, i17, bArr5, 0);
                    int i18 = this.f107;
                    while (true) {
                        byte[] bArr6 = this.f100;
                        if (i18 < bArr6.length) {
                            bArr6[i18] = 0;
                            i18++;
                        } else {
                            int i19 = this.f103;
                            byte[] bArr7 = new byte[i19];
                            m1181(bArr6, i19, i19, bArr7, 0);
                            byte[] bArr8 = new byte[(this.f107 + r10)];
                            System.arraycopy(bArr4, 0, bArr8, 0, r10);
                            System.arraycopy(bArr7, 0, bArr8, r10, i19);
                            System.arraycopy(bArr5, 0, bArr8, r10 + i19, this.f107 - this.f103);
                            return bArr8;
                        }
                    }
                } else {
                    throw new Exception(C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 129, 54, 49));
                }
            } else {
                int i20 = this.f103;
                int i21 = i14 % i20;
                if (i15 != 3) {
                    if (i21 > 0 && this.f101 == 1 && i15 != 4 && i15 != 6) {
                        throw new Exception(C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 241, 70, 35));
                    } else if (this.f101 != 1 && (i12 = i20 - i21) > 0) {
                        int i22 = i14 + i12;
                        byte[] bArr9 = new byte[i22];
                        System.arraycopy(bArr, i13, bArr9, 0, i14);
                        int i23 = this.f101;
                        byte b11 = (i23 == 2 || (i23 != 3 && (i23 == 4 || i23 == 5))) ? (byte) i12 : 0;
                        byte[] bArr10 = null;
                        if (i23 == 5) {
                            if (C3596.f363) {
                                bArr10 = C3990.m2428(this.f103);
                            } else {
                                throw new C3625((Throwable) null, 702, C3727.m1052("Ga|x~+go`taq\"bne>sys}op9uxyw{}qeG@B\rMDMZ\u0006EA\\MMD\u0001\\PIS^H\u0018VP\u0017UG@RI\u001f.\u0015\u0017\u0012\u0010\u0010G\t\u000f\u000e\u0018\u000f\u0019L\u000e\u0000\u0015P\u001f\u0017\u001b\u0013\u0003\u001eY\u001b\u0014\u0017\u001f\u0015\u0011\u001f5),,e#(#:h)/4#!*q2<';0$v6>{;/.>'\u000fÅÓ×¥ðæñôçýé­þãí©æûõüüçõéê¿èòºùý¹ÊÈÊÂÇÑÕÆÎÂÅÅÍÔÛÛÖÙàÈËßÎÞÉÉÂÈÆÌÆÔ×ÞÓÖØÐÖÖÂÜÛÝÖßêý­îîóææã¦çëöìåó¿ñû¼úèëùî¸Øðøðäù²úï½ððì¹û»éðêóéñîæ¬âè¯ÁçúþÀ÷ÚØÓÚáÚÆØÞÖÝëÅÁÂÎÎÆÊßÝÊÜÞÄô¹¹µÿpkt\u000b\r\r\r\b\u0011Y@\u0012QQGDLKJ^HH\u0001+=9K\u001e\b\u001f\u001a\t\u0013\u0007C\u0010\r\u0003G\u001b\u0010\n\u0013\u0019\u000f^\u000b\u0015\t\u0006S\u0000\u001aV\u0015-i&$\"*+=`5*\"*e))=y873>5qñÙÚÎßÏØØÓÙ×Ý×ÅÆÏÂÇÉÁÇÇÓÍÊÌÇÎûì¼ÿÿâ÷÷ò·öúçýôâ®àê­ëùúèÿ©¡©¡µ¨ã¯¸¿»î«­ë«õ¹¢º¥¹£¾¸ü°¸ùµª¥±À´¯¹³·¹ü£³µ´¾¸²úë¡¡¼î ­ºâ£¥ç§«äÑÔÈÌÁéÿúì±", 311, 23, 25));
                            }
                        }
                        while (i14 < i22) {
                            if (i14 < i22 - 1) {
                                int i24 = this.f101;
                                b10 = i24 == 4 ? 0 : b11;
                                if (i24 == 5) {
                                    b10 = bArr10[i14 % this.f103];
                                }
                            } else {
                                b10 = b11;
                            }
                            bArr9[i14] = b10;
                            i14++;
                        }
                        i14 = i22;
                        i13 = 0;
                        bArr2 = bArr9;
                    }
                }
                byte[] bArr11 = new byte[i14];
                m159(bArr2, i13, i14, bArr11, 0);
                return bArr11;
            }
        }
    }
}
