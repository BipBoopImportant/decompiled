package wx;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u001a"}, d2 = {"Lwx/e;", "Lwx/c;", "", "text", "", "selected", "itemNo", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "c", "()Ljava/lang/String;", "b", "a", "()Z", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "Z", "getSelected", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f131774a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f131775b;

    /* renamed from: c  reason: collision with root package name */
    private final String f131776c;

    public e(String str, boolean z10, String str2) {
        C17542s.j(str, "text");
        C17542s.j(str2, "itemNo");
        this.f131774a = str;
        this.f131775b = z10;
        this.f131776c = str2;
    }

    public boolean a() {
        return this.f131775b;
    }

    public String b() {
        return this.f131774a;
    }

    public String c() {
        return this.f131776c;
    }

    public final String d() {
        return this.f131774a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f131774a, eVar.f131774a) && this.f131775b == eVar.f131775b && C17542s.e(this.f131776c, eVar.f131776c);
    }

    public int hashCode() {
        return (((this.f131774a.hashCode() * 31) + Boolean.hashCode(this.f131775b)) * 31) + this.f131776c.hashCode();
    }

    public String toString() {
        String str = this.f131774a;
        boolean z10 = this.f131775b;
        String str2 = this.f131776c;
        return "ValueTextRepresentation(text=" + str + ", selected=" + z10 + ", itemNo=" + str2 + ")";
    }
}
