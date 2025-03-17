package It;

import It.C10739b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LIt/f;", "", "LIt/b;", "content", "LIt/e;", "oneTimeEffect", "<init>", "(LIt/b;LIt/e;)V", "a", "(LIt/b;LIt/e;)LIt/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LIt/b;", "c", "()LIt/b;", "b", "LIt/e;", "d", "()LIt/e;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: It.f  reason: case insensitive filesystem */
public final class C10743f {

    /* renamed from: a  reason: collision with root package name */
    private final C10739b f82307a;

    /* renamed from: b  reason: collision with root package name */
    private final C10742e f82308b;

    public C10743f() {
        this((C10739b) null, (C10742e) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C10743f b(C10743f fVar, C10739b bVar, C10742e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = fVar.f82307a;
        }
        if ((i10 & 2) != 0) {
            eVar = fVar.f82308b;
        }
        return fVar.a(bVar, eVar);
    }

    public final C10743f a(C10739b bVar, C10742e eVar) {
        C17542s.j(bVar, "content");
        return new C10743f(bVar, eVar);
    }

    public final C10739b c() {
        return this.f82307a;
    }

    public final C10742e d() {
        return this.f82308b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10743f)) {
            return false;
        }
        C10743f fVar = (C10743f) obj;
        return C17542s.e(this.f82307a, fVar.f82307a) && C17542s.e(this.f82308b, fVar.f82308b);
    }

    public int hashCode() {
        int hashCode = this.f82307a.hashCode() * 31;
        C10742e eVar = this.f82308b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        C10739b bVar = this.f82307a;
        C10742e eVar = this.f82308b;
        return "State(content=" + bVar + ", oneTimeEffect=" + eVar + ")";
    }

    public C10743f(C10739b bVar, C10742e eVar) {
        C17542s.j(bVar, "content");
        this.f82307a = bVar;
        this.f82308b = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10743f(C10739b bVar, C10742e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C10739b.a.f82301a : bVar, (i10 & 2) != 0 ? null : eVar);
    }
}
