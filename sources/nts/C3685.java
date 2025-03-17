package nts;

import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

/* renamed from: nts.ঔ  reason: contains not printable characters */
public class C3685 extends C3596 {

    /* renamed from: ᗎ  reason: contains not printable characters */
    public static final String f827 = C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 60, 5, 71);

    /* renamed from: ᚪ  reason: contains not printable characters */
    public static C4094 f828 = new C4094(C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 0, 54, 87), 0);

    /* renamed from: ᡥ  reason: contains not printable characters */
    public static final String f829 = C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 65, 24, 14);

    /* renamed from: ᬥ  reason: contains not printable characters */
    public static final byte[] f830;

    /* renamed from: ⵜ  reason: contains not printable characters */
    public static final String f831 = C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 54, 6, 81);

    /* renamed from: ȡ  reason: contains not printable characters */
    public boolean f832 = false;

    /* renamed from: ɞ  reason: contains not printable characters */
    public StringBuilder f833 = null;

    /* renamed from: ʬ  reason: contains not printable characters */
    public Vector f834 = null;

    /* renamed from: Ͼ  reason: contains not printable characters */
    public String f835 = null;

    /* renamed from: м  reason: contains not printable characters */
    public int f836 = 0;

    /* renamed from: љ  reason: contains not printable characters */
    public String f837;

    /* renamed from: ҁ  reason: contains not printable characters */
    public int f838 = 3;

    /* renamed from: ػ  reason: contains not printable characters */
    public int f839;

    /* renamed from: ܧ  reason: contains not printable characters */
    public Vector f840 = null;

    /* renamed from: ঙ  reason: contains not printable characters */
    public int f841;

    /* renamed from: ਵ  reason: contains not printable characters */
    public int f842;

    /* renamed from: ન  reason: contains not printable characters */
    public int f843;

    /* renamed from: ય  reason: contains not printable characters */
    public int f844;

    /* renamed from: વ  reason: contains not printable characters */
    public String f845 = null;

    /* renamed from: ପ  reason: contains not printable characters */
    public int f846;

    /* renamed from: ఛ  reason: contains not printable characters */
    public int f847;

    /* renamed from: ೞ  reason: contains not printable characters */
    public boolean f848 = false;

    /* renamed from: ഴ  reason: contains not printable characters */
    public int f849 = 0;

    /* renamed from: ම  reason: contains not printable characters */
    public boolean f850 = true;

    /* renamed from: ฃ  reason: contains not printable characters */
    public boolean f851 = false;

    /* renamed from: ບ  reason: contains not printable characters */
    public int f852;

    /* renamed from: Ⴓ  reason: contains not printable characters */
    public C4060 f853 = null;

    /* renamed from: Ⴘ  reason: contains not printable characters */
    public boolean f854 = true;

    /* renamed from: ᆉ  reason: contains not printable characters */
    public boolean f855 = false;

    /* renamed from: ሉ  reason: contains not printable characters */
    public boolean f856 = false;

    /* renamed from: ሐ  reason: contains not printable characters */
    public Vector f857 = null;

    /* renamed from: ሠ  reason: contains not printable characters */
    public boolean f858 = true;

    /* renamed from: ቒ  reason: contains not printable characters */
    public boolean f859 = false;

    /* renamed from: ᐁ  reason: contains not printable characters */
    public C3555 f860;

    /* renamed from: ᕡ  reason: contains not printable characters */
    public boolean f861 = false;

    /* renamed from: ᛃ  reason: contains not printable characters */
    public byte[] f862 = f830;

    /* renamed from: ᡲ  reason: contains not printable characters */
    public int f863;

    /* renamed from: ᯝ  reason: contains not printable characters */
    public boolean f864 = false;

    /* renamed from: ᰐ  reason: contains not printable characters */
    public boolean f865 = false;

    /* renamed from: ᰕ  reason: contains not printable characters */
    public Stack<C3953> f866 = new Stack<>();

    /* renamed from: ᰜ  reason: contains not printable characters */
    public C4190 f867 = null;

    /* renamed from: ᴸ  reason: contains not printable characters */
    public boolean f868 = false;

    /* renamed from: Ὴ  reason: contains not printable characters */
    public C4060 f869 = null;

    /* renamed from: ℎ  reason: contains not printable characters */
    public StringBuffer f870 = new StringBuffer();

    /* renamed from: Ⅹ  reason: contains not printable characters */
    public int f871;

    /* renamed from: ⲫ  reason: contains not printable characters */
    public C3999 f872 = null;

    /* renamed from: ⳇ  reason: contains not printable characters */
    public boolean f873 = false;

    /* renamed from: ⶈ  reason: contains not printable characters */
    public boolean f874 = true;

    /* renamed from: 〺  reason: contains not printable characters */
    public C4060 f875;

    /* renamed from: ヰ  reason: contains not printable characters */
    public boolean f876 = true;

    /* renamed from: ヺ  reason: contains not printable characters */
    public boolean f877 = true;

    /* renamed from: ㅟ  reason: contains not printable characters */
    public boolean f878 = true;

    /* renamed from: ㅼ  reason: contains not printable characters */
    public int f879 = 0;

    static {
        byte[] bArr = new byte[ImageMetadata.CONTROL_AE_ANTIBANDING_MODE];
        f830 = bArr;
        bArr[32] = (byte) (bArr[32] | 1);
        bArr[9] = (byte) (bArr[9] | 1);
        bArr[10] = (byte) (bArr[10] | 1);
        bArr[13] = (byte) (bArr[13] | 1);
        bArr[12] = (byte) (bArr[12] | 1);
        bArr[58] = (byte) (bArr[58] | 6);
        bArr[95] = (byte) (bArr[95] | 6);
        for (int i10 = 65; i10 <= 90; i10++) {
            byte[] bArr2 = f830;
            bArr2[i10] = (byte) (bArr2[i10] | 6);
        }
        for (int i11 = 97; i11 <= 122; i11++) {
            byte[] bArr3 = f830;
            bArr3[i11] = (byte) (bArr3[i11] | 6);
        }
        for (int i12 = 192; i12 <= 214; i12++) {
            byte[] bArr4 = f830;
            bArr4[i12] = (byte) (bArr4[i12] | 6);
        }
        for (int i13 = 216; i13 <= 246; i13++) {
            byte[] bArr5 = f830;
            bArr5[i13] = (byte) (bArr5[i13] | 6);
        }
        for (int i14 = 248; i14 <= 767; i14++) {
            byte[] bArr6 = f830;
            bArr6[i14] = (byte) (bArr6[i14] | 6);
        }
        for (int i15 = 880; i15 <= 893; i15++) {
            byte[] bArr7 = f830;
            bArr7[i15] = (byte) (bArr7[i15] | 6);
        }
        for (int i16 = 895; i16 <= 8191; i16++) {
            byte[] bArr8 = f830;
            bArr8[i16] = (byte) (bArr8[i16] | 6);
        }
        for (int i17 = 8204; i17 <= 8205; i17++) {
            byte[] bArr9 = f830;
            bArr9[i17] = (byte) (bArr9[i17] | 6);
        }
        for (int i18 = 8304; i18 <= 8591; i18++) {
            byte[] bArr10 = f830;
            bArr10[i18] = (byte) (bArr10[i18] | 6);
        }
        for (int i19 = 11264; i19 <= 12271; i19++) {
            byte[] bArr11 = f830;
            bArr11[i19] = (byte) (bArr11[i19] | 6);
        }
        for (int i20 = 12289; i20 <= 55295; i20++) {
            byte[] bArr12 = f830;
            bArr12[i20] = (byte) (bArr12[i20] | 6);
        }
        for (int i21 = 63744; i21 <= 64975; i21++) {
            byte[] bArr13 = f830;
            bArr13[i21] = (byte) (bArr13[i21] | 6);
        }
        for (int i22 = 65008; i22 <= 65533; i22++) {
            byte[] bArr14 = f830;
            bArr14[i22] = (byte) (bArr14[i22] | 6);
        }
        byte[] bArr15 = f830;
        bArr15[45] = (byte) (bArr15[45] | 4);
        bArr15[46] = (byte) (bArr15[46] | 4);
        bArr15[183] = (byte) (bArr15[183] | 4);
        for (int i23 = 48; i23 <= 57; i23++) {
            byte[] bArr16 = f830;
            bArr16[i23] = (byte) (bArr16[i23] | 4);
        }
        for (int i24 = 768; i24 <= 879; i24++) {
            byte[] bArr17 = f830;
            bArr17[i24] = (byte) (bArr17[i24] | 4);
        }
        for (int i25 = 8255; i25 <= 8256; i25++) {
            byte[] bArr18 = f830;
            bArr18[i25] = (byte) (bArr18[i25] | 4);
        }
    }

    public C3685(Object obj, Object obj2) {
        super(obj2);
        m832();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public final void m819(int i10) {
        C4060 r02;
        C4060 r03;
        C4060 r04;
        int i11 = this.f843;
        int i12 = this.f847;
        if (i11 < i12) {
            if (i10 == 0) {
                String r52 = m839();
                m831(r52);
                if (this.f848 && (r02 = this.f869) != null) {
                    r02.m2855(r52);
                }
            } else if (i10 == 1) {
                String r53 = m839();
                C4190 r05 = this.f867;
                if (r05 != null) {
                    r05.m3689(r53);
                }
            } else if (i10 == 2) {
                if (!this.f851) {
                    while (i12 > this.f843 && (this.f862[this.f833.charAt(i12 - 1)] & 1) != 0) {
                        i12--;
                    }
                }
                int i13 = this.f843;
                if (i12 > i13) {
                    StringBuilder sb2 = this.f833;
                    String str = C3823.f1540;
                    String substring = sb2.substring(i13, i12);
                    m831(substring);
                    if (this.f848 && (r03 = this.f869) != null) {
                        r03.m2855(substring);
                    }
                }
                int i14 = this.f847;
                if (i12 < i14) {
                    StringBuilder sb3 = this.f833;
                    String str2 = C3823.f1540;
                    String substring2 = sb3.substring(i12, i14);
                    C4190 r06 = this.f867;
                    if (r06 != null) {
                        r06.m3689(substring2);
                    }
                }
            } else if (i10 == 3) {
                while (i12 > this.f843 && (this.f862[this.f833.charAt(i12 - 1)] & 1) != 0) {
                    i12--;
                }
                int i15 = this.f843;
                if (i12 > i15) {
                    StringBuilder sb4 = this.f833;
                    String str3 = C3823.f1540;
                    String substring3 = sb4.substring(i15, i12);
                    m831(substring3);
                    this.f841 = this.f852;
                    if (this.f848 && (r04 = this.f869) != null) {
                        r04.m2855(substring3);
                    }
                }
                this.f843 = i12;
                return;
            }
            this.f841 = this.f852;
            this.f843 = this.f847;
        } else if (this.f851 || this.f849 != 8) {
            this.f843 = this.f879;
        }
    }

    /* renamed from: и  reason: contains not printable characters */
    public String m820() {
        StringBuilder sb2 = this.f833;
        int i10 = this.f842;
        int i11 = this.f871;
        String str = C3823.f1540;
        return sb2.substring(i10, i11);
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public void m822(boolean z10) {
        this.f848 = z10;
        if (z10) {
            this.f868 = true;
            this.f854 = true;
            return;
        }
        this.f854 = false;
    }

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C4060 m823(String str) {
        boolean z10;
        C4060 r22;
        if (str.equals(this.f837) && this.f837.startsWith("/")) {
            return this.f875;
        }
        this.f837 = str;
        if (str.startsWith("/")) {
            z10 = true;
            str = str.substring(1);
        } else {
            z10 = false;
        }
        if (z10 || (r22 = this.f869) == null) {
            r22 = this.f853;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "/");
        if (stringTokenizer.hasMoreTokens() && r22 != null) {
            r22 = r22.m2854(stringTokenizer, z10);
        }
        this.f875 = r22;
        return r22;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m825(boolean z10) {
        this.f840 = null;
        this.f860 = null;
        this.f834 = null;
        this.f857 = null;
        this.f872 = null;
        this.f853 = null;
        this.f869 = null;
        this.f833 = null;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public String m827(int i10, int i11) {
        StringBuilder sb2 = this.f833;
        String str = C3823.f1540;
        return sb2.substring(i10, i11);
    }

    /* renamed from: ഗ  reason: contains not printable characters */
    public final void m832() {
        this.f840 = new Vector();
        this.f860 = new C3555();
        this.f834 = new Vector();
        this.f857 = new Vector();
        m845();
    }

    /* renamed from: ภ  reason: contains not printable characters */
    public final void m833() {
        String r02 = this.f872.m2461(this.f833, this.f842, this.f871);
        this.f835 = r02;
        this.f842 = this.f879;
        this.f845 = "";
        if (this.f868) {
            C3555 r12 = this.f860;
            r12.f84 = null;
            r12.f86++;
            this.f840.addElement(r02);
        }
    }

    /* renamed from: ᐽ  reason: contains not printable characters */
    public final void m834() {
        m848(true);
        m847(true);
    }

    /* renamed from: ᖑ  reason: contains not printable characters */
    public String m835() {
        if (this.f859) {
            int i10 = this.f842;
            int i11 = this.f871;
            if (i10 < i11) {
                StringBuffer stringBuffer = this.f870;
                StringBuilder sb2 = this.f833;
                String str = C3823.f1540;
                stringBuffer.append(sb2.substring(i10, i11));
            }
            return this.f870.toString();
        }
        int i12 = this.f871;
        int i13 = this.f842;
        if (i12 <= i13) {
            return "";
        }
        StringBuilder sb3 = this.f833;
        String str2 = C3823.f1540;
        return sb3.substring(i13, i12);
    }

    /* renamed from: ᘺ  reason: contains not printable characters */
    public final C3953 m837(String str) {
        String str2;
        String str3;
        int indexOf = str.indexOf(58);
        String str4 = "";
        if (indexOf > 0) {
            str2 = str.substring(indexOf + 1);
            str3 = str.substring(0, indexOf);
        } else {
            str2 = str;
            str3 = str4;
        }
        C3609 r32 = this.f860.m141(str3);
        if (r32 == null) {
            String r33 = C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 993, 46, 34);
            if ((this.f838 & 2) != 0) {
                m830(202, r33);
            } else {
                throw new C3625((Throwable) null, 202, r33);
            }
        } else {
            str4 = r32.f490;
        }
        return new C3953(str3, str2, str4, str);
    }

    /* renamed from: ᚪ  reason: contains not printable characters */
    public final void m838() {
        C4060 r02;
        String r03 = m820();
        String r12 = this.f847 > this.f843 ? m839() : "";
        String trim = r03.trim();
        C4190 r32 = this.f867;
        if (r32 != null) {
            r32.m3694(trim, r12);
        }
        if (this.f848 && r03.equals(C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 988, 5, 41)) && (r02 = this.f869) != null) {
            r02.m2855(r12);
        }
        this.f841 = this.f852;
        int i10 = this.f879;
        this.f843 = i10;
        this.f842 = i10;
    }

    /* renamed from: ᜇ  reason: contains not printable characters */
    public String m839() {
        int i10 = this.f847;
        int i11 = this.f843;
        if (i10 <= i11) {
            return "";
        }
        StringBuilder sb2 = this.f833;
        String str = C3823.f1540;
        return sb2.substring(i11, i10);
    }

    /* renamed from: ᢼ  reason: contains not printable characters */
    public String m841() {
        C4060 r02 = this.f869;
        if (r02 == null) {
            return "";
        }
        return r02.m2857();
    }

    /* renamed from: ṧ  reason: contains not printable characters */
    public final void m843() {
        C3953 r02;
        String str;
        if (!this.f868 || !this.f845.startsWith(f827)) {
            try {
                r02 = m840(this.f845);
            } catch (C3625 unused) {
                r02 = new C3953(this.f845);
            }
            this.f834.add(new C4221(r02.f2328, r02.f2329, r02.f2327, m835()));
        } else {
            int indexOf = this.f845.indexOf(":");
            if (indexOf > 0) {
                String str2 = C3823.f1540;
                str = this.f845.substring(indexOf + 1);
            } else {
                str = "";
            }
            String r32 = m820();
            C3609 r42 = new C3609(r32, str);
            if (this.f850) {
                this.f857.add(r42);
            }
            this.f860.m142(r42);
            for (int i10 = 0; i10 < this.f834.size(); i10++) {
                C4221 r52 = (C4221) this.f834.get(i10);
                if (r52 != null && str.equals(r52.f4171)) {
                    r52.f4170 = r32;
                }
            }
            C4190 r43 = this.f867;
            if (r43 != null) {
                r43.m3690(str, r32);
            }
        }
        this.f845 = "";
        this.f842 = this.f879;
        this.f859 = false;
    }

    /* renamed from: ⱑ  reason: contains not printable characters */
    public final void m844() {
        this.f845 = this.f872.m2461(this.f833, this.f842, this.f871);
        this.f842 = this.f879;
    }

    /* renamed from: ⵜ  reason: contains not printable characters */
    public final void m845() {
        this.f849 = 0;
        this.f864 = false;
        this.f835 = "";
        this.f845 = "";
        this.f879 = 0;
        this.f863 = 0;
        this.f841 = 0;
        this.f852 = 0;
        this.f846 = 0;
        this.f843 = 0;
        this.f847 = 0;
        this.f842 = 0;
        this.f871 = 0;
        this.f839 = 0;
        this.f844 = 0;
        this.f840.clear();
        C3555 r12 = this.f860;
        r12.f85.clear();
        r12.f84 = null;
        r12.f86 = 0;
        this.f853 = null;
        this.f869 = null;
        this.f834.clear();
        this.f857.clear();
        this.f872 = new C3999();
        this.f833 = new StringBuilder();
        this.f378.m98(C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 425, 5, 119));
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public final void m847(boolean z10) {
        C3953 r32;
        C4060 r42;
        C4060 r43;
        C4060 r44;
        int i10;
        boolean z11 = false;
        m819(0);
        String r22 = z10 ? this.f835 : this.f872.m2461(this.f833, this.f842, this.f871);
        if (this.f864 && r22.equalsIgnoreCase(f831)) {
            this.f864 = false;
        }
        if (this.f848 || this.f868) {
            if (this.f868) {
                r32 = m829(r22, false);
            } else {
                r32 = new C3953(this.f874 ? r22 : m842(r22));
            }
            List<C3609> list = null;
            if (this.f848 && (r43 = this.f869) != null) {
                if (z10) {
                    r43.f2982 = r43.f2984;
                } else {
                    r43.f2982 = this.f863;
                }
                if (this.f851 && r43.m2857().length() == 0 && (r44 = this.f869).f2982 > (i10 = r44.f2984)) {
                    boolean z12 = true;
                    while (z12 && i10 < this.f869.f2982) {
                        if ((this.f862[this.f833.charAt(i10)] & 1) == 0) {
                            z12 = false;
                        }
                        i10++;
                    }
                    C4060 r45 = this.f869;
                    int i11 = r45.f2984;
                    int i12 = r45.f2982;
                    StringBuilder sb2 = this.f833;
                    String str = C3823.f1540;
                    String substring = sb2.substring(i11, i12);
                    if (z12) {
                        C4060 r62 = this.f869;
                        r62.getClass();
                        if (substring == null || substring.length() == 0) {
                            r62.f2988 = null;
                        } else {
                            StringBuilder sb3 = r62.f2988;
                            if (sb3 == null) {
                                r62.f2988 = new StringBuilder();
                            } else {
                                sb3.setLength(0);
                            }
                            r62.f2988.append(substring);
                        }
                    }
                }
            }
            C4060 r46 = this.f869;
            if (r46 == null) {
                r42 = null;
            } else {
                r42 = r46.f2980;
            }
            String str2 = r32.f2329;
            String str3 = r32.f2328;
            C4190 r72 = this.f867;
            if (r72 != null) {
                r72.m3695(str2, str3, r22, z10);
            }
            if (this.f848 && r42 != null) {
                this.f869 = r42;
            }
            if (this.f868) {
                if (this.f840.isEmpty() || !r22.equals(this.f840.lastElement())) {
                    throw new C3625((Throwable) null, 201, f829 + r22);
                }
                Vector vector = this.f840;
                vector.removeElementAt(vector.size() - 1);
                List<C3609> list2 = this.f860.f84;
                if (list2 != null) {
                    for (int i13 = 0; i13 < list2.size(); i13++) {
                        String str4 = list2.get(i13).f490;
                        C4190 r47 = this.f867;
                        if (r47 != null) {
                            r47.m3699(str4);
                        }
                    }
                }
                C3555 r11 = this.f860;
                int i14 = r11.f86;
                if (i14 > 0) {
                    int i15 = i14 - 1;
                    r11.f86 = i15;
                    if (i15 == 0) {
                        z11 = true;
                    }
                }
                int size = r11.f85.size();
                if (!z11 && size > 0) {
                    size--;
                    r11.f85.remove(size);
                }
                if (size > 0) {
                    list = r11.f85.get(size - 1);
                }
                r11.f84 = list;
            }
        } else {
            String r02 = this.f874 ? r22 : m842(r22);
            C4190 r12 = this.f867;
            if (r12 != null) {
                r12.m3695("", r02, r22, z10);
            }
        }
        this.f842 = this.f879;
        this.f841 = this.f852;
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public final void m848(boolean z10) {
        C3953 r02;
        String str;
        if (this.f835.length() == 6) {
            String str2 = f831;
            String str3 = this.f835;
            String str4 = C3823.f1540;
            if (str2.equalsIgnoreCase(str3)) {
                this.f864 = true;
            }
        }
        if (this.f848 || this.f868) {
            if (this.f868) {
                r02 = m829(this.f835, true);
            } else {
                r02 = new C3953(this.f874 ? this.f835 : m842(this.f835));
            }
            C3953 r62 = r02;
            String str5 = r62.f2329;
            String str6 = r62.f2328;
            String str7 = this.f835;
            C4190 r52 = this.f867;
            if (r52 != null) {
                r52.m3691(str5, str6, str7, z10);
            }
            if (this.f848) {
                C4060 r42 = new C4060(this.f869, r62, this.f834, this.f857, this.f863, this.f879);
                this.f869 = r42;
                C4060 r03 = r42.f2980;
                if (r03 == null) {
                    this.f853 = r42;
                } else {
                    r42.f2980 = r03;
                    C4060 r32 = r03.f2985;
                    r03.f2987++;
                    C4060 r22 = r03.f2983;
                    if (r22 == null || r32 == null) {
                        if (r22 == null) {
                            r03.f2985 = r42;
                            r03.f2983 = r42;
                            r42.f2992 = null;
                            r42.f2991 = null;
                        } else {
                            r42.f2992 = r22;
                            r22.f2991 = r42;
                            r03.f2983 = r42;
                        }
                        r03.f2986 = null;
                    } else {
                        C4060 r23 = r32.f2992;
                        r32.f2992 = r42;
                        r42.f2991 = r32;
                        r42.f2992 = r23;
                        if (r23 == null) {
                            r03.f2985 = r42;
                        }
                        r03.f2986 = null;
                    }
                }
                if (this.f875 == null && (str = this.f837) != null && str.length() > 0) {
                    this.f837 = "";
                }
            }
        } else {
            String r04 = this.f874 ? this.f835 : m842(this.f835);
            String str8 = this.f835;
            C4190 r33 = this.f867;
            if (r33 != null) {
                r33.m3691("", r04, str8, z10);
            }
        }
        this.f841 = this.f852;
    }

    /* renamed from: ᢼ  reason: contains not printable characters */
    public final String m842(String str) {
        int indexOf = str.indexOf(58);
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    /* renamed from: и  reason: contains not printable characters */
    public void m821(String str) {
        C4060 r22;
        int i10;
        int i11;
        this.f837 = "";
        if (this.f854) {
            this.f833.append(str);
        } else {
            if (this.f849 != 0 || (i11 = this.f843) >= this.f841) {
                int i12 = this.f841;
                if (i12 > 0) {
                    int length = i12 < this.f833.length() ? this.f841 : this.f833.length();
                    this.f833.delete(0, length);
                    this.f846 += length;
                }
            } else {
                this.f833.delete(0, i11);
                int i13 = this.f843;
                this.f841 = i13;
                this.f846 += i13;
            }
            int i14 = this.f841;
            if (i14 > 0) {
                int i15 = this.f842;
                this.f842 = i15 < i14 ? 0 : i15 - i14;
                int i16 = this.f871;
                this.f871 = i16 < i14 ? 0 : i16 - i14;
                int i17 = this.f843;
                this.f843 = i17 < i14 ? 0 : i17 - i14;
                int i18 = this.f847;
                this.f847 = i18 < i14 ? 0 : i18 - i14;
                int i19 = this.f852;
                this.f852 = i19 < i14 ? 0 : i19 - i14;
                int i20 = this.f879;
                this.f879 = i20 < i14 ? 0 : i20 - i14;
                int i21 = this.f863;
                this.f863 = i21 < i14 ? 0 : i21 - i14;
                int i22 = this.f839;
                this.f839 = i22 < i14 ? 0 : i22 - i14;
                int i23 = this.f844;
                this.f844 = i23 < i14 ? 0 : i23 - i14;
                if (this.f851 && this.f848 && (r22 = this.f869) != null && r22.f2982 == 0 && (i10 = r22.f2984) >= i14) {
                    r22.f2984 = i10 - i14;
                }
                this.f841 = 0;
            }
            this.f833.append(str);
        }
        m846(this.f879 + str.length());
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final String m826(char c10) {
        char c11 = c10;
        StringBuffer stringBuffer = new StringBuffer(16);
        if (this.f848 || this.f836 == 1) {
            StringBuilder sb2 = this.f833;
            int i10 = this.f839;
            int i11 = this.f844;
            int i12 = i11 - i10;
            if (i12 == 2 && sb2.charAt(i10) == 'l' && sb2.charAt(i10 + 1) == 't') {
                stringBuffer.append('<');
            } else if (i12 == 2 && sb2.charAt(i10) == 'g' && sb2.charAt(i10 + 1) == 't') {
                stringBuffer.append('>');
            } else if (i12 == 3 && sb2.charAt(i10) == 'a' && sb2.charAt(i10 + 1) == 'm' && sb2.charAt(i10 + 2) == 'p') {
                stringBuffer.append('&');
            } else if (i12 == 4 && sb2.charAt(i10) == 'a' && sb2.charAt(i10 + 1) == 'p' && sb2.charAt(i10 + 2) == 'o' && sb2.charAt(i10 + 3) == 's') {
                stringBuffer.append('\'');
            } else if (i12 == 4 && sb2.charAt(i10) == 'q' && sb2.charAt(i10 + 1) == 'u' && sb2.charAt(i10 + 2) == 'o' && sb2.charAt(3 + i10) == 't') {
                stringBuffer.append('\"');
            } else if (i12 > 0 && sb2.charAt(i10) == '#') {
                int i13 = i10 + 1;
                try {
                    if (sb2.charAt(i13) == 'x') {
                        String str = C3823.f1540;
                        stringBuffer.append((char) ((int) C3823.m1633(sb2.substring(i10 + 2, i11))));
                    } else {
                        String str2 = C3823.f1540;
                        stringBuffer.append((char) Integer.parseInt(sb2.substring(i13, i11)));
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (stringBuffer.length() == 0) {
            String r22 = m827(this.f839, this.f844);
            if (m824() || !C3823.m1590(r22)) {
                stringBuffer.append('&');
                stringBuffer.append(r22);
                if (c11 == ';') {
                    stringBuffer.append(c11);
                }
            } else {
                throw new C3625((Throwable) null, 204, C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 949, 20, 78) + this.f833.charAt(this.f839 - 1) + C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 969, 11, 108));
            }
        }
        if (!this.f861) {
            String r12 = m827(this.f839, this.f844);
            if (this.f867 != null) {
                String[] strArr = {stringBuffer.toString()};
                this.f867.m3696(r12, strArr);
                stringBuffer.setLength(0);
                stringBuffer.append(strArr[0]);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: ᜇ  reason: contains not printable characters */
    public final C3953 m840(String str) {
        String str2;
        String str3;
        int indexOf = str.indexOf(58);
        String str4 = "";
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            if (str2.equals(C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 1087, 3, 118))) {
                C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 1090, 36, 87);
            }
            str3 = str.substring(indexOf + 1);
        } else {
            str3 = str;
            str2 = str4;
        }
        if (str2.length() != 0) {
            C3609 r42 = this.f860.m141(str2);
            if (r42 == null) {
                String r12 = C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 1039, 48, 67);
                if ((this.f838 & 1) != 0) {
                    m830(203, r12);
                } else {
                    throw new C3625((Throwable) null, 203, r12);
                }
            } else {
                str4 = r42.f490;
            }
        }
        return new C3953(str2, str3, str4, str);
    }

    /* renamed from: ᖑ  reason: contains not printable characters */
    public void m836(String str) {
        if (str != null && !str.equals("") && !str.equals(".")) {
            if (!str.equals("") && !str.equals(".")) {
                if (this.f853 != null) {
                    C4060 r62 = m823(str);
                    if (r62 != null) {
                        this.f869 = r62;
                        this.f834 = r62.f2990;
                        this.f857 = r62.f2981;
                        if (this.f876) {
                            r62.m2852();
                        }
                    }
                    if (r62 != null) {
                        return;
                    }
                } else {
                    throw new C3625((Throwable) null, 210, C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 893, 56, 92));
                }
            }
            throw new C3625((Throwable) null, 207, C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 879, 14, 108));
        }
    }

    /* renamed from: ࡑ  reason: contains not printable characters */
    public final boolean m824() {
        return !this.f868 || this.f855;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final C3953 m829(String str, boolean z10) {
        if (z10) {
            C3953 r32 = m837(str);
            this.f866.push(r32);
            return r32;
        }
        try {
            C3953 peek = this.f866.peek();
            if (!peek.f2326.equals(str)) {
                return m837(str);
            }
            this.f866.pop();
            return peek;
        } catch (Exception unused) {
            throw new C3625((Throwable) null, 201, f829 + str);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m831(String str) {
        C4190 r02 = this.f867;
        if (r02 != null) {
            r02.m3693(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0207, code lost:
        if (r0.f849 != 21) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0209, code lost:
        if (r2 != '>') goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0216, code lost:
        if (r0.f833.charAt(r0.f879 - 2) != '?') goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0218, code lost:
        r2 = r0.f879;
        r0.f852 = r2;
        r0.f871 = r2 - 2;
        m819(0);
        r2 = r0.f842;
        r3 = r0.f871;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0226, code lost:
        if (r2 >= r3) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0228, code lost:
        r2 = m827(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x022d, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022f, code lost:
        r3 = r2.indexOf(" ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0236, code lost:
        if (r3 <= -1) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0238, code lost:
        r3 = r2.substring(r3 + 1);
        r5 = new nts.C3834(r3, f828.f3479.matcher(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x024d, code lost:
        if (r5.f1592 == false) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024f, code lost:
        r3 = r5.f1591.group(1);
        r4 = r5.f1591.group(3);
        r3.equalsIgnoreCase(nts.C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 980, 8, 58));
        r0.f834.add(new nts.C4221(r3, "", "", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0278, code lost:
        if (r5.m1684() != false) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x027a, code lost:
        r3 = r0.f867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x027c, code lost:
        if (r3 == null) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027e, code lost:
        r3.m3698(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0281, code lost:
        r0.f834.clear();
        r0.f841 = r0.f852;
        r0.f842 = r0.f879;
        r0.f849 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0292, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0294, code lost:
        if (r2 != r1) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0298, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02a8, code lost:
        if (r0.f849 != 20) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02aa, code lost:
        if (r2 != '-') goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ac, code lost:
        r0.f849 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02b2, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b4, code lost:
        if (r2 != r1) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b8, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f0, code lost:
        if (r0.f849 != 17) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f8, code lost:
        if ((r0.f862[r2] & 4) != 0) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02fc, code lost:
        if (r2 == '#') goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02fe, code lost:
        r3 = r0.f879;
        r0.f852 = r3;
        r0.f844 = r3 - 1;
        r3 = m826(r2);
        r0.f870.append(m827(r0.f842, r0.f871));
        r0.f870.append(r3);
        r3 = r0.f844;
        r0.f871 = r3;
        r0.f842 = r3;
        r0.f849 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0327, code lost:
        if (r2 == ';') goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0329, code lost:
        r0.f879--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0330, code lost:
        r0.f842 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0335, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0337, code lost:
        if (r2 != r1) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x033b, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x034a, code lost:
        if (r0.f849 != 16) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0352, code lost:
        if ((r0.f862[r2] & 4) != 0) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0356, code lost:
        if (r2 == '#') goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0358, code lost:
        r3 = r0.f879;
        r0.f852 = r3;
        r0.f844 = r3 - 1;
        r3 = m826(r2);
        r0.f870.append(m827(r0.f842, r0.f871));
        r0.f870.append(r3);
        r3 = r0.f844;
        r0.f871 = r3;
        r0.f842 = r3;
        r0.f849 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0381, code lost:
        if (r2 == ';') goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0383, code lost:
        r0.f879--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x038a, code lost:
        r0.f842 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x038f, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0391, code lost:
        if (r2 != r1) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0395, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03a4, code lost:
        if (r0.f849 != 15) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ac, code lost:
        if ((r0.f862[r2] & 4) != 0) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03b0, code lost:
        if (r2 == '#') goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03b2, code lost:
        r3 = r0.f879;
        r0.f852 = r3;
        r0.f844 = r3 - 1;
        r3 = m826(r2);
        r4 = r0.f871;
        r5 = r0.f842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03c1, code lost:
        if (r4 <= r5) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c3, code lost:
        r0.f870.append(m827(r5, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03cc, code lost:
        r0.f870.append(r3);
        r0.f849 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03d6, code lost:
        if (r2 == ';') goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03d8, code lost:
        r0.f879--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03df, code lost:
        r0.f842 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03e4, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03e6, code lost:
        if (r2 != r1) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03ea, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03f9, code lost:
        if (r0.f849 != 14) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0401, code lost:
        if ((r0.f862[r2] & 4) != 0) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0405, code lost:
        if (r2 == '#') goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0407, code lost:
        r4 = r0.f879;
        r0.f852 = r4;
        r0.f844 = r4 - 1;
        m819(0);
        r4 = m826(r2);
        r0.f847 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x041d, code lost:
        if (r4.length() > 0) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0420, code lost:
        r5 = r0.f867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0422, code lost:
        if (r5 == null) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0424, code lost:
        r5.m3693(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0429, code lost:
        if (r0.f848 == false) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x042b, code lost:
        r5 = r0.f869;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x042d, code lost:
        if (r5 == null) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x042f, code lost:
        r5.m2855(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0432, code lost:
        r0.f841 = r0.f852;
        r0.f843 = r0.f847;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x043a, code lost:
        r0.f849 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x043e, code lost:
        if (r2 == ';') goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0440, code lost:
        r0.f843--;
        r0.f879--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0452, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0454, code lost:
        if (r2 != r1) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0458, code lost:
        r5 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r5.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04c0, code lost:
        if (r0.f849 != 12) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04c4, code lost:
        if (r2 == '\"') goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04c8, code lost:
        if (r2 == '&') goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04cd, code lost:
        if (r0.f865 != false) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04d1, code lost:
        if (r0.f859 != false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04d3, code lost:
        r0.f859 = true;
        r0.f870.setLength(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04da, code lost:
        r3 = r0.f879;
        r0.f871 = r3 - 1;
        r0.f839 = r3;
        r0.f849 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04e7, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04e9, code lost:
        if (r2 != r1) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04ed, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04f8, code lost:
        r0.f871 = r0.f879 - 1;
        m843();
        r0.f849 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0507, code lost:
        if (r0.f849 != 11) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x050b, code lost:
        if (r2 == '&') goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x050f, code lost:
        if (r2 == '\'') goto L_0x0512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0512, code lost:
        r0.f871 = r0.f879 - 1;
        m843();
        r0.f849 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x051f, code lost:
        if (r0.f865 != false) goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0523, code lost:
        if (r0.f859 != false) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0525, code lost:
        r0.f859 = true;
        r0.f870.setLength(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x052c, code lost:
        r3 = r0.f879;
        r0.f871 = r3 - 1;
        r0.f839 = r3;
        r0.f849 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0539, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x053b, code lost:
        if (r2 != r1) goto L_0x053f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x053f, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x054f, code lost:
        if ((r0.f862[r2] & 1) == 0) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0551, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0553, code lost:
        if (r2 != r1) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0557, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0564, code lost:
        if (r2 == '<') goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0568, code lost:
        if (r0.f851 != false) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x056a, code lost:
        r3 = r0.f879 - 1;
        r0.f852 = r3;
        r0.f847 = r3;
        r0.f842 = r3;
        m819(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0576, code lost:
        r0.f849 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x057d, code lost:
        if (r0.f849 != 7) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x057f, code lost:
        if (r2 != '>') goto L_0x0585;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0581, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0585, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0587, code lost:
        if (r2 != '&') goto L_0x0592;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0589, code lost:
        r0.f849 = 15;
        r0.f839 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0597, code lost:
        if ((r0.f862[r2] & 1) != 0) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0599, code lost:
        if (r4 == false) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x059c, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x059e, code lost:
        if (r2 != r1) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05a2, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05ad, code lost:
        r3 = r0.f879;
        r0.f871 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05bc, code lost:
        if (r0.f833.charAt(r3 - 2) != '/') goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05be, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05c0, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05c1, code lost:
        if (r4 == false) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05c3, code lost:
        if (r3 == false) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05c5, code lost:
        r0.f871 = r0.f879 - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05ca, code lost:
        r0.f852 = r0.f879;
        m843();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05d1, code lost:
        if (r4 == false) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05d3, code lost:
        r0.f843 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05d7, code lost:
        if (r3 == false) goto L_0x05dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05d9, code lost:
        m834();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05dd, code lost:
        m848(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x05e0, code lost:
        r0.f849 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x05e3, code lost:
        r0.f849 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x05eb, code lost:
        if ((r0.f862[r2] & 1) == 0) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x05ed, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x05ef, code lost:
        if (r2 != r1) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05f3, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0600, code lost:
        if (r2 == '\"') goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0602, code lost:
        if (r2 == '>') goto L_0x0631;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0606, code lost:
        if (r2 == '&') goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x060a, code lost:
        if (r2 == '\'') goto L_0x0616;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        if (r0.f849 != 28) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x060c, code lost:
        r0.f842 = r0.f879 - 1;
        r0.f849 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0616, code lost:
        r0.f849 = 11;
        r0.f842 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0620, code lost:
        r0.f849 = 15;
        r0.f839 = r0.f879;
        r0.f859 = true;
        r0.f870.setLength(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0633, code lost:
        if (r0.f868 != false) goto L_0x0657;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0635, code lost:
        r2 = r0.f879;
        r0.f852 = r2;
        r0.f871 = r2 - 1;
        m843();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x064a, code lost:
        if (r0.f833.charAt(r0.f879 - 2) != '/') goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x064c, code lost:
        m834();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0650, code lost:
        m848(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0653, code lost:
        r0.f849 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0665, code lost:
        throw new nts.C3625((java.lang.Throwable) null, 204, nts.C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 1301, 19, 73));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0666, code lost:
        r0.f849 = 12;
        r0.f842 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0675, code lost:
        if ((r0.f862[r2] & 1) == 0) goto L_0x0688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0677, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0679, code lost:
        if (r2 != r1) goto L_0x067d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x067d, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0688, code lost:
        r3 = r0.f879;
        r4 = r3 - 1;
        r0.f842 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0690, code lost:
        if (r2 == '=') goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        if (r2 != ']') goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0692, code lost:
        if (r2 == '>') goto L_0x06a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0694, code lost:
        r0.f871 = r4;
        m843();
        r0.f842 = r0.f879 - 1;
        r0.f849 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06a3, code lost:
        r0.f852 = r3;
        r0.f871 = r4;
        m843();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06b5, code lost:
        if (r0.f833.charAt(r0.f879 - 2) != '/') goto L_0x06bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x06b7, code lost:
        m834();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x06bb, code lost:
        m848(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06be, code lost:
        r0.f849 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06c2, code lost:
        r0.f849 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06ca, code lost:
        if (r0.f849 != 4) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        r0.f849 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06d1, code lost:
        if ((r0.f862[r2] & 1) == 0) goto L_0x06d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06d3, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06d5, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06d6, code lost:
        if (r2 != '>') goto L_0x06da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06d8, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06da, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06dd, code lost:
        if (r2 != '=') goto L_0x06e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06df, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06e3, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x06e5, code lost:
        if (r2 != '/') goto L_0x06e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06e7, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06e9, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06ea, code lost:
        if (r3 != false) goto L_0x073f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06ec, code lost:
        if (r4 != false) goto L_0x073f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06ee, code lost:
        if (r7 != false) goto L_0x073f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06f0, code lost:
        if (r5 == false) goto L_0x06f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        if (r2 != r1) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06f7, code lost:
        if (m824() != false) goto L_0x072e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06ff, code lost:
        if ((r0.f862[r2] & 4) == 0) goto L_0x0702;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x072d, code lost:
        throw new nts.C3625(204, nts.C3855.m1792(1256, 18, 30) + r2 + nts.C3855.m1792(1274, 27, 89));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x072e, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0730, code lost:
        if (r2 != r1) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0734, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x073f, code lost:
        r0.f871 = r0.f879 - 1;
        m844();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0747, code lost:
        if (r3 == false) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c2, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0749, code lost:
        r0.f849 = 5;
        r0.f842 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0752, code lost:
        if (r7 == false) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0754, code lost:
        r0.f849 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0759, code lost:
        r0.f871 = r0.f879 - 1;
        m843();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0761, code lost:
        if (r4 == false) goto L_0x077d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0763, code lost:
        r3 = r0.f879;
        r0.f843 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0770, code lost:
        if (r0.f833.charAt(r3 - 2) != '/') goto L_0x0776;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0772, code lost:
        m834();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0776, code lost:
        m848(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0779, code lost:
        r0.f849 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x077d, code lost:
        r0.f849 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0787, code lost:
        if ((r0.f862[r2] & 1) != 0) goto L_0x078d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x078b, code lost:
        if (r2 != '/') goto L_0x0791;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0791, code lost:
        if (r2 != '>') goto L_0x07ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0793, code lost:
        r2 = r0.f879;
        r0.f852 = r2;
        r0.f843 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07a0, code lost:
        if (r0.f833.charAt(r2 - 2) != '/') goto L_0x07a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07a2, code lost:
        m834();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        if (r0.f849 != 27) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x07a6, code lost:
        m848(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x07a9, code lost:
        r0.f849 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x07b1, code lost:
        if (m824() != false) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07b8, code lost:
        if ((r0.f862[r2] & 2) == 0) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07e7, code lost:
        throw new nts.C3625((java.lang.Throwable) null, 204, nts.C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 1211, 18, 97) + r2 + nts.C3727.m1052("I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u", 1229, 27, 37));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x07e8, code lost:
        r0.f842 = r0.f879 - 1;
        r0.f849 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07f2, code lost:
        r2 = r0.f879;
        r0.f843 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x07f6, code lost:
        if (r2 != r1) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x07fa, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        if (r2 != '\"') goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d7, code lost:
        r0.f849 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
        if (r2 != r1) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x08e7, code lost:
        if (r0.f849 != 0) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x08eb, code lost:
        if (r2 == 10) goto L_0x0920;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x08ef, code lost:
        if (r2 == '&') goto L_0x090d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x08f3, code lost:
        if (r2 == '<') goto L_0x08f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x08f6, code lost:
        r5 = r0.f879;
        r7 = r5 - 1;
        r0.f852 = r7;
        r0.f847 = r7;
        r0.f842 = r5;
        m819(2);
        r0.f849 = 2;
        r0.f834 = new java.util.Vector();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0911, code lost:
        if (r0.f865 != false) goto L_0x0931;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0913, code lost:
        r5 = r0.f879;
        r0.f847 = r5 - 1;
        r0.f839 = r5;
        r0.f849 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0926, code lost:
        if (r0.f877 == false) goto L_0x0931;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0928, code lost:
        r2 = r0.f879;
        r0.f852 = r2;
        r0.f847 = r2;
        m819(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0931, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0933, code lost:
        if (r2 != r1) goto L_0x093d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x093d, code lost:
        r5 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r5.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f1, code lost:
        if (r0.f849 != 26) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f5, code lost:
        if (r2 != '\'') goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f7, code lost:
        r0.f849 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fc, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fe, code lost:
        if (r2 != r1) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0111, code lost:
        if (r0.f849 != 25) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0115, code lost:
        if (r2 != '[') goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0117, code lost:
        r0.f849 = 24;
        r2 = r0.f879;
        r0.f843 = r2;
        r0.f871 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0124, code lost:
        if (r2 != '>') goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0131, code lost:
        if (r0.f833.charAt(r0.f879 - 2) != ']') goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0133, code lost:
        r2 = r0.f879;
        r0.f852 = r2;
        r0.f871 = r2 - 2;
        m838();
        r0.f849 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0141, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0143, code lost:
        if (r2 != r1) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0147, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0156, code lost:
        if (r0.f849 != 24) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0158, code lost:
        if (r2 != '>') goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0165, code lost:
        if (r0.f833.charAt(r0.f879 - 2) != ']') goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0170, code lost:
        if (r0.f833.charAt(r0.f879 - 3) != ']') goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0172, code lost:
        r2 = r0.f879;
        r0.f852 = r2;
        r0.f847 = r2 - 3;
        m838();
        r0.f849 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0182, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0184, code lost:
        if (r2 != r1) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0188, code lost:
        r4 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r4.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0197, code lost:
        if (r0.f849 != 23) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019b, code lost:
        if (r2 == '\"') goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019f, code lost:
        if (r2 == '\'') goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a1, code lost:
        if (r2 == '>') goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a5, code lost:
        if (r2 == '[') goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a7, code lost:
        r2 = r0.f879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a9, code lost:
        if (r2 != r1) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ad, code lost:
        r3 = r0.f833;
        r0.f879 = r2 + 1;
        r2 = r3.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b8, code lost:
        r0.f849 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01bd, code lost:
        r3 = r0.f879;
        r0.f852 = r3;
        r0.f871 = r3 - 1;
        m819(0);
        r3 = m820();
        r4 = r0.f867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cd, code lost:
        if (r4 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01cf, code lost:
        r4.m3697(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d2, code lost:
        r0.f841 = r0.f852;
        r0.f849 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d9, code lost:
        r0.f849 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01de, code lost:
        r0.f849 = 27;
     */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x08a1  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x08ae  */
    /* renamed from: ⶊ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m846(int r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
        L_0x0004:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x000a
            goto L_0x0935
        L_0x000a:
            java.lang.StringBuilder r3 = r0.f833
            char r2 = r3.charAt(r2)
            int r3 = r0.f879
            int r4 = r3 + 1
            r0.f879 = r4
            int r5 = r0.f849
            r14 = 19
            r15 = 204(0xcc, float:2.86E-43)
            java.lang.String r7 = "I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u"
            r8 = 45
            r9 = 3
            r10 = 8
            r11 = 62
            r6 = 2
            r12 = 0
            r13 = 1
            switch(r5) {
                case 0: goto L_0x08e5;
                case 1: goto L_0x084e;
                case 2: goto L_0x0806;
                case 3: goto L_0x0782;
                case 4: goto L_0x06c7;
                case 5: goto L_0x0670;
                case 6: goto L_0x05e6;
                case 7: goto L_0x057a;
                case 8: goto L_0x054a;
                case 9: goto L_0x002b;
                case 10: goto L_0x002b;
                case 11: goto L_0x0503;
                case 12: goto L_0x04bc;
                case 13: goto L_0x0463;
                case 14: goto L_0x03f5;
                case 15: goto L_0x03a0;
                case 16: goto L_0x0346;
                case 17: goto L_0x02ec;
                case 18: goto L_0x02d3;
                case 19: goto L_0x02c3;
                case 20: goto L_0x02a4;
                case 21: goto L_0x0203;
                case 22: goto L_0x01e3;
                case 23: goto L_0x0193;
                case 24: goto L_0x0152;
                case 25: goto L_0x010d;
                case 26: goto L_0x00ed;
                case 27: goto L_0x00cd;
                case 28: goto L_0x00ad;
                case 29: goto L_0x04a6;
                case 30: goto L_0x009f;
                case 31: goto L_0x002c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0004
        L_0x002c:
            boolean r3 = r0.f856
            if (r3 == 0) goto L_0x006b
            if (r2 != r8) goto L_0x0035
            r0.f849 = r14
            goto L_0x0004
        L_0x0035:
            boolean r3 = java.lang.Character.isWhitespace(r2)
            if (r3 == 0) goto L_0x006b
            java.lang.StringBuilder r2 = r0.f833
            int r3 = r0.f879
            int r3 = r3 - r9
            char r2 = r2.charAt(r3)
            if (r2 != r8) goto L_0x0004
            java.lang.StringBuilder r2 = r0.f833
            int r3 = r0.f879
            int r3 = r3 - r6
            char r2 = r2.charAt(r3)
            if (r2 != r8) goto L_0x0004
            int r2 = r0.f879
            r0.f852 = r2
            int r2 = r2 - r9
            r0.f871 = r2
            r0.m819(r12)
            java.lang.String r2 = r16.m820()
            nts.ⷛ r3 = r0.f867
            if (r3 == 0) goto L_0x0066
            r3.m3688(r2)
        L_0x0066:
            int r2 = r0.f852
            r0.f841 = r2
            goto L_0x0004
        L_0x006b:
            if (r2 != r11) goto L_0x008e
            int r2 = r0.f879
            r0.f852 = r2
            int r2 = r2 - r9
            r0.f871 = r2
            r0.m819(r12)
            java.lang.String r2 = r16.m820()
            nts.ⷛ r3 = r0.f867
            if (r3 == 0) goto L_0x0082
            r3.m3688(r2)
        L_0x0082:
            int r2 = r0.f852
            r0.f841 = r2
            int r2 = r0.f879
            r0.f843 = r2
            r0.f849 = r10
            goto L_0x0004
        L_0x008e:
            nts.Ԕ r1 = new nts.Ԕ
            r2 = 53
            r3 = 25
            r4 = 1126(0x466, float:1.578E-42)
            java.lang.String r2 = nts.C3727.m1052((java.lang.String) r7, (int) r4, (int) r2, (int) r3)
            r3 = 0
            r1.<init>(r3, r15, r2)
            throw r1
        L_0x009f:
            if (r2 != r8) goto L_0x00a7
            r2 = 31
            r0.f849 = r2
            goto L_0x0004
        L_0x00a7:
            r2 = 20
            r0.f849 = r2
            goto L_0x0004
        L_0x00ad:
            int r3 = r0.f849
            r4 = 28
            if (r3 != r4) goto L_0x0004
            r3 = 93
            if (r2 != r3) goto L_0x00bc
            r3 = 23
            r0.f849 = r3
            goto L_0x00ad
        L_0x00bc:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x00c2
            goto L_0x0935
        L_0x00c2:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x00ad
        L_0x00cd:
            int r3 = r0.f849
            r4 = 27
            if (r3 != r4) goto L_0x0004
            r3 = 34
            if (r2 != r3) goto L_0x00dc
            r3 = 23
            r0.f849 = r3
            goto L_0x00cd
        L_0x00dc:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x00e2
            goto L_0x0935
        L_0x00e2:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x00cd
        L_0x00ed:
            int r3 = r0.f849
            r4 = 26
            if (r3 != r4) goto L_0x0004
            r3 = 39
            if (r2 != r3) goto L_0x00fc
            r3 = 23
            r0.f849 = r3
            goto L_0x00ed
        L_0x00fc:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x0102
            goto L_0x0935
        L_0x0102:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x00ed
        L_0x010d:
            int r3 = r0.f849
            r4 = 25
            if (r3 != r4) goto L_0x0004
            r3 = 91
            if (r2 != r3) goto L_0x0124
            r2 = 24
            r0.f849 = r2
            int r2 = r0.f879
            r0.f843 = r2
            int r2 = r2 - r13
            r0.f871 = r2
            goto L_0x0004
        L_0x0124:
            if (r2 != r11) goto L_0x0141
            java.lang.StringBuilder r2 = r0.f833
            int r3 = r0.f879
            int r3 = r3 - r6
            char r2 = r2.charAt(r3)
            r3 = 93
            if (r2 != r3) goto L_0x0141
            int r2 = r0.f879
            r0.f852 = r2
            int r2 = r2 - r6
            r0.f871 = r2
            r16.m838()
            r0.f849 = r12
            goto L_0x0004
        L_0x0141:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x0147
            goto L_0x0935
        L_0x0147:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x010d
        L_0x0152:
            int r3 = r0.f849
            r4 = 24
            if (r3 != r4) goto L_0x0004
            if (r2 != r11) goto L_0x0180
            java.lang.StringBuilder r2 = r0.f833
            int r3 = r0.f879
            int r3 = r3 - r6
            char r2 = r2.charAt(r3)
            r3 = 93
            if (r2 != r3) goto L_0x0182
            java.lang.StringBuilder r2 = r0.f833
            int r4 = r0.f879
            int r4 = r4 - r9
            char r2 = r2.charAt(r4)
            if (r2 != r3) goto L_0x0182
            int r2 = r0.f879
            r0.f852 = r2
            int r2 = r2 - r9
            r0.f847 = r2
            r16.m838()
            r0.f849 = r12
            goto L_0x0004
        L_0x0180:
            r3 = 93
        L_0x0182:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x0188
            goto L_0x0935
        L_0x0188:
            java.lang.StringBuilder r4 = r0.f833
            int r5 = r2 + 1
            r0.f879 = r5
            char r2 = r4.charAt(r2)
            goto L_0x0152
        L_0x0193:
            int r3 = r0.f849
            r4 = 23
            if (r3 != r4) goto L_0x0004
            r3 = 34
            if (r2 == r3) goto L_0x01de
            r3 = 39
            if (r2 == r3) goto L_0x01d9
            if (r2 == r11) goto L_0x01bd
            r3 = 91
            if (r2 == r3) goto L_0x01b8
            int r2 = r0.f879
            if (r2 != r1) goto L_0x01ad
            goto L_0x0935
        L_0x01ad:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x0193
        L_0x01b8:
            r3 = 28
            r0.f849 = r3
            goto L_0x0193
        L_0x01bd:
            int r3 = r0.f879
            r0.f852 = r3
            int r3 = r3 - r13
            r0.f871 = r3
            r0.m819(r12)
            java.lang.String r3 = r16.m820()
            nts.ⷛ r4 = r0.f867
            if (r4 == 0) goto L_0x01d2
            r4.m3697(r3)
        L_0x01d2:
            int r3 = r0.f852
            r0.f841 = r3
            r0.f849 = r10
            goto L_0x0193
        L_0x01d9:
            r3 = 26
            r0.f849 = r3
            goto L_0x0193
        L_0x01de:
            r3 = 27
            r0.f849 = r3
            goto L_0x0193
        L_0x01e3:
            if (r2 == r8) goto L_0x01ff
            if (r2 == r11) goto L_0x01f9
            r3 = 91
            if (r2 == r3) goto L_0x01f1
            r2 = 23
            r0.f849 = r2
            goto L_0x0004
        L_0x01f1:
            r0.f842 = r4
            r2 = 25
            r0.f849 = r2
            goto L_0x0004
        L_0x01f9:
            r0.f843 = r4
            r0.f849 = r10
            goto L_0x0004
        L_0x01ff:
            r0.f849 = r14
            goto L_0x0004
        L_0x0203:
            int r3 = r0.f849
            r4 = 21
            if (r3 != r4) goto L_0x0004
            if (r2 != r11) goto L_0x0292
            java.lang.StringBuilder r2 = r0.f833
            int r3 = r0.f879
            int r3 = r3 - r6
            char r2 = r2.charAt(r3)
            r3 = 63
            if (r2 != r3) goto L_0x0292
            int r2 = r0.f879
            r0.f852 = r2
            int r2 = r2 - r6
            r0.f871 = r2
            r0.m819(r12)
            int r2 = r0.f842
            int r3 = r0.f871
            if (r2 >= r3) goto L_0x022d
            java.lang.String r2 = r0.m827((int) r2, (int) r3)
            goto L_0x022f
        L_0x022d:
            java.lang.String r2 = ""
        L_0x022f:
            java.lang.String r3 = " "
            int r3 = r2.indexOf(r3)
            r4 = -1
            if (r3 <= r4) goto L_0x027a
            int r3 = r3 + 1
            java.lang.String r3 = r2.substring(r3)
            nts.ỽ r4 = f828
            nts.ዉ r5 = new nts.ዉ
            java.util.regex.Pattern r4 = r4.f3479
            java.util.regex.Matcher r4 = r4.matcher(r3)
            r5.<init>(r3, r4)
            boolean r3 = r5.f1592
            if (r3 == 0) goto L_0x027a
        L_0x024f:
            java.util.regex.Matcher r3 = r5.f1591
            java.lang.String r3 = r3.group(r13)
            java.util.regex.Matcher r4 = r5.f1591
            java.lang.String r4 = r4.group(r9)
            r6 = 980(0x3d4, float:1.373E-42)
            r8 = 58
            java.lang.String r6 = nts.C3727.m1052((java.lang.String) r7, (int) r6, (int) r10, (int) r8)
            r3.equalsIgnoreCase(r6)
            java.util.Vector r6 = r0.f834
            nts.ㄤ r8 = new nts.ㄤ
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r8.<init>(r3, r11, r12, r4)
            r6.add(r8)
            boolean r3 = r5.m1684()
            if (r3 != 0) goto L_0x024f
        L_0x027a:
            nts.ⷛ r3 = r0.f867
            if (r3 == 0) goto L_0x0281
            r3.m3698(r2)
        L_0x0281:
            java.util.Vector r2 = r0.f834
            r2.clear()
            int r2 = r0.f852
            r0.f841 = r2
            int r2 = r0.f879
            r0.f842 = r2
            r0.f849 = r10
            goto L_0x0004
        L_0x0292:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x0298
            goto L_0x0935
        L_0x0298:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x0203
        L_0x02a4:
            int r3 = r0.f849
            r4 = 20
            if (r3 != r4) goto L_0x0004
            if (r2 != r8) goto L_0x02b2
            r2 = 30
            r0.f849 = r2
            goto L_0x0004
        L_0x02b2:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x02b8
            goto L_0x0935
        L_0x02b8:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x02a4
        L_0x02c3:
            if (r2 != r8) goto L_0x02cd
            r0.f842 = r4
            r2 = 20
            r0.f849 = r2
            goto L_0x0004
        L_0x02cd:
            r2 = 23
            r0.f849 = r2
            goto L_0x0004
        L_0x02d3:
            boolean r3 = r0.f868
            if (r3 != 0) goto L_0x02dd
            if (r2 != r11) goto L_0x0004
            r0.f849 = r12
            goto L_0x0004
        L_0x02dd:
            nts.Ԕ r1 = new nts.Ԕ
            r2 = 1320(0x528, float:1.85E-42)
            r3 = 114(0x72, float:1.6E-43)
            java.lang.String r2 = nts.C3727.m1052((java.lang.String) r7, (int) r2, (int) r14, (int) r3)
            r3 = 0
            r1.<init>(r3, r15, r2)
            throw r1
        L_0x02ec:
            int r3 = r0.f849
            r4 = 17
            if (r3 != r4) goto L_0x0004
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r4 = 4
            r3 = r3 & r4
            if (r3 != 0) goto L_0x0335
            r3 = 35
            if (r2 == r3) goto L_0x0335
            int r3 = r0.f879
            r0.f852 = r3
            int r3 = r3 - r13
            r0.f844 = r3
            java.lang.String r3 = r0.m826((char) r2)
            java.lang.StringBuffer r4 = r0.f870
            int r5 = r0.f842
            int r6 = r0.f871
            java.lang.String r5 = r0.m827((int) r5, (int) r6)
            r4.append(r5)
            java.lang.StringBuffer r4 = r0.f870
            r4.append(r3)
            int r3 = r0.f844
            r0.f871 = r3
            r0.f842 = r3
            r3 = 12
            r0.f849 = r3
            r3 = 59
            if (r2 == r3) goto L_0x0330
            int r2 = r0.f879
            int r2 = r2 - r13
            r0.f879 = r2
            goto L_0x0004
        L_0x0330:
            int r3 = r0.f879
            r0.f842 = r3
            goto L_0x02ec
        L_0x0335:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x033b
            goto L_0x0935
        L_0x033b:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x02ec
        L_0x0346:
            int r3 = r0.f849
            r4 = 16
            if (r3 != r4) goto L_0x0004
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r4 = 4
            r3 = r3 & r4
            if (r3 != 0) goto L_0x038f
            r3 = 35
            if (r2 == r3) goto L_0x038f
            int r3 = r0.f879
            r0.f852 = r3
            int r3 = r3 - r13
            r0.f844 = r3
            java.lang.String r3 = r0.m826((char) r2)
            java.lang.StringBuffer r4 = r0.f870
            int r5 = r0.f842
            int r6 = r0.f871
            java.lang.String r5 = r0.m827((int) r5, (int) r6)
            r4.append(r5)
            java.lang.StringBuffer r4 = r0.f870
            r4.append(r3)
            int r3 = r0.f844
            r0.f871 = r3
            r0.f842 = r3
            r3 = 11
            r0.f849 = r3
            r3 = 59
            if (r2 == r3) goto L_0x038a
            int r2 = r0.f879
            int r2 = r2 - r13
            r0.f879 = r2
            goto L_0x0004
        L_0x038a:
            int r3 = r0.f879
            r0.f842 = r3
            goto L_0x0346
        L_0x038f:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x0395
            goto L_0x0935
        L_0x0395:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x0346
        L_0x03a0:
            int r3 = r0.f849
            r4 = 15
            if (r3 != r4) goto L_0x0004
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r4 = 4
            r3 = r3 & r4
            if (r3 != 0) goto L_0x03e4
            r3 = 35
            if (r2 == r3) goto L_0x03e4
            int r3 = r0.f879
            r0.f852 = r3
            int r3 = r3 - r13
            r0.f844 = r3
            java.lang.String r3 = r0.m826((char) r2)
            int r4 = r0.f871
            int r5 = r0.f842
            if (r4 <= r5) goto L_0x03cc
            java.lang.StringBuffer r6 = r0.f870
            java.lang.String r4 = r0.m827((int) r5, (int) r4)
            r6.append(r4)
        L_0x03cc:
            java.lang.StringBuffer r4 = r0.f870
            r4.append(r3)
            r3 = 7
            r0.f849 = r3
            r3 = 59
            if (r2 == r3) goto L_0x03df
            int r2 = r0.f879
            int r2 = r2 - r13
            r0.f879 = r2
            goto L_0x0004
        L_0x03df:
            int r3 = r0.f879
            r0.f842 = r3
            goto L_0x03a0
        L_0x03e4:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x03ea
            goto L_0x0935
        L_0x03ea:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x03a0
        L_0x03f5:
            int r3 = r0.f849
            r4 = 14
            if (r3 != r4) goto L_0x0004
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r4 = 4
            r3 = r3 & r4
            if (r3 != 0) goto L_0x044f
            r3 = 35
            if (r2 == r3) goto L_0x044c
            int r4 = r0.f879
            r0.f852 = r4
            int r4 = r4 - r13
            r0.f844 = r4
            r0.m819(r12)
            java.lang.String r4 = r0.m826((char) r2)
            int r5 = r0.f879
            r0.f847 = r5
            int r5 = r4.length()
            if (r5 > 0) goto L_0x0420
            goto L_0x043a
        L_0x0420:
            nts.ⷛ r5 = r0.f867
            if (r5 == 0) goto L_0x0427
            r5.m3693(r4)
        L_0x0427:
            boolean r5 = r0.f848
            if (r5 == 0) goto L_0x0432
            nts.ᵪ r5 = r0.f869
            if (r5 == 0) goto L_0x0432
            r5.m2855((java.lang.String) r4)
        L_0x0432:
            int r4 = r0.f852
            r0.f841 = r4
            int r4 = r0.f847
            r0.f843 = r4
        L_0x043a:
            r0.f849 = r12
            r4 = 59
            if (r2 == r4) goto L_0x03f5
            int r2 = r0.f843
            int r2 = r2 - r13
            r0.f843 = r2
            int r2 = r0.f879
            int r2 = r2 - r13
            r0.f879 = r2
            goto L_0x0004
        L_0x044c:
            r4 = 59
            goto L_0x0452
        L_0x044f:
            r3 = 35
            goto L_0x044c
        L_0x0452:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x0458
            goto L_0x0935
        L_0x0458:
            java.lang.StringBuilder r5 = r0.f833
            int r6 = r2 + 1
            r0.f879 = r6
            char r2 = r5.charAt(r2)
            goto L_0x03f5
        L_0x0463:
            java.lang.StringBuilder r4 = r0.f833
            int r3 = r3 + -1
            char r3 = r4.charAt(r3)
            r4 = 47
            if (r3 != r4) goto L_0x0484
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r3 = r3 & r6
            if (r3 != 0) goto L_0x0484
            int r2 = r0.f843
            int r2 = r2 - r13
            r0.f843 = r2
            r0.f849 = r12
            int r2 = r0.f879
            int r2 = r2 - r13
            r0.f879 = r2
            goto L_0x0004
        L_0x0484:
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r4 = 4
            r3 = r3 & r4
            if (r3 == 0) goto L_0x049d
            int r2 = r0.f879
            if (r2 != r1) goto L_0x0492
            goto L_0x0935
        L_0x0492:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x0484
        L_0x049d:
            r3 = 29
            r0.f849 = r3
            int r3 = r0.f879
            int r3 = r3 - r13
            r0.f871 = r3
        L_0x04a6:
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r3 = r3 & r13
            if (r3 != 0) goto L_0x0004
            int r3 = r0.f879
            r0.f852 = r3
            r0.m847((boolean) r12)
            if (r2 == r11) goto L_0x04b8
            r10 = 18
        L_0x04b8:
            r0.f849 = r10
            goto L_0x0004
        L_0x04bc:
            int r3 = r0.f849
            r4 = 12
            if (r3 != r4) goto L_0x0004
            r3 = 34
            if (r2 == r3) goto L_0x04f8
            r3 = 38
            if (r2 == r3) goto L_0x04cb
            goto L_0x04e7
        L_0x04cb:
            boolean r3 = r0.f865
            if (r3 != 0) goto L_0x04e7
            boolean r3 = r0.f859
            if (r3 != 0) goto L_0x04da
            r0.f859 = r13
            java.lang.StringBuffer r3 = r0.f870
            r3.setLength(r12)
        L_0x04da:
            int r3 = r0.f879
            int r4 = r3 + -1
            r0.f871 = r4
            r0.f839 = r3
            r3 = 17
            r0.f849 = r3
            goto L_0x04bc
        L_0x04e7:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x04ed
            goto L_0x0935
        L_0x04ed:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x04bc
        L_0x04f8:
            int r3 = r0.f879
            int r3 = r3 - r13
            r0.f871 = r3
            r16.m843()
            r0.f849 = r9
            goto L_0x04bc
        L_0x0503:
            int r3 = r0.f849
            r4 = 11
            if (r3 != r4) goto L_0x0004
            r3 = 38
            if (r2 == r3) goto L_0x051d
            r3 = 39
            if (r2 == r3) goto L_0x0512
            goto L_0x0539
        L_0x0512:
            int r3 = r0.f879
            int r3 = r3 - r13
            r0.f871 = r3
            r16.m843()
            r0.f849 = r9
            goto L_0x0503
        L_0x051d:
            boolean r3 = r0.f865
            if (r3 != 0) goto L_0x0539
            boolean r3 = r0.f859
            if (r3 != 0) goto L_0x052c
            r0.f859 = r13
            java.lang.StringBuffer r3 = r0.f870
            r3.setLength(r12)
        L_0x052c:
            int r3 = r0.f879
            int r4 = r3 + -1
            r0.f871 = r4
            r0.f839 = r3
            r3 = 16
            r0.f849 = r3
            goto L_0x0503
        L_0x0539:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x053f
            goto L_0x0935
        L_0x053f:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x0503
        L_0x054a:
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r3 = r3 & r13
            if (r3 == 0) goto L_0x0562
            int r2 = r0.f879
            if (r2 != r1) goto L_0x0557
            goto L_0x0935
        L_0x0557:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x054a
        L_0x0562:
            r3 = 60
            if (r2 == r3) goto L_0x056a
            boolean r3 = r0.f851
            if (r3 != 0) goto L_0x0576
        L_0x056a:
            int r3 = r0.f879
            int r3 = r3 - r13
            r0.f852 = r3
            r0.f847 = r3
            r0.f842 = r3
            r0.m819(r13)
        L_0x0576:
            r0.f849 = r12
            goto L_0x08e5
        L_0x057a:
            int r3 = r0.f849
            r4 = 7
            if (r3 != r4) goto L_0x0004
            if (r2 != r11) goto L_0x0585
            r4 = r13
        L_0x0582:
            r3 = 38
            goto L_0x0587
        L_0x0585:
            r4 = r12
            goto L_0x0582
        L_0x0587:
            if (r2 != r3) goto L_0x0592
            r3 = 15
            r0.f849 = r3
            int r3 = r0.f879
            r0.f839 = r3
            goto L_0x057a
        L_0x0592:
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r3 = r3 & r13
            if (r3 != 0) goto L_0x05ad
            if (r4 == 0) goto L_0x059c
            goto L_0x05ad
        L_0x059c:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x05a2
            goto L_0x0935
        L_0x05a2:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x057a
        L_0x05ad:
            int r3 = r0.f879
            int r5 = r3 + -1
            r0.f871 = r5
            java.lang.StringBuilder r5 = r0.f833
            int r3 = r3 - r6
            char r3 = r5.charAt(r3)
            r5 = 47
            if (r3 != r5) goto L_0x05c0
            r3 = r13
            goto L_0x05c1
        L_0x05c0:
            r3 = r12
        L_0x05c1:
            if (r4 == 0) goto L_0x05ca
            if (r3 == 0) goto L_0x05ca
            int r5 = r0.f879
            int r5 = r5 - r6
            r0.f871 = r5
        L_0x05ca:
            int r5 = r0.f879
            r0.f852 = r5
            r16.m843()
            if (r4 == 0) goto L_0x05e3
            int r4 = r0.f879
            r0.f843 = r4
            if (r3 == 0) goto L_0x05dd
            r16.m834()
            goto L_0x05e0
        L_0x05dd:
            r0.m848(r12)
        L_0x05e0:
            r0.f849 = r10
            goto L_0x057a
        L_0x05e3:
            r0.f849 = r9
            goto L_0x057a
        L_0x05e6:
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r3 = r3 & r13
            if (r3 == 0) goto L_0x05fe
            int r2 = r0.f879
            if (r2 != r1) goto L_0x05f3
            goto L_0x0935
        L_0x05f3:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x05e6
        L_0x05fe:
            r3 = 34
            if (r2 == r3) goto L_0x0666
            if (r2 == r11) goto L_0x0631
            r3 = 38
            if (r2 == r3) goto L_0x0620
            r3 = 39
            if (r2 == r3) goto L_0x0616
            int r2 = r0.f879
            int r2 = r2 - r13
            r0.f842 = r2
            r2 = 7
            r0.f849 = r2
            goto L_0x0004
        L_0x0616:
            r2 = 11
            r0.f849 = r2
            int r2 = r0.f879
            r0.f842 = r2
            goto L_0x0004
        L_0x0620:
            r2 = 15
            r0.f849 = r2
            int r2 = r0.f879
            r0.f839 = r2
            r0.f859 = r13
            java.lang.StringBuffer r2 = r0.f870
            r2.setLength(r12)
            goto L_0x0004
        L_0x0631:
            boolean r2 = r0.f868
            if (r2 != 0) goto L_0x0657
            int r2 = r0.f879
            r0.f852 = r2
            int r2 = r2 - r13
            r0.f871 = r2
            r16.m843()
            java.lang.StringBuilder r2 = r0.f833
            int r3 = r0.f879
            int r3 = r3 - r6
            char r2 = r2.charAt(r3)
            r3 = 47
            if (r2 != r3) goto L_0x0650
            r16.m834()
            goto L_0x0653
        L_0x0650:
            r0.m848(r12)
        L_0x0653:
            r0.f849 = r10
            goto L_0x0004
        L_0x0657:
            nts.Ԕ r1 = new nts.Ԕ
            r2 = 1301(0x515, float:1.823E-42)
            r3 = 73
            java.lang.String r2 = nts.C3727.m1052((java.lang.String) r7, (int) r2, (int) r14, (int) r3)
            r3 = 0
            r1.<init>(r3, r15, r2)
            throw r1
        L_0x0666:
            r2 = 12
            r0.f849 = r2
            int r2 = r0.f879
            r0.f842 = r2
            goto L_0x0004
        L_0x0670:
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r3 = r3 & r13
            if (r3 == 0) goto L_0x0688
            int r2 = r0.f879
            if (r2 != r1) goto L_0x067d
            goto L_0x0935
        L_0x067d:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x0670
        L_0x0688:
            int r3 = r0.f879
            int r4 = r3 + -1
            r0.f842 = r4
            r5 = 61
            if (r2 == r5) goto L_0x06c2
            if (r2 == r11) goto L_0x06a3
            r0.f871 = r4
            r16.m843()
            int r2 = r0.f879
            int r2 = r2 - r13
            r0.f842 = r2
            r2 = 4
            r0.f849 = r2
            goto L_0x0004
        L_0x06a3:
            r0.f852 = r3
            r0.f871 = r4
            r16.m843()
            java.lang.StringBuilder r2 = r0.f833
            int r3 = r0.f879
            int r3 = r3 - r6
            char r2 = r2.charAt(r3)
            r3 = 47
            if (r2 != r3) goto L_0x06bb
            r16.m834()
            goto L_0x06be
        L_0x06bb:
            r0.m848(r12)
        L_0x06be:
            r0.f849 = r10
            goto L_0x0004
        L_0x06c2:
            r2 = 6
            r0.f849 = r2
            goto L_0x0004
        L_0x06c7:
            int r3 = r0.f849
            r4 = 4
            if (r3 != r4) goto L_0x0004
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r3 = r3 & r13
            if (r3 == 0) goto L_0x06d5
            r3 = r13
            goto L_0x06d6
        L_0x06d5:
            r3 = r12
        L_0x06d6:
            if (r2 != r11) goto L_0x06da
            r4 = r13
            goto L_0x06db
        L_0x06da:
            r4 = r12
        L_0x06db:
            r5 = 61
            if (r2 != r5) goto L_0x06e3
            r7 = r13
        L_0x06e0:
            r5 = 47
            goto L_0x06e5
        L_0x06e3:
            r7 = r12
            goto L_0x06e0
        L_0x06e5:
            if (r2 != r5) goto L_0x06e9
            r5 = r13
            goto L_0x06ea
        L_0x06e9:
            r5 = r12
        L_0x06ea:
            if (r3 != 0) goto L_0x073f
            if (r4 != 0) goto L_0x073f
            if (r7 != 0) goto L_0x073f
            if (r5 == 0) goto L_0x06f3
            goto L_0x073f
        L_0x06f3:
            boolean r3 = r16.m824()
            if (r3 != 0) goto L_0x072e
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r4 = 4
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0702
            goto L_0x072e
        L_0x0702:
            nts.Ԕ r1 = new nts.Ԕ
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 18
            r5 = 30
            r6 = 1256(0x4e8, float:1.76E-42)
            java.lang.String r4 = nts.C3855.m1792(r6, r4, r5)
            r3.append(r4)
            r3.append(r2)
            r2 = 1274(0x4fa, float:1.785E-42)
            r4 = 89
            r5 = 27
            java.lang.String r2 = nts.C3855.m1792(r2, r5, r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>((int) r15, (java.lang.String) r2)
            throw r1
        L_0x072e:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x0734
            goto L_0x0935
        L_0x0734:
            java.lang.StringBuilder r3 = r0.f833
            int r4 = r2 + 1
            r0.f879 = r4
            char r2 = r3.charAt(r2)
            goto L_0x06c7
        L_0x073f:
            int r5 = r0.f879
            int r5 = r5 - r13
            r0.f871 = r5
            r16.m844()
            if (r3 == 0) goto L_0x0752
            r3 = 5
            r0.f849 = r3
            int r3 = r0.f879
            r0.f842 = r3
            goto L_0x06c7
        L_0x0752:
            if (r7 == 0) goto L_0x0759
            r3 = 6
            r0.f849 = r3
            goto L_0x06c7
        L_0x0759:
            int r3 = r0.f879
            int r3 = r3 - r13
            r0.f871 = r3
            r16.m843()
            if (r4 == 0) goto L_0x077d
            int r3 = r0.f879
            r0.f843 = r3
            java.lang.StringBuilder r4 = r0.f833
            int r3 = r3 - r6
            char r3 = r4.charAt(r3)
            r4 = 47
            if (r3 != r4) goto L_0x0776
            r16.m834()
            goto L_0x0779
        L_0x0776:
            r0.m848(r12)
        L_0x0779:
            r0.f849 = r10
            goto L_0x06c7
        L_0x077d:
            r3 = 5
            r0.f849 = r3
            goto L_0x06c7
        L_0x0782:
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r3 = r3 & r13
            if (r3 != 0) goto L_0x078d
            r3 = 47
            if (r2 != r3) goto L_0x0791
        L_0x078d:
            r4 = 0
            r5 = 27
            goto L_0x07f2
        L_0x0791:
            if (r2 != r11) goto L_0x07ad
            int r2 = r0.f879
            r0.f852 = r2
            r0.f843 = r2
            java.lang.StringBuilder r4 = r0.f833
            int r2 = r2 - r6
            char r2 = r4.charAt(r2)
            if (r2 != r3) goto L_0x07a6
            r16.m834()
            goto L_0x07a9
        L_0x07a6:
            r0.m848(r12)
        L_0x07a9:
            r0.f849 = r10
            goto L_0x0004
        L_0x07ad:
            boolean r3 = r16.m824()
            if (r3 != 0) goto L_0x07e8
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r3 = r3 & r6
            if (r3 == 0) goto L_0x07bb
            goto L_0x07e8
        L_0x07bb:
            nts.Ԕ r1 = new nts.Ԕ
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 18
            r5 = 97
            r6 = 1211(0x4bb, float:1.697E-42)
            java.lang.String r4 = nts.C3727.m1052((java.lang.String) r7, (int) r6, (int) r4, (int) r5)
            r3.append(r4)
            r3.append(r2)
            r2 = 1229(0x4cd, float:1.722E-42)
            r4 = 37
            r5 = 27
            java.lang.String r2 = nts.C3727.m1052((java.lang.String) r7, (int) r2, (int) r5, (int) r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r4 = 0
            r1.<init>(r4, r15, r2)
            throw r1
        L_0x07e8:
            int r2 = r0.f879
            int r2 = r2 - r13
            r0.f842 = r2
            r2 = 4
            r0.f849 = r2
            goto L_0x0004
        L_0x07f2:
            int r2 = r0.f879
            r0.f843 = r2
            if (r2 != r1) goto L_0x07fa
            goto L_0x0935
        L_0x07fa:
            java.lang.StringBuilder r3 = r0.f833
            int r8 = r2 + 1
            r0.f879 = r8
            char r2 = r3.charAt(r2)
            goto L_0x0782
        L_0x0806:
            int r4 = r3 + -1
            r0.f863 = r4
            byte[] r5 = r0.f862
            byte r5 = r5[r2]
            r5 = r5 & r6
            if (r5 != 0) goto L_0x084c
            r5 = 47
            if (r2 == r5) goto L_0x084c
            r5 = 63
            if (r2 == r5) goto L_0x084c
            r5 = 33
            if (r2 == r5) goto L_0x084c
            r0.f843 = r4
            r0.f849 = r12
            r0.f879 = r3
            boolean r2 = r16.m824()
            if (r2 != 0) goto L_0x0004
            boolean r2 = r0.f878
            if (r2 == 0) goto L_0x0004
            java.lang.StringBuilder r2 = r0.f833
            int r3 = r0.f879
            int r3 = r3 - r13
            char r2 = r2.charAt(r3)
            r3 = 60
            if (r2 == r3) goto L_0x083c
            goto L_0x0004
        L_0x083c:
            nts.Ԕ r1 = new nts.Ԕ
            r2 = 32
            r3 = 78
            r4 = 1179(0x49b, float:1.652E-42)
            java.lang.String r2 = nts.C3727.m1052((java.lang.String) r7, (int) r4, (int) r2, (int) r3)
            r1.<init>((int) r15, (java.lang.String) r2)
            throw r1
        L_0x084c:
            r0.f849 = r13
        L_0x084e:
            int r3 = r0.f849
            if (r3 != r13) goto L_0x0004
            byte[] r3 = r0.f862
            byte r3 = r3[r2]
            r4 = 4
            r3 = r3 & r4
            if (r3 == 0) goto L_0x086b
            int r2 = r0.f879
            if (r2 != r1) goto L_0x0860
            goto L_0x0935
        L_0x0860:
            java.lang.StringBuilder r3 = r0.f833
            int r5 = r2 + 1
            r0.f879 = r5
            char r2 = r3.charAt(r2)
            goto L_0x084e
        L_0x086b:
            int r3 = r0.f879
            r0.f852 = r3
            r5 = 33
            if (r2 == r5) goto L_0x08d8
            r5 = 47
            if (r2 == r5) goto L_0x0888
            r5 = 63
            if (r2 == r5) goto L_0x087c
            goto L_0x089d
        L_0x087c:
            r0.f842 = r3
            r0.m819(r12)
            r3 = 21
            r0.f849 = r3
        L_0x0885:
            r5 = 47
            goto L_0x084e
        L_0x0888:
            java.lang.StringBuilder r5 = r0.f833
            int r3 = r3 + -2
            char r3 = r5.charAt(r3)
            r5 = 60
            if (r3 != r5) goto L_0x089d
            r3 = 13
            r0.f849 = r3
            int r3 = r0.f879
            r0.f842 = r3
            goto L_0x0885
        L_0x089d:
            boolean r3 = r0.f864
            if (r3 == 0) goto L_0x08ae
            int r3 = r0.f843
            int r3 = r3 - r13
            r0.f843 = r3
            r0.f849 = r12
            int r3 = r0.f879
            int r3 = r3 - r13
            r0.f879 = r3
            goto L_0x0885
        L_0x08ae:
            int r3 = r0.f879
            int r3 = r3 - r13
            r0.f871 = r3
            r16.m833()
            if (r2 != r11) goto L_0x08d2
            int r3 = r0.f879
            r0.f843 = r3
            java.lang.StringBuilder r5 = r0.f833
            int r3 = r3 - r6
            char r3 = r5.charAt(r3)
            r5 = 47
            if (r3 != r5) goto L_0x08cb
            r16.m834()
            goto L_0x08ce
        L_0x08cb:
            r0.m848(r12)
        L_0x08ce:
            r0.f849 = r10
            goto L_0x084e
        L_0x08d2:
            r5 = 47
            r0.f849 = r9
            goto L_0x084e
        L_0x08d8:
            r5 = 47
            r0.f842 = r3
            r0.m819(r12)
            r3 = 22
            r0.f849 = r3
            goto L_0x084e
        L_0x08e5:
            int r3 = r0.f849
            if (r3 != 0) goto L_0x0004
            r3 = 10
            if (r2 == r3) goto L_0x0920
            r3 = 38
            if (r2 == r3) goto L_0x090d
            r4 = 60
            if (r2 == r4) goto L_0x08f6
            goto L_0x0931
        L_0x08f6:
            int r5 = r0.f879
            int r7 = r5 + -1
            r0.f852 = r7
            r0.f847 = r7
            r0.f842 = r5
            r0.m819(r6)
            r0.f849 = r6
            java.util.Vector r5 = new java.util.Vector
            r5.<init>()
            r0.f834 = r5
            goto L_0x08e5
        L_0x090d:
            r4 = 60
            boolean r5 = r0.f865
            if (r5 != 0) goto L_0x0931
            int r5 = r0.f879
            int r7 = r5 + -1
            r0.f847 = r7
            r0.f839 = r5
            r5 = 14
            r0.f849 = r5
            goto L_0x08e5
        L_0x0920:
            r3 = 38
            r4 = 60
            boolean r2 = r0.f877
            if (r2 == 0) goto L_0x0931
            int r2 = r0.f879
            r0.f852 = r2
            r0.f847 = r2
            r0.m819(r9)
        L_0x0931:
            int r2 = r0.f879
            if (r2 != r1) goto L_0x093d
        L_0x0935:
            boolean r1 = r0.f858
            if (r1 == 0) goto L_0x093c
            r16.m376()
        L_0x093c:
            return
        L_0x093d:
            java.lang.StringBuilder r5 = r0.f833
            int r7 = r2 + 1
            r0.f879 = r7
            char r2 = r5.charAt(r2)
            goto L_0x08e5
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3685.m846(int):void");
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m830(int i10, String str) {
        C4190 r02 = this.f867;
        if (r02 != null) {
            r02.m3692(i10, str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [int] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m828(nts.C4095 r11) {
        /*
            r10 = this;
            java.lang.String r0 = "I<\u0014HLYOD\u0015OBUEDPTYOOOR],(^%QS\u0001T@Digm\u001c\u0018k\u0015ac1\u0017\u00139\fzz\u000egk2#1+50\u0006\u0012\u0010\u0013\t\u0002875?3?3::}97?4=)2e0\"%{`\u0017822(>\u001a82\u0016 ! :2$:*\u001c?/-!1#4q^TTNX|^Tt^VYPXCx[OMEUK\\ÙúûñûÜóóæöþåÊæÿìèçíÌðæèÀì÷éõçÚêøôïÅØÂÂÊçæçàêóõ¢·ª®µ¥®¸¥¥¬¢ñÆÃÅÙÚúÔ×ÞËÉßÜÙÒñåòãõòàÝãáýëüüìñö¡¢¾¤º·«¬ «¨¯¸©¼ª·0\u001a\u0014\u0013\u001c&\u0010\u001a\u001f\u0013\u0017\u001f:\u0006\u001e\u0019\u0013\u0016\b\u000f\tR~}`Zpusw[wzuwg}RRO_WLDgU@bTHGQwrhh`Twehmz}fbj]cdxyygYnjk{qhX~v}txc[slxm}Oywsy}k{]u`aA|vxZald\r!\" ?\u001b/8!70\"$\u0002*\".<=+=+)ÖñõäÑ÷ùçöÖñåàòÂêñãÿñÈýÛéõæ®®¿õç®­ª¶¼¨¨¶òµ¿²¥õº¤¾é­·§¾¸í­ÅÂÞÚ°³»¸ÚßÀÅÍ¥»µ¿ö§µ§©²¶¾þ«´¸â¥©­£,,=WEJJ[1(([]mm|\u0016\u000f\u000frz\u0005\u0005\u0014~ec\u0014\u0012TTE/42KC\b\b\u0019shn\u0019\u001fnn\u0015\u000e\bqynn\u0015\u0007\u0016;\":5p==)|/?++>z\u001d\t\u000bf')/'wlGqnjeDLO-az}}(ckcq7ttu}2xr~|u}:RLBH\u0001PBP^EAI\t\\CO\u0015R^ZT¤¿©£§©ì®¤­¢¨±µ¾¼ ñ¯Á ¾ÞÐúõâýôüç¼þññìøóõ÷¥óéâàîââîëë¨ìæîÙÐØÃÃßÕÔ¸ëìøù³çÿñá÷üøêèåíµ®ãã£ÚÌÌ§ëäöÐÏÉÈßÎÕÝÄÞÓÜÚÃÇØÚÚØÆÚÕ5\u0013\b\u001e\u0014\u0010\u001e[\u0011\u001b\u0012W\u0003\u0005\u0013\u0007\tM\b\u0000\u001aI\u001a\n\u0016\u0016\u0003\u0015N11}\u0004\u0016\u0016y56$>!#r&1<n+#>$-h.(e--244_\n\u0018\u0004\u000fTDbyoeao*]Tfri.]WV:inz{1e}scu~zhjgo-$|ku AwlhcBvu\u001bNR\u001cKLDU\u0013S[P\u0017DLXJX^I\u0006\u0000ºÆÜÆÂÞÃÍþêè³µ³§µ¸ÊÂÛÒÑÐ£¨ï ¨¥®¹µ¥¤£èî)\u0013\u0015\u0011\u0017\u000e\u0014[\u0015\u0001\u0002\u0005\u0019\u0013\u0007\u0007\tM\u001e\u001d\r\u000f\u0003\u0013DM\u0005\u0006\u000eF\u0016C:40;x7;61&&634{}2&$YDGB\u000f\u001b\u0018ANO\u0015M\u000e\u0012PLF\u000f{oi\u000b\u0016\u001f\u0010\u0010\u0004DLAJ]aqpw\u0003%>(\"&(m\u001a\u000e\f{f\"<1(:x:6>.<1'5#%w=;J\b\u0007\u0004\u0003\n\u0002\u0019B\u0007\u0005\u0002\n\u0006\u0016\u0004\u000e\u0012\u0017\u0017P ÜÆÝÀÍÉ°¦¦§¼ª ¤ªï£©£±¥¦²¢ªùÓÖÛß¿Åª­ÃÕÌÉÞØßÌÅÚÖôÂÃÚÀÈÞØÈáÁÌÇ\u0006 ;-'#-h\u001f\u000b\td.#3+*.s\u0000&=+!%+n\u0019\r\u000fb(%5-,(u"
            r1 = 89
            r2 = 26
            r3 = 29
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r2, (int) r3)
            boolean r1 = r11.m3237(r1)
            r4 = 0
            r5 = 1
            java.lang.String r6 = ""
            if (r1 == 0) goto L_0x0042
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            int r0 = r10.f838
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0028
            r4 = r5
        L_0x0028:
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x0030:
            boolean r11 = r11.m3232()
            if (r11 == 0) goto L_0x003a
            int r11 = r10.f838
            r11 = r11 | r5
            goto L_0x003e
        L_0x003a:
            int r11 = r10.f838
            r11 = r11 & -2
        L_0x003e:
            r10.f838 = r11
            goto L_0x03e1
        L_0x0042:
            r1 = 24
            r7 = 83
            r8 = 115(0x73, float:1.61E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r8, (int) r1, (int) r7)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x0080
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x006d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            int r0 = r10.f838
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0065
            r4 = r5
        L_0x0065:
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x006d:
            boolean r11 = r11.m3232()
            if (r11 == 0) goto L_0x0078
            int r11 = r10.f838
            r11 = r11 | 2
            goto L_0x007c
        L_0x0078:
            int r11 = r10.f838
            r11 = r11 & -3
        L_0x007c:
            r10.f838 = r11
            goto L_0x03e1
        L_0x0080:
            r1 = 139(0x8b, float:1.95E-43)
            r7 = 12
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r7, (int) r3)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x00a4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            boolean r0 = r10.f854
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x00a4:
            boolean r11 = r11.m3232()
            r10.f854 = r11
            goto L_0x03e1
        L_0x00ac:
            r1 = 151(0x97, float:2.12E-43)
            r3 = 22
            r8 = 15
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r3, (int) r8)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x00da
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x00d2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            boolean r0 = r10.f861
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x00d2:
            boolean r11 = r11.m3232()
            r10.f861 = r11
            goto L_0x03e1
        L_0x00da:
            r1 = 173(0xad, float:2.42E-43)
            r3 = 44
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r7, (int) r3)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x0106
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x00fe
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            boolean r0 = r10.f856
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x00fe:
            boolean r11 = r11.m3232()
            r10.f856 = r11
            goto L_0x03e1
        L_0x0106:
            r1 = 185(0xb9, float:2.59E-43)
            r7 = 110(0x6e, float:1.54E-43)
            r9 = 17
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r9, (int) r7)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x0134
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x012c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            boolean r0 = r10.f876
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x012c:
            boolean r11 = r11.m3232()
            r10.f876 = r11
            goto L_0x03e1
        L_0x0134:
            r1 = 202(0xca, float:2.83E-43)
            r7 = 119(0x77, float:1.67E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r8, (int) r7)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x0196
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x0147
            return r6
        L_0x0147:
            java.lang.String r11 = r11.f3482
            java.lang.String r0 = ":"
            int r0 = r11.indexOf(r0)
            r1 = -1
            if (r0 <= r1) goto L_0x03e1
            java.lang.String r1 = r11.substring(r4, r0)
            int r0 = r0 + r5
            java.lang.String r11 = r11.substring(r0)
            nts.Ҫ r0 = new nts.Ҫ
            r0.<init>(r11, r1)
            boolean r2 = r10.f850
            if (r2 == 0) goto L_0x0169
            java.util.Vector r2 = r10.f857
            r2.add(r0)
        L_0x0169:
            java.util.Stack<nts.ᚻ> r2 = r10.f866
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x018f
        L_0x0171:
            if (r4 >= r2) goto L_0x03e1
            java.util.Stack<nts.ᚻ> r0 = r10.f866
            java.lang.Object r0 = r0.get(r4)
            nts.ᚻ r0 = (nts.C3953) r0
            java.lang.String r3 = r0.f2327
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x018d
            java.lang.String r3 = r0.f2329
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x018d
            r0.f2329 = r11
        L_0x018d:
            int r4 = r4 + r5
            goto L_0x0171
        L_0x018f:
            nts.ɰ r11 = r10.f860
            r11.m142((nts.C3609) r0)
            goto L_0x03e1
        L_0x0196:
            r1 = 18
            r7 = 73
            r8 = 217(0xd9, float:3.04E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r8, (int) r1, (int) r7)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x01c4
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x01bc
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            boolean r0 = r10.f851
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x01bc:
            boolean r11 = r11.m3232()
            r10.f851 = r11
            goto L_0x03e1
        L_0x01c4:
            r1 = 16
            r7 = 41
            r8 = 235(0xeb, float:3.3E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r8, (int) r1, (int) r7)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x01f2
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x01ea
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            boolean r0 = r10.f873
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x01ea:
            boolean r11 = r11.m3232()
            r10.f873 = r11
            goto L_0x03e1
        L_0x01f2:
            r1 = 8
            r7 = 43
            r8 = 251(0xfb, float:3.52E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r8, (int) r1, (int) r7)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x0235
            boolean r1 = r11.f3484
            if (r1 != 0) goto L_0x0235
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r11 = r11.f3482
            if (r11 == 0) goto L_0x022d
            boolean r1 = r11.equals(r6)
            if (r1 != 0) goto L_0x022d
            java.lang.String r1 = "."
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0221
            goto L_0x022d
        L_0x0221:
            nts.ᵪ r1 = r10.f853
            if (r1 != 0) goto L_0x0226
            goto L_0x022d
        L_0x0226:
            nts.ᵪ r11 = r10.m823(r11)
            if (r11 == 0) goto L_0x022d
            r4 = r5
        L_0x022d:
            r0.append(r4)
            java.lang.String r11 = r0.toString()
            return r11
        L_0x0235:
            r1 = 21
            r7 = 101(0x65, float:1.42E-43)
            r8 = 259(0x103, float:3.63E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r8, (int) r1, (int) r7)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x0263
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x025b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            boolean r0 = r10.f858
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x025b:
            boolean r11 = r11.m3232()
            r10.f858 = r11
            goto L_0x03e1
        L_0x0263:
            r1 = 280(0x118, float:3.92E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r9, (int) r2)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x02af
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x0285
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            boolean r0 = r10.f832
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x0285:
            boolean r11 = r11.m3232()
            if (r11 == 0) goto L_0x029a
            byte[] r0 = r10.f862
            byte[] r1 = f830
            if (r0 != r1) goto L_0x029a
            int r0 = r1.length
            byte[] r0 = new byte[r0]
            r10.f862 = r0
            int r2 = r1.length
            java.lang.System.arraycopy(r1, r4, r0, r4, r2)
        L_0x029a:
            r0 = 48
        L_0x029c:
            r1 = 58
            if (r0 >= r1) goto L_0x02ab
            byte[] r1 = r10.f862
            byte r2 = r1[r0]
            r2 = r2 | 2
            byte r2 = (byte) r2
            r1[r0] = r2
            int r0 = r0 + r5
            goto L_0x029c
        L_0x02ab:
            r10.f832 = r11
            goto L_0x03e1
        L_0x02af:
            r1 = 297(0x129, float:4.16E-43)
            r2 = 31
            r7 = 9
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r7, (int) r2)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x02d9
            boolean r1 = r11.f3484
            if (r1 == 0) goto L_0x02d9
            nts.ᵪ r11 = r10.f869
            if (r11 == 0) goto L_0x02d8
            boolean r0 = r10.f854
            if (r0 != 0) goto L_0x02cc
            goto L_0x02d8
        L_0x02cc:
            int r0 = r11.f2984
            int r11 = r11.f2982
            java.lang.StringBuilder r1 = r10.f833
            java.lang.String r2 = nts.C3823.f1540
            java.lang.String r6 = r1.substring(r0, r11)
        L_0x02d8:
            return r6
        L_0x02d9:
            r1 = 306(0x132, float:4.29E-43)
            r2 = 7
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r2, (int) r4)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x02f7
            boolean r1 = r11.f3484
            if (r1 == 0) goto L_0x02f7
            java.lang.StringBuilder r11 = r10.f833
            int r0 = r10.f841
            int r1 = r10.f852
            java.lang.String r2 = nts.C3823.f1540
            java.lang.String r11 = r11.substring(r0, r1)
            return r11
        L_0x02f7:
            r1 = 313(0x139, float:4.39E-43)
            r2 = 23
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r2, (int) r3)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x0323
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x031b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            int r0 = r10.f836
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x031b:
            int r11 = r11.m3239()
            r10.f836 = r11
            goto L_0x03e1
        L_0x0323:
            r1 = 336(0x150, float:4.71E-43)
            r3 = 94
            r4 = 20
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r4, (int) r3)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x0362
            boolean r1 = r11.f3484
            if (r1 == 0) goto L_0x0362
            boolean r11 = r10.f854
            if (r11 != 0) goto L_0x0350
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            int r0 = r10.f846
            int r1 = r10.f863
            int r0 = r0 + r1
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x0350:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            int r0 = r10.f863
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x0362:
            r1 = 356(0x164, float:4.99E-43)
            r3 = 105(0x69, float:1.47E-43)
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r4, (int) r3)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x038d
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x0386
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            boolean r0 = r10.f878
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x0386:
            boolean r11 = r11.m3232()
            r10.f878 = r11
            goto L_0x03e1
        L_0x038d:
            r1 = 376(0x178, float:5.27E-43)
            r3 = 35
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r2, (int) r3)
            boolean r1 = r11.m3237(r1)
            if (r1 == 0) goto L_0x03b7
            boolean r1 = r11.f3484
            if (r1 == 0) goto L_0x03b0
            boolean r11 = r10.f855
            if (r11 == 0) goto L_0x03a8
            r11 = 399(0x18f, float:5.59E-43)
            r1 = 4
            r5 = r7
            goto L_0x03ab
        L_0x03a8:
            r11 = 403(0x193, float:5.65E-43)
            r1 = 5
        L_0x03ab:
            java.lang.String r11 = nts.C3727.m1052((java.lang.String) r0, (int) r11, (int) r1, (int) r5)
            return r11
        L_0x03b0:
            boolean r11 = r11.m3232()
            r10.f855 = r11
            goto L_0x03e1
        L_0x03b7:
            r1 = 408(0x198, float:5.72E-43)
            r2 = 11
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r9, (int) r2)
            boolean r0 = r11.m3237(r0)
            if (r0 == 0) goto L_0x03e2
            boolean r0 = r11.f3484
            if (r0 == 0) goto L_0x03db
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            boolean r0 = r10.f865
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            return r11
        L_0x03db:
            boolean r11 = r11.m3232()
            r10.f865 = r11
        L_0x03e1:
            return r6
        L_0x03e2:
            java.lang.String r11 = super.m367((nts.C4095) r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3685.m828(nts.ἆ):java.lang.String");
    }
}
