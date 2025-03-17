package L1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"LL1/e;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "label", "Lkotlin/Function0;", "LnI/a;", "()LnI/a;", "action", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f8925a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<Boolean> f8926b;

    public final C17631a<Boolean> a() {
        return this.f8926b;
    }

    public final String b() {
        return this.f8925a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f8925a, eVar.f8925a) && this.f8926b == eVar.f8926b;
    }

    public int hashCode() {
        return (this.f8925a.hashCode() * 31) + this.f8926b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f8925a + ", action=" + this.f8926b + ')';
    }
}
