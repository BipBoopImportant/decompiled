package Rb;

import HJ.C15854t;
import Nb.g;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"LRb/f;", "", "Ljava/util/concurrent/ExecutorService;", "backgroundExecutorService", "blockingExecutorService", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "LRb/e;", "a", "LRb/e;", "common", "b", "diskWrite", "c", "dataCollect", "d", "network", "e", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f63179e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static boolean f63180f;

    /* renamed from: a  reason: collision with root package name */
    public final e f63181a;

    /* renamed from: b  reason: collision with root package name */
    public final e f63182b;

    /* renamed from: c  reason: collision with root package name */
    public final e f63183c;

    /* renamed from: d  reason: collision with root package name */
    public final e f63184d;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0003R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u000b0\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LRb/f$a;", "", "<init>", "()V", "", "m", "()Z", "l", "k", "Lkotlin/Function0;", "isCorrectThread", "", "failureMessage", "LXH/N;", "h", "(LnI/a;LnI/a;)V", "g", "f", "e", "kotlin.jvm.PlatformType", "j", "()Ljava/lang/String;", "threadName", "enforcement", "Z", "i", "n", "(Z)V", "getEnforcement$annotations", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: Rb.f$a$a  reason: collision with other inner class name */
        /* synthetic */ class C1077a extends C17540p implements C17631a<Boolean> {
            C1077a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            /* renamed from: t */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).k());
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17631a<String> {

            /* renamed from: c  reason: collision with root package name */
            public static final b f63185c = new b();

            b() {
                super(0);
            }

            /* renamed from: b */
            public final String invoke() {
                return "Must be called on a background thread, was called on " + f.f63179e.j() + '.';
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class c extends C17540p implements C17631a<Boolean> {
            c(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            /* renamed from: t */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).l());
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        static final class d extends C17544u implements C17631a<String> {

            /* renamed from: c  reason: collision with root package name */
            public static final d f63186c = new d();

            d() {
                super(0);
            }

            /* renamed from: b */
            public final String invoke() {
                return "Must be called on a blocking thread, was called on " + f.f63179e.j() + '.';
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class e extends C17540p implements C17631a<Boolean> {
            e(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            /* renamed from: t */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).m());
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: Rb.f$a$f  reason: collision with other inner class name */
        static final class C1078f extends C17544u implements C17631a<String> {

            /* renamed from: c  reason: collision with root package name */
            public static final C1078f f63187c = new C1078f();

            C1078f() {
                super(0);
            }

            /* renamed from: b */
            public final String invoke() {
                return "Must not be called on a main thread, was called on " + f.f63179e.j() + '.';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void h(C17631a<Boolean> aVar, C17631a<String> aVar2) {
            if (!aVar.invoke().booleanValue()) {
                g.f().b(aVar2.invoke());
                i();
            }
        }

        /* access modifiers changed from: private */
        public final String j() {
            return Thread.currentThread().getName();
        }

        /* access modifiers changed from: private */
        public final boolean k() {
            String j10 = j();
            C17542s.i(j10, "threadName");
            return C15854t.d0(j10, "Firebase Background Thread #", false, 2, (Object) null);
        }

        /* access modifiers changed from: private */
        public final boolean l() {
            String j10 = j();
            C17542s.i(j10, "threadName");
            return C15854t.d0(j10, "Firebase Blocking Thread #", false, 2, (Object) null);
        }

        /* access modifiers changed from: private */
        public final boolean m() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void e() {
            h(new C1077a(this), b.f63185c);
        }

        public final void f() {
            h(new c(this), d.f63186c);
        }

        public final void g() {
            h(new e(this), C1078f.f63187c);
        }

        public final boolean i() {
            return f.f63180f;
        }

        public final void n(boolean z10) {
            f.f63180f = z10;
        }

        private a() {
        }
    }

    public f(ExecutorService executorService, ExecutorService executorService2) {
        C17542s.j(executorService, "backgroundExecutorService");
        C17542s.j(executorService2, "blockingExecutorService");
        this.f63181a = new e(executorService);
        this.f63182b = new e(executorService);
        this.f63183c = new e(executorService);
        this.f63184d = new e(executorService2);
    }

    public static final void c() {
        f63179e.e();
    }

    public static final void d() {
        f63179e.f();
    }

    public static final void e() {
        f63179e.g();
    }

    public static final void f(boolean z10) {
        f63179e.n(z10);
    }
}
