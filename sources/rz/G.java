package rz;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001b\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\"\u0010%¨\u0006)"}, d2 = {"Lrz/G;", "", "Lrz/p;", "familySavingsCard", "Lrz/H;", "total", "", "Lrz/L;", "skippedBarcodes", "Lrz/M;", "skippedCoupons", "Lrz/F;", "discounts", "Lrz/z;", "productItems", "<init>", "(Lrz/p;Lrz/H;Ljava/util/List;Ljava/util/List;Lrz/F;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/p;", "b", "()Lrz/p;", "Lrz/H;", "f", "()Lrz/H;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "Lrz/F;", "()Lrz/F;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final C15023p f130726a;

    /* renamed from: b  reason: collision with root package name */
    private final H f130727b;

    /* renamed from: c  reason: collision with root package name */
    private final List<L> f130728c;

    /* renamed from: d  reason: collision with root package name */
    private final List<M> f130729d;

    /* renamed from: e  reason: collision with root package name */
    private final F f130730e;

    /* renamed from: f  reason: collision with root package name */
    private final List<C15032z> f130731f;

    public G(C15023p pVar, H h10, List<L> list, List<M> list2, F f10, List<C15032z> list3) {
        C17542s.j(pVar, "familySavingsCard");
        C17542s.j(h10, "total");
        C17542s.j(list, "skippedBarcodes");
        C17542s.j(list2, "skippedCoupons");
        C17542s.j(f10, "discounts");
        C17542s.j(list3, "productItems");
        this.f130726a = pVar;
        this.f130727b = h10;
        this.f130728c = list;
        this.f130729d = list2;
        this.f130730e = f10;
        this.f130731f = list3;
    }

    public final F a() {
        return this.f130730e;
    }

    public final C15023p b() {
        return this.f130726a;
    }

    public final List<C15032z> c() {
        return this.f130731f;
    }

    public final List<L> d() {
        return this.f130728c;
    }

    public final List<M> e() {
        return this.f130729d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return C17542s.e(this.f130726a, g10.f130726a) && C17542s.e(this.f130727b, g10.f130727b) && C17542s.e(this.f130728c, g10.f130728c) && C17542s.e(this.f130729d, g10.f130729d) && C17542s.e(this.f130730e, g10.f130730e) && C17542s.e(this.f130731f, g10.f130731f);
    }

    public final H f() {
        return this.f130727b;
    }

    public int hashCode() {
        return (((((((((this.f130726a.hashCode() * 31) + this.f130727b.hashCode()) * 31) + this.f130728c.hashCode()) * 31) + this.f130729d.hashCode()) * 31) + this.f130730e.hashCode()) * 31) + this.f130731f.hashCode();
    }

    public String toString() {
        C15023p pVar = this.f130726a;
        H h10 = this.f130727b;
        List<L> list = this.f130728c;
        List<M> list2 = this.f130729d;
        F f10 = this.f130730e;
        List<C15032z> list3 = this.f130731f;
        return "ScanAndGoOrder(familySavingsCard=" + pVar + ", total=" + h10 + ", skippedBarcodes=" + list + ", skippedCoupons=" + list2 + ", discounts=" + f10 + ", productItems=" + list3 + ")";
    }
}
