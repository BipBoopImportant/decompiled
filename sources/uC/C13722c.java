package UC;

import G1.C4507j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import p1.C5747v0;
import r0.k;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"LUC/c;", "Ln0/I;", "Lp1/v0;", "focusColorInner", "focusColorOuter", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lr0/k;", "interactionSource", "LG1/j;", "a", "(Lr0/k;)LG1/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "b", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UC.c  reason: case insensitive filesystem */
final class C13722c implements C5586I {

    /* renamed from: a  reason: collision with root package name */
    private final long f117004a;

    /* renamed from: b  reason: collision with root package name */
    private final long f117005b;

    public /* synthetic */ C13722c(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public C4507j a(k kVar) {
        C17542s.j(kVar, "interactionSource");
        return new C13720a(kVar, this.f117004a, this.f117005b, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13722c)) {
            return false;
        }
        C13722c cVar = (C13722c) obj;
        return C5747v0.q(this.f117004a, cVar.f117004a) && C5747v0.q(this.f117005b, cVar.f117005b);
    }

    public int hashCode() {
        return (C5747v0.w(this.f117004a) * 31) + C5747v0.w(this.f117005b);
    }

    public String toString() {
        String x10 = C5747v0.x(this.f117004a);
        String x11 = C5747v0.x(this.f117005b);
        return "SkapaFocusIndicationNodeFactory(focusColorInner=" + x10 + ", focusColorOuter=" + x11 + ")";
    }

    private C13722c(long j10, long j11) {
        this.f117004a = j10;
        this.f117005b = j11;
    }
}
