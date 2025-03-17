package HJ;

import YH.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u00000\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0019\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a\u0019\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\n\u001a\u0019\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\n\u001a\u0011\u0010\u000e\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0019*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "", "G1", "(Ljava/lang/CharSequence;)C", "H1", "J1", "", "", "n", "E1", "(Ljava/lang/String;I)Ljava/lang/String;", "F1", "K1", "L1", "I1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "size", "", "D1", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "step", "", "partialWindows", "M1", "(Ljava/lang/CharSequence;IIZ)Ljava/util/List;", "R", "Lkotlin/Function1;", "transform", "N1", "(Ljava/lang/CharSequence;IIZLnI/l;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* renamed from: HJ.M  reason: case insensitive filesystem */
class C15832M extends C15830K {
    public static List<String> D1(CharSequence charSequence, int i10) {
        C17542s.j(charSequence, "<this>");
        return M1(charSequence, i10, i10, true);
    }

    public static String E1(String str, int i10) {
        C17542s.j(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(C17978n.i(i10, str.length()));
            C17542s.i(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String F1(String str, int i10) {
        C17542s.j(str, "<this>");
        if (i10 >= 0) {
            return C15854t.K1(str, C17978n.e(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char G1(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char H1(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(C15854t.m0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static CharSequence I1(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    public static char J1(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    public static String K1(String str, int i10) {
        C17542s.j(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(0, C17978n.i(i10, str.length()));
            C17542s.i(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String L1(String str, int i10) {
        C17542s.j(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String substring = str.substring(length - C17978n.i(i10, length));
            C17542s.i(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static final List<String> M1(CharSequence charSequence, int i10, int i11, boolean z10) {
        C17542s.j(charSequence, "<this>");
        return N1(charSequence, i10, i11, z10, new C15831L());
    }

    public static final <R> List<R> N1(CharSequence charSequence, int i10, int i11, boolean z10, C17642l<? super CharSequence, ? extends R> lVar) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(lVar, "transform");
        k0.a(i10, i11);
        int length = charSequence.length();
        int i12 = 0;
        ArrayList arrayList = new ArrayList((length / i11) + (length % i11 == 0 ? 0 : 1));
        while (i12 >= 0 && i12 < length) {
            int i13 = i12 + i10;
            if (i13 < 0 || i13 > length) {
                if (!z10) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(lVar.invoke(charSequence.subSequence(i12, i13)));
            i12 += i11;
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final String O1(CharSequence charSequence) {
        C17542s.j(charSequence, "it");
        return charSequence.toString();
    }
}
