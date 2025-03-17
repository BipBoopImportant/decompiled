package O8;

import D8.c;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x8.C8958b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LO8/e;", "", "LO8/d;", "crashEventReporter", "Lx8/b;", "libraryInterface", "LD8/c;", "logger", "<init>", "(LO8/d;Lx8/b;LD8/c;)V", "LXH/N;", "a", "()V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)V", "d", "", "b", "()Z", "LO8/d;", "Lx8/b;", "LD8/c;", "LO8/f;", "LO8/f;", "errorCrashHandler", "e", "Z", "isStarted", "LO8/a;", "f", "LO8/a;", "applicationData", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final d f39283a;

    /* renamed from: b  reason: collision with root package name */
    private final C8958b f39284b;

    /* renamed from: c  reason: collision with root package name */
    private final c f39285c;

    /* renamed from: d  reason: collision with root package name */
    private f f39286d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f39287e;

    /* renamed from: f  reason: collision with root package name */
    private a f39288f;

    public e(d dVar, C8958b bVar, c cVar) {
        C17542s.j(dVar, "crashEventReporter");
        C17542s.j(bVar, "libraryInterface");
        C17542s.j(cVar, "logger");
        this.f39283a = dVar;
        this.f39284b = bVar;
        this.f39285c = cVar;
    }

    private final void a() {
        if (b()) {
            this.f39283a.h();
        } else {
            this.f39283a.d();
        }
    }

    public final boolean b() {
        return this.f39284b.c("crash_reporter");
    }

    public final void c(Context context) {
        C17542s.j(context, "context");
        if (!this.f39287e) {
            a a10 = a.f39265e.a(context);
            this.f39288f = a10;
            f fVar = new f(Thread.getDefaultUncaughtExceptionHandler(), a10, this.f39283a, this.f39284b);
            this.f39286d = fVar;
            Thread.setDefaultUncaughtExceptionHandler(fVar);
            a();
            this.f39287e = true;
            this.f39285c.j("Crash Reporter is enabled");
        }
    }

    public final void d() {
        if (this.f39287e) {
            f fVar = this.f39286d;
            Thread.setDefaultUncaughtExceptionHandler(fVar != null ? fVar.g() : null);
            this.f39286d = null;
            this.f39287e = false;
            this.f39285c.j("Crash Reporter is disabled");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(d dVar, C8958b bVar, c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, bVar, (i10 & 4) != 0 ? new c("CrashHandlerController") : cVar);
    }
}
