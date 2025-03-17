package iG;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"LiG/j;", "", "Lo1/g;", "originalPosition", "finalPosition", "<init>", "(Lo1/g;Lo1/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo1/g;", "b", "()Lo1/g;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iG.j  reason: case insensitive filesystem */
public final class C17353j {

    /* renamed from: a  reason: collision with root package name */
    private final C5667g f143483a;

    /* renamed from: b  reason: collision with root package name */
    private final C5667g f143484b;

    public /* synthetic */ C17353j(C5667g gVar, C5667g gVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, gVar2);
    }

    public final C5667g a() {
        return this.f143484b;
    }

    public final C5667g b() {
        return this.f143483a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17353j)) {
            return false;
        }
        C17353j jVar = (C17353j) obj;
        return C17542s.e(this.f143483a, jVar.f143483a) && C17542s.e(this.f143484b, jVar.f143484b);
    }

    public int hashCode() {
        C5667g gVar = this.f143483a;
        int i10 = 0;
        int o10 = (gVar == null ? 0 : C5667g.o(gVar.v())) * 31;
        C5667g gVar2 = this.f143484b;
        if (gVar2 != null) {
            i10 = C5667g.o(gVar2.v());
        }
        return o10 + i10;
    }

    public String toString() {
        C5667g gVar = this.f143483a;
        C5667g gVar2 = this.f143484b;
        return "SwapResult(originalPosition=" + gVar + ", finalPosition=" + gVar2 + ")";
    }

    private C17353j(C5667g gVar, C5667g gVar2) {
        this.f143483a = gVar;
        this.f143484b = gVar2;
    }
}
