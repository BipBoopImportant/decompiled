package X6;

import N6.g;
import N6.i;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"LX6/b;", "LX6/f;", "", "LX6/e;", "interceptors", "", "index", "<init>", "(Ljava/util/List;I)V", "LN6/g;", "request", "LN6/i;", "a", "(LN6/g;LdI/e;)Ljava/lang/Object;", "Ljava/util/List;", "b", "I", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f40708a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40709b;

    public b(List<? extends e> list, int i10) {
        C17542s.j(list, "interceptors");
        this.f40708a = list;
        this.f40709b = i10;
    }

    public Object a(g gVar, C17164e<? super i> eVar) {
        if (this.f40709b < this.f40708a.size()) {
            return this.f40708a.get(this.f40709b).a(gVar, new b(this.f40708a, this.f40709b + 1), eVar);
        }
        throw new IllegalStateException("Check failed.");
    }
}
