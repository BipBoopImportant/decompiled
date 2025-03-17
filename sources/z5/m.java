package Z5;

import HJ.C15854t;
import T5.G;
import T5.r;
import WK.C16762E;
import WK.y;
import X5.C6721f;
import X5.s;
import X5.t;
import Z5.j;
import dI.C17164e;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import r6.u;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LZ5/m;", "LZ5/j;", "LT5/G;", "uri", "Lk6/q;", "options", "<init>", "(LT5/G;Lk6/q;)V", "LZ5/i;", "a", "(LdI/e;)Ljava/lang/Object;", "LT5/G;", "b", "Lk6/q;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    private final G f41390a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f41391b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LZ5/m$a;", "LZ5/j$a;", "LT5/G;", "<init>", "()V", "data", "", "c", "(LT5/G;)Z", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LZ5/j;", "b", "(LT5/G;Lk6/q;LT5/r;)LZ5/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<G> {
        private final boolean c(G g10) {
            return C17542s.e(g10.c(), "jar:file");
        }

        /* renamed from: b */
        public j a(G g10, C8450q qVar, r rVar) {
            if (!c(g10)) {
                return null;
            }
            return new m(g10, qVar);
        }
    }

    public m(G g10, C8450q qVar) {
        this.f41390a = g10;
        this.f41391b = qVar;
    }

    public Object a(C17164e<? super i> eVar) {
        String b10 = this.f41390a.b();
        if (b10 == null) {
            b10 = "";
        }
        int r02 = C15854t.r0(b10, '!', 0, false, 6, (Object) null);
        if (r02 != -1) {
            C16762E.a aVar = C16762E.f139592b;
            String substring = b10.substring(0, r02);
            C17542s.i(substring, "substring(...)");
            C16762E e10 = C16762E.a.e(aVar, substring, false, 1, (Object) null);
            String substring2 = b10.substring(r02 + 1, b10.length());
            C17542s.i(substring2, "substring(...)");
            C16762E e11 = C16762E.a.e(aVar, substring2, false, 1, (Object) null);
            return new o(t.d(e11, y.f(this.f41391b.g(), e10), (String) null, (AutoCloseable) null, (s.a) null, 28, (Object) null), u.f55715a.a(r6.j.d(e11)), C6721f.DISK);
        }
        throw new IllegalStateException(("Invalid jar:file URI: " + this.f41390a).toString());
    }
}
