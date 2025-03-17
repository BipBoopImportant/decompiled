package SC;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"LSC/y1;", "", "", "iconResource", "", "contentDescription", "Lkotlin/Function0;", "LXH/N;", "action", "<init>", "(ILjava/lang/String;LnI/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "LnI/a;", "()LnI/a;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.y1  reason: case insensitive filesystem */
public final class C13660y1 {

    /* renamed from: a  reason: collision with root package name */
    private final int f116501a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116502b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<C16807N> f116503c;

    public C13660y1(int i10, String str, C17631a<C16807N> aVar) {
        C17542s.j(aVar, "action");
        this.f116501a = i10;
        this.f116502b = str;
        this.f116503c = aVar;
    }

    public final C17631a<C16807N> a() {
        return this.f116503c;
    }

    public final String b() {
        return this.f116502b;
    }

    public final int c() {
        return this.f116501a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13660y1)) {
            return false;
        }
        C13660y1 y1Var = (C13660y1) obj;
        return this.f116501a == y1Var.f116501a && C17542s.e(this.f116502b, y1Var.f116502b) && C17542s.e(this.f116503c, y1Var.f116503c);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f116501a) * 31;
        String str = this.f116502b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f116503c.hashCode();
    }

    public String toString() {
        int i10 = this.f116501a;
        String str = this.f116502b;
        C17631a<C16807N> aVar = this.f116503c;
        return "SkapaModalHeaderAction(iconResource=" + i10 + ", contentDescription=" + str + ", action=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13660y1(int i10, String str, C17631a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, aVar);
    }
}
