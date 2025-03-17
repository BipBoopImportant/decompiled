package lK;

import HJ.C15854t;
import XH.C16820k;
import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b+\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010\u0003J\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H&¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u000fH&¢\u0006\u0004\b&\u0010\u0011J\u000f\u0010(\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u000f¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020+H\u0004¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u001f¢\u0006\u0004\b.\u0010\u0003J\u0015\u00100\u001a\u00020'2\u0006\u0010/\u001a\u00020'¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020+H&¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020+H\u0004¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020'H\u0016¢\u0006\u0004\b5\u0010)J\u0017\u00107\u001a\u00020\u000f2\b\b\u0002\u00106\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0004H&¢\u0006\u0004\b9\u0010:J!\u0010=\u001a\u0004\u0018\u00010\n2\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u000fH&¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u0004\u0018\u00010\n2\u0006\u0010<\u001a\u00020\u000f¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u001f¢\u0006\u0004\bA\u0010\u0003J\u001f\u0010C\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010\fJ\u000f\u0010D\u001a\u00020\nH&¢\u0006\u0004\bD\u0010\u000eJ\r\u0010E\u001a\u00020\n¢\u0006\u0004\bE\u0010\u000eJ'\u0010F\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0005¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\n¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\n¢\u0006\u0004\bI\u0010\u000eJ\u001f\u0010L\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0014¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u000f¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010\u000eJ\u0015\u0010S\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\n¢\u0006\u0004\bS\u0010TJ)\u0010X\u001a\u00020W2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010V\u001a\u00020\n¢\u0006\u0004\bX\u0010YJ\r\u0010[\u001a\u00020Z¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020Z¢\u0006\u0004\b]\u0010\\J\r\u0010^\u001a\u00020\u000f¢\u0006\u0004\b^\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b_\u0010?R\u0014\u0010b\u001a\u00020`8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010cR&\u0010l\u001a\u00060ej\u0002`f8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010\u0016\u001a\u00020\u00158$X¤\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006o"}, d2 = {"LlK/a;", "", "<init>", "()V", "", "lastPosition", "current", "c", "(II)I", "currentPosition", "", "u", "(II)Ljava/lang/String;", "N", "()Ljava/lang/String;", "", "S", "()Z", "startPosition", "b", "(I)I", "", "source", "startPos", "d", "(Ljava/lang/CharSequence;I)I", "B", "start", "g", "(I)Z", "literalSuffix", "LXH/N;", "i", "(Ljava/lang/String;I)V", "w", "E", "position", "J", "f", "", "k", "()B", "O", "", "F", "(C)Z", "x", "expected", "l", "(B)B", "m", "(C)V", "R", "H", "doConsume", "P", "(Z)Z", "L", "()I", "keyToMatch", "isLenient", "G", "(Ljava/lang/String;Z)Ljava/lang/String;", "I", "(Z)Ljava/lang/String;", "v", "endPos", "M", "j", "q", "r", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "t", "s", "fromIndex", "toIndex", "e", "(II)V", "allowLenientStrings", "K", "(Z)V", "toString", "key", "A", "(Ljava/lang/String;)V", "message", "hint", "", "y", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Void;", "", "n", "()J", "p", "h", "a", "LlK/I;", "LlK/I;", "path", "Ljava/lang/String;", "peekedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "C", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "escapedString", "D", "()Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.a  reason: case insensitive filesystem */
public abstract class C17570a {

    /* renamed from: a  reason: collision with root package name */
    public int f144471a;

    /* renamed from: b  reason: collision with root package name */
    public final C17568I f144472b = new C17568I();

    /* renamed from: c  reason: collision with root package name */
    private String f144473c;

    /* renamed from: d  reason: collision with root package name */
    private StringBuilder f144474d = new StringBuilder();

