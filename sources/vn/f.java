package vn;

import com.ingka.ikea.browseandsearch.plp.datalayer.model.InjectablePriority;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lvn/f;", "", "", "totalNumberOfProducts", "", "Lvn/c;", "sortOptions", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/model/InjectablePriority;", "injectablePriority", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "getInjectablePriority", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f105257a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f105258b;

    /* renamed from: c  reason: collision with root package name */
    private final List<InjectablePriority> f105259c;

    public f(int i10, List<c> list, List<? extends InjectablePriority> list2) {
        C17542s.j(list, "sortOptions");
        C17542s.j(list2, "injectablePriority");
        this.f105257a = i10;
        this.f105258b = list;
        this.f105259c = list2;
    }

    public final List<c> a() {
        return this.f105258b;
    }

    public final int b() {
        return this.f105257a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f105257a == fVar.f105257a && C17542s.e(this.f105258b, fVar.f105258b) && C17542s.e(this.f105259c, fVar.f105259c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f105257a) * 31) + this.f105258b.hashCode()) * 31) + this.f105259c.hashCode();
    }

    public String toString() {
        int i10 = this.f105257a;
        List<c> list = this.f105258b;
        List<InjectablePriority> list2 = this.f105259c;
        return "MetaInfo(totalNumberOfProducts=" + i10 + ", sortOptions=" + list + ", injectablePriority=" + list2 + ")";
    }
}
