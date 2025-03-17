package com.ingka.ikea.backinstock.notification.repository.network;

import XH.t;
import com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llm/a$c;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;", "f", "(Llm/a$c;)Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;", "e", "(Llm/a$c;)Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;", "Llm/a$a;", "", "c", "(Llm/a$a;)Ljava/lang/String;", "d", "(Llm/a$c;)Ljava/lang/String;", "backinstock-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final String c(C11550a.C2253a aVar) {
        C17542s.j(aVar, "<this>");
        if (C17542s.e(aVar, C11550a.C2253a.b.f99207a)) {
            return "PUSH";
        }
        if (aVar instanceof C11550a.C2253a.C2254a) {
            return "EMAIL";
        }
        throw new t();
    }

    public static final String d(C11550a.c cVar) {
        C17542s.j(cVar, "<this>");
        if (cVar instanceof C11550a.c.C2255a) {
            return "cash_and_carry";
        }
        if (cVar instanceof C11550a.c.b) {
            return "click_and_collect";
        }
        if (cVar instanceof C11550a.c.C2258c) {
            return "home_delivery";
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final SubscribeNotificationBody.CashCarry e(C11550a.c cVar) {
        if (cVar instanceof C11550a.c.b) {
            return new SubscribeNotificationBody.CashCarry(((C11550a.c.b) cVar).b());
        }
        if (cVar instanceof C11550a.c.C2255a) {
            return new SubscribeNotificationBody.CashCarry(((C11550a.c.C2255a) cVar).b());
        }
        if (cVar instanceof C11550a.c.C2258c) {
            return null;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final SubscribeNotificationBody.HomeDelivery f(C11550a.c cVar) {
        if (cVar instanceof C11550a.c.C2258c) {
            C11550a.c.C2258c cVar2 = (C11550a.c.C2258c) cVar;
            return new SubscribeNotificationBody.HomeDelivery(cVar2.c(), cVar2.b());
        } else if ((cVar instanceof C11550a.c.b) || (cVar instanceof C11550a.c.C2255a)) {
            return null;
        } else {
            throw new t();
        }
    }
}
