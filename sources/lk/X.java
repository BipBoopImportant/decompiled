package lK;

import XH.C16820k;
import YH.C16870n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0014¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u0004\u0018\u00010\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u00020\b8\u0004@\u0004X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0014X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"LlK/X;", "LlK/a;", "LlK/u;", "reader", "", "buffer", "<init>", "(LlK/u;[C)V", "", "unprocessedCount", "LXH/N;", "V", "(I)V", "", "f", "()Z", "position", "J", "(I)I", "", "k", "()B", "", "expected", "m", "(C)V", "L", "()I", "w", "()V", "", "j", "()Ljava/lang/String;", "char", "startPos", "U", "(CI)I", "endPos", "M", "(II)Ljava/lang/String;", "fromIndex", "toIndex", "e", "(II)V", "keyToMatch", "isLenient", "G", "(Ljava/lang/String;Z)Ljava/lang/String;", "LlK/u;", "getReader", "()LlK/u;", "[C", "getBuffer", "()[C", "g", "I", "threshold", "LlK/f;", "h", "LlK/f;", "T", "()LlK/f;", "source", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class X extends C17570a {

    /* renamed from: e  reason: collision with root package name */
    private final C17589u f144467e;

    /* renamed from: f  reason: collision with root package name */
    private final char[] f144468f;

    /* renamed from: g  reason: collision with root package name */
    protected int f144469g = 128;

    /* renamed from: h  reason: collision with root package name */
    private final C17575f f144470h;

    public X(C17589u uVar, char[] cArr) {
        C17542s.j(uVar, "reader");
        C17542s.j(cArr, "buffer");
        this.f144467e = uVar;
        this.f144468f = cArr;
        this.f144470h = new C17575f(cArr);
        V(0);
    }

    private final void V(int i10) {
        char[] b10 = D().b();
        if (i10 != 0) {
            int i11 = this.f144471a;
            C16870n.j(b10, b10, 0, i11, i11 + i10);
        }
        int length = D().length();
        while (true) {
            if (i10 == length) {
                break;
            }
            int a10 = this.f144467e.a(b10, i10, length - i10);
            if (a10 == -1) {
                D().f(i10);
                this.f144469g = -1;
                break;
            }
            i10 += a10;
        }
        this.f144471a = 0;
    }

    public String G(String str, boolean z10) {
        C17542s.j(str, "keyToMatch");
        return null;
    }

    public int J(int i10) {
        if (i10 < D().length()) {
            return i10;
        }
        this.f144471a = i10;
        w();
        return (this.f144471a != 0 || D().length() == 0) ? -1 : 0;
    }

    public int L() {
        int J10;
        char charAt;
        int i10 = this.f144471a;
        while (true) {
            J10 = J(i10);
            if (J10 == -1 || !((charAt = D().charAt(J10)) == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                this.f144471a = J10;
            } else {
                i10 = J10 + 1;
            }
        }
        this.f144471a = J10;
        return J10;
    }

    public String M(int i10, int i11) {
        return D().e(i10, i11);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public C17575f D() {
        return this.f144470h;
    }

    public int U(char c10, int i10) {
        C17575f T10 = D();
        int length = T10.length();
        while (i10 < length) {
            if (T10.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void e(int i10, int i11) {
        StringBuilder C10 = C();
        C10.append(D().b(), i10, i11 - i10);
        C17542s.i(C10, "append(...)");
    }

    public boolean f() {
        w();
        int i10 = this.f144471a;
        while (true) {
            int J10 = J(i10);
            if (J10 != -1) {
                char charAt = D().charAt(J10);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i10 = J10 + 1;
                } else {
                    this.f144471a = J10;
                    return F(charAt);
                }
            } else {
                this.f144471a = J10;
                return false;
            }
        }
    }

    public String j() {
        m('\"');
        int i10 = this.f144471a;
        int U10 = U('\"', i10);
        if (U10 == -1) {
            int J10 = J(i10);
            if (J10 != -1) {
                return r(D(), this.f144471a, J10);
            }
            String c10 = C17571b.c((byte) 1);
            int i11 = this.f144471a;
            int i12 = i11 - 1;
            C17570a.z(this, "Expected " + c10 + ", but had '" + ((i11 == D().length() || i12 < 0) ? "EOF" : String.valueOf(D().charAt(i12))) + "' instead", i12, (String) null, 4, (Object) null);
            throw new C16820k();
        }
        for (int i13 = i10; i13 < U10; i13++) {
            if (D().charAt(i13) == '\\') {
                return r(D(), this.f144471a, i13);
            }
        }
        this.f144471a = U10 + 1;
        return M(i10, U10);
    }

    public byte k() {
        w();
        C17575f T10 = D();
        int i10 = this.f144471a;
        while (true) {
            int J10 = J(i10);
            if (J10 != -1) {
                int i11 = J10 + 1;
                byte a10 = C17571b.a(T10.charAt(J10));
                if (a10 != 3) {
                    this.f144471a = i11;
                    return a10;
                }
                i10 = i11;
            } else {
                this.f144471a = J10;
                return 10;
            }
        }
    }

    public void m(char c10) {
        w();
        C17575f T10 = D();
        int i10 = this.f144471a;
        while (true) {
            int J10 = J(i10);
            if (J10 != -1) {
                int i11 = J10 + 1;
                char charAt = T10.charAt(J10);
                if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                    this.f144471a = i11;
                    if (charAt != c10) {
                        R(c10);
                    } else {
                        return;
                    }
                }
                i10 = i11;
            } else {
                this.f144471a = J10;
                R(c10);
                return;
            }
        }
    }

    public void w() {
        int length = D().length() - this.f144471a;
        if (length <= this.f144469g) {
            V(length);
        }
    }
}
