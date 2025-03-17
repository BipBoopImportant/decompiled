package zj;

import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zj.C12520a;
import zj.C12523d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lzj/f;", "", "", "isLoading", "Lzj/d;", "error", "Lzj/c;", "data", "Lzj/a;", "navigateTo", "<init>", "(ZLzj/d;Lzj/c;Lzj/a;)V", "a", "(ZLzj/d;Lzj/c;Lzj/a;)Lzj/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Lzj/d;", "d", "()Lzj/d;", "c", "Lzj/c;", "()Lzj/c;", "Lzj/a;", "e", "()Lzj/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zj.f  reason: case insensitive filesystem */
public final class C12525f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f107382a;

    /* renamed from: b  reason: collision with root package name */
    private final C12523d f107383b;

    /* renamed from: c  reason: collision with root package name */
    private final C12522c f107384c;

    /* renamed from: d  reason: collision with root package name */
    private final C12520a f107385d;

    public C12525f() {
        this(false, (C12523d) null, (C12522c) null, (C12520a) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C12525f b(C12525f fVar, boolean z10, C12523d dVar, C12522c cVar, C12520a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = fVar.f107382a;
        }
        if ((i10 & 2) != 0) {
            dVar = fVar.f107383b;
        }
        if ((i10 & 4) != 0) {
            cVar = fVar.f107384c;
        }
        if ((i10 & 8) != 0) {
            aVar = fVar.f107385d;
        }
        return fVar.a(z10, dVar, cVar, aVar);
    }

    public final C12525f a(boolean z10, C12523d dVar, C12522c cVar, C12520a aVar) {
        C17542s.j(dVar, UiComponentContainer.RESULT_ERROR);
        C17542s.j(aVar, "navigateTo");
        return new C12525f(z10, dVar, cVar, aVar);
    }

    public final C12522c c() {
        return this.f107384c;
    }

    public final C12523d d() {
        return this.f107383b;
    }

    public final C12520a e() {
        return this.f107385d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12525f)) {
            return false;
        }
        C12525f fVar = (C12525f) obj;
        return this.f107382a == fVar.f107382a && C17542s.e(this.f107383b, fVar.f107383b) && C17542s.e(this.f107384c, fVar.f107384c) && C17542s.e(this.f107385d, fVar.f107385d);
    }

    public final boolean f() {
        return this.f107382a;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f107382a) * 31) + this.f107383b.hashCode()) * 31;
        C12522c cVar = this.f107384c;
        return ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f107385d.hashCode();
    }

    public String toString() {
        boolean z10 = this.f107382a;
        C12523d dVar = this.f107383b;
        C12522c cVar = this.f107384c;
        C12520a aVar = this.f107385d;
        return "ViewModelState(isLoading=" + z10 + ", error=" + dVar + ", data=" + cVar + ", navigateTo=" + aVar + ")";
    }

    public C12525f(boolean z10, C12523d dVar, C12522c cVar, C12520a aVar) {
        C17542s.j(dVar, UiComponentContainer.RESULT_ERROR);
        C17542s.j(aVar, "navigateTo");
        this.f107382a = z10;
        this.f107383b = dVar;
        this.f107384c = cVar;
        this.f107385d = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12525f(boolean z10, C12523d dVar, C12522c cVar, C12520a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? C12523d.b.f107377a : dVar, (i10 & 4) != 0 ? null : cVar, (i10 & 8) != 0 ? C12520a.b.f107366a : aVar);
    }
}
