package Mt;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"LMt/a;", "", "LIC/e;", "title", "description", "actionLabel", "detailsActionLabel", "LMm/a;", "benefit", "<init>", "(LIC/e;LIC/e;LIC/e;LIC/e;LMm/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "e", "()LIC/e;", "b", "c", "d", "LMm/a;", "()LMm/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f83737a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f83738b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f83739c;

    /* renamed from: d  reason: collision with root package name */
    private final C13023e f83740d;

    /* renamed from: e  reason: collision with root package name */
    private final Mm.a f83741e;

    public a(C13023e eVar, C13023e eVar2, C13023e eVar3, C13023e eVar4, Mm.a aVar) {
        C17542s.j(eVar, "title");
        C17542s.j(eVar2, "description");
        C17542s.j(eVar3, "actionLabel");
        C17542s.j(eVar4, "detailsActionLabel");
        C17542s.j(aVar, "benefit");
        this.f83737a = eVar;
        this.f83738b = eVar2;
        this.f83739c = eVar3;
        this.f83740d = eVar4;
        this.f83741e = aVar;
    }

    public final C13023e a() {
        return this.f83739c;
    }

    public final Mm.a b() {
        return this.f83741e;
    }

    public final C13023e c() {
        return this.f83738b;
    }

    public final C13023e d() {
        return this.f83740d;
    }

    public final C13023e e() {
        return this.f83737a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f83737a, aVar.f83737a) && C17542s.e(this.f83738b, aVar.f83738b) && C17542s.e(this.f83739c, aVar.f83739c) && C17542s.e(this.f83740d, aVar.f83740d) && C17542s.e(this.f83741e, aVar.f83741e);
    }

    public int hashCode() {
        return (((((((this.f83737a.hashCode() * 31) + this.f83738b.hashCode()) * 31) + this.f83739c.hashCode()) * 31) + this.f83740d.hashCode()) * 31) + this.f83741e.hashCode();
    }

    public String toString() {
        C13023e eVar = this.f83737a;
        C13023e eVar2 = this.f83738b;
        C13023e eVar3 = this.f83739c;
        C13023e eVar4 = this.f83740d;
        Mm.a aVar = this.f83741e;
        return "BeverageBenefitUiModel(title=" + eVar + ", description=" + eVar2 + ", actionLabel=" + eVar3 + ", detailsActionLabel=" + eVar4 + ", benefit=" + aVar + ")";
    }
}
