package S1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LS1/H;", "LS1/m;", "LS1/T;", "typeface", "<init>", "(LS1/T;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "h", "LS1/T;", "q", "()LS1/T;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class H extends C4820m {

    /* renamed from: h  reason: collision with root package name */
    private final T f13341h;

    public H(T t10) {
        super(true, (DefaultConstructorMarker) null);
        this.f13341h = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && C17542s.e(this.f13341h, ((H) obj).f13341h);
    }

    public int hashCode() {
        return this.f13341h.hashCode();
    }

    public final T q() {
        return this.f13341h;
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f13341h + ')';
    }
}
