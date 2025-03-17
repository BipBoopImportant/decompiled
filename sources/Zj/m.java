package zj;

import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zj.C12527h;
import zj.k;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lzj/m;", "", "", "isLoading", "Lzj/k;", "error", "Lzj/j;", "data", "Lzj/h;", "navigateTo", "<init>", "(ZLzj/k;Lzj/j;Lzj/h;)V", "a", "(ZLzj/k;Lzj/j;Lzj/h;)Lzj/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Lzj/k;", "d", "()Lzj/k;", "c", "Lzj/j;", "()Lzj/j;", "Lzj/h;", "e", "()Lzj/h;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f107408a;

    /* renamed from: b  reason: collision with root package name */
    private final k f107409b;

    /* renamed from: c  reason: collision with root package name */
    private final j f107410c;

    /* renamed from: d  reason: collision with root package name */
    private final C12527h f107411d;

    public m() {
        this(false, (k) null, (j) null, (C12527h) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ m b(m mVar, boolean z10, k kVar, j jVar, C12527h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = mVar.f107408a;
        }
        if ((i10 & 2) != 0) {
            kVar = mVar.f107409b;
        }
        if ((i10 & 4) != 0) {
            jVar = mVar.f107410c;
        }
        if ((i10 & 8) != 0) {
            hVar = mVar.f107411d;
        }
        return mVar.a(z10, kVar, jVar, hVar);
    }

    public final m a(boolean z10, k kVar, j jVar, C12527h hVar) {
        C17542s.j(kVar, UiComponentContainer.RESULT_ERROR);
        C17542s.j(hVar, "navigateTo");
        return new m(z10, kVar, jVar, hVar);
    }

    public final j c() {
        return this.f107410c;
    }

    public final k d() {
        return this.f107409b;
    }

    public final C12527h e() {
        return this.f107411d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f107408a == mVar.f107408a && C17542s.e(this.f107409b, mVar.f107409b) && C17542s.e(this.f107410c, mVar.f107410c) && C17542s.e(this.f107411d, mVar.f107411d);
    }

    public final boolean f() {
        return this.f107408a;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f107408a) * 31) + this.f107409b.hashCode()) * 31;
        j jVar = this.f107410c;
        return ((hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + this.f107411d.hashCode();
    }

    public String toString() {
        boolean z10 = this.f107408a;
        k kVar = this.f107409b;
        j jVar = this.f107410c;
        C12527h hVar = this.f107411d;
        return "ViewModelState(isLoading=" + z10 + ", error=" + kVar + ", data=" + jVar + ", navigateTo=" + hVar + ")";
    }

    public m(boolean z10, k kVar, j jVar, C12527h hVar) {
        C17542s.j(kVar, UiComponentContainer.RESULT_ERROR);
        C17542s.j(hVar, "navigateTo");
        this.f107408a = z10;
        this.f107409b = kVar;
        this.f107410c = jVar;
        this.f107411d = hVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(boolean z10, k kVar, j jVar, C12527h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? k.b.f107403a : kVar, (i10 & 4) != 0 ? null : jVar, (i10 & 8) != 0 ? C12527h.b.f107390a : hVar);
    }
}
