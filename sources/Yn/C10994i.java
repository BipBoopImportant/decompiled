package Yn;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"LYn/i;", "", "", "title", "", "details", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Yn.i  reason: case insensitive filesystem */
public final class C10994i {

    /* renamed from: a  reason: collision with root package name */
    private final String f89453a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f89454b;

    public C10994i(String str, List<String> list) {
        C17542s.j(str, "title");
        C17542s.j(list, "details");
        this.f89453a = str;
        this.f89454b = list;
    }

    public final List<String> a() {
        return this.f89454b;
    }

    public final String b() {
        return this.f89453a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10994i)) {
            return false;
        }
        C10994i iVar = (C10994i) obj;
        return C17542s.e(this.f89453a, iVar.f89453a) && C17542s.e(this.f89454b, iVar.f89454b);
    }

    public int hashCode() {
        return (this.f89453a.hashCode() * 31) + this.f89454b.hashCode();
    }

    public String toString() {
        String str = this.f89453a;
        List<String> list = this.f89454b;
        return "CollapsedUserDetailsUiState(title=" + str + ", details=" + list + ")";
    }
}
