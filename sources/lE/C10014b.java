package le;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, d2 = {"Lle/b;", "", "", "id", "heightInDp", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getId", "b", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: le.b  reason: case insensitive filesystem */
public final class C10014b {

    /* renamed from: a  reason: collision with root package name */
    private final int f75217a;

    /* renamed from: b  reason: collision with root package name */
    private final int f75218b;

    public C10014b() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public final int a() {
        return this.f75218b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10014b)) {
            return false;
        }
        C10014b bVar = (C10014b) obj;
        return this.f75217a == bVar.f75217a && this.f75218b == bVar.f75218b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f75217a) * 31) + Integer.hashCode(this.f75218b);
    }

    public String toString() {
        int i10 = this.f75217a;
        int i11 = this.f75218b;
        return "LargeDividerDelegateModel(id=" + i10 + ", heightInDp=" + i11 + ")";
    }

    public C10014b(int i10, int i11) {
        this.f75217a = i10;
        this.f75218b = i11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10014b(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 48 : i11);
    }
}
