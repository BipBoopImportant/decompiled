package XK;

import WK.C16760C;
import WK.C16767b;
import WK.C16770e;
import WK.I;
import WK.S;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u0019*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u001a\u0010!\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0014\u0010$\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#¨\u0006%"}, d2 = {"LWK/I;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "e", "(LWK/I;I[BII)Z", "LWK/e;", "", "newline", "", "f", "(LWK/e;J)Ljava/lang/String;", "LWK/C;", "options", "selectTruncated", "g", "(LWK/e;LWK/C;Z)I", "v", "c", "(J)I", "LWK/e$a;", "unsafeCursor", "b", "(LWK/e;LWK/e$a;)LWK/e$a;", "a", "[B", "d", "()[B", "HEX_DIGIT_BYTES", "", "[J", "DigitCountToLargestValue", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: XK.a  reason: case insensitive filesystem */
public final class C16834a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f140281a = S.a("0123456789abcdef");

    /* renamed from: b  reason: collision with root package name */
    private static final long[] f140282b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final C16770e.a b(C16770e eVar, C16770e.a aVar) {
        C17542s.j(eVar, "<this>");
        C17542s.j(aVar, "unsafeCursor");
        C16770e.a g10 = C16767b.g(aVar);
        if (g10.f139655a == null) {
            g10.f139655a = eVar;
            g10.f139656b = true;
            return g10;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    /* access modifiers changed from: private */
    public static final int c(long j10) {
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        return numberOfLeadingZeros + (j10 > f140282b[numberOfLeadingZeros] ? 1 : 0);
    }

    public static final byte[] d() {
        return f140281a;
    }

    public static final boolean e(I i10, int i11, byte[] bArr, int i12, int i13) {
        C17542s.j(i10, "segment");
        C17542s.j(bArr, "bytes");
        int i14 = i10.f139612c;
        byte[] bArr2 = i10.f139610a;
        while (i12 < i13) {
            if (i11 == i14) {
                i10 = i10.f139615f;
                C17542s.g(i10);
                byte[] bArr3 = i10.f139610a;
                int i15 = i10.f139611b;
                bArr2 = bArr3;
                i11 = i15;
                i14 = i10.f139612c;
            }
            if (bArr2[i11] != bArr[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public static final String f(C16770e eVar, long j10) {
        C17542s.j(eVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.u(j11) == 13) {
                String B12 = eVar.B1(j11);
                eVar.M(2);
                return B12;
            }
        }
        String B13 = eVar.B1(j10);
        eVar.M(1);
        return B13;
    }

    public static final int g(C16770e eVar, C16760C c10, boolean z10) {
        int i10;
        int i11;
        int i12;
        I i13;
        int i14;
        C16770e eVar2 = eVar;
        C17542s.j(eVar2, "<this>");
        C17542s.j(c10, "options");
        I i15 = eVar2.f139653a;
        if (i15 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = i15.f139610a;
        int i16 = i15.f139611b;
        int i17 = i15.f139612c;
        int[] q10 = c10.q();
        I i18 = i15;
        int i19 = -1;
        int i20 = 0;
        loop0:
        while (true) {
            int i21 = i20 + 1;
            int i22 = q10[i20];
            int i23 = i20 + 2;
            int i24 = q10[i21];
            if (i24 != -1) {
                i19 = i24;
            }
            if (i18 == null) {
                break;
            }
            if (i22 < 0) {
                int i25 = i23 + (i22 * -1);
                while (true) {
                    int i26 = i16 + 1;
                    int i27 = i23 + 1;
                    if ((bArr[i16] & 255) != q10[i23]) {
                        return i19;
                    }
                    boolean z11 = i27 == i25;
                    if (i26 == i17) {
                        C17542s.g(i18);
                        I i28 = i18.f139615f;
                        C17542s.g(i28);
                        i14 = i28.f139611b;
                        byte[] bArr2 = i28.f139610a;
                        i12 = i28.f139612c;
                        if (i28 == i15) {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr2;
                            i13 = null;
                        } else {
                            byte[] bArr3 = bArr2;
                            i13 = i28;
                            bArr = bArr3;
                        }
                    } else {
                        i13 = i18;
                        i12 = i17;
                        i14 = i26;
                    }
                    if (z11) {
                        i11 = q10[i27];
                        i10 = i14;
                        i17 = i12;
                        i18 = i13;
                        break;
                    }
                    i16 = i14;
                    i17 = i12;
                    i18 = i13;
                    i23 = i27;
                }
            } else {
                i10 = i16 + 1;
                byte b10 = bArr[i16] & 255;
                int i29 = i23 + i22;
                while (i23 != i29) {
                    if (b10 == q10[i23]) {
                        i11 = q10[i23 + i22];
                        if (i10 == i17) {
                            i18 = i18.f139615f;
                            C17542s.g(i18);
                            i10 = i18.f139611b;
                            bArr = i18.f139610a;
                            i17 = i18.f139612c;
                            if (i18 == i15) {
                                i18 = null;
                            }
                        }
                    } else {
                        i23++;
                    }
                }
                return i19;
            }
            if (i11 >= 0) {
                return i11;
            }
            i20 = -i11;
            i16 = i10;
        }
        if (z10) {
            return -2;
        }
        return i19;
    }

    public static /* synthetic */ int h(C16770e eVar, C16760C c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return g(eVar, c10, z10);
    }
}
