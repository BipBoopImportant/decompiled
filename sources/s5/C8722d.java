package s5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ls5/d;", "", "", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s5.d  reason: case insensitive filesystem */
public final class C8722d {

    /* renamed from: a  reason: collision with root package name */
    private final String f55876a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f55877b;

    public C8722d(String str, Long l10) {
        C17542s.j(str, "key");
        this.f55876a = str;
        this.f55877b = l10;
    }

    public final String a() {
        return this.f55876a;
    }

    public final Long b() {
        return this.f55877b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8722d)) {
            return false;
        }
        C8722d dVar = (C8722d) obj;
        return C17542s.e(this.f55876a, dVar.f55876a) && C17542s.e(this.f55877b, dVar.f55877b);
    }

    public int hashCode() {
        int hashCode = this.f55876a.hashCode() * 31;
        Long l10 = this.f55877b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f55876a + ", value=" + this.f55877b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8722d(String str, boolean z10) {
        this(str, Long.valueOf(z10 ? 1 : 0));
        C17542s.j(str, "key");
    }
}
