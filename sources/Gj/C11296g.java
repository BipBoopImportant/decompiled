package gj;

import Sy.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lgj/g;", "", "", "coupon", "LSy/a$a;", "scanType", "<init>", "(Ljava/lang/String;LSy/a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LSy/a$a;", "()LSy/a$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gj.g  reason: case insensitive filesystem */
public final class C11296g {

    /* renamed from: a  reason: collision with root package name */
    private final String f97546a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C2850a f97547b;

    public C11296g(String str, a.C2850a aVar) {
        C17542s.j(aVar, "scanType");
        this.f97546a = str;
        this.f97547b = aVar;
    }

    public final String a() {
        return this.f97546a;
    }

    public final a.C2850a b() {
        return this.f97547b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11296g)) {
            return false;
        }
        C11296g gVar = (C11296g) obj;
        return C17542s.e(this.f97546a, gVar.f97546a) && C17542s.e(this.f97547b, gVar.f97547b);
    }

    public int hashCode() {
        String str = this.f97546a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f97547b.hashCode();
    }

    public String toString() {
        String str = this.f97546a;
        a.C2850a aVar = this.f97547b;
        return "ScannerCouponResult(coupon=" + str + ", scanType=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11296g(String str, a.C2850a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, aVar);
    }
}
