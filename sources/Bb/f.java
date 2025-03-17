package bB;

import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"LbB/f;", "", "", "id", "name", "", "LbB/e;", "items", "Ljava/time/Instant;", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/time/Instant;", "()Ljava/time/Instant;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f118908a;

    /* renamed from: b  reason: collision with root package name */
    private final String f118909b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f118910c;

    /* renamed from: d  reason: collision with root package name */
    private final Instant f118911d;

    public f(String str, String str2, List<e> list, Instant instant) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(list, "items");
        C17542s.j(instant, "updatedAt");
        this.f118908a = str;
        this.f118909b = str2;
        this.f118910c = list;
        this.f118911d = instant;
    }

    public final String a() {
        return this.f118908a;
    }

    public final List<e> b() {
        return this.f118910c;
    }

    public final String c() {
        return this.f118909b;
    }

    public final Instant d() {
        return this.f118911d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C17542s.e(this.f118908a, fVar.f118908a) && C17542s.e(this.f118909b, fVar.f118909b) && C17542s.e(this.f118910c, fVar.f118910c) && C17542s.e(this.f118911d, fVar.f118911d);
    }

    public int hashCode() {
        return (((((this.f118908a.hashCode() * 31) + this.f118909b.hashCode()) * 31) + this.f118910c.hashCode()) * 31) + this.f118911d.hashCode();
    }

    public String toString() {
        String str = this.f118908a;
        String str2 = this.f118909b;
        List<e> list = this.f118910c;
        Instant instant = this.f118911d;
        return "ShoppingListRemoteModel(id=" + str + ", name=" + str2 + ", items=" + list + ", updatedAt=" + instant + ")";
    }
}
