package JH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"LJH/a;", "", "T", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getName", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: JH.a  reason: case insensitive filesystem */
public final class C15954a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f135683a;

    public C15954a(String str) {
        C17542s.j(str, "name");
        this.f135683a = str;
        if (str.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C15954a.class == obj.getClass() && C17542s.e(this.f135683a, ((C15954a) obj).f135683a);
    }

    public int hashCode() {
        return this.f135683a.hashCode();
    }

    public String toString() {
        return "AttributeKey: " + this.f135683a;
    }
}
