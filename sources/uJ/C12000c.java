package uj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0017\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0019"}, d2 = {"Luj/c;", "Luj/a;", "", "titleRes", "bodyRes", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "()Z", "hasTitle", "hasBody", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uj.c  reason: case insensitive filesystem */
public final class C12000c implements C11998a {

    /* renamed from: a  reason: collision with root package name */
    private final int f103418a;

    /* renamed from: b  reason: collision with root package name */
    private final int f103419b;

    public C12000c() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public final int a() {
        return this.f103419b;
    }

    public final boolean b() {
        return this.f103419b != 0;
    }

    public final boolean c() {
        return this.f103418a != 0;
    }

    public final int d() {
        return this.f103418a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12000c)) {
            return false;
        }
        C12000c cVar = (C12000c) obj;
        return this.f103418a == cVar.f103418a && this.f103419b == cVar.f103419b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f103418a) * 31) + Integer.hashCode(this.f103419b);
    }

    public String toString() {
        int i10 = this.f103418a;
        int i11 = this.f103419b;
        return "HelpContentText(titleRes=" + i10 + ", bodyRes=" + i11 + ")";
    }

    public C12000c(int i10, int i11) {
        this.f103418a = i10;
        this.f103419b = i11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12000c(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
