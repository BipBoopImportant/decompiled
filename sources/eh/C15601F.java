package EH;

import EH.C15596A;
import HJ.C15835a;
import HJ.C15854t;
import YH.C16877v;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0011\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"", "query", "", "startIndex", "limit", "", "decode", "LEH/A;", "c", "(Ljava/lang/String;IIZ)LEH/A;", "LEH/B;", "LXH/N;", "b", "(LEH/B;Ljava/lang/String;IIZ)V", "nameIndex", "equalIndex", "endIndex", "a", "(LEH/B;Ljava/lang/String;IIIZ)V", "start", "end", "", "text", "e", "(IILjava/lang/CharSequence;)I", "f", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.F  reason: case insensitive filesystem */
public final class C15601F {
    private static final void a(C15597B b10, String str, int i10, int i11, int i12, boolean z10) {
        String str2;
        String str3;
        String str4;
        if (i11 == -1) {
            int f10 = f(i10, i12, str);
            int e10 = e(f10, i12, str);
            if (e10 > f10) {
                if (z10) {
                    str4 = C15617b.k(str, f10, e10, false, (Charset) null, 12, (Object) null);
                } else {
                    str4 = str.substring(f10, e10);
                    C17542s.i(str4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                b10.e(str4, C16877v.n());
                return;
            }
            return;
        }
        int f11 = f(i10, i11, str);
        int e11 = e(f11, i11, str);
        if (e11 > f11) {
            if (z10) {
                str2 = C15617b.k(str, f11, e11, false, (Charset) null, 12, (Object) null);
            } else {
                str2 = str.substring(f11, e11);
                C17542s.i(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            int f12 = f(i11 + 1, i12, str);
            int e12 = e(f12, i12, str);
            if (z10) {
                str3 = C15617b.k(str, f12, e12, true, (Charset) null, 8, (Object) null);
            } else {
                str3 = str.substring(f12, e12);
                C17542s.i(str3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            b10.f(str2, str3);
        }
    }

    private static final void b(C15597B b10, String str, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14 = i11;
        int m02 = C15854t.m0(str);
        int i15 = 0;
        int i16 = i10;
        if (i16 <= m02) {
            int i17 = 0;
            int i18 = -1;
            int i19 = i16;
            int i20 = i19;
            while (i17 != i14) {
                char charAt = str.charAt(i19);
                if (charAt == '&') {
                    a(b10, str, i20, i18, i19, z10);
                    i17++;
                    i18 = -1;
                    i20 = i19 + 1;
                } else if (charAt == '=' && i18 == -1) {
                    i18 = i19;
                }
                if (i19 != m02) {
                    i19++;
                } else {
                    i13 = i20;
                    i12 = i18;
                    i15 = i17;
                }
            }
            return;
        }
        String str2 = str;
        i12 = -1;
        i13 = i16;
        if (i15 != i14) {
            a(b10, str, i13, i12, str.length(), z10);
        }
    }

    public static final C15596A c(String str, int i10, int i11, boolean z10) {
        C17542s.j(str, "query");
        if (i10 > C15854t.m0(str)) {
            return C15596A.f133921b.a();
        }
        C15596A.a aVar = C15596A.f133921b;
        C15597B b10 = C15600E.b(0, 1, (Object) null);
        b(b10, str, i10, i11, z10);
        return b10.g();
    }

    public static /* synthetic */ C15596A d(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 1000;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        return c(str, i10, i11, z10);
    }

    private static final int e(int i10, int i11, CharSequence charSequence) {
        while (i11 > i10 && C15835a.c(charSequence.charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    private static final int f(int i10, int i11, CharSequence charSequence) {
        while (i10 < i11 && C15835a.c(charSequence.charAt(i10))) {
            i10++;
        }
        return i10;
    }
}
