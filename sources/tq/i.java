package tq;

import KJ.C15987c;
import com.ingka.ikea.core.model.Media;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Ltq/i;", "", "", "selectedIndex", "LKJ/c;", "Lcom/ingka/ikea/core/model/Media;", "items", "<init>", "(Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LKJ/c;", "()LKJ/c;", "enlargeimages-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f103327a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<Media> f103328b;

    public i(String str, C15987c<? extends Media> cVar) {
        C17542s.j(str, "selectedIndex");
        C17542s.j(cVar, "items");
        this.f103327a = str;
        this.f103328b = cVar;
    }

    public final C15987c<Media> a() {
        return this.f103328b;
    }

    public final String b() {
        return this.f103327a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f103327a, iVar.f103327a) && C17542s.e(this.f103328b, iVar.f103328b);
    }

    public int hashCode() {
        return (this.f103327a.hashCode() * 31) + this.f103328b.hashCode();
    }

    public String toString() {
        String str = this.f103327a;
        C15987c<Media> cVar = this.f103328b;
        return "EnlargeImageUiState(selectedIndex=" + str + ", items=" + cVar + ")";
    }
}
