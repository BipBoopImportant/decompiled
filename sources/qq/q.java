package Qq;

import com.ingka.ikea.core.model.Image;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LQq/q;", "LQq/h;", "", "id", "title", "Lcom/ingka/ikea/core/model/Image;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "g", "c", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "", "d", "J", "f", "()J", "stableId", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends h {

    /* renamed from: a  reason: collision with root package name */
    private final String f86200a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86201b;

    /* renamed from: c  reason: collision with root package name */
    private final Image f86202c;

    /* renamed from: d  reason: collision with root package name */
    private final long f86203d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(String str, String str2, Image image) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "id");
        C17542s.j(str2, "title");
        this.f86200a = str;
        this.f86201b = str2;
        this.f86202c = image;
        U u10 = new U(3);
        u10.a(P.b(q.class));
        u10.a(str);
        u10.b(new Object[0]);
        this.f86203d = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return C17542s.e(this.f86200a, qVar.f86200a) && C17542s.e(this.f86201b, qVar.f86201b) && C17542s.e(this.f86202c, qVar.f86202c);
    }

    public long f() {
        return this.f86203d;
    }

    public final String g() {
        return this.f86201b;
    }

    public int hashCode() {
        int hashCode = ((this.f86200a.hashCode() * 31) + this.f86201b.hashCode()) * 31;
        Image image = this.f86202c;
        return hashCode + (image == null ? 0 : image.hashCode());
    }

    public final Image k() {
        return this.f86202c;
    }

    public String toString() {
        String str = this.f86200a;
        String str2 = this.f86201b;
        Image image = this.f86202c;
        return "PromotedInteraction(id=" + str + ", title=" + str2 + ", image=" + image + ")";
    }
}
