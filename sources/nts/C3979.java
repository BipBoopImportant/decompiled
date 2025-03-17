package nts;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import qE.C14953m;

/* renamed from: nts.ᡥ  reason: contains not printable characters */
public final class C3979 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public static final String f2546 = C3727.m1052("PU11\u0007\u0002fe50TV %AD>;_[Or|8{{kupw1yd6g{d~ll!#\u001e\u0010T\u001a\u001c\u0005\u0015\u0018\f\u0014\b\u0002Z\u0016\u001eG\u0012\r\u0001C1%+O\u0006\f\u001fK\b\f\r9v!5>\"4\"::s\u001d3~:5,6: :$w9\"r1)$ (h<9. e2(`37-\\\t\u0016\u001aX8\n\u000bZ\u0011q666 10=+z2/}?+4 !+!!f3'i>#)m\u000f?\u0000_Æûõ±ÙÄ´úè»ìñû¿ÓÎ¢õåóõîëëªâû©ààø­ÁÆÀÁÙÅÀÐÞ", 12, 4, 123);

    /* renamed from: ગ  reason: contains not printable characters */
    public static final String f2547 = C3727.m1052("PU11\u0007\u0002fe50TV %AD>;_[Or|8{{kupw1yd6g{d~ll!#\u001e\u0010T\u001a\u001c\u0005\u0015\u0018\f\u0014\b\u0002Z\u0016\u001eG\u0012\r\u0001C1%+O\u0006\f\u001fK\b\f\r9v!5>\"4\"::s\u001d3~:5,6: :$w9\"r1)$ (h<9. e2(`37-\\\t\u0016\u001aX8\n\u000bZ\u0011q666 10=+z2/}?+4 !+!!f3'i>#)m\u000f?\u0000_Æûõ±ÙÄ´úè»ìñû¿ÓÎ¢õåóõîëëªâû©ààø­ÁÆÀÁÙÅÀÐÞ", 4, 4, 84);

    /* renamed from: ഇ  reason: contains not printable characters */
    public static final String f2548 = C3727.m1052("PU11\u0007\u0002fe50TV %AD>;_[Or|8{{kupw1yd6g{d~ll!#\u001e\u0010T\u001a\u001c\u0005\u0015\u0018\f\u0014\b\u0002Z\u0016\u001eG\u0012\r\u0001C1%+O\u0006\f\u001fK\b\f\r9v!5>\"4\"::s\u001d3~:5,6: :$w9\"r1)$ (h<9. e2(`37-\\\t\u0016\u001aX8\n\u000bZ\u0011q666 10=+z2/}?+4 !+!!f3'i>#)m\u000f?\u0000_Æûõ±ÙÄ´úè»ìñû¿ÓÎ¢õåóõîëëªâû©ààø­ÁÆÀÁÙÅÀÐÞ", 0, 4, 7);

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static final String f2549 = C3727.m1052("PU11\u0007\u0002fe50TV %AD>;_[Or|8{{kupw1yd6g{d~ll!#\u001e\u0010T\u001a\u001c\u0005\u0015\u0018\f\u0014\b\u0002Z\u0016\u001eG\u0012\r\u0001C1%+O\u0006\f\u001fK\b\f\r9v!5>\"4\"::s\u001d3~:5,6: :$w9\"r1)$ (h<9. e2(`37-\\\t\u0016\u001aX8\n\u000bZ\u0011q666 10=+z2/}?+4 !+!!f3'i>#)m\u000f?\u0000_Æûõ±ÙÄ´úè»ìñû¿ÓÎ¢õåóõîëëªâû©ààø­ÁÆÀÁÙÅÀÐÞ", 8, 4, 106);

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static final String f2550 = C3727.m1052("PU11\u0007\u0002fe50TV %AD>;_[Or|8{{kupw1yd6g{d~ll!#\u001e\u0010T\u001a\u001c\u0005\u0015\u0018\f\u0014\b\u0002Z\u0016\u001eG\u0012\r\u0001C1%+O\u0006\f\u001fK\b\f\r9v!5>\"4\"::s\u001d3~:5,6: :$w9\"r1)$ (h<9. e2(`37-\\\t\u0016\u001aX8\n\u000bZ\u0011q666 10=+z2/}?+4 !+!!f3'i>#)m\u000f?\u0000_Æûõ±ÙÄ´úè»ìñû¿ÓÎ¢õåóõîëëªâû©ààø­ÁÆÀÁÙÅÀÐÞ", 16, 4, 121);

    /* renamed from: ⶏ  reason: contains not printable characters */
    public final List<C14953m> f2551;

    public C3979(Context context, C4176 r22) {
        this.f2551 = m2351(context, r22);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static List<C14953m> m2351(Context context, C4176 r17) {
        int i10;
        Signature[] signatureArr;
        Context context2 = context;
        C4176 r12 = r17;
        String str = r12.f3883;
        List<String> list = r12.f3875;
        List<String> list2 = r12.f3884;
        ArrayList arrayList = new ArrayList();
        if (C3956.m2203(context2, true)) {
            arrayList.add(new C14953m(f2548, C3727.m1052("PU11\u0007\u0002fe50TV %AD>;_[Or|8{{kupw1yd6g{d~ll!#\u001e\u0010T\u001a\u001c\u0005\u0015\u0018\f\u0014\b\u0002Z\u0016\u001eG\u0012\r\u0001C1%+O\u0006\f\u001fK\b\f\r9v!5>\"4\"::s\u001d3~:5,6: :$w9\"r1)$ (h<9. e2(`37-\\\t\u0016\u001aX8\n\u000bZ\u0011q666 10=+z2/}?+4 !+!!f3'i>#)m\u000f?\u0000_Æûõ±ÙÄ´úè»ìñû¿ÓÎ¢õåóõîëëªâû©ààø­ÁÆÀÁÙÅÀÐÞ", 20, 21, 26), C14953m.a.HIGH));
        }
        C3956.f2333 = C3956.m2202(context2, list, r12.f3877);
        if (!C3956.m2200(context) && C3956.f2333 && !C3956.m2201(context2, list2) && str != null && str.length() != 0) {
            String lowerCase = str.replace(":", "").toLowerCase(Locale.US);
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        SigningInfo a10 = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                        signatureArr = a10.hasMultipleSigners() ? a10.getApkContentsSigners() : a10.getSigningCertificateHistory();
                    } else {
                        signatureArr = packageManager.getPackageInfo(context.getPackageName(), 64).signatures;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    signatureArr = null;
                }
                if (signatureArr != null) {
                    int length = signatureArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        try {
                            byte[] digest = MessageDigest.getInstance(C3727.m1052("FP&&\u0006\u0010fe 6@B\u0011\u0007qt\u000e#!:,0?j(142a\"&b.,:=0>2?1z\u0014\n\u0011\r\u000e\u000eMcj}g`no\u001d\u001e\u001d\u0014fegq\u0003\u0000\u0005r\u0000\u0003\u0007j\u0018\u001b\u001cU'$-O=>6Q# (6DFFb\u0010\u0012\u0011M?=9q\u0003\u0001\u0004#QSU\u0007uwp4567\u0004\u0005/.\r\f*+23\u001enmmÁ±²±³ÃÁÆï´ÄÇÄëéîüÿýÿæÇ·´³É¹º¼¬ÜßÖÆ¶µ½öôôÄ´¶·¦ÖÔÕÂ²°²éµÅÇÄîìèÅµ·²áÁ±³»¸ÈÊÃîïìïöåæ§×ÖÑ®ÞßØíÐ ¡§B235\u000f~xY)(-l\u001c\u001d\u0018\u0003srv?ONJ7FGM:KJA\n{zp+Z[P&WQTd\u0015\u0013\u0017+Z\\[ QWQ^/),\u0001pvr\n{}z\u001cmkmM<::<MKK7GDDm\u001d\u001e\u001d~\u000e\r\u000f\u0010`cfn\u001e\u001d\u0019\u001folkx\b\u000b\r\u0015efoT$'/F644I9;:h\u0018\u001a\u0018ãáâå´ÄÆÃøñóôòúÍ½¼¿§×ÖÔüºÊËËâíöÔ¤¥¡¬ÝÜÖ×¦§¬Ï¾¸½Ì½»¿éïèòôòÖ§¡¡âãâèý¹ÉÉÊþÿôì¯ßßÝ®ÞÞÝÿÿÿµÅÅÄq\u0000\u0006\u0004d\u0015\u0013\u001el\u001c\u001c\u001d\u001akmoe\u0014\u0012\u001fN>>8y\t\t\u000e`\u0010\u0010\u0014\u000e~~{!QQ[R#%&*ZZZE554k\u001b\u001b\u001d\u0005uurr\u0002\u0002\u0006J::?T$$.\u0003rtwR#%'+Z\\Q\u0002rry\u000f\b\r{\u000b\f\b}\f\n\u0006+Z\\PW'',j\u001a\u001d\u00187G@DG60<\u0010`g`L<;=ß¯¨©ýúúîéêàóãäèÇ·±µÁ±·²ûòôóîèïÿùþìðþ¸ÉÎÏôóôÕ¤££¼ÍÊË°ÀÆÆÁ±·¶÷ññÔ¤¢£åãáñõúÎ¾»¼Åµ°¶úÿúÇ·²±ÿýÿ{\u000b\u000e\u000bN>;84EGE\u0019ilh{\u000b\u000e\fs\u0003\u0006\u0007m\u001d\u0018\u0018,\\YYq\u0001\u0004\u000b4DAO\u0006vruH8<8Z*.+\ty}~s\u0003\b\u0001\u0001qzr\u001fodo\u001clgm\u001enehb\u0012\u0019\u0015U%.!Y)\",U%./I9220@JBf\u0016\u001c\u0015\u0017gmg{\u000b\u0001\nu\u0005\u000f\u0003k\u001b\u0011\u001cH82<y\t\u0003\fÇ·½½»ËÁÀéëêñïü±ÀÂÅ«ÚØÞ¬ÝßÖ¢ÓÑÙýÅ´·¶âáã ÑÒÑûÒ£ ¥Ü­®¨«ÚÙÞóÈ¹º³ååæÍ¼¼¾±ÀÀÁääãÁ°°µúÎ¿¿´þ×¦§¥æäøL=<:3BCDK:;?r\u0003\u0002\u0007\u0006\f\u0011F\u0007\r\u0010G\f|{J:9=l\u001c\u0018\u001e\u001clhn PTVR\"&$<LHHy\t\r\rK;??g\u0017\u0013\u0012J:>?w\u0007\u0003\r\u000f{uodm`hkukkfscdx|ts{k}{`ee5EANY)-\"r\u0003\u0003\u0003<MMMs\u0002\u0005\u0001n\u001f\u0018\u001c\txz¾©¬»»­¬·´«®¤¦õò÷þüÿ¿ÎÌÏÒÉëÙÒÎÔÒÔàØÞÐÓÇñÅËËÄÊÊþùÿ¼ÍÊÌ¼ÍÊÌûûýþ¿ÍÏÍß­¯®þüþÊ¸º»°ÂÀÂ¸¨¡¶¬«¥àÕÏÉÍËÒÈØ¸ª²Ü|w}mw~UOIMKRH(\u0001\u001a\u0002\b\u001c\u0004\u0018\u000b\u0002\u0001\b\u0004\f5\u0018\u0000\u000e\u001681&<;5p\f\u001a\u0016|9/043f#+1b9xyvU]KX[C_VV\u0002\u000b\b\u0001\r\u0005<\u0011\t\u0007\u001d;#a?#$-g/+0&%3)+'}?3?:3w04=?75~*'&d,\"+<.)'l,*3#+6:6s3,p\u000b)4=!1\u001e8\u0000\u001cÏÎÒÙÖûîöúøÆÃ ­¬î´§°¶¢¡ç»º¬¾¸¡³¥µåÌÐÍÜÜùÈÜÐÐÓÚÒÀÐÕÝÄ³§º«²±´¦¦î³©¥²ë«¥¬»¡¦¨ãª£¿¢³³úª´«¼º¹±;+>8f!,14\u0004\u001aJF\u0000M\u0016\f\u0006ksuu\u0016\f\u0006ksuuee-pjfq(hfoxbek i`|app\u0005\u0005M\u0010\n\u0006\u0011H\b\u0006\u000f\u0018\u0002\u0005\u000b@\t\u0000\u001c\u0001\u0010\u0010Y\u001f\u0017\u000b\u000f\u001b\u0011\u0010\u001a\fncb zi~xlo)utbpvo}k{+vdnn.qvÓÔØ°íäïïÿô·ïôüú¼áä¶üúîü³óñòñÿ½íöþø¦ûþÖÐÄÖÙÛØÛÕÝ×ÓÐ×ÜÛÖÓø¥¬§§·¼ÿ½·³ó½»°´´§£¡ì±´ö«¢©©¹²ñ° £ý¡§³»½¸¯¿â®¾ªB\u001f\u0016\u001d\u001d\r\u0006E\u0000\u0010\u0004I\b\u000e\n\u0016S\u0018PG@+\u000e\n\u0010\u0006$#5\u0011\u0016\u001f\"\"/r{pp`k(pkce#ioj}~|`a\fF@TF\tIKHKE\u0007\\[E\u0018\u001dF\f\u0006\u0002B\u0011\u0016589{8<5(5-50t)762$, !(&7o#/',*-#;-a=8<6 \"%ide'}z|hpwhnkfwi{y6kqphxa`ub~uyY¦º¬ä«¾ª« ®§°ª­£²¶··©ó®°±¥°º°·¼³âïî¬÷ëèòèæïøâåë ãÿüæØÖØÄÒÕÀÔÕÞÐÙÎÔÓÝÌÈÉÉ×ÐÎÏÛñÎÄÎÉÂÍåÉåæüncb hfoxjmc(wemftrxk6?44$/\\\u0001\b\u0003\u0003\u0013\u0018[\u0019\u0013\u0017`=4??/$g4$,*\u0003^W\\\\LG\u0004\\GOI;csyt~`<~tp\u0007ZHBB\u0006M_I", 1569, 7, 99)).digest(signatureArr[i11].toByteArray());
                            StringBuilder sb2 = new StringBuilder(digest.length * 2);
                            for (byte valueOf : digest) {
                                sb2.append(String.format(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 529, 4, 103), new Object[]{Byte.valueOf(valueOf)}));
                            }
                            if (lowerCase.equals(sb2.toString())) {
                                i10 = 41;
                                break;
                            }
                            i11++;
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                    }
                    C3956.m2198("03");
                }
            }
        }
        i10 = 41;
        arrayList.add(new C14953m(f2547, C3727.m1052("PU11\u0007\u0002fe50TV %AD>;_[Or|8{{kupw1yd6g{d~ll!#\u001e\u0010T\u001a\u001c\u0005\u0015\u0018\f\u0014\b\u0002Z\u0016\u001eG\u0012\r\u0001C1%+O\u0006\f\u001fK\b\f\r9v!5>\"4\"::s\u001d3~:5,6: :$w9\"r1)$ (h<9. e2(`37-\\\t\u0016\u001aX8\n\u000bZ\u0011q666 10=+z2/}?+4 !+!!f3'i>#)m\u000f?\u0000_Æûõ±ÙÄ´úè»ìñû¿ÓÎ¢õåóõîëëªâû©ààø­ÁÆÀÁÙÅÀÐÞ", 41, 43, 117), C14953m.a.HIGH));
        if (C3956.m2204()) {
            arrayList.add(new C14953m(f2549, C3727.m1052("PU11\u0007\u0002fe50TV %AD>;_[Or|8{{kupw1yd6g{d~ll!#\u001e\u0010T\u001a\u001c\u0005\u0015\u0018\f\u0014\b\u0002Z\u0016\u001eG\u0012\r\u0001C1%+O\u0006\f\u001fK\b\f\r9v!5>\"4\"::s\u001d3~:5,6: :$w9\"r1)$ (h<9. e2(`37-\\\t\u0016\u001aX8\n\u000bZ\u0011q666 10=+z2/}?+4 !+!!f3'i>#)m\u000f?\u0000_Æûõ±ÙÄ´úè»ìñû¿ÓÎ¢õåóõîëëªâû©ààø­ÁÆÀÁÙÅÀÐÞ", 84, i10, 33), C14953m.a.HIGH));
        }
        if (C3956.m2200(context)) {
            arrayList.add(new C14953m(f2546, C3727.m1052("PU11\u0007\u0002fe50TV %AD>;_[Or|8{{kupw1yd6g{d~ll!#\u001e\u0010T\u001a\u001c\u0005\u0015\u0018\f\u0014\b\u0002Z\u0016\u001eG\u0012\r\u0001C1%+O\u0006\f\u001fK\b\f\r9v!5>\"4\"::s\u001d3~:5,6: :$w9\"r1)$ (h<9. e2(`37-\\\t\u0016\u001aX8\n\u000bZ\u0011q666 10=+z2/}?+4 !+!!f3'i>#)m\u000f?\u0000_Æûõ±ÙÄ´úè»ìñû¿ÓÎ¢õåóõîëëªâû©ààø­ÁÆÀÁÙÅÀÐÞ", 125, 34, 15), C14953m.a.MEDIUM));
        }
        return arrayList;
    }
}
