package androidx.compose.ui.platform;

import QJ.C16342y0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import RJ.C16387h;
import U0.O0;
import U0.r;
import XH.C16807N;
import XH.y;
import android.view.View;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/G1;", "", "<init>", "()V", "Landroid/view/View;", "rootView", "LU0/O0;", "a", "(Landroid/view/View;)LU0/O0;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/F1;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class G1 {

    /* renamed from: a  reason: collision with root package name */
    public static final G1 f19208a = new G1();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<F1> f19209b = new AtomicReference<>(F1.f19205a.c());

    /* renamed from: c  reason: collision with root package name */
    public static final int f19210c = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/G1$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "LXH/N;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ F0 f19211a;

        a(F0 f02) {
            this.f19211a = f02;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            F0.a.a(this.f19211a, (CancellationException) null, 1, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {235}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f19212c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O0 f19213d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f19214e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(O0 o02, View view, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f19213d = o02;
            this.f19214e = view;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f19213d, this.f19214e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f19212c;
            if (i10 == 0) {
                y.b(obj);
                O0 o02 = this.f19213d;
                this.f19212c = 1;
                if (o02.m0(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    if (H1.f(this.f19214e) == this.f19213d) {
                        H1.i(this.f19214e, (r) null);
                    }
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (H1.f(this.f19214e) == this.f19213d) {
                H1.i(this.f19214e, (r) null);
            }
            return C16807N.f139792a;
        }
    }

    private G1() {
    }

    public final O0 a(View view) {
        O0 a10 = f19209b.get().a(view);
        H1.i(view, a10);
        view.addOnAttachStateChangeListener(new a(C16314k.d(C16342y0.f137687a, C16387h.b(view.getHandler(), "windowRecomposer cleanup").R0(), (T) null, new b(a10, view, (C17164e<? super b>) null), 2, (Object) null)));
        return a10;
    }
}
