package ox;

import HJ.C15835a;
import HJ.C15854t;
import com.ingka.ikea.appconfig.model.GiftCardConfiguration;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a#\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;", "validator", "", "e", "(Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;)Z", "d", "c", "", "text", "regex", "g", "(Ljava/lang/CharSequence;Ljava/lang/String;)Z", "number", "f", "(Ljava/lang/String;)Z", "prepaidcarddata-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    /* access modifiers changed from: private */
    public static final boolean c(String str, GiftCardConfiguration.FieldValidation fieldValidation) {
        String str2 = str;
        if (fieldValidation == null) {
            return true;
        }
        boolean g10 = g(str2, fieldValidation.d());
        int i10 = 2;
        if (!g10) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a(fieldValidation.b() + " regex validation failed", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = str.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, (Throwable) null, str5);
                str4 = str6;
                str3 = str5;
                eVar = eVar;
            }
        }
        String a11 = fieldValidation.a();
        boolean f10 = a11 != null ? g(str2, a11) : false ? f(str) : true;
        if (!f10) {
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str7 == null) {
                    String a12 = C11818a.a(fieldValidation.b() + " validation failed on luhn check", (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str7 = C11820c.a(a12);
                }
                if (str8 == null) {
                    String name2 = str.getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (!(o13.length() == 0)) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str8, false, (Throwable) null, str7);
                i10 = 2;
            }
        }
        return f10 & g10;
    }

    private static final boolean d(String str, GiftCardConfiguration.FieldValidation fieldValidation) {
        return g(str, fieldValidation.c());
    }

    /* access modifiers changed from: private */
    public static final boolean e(String str, GiftCardConfiguration.FieldValidation fieldValidation) {
        if (fieldValidation == null) {
            return true;
        }
        return d(str, fieldValidation) & c(str, fieldValidation);
    }

    public static final boolean f(String str) {
        C17542s.j(str, "number");
        if (C15854t.v0(str)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        String obj = C15854t.I1(str).toString();
        ArrayList arrayList = new ArrayList(obj.length());
        for (int i10 = 0; i10 < obj.length(); i10++) {
            sb2.append(obj.charAt(i10));
            arrayList.add(sb2);
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < sb2.length()) {
            char charAt = sb2.charAt(i11);
            int i14 = i13 + 1;
            if (!Character.isDigit(charAt)) {
                return false;
            }
            int i15 = i13 % 2;
            if (i15 == 1 && C15835a.e(charAt) == 9) {
                i12 += 9;
            } else {
                i12 += i15 == 1 ? (C15835a.e(charAt) * 2) % 9 : C15835a.e(charAt);
            }
            i11++;
            i13 = i14;
        }
        return i12 % 10 == 0;
    }

    private static final boolean g(CharSequence charSequence, String str) {
        Pattern compile;
        if (charSequence == null) {
            return false;
        }
        if (str == null || (compile = Pattern.compile(str)) == null) {
            return true;
        }
        return compile.matcher(charSequence).matches();
    }
}
