package nts;

/* renamed from: nts.ᅠ  reason: contains not printable characters */
public class C3788 extends C4114 {

    /* renamed from: ࡑ  reason: contains not printable characters */
    public String f1316;

    public C3788() {
        this.f1316 = "";
        this.f3542 = 23;
        m3278(false);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1288(C3796 r32) {
        String str = this.f1316;
        String str2 = C3823.f1540;
        r32.m1346(str.getBytes(), this.f3542);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String m1289() {
        String str;
        if (this.f3542 == 23 && this.f1316.length() == 13) {
            String str2 = this.f1316;
            String str3 = C3823.f1540;
            if (Integer.parseInt(str2.substring(0, 2)) < 50) {
                str = "20" + this.f1316;
            } else {
                str = "19" + this.f1316;
            }
        } else if (this.f3542 == 24) {
            str = this.f1316;
        } else {
            throw new C3625(0, C3727.m1052("?\u001fS\u001f\u001a\u0006\u0012V\u001d\u0019\u000f\u001bS\u000b+3f(-3.(!* =-/de_AFDEYEL\\^\u001bJXLLINL\rJ|cy*mmdiamme/ra\u0010COEQ\u001bWPKR_I_K\f\u0001e_V@G_OM\u0012\u000f!Flwk`=&\r;8$>m**#.&**\"hzLOSI\u001a]]TYQ]]U\u000b\u0010BOAJDXDMC\u0006kqon\u000f²±­·ä££ª§¯££«áæÐÓÏÕÁÁÈÅÍÁÁÉªÊÛÀÒ î¡£¤¤®æ£ ¼¦õ²²»¶¾²²ºäÿ º¦¯è¿«§¹¨îçÔÜÉÚÜÓÙÇ×ÒÓÙËËcbUTz{TU~cb]VL\u0012\u0013\u0010\u0011\"#\t\b+*\f\r\u0014\u0015}vl$'!%V{bzu0}}i<okk~:qlb&@SM,<,Ko}m%", 304, 31, 58));
        }
        if (!str.endsWith("Z")) {
            return str;
        }
        char[] cArr = {'Z'};
        if (C3823.m1590(str)) {
            return "";
        }
        int i10 = 0;
        while (true) {
            if (i10 < str.length()) {
                if (str.charAt(i10) != cArr[0]) {
                    break;
                }
                i10++;
            } else {
                i10 = 0;
                break;
            }
        }
        int length = str.length() - 1;
        int length2 = str.length() - 1;
        while (true) {
            if (length2 >= 0) {
                if (str.charAt(length2) != cArr[0]) {
                    length = length2;
                    break;
                }
                length2--;
            } else {
                break;
            }
        }
        return str.substring(i10, length + 1);
    }

    public C3788(String str) {
        this.f3542 = 23;
        this.f1316 = str;
        m3278(false);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1287() {
        byte[] bArr = this.f3541;
        String str = C3823.f1540;
        this.f1316 = new String(bArr);
        this.f3542 = this.f3548;
    }
}
