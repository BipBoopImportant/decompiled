package androidx.compose.ui.platform;

import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import U0.C4897q;
import U0.C4910x;
import U0.J0;
import U0.P;
import XH.C16807N;
import XH.y;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import c1.c;
import dI.C17164e;
import eI.C17187b;
import h1.d;
import i1.i;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.W;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u0014\u0010)\u001a\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/ui/platform/I1;", "LU0/q;", "Landroidx/lifecycle/v;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;LU0/q;)V", "Lkotlin/Function0;", "LXH/N;", "content", "m", "(LnI/p;)V", "b", "()V", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "E", "()Landroidx/compose/ui/platform/AndroidComposeView;", "LU0/q;", "D", "()LU0/q;", "", "c", "Z", "disposed", "Landroidx/lifecycle/r;", "d", "Landroidx/lifecycle/r;", "addedToLifecycle", "LnI/p;", "lastContent", "f", "()Z", "isDisposed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class I1 implements C4897q, C5218v {

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f19246a;

    /* renamed from: b  reason: collision with root package name */
    private final C4897q f19247b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f19248c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public r f19249d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public p<? super C4889m, ? super Integer, C16807N> f19250e = C5097e0.f19442a.a();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "it", "LXH/N;", "a", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<AndroidComposeView.b, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ I1 f19251c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f19252d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.I1$a$a  reason: collision with other inner class name */
        static final class C0297a extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ I1 f19253c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f19254d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1", f = "Wrapper.android.kt", l = {148}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.I1$a$a$a  reason: collision with other inner class name */
            static final class C0298a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f19255c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ I1 f19256d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0298a(I1 i12, C17164e<? super C0298a> eVar) {
                    super(2, eVar);
                    this.f19256d = i12;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0298a(this.f19256d, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0298a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f19255c;
                    if (i10 == 0) {
                        y.b(obj);
                        AndroidComposeView E10 = this.f19256d.E();
                        this.f19255c = 1;
                        if (E10.e0(this) == f10) {
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
            @f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1", f = "Wrapper.android.kt", l = {151}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.I1$a$a$b */
            static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f19257c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ I1 f19258d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(I1 i12, C17164e<? super b> eVar) {
                    super(2, eVar);
                    this.f19258d = i12;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new b(this.f19258d, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f19257c;
                    if (i10 == 0) {
                        y.b(obj);
                        AndroidComposeView E10 = this.f19258d.E();
                        this.f19257c = 1;
                        if (E10.f0(this) == f10) {
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

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.platform.I1$a$a$c */
            static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ I1 f19259c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ p<C4889m, Integer, C16807N> f19260d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(I1 i12, p<? super C4889m, ? super Integer, C16807N> pVar) {
                    super(2);
                    this.f19259c = i12;
                    this.f19260d = pVar;
                }

                public final void a(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(-1193460702, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                        }
                        AndroidCompositionLocals_androidKt.a(this.f19259c.E(), this.f19260d, mVar, 0);
                        if (C4895p.J()) {
                            C4895p.R();
                            return;
                        }
                        return;
                    }
                    mVar.L();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((C4889m) obj, ((Number) obj2).intValue());
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0297a(I1 i12, p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(2);
                this.f19253c = i12;
                this.f19254d = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)");
                    }
                    Object tag = this.f19253c.E().getTag(i.f24339K);
                    Set set = W.s(tag) ? (Set) tag : null;
                    if (set == null) {
                        ViewParent parent = this.f19253c.E().getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(i.f24339K) : null;
                        set = W.s(tag2) ? (Set) tag2 : null;
                    }
                    if (set != null) {
                        set.add(mVar.E());
                        mVar.z();
                    }
                    AndroidComposeView E10 = this.f19253c.E();
                    boolean F10 = mVar.F(this.f19253c);
                    I1 i12 = this.f19253c;
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C0298a(i12, (C17164e<? super C0298a>) null);
                        mVar.u(D10);
                    }
                    P.g(E10, (p) D10, mVar, 0);
                    AndroidComposeView E11 = this.f19253c.E();
                    boolean F11 = mVar.F(this.f19253c);
                    I1 i13 = this.f19253c;
                    Object D11 = mVar.D();
                    if (F11 || D11 == C4889m.f14007a.a()) {
                        D11 = new b(i13, (C17164e<? super b>) null);
                        mVar.u(D11);
                    }
                    P.g(E11, (p) D11, mVar, 0);
                    C4910x.a(d.a().d(set), c1.c.e(-1193460702, true, new c(this.f19253c, this.f19254d), mVar, 54), mVar, J0.f13770i | 48);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(I1 i12, p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(1);
            this.f19251c = i12;
            this.f19252d = pVar;
        }

        public final void a(AndroidComposeView.b bVar) {
            if (!this.f19251c.f19248c) {
                r lifecycle = bVar.a().getLifecycle();
                this.f19251c.f19250e = this.f19252d;
                if (this.f19251c.f19249d == null) {
                    this.f19251c.f19249d = lifecycle;
                    lifecycle.c(this.f19251c);
                } else if (lifecycle.d().b(r.b.CREATED)) {
                    this.f19251c.D().m(c.c(-2000640158, true, new C0297a(this.f19251c, this.f19252d)));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AndroidComposeView.b) obj);
            return C16807N.f139792a;
        }
    }

    public I1(AndroidComposeView androidComposeView, C4897q qVar) {
        this.f19246a = androidComposeView;
        this.f19247b = qVar;
    }

    public final C4897q D() {
        return this.f19247b;
    }

    public final AndroidComposeView E() {
        return this.f19246a;
    }

    public void b() {
        if (!this.f19248c) {
            this.f19248c = true;
            this.f19246a.getView().setTag(i.f24340L, (Object) null);
            r rVar = this.f19249d;
            if (rVar != null) {
                rVar.g(this);
            }
        }
        this.f19247b.b();
    }

    public void e(C5221y yVar, r.a aVar) {
        if (aVar == r.a.ON_DESTROY) {
            b();
        } else if (aVar == r.a.ON_CREATE && !this.f19248c) {
            m(this.f19250e);
        }
    }

    public boolean f() {
        return this.f19247b.f();
    }

    public void m(p<? super C4889m, ? super Integer, C16807N> pVar) {
        this.f19246a.setOnViewTreeOwnersAvailable(new a(this, pVar));
    }
}
