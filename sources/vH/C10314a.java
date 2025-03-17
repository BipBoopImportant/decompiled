package vh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lvh/a;", "", "", "", "addressLines", "city", "zipCode", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.a  reason: case insensitive filesystem */
public final class C10314a {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f77331a;

    /* renamed from: b  reason: collision with root package name */
    private final String f77332b;

    /* renamed from: c  reason: collision with root package name */
    private final String f77333c;

    public C10314a(List<String> list, String str, String str2) {
        C17542s.j(list, "addressLines");
        C17542s.j(str, "city");
        C17542s.j(str2, "zipCode");
        this.f77331a = list;
        this.f77332b = str;
        this.f77333c = str2;
    }

    public final List<String> a() {
        return this.f77331a;
    }

    public final String b() {
        return this.f77332b;
    }

    public final String c() {
        return this.f77333c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10314a)) {
            return false;
        }
        C10314a aVar = (C10314a) obj;
        return C17542s.e(this.f77331a, aVar.f77331a) && C17542s.e(this.f77332b, aVar.f77332b) && C17542s.e(this.f77333c, aVar.f77333c);
    }

    public int hashCode() {
        return (((this.f77331a.hashCode() * 31) + this.f77332b.hashCode()) * 31) + this.f77333c.hashCode();
    }

    public String toString() {
        List<String> list = this.f77331a;
        String str = this.f77332b;
        String str2 = this.f77333c;
        return "AddressFragment(addressLines=" + list + ", city=" + str + ", zipCode=" + str2 + ")";
    }
}
