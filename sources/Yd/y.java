package Yd;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LYd/y;", "LYd/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f64968a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(String str) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "message");
        this.f64968a = str;
    }

    public final String a() {
        return this.f64968a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && C17542s.e(this.f64968a, ((y) obj).f64968a);
    }

    public int hashCode() {
        return this.f64968a.hashCode();
    }

    public String toString() {
        String str = this.f64968a;
        return "ShowMessage(message=" + str + ")";
    }
}
