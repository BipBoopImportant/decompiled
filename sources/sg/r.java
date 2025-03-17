package sG;

import com.sugarcube.common.UiText;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, d2 = {"LsG/r;", "", "", "loading", "LsG/q;", "error", "Lcom/sugarcube/common/UiText;", "message", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase$a;", "cartItems", "<init>", "(ZLsG/q;Lcom/sugarcube/common/UiText;Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase$a;)V", "a", "(ZLsG/q;Lcom/sugarcube/common/UiText;Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase$a;)LsG/r;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "LsG/q;", "d", "()LsG/q;", "c", "Lcom/sugarcube/common/UiText;", "f", "()Lcom/sugarcube/common/UiText;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase$a;", "()Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase$a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f146966a;

    /* renamed from: b  reason: collision with root package name */
    private final q f146967b;

    /* renamed from: c  reason: collision with root package name */
    private final UiText f146968c;

    /* renamed from: d  reason: collision with root package name */
    private final CartUseCase.a f146969d;

    public r() {
        this(false, (q) null, (UiText) null, (CartUseCase.a) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ r b(r rVar, boolean z10, q qVar, UiText uiText, CartUseCase.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = rVar.f146966a;
        }
        if ((i10 & 2) != 0) {
            qVar = rVar.f146967b;
        }
        if ((i10 & 4) != 0) {
            uiText = rVar.f146968c;
        }
        if ((i10 & 8) != 0) {
            aVar = rVar.f146969d;
        }
        return rVar.a(z10, qVar, uiText, aVar);
    }

    public final r a(boolean z10, q qVar, UiText uiText, CartUseCase.a aVar) {
        return new r(z10, qVar, uiText, aVar);
    }

    public final CartUseCase.a c() {
        return this.f146969d;
    }

    public final q d() {
        return this.f146967b;
    }

    public final boolean e() {
        return this.f146966a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f146966a == rVar.f146966a && C17542s.e(this.f146967b, rVar.f146967b) && C17542s.e(this.f146968c, rVar.f146968c) && C17542s.e(this.f146969d, rVar.f146969d);
    }

    public final UiText f() {
        return this.f146968c;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f146966a) * 31;
        q qVar = this.f146967b;
        int i10 = 0;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        UiText uiText = this.f146968c;
        int hashCode3 = (hashCode2 + (uiText == null ? 0 : uiText.hashCode())) * 31;
        CartUseCase.a aVar = this.f146969d;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        boolean z10 = this.f146966a;
        q qVar = this.f146967b;
        UiText uiText = this.f146968c;
        CartUseCase.a aVar = this.f146969d;
        return "CartUIState(loading=" + z10 + ", error=" + qVar + ", message=" + uiText + ", cartItems=" + aVar + ")";
    }

    public r(boolean z10, q qVar, UiText uiText, CartUseCase.a aVar) {
        this.f146966a = z10;
        this.f146967b = qVar;
        this.f146968c = uiText;
        this.f146969d = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(boolean z10, q qVar, UiText uiText, CartUseCase.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : qVar, (i10 & 4) != 0 ? null : uiText, (i10 & 8) != 0 ? null : aVar);
    }
}
