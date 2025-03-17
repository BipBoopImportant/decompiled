package iF;

import XH.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0018"}, d2 = {"LiF/r;", "", "", "iconResId", "LXH/v;", "imageResId", "<init>", "(Ljava/lang/Integer;LXH/v;)V", "a", "()Ljava/lang/Integer;", "", "isDarkMode", "b", "(Z)Ljava/lang/Integer;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "LXH/v;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f127725a;

    /* renamed from: b  reason: collision with root package name */
    private final v<Integer, Integer> f127726b;

    public r() {
        this((Integer) null, (v) null, 3, (DefaultConstructorMarker) null);
    }

    public final Integer a() {
        return this.f127725a;
    }

    public final Integer b(boolean z10) {
        v<Integer, Integer> vVar = this.f127726b;
        if (vVar == null) {
            return null;
        }
        int intValue = vVar.a().intValue();
        int intValue2 = vVar.b().intValue();
        if (z10) {
            intValue = intValue2;
        }
        return Integer.valueOf(intValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return C17542s.e(this.f127725a, rVar.f127725a) && C17542s.e(this.f127726b, rVar.f127726b);
    }

    public int hashCode() {
        Integer num = this.f127725a;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        v<Integer, Integer> vVar = this.f127726b;
        if (vVar != null) {
            i10 = vVar.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Integer num = this.f127725a;
        v<Integer, Integer> vVar = this.f127726b;
        return "ImageResource(iconResId=" + num + ", imageResId=" + vVar + ")";
    }

    public r(Integer num, v<Integer, Integer> vVar) {
        this.f127725a = num;
        this.f127726b = vVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Integer num, v vVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : vVar);
    }
}
