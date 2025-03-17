package O5;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LO5/g;", "Landroid/view/View;", "T", "LO5/l;", "view", "", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/view/View;", "c", "()Landroid/view/View;", "b", "Z", "i", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g<T extends View> implements l<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f39251a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39252b;

    public g(T t10, boolean z10) {
        this.f39251a = t10;
        this.f39252b = z10;
    }

    public T c() {
        return this.f39251a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return C17542s.e(c(), gVar.c()) && i() == gVar.i();
        }
    }

    public int hashCode() {
        return (c().hashCode() * 31) + Boolean.hashCode(i());
    }

    public boolean i() {
        return this.f39252b;
    }
}
