package A1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"LA1/b;", "LA1/w;", "", "type", "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "I", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.b  reason: case insensitive filesystem */
public final class C4335b implements C4355w {

    /* renamed from: b  reason: collision with root package name */
    private final int f4396b;

    public C4335b(int i10) {
        this.f4396b = i10;
    }

    public final int a() {
        return this.f4396b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C4335b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f4396b == ((C4335b) obj).f4396b;
    }

    public int hashCode() {
        return this.f4396b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f4396b + ')';
    }
}
