package D4;

import D4.E;
import D4.J;
import QJ.C16310i;
import QJ.Q;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001X\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ[\u0010\u0019\u001a\u00020\u00182\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010%\u001a\u0004\u0018\u00010\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\"\u001a\u00020\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180#H¦@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001c\u0010-\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010,\u001a\u00020\u000eH\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0018¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0018¢\u0006\u0004\b4\u00103J\u001b\u00106\u001a\u00020\u00182\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00180#¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000C8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180#0K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\"\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001f\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0\\8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00180c8\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010e\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, d2 = {"LD4/N;", "", "T", "LD4/j;", "differCallback", "LdI/i;", "mainContext", "LD4/M;", "cachedPagingData", "<init>", "(LD4/j;LdI/i;LD4/M;)V", "", "LD4/a0;", "pages", "", "placeholdersBefore", "placeholdersAfter", "", "dispatchLoadStates", "LD4/w;", "sourceLoadStates", "mediatorLoadStates", "LD4/q;", "newHintReceiver", "LXH/N;", "w", "(Ljava/util/List;IIZLD4/w;LD4/w;LD4/q;LdI/e;)Ljava/lang/Object;", "source", "mediator", "r", "(LD4/w;LD4/w;)V", "LD4/D;", "previousList", "newList", "lastAccessedIndex", "Lkotlin/Function0;", "onListPresentable", "v", "(LD4/D;LD4/D;ILnI/a;LdI/e;)Ljava/lang/Object;", "u", "()Z", "pagingData", "q", "(LD4/M;LdI/e;)Ljava/lang/Object;", "index", "s", "(I)Ljava/lang/Object;", "LD4/t;", "z", "()LD4/t;", "y", "()V", "x", "listener", "p", "(LnI/a;)V", "a", "LD4/j;", "b", "LdI/i;", "c", "LD4/q;", "hintReceiver", "LD4/b0;", "d", "LD4/b0;", "uiReceiver", "LD4/J;", "e", "LD4/J;", "presenter", "LD4/B;", "f", "LD4/B;", "combinedLoadStatesCollection", "Ljava/util/concurrent/CopyOnWriteArrayList;", "g", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onPagesUpdatedListeners", "LD4/Y;", "h", "LD4/Y;", "collectFromRunner", "i", "Z", "lastAccessedIndexUnfulfilled", "j", "I", "D4/N$e", "k", "LD4/N$e;", "processPageEventCallback", "LTJ/P;", "LD4/g;", "l", "LTJ/P;", "t", "()LTJ/P;", "loadStateFlow", "LTJ/A;", "m", "LTJ/A;", "_onPagesUpdatedFlow", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class N<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C6436j f34138a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17168i f34139b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C6443q f34140c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public b0 f34141d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public J<T> f34142e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final B f34143f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArrayList<C17631a<C16807N>> f34144g;

    /* renamed from: h  reason: collision with root package name */
    private final Y f34145h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f34146i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public volatile int f34147j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final e f34148k;

    /* renamed from: l  reason: collision with root package name */
    private final C16519P<C6433g> f34149l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C16504A<C16807N> f34150m;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N<T> f34151c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(N<T> n10) {
            super(0);
            this.f34151c = n10;
        }

        public final void invoke() {
            this.f34151c.f34150m.a(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", l = {140}, m = "invokeSuspend")
    static final class b extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34152c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ N<T> f34153d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ M<T> f34154e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "LD4/E;", "event", "LXH/N;", "c", "(LD4/E;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ N<T> f34155a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ M<T> f34156b;

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$2", f = "PagingDataDiffer.kt", l = {159, 169, 186}, m = "invokeSuspend")
            /* renamed from: D4.N$b$a$a  reason: collision with other inner class name */
            static final class C0529a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f34157c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ E<T> f34158d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ N<T> f34159e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ M<T> f34160f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0529a(E<T> e10, N<T> n10, M<T> m10, C17164e<? super C0529a> eVar) {
                    super(2, eVar);
                    this.f34158d = e10;
                    this.f34159e = n10;
                    this.f34160f = m10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0529a(this.f34158d, this.f34159e, this.f34160f, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0529a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                /* JADX WARNING: Removed duplicated region for block: B:84:0x0200 A[LOOP:1: B:82:0x01fa->B:84:0x0200, LOOP_END] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r9 = eI.C17187b.f()
                        int r0 = r10.f34157c
                        r1 = 3
                        r2 = 2
                        r3 = 1
                        r4 = 0
                        if (r0 == 0) goto L_0x0024
                        if (r0 == r3) goto L_0x001f
                        if (r0 == r2) goto L_0x001f
                        if (r0 != r1) goto L_0x0017
                        XH.y.b(r11)
                        goto L_0x00d5
                    L_0x0017:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                        r0.<init>(r1)
                        throw r0
                    L_0x001f:
                        XH.y.b(r11)
                        goto L_0x01e2
                    L_0x0024:
                        XH.y.b(r11)
                        D4.E<T> r0 = r10.f34158d
                        boolean r5 = r0 instanceof D4.E.b
                        if (r5 == 0) goto L_0x0074
                        D4.E$b r0 = (D4.E.b) r0
                        D4.x r0 = r0.f()
                        D4.x r5 = D4.C6449x.REFRESH
                        if (r0 != r5) goto L_0x0074
                        D4.N<T> r0 = r10.f34159e
                        D4.E<T> r1 = r10.f34158d
                        D4.E$b r1 = (D4.E.b) r1
                        java.util.List r1 = r1.h()
                        D4.E<T> r2 = r10.f34158d
                        D4.E$b r2 = (D4.E.b) r2
                        int r2 = r2.j()
                        D4.E<T> r4 = r10.f34158d
                        D4.E$b r4 = (D4.E.b) r4
                        int r4 = r4.i()
                        D4.E<T> r5 = r10.f34158d
                        D4.E$b r5 = (D4.E.b) r5
                        D4.w r5 = r5.k()
                        D4.E<T> r6 = r10.f34158d
                        D4.E$b r6 = (D4.E.b) r6
                        D4.w r6 = r6.g()
                        D4.M<T> r7 = r10.f34160f
                        D4.q r7 = r7.e()
                        r10.f34157c = r3
                        r8 = 1
                        r3 = r4
                        r4 = r8
                        r8 = r10
                        java.lang.Object r0 = r0.w(r1, r2, r3, r4, r5, r6, r7, r8)
                        if (r0 != r9) goto L_0x01e2
                        return r9
                    L_0x0074:
                        D4.E<T> r0 = r10.f34158d
                        boolean r0 = r0 instanceof D4.E.d
                        if (r0 == 0) goto L_0x00c4
                        D4.N<T> r0 = r10.f34159e
                        D4.a0 r1 = new D4.a0
                        D4.E<T> r5 = r10.f34158d
                        D4.E$d r5 = (D4.E.d) r5
                        java.util.List r5 = r5.c()
                        r1.<init>(r4, r5)
                        java.util.List r1 = YH.C16877v.e(r1)
                        D4.E<T> r5 = r10.f34158d
                        D4.E$d r5 = (D4.E.d) r5
                        D4.w r5 = r5.e()
                        if (r5 != 0) goto L_0x00a1
                        D4.E<T> r5 = r10.f34158d
                        D4.E$d r5 = (D4.E.d) r5
                        D4.w r5 = r5.d()
                        if (r5 == 0) goto L_0x00a2
                    L_0x00a1:
                        r4 = r3
                    L_0x00a2:
                        D4.E<T> r3 = r10.f34158d
                        D4.E$d r3 = (D4.E.d) r3
                        D4.w r5 = r3.e()
                        D4.E<T> r3 = r10.f34158d
                        D4.E$d r3 = (D4.E.d) r3
                        D4.w r6 = r3.d()
                        D4.M<T> r3 = r10.f34160f
                        D4.q r7 = r3.e()
                        r10.f34157c = r2
                        r2 = 0
                        r3 = 0
                        r8 = r10
                        java.lang.Object r0 = r0.w(r1, r2, r3, r4, r5, r6, r7, r8)
                        if (r0 != r9) goto L_0x01e2
                        return r9
                    L_0x00c4:
                        D4.N<T> r0 = r10.f34159e
                        boolean r0 = r0.u()
                        if (r0 == 0) goto L_0x00d5
                        r10.f34157c = r1
                        java.lang.Object r0 = QJ.s1.a(r10)
                        if (r0 != r9) goto L_0x00d5
                        return r9
                    L_0x00d5:
                        D4.N<T> r0 = r10.f34159e
                        D4.J r0 = r0.f34142e
                        D4.E<T> r1 = r10.f34158d
                        D4.N<T> r2 = r10.f34159e
                        D4.N$e r2 = r2.f34148k
                        r0.q(r1, r2)
                        D4.E<T> r0 = r10.f34158d
                        boolean r0 = r0 instanceof D4.E.a
                        if (r0 == 0) goto L_0x00f1
                        D4.N<T> r0 = r10.f34159e
                        r0.f34146i = r4
                    L_0x00f1:
                        D4.E<T> r0 = r10.f34158d
                        boolean r0 = r0 instanceof D4.E.b
                        if (r0 == 0) goto L_0x01e2
                        D4.N<T> r0 = r10.f34159e
                        D4.B r0 = r0.f34143f
                        TJ.P r0 = r0.e()
                        java.lang.Object r0 = r0.getValue()
                        D4.g r0 = (D4.C6433g) r0
                        if (r0 == 0) goto L_0x010e
                        D4.w r0 = r0.e()
                        goto L_0x010f
                    L_0x010e:
                        r0 = 0
                    L_0x010f:
                        if (r0 == 0) goto L_0x01da
                        D4.v r1 = r0.e()
                        boolean r1 = r1.a()
                        D4.v r0 = r0.d()
                        boolean r0 = r0.a()
                        D4.E<T> r2 = r10.f34158d
                        D4.E$b r2 = (D4.E.b) r2
                        D4.x r2 = r2.f()
                        D4.x r5 = D4.C6449x.PREPEND
                        if (r2 != r5) goto L_0x012f
                        if (r1 != 0) goto L_0x013e
                    L_0x012f:
                        D4.E<T> r1 = r10.f34158d
                        D4.E$b r1 = (D4.E.b) r1
                        D4.x r1 = r1.f()
                        D4.x r2 = D4.C6449x.APPEND
                        if (r1 != r2) goto L_0x0140
                        if (r0 != 0) goto L_0x013e
                        goto L_0x0140
                    L_0x013e:
                        r0 = r4
                        goto L_0x0141
                    L_0x0140:
                        r0 = r3
                    L_0x0141:
                        D4.E<T> r1 = r10.f34158d
                        D4.E$b r1 = (D4.E.b) r1
                        java.util.List r1 = r1.h()
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        boolean r2 = r1 instanceof java.util.Collection
                        if (r2 == 0) goto L_0x0159
                        r2 = r1
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r2.isEmpty()
                        if (r2 == 0) goto L_0x0159
                        goto L_0x0174
                    L_0x0159:
                        java.util.Iterator r1 = r1.iterator()
                    L_0x015d:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L_0x0174
                        java.lang.Object r2 = r1.next()
                        D4.a0 r2 = (D4.a0) r2
                        java.util.List r2 = r2.b()
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L_0x015d
                        r3 = r4
                    L_0x0174:
                        if (r0 != 0) goto L_0x017c
                        D4.N<T> r0 = r10.f34159e
                        r0.f34146i = r4
                        goto L_0x01e2
                    L_0x017c:
                        D4.N<T> r0 = r10.f34159e
                        boolean r0 = r0.f34146i
                        if (r0 != 0) goto L_0x0186
                        if (r3 == 0) goto L_0x01e2
                    L_0x0186:
                        if (r3 != 0) goto L_0x01be
                        D4.N<T> r0 = r10.f34159e
                        int r0 = r0.f34147j
                        D4.N<T> r1 = r10.f34159e
                        D4.J r1 = r1.f34142e
                        int r1 = r1.l()
                        if (r0 < r1) goto L_0x01be
                        D4.N<T> r0 = r10.f34159e
                        int r0 = r0.f34147j
                        D4.N<T> r1 = r10.f34159e
                        D4.J r1 = r1.f34142e
                        int r1 = r1.l()
                        D4.N<T> r2 = r10.f34159e
                        D4.J r2 = r2.f34142e
                        int r2 = r2.n()
                        int r1 = r1 + r2
                        if (r0 <= r1) goto L_0x01b8
                        goto L_0x01be
                    L_0x01b8:
                        D4.N<T> r0 = r10.f34159e
                        r0.f34146i = r4
                        goto L_0x01e2
                    L_0x01be:
                        D4.N<T> r0 = r10.f34159e
                        D4.q r0 = r0.f34140c
                        if (r0 == 0) goto L_0x01e2
                        D4.N<T> r1 = r10.f34159e
                        D4.J r1 = r1.f34142e
                        D4.N<T> r2 = r10.f34159e
                        int r2 = r2.f34147j
                        D4.d0$a r1 = r1.b(r2)
                        r0.a(r1)
                        goto L_0x01e2
                    L_0x01da:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "PagingDataDiffer.combinedLoadStatesCollection.stateFlow shouldnot hold null CombinedLoadStates after Insert event."
                        r0.<init>(r1)
                        throw r0
                    L_0x01e2:
                        D4.E<T> r0 = r10.f34158d
                        boolean r1 = r0 instanceof D4.E.b
                        if (r1 != 0) goto L_0x01f0
                        boolean r1 = r0 instanceof D4.E.a
                        if (r1 != 0) goto L_0x01f0
                        boolean r0 = r0 instanceof D4.E.d
                        if (r0 == 0) goto L_0x020a
                    L_0x01f0:
                        D4.N<T> r0 = r10.f34159e
                        java.util.concurrent.CopyOnWriteArrayList r0 = r0.f34144g
                        java.util.Iterator r0 = r0.iterator()
                    L_0x01fa:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L_0x020a
                        java.lang.Object r1 = r0.next()
                        nI.a r1 = (nI.C17631a) r1
                        r1.invoke()
                        goto L_0x01fa
                    L_0x020a:
                        XH.N r0 = XH.C16807N.f139792a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: D4.N.b.a.C0529a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            a(N<T> n10, M<T> m10) {
                this.f34155a = n10;
                this.f34156b = m10;
            }

            /* renamed from: c */
            public final Object emit(E<T> e10, C17164e<? super C16807N> eVar) {
                C6450y a10 = C6451z.a();
                if (a10 != null && a10.b(2)) {
                    a10.a(2, "Collected " + e10, (Throwable) null);
                }
                Object g10 = C16310i.g(this.f34155a.f34139b, new C0529a(e10, this.f34155a, this.f34156b, (C17164e<? super C0529a>) null), eVar);
                return g10 == C17187b.f() ? g10 : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(N<T> n10, M<T> m10, C17164e<? super b> eVar) {
            super(1, eVar);
            this.f34153d = n10;
            this.f34154e = m10;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new b(this.f34153d, this.f34154e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((b) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f34152c;
            if (i10 == 0) {
                y.b(obj);
                this.f34153d.f34141d = this.f34154e.f();
                C16532g<E<T>> d10 = this.f34154e.d();
                a aVar = new a(this.f34153d, this.f34154e);
                this.f34152c = 1;
                if (d10.collect(aVar, this) == f10) {
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
    @f(c = "androidx.paging.PagingDataDiffer", f = "PagingDataDiffer.kt", l = {460}, m = "presentNewList")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f34161c;

        /* renamed from: d  reason: collision with root package name */
        Object f34162d;

        /* renamed from: e  reason: collision with root package name */
        Object f34163e;

        /* renamed from: f  reason: collision with root package name */
        Object f34164f;

        /* renamed from: g  reason: collision with root package name */
        Object f34165g;

        /* renamed from: h  reason: collision with root package name */
        boolean f34166h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f34167i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ N<T> f34168j;

        /* renamed from: k  reason: collision with root package name */
        int f34169k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(N<T> n10, C17164e<? super c> eVar) {
            super(eVar);
            this.f34168j = n10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f34167i = obj;
            this.f34169k |= Integer.MIN_VALUE;
            return this.f34168j.w((List) null, 0, 0, false, (C6448w) null, (C6448w) null, (C6443q) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N<T> f34170c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ J<T> f34171d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f34172e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6443q f34173f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6448w f34174g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List<a0<T>> f34175h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f34176i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f34177j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C6448w f34178k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(N<T> n10, J<T> j10, K k10, C6443q qVar, C6448w wVar, List<a0<T>> list, int i10, int i11, C6448w wVar2) {
            super(0);
            this.f34170c = n10;
            this.f34171d = j10;
            this.f34172e = k10;
            this.f34173f = qVar;
            this.f34174g = wVar;
            this.f34175h = list;
            this.f34176i = i10;
            this.f34177j = i11;
            this.f34178k = wVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x003f, code lost:
            r10 = r10.b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke() {
            /*
                r12 = this;
                D4.N<T> r0 = r12.f34170c
                D4.J<T> r1 = r12.f34171d
                r0.f34142e = r1
                kotlin.jvm.internal.K r0 = r12.f34172e
                r1 = 1
                r0.f144344a = r1
                D4.N<T> r0 = r12.f34170c
                D4.q r2 = r12.f34173f
                r0.f34140c = r2
                D4.w r0 = r12.f34174g
                java.util.List<D4.a0<T>> r2 = r12.f34175h
                int r3 = r12.f34176i
                int r4 = r12.f34177j
                D4.q r5 = r12.f34173f
                D4.w r6 = r12.f34178k
                D4.y r7 = D4.C6451z.a()
                if (r7 == 0) goto L_0x00c6
                r8 = 3
                boolean r9 = r7.b(r8)
                if (r9 != r1) goto L_0x00c6
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "Presenting data:\n                            |   first item: "
                r9.append(r10)
                java.lang.Object r10 = YH.C16877v.y0(r2)
                D4.a0 r10 = (D4.a0) r10
                r11 = 0
                if (r10 == 0) goto L_0x004a
                java.util.List r10 = r10.b()
                if (r10 == 0) goto L_0x004a
                java.lang.Object r10 = YH.C16877v.y0(r10)
                goto L_0x004b
            L_0x004a:
                r10 = r11
            L_0x004b:
                r9.append(r10)
                java.lang.String r10 = "\n                            |   last item: "
                r9.append(r10)
                java.lang.Object r2 = YH.C16877v.K0(r2)
                D4.a0 r2 = (D4.a0) r2
                if (r2 == 0) goto L_0x0066
                java.util.List r2 = r2.b()
                if (r2 == 0) goto L_0x0066
                java.lang.Object r2 = YH.C16877v.K0(r2)
                goto L_0x0067
            L_0x0066:
                r2 = r11
            L_0x0067:
                r9.append(r2)
                java.lang.String r2 = "\n                            |   placeholdersBefore: "
                r9.append(r2)
                r9.append(r3)
                java.lang.String r2 = "\n                            |   placeholdersAfter: "
                r9.append(r2)
                r9.append(r4)
                java.lang.String r2 = "\n                            |   hintReceiver: "
                r9.append(r2)
                r9.append(r5)
                java.lang.String r2 = "\n                            |   sourceLoadStates: "
                r9.append(r2)
                r9.append(r6)
                java.lang.String r2 = "\n                        "
                r9.append(r2)
                java.lang.String r2 = r9.toString()
                if (r0 == 0) goto L_0x00ae
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r2 = "|   mediatorLoadStates: "
                r3.append(r2)
                r3.append(r0)
                r0 = 10
                r3.append(r0)
                java.lang.String r2 = r3.toString()
            L_0x00ae:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = "|)"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = HJ.C15854t.o(r0, r11, r1, r11)
                r7.a(r8, r0, r11)
            L_0x00c6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.N.d.invoke():void");
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007J!\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"D4/N$e", "LD4/J$b;", "", "position", "count", "LXH/N;", "c", "(II)V", "a", "b", "LD4/w;", "source", "mediator", "d", "(LD4/w;LD4/w;)V", "LD4/x;", "loadType", "", "fromMediator", "LD4/v;", "loadState", "e", "(LD4/x;ZLD4/v;)V", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements J.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N<T> f34179a;

        e(N<T> n10) {
            this.f34179a = n10;
        }

        public void a(int i10, int i11) {
            this.f34179a.f34138a.a(i10, i11);
        }

        public void b(int i10, int i11) {
            this.f34179a.f34138a.b(i10, i11);
        }

        public void c(int i10, int i11) {
            this.f34179a.f34138a.c(i10, i11);
        }

        public void d(C6448w wVar, C6448w wVar2) {
            C17542s.j(wVar, "source");
            this.f34179a.r(wVar, wVar2);
        }

        public void e(C6449x xVar, boolean z10, C6447v vVar) {
            C17542s.j(xVar, "loadType");
            C17542s.j(vVar, "loadState");
            this.f34179a.f34143f.g(xVar, z10, vVar);
        }
    }

    public N(C6436j jVar, C17168i iVar, M<T> m10) {
        E.b<T> c10;
        C17542s.j(jVar, "differCallback");
        C17542s.j(iVar, "mainContext");
        this.f34138a = jVar;
        this.f34139b = iVar;
        this.f34142e = J.f34110e.a(m10 != null ? m10.c() : null);
        B b10 = new B();
        if (!(m10 == null || (c10 = m10.c()) == null)) {
            b10.f(c10.k(), c10.g());
        }
        this.f34143f = b10;
        this.f34144g = new CopyOnWriteArrayList<>();
        this.f34145h = new Y(false, 1, (DefaultConstructorMarker) null);
        this.f34148k = new e(this);
        this.f34149l = b10.e();
        this.f34150m = C16511H.a(0, 64, C16428d.DROP_OLDEST);
        p(new a(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(java.util.List<D4.a0<T>> r21, int r22, int r23, boolean r24, D4.C6448w r25, D4.C6448w r26, D4.C6443q r27, dI.C17164e<? super XH.C16807N> r28) {
        /*
            r20 = this;
            r10 = r20
            r11 = r24
            r12 = r25
            r0 = r28
            boolean r1 = r0 instanceof D4.N.c
            if (r1 == 0) goto L_0x001c
            r1 = r0
            D4.N$c r1 = (D4.N.c) r1
            int r2 = r1.f34169k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001c
            int r2 = r2 - r3
            r1.f34169k = r2
        L_0x001a:
            r13 = r1
            goto L_0x0022
        L_0x001c:
            D4.N$c r1 = new D4.N$c
            r1.<init>(r10, r0)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r0 = r13.f34167i
            java.lang.Object r14 = eI.C17187b.f()
            int r1 = r13.f34169k
            r15 = 1
            if (r1 == 0) goto L_0x0054
            if (r1 != r15) goto L_0x004c
            boolean r1 = r13.f34166h
            java.lang.Object r2 = r13.f34165g
            kotlin.jvm.internal.K r2 = (kotlin.jvm.internal.K) r2
            java.lang.Object r3 = r13.f34164f
            D4.J r3 = (D4.J) r3
            java.lang.Object r4 = r13.f34163e
            D4.w r4 = (D4.C6448w) r4
            java.lang.Object r5 = r13.f34162d
            D4.w r5 = (D4.C6448w) r5
            java.lang.Object r6 = r13.f34161c
            D4.N r6 = (D4.N) r6
            XH.y.b(r0)
            r11 = r1
            r12 = r5
            goto L_0x00bc
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            XH.y.b(r0)
            if (r11 == 0) goto L_0x0064
            if (r12 == 0) goto L_0x005c
            goto L_0x0064
        L_0x005c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot dispatch LoadStates in PagingDataDiffer without source LoadStates set."
            r0.<init>(r1)
            throw r0
        L_0x0064:
            r0 = 0
            r10.f34146i = r0
            D4.J r9 = new D4.J
            r6 = r21
            r7 = r22
            r8 = r23
            r9.<init>(r6, r7, r8)
            kotlin.jvm.internal.K r5 = new kotlin.jvm.internal.K
            r5.<init>()
            D4.J<T> r4 = r10.f34142e
            int r3 = r10.f34147j
            D4.N$d r16 = new D4.N$d
            r0 = r16
            r1 = r20
            r2 = r9
            r17 = r3
            r3 = r5
            r18 = r4
            r4 = r27
            r15 = r5
            r5 = r26
            r19 = r14
            r14 = r9
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.f34161c = r10
            r13.f34162d = r12
            r6 = r26
            r13.f34163e = r6
            r13.f34164f = r14
            r13.f34165g = r15
            r13.f34166h = r11
            r0 = 1
            r13.f34169k = r0
            r0 = r20
            r1 = r18
            r2 = r14
            r3 = r17
            r4 = r16
            r5 = r13
            java.lang.Object r0 = r0.v(r1, r2, r3, r4, r5)
            r1 = r19
            if (r0 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            r4 = r6
            r6 = r10
            r3 = r14
            r2 = r15
        L_0x00bc:
            java.lang.Integer r0 = (java.lang.Integer) r0
            boolean r1 = r2.f144344a
            if (r1 == 0) goto L_0x00f0
            if (r11 == 0) goto L_0x00ca
            kotlin.jvm.internal.C17542s.g(r12)
            r6.r(r12, r4)
        L_0x00ca:
            if (r0 != 0) goto L_0x00d8
            D4.q r0 = r6.f34140c
            if (r0 == 0) goto L_0x00ed
            D4.d0$b r1 = r3.o()
            r0.a(r1)
            goto L_0x00ed
        L_0x00d8:
            int r1 = r0.intValue()
            r6.f34147j = r1
            D4.q r1 = r6.f34140c
            if (r1 == 0) goto L_0x00ed
            int r0 = r0.intValue()
            D4.d0$a r0 = r3.b(r0)
            r1.a(r0)
        L_0x00ed:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x00f0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing call to onListPresentable after new list was presented. If you are seeing\n this exception, it is generally an indication of an issue with Paging.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.N.w(java.util.List, int, int, boolean, D4.w, D4.w, D4.q, dI.e):java.lang.Object");
    }

    public final void p(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "listener");
        this.f34144g.add(aVar);
    }

    public final Object q(M<T> m10, C17164e<? super C16807N> eVar) {
        Object c10 = Y.c(this.f34145h, 0, new b(this, m10, (C17164e<? super b>) null), eVar, 1, (Object) null);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public final void r(C6448w wVar, C6448w wVar2) {
        C17542s.j(wVar, "source");
        this.f34143f.f(wVar, wVar2);
    }

    public final T s(int i10) {
        this.f34146i = true;
        this.f34147j = i10;
        C6450y a10 = C6451z.a();
        if (a10 != null && a10.b(2)) {
            a10.a(2, "Accessing item index[" + i10 + ']', (Throwable) null);
        }
        C6443q qVar = this.f34140c;
        if (qVar != null) {
            qVar.a(this.f34142e.b(i10));
        }
        return this.f34142e.g(i10);
    }

    public final C16519P<C6433g> t() {
        return this.f34149l;
    }

    public boolean u() {
        return false;
    }

    public abstract Object v(D<T> d10, D<T> d11, int i10, C17631a<C16807N> aVar, C17164e<? super Integer> eVar);

    public final void x() {
        C6450y a10 = C6451z.a();
        if (a10 != null && a10.b(3)) {
            a10.a(3, "Refresh signal received", (Throwable) null);
        }
        b0 b0Var = this.f34141d;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void y() {
        C6450y a10 = C6451z.a();
        if (a10 != null && a10.b(3)) {
            a10.a(3, "Retry signal received", (Throwable) null);
        }
        b0 b0Var = this.f34141d;
        if (b0Var != null) {
            b0Var.a();
        }
    }

    public final C6445t<T> z() {
        return this.f34142e.r();
    }
}
