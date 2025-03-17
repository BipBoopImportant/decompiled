package Bh;

import M6.y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"LBh/b;", "", "", "languageCode", "LM6/y;", "storeId", "zip", "<init>", "(Ljava/lang/String;LM6/y;LM6/y;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LM6/y;", "()LM6/y;", "c", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f58923a;

    /* renamed from: b  reason: collision with root package name */
    private final y<String> f58924b;

    /* renamed from: c  reason: collision with root package name */
    private final y<String> f58925c;

    public b(String str, y<String> yVar, y<String> yVar2) {
        C17542s.j(str, "languageCode");
        C17542s.j(yVar, "storeId");
        C17542s.j(yVar2, "zip");
        this.f58923a = str;
        this.f58924b = yVar;
        this.f58925c = yVar2;
    }

    public final String a() {
        return this.f58923a;
    }

    public final y<String> b() {
        return this.f58924b;
    }

    public final y<String> c() {
        return this.f58925c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f58923a, bVar.f58923a) && C17542s.e(this.f58924b, bVar.f58924b) && C17542s.e(this.f58925c, bVar.f58925c);
    }

    public int hashCode() {
        return (((this.f58923a.hashCode() * 31) + this.f58924b.hashCode()) * 31) + this.f58925c.hashCode();
    }

    public String toString() {
        String str = this.f58923a;
        y<String> yVar = this.f58924b;
        y<String> yVar2 = this.f58925c;
        return "ItemPresentation(languageCode=" + str + ", storeId=" + yVar + ", zip=" + yVar2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, y yVar, y yVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? y.a.f38616b : yVar, (i10 & 4) != 0 ? y.a.f38616b : yVar2);
    }
}
