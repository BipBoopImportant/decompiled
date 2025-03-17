package androidx.compose.ui.platform;

import QJ.C16324p;
import QJ.Q;
import T1.S;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/platform/M;", "Landroidx/compose/ui/platform/L0;", "LQJ/Q;", "Landroid/view/View;", "view", "LT1/S;", "textInputService", "coroutineScope", "<init>", "(Landroid/view/View;LT1/S;LQJ/Q;)V", "Landroidx/compose/ui/platform/H0;", "request", "", "a", "(Landroidx/compose/ui/platform/H0;LdI/e;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "f", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Landroid/view/View;", "c", "()Landroid/view/View;", "b", "LT1/S;", "LQJ/Q;", "Li1/l;", "Landroidx/compose/ui/platform/r0;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "methodSessionMutex", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "", "g", "()Z", "isReadyForConnection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class M implements L0, Q {

    /* renamed from: a  reason: collision with root package name */
    private final View f19273a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final S f19274b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Q f19275c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference f19276d = l.a();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {73}, m = "startInputMethod")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f19277c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ M f19278d;

        /* renamed from: e  reason: collision with root package name */
        int f19279e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(M m10, C17164e<? super a> eVar) {
            super(eVar);
            this.f19278d = m10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f19277c = obj;
            this.f19279e |= Integer.MIN_VALUE;
            return this.f19278d.a((H0) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "it", "Landroidx/compose/ui/platform/r0;", "a", "(LQJ/Q;)Landroidx/compose/ui/platform/r0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Q, C5129r0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H0 f19280c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ M f19281d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ M f19282c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(M m10) {
                super(0);
                this.f19282c = m10;
            }

            public final void invoke() {
                QJ.S.e(this.f19282c.f19275c, (CancellationException) null, 1, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(H0 h02, M m10) {
            super(1);
            this.f19280c = h02;
            this.f19281d = m10;
        }

        /* renamed from: a */
        public final C5129r0 invoke(Q q10) {
            return new C5129r0(this.f19280c, new a(this.f19281d));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/r0;", "methodSession", "", "<anonymous>", "(Landroidx/compose/ui/platform/r0;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {185}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<C5129r0, C17164e<?>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f19283c;

        /* renamed from: d  reason: collision with root package name */
        int f19284d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f19285e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ M f19286f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<Throwable, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5129r0 f19287c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ M f19288d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5129r0 r0Var, M m10) {
                super(1);
                this.f19287c = r0Var;
                this.f19288d = m10;
            }

            public final void a(Throwable th2) {
                this.f19287c.d();
                this.f19288d.f19274b.f();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(M m10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f19286f = m10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f19286f, eVar);
            cVar.f19285e = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C5129r0 r0Var, C17164e<?> eVar) {
            return ((c) create(r0Var, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f19284d;
            if (i10 == 0) {
                y.b(obj);
                C5129r0 r0Var = (C5129r0) this.f19285e;
                M m10 = this.f19286f;
                this.f19285e = r0Var;
                this.f19283c = m10;
                this.f19284d = 1;
                C16324p pVar = new C16324p(C17187b.c(this), 1);
                pVar.C();
                m10.f19274b.e();
                pVar.K(new a(r0Var, m10));
                Object w10 = pVar.w();
                if (w10 == C17187b.f()) {
                    h.c(this);
                }
                if (w10 == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                M m11 = (M) this.f19283c;
                C5129r0 r0Var2 = (C5129r0) this.f19285e;
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    public M(View view, S s10, Q q10) {
        this.f19273a = view;
        this.f19274b = s10;
        this.f19275c = q10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(androidx.compose.ui.platform.H0 r6, dI.C17164e<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.M.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.ui.platform.M$a r0 = (androidx.compose.ui.platform.M.a) r0
            int r1 = r0.f19279e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19279e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.M$a r0 = new androidx.compose.ui.platform.M$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f19277c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f19279e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            XH.y.b(r7)
            goto L_0x004a
        L_0x0031:
            XH.y.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f19276d
            androidx.compose.ui.platform.M$b r2 = new androidx.compose.ui.platform.M$b
            r2.<init>(r6, r5)
            androidx.compose.ui.platform.M$c r6 = new androidx.compose.ui.platform.M$c
            r4 = 0
            r6.<init>(r5, r4)
            r0.f19279e = r3
            java.lang.Object r6 = i1.l.d(r7, r2, r6, r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            XH.k r6 = new XH.k
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.M.a(androidx.compose.ui.platform.H0, dI.e):java.lang.Object");
    }

    public View c() {
        return this.f19273a;
    }

    public final InputConnection f(EditorInfo editorInfo) {
        C5129r0 r0Var = (C5129r0) l.c(this.f19276d);
        if (r0Var != null) {
            return r0Var.c(editorInfo);
        }
        return null;
    }

    public final boolean g() {
        C5129r0 r0Var = (C5129r0) l.c(this.f19276d);
        return r0Var != null && r0Var.e();
    }

    public C17168i getCoroutineContext() {
        return this.f19275c.getCoroutineContext();
    }
}
