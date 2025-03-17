package I0;

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
import kotlin.coroutines.jvm.internal.d;
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

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\b\u0001\u0018\u0000 >*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00018BU\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eBe\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u0011J'\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\u00020 2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\b\u0002\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0005H@¢\u0006\u0004\b#\u0010$JJ\u0010+\u001a\u00020 2\b\b\u0002\u0010&\u001a\u00020%2.\u0010*\u001a*\b\u0001\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0)\u0012\u0006\u0012\u0004\u0018\u00010\u00020'H@¢\u0006\u0004\b+\u0010,JX\u0010.\u001a\u00020 2\u0006\u0010\u0019\u001a\u00028\u00002\b\b\u0002\u0010&\u001a\u00020%24\u0010*\u001a0\b\u0001\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0)\u0012\u0006\u0012\u0004\u0018\u00010\u00020-H@¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005H\u0000¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005¢\u0006\u0004\b3\u00102R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0000X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00048\u0000X\u0004¢\u0006\f\n\u0004\b@\u00105\u001a\u0004\bA\u00107R\u0014\u0010E\u001a\u00020B8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010K\u001a\u00020F8\u0000X\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR+\u0010\u0013\u001a\u00028\u00002\u0006\u0010L\u001a\u00028\u00008F@BX\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001b\u0010\u0019\u001a\u00028\u00008FX\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010PR\u001b\u0010W\u001a\u00028\u00008@X\u0002¢\u0006\f\n\u0004\b.\u0010T\u001a\u0004\bV\u0010PR+\u0010\u0012\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00058F@BX\u0002¢\u0006\u0012\n\u0004\b+\u0010X\u001a\u0004\bY\u0010\u001d\"\u0004\bZ\u0010[R\u001b\u0010^\u001a\u00020\u00058GX\u0002¢\u0006\f\n\u0004\b\\\u0010T\u001a\u0004\b]\u0010\u001dR+\u0010a\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00058F@BX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010X\u001a\u0004\b_\u0010\u001d\"\u0004\b`\u0010[R/\u0010d\u001a\u0004\u0018\u00018\u00002\b\u0010L\u001a\u0004\u0018\u00018\u00008B@BX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010N\u001a\u0004\bb\u0010P\"\u0004\bc\u0010RR7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8F@BX\u0002¢\u0006\u0012\n\u0004\b3\u0010N\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010iR\u0011\u0010m\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"LI0/d;", "T", "", "initialValue", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lm0/i;", "animationSpec", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;LnI/l;LnI/a;Lm0/i;LnI/l;)V", "LI0/C;", "anchors", "(Ljava/lang/Object;LI0/C;LnI/l;LnI/a;Lm0/i;LnI/l;)V", "offset", "currentValue", "velocity", "l", "(FLjava/lang/Object;F)Ljava/lang/Object;", "m", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "H", "(Ljava/lang/Object;)Z", "A", "()F", "newAnchors", "newTarget", "LXH/N;", "I", "(LI0/C;Ljava/lang/Object;)V", "G", "(FLdI/e;)Ljava/lang/Object;", "Ln0/L;", "dragPriority", "Lkotlin/Function3;", "LI0/c;", "LdI/e;", "block", "j", "(Ln0/L;LnI/q;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function4;", "i", "(Ljava/lang/Object;Ln0/L;LnI/r;LdI/e;)Ljava/lang/Object;", "delta", "z", "(F)F", "n", "a", "LnI/l;", "getPositionalThreshold$material_release", "()LnI/l;", "b", "LnI/a;", "getVelocityThreshold$material_release", "()LnI/a;", "c", "Lm0/i;", "p", "()Lm0/i;", "d", "r", "LI0/b0;", "e", "LI0/b0;", "dragMutex", "Lp0/r;", "f", "Lp0/r;", "u", "()Lp0/r;", "draggableState", "<set-?>", "g", "LU0/r0;", "s", "()Ljava/lang/Object;", "C", "(Ljava/lang/Object;)V", "h", "LU0/A1;", "x", "q", "closestValue", "LU0/n0;", "w", "F", "(F)V", "k", "getProgress", "progress", "v", "E", "lastVelocity", "t", "D", "dragTarget", "o", "()LI0/C;", "B", "(LI0/C;)V", "LI0/c;", "anchoredDragScope", "y", "()Z", "isAnimationRunning", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.d  reason: case insensitive filesystem */
public final class C4552d<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final b f7934p = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Float, Float> f7935a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<Float> f7936b;

    /* renamed from: c  reason: collision with root package name */
    private final C5546i<Float> f7937c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<T, Boolean> f7938d;

    /* renamed from: e  reason: collision with root package name */
    private final C4549b0 f7939e;

    /* renamed from: f  reason: collision with root package name */
    private final r f7940f;

    /* renamed from: g  reason: collision with root package name */
    private final C4899r0 f7941g;

    /* renamed from: h  reason: collision with root package name */
    private final A1 f7942h;

    /* renamed from: i  reason: collision with root package name */
    private final A1 f7943i;

    /* renamed from: j  reason: collision with root package name */
    private final C4892n0 f7944j;

    /* renamed from: k  reason: collision with root package name */
    private final A1 f7945k;

    /* renamed from: l  reason: collision with root package name */
    private final C4892n0 f7946l;

    /* renamed from: m  reason: collision with root package name */
    private final C4899r0 f7947m;

    /* renamed from: n  reason: collision with root package name */
    private final C4899r0 f7948n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C4550c f7949o;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I0.d$a */
    static final class a extends C17544u implements C17642l<T, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f7950c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(T t10) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI0/d$b;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I0.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {539}, m = "anchoredDrag")
    /* renamed from: I0.d$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f7951c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f7952d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f7953e;

        /* renamed from: f  reason: collision with root package name */
        int f7954f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4552d<T> dVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f7953e = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7952d = obj;
            this.f7954f |= Integer.MIN_VALUE;
            return this.f7953e.j((C5589L) null, (q) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {540}, m = "invokeSuspend")
    /* renamed from: I0.d$d  reason: collision with other inner class name */
    static final class C0108d extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f7955c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f7956d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<C4550c, C<T>, C17164e<? super C16807N>, Object> f7957e;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LI0/C;", "b", "()LI0/C;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I0.d$d$a */
        static final class a extends C17544u implements C17631a<C<T>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4552d<T> f7958c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4552d<T> dVar) {
                super(0);
                this.f7958c = dVar;
            }

            /* renamed from: b */
            public final C<T> invoke() {
                return this.f7958c.o();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LI0/C;", "latestAnchors", "LXH/N;", "<anonymous>", "(LI0/C;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {541}, m = "invokeSuspend")
        /* renamed from: I0.d$d$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements p<C<T>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f7959c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f7960d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ q<C4550c, C<T>, C17164e<? super C16807N>, Object> f7961e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4552d<T> f7962f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(q<? super C4550c, ? super C<T>, ? super C17164e<? super C16807N>, ? extends Object> qVar, C4552d<T> dVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f7961e = qVar;
                this.f7962f = dVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f7961e, this.f7962f, eVar);
                bVar.f7960d = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(C<T> c10, C17164e<? super C16807N> eVar) {
                return ((b) create(c10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f7959c;
                if (i10 == 0) {
                    y.b(obj);
                    q<C4550c, C<T>, C17164e<? super C16807N>, Object> qVar = this.f7961e;
                    C4550c c10 = this.f7962f.f7949o;
                    this.f7959c = 1;
                    if (qVar.invoke(c10, (C) this.f7960d, this) == f10) {
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
        C0108d(C4552d<T> dVar, q<? super C4550c, ? super C<T>, ? super C17164e<? super C16807N>, ? extends Object> qVar, C17164e<? super C0108d> eVar) {
            super(1, eVar);
            this.f7956d = dVar;
            this.f7957e = qVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C0108d(this.f7956d, this.f7957e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((C0108d) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f7955c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a(this.f7956d);
                b bVar = new b(this.f7957e, this.f7956d, (C17164e<? super b>) null);
                this.f7955c = 1;
                if (androidx.compose.material.a.j(aVar, bVar, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {585}, m = "anchoredDrag")
    /* renamed from: I0.d$e */
    static final class e extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f7963c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f7964d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f7965e;

        /* renamed from: f  reason: collision with root package name */
        int f7966f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C4552d<T> dVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f7965e = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7964d = obj;
            this.f7966f |= Integer.MIN_VALUE;
            return this.f7965e.i(null, (C5589L) null, (nI.r) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {587}, m = "invokeSuspend")
    /* renamed from: I0.d$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f7967c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f7968d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f7969e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ nI.r<C4550c, C<T>, T, C17164e<? super C16807N>, Object> f7970f;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXH/v;", "LI0/C;", "b", "()LXH/v;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I0.d$f$a */
        static final class a extends C17544u implements C17631a<v<? extends C<T>, ? extends T>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4552d<T> f7971c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4552d<T> dVar) {
                super(0);
                this.f7971c = dVar;
            }

            /* renamed from: b */
            public final v<C<T>, T> invoke() {
                return C16796C.a(this.f7971c.o(), this.f7971c.x());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LXH/v;", "LI0/C;", "<name for destructuring parameter 0>", "LXH/N;", "<anonymous>", "(LXH/v;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {590}, m = "invokeSuspend")
        /* renamed from: I0.d$f$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements p<v<? extends C<T>, ? extends T>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f7972c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f7973d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ nI.r<C4550c, C<T>, T, C17164e<? super C16807N>, Object> f7974e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4552d<T> f7975f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(nI.r<? super C4550c, ? super C<T>, ? super T, ? super C17164e<? super C16807N>, ? extends Object> rVar, C4552d<T> dVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f7974e = rVar;
                this.f7975f = dVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f7974e, this.f7975f, eVar);
                bVar.f7973d = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(v<? extends C<T>, ? extends T> vVar, C17164e<? super C16807N> eVar) {
                return ((b) create(vVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f7972c;
                if (i10 == 0) {
                    y.b(obj);
                    v vVar = (v) this.f7973d;
                    Object b10 = vVar.b();
                    nI.r<C4550c, C<T>, T, C17164e<? super C16807N>, Object> rVar = this.f7974e;
                    C4550c c10 = this.f7975f.f7949o;
                    this.f7972c = 1;
                    if (rVar.l(c10, (C) vVar.a(), b10, this) == f10) {
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
        f(C4552d<T> dVar, T t10, nI.r<? super C4550c, ? super C<T>, ? super T, ? super C17164e<? super C16807N>, ? extends Object> rVar, C17164e<? super f> eVar) {
            super(1, eVar);
            this.f7968d = dVar;
            this.f7969e = t10;
            this.f7970f = rVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new f(this.f7968d, this.f7969e, this.f7970f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((f) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f7967c;
            if (i10 == 0) {
                y.b(obj);
                this.f7968d.D(this.f7969e);
                a aVar = new a(this.f7968d);
                b bVar = new b(this.f7970f, this.f7968d, (C17164e<? super b>) null);
                this.f7967c = 1;
                if (androidx.compose.material.a.j(aVar, bVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"I0/d$g", "LI0/c;", "", "newOffset", "lastKnownVelocity", "LXH/N;", "a", "(FF)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I0.d$g */
    public static final class g implements C4550c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f7976a;

        g(C4552d<T> dVar) {
            this.f7976a = dVar;
        }

        public void a(float f10, float f11) {
            this.f7976a.F(f10);
            this.f7976a.E(f11);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I0.d$h */
    static final class h extends C17544u implements C17631a<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f7977c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C4552d<T> dVar) {
            super(0);
            this.f7977c = dVar;
        }

        public final T invoke() {
            T d10 = this.f7977c.t();
            if (d10 != null) {
                return d10;
            }
            C4552d<T> dVar = this.f7977c;
            float w10 = dVar.w();
            return !Float.isNaN(w10) ? dVar.m(w10, dVar.s()) : dVar.s();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0005*\u0002\u0000\f\b\n\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"I0/d$i", "Lp0/r;", "Ln0/L;", "dragPriority", "Lkotlin/Function2;", "Lp0/n;", "LdI/e;", "LXH/N;", "", "block", "b", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "I0/d$i$b", "a", "LI0/d$i$b;", "dragScope", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I0.d$i */
    public static final class i implements r {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final b f7978a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f7979b;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LI0/c;", "LI0/C;", "it", "LXH/N;", "<anonymous>", "(LI0/c;LI0/C;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {292}, m = "invokeSuspend")
        /* renamed from: I0.d$i$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements q<C4550c, C<T>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f7980c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ i f7981d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<n, C17164e<? super C16807N>, Object> f7982e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar, p pVar, C17164e eVar) {
                super(3, eVar);
                this.f7981d = iVar;
                this.f7982e = pVar;
            }

            /* renamed from: i */
            public final Object invoke(C4550c cVar, C<T> c10, C17164e<? super C16807N> eVar) {
                return new a(this.f7981d, this.f7982e, eVar).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f7980c;
                if (i10 == 0) {
                    y.b(obj);
                    b c10 = this.f7981d.f7978a;
                    p<n, C17164e<? super C16807N>, Object> pVar = this.f7982e;
                    this.f7980c = 1;
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

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"I0/d$i$b", "Lp0/n;", "", "pixels", "LXH/N;", "a", "(F)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: I0.d$i$b */
        public static final class b implements n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4552d<T> f7983a;

            b(C4552d<T> dVar) {
                this.f7983a = dVar;
            }

            public void a(float f10) {
                C4550c.b(this.f7983a.f7949o, this.f7983a.z(f10), 0.0f, 2, (Object) null);
            }
        }

        i(C4552d<T> dVar) {
            this.f7979b = dVar;
            this.f7978a = new b(dVar);
        }

        public Object b(C5589L l10, p<? super n, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
            Object j10 = this.f7979b.j(l10, new a(this, pVar, (C17164e) null), eVar);
            return j10 == C17187b.f() ? j10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I0.d$j */
    static final class j extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f7984c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C4552d<T> dVar) {
            super(0);
            this.f7984c = dVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            float f10 = this.f7984c.o().f(this.f7984c.s());
            float f11 = this.f7984c.o().f(this.f7984c.q()) - f10;
            float abs = Math.abs(f11);
            float f12 = 1.0f;
            if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                float A10 = (this.f7984c.A() - f10) / f11;
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
    /* renamed from: I0.d$k */
    static final class k extends C17544u implements C17631a<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f7985c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C4552d<T> dVar) {
            super(0);
            this.f7985c = dVar;
        }

        public final T invoke() {
            T d10 = this.f7985c.t();
            if (d10 != null) {
                return d10;
            }
            C4552d<T> dVar = this.f7985c;
            float w10 = dVar.w();
            return !Float.isNaN(w10) ? dVar.l(w10, dVar.s(), 0.0f) : dVar.s();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I0.d$l */
    static final class l extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4552d<T> f7986c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ T f7987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C4552d<T> dVar, T t10) {
            super(0);
            this.f7986c = dVar;
            this.f7987d = t10;
        }

        public final void invoke() {
            C4550c c10 = this.f7986c.f7949o;
            C4552d<T> dVar = this.f7986c;
            T t10 = this.f7987d;
            float f10 = dVar.o().f(t10);
            if (!Float.isNaN(f10)) {
                C4550c.b(c10, f10, 0.0f, 2, (Object) null);
                dVar.D(null);
            }
            dVar.C(t10);
        }
    }

    public C4552d(T t10, C17642l<? super Float, Float> lVar, C17631a<Float> aVar, C5546i<Float> iVar, C17642l<? super T, Boolean> lVar2) {
        this.f7935a = lVar;
        this.f7936b = aVar;
        this.f7937c = iVar;
        this.f7938d = lVar2;
        this.f7939e = new C4549b0();
        this.f7940f = new i(this);
        this.f7941g = u1.e(t10, (o1) null, 2, (Object) null);
        this.f7942h = p1.e(new k(this));
        this.f7943i = p1.e(new h(this));
        this.f7944j = D0.a(Float.NaN);
        this.f7945k = p1.d(p1.s(), new j(this));
        this.f7946l = D0.a(0.0f);
        this.f7947m = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f7948n = u1.e(androidx.compose.material.a.i(), (o1) null, 2, (Object) null);
        this.f7949o = new g(this);
    }

    private final void B(C<T> c10) {
        this.f7948n.setValue(c10);
    }

    /* access modifiers changed from: private */
    public final void C(T t10) {
        this.f7941g.setValue(t10);
    }

    /* access modifiers changed from: private */
    public final void D(T t10) {
        this.f7947m.setValue(t10);
    }

    /* access modifiers changed from: private */
    public final void E(float f10) {
        this.f7946l.n(f10);
    }

    /* access modifiers changed from: private */
    public final void F(float f10) {
        this.f7944j.n(f10);
    }

    private final boolean H(T t10) {
        return this.f7939e.e(new l(this, t10));
    }

    public static /* synthetic */ void J(C4552d dVar, C c10, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            if (!Float.isNaN(dVar.w())) {
                obj = c10.c(dVar.w());
                if (obj == null) {
                    obj = dVar.x();
                }
            } else {
                obj = dVar.x();
            }
        }
        dVar.I(c10, obj);
    }

    public static /* synthetic */ Object k(C4552d dVar, Object obj, C5589L l10, nI.r rVar, C17164e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            l10 = C5589L.Default;
        }
        return dVar.i(obj, l10, rVar, eVar);
    }

    /* access modifiers changed from: private */
    public final T l(float f10, T t10, float f11) {
        T b10;
        C o10 = o();
        float f12 = o10.f(t10);
        float floatValue = this.f7936b.invoke().floatValue();
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
            if (f10 < Math.abs(f12 + Math.abs(this.f7935a.invoke(Float.valueOf(Math.abs(o10.f(b10) - f12))).floatValue()))) {
                return t10;
            }
        } else if (f11 <= (-floatValue)) {
            T b12 = o10.b(f10, false);
            C17542s.g(b12);
            return b12;
        } else {
            b10 = o10.b(f10, false);
            C17542s.g(b10);
            float abs = Math.abs(f12 - Math.abs(this.f7935a.invoke(Float.valueOf(Math.abs(f12 - o10.f(b10)))).floatValue()));
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
        C o10 = o();
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
        return this.f7947m.getValue();
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
        if (this.f7938d.invoke(l10).booleanValue()) {
            Object f11 = androidx.compose.material.a.f(this, l10, f10, eVar);
            return f11 == C17187b.f() ? f11 : C16807N.f139792a;
        }
        Object f12 = androidx.compose.material.a.f(this, s10, f10, eVar);
        return f12 == C17187b.f() ? f12 : C16807N.f139792a;
    }

    public final void I(C<T> c10, T t10) {
        if (!C17542s.e(o(), c10)) {
            B(c10);
            if (!H(t10)) {
                D(t10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(T r7, n0.C5589L r8, nI.r<? super I0.C4550c, ? super I0.C<T>, ? super T, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r9, dI.C17164e<? super XH.C16807N> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof I0.C4552d.e
            if (r0 == 0) goto L_0x0013
            r0 = r10
            I0.d$e r0 = (I0.C4552d.e) r0
            int r1 = r0.f7966f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7966f = r1
            goto L_0x0018
        L_0x0013:
            I0.d$e r0 = new I0.d$e
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f7964d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f7966f
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r7 = r0.f7963c
            I0.d r7 = (I0.C4552d) r7
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
            I0.C r10 = r6.o()
            boolean r10 = r10.d(r7)
            if (r10 == 0) goto L_0x00cc
            I0.b0 r10 = r6.f7939e     // Catch:{ all -> 0x0092 }
            I0.d$f r2 = new I0.d$f     // Catch:{ all -> 0x0092 }
            r2.<init>(r6, r7, r9, r5)     // Catch:{ all -> 0x0092 }
            r0.f7963c = r6     // Catch:{ all -> 0x0092 }
            r0.f7966f = r4     // Catch:{ all -> 0x0092 }
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch:{ all -> 0x0092 }
            if (r7 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r7 = r6
        L_0x005a:
            r7.D(r5)
            I0.C r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto L_0x00cf
            float r9 = r7.w()
            I0.C r10 = r7.o()
            float r10 = r10.f(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00cf
            nI.l<T, java.lang.Boolean> r9 = r7.f7938d
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
            I0.C r9 = r7.o()
            float r10 = r7.w()
            java.lang.Object r9 = r9.c(r10)
            if (r9 == 0) goto L_0x00cb
            float r10 = r7.w()
            I0.C r0 = r7.o()
            float r0 = r0.f(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x00cb
            nI.l<T, java.lang.Boolean> r10 = r7.f7938d
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
        throw new UnsupportedOperationException("Method not decompiled: I0.C4552d.i(java.lang.Object, n0.L, nI.r, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(n0.C5589L r7, nI.q<? super I0.C4550c, ? super I0.C<T>, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof I0.C4552d.c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            I0.d$c r0 = (I0.C4552d.c) r0
            int r1 = r0.f7954f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7954f = r1
            goto L_0x0018
        L_0x0013:
            I0.d$c r0 = new I0.d$c
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f7952d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f7954f
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r7 = r0.f7951c
            I0.d r7 = (I0.C4552d) r7
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
            I0.b0 r9 = r6.f7939e     // Catch:{ all -> 0x0087 }
            I0.d$d r2 = new I0.d$d     // Catch:{ all -> 0x0087 }
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch:{ all -> 0x0087 }
            r0.f7951c = r6     // Catch:{ all -> 0x0087 }
            r0.f7954f = r4     // Catch:{ all -> 0x0087 }
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch:{ all -> 0x0087 }
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r7 = r6
        L_0x0050:
            I0.C r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto L_0x0084
            float r9 = r7.w()
            I0.C r0 = r7.o()
            float r0 = r0.f(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0084
            nI.l<T, java.lang.Boolean> r9 = r7.f7938d
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
            I0.C r9 = r7.o()
            float r0 = r7.w()
            java.lang.Object r9 = r9.c(r0)
            if (r9 == 0) goto L_0x00bd
            float r0 = r7.w()
            I0.C r1 = r7.o()
            float r1 = r1.f(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00bd
            nI.l<T, java.lang.Boolean> r0 = r7.f7938d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bd
            r7.C(r9)
        L_0x00bd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.C4552d.j(n0.L, nI.q, dI.e):java.lang.Object");
    }

    public final float n(float f10) {
        float z10 = z(f10);
        float w10 = Float.isNaN(w()) ? 0.0f : w();
        F(z10);
        return z10 - w10;
    }

    public final C<T> o() {
        return (C) this.f7948n.getValue();
    }

    public final C5546i<Float> p() {
        return this.f7937c;
    }

    public final T q() {
        return this.f7943i.getValue();
    }

    public final C17642l<T, Boolean> r() {
        return this.f7938d;
    }

    public final T s() {
        return this.f7941g.getValue();
    }

    public final r u() {
        return this.f7940f;
    }

    public final float v() {
        return this.f7946l.a();
    }

    public final float w() {
        return this.f7944j.a();
    }

    public final T x() {
        return this.f7942h.getValue();
    }

    public final boolean y() {
        return t() != null;
    }

    public final float z(float f10) {
        return C17978n.l((Float.isNaN(w()) ? 0.0f : w()) + f10, o().e(), o().g());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4552d(Object obj, C c10, C17642l lVar, C17631a aVar, C5546i iVar, C17642l lVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, c10, lVar, aVar, iVar, (i10 & 32) != 0 ? a.f7950c : lVar2);
    }

    public C4552d(T t10, C<T> c10, C17642l<? super Float, Float> lVar, C17631a<Float> aVar, C5546i<Float> iVar, C17642l<? super T, Boolean> lVar2) {
        this(t10, lVar, aVar, iVar, lVar2);
        B(c10);
        H(t10);
    }
}
