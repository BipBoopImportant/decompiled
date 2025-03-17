package t5;

import YH.C16877v;
import androidx.work.C7032a;
import androidx.work.C7034c;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.H;
import androidx.work.Q;
import androidx.work.T;
import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l5.C8501F;
import l5.C8525v;
import s5.C8739u;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0010\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/c;", "configuration", "Ll5/F;", "continuation", "LXH/N;", "a", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/c;Ll5/F;)V", "Ls5/u;", "workSpec", "b", "(Ls5/u;)Ls5/u;", "", "Ll5/v;", "schedulers", "c", "(Ljava/util/List;Ls5/u;)Ls5/u;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.h  reason: case insensitive filesystem */
public final class C8813h {
    public static final void a(WorkDatabase workDatabase, C7034c cVar, C8501F f10) {
        int i10;
        C17542s.j(workDatabase, "workDatabase");
        C17542s.j(cVar, "configuration");
        C17542s.j(f10, "continuation");
        List t10 = C16877v.t(f10);
        int i11 = 0;
        while (!t10.isEmpty()) {
            C8501F f11 = (C8501F) C16877v.O(t10);
            List<? extends T> g10 = f11.g();
            C17542s.i(g10, "current.work");
            Iterable<T> iterable = g10;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                i10 = 0;
                for (T d10 : iterable) {
                    if (d10.d().f55919j.g() && (i10 = i10 + 1) < 0) {
                        C16877v.w();
                    }
                }
            } else {
                i10 = 0;
            }
            i11 += i10;
            List<C8501F> f12 = f11.f();
            if (f12 != null) {
                t10.addAll(f12);
            }
        }
        if (i11 != 0) {
            int C10 = workDatabase.f().C();
            int b10 = cVar.b();
            if (C10 + i11 > b10) {
                throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + b10 + ";\nalready enqueued count: " + C10 + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
            }
        }
    }

    public static final C8739u b(C8739u uVar) {
        C8739u uVar2 = uVar;
        C17542s.j(uVar2, "workSpec");
        Class<String> cls = String.class;
        boolean h10 = uVar2.f55914e.h("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", cls);
        boolean h11 = uVar2.f55914e.h("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", cls);
        boolean h12 = uVar2.f55914e.h("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", cls);
        if (h10 || !h11 || !h12) {
            return uVar2;
        }
        String str = uVar2.f55912c;
        return C8739u.e(uVar, (String) null, (Q.c) null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", (String) null, new C7037f.a().c(uVar2.f55914e).i("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str).a(), (C7037f) null, 0, 0, 0, (C7036e) null, 0, (C7032a) null, 0, 0, 0, 0, false, (H) null, 0, 0, 0, 0, 0, (String) null, 16777195, (Object) null);
    }

    public static final C8739u c(List<? extends C8525v> list, C8739u uVar) {
        C17542s.j(list, "schedulers");
        C17542s.j(uVar, "workSpec");
        return b(uVar);
    }
}
