package androidx.work;

import androidx.work.T;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.C8811f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/work/I;", "Landroidx/work/T;", "Landroidx/work/I$a;", "builder", "<init>", "(Landroidx/work/I$a;)V", "e", "a", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class I extends T {

    /* renamed from: e  reason: collision with root package name */
    public static final b f45077e = new b((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/work/I$b;", "", "<init>", "()V", "", "MIN_PERIODIC_FLEX_MILLIS", "J", "MIN_PERIODIC_INTERVAL_MILLIS", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(a aVar) {
        super(aVar.e(), aVar.h(), aVar.f());
        C17542s.j(aVar, "builder");
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB+\b\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00008PX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/I$a;", "Landroidx/work/T$a;", "Landroidx/work/I;", "Ljava/lang/Class;", "Landroidx/work/x;", "workerClass", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "Ljava/time/Duration;", "flexInterval", "(Ljava/lang/Class;Ljava/time/Duration;Ljava/time/Duration;)V", "o", "()Landroidx/work/I;", "p", "()Landroidx/work/I$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends T.a<a, I> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class<? extends C7054x> cls, long j10, TimeUnit timeUnit) {
            super(cls);
            C17542s.j(cls, "workerClass");
            C17542s.j(timeUnit, "repeatIntervalTimeUnit");
            h().r(timeUnit.toMillis(j10));
        }

        /* renamed from: o */
        public I c() {
            if (d() && h().f55919j.j()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            } else if (!h().f55926q) {
                return new I(this);
            } else {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
        }

        /* renamed from: p */
        public a g() {
            return this;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class<? extends C7054x> cls, Duration duration, Duration duration2) {
            super(cls);
            C17542s.j(cls, "workerClass");
            C17542s.j(duration, "repeatInterval");
            C17542s.j(duration2, "flexInterval");
            h().s(C8811f.a(duration), C8811f.a(duration2));
        }
    }
}
