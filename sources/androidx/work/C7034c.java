package androidx.work;

import QJ.C16311i0;
import QJ.C16340x0;
import dI.C17168i;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l5.C8509e;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 S2\u00020\u0001:\u0003\u0007\r\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010/\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001a\u0010.R\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010.R\u001f\u00106\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010.R\u001f\u00108\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b7\u0010.R\u0019\u0010<\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b1\u0010:\u001a\u0004\b\u0012\u0010;R\u0017\u0010@\u001a\u00020=8G¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b4\u0010?R\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\b0\u0010?R\u0017\u0010C\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b%\u0010?R\u0017\u0010D\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b7\u0010>\u001a\u0004\b\r\u0010?R\u0017\u0010E\u001a\u00020=8G¢\u0006\f\n\u0004\b\u001c\u0010>\u001a\u0004\b,\u0010?R\u0017\u0010H\u001a\u00020F8G¢\u0006\f\n\u0004\b5\u0010G\u001a\u0004\bH\u0010IR \u0010M\u001a\u00020F8GX\u0004¢\u0006\u0012\n\u0004\bJ\u0010G\u0012\u0004\bK\u0010L\u001a\u0004\bJ\u0010IR\u0017\u0010R\u001a\u00020N8G¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bA\u0010Q¨\u0006T"}, d2 = {"Landroidx/work/c;", "", "Landroidx/work/c$a;", "builder", "<init>", "(Landroidx/work/c$a;)V", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "executor", "LdI/i;", "b", "LdI/i;", "o", "()LdI/i;", "workerCoroutineContext", "c", "m", "taskExecutor", "Landroidx/work/b;", "Landroidx/work/b;", "()Landroidx/work/b;", "clock", "Landroidx/work/V;", "e", "Landroidx/work/V;", "q", "()Landroidx/work/V;", "workerFactory", "Landroidx/work/o;", "f", "Landroidx/work/o;", "()Landroidx/work/o;", "inputMergerFactory", "Landroidx/work/L;", "g", "Landroidx/work/L;", "k", "()Landroidx/work/L;", "runnableScheduler", "LH2/a;", "", "h", "LH2/a;", "()LH2/a;", "initializationExceptionHandler", "i", "l", "schedulingExceptionHandler", "Landroidx/work/U;", "j", "r", "workerInitializationExceptionHandler", "p", "workerExecutionExceptionHandler", "", "Ljava/lang/String;", "()Ljava/lang/String;", "defaultProcessName", "", "I", "()I", "minimumLoggingLevel", "n", "minJobSchedulerId", "maxJobSchedulerId", "contentUriTriggerWorkersLimit", "maxSchedulerLimit", "", "Z", "isUsingDefaultTaskExecutor", "()Z", "s", "isMarkingJobsAsImportantWhileForeground$annotations", "()V", "isMarkingJobsAsImportantWhileForeground", "Landroidx/work/N;", "t", "Landroidx/work/N;", "()Landroidx/work/N;", "tracer", "u", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.c  reason: case insensitive filesystem */
public final class C7034c {

    /* renamed from: u  reason: collision with root package name */
    public static final b f45132u = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Executor f45133a;

    /* renamed from: b  reason: collision with root package name */
    private final C17168i f45134b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f45135c;

    /* renamed from: d  reason: collision with root package name */
    private final C7033b f45136d;

    /* renamed from: e  reason: collision with root package name */
    private final V f45137e;

    /* renamed from: f  reason: collision with root package name */
    private final C7046o f45138f;

    /* renamed from: g  reason: collision with root package name */
    private final L f45139g;

    /* renamed from: h  reason: collision with root package name */
    private final H2.a<Throwable> f45140h;

    /* renamed from: i  reason: collision with root package name */
    private final H2.a<Throwable> f45141i;

    /* renamed from: j  reason: collision with root package name */
    private final H2.a<U> f45142j;

    /* renamed from: k  reason: collision with root package name */
    private final H2.a<U> f45143k;

    /* renamed from: l  reason: collision with root package name */
    private final String f45144l;

    /* renamed from: m  reason: collision with root package name */
    private final int f45145m;

    /* renamed from: n  reason: collision with root package name */
    private final int f45146n;

    /* renamed from: o  reason: collision with root package name */
    private final int f45147o;

    /* renamed from: p  reason: collision with root package name */
    private final int f45148p;

    /* renamed from: q  reason: collision with root package name */
    private final int f45149q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f45150r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f45151s;

