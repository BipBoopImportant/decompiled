package a9;

import E8.b;
import E8.c;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.y1  reason: case insensitive filesystem */
public final class C6974y1 implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final c f42967a;

    /* renamed from: b  reason: collision with root package name */
    public final D8.c f42968b;

    /* renamed from: c  reason: collision with root package name */
    public C6871l1 f42969c = new C6871l1(1, 1, 0);

    /* renamed from: d  reason: collision with root package name */
    public C6911q1 f42970d;

    public C6974y1(c cVar) {
        D8.c cVar2 = new D8.c("SessionStateManager");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(cVar2, "logger");
        this.f42967a = cVar;
        this.f42968b = cVar2;
        cVar.n(this);
        this.f42969c = new C6871l1((long) cVar.d(b.SESSION_ID, 1), (long) cVar.d(b.SCREEN_NUMBER, 0), 0);
        cVar2.f("Updated state: sessionId = " + this.f42969c.f42673a + ", screenNumber = " + this.f42969c.f42674b);
    }

    public final synchronized C6871l1 a() {
        C6871l1 l1Var;
        l1Var = this.f42969c;
        return new C6871l1(l1Var.f42673a, l1Var.f42674b, l1Var.f42675c);
    }

    public final void o(b bVar) {
        C17542s.j(bVar, "key");
        b bVar2 = b.SCREEN_NUMBER;
        if (bVar == bVar2) {
            synchronized (this) {
                try {
                    long d10 = (long) this.f42967a.d(bVar2, 0);
                    if (d10 > 0) {
                        C6871l1 l1Var = this.f42969c;
                        long j10 = l1Var.f42674b;
                        if (d10 != j10) {
                            C6871l1 l1Var2 = new C6871l1(l1Var.f42673a, j10, 1);
                            C6911q1 q1Var = this.f42970d;
                            if (q1Var != null) {
                                q1Var.onPreScreenNumberChange(l1Var2);
                            }
                            this.f42969c = new C6871l1(this.f42969c.f42673a, d10, 0);
                            D8.c cVar = this.f42968b;
                            cVar.f("Updated state: sessionId = " + this.f42969c.f42673a + ", screenNumber = " + this.f42969c.f42674b);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
