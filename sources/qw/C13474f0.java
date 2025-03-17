package Qw;

import KJ.C15987c;
import Nn.A;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001BO\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR/\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001e"}, d2 = {"LQw/f0;", "", "Lkotlin/Function1;", "", "LXH/N;", "onTermsLinkClicked", "Lkotlin/Function2;", "LKJ/c;", "LNn/A;", "onParticipatingBanksClicked", "LQw/f;", "onAdditionalInformationClicked", "<init>", "(LnI/l;LnI/p;LnI/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/l;", "c", "()LnI/l;", "b", "LnI/p;", "()LnI/p;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qw.f0  reason: case insensitive filesystem */
public final class C13474f0 {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<String, C16807N> f114940a;

    /* renamed from: b  reason: collision with root package name */
    private final p<String, C15987c<A>, C16807N> f114941b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<C13473f, C16807N> f114942c;

    public C13474f0(C17642l<? super String, C16807N> lVar, p<? super String, ? super C15987c<A>, C16807N> pVar, C17642l<? super C13473f, C16807N> lVar2) {
        C17542s.j(lVar, "onTermsLinkClicked");
        C17542s.j(pVar, "onParticipatingBanksClicked");
        C17542s.j(lVar2, "onAdditionalInformationClicked");
        this.f114940a = lVar;
        this.f114941b = pVar;
        this.f114942c = lVar2;
    }

    public final C17642l<C13473f, C16807N> a() {
        return this.f114942c;
    }

    public final p<String, C15987c<A>, C16807N> b() {
        return this.f114941b;
    }

    public final C17642l<String, C16807N> c() {
        return this.f114940a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13474f0)) {
            return false;
        }
        C13474f0 f0Var = (C13474f0) obj;
        return C17542s.e(this.f114940a, f0Var.f114940a) && C17542s.e(this.f114941b, f0Var.f114941b) && C17542s.e(this.f114942c, f0Var.f114942c);
    }

    public int hashCode() {
        return (((this.f114940a.hashCode() * 31) + this.f114941b.hashCode()) * 31) + this.f114942c.hashCode();
    }

    public String toString() {
        C17642l<String, C16807N> lVar = this.f114940a;
        p<String, C15987c<A>, C16807N> pVar = this.f114941b;
        C17642l<C13473f, C16807N> lVar2 = this.f114942c;
        return "PaymentOptionsCallback(onTermsLinkClicked=" + lVar + ", onParticipatingBanksClicked=" + pVar + ", onAdditionalInformationClicked=" + lVar2 + ")";
    }
}
