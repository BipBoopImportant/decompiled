package JH;

import JH.C15955b;
import YH.C16877v;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u00020\u000e\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u000e\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LJH/c;", "LJH/b;", "<init>", "()V", "", "T", "LJH/a;", "key", "e", "(LJH/a;)Ljava/lang/Object;", "", "f", "(LJH/a;)Z", "value", "LXH/N;", "c", "(LJH/a;Ljava/lang/Object;)V", "d", "(LJH/a;)V", "", "h", "()Ljava/util/Map;", "map", "", "g", "()Ljava/util/List;", "allKeys", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: JH.c  reason: case insensitive filesystem */
abstract class C15956c implements C15955b {
    public <T> T a(C15954a<T> aVar) {
        return C15955b.a.a(this, aVar);
    }

    public final <T> void c(C15954a<T> aVar, T t10) {
        C17542s.j(aVar, "key");
        C17542s.j(t10, "value");
        h().put(aVar, t10);
    }

    public final <T> void d(C15954a<T> aVar) {
        C17542s.j(aVar, "key");
        h().remove(aVar);
    }

    public final <T> T e(C15954a<T> aVar) {
        C17542s.j(aVar, "key");
        return h().get(aVar);
    }

    public final boolean f(C15954a<?> aVar) {
        C17542s.j(aVar, "key");
        return h().containsKey(aVar);
    }

    public final List<C15954a<?>> g() {
        return C16877v.t1(h().keySet());
    }

    /* access modifiers changed from: protected */
    public abstract Map<C15954a<?>, Object> h();
}
