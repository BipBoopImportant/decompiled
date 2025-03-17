package Hj;

import EB.C12832d;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LHj/n;", "", "", "isKeepScannerRunning", "LEB/d;", "selectedStore", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;", "navigateTo", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;", "userMessage", "<init>", "(ZLEB/d;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;)V", "a", "(ZLEB/d;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;)LHj/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "LEB/d;", "d", "()LEB/d;", "c", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;", "e", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f81286a;

    /* renamed from: b  reason: collision with root package name */
    private final C12832d f81287b;

    /* renamed from: c  reason: collision with root package name */
    private final c f81288c;

    /* renamed from: d  reason: collision with root package name */
    private final e f81289d;

    public n() {
        this(false, (C12832d) null, (c) null, (e) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ n b(n nVar, boolean z10, C12832d dVar, c cVar, e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = nVar.f81286a;
        }
        if ((i10 & 2) != 0) {
            dVar = nVar.f81287b;
        }
        if ((i10 & 4) != 0) {
            cVar = nVar.f81288c;
        }
        if ((i10 & 8) != 0) {
            eVar = nVar.f81289d;
        }
        return nVar.a(z10, dVar, cVar, eVar);
    }

    public final n a(boolean z10, C12832d dVar, c cVar, e eVar) {
        return new n(z10, dVar, cVar, eVar);
    }

    public final c c() {
        return this.f81288c;
    }

    public final C12832d d() {
        return this.f81287b;
    }

    public final e e() {
        return this.f81289d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f81286a == nVar.f81286a && C17542s.e(this.f81287b, nVar.f81287b) && C17542s.e(this.f81288c, nVar.f81288c) && C17542s.e(this.f81289d, nVar.f81289d);
    }

    public final boolean f() {
        return this.f81286a;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f81286a) * 31;
        C12832d dVar = this.f81287b;
        int i10 = 0;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.f81288c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e eVar = this.f81289d;
        if (eVar != null) {
            i10 = eVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        boolean z10 = this.f81286a;
        C12832d dVar = this.f81287b;
        c cVar = this.f81288c;
        e eVar = this.f81289d;
        return "UiState(isKeepScannerRunning=" + z10 + ", selectedStore=" + dVar + ", navigateTo=" + cVar + ", userMessage=" + eVar + ")";
    }

    public n(boolean z10, C12832d dVar, c cVar, e eVar) {
        this.f81286a = z10;
        this.f81287b = dVar;
        this.f81288c = cVar;
        this.f81289d = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(boolean z10, C12832d dVar, c cVar, e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : dVar, (i10 & 4) != 0 ? null : cVar, (i10 & 8) != 0 ? null : eVar);
    }
}
