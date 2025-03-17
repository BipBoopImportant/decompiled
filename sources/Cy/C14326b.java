package cy;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Lcy/b;", "", "", "type", "value", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cy.b  reason: case insensitive filesystem */
public final class C14326b {

    /* renamed from: a  reason: collision with root package name */
    private final String f126156a;

    /* renamed from: b  reason: collision with root package name */
    private final String f126157b;

    /* renamed from: c  reason: collision with root package name */
    private final String f126158c;

    public C14326b(String str, String str2, String str3) {
        C17542s.j(str, "type");
        C17542s.j(str2, "value");
        this.f126156a = str;
        this.f126157b = str2;
        this.f126158c = str3;
    }

    public final String a() {
        return this.f126158c;
    }

    public final String b() {
        return this.f126156a;
    }

    public final String c() {
        return this.f126157b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14326b)) {
            return false;
        }
        C14326b bVar = (C14326b) obj;
        return C17542s.e(this.f126156a, bVar.f126156a) && C17542s.e(this.f126157b, bVar.f126157b) && C17542s.e(this.f126158c, bVar.f126158c);
    }

    public int hashCode() {
        int hashCode = ((this.f126156a.hashCode() * 31) + this.f126157b.hashCode()) * 31;
        String str = this.f126158c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f126156a;
        String str2 = this.f126157b;
        String str3 = this.f126158c;
        return "ReassuranceContentItemHolder(type=" + str + ", value=" + str2 + ", link=" + str3 + ")";
    }
}
