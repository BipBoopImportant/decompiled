package QH;

import PH.C16189c;
import RH.C16368a;
import RH.n;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\u001a7\u0010\r\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\u000f*\u00060\u0000j\u0002`\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0018\u001a\u00020\u0004*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\n\u0010\f\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001c\u001a\u00020\u001b*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001e\u001a\u00020\u001b*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a'\u0010\u001f\u001a\u00020\u001b*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\"\u001c\u0010'\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&\"\u0014\u0010*\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)\"\u0019\u0010/\u001a\u00020\u001b*\u00060+j\u0002`,8F¢\u0006\u0006\u001a\u0004\b-\u0010.*\n\u00100\"\u00020+2\u00020+*\n\u00101\"\u00020\u00122\u00020\u0012*\n\u00102\"\u00020\u00002\u00020\u0000*\n\u00104\"\u0002032\u000203¨\u00065"}, d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "", "g", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)[B", "h", "LRH/a;", "dst", "f", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;IILRH/a;)I", "", "e", "(Ljava/nio/charset/CharsetEncoder;LRH/a;)Z", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "LRH/n;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "max", "a", "(Ljava/nio/charset/CharsetDecoder;LRH/n;Ljava/lang/Appendable;I)I", "inputLength", "", "b", "(Ljava/nio/charset/CharsetDecoder;LRH/n;I)Ljava/lang/String;", "c", "d", "Ljava/nio/charset/CoderResult;", "LXH/N;", "j", "(Ljava/nio/charset/CoderResult;)V", "Ljava/nio/CharBuffer;", "kotlin.jvm.PlatformType", "Ljava/nio/CharBuffer;", "EmptyCharBuffer", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "EmptyByteBuffer", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "i", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "name", "Charset", "CharsetDecoder", "CharsetEncoder", "LHJ/d;", "Charsets", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: QH.a  reason: case insensitive filesystem */
public final class C16246a {

    /* renamed from: a  reason: collision with root package name */
    private static final CharBuffer f137399a = CharBuffer.allocate(0);

    /* renamed from: b  reason: collision with root package name */
    private static final ByteBuffer f137400b;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        C17542s.g(allocate);
        f137400b = allocate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int a(java.nio.charset.CharsetDecoder r11, RH.n r12, java.lang.Appendable r13, int r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "input"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "dst"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            java.nio.CharBuffer r1 = java.nio.CharBuffer.allocate(r0)
            r2 = 1
            SH.a r3 = SH.g.b(r12, r2)
            r4 = 0
            if (r3 != 0) goto L_0x001f
            goto L_0x00dc
        L_0x001f:
            r5 = r2
            r7 = r5
            r6 = r4
        L_0x0022:
            int r8 = r3.k()     // Catch:{ all -> 0x009a }
            int r9 = r3.i()     // Catch:{ all -> 0x009a }
            int r8 = r8 - r9
            if (r8 < r5) goto L_0x00ac
            int r5 = r14 - r6
            if (r5 != 0) goto L_0x0033
            r5 = r4
            goto L_0x0090
        L_0x0033:
            java.nio.ByteBuffer r8 = r3.h()     // Catch:{ all -> 0x004d }
            int r9 = r3.i()     // Catch:{ all -> 0x004d }
            int r10 = r3.k()     // Catch:{ all -> 0x004d }
            int r10 = r10 - r9
            java.nio.ByteBuffer r8 = PH.C16189c.d(r8, r9, r10)     // Catch:{ all -> 0x004d }
            r1.clear()     // Catch:{ all -> 0x004d }
            if (r5 >= r0) goto L_0x004f
            r1.limit(r5)     // Catch:{ all -> 0x004d }
            goto L_0x004f
        L_0x004d:
            r11 = move-exception
            goto L_0x00a5
        L_0x004f:
            java.nio.charset.CoderResult r5 = r11.decode(r8, r1, r4)     // Catch:{ all -> 0x004d }
            r1.flip()     // Catch:{ all -> 0x004d }
            int r9 = r1.remaining()     // Catch:{ all -> 0x004d }
            int r6 = r6 + r9
            r13.append(r1)     // Catch:{ all -> 0x004d }
            boolean r9 = r5.isMalformed()     // Catch:{ all -> 0x004d }
            if (r9 != 0) goto L_0x006a
            boolean r9 = r5.isUnmappable()     // Catch:{ all -> 0x004d }
            if (r9 == 0) goto L_0x0072
        L_0x006a:
            java.lang.String r9 = "rc"
            kotlin.jvm.internal.C17542s.i(r5, r9)     // Catch:{ all -> 0x004d }
            j(r5)     // Catch:{ all -> 0x004d }
        L_0x0072:
            boolean r5 = r5.isUnderflow()     // Catch:{ all -> 0x004d }
            if (r5 == 0) goto L_0x0081
            boolean r5 = r8.hasRemaining()     // Catch:{ all -> 0x004d }
            if (r5 == 0) goto L_0x0081
            int r7 = r7 + 1
            goto L_0x0082
        L_0x0081:
            r7 = r2
        L_0x0082:
            int r5 = r8.limit()     // Catch:{ all -> 0x004d }
            if (r5 != r10) goto L_0x009d
            int r5 = r8.position()     // Catch:{ all -> 0x004d }
            r3.c(r5)     // Catch:{ all -> 0x004d }
            r5 = r7
        L_0x0090:
            int r8 = r3.k()     // Catch:{ all -> 0x009a }
            int r9 = r3.i()     // Catch:{ all -> 0x009a }
            int r8 = r8 - r9
            goto L_0x00ac
        L_0x009a:
            r11 = move-exception
            goto L_0x0117
        L_0x009d:
            java.lang.String r11 = "Buffer's limit change is not allowed"
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004d }
            r13.<init>(r11)     // Catch:{ all -> 0x004d }
            throw r13     // Catch:{ all -> 0x004d }
        L_0x00a5:
            r3.k()     // Catch:{ all -> 0x009a }
            r3.i()     // Catch:{ all -> 0x009a }
            throw r11     // Catch:{ all -> 0x009a }
        L_0x00ac:
            if (r8 != 0) goto L_0x00b6
            SH.a r8 = SH.g.c(r12, r3)     // Catch:{ all -> 0x00b3 }
            goto L_0x00cf
        L_0x00b3:
            r11 = move-exception
            r2 = r4
            goto L_0x0117
        L_0x00b6:
            if (r8 < r5) goto L_0x00c8
            int r8 = r3.f()     // Catch:{ all -> 0x00b3 }
            int r9 = r3.g()     // Catch:{ all -> 0x00b3 }
            int r8 = r8 - r9
            r9 = 8
            if (r8 >= r9) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r8 = r3
            goto L_0x00cf
        L_0x00c8:
            SH.g.a(r12, r3)     // Catch:{ all -> 0x00b3 }
            SH.a r8 = SH.g.b(r12, r5)     // Catch:{ all -> 0x00b3 }
        L_0x00cf:
            if (r8 != 0) goto L_0x00d2
            goto L_0x00d6
        L_0x00d2:
            if (r5 > 0) goto L_0x0114
            r4 = r2
            r3 = r8
        L_0x00d6:
            if (r4 == 0) goto L_0x00db
            SH.g.a(r12, r3)
        L_0x00db:
            r4 = r6
        L_0x00dc:
            r1.clear()
            int r12 = r14 - r4
            if (r12 == 0) goto L_0x0113
            if (r12 >= r0) goto L_0x00e8
            r1.limit(r12)
        L_0x00e8:
            java.nio.ByteBuffer r12 = f137400b
            java.nio.charset.CoderResult r12 = r11.decode(r12, r1, r2)
            r1.flip()
            int r3 = r1.remaining()
            int r4 = r4 + r3
            r13.append(r1)
            boolean r3 = r12.isUnmappable()
            if (r3 != 0) goto L_0x0105
            boolean r3 = r12.isMalformed()
            if (r3 == 0) goto L_0x010d
        L_0x0105:
            java.lang.String r3 = "cr"
            kotlin.jvm.internal.C17542s.i(r12, r3)
            j(r12)
        L_0x010d:
            boolean r12 = r12.isOverflow()
            if (r12 != 0) goto L_0x00dc
        L_0x0113:
            return r4
        L_0x0114:
            r3 = r8
            goto L_0x0022
        L_0x0117:
            if (r2 == 0) goto L_0x011c
            SH.g.a(r12, r3)
        L_0x011c:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: QH.C16246a.a(java.nio.charset.CharsetDecoder, RH.n, java.lang.Appendable, int):int");
    }

    public static final String b(CharsetDecoder charsetDecoder, n nVar, int i10) {
        C17542s.j(charsetDecoder, "<this>");
        C17542s.j(nVar, "input");
        if (i10 == 0) {
            return "";
        }
        if (nVar.U() - nVar.f0() < i10) {
            return d(charsetDecoder, nVar, i10);
        }
        if (!nVar.e0().hasArray()) {
            return c(charsetDecoder, nVar, i10);
        }
        ByteBuffer e02 = nVar.e0();
        byte[] array = e02.array();
        C17542s.i(array, "bb.array()");
        Charset charset = charsetDecoder.charset();
        C17542s.i(charset, "charset()");
        String str = new String(array, e02.arrayOffset() + e02.position() + nVar.N().i(), i10, charset);
        nVar.q(i10);
        return str;
    }

    private static final String c(CharsetDecoder charsetDecoder, n nVar, int i10) {
        CharBuffer allocate = CharBuffer.allocate(i10);
        ByteBuffer d10 = C16189c.d(nVar.e0(), nVar.N().i(), i10);
        CoderResult decode = charsetDecoder.decode(d10, allocate, true);
        if (decode.isMalformed() || decode.isUnmappable()) {
            C17542s.i(decode, "rc");
            j(decode);
        }
        allocate.flip();
        nVar.q(d10.position());
        String charBuffer = allocate.toString();
        C17542s.i(charBuffer, "cb.toString()");
        return charBuffer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String d(java.nio.charset.CharsetDecoder r17, RH.n r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.nio.CharBuffer r3 = java.nio.CharBuffer.allocate(r19)
            r4 = 1
            SH.a r5 = SH.g.b(r1, r4)
            java.lang.String r6 = "rc"
            r7 = 0
            if (r5 != 0) goto L_0x0017
            r9 = r2
            goto L_0x00e7
        L_0x0017:
            r9 = r2
            r8 = r4
            r11 = r8
            r10 = r7
        L_0x001b:
            int r12 = r5.k()     // Catch:{ all -> 0x00ac }
            int r13 = r5.i()     // Catch:{ all -> 0x00ac }
            int r12 = r12 - r13
            if (r12 < r8) goto L_0x00b6
            boolean r8 = r3.hasRemaining()     // Catch:{ all -> 0x0058 }
            if (r8 == 0) goto L_0x00a1
            if (r9 != 0) goto L_0x0030
            goto L_0x00a1
        L_0x0030:
            java.nio.ByteBuffer r8 = r5.h()     // Catch:{ all -> 0x0058 }
            int r10 = r5.i()     // Catch:{ all -> 0x0058 }
            int r12 = r5.k()     // Catch:{ all -> 0x0058 }
            int r12 = r12 - r10
            java.nio.ByteBuffer r8 = PH.C16189c.d(r8, r10, r12)     // Catch:{ all -> 0x0058 }
            int r10 = r8.limit()     // Catch:{ all -> 0x0058 }
            int r13 = r8.position()     // Catch:{ all -> 0x0058 }
            int r14 = r10 - r13
            if (r14 < r9) goto L_0x004f
            r14 = r4
            goto L_0x0050
        L_0x004f:
            r14 = r7
        L_0x0050:
            if (r14 == 0) goto L_0x005a
            int r15 = r13 + r9
            r8.limit(r15)     // Catch:{ all -> 0x0058 }
            goto L_0x005a
        L_0x0058:
            r0 = move-exception
            goto L_0x00af
        L_0x005a:
            java.nio.charset.CoderResult r15 = r0.decode(r8, r3, r14)     // Catch:{ all -> 0x0058 }
            boolean r16 = r15.isMalformed()     // Catch:{ all -> 0x0058 }
            if (r16 != 0) goto L_0x006a
            boolean r16 = r15.isUnmappable()     // Catch:{ all -> 0x0058 }
            if (r16 == 0) goto L_0x0070
        L_0x006a:
            kotlin.jvm.internal.C17542s.i(r15, r6)     // Catch:{ all -> 0x0058 }
            j(r15)     // Catch:{ all -> 0x0058 }
        L_0x0070:
            boolean r15 = r15.isUnderflow()     // Catch:{ all -> 0x0058 }
            if (r15 == 0) goto L_0x007f
            boolean r15 = r8.hasRemaining()     // Catch:{ all -> 0x0058 }
            if (r15 == 0) goto L_0x007f
            int r11 = r11 + 1
            goto L_0x0080
        L_0x007f:
            r11 = r4
        L_0x0080:
            r8.limit(r10)     // Catch:{ all -> 0x0058 }
            int r10 = r8.position()     // Catch:{ all -> 0x0058 }
            int r10 = r10 - r13
            int r9 = r9 - r10
            int r10 = r8.limit()     // Catch:{ all -> 0x0058 }
            if (r10 != r12) goto L_0x0099
            int r8 = r8.position()     // Catch:{ all -> 0x0058 }
            r5.c(r8)     // Catch:{ all -> 0x0058 }
            r8 = r11
            r10 = r14
            goto L_0x00a2
        L_0x0099:
            java.lang.String r0 = "Buffer's limit change is not allowed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0058 }
            r2.<init>(r0)     // Catch:{ all -> 0x0058 }
            throw r2     // Catch:{ all -> 0x0058 }
        L_0x00a1:
            r8 = r7
        L_0x00a2:
            int r12 = r5.k()     // Catch:{ all -> 0x00ac }
            int r13 = r5.i()     // Catch:{ all -> 0x00ac }
            int r12 = r12 - r13
            goto L_0x00b6
        L_0x00ac:
            r0 = move-exception
            goto L_0x0144
        L_0x00af:
            r5.k()     // Catch:{ all -> 0x00ac }
            r5.i()     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00b6:
            if (r12 != 0) goto L_0x00c1
            SH.a r12 = SH.g.c(r1, r5)     // Catch:{ all -> 0x00bd }
            goto L_0x00da
        L_0x00bd:
            r0 = move-exception
            r4 = r7
            goto L_0x0144
        L_0x00c1:
            if (r12 < r8) goto L_0x00d3
            int r12 = r5.f()     // Catch:{ all -> 0x00bd }
            int r13 = r5.g()     // Catch:{ all -> 0x00bd }
            int r12 = r12 - r13
            r13 = 8
            if (r12 >= r13) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r12 = r5
            goto L_0x00da
        L_0x00d3:
            SH.g.a(r1, r5)     // Catch:{ all -> 0x00bd }
            SH.a r12 = SH.g.b(r1, r8)     // Catch:{ all -> 0x00bd }
        L_0x00da:
            if (r12 != 0) goto L_0x00dd
            goto L_0x00e1
        L_0x00dd:
            if (r8 > 0) goto L_0x0141
            r7 = r4
            r5 = r12
        L_0x00e1:
            if (r7 == 0) goto L_0x00e6
            SH.g.a(r1, r5)
        L_0x00e6:
            r7 = r10
        L_0x00e7:
            boolean r1 = r3.hasRemaining()
            if (r1 == 0) goto L_0x0107
            if (r7 != 0) goto L_0x0107
            java.nio.ByteBuffer r1 = f137400b
            java.nio.charset.CoderResult r0 = r0.decode(r1, r3, r4)
            boolean r1 = r0.isMalformed()
            if (r1 != 0) goto L_0x0101
            boolean r1 = r0.isUnmappable()
            if (r1 == 0) goto L_0x0107
        L_0x0101:
            kotlin.jvm.internal.C17542s.i(r0, r6)
            j(r0)
        L_0x0107:
            if (r9 > 0) goto L_0x0120
            if (r9 < 0) goto L_0x0118
            r3.flip()
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "cb.toString()"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            return r0
        L_0x0118:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "remainingInputBytes < 0"
            r0.<init>(r1)
            throw r0
        L_0x0120:
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Not enough bytes available: had only "
            r1.append(r3)
            int r3 = r2 - r9
            r1.append(r3)
            java.lang.String r3 = " instead of "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0141:
            r5 = r12
            goto L_0x001b
        L_0x0144:
            if (r4 == 0) goto L_0x0149
            SH.g.a(r1, r5)
        L_0x0149:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QH.C16246a.d(java.nio.charset.CharsetDecoder, RH.n, int):java.lang.String");
    }

    public static final boolean e(CharsetEncoder charsetEncoder, C16368a aVar) {
        C17542s.j(charsetEncoder, "<this>");
        C17542s.j(aVar, "dst");
        ByteBuffer h10 = aVar.h();
        int k10 = aVar.k();
        int g10 = aVar.g() - k10;
        ByteBuffer d10 = C16189c.d(h10, k10, g10);
        CoderResult encode = charsetEncoder.encode(f137399a, d10, true);
        if (encode.isMalformed() || encode.isUnmappable()) {
            C17542s.i(encode, "result");
            j(encode);
        }
        boolean isUnderflow = encode.isUnderflow();
        if (d10.limit() == g10) {
            aVar.a(d10.position());
            return isUnderflow;
        }
        throw new IllegalStateException("Buffer's limit change is not allowed");
    }

    public static final int f(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, C16368a aVar) {
        C17542s.j(charsetEncoder, "<this>");
        C17542s.j(charSequence, "input");
        C17542s.j(aVar, "dst");
        CharBuffer wrap = CharBuffer.wrap(charSequence, i10, i11);
        int remaining = wrap.remaining();
        ByteBuffer h10 = aVar.h();
        int k10 = aVar.k();
        int g10 = aVar.g() - k10;
        ByteBuffer d10 = C16189c.d(h10, k10, g10);
        CoderResult encode = charsetEncoder.encode(wrap, d10, false);
        if (encode.isMalformed() || encode.isUnmappable()) {
            C17542s.i(encode, "result");
            j(encode);
        }
        if (d10.limit() == g10) {
            aVar.a(d10.position());
            return remaining - wrap.remaining();
        }
        throw new IllegalStateException("Buffer's limit change is not allowed");
    }

    public static final byte[] g(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) {
        C17542s.j(charsetEncoder, "<this>");
        C17542s.j(charSequence, "input");
        if (!(charSequence instanceof String)) {
            return h(charsetEncoder, charSequence, i10, i11);
        }
        if (i10 == 0 && i11 == charSequence.length()) {
            byte[] bytes = ((String) charSequence).getBytes(charsetEncoder.charset());
            C17542s.i(bytes, "input as java.lang.String).getBytes(charset())");
            return bytes;
        }
        String substring = ((String) charSequence).substring(i10, i11);
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        C17542s.h(substring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
        C17542s.i(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
        return bytes2;
    }

    private static final byte[] h(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) {
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i10, i11));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[encode.remaining()];
        encode.get(bArr2);
        return bArr2;
    }

    public static final String i(Charset charset) {
        C17542s.j(charset, "<this>");
        String name = charset.name();
        C17542s.i(name, "name()");
        return name;
    }

    private static final void j(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new C16248c(message);
        }
    }
}
