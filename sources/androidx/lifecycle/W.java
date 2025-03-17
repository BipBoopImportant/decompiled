package androidx.lifecycle;

import P4.d;
import androidx.lifecycle.r;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@BX\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/lifecycle/W;", "Landroidx/lifecycle/v;", "Ljava/io/Closeable;", "", "key", "Landroidx/lifecycle/U;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/U;)V", "LP4/d;", "registry", "Landroidx/lifecycle/r;", "lifecycle", "LXH/N;", "d", "(LP4/d;Landroidx/lifecycle/r;)V", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "close", "()V", "a", "Ljava/lang/String;", "b", "Landroidx/lifecycle/U;", "f", "()Landroidx/lifecycle/U;", "", "<set-?>", "c", "Z", "g", "()Z", "isAttached", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class W implements C5218v, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final String f22218a;

    /* renamed from: b  reason: collision with root package name */
    private final U f22219b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22220c;

    public W(String str, U u10) {
        C17542s.j(str, "key");
        C17542s.j(u10, "handle");
        this.f22218a = str;
        this.f22219b = u10;
    }

    public void close() {
    }

    public final void d(d dVar, r rVar) {
        C17542s.j(dVar, "registry");
        C17542s.j(rVar, "lifecycle");
        if (!this.f22220c) {
            this.f22220c = true;
            rVar.c(this);
            dVar.h(this.f22218a, this.f22219b.k());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public void e(C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "source");
        C17542s.j(aVar, "event");
        if (aVar == r.a.ON_DESTROY) {
            this.f22220c = false;
            yVar.getLifecycle().g(this);
        }
    }

    public final U f() {
        return this.f22219b;
    }

    public final boolean g() {
        return this.f22220c;
    }
}
