package HJ;

import YH.C16860d;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.V;
import tI.C17978n;

@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00020\u0000*\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0000*\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001c\u001a\u00020\u0000*\u00020\u00182\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0018*\u00020\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u0005\u001a+\u0010\"\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#\u001a#\u0010%\u001a\u00020\u0002*\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0005\u001a \u0010'\u001a\u00020\u0002*\u0004\u0018\u00010&2\b\u0010\u0001\u001a\u0004\u0018\u00010&H\u0004¢\u0006\u0004\b'\u0010(\u001a'\u0010)\u001a\u00020\u0002*\u0004\u0018\u00010&2\b\u0010\u0001\u001a\u0004\u0018\u00010&2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b)\u0010*\u001a;\u0010.\u001a\u00020\u0002*\u00020\u00002\u0006\u0010+\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/\u001a\u0019\u00101\u001a\u00020\u0000*\u00020&2\u0006\u00100\u001a\u00020\u0013¢\u0006\u0004\b1\u00102\"%\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u000004j\b\u0012\u0004\u0012\u00020\u0000`5*\u0002038F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"", "other", "", "ignoreCase", "H", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "oldChar", "newChar", "N", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", "newValue", "O", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "R", "", "x", "([C)Ljava/lang/String;", "", "startIndex", "endIndex", "y", "([CII)Ljava/lang/String;", "", "B", "([B)Ljava/lang/String;", "throwOnInvalidSequence", "C", "([BIIZ)Ljava/lang/String;", "E", "(Ljava/lang/String;)[B", "prefix", "U", "T", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "suffix", "F", "", "z", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "A", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "thisOffset", "otherOffset", "length", "K", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "n", "M", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "J", "(Lkotlin/jvm/internal/V;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* renamed from: HJ.F  reason: case insensitive filesystem */
class C15825F extends C15824E {
    public static boolean A(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        return z10 ? C15829J.e0(charSequence, charSequence2) : C15854t.z(charSequence, charSequence2);
    }

    public static String B(byte[] bArr) {
        C17542s.j(bArr, "<this>");
        return new String(bArr, C15838d.f135279b);
    }

    public static final String C(byte[] bArr, int i10, int i11, boolean z10) {
        C17542s.j(bArr, "<this>");
        C16860d.f140429a.a(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, C15838d.f135279b);
        }
        CharsetDecoder newDecoder = C15838d.f135279b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String charBuffer = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        C17542s.i(charBuffer, "toString(...)");
        return charBuffer;
    }

    public static /* synthetic */ String D(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return C(bArr, i10, i11, z10);
    }

    public static byte[] E(String str) {
        C17542s.j(str, "<this>");
        byte[] bytes = str.getBytes(C15838d.f135279b);
        C17542s.i(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean F(String str, String str2, boolean z10) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "suffix");
        if (!z10) {
            return str.endsWith(str2);
        }
        return C15854t.K(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean G(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C15854t.F(str, str2, z10);
    }

    public static boolean H(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean I(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C15854t.H(str, str2, z10);
    }

    public static Comparator<String> J(V v10) {
        C17542s.j(v10, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        C17542s.i(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean K(String str, int i10, String str2, int i11, int i12, boolean z10) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static /* synthetic */ boolean L(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return C15854t.K(str, i10, str2, i11, i12, z10);
    }

    public static String M(CharSequence charSequence, int i10) {
        C17542s.j(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        } else if (i10 == 0) {
            return "";
        } else {
            int i11 = 1;
            if (i10 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                if (1 <= i10) {
                    while (true) {
                        sb2.append(charSequence);
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
                String sb3 = sb2.toString();
                C17542s.g(sb3);
                return sb3;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = charAt;
            }
            return new String(cArr);
        }
    }

    public static final String N(String str, char c10, char c11, boolean z10) {
        C17542s.j(str, "<this>");
        if (!z10) {
            String replace = str.replace(c10, c11);
            C17542s.i(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (C15837c.f(charAt, c10, z10)) {
                charAt = c11;
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static final String O(String str, String str2, String str3, boolean z10) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "oldValue");
        C17542s.j(str3, "newValue");
        int i10 = 0;
        int o02 = C15829J.o0(str, str2, 0, z10);
        if (o02 < 0) {
            return str;
        }
        int length = str2.length();
        int e10 = C17978n.e(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append(str, i10, o02);
                sb2.append(str3);
                i10 = o02 + length;
                if (o02 >= str.length() || (o02 = C15829J.o0(str, str2, o02 + e10, z10)) <= 0) {
                    sb2.append(str, i10, str.length());
                    String sb3 = sb2.toString();
                    C17542s.i(sb3, "toString(...)");
                }
                sb2.append(str, i10, o02);
                sb2.append(str3);
                i10 = o02 + length;
                break;
            } while ((o02 = C15829J.o0(str, str2, o02 + e10, z10)) <= 0);
            sb2.append(str, i10, str.length());
            String sb32 = sb2.toString();
            C17542s.i(sb32, "toString(...)");
            return sb32;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String P(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return N(str, c10, c11, z10);
    }

    public static /* synthetic */ String Q(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return O(str, str2, str3, z10);
    }

    public static final String R(String str, String str2, String str3, boolean z10) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "oldValue");
        C17542s.j(str3, "newValue");
        int s02 = C15854t.s0(str, str2, 0, z10, 2, (Object) null);
        return s02 < 0 ? str : C15854t.S0(str, s02, str2.length() + s02, str3).toString();
    }

    public static /* synthetic */ String S(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return R(str, str2, str3, z10);
    }

    public static boolean T(String str, String str2, int i10, boolean z10) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return C15854t.K(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean U(String str, String str2, boolean z10) {
        C17542s.j(str, "<this>");
        C17542s.j(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return C15854t.K(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean V(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return C15854t.T(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean W(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C15854t.U(str, str2, z10);
    }

    public static String x(char[] cArr) {
        C17542s.j(cArr, "<this>");
        return new String(cArr);
    }

    public static String y(char[] cArr, int i10, int i11) {
        C17542s.j(cArr, "<this>");
        C16860d.f140429a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static boolean z(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? C15829J.f0(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }
}
