package q6;

import XH.t;
import k6.C8438e;
import k6.C8445l;
import k6.C8454u;
import kotlin.Metadata;
import q6.C8677d;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lq6/c;", "Lq6/d;", "Lq6/e;", "target", "Lk6/l;", "result", "<init>", "(Lq6/e;Lk6/l;)V", "LXH/N;", "a", "()V", "Lq6/e;", "b", "Lk6/l;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: q6.c  reason: case insensitive filesystem */
public final class C8676c implements C8677d {

    /* renamed from: a  reason: collision with root package name */
    private final C8678e f55557a;

    /* renamed from: b  reason: collision with root package name */
    private final C8445l f55558b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lq6/c$a;", "Lq6/d$a;", "<init>", "()V", "Lq6/e;", "target", "Lk6/l;", "result", "Lq6/d;", "a", "(Lq6/e;Lk6/l;)Lq6/d;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: q6.c$a */
    public static final class a implements C8677d.a {
        public C8677d a(C8678e eVar, C8445l lVar) {
            return new C8676c(eVar, lVar);
        }
    }

    public C8676c(C8678e eVar, C8445l lVar) {
        this.f55557a = eVar;
        this.f55558b = lVar;
    }

    public void a() {
        C8445l lVar = this.f55558b;
        if (lVar instanceof C8454u) {
            this.f55557a.d(((C8454u) lVar).k());
        } else if (lVar instanceof C8438e) {
            this.f55557a.e(((C8438e) lVar).k());
        } else {
            throw new t();
        }
    }
}
