package L5;

import L5.c;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0017"}, d2 = {"LL5/e;", "LL5/c;", "LL5/h;", "strongMemoryCache", "LL5/i;", "weakMemoryCache", "<init>", "(LL5/h;LL5/i;)V", "LL5/c$b;", "key", "LL5/c$c;", "b", "(LL5/c$b;)LL5/c$c;", "value", "LXH/N;", "c", "(LL5/c$b;LL5/c$c;)V", "", "level", "a", "(I)V", "LL5/h;", "LL5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final h f38287a;

    /* renamed from: b  reason: collision with root package name */
    private final i f38288b;

    public e(h hVar, i iVar) {
        this.f38287a = hVar;
        this.f38288b = iVar;
    }

    public void a(int i10) {
        this.f38287a.a(i10);
        this.f38288b.a(i10);
    }

    public c.C0603c b(c.b bVar) {
        c.C0603c b10 = this.f38287a.b(bVar);
        return b10 == null ? this.f38288b.b(bVar) : b10;
    }

    public void c(c.b bVar, c.C0603c cVar) {
        this.f38287a.c(c.b.b(bVar, (String) null, S5.c.b(bVar.c()), 1, (Object) null), cVar.a(), S5.c.b(cVar.b()));
    }
}
