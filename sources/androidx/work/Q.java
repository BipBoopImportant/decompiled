package androidx.work;

import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b-\u0018\u0000 F2\u00020\u0001:\u0003!%(B\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b!\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bC\u0010=R\u0017\u0010\u0016\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\bD\u00103\u001a\u0004\bE\u0010\u001e¨\u0006G"}, d2 = {"Landroidx/work/Q;", "", "Ljava/util/UUID;", "id", "Landroidx/work/Q$c;", "state", "", "", "tags", "Landroidx/work/f;", "outputData", "progress", "", "runAttemptCount", "generation", "Landroidx/work/e;", "constraints", "", "initialDelayMillis", "Landroidx/work/Q$b;", "periodicityInfo", "nextScheduleTimeMillis", "stopReason", "<init>", "(Ljava/util/UUID;Landroidx/work/Q$c;Ljava/util/Set;Landroidx/work/f;Landroidx/work/f;IILandroidx/work/e;JLandroidx/work/Q$b;JI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "b", "Landroidx/work/Q$c;", "()Landroidx/work/Q$c;", "c", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "d", "Landroidx/work/f;", "getOutputData", "()Landroidx/work/f;", "e", "getProgress", "f", "I", "g", "getGeneration", "h", "Landroidx/work/e;", "getConstraints", "()Landroidx/work/e;", "i", "J", "getInitialDelayMillis", "()J", "j", "Landroidx/work/Q$b;", "getPeriodicityInfo", "()Landroidx/work/Q$b;", "k", "getNextScheduleTimeMillis", "l", "getStopReason", "m", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Q {

    /* renamed from: m  reason: collision with root package name */
    public static final a f45079m = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final UUID f45080a;

    /* renamed from: b  reason: collision with root package name */
    private final c f45081b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f45082c;

    /* renamed from: d  reason: collision with root package name */
    private final C7037f f45083d;

    /* renamed from: e  reason: collision with root package name */
    private final C7037f f45084e;

    /* renamed from: f  reason: collision with root package name */
    private final int f45085f;

    /* renamed from: g  reason: collision with root package name */
    private final int f45086g;

    /* renamed from: h  reason: collision with root package name */
    private final C7036e f45087h;

    /* renamed from: i  reason: collision with root package name */
    private final long f45088i;

    /* renamed from: j  reason: collision with root package name */
    private final b f45089j;

    /* renamed from: k  reason: collision with root package name */
    private final long f45090k;

    /* renamed from: l  reason: collision with root package name */
    private final int f45091l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Landroidx/work/Q$a;", "", "<init>", "()V", "", "STOP_REASON_APP_STANDBY", "I", "STOP_REASON_BACKGROUND_RESTRICTION", "STOP_REASON_CANCELLED_BY_APP", "STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW", "STOP_REASON_CONSTRAINT_CHARGING", "STOP_REASON_CONSTRAINT_CONNECTIVITY", "STOP_REASON_CONSTRAINT_DEVICE_IDLE", "STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW", "STOP_REASON_DEVICE_STATE", "STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED", "STOP_REASON_FOREGROUND_SERVICE_TIMEOUT", "STOP_REASON_NOT_STOPPED", "STOP_REASON_PREEMPT", "STOP_REASON_QUOTA", "STOP_REASON_SYSTEM_PROCESSING", "STOP_REASON_TIMEOUT", "STOP_REASON_UNKNOWN", "STOP_REASON_USER", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/work/Q$b;", "", "", "repeatIntervalMillis", "flexIntervalMillis", "<init>", "(JJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getRepeatIntervalMillis", "()J", "b", "getFlexIntervalMillis", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f45092a;

        /* renamed from: b  reason: collision with root package name */
        private final long f45093b;

        public b(long j10, long j11) {
            this.f45092a = j10;
            this.f45093b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (C17542s.e(b.class, obj.getClass())) {
                    b bVar = (b) obj;
                    return bVar.f45092a == this.f45092a && bVar.f45093b == this.f45093b;
                }
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.f45092a) * 31) + Long.hashCode(this.f45093b);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.f45092a + ", flexIntervalMillis=" + this.f45093b + '}';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/work/Q$c;", "", "<init>", "(Ljava/lang/String;I)V", "", "b", "()Z", "isFinished", "ENQUEUED", "RUNNING", "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum c {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean b() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public Q(UUID uuid, c cVar, Set<String> set, C7037f fVar, C7037f fVar2, int i10, int i11, C7036e eVar, long j10, b bVar, long j11, int i12) {
        C17542s.j(uuid, "id");
        C17542s.j(cVar, "state");
        C17542s.j(set, "tags");
        C17542s.j(fVar, "outputData");
        C17542s.j(fVar2, "progress");
        C17542s.j(eVar, "constraints");
        this.f45080a = uuid;
        this.f45081b = cVar;
        this.f45082c = set;
        this.f45083d = fVar;
        this.f45084e = fVar2;
        this.f45085f = i10;
        this.f45086g = i11;
        this.f45087h = eVar;
        this.f45088i = j10;
        this.f45089j = bVar;
        this.f45090k = j11;
        this.f45091l = i12;
    }

    public final int a() {
        return this.f45085f;
    }

    public final c b() {
        return this.f45081b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!C17542s.e(Q.class, obj.getClass())) {
            return false;
        }
        Q q10 = (Q) obj;
        if (this.f45085f == q10.f45085f && this.f45086g == q10.f45086g && C17542s.e(this.f45080a, q10.f45080a) && this.f45081b == q10.f45081b && C17542s.e(this.f45083d, q10.f45083d) && C17542s.e(this.f45087h, q10.f45087h) && this.f45088i == q10.f45088i && C17542s.e(this.f45089j, q10.f45089j) && this.f45090k == q10.f45090k && this.f45091l == q10.f45091l && C17542s.e(this.f45082c, q10.f45082c)) {
            return C17542s.e(this.f45084e, q10.f45084e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f45080a.hashCode() * 31) + this.f45081b.hashCode()) * 31) + this.f45083d.hashCode()) * 31) + this.f45082c.hashCode()) * 31) + this.f45084e.hashCode()) * 31) + this.f45085f) * 31) + this.f45086g) * 31) + this.f45087h.hashCode()) * 31) + Long.hashCode(this.f45088i)) * 31;
        b bVar = this.f45089j;
        return ((((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + Long.hashCode(this.f45090k)) * 31) + Integer.hashCode(this.f45091l);
    }

    public String toString() {
        return "WorkInfo{id='" + this.f45080a + "', state=" + this.f45081b + ", outputData=" + this.f45083d + ", tags=" + this.f45082c + ", progress=" + this.f45084e + ", runAttemptCount=" + this.f45085f + ", generation=" + this.f45086g + ", constraints=" + this.f45087h + ", initialDelayMillis=" + this.f45088i + ", periodicityInfo=" + this.f45089j + ", nextScheduleTimeMillis=" + this.f45090k + "}, stopReason=" + this.f45091l;
    }
}
