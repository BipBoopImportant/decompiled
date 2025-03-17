package l5;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import s5.C8731m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ll5/B;", "Ll5/z;", "delegate", "<init>", "(Ll5/z;)V", "Ls5/m;", "id", "Ll5/y;", "d", "(Ls5/m;)Ll5/y;", "f", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "b", "(Ls5/m;)Z", "Ll5/z;", "", "c", "Ljava/lang/Object;", "lock", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l5.B  reason: case insensitive filesystem */
final class C8497B implements z {

    /* renamed from: b  reason: collision with root package name */
    private final z f54598b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f54599c = new Object();

    public C8497B(z zVar) {
        C17542s.j(zVar, "delegate");
        this.f54598b = zVar;
    }

    public boolean b(C8731m mVar) {
        boolean b10;
        C17542s.j(mVar, "id");
        synchronized (this.f54599c) {
            b10 = this.f54598b.b(mVar);
        }
        return b10;
    }

    public C8528y d(C8731m mVar) {
        C8528y d10;
        C17542s.j(mVar, "id");
        synchronized (this.f54599c) {
            d10 = this.f54598b.d(mVar);
        }
        return d10;
    }

    public C8528y f(C8731m mVar) {
        C8528y f10;
        C17542s.j(mVar, "id");
        synchronized (this.f54599c) {
            f10 = this.f54598b.f(mVar);
        }
        return f10;
    }

    public List<C8528y> remove(String str) {
        List<C8528y> remove;
        C17542s.j(str, "workSpecId");
        synchronized (this.f54599c) {
            remove = this.f54598b.remove(str);
        }
        return remove;
    }
}
