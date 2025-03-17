package com.google.android.gms.internal.clearcut;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class R1 {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f48255a;

    /* renamed from: b  reason: collision with root package name */
    private M f48256b;

    /* renamed from: c  reason: collision with root package name */
    private int f48257c;

    private R1(ByteBuffer byteBuffer) {
        this.f48255a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int A(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    private final void e(int i10) {
        byte b10 = (byte) i10;
        if (this.f48255a.hasRemaining()) {
            this.f48255a.put(b10);
            return;
        }
        throw new S1(this.f48255a.position(), this.f48255a.limit());
    }

    private final void f(int i10) {
        while ((i10 & -128) != 0) {
            e((i10 & 127) | 128);
            i10 >>>= 7;
        }
        e(i10);
    }

    public static int g(int i10, X1 x12) {
        int y10 = y(i10);
        int c10 = x12.c();
        return y10 + A(c10) + c10;
    }

    public static int h(int i10, String str) {
        return y(i10) + r(str);
    }

    public static int i(int i10, byte[] bArr) {
        return y(i10) + s(bArr);
    }

    public static int m(int i10, long j10) {
        return y(i10) + x(j10);
    }

    private static void n(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        CharSequence charSequence2 = charSequence;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!byteBuffer.isReadOnly()) {
            char c10 = 57343;
            int i11 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i12 = remaining + arrayOffset;
                    while (i11 < length) {
                        int i13 = i11 + arrayOffset;
                        if (i13 >= i12 || (charAt = charSequence2.charAt(i11)) >= 128) {
                            break;
                        }
                        array[i13] = (byte) charAt;
                        i11++;
                    }
                    if (i11 == length) {
                        i10 = arrayOffset + length;
                    } else {
                        i10 = arrayOffset + i11;
                        while (i11 < length) {
                            char charAt2 = charSequence2.charAt(i11);
                            if (charAt2 < 128 && i10 < i12) {
                                array[i10] = (byte) charAt2;
                                i10++;
                            } else if (charAt2 < 2048 && i10 <= i12 - 2) {
                                int i14 = i10 + 1;
                                array[i10] = (byte) ((charAt2 >>> 6) | 960);
                                i10 += 2;
                                array[i14] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c10 < charAt2) && i10 <= i12 - 3) {
                                array[i10] = (byte) ((charAt2 >>> 12) | 480);
                                int i15 = i10 + 2;
                                array[i10 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i10 += 3;
                                array[i15] = (byte) ((charAt2 & '?') | 128);
                            } else if (i10 <= i12 - 4) {
                                int i16 = i11 + 1;
                                if (i16 != charSequence.length()) {
                                    char charAt3 = charSequence2.charAt(i16);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i10] = (byte) ((codePoint >>> 18) | 240);
                                        array[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i17 = i10 + 3;
                                        array[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i10 += 4;
                                        array[i17] = (byte) ((codePoint & 63) | 128);
                                        i11 = i16;
                                    } else {
                                        i11 = i16;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11 - 1);
                                throw new IllegalArgumentException(sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt2);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            i11++;
                            c10 = 57343;
                        }
                    }
                    byteBuffer2.position(i10 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e10) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e10);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt4 = charSequence2.charAt(i11);
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            byteBuffer2.put((byte) ((charAt4 >>> 6) | 960));
                            charAt4 = (charAt4 & '?') | 128;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer2.put((byte) ((charAt4 >>> 12) | 480));
                            byteBuffer2.put((byte) (((charAt4 >>> 6) & 63) | 128));
                            byteBuffer2.put((byte) ((charAt4 & '?') | 128));
                            i11++;
                        } else {
                            int i18 = i11 + 1;
                            if (i18 != charSequence.length()) {
                                char charAt5 = charSequence2.charAt(i18);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer2.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer2.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer2.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer2.put((byte) ((codePoint2 & 63) | 128));
                                    i11 = i18;
                                    i11++;
                                } else {
                                    i11 = i18;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                    }
                    byteBuffer2.put((byte) charAt4);
                    i11++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    public static R1 q(byte[] bArr) {
        return t(bArr, 0, bArr.length);
    }

    public static int r(String str) {
        int a10 = a(str);
        return A(a10) + a10;
    }

    public static int s(byte[] bArr) {
        return A(bArr.length) + bArr.length;
    }

    public static R1 t(byte[] bArr, int i10, int i11) {
        return new R1(bArr, 0, i11);
    }

    public static long v(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int x(long j10) {
        if ((-128 & j10) == 0) {
            return 1;
        }
        if ((-16384 & j10) == 0) {
            return 2;
        }
        if ((-2097152 & j10) == 0) {
            return 3;
        }
        if ((-268435456 & j10) == 0) {
            return 4;
        }
        if ((-34359738368L & j10) == 0) {
            return 5;
        }
        if ((-4398046511104L & j10) == 0) {
            return 6;
        }
        if ((-562949953421312L & j10) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int y(int i10) {
        return A(i10 << 3);
    }

    public static int z(int i10) {
        if (i10 >= 0) {
            return A(i10);
        }
        return 10;
    }

    public final void b(int i10, X1 x12) {
        j(i10, 2);
        if (x12.f48281a < 0) {
            x12.c();
        }
        f(x12.f48281a);
        x12.a(this);
    }

    public final void c(int i10, String str) {
        j(i10, 2);
        try {
            int A10 = A(str.length());
            if (A10 == A(str.length() * 3)) {
                int position = this.f48255a.position();
                if (this.f48255a.remaining() >= A10) {
                    this.f48255a.position(position + A10);
                    n(str, this.f48255a);
                    int position2 = this.f48255a.position();
                    this.f48255a.position(position);
                    f((position2 - position) - A10);
                    this.f48255a.position(position2);
                    return;
                }
                throw new S1(position + A10, this.f48255a.limit());
            }
            f(a(str));
            n(str, this.f48255a);
        } catch (BufferOverflowException e10) {
            S1 s12 = new S1(this.f48255a.position(), this.f48255a.limit());
            s12.initCause(e10);
            throw s12;
        }
    }

    public final void d(int i10, byte[] bArr) {
        j(i10, 2);
        f(bArr.length);
        int length = bArr.length;
        if (this.f48255a.remaining() >= length) {
            this.f48255a.put(bArr, 0, length);
            return;
        }
        throw new S1(this.f48255a.position(), this.f48255a.limit());
    }

    public final void j(int i10, int i11) {
        f((i10 << 3) | i11);
    }

    public final void k(int i10, boolean z10) {
        j(25, 0);
        byte b10 = z10 ? (byte) 1 : 0;
        if (this.f48255a.hasRemaining()) {
            this.f48255a.put(b10);
            return;
        }
        throw new S1(this.f48255a.position(), this.f48255a.limit());
    }

    public final void l(int i10, int i11) {
        j(i10, 0);
        if (i11 >= 0) {
            f(i11);
        } else {
            w((long) i11);
        }
    }

    public final void o(int i10, M0 m02) {
        if (this.f48256b == null) {
            this.f48256b = M.f(this.f48255a);
        } else {
            if (this.f48257c != this.f48255a.position()) {
                this.f48256b.c(this.f48255a.array(), this.f48257c, this.f48255a.position() - this.f48257c);
            }
            M m10 = this.f48256b;
            m10.n(i10, m02);
            m10.b();
            this.f48257c = this.f48255a.position();
        }
        this.f48257c = this.f48255a.position();
        M m102 = this.f48256b;
        m102.n(i10, m02);
        m102.b();
        this.f48257c = this.f48255a.position();
    }

    public final void p() {
        if (this.f48255a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f48255a.remaining())}));
        }
    }

    public final void u(int i10, long j10) {
        j(i10, 0);
        w(j10);
    }

    public final void w(long j10) {
        while ((-128 & j10) != 0) {
            e((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        e((int) j10);
    }

    private R1(byte[] bArr, int i10, int i11) {
        this(ByteBuffer.wrap(bArr, i10, i11));
    }
}
