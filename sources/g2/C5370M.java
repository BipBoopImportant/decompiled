package g2;

import A1.B;
import A1.C4336c;
import A1.C4350q;
import A1.K;
import A1.U;
import QJ.Q;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import U0.C4889m;
import U0.C4892n0;
import U0.C4895p;
import U0.P;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.N;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import p0.t;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001ar\u0010\u0016\u001a\u00020\u000e*\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\u0013H@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/d;", "", "key", "LU0/n0;", "motionProgress", "Lg2/T;", "measurer", "c", "(Landroidx/compose/ui/d;Ljava/lang/Object;LU0/n0;Lg2/T;)Landroidx/compose/ui/d;", "LA1/K;", "Lkotlin/Function1;", "Lo1/g;", "", "onAcceptFirstDown", "LXH/N;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "Lkotlin/Function2;", "LA1/B;", "onDrag", "b", "(LA1/K;LnI/l;LnI/l;LnI/a;LnI/a;LnI/p;LdI/e;)Ljava/lang/Object;", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.M  reason: case insensitive filesystem */
public final class C5370M {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2", f = "MotionDragHandler.kt", l = {166, 174, 183}, m = "invokeSuspend")
    /* renamed from: g2.M$a */
    static final class a extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        Object f23534d;

        /* renamed from: e  reason: collision with root package name */
        Object f23535e;

