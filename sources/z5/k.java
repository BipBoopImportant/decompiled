package Z5;

import T5.G;
import T5.H;
import T5.r;
import WK.C16762E;
import X5.C6721f;
import X5.s;
import X5.t;
import Z5.j;
import dI.C17164e;
import k6.C8450q;
import kotlin.Metadata;
import r6.E;
import r6.u;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LZ5/k;", "LZ5/j;", "LT5/G;", "uri", "Lk6/q;", "options", "<init>", "(LT5/G;Lk6/q;)V", "LZ5/i;", "a", "(LdI/e;)Ljava/lang/Object;", "LT5/G;", "b", "Lk6/q;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final G f41385a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f41386b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LZ5/k$a;", "LZ5/j$a;", "LT5/G;", "<init>", "()V", "data", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LZ5/j;", "b", "(LT5/G;Lk6/q;LT5/r;)LZ5/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<G> {
        /* renamed from: b */
        public j a(G g10, C8450q qVar, r rVar) {
            if (!E.m(g10)) {
                return null;
            }
            return new k(g10, qVar);
        }
    }

    public k(G g10, C8450q qVar) {
        this.f41385a = g10;
        this.f41386b = qVar;
    }

    public Object a(C17164e<? super i> eVar) {
        C16762E.a aVar = C16762E.f139592b;
        String d10 = H.d(this.f41385a);
        if (d10 != null) {
            C16762E e10 = C16762E.a.e(aVar, d10, false, 1, (Object) null);
            return new o(t.d(e10, this.f41386b.g(), (String) null, (AutoCloseable) null, (s.a) null, 28, (Object) null), u.f55715a.a(r6.j.d(e10)), C6721f.DISK);
        }
        throw new IllegalStateException("filePath == null");
    }
}
