package f5;

import K4.m;
import QJ.C16311i0;
import SJ.C16447w;
import SJ.C16449y;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import android.app.Activity;
import android.content.Context;
import dI.C17164e;
import eI.C17187b;
import g5.C7872a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lf5/i;", "Lf5/f;", "Lf5/m;", "windowMetricsCalculator", "Lg5/a;", "windowBackend", "<init>", "(Lf5/m;Lg5/a;)V", "Landroid/content/Context;", "context", "LTJ/g;", "Lf5/k;", "b", "(Landroid/content/Context;)LTJ/g;", "Landroid/app/Activity;", "activity", "a", "(Landroid/app/Activity;)LTJ/g;", "Lf5/m;", "c", "Lg5/a;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements f {

    /* renamed from: b  reason: collision with root package name */
    private final m f51148b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C7872a f51149c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSJ/y;", "Lf5/k;", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {50}, m = "invokeSuspend")
    static final class a extends l implements p<C16449y<? super k>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f51150c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f51151d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f51152e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f51153f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: f5.i$a$a  reason: collision with other inner class name */
        static final class C0842a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i f51154c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ H2.a<k> f51155d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0842a(i iVar, H2.a<k> aVar) {
                super(0);
                this.f51154c = iVar;
                this.f51155d = aVar;
            }

            public final void invoke() {
                this.f51154c.f51149c.a(this.f51155d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, Context context, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f51152e = iVar;
            this.f51153f = context;
        }

        /* access modifiers changed from: private */
        public static final void k(C16449y yVar, k kVar) {
            yVar.k(kVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f51152e, this.f51153f, eVar);
            aVar.f51151d = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f51150c;
            if (i10 == 0) {
                y.b(obj);
                C16449y yVar = (C16449y) this.f51151d;
                h hVar = new h(yVar);
                this.f51152e.f51149c.b(this.f51153f, new m(), hVar);
                C0842a aVar = new C0842a(this.f51152e, hVar);
                this.f51150c = 1;
                if (C16447w.a(yVar, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }

        /* renamed from: j */
        public final Object invoke(C16449y<? super k> yVar, C17164e<? super C16807N> eVar) {
            return ((a) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSJ/y;", "Lf5/k;", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", l = {63}, m = "invokeSuspend")
    static final class b extends l implements p<C16449y<? super k>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f51156c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f51157d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f51158e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Activity f51159f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i f51160c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ H2.a<k> f51161d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar, H2.a<k> aVar) {
                super(0);
                this.f51160c = iVar;
                this.f51161d = aVar;
            }

            public final void invoke() {
                this.f51160c.f51149c.a(this.f51161d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, Activity activity, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f51158e = iVar;
            this.f51159f = activity;
        }

        /* access modifiers changed from: private */
        public static final void k(C16449y yVar, k kVar) {
            yVar.k(kVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f51158e, this.f51159f, eVar);
            bVar.f51157d = obj;
            return bVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f51156c;
            if (i10 == 0) {
                y.b(obj);
                C16449y yVar = (C16449y) this.f51157d;
                j jVar = new j(yVar);
                this.f51158e.f51149c.b(this.f51159f, new m(), jVar);
                a aVar = new a(this.f51158e, jVar);
                this.f51156c = 1;
                if (C16447w.a(yVar, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }

        /* renamed from: j */
        public final Object invoke(C16449y<? super k> yVar, C17164e<? super C16807N> eVar) {
            return ((b) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    public i(m mVar, C7872a aVar) {
        C17542s.j(mVar, "windowMetricsCalculator");
        C17542s.j(aVar, "windowBackend");
        this.f51148b = mVar;
        this.f51149c = aVar;
    }

    public C16532g<k> a(Activity activity) {
        C17542s.j(activity, "activity");
        return C16534i.L(C16534i.f(new b(this, activity, (C17164e<? super b>) null)), C16311i0.c());
    }

    public C16532g<k> b(Context context) {
        C17542s.j(context, "context");
        return C16534i.L(C16534i.f(new a(this, context, (C17164e<? super a>) null)), C16311i0.c());
    }
}
