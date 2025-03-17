package nts;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;

/* renamed from: nts.ᆎ  reason: contains not printable characters */
public class C3796 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f1329;

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f1330;

    /* renamed from: и  reason: contains not printable characters */
    public boolean f1331;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f1332;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3796 f1333;

    /* renamed from: ખ  reason: contains not printable characters */
    public boolean f1334;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f1335;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] f1336;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int f1337;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f1338;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public int f1339;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public ByteArrayOutputStream f1340;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public Vector f1341;

    /* renamed from: ᢼ  reason: contains not printable characters */
    public Vector f1342;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public boolean f1343;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f1344;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f1345;

    public C3796(byte[] bArr, int i10, C3796 r62) {
        this.f1336 = C3596.f365;
        this.f1335 = 0;
        this.f1338 = 0;
        this.f1329 = 0;
        this.f1344 = 0;
        this.f1345 = 0;
        this.f1332 = 0;
        this.f1334 = false;
        this.f1330 = false;
        this.f1343 = false;
        this.f1337 = 0;
        this.f1340 = null;
        this.f1333 = null;
        this.f1331 = true;
        this.f1339 = 0;
        this.f1341 = new Vector();
        this.f1342 = null;
        this.f1336 = bArr;
        this.f1337 = i10;
        this.f1330 = r62.f1334;
        this.f1344 = bArr.length;
        this.f1333 = r62;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static int[] m1318(String str) {
        int[] iArr = new int[255];
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            while (i10 < length && !Character.isDigit(str.charAt(i10))) {
                i10++;
            }
            int i12 = i10;
            while (i12 < length && Character.isDigit(str.charAt(i12))) {
                i12++;
            }
            if (i10 != i12) {
                iArr[i11] = (int) Long.parseLong(str.substring(i10, i12));
                i10 = i12;
                i11++;
            } else {
                i10 = i12;
            }
        }
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        return iArr2;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public C3796 m1323(int i10) {
        m1352(i10);
        return new C3796(m1325(), this.f1345);
    }

    /* renamed from: Е  reason: contains not printable characters */
    public void m1324() {
        int r02 = m1322();
        this.f1345 = r02;
        if ((r02 & 31) != 31) {
            int r03 = m1322();
            boolean z10 = true;
            boolean z11 = (this.f1345 & -33) == 0 && (r03 & -33) == 0;
            this.f1343 = z11;
            if (!z11) {
                if ((r03 & 128) > 0) {
                    byte b10 = (byte) (r03 & -129);
                    if (b10 != 0) {
                        z10 = false;
                    }
                    this.f1334 = z10;
                    if (!z10) {
                        if (b10 <= 4) {
                            this.f1332 = 0;
                            for (int i10 = 0; i10 < b10; i10++) {
                                this.f1332 = (this.f1332 << 8) | m1322();
                            }
                        } else {
                            throw new C3625((Throwable) null, 446, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 272, 15, 38));
                        }
                    } else {
                        return;
                    }
                } else {
                    this.f1332 = r03;
                }
                if (this.f1332 < 0) {
                    throw new C3625((Throwable) null, 446, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 287, 15, 115));
                }
                return;
            }
            return;
        }
        throw new C3625((Throwable) null, 305, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 252, 20, 0));
    }

    /* renamed from: и  reason: contains not printable characters */
    public byte[] m1325() {
        m1324();
        if (!this.f1334) {
            int i10 = this.f1335;
            int i11 = this.f1332;
            int i12 = i10 + i11;
            byte[] bArr = this.f1336;
            if (i12 <= bArr.length) {
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i10, bArr2, 0, i11);
                this.f1335 += this.f1332;
                return bArr2;
            }
            throw new C3625((Throwable) null, 447, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 73, 13, 115));
        } else if ((this.f1345 | 32) != 0) {
            this.f1335 -= 2;
            m1324();
            C3796 r02 = new C3796(this.f1336, this.f1345, this);
            r02.f1335 = this.f1335;
            if (!this.f1334) {
                r02.f1344 = this.f1335 + this.f1332;
            }
            C3874 r52 = new C3874(256);
            while (!r02.m1354()) {
                r52.m1920(r02.m1325());
            }
            if (r02.m1354()) {
                if (r02.f1330) {
                    r02.f1335 += 2;
                }
                C3796 r12 = r02.f1333;
                if (r12 != null) {
                    r12.f1335 = r02.f1335;
                }
                return r52.m1923();
            }
            throw new C3625((Throwable) null, 446, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 58, 15, 30));
        } else {
            throw new C3625((Throwable) null, 446, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 86, 15, 91));
        }
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int m1326() {
        int i10 = this.f1335;
        if (i10 < this.f1344) {
            return this.f1336[i10] & 255;
        }
        throw new C3625((Throwable) null, 447, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 302, 13, 58));
    }

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3796 m1327() {
        return new C3796(m1325(), this.f1345);
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public byte[] m1328() {
        byte[] r02 = m1325();
        if (this.f1332 == 0 || r02[0] > 7) {
            throw new C3625((Throwable) null, 446, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 116, 15, 69));
        } else if (r02.length == 1) {
            return C3596.f365;
        } else {
            int length = r02.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(r02, 1, bArr, 0, length);
            return bArr;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1336(C3707 r42) {
        int i10 = r42.f933;
        if (i10 > 0) {
            this.f1339 = i10 + this.f1340.size();
        }
        try {
            this.f1340.write(r42.f934);
        } catch (IOException e10) {
            throw new C3625(e10, C3625.m591(e10), C3625.m589(e10));
        }
    }

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int[] m1343() {
        int r72;
        int[] iArr = new int[255];
        m1324();
        int i10 = this.f1332;
        if (i10 == 0) {
            return new int[]{0};
        }
        int i11 = 1;
        while (i10 > 0) {
            int i12 = 0;
            do {
                r72 = m1322();
                if ((-33554432 & i12) == 0) {
                    i12 = (i12 << 7) + (r72 & -129);
                    i10--;
                } else {
                    throw new C3625((Throwable) null, 446, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 131, 39, 92));
                }
            } while ((r72 & 128) != 0);
            if (i11 != 255) {
                iArr[i11] = i12;
                i11++;
            } else {
                throw new C3625((Throwable) null, 446, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 170, 32, 75) + 255 + C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 202, 19, 112));
            }
        }
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        int i13 = iArr2[1];
        iArr2[0] = i13 / 40;
        iArr2[1] = i13 % 40;
        return iArr2;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1346(byte[] bArr, int i10) {
        if (bArr != null) {
            try {
                m1319(this.f1340, i10, bArr.length);
                this.f1340.write(bArr);
            } catch (IOException e10) {
                throw new C3625((Throwable) e10, C3625.m589(e10));
            }
        } else {
            throw new C3625((Throwable) null, 445, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 328, 15, 42));
        }
    }

    /* renamed from: ᖑ  reason: contains not printable characters */
    public void m1347() {
        this.f1340 = new ByteArrayOutputStream();
        this.f1336 = C3596.f365;
        this.f1337 = 0;
        this.f1333 = null;
        this.f1335 = 0;
        this.f1338 = 0;
        this.f1329 = 0;
        this.f1344 = 0;
        this.f1345 = 0;
        this.f1332 = 0;
        this.f1341.clear();
    }

    /* renamed from: ᘺ  reason: contains not printable characters */
    public String m1348() {
        int[] r02 = m1343();
        StringBuffer stringBuffer = new StringBuffer();
        int length = r02.length;
        for (int i10 = 0; i10 < length; i10++) {
            stringBuffer.append(((long) r02[i10]) & 4294967295L);
            if (i10 < length - 1) {
                stringBuffer.append('.');
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[Catch:{ IOException -> 0x0024 }] */
    /* renamed from: ᜇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nts.C3707 m1349() {
        /*
            r5 = this;
            nts.ય r0 = new nts.ય
            r0.<init>()
            int r1 = r5.f1337
            if (r1 == 0) goto L_0x0058
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            int r2 = r5.f1339     // Catch:{ IOException -> 0x0024 }
            r3 = 2
            if (r2 > 0) goto L_0x0026
            boolean r2 = r5.f1331     // Catch:{ IOException -> 0x0024 }
            if (r2 != 0) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            int r2 = r5.f1337     // Catch:{ IOException -> 0x0024 }
            java.io.ByteArrayOutputStream r4 = r5.f1340     // Catch:{ IOException -> 0x0024 }
            int r4 = r4.size()     // Catch:{ IOException -> 0x0024 }
            m1319(r1, r2, r4)     // Catch:{ IOException -> 0x0024 }
            goto L_0x0035
        L_0x0024:
            r0 = move-exception
            goto L_0x004e
        L_0x0026:
            int r2 = r5.f1337     // Catch:{ IOException -> 0x0024 }
            r1.write(r2)     // Catch:{ IOException -> 0x0024 }
            r2 = 128(0x80, float:1.794E-43)
            r1.write(r2)     // Catch:{ IOException -> 0x0024 }
            int r2 = r5.f1339     // Catch:{ IOException -> 0x0024 }
            int r2 = r2 + r3
            r0.f933 = r2     // Catch:{ IOException -> 0x0024 }
        L_0x0035:
            java.io.ByteArrayOutputStream r2 = r5.f1340     // Catch:{ IOException -> 0x0024 }
            byte[] r2 = r2.toByteArray()     // Catch:{ IOException -> 0x0024 }
            r1.write(r2)     // Catch:{ IOException -> 0x0024 }
            int r2 = r0.f933     // Catch:{ IOException -> 0x0024 }
            if (r2 == 0) goto L_0x0047
            byte[] r2 = new byte[r3]     // Catch:{ IOException -> 0x0024 }
            r1.write(r2)     // Catch:{ IOException -> 0x0024 }
        L_0x0047:
            byte[] r1 = r1.toByteArray()     // Catch:{ IOException -> 0x0024 }
            r0.f934 = r1     // Catch:{ IOException -> 0x0024 }
            goto L_0x0064
        L_0x004e:
            nts.Ԕ r1 = new nts.Ԕ
            java.lang.String r2 = nts.C3625.m589(r0)
            r1.<init>((java.lang.Throwable) r0, (java.lang.String) r2)
            throw r1
        L_0x0058:
            java.io.ByteArrayOutputStream r1 = r5.f1340
            byte[] r1 = r1.toByteArray()
            r0.f934 = r1
            int r1 = r5.f1339
            r0.f933 = r1
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3796.m1349():nts.ય");
    }

    /* renamed from: ᢼ  reason: contains not printable characters */
    public void m1350() {
        m1324();
        int i10 = this.f1335;
        int i11 = this.f1332;
        int i12 = i10 + i11;
        byte[] bArr = this.f1336;
        if (i12 <= bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            this.f1336 = bArr2;
            this.f1344 = this.f1332;
            this.f1329 = 0;
            this.f1338 = 0;
            this.f1335 = 0;
            return;
        }
        throw new C3625((Throwable) null, 447, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 0, 13, 50));
    }

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int m1351() {
        m1324();
        if (this.f1332 > 4) {
            int i10 = 0;
            while (i10 < this.f1332 - 4) {
                if (m1322() == 0) {
                    i10++;
                } else {
                    throw new C3625((Throwable) null, 446, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 13, 15, 116));
                }
            }
        }
        int i11 = (m1326() & 128) != 0 ? -1 : 0;
        for (int i12 = 0; i12 < this.f1332; i12++) {
            i11 = (i11 << 8) | m1322();
        }
        return i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (((r6.f1335 + r6.f1332) - 1) < r6.f1336.length) goto L_0x002c;
     */
    /* renamed from: ⶊ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m1353() {
        /*
            r6 = this;
            int r0 = r6.f1335
            int r1 = r6.f1332
            int r2 = r6.f1345
            int r3 = r6.f1344     // Catch:{ Ԕ -> 0x0024 }
            if (r0 >= r3) goto L_0x002b
            r6.m1324()     // Catch:{ Ԕ -> 0x0024 }
            boolean r3 = r6.f1343     // Catch:{ Ԕ -> 0x0024 }
            if (r3 == 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r3 = r6.f1330     // Catch:{ Ԕ -> 0x0024 }
            r4 = 1
            if (r3 == 0) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            int r3 = r6.f1335     // Catch:{ Ԕ -> 0x0024 }
            int r5 = r6.f1332     // Catch:{ Ԕ -> 0x0024 }
            int r3 = r3 + r5
            int r3 = r3 - r4
            byte[] r5 = r6.f1336     // Catch:{ Ԕ -> 0x0024 }
            int r5 = r5.length     // Catch:{ Ԕ -> 0x0024 }
            if (r3 >= r5) goto L_0x002b
            goto L_0x002c
        L_0x0024:
            r3 = move-exception
            int r4 = r3.f605
            r5 = 447(0x1bf, float:6.26E-43)
            if (r4 != r5) goto L_0x0033
        L_0x002b:
            r4 = 0
        L_0x002c:
            r6.f1335 = r0
            r6.f1332 = r1
            r6.f1345 = r2
            return r4
        L_0x0033:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3796.m1353():boolean");
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public boolean m1354() {
        return !m1353();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m1322() {
        int i10 = this.f1335;
        if (i10 < this.f1344) {
            byte[] bArr = this.f1336;
            this.f1335 = i10 + 1;
            return bArr[i10] & 255;
        }
        throw new C3625((Throwable) null, 447, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 315, 13, 22));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1331(byte[] bArr, int i10) {
        if (bArr == null || bArr.length == 0) {
            throw new C3625((Throwable) null, 445, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 358, 15, 72));
        }
        byte[] bArr2 = new byte[(bArr.length + 1)];
        bArr2[0] = 0;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        m1346(bArr2, i10);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1339(byte[] bArr) {
        try {
            this.f1340.write(bArr);
        } catch (IOException e10) {
            throw new C3625((Throwable) e10, C3625.m589(e10));
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1345() {
        m1330();
        for (int i10 = 0; i10 < m1332(); i10++) {
            m1329(i10).m1345();
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1335(String str) {
        m1341(m1318(str), 6);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3796 m1344(int i10) {
        for (int i11 = 0; i11 < m1332(); i11++) {
            if (m1329(i11).f1345 == i10) {
                return m1329(i11);
            }
        }
        return null;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public void m1352(int i10) {
        if (i10 < this.f1329) {
            this.f1338 = 0;
            this.f1329 = 0;
        }
        this.f1335 = this.f1338;
        while (this.f1329 < i10) {
            m1324();
            this.f1335 += this.f1332;
            this.f1329++;
        }
        this.f1338 = this.f1335;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1334(int i10, int i11) {
        int i12 = 4;
        while (true) {
            int i13 = i10 & -8388608;
            if ((i13 == 0 || i13 == -8388608) && i12 > 1) {
                i12--;
                i10 <<= 8;
            } else {
                try {
                    m1319(this.f1340, i11, i12);
                    while (i12 > 0) {
                        this.f1340.write((byte) ((-16777216 & i10) >>> 24));
                        i10 <<= 8;
                        i12--;
                    }
                    return;
                } catch (IOException e10) {
                    throw new C3625((Throwable) e10, C3625.m589(e10));
                }
            }
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1330() {
        int[] iArr = {0};
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        int[] iArr4 = {0};
        int[] iArr5 = {0};
        String str = "qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ";
        if (!m1342(this.f1335, this.f1344, iArr, iArr2, iArr3, iArr4, iArr5)) {
            throw new C3625((Throwable) null, 446, C3727.m1052(str, 424, 13, 54));
        } else if (iArr5[0] == this.f1344) {
            int i10 = iArr[0];
            this.f1345 = i10;
            if ((i10 & 32) == 32) {
                this.f1342 = new Vector();
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11;
                while (i13 < i12) {
                    int i14 = i12;
                    String str2 = str;
                    if (m1342(i13, i12, iArr, iArr2, iArr3, iArr4, iArr5)) {
                        byte[] bArr = this.f1336;
                        int i15 = iArr4[0];
                        C3796 r02 = new C3796(C3823.m1630(bArr, i15, iArr5[0] - i15));
                        r02.f1345 = iArr[0];
                        this.f1342.add(r02);
                        i13 = iArr5[0];
                        i12 = i14;
                        str = str2;
                    } else {
                        throw new C3625((Throwable) null, 446, C3727.m1052(str2, 451, 13, 90));
                    }
                }
            }
        } else {
            throw new C3625((Throwable) null, 446, C3727.m1052(str, 437, 14, 10));
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1340(byte[] bArr, int i10) {
        if (bArr != null) {
            int i11 = 1;
            if (bArr.length <= 1 || (bArr[0] & 255) < 128) {
                i11 = 0;
            }
            try {
                m1319(this.f1340, i10, bArr.length + i11);
                if (i11 != 0) {
                    this.f1340.write(0);
                }
                this.f1340.write(bArr);
            } catch (IOException e10) {
                throw new C3625((Throwable) e10, C3625.m589(e10));
            }
        } else {
            throw new C3625((Throwable) null, 445, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 343, 15, 21));
        }
    }

    public C3796(byte[] bArr, int i10) {
        this.f1336 = C3596.f365;
        this.f1335 = 0;
        this.f1338 = 0;
        this.f1329 = 0;
        this.f1344 = 0;
        this.f1345 = 0;
        this.f1332 = 0;
        this.f1334 = false;
        this.f1330 = false;
        this.f1343 = false;
        this.f1337 = 0;
        this.f1340 = null;
        this.f1333 = null;
        this.f1331 = true;
        this.f1339 = 0;
        this.f1341 = new Vector();
        this.f1342 = null;
        this.f1336 = bArr;
        this.f1337 = i10;
        this.f1344 = bArr.length;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1341(int[] r12, int r13) {
        /*
            r11 = this;
            int r0 = r12.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1
            r3 = 0
            r4 = 2
            if (r0 >= r4) goto L_0x000f
            r1.write(r3)
            goto L_0x001a
        L_0x000f:
            r5 = r12[r3]
            int r5 = r5 * 40
            r2 = r12[r2]
            int r5 = r5 + r2
            r1.write(r5)
        L_0x0019:
            r2 = r4
        L_0x001a:
            if (r2 >= r0) goto L_0x0055
            int r4 = r2 + 1
            r2 = r12[r2]
            r5 = 127(0x7f, float:1.78E-43)
            if (r2 < 0) goto L_0x002a
            if (r2 >= r5) goto L_0x002a
            r1.write(r2)
            goto L_0x0019
        L_0x002a:
            r7 = r3
            r9 = r7
            r6 = r5
            r8 = r6
        L_0x002e:
            if (r6 == 0) goto L_0x003b
            r10 = r2 & r6
            if (r10 == 0) goto L_0x0036
            r8 = r6
            r9 = r7
        L_0x0036:
            int r6 = r6 << 7
            int r7 = r7 + 7
            goto L_0x002e
        L_0x003b:
            if (r8 == r5) goto L_0x0050
            r6 = 31457280(0x1e00000, float:8.2284605E-38)
            if (r8 != r6) goto L_0x0043
            r8 = 266338304(0xfe00000, float:2.2088105E-29)
        L_0x0043:
            r6 = r2 & r8
            int r6 = r6 >>> r9
            r6 = r6 | 128(0x80, float:1.794E-43)
            r1.write(r6)
            int r8 = r8 >>> 7
            int r9 = r9 + -7
            goto L_0x003b
        L_0x0050:
            r2 = r2 & r8
            r1.write(r2)
            goto L_0x0019
        L_0x0055:
            byte[] r12 = r1.toByteArray()
            java.io.ByteArrayOutputStream r0 = r11.f1340     // Catch:{ IOException -> 0x0065 }
            int r1 = r12.length     // Catch:{ IOException -> 0x0065 }
            m1319(r0, r13, r1)     // Catch:{ IOException -> 0x0065 }
            java.io.ByteArrayOutputStream r13 = r11.f1340     // Catch:{ IOException -> 0x0065 }
            r13.write(r12)     // Catch:{ IOException -> 0x0065 }
            return
        L_0x0065:
            r12 = move-exception
            nts.Ԕ r13 = new nts.Ԕ
            java.lang.String r0 = nts.C3625.m589(r12)
            int r1 = nts.C3625.m591(r12)
            r13.<init>(r12, r1, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3796.m1341(int[], int):void");
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C3796 m1329(int i10) {
        return (C3796) this.f1342.get(i10);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1337(C3796 r42) {
        try {
            int i10 = r42.f1337;
            if (i10 != 0) {
                m1319(this.f1340, i10, r42.f1340.size());
            }
            this.f1340.write(r42.f1340.toByteArray());
        } catch (IOException e10) {
            throw new C3625((Throwable) e10, C3625.m589(e10));
        }
    }

    public C3796(byte[] bArr) {
        this.f1336 = C3596.f365;
        this.f1335 = 0;
        this.f1338 = 0;
        this.f1329 = 0;
        this.f1344 = 0;
        this.f1345 = 0;
        this.f1332 = 0;
        this.f1334 = false;
        this.f1330 = false;
        this.f1343 = false;
        this.f1337 = 0;
        this.f1340 = null;
        this.f1333 = null;
        this.f1331 = true;
        this.f1339 = 0;
        this.f1341 = new Vector();
        this.f1342 = null;
        this.f1336 = bArr;
        this.f1344 = bArr.length;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1319(ByteArrayOutputStream byteArrayOutputStream, int i10, int i11) {
        byteArrayOutputStream.write(i10);
        if (i11 < 128) {
            byteArrayOutputStream.write(i11);
            return;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            if ((i11 >>> (i13 * 8)) != 0) {
                i12 = i13 + 1;
            }
        }
        byteArrayOutputStream.write(i12 | 128);
        while (i12 > 0) {
            byteArrayOutputStream.write((i11 >>> ((i12 * 8) - 8)) & 255);
            i12--;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static boolean m1321(byte[] bArr, boolean z10) {
        int length = bArr.length;
        int[] iArr = {0};
        int[] iArr2 = {0};
        if (!m1320(bArr, 0, length, new int[]{0}, new int[]{0}, new int[]{0}, iArr, iArr2)) {
            return false;
        }
        if (z10) {
            if (iArr[0] != 0 || iArr2[0] > length) {
                return false;
            }
            return true;
        } else if (iArr[0] == 0 && iArr2[0] == length) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1320(byte[] r17, int r18, int r19, int[] r20, int[] r21, int[] r22, int[] r23, int[] r24) {
        /*
            r8 = r19
            r9 = 0
            r23[r9] = r18
            int r0 = r18 + 1
            byte r1 = r17[r18]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r20[r9] = r1
            r10 = 2
            int r2 = r18 + 2
            byte r0 = r17[r0]
            r3 = r0 & 255(0xff, float:3.57E-43)
            r11 = 1
            if (r1 != 0) goto L_0x0020
            if (r3 != 0) goto L_0x0020
            r21[r9] = r2
            r22[r9] = r2
            r24[r9] = r2
            return r11
        L_0x0020:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 <= 0) goto L_0x0041
            r0 = r0 & 127(0x7f, float:1.78E-43)
            char r0 = (char) r0
            r1 = 4
            if (r0 <= r1) goto L_0x002b
            return r9
        L_0x002b:
            if (r0 != 0) goto L_0x0030
            r3 = r9
            r0 = r11
            goto L_0x0042
        L_0x0030:
            r1 = r9
            r3 = r1
        L_0x0032:
            if (r1 >= r0) goto L_0x0041
            int r3 = r3 << 8
            int r4 = r2 + 1
            byte r2 = r17[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = r3 | r2
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0032
        L_0x0041:
            r0 = r9
        L_0x0042:
            if (r3 >= 0) goto L_0x0045
            return r9
        L_0x0045:
            r21[r9] = r2
            if (r0 == 0) goto L_0x00aa
            r0 = r20[r9]
            r1 = 32
            r0 = r0 & r1
            if (r0 != r1) goto L_0x008f
            int[] r12 = new int[]{r9}
            int[] r13 = new int[]{r9}
            int[] r14 = new int[]{r9}
            int[] r15 = new int[]{r9}
            int[] r16 = new int[]{r9}
            r1 = r2
        L_0x0065:
            if (r1 >= r8) goto L_0x008e
            r0 = r17
            r2 = r19
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            boolean r0 = m1320(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x008e
            r0 = r12[r9]
            if (r0 != 0) goto L_0x008b
            r0 = r16[r9]
            r1 = r15[r9]
            int r1 = r0 - r1
            if (r1 != r10) goto L_0x008b
            int r0 = r0 - r10
            r22[r9] = r0
            r0 = r16[r9]
            r24[r9] = r0
            return r11
        L_0x008b:
            r1 = r16[r9]
            goto L_0x0065
        L_0x008e:
            return r9
        L_0x008f:
            int r0 = r8 + -1
            if (r2 >= r0) goto L_0x00a9
            byte r0 = r17[r2]
            int r1 = r2 + 1
            byte r3 = r17[r1]
            r0 = r0 & -33
            if (r0 != 0) goto L_0x00a7
            r0 = r3 & -33
            if (r0 != 0) goto L_0x00a7
            r22[r9] = r2
            int r2 = r2 + r10
            r24[r9] = r2
            return r11
        L_0x00a7:
            r2 = r1
            goto L_0x008f
        L_0x00a9:
            return r9
        L_0x00aa:
            int r2 = r2 + r3
            if (r2 > r8) goto L_0x00b2
            r22[r9] = r2
            r24[r9] = r2
            return r11
        L_0x00b2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3796.m1320(byte[], int, int, int[], int[], int[], int[], int[]):boolean");
    }

    public C3796() {
        this.f1336 = C3596.f365;
        this.f1335 = 0;
        this.f1338 = 0;
        this.f1329 = 0;
        this.f1344 = 0;
        this.f1345 = 0;
        this.f1332 = 0;
        this.f1334 = false;
        this.f1330 = false;
        this.f1343 = false;
        this.f1337 = 0;
        this.f1340 = null;
        this.f1333 = null;
        this.f1331 = true;
        this.f1339 = 0;
        this.f1341 = new Vector();
        this.f1342 = null;
        this.f1340 = new ByteArrayOutputStream();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m1332() {
        Vector vector = this.f1342;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cf  */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m1342(int r19, int r20, int[] r21, int[] r22, int[] r23, int[] r24, int[] r25) {
        /*
            r18 = this;
            r8 = r18
            r9 = r20
            r10 = 0
            r24[r10] = r19
            byte[] r0 = r8.f1336
            int r1 = r19 + 1
            byte r2 = r0[r19]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r21[r10] = r2
            r11 = 2
            int r3 = r19 + 2
            byte r0 = r0[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r12 = 1
            if (r2 != 0) goto L_0x0024
            if (r1 != 0) goto L_0x0024
            r22[r10] = r3
            r23[r10] = r3
            r25[r10] = r3
            return r12
        L_0x0024:
            r2 = r0 & 128(0x80, float:1.794E-43)
            r4 = 446(0x1be, float:6.25E-43)
            r5 = 0
            r6 = 15
            java.lang.String r7 = "qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ"
            if (r2 <= 0) goto L_0x004c
            r0 = r0 & 127(0x7f, float:1.78E-43)
            byte r0 = (byte) r0
            r1 = 4
            if (r0 > r1) goto L_0x004e
            r1 = r10
            if (r0 != 0) goto L_0x003a
            r0 = r12
            goto L_0x005c
        L_0x003a:
            r2 = r1
        L_0x003b:
            if (r2 >= r0) goto L_0x004c
            int r1 = r1 << 8
            byte[] r13 = r8.f1336
            int r14 = r3 + 1
            byte r3 = r13[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r1 = r1 | r3
            int r2 = r2 + 1
            r3 = r14
            goto L_0x003b
        L_0x004c:
            r0 = r10
            goto L_0x005c
        L_0x004e:
            nts.Ԕ r0 = new nts.Ԕ
            r1 = 464(0x1d0, float:6.5E-43)
            r2 = 67
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r7, (int) r1, (int) r6, (int) r2)
            r0.<init>(r5, r4, r1)
            throw r0
        L_0x005c:
            if (r1 < 0) goto L_0x00cf
            r22[r10] = r3
            if (r0 == 0) goto L_0x00c6
            r0 = r21[r10]
            r1 = 32
            r0 = r0 & r1
            if (r0 != r1) goto L_0x00a9
            int[] r13 = new int[]{r10}
            int[] r14 = new int[]{r10}
            int[] r15 = new int[]{r10}
            int[] r16 = new int[]{r10}
            int[] r17 = new int[]{r10}
            r1 = r3
        L_0x007e:
            if (r1 >= r9) goto L_0x00a8
            r0 = r18
            r2 = r20
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            boolean r0 = r0.m1342(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x00a8
            r0 = r13[r10]
            if (r0 != 0) goto L_0x00a5
            r0 = r17[r10]
            r1 = r16[r10]
            int r1 = r0 - r1
            if (r1 != r11) goto L_0x00a5
            int r0 = r0 - r11
            r23[r10] = r0
            r0 = r17[r10]
            r25[r10] = r0
            return r12
        L_0x00a5:
            r1 = r17[r10]
            goto L_0x007e
        L_0x00a8:
            return r10
        L_0x00a9:
            int r0 = r9 + -1
            if (r3 >= r0) goto L_0x00c5
            byte[] r0 = r8.f1336
            byte r1 = r0[r3]
            int r2 = r3 + 1
            byte r0 = r0[r2]
            r1 = r1 & -33
            if (r1 != 0) goto L_0x00c3
            r0 = r0 & -33
            if (r0 != 0) goto L_0x00c3
            r23[r10] = r3
            int r3 = r3 + r11
            r25[r10] = r3
            return r12
        L_0x00c3:
            r3 = r2
            goto L_0x00a9
        L_0x00c5:
            return r10
        L_0x00c6:
            int r3 = r3 + r1
            if (r3 > r9) goto L_0x00ce
            r23[r10] = r3
            r25[r10] = r3
            return r12
        L_0x00ce:
            return r10
        L_0x00cf:
            nts.Ԕ r0 = new nts.Ԕ
            r1 = 479(0x1df, float:6.71E-43)
            r2 = 22
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r7, (int) r1, (int) r6, (int) r2)
            r0.<init>(r5, r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3796.m1342(int, int, int[], int[], int[], int[], int[]):boolean");
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1333(int i10) {
        this.f1341.add(Integer.valueOf(this.f1340.size()));
        try {
            this.f1340.write(new byte[]{(byte) i10, Byte.MIN_VALUE});
        } catch (Exception e10) {
            throw new C3625((Throwable) e10, C3625.m589(e10));
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1338(boolean z10) {
        if (this.f1341.size() > 0) {
            int intValue = ((Integer) this.f1341.lastElement()).intValue();
            Vector vector = this.f1341;
            vector.removeElementAt(vector.size() - 1);
            if (z10) {
                try {
                    this.f1340.write(new byte[]{0, 0});
                } catch (Exception e10) {
                    throw new C3625((Throwable) e10, C3625.m589(e10));
                }
            } else {
                int i10 = intValue + 2;
                int size = this.f1340.size() - i10;
                byte[] byteArray = this.f1340.toByteArray();
                if (size < 128) {
                    byteArray[intValue + 1] = (byte) size;
                } else {
                    byte[] bArr = new byte[4];
                    int i11 = 0;
                    while (size > 0) {
                        bArr[3 - i11] = (byte) (size & 255);
                        size >>= 8;
                        i11++;
                    }
                    byteArray[intValue + 1] = (byte) (128 | i11);
                    byte[] bArr2 = new byte[(byteArray.length + i11)];
                    System.arraycopy(byteArray, 0, bArr2, 0, i10);
                    System.arraycopy(bArr, 4 - i11, bArr2, i10, i11);
                    System.arraycopy(byteArray, i10, bArr2, i11 + i10, (byteArray.length - intValue) - 2);
                    byteArray = bArr2;
                }
                this.f1340.reset();
                try {
                    this.f1340.write(byteArray);
                } catch (Exception e11) {
                    throw new C3625((Throwable) e11, C3625.m589(e11));
                }
            }
        } else {
            throw new C3625((Throwable) null, 445, C3727.m1052("qQ\u001dQTH\\\u0018SWAU\u001d3\u0005\u0006\u001a\u0000S\u0014\u0014\u001d\u0010\u0018\u0014\u0014\u001cVRdg{a2uu|qyuu}7\u0018.-1+x??6;3??7}nX[G]\u000eII@MEIIA\u000byY\u0015Y\\@T\u0010[_I]\u0015Gqrnt'``idl``h\"\u000e8;'=n)) -%))!k{MNRH\u001b\\\\UXP\\\\T\u001e½ÝÌ×Å·ù¶´²ºð²±­·ä££ª§¯££«õî±«·¾ù®º¶¨¹ÿöÃËÞÍËÄÎÐÀÅÄÎÜÜ £¿¥ö±±¸µ½±±¹çü®£­¦¨´¨¡¯êã½ÃÕ|JIUO\u001c[[R_W[[S\u0019&\u0010\u0013\u000f\u0015F\u0001\u0001\b\u0005\r\u0001\u0001\tCWw;wrnz>uqgs;nN\u0002NKWC\u0007LH^J\u0002(\u001e\u001d\u0001\u001bH\u000e\u0004\u0006\u000b\u0003\u000f\u000f\u0007M\b>=!;h.$&+#//'mdRQMW\u0004BHJGOCCK\u00015\u0003\u0000\u001c\u0006U\u0013\u0019\u001b\u0016\u001e\u0012\u0012\u001aP¢¡½§ô²¸º·¿³³»åþ¦¡¶¢µºè¥¥¹ì¤ ÜÝý±ýøäð´ÿûíù±åßÜØÁÔÞÜÚÎÜÚú¶úÿã÷³øüêþ¶Ùïìðê¹þþ÷úòþþö¼µ¶ª°ã¤¤­ ¨¤¤¬æíÞÀÍÇÉÄÀÌÈÀÄÐÑÓÏrq@\\eUEE\\J\u0001\u001aSS\u001fSNRF\u0002dwi\b\u0018\bOKYM\u000fZ~0awtp9zyHTm]MMTB\t\u0012pXR[LF_\nD_\u000fZNO\u0003NJJ@\b\u0002\u00010,\u0015%55,:qj\u000e-!n??'r3=92y,3?}l'nQLCR\u001dTWHuvG[bRBB[M\u0006\u001dTT\u0018TIUA\u0005GOELKAX\r^D\bYyg:áâÓÏöÆÖÖÏÙÌÊËÄÜáÑÆòÖÀÔÐÍÑÔñðéïá©óðÁÝäÔÄÄÝËõÓÈÞÌÈÆÁËÅÈÌÀÄÌËÁÝ°åúö´ðúòõüôï¼ñûñçõê­ßÜíñÈøèèñç¬·Ùÿäòàäê¯íçéäàìèà çíñÉÖÚÜÖÞÙÐØÃÝ×ÝËÙÆZYhtM}mmtb)2plgsj|+-\u0005\u0003BTR\u0007C@^\u000b\u000f\u0019\u001a+7\u000e>..7!jq3/$0)?h\u001a+>9(, %a2&#e\u000e\u0014X\u001c\u0010\u001bqrC_fVFF_I\u0002\u0019[GLXAW\u0000rCS\u0004QKL\b]A\u000fICvëèÙÅüÌÜÜÅÓÌÄÕê×ËßøÔÔÒÛÞÁÆÂêìïå¬äàùïêçç¤äàóýëºùùú÷ñÕý÷þñûâ¿ÁÇÎÍüàÙéùùàö½¦Èîççûõñ÷íý»ÿùñúóÿä³ñÂÂÛÏÀÆØÆÌÎÊÅÒÆÌæåÔÈñÁÑÑÈÞìÄÎÇÐÚÃØÃÆÒÓÒÖÖÜ­º·þ¶ÆÅÄËÊÉÈ ¦IJ{g^n~~gq:!oirdvr|9|vhNfayq9;8\t\u0015,\u001c\f\f\u0015\u0003HS=\u001b\u0002DZI\u001c\n\u0000\u0018\u000bO\t\u0012B\u0017\u000b\nF\u000b77={tc~kp3+'1&y}~OSjZJJSE\u000e\u0015{]D\u0002\u001c\u000fZLF^M\tOT\u0004QML\u0000Mqq{=2%8!6umaw`9?§¤°ÔÏ­ÖÝ¥¹°  ¹¯äÿ·¬º¨¬¢ç¬¤¬¤¸¥î©§»ê©ÙìïÞÂûËÛÛÂÔêÌ×ÁÓ×ÙÍÛÕÍÒÓÛÁÓßàâ£MNcZjzzcu>%G{pd}k<SOWT7BAplUeuulz1*Dbyo}yw2yqyqmp;|rn?Ptlo\fwtEY`P@@YO\u0004\u001fqWLZHLB\u0007LDLDXE\u000eIG[\nd]Q8IJ{g^n~~gq:!`fmi8mq?l|``u1FvffOdaméêÛÇþÎÞÞÇÑÀÆÍÉßßÍÑÌÜÀÀÕæÖÆÆïÄÁÍ®§øâí£íàèþ¤ÊÓß¸éÿíèî»¸¤­½½¤²ùâª±§µ±¿ú±¹±¹¥¸ó´º¦÷¤¸¸Ï§»²¢¢»­æýµ®¸ª® å¶¢§á¨ ¾í¢¥¬ØPSb~Uc|xk\"?pr<nmse'ciafog|/zb,C]A\u001e #\u0012\u000e%\u0013\f\b\u000f\u000f\u001bRO\u000b\u0015\u001c\u0016\u0011\u0005P$\u0013\u0004\u0001\u001e\u0014\u001a\u001d_\n\u001c\u001bc6.`\"(!{xIU~HWSTT@\t\u0014PNGMJ^\u000bHZ\u000fT@E\u0003PJ\u0006Bv}>=\f\u0010;\r\u0012\u0016\u0011\u0011\u0005LQ\u0019\u001d\u0004\f\u0000\u0006\nI\u0018\u0019\u0003\u000b\u0010\u0006\u0004\r\u0005C\u0011).60>x|¦º§¸¼»»¯æû³·®¦ª¬ ãï½¹¾¢¤®èÕ", 494, 19, 81));
        }
    }
}
