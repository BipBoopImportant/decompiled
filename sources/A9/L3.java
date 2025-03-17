package a9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import z8.C9036b;

public final class L3 {

    /* renamed from: a  reason: collision with root package name */
    public C9036b f42127a;

    public static final class a {
        public static void a(C9036b bVar, C9036b bVar2, long j10, ArrayList arrayList) {
            if (bVar.r() != bVar2.r()) {
                arrayList.add(new C6794b4(j10, bVar.r()));
                arrayList.add(new S3(j10, bVar2.o(), bVar2.n(), bVar2));
                return;
            }
            if (C9036b.f58523D.b(bVar, bVar2)) {
                arrayList.add(new C6834g4(j10, bVar2.r(), bVar2));
            }
            List<C9036b> h10 = bVar2.h();
            List<C9036b> h11 = bVar.h();
            for (C9036b next : h10) {
                if (!(h11 instanceof Collection) || !h11.isEmpty()) {
                    Iterator<T> it = h11.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C9036b) it.next()).r() == next.r()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList.add(new S3(j10, next.o(), next.n(), next));
            }
            for (C9036b next2 : h11) {
                Iterator<C9036b> it2 = h10.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(new C6794b4(j10, next2.r()));
                        break;
                    }
                    C9036b next3 = it2.next();
                    if (next2.r() == next3.r()) {
                        a(next2, next3, j10, arrayList);
                        break;
                    }
                }
            }
        }
    }

    public final synchronized ArrayList a(C9036b bVar, long j10) {
        ArrayList arrayList;
        try {
            C17542s.j(bVar, "currentTreeLight");
            C9036b bVar2 = this.f42127a;
            arrayList = new ArrayList();
            if (bVar2 == null) {
                arrayList.add(new S3(j10, -1, -1, bVar));
            } else {
                a.a(bVar2, bVar, j10, arrayList);
            }
            C9036b bVar3 = this.f42127a;
            this.f42127a = bVar;
            if (bVar3 != null) {
                C9036b.f58523D.d(bVar3);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return arrayList;
    }
}
