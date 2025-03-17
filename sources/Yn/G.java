package Yn;

import Nn.C10800c;
import Nn.O;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lo.j;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012$\u0010\f\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00040\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R5\u0010\f\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b(\u0010#R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b,\u0010'R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b0\u0010/R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b \u0010#R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b+\u0010/¨\u00061"}, d2 = {"LYn/G;", "", "Lkotlin/Function1;", "", "LXH/N;", "onDeliveryItemsClicked", "Lkotlin/Function2;", "", "onChangePickupPointClicked", "Lkotlin/Function3;", "", "LNn/c;", "onCapabilityCheckChanged", "onCapabilityQuestionClicked", "LNn/O;", "onChangeTimeSlotClicked", "Lkotlin/Function0;", "onConfirmDeliveryClicked", "onCompareDeliveryPricesClicked", "Llo/j;", "onAddToCalendarClicked", "onChangeDeliveryMethodClicked", "<init>", "(LnI/l;LnI/p;LnI/q;LnI/l;LnI/p;LnI/a;LnI/a;LnI/l;LnI/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/l;", "i", "()LnI/l;", "b", "LnI/p;", "e", "()LnI/p;", "c", "LnI/q;", "()LnI/q;", "d", "f", "LnI/a;", "h", "()LnI/a;", "g", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<String, C16807N> f89341a;

    /* renamed from: b  reason: collision with root package name */
    private final p<String, Integer, C16807N> f89342b;

    /* renamed from: c  reason: collision with root package name */
    private final q<String, String, List<C10800c>, C16807N> f89343c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<C10800c, C16807N> f89344d;

    /* renamed from: e  reason: collision with root package name */
    private final p<String, O, C16807N> f89345e;

    /* renamed from: f  reason: collision with root package name */
    private final C17631a<C16807N> f89346f;

    /* renamed from: g  reason: collision with root package name */
    private final C17631a<C16807N> f89347g;

    /* renamed from: h  reason: collision with root package name */
    private final C17642l<j, C16807N> f89348h;

    /* renamed from: i  reason: collision with root package name */
    private final C17631a<C16807N> f89349i;

    public G(C17642l<? super String, C16807N> lVar, p<? super String, ? super Integer, C16807N> pVar, q<? super String, ? super String, ? super List<C10800c>, C16807N> qVar, C17642l<? super C10800c, C16807N> lVar2, p<? super String, ? super O, C16807N> pVar2, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17642l<? super j, C16807N> lVar3, C17631a<C16807N> aVar3) {
        C17542s.j(lVar, "onDeliveryItemsClicked");
        C17542s.j(pVar, "onChangePickupPointClicked");
        C17542s.j(qVar, "onCapabilityCheckChanged");
        C17542s.j(lVar2, "onCapabilityQuestionClicked");
        C17542s.j(pVar2, "onChangeTimeSlotClicked");
        C17542s.j(aVar, "onConfirmDeliveryClicked");
        C17542s.j(aVar2, "onCompareDeliveryPricesClicked");
        C17542s.j(lVar3, "onAddToCalendarClicked");
        C17542s.j(aVar3, "onChangeDeliveryMethodClicked");
        this.f89341a = lVar;
        this.f89342b = pVar;
        this.f89343c = qVar;
        this.f89344d = lVar2;
        this.f89345e = pVar2;
        this.f89346f = aVar;
        this.f89347g = aVar2;
        this.f89348h = lVar3;
        this.f89349i = aVar3;
    }

    public final C17642l<j, C16807N> a() {
        return this.f89348h;
    }

    public final q<String, String, List<C10800c>, C16807N> b() {
        return this.f89343c;
    }

    public final C17642l<C10800c, C16807N> c() {
        return this.f89344d;
    }

    public final C17631a<C16807N> d() {
        return this.f89349i;
    }

    public final p<String, Integer, C16807N> e() {
        return this.f89342b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return C17542s.e(this.f89341a, g10.f89341a) && C17542s.e(this.f89342b, g10.f89342b) && C17542s.e(this.f89343c, g10.f89343c) && C17542s.e(this.f89344d, g10.f89344d) && C17542s.e(this.f89345e, g10.f89345e) && C17542s.e(this.f89346f, g10.f89346f) && C17542s.e(this.f89347g, g10.f89347g) && C17542s.e(this.f89348h, g10.f89348h) && C17542s.e(this.f89349i, g10.f89349i);
    }

    public final p<String, O, C16807N> f() {
        return this.f89345e;
    }

    public final C17631a<C16807N> g() {
        return this.f89347g;
    }

    public final C17631a<C16807N> h() {
        return this.f89346f;
    }

    public int hashCode() {
        return (((((((((((((((this.f89341a.hashCode() * 31) + this.f89342b.hashCode()) * 31) + this.f89343c.hashCode()) * 31) + this.f89344d.hashCode()) * 31) + this.f89345e.hashCode()) * 31) + this.f89346f.hashCode()) * 31) + this.f89347g.hashCode()) * 31) + this.f89348h.hashCode()) * 31) + this.f89349i.hashCode();
    }

    public final C17642l<String, C16807N> i() {
        return this.f89341a;
    }

    public String toString() {
        C17642l<String, C16807N> lVar = this.f89341a;
        p<String, Integer, C16807N> pVar = this.f89342b;
        q<String, String, List<C10800c>, C16807N> qVar = this.f89343c;
        C17642l<C10800c, C16807N> lVar2 = this.f89344d;
        p<String, O, C16807N> pVar2 = this.f89345e;
        C17631a<C16807N> aVar = this.f89346f;
        C17631a<C16807N> aVar2 = this.f89347g;
        C17642l<j, C16807N> lVar3 = this.f89348h;
        C17631a<C16807N> aVar3 = this.f89349i;
        return "DeliveryDetailsContentCallbacks(onDeliveryItemsClicked=" + lVar + ", onChangePickupPointClicked=" + pVar + ", onCapabilityCheckChanged=" + qVar + ", onCapabilityQuestionClicked=" + lVar2 + ", onChangeTimeSlotClicked=" + pVar2 + ", onConfirmDeliveryClicked=" + aVar + ", onCompareDeliveryPricesClicked=" + aVar2 + ", onAddToCalendarClicked=" + lVar3 + ", onChangeDeliveryMethodClicked=" + aVar3 + ")";
    }
}
