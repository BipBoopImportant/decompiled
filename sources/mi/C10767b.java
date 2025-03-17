package Mi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"LMi/b;", "", "", "label", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mi.b  reason: case insensitive filesystem */
public final class C10767b {

    /* renamed from: a  reason: collision with root package name */
    private final String f83379a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83380b;

    public C10767b(String str, String str2) {
        C17542s.j(str, "label");
        C17542s.j(str2, "value");
        this.f83379a = str;
        this.f83380b = str2;
    }

    public final String a() {
        return this.f83379a;
    }

    public final String b() {
        return this.f83380b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10767b)) {
            return false;
        }
        C10767b bVar = (C10767b) obj;
        return C17542s.e(this.f83379a, bVar.f83379a) && C17542s.e(this.f83380b, bVar.f83380b);
    }

    public int hashCode() {
        return (this.f83379a.hashCode() * 31) + this.f83380b.hashCode();
    }

    public String toString() {
        String str = this.f83379a;
        String str2 = this.f83380b;
        return "FilterValue(label=" + str + ", value=" + str2 + ")";
    }
}
