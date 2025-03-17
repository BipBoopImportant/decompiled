package nts;

import android.content.Context;
import android.content.SharedPreferences;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import qE.C14944d;
import tE.C15072a;
import tE.C15075d;

/* renamed from: nts.ഗ  reason: contains not printable characters */
public class C3730 implements C4083 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public static final String f1029 = C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 71, 21, (int) CheckoutActivity.RESULT_ERROR);

    /* renamed from: ગ  reason: contains not printable characters */
    public static final String f1030 = C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 29, 23, 82);

    /* renamed from: ഇ  reason: contains not printable characters */
    public static final String f1031 = C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 0, 29, 83);

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static final String f1032 = C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 52, 19, 60);

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static final String f1033 = C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 92, 21, 114);

    /* renamed from: ⶏ  reason: contains not printable characters */
    public static final String f1034 = C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 113, 21, 38);

    /* renamed from: Е  reason: contains not printable characters */
    public C4176 f1035;

    /* renamed from: и  reason: contains not printable characters */
    public C4208 f1036;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public final C14944d f1037;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public Context f1038;

    /* renamed from: ખ  reason: contains not printable characters */
    public List<C4074> f1039;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public String f1040 = m1088();

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int f1041;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public C3592 f1042;

    public C3730(Context context, C14944d dVar, C4176 r32) {
        this.f1038 = context;
        this.f1037 = dVar;
        this.f1035 = r32;
        this.f1042 = new C3592(r32);
        m1102(context, r32.m3514());
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public final String m1088() {
        String str;
        try {
            str = this.f1038.getPackageManager().getPackageInfo(this.f1038.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        m1096();
        String r22 = this.f1036.m3765();
        SharedPreferences sharedPreferences = this.f1038.getSharedPreferences(f1030, 0);
        String str2 = f1032;
        String string = sharedPreferences.getString(str2, (String) null);
        String str3 = f1033;
        String string2 = sharedPreferences.getString(str3, (String) null);
        String str4 = f1029;
        String string3 = sharedPreferences.getString(str4, (String) null);
        String str5 = f1034;
        String string4 = sharedPreferences.getString(str5, (String) null);
        if (string2 == null || string3 == null || !str.equals(string2) || !r22.equals(string3)) {
            String lowerCase = UUID.randomUUID().toString().toLowerCase();
            String r52 = m1098(lowerCase, str, r22);
            sharedPreferences.edit().putString(str2, lowerCase).commit();
            sharedPreferences.edit().putString(str3, str).commit();
            sharedPreferences.edit().putString(str4, r22).commit();
            sharedPreferences.edit().putString(str5, r52).commit();
            return lowerCase;
        } else if (string != null && string4 != null && m1098(string, string2, string3).equals(string4)) {
            return string;
        } else {
            sharedPreferences.edit().remove(str2).commit();
            sharedPreferences.edit().remove(str3).commit();
            sharedPreferences.edit().remove(str4).commit();
            sharedPreferences.edit().remove(str5).commit();
            throw new C15075d(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 396, 25, 11));
        }
    }

    /* renamed from: Е  reason: contains not printable characters */
    public String m1090() {
        m1096();
        if (m1109()) {
            String stringBuffer = this.f1036.f4076.f687.f2269.toString();
            if (!C3727.m1074()) {
                return stringBuffer;
            }
            String stringBuffer2 = this.f1036.f4076.f723.f2269.toString();
            return stringBuffer2.length() > 0 ? stringBuffer2 : stringBuffer;
        }
        String stringBuffer3 = this.f1036.f4076.f723.f2269.toString();
        if (stringBuffer3.length() > 0) {
            return stringBuffer3;
        }
        String stringBuffer4 = this.f1036.f4076.f687.f2269.toString();
        return stringBuffer4.length() > 0 ? stringBuffer4 : this.f1036.f4076.f702.f2269.toString();
    }

    /* renamed from: и  reason: contains not printable characters */
    public String m1091() {
        C4208 r02 = this.f1036;
        return r02 == null ? "" : r02.f4076.f695.f2269.toString();
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int m1092() {
        try {
            return Integer.parseInt(this.f1036.m3767(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 186, 22, 20)));
        } catch (Exception unused) {
            return 300;
        }
    }

    /* renamed from: ࡑ  reason: contains not printable characters */
    public String m1093() {
        C4208 r02 = this.f1036;
        return r02 == null ? "" : r02.f4076.f711.f2269.toString();
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public String m1094() {
        C4208 r02 = this.f1036;
        return r02 == null ? "" : r02.f4076.f697.f2269.toString();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1096() {
        if (this.f1036 == null) {
            m1102(this.f1038, this.f1035.f3878);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1099() {
        C4208 r02 = this.f1036;
        if (r02 != null) {
            try {
                r02.m3767(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 134, 18, 118));
            } catch (Exception unused) {
            }
            this.f1036 = null;
        }
    }

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int m1106() {
        m1096();
        String r02 = this.f1036.f4076.m2911();
        if (C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 171, 5, 44).equals(r02)) {
            return 0;
        }
        if (C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 176, 5, 33).equals(r02)) {
            return 1;
        }
        return C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 181, 5, 87).equals(r02) ? 2 : -1;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3709 m1107() {
        C4208 r02 = this.f1036;
        if (r02 == null) {
            return C3709.INVALID;
        }
        int i10 = r02.f4076.f689;
        if (1 == i10) {
            return C3709.TEXT;
        }
        if (2 == i10) {
            return C3709.SINGLE_SELECT;
        }
        if (3 == i10) {
            return C3709.MULTI_SELECT;
        }
        if (4 == i10) {
            return C3709.OOB;
        }
        if (5 == i10) {
            return C3709.HTML;
        }
        if (6 == i10) {
            return C3709.HTML_OOB;
        }
        if (7 == i10) {
            return C3709.INFORMATION;
        }
        C3734 r12 = C3734.f1057;
        r12.m1123(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 480, 16, 34) + i10);
        return C3709.INVALID;
    }

    /* renamed from: ᖑ  reason: contains not printable characters */
    public boolean m1109() {
        return m1106() == 2;
    }

    /* renamed from: ᘺ  reason: contains not printable characters */
    public String m1110() {
        C4208 r02 = this.f1036;
        return r02 == null ? "" : r02.f4076.m2914();
    }

    /* renamed from: ⴸ  reason: contains not printable characters */
    public String m1111() {
        m1096();
        if (m1109()) {
            String stringBuffer = this.f1036.f4076.f721.f2269.toString();
            if (!C3727.m1074()) {
                return stringBuffer;
            }
            String stringBuffer2 = this.f1036.f4076.f684.f2269.toString();
            return stringBuffer2.length() > 0 ? stringBuffer2 : stringBuffer;
        }
        String stringBuffer3 = this.f1036.f4076.f684.f2269.toString();
        if (stringBuffer3.length() > 0) {
            return stringBuffer3;
        }
        String stringBuffer4 = this.f1036.f4076.f721.f2269.toString();
        return stringBuffer4.length() > 0 ? stringBuffer4 : this.f1036.f4076.f736.f2269.toString();
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public void m1113(String str) {
        m1096();
        C4208 r12 = this.f1036;
        r12.getClass();
        try {
            r12.f4076.f693.m2139(str);
            if (str != null && str.length() != 0) {
                try {
                    new C3923(this.f1036.f4076.f734, false).clear();
                    Iterator it = ((ArrayList) this.f1042.m351(str)).iterator();
                    while (it.hasNext()) {
                        new C3923(this.f1036.f4076.f734, false).add((C4068) it.next());
                    }
                    try {
                        C4208 r13 = this.f1036;
                        C4068 r22 = this.f1042.m350(str);
                        r13.getClass();
                        r13.f4076.f3045 = r22.f3342;
                        try {
                            C4208 r14 = this.f1036;
                            Map<String, String> map = this.f1042.f345;
                            String str2 = null;
                            String str3 = map != null ? map.get(str) : null;
                            if (str3 != null) {
                                if (str3.length() != 0) {
                                    str2 = str3;
                                    r14.getClass();
                                    r14.f4076.f696.m2139(str2);
                                }
                            }
                            if (str.length() != 0) {
                                str2 = C3592.f341.get(str.toUpperCase());
                            }
                            r14.getClass();
                            r14.f4076.f696.m2139(str2);
                        } catch (C3625 e10) {
                            throw new C3675(e10);
                        } catch (C3675 e11) {
                            throw new C3986(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 293, 39, 58) + str, e11);
                        }
                    } catch (C3625 e12) {
                        throw new C3675(e12);
                    } catch (C3675 e13) {
                        throw new C3986(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 260, 33, 41) + str, e13);
                    }
                } catch (C3675 e14) {
                    throw new C3986(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 236, 24, 51) + str, e14);
                }
            }
        } catch (C3625 e15) {
            throw new C3675(e15);
        }
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public String m1114() {
        C4208 r02 = this.f1036;
        if (r02 == null) {
            return "";
        }
        return r02.f4076.f678.f2269.toString();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1097(int i10) {
        C4208 r02 = this.f1036;
        if (r02 != null) {
            try {
                r02.f4076.f694 = i10;
            } catch (C3625 e10) {
                throw new C3675(e10);
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m1105(boolean z10) {
        List<String> list = this.f1035.f3873;
        if (list != null) {
            for (String next : list) {
                if (z10 == next.startsWith(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 332, 4, 64))) {
                    try {
                        this.f1036.m3767(next);
                    } catch (C3675 e10) {
                        throw new C15072a(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 336, 33, 24) + next, e10);
                    }
                }
            }
        }
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public void m1115(String str) {
        C4208 r02 = this.f1036;
        if (r02 != null) {
            try {
                r02.f4076.f692.m2139(str);
            } catch (C3625 e10) {
                throw new C3675(e10);
            }
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public String m1095(String str) {
        C4208 r02 = this.f1036;
        if (r02 == null) {
            return "";
        }
        return r02.m3767(str);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m1102(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            nts.チ r0 = new nts.チ
            r0.<init>(r6, r7)
            r5.f1036 = r0
            r6 = 1
            r5.m1105((boolean) r6)
            monitor-enter(r5)
            nts.チ r7 = r5.f1036     // Catch:{ TooManyListenersException -> 0x0019 }
            monitor-enter(r7)     // Catch:{ TooManyListenersException -> 0x0019 }
            r7.f4075 = r5     // Catch:{ all -> 0x0016 }
            monitor-exit(r7)     // Catch:{ TooManyListenersException -> 0x0019 }
            goto L_0x0019
        L_0x0013:
            r6 = move-exception
            goto L_0x00a4
        L_0x0016:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ TooManyListenersException -> 0x0019 }
            throw r0     // Catch:{ TooManyListenersException -> 0x0019 }
        L_0x0019:
            monitor-exit(r5)     // Catch:{ all -> 0x0013 }
            nts.チ r7 = r5.f1036     // Catch:{ ࢧ -> 0x009d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ࢧ -> 0x009d }
            r0.<init>()     // Catch:{ ࢧ -> 0x009d }
            java.lang.String r1 = "}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá"
            r2 = 369(0x171, float:5.17E-43)
            r3 = 19
            r4 = 58
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r1, (int) r2, (int) r3, (int) r4)     // Catch:{ ࢧ -> 0x009d }
            r0.append(r1)     // Catch:{ ࢧ -> 0x009d }
            java.lang.String r1 = f1031     // Catch:{ ࢧ -> 0x009d }
            r0.append(r1)     // Catch:{ ࢧ -> 0x009d }
            java.lang.String r0 = r0.toString()     // Catch:{ ࢧ -> 0x009d }
            r7.m3767(r0)     // Catch:{ ࢧ -> 0x009d }
            r7 = 0
            r5.m1105((boolean) r7)
            java.lang.String r0 = "\u00185$=\u00025=!4(6(<e/(0!\f.%\u0010!+5.< <.\b,:.m73?'0"
            r1 = 71
            r2 = 18
            java.lang.String r7 = nts.C3727.m1052((java.lang.String) r0, (int) r7, (int) r2, (int) r1)     // Catch:{ ࢧ -> 0x0096 }
            r5.m1095((java.lang.String) r7)     // Catch:{ ࢧ -> 0x0096 }
            java.lang.String r7 = "\u00185$=\u00025=!4(6(<e/(0!\f.%\u0010!+5.< <.\b,:.m73?'0"
            r0 = 22
            r1 = 68
            java.lang.String r7 = nts.C3727.m1052((java.lang.String) r7, (int) r2, (int) r0, (int) r1)     // Catch:{ ࢧ -> 0x0096 }
            r5.m1095((java.lang.String) r7)     // Catch:{ ࢧ -> 0x0096 }
            nts.チ r7 = r5.f1036     // Catch:{ ࢧ -> 0x0073, NumberFormatException -> 0x0075 }
            java.lang.String r0 = "}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá"
            r1 = 388(0x184, float:5.44E-43)
            r2 = 8
            r3 = 26
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r0, (int) r1, (int) r2, (int) r3)     // Catch:{ ࢧ -> 0x0073, NumberFormatException -> 0x0075 }
            java.lang.String r7 = r7.m3767(r0)     // Catch:{ ࢧ -> 0x0073, NumberFormatException -> 0x0075 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ ࢧ -> 0x0073, NumberFormatException -> 0x0075 }
            r5.f1041 = r7     // Catch:{ ࢧ -> 0x0073, NumberFormatException -> 0x0075 }
            goto L_0x0075
        L_0x0073:
            r6 = move-exception
            goto L_0x0090
        L_0x0075:
            nts.ⶏ r7 = r5.f1035     // Catch:{ ࢧ -> 0x0081 }
            boolean r7 = r7.f3880     // Catch:{ ࢧ -> 0x0081 }
            if (r7 == 0) goto L_0x0083
            nts.チ r7 = r5.f1036     // Catch:{ ࢧ -> 0x0081 }
            r7.m3770(r6)     // Catch:{ ࢧ -> 0x0081 }
            goto L_0x0089
        L_0x0081:
            r6 = move-exception
            goto L_0x008a
        L_0x0083:
            nts.チ r6 = r5.f1036     // Catch:{ ࢧ -> 0x0081 }
            r7 = 3
            r6.m3770(r7)     // Catch:{ ࢧ -> 0x0081 }
        L_0x0089:
            return
        L_0x008a:
            nts.ᢼ r7 = new nts.ᢼ
            r7.<init>(r6)
            throw r7
        L_0x0090:
            nts.ᢼ r7 = new nts.ᢼ
            r7.<init>(r6)
            throw r7
        L_0x0096:
            r6 = move-exception
            nts.ᢼ r7 = new nts.ᢼ
            r7.<init>(r6)
            throw r7
        L_0x009d:
            r6 = move-exception
            nts.ᢼ r7 = new nts.ᢼ
            r7.<init>(r6)
            throw r7
        L_0x00a4:
            monitor-exit(r5)     // Catch:{ all -> 0x0013 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3730.m1102(android.content.Context, java.lang.String):void");
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1108(String str) {
        C4208 r02 = this.f1036;
        if (r02 != null) {
            try {
                r02.f4076.f710.m2139(str);
            } catch (C3625 e10) {
                throw new C3675(e10);
            }
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1089(String str) {
        C4208 r02 = this.f1036;
        if (r02 != null) {
            try {
                r02.f4076.f690.m2139(str);
            } catch (C3625 e10) {
                throw new C3675(e10);
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final String m1098(String str, String str2, String str3) {
        try {
            return this.f1036.m3767(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 421, 20, 69) + str + str2 + str3);
        } catch (C3675 unused) {
            throw new C15075d(C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 441, 39, 58));
        }
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String m1112() {
        C4208 r02 = this.f1036;
        if (r02 == null) {
            return "";
        }
        return r02.f4076.f681.f2269.toString();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1100(int i10) {
        C4208 r02 = this.f1036;
        if (r02 != null) {
            try {
                r02.f4076.f724 = i10;
            } catch (C3625 e10) {
                throw new C3675(e10);
            } catch (C3675 unused) {
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1103(String str) {
        C4208 r02 = this.f1036;
        if (r02 != null) {
            try {
                if (!r02.f4073) {
                    r02.m3768();
                    r02.f4073 = true;
                }
                r02.f4076.m691(str);
            } catch (C3625 e10) {
                throw new C3675(e10);
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1101(int i10, String str, String str2) {
        C14944d dVar = this.f1037;
        if (dVar != null && this.f1041 >= i10) {
            try {
                dVar.fireLog(i10, str, str2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1104(C3878 r62) {
        if (this.f1037 != null) {
            this.f1037.fireLog(1, C3727.m1052("}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá", 496, 15, 75) + r62.f1742 + "] " + r62.f1741, C3734.f1060);
        }
    }
}
