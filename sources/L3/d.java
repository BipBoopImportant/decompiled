package l3;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l3.a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J,\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll3/d;", "Ll3/a;", "initialExtras", "<init>", "(Ll3/a;)V", "T", "Ll3/a$b;", "key", "t", "LXH/N;", "c", "(Ll3/a$b;Ljava/lang/Object;)V", "a", "(Ll3/a$b;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends a {
    public d() {
        this((a) null, 1, (DefaultConstructorMarker) null);
    }

    public <T> T a(a.b<T> bVar) {
        C17542s.j(bVar, "key");
        return b().get(bVar);
    }

    public final <T> void c(a.b<T> bVar, T t10) {
        C17542s.j(bVar, "key");
        b().put(bVar, t10);
    }

    public d(a aVar) {
        C17542s.j(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.C0407a.f25486b : aVar);
    }
}
