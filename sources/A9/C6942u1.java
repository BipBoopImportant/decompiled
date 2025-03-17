package a9;

import java.util.ArrayList;
import java.util.Iterator;
import k8.C8465a;
import kotlin.jvm.internal.C17542s;
import z8.C9036b;

/* renamed from: a9.u1  reason: case insensitive filesystem */
public final class C6942u1 implements N5, S1 {

    /* renamed from: a  reason: collision with root package name */
    public final L3 f42880a;

    /* renamed from: b  reason: collision with root package name */
    public final C8465a f42881b;

    public C6942u1(C8465a aVar) {
        L3 l32 = new L3();
        C17542s.j(l32, "mutationDetector");
        C17542s.j(aVar, "bridgeManager");
        this.f42880a = l32;
        this.f42881b = aVar;
    }

    public final void a() {
        L3 l32 = this.f42880a;
        synchronized (l32) {
            try {
                C9036b bVar = l32.f42127a;
                if (bVar != null) {
                    C9036b.f58523D.d(bVar);
                }
                l32.f42127a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ArrayList c(C9036b bVar, long j10) {
        C17542s.j(bVar, "viewLight");
        if (!this.f42881b.m()) {
            return this.f42880a.a(bVar, j10);
        }
        ArrayList a10 = this.f42880a.a(bVar, j10);
        ArrayList arrayList = new ArrayList();
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C6834g4) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
