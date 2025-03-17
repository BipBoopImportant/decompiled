package yo;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lyo/e;", "", "", "title", "key", "", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f107199a;

    /* renamed from: b  reason: collision with root package name */
    private final String f107200b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f107201c;

    public e(String str, String str2, List<String> list) {
        C17542s.j(str, "title");
        C17542s.j(list, "items");
        this.f107199a = str;
        this.f107200b = str2;
        this.f107201c = list;
    }

    public final List<String> a() {
        return this.f107201c;
    }

    public final String b() {
        return this.f107200b;
    }

    public final String c() {
        return this.f107199a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f107199a, eVar.f107199a) && C17542s.e(this.f107200b, eVar.f107200b) && C17542s.e(this.f107201c, eVar.f107201c);
    }

    public int hashCode() {
        int hashCode = this.f107199a.hashCode() * 31;
        String str = this.f107200b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f107201c.hashCode();
    }

    public String toString() {
        String str = this.f107199a;
        String str2 = this.f107200b;
        List<String> list = this.f107201c;
        return "CollapsedContainerDelegateModel(title=" + str + ", key=" + str2 + ", items=" + list + ")";
    }
}
