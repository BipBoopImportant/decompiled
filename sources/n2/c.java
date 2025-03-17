package N2;

import YH.C16877v;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003R$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"LN2/c;", "", "<init>", "()V", "LN2/b;", "listener", "LXH/N;", "a", "(LN2/b;)V", "c", "b", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "listeners", "customview-poolingcontainer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f9519a = new ArrayList<>();

    public final void a(b bVar) {
        C17542s.j(bVar, "listener");
        this.f9519a.add(bVar);
    }

    public final void b() {
        for (int p10 = C16877v.p(this.f9519a); -1 < p10; p10--) {
            this.f9519a.get(p10).b();
        }
    }

    public final void c(b bVar) {
        C17542s.j(bVar, "listener");
        this.f9519a.remove(bVar);
    }
}
