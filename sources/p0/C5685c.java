package p0;

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
import f1.C5309k;
import f1.C5310l;
import f1.m;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5546i;
import m0.C5570z;
import n0.C5589L;
import n0.C5591N;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import tI.C17978n;

@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\b\u0007*\u0001m\b\u0007\u0018\u0000 O*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001:Bc\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010#\u001a\u00020\"2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\b\b\u0002\u0010!\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H@¢\u0006\u0004\b%\u0010&JJ\u0010-\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020'2.\u0010,\u001a*\b\u0001\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0+\u0012\u0006\u0012\u0004\u0018\u00010\u00020)H@¢\u0006\u0004\b-\u0010.JX\u00100\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010(\u001a\u00020'24\u0010,\u001a0\b\u0001\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0+\u0012\u0006\u0012\u0004\u0018\u00010\u00020/H@¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0000¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005¢\u0006\u0004\b5\u00104R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0000X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u00048\u0000X\u0004¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u00109R\u0014\u0010K\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR+\u0010\u0012\u001a\u00028\u00002\u0006\u0010L\u001a\u00028\u00008F@BX\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR+\u0010U\u001a\u00028\u00002\u0006\u0010L\u001a\u00028\u00008F@BX\u0002¢\u0006\u0012\n\u0004\b0\u0010N\u001a\u0004\bS\u0010P\"\u0004\bT\u0010RR\u001b\u0010\u0016\u001a\u00028\u00008FX\u0002¢\u0006\f\n\u0004\b-\u0010V\u001a\u0004\bW\u0010PR+\u0010\u0011\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00058F@BX\u0002¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010\u001a\"\u0004\b[\u0010\\R!\u0010a\u001a\u00020\u00058GX\u0002¢\u0006\u0012\n\u0004\b]\u0010V\u0012\u0004\b_\u0010`\u001a\u0004\b^\u0010\u001aR+\u0010d\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00058F@BX\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010Y\u001a\u0004\bb\u0010\u001a\"\u0004\bc\u0010\\R/\u0010g\u001a\u0004\u0018\u00018\u00002\b\u0010L\u001a\u0004\u0018\u00018\u00008B@BX\u0002¢\u0006\u0012\n\u0004\b5\u0010N\u001a\u0004\be\u0010P\"\u0004\bf\u0010RR7\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8F@BX\u0002¢\u0006\u0012\n\u0004\bh\u0010N\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000m8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010nR\u0011\u0010r\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Lp0/c;", "T", "", "initialValue", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lm0/i;", "snapAnimationSpec", "Lm0/z;", "decayAnimationSpec", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;LnI/l;LnI/a;Lm0/i;Lm0/z;LnI/l;)V", "offset", "currentValue", "velocity", "l", "(FLjava/lang/Object;F)Ljava/lang/Object;", "targetValue", "I", "(Ljava/lang/Object;)Z", "A", "()F", "from", "to", "z", "(Ljava/lang/Object;Ljava/lang/Object;)F", "Lp0/o;", "newAnchors", "newTarget", "LXH/N;", "J", "(Lp0/o;Ljava/lang/Object;)V", "H", "(FLdI/e;)Ljava/lang/Object;", "Ln0/L;", "dragPriority", "Lkotlin/Function3;", "Lp0/b;", "LdI/e;", "block", "i", "(Ln0/L;LnI/q;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function4;", "h", "(Ljava/lang/Object;Ln0/L;LnI/r;LdI/e;)Ljava/lang/Object;", "delta", "y", "(F)F", "m", "a", "LnI/l;", "getPositionalThreshold$foundation_release", "()LnI/l;", "b", "LnI/a;", "getVelocityThreshold$foundation_release", "()LnI/a;", "c", "Lm0/i;", "v", "()Lm0/i;", "d", "Lm0/z;", "q", "()Lm0/z;", "e", "o", "Ln0/N;", "f", "Ln0/N;", "dragMutex", "<set-?>", "g", "LU0/r0;", "p", "()Ljava/lang/Object;", "C", "(Ljava/lang/Object;)V", "u", "G", "settledValue", "LU0/A1;", "w", "j", "LU0/n0;", "t", "F", "(F)V", "k", "getProgress", "getProgress$annotations", "()V", "progress", "s", "E", "lastVelocity", "r", "D", "dragTarget", "n", "()Lp0/o;", "B", "(Lp0/o;)V", "anchors", "p0/c$f", "Lp0/c$f;", "anchoredDragScope", "x", "()Z", "isAnimationRunning", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.c  reason: case insensitive filesystem */
public final class C5685c<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final b f26943p = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Float, Float> f26944a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<Float> f26945b;

    /* renamed from: c  reason: collision with root package name */
    private final C5546i<Float> f26946c;

    /* renamed from: d  reason: collision with root package name */
    private final C5570z<Float> f26947d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<T, Boolean> f26948e;

    /* renamed from: f  reason: collision with root package name */
    private final C5591N f26949f;

    /* renamed from: g  reason: collision with root package name */
    private final C4899r0 f26950g;

    /* renamed from: h  reason: collision with root package name */
    private final C4899r0 f26951h;

    /* renamed from: i  reason: collision with root package name */
    private final A1 f26952i;

    /* renamed from: j  reason: collision with root package name */
    private final C4892n0 f26953j;

    /* renamed from: k  reason: collision with root package name */
    private final A1 f26954k;

    /* renamed from: l  reason: collision with root package name */
    private final C4892n0 f26955l;

    /* renamed from: m  reason: collision with root package name */
    private final C4899r0 f26956m;

    /* renamed from: n  reason: collision with root package name */
    private final C4899r0 f26957n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final f f26958o;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: p0.c$a */
    static final class a extends C17544u implements C17642l<T, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f26959c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(T t10) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000e0\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp0/c$b;", "", "<init>", "()V", "T", "Lm0/i;", "", "snapAnimationSpec", "Lm0/z;", "decayAnimationSpec", "Lkotlin/Function1;", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "", "confirmValueChange", "Lf1/k;", "Lp0/c;", "a", "(Lm0/i;Lm0/z;LnI/l;LnI/a;LnI/l;)Lf1/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p0.c$b */
    public static final class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: p0.c$b$a */
        static final class a extends C17544u implements C17642l<T, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f26960c = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(T t10) {
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lf1/m;", "Lp0/c;", "it", "a", "(Lf1/m;Lp0/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: p0.c$b$b  reason: collision with other inner class name */
        static final class C0435b extends C17544u implements p<m, C5685c<T>, T> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0435b f26961c = new C0435b();

            C0435b() {
                super(2);
            }

            /* renamed from: a */
            public final T invoke(m mVar, C5685c<T> cVar) {
                return cVar.p();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "Lp0/c;", "a", "(Ljava/lang/Object;)Lp0/c;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: p0.c$b$c  reason: collision with other inner class name */
        static final class C0436c extends C17544u implements C17642l<T, C5685c<T>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l<Float, Float> f26962c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17631a<Float> f26963d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C5546i<Float> f26964e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C5570z<Float> f26965f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17642l<T, Boolean> f26966g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0436c(C17642l<? super Float, Float> lVar, C17631a<Float> aVar, C5546i<Float> iVar, C5570z<Float> zVar, C17642l<? super T, Boolean> lVar2) {
                super(1);
                this.f26962c = lVar;
                this.f26963d = aVar;
                this.f26964e = iVar;
                this.f26965f = zVar;
                this.f26966g = lVar2;
            }

            /* renamed from: a */
            public final C5685c<T> invoke(T t10) {
                return new C5685c(t10, this.f26962c, this.f26963d, this.f26964e, this.f26965f, this.f26966g);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C5309k b(b bVar, C5546i iVar, C5570z zVar, C17642l lVar, C17631a aVar, C17642l lVar2, int i10, Object obj) {
            if ((i10 & 16) != 0) {
                lVar2 = a.f26960c;
            }
            return bVar.a(iVar, zVar, lVar, aVar, lVar2);
        }

        public final <T> C5309k<C5685c<T>, T> a(C5546i<Float> iVar, C5570z<Float> zVar, C17642l<? super Float, Float> lVar, C17631a<Float> aVar, C17642l<? super T, Boolean> lVar2) {
            return C5310l.a(C0435b.f26961c, new C0436c(lVar, aVar, iVar, zVar, lVar2));
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {835}, m = "invokeSuspend")
    /* renamed from: p0.c$c  reason: collision with other inner class name */
    static final class C0437c extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f26967c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5685c<T> f26968d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<C5684b, o<T>, C17164e<? super C16807N>, Object> f26969e;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lp0/o;", "b", "()Lp0/o;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: p0.c$c$a */
        static final class a extends C17544u implements C17631a<o<T>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5685c<T> f26970c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5685c<T> cVar) {
                super(0);
                this.f26970c = cVar;
            }

            /* renamed from: b */
            public final o<T> invoke() {
                return this.f26970c.n();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lp0/o;", "latestAnchors", "LXH/N;", "<anonymous>", "(Lp0/o;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {836}, m = "invokeSuspend")
        /* renamed from: p0.c$c$b */
        static final class b extends l implements p<o<T>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f26971c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f26972d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ q<C5684b, o<T>, C17164e<? super C16807N>, Object> f26973e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C5685c<T> f26974f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(q<? super C5684b, ? super o<T>, ? super C17164e<? super C16807N>, ? extends Object> qVar, C5685c<T> cVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f26973e = qVar;
                this.f26974f = cVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f26973e, this.f26974f, eVar);
                bVar.f26972d = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(o<T> oVar, C17164e<? super C16807N> eVar) {
                return ((b) create(oVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f26971c;
                if (i10 == 0) {
                    y.b(obj);
                    q<C5684b, o<T>, C17164e<? super C16807N>, Object> qVar = this.f26973e;
                    f a10 = this.f26974f.f26958o;
                    this.f26971c = 1;
                    if (qVar.invoke(a10, (o) this.f26972d, this) == f10) {
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
        C0437c(C5685c<T> cVar, q<? super C5684b, ? super o<T>, ? super C17164e<? super C16807N>, ? extends Object> qVar, C17164e<? super C0437c> eVar) {
            super(1, eVar);
            this.f26968d = cVar;
            this.f26969e = qVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C0437c(this.f26968d, this.f26969e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((C0437c) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f26967c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a(this.f26968d);
                b bVar = new b(this.f26969e, this.f26968d, (C17164e<? super b>) null);
                this.f26967c = 1;
                if (androidx.compose.foundation.gestures.a.r(aVar, bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            T c10 = this.f26968d.n().c(this.f26968d.t());
            if (c10 != null) {
                if (Math.abs(this.f26968d.t() - this.f26968d.n().f(c10)) < 0.5f && this.f26968d.o().invoke(c10).booleanValue()) {
                    this.f26968d.G(c10);
                    this.f26968d.C(c10);
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {880}, m = "anchoredDrag")
    /* renamed from: p0.c$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f26975c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f26976d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5685c<T> f26977e;

        /* renamed from: f  reason: collision with root package name */
        int f26978f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C5685c<T> cVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f26977e = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f26976d = obj;
            this.f26978f |= Integer.MIN_VALUE;
            return this.f26977e.h(null, (C5589L) null, (r) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {882}, m = "invokeSuspend")
    /* renamed from: p0.c$e */
    static final class e extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f26979c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5685c<T> f26980d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f26981e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r<C5684b, o<T>, T, C17164e<? super C16807N>, Object> f26982f;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXH/v;", "Lp0/o;", "b", "()LXH/v;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: p0.c$e$a */
        static final class a extends C17544u implements C17631a<v<? extends o<T>, ? extends T>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5685c<T> f26983c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5685c<T> cVar) {
                super(0);
                this.f26983c = cVar;
            }

            /* renamed from: b */
            public final v<o<T>, T> invoke() {
                return C16796C.a(this.f26983c.n(), this.f26983c.w());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LXH/v;", "Lp0/o;", "<name for destructuring parameter 0>", "LXH/N;", "<anonymous>", "(LXH/v;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {885}, m = "invokeSuspend")
        /* renamed from: p0.c$e$b */
        static final class b extends l implements p<v<? extends o<T>, ? extends T>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f26984c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f26985d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ r<C5684b, o<T>, T, C17164e<? super C16807N>, Object> f26986e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C5685c<T> f26987f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(r<? super C5684b, ? super o<T>, ? super T, ? super C17164e<? super C16807N>, ? extends Object> rVar, C5685c<T> cVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f26986e = rVar;
                this.f26987f = cVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f26986e, this.f26987f, eVar);
                bVar.f26985d = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(v<? extends o<T>, ? extends T> vVar, C17164e<? super C16807N> eVar) {
                return ((b) create(vVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f26984c;
                if (i10 == 0) {
                    y.b(obj);
                    v vVar = (v) this.f26985d;
                    Object b10 = vVar.b();
                    r<C5684b, o<T>, T, C17164e<? super C16807N>, Object> rVar = this.f26986e;
                    f a10 = this.f26987f.f26958o;
                    this.f26984c = 1;
                    if (rVar.l(a10, (o) vVar.a(), b10, this) == f10) {
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
        e(C5685c<T> cVar, T t10, r<? super C5684b, ? super o<T>, ? super T, ? super C17164e<? super C16807N>, ? extends Object> rVar, C17164e<? super e> eVar) {
            super(1, eVar);
            this.f26980d = cVar;
            this.f26981e = t10;
            this.f26982f = rVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new e(this.f26980d, this.f26981e, this.f26982f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((e) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f26979c;
            if (i10 == 0) {
                y.b(obj);
                this.f26980d.D(this.f26981e);
                a aVar = new a(this.f26980d);
                b bVar = new b(this.f26982f, this.f26980d, (C17164e<? super b>) null);
                this.f26979c = 1;
                if (androidx.compose.foundation.gestures.a.r(aVar, bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.f26980d.o().invoke(this.f26981e).booleanValue()) {
                this.f26980d.f26958o.a(this.f26980d.n().f(this.f26981e), this.f26980d.s());
                this.f26980d.G(this.f26981e);
                this.f26980d.C(this.f26981e);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"p0/c$f", "Lp0/b;", "", "newOffset", "lastKnownVelocity", "LXH/N;", "a", "(FF)V", "", "isMovingForward", "d", "(Z)V", "c", "Ljava/lang/Object;", "getLeftBound", "()Ljava/lang/Object;", "setLeftBound", "(Ljava/lang/Object;)V", "leftBound", "b", "getRightBound", "setRightBound", "rightBound", "F", "getDistance", "()F", "setDistance", "(F)V", "distance", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p0.c$f */
    public static final class f implements C5684b {

        /* renamed from: a  reason: collision with root package name */
        private T f26988a;

        /* renamed from: b  reason: collision with root package name */
        private T f26989b;

        /* renamed from: c  reason: collision with root package name */
        private float f26990c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5685c<T> f26991d;

        f(C5685c<T> cVar) {
            this.f26991d = cVar;
        }

        public void a(float f10, float f11) {
            float t10 = this.f26991d.t();
            this.f26991d.F(f10);
            this.f26991d.E(f11);
            if (!Float.isNaN(t10)) {
                d(f10 >= t10);
            }
        }

        public final void c(boolean z10) {
            if (this.f26991d.t() == this.f26991d.n().f(this.f26991d.p())) {
                T b10 = this.f26991d.n().b(this.f26991d.t() + (z10 ? 1.0f : -1.0f), z10);
                if (b10 == null) {
                    b10 = this.f26991d.p();
                }
                if (z10) {
                    this.f26988a = this.f26991d.p();
                    this.f26989b = b10;
                } else {
                    this.f26988a = b10;
                    this.f26989b = this.f26991d.p();
                }
            } else {
                T b11 = this.f26991d.n().b(this.f26991d.t(), false);
                if (b11 == null) {
                    b11 = this.f26991d.p();
                }
                T b12 = this.f26991d.n().b(this.f26991d.t(), true);
                if (b12 == null) {
                    b12 = this.f26991d.p();
                }
                this.f26988a = b11;
                this.f26989b = b12;
            }
            o<T> n10 = this.f26991d.n();
            T t10 = this.f26988a;
            C17542s.g(t10);
            float f10 = n10.f(t10);
            o<T> n11 = this.f26991d.n();
            T t11 = this.f26989b;
            C17542s.g(t11);
            this.f26990c = Math.abs(f10 - n11.f(t11));
        }

        public final void d(boolean z10) {
            c(z10);
            if (Math.abs(this.f26991d.t() - this.f26991d.n().f(this.f26991d.p())) >= this.f26990c / 2.0f) {
                T t10 = z10 ? this.f26989b : this.f26988a;
                if (t10 == null) {
                    t10 = this.f26991d.p();
                }
                if (this.f26991d.o().invoke(t10).booleanValue()) {
                    this.f26991d.C(t10);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: p0.c$g */
    static final class g extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5685c<T> f26992c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C5685c<T> cVar) {
            super(0);
            this.f26992c = cVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            float f10 = this.f26992c.n().f(this.f26992c.u());
            float f11 = this.f26992c.n().f(this.f26992c.w()) - f10;
            float abs = Math.abs(f11);
            float f12 = 1.0f;
            if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                float A10 = (this.f26992c.A() - f10) / f11;
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
    /* renamed from: p0.c$h */
    static final class h extends C17544u implements C17631a<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5685c<T> f26993c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C5685c<T> cVar) {
            super(0);
            this.f26993c = cVar;
        }

        public final T invoke() {
            T b10 = this.f26993c.r();
            if (b10 != null) {
                return b10;
            }
            C5685c<T> cVar = this.f26993c;
            if (Float.isNaN(cVar.t())) {
                return cVar.p();
            }
            T c10 = cVar.n().c(cVar.t());
            return c10 == null ? cVar.p() : c10;
        }
    }

    public C5685c(T t10, C17642l<? super Float, Float> lVar, C17631a<Float> aVar, C5546i<Float> iVar, C5570z<Float> zVar, C17642l<? super T, Boolean> lVar2) {
        this.f26944a = lVar;
        this.f26945b = aVar;
        this.f26946c = iVar;
        this.f26947d = zVar;
        this.f26948e = lVar2;
        this.f26949f = new C5591N();
        this.f26950g = u1.e(t10, (o1) null, 2, (Object) null);
        this.f26951h = u1.e(t10, (o1) null, 2, (Object) null);
        this.f26952i = p1.e(new h(this));
        this.f26953j = D0.a(Float.NaN);
        this.f26954k = p1.d(p1.s(), new g(this));
        this.f26955l = D0.a(0.0f);
        this.f26956m = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f26957n = u1.e(androidx.compose.foundation.gestures.a.o(), (o1) null, 2, (Object) null);
        this.f26958o = new f(this);
    }

    private final void B(o<T> oVar) {
        this.f26957n.setValue(oVar);
    }

    /* access modifiers changed from: private */
    public final void C(T t10) {
        this.f26950g.setValue(t10);
    }

    /* access modifiers changed from: private */
    public final void D(T t10) {
        this.f26956m.setValue(t10);
    }

    /* access modifiers changed from: private */
    public final void E(float f10) {
        this.f26955l.n(f10);
    }

    /* access modifiers changed from: private */
    public final void F(float f10) {
        this.f26953j.n(f10);
    }

    /* access modifiers changed from: private */
    public final void G(T t10) {
        this.f26951h.setValue(t10);
    }

    private final boolean I(T t10) {
        C5591N n10 = this.f26949f;
        boolean g10 = n10.g();
        if (g10) {
            try {
                f fVar = this.f26958o;
                float f10 = n().f(t10);
                if (!Float.isNaN(f10)) {
                    C5684b.b(fVar, f10, 0.0f, 2, (Object) null);
                    D((Object) null);
                }
                C(t10);
                G(t10);
                n10.i();
            } catch (Throwable th2) {
                n10.i();
                throw th2;
            }
        }
        return g10;
    }

    public static /* synthetic */ Object j(C5685c cVar, Object obj, C5589L l10, r rVar, C17164e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            l10 = C5589L.Default;
        }
        return cVar.h(obj, l10, rVar, eVar);
    }

    public static /* synthetic */ Object k(C5685c cVar, C5589L l10, q qVar, C17164e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = C5589L.Default;
        }
        return cVar.i(l10, qVar, eVar);
    }

    private final T l(float f10, T t10, float f11) {
        o n10 = n();
        float f12 = n10.f(t10);
        float floatValue = this.f26945b.invoke().floatValue();
        if (f12 == f10 || Float.isNaN(f12)) {
            return t10;
        }
        boolean z10 = false;
        if (Math.abs(f11) >= Math.abs(floatValue)) {
            if (Math.signum(f11) > 0.0f) {
                z10 = true;
            }
            T b10 = n10.b(f10, z10);
            C17542s.g(b10);
            return b10;
        }
        if (f10 - f12 > 0.0f) {
            z10 = true;
        }
        T b11 = n10.b(f10, z10);
        C17542s.g(b11);
        return Math.abs(f12 - f10) <= Math.abs(this.f26944a.invoke(Float.valueOf(Math.abs(f12 - n10.f(b11)))).floatValue()) ? t10 : b11;
    }

    /* access modifiers changed from: private */
    public final T r() {
        return this.f26956m.getValue();
    }

    public final float A() {
        if (!Float.isNaN(t())) {
            return t();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final Object H(float f10, C17164e<? super Float> eVar) {
        Object p10 = p();
        Object l10 = l(A(), p10, f10);
        return this.f26948e.invoke(l10).booleanValue() ? androidx.compose.foundation.gestures.a.m(this, l10, f10, eVar) : androidx.compose.foundation.gestures.a.m(this, p10, f10, eVar);
    }

    public final void J(o<T> oVar, T t10) {
        if (!C17542s.e(n(), oVar)) {
            B(oVar);
            if (!I(t10)) {
                D(t10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(T r6, n0.C5589L r7, nI.r<? super p0.C5684b, ? super p0.o<T>, ? super T, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof p0.C5685c.d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            p0.c$d r0 = (p0.C5685c.d) r0
            int r1 = r0.f26978f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26978f = r1
            goto L_0x0018
        L_0x0013:
            p0.c$d r0 = new p0.c$d
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f26976d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f26978f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.f26975c
            p0.c r6 = (p0.C5685c) r6
            XH.y.b(r9)     // Catch:{ all -> 0x002e }
            goto L_0x0058
        L_0x002e:
            r7 = move-exception
            goto L_0x005e
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            XH.y.b(r9)
            p0.o r9 = r5.n()
            boolean r9 = r9.d(r6)
            if (r9 == 0) goto L_0x0062
            n0.N r9 = r5.f26949f     // Catch:{ all -> 0x005c }
            p0.c$e r2 = new p0.c$e     // Catch:{ all -> 0x005c }
            r2.<init>(r5, r6, r8, r4)     // Catch:{ all -> 0x005c }
            r0.f26975c = r5     // Catch:{ all -> 0x005c }
            r0.f26978f = r3     // Catch:{ all -> 0x005c }
            java.lang.Object r6 = r9.d(r7, r2, r0)     // Catch:{ all -> 0x005c }
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r5
        L_0x0058:
            r6.D(r4)
            goto L_0x0076
        L_0x005c:
            r7 = move-exception
            r6 = r5
        L_0x005e:
            r6.D(r4)
            throw r7
        L_0x0062:
            nI.l<T, java.lang.Boolean> r7 = r5.f26948e
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0076
            r5.G(r6)
            r5.C(r6)
        L_0x0076:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C5685c.h(java.lang.Object, n0.L, nI.r, dI.e):java.lang.Object");
    }

    public final Object i(C5589L l10, q<? super C5684b, ? super o<T>, ? super C17164e<? super C16807N>, ? extends Object> qVar, C17164e<? super C16807N> eVar) {
        Object d10 = this.f26949f.d(l10, new C0437c(this, qVar, (C17164e<? super C0437c>) null), eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    public final float m(float f10) {
        float y10 = y(f10);
        float t10 = Float.isNaN(t()) ? 0.0f : t();
        F(y10);
        return y10 - t10;
    }

    public final o<T> n() {
        return (o) this.f26957n.getValue();
    }

    public final C17642l<T, Boolean> o() {
        return this.f26948e;
    }

    public final T p() {
        return this.f26950g.getValue();
    }

    public final C5570z<Float> q() {
        return this.f26947d;
    }

    public final float s() {
        return this.f26955l.a();
    }

    public final float t() {
        return this.f26953j.a();
    }

    public final T u() {
        return this.f26951h.getValue();
    }

    public final C5546i<Float> v() {
        return this.f26946c;
    }

    public final T w() {
        return this.f26952i.getValue();
    }

    public final boolean x() {
        return r() != null;
    }

    public final float y(float f10) {
        return C17978n.l((Float.isNaN(t()) ? 0.0f : t()) + f10, n().e(), n().g());
    }

    public final float z(T t10, T t11) {
        float f10 = n().f(t10);
        float f11 = n().f(t11);
        float l10 = (C17978n.l(t(), Math.min(f10, f11), Math.max(f10, f11)) - f10) / (f11 - f10);
        if (Float.isNaN(l10)) {
            return 1.0f;
        }
        if (l10 < 1.0E-6f) {
            return 0.0f;
        }
        if (l10 > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(l10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5685c(Object obj, C17642l lVar, C17631a aVar, C5546i iVar, C5570z zVar, C17642l lVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, lVar, aVar, iVar, zVar, (i10 & 32) != 0 ? a.f26959c : lVar2);
    }
}
