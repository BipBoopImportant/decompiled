package wK;

import N1.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"LwK/p4;", "", "LN1/Y;", "title", "description", "<init>", "(LN1/Y;LN1/Y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LN1/Y;", "b", "()LN1/Y;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.p4  reason: case insensitive filesystem */
final class C18442p4 {

    /* renamed from: a  reason: collision with root package name */
    private final Y f151396a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f151397b;

    public C18442p4(Y y10, Y y11) {
        C17542s.j(y10, "title");
        C17542s.j(y11, "description");
        this.f151396a = y10;
        this.f151397b = y11;
    }

    public final Y a() {
        return this.f151397b;
    }

    public final Y b() {
        return this.f151396a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18442p4)) {
            return false;
        }
        C18442p4 p4Var = (C18442p4) obj;
        return C17542s.e(this.f151396a, p4Var.f151396a) && C17542s.e(this.f151397b, p4Var.f151397b);
    }

    public int hashCode() {
        return (this.f151396a.hashCode() * 31) + this.f151397b.hashCode();
    }

    public String toString() {
        Y y10 = this.f151396a;
        Y y11 = this.f151397b;
        return "ListViewItemColors(title=" + y10 + ", description=" + y11 + ")";
    }
}
