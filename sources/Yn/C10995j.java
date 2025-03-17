package Yn;

import Nn.C10800c;
import Nn.O;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007\u0012$\u0010\f\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R5\u0010\f\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b%\u0010$R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b)\u0010 R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001d\u0010+R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b(\u0010+¨\u0006,"}, d2 = {"LYn/j;", "", "Lkotlin/Function2;", "", "", "LXH/N;", "onChangePickupPointClicked", "Lkotlin/Function1;", "onDeliveryItemsClicked", "Lkotlin/Function3;", "", "LNn/c;", "onCapabilityCheckChanged", "onCapabilityQuestionClicked", "LNn/O;", "onChangeTimeSlotClicked", "Lkotlin/Function0;", "onAddToCalendarClicked", "onChangeDeliveryMethodClicked", "<init>", "(LnI/p;LnI/l;LnI/q;LnI/l;LnI/p;LnI/a;LnI/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/p;", "e", "()LnI/p;", "b", "LnI/l;", "g", "()LnI/l;", "c", "LnI/q;", "()LnI/q;", "d", "f", "LnI/a;", "()LnI/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Yn.j  reason: case insensitive filesystem */
public final class C10995j {

    /* renamed from: a  reason: collision with root package name */
    private final p<String, Integer, C16807N> f89456a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<String, C16807N> f89457b;

    /* renamed from: c  reason: collision with root package name */
    private final q<String, String, List<C10800c>, C16807N> f89458c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<C10800c, C16807N> f89459d;

    /* renamed from: e  reason: collision with root package name */
    private final p<String, O, C16807N> f89460e;

    /* renamed from: f  reason: collision with root package name */
    private final C17631a<C16807N> f89461f;

    /* renamed from: g  reason: collision with root package name */
    private final C17631a<C16807N> f89462g;

    public C10995j(p<? super String, ? super Integer, C16807N> pVar, C17642l<? super String, C16807N> lVar, q<? super String, ? super String, ? super List<C10800c>, C16807N> qVar, C17642l<? super C10800c, C16807N> lVar2, p<? super String, ? super O, C16807N> pVar2, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        C17542s.j(pVar, "onChangePickupPointClicked");
        C17542s.j(lVar, "onDeliveryItemsClicked");
        C17542s.j(qVar, "onCapabilityCheckChanged");
        C17542s.j(lVar2, "onCapabilityQuestionClicked");
        C17542s.j(pVar2, "onChangeTimeSlotClicked");
        C17542s.j(aVar, "onAddToCalendarClicked");
        C17542s.j(aVar2, "onChangeDeliveryMethodClicked");
        this.f89456a = pVar;
        this.f89457b = lVar;
        this.f89458c = qVar;
        this.f89459d = lVar2;
        this.f89460e = pVar2;
        this.f89461f = aVar;
        this.f89462g = aVar2;
    }

    public final C17631a<C16807N> a() {
        return this.f89461f;
    }

    public final q<String, String, List<C10800c>, C16807N> b() {
        return this.f89458c;
    }

    public final C17642l<C10800c, C16807N> c() {
        return this.f89459d;
    }

    public final C17631a<C16807N> d() {
        return this.f89462g;
    }

    public final p<String, Integer, C16807N> e() {
        return this.f89456a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10995j)) {
            return false;
        }
        C10995j jVar = (C10995j) obj;
        return C17542s.e(this.f89456a, jVar.f89456a) && C17542s.e(this.f89457b, jVar.f89457b) && C17542s.e(this.f89458c, jVar.f89458c) && C17542s.e(this.f89459d, jVar.f89459d) && C17542s.e(this.f89460e, jVar.f89460e) && C17542s.e(this.f89461f, jVar.f89461f) && C17542s.e(this.f89462g, jVar.f89462g);
    }

    public final p<String, O, C16807N> f() {
        return this.f89460e;
    }

    public final C17642l<String, C16807N> g() {
        return this.f89457b;
    }

    public int hashCode() {
        return (((((((((((this.f89456a.hashCode() * 31) + this.f89457b.hashCode()) * 31) + this.f89458c.hashCode()) * 31) + this.f89459d.hashCode()) * 31) + this.f89460e.hashCode()) * 31) + this.f89461f.hashCode()) * 31) + this.f89462g.hashCode();
    }

    public String toString() {
        p<String, Integer, C16807N> pVar = this.f89456a;
        C17642l<String, C16807N> lVar = this.f89457b;
        q<String, String, List<C10800c>, C16807N> qVar = this.f89458c;
        C17642l<C10800c, C16807N> lVar2 = this.f89459d;
        p<String, O, C16807N> pVar2 = this.f89460e;
        C17631a<C16807N> aVar = this.f89461f;
        C17631a<C16807N> aVar2 = this.f89462g;
        return "DeliveryArrangementCallbacks(onChangePickupPointClicked=" + pVar + ", onDeliveryItemsClicked=" + lVar + ", onCapabilityCheckChanged=" + qVar + ", onCapabilityQuestionClicked=" + lVar2 + ", onChangeTimeSlotClicked=" + pVar2 + ", onAddToCalendarClicked=" + aVar + ", onChangeDeliveryMethodClicked=" + aVar2 + ")";
    }
}
