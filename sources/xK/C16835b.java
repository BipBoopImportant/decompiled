package XK;

import WK.C16770e;
import WK.C16773h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0006\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0010\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LWK/h;", "LWK/e;", "buffer", "", "offset", "byteCount", "LXH/N;", "d", "(LWK/h;LWK/e;II)V", "", "c", "e", "(C)I", "", "s", "codePointCount", "([BI)I", "", "a", "[C", "f", "()[C", "HEX_DIGIT_CHARS", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: XK.b  reason: case insensitive filesystem */
public final class C16835b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f140283a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int c(byte[] r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            r3 = 1
            int r4 = r0.length
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x0009:
            if (r5 >= r4) goto L_0x01a9
            byte r8 = r0[r5]
            r9 = 65533(0xfffd, float:9.1831E-41)
            r10 = 160(0xa0, float:2.24E-43)
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 32
            r13 = 13
            r14 = 10
            r15 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            if (r8 < 0) goto L_0x0066
            int r17 = r7 + 1
            if (r7 != r1) goto L_0x0025
            return r6
        L_0x0025:
            if (r8 == r14) goto L_0x0033
            if (r8 == r13) goto L_0x0033
            if (r8 < 0) goto L_0x002e
            if (r8 >= r12) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            if (r11 > r8) goto L_0x0033
            if (r8 >= r10) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            if (r8 != r9) goto L_0x0036
        L_0x0035:
            return r16
        L_0x0036:
            if (r8 >= r15) goto L_0x003a
            r7 = r3
            goto L_0x003b
        L_0x003a:
            r7 = 2
        L_0x003b:
            int r6 = r6 + r7
            int r5 = r5 + r3
        L_0x003d:
            r7 = r17
            if (r5 >= r4) goto L_0x0063
            byte r8 = r0[r5]
            if (r8 < 0) goto L_0x0063
            int r5 = r5 + r3
            int r17 = r7 + 1
            if (r7 != r1) goto L_0x004b
            return r6
        L_0x004b:
            if (r8 == r14) goto L_0x0059
            if (r8 == r13) goto L_0x0059
            if (r8 < 0) goto L_0x0054
            if (r8 >= r12) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            if (r11 > r8) goto L_0x0059
            if (r8 >= r10) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            if (r8 != r9) goto L_0x005c
        L_0x005b:
            return r16
        L_0x005c:
            if (r8 >= r15) goto L_0x0060
            r7 = r3
            goto L_0x0061
        L_0x0060:
            r7 = 2
        L_0x0061:
            int r6 = r6 + r7
            goto L_0x003d
        L_0x0063:
            XH.N r8 = XH.C16807N.f139792a
            goto L_0x0009
        L_0x0066:
            int r2 = r8 >> 5
            r15 = -2
            r9 = 128(0x80, float:1.794E-43)
            if (r2 != r15) goto L_0x00b2
            int r2 = r5 + 1
            if (r4 > r2) goto L_0x0075
            if (r7 != r1) goto L_0x0074
            return r6
        L_0x0074:
            return r16
        L_0x0075:
            byte r2 = r0[r2]
            r15 = r2 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x00ae
            r2 = r2 ^ 3968(0xf80, float:5.56E-42)
            int r8 = r8 << 6
            r2 = r2 ^ r8
            if (r2 >= r9) goto L_0x0086
            if (r7 != r1) goto L_0x0085
            return r6
        L_0x0085:
            return r16
        L_0x0086:
            int r8 = r7 + 1
            if (r7 != r1) goto L_0x008b
            return r6
        L_0x008b:
            if (r2 == r14) goto L_0x0099
            if (r2 == r13) goto L_0x0099
            if (r2 < 0) goto L_0x0094
            if (r2 >= r12) goto L_0x0094
            goto L_0x009e
        L_0x0094:
            if (r11 > r2) goto L_0x0099
            if (r2 >= r10) goto L_0x0099
            goto L_0x009e
        L_0x0099:
            r7 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r7) goto L_0x009f
        L_0x009e:
            return r16
        L_0x009f:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= r7) goto L_0x00a5
            r2 = r3
            goto L_0x00a6
        L_0x00a5:
            r2 = 2
        L_0x00a6:
            int r6 = r6 + r2
            XH.N r2 = XH.C16807N.f139792a
            r2 = 2
            int r5 = r5 + r2
        L_0x00ab:
            r7 = r8
            goto L_0x0009
        L_0x00ae:
            if (r7 != r1) goto L_0x00b1
            return r6
        L_0x00b1:
            return r16
        L_0x00b2:
            r2 = 2
            int r10 = r8 >> 4
            r11 = 57344(0xe000, float:8.0356E-41)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r10 != r15) goto L_0x0121
            int r10 = r5 + 2
            if (r4 > r10) goto L_0x00c5
            if (r7 != r1) goto L_0x00c4
            return r6
        L_0x00c4:
            return r16
        L_0x00c5:
            int r2 = r5 + 1
            byte r2 = r0[r2]
            r15 = r2 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x011d
            byte r10 = r0[r10]
            r15 = r10 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x0119
            r9 = -123008(0xfffffffffffe1f80, float:NaN)
            r9 = r9 ^ r10
            int r2 = r2 << 6
            r2 = r2 ^ r9
            int r8 = r8 << 12
            r2 = r2 ^ r8
            r8 = 2048(0x800, float:2.87E-42)
            if (r2 >= r8) goto L_0x00e5
            if (r7 != r1) goto L_0x00e4
            return r6
        L_0x00e4:
            return r16
        L_0x00e5:
            if (r12 > r2) goto L_0x00ed
            if (r2 >= r11) goto L_0x00ed
            if (r7 != r1) goto L_0x00ec
            return r6
        L_0x00ec:
            return r16
        L_0x00ed:
            int r8 = r7 + 1
            if (r7 != r1) goto L_0x00f2
            return r6
        L_0x00f2:
            if (r2 == r14) goto L_0x0106
            if (r2 == r13) goto L_0x0106
            if (r2 < 0) goto L_0x00fd
            r7 = 32
            if (r2 >= r7) goto L_0x00fd
            goto L_0x010b
        L_0x00fd:
            r7 = 127(0x7f, float:1.78E-43)
            if (r7 > r2) goto L_0x0106
            r7 = 160(0xa0, float:2.24E-43)
            if (r2 >= r7) goto L_0x0106
            goto L_0x010b
        L_0x0106:
            r7 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r7) goto L_0x010c
        L_0x010b:
            return r16
        L_0x010c:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= r7) goto L_0x0112
            r2 = r3
            goto L_0x0113
        L_0x0112:
            r2 = 2
        L_0x0113:
            int r6 = r6 + r2
            XH.N r2 = XH.C16807N.f139792a
            int r5 = r5 + 3
            goto L_0x00ab
        L_0x0119:
            if (r7 != r1) goto L_0x011c
            return r6
        L_0x011c:
            return r16
        L_0x011d:
            if (r7 != r1) goto L_0x0120
            return r6
        L_0x0120:
            return r16
        L_0x0121:
            int r2 = r8 >> 3
            if (r2 != r15) goto L_0x01a5
            int r2 = r5 + 3
            if (r4 > r2) goto L_0x012d
            if (r7 != r1) goto L_0x012c
            return r6
        L_0x012c:
            return r16
        L_0x012d:
            int r10 = r5 + 1
            byte r10 = r0[r10]
            r15 = r10 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x01a1
            r15 = 2
            int r17 = r5 + 2
            byte r15 = r0[r17]
            r13 = r15 & 192(0xc0, float:2.69E-43)
            if (r13 != r9) goto L_0x019d
            byte r2 = r0[r2]
            r13 = r2 & 192(0xc0, float:2.69E-43)
            if (r13 != r9) goto L_0x0199
            r9 = 3678080(0x381f80, float:5.154088E-39)
            r2 = r2 ^ r9
            int r9 = r15 << 6
            r2 = r2 ^ r9
            int r9 = r10 << 12
            r2 = r2 ^ r9
            int r8 = r8 << 18
            r2 = r2 ^ r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r2 <= r8) goto L_0x015a
            if (r7 != r1) goto L_0x0159
            return r6
        L_0x0159:
            return r16
        L_0x015a:
            if (r12 > r2) goto L_0x0162
            if (r2 >= r11) goto L_0x0162
            if (r7 != r1) goto L_0x0161
            return r6
        L_0x0161:
            return r16
        L_0x0162:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= r8) goto L_0x016a
            if (r7 != r1) goto L_0x0169
            return r6
        L_0x0169:
            return r16
        L_0x016a:
            int r8 = r7 + 1
            if (r7 != r1) goto L_0x016f
            return r6
        L_0x016f:
            if (r2 == r14) goto L_0x0185
            r7 = 13
            if (r2 == r7) goto L_0x0185
            if (r2 < 0) goto L_0x017c
            r7 = 32
            if (r2 >= r7) goto L_0x017c
            goto L_0x018a
        L_0x017c:
            r7 = 127(0x7f, float:1.78E-43)
            if (r7 > r2) goto L_0x0185
            r7 = 160(0xa0, float:2.24E-43)
            if (r2 >= r7) goto L_0x0185
            goto L_0x018a
        L_0x0185:
            r7 = 65533(0xfffd, float:9.1831E-41)
            if (r2 != r7) goto L_0x018b
        L_0x018a:
            return r16
        L_0x018b:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= r7) goto L_0x0191
            r2 = r3
            goto L_0x0192
        L_0x0191:
            r2 = 2
        L_0x0192:
            int r6 = r6 + r2
            XH.N r2 = XH.C16807N.f139792a
            int r5 = r5 + 4
            goto L_0x00ab
        L_0x0199:
            if (r7 != r1) goto L_0x019c
            return r6
        L_0x019c:
            return r16
        L_0x019d:
            if (r7 != r1) goto L_0x01a0
            return r6
        L_0x01a0:
            return r16
        L_0x01a1:
            if (r7 != r1) goto L_0x01a4
            return r6
        L_0x01a4:
            return r16
        L_0x01a5:
            if (r7 != r1) goto L_0x01a8
            return r6
        L_0x01a8:
            return r16
        L_0x01a9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: XK.C16835b.c(byte[], int):int");
    }

    public static final void d(C16773h hVar, C16770e eVar, int i10, int i11) {
        C17542s.j(hVar, "<this>");
        C17542s.j(eVar, "buffer");
        eVar.L(hVar.C(), i10, i11);
    }

    /* access modifiers changed from: private */
    public static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final char[] f() {
        return f140283a;
    }
}
