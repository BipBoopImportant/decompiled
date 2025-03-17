package nts;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Vector;

/* renamed from: nts.Ꭰ  reason: contains not printable characters */
public class C3856 extends C3596 {

    /* renamed from: ᗎ  reason: contains not printable characters */
    public static int f1642 = 0;

    /* renamed from: ᚪ  reason: contains not printable characters */
    public static boolean f1643 = true;

    /* renamed from: ᛃ  reason: contains not printable characters */
    public static String f1644;

    /* renamed from: ᡥ  reason: contains not printable characters */
    public static String f1645;

    /* renamed from: ᬥ  reason: contains not printable characters */
    public static double f1646;

    /* renamed from: ⵜ  reason: contains not printable characters */
    public static C3904 f1647;

    /* renamed from: ɞ  reason: contains not printable characters */
    public int f1648 = 1000;

    /* renamed from: ʬ  reason: contains not printable characters */
    public int f1649 = 1;

    /* renamed from: Ͼ  reason: contains not printable characters */
    public long f1650 = 0;

    /* renamed from: ܧ  reason: contains not printable characters */
    public String f1651 = "";

    /* renamed from: વ  reason: contains not printable characters */
    public boolean f1652 = false;

    /* renamed from: ೞ  reason: contains not printable characters */
    public Vector f1653 = new Vector();

    /* renamed from: ഴ  reason: contains not printable characters */
    public boolean f1654 = true;

    /* renamed from: ම  reason: contains not printable characters */
    public String f1655 = "";

    /* renamed from: Ⴘ  reason: contains not printable characters */
    public boolean f1656 = false;

    /* renamed from: ᆉ  reason: contains not printable characters */
    public boolean f1657 = false;

    /* renamed from: ሉ  reason: contains not printable characters */
    public boolean f1658 = true;

    /* renamed from: ሐ  reason: contains not printable characters */
    public C3874 f1659 = null;

    /* renamed from: ᐁ  reason: contains not printable characters */
    public FileOutputStream f1660 = null;

    /* renamed from: ᴸ  reason: contains not printable characters */
    public Thread f1661 = null;

    /* renamed from: ⲫ  reason: contains not printable characters */
    public int f1662 = 0;

    /* renamed from: ヰ  reason: contains not printable characters */
    public String f1663 = "";

    /* renamed from: ㅟ  reason: contains not printable characters */
    public boolean f1664 = true;

