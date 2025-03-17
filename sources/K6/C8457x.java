package k6;

import QJ.C16311i0;
import QJ.C16342y0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import QJ.Y;
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
import r6.F;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lk6/x;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "LQJ/Y;", "Lk6/l;", "job", "Lk6/v;", "b", "(LQJ/Y;)Lk6/v;", "LXH/N;", "a", "()V", "Lk6/w;", "request", "c", "(Lk6/w;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "Lk6/v;", "currentDisposable", "LQJ/F0;", "LQJ/F0;", "pendingClear", "d", "Lk6/w;", "currentRequest", "", "e", "Z", "isRestart", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: k6.x  reason: case insensitive filesystem */
public final class C8457x implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f54277a;

    /* renamed from: b  reason: collision with root package name */
    private C8455v f54278b;

    /* renamed from: c  reason: collision with root package name */
    private F0 f54279c;

    /* renamed from: d  reason: collision with root package name */
    private C8456w f54280d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f54281e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "coil3.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: k6.x$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f54282c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C8457x f54283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C8457x xVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f54283d = xVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f54283d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f54282c == 0) {
                y.b(obj);
                this.f54283d.c((C8456w) null);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C8457x(View view) {
        this.f54277a = view;
    }

    public final synchronized void a() {
        try {
            F0 f02 = this.f54279c;
            if (f02 != null) {
                F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            }
            this.f54279c = C16314k.d(C16342y0.f137687a, C16311i0.c().P0(), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
            this.f54278b = null;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized C8455v b(Y<? extends C8445l> y10) {
        C8455v vVar = this.f54278b;
        if (vVar == null || !F.i() || !this.f54281e) {
            F0 f02 = this.f54279c;
            if (f02 != null) {
                F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            }
            this.f54279c = null;
            C8455v vVar2 = new C8455v(this.f54277a, y10);
            this.f54278b = vVar2;
            return vVar2;
        }
        this.f54281e = false;
        vVar.b(y10);
        return vVar;
    }

    public final void c(C8456w wVar) {
        C8456w wVar2 = this.f54280d;
        if (wVar2 != null) {
            wVar2.d();
        }
        this.f54280d = wVar;
    }

    public void onViewAttachedToWindow(View view) {
        C8456w wVar = this.f54280d;
        if (wVar != null) {
            this.f54281e = true;
            wVar.f();
        }
    }

    public void onViewDetachedFromWindow(View view) {
        C8456w wVar = this.f54280d;
        if (wVar != null) {
            wVar.d();
        }
    }
}
