package nts;

import java.net.Socket;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Vector;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.slf4j.Marker;

/* renamed from: nts.ဓ  reason: contains not printable characters */
public class C3766 extends C3988 {

    /* renamed from: м  reason: contains not printable characters */
    public X509TrustManager[] f1225;

    /* renamed from: ᕡ  reason: contains not printable characters */
    public KeyManager[] f1226;

    /* renamed from: ⶈ  reason: contains not printable characters */
    public SSLContext f1227;

    /* renamed from: nts.ဓ$ગ  reason: contains not printable characters */
    public class C3767 implements X509TrustManager {

        /* renamed from: ഇ  reason: contains not printable characters */
        public X509TrustManager f1229;

        public C3767(X509TrustManager x509TrustManager) {
            this.f1229 = x509TrustManager;
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            m1216(x509CertificateArr, str, false);
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            m1216(x509CertificateArr, str, true);
        }

        public X509Certificate[] getAcceptedIssuers() {
            return this.f1229.getAcceptedIssuers();
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public final void m1216(X509Certificate[] x509CertificateArr, String str, boolean z10) {
            String str2;
            CertificateException e10;
            String str3;
            String str4;
            String str5;
            CertificateException certificateException;
            CertificateException certificateException2;
            X509Certificate[] x509CertificateArr2 = x509CertificateArr;
            String str6 = str;
            if (z10) {
                try {
                    this.f1229.checkServerTrusted(x509CertificateArr2, str6);
                } catch (CertificateException e11) {
                    e10 = e11;
                    str2 = C3727.m1052("\u000189!v%1 )26>~+48b32$0.+09k\u001b\u001a\u0002\u001c)>\u0001\u001a\u001f\u001fZW\u0000\u001d\u001f[\b\u000b\u001b\t\u0015\u0012\u0017\u0010@\u0012\u0003\u0014\u0017\f\u0005\u0005H\u0000\u001dO\u0005\u0003dr|xrg^_G\u0010CWFOTPX\u0018MR^\u0004UTBVHMV_\r}|dzOXg|yy<1f{y=nm}ostqv&terqjcc.f{)ld\u0006UTÌ×ÛßÆÀÃÕÙÂÇÎÙÚÁÀÀÅÐÇÏÕëëáùþéØåë¯úìûþí÷ãã ÇËÓÏ½ÍÌÔ¹êéûãÿóõã²´îîäüûìÇÊÓËÄÌÌÈÜÚßÕÎÚÑìììêùáúÈÈÎÀÞÜº®«¹¥¡©áå·¨¥²½¯ô&1$%8?=\u001a2/+\u000e6*/\u0019$'/#\u0012\u0016\u0014C\u0014^@\u0011\u001eI\u0003\u001dL\u0002$/+%%b7#m/+,i9.'&?8>q12?5;ex\u00175{\u0002\f\u0003\u000b\u0004A\u0011\u0006\u001f\u001e\u0007\u0000\u0006!\u0005\u0018\u0000%\u0019\u0005\u00042\u0013\u0010\u0014\u0018^\u0016\u0016Y)(HVctshmmOb`{mq~3\u0015\u001e\u001a\u0014\u0014S\u0006\u0012\\\u001e\u001a\u001dX\b\u001f\u0016\u0017\u000e\t\u000f@\u0000\u0003\u000e\u0004\nTIø°©û²²ªÿ£¤¢£»§¢²¬é£¥ì¹¦ªà¢·±¶ ¨³Ø³¨¾Ò½³÷£¡·°µ»·º¼ùå°¢²²«¬¢¾î®º¬ê¥ÖØÛÀÈýçùùýôüç²\u0002($&/+/'o<(=>/:<22u$!=%?<11/{\u0001^T@VH\u001f\\VH\u0013MLT\u0017ihhvIDKDVmn|Z]C\\lpbmdrbvv<6\"4*}>4*q/.6u\u000b\n\n\u0017%7#.%5+=?#4&\u0012$%:>;8.233\u000e-/5- +)5w}ia6ua:de}>@AA_`mbmÍÚÈîé÷èØÄÖÙÐÆÖÂÂ¾½¡»è¤¤å·¢²áüº¦­½µ©¼»¹ìñ££¥¶®µììæþùîÔ×ÅôÒÐÔÁ×Î¼¿­ª®­³¡¦´´ª¸¨¥ªº¨¾°®­¿¿£»¡¢¯¯±¥¼ ÄÚÄ\";'UC]CQ\u0017\f\\\u0013\u0015\u000fX\n\u0013\u0017\u0014\n\u0010\u0017\u0005\u0005N\u0018\u0005\u0019\u0002K\u001c\u00013w$93'6>,2|\u000e\t\u0017x)4(2,&&2af\r\u000f\u0007\u0019\u0018\riUXAYV\u0013^^J\u001f^X\u001aWWXBB@\f\fxX@\u0015[^@][RYSN^\\\u0019_BP\u000b$\u0004\u001cI\u0007\u0002\u001c\u0001\u0007\u000e\u0005\u000f\u0012\u0002\u0000E\u0003\u001e\fW\u0019>*-795>3'5q?$t!8>;=++l/;c4)#g7<\t\u000f\u001d\u0014§³´® ¬§ª¾¬è¦½í¢¼¦ñ¤¥£¦ ¾¾ùº¦þ©´ÂËÓÐÖñåâøöúñüèú¾ðë»î÷ñôòää£àô¬ûæì¨þùÐÆ¡¬¿½Å¨º¥ÆÀ®µÑ\b\u0005\u0016\u0014l\u0001\u0013\fo-%)(!i.6?917|\u0000'34. ,'*>,h&=m8!'\"$22u6\"z-0:~<8\u0007\u000b\u0015\t\b\b\u0004\bK\u001e\u001b\u001d\u001c\u001a\b\bS\u0011\u0014\u0002\u0003\u001f\u0013\u001d\u0018\u001b\r\u001d\fP.\u000eB\u0000\u0001\u0017\u0012\u000e\u000e\u0000\t\n\u0018\bN\f\u0018\u0010\u001b\u001dT\u0016\u0017\u0019X\u001b\u001f[\u001e\b\u0017\u00134a5*0-f3 ,j*()';9><28u\"%-*.>8}=:RUKEMFGSMZ\u0004º®«¿©ø·¹£ô¡ ¦£¥««ì¯³ë¼¡£ç±¶§±", 931, 50, 82) + e10.getMessage() + "\"";
                }
            } else {
                this.f1229.checkClientTrusted(x509CertificateArr2, str6);
            }
            str2 = C3727.m1052("\u000189!v%1 )26>~+48b32$0.+09k\u001b\u001a\u0002\u001c)>\u0001\u001a\u001f\u001fZW\u0000\u001d\u001f[\b\u000b\u001b\t\u0015\u0012\u0017\u0010@\u0012\u0003\u0014\u0017\f\u0005\u0005H\u0000\u001dO\u0005\u0003dr|xrg^_G\u0010CWFOTPX\u0018MR^\u0004UTBVHMV_\r}|dzOXg|yy<1f{y=nm}ostqv&terqjcc.f{)ld\u0006UTÌ×ÛßÆÀÃÕÙÂÇÎÙÚÁÀÀÅÐÇÏÕëëáùþéØåë¯úìûþí÷ãã ÇËÓÏ½ÍÌÔ¹êéûãÿóõã²´îîäüûìÇÊÓËÄÌÌÈÜÚßÕÎÚÑìììêùáúÈÈÎÀÞÜº®«¹¥¡©áå·¨¥²½¯ô&1$%8?=\u001a2/+\u000e6*/\u0019$'/#\u0012\u0016\u0014C\u0014^@\u0011\u001eI\u0003\u001dL\u0002$/+%%b7#m/+,i9.'&?8>q12?5;ex\u00175{\u0002\f\u0003\u000b\u0004A\u0011\u0006\u001f\u001e\u0007\u0000\u0006!\u0005\u0018\u0000%\u0019\u0005\u00042\u0013\u0010\u0014\u0018^\u0016\u0016Y)(HVctshmmOb`{mq~3\u0015\u001e\u001a\u0014\u0014S\u0006\u0012\\\u001e\u001a\u001dX\b\u001f\u0016\u0017\u000e\t\u000f@\u0000\u0003\u000e\u0004\nTIø°©û²²ªÿ£¤¢£»§¢²¬é£¥ì¹¦ªà¢·±¶ ¨³Ø³¨¾Ò½³÷£¡·°µ»·º¼ùå°¢²²«¬¢¾î®º¬ê¥ÖØÛÀÈýçùùýôüç²\u0002($&/+/'o<(=>/:<22u$!=%?<11/{\u0001^T@VH\u001f\\VH\u0013MLT\u0017ihhvIDKDVmn|Z]C\\lpbmdrbvv<6\"4*}>4*q/.6u\u000b\n\n\u0017%7#.%5+=?#4&\u0012$%:>;8.233\u000e-/5- +)5w}ia6ua:de}>@AA_`mbmÍÚÈîé÷èØÄÖÙÐÆÖÂÂ¾½¡»è¤¤å·¢²áüº¦­½µ©¼»¹ìñ££¥¶®µììæþùîÔ×ÅôÒÐÔÁ×Î¼¿­ª®­³¡¦´´ª¸¨¥ªº¨¾°®­¿¿£»¡¢¯¯±¥¼ ÄÚÄ\";'UC]CQ\u0017\f\\\u0013\u0015\u000fX\n\u0013\u0017\u0014\n\u0010\u0017\u0005\u0005N\u0018\u0005\u0019\u0002K\u001c\u00013w$93'6>,2|\u000e\t\u0017x)4(2,&&2af\r\u000f\u0007\u0019\u0018\riUXAYV\u0013^^J\u001f^X\u001aWWXBB@\f\fxX@\u0015[^@][RYSN^\\\u0019_BP\u000b$\u0004\u001cI\u0007\u0002\u001c\u0001\u0007\u000e\u0005\u000f\u0012\u0002\u0000E\u0003\u001e\fW\u0019>*-795>3'5q?$t!8>;=++l/;c4)#g7<\t\u000f\u001d\u0014§³´® ¬§ª¾¬è¦½í¢¼¦ñ¤¥£¦ ¾¾ùº¦þ©´ÂËÓÐÖñåâøöúñüèú¾ðë»î÷ñôòää£àô¬ûæì¨þùÐÆ¡¬¿½Å¨º¥ÆÀ®µÑ\b\u0005\u0016\u0014l\u0001\u0013\fo-%)(!i.6?917|\u0000'34. ,'*>,h&=m8!'\"$22u6\"z-0:~<8\u0007\u000b\u0015\t\b\b\u0004\bK\u001e\u001b\u001d\u001c\u001a\b\bS\u0011\u0014\u0002\u0003\u001f\u0013\u001d\u0018\u001b\r\u001d\fP.\u000eB\u0000\u0001\u0017\u0012\u000e\u000e\u0000\t\n\u0018\bN\f\u0018\u0010\u001b\u001dT\u0016\u0017\u0019X\u001b\u001f[\u001e\b\u0017\u00134a5*0-f3 ,j*()';9><28u\"%-*.>8}=:RUKEMFGSMZ\u0004º®«¿©ø·¹£ô¡ ¦£¥««ì¯³ë¼¡£ç±¶§±", 895, 36, 1);
            e10 = null;
            String str7 = "";
            if (x509CertificateArr2 == null || x509CertificateArr2.length <= 0) {
                str3 = str2;
                str5 = str7;
                str4 = str5;
            } else {
                X509Certificate x509Certificate = x509CertificateArr2[0];
                String r11 = C3766.this.m2401(x509Certificate);
                String name = x509Certificate.getSubjectDN().getName();
                String principal = x509Certificate.getIssuerDN().toString();
                if (z10 && e10 != null && x509Certificate.equals(C3766.this.f2614)) {
                    str2 = C3727.m1052("\u000189!v%1 )26>~+48b32$0.+09k\u001b\u001a\u0002\u001c)>\u0001\u001a\u001f\u001fZW\u0000\u001d\u001f[\b\u000b\u001b\t\u0015\u0012\u0017\u0010@\u0012\u0003\u0014\u0017\f\u0005\u0005H\u0000\u001dO\u0005\u0003dr|xrg^_G\u0010CWFOTPX\u0018MR^\u0004UTBVHMV_\r}|dzOXg|yy<1f{y=nm}ostqv&terqjcc.f{)ld\u0006UTÌ×ÛßÆÀÃÕÙÂÇÎÙÚÁÀÀÅÐÇÏÕëëáùþéØåë¯úìûþí÷ãã ÇËÓÏ½ÍÌÔ¹êéûãÿóõã²´îîäüûìÇÊÓËÄÌÌÈÜÚßÕÎÚÑìììêùáúÈÈÎÀÞÜº®«¹¥¡©áå·¨¥²½¯ô&1$%8?=\u001a2/+\u000e6*/\u0019$'/#\u0012\u0016\u0014C\u0014^@\u0011\u001eI\u0003\u001dL\u0002$/+%%b7#m/+,i9.'&?8>q12?5;ex\u00175{\u0002\f\u0003\u000b\u0004A\u0011\u0006\u001f\u001e\u0007\u0000\u0006!\u0005\u0018\u0000%\u0019\u0005\u00042\u0013\u0010\u0014\u0018^\u0016\u0016Y)(HVctshmmOb`{mq~3\u0015\u001e\u001a\u0014\u0014S\u0006\u0012\\\u001e\u001a\u001dX\b\u001f\u0016\u0017\u000e\t\u000f@\u0000\u0003\u000e\u0004\nTIø°©û²²ªÿ£¤¢£»§¢²¬é£¥ì¹¦ªà¢·±¶ ¨³Ø³¨¾Ò½³÷£¡·°µ»·º¼ùå°¢²²«¬¢¾î®º¬ê¥ÖØÛÀÈýçùùýôüç²\u0002($&/+/'o<(=>/:<22u$!=%?<11/{\u0001^T@VH\u001f\\VH\u0013MLT\u0017ihhvIDKDVmn|Z]C\\lpbmdrbvv<6\"4*}>4*q/.6u\u000b\n\n\u0017%7#.%5+=?#4&\u0012$%:>;8.233\u000e-/5- +)5w}ia6ua:de}>@AA_`mbmÍÚÈîé÷èØÄÖÙÐÆÖÂÂ¾½¡»è¤¤å·¢²áüº¦­½µ©¼»¹ìñ££¥¶®µììæþùîÔ×ÅôÒÐÔÁ×Î¼¿­ª®­³¡¦´´ª¸¨¥ªº¨¾°®­¿¿£»¡¢¯¯±¥¼ ÄÚÄ\";'UC]CQ\u0017\f\\\u0013\u0015\u000fX\n\u0013\u0017\u0014\n\u0010\u0017\u0005\u0005N\u0018\u0005\u0019\u0002K\u001c\u00013w$93'6>,2|\u000e\t\u0017x)4(2,&&2af\r\u000f\u0007\u0019\u0018\riUXAYV\u0013^^J\u001f^X\u001aWWXBB@\f\fxX@\u0015[^@][RYSN^\\\u0019_BP\u000b$\u0004\u001cI\u0007\u0002\u001c\u0001\u0007\u000e\u0005\u000f\u0012\u0002\u0000E\u0003\u001e\fW\u0019>*-795>3'5q?$t!8>;=++l/;c4)#g7<\t\u000f\u001d\u0014§³´® ¬§ª¾¬è¦½í¢¼¦ñ¤¥£¦ ¾¾ùº¦þ©´ÂËÓÐÖñåâøöúñüèú¾ðë»î÷ñôòää£àô¬ûæì¨þùÐÆ¡¬¿½Å¨º¥ÆÀ®µÑ\b\u0005\u0016\u0014l\u0001\u0013\fo-%)(!i.6?917|\u0000'34. ,'*>,h&=m8!'\"$22u6\"z-0:~<8\u0007\u000b\u0015\t\b\b\u0004\bK\u001e\u001b\u001d\u001c\u001a\b\bS\u0011\u0014\u0002\u0003\u001f\u0013\u001d\u0018\u001b\r\u001d\fP.\u000eB\u0000\u0001\u0017\u0012\u000e\u000e\u0000\t\n\u0018\bN\f\u0018\u0010\u001b\u001dT\u0016\u0017\u0019X\u001b\u001f[\u001e\b\u0017\u00134a5*0-f3 ,j*()';9><28u\"%-*.>8}=:RUKEMFGSMZ\u0004º®«¿©ø·¹£ô¡ ¦£¥««ì¯³ë¼¡£ç±¶§±", 981, 34, 98);
                    e10 = null;
                }
                C3763 r15 = C3766.this.f2620;
                if (r15.f1218 > 0 || r15.f1217 > 0) {
                    int r26 = r15.m1209();
                    Vector vector = new Vector();
                    for (X509Certificate r152 : x509CertificateArr2) {
                        vector.add(C3766.this.m2401(r152));
                    }
                    if (C4016.m2527(new C3971(7, r11, str7, Marker.ANY_MARKER), vector, "", "", "", 0, "", "", new String[1], new String[1], r26, true, "") == 0) {
                        str2 = C3727.m1052("\u000189!v%1 )26>~+48b32$0.+09k\u001b\u001a\u0002\u001c)>\u0001\u001a\u001f\u001fZW\u0000\u001d\u001f[\b\u000b\u001b\t\u0015\u0012\u0017\u0010@\u0012\u0003\u0014\u0017\f\u0005\u0005H\u0000\u001dO\u0005\u0003dr|xrg^_G\u0010CWFOTPX\u0018MR^\u0004UTBVHMV_\r}|dzOXg|yy<1f{y=nm}ostqv&terqjcc.f{)ld\u0006UTÌ×ÛßÆÀÃÕÙÂÇÎÙÚÁÀÀÅÐÇÏÕëëáùþéØåë¯úìûþí÷ãã ÇËÓÏ½ÍÌÔ¹êéûãÿóõã²´îîäüûìÇÊÓËÄÌÌÈÜÚßÕÎÚÑìììêùáúÈÈÎÀÞÜº®«¹¥¡©áå·¨¥²½¯ô&1$%8?=\u001a2/+\u000e6*/\u0019$'/#\u0012\u0016\u0014C\u0014^@\u0011\u001eI\u0003\u001dL\u0002$/+%%b7#m/+,i9.'&?8>q12?5;ex\u00175{\u0002\f\u0003\u000b\u0004A\u0011\u0006\u001f\u001e\u0007\u0000\u0006!\u0005\u0018\u0000%\u0019\u0005\u00042\u0013\u0010\u0014\u0018^\u0016\u0016Y)(HVctshmmOb`{mq~3\u0015\u001e\u001a\u0014\u0014S\u0006\u0012\\\u001e\u001a\u001dX\b\u001f\u0016\u0017\u000e\t\u000f@\u0000\u0003\u000e\u0004\nTIø°©û²²ªÿ£¤¢£»§¢²¬é£¥ì¹¦ªà¢·±¶ ¨³Ø³¨¾Ò½³÷£¡·°µ»·º¼ùå°¢²²«¬¢¾î®º¬ê¥ÖØÛÀÈýçùùýôüç²\u0002($&/+/'o<(=>/:<22u$!=%?<11/{\u0001^T@VH\u001f\\VH\u0013MLT\u0017ihhvIDKDVmn|Z]C\\lpbmdrbvv<6\"4*}>4*q/.6u\u000b\n\n\u0017%7#.%5+=?#4&\u0012$%:>;8.233\u000e-/5- +)5w}ia6ua:de}>@AA_`mbmÍÚÈîé÷èØÄÖÙÐÆÖÂÂ¾½¡»è¤¤å·¢²áüº¦­½µ©¼»¹ìñ££¥¶®µììæþùîÔ×ÅôÒÐÔÁ×Î¼¿­ª®­³¡¦´´ª¸¨¥ªº¨¾°®­¿¿£»¡¢¯¯±¥¼ ÄÚÄ\";'UC]CQ\u0017\f\\\u0013\u0015\u000fX\n\u0013\u0017\u0014\n\u0010\u0017\u0005\u0005N\u0018\u0005\u0019\u0002K\u001c\u00013w$93'6>,2|\u000e\t\u0017x)4(2,&&2af\r\u000f\u0007\u0019\u0018\riUXAYV\u0013^^J\u001f^X\u001aWWXBB@\f\fxX@\u0015[^@][RYSN^\\\u0019_BP\u000b$\u0004\u001cI\u0007\u0002\u001c\u0001\u0007\u000e\u0005\u000f\u0012\u0002\u0000E\u0003\u001e\fW\u0019>*-795>3'5q?$t!8>;=++l/;c4)#g7<\t\u000f\u001d\u0014§³´® ¬§ª¾¬è¦½í¢¼¦ñ¤¥£¦ ¾¾ùº¦þ©´ÂËÓÐÖñåâøöúñüèú¾ðë»î÷ñôòää£àô¬ûæì¨þùÐÆ¡¬¿½Å¨º¥ÆÀ®µÑ\b\u0005\u0016\u0014l\u0001\u0013\fo-%)(!i.6?917|\u0000'34. ,'*>,h&=m8!'\"$22u6\"z-0:~<8\u0007\u000b\u0015\t\b\b\u0004\bK\u001e\u001b\u001d\u001c\u001a\b\bS\u0011\u0014\u0002\u0003\u001f\u0013\u001d\u0018\u001b\r\u001d\fP.\u000eB\u0000\u0001\u0017\u0012\u000e\u000e\u0000\t\n\u0018\bN\f\u0018\u0010\u001b\u001dT\u0016\u0017\u0019X\u001b\u001f[\u001e\b\u0017\u00134a5*0-f3 ,j*()';9><28u\"%-*.>8}=:RUKEMFGSMZ\u0004º®«¿©ø·¹£ô¡ ¦£¥««ì¯³ë¼¡£ç±¶§±", 1015, 18, 11);
                        e10 = null;
                    } else {
                        str2 = C3727.m1052("\u000189!v%1 )26>~+48b32$0.+09k\u001b\u001a\u0002\u001c)>\u0001\u001a\u001f\u001fZW\u0000\u001d\u001f[\b\u000b\u001b\t\u0015\u0012\u0017\u0010@\u0012\u0003\u0014\u0017\f\u0005\u0005H\u0000\u001dO\u0005\u0003dr|xrg^_G\u0010CWFOTPX\u0018MR^\u0004UTBVHMV_\r}|dzOXg|yy<1f{y=nm}ostqv&terqjcc.f{)ld\u0006UTÌ×ÛßÆÀÃÕÙÂÇÎÙÚÁÀÀÅÐÇÏÕëëáùþéØåë¯úìûþí÷ãã ÇËÓÏ½ÍÌÔ¹êéûãÿóõã²´îîäüûìÇÊÓËÄÌÌÈÜÚßÕÎÚÑìììêùáúÈÈÎÀÞÜº®«¹¥¡©áå·¨¥²½¯ô&1$%8?=\u001a2/+\u000e6*/\u0019$'/#\u0012\u0016\u0014C\u0014^@\u0011\u001eI\u0003\u001dL\u0002$/+%%b7#m/+,i9.'&?8>q12?5;ex\u00175{\u0002\f\u0003\u000b\u0004A\u0011\u0006\u001f\u001e\u0007\u0000\u0006!\u0005\u0018\u0000%\u0019\u0005\u00042\u0013\u0010\u0014\u0018^\u0016\u0016Y)(HVctshmmOb`{mq~3\u0015\u001e\u001a\u0014\u0014S\u0006\u0012\\\u001e\u001a\u001dX\b\u001f\u0016\u0017\u000e\t\u000f@\u0000\u0003\u000e\u0004\nTIø°©û²²ªÿ£¤¢£»§¢²¬é£¥ì¹¦ªà¢·±¶ ¨³Ø³¨¾Ò½³÷£¡·°µ»·º¼ùå°¢²²«¬¢¾î®º¬ê¥ÖØÛÀÈýçùùýôüç²\u0002($&/+/'o<(=>/:<22u$!=%?<11/{\u0001^T@VH\u001f\\VH\u0013MLT\u0017ihhvIDKDVmn|Z]C\\lpbmdrbvv<6\"4*}>4*q/.6u\u000b\n\n\u0017%7#.%5+=?#4&\u0012$%:>;8.233\u000e-/5- +)5w}ia6ua:de}>@AA_`mbmÍÚÈîé÷èØÄÖÙÐÆÖÂÂ¾½¡»è¤¤å·¢²áüº¦­½µ©¼»¹ìñ££¥¶®µììæþùîÔ×ÅôÒÐÔÁ×Î¼¿­ª®­³¡¦´´ª¸¨¥ªº¨¾°®­¿¿£»¡¢¯¯±¥¼ ÄÚÄ\";'UC]CQ\u0017\f\\\u0013\u0015\u000fX\n\u0013\u0017\u0014\n\u0010\u0017\u0005\u0005N\u0018\u0005\u0019\u0002K\u001c\u00013w$93'6>,2|\u000e\t\u0017x)4(2,&&2af\r\u000f\u0007\u0019\u0018\riUXAYV\u0013^^J\u001f^X\u001aWWXBB@\f\fxX@\u0015[^@][RYSN^\\\u0019_BP\u000b$\u0004\u001cI\u0007\u0002\u001c\u0001\u0007\u000e\u0005\u000f\u0012\u0002\u0000E\u0003\u001e\fW\u0019>*-795>3'5q?$t!8>;=++l/;c4)#g7<\t\u000f\u001d\u0014§³´® ¬§ª¾¬è¦½í¢¼¦ñ¤¥£¦ ¾¾ùº¦þ©´ÂËÓÐÖñåâøöúñüèú¾ðë»î÷ñôòää£àô¬ûæì¨þùÐÆ¡¬¿½Å¨º¥ÆÀ®µÑ\b\u0005\u0016\u0014l\u0001\u0013\fo-%)(!i.6?917|\u0000'34. ,'*>,h&=m8!'\"$22u6\"z-0:~<8\u0007\u000b\u0015\t\b\b\u0004\bK\u001e\u001b\u001d\u001c\u001a\b\bS\u0011\u0014\u0002\u0003\u001f\u0013\u001d\u0018\u001b\r\u001d\fP.\u000eB\u0000\u0001\u0017\u0012\u000e\u000e\u0000\t\n\u0018\bN\f\u0018\u0010\u001b\u001dT\u0016\u0017\u0019X\u001b\u001f[\u001e\b\u0017\u00134a5*0-f3 ,j*()';9><28u\"%-*.>8}=:RUKEMFGSMZ\u0004º®«¿©ø·¹£ô¡ ¦£¥««ì¯³ë¼¡£ç±¶§±", 1033, 22, 88);
                        e10 = new CertificateException(str2);
                    }
                }
                if (!z10 || e10 == null || C3823.m1590(C3766.this.f2621)) {
                    certificateException = e10;
                } else {
                    Vector vector2 = new Vector();
                    for (int i10 = 1; i10 < x509CertificateArr2.length; i10++) {
                        vector2.add(C3766.this.m2401(x509Certificate));
                    }
                    if (C4016.m2527(new C3971(7, r11, str7, Marker.ANY_MARKER), vector2, C3766.this.f2621, "", "", 0, "", "", new String[1], new String[1], 0, true, "") == 0) {
                        str2 = C3727.m1052("\u000189!v%1 )26>~+48b32$0.+09k\u001b\u001a\u0002\u001c)>\u0001\u001a\u001f\u001fZW\u0000\u001d\u001f[\b\u000b\u001b\t\u0015\u0012\u0017\u0010@\u0012\u0003\u0014\u0017\f\u0005\u0005H\u0000\u001dO\u0005\u0003dr|xrg^_G\u0010CWFOTPX\u0018MR^\u0004UTBVHMV_\r}|dzOXg|yy<1f{y=nm}ostqv&terqjcc.f{)ld\u0006UTÌ×ÛßÆÀÃÕÙÂÇÎÙÚÁÀÀÅÐÇÏÕëëáùþéØåë¯úìûþí÷ãã ÇËÓÏ½ÍÌÔ¹êéûãÿóõã²´îîäüûìÇÊÓËÄÌÌÈÜÚßÕÎÚÑìììêùáúÈÈÎÀÞÜº®«¹¥¡©áå·¨¥²½¯ô&1$%8?=\u001a2/+\u000e6*/\u0019$'/#\u0012\u0016\u0014C\u0014^@\u0011\u001eI\u0003\u001dL\u0002$/+%%b7#m/+,i9.'&?8>q12?5;ex\u00175{\u0002\f\u0003\u000b\u0004A\u0011\u0006\u001f\u001e\u0007\u0000\u0006!\u0005\u0018\u0000%\u0019\u0005\u00042\u0013\u0010\u0014\u0018^\u0016\u0016Y)(HVctshmmOb`{mq~3\u0015\u001e\u001a\u0014\u0014S\u0006\u0012\\\u001e\u001a\u001dX\b\u001f\u0016\u0017\u000e\t\u000f@\u0000\u0003\u000e\u0004\nTIø°©û²²ªÿ£¤¢£»§¢²¬é£¥ì¹¦ªà¢·±¶ ¨³Ø³¨¾Ò½³÷£¡·°µ»·º¼ùå°¢²²«¬¢¾î®º¬ê¥ÖØÛÀÈýçùùýôüç²\u0002($&/+/'o<(=>/:<22u$!=%?<11/{\u0001^T@VH\u001f\\VH\u0013MLT\u0017ihhvIDKDVmn|Z]C\\lpbmdrbvv<6\"4*}>4*q/.6u\u000b\n\n\u0017%7#.%5+=?#4&\u0012$%:>;8.233\u000e-/5- +)5w}ia6ua:de}>@AA_`mbmÍÚÈîé÷èØÄÖÙÐÆÖÂÂ¾½¡»è¤¤å·¢²áüº¦­½µ©¼»¹ìñ££¥¶®µììæþùîÔ×ÅôÒÐÔÁ×Î¼¿­ª®­³¡¦´´ª¸¨¥ªº¨¾°®­¿¿£»¡¢¯¯±¥¼ ÄÚÄ\";'UC]CQ\u0017\f\\\u0013\u0015\u000fX\n\u0013\u0017\u0014\n\u0010\u0017\u0005\u0005N\u0018\u0005\u0019\u0002K\u001c\u00013w$93'6>,2|\u000e\t\u0017x)4(2,&&2af\r\u000f\u0007\u0019\u0018\riUXAYV\u0013^^J\u001f^X\u001aWWXBB@\f\fxX@\u0015[^@][RYSN^\\\u0019_BP\u000b$\u0004\u001cI\u0007\u0002\u001c\u0001\u0007\u000e\u0005\u000f\u0012\u0002\u0000E\u0003\u001e\fW\u0019>*-795>3'5q?$t!8>;=++l/;c4)#g7<\t\u000f\u001d\u0014§³´® ¬§ª¾¬è¦½í¢¼¦ñ¤¥£¦ ¾¾ùº¦þ©´ÂËÓÐÖñåâøöúñüèú¾ðë»î÷ñôòää£àô¬ûæì¨þùÐÆ¡¬¿½Å¨º¥ÆÀ®µÑ\b\u0005\u0016\u0014l\u0001\u0013\fo-%)(!i.6?917|\u0000'34. ,'*>,h&=m8!'\"$22u6\"z-0:~<8\u0007\u000b\u0015\t\b\b\u0004\bK\u001e\u001b\u001d\u001c\u001a\b\bS\u0011\u0014\u0002\u0003\u001f\u0013\u001d\u0018\u001b\r\u001d\fP.\u000eB\u0000\u0001\u0017\u0012\u000e\u000e\u0000\t\n\u0018\bN\f\u0018\u0010\u001b\u001dT\u0016\u0017\u0019X\u001b\u001f[\u001e\b\u0017\u00134a5*0-f3 ,j*()';9><28u\"%-*.>8}=:RUKEMFGSMZ\u0004º®«¿©ø·¹£ô¡ ¦£¥««ì¯³ë¼¡£ç±¶§±", 1055, 62, 98);
                        certificateException = null;
                    } else {
                        certificateException = e10;
                        str2 = C3727.m1052("\u000189!v%1 )26>~+48b32$0.+09k\u001b\u001a\u0002\u001c)>\u0001\u001a\u001f\u001fZW\u0000\u001d\u001f[\b\u000b\u001b\t\u0015\u0012\u0017\u0010@\u0012\u0003\u0014\u0017\f\u0005\u0005H\u0000\u001dO\u0005\u0003dr|xrg^_G\u0010CWFOTPX\u0018MR^\u0004UTBVHMV_\r}|dzOXg|yy<1f{y=nm}ostqv&terqjcc.f{)ld\u0006UTÌ×ÛßÆÀÃÕÙÂÇÎÙÚÁÀÀÅÐÇÏÕëëáùþéØåë¯úìûþí÷ãã ÇËÓÏ½ÍÌÔ¹êéûãÿóõã²´îîäüûìÇÊÓËÄÌÌÈÜÚßÕÎÚÑìììêùáúÈÈÎÀÞÜº®«¹¥¡©áå·¨¥²½¯ô&1$%8?=\u001a2/+\u000e6*/\u0019$'/#\u0012\u0016\u0014C\u0014^@\u0011\u001eI\u0003\u001dL\u0002$/+%%b7#m/+,i9.'&?8>q12?5;ex\u00175{\u0002\f\u0003\u000b\u0004A\u0011\u0006\u001f\u001e\u0007\u0000\u0006!\u0005\u0018\u0000%\u0019\u0005\u00042\u0013\u0010\u0014\u0018^\u0016\u0016Y)(HVctshmmOb`{mq~3\u0015\u001e\u001a\u0014\u0014S\u0006\u0012\\\u001e\u001a\u001dX\b\u001f\u0016\u0017\u000e\t\u000f@\u0000\u0003\u000e\u0004\nTIø°©û²²ªÿ£¤¢£»§¢²¬é£¥ì¹¦ªà¢·±¶ ¨³Ø³¨¾Ò½³÷£¡·°µ»·º¼ùå°¢²²«¬¢¾î®º¬ê¥ÖØÛÀÈýçùùýôüç²\u0002($&/+/'o<(=>/:<22u$!=%?<11/{\u0001^T@VH\u001f\\VH\u0013MLT\u0017ihhvIDKDVmn|Z]C\\lpbmdrbvv<6\"4*}>4*q/.6u\u000b\n\n\u0017%7#.%5+=?#4&\u0012$%:>;8.233\u000e-/5- +)5w}ia6ua:de}>@AA_`mbmÍÚÈîé÷èØÄÖÙÐÆÖÂÂ¾½¡»è¤¤å·¢²áüº¦­½µ©¼»¹ìñ££¥¶®µììæþùîÔ×ÅôÒÐÔÁ×Î¼¿­ª®­³¡¦´´ª¸¨¥ªº¨¾°®­¿¿£»¡¢¯¯±¥¼ ÄÚÄ\";'UC]CQ\u0017\f\\\u0013\u0015\u000fX\n\u0013\u0017\u0014\n\u0010\u0017\u0005\u0005N\u0018\u0005\u0019\u0002K\u001c\u00013w$93'6>,2|\u000e\t\u0017x)4(2,&&2af\r\u000f\u0007\u0019\u0018\riUXAYV\u0013^^J\u001f^X\u001aWWXBB@\f\fxX@\u0015[^@][RYSN^\\\u0019_BP\u000b$\u0004\u001cI\u0007\u0002\u001c\u0001\u0007\u000e\u0005\u000f\u0012\u0002\u0000E\u0003\u001e\fW\u0019>*-795>3'5q?$t!8>;=++l/;c4)#g7<\t\u000f\u001d\u0014§³´® ¬§ª¾¬è¦½í¢¼¦ñ¤¥£¦ ¾¾ùº¦þ©´ÂËÓÐÖñåâøöúñüèú¾ðë»î÷ñôòää£àô¬ûæì¨þùÐÆ¡¬¿½Å¨º¥ÆÀ®µÑ\b\u0005\u0016\u0014l\u0001\u0013\fo-%)(!i.6?917|\u0000'34. ,'*>,h&=m8!'\"$22u6\"z-0:~<8\u0007\u000b\u0015\t\b\b\u0004\bK\u001e\u001b\u001d\u001c\u001a\b\bS\u0011\u0014\u0002\u0003\u001f\u0013\u001d\u0018\u001b\r\u001d\fP.\u000eB\u0000\u0001\u0017\u0012\u000e\u000e\u0000\t\n\u0018\bN\f\u0018\u0010\u001b\u001dT\u0016\u0017\u0019X\u001b\u001f[\u001e\b\u0017\u00134a5*0-f3 ,j*()';9><28u\"%-*.>8}=:RUKEMFGSMZ\u0004º®«¿©ø·¹£ô¡ ¦£¥««ì¯³ë¼¡£ç±¶§±", 1117, 75, 118);
                    }
                }
                C3856 r02 = C3766.this.f2624;
                if (r02 instanceof C4179) {
                    C4179 r03 = (C4179) r02;
                    if (r03.m378() ? r03.f3974 : r03.f3976) {
                        str7 = r11;
                        for (int i11 = 1; i11 < x509CertificateArr2.length; i11++) {
                            str7 = str7 + "\r\n" + C3766.this.m2401(x509CertificateArr2[i11]);
                        }
                        certificateException2 = certificateException;
                        str5 = name;
                        str4 = principal;
                        str3 = str2;
                    }
                }
                certificateException2 = certificateException;
                str7 = r11;
                str5 = name;
                str4 = principal;
                str3 = str2;
            }
            boolean[] zArr = {e10 == null};
            C3766 r22 = C3766.this;
            r22.f2616 = str6;
            if (z10) {
                byte[] r92 = C3823.m1620(str7);
                C3766.this.f2625 = new C3971(r92);
                ((C4111) C3766.this).f3531.m3580(r92, str5, str4, str3, zArr);
            } else {
                ((C4111) r22).f3531.m3580(C3823.m1620(str7), str5, str4, str3, zArr);
            }
            if (!zArr[0]) {
                if (e10 == null) {
                    e10 = new CertificateException(C3727.m1052("\u000189!v%1 )26>~+48b32$0.+09k\u001b\u001a\u0002\u001c)>\u0001\u001a\u001f\u001fZW\u0000\u001d\u001f[\b\u000b\u001b\t\u0015\u0012\u0017\u0010@\u0012\u0003\u0014\u0017\f\u0005\u0005H\u0000\u001dO\u0005\u0003dr|xrg^_G\u0010CWFOTPX\u0018MR^\u0004UTBVHMV_\r}|dzOXg|yy<1f{y=nm}ostqv&terqjcc.f{)ld\u0006UTÌ×ÛßÆÀÃÕÙÂÇÎÙÚÁÀÀÅÐÇÏÕëëáùþéØåë¯úìûþí÷ãã ÇËÓÏ½ÍÌÔ¹êéûãÿóõã²´îîäüûìÇÊÓËÄÌÌÈÜÚßÕÎÚÑìììêùáúÈÈÎÀÞÜº®«¹¥¡©áå·¨¥²½¯ô&1$%8?=\u001a2/+\u000e6*/\u0019$'/#\u0012\u0016\u0014C\u0014^@\u0011\u001eI\u0003\u001dL\u0002$/+%%b7#m/+,i9.'&?8>q12?5;ex\u00175{\u0002\f\u0003\u000b\u0004A\u0011\u0006\u001f\u001e\u0007\u0000\u0006!\u0005\u0018\u0000%\u0019\u0005\u00042\u0013\u0010\u0014\u0018^\u0016\u0016Y)(HVctshmmOb`{mq~3\u0015\u001e\u001a\u0014\u0014S\u0006\u0012\\\u001e\u001a\u001dX\b\u001f\u0016\u0017\u000e\t\u000f@\u0000\u0003\u000e\u0004\nTIø°©û²²ªÿ£¤¢£»§¢²¬é£¥ì¹¦ªà¢·±¶ ¨³Ø³¨¾Ò½³÷£¡·°µ»·º¼ùå°¢²²«¬¢¾î®º¬ê¥ÖØÛÀÈýçùùýôüç²\u0002($&/+/'o<(=>/:<22u$!=%?<11/{\u0001^T@VH\u001f\\VH\u0013MLT\u0017ihhvIDKDVmn|Z]C\\lpbmdrbvv<6\"4*}>4*q/.6u\u000b\n\n\u0017%7#.%5+=?#4&\u0012$%:>;8.233\u000e-/5- +)5w}ia6ua:de}>@AA_`mbmÍÚÈîé÷èØÄÖÙÐÆÖÂÂ¾½¡»è¤¤å·¢²áüº¦­½µ©¼»¹ìñ££¥¶®µììæþùîÔ×ÅôÒÐÔÁ×Î¼¿­ª®­³¡¦´´ª¸¨¥ªº¨¾°®­¿¿£»¡¢¯¯±¥¼ ÄÚÄ\";'UC]CQ\u0017\f\\\u0013\u0015\u000fX\n\u0013\u0017\u0014\n\u0010\u0017\u0005\u0005N\u0018\u0005\u0019\u0002K\u001c\u00013w$93'6>,2|\u000e\t\u0017x)4(2,&&2af\r\u000f\u0007\u0019\u0018\riUXAYV\u0013^^J\u001f^X\u001aWWXBB@\f\fxX@\u0015[^@][RYSN^\\\u0019_BP\u000b$\u0004\u001cI\u0007\u0002\u001c\u0001\u0007\u000e\u0005\u000f\u0012\u0002\u0000E\u0003\u001e\fW\u0019>*-795>3'5q?$t!8>;=++l/;c4)#g7<\t\u000f\u001d\u0014§³´® ¬§ª¾¬è¦½í¢¼¦ñ¤¥£¦ ¾¾ùº¦þ©´ÂËÓÐÖñåâøöúñüèú¾ðë»î÷ñôòää£àô¬ûæì¨þùÐÆ¡¬¿½Å¨º¥ÆÀ®µÑ\b\u0005\u0016\u0014l\u0001\u0013\fo-%)(!i.6?917|\u0000'34. ,'*>,h&=m8!'\"$22u6\"z-0:~<8\u0007\u000b\u0015\t\b\b\u0004\bK\u001e\u001b\u001d\u001c\u001a\b\bS\u0011\u0014\u0002\u0003\u001f\u0013\u001d\u0018\u001b\r\u001d\fP.\u000eB\u0000\u0001\u0017\u0012\u000e\u000e\u0000\t\n\u0018\bN\f\u0018\u0010\u001b\u001dT\u0016\u0017\u0019X\u001b\u001f[\u001e\b\u0017\u00134a5*0-f3 ,j*()';9><28u\"%-*.>8}=:RUKEMFGSMZ\u0004º®«¿©ø·¹£ô¡ ¦£¥««ì¯³ë¼¡£ç±¶§±", 1192, 30, 104));
                }
                throw e10;
            }
        }
    }