    private final int B(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        z(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    private final String N() {
        String str = this.f144473c;
        C17542s.g(str);
        this.f144473c = null;
        return str;
    }

    public static /* synthetic */ boolean Q(C17570a aVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return aVar.P(z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    private final boolean S() {
        return D().charAt(this.f144471a - 1) != '\"';
    }

    private final int b(int i10) {
        int J10 = J(i10);
        if (J10 != -1) {
            int i11 = J10 + 1;
            char charAt = D().charAt(J10);
            if (charAt == 'u') {
                return d(D(), i11);
            }
            char b10 = C17571b.b(charAt);
            if (b10 != 0) {
                this.f144474d.append(b10);
                return i11;
            }
            z(this, "Invalid escaped char '" + charAt + '\'', 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
        z(this, "Expected escape sequence to continue, got EOF", 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    private final int c(int i10, int i11) {
        e(i10, i11);
        return b(i11 + 1);
    }

    private final int d(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 >= charSequence.length()) {
            this.f144471a = i10;
            w();
            if (this.f144471a + 4 < charSequence.length()) {
                return d(charSequence, this.f144471a);
            }
            z(this, "Unexpected EOF during unicode escape", 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
        this.f144474d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
        return i11;
    }

    private final boolean g(int i10) {
        int J10 = J(i10);
        if (J10 >= D().length() || J10 == -1) {
            z(this, "EOF", 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
        int i11 = J10 + 1;
        char charAt = D().charAt(J10) | ' ';
        if (charAt == 'f') {
            i("alse", i11);
            return false;
        } else if (charAt == 't') {
            i("rue", i11);
            return true;
        } else {
            z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
    }

    private final void i(String str, int i10) {
        if (D().length() - i10 >= str.length()) {
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                if (str.charAt(i11) == (D().charAt(i10 + i11) | ' ')) {
                    i11++;
                } else {
                    z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, (String) null, 6, (Object) null);
                    throw new C16820k();
                }
            }
            this.f144471a = i10 + str.length();
            return;
        }
        z(this, "Unexpected end of boolean literal", 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    private static final double o(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -((double) j10));
        }
        if (z10) {
            return Math.pow(10.0d, (double) j10);
        }
        throw new t();
    }

    private final String u(int i10, int i11) {
        e(i10, i11);
        String sb2 = this.f144474d.toString();
        C17542s.i(sb2, "toString(...)");
        this.f144474d.setLength(0);
        return sb2;
    }

    public static /* synthetic */ Void z(C17570a aVar, String str, int i10, String str2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = aVar.f144471a;
            }
            if ((i11 & 4) != 0) {
                str2 = "";
            }
            return aVar.y(str, i10, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public final void A(String str) {
        C17542s.j(str, "key");
        int z02 = C15854t.z0(M(0, this.f144471a), str, 0, false, 6, (Object) null);
        throw new C17593y("Encountered an unknown key '" + str + "' at offset " + z02 + " at path: " + this.f144472b.a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + C17562C.i(D(), z02));
    }

    /* access modifiers changed from: protected */
    public final StringBuilder C() {
        return this.f144474d;
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence D();

    public final boolean E() {
        return H() != 10;
    }

    /* access modifiers changed from: protected */
    public final boolean F(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    public abstract String G(String str, boolean z10);

    public byte H() {
        CharSequence D10 = D();
        int i10 = this.f144471a;
        while (true) {
            int J10 = J(i10);
            if (J10 != -1) {
                char charAt = D10.charAt(J10);
                if (charAt == 9 || charAt == 10 || charAt == 13 || charAt == ' ') {
                    i10 = J10 + 1;
                } else {
                    this.f144471a = J10;
                    return C17571b.a(charAt);
                }
            } else {
                this.f144471a = J10;
                return 10;
            }
        }
    }

    public final String I(boolean z10) {
        String str;
        byte H10 = H();
        if (z10) {
            if (H10 != 1 && H10 != 0) {
                return null;
            }
            str = s();
        } else if (H10 != 1) {
            return null;
        } else {
            str = q();
        }
        this.f144473c = str;
        return str;
    }

    public abstract int J(int i10);

    public final void K(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte H10 = H();
        if (H10 == 8 || H10 == 6) {
            while (true) {
                byte H11 = H();
                if (H11 != 1) {
                    if (H11 == 8 || H11 == 6) {
                        arrayList.add(Byte.valueOf(H11));
                    } else if (H11 == 9) {
                        if (((Number) C16877v.I0(arrayList)).byteValue() == 8) {
                            C16877v.O(arrayList);
                        } else {
                            int i10 = this.f144471a;
                            throw C17562C.f(i10, "found ] instead of } at path: " + this.f144472b, D());
                        }
                    } else if (H11 == 7) {
                        if (((Number) C16877v.I0(arrayList)).byteValue() == 6) {
                            C16877v.O(arrayList);
                        } else {
                            int i11 = this.f144471a;
                            throw C17562C.f(i11, "found } instead of ] at path: " + this.f144472b, D());
                        }
                    } else if (H11 == 10) {
                        z(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, (String) null, 6, (Object) null);
                        throw new C16820k();
                    }
                    k();
                    if (arrayList.size() == 0) {
                        return;
                    }
                } else if (z10) {
                    s();
                } else {
                    j();
                }
            }
        } else {
            s();
        }
    }

    public abstract int L();

    public String M(int i10, int i11) {
        return D().subSequence(i10, i11).toString();
    }

    public final boolean O() {
        int L10 = L();
        CharSequence D10 = D();
        if (L10 >= D10.length() || L10 == -1 || D10.charAt(L10) != ',') {
            return false;
        }
        this.f144471a++;
        return true;
    }

    public final boolean P(boolean z10) {
        int J10 = J(L());
        int length = D().length() - J10;
        if (length < 4 || J10 == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != D().charAt(J10 + i10)) {
                return false;
            }
        }
        if (length > 4 && C17571b.a(D().charAt(J10 + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f144471a = J10 + 4;
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void R(char c10) {
        int i10 = this.f144471a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f144471a = i10 - 1;
                String s10 = s();
                this.f144471a = i10;
                if (C17542s.e(s10, "null")) {
                    y("Expected string literal but 'null' literal was found", this.f144471a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new C16820k();
                }
            } catch (Throwable th2) {
                this.f144471a = i10;
                throw th2;
            }
        }
        String c11 = C17571b.c(C17571b.a(c10));
        int i11 = this.f144471a;
        int i12 = i11 - 1;
        z(this, "Expected " + c11 + ", but had '" + ((i11 == D().length() || i12 < 0) ? "EOF" : String.valueOf(D().charAt(i12))) + "' instead", i12, (String) null, 4, (Object) null);
        throw new C16820k();
    }

    /* access modifiers changed from: protected */
    public void e(int i10, int i11) {
        this.f144474d.append(D(), i10, i11);
    }

    public abstract boolean f();

    public final boolean h() {
        boolean z10;
        int L10 = L();
        if (L10 != D().length()) {
            if (D().charAt(L10) == '\"') {
                L10++;
                z10 = true;
            } else {
                z10 = false;
            }
            boolean g10 = g(L10);
            if (z10) {
                if (this.f144471a == D().length()) {
                    z(this, "EOF", 0, (String) null, 6, (Object) null);
                    throw new C16820k();
                } else if (D().charAt(this.f144471a) == '\"') {
                    this.f144471a++;
                } else {
                    z(this, "Expected closing quotation mark", 0, (String) null, 6, (Object) null);
                    throw new C16820k();
                }
            }
            return g10;
        }
        z(this, "EOF", 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    public abstract String j();

    public abstract byte k();

    public final byte l(byte b10) {
        byte k10 = k();
        if (k10 == b10) {
            return k10;
        }
        String c10 = C17571b.c(b10);
        int i10 = this.f144471a;
        int i11 = i10 - 1;
        z(this, "Expected " + c10 + ", but had '" + ((i10 == D().length() || i11 < 0) ? "EOF" : String.valueOf(D().charAt(i11))) + "' instead", i11, (String) null, 4, (Object) null);
        throw new C16820k();
    }

    public abstract void m(char c10);

    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        if (r5 == r0) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0144, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0146, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r0 == r5) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        if (r10 == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014d, code lost:
        if (r0 == (r5 - 1)) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014f, code lost:
        if (r1 == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0151, code lost:
        if (r3 == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015d, code lost:
        if (D().charAt(r5) != '\"') goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0162, code lost:
        z(r17, "Expected closing quotation mark", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        throw new XH.C16820k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0173, code lost:
        z(r17, "EOF", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0183, code lost:
        throw new XH.C16820k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0184, code lost:
        r6.f144471a = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0186, code lost:
        if (r9 == false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0188, code lost:
        r0 = ((double) r11) * o(r13, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0192, code lost:
        if (r0 > 9.223372036854776E18d) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        if (r0 < -9.223372036854776E18d) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a0, code lost:
        if (java.lang.Math.floor(r0) != r0) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a2, code lost:
        r11 = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a4, code lost:
        z(r17, "Can't convert " + r0 + " to Long", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c8, code lost:
        throw new XH.C16820k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c9, code lost:
        z(r17, "Numeric value overflow", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d9, code lost:
        throw new XH.C16820k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01da, code lost:
        if (r10 == false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if (r11 == Long.MIN_VALUE) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e5, code lost:
        z(r17, "Numeric value overflow", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f5, code lost:
        throw new XH.C16820k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f6, code lost:
        z(r17, "Expected numeric literal", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0206, code lost:
        throw new XH.C16820k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long n() {
        /*
            r17 = this;
            r6 = r17
            int r0 = r17.L()
            int r0 = r6.J(r0)
            java.lang.CharSequence r1 = r17.D()
            int r1 = r1.length()
            if (r0 >= r1) goto L_0x0207
            r1 = -1
            if (r0 == r1) goto L_0x0207
            java.lang.CharSequence r1 = r17.D()
            char r1 = r1.charAt(r0)
            r2 = 34
            if (r1 != r2) goto L_0x0042
            int r0 = r0 + 1
            java.lang.CharSequence r1 = r17.D()
            int r1 = r1.length()
            if (r0 == r1) goto L_0x0031
            r1 = 1
            goto L_0x0043
        L_0x0031:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x0042:
            r1 = 0
        L_0x0043:
            r7 = 0
            r5 = r0
            r11 = r7
            r13 = r11
            r9 = 0
            r10 = 0
        L_0x004a:
            r15 = 0
        L_0x004b:
            java.lang.CharSequence r16 = r17.D()
            int r3 = r16.length()
            if (r5 == r3) goto L_0x0142
            java.lang.CharSequence r3 = r17.D()
            char r3 = r3.charAt(r5)
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L_0x0065
            r4 = 69
            if (r3 != r4) goto L_0x0093
        L_0x0065:
            if (r9 != 0) goto L_0x0093
            if (r5 == r0) goto L_0x006e
            int r5 = r5 + 1
            r9 = 1
        L_0x006c:
            r15 = 1
            goto L_0x004b
        L_0x006e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected symbol "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " in numeric literal"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x0093:
            r4 = 45
            if (r3 != r4) goto L_0x00af
            if (r9 == 0) goto L_0x00af
            if (r5 == r0) goto L_0x009e
            int r5 = r5 + 1
            goto L_0x004a
        L_0x009e:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '-' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x00af:
            r2 = 43
            if (r3 != r2) goto L_0x00cd
            if (r9 == 0) goto L_0x00cd
            if (r5 == r0) goto L_0x00bc
            int r5 = r5 + 1
            r2 = 34
            goto L_0x006c
        L_0x00bc:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '+' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x00cd:
            if (r3 != r4) goto L_0x00e9
            if (r5 != r0) goto L_0x00d8
            int r5 = r5 + 1
            r2 = 34
            r10 = 1
            goto L_0x004b
        L_0x00d8:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '-' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x00e9:
            byte r2 = lK.C17571b.a(r3)
            if (r2 != 0) goto L_0x0142
            int r5 = r5 + 1
            int r2 = r3 + -48
            if (r2 < 0) goto L_0x011d
            r4 = 10
            if (r2 >= r4) goto L_0x011d
            if (r9 == 0) goto L_0x0103
            long r3 = (long) r4
            long r13 = r13 * r3
            long r2 = (long) r2
            long r13 = r13 + r2
        L_0x00ff:
            r2 = 34
            goto L_0x004b
        L_0x0103:
            long r3 = (long) r4
            long r11 = r11 * r3
            long r2 = (long) r2
            long r11 = r11 - r2
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x010c
            goto L_0x00ff
        L_0x010c:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x011d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected symbol '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "' in numeric literal"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x0142:
            if (r5 == r0) goto L_0x0146
            r3 = 1
            goto L_0x0147
        L_0x0146:
            r3 = 0
        L_0x0147:
            if (r0 == r5) goto L_0x01f6
            if (r10 == 0) goto L_0x014f
            int r2 = r5 + -1
            if (r0 == r2) goto L_0x01f6
        L_0x014f:
            if (r1 == 0) goto L_0x0184
            if (r3 == 0) goto L_0x0173
            java.lang.CharSequence r0 = r17.D()
            char r0 = r0.charAt(r5)
            r1 = 34
            if (r0 != r1) goto L_0x0162
            int r5 = r5 + 1
            goto L_0x0184
        L_0x0162:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Expected closing quotation mark"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x0173:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x0184:
            r6.f144471a = r5
            if (r9 == 0) goto L_0x01da
            double r0 = (double) r11
            double r2 = o(r13, r15)
            double r0 = r0 * r2
            r2 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c9
            r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01c9
            double r2 = java.lang.Math.floor(r0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x01a4
            long r11 = (long) r0
            goto L_0x01da
        L_0x01a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can't convert "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " to Long"
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x01c9:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x01da:
            if (r10 == 0) goto L_0x01dd
            goto L_0x01e4
        L_0x01dd:
            r0 = -9223372036854775808
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01e5
            long r11 = -r11
        L_0x01e4:
            return r11
        L_0x01e5:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x01f6:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Expected numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x0207:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            z(r0, r1, r2, r3, r4, r5)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lK.C17570a.n():long");
    }

    public final long p() {
        long n10 = n();
        if (k() == 10) {
            return n10;
        }
        C17571b.c((byte) 10);
        int i10 = this.f144471a;
        int i11 = i10 - 1;
        z(this, "Expected input to contain a single valid number, but got '" + ((i10 == D().length() || i11 < 0) ? "EOF" : String.valueOf(D().charAt(i11))) + "' after it", i11, (String) null, 4, (Object) null);
        throw new C16820k();
    }

    public final String q() {
        return this.f144473c != null ? N() : j();
    }

    /* access modifiers changed from: protected */
    public final String r(CharSequence charSequence, int i10, int i11) {
        int J10;
        C17542s.j(charSequence, "source");
        char charAt = charSequence.charAt(i11);
        boolean z10 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                J10 = J(c(i10, i11));
                if (J10 == -1) {
                    z(this, "Unexpected EOF", J10, (String) null, 4, (Object) null);
                    throw new C16820k();
                }
            } else {
                i11++;
                if (i11 >= charSequence.length()) {
                    e(i10, i11);
                    J10 = J(i11);
                    if (J10 == -1) {
                        z(this, "Unexpected EOF", J10, (String) null, 4, (Object) null);
                        throw new C16820k();
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i11);
                }
            }
            z10 = true;
            i10 = J10;
            i11 = i10;
            charAt = charSequence.charAt(i11);
        }
        String M10 = !z10 ? M(i10, i11) : u(i10, i11);
        this.f144471a = i11 + 1;
        return M10;
    }

    public final String s() {
        if (this.f144473c != null) {
            return N();
        }
        int L10 = L();
        if (L10 >= D().length() || L10 == -1) {
            z(this, "EOF", L10, (String) null, 4, (Object) null);
            throw new C16820k();
        }
        byte a10 = C17571b.a(D().charAt(L10));
        if (a10 == 1) {
            return q();
        }
        if (a10 == 0) {
            boolean z10 = false;
            while (C17571b.a(D().charAt(L10)) == 0) {
                L10++;
                if (L10 >= D().length()) {
                    e(this.f144471a, L10);
                    int J10 = J(L10);
                    if (J10 == -1) {
                        this.f144471a = L10;
                        return u(0, 0);
                    }
                    L10 = J10;
                    z10 = true;
                }
            }
            String M10 = !z10 ? M(this.f144471a, L10) : u(this.f144471a, L10);
            this.f144471a = L10;
            return M10;
        }
        z(this, "Expected beginning of the string, but got " + D().charAt(L10), 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    public final String t() {
        String s10 = s();
        if (!C17542s.e(s10, "null") || !S()) {
            return s10;
        }
        z(this, "Unexpected 'null' value instead of string literal", 0, (String) null, 6, (Object) null);
        throw new C16820k();
    }

    public String toString() {
        return "JsonReader(source='" + D() + "', currentPosition=" + this.f144471a + ')';
    }

    public final void v() {
        this.f144473c = null;
    }

    public void w() {
    }

    public final void x() {
        if (k() != 10) {
            z(this, "Expected EOF after parsing, but had " + D().charAt(this.f144471a - 1) + " instead", 0, (String) null, 6, (Object) null);
            throw new C16820k();
        }
    }

    public final Void y(String str, int i10, String str2) {
        String str3;
        C17542s.j(str, "message");
        C17542s.j(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = 10 + str2;
        }
        throw C17562C.f(i10, str + " at path: " + this.f144472b.a() + str3, D());
    }
}
