package Mi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u000e¨\u0006 "}, d2 = {"LMi/h;", "", "", "totalResult", "LMi/a;", "availableSorting", "", "LMi/j;", "reviews", "", "sortedBy", "<init>", "(ILMi/a;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getTotalResult", "b", "LMi/a;", "()LMi/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/String;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mi.h  reason: case insensitive filesystem */
public final class C10773h {

    /* renamed from: a  reason: collision with root package name */
    private final int f83396a;

    /* renamed from: b  reason: collision with root package name */
    private final C10766a f83397b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C10775j> f83398c;

    /* renamed from: d  reason: collision with root package name */
    private final String f83399d;

    public C10773h(int i10, C10766a aVar, List<C10775j> list, String str) {
        C17542s.j(aVar, "availableSorting");
        C17542s.j(list, "reviews");
        C17542s.j(str, "sortedBy");
        this.f83396a = i10;
        this.f83397b = aVar;
        this.f83398c = list;
        this.f83399d = str;
    }

    public final C10766a a() {
        return this.f83397b;
    }

    public final List<C10775j> b() {
        return this.f83398c;
    }

    public final String c() {
        return this.f83399d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10773h)) {
            return false;
        }
        C10773h hVar = (C10773h) obj;
        return this.f83396a == hVar.f83396a && C17542s.e(this.f83397b, hVar.f83397b) && C17542s.e(this.f83398c, hVar.f83398c) && C17542s.e(this.f83399d, hVar.f83399d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f83396a) * 31) + this.f83397b.hashCode()) * 31) + this.f83398c.hashCode()) * 31) + this.f83399d.hashCode();
    }

    public String toString() {
        int i10 = this.f83396a;
        C10766a aVar = this.f83397b;
        List<C10775j> list = this.f83398c;
        String str = this.f83399d;
        return "ProductReviews(totalResult=" + i10 + ", availableSorting=" + aVar + ", reviews=" + list + ", sortedBy=" + str + ")";
    }
}
