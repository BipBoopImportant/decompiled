package nq;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lnq/a;", "Lnq/d;", "Lnq/b;", "first", "second", "<init>", "(Lnq/b;Lnq/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnq/b;", "()Lnq/b;", "b", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nq.a  reason: case insensitive filesystem */
public final class C11665a extends C11668d {

    /* renamed from: a  reason: collision with root package name */
    private final C11666b f99979a;

    /* renamed from: b  reason: collision with root package name */
    private final C11666b f99980b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11665a(C11666b bVar, C11666b bVar2) {
        super((DefaultConstructorMarker) null);
        C17542s.j(bVar, "first");
        C17542s.j(bVar2, "second");
        this.f99979a = bVar;
        this.f99980b = bVar2;
    }

    public final C11666b a() {
        return this.f99979a;
    }

    public final C11666b b() {
        return this.f99980b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11665a)) {
            return false;
        }
        C11665a aVar = (C11665a) obj;
        return C17542s.e(this.f99979a, aVar.f99979a) && C17542s.e(this.f99980b, aVar.f99980b);
    }

    public int hashCode() {
        return (this.f99979a.hashCode() * 31) + this.f99980b.hashCode();
    }

    public String toString() {
        C11666b bVar = this.f99979a;
        C11666b bVar2 = this.f99980b;
        return "DualEnergyLabelModel(first=" + bVar + ", second=" + bVar2 + ")";
    }
}
