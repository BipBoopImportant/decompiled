package l6;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll6/e;", "Landroid/view/View;", "T", "Ll6/l;", "view", "", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "d", "Landroid/view/View;", "c", "()Landroid/view/View;", "e", "Z", "i", "()Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<T extends View> implements l<T> {

    /* renamed from: d  reason: collision with root package name */
    private final T f54763d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f54764e;

    public e(T t10, boolean z10) {
        this.f54763d = t10;
        this.f54764e = z10;
    }

    public T c() {
        return this.f54763d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f54763d, eVar.f54763d) && this.f54764e == eVar.f54764e;
    }

    public int hashCode() {
        return (this.f54763d.hashCode() * 31) + Boolean.hashCode(this.f54764e);
    }

    public boolean i() {
        return this.f54764e;
    }

    public String toString() {
        return "RealViewSizeResolver(view=" + this.f54763d + ", subtractPadding=" + this.f54764e + ')';
    }
}
