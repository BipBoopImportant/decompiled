package zr;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mp.C11588a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzr/e;", "Lzr/b;", "", "Lmp/a;", "inspiration", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final List<C11588a> f107576a;

    public e(List<C11588a> list) {
        C17542s.j(list, "inspiration");
        this.f107576a = list;
    }

    public final List<C11588a> a() {
        return this.f107576a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && C17542s.e(this.f107576a, ((e) obj).f107576a);
    }

    public int hashCode() {
        return this.f107576a.hashCode();
    }

    public String toString() {
        List<C11588a> list = this.f107576a;
        return "OnlyInspirationListFeed(inspiration=" + list + ")";
    }
}
