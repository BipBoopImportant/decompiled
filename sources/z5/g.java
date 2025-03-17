package Z5;

import HJ.C15854t;
import T5.G;
import T5.r;
import WK.C16770e;
import X5.C6721f;
import X5.s;
import X5.t;
import Z5.j;
import dI.C17164e;
import k6.C8450q;
import kI.C17500a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\f\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LZ5/g;", "LZ5/j;", "LT5/G;", "uri", "Lk6/q;", "options", "<init>", "(LT5/G;Lk6/q;)V", "LZ5/i;", "a", "(LdI/e;)Ljava/lang/Object;", "LT5/G;", "b", "Lk6/q;", "c", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements j {

    /* renamed from: c  reason: collision with root package name */
    private static final a f41380c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final G f41381a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f41382b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LZ5/g$a;", "", "<init>", "()V", "", "BASE64_TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LZ5/g$b;", "LZ5/j$a;", "LT5/G;", "<init>", "()V", "data", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LZ5/j;", "b", "(LT5/G;Lk6/q;LT5/r;)LZ5/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements j.a<G> {
        /* renamed from: b */
        public j a(G g10, C8450q qVar, r rVar) {
            if (!C17542s.e(g10.c(), "data")) {
                return null;
            }
            return new g(g10, qVar);
        }
    }

    public g(G g10, C8450q qVar) {
        this.f41381a = g10;
        this.f41382b = qVar;
    }

    public Object a(C17164e<? super i> eVar) {
        int s02 = C15854t.s0(this.f41381a.toString(), ";base64,", 0, false, 6, (Object) null);
        if (s02 != -1) {
            int r02 = C15854t.r0(this.f41381a.toString(), ':', 0, false, 6, (Object) null);
            if (r02 != -1) {
                String substring = this.f41381a.toString().substring(r02 + 1, s02);
                C17542s.i(substring, "substring(...)");
                byte[] g10 = C17500a.g(C17500a.f144250d, this.f41381a.toString(), s02 + 8, 0, 4, (Object) null);
                C16770e eVar2 = new C16770e();
                eVar2.f1(g10);
                return new o(t.c(eVar2, this.f41382b.g(), (s.a) null, 4, (Object) null), substring, C6721f.MEMORY);
            }
            throw new IllegalStateException(("invalid data uri: " + this.f41381a).toString());
        }
        throw new IllegalStateException(("invalid data uri: " + this.f41381a).toString());
    }
}
