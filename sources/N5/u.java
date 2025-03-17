package N5;

import QJ.C16311i0;
import QJ.C16342y0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import QJ.Y;
import S5.j;
import XH.C16807N;
import XH.y;
import android.view.View;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"LN5/u;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "LQJ/Y;", "LN5/i;", "job", "LN5/s;", "b", "(LQJ/Y;)LN5/s;", "LXH/N;", "a", "()V", "LN5/t;", "request", "c", "(LN5/t;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "LN5/s;", "currentDisposable", "LQJ/F0;", "LQJ/F0;", "pendingClear", "d", "LN5/t;", "currentRequest", "", "e", "Z", "isRestart", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f39116a;

    /* renamed from: b  reason: collision with root package name */
    private s f39117b;

    /* renamed from: c  reason: collision with root package name */
    private F0 f39118c;

    /* renamed from: d  reason: collision with root package name */
    private t f39119d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f39120e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f39121c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u f39122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f39122d = uVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f39122d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f39121c == 0) {
                y.b(obj);
                this.f39122d.c((t) null);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public u(View view) {
        this.f39116a = view;
    }

    public final synchronized void a() {
        try {
            F0 f02 = this.f39118c;
            if (f02 != null) {
                F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            }
            this.f39118c = C16314k.d(C16342y0.f137687a, C16311i0.c().P0(), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
            this.f39117b = null;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized s b(Y<? extends i> y10) {
        s sVar = this.f39117b;
        if (sVar == null || !j.t() || !this.f39120e) {
            F0 f02 = this.f39118c;
            if (f02 != null) {
                F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            }
            this.f39118c = null;
            s sVar2 = new s(this.f39116a, y10);
            this.f39117b = sVar2;
            return sVar2;
        }
        this.f39120e = false;
        sVar.a(y10);
        return sVar;
    }

    public final void c(t tVar) {
        t tVar2 = this.f39119d;
        if (tVar2 != null) {
            tVar2.a();
        }
        this.f39119d = tVar;
    }

    public void onViewAttachedToWindow(View view) {
        t tVar = this.f39119d;
        if (tVar != null) {
            this.f39120e = true;
            tVar.b();
        }
    }

    public void onViewDetachedFromWindow(View view) {
        t tVar = this.f39119d;
        if (tVar != null) {
            tVar.a();
        }
    }
}
