package kD;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"LkD/d;", "LkD/g;", "", "message", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends g {

    /* renamed from: a  reason: collision with root package name */
    private final String f128623a;

    /* renamed from: b  reason: collision with root package name */
    private final String f128624b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "message");
        C17542s.j(str2, "code");
        this.f128623a = str;
        this.f128624b = str2;
    }

    public String a() {
        return this.f128623a;
    }

    public final String b() {
        return this.f128624b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f128623a, dVar.f128623a) && C17542s.e(this.f128624b, dVar.f128624b);
    }

    public int hashCode() {
        return (this.f128623a.hashCode() * 31) + this.f128624b.hashCode();
    }

    public String toString() {
        String str = this.f128623a;
        String str2 = this.f128624b;
        return "HttpFailure(message=" + str + ", code=" + str2 + ")";
    }
}
