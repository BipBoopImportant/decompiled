package androidx.activity;

import XH.C16807N;
import YH.C16869m;
import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u000458\u001c#B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u00109¨\u0006<"}, d2 = {"Landroidx/activity/w;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "LH2/a;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;LH2/a;)V", "(Ljava/lang/Runnable;)V", "shouldBeRegistered", "LXH/N;", "p", "(Z)V", "q", "()V", "Landroidx/activity/b;", "backEvent", "n", "(Landroidx/activity/b;)V", "m", "k", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "o", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/v;", "onBackPressedCallback", "h", "(Landroidx/activity/v;)V", "Landroidx/activity/c;", "j", "(Landroidx/activity/v;)Landroidx/activity/c;", "Landroidx/lifecycle/y;", "owner", "i", "(Landroidx/lifecycle/y;Landroidx/activity/v;)V", "l", "a", "Ljava/lang/Runnable;", "b", "LH2/a;", "LYH/m;", "c", "LYH/m;", "onBackPressedCallbacks", "d", "Landroidx/activity/v;", "inProgressCallback", "Landroid/window/OnBackInvokedCallback;", "e", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "f", "Landroid/window/OnBackInvokedDispatcher;", "invokedDispatcher", "g", "Z", "backInvokedCallbackRegistered", "hasEnabledCallbacks", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f15306a;

    /* renamed from: b  reason: collision with root package name */
    private final H2.a<Boolean> f15307b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C16869m<v> f15308c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public v f15309d;

    /* renamed from: e  reason: collision with root package name */
    private OnBackInvokedCallback f15310e;

    /* renamed from: f  reason: collision with root package name */
    private OnBackInvokedDispatcher f15311f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15312g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15313h;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/b;", "backEvent", "LXH/N;", "a", "(Landroidx/activity/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C4987b, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f15314c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(w wVar) {
            super(1);
            this.f15314c = wVar;
        }

        public final void a(C4987b bVar) {
            C17542s.j(bVar, "backEvent");
            this.f15314c.n(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4987b) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/b;", "backEvent", "LXH/N;", "a", "(Landroidx/activity/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C4987b, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f15315c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(w wVar) {
            super(1);
            this.f15315c = wVar;
        }

        public final void a(C4987b bVar) {
            C17542s.j(bVar, "backEvent");
            this.f15315c.m(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4987b) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f15316c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(w wVar) {
            super(0);
            this.f15316c = wVar;
        }

        public final void invoke() {
            this.f15316c.l();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f15317c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(w wVar) {
            super(0);
            this.f15317c = wVar;
        }

        public final void invoke() {
            this.f15317c.k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f15318c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(w wVar) {
            super(0);
            this.f15318c = wVar;
        }

        public final void invoke() {
            this.f15318c.l();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/w$f;", "", "<init>", "()V", "dispatcher", "", "priority", "callback", "LXH/N;", "d", "(Ljava/lang/Object;ILjava/lang/Object;)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "b", "(LnI/a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f15319a = new f();

        private f() {
        }

        /* access modifiers changed from: private */
        public static final void c(C17631a aVar) {
            aVar.invoke();
        }

        public final OnBackInvokedCallback b(C17631a<C16807N> aVar) {
            C17542s.j(aVar, "onBackInvoked");
            return new x(aVar);
        }

        public final void d(Object obj, int i10, Object obj2) {
            C17542s.j(obj, "dispatcher");
            C17542s.j(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            C17542s.j(obj, "dispatcher");
            C17542s.j(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/w$g;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/activity/b;", "LXH/N;", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "a", "(LnI/l;LnI/l;LnI/a;LnI/a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f15320a = new g();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"androidx/activity/w$g$a", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", "LXH/N;", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17642l<C4987b, C16807N> f15321a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<C4987b, C16807N> f15322b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f15323c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f15324d;

            a(C17642l<? super C4987b, C16807N> lVar, C17642l<? super C4987b, C16807N> lVar2, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
                this.f15321a = lVar;
                this.f15322b = lVar2;
                this.f15323c = aVar;
                this.f15324d = aVar2;
            }

            public void onBackCancelled() {
                this.f15324d.invoke();
            }

            public void onBackInvoked() {
                this.f15323c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                C17542s.j(backEvent, "backEvent");
                this.f15322b.invoke(new C4987b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                C17542s.j(backEvent, "backEvent");
                this.f15321a.invoke(new C4987b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(C17642l<? super C4987b, C16807N> lVar, C17642l<? super C4987b, C16807N> lVar2, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
            C17542s.j(lVar, "onBackStarted");
            C17542s.j(lVar2, "onBackProgressed");
            C17542s.j(aVar, "onBackInvoked");
            C17542s.j(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/w$h;", "Landroidx/lifecycle/v;", "Landroidx/activity/c;", "Landroidx/lifecycle/r;", "lifecycle", "Landroidx/activity/v;", "onBackPressedCallback", "<init>", "(Landroidx/activity/w;Landroidx/lifecycle/r;Landroidx/activity/v;)V", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "cancel", "()V", "a", "Landroidx/lifecycle/r;", "b", "Landroidx/activity/v;", "c", "Landroidx/activity/c;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class h implements C5218v, C4988c {

        /* renamed from: a  reason: collision with root package name */
        private final r f15325a;

        /* renamed from: b  reason: collision with root package name */
        private final v f15326b;

        /* renamed from: c  reason: collision with root package name */
        private C4988c f15327c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w f15328d;

        public h(w wVar, r rVar, v vVar) {
            C17542s.j(rVar, "lifecycle");
            C17542s.j(vVar, "onBackPressedCallback");
            this.f15328d = wVar;
            this.f15325a = rVar;
            this.f15326b = vVar;
            rVar.c(this);
        }

        public void cancel() {
            this.f15325a.g(this);
            this.f15326b.removeCancellable(this);
            C4988c cVar = this.f15327c;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f15327c = null;
        }

        public void e(C5221y yVar, r.a aVar) {
            C17542s.j(yVar, "source");
            C17542s.j(aVar, "event");
            if (aVar == r.a.ON_START) {
                this.f15327c = this.f15328d.j(this.f15326b);
            } else if (aVar == r.a.ON_STOP) {
                C4988c cVar = this.f15327c;
                if (cVar != null) {
                    cVar.cancel();
                }
            } else if (aVar == r.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/activity/w$i;", "Landroidx/activity/c;", "Landroidx/activity/v;", "onBackPressedCallback", "<init>", "(Landroidx/activity/w;Landroidx/activity/v;)V", "LXH/N;", "cancel", "()V", "a", "Landroidx/activity/v;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class i implements C4988c {

        /* renamed from: a  reason: collision with root package name */
        private final v f15329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f15330b;

        public i(w wVar, v vVar) {
            C17542s.j(vVar, "onBackPressedCallback");
            this.f15330b = wVar;
            this.f15329a = vVar;
        }

        public void cancel() {
            this.f15330b.f15308c.remove(this.f15329a);
            if (C17542s.e(this.f15330b.f15309d, this.f15329a)) {
                this.f15329a.handleOnBackCancelled();
                this.f15330b.f15309d = null;
            }
            this.f15329a.removeCancellable(this);
            C17631a<C16807N> enabledChangedCallback$activity_release = this.f15329a.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f15329a.setEnabledChangedCallback$activity_release((C17631a<C16807N>) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class j extends C17540p implements C17631a<C16807N> {
        j(Object obj) {
            super(0, obj, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((w) this.receiver).q();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class k extends C17540p implements C17631a<C16807N> {
        k(Object obj) {
            super(0, obj, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((w) this.receiver).q();
        }
    }

    public w() {
        this((Runnable) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final void k() {
        v vVar;
        v vVar2 = this.f15309d;
        if (vVar2 == null) {
            C16869m<v> mVar = this.f15308c;
            ListIterator<v> listIterator = mVar.listIterator(mVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = null;
                    break;
                }
                vVar = listIterator.previous();
                if (vVar.isEnabled()) {
                    break;
                }
            }
            vVar2 = vVar;
        }
        this.f15309d = null;
        if (vVar2 != null) {
            vVar2.handleOnBackCancelled();
        }
    }

    /* access modifiers changed from: private */
    public final void m(C4987b bVar) {
        v vVar;
        v vVar2 = this.f15309d;
        if (vVar2 == null) {
            C16869m<v> mVar = this.f15308c;
            ListIterator<v> listIterator = mVar.listIterator(mVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = null;
                    break;
                }
                vVar = listIterator.previous();
                if (vVar.isEnabled()) {
                    break;
                }
            }
            vVar2 = vVar;
        }
        if (vVar2 != null) {
            vVar2.handleOnBackProgressed(bVar);
        }
    }

    /* access modifiers changed from: private */
    public final void n(C4987b bVar) {
        v vVar;
        C16869m<v> mVar = this.f15308c;
        ListIterator<v> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                vVar = null;
                break;
            }
            vVar = listIterator.previous();
            if (vVar.isEnabled()) {
                break;
            }
        }
        v vVar2 = vVar;
        if (this.f15309d != null) {
            k();
        }
        this.f15309d = vVar2;
        if (vVar2 != null) {
            vVar2.handleOnBackStarted(bVar);
        }
    }

    private final void p(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f15311f;
        OnBackInvokedCallback onBackInvokedCallback = this.f15310e;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z10 && !this.f15312g) {
                f.f15319a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f15312g = true;
            } else if (!z10 && this.f15312g) {
                f.f15319a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f15312g = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void q() {
        boolean z10 = this.f15313h;
        C16869m<v> mVar = this.f15308c;
        boolean z11 = false;
        if (mVar == null || !mVar.isEmpty()) {
            Iterator<T> it = mVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((v) it.next()).isEnabled()) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f15313h = z11;
        if (z11 != z10) {
            H2.a<Boolean> aVar = this.f15307b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z11);
            }
        }
    }

    public final void h(v vVar) {
        C17542s.j(vVar, "onBackPressedCallback");
        j(vVar);
    }

    public final void i(C5221y yVar, v vVar) {
        C17542s.j(yVar, "owner");
        C17542s.j(vVar, "onBackPressedCallback");
        r lifecycle = yVar.getLifecycle();
        if (lifecycle.d() != r.b.DESTROYED) {
            vVar.addCancellable(new h(this, lifecycle, vVar));
            q();
            vVar.setEnabledChangedCallback$activity_release(new j(this));
        }
    }

    public final C4988c j(v vVar) {
        C17542s.j(vVar, "onBackPressedCallback");
        this.f15308c.add(vVar);
        i iVar = new i(this, vVar);
        vVar.addCancellable(iVar);
        q();
        vVar.setEnabledChangedCallback$activity_release(new k(this));
        return iVar;
    }

    public final void l() {
        v vVar;
        v vVar2 = this.f15309d;
        if (vVar2 == null) {
            C16869m<v> mVar = this.f15308c;
            ListIterator<v> listIterator = mVar.listIterator(mVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = null;
                    break;
                }
                vVar = listIterator.previous();
                if (vVar.isEnabled()) {
                    break;
                }
            }
            vVar2 = vVar;
        }
        this.f15309d = null;
        if (vVar2 != null) {
            vVar2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f15306a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C17542s.j(onBackInvokedDispatcher, "invoker");
        this.f15311f = onBackInvokedDispatcher;
        p(this.f15313h);
    }

    public w(Runnable runnable, H2.a<Boolean> aVar) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f15306a = runnable;
        this.f15307b = aVar;
        this.f15308c = new C16869m<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                onBackInvokedCallback = g.f15320a.a(new a(this), new b(this), new c(this), new d(this));
            } else {
                onBackInvokedCallback = f.f15319a.b(new e(this));
            }
            this.f15310e = onBackInvokedCallback;
        }
    }

    public w(Runnable runnable) {
        this(runnable, (H2.a<Boolean>) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Runnable runnable, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : runnable);
    }
}
