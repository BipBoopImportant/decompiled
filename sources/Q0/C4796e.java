package Q0;

import U0.A1;
import U0.C4892n0;
import U0.C4899r0;
import U0.D0;
import U0.o1;
import U0.p1;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5546i;
import n0.C5589L;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.n;
import p0.r;
import tI.C17978n;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\u0001\u0018\u0000 <*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00012BU\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0005H@¢\u0006\u0004\b!\u0010\"JJ\u0010)\u001a\u00020\u001e2\b\b\u0002\u0010$\u001a\u00020#2.\u0010(\u001a*\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020%H@¢\u0006\u0004\b)\u0010*JX\u0010,\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010$\u001a\u00020#24\u0010(\u001a0\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020+H@¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0000¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005¢\u0006\u0004\b1\u00100R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0000X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00048\u0000X\u0004¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b?\u00105R\u0014\u0010C\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8\u0000X\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR+\u0010\u0010\u001a\u00028\u00002\u0006\u0010J\u001a\u00028\u00008F@BX\u0002¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010\u0016\u001a\u00028\u00008FX\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010NR\u001b\u0010U\u001a\u00028\u00008@X\u0002¢\u0006\f\n\u0004\b,\u0010R\u001a\u0004\bT\u0010NR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00058F@BX\u0002¢\u0006\u0012\n\u0004\b)\u0010V\u001a\u0004\bW\u0010\u001a\"\u0004\bX\u0010YR\u001b\u0010\\\u001a\u00020\u00058GX\u0002¢\u0006\f\n\u0004\bZ\u0010R\u001a\u0004\b[\u0010\u001aR+\u0010_\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00058F@BX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010V\u001a\u0004\b]\u0010\u001a\"\u0004\b^\u0010YR/\u0010b\u001a\u0004\u0018\u00018\u00002\b\u0010J\u001a\u0004\u0018\u00018\u00008B@BX\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010L\u001a\u0004\b`\u0010N\"\u0004\ba\u0010PR7\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8F@BX\u0002¢\u0006\u0012\n\u0004\b1\u0010L\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0014\u0010i\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010hR\u0011\u0010l\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006m"}, d2 = {"LQ0/e;", "T", "", "initialValue", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lm0/i;", "animationSpec", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;LnI/l;LnI/a;Lm0/i;LnI/l;)V", "offset", "currentValue", "velocity", "l", "(FLjava/lang/Object;F)Ljava/lang/Object;", "m", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "H", "(Ljava/lang/Object;)Z", "A", "()F", "LQ0/g;", "newAnchors", "newTarget", "LXH/N;", "I", "(LQ0/g;Ljava/lang/Object;)V", "G", "(FLdI/e;)Ljava/lang/Object;", "Ln0/L;", "dragPriority", "Lkotlin/Function3;", "LQ0/c;", "LdI/e;", "block", "j", "(Ln0/L;LnI/q;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function4;", "i", "(Ljava/lang/Object;Ln0/L;LnI/r;LdI/e;)Ljava/lang/Object;", "delta", "z", "(F)F", "n", "a", "LnI/l;", "getPositionalThreshold$material3_release", "()LnI/l;", "b", "LnI/a;", "getVelocityThreshold$material3_release", "()LnI/a;", "c", "Lm0/i;", "p", "()Lm0/i;", "d", "r", "LQ0/m;", "e", "LQ0/m;", "dragMutex", "Lp0/r;", "f", "Lp0/r;", "u", "()Lp0/r;", "draggableState", "<set-?>", "g", "LU0/r0;", "s", "()Ljava/lang/Object;", "C", "(Ljava/lang/Object;)V", "h", "LU0/A1;", "x", "q", "closestValue", "LU0/n0;", "w", "F", "(F)V", "k", "getProgress", "progress", "v", "E", "lastVelocity", "t", "D", "dragTarget", "o", "()LQ0/g;", "B", "(LQ0/g;)V", "anchors", "LQ0/c;", "anchoredDragScope", "y", "()Z", "isAnimationRunning", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Q0.e  reason: case insensitive filesystem */
public final class C4796e<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final a f11942p = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Float, Float> f11943a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<Float> f11944b;

    /* renamed from: c  reason: collision with root package name */
    private final C5546i<Float> f11945c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<T, Boolean> f11946d;

    /* renamed from: e  reason: collision with root package name */
    private final m f11947e = new m();

    /* renamed from: f  reason: collision with root package name */
    private final r f11948f = new h(this);

    /* renamed from: g  reason: collision with root package name */
    private final C4899r0 f11949g;

    /* renamed from: h  reason: collision with root package name */
    private final A1 f11950h;

    /* renamed from: i  reason: collision with root package name */
    private final A1 f11951i;

    /* renamed from: j  reason: collision with root package name */
    private final C4892n0 f11952j;

    /* renamed from: k  reason: collision with root package name */
    private final A1 f11953k;

    /* renamed from: l  reason: collision with root package name */
    private final C4892n0 f11954l;

    /* renamed from: m  reason: collision with root package name */
    private final C4899r0 f11955m;

    /* renamed from: n  reason: collision with root package name */
    private final C4899r0 f11956n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C4794c f11957o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ0/e$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Q0.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {520}, m = "anchoredDrag")
    /* renamed from: Q0.e$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f11958c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f11959d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f11960e;

        /* renamed from: f  reason: collision with root package name */
        int f11961f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4796e<T> eVar, C17164e<? super b> eVar2) {
            super(eVar2);
            this.f11960e = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f11959d = obj;
            this.f11961f |= Integer.MIN_VALUE;
            return this.f11960e.j((C5589L) null, (q) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {521}, m = "invokeSuspend")
    /* renamed from: Q0.e$c */
    static final class c extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f11962c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f11963d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<C4794c, g<T>, C17164e<? super C16807N>, Object> f11964e;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LQ0/g;", "b", "()LQ0/g;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: Q0.e$c$a */
        static final class a extends C17544u implements C17631a<g<T>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4796e<T> f11965c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4796e<T> eVar) {
                super(0);
                this.f11965c = eVar;
            }

            /* renamed from: b */
            public final g<T> invoke() {
                return this.f11965c.o();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LQ0/g;", "latestAnchors", "LXH/N;", "<anonymous>", "(LQ0/g;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {522}, m = "invokeSuspend")
        /* renamed from: Q0.e$c$b */
        static final class b extends l implements p<g<T>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f11966c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f11967d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ q<C4794c, g<T>, C17164e<? super C16807N>, Object> f11968e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4796e<T> f11969f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(q<? super C4794c, ? super g<T>, ? super C17164e<? super C16807N>, ? extends Object> qVar, C4796e<T> eVar, C17164e<? super b> eVar2) {
                super(2, eVar2);
                this.f11968e = qVar;
                this.f11969f = eVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f11968e, this.f11969f, eVar);
                bVar.f11967d = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(g<T> gVar, C17164e<? super C16807N> eVar) {
                return ((b) create(gVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f11966c;
                if (i10 == 0) {
                    y.b(obj);
                    q<C4794c, g<T>, C17164e<? super C16807N>, Object> qVar = this.f11968e;
                    C4794c c10 = this.f11969f.f11957o;
                    this.f11966c = 1;
                    if (qVar.invoke(c10, (g) this.f11967d, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4796e<T> eVar, q<? super C4794c, ? super g<T>, ? super C17164e<? super C16807N>, ? extends Object> qVar, C17164e<? super c> eVar2) {
            super(1, eVar2);
            this.f11963d = eVar;
            this.f11964e = qVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new c(this.f11963d, this.f11964e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((c) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f11962c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a(this.f11963d);
                b bVar = new b(this.f11964e, this.f11963d, (C17164e<? super b>) null);
                this.f11962c = 1;
                if (androidx.compose.material3.internal.b.j(aVar, bVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {567}, m = "anchoredDrag")
    /* renamed from: Q0.e$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f11970c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f11971d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f11972e;

        /* renamed from: f  reason: collision with root package name */
        int f11973f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C4796e<T> eVar, C17164e<? super d> eVar2) {
            super(eVar2);
            this.f11972e = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f11971d = obj;
            this.f11973f |= Integer.MIN_VALUE;
            return this.f11972e.i(null, (C5589L) null, (nI.r) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {569}, m = "invokeSuspend")
    /* renamed from: Q0.e$e  reason: collision with other inner class name */
    static final class C0182e extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f11974c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f11975d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f11976e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ nI.r<C4794c, g<T>, T, C17164e<? super C16807N>, Object> f11977f;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXH/v;", "LQ0/g;", "b", "()LXH/v;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: Q0.e$e$a */
        static final class a extends C17544u implements C17631a<v<? extends g<T>, ? extends T>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4796e<T> f11978c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4796e<T> eVar) {
                super(0);
                this.f11978c = eVar;
            }

            /* renamed from: b */
            public final v<g<T>, T> invoke() {
                return C16796C.a(this.f11978c.o(), this.f11978c.x());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LXH/v;", "LQ0/g;", "<name for destructuring parameter 0>", "LXH/N;", "<anonymous>", "(LXH/v;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {571}, m = "invokeSuspend")
        /* renamed from: Q0.e$e$b */
        static final class b extends l implements p<v<? extends g<T>, ? extends T>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f11979c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f11980d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ nI.r<C4794c, g<T>, T, C17164e<? super C16807N>, Object> f11981e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4796e<T> f11982f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(nI.r<? super C4794c, ? super g<T>, ? super T, ? super C17164e<? super C16807N>, ? extends Object> rVar, C4796e<T> eVar, C17164e<? super b> eVar2) {
                super(2, eVar2);
                this.f11981e = rVar;
                this.f11982f = eVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f11981e, this.f11982f, eVar);
                bVar.f11980d = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(v<? extends g<T>, ? extends T> vVar, C17164e<? super C16807N> eVar) {
                return ((b) create(vVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f11979c;
                if (i10 == 0) {
                    y.b(obj);
                    v vVar = (v) this.f11980d;
                    Object b10 = vVar.b();
                    nI.r<C4794c, g<T>, T, C17164e<? super C16807N>, Object> rVar = this.f11981e;
                    C4794c c10 = this.f11982f.f11957o;
                    this.f11979c = 1;
                    if (rVar.l(c10, (g) vVar.a(), b10, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0182e(C4796e<T> eVar, T t10, nI.r<? super C4794c, ? super g<T>, ? super T, ? super C17164e<? super C16807N>, ? extends Object> rVar, C17164e<? super C0182e> eVar2) {
            super(1, eVar2);
            this.f11975d = eVar;
            this.f11976e = t10;
            this.f11977f = rVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C0182e(this.f11975d, this.f11976e, this.f11977f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((C0182e) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f11974c;
            if (i10 == 0) {
                y.b(obj);
                this.f11975d.D(this.f11976e);
                a aVar = new a(this.f11975d);
                b bVar = new b(this.f11977f, this.f11975d, (C17164e<? super b>) null);
                this.f11974c = 1;
                if (androidx.compose.material3.internal.b.j(aVar, bVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Q0/e$f", "LQ0/c;", "", "newOffset", "lastKnownVelocity", "LXH/N;", "a", "(FF)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Q0.e$f */
    public static final class f implements C4794c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f11983a;

        f(C4796e<T> eVar) {
            this.f11983a = eVar;
        }

        public void a(float f10, float f11) {
            this.f11983a.F(f10);
            this.f11983a.E(f11);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Q0.e$g */
    static final class g extends C17544u implements C17631a<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f11984c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C4796e<T> eVar) {
            super(0);
            this.f11984c = eVar;
        }

        public final T invoke() {
            T d10 = this.f11984c.t();
            if (d10 != null) {
                return d10;
            }
            C4796e<T> eVar = this.f11984c;
            float w10 = eVar.w();
            return !Float.isNaN(w10) ? eVar.m(w10, eVar.s()) : eVar.s();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0005*\u0002\u0000\f\b\n\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Q0/e$h", "Lp0/r;", "Ln0/L;", "dragPriority", "Lkotlin/Function2;", "Lp0/n;", "LdI/e;", "LXH/N;", "", "block", "b", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "Q0/e$h$b", "a", "LQ0/e$h$b;", "dragScope", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Q0.e$h */
    public static final class h implements r {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final b f11985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f11986b;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LQ0/c;", "LQ0/g;", "it", "LXH/N;", "<anonymous>", "(LQ0/c;LQ0/g;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
        /* renamed from: Q0.e$h$a */
        static final class a extends l implements q<C4794c, g<T>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f11987c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h f11988d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<n, C17164e<? super C16807N>, Object> f11989e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, p pVar, C17164e eVar) {
                super(3, eVar);
                this.f11988d = hVar;
                this.f11989e = pVar;
            }

            /* renamed from: i */
            public final Object invoke(C4794c cVar, g<T> gVar, C17164e<? super C16807N> eVar) {
                return new a(this.f11988d, this.f11989e, eVar).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f11987c;
                if (i10 == 0) {
                    y.b(obj);
                    b c10 = this.f11988d.f11985a;
                    p<n, C17164e<? super C16807N>, Object> pVar = this.f11989e;
                    this.f11987c = 1;
                    if (pVar.invoke(c10, this) == f10) {
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

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Q0/e$h$b", "Lp0/n;", "", "pixels", "LXH/N;", "a", "(F)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: Q0.e$h$b */
        public static final class b implements n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4796e<T> f11990a;

            b(C4796e<T> eVar) {
                this.f11990a = eVar;
            }

            public void a(float f10) {
                C4794c.b(this.f11990a.f11957o, this.f11990a.z(f10), 0.0f, 2, (Object) null);
            }
        }

        h(C4796e<T> eVar) {
            this.f11986b = eVar;
            this.f11985a = new b(eVar);
        }

        public Object b(C5589L l10, p<? super n, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
            Object j10 = this.f11986b.j(l10, new a(this, pVar, (C17164e) null), eVar);
            return j10 == C17187b.f() ? j10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: Q0.e$i */
    static final class i extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f11991c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C4796e<T> eVar) {
            super(0);
            this.f11991c = eVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            float f10 = this.f11991c.o().f(this.f11991c.s());
            float f11 = this.f11991c.o().f(this.f11991c.q()) - f10;
            float abs = Math.abs(f11);
            float f12 = 1.0f;
            if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                float A10 = (this.f11991c.A() - f10) / f11;
                if (A10 < 1.0E-6f) {
                    f12 = 0.0f;
                } else if (A10 <= 0.999999f) {
                    f12 = A10;
                }
            }
            return Float.valueOf(f12);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Q0.e$j */
    static final class j extends C17544u implements C17631a<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f11992c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C4796e<T> eVar) {
            super(0);
            this.f11992c = eVar;
        }

        public final T invoke() {
            T d10 = this.f11992c.t();
            if (d10 != null) {
                return d10;
            }
            C4796e<T> eVar = this.f11992c;
            float w10 = eVar.w();
            return !Float.isNaN(w10) ? eVar.l(w10, eVar.s(), 0.0f) : eVar.s();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: Q0.e$k */
    static final class k extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4796e<T> f11993c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ T f11994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C4796e<T> eVar, T t10) {
            super(0);
            this.f11993c = eVar;
            this.f11994d = t10;
        }

        public final void invoke() {
            C4794c c10 = this.f11993c.f11957o;
            C4796e<T> eVar = this.f11993c;
            T t10 = this.f11994d;
            float f10 = eVar.o().f(t10);
            if (!Float.isNaN(f10)) {
                C4794c.b(c10, f10, 0.0f, 2, (Object) null);
                eVar.D(null);
            }
            eVar.C(t10);
        }
    }

    public C4796e(T t10, C17642l<? super Float, Float> lVar, C17631a<Float> aVar, C5546i<Float> iVar, C17642l<? super T, Boolean> lVar2) {
        this.f11943a = lVar;
        this.f11944b = aVar;
        this.f11945c = iVar;
        this.f11946d = lVar2;
        this.f11949g = u1.e(t10, (o1) null, 2, (Object) null);
        this.f11950h = p1.e(new j(this));
        this.f11951i = p1.e(new g(this));
        this.f11952j = D0.a(Float.NaN);
        this.f11953k = p1.d(p1.s(), new i(this));
        this.f11954l = D0.a(0.0f);
        this.f11955m = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f11956n = u1.e(androidx.compose.material3.internal.b.i(), (o1) null, 2, (Object) null);
        this.f11957o = new f(this);
    }

    private final void B(g<T> gVar) {
        this.f11956n.setValue(gVar);
    }

    /* access modifiers changed from: private */
    public final void C(T t10) {
        this.f11949g.setValue(t10);
    }

    /* access modifiers changed from: private */
    public final void D(T t10) {
        this.f11955m.setValue(t10);
    }

    /* access modifiers changed from: private */
    public final void E(float f10) {
        this.f11954l.n(f10);
    }

    /* access modifiers changed from: private */
    public final void F(float f10) {
        this.f11952j.n(f10);
    }

    private final boolean H(T t10) {
        return this.f11947e.e(new k(this, t10));
    }

    public static /* synthetic */ void J(C4796e eVar, g gVar, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            if (!Float.isNaN(eVar.w())) {
                obj = gVar.c(eVar.w());
                if (obj == null) {
                    obj = eVar.x();
                }
            } else {
                obj = eVar.x();
            }
        }
        eVar.I(gVar, obj);
    }

    public static /* synthetic */ Object k(C4796e eVar, Object obj, C5589L l10, nI.r rVar, C17164e eVar2, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            l10 = C5589L.Default;
        }
        return eVar.i(obj, l10, rVar, eVar2);
    }

    /* access modifiers changed from: private */
    public final T l(float f10, T t10, float f11) {
        T b10;
        g o10 = o();
        float f12 = o10.f(t10);
        float floatValue = this.f11944b.invoke().floatValue();
        int i10 = (f12 > f10 ? 1 : (f12 == f10 ? 0 : -1));
        if (i10 == 0 || Float.isNaN(f12)) {
            return t10;
        }
        if (i10 < 0) {
            if (f11 >= floatValue) {
                T b11 = o10.b(f10, true);
                C17542s.g(b11);
                return b11;
            }
            b10 = o10.b(f10, true);
            C17542s.g(b10);
            if (f10 < Math.abs(f12 + Math.abs(this.f11943a.invoke(Float.valueOf(Math.abs(o10.f(b10) - f12))).floatValue()))) {
                return t10;
            }
        } else if (f11 <= (-floatValue)) {
            T b12 = o10.b(f10, false);
            C17542s.g(b12);
            return b12;
        } else {
            b10 = o10.b(f10, false);
            C17542s.g(b10);
            float abs = Math.abs(f12 - Math.abs(this.f11943a.invoke(Float.valueOf(Math.abs(f12 - o10.f(b10)))).floatValue()));
            if (f10 < 0.0f) {
                if (Math.abs(f10) < abs) {
                    return t10;
                }
            } else if (f10 > abs) {
                return t10;
            }
        }
        return b10;
    }

    /* access modifiers changed from: private */
    public final T m(float f10, T t10) {
        T b10;
        g o10 = o();
        float f11 = o10.f(t10);
        int i10 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
        if (i10 == 0 || Float.isNaN(f11)) {
            return t10;
        }
        if (i10 < 0) {
            b10 = o10.b(f10, true);
            if (b10 == null) {
                return t10;
            }
        } else {
            b10 = o10.b(f10, false);
            if (b10 == null) {
                return t10;
            }
        }
        return b10;
    }

    /* access modifiers changed from: private */
    public final T t() {
        return this.f11955m.getValue();
    }

    public final float A() {
        if (!Float.isNaN(w())) {
            return w();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final Object G(float f10, C17164e<? super C16807N> eVar) {
        Object s10 = s();
        Object l10 = l(A(), s10, f10);
        if (this.f11946d.invoke(l10).booleanValue()) {
            Object f11 = androidx.compose.material3.internal.b.f(this, l10, f10, eVar);
            return f11 == C17187b.f() ? f11 : C16807N.f139792a;
        }
        Object f12 = androidx.compose.material3.internal.b.f(this, s10, f10, eVar);
        return f12 == C17187b.f() ? f12 : C16807N.f139792a;
    }

    public final void I(g<T> gVar, T t10) {
        if (!C17542s.e(o(), gVar)) {
            B(gVar);
            if (!H(t10)) {
                D(t10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(T r7, n0.C5589L r8, nI.r<? super Q0.C4794c, ? super Q0.g<T>, ? super T, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r9, dI.C17164e<? super XH.C16807N> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof Q0.C4796e.d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            Q0.e$d r0 = (Q0.C4796e.d) r0
            int r1 = r0.f11973f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11973f = r1
            goto L_0x0018
        L_0x0013:
            Q0.e$d r0 = new Q0.e$d
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f11971d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f11973f
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r7 = r0.f11970c
            Q0.e r7 = (Q0.C4796e) r7
            XH.y.b(r10)     // Catch:{ all -> 0x0030 }
            goto L_0x005a
        L_0x0030:
            r8 = move-exception
            goto L_0x0094
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            XH.y.b(r10)
            Q0.g r10 = r6.o()
            boolean r10 = r10.d(r7)
            if (r10 == 0) goto L_0x00cc
            Q0.m r10 = r6.f11947e     // Catch:{ all -> 0x0092 }
            Q0.e$e r2 = new Q0.e$e     // Catch:{ all -> 0x0092 }
            r2.<init>(r6, r7, r9, r5)     // Catch:{ all -> 0x0092 }
            r0.f11970c = r6     // Catch:{ all -> 0x0092 }
            r0.f11973f = r4     // Catch:{ all -> 0x0092 }
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch:{ all -> 0x0092 }
            if (r7 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r7 = r6
        L_0x005a:
            r7.D(r5)
            Q0.g r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto L_0x00cf
            float r9 = r7.w()
            Q0.g r10 = r7.o()
            float r10 = r10.f(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00cf
            nI.l<T, java.lang.Boolean> r9 = r7.f11946d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00cf
            r7.C(r8)
            goto L_0x00cf
        L_0x0092:
            r8 = move-exception
            r7 = r6
        L_0x0094:
            r7.D(r5)
            Q0.g r9 = r7.o()
            float r10 = r7.w()
            java.lang.Object r9 = r9.c(r10)
            if (r9 == 0) goto L_0x00cb
            float r10 = r7.w()
            Q0.g r0 = r7.o()
            float r0 = r0.f(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x00cb
            nI.l<T, java.lang.Boolean> r10 = r7.f11946d
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00cb
            r7.C(r9)
        L_0x00cb:
            throw r8
        L_0x00cc:
            r6.C(r7)
        L_0x00cf:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C4796e.i(java.lang.Object, n0.L, nI.r, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(n0.C5589L r7, nI.q<? super Q0.C4794c, ? super Q0.g<T>, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof Q0.C4796e.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Q0.e$b r0 = (Q0.C4796e.b) r0
            int r1 = r0.f11961f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11961f = r1
            goto L_0x0018
        L_0x0013:
            Q0.e$b r0 = new Q0.e$b
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f11959d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f11961f
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r7 = r0.f11958c
            Q0.e r7 = (Q0.C4796e) r7
            XH.y.b(r9)     // Catch:{ all -> 0x002f }
            goto L_0x0050
        L_0x002f:
            r8 = move-exception
            goto L_0x0089
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            XH.y.b(r9)
            Q0.m r9 = r6.f11947e     // Catch:{ all -> 0x0087 }
            Q0.e$c r2 = new Q0.e$c     // Catch:{ all -> 0x0087 }
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch:{ all -> 0x0087 }
            r0.f11958c = r6     // Catch:{ all -> 0x0087 }
            r0.f11961f = r4     // Catch:{ all -> 0x0087 }
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch:{ all -> 0x0087 }
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r7 = r6
        L_0x0050:
            Q0.g r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto L_0x0084
            float r9 = r7.w()
            Q0.g r0 = r7.o()
            float r0 = r0.f(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0084
            nI.l<T, java.lang.Boolean> r9 = r7.f11946d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0084
            r7.C(r8)
        L_0x0084:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x0087:
            r8 = move-exception
            r7 = r6
        L_0x0089:
            Q0.g r9 = r7.o()
            float r0 = r7.w()
            java.lang.Object r9 = r9.c(r0)
            if (r9 == 0) goto L_0x00bd
            float r0 = r7.w()
            Q0.g r1 = r7.o()
            float r1 = r1.f(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00bd
            nI.l<T, java.lang.Boolean> r0 = r7.f11946d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bd
            r7.C(r9)
        L_0x00bd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C4796e.j(n0.L, nI.q, dI.e):java.lang.Object");
    }

    public final float n(float f10) {
        float z10 = z(f10);
        float w10 = Float.isNaN(w()) ? 0.0f : w();
        F(z10);
        return z10 - w10;
    }

    public final g<T> o() {
        return (g) this.f11956n.getValue();
    }

    public final C5546i<Float> p() {
        return this.f11945c;
    }

    public final T q() {
        return this.f11951i.getValue();
    }

    public final C17642l<T, Boolean> r() {
        return this.f11946d;
    }

    public final T s() {
        return this.f11949g.getValue();
    }

    public final r u() {
        return this.f11948f;
    }

    public final float v() {
        return this.f11954l.a();
    }

    public final float w() {
        return this.f11952j.a();
    }

    public final T x() {
        return this.f11950h.getValue();
    }

    public final boolean y() {
        return t() != null;
    }

    public final float z(float f10) {
        return C17978n.l((Float.isNaN(w()) ? 0.0f : w()) + f10, o().e(), o().g());
    }
}
