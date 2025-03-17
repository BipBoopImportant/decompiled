package f5;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf5/k;", "", "", "Lf5/a;", "displayFeatures", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/util/List;", "()Ljava/util/List;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final List<C7845a> f51163a;

    public k(List<? extends C7845a> list) {
        C17542s.j(list, "displayFeatures");
        this.f51163a = list;
    }

    public final List<C7845a> a() {
        return this.f51163a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!C17542s.e(k.class, obj.getClass())) {
            return false;
        }
        return C17542s.e(this.f51163a, ((k) obj).f51163a);
    }

    public int hashCode() {
        return this.f51163a.hashCode();
    }

    public String toString() {
        return C16877v.G0(this.f51163a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (C17642l) null, 56, (Object) null);
    }
}
