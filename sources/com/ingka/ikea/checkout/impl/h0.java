package com.ingka.ikea.checkout.impl;

import IC.C13026h;
import OC.C13302d;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13589g1;
import XH.C16818i;
import androidx.lifecycle.L;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import rv.C11849b;
import vl.n;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "", "LOC/d$a;", "paymentOptions", "LXH/N;", "d", "(Ljava/util/List;Ljava/util/List;)V", "c", "(Ljava/util/List;)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f94602a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f94602a = lVar;
        }

        public final C16818i<?> c() {
            return this.f94602a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f94602a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final void c(List<Object> list) {
        List<Object> list2 = list;
        list2.add(new n.b("PaymentInformation", "OnlineCheckout_PAYMENT_INFORMATION", C13589g1.Large, false, (C17631a) null, (C17631a) null, C13026h.a(C11849b.f102321m1), C13026h.a(C11849b.f102317l1), (C13573c1) null, (C13569b1) null, true, (p) null, 2856, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public static final void d(List<Object> list, List<C13302d.a> list2) {
        Collection collection = list2;
        if (collection != null && !collection.isEmpty()) {
            list.add(new C13302d("AVAILABLE_PAYMENT_OPTIONS_ID", true, C13026h.a(C11849b.f102166B), list2));
        }
    }
}
