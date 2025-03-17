package HJ;

import GJ.C15765h;
import GJ.C15768k;
import XH.C16796C;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import com.optimizely.ab.config.FeatureVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17972h;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0016\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0006*\u00020\u0006¢\u0006\u0004\b\t\u0010\b\u001a#\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u000e\u001a#\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u001f\u001a#\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b#\u0010!\u001a#\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b$\u0010\u001f\u001a#\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b%\u0010!\u001a#\u0010&\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b&\u0010\u001f\u001a#\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b'\u0010!\u001a)\u0010+\u001a\u00020\u0006*\u00020\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/\u001a\u0019\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u00100\u001a\u00020\u0006¢\u0006\u0004\b1\u0010/\u001a!\u00102\u001a\u00020\u0000*\u00020\u00002\u0006\u0010-\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006¢\u0006\u0004\b2\u00103\u001a\u0019\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b4\u0010/\u001a;\u00109\u001a\u00020\u0013*\u00020\u00062\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00108\u001a\u00020\u0013H\u0000¢\u0006\u0004\b9\u0010:\u001a#\u0010<\u001a\u00020\u0013*\u00020\u00062\u0006\u0010;\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u0013¢\u0006\u0004\b<\u0010=\u001a#\u0010>\u001a\u00020\u0013*\u00020\u00062\u0006\u0010;\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u0013¢\u0006\u0004\b>\u0010=\u001a#\u0010?\u001a\u00020\u0013*\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0013¢\u0006\u0004\b?\u0010@\u001a#\u0010A\u001a\u00020\u0013*\u00020\u00062\u0006\u00100\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0013¢\u0006\u0004\bA\u0010@\u001a-\u0010B\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u00108\u001a\u00020\u0013¢\u0006\u0004\bB\u0010C\u001a-\u0010D\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u00108\u001a\u00020\u0013¢\u0006\u0004\bD\u0010C\u001a=\u0010F\u001a\u00020\n*\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\u00132\b\b\u0002\u0010E\u001a\u00020\u0013H\u0002¢\u0006\u0004\bF\u0010G\u001aG\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010J*\u00020\u00062\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000H2\u0006\u0010(\u001a\u00020\n2\u0006\u00108\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0013H\u0002¢\u0006\u0004\bK\u0010L\u001a-\u0010M\u001a\u00020\n*\u00020\u00062\u0006\u0010;\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u00108\u001a\u00020\u0013¢\u0006\u0004\bM\u0010N\u001a-\u0010P\u001a\u00020\n*\u00020\u00062\u0006\u0010O\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u00108\u001a\u00020\u0013¢\u0006\u0004\bP\u0010Q\u001a-\u0010R\u001a\u00020\n*\u00020\u00062\u0006\u0010;\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u00108\u001a\u00020\u0013¢\u0006\u0004\bR\u0010N\u001a-\u0010S\u001a\u00020\n*\u00020\u00062\u0006\u0010O\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u00108\u001a\u00020\u0013¢\u0006\u0004\bS\u0010Q\u001a&\u0010T\u001a\u00020\u0013*\u00020\u00062\u0006\u00106\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0013H\u0002¢\u0006\u0004\bT\u0010@\u001a&\u0010U\u001a\u00020\u0013*\u00020\u00062\u0006\u0010;\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u0013H\u0002¢\u0006\u0004\bU\u0010=\u001a?\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00160X*\u00020\u00062\u0006\u0010V\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u0010W\u001a\u00020\nH\u0002¢\u0006\u0004\bY\u0010Z\u001aG\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00160X*\u00020\u00062\u000e\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000[2\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u0010W\u001a\u00020\nH\u0002¢\u0006\u0004\b\\\u0010]\u001a\u0017\u0010_\u001a\u00020^2\u0006\u0010W\u001a\u00020\nH\u0000¢\u0006\u0004\b_\u0010`\u001a?\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00000X*\u00020\u00062\u0012\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000[\"\u00020\u00002\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u0010W\u001a\u00020\n¢\u0006\u0004\ba\u0010b\u001a?\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000c*\u00020\u00062\u0012\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000[\"\u00020\u00002\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u0010W\u001a\u00020\n¢\u0006\u0004\bd\u0010e\u001a7\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00000c*\u00020\u00062\n\u0010V\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u0010W\u001a\u00020\n¢\u0006\u0004\bf\u0010g\u001a1\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00000c*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00132\u0006\u0010W\u001a\u00020\nH\u0002¢\u0006\u0004\bh\u0010i\u001a\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00000X*\u00020\u0006¢\u0006\u0004\bj\u0010k\u001a\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00000c*\u00020\u0006¢\u0006\u0004\bl\u0010m\u001a\u001f\u0010n\u001a\u00020\u0013*\u0004\u0018\u00010\u00062\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bn\u0010o\u001a\u001f\u0010p\u001a\u00020\u0013*\u0004\u0018\u00010\u00062\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bp\u0010o\u001a\u0015\u0010q\u001a\u0004\u0018\u00010\u0013*\u00020\u0000H\u0007¢\u0006\u0004\bq\u0010r\"\u0015\u0010u\u001a\u00020\u0016*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bs\u0010t\"\u0015\u0010x\u001a\u00020\n*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006y"}, d2 = {"", "", "", "chars", "A1", "(Ljava/lang/String;[C)Ljava/lang/String;", "", "z1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "B1", "", "length", "padChar", "F0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "G0", "(Ljava/lang/String;IC)Ljava/lang/String;", "D0", "E0", "", "v0", "(Ljava/lang/CharSequence;)Z", "LtI/j;", "range", "h1", "(Ljava/lang/String;LtI/j;)Ljava/lang/String;", "g1", "(Ljava/lang/CharSequence;LtI/j;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "q1", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "r1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i1", "j1", "u1", "v1", "m1", "n1", "startIndex", "endIndex", "replacement", "S0", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "prefix", "O0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "P0", "R0", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "Q0", "thisOffset", "other", "otherOffset", "ignoreCase", "N0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "c1", "(Ljava/lang/CharSequence;CZ)Z", "g0", "d1", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "h0", "t0", "(Ljava/lang/CharSequence;[CIZ)I", "A0", "last", "p0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "LXH/v;", "k0", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)LXH/v;", "n0", "(Ljava/lang/CharSequence;CIZ)I", "string", "o0", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "w0", "x0", "b0", "a0", "delimiters", "limit", "LGJ/h;", "H0", "(Ljava/lang/CharSequence;[CIZI)LGJ/h;", "", "I0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)LGJ/h;", "LXH/N;", "T0", "(I)V", "Z0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)LGJ/h;", "", "V0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "U0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "W0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "B0", "(Ljava/lang/CharSequence;)LGJ/h;", "C0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "e0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "f0", "y1", "(Ljava/lang/String;)Ljava/lang/Boolean;", "l0", "(Ljava/lang/CharSequence;)LtI/j;", "indices", "m0", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* renamed from: HJ.J  reason: case insensitive filesystem */
class C15829J extends C15825F {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"HJ/J$a", "LGJ/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HJ.J$a */
    public static final class a implements C15765h<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CharSequence f135277a;

