package U0;

import h1.b;
import java.util.Iterator;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"LU0/y1;", "Lh1/b;", "", "LU0/c1;", "table", "", "parent", "LU0/V;", "sourceInformation", "LU0/x1;", "identityPath", "<init>", "(LU0/c1;ILU0/V;LU0/x1;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "LU0/c1;", "getTable", "()LU0/c1;", "b", "I", "getParent", "()I", "c", "LU0/V;", "getSourceInformation", "()LU0/V;", "d", "LU0/x1;", "getIdentityPath", "()LU0/x1;", "", "e", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "f", "Ljava/lang/Iterable;", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class y1 implements b, Iterable<b>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C4865c1 f14194a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14195b;

    /* renamed from: c  reason: collision with root package name */
    private final V f14196c;

    /* renamed from: d  reason: collision with root package name */
    private final x1 f14197d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f14198e;

    /* renamed from: f  reason: collision with root package name */
    private final Iterable<b> f14199f = this;

    public y1(C4865c1 c1Var, int i10, V v10, x1 x1Var) {
        this.f14194a = c1Var;
        this.f14195b = i10;
        this.f14196c = v10;
        this.f14197d = x1Var;
        this.f14198e = Integer.valueOf(v10.d());
    }

    public Iterator<b> iterator() {
        return new w1(this.f14194a, this.f14195b, this.f14196c, this.f14197d);
    }
}