    /* renamed from: t  reason: collision with root package name */
    private final N f45152t;

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R$\u00101\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b\u0013\u0010.\"\u0004\b/\u00100R$\u00108\u001a\u0004\u0018\u0001028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010@\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b,\u0010=\"\u0004\b>\u0010?R*\u0010D\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R*\u0010I\u001a\n\u0012\u0004\u0012\u00020E\u0018\u0001098\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R*\u0010M\u001a\n\u0012\u0004\u0012\u00020E\u0018\u0001098\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010=\"\u0004\bL\u0010?R$\u0010T\u001a\u0004\u0018\u00010N8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\b!\u0010Q\"\u0004\bR\u0010SR\"\u0010Z\u001a\u00020U8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b4\u0010V\u001a\u0004\b;\u0010W\"\u0004\bX\u0010YR\"\u0010\\\u001a\u00020U8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bB\u0010V\u001a\u0004\bO\u0010W\"\u0004\b[\u0010YR\"\u0010^\u001a\u00020U8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b(\u0010V\u001a\u0004\bF\u0010W\"\u0004\b]\u0010YR\"\u0010a\u001a\u00020U8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b_\u0010V\u001a\u0004\bJ\u0010W\"\u0004\b`\u0010YR\"\u0010c\u001a\u00020U8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010V\u001a\u0004\b\u001a\u0010W\"\u0004\bb\u0010YR\"\u0010i\u001a\u00020d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bK\u0010e\u001a\u0004\bA\u0010f\"\u0004\bg\u0010hR$\u0010o\u001a\u0004\u0018\u00010j8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010k\u001a\u0004\b_\u0010l\"\u0004\bm\u0010n¨\u0006p"}, d2 = {"Landroidx/work/c$a;", "", "<init>", "()V", "Landroidx/work/V;", "workerFactory", "u", "(Landroidx/work/V;)Landroidx/work/c$a;", "Landroidx/work/c;", "a", "()Landroidx/work/c;", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "e", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "executor", "LdI/i;", "b", "LdI/i;", "q", "()LdI/i;", "setWorkerContext$work_runtime_release", "(LdI/i;)V", "workerContext", "c", "Landroidx/work/V;", "s", "()Landroidx/work/V;", "setWorkerFactory$work_runtime_release", "(Landroidx/work/V;)V", "Landroidx/work/o;", "d", "Landroidx/work/o;", "g", "()Landroidx/work/o;", "setInputMergerFactory$work_runtime_release", "(Landroidx/work/o;)V", "inputMergerFactory", "o", "setTaskExecutor$work_runtime_release", "taskExecutor", "Landroidx/work/b;", "f", "Landroidx/work/b;", "()Landroidx/work/b;", "setClock$work_runtime_release", "(Landroidx/work/b;)V", "clock", "Landroidx/work/L;", "Landroidx/work/L;", "m", "()Landroidx/work/L;", "setRunnableScheduler$work_runtime_release", "(Landroidx/work/L;)V", "runnableScheduler", "LH2/a;", "", "h", "LH2/a;", "()LH2/a;", "setInitializationExceptionHandler$work_runtime_release", "(LH2/a;)V", "initializationExceptionHandler", "i", "n", "setSchedulingExceptionHandler$work_runtime_release", "schedulingExceptionHandler", "Landroidx/work/U;", "j", "t", "setWorkerInitializationExceptionHandler$work_runtime_release", "workerInitializationExceptionHandler", "k", "r", "setWorkerExecutionExceptionHandler$work_runtime_release", "workerExecutionExceptionHandler", "", "l", "Ljava/lang/String;", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "defaultProcessName", "", "I", "()I", "setLoggingLevel$work_runtime_release", "(I)V", "loggingLevel", "setMinJobSchedulerId$work_runtime_release", "minJobSchedulerId", "setMaxJobSchedulerId$work_runtime_release", "maxJobSchedulerId", "p", "setMaxSchedulerLimit$work_runtime_release", "maxSchedulerLimit", "setContentUriTriggerWorkersLimit$work_runtime_release", "contentUriTriggerWorkersLimit", "", "Z", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "markJobsAsImportantWhileForeground", "Landroidx/work/N;", "Landroidx/work/N;", "()Landroidx/work/N;", "setTracer$work_runtime_release", "(Landroidx/work/N;)V", "tracer", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Executor f45153a;

        /* renamed from: b  reason: collision with root package name */
        private C17168i f45154b;

        /* renamed from: c  reason: collision with root package name */
        private V f45155c;

        /* renamed from: d  reason: collision with root package name */
        private C7046o f45156d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f45157e;

        /* renamed from: f  reason: collision with root package name */
        private C7033b f45158f;

        /* renamed from: g  reason: collision with root package name */
        private L f45159g;

        /* renamed from: h  reason: collision with root package name */
        private H2.a<Throwable> f45160h;

        /* renamed from: i  reason: collision with root package name */
        private H2.a<Throwable> f45161i;

        /* renamed from: j  reason: collision with root package name */
        private H2.a<U> f45162j;

        /* renamed from: k  reason: collision with root package name */
        private H2.a<U> f45163k;

        /* renamed from: l  reason: collision with root package name */
        private String f45164l;

        /* renamed from: m  reason: collision with root package name */
        private int f45165m = 4;

        /* renamed from: n  reason: collision with root package name */
        private int f45166n;

        /* renamed from: o  reason: collision with root package name */
        private int f45167o = Integer.MAX_VALUE;

        /* renamed from: p  reason: collision with root package name */
        private int f45168p = 20;

        /* renamed from: q  reason: collision with root package name */
        private int f45169q = 8;

        /* renamed from: r  reason: collision with root package name */
        private boolean f45170r = true;

        /* renamed from: s  reason: collision with root package name */
        private N f45171s;

        public final C7034c a() {
            return new C7034c(this);
        }

        public final C7033b b() {
            return this.f45158f;
        }

        public final int c() {
            return this.f45169q;
        }

        public final String d() {
            return this.f45164l;
        }

        public final Executor e() {
            return this.f45153a;
        }

        public final H2.a<Throwable> f() {
            return this.f45160h;
        }

        public final C7046o g() {
            return this.f45156d;
        }

        public final int h() {
            return this.f45165m;
        }

        public final boolean i() {
            return this.f45170r;
        }

        public final int j() {
            return this.f45167o;
        }

        public final int k() {
            return this.f45168p;
        }

        public final int l() {
            return this.f45166n;
        }

        public final L m() {
            return this.f45159g;
        }

        public final H2.a<Throwable> n() {
            return this.f45161i;
        }

        public final Executor o() {
            return this.f45157e;
        }

        public final N p() {
            return this.f45171s;
        }

        public final C17168i q() {
            return this.f45154b;
        }

        public final H2.a<U> r() {
            return this.f45163k;
        }

        public final V s() {
            return this.f45155c;
        }

        public final H2.a<U> t() {
            return this.f45162j;
        }

        public final a u(V v10) {
            C17542s.j(v10, "workerFactory");
            this.f45155c = v10;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/c$b;", "", "<init>", "()V", "", "MIN_SCHEDULER_LIMIT", "I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/work/c$c;", "", "Landroidx/work/c;", "b", "()Landroidx/work/c;", "workManagerConfiguration", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.c$c  reason: collision with other inner class name */
    public interface C0777c {
        C7034c b();
    }

    public C7034c(a aVar) {
        C17542s.j(aVar, "builder");
        C17168i q10 = aVar.q();
        Executor e10 = aVar.e();
        boolean z10 = false;
        if (e10 == null) {
            e10 = q10 != null ? C7035d.d(q10) : null;
            if (e10 == null) {
                e10 = C7035d.e(false);
            }
        }
        this.f45133a = e10;
        this.f45134b = q10 == null ? aVar.e() != null ? C16340x0.b(e10) : C16311i0.a() : q10;
        this.f45150r = aVar.o() == null ? true : z10;
        Executor o10 = aVar.o();
        this.f45135c = o10 == null ? C7035d.e(true) : o10;
        C7033b b10 = aVar.b();
        this.f45136d = b10 == null ? new M() : b10;
        V s10 = aVar.s();
        this.f45137e = s10 == null ? C7039h.f45202a : s10;
        C7046o g10 = aVar.g();
        this.f45138f = g10 == null ? A.f45054a : g10;
        L m10 = aVar.m();
        this.f45139g = m10 == null ? new C8509e() : m10;
        this.f45145m = aVar.h();
        this.f45146n = aVar.l();
        this.f45147o = aVar.j();
        this.f45149q = aVar.k();
        this.f45140h = aVar.f();
        this.f45141i = aVar.n();
        this.f45142j = aVar.t();
        this.f45143k = aVar.r();
        this.f45144l = aVar.d();
        this.f45148p = aVar.c();
        this.f45151s = aVar.i();
        N p10 = aVar.p();
        this.f45152t = p10 == null ? C7035d.f() : p10;
    }

    public final C7033b a() {
        return this.f45136d;
    }

    public final int b() {
        return this.f45148p;
    }

    public final String c() {
        return this.f45144l;
    }

    public final Executor d() {
        return this.f45133a;
    }

    public final H2.a<Throwable> e() {
        return this.f45140h;
    }

    public final C7046o f() {
        return this.f45138f;
    }

    public final int g() {
        return this.f45147o;
    }

    public final int h() {
        return this.f45149q;
    }

    public final int i() {
        return this.f45146n;
    }

    public final int j() {
        return this.f45145m;
    }

    public final L k() {
        return this.f45139g;
    }

    public final H2.a<Throwable> l() {
        return this.f45141i;
    }

    public final Executor m() {
        return this.f45135c;
    }

    public final N n() {
        return this.f45152t;
    }

    public final C17168i o() {
        return this.f45134b;
    }

    public final H2.a<U> p() {
        return this.f45143k;
    }

    public final V q() {
        return this.f45137e;
    }

    public final H2.a<U> r() {
        return this.f45142j;
    }

    public final boolean s() {
        return this.f45151s;
    }
}
