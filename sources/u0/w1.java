package U0;

import XH.C16820k;
import h1.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import oI.C17693a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0017¨\u0006%"}, d2 = {"LU0/w1;", "", "Lh1/b;", "LU0/c1;", "table", "", "parent", "LU0/V;", "group", "LU0/x1;", "path", "<init>", "(LU0/c1;ILU0/V;LU0/x1;)V", "", "hasNext", "()Z", "c", "()Lh1/b;", "a", "LU0/c1;", "getTable", "()LU0/c1;", "b", "I", "getParent", "()I", "LU0/V;", "getGroup", "()LU0/V;", "d", "LU0/x1;", "getPath", "()LU0/x1;", "e", "version", "f", "index", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class w1 implements Iterator<b>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C4865c1 f14177a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14178b;

    /* renamed from: c  reason: collision with root package name */
    private final V f14179c;

    /* renamed from: d  reason: collision with root package name */
    private final x1 f14180d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14181e;

    /* renamed from: f  reason: collision with root package name */
    private int f14182f;

    public w1(C4865c1 c1Var, int i10, V v10, x1 x1Var) {
        this.f14177a = c1Var;
        this.f14178b = i10;
        this.f14179c = v10;
        this.f14180d = x1Var;
        this.f14181e = c1Var.F();
    }

    /* renamed from: c */
    public b next() {
        Object obj;
        ArrayList<Object> c10 = this.f14179c.c();
        if (c10 != null) {
            int i10 = this.f14182f;
            this.f14182f = i10 + 1;
            obj = c10.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof C4866d) {
            return new C4868d1(this.f14177a, ((C4866d) obj).a(), this.f14181e);
        }
        if (obj instanceof V) {
            return new y1(this.f14177a, this.f14178b, (V) obj, new R0(this.f14180d, this.f14182f - 1));
        }
        C4895p.t("Unexpected group information structure");
        throw new C16820k();
    }

    public boolean hasNext() {
        ArrayList<Object> c10 = this.f14179c.c();
        return c10 != null && this.f14182f < c10.size();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
