package U0;

import QJ.C16283A;
import QJ.C16310i;
import QJ.C16320n;
import QJ.C16324p;
import QJ.C16332t0;
import QJ.F0;
import QJ.I0;
import QJ.Q;
import QJ.S;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.C16816g;
import XH.v;
import XH.x;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g1.C5327H;
import g1.C5334c;
import g1.C5337f;
import g1.C5338g;
import g1.C5342k;
import g1.C5343l;
import h1.C5410a;
import j0.O;
import j0.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ¶\u00012\u00020\u0001:\u0004CQbeB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0017\u001a\u00020\u00072\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0007H@¢\u0006\u0004\b \u0010!J:\u0010(\u001a\u00020\u00072(\u0010'\u001a$\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070%\u0012\u0006\u0012\u0004\u0018\u00010&0\"H@¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010\u001dJ)\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J3\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140/2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010+H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0002¢\u0006\u0004\b4\u0010\u001aJ#\u00106\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0007052\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u00107J3\u00108\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0007052\u0006\u0010\u001b\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010+H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0007H@¢\u0006\u0004\b>\u0010!J\r\u0010?\u001a\u00020\u0007¢\u0006\u0004\b?\u0010\u001aJ\u0010\u0010@\u001a\u00020\u0007H@¢\u0006\u0004\b@\u0010!J%\u0010C\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00142\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070AH\u0010¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\u001aJ\r\u0010F\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\u001aJ\u001d\u0010J\u001a\u00020\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0GH\u0010¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\bL\u0010\u001dJ\u0017\u0010M\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\bM\u0010\u001dJ\u0017\u0010O\u001a\u00020\u00072\u0006\u0010N\u001a\u000200H\u0010¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u00072\u0006\u0010N\u001a\u000200H\u0010¢\u0006\u0004\bQ\u0010PJ\u001f\u0010T\u001a\u00020\u00072\u0006\u0010N\u001a\u0002002\u0006\u0010S\u001a\u00020RH\u0010¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\bV\u0010\u001dJ\u0019\u0010W\u001a\u0004\u0018\u00010R2\u0006\u0010N\u001a\u000200H\u0010¢\u0006\u0004\bW\u0010XR$\u0010^\u001a\u00020Y2\u0006\u0010Z\u001a\u00020Y8\u0006@BX\u000e¢\u0006\f\n\u0004\bC\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010`R\u0014\u0010d\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010g\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010iR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00140k8\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001e\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bo\u0010mR\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020&0+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00140t8\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00140k8\u0002X\u0004¢\u0006\u0006\n\u0004\bx\u0010mR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u0002000k8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010mR.\u0010~\u001a\u001c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0|\u0012\n\u0012\b\u0012\u0004\u0012\u0002000k0{8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010}R \u0010\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020R0{8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010}R\u001f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010k8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010mR \u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bJ\u0010\u0001R!\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bV\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010 R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010 R\u001f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bu\u0010\u0001R\u001c\u0010\u0001\u001a\u00070\u0001R\u00020\u00008\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001d\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140/8BX\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0016\u0010¤\u0001\u001a\u00020\n8BX\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010\fR\u0016\u0010¦\u0001\u001a\u00020\n8BX\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010\fR\u0016\u0010¨\u0001\u001a\u00020\n8BX\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\fR\u0016\u0010ª\u0001\u001a\u00020\n8BX\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010\fR\u0016\u0010¬\u0001\u001a\u00020\n8BX\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010\fR\u001c\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010­\u00018F¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0017\u0010²\u0001\u001a\u00030\u00018PX\u0004¢\u0006\u0007\u001a\u0005\bq\u0010±\u0001R\u0015\u0010³\u0001\u001a\u00020\n8PX\u0004¢\u0006\u0006\u001a\u0004\be\u0010\fR\u0015\u0010´\u0001\u001a\u00020\n8PX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0015\u0010µ\u0001\u001a\u00020\n8PX\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\f¨\u0006·\u0001"}, d2 = {"LU0/O0;", "LU0/r;", "LdI/i;", "effectCoroutineContext", "<init>", "(LdI/i;)V", "LQJ/n;", "LXH/N;", "c0", "()LQJ/n;", "", "w0", "()Z", "LQJ/F0;", "callingJob", "y0", "(LQJ/F0;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "LU0/F;", "failedInitialComposition", "recoverable", "s0", "(Ljava/lang/Exception;LU0/F;Z)V", "b0", "()V", "composition", "z0", "(LU0/F;)V", "X", "x0", "Z", "(LdI/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "LQJ/Q;", "LU0/h0;", "LdI/e;", "", "block", "v0", "(LnI/q;LdI/e;)Ljava/lang/Object;", "o0", "Lj0/O;", "modifiedValues", "r0", "(LU0/F;Lj0/O;)LU0/F;", "", "LU0/m0;", "references", "q0", "(Ljava/util/List;Lj0/O;)Ljava/util/List;", "d0", "Lkotlin/Function1;", "u0", "(LU0/F;)LnI/l;", "C0", "(LU0/F;Lj0/O;)LnI/l;", "Lg1/c;", "snapshot", "Y", "(Lg1/c;)V", "B0", "a0", "m0", "Lkotlin/Function0;", "content", "a", "(LU0/F;LnI/p;)V", "n0", "A0", "", "Lh1/a;", "table", "o", "(Ljava/util/Set;)V", "t", "l", "reference", "k", "(LU0/m0;)V", "b", "LU0/l0;", "data", "m", "(LU0/m0;LU0/l0;)V", "q", "n", "(LU0/m0;)LU0/l0;", "", "<set-?>", "J", "e0", "()J", "changeCount", "LU0/h;", "LU0/h;", "broadcastFrameClock", "c", "Ljava/lang/Object;", "stateLock", "d", "LQJ/F0;", "runnerJob", "", "Ljava/lang/Throwable;", "closeCause", "", "f", "Ljava/util/List;", "_knownCompositions", "g", "_knownCompositionsCache", "h", "Lj0/O;", "snapshotInvalidations", "LW0/b;", "i", "LW0/b;", "compositionInvalidations", "j", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "LU0/k0;", "Ljava/util/Map;", "compositionValuesRemoved", "compositionValueStatesAvailable", "failedCompositions", "Ljava/util/Set;", "compositionsRemoved", "p", "LQJ/n;", "workContinuation", "", "I", "concurrentCompositionsOutstanding", "r", "isClosed", "LU0/O0$b;", "s", "LU0/O0$b;", "errorState", "frameClockPaused", "LTJ/B;", "LU0/O0$d;", "u", "LTJ/B;", "_state", "LQJ/A;", "v", "LQJ/A;", "effectJob", "w", "LdI/i;", "()LdI/i;", "LU0/O0$c;", "x", "LU0/O0$c;", "recomposerInfo", "k0", "()Ljava/util/List;", "knownCompositions", "h0", "hasBroadcastFrameClockAwaitersLocked", "g0", "hasBroadcastFrameClockAwaiters", "l0", "shouldKeepRecomposing", "j0", "hasSchedulingWork", "i0", "hasFrameWorkLocked", "LTJ/P;", "f0", "()LTJ/P;", "currentState", "()I", "compoundHashKey", "collectingCallByInformation", "collectingParameterInformation", "collectingSourceInformation", "y", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class O0 extends r {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public static final C16505B<X0.g<c>> f13796A = C16521S.a(X0.a.c());

    /* renamed from: B  reason: collision with root package name */
    private static final AtomicReference<Boolean> f13797B = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: y  reason: collision with root package name */
    public static final a f13798y = new a((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f13799z = 8;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f13800a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C4878h f13801b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Object f13802c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public F0 f13803d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Throwable f13804e;

    /* renamed from: f  reason: collision with root package name */
    private final List<F> f13805f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private List<? extends F> f13806g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public O<Object> f13807h = new O<>(0, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final W0.b<F> f13808i = new W0.b<>(new F[16], 0);

    /* renamed from: j  reason: collision with root package name */
    private final List<F> f13809j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final List<C4890m0> f13810k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private final Map<C4886k0<Object>, List<C4890m0>> f13811l = new LinkedHashMap();

    /* renamed from: m  reason: collision with root package name */
    private final Map<C4890m0, C4888l0> f13812m = new LinkedHashMap();

    /* renamed from: n  reason: collision with root package name */
    private List<F> f13813n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Set<F> f13814o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public C16320n<? super C16807N> f13815p;

    /* renamed from: q  reason: collision with root package name */
    private int f13816q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f13817r;

    /* renamed from: s  reason: collision with root package name */
    private b f13818s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f13819t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<d> f13820u = C16521S.a(d.Inactive);

    /* renamed from: v  reason: collision with root package name */
    private final C16283A f13821v;

    /* renamed from: w  reason: collision with root package name */
    private final C17168i f13822w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final c f13823x;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR4\u0010\u000f\u001a\"\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bj\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f`\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LU0/O0$a;", "", "<init>", "()V", "LU0/O0$c;", "LU0/O0;", "info", "LXH/N;", "c", "(LU0/O0$c;)V", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "LTJ/B;", "LX0/g;", "_runningRecomposers", "LTJ/B;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final void c(U0.O0.c r4) {
            /*
                r3 = this;
            L_0x0000:
                TJ.B r0 = U0.O0.f13796A
                java.lang.Object r0 = r0.getValue()
                X0.g r0 = (X0.g) r0
                X0.g r1 = r0.add(r4)
                if (r0 == r1) goto L_0x001a
                TJ.B r2 = U0.O0.f13796A
                boolean r0 = r2.e(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: U0.O0.a.c(U0.O0$c):void");
        }

        /* access modifiers changed from: private */
        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final void d(U0.O0.c r4) {
            /*
                r3 = this;
            L_0x0000:
                TJ.B r0 = U0.O0.f13796A
                java.lang.Object r0 = r0.getValue()
                X0.g r0 = (X0.g) r0
                X0.g r1 = r0.remove(r4)
                if (r0 == r1) goto L_0x001a
                TJ.B r2 = U0.O0.f13796A
                boolean r0 = r2.e(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: U0.O0.a.d(U0.O0$c):void");
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"LU0/O0$b;", "", "", "recoverable", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(ZLjava/lang/Exception;)V", "a", "Z", "getRecoverable", "()Z", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f13824a;

        /* renamed from: b  reason: collision with root package name */
        private final Exception f13825b;

        public b(boolean z10, Exception exc) {
            this.f13824a = z10;
            this.f13825b = exc;
        }

        public Exception a() {
            return this.f13825b;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU0/O0$c;", "", "<init>", "(LU0/O0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class c {
        public c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LU0/O0$d;", "", "<init>", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O0 f13827c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(O0 o02) {
            super(0);
            this.f13827c = o02;
        }

        public final void invoke() {
            C16320n v10;
            Object I10 = this.f13827c.f13802c;
            O0 o02 = this.f13827c;
            synchronized (I10) {
                v10 = o02.c0();
                if (((d) o02.f13820u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw C16332t0.a("Recomposer shutdown; frame clock awaiter will never resume", o02.f13804e);
                }
            }
            if (v10 != null) {
                x.a aVar = x.f139812b;
                v10.resumeWith(x.b(C16807N.f139792a));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O0 f13828c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "runnerJobCause", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<Throwable, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ O0 f13829c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Throwable f13830d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(O0 o02, Throwable th2) {
                super(1);
                this.f13829c = o02;
                this.f13830d = th2;
            }

            public final void a(Throwable th2) {
                Object I10 = this.f13829c.f13802c;
                O0 o02 = this.f13829c;
                Throwable th3 = this.f13830d;
                synchronized (I10) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                C16816g.a(th3, th2);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    o02.f13804e = th3;
                    o02.f13820u.setValue(d.ShutDown);
                    C16807N n10 = C16807N.f139792a;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(O0 o02) {
            super(1);
            this.f13828c = o02;
        }

        public final void a(Throwable th2) {
            C16320n nVar;
            C16320n nVar2;
            CancellationException a10 = C16332t0.a("Recomposer effect job completed", th2);
            Object I10 = this.f13828c.f13802c;
            O0 o02 = this.f13828c;
            synchronized (I10) {
                try {
                    F0 F10 = o02.f13803d;
                    nVar = null;
                    if (F10 != null) {
                        o02.f13820u.setValue(d.ShuttingDown);
                        if (!o02.f13817r) {
                            F10.i(a10);
                        } else if (o02.f13815p != null) {
                            nVar2 = o02.f13815p;
                            o02.f13815p = null;
                            F10.s(new a(o02, th2));
                            nVar = nVar2;
                        }
                        nVar2 = null;
                        o02.f13815p = null;
                        F10.s(new a(o02, th2));
                        nVar = nVar2;
                    } else {
                        o02.f13804e = a10;
                        o02.f13820u.setValue(d.ShutDown);
                        C16807N n10 = C16807N.f139792a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (nVar != null) {
                x.a aVar = x.f139812b;
                nVar.resumeWith(x.b(C16807N.f139792a));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/O0$d;", "it", "", "<anonymous>", "(LU0/O0$d;)Z"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<d, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f13831c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f13832d;

        g(C17164e<? super g> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(eVar);
            gVar.f13832d = obj;
            return gVar;
        }

        /* renamed from: i */
        public final Object invoke(d dVar, C17164e<? super Boolean> eVar) {
            return ((g) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f13831c == 0) {
                y.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(((d) this.f13832d) == d.ShutDown);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<Object> f13833c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F f13834d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(O<Object> o10, F f10) {
            super(0);
            this.f13833c = o10;
            this.f13834d = f10;
        }

        public final void invoke() {
            O<Object> o10 = this.f13833c;
            F f10 = this.f13834d;
            Object[] objArr = o10.f24576b;
            long[] jArr = o10.f24575a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                f10.r(objArr[(i10 << 3) + i12]);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            return;
                        }
                    }
                    if (i10 != length) {
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<Object, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F f13835c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(F f10) {
            super(1);
            this.f13835c = f10;
        }

        public final void a(Object obj) {
            this.f13835c.a(obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1054}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f13836c;

        /* renamed from: d  reason: collision with root package name */
        int f13837d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f13838e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ O0 f13839f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q<Q, C4879h0, C17164e<? super C16807N>, Object> f13840g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4879h0 f13841h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {1055}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f13842c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f13843d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ q<Q, C4879h0, C17164e<? super C16807N>, Object> f13844e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4879h0 f13845f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(q<? super Q, ? super C4879h0, ? super C17164e<? super C16807N>, ? extends Object> qVar, C4879h0 h0Var, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f13844e = qVar;
                this.f13845f = h0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f13844e, this.f13845f, eVar);
                aVar.f13843d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f13842c;
                if (i10 == 0) {
                    y.b(obj);
                    q<Q, C4879h0, C17164e<? super C16807N>, Object> qVar = this.f13844e;
                    C4879h0 h0Var = this.f13845f;
                    this.f13842c = 1;
                    if (qVar.invoke((Q) this.f13843d, h0Var, this) == f10) {
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "changed", "Lg1/k;", "<anonymous parameter 1>", "LXH/N;", "a", "(Ljava/util/Set;Lg1/k;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements p<Set<? extends Object>, C5342k, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ O0 f13846c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(O0 o02) {
                super(2);
                this.f13846c = o02;
            }

            public final void a(Set<? extends Object> set, C5342k kVar) {
                C16320n nVar;
                int i10;
                Set<? extends Object> set2 = set;
                Object I10 = this.f13846c.f13802c;
                O0 o02 = this.f13846c;
                synchronized (I10) {
                    try {
                        if (((d) o02.f13820u.getValue()).compareTo(d.Idle) >= 0) {
                            O H10 = o02.f13807h;
                            if (set2 instanceof W0.d) {
                                Z b10 = ((W0.d) set2).b();
                                Object[] objArr = b10.f24576b;
                                long[] jArr = b10.f24575a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j10 = jArr[i11];
                                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i12 = 8;
                                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((255 & j10) < 128) {
                                                    Object obj = objArr[(i11 << 3) + i14];
                                                    if (!(obj instanceof C5327H) || ((C5327H) obj).d(C5338g.a(1))) {
                                                        H10.h(obj);
                                                    }
                                                    i10 = 8;
                                                } else {
                                                    i10 = i12;
                                                }
                                                j10 >>= i10;
                                                i14++;
                                                i12 = i10;
                                            }
                                            if (i13 != i12) {
                                                break;
                                            }
                                        }
                                        if (i11 == length) {
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            } else {
                                for (Object next : set2) {
                                    if (!(next instanceof C5327H) || ((C5327H) next).d(C5338g.a(1))) {
                                        H10.h(next);
                                    }
                                }
                            }
                            nVar = o02.c0();
                        } else {
                            nVar = null;
                        }
                    } finally {
                    }
                }
                if (nVar != null) {
                    x.a aVar = x.f139812b;
                    nVar.resumeWith(x.b(C16807N.f139792a));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Set) obj, (C5342k) obj2);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(O0 o02, q<? super Q, ? super C4879h0, ? super C17164e<? super C16807N>, ? extends Object> qVar, C4879h0 h0Var, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f13839f = o02;
            this.f13840g = qVar;
            this.f13841h = h0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f13839f, this.f13840g, this.f13841h, eVar);
            jVar.f13838e = obj;
            return jVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            F0 f02;
            C5337f fVar;
            List D10;
            Object f10 = C17187b.f();
            int i10 = this.f13837d;
            if (i10 == 0) {
                y.b(obj);
                f02 = I0.m(((Q) this.f13838e).getCoroutineContext());
                this.f13839f.y0(f02);
                C5337f j10 = C5342k.f23395e.j(new b(this.f13839f));
                O0.f13798y.c(this.f13839f.f13823x);
                try {
                    Object I10 = this.f13839f.f13802c;
                    O0 o02 = this.f13839f;
                    synchronized (I10) {
                        D10 = o02.k0();
                    }
                    int size = D10.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((F) D10.get(i11)).y();
                    }
                    a aVar = new a(this.f13840g, this.f13841h, (C17164e<? super a>) null);
                    this.f13838e = f02;
                    this.f13836c = j10;
                    this.f13837d = 1;
                    if (S.f(aVar, this) == f10) {
                        return f10;
                    }
                    fVar = j10;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    fVar = j10;
                    th2 = th4;
                    fVar.b();
                    Object I11 = this.f13839f.f13802c;
                    O0 o03 = this.f13839f;
                    synchronized (I11) {
                        try {
                            if (o03.f13803d == f02) {
                                o03.f13803d = null;
                            }
                            C16320n unused = o03.c0();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    O0.f13798y.d(this.f13839f.f13823x);
                    throw th2;
                }
            } else if (i10 == 1) {
                fVar = (C5337f) this.f13836c;
                f02 = (F0) this.f13838e;
                try {
                    y.b(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar.b();
            Object I12 = this.f13839f.f13802c;
            O0 o04 = this.f13839f;
            synchronized (I12) {
                try {
                    if (o04.f13803d == f02) {
                        o04.f13803d = null;
                    }
                    C16320n unused2 = o04.c0();
                } catch (Throwable th7) {
                    throw th7;
                }
            }
            O0.f13798y.d(this.f13839f.f13823x);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LU0/h0;", "parentFrameClock", "LXH/N;", "<anonymous>", "(LQJ/Q;LU0/h0;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {574, 585}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements q<Q, C4879h0, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f13847c;

        /* renamed from: d  reason: collision with root package name */
        Object f13848d;

        /* renamed from: e  reason: collision with root package name */
        Object f13849e;

        /* renamed from: f  reason: collision with root package name */
        Object f13850f;

        /* renamed from: g  reason: collision with root package name */
        Object f13851g;

        /* renamed from: h  reason: collision with root package name */
        Object f13852h;

        /* renamed from: i  reason: collision with root package name */
        Object f13853i;

        /* renamed from: j  reason: collision with root package name */
        Object f13854j;

        /* renamed from: k  reason: collision with root package name */
        int f13855k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f13856l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ O0 f13857m;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<Long, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ O0 f13858c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ O<Object> f13859d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ O<F> f13860e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List<F> f13861f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ List<C4890m0> f13862g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ O<F> f13863h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ List<F> f13864i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ O<F> f13865j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ Set<Object> f13866k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(O0 o02, O<Object> o10, O<F> o11, List<F> list, List<C4890m0> list2, O<F> o12, List<F> list3, O<F> o13, Set<? extends Object> set) {
                super(1);
                this.f13858c = o02;
                this.f13859d = o10;
                this.f13860e = o11;
                this.f13861f = list;
                this.f13862g = list2;
                this.f13863h = o12;
                this.f13864i = list3;
                this.f13865j = o13;
                this.f13866k = set;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:123:0x01fb, code lost:
                if (r7 == 8) goto L_0x0206;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:87:0x016c, code lost:
                if (r8 == 8) goto L_0x0171;
             */
            /* JADX WARNING: Removed duplicated region for block: B:198:0x031f A[SYNTHETIC, Splitter:B:198:0x031f] */
            /* JADX WARNING: Removed duplicated region for block: B:224:0x033b A[SYNTHETIC] */
            /* JADX WARNING: Unknown top exception splitter block from list: {B:94:0x0180=Splitter:B:94:0x0180, B:61:0x010a=Splitter:B:61:0x010a, B:127:0x020d=Splitter:B:127:0x020d} */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(long r28) {
                /*
                    r27 = this;
                    r1 = r27
                    U0.O0 r0 = r1.f13858c
                    boolean r0 = r0.g0()
                    if (r0 == 0) goto L_0x002f
                    java.lang.String r0 = "Recomposer:animation"
                    U0.O0 r2 = r1.f13858c
                    U0.E1 r3 = U0.E1.f13744a
                    java.lang.Object r4 = r3.a(r0)
                    U0.h r0 = r2.f13801b     // Catch:{ all -> 0x0028 }
                    r5 = r28
                    r0.u(r5)     // Catch:{ all -> 0x0028 }
                    g1.k$a r0 = g1.C5342k.f23395e     // Catch:{ all -> 0x0028 }
                    r0.o()     // Catch:{ all -> 0x0028 }
                    XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0028 }
                    r3.b(r4)
                    goto L_0x002f
                L_0x0028:
                    r0 = move-exception
                    U0.E1 r2 = U0.E1.f13744a
                    r2.b(r4)
                    throw r0
                L_0x002f:
                    java.lang.String r0 = "Recomposer:recompose"
                    U0.O0 r8 = r1.f13858c
                    j0.O<java.lang.Object> r9 = r1.f13859d
                    j0.O<U0.F> r10 = r1.f13860e
                    java.util.List<U0.F> r11 = r1.f13861f
                    java.util.List<U0.m0> r12 = r1.f13862g
                    j0.O<U0.F> r13 = r1.f13863h
                    java.util.List<U0.F> r14 = r1.f13864i
                    j0.O<U0.F> r15 = r1.f13865j
                    java.util.Set<java.lang.Object> r2 = r1.f13866k
                    U0.E1 r3 = U0.E1.f13744a
                    java.lang.Object r7 = r3.a(r0)
                    boolean unused = r8.w0()     // Catch:{ all -> 0x00e4 }
                    java.lang.Object r3 = r8.f13802c     // Catch:{ all -> 0x00e4 }
                    monitor-enter(r3)     // Catch:{ all -> 0x00e4 }
                    W0.b r0 = r8.f13808i     // Catch:{ all -> 0x0076 }
                    int r4 = r0.r()     // Catch:{ all -> 0x0076 }
                    if (r4 <= 0) goto L_0x007a
                    java.lang.Object[] r0 = r0.q()     // Catch:{ all -> 0x0076 }
                    r6 = 0
                L_0x0060:
                    r16 = r0[r6]     // Catch:{ all -> 0x0076 }
                    r5 = r16
                    U0.F r5 = (U0.F) r5     // Catch:{ all -> 0x0076 }
                    r29 = r0
                    r0 = r11
                    java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0076 }
                    r0.add(r5)     // Catch:{ all -> 0x0076 }
                    int r6 = r6 + 1
                    if (r6 < r4) goto L_0x0073
                    goto L_0x007a
                L_0x0073:
                    r0 = r29
                    goto L_0x0060
                L_0x0076:
                    r0 = move-exception
                    r1 = r7
                    goto L_0x0375
                L_0x007a:
                    W0.b r0 = r8.f13808i     // Catch:{ all -> 0x0076 }
                    r0.k()     // Catch:{ all -> 0x0076 }
                    XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0076 }
                    monitor-exit(r3)     // Catch:{ all -> 0x00e4 }
                    r9.m()     // Catch:{ all -> 0x00e4 }
                    r10.m()     // Catch:{ all -> 0x00e4 }
                L_0x008a:
                    r0 = r11
                    java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x00e4 }
                    boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00e4 }
                    if (r0 == 0) goto L_0x009c
                    r0 = r12
                    java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x00e4 }
                    boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00e4 }
                    if (r0 != 0) goto L_0x009f
                L_0x009c:
                    r1 = r7
                    goto L_0x0255
                L_0x009f:
                    r0 = r14
                    java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x00e4 }
                    boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00e4 }
                    if (r0 != 0) goto L_0x00e2
                    long r4 = r8.e0()     // Catch:{ all -> 0x00e4 }
                    r16 = 1
                    long r4 = r4 + r16
                    r8.f13800a = r4     // Catch:{ all -> 0x00e4 }
                    int r0 = r14.size()     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                    r2 = 0
                L_0x00b8:
                    if (r2 >= r0) goto L_0x00cc
                    java.lang.Object r4 = r14.get(r2)     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                    U0.F r4 = (U0.F) r4     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                    r15.h(r4)     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                    int r2 = r2 + 1
                    goto L_0x00b8
                L_0x00c6:
                    r0 = move-exception
                    r1 = r7
                    goto L_0x010a
                L_0x00c9:
                    r0 = move-exception
                    r3 = r0
                    goto L_0x00e8
                L_0x00cc:
                    int r0 = r14.size()     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                    r2 = 0
                L_0x00d1:
                    if (r2 >= r0) goto L_0x00df
                    java.lang.Object r4 = r14.get(r2)     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                    U0.F r4 = (U0.F) r4     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                    r4.p()     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                    int r2 = r2 + 1
                    goto L_0x00d1
                L_0x00df:
                    r14.clear()     // Catch:{ all -> 0x00e4 }
                L_0x00e2:
                    r1 = r7
                    goto L_0x010e
                L_0x00e4:
                    r0 = move-exception
                    r1 = r7
                    goto L_0x0377
                L_0x00e8:
                    r6 = 6
                    r0 = 0
                    r4 = 0
                    r5 = 0
                    r2 = r8
                    r1 = r7
                    r7 = r0
                    U0.O0.t0(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0109 }
                    r2 = r8
                    r3 = r11
                    r4 = r12
                    r5 = r14
                    r6 = r13
                    r7 = r15
                    r8 = r9
                    r9 = r10
                    U0.O0.k.m(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0109 }
                    r14.clear()     // Catch:{ all -> 0x0106 }
                L_0x0100:
                    U0.E1 r0 = U0.E1.f13744a
                    r0.b(r1)
                    return
                L_0x0106:
                    r0 = move-exception
                    goto L_0x0377
                L_0x0109:
                    r0 = move-exception
                L_0x010a:
                    r14.clear()     // Catch:{ all -> 0x0106 }
                    throw r0     // Catch:{ all -> 0x0106 }
                L_0x010e:
                    boolean r0 = r13.e()     // Catch:{ all -> 0x0106 }
                    r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    if (r0 == 0) goto L_0x01a2
                    r15.u(r13)     // Catch:{ Exception -> 0x017a }
                    java.lang.Object[] r0 = r13.f24576b     // Catch:{ Exception -> 0x017a }
                    long[] r4 = r13.f24575a     // Catch:{ Exception -> 0x017a }
                    int r5 = r4.length     // Catch:{ Exception -> 0x017a }
                    int r5 = r5 + -2
                    if (r5 < 0) goto L_0x017e
                    r6 = 0
                L_0x0126:
                    r2 = r4[r6]     // Catch:{ Exception -> 0x017a }
                    r23 = r8
                    long r7 = ~r2
                    r24 = 7
                    long r25 = r7 << r24
                    long r24 = r2 & r25
                    long r24 = r24 & r16
                    int r8 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
                    if (r8 == 0) goto L_0x016f
                    int r8 = r6 - r5
                    int r8 = ~r8
                    int r8 = r8 >>> 31
                    r22 = 8
                    int r8 = 8 - r8
                    r7 = 0
                L_0x0141:
                    if (r7 >= r8) goto L_0x0168
                    r20 = 255(0xff, double:1.26E-321)
                    long r25 = r2 & r20
                    r18 = 128(0x80, double:6.32E-322)
                    int r25 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
                    if (r25 >= 0) goto L_0x0158
                    int r25 = r6 << 3
                    int r25 = r25 + r7
                    r25 = r0[r25]     // Catch:{ Exception -> 0x015f }
                    U0.F r25 = (U0.F) r25     // Catch:{ Exception -> 0x015f }
                    r25.d()     // Catch:{ Exception -> 0x015f }
                L_0x0158:
                    r25 = r0
                    r0 = 8
                    goto L_0x0162
                L_0x015d:
                    r0 = move-exception
                    goto L_0x019e
                L_0x015f:
                    r0 = move-exception
                L_0x0160:
                    r3 = r0
                    goto L_0x0184
                L_0x0162:
                    long r2 = r2 >> r0
                    int r7 = r7 + 1
                    r0 = r25
                    goto L_0x0141
                L_0x0168:
                    r25 = r0
                    r0 = 8
                    if (r8 != r0) goto L_0x0180
                    goto L_0x0171
                L_0x016f:
                    r25 = r0
                L_0x0171:
                    if (r6 == r5) goto L_0x0180
                    int r6 = r6 + 1
                    r8 = r23
                    r0 = r25
                    goto L_0x0126
                L_0x017a:
                    r0 = move-exception
                    r23 = r8
                    goto L_0x0160
                L_0x017e:
                    r23 = r8
                L_0x0180:
                    r13.m()     // Catch:{ all -> 0x0106 }
                    goto L_0x01a4
                L_0x0184:
                    r6 = 6
                    r7 = 0
                    r4 = 0
                    r5 = 0
                    r2 = r23
                    U0.O0.t0(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x015d }
                    r2 = r23
                    r3 = r11
                    r4 = r12
                    r5 = r14
                    r6 = r13
                    r7 = r15
                    r8 = r9
                    r9 = r10
                    U0.O0.k.m(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x015d }
                    r13.m()     // Catch:{ all -> 0x0106 }
                    goto L_0x0100
                L_0x019e:
                    r13.m()     // Catch:{ all -> 0x0106 }
                    throw r0     // Catch:{ all -> 0x0106 }
                L_0x01a2:
                    r23 = r8
                L_0x01a4:
                    boolean r0 = r15.e()     // Catch:{ all -> 0x0106 }
                    if (r0 == 0) goto L_0x022f
                    java.lang.Object[] r0 = r15.f24576b     // Catch:{ Exception -> 0x01ea }
                    long[] r2 = r15.f24575a     // Catch:{ Exception -> 0x01ea }
                    int r3 = r2.length     // Catch:{ Exception -> 0x01ea }
                    int r3 = r3 + -2
                    if (r3 < 0) goto L_0x020d
                    r4 = 0
                L_0x01b4:
                    r5 = r2[r4]     // Catch:{ Exception -> 0x01ea }
                    long r7 = ~r5     // Catch:{ Exception -> 0x01ea }
                    r24 = 7
                    long r7 = r7 << r24
                    long r7 = r7 & r5
                    long r7 = r7 & r16
                    int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                    if (r7 == 0) goto L_0x01fe
                    int r7 = r4 - r3
                    int r7 = ~r7     // Catch:{ Exception -> 0x01ea }
                    int r7 = r7 >>> 31
                    r8 = 8
                    int r7 = 8 - r7
                    r8 = 0
                L_0x01cc:
                    if (r8 >= r7) goto L_0x01f3
                    r20 = 255(0xff, double:1.26E-321)
                    long r25 = r5 & r20
                    r18 = 128(0x80, double:6.32E-322)
                    int r25 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
                    if (r25 >= 0) goto L_0x01e3
                    int r25 = r4 << 3
                    int r25 = r25 + r8
                    r25 = r0[r25]     // Catch:{ Exception -> 0x01ea }
                    U0.F r25 = (U0.F) r25     // Catch:{ Exception -> 0x01ea }
                    r25.w()     // Catch:{ Exception -> 0x01ea }
                L_0x01e3:
                    r25 = r0
                    r0 = 8
                    goto L_0x01ed
                L_0x01e8:
                    r0 = move-exception
                    goto L_0x022b
                L_0x01ea:
                    r0 = move-exception
                    r3 = r0
                    goto L_0x0211
                L_0x01ed:
                    long r5 = r5 >> r0
                    int r8 = r8 + 1
                    r0 = r25
                    goto L_0x01cc
                L_0x01f3:
                    r25 = r0
                    r0 = 8
                    r18 = 128(0x80, double:6.32E-322)
                    r20 = 255(0xff, double:1.26E-321)
                    if (r7 != r0) goto L_0x020d
                    goto L_0x0206
                L_0x01fe:
                    r25 = r0
                    r0 = 8
                    r18 = 128(0x80, double:6.32E-322)
                    r20 = 255(0xff, double:1.26E-321)
                L_0x0206:
                    if (r4 == r3) goto L_0x020d
                    int r4 = r4 + 1
                    r0 = r25
                    goto L_0x01b4
                L_0x020d:
                    r15.m()     // Catch:{ all -> 0x0106 }
                    goto L_0x022f
                L_0x0211:
                    r6 = 6
                    r7 = 0
                    r4 = 0
                    r5 = 0
                    r2 = r23
                    U0.O0.t0(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01e8 }
                    r2 = r23
                    r3 = r11
                    r4 = r12
                    r5 = r14
                    r6 = r13
                    r7 = r15
                    r8 = r9
                    r9 = r10
                    U0.O0.k.m(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01e8 }
                    r15.m()     // Catch:{ all -> 0x0106 }
                    goto L_0x0100
                L_0x022b:
                    r15.m()     // Catch:{ all -> 0x0106 }
                    throw r0     // Catch:{ all -> 0x0106 }
                L_0x022f:
                    java.lang.Object r2 = r23.f13802c     // Catch:{ all -> 0x0106 }
                    monitor-enter(r2)     // Catch:{ all -> 0x0106 }
                    QJ.C16320n unused = r23.c0()     // Catch:{ all -> 0x0251 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0106 }
                    g1.k$a r0 = g1.C5342k.f23395e     // Catch:{ all -> 0x0106 }
                    r0.g()     // Catch:{ all -> 0x0106 }
                    r10.m()     // Catch:{ all -> 0x0106 }
                    r9.m()     // Catch:{ all -> 0x0106 }
                    r8 = r23
                    r0 = 0
                    r8.f13814o = r0     // Catch:{ all -> 0x0106 }
                    XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0106 }
                    U0.E1 r0 = U0.E1.f13744a
                    r0.b(r1)
                    return
                L_0x0251:
                    r0 = move-exception
                    r3 = r0
                    monitor-exit(r2)     // Catch:{ all -> 0x0106 }
                    throw r3     // Catch:{ all -> 0x0106 }
                L_0x0255:
                    int r0 = r11.size()     // Catch:{ Exception -> 0x0274 }
                    r3 = 0
                L_0x025a:
                    if (r3 >= r0) goto L_0x027e
                    java.lang.Object r4 = r11.get(r3)     // Catch:{ Exception -> 0x0274 }
                    U0.F r4 = (U0.F) r4     // Catch:{ Exception -> 0x0274 }
                    U0.F r5 = r8.r0(r4, r9)     // Catch:{ Exception -> 0x0274 }
                    if (r5 == 0) goto L_0x0278
                    r6 = r14
                    java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ Exception -> 0x0274 }
                    r6.add(r5)     // Catch:{ Exception -> 0x0274 }
                    XH.N r5 = XH.C16807N.f139792a     // Catch:{ Exception -> 0x0274 }
                    goto L_0x0278
                L_0x0271:
                    r0 = move-exception
                    goto L_0x0371
                L_0x0274:
                    r0 = move-exception
                    r3 = r0
                    goto L_0x0359
                L_0x0278:
                    r10.h(r4)     // Catch:{ Exception -> 0x0274 }
                    int r3 = r3 + 1
                    goto L_0x025a
                L_0x027e:
                    r11.clear()     // Catch:{ all -> 0x0106 }
                    boolean r0 = r9.e()     // Catch:{ all -> 0x0106 }
                    if (r0 != 0) goto L_0x0296
                    W0.b r0 = r8.f13808i     // Catch:{ all -> 0x0106 }
                    boolean r0 = r0.v()     // Catch:{ all -> 0x0106 }
                    if (r0 == 0) goto L_0x0292
                    goto L_0x0296
                L_0x0292:
                    r16 = r2
                    goto L_0x0319
                L_0x0296:
                    java.lang.Object r3 = r8.f13802c     // Catch:{ all -> 0x0106 }
                    monitor-enter(r3)     // Catch:{ all -> 0x0106 }
                    java.util.List r0 = r8.k0()     // Catch:{ all -> 0x02bf }
                    int r4 = r0.size()     // Catch:{ all -> 0x02bf }
                    r5 = 0
                L_0x02a4:
                    if (r5 >= r4) goto L_0x02c5
                    java.lang.Object r6 = r0.get(r5)     // Catch:{ all -> 0x02bf }
                    U0.F r6 = (U0.F) r6     // Catch:{ all -> 0x02bf }
                    boolean r7 = r10.a(r6)     // Catch:{ all -> 0x02bf }
                    if (r7 != 0) goto L_0x02c2
                    boolean r7 = r6.k(r2)     // Catch:{ all -> 0x02bf }
                    if (r7 == 0) goto L_0x02c2
                    r7 = r11
                    java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x02bf }
                    r7.add(r6)     // Catch:{ all -> 0x02bf }
                    goto L_0x02c2
                L_0x02bf:
                    r0 = move-exception
                    goto L_0x0357
                L_0x02c2:
                    int r5 = r5 + 1
                    goto L_0x02a4
                L_0x02c5:
                    W0.b r0 = r8.f13808i     // Catch:{ all -> 0x02bf }
                    int r4 = r0.r()     // Catch:{ all -> 0x02bf }
                    r5 = 0
                    r6 = 0
                L_0x02cf:
                    if (r5 >= r4) goto L_0x0307
                    java.lang.Object[] r7 = r0.q()     // Catch:{ all -> 0x02bf }
                    r7 = r7[r5]     // Catch:{ all -> 0x02bf }
                    U0.F r7 = (U0.F) r7     // Catch:{ all -> 0x02bf }
                    boolean r16 = r10.a(r7)     // Catch:{ all -> 0x02bf }
                    if (r16 != 0) goto L_0x02f0
                    boolean r16 = r11.contains(r7)     // Catch:{ all -> 0x02bf }
                    if (r16 != 0) goto L_0x02f0
                    r16 = r2
                    r2 = r11
                    java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x02bf }
                    r2.add(r7)     // Catch:{ all -> 0x02bf }
                    int r6 = r6 + 1
                    goto L_0x0302
                L_0x02f0:
                    r16 = r2
                    if (r6 <= 0) goto L_0x0302
                    java.lang.Object[] r2 = r0.q()     // Catch:{ all -> 0x02bf }
                    int r7 = r5 - r6
                    java.lang.Object[] r17 = r0.q()     // Catch:{ all -> 0x02bf }
                    r17 = r17[r5]     // Catch:{ all -> 0x02bf }
                    r2[r7] = r17     // Catch:{ all -> 0x02bf }
                L_0x0302:
                    int r5 = r5 + 1
                    r2 = r16
                    goto L_0x02cf
                L_0x0307:
                    r16 = r2
                    java.lang.Object[] r2 = r0.q()     // Catch:{ all -> 0x02bf }
                    int r5 = r4 - r6
                    r6 = 0
                    YH.C16870n.x(r2, r6, r5, r4)     // Catch:{ all -> 0x02bf }
                    r0.F(r5)     // Catch:{ all -> 0x02bf }
                    XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x02bf }
                    monitor-exit(r3)     // Catch:{ all -> 0x0106 }
                L_0x0319:
                    boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x0106 }
                    if (r0 == 0) goto L_0x033b
                    U0.O0.k.n(r12, r8)     // Catch:{ Exception -> 0x0338 }
                L_0x0322:
                    r0 = r12
                    java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x0338 }
                    boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0338 }
                    if (r0 != 0) goto L_0x033b
                    java.util.List r0 = r8.q0(r12, r9)     // Catch:{ Exception -> 0x0338 }
                    java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ Exception -> 0x0338 }
                    r13.v(r0)     // Catch:{ Exception -> 0x0338 }
                    U0.O0.k.n(r12, r8)     // Catch:{ Exception -> 0x0338 }
                    goto L_0x0322
                L_0x0338:
                    r0 = move-exception
                    r3 = r0
                    goto L_0x0342
                L_0x033b:
                    r7 = r1
                    r2 = r16
                    r1 = r27
                    goto L_0x008a
                L_0x0342:
                    r6 = 2
                    r7 = 0
                    r4 = 0
                    r5 = 1
                    r2 = r8
                    U0.O0.t0(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0106 }
                    r2 = r8
                    r3 = r11
                    r4 = r12
                    r5 = r14
                    r6 = r13
                    r7 = r15
                    r8 = r9
                    r9 = r10
                    U0.O0.k.m(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0106 }
                    goto L_0x0100
                L_0x0357:
                    monitor-exit(r3)     // Catch:{ all -> 0x0106 }
                    throw r0     // Catch:{ all -> 0x0106 }
                L_0x0359:
                    r6 = 2
                    r7 = 0
                    r4 = 0
                    r5 = 1
                    r2 = r8
                    U0.O0.t0(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0271 }
                    r2 = r8
                    r3 = r11
                    r4 = r12
                    r5 = r14
                    r6 = r13
                    r7 = r15
                    r8 = r9
                    r9 = r10
                    U0.O0.k.m(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0271 }
                    r11.clear()     // Catch:{ all -> 0x0106 }
                    goto L_0x0100
                L_0x0371:
                    r11.clear()     // Catch:{ all -> 0x0106 }
                    throw r0     // Catch:{ all -> 0x0106 }
                L_0x0375:
                    monitor-exit(r3)     // Catch:{ all -> 0x0106 }
                    throw r0     // Catch:{ all -> 0x0106 }
                L_0x0377:
                    U0.E1 r2 = U0.E1.f13744a
                    r2.b(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: U0.O0.k.a.a(long):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(O0 o02, C17164e<? super k> eVar) {
            super(3, eVar);
            this.f13857m = o02;
        }

        /* access modifiers changed from: private */
        public static final void m(O0 o02, List<F> list, List<C4890m0> list2, List<F> list3, O<F> o10, O<F> o11, O<Object> o12, O<F> o13) {
            O0 o03 = o02;
            O<F> o14 = o10;
            O<F> o15 = o11;
            O<F> o16 = o13;
            synchronized (o02.f13802c) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        F f10 = list3.get(i10);
                        f10.v();
                        o03.x0(f10);
                    }
                    List<F> list4 = list3;
                    list3.clear();
                    Object[] objArr = o14.f24576b;
                    long[] jArr = o14.f24575a;
                    int length = jArr.length - 2;
                    long j10 = -9187201950435737472L;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j11 = jArr[i11];
                            long[] jArr2 = jArr;
                            if ((((~j11) << 7) & j11 & j10) != j10) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j11 & 255) < 128) {
                                        F f11 = (F) objArr[(i11 << 3) + i13];
                                        f11.v();
                                        o03.x0(f11);
                                    }
                                    j11 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                            }
                            if (i11 == length) {
                                break;
                            }
                            i11++;
                            jArr = jArr2;
                            j10 = -9187201950435737472L;
                        }
                    }
                    o10.m();
                    Object[] objArr2 = o15.f24576b;
                    long[] jArr3 = o15.f24575a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j12 = jArr3[i14];
                            if ((((~j12) << 7) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((j12 & 255) < 128) {
                                        ((F) objArr2[(i14 << 3) + i16]).w();
                                    }
                                    j12 >>= 8;
                                }
                                if (i15 != 8) {
                                    break;
                                }
                            }
                            if (i14 == length2) {
                                break;
                            }
                            i14++;
                        }
                    }
                    o11.m();
                    o12.m();
                    Object[] objArr3 = o16.f24576b;
                    long[] jArr4 = o16.f24575a;
                    int length3 = jArr4.length - 2;
                    if (length3 >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j13 = jArr4[i17];
                            if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if ((j13 & 255) < 128) {
                                        F f12 = (F) objArr3[(i17 << 3) + i19];
                                        f12.v();
                                        o03.x0(f12);
                                    }
                                    j13 >>= 8;
                                }
                                if (i18 != 8) {
                                    break;
                                }
                            }
                            if (i17 == length3) {
                                break;
                            }
                            i17++;
                        }
                    }
                    o13.m();
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: private */
        public static final void n(List<C4890m0> list, O0 o02) {
            list.clear();
            synchronized (o02.f13802c) {
                try {
                    List A10 = o02.f13810k;
                    int size = A10.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((C4890m0) A10.get(i10));
                    }
                    o02.f13810k.clear();
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0139  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                r25 = this;
                r0 = r25
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f13855k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0089
                if (r2 == r4) goto L_0x0058
                if (r2 != r3) goto L_0x0050
                java.lang.Object r2 = r0.f13854j
                j0.O r2 = (j0.O) r2
                java.lang.Object r5 = r0.f13853i
                java.util.Set r5 = (java.util.Set) r5
                java.lang.Object r6 = r0.f13852h
                j0.O r6 = (j0.O) r6
                java.lang.Object r7 = r0.f13851g
                j0.O r7 = (j0.O) r7
                java.lang.Object r8 = r0.f13850f
                j0.O r8 = (j0.O) r8
                java.lang.Object r9 = r0.f13849e
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r10 = r0.f13848d
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r11 = r0.f13847c
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r12 = r0.f13856l
                U0.h0 r12 = (U0.C4879h0) r12
                XH.y.b(r26)
                r21 = r10
                r10 = r1
                r1 = r8
                r8 = r3
                r3 = r6
                r6 = r21
                r22 = r12
                r12 = r2
                r2 = r22
                r23 = r11
                r11 = r5
                r5 = r23
                r24 = r9
                r9 = r7
                r7 = r24
                goto L_0x0142
            L_0x0050:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0058:
                java.lang.Object r2 = r0.f13854j
                j0.O r2 = (j0.O) r2
                java.lang.Object r5 = r0.f13853i
                java.util.Set r5 = (java.util.Set) r5
                java.lang.Object r6 = r0.f13852h
                j0.O r6 = (j0.O) r6
                java.lang.Object r7 = r0.f13851g
                j0.O r7 = (j0.O) r7
                java.lang.Object r8 = r0.f13850f
                j0.O r8 = (j0.O) r8
                java.lang.Object r9 = r0.f13849e
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r10 = r0.f13848d
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r11 = r0.f13847c
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r12 = r0.f13856l
                U0.h0 r12 = (U0.C4879h0) r12
                XH.y.b(r26)
                r13 = r9
                r14 = r10
                r15 = r11
                r9 = r5
                r10 = r6
                r11 = r7
                r7 = r2
                r2 = r12
                r12 = r8
                goto L_0x00e5
            L_0x0089:
                XH.y.b(r26)
                java.lang.Object r2 = r0.f13856l
                U0.h0 r2 = (U0.C4879h0) r2
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                j0.O r8 = j0.a0.a()
                j0.O r9 = j0.a0.a()
                j0.O r10 = new j0.O
                r11 = 0
                r12 = 0
                r10.<init>(r11, r4, r12)
                java.util.Set r11 = W0.e.a(r10)
                j0.O r12 = j0.a0.a()
            L_0x00b6:
                U0.O0 r13 = r0.f13857m
                boolean r13 = r13.l0()
                if (r13 == 0) goto L_0x0166
                U0.O0 r13 = r0.f13857m
                r0.f13856l = r2
                r0.f13847c = r5
                r0.f13848d = r6
                r0.f13849e = r7
                r0.f13850f = r8
                r0.f13851g = r9
                r0.f13852h = r10
                r0.f13853i = r11
                r0.f13854j = r12
                r0.f13855k = r4
                java.lang.Object r13 = r13.Z(r0)
                if (r13 != r1) goto L_0x00db
                return r1
            L_0x00db:
                r15 = r5
                r14 = r6
                r13 = r7
                r7 = r12
                r12 = r8
                r21 = r11
                r11 = r9
                r9 = r21
            L_0x00e5:
                U0.O0 r5 = r0.f13857m
                boolean r5 = r5.w0()
                if (r5 == 0) goto L_0x0151
                U0.O0$k$a r8 = new U0.O0$k$a
                U0.O0 r6 = r0.f13857m
                r5 = r8
                r26 = r7
                r7 = r10
                r4 = r8
                r8 = r26
                r16 = r9
                r9 = r15
                r3 = r10
                r10 = r14
                r17 = r11
                r11 = r12
                r18 = r1
                r1 = r12
                r12 = r13
                r19 = r4
                r4 = r13
                r13 = r17
                r20 = r3
                r3 = r14
                r14 = r16
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
                r0.f13856l = r2
                r0.f13847c = r15
                r0.f13848d = r3
                r0.f13849e = r4
                r0.f13850f = r1
                r7 = r17
                r0.f13851g = r7
                r6 = r20
                r0.f13852h = r6
                r5 = r16
                r0.f13853i = r5
                r12 = r26
                r0.f13854j = r12
                r8 = 2
                r0.f13855k = r8
                r9 = r19
                java.lang.Object r9 = r2.i0(r9, r0)
                r10 = r18
                if (r9 != r10) goto L_0x0139
                return r10
            L_0x0139:
                r11 = r5
                r9 = r7
                r5 = r15
                r7 = r4
                r21 = r6
                r6 = r3
                r3 = r21
            L_0x0142:
                U0.O0 r4 = r0.f13857m
                r4.d0()
                r4 = 1
                r21 = r8
                r8 = r1
                r1 = r10
                r10 = r3
            L_0x014d:
                r3 = r21
                goto L_0x00b6
            L_0x0151:
                r8 = r3
                r5 = r9
                r6 = r10
                r4 = r13
                r3 = r14
                r10 = r1
                r1 = r12
                r12 = r7
                r7 = r11
                r11 = r5
                r9 = r7
                r5 = r15
                r7 = r4
                r4 = 1
                r21 = r8
                r8 = r1
                r1 = r10
                r10 = r6
                r6 = r3
                goto L_0x014d
            L_0x0166:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: U0.O0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: k */
        public final Object invoke(Q q10, C4879h0 h0Var, C17164e<? super C16807N> eVar) {
            k kVar = new k(this.f13857m, eVar);
            kVar.f13856l = h0Var;
            return kVar.invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends C17544u implements C17642l<Object, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F f13867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O<Object> f13868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(F f10, O<Object> o10) {
            super(1);
            this.f13867c = f10;
            this.f13868d = o10;
        }

        public final void a(Object obj) {
            this.f13867c.r(obj);
            O<Object> o10 = this.f13868d;
            if (o10 != null) {
                o10.h(obj);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    public O0(C17168i iVar) {
        C4878h hVar = new C4878h(new e(this));
        this.f13801b = hVar;
        C16283A a10 = I0.a((F0) iVar.get(F0.f137562d0));
        a10.s(new f(this));
        this.f13821v = a10;
        this.f13822w = iVar.plus(hVar).plus(a10);
        this.f13823x = new c();
    }

    private final C17642l<Object, C16807N> C0(F f10, O<Object> o10) {
        return new l(f10, o10);
    }

    private final void X(F f10) {
        this.f13805f.add(f10);
        this.f13806g = null;
    }

    private final void Y(C5334c cVar) {
        try {
            if (cVar.C() instanceof C5343l.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cVar.d();
        }
    }

    /* access modifiers changed from: private */
    public final Object Z(C17164e<? super C16807N> eVar) {
        C16324p pVar;
        if (j0()) {
            return C16807N.f139792a;
        }
        C16324p pVar2 = new C16324p(C17187b.c(eVar), 1);
        pVar2.C();
        synchronized (this.f13802c) {
            if (j0()) {
                pVar = pVar2;
            } else {
                this.f13815p = pVar2;
                pVar = null;
            }
        }
        if (pVar != null) {
            x.a aVar = x.f139812b;
            pVar.resumeWith(x.b(C16807N.f139792a));
        }
        Object w10 = pVar2.w();
        if (w10 == C17187b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    private final void b0() {
        this.f13805f.clear();
        this.f13806g = C16877v.n();
    }

    /* access modifiers changed from: private */
    public final C16320n<C16807N> c0() {
        d dVar;
        if (this.f13820u.getValue().compareTo(d.ShuttingDown) <= 0) {
            b0();
            this.f13807h = new O<>(0, 1, (DefaultConstructorMarker) null);
            this.f13808i.k();
            this.f13809j.clear();
            this.f13810k.clear();
            this.f13813n = null;
            C16320n<? super C16807N> nVar = this.f13815p;
            if (nVar != null) {
                C16320n.a.a(nVar, (Throwable) null, 1, (Object) null);
            }
            this.f13815p = null;
            this.f13818s = null;
            return null;
        }
        if (this.f13818s != null) {
            dVar = d.Inactive;
        } else if (this.f13803d == null) {
            this.f13807h = new O<>(0, 1, (DefaultConstructorMarker) null);
            this.f13808i.k();
            dVar = h0() ? d.InactivePendingWork : d.Inactive;
        } else {
            dVar = (this.f13808i.v() || this.f13807h.e() || !this.f13809j.isEmpty() || !this.f13810k.isEmpty() || this.f13816q > 0 || h0()) ? d.PendingWork : d.Idle;
        }
        this.f13820u.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        C16320n<? super C16807N> nVar2 = this.f13815p;
        this.f13815p = null;
        return nVar2;
    }

    /* access modifiers changed from: private */
    public final void d0() {
        int i10;
        List list;
        synchronized (this.f13802c) {
            try {
                if (!this.f13811l.isEmpty()) {
                    List A10 = C16877v.A(this.f13811l.values());
                    this.f13811l.clear();
                    list = new ArrayList(A10.size());
                    int size = A10.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        C4890m0 m0Var = (C4890m0) A10.get(i11);
                        list.add(C16796C.a(m0Var, this.f13812m.get(m0Var)));
                    }
                    this.f13812m.clear();
                } else {
                    list = C16877v.n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = list.size();
        for (i10 = 0; i10 < size2; i10++) {
            v vVar = (v) list.get(i10);
            C4890m0 m0Var2 = (C4890m0) vVar.a();
            C4888l0 l0Var = (C4888l0) vVar.b();
            if (l0Var != null) {
                m0Var2.b().u(l0Var);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean g0() {
        boolean h02;
        synchronized (this.f13802c) {
            h02 = h0();
        }
        return h02;
    }

    private final boolean h0() {
        return !this.f13819t && this.f13801b.r();
    }

    private final boolean i0() {
        return this.f13808i.v() || h0();
    }

    /* access modifiers changed from: private */
    public final boolean j0() {
        boolean z10;
        synchronized (this.f13802c) {
            z10 = this.f13807h.e() || this.f13808i.v() || h0();
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public final List<F> k0() {
        List<? extends F> list = this.f13806g;
        if (list == null) {
            List<F> list2 = this.f13805f;
            list = list2.isEmpty() ? C16877v.n() : new ArrayList<>(list2);
            this.f13806g = list;
        }
        return list;
    }

    /* access modifiers changed from: private */
    public final boolean l0() {
        boolean z10;
        synchronized (this.f13802c) {
            z10 = this.f13817r;
        }
        if (z10) {
            for (F0 c10 : this.f13821v.e()) {
                if (c10.c()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0.isEmpty() != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        q0(r0, (j0.O<java.lang.Object>) null);
        p0(r0, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r0 = new java.util.ArrayList();
        p0(r0, r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void o0(U0.F r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f13802c
            monitor-enter(r0)
            java.util.List<U0.m0> r1 = r5.f13810k     // Catch:{ all -> 0x0036 }
            int r2 = r1.size()     // Catch:{ all -> 0x0036 }
            r3 = 0
        L_0x000a:
            if (r3 >= r2) goto L_0x003b
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x0036 }
            U0.m0 r4 = (U0.C4890m0) r4     // Catch:{ all -> 0x0036 }
            U0.F r4 = r4.b()     // Catch:{ all -> 0x0036 }
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x0038
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p0(r0, r5, r6)
        L_0x0027:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0035
            r1 = 0
            r5.q0(r0, r1)
            p0(r0, r5, r6)
            goto L_0x0027
        L_0x0035:
            return
        L_0x0036:
            r6 = move-exception
            goto L_0x003d
        L_0x0038:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x003b:
            monitor-exit(r0)
            return
        L_0x003d:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.O0.o0(U0.F):void");
    }

    private static final void p0(List<C4890m0> list, O0 o02, F f10) {
        list.clear();
        synchronized (o02.f13802c) {
            try {
                Iterator<C4890m0> it = o02.f13810k.iterator();
                while (it.hasNext()) {
                    C4890m0 next = it.next();
                    if (C17542s.e(next.b(), f10)) {
                        list.add(next);
                        it.remove();
                    }
                }
                C16807N n10 = C16807N.f139792a;
            } finally {
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        r1 = r7.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        if (r6 >= r1) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c5, code lost:
        if (((XH.v) r7.get(r6)).d() == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c7, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ca, code lost:
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r8 >= r6) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
        r9 = (XH.v) r7.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e4, code lost:
        if (r9.d() != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e6, code lost:
        r9 = (U0.C4890m0) r9.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ed, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f0, code lost:
        if (r9 == null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f2, code lost:
        r1.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f5, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f8, code lost:
        r6 = r13.f13802c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fa, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        YH.C16877v.E(r13.f13810k, r1);
        r1 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0105, code lost:
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0113, code lost:
        if (r8 >= r6) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0115, code lost:
        r9 = r7.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (((XH.v) r9).d() == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0122, code lost:
        r1.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0125, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0128, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r4.s(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0141, code lost:
        throw r14;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<U0.F> q0(java.util.List<U0.C4890m0> r14, j0.O<java.lang.Object> r15) {
        /*
            r13 = this;
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r14.size()
            r0.<init>(r1)
            int r1 = r14.size()
            r2 = 0
            r3 = r2
        L_0x000f:
            if (r3 >= r1) goto L_0x0032
            java.lang.Object r4 = r14.get(r3)
            r5 = r4
            U0.m0 r5 = (U0.C4890m0) r5
            U0.F r5 = r5.b()
            java.lang.Object r6 = r0.get(r5)
            if (r6 != 0) goto L_0x002a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.put(r5, r6)
        L_0x002a:
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r4)
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0032:
            java.util.Set r14 = r0.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x003a:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0146
            java.lang.Object r1 = r14.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            U0.F r3 = (U0.F) r3
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r4 = r3.q()
            r4 = r4 ^ 1
            U0.C4895p.Q(r4)
            g1.k$a r4 = g1.C5342k.f23395e
            nI.l r5 = r13.u0(r3)
            nI.l r6 = r13.C0(r3, r15)
            g1.c r4 = r4.p(r5, r6)
            g1.k r5 = r4.l()     // Catch:{ all -> 0x013a }
            java.lang.Object r6 = r13.f13802c     // Catch:{ all -> 0x00ed }
            monitor-enter(r6)     // Catch:{ all -> 0x00ed }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x009a }
            int r8 = r1.size()     // Catch:{ all -> 0x009a }
            r7.<init>(r8)     // Catch:{ all -> 0x009a }
            int r8 = r1.size()     // Catch:{ all -> 0x009a }
            r9 = r2
        L_0x007e:
            if (r9 >= r8) goto L_0x009d
            java.lang.Object r10 = r1.get(r9)     // Catch:{ all -> 0x009a }
            U0.m0 r10 = (U0.C4890m0) r10     // Catch:{ all -> 0x009a }
            java.util.Map<U0.k0<java.lang.Object>, java.util.List<U0.m0>> r11 = r13.f13811l     // Catch:{ all -> 0x009a }
            U0.k0 r12 = r10.c()     // Catch:{ all -> 0x009a }
            java.lang.Object r11 = U0.P0.b(r11, r12)     // Catch:{ all -> 0x009a }
            XH.v r10 = XH.C16796C.a(r10, r11)     // Catch:{ all -> 0x009a }
            r7.add(r10)     // Catch:{ all -> 0x009a }
            int r9 = r9 + 1
            goto L_0x007e
        L_0x009a:
            r14 = move-exception
            goto L_0x013c
        L_0x009d:
            monitor-exit(r6)     // Catch:{ all -> 0x00ed }
            int r1 = r7.size()     // Catch:{ all -> 0x00ed }
            r6 = r2
        L_0x00a3:
            if (r6 >= r1) goto L_0x012d
            java.lang.Object r8 = r7.get(r6)     // Catch:{ all -> 0x00ed }
            XH.v r8 = (XH.v) r8     // Catch:{ all -> 0x00ed }
            java.lang.Object r8 = r8.d()     // Catch:{ all -> 0x00ed }
            if (r8 != 0) goto L_0x00b4
            int r6 = r6 + 1
            goto L_0x00a3
        L_0x00b4:
            int r1 = r7.size()     // Catch:{ all -> 0x00ed }
            r6 = r2
        L_0x00b9:
            if (r6 >= r1) goto L_0x012d
            java.lang.Object r8 = r7.get(r6)     // Catch:{ all -> 0x00ed }
            XH.v r8 = (XH.v) r8     // Catch:{ all -> 0x00ed }
            java.lang.Object r8 = r8.d()     // Catch:{ all -> 0x00ed }
            if (r8 == 0) goto L_0x00ca
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x00ca:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ed }
            int r6 = r7.size()     // Catch:{ all -> 0x00ed }
            r1.<init>(r6)     // Catch:{ all -> 0x00ed }
            int r6 = r7.size()     // Catch:{ all -> 0x00ed }
            r8 = r2
        L_0x00d8:
            if (r8 >= r6) goto L_0x00f8
            java.lang.Object r9 = r7.get(r8)     // Catch:{ all -> 0x00ed }
            XH.v r9 = (XH.v) r9     // Catch:{ all -> 0x00ed }
            java.lang.Object r10 = r9.d()     // Catch:{ all -> 0x00ed }
            if (r10 != 0) goto L_0x00ef
            java.lang.Object r9 = r9.c()     // Catch:{ all -> 0x00ed }
            U0.m0 r9 = (U0.C4890m0) r9     // Catch:{ all -> 0x00ed }
            goto L_0x00f0
        L_0x00ed:
            r14 = move-exception
            goto L_0x013e
        L_0x00ef:
            r9 = 0
        L_0x00f0:
            if (r9 == 0) goto L_0x00f5
            r1.add(r9)     // Catch:{ all -> 0x00ed }
        L_0x00f5:
            int r8 = r8 + 1
            goto L_0x00d8
        L_0x00f8:
            java.lang.Object r6 = r13.f13802c     // Catch:{ all -> 0x00ed }
            monitor-enter(r6)     // Catch:{ all -> 0x00ed }
            java.util.List<U0.m0> r8 = r13.f13810k     // Catch:{ all -> 0x012a }
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x012a }
            YH.C16877v.E(r8, r1)     // Catch:{ all -> 0x012a }
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x012a }
            monitor-exit(r6)     // Catch:{ all -> 0x00ed }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ed }
            int r6 = r7.size()     // Catch:{ all -> 0x00ed }
            r1.<init>(r6)     // Catch:{ all -> 0x00ed }
            int r6 = r7.size()     // Catch:{ all -> 0x00ed }
            r8 = r2
        L_0x0113:
            if (r8 >= r6) goto L_0x0128
            java.lang.Object r9 = r7.get(r8)     // Catch:{ all -> 0x00ed }
            r10 = r9
            XH.v r10 = (XH.v) r10     // Catch:{ all -> 0x00ed }
            java.lang.Object r10 = r10.d()     // Catch:{ all -> 0x00ed }
            if (r10 == 0) goto L_0x0125
            r1.add(r9)     // Catch:{ all -> 0x00ed }
        L_0x0125:
            int r8 = r8 + 1
            goto L_0x0113
        L_0x0128:
            r7 = r1
            goto L_0x012d
        L_0x012a:
            r14 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00ed }
            throw r14     // Catch:{ all -> 0x00ed }
        L_0x012d:
            r3.h(r7)     // Catch:{ all -> 0x00ed }
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x00ed }
            r4.s(r5)     // Catch:{ all -> 0x013a }
            r13.Y(r4)
            goto L_0x003a
        L_0x013a:
            r14 = move-exception
            goto L_0x0142
        L_0x013c:
            monitor-exit(r6)     // Catch:{ all -> 0x00ed }
            throw r14     // Catch:{ all -> 0x00ed }
        L_0x013e:
            r4.s(r5)     // Catch:{ all -> 0x013a }
            throw r14     // Catch:{ all -> 0x013a }
        L_0x0142:
            r13.Y(r4)
            throw r14
        L_0x0146:
            java.util.Set r14 = r0.keySet()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.List r14 = YH.C16877v.t1(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.O0.q0(java.util.List, j0.O):java.util.List");
    }

    /* access modifiers changed from: private */
    public final F r0(F f10, O<Object> o10) {
        Set<F> set;
        C5342k l10;
        if (f10.q() || f10.f() || ((set = this.f13814o) != null && set.contains(f10))) {
            return null;
        }
        C5334c p10 = C5342k.f23395e.p(u0(f10), C0(f10, o10));
        try {
            l10 = p10.l();
            if (o10 != null) {
                if (o10.e()) {
                    f10.j(new h(o10, f10));
                }
            }
            boolean i10 = f10.i();
            p10.s(l10);
            Y(p10);
            if (i10) {
                return f10;
            }
            return null;
        } catch (Throwable th2) {
            Y(p10);
            throw th2;
        }
    }

    private final void s0(Exception exc, F f10, boolean z10) {
        if (!f13797B.get().booleanValue() || (exc instanceof C4887l)) {
            synchronized (this.f13802c) {
                b bVar = this.f13818s;
                if (bVar == null) {
                    this.f13818s = new b(false, exc);
                    C16807N n10 = C16807N.f139792a;
                } else {
                    throw bVar.a();
                }
            }
            throw exc;
        }
        synchronized (this.f13802c) {
            try {
                C4860b.f("Error was captured in composition while live edit was enabled.", exc);
                this.f13809j.clear();
                this.f13808i.k();
                this.f13807h = new O<>(0, 1, (DefaultConstructorMarker) null);
                this.f13810k.clear();
                this.f13811l.clear();
                this.f13812m.clear();
                this.f13818s = new b(z10, exc);
                if (f10 != null) {
                    x0(f10);
                }
                c0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* synthetic */ void t0(O0 o02, Exception exc, F f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        o02.s0(exc, f10, z10);
    }

    private final C17642l<Object, C16807N> u0(F f10) {
        return new i(f10);
    }

    private final Object v0(q<? super Q, ? super C4879h0, ? super C17164e<? super C16807N>, ? extends Object> qVar, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.f13801b, new j(this, qVar, C4884j0.a(eVar.getContext()), (C17164e<? super j>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r1 = r9.f13802c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3 = k0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1 = r3.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r6 >= r1) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r3.get(r6).o(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r9.f13820u.getValue().compareTo(U0.O0.d.ShuttingDown) <= 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        r1 = r9.f13802c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r9.f13807h = new j0.O<>(0, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        r0 = r9.f13802c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        if (c0() != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        r1 = i0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007e, code lost:
        monitor-enter(r9.f13802c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r9.f13807h.j(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0087, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w0() {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object r1 = r9.f13802c
            monitor-enter(r1)
            j0.O<java.lang.Object> r2 = r9.f13807h     // Catch:{ all -> 0x0012 }
            boolean r2 = r2.d()     // Catch:{ all -> 0x0012 }
            if (r2 == 0) goto L_0x0015
            boolean r0 = r9.i0()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return r0
        L_0x0012:
            r0 = move-exception
            goto L_0x008e
        L_0x0015:
            j0.O<java.lang.Object> r2 = r9.f13807h     // Catch:{ all -> 0x0012 }
            java.util.Set r2 = W0.e.a(r2)     // Catch:{ all -> 0x0012 }
            j0.O r3 = new j0.O     // Catch:{ all -> 0x0012 }
            r4 = 0
            r5 = 0
            r3.<init>(r5, r0, r4)     // Catch:{ all -> 0x0012 }
            r9.f13807h = r3     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            java.lang.Object r1 = r9.f13802c
            monitor-enter(r1)
            java.util.List r3 = r9.k0()     // Catch:{ all -> 0x008b }
            monitor-exit(r1)
            int r1 = r3.size()     // Catch:{ all -> 0x004f }
            r6 = r5
        L_0x0032:
            if (r6 >= r1) goto L_0x0051
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x004f }
            U0.F r7 = (U0.F) r7     // Catch:{ all -> 0x004f }
            r7.o(r2)     // Catch:{ all -> 0x004f }
            TJ.B<U0.O0$d> r7 = r9.f13820u     // Catch:{ all -> 0x004f }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x004f }
            U0.O0$d r7 = (U0.O0.d) r7     // Catch:{ all -> 0x004f }
            U0.O0$d r8 = U0.O0.d.ShuttingDown     // Catch:{ all -> 0x004f }
            int r7 = r7.compareTo(r8)     // Catch:{ all -> 0x004f }
            if (r7 <= 0) goto L_0x0051
            int r6 = r6 + r0
            goto L_0x0032
        L_0x004f:
            r0 = move-exception
            goto L_0x007c
        L_0x0051:
            java.lang.Object r1 = r9.f13802c     // Catch:{ all -> 0x004f }
            monitor-enter(r1)     // Catch:{ all -> 0x004f }
            j0.O r3 = new j0.O     // Catch:{ all -> 0x0079 }
            r3.<init>(r5, r0, r4)     // Catch:{ all -> 0x0079 }
            r9.f13807h = r3     // Catch:{ all -> 0x0079 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0079 }
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            java.lang.Object r0 = r9.f13802c
            monitor-enter(r0)
            QJ.n r1 = r9.c0()     // Catch:{ all -> 0x006d }
            if (r1 != 0) goto L_0x006f
            boolean r1 = r9.i0()     // Catch:{ all -> 0x006d }
            monitor-exit(r0)
            return r1
        L_0x006d:
            r1 = move-exception
            goto L_0x0077
        L_0x006f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "called outside of runRecomposeAndApplyChanges"
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            throw r1     // Catch:{ all -> 0x006d }
        L_0x0077:
            monitor-exit(r0)
            throw r1
        L_0x0079:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x004f }
        L_0x007c:
            java.lang.Object r1 = r9.f13802c
            monitor-enter(r1)
            j0.O<java.lang.Object> r3 = r9.f13807h     // Catch:{ all -> 0x0088 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0088 }
            r3.j(r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r1)
            throw r0
        L_0x0088:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x008b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x008e:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.O0.w0():boolean");
    }

    /* access modifiers changed from: private */
    public final void x0(F f10) {
        List list = this.f13813n;
        if (list == null) {
            list = new ArrayList();
            this.f13813n = list;
        }
        if (!list.contains(f10)) {
            list.add(f10);
        }
        z0(f10);
    }

    /* access modifiers changed from: private */
    public final void y0(F0 f02) {
        synchronized (this.f13802c) {
            Throwable th2 = this.f13804e;
            if (th2 != null) {
                throw th2;
            } else if (this.f13820u.getValue().compareTo(d.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            } else if (this.f13803d == null) {
                this.f13803d = f02;
                c0();
            } else {
                throw new IllegalStateException("Recomposer already running");
            }
        }
    }

    private final void z0(F f10) {
        this.f13805f.remove(f10);
        this.f13806g = null;
    }

    public final void A0() {
        C16320n<C16807N> nVar;
        synchronized (this.f13802c) {
            if (this.f13819t) {
                this.f13819t = false;
                nVar = c0();
            } else {
                nVar = null;
            }
        }
        if (nVar != null) {
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(C16807N.f139792a));
        }
    }

    public final Object B0(C17164e<? super C16807N> eVar) {
        Object v02 = v0(new k(this, (C17164e<? super k>) null), eVar);
        return v02 == C17187b.f() ? v02 : C16807N.f139792a;
    }

    public void a(F f10, p<? super C4889m, ? super Integer, C16807N> pVar) {
        C5334c p10;
        C5342k l10;
        boolean q10 = f10.q();
        try {
            C5342k.a aVar = C5342k.f23395e;
            p10 = aVar.p(u0(f10), C0(f10, (O<Object>) null));
            l10 = p10.l();
            f10.t(pVar);
            C16807N n10 = C16807N.f139792a;
            p10.s(l10);
            Y(p10);
            if (!q10) {
                aVar.g();
            }
            synchronized (this.f13802c) {
                if (this.f13820u.getValue().compareTo(d.ShuttingDown) > 0 && !k0().contains(f10)) {
                    X(f10);
                }
            }
            try {
                o0(f10);
                try {
                    f10.p();
                    f10.d();
                    if (!q10) {
                        aVar.g();
                    }
                } catch (Exception e10) {
                    t0(this, e10, (F) null, false, 6, (Object) null);
                }
            } catch (Exception e11) {
                s0(e11, f10, true);
            }
        } catch (Exception e12) {
            s0(e12, f10, true);
        } catch (Throwable th2) {
            Y(p10);
            throw th2;
        }
    }

    public final void a0() {
        synchronized (this.f13802c) {
            try {
                if (this.f13820u.getValue().compareTo(d.Idle) >= 0) {
                    this.f13820u.setValue(d.ShuttingDown);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        F0.a.a(this.f13821v, (CancellationException) null, 1, (Object) null);
    }

    public void b(C4890m0 m0Var) {
        synchronized (this.f13802c) {
            P0.a(this.f13811l, m0Var.c(), m0Var);
        }
    }

    public boolean d() {
        return f13797B.get().booleanValue();
    }

    public boolean e() {
        return false;
    }

    public final long e0() {
        return this.f13800a;
    }

    public boolean f() {
        return false;
    }

    public final C16519P<d> f0() {
        return this.f13820u;
    }

    public int h() {
        return 1000;
    }

    public C17168i i() {
        return this.f13822w;
    }

    public void k(C4890m0 m0Var) {
        C16320n<C16807N> c02;
        synchronized (this.f13802c) {
            this.f13810k.add(m0Var);
            c02 = c0();
        }
        if (c02 != null) {
            x.a aVar = x.f139812b;
            c02.resumeWith(x.b(C16807N.f139792a));
        }
    }

    public void l(F f10) {
        C16320n<C16807N> nVar;
        synchronized (this.f13802c) {
            if (!this.f13808i.l(f10)) {
                this.f13808i.b(f10);
                nVar = c0();
            } else {
                nVar = null;
            }
        }
        if (nVar != null) {
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(C16807N.f139792a));
        }
    }

    public void m(C4890m0 m0Var, C4888l0 l0Var) {
        synchronized (this.f13802c) {
            this.f13812m.put(m0Var, l0Var);
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final Object m0(C17164e<? super C16807N> eVar) {
        Object C10 = C16534i.C(f0(), new g((C17164e<? super g>) null), eVar);
        return C10 == C17187b.f() ? C10 : C16807N.f139792a;
    }

    public C4888l0 n(C4890m0 m0Var) {
        C4888l0 remove;
        synchronized (this.f13802c) {
            remove = this.f13812m.remove(m0Var);
        }
        return remove;
    }

    public final void n0() {
        synchronized (this.f13802c) {
            this.f13819t = true;
            C16807N n10 = C16807N.f139792a;
        }
    }

    public void o(Set<C5410a> set) {
    }

    public void q(F f10) {
        synchronized (this.f13802c) {
            try {
                Set set = this.f13814o;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.f13814o = set;
                }
                set.add(f10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void t(F f10) {
        synchronized (this.f13802c) {
            z0(f10);
            this.f13808i.y(f10);
            this.f13809j.remove(f10);
            C16807N n10 = C16807N.f139792a;
        }
    }
}
