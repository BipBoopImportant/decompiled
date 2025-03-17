package s0;

import I2.C0;
import I2.C4628p0;
import I2.I;
import android.os.Build;
import android.view.View;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010/\u001a\u00020&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u00105\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, d2 = {"Ls0/u;", "LI2/p0$b;", "Ljava/lang/Runnable;", "LI2/I;", "Landroid/view/View$OnAttachStateChangeListener;", "Ls0/U;", "composeInsets", "<init>", "(Ls0/U;)V", "LI2/p0;", "animation", "LXH/N;", "d", "(LI2/p0;)V", "LI2/p0$a;", "bounds", "f", "(LI2/p0;LI2/p0$a;)LI2/p0$a;", "LI2/C0;", "insets", "", "runningAnimations", "e", "(LI2/C0;Ljava/util/List;)LI2/C0;", "c", "Landroid/view/View;", "view", "a", "(Landroid/view/View;LI2/C0;)LI2/C0;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "Ls0/U;", "getComposeInsets", "()Ls0/U;", "", "Z", "getPrepared", "()Z", "setPrepared", "(Z)V", "prepared", "getRunningAnimation", "setRunningAnimation", "runningAnimation", "LI2/C0;", "getSavedInsets", "()LI2/C0;", "setSavedInsets", "(LI2/C0;)V", "savedInsets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.u  reason: case insensitive filesystem */
final class C5875u extends C4628p0.b implements Runnable, I, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    private final C5849U f28840c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28841d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28842e;

    /* renamed from: f  reason: collision with root package name */
    private C0 f28843f;

    public C5875u(C5849U u10) {
        super(u10.c() ^ true ? 1 : 0);
        this.f28840c = u10;
    }

    public C0 a(View view, C0 c02) {
        this.f28843f = c02;
        this.f28840c.n(c02);
        if (this.f28841d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f28842e) {
            this.f28840c.m(c02);
            C5849U.l(this.f28840c, c02, 0, 2, (Object) null);
        }
        return this.f28840c.c() ? C0.f8564b : c02;
    }

    public void c(C4628p0 p0Var) {
        this.f28841d = false;
        this.f28842e = false;
        C0 c02 = this.f28843f;
        if (!(p0Var.a() == 0 || c02 == null)) {
            this.f28840c.m(c02);
            this.f28840c.n(c02);
            C5849U.l(this.f28840c, c02, 0, 2, (Object) null);
        }
        this.f28843f = null;
        super.c(p0Var);
    }

    public void d(C4628p0 p0Var) {
        this.f28841d = true;
        this.f28842e = true;
        super.d(p0Var);
    }

    public C0 e(C0 c02, List<C4628p0> list) {
        C5849U.l(this.f28840c, c02, 0, 2, (Object) null);
        return this.f28840c.c() ? C0.f8564b : c02;
    }

    public C4628p0.a f(C4628p0 p0Var, C4628p0.a aVar) {
        this.f28841d = false;
        return super.f(p0Var, aVar);
    }

    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    public void onViewDetachedFromWindow(View view) {
    }

    public void run() {
        if (this.f28841d) {
            this.f28841d = false;
            this.f28842e = false;
            C0 c02 = this.f28843f;
            if (c02 != null) {
                this.f28840c.m(c02);
                C5849U.l(this.f28840c, c02, 0, 2, (Object) null);
                this.f28843f = null;
            }
        }
    }
}
