package Rp;

import QJ.Q;
import SJ.C16447w;
import SJ.C16449y;
import TJ.C16515L;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import android.app.Activity;
import androidx.activity.j;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.r;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"LRp/g;", "LQp/a;", "Landroidx/activity/j;", "activity", "Landroidx/lifecycle/r;", "lifecycle", "LQJ/Q;", "coroutineScope", "<init>", "(Landroidx/activity/j;Landroidx/lifecycle/r;LQJ/Q;)V", "LTJ/g;", "LXH/N;", "a", "()LTJ/g;", "LTJ/g;", "screenCaptured", "detectscreenshotrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements Qp.a {

    /* renamed from: a  reason: collision with root package name */
    private final C16532g<C16807N> f86953a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LSJ/y;", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.detectscreenshotrepository.impl.DetectScreenshotRepositoryImpl$screenCaptured$1", f = "DetectScreenshotRepositoryImpl.kt", l = {37}, m = "invokeSuspend")
    static final class a extends l implements p<C16449y<? super C16807N>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f86954c;

        /* renamed from: d  reason: collision with root package name */
        int f86955d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f86956e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f86957f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f86957f = jVar;
        }

        /* access modifiers changed from: private */
        public static final void m(C16449y yVar) {
            yVar.k(C16807N.f139792a);
        }

        /* access modifiers changed from: private */
        public static final C16807N n(j jVar, Activity.ScreenCaptureCallback screenCaptureCallback) {
            jVar.unregisterScreenCaptureCallback(screenCaptureCallback);
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f86957f, eVar);
            aVar.f86956e = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f86955d;
            if (i10 == 0) {
                y.b(obj);
                C16449y yVar = (C16449y) this.f86956e;
                e eVar = new e(yVar);
                j jVar = this.f86957f;
                jVar.registerScreenCaptureCallback(jVar.getMainExecutor(), eVar);
                f fVar = new f(this.f86957f, eVar);
                this.f86956e = yVar;
                this.f86954c = eVar;
                this.f86955d = 1;
                if (C16447w.a(yVar, fVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                c.a(this.f86954c);
                C16449y yVar2 = (C16449y) this.f86956e;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }

        /* renamed from: k */
        public final Object invoke(C16449y<? super C16807N> yVar, C17164e<? super C16807N> eVar) {
            return ((a) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "LXH/N;", "", "it", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.detectscreenshotrepository.impl.DetectScreenshotRepositoryImpl$screenCaptured$2", f = "DetectScreenshotRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements q<C16533h<? super C16807N>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86958c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f86959d;

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super C16807N> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            b bVar = new b(eVar);
            bVar.f86959d = th2;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f86958c == 0) {
                y.b(obj);
                Throwable th2 = (Throwable) this.f86959d;
                if (th2 instanceof SecurityException) {
                    return C16807N.f139792a;
                }
                throw th2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public g(j jVar, r rVar, Q q10) {
        C17542s.j(jVar, "activity");
        C17542s.j(rVar, "lifecycle");
        C17542s.j(q10, "coroutineScope");
        this.f86953a = C5208k.a(C16549x.h(C16534i.g(C16534i.f(new a(jVar, (C17164e<? super a>) null)), new b((C17164e<? super b>) null)), q10, C16515L.a.b(C16515L.f138570a, 0, 0, 3, (Object) null), 0, 4, (Object) null), rVar, r.b.STARTED);
    }

    public C16532g<C16807N> a() {
        return this.f86953a;
    }
}
