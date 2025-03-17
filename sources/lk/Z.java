package lK;

import HJ.C15854t;
import XH.C16796C;
import XH.C16820k;
import XH.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LlK/Z;", "LlK/X;", "LlK/u;", "reader", "", "buffer", "<init>", "(LlK/u;[C)V", "", "position", "LXH/v;", "", "W", "(I)LXH/v;", "X", "(I)I", "", "expected", "LXH/N;", "m", "(C)V", "f", "()Z", "", "k", "()B", "H", "L", "()I", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Z extends X {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Z(C17589u uVar, char[] cArr) {
        super(uVar, cArr);
        C17542s.j(uVar, "reader");
        C17542s.j(cArr, "buffer");
    }

    private final v<Integer, Boolean> W(int i10) {
        int i11 = i10 + 2;
        char charAt = D().charAt(i10 + 1);
        if (charAt == '*') {
            boolean z10 = false;
            int i12 = i11;
            while (i10 != -1) {
                int s02 = C15854t.s0(D(), "*/", i12, false, 4, (Object) null);
                if (s02 != -1) {
                    return C16796C.a(Integer.valueOf(s02 + 2), Boolean.TRUE);
                }
                if (D().charAt(D().length() - 1) == '*') {
                    i12 = X(D().length() - 1);
                    if (z10) {
                        break;
                    }
                    z10 = true;
                } else {
                    i12 = J(D().length());
                }
                i10 = i12;
            }
            this.f144471a = D().length();
            C17570a.z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, (String) null, 6, (Object) null);
            throw new C16820k();
        } else if (charAt != '/') {
            return C16796C.a(Integer.valueOf(i10), Boolean.FALSE);
        } else {
            int i13 = i11;
            while (i10 != -1) {
                int r02 = C15854t.r0(D(), 10, i13, false, 4, (Object) null);
                if (r02 != -1) {
                    return C16796C.a(Integer.valueOf(r02 + 1), Boolean.TRUE);
                }
                i13 = J(D().length());
                i10 = i13;
            }
            return C16796C.a(-1, Boolean.TRUE);
        }
    }

    private final int X(int i10) {
        if (D().length() - i10 > this.f144469g) {
            return i10;
        }
        this.f144471a = i10;
        w();
        return (this.f144471a != 0 || D().length() == 0) ? -1 : 0;
    }

    public byte H() {
        w();
        C17575f T10 = D();
        int L10 = L();
        if (L10 >= T10.length() || L10 == -1) {
            return 10;
        }
        this.f144471a = L10;
        return C17571b.a(T10.charAt(L10));
    }

    public int L() {
        int J10;
        int i10 = this.f144471a;
        while (true) {
            J10 = J(i10);
            if (J10 != -1) {
                char charAt = D().charAt(J10);
                if (charAt != ' ' && charAt != 10 && charAt != 13 && charAt != 9) {
                    if (charAt != '/' || J10 + 1 >= D().length()) {
                        break;
                    }
                    v<Integer, Boolean> W10 = W(J10);
                    int intValue = W10.a().intValue();
                    if (!W10.b().booleanValue()) {
                        J10 = intValue;
                        break;
                    }
                    i10 = intValue;
                } else {
                    i10 = J10 + 1;
                }
            } else {
                break;
            }
        }
        this.f144471a = J10;
        return J10;
    }

    public boolean f() {
        w();
        int L10 = L();
        if (L10 >= D().length() || L10 == -1) {
            return false;
        }
        return F(D().charAt(L10));
    }

    public byte k() {
        w();
        C17575f T10 = D();
        int L10 = L();
        if (L10 >= T10.length() || L10 == -1) {
            return 10;
        }
        this.f144471a = L10 + 1;
        return C17571b.a(T10.charAt(L10));
    }

    public void m(char c10) {
        w();
        C17575f T10 = D();
        int L10 = L();
        if (L10 >= T10.length() || L10 == -1) {
            this.f144471a = -1;
            R(c10);
        }
        char charAt = T10.charAt(L10);
        this.f144471a = L10 + 1;
        if (charAt != c10) {
            R(c10);
        }
    }
}