    static {
        C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 0, 6, 47);
        C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 6, 6, 72);
        C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 12, 4, 49);
        f1647 = null;
        f1642 = 1;
        f1645 = "";
        f1646 = 0.0d;
        f1644 = null;
        try {
            Class.forName(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 16, 19, 70));
            f1643 = true;
        } catch (Exception unused) {
            f1643 = false;
        } catch (Error unused2) {
            f1643 = false;
        }
        try {
            String property = System.getProperty(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 35, 7, 124));
            f1644 = property;
            if (property != null) {
                f1644 = property.toLowerCase();
            }
        } catch (Exception unused3) {
            f1644 = null;
        }
        String property2 = System.getProperty(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 42, 12, 50), C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 54, 3, 78));
        if (System.getProperty(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 57, 12, 34)).equals(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 69, 6, 96))) {
            try {
                String str = (String) Class.forName(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 75, 24, 120)).getField(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 99, 7, 33)).get((Object) null);
                f1645 = str;
                String trim = str.trim();
                int indexOf = trim.indexOf(".");
                int i10 = 0;
                while (true) {
                    if (i10 >= trim.length()) {
                        break;
                    }
                    if (i10 != indexOf) {
                        if (!Character.isDigit(trim.charAt(i10))) {
                            trim = trim.substring(0, i10);
                            break;
                        }
                    }
                    i10++;
                }
                f1646 = Double.parseDouble(trim);
            } catch (Error | Exception unused4) {
            }
        }
        if (property2.equals("0") && System.getProperty(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 106, 12, 126)).equals(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 118, 6, 79))) {
            f1642 = 5;
        } else if (property2.compareTo(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 124, 3, 127)) < 0) {
            f1642 = 1;
        } else if (property2.compareTo(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 127, 3, 22)) < 0) {
            f1642 = 2;
        } else if (property2.compareTo(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 130, 3, 3)) < 0) {
            f1642 = 3;
        } else if (property2.compareTo(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 133, 3, 14)) < 0) {
            f1642 = 4;
        } else if (property2.compareTo(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", (int) ModuleDescriptor.MODULE_VERSION, 3, 78)) < 0) {
            f1642 = 5;
        } else if (property2.compareTo(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 139, 3, 64)) < 0) {
            f1642 = 6;
        } else if (property2.compareTo(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 142, 3, 117)) < 0) {
            f1642 = 7;
        } else {
            f1642 = 7;
        }
        int i11 = f1642;
        if (!m1798(i11)) {
            return;
        }
        if (i11 < 2) {
            f1647 = new C3891();
        } else if (i11 < 4) {
            f1647 = new C4057();
        } else {
            f1647 = new C4020();
        }
    }

    public C3856(Object obj) {
        super(obj);
        try {
            m1818(f1643);
            if (m1797() >= 7) {
                this.f1658 = false;
            }
        } catch (C3625 unused) {
        }
    }

    /* renamed from: ᘺ  reason: contains not printable characters */
    public static boolean m1796(String str) {
        if (str != null) {
            str = str.toLowerCase();
        }
        String str2 = f1644;
        return str2 != null && str2.contains(str);
    }

    /* renamed from: ᢼ  reason: contains not printable characters */
    public static int m1797() {
        return f1642;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static boolean m1798(int i10) {
        boolean z10 = i10 <= f1642;
        if (!z10) {
            PrintStream printStream = System.err;
            printStream.println(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 145, 20, 93) + i10 + C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 165, 17, 108) + System.getProperty(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 182, 12, 7), C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 194, 7, 88)) + ".");
        }
        return z10;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1799(int i10) {
        synchronized (this.f375) {
            if (i10 >= 0) {
                try {
                    m376();
                    if (i10 > 0) {
                        Object obj = this.f375;
                        if (i10 > 20) {
                            i10 = 20;
                        }
                        C3727.m1063(obj, i10);
                    }
                    m376();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                throw new C3625((Throwable) null, 201, C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 393, 8, 18));
            }
        }
    }

    /* renamed from: и  reason: contains not printable characters */
    public void m1800() {
        if (!this.f1652 && this.f1650 != 0) {
            m1814();
        }
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public void m1802(boolean z10) {
        this.f1656 = z10;
    }

    /* renamed from: ࡑ  reason: contains not printable characters */
    public void m1803() {
        long j10 = this.f1650;
        m1799(j10 == 0 ? 100 : (int) ((j10 + ((long) (this.f1662 * this.f1648))) - System.currentTimeMillis()));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1804(boolean z10) {
        if (z10 && !this.f379) {
            m1815();
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1808(int i10, byte[] bArr, int i11, int i12) {
        String str;
        if (!(this.f1660 == null && this.f1659 == null) && i12 > 0) {
            if (!(i11 == 0 && i12 == bArr.length)) {
                bArr = C3823.m1630(bArr, i11, i12);
            }
            boolean z10 = false;
            int i13 = 0;
            while (true) {
                if (i13 >= bArr.length) {
                    z10 = true;
                    break;
                }
                byte b10 = bArr[i13];
                if (b10 == 13) {
                    i13++;
                    if (i13 >= bArr.length || bArr[i13] != 10) {
                        break;
                    }
                } else if (b10 == 10) {
                    break;
                }
                i13++;
            }
            boolean z11 = !z10;
            if (i10 == 0) {
                String r52 = C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 482, 17, 29);
                String str2 = C3823.f1540;
                m1805(r52.getBytes());
                m1806(bArr, z11);
                m1805(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 499, 3, 60).getBytes());
            } else if (i10 == 1) {
                if (!z10) {
                    str = C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 502, 16, 122);
                } else {
                    str = C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 518, 19, 117);
                }
                String str3 = C3823.f1540;
                m1805(str.getBytes());
                m1806(bArr, z11);
                m1805(C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 537, 3, 14).getBytes());
            }
        }
    }

    /* renamed from: ഗ  reason: contains not printable characters */
    public int m1809() {
        return this.f1649;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r1 = java.lang.Thread.currentThread();
     */
    /* renamed from: ภ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1810() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f375
            monitor-enter(r0)
            boolean r1 = r4.f1656     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x001d
            boolean r1 = r4.f1664     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x001d
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x001b }
            java.lang.Thread r2 = r4.f1661     // Catch:{ all -> 0x001b }
            if (r2 == r1) goto L_0x001d
            java.util.Vector r3 = r4.f1653     // Catch:{ all -> 0x001b }
            r3.addElement(r2)     // Catch:{ all -> 0x001b }
            r4.f1661 = r1     // Catch:{ all -> 0x001b }
            goto L_0x001d
        L_0x001b:
            r1 = move-exception
            goto L_0x0025
        L_0x001d:
            r4.m1814()     // Catch:{ all -> 0x001b }
            r1 = 0
            r4.f374 = r1     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3856.m1810():void");
    }

    /* renamed from: ᐽ  reason: contains not printable characters */
    public void m1811() {
        FileOutputStream fileOutputStream = this.f1660;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            } finally {
                this.f1660 = null;
            }
        }
    }

    /* renamed from: ᖑ  reason: contains not printable characters */
    public boolean m1812() {
        return this.f1664;
    }

    /* renamed from: ᜇ  reason: contains not printable characters */
    public boolean m1813() {
        return this.f1657;
    }

    /* renamed from: ṧ  reason: contains not printable characters */
    public void m1814() {
        this.f1650 = this.f1662 == 0 ? 0 : System.currentTimeMillis();
    }

    /* renamed from: ⱑ  reason: contains not printable characters */
    public void m1815() {
        synchronized (this.f375) {
            m369((Exception) new C3625((Throwable) null, 301, C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 381, 12, 77)));
            this.f375.notifyAll();
        }
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public void m1817(int i10) {
        this.f1649 = i10;
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public void m1801(int i10) {
        synchronized (this.f375) {
            if (i10 > 2147483) {
                i10 = 2147483;
            }
            this.f1662 = i10;
            this.f375.notifyAll();
        }
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public void m1818(boolean z10) {
        synchronized (this.f375) {
            this.f1657 = z10;
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1805(byte[] bArr) {
        FileOutputStream fileOutputStream = this.f1660;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.write(bArr);
            } catch (IOException unused) {
                throw new C3625((Throwable) null, 304, C3727.m1052("jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c", 446, 36, 87));
            }
        }
        C3874 r02 = this.f1659;
        if (r02 != null) {
            r02.m1920(bArr);
        }
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public void m1816(boolean z10) {
        this.f1664 = z10;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1806(byte[] bArr, boolean z10) {
        byte[] bArr2 = new byte[1];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            char c10 = (char) b10;
            if (c10 >= ' ' && c10 <= 'z') {
                if (c10 == '\\' || c10 == '$' || c10 == '\"' || c10 == '{' || c10 == '}' || c10 == '[' || c10 == ']') {
                    String str = C3823.f1540;
                    m1805("\\".getBytes());
                }
                bArr2[0] = bArr[i10];
                m1805(bArr2);
            } else if (z10 || !(c10 == 13 || c10 == 10)) {
                String str2 = C3823.f1540;
                m1805(("\\" + ((b10 >> 6) & 7) + ((b10 >> 3) & 7) + (b10 & 7)).getBytes());
            } else {
                bArr2[0] = b10;
                m1805(bArr2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m1807(nts.C4095 r8) {
        /*
            r7 = this;
            r0 = 4
            java.lang.String r1 = "jdbocx\u001b\f\u0018\u001d\t\u001fpv}u/%1'o!46c\t9+'<\u001a?0!27*t5=0;~t`v>gwaotqqJTH}wcu=d|>qpygCMVNMJDMZ@GI\u0002LQ\u000fbROI@\u001fl|jlwrr\u0017\u0001\u000b\u0003\u0000\u0013\u0006rxlz2ks1~pv{_QJRQ1/0[E[³­´¹§¿ôêñùçýÉ×Â¸´µ³©þ¬¹¼§¿µ¡³÷ëöù®®¯»±¤ñõ¿¤è×ÝÉßÎÞÈÆÝØØèòôðöïõ¡³®ª²° ¢¥¬¡º¸´¡£°´¤¼¤¿¯ª¬ÕþêæêñïïçõéÈüîæýå×ëìåèóñÍåÇàäãçþéðýÿôä'\u0014\u000b\"\u0012\u0004\u000f\u000b\t\u000b\u0006\u000eV`ehreVlJdbj\r;>3)>\r7\u0004\"'==5[|iNx|fkFSQGueojNixo~iTM[X\\xOY@BDT\u0010-4\"!%\u0017\n\u000f8\";=;/-\n\u001f?\u001d\u0018\u0013\u0010\u001e%\u001a\u0001\u0011\u0014\u0012\u0004Xzq[ugwuSJZJKOK@PR\u0019ÇûüõøãáºøÎÍÑËÔÊÐÚÞØÖÕÛÁÉÝÙÍÈÃÃÍÂÂÂÚÏùüñëüÏõÓýûó¿¾½¡»è¼¸¬°®¨¦à±§¾³­º¼¼û¾´ ¶ö¥¿ó´ÀãåÆÊÁÜîÀÄíúöýº¶öüøöâè²±mk\u0011\u0006\n\u0001FJ\u0006\u0006\u0004\u000e\u001b\u0001\u0007\u0001\u0015QP6\u0018\u001c"
            r2 = 201(0xc9, float:2.82E-43)
            r3 = 15
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r2, (int) r3, (int) r0)
            boolean r0 = r8.m3237(r0)
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0031
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x0029
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            boolean r0 = r7.f1652
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x0029:
            boolean r8 = r8.m3232()
            r7.f1652 = r8
            goto L_0x0209
        L_0x0031:
            r0 = 216(0xd8, float:3.03E-43)
            r4 = 17
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r0, (int) r3, (int) r4)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x005d
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x0055
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            boolean r0 = r7.f1664
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x0055:
            boolean r8 = r8.m3232()
            r7.f1664 = r8
            goto L_0x0209
        L_0x005d:
            r0 = 231(0xe7, float:3.24E-43)
            r5 = 112(0x70, float:1.57E-43)
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r0, (int) r4, (int) r5)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x0089
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x0081
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            boolean r0 = r7.f1656
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x0081:
            boolean r8 = r8.m3232()
            r7.f1656 = r8
            goto L_0x0209
        L_0x0089:
            r0 = 21
            r5 = 110(0x6e, float:1.54E-43)
            r6 = 248(0xf8, float:3.48E-43)
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r6, (int) r0, (int) r5)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r8.f3484
            r1 = 1
            if (r0 == 0) goto L_0x00b4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            int r0 = r7.f1648
            if (r0 != r1) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r1 = 0
        L_0x00ac:
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x00b4:
            boolean r8 = r8.m3232()
            if (r8 == 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r1 = 1000(0x3e8, float:1.401E-42)
        L_0x00bd:
            r7.f1648 = r1
            goto L_0x0209
        L_0x00c1:
            r0 = 269(0x10d, float:3.77E-43)
            r5 = 97
            r6 = 12
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r0, (int) r6, (int) r5)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x00e7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            boolean r0 = r7.f1657
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x00e7:
            boolean r8 = r8.m3232()
            r7.m1818((boolean) r8)
            goto L_0x0209
        L_0x00f0:
            r0 = 281(0x119, float:3.94E-43)
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r0, (int) r6, (int) r4)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x0109
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x0103
            java.lang.String r8 = r7.f1651
            return r8
        L_0x0103:
            java.lang.String r8 = r8.f3482
            r7.f1651 = r8
            goto L_0x0209
        L_0x0109:
            r0 = 14
            r4 = 116(0x74, float:1.63E-43)
            r5 = 293(0x125, float:4.1E-43)
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r5, (int) r0, (int) r4)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x014a
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x012e
            nts.ᐯ r8 = r7.f1659
            if (r8 != 0) goto L_0x0122
            goto L_0x012d
        L_0x0122:
            byte[] r8 = r8.m1923()
            java.lang.String r0 = nts.C3823.f1540
            java.lang.String r2 = new java.lang.String
            r2.<init>(r8)
        L_0x012d:
            return r2
        L_0x012e:
            java.lang.String r8 = r8.f3482
            java.lang.String r0 = nts.C3823.f1540
            java.lang.String r0 = "on"
            boolean r8 = r8.equalsIgnoreCase(r0)
            if (r8 == 0) goto L_0x0145
            nts.ᐯ r8 = new nts.ᐯ
            r0 = 256(0x100, float:3.59E-43)
            r8.<init>(r0)
            r7.f1659 = r8
            goto L_0x0209
        L_0x0145:
            r8 = 0
            r7.f1659 = r8
            goto L_0x0209
        L_0x014a:
            r0 = 22
            r4 = 43
            r5 = 307(0x133, float:4.3E-43)
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r5, (int) r0, (int) r4)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x0178
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x0170
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            boolean r0 = r7.f1658
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x0170:
            boolean r8 = r8.m3232()
            r7.f1658 = r8
            goto L_0x0209
        L_0x0178:
            r0 = 329(0x149, float:4.61E-43)
            r4 = 121(0x79, float:1.7E-43)
            r5 = 13
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r0, (int) r5, (int) r4)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x0195
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x018f
            java.lang.String r8 = r7.f1655
            return r8
        L_0x018f:
            java.lang.String r8 = r8.f3482
            r7.f1655 = r8
            goto L_0x0209
        L_0x0195:
            r0 = 342(0x156, float:4.79E-43)
            r4 = 29
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r0, (int) r3, (int) r4)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x01af
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x01aa
            java.lang.String r8 = r7.f1663
            return r8
        L_0x01aa:
            java.lang.String r8 = r8.f3482
            r7.f1663 = r8
            goto L_0x0209
        L_0x01af:
            r0 = 357(0x165, float:5.0E-43)
            r3 = 16
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r0, (int) r3, (int) r5)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x01da
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x01d3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            boolean r0 = r7.f1654
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x01d3:
            boolean r8 = r8.m3232()
            r7.f1654 = r8
            goto L_0x0209
        L_0x01da:
            r0 = 8
            r3 = 105(0x69, float:1.47E-43)
            r4 = 373(0x175, float:5.23E-43)
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r1, (int) r4, (int) r0, (int) r3)
            boolean r0 = r8.m3237(r0)
            if (r0 == 0) goto L_0x020a
            boolean r0 = r8.f3484
            if (r0 == 0) goto L_0x0202
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r0 = r7.m1809()
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x0202:
            int r8 = r8.m3239()
            r7.m1817((int) r8)
        L_0x0209:
            return r2
        L_0x020a:
            java.lang.String r8 = super.m367((nts.C4095) r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3856.m1807(nts.ἆ):java.lang.String");
    }
}
