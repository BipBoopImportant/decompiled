package nts;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;

/* renamed from: nts.ὖ  reason: contains not printable characters */
public class C4102 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public String f3507 = "";

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean f3508 = false;

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean f3509 = false;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String f3510 = "";

    /* renamed from: ગ  reason: contains not printable characters */
    public final boolean m3252(String str) {
        if (C3823.m1590(str) || !str.contains(":")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':' && charAt != '%'))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3254(String str, String str2) {
        if (!this.f3510.equals(str) || !this.f3507.equals(str2)) {
            this.f3510 = str;
            this.f3507 = str2;
            boolean z10 = false;
            boolean z11 = str.length() == 0;
            boolean r32 = m3255(str);
            boolean r62 = m3252(str);
            boolean r42 = m3255(str2);
            boolean r72 = m3252(str2);
            if (z11 && (r42 || r72)) {
                this.f3509 = true;
                this.f3508 = r72;
            } else if (z11 || (!r32 && !r62 && !r42 && !r72)) {
                this.f3509 = false;
                this.f3508 = true;
            } else {
                this.f3509 = true;
                if (r62 && r72) {
                    z10 = true;
                }
                this.f3508 = z10;
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public Socket m3253(int i10, int i11, boolean z10, boolean z11) {
        String str;
        try {
            InetAddress r22 = !C3823.m1590(this.f3510) ? C3727.m1055(this.f3510, true) : null;
            InetAddress r42 = C3727.m1055(this.f3507, true);
            if (r22 == null && i10 != 0) {
                if (r42.isLoopbackAddress()) {
                    str = C3727.m1052("\n<?#9j:-)\",*$b\u0015\u0003\u000f~(.<?7,w24 2hqtJ\\J^JTS]\u0012F_BZQ\u0014IFFKD\u0000\u0007$0,--`(#?#>9\"*%3w#=;?5q00(}9467\u0003\u0004\u0010\u0000\u0006MlGNH^W\u0019]EDZF\t\u0012!\u0002\u000e\u000f\t\u0013D\u0016\u000f\u001fH&!-%\u0003\u001e\u001a\u001e\u0014LW0\u0013\u001f\u001e\u0018\u0002U\u0017\u0013\u001b\u0017\u001f\u001a^)\u001f\u0013,\u000e$\u0002\n\u0004\u001dK\u001d\u0001\r\u0001N\u000e\u0003=<43#31zÇÈÄÇÍßàÜÓÃÏÄÆÆîÓÜÕÜÌôÊÁÝØØÂÈßÍ÷ÏÊÔÓÝþÃÌÅÌÜäÚÑÍÈÈöùõ±öüîµÑíâòþõ÷÷ßâíäíýÅûðìééó\u0018\u000e\u001e\u0010\u0003\f\u000f\u001b\u0007\n\u0013\t\u0014;,>\u0004<9' .A|szsc[enrww\u0016598>$s15=19<x/2 d\u000b)\"!/\n\"?;n(<k>\u001d\u001d\u0004V\u0005\u0019\u001e\u0017S\\>^\u001a\u0017\u0015\u0014\u0000\u0007\u0013\u000f\u000e\u000eC\u000b\u001eL\u0006\u0000I\u0018\u0019\u0005rfreb>!\u0002\u000e\u000f\t\u0013D\u0006\u0002\n\u0006\u000e\u000bO\u0018\u0005\u0017S<\u001e\u0015\u0016\u0018%\u0015\t\fY\u001f\u000b\\\t**3a2.) dk\ti- \"#70$899t<){17~/.2EQERU\tþÝÑÐÖÌÙÝÕÙÑÔÇÚÈýËÄÇßÏíËÔÒÁ×éôöí¹ìò÷ðº·×±óüüãéìúàçåªì÷§ïï óðÕÁâîïéó¤æâêæîë¯øå÷³ÂôûøàðÊôêí¾þè½ÖËÉÒÓÍÈÏèÌÃÃÜÖÓÅßØÚÓÈÐÐÌÏ­¤²¤µ´ê\n,7!+/!d\u0002\u001a\u001f-==$#=r'1;#0z&\u001b\u0015Q0\u001e\u0006\u0010\r\u001a\u0014\u00156\u0010\u000f\tB\u0002\u0004\u0005\u0014\u0002\u0017\u0016J\u0002\u001bI\u0007\u0001\u001a\f>:4kVX\u001ci_TWCS}[@F\u0011QKJ_IXY\tAT\u0006LJUCMI{0¯§ÐÉ¤Ó³ÁÚ¶»Êüóðèø²Òôõäòçæ°«¢©¡¯§ÐÉ«ÑÞç®ª··â¶©»¦í¿§Ã~fC\u0000\u0004\")!WEDJwHU]_QPH\u0000\u0019~FOIAG\u0002UO\u000fMBBEOJ\\7bz4aw|k{=ttim8poql#KQv9\r+ (JHGDNKORZF{u1ZxwtvSwjj?}yfqeru'mv*bfocei\u001cRypv`i'c{zdx7,Aa1s||{qtbpwu:~sjrE\u0000AG\u0005IFBL\bIONMZ]T\u0010GZP\u0014CWK_^N\u001dQ^]))-'e%$2 >.&4l=+7% 71t>\"wµ×ÙÅÀÌÏô¸¹ºµ¿¦ýãËÙØÖëÔÉÁÃÍÌÔçÔÔ×ÝÜÊØØÆÞÅÓØÛÿï©ààýù¬ôëõè§WOj+$<\u0019Z8joxxmlvd~mKmfnf@KOAA\u0006SG\tIDBCKLD\u0011F\\\u0014A^R\u0018K_VSI[\u001fhnqwTryq+\u000bG\u0005\r\u000f\u0010\u00072\u0002\u0000\u001a\u0000\u000e\u0012J\u0014\u0018\u0012\u0004\u0005P\u0001\u0017\u001e\u0019\u0016\b\u001c\u001c[\u0018 \"(4$` -#\"*-=!$$u7;9\"57¸º»·°¤¸±±ü¯¿¨½­¾íùüþþêÕëýëÿëõòü³çþãûðµèççêå¡ãÝËÝÉÝÃÄÊÑÈÕÍÆÞÑÑÜÓÎ¨°¬º¬õöèêÀÎËÝÅÍÀÏõ÷øûñôðíå¦­©§§àµ¡ï«¨¾ë©éº¸·´¾ó±µº­¹®©û¾¶Ç", 1270, 9, (int) CheckoutActivity.RESULT_ERROR);
                } else {
                    str = InetAddress.getLocalHost().getHostName();
                }
                InetAddress[] allByName = InetAddress.getAllByName(str);
                int i12 = 0;
                while (true) {
                    if (i12 >= allByName.length) {
                        break;
                    } else if (allByName[i12].getClass() == r42.getClass()) {
                        r22 = allByName[i12];
                        break;
                    } else {
                        i12++;
                    }
                }
                if (r22 == null) {
                    throw new C3625((Throwable) null, 1118, C3727.m1052("\n<?#9j:-)\",*$b\u0015\u0003\u000f~(.<?7,w24 2hqtJ\\J^JTS]\u0012F_BZQ\u0014IFFKD\u0000\u0007$0,--`(#?#>9\"*%3w#=;?5q00(}9467\u0003\u0004\u0010\u0000\u0006MlGNH^W\u0019]EDZF\t\u0012!\u0002\u000e\u000f\t\u0013D\u0016\u000f\u001fH&!-%\u0003\u001e\u001a\u001e\u0014LW0\u0013\u001f\u001e\u0018\u0002U\u0017\u0013\u001b\u0017\u001f\u001a^)\u001f\u0013,\u000e$\u0002\n\u0004\u001dK\u001d\u0001\r\u0001N\u000e\u0003=<43#31zÇÈÄÇÍßàÜÓÃÏÄÆÆîÓÜÕÜÌôÊÁÝØØÂÈßÍ÷ÏÊÔÓÝþÃÌÅÌÜäÚÑÍÈÈöùõ±öüîµÑíâòþõ÷÷ßâíäíýÅûðìééó\u0018\u000e\u001e\u0010\u0003\f\u000f\u001b\u0007\n\u0013\t\u0014;,>\u0004<9' .A|szsc[enrww\u0016598>$s15=19<x/2 d\u000b)\"!/\n\"?;n(<k>\u001d\u001d\u0004V\u0005\u0019\u001e\u0017S\\>^\u001a\u0017\u0015\u0014\u0000\u0007\u0013\u000f\u000e\u000eC\u000b\u001eL\u0006\u0000I\u0018\u0019\u0005rfreb>!\u0002\u000e\u000f\t\u0013D\u0006\u0002\n\u0006\u000e\u000bO\u0018\u0005\u0017S<\u001e\u0015\u0016\u0018%\u0015\t\fY\u001f\u000b\\\t**3a2.) dk\ti- \"#70$899t<){17~/.2EQERU\tþÝÑÐÖÌÙÝÕÙÑÔÇÚÈýËÄÇßÏíËÔÒÁ×éôöí¹ìò÷ðº·×±óüüãéìúàçåªì÷§ïï óðÕÁâîïéó¤æâêæîë¯øå÷³ÂôûøàðÊôêí¾þè½ÖËÉÒÓÍÈÏèÌÃÃÜÖÓÅßØÚÓÈÐÐÌÏ­¤²¤µ´ê\n,7!+/!d\u0002\u001a\u001f-==$#=r'1;#0z&\u001b\u0015Q0\u001e\u0006\u0010\r\u001a\u0014\u00156\u0010\u000f\tB\u0002\u0004\u0005\u0014\u0002\u0017\u0016J\u0002\u001bI\u0007\u0001\u001a\f>:4kVX\u001ci_TWCS}[@F\u0011QKJ_IXY\tAT\u0006LJUCMI{0¯§ÐÉ¤Ó³ÁÚ¶»Êüóðèø²Òôõäòçæ°«¢©¡¯§ÐÉ«ÑÞç®ª··â¶©»¦í¿§Ã~fC\u0000\u0004\")!WEDJwHU]_QPH\u0000\u0019~FOIAG\u0002UO\u000fMBBEOJ\\7bz4aw|k{=ttim8poql#KQv9\r+ (JHGDNKORZF{u1ZxwtvSwjj?}yfqeru'mv*bfocei\u001cRypv`i'c{zdx7,Aa1s||{qtbpwu:~sjrE\u0000AG\u0005IFBL\bIONMZ]T\u0010GZP\u0014CWK_^N\u001dQ^]))-'e%$2 >.&4l=+7% 71t>\"wµ×ÙÅÀÌÏô¸¹ºµ¿¦ýãËÙØÖëÔÉÁÃÍÌÔçÔÔ×ÝÜÊØØÆÞÅÓØÛÿï©ààýù¬ôëõè§WOj+$<\u0019Z8joxxmlvd~mKmfnf@KOAA\u0006SG\tIDBCKLD\u0011F\\\u0014A^R\u0018K_VSI[\u001fhnqwTryq+\u000bG\u0005\r\u000f\u0010\u00072\u0002\u0000\u001a\u0000\u000e\u0012J\u0014\u0018\u0012\u0004\u0005P\u0001\u0017\u001e\u0019\u0016\b\u001c\u001c[\u0018 \"(4$` -#\"*-=!$$u7;9\"57¸º»·°¤¸±±ü¯¿¨½­¾íùüþþêÕëýëÿëõòü³çþãûðµèççêå¡ãÝËÝÉÝÃÄÊÑÈÕÍÆÞÑÑÜÓÎ¨°¬º¬õöèêÀÎËÝÅÍÀÏõ÷øûñôðíå¦­©§§àµ¡ï«¨¾ë©éº¸·´¾ó±µº­¹®©û¾¶Ç", 1279, 40, 17));
                }
            }
            Socket socket = z11 ? new Socket(Proxy.NO_PROXY) : new Socket();
            if (z10) {
                socket.setReuseAddress(true);
            }
            if (r22 != null) {
                socket.bind(new InetSocketAddress(r22, i10));
            }
            socket.connect(new InetSocketAddress(r42, i11), 300);
            this.f3508 = true;
            this.f3509 = true;
            return socket;
        } catch (Exception unused) {
            this.f3508 = false;
            return null;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final boolean m3255(String str) {
        String[] r82 = C3823.m1632(str, ".");
        if (r82.length != 4) {
            return false;
        }
        int i10 = 0;
        while (i10 < r82.length) {
            try {
                long parseLong = Long.parseLong(r82[i10], 10);
                if (parseLong >= 0 && parseLong <= 255) {
                    i10++;
                }
            } catch (Exception unused) {
            }
            return false;
        }
        return true;
    }
}
