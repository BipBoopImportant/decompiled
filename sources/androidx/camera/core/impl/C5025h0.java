package androidx.camera.core.impl;

import H2.i;
import I.c;
import I.n;
import android.view.Surface;
import androidx.camera.core.impl.C5019e0;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import ob.C10101e;

/* renamed from: androidx.camera.core.impl.h0  reason: case insensitive filesystem */
public final class C5025h0 {

    /* renamed from: androidx.camera.core.impl.h0$a */
    class a implements c<List<Surface>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f16914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.a f16915b;

        a(boolean z10, c.a aVar) {
            this.f16914a = z10;
            this.f16915b = aVar;
        }

        public void b(Throwable th2) {
            if (th2 instanceof TimeoutException) {
                this.f16915b.f(th2);
            } else {
                this.f16915b.c(Collections.emptyList());
            }
        }

        /* renamed from: c */
        public void a(List<Surface> list) {
            i.g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f16914a) {
                arrayList.removeAll(Collections.singleton((Object) null));
            }
            this.f16915b.c(arrayList);
        }
    }

    public static void c(List<C5019e0> list) {
        for (C5019e0 e10 : list) {
            e10.e();
        }
    }

    public static void d(List<C5019e0> list) {
        if (!list.isEmpty()) {
            int i10 = 0;
            do {
                try {
                    list.get(i10).l();
                    i10++;
                } catch (C5019e0.a e10) {
                    for (int i11 = i10 - 1; i11 >= 0; i11--) {
                        list.get(i11).e();
                    }
                    throw e10;
                }
            } while (i10 < list.size());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object f(C10101e eVar, Executor executor, boolean z10, Collection collection, c.a aVar) {
        aVar.a(new C5021f0(eVar), executor);
        n.j(eVar, new a(z10, aVar), executor);
        return "surfaceList[" + collection + "]";
    }

    public static C10101e<List<Surface>> g(Collection<C5019e0> collection, boolean z10, long j10, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        for (C5019e0 j11 : collection) {
            arrayList.add(n.B(j11.j()));
        }
        return androidx.concurrent.futures.c.a(new C5023g0(n.A(j10, scheduledExecutorService, n.F(arrayList)), executor, z10, collection));
    }
}
