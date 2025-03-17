package Hy;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import YH.C16877v;
import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"LHy/c;", "", "LIC/e;", "fullServeDialogTitle", "LKJ/c;", "Lcom/ingka/ikea/core/model/Image;", "images", "numberOfAdditionalProducts", "LHy/b;", "itemizedInformation", "<init>", "(LIC/e;LKJ/c;LIC/e;LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "LKJ/c;", "()LKJ/c;", "c", "d", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hy.c  reason: case insensitive filesystem */
public final class C13015c {

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f110848a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<Image> f110849b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f110850c;

    /* renamed from: d  reason: collision with root package name */
    private final C15987c<C13014b> f110851d;

    public C13015c() {
        this((C13023e) null, (C15987c) null, (C13023e) null, (C15987c) null, 15, (DefaultConstructorMarker) null);
    }

    public final C13023e a() {
        return this.f110848a;
    }

    public final C15987c<Image> b() {
        return this.f110849b;
    }

    public final C15987c<C13014b> c() {
        return this.f110851d;
    }

    public final C13023e d() {
        return this.f110850c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13015c)) {
            return false;
        }
        C13015c cVar = (C13015c) obj;
        return C17542s.e(this.f110848a, cVar.f110848a) && C17542s.e(this.f110849b, cVar.f110849b) && C17542s.e(this.f110850c, cVar.f110850c) && C17542s.e(this.f110851d, cVar.f110851d);
    }

    public int hashCode() {
        int hashCode = ((this.f110848a.hashCode() * 31) + this.f110849b.hashCode()) * 31;
        C13023e eVar = this.f110850c;
        return ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f110851d.hashCode();
    }

    public String toString() {
        C13023e eVar = this.f110848a;
        C15987c<Image> cVar = this.f110849b;
        C13023e eVar2 = this.f110850c;
        C15987c<C13014b> cVar2 = this.f110851d;
        return "UiData(fullServeDialogTitle=" + eVar + ", images=" + cVar + ", numberOfAdditionalProducts=" + eVar2 + ", itemizedInformation=" + cVar2 + ")";
    }

    public C13015c(C13023e eVar, C15987c<Image> cVar, C13023e eVar2, C15987c<C13014b> cVar2) {
        C17542s.j(eVar, "fullServeDialogTitle");
        C17542s.j(cVar, "images");
        C17542s.j(cVar2, "itemizedInformation");
        this.f110848a = eVar;
        this.f110849b = cVar;
        this.f110850c = eVar2;
        this.f110851d = cVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13015c(C13023e eVar, C15987c cVar, C13023e eVar2, C15987c cVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C13026h.c("") : eVar, (i10 & 2) != 0 ? C15985a.h(C16877v.n()) : cVar, (i10 & 4) != 0 ? null : eVar2, (i10 & 8) != 0 ? C15985a.h(C16877v.n()) : cVar2);
    }
}
