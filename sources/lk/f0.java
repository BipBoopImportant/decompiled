package lK;

import HJ.C15854t;
import XH.C16820k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LlK/f0;", "LlK/d0;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "k", "()B", "", "f", "()Z", "", "expected", "LXH/N;", "m", "(C)V", "H", "", "L", "()I", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 extends d0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(String str) {
        super(str);
        C17542s.j(str, "source");
    }

    public byte H() {
        String T10 = D();
        int L10 = L();
        if (L10 >= T10.length() || L10 == -1) {
            return 10;
        }
        this.f144471a = L10;
        return C17571b.a(T10.charAt(L10));
    }

    public int L() {
        int i10;
        int i11 = this.f144471a;
        if (i11 == -1) {
            return i11;
        }
        String T10 = D();
        while (i11 < T10.length()) {
            char charAt = T10.charAt(i11);
            if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                if (charAt != '/' || (i10 = i11 + 1) >= T10.length()) {
                    break;
                }
                char charAt2 = T10.charAt(i10);
                if (charAt2 == '*') {
                    int s02 = C15854t.s0(T10, "*/", i11 + 2, false, 4, (Object) null);
                    if (s02 != -1) {
                        i11 = s02 + 2;
                    } else {
                        this.f144471a = T10.length();
                        C17570a.z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, (String) null, 6, (Object) null);
                        throw new C16820k();
                    }
                } else if (charAt2 != '/') {
                    break;
                } else {
                    i11 = C15854t.r0(T10, 10, i11 + 2, false, 4, (Object) null);
                    if (i11 == -1) {
                        i11 = T10.length();
                    }
                }
            }
            i11++;
        }
        this.f144471a = i11;
        return i11;
    }

    public boolean f() {
        int L10 = L();
        if (L10 >= D().length() || L10 == -1) {
            return false;
        }
        return F(D().charAt(L10));
    }

    public byte k() {
        String T10 = D();
        int L10 = L();
        if (L10 >= T10.length() || L10 == -1) {
            return 10;
        }
        this.f144471a = L10 + 1;
        return C17571b.a(T10.charAt(L10));
    }

    public void m(char c10) {
        String T10 = D();
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
