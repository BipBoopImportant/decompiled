package f6;

import T5.n;
import f6.C7853d;
import java.util.Map;
import kotlin.Metadata;
import r6.t;

@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\u0006*\u0001 \b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lf6/g;", "Lf6/i;", "", "maxSize", "Lf6/j;", "weakMemoryCache", "<init>", "(JLf6/j;)V", "Lf6/d$b;", "key", "Lf6/d$c;", "b", "(Lf6/d$b;)Lf6/d$c;", "LT5/n;", "image", "", "", "", "extras", "size", "LXH/N;", "e", "(Lf6/d$b;LT5/n;Ljava/util/Map;J)V", "", "d", "(Lf6/d$b;)Z", "clear", "()V", "c", "(J)V", "a", "Lf6/j;", "f6/g$b", "Lf6/g$b;", "cache", "()J", "g", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f6.g  reason: case insensitive filesystem */
public final class C7856g implements i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final j f51191a;

    /* renamed from: b  reason: collision with root package name */
    private final b f51192b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf6/g$a;", "", "LT5/n;", "image", "", "", "extras", "", "size", "<init>", "(LT5/n;Ljava/util/Map;J)V", "a", "LT5/n;", "b", "()LT5/n;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "J", "()J", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: f6.g$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final n f51193a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Object> f51194b;

        /* renamed from: c  reason: collision with root package name */
        private final long f51195c;

        public a(n nVar, Map<String, ? extends Object> map, long j10) {
            this.f51193a = nVar;
            this.f51194b = map;
            this.f51195c = j10;
        }

        public final Map<String, Object> a() {
            return this.f51194b;
        }

        public final n b() {
            return this.f51193a;
        }

        public final long c() {
            return this.f51195c;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"f6/g$b", "Lr6/t;", "Lf6/d$b;", "Lf6/g$a;", "key", "value", "", "m", "(Lf6/d$b;Lf6/g$a;)J", "oldValue", "newValue", "LXH/N;", "l", "(Lf6/d$b;Lf6/g$a;Lf6/g$a;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: f6.g$b */
    public static final class b extends t<C7853d.b, a> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C7856g f51196d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(long j10, C7856g gVar) {
            super(j10);
            this.f51196d = gVar;
        }

        /* renamed from: l */
        public void b(C7853d.b bVar, a aVar, a aVar2) {
            this.f51196d.f51191a.e(bVar, aVar.b(), aVar.a(), aVar.c());
        }

        /* renamed from: m */
        public long j(C7853d.b bVar, a aVar) {
            return aVar.c();
        }
    }

    public C7856g(long j10, j jVar) {
        this.f51191a = jVar;
        this.f51192b = new b(j10, this);
    }

    public long a() {
        return this.f51192b.e();
    }

    public C7853d.c b(C7853d.b bVar) {
        a aVar = (a) this.f51192b.c(bVar);
        if (aVar != null) {
            return new C7853d.c(aVar.b(), aVar.a());
        }
        return null;
    }

    public void c(long j10) {
        this.f51192b.k(j10);
    }

    public void clear() {
        this.f51192b.a();
    }

    public boolean d(C7853d.b bVar) {
        return this.f51192b.h(bVar) != null;
    }

    public void e(C7853d.b bVar, n nVar, Map<String, ? extends Object> map, long j10) {
        if (j10 <= g()) {
            this.f51192b.f(bVar, new a(nVar, map, j10));
            return;
        }
        this.f51192b.h(bVar);
        this.f51191a.e(bVar, nVar, map, j10);
    }

    public long g() {
        return this.f51192b.d();
    }
}
