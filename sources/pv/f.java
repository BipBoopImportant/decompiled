package Pv;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tK.C18010a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"LPv/f;", "", "", "icon", "iconBackgroundColor", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f39492a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39493b;

    public f(int i10, int i11) {
        this.f39492a = i10;
        this.f39493b = i11;
    }

    public final int a() {
        return this.f39492a;
    }

    public final int b() {
        return this.f39493b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f39492a == fVar.f39492a && this.f39493b == fVar.f39493b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f39492a) * 31) + Integer.hashCode(this.f39493b);
    }

    public String toString() {
        int i10 = this.f39492a;
        int i11 = this.f39493b;
        return "ContextualCardIcon(icon=" + i10 + ", iconBackgroundColor=" + i11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? C18010a.f147425i : i11);
    }
}
