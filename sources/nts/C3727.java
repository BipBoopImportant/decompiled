package nts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.nsoftware.ipworks3ds.sdk.core.ClientInformationListener;
import com.nsoftware.ipworks3ds.sdk.core.ClientMultiSelectChallengeListener;
import com.nsoftware.ipworks3ds.sdk.core.ClientOutOfBandChallengeListener;
import com.nsoftware.ipworks3ds.sdk.core.ClientSingleSelectorChallengeListener;
import com.nsoftware.ipworks3ds.sdk.core.ClientTextChallengeListener;
import com.nsoftware.ipworks3ds.sdk.core.ClientWebChallengeListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import qE.C14946f;
import qE.C14950j;
import rE.C14996a;
import rE.C14998c;
import rE.C14999d;
import rE.C15001f;
import tE.C15075d;

/* renamed from: nts.ഇ  reason: contains not printable characters */
public class C3727 {
    /* renamed from: ϴ  reason: contains not printable characters */
    public static boolean m1031(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public static boolean m1032(String str) {
        int length = str == null ? 0 : str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt < '0' || charAt > '9') && charAt != '-' && charAt != '_'))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public static Integer m1033(String str) {
        if (str == null || str.length() <= 0 || str.charAt(0) != '#') {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static boolean m1042(char c10) {
        return c10 == ' ' || c10 == 9;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1045(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 8;
        }
        return i10 == 3 ? 14 : -1;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static long m1081() {
        return System.currentTimeMillis();
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static String m1084(String str) {
        if (str.length() == 0 || m1042(str.charAt(0))) {
            return "";
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            indexOf = str.length();
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public static String m1085(String str) {
        if (str.length() == 0 || m1042(str.charAt(0))) {
            return str.substring(0);
        }
        int indexOf = str.indexOf(": ");
        if (indexOf != -1) {
            return str.substring(indexOf + 2);
        }
        int indexOf2 = str.indexOf(58);
        return indexOf2 == -1 ? "" : str.substring(indexOf2 + 1);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static byte[] m1044(byte[] bArr, byte[] bArr2) {
        if (!C3596.f367) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, m1052("\u0017<+*%50*/m/#/&8\" =;wr\u0003\u0011g~}7,x75/D\u0016\u0013\u0017\u0010\u000e\u0010\u0017\t\tN\u0006\u0006I,\"$&V\u0014\u001f\u001c\u0002\u001f\u0015\u001c\u0010\u001c\u001dY\u0017\u0014``(aq\u0005\u0003\u0013g\r&10?/*05w595<\"8:'!mh\u0019\u000b}dg-6b-/5^\f\t\r\n\u0014\n\r\u0013\u0013T\u001c\u001cS68><L\u000e\u0005\u0006\u0018\u0005\u000f\u0006\n\u0006\u0007C\r\u000ezz2íÈØ¬¼«ª¥µ°ª¯í¯£¯¦¸¢ ½»÷òçþý·¬ø·µ¯ÄÎÉ¬¢¤¦ÖÙàà¨éùï®¹¸·§¢¸½ÿ½±½´ª°²¯©åàõìï¥¾ê¥§½ÖÜÛ¾°¶´ÄËòòº\u000b\u001bo\u001a\n~\u001b0'&)9<&#a#/#*4.,17{~\u000f\u001dkrq; t;9#H\u001a\u001f\u001b\u001c\u0002\u001c\u001b\u0005\u0005B\n\nE .(*Z\u0018\u0013\u0010\u000e\u0013\u0019\u0010\u001c\u0010\u0011U\u001b\u0018ll$GW#4$P", 67, 3, 115));
            Cipher instance = Cipher.getInstance(m1052("\u0017<+*%50*/m/#/&8\" =;wr\u0003\u0011g~}7,x75/D\u0016\u0013\u0017\u0010\u000e\u0010\u0017\t\tN\u0006\u0006I,\"$&V\u0014\u001f\u001c\u0002\u001f\u0015\u001c\u0010\u001c\u001dY\u0017\u0014``(aq\u0005\u0003\u0013g\r&10?/*05w595<\"8:'!mh\u0019\u000b}dg-6b-/5^\f\t\r\n\u0014\n\r\u0013\u0013T\u001c\u001cS68><L\u000e\u0005\u0006\u0018\u0005\u000f\u0006\n\u0006\u0007C\r\u000ezz2íÈØ¬¼«ª¥µ°ª¯í¯£¯¦¸¢ ½»÷òçþý·¬ø·µ¯ÄÎÉ¬¢¤¦ÖÙàà¨éùï®¹¸·§¢¸½ÿ½±½´ª°²¯©åàõìï¥¾ê¥§½ÖÜÛ¾°¶´ÄËòòº\u000b\u001bo\u001a\n~\u001b0'&)9<&#a#/#*4.,17{~\u000f\u001dkrq; t;9#H\u001a\u001f\u001b\u001c\u0002\u001c\u001b\u0005\u0005B\n\nE .(*Z\u0018\u0013\u0010\u000e\u0013\u0019\u0010\u001c\u0010\u0011U\u001b\u0018ll$GW#4$P", 70, 3, 20));
            instance.init(1, secretKeySpec);
            return instance.doFinal(bArr);
        }
        throw new C3625((Throwable) null, 0, m1052("\u0017<+*%50*/m/#/&8\" =;wr\u0003\u0011g~}7,x75/D\u0016\u0013\u0017\u0010\u000e\u0010\u0017\t\tN\u0006\u0006I,\"$&V\u0014\u001f\u001c\u0002\u001f\u0015\u001c\u0010\u001c\u001dY\u0017\u0014``(aq\u0005\u0003\u0013g\r&10?/*05w595<\"8:'!mh\u0019\u000b}dg-6b-/5^\f\t\r\n\u0014\n\r\u0013\u0013T\u001c\u001cS68><L\u000e\u0005\u0006\u0018\u0005\u000f\u0006\n\u0006\u0007C\r\u000ezz2íÈØ¬¼«ª¥µ°ª¯í¯£¯¦¸¢ ½»÷òçþý·¬ø·µ¯ÄÎÉ¬¢¤¦ÖÙàà¨éùï®¹¸·§¢¸½ÿ½±½´ª°²¯©åàõìï¥¾ê¥§½ÖÜÛ¾°¶´ÄËòòº\u000b\u001bo\u001a\n~\u001b0'&)9<&#a#/#*4.,17{~\u000f\u001dkrq; t;9#H\u001a\u001f\u001b\u001c\u0002\u001c\u001b\u0005\u0005B\n\nE .(*Z\u0018\u0013\u0010\u000e\u0013\u0019\u0010\u001c\u0010\u0011U\u001b\u0018ll$GW#4$P", 0, 67, 7));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static boolean m1075(char c10) {
        if (c10 >= 'a' && c10 <= 'z') {
            return true;
        }
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= '0' && c10 <= '9';
        }
        return true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static void m1082(String str, C3948 r22) {
        if (str.length() % 2 == 0) {
            String str2 = C3823.f1540;
            r22.m2162(C3823.m1618(8, str.getBytes()));
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1065(String str, C3948 r42) {
        String str2 = C3823.f1540;
        byte[] bytes = str.getBytes();
        m1071(bytes, 0, bytes.length, 14, r42);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m1052(String str, int i10, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        char c10 = (i12 ^ (i11 ^ i10)) & 255;
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append((char) (((i13 & 255) ^ c10) ^ str.charAt(i13 + i10)));
        }
        return sb2.toString();
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static boolean m1083(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && (charAt < '0' || charAt > '9'))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static Intent m1047(C3730 r11, Activity activity) {
        Intent intent;
        int i10;
        int i11 = 0;
        switch (r11.m1107().ordinal()) {
            case 1:
                intent = new Intent(activity, ClientTextChallengeListener.class);
                break;
            case 2:
                intent = new Intent(activity, ClientSingleSelectorChallengeListener.class);
                break;
            case 3:
                intent = new Intent(activity, ClientMultiSelectChallengeListener.class);
                break;
            case 4:
                intent = new Intent(activity, ClientOutOfBandChallengeListener.class);
                break;
            case 5:
            case 6:
                intent = new Intent(activity, ClientWebChallengeListener.class);
                break;
            case 7:
                intent = new Intent(activity, ClientInformationListener.class);
                break;
            default:
                throw new C15075d(m1052("\u0013)/+-4.a\u000f\f\u001f\u0018\u0003\u001f193y", 0, 18, 84));
        }
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        Intent intent2 = activity.getIntent();
        if (intent2 != null) {
            i11 = intent2.getIntExtra(m1052("\u0013\u001e\u001e\u001c\u0006%\u0004\u001e\u0015\u0018\b\u0002DGSONNaC_FTL499;!\u0002#92?/%\u0001\u0002\u0016\n\u000b\u000b$\u0006\u001a:\u0003\u0011\t@MMOUvWMFK[QDGSONNaC_FTL", 0, 12, 124), 0);
            i10 = intent2.getIntExtra(m1052("\u0013\u001e\u001e\u001c\u0006%\u0004\u001e\u0015\u0018\b\u0002DGSONNaC_FTL499;!\u0002#92?/%\u0001\u0002\u0016\n\u000b\u000b$\u0006\u001a:\u0003\u0011\t@MMOUvWMFK[QDGSONNaC_FTL", 12, 13, 36), -1);
        } else {
            i10 = -1;
        }
        if (i11 == 0 && activity.getTheme().resolveAttribute(C14946f.f130435b, typedValue, true)) {
            i11 = typedValue.data;
        }
        if (i10 == -1 && activity.getTheme().resolveAttribute(C14946f.f130434a, typedValue2, true)) {
            i10 = typedValue2.data;
        }
        if (i11 != 0) {
            intent.putExtra(m1052("\u0013\u001e\u001e\u001c\u0006%\u0004\u001e\u0015\u0018\b\u0002DGSONNaC_FTL499;!\u0002#92?/%\u0001\u0002\u0016\n\u000b\u000b$\u0006\u001a:\u0003\u0011\t@MMOUvWMFK[QDGSONNaC_FTL", 25, 12, 66), i11);
        }
        if (i10 != -1) {
            intent.putExtra(m1052("\u0013\u001e\u001e\u001c\u0006%\u0004\u001e\u0015\u0018\b\u0002DGSONNaC_FTL499;!\u0002#92?/%\u0001\u0002\u0016\n\u000b\u000b$\u0006\u001a:\u0003\u0011\t@MMOUvWMFK[QDGSONNaC_FTL", 37, 13, 72), i10);
        }
        return intent;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m1041(Vector vector, String str) {
        vector.clear();
        if (str != null && str.length() != 0) {
            int i10 = 0;
            while (i10 < str.length()) {
                String str2 = "";
                while (true) {
                    if (i10 < str.length()) {
                        int indexOf = str.indexOf("\r\n", i10);
                        if (indexOf != -1) {
                            str2 = str2 + str.substring(i10, indexOf);
                            i10 = indexOf + 2;
                            if (i10 == str.length() || !m1042(str.charAt(i10))) {
                                break;
                            }
                            str2 = str2 + "\r\n";
                        } else {
                            str2 = str2 + str.substring(i10);
                            i10 = str.length();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (str2.length() != 0) {
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < str2.length()) {
                        char charAt = str2.charAt(i11);
                        if (charAt == '\"') {
                            z10 = !z10;
                        }
                        if (charAt == ':' && !z10) {
                            break;
                        }
                        i11++;
                    }
                    if (i11 < str2.length()) {
                        int i12 = i11 + 1;
                        String trim = str2.substring(0, i11).trim();
                        while (i12 < str2.length() && m1042(str2.charAt(i12))) {
                            i12++;
                        }
                        String trim2 = str2.substring(i12).trim();
                        if (trim.length() == 0) {
                            ((C3673) vector.lastElement()).m795(trim2);
                        } else {
                            vector.addElement(new C3673(trim, trim2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static byte[] m1080(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        if (!C3596.f367) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, m1052("\t\"54;+.41s1=18&<>#%il\u001d\u000f`c)2f)+1Z\b\r\t\u000e\u0010\u000e\t\u0017\u0017P\u0018\u0018W2<:8H\n\u0001\u0002\u001c\u0001\u000b\u0002\u000e\u0002\u0003G\t\n~~6WG5&6DX331\\,6=,M)\u001b\u001f\u0000\f\b\u0000\u0011:-,#36,)k)%) >$&;=qt\u0005\u0017gx{1*~13)B\u0010\u0015\u0011\u0016\b\u0016\u0011\u000f\u000fH\u0000\u0000O*$\" P\u0012\u0019\u001a\u0004\u0019\u0013\u001a\u0016\u001a\u001b_\u0011\u0012ff.öâþúë½¹¦ª®¦ùÒÅÄËÛÞÄÁÁÍÁÈÖÌÎÓÕíÿÙÂÙÛÁªøýùþàþùçç èè§ÂÌÊÈ¸úñòìñûòþòó·ùúÆûúêïïíðêáðõÇÃÜÐÔÜ\u000b 769),63q3?3:$><!'kn\u001f\r}ba+0d+)3X\n\u000f\u000b\f\u0012\f\u000b\u0015\u0015R\u001a\u001aU0>8:J\b\u0003\u0000\u001e\u0003\t\u0000\f\u0000\u0001E\u000b\b||4\u0014\u0004v(8JV==?R\"83\"C'\u0015\u0011\u000e\u0002\u0006\u000e/\u0004\u0013\u0012\u001d\r\b\u0012\u0017U\u0017\u001b\u0017\u001e\u0000\u001a\u0018\u0005\u0003OJ;)YFE\u000f\u0014@\u000f\r\u0017|.+/(6(/11v>>q\u0014\u001a\u001c\u001en,'$:'-$($%a/,XX\u0010° Òöêîÿ©­²¾º²", 67, 3, 69));
            Cipher instance = Cipher.getInstance(m1052("\t\"54;+.41s1=18&<>#%il\u001d\u000f`c)2f)+1Z\b\r\t\u000e\u0010\u000e\t\u0017\u0017P\u0018\u0018W2<:8H\n\u0001\u0002\u001c\u0001\u000b\u0002\u000e\u0002\u0003G\t\n~~6WG5&6DX331\\,6=,M)\u001b\u001f\u0000\f\b\u0000\u0011:-,#36,)k)%) >$&;=qt\u0005\u0017gx{1*~13)B\u0010\u0015\u0011\u0016\b\u0016\u0011\u000f\u000fH\u0000\u0000O*$\" P\u0012\u0019\u001a\u0004\u0019\u0013\u001a\u0016\u001a\u001b_\u0011\u0012ff.öâþúë½¹¦ª®¦ùÒÅÄËÛÞÄÁÁÍÁÈÖÌÎÓÕíÿÙÂÙÛÁªøýùþàþùçç èè§ÂÌÊÈ¸úñòìñûòþòó·ùúÆûúêïïíðêáðõÇÃÜÐÔÜ\u000b 769),63q3?3:$><!'kn\u001f\r}ba+0d+)3X\n\u000f\u000b\f\u0012\f\u000b\u0015\u0015R\u001a\u001aU0>8:J\b\u0003\u0000\u001e\u0003\t\u0000\f\u0000\u0001E\u000b\b||4\u0014\u0004v(8JV==?R\"83\"C'\u0015\u0011\u000e\u0002\u0006\u000e/\u0004\u0013\u0012\u001d\r\b\u0012\u0017U\u0017\u001b\u0017\u001e\u0000\u001a\u0018\u0005\u0003OJ;)YFE\u000f\u0014@\u000f\r\u0017|.+/(6(/11v>>q\u0014\u001a\u001c\u001en,'$:'-$($%a/,XX\u0010° Òöêîÿ©­²¾º²", 70, 20, 38));
            instance.init(1, secretKeySpec, new RC2ParameterSpec(i10, bArr3));
            return instance.doFinal(bArr);
        }
        throw new C3625((Throwable) null, 0, m1052("\t\"54;+.41s1=18&<>#%il\u001d\u000f`c)2f)+1Z\b\r\t\u000e\u0010\u000e\t\u0017\u0017P\u0018\u0018W2<:8H\n\u0001\u0002\u001c\u0001\u000b\u0002\u000e\u0002\u0003G\t\n~~6WG5&6DX331\\,6=,M)\u001b\u001f\u0000\f\b\u0000\u0011:-,#36,)k)%) >$&;=qt\u0005\u0017gx{1*~13)B\u0010\u0015\u0011\u0016\b\u0016\u0011\u000f\u000fH\u0000\u0000O*$\" P\u0012\u0019\u001a\u0004\u0019\u0013\u001a\u0016\u001a\u001b_\u0011\u0012ff.öâþúë½¹¦ª®¦ùÒÅÄËÛÞÄÁÁÍÁÈÖÌÎÓÕíÿÙÂÙÛÁªøýùþàþùçç èè§ÂÌÊÈ¸úñòìñûòþòó·ùúÆûúêïïíðêáðõÇÃÜÐÔÜ\u000b 769),63q3?3:$><!'kn\u001f\r}ba+0d+)3X\n\u000f\u000b\f\u0012\f\u000b\u0015\u0015R\u001a\u001aU0>8:J\b\u0003\u0000\u001e\u0003\t\u0000\f\u0000\u0001E\u000b\b||4\u0014\u0004v(8JV==?R\"83\"C'\u0015\u0011\u000e\u0002\u0006\u000e/\u0004\u0013\u0012\u001d\r\b\u0012\u0017U\u0017\u001b\u0017\u001e\u0000\u001a\u0018\u0005\u0003OJ;)YFE\u000f\u0014@\u000f\r\u0017|.+/(6(/11v>>q\u0014\u001a\u001c\u001en,'$:'-$($%a/,XX\u0010° Òöêîÿ©­²¾º²", 0, 67, 25));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m1040(String str, C3948 r42) {
        if (m1032(str)) {
            m1065(str, r42);
            return;
        }
        throw new C3625((Throwable) null, 502, m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 91, 38, 42));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static int m1034(Socket socket) {
        return socket.getPort();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static byte[] m1043(int i10, byte[] bArr, int i11, int i12) {
        if (i10 == 0) {
            return C3823.m1630(bArr, i11, i12);
        }
        int r32 = m1045(i10);
        if (r32 != -1) {
            C3798 r02 = new C3798((Object) null, new Object());
            r02.f1372 = true;
            r02.f1395 = C3823.m1630(bArr, i11, i12);
            r02.f1390 = r32;
            r02.m1367(2);
            return r02.f1388;
        }
        throw new C3625((Throwable) null, 500, m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 157, 28, 67));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static byte[] m1079(byte[] bArr, byte[] bArr2) {
        if (!C3596.f367) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, m1052("\u0017<+*%50*/m/#/&8\" =;wr\u0003\u0011g~}7,x75/D\u0016\u0013\u0017\u0010\u000e\u0010\u0017\t\tN\u0006\u0006I,\"$&V\u0014\u001f\u001c\u0002\u001f\u0015\u001c\u0010\u001c\u001dY\u0017\u0014``(aq\u0005\u0003\u0013g\r&10?/*05w595<\"8:'!mh\u0019\u000b}dg-6b-/5^\f\t\r\n\u0014\n\r\u0013\u0013T\u001c\u001cS68><L\u000e\u0005\u0006\u0018\u0005\u000f\u0006\n\u0006\u0007C\r\u000ezz2íÈØ¬¼«ª¥µ°ª¯í¯£¯¦¸¢ ½»÷òçþý·¬ø·µ¯ÄÎÉ¬¢¤¦ÖÙàà¨éùï®¹¸·§¢¸½ÿ½±½´ª°²¯©åàõìï¥¾ê¥§½ÖÜÛ¾°¶´ÄËòòº\u000b\u001bo\u001a\n~\u001b0'&)9<&#a#/#*4.,17{~\u000f\u001dkrq; t;9#H\u001a\u001f\u001b\u001c\u0002\u001c\u001b\u0005\u0005B\n\nE .(*Z\u0018\u0013\u0010\u000e\u0013\u0019\u0010\u001c\u0010\u0011U\u001b\u0018ll$GW#4$P", 140, 3, 84));
            Cipher instance = Cipher.getInstance(m1052("\u0017<+*%50*/m/#/&8\" =;wr\u0003\u0011g~}7,x75/D\u0016\u0013\u0017\u0010\u000e\u0010\u0017\t\tN\u0006\u0006I,\"$&V\u0014\u001f\u001c\u0002\u001f\u0015\u001c\u0010\u001c\u001dY\u0017\u0014``(aq\u0005\u0003\u0013g\r&10?/*05w595<\"8:'!mh\u0019\u000b}dg-6b-/5^\f\t\r\n\u0014\n\r\u0013\u0013T\u001c\u001cS68><L\u000e\u0005\u0006\u0018\u0005\u000f\u0006\n\u0006\u0007C\r\u000ezz2íÈØ¬¼«ª¥µ°ª¯í¯£¯¦¸¢ ½»÷òçþý·¬ø·µ¯ÄÎÉ¬¢¤¦ÖÙàà¨éùï®¹¸·§¢¸½ÿ½±½´ª°²¯©åàõìï¥¾ê¥§½ÖÜÛ¾°¶´ÄËòòº\u000b\u001bo\u001a\n~\u001b0'&)9<&#a#/#*4.,17{~\u000f\u001dkrq; t;9#H\u001a\u001f\u001b\u001c\u0002\u001c\u001b\u0005\u0005B\n\nE .(*Z\u0018\u0013\u0010\u000e\u0013\u0019\u0010\u001c\u0010\u0011U\u001b\u0018ll$GW#4$P", 143, 3, 22));
            instance.init(2, secretKeySpec);
            return instance.doFinal(bArr);
        }
        throw new C3625((Throwable) null, 0, m1052("\u0017<+*%50*/m/#/&8\" =;wr\u0003\u0011g~}7,x75/D\u0016\u0013\u0017\u0010\u000e\u0010\u0017\t\tN\u0006\u0006I,\"$&V\u0014\u001f\u001c\u0002\u001f\u0015\u001c\u0010\u001c\u001dY\u0017\u0014``(aq\u0005\u0003\u0013g\r&10?/*05w595<\"8:'!mh\u0019\u000b}dg-6b-/5^\f\t\r\n\u0014\n\r\u0013\u0013T\u001c\u001cS68><L\u000e\u0005\u0006\u0018\u0005\u000f\u0006\n\u0006\u0007C\r\u000ezz2íÈØ¬¼«ª¥µ°ª¯í¯£¯¦¸¢ ½»÷òçþý·¬ø·µ¯ÄÎÉ¬¢¤¦ÖÙàà¨éùï®¹¸·§¢¸½ÿ½±½´ª°²¯©åàõìï¥¾ê¥§½ÖÜÛ¾°¶´ÄËòòº\u000b\u001bo\u001a\n~\u001b0'&)9<&#a#/#*4.,17{~\u000f\u001dkrq; t;9#H\u001a\u001f\u001b\u001c\u0002\u001c\u001b\u0005\u0005B\n\nE .(*Z\u0018\u0013\u0010\u000e\u0013\u0019\u0010\u001c\u0010\u0011U\u001b\u0018ll$GW#4$P", 73, 67, 84));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static long m1035(String str) {
        return new File(str).length();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static String m1036(int i10) {
        switch (i10) {
            case 0:
                return m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 31, 4, 41);
            case 1:
                return m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 35, 6, 57);
            case 2:
                return m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 41, 6, 97);
            case 3:
                return m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 47, 6, 118);
            case 4:
                return m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 53, 6, 118);
            case 5:
                return m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 59, 9, 48);
            case 6:
                return m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 68, 3, 119);
            case 7:
                return m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 71, 3, 103);
            case 8:
                return m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 74, 7, 78);
            default:
                return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0061, code lost:
        if (r9[r10] == ']') goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0064, code lost:
        if (r9.length != r10) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0066, code lost:
        r10 = r10 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0069, code lost:
        r10 = r10 + 1;
     */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1077(char[] r7, int r8, char[] r9, int r10, boolean r11) {
        /*
        L_0x0000:
            int r0 = r9.length
            r1 = 0
            r2 = 1
            if (r0 != r10) goto L_0x000a
            int r7 = r7.length
            if (r7 != r8) goto L_0x0009
            r1 = r2
        L_0x0009:
            return r1
        L_0x000a:
            int r0 = r7.length
            r3 = 42
            if (r0 != r8) goto L_0x0014
            char r0 = r9[r10]
            if (r0 == r3) goto L_0x0014
            return r1
        L_0x0014:
            char r0 = r9[r10]
            if (r0 != r3) goto L_0x002c
            int r3 = r10 + 1
            int r10 = r9.length
            if (r10 != r3) goto L_0x001e
            return r2
        L_0x001e:
            boolean r10 = m1077((char[]) r7, (int) r8, (char[]) r9, (int) r3, (boolean) r11)
            if (r10 == 0) goto L_0x0025
            return r2
        L_0x0025:
            int r10 = r7.length
            if (r10 != r8) goto L_0x0029
            return r1
        L_0x0029:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x002c:
            r3 = 63
            if (r0 != r3) goto L_0x0031
            goto L_0x008b
        L_0x0031:
            r3 = 91
            if (r0 != r3) goto L_0x0070
            int r10 = r10 + 1
        L_0x0037:
            char r0 = r9[r10]
            r3 = 93
            if (r0 == r3) goto L_0x006f
            int r4 = r9.length
            if (r4 != r10) goto L_0x0041
            goto L_0x006f
        L_0x0041:
            char r4 = r7[r8]
            if (r0 != r4) goto L_0x0046
            goto L_0x005f
        L_0x0046:
            int r5 = r10 + 1
            char r5 = r9[r5]
            r6 = 45
            if (r5 != r6) goto L_0x006d
            int r5 = r9.length
            int r6 = r10 + 2
            if (r5 > r6) goto L_0x0054
            return r1
        L_0x0054:
            char r5 = r9[r6]
            if (r0 > r4) goto L_0x005b
            if (r5 < r4) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            if (r0 < r4) goto L_0x006c
            if (r5 > r4) goto L_0x006c
        L_0x005f:
            char r0 = r9[r10]
            if (r0 == r3) goto L_0x008b
            int r0 = r9.length
            if (r0 != r10) goto L_0x0069
            int r10 = r10 + -1
            goto L_0x008b
        L_0x0069:
            int r10 = r10 + 1
            goto L_0x005f
        L_0x006c:
            r10 = r6
        L_0x006d:
            int r10 = r10 + r2
            goto L_0x0037
        L_0x006f:
            return r1
        L_0x0070:
            r3 = 92
            if (r0 != r3) goto L_0x007a
            int r10 = r10 + 1
            int r0 = r9.length
            if (r0 != r10) goto L_0x007a
            return r1
        L_0x007a:
            char r0 = r9[r10]
            char r3 = r7[r8]
            if (r11 == 0) goto L_0x0088
            char r0 = java.lang.Character.toUpperCase(r0)
            char r3 = java.lang.Character.toUpperCase(r3)
        L_0x0088:
            if (r0 == r3) goto L_0x008b
            return r1
        L_0x008b:
            int r10 = r10 + r2
            int r8 = r8 + 1
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3727.m1077(char[], int, char[], int, boolean):boolean");
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m1039(InputStream inputStream, C3948 r62) {
        byte[] bArr = new byte[131072];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    r62.m2163(bArr, read);
                } else {
                    return;
                }
            } catch (IOException e10) {
                throw new C3625((Throwable) null, 113, m1052("SSS6-.9>*OZHG[PYTSR[MFYG ,&sekog{MN@11,osl[\u0017T+g%R\u001e\\\n}\u001d\u0019\u001b<p%SGBedgfa\u000f\u000b\b\t\u000fb\u0000\u0001\u0017\u0012\u000e\u001e\u0010\u0019\u001a\b\u0018sr}|NOLMJ#+ K),:;'+%03%5Z[XYV7sitr2f*s&bxec#w;b/X3XûúøßÞÝÜÛµ±²³µØº»­¨´¤ª£ ²¢ÉÈÇÆÅÈÉÊËÌ¥­¦Í¯ª¼½¡­£¶µ£³ÜÝÞßÐ¨£§©©î»¯á´¦¶¬ ¾ø­²¾ü¾»­¤¸´º·´¢²È´ÃÏÓÕc^P\u0014PWCDVXT_ZN\\\u0018NU\u0005JLV\u0001YJZ\rZJF@L9Tz7_>_3weznmqtt%lfu!o`ax~}km2+", 292, 31, 46) + C3625.m592(e10));
            }
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m1038() {
        C3734 r02 = C3734.f1057;
        r02.m1122(3, 8);
        Context context = r02.f1062;
        Toast.makeText(context, context.getResources().getString(C14950j.f130474b), 1).show();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static String m1037(int i10, int i11, int i12) {
        return m1052("FP&&\u0006\u0010fe 6@B\u0011\u0007qt\u000e#!:,0?j(142a\"&b.,:=0>2?1z\u0014\n\u0011\r\u000e\u000eMcj}g`no\u001d\u001e\u001d\u0014fegq\u0003\u0000\u0005r\u0000\u0003\u0007j\u0018\u001b\u001cU'$-O=>6Q# (6DFFb\u0010\u0012\u0011M?=9q\u0003\u0001\u0004#QSU\u0007uwp4567\u0004\u0005/.\r\f*+23\u001enmmÁ±²±³ÃÁÆï´ÄÇÄëéîüÿýÿæÇ·´³É¹º¼¬ÜßÖÆ¶µ½öôôÄ´¶·¦ÖÔÕÂ²°²éµÅÇÄîìèÅµ·²áÁ±³»¸ÈÊÃîïìïöåæ§×ÖÑ®ÞßØíÐ ¡§B235\u000f~xY)(-l\u001c\u001d\u0018\u0003srv?ONJ7FGM:KJA\n{zp+Z[P&WQTd\u0015\u0013\u0017+Z\\[ QWQ^/),\u0001pvr\n{}z\u001cmkmM<::<MKK7GDDm\u001d\u001e\u001d~\u000e\r\u000f\u0010`cfn\u001e\u001d\u0019\u001folkx\b\u000b\r\u0015efoT$'/F644I9;:h\u0018\u001a\u0018ãáâå´ÄÆÃøñóôòúÍ½¼¿§×ÖÔüºÊËËâíöÔ¤¥¡¬ÝÜÖ×¦§¬Ï¾¸½Ì½»¿éïèòôòÖ§¡¡âãâèý¹ÉÉÊþÿôì¯ßßÝ®ÞÞÝÿÿÿµÅÅÄq\u0000\u0006\u0004d\u0015\u0013\u001el\u001c\u001c\u001d\u001akmoe\u0014\u0012\u001fN>>8y\t\t\u000e`\u0010\u0010\u0014\u000e~~{!QQ[R#%&*ZZZE554k\u001b\u001b\u001d\u0005uurr\u0002\u0002\u0006J::?T$$.\u0003rtwR#%'+Z\\Q\u0002rry\u000f\b\r{\u000b\f\b}\f\n\u0006+Z\\PW'',j\u001a\u001d\u00187G@DG60<\u0010`g`L<;=ß¯¨©ýúúîéêàóãäèÇ·±µÁ±·²ûòôóîèïÿùþìðþ¸ÉÎÏôóôÕ¤££¼ÍÊË°ÀÆÆÁ±·¶÷ññÔ¤¢£åãáñõúÎ¾»¼Åµ°¶úÿúÇ·²±ÿýÿ{\u000b\u000e\u000bN>;84EGE\u0019ilh{\u000b\u000e\fs\u0003\u0006\u0007m\u001d\u0018\u0018,\\YYq\u0001\u0004\u000b4DAO\u0006vruH8<8Z*.+\ty}~s\u0003\b\u0001\u0001qzr\u001fodo\u001clgm\u001enehb\u0012\u0019\u0015U%.!Y)\",U%./I9220@JBf\u0016\u001c\u0015\u0017gmg{\u000b\u0001\nu\u0005\u000f\u0003k\u001b\u0011\u001cH82<y\t\u0003\fÇ·½½»ËÁÀéëêñïü±ÀÂÅ«ÚØÞ¬ÝßÖ¢ÓÑÙýÅ´·¶âáã ÑÒÑûÒ£ ¥Ü­®¨«ÚÙÞóÈ¹º³ååæÍ¼¼¾±ÀÀÁääãÁ°°µúÎ¿¿´þ×¦§¥æäøL=<:3BCDK:;?r\u0003\u0002\u0007\u0006\f\u0011F\u0007\r\u0010G\f|{J:9=l\u001c\u0018\u001e\u001clhn PTVR\"&$<LHHy\t\r\rK;??g\u0017\u0013\u0012J:>?w\u0007\u0003\r\u000f{uodm`hkukkfscdx|ts{k}{`ee5EANY)-\"r\u0003\u0003\u0003<MMMs\u0002\u0005\u0001n\u001f\u0018\u001c\txz¾©¬»»­¬·´«®¤¦õò÷þüÿ¿ÎÌÏÒÉëÙÒÎÔÒÔàØÞÐÓÇñÅËËÄÊÊþùÿ¼ÍÊÌ¼ÍÊÌûûýþ¿ÍÏÍß­¯®þüþÊ¸º»°ÂÀÂ¸¨¡¶¬«¥àÕÏÉÍËÒÈØ¸ª²Ü|w}mw~UOIMKRH(\u0001\u001a\u0002\b\u001c\u0004\u0018\u000b\u0002\u0001\b\u0004\f5\u0018\u0000\u000e\u001681&<;5p\f\u001a\u0016|9/043f#+1b9xyvU]KX[C_VV\u0002\u000b\b\u0001\r\u0005<\u0011\t\u0007\u001d;#a?#$-g/+0&%3)+'}?3?:3w04=?75~*'&d,\"+<.)'l,*3#+6:6s3,p\u000b)4=!1\u001e8\u0000\u001cÏÎÒÙÖûîöúøÆÃ ­¬î´§°¶¢¡ç»º¬¾¸¡³¥µåÌÐÍÜÜùÈÜÐÐÓÚÒÀÐÕÝÄ³§º«²±´¦¦î³©¥²ë«¥¬»¡¦¨ãª£¿¢³³úª´«¼º¹±;+>8f!,14\u0004\u001aJF\u0000M\u0016\f\u0006ksuu\u0016\f\u0006ksuuee-pjfq(hfoxbek i`|app\u0005\u0005M\u0010\n\u0006\u0011H\b\u0006\u000f\u0018\u0002\u0005\u000b@\t\u0000\u001c\u0001\u0010\u0010Y\u001f\u0017\u000b\u000f\u001b\u0011\u0010\u001a\fncb zi~xlo)utbpvo}k{+vdnn.qvÓÔØ°íäïïÿô·ïôüú¼áä¶üúîü³óñòñÿ½íöþø¦ûþÖÐÄÖÙÛØÛÕÝ×ÓÐ×ÜÛÖÓø¥¬§§·¼ÿ½·³ó½»°´´§£¡ì±´ö«¢©©¹²ñ° £ý¡§³»½¸¯¿â®¾ªB\u001f\u0016\u001d\u001d\r\u0006E\u0000\u0010\u0004I\b\u000e\n\u0016S\u0018PG@+\u000e\n\u0010\u0006$#5\u0011\u0016\u001f\"\"/r{pp`k(pkce#ioj}~|`a\fF@TF\tIKHKE\u0007\\[E\u0018\u001dF\f\u0006\u0002B\u0011\u0016589{8<5(5-50t)762$, !(&7o#/',*-#;-a=8<6 \"%ide'}z|hpwhnkfwi{y6kqphxa`ub~uyY¦º¬ä«¾ª« ®§°ª­£²¶··©ó®°±¥°º°·¼³âïî¬÷ëèòèæïøâåë ãÿüæØÖØÄÒÕÀÔÕÞÐÙÎÔÓÝÌÈÉÉ×ÐÎÏÛñÎÄÎÉÂÍåÉåæüncb hfoxjmc(wemftrxk6?44$/\\\u0001\b\u0003\u0003\u0013\u0018[\u0019\u0013\u0017`=4??/$g4$,*\u0003^W\\\\LG\u0004\\GOI;csyt~`<~tp\u0007ZHBB\u0006M_I", i10, i11, i12);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1068(C14996a aVar, Button button) {
        if (aVar != null && button != null) {
            int h10 = aVar.h();
            if (h10 >= 0) {
                Drawable background = button.getBackground();
                int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : -16776961;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius((float) h10);
                gradientDrawable.setColor(color);
                button.setBackground(gradientDrawable);
            }
            Integer r02 = m1033(aVar.g());
            if (r02 != null) {
                m1059(button.getBackground(), r02, true);
            }
            Integer r03 = m1033(aVar.a());
            if (r03 != null) {
                button.setTextColor(r03.intValue());
            }
            Typeface r04 = m1048(button.getContext(), aVar.b());
            if (r04 != null) {
                button.setTypeface(r04);
            }
            int c10 = aVar.c();
            if (c10 > 0) {
                button.setTextSize((float) c10);
            }
            int height = aVar.getHeight();
            if (height > 0) {
                button.setHeight(height);
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1063(Object obj, int i10) {
        try {
            obj.wait((long) i10);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1067(C3861 r22, int i10, C3861 r42) {
        r42.m1860(m1078(i10, r22.f1673.m1923(), 0, r22.f1673.f1728));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static InetAddress m1055(String str, boolean z10) {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            for (int i10 = 0; i10 < allByName.length; i10++) {
                if (z10) {
                    InetAddress inetAddress = allByName[i10];
                    if (inetAddress instanceof Inet6Address) {
                        return inetAddress;
                    }
                }
                if (!z10) {
                    InetAddress inetAddress2 = allByName[i10];
                    if (!(inetAddress2 instanceof Inet6Address)) {
                        return inetAddress2;
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1052("zWNVY\u001cQQE\u0010WWAQTB\tIE\nd|Yv601 6#\"~93/z37*2)%('cb\u0006\u0007\u0004\u0005\t\u0003\u0017\u0001I\u000f\nJ\u001f\u0007\u0019\f\u0006\u001c", 0, 23, 46));
            sb2.append(z10 ? "6" : "4");
            sb2.append(m1052("zWNVY\u001cQQE\u0010WWAQTB\tIE\nd|Yv601 6#\"~93/z37*2)%('cb\u0006\u0007\u0004\u0005\t\u0003\u0017\u0001I\u000f\nJ\u001f\u0007\u0019\f\u0006\u001c", 23, 23, 86));
            sb2.append(str);
            sb2.append("\".");
            throw new C3625((Throwable) null, 0, sb2.toString());
        } catch (Exception e10) {
            throw new C3625(e10, C3625.m591(e10), C3625.m589(e10));
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1070(C14999d dVar, EditText editText) {
        if (dVar != null) {
            Integer r02 = m1033(dVar.g());
            int h10 = dVar.h();
            int i10 = dVar.i();
            if (r02 != null || h10 >= 0 || i10 >= 0) {
                if (h10 < 0) {
                    h10 = 2;
                }
                if (r02 == null) {
                    r02 = -12303292;
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setStroke(h10, r02.intValue());
                if (i10 >= 0) {
                    gradientDrawable.setCornerRadius((float) i10);
                }
                editText.setBackground(gradientDrawable);
            }
            m1061(editText, dVar.a(), (String) null, dVar.b(), dVar.c(), -1, (int[]) null);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static boolean m1076(String str) {
        return new File(str).exists();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static Object m1049(Map map, Object obj) {
        return map.get(obj);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1066(Map map, Object obj, Object obj2) {
        map.put(obj, obj2);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static C3673 m1056(Vector vector, String str) {
        if (vector == null) {
            return null;
        }
        for (int i10 = 0; i10 < vector.size(); i10++) {
            C3673 r22 = (C3673) vector.elementAt(i10);
            if (str.equalsIgnoreCase(r22.f803)) {
                return r22;
            }
        }
        return null;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1073(byte[] bArr, int i10, C3948 r52) {
        r52.m2139(new String(C3823.m1619(8, bArr, 0, i10, true)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1060(android.view.Window r10, android.content.Intent r11) {
        /*
            int r0 = qE.C14948h.f130461t
            android.view.View r10 = r10.findViewById(r0)
            if (r10 == 0) goto L_0x0121
            com.nsoftware.ipworks3ds.sdk.core.SDKToolbarLayout r10 = (com.nsoftware.ipworks3ds.sdk.core.SDKToolbarLayout) r10
            r0 = 0
            if (r11 == 0) goto L_0x0036
            r1 = 12
            r2 = 29
            java.lang.String r3 = "\u0013\u001e\u001e\u001c\u0006%\u0004\u001e\u0015\u0018\b\u0002DGSONNaC_FTL499;!\u0002#92?/%\u0001\u0002\u0016\n\u000b\u000b$\u0006\u001a:\u0003\u0011\t@MMOUvWMFK[QDGSONNaC_FTL"
            r4 = 50
            java.lang.String r1 = m1052((java.lang.String) r3, (int) r4, (int) r1, (int) r2)
            int r1 = r11.getIntExtra(r1, r0)
            if (r1 == 0) goto L_0x0022
            r10.setBackgroundColor(r1)
        L_0x0022:
            r1 = 13
            r2 = 22
            r4 = 62
            java.lang.String r1 = m1052((java.lang.String) r3, (int) r4, (int) r1, (int) r2)
            r2 = -1
            int r11 = r11.getIntExtra(r1, r2)
            if (r11 == r2) goto L_0x0036
            r10.setActionBarHeight(r11)
        L_0x0036:
            nts.ഴ r11 = nts.C3734.f1057
            rE.f r1 = r11.f1068
            if (r1 != 0) goto L_0x0043
            rE.f r1 = new rE.f
            r1.<init>()
            r11.f1068 = r1
        L_0x0043:
            rE.f r11 = r11.f1068
            if (r11 != 0) goto L_0x0049
            goto L_0x0121
        L_0x0049:
            rE.e r1 = r11.g()
            if (r1 == 0) goto L_0x00b3
            java.lang.String r2 = r1.i()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x005c
            r10.setTitle(r2)
        L_0x005c:
            java.lang.String r2 = r1.h()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0069
            r10.setCancelButtonText(r2)
        L_0x0069:
            java.lang.String r2 = r1.g()
            java.lang.Integer r2 = m1033(r2)
            if (r2 == 0) goto L_0x007a
            int r2 = r2.intValue()
            r10.setBackgroundColor(r2)
        L_0x007a:
            java.lang.String r2 = r1.a()
            java.lang.Integer r2 = m1033(r2)
            if (r2 == 0) goto L_0x0092
            int r3 = r2.intValue()
            r10.setTitleTextColor(r3)
            int r2 = r2.intValue()
            r10.setCancelButtonTextColor(r2)
        L_0x0092:
            int r2 = r1.c()
            if (r2 <= 0) goto L_0x009f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.setTitleFontSize(r2)
        L_0x009f:
            android.content.Context r2 = r10.getContext()
            java.lang.String r1 = r1.b()
            android.graphics.Typeface r1 = m1048((android.content.Context) r2, (java.lang.String) r1)
            if (r1 == 0) goto L_0x00b3
            r10.setTitleTypeface(r1)
            r10.setCancelButtonTextTypeface(r1)
        L_0x00b3:
            rE.f$a r1 = rE.C15001f.a.CANCEL
            rE.a r11 = r11.b(r1)
            if (r11 == 0) goto L_0x00c5
            r11.l(r0)
            android.widget.Button r1 = com.nsoftware.ipworks3ds.sdk.core.SDKToolbarLayout.getCancelButton()
            m1068((rE.C14996a) r11, (android.widget.Button) r1)
        L_0x00c5:
            int[] r11 = r11.i()
            if (r11 == 0) goto L_0x0121
            r1 = r11[r0]
            r2 = 1
            r3 = r11[r2]
            r4 = 2
            r5 = r11[r4]
            r6 = 3
            r11 = r11[r6]
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources r8 = r10.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int r9 = qE.C14946f.f130434a
            boolean r10 = r10.resolveAttribute(r9, r7, r2)
            if (r10 == 0) goto L_0x0107
            int r10 = r7.data
            int r10 = android.util.TypedValue.complexToDimensionPixelSize(r10, r8)
            int r10 = r10 / r6
            int r10 = r10 * r4
            if (r3 <= r10) goto L_0x00fe
            r3 = r10
        L_0x00fe:
            if (r11 <= r10) goto L_0x0101
            r11 = r10
        L_0x0101:
            int r2 = r3 + r11
            if (r2 <= r10) goto L_0x0107
            r3 = r0
            goto L_0x0108
        L_0x0107:
            r0 = r11
        L_0x0108:
            int r10 = r8.widthPixels
            int r10 = r10 / 5
            int r10 = r10 * 4
            if (r5 <= r10) goto L_0x0111
            r5 = r10
        L_0x0111:
            android.widget.Button r10 = com.nsoftware.ipworks3ds.sdk.core.SDKToolbarLayout.f120794B
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r10 = (androidx.constraintlayout.widget.ConstraintLayout.b) r10
            r10.topMargin = r3
            r10.bottomMargin = r0
            r10.leftMargin = r1
            r10.rightMargin = r5
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3727.m1060(android.view.Window, android.content.Intent):void");
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static C3678 m1057(Map map) {
        if (map instanceof Hashtable) {
            map = (Map) ((Hashtable) map).clone();
        }
        return new C3678(map.keySet().iterator());
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1061(TextView textView, String str, String str2, String str3, int i10, int i11, int[] iArr) {
        Integer r12 = m1033(str);
        if (r12 != null) {
            textView.setTextColor(r12.intValue());
        }
        Integer r13 = m1033(str2);
        if (r13 != null) {
            textView.setBackgroundColor(r13.intValue());
        }
        Typeface r14 = m1048(textView.getContext(), str3);
        if (r14 != null) {
            textView.setTypeface(r14);
        }
        if (i10 > 0) {
            textView.setTextSize((float) i10);
        }
        if (i11 >= 0) {
            textView.setTextAlignment(i11);
        }
        if (iArr != null && iArr.length == 4) {
            textView.setPaddingRelative(textView.getPaddingStart() + iArr[0], textView.getPaddingTop() + iArr[1], textView.getPaddingEnd() + iArr[2], textView.getPaddingBottom() + iArr[3]);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1072(byte[] bArr, int i10, int i11, C3948 r62) {
        C3798 r02 = new C3798((Object) null, new Object());
        r02.f1381 = false;
        r02.f1372 = false;
        r02.f1395 = C3823.m1630(bArr, i10, i11);
        r02.f1390 = 14;
        try {
            r02.m1367(2);
        } catch (C3625 unused) {
        }
        r62.m2162(r02.f1388);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static Typeface m1048(Context context, String str) {
        Typeface typeface = null;
        if (str == null) {
            return null;
        }
        try {
            typeface = Typeface.createFromAsset(context.getAssets(), str);
        } catch (Exception unused) {
        }
        if (typeface != null) {
            return typeface;
        }
        try {
            typeface = Typeface.createFromFile(str);
        } catch (Exception unused2) {
        }
        if (typeface != null) {
            return typeface;
        }
        try {
            return Typeface.create(str, 0);
        } catch (Exception unused3) {
            return typeface;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1071(byte[] bArr, int i10, int i11, int i12, C3948 r72) {
        C3798 r02 = new C3798((Object) null, new Object());
        r02.f1388 = C3823.m1630(bArr, i10, i11);
        r02.f1390 = i12;
        try {
            r02.m1367(1);
        } catch (C3625 unused) {
        }
        r72.m2162(r02.f1395);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m1053(String str, String str2) {
        if (!C3823.m1590(C3856.f1645)) {
            return "";
        }
        return C4044.m2735(C4044.f2873, -2147483647, str, str2);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1059(Drawable drawable, Integer num, boolean z10) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) mutate;
                if (z10) {
                    rippleDrawable.setColor(ColorStateList.valueOf(num.intValue()));
                }
                m1059(rippleDrawable.getNumberOfLayers() > 0 ? rippleDrawable.getDrawable(0) : null, num, false);
            } else if (mutate instanceof InsetDrawable) {
                m1059(((InsetDrawable) mutate).getDrawable(), num, false);
            } else if (mutate instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) mutate;
                colorDrawable.setTint(num.intValue());
                colorDrawable.setColor(num.intValue());
            } else {
                mutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m1054(Socket socket) {
        return socket.getInetAddress().getHostAddress();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static byte[] m1078(int i10, byte[] bArr, int i11, int i12) {
        if (i10 == 0) {
            return C3823.m1630(bArr, i11, i12);
        }
        int r32 = m1045(i10);
        if (r32 != -1) {
            C3798 r02 = new C3798((Object) null, new Object());
            r02.f1388 = C3823.m1630(bArr, i11, i12);
            r02.f1390 = r32;
            r02.m1367(1);
            return r02.f1395;
        }
        throw new C3625((Throwable) null, 500, m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 129, 28, 104));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1069(C14998c cVar, TextView textView, C15001f.b bVar) {
        String m10 = cVar.m(bVar);
        if (m10 == null) {
            if (bVar == C15001f.b.INFO_HEADER) {
                m10 = cVar.i();
            } else {
                m10 = cVar.a();
            }
        }
        String str = m10;
        String g10 = cVar.g(bVar);
        String n10 = cVar.n(bVar);
        if (n10 == null) {
            if (bVar == C15001f.b.INFO_HEADER) {
                n10 = cVar.j();
            } else {
                n10 = cVar.b();
            }
        }
        m1061(textView, str, g10, n10, m1046(cVar, bVar), -1, cVar.l(bVar));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1046(C14998c cVar, C15001f.b bVar) {
        Integer o10 = cVar.o(bVar);
        if (o10 == null) {
            if (bVar == C15001f.b.INFO_HEADER) {
                o10 = Integer.valueOf(cVar.k());
            } else {
                o10 = Integer.valueOf(cVar.c());
            }
        }
        return o10.intValue();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1062(InputStream inputStream, C3948 r62) {
        byte[] bArr = new byte[262144];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    r62.m2163(bArr, read);
                } else {
                    return;
                }
            } catch (IOException e10) {
                throw new C3625((Throwable) null, 104, m1052("y1(z33+~\"%#\":&#3-h\"$m\n\u0006\u001e\u0012`.-!!ia{q\u0000OU_-*-\u001d\u0007\r}\f\u0016\u001cocn\u0016\f\u0006sprPJPDKC53:}u\u0000nf\u0014NF4SOG4\u0015\u0014\u0017\u0016\u0011{xy\u001e8#5?;5p<6<.:9-=5f,*c  3*xy99&i;\u0003\u0004\u001c\u001a\u0014\\ ÞÁÀ­³´¶·«·¾®¬é«¡¯¢¶º¾¶ö±»§·º¬÷°Ó»Ú»×ÁÅÖÏ", 185, 31, 87) + C3625.m592(e10));
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1064(String str, C3633 r32) {
        C3805 r02 = new C3805();
        r02.m1455(str, ".");
        r02.f1429 = false;
        while (r02.m1452()) {
            r32.m611(r02.m1456());
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static C3951 m1058(C3971 r32) {
        C3951 r02 = new C3951();
        r02.f2322.m3407(C4230.m3854(r32), true);
        return r02;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m1050(int i10, int i11, int i12) {
        return m1052("\u0010P\u001dOT\\MOVDP\u0014\u0000\u001fu\u0010|KNYYO\t~\u0015tuv.iujb}hzj nc~\u0007\u001f\u001b\"8 ;z\u0002\u0014IIJCrosmtTYQQ\t\u0012cnff>%!\u001c\u001e\u0005Q\u0011\u0003\u0002\u0011\u0015\u001c\u001f\r\u0011\u0014\u0014E\u0011\u0014\u0003\u0012@\u0002\fM\t\u0019\u000f\u0005\u001d\n\u001e<;9v'5!!431~6>{.-!g%.-3-#)!:gh¬ÖÒÙÚÆÀÉÊæä÷²°© ò¼¯ÿ­©½¸³£­¢¢á©­â¹¤ªî¡¨¯ÛÇÞØÖ¸ÞÓÒ³ÊÎù¹û¶´¿º°¢µýòõ¸¤é¥¤¸¨ì¦ §¯±¯¤°®©×\u0003\u001e\u0014\u0011\u0004\u0013U\u0002\u0012\t\u0010\f_bc\u001c'%p80u845)=-292!)*4>HW\\WDLOQ[-;0;(%#>NBIBQ\\ZG7\u0010>s';<68=4>>}9-,.2c-&'24;-/j$\"o:\u0019\u0015S6\u0014\u0000\u0016&\u0018\u001b\u0010\u001f\t5\u0011^\u0004\u0016\u0006\f\u0011D\u000f\u0007\u0007\f\u0007\u000f\u001fVO¼ñ¥¹¾´º¿¶¼¼ÿ»¯®¬°á¯¤¥°¶¹¯­è¦ í¸Ñ´¤±ÃÅ×Ì¢ÁÏÑØÝ«§áµ´ª¶ë¯¿­¡ºí¤²¼µ¼²¤ïô\b&k?#$. %,&&e!546*{5>?*,#57r<:w\"\u0001\rK&\u0002\u000bO\u000b\u0017\u0005\r\u0016E\f\u0006\b\u001d\u0014\u001e\bG\\=\u0013^\n\u0016\u0011\u001b\u0015\u0010\u0019\u0013\u0013P\u0014\u0000\u0001\u0003\u001fN\u0000\u000b\n\u001f\u0019\u0016\u0000\u0002G\t\u000fB\u001748~\f\u000b\u0015\t>&#3%\u0011$&;)#:&+(>\"++f\"6$,7\u001cU_Q\\U_I\u000e\u0015¤é½¡¦¬¢§®¤¤ç£·¶´¨ù·¼½¨®¡·µð¾¸õ É»¼¢¾ÇÙËÐ", i10, i11, i12);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m1051(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return exc.getLocalizedMessage() + "\r\n" + stringWriter.toString();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static boolean m1074() {
        Context context = C3734.f1057.f1062;
        if (context == null) {
            return false;
        }
        try {
            if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
