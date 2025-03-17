package fw;

import cw.a;
import cw.b;
import cw.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lfw/c;", "", "", "Lcw/a;", "alertMessage", "Lcw/b;", "commercialMessage", "Lcw/f;", "whatsNewMessages", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f73036a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f73037b;

    /* renamed from: c  reason: collision with root package name */
    private final List<f> f73038c;

    public c(List<a> list, List<b> list2, List<f> list3) {
        C17542s.j(list, "alertMessage");
        C17542s.j(list2, "commercialMessage");
        C17542s.j(list3, "whatsNewMessages");
        this.f73036a = list;
        this.f73037b = list2;
        this.f73038c = list3;
    }

    public final List<a> a() {
        return this.f73036a;
    }

    public final List<b> b() {
        return this.f73037b;
    }

    public final List<f> c() {
        return this.f73038c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f73036a, cVar.f73036a) && C17542s.e(this.f73037b, cVar.f73037b) && C17542s.e(this.f73038c, cVar.f73038c);
    }

    public int hashCode() {
        return (((this.f73036a.hashCode() * 31) + this.f73037b.hashCode()) * 31) + this.f73038c.hashCode();
    }

    public String toString() {
        List<a> list = this.f73036a;
        List<b> list2 = this.f73037b;
        List<f> list3 = this.f73038c;
        return "Messages(alertMessage=" + list + ", commercialMessage=" + list2 + ", whatsNewMessages=" + list3 + ")";
    }
}
