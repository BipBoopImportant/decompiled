package U0;

import h1.b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"LU0/d1;", "Lh1/b;", "", "LU0/c1;", "table", "", "group", "version", "<init>", "(LU0/c1;II)V", "LXH/N;", "b", "()V", "", "iterator", "()Ljava/util/Iterator;", "a", "LU0/c1;", "getTable", "()LU0/c1;", "I", "getGroup", "()I", "c", "getVersion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.d1  reason: case insensitive filesystem */
final class C4868d1 implements b, Iterable<b>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C4865c1 f13949a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13950b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13951c;

    public C4868d1(C4865c1 c1Var, int i10, int i11) {
        this.f13949a = c1Var;
        this.f13950b = i10;
        this.f13951c = i11;
    }

    private final void b() {
        if (this.f13949a.F() != this.f13951c) {
            throw new ConcurrentModificationException();
        }
    }

    public Iterator<b> iterator() {
        b();
        V O10 = this.f13949a.O(this.f13950b);
        if (O10 != null) {
            C4865c1 c1Var = this.f13949a;
            int i10 = this.f13950b;
            return new w1(c1Var, i10, O10, new C4869e(i10));
        }
        C4865c1 c1Var2 = this.f13949a;
        int i11 = this.f13950b;
        return new T(c1Var2, i11 + 1, i11 + C4871e1.I(c1Var2.A(), this.f13950b));
    }
}
