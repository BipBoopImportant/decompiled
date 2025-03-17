package qj;

import com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.b;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lqj/a;", "", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/b;", "content", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/c;", "navigateTo", "<init>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/b;Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/c;)V", "a", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/b;Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/c;)Lqj/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/b;", "c", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/b;", "b", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/c;", "d", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qj.a  reason: case insensitive filesystem */
public final class C11785a {

    /* renamed from: a  reason: collision with root package name */
    private final b f101402a;

    /* renamed from: b  reason: collision with root package name */
    private final c f101403b;

    public C11785a() {
        this((b) null, (c) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C11785a b(C11785a aVar, b bVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = aVar.f101402a;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f101403b;
        }
        return aVar.a(bVar, cVar);
    }

    public final C11785a a(b bVar, c cVar) {
        return new C11785a(bVar, cVar);
    }

    public final b c() {
        return this.f101402a;
    }

    public final c d() {
        return this.f101403b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11785a)) {
            return false;
        }
        C11785a aVar = (C11785a) obj;
        return C17542s.e(this.f101402a, aVar.f101402a) && C17542s.e(this.f101403b, aVar.f101403b);
    }

    public int hashCode() {
        b bVar = this.f101402a;
        int i10 = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        c cVar = this.f101403b;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        b bVar = this.f101402a;
        c cVar = this.f101403b;
        return "State(content=" + bVar + ", navigateTo=" + cVar + ")";
    }

    public C11785a(b bVar, c cVar) {
        this.f101402a = bVar;
        this.f101403b = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11785a(b bVar, c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : cVar);
    }
}
