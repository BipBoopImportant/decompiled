package androidx.work.impl;

import QJ.Q;
import QJ.S;
import YH.C16877v;
import android.content.Context;
import androidx.work.C7034c;
import androidx.work.K;
import androidx.work.impl.WorkDatabase;
import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l5.C8523t;
import l5.C8525v;
import l5.M;
import l5.O;
import m5.C8550b;
import nI.t;
import q5.c;
import q5.h;
import q5.n;
import u5.C8877a;
import u5.C8878b;
import u5.C8879c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0001\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2<\b\u0002\u0010\u0010\u001a6\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fj\u0002`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019*j\u0010\u001a\"2\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f22\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¨\u0006\u001b"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/c;", "configuration", "Lu5/b;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lq5/n;", "trackers", "Ll5/t;", "processor", "Lkotlin/Function6;", "", "Ll5/v;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Ll5/O;", "d", "(Landroid/content/Context;Landroidx/work/c;Lu5/b;Landroidx/work/impl/WorkDatabase;Lq5/n;Ll5/t;LnI/t;)Ll5/O;", "b", "(Landroid/content/Context;Landroidx/work/c;Lu5/b;Landroidx/work/impl/WorkDatabase;Lq5/n;Ll5/t;)Ljava/util/List;", "taskExecutor", "LQJ/Q;", "f", "(Lu5/b;)LQJ/Q;", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements t<Context, C7034c, C8878b, WorkDatabase, n, C8523t, List<? extends C8525v>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45296a = new a();

        a() {
            super(6, j.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        /* renamed from: t */
        public final List<C8525v> o(Context context, C7034c cVar, C8878b bVar, WorkDatabase workDatabase, n nVar, C8523t tVar) {
            C17542s.j(context, "p0");
            C17542s.j(cVar, "p1");
            C17542s.j(bVar, "p2");
            C17542s.j(workDatabase, "p3");
            C17542s.j(nVar, "p4");
            C17542s.j(tVar, "p5");
            return j.b(context, cVar, bVar, workDatabase, nVar, tVar);
        }
    }

    /* access modifiers changed from: private */
    public static final List<C8525v> b(Context context, C7034c cVar, C8878b bVar, WorkDatabase workDatabase, n nVar, C8523t tVar) {
        C8525v c10 = a.c(context, workDatabase, cVar);
        C17542s.i(c10, "createBestAvailableBackg…kDatabase, configuration)");
        return C16877v.q(c10, new C8550b(context, cVar, nVar, tVar, new M(tVar, bVar), bVar));
    }

    public static final O c(Context context, C7034c cVar) {
        C17542s.j(context, "context");
        C17542s.j(cVar, "configuration");
        return e(context, cVar, (C8878b) null, (WorkDatabase) null, (n) null, (C8523t) null, (t) null, 124, (Object) null);
    }

    public static final O d(Context context, C7034c cVar, C8878b bVar, WorkDatabase workDatabase, n nVar, C8523t tVar, t<? super Context, ? super C7034c, ? super C8878b, ? super WorkDatabase, ? super n, ? super C8523t, ? extends List<? extends C8525v>> tVar2) {
        C17542s.j(context, "context");
        C17542s.j(cVar, "configuration");
        C17542s.j(bVar, "workTaskExecutor");
        C17542s.j(workDatabase, "workDatabase");
        C17542s.j(nVar, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH);
        C17542s.j(tVar, "processor");
        C17542s.j(tVar2, "schedulersCreator");
        C7034c cVar2 = cVar;
        C8878b bVar2 = bVar;
        WorkDatabase workDatabase2 = workDatabase;
        C8523t tVar3 = tVar;
        return new O(context.getApplicationContext(), cVar2, bVar2, workDatabase2, (List) tVar2.o(context, cVar2, bVar2, workDatabase2, nVar, tVar3), tVar3, nVar);
    }

    public static /* synthetic */ O e(Context context, C7034c cVar, C8878b bVar, WorkDatabase workDatabase, n nVar, C8523t tVar, t tVar2, int i10, Object obj) {
        WorkDatabase workDatabase2;
        n nVar2;
        C8523t tVar3;
        C8878b cVar2 = (i10 & 4) != 0 ? new C8879c(cVar.m()) : bVar;
        if ((i10 & 8) != 0) {
            WorkDatabase.a aVar = WorkDatabase.f45203a;
            Context applicationContext = context.getApplicationContext();
            C17542s.i(applicationContext, "context.applicationContext");
            C8877a c10 = cVar2.c();
            C17542s.i(c10, "workTaskExecutor.serialTaskExecutor");
            workDatabase2 = aVar.b(applicationContext, c10, cVar.a(), context.getResources().getBoolean(K.f45078a));
        } else {
            workDatabase2 = workDatabase;
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            C17542s.i(applicationContext2, "context.applicationContext");
            nVar2 = new n(applicationContext2, cVar2, (h) null, (c) null, (h) null, (h) null, 60, (DefaultConstructorMarker) null);
        } else {
            nVar2 = nVar;
        }
        if ((i10 & 32) != 0) {
            C7034c cVar3 = cVar;
            tVar3 = new C8523t(context.getApplicationContext(), cVar, cVar2, workDatabase2);
        } else {
            C7034c cVar4 = cVar;
            tVar3 = tVar;
        }
        return d(context, cVar, cVar2, workDatabase2, nVar2, tVar3, (i10 & 64) != 0 ? a.f45296a : tVar2);
    }

    public static final Q f(C8878b bVar) {
        C17542s.j(bVar, "taskExecutor");
        QJ.M b10 = bVar.b();
        C17542s.i(b10, "taskExecutor.taskCoroutineDispatcher");
        return S.a(b10);
    }
}
