package androidx.compose.material3;

import O0.C4765z;
import Q0.q;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.Y0;
import U0.o1;
import U0.r;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.i;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5530a;
import m0.C5546i;
import m0.C5554m;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001c9BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R7\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t8B@BX\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00108\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00078\u0014@RX\u000e¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'¨\u0006:"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/i;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "", "shouldDismissOnBackPress", "Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "Lm0/a;", "", "Lm0/m;", "predictiveBackProgress", "LQJ/Q;", "scope", "<init>", "(Landroid/content/Context;Landroid/view/Window;ZLnI/a;Lm0/a;LQJ/Q;)V", "k", "()V", "l", "LU0/r;", "parent", "content", "m", "(LU0/r;LnI/p;)V", "a", "(LU0/m;I)V", "onAttachedToWindow", "onDetachedFromWindow", "i", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "j", "Z", "getShouldDismissOnBackPress", "()Z", "LnI/a;", "Lm0/a;", "LQJ/Q;", "<set-?>", "n", "LU0/r0;", "getContent", "()LnI/p;", "setContent", "(LnI/p;)V", "", "o", "Ljava/lang/Object;", "backCallback", "p", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ModalBottomSheetDialogLayout extends AbstractComposeView implements i {

    /* renamed from: i  reason: collision with root package name */
    private final Window f18643i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f18644j;

    /* renamed from: k  reason: collision with root package name */
    private final C17631a<C16807N> f18645k;

    /* renamed from: l  reason: collision with root package name */
    private final C5530a<Float, C5554m> f18646l;

    /* renamed from: m  reason: collision with root package name */
    private final Q f18647m;

    /* renamed from: n  reason: collision with root package name */
    private final C4899r0 f18648n = u1.e(C4765z.f11663a.a(), (o1) null, 2, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    private Object f18649o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f18650p;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout$a;", "", "<init>", "()V", "Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "Landroid/window/OnBackInvokedCallback;", "b", "(LnI/a;)Landroid/window/OnBackInvokedCallback;", "Landroid/view/View;", "view", "backCallback", "d", "(Landroid/view/View;Ljava/lang/Object;)V", "e", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18651a = new a();

        private a() {
        }

        public static final OnBackInvokedCallback b(C17631a<C16807N> aVar) {
            return new a(aVar);
        }

        /* access modifiers changed from: private */
        public static final void c(C17631a aVar) {
            aVar.invoke();
        }

        public static final void d(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj);
            }
        }

        public static final void e(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout$b;", "", "<init>", "()V", "Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "Lm0/a;", "", "Lm0/m;", "predictiveBackProgress", "LQJ/Q;", "scope", "Landroid/window/OnBackAnimationCallback;", "a", "(LnI/a;Lm0/a;LQJ/Q;)Landroid/window/OnBackAnimationCallback;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f18652a = new b();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"androidx/compose/material3/ModalBottomSheetDialogLayout$b$a", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", "LXH/N;", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Q f18653a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5530a<Float, C5554m> f18654b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f18655c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1", f = "ModalBottomSheet.android.kt", l = {419}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.ModalBottomSheetDialogLayout$b$a$a  reason: collision with other inner class name */
            static final class C0280a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f18656c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C5530a<Float, C5554m> f18657d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0280a(C5530a<Float, C5554m> aVar, C17164e<? super C0280a> eVar) {
                    super(2, eVar);
                    this.f18657d = aVar;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0280a(this.f18657d, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0280a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f18656c;
                    if (i10 == 0) {
                        y.b(obj);
                        C5530a<Float, C5554m> aVar = this.f18657d;
                        Float d10 = kotlin.coroutines.jvm.internal.b.d(0.0f);
                        this.f18656c = 1;
                        if (C5530a.f(aVar, d10, (C5546i) null, (Object) null, (C17642l) null, this, 14, (Object) null) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1", f = "ModalBottomSheet.android.kt", l = {410}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.ModalBottomSheetDialogLayout$b$a$b  reason: collision with other inner class name */
            static final class C0281b extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f18658c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C5530a<Float, C5554m> f18659d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ BackEvent f18660e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0281b(C5530a<Float, C5554m> aVar, BackEvent backEvent, C17164e<? super C0281b> eVar) {
                    super(2, eVar);
                    this.f18659d = aVar;
                    this.f18660e = backEvent;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0281b(this.f18659d, this.f18660e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0281b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f18658c;
                    if (i10 == 0) {
                        y.b(obj);
                        C5530a<Float, C5554m> aVar = this.f18659d;
                        Float d10 = kotlin.coroutines.jvm.internal.b.d(q.f12040a.a(this.f18660e.getProgress()));
                        this.f18658c = 1;
                        if (aVar.t(d10, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1", f = "ModalBottomSheet.android.kt", l = {404}, m = "invokeSuspend")
            static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f18661c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C5530a<Float, C5554m> f18662d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ BackEvent f18663e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(C5530a<Float, C5554m> aVar, BackEvent backEvent, C17164e<? super c> eVar) {
                    super(2, eVar);
                    this.f18662d = aVar;
                    this.f18663e = backEvent;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new c(this.f18662d, this.f18663e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f18661c;
                    if (i10 == 0) {
                        y.b(obj);
                        C5530a<Float, C5554m> aVar = this.f18662d;
                        Float d10 = kotlin.coroutines.jvm.internal.b.d(q.f12040a.a(this.f18663e.getProgress()));
                        this.f18661c = 1;
                        if (aVar.t(d10, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C16807N.f139792a;
                }
            }

            a(Q q10, C5530a<Float, C5554m> aVar, C17631a<C16807N> aVar2) {
                this.f18653a = q10;
                this.f18654b = aVar;
                this.f18655c = aVar2;
            }

            public void onBackCancelled() {
                F0 unused = C16314k.d(this.f18653a, (C17168i) null, (T) null, new C0280a(this.f18654b, (C17164e<? super C0280a>) null), 3, (Object) null);
            }

            public void onBackInvoked() {
                this.f18655c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                F0 unused = C16314k.d(this.f18653a, (C17168i) null, (T) null, new C0281b(this.f18654b, backEvent, (C17164e<? super C0281b>) null), 3, (Object) null);
            }

            public void onBackStarted(BackEvent backEvent) {
                F0 unused = C16314k.d(this.f18653a, (C17168i) null, (T) null, new c(this.f18654b, backEvent, (C17164e<? super c>) null), 3, (Object) null);
            }
        }

        private b() {
        }

        public static final OnBackAnimationCallback a(C17631a<C16807N> aVar, C5530a<Float, C5554m> aVar2, Q q10) {
            return new a(q10, aVar2, aVar);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetDialogLayout f18664c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f18665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ModalBottomSheetDialogLayout modalBottomSheetDialogLayout, int i10) {
            super(2);
            this.f18664c = modalBottomSheetDialogLayout;
            this.f18665d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f18664c.a(mVar, M0.a(this.f18665d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public ModalBottomSheetDialogLayout(Context context, Window window, boolean z10, C17631a<C16807N> aVar, C5530a<Float, C5554m> aVar2, Q q10) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.f18643i = window;
        this.f18644j = z10;
        this.f18645k = aVar;
        this.f18646l = aVar2;
        this.f18647m = q10;
    }

    private final p<C4889m, Integer, C16807N> getContent() {
        return (p) this.f18648n.getValue();
    }

    private final void k() {
        int i10;
        if (this.f18644j && (i10 = Build.VERSION.SDK_INT) >= 33) {
            if (this.f18649o == null) {
                this.f18649o = i10 >= 34 ? androidx.appcompat.app.i.a(b.a(this.f18645k, this.f18646l, this.f18647m)) : a.b(this.f18645k);
            }
            a.d(this, this.f18649o);
        }
    }

    private final void l() {
        if (Build.VERSION.SDK_INT >= 33) {
            a.e(this, this.f18649o);
        }
        this.f18649o = null;
    }

    private final void setContent(p<? super C4889m, ? super Integer, C16807N> pVar) {
        this.f18648n.setValue(pVar);
    }

    public void a(C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(576708319);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(576708319, i11, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:352)");
            }
            getContent().invoke(k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(this, i10));
        }
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f18650p;
    }

    public Window getWindow() {
        return this.f18643i;
    }

    public final void m(r rVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        setParentCompositionContext(rVar);
        setContent(pVar);
        this.f18650p = true;
        d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }
}
