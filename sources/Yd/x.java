package Yd;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"LYd/x;", "LYd/a;", "", "title", "", "message", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x extends a {

    /* renamed from: a  reason: collision with root package name */
    private final int f64966a;

    /* renamed from: b  reason: collision with root package name */
    private final String f64967b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(int i10, String str) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "message");
        this.f64966a = i10;
        this.f64967b = str;
    }

    public final String a() {
        return this.f64967b;
    }

    public final int b() {
        return this.f64966a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f64966a == xVar.f64966a && C17542s.e(this.f64967b, xVar.f64967b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f64966a) * 31) + this.f64967b.hashCode();
    }

    public String toString() {
        int i10 = this.f64966a;
        String str = this.f64967b;
        return "ShowErrorPopup(title=" + i10 + ", message=" + str + ")";
    }
}
