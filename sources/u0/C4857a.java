package U0;

import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0014\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u00008\u0016@TX\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b \u0010\u0005¨\u0006\""}, d2 = {"LU0/a;", "T", "LU0/f;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "LXH/N;", "g", "i", "()V", "clear", "l", "", "", "index", "count", "m", "(Ljava/util/List;II)V", "from", "to", "k", "(Ljava/util/List;III)V", "a", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "b", "Ljava/util/List;", "stack", "<set-?>", "c", "n", "current", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.a  reason: case insensitive filesystem */
public abstract class C4857a<T> implements C4872f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f13900a;

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f13901b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private T f13902c;

    public C4857a(T t10) {
        this.f13900a = t10;
        this.f13902c = t10;
    }

    public T a() {
        return this.f13902c;
    }

    public final void clear() {
        this.f13901b.clear();
        n(this.f13900a);
        l();
    }

    public void g(T t10) {
        this.f13901b.add(a());
        n(t10);
    }

    public void i() {
        if (this.f13901b.isEmpty()) {
            C0.b("empty stack");
        }
        List<T> list = this.f13901b;
        n(list.remove(list.size() - 1));
    }

    public final T j() {
        return this.f13900a;
    }

    /* access modifiers changed from: protected */
    public final void k(List<T> list, int i10, int i11, int i12) {
        int i13 = i10 > i11 ? i11 : i11 - i12;
        if (i12 != 1) {
            List<T> subList = list.subList(i10, i12 + i10);
            List w12 = C16877v.w1(subList);
            subList.clear();
            list.addAll(i13, w12);
        } else if (i10 == i11 + 1 || i10 == i11 - 1) {
            list.set(i10, list.set(i11, list.get(i10)));
        } else {
            list.add(i13, list.remove(i10));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void l();

    /* access modifiers changed from: protected */
    public final void m(List<T> list, int i10, int i11) {
        if (i11 == 1) {
            list.remove(i10);
        } else {
            list.subList(i10, i11 + i10).clear();
        }
    }

    /* access modifiers changed from: protected */
    public void n(T t10) {
        this.f13902c = t10;
    }
}
