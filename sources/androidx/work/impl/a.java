package androidx.work.impl;

import android.content.Context;
import androidx.work.C7033b;
import androidx.work.C7034c;
import androidx.work.C7055y;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import l5.C8523t;
import l5.C8525v;
import l5.C8526w;
import n5.C8580k;
import s5.C8731m;
import s5.C8739u;
import s5.v;
import t5.C8791B;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f45212a = C7055y.i("Schedulers");

    static C8525v c(Context context, WorkDatabase workDatabase, C7034c cVar) {
        C8580k kVar = new C8580k(context, workDatabase, cVar);
        C8791B.c(context, SystemJobService.class, true);
        C7055y.e().a(f45212a, "Created SystemJobScheduler and enabled SystemJobService");
        return kVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(List list, C8731m mVar, C7034c cVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C8525v) it.next()).a(mVar.b());
        }
        h(cVar, workDatabase, list);
    }

    private static void f(v vVar, C7033b bVar, List<C8739u> list) {
        if (list.size() > 0) {
            long a10 = bVar.a();
            for (C8739u uVar : list) {
                vVar.r(uVar.f55910a, a10);
            }
        }
    }

    public static void g(List<C8525v> list, C8523t tVar, Executor executor, WorkDatabase workDatabase, C7034c cVar) {
        tVar.e(new C8526w(executor, list, cVar, workDatabase));
    }

    public static void h(C7034c cVar, WorkDatabase workDatabase, List<C8525v> list) {
        if (list != null && list.size() != 0) {
            v f10 = workDatabase.f();
            workDatabase.beginTransaction();
            try {
                List<C8739u> z10 = f10.z();
                f(f10, cVar.a(), z10);
                List<C8739u> u10 = f10.u(cVar.h());
                f(f10, cVar.a(), u10);
                if (z10 != null) {
                    u10.addAll(z10);
                }
                List<C8739u> n10 = f10.n(200);
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (u10.size() > 0) {
                    C8739u[] uVarArr = (C8739u[]) u10.toArray(new C8739u[u10.size()]);
                    for (C8525v next : list) {
                        if (next.e()) {
                            next.c(uVarArr);
                        }
                    }
                }
                if (n10.size() > 0) {
                    C8739u[] uVarArr2 = (C8739u[]) n10.toArray(new C8739u[n10.size()]);
                    for (C8525v next2 : list) {
                        if (!next2.e()) {
                            next2.c(uVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }
}
