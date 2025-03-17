package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import Nn.C10804g;
import Nn.C10806i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/a;", "", "", "checkoutId", "serviceAreaId", "LNn/i;", "priceHolder", "", "LNn/g;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;LNn/i;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "LNn/i;", "()LNn/i;", "Ljava/util/List;", "()Ljava/util/List;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f93736a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93737b;

    /* renamed from: c  reason: collision with root package name */
    private final C10806i f93738c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C10804g> f93739d;

    public a(String str, String str2, C10806i iVar, List<C10804g> list) {
        C17542s.j(str, "checkoutId");
        C17542s.j(str2, "serviceAreaId");
        C17542s.j(iVar, "priceHolder");
        C17542s.j(list, "items");
        this.f93736a = str;
        this.f93737b = str2;
        this.f93738c = iVar;
        this.f93739d = list;
    }

    public final String a() {
        return this.f93736a;
    }

    public final List<C10804g> b() {
        return this.f93739d;
    }

    public final C10806i c() {
        return this.f93738c;
    }

    public final String d() {
        return this.f93737b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f93736a, aVar.f93736a) && C17542s.e(this.f93737b, aVar.f93737b) && C17542s.e(this.f93738c, aVar.f93738c) && C17542s.e(this.f93739d, aVar.f93739d);
    }

    public int hashCode() {
        return (((((this.f93736a.hashCode() * 31) + this.f93737b.hashCode()) * 31) + this.f93738c.hashCode()) * 31) + this.f93739d.hashCode();
    }

    public String toString() {
        String str = this.f93736a;
        String str2 = this.f93737b;
        C10806i iVar = this.f93738c;
        List<C10804g> list = this.f93739d;
        return "CheckoutApiData(checkoutId=" + str + ", serviceAreaId=" + str2 + ", priceHolder=" + iVar + ", items=" + list + ")";
    }
}
