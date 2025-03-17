package pf;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lm.b;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001e"}, d2 = {"Lpf/a;", "", "Lkotlin/Function0;", "LXH/N;", "onClosedClicked", "onChangeStoreClicked", "onPrivacyPolicyClicked", "Lkotlin/Function2;", "Llm/b;", "", "getBackInStockErrorMessage", "<init>", "(LnI/a;LnI/a;LnI/a;LnI/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/a;", "c", "()LnI/a;", "b", "d", "LnI/p;", "()LnI/p;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pf.a  reason: case insensitive filesystem */
public final class C10138a {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<C16807N> f75853a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<C16807N> f75854b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<C16807N> f75855c;

    /* renamed from: d  reason: collision with root package name */
    private final p<b, String, String> f75856d;

    public C10138a(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, p<? super b, ? super String, String> pVar) {
        C17542s.j(aVar, "onClosedClicked");
        C17542s.j(aVar2, "onChangeStoreClicked");
        C17542s.j(aVar3, "onPrivacyPolicyClicked");
        C17542s.j(pVar, "getBackInStockErrorMessage");
        this.f75853a = aVar;
        this.f75854b = aVar2;
        this.f75855c = aVar3;
        this.f75856d = pVar;
    }

    public final p<b, String, String> a() {
        return this.f75856d;
    }

    public final C17631a<C16807N> b() {
        return this.f75854b;
    }

    public final C17631a<C16807N> c() {
        return this.f75853a;
    }

    public final C17631a<C16807N> d() {
        return this.f75855c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10138a)) {
            return false;
        }
        C10138a aVar = (C10138a) obj;
        return C17542s.e(this.f75853a, aVar.f75853a) && C17542s.e(this.f75854b, aVar.f75854b) && C17542s.e(this.f75855c, aVar.f75855c) && C17542s.e(this.f75856d, aVar.f75856d);
    }

    public int hashCode() {
        return (((((this.f75853a.hashCode() * 31) + this.f75854b.hashCode()) * 31) + this.f75855c.hashCode()) * 31) + this.f75856d.hashCode();
    }

    public String toString() {
        C17631a<C16807N> aVar = this.f75853a;
        C17631a<C16807N> aVar2 = this.f75854b;
        C17631a<C16807N> aVar3 = this.f75855c;
        p<b, String, String> pVar = this.f75856d;
        return "BackInStockNotificationsActions(onClosedClicked=" + aVar + ", onChangeStoreClicked=" + aVar2 + ", onPrivacyPolicyClicked=" + aVar3 + ", getBackInStockErrorMessage=" + pVar + ")";
    }
}
