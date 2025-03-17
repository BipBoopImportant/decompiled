package E0;

import C0.c;
import E0.q0;
import E1.C4488v;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import SJ.C16428d;
import T1.C4840i;
import T1.C4849s;
import T1.H;
import T1.P;
import T1.r;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16533h;
import U0.C4884j0;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import androidx.compose.ui.platform.K0;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import o1.C5669i;
import p1.O0;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJM\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJK\u0010(\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0003R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u00101R\u001c\u00105\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001008BX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"LE0/a;", "LE0/q0;", "<init>", "()V", "Lkotlin/Function1;", "LE0/s0;", "LXH/N;", "initializeRequest", "q", "(LnI/l;)V", "LT1/P;", "value", "LT1/s;", "imeOptions", "", "LT1/i;", "onEditCommand", "LT1/r;", "onImeActionPerformed", "d", "(LT1/P;LT1/s;LnI/l;LnI/l;)V", "b", "c", "oldValue", "newValue", "a", "(LT1/P;LT1/P;)V", "Lo1/i;", "rect", "f", "(Lo1/i;)V", "textFieldValue", "LT1/H;", "offsetMapping", "LN1/P;", "textLayoutResult", "Lp1/O0;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "h", "(LT1/P;LT1/H;LN1/P;LnI/l;Lo1/i;Lo1/i;)V", "k", "LQJ/F0;", "LQJ/F0;", "job", "LE0/s0;", "currentRequest", "LTJ/A;", "LTJ/A;", "backingStylusHandwritingTrigger", "p", "()LTJ/A;", "stylusHandwritingTrigger", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: E0.a  reason: case insensitive filesystem */
public final class C4443a extends q0 {

    /* renamed from: b  reason: collision with root package name */
    private F0 f5674b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public s0 f5675c;

    /* renamed from: d  reason: collision with root package name */
    private C16504A<C16807N> f5676d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE0/s0;", "it", "LXH/N;", "a", "(LE0/s0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: E0.a$a  reason: collision with other inner class name */
    static final class C0037a extends C17544u implements C17642l<s0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ P f5677c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4443a f5678d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4849s f5679e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<List<? extends C4840i>, C16807N> f5680f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<r, C16807N> f5681g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0037a(P p10, C4443a aVar, C4849s sVar, C17642l<? super List<? extends C4840i>, C16807N> lVar, C17642l<? super r, C16807N> lVar2) {
            super(1);
            this.f5677c = p10;
            this.f5678d = aVar;
            this.f5679e = sVar;
            this.f5680f = lVar;
            this.f5681g = lVar2;
        }

        public final void a(s0 s0Var) {
            s0Var.l(this.f5677c, this.f5678d.i(), this.f5679e, this.f5680f, this.f5681g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/K0;", "", "<anonymous>", "(Landroidx/compose/ui/platform/K0;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: E0.a$b */
    static final class b extends l implements p<K0, C17164e<?>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f5682c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f5683d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<s0, C16807N> f5684e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4443a f5685f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q0.a f5686g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {146}, m = "invokeSuspend")
        /* renamed from: E0.a$b$a  reason: collision with other inner class name */
        static final class C0038a extends l implements p<Q, C17164e<?>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f5687c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f5688d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ K0 f5689e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17642l<s0, C16807N> f5690f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C4443a f5691g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ q0.a f5692h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {137, 138}, m = "invokeSuspend")
            /* renamed from: E0.a$b$a$a  reason: collision with other inner class name */
            static final class C0039a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f5693c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C4443a f5694d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ l0 f5695e;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: E0.a$b$a$a$a  reason: collision with other inner class name */
                static final class C0040a extends C17544u implements C17642l<Long, C16807N> {

                    /* renamed from: c  reason: collision with root package name */
                    public static final C0040a f5696c = new C0040a();

                    C0040a() {
                        super(1);
                    }

                    public final void a(long j10) {
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Number) obj).longValue());
                        return C16807N.f139792a;
                    }
                }

                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXH/N;", "it", "c", "(LXH/N;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
                /* renamed from: E0.a$b$a$a$b  reason: collision with other inner class name */
                static final class C0041b<T> implements C16533h {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ l0 f5697a;

                    C0041b(l0 l0Var) {
                        this.f5697a = l0Var;
                    }

                    /* renamed from: c */
                    public final Object emit(C16807N n10, C17164e<? super C16807N> eVar) {
                        this.f5697a.h();
                        return C16807N.f139792a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0039a(C4443a aVar, l0 l0Var, C17164e<? super C0039a> eVar) {
                    super(2, eVar);
                    this.f5694d = aVar;
                    this.f5695e = l0Var;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0039a(this.f5694d, this.f5695e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0039a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f5693c;
                    if (i10 == 0) {
                        y.b(obj);
                        C0040a aVar = C0040a.f5696c;
                        this.f5693c = 1;
                        if (C4884j0.b(aVar, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y.b(obj);
                        throw new C16820k();
                    }
                    C16504A m10 = this.f5694d.p();
                    if (m10 == null) {
                        return C16807N.f139792a;
                    }
                    C0041b bVar = new C0041b(this.f5695e);
                    this.f5693c = 2;
                    if (m10.collect(bVar, this) == f10) {
                        return f10;
                    }
                    throw new C16820k();
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: E0.a$b$a$b  reason: collision with other inner class name */
            /* synthetic */ class C0042b extends C17540p implements C17642l<O0, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ q0.a f5698a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0042b(q0.a aVar) {
                    super(1, C17542s.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f5698a = aVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    t(((O0) obj).r());
                    return C16807N.f139792a;
                }

                public final void t(float[] fArr) {
                    C4443a.r(this.f5698a, fArr);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0038a(K0 k02, C17642l<? super s0, C16807N> lVar, C4443a aVar, q0.a aVar2, C17164e<? super C0038a> eVar) {
                super(2, eVar);
                this.f5689e = k02;
                this.f5690f = lVar;
                this.f5691g = aVar;
                this.f5692h = aVar2;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C0038a aVar = new C0038a(this.f5689e, this.f5690f, this.f5691g, this.f5692h, eVar);
                aVar.f5688d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<?> eVar) {
                return ((C0038a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f5687c;
                if (i10 == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f5688d;
                    l0 invoke = r0.c().invoke(this.f5689e.c());
                    s0 s0Var = new s0(this.f5689e.c(), new C0042b(this.f5692h), invoke);
                    if (c.a()) {
                        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C0039a(this.f5691g, invoke, (C17164e<? super C0039a>) null), 3, (Object) null);
                    }
                    C17642l<s0, C16807N> lVar = this.f5690f;
                    if (lVar != null) {
                        lVar.invoke(s0Var);
                    }
                    this.f5691g.f5675c = s0Var;
                    K0 k02 = this.f5689e;
                    this.f5687c = 1;
                    if (k02.a(s0Var, this) == f10) {
                        return f10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    try {
                        y.b(obj);
                    } catch (Throwable th2) {
                        this.f5691g.f5675c = null;
                        throw th2;
                    }
                }
                throw new C16820k();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17642l<? super s0, C16807N> lVar, C4443a aVar, q0.a aVar2, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f5684e = lVar;
            this.f5685f = aVar;
            this.f5686g = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f5684e, this.f5685f, this.f5686g, eVar);
            bVar.f5683d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(K0 k02, C17164e<?> eVar) {
            return ((b) create(k02, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f5682c;
            if (i10 == 0) {
                y.b(obj);
                C0038a aVar = new C0038a((K0) this.f5683d, this.f5684e, this.f5685f, this.f5686g, (C17164e<? super C0038a>) null);
                this.f5682c = 1;
                if (S.f(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    /* access modifiers changed from: private */
    public final C16504A<C16807N> p() {
        C16504A<C16807N> a10 = this.f5676d;
        if (a10 != null) {
            return a10;
        }
        if (!c.a()) {
            return null;
        }
        C16504A<C16807N> b10 = C16511H.b(1, 0, C16428d.DROP_LATEST, 2, (Object) null);
        this.f5676d = b10;
        return b10;
    }

    private final void q(C17642l<? super s0, C16807N> lVar) {
        q0.a i10 = i();
        if (i10 != null) {
            this.f5674b = i10.t0(new b(lVar, this, i10, (C17164e<? super b>) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void r(q0.a aVar, float[] fArr) {
        C4488v x10 = aVar.x();
        if (x10 != null) {
            if (!x10.c()) {
                x10 = null;
            }
            if (x10 != null) {
                x10.c0(fArr);
            }
        }
    }

    public void a(P p10, P p11) {
        s0 s0Var = this.f5675c;
        if (s0Var != null) {
            s0Var.m(p10, p11);
        }
    }

    public void b() {
        q((C17642l<? super s0, C16807N>) null);
    }

    public void c() {
        F0 f02 = this.f5674b;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f5674b = null;
        C16504A<C16807N> p10 = p();
        if (p10 != null) {
            p10.f();
        }
    }

    public void d(P p10, C4849s sVar, C17642l<? super List<? extends C4840i>, C16807N> lVar, C17642l<? super r, C16807N> lVar2) {
        q(new C0037a(p10, this, sVar, lVar, lVar2));
    }

    public void f(C5669i iVar) {
        s0 s0Var = this.f5675c;
        if (s0Var != null) {
            s0Var.j(iVar);
        }
    }

    public void h(P p10, H h10, N1.P p11, C17642l<? super O0, C16807N> lVar, C5669i iVar, C5669i iVar2) {
        s0 s0Var = this.f5675c;
        if (s0Var != null) {
            s0Var.n(p10, h10, p11, iVar, iVar2);
        }
    }

    public void k() {
        C16504A<C16807N> p10 = p();
        if (p10 != null) {
            p10.a(C16807N.f139792a);
        }
    }
}
