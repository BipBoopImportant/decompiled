package Bs;

import HJ.C15854t;
import XH.C16796C;
import XH.v;
import am.h;
import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7056z;
import com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker;
import com.sugarcube.core.logger.DslKt;
import eE.C14398b;
import eE.C14400d;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import tI.C17974j;
import tI.C17978n;
import tf.C10253a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c¨\u0006\u001e"}, d2 = {"LBs/p;", "LBs/o;", "LeE/d;", "workScheduler", "Lam/h;", "timeProvider", "Ltf/a;", "killSwitchRepository", "<init>", "(LeE/d;Lam/h;Ltf/a;)V", "", "hourOfDay", "minuteOfHour", "Ljava/time/Duration;", "repeatInterval", "flexInterval", "LXH/N;", "c", "(IILjava/time/Duration;Ljava/time/Duration;)V", "Ljava/time/LocalDateTime;", "now", "LXH/v;", "b", "(Ljava/time/LocalDateTime;II)LXH/v;", "a", "(Ljava/time/Duration;Ljava/time/Duration;II)V", "LeE/d;", "Lam/h;", "Ltf/a;", "d", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements o {

    /* renamed from: d  reason: collision with root package name */
    public static final a f79453d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f79454e = 8;

    /* renamed from: f  reason: collision with root package name */
    private static final C17974j f79455f = C17978n.w(0, 24);

    /* renamed from: g  reason: collision with root package name */
    private static final C17974j f79456g = C17978n.w(0, 60);

    /* renamed from: a  reason: collision with root package name */
    private final C14400d f79457a;

    /* renamed from: b  reason: collision with root package name */
    private final h f79458b;

    /* renamed from: c  reason: collision with root package name */
    private final C10253a f79459c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LBs/p$a;", "", "<init>", "()V", "LtI/j;", "VALID_HOURS", "LtI/j;", "VALID_MINUTES", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p(C14400d dVar, h hVar, C10253a aVar) {
        C17542s.j(dVar, "workScheduler");
        C17542s.j(hVar, "timeProvider");
        C17542s.j(aVar, "killSwitchRepository");
        this.f79457a = dVar;
        this.f79458b = hVar;
        this.f79459c = aVar;
    }

    private final v<LocalDateTime, Duration> b(LocalDateTime localDateTime, int i10, int i11) {
        LocalDateTime with = localDateTime.with(LocalTime.of(i10, i11));
        if (with.isBefore(localDateTime)) {
            with = with.plusDays(1);
        }
        return C16796C.a(with, Duration.between(localDateTime, with));
    }

    private final void c(int i10, int i11, Duration duration, Duration duration2) {
        v<LocalDateTime, Duration> b10 = b(this.f79458b.d(), i10, i11);
        LocalDateTime a10 = b10.a();
        Duration b11 = b10.b();
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a11 = C11818a.a("Scheduling Inbox sync for " + a10.atZone(ZoneId.systemDefault()), (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str = C11820c.a(a11);
            }
            String str3 = str;
            if (str2 == null) {
                String name = p.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        this.f79457a.d(P.b(InboxSyncWorker.class), new C14398b("InboxSyncWorkerTag", duration, duration2, (C7032a) null, 0, new C7036e(C7056z.CONNECTED, false, false, false, 14, (DefaultConstructorMarker) null), b11.toMillis(), (C7037f) null, 152, (DefaultConstructorMarker) null));
    }

    public void a(Duration duration, Duration duration2, int i10, int i11) {
        C17542s.j(duration, "repeatInterval");
        C17542s.j(duration2, "flexInterval");
        C17974j jVar = f79455f;
        int p10 = jVar.p();
        if (i10 > jVar.q() || p10 > i10) {
            throw new IllegalArgumentException("hourOfDay should be in range [0-23]");
        }
        C17974j jVar2 = f79456g;
        int p11 = jVar2.p();
        if (i11 > jVar2.q() || p11 > i11) {
            throw new IllegalArgumentException("minuteOfHour should be in range [0-59]");
        } else if (this.f79459c.G()) {
            c(i10, i11, duration, duration2);
        } else {
            this.f79457a.c("InboxSyncWorkerTag");
        }
    }
}
