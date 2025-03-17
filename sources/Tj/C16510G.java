package TJ;

import QJ.C16315k0;
import QJ.C16324p;
import QJ.r;
import SJ.C16428d;
import UJ.C16609b;
import UJ.C16610c;
import UJ.C16611d;
import UJ.C16624q;
import WJ.C16735D;
import XH.C16807N;
import XH.t;
import XH.x;
import YH.C16877v;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010 \n\u0002\b\u0013\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001\u0015B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e2\u0006\u0010$\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J-\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b/\u0010\u0016J\u0017\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0016J\u000f\u00100\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u0010(J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u001aH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\u00172\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J9\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001e2\u0010\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001e2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0002¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H@¢\u0006\u0004\b<\u0010\u0019J\u0017\u0010?\u001a\u00020\u00172\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J/\u0010E\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u001aH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0017H\u0002¢\u0006\u0004\bG\u0010(J\u0019\u0010I\u001a\u0004\u0018\u00010\u00052\u0006\u0010H\u001a\u00020\u0003H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u0004\u0018\u00010\u00052\u0006\u0010M\u001a\u00020\u001aH\u0002¢\u0006\u0004\bN\u0010OJ\u0018\u0010P\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0003H@¢\u0006\u0004\bP\u0010QJ3\u0010S\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001e2\u0014\u0010R\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001eH\u0002¢\u0006\u0004\bS\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u00105R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR \u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010SR\u0016\u0010^\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010SR\u0016\u0010`\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u00105R\u0016\u0010b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u00105R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000c8VX\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001a\u0010j\u001a\u00028\u00008DX\u0004¢\u0006\f\u0012\u0004\bi\u0010(\u001a\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u001cR\u0014\u0010o\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\bp\u0010nR\u0014\u0010s\u001a\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\br\u0010\u001cR\u0014\u0010u\u001a\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\u001c¨\u0006v"}, d2 = {"LTJ/G;", "T", "LUJ/b;", "LTJ/I;", "LTJ/A;", "", "LUJ/q;", "", "replay", "bufferCapacity", "LSJ/d;", "onBufferOverflow", "<init>", "(IILSJ/d;)V", "LTJ/h;", "collector", "", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "value", "", "a", "(Ljava/lang/Object;)Z", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "", "Y", "()J", "oldIndex", "", "LdI/e;", "X", "(J)[LdI/e;", "D", "()LTJ/I;", "size", "E", "(I)[LTJ/I;", "f", "()V", "LdI/i;", "context", "capacity", "LTJ/g;", "d", "(LdI/i;ILSJ/d;)LTJ/g;", "S", "F", "newHead", "C", "(J)V", "item", "I", "(Ljava/lang/Object;)V", "curBuffer", "curSize", "newSize", "R", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "H", "LTJ/G$a;", "emitter", "z", "(LTJ/G$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "W", "(JJJJ)V", "A", "slot", "V", "(LTJ/I;)Ljava/lang/Object;", "U", "(LTJ/I;)J", "index", "N", "(J)Ljava/lang/Object;", "y", "(LTJ/I;LdI/e;)Ljava/lang/Object;", "resumesIn", "J", "([LdI/e;)[LdI/e;", "e", "g", "LSJ/d;", "h", "[Ljava/lang/Object;", "buffer", "i", "replayIndex", "j", "minCollectorIndex", "k", "bufferSize", "l", "queueSize", "", "c", "()Ljava/util/List;", "replayCache", "M", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "L", "head", "P", "()I", "replaySize", "Q", "totalSize", "K", "bufferEndIndex", "O", "queueEndIndex", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.G  reason: case insensitive filesystem */
public class C16510G<T> extends C16609b<C16512I> implements C16504A<T>, C16532g, C16624q<T> {

    /* renamed from: e  reason: collision with root package name */
    private final int f138543e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final int f138544f;

    /* renamed from: g  reason: collision with root package name */
    private final C16428d f138545g;

    /* renamed from: h  reason: collision with root package name */
    private Object[] f138546h;

    /* renamed from: i  reason: collision with root package name */
    private long f138547i;

    /* renamed from: j  reason: collision with root package name */
    private long f138548j;

    /* renamed from: k  reason: collision with root package name */
    private int f138549k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f138550l;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LTJ/G$a;", "LQJ/k0;", "LTJ/G;", "flow", "", "index", "", "value", "LdI/e;", "LXH/N;", "cont", "<init>", "(LTJ/G;JLjava/lang/Object;LdI/e;)V", "b", "()V", "a", "LTJ/G;", "J", "c", "Ljava/lang/Object;", "d", "LdI/e;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.G$a */
    private static final class a implements C16315k0 {

        /* renamed from: a  reason: collision with root package name */
        public final C16510G<?> f138551a;

        /* renamed from: b  reason: collision with root package name */
        public long f138552b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f138553c;

        /* renamed from: d  reason: collision with root package name */
        public final C17164e<C16807N> f138554d;

        public a(C16510G<?> g10, long j10, Object obj, C17164e<? super C16807N> eVar) {
            this.f138551a = g10;
            this.f138552b = j10;
            this.f138553c = obj;
            this.f138554d = eVar;
        }

        public void b() {
            this.f138551a.z(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.G$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f138555a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                SJ.d[] r0 = SJ.C16428d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SJ.d r1 = SJ.C16428d.SUSPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SJ.d r1 = SJ.C16428d.DROP_LATEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                SJ.d r1 = SJ.C16428d.DROP_OLDEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f138555a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16510G.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
    /* renamed from: TJ.G$c */
    static final class c<T> extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f138556c;

        /* renamed from: d  reason: collision with root package name */
        Object f138557d;

        /* renamed from: e  reason: collision with root package name */
        Object f138558e;

        /* renamed from: f  reason: collision with root package name */
        Object f138559f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f138560g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C16510G<T> f138561h;

        /* renamed from: i  reason: collision with root package name */
        int f138562i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C16510G<T> g10, C17164e<? super c> eVar) {
            super(eVar);
            this.f138561h = g10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f138560g = obj;
            this.f138562i |= Integer.MIN_VALUE;
            return C16510G.B(this.f138561h, (C16533h) null, this);
        }
    }

    public C16510G(int i10, int i11, C16428d dVar) {
        this.f138543e = i10;
        this.f138544f = i11;
        this.f138545g = dVar;
    }

    private final void A() {
        if (this.f138544f != 0 || this.f138550l > 1) {
            Object[] objArr = this.f138546h;
            C17542s.g(objArr);
            while (this.f138550l > 0 && C16511H.f(objArr, (L() + ((long) Q())) - 1) == C16511H.f138563a) {
                this.f138550l--;
                C16511H.g(objArr, L() + ((long) Q()), (Object) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: TJ.I} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1 A[Catch:{ all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[Catch:{ all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ <T> java.lang.Object B(TJ.C16510G<T> r8, TJ.C16533h<? super T> r9, dI.C17164e<?> r10) {
        /*
            boolean r0 = r10 instanceof TJ.C16510G.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            TJ.G$c r0 = (TJ.C16510G.c) r0
            int r1 = r0.f138562i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138562i = r1
            goto L_0x0018
        L_0x0013:
            TJ.G$c r0 = new TJ.G$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f138560g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138562i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r5) goto L_0x005f
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r8 = r0.f138559f
            QJ.F0 r8 = (QJ.F0) r8
            java.lang.Object r9 = r0.f138558e
            TJ.I r9 = (TJ.C16512I) r9
            java.lang.Object r2 = r0.f138557d
            TJ.h r2 = (TJ.C16533h) r2
            java.lang.Object r5 = r0.f138556c
            TJ.G r5 = (TJ.C16510G) r5
        L_0x003b:
            XH.y.b(r10)     // Catch:{ all -> 0x003f }
            goto L_0x005b
        L_0x003f:
            r8 = move-exception
            goto L_0x00dc
        L_0x0042:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004a:
            java.lang.Object r8 = r0.f138559f
            QJ.F0 r8 = (QJ.F0) r8
            java.lang.Object r9 = r0.f138558e
            TJ.I r9 = (TJ.C16512I) r9
            java.lang.Object r2 = r0.f138557d
            TJ.h r2 = (TJ.C16533h) r2
            java.lang.Object r5 = r0.f138556c
            TJ.G r5 = (TJ.C16510G) r5
            goto L_0x003b
        L_0x005b:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x00a9
        L_0x005f:
            java.lang.Object r8 = r0.f138558e
            r9 = r8
            TJ.I r9 = (TJ.C16512I) r9
            java.lang.Object r8 = r0.f138557d
            TJ.h r8 = (TJ.C16533h) r8
            java.lang.Object r2 = r0.f138556c
            TJ.G r2 = (TJ.C16510G) r2
            XH.y.b(r10)     // Catch:{ all -> 0x0072 }
            r10 = r8
            r8 = r2
            goto L_0x009d
        L_0x0072:
            r8 = move-exception
            r5 = r2
            goto L_0x00dc
        L_0x0076:
            XH.y.b(r10)
            UJ.d r10 = r8.i()
            TJ.I r10 = (TJ.C16512I) r10
            boolean r2 = r9 instanceof TJ.C16523U     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x009a
            r2 = r9
            TJ.U r2 = (TJ.C16523U) r2     // Catch:{ all -> 0x0095 }
            r0.f138556c = r8     // Catch:{ all -> 0x0095 }
            r0.f138557d = r9     // Catch:{ all -> 0x0095 }
            r0.f138558e = r10     // Catch:{ all -> 0x0095 }
            r0.f138562i = r5     // Catch:{ all -> 0x0095 }
            java.lang.Object r2 = r2.c(r0)     // Catch:{ all -> 0x0095 }
            if (r2 != r1) goto L_0x009a
            return r1
        L_0x0095:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
            goto L_0x00dc
        L_0x009a:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x009d:
            dI.i r2 = r0.getContext()     // Catch:{ all -> 0x00c2 }
            QJ.F0$b r5 = QJ.F0.f137562d0     // Catch:{ all -> 0x00c2 }
            dI.i$b r2 = r2.get(r5)     // Catch:{ all -> 0x00c2 }
            QJ.F0 r2 = (QJ.F0) r2     // Catch:{ all -> 0x00c2 }
        L_0x00a9:
            java.lang.Object r5 = r8.V(r9)     // Catch:{ all -> 0x00c2 }
            WJ.D r6 = TJ.C16511H.f138563a     // Catch:{ all -> 0x00c2 }
            if (r5 != r6) goto L_0x00c6
            r0.f138556c = r8     // Catch:{ all -> 0x00c2 }
            r0.f138557d = r10     // Catch:{ all -> 0x00c2 }
            r0.f138558e = r9     // Catch:{ all -> 0x00c2 }
            r0.f138559f = r2     // Catch:{ all -> 0x00c2 }
            r0.f138562i = r4     // Catch:{ all -> 0x00c2 }
            java.lang.Object r5 = r8.y(r9, r0)     // Catch:{ all -> 0x00c2 }
            if (r5 != r1) goto L_0x00a9
            return r1
        L_0x00c2:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x00dc
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb
            QJ.I0.k(r2)     // Catch:{ all -> 0x00c2 }
        L_0x00cb:
            r0.f138556c = r8     // Catch:{ all -> 0x00c2 }
            r0.f138557d = r10     // Catch:{ all -> 0x00c2 }
            r0.f138558e = r9     // Catch:{ all -> 0x00c2 }
            r0.f138559f = r2     // Catch:{ all -> 0x00c2 }
            r0.f138562i = r3     // Catch:{ all -> 0x00c2 }
            java.lang.Object r5 = r10.emit(r5, r0)     // Catch:{ all -> 0x00c2 }
            if (r5 != r1) goto L_0x00a9
            return r1
        L_0x00dc:
            r5.l(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16510G.B(TJ.G, TJ.h, dI.e):java.lang.Object");
    }

    private final void C(long j10) {
        C16611d[] h10;
        if (!(this.f139092b == 0 || (h10 = this.f139091a) == null)) {
            for (C16611d dVar : h10) {
                if (dVar != null) {
                    C16512I i10 = (C16512I) dVar;
                    long j11 = i10.f138564a;
                    if (j11 >= 0 && j11 < j10) {
                        i10.f138564a = j10;
                    }
                }
            }
        }
        this.f138548j = j10;
    }

    private final void F() {
        Object[] objArr = this.f138546h;
        C17542s.g(objArr);
        C16511H.g(objArr, L(), (Object) null);
        this.f138549k--;
        long L10 = L() + 1;
        if (this.f138547i < L10) {
            this.f138547i = L10;
        }
        if (this.f138548j < L10) {
            C(L10);
        }
    }

    static /* synthetic */ <T> Object G(C16510G<T> g10, T t10, C17164e<? super C16807N> eVar) {
        if (g10.a(t10)) {
            return C16807N.f139792a;
        }
        Object H10 = g10.H(t10, eVar);
        return H10 == C17187b.f() ? H10 : C16807N.f139792a;
    }

    private final Object H(T t10, C17164e<? super C16807N> eVar) {
        C17164e<C16807N>[] eVarArr;
        a aVar;
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        C17164e<C16807N>[] eVarArr2 = C16610c.f139095a;
        synchronized (this) {
            try {
                if (S(t10)) {
                    x.a aVar2 = x.f139812b;
                    pVar.resumeWith(x.b(C16807N.f139792a));
                    eVarArr = J(eVarArr2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, ((long) Q()) + L(), t10, pVar);
                    I(aVar3);
                    this.f138550l = this.f138550l + 1;
                    if (this.f138544f == 0) {
                        eVarArr2 = J(eVarArr2);
                    }
                    eVarArr = eVarArr2;
                    aVar = aVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            r.a(pVar, aVar);
        }
        for (C17164e<C16807N> eVar2 : eVarArr) {
            if (eVar2 != null) {
                x.a aVar4 = x.f139812b;
                eVar2.resumeWith(x.b(C16807N.f139792a));
            }
        }
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void I(Object obj) {
        int Q10 = Q();
        Object[] objArr = this.f138546h;
        if (objArr == null) {
            objArr = R((Object[]) null, 0, 2);
        } else if (Q10 >= objArr.length) {
            objArr = R(objArr, Q10, objArr.length * 2);
        }
        C16511H.g(objArr, L() + ((long) Q10), obj);
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (TJ.C16512I) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final dI.C17164e<XH.C16807N>[] J(dI.C17164e<XH.C16807N>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f139092b
            if (r1 == 0) goto L_0x0047
            UJ.d[] r1 = r10.f139091a
            if (r1 == 0) goto L_0x0047
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0047
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0044
            TJ.I r4 = (TJ.C16512I) r4
            dI.e<? super XH.N> r5 = r4.f138565b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.U(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(...)"
            kotlin.jvm.internal.C17542s.i(r11, r6)
        L_0x0039:
            r6 = r11
            dI.e[] r6 = (dI.C17164e[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f138565b = r0
            r0 = r7
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0047:
            dI.e[] r11 = (dI.C17164e[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16510G.J(dI.e[]):dI.e[]");
    }

    private final long K() {
        return L() + ((long) this.f138549k);
    }

    /* access modifiers changed from: private */
    public final long L() {
        return Math.min(this.f138548j, this.f138547i);
    }

    private final Object N(long j10) {
        Object[] objArr = this.f138546h;
        C17542s.g(objArr);
        Object c10 = C16511H.f(objArr, j10);
        return c10 instanceof a ? ((a) c10).f138553c : c10;
    }

    private final long O() {
        return L() + ((long) this.f138549k) + ((long) this.f138550l);
    }

    private final int P() {
        return (int) ((L() + ((long) this.f138549k)) - this.f138547i);
    }

    /* access modifiers changed from: private */
    public final int Q() {
        return this.f138549k + this.f138550l;
    }

    private final Object[] R(Object[] objArr, int i10, int i11) {
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.f138546h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long L10 = L();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + L10;
                C16511H.g(objArr2, j10, C16511H.f(objArr, j10));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    /* access modifiers changed from: private */
    public final boolean S(T t10) {
        if (m() == 0) {
            return T(t10);
        }
        if (this.f138549k >= this.f138544f && this.f138548j <= this.f138547i) {
            int i10 = b.f138555a[this.f138545g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new t();
            }
        }
        I(t10);
        int i11 = this.f138549k + 1;
        this.f138549k = i11;
        if (i11 > this.f138544f) {
            F();
        }
        if (P() > this.f138543e) {
            W(this.f138547i + 1, this.f138548j, K(), O());
        }
        return true;
    }

    private final boolean T(T t10) {
        if (this.f138543e == 0) {
            return true;
        }
        I(t10);
        int i10 = this.f138549k + 1;
        this.f138549k = i10;
        if (i10 > this.f138543e) {
            F();
        }
        this.f138548j = L() + ((long) this.f138549k);
        return true;
    }

    /* access modifiers changed from: private */
    public final long U(C16512I i10) {
        long j10 = i10.f138564a;
        if (j10 < K()) {
            return j10;
        }
        if (this.f138544f <= 0 && j10 <= L() && this.f138550l != 0) {
            return j10;
        }
        return -1;
    }

    private final Object V(C16512I i10) {
        Object obj;
        C17164e<C16807N>[] eVarArr = C16610c.f139095a;
        synchronized (this) {
            try {
                long U10 = U(i10);
                if (U10 < 0) {
                    obj = C16511H.f138563a;
                } else {
                    long j10 = i10.f138564a;
                    Object N10 = N(U10);
                    i10.f138564a = U10 + 1;
                    Object obj2 = N10;
                    eVarArr = X(j10);
                    obj = obj2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (C17164e<C16807N> eVar : eVarArr) {
            if (eVar != null) {
                x.a aVar = x.f139812b;
                eVar.resumeWith(x.b(C16807N.f139792a));
            }
        }
        return obj;
    }

    private final void W(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long L10 = L(); L10 < min; L10++) {
            Object[] objArr = this.f138546h;
            C17542s.g(objArr);
            C16511H.g(objArr, L10, (Object) null);
        }
        this.f138547i = j10;
        this.f138548j = j11;
        this.f138549k = (int) (j12 - min);
        this.f138550l = (int) (j13 - j12);
    }

    private final Object y(C16512I i10, C17164e<? super C16807N> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        synchronized (this) {
            try {
                if (U(i10) < 0) {
                    i10.f138565b = pVar;
                } else {
                    x.a aVar = x.f139812b;
                    pVar.resumeWith(x.b(C16807N.f139792a));
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void z(a aVar) {
        synchronized (this) {
            if (aVar.f138552b >= L()) {
                Object[] objArr = this.f138546h;
                C17542s.g(objArr);
                if (C16511H.f(objArr, aVar.f138552b) == aVar) {
                    C16511H.g(objArr, aVar.f138552b, C16511H.f138563a);
                    A();
                    C16807N n10 = C16807N.f139792a;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C16512I j() {
        return new C16512I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C16512I[] k(int i10) {
        return new C16512I[i10];
    }

    /* access modifiers changed from: protected */
    public final T M() {
        Object[] objArr = this.f138546h;
        C17542s.g(objArr);
        return C16511H.f(objArr, (this.f138547i + ((long) P())) - 1);
    }

    public final C17164e<C16807N>[] X(long j10) {
        long j11;
        long j12;
        long j13;
        C16611d[] h10;
        if (j10 > this.f138548j) {
            return C16610c.f139095a;
        }
        long L10 = L();
        long j14 = ((long) this.f138549k) + L10;
        if (this.f138544f == 0 && this.f138550l > 0) {
            j14++;
        }
        if (!(this.f139092b == 0 || (h10 = this.f139091a) == null)) {
            for (C16611d dVar : h10) {
                if (dVar != null) {
                    long j15 = ((C16512I) dVar).f138564a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f138548j) {
            return C16610c.f139095a;
        }
        long K10 = K();
        int min = m() > 0 ? Math.min(this.f138550l, this.f138544f - ((int) (K10 - j14))) : this.f138550l;
        C17164e<C16807N>[] eVarArr = C16610c.f139095a;
        long j16 = ((long) this.f138550l) + K10;
        if (min > 0) {
            eVarArr = new C17164e[min];
            Object[] objArr = this.f138546h;
            C17542s.g(objArr);
            long j17 = K10;
            int i10 = 0;
            while (true) {
                if (K10 >= j16) {
                    j12 = j14;
                    j11 = j16;
                    break;
                }
                Object c10 = C16511H.f(objArr, K10);
                j12 = j14;
                C16735D d10 = C16511H.f138563a;
                if (c10 != d10) {
                    C17542s.h(c10, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) c10;
                    int i11 = i10 + 1;
                    j11 = j16;
                    eVarArr[i10] = aVar.f138554d;
                    C16511H.g(objArr, K10, d10);
                    C16511H.g(objArr, j17, aVar.f138553c);
                    j13 = 1;
                    j17++;
                    if (i11 >= min) {
                        break;
                    }
                    i10 = i11;
                } else {
                    j11 = j16;
                    j13 = 1;
                }
                K10 += j13;
                j14 = j12;
                j16 = j11;
            }
            K10 = j17;
        } else {
            j12 = j14;
            j11 = j16;
        }
        int i12 = (int) (K10 - L10);
        long j18 = m() == 0 ? K10 : j12;
        long max = Math.max(this.f138547i, K10 - ((long) Math.min(this.f138543e, i12)));
        if (this.f138544f == 0 && max < j11) {
            Object[] objArr2 = this.f138546h;
            C17542s.g(objArr2);
            if (C17542s.e(C16511H.f(objArr2, max), C16511H.f138563a)) {
                K10++;
                max++;
            }
        }
        W(max, j18, K10, j11);
        A();
        return !(eVarArr.length == 0) ? J(eVarArr) : eVarArr;
    }

    public final long Y() {
        long j10 = this.f138547i;
        if (j10 < this.f138548j) {
            this.f138548j = j10;
        }
        return j10;
    }

    public boolean a(T t10) {
        int i10;
        boolean z10;
        C17164e<C16807N>[] eVarArr = C16610c.f139095a;
        synchronized (this) {
            if (S(t10)) {
                eVarArr = J(eVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (C17164e<C16807N> eVar : eVarArr) {
            if (eVar != null) {
                x.a aVar = x.f139812b;
                eVar.resumeWith(x.b(C16807N.f139792a));
            }
        }
        return z10;
    }

    public List<T> c() {
        synchronized (this) {
            int P10 = P();
            if (P10 == 0) {
                List<T> n10 = C16877v.n();
                return n10;
            }
            ArrayList arrayList = new ArrayList(P10);
            Object[] objArr = this.f138546h;
            C17542s.g(objArr);
            for (int i10 = 0; i10 < P10; i10++) {
                arrayList.add(C16511H.f(objArr, this.f138547i + ((long) i10)));
            }
            return arrayList;
        }
    }

    public Object collect(C16533h<? super T> hVar, C17164e<?> eVar) {
        return B(this, hVar, eVar);
    }

    public C16532g<T> d(C17168i iVar, int i10, C16428d dVar) {
        return C16511H.e(this, iVar, i10, dVar);
    }

    public Object emit(T t10, C17164e<? super C16807N> eVar) {
        return G(this, t10, eVar);
    }

    public void f() {
        synchronized (this) {
            W(K(), this.f138548j, K(), O());
            C16807N n10 = C16807N.f139792a;
        }
    }
}
