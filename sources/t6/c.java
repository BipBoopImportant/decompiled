package T6;

import M6.f;
import M6.g;
import M6.w;
import TJ.C16532g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LT6/c;", "LT6/b;", "", "LT6/a;", "interceptors", "", "index", "<init>", "(Ljava/util/List;I)V", "LM6/w$a;", "D", "LM6/f;", "request", "LTJ/g;", "LM6/g;", "a", "(LM6/f;)LTJ/g;", "Ljava/util/List;", "b", "I", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f40106a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40107b;

    public c(List<? extends a> list, int i10) {
        C17542s.j(list, "interceptors");
        this.f40106a = list;
        this.f40107b = i10;
    }

    public <D extends w.a> C16532g<g<D>> a(f<D> fVar) {
        C17542s.j(fVar, "request");
        if (this.f40107b < this.f40106a.size()) {
            return this.f40106a.get(this.f40107b).a(fVar, new c(this.f40106a, this.f40107b + 1));
        }
        throw new IllegalStateException("Check failed.");
    }
}
