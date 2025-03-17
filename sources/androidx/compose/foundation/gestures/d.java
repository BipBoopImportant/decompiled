package androidx.compose.foundation.gestures;

import A1.B;
import A1.C4349p;
import A1.K;
import A1.U;
import A1.W;
import A1.r;
import G1.C4505h;
import G1.C4506i;
import G1.C4510m;
import G1.s0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import SJ.C16438n;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.gestures.c;
import androidx.compose.ui.platform.C5100f0;
import androidx.compose.ui.platform.w1;
import c2.z;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import p0.v;
import r0.C5809a;
import r0.C5810b;
import r0.m;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0019H@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH@¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010#\u001a\u00020\u000f2.\u0010\"\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001eH¦@¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H&ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H&ø\u0001\u0000¢\u0006\u0004\b+\u0010(J\u000f\u0010,\u001a\u00020\u0006H&¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010\u0011J*\u00105\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u0010\u0011J\r\u00108\u001a\u00020\u000f¢\u0006\u0004\b8\u0010\u0011JO\u0010:\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010;R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R<\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0004@BX\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR$\u0010\b\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00068\u0004@BX\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010-R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010>\u001a\u0004\u0018\u00010\t8\u0004@BX\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010@R\u001e\u0010P\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010DR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010X\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/gestures/d;", "LG1/m;", "LG1/s0;", "LG1/h;", "Lkotlin/Function1;", "LA1/B;", "", "canDrag", "enabled", "Lr0/m;", "interactionSource", "Lp0/v;", "orientationLock", "<init>", "(LnI/l;ZLr0/m;Lp0/v;)V", "LXH/N;", "b3", "()V", "LA1/W;", "U2", "()LA1/W;", "Landroidx/compose/foundation/gestures/c$c;", "event", "Y2", "(Landroidx/compose/foundation/gestures/c$c;LdI/e;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/c$d;", "Z2", "(Landroidx/compose/foundation/gestures/c$d;LdI/e;)Ljava/lang/Object;", "X2", "(LdI/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/c$b;", "LdI/e;", "", "forEachDelta", "R2", "(LnI/p;LdI/e;)Ljava/lang/Object;", "Lo1/g;", "startedPosition", "V2", "(J)V", "Lc2/y;", "velocity", "W2", "a3", "()Z", "n2", "LA1/p;", "pointerEvent", "LA1/r;", "pass", "Lc2/r;", "bounds", "T1", "(LA1/p;LA1/r;J)V", "s1", "Q2", "shouldResetPointerInputHandling", "c3", "(LnI/l;ZLr0/m;Lp0/v;Z)V", "p", "Lp0/v;", "<set-?>", "q", "LnI/l;", "S2", "()LnI/l;", "r", "Z", "T2", "s", "Lr0/m;", "getInteractionSource", "()Lr0/m;", "t", "_canDrag", "LSJ/j;", "Landroidx/compose/foundation/gestures/c;", "u", "LSJ/j;", "channel", "Lr0/b;", "v", "Lr0/b;", "dragInteraction", "w", "isListeningForEvents", "x", "LA1/W;", "pointerInputNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class d extends C4510m implements s0, C4505h {
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public v f17735p;

    /* renamed from: q  reason: collision with root package name */
    private C17642l<? super B, Boolean> f17736q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f17737r;

    /* renamed from: s  reason: collision with root package name */
    private m f17738s;

    /* renamed from: t  reason: collision with root package name */
    private final C17642l<B, Boolean> f17739t = new a(this);
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public C16434j<c> f17740u;

    /* renamed from: v  reason: collision with root package name */
    private C5810b f17741v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f17742w;

    /* renamed from: x  reason: collision with root package name */
    private W f17743x;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "it", "", "a", "(LA1/B;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<B, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f17744c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.f17744c = dVar;
        }

        /* renamed from: a */
        public final Boolean invoke(B b10) {
            return this.f17744c.S2().invoke(b10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1", f = "Draggable.kt", l = {524}, m = "invokeSuspend")
    static final class b extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17745c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17746d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f17747e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {526}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f17748c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f17749d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ d f17750e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ K f17751f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ q<B, B, C5667g, C16807N> f17752g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C17642l<B, C16807N> f17753h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f17754i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C17631a<Boolean> f17755j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ p<B, C5667g, C16807N> f17756k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, K k10, q<? super B, ? super B, ? super C5667g, C16807N> qVar, C17642l<? super B, C16807N> lVar, C17631a<C16807N> aVar, C17631a<Boolean> aVar2, p<? super B, ? super C5667g, C16807N> pVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f17750e = dVar;
                this.f17751f = k10;
                this.f17752g = qVar;
                this.f17753h = lVar;
                this.f17754i = aVar;
                this.f17755j = aVar2;
                this.f17756k = pVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f17750e, this.f17751f, this.f17752g, this.f17753h, this.f17754i, this.f17755j, this.f17756k, eVar);
                aVar.f17749d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                CancellationException e10;
                Q q10;
                Object f10 = C17187b.f();
                int i10 = this.f17748c;
                if (i10 == 0) {
                    y.b(obj);
                    Q q11 = (Q) this.f17749d;
                    try {
                        v J22 = this.f17750e.f17735p;
                        K k10 = this.f17751f;
                        q<B, B, C5667g, C16807N> qVar = this.f17752g;
                        C17642l<B, C16807N> lVar = this.f17753h;
                        C17631a<C16807N> aVar = this.f17754i;
                        C17631a<Boolean> aVar2 = this.f17755j;
                        p<B, C5667g, C16807N> pVar = this.f17756k;
                        this.f17749d = q11;
                        this.f17748c = 1;
                        if (p0.m.g(k10, qVar, lVar, aVar, aVar2, J22, pVar, this) == f10) {
                            return f10;
                        }
                    } catch (CancellationException e11) {
                        CancellationException cancellationException = e11;
                        q10 = q11;
                        e10 = cancellationException;
                        C16434j I22 = this.f17750e.f17740u;
                        if (I22 != null) {
                            C16438n.b(I22.k(c.a.f17731a));
                        }
                        if (!S.h(q10)) {
                            throw e10;
                        }
                        return C16807N.f139792a;
                    }
                } else if (i10 == 1) {
                    q10 = (Q) this.f17749d;
                    try {
                        y.b(obj);
                    } catch (CancellationException e12) {
                        e10 = e12;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LA1/B;", "change", "Lo1/g;", "delta", "LXH/N;", "a", "(LA1/B;J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.d$b$b  reason: collision with other inner class name */
        static final class C0258b extends C17544u implements p<B, C5667g, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ B1.d f17757c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ d f17758d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0258b(B1.d dVar, d dVar2) {
                super(2);
                this.f17757c = dVar;
                this.f17758d = dVar2;
            }

            public final void a(B b10, long j10) {
                B1.e.c(this.f17757c, b10);
                C16434j I22 = this.f17758d.f17740u;
                if (I22 != null) {
                    C16438n.b(I22.k(new c.b(j10, (DefaultConstructorMarker) null)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((B) obj, ((C5667g) obj2).v());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class c extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f17759c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(d dVar) {
                super(0);
                this.f17759c = dVar;
            }

            public final void invoke() {
                C16434j I22 = this.f17759c.f17740u;
                if (I22 != null) {
                    C16438n.b(I22.k(c.a.f17731a));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "upEvent", "LXH/N;", "a", "(LA1/B;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.d$b$d  reason: collision with other inner class name */
        static final class C0259d extends C17544u implements C17642l<B, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ B1.d f17760c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ d f17761d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0259d(B1.d dVar, d dVar2) {
                super(1);
                this.f17760c = dVar;
                this.f17761d = dVar2;
            }

            public final void a(B b10) {
                B1.e.c(this.f17760c, b10);
                float f10 = ((w1) C4506i.a(this.f17761d, C5100f0.r())).f();
                long c10 = this.f17760c.c(z.a(f10, f10));
                this.f17760c.f();
                C16434j I22 = this.f17761d.f17740u;
                if (I22 != null) {
                    C16438n.b(I22.k(new c.d(p0.q.l(c10), (DefaultConstructorMarker) null)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((B) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LA1/B;", "down", "slopTriggerChange", "Lo1/g;", "postSlopOffset", "LXH/N;", "a", "(LA1/B;LA1/B;J)V"}, k = 3, mv = {1, 8, 0})
        static final class e extends C17544u implements q<B, B, C5667g, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f17762c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ B1.d f17763d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(d dVar, B1.d dVar2) {
                super(3);
                this.f17762c = dVar;
                this.f17763d = dVar2;
            }

            public final void a(B b10, B b11, long j10) {
                if (this.f17762c.S2().invoke(b10).booleanValue()) {
                    if (!this.f17762c.f17742w) {
                        if (this.f17762c.f17740u == null) {
                            this.f17762c.f17740u = C16437m.b(Integer.MAX_VALUE, (C16428d) null, (C17642l) null, 6, (Object) null);
                        }
                        this.f17762c.b3();
                    }
                    B1.e.c(this.f17763d, b10);
                    long q10 = C5667g.q(b11.h(), j10);
                    C16434j I22 = this.f17762c.f17740u;
                    if (I22 != null) {
                        C16438n.b(I22.k(new c.C0257c(q10, (DefaultConstructorMarker) null)));
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((B) obj, (B) obj2, ((C5667g) obj3).v());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class f extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f17764c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(d dVar) {
                super(0);
                this.f17764c = dVar;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(!this.f17764c.a3());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f17747e = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f17747e, eVar);
            bVar.f17746d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((b) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17745c;
            if (i10 == 0) {
                y.b(obj);
                B1.d dVar = new B1.d();
                e eVar = new e(this.f17747e, dVar);
                C0259d dVar2 = new C0259d(dVar, this.f17747e);
                c cVar = new c(this.f17747e);
                f fVar = new f(this.f17747e);
                C0258b bVar = new C0258b(dVar, this.f17747e);
                a aVar = new a(this.f17747e, (K) this.f17746d, eVar, dVar2, cVar, fVar, bVar, (C17164e<? super a>) null);
                this.f17745c = 1;
                if (S.f(aVar, this) == f10) {
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {566}, m = "processDragCancel")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f17765c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f17766d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f17767e;

        /* renamed from: f  reason: collision with root package name */
        int f17768f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f17767e = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17766d = obj;
            this.f17768f |= Integer.MIN_VALUE;
            return this.f17767e.X2(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {548, 551}, m = "processDragStart")
    /* renamed from: androidx.compose.foundation.gestures.d$d  reason: collision with other inner class name */
    static final class C0260d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f17769c;

        /* renamed from: d  reason: collision with root package name */
        Object f17770d;

        /* renamed from: e  reason: collision with root package name */
        Object f17771e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f17772f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f17773g;

        /* renamed from: h  reason: collision with root package name */
        int f17774h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0260d(d dVar, C17164e<? super C0260d> eVar) {
            super(eVar);
            this.f17773g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17772f = obj;
            this.f17774h |= Integer.MIN_VALUE;
            return this.f17773g.Y2((c.C0257c) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {558}, m = "processDragStop")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f17775c;

        /* renamed from: d  reason: collision with root package name */
        Object f17776d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f17777e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f17778f;

        /* renamed from: g  reason: collision with root package name */
        int f17779g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f17778f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17777e = obj;
            this.f17779g |= Integer.MIN_VALUE;
            return this.f17778f.Z2((c.d) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f17780c;

        /* renamed from: d  reason: collision with root package name */
        Object f17781d;

        /* renamed from: e  reason: collision with root package name */
        int f17782e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f17783f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f17784g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/c$b;", "LXH/N;", "processDelta", "<anonymous>", "(LnI/l;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {438}, m = "invokeSuspend")
        static final class a extends l implements p<C17642l<? super c.b, ? extends C16807N>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f17785c;

            /* renamed from: d  reason: collision with root package name */
            int f17786d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f17787e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ O<c> f17788f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f17789g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(O<c> o10, d dVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f17788f = o10;
                this.f17789g = dVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f17788f, this.f17789g, eVar);
                aVar.f17787e = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C17642l<? super c.b, C16807N> lVar, C17164e<? super C16807N> eVar) {
                return ((a) create(lVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(T r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r5.f17786d
                    r2 = 1
                    if (r1 == 0) goto L_0x001f
                    if (r1 != r2) goto L_0x0017
                    java.lang.Object r1 = r5.f17785c
                    kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                    java.lang.Object r3 = r5.f17787e
                    nI.l r3 = (nI.C17642l) r3
                    XH.y.b(r6)
                    goto L_0x0058
                L_0x0017:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L_0x001f:
                    XH.y.b(r6)
                    java.lang.Object r6 = r5.f17787e
                    nI.l r6 = (nI.C17642l) r6
                    r3 = r6
                L_0x0027:
                    kotlin.jvm.internal.O<androidx.compose.foundation.gestures.c> r6 = r5.f17788f
                    T r6 = r6.f144348a
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.c.d
                    if (r1 != 0) goto L_0x005e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.c.a
                    if (r1 != 0) goto L_0x005e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.c.b
                    r4 = 0
                    if (r1 == 0) goto L_0x003b
                    androidx.compose.foundation.gestures.c$b r6 = (androidx.compose.foundation.gestures.c.b) r6
                    goto L_0x003c
                L_0x003b:
                    r6 = r4
                L_0x003c:
                    if (r6 == 0) goto L_0x0041
                    r3.invoke(r6)
                L_0x0041:
                    kotlin.jvm.internal.O<androidx.compose.foundation.gestures.c> r1 = r5.f17788f
                    androidx.compose.foundation.gestures.d r6 = r5.f17789g
                    SJ.j r6 = r6.f17740u
                    if (r6 == 0) goto L_0x005b
                    r5.f17787e = r3
                    r5.f17785c = r1
                    r5.f17786d = r2
                    java.lang.Object r6 = r6.j(r5)
                    if (r6 != r0) goto L_0x0058
                    return r0
                L_0x0058:
                    r4 = r6
                    androidx.compose.foundation.gestures.c r4 = (androidx.compose.foundation.gestures.c) r4
                L_0x005b:
                    r1.f144348a = r4
                    goto L_0x0027
                L_0x005e:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f17784g = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f17784g, eVar);
            fVar.f17783f = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:34|35|36|(1:38)|13|39|40|(2:47|(2:49|(1:51)))(2:42|(1:44))) */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
            r1 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            XH.y.b(r7);
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00fc A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(T r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f17782e
                r2 = 0
                switch(r1) {
                    case 0: goto L_0x0056;
                    case 1: goto L_0x0046;
                    case 2: goto L_0x003a;
                    case 3: goto L_0x0029;
                    case 4: goto L_0x0022;
                    case 5: goto L_0x001a;
                    case 6: goto L_0x0012;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0012:
                java.lang.Object r1 = r6.f17783f
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r7)
                goto L_0x0027
            L_0x001a:
                java.lang.Object r1 = r6.f17783f
                QJ.Q r1 = (QJ.Q) r1
            L_0x001e:
                XH.y.b(r7)     // Catch:{ CancellationException -> 0x00ed }
                goto L_0x0027
            L_0x0022:
                java.lang.Object r1 = r6.f17783f
                QJ.Q r1 = (QJ.Q) r1
                goto L_0x001e
            L_0x0027:
                r4 = r1
                goto L_0x005e
            L_0x0029:
                java.lang.Object r1 = r6.f17780c
                kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                java.lang.Object r3 = r6.f17783f
                QJ.Q r3 = (QJ.Q) r3
                XH.y.b(r7)     // Catch:{ CancellationException -> 0x0037 }
            L_0x0034:
                r4 = r3
                goto L_0x00ba
            L_0x0037:
                r1 = r3
                goto L_0x00ed
            L_0x003a:
                java.lang.Object r1 = r6.f17780c
                kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                java.lang.Object r3 = r6.f17783f
                QJ.Q r3 = (QJ.Q) r3
                XH.y.b(r7)
                goto L_0x00a5
            L_0x0046:
                java.lang.Object r1 = r6.f17781d
                kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                java.lang.Object r3 = r6.f17780c
                kotlin.jvm.internal.O r3 = (kotlin.jvm.internal.O) r3
                java.lang.Object r4 = r6.f17783f
                QJ.Q r4 = (QJ.Q) r4
                XH.y.b(r7)
                goto L_0x0082
            L_0x0056:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f17783f
                QJ.Q r7 = (QJ.Q) r7
                r4 = r7
            L_0x005e:
                boolean r7 = QJ.S.h(r4)
                if (r7 == 0) goto L_0x00fd
                kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
                r1.<init>()
                androidx.compose.foundation.gestures.d r7 = r6.f17784g
                SJ.j r7 = r7.f17740u
                if (r7 == 0) goto L_0x0085
                r6.f17783f = r4
                r6.f17780c = r1
                r6.f17781d = r1
                r3 = 1
                r6.f17782e = r3
                java.lang.Object r7 = r7.j(r6)
                if (r7 != r0) goto L_0x0081
                return r0
            L_0x0081:
                r3 = r1
            L_0x0082:
                androidx.compose.foundation.gestures.c r7 = (androidx.compose.foundation.gestures.c) r7
                goto L_0x0087
            L_0x0085:
                r3 = r1
                r7 = r2
            L_0x0087:
                r1.f144348a = r7
                T r7 = r3.f144348a
                boolean r1 = r7 instanceof androidx.compose.foundation.gestures.c.C0257c
                if (r1 == 0) goto L_0x005e
                androidx.compose.foundation.gestures.d r1 = r6.f17784g
                androidx.compose.foundation.gestures.c$c r7 = (androidx.compose.foundation.gestures.c.C0257c) r7
                r6.f17783f = r4
                r6.f17780c = r3
                r6.f17781d = r2
                r5 = 2
                r6.f17782e = r5
                java.lang.Object r7 = r1.Y2(r7, r6)
                if (r7 != r0) goto L_0x00a3
                return r0
            L_0x00a3:
                r1 = r3
                r3 = r4
            L_0x00a5:
                androidx.compose.foundation.gestures.d r7 = r6.f17784g     // Catch:{ CancellationException -> 0x0037 }
                androidx.compose.foundation.gestures.d$f$a r4 = new androidx.compose.foundation.gestures.d$f$a     // Catch:{ CancellationException -> 0x0037 }
                r4.<init>(r1, r7, r2)     // Catch:{ CancellationException -> 0x0037 }
                r6.f17783f = r3     // Catch:{ CancellationException -> 0x0037 }
                r6.f17780c = r1     // Catch:{ CancellationException -> 0x0037 }
                r5 = 3
                r6.f17782e = r5     // Catch:{ CancellationException -> 0x0037 }
                java.lang.Object r7 = r7.R2(r4, r6)     // Catch:{ CancellationException -> 0x0037 }
                if (r7 != r0) goto L_0x0034
                return r0
            L_0x00ba:
                T r7 = r1.f144348a     // Catch:{ CancellationException -> 0x00d7 }
                boolean r1 = r7 instanceof androidx.compose.foundation.gestures.c.d     // Catch:{ CancellationException -> 0x00d7 }
                if (r1 == 0) goto L_0x00d9
                androidx.compose.foundation.gestures.d r1 = r6.f17784g     // Catch:{ CancellationException -> 0x00d7 }
                java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"
                kotlin.jvm.internal.C17542s.h(r7, r3)     // Catch:{ CancellationException -> 0x00d7 }
                androidx.compose.foundation.gestures.c$d r7 = (androidx.compose.foundation.gestures.c.d) r7     // Catch:{ CancellationException -> 0x00d7 }
                r6.f17783f = r4     // Catch:{ CancellationException -> 0x00d7 }
                r6.f17780c = r2     // Catch:{ CancellationException -> 0x00d7 }
                r3 = 4
                r6.f17782e = r3     // Catch:{ CancellationException -> 0x00d7 }
                java.lang.Object r7 = r1.Z2(r7, r6)     // Catch:{ CancellationException -> 0x00d7 }
                if (r7 != r0) goto L_0x005e
                return r0
            L_0x00d7:
                r1 = r4
                goto L_0x00ed
            L_0x00d9:
                boolean r7 = r7 instanceof androidx.compose.foundation.gestures.c.a     // Catch:{ CancellationException -> 0x00d7 }
                if (r7 == 0) goto L_0x005e
                androidx.compose.foundation.gestures.d r7 = r6.f17784g     // Catch:{ CancellationException -> 0x00d7 }
                r6.f17783f = r4     // Catch:{ CancellationException -> 0x00d7 }
                r6.f17780c = r2     // Catch:{ CancellationException -> 0x00d7 }
                r1 = 5
                r6.f17782e = r1     // Catch:{ CancellationException -> 0x00d7 }
                java.lang.Object r7 = r7.X2(r6)     // Catch:{ CancellationException -> 0x00d7 }
                if (r7 != r0) goto L_0x005e
                return r0
            L_0x00ed:
                androidx.compose.foundation.gestures.d r7 = r6.f17784g
                r6.f17783f = r1
                r6.f17780c = r2
                r3 = 6
                r6.f17782e = r3
                java.lang.Object r7 = r7.X2(r6)
                if (r7 != r0) goto L_0x0027
                return r0
            L_0x00fd:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(C17642l<? super B, Boolean> lVar, boolean z10, m mVar, v vVar) {
        this.f17735p = vVar;
        this.f17736q = lVar;
        this.f17737r = z10;
        this.f17738s = mVar;
    }

    private final W U2() {
        return U.a(new b(this, (C17164e<? super b>) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object X2(dI.C17164e<? super XH.C16807N> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.d.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.d$c r0 = (androidx.compose.foundation.gestures.d.c) r0
            int r1 = r0.f17768f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17768f = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.d$c r0 = new androidx.compose.foundation.gestures.d$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f17766d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f17768f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f17765c
            androidx.compose.foundation.gestures.d r0 = (androidx.compose.foundation.gestures.d) r0
            XH.y.b(r6)
            goto L_0x0051
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0035:
            XH.y.b(r6)
            r0.b r6 = r5.f17741v
            if (r6 == 0) goto L_0x0055
            r0.m r2 = r5.f17738s
            if (r2 == 0) goto L_0x0050
            r0.a r4 = new r0.a
            r4.<init>(r6)
            r0.f17765c = r5
            r0.f17768f = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r5
        L_0x0051:
            r6 = 0
            r0.f17741v = r6
            goto L_0x0056
        L_0x0055:
            r0 = r5
        L_0x0056:
            c2.y$a r6 = c2.y.f23066b
            long r1 = r6.a()
            r0.W2(r1)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.X2(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Y2(androidx.compose.foundation.gestures.c.C0257c r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.d.C0260d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.d$d r0 = (androidx.compose.foundation.gestures.d.C0260d) r0
            int r1 = r0.f17774h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17774h = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.d$d r0 = new androidx.compose.foundation.gestures.d$d
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f17772f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f17774h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.f17771e
            r0.b r7 = (r0.C5810b) r7
            java.lang.Object r1 = r0.f17770d
            androidx.compose.foundation.gestures.c$c r1 = (androidx.compose.foundation.gestures.c.C0257c) r1
            java.lang.Object r0 = r0.f17769c
            androidx.compose.foundation.gestures.d r0 = (androidx.compose.foundation.gestures.d) r0
            XH.y.b(r8)
            goto L_0x0085
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            java.lang.Object r7 = r0.f17770d
            androidx.compose.foundation.gestures.c$c r7 = (androidx.compose.foundation.gestures.c.C0257c) r7
            java.lang.Object r2 = r0.f17769c
            androidx.compose.foundation.gestures.d r2 = (androidx.compose.foundation.gestures.d) r2
            XH.y.b(r8)
            goto L_0x006a
        L_0x004c:
            XH.y.b(r8)
            r0.b r8 = r6.f17741v
            if (r8 == 0) goto L_0x0069
            r0.m r2 = r6.f17738s
            if (r2 == 0) goto L_0x0069
            r0.a r5 = new r0.a
            r5.<init>(r8)
            r0.f17769c = r6
            r0.f17770d = r7
            r0.f17774h = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r6
        L_0x006a:
            r0.b r8 = new r0.b
            r8.<init>()
            r0.m r4 = r2.f17738s
            if (r4 == 0) goto L_0x0088
            r0.f17769c = r2
            r0.f17770d = r7
            r0.f17771e = r8
            r0.f17774h = r3
            java.lang.Object r0 = r4.b(r8, r0)
            if (r0 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r1 = r7
            r7 = r8
            r0 = r2
        L_0x0085:
            r8 = r7
            r2 = r0
            r7 = r1
        L_0x0088:
            r2.f17741v = r8
            long r7 = r7.a()
            r2.V2(r7)
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.Y2(androidx.compose.foundation.gestures.c$c, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z2(androidx.compose.foundation.gestures.c.d r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.d.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.foundation.gestures.d$e r0 = (androidx.compose.foundation.gestures.d.e) r0
            int r1 = r0.f17779g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17779g = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.d$e r0 = new androidx.compose.foundation.gestures.d$e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f17777e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f17779g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.f17776d
            androidx.compose.foundation.gestures.c$d r6 = (androidx.compose.foundation.gestures.c.d) r6
            java.lang.Object r0 = r0.f17775c
            androidx.compose.foundation.gestures.d r0 = (androidx.compose.foundation.gestures.d) r0
            XH.y.b(r7)
            goto L_0x0057
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            XH.y.b(r7)
            r0.b r7 = r5.f17741v
            if (r7 == 0) goto L_0x005b
            r0.m r2 = r5.f17738s
            if (r2 == 0) goto L_0x0056
            r0.c r4 = new r0.c
            r4.<init>(r7)
            r0.f17775c = r5
            r0.f17776d = r6
            r0.f17779g = r3
            java.lang.Object r7 = r2.b(r4, r0)
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0 = r5
        L_0x0057:
            r7 = 0
            r0.f17741v = r7
            goto L_0x005c
        L_0x005b:
            r0 = r5
        L_0x005c:
            long r6 = r6.a()
            r0.W2(r6)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.Z2(androidx.compose.foundation.gestures.c$d, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void b3() {
        this.f17742w = true;
        F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new f(this, (C17164e<? super f>) null), 3, (Object) null);
    }

    public static /* synthetic */ void d3(d dVar, C17642l<? super B, Boolean> lVar, boolean z10, m mVar, v vVar, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                lVar = dVar.f17736q;
            }
            if ((i10 & 2) != 0) {
                z10 = dVar.f17737r;
            }
            boolean z12 = z10;
            if ((i10 & 4) != 0) {
                mVar = dVar.f17738s;
            }
            m mVar2 = mVar;
            if ((i10 & 8) != 0) {
                vVar = dVar.f17735p;
            }
            v vVar2 = vVar;
            if ((i10 & 16) != 0) {
                z11 = false;
            }
            dVar.c3(lVar, z12, mVar2, vVar2, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
    }

    public final void Q2() {
        C5810b bVar = this.f17741v;
        if (bVar != null) {
            m mVar = this.f17738s;
            if (mVar != null) {
                mVar.a(new C5809a(bVar));
            }
            this.f17741v = null;
        }
    }

    public abstract Object R2(p<? super C17642l<? super c.b, C16807N>, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar);

    /* access modifiers changed from: protected */
    public final C17642l<B, Boolean> S2() {
        return this.f17736q;
    }

    public void T1(C4349p pVar, r rVar, long j10) {
        if (this.f17737r && this.f17743x == null) {
            this.f17743x = (W) C2(U2());
        }
        W w10 = this.f17743x;
        if (w10 != null) {
            w10.T1(pVar, rVar, j10);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean T2() {
        return this.f17737r;
    }

    public abstract void V2(long j10);

    public abstract void W2(long j10);

    public abstract boolean a3();

    public final void c3(C17642l<? super B, Boolean> lVar, boolean z10, m mVar, v vVar, boolean z11) {
        W w10;
        this.f17736q = lVar;
        boolean z12 = true;
        if (this.f17737r != z10) {
            this.f17737r = z10;
            if (!z10) {
                Q2();
                W w11 = this.f17743x;
                if (w11 != null) {
                    F2(w11);
                }
                this.f17743x = null;
            }
            z11 = true;
        }
        if (!C17542s.e(this.f17738s, mVar)) {
            Q2();
            this.f17738s = mVar;
        }
        if (this.f17735p != vVar) {
            this.f17735p = vVar;
        } else {
            z12 = z11;
        }
        if (z12 && (w10 = this.f17743x) != null) {
            w10.W0();
        }
    }

    public void n2() {
        this.f17742w = false;
        Q2();
    }

    public void s1() {
        W w10 = this.f17743x;
        if (w10 != null) {
            w10.s1();
        }
    }
}
