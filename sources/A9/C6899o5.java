package a9;

import kotlin.jvm.internal.C17542s;

/* renamed from: a9.o5  reason: case insensitive filesystem */
public final class C6899o5 {

    /* renamed from: a  reason: collision with root package name */
    public final C6806d0 f42783a;

    public C6899o5(C6806d0 d0Var) {
        C17542s.j(d0Var, "eventsProvidersManager");
        this.f42783a = d0Var;
    }

    public final void a(W5 w52) {
        C17542s.j(w52, "newEvent");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("API Error Details - " + w52.f42367b.h() + ' ' + w52.f42367b.C() + ' ' + w52.f42367b.E());
        W5.d(", Request Headers", sb2, w52.f42367b.d(), w52.f42367b.k());
        W5.d(", Response Headers", sb2, w52.f42367b.e(), w52.f42367b.l());
        W5.d(", Request Body Attributes", sb2, w52.f42367b.q(), w52.f42367b.m());
        W5.d(", Response Body Attributes", sb2, w52.f42367b.v(), w52.f42367b.n());
        if (w52.f42367b.p() != null) {
            sb2.append(", Request Body: (encrypted)");
        }
        if (w52.f42367b.u() != null) {
            sb2.append(", Response Body: (encrypted)");
        }
        if (w52.f42367b.o() != null) {
            sb2.append(", Query Parameters (encrypted)");
        }
        w52.f42368c.f(sb2.toString());
        C6806d0 d0Var = this.f42783a;
        synchronized (d0Var) {
            C17542s.j(w52, "event");
            d0Var.f42497a.add(w52);
        }
    }
}