        public a(CharSequence charSequence) {
            this.f135277a = charSequence;
        }

        public Iterator<String> iterator() {
            return new C15843i(this.f135277a);
        }
    }

    public static final int A0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int i11 = C17978n.i(i10, C15854t.m0(charSequence)); -1 < i11; i11--) {
                char charAt = charSequence.charAt(i11);
                for (char f10 : cArr) {
                    if (C15837c.f(f10, charAt, z10)) {
                        return i11;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C16870n.M0(cArr), i10);
    }

    public static String A1(String str, char... cArr) {
        C17542s.j(str, "<this>");
        C17542s.j(cArr, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean X10 = C16870n.X(cArr, str.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!X10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!X10) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static final C15765h<String> B0(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        return new a(charSequence);
    }

    public static CharSequence B1(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!C15835a.c(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return "";
    }

    public static List<String> C0(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        return C15768k.a0(B0(charSequence));
    }

    public static final CharSequence D0(CharSequence charSequence, int i10, char c10) {
        C17542s.j(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(charSequence);
            int length = i10 - charSequence.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c10);
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            return sb2;
        }
    }

    public static String E0(String str, int i10, char c10) {
        C17542s.j(str, "<this>");
        return D0(str, i10, c10).toString();
    }

    public static final CharSequence F0(CharSequence charSequence, int i10, char c10) {
        C17542s.j(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            int length = i10 - charSequence.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c10);
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb2.append(charSequence);
            return sb2;
        }
    }

    public static String G0(String str, int i10, char c10) {
        C17542s.j(str, "<this>");
        return F0(str, i10, c10).toString();
    }

    private static final C15765h<C17974j> H0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        T0(i11);
        return new C15839e(charSequence, i10, i11, new C15826G(cArr, z10));
    }

    private static final C15765h<C17974j> I0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        T0(i11);
        return new C15839e(charSequence, i10, i11, new C15827H(C16870n.f(strArr), z10));
    }

    static /* synthetic */ C15765h J0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return H0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ C15765h K0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return I0(charSequence, strArr, i10, z10, i11);
    }

    /* access modifiers changed from: private */
    public static final v L0(char[] cArr, boolean z10, CharSequence charSequence, int i10) {
        C17542s.j(charSequence, "$this$DelimitedRangesSequence");
        int t02 = t0(charSequence, cArr, i10, z10);
        if (t02 < 0) {
            return null;
        }
        return C16796C.a(Integer.valueOf(t02), 1);
    }

    /* access modifiers changed from: private */
    public static final v M0(List list, boolean z10, CharSequence charSequence, int i10) {
        C17542s.j(charSequence, "$this$DelimitedRangesSequence");
        v<Integer, String> k02 = k0(charSequence, list, i10, z10, false);
        if (k02 != null) {
            return C16796C.a(k02.c(), Integer.valueOf(k02.d().length()));
        }
        return null;
    }

    public static final boolean N0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!C15837c.f(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String O0(String str, CharSequence charSequence) {
        C17542s.j(str, "<this>");
        C17542s.j(charSequence, "prefix");
        if (!f1(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static String P0(String str, CharSequence charSequence) {
        C17542s.j(str, "<this>");
        C17542s.j(charSequence, "suffix");
        if (!C15854t.j0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static String Q0(String str, CharSequence charSequence) {
        C17542s.j(str, "<this>");
        C17542s.j(charSequence, "delimiter");
        return R0(str, charSequence, charSequence);
    }

    public static final String R0(String str, CharSequence charSequence, CharSequence charSequence2) {
        C17542s.j(str, "<this>");
        C17542s.j(charSequence, "prefix");
        C17542s.j(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !f1(str, charSequence, false, 2, (Object) null) || !C15854t.j0(str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static CharSequence S0(CharSequence charSequence, int i10, int i11, CharSequence charSequence2) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(charSequence2, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            C17542s.i(sb2, "append(...)");
            sb2.append(charSequence2);
            sb2.append(charSequence, i11, charSequence.length());
            C17542s.i(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static final void T0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
        }
    }

    public static final List<String> U0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(cArr, "delimiters");
        if (cArr.length == 1) {
            return W0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable<C17974j> A10 = C15768k.A(J0(charSequence, cArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C16877v.y(A10, 10));
        for (C17974j g12 : A10) {
            arrayList.add(g1(charSequence, g12));
        }
        return arrayList;
    }

    public static final List<String> V0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return W0(charSequence, str, z10, i10);
            }
        }
        Iterable<C17974j> A10 = C15768k.A(K0(charSequence, strArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C16877v.y(A10, 10));
        for (C17974j g12 : A10) {
            arrayList.add(g1(charSequence, g12));
        }
        return arrayList;
    }

    private static final List<String> W0(CharSequence charSequence, String str, boolean z10, int i10) {
        T0(i10);
        int i11 = 0;
        int o02 = o0(charSequence, str, 0, z10);
        if (o02 == -1 || i10 == 1) {
            return C16877v.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11) {
            i12 = C17978n.i(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, o02).toString());
            i11 = str.length() + o02;
            if ((z11 && arrayList.size() == i10 - 1) || (o02 = o0(charSequence, str, i11, z10)) == -1) {
                arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i11, o02).toString());
            i11 = str.length() + o02;
            break;
        } while ((o02 = o0(charSequence, str, i11, z10)) == -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List X0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return U0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List Y0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return V0(charSequence, strArr, z10, i10);
    }

    public static final C15765h<String> Z0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(strArr, "delimiters");
        return C15768k.S(K0(charSequence, strArr, 0, z10, i10, 2, (Object) null), new C15828I(charSequence));
    }

    public static final boolean a0(CharSequence charSequence, char c10, boolean z10) {
        C17542s.j(charSequence, "<this>");
        return C15854t.r0(charSequence, c10, 0, z10, 2, (Object) null) >= 0;
    }

    public static /* synthetic */ C15765h a1(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Z0(charSequence, strArr, z10, i10);
    }

    public static boolean b0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (C15854t.s0(charSequence, (String) charSequence2, 0, z10, 2, (Object) null) < 0) {
                return false;
            }
        } else {
            if (q0(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, (Object) null) < 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final String b1(CharSequence charSequence, C17974j jVar) {
        C17542s.j(jVar, "it");
        return g1(charSequence, jVar);
    }

    public static /* synthetic */ boolean c0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a0(charSequence, c10, z10);
    }

    public static final boolean c1(CharSequence charSequence, char c10, boolean z10) {
        C17542s.j(charSequence, "<this>");
        return charSequence.length() > 0 && C15837c.f(charSequence.charAt(0), c10, z10);
    }

    public static /* synthetic */ boolean d0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C15854t.b0(charSequence, charSequence2, z10);
    }

    public static final boolean d1(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(charSequence2, "prefix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C15854t.W((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return N0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static final boolean e0(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C15854t.H((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!C15837c.f(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean e1(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c1(charSequence, c10, z10);
    }

    public static final boolean f0(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C17542s.e(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean f1(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return d1(charSequence, charSequence2, z10);
    }

    public static final boolean g0(CharSequence charSequence, char c10, boolean z10) {
        C17542s.j(charSequence, "<this>");
        return charSequence.length() > 0 && C15837c.f(charSequence.charAt(C15854t.m0(charSequence)), c10, z10);
    }

    public static final String g1(CharSequence charSequence, C17974j jVar) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(jVar, "range");
        return charSequence.subSequence(jVar.i().intValue(), jVar.m().intValue() + 1).toString();
    }

    public static final boolean h0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(charSequence2, "suffix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C15854t.G((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return N0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static String h1(String str, C17974j jVar) {
        C17542s.j(str, "<this>");
        C17542s.j(jVar, "range");
        String substring = str.substring(jVar.i().intValue(), jVar.m().intValue() + 1);
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean i0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return g0(charSequence, c10, z10);
    }

    public static String i1(String str, char c10, String str2) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "missingDelimiterValue");
        int r02 = C15854t.r0(str, c10, 0, false, 6, (Object) null);
        if (r02 == -1) {
            return str2;
        }
        String substring = str.substring(r02 + 1, str.length());
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean j0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return h0(charSequence, charSequence2, z10);
    }

    public static final String j1(String str, String str2, String str3) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "delimiter");
        C17542s.j(str3, "missingDelimiterValue");
        int s02 = C15854t.s0(str, str2, 0, false, 6, (Object) null);
        if (s02 == -1) {
            return str3;
        }
        String substring = str.substring(s02 + str2.length(), str.length());
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    private static final v<Integer, String> k0(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        Object obj;
        Object obj2;
        if (z10 || collection.size() != 1) {
            C17972h jVar = !z11 ? new C17974j(C17978n.e(i10, 0), charSequence.length()) : C17978n.s(C17978n.i(i10, C15854t.m0(charSequence)), 0);
            if (charSequence instanceof String) {
                int p10 = jVar.p();
                int q10 = jVar.q();
                int s10 = jVar.s();
                if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (C15854t.K(str, 0, (String) charSequence, p10, str.length(), z10)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (p10 == q10) {
                                break;
                            }
                            p10 += s10;
                        } else {
                            return C16796C.a(Integer.valueOf(p10), str2);
                        }
                    }
                }
            } else {
                int p11 = jVar.p();
                int q11 = jVar.q();
                int s11 = jVar.s();
                if ((s11 > 0 && p11 <= q11) || (s11 < 0 && q11 <= p11)) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (N0(str3, 0, charSequence, p11, str3.length(), z10)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (p11 == q11) {
                                break;
                            }
                            p11 += s11;
                        } else {
                            return C16796C.a(Integer.valueOf(p11), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C16877v.a1(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i11 = i10;
        int s02 = !z11 ? C15854t.s0(charSequence2, str6, i11, false, 4, (Object) null) : C15854t.z0(charSequence2, str6, i11, false, 4, (Object) null);
        if (s02 < 0) {
            return null;
        }
        return C16796C.a(Integer.valueOf(s02), str5);
    }

    public static /* synthetic */ String k1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return C15854t.i1(str, c10, str2);
    }

    public static C17974j l0(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        return new C17974j(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String l1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return j1(str, str2, str3);
    }

    public static int m0(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String m1(String str, char c10, String str2) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "missingDelimiterValue");
        int y02 = C15854t.y0(str, c10, 0, false, 6, (Object) null);
        if (y02 == -1) {
            return str2;
        }
        String substring = str.substring(y02 + 1, str.length());
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static final int n0(CharSequence charSequence, char c10, int i10, boolean z10) {
        C17542s.j(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return t0(charSequence, new char[]{c10}, i10, z10);
    }

    public static final String n1(String str, String str2, String str3) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "delimiter");
        C17542s.j(str3, "missingDelimiterValue");
        int z02 = C15854t.z0(str, str2, 0, false, 6, (Object) null);
        if (z02 == -1) {
            return str3;
        }
        String substring = str.substring(z02 + str2.length(), str.length());
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static final int o0(CharSequence charSequence, String str, int i10, boolean z10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return q0(charSequence, str, i10, charSequence.length(), z10, false, 16, (Object) null);
    }

    public static /* synthetic */ String o1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return C15854t.m1(str, c10, str2);
    }

    private static final int p0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        C17972h jVar = !z11 ? new C17974j(C17978n.e(i10, 0), C17978n.i(i11, charSequence.length())) : C17978n.s(C17978n.i(i10, C15854t.m0(charSequence)), C17978n.e(i11, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int p10 = jVar.p();
            int q10 = jVar.q();
            int s10 = jVar.s();
            if ((s10 <= 0 || p10 > q10) && (s10 >= 0 || q10 > p10)) {
                return -1;
            }
            while (true) {
                if (N0(charSequence2, 0, charSequence, p10, charSequence2.length(), z10)) {
                    return p10;
                }
                if (p10 == q10) {
                    return -1;
                }
                p10 += s10;
            }
        } else {
            int p11 = jVar.p();
            int q11 = jVar.q();
            int s11 = jVar.s();
            if ((s11 <= 0 || p11 > q11) && (s11 >= 0 || q11 > p11)) {
                return -1;
            }
            while (true) {
                String str = (String) charSequence2;
                if (C15854t.K(str, 0, (String) charSequence, p11, str.length(), z10)) {
                    return p11;
                }
                if (p11 == q11) {
                    return -1;
                }
                p11 += s11;
            }
        }
    }

    public static /* synthetic */ String p1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return n1(str, str2, str3);
    }

    static /* synthetic */ int q0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return p0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static final String q1(String str, char c10, String str2) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "missingDelimiterValue");
        int r02 = C15854t.r0(str, c10, 0, false, 6, (Object) null);
        if (r02 == -1) {
            return str2;
        }
        String substring = str.substring(0, r02);
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ int r0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return n0(charSequence, c10, i10, z10);
    }

    public static final String r1(String str, String str2, String str3) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "delimiter");
        C17542s.j(str3, "missingDelimiterValue");
        int s02 = C15854t.s0(str, str2, 0, false, 6, (Object) null);
        if (s02 == -1) {
            return str3;
        }
        String substring = str.substring(0, s02);
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ int s0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return o0(charSequence, str, i10, z10);
    }

    public static /* synthetic */ String s1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return q1(str, c10, str2);
    }

    public static final int t0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            int e10 = C17978n.e(i10, 0);
            int m02 = C15854t.m0(charSequence);
            if (e10 > m02) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(e10);
                for (char f10 : cArr) {
                    if (C15837c.f(f10, charAt, z10)) {
                        return e10;
                    }
                }
                if (e10 == m02) {
                    return -1;
                }
                e10++;
            }
        } else {
            return ((String) charSequence).indexOf(C16870n.M0(cArr), i10);
        }
    }

    public static /* synthetic */ String t1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return r1(str, str2, str3);
    }

    public static /* synthetic */ int u0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return t0(charSequence, cArr, i10, z10);
    }

    public static final String u1(String str, char c10, String str2) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "missingDelimiterValue");
        int y02 = C15854t.y0(str, c10, 0, false, 6, (Object) null);
        if (y02 == -1) {
            return str2;
        }
        String substring = str.substring(0, y02);
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static boolean v0(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!C15835a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String v1(String str, String str2, String str3) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "delimiter");
        C17542s.j(str3, "missingDelimiterValue");
        int z02 = C15854t.z0(str, str2, 0, false, 6, (Object) null);
        if (z02 == -1) {
            return str3;
        }
        String substring = str.substring(0, z02);
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public static final int w0(CharSequence charSequence, char c10, int i10, boolean z10) {
        C17542s.j(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return A0(charSequence, new char[]{c10}, i10, z10);
    }

    public static /* synthetic */ String w1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return u1(str, c10, str2);
    }

    public static final int x0(CharSequence charSequence, String str, int i10, boolean z10) {
        C17542s.j(charSequence, "<this>");
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        return (z10 || !(charSequence instanceof String)) ? p0(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    public static /* synthetic */ String x1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return C15854t.v1(str, str2, str3);
    }

    public static /* synthetic */ int y0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = C15854t.m0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return w0(charSequence, c10, i10, z10);
    }

    public static Boolean y1(String str) {
        C17542s.j(str, "<this>");
        if (C17542s.e(str, "true")) {
            return Boolean.TRUE;
        }
        if (C17542s.e(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int z0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = C15854t.m0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return x0(charSequence, str, i10, z10);
    }

    public static CharSequence z1(CharSequence charSequence) {
        C17542s.j(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = C15835a.c(charSequence.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!c10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!c10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
