package D4;

import D4.C6447v;
import D4.E;
import D4.I;
import D4.P;
import QJ.C16283A;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import bK.C17052a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B{\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\n*\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010$\u001a\u00020\n*\b\u0012\u0004\u0012\u00020#0\t2\u0006\u0010\u001d\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b*\u0010\u001bJ#\u0010-\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020+H@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J7\u00103\u001a\u0002022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u00018\u00002\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u000100H\u0002¢\u0006\u0004\b3\u00104J+\u00106\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001052\u0006\u0010\u001d\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b6\u00107J3\u0010:\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00109\u001a\u000208H@ø\u0001\u0000¢\u0006\u0004\b:\u0010;J9\u0010>\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020#H\u0002¢\u0006\u0004\b>\u0010?R\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0000X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020T8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010]0\\8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R \u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010gR#\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010]0\t8\u0006¢\u0006\f\n\u0004\bi\u0010K\u001a\u0004\bj\u0010k\u0002\u0004\n\u0002\b\u0019¨\u0006m"}, d2 = {"LD4/G;", "", "Key", "Value", "initialKey", "LD4/P;", "pagingSource", "LD4/L;", "config", "LTJ/g;", "LXH/N;", "retryFlow", "LD4/U;", "remoteMediatorConnection", "LD4/Q;", "previousPagingState", "Lkotlin/Function0;", "jumpCallback", "<init>", "(Ljava/lang/Object;LD4/P;LD4/L;LTJ/g;LD4/U;LD4/Q;LnI/a;)V", "LD4/d0;", "viewportHint", "o", "(LD4/d0;)V", "p", "()V", "r", "(LdI/e;)Ljava/lang/Object;", "LD4/x;", "loadType", "A", "(LD4/x;LD4/d0;LdI/e;)Ljava/lang/Object;", "LQJ/Q;", "D", "(LQJ/Q;)V", "", "q", "(LTJ/g;LD4/x;LdI/e;)Ljava/lang/Object;", "key", "LD4/P$a;", "x", "(LD4/x;Ljava/lang/Object;)LD4/P$a;", "s", "LD4/n;", "generationalHint", "t", "(LD4/x;LD4/n;LdI/e;)Ljava/lang/Object;", "loadKey", "LD4/P$b;", "result", "", "y", "(LD4/x;Ljava/lang/Object;LD4/P$b;)Ljava/lang/String;", "LD4/I;", "C", "(LD4/I;LD4/x;LdI/e;)Ljava/lang/Object;", "LD4/v$a;", "error", "B", "(LD4/I;LD4/x;LD4/v$a;LdI/e;)Ljava/lang/Object;", "generationId", "presentedItemsBeyondAnchor", "z", "(LD4/I;LD4/x;II)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getInitialKey$paging_common", "()Ljava/lang/Object;", "b", "LD4/P;", "v", "()LD4/P;", "c", "LD4/L;", "d", "LTJ/g;", "e", "LD4/U;", "w", "()LD4/U;", "f", "LD4/Q;", "g", "LnI/a;", "LD4/o;", "h", "LD4/o;", "hintHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pageEventChCollected", "LSJ/j;", "LD4/E;", "j", "LSJ/j;", "pageEventCh", "LD4/I$a;", "k", "LD4/I$a;", "stateHolder", "LQJ/A;", "l", "LQJ/A;", "pageEventChannelFlowJob", "m", "u", "()LTJ/g;", "pageEventFlow", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class G<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final Key f33972a;

    /* renamed from: b  reason: collision with root package name */
    private final P<Key, Value> f33973b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final L f33974c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C16532g<C16807N> f33975d;

    /* renamed from: e  reason: collision with root package name */
    private final U<Key, Value> f33976e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Q<Key, Value> f33977f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C17631a<C16807N> f33978g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C6441o f33979h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f33980i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final C16434j<E<Value>> f33981j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final I.a<Key, Value> f33982k;

    /* renamed from: l  reason: collision with root package name */
    private final C16283A f33983l;

    /* renamed from: m  reason: collision with root package name */
    private final C16532g<E<Value>> f33984m;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33985a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                D4.x[] r0 = D4.C6449x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                D4.x r1 = D4.C6449x.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                D4.x r1 = D4.C6449x.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                D4.x r1 = D4.C6449x.APPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f33985a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.G.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@"}, d2 = {"T", "R", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {232, 99}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super C6440n>, Integer, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33986c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f33987d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f33988e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ G f33989f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6449x f33990g;

        /* renamed from: h  reason: collision with root package name */
        Object f33991h;

        /* renamed from: i  reason: collision with root package name */
        int f33992i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, G g10, C6449x xVar) {
            super(3, eVar);
            this.f33989f = g10;
            this.f33990g = xVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C6440n> hVar, Integer num, C17164e<? super C16807N> eVar) {
            b bVar = new b(eVar, this.f33989f, this.f33990g);
            bVar.f33987d = hVar;
            bVar.f33988e = num;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f33986c
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x002e
                if (r1 == r3) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                XH.y.b(r12)
                goto L_0x00c8
            L_0x0014:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001c:
                int r1 = r11.f33992i
                java.lang.Object r5 = r11.f33991h
                bK.a r5 = (bK.C17052a) r5
                java.lang.Object r6 = r11.f33988e
                D4.I$a r6 = (D4.I.a) r6
                java.lang.Object r7 = r11.f33987d
                TJ.h r7 = (TJ.C16533h) r7
                XH.y.b(r12)
                goto L_0x0059
            L_0x002e:
                XH.y.b(r12)
                java.lang.Object r12 = r11.f33987d
                r7 = r12
                TJ.h r7 = (TJ.C16533h) r7
                java.lang.Object r12 = r11.f33988e
                java.lang.Number r12 = (java.lang.Number) r12
                int r1 = r12.intValue()
                D4.G r12 = r11.f33989f
                D4.I$a r6 = r12.f33982k
                bK.a r5 = r6.f34103b
                r11.f33987d = r7
                r11.f33988e = r6
                r11.f33991h = r5
                r11.f33992i = r1
                r11.f33986c = r3
                java.lang.Object r12 = r5.e(r4, r11)
                if (r12 != r0) goto L_0x0059
                return r0
            L_0x0059:
                D4.I r12 = r6.f34104c     // Catch:{ all -> 0x007e }
                D4.C r6 = r12.p()     // Catch:{ all -> 0x007e }
                D4.x r8 = r11.f33990g     // Catch:{ all -> 0x007e }
                D4.v r6 = r6.a(r8)     // Catch:{ all -> 0x007e }
                D4.v$c$a r8 = D4.C6447v.c.f34457b     // Catch:{ all -> 0x007e }
                D4.v$c r9 = r8.a()     // Catch:{ all -> 0x007e }
                boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)     // Catch:{ all -> 0x007e }
                r9 = 0
                if (r6 == 0) goto L_0x0080
                D4.n[] r12 = new D4.C6440n[r9]     // Catch:{ all -> 0x007e }
                TJ.g r12 = TJ.C16534i.K(r12)     // Catch:{ all -> 0x007e }
                r5.d(r4)
                goto L_0x00b9
            L_0x007e:
                r12 = move-exception
                goto L_0x00cb
            L_0x0080:
                D4.C r6 = r12.p()     // Catch:{ all -> 0x007e }
                D4.x r10 = r11.f33990g     // Catch:{ all -> 0x007e }
                D4.v r6 = r6.a(r10)     // Catch:{ all -> 0x007e }
                boolean r6 = r6 instanceof D4.C6447v.a     // Catch:{ all -> 0x007e }
                if (r6 != 0) goto L_0x009b
                D4.C r12 = r12.p()     // Catch:{ all -> 0x007e }
                D4.x r6 = r11.f33990g     // Catch:{ all -> 0x007e }
                D4.v$c r8 = r8.b()     // Catch:{ all -> 0x007e }
                r12.c(r6, r8)     // Catch:{ all -> 0x007e }
            L_0x009b:
                XH.N r12 = XH.C16807N.f139792a     // Catch:{ all -> 0x007e }
                r5.d(r4)
                D4.G r12 = r11.f33989f
                D4.o r12 = r12.f33979h
                D4.x r5 = r11.f33990g
                TJ.g r12 = r12.c(r5)
                if (r1 != 0) goto L_0x00af
                r3 = r9
            L_0x00af:
                TJ.g r12 = TJ.C16534i.u(r12, r3)
                D4.G$e r3 = new D4.G$e
                r3.<init>(r12, r1)
                r12 = r3
            L_0x00b9:
                r11.f33987d = r4
                r11.f33988e = r4
                r11.f33991h = r4
                r11.f33986c = r2
                java.lang.Object r12 = TJ.C16534i.x(r7, r12, r11)
                if (r12 != r0) goto L_0x00c8
                return r0
            L_0x00c8:
                XH.N r12 = XH.C16807N.f139792a
                return r12
            L_0x00cb:
                r5.d(r4)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.G.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LD4/n;", "previous", "next", "<anonymous>", "(LD4/n;LD4/n;)LD4/n;"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements q<C6440n, C6440n, C17164e<? super C6440n>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33993c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f33994d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f33995e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6449x f33996f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6449x xVar, C17164e<? super c> eVar) {
            super(3, eVar);
            this.f33996f = xVar;
        }

        /* renamed from: i */
        public final Object invoke(C6440n nVar, C6440n nVar2, C17164e<? super C6440n> eVar) {
            c cVar = new c(this.f33996f, eVar);
            cVar.f33994d = nVar;
            cVar.f33995e = nVar2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f33993c == 0) {
                y.b(obj);
                C6440n nVar = (C6440n) this.f33994d;
                C6440n nVar2 = (C6440n) this.f33995e;
                return H.a(nVar2, nVar, this.f33996f) ? nVar2 : nVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LD4/n;", "generationalHint", "LXH/N;", "c", "(LD4/n;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class d<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G<Key, Value> f33997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6449x f33998b;

        d(G<Key, Value> g10, C6449x xVar) {
            this.f33997a = g10;
            this.f33998b = xVar;
        }

        /* renamed from: c */
        public final Object emit(C6440n nVar, C17164e<? super C16807N> eVar) {
            Object c10 = this.f33997a.t(this.f33998b, nVar, eVar);
            return c10 == C17187b.f() ? c10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements C16532g<C6440n> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f33999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34000b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f34001a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f34002b;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {223}, m = "emit")
            /* renamed from: D4.G$e$a$a  reason: collision with other inner class name */
            public static final class C0525a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f34003c;

                /* renamed from: d  reason: collision with root package name */
                int f34004d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f34005e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0525a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f34005e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f34003c = obj;
                    this.f34004d |= Integer.MIN_VALUE;
                    return this.f34005e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, int i10) {
                this.f34001a = hVar;
                this.f34002b = i10;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof D4.G.e.a.C0525a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    D4.G$e$a$a r0 = (D4.G.e.a.C0525a) r0
                    int r1 = r0.f34004d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f34004d = r1
                    goto L_0x0018
                L_0x0013:
                    D4.G$e$a$a r0 = new D4.G$e$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f34003c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f34004d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f34001a
                    D4.d0 r6 = (D4.d0) r6
                    D4.n r2 = new D4.n
                    int r4 = r5.f34002b
                    r2.<init>(r4, r6)
                    r0.f34004d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: D4.G.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar, int i10) {
            this.f33999a = gVar;
            this.f34000b = i10;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f33999a.collect(new a(hVar, this.f34000b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {645}, m = "currentPagingState")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f34006c;

        /* renamed from: d  reason: collision with root package name */
        Object f34007d;

        /* renamed from: e  reason: collision with root package name */
        Object f34008e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f34009f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ G<Key, Value> f34010g;

        /* renamed from: h  reason: collision with root package name */
        int f34011h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(G<Key, Value> g10, C17164e<? super f> eVar) {
            super(eVar);
            this.f34010g = g10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f34009f = obj;
            this.f34011h |= Integer.MIN_VALUE;
            return this.f34010g.r(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {645, 284, 290, 667, 689, 326, 711, 733, 354}, m = "doInitialLoad")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f34012c;

        /* renamed from: d  reason: collision with root package name */
        Object f34013d;

        /* renamed from: e  reason: collision with root package name */
        Object f34014e;

        /* renamed from: f  reason: collision with root package name */
        Object f34015f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f34016g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ G<Key, Value> f34017h;

        /* renamed from: i  reason: collision with root package name */
        int f34018i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(G<Key, Value> g10, C17164e<? super g> eVar) {
            super(eVar);
            this.f34017h = g10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f34016g = obj;
            this.f34018i |= Integer.MIN_VALUE;
            return this.f34017h.s(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646, 658, 415, 424, 680, 722, 472, 744, 495, 521, 756}, m = "doLoad")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f34019c;

        /* renamed from: d  reason: collision with root package name */
        Object f34020d;

        /* renamed from: e  reason: collision with root package name */
        Object f34021e;

        /* renamed from: f  reason: collision with root package name */
        Object f34022f;

        /* renamed from: g  reason: collision with root package name */
        Object f34023g;

        /* renamed from: h  reason: collision with root package name */
        Object f34024h;

        /* renamed from: i  reason: collision with root package name */
        Object f34025i;

        /* renamed from: j  reason: collision with root package name */
        Object f34026j;

        /* renamed from: k  reason: collision with root package name */
        Object f34027k;

        /* renamed from: l  reason: collision with root package name */
        Object f34028l;

        /* renamed from: m  reason: collision with root package name */
        Object f34029m;

        /* renamed from: n  reason: collision with root package name */
        int f34030n;

        /* renamed from: o  reason: collision with root package name */
        int f34031o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f34032p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ G<Key, Value> f34033q;

        /* renamed from: r  reason: collision with root package name */
        int f34034r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(G<Key, Value> g10, C17164e<? super h> eVar) {
            super(eVar);
            this.f34033q = g10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f34032p = obj;
            this.f34034r |= Integer.MIN_VALUE;
            return this.f34033q.t((C6449x) null, (C6440n) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LD4/W;", "LD4/E;", "LXH/N;", "<anonymous>", "(LD4/W;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {645, 168, 657}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<W<E<Value>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f34035c;

        /* renamed from: d  reason: collision with root package name */
        Object f34036d;

        /* renamed from: e  reason: collision with root package name */
        Object f34037e;

        /* renamed from: f  reason: collision with root package name */
        int f34038f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f34039g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ G<Key, Value> f34040h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {91}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f34041c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ G<Key, Value> f34042d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ W<E<Value>> f34043e;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LD4/E;", "it", "LXH/N;", "c", "(LD4/E;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: D4.G$i$a$a  reason: collision with other inner class name */
            static final class C0526a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ W<E<Value>> f34044a;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", l = {95}, m = "emit")
                /* renamed from: D4.G$i$a$a$a  reason: collision with other inner class name */
                static final class C0527a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f34045c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ C0526a<T> f34046d;

                    /* renamed from: e  reason: collision with root package name */
                    int f34047e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0527a(C0526a<? super T> aVar, C17164e<? super C0527a> eVar) {
                        super(eVar);
                        this.f34046d = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f34045c = obj;
                        this.f34047e |= Integer.MIN_VALUE;
                        return this.f34046d.emit((E) null, this);
                    }
                }

                C0526a(W<E<Value>> w10) {
                    this.f34044a = w10;
                }

                /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* renamed from: c */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(D4.E<Value> r5, dI.C17164e<? super XH.C16807N> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof D4.G.i.a.C0526a.C0527a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        D4.G$i$a$a$a r0 = (D4.G.i.a.C0526a.C0527a) r0
                        int r1 = r0.f34047e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f34047e = r1
                        goto L_0x0018
                    L_0x0013:
                        D4.G$i$a$a$a r0 = new D4.G$i$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f34045c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f34047e
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)     // Catch:{ t -> 0x003f }
                        goto L_0x003f
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        D4.W<D4.E<Value>> r6 = r4.f34044a     // Catch:{ t -> 0x003f }
                        r0.f34047e = r3     // Catch:{ t -> 0x003f }
                        java.lang.Object r5 = r6.y(r5, r0)     // Catch:{ t -> 0x003f }
                        if (r5 != r1) goto L_0x003f
                        return r1
                    L_0x003f:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: D4.G.i.a.C0526a.emit(D4.E, dI.e):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(G<Key, Value> g10, W<E<Value>> w10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f34042d = g10;
                this.f34043e = w10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f34042d, this.f34043e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f34041c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g p10 = C16534i.p(this.f34042d.f33981j);
                    C0526a aVar = new C0526a(this.f34043e);
                    this.f34041c = 1;
                    if (p10.collect(aVar, this) == f10) {
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {105}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f34048c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ G<Key, Value> f34049d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16434j<C16807N> f34050e;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "LXH/N;", "it", "c", "(LXH/N;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
            static final class a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16434j<C16807N> f34051a;

                a(C16434j<C16807N> jVar) {
                    this.f34051a = jVar;
                }

                /* renamed from: c */
                public final Object emit(C16807N n10, C17164e<? super C16807N> eVar) {
                    this.f34051a.k(n10);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(G<Key, Value> g10, C16434j<C16807N> jVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f34049d = g10;
                this.f34050e = jVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f34049d, this.f34050e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f34048c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g j10 = this.f34049d.f33975d;
                    a aVar = new a(this.f34050e);
                    this.f34048c = 1;
                    if (j10.collect(aVar, this) == f10) {
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {110}, m = "invokeSuspend")
        static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f34052c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f34053d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16434j<C16807N> f34054e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ G<Key, Value> f34055f;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "LXH/N;", "it", "c", "(LXH/N;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
            static final class a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ G<Key, Value> f34056a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Q f34057b;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: D4.G$i$c$a$a  reason: collision with other inner class name */
                public /* synthetic */ class C0528a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final /* synthetic */ int[] f34058a;

                    static {
                        int[] iArr = new int[C6449x.values().length];
                        try {
                            iArr[C6449x.REFRESH.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f34058a = iArr;
                    }
                }

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", l = {645, 658, 125, 670, 128, 682, 695, 125, 707, 128, 719, 732, 125, 744, 128, 756}, m = "emit")
                static final class b extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    Object f34059c;

                    /* renamed from: d  reason: collision with root package name */
                    Object f34060d;

                    /* renamed from: e  reason: collision with root package name */
                    Object f34061e;

                    /* renamed from: f  reason: collision with root package name */
                    Object f34062f;

                    /* renamed from: g  reason: collision with root package name */
                    Object f34063g;

                    /* renamed from: h  reason: collision with root package name */
                    Object f34064h;

                    /* renamed from: i  reason: collision with root package name */
                    Object f34065i;

                    /* renamed from: j  reason: collision with root package name */
                    Object f34066j;

                    /* renamed from: k  reason: collision with root package name */
                    /* synthetic */ Object f34067k;

                    /* renamed from: l  reason: collision with root package name */
                    final /* synthetic */ a<T> f34068l;

                    /* renamed from: m  reason: collision with root package name */
                    int f34069m;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    b(a<? super T> aVar, C17164e<? super b> eVar) {
                        super(eVar);
                        this.f34068l = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f34067k = obj;
                        this.f34069m |= Integer.MIN_VALUE;
                        return this.f34068l.emit((C16807N) null, this);
                    }
                }

                a(G<Key, Value> g10, Q q10) {
                    this.f34056a = g10;
                    this.f34057b = q10;
                }

                /* JADX INFO: finally extract failed */
                /* JADX WARNING: Code restructure failed: missing block: B:100:0x036b, code lost:
                    r15 = XH.C16807N.f139792a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:101:0x036d, code lost:
                    r1.d((java.lang.Object) null);
                    r8 = r5;
                    r1 = r6;
                    r10 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:104:0x0378, code lost:
                    r10 = r1;
                    r8 = r4;
                    r4 = r5;
                    r1 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:106:0x0384, code lost:
                    if (D4.G.i.c.a.C0528a.f34058a[r4.ordinal()] != 1) goto L_0x038a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:107:0x0386, code lost:
                    r5 = r1;
                    r15 = null;
                    r6 = r4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:108:0x038a, code lost:
                    r6 = D4.G.k(r1);
                    r5 = r6.f34103b;
                    r14.f34059c = r10;
                    r14.f34060d = r1;
                    r14.f34061e = r8;
                    r14.f34062f = r4;
                    r14.f34063g = r6;
                    r14.f34064h = r5;
                    r14.f34065i = r4;
                    r14.f34066j = r1;
                    r14.f34069m = 9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:109:0x03aa, code lost:
                    if (r5.e((java.lang.Object) null, r14) != r0) goto L_0x03ad;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:110:0x03ac, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:111:0x03ad, code lost:
                    r9 = r1;
                    r7 = r4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
                    r15 = r6.f34104c.k().get(r7);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:114:0x03bd, code lost:
                    r5.d((java.lang.Object) null);
                    r5 = r1;
                    r6 = r4;
                    r4 = r7;
                    r1 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:115:0x03c4, code lost:
                    r14.f34059c = r10;
                    r14.f34060d = r1;
                    r14.f34061e = r8;
                    r14.f34062f = r4;
                    r14.f34063g = null;
                    r14.f34064h = null;
                    r14.f34065i = null;
                    r14.f34066j = null;
                    r14.f34069m = 10;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:116:0x03dc, code lost:
                    if (D4.G.l(r5, r6, r15, r14) != r0) goto L_0x03df;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:117:0x03de, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:118:0x03df, code lost:
                    r6 = r1;
                    r1 = r4;
                    r5 = r8;
                    r7 = r10;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:120:0x03e5, code lost:
                    if (r1 != D4.C6449x.REFRESH) goto L_0x041c;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:121:0x03e7, code lost:
                    r4 = D4.G.k(r6);
                    r1 = r4.f34103b;
                    r14.f34059c = r7;
                    r14.f34060d = r6;
                    r14.f34061e = r5;
                    r14.f34062f = r4;
                    r14.f34063g = r1;
                    r14.f34069m = 11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:122:0x0401, code lost:
                    if (r1.e((java.lang.Object) null, r14) != r0) goto L_0x0404;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:123:0x0403, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
                    r15 = r4.f34104c.p().a(D4.C6449x.REFRESH);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:126:0x0412, code lost:
                    r1.d((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:127:0x0417, code lost:
                    if ((r15 instanceof D4.C6447v.a) != false) goto L_0x041c;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:128:0x0419, code lost:
                    D4.G.n(r6, r5);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:129:0x041c, code lost:
                    r4 = r5;
                    r15 = r6;
                    r1 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:130:0x0420, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:131:0x0421, code lost:
                    r1.d((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:132:0x0424, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:133:0x0425, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:134:0x0426, code lost:
                    r5.d((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:135:0x0429, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:136:0x042a, code lost:
                    r5 = D4.C6449x.APPEND;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:137:0x0432, code lost:
                    if ((r1.d() instanceof D4.C6447v.a) == false) goto L_0x052b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:139:0x0436, code lost:
                    if (r5 == D4.C6449x.REFRESH) goto L_0x0481;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:140:0x0438, code lost:
                    r1 = D4.G.k(r15);
                    r6 = r1.f34103b;
                    r14.f34059c = r15;
                    r14.f34060d = r4;
                    r14.f34061e = r5;
                    r14.f34062f = r1;
                    r14.f34063g = r6;
                    r14.f34069m = 12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:141:0x0452, code lost:
                    if (r6.e((java.lang.Object) null, r14) != r0) goto L_0x0455;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:142:0x0454, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:143:0x0455, code lost:
                    r11 = r4;
                    r4 = r1;
                    r1 = r6;
                    r6 = r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
                    r4 = r4.f34104c;
                    r14.f34059c = r15;
                    r14.f34060d = r6;
                    r14.f34061e = r5;
                    r14.f34062f = r1;
                    r14.f34063g = null;
                    r14.f34069m = 13;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:146:0x046f, code lost:
                    if (D4.G.m(r15, r4, r5, r14) != r0) goto L_0x0472;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:147:0x0471, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:148:0x0472, code lost:
                    r4 = r5;
                    r5 = r6;
                    r6 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:149:0x0475, code lost:
                    r15 = XH.C16807N.f139792a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:150:0x0477, code lost:
                    r1.d((java.lang.Object) null);
                    r7 = r5;
                    r1 = r6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:153:0x0481, code lost:
                    r1 = r15;
                    r7 = r4;
                    r4 = r5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:155:0x048c, code lost:
                    if (D4.G.i.c.a.C0528a.f34058a[r4.ordinal()] != 1) goto L_0x0492;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:156:0x048e, code lost:
                    r2 = r1;
                    r15 = null;
                    r5 = r4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:157:0x0492, code lost:
                    r5 = D4.G.k(r1);
                    r15 = r5.f34103b;
                    r14.f34059c = r1;
                    r14.f34060d = r7;
                    r14.f34061e = r4;
                    r14.f34062f = r5;
                    r14.f34063g = r15;
                    r14.f34064h = r4;
                    r14.f34065i = r1;
                    r14.f34069m = 14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:158:0x04b0, code lost:
                    if (r15.e((java.lang.Object) null, r14) != r0) goto L_0x04b3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:159:0x04b2, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:160:0x04b3, code lost:
                    r8 = r1;
                    r2 = r4;
                    r6 = r2;
                    r4 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
                    r15 = r5.f34104c.k().get(r6);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:163:0x04c5, code lost:
                    r4.d((java.lang.Object) null);
                    r5 = r2;
                    r4 = r6;
                    r2 = r1;
                    r1 = r8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:164:0x04cc, code lost:
                    r14.f34059c = r1;
                    r14.f34060d = r7;
                    r14.f34061e = r4;
                    r14.f34062f = null;
                    r14.f34063g = null;
                    r14.f34064h = null;
                    r14.f34065i = null;
                    r14.f34069m = 15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:165:0x04e2, code lost:
                    if (D4.G.l(r2, r5, r15, r14) != r0) goto L_0x04e5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:166:0x04e4, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:167:0x04e5, code lost:
                    r2 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:169:0x04e8, code lost:
                    if (r4 != D4.C6449x.REFRESH) goto L_0x052b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:170:0x04ea, code lost:
                    r15 = D4.G.k(r1);
                    r4 = r15.f34103b;
                    r14.f34059c = r1;
                    r14.f34060d = r2;
                    r14.f34061e = r15;
                    r14.f34062f = r4;
                    r14.f34069m = 16;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:171:0x0502, code lost:
                    if (r4.e((java.lang.Object) null, r14) != r0) goto L_0x0505;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:172:0x0504, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:173:0x0505, code lost:
                    r14 = r1;
                    r0 = r4;
                    r1 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
                    r15 = r1.f34104c.p().a(D4.C6449x.REFRESH);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:176:0x0516, code lost:
                    r0.d((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:177:0x051b, code lost:
                    if ((r15 instanceof D4.C6447v.a) != false) goto L_0x052b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:178:0x051d, code lost:
                    D4.G.n(r14, r2);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:179:0x0521, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:180:0x0522, code lost:
                    r0.d((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:181:0x0525, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:182:0x0526, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:183:0x0527, code lost:
                    r4.d((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:184:0x052a, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:186:0x052d, code lost:
                    return XH.C16807N.f139792a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:187:0x052e, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:188:0x052f, code lost:
                    r1.d((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:189:0x0532, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:39:0x01e3, code lost:
                    r15 = XH.C16807N.f139792a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:40:0x01e5, code lost:
                    r1.d((java.lang.Object) null);
                    r8 = r5;
                    r1 = r6;
                    r10 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
                    r15 = r5.f34104c;
                    r15 = XH.C16796C.a(r15.p().d(), r15.g(D4.G.e(r4).b()));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:50:0x0242, code lost:
                    r1.d((java.lang.Object) null);
                    r1 = (D4.C6448w) r15.a();
                    r15 = (D4.Q) r15.b();
                    r4 = r6.f34056a.w();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:51:0x0257, code lost:
                    if (r4 == null) goto L_0x025e;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:52:0x0259, code lost:
                    r4.e(r15);
                    r15 = XH.C16807N.f139792a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:53:0x025e, code lost:
                    r15 = r6.f34056a;
                    r4 = r6.f34057b;
                    r5 = D4.C6449x.REFRESH;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:54:0x026a, code lost:
                    if ((r1.f() instanceof D4.C6447v.a) == false) goto L_0x031b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:55:0x026c, code lost:
                    r10 = r1;
                    r8 = r4;
                    r4 = r5;
                    r1 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:57:0x0278, code lost:
                    if (D4.G.i.c.a.C0528a.f34058a[r4.ordinal()] != 1) goto L_0x027e;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:58:0x027a, code lost:
                    r5 = r1;
                    r15 = null;
                    r6 = r4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:59:0x027e, code lost:
                    r6 = D4.G.k(r1);
                    r5 = r6.f34103b;
                    r14.f34059c = r10;
                    r14.f34060d = r1;
                    r14.f34061e = r8;
                    r14.f34062f = r4;
                    r14.f34063g = r6;
                    r14.f34064h = r5;
                    r14.f34065i = r4;
                    r14.f34066j = r1;
                    r14.f34069m = 4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:60:0x029d, code lost:
                    if (r5.e((java.lang.Object) null, r14) != r0) goto L_0x02a0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:61:0x029f, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:62:0x02a0, code lost:
                    r9 = r1;
                    r7 = r4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
                    r15 = r6.f34104c.k().get(r7);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:65:0x02b0, code lost:
                    r5.d((java.lang.Object) null);
                    r5 = r1;
                    r6 = r4;
                    r4 = r7;
                    r1 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:66:0x02b7, code lost:
                    r14.f34059c = r10;
                    r14.f34060d = r1;
                    r14.f34061e = r8;
                    r14.f34062f = r4;
                    r14.f34063g = null;
                    r14.f34064h = null;
                    r14.f34065i = null;
                    r14.f34066j = null;
                    r14.f34069m = 5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:67:0x02ce, code lost:
                    if (D4.G.l(r5, r6, r15, r14) != r0) goto L_0x02d1;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d0, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:69:0x02d1, code lost:
                    r6 = r1;
                    r1 = r4;
                    r5 = r8;
                    r7 = r10;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:71:0x02d7, code lost:
                    if (r1 != D4.C6449x.REFRESH) goto L_0x030d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:72:0x02d9, code lost:
                    r4 = D4.G.k(r6);
                    r1 = r4.f34103b;
                    r14.f34059c = r7;
                    r14.f34060d = r6;
                    r14.f34061e = r5;
                    r14.f34062f = r4;
                    r14.f34063g = r1;
                    r14.f34069m = 6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:73:0x02f2, code lost:
                    if (r1.e((java.lang.Object) null, r14) != r0) goto L_0x02f5;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:74:0x02f4, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
                    r15 = r4.f34104c.p().a(D4.C6449x.REFRESH);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:77:0x0303, code lost:
                    r1.d((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:78:0x0308, code lost:
                    if ((r15 instanceof D4.C6447v.a) != false) goto L_0x030d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:79:0x030a, code lost:
                    D4.G.n(r6, r5);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:80:0x030d, code lost:
                    r4 = r5;
                    r15 = r6;
                    r1 = r7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:81:0x0311, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:82:0x0312, code lost:
                    r1.d((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:83:0x0315, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:84:0x0316, code lost:
                    r14 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:85:0x0317, code lost:
                    r5.d((java.lang.Object) null);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:86:0x031a, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:87:0x031b, code lost:
                    r5 = D4.C6449x.PREPEND;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:88:0x0323, code lost:
                    if ((r1.e() instanceof D4.C6447v.a) == false) goto L_0x042a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:90:0x0327, code lost:
                    if (r5 == D4.C6449x.REFRESH) goto L_0x0378;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:91:0x0329, code lost:
                    r6 = D4.G.k(r15);
                    r7 = r6.f34103b;
                    r14.f34059c = r1;
                    r14.f34060d = r15;
                    r14.f34061e = r4;
                    r14.f34062f = r5;
                    r14.f34063g = r6;
                    r14.f34064h = r7;
                    r14.f34069m = 7;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:92:0x0344, code lost:
                    if (r7.e((java.lang.Object) null, r14) != r0) goto L_0x0347;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:93:0x0346, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:94:0x0347, code lost:
                    r11 = r7;
                    r7 = r1;
                    r1 = r11;
                    r12 = r6;
                    r6 = r4;
                    r4 = r12;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
                    r4 = r4.f34104c;
                    r14.f34059c = r7;
                    r14.f34060d = r15;
                    r14.f34061e = r6;
                    r14.f34062f = r5;
                    r14.f34063g = r1;
                    r14.f34064h = null;
                    r14.f34069m = 8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:97:0x0365, code lost:
                    if (D4.G.m(r15, r4, r5, r14) != r0) goto L_0x0368;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:98:0x0367, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:99:0x0368, code lost:
                    r4 = r5;
                    r5 = r6;
                    r6 = r15;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
                /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
                /* JADX WARNING: Removed duplicated region for block: B:18:0x00a9  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x00c2  */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x00da  */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x00ff  */
                /* JADX WARNING: Removed duplicated region for block: B:25:0x011b  */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x013a  */
                /* JADX WARNING: Removed duplicated region for block: B:27:0x0153  */
                /* JADX WARNING: Removed duplicated region for block: B:28:0x016b  */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x0190  */
                /* JADX WARNING: Removed duplicated region for block: B:33:0x01aa  */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x01f1  */
                /* JADX WARNING: Removed duplicated region for block: B:44:0x0205  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
                /* renamed from: c */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(XH.C16807N r14, dI.C17164e<? super XH.C16807N> r15) {
                    /*
                        r13 = this;
                        boolean r14 = r15 instanceof D4.G.i.c.a.b
                        if (r14 == 0) goto L_0x0013
                        r14 = r15
                        D4.G$i$c$a$b r14 = (D4.G.i.c.a.b) r14
                        int r0 = r14.f34069m
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r0 & r1
                        if (r2 == 0) goto L_0x0013
                        int r0 = r0 - r1
                        r14.f34069m = r0
                        goto L_0x0018
                    L_0x0013:
                        D4.G$i$c$a$b r14 = new D4.G$i$c$a$b
                        r14.<init>(r13, r15)
                    L_0x0018:
                        java.lang.Object r15 = r14.f34067k
                        java.lang.Object r0 = eI.C17187b.f()
                        int r1 = r14.f34069m
                        r2 = 1
                        r3 = 0
                        switch(r1) {
                            case 0: goto L_0x0205;
                            case 1: goto L_0x01f1;
                            case 2: goto L_0x01aa;
                            case 3: goto L_0x0190;
                            case 4: goto L_0x016b;
                            case 5: goto L_0x0153;
                            case 6: goto L_0x013a;
                            case 7: goto L_0x011b;
                            case 8: goto L_0x00ff;
                            case 9: goto L_0x00da;
                            case 10: goto L_0x00c2;
                            case 11: goto L_0x00a9;
                            case 12: goto L_0x008f;
                            case 13: goto L_0x0077;
                            case 14: goto L_0x0056;
                            case 15: goto L_0x0042;
                            case 16: goto L_0x002d;
                            default: goto L_0x0025;
                        }
                    L_0x0025:
                        java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                        java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                        r14.<init>(r15)
                        throw r14
                    L_0x002d:
                        java.lang.Object r0 = r14.f34062f
                        bK.a r0 = (bK.C17052a) r0
                        java.lang.Object r1 = r14.f34061e
                        D4.I$a r1 = (D4.I.a) r1
                        java.lang.Object r2 = r14.f34060d
                        QJ.Q r2 = (QJ.Q) r2
                        java.lang.Object r14 = r14.f34059c
                        D4.G r14 = (D4.G) r14
                        XH.y.b(r15)
                        goto L_0x0508
                    L_0x0042:
                        java.lang.Object r1 = r14.f34061e
                        D4.x r1 = (D4.C6449x) r1
                        java.lang.Object r2 = r14.f34060d
                        QJ.Q r2 = (QJ.Q) r2
                        java.lang.Object r4 = r14.f34059c
                        D4.G r4 = (D4.G) r4
                        XH.y.b(r15)
                        r11 = r4
                        r4 = r1
                        r1 = r11
                        goto L_0x04e6
                    L_0x0056:
                        java.lang.Object r1 = r14.f34065i
                        D4.G r1 = (D4.G) r1
                        java.lang.Object r2 = r14.f34064h
                        D4.x r2 = (D4.C6449x) r2
                        java.lang.Object r4 = r14.f34063g
                        bK.a r4 = (bK.C17052a) r4
                        java.lang.Object r5 = r14.f34062f
                        D4.I$a r5 = (D4.I.a) r5
                        java.lang.Object r6 = r14.f34061e
                        D4.x r6 = (D4.C6449x) r6
                        java.lang.Object r7 = r14.f34060d
                        QJ.Q r7 = (QJ.Q) r7
                        java.lang.Object r8 = r14.f34059c
                        D4.G r8 = (D4.G) r8
                        XH.y.b(r15)
                        goto L_0x04b7
                    L_0x0077:
                        java.lang.Object r1 = r14.f34062f
                        bK.a r1 = (bK.C17052a) r1
                        java.lang.Object r4 = r14.f34061e
                        D4.x r4 = (D4.C6449x) r4
                        java.lang.Object r5 = r14.f34060d
                        QJ.Q r5 = (QJ.Q) r5
                        java.lang.Object r6 = r14.f34059c
                        D4.G r6 = (D4.G) r6
                        XH.y.b(r15)     // Catch:{ all -> 0x008c }
                        goto L_0x0475
                    L_0x008c:
                        r14 = move-exception
                        goto L_0x047d
                    L_0x008f:
                        java.lang.Object r1 = r14.f34063g
                        bK.a r1 = (bK.C17052a) r1
                        java.lang.Object r4 = r14.f34062f
                        D4.I$a r4 = (D4.I.a) r4
                        java.lang.Object r5 = r14.f34061e
                        D4.x r5 = (D4.C6449x) r5
                        java.lang.Object r6 = r14.f34060d
                        QJ.Q r6 = (QJ.Q) r6
                        java.lang.Object r7 = r14.f34059c
                        D4.G r7 = (D4.G) r7
                        XH.y.b(r15)
                        r15 = r7
                        goto L_0x0459
                    L_0x00a9:
                        java.lang.Object r1 = r14.f34063g
                        bK.a r1 = (bK.C17052a) r1
                        java.lang.Object r4 = r14.f34062f
                        D4.I$a r4 = (D4.I.a) r4
                        java.lang.Object r5 = r14.f34061e
                        QJ.Q r5 = (QJ.Q) r5
                        java.lang.Object r6 = r14.f34060d
                        D4.G r6 = (D4.G) r6
                        java.lang.Object r7 = r14.f34059c
                        D4.w r7 = (D4.C6448w) r7
                        XH.y.b(r15)
                        goto L_0x0404
                    L_0x00c2:
                        java.lang.Object r1 = r14.f34062f
                        D4.x r1 = (D4.C6449x) r1
                        java.lang.Object r4 = r14.f34061e
                        QJ.Q r4 = (QJ.Q) r4
                        java.lang.Object r5 = r14.f34060d
                        D4.G r5 = (D4.G) r5
                        java.lang.Object r6 = r14.f34059c
                        D4.w r6 = (D4.C6448w) r6
                        XH.y.b(r15)
                        r7 = r6
                        r6 = r5
                        r5 = r4
                        goto L_0x03e3
                    L_0x00da:
                        java.lang.Object r1 = r14.f34066j
                        D4.G r1 = (D4.G) r1
                        java.lang.Object r4 = r14.f34065i
                        D4.x r4 = (D4.C6449x) r4
                        java.lang.Object r5 = r14.f34064h
                        bK.a r5 = (bK.C17052a) r5
                        java.lang.Object r6 = r14.f34063g
                        D4.I$a r6 = (D4.I.a) r6
                        java.lang.Object r7 = r14.f34062f
                        D4.x r7 = (D4.C6449x) r7
                        java.lang.Object r8 = r14.f34061e
                        QJ.Q r8 = (QJ.Q) r8
                        java.lang.Object r9 = r14.f34060d
                        D4.G r9 = (D4.G) r9
                        java.lang.Object r10 = r14.f34059c
                        D4.w r10 = (D4.C6448w) r10
                        XH.y.b(r15)
                        goto L_0x03af
                    L_0x00ff:
                        java.lang.Object r1 = r14.f34063g
                        bK.a r1 = (bK.C17052a) r1
                        java.lang.Object r4 = r14.f34062f
                        D4.x r4 = (D4.C6449x) r4
                        java.lang.Object r5 = r14.f34061e
                        QJ.Q r5 = (QJ.Q) r5
                        java.lang.Object r6 = r14.f34060d
                        D4.G r6 = (D4.G) r6
                        java.lang.Object r7 = r14.f34059c
                        D4.w r7 = (D4.C6448w) r7
                        XH.y.b(r15)     // Catch:{ all -> 0x0118 }
                        goto L_0x036b
                    L_0x0118:
                        r14 = move-exception
                        goto L_0x0374
                    L_0x011b:
                        java.lang.Object r1 = r14.f34064h
                        bK.a r1 = (bK.C17052a) r1
                        java.lang.Object r4 = r14.f34063g
                        D4.I$a r4 = (D4.I.a) r4
                        java.lang.Object r5 = r14.f34062f
                        D4.x r5 = (D4.C6449x) r5
                        java.lang.Object r6 = r14.f34061e
                        QJ.Q r6 = (QJ.Q) r6
                        java.lang.Object r7 = r14.f34060d
                        D4.G r7 = (D4.G) r7
                        java.lang.Object r8 = r14.f34059c
                        D4.w r8 = (D4.C6448w) r8
                        XH.y.b(r15)
                        r15 = r7
                        r7 = r8
                        goto L_0x034d
                    L_0x013a:
                        java.lang.Object r1 = r14.f34063g
                        bK.a r1 = (bK.C17052a) r1
                        java.lang.Object r4 = r14.f34062f
                        D4.I$a r4 = (D4.I.a) r4
                        java.lang.Object r5 = r14.f34061e
                        QJ.Q r5 = (QJ.Q) r5
                        java.lang.Object r6 = r14.f34060d
                        D4.G r6 = (D4.G) r6
                        java.lang.Object r7 = r14.f34059c
                        D4.w r7 = (D4.C6448w) r7
                        XH.y.b(r15)
                        goto L_0x02f5
                    L_0x0153:
                        java.lang.Object r1 = r14.f34062f
                        D4.x r1 = (D4.C6449x) r1
                        java.lang.Object r4 = r14.f34061e
                        QJ.Q r4 = (QJ.Q) r4
                        java.lang.Object r5 = r14.f34060d
                        D4.G r5 = (D4.G) r5
                        java.lang.Object r6 = r14.f34059c
                        D4.w r6 = (D4.C6448w) r6
                        XH.y.b(r15)
                        r7 = r6
                        r6 = r5
                        r5 = r4
                        goto L_0x02d5
                    L_0x016b:
                        java.lang.Object r1 = r14.f34066j
                        D4.G r1 = (D4.G) r1
                        java.lang.Object r4 = r14.f34065i
                        D4.x r4 = (D4.C6449x) r4
                        java.lang.Object r5 = r14.f34064h
                        bK.a r5 = (bK.C17052a) r5
                        java.lang.Object r6 = r14.f34063g
                        D4.I$a r6 = (D4.I.a) r6
                        java.lang.Object r7 = r14.f34062f
                        D4.x r7 = (D4.C6449x) r7
                        java.lang.Object r8 = r14.f34061e
                        QJ.Q r8 = (QJ.Q) r8
                        java.lang.Object r9 = r14.f34060d
                        D4.G r9 = (D4.G) r9
                        java.lang.Object r10 = r14.f34059c
                        D4.w r10 = (D4.C6448w) r10
                        XH.y.b(r15)
                        goto L_0x02a2
                    L_0x0190:
                        java.lang.Object r1 = r14.f34063g
                        bK.a r1 = (bK.C17052a) r1
                        java.lang.Object r4 = r14.f34062f
                        D4.x r4 = (D4.C6449x) r4
                        java.lang.Object r5 = r14.f34061e
                        QJ.Q r5 = (QJ.Q) r5
                        java.lang.Object r6 = r14.f34060d
                        D4.G r6 = (D4.G) r6
                        java.lang.Object r7 = r14.f34059c
                        D4.w r7 = (D4.C6448w) r7
                        XH.y.b(r15)     // Catch:{ all -> 0x01a8 }
                        goto L_0x01e3
                    L_0x01a8:
                        r14 = move-exception
                        goto L_0x01ed
                    L_0x01aa:
                        java.lang.Object r1 = r14.f34064h
                        bK.a r1 = (bK.C17052a) r1
                        java.lang.Object r4 = r14.f34063g
                        D4.I$a r4 = (D4.I.a) r4
                        java.lang.Object r5 = r14.f34062f
                        D4.x r5 = (D4.C6449x) r5
                        java.lang.Object r6 = r14.f34061e
                        QJ.Q r6 = (QJ.Q) r6
                        java.lang.Object r7 = r14.f34060d
                        D4.G r7 = (D4.G) r7
                        java.lang.Object r8 = r14.f34059c
                        D4.w r8 = (D4.C6448w) r8
                        XH.y.b(r15)
                        D4.I r15 = r4.f34104c     // Catch:{ all -> 0x01a8 }
                        r14.f34059c = r8     // Catch:{ all -> 0x01a8 }
                        r14.f34060d = r7     // Catch:{ all -> 0x01a8 }
                        r14.f34061e = r6     // Catch:{ all -> 0x01a8 }
                        r14.f34062f = r5     // Catch:{ all -> 0x01a8 }
                        r14.f34063g = r1     // Catch:{ all -> 0x01a8 }
                        r14.f34064h = r3     // Catch:{ all -> 0x01a8 }
                        r4 = 3
                        r14.f34069m = r4     // Catch:{ all -> 0x01a8 }
                        java.lang.Object r15 = r7.C(r15, r5, r14)     // Catch:{ all -> 0x01a8 }
                        if (r15 != r0) goto L_0x01df
                        return r0
                    L_0x01df:
                        r4 = r5
                        r5 = r6
                        r6 = r7
                        r7 = r8
                    L_0x01e3:
                        XH.N r15 = XH.C16807N.f139792a     // Catch:{ all -> 0x01a8 }
                        r1.d(r3)
                        r8 = r5
                        r1 = r6
                        r10 = r7
                        goto L_0x0270
                    L_0x01ed:
                        r1.d(r3)
                        throw r14
                    L_0x01f1:
                        java.lang.Object r1 = r14.f34062f
                        bK.a r1 = (bK.C17052a) r1
                        java.lang.Object r4 = r14.f34061e
                        D4.G r4 = (D4.G) r4
                        java.lang.Object r5 = r14.f34060d
                        D4.I$a r5 = (D4.I.a) r5
                        java.lang.Object r6 = r14.f34059c
                        D4.G$i$c$a r6 = (D4.G.i.c.a) r6
                        XH.y.b(r15)
                        goto L_0x0226
                    L_0x0205:
                        XH.y.b(r15)
                        D4.G<Key, Value> r15 = r13.f34056a
                        D4.I$a r5 = r15.f33982k
                        D4.G<Key, Value> r4 = r13.f34056a
                        bK.a r1 = r5.f34103b
                        r14.f34059c = r13
                        r14.f34060d = r5
                        r14.f34061e = r4
                        r14.f34062f = r1
                        r14.f34069m = r2
                        java.lang.Object r15 = r1.e(r3, r14)
                        if (r15 != r0) goto L_0x0225
                        return r0
                    L_0x0225:
                        r6 = r13
                    L_0x0226:
                        D4.I r15 = r5.f34104c     // Catch:{ all -> 0x052e }
                        D4.C r5 = r15.p()     // Catch:{ all -> 0x052e }
                        D4.w r5 = r5.d()     // Catch:{ all -> 0x052e }
                        D4.o r4 = r4.f33979h     // Catch:{ all -> 0x052e }
                        D4.d0$a r4 = r4.b()     // Catch:{ all -> 0x052e }
                        D4.Q r15 = r15.g(r4)     // Catch:{ all -> 0x052e }
                        XH.v r15 = XH.C16796C.a(r5, r15)     // Catch:{ all -> 0x052e }
                        r1.d(r3)
                        java.lang.Object r1 = r15.a()
                        D4.w r1 = (D4.C6448w) r1
                        java.lang.Object r15 = r15.b()
                        D4.Q r15 = (D4.Q) r15
                        D4.G<Key, Value> r4 = r6.f34056a
                        D4.U r4 = r4.w()
                        if (r4 == 0) goto L_0x025e
                        r4.e(r15)
                        XH.N r15 = XH.C16807N.f139792a
                    L_0x025e:
                        D4.G<Key, Value> r15 = r6.f34056a
                        QJ.Q r4 = r6.f34057b
                        D4.x r5 = D4.C6449x.REFRESH
                        D4.v r6 = r1.f()
                        boolean r6 = r6 instanceof D4.C6447v.a
                        if (r6 == 0) goto L_0x031b
                        r10 = r1
                        r8 = r4
                        r4 = r5
                        r1 = r15
                    L_0x0270:
                        int[] r15 = D4.G.i.c.a.C0528a.f34058a
                        int r5 = r4.ordinal()
                        r15 = r15[r5]
                        if (r15 != r2) goto L_0x027e
                        r5 = r1
                        r15 = r3
                        r6 = r4
                        goto L_0x02b7
                    L_0x027e:
                        D4.I$a r6 = r1.f33982k
                        bK.a r5 = r6.f34103b
                        r14.f34059c = r10
                        r14.f34060d = r1
                        r14.f34061e = r8
                        r14.f34062f = r4
                        r14.f34063g = r6
                        r14.f34064h = r5
                        r14.f34065i = r4
                        r14.f34066j = r1
                        r15 = 4
                        r14.f34069m = r15
                        java.lang.Object r15 = r5.e(r3, r14)
                        if (r15 != r0) goto L_0x02a0
                        return r0
                    L_0x02a0:
                        r9 = r1
                        r7 = r4
                    L_0x02a2:
                        D4.I r15 = r6.f34104c     // Catch:{ all -> 0x0316 }
                        java.util.Map r15 = r15.k()     // Catch:{ all -> 0x0316 }
                        java.lang.Object r15 = r15.get(r7)     // Catch:{ all -> 0x0316 }
                        D4.d0 r15 = (D4.d0) r15     // Catch:{ all -> 0x0316 }
                        r5.d(r3)
                        r5 = r1
                        r6 = r4
                        r4 = r7
                        r1 = r9
                    L_0x02b7:
                        r14.f34059c = r10
                        r14.f34060d = r1
                        r14.f34061e = r8
                        r14.f34062f = r4
                        r14.f34063g = r3
                        r14.f34064h = r3
                        r14.f34065i = r3
                        r14.f34066j = r3
                        r7 = 5
                        r14.f34069m = r7
                        java.lang.Object r15 = r5.A(r6, r15, r14)
                        if (r15 != r0) goto L_0x02d1
                        return r0
                    L_0x02d1:
                        r6 = r1
                        r1 = r4
                        r5 = r8
                        r7 = r10
                    L_0x02d5:
                        D4.x r15 = D4.C6449x.REFRESH
                        if (r1 != r15) goto L_0x030d
                        D4.I$a r4 = r6.f33982k
                        bK.a r1 = r4.f34103b
                        r14.f34059c = r7
                        r14.f34060d = r6
                        r14.f34061e = r5
                        r14.f34062f = r4
                        r14.f34063g = r1
                        r15 = 6
                        r14.f34069m = r15
                        java.lang.Object r15 = r1.e(r3, r14)
                        if (r15 != r0) goto L_0x02f5
                        return r0
                    L_0x02f5:
                        D4.I r15 = r4.f34104c     // Catch:{ all -> 0x0311 }
                        D4.C r15 = r15.p()     // Catch:{ all -> 0x0311 }
                        D4.x r4 = D4.C6449x.REFRESH     // Catch:{ all -> 0x0311 }
                        D4.v r15 = r15.a(r4)     // Catch:{ all -> 0x0311 }
                        r1.d(r3)
                        boolean r15 = r15 instanceof D4.C6447v.a
                        if (r15 != 0) goto L_0x030d
                        r6.D(r5)
                    L_0x030d:
                        r4 = r5
                        r15 = r6
                        r1 = r7
                        goto L_0x031b
                    L_0x0311:
                        r14 = move-exception
                        r1.d(r3)
                        throw r14
                    L_0x0316:
                        r14 = move-exception
                        r5.d(r3)
                        throw r14
                    L_0x031b:
                        D4.x r5 = D4.C6449x.PREPEND
                        D4.v r6 = r1.e()
                        boolean r6 = r6 instanceof D4.C6447v.a
                        if (r6 == 0) goto L_0x042a
                        D4.x r6 = D4.C6449x.REFRESH
                        if (r5 == r6) goto L_0x0378
                        D4.I$a r6 = r15.f33982k
                        bK.a r7 = r6.f34103b
                        r14.f34059c = r1
                        r14.f34060d = r15
                        r14.f34061e = r4
                        r14.f34062f = r5
                        r14.f34063g = r6
                        r14.f34064h = r7
                        r8 = 7
                        r14.f34069m = r8
                        java.lang.Object r8 = r7.e(r3, r14)
                        if (r8 != r0) goto L_0x0347
                        return r0
                    L_0x0347:
                        r11 = r7
                        r7 = r1
                        r1 = r11
                        r12 = r6
                        r6 = r4
                        r4 = r12
                    L_0x034d:
                        D4.I r4 = r4.f34104c     // Catch:{ all -> 0x0118 }
                        r14.f34059c = r7     // Catch:{ all -> 0x0118 }
                        r14.f34060d = r15     // Catch:{ all -> 0x0118 }
                        r14.f34061e = r6     // Catch:{ all -> 0x0118 }
                        r14.f34062f = r5     // Catch:{ all -> 0x0118 }
                        r14.f34063g = r1     // Catch:{ all -> 0x0118 }
                        r14.f34064h = r3     // Catch:{ all -> 0x0118 }
                        r8 = 8
                        r14.f34069m = r8     // Catch:{ all -> 0x0118 }
                        java.lang.Object r4 = r15.C(r4, r5, r14)     // Catch:{ all -> 0x0118 }
                        if (r4 != r0) goto L_0x0368
                        return r0
                    L_0x0368:
                        r4 = r5
                        r5 = r6
                        r6 = r15
                    L_0x036b:
                        XH.N r15 = XH.C16807N.f139792a     // Catch:{ all -> 0x0118 }
                        r1.d(r3)
                        r8 = r5
                        r1 = r6
                        r10 = r7
                        goto L_0x037c
                    L_0x0374:
                        r1.d(r3)
                        throw r14
                    L_0x0378:
                        r10 = r1
                        r8 = r4
                        r4 = r5
                        r1 = r15
                    L_0x037c:
                        int[] r15 = D4.G.i.c.a.C0528a.f34058a
                        int r5 = r4.ordinal()
                        r15 = r15[r5]
                        if (r15 != r2) goto L_0x038a
                        r5 = r1
                        r15 = r3
                        r6 = r4
                        goto L_0x03c4
                    L_0x038a:
                        D4.I$a r6 = r1.f33982k
                        bK.a r5 = r6.f34103b
                        r14.f34059c = r10
                        r14.f34060d = r1
                        r14.f34061e = r8
                        r14.f34062f = r4
                        r14.f34063g = r6
                        r14.f34064h = r5
                        r14.f34065i = r4
                        r14.f34066j = r1
                        r15 = 9
                        r14.f34069m = r15
                        java.lang.Object r15 = r5.e(r3, r14)
                        if (r15 != r0) goto L_0x03ad
                        return r0
                    L_0x03ad:
                        r9 = r1
                        r7 = r4
                    L_0x03af:
                        D4.I r15 = r6.f34104c     // Catch:{ all -> 0x0425 }
                        java.util.Map r15 = r15.k()     // Catch:{ all -> 0x0425 }
                        java.lang.Object r15 = r15.get(r7)     // Catch:{ all -> 0x0425 }
                        D4.d0 r15 = (D4.d0) r15     // Catch:{ all -> 0x0425 }
                        r5.d(r3)
                        r5 = r1
                        r6 = r4
                        r4 = r7
                        r1 = r9
                    L_0x03c4:
                        r14.f34059c = r10
                        r14.f34060d = r1
                        r14.f34061e = r8
                        r14.f34062f = r4
                        r14.f34063g = r3
                        r14.f34064h = r3
                        r14.f34065i = r3
                        r14.f34066j = r3
                        r7 = 10
                        r14.f34069m = r7
                        java.lang.Object r15 = r5.A(r6, r15, r14)
                        if (r15 != r0) goto L_0x03df
                        return r0
                    L_0x03df:
                        r6 = r1
                        r1 = r4
                        r5 = r8
                        r7 = r10
                    L_0x03e3:
                        D4.x r15 = D4.C6449x.REFRESH
                        if (r1 != r15) goto L_0x041c
                        D4.I$a r4 = r6.f33982k
                        bK.a r1 = r4.f34103b
                        r14.f34059c = r7
                        r14.f34060d = r6
                        r14.f34061e = r5
                        r14.f34062f = r4
                        r14.f34063g = r1
                        r15 = 11
                        r14.f34069m = r15
                        java.lang.Object r15 = r1.e(r3, r14)
                        if (r15 != r0) goto L_0x0404
                        return r0
                    L_0x0404:
                        D4.I r15 = r4.f34104c     // Catch:{ all -> 0x0420 }
                        D4.C r15 = r15.p()     // Catch:{ all -> 0x0420 }
                        D4.x r4 = D4.C6449x.REFRESH     // Catch:{ all -> 0x0420 }
                        D4.v r15 = r15.a(r4)     // Catch:{ all -> 0x0420 }
                        r1.d(r3)
                        boolean r15 = r15 instanceof D4.C6447v.a
                        if (r15 != 0) goto L_0x041c
                        r6.D(r5)
                    L_0x041c:
                        r4 = r5
                        r15 = r6
                        r1 = r7
                        goto L_0x042a
                    L_0x0420:
                        r14 = move-exception
                        r1.d(r3)
                        throw r14
                    L_0x0425:
                        r14 = move-exception
                        r5.d(r3)
                        throw r14
                    L_0x042a:
                        D4.x r5 = D4.C6449x.APPEND
                        D4.v r1 = r1.d()
                        boolean r1 = r1 instanceof D4.C6447v.a
                        if (r1 == 0) goto L_0x052b
                        D4.x r1 = D4.C6449x.REFRESH
                        if (r5 == r1) goto L_0x0481
                        D4.I$a r1 = r15.f33982k
                        bK.a r6 = r1.f34103b
                        r14.f34059c = r15
                        r14.f34060d = r4
                        r14.f34061e = r5
                        r14.f34062f = r1
                        r14.f34063g = r6
                        r7 = 12
                        r14.f34069m = r7
                        java.lang.Object r7 = r6.e(r3, r14)
                        if (r7 != r0) goto L_0x0455
                        return r0
                    L_0x0455:
                        r11 = r4
                        r4 = r1
                        r1 = r6
                        r6 = r11
                    L_0x0459:
                        D4.I r4 = r4.f34104c     // Catch:{ all -> 0x008c }
                        r14.f34059c = r15     // Catch:{ all -> 0x008c }
                        r14.f34060d = r6     // Catch:{ all -> 0x008c }
                        r14.f34061e = r5     // Catch:{ all -> 0x008c }
                        r14.f34062f = r1     // Catch:{ all -> 0x008c }
                        r14.f34063g = r3     // Catch:{ all -> 0x008c }
                        r7 = 13
                        r14.f34069m = r7     // Catch:{ all -> 0x008c }
                        java.lang.Object r4 = r15.C(r4, r5, r14)     // Catch:{ all -> 0x008c }
                        if (r4 != r0) goto L_0x0472
                        return r0
                    L_0x0472:
                        r4 = r5
                        r5 = r6
                        r6 = r15
                    L_0x0475:
                        XH.N r15 = XH.C16807N.f139792a     // Catch:{ all -> 0x008c }
                        r1.d(r3)
                        r7 = r5
                        r1 = r6
                        goto L_0x0484
                    L_0x047d:
                        r1.d(r3)
                        throw r14
                    L_0x0481:
                        r1 = r15
                        r7 = r4
                        r4 = r5
                    L_0x0484:
                        int[] r15 = D4.G.i.c.a.C0528a.f34058a
                        int r5 = r4.ordinal()
                        r15 = r15[r5]
                        if (r15 != r2) goto L_0x0492
                        r2 = r1
                        r15 = r3
                        r5 = r4
                        goto L_0x04cc
                    L_0x0492:
                        D4.I$a r5 = r1.f33982k
                        bK.a r15 = r5.f34103b
                        r14.f34059c = r1
                        r14.f34060d = r7
                        r14.f34061e = r4
                        r14.f34062f = r5
                        r14.f34063g = r15
                        r14.f34064h = r4
                        r14.f34065i = r1
                        r2 = 14
                        r14.f34069m = r2
                        java.lang.Object r2 = r15.e(r3, r14)
                        if (r2 != r0) goto L_0x04b3
                        return r0
                    L_0x04b3:
                        r8 = r1
                        r2 = r4
                        r6 = r2
                        r4 = r15
                    L_0x04b7:
                        D4.I r15 = r5.f34104c     // Catch:{ all -> 0x0526 }
                        java.util.Map r15 = r15.k()     // Catch:{ all -> 0x0526 }
                        java.lang.Object r15 = r15.get(r6)     // Catch:{ all -> 0x0526 }
                        D4.d0 r15 = (D4.d0) r15     // Catch:{ all -> 0x0526 }
                        r4.d(r3)
                        r5 = r2
                        r4 = r6
                        r2 = r1
                        r1 = r8
                    L_0x04cc:
                        r14.f34059c = r1
                        r14.f34060d = r7
                        r14.f34061e = r4
                        r14.f34062f = r3
                        r14.f34063g = r3
                        r14.f34064h = r3
                        r14.f34065i = r3
                        r6 = 15
                        r14.f34069m = r6
                        java.lang.Object r15 = r2.A(r5, r15, r14)
                        if (r15 != r0) goto L_0x04e5
                        return r0
                    L_0x04e5:
                        r2 = r7
                    L_0x04e6:
                        D4.x r15 = D4.C6449x.REFRESH
                        if (r4 != r15) goto L_0x052b
                        D4.I$a r15 = r1.f33982k
                        bK.a r4 = r15.f34103b
                        r14.f34059c = r1
                        r14.f34060d = r2
                        r14.f34061e = r15
                        r14.f34062f = r4
                        r5 = 16
                        r14.f34069m = r5
                        java.lang.Object r14 = r4.e(r3, r14)
                        if (r14 != r0) goto L_0x0505
                        return r0
                    L_0x0505:
                        r14 = r1
                        r0 = r4
                        r1 = r15
                    L_0x0508:
                        D4.I r15 = r1.f34104c     // Catch:{ all -> 0x0521 }
                        D4.C r15 = r15.p()     // Catch:{ all -> 0x0521 }
                        D4.x r1 = D4.C6449x.REFRESH     // Catch:{ all -> 0x0521 }
                        D4.v r15 = r15.a(r1)     // Catch:{ all -> 0x0521 }
                        r0.d(r3)
                        boolean r15 = r15 instanceof D4.C6447v.a
                        if (r15 != 0) goto L_0x052b
                        r14.D(r2)
                        goto L_0x052b
                    L_0x0521:
                        r14 = move-exception
                        r0.d(r3)
                        throw r14
                    L_0x0526:
                        r14 = move-exception
                        r4.d(r3)
                        throw r14
                    L_0x052b:
                        XH.N r14 = XH.C16807N.f139792a
                        return r14
                    L_0x052e:
                        r14 = move-exception
                        r1.d(r3)
                        throw r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: D4.G.i.c.a.emit(XH.N, dI.e):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C16434j<C16807N> jVar, G<Key, Value> g10, C17164e<? super c> eVar) {
                super(2, eVar);
                this.f34054e = jVar;
                this.f34055f = g10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                c cVar = new c(this.f34054e, this.f34055f, eVar);
                cVar.f34053d = obj;
                return cVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f34052c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g<T> p10 = C16534i.p(this.f34054e);
                    a aVar = new a(this.f34055f, (Q) this.f34053d);
                    this.f34052c = 1;
                    if (p10.collect(aVar, this) == f10) {
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
        i(G<Key, Value> g10, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f34040h = g10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f34040h, eVar);
            iVar.f34039g = obj;
            return iVar;
        }

        /* renamed from: i */
        public final Object invoke(W<E<Value>> w10, C17164e<? super C16807N> eVar) {
            return ((i) create(w10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00dc A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x010d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f34038f
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0049
                if (r1 == r4) goto L_0x0035
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r14.f34036d
                bK.a r0 = (bK.C17052a) r0
                java.lang.Object r1 = r14.f34035c
                D4.I$a r1 = (D4.I.a) r1
                java.lang.Object r2 = r14.f34039g
                D4.W r2 = (D4.W) r2
                XH.y.b(r15)
                goto L_0x00f8
            L_0x0023:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x002b:
                java.lang.Object r1 = r14.f34039g
                D4.W r1 = (D4.W) r1
                XH.y.b(r15)
                r15 = r1
                goto L_0x00dd
            L_0x0035:
                java.lang.Object r1 = r14.f34037e
                bK.a r1 = (bK.C17052a) r1
                java.lang.Object r4 = r14.f34036d
                D4.I$a r4 = (D4.I.a) r4
                java.lang.Object r6 = r14.f34035c
                D4.U r6 = (D4.U) r6
                java.lang.Object r7 = r14.f34039g
                D4.W r7 = (D4.W) r7
                XH.y.b(r15)
                goto L_0x00b3
            L_0x0049:
                XH.y.b(r15)
                java.lang.Object r15 = r14.f34039g
                D4.W r15 = (D4.W) r15
                D4.G<Key, Value> r1 = r14.f34040h
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.f33980i
                r12 = 0
                boolean r1 = r1.compareAndSet(r12, r4)
                if (r1 == 0) goto L_0x011a
                D4.G$i$a r9 = new D4.G$i$a
                D4.G<Key, Value> r1 = r14.f34040h
                r9.<init>(r1, r15, r5)
                r10 = 3
                r11 = 0
                r7 = 0
                r8 = 0
                r6 = r15
                QJ.F0 unused = QJ.C16314k.d(r6, r7, r8, r9, r10, r11)
                r1 = 6
                SJ.j r1 = SJ.C16437m.b(r12, r5, r5, r1, r5)
                D4.G$i$b r9 = new D4.G$i$b
                D4.G<Key, Value> r6 = r14.f34040h
                r9.<init>(r6, r1, r5)
                r6 = r15
                QJ.F0 unused = QJ.C16314k.d(r6, r7, r8, r9, r10, r11)
                D4.G$i$c r9 = new D4.G$i$c
                D4.G<Key, Value> r6 = r14.f34040h
                r9.<init>(r1, r6, r5)
                r6 = r15
                QJ.F0 unused = QJ.C16314k.d(r6, r7, r8, r9, r10, r11)
                D4.G<Key, Value> r1 = r14.f34040h
                D4.U r6 = r1.w()
                if (r6 == 0) goto L_0x00ca
                D4.G<Key, Value> r1 = r14.f34040h
                D4.Q r7 = r1.f33977f
                if (r7 != 0) goto L_0x00c7
                D4.I$a r1 = r1.f33982k
                bK.a r7 = r1.f34103b
                r14.f34039g = r15
                r14.f34035c = r6
                r14.f34036d = r1
                r14.f34037e = r7
                r14.f34038f = r4
                java.lang.Object r4 = r7.e(r5, r14)
                if (r4 != r0) goto L_0x00b0
                return r0
            L_0x00b0:
                r4 = r1
                r1 = r7
                r7 = r15
            L_0x00b3:
                D4.I r15 = r4.f34104c     // Catch:{ all -> 0x00c2 }
                D4.Q r15 = r15.g(r5)     // Catch:{ all -> 0x00c2 }
                r1.d(r5)
                r13 = r7
                r7 = r15
                r15 = r13
                goto L_0x00c7
            L_0x00c2:
                r15 = move-exception
                r1.d(r5)
                throw r15
            L_0x00c7:
                r6.b(r7)
            L_0x00ca:
                D4.G<Key, Value> r1 = r14.f34040h
                r14.f34039g = r15
                r14.f34035c = r5
                r14.f34036d = r5
                r14.f34037e = r5
                r14.f34038f = r3
                java.lang.Object r1 = r1.s(r14)
                if (r1 != r0) goto L_0x00dd
                return r0
            L_0x00dd:
                D4.G<Key, Value> r1 = r14.f34040h
                D4.I$a r1 = r1.f33982k
                bK.a r3 = r1.f34103b
                r14.f34039g = r15
                r14.f34035c = r1
                r14.f34036d = r3
                r14.f34038f = r2
                java.lang.Object r2 = r3.e(r5, r14)
                if (r2 != r0) goto L_0x00f6
                return r0
            L_0x00f6:
                r2 = r15
                r0 = r3
            L_0x00f8:
                D4.I r15 = r1.f34104c     // Catch:{ all -> 0x0115 }
                D4.C r15 = r15.p()     // Catch:{ all -> 0x0115 }
                D4.x r1 = D4.C6449x.REFRESH     // Catch:{ all -> 0x0115 }
                D4.v r15 = r15.a(r1)     // Catch:{ all -> 0x0115 }
                r0.d(r5)
                boolean r15 = r15 instanceof D4.C6447v.a
                if (r15 != 0) goto L_0x0112
                D4.G<Key, Value> r15 = r14.f34040h
                r15.D(r2)
            L_0x0112:
                XH.N r15 = XH.C16807N.f139792a
                return r15
            L_0x0115:
                r15 = move-exception
                r0.d(r5)
                throw r15
            L_0x011a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
                r15.<init>(r0)
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.G.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LTJ/h;", "LD4/E;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {645, 179}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super E<Value>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f34070c;

        /* renamed from: d  reason: collision with root package name */
        Object f34071d;

        /* renamed from: e  reason: collision with root package name */
        int f34072e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f34073f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ G<Key, Value> f34074g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(G<Key, Value> g10, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f34074g = g10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f34074g, eVar);
            jVar.f34073f = obj;
            return jVar;
        }

        public final Object invoke(C16533h<? super E<Value>> hVar, C17164e<? super C16807N> eVar) {
            return ((j) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX INFO: finally extract failed */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f34072e
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L_0x002b
                if (r1 == r2) goto L_0x001b
                if (r1 != r3) goto L_0x0013
                XH.y.b(r7)
                goto L_0x0070
            L_0x0013:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001b:
                java.lang.Object r1 = r6.f34071d
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r2 = r6.f34070c
                bK.a r2 = (bK.C17052a) r2
                java.lang.Object r5 = r6.f34073f
                D4.I$a r5 = (D4.I.a) r5
                XH.y.b(r7)
                goto L_0x004d
            L_0x002b:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f34073f
                r1 = r7
                TJ.h r1 = (TJ.C16533h) r1
                D4.G<Key, Value> r7 = r6.f34074g
                D4.I$a r5 = r7.f33982k
                bK.a r7 = r5.f34103b
                r6.f34073f = r5
                r6.f34070c = r7
                r6.f34071d = r1
                r6.f34072e = r2
                java.lang.Object r2 = r7.e(r4, r6)
                if (r2 != r0) goto L_0x004c
                return r0
            L_0x004c:
                r2 = r7
            L_0x004d:
                D4.I r7 = r5.f34104c     // Catch:{ all -> 0x0073 }
                D4.C r7 = r7.p()     // Catch:{ all -> 0x0073 }
                D4.w r7 = r7.d()     // Catch:{ all -> 0x0073 }
                r2.d(r4)
                D4.E$c r2 = new D4.E$c
                r2.<init>(r7, r4, r3, r4)
                r6.f34073f = r4
                r6.f34070c = r4
                r6.f34071d = r4
                r6.f34072e = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L_0x0070
                return r0
            L_0x0070:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            L_0x0073:
                r7 = move-exception
                r2.d(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.G.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", l = {220}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34075c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ G<Key, Value> f34076d;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LD4/d0;", "hint", "", "<anonymous>", "(LD4/d0;)Z"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<d0, C17164e<? super Boolean>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f34077c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f34078d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ G<Key, Value> f34079e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(G<Key, Value> g10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f34079e = g10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f34079e, eVar);
                aVar.f34078d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(d0 d0Var, C17164e<? super Boolean> eVar) {
                return ((a) create(d0Var, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f34077c == 0) {
                    y.b(obj);
                    d0 d0Var = (d0) this.f34078d;
                    return kotlin.coroutines.jvm.internal.b.a(d0Var.d() * -1 > this.f34079e.f33974c.f34126f || d0Var.c() * -1 > this.f34079e.f33974c.f34126f);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(G<Key, Value> g10, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f34076d = g10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f34076d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f34075c;
            if (i10 == 0) {
                y.b(obj);
                C16532g P10 = C16534i.P(this.f34076d.f33979h.c(C6449x.APPEND), this.f34076d.f33979h.c(C6449x.PREPEND));
                a aVar = new a(this.f34076d, (C17164e<? super a>) null);
                this.f34075c = 1;
                obj = C16534i.E(P10, aVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0 d0Var = (d0) obj;
            if (d0Var != null) {
                G<Key, Value> g10 = this.f34076d;
                C6450y a10 = C6451z.a();
                if (a10 != null && a10.b(3)) {
                    a10.a(3, "Jump triggered on PagingSource " + g10.v() + " by " + d0Var, (Throwable) null);
                }
                this.f34076d.f33978g.invoke();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", l = {645, 233}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f34080c;

        /* renamed from: d  reason: collision with root package name */
        Object f34081d;

        /* renamed from: e  reason: collision with root package name */
        Object f34082e;

        /* renamed from: f  reason: collision with root package name */
        int f34083f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ G<Key, Value> f34084g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(G<Key, Value> g10, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f34084g = g10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f34084g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX INFO: finally extract failed */
        public final Object invokeSuspend(Object obj) {
            I.a aVar;
            C17052a aVar2;
            G<Key, Value> g10;
            Object f10 = C17187b.f();
            int i10 = this.f34083f;
            if (i10 == 0) {
                y.b(obj);
                g10 = this.f34084g;
                aVar = g10.f33982k;
                C17052a a10 = aVar.f34103b;
                this.f34080c = aVar;
                this.f34081d = a10;
                this.f34082e = g10;
                this.f34083f = 1;
                if (a10.e((Object) null, this) == f10) {
                    return f10;
                }
                aVar2 = a10;
            } else if (i10 == 1) {
                g10 = (G) this.f34082e;
                aVar2 = (C17052a) this.f34081d;
                aVar = (I.a) this.f34080c;
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C16532g<Integer> f11 = aVar.f34104c.f();
                aVar2.d((Object) null);
                C6449x xVar = C6449x.PREPEND;
                this.f34080c = null;
                this.f34081d = null;
                this.f34082e = null;
                this.f34083f = 2;
                if (g10.q(f11, xVar, this) == f10) {
                    return f10;
                }
                return C16807N.f139792a;
            } catch (Throwable th2) {
                aVar2.d((Object) null);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {645, 238}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f34085c;

        /* renamed from: d  reason: collision with root package name */
        Object f34086d;

        /* renamed from: e  reason: collision with root package name */
        Object f34087e;

        /* renamed from: f  reason: collision with root package name */
        int f34088f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ G<Key, Value> f34089g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(G<Key, Value> g10, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f34089g = g10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new m(this.f34089g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX INFO: finally extract failed */
        public final Object invokeSuspend(Object obj) {
            I.a aVar;
            C17052a aVar2;
            G<Key, Value> g10;
            Object f10 = C17187b.f();
            int i10 = this.f34088f;
            if (i10 == 0) {
                y.b(obj);
                g10 = this.f34089g;
                aVar = g10.f33982k;
                C17052a a10 = aVar.f34103b;
                this.f34085c = aVar;
                this.f34086d = a10;
                this.f34087e = g10;
                this.f34088f = 1;
                if (a10.e((Object) null, this) == f10) {
                    return f10;
                }
                aVar2 = a10;
            } else if (i10 == 1) {
                g10 = (G) this.f34087e;
                aVar2 = (C17052a) this.f34086d;
                aVar = (I.a) this.f34085c;
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C16532g<Integer> e10 = aVar.f34104c.e();
                aVar2.d((Object) null);
                C6449x xVar = C6449x.APPEND;
                this.f34085c = null;
                this.f34086d = null;
                this.f34087e = null;
                this.f34088f = 2;
                if (g10.q(e10, xVar, this) == f10) {
                    return f10;
                }
                return C16807N.f139792a;
            } catch (Throwable th2) {
                aVar2.d((Object) null);
                throw th2;
            }
        }
    }

    public G(Key key, P<Key, Value> p10, L l10, C16532g<C16807N> gVar, U<Key, Value> u10, Q<Key, Value> q10, C17631a<C16807N> aVar) {
        C17542s.j(p10, "pagingSource");
        C17542s.j(l10, "config");
        C17542s.j(gVar, "retryFlow");
        C17542s.j(aVar, "jumpCallback");
        this.f33972a = key;
        this.f33973b = p10;
        this.f33974c = l10;
        this.f33975d = gVar;
        this.f33976e = u10;
        this.f33977f = q10;
        this.f33978g = aVar;
        if (l10.f34126f == Integer.MIN_VALUE || p10.b()) {
            this.f33979h = new C6441o();
            this.f33980i = new AtomicBoolean(false);
            this.f33981j = C16437m.b(-2, (C16428d) null, (C17642l) null, 6, (Object) null);
            this.f33982k = new I.a<>(l10);
            C16283A b10 = J0.b((F0) null, 1, (Object) null);
            this.f33983l = b10;
            this.f33984m = C16534i.S(C6430d.a(b10, new i(this, (C17164e<? super i>) null)), new j(this, (C17164e<? super j>) null));
            return;
        }
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
    }

    /* access modifiers changed from: private */
    public final Object A(C6449x xVar, d0 d0Var, C17164e<? super C16807N> eVar) {
        if (a.f33985a[xVar.ordinal()] == 1) {
            Object s10 = s(eVar);
            return s10 == C17187b.f() ? s10 : C16807N.f139792a;
        } else if (d0Var != null) {
            this.f33979h.a(xVar, d0Var);
            return C16807N.f139792a;
        } else {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
    }

    private final Object B(I<Key, Value> i10, C6449x xVar, C6447v.a aVar, C17164e<? super C16807N> eVar) {
        if (C17542s.e(i10.p().a(xVar), aVar)) {
            return C16807N.f139792a;
        }
        i10.p().c(xVar, aVar);
        Object y10 = this.f33981j.y(new E.c(i10.p().d(), (C6448w) null), eVar);
        return y10 == C17187b.f() ? y10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Object C(I<Key, Value> i10, C6449x xVar, C17164e<? super C16807N> eVar) {
        C6447v a10 = i10.p().a(xVar);
        C6447v.b bVar = C6447v.b.f34456b;
        if (C17542s.e(a10, bVar)) {
            return C16807N.f139792a;
        }
        i10.p().c(xVar, bVar);
        Object y10 = this.f33981j.y(new E.c(i10.p().d(), (C6448w) null), eVar);
        return y10 == C17187b.f() ? y10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void D(Q q10) {
        if (this.f33974c.f34126f != Integer.MIN_VALUE) {
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new k(this, (C17164e<? super k>) null), 3, (Object) null);
        }
        F0 unused2 = C16314k.d(q10, (C17168i) null, (T) null, new l(this, (C17164e<? super l>) null), 3, (Object) null);
        F0 unused3 = C16314k.d(q10, (C17168i) null, (T) null, new m(this, (C17164e<? super m>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object q(C16532g<Integer> gVar, C6449x xVar, C17164e<? super C16807N> eVar) {
        Object collect = C16534i.o(C6439m.b(C6439m.d(gVar, new b((C17164e) null, this, xVar)), new c(xVar, (C17164e<? super c>) null))).collect(new d(this, xVar), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0269, code lost:
        r3.d((java.lang.Object) null);
        r5 = (D4.P.b.C0534b) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0272, code lost:
        if (r5.p() != null) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0274, code lost:
        r2.f33976e.d(D4.C6449x.PREPEND, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027f, code lost:
        if (r5.m() != null) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0281, code lost:
        r2.f33976e.d(D4.C6449x.APPEND, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x028a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x028b, code lost:
        r3.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028f, code lost:
        r4.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0292, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0295, code lost:
        if ((r0 instanceof D4.P.b.a) == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0297, code lost:
        r5 = D4.C6451z.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x029b, code lost:
        if (r5 == null) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a2, code lost:
        if (r5.b(2) != true) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a4, code lost:
        r5.a(2, r4.y(D4.C6449x.REFRESH, r4.f33972a, r0), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02af, code lost:
        r5 = r4.f33982k;
        r6 = r5.f34103b;
        r2.f34012c = r4;
        r2.f34013d = r0;
        r2.f34014e = r5;
        r2.f34015f = r6;
        r2.f34018i = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c5, code lost:
        if (r6.e((java.lang.Object) null, r2) != r3) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c7, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c8, code lost:
        r7 = r4;
        r4 = r6;
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r0 = r5.f34104c;
        r5 = new D4.C6447v.a(((D4.P.b.a) r6).b());
        r6 = D4.C6449x.REFRESH;
        r2.f34012c = r4;
        r2.f34013d = null;
        r2.f34014e = null;
        r2.f34015f = null;
        r2.f34018i = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ec, code lost:
        if (r7.B(r0, r6, r5, r2) != r3) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ee, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ef, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02f2, code lost:
        r2.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f7, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02f9, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02fa, code lost:
        r2.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0300, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = r9.f34104c;
        r9 = D4.C6449x.REFRESH;
        r2.f34012c = r10;
        r2.f34013d = r4;
        r2.f34014e = null;
        r2.f34018i = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fb, code lost:
        if (r10.C(r0, r9, r2) != r3) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fd, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fe, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ff, code lost:
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0101, code lost:
        r4.d((java.lang.Object) null);
        r0 = r9.x(D4.C6449x.REFRESH, r9.f33972a);
        r4 = D4.C6451z.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0110, code lost:
        if (r4 == null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0116, code lost:
        if (r4.b(3) != true) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0118, code lost:
        r4.a(3, "Start REFRESH with loadKey " + r9.f33972a + " on " + r9.f33973b, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0138, code lost:
        r4 = r9.f33973b;
        r2.f34012c = r9;
        r2.f34013d = null;
        r2.f34018i = 3;
        r0 = r4.f(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0144, code lost:
        if (r0 != r3) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0146, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0147, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0148, code lost:
        r0 = (D4.P.b) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014c, code lost:
        if ((r0 instanceof D4.P.b.C0534b) == false) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014e, code lost:
        r9 = r4.f33982k;
        r10 = r9.f34103b;
        r2.f34012c = r4;
        r2.f34013d = r0;
        r2.f34014e = r9;
        r2.f34015f = r10;
        r2.f34018i = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0163, code lost:
        if (r10.e((java.lang.Object) null, r2) != r3) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0165, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0166, code lost:
        r11 = r4;
        r4 = r10;
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r0 = r9.f34104c;
        r9 = D4.C6449x.REFRESH;
        r12 = r0.r(0, r9, (D4.P.b.C0534b) r10);
        r13 = r0.p();
        r14 = D4.C6447v.c.f34457b;
        r13.c(r9, r14.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018b, code lost:
        if (((D4.P.b.C0534b) r10).p() != null) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018d, code lost:
        r0.p().c(D4.C6449x.PREPEND, r14.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a5, code lost:
        if (((D4.P.b.C0534b) r10).m() != null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a7, code lost:
        r0.p().c(D4.C6449x.APPEND, r14.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b4, code lost:
        r4.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b7, code lost:
        if (r12 == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b9, code lost:
        r0 = D4.C6451z.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01bd, code lost:
        if (r0 == null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c3, code lost:
        if (r0.b(3) != true) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c5, code lost:
        r0.a(3, r11.y(r9, r11.f33972a, r10), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ce, code lost:
        r5 = r11.f33982k;
        r0 = r5.f34103b;
        r2.f34012c = r11;
        r2.f34013d = r10;
        r2.f34014e = r5;
        r2.f34015f = r0;
        r2.f34018i = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e3, code lost:
        if (r0.e((java.lang.Object) null, r2) != r3) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e5, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e6, code lost:
        r4 = r0;
        r6 = r10;
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r0 = r5.f34104c;
        r5 = r7.f33981j;
        r0 = r0.u((D4.P.b.C0534b) r6, D4.C6449x.REFRESH);
        r2.f34012c = r7;
        r2.f34013d = r6;
        r2.f34014e = r4;
        r2.f34015f = null;
        r2.f34018i = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0207, code lost:
        if (r5.y(r0, r2) != r3) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0209, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x020a, code lost:
        r5 = r6;
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x020c, code lost:
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020e, code lost:
        r4.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0216, code lost:
        r0 = D4.C6451z.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021a, code lost:
        if (r0 == null) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0221, code lost:
        if (r0.b(2) != true) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0223, code lost:
        r0.a(2, r11.y(r9, r11.f33972a, (D4.P.b) null), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022c, code lost:
        r5 = r10;
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0230, code lost:
        if (r6.f33976e == null) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0232, code lost:
        r0 = (D4.P.b.C0534b) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0239, code lost:
        if (r0.p() == null) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x023f, code lost:
        if (r0.m() != null) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0241, code lost:
        r4 = r6.f33982k;
        r0 = r4.f34103b;
        r2.f34012c = r6;
        r2.f34013d = r5;
        r2.f34014e = r4;
        r2.f34015f = r0;
        r2.f34018i = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0256, code lost:
        if (r0.e((java.lang.Object) null, r2) != r3) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0258, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0259, code lost:
        r3 = r0;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r0 = r4.f34104c.g(r2.f33979h.b());
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(dI.C17164e<? super XH.C16807N> r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof D4.G.g
            if (r2 == 0) goto L_0x0017
            r2 = r0
            D4.G$g r2 = (D4.G.g) r2
            int r3 = r2.f34018i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f34018i = r3
            goto L_0x001c
        L_0x0017:
            D4.G$g r2 = new D4.G$g
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f34016g
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r2.f34018i
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            switch(r4) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00bf;
                case 2: goto L_0x00b0;
                case 3: goto L_0x00a7;
                case 4: goto L_0x0092;
                case 5: goto L_0x007d;
                case 6: goto L_0x0069;
                case 7: goto L_0x0054;
                case 8: goto L_0x003f;
                case 9: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0033:
            java.lang.Object r2 = r2.f34012c
            bK.a r2 = (bK.C17052a) r2
            XH.y.b(r0)     // Catch:{ all -> 0x003c }
            goto L_0x02f0
        L_0x003c:
            r0 = move-exception
            goto L_0x02fa
        L_0x003f:
            java.lang.Object r4 = r2.f34015f
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r5 = r2.f34014e
            D4.I$a r5 = (D4.I.a) r5
            java.lang.Object r6 = r2.f34013d
            D4.P$b r6 = (D4.P.b) r6
            java.lang.Object r7 = r2.f34012c
            D4.G r7 = (D4.G) r7
            XH.y.b(r0)
            goto L_0x02cb
        L_0x0054:
            java.lang.Object r3 = r2.f34015f
            bK.a r3 = (bK.C17052a) r3
            java.lang.Object r4 = r2.f34014e
            D4.I$a r4 = (D4.I.a) r4
            java.lang.Object r5 = r2.f34013d
            D4.P$b r5 = (D4.P.b) r5
            java.lang.Object r2 = r2.f34012c
            D4.G r2 = (D4.G) r2
            XH.y.b(r0)
            goto L_0x025b
        L_0x0069:
            java.lang.Object r4 = r2.f34014e
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r5 = r2.f34013d
            D4.P$b r5 = (D4.P.b) r5
            java.lang.Object r6 = r2.f34012c
            D4.G r6 = (D4.G) r6
            XH.y.b(r0)     // Catch:{ all -> 0x007a }
            goto L_0x020c
        L_0x007a:
            r0 = move-exception
            goto L_0x0212
        L_0x007d:
            java.lang.Object r4 = r2.f34015f
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r5 = r2.f34014e
            D4.I$a r5 = (D4.I.a) r5
            java.lang.Object r6 = r2.f34013d
            D4.P$b r6 = (D4.P.b) r6
            java.lang.Object r7 = r2.f34012c
            D4.G r7 = (D4.G) r7
            XH.y.b(r0)
            goto L_0x01e9
        L_0x0092:
            java.lang.Object r4 = r2.f34015f
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r9 = r2.f34014e
            D4.I$a r9 = (D4.I.a) r9
            java.lang.Object r10 = r2.f34013d
            D4.P$b r10 = (D4.P.b) r10
            java.lang.Object r11 = r2.f34012c
            D4.G r11 = (D4.G) r11
            XH.y.b(r0)
            goto L_0x0169
        L_0x00a7:
            java.lang.Object r4 = r2.f34012c
            D4.G r4 = (D4.G) r4
            XH.y.b(r0)
            goto L_0x0148
        L_0x00b0:
            java.lang.Object r4 = r2.f34013d
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r9 = r2.f34012c
            D4.G r9 = (D4.G) r9
            XH.y.b(r0)     // Catch:{ all -> 0x00bc }
            goto L_0x00ff
        L_0x00bc:
            r0 = move-exception
            goto L_0x0301
        L_0x00bf:
            java.lang.Object r4 = r2.f34014e
            bK.a r4 = (bK.C17052a) r4
            java.lang.Object r9 = r2.f34013d
            D4.I$a r9 = (D4.I.a) r9
            java.lang.Object r10 = r2.f34012c
            D4.G r10 = (D4.G) r10
            XH.y.b(r0)
            goto L_0x00e9
        L_0x00cf:
            XH.y.b(r0)
            D4.I$a<Key, Value> r9 = r1.f33982k
            bK.a r0 = r9.f34103b
            r2.f34012c = r1
            r2.f34013d = r9
            r2.f34014e = r0
            r2.f34018i = r7
            java.lang.Object r4 = r0.e(r8, r2)
            if (r4 != r3) goto L_0x00e7
            return r3
        L_0x00e7:
            r4 = r0
            r10 = r1
        L_0x00e9:
            D4.I r0 = r9.f34104c     // Catch:{ all -> 0x00bc }
            D4.x r9 = D4.C6449x.REFRESH     // Catch:{ all -> 0x00bc }
            r2.f34012c = r10     // Catch:{ all -> 0x00bc }
            r2.f34013d = r4     // Catch:{ all -> 0x00bc }
            r2.f34014e = r8     // Catch:{ all -> 0x00bc }
            r2.f34018i = r6     // Catch:{ all -> 0x00bc }
            java.lang.Object r0 = r10.C(r0, r9, r2)     // Catch:{ all -> 0x00bc }
            if (r0 != r3) goto L_0x00fe
            return r3
        L_0x00fe:
            r9 = r10
        L_0x00ff:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00bc }
            r4.d(r8)
            D4.x r0 = D4.C6449x.REFRESH
            Key r4 = r9.f33972a
            D4.P$a r0 = r9.x(r0, r4)
            D4.y r4 = D4.C6451z.a()
            if (r4 == 0) goto L_0x0138
            boolean r10 = r4.b(r5)
            if (r10 != r7) goto L_0x0138
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Start REFRESH with loadKey "
            r10.append(r11)
            Key r11 = r9.f33972a
            r10.append(r11)
            java.lang.String r11 = " on "
            r10.append(r11)
            D4.P<Key, Value> r11 = r9.f33973b
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r4.a(r5, r10, r8)
        L_0x0138:
            D4.P<Key, Value> r4 = r9.f33973b
            r2.f34012c = r9
            r2.f34013d = r8
            r2.f34018i = r5
            java.lang.Object r0 = r4.f(r0, r2)
            if (r0 != r3) goto L_0x0147
            return r3
        L_0x0147:
            r4 = r9
        L_0x0148:
            D4.P$b r0 = (D4.P.b) r0
            boolean r9 = r0 instanceof D4.P.b.C0534b
            if (r9 == 0) goto L_0x0293
            D4.I$a<Key, Value> r9 = r4.f33982k
            bK.a r10 = r9.f34103b
            r2.f34012c = r4
            r2.f34013d = r0
            r2.f34014e = r9
            r2.f34015f = r10
            r11 = 4
            r2.f34018i = r11
            java.lang.Object r11 = r10.e(r8, r2)
            if (r11 != r3) goto L_0x0166
            return r3
        L_0x0166:
            r11 = r4
            r4 = r10
            r10 = r0
        L_0x0169:
            D4.I r0 = r9.f34104c     // Catch:{ all -> 0x019b }
            D4.x r9 = D4.C6449x.REFRESH     // Catch:{ all -> 0x019b }
            r12 = r10
            D4.P$b$b r12 = (D4.P.b.C0534b) r12     // Catch:{ all -> 0x019b }
            r13 = 0
            boolean r12 = r0.r(r13, r9, r12)     // Catch:{ all -> 0x019b }
            D4.C r13 = r0.p()     // Catch:{ all -> 0x019b }
            D4.v$c$a r14 = D4.C6447v.c.f34457b     // Catch:{ all -> 0x019b }
            D4.v$c r15 = r14.b()     // Catch:{ all -> 0x019b }
            r13.c(r9, r15)     // Catch:{ all -> 0x019b }
            r13 = r10
            D4.P$b$b r13 = (D4.P.b.C0534b) r13     // Catch:{ all -> 0x019b }
            java.lang.Object r13 = r13.p()     // Catch:{ all -> 0x019b }
            if (r13 != 0) goto L_0x019e
            D4.C r13 = r0.p()     // Catch:{ all -> 0x019b }
            D4.x r15 = D4.C6449x.PREPEND     // Catch:{ all -> 0x019b }
            D4.v$c r6 = r14.a()     // Catch:{ all -> 0x019b }
            r13.c(r15, r6)     // Catch:{ all -> 0x019b }
            goto L_0x019e
        L_0x019b:
            r0 = move-exception
            goto L_0x028f
        L_0x019e:
            r6 = r10
            D4.P$b$b r6 = (D4.P.b.C0534b) r6     // Catch:{ all -> 0x019b }
            java.lang.Object r6 = r6.m()     // Catch:{ all -> 0x019b }
            if (r6 != 0) goto L_0x01b4
            D4.C r0 = r0.p()     // Catch:{ all -> 0x019b }
            D4.x r6 = D4.C6449x.APPEND     // Catch:{ all -> 0x019b }
            D4.v$c r13 = r14.a()     // Catch:{ all -> 0x019b }
            r0.c(r6, r13)     // Catch:{ all -> 0x019b }
        L_0x01b4:
            r4.d(r8)
            if (r12 == 0) goto L_0x0216
            D4.y r0 = D4.C6451z.a()
            if (r0 == 0) goto L_0x01ce
            boolean r4 = r0.b(r5)
            if (r4 != r7) goto L_0x01ce
            Key r4 = r11.f33972a
            java.lang.String r4 = r11.y(r9, r4, r10)
            r0.a(r5, r4, r8)
        L_0x01ce:
            D4.I$a<Key, Value> r5 = r11.f33982k
            bK.a r0 = r5.f34103b
            r2.f34012c = r11
            r2.f34013d = r10
            r2.f34014e = r5
            r2.f34015f = r0
            r4 = 5
            r2.f34018i = r4
            java.lang.Object r4 = r0.e(r8, r2)
            if (r4 != r3) goto L_0x01e6
            return r3
        L_0x01e6:
            r4 = r0
            r6 = r10
            r7 = r11
        L_0x01e9:
            D4.I r0 = r5.f34104c     // Catch:{ all -> 0x007a }
            SJ.j<D4.E<Value>> r5 = r7.f33981j     // Catch:{ all -> 0x007a }
            r9 = r6
            D4.P$b$b r9 = (D4.P.b.C0534b) r9     // Catch:{ all -> 0x007a }
            D4.x r10 = D4.C6449x.REFRESH     // Catch:{ all -> 0x007a }
            D4.E r0 = r0.u(r9, r10)     // Catch:{ all -> 0x007a }
            r2.f34012c = r7     // Catch:{ all -> 0x007a }
            r2.f34013d = r6     // Catch:{ all -> 0x007a }
            r2.f34014e = r4     // Catch:{ all -> 0x007a }
            r2.f34015f = r8     // Catch:{ all -> 0x007a }
            r9 = 6
            r2.f34018i = r9     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r5.y(r0, r2)     // Catch:{ all -> 0x007a }
            if (r0 != r3) goto L_0x020a
            return r3
        L_0x020a:
            r5 = r6
            r6 = r7
        L_0x020c:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x007a }
            r4.d(r8)
            goto L_0x022e
        L_0x0212:
            r4.d(r8)
            throw r0
        L_0x0216:
            D4.y r0 = D4.C6451z.a()
            if (r0 == 0) goto L_0x022c
            r4 = 2
            boolean r5 = r0.b(r4)
            if (r5 != r7) goto L_0x022c
            Key r5 = r11.f33972a
            java.lang.String r5 = r11.y(r9, r5, r8)
            r0.a(r4, r5, r8)
        L_0x022c:
            r5 = r10
            r6 = r11
        L_0x022e:
            D4.U<Key, Value> r0 = r6.f33976e
            if (r0 == 0) goto L_0x02fe
            r0 = r5
            D4.P$b$b r0 = (D4.P.b.C0534b) r0
            java.lang.Object r4 = r0.p()
            if (r4 == 0) goto L_0x0241
            java.lang.Object r0 = r0.m()
            if (r0 != 0) goto L_0x02fe
        L_0x0241:
            D4.I$a<Key, Value> r4 = r6.f33982k
            bK.a r0 = r4.f34103b
            r2.f34012c = r6
            r2.f34013d = r5
            r2.f34014e = r4
            r2.f34015f = r0
            r7 = 7
            r2.f34018i = r7
            java.lang.Object r2 = r0.e(r8, r2)
            if (r2 != r3) goto L_0x0259
            return r3
        L_0x0259:
            r3 = r0
            r2 = r6
        L_0x025b:
            D4.I r0 = r4.f34104c     // Catch:{ all -> 0x028a }
            D4.o r4 = r2.f33979h     // Catch:{ all -> 0x028a }
            D4.d0$a r4 = r4.b()     // Catch:{ all -> 0x028a }
            D4.Q r0 = r0.g(r4)     // Catch:{ all -> 0x028a }
            r3.d(r8)
            D4.P$b$b r5 = (D4.P.b.C0534b) r5
            java.lang.Object r3 = r5.p()
            if (r3 != 0) goto L_0x027b
            D4.U<Key, Value> r3 = r2.f33976e
            D4.x r4 = D4.C6449x.PREPEND
            r3.d(r4, r0)
        L_0x027b:
            java.lang.Object r3 = r5.m()
            if (r3 != 0) goto L_0x02fe
            D4.U<Key, Value> r2 = r2.f33976e
            D4.x r3 = D4.C6449x.APPEND
            r2.d(r3, r0)
            goto L_0x02fe
        L_0x028a:
            r0 = move-exception
            r3.d(r8)
            throw r0
        L_0x028f:
            r4.d(r8)
            throw r0
        L_0x0293:
            boolean r5 = r0 instanceof D4.P.b.a
            if (r5 == 0) goto L_0x02fe
            D4.y r5 = D4.C6451z.a()
            if (r5 == 0) goto L_0x02af
            r6 = 2
            boolean r9 = r5.b(r6)
            if (r9 != r7) goto L_0x02af
            D4.x r7 = D4.C6449x.REFRESH
            Key r9 = r4.f33972a
            java.lang.String r7 = r4.y(r7, r9, r0)
            r5.a(r6, r7, r8)
        L_0x02af:
            D4.I$a<Key, Value> r5 = r4.f33982k
            bK.a r6 = r5.f34103b
            r2.f34012c = r4
            r2.f34013d = r0
            r2.f34014e = r5
            r2.f34015f = r6
            r7 = 8
            r2.f34018i = r7
            java.lang.Object r7 = r6.e(r8, r2)
            if (r7 != r3) goto L_0x02c8
            return r3
        L_0x02c8:
            r7 = r4
            r4 = r6
            r6 = r0
        L_0x02cb:
            D4.I r0 = r5.f34104c     // Catch:{ all -> 0x02f8 }
            D4.v$a r5 = new D4.v$a     // Catch:{ all -> 0x02f8 }
            D4.P$b$a r6 = (D4.P.b.a) r6     // Catch:{ all -> 0x02f8 }
            java.lang.Throwable r6 = r6.b()     // Catch:{ all -> 0x02f8 }
            r5.<init>(r6)     // Catch:{ all -> 0x02f8 }
            D4.x r6 = D4.C6449x.REFRESH     // Catch:{ all -> 0x02f8 }
            r2.f34012c = r4     // Catch:{ all -> 0x02f8 }
            r2.f34013d = r8     // Catch:{ all -> 0x02f8 }
            r2.f34014e = r8     // Catch:{ all -> 0x02f8 }
            r2.f34015f = r8     // Catch:{ all -> 0x02f8 }
            r9 = 9
            r2.f34018i = r9     // Catch:{ all -> 0x02f8 }
            java.lang.Object r0 = r7.B(r0, r6, r5, r2)     // Catch:{ all -> 0x02f8 }
            if (r0 != r3) goto L_0x02ef
            return r3
        L_0x02ef:
            r2 = r4
        L_0x02f0:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x003c }
            r2.d(r8)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x02f8:
            r0 = move-exception
            r2 = r4
        L_0x02fa:
            r2.d(r8)
            throw r0
        L_0x02fe:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0301:
            r4.d(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.G.s(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: D4.P$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v58, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v59, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v65, resolved type: D4.I$a<Key, Value>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v67, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v68, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v71, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v72, resolved type: bK.a} */
    /* JADX WARNING: type inference failed for: r3v17, types: [java.lang.Throwable, java.lang.Object, D4.P$b] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03cd, code lost:
        if (r2 == 2) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03d0, code lost:
        if (r2 != 3) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d2, code lost:
        r2 = ((D4.P.b.C0534b) r6).m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03df, code lost:
        throw new java.lang.IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03e0, code lost:
        r2 = ((D4.P.b.C0534b) r6).p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03ed, code lost:
        if (r9.f33973b.c() != false) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03f5, code lost:
        if (kotlin.jvm.internal.C17542s.e(r2, r10.f144348a) != false) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03fa, code lost:
        if (r13 != D4.C6449x.PREPEND) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03fc, code lost:
        r0 = "prevKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03ff, code lost:
        r0 = "nextKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0430, code lost:
        throw new java.lang.IllegalStateException(HJ.C15854t.o("The same value, " + r10.f144348a + ", was passed as the " + r0 + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ", (java.lang.String) null, 1, (java.lang.Object) null).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0431, code lost:
        r3 = r9.f33982k;
        r2 = r3.f34103b;
        r4.f34019c = r9;
        r4.f34020d = r13;
        r4.f34021e = r12;
        r4.f34022f = r11;
        r4.f34023g = r10;
        r4.f34024h = r0;
        r4.f34025i = r8;
        r4.f34026j = r6;
        r4.f34027k = r3;
        r4.f34028l = r2;
        r4.f34034r = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0453, code lost:
        if (r2.e((java.lang.Object) null, r4) != r5) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0455, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0456, code lost:
        r14 = r9;
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x046b, code lost:
        if (r3.f34104c.r(r12.a(), r13, (D4.P.b.C0534b) r6) != false) goto L_0x0486;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x046d, code lost:
        r0 = D4.C6451z.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0471, code lost:
        if (r0 == null) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0479, code lost:
        if (r0.b(2) != true) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x047b, code lost:
        r0.a(2, r14.y(r13, r10.f144348a, r3), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0486, code lost:
        r0 = D4.C6451z.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x048b, code lost:
        if (r0 == null) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0492, code lost:
        if (r0.b(3) != true) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0494, code lost:
        r0.a(3, r14.y(r13, r10.f144348a, r6), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x049e, code lost:
        r2 = (D4.P.b.C0534b) r6;
        r11.f144346a += r2.b().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x04b0, code lost:
        if (r13 != D4.C6449x.PREPEND) goto L_0x04bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04b6, code lost:
        if (r2.p() == null) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04bd, code lost:
        if (r13 != D4.C6449x.APPEND) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04c3, code lost:
        if (r2.m() != null) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04c6, code lost:
        r9.f144344a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04c8, code lost:
        r0 = r9;
        r9 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04ce, code lost:
        r2.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04d2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04d7, code lost:
        if ((r6 instanceof D4.P.b.a) == false) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04d9, code lost:
        r0 = D4.C6451z.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04dd, code lost:
        if (r0 == null) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04e5, code lost:
        if (r0.b(2) != true) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04e7, code lost:
        r0.a(2, r9.y(r13, r10.f144348a, r6), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04f0, code lost:
        r3 = r9.f33982k;
        r0 = r3.f34103b;
        r4.f34019c = r9;
        r4.f34020d = r13;
        r4.f34021e = r12;
        r4.f34022f = r6;
        r4.f34023g = r3;
        r4.f34024h = r0;
        r4.f34025i = null;
        r4.f34034r = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x050c, code lost:
        if (r0.e((java.lang.Object) null, r4) != r5) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x050e, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        r0 = th;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x050f, code lost:
        r2 = r0;
        r0 = r4;
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r3 = r3.f34104c;
        r7 = new D4.C6447v.a(((D4.P.b.a) r6).b());
        r0.f34019c = r4;
        r0.f34020d = r12;
        r0.f34021e = r2;
        r0.f34022f = r3;
        r0.f34023g = null;
        r0.f34024h = null;
        r0.f34034r = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0535, code lost:
        if (r9.B(r3, r4, r7, r0) != r5) goto L_0x0538;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0537, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0538, code lost:
        r0 = r3;
        r5 = r12;
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r0.k().put(r4, r5.b());
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0548, code lost:
        r3.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x054e, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x054f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0550, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0553, code lost:
        r3.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0556, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0560, code lost:
        if (D4.G.a.f33985a[r13.ordinal()] != 2) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0562, code lost:
        r2 = D4.C6449x.APPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0565, code lost:
        r2 = D4.C6449x.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0567, code lost:
        r3 = r9.f33982k;
        r14 = r3.f34103b;
        r4.f34019c = r9;
        r4.f34020d = r13;
        r4.f34021e = r12;
        r4.f34022f = r11;
        r4.f34023g = r10;
        r4.f34024h = r0;
        r4.f34025i = r8;
        r4.f34026j = r6;
        r4.f34027k = r2;
        r4.f34028l = r3;
        r4.f34029m = r14;
        r4.f34034r = 8;
        r19 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x058e, code lost:
        if (r14.e((java.lang.Object) null, r4) != r5) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0590, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0591, code lost:
        r0 = r12;
        r15 = r13;
        r12 = r10;
        r13 = r11;
        r11 = r19;
        r10 = r8;
        r8 = r2;
        r16 = r6;
        r6 = r3;
        r3 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x059f, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r2 = r6.f34104c;
        r6 = r2.i(r8, r0.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x05ab, code lost:
        if (r6 == null) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x05ad, code lost:
        r2.h(r6);
        r8 = r3.f33981j;
        r4.f34019c = r3;
        r4.f34020d = r15;
        r4.f34021e = r0;
        r4.f34022f = r13;
        r4.f34023g = r12;
        r4.f34024h = r11;
        r4.f34025i = r10;
        r4.f34026j = r9;
        r4.f34027k = r14;
        r4.f34028l = r2;
        r4.f34029m = null;
        r4.f34034r = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05d1, code lost:
        if (r8.y(r6, r4) != r5) goto L_0x05d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x05d3, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x05d4, code lost:
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r6 = r14;
        r14 = r15;
        r13 = r0;
        r0 = r2;
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x05de, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r1 = XH.C16807N.f139792a;
        r2 = r0;
        r0 = r13;
        r3 = r15;
        r13 = r12;
        r15 = r14;
        r12 = r11;
        r11 = r10;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05e8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x05e9, code lost:
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05ec, code lost:
        r8 = r9;
        r9 = r10;
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05ef, code lost:
        r1 = r3.z(r2, r15, r0.a(), r0.b().e(r15) + r13.f144346a);
        r12.f144348a = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0604, code lost:
        if (r1 != null) goto L_0x062a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0610, code lost:
        if ((r2.p().a(r15) instanceof D4.C6447v.a) != false) goto L_0x062a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0612, code lost:
        r1 = r2.p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0618, code lost:
        if (r11.f144344a == false) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x061a, code lost:
        r10 = D4.C6447v.c.f34457b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0621, code lost:
        r10 = D4.C6447v.c.f34457b.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0627, code lost:
        r1.c(r15, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x062a, code lost:
        r1 = r2.u((D4.P.b.C0534b) r8, r15);
        r2 = r3.f33981j;
        r4.f34019c = r3;
        r4.f34020d = r15;
        r4.f34021e = r0;
        r4.f34022f = r13;
        r4.f34023g = r12;
        r4.f34024h = r11;
        r4.f34025i = r9;
        r4.f34026j = r8;
        r4.f34027k = r6;
        r4.f34028l = null;
        r4.f34029m = null;
        r4.f34034r = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0652, code lost:
        if (r2.y(r1, r4) != r5) goto L_0x0655;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0654, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0655, code lost:
        r10 = r0;
        r14 = r3;
        r0 = r8;
        r8 = r9;
        r9 = r11;
        r11 = r15;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x065b, code lost:
        r1 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x065d, code lost:
        r6.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0663, code lost:
        if ((r8 instanceof D4.P.a.c) == false) goto L_0x0670;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x066c, code lost:
        if (((D4.P.b.C0534b) r0).p() != null) goto L_0x0670;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x066e, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0670, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0673, code lost:
        if ((r8 instanceof D4.P.a.C0532a) == false) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x067b, code lost:
        if (((D4.P.b.C0534b) r0).m() != null) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x067d, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x067f, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0682, code lost:
        if (r14.f33976e == null) goto L_0x06e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0684, code lost:
        if (r6 != 0) goto L_0x0688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0686, code lost:
        if (r0 == 0) goto L_0x06e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0688, code lost:
        r1 = r14.f33982k;
        r2 = r1.f34103b;
        r4.f34019c = r14;
        r4.f34020d = r11;
        r4.f34021e = r10;
        r4.f34022f = r13;
        r4.f34023g = r12;
        r4.f34024h = r9;
        r4.f34025i = r1;
        r4.f34026j = r2;
        r4.f34027k = null;
        r4.f34030n = r6;
        r4.f34031o = r0;
        r4.f34034r = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x06ad, code lost:
        if (r2.e((java.lang.Object) null, r4) != r5) goto L_0x06b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x06af, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x06b0, code lost:
        r8 = r12;
        r12 = r14;
        r14 = r9;
        r9 = r13;
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        r1 = r13.f34104c.g(r12.f33979h.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06c7, code lost:
        if (r6 == 0) goto L_0x06d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x06c9, code lost:
        r12.f33976e.d(D4.C6449x.PREPEND, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x06d0, code lost:
        if (r0 == 0) goto L_0x06d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x06d2, code lost:
        r12.f33976e.d(D4.C6449x.APPEND, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x06d9, code lost:
        r1 = r18;
        r0 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06df, code lost:
        r2.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06e3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06e4, code lost:
        r1 = r18;
        r0 = r9;
        r8 = r12;
        r9 = r13;
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x06f2, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x06f3, code lost:
        r6.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06f6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x06fc, code lost:
        throw new java.lang.IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x06fd, code lost:
        r2.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0700, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r3 = r3.f34104c;
        r9 = D4.G.a.f33985a[r0.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0230, code lost:
        if (r9 == 1) goto L_0x06f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0233, code lost:
        if (r9 == 2) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0236, code lost:
        if (r9 == 3) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x023a, code lost:
        r9 = (r3.l() + r8.b().b()) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0248, code lost:
        if (r9 >= 0) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x024a, code lost:
        r6.f144346a += r10.f33974c.f34121a * (-r9);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0257, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x025b, code lost:
        r11 = YH.C16877v.p(r3.m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0263, code lost:
        if (r9 > r11) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0265, code lost:
        r6.f144346a += ((D4.P.b.C0534b) r3.m().get(r9)).b().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x027c, code lost:
        if (r9 == r11) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x027e, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0281, code lost:
        r9 = (r3.l() + r8.b().a()) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0298, code lost:
        if (r9 <= YH.C16877v.p(r3.m())) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x029a, code lost:
        r6.f144346a += r10.f33974c.f34121a * (r9 - YH.C16877v.p(r3.m()));
        r9 = YH.C16877v.p(r3.m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02b5, code lost:
        if (r9 < 0) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02b7, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02b8, code lost:
        r6.f144346a += ((D4.P.b.C0534b) r3.m().get(r11)).b().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02cf, code lost:
        if (r11 == r9) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02d1, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d4, code lost:
        r3 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02d6, code lost:
        r2.d((java.lang.Object) null);
        r2 = new kotlin.jvm.internal.O();
        r3 = r10.f33982k;
        r9 = r3.f34103b;
        r4.f34019c = r10;
        r4.f34020d = r0;
        r4.f34021e = r8;
        r4.f34022f = r6;
        r4.f34023g = r2;
        r4.f34024h = r3;
        r4.f34025i = r9;
        r4.f34026j = r2;
        r4.f34034r = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02fd, code lost:
        if (r9.e((java.lang.Object) null, r4) != r5) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02ff, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0300, code lost:
        r11 = r0;
        r0 = r2;
        r12 = r10;
        r10 = r8;
        r8 = r0;
        r16 = r6;
        r6 = r3;
        r3 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r2 = r6.f34104c;
        r6 = r12.z(r2, r11, r10.a(), r10.b().e(r11) + r9.f144346a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0322, code lost:
        if (r6 == null) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0324, code lost:
        r4.f34019c = r12;
        r4.f34020d = r11;
        r4.f34021e = r10;
        r4.f34022f = r9;
        r4.f34023g = r8;
        r4.f34024h = r3;
        r4.f34025i = r6;
        r4.f34026j = r0;
        r4.f34034r = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x033b, code lost:
        if (r12.C(r2, r11, r4) != r5) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x033d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x033e, code lost:
        r16 = r6;
        r6 = r3;
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0343, code lost:
        r2 = r3;
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0347, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0348, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x034b, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x034d, code lost:
        r3.d((java.lang.Object) null);
        r0.f144348a = r2;
        r0 = new kotlin.jvm.internal.K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0357, code lost:
        r2 = r8.f144348a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0359, code lost:
        if (r2 == null) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x035b, code lost:
        r2 = r12.x(r11, r2);
        r3 = D4.C6451z.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0363, code lost:
        if (r3 == null) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x036b, code lost:
        if (r3.b(3) != true) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x036d, code lost:
        r3.a(3, "Start " + r11 + " with loadKey " + r8.f144348a + " on " + r12.f33973b, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0397, code lost:
        r3 = r12.f33973b;
        r4.f34019c = r12;
        r4.f34020d = r11;
        r4.f34021e = r10;
        r4.f34022f = r9;
        r4.f34023g = r8;
        r4.f34024h = r0;
        r4.f34025i = r2;
        r4.f34026j = null;
        r4.f34027k = null;
        r4.f34034r = 4;
        r3 = r3.f(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03b3, code lost:
        if (r3 != r5) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03b5, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03b6, code lost:
        r13 = r11;
        r11 = r9;
        r9 = r12;
        r12 = r10;
        r10 = r8;
        r8 = r2;
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03bd, code lost:
        r6 = (D4.P.b) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03c2, code lost:
        if ((r6 instanceof D4.P.b.C0534b) == false) goto L_0x04d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03c4, code lost:
        r2 = D4.G.a.f33985a[r13.ordinal()];
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(D4.C6449x r19, D4.C6440n r20, dI.C17164e<? super XH.C16807N> r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r21
            boolean r4 = r2 instanceof D4.G.h
            if (r4 == 0) goto L_0x0019
            r4 = r2
            D4.G$h r4 = (D4.G.h) r4
            int r5 = r4.f34034r
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0019
            int r5 = r5 - r6
            r4.f34034r = r5
            goto L_0x001e
        L_0x0019:
            D4.G$h r4 = new D4.G$h
            r4.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r4.f34032p
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r4.f34034r
            java.lang.String r7 = "Use doInitialLoad for LoadType == REFRESH"
            switch(r6) {
                case 0: goto L_0x01f7;
                case 1: goto L_0x01d9;
                case 2: goto L_0x01b4;
                case 3: goto L_0x018d;
                case 4: goto L_0x0165;
                case 5: goto L_0x0137;
                case 6: goto L_0x0116;
                case 7: goto L_0x00fd;
                case 8: goto L_0x00c7;
                case 9: goto L_0x009a;
                case 10: goto L_0x0062;
                case 11: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0033:
            int r0 = r4.f34031o
            int r6 = r4.f34030n
            java.lang.Object r12 = r4.f34026j
            bK.a r12 = (bK.C17052a) r12
            java.lang.Object r13 = r4.f34025i
            D4.I$a r13 = (D4.I.a) r13
            java.lang.Object r14 = r4.f34024h
            kotlin.jvm.internal.K r14 = (kotlin.jvm.internal.K) r14
            java.lang.Object r15 = r4.f34023g
            kotlin.jvm.internal.O r15 = (kotlin.jvm.internal.O) r15
            java.lang.Object r8 = r4.f34022f
            kotlin.jvm.internal.M r8 = (kotlin.jvm.internal.M) r8
            java.lang.Object r9 = r4.f34021e
            D4.n r9 = (D4.C6440n) r9
            java.lang.Object r10 = r4.f34020d
            D4.x r10 = (D4.C6449x) r10
            java.lang.Object r11 = r4.f34019c
            D4.G r11 = (D4.G) r11
            XH.y.b(r2)
            r2 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r15
            goto L_0x06b5
        L_0x0062:
            java.lang.Object r0 = r4.f34027k
            r6 = r0
            bK.a r6 = (bK.C17052a) r6
            java.lang.Object r0 = r4.f34026j
            D4.P$b r0 = (D4.P.b) r0
            java.lang.Object r8 = r4.f34025i
            D4.P$a r8 = (D4.P.a) r8
            java.lang.Object r9 = r4.f34024h
            kotlin.jvm.internal.K r9 = (kotlin.jvm.internal.K) r9
            java.lang.Object r10 = r4.f34023g
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            java.lang.Object r11 = r4.f34022f
            kotlin.jvm.internal.M r11 = (kotlin.jvm.internal.M) r11
            java.lang.Object r12 = r4.f34021e
            D4.n r12 = (D4.C6440n) r12
            java.lang.Object r13 = r4.f34020d
            D4.x r13 = (D4.C6449x) r13
            java.lang.Object r14 = r4.f34019c
            D4.G r14 = (D4.G) r14
            XH.y.b(r2)     // Catch:{ all -> 0x0096 }
            r16 = r12
            r12 = r10
            r10 = r16
            r17 = r13
            r13 = r11
            r11 = r17
            goto L_0x065b
        L_0x0096:
            r0 = move-exception
        L_0x0097:
            r1 = 0
            goto L_0x06ec
        L_0x009a:
            java.lang.Object r0 = r4.f34028l
            D4.I r0 = (D4.I) r0
            java.lang.Object r6 = r4.f34027k
            bK.a r6 = (bK.C17052a) r6
            java.lang.Object r8 = r4.f34026j
            D4.P$b r8 = (D4.P.b) r8
            java.lang.Object r9 = r4.f34025i
            D4.P$a r9 = (D4.P.a) r9
            java.lang.Object r10 = r4.f34024h
            kotlin.jvm.internal.K r10 = (kotlin.jvm.internal.K) r10
            java.lang.Object r11 = r4.f34023g
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r4.f34022f
            kotlin.jvm.internal.M r12 = (kotlin.jvm.internal.M) r12
            java.lang.Object r13 = r4.f34021e
            D4.n r13 = (D4.C6440n) r13
            java.lang.Object r14 = r4.f34020d
            D4.x r14 = (D4.C6449x) r14
            java.lang.Object r15 = r4.f34019c
            D4.G r15 = (D4.G) r15
            XH.y.b(r2)     // Catch:{ all -> 0x0096 }
            goto L_0x05de
        L_0x00c7:
            java.lang.Object r0 = r4.f34029m
            bK.a r0 = (bK.C17052a) r0
            java.lang.Object r6 = r4.f34028l
            D4.I$a r6 = (D4.I.a) r6
            java.lang.Object r8 = r4.f34027k
            D4.x r8 = (D4.C6449x) r8
            java.lang.Object r9 = r4.f34026j
            D4.P$b r9 = (D4.P.b) r9
            java.lang.Object r10 = r4.f34025i
            D4.P$a r10 = (D4.P.a) r10
            java.lang.Object r11 = r4.f34024h
            kotlin.jvm.internal.K r11 = (kotlin.jvm.internal.K) r11
            java.lang.Object r12 = r4.f34023g
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r13 = r4.f34022f
            kotlin.jvm.internal.M r13 = (kotlin.jvm.internal.M) r13
            java.lang.Object r14 = r4.f34021e
            D4.n r14 = (D4.C6440n) r14
            java.lang.Object r15 = r4.f34020d
            D4.x r15 = (D4.C6449x) r15
            java.lang.Object r3 = r4.f34019c
            D4.G r3 = (D4.G) r3
            XH.y.b(r2)
            r16 = r14
            r14 = r0
            r0 = r16
            goto L_0x059f
        L_0x00fd:
            java.lang.Object r0 = r4.f34022f
            D4.I r0 = (D4.I) r0
            java.lang.Object r3 = r4.f34021e
            bK.a r3 = (bK.C17052a) r3
            java.lang.Object r5 = r4.f34020d
            D4.n r5 = (D4.C6440n) r5
            java.lang.Object r4 = r4.f34019c
            D4.x r4 = (D4.C6449x) r4
            XH.y.b(r2)     // Catch:{ all -> 0x0112 }
            goto L_0x053b
        L_0x0112:
            r0 = move-exception
        L_0x0113:
            r2 = 0
            goto L_0x0553
        L_0x0116:
            java.lang.Object r0 = r4.f34024h
            bK.a r0 = (bK.C17052a) r0
            java.lang.Object r3 = r4.f34023g
            D4.I$a r3 = (D4.I.a) r3
            java.lang.Object r6 = r4.f34022f
            D4.P$b r6 = (D4.P.b) r6
            java.lang.Object r7 = r4.f34021e
            D4.n r7 = (D4.C6440n) r7
            java.lang.Object r8 = r4.f34020d
            D4.x r8 = (D4.C6449x) r8
            java.lang.Object r9 = r4.f34019c
            D4.G r9 = (D4.G) r9
            XH.y.b(r2)
            r2 = r0
            r0 = r4
            r12 = r7
            r4 = r8
            goto L_0x0512
        L_0x0137:
            java.lang.Object r0 = r4.f34028l
            bK.a r0 = (bK.C17052a) r0
            java.lang.Object r3 = r4.f34027k
            D4.I$a r3 = (D4.I.a) r3
            java.lang.Object r6 = r4.f34026j
            D4.P$b r6 = (D4.P.b) r6
            java.lang.Object r8 = r4.f34025i
            D4.P$a r8 = (D4.P.a) r8
            java.lang.Object r9 = r4.f34024h
            kotlin.jvm.internal.K r9 = (kotlin.jvm.internal.K) r9
            java.lang.Object r10 = r4.f34023g
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            java.lang.Object r11 = r4.f34022f
            kotlin.jvm.internal.M r11 = (kotlin.jvm.internal.M) r11
            java.lang.Object r12 = r4.f34021e
            D4.n r12 = (D4.C6440n) r12
            java.lang.Object r13 = r4.f34020d
            D4.x r13 = (D4.C6449x) r13
            java.lang.Object r14 = r4.f34019c
            D4.G r14 = (D4.G) r14
            XH.y.b(r2)
            r2 = r0
            goto L_0x0458
        L_0x0165:
            java.lang.Object r0 = r4.f34025i
            D4.P$a r0 = (D4.P.a) r0
            java.lang.Object r3 = r4.f34024h
            kotlin.jvm.internal.K r3 = (kotlin.jvm.internal.K) r3
            java.lang.Object r6 = r4.f34023g
            kotlin.jvm.internal.O r6 = (kotlin.jvm.internal.O) r6
            java.lang.Object r8 = r4.f34022f
            kotlin.jvm.internal.M r8 = (kotlin.jvm.internal.M) r8
            java.lang.Object r9 = r4.f34021e
            D4.n r9 = (D4.C6440n) r9
            java.lang.Object r10 = r4.f34020d
            D4.x r10 = (D4.C6449x) r10
            java.lang.Object r11 = r4.f34019c
            D4.G r11 = (D4.G) r11
            XH.y.b(r2)
            r12 = r9
            r13 = r10
            r9 = r11
            r10 = r6
            r11 = r8
            r8 = r0
            r0 = r3
            goto L_0x03bd
        L_0x018d:
            java.lang.Object r0 = r4.f34026j
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            java.lang.Object r3 = r4.f34025i
            java.lang.Object r6 = r4.f34024h
            bK.a r6 = (bK.C17052a) r6
            java.lang.Object r8 = r4.f34023g
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r9 = r4.f34022f
            kotlin.jvm.internal.M r9 = (kotlin.jvm.internal.M) r9
            java.lang.Object r10 = r4.f34021e
            D4.n r10 = (D4.C6440n) r10
            java.lang.Object r11 = r4.f34020d
            D4.x r11 = (D4.C6449x) r11
            java.lang.Object r12 = r4.f34019c
            D4.G r12 = (D4.G) r12
            XH.y.b(r2)     // Catch:{ all -> 0x01b0 }
            goto L_0x0343
        L_0x01b0:
            r0 = move-exception
        L_0x01b1:
            r1 = 0
            goto L_0x06f3
        L_0x01b4:
            java.lang.Object r0 = r4.f34026j
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            java.lang.Object r3 = r4.f34025i
            bK.a r3 = (bK.C17052a) r3
            java.lang.Object r6 = r4.f34024h
            D4.I$a r6 = (D4.I.a) r6
            java.lang.Object r8 = r4.f34023g
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r9 = r4.f34022f
            kotlin.jvm.internal.M r9 = (kotlin.jvm.internal.M) r9
            java.lang.Object r10 = r4.f34021e
            D4.n r10 = (D4.C6440n) r10
            java.lang.Object r11 = r4.f34020d
            D4.x r11 = (D4.C6449x) r11
            java.lang.Object r12 = r4.f34019c
            D4.G r12 = (D4.G) r12
            XH.y.b(r2)
            goto L_0x030b
        L_0x01d9:
            java.lang.Object r0 = r4.f34024h
            bK.a r0 = (bK.C17052a) r0
            java.lang.Object r3 = r4.f34023g
            D4.I$a r3 = (D4.I.a) r3
            java.lang.Object r6 = r4.f34022f
            kotlin.jvm.internal.M r6 = (kotlin.jvm.internal.M) r6
            java.lang.Object r8 = r4.f34021e
            D4.n r8 = (D4.C6440n) r8
            java.lang.Object r9 = r4.f34020d
            D4.x r9 = (D4.C6449x) r9
            java.lang.Object r10 = r4.f34019c
            D4.G r10 = (D4.G) r10
            XH.y.b(r2)
            r2 = r0
            r0 = r9
            goto L_0x0223
        L_0x01f7:
            XH.y.b(r2)
            D4.x r2 = D4.C6449x.REFRESH
            if (r0 == r2) goto L_0x0701
            kotlin.jvm.internal.M r6 = new kotlin.jvm.internal.M
            r6.<init>()
            D4.I$a<Key, Value> r3 = r1.f33982k
            bK.a r2 = r3.f34103b
            r4.f34019c = r1
            r4.f34020d = r0
            r8 = r20
            r4.f34021e = r8
            r4.f34022f = r6
            r4.f34023g = r3
            r4.f34024h = r2
            r9 = 1
            r4.f34034r = r9
            r9 = 0
            java.lang.Object r10 = r2.e(r9, r4)
            if (r10 != r5) goto L_0x0222
            return r5
        L_0x0222:
            r10 = r1
        L_0x0223:
            D4.I r3 = r3.f34104c     // Catch:{ all -> 0x0257 }
            int[] r9 = D4.G.a.f33985a     // Catch:{ all -> 0x0257 }
            int r11 = r0.ordinal()     // Catch:{ all -> 0x0257 }
            r9 = r9[r11]     // Catch:{ all -> 0x0257 }
            r11 = 1
            if (r9 == r11) goto L_0x06f7
            r12 = 2
            if (r9 == r12) goto L_0x0281
            r12 = 3
            if (r9 == r12) goto L_0x023a
            goto L_0x02d4
        L_0x023a:
            int r9 = r3.l()     // Catch:{ all -> 0x0257 }
            D4.d0 r12 = r8.b()     // Catch:{ all -> 0x0257 }
            int r12 = r12.b()     // Catch:{ all -> 0x0257 }
            int r9 = r9 + r12
            int r9 = r9 + r11
            if (r9 >= 0) goto L_0x025b
            int r11 = r6.f144346a     // Catch:{ all -> 0x0257 }
            D4.L r12 = r10.f33974c     // Catch:{ all -> 0x0257 }
            int r12 = r12.f34121a     // Catch:{ all -> 0x0257 }
            int r9 = -r9
            int r12 = r12 * r9
            int r11 = r11 + r12
            r6.f144346a = r11     // Catch:{ all -> 0x0257 }
            r9 = 0
            goto L_0x025b
        L_0x0257:
            r0 = move-exception
            r1 = 0
            goto L_0x06fd
        L_0x025b:
            java.util.List r11 = r3.m()     // Catch:{ all -> 0x0257 }
            int r11 = YH.C16877v.p(r11)     // Catch:{ all -> 0x0257 }
            if (r9 > r11) goto L_0x02d4
        L_0x0265:
            int r12 = r6.f144346a     // Catch:{ all -> 0x0257 }
            java.util.List r13 = r3.m()     // Catch:{ all -> 0x0257 }
            java.lang.Object r13 = r13.get(r9)     // Catch:{ all -> 0x0257 }
            D4.P$b$b r13 = (D4.P.b.C0534b) r13     // Catch:{ all -> 0x0257 }
            java.util.List r13 = r13.b()     // Catch:{ all -> 0x0257 }
            int r13 = r13.size()     // Catch:{ all -> 0x0257 }
            int r12 = r12 + r13
            r6.f144346a = r12     // Catch:{ all -> 0x0257 }
            if (r9 == r11) goto L_0x02d4
            r12 = 1
            int r9 = r9 + r12
            goto L_0x0265
        L_0x0281:
            int r9 = r3.l()     // Catch:{ all -> 0x0257 }
            D4.d0 r11 = r8.b()     // Catch:{ all -> 0x0257 }
            int r11 = r11.a()     // Catch:{ all -> 0x0257 }
            int r9 = r9 + r11
            r11 = 1
            int r9 = r9 - r11
            java.util.List r11 = r3.m()     // Catch:{ all -> 0x0257 }
            int r11 = YH.C16877v.p(r11)     // Catch:{ all -> 0x0257 }
            if (r9 <= r11) goto L_0x02b5
            int r11 = r6.f144346a     // Catch:{ all -> 0x0257 }
            D4.L r12 = r10.f33974c     // Catch:{ all -> 0x0257 }
            int r12 = r12.f34121a     // Catch:{ all -> 0x0257 }
            java.util.List r13 = r3.m()     // Catch:{ all -> 0x0257 }
            int r13 = YH.C16877v.p(r13)     // Catch:{ all -> 0x0257 }
            int r9 = r9 - r13
            int r12 = r12 * r9
            int r11 = r11 + r12
            r6.f144346a = r11     // Catch:{ all -> 0x0257 }
            java.util.List r9 = r3.m()     // Catch:{ all -> 0x0257 }
            int r9 = YH.C16877v.p(r9)     // Catch:{ all -> 0x0257 }
        L_0x02b5:
            if (r9 < 0) goto L_0x02d4
            r11 = 0
        L_0x02b8:
            int r12 = r6.f144346a     // Catch:{ all -> 0x0257 }
            java.util.List r13 = r3.m()     // Catch:{ all -> 0x0257 }
            java.lang.Object r13 = r13.get(r11)     // Catch:{ all -> 0x0257 }
            D4.P$b$b r13 = (D4.P.b.C0534b) r13     // Catch:{ all -> 0x0257 }
            java.util.List r13 = r13.b()     // Catch:{ all -> 0x0257 }
            int r13 = r13.size()     // Catch:{ all -> 0x0257 }
            int r12 = r12 + r13
            r6.f144346a = r12     // Catch:{ all -> 0x0257 }
            if (r11 == r9) goto L_0x02d4
            r12 = 1
            int r11 = r11 + r12
            goto L_0x02b8
        L_0x02d4:
            XH.N r3 = XH.C16807N.f139792a     // Catch:{ all -> 0x0257 }
            r3 = 0
            r2.d(r3)
            kotlin.jvm.internal.O r2 = new kotlin.jvm.internal.O
            r2.<init>()
            D4.I$a<Key, Value> r3 = r10.f33982k
            bK.a r9 = r3.f34103b
            r4.f34019c = r10
            r4.f34020d = r0
            r4.f34021e = r8
            r4.f34022f = r6
            r4.f34023g = r2
            r4.f34024h = r3
            r4.f34025i = r9
            r4.f34026j = r2
            r11 = 2
            r4.f34034r = r11
            r11 = 0
            java.lang.Object r12 = r9.e(r11, r4)
            if (r12 != r5) goto L_0x0300
            return r5
        L_0x0300:
            r11 = r0
            r0 = r2
            r12 = r10
            r10 = r8
            r8 = r0
            r16 = r6
            r6 = r3
            r3 = r9
            r9 = r16
        L_0x030b:
            D4.I r2 = r6.f34104c     // Catch:{ all -> 0x0347 }
            int r6 = r10.a()     // Catch:{ all -> 0x0347 }
            D4.d0 r13 = r10.b()     // Catch:{ all -> 0x0347 }
            int r13 = r13.e(r11)     // Catch:{ all -> 0x0347 }
            int r14 = r9.f144346a     // Catch:{ all -> 0x0347 }
            int r13 = r13 + r14
            java.lang.Object r6 = r12.z(r2, r11, r6, r13)     // Catch:{ all -> 0x0347 }
            if (r6 == 0) goto L_0x034b
            r4.f34019c = r12     // Catch:{ all -> 0x0347 }
            r4.f34020d = r11     // Catch:{ all -> 0x0347 }
            r4.f34021e = r10     // Catch:{ all -> 0x0347 }
            r4.f34022f = r9     // Catch:{ all -> 0x0347 }
            r4.f34023g = r8     // Catch:{ all -> 0x0347 }
            r4.f34024h = r3     // Catch:{ all -> 0x0347 }
            r4.f34025i = r6     // Catch:{ all -> 0x0347 }
            r4.f34026j = r0     // Catch:{ all -> 0x0347 }
            r13 = 3
            r4.f34034r = r13     // Catch:{ all -> 0x0347 }
            java.lang.Object r2 = r12.C(r2, r11, r4)     // Catch:{ all -> 0x0347 }
            if (r2 != r5) goto L_0x033e
            return r5
        L_0x033e:
            r16 = r6
            r6 = r3
            r3 = r16
        L_0x0343:
            r2 = r3
            r3 = r6
        L_0x0345:
            r6 = 0
            goto L_0x034d
        L_0x0347:
            r0 = move-exception
            r6 = r3
            goto L_0x01b1
        L_0x034b:
            r2 = 0
            goto L_0x0345
        L_0x034d:
            r3.d(r6)
            r0.f144348a = r2
            kotlin.jvm.internal.K r0 = new kotlin.jvm.internal.K
            r0.<init>()
        L_0x0357:
            T r2 = r8.f144348a
            if (r2 == 0) goto L_0x06f0
            D4.P$a r2 = r12.x(r11, r2)
            D4.y r3 = D4.C6451z.a()
            if (r3 == 0) goto L_0x0397
            r6 = 3
            boolean r13 = r3.b(r6)
            r6 = 1
            if (r13 != r6) goto L_0x0397
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "Start "
            r6.append(r13)
            r6.append(r11)
            java.lang.String r13 = " with loadKey "
            r6.append(r13)
            T r13 = r8.f144348a
            r6.append(r13)
            java.lang.String r13 = " on "
            r6.append(r13)
            D4.P<Key, Value> r13 = r12.f33973b
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            r13 = 3
            r14 = 0
            r3.a(r13, r6, r14)
        L_0x0397:
            D4.P<Key, Value> r3 = r12.f33973b
            r4.f34019c = r12
            r4.f34020d = r11
            r4.f34021e = r10
            r4.f34022f = r9
            r4.f34023g = r8
            r4.f34024h = r0
            r4.f34025i = r2
            r6 = 0
            r4.f34026j = r6
            r4.f34027k = r6
            r6 = 4
            r4.f34034r = r6
            java.lang.Object r3 = r3.f(r2, r4)
            if (r3 != r5) goto L_0x03b6
            return r5
        L_0x03b6:
            r13 = r11
            r11 = r9
            r9 = r12
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r3
        L_0x03bd:
            r6 = r2
            D4.P$b r6 = (D4.P.b) r6
            boolean r2 = r6 instanceof D4.P.b.C0534b
            if (r2 == 0) goto L_0x04d3
            int[] r2 = D4.G.a.f33985a
            int r3 = r13.ordinal()
            r2 = r2[r3]
            r3 = 2
            if (r2 == r3) goto L_0x03e0
            r3 = 3
            if (r2 != r3) goto L_0x03da
            r2 = r6
            D4.P$b$b r2 = (D4.P.b.C0534b) r2
            java.lang.Object r2 = r2.m()
            goto L_0x03e7
        L_0x03da:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L_0x03e0:
            r2 = r6
            D4.P$b$b r2 = (D4.P.b.C0534b) r2
            java.lang.Object r2 = r2.p()
        L_0x03e7:
            D4.P<Key, Value> r3 = r9.f33973b
            boolean r3 = r3.c()
            if (r3 != 0) goto L_0x0431
            T r3 = r10.f144348a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r3)
            if (r2 != 0) goto L_0x03f8
            goto L_0x0431
        L_0x03f8:
            D4.x r0 = D4.C6449x.PREPEND
            if (r13 != r0) goto L_0x03ff
            java.lang.String r0 = "prevKey"
            goto L_0x0401
        L_0x03ff:
            java.lang.String r0 = "nextKey"
        L_0x0401:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The same value, "
            r2.append(r3)
            T r3 = r10.f144348a
            r2.append(r3)
            java.lang.String r3 = ", was passed as the "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            r3 = 1
            java.lang.String r0 = HJ.C15854t.o(r0, r2, r3, r2)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0431:
            D4.I$a<Key, Value> r3 = r9.f33982k
            bK.a r2 = r3.f34103b
            r4.f34019c = r9
            r4.f34020d = r13
            r4.f34021e = r12
            r4.f34022f = r11
            r4.f34023g = r10
            r4.f34024h = r0
            r4.f34025i = r8
            r4.f34026j = r6
            r4.f34027k = r3
            r4.f34028l = r2
            r14 = 5
            r4.f34034r = r14
            r14 = 0
            java.lang.Object r15 = r2.e(r14, r4)
            if (r15 != r5) goto L_0x0456
            return r5
        L_0x0456:
            r14 = r9
            r9 = r0
        L_0x0458:
            D4.I r0 = r3.f34104c     // Catch:{ all -> 0x04cd }
            int r3 = r12.a()     // Catch:{ all -> 0x04cd }
            r15 = r6
            D4.P$b$b r15 = (D4.P.b.C0534b) r15     // Catch:{ all -> 0x04cd }
            boolean r0 = r0.r(r3, r13, r15)     // Catch:{ all -> 0x04cd }
            r3 = 0
            r2.d(r3)
            if (r0 != 0) goto L_0x0486
            D4.y r0 = D4.C6451z.a()
            if (r0 == 0) goto L_0x06f0
            r2 = 2
            boolean r4 = r0.b(r2)
            r5 = 1
            if (r4 != r5) goto L_0x06f0
            T r4 = r10.f144348a
            java.lang.String r4 = r14.y(r13, r4, r3)
            r0.a(r2, r4, r3)
            goto L_0x06f0
        L_0x0486:
            D4.y r0 = D4.C6451z.a()
            r3 = 3
            if (r0 == 0) goto L_0x049e
            boolean r2 = r0.b(r3)
            r15 = 1
            if (r2 != r15) goto L_0x049e
            T r2 = r10.f144348a
            java.lang.String r2 = r14.y(r13, r2, r6)
            r15 = 0
            r0.a(r3, r2, r15)
        L_0x049e:
            int r0 = r11.f144346a
            r2 = r6
            D4.P$b$b r2 = (D4.P.b.C0534b) r2
            java.util.List r15 = r2.b()
            int r15 = r15.size()
            int r0 = r0 + r15
            r11.f144346a = r0
            D4.x r0 = D4.C6449x.PREPEND
            if (r13 != r0) goto L_0x04bb
            java.lang.Object r0 = r2.p()
            if (r0 == 0) goto L_0x04b9
            goto L_0x04bb
        L_0x04b9:
            r0 = 1
            goto L_0x04c6
        L_0x04bb:
            D4.x r0 = D4.C6449x.APPEND
            if (r13 != r0) goto L_0x04c8
            java.lang.Object r0 = r2.m()
            if (r0 != 0) goto L_0x04c8
            goto L_0x04b9
        L_0x04c6:
            r9.f144344a = r0
        L_0x04c8:
            r0 = r9
            r9 = r14
        L_0x04ca:
            r15 = 1
            goto L_0x0557
        L_0x04cd:
            r0 = move-exception
            r14 = 0
            r2.d(r14)
            throw r0
        L_0x04d3:
            r3 = 3
            r14 = 0
            boolean r2 = r6 instanceof D4.P.b.a
            if (r2 == 0) goto L_0x04ca
            D4.y r0 = D4.C6451z.a()
            if (r0 == 0) goto L_0x04f0
            r2 = 2
            boolean r3 = r0.b(r2)
            r15 = 1
            if (r3 != r15) goto L_0x04f0
            T r3 = r10.f144348a
            java.lang.String r3 = r9.y(r13, r3, r6)
            r0.a(r2, r3, r14)
        L_0x04f0:
            D4.I$a<Key, Value> r3 = r9.f33982k
            bK.a r0 = r3.f34103b
            r4.f34019c = r9
            r4.f34020d = r13
            r4.f34021e = r12
            r4.f34022f = r6
            r4.f34023g = r3
            r4.f34024h = r0
            r2 = 0
            r4.f34025i = r2
            r7 = 6
            r4.f34034r = r7
            java.lang.Object r7 = r0.e(r2, r4)
            if (r7 != r5) goto L_0x050f
            return r5
        L_0x050f:
            r2 = r0
            r0 = r4
            r4 = r13
        L_0x0512:
            D4.I r3 = r3.f34104c     // Catch:{ all -> 0x054f }
            D4.v$a r7 = new D4.v$a     // Catch:{ all -> 0x054f }
            D4.P$b$a r6 = (D4.P.b.a) r6     // Catch:{ all -> 0x054f }
            java.lang.Throwable r6 = r6.b()     // Catch:{ all -> 0x054f }
            r7.<init>(r6)     // Catch:{ all -> 0x054f }
            r0.f34019c = r4     // Catch:{ all -> 0x054f }
            r0.f34020d = r12     // Catch:{ all -> 0x054f }
            r0.f34021e = r2     // Catch:{ all -> 0x054f }
            r0.f34022f = r3     // Catch:{ all -> 0x054f }
            r6 = 0
            r0.f34023g = r6     // Catch:{ all -> 0x054f }
            r0.f34024h = r6     // Catch:{ all -> 0x054f }
            r6 = 7
            r0.f34034r = r6     // Catch:{ all -> 0x054f }
            java.lang.Object r0 = r9.B(r3, r4, r7, r0)     // Catch:{ all -> 0x054f }
            if (r0 != r5) goto L_0x0538
            return r5
        L_0x0538:
            r0 = r3
            r5 = r12
            r3 = r2
        L_0x053b:
            java.util.Map r0 = r0.k()     // Catch:{ all -> 0x0112 }
            D4.d0 r2 = r5.b()     // Catch:{ all -> 0x0112 }
            r0.put(r4, r2)     // Catch:{ all -> 0x0112 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0112 }
            r2 = 0
            r3.d(r2)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x054f:
            r0 = move-exception
            r3 = r2
            goto L_0x0113
        L_0x0553:
            r3.d(r2)
            throw r0
        L_0x0557:
            int[] r2 = D4.G.a.f33985a
            int r14 = r13.ordinal()
            r2 = r2[r14]
            r14 = 2
            if (r2 != r14) goto L_0x0565
            D4.x r2 = D4.C6449x.APPEND
            goto L_0x0567
        L_0x0565:
            D4.x r2 = D4.C6449x.PREPEND
        L_0x0567:
            D4.I$a<Key, Value> r3 = r9.f33982k
            bK.a r14 = r3.f34103b
            r4.f34019c = r9
            r4.f34020d = r13
            r4.f34021e = r12
            r4.f34022f = r11
            r4.f34023g = r10
            r4.f34024h = r0
            r4.f34025i = r8
            r4.f34026j = r6
            r4.f34027k = r2
            r4.f34028l = r3
            r4.f34029m = r14
            r15 = 8
            r4.f34034r = r15
            r19 = r0
            r15 = 0
            java.lang.Object r0 = r14.e(r15, r4)
            if (r0 != r5) goto L_0x0591
            return r5
        L_0x0591:
            r0 = r12
            r15 = r13
            r12 = r10
            r13 = r11
            r11 = r19
            r10 = r8
            r8 = r2
            r16 = r6
            r6 = r3
            r3 = r9
            r9 = r16
        L_0x059f:
            D4.I r2 = r6.f34104c     // Catch:{ all -> 0x05e8 }
            D4.d0 r6 = r0.b()     // Catch:{ all -> 0x05e8 }
            D4.E$a r6 = r2.i(r8, r6)     // Catch:{ all -> 0x05e8 }
            if (r6 == 0) goto L_0x05ec
            r2.h(r6)     // Catch:{ all -> 0x05e8 }
            SJ.j<D4.E<Value>> r8 = r3.f33981j     // Catch:{ all -> 0x05e8 }
            r4.f34019c = r3     // Catch:{ all -> 0x05e8 }
            r4.f34020d = r15     // Catch:{ all -> 0x05e8 }
            r4.f34021e = r0     // Catch:{ all -> 0x05e8 }
            r4.f34022f = r13     // Catch:{ all -> 0x05e8 }
            r4.f34023g = r12     // Catch:{ all -> 0x05e8 }
            r4.f34024h = r11     // Catch:{ all -> 0x05e8 }
            r4.f34025i = r10     // Catch:{ all -> 0x05e8 }
            r4.f34026j = r9     // Catch:{ all -> 0x05e8 }
            r4.f34027k = r14     // Catch:{ all -> 0x05e8 }
            r4.f34028l = r2     // Catch:{ all -> 0x05e8 }
            r1 = 0
            r4.f34029m = r1     // Catch:{ all -> 0x05e8 }
            r1 = 9
            r4.f34034r = r1     // Catch:{ all -> 0x05e8 }
            java.lang.Object r1 = r8.y(r6, r4)     // Catch:{ all -> 0x05e8 }
            if (r1 != r5) goto L_0x05d4
            return r5
        L_0x05d4:
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r6 = r14
            r14 = r15
            r13 = r0
            r0 = r2
            r15 = r3
        L_0x05de:
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x0096 }
            r2 = r0
            r0 = r13
            r3 = r15
            r13 = r12
            r15 = r14
            r12 = r11
            r11 = r10
            goto L_0x05ef
        L_0x05e8:
            r0 = move-exception
            r6 = r14
            goto L_0x0097
        L_0x05ec:
            r8 = r9
            r9 = r10
            r6 = r14
        L_0x05ef:
            int r1 = r0.a()     // Catch:{ all -> 0x0096 }
            D4.d0 r10 = r0.b()     // Catch:{ all -> 0x0096 }
            int r10 = r10.e(r15)     // Catch:{ all -> 0x0096 }
            int r14 = r13.f144346a     // Catch:{ all -> 0x0096 }
            int r10 = r10 + r14
            java.lang.Object r1 = r3.z(r2, r15, r1, r10)     // Catch:{ all -> 0x0096 }
            r12.f144348a = r1     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x062a
            D4.C r1 = r2.p()     // Catch:{ all -> 0x0096 }
            D4.v r1 = r1.a(r15)     // Catch:{ all -> 0x0096 }
            boolean r1 = r1 instanceof D4.C6447v.a     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x062a
            D4.C r1 = r2.p()     // Catch:{ all -> 0x0096 }
            boolean r10 = r11.f144344a     // Catch:{ all -> 0x0096 }
            if (r10 == 0) goto L_0x0621
            D4.v$c$a r10 = D4.C6447v.c.f34457b     // Catch:{ all -> 0x0096 }
            D4.v$c r10 = r10.a()     // Catch:{ all -> 0x0096 }
            goto L_0x0627
        L_0x0621:
            D4.v$c$a r10 = D4.C6447v.c.f34457b     // Catch:{ all -> 0x0096 }
            D4.v$c r10 = r10.b()     // Catch:{ all -> 0x0096 }
        L_0x0627:
            r1.c(r15, r10)     // Catch:{ all -> 0x0096 }
        L_0x062a:
            r1 = r8
            D4.P$b$b r1 = (D4.P.b.C0534b) r1     // Catch:{ all -> 0x0096 }
            D4.E r1 = r2.u(r1, r15)     // Catch:{ all -> 0x0096 }
            SJ.j<D4.E<Value>> r2 = r3.f33981j     // Catch:{ all -> 0x0096 }
            r4.f34019c = r3     // Catch:{ all -> 0x0096 }
            r4.f34020d = r15     // Catch:{ all -> 0x0096 }
            r4.f34021e = r0     // Catch:{ all -> 0x0096 }
            r4.f34022f = r13     // Catch:{ all -> 0x0096 }
            r4.f34023g = r12     // Catch:{ all -> 0x0096 }
            r4.f34024h = r11     // Catch:{ all -> 0x0096 }
            r4.f34025i = r9     // Catch:{ all -> 0x0096 }
            r4.f34026j = r8     // Catch:{ all -> 0x0096 }
            r4.f34027k = r6     // Catch:{ all -> 0x0096 }
            r10 = 0
            r4.f34028l = r10     // Catch:{ all -> 0x0096 }
            r4.f34029m = r10     // Catch:{ all -> 0x0096 }
            r10 = 10
            r4.f34034r = r10     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r2.y(r1, r4)     // Catch:{ all -> 0x0096 }
            if (r1 != r5) goto L_0x0655
            return r5
        L_0x0655:
            r10 = r0
            r14 = r3
            r0 = r8
            r8 = r9
            r9 = r11
            r11 = r15
        L_0x065b:
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x0096 }
            r1 = 0
            r6.d(r1)
            boolean r1 = r8 instanceof D4.P.a.c
            if (r1 == 0) goto L_0x0670
            r1 = r0
            D4.P$b$b r1 = (D4.P.b.C0534b) r1
            java.lang.Object r1 = r1.p()
            if (r1 != 0) goto L_0x0670
            r6 = 1
            goto L_0x0671
        L_0x0670:
            r6 = 0
        L_0x0671:
            boolean r1 = r8 instanceof D4.P.a.C0532a
            if (r1 == 0) goto L_0x067f
            D4.P$b$b r0 = (D4.P.b.C0534b) r0
            java.lang.Object r0 = r0.m()
            if (r0 != 0) goto L_0x067f
            r0 = 1
            goto L_0x0680
        L_0x067f:
            r0 = 0
        L_0x0680:
            D4.U<Key, Value> r1 = r14.f33976e
            if (r1 == 0) goto L_0x06e4
            if (r6 != 0) goto L_0x0688
            if (r0 == 0) goto L_0x06e4
        L_0x0688:
            D4.I$a<Key, Value> r1 = r14.f33982k
            bK.a r2 = r1.f34103b
            r4.f34019c = r14
            r4.f34020d = r11
            r4.f34021e = r10
            r4.f34022f = r13
            r4.f34023g = r12
            r4.f34024h = r9
            r4.f34025i = r1
            r4.f34026j = r2
            r3 = 0
            r4.f34027k = r3
            r4.f34030n = r6
            r4.f34031o = r0
            r8 = 11
            r4.f34034r = r8
            java.lang.Object r8 = r2.e(r3, r4)
            if (r8 != r5) goto L_0x06b0
            return r5
        L_0x06b0:
            r8 = r12
            r12 = r14
            r14 = r9
            r9 = r13
            r13 = r1
        L_0x06b5:
            D4.I r1 = r13.f34104c     // Catch:{ all -> 0x06de }
            D4.o r3 = r12.f33979h     // Catch:{ all -> 0x06de }
            D4.d0$a r3 = r3.b()     // Catch:{ all -> 0x06de }
            D4.Q r1 = r1.g(r3)     // Catch:{ all -> 0x06de }
            r3 = 0
            r2.d(r3)
            if (r6 == 0) goto L_0x06d0
            D4.U<Key, Value> r2 = r12.f33976e
            D4.x r3 = D4.C6449x.PREPEND
            r2.d(r3, r1)
        L_0x06d0:
            if (r0 == 0) goto L_0x06d9
            D4.U<Key, Value> r0 = r12.f33976e
            D4.x r2 = D4.C6449x.APPEND
            r0.d(r2, r1)
        L_0x06d9:
            r1 = r18
            r0 = r14
            goto L_0x0357
        L_0x06de:
            r0 = move-exception
            r1 = 0
            r2.d(r1)
            throw r0
        L_0x06e4:
            r1 = r18
            r0 = r9
            r8 = r12
            r9 = r13
            r12 = r14
            goto L_0x0357
        L_0x06ec:
            r6.d(r1)
            throw r0
        L_0x06f0:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x06f3:
            r6.d(r1)
            throw r0
        L_0x06f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0257 }
            r0.<init>(r7)     // Catch:{ all -> 0x0257 }
            throw r0     // Catch:{ all -> 0x0257 }
        L_0x06fd:
            r2.d(r1)
            throw r0
        L_0x0701:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.G.t(D4.x, D4.n, dI.e):java.lang.Object");
    }

    private final P.a<Key> x(C6449x xVar, Key key) {
        return P.a.f34189c.a(xVar, key, xVar == C6449x.REFRESH ? this.f33974c.f34124d : this.f33974c.f34121a, this.f33974c.f34123c);
    }

    private final String y(C6449x xVar, Key key, P.b<Key, Value> bVar) {
        if (bVar == null) {
            return "End " + xVar + " with loadkey " + key + ". Load CANCELLED.";
        }
        return "End " + xVar + " with loadKey " + key + ". Returned " + bVar;
    }

    private final Key z(I<Key, Value> i10, C6449x xVar, int i11, int i12) {
        if (i11 == i10.j(xVar) && !(i10.p().a(xVar) instanceof C6447v.a) && i12 < this.f33974c.f34122b) {
            return xVar == C6449x.PREPEND ? ((P.b.C0534b) C16877v.w0(i10.m())).p() : ((P.b.C0534b) C16877v.I0(i10.m())).m();
        }
        return null;
    }

    public final void o(d0 d0Var) {
        C17542s.j(d0Var, "viewportHint");
        this.f33979h.d(d0Var);
    }

    public final void p() {
        F0.a.a(this.f33983l, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(dI.C17164e<? super D4.Q<Key, Value>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof D4.G.f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            D4.G$f r0 = (D4.G.f) r0
            int r1 = r0.f34011h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f34011h = r1
            goto L_0x0018
        L_0x0013:
            D4.G$f r0 = new D4.G$f
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f34009f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f34011h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r1 = r0.f34008e
            bK.a r1 = (bK.C17052a) r1
            java.lang.Object r2 = r0.f34007d
            D4.I$a r2 = (D4.I.a) r2
            java.lang.Object r0 = r0.f34006c
            D4.G r0 = (D4.G) r0
            XH.y.b(r6)
            goto L_0x0058
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003e:
            XH.y.b(r6)
            D4.I$a<Key, Value> r2 = r5.f33982k
            bK.a r6 = r2.f34103b
            r0.f34006c = r5
            r0.f34007d = r2
            r0.f34008e = r6
            r0.f34011h = r3
            java.lang.Object r0 = r6.e(r4, r0)
            if (r0 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0 = r5
            r1 = r6
        L_0x0058:
            D4.I r6 = r2.f34104c     // Catch:{ all -> 0x006a }
            D4.o r0 = r0.f33979h     // Catch:{ all -> 0x006a }
            D4.d0$a r0 = r0.b()     // Catch:{ all -> 0x006a }
            D4.Q r6 = r6.g(r0)     // Catch:{ all -> 0x006a }
            r1.d(r4)
            return r6
        L_0x006a:
            r6 = move-exception
            r1.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.G.r(dI.e):java.lang.Object");
    }

    public final C16532g<E<Value>> u() {
        return this.f33984m;
    }

    public final P<Key, Value> v() {
        return this.f33973b;
    }

    public final U<Key, Value> w() {
        return this.f33976e;
    }
}
