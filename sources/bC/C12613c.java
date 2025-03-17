package BC;

import KJ.C15987c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uC.C15113a;
import uC.C15115c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LBC/c;", "", "", "loading", "LBC/e;", "error", "LBC/d;", "data", "LBC/a;", "navigateTo", "<init>", "(ZLBC/e;LBC/d;LBC/a;)V", "a", "(ZLBC/e;LBC/d;LBC/a;)LBC/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "LBC/e;", "d", "()LBC/e;", "c", "LBC/d;", "()LBC/d;", "LBC/a;", "f", "()LBC/a;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: BC.c  reason: case insensitive filesystem */
public final class C12613c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f107801a;

    /* renamed from: b  reason: collision with root package name */
    private final C12615e f107802b;

    /* renamed from: c  reason: collision with root package name */
    private final C12614d f107803c;

    /* renamed from: d  reason: collision with root package name */
    private final C12611a f107804d;

    public C12613c() {
        this(false, (C12615e) null, (C12614d) null, (C12611a) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C12613c b(C12613c cVar, boolean z10, C12615e eVar, C12614d dVar, C12611a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = cVar.f107801a;
        }
        if ((i10 & 2) != 0) {
            eVar = cVar.f107802b;
        }
        if ((i10 & 4) != 0) {
            dVar = cVar.f107803c;
        }
        if ((i10 & 8) != 0) {
            aVar = cVar.f107804d;
        }
        return cVar.a(z10, eVar, dVar, aVar);
    }

    public final C12613c a(boolean z10, C12615e eVar, C12614d dVar, C12611a aVar) {
        C17542s.j(dVar, "data");
        return new C12613c(z10, eVar, dVar, aVar);
    }

    public final C12614d c() {
        return this.f107803c;
    }

    public final C12615e d() {
        return this.f107802b;
    }

    public final boolean e() {
        return this.f107801a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12613c)) {
            return false;
        }
        C12613c cVar = (C12613c) obj;
        return this.f107801a == cVar.f107801a && C17542s.e(this.f107802b, cVar.f107802b) && C17542s.e(this.f107803c, cVar.f107803c) && C17542s.e(this.f107804d, cVar.f107804d);
    }

    public final C12611a f() {
        return this.f107804d;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f107801a) * 31;
        C12615e eVar = this.f107802b;
        int i10 = 0;
        int hashCode2 = (((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f107803c.hashCode()) * 31;
        C12611a aVar = this.f107804d;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        boolean z10 = this.f107801a;
        C12615e eVar = this.f107802b;
        C12614d dVar = this.f107803c;
        C12611a aVar = this.f107804d;
        return "UiContent(loading=" + z10 + ", error=" + eVar + ", data=" + dVar + ", navigateTo=" + aVar + ")";
    }

    public C12613c(boolean z10, C12615e eVar, C12614d dVar, C12611a aVar) {
        C17542s.j(dVar, "data");
        this.f107801a = z10;
        this.f107802b = eVar;
        this.f107803c = dVar;
        this.f107804d = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12613c(boolean z10, C12615e eVar, C12614d dVar, C12611a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? new C12614d((C15987c) null, (List) null, (C15113a) null, (C15115c) null, 15, (DefaultConstructorMarker) null) : dVar, (i10 & 8) != 0 ? null : aVar);
    }
}
