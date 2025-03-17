package kI;

import HJ.C15835a;
import HJ.C15838d;
import YH.C16860d;
import fI.C17221b;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0011\b\u0017\u0018\u0000 32\u00020\u0001:\u0002\u001f2B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\"\u0010#J)\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J)\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(J)\u0010*\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020)2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b,\u0010(J7\u0010-\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b-\u0010\u0013J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eH\u0000¢\u0006\u0004\b/\u00100J'\u00101\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b1\u0010\u001cJ'\u00102\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b2\u0010+J'\u00103\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b3\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u00104\u001a\u0004\b6\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"LkI/a;", "", "", "isUrlSafe", "isMimeScheme", "LkI/a$b;", "paddingOption", "<init>", "(ZZLkI/a$b;)V", "q", "()Z", "", "source", "destination", "", "destinationOffset", "startIndex", "endIndex", "i", "([B[BIII)I", "padIndex", "byteStart", "p", "([BIII)I", "LXH/N;", "c", "(I)V", "r", "([BII)I", "destinationSize", "capacityNeeded", "b", "(III)V", "option", "s", "(LkI/a$b;)LkI/a;", "", "k", "([BII)Ljava/lang/String;", "f", "([BII)[B", "", "e", "(Ljava/lang/CharSequence;II)[B", "o", "m", "sourceSize", "n", "(I)I", "j", "a", "d", "Z", "isUrlSafe$kotlin_stdlib", "isMimeScheme$kotlin_stdlib", "LkI/a$b;", "getPaddingOption$kotlin_stdlib", "()LkI/a$b;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kI.a  reason: case insensitive filesystem */
public class C17500a {

    /* renamed from: d  reason: collision with root package name */
    public static final C3521a f144250d = new C3521a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f144251e = {13, 10};

    /* renamed from: f  reason: collision with root package name */
    private static final C17500a f144252f;

    /* renamed from: g  reason: collision with root package name */
    private static final C17500a f144253g;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f144254a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f144255b;

    /* renamed from: c  reason: collision with root package name */
    private final b f144256c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"LkI/a$a;", "LkI/a;", "<init>", "()V", "", "bitsPerByte", "I", "bitsPerSymbol", "bytesPerGroup", "symbolsPerGroup", "", "padSymbol", "B", "mimeLineLength", "mimeGroupsPerLine", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kI.a$a  reason: collision with other inner class name */
    public static final class C3521a extends C17500a {
        public /* synthetic */ C3521a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3521a() {
            super(false, false, b.PRESENT, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LkI/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kI.a$b */
    public enum b {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    static {
        b bVar = b.PRESENT;
        f144252f = new C17500a(true, false, bVar);
        f144253g = new C17500a(false, true, bVar);
    }

    public /* synthetic */ C17500a(boolean z10, boolean z11, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, bVar);
    }

    private final void b(int i10, int i11, int i12) {
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException("destination offset: " + i11 + ", destination size: " + i10);
        }
        int i13 = i11 + i12;
        if (i13 < 0 || i13 > i10) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i11 + ", destination size: " + i10 + ", capacity needed: " + i12);
        }
    }

    private final void c(int i10) {
        if (this.f144256c == b.ABSENT) {
            throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i10);
        }
    }

    public static /* synthetic */ byte[] g(C17500a aVar, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = charSequence.length();
            }
            return aVar.e(charSequence, i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public static /* synthetic */ byte[] h(C17500a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.f(bArr, i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    private final int i(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        boolean z10;
        byte[] bArr3 = bArr;
        int i13 = i12;
        int[] c10 = this.f144254a ? C17501b.f144260d : C17501b.f144258b;
        int i14 = -8;
        int i15 = i10;
        int i16 = i11;
        int i17 = -8;
        int i18 = 0;
        while (true) {
            if (i16 >= i13) {
                z10 = false;
                break;
            }
            if (i17 == i14 && i16 + 3 < i13) {
                int i19 = i16 + 4;
                int i20 = (c10[bArr3[i16 + 1] & 255] << 12) | (c10[bArr3[i16] & 255] << 18) | (c10[bArr3[i16 + 2] & 255] << 6) | c10[bArr3[i16 + 3] & 255];
                if (i20 >= 0) {
                    bArr2[i15] = (byte) (i20 >> 16);
                    int i21 = i15 + 2;
                    bArr2[i15 + 1] = (byte) (i20 >> 8);
                    i15 += 3;
                    bArr2[i21] = (byte) i20;
                    i16 = i19;
                    i14 = -8;
                }
            }
            byte b10 = bArr3[i16] & 255;
            int i22 = c10[b10];
            if (i22 >= 0) {
                i16++;
                i18 = (i18 << 6) | i22;
                int i23 = i17 + 6;
                if (i23 >= 0) {
                    bArr2[i15] = (byte) (i18 >>> i23);
                    i18 &= (1 << i23) - 1;
                    i17 -= 2;
                    i15++;
                } else {
                    i17 = i23;
                }
            } else if (i22 == -2) {
                i16 = p(bArr3, i16, i13, i17);
                z10 = true;
                break;
            } else if (this.f144255b) {
                i16++;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid symbol '");
                sb2.append((char) b10);
                sb2.append("'(");
                String num = Integer.toString(b10, C15835a.a(8));
                C17542s.i(num, "toString(...)");
                sb2.append(num);
                sb2.append(") at index ");
                sb2.append(i16);
                throw new IllegalArgumentException(sb2.toString());
            }
            i14 = -8;
        }
        if (i17 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        } else if (i17 != -8 && !z10 && this.f144256c == b.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        } else if (i18 == 0) {
            int r10 = r(bArr3, i16, i13);
            if (r10 >= i13) {
                return i15 - i10;
            }
            byte b11 = bArr3[r10] & 255;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Symbol '");
            sb3.append((char) b11);
            sb3.append("'(");
            String num2 = Integer.toString(b11, C15835a.a(8));
            C17542s.i(num2, "toString(...)");
            sb3.append(num2);
            sb3.append(") at index ");
            sb3.append(r10 - 1);
            sb3.append(" is prohibited after the pad character");
            throw new IllegalArgumentException(sb3.toString());
        } else {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
    }

    public static /* synthetic */ String l(C17500a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.k(bArr, i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
    }

    private final int p(byte[] bArr, int i10, int i11, int i12) {
        if (i12 != -8) {
            if (i12 == -6) {
                c(i10);
            } else if (i12 == -4) {
                c(i10);
                i10 = r(bArr, i10 + 1, i11);
                if (i10 == i11 || bArr[i10] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + i10);
                }
            } else if (i12 != -2) {
                throw new IllegalStateException("Unreachable");
            }
            return i10 + 1;
        }
        throw new IllegalArgumentException("Redundant pad character at index " + i10);
    }

    private final boolean q() {
        b bVar = this.f144256c;
        return bVar == b.PRESENT || bVar == b.PRESENT_OPTIONAL;
    }

    private final int r(byte[] bArr, int i10, int i11) {
        if (!this.f144255b) {
            return i10;
        }
        while (i10 < i11) {
            if (C17501b.f144258b[bArr[i10] & 255] != -1) {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    public final byte[] a(CharSequence charSequence, int i10, int i11) {
        C17542s.j(charSequence, "source");
        d(charSequence.length(), i10, i11);
        byte[] bArr = new byte[(i11 - i10)];
        int i12 = 0;
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (charAt <= 255) {
                bArr[i12] = (byte) charAt;
                i12++;
            } else {
                bArr[i12] = 63;
                i12++;
            }
            i10++;
        }
        return bArr;
    }

    public final void d(int i10, int i11, int i12) {
        C16860d.f140429a.a(i11, i12, i10);
    }

    public final byte[] e(CharSequence charSequence, int i10, int i11) {
        byte[] a10;
        C17542s.j(charSequence, "source");
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            d(str.length(), i10, i11);
            String substring = str.substring(i10, i11);
            C17542s.i(substring, "substring(...)");
            Charset charset = C15838d.f135284g;
            C17542s.h(substring, "null cannot be cast to non-null type java.lang.String");
            a10 = substring.getBytes(charset);
            C17542s.i(a10, "getBytes(...)");
        } else {
            a10 = a(charSequence, i10, i11);
        }
        return h(this, a10, 0, 0, 6, (Object) null);
    }

    public final byte[] f(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "source");
        d(bArr.length, i10, i11);
        int j10 = j(bArr, i10, i11);
        byte[] bArr2 = new byte[j10];
        if (i(bArr, bArr2, 0, i10, i11) == j10) {
            return bArr2;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int j(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "source");
        int i12 = i11 - i10;
        if (i12 == 0) {
            return 0;
        }
        if (i12 != 1) {
            if (this.f144255b) {
                while (true) {
                    if (i10 >= i11) {
                        break;
                    }
                    int i13 = C17501b.f144258b[bArr[i10] & 255];
                    if (i13 < 0) {
                        if (i13 == -2) {
                            i12 -= i11 - i10;
                            break;
                        }
                        i12--;
                    }
                    i10++;
                }
            } else if (bArr[i11 - 1] == 61) {
                i12 = bArr[i11 + -2] == 61 ? i12 - 2 : i12 - 1;
            }
            return (int) ((((long) i12) * ((long) 6)) / ((long) 8));
        }
        throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i10 + ", endIndex: " + i11);
    }

    public final String k(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "source");
        return new String(o(bArr, i10, i11), C15838d.f135284g);
    }

    public final int m(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        C17542s.j(bArr3, "source");
        C17542s.j(bArr4, "destination");
        d(bArr3.length, i14, i15);
        b(bArr4.length, i13, n(i15 - i14));
        byte[] d10 = this.f144254a ? C17501b.f144259c : C17501b.f144257a;
        int i16 = this.f144255b ? 19 : Integer.MAX_VALUE;
        int i17 = i13;
        while (i14 + 2 < i15) {
            int min = Math.min((i15 - i14) / 3, i16);
            for (int i18 = 0; i18 < min; i18++) {
                int i19 = i14 + 2;
                i14 += 3;
                byte b10 = ((bArr3[i14 + 1] & 255) << 8) | ((bArr3[i14] & 255) << 16) | (bArr3[i19] & 255);
                bArr4[i17] = d10[b10 >>> 18];
                bArr4[i17 + 1] = d10[(b10 >>> 12) & 63];
                int i20 = i17 + 3;
                bArr4[i17 + 2] = d10[(b10 >>> 6) & 63];
                i17 += 4;
                bArr4[i20] = d10[b10 & 63];
            }
            if (min == i16 && i14 != i15) {
                int i21 = i17 + 1;
                byte[] bArr5 = f144251e;
                bArr4[i17] = bArr5[0];
                i17 += 2;
                bArr4[i21] = bArr5[1];
            }
        }
        int i22 = i15 - i14;
        if (i22 == 1) {
            int i23 = i14 + 1;
            int i24 = (bArr3[i14] & 255) << 4;
            bArr4[i17] = d10[i24 >>> 6];
            int i25 = i17 + 2;
            bArr4[i17 + 1] = d10[i24 & 63];
            if (q()) {
                int i26 = i17 + 3;
                bArr4[i25] = 61;
                i17 += 4;
                bArr4[i26] = 61;
                i14 = i23;
            } else {
                i14 = i23;
                i17 = i25;
            }
        } else if (i22 == 2) {
            int i27 = i14 + 1;
            i14 += 2;
            int i28 = ((bArr3[i27] & 255) << 2) | ((bArr3[i14] & 255) << 10);
            bArr4[i17] = d10[i28 >>> 12];
            bArr4[i17 + 1] = d10[(i28 >>> 6) & 63];
            int i29 = i17 + 3;
            bArr4[i17 + 2] = d10[i28 & 63];
            if (q()) {
                i17 += 4;
                bArr4[i29] = 61;
            } else {
                i17 = i29;
            }
        }
        if (i14 == i15) {
            return i17 - i13;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int n(int i10) {
        int i11 = i10 / 3;
        int i12 = i10 % 3;
        int i13 = 4;
        int i14 = i11 * 4;
        if (i12 != 0) {
            if (!q()) {
                i13 = i12 + 1;
            }
            i14 += i13;
        }
        if (this.f144255b) {
            i14 += ((i14 - 1) / 76) * 2;
        }
        if (i14 >= 0) {
            return i14;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public final byte[] o(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "source");
        d(bArr.length, i10, i11);
        byte[] bArr2 = new byte[n(i11 - i10)];
        m(bArr, bArr2, 0, i10, i11);
        return bArr2;
    }

    public final C17500a s(b bVar) {
        C17542s.j(bVar, "option");
        return this.f144256c == bVar ? this : new C17500a(this.f144254a, this.f144255b, bVar);
    }

    private C17500a(boolean z10, boolean z11, b bVar) {
        this.f144254a = z10;
        this.f144255b = z11;
        this.f144256c = bVar;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
