package dy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Ldy/l;", "", "", "icon", "", "title", "", "Ldy/k;", "paragraphs", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "Ljava/util/List;", "()Ljava/util/List;", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dy.l  reason: case insensitive filesystem */
public final class C14357l {

    /* renamed from: a  reason: collision with root package name */
    private final int f126206a;

    /* renamed from: b  reason: collision with root package name */
    private final String f126207b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C14356k> f126208c;

    public C14357l(int i10, String str, List<? extends C14356k> list) {
        C17542s.j(str, "title");
        C17542s.j(list, "paragraphs");
        this.f126206a = i10;
        this.f126207b = str;
        this.f126208c = list;
    }

    public final int a() {
        return this.f126206a;
    }

    public final List<C14356k> b() {
        return this.f126208c;
    }

    public final String c() {
        return this.f126207b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14357l)) {
            return false;
        }
        C14357l lVar = (C14357l) obj;
        return this.f126206a == lVar.f126206a && C17542s.e(this.f126207b, lVar.f126207b) && C17542s.e(this.f126208c, lVar.f126208c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f126206a) * 31) + this.f126207b.hashCode()) * 31) + this.f126208c.hashCode();
    }

    public String toString() {
        int i10 = this.f126206a;
        String str = this.f126207b;
        List<C14356k> list = this.f126208c;
        return "ReassuranceItem(icon=" + i10 + ", title=" + str + ", paragraphs=" + list + ")";
    }
}
