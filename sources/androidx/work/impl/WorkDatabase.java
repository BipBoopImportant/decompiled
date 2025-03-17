package androidx.work.impl;

import Q4.h;
import R4.f;
import android.content.Context;
import androidx.room.w;
import androidx.room.x;
import androidx.work.C7033b;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l5.C8502G;
import l5.C8508d;
import l5.C8511g;
import l5.C8512h;
import l5.C8513i;
import l5.C8514j;
import l5.C8515k;
import l5.C8516l;
import l5.C8517m;
import l5.C8518n;
import l5.C8519o;
import l5.C8520p;
import l5.C8524u;
import l5.P;
import s5.C8716B;
import s5.C8720b;
import s5.C8723e;
import s5.C8728j;
import s5.C8733o;
import s5.C8736r;
import s5.v;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/x;", "<init>", "()V", "Ls5/v;", "f", "()Ls5/v;", "Ls5/b;", "a", "()Ls5/b;", "Ls5/B;", "g", "()Ls5/B;", "Ls5/j;", "c", "()Ls5/j;", "Ls5/o;", "d", "()Ls5/o;", "Ls5/r;", "e", "()Ls5/r;", "Ls5/e;", "b", "()Ls5/e;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class WorkDatabase extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45203a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "queryExecutor", "Landroidx/work/b;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/work/b;Z)Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final h c(Context context, h.b bVar) {
            C17542s.j(bVar, "configuration");
            h.b.a a10 = h.b.f39573f.a(context);
            a10.d(bVar.f39575b).c(bVar.f39576c).e(true).a(true);
            return new f().a(a10.b());
        }

        public final WorkDatabase b(Context context, Executor executor, C7033b bVar, boolean z10) {
            C17542s.j(context, "context");
            C17542s.j(executor, "queryExecutor");
            C17542s.j(bVar, "clock");
            Class<WorkDatabase> cls = WorkDatabase.class;
            return (z10 ? w.c(context, cls).d() : w.a(context, cls, "androidx.work.workdb").h(new C8502G(context))).i(executor).a(new C8508d(bVar)).b(C8515k.f54721a).b(new C8524u(context, 2, 3)).b(C8516l.f54722a).b(C8517m.f54723a).b(new C8524u(context, 5, 6)).b(C8518n.f54724a).b(C8519o.f54725a).b(C8520p.f54726a).b(new P(context)).b(new C8524u(context, 10, 11)).b(C8511g.f54717a).b(C8512h.f54718a).b(C8513i.f54719a).b(C8514j.f54720a).b(new C8524u(context, 21, 22)).f().e();
        }

        private a() {
        }
    }

    public abstract C8720b a();

    public abstract C8723e b();

    public abstract C8728j c();

    public abstract C8733o d();

    public abstract C8736r e();

    public abstract v f();

    public abstract C8716B g();
}
