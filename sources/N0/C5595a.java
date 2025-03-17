package n0;

import A1.A;
import A1.C4336c;
import A1.K;
import A1.U;
import U0.C4899r0;
import U0.p1;
import XH.C16807N;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import c2.s;
import c2.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;
import p0.t;
import p1.C5751x0;
import pI.C17752b;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J6\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!H@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u000eH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0000¢\u0006\u0004\b-\u0010\rR\u001e\u0010/\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00108\u001a\b\u0012\u0004\u0012\u00020\u000b048\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b6\u00107R(\u0010?\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b>\u0010\r\u001a\u0004\b;\u0010\n\"\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010:R\u001c\u0010D\u001a\u00020'8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010L\u001a\u00020I8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\b9\u0010KR\u0014\u0010M\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\n\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Ln0/a;", "Ln0/T;", "Landroid/content/Context;", "context", "Ln0/Q;", "overscrollConfig", "<init>", "(Landroid/content/Context;Ln0/Q;)V", "", "q", "()Z", "LXH/N;", "h", "()V", "Lo1/g;", "delta", "p", "(J)Z", "scroll", "", "o", "(J)F", "l", "m", "n", "Lz1/e;", "source", "Lkotlin/Function1;", "performScroll", "c", "(JILnI/l;)J", "Lc2/y;", "velocity", "Lkotlin/Function2;", "LdI/e;", "", "performFling", "a", "(JLnI/p;LdI/e;)Ljava/lang/Object;", "Lo1/m;", "size", "r", "(J)V", "i", "()J", "k", "Lo1/g;", "pointerPosition", "Ln0/w;", "b", "Ln0/w;", "edgeEffectWrapper", "LU0/r0;", "LU0/r0;", "j", "()LU0/r0;", "redrawSignal", "d", "Z", "getInvalidationEnabled$foundation_release", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "invalidationEnabled", "e", "scrollCycleInProgress", "f", "J", "containerSize", "LA1/A;", "g", "LA1/A;", "pointerId", "Landroidx/compose/ui/d;", "Landroidx/compose/ui/d;", "()Landroidx/compose/ui/d;", "effectModifier", "isInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.a  reason: case insensitive filesystem */
public final class C5595a implements T {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public C5667g f26395a;

    /* renamed from: b  reason: collision with root package name */
    private final C5617w f26396b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0<C16807N> f26397c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26398d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26399e;

    /* renamed from: f  reason: collision with root package name */
    private long f26400f = C5673m.f26722b.b();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public A f26401g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.compose.ui.d f26402h;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {533, 559}, m = "applyToFling-BMRW4eQ")
    /* renamed from: n0.a$a  reason: collision with other inner class name */
    static final class C0421a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f26403c;

        /* renamed from: d  reason: collision with root package name */
        long f26404d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f26405e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5595a f26406f;

        /* renamed from: g  reason: collision with root package name */
        int f26407g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0421a(C5595a aVar, C17164e<? super C0421a> eVar) {
            super(eVar);
            this.f26406f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f26405e = obj;
            this.f26407g |= Integer.MIN_VALUE;
            return this.f26406f.a(0, (p<? super y, ? super C17164e<? super y>, ? extends Object>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.android.kt", l = {638}, m = "invokeSuspend")
    /* renamed from: n0.a$b */
    static final class b extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f26408c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f26409d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5595a f26410e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.android.kt", l = {639, 643}, m = "invokeSuspend")
        /* renamed from: n0.a$b$a  reason: collision with other inner class name */
        static final class C0422a extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

            /* renamed from: d  reason: collision with root package name */
            int f26411d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f26412e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C5595a f26413f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0422a(C5595a aVar, C17164e<? super C0422a> eVar) {
                super(2, eVar);
                this.f26413f = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C0422a aVar = new C0422a(this.f26413f, eVar);
                aVar.f26412e = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
                return ((C0422a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: A1.B} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: A1.c} */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0066 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00b2 A[SYNTHETIC] */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r12.f26411d
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L_0x0027
                    if (r1 == r4) goto L_0x001f
                    if (r1 != r2) goto L_0x0017
                    java.lang.Object r1 = r12.f26412e
                    A1.c r1 = (A1.C4336c) r1
                    XH.y.b(r13)
                    goto L_0x0067
                L_0x0017:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L_0x001f:
                    java.lang.Object r1 = r12.f26412e
                    A1.c r1 = (A1.C4336c) r1
                    XH.y.b(r13)
                    goto L_0x0040
                L_0x0027:
                    XH.y.b(r13)
                    java.lang.Object r13 = r12.f26412e
                    r1 = r13
                    A1.c r1 = (A1.C4336c) r1
                    r12.f26412e = r1
                    r12.f26411d = r4
                    r6 = 0
                    r7 = 0
                    r9 = 2
                    r10 = 0
                    r5 = r1
                    r8 = r12
                    java.lang.Object r13 = p0.G.e(r5, r6, r7, r8, r9, r10)
                    if (r13 != r0) goto L_0x0040
                    return r0
                L_0x0040:
                    A1.B r13 = (A1.B) r13
                    n0.a r5 = r12.f26413f
                    long r6 = r13.f()
                    A1.A r6 = A1.A.a(r6)
                    r5.f26401g = r6
                    n0.a r5 = r12.f26413f
                    long r6 = r13.h()
                    o1.g r13 = o1.C5667g.d(r6)
                    r5.f26395a = r13
                L_0x005c:
                    r12.f26412e = r1
                    r12.f26411d = r2
                    java.lang.Object r13 = A1.C4336c.J1(r1, r3, r12, r4, r3)
                    if (r13 != r0) goto L_0x0067
                    return r0
                L_0x0067:
                    A1.p r13 = (A1.C4349p) r13
                    java.util.List r13 = r13.c()
                    java.util.ArrayList r5 = new java.util.ArrayList
                    int r6 = r13.size()
                    r5.<init>(r6)
                    int r6 = r13.size()
                    r7 = 0
                    r8 = r7
                L_0x007c:
                    if (r8 >= r6) goto L_0x0091
                    java.lang.Object r9 = r13.get(r8)
                    r10 = r9
                    A1.B r10 = (A1.B) r10
                    boolean r10 = r10.i()
                    if (r10 == 0) goto L_0x008e
                    r5.add(r9)
                L_0x008e:
                    int r8 = r8 + 1
                    goto L_0x007c
                L_0x0091:
                    n0.a r13 = r12.f26413f
                    int r6 = r5.size()
                L_0x0097:
                    if (r7 >= r6) goto L_0x00b2
                    java.lang.Object r8 = r5.get(r7)
                    r9 = r8
                    A1.B r9 = (A1.B) r9
                    long r9 = r9.f()
                    A1.A r11 = r13.f26401g
                    boolean r9 = A1.A.c(r9, r11)
                    if (r9 == 0) goto L_0x00af
                    goto L_0x00b3
                L_0x00af:
                    int r7 = r7 + 1
                    goto L_0x0097
                L_0x00b2:
                    r8 = r3
                L_0x00b3:
                    A1.B r8 = (A1.B) r8
                    if (r8 != 0) goto L_0x00be
                    java.lang.Object r13 = YH.C16877v.y0(r5)
                    r8 = r13
                    A1.B r8 = (A1.B) r8
                L_0x00be:
                    if (r8 == 0) goto L_0x00da
                    n0.a r13 = r12.f26413f
                    long r6 = r8.f()
                    A1.A r6 = A1.A.a(r6)
                    r13.f26401g = r6
                    n0.a r13 = r12.f26413f
                    long r6 = r8.h()
                    o1.g r6 = o1.C5667g.d(r6)
                    r13.f26395a = r6
                L_0x00da:
                    boolean r13 = r5.isEmpty()
                    if (r13 == 0) goto L_0x005c
                    n0.a r13 = r12.f26413f
                    r13.f26401g = r3
                    XH.N r13 = XH.C16807N.f139792a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: n0.C5595a.b.C0422a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5595a aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f26410e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f26410e, eVar);
            bVar.f26409d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((b) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f26408c;
            if (i10 == 0) {
                XH.y.b(obj);
                C0422a aVar = new C0422a(this.f26410e, (C17164e<? super C0422a>) null);
                this.f26408c = 1;
                if (t.c((K) this.f26409d, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: n0.a$c */
    public static final class c extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5595a f26414c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5595a aVar) {
            super(1);
            this.f26414c = aVar;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("overscroll");
            v0Var.c(this.f26414c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: n0.a$d */
    public static final class d extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5595a f26415c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5595a aVar) {
            super(1);
            this.f26415c = aVar;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("overscroll");
            v0Var.c(this.f26415c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    public C5595a(Context context, C5594Q q10) {
        androidx.compose.ui.d dVar;
        C5617w wVar = new C5617w(context, C5751x0.k(q10.b()));
        this.f26396b = wVar;
        C16807N n10 = C16807N.f139792a;
        this.f26397c = p1.i(n10, p1.k());
        androidx.compose.ui.d d10 = U.d(androidx.compose.ui.d.f18749a, n10, new b(this, (C17164e<? super b>) null));
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = new C5615u(this, wVar, C5133t0.b() ? new c(this) : C5133t0.a());
        } else {
            dVar = new C5609o(this, wVar, q10, C5133t0.b() ? new d(this) : C5133t0.a());
        }
        this.f26402h = d10.s(dVar);
    }

    private final void h() {
        boolean z10;
        C5617w wVar = this.f26396b;
        EdgeEffect d10 = wVar.f26476d;
        boolean z11 = false;
        if (d10 != null) {
            d10.onRelease();
            z10 = d10.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect a10 = wVar.f26477e;
        if (a10 != null) {
            a10.onRelease();
            z10 = a10.isFinished() || z10;
        }
        EdgeEffect b10 = wVar.f26478f;
        if (b10 != null) {
            b10.onRelease();
            z10 = b10.isFinished() || z10;
        }
        EdgeEffect c10 = wVar.f26479g;
        if (c10 != null) {
            c10.onRelease();
            if (c10.isFinished() || z10) {
                z11 = true;
            }
            z10 = z11;
        }
        if (z10) {
            k();
        }
    }

    private final float l(long j10) {
        float m10 = C5667g.m(i());
        float n10 = C5667g.n(j10) / C5673m.i(this.f26400f);
        EdgeEffect f10 = this.f26396b.f();
        C5616v vVar = C5616v.f26472a;
        return vVar.b(f10) == 0.0f ? (-vVar.d(f10, -n10, ((float) 1) - m10)) * C5673m.i(this.f26400f) : C5667g.n(j10);
    }

    private final float m(long j10) {
        float n10 = C5667g.n(i());
        float m10 = C5667g.m(j10) / C5673m.l(this.f26400f);
        EdgeEffect h10 = this.f26396b.h();
        C5616v vVar = C5616v.f26472a;
        return vVar.b(h10) == 0.0f ? vVar.d(h10, m10, ((float) 1) - n10) * C5673m.l(this.f26400f) : C5667g.m(j10);
    }

    private final float n(long j10) {
        float n10 = C5667g.n(i());
        float m10 = C5667g.m(j10) / C5673m.l(this.f26400f);
        EdgeEffect j11 = this.f26396b.j();
        C5616v vVar = C5616v.f26472a;
        return vVar.b(j11) == 0.0f ? (-vVar.d(j11, -m10, n10)) * C5673m.l(this.f26400f) : C5667g.m(j10);
    }

    private final float o(long j10) {
        float m10 = C5667g.m(i());
        float n10 = C5667g.n(j10) / C5673m.i(this.f26400f);
        EdgeEffect l10 = this.f26396b.l();
        C5616v vVar = C5616v.f26472a;
        return vVar.b(l10) == 0.0f ? vVar.d(l10, n10, m10) * C5673m.i(this.f26400f) : C5667g.n(j10);
    }

    private final boolean p(long j10) {
        boolean z10;
        boolean z11 = true;
        if (!this.f26396b.r() || C5667g.m(j10) >= 0.0f) {
            z10 = false;
        } else {
            C5616v.f26472a.e(this.f26396b.h(), C5667g.m(j10));
            z10 = !this.f26396b.r();
        }
        if (this.f26396b.u() && C5667g.m(j10) > 0.0f) {
            C5616v.f26472a.e(this.f26396b.j(), C5667g.m(j10));
            z10 = z10 || !this.f26396b.u();
        }
        if (this.f26396b.y() && C5667g.n(j10) < 0.0f) {
            C5616v.f26472a.e(this.f26396b.l(), C5667g.n(j10));
            z10 = z10 || !this.f26396b.y();
        }
        if (!this.f26396b.o() || C5667g.n(j10) <= 0.0f) {
            return z10;
        }
        C5616v.f26472a.e(this.f26396b.f(), C5667g.n(j10));
        if (!z10 && this.f26396b.o()) {
            z11 = false;
        }
        return z11;
    }

    private final boolean q() {
        boolean z10;
        if (this.f26396b.t()) {
            m(C5667g.f26701b.c());
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26396b.w()) {
            n(C5667g.f26701b.c());
            z10 = true;
        }
        if (this.f26396b.A()) {
            o(C5667g.f26701b.c());
            z10 = true;
        }
        if (!this.f26396b.q()) {
            return z10;
        }
        l(C5667g.f26701b.c());
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(long r11, nI.p<? super c2.y, ? super dI.C17164e<? super c2.y>, ? extends java.lang.Object> r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof n0.C5595a.C0421a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            n0.a$a r0 = (n0.C5595a.C0421a) r0
            int r1 = r0.f26407g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26407g = r1
            goto L_0x0018
        L_0x0013:
            n0.a$a r0 = new n0.a$a
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f26405e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f26407g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            long r11 = r0.f26404d
            java.lang.Object r13 = r0.f26403c
            n0.a r13 = (n0.C5595a) r13
            XH.y.b(r14)
            goto L_0x0128
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            XH.y.b(r14)
            goto L_0x0058
        L_0x0040:
            XH.y.b(r14)
            long r6 = r10.f26400f
            boolean r14 = o1.C5673m.n(r6)
            if (r14 == 0) goto L_0x005b
            c2.y r11 = c2.y.b(r11)
            r0.f26407g = r4
            java.lang.Object r11 = r13.invoke(r11, r0)
            if (r11 != r1) goto L_0x0058
            return r1
        L_0x0058:
            XH.N r11 = XH.C16807N.f139792a
            return r11
        L_0x005b:
            float r14 = c2.y.h(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0083
            n0.w r14 = r10.f26396b
            boolean r14 = r14.t()
            if (r14 == 0) goto L_0x0083
            n0.v r14 = n0.C5616v.f26472a
            n0.w r2 = r10.f26396b
            android.widget.EdgeEffect r2 = r2.h()
            float r4 = c2.y.h(r11)
            int r4 = pI.C17752b.e(r4)
            r14.c(r2, r4)
            float r14 = c2.y.h(r11)
            goto L_0x00ad
        L_0x0083:
            float r14 = c2.y.h(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 >= 0) goto L_0x00ac
            n0.w r14 = r10.f26396b
            boolean r14 = r14.w()
            if (r14 == 0) goto L_0x00ac
            n0.v r14 = n0.C5616v.f26472a
            n0.w r2 = r10.f26396b
            android.widget.EdgeEffect r2 = r2.j()
            float r4 = c2.y.h(r11)
            int r4 = pI.C17752b.e(r4)
            int r4 = -r4
            r14.c(r2, r4)
            float r14 = c2.y.h(r11)
            goto L_0x00ad
        L_0x00ac:
            r14 = r5
        L_0x00ad:
            float r2 = c2.y.i(r11)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d5
            n0.w r2 = r10.f26396b
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x00d5
            n0.v r2 = n0.C5616v.f26472a
            n0.w r4 = r10.f26396b
            android.widget.EdgeEffect r4 = r4.l()
            float r6 = c2.y.i(r11)
            int r6 = pI.C17752b.e(r6)
            r2.c(r4, r6)
            float r2 = c2.y.i(r11)
            goto L_0x00ff
        L_0x00d5:
            float r2 = c2.y.i(r11)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00fe
            n0.w r2 = r10.f26396b
            boolean r2 = r2.q()
            if (r2 == 0) goto L_0x00fe
            n0.v r2 = n0.C5616v.f26472a
            n0.w r4 = r10.f26396b
            android.widget.EdgeEffect r4 = r4.f()
            float r6 = c2.y.i(r11)
            int r6 = pI.C17752b.e(r6)
            int r6 = -r6
            r2.c(r4, r6)
            float r2 = c2.y.i(r11)
            goto L_0x00ff
        L_0x00fe:
            r2 = r5
        L_0x00ff:
            long r6 = c2.z.a(r14, r2)
            c2.y$a r14 = c2.y.f23066b
            long r8 = r14.a()
            boolean r14 = c2.y.g(r6, r8)
            if (r14 != 0) goto L_0x0112
            r10.k()
        L_0x0112:
            long r11 = c2.y.k(r11, r6)
            c2.y r14 = c2.y.b(r11)
            r0.f26403c = r10
            r0.f26404d = r11
            r0.f26407g = r3
            java.lang.Object r14 = r13.invoke(r14, r0)
            if (r14 != r1) goto L_0x0127
            return r1
        L_0x0127:
            r13 = r10
        L_0x0128:
            c2.y r14 = (c2.y) r14
            long r0 = r14.o()
            long r11 = c2.y.k(r11, r0)
            r14 = 0
            r13.f26399e = r14
            float r14 = c2.y.h(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0151
            n0.v r14 = n0.C5616v.f26472a
            n0.w r0 = r13.f26396b
            android.widget.EdgeEffect r0 = r0.h()
            float r1 = c2.y.h(r11)
            int r1 = pI.C17752b.e(r1)
            r14.c(r0, r1)
            goto L_0x016d
        L_0x0151:
            float r14 = c2.y.h(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 >= 0) goto L_0x016d
            n0.v r14 = n0.C5616v.f26472a
            n0.w r0 = r13.f26396b
            android.widget.EdgeEffect r0 = r0.j()
            float r1 = c2.y.h(r11)
            int r1 = pI.C17752b.e(r1)
            int r1 = -r1
            r14.c(r0, r1)
        L_0x016d:
            float r14 = c2.y.i(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0189
            n0.v r14 = n0.C5616v.f26472a
            n0.w r0 = r13.f26396b
            android.widget.EdgeEffect r0 = r0.l()
            float r1 = c2.y.i(r11)
            int r1 = pI.C17752b.e(r1)
            r14.c(r0, r1)
            goto L_0x01a5
        L_0x0189:
            float r14 = c2.y.i(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 >= 0) goto L_0x01a5
            n0.v r14 = n0.C5616v.f26472a
            n0.w r0 = r13.f26396b
            android.widget.EdgeEffect r0 = r0.f()
            float r1 = c2.y.i(r11)
            int r1 = pI.C17752b.e(r1)
            int r1 = -r1
            r14.c(r0, r1)
        L_0x01a5:
            c2.y$a r14 = c2.y.f23066b
            long r0 = r14.a()
            boolean r11 = c2.y.g(r11, r0)
            if (r11 != 0) goto L_0x01b4
            r13.k()
        L_0x01b4:
            r13.h()
            XH.N r11 = XH.C16807N.f139792a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C5595a.a(long, nI.p, dI.e):java.lang.Object");
    }

    public boolean b() {
        C5617w wVar = this.f26396b;
        EdgeEffect d10 = wVar.f26476d;
        if (d10 != null && C5616v.f26472a.b(d10) != 0.0f) {
            return true;
        }
        EdgeEffect a10 = wVar.f26477e;
        if (a10 != null && C5616v.f26472a.b(a10) != 0.0f) {
            return true;
        }
        EdgeEffect b10 = wVar.f26478f;
        if (b10 != null && C5616v.f26472a.b(b10) != 0.0f) {
            return true;
        }
        EdgeEffect c10 = wVar.f26479g;
        return (c10 == null || C5616v.f26472a.b(c10) == 0.0f) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long c(long r11, int r13, nI.C17642l<? super o1.C5667g, o1.C5667g> r14) {
        /*
            r10 = this;
            long r0 = r10.f26400f
            boolean r0 = o1.C5673m.n(r0)
            if (r0 == 0) goto L_0x0017
            o1.g r11 = o1.C5667g.d(r11)
            java.lang.Object r11 = r14.invoke(r11)
            o1.g r11 = (o1.C5667g) r11
            long r11 = r11.v()
            return r11
        L_0x0017:
            boolean r0 = r10.f26399e
            r1 = 1
            if (r0 != 0) goto L_0x0021
            r10.q()
            r10.f26399e = r1
        L_0x0021:
            float r0 = o1.C5667g.n(r11)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            r0 = r2
            goto L_0x0067
        L_0x002c:
            n0.w r0 = r10.f26396b
            boolean r0 = r0.A()
            if (r0 == 0) goto L_0x004a
            float r0 = r10.o(r11)
            n0.w r3 = r10.f26396b
            boolean r3 = r3.A()
            if (r3 != 0) goto L_0x0067
            n0.w r3 = r10.f26396b
            android.widget.EdgeEffect r3 = r3.l()
            r3.onRelease()
            goto L_0x0067
        L_0x004a:
            n0.w r0 = r10.f26396b
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x002a
            float r0 = r10.l(r11)
            n0.w r3 = r10.f26396b
            boolean r3 = r3.q()
            if (r3 != 0) goto L_0x0067
            n0.w r3 = r10.f26396b
            android.widget.EdgeEffect r3 = r3.f()
            r3.onRelease()
        L_0x0067:
            float r3 = o1.C5667g.m(r11)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0070
            goto L_0x00ab
        L_0x0070:
            n0.w r3 = r10.f26396b
            boolean r3 = r3.t()
            if (r3 == 0) goto L_0x008e
            float r2 = r10.m(r11)
            n0.w r3 = r10.f26396b
            boolean r3 = r3.t()
            if (r3 != 0) goto L_0x00ab
            n0.w r3 = r10.f26396b
            android.widget.EdgeEffect r3 = r3.h()
            r3.onRelease()
            goto L_0x00ab
        L_0x008e:
            n0.w r3 = r10.f26396b
            boolean r3 = r3.w()
            if (r3 == 0) goto L_0x00ab
            float r2 = r10.n(r11)
            n0.w r3 = r10.f26396b
            boolean r3 = r3.w()
            if (r3 != 0) goto L_0x00ab
            n0.w r3 = r10.f26396b
            android.widget.EdgeEffect r3 = r3.j()
            r3.onRelease()
        L_0x00ab:
            long r2 = o1.C5668h.a(r2, r0)
            o1.g$a r0 = o1.C5667g.f26701b
            long r4 = r0.c()
            boolean r0 = o1.C5667g.j(r2, r4)
            if (r0 != 0) goto L_0x00be
            r10.k()
        L_0x00be:
            long r4 = o1.C5667g.q(r11, r2)
            o1.g r0 = o1.C5667g.d(r4)
            java.lang.Object r14 = r14.invoke(r0)
            o1.g r14 = (o1.C5667g) r14
            long r6 = r14.v()
            long r4 = o1.C5667g.q(r4, r6)
            z1.e$a r14 = z1.e.f32374a
            int r14 = r14.b()
            boolean r13 = z1.e.d(r13, r14)
            r14 = 0
            if (r13 == 0) goto L_0x0120
            float r13 = o1.C5667g.m(r4)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r8 = -1090519040(0xffffffffbf000000, float:-0.5)
            if (r13 <= 0) goto L_0x00f2
            r10.m(r4)
        L_0x00f0:
            r13 = r1
            goto L_0x00ff
        L_0x00f2:
            float r13 = o1.C5667g.m(r4)
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x00fe
            r10.n(r4)
            goto L_0x00f0
        L_0x00fe:
            r13 = r14
        L_0x00ff:
            float r9 = o1.C5667g.n(r4)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x010c
            r10.o(r4)
        L_0x010a:
            r0 = r1
            goto L_0x0119
        L_0x010c:
            float r0 = o1.C5667g.n(r4)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0118
            r10.l(r4)
            goto L_0x010a
        L_0x0118:
            r0 = r14
        L_0x0119:
            if (r13 != 0) goto L_0x011f
            if (r0 == 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r1 = r14
        L_0x011f:
            r14 = r1
        L_0x0120:
            boolean r11 = r10.p(r11)
            if (r11 != 0) goto L_0x0128
            if (r14 == 0) goto L_0x012b
        L_0x0128:
            r10.k()
        L_0x012b:
            long r11 = o1.C5667g.r(r2, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C5595a.c(long, int, nI.l):long");
    }

    public androidx.compose.ui.d d() {
        return this.f26402h;
    }

    public final long i() {
        C5667g gVar = this.f26395a;
        long v10 = gVar != null ? gVar.v() : C5674n.b(this.f26400f);
        return C5668h.a(C5667g.m(v10) / C5673m.l(this.f26400f), C5667g.n(v10) / C5673m.i(this.f26400f));
    }

    public final C4899r0<C16807N> j() {
        return this.f26397c;
    }

    public final void k() {
        if (this.f26398d) {
            this.f26397c.setValue(C16807N.f139792a);
        }
    }

    public final void r(long j10) {
        boolean h10 = C5673m.h(this.f26400f, C5673m.f26722b.b());
        boolean h11 = C5673m.h(j10, this.f26400f);
        this.f26400f = j10;
        if (!h11) {
            this.f26396b.B(s.a(C17752b.e(C5673m.l(j10)), C17752b.e(C5673m.i(j10))));
        }
        if (!h10 && !h11) {
            k();
            h();
        }
    }
}
