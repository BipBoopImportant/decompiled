package HK;

import HJ.C15854t;
import WK.C16770e;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Ljava/lang/String;)Z", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "c", "(Ljava/lang/String;II)Ljava/net/InetAddress;", "", "address", "addressOffset", "b", "(Ljava/lang/String;II[BI)Z", "d", "([B)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: HK.a  reason: case insensitive filesystem */
public final class C15861a {
    private static final boolean a(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (C17542s.l(charAt, 31) <= 0 || C17542s.l(charAt, 127) >= 0 || C15854t.r0(" #%/:?@[\\]", charAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (C17542s.l(charAt, 48) < 0 || C17542s.l(charAt, 57) > 0) {
                    break;
                } else if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i14++;
                }
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r13 == 16) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        if (r14 != -1) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083 A[LOOP:0: B:1:0x000e->B:36:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0095 A[EDGE_INSN: B:44:0x0095->B:37:0x0095 ?: BREAK  
    EDGE_INSN: B:50:0x0095->B:37:0x0095 ?: BREAK  , RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.net.InetAddress c(java.lang.String r18, int r19, int r20) {
        /*
            r6 = r18
            r7 = r20
            r8 = 16
            byte[] r9 = new byte[r8]
            r11 = -1
            r12 = r19
            r14 = r11
            r15 = r14
            r13 = 0
        L_0x000e:
            r16 = 0
            if (r12 >= r7) goto L_0x0096
            if (r13 != r8) goto L_0x0015
            return r16
        L_0x0015:
            int r5 = r12 + 2
            if (r5 > r7) goto L_0x0038
            r4 = 4
            r17 = 0
            java.lang.String r1 = "::"
            r3 = 0
            r0 = r18
            r2 = r12
            r10 = r5
            r5 = r17
            boolean r0 = HJ.C15854t.V(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0038
            if (r14 == r11) goto L_0x002e
            return r16
        L_0x002e:
            int r13 = r13 + 2
            if (r10 != r7) goto L_0x0035
            r14 = r13
            goto L_0x0096
        L_0x0035:
            r15 = r10
            r14 = r13
            goto L_0x0067
        L_0x0038:
            if (r13 == 0) goto L_0x004a
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r18
            r2 = r12
            boolean r0 = HJ.C15854t.V(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x004c
            int r12 = r12 + 1
        L_0x004a:
            r15 = r12
            goto L_0x0067
        L_0x004c:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r18
            r2 = r12
            boolean r0 = HJ.C15854t.V(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0066
            int r0 = r13 + -2
            boolean r0 = b(r6, r15, r7, r9, r0)
            if (r0 != 0) goto L_0x0063
            return r16
        L_0x0063:
            int r13 = r13 + 2
            goto L_0x0096
        L_0x0066:
            return r16
        L_0x0067:
            r12 = r15
            r0 = 0
        L_0x0069:
            if (r12 >= r7) goto L_0x007b
            char r1 = r6.charAt(r12)
            int r1 = HK.C15864d.I(r1)
            if (r1 == r11) goto L_0x007b
            int r0 = r0 << 4
            int r0 = r0 + r1
            int r12 = r12 + 1
            goto L_0x0069
        L_0x007b:
            int r1 = r12 - r15
            if (r1 == 0) goto L_0x0095
            r2 = 4
            if (r1 <= r2) goto L_0x0083
            goto L_0x0095
        L_0x0083:
            int r1 = r13 + 1
            int r2 = r0 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r13] = r2
            int r13 = r13 + 2
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r9[r1] = r0
            goto L_0x000e
        L_0x0095:
            return r16
        L_0x0096:
            if (r13 == r8) goto L_0x00a8
            if (r14 != r11) goto L_0x009b
            return r16
        L_0x009b:
            int r0 = r13 - r14
            int r1 = 16 - r0
            java.lang.System.arraycopy(r9, r14, r9, r1, r0)
            int r8 = r8 - r13
            int r8 = r8 + r14
            r0 = 0
            java.util.Arrays.fill(r9, r14, r8, r0)
        L_0x00a8:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: HK.C15861a.c(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String d(byte[] bArr) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        C16770e eVar = new C16770e();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                eVar.Z1(58);
                i11 += i13;
                if (i11 == 16) {
                    eVar.Z1(58);
                }
            } else {
                if (i11 > 0) {
                    eVar.Z1(58);
                }
                eVar.D2((long) ((C15864d.d(bArr[i11], 255) << 8) | C15864d.d(bArr[i11 + 1], 255)));
                i11 += 2;
            }
        }
        return eVar.l0();
    }

    public static final String e(String str) {
        C17542s.j(str, "<this>");
        if (C15854t.d0(str, ":", false, 2, (Object) null)) {
            InetAddress c10 = (!C15854t.W(str, "[", false, 2, (Object) null) || !C15854t.G(str, "]", false, 2, (Object) null)) ? c(str, 0, str.length()) : c(str, 1, str.length() - 1);
            if (c10 == null) {
                return null;
            }
            byte[] address = c10.getAddress();
            if (address.length == 16) {
                C17542s.i(address, PlaceTypes.ADDRESS);
                return d(address);
            } else if (address.length == 4) {
                return c10.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                C17542s.i(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                String lowerCase = ascii.toLowerCase(locale);
                C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() != 0 && !a(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
