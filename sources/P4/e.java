package P4;

import android.os.Bundle;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0019"}, d2 = {"LP4/e;", "", "LP4/f;", "owner", "<init>", "(LP4/f;)V", "LXH/N;", "c", "()V", "Landroid/os/Bundle;", "savedState", "d", "(Landroid/os/Bundle;)V", "outBundle", "e", "a", "LP4/f;", "LP4/d;", "b", "LP4/d;", "()LP4/d;", "savedStateRegistry", "", "Z", "attached", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39378d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final f f39379a;

    /* renamed from: b  reason: collision with root package name */
    private final d f39380b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39381c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LP4/e$a;", "", "<init>", "()V", "LP4/f;", "owner", "LP4/e;", "a", "(LP4/f;)LP4/e;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(f fVar) {
            C17542s.j(fVar, "owner");
            return new e(fVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ e(f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public static final e a(f fVar) {
        return f39378d.a(fVar);
    }

    public final d b() {
        return this.f39380b;
    }

    public final void c() {
        r lifecycle = this.f39379a.getLifecycle();
        if (lifecycle.d() == r.b.INITIALIZED) {
            lifecycle.c(new b(this.f39379a));
            this.f39380b.e(lifecycle);
            this.f39381c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void d(Bundle bundle) {
        if (!this.f39381c) {
            c();
        }
        r lifecycle = this.f39379a.getLifecycle();
        if (!lifecycle.d().b(r.b.STARTED)) {
            this.f39380b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.d()).toString());
    }

    public final void e(Bundle bundle) {
        C17542s.j(bundle, "outBundle");
        this.f39380b.g(bundle);
    }

    private e(f fVar) {
        this.f39379a = fVar;
        this.f39380b = new d();
    }
}
