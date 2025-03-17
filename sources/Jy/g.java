package Jy;

import Jy.o;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020#8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"LJy/g;", "LJy/o;", "LxB/a;", "LJy/o$b;", "header", "", "LJy/o$a;", "items", "", "totalPrice", "<init>", "(LJy/o$b;Ljava/util/List;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJy/o$b;", "g", "()LJy/o$b;", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "c", "D", "i", "()D", "", "d", "J", "f", "()J", "stableId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends o implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final o.b f111403a;

    /* renamed from: b  reason: collision with root package name */
    private final List<o.a> f111404b;

    /* renamed from: c  reason: collision with root package name */
    private final double f111405c;

    /* renamed from: d  reason: collision with root package name */
    private final long f111406d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(o.b bVar, List<? extends o.a> list, double d10) {
        super((DefaultConstructorMarker) null);
        C17542s.j(bVar, "header");
        C17542s.j(list, "items");
        this.f111403a = bVar;
        this.f111404b = list;
        this.f111405c = d10;
        U u10 = new U(3);
        u10.a(P.b(g.class));
        u10.a(bVar);
        u10.b(new Object[]{list});
        this.f111406d = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f111403a, gVar.f111403a) && C17542s.e(this.f111404b, gVar.f111404b) && Double.compare(this.f111405c, gVar.f111405c) == 0;
    }

    public long f() {
        return this.f111406d;
    }

    public final o.b g() {
        return this.f111403a;
    }

    public final List<o.a> h() {
        return this.f111404b;
    }

    public int hashCode() {
        return (((this.f111403a.hashCode() * 31) + this.f111404b.hashCode()) * 31) + Double.hashCode(this.f111405c);
    }

    public final double i() {
        return this.f111405c;
    }

    public String toString() {
        o.b bVar = this.f111403a;
        List<o.a> list = this.f111404b;
        double d10 = this.f111405c;
        return "CartItemSection(header=" + bVar + ", items=" + list + ", totalPrice=" + d10 + ")";
    }
}
