package l5;

import QJ.C16297b0;
import QJ.Q;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import android.content.Context;
import androidx.work.C7034c;
import androidx.work.C7055y;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.r;
import t5.C8791B;
import t5.C8793D;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LQJ/Q;", "Landroid/content/Context;", "appContext", "Landroidx/work/c;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", "LXH/N;", "c", "(LQJ/Q;Landroid/content/Context;Landroidx/work/c;Landroidx/work/impl/WorkDatabase;)V", "", "a", "Ljava/lang/String;", "TAG", "", "b", "J", "MAX_DELAY_MS", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: l5.D  reason: case insensitive filesystem */
public final class C8499D {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f54602a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f54603b = TimeUnit.HOURS.toMillis(1);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LTJ/h;", "", "", "throwable", "", "attempt", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: l5.D$a */
    static final class a extends l implements r<C16533h<? super Boolean>, Throwable, Long, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f54604c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f54605d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ long f54606e;

        a(C17164e<? super a> eVar) {
            super(4, eVar);
        }

        public final Object i(C16533h<? super Boolean> hVar, Throwable th2, long j10, C17164e<? super Boolean> eVar) {
            a aVar = new a(eVar);
            aVar.f54605d = th2;
            aVar.f54606e = j10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f54604c;
            if (i10 == 0) {
                y.b(obj);
                long j10 = this.f54606e;
                C7055y.e().d(C8499D.f54602a, "Cannot check for unfinished work", (Throwable) this.f54605d);
                long min = Math.min(j10 * ((long) 30000), C8499D.f54603b);
                this.f54604c = 1;
                if (C16297b0.b(min, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return kotlin.coroutines.jvm.internal.b.a(true);
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((C16533h) obj, (Throwable) obj2, ((Number) obj3).longValue(), (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasUnfinishedWork", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l5.D$b */
    static final class b extends l implements p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f54607c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f54608d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f54609e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f54609e = context;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f54609e, eVar);
            bVar.f54608d = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((b) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f54607c == 0) {
                y.b(obj);
                C8791B.c(this.f54609e, RescheduleReceiver.class, this.f54608d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        String i10 = C7055y.i("UnfinishedWorkListener");
        C17542s.i(i10, "tagWithPrefix(\"UnfinishedWorkListener\")");
        f54602a = i10;
    }

    public static final void c(Q q10, Context context, C7034c cVar, WorkDatabase workDatabase) {
        C17542s.j(q10, "<this>");
        C17542s.j(context, "appContext");
        C17542s.j(cVar, "configuration");
        C17542s.j(workDatabase, "db");
        if (C8793D.b(context, cVar)) {
            C16534i.M(C16534i.R(C16534i.s(C16534i.o(C16534i.W(workDatabase.f().t(), new a((C17164e<? super a>) null)))), new b(context, (C17164e<? super b>) null)), q10);
        }
    }
}
