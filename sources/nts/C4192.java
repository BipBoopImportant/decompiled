package nts;

import java.math.BigInteger;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;
import java.util.Enumeration;
import java.util.Set;
import java.util.Vector;
import org.slf4j.Marker;

/* renamed from: nts.〴  reason: contains not printable characters */
public class C4192 extends C3957 implements C3617 {

    /* renamed from: ɞ  reason: contains not printable characters */
    public KeyStore f4032 = null;

    /* renamed from: ೞ  reason: contains not printable characters */
    public String f4033 = "";

    /* renamed from: Ⴘ  reason: contains not printable characters */
    public byte[] f4034 = C3596.f365;

    /* renamed from: ᴸ  reason: contains not printable characters */
    public X509Certificate f4035 = null;

    public C4192() {
        new Vector();
    }

    public Certificate[] getCertificateChain(String str) {
        if (this.f2341 >= 6) {
            return super.getCertificateChain(str);
        }
        try {
            return this.f4032.getCertificateChain(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m3706() {
        return this.f2341 >= 6 ? super.m2206() : this.f4035 != null ? -1 : 0;
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public X509Certificate m3707() {
        byte[] bArr;
        if (this.f4035 == null && (bArr = this.f2342) != null && bArr.length > 0) {
            this.f4035 = C4016.m2513(bArr);
        }
        return this.f4035;
    }

    /* renamed from: ࡑ  reason: contains not printable characters */
    public String m3709() {
        String str = this.f2339;
        return str != null ? str : "";
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public PrivateKey m3710(String str) {
        if (this.f2341 >= 6) {
            C3696 r82 = this.f2338;
            if (r82 != null) {
                return r82.f895;
            }
            return null;
        }
        if (str != null) {
            try {
                if (this.f4032.isKeyEntry(str)) {
                    char[] cArr = C3596.f368;
                    String str2 = this.f4033;
                    if (str2 != null && str2.length() > 0) {
                        cArr = this.f4033.toCharArray();
                    }
                    return (PrivateKey) this.f4032.getKey(str, cArr);
                }
            } catch (UnrecoverableKeyException e10) {
                int i10 = this.f2341;
                if (i10 == 4 || i10 == 5) {
                    throw new C3625((Throwable) null, 289, C4016.f2734 + C3727.m1052("\u0006 ;-'#-h$#70c15/-;}(\"*<vgUMAQMHHHDB^T\fAAE\u0010RDT][W[T^\u0000\u001d_^Poow\"jtbh)knxyeigrqgw5gcyk};ndlz>CTW\u001d\u001bR9\u0011\u0007\u001fQAbnois$jznf)mj~y{uyrwcq5iowk{%<¢®¯©³äªº®¦éí´º¼´¥÷¡¦³µ¿ù»²¬©ÃÓÎÓÝëð ôèæòäãçéëâê¬úúöþ±ãäýûý»ÒÝÕ²ìïÍÕÉÅÃÃÎÏÒÛÝÁÝÉÞÖõùøþä³ýíùñ¾úýéîìâîåàôæ¢þøàüì²«Sp|}{a6qqw~;om{|igkf`%ebz}cmeno{U\u000b\u0012\f/#\"$>i..(!d02$#6849?z:=%\"<2:10$\n@EM?\u0007\u001d\u0017f(28JJH{nh\u0018\u001f\u0019\u001cMX^.)/*\b\f\u0018\u0017\u0015\u001e~\u0014\u0015\b}\u0017:'\t9()\";%2q=:! -;-!-/deùúâüìøêêåúùÚÖ×ÑËÙ×ßÕÅÓ×ÐØßÁÏÇÌÍÙÇ¯ÊÁÞÎÕ°ÕÙÅÊÖó³¬ôº´½ø«¿°ª¡¥¾æ¦¡¹¾ ®¦­¬¸ÖÂÄØÄÐÇÙØÖÑÑÉÁÇÍÈÂÌÂÂÏÍ\u0002!-,*0g'-,k)(>;'7903!1w\"6x(.2.:dA\u001a9542(;) < !t\u0007\u0010\u0011h(/?8&((#\"6 ~gPs~xb5qcjvjk>~yqvhfnedpn$®©½º ®¢©¤°¢³ÖÝÓÊ¾²³µ¯ø¼®§»§¦ó»´·á£ÆÍß", 380, 25, 56) + e10.getMessage());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4185 m3711(String str, byte[] bArr) {
        this.f2340 = str;
        this.f2342 = C3823.m1636(bArr);
        if (this.f2341 >= 6) {
            return m2216("", "", str, bArr, (String) null);
        }
        String str2 = "";
        X509Certificate r10 = m3714(str2, str2, str, bArr);
        this.f4035 = r10;
        C4185 r11 = new C4185();
        if (r10 != null) {
            byte[] bArr2 = C3596.f365;
            try {
                bArr2 = r10.getEncoded();
            } catch (Exception unused) {
            }
            r11.f4002 = C3823.m1636(bArr2);
            C4016.m2532(C3727.m1052("\u0006 ;-'#-h$#70c15/-;}(\"*<vgUMAQMHHHDB^T\fAAE\u0010RDT][W[T^\u0000\u001d_^Poow\"jtbh)knxyeigrqgw5gcyk};ndlz>CTW\u001d\u001bR9\u0011\u0007\u001fQAbnois$jznf)mj~y{uyrwcq5iowk{%<¢®¯©³äªº®¦éí´º¼´¥÷¡¦³µ¿ù»²¬©ÃÓÎÓÝëð ôèæòäãçéëâê¬úúöþ±ãäýûý»ÒÝÕ²ìïÍÕÉÅÃÃÎÏÒÛÝÁÝÉÞÖõùøþä³ýíùñ¾úýéîìâîåàôæ¢þøàüì²«Sp|}{a6qqw~;om{|igkf`%ebz}cmeno{U\u000b\u0012\f/#\"$>i..(!d02$#6849?z:=%\"<2:10$\n@EM?\u0007\u001d\u0017f(28JJH{nh\u0018\u001f\u0019\u001cMX^.)/*\b\f\u0018\u0017\u0015\u001e~\u0014\u0015\b}\u0017:'\t9()\";%2q=:! -;-!-/deùúâüìøêêåúùÚÖ×ÑËÙ×ßÕÅÓ×ÐØßÁÏÇÌÍÙÇ¯ÊÁÞÎÕ°ÕÙÅÊÖó³¬ôº´½ø«¿°ª¡¥¾æ¦¡¹¾ ®¦­¬¸ÖÂÄØÄÐÇÙØÖÑÑÉÁÇÍÈÂÌÂÂÏÍ\u0002!-,*0g'-,k)(>;'7903!1w\"6x(.2.:dA\u001a9542(;) < !t\u0007\u0010\u0011h(/?8&((#\"6 ~gPs~xb5qcjvjk>~yqvhfnedpn$®©½º ®¢©¤°¢³ÖÝÓÊ¾²³µ¯ø¼®§»§¦ó»´·á£ÆÍß", 343, 3, 92), bArr2);
            r11.f4008 = C4016.m2532(C3727.m1052("\u0006 ;-'#-h$#70c15/-;}(\"*<vgUMAQMHHHDB^T\fAAE\u0010RDT][W[T^\u0000\u001d_^Poow\"jtbh)knxyeigrqgw5gcyk};ndlz>CTW\u001d\u001bR9\u0011\u0007\u001fQAbnois$jznf)mj~y{uyrwcq5iowk{%<¢®¯©³äªº®¦éí´º¼´¥÷¡¦³µ¿ù»²¬©ÃÓÎÓÝëð ôèæòäãçéëâê¬úúöþ±ãäýûý»ÒÝÕ²ìïÍÕÉÅÃÃÎÏÒÛÝÁÝÉÞÖõùøþä³ýíùñ¾úýéîìâîåàôæ¢þøàüì²«Sp|}{a6qqw~;om{|igkf`%ebz}cmeno{U\u000b\u0012\f/#\"$>i..(!d02$#6849?z:=%\"<2:10$\n@EM?\u0007\u001d\u0017f(28JJH{nh\u0018\u001f\u0019\u001cMX^.)/*\b\f\u0018\u0017\u0015\u001e~\u0014\u0015\b}\u0017:'\t9()\";%2q=:! -;-!-/deùúâüìøêêåúùÚÖ×ÑËÙ×ßÕÅÓ×ÐØßÁÏÇÌÍÙÇ¯ÊÁÞÎÕ°ÕÙÅÊÖó³¬ôº´½ø«¿°ª¡¥¾æ¦¡¹¾ ®¦­¬¸ÖÂÄØÄÐÇÙØÖÑÑÉÁÇÍÈÂÌÂÂÏÍ\u0002!-,*0g'-,k)(>;'7903!1w\"6x(.2.:dA\u001a9542(;) < !t\u0007\u0010\u0011h(/?8&((#\"6 ~gPs~xb5qcjvjk>~yqvhfnedpn$®©½º ®¢©¤°¢³ÖÝÓÊ¾²³µ¯ø¼®§»§¦ó»´·á£ÆÍß", 346, 4, 10), bArr2);
            r11.f4003 = C4016.m2532(C3727.m1052("\u0006 ;-'#-h$#70c15/-;}(\"*<vgUMAQMHHHDB^T\fAAE\u0010RDT][W[T^\u0000\u001d_^Poow\"jtbh)knxyeigrqgw5gcyk};ndlz>CTW\u001d\u001bR9\u0011\u0007\u001fQAbnois$jznf)mj~y{uyrwcq5iowk{%<¢®¯©³äªº®¦éí´º¼´¥÷¡¦³µ¿ù»²¬©ÃÓÎÓÝëð ôèæòäãçéëâê¬úúöþ±ãäýûý»ÒÝÕ²ìïÍÕÉÅÃÃÎÏÒÛÝÁÝÉÞÖõùøþä³ýíùñ¾úýéîìâîåàôæ¢þøàüì²«Sp|}{a6qqw~;om{|igkf`%ebz}cmeno{U\u000b\u0012\f/#\"$>i..(!d02$#6849?z:=%\"<2:10$\n@EM?\u0007\u001d\u0017f(28JJH{nh\u0018\u001f\u0019\u001cMX^.)/*\b\f\u0018\u0017\u0015\u001e~\u0014\u0015\b}\u0017:'\t9()\";%2q=:! -;-!-/deùúâüìøêêåúùÚÖ×ÑËÙ×ßÕÅÓ×ÐØßÁÏÇÌÍÙÇ¯ÊÁÞÎÕ°ÕÙÅÊÖó³¬ôº´½ø«¿°ª¡¥¾æ¦¡¹¾ ®¦­¬¸ÖÂÄØÄÐÇÙØÖÑÑÉÁÇÍÈÂÌÂÂÏÍ\u0002!-,*0g'-,k)(>;'7903!1w\"6x(.2.:dA\u001a9542(;) < !t\u0007\u0010\u0011h(/?8&((#\"6 ~gPs~xb5qcjvjk>~yqvhfnedpn$®©½º ®¢©¤°¢³ÖÝÓÊ¾²³µ¯ø¼®§»§¦ó»´·á£ÆÍß", 350, 6, 35), bArr2);
            Date notBefore = r10.getNotBefore();
            String str3 = C3873.f1725;
            r11.f4001 = C3873.m1905(notBefore, str3);
            r11.f4004 = C3873.m1905(r10.getNotAfter(), str3);
            Vector vector = new Vector();
            Set<String> criticalExtensionOIDs = r10.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                for (String next : criticalExtensionOIDs) {
                    vector.add(new C4009(next, r10.getExtensionValue(next), true));
                }
            }
            Set<String> nonCriticalExtensionOIDs = r10.getNonCriticalExtensionOIDs();
            if (nonCriticalExtensionOIDs != null) {
                for (String next2 : nonCriticalExtensionOIDs) {
                    vector.add(new C4009(next2, r10.getExtensionValue(next2), false));
                }
            }
            r11.f4007 = vector;
            r11.f3995 = r10.getIssuerDN().toString();
            r11.f4005 = r10.getIssuerX500Principal().getName(C3727.m1052("\u0006 ;-'#-h$#70c15/-;}(\"*<vgUMAQMHHHDB^T\fAAE\u0010RDT][W[T^\u0000\u001d_^Poow\"jtbh)knxyeigrqgw5gcyk};ndlz>CTW\u001d\u001bR9\u0011\u0007\u001fQAbnois$jznf)mj~y{uyrwcq5iowk{%<¢®¯©³äªº®¦éí´º¼´¥÷¡¦³µ¿ù»²¬©ÃÓÎÓÝëð ôèæòäãçéëâê¬úúöþ±ãäýûý»ÒÝÕ²ìïÍÕÉÅÃÃÎÏÒÛÝÁÝÉÞÖõùøþä³ýíùñ¾úýéîìâîåàôæ¢þøàüì²«Sp|}{a6qqw~;om{|igkf`%ebz}cmeno{U\u000b\u0012\f/#\"$>i..(!d02$#6849?z:=%\"<2:10$\n@EM?\u0007\u001d\u0017f(28JJH{nh\u0018\u001f\u0019\u001cMX^.)/*\b\f\u0018\u0017\u0015\u001e~\u0014\u0015\b}\u0017:'\t9()\";%2q=:! -;-!-/deùúâüìøêêåúùÚÖ×ÑËÙ×ßÕÅÓ×ÐØßÁÏÇÌÍÙÇ¯ÊÁÞÎÕ°ÕÙÅÊÖó³¬ôº´½ø«¿°ª¡¥¾æ¦¡¹¾ ®¦­¬¸ÖÂÄØÄÐÇÙØÖÑÑÉÁÇÍÈÂÌÂÂÏÍ\u0002!-,*0g'-,k)(>;'7903!1w\"6x(.2.:dA\u001a9542(;) < !t\u0007\u0010\u0011h(/?8&((#\"6 ~gPs~xb5qcjvjk>~yqvhfnedpn$®©½º ®¢©¤°¢³ÖÝÓÊ¾²³µ¯ø¼®§»§¦ó»´·á£ÆÍß", 356, 7, 74));
            try {
                KeyStore keyStore = this.f4032;
                if (keyStore != null) {
                    r11.f4009 = keyStore.getCertificateAlias(r10);
                    if (this.f4032.getProvider() != null) {
                        if ("BC".equals(this.f4032.getProvider().getName())) {
                            Enumeration<String> aliases = this.f4032.aliases();
                            if (aliases.hasMoreElements()) {
                                r11.f4009 = aliases.nextElement();
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
            }
            PublicKey publicKey = r10.getPublicKey();
            if (publicKey != null) {
                publicKey.getEncoded();
            }
            if (publicKey != null) {
                str2 = publicKey.getAlgorithm();
            }
            r11.f4010 = str2;
            PublicKey publicKey2 = r10.getPublicKey();
            if (publicKey2 instanceof RSAPublicKey) {
                ((RSAPublicKey) publicKey2).getModulus().bitLength();
            } else if (publicKey2 instanceof DSAPublicKey) {
                ((DSAPublicKey) publicKey2).getY().bitLength();
            }
            if (r10.getSerialNumber().signum() < 0) {
                r11.f3998 = new BigInteger(1, r10.getSerialNumber().toByteArray()).toString(16);
            } else {
                r11.f3998 = r10.getSerialNumber().toString(16);
            }
            r11.f4000 = r10.getSigAlgName();
            r11.f3996 = r10.getSubjectDN().getName();
            r11.f3997 = r10.getSubjectX500Principal().getName(C3727.m1052("\u0006 ;-'#-h$#70c15/-;}(\"*<vgUMAQMHHHDB^T\fAAE\u0010RDT][W[T^\u0000\u001d_^Poow\"jtbh)knxyeigrqgw5gcyk};ndlz>CTW\u001d\u001bR9\u0011\u0007\u001fQAbnois$jznf)mj~y{uyrwcq5iowk{%<¢®¯©³äªº®¦éí´º¼´¥÷¡¦³µ¿ù»²¬©ÃÓÎÓÝëð ôèæòäãçéëâê¬úúöþ±ãäýûý»ÒÝÕ²ìïÍÕÉÅÃÃÎÏÒÛÝÁÝÉÞÖõùøþä³ýíùñ¾úýéîìâîåàôæ¢þøàüì²«Sp|}{a6qqw~;om{|igkf`%ebz}cmeno{U\u000b\u0012\f/#\"$>i..(!d02$#6849?z:=%\"<2:10$\n@EM?\u0007\u001d\u0017f(28JJH{nh\u0018\u001f\u0019\u001cMX^.)/*\b\f\u0018\u0017\u0015\u001e~\u0014\u0015\b}\u0017:'\t9()\";%2q=:! -;-!-/deùúâüìøêêåúùÚÖ×ÑËÙ×ßÕÅÓ×ÐØßÁÏÇÌÍÙÇ¯ÊÁÞÎÕ°ÕÙÅÊÖó³¬ôº´½ø«¿°ª¡¥¾æ¦¡¹¾ ®¦­¬¸ÖÂÄØÄÐÇÙØÖÑÑÉÁÇÍÈÂÌÂÂÏÍ\u0002!-,*0g'-,k)(>;'7903!1w\"6x(.2.:dA\u001a9542(;) < !t\u0007\u0010\u0011h(/?8&((#\"6 ~gPs~xb5qcjvjk>~yqvhfnedpn$®©½º ®¢©¤°¢³ÖÝÓÊ¾²³µ¯ø¼®§»§¦ó»´·á£ÆÍß", 363, 7, 115));
            Integer.toString(r10.getVersion());
        }
        return r11;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3716(X509Certificate x509Certificate) {
        this.f4035 = x509Certificate;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String m3718(String str, byte[] bArr) {
        if (this.f2341 >= 6) {
            return super.m2221(str, bArr);
        }
        X509Certificate r42 = m3714("", "", str, bArr);
        byte[] bArr2 = C3596.f365;
        PublicKey publicKey = r42 != null ? r42.getPublicKey() : null;
        if (publicKey != null) {
            bArr2 = publicKey.getEncoded();
        }
        return new String(C3823.m1606(bArr2, C3727.m1052("\u0006 ;-'#-h$#70c15/-;}(\"*<vgUMAQMHHHDB^T\fAAE\u0010RDT][W[T^\u0000\u001d_^Poow\"jtbh)knxyeigrqgw5gcyk};ndlz>CTW\u001d\u001bR9\u0011\u0007\u001fQAbnois$jznf)mj~y{uyrwcq5iowk{%<¢®¯©³äªº®¦éí´º¼´¥÷¡¦³µ¿ù»²¬©ÃÓÎÓÝëð ôèæòäãçéëâê¬úúöþ±ãäýûý»ÒÝÕ²ìïÍÕÉÅÃÃÎÏÒÛÝÁÝÉÞÖõùøþä³ýíùñ¾úýéîìâîåàôæ¢þøàüì²«Sp|}{a6qqw~;om{|igkf`%ebz}cmeno{U\u000b\u0012\f/#\"$>i..(!d02$#6849?z:=%\"<2:10$\n@EM?\u0007\u001d\u0017f(28JJH{nh\u0018\u001f\u0019\u001cMX^.)/*\b\f\u0018\u0017\u0015\u001e~\u0014\u0015\b}\u0017:'\t9()\";%2q=:! -;-!-/deùúâüìøêêåúùÚÖ×ÑËÙ×ßÕÅÓ×ÐØßÁÏÇÌÍÙÇ¯ÊÁÞÎÕ°ÕÙÅÊÖó³¬ôº´½ø«¿°ª¡¥¾æ¦¡¹¾ ®¦­¬¸ÖÂÄØÄÐÇÙØÖÑÑÉÁÇÍÈÂÌÂÂÏÍ\u0002!-,*0g'-,k)(>;'7903!1w\"6x(.2.:dA\u001a9542(;) < !t\u0007\u0010\u0011h(/?8&((#\"6 ~gPs~xb5qcjvjk>~yqvhfnedpn$®©½º ®¢©¤°¢³ÖÝÓÊ¾²³µ¯ø¼®§»§¦ó»´·á£ÆÍß", 370, 10, 32)));
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public C3971[] m3719(String str) {
        if (this.f2341 >= 6) {
            return super.m2224(str);
        }
        Vector vector = new Vector();
        Certificate[] certificateChain = getCertificateChain(str);
        for (int i10 = 0; i10 < certificateChain.length; i10++) {
            if (certificateChain[i10] instanceof X509Certificate) {
                try {
                    vector.add(new C3971(this.f2341, this.f4034, this.f2339, ((X509Certificate) certificateChain[i10]).getSubjectDN().getName(), C4058.f2976));
                } catch (C3625 e10) {
                    if (e10.f605 == 272) {
                        try {
                            vector.add(new C3971(((X509Certificate) certificateChain[i10]).getEncoded()));
                        } catch (Exception e11) {
                            throw new C3625((Throwable) e11, C3625.m589(e11));
                        }
                    } else {
                        throw e10;
                    }
                }
            }
        }
        return (C3971[]) vector.toArray(new C3971[0]);
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public String m3720(String str) {
        if (this.f2341 >= 6) {
            return "";
        }
        try {
            KeyStore keyStore = this.f4032;
            if (keyStore != null) {
                return keyStore.getCertificateAlias(keyStore.getCertificate(str));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b A[Catch:{ Exception -> 0x0072, all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0074 A[Catch:{ Exception -> 0x0072, all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080 A[SYNTHETIC, Splitter:B:48:0x0080] */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3715(int r12, byte[] r13, java.lang.String r14) {
        /*
            r11 = this;
            r0 = 1
            r1 = 6
            if (r12 < r1) goto L_0x0008
            super.m2217(r12, r13, r14)
            return
        L_0x0008:
            r1 = 0
            r11.f4032 = r1
            r11.f4035 = r1
            r2 = 10
            r3 = 2
            java.lang.String r4 = "\u0006 ;-'#-h$#70c15/-;}(\"*<vgUMAQMHHHDB^T\fAAE\u0010RDT][W[T^\u0000\u001d_^Poow\"jtbh)knxyeigrqgw5gcyk};ndlz>CTW\u001d\u001bR9\u0011\u0007\u001fQAbnois$jznf)mj~y{uyrwcq5iowk{%<¢®¯©³äªº®¦éí´º¼´¥÷¡¦³µ¿ù»²¬©ÃÓÎÓÝëð ôèæòäãçéëâê¬úúöþ±ãäýûý»ÒÝÕ²ìïÍÕÉÅÃÃÎÏÒÛÝÁÝÉÞÖõùøþä³ýíùñ¾úýéîìâîåàôæ¢þøàüì²«Sp|}{a6qqw~;om{|igkf`%ebz}cmeno{U\u000b\u0012\f/#\"$>i..(!d02$#6849?z:=%\"<2:10$\n@EM?\u0007\u001d\u0017f(28JJH{nh\u0018\u001f\u0019\u001cMX^.)/*\b\f\u0018\u0017\u0015\u001e~\u0014\u0015\b}\u0017:'\t9()\";%2q=:! -;-!-/deùúâüìøêêåúùÚÖ×ÑËÙ×ßÕÅÓ×ÐØßÁÏÇÌÍÙÇ¯ÊÁÞÎÕ°ÕÙÅÊÖó³¬ôº´½ø«¿°ª¡¥¾æ¦¡¹¾ ®¦­¬¸ÖÂÄØÄÐÇÙØÖÑÑÉÁÇÍÈÂÌÂÂÏÍ\u0002!-,*0g'-,k)(>;'7903!1w\"6x(.2.:dA\u001a9542(;) < !t\u0007\u0010\u0011h(/?8&((#\"6 ~gPs~xb5qcjvjk>~yqvhfnedpn$®©½º ®¢©¤°¢³ÖÝÓÊ¾²³µ¯ø¼®§»§¦ó»´·á£ÆÍß"
            if (r12 < r3) goto L_0x00e7
            r5 = 31
            r6 = 3
            r7 = 271(0x10f, float:3.8E-43)
            if (r12 == r3) goto L_0x0052
            if (r12 == r6) goto L_0x0025
            r8 = 4
            if (r12 == r8) goto L_0x0052
            r8 = 5
            if (r12 == r8) goto L_0x0025
            r0 = r1
            goto L_0x005b
        L_0x0025:
            java.lang.String r8 = nts.C3823.f1540
            r8 = 0
        L_0x0028:
            int r9 = r13.length
            if (r8 >= r9) goto L_0x0048
            byte r9 = r13[r8]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 43
            if (r9 >= r10) goto L_0x0041
            r10 = 32
            if (r9 == r10) goto L_0x0041
            r10 = 13
            if (r9 == r10) goto L_0x0041
            if (r9 == r2) goto L_0x0041
            r10 = 9
            if (r9 != r10) goto L_0x004c
        L_0x0041:
            r10 = 122(0x7a, float:1.71E-43)
            if (r9 <= r10) goto L_0x0046
            goto L_0x004c
        L_0x0046:
            int r8 = r8 + r0
            goto L_0x0028
        L_0x0048:
            byte[] r13 = nts.C3823.m1618((int) r0, (byte[]) r13)
        L_0x004c:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r13)
            goto L_0x005b
        L_0x0052:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r2 = nts.C3823.m1592((byte[]) r13)     // Catch:{ Exception -> 0x00c5 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00c5 }
        L_0x005b:
            java.lang.String r2 = r11.f2343     // Catch:{ Exception -> 0x0072 }
            java.security.KeyStore r2 = nts.C4016.m2542((int) r12, (java.lang.String) r2)     // Catch:{ Exception -> 0x0072 }
            r11.f4032 = r2     // Catch:{ Exception -> 0x0072 }
            if (r14 == 0) goto L_0x0074
            int r2 = r14.length()     // Catch:{ Exception -> 0x0072 }
            if (r2 <= 0) goto L_0x0074
            char[] r2 = r14.toCharArray()     // Catch:{ Exception -> 0x0072 }
            goto L_0x0079
        L_0x0070:
            r12 = move-exception
            goto L_0x00bf
        L_0x0072:
            r12 = move-exception
            goto L_0x009e
        L_0x0074:
            if (r12 == r3) goto L_0x008e
            if (r12 == r6) goto L_0x008e
            r2 = r1
        L_0x0079:
            java.security.KeyStore r3 = r11.f4032     // Catch:{ Exception -> 0x0072 }
            r3.load(r0, r2)     // Catch:{ Exception -> 0x0072 }
            if (r0 == 0) goto L_0x0083
            r0.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            r11.f2341 = r12
            r11.f4034 = r13
            r11.f2339 = r14
            java.lang.String r12 = r11.f2343
            r11.f2343 = r12
            return
        L_0x008e:
            nts.Ԕ r12 = new nts.Ԕ     // Catch:{ Exception -> 0x0072 }
            r13 = 130(0x82, float:1.82E-43)
            r14 = 113(0x71, float:1.58E-43)
            r2 = 49
            java.lang.String r13 = nts.C3727.m1052((java.lang.String) r4, (int) r13, (int) r14, (int) r2)     // Catch:{ Exception -> 0x0072 }
            r12.<init>(r1, r7, r13)     // Catch:{ Exception -> 0x0072 }
            throw r12     // Catch:{ Exception -> 0x0072 }
        L_0x009e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r13.<init>()     // Catch:{ all -> 0x0070 }
            r14 = 243(0xf3, float:3.4E-43)
            r2 = 121(0x79, float:1.7E-43)
            java.lang.String r14 = nts.C3727.m1052((java.lang.String) r4, (int) r14, (int) r5, (int) r2)     // Catch:{ all -> 0x0070 }
            r13.append(r14)     // Catch:{ all -> 0x0070 }
            java.lang.String r12 = nts.C3625.m592(r12)     // Catch:{ all -> 0x0070 }
            r13.append(r12)     // Catch:{ all -> 0x0070 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x0070 }
            nts.Ԕ r13 = new nts.Ԕ     // Catch:{ all -> 0x0070 }
            r13.<init>(r1, r7, r12)     // Catch:{ all -> 0x0070 }
            throw r13     // Catch:{ all -> 0x0070 }
        L_0x00bf:
            if (r0 == 0) goto L_0x00c4
            r0.close()     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            throw r12
        L_0x00c5:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r14 = 99
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r14 = nts.C3727.m1052((java.lang.String) r4, (int) r14, (int) r5, (int) r0)
            r13.append(r14)
            java.lang.String r12 = nts.C3625.m592(r12)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            nts.Ԕ r13 = new nts.Ԕ
            r13.<init>(r1, r7, r12)
            throw r13
        L_0x00e7:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r14 = 65
            r0 = 120(0x78, float:1.68E-43)
            r3 = 24
            java.lang.String r14 = nts.C3727.m1052((java.lang.String) r4, (int) r3, (int) r14, (int) r0)
            r13.append(r14)
            r13.append(r12)
            r12 = 89
            r14 = 37
            java.lang.String r12 = nts.C3727.m1052((java.lang.String) r4, (int) r12, (int) r2, (int) r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            nts.Ԕ r13 = new nts.Ԕ
            r14 = 702(0x2be, float:9.84E-43)
            r13.<init>(r1, r14, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4192.m3715(int, byte[], java.lang.String):void");
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public boolean m3708(String str) {
        if (this.f2341 >= 6) {
            return super.m2209(str);
        }
        try {
            return this.f4032.isKeyEntry(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public X509Certificate m3714(String str, String str2, String str3, byte[] bArr) {
        if (this.f4032 == null) {
            X509Certificate x509Certificate = this.f4035;
            if (x509Certificate != null && x509Certificate.getSubjectDN().getName().equals(str3) && str.length() == 0 && str2.length() == 0 && bArr.length == 0) {
                return this.f4035;
            }
            return null;
        } else if ((str.length() == 0 || str2.length() == 0) && ((str3 == null || str3.length() == 0) && (bArr == null || bArr.length == 0))) {
            return null;
        } else {
            if (str3 != null) {
                str3 = C4016.m2531(str3).toLowerCase();
            }
            try {
                Enumeration<String> aliases = this.f4032.aliases();
                while (aliases.hasMoreElements()) {
                    String nextElement = aliases.nextElement();
                    if (this.f4032.isKeyEntry(nextElement) || this.f4032.isCertificateEntry(nextElement)) {
                        Certificate certificate = this.f4032.getCertificate(nextElement);
                        if (certificate == null) {
                            continue;
                        } else if (certificate instanceof X509Certificate) {
                            X509Certificate x509Certificate2 = (X509Certificate) certificate;
                            if (str.length() <= 0 || str2.length() <= 0) {
                                if (str3 != null && str3.length() > 0 && (str3.equals(Marker.ANY_MARKER) || C4016.m2531(x509Certificate2.getSubjectDN().getName()).toLowerCase().indexOf(str3) >= 0)) {
                                    return x509Certificate2;
                                }
                            } else if (str.equals(x509Certificate2.getIssuerDN().toString()) && str2.equals(x509Certificate2.getSerialNumber().toString(16))) {
                                return x509Certificate2;
                            }
                            if (C3823.m1601(x509Certificate2.getEncoded(), bArr) || C3874.m1912(x509Certificate2.getEncoded(), bArr)) {
                                return x509Certificate2;
                            }
                        }
                    }
                }
                throw new C3625((Throwable) null, 272, C3727.m1052("\u0006 ;-'#-h$#70c15/-;}(\"*<vgUMAQMHHHDB^T\fAAE\u0010RDT][W[T^\u0000\u001d_^Poow\"jtbh)knxyeigrqgw5gcyk};ndlz>CTW\u001d\u001bR9\u0011\u0007\u001fQAbnois$jznf)mj~y{uyrwcq5iowk{%<¢®¯©³äªº®¦éí´º¼´¥÷¡¦³µ¿ù»²¬©ÃÓÎÓÝëð ôèæòäãçéëâê¬úúöþ±ãäýûý»ÒÝÕ²ìïÍÕÉÅÃÃÎÏÒÛÝÁÝÉÞÖõùøþä³ýíùñ¾úýéîìâîåàôæ¢þøàüì²«Sp|}{a6qqw~;om{|igkf`%ebz}cmeno{U\u000b\u0012\f/#\"$>i..(!d02$#6849?z:=%\"<2:10$\n@EM?\u0007\u001d\u0017f(28JJH{nh\u0018\u001f\u0019\u001cMX^.)/*\b\f\u0018\u0017\u0015\u001e~\u0014\u0015\b}\u0017:'\t9()\";%2q=:! -;-!-/deùúâüìøêêåúùÚÖ×ÑËÙ×ßÕÅÓ×ÐØßÁÏÇÌÍÙÇ¯ÊÁÞÎÕ°ÕÙÅÊÖó³¬ôº´½ø«¿°ª¡¥¾æ¦¡¹¾ ®¦­¬¸ÖÂÄØÄÐÇÙØÖÑÑÉÁÇÍÈÂÌÂÂÏÍ\u0002!-,*0g'-,k)(>;'7903!1w\"6x(.2.:dA\u001a9542(;) < !t\u0007\u0010\u0011h(/?8&((#\"6 ~gPs~xb5qcjvjk>~yqvhfnedpn$®©½º ®¢©¤°¢³ÖÝÓÊ¾²³µ¯ø¼®§»§¦ó»´·á£ÆÍß", 309, 34, 88));
            } catch (Exception e10) {
                throw new C3625((Throwable) null, 272, C3727.m1052("\u0006 ;-'#-h$#70c15/-;}(\"*<vgUMAQMHHHDB^T\fAAE\u0010RDT][W[T^\u0000\u001d_^Poow\"jtbh)knxyeigrqgw5gcyk};ndlz>CTW\u001d\u001bR9\u0011\u0007\u001fQAbnois$jznf)mj~y{uyrwcq5iowk{%<¢®¯©³äªº®¦éí´º¼´¥÷¡¦³µ¿ù»²¬©ÃÓÎÓÝëð ôèæòäãçéëâê¬úúöþ±ãäýûý»ÒÝÕ²ìïÍÕÉÅÃÃÎÏÒÛÝÁÝÉÞÖõùøþä³ýíùñ¾úýéîìâîåàôæ¢þøàüì²«Sp|}{a6qqw~;om{|igkf`%ebz}cmeno{U\u000b\u0012\f/#\"$>i..(!d02$#6849?z:=%\"<2:10$\n@EM?\u0007\u001d\u0017f(28JJH{nh\u0018\u001f\u0019\u001cMX^.)/*\b\f\u0018\u0017\u0015\u001e~\u0014\u0015\b}\u0017:'\t9()\";%2q=:! -;-!-/deùúâüìøêêåúùÚÖ×ÑËÙ×ßÕÅÓ×ÐØßÁÏÇÌÍÙÇ¯ÊÁÞÎÕ°ÕÙÅÊÖó³¬ôº´½ø«¿°ª¡¥¾æ¦¡¹¾ ®¦­¬¸ÖÂÄØÄÐÇÙØÖÑÑÉÁÇÍÈÂÌÂÂÏÍ\u0002!-,*0g'-,k)(>;'7903!1w\"6x(.2.:dA\u001a9542(;) < !t\u0007\u0010\u0011h(/?8&((#\"6 ~gPs~xb5qcjvjk>~yqvhfnedpn$®©½º ®¢©¤°¢³ÖÝÓÊ¾²³µ¯ø¼®§»§¦ó»´·á£ÆÍß", 274, 35, 33) + C3625.m592(e10));
            }
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3712(boolean z10) {
        if (z10) {
            this.f4032 = null;
            this.f4035 = null;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3717(C3902 r12) {
        Enumeration<String> enumeration;
        String str;
        if (this.f2341 >= 6) {
            super.m2220(r12);
            return;
        }
        KeyStore keyStore = this.f4032;
        if (keyStore != null) {
            enumeration = keyStore.aliases();
        } else {
            Vector vector = new Vector();
            X509Certificate x509Certificate = this.f4035;
            if (x509Certificate != null) {
                vector.addElement(x509Certificate);
            }
            enumeration = vector.elements();
        }
        while (enumeration.hasMoreElements()) {
            String nextElement = enumeration.nextElement();
            KeyStore keyStore2 = this.f4032;
            Certificate certificate = keyStore2 != null ? keyStore2.getCertificate(nextElement) : null;
            if (certificate instanceof X509Certificate) {
                C3971 r42 = new C3971(7, certificate.getEncoded(), "", Marker.ANY_MARKER, C4058.f2976, "");
                char[] cArr = C3596.f368;
                if (m3709() != null && m3709().length() > 0) {
                    cArr = m3709().toCharArray();
                }
                byte[] r52 = r42.m2312();
                String r62 = r42.m2308();
                String r72 = r42.m2293();
                C4185 r32 = r42.f2419;
                if (r32 == null) {
                    str = "";
                } else {
                    str = r32.f3998;
                }
                r12.m2006(r52, r62, r72, str, this.f4032.getKey(nextElement, cArr) != null);
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public PublicKey m3713(String str, byte[] bArr) {
        if (this.f2341 >= 6) {
            return super.m2214(str, bArr);
        }
        X509Certificate x509Certificate = this.f4035;
        if (x509Certificate != null) {
            return x509Certificate.getPublicKey();
        }
        return null;
    }
}
