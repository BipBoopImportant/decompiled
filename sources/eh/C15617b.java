package EH;

import HJ.C15835a;
import HJ.C15838d;
import HJ.C15854t;
import QH.C16247b;
import XH.C16807N;
import YH.C16877v;
import YH.g0;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import tI.C17967c;

@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\u001a3\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\n\u001a=\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0015\u001a?\u0010\u001b\u001a\u00020\u0000*\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u0000*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&\u001a'\u0010+\u001a\u00020)*\u00020'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\b+\u0010,\"\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020 0-8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020 0-8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u0010/\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u001d058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020 0-8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010/\" \u0010<\u001a\b\u0012\u0004\u0012\u00020 0-8\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b:\u0010;\"\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u00107¨\u0006>"}, d2 = {"", "", "encodeFull", "spaceToPlus", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "q", "(Ljava/lang/String;ZZLjava/nio/charset/Charset;)Ljava/lang/String;", "p", "(Ljava/lang/String;)Ljava/lang/String;", "encodeSlash", "o", "(Ljava/lang/String;Z)Ljava/lang/String;", "l", "n", "", "start", "end", "plusIsSpace", "j", "(Ljava/lang/String;IIZLjava/nio/charset/Charset;)Ljava/lang/String;", "h", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Ljava/lang/String;", "g", "", "prefixEnd", "f", "(Ljava/lang/CharSequence;IIIZLjava/nio/charset/Charset;)Ljava/lang/String;", "", "u", "(B)Ljava/lang/String;", "", "c2", "e", "(C)I", "digit", "t", "(I)C", "LRH/k;", "Lkotlin/Function1;", "LXH/N;", "block", "s", "(LRH/k;LnI/l;)V", "", "a", "Ljava/util/Set;", "URL_ALPHABET", "b", "URL_ALPHABET_CHARS", "c", "HEX_ALPHABET", "", "d", "Ljava/util/List;", "URL_PROTOCOL_PART", "VALID_PATH_PART", "getATTRIBUTE_CHARACTERS", "()Ljava/util/Set;", "ATTRIBUTE_CHARACTERS", "SPECIAL_SYMBOLS", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.b  reason: case insensitive filesystem */
public final class C15617b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Byte> f133973a;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<Character> f133974b = C16877v.y1(C16877v.V0(C16877v.T0(new C17967c('a', 'z'), new C17967c('A', 'Z')), new C17967c('0', '9')));

    /* renamed from: c  reason: collision with root package name */
    private static final Set<Character> f133975c = C16877v.y1(C16877v.V0(C16877v.T0(new C17967c('a', 'f'), new C17967c('A', 'F')), new C17967c('0', '9')));
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final List<Byte> f133976d;

    /* renamed from: e  reason: collision with root package name */
    private static final Set<Character> f133977e = g0.h(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~');

    /* renamed from: f  reason: collision with root package name */
    private static final Set<Character> f133978f = g0.k(f133974b, g0.h('!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'));
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final List<Byte> f133979g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(B)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.b$a */
    static final class a extends C17544u implements C17642l<Byte, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ StringBuilder f133980c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f133981d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StringBuilder sb2, boolean z10) {
            super(1);
            this.f133980c = sb2;
            this.f133981d = z10;
        }

        public final void a(byte b10) {
            if (C15617b.f133973a.contains(Byte.valueOf(b10)) || C15617b.f133979g.contains(Byte.valueOf(b10))) {
                this.f133980c.append((char) b10);
            } else if (!this.f133981d || b10 != 32) {
                this.f133980c.append(C15617b.u(b10));
            } else {
                this.f133980c.append('+');
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).byteValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(B)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.b$b  reason: collision with other inner class name */
    static final class C3302b extends C17544u implements C17642l<Byte, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ StringBuilder f133982c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3302b(StringBuilder sb2) {
            super(1);
            this.f133982c = sb2;
        }

        public final void a(byte b10) {
            this.f133982c.append(C15617b.u(b10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).byteValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(B)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.b$c */
    static final class c extends C17544u implements C17642l<Byte, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f133983c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ StringBuilder f133984d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f133985e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, StringBuilder sb2, boolean z11) {
            super(1);
            this.f133983c = z10;
            this.f133984d = sb2;
            this.f133985e = z11;
        }

        public final void a(byte b10) {
            if (b10 == 32) {
                if (this.f133983c) {
                    this.f133984d.append('+');
                } else {
                    this.f133984d.append("%20");
                }
            } else if (C15617b.f133973a.contains(Byte.valueOf(b10)) || (!this.f133985e && C15617b.f133976d.contains(Byte.valueOf(b10)))) {
                this.f133984d.append((char) b10);
            } else {
                this.f133984d.append(C15617b.u(b10));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).byteValue());
            return C16807N.f139792a;
        }
    }

    static {
        Iterable<Character> V02 = C16877v.V0(C16877v.T0(new C17967c('a', 'z'), new C17967c('A', 'Z')), new C17967c('0', '9'));
        ArrayList arrayList = new ArrayList(C16877v.y(V02, 10));
        for (Character charValue : V02) {
            arrayList.add(Byte.valueOf((byte) charValue.charValue()));
        }
        f133973a = C16877v.y1(arrayList);
        Iterable<Character> h10 = g0.h(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(C16877v.y(h10, 10));
        for (Character charValue2 : h10) {
            arrayList2.add(Byte.valueOf((byte) charValue2.charValue()));
        }
        f133976d = arrayList2;
        Iterable<Character> q10 = C16877v.q('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(C16877v.y(q10, 10));
        for (Character charValue3 : q10) {
            arrayList3.add(Byte.valueOf((byte) charValue3.charValue()));
        }
        f133979g = arrayList3;
    }

    private static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    private static final String f(CharSequence charSequence, int i10, int i11, int i12, boolean z10, Charset charset) {
        int i13 = i11 - i10;
        if (i13 > 255) {
            i13 /= 3;
        }
        StringBuilder sb2 = new StringBuilder(i13);
        if (i12 > i10) {
            sb2.append(charSequence, i10, i12);
        }
        byte[] bArr = null;
        while (i12 < i11) {
            char charAt = charSequence.charAt(i12);
            if (z10 && charAt == '+') {
                sb2.append(' ');
            } else if (charAt == '%') {
                if (bArr == null) {
                    bArr = new byte[((i11 - i12) / 3)];
                }
                int i14 = 0;
                while (i12 < i11 && charSequence.charAt(i12) == '%') {
                    int i15 = i12 + 2;
                    if (i15 < i11) {
                        int i16 = i12 + 1;
                        int e10 = e(charSequence.charAt(i16));
                        int e11 = e(charSequence.charAt(i15));
                        if (e10 == -1 || e11 == -1) {
                            throw new C15605J("Wrong HEX escape: %" + charSequence.charAt(i16) + charSequence.charAt(i15) + ", in " + charSequence + ", at " + i12);
                        }
                        bArr[i14] = (byte) ((e10 * 16) + e11);
                        i12 += 3;
                        i14++;
                    } else {
                        throw new C15605J("Incomplete trailing HEX escape: " + charSequence.subSequence(i12, charSequence.length()).toString() + ", in " + charSequence + " at " + i12);
                    }
                }
                sb2.append(new String(bArr, 0, i14, charset));
            } else {
                sb2.append(charAt);
            }
            i12++;
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "sb.toString()");
        return sb3;
    }

    private static final String g(String str, int i10, int i11, boolean z10, Charset charset) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (z10 && charAt == '+')) {
                return f(str, i10, i11, i12, z10, charset);
            }
        }
        if (i10 == 0 && i11 == str.length()) {
            return str.toString();
        }
        String substring = str.substring(i10, i11);
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String h(String str, int i10, int i11, Charset charset) {
        C17542s.j(str, "<this>");
        C17542s.j(charset, "charset");
        return g(str, i10, i11, false, charset);
    }

    public static /* synthetic */ String i(String str, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            charset = C15838d.f135279b;
        }
        return h(str, i10, i11, charset);
    }

    public static final String j(String str, int i10, int i11, boolean z10, Charset charset) {
        C17542s.j(str, "<this>");
        C17542s.j(charset, "charset");
        return g(str, i10, i11, z10, charset);
    }

    public static /* synthetic */ String k(String str, int i10, int i11, boolean z10, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            charset = C15838d.f135279b;
        }
        return j(str, i10, i11, z10, charset);
    }

    public static final String l(String str, boolean z10) {
        C17542s.j(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = C15838d.f135279b.newEncoder();
        C17542s.i(newEncoder, "UTF_8.newEncoder()");
        s(C16247b.d(newEncoder, str, 0, 0, 6, (Object) null), new a(sb2, z10));
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String m(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return l(str, z10);
    }

    public static final String n(String str) {
        C17542s.j(str, "<this>");
        return l(str, true);
    }

    public static final String o(String str, boolean z10) {
        int i10;
        C17542s.j(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        Charset charset = C15838d.f135279b;
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if ((z10 || charAt != '/') && !f133974b.contains(Character.valueOf(charAt)) && !f133977e.contains(Character.valueOf(charAt))) {
                if (charAt == '%' && (i10 = i11 + 2) < str.length()) {
                    Set<Character> set = f133975c;
                    int i12 = i11 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i12))) && set.contains(Character.valueOf(str.charAt(i10)))) {
                        sb2.append(charAt);
                        sb2.append(str.charAt(i12));
                        sb2.append(str.charAt(i10));
                        i11 += 3;
                    }
                }
                int i13 = C15835a.g(charAt) ? 2 : 1;
                CharsetEncoder newEncoder = charset.newEncoder();
                C17542s.i(newEncoder, "charset.newEncoder()");
                int i14 = i13 + i11;
                s(C16247b.c(newEncoder, str, i11, i14), new C3302b(sb2));
                i11 = i14;
            } else {
                sb2.append(charAt);
                i11++;
            }
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String p(String str) {
        C17542s.j(str, "<this>");
        return o(str, true);
    }

    public static final String q(String str, boolean z10, boolean z11, Charset charset) {
        C17542s.j(str, "<this>");
        C17542s.j(charset, "charset");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        C17542s.i(newEncoder, "charset.newEncoder()");
        s(C16247b.d(newEncoder, str, 0, 0, 6, (Object) null), new c(z11, sb2, z10));
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String r(String str, boolean z10, boolean z11, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            charset = C15838d.f135279b;
        }
        return q(str, z10, z11, charset);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void s(RH.k r4, nI.C17642l<? super java.lang.Byte, XH.C16807N> r5) {
        /*
            r0 = 1
            SH.a r1 = SH.g.b(r4, r0)
            if (r1 != 0) goto L_0x0008
            goto L_0x0026
        L_0x0008:
            int r2 = r1.k()     // Catch:{ all -> 0x001e }
            int r3 = r1.i()     // Catch:{ all -> 0x001e }
            if (r2 <= r3) goto L_0x0020
            byte r2 = r1.l()     // Catch:{ all -> 0x001e }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)     // Catch:{ all -> 0x001e }
            r5.invoke(r2)     // Catch:{ all -> 0x001e }
            goto L_0x0008
        L_0x001e:
            r5 = move-exception
            goto L_0x0029
        L_0x0020:
            SH.a r1 = SH.g.c(r4, r1)     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x0008
        L_0x0026:
            return
        L_0x0027:
            r5 = move-exception
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            SH.g.a(r4, r1)
        L_0x002e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: EH.C15617b.s(RH.k, nI.l):void");
    }

    private static final char t(int i10) {
        return (char) ((i10 < 0 || i10 >= 10) ? ((char) (i10 + 65)) - 10 : i10 + 48);
    }

    /* access modifiers changed from: private */
    public static final String u(byte b10) {
        return C15854t.x(new char[]{'%', t((b10 & 255) >> 4), t(b10 & 15)});
    }
}