        /* renamed from: f  reason: collision with root package name */
        int f23536f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f23537g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, Boolean> f23538h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f23539i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<B, C5667g, C16807N> f23540j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f23541k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f23542l;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LA1/B;", "change", "Lo1/g;", "over", "LXH/N;", "a", "(LA1/B;J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: g2.M$a$a  reason: collision with other inner class name */
        static final class C0381a extends C17544u implements p<B, C5667g, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ N f23543c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0381a(N n10) {
                super(2);
                this.f23543c = n10;
            }

            public final void a(B b10, long j10) {
                b10.a();
                this.f23543c.f144347a = j10;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((B) obj, ((C5667g) obj2).v());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "it", "LXH/N;", "a", "(LA1/B;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: g2.M$a$b */
        static final class b extends C17544u implements C17642l<B, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<B, C5667g, C16807N> f23544c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(p<? super B, ? super C5667g, C16807N> pVar) {
                super(1);
                this.f23544c = pVar;
            }

            public final void a(B b10) {
                this.f23544c.invoke(b10, C5667g.d(C4350q.g(b10)));
                b10.a();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((B) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super C5667g, Boolean> lVar, C17642l<? super C5667g, C16807N> lVar2, p<? super B, ? super C5667g, C16807N> pVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f23538h = lVar;
            this.f23539i = lVar2;
            this.f23540j = pVar;
            this.f23541k = aVar;
            this.f23542l = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f23538h, this.f23539i, this.f23540j, this.f23541k, this.f23542l, eVar);
            aVar.f23537g = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: A1.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0091 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00df  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f23536f
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0036
                if (r1 == r4) goto L_0x002e
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                XH.y.b(r12)
                goto L_0x00d1
            L_0x0016:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001e:
                java.lang.Object r1 = r11.f23535e
                kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                java.lang.Object r4 = r11.f23534d
                A1.B r4 = (A1.B) r4
                java.lang.Object r5 = r11.f23537g
                A1.c r5 = (A1.C4336c) r5
                XH.y.b(r12)
                goto L_0x0092
            L_0x002e:
                java.lang.Object r1 = r11.f23537g
                A1.c r1 = (A1.C4336c) r1
                XH.y.b(r12)
                goto L_0x004f
            L_0x0036:
                XH.y.b(r12)
                java.lang.Object r12 = r11.f23537g
                r1 = r12
                A1.c r1 = (A1.C4336c) r1
                r11.f23537g = r1
                r11.f23536f = r4
                r6 = 1
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r1
                r8 = r11
                java.lang.Object r12 = p0.G.e(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L_0x004f
                return r0
            L_0x004f:
                A1.B r12 = (A1.B) r12
                nI.l<o1.g, java.lang.Boolean> r4 = r11.f23538h
                long r5 = r12.h()
                o1.g r5 = o1.C5667g.d(r5)
                java.lang.Object r4 = r4.invoke(r5)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x006a
                XH.N r12 = XH.C16807N.f139792a
                return r12
            L_0x006a:
                kotlin.jvm.internal.N r4 = new kotlin.jvm.internal.N
                r4.<init>()
                o1.g$a r5 = o1.C5667g.f26701b
                long r5 = r5.c()
                r4.f144347a = r5
                r5 = r1
                r1 = r4
                r4 = r12
            L_0x007a:
                long r6 = r4.f()
                g2.M$a$a r12 = new g2.M$a$a
                r12.<init>(r1)
                r11.f23537g = r5
                r11.f23534d = r4
                r11.f23535e = r1
                r11.f23536f = r3
                java.lang.Object r12 = p0.m.d(r5, r6, r12, r11)
                if (r12 != r0) goto L_0x0092
                return r0
            L_0x0092:
                A1.B r12 = (A1.B) r12
                if (r12 == 0) goto L_0x009c
                boolean r6 = r12.p()
                if (r6 == 0) goto L_0x007a
            L_0x009c:
                if (r12 == 0) goto L_0x00e4
                nI.l<o1.g, XH.N> r3 = r11.f23539i
                long r6 = r12.h()
                o1.g r4 = o1.C5667g.d(r6)
                r3.invoke(r4)
                nI.p<A1.B, o1.g, XH.N> r3 = r11.f23540j
                long r6 = r1.f144347a
                o1.g r1 = o1.C5667g.d(r6)
                r3.invoke(r12, r1)
                long r3 = r12.f()
                g2.M$a$b r12 = new g2.M$a$b
                nI.p<A1.B, o1.g, XH.N> r1 = r11.f23540j
                r12.<init>(r1)
                r1 = 0
                r11.f23537g = r1
                r11.f23534d = r1
                r11.f23535e = r1
                r11.f23536f = r2
                java.lang.Object r12 = p0.m.i(r5, r3, r12, r11)
                if (r12 != r0) goto L_0x00d1
                return r0
            L_0x00d1:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 != 0) goto L_0x00df
                nI.a<XH.N> r12 = r11.f23541k
                r12.invoke()
                goto L_0x00e4
            L_0x00df:
                nI.a<XH.N> r12 = r11.f23542l
                r12.invoke()
            L_0x00e4:
                XH.N r12 = XH.C16807N.f139792a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: g2.C5370M.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g2.M$b */
    public static final class b extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f23545c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4892n0 f23546d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5376T f23547e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Object obj, C4892n0 n0Var, C5376T t10) {
            super(1);
            this.f23545c = obj;
            this.f23546d = n0Var;
            this.f23547e = t10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("motionPointerInput");
            v0Var.a().c("key", this.f23545c);
            v0Var.a().c("motionProgress", this.f23546d);
            v0Var.a().c("measurer", this.f23547e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g2.M$c */
    static final class c extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5376T f23548c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f23549d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4892n0 f23550e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1", f = "MotionDragHandler.kt", l = {77, 80, 85}, m = "invokeSuspend")
        /* renamed from: g2.M$c$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f23551c;

            /* renamed from: d  reason: collision with root package name */
            int f23552d;

            /* renamed from: e  reason: collision with root package name */
            int f23553e;

            /* renamed from: f  reason: collision with root package name */
            private /* synthetic */ Object f23554f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a0 f23555g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C16434j<C5371N> f23556h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, C16434j<C5371N> jVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f23555g = a0Var;
                this.f23556h = jVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f23555g, this.f23556h, eVar);
                aVar.f23554f = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r11.f23553e
                    r2 = 0
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r1 == 0) goto L_0x003c
                    if (r1 == r5) goto L_0x002e
                    if (r1 == r4) goto L_0x0026
                    if (r1 != r3) goto L_0x001e
                    int r1 = r11.f23552d
                    java.lang.Object r7 = r11.f23554f
                    QJ.Q r7 = (QJ.Q) r7
                    XH.y.b(r12)
                    goto L_0x00ab
                L_0x001e:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x0026:
                    java.lang.Object r1 = r11.f23554f
                    QJ.Q r1 = (QJ.Q) r1
                    XH.y.b(r12)
                    goto L_0x0081
                L_0x002e:
                    int r1 = r11.f23552d
                    java.lang.Object r7 = r11.f23551c
                    g2.N r7 = (g2.C5371N) r7
                    java.lang.Object r8 = r11.f23554f
                    QJ.Q r8 = (QJ.Q) r8
                    XH.y.b(r12)
                    goto L_0x006d
                L_0x003c:
                    XH.y.b(r12)
                    java.lang.Object r12 = r11.f23554f
                    QJ.Q r12 = (QJ.Q) r12
                    r1 = r12
                    r12 = r2
                    r7 = r6
                L_0x0046:
                    dI.i r8 = r1.getCoroutineContext()
                    boolean r8 = QJ.I0.p(r8)
                    if (r8 == 0) goto L_0x00d4
                    if (r12 == 0) goto L_0x0070
                    g2.a0 r8 = r11.f23555g
                    boolean r8 = r8.f()
                    if (r8 == 0) goto L_0x0070
                    g2.a0 r8 = r11.f23555g
                    r11.f23554f = r1
                    r11.f23551c = r7
                    r11.f23552d = r12
                    r11.f23553e = r5
                    java.lang.Object r8 = r8.h(r11)
                    if (r8 != r0) goto L_0x006b
                    return r0
                L_0x006b:
                    r8 = r1
                    r1 = r12
                L_0x006d:
                    r12 = r1
                    r1 = r8
                    goto L_0x00b9
                L_0x0070:
                    if (r7 != 0) goto L_0x0084
                    SJ.j<g2.N> r12 = r11.f23556h
                    r11.f23554f = r1
                    r11.f23551c = r6
                    r11.f23553e = r4
                    java.lang.Object r12 = r12.j(r11)
                    if (r12 != r0) goto L_0x0081
                    return r0
                L_0x0081:
                    r7 = r12
                    g2.N r7 = (g2.C5371N) r7
                L_0x0084:
                    r12 = r7
                    r7 = r1
                    dI.i r1 = r7.getCoroutineContext()
                    QJ.I0.l(r1)
                    boolean r1 = r12.c()
                    r8 = r1 ^ 1
                    if (r1 != 0) goto L_0x00ad
                    g2.a0 r1 = r11.f23555g
                    long r9 = r12.b()
                    r11.f23554f = r7
                    r11.f23551c = r6
                    r11.f23552d = r8
                    r11.f23553e = r3
                    java.lang.Object r12 = r1.e(r9, r11)
                    if (r12 != r0) goto L_0x00aa
                    return r0
                L_0x00aa:
                    r1 = r8
                L_0x00ab:
                    r8 = r1
                    goto L_0x00b6
                L_0x00ad:
                    g2.a0 r1 = r11.f23555g
                    long r9 = r12.a()
                    r1.g(r9)
                L_0x00b6:
                    r1 = r7
                    r12 = r8
                    r7 = r6
                L_0x00b9:
                    SJ.j<g2.N> r8 = r11.f23556h
                    java.lang.Object r8 = r8.r()
                    boolean r9 = SJ.C16438n.j(r8)
                    if (r9 == 0) goto L_0x0046
                    java.lang.Object r7 = SJ.C16438n.g(r8)
                    g2.N r7 = (g2.C5371N) r7
                    boolean r8 = r7.c()
                    if (r8 == 0) goto L_0x0046
                    r12 = r2
                    goto L_0x0046
                L_0x00d4:
                    XH.N r12 = XH.C16807N.f139792a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: g2.C5370M.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1", f = "MotionDragHandler.kt", l = {110}, m = "invokeSuspend")
        /* renamed from: g2.M$c$b */
        static final class b extends l implements p<K, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f23557c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f23558d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a0 f23559e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C16434j<C5371N> f23560f;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "offset", "", "a", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: g2.M$c$b$a */
            static final class a extends C17544u implements C17642l<C5667g, Boolean> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a0 f23561c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(a0 a0Var) {
                    super(1);
                    this.f23561c = a0Var;
                }

                public final Boolean a(long j10) {
                    return Boolean.valueOf(this.f23561c.d(j10));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((C5667g) obj).v());
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "<anonymous parameter 0>", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: g2.M$c$b$b  reason: collision with other inner class name */
            static final class C0382b extends C17544u implements C17642l<C5667g, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ B1.d f23562c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0382b(B1.d dVar) {
                    super(1);
                    this.f23562c = dVar;
                }

                public final void a(long j10) {
                    this.f23562c.f();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C5667g) obj).v());
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: g2.M$c$b$c  reason: collision with other inner class name */
            static final class C0383c extends C17544u implements C17631a<C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C16434j<C5371N> f23563c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ B1.d f23564d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0383c(C16434j<C5371N> jVar, B1.d dVar) {
                    super(0);
                    this.f23563c = jVar;
                    this.f23564d = dVar;
                }

