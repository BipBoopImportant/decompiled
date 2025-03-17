package rK;

import A1.K;
import A1.U;
import A1.W;
import G1.C4510m;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001By\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"LrK/y;", "LG1/m;", "Lkotlin/Function1;", "Lo1/g;", "LXH/N;", "onPress", "onTap", "onLongPress", "onDoubleTap", "Lkotlin/Function0;", "onQuickZoomStopped", "LrK/D;", "transformableState", "", "gesturesEnabled", "<init>", "(LnI/l;LnI/l;LnI/l;LnI/l;LnI/a;LrK/D;Z)V", "Q2", "p", "LnI/l;", "q", "r", "s", "t", "LnI/a;", "u", "LrK/D;", "v", "Z", "LSJ/j;", "LrK/t;", "w", "LSJ/j;", "quickZoomEvents", "LA1/W;", "x", "LA1/W;", "pointerInputNode", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class y extends C4510m {
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public C17642l<? super C5667g, C16807N> f146838p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public C17642l<? super C5667g, C16807N> f146839q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public C17642l<? super C5667g, C16807N> f146840r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public C17642l<? super C5667g, C16807N> f146841s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public C17631a<C16807N> f146842t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public C17863D f146843u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f146844v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C16434j<t> f146845w = C16437m.b(Integer.MAX_VALUE, (C16428d) null, (C17642l) null, 6, (Object) null);

    /* renamed from: x  reason: collision with root package name */
    private final W f146846x = ((W) C2(U.a(new a(this, (C17164e<? super a>) null))));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableNode$pointerInputNode$1", f = "tappableAndQuickZoomable.kt", l = {91}, m = "invokeSuspend")
    static final class a extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f146847c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f146848d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ y f146849e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
        @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableNode$pointerInputNode$1$1", f = "tappableAndQuickZoomable.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: rK.y$a$a  reason: collision with other inner class name */
        static final class C4273a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f146850c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f146851d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ K f146852e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y f146853f;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
            @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableNode$pointerInputNode$1$1$1", f = "tappableAndQuickZoomable.kt", l = {94, 96}, m = "invokeSuspend")
            /* renamed from: rK.y$a$a$a  reason: collision with other inner class name */
            static final class C4274a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                Object f146854c;

                /* renamed from: d  reason: collision with root package name */
                Object f146855d;

                /* renamed from: e  reason: collision with root package name */
                int f146856e;

                /* renamed from: f  reason: collision with root package name */
                private /* synthetic */ Object f146857f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ y f146858g;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LrK/A;", "LXH/N;", "<anonymous>", "(LrK/A;)V"}, k = 3, mv = {1, 9, 0})
                @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableNode$pointerInputNode$1$1$1$1", f = "tappableAndQuickZoomable.kt", l = {104}, m = "invokeSuspend")
                /* renamed from: rK.y$a$a$a$a  reason: collision with other inner class name */
                static final class C4275a extends l implements p<C17860A, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    Object f146859c;

                    /* renamed from: d  reason: collision with root package name */
                    int f146860d;

                    /* renamed from: e  reason: collision with root package name */
                    private /* synthetic */ Object f146861e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ O<t> f146862f;

                    /* renamed from: g  reason: collision with root package name */
                    final /* synthetic */ y f146863g;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C4275a(O<t> o10, y yVar, C17164e<? super C4275a> eVar) {
                        super(2, eVar);
                        this.f146862f = o10;
                        this.f146863g = yVar;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        C4275a aVar = new C4275a(this.f146862f, this.f146863g, eVar);
                        aVar.f146861e = obj;
                        return aVar;
                    }

                    /* renamed from: i */
                    public final Object invoke(C17860A a10, C17164e<? super C16807N> eVar) {
                        return ((C4275a) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
                    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object invokeSuspend(T r14) {
                        /*
                            r13 = this;
                            java.lang.Object r0 = eI.C17187b.f()
                            int r1 = r13.f146860d
                            r2 = 1
                            if (r1 == 0) goto L_0x001f
                            if (r1 != r2) goto L_0x0017
                            java.lang.Object r1 = r13.f146859c
                            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                            java.lang.Object r3 = r13.f146861e
                            rK.A r3 = (rK.C17860A) r3
                            XH.y.b(r14)
                            goto L_0x0061
                        L_0x0017:
                            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r14.<init>(r0)
                            throw r14
                        L_0x001f:
                            XH.y.b(r14)
                            java.lang.Object r14 = r13.f146861e
                            rK.A r14 = (rK.C17860A) r14
                        L_0x0026:
                            kotlin.jvm.internal.O<rK.t> r1 = r13.f146862f
                            T r1 = r1.f144348a
                            boolean r3 = r1 instanceof rK.t.b
                            if (r3 == 0) goto L_0x0065
                            boolean r3 = r1 instanceof rK.t.b
                            if (r3 == 0) goto L_0x0035
                            rK.t$b r1 = (rK.t.b) r1
                            goto L_0x0036
                        L_0x0035:
                            r1 = 0
                        L_0x0036:
                            if (r1 == 0) goto L_0x0049
                            long r8 = r1.a()
                            float r4 = r1.b()
                            r10 = 6
                            r11 = 0
                            r5 = 0
                            r7 = 0
                            r3 = r14
                            rK.C17860A.a(r3, r4, r5, r7, r8, r10, r11)
                        L_0x0049:
                            kotlin.jvm.internal.O<rK.t> r1 = r13.f146862f
                            rK.y r3 = r13.f146863g
                            SJ.j r3 = r3.f146845w
                            r13.f146861e = r14
                            r13.f146859c = r1
                            r13.f146860d = r2
                            java.lang.Object r3 = r3.j(r13)
                            if (r3 != r0) goto L_0x005e
                            return r0
                        L_0x005e:
                            r12 = r3
                            r3 = r14
                            r14 = r12
                        L_0x0061:
                            r1.f144348a = r14
                            r14 = r3
                            goto L_0x0026
                        L_0x0065:
                            XH.N r14 = XH.C16807N.f139792a
                            return r14
                        */
                        throw new UnsupportedOperationException("Method not decompiled: rK.y.a.C4273a.C4274a.C4275a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C4274a(y yVar, C17164e<? super C4274a> eVar) {
                    super(2, eVar);
                    this.f146858g = yVar;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    C4274a aVar = new C4274a(this.f146858g, eVar);
                    aVar.f146857f = obj;
                    return aVar;
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C4274a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x0088 A[Catch:{ CancellationException -> 0x003d }] */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x008b A[Catch:{ CancellationException -> 0x003d }] */
                /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[Catch:{ CancellationException -> 0x003d }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invokeSuspend(T r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = eI.C17187b.f()
                        int r1 = r9.f146856e
                        r2 = 2
                        r3 = 1
                        r4 = 0
                        if (r1 == 0) goto L_0x0036
                        if (r1 == r3) goto L_0x0026
                        if (r1 != r2) goto L_0x001e
                        java.lang.Object r1 = r9.f146854c
                        kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                        java.lang.Object r5 = r9.f146857f
                        QJ.Q r5 = (QJ.Q) r5
                        XH.y.b(r10)     // Catch:{ CancellationException -> 0x001c }
                        r10 = r5
                        goto L_0x0082
                    L_0x001c:
                        r10 = r5
                        goto L_0x003d
                    L_0x001e:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L_0x0026:
                        java.lang.Object r1 = r9.f146855d
                        kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                        java.lang.Object r5 = r9.f146854c
                        kotlin.jvm.internal.O r5 = (kotlin.jvm.internal.O) r5
                        java.lang.Object r6 = r9.f146857f
                        QJ.Q r6 = (QJ.Q) r6
                        XH.y.b(r10)
                        goto L_0x0060
                    L_0x0036:
                        XH.y.b(r10)
                        java.lang.Object r10 = r9.f146857f
                        QJ.Q r10 = (QJ.Q) r10
                    L_0x003d:
                        boolean r1 = QJ.S.h(r10)
                        if (r1 == 0) goto L_0x009a
                        kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
                        r1.<init>()
                        rK.y r5 = r9.f146858g
                        SJ.j r5 = r5.f146845w
                        r9.f146857f = r10
                        r9.f146854c = r1
                        r9.f146855d = r1
                        r9.f146856e = r3
                        java.lang.Object r5 = r5.j(r9)
                        if (r5 != r0) goto L_0x005d
                        return r0
                    L_0x005d:
                        r6 = r10
                        r10 = r5
                        r5 = r1
                    L_0x0060:
                        r1.f144348a = r10
                        rK.y r10 = r9.f146858g     // Catch:{ CancellationException -> 0x0098 }
                        rK.D r10 = r10.f146843u     // Catch:{ CancellationException -> 0x0098 }
                        n0.L r1 = n0.C5589L.UserInput     // Catch:{ CancellationException -> 0x0098 }
                        rK.y$a$a$a$a r7 = new rK.y$a$a$a$a     // Catch:{ CancellationException -> 0x0098 }
                        rK.y r8 = r9.f146858g     // Catch:{ CancellationException -> 0x0098 }
                        r7.<init>(r5, r8, r4)     // Catch:{ CancellationException -> 0x0098 }
                        r9.f146857f = r6     // Catch:{ CancellationException -> 0x0098 }
                        r9.f146854c = r5     // Catch:{ CancellationException -> 0x0098 }
                        r9.f146855d = r4     // Catch:{ CancellationException -> 0x0098 }
                        r9.f146856e = r2     // Catch:{ CancellationException -> 0x0098 }
                        java.lang.Object r10 = r10.a(r1, r7, r9)     // Catch:{ CancellationException -> 0x0098 }
                        if (r10 != r0) goto L_0x0080
                        return r0
                    L_0x0080:
                        r1 = r5
                        r10 = r6
                    L_0x0082:
                        T r1 = r1.f144348a     // Catch:{ CancellationException -> 0x003d }
                        boolean r5 = r1 instanceof rK.t.a     // Catch:{ CancellationException -> 0x003d }
                        if (r5 == 0) goto L_0x008b
                        rK.t$a r1 = (rK.t.a) r1     // Catch:{ CancellationException -> 0x003d }
                        goto L_0x008c
                    L_0x008b:
                        r1 = r4
                    L_0x008c:
                        if (r1 == 0) goto L_0x003d
                        rK.y r1 = r9.f146858g     // Catch:{ CancellationException -> 0x003d }
                        nI.a r1 = r1.f146842t     // Catch:{ CancellationException -> 0x003d }
                        r1.invoke()     // Catch:{ CancellationException -> 0x003d }
                        goto L_0x003d
                    L_0x0098:
                        r10 = r6
                        goto L_0x003d
                    L_0x009a:
                        XH.N r10 = XH.C16807N.f139792a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: rK.y.a.C4273a.C4274a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: rK.y$a$a$b */
            static final class b extends C17544u implements C17642l<C5667g, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ y f146864c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(y yVar) {
                    super(1);
                    this.f146864c = yVar;
                }

                public final void a(long j10) {
                    this.f146864c.f146838p.invoke(C5667g.d(j10));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C5667g) obj).v());
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "offset", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: rK.y$a$a$c */
            static final class c extends C17544u implements C17642l<C5667g, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ y f146865c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(y yVar) {
                    super(1);
                    this.f146865c = yVar;
                }

                public final void a(long j10) {
                    C17642l N22 = this.f146865c.f146839q;
                    if (N22 != null) {
                        N22.invoke(C5667g.d(j10));
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C5667g) obj).v());
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "offset", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: rK.y$a$a$d */
            static final class d extends C17544u implements C17642l<C5667g, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ y f146866c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                d(y yVar) {
                    super(1);
                    this.f146866c = yVar;
                }

                public final void a(long j10) {
                    C17642l K22 = this.f146866c.f146840r;
                    if (K22 != null) {
                        K22.invoke(C5667g.d(j10));
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C5667g) obj).v());
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: rK.y$a$a$e */
            static final class e extends C17544u implements C17642l<C5667g, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ y f146867c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                e(y yVar) {
                    super(1);
                    this.f146867c = yVar;
                }

                public final void a(long j10) {
                    if (this.f146867c.f146844v) {
                        this.f146867c.f146841s.invoke(C5667g.d(j10));
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C5667g) obj).v());
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LrK/t;", "it", "LXH/N;", "a", "(LrK/t;)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: rK.y$a$a$f */
            static final class f extends C17544u implements C17642l<t, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ y f146868c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                f(y yVar) {
                    super(1);
                    this.f146868c = yVar;
                }

                public final void a(t tVar) {
                    C17542s.j(tVar, "it");
                    if (this.f146868c.f146844v) {
                        this.f146868c.f146845w.k(tVar);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((t) obj);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4273a(K k10, y yVar, C17164e<? super C4273a> eVar) {
                super(2, eVar);
                this.f146852e = k10;
                this.f146853f = yVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C4273a aVar = new C4273a(this.f146852e, this.f146853f, eVar);
                aVar.f146851d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C4273a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f146850c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    d dVar = null;
                    F0 unused = C16314k.d((Q) this.f146851d, (C17168i) null, T.UNDISPATCHED, new C4274a(this.f146853f, (C17164e<? super C4274a>) null), 1, (Object) null);
                    K k10 = this.f146852e;
                    b bVar = new b(this.f146853f);
                    c cVar = this.f146853f.f146839q != null ? new c(this.f146853f) : null;
                    if (this.f146853f.f146840r != null) {
                        dVar = new d(this.f146853f);
                    }
                    d dVar2 = dVar;
                    e eVar = new e(this.f146853f);
                    f fVar = new f(this.f146853f);
                    this.f146850c = 1;
                    if (x.f(k10, bVar, cVar, dVar2, eVar, fVar, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(y yVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f146849e = yVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f146849e, eVar);
            aVar.f146848d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((a) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f146847c;
            if (i10 == 0) {
                XH.y.b(obj);
                C4273a aVar = new C4273a((K) this.f146848d, this.f146849e, (C17164e<? super C4273a>) null);
                this.f146847c = 1;
                if (S.f(aVar, this) == f10) {
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

    public y(C17642l<? super C5667g, C16807N> lVar, C17642l<? super C5667g, C16807N> lVar2, C17642l<? super C5667g, C16807N> lVar3, C17642l<? super C5667g, C16807N> lVar4, C17631a<C16807N> aVar, C17863D d10, boolean z10) {
        C17542s.j(lVar, "onPress");
        C17542s.j(lVar4, "onDoubleTap");
        C17542s.j(aVar, "onQuickZoomStopped");
        C17542s.j(d10, "transformableState");
        this.f146838p = lVar;
        this.f146839q = lVar2;
        this.f146840r = lVar3;
        this.f146841s = lVar4;
        this.f146842t = aVar;
        this.f146843u = d10;
        this.f146844v = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (kotlin.jvm.internal.C17542s.e(r4.f146843u, r10) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q2(nI.C17642l<? super o1.C5667g, XH.C16807N> r5, nI.C17642l<? super o1.C5667g, XH.C16807N> r6, nI.C17642l<? super o1.C5667g, XH.C16807N> r7, nI.C17642l<? super o1.C5667g, XH.C16807N> r8, nI.C17631a<XH.C16807N> r9, rK.C17863D r10, boolean r11) {
        /*
            r4 = this;
            java.lang.String r0 = "onPress"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "onDoubleTap"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "onQuickZoomStopped"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "transformableState"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            nI.l<? super o1.g, XH.N> r0 = r4.f146839q
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001c
            r0 = r2
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r6 != 0) goto L_0x0021
            r3 = r2
            goto L_0x0022
        L_0x0021:
            r3 = r1
        L_0x0022:
            if (r0 != r3) goto L_0x003a
            nI.l<? super o1.g, XH.N> r0 = r4.f146840r
            if (r0 != 0) goto L_0x002a
            r0 = r2
            goto L_0x002b
        L_0x002a:
            r0 = r1
        L_0x002b:
            if (r7 != 0) goto L_0x002f
            r3 = r2
            goto L_0x0030
        L_0x002f:
            r3 = r1
        L_0x0030:
            if (r0 != r3) goto L_0x003a
            rK.D r0 = r4.f146843u
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r10)
            if (r0 != 0) goto L_0x003b
        L_0x003a:
            r1 = r2
        L_0x003b:
            r4.f146838p = r5
            r4.f146841s = r8
            r4.f146844v = r11
            r4.f146842t = r9
            if (r1 == 0) goto L_0x0050
            r4.f146839q = r6
            r4.f146840r = r7
            r4.f146843u = r10
            A1.W r5 = r4.f146846x
            r5.W0()
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rK.y.Q2(nI.l, nI.l, nI.l, nI.l, nI.a, rK.D, boolean):void");
    }
}
