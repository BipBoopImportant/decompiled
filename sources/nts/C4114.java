package nts;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;

/* renamed from: nts.Ὴ  reason: contains not printable characters */
public class C4114 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public boolean f3537 = true;

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f3538 = false;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f3539 = 0;

    /* renamed from: ખ  reason: contains not printable characters */
    public boolean f3540 = false;

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] f3541 = new byte[0];

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f3542 = 5;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int f3543 = 0;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean f3544 = true;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int f3545 = 0;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public boolean f3546 = false;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f3547 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f3548 = 0;

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m3270(byte[] bArr, int i10) {
        if (this.f3546) {
            return i10;
        }
        if (!this.f3538) {
            this.f3543 = i10;
            i10 = m3282(bArr, i10);
            if (!this.f3538) {
                return i10;
            }
            if (!this.f3540 && this.f3539 == 0) {
                this.f3546 = true;
                return i10;
            } else if (this.f3544 && (this.f3548 & -33) != (this.f3542 & -33)) {
                throw new C3625((Throwable) null, 222, C3727.m1052("?\u001fS\u001f\u001a\u0006\u0012V\u001d\u0019\u000f\u001bS\u000b+3f(-3.(!* =-/de_AFDEYEL\\^\u001bJXLLINL\rJ|cy*mmdiamme/ra\u0010COEQ\u001bWPKR_I_K\f\u0001e_V@G_OM\u0012\u000f!Flwk`=&\r;8$>m**#.&**\"hzLOSI\u001a]]TYQ]]U\u000b\u0010BOAJDXDMC\u0006kqon\u000f²±­·ä££ª§¯££«áæÐÓÏÕÁÁÈÅÍÁÁÉªÊÛÀÒ î¡£¤¤®æ£ ¼¦õ²²»¶¾²²ºäÿ º¦¯è¿«§¹¨îçÔÜÉÚÜÓÙÇ×ÒÓÙËËcbUTz{TU~cb]VL\u0012\u0013\u0010\u0011\"#\t\b+*\f\r\u0014\u0015}vl$'!%V{bzu0}}i<okk~:qlb&@SM,<,Ko}m%", 64, 29, 110) + this.f3542 + C3727.m1052("?\u001fS\u001f\u001a\u0006\u0012V\u001d\u0019\u000f\u001bS\u000b+3f(-3.(!* =-/de_AFDEYEL\\^\u001bJXLLINL\rJ|cy*mmdiamme/ra\u0010COEQ\u001bWPKR_I_K\f\u0001e_V@G_OM\u0012\u000f!Flwk`=&\r;8$>m**#.&**\"hzLOSI\u001a]]TYQ]]U\u000b\u0010BOAJDXDMC\u0006kqon\u000f²±­·ä££ª§¯££«áæÐÓÏÕÁÁÈÅÍÁÁÉªÊÛÀÒ î¡£¤¤®æ£ ¼¦õ²²»¶¾²²ºäÿ º¦¯è¿«§¹¨îçÔÜÉÚÜÓÙÇ×ÒÓÙËËcbUTz{TU~cb]VL\u0012\u0013\u0010\u0011\"#\t\b+*\f\r\u0014\u0015}vl$'!%V{bzu0}}i<okk~:qlb&@SM,<,Ko}m%", 93, 8, 84) + this.f3548);
            }
        }
        int r52 = m3281(bArr, i10);
        if (this.f3546) {
            m3275();
        }
        return r52;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3271(boolean z10) {
        this.f3537 = z10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3275() {
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int m3280(byte[] bArr, int i10) {
        return bArr[i10] & 255;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m3281(byte[] bArr, int i10) {
        if (!this.f3540) {
            if (this.f3538) {
                int i11 = this.f3539;
                if (i10 + i11 <= bArr.length) {
                    this.f3541 = C3823.m1630(bArr, i10, i11);
                    this.f3546 = true;
                    return m3274(bArr, i10 + this.f3539);
                }
            }
            return i10;
        }
        throw new C3625((Throwable) null, 702, C3727.m1052("?\u001fS\u001f\u001a\u0006\u0012V\u001d\u0019\u000f\u001bS\u000b+3f(-3.(!* =-/de_AFDEYEL\\^\u001bJXLLINL\rJ|cy*mmdiamme/ra\u0010COEQ\u001bWPKR_I_K\f\u0001e_V@G_OM\u0012\u000f!Flwk`=&\r;8$>m**#.&**\"hzLOSI\u001a]]TYQ]]U\u000b\u0010BOAJDXDMC\u0006kqon\u000f²±­·ä££ª§¯££«áæÐÓÏÕÁÁÈÅÍÁÁÉªÊÛÀÒ î¡£¤¤®æ£ ¼¦õ²²»¶¾²²ºäÿ º¦¯è¿«§¹¨îçÔÜÉÚÜÓÙÇ×ÒÓÙËËcbUTz{TU~cb]VL\u0012\u0013\u0010\u0011\"#\t\b+*\f\r\u0014\u0015}vl$'!%V{bzu0}}i<okk~:qlb&@SM,<,Ko}m%", 13, 16, 88));
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int m3282(byte[] bArr, int i10) {
        int i11 = 2;
        if (bArr.length - i10 < 2) {
            return i10;
        }
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        this.f3548 = b10 & 255;
        if ((b10 & 31) != 31) {
            int i13 = i10 + 2;
            int r02 = m3280(bArr, i12);
            int i14 = 0;
            boolean z10 = (this.f3548 & -33) == 0 && (r02 & -33) == 0;
            this.f3546 = z10;
            if (z10) {
                return i13;
            }
            if ((r02 & 128) > 0) {
                byte b11 = (byte) (r02 & -129);
                boolean z11 = b11 == 0;
                this.f3540 = z11;
                if (z11) {
                    this.f3538 = true;
                    return i13;
                } else if (b11 <= 4) {
                    this.f3539 = 0;
                    if (i13 + b11 > bArr.length) {
                        return i10;
                    }
                    while (i14 < b11) {
                        this.f3539 = (this.f3539 << 8) | m3280(bArr, i13);
                        i11++;
                        i14++;
                        i13++;
                    }
                } else {
                    throw new C3625((Throwable) null, 446, C3727.m1052("?\u001fS\u001f\u001a\u0006\u0012V\u001d\u0019\u000f\u001bS\u000b+3f(-3.(!* =-/de_AFDEYEL\\^\u001bJXLLINL\rJ|cy*mmdiamme/ra\u0010COEQ\u001bWPKR_I_K\f\u0001e_V@G_OM\u0012\u000f!Flwk`=&\r;8$>m**#.&**\"hzLOSI\u001a]]TYQ]]U\u000b\u0010BOAJDXDMC\u0006kqon\u000f²±­·ä££ª§¯££«áæÐÓÏÕÁÁÈÅÍÁÁÉªÊÛÀÒ î¡£¤¤®æ£ ¼¦õ²²»¶¾²²ºäÿ º¦¯è¿«§¹¨îçÔÜÉÚÜÓÙÇ×ÒÓÙËËcbUTz{TU~cb]VL\u0012\u0013\u0010\u0011\"#\t\b+*\f\r\u0014\u0015}vl$'!%V{bzu0}}i<okk~:qlb&@SM,<,Ko}m%", 49, 15, 49));
                }
            } else {
                this.f3539 = r02;
            }
            this.f3538 = true;
            this.f3547 = i11;
            return i13;
        }
        throw new C3625((Throwable) null, 305, C3727.m1052("?\u001fS\u001f\u001a\u0006\u0012V\u001d\u0019\u000f\u001bS\u000b+3f(-3.(!* =-/de_AFDEYEL\\^\u001bJXLLINL\rJ|cy*mmdiamme/ra\u0010COEQ\u001bWPKR_I_K\f\u0001e_V@G_OM\u0012\u000f!Flwk`=&\r;8$>m**#.&**\"hzLOSI\u001a]]TYQ]]U\u000b\u0010BOAJDXDMC\u0006kqon\u000f²±­·ä££ª§¯££«áæÐÓÏÕÁÁÈÅÍÁÁÉªÊÛÀÒ î¡£¤¤®æ£ ¼¦õ²²»¶¾²²ºäÿ º¦¯è¿«§¹¨îçÔÜÉÚÜÓÙÇ×ÒÓÙËËcbUTz{TU~cb]VL\u0012\u0013\u0010\u0011\"#\t\b+*\f\r\u0014\u0015}vl$'!%V{bzu0}}i<okk~:qlb&@SM,<,Ko}m%", 29, 20, 57));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m3273() {
        C3796 r02 = new C3796();
        m3277(r02);
        return r02.m1349().f934;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3276(int i10) {
        this.f3542 = i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3278(boolean z10) {
        this.f3544 = z10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3277(C3796 r32) {
        r32.m1346(this.f3541, this.f3542);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3279(byte[] bArr) {
        m3270(bArr, 0);
        if (!this.f3546) {
            throw new C3625((Throwable) null, 447, C3727.m1052("?\u001fS\u001f\u001a\u0006\u0012V\u001d\u0019\u000f\u001bS\u000b+3f(-3.(!* =-/de_AFDEYEL\\^\u001bJXLLINL\rJ|cy*mmdiamme/ra\u0010COEQ\u001bWPKR_I_K\f\u0001e_V@G_OM\u0012\u000f!Flwk`=&\r;8$>m**#.&**\"hzLOSI\u001a]]TYQ]]U\u000b\u0010BOAJDXDMC\u0006kqon\u000f²±­·ä££ª§¯££«áæÐÓÏÕÁÁÈÅÍÁÁÉªÊÛÀÒ î¡£¤¤®æ£ ¼¦õ²²»¶¾²²ºäÿ º¦¯è¿«§¹¨îçÔÜÉÚÜÓÙÇ×ÒÓÙËËcbUTz{TU~cb]VL\u0012\u0013\u0010\u0011\"#\t\b+*\f\r\u0014\u0015}vl$'!%V{bzu0}}i<okk~:qlb&@SM,<,Ko}m%", 0, 13, 124));
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m3272(byte[] bArr, int i10) {
        if (this.f3540) {
            int i11 = i10 + 1;
            if (i11 < bArr.length && (bArr[i10] & 255) == 0 && (bArr[i11] & 255) == 0) {
                return true;
            }
            return false;
        } else if (i10 < this.f3543 + this.f3547 + this.f3539) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m3274(byte[] bArr, int i10) {
        if (this.f3540) {
            int i11 = i10 + 1;
            if (i11 >= bArr.length) {
                return i10;
            }
            if ((bArr[i10] & 255) == 0 && m3280(bArr, i11) == 0) {
                i10 += 2;
            } else {
                throw new C3625((Throwable) null, 446, C3727.m1052("?\u001fS\u001f\u001a\u0006\u0012V\u001d\u0019\u000f\u001bS\u000b+3f(-3.(!* =-/de_AFDEYEL\\^\u001bJXLLINL\rJ|cy*mmdiamme/ra\u0010COEQ\u001bWPKR_I_K\f\u0001e_V@G_OM\u0012\u000f!Flwk`=&\r;8$>m**#.&**\"hzLOSI\u001a]]TYQ]]U\u000b\u0010BOAJDXDMC\u0006kqon\u000f²±­·ä££ª§¯££«áæÐÓÏÕÁÁÈÅÍÁÁÉªÊÛÀÒ î¡£¤¤®æ£ ¼¦õ²²»¶¾²²ºäÿ º¦¯è¿«§¹¨îçÔÜÉÚÜÓÙÇ×ÒÓÙËËcbUTz{TU~cb]VL\u0012\u0013\u0010\u0011\"#\t\b+*\f\r\u0014\u0015}vl$'!%V{bzu0}}i<okk~:qlb&@SM,<,Ko}m%", (int) CheckoutActivity.RESULT_CANCELED, 15, 34));
            }
        }
        this.f3546 = true;
        this.f3545 = i10;
        return i10;
    }
}
