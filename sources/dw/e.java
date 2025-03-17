package Dw;

import com.ingka.ikea.core.model.product.ProductItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\rB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"LDw/e;", "", "", "timeSlotId", "LDw/c;", "pickupStatus", "LDw/e$a;", "timeWindow", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "products", "<init>", "(Ljava/lang/String;LDw/c;LDw/e$a;Ljava/util/List;)V", "a", "(Ljava/lang/String;LDw/c;LDw/e$a;Ljava/util/List;)LDw/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "LDw/c;", "c", "()LDw/c;", "LDw/e$a;", "f", "()LDw/e$a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "ongoinginstoreordersrepository_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f109093a;

    /* renamed from: b  reason: collision with root package name */
    private final c f109094b;

    /* renamed from: c  reason: collision with root package name */
    private final a f109095c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ProductItem> f109096d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"LDw/e$a;", "", "", "startTime", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ongoinginstoreordersrepository_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f109097a;

        /* renamed from: b  reason: collision with root package name */
        private final String f109098b;

        public a(String str, String str2) {
            C17542s.j(str, "startTime");
            C17542s.j(str2, "endTime");
            this.f109097a = str;
            this.f109098b = str2;
        }

        public final String a() {
            return this.f109098b;
        }

        public final String b() {
            return this.f109097a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f109097a, aVar.f109097a) && C17542s.e(this.f109098b, aVar.f109098b);
        }

        public int hashCode() {
            return (this.f109097a.hashCode() * 31) + this.f109098b.hashCode();
        }

        public String toString() {
            String str = this.f109097a;
            String str2 = this.f109098b;
            return "TimeWindow(startTime=" + str + ", endTime=" + str2 + ")";
        }
    }

    public e(String str, c cVar, a aVar, List<ProductItem> list) {
        C17542s.j(str, "timeSlotId");
        C17542s.j(cVar, "pickupStatus");
        C17542s.j(aVar, "timeWindow");
        C17542s.j(list, "products");
        this.f109093a = str;
        this.f109094b = cVar;
        this.f109095c = aVar;
        this.f109096d = list;
    }

    public static /* synthetic */ e b(e eVar, String str, c cVar, a aVar, List<ProductItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eVar.f109093a;
        }
        if ((i10 & 2) != 0) {
            cVar = eVar.f109094b;
        }
        if ((i10 & 4) != 0) {
            aVar = eVar.f109095c;
        }
        if ((i10 & 8) != 0) {
            list = eVar.f109096d;
        }
        return eVar.a(str, cVar, aVar, list);
    }

    public final e a(String str, c cVar, a aVar, List<ProductItem> list) {
        C17542s.j(str, "timeSlotId");
        C17542s.j(cVar, "pickupStatus");
        C17542s.j(aVar, "timeWindow");
        C17542s.j(list, "products");
        return new e(str, cVar, aVar, list);
    }

    public final c c() {
        return this.f109094b;
    }

    public final List<ProductItem> d() {
        return this.f109096d;
    }

    public final String e() {
        return this.f109093a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f109093a, eVar.f109093a) && this.f109094b == eVar.f109094b && C17542s.e(this.f109095c, eVar.f109095c) && C17542s.e(this.f109096d, eVar.f109096d);
    }

    public final a f() {
        return this.f109095c;
    }

    public int hashCode() {
        return (((((this.f109093a.hashCode() * 31) + this.f109094b.hashCode()) * 31) + this.f109095c.hashCode()) * 31) + this.f109096d.hashCode();
    }

    public String toString() {
        String str = this.f109093a;
        c cVar = this.f109094b;
        a aVar = this.f109095c;
        List<ProductItem> list = this.f109096d;
        return "TimeSlot(timeSlotId=" + str + ", pickupStatus=" + cVar + ", timeWindow=" + aVar + ", products=" + list + ")";
    }
}
