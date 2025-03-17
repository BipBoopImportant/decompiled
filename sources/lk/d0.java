package lK;

import HJ.C15854t;
import XH.C16820k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"LlK/d0;", "LlK/a;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "position", "J", "(I)I", "", "k", "()B", "", "f", "()Z", "L", "()I", "", "expected", "LXH/N;", "m", "(C)V", "j", "()Ljava/lang/String;", "keyToMatch", "isLenient", "G", "(Ljava/lang/String;Z)Ljava/lang/String;", "e", "Ljava/lang/String;", "T", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class d0 extends C17570a {

    /* renamed from: e  reason: collision with root package name */
    private final String f144501e;

    public d0(String str) {
        C17542s.j(str, "source");
        this.f144501e = str;
    }

    public String G(String str, boolean z10) {
        C17542s.j(str, "keyToMatch");
        int i10 = this.f144471a;
        try {
            if (k() == 6) {
                if (C17542s.e(I(z10), str)) {
                    v();
                    if (k() == 5) {
                        String I10 = I(z10);
                        this.f144471a = i10;
                        v();
                        return I10;
                    }
                }
            }
            return null;
        } finally {
            this.f144471a = i10;
            v();
        }
    }

    public int J(int i10) {
        if (i10 < D().length()) {
            return i10;
        }
        return -1;
    }

    public int L() {
        int i10 = this.f144471a;
        if (i10 == -1) {
            return i10;
        }
        String T10 = D();
        while (i10 < T10.length() && ((r2 = T10.charAt(i10)) == ' ' || r2 == 10 || r2 == 13 || r2 == 9)) {
            i10++;
        }
        this.f144471a = i10;
        return i10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public String D() {
        return this.f144501e;
    }

    public boolean f() {
        int i10 = this.f144471a;
        if (i10 == -1) {
            return false;
        }
        String T10 = D();
        while (i10 < T10.length()) {
            char charAt = T10.charAt(i10);
            if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                i10++;
            } else {
                this.f144471a = i10;
                return F(charAt);
            }
        }
        this.f144471a = i10;
        return false;
    }

    public String j() {
        m('\"');
        int i10 = this.f144471a;
        int r02 = C15854t.r0(D(), '\"', i10, false, 4, (Object) null);
        if (r02 == -1) {
            s();
            String c10 = C17571b.c((byte) 1);
            int i11 = this.f144471a;
            String valueOf = (i11 == D().length() || i11 < 0) ? "EOF" : String.valueOf(D().charAt(i11));
            C17570a.z(this, "Expected " + c10 + ", but had '" + valueOf + "' instead", i11, (String) null, 4, (Object) null);
            throw new C16820k();
        }
        for (int i12 = i10; i12 < r02; i12++) {
            if (D().charAt(i12) == '\\') {
                return r(D(), this.f144471a, i12);
            }
        }
        this.f144471a = r02 + 1;
        String substring = D().substring(i10, r02);
        C17542s.i(substring, "substring(...)");
        return substring;
    }

    public byte k() {
        String T10 = D();
        int i10 = this.f144471a;
        while (i10 != -1 && i10 < T10.length()) {
            int i11 = i10 + 1;
            char charAt = T10.charAt(i10);
            if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                i10 = i11;
            } else {
                this.f144471a = i11;
                return C17571b.a(charAt);
            }
        }
        this.f144471a = T10.length();
        return 10;
    }

    public void m(char c10) {
        if (this.f144471a == -1) {
            R(c10);
        }
        String T10 = D();
        int i10 = this.f144471a;
        while (i10 < T10.length()) {
            int i11 = i10 + 1;
            char charAt = T10.charAt(i10);
            if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                this.f144471a = i11;
                if (charAt != c10) {
                    R(c10);
                } else {
                    return;
                }
            }
            i10 = i11;
        }
        this.f144471a = -1;
        R(c10);
    }
}
