package SH;

import XH.C16804K;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0005\u001aA\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aQ\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aQ\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0001¢\u0006\u0004\b \u0010\u001f\u001a\u001f\u0010$\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0000¢\u0006\u0004\b$\u0010%\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"LPH/c;", "", "text", "", "from", "to", "dstOffset", "dstLimit", "LSH/c;", "b", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIII)I", "index1", "lastCharIndex", "resultPosition1", "resultLimit", "c", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIIIII)I", "d", "byteCount", "", "i", "(I)Ljava/lang/Void;", "value", "j", "cp", "", "f", "(I)Z", "codePoint", "g", "h", "(I)I", "e", "", "high", "low", "a", "(CC)I", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final int a(char c10, char c11) {
        return ((c10 - 55232) << 10) | (c11 - 56320);
    }

    public static final int b(ByteBuffer byteBuffer, CharSequence charSequence, int i10, int i11, int i12, int i13) {
        C17542s.j(byteBuffer, "$this$encodeUTF8");
        C17542s.j(charSequence, "text");
        int min = Math.min(i11, i10 + 65535);
        int i14 = C17978n.i(i13, 65535);
        int i15 = i10;
        int i16 = i12;
        while (i16 < i14 && i15 < min) {
            int i17 = i15 + 1;
            char charAt = charSequence.charAt(i15);
            char c10 = charAt & 65535;
            if ((charAt & 65408) != 0) {
                return c(byteBuffer, charSequence, i15, min, i10, i16, i14, i12);
            }
            byteBuffer.put(i16, (byte) c10);
            i15 = i17;
            i16++;
        }
        return C16418c.d(C16804K.b((short) (i15 - i10)), C16804K.b((short) (i16 - i12)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int c(java.nio.ByteBuffer r11, java.lang.CharSequence r12, int r13, int r14, int r15, int r16, int r17, int r18) {
        /*
            r0 = r11
            r1 = r12
            r3 = r14
            int r2 = r17 + -3
            r4 = r13
            r5 = r16
        L_0x0008:
            int r6 = r2 - r5
            if (r6 <= 0) goto L_0x00c0
            if (r4 < r3) goto L_0x0010
            goto L_0x00c0
        L_0x0010:
            int r6 = r4 + 1
            char r7 = r12.charAt(r4)
            boolean r8 = java.lang.Character.isHighSurrogate(r7)
            r9 = 63
            if (r8 == 0) goto L_0x0039
            if (r6 == r3) goto L_0x0036
            char r8 = r12.charAt(r6)
            boolean r8 = java.lang.Character.isLowSurrogate(r8)
            if (r8 != 0) goto L_0x002b
            goto L_0x0036
        L_0x002b:
            int r4 = r4 + 2
            char r6 = r12.charAt(r6)
            int r7 = a(r7, r6)
            goto L_0x003a
        L_0x0036:
            r4 = r6
            r7 = r9
            goto L_0x003a
        L_0x0039:
            r4 = r6
        L_0x003a:
            r6 = 128(0x80, float:1.794E-43)
            if (r7 < 0) goto L_0x0046
            if (r7 >= r6) goto L_0x0046
            byte r6 = (byte) r7
            r11.put(r5, r6)
            r6 = 1
            goto L_0x00b4
        L_0x0046:
            r8 = 2048(0x800, float:2.87E-42)
            if (r6 > r7) goto L_0x0061
            if (r7 >= r8) goto L_0x0061
            int r8 = r7 >> 6
            r8 = r8 & 31
            r8 = r8 | 192(0xc0, float:2.69E-43)
            byte r8 = (byte) r8
            r11.put(r5, r8)
            int r8 = r5 + 1
            r7 = r7 & 63
            r6 = r6 | r7
            byte r6 = (byte) r6
            r11.put(r8, r6)
            r6 = 2
            goto L_0x00b4
        L_0x0061:
            r10 = 65536(0x10000, float:9.18355E-41)
            if (r8 > r7) goto L_0x0086
            if (r7 >= r10) goto L_0x0086
            int r8 = r7 >> 12
            r8 = r8 & 15
            r8 = r8 | 224(0xe0, float:3.14E-43)
            byte r8 = (byte) r8
            r11.put(r5, r8)
            int r8 = r5 + 1
            int r10 = r7 >> 6
            r9 = r9 & r10
            r9 = r9 | r6
            byte r9 = (byte) r9
            r11.put(r8, r9)
            int r8 = r5 + 2
            r7 = r7 & 63
            r6 = r6 | r7
            byte r6 = (byte) r6
            r11.put(r8, r6)
            r6 = 3
            goto L_0x00b4
        L_0x0086:
            if (r10 > r7) goto L_0x00b7
            r8 = 1114112(0x110000, float:1.561203E-39)
            if (r7 >= r8) goto L_0x00b7
            int r8 = r7 >> 18
            r8 = r8 & 7
            r8 = r8 | 240(0xf0, float:3.36E-43)
            byte r8 = (byte) r8
            r11.put(r5, r8)
            int r8 = r5 + 1
            int r10 = r7 >> 12
            r10 = r10 & r9
            r10 = r10 | r6
            byte r10 = (byte) r10
            r11.put(r8, r10)
            int r8 = r5 + 2
            int r10 = r7 >> 6
            r9 = r9 & r10
            r9 = r9 | r6
            byte r9 = (byte) r9
            r11.put(r8, r9)
            int r8 = r5 + 3
            r7 = r7 & 63
            r6 = r6 | r7
            byte r6 = (byte) r6
            r11.put(r8, r6)
            r6 = 4
        L_0x00b4:
            int r5 = r5 + r6
            goto L_0x0008
        L_0x00b7:
            j(r7)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x00c0:
            if (r5 != r2) goto L_0x00d0
            r0 = r11
            r1 = r12
            r2 = r4
            r3 = r14
            r4 = r15
            r6 = r17
            r7 = r18
            int r0 = d(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
        L_0x00d0:
            int r4 = r4 - r15
            short r0 = (short) r4
            short r0 = XH.C16804K.b(r0)
            int r5 = r5 - r18
            short r1 = (short) r5
            short r1 = XH.C16804K.b(r1)
            int r0 = SH.C16418c.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: SH.f.c(java.nio.ByteBuffer, java.lang.CharSequence, int, int, int, int, int, int):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: char} */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        throw new XH.C16820k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fd, code lost:
        return SH.C16418c.d(XH.C16804K.b((short) (r3 - r20)), XH.C16804K.b((short) (r4 - r23)));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int d(java.nio.ByteBuffer r16, java.lang.CharSequence r17, int r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r18
            r4 = r21
        L_0x000a:
            int r5 = r22 - r4
            if (r5 <= 0) goto L_0x00eb
            if (r3 < r2) goto L_0x0012
            goto L_0x00eb
        L_0x0012:
            int r6 = r3 + 1
            char r7 = r1.charAt(r3)
            boolean r8 = java.lang.Character.isHighSurrogate(r7)
            r9 = 63
            if (r8 != 0) goto L_0x0022
            r3 = r6
            goto L_0x003c
        L_0x0022:
            if (r6 == r2) goto L_0x003a
            char r8 = r1.charAt(r6)
            boolean r8 = java.lang.Character.isLowSurrogate(r8)
            if (r8 != 0) goto L_0x002f
            goto L_0x003a
        L_0x002f:
            int r3 = r3 + 2
            char r6 = r1.charAt(r6)
            int r7 = a(r7, r6)
            goto L_0x003c
        L_0x003a:
            r3 = r6
            r7 = r9
        L_0x003c:
            r8 = 1114112(0x110000, float:1.561203E-39)
            r10 = 3
            r11 = 65536(0x10000, float:9.18355E-41)
            r12 = 2048(0x800, float:2.87E-42)
            r13 = 2
            r14 = 1
            r15 = 128(0x80, float:1.794E-43)
            if (r14 > r7) goto L_0x004d
            if (r7 >= r15) goto L_0x004d
            r6 = r14
            goto L_0x005e
        L_0x004d:
            if (r15 > r7) goto L_0x0053
            if (r7 >= r12) goto L_0x0053
            r6 = r13
            goto L_0x005e
        L_0x0053:
            if (r12 > r7) goto L_0x0059
            if (r7 >= r11) goto L_0x0059
            r6 = r10
            goto L_0x005e
        L_0x0059:
            if (r11 > r7) goto L_0x00e2
            if (r7 >= r8) goto L_0x00e2
            r6 = 4
        L_0x005e:
            if (r6 <= r5) goto L_0x0064
            int r3 = r3 + -1
            goto L_0x00eb
        L_0x0064:
            if (r7 < 0) goto L_0x006e
            if (r7 >= r15) goto L_0x006e
            byte r5 = (byte) r7
            r0.put(r4, r5)
            r6 = r14
            goto L_0x00d6
        L_0x006e:
            if (r15 > r7) goto L_0x0087
            if (r7 >= r12) goto L_0x0087
            int r5 = r7 >> 6
            r5 = r5 & 31
            r5 = r5 | 192(0xc0, float:2.69E-43)
            byte r5 = (byte) r5
            r0.put(r4, r5)
            int r5 = r4 + 1
            r6 = r7 & 63
            r6 = r6 | r15
            byte r6 = (byte) r6
            r0.put(r5, r6)
            r6 = r13
            goto L_0x00d6
        L_0x0087:
            if (r12 > r7) goto L_0x00aa
            if (r7 >= r11) goto L_0x00aa
            int r5 = r7 >> 12
            r5 = r5 & 15
            r5 = r5 | 224(0xe0, float:3.14E-43)
            byte r5 = (byte) r5
            r0.put(r4, r5)
            int r5 = r4 + 1
            int r6 = r7 >> 6
            r6 = r6 & r9
            r6 = r6 | r15
            byte r6 = (byte) r6
            r0.put(r5, r6)
            int r5 = r4 + 2
            r6 = r7 & 63
            r6 = r6 | r15
            byte r6 = (byte) r6
            r0.put(r5, r6)
            r6 = r10
            goto L_0x00d6
        L_0x00aa:
            if (r11 > r7) goto L_0x00d9
            if (r7 >= r8) goto L_0x00d9
            int r5 = r7 >> 18
            r5 = r5 & 7
            r5 = r5 | 240(0xf0, float:3.36E-43)
            byte r5 = (byte) r5
            r0.put(r4, r5)
            int r5 = r4 + 1
            int r6 = r7 >> 12
            r6 = r6 & r9
            r6 = r6 | r15
            byte r6 = (byte) r6
            r0.put(r5, r6)
            int r5 = r4 + 2
            int r6 = r7 >> 6
            r6 = r6 & r9
            r6 = r6 | r15
            byte r6 = (byte) r6
            r0.put(r5, r6)
            int r5 = r4 + 3
            r6 = r7 & 63
            r6 = r6 | r15
            byte r6 = (byte) r6
            r0.put(r5, r6)
            r6 = 4
        L_0x00d6:
            int r4 = r4 + r6
            goto L_0x000a
        L_0x00d9:
            j(r7)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x00e2:
            j(r7)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x00eb:
            int r3 = r3 - r20
            short r0 = (short) r3
            short r0 = XH.C16804K.b(r0)
            int r4 = r4 - r23
            short r1 = (short) r4
            short r1 = XH.C16804K.b(r1)
            int r0 = SH.C16418c.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: SH.f.d(java.nio.ByteBuffer, java.lang.CharSequence, int, int, int, int, int, int):int");
    }

    public static final int e(int i10) {
        return (i10 >>> 10) + 55232;
    }

    public static final boolean f(int i10) {
        return (i10 >>> 16) == 0;
    }

    public static final boolean g(int i10) {
        return i10 <= 1114111;
    }

    public static final int h(int i10) {
        return (i10 & 1023) + 56320;
    }

    public static final Void i(int i10) {
        throw new C16419d("Expected " + i10 + " more character bytes");
    }

    public static final Void j(int i10) {
        throw new IllegalArgumentException("Malformed code-point " + i10 + " found");
    }
}
