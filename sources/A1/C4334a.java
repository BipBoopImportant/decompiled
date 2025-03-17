package A1;

import android.view.PointerIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LA1/a;", "LA1/w;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/view/PointerIcon;", "b", "Landroid/view/PointerIcon;", "a", "()Landroid/view/PointerIcon;", "pointerIcon", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.a  reason: case insensitive filesystem */
public final class C4334a implements C4355w {

    /* renamed from: b  reason: collision with root package name */
    private final PointerIcon f4395b;

    public final PointerIcon a() {
        return this.f4395b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C4334a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return C17542s.e(this.f4395b, ((C4334a) obj).f4395b);
    }

    public int hashCode() {
        return this.f4395b.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f4395b + ')';
    }
}