    /* renamed from: nts.ဓ$ഇ  reason: contains not printable characters */
    public class C3768 implements X509KeyManager {
        public C3768() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
            return r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String chooseClientAlias(java.lang.String[] r3, java.security.Principal[] r4, java.net.Socket r5) {
            /*
                r2 = this;
                nts.ဓ r4 = nts.C3766.this
                java.lang.Object r4 = r4.f375
                monitor-enter(r4)
                nts.ဓ r5 = nts.C3766.this     // Catch:{ all -> 0x0030 }
                nts.ឫ r5 = r5.f2623     // Catch:{ all -> 0x0030 }
                if (r5 == 0) goto L_0x0035
                java.lang.String r5 = r5.m2307()     // Catch:{ all -> 0x0030 }
                r0 = 0
            L_0x0010:
                int r1 = r3.length     // Catch:{ all -> 0x0030 }
                if (r0 >= r1) goto L_0x0035
                r1 = r3[r0]     // Catch:{ all -> 0x0030 }
                boolean r1 = r5.endsWith(r1)     // Catch:{ all -> 0x0030 }
                if (r1 == 0) goto L_0x0032
                nts.ဓ r3 = nts.C3766.this     // Catch:{ all -> 0x0030 }
                nts.ឫ r3 = r3.f2623     // Catch:{ all -> 0x0030 }
                nts.ӝ r5 = r3.f2423     // Catch:{ all -> 0x0030 }
                if (r5 != 0) goto L_0x0026
                java.lang.String r3 = ""
                goto L_0x002e
            L_0x0026:
                nts.ⶵ r3 = r3.f2419     // Catch:{ all -> 0x0030 }
                java.lang.String r3 = r3.f4009     // Catch:{ all -> 0x0030 }
                java.lang.String r3 = r5.m559(r3)     // Catch:{ all -> 0x0030 }
            L_0x002e:
                monitor-exit(r4)     // Catch:{ all -> 0x0030 }
                return r3
            L_0x0030:
                r3 = move-exception
                goto L_0x0038
            L_0x0032:
                int r0 = r0 + 1
                goto L_0x0010
            L_0x0035:
                monitor-exit(r4)     // Catch:{ all -> 0x0030 }
                r3 = 0
                return r3
            L_0x0038:
                monitor-exit(r4)     // Catch:{ all -> 0x0030 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: nts.C3766.C3768.chooseClientAlias(java.lang.String[], java.security.Principal[], java.net.Socket):java.lang.String");
        }

        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            String str2;
            synchronized (C3766.this.f375) {
                try {
                    C3971 r32 = C3766.this.f2623;
                    if (r32 == null || !r32.m2306().endsWith(str)) {
                        str2 = null;
                    } else {
                        C3971 r12 = C3766.this.f2623;
                        C3617 r33 = r12.f2423;
                        str2 = r33 == null ? "" : r33.m559(r12.f2419.f4009);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x001b A[Catch:{ Exception -> 0x0015 }] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A[Catch:{ Exception -> 0x0015 }] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0022 A[Catch:{ Exception -> 0x0015 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.security.cert.X509Certificate[] getCertificateChain(java.lang.String r6) {
            /*
                r5 = this;
                r6 = 0
                nts.ဓ r0 = nts.C3766.this     // Catch:{ Exception -> 0x0015 }
                nts.ឫ r0 = r0.f2623     // Catch:{ Exception -> 0x0015 }
                if (r0 == 0) goto L_0x0017
                nts.ӝ r1 = r0.f2423     // Catch:{ Exception -> 0x0015 }
                if (r1 != 0) goto L_0x000c
                goto L_0x0017
            L_0x000c:
                nts.ⶵ r0 = r0.f2419     // Catch:{ Exception -> 0x0015 }
                java.lang.String r0 = r0.f4009     // Catch:{ Exception -> 0x0015 }
                java.security.cert.Certificate[] r0 = r1.getCertificateChain(r0)     // Catch:{ Exception -> 0x0015 }
                goto L_0x0018
            L_0x0015:
                r0 = move-exception
                goto L_0x002d
            L_0x0017:
                r0 = r6
            L_0x0018:
                r1 = 0
                if (r0 == 0) goto L_0x001d
                int r2 = r0.length     // Catch:{ Exception -> 0x0015 }
                goto L_0x001e
            L_0x001d:
                r2 = r1
            L_0x001e:
                java.security.cert.X509Certificate[] r3 = new java.security.cert.X509Certificate[r2]     // Catch:{ Exception -> 0x0015 }
            L_0x0020:
                if (r1 >= r2) goto L_0x002b
                r4 = r0[r1]     // Catch:{ Exception -> 0x0015 }
                java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch:{ Exception -> 0x0015 }
                r3[r1] = r4     // Catch:{ Exception -> 0x0015 }
                int r1 = r1 + 1
                goto L_0x0020
            L_0x002b:
                r6 = r3
                goto L_0x003f
            L_0x002d:
                nts.ဓ r1 = nts.C3766.this
                nts.Ԕ r2 = new nts.Ԕ
                java.lang.String r3 = nts.C3625.m589(r0)
                int r4 = nts.C3625.m591(r0)
                r2.<init>(r0, r4, r3)
                r1.m369((java.lang.Exception) r2)
            L_0x003f:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nts.C3766.C3768.getCertificateChain(java.lang.String):java.security.cert.X509Certificate[]");
        }

        public String[] getClientAliases(String str, Principal[] principalArr) {
            return null;
        }

        public PrivateKey getPrivateKey(String str) {
            try {
                C3971 r02 = C3766.this.f2623;
                if (r02 != null) {
                    return r02.m2303();
                }
                return null;
            } catch (Exception e10) {
                C3766.this.m369((Exception) new C3625((Throwable) e10, C3625.m589(e10)));
                return null;
            }
        }

        public String[] getServerAliases(String str, Principal[] principalArr) {
            return null;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3766(nts.C3856 r1, java.lang.Object r2) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ Exception -> 0x000b }
            r0.f2611 = r1     // Catch:{ Exception -> 0x000b }
            r0.f2618 = r1     // Catch:{ Exception -> 0x000b }
        L_0x000b:
            java.lang.String r1 = r0.f2609     // Catch:{ Exception -> 0x0015 }
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch:{ Exception -> 0x0015 }
            r2 = 0
            r1.init(r2, r2, r2)     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3766.<init>(nts.Ꭰ, java.lang.Object):void");
    }

    /* renamed from: ᡥ  reason: contains not printable characters */
    public void m1214() {
        if (this.f2623 != null) {
            this.f1226 = new X509KeyManager[]{new C3768()};
            return;
        }
        this.f1226 = null;
    }

    /* renamed from: ᬥ  reason: contains not printable characters */
    public void m1215() {
        try {
            this.f1225 = null;
            TrustManagerFactory instance = this.f2615.length() == 0 ? TrustManagerFactory.getInstance(this.f2618) : TrustManagerFactory.getInstance(this.f2618, this.f2615);
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            this.f1225 = new X509TrustManager[trustManagers.length];
            for (int i10 = 0; i10 < trustManagers.length; i10++) {
                this.f1225[i10] = new C3767((X509TrustManager) trustManagers[i10]);
            }
        } catch (Exception e10) {
            throw new C3625((Throwable) e10, C3625.m589(e10));
        }
    }
}
