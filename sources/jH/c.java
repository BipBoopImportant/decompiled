package Jh;

import hl.C11367a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"LJh/c;", "", "", "id", "Lhl/a;", "label", "value", "<init>", "(Ljava/lang/String;Lhl/a;Lhl/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lhl/a;", "()Lhl/a;", "c", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f61401a;

    /* renamed from: b  reason: collision with root package name */
    private final C11367a f61402b;

    /* renamed from: c  reason: collision with root package name */
    private final C11367a f61403c;

    public c(String str, C11367a aVar, C11367a aVar2) {
        C17542s.j(str, "id");
        C17542s.j(aVar, "label");
        C17542s.j(aVar2, "value");
        this.f61401a = str;
        this.f61402b = aVar;
        this.f61403c = aVar2;
    }

    public final C11367a a() {
        return this.f61402b;
    }

    public final C11367a b() {
        return this.f61403c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f61401a, cVar.f61401a) && C17542s.e(this.f61402b, cVar.f61402b) && C17542s.e(this.f61403c, cVar.f61403c);
    }

    public int hashCode() {
        return (((this.f61401a.hashCode() * 31) + this.f61402b.hashCode()) * 31) + this.f61403c.hashCode();
    }

    public String toString() {
        String str = this.f61401a;
        C11367a aVar = this.f61402b;
        C11367a aVar2 = this.f61403c;
        return "PoiTextRowModel(id=" + str + ", label=" + aVar + ", value=" + aVar2 + ")";
    }
}