                public final void invoke() {
                    this.f23563c.k(C5371N.f23569d.b(this.f23564d.b()));
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: g2.M$c$b$d */
            static final class d extends C17544u implements C17631a<C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C16434j<C5371N> f23565c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ B1.d f23566d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                d(C16434j<C5371N> jVar, B1.d dVar) {
                    super(0);
                    this.f23565c = jVar;
                    this.f23566d = dVar;
                }

                public final void invoke() {
                    this.f23565c.k(C5371N.f23569d.b(this.f23566d.b()));
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LA1/B;", "change", "Lo1/g;", "dragAmount", "LXH/N;", "a", "(LA1/B;J)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: g2.M$c$b$e */
            static final class e extends C17544u implements p<B, C5667g, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ B1.d f23567c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C16434j<C5371N> f23568d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                e(B1.d dVar, C16434j<C5371N> jVar) {
                    super(2);
                    this.f23567c = dVar;
                    this.f23568d = jVar;
                }

                public final void a(B b10, long j10) {
                    B1.e.c(this.f23567c, b10);
                    this.f23568d.k(C5371N.f23569d.a(j10));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((B) obj, ((C5667g) obj2).v());
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a0 a0Var, C16434j<C5371N> jVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f23559e = a0Var;
                this.f23560f = jVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f23559e, this.f23560f, eVar);
                bVar.f23558d = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
                return ((b) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f23557c;
                if (i10 == 0) {
                    y.b(obj);
                    B1.d dVar = new B1.d();
                    a aVar = new a(this.f23559e);
                    C0382b bVar = new C0382b(dVar);
                    C0383c cVar = new C0383c(this.f23560f, dVar);
                    d dVar2 = new d(this.f23560f, dVar);
                    e eVar = new e(dVar, this.f23560f);
                    this.f23557c = 1;
                    if (C5370M.b((K) this.f23558d, aVar, bVar, cVar, dVar2, eVar, this) == f10) {
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
        c(C5376T t10, Object obj, C4892n0 n0Var) {
            super(3);
            this.f23548c = t10;
            this.f23549d = obj;
            this.f23550e = n0Var;
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            mVar.W(146198586);
            if (C4895p.J()) {
                C4895p.S(146198586, i10, -1, "androidx.constraintlayout.compose.motionPointerInput.<anonymous> (MotionDragHandler.kt:61)");
            }
            if (!this.f23548c.H().E()) {
                if (C4895p.J()) {
                    C4895p.R();
                }
                mVar.P();
                return dVar;
            }
            boolean V10 = mVar.V(this.f23549d);
            C5376T t10 = this.f23548c;
            C4892n0 n0Var = this.f23550e;
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new a0(t10, n0Var);
                mVar.u(D10);
            }
            a0 a0Var = (a0) D10;
            boolean V11 = mVar.V(this.f23549d);
            Object D11 = mVar.D();
            if (V11 || D11 == C4889m.f14007a.a()) {
                D11 = C16437m.b(-1, (C16428d) null, (C17642l) null, 6, (Object) null);
                mVar.u(D11);
            }
            C16434j jVar = (C16434j) D11;
            Object obj = this.f23549d;
            boolean F10 = mVar.F(a0Var) | mVar.F(jVar);
            Object D12 = mVar.D();
            if (F10 || D12 == C4889m.f14007a.a()) {
                D12 = new a(a0Var, jVar, (C17164e<? super a>) null);
                mVar.u(D12);
            }
            P.g(obj, (p) D12, mVar, 0);
            Object obj2 = this.f23549d;
            boolean F11 = mVar.F(a0Var) | mVar.F(jVar);
            Object D13 = mVar.D();
            if (F11 || D13 == C4889m.f14007a.a()) {
                D13 = new b(a0Var, jVar, (C17164e<? super b>) null);
                mVar.u(D13);
            }
            d d10 = U.d(dVar, obj2, (p) D13);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return d10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    /* access modifiers changed from: private */
    public static final Object b(K k10, C17642l<? super C5667g, Boolean> lVar, C17642l<? super C5667g, C16807N> lVar2, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, p<? super B, ? super C5667g, C16807N> pVar, C17164e<? super C16807N> eVar) {
        Object c10 = t.c(k10, new a(lVar, lVar2, pVar, aVar2, aVar, (C17164e<? super a>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public static final d c(d dVar, Object obj, C4892n0 n0Var, C5376T t10) {
        return androidx.compose.ui.c.b(dVar, C5133t0.b() ? new b(obj, n0Var, t10) : C5133t0.a(), new c(t10, obj, n0Var));
    }
}
