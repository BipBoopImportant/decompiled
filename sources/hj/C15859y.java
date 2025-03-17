package HJ;

import GJ.C15768k;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "marginPrefix", "n", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "m", "(Ljava/lang/String;)Ljava/lang/String;", "k", "indent", "i", "", "h", "(Ljava/lang/String;)I", "Lkotlin/Function1;", "e", "(Ljava/lang/String;)LnI/l;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* renamed from: HJ.y  reason: case insensitive filesystem */
class C15859y extends C15855u {
    private static final C17642l<String, String> e(String str) {
        return str.length() == 0 ? new C15857w() : new C15858x(str);
    }

    /* access modifiers changed from: private */
    public static final String f(String str) {
        C17542s.j(str, "line");
        return str;
    }

    /* access modifiers changed from: private */
    public static final String g(String str, String str2) {
        C17542s.j(str2, "line");
        return str + str2;
    }

    private static final int h(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!C15835a.c(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static String i(String str, String str2) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "indent");
        return C15768k.Q(C15768k.S(C15829J.B0(str), new C15856v(str2)), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final String j(String str, String str2) {
        C17542s.j(str2, "it");
        if (C15854t.v0(str2)) {
            return str2.length() < str.length() ? str : str2;
        }
        return str + str2;
    }

    public static final String k(String str, String str2) {
        String invoke;
        C17542s.j(str, "<this>");
        C17542s.j(str2, "newIndent");
        List<String> C02 = C15854t.C0(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : C02) {
            if (!C15854t.v0((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (String h10 : arrayList) {
            arrayList2.add(Integer.valueOf(h(h10)));
        }
        Integer num = (Integer) C16877v.P0(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * C02.size());
        C17642l<String, String> e10 = e(str2);
        int p10 = C16877v.p(C02);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : C02) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            String str3 = (String) next2;
            if ((i10 == 0 || i10 == p10) && C15854t.v0(str3)) {
                str3 = null;
            } else {
                String E12 = C15854t.E1(str3, intValue);
                if (!(E12 == null || (invoke = e10.invoke(E12)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        return ((StringBuilder) C16877v.E0(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 124, (Object) null)).toString();
    }

    public static final String l(String str, String str2, String str3) {
        int i10;
        String invoke;
        C17542s.j(str, "<this>");
        C17542s.j(str2, "newIndent");
        C17542s.j(str3, "marginPrefix");
        if (!C15854t.v0(str3)) {
            List<String> C02 = C15854t.C0(str);
            int length = str.length() + (str2.length() * C02.size());
            C17642l<String, String> e10 = e(str2);
            int p10 = C16877v.p(C02);
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object next : C02) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C16877v.x();
                }
                String str4 = (String) next;
                String str5 = null;
                if ((i11 == 0 || i11 == p10) && C15854t.v0(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length2) {
                            i10 = -1;
                            break;
                        } else if (!C15835a.c(str4.charAt(i13))) {
                            i10 = i13;
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i10 != -1) {
                        int i14 = i10;
                        if (C15854t.V(str4, str3, i10, false, 4, (Object) null)) {
                            C17542s.h(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(i14 + str3.length());
                            C17542s.i(str5, "substring(...)");
                        }
                    }
                    if (!(str5 == null || (invoke = e10.invoke(str5)) == null)) {
                        str4 = invoke;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i11 = i12;
            }
            return ((StringBuilder) C16877v.E0(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 124, (Object) null)).toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }

    public static String m(String str) {
        C17542s.j(str, "<this>");
        return k(str, "");
    }

    public static final String n(String str, String str2) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "marginPrefix");
        return l(str, "", str2);
    }

    public static /* synthetic */ String o(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = DslKt.INDICATOR_SEPARATOR;
        }
        return n(str, str2);
    }
}
