package O8;

import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import jI.C17423j;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import x8.C8958b;
import y8.C8992a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e¨\u0006 "}, d2 = {"LO8/d;", "", "Lx8/b;", "libraryInterface", "LO8/c;", "dataUploader", "LQJ/M;", "backgroundDispatcher", "<init>", "(Lx8/b;LO8/c;LQJ/M;)V", "LXH/N;", "c", "()V", "g", "", "it", "e", "(Ljava/lang/String;)V", "Ly8/a;", "crashWrapped", "f", "(Ly8/a;)V", "h", "d", "a", "Lx8/b;", "b", "LO8/c;", "LQJ/M;", "LD8/c;", "LD8/c;", "logger", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f39274e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C8958b f39275a;

    /* renamed from: b  reason: collision with root package name */
    private final c f39276b;

    /* renamed from: c  reason: collision with root package name */
    private final M f39277c;

    /* renamed from: d  reason: collision with root package name */
    private final D8.c f39278d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LO8/d$a;", "", "<init>", "()V", "", "CRASH_PATH", "Ljava/lang/String;", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "com.contentsquare.android.error.analysis.crash.CrashEventReporter$deletePendingCrashEvents$1", f = "CrashEventReporter.kt", l = {}, m = "invokeSuspend")
    public static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f39279c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f39280d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f39280d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f39280d, eVar);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f39279c == 0) {
                y.b(obj);
                this.f39280d.c();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "com.contentsquare.android.error.analysis.crash.CrashEventReporter$sendPendingCrashEvents$1", f = "CrashEventReporter.kt", l = {}, m = "invokeSuspend")
    public static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f39281c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f39282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f39282d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f39282d, eVar);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f39281c == 0) {
                y.b(obj);
                this.f39282d.g();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    public d(C8958b bVar, c cVar, M m10) {
        C17542s.j(bVar, "libraryInterface");
        C17542s.j(cVar, "dataUploader");
        C17542s.j(m10, "backgroundDispatcher");
        this.f39275a = bVar;
        this.f39276b = cVar;
        this.f39277c = m10;
        this.f39278d = new D8.c("CrashEventReporter");
    }

    /* access modifiers changed from: private */
    public final synchronized void c() {
        try {
            for (String file : this.f39275a.g()) {
                new File(file).delete();
            }
        } catch (IOException e10) {
            this.f39278d.i(e10, "Failed to delete crash file");
        }
    }

    private final void e(String str) {
        JsonConfig.ProjectConfiguration b10;
        File file = new File(str);
        byte[] g10 = C17423j.g(file);
        if (!(g10.length == 0)) {
            A8.b a10 = this.f39275a.a();
            String j10 = (a10 == null || (b10 = a10.b()) == null) ? null : b10.j();
            if (this.f39276b.a(j10 + "/mobile/v1/crashes", g10, this.f39275a.n())) {
                this.f39275a.p(g10);
                file.delete();
            }
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void g() {
        try {
            for (String e10 : this.f39275a.g()) {
                e(e10);
            }
        } catch (IOException e11) {
            this.f39278d.i(e11, "Failed to send crash file");
        }
    }

    public final void d() {
        F0 unused = C16314k.d(S.a(this.f39277c), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final void f(C8992a aVar) {
        C17542s.j(aVar, "crashWrapped");
        this.f39275a.h(aVar);
        this.f39275a.l(aVar);
    }

    public final void h() {
        F0 unused = C16314k.d(S.a(this.f39277c), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(C8958b bVar, c cVar, M m10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, cVar, (i10 & 4) != 0 ? C16311i0.b() : m10);
    }
}
