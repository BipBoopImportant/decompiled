package BC;

import Dl.b;
import KJ.C15985a;
import KJ.C15987c;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15014g;
import uC.C15113a;
import uC.C15115c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJH\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"LBC/d;", "", "LKJ/c;", "LDl/b;", "thumbnails", "", "Lrz/g;", "cartItems", "LuC/a;", "timeslot", "LuC/c;", "selected", "<init>", "(LKJ/c;Ljava/util/List;LuC/a;LuC/c;)V", "a", "(LKJ/c;Ljava/util/List;LuC/a;LuC/c;)LBC/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LKJ/c;", "e", "()LKJ/c;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "LuC/a;", "f", "()LuC/a;", "d", "LuC/c;", "()LuC/c;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: BC.d  reason: case insensitive filesystem */
public final class C12614d {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<b> f107805a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C15014g> f107806b;

    /* renamed from: c  reason: collision with root package name */
    private final C15113a f107807c;

    /* renamed from: d  reason: collision with root package name */
    private final C15115c f107808d;

    public C12614d() {
        this((C15987c) null, (List) null, (C15113a) null, (C15115c) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C12614d b(C12614d dVar, C15987c<b> cVar, List<C15014g> list, C15113a aVar, C15115c cVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = dVar.f107805a;
        }
        if ((i10 & 2) != 0) {
            list = dVar.f107806b;
        }
        if ((i10 & 4) != 0) {
            aVar = dVar.f107807c;
        }
        if ((i10 & 8) != 0) {
            cVar2 = dVar.f107808d;
        }
        return dVar.a(cVar, list, aVar, cVar2);
    }

    public final C12614d a(C15987c<b> cVar, List<C15014g> list, C15113a aVar, C15115c cVar2) {
        C17542s.j(cVar, "thumbnails");
        C17542s.j(list, "cartItems");
        return new C12614d(cVar, list, aVar, cVar2);
    }

    public final List<C15014g> c() {
        return this.f107806b;
    }

    public final C15115c d() {
        return this.f107808d;
    }

    public final C15987c<b> e() {
        return this.f107805a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12614d)) {
            return false;
        }
        C12614d dVar = (C12614d) obj;
        return C17542s.e(this.f107805a, dVar.f107805a) && C17542s.e(this.f107806b, dVar.f107806b) && C17542s.e(this.f107807c, dVar.f107807c) && C17542s.e(this.f107808d, dVar.f107808d);
    }

    public final C15113a f() {
        return this.f107807c;
    }

    public int hashCode() {
        int hashCode = ((this.f107805a.hashCode() * 31) + this.f107806b.hashCode()) * 31;
        C15113a aVar = this.f107807c;
        int i10 = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C15115c cVar = this.f107808d;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        C15987c<b> cVar = this.f107805a;
        List<C15014g> list = this.f107806b;
        C15113a aVar = this.f107807c;
        C15115c cVar2 = this.f107808d;
        return "UiData(thumbnails=" + cVar + ", cartItems=" + list + ", timeslot=" + aVar + ", selected=" + cVar2 + ")";
    }

    public C12614d(C15987c<b> cVar, List<C15014g> list, C15113a aVar, C15115c cVar2) {
        C17542s.j(cVar, "thumbnails");
        C17542s.j(list, "cartItems");
        this.f107805a = cVar;
        this.f107806b = list;
        this.f107807c = aVar;
        this.f107808d = cVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12614d(C15987c cVar, List list, C15113a aVar, C15115c cVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C15985a.a() : cVar, (i10 & 2) != 0 ? C16877v.n() : list, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : cVar2);
    }
}
