package Q6;

import M6.B;
import R6.b;
import S6.f;
import WK.C16771f;
import YH.C16877v;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\u0018\u0000 :2\u00020\u0001:\u0001<B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0001H\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0001H\u0016¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0001H\u0016¢\u0006\u0004\b(\u0010\u001fJ\u0017\u0010*\u001a\u00020\u00012\u0006\u0010&\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00012\u0006\u0010&\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00012\u0006\u0010&\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00012\u0006\u0010&\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00002\u0006\u0010&\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b:\u0010%J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010DR\u001c\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040F8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010GR\u0014\u0010I\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0018\u0010K\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010?R\u0014\u0010M\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010LR\u0014\u0010O\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\bN\u0010L¨\u0006P"}, d2 = {"LQ6/c;", "LQ6/g;", "LWK/f;", "sink", "", "indent", "<init>", "(LWK/f;Ljava/lang/String;)V", "", "empty", "openBracket", "l", "(ILjava/lang/String;)LQ6/g;", "nonempty", "closeBracket", "f", "(IILjava/lang/String;)LQ6/g;", "LXH/N;", "t", "()V", "i", "d", "e", "n", "()I", "newTop", "o", "(I)V", "topOfStack", "q", "G", "()LQ6/g;", "E", "C", "K", "name", "q1", "(Ljava/lang/String;)LQ6/g;", "value", "T1", "e3", "", "z0", "(Z)LQ6/g;", "", "c0", "(D)LQ6/g;", "X", "(I)LQ6/g;", "", "V", "(J)LQ6/g;", "LQ6/e;", "m1", "(LQ6/e;)LQ6/g;", "LM6/B;", "s", "(LM6/B;)LQ6/c;", "h", "close", "a", "LWK/f;", "b", "Ljava/lang/String;", "c", "I", "stackSize", "", "[I", "scopes", "", "[Ljava/lang/String;", "pathNames", "pathIndices", "g", "deferredName", "()Ljava/lang/String;", "separator", "m", "path", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements g {

    /* renamed from: h  reason: collision with root package name */
    public static final a f39585h = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f39586i;

    /* renamed from: a  reason: collision with root package name */
    private final C16771f f39587a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39588b;

    /* renamed from: c  reason: collision with root package name */
    private int f39589c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f39590d = new int[256];

    /* renamed from: e  reason: collision with root package name */
    private final String[] f39591e = new String[256];

    /* renamed from: f  reason: collision with root package name */
    private final int[] f39592f = new int[256];

    /* renamed from: g  reason: collision with root package name */
    private String f39593g;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LQ6/c$a;", "", "<init>", "()V", "", "", "b", "(B)Ljava/lang/String;", "LWK/f;", "sink", "value", "LXH/N;", "c", "(LWK/f;Ljava/lang/String;)V", "HEX_ARRAY", "Ljava/lang/String;", "", "REPLACEMENT_CHARS", "[Ljava/lang/String;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(byte b10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("0123456789abcdef".charAt(b10 >>> 4));
            sb2.append("0123456789abcdef".charAt(b10 & 15));
            return sb2.toString();
        }

        public final void c(C16771f fVar, String str) {
            String str2;
            C17542s.j(fVar, "sink");
            C17542s.j(str, "value");
            String[] c10 = c.f39586i;
            fVar.Z1(34);
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (charAt < 128) {
                    str2 = c10[charAt];
                    if (str2 == null) {
                    }
                } else if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    fVar.M0(str, i10, i11);
                }
                fVar.D0(str2);
                i10 = i11 + 1;
            }
            if (i10 < length) {
                fVar.M0(str, i10, length);
            }
            fVar.Z1(34);
        }

        private a() {
        }
    }

    static {
        String[] strArr = new String[128];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u00" + f39585h.b((byte) i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        f39586i = strArr;
    }

    public c(C16771f fVar, String str) {
        C17542s.j(fVar, "sink");
        this.f39587a = fVar;
        this.f39588b = str;
        o(6);
    }

    private final void d() {
        int n10 = n();
        if (n10 == 5) {
            this.f39587a.Z1(44);
        } else if (n10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        i();
        q(4);
    }

    private final void e() {
        int n10 = n();
        if (n10 == 1) {
            q(2);
            i();
        } else if (n10 == 2) {
            this.f39587a.Z1(44);
            i();
        } else if (n10 == 4) {
            this.f39587a.D0(g());
            q(5);
        } else if (n10 == 6) {
            q(7);
        } else if (n10 != 7) {
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JSON must have only one top-level value.");
        }
    }

    private final g f(int i10, int i11, String str) {
        int n10 = n();
        if (n10 != i11 && n10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f39593g == null) {
            int i12 = this.f39589c;
            int i13 = i12 - 1;
            this.f39589c = i13;
            this.f39591e[i13] = null;
            int[] iArr = this.f39592f;
            int i14 = i12 - 2;
            iArr[i14] = iArr[i14] + 1;
            if (n10 == i11) {
                i();
            }
            this.f39587a.D0(str);
            return this;
        } else {
            throw new IllegalStateException(("Dangling name: " + this.f39593g).toString());
        }
    }

    private final String g() {
        String str = this.f39588b;
        return (str == null || str.length() == 0) ? ":" : ": ";
    }

    private final void i() {
        if (this.f39588b != null) {
            this.f39587a.Z1(10);
            int i10 = this.f39589c;
            for (int i11 = 1; i11 < i10; i11++) {
                this.f39587a.D0(this.f39588b);
            }
        }
    }

    private final g l(int i10, String str) {
        e();
        o(i10);
        this.f39592f[this.f39589c - 1] = 0;
        this.f39587a.D0(str);
        return this;
    }

    private final int n() {
        int i10 = this.f39589c;
        if (i10 != 0) {
            return this.f39590d[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void o(int i10) {
        int i11 = this.f39589c;
        int[] iArr = this.f39590d;
        if (i11 != iArr.length) {
            this.f39589c = i11 + 1;
            iArr[i11] = i10;
            return;
        }
        throw new f("Nesting too deep at " + m() + ": circular reference?");
    }

    private final void q(int i10) {
        this.f39590d[this.f39589c - 1] = i10;
    }

    private final void t() {
        if (this.f39593g != null) {
            d();
            a aVar = f39585h;
            C16771f fVar = this.f39587a;
            String str = this.f39593g;
            C17542s.g(str);
            aVar.c(fVar, str);
            this.f39593g = null;
        }
    }

    public g C() {
        t();
        return l(3, "{");
    }

    public g E() {
        return f(1, 2, "]");
    }

    public g G() {
        t();
        return l(1, "[");
    }

    public g K() {
        return f(3, 5, "}");
    }

    public g T1(String str) {
        C17542s.j(str, "value");
        t();
        e();
        f39585h.c(this.f39587a, str);
        int[] iArr = this.f39592f;
        int i10 = this.f39589c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public g V(long j10) {
        return h(String.valueOf(j10));
    }

    public g X(int i10) {
        return h(String.valueOf(i10));
    }

    public g c0(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return h(String.valueOf(d10));
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + d10).toString());
    }

    public void close() {
        this.f39587a.close();
        int i10 = this.f39589c;
        if (i10 > 1 || (i10 == 1 && this.f39590d[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f39589c = 0;
    }

    public g e3() {
        return h("null");
    }

    public final g h(String str) {
        C17542s.j(str, "value");
        t();
        e();
        this.f39587a.D0(str);
        int[] iArr = this.f39592f;
        int i10 = this.f39589c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public String m() {
        return C16877v.G0(b.f39694a.a(this.f39589c, this.f39590d, this.f39591e, this.f39592f), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }

    public g m1(e eVar) {
        C17542s.j(eVar, "value");
        return h(eVar.a());
    }

    public g q1(String str) {
        C17542s.j(str, "name");
        int i10 = this.f39589c;
        if (i10 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (this.f39593g == null) {
            this.f39593g = str;
            this.f39591e[i10 - 1] = str;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: s */
    public c x1(B b10) {
        C17542s.j(b10, "value");
        e3();
        return this;
    }

    public g z0(boolean z10) {
        return h(z10 ? "true" : "false");
    }
}
