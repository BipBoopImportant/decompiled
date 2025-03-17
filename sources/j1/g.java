package J1;

import XH.C16807N;
import android.content.res.Resources;
import android.util.TypedValue;
import j0.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"LJ1/g;", "", "<init>", "()V", "Landroid/content/res/Resources;", "res", "", "id", "Landroid/util/TypedValue;", "b", "(Landroid/content/res/Resources;I)Landroid/util/TypedValue;", "LXH/N;", "a", "Lj0/E;", "Lj0/E;", "resIdPathMap", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final E<TypedValue> f8804a = new E<>(0, 1, (DefaultConstructorMarker) null);

    public final void a() {
        synchronized (this) {
            this.f8804a.i();
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final TypedValue b(Resources resources, int i10) {
        TypedValue c10;
        synchronized (this) {
            c10 = this.f8804a.c(i10);
            if (c10 == null) {
                c10 = new TypedValue();
                resources.getValue(i10, c10, true);
                this.f8804a.p(i10, c10);
            }
        }
        return c10;
    }
}
