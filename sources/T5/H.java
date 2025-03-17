package T5;

import HJ.C15835a;
import HJ.C15854t;
import WK.C16762E;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u001aS\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\n\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0000*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001d*\u0004\u0018\u00010\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"", "scheme", "authority", "path", "query", "fragment", "separator", "LT5/G;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LT5/G;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i", "(Ljava/lang/String;Ljava/lang/String;)LT5/G;", "data", "original", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LT5/G;", "", "bytes", "h", "(Ljava/lang/String;[B)Ljava/lang/String;", "", "f", "(LT5/G;)Ljava/util/List;", "pathSegments", "d", "(LT5/G;)Ljava/lang/String;", "filePath", "", "e", "(Ljava/lang/String;)I", "length", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class H {
    public static final G a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str != null || str2 != null || str3 != null || str4 != null || str5 != null) {
            return new G(c(str, str2, str3, str4, str5), str6, str, str2, str3, str4, str5);
        }
        throw new IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.");
    }

    public static /* synthetic */ G b(String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            str5 = null;
        }
        if ((i10 & 32) != 0) {
            str6 = C16762E.f139593c;
        }
        return a(str, str2, str3, str4, str5, str6);
    }

    private static final String c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(str);
            sb2.append(':');
        }
        if (str2 != null) {
            sb2.append("//");
            sb2.append(str2);
        }
        if (str3 != null) {
            sb2.append(str3);
        }
        if (str4 != null) {
            sb2.append('?');
            sb2.append(str4);
        }
        if (str5 != null) {
            sb2.append('#');
            sb2.append(str5);
        }
        return sb2.toString();
    }

    public static final String d(G g10) {
        List<String> f10 = f(g10);
        if (f10.isEmpty()) {
            return null;
        }
        String b10 = g10.b();
        C17542s.g(b10);
        return C16877v.G0(f10, g10.d(), C15854t.W(b10, g10.d(), false, 2, (Object) null) ? g10.d() : "", (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 60, (Object) null);
    }

    private static final int e(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public static final List<String> f(G g10) {
        String b10 = g10.b();
        if (b10 == null) {
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        while (i10 < b10.length()) {
            int i11 = i10 + 1;
            i10 = C15854t.r0(b10, '/', i11, false, 4, (Object) null);
            if (i10 == -1) {
                i10 = b10.length();
            }
            String substring = b10.substring(i11, i10);
            C17542s.i(substring, "substring(...)");
            if (substring.length() > 0) {
                arrayList.add(substring);
            }
        }
        return arrayList;
    }

    private static final G g(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = str;
        String str10 = str2;
        boolean z10 = true;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        while (i15 < str.length()) {
            char charAt = str.charAt(i15);
            if (charAt != '#') {
                if (charAt != '/') {
                    if (charAt != ':') {
                        if (charAt == '?' && i12 == -1 && i10 == -1) {
                            i12 = i15 + 1;
                        }
                    } else if (z10 && i12 == -1 && i10 == -1) {
                        int i16 = i15 + 2;
                        if (i16 < str2.length() && str10.charAt(i15 + 1) == '/' && str10.charAt(i16) == '/') {
                            i13 = i15 + 3;
                            z10 = false;
                            i14 = i15;
                            i15 = i16;
                        } else if (C17542s.e(str, str2)) {
                            i11 = i15 + 1;
                            i14 = i15;
                            i15 = i11;
                            i13 = i15;
                        }
                    }
                } else if (i11 == -1 && i12 == -1 && i10 == -1) {
                    i11 = i13 == -1 ? 0 : i15;
                    z10 = false;
                }
            } else if (i10 == -1) {
                i10 = i15 + 1;
            }
            i15++;
        }
        int i17 = Integer.MAX_VALUE;
        int min = Math.min(i10 == -1 ? Integer.MAX_VALUE : i10 - 1, str.length());
        int min2 = Math.min(i12 == -1 ? Integer.MAX_VALUE : i12 - 1, min);
        String str11 = null;
        if (i13 != -1) {
            str4 = str.substring(0, i14);
            C17542s.i(str4, "substring(...)");
            if (i11 != -1) {
                i17 = i11;
            }
            str5 = str.substring(i13, Math.min(i17, min2));
            C17542s.i(str5, "substring(...)");
        } else {
            str5 = null;
            str4 = null;
        }
        if (i11 != -1) {
            str6 = str.substring(i11, min2);
            C17542s.i(str6, "substring(...)");
        } else {
            str6 = null;
        }
        if (i12 != -1) {
            str7 = str.substring(i12, min);
            C17542s.i(str7, "substring(...)");
        } else {
            str7 = null;
        }
        if (i10 != -1) {
            str8 = str.substring(i10, str.length());
            C17542s.i(str8, "substring(...)");
        } else {
            str8 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(e(str4), Math.max(e(str5), Math.max(e(str6), Math.max(e(str7), e(str8))))) - 2)];
        String h10 = str4 != null ? h(str4, bArr) : null;
        String h11 = str5 != null ? h(str5, bArr) : null;
        String h12 = str6 != null ? h(str6, bArr) : null;
        String h13 = str7 != null ? h(str7, bArr) : null;
        if (str8 != null) {
            str11 = h(str8, bArr);
        }
        return new G(str, str3, h10, h11, h12, h13, str11);
    }

    private static final String h(String str, byte[] bArr) {
        int length = str.length();
        int i10 = 0;
        int max = Math.max(0, length - 2);
        int i11 = 0;
        while (true) {
            if (i10 >= max) {
                if (i10 == i11) {
                    return str;
                }
                if (i10 >= length) {
                    return C15854t.D(bArr, 0, i11, false, 5, (Object) null);
                }
            } else if (str.charAt(i10) == '%') {
                int i12 = i10 + 3;
                try {
                    String substring = str.substring(i10 + 1, i12);
                    C17542s.i(substring, "substring(...)");
                    bArr[i11] = (byte) Integer.parseInt(substring, C15835a.a(16));
                    i11++;
                    i10 = i12;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i11] = (byte) str.charAt(i10);
            i11++;
            i10++;
        }
    }

    public static final G i(String str, String str2) {
        return g(!C17542s.e(str2, "/") ? C15854t.Q(str, str2, "/", false, 4, (Object) null) : str, str, str2);
    }

    public static /* synthetic */ G j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = C16762E.f139593c;
        }
        return i(str, str2);
    }
}
