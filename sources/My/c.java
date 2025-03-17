package My;

import Jy.j;
import My.e;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15014g;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006!"}, d2 = {"LMy/c;", "", "LJy/j$a;", "sortByEnum", "LMy/e;", "inlineMessage", "", "Lrz/g;", "cartItems", "cartUiItems", "<init>", "(LJy/j$a;LMy/e;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJy/j$a;", "getSortByEnum", "()LJy/j$a;", "b", "LMy/e;", "c", "()LMy/e;", "Ljava/util/List;", "()Ljava/util/List;", "d", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final j.a f112099a;

    /* renamed from: b  reason: collision with root package name */
    private final e f112100b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C15014g> f112101c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Object> f112102d;

    public c() {
        this((j.a) null, (e) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public final List<C15014g> a() {
        return this.f112101c;
    }

    public final List<Object> b() {
        return this.f112102d;
    }

    public final e c() {
        return this.f112100b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f112099a == cVar.f112099a && C17542s.e(this.f112100b, cVar.f112100b) && C17542s.e(this.f112101c, cVar.f112101c) && C17542s.e(this.f112102d, cVar.f112102d);
    }

    public int hashCode() {
        return (((((this.f112099a.hashCode() * 31) + this.f112100b.hashCode()) * 31) + this.f112101c.hashCode()) * 31) + this.f112102d.hashCode();
    }

    public String toString() {
        j.a aVar = this.f112099a;
        e eVar = this.f112100b;
        List<C15014g> list = this.f112101c;
        List<Object> list2 = this.f112102d;
        return "CartContent(sortByEnum=" + aVar + ", inlineMessage=" + eVar + ", cartItems=" + list + ", cartUiItems=" + list2 + ")";
    }

    public c(j.a aVar, e eVar, List<C15014g> list, List<? extends Object> list2) {
        C17542s.j(aVar, "sortByEnum");
        C17542s.j(eVar, "inlineMessage");
        C17542s.j(list, "cartItems");
        C17542s.j(list2, "cartUiItems");
        this.f112099a = aVar;
        this.f112100b = eVar;
        this.f112101c = list;
        this.f112102d = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(j.a aVar, e eVar, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? j.a.RECENTLY_ADDED : aVar, (i10 & 2) != 0 ? e.b.f112113a : eVar, (i10 & 4) != 0 ? C16877v.n() : list, (i10 & 8) != 0 ? C16877v.n() : list2);
    }
}
