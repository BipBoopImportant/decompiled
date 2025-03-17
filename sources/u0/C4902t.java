package U0;

import U0.I;
import W0.d;
import W0.f;
import XH.C16807N;
import XH.C16820k;
import XH.v;
import YH.C16877v;
import dI.C17168i;
import g1.C5326G;
import g1.C5327H;
import g1.C5338g;
import h1.c;
import j0.D;
import j0.N;
import j0.O;
import j0.Q;
import j0.Z;
import j0.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001@B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b(\u0010)J)\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040/H\u0002¢\u0006\u0004\b0\u00101J\u0011\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b5\u0010\u0011J\u001d\u00106\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b6\u0010\u0011J\u001d\u00107\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0013J\u001d\u00109\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0016¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010>\u001a\u00020\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010 J\u0017\u0010A\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\bA\u0010 J\u000f\u0010B\u001a\u00020\u0016H\u0016¢\u0006\u0004\bB\u0010CJ+\u0010H\u001a\u00020\u000e2\u001a\u0010G\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020F\u0012\u0006\u0012\u0004\u0018\u00010F0E0DH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000eH\u0016¢\u0006\u0004\bN\u0010\u0013J\u000f\u0010O\u001a\u00020\u000eH\u0016¢\u0006\u0004\bO\u0010\u0013J\u000f\u0010P\u001a\u00020\u000eH\u0016¢\u0006\u0004\bP\u0010\u0013J\u000f\u0010Q\u001a\u00020\u000eH\u0016¢\u0006\u0004\bQ\u0010\u0013J\u000f\u0010R\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010\u0013J5\u0010W\u001a\u00028\u0000\"\u0004\b\u0000\u0010S2\b\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010V\u001a\u00020U2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\bW\u0010XJ!\u0010Y\u001a\u00020,2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b]\u0010^J\u001b\u0010`\u001a\u00020\u000e2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030_H\u0000¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u000eH\u0016¢\u0006\u0004\bb\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010cR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u0010dR(\u0010h\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`f8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010gR\u0014\u0010j\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010iR \u0010o\u001a\b\u0012\u0004\u0012\u00020l0k8\u0002X\u0004¢\u0006\f\n\u0004\b[\u0010m\u0012\u0004\bn\u0010\u0013R \u0010v\u001a\u00020p8\u0000X\u0004¢\u0006\u0012\n\u0004\bq\u0010r\u0012\u0004\bu\u0010\u0013\u001a\u0004\bs\u0010tR \u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%0/8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010wR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020%0y8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010zR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020%0y8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010zR$\u0010}\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030_0/8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010wR\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010~R\u0015\u0010\u0001\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010~R!\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%0/8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010wR#\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010wR.\u0010\u0001\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u001d\n\u0005\b9\u0010\u0001\u0012\u0005\b\u0001\u0010\u0013\u001a\u0005\b\u0001\u0010C\"\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bN\u0010\u0001R\u0018\u0010\u0001\u001a\u00020U8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010\u001fR\u001f\u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u000f\n\u0005\bA\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0007\n\u0005\b7\u0010\u0001R\u001a\u0010\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\bL\u0010\u0001\u001a\u0005\b\u0001\u0010CR\u0018\u0010\u0001\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bQ\u0010\u0001R-\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\bP\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u0001\u0010\u0011R\u0016\u0010 \u0001\u001a\u00020\u00168BX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010CR\u0016\u0010¡\u0001\u001a\u00020\u00168VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010CR\u0015\u0010¢\u0001\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\bq\u0010CR\u0016\u0010£\u0001\u001a\u00020\u00168VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010C¨\u0006¤\u0001"}, d2 = {"LU0/t;", "LU0/F;", "LU0/V0;", "LU0/N0;", "", "LU0/r;", "parent", "LU0/f;", "applier", "LdI/i;", "recomposeContext", "<init>", "(LU0/r;LU0/f;LdI/i;)V", "Lkotlin/Function0;", "LXH/N;", "content", "C", "(LnI/p;)V", "D", "()V", "E", "value", "", "forgetConditionalScopes", "n", "(Ljava/lang/Object;Z)V", "", "values", "z", "(Ljava/util/Set;Z)V", "B", "I", "(Ljava/lang/Object;)V", "LV0/a;", "changes", "A", "(LV0/a;)V", "LU0/L0;", "scope", "instance", "N", "(LU0/L0;Ljava/lang/Object;)Z", "LU0/d;", "anchor", "LU0/Z;", "H", "(LU0/L0;LU0/d;Ljava/lang/Object;)LU0/Z;", "LW0/f;", "M", "()LW0/f;", "Lh1/c;", "J", "()Lh1/c;", "m", "x", "t", "b", "o", "(Ljava/util/Set;)V", "k", "(Ljava/util/Set;)Z", "block", "j", "(LnI/a;)V", "a", "r", "i", "()Z", "", "LXH/v;", "LU0/m0;", "references", "h", "(Ljava/util/List;)V", "LU0/l0;", "state", "u", "(LU0/l0;)V", "p", "d", "w", "v", "y", "R", "to", "", "groupIndex", "g", "(LU0/F;ILnI/a;)Ljava/lang/Object;", "c", "(LU0/L0;Ljava/lang/Object;)LU0/Z;", "e", "(LU0/L0;)V", "L", "(Ljava/lang/Object;LU0/L0;)V", "LU0/I;", "K", "(LU0/I;)V", "deactivate", "LU0/r;", "LU0/f;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Ljava/lang/Object;", "lock", "", "LU0/T0;", "Ljava/util/Set;", "getAbandonSet$annotations", "abandonSet", "LU0/c1;", "f", "LU0/c1;", "getSlotTable$runtime_release", "()LU0/c1;", "getSlotTable$runtime_release$annotations", "slotTable", "LW0/f;", "observations", "Lj0/O;", "Lj0/O;", "invalidatedScopes", "conditionallyInvalidatedScopes", "derivedStates", "LV0/a;", "l", "lateChanges", "observationsProcessed", "invalidations", "Z", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "getPendingInvalidScopes$runtime_release$annotations", "pendingInvalidScopes", "LU0/t;", "invalidationDelegate", "q", "invalidationDelegateGroup", "LU0/A;", "LU0/A;", "G", "()LU0/A;", "observerHolder", "LU0/n;", "s", "LU0/n;", "composer", "LdI/i;", "_recomposeContext", "isRoot", "disposed", "LnI/p;", "getComposable", "()LnI/p;", "setComposable", "composable", "F", "areChildrenComposing", "isComposing", "isDisposed", "hasInvalidations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.t  reason: case insensitive filesystem */
public final class C4902t implements F, V0, N0 {

    /* renamed from: a  reason: collision with root package name */
    private final r f14134a;

    /* renamed from: b  reason: collision with root package name */
    private final C4872f<?> f14135b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<Object> f14136c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f14137d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<T0> f14138e;

    /* renamed from: f  reason: collision with root package name */
    private final C4865c1 f14139f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final f<Object, L0> f14140g;

    /* renamed from: h  reason: collision with root package name */
    private final O<L0> f14141h;

    /* renamed from: i  reason: collision with root package name */
    private final O<L0> f14142i;

    /* renamed from: j  reason: collision with root package name */
    private final f<Object, I<?>> f14143j;

    /* renamed from: k  reason: collision with root package name */
    private final V0.a f14144k;

    /* renamed from: l  reason: collision with root package name */
    private final V0.a f14145l;

    /* renamed from: m  reason: collision with root package name */
    private final f<Object, L0> f14146m;

    /* renamed from: n  reason: collision with root package name */
    private f<L0, Object> f14147n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f14148o;

    /* renamed from: p  reason: collision with root package name */
    private C4902t f14149p;

    /* renamed from: q  reason: collision with root package name */
    private int f14150q;

    /* renamed from: r  reason: collision with root package name */
    private final A f14151r;

    /* renamed from: s  reason: collision with root package name */
    private final C4891n f14152s;

    /* renamed from: t  reason: collision with root package name */
    private final C17168i f14153t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f14154u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f14155v;

    /* renamed from: w  reason: collision with root package name */
    private p<? super C4889m, ? super Integer, C16807N> f14156w;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u0010.\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010-¨\u00060"}, d2 = {"LU0/t$a;", "LU0/S0;", "", "LU0/T0;", "abandoning", "<init>", "(Ljava/util/Set;)V", "", "instance", "", "endRelativeOrder", "priority", "endRelativeAfter", "LXH/N;", "j", "(Ljava/lang/Object;III)V", "i", "(I)V", "d", "(LU0/T0;)V", "b", "(LU0/T0;III)V", "Lkotlin/Function0;", "effect", "a", "(LnI/a;)V", "LU0/k;", "c", "(LU0/k;III)V", "e", "g", "()V", "h", "f", "Ljava/util/Set;", "", "Ljava/util/List;", "remembering", "leaving", "sideEffects", "Lj0/O;", "Lj0/O;", "releasing", "pending", "Lj0/D;", "Lj0/D;", "priorities", "afters", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.t$a */
    private static final class a implements S0 {

        /* renamed from: a  reason: collision with root package name */
        private final Set<T0> f14157a;

        /* renamed from: b  reason: collision with root package name */
        private final List<T0> f14158b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<Object> f14159c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List<C17631a<C16807N>> f14160d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private O<C4885k> f14161e;

        /* renamed from: f  reason: collision with root package name */
        private final List<Object> f14162f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private final D f14163g = new D(0, 1, (DefaultConstructorMarker) null);

        /* renamed from: h  reason: collision with root package name */
        private final D f14164h = new D(0, 1, (DefaultConstructorMarker) null);

        public a(Set<T0> set) {
            this.f14157a = set;
        }

        private final void i(int i10) {
            if (!this.f14162f.isEmpty()) {
                int i11 = 0;
                int i12 = 0;
                List list = null;
                D d10 = null;
                D d11 = null;
                while (i12 < this.f14164h.b()) {
                    if (i10 <= this.f14164h.a(i12)) {
                        Object remove = this.f14162f.remove(i12);
                        int n10 = this.f14164h.n(i12);
                        int n11 = this.f14163g.n(i12);
                        if (list == null) {
                            list = C16877v.t(remove);
                            d11 = new D(0, 1, (DefaultConstructorMarker) null);
                            d11.i(n10);
                            d10 = new D(0, 1, (DefaultConstructorMarker) null);
                            d10.i(n11);
                        } else {
                            C17542s.h(d10, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                            C17542s.h(d11, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                            list.add(remove);
                            d11.i(n10);
                            d10.i(n11);
                        }
                    } else {
                        i12++;
                    }
                }
                if (list != null) {
                    C17542s.h(d10, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    C17542s.h(d11, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    int size = list.size() - 1;
                    while (i11 < size) {
                        int i13 = i11 + 1;
                        int size2 = list.size();
                        for (int i14 = i13; i14 < size2; i14++) {
                            int a10 = d11.a(i11);
                            int a11 = d11.a(i14);
                            if (a10 < a11 || (a11 == a10 && d10.a(i11) < d10.a(i14))) {
                                C4904u.g(list, i11, i14);
                                C4904u.f(d10, i11, i14);
                                C4904u.f(d11, i11, i14);
                            }
                        }
                        i11 = i13;
                    }
                    this.f14159c.addAll(list);
                }
            }
        }

        private final void j(Object obj, int i10, int i11, int i12) {
            i(i10);
            if (i12 < 0 || i12 >= i10) {
                this.f14159c.add(obj);
                return;
            }
            this.f14162f.add(obj);
            this.f14163g.i(i11);
            this.f14164h.i(i12);
        }

        public void a(C17631a<C16807N> aVar) {
            this.f14160d.add(aVar);
        }

        public void b(T0 t02, int i10, int i11, int i12) {
            j(t02, i10, i11, i12);
        }

        public void c(C4885k kVar, int i10, int i11, int i12) {
            j(kVar, i10, i11, i12);
        }

        public void d(T0 t02) {
            this.f14158b.add(t02);
        }

        public void e(C4885k kVar, int i10, int i11, int i12) {
            O<C4885k> o10 = this.f14161e;
            if (o10 == null) {
                o10 = a0.a();
                this.f14161e = o10;
            }
            o10.w(kVar);
            j(kVar, i10, i11, i12);
        }

        public final void f() {
            if (!this.f14157a.isEmpty()) {
                Object a10 = E1.f13744a.a("Compose:abandons");
                try {
                    Iterator<T0> it = this.f14157a.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().c1();
                    }
                    C16807N n10 = C16807N.f139792a;
                    E1.f13744a.b(a10);
                } catch (Throwable th2) {
                    E1.f13744a.b(a10);
                    throw th2;
                }
            }
        }

        public final void g() {
            i(Integer.MIN_VALUE);
            if (!this.f14159c.isEmpty()) {
                Object a10 = E1.f13744a.a("Compose:onForgotten");
                try {
                    O<C4885k> o10 = this.f14161e;
                    for (int size = this.f14159c.size() - 1; -1 < size; size--) {
                        Object obj = this.f14159c.get(size);
                        if (obj instanceof T0) {
                            this.f14157a.remove(obj);
                            ((T0) obj).o1();
                        }
                        if (obj instanceof C4885k) {
                            if (o10 == null || !o10.a(obj)) {
                                ((C4885k) obj).f();
                            } else {
                                ((C4885k) obj).b();
                            }
                        }
                    }
                    C16807N n10 = C16807N.f139792a;
                    E1.f13744a.b(a10);
                } catch (Throwable th2) {
                    E1.f13744a.b(a10);
                    throw th2;
                }
            }
            if (!this.f14158b.isEmpty()) {
                Object a11 = E1.f13744a.a("Compose:onRemembered");
                try {
                    List<T0> list = this.f14158b;
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        T0 t02 = list.get(i10);
                        this.f14157a.remove(t02);
                        t02.w0();
                    }
                    C16807N n11 = C16807N.f139792a;
                    E1.f13744a.b(a11);
                } catch (Throwable th3) {
                    E1.f13744a.b(a11);
                    throw th3;
                }
            }
        }

        public final void h() {
            if (!this.f14160d.isEmpty()) {
                Object a10 = E1.f13744a.a("Compose:sideeffects");
                try {
                    List<C17631a<C16807N>> list = this.f14160d;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke();
                    }
                    this.f14160d.clear();
                    C16807N n10 = C16807N.f139792a;
                    E1.f13744a.b(a10);
                } catch (Throwable th2) {
                    E1.f13744a.b(a10);
                    throw th2;
                }
            }
        }
    }

    public C4902t(r rVar, C4872f<?> fVar, C17168i iVar) {
        this.f14134a = rVar;
        this.f14135b = fVar;
        this.f14136c = new AtomicReference<>((Object) null);
        this.f14137d = new Object();
        Set<T0> l10 = new O(0, 1, (DefaultConstructorMarker) null).l();
        this.f14138e = l10;
        C4865c1 c1Var = new C4865c1();
        if (rVar.d()) {
            c1Var.p();
        }
        if (rVar.f()) {
            c1Var.q();
        }
        this.f14139f = c1Var;
        this.f14140g = new f<>();
        this.f14141h = new O<>(0, 1, (DefaultConstructorMarker) null);
        this.f14142i = new O<>(0, 1, (DefaultConstructorMarker) null);
        this.f14143j = new f<>();
        V0.a aVar = new V0.a();
        this.f14144k = aVar;
        V0.a aVar2 = new V0.a();
        this.f14145l = aVar2;
        this.f14146m = new f<>();
        this.f14147n = new f<>();
        this.f14151r = new A((c) null, false, 3, (DefaultConstructorMarker) null);
        C4891n nVar = new C4891n(fVar, rVar, c1Var, l10, aVar, aVar2, this);
        rVar.p(nVar);
        this.f14152s = nVar;
        this.f14153t = iVar;
        this.f14154u = rVar instanceof O0;
        this.f14156w = C4881i.f13992a.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A(V0.a r31) {
        /*
            r30 = this;
            r1 = r30
            r0 = 1
            U0.t$a r2 = new U0.t$a
            java.util.Set<U0.T0> r3 = r1.f14138e
            r2.<init>(r3)
            boolean r3 = r31.c()     // Catch:{ all -> 0x01c3 }
            if (r3 == 0) goto L_0x001c
            V0.a r0 = r1.f14145l
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x001b
            r2.f()
        L_0x001b:
            return
        L_0x001c:
            java.lang.String r3 = "Compose:applyChanges"
            U0.E1 r4 = U0.E1.f13744a     // Catch:{ all -> 0x01c3 }
            java.lang.Object r3 = r4.a(r3)     // Catch:{ all -> 0x01c3 }
            U0.f<?> r5 = r1.f14135b     // Catch:{ all -> 0x01c7 }
            r5.h()     // Catch:{ all -> 0x01c7 }
            U0.c1 r5 = r1.f14139f     // Catch:{ all -> 0x01c7 }
            U0.f1 r5 = r5.J()     // Catch:{ all -> 0x01c7 }
            r6 = 0
            U0.f<?> r7 = r1.f14135b     // Catch:{ all -> 0x01cb }
            r8 = r31
            r8.b(r7, r5, r2)     // Catch:{ all -> 0x01cb }
            XH.N r7 = XH.C16807N.f139792a     // Catch:{ all -> 0x01cb }
            r5.L(r0)     // Catch:{ all -> 0x01c7 }
            U0.f<?> r5 = r1.f14135b     // Catch:{ all -> 0x01c7 }
            r5.e()     // Catch:{ all -> 0x01c7 }
            r4.b(r3)     // Catch:{ all -> 0x01c3 }
            r2.g()     // Catch:{ all -> 0x01c3 }
            r2.h()     // Catch:{ all -> 0x01c3 }
            boolean r3 = r1.f14148o     // Catch:{ all -> 0x01c3 }
            if (r3 == 0) goto L_0x01b4
            java.lang.String r3 = "Compose:unobserve"
            java.lang.Object r3 = r4.a(r3)     // Catch:{ all -> 0x01b0 }
            r1.f14148o = r6     // Catch:{ all -> 0x0124 }
            W0.f<java.lang.Object, U0.L0> r4 = r1.f14140g     // Catch:{ all -> 0x0124 }
            j0.N r4 = r4.d()     // Catch:{ all -> 0x0124 }
            long[] r5 = r4.f24568a     // Catch:{ all -> 0x0124 }
            int r7 = r5.length     // Catch:{ all -> 0x0124 }
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0197
            r8 = r6
        L_0x0064:
            r9 = r5[r8]     // Catch:{ all -> 0x0124 }
            long r11 = ~r9     // Catch:{ all -> 0x0124 }
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r14
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x0183
            int r11 = r8 - r7
            int r11 = ~r11     // Catch:{ all -> 0x0124 }
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
        L_0x007d:
            if (r6 >= r11) goto L_0x0172
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r9 & r16
            r20 = 128(0x80, double:6.32E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L_0x0150
            int r18 = r8 << 3
            int r0 = r18 + r6
            java.lang.Object[] r12 = r4.f24569b     // Catch:{ all -> 0x0124 }
            r12 = r12[r0]     // Catch:{ all -> 0x0124 }
            java.lang.Object[] r12 = r4.f24570c     // Catch:{ all -> 0x0124 }
            r12 = r12[r0]     // Catch:{ all -> 0x0124 }
            boolean r14 = r12 instanceof j0.O     // Catch:{ all -> 0x0124 }
            if (r14 == 0) goto L_0x0129
            java.lang.String r14 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>"
            kotlin.jvm.internal.C17542s.h(r12, r14)     // Catch:{ all -> 0x0124 }
            j0.O r12 = (j0.O) r12     // Catch:{ all -> 0x0124 }
            java.lang.Object[] r14 = r12.f24576b     // Catch:{ all -> 0x0124 }
            long[] r15 = r12.f24575a     // Catch:{ all -> 0x0124 }
            int r13 = r15.length     // Catch:{ all -> 0x0124 }
            int r13 = r13 + -2
            r25 = r2
            r24 = r5
            if (r13 < 0) goto L_0x0114
            r5 = 0
        L_0x00ae:
            r1 = r15[r5]     // Catch:{ all -> 0x00eb }
            r26 = r7
            r27 = r8
            long r7 = ~r1     // Catch:{ all -> 0x00eb }
            r18 = 7
            long r7 = r7 << r18
            long r7 = r7 & r1
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r22
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L_0x0105
            int r7 = r5 - r13
            int r7 = ~r7     // Catch:{ all -> 0x00eb }
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r8 = 0
        L_0x00cf:
            if (r8 >= r7) goto L_0x00fc
            long r28 = r1 & r16
            int r28 = (r28 > r20 ? 1 : (r28 == r20 ? 0 : -1))
            if (r28 >= 0) goto L_0x00f1
            int r28 = r5 << 3
            r29 = r15
            int r15 = r28 + r8
            r28 = r14[r15]     // Catch:{ all -> 0x00eb }
            U0.L0 r28 = (U0.L0) r28     // Catch:{ all -> 0x00eb }
            boolean r28 = r28.r()     // Catch:{ all -> 0x00eb }
            if (r28 != 0) goto L_0x00ee
            r12.y(r15)     // Catch:{ all -> 0x00eb }
            goto L_0x00ee
        L_0x00eb:
            r0 = move-exception
            goto L_0x01aa
        L_0x00ee:
            r15 = 8
            goto L_0x00f4
        L_0x00f1:
            r29 = r15
            goto L_0x00ee
        L_0x00f4:
            long r1 = r1 >> r15
            r19 = 1
            int r8 = r8 + 1
            r15 = r29
            goto L_0x00cf
        L_0x00fc:
            r29 = r15
            r15 = 8
            r19 = 1
            if (r7 != r15) goto L_0x011f
            goto L_0x0109
        L_0x0105:
            r29 = r15
            r19 = 1
        L_0x0109:
            if (r5 == r13) goto L_0x011f
            int r5 = r5 + 1
            r7 = r26
            r8 = r27
            r15 = r29
            goto L_0x00ae
        L_0x0114:
            r26 = r7
            r27 = r8
            r18 = 7
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L_0x011f:
            boolean r1 = r12.d()     // Catch:{ all -> 0x00eb }
            goto L_0x0148
        L_0x0124:
            r0 = move-exception
            r25 = r2
            goto L_0x01aa
        L_0x0129:
            r25 = r2
            r24 = r5
            r26 = r7
            r27 = r8
            r18 = r13
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.String r1 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2"
            kotlin.jvm.internal.C17542s.h(r12, r1)     // Catch:{ all -> 0x00eb }
            U0.L0 r12 = (U0.L0) r12     // Catch:{ all -> 0x00eb }
            boolean r1 = r12.r()     // Catch:{ all -> 0x00eb }
            if (r1 != 0) goto L_0x0147
            r1 = 1
            goto L_0x0148
        L_0x0147:
            r1 = 0
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r4.q(r0)     // Catch:{ all -> 0x00eb }
        L_0x014d:
            r0 = 8
            goto L_0x015d
        L_0x0150:
            r25 = r2
            r24 = r5
            r26 = r7
            r27 = r8
            r18 = r13
            r22 = r14
            r0 = r12
        L_0x015d:
            long r9 = r9 >> r0
            r1 = 1
            int r6 = r6 + r1
            r12 = r0
            r0 = r1
            r13 = r18
            r14 = r22
            r5 = r24
            r2 = r25
            r7 = r26
            r8 = r27
            r1 = r30
            goto L_0x007d
        L_0x0172:
            r1 = r0
            r25 = r2
            r24 = r5
            r26 = r7
            r27 = r8
            r0 = r12
            if (r11 != r0) goto L_0x0199
            r7 = r26
            r6 = r27
            goto L_0x0189
        L_0x0183:
            r1 = r0
            r25 = r2
            r24 = r5
            r6 = r8
        L_0x0189:
            if (r6 == r7) goto L_0x0199
            int r8 = r6 + 1
            r0 = r1
            r5 = r24
            r2 = r25
            r6 = 0
            r1 = r30
            goto L_0x0064
        L_0x0197:
            r25 = r2
        L_0x0199:
            r30.B()     // Catch:{ all -> 0x00eb }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00eb }
            U0.E1 r0 = U0.E1.f13744a     // Catch:{ all -> 0x01a6 }
            r0.b(r3)     // Catch:{ all -> 0x01a6 }
        L_0x01a3:
            r1 = r30
            goto L_0x01b7
        L_0x01a6:
            r0 = move-exception
        L_0x01a7:
            r1 = r30
            goto L_0x01db
        L_0x01aa:
            U0.E1 r1 = U0.E1.f13744a     // Catch:{ all -> 0x01a6 }
            r1.b(r3)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x01b0:
            r0 = move-exception
            r25 = r2
            goto L_0x01a7
        L_0x01b4:
            r25 = r2
            goto L_0x01a3
        L_0x01b7:
            V0.a r0 = r1.f14145l
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x01c2
            r25.f()
        L_0x01c2:
            return
        L_0x01c3:
            r0 = move-exception
            r25 = r2
            goto L_0x01db
        L_0x01c7:
            r0 = move-exception
            r25 = r2
            goto L_0x01d4
        L_0x01cb:
            r0 = move-exception
            r25 = r2
            r2 = 0
            r5.L(r2)     // Catch:{ all -> 0x01d3 }
            throw r0     // Catch:{ all -> 0x01d3 }
        L_0x01d3:
            r0 = move-exception
        L_0x01d4:
            U0.E1 r2 = U0.E1.f13744a     // Catch:{ all -> 0x01da }
            r2.b(r3)     // Catch:{ all -> 0x01da }
            throw r0     // Catch:{ all -> 0x01da }
        L_0x01da:
            r0 = move-exception
        L_0x01db:
            V0.a r2 = r1.f14145l
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x01e6
            r25.f()
        L_0x01e6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4902t.A(V0.a):void");
    }

    private final void B() {
        long[] jArr;
        int i10;
        int i11;
        int i12;
        long[] jArr2;
        int i13;
        boolean z10;
        Object[] objArr;
        long[] jArr3;
        long[] jArr4;
        N<Object, Object> d10 = this.f14143j.d();
        long[] jArr5 = d10.f24568a;
        int length = jArr5.length - 2;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j11 = jArr5[i15];
                if ((((~j11) << c10) & j11 & j10) != j10) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = d10.f24569b[i18];
                            Object obj2 = d10.f24570c[i18];
                            if (obj2 instanceof O) {
                                C17542s.h(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                O o10 = (O) obj2;
                                Object[] objArr2 = o10.f24576b;
                                long[] jArr6 = o10.f24575a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i12 = length;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        long j12 = jArr6[i19];
                                        i11 = i15;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                int i22 = i21;
                                                Object[] objArr4 = objArr3;
                                                if ((j12 & 255) < 128) {
                                                    int i23 = (i19 << 3) + i22;
                                                    jArr4 = jArr6;
                                                    if (!this.f14140g.c((I) objArr4[i23])) {
                                                        o10.y(i23);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                j12 >>= 8;
                                                i21 = i22 + 1;
                                                jArr6 = jArr4;
                                                objArr3 = objArr4;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i20 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        jArr6 = jArr3;
                                        objArr2 = objArr;
                                        i15 = i11;
                                        c10 = 7;
                                    }
                                } else {
                                    i11 = i15;
                                }
                                z10 = o10.d();
                            } else {
                                jArr2 = jArr5;
                                i12 = length;
                                i11 = i15;
                                C17542s.h(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z10 = !this.f14140g.c((I) obj2);
                            }
                            if (z10) {
                                d10.q(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr5;
                            i12 = length;
                            i11 = i15;
                            i13 = i14;
                        }
                        j11 >>= i13;
                        i17++;
                        i14 = i13;
                        jArr5 = jArr2;
                        length = i12;
                        i15 = i11;
                        c10 = 7;
                    }
                    jArr = jArr5;
                    int i24 = length;
                    int i25 = i15;
                    if (i16 != i14) {
                        break;
                    }
                    length = i24;
                    i10 = i25;
                } else {
                    jArr = jArr5;
                    i10 = i15;
                }
                if (i10 == length) {
                    break;
                }
                i15 = i10 + 1;
                jArr5 = jArr;
                c10 = 7;
                j10 = -9187201950435737472L;
                i14 = 8;
            }
        }
        if (this.f14142i.e()) {
            O<L0> o11 = this.f14142i;
            Object[] objArr5 = o11.f24576b;
            long[] jArr7 = o11.f24575a;
            int length3 = jArr7.length - 2;
            if (length3 >= 0) {
                int i26 = 0;
                while (true) {
                    long j13 = jArr7[i26];
                    if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                        int i27 = 8 - ((~(i26 - length3)) >>> 31);
                        for (int i28 = 0; i28 < i27; i28++) {
                            if ((j13 & 255) < 128) {
                                int i29 = (i26 << 3) + i28;
                                if (!((L0) objArr5[i29]).t()) {
                                    o11.y(i29);
                                }
                            }
                            j13 >>= 8;
                        }
                        if (i27 != 8) {
                            return;
                        }
                    }
                    if (i26 != length3) {
                        i26++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void C(p<? super C4889m, ? super Integer, C16807N> pVar) {
        if (this.f14155v) {
            C0.b("The composition is disposed");
        }
        this.f14156w = pVar;
        this.f14134a.a(this, pVar);
    }

    private final void D() {
        Object andSet = this.f14136c.getAndSet(C4904u.f14168a);
        if (andSet == null) {
            return;
        }
        if (C17542s.e(andSet, C4904u.f14168a)) {
            C4895p.t("pending composition has not been applied");
            throw new C16820k();
        } else if (andSet instanceof Set) {
            z((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set z10 : (Set[]) andSet) {
                z(z10, true);
            }
        } else {
            C4895p.t("corrupt pendingModifications drain: " + this.f14136c);
            throw new C16820k();
        }
    }

    private final void E() {
        Object andSet = this.f14136c.getAndSet((Object) null);
        if (C17542s.e(andSet, C4904u.f14168a)) {
            return;
        }
        if (andSet instanceof Set) {
            z((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set z10 : (Set[]) andSet) {
                z(z10, false);
            }
        } else if (andSet == null) {
            C4895p.t("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new C16820k();
        } else {
            C4895p.t("corrupt pendingModifications drain: " + this.f14136c);
            throw new C16820k();
        }
    }

    private final boolean F() {
        return this.f14152s.E0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b1, code lost:
        if (r6 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b7, code lost:
        return r6.H(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b8, code lost:
        r1.f14134a.l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        if (q() == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return U0.Z.SCHEDULED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return U0.Z.DEFERRED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final U0.Z H(U0.L0 r21, U0.C4866d r22, java.lang.Object r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            java.lang.Object r4 = r1.f14137d
            monitor-enter(r4)
            U0.t r5 = r1.f14149p     // Catch:{ all -> 0x001e }
            r6 = 0
            if (r5 == 0) goto L_0x0021
            U0.c1 r7 = r1.f14139f     // Catch:{ all -> 0x001e }
            int r8 = r1.f14150q     // Catch:{ all -> 0x001e }
            boolean r7 = r7.H(r8, r2)     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r5 = r6
        L_0x001c:
            r6 = r5
            goto L_0x0021
        L_0x001e:
            r0 = move-exception
            goto L_0x00c9
        L_0x0021:
            if (r6 != 0) goto L_0x00b0
            boolean r5 = r1.N(r0, r3)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x002d
            U0.Z r0 = U0.Z.IMMINENT     // Catch:{ all -> 0x001e }
            monitor-exit(r4)
            return r0
        L_0x002d:
            r20.J()     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x003b
            W0.f<U0.L0, java.lang.Object> r5 = r1.f14147n     // Catch:{ all -> 0x001e }
            U0.X0 r7 = U0.X0.f13893a     // Catch:{ all -> 0x001e }
            r5.h(r0, r7)     // Catch:{ all -> 0x001e }
            goto L_0x00b0
        L_0x003b:
            boolean r5 = r3 instanceof U0.I     // Catch:{ all -> 0x001e }
            if (r5 != 0) goto L_0x0048
            W0.f<U0.L0, java.lang.Object> r5 = r1.f14147n     // Catch:{ all -> 0x001e }
            U0.X0 r7 = U0.X0.f13893a     // Catch:{ all -> 0x001e }
            r5.h(r0, r7)     // Catch:{ all -> 0x001e }
            goto L_0x00b0
        L_0x0048:
            W0.f<U0.L0, java.lang.Object> r5 = r1.f14147n     // Catch:{ all -> 0x001e }
            j0.N r5 = r5.d()     // Catch:{ all -> 0x001e }
            java.lang.Object r5 = r5.c(r0)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x00ab
            boolean r7 = r5 instanceof j0.O     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x00a6
            j0.O r5 = (j0.O) r5     // Catch:{ all -> 0x001e }
            java.lang.Object[] r7 = r5.f24576b     // Catch:{ all -> 0x001e }
            long[] r5 = r5.f24575a     // Catch:{ all -> 0x001e }
            int r8 = r5.length     // Catch:{ all -> 0x001e }
            int r8 = r8 + -2
            if (r8 < 0) goto L_0x00ab
            r10 = 0
        L_0x0064:
            r11 = r5[r10]     // Catch:{ all -> 0x001e }
            long r13 = ~r11     // Catch:{ all -> 0x001e }
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x00a1
            int r13 = r10 - r8
            int r13 = ~r13     // Catch:{ all -> 0x001e }
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L_0x007e:
            if (r15 >= r13) goto L_0x009e
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x0098
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r7[r16]     // Catch:{ all -> 0x001e }
            U0.X0 r14 = U0.X0.f13893a     // Catch:{ all -> 0x001e }
            if (r9 != r14) goto L_0x0095
            goto L_0x00b0
        L_0x0095:
            r9 = 8
            goto L_0x0099
        L_0x0098:
            r9 = r14
        L_0x0099:
            long r11 = r11 >> r9
            int r15 = r15 + 1
            r14 = r9
            goto L_0x007e
        L_0x009e:
            r9 = r14
            if (r13 != r9) goto L_0x00ab
        L_0x00a1:
            if (r10 == r8) goto L_0x00ab
            int r10 = r10 + 1
            goto L_0x0064
        L_0x00a6:
            U0.X0 r7 = U0.X0.f13893a     // Catch:{ all -> 0x001e }
            if (r5 != r7) goto L_0x00ab
            goto L_0x00b0
        L_0x00ab:
            W0.f<U0.L0, java.lang.Object> r5 = r1.f14147n     // Catch:{ all -> 0x001e }
            r5.a(r0, r3)     // Catch:{ all -> 0x001e }
        L_0x00b0:
            monitor-exit(r4)
            if (r6 == 0) goto L_0x00b8
            U0.Z r0 = r6.H(r0, r2, r3)
            return r0
        L_0x00b8:
            U0.r r0 = r1.f14134a
            r0.l(r1)
            boolean r0 = r20.q()
            if (r0 == 0) goto L_0x00c6
            U0.Z r0 = U0.Z.DEFERRED
            goto L_0x00c8
        L_0x00c6:
            U0.Z r0 = U0.Z.SCHEDULED
        L_0x00c8:
            return r0
        L_0x00c9:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4902t.H(U0.L0, U0.d, java.lang.Object):U0.Z");
    }

    private final void I(Object obj) {
        Object c10 = this.f14140g.d().c(obj);
        if (c10 == null) {
            return;
        }
        if (c10 instanceof O) {
            O o10 = (O) c10;
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
                                L0 l02 = (L0) objArr[(i10 << 3) + i12];
                                if (l02.s(obj) == Z.IMMINENT) {
                                    this.f14146m.a(obj, l02);
                                }
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
        } else {
            L0 l03 = (L0) c10;
            if (l03.s(obj) == Z.IMMINENT) {
                this.f14146m.a(obj, l03);
            }
        }
    }

    private final c J() {
        A a10 = this.f14151r;
        if (a10.b()) {
            a10.a();
        } else {
            A j10 = this.f14134a.j();
            if (j10 != null) {
                j10.a();
            }
            a10.a();
            if (!C17542s.e((Object) null, (Object) null)) {
                a10.c((c) null);
            }
        }
        return null;
    }

    private final f<L0, Object> M() {
        f<L0, Object> fVar = this.f14147n;
        this.f14147n = new f<>();
        return fVar;
    }

    private final boolean N(L0 l02, Object obj) {
        return q() && this.f14152s.s1(l02, obj);
    }

    private final void n(Object obj, boolean z10) {
        Object obj2 = obj;
        Object c10 = this.f14140g.d().c(obj2);
        if (c10 == null) {
            return;
        }
        if (c10 instanceof O) {
            O o10 = (O) c10;
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
                                L0 l02 = (L0) objArr[(i10 << 3) + i12];
                                if (!this.f14146m.f(obj2, l02) && l02.s(obj2) != Z.IGNORED) {
                                    if (!l02.t() || z10) {
                                        this.f14141h.h(l02);
                                    } else {
                                        this.f14142i.h(l02);
                                    }
                                }
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
        } else {
            L0 l03 = (L0) c10;
            if (!this.f14146m.f(obj2, l03) && l03.s(obj2) != Z.IGNORED) {
                if (!l03.t() || z10) {
                    this.f14141h.h(l03);
                } else {
                    this.f14142i.h(l03);
                }
            }
        }
    }

    private final void z(Set<? extends Object> set, boolean z10) {
        String str;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        String str2;
        int i13;
        boolean z11;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        String str3;
        long[] jArr5;
        int i14;
        String str4;
        long[] jArr6;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z12;
        Object[] objArr3;
        long[] jArr7;
        Object[] objArr4;
        long[] jArr8;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Set<? extends Object> set2 = set;
        boolean z13 = z10;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i25 = 8;
        if (set2 instanceof d) {
            Z b10 = ((d) set2).b();
            Object[] objArr5 = b10.f24576b;
            long[] jArr9 = b10.f24575a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i26 = 0;
                while (true) {
                    long j11 = jArr9[i26];
                    if ((((~j11) << c10) & j11 & j10) != j10) {
                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j11 & 255) < 128) {
                                Object obj = objArr5[(i26 << 3) + i28];
                                if (obj instanceof L0) {
                                    ((L0) obj).s((Object) null);
                                } else {
                                    n(obj, z13);
                                    Object c11 = this.f14143j.d().c(obj);
                                    if (c11 != null) {
                                        if (c11 instanceof O) {
                                            O o10 = (O) c11;
                                            Object[] objArr6 = o10.f24576b;
                                            long[] jArr10 = o10.f24575a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                i20 = length;
                                                i23 = i26;
                                                int i29 = 0;
                                                while (true) {
                                                    long j12 = jArr10[i29];
                                                    i22 = i27;
                                                    i21 = i28;
                                                    if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                                        for (int i31 = 0; i31 < i30; i31++) {
                                                            if ((j12 & 255) < 128) {
                                                                n((I) objArr6[(i29 << 3) + i31], z13);
                                                            }
                                                            j12 >>= 8;
                                                        }
                                                        if (i30 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i29 == length2) {
                                                        break;
                                                    }
                                                    i29++;
                                                    i27 = i22;
                                                    i28 = i21;
                                                    c10 = 7;
                                                }
                                            }
                                        } else {
                                            i22 = i27;
                                            i21 = i28;
                                            i20 = length;
                                            i23 = i26;
                                            n((I) c11, z13);
                                        }
                                        i24 = 8;
                                    }
                                }
                                i22 = i27;
                                i21 = i28;
                                i20 = length;
                                i23 = i26;
                                i24 = 8;
                            } else {
                                i22 = i27;
                                i21 = i28;
                                i20 = length;
                                i23 = i26;
                                i24 = i25;
                            }
                            j11 >>= i24;
                            i28 = i21 + 1;
                            length = i20;
                            i25 = i24;
                            i26 = i23;
                            i27 = i22;
                            c10 = 7;
                        }
                        int i32 = length;
                        i19 = i26;
                        if (i27 != i25) {
                            break;
                        }
                        length = i32;
                    } else {
                        i19 = i26;
                    }
                    if (i19 == length) {
                        break;
                    }
                    i26 = i19 + 1;
                    c10 = 7;
                    j10 = -9187201950435737472L;
                    i25 = 8;
                }
            }
        } else {
            for (Object next : set2) {
                if (next instanceof L0) {
                    ((L0) next).s((Object) null);
                } else {
                    n(next, z13);
                    Object c12 = this.f14143j.d().c(next);
                    if (c12 != null) {
                        if (c12 instanceof O) {
                            O o11 = (O) c12;
                            Object[] objArr7 = o11.f24576b;
                            long[] jArr11 = o11.f24575a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i33 = 0;
                                while (true) {
                                    long j13 = jArr11[i33];
                                    if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i34 = 8 - ((~(i33 - length3)) >>> 31);
                                        for (int i35 = 0; i35 < i34; i35++) {
                                            if ((j13 & 255) < 128) {
                                                n((I) objArr7[(i33 << 3) + i35], z13);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i34 != 8) {
                                            break;
                                        }
                                    }
                                    if (i33 == length3) {
                                        break;
                                    }
                                    i33++;
                                }
                            }
                        } else {
                            n((I) c12, z13);
                        }
                    }
                }
            }
        }
        O<L0> o12 = this.f14142i;
        O<L0> o13 = this.f14141h;
        String str5 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (!z13 || !o12.e()) {
            String str6 = str5;
            if (o13.e()) {
                N<Object, Object> d10 = this.f14140g.d();
                long[] jArr12 = d10.f24568a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i36 = 0;
                    while (true) {
                        long j14 = jArr12[i36];
                        if ((((~j14) << 7) & j14 & -9187201950435737472L) != -9187201950435737472L) {
                            int i37 = 8 - ((~(i36 - length4)) >>> 31);
                            int i38 = 0;
                            while (i38 < i37) {
                                if ((j14 & 255) < 128) {
                                    int i39 = (i36 << 3) + i38;
                                    Object obj2 = d10.f24569b[i39];
                                    Object obj3 = d10.f24570c[i39];
                                    if (obj3 instanceof O) {
                                        String str7 = str6;
                                        C17542s.h(obj3, str7);
                                        O o14 = (O) obj3;
                                        Object[] objArr8 = o14.f24576b;
                                        long[] jArr13 = o14.f24575a;
                                        int length5 = jArr13.length - 2;
                                        jArr2 = jArr12;
                                        i11 = length4;
                                        i13 = i36;
                                        if (length5 >= 0) {
                                            int i40 = 0;
                                            while (true) {
                                                long j15 = jArr13[i40];
                                                str2 = str7;
                                                i12 = i37;
                                                if ((((~j15) << 7) & j15 & -9187201950435737472L) != -9187201950435737472L) {
                                                    int i41 = 8 - ((~(i40 - length5)) >>> 31);
                                                    int i42 = 0;
                                                    while (i42 < i41) {
                                                        if ((j15 & 255) < 128) {
                                                            jArr4 = jArr13;
                                                            int i43 = (i40 << 3) + i42;
                                                            objArr2 = objArr8;
                                                            if (o13.a((L0) objArr8[i43])) {
                                                                o14.y(i43);
                                                            }
                                                        } else {
                                                            objArr2 = objArr8;
                                                            jArr4 = jArr13;
                                                        }
                                                        j15 >>= 8;
                                                        i42++;
                                                        jArr13 = jArr4;
                                                        objArr8 = objArr2;
                                                    }
                                                    objArr = objArr8;
                                                    jArr3 = jArr13;
                                                    if (i41 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr = objArr8;
                                                    jArr3 = jArr13;
                                                }
                                                if (i40 == length5) {
                                                    break;
                                                }
                                                i40++;
                                                i37 = i12;
                                                str7 = str2;
                                                jArr13 = jArr3;
                                                objArr8 = objArr;
                                            }
                                        } else {
                                            str2 = str7;
                                            i12 = i37;
                                        }
                                        z11 = o14.d();
                                    } else {
                                        jArr2 = jArr12;
                                        i11 = length4;
                                        i12 = i37;
                                        str2 = str6;
                                        i13 = i36;
                                        C17542s.h(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        z11 = o13.a((L0) obj3);
                                    }
                                    if (z11) {
                                        d10.q(i39);
                                    }
                                } else {
                                    jArr2 = jArr12;
                                    i11 = length4;
                                    i12 = i37;
                                    str2 = str6;
                                    i13 = i36;
                                }
                                j14 >>= 8;
                                i38++;
                                length4 = i11;
                                jArr12 = jArr2;
                                i36 = i13;
                                i37 = i12;
                                str6 = str2;
                            }
                            jArr = jArr12;
                            int i44 = length4;
                            str = str6;
                            int i45 = i36;
                            if (i37 != 8) {
                                break;
                            }
                            length4 = i44;
                            i10 = i45;
                        } else {
                            jArr = jArr12;
                            str = str6;
                            i10 = i36;
                        }
                        if (i10 == length4) {
                            break;
                        }
                        i36 = i10 + 1;
                        jArr12 = jArr;
                        str6 = str;
                    }
                }
                B();
                o13.m();
                return;
            }
            return;
        }
        N<Object, Object> d11 = this.f14140g.d();
        long[] jArr14 = d11.f24568a;
        int length6 = jArr14.length - 2;
        if (length6 >= 0) {
            int i46 = 0;
            while (true) {
                long j16 = jArr14[i46];
                if ((((~j16) << 7) & j16 & -9187201950435737472L) != -9187201950435737472L) {
                    int i47 = 8 - ((~(i46 - length6)) >>> 31);
                    int i48 = 0;
                    while (i48 < i47) {
                        if ((j16 & 255) < 128) {
                            int i49 = (i46 << 3) + i48;
                            Object obj4 = d11.f24569b[i49];
                            Object obj5 = d11.f24570c[i49];
                            if (obj5 instanceof O) {
                                C17542s.h(obj5, str5);
                                O o15 = (O) obj5;
                                Object[] objArr9 = o15.f24576b;
                                jArr6 = jArr14;
                                long[] jArr15 = o15.f24575a;
                                str4 = str5;
                                int length7 = jArr15.length - 2;
                                i15 = length6;
                                i16 = i46;
                                if (length7 >= 0) {
                                    int i50 = 0;
                                    while (true) {
                                        long j17 = jArr15[i50];
                                        i17 = i47;
                                        i18 = i48;
                                        if ((((~j17) << 7) & j17 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i51 = 8 - ((~(i50 - length7)) >>> 31);
                                            int i52 = 0;
                                            while (i52 < i51) {
                                                if ((j17 & 255) < 128) {
                                                    jArr8 = jArr15;
                                                    int i53 = (i50 << 3) + i52;
                                                    objArr4 = objArr9;
                                                    L0 l02 = (L0) objArr9[i53];
                                                    if (o12.a(l02) || o13.a(l02)) {
                                                        o15.y(i53);
                                                    }
                                                } else {
                                                    objArr4 = objArr9;
                                                    jArr8 = jArr15;
                                                }
                                                j17 >>= 8;
                                                i52++;
                                                jArr15 = jArr8;
                                                objArr9 = objArr4;
                                            }
                                            objArr3 = objArr9;
                                            jArr7 = jArr15;
                                            if (i51 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr3 = objArr9;
                                            jArr7 = jArr15;
                                        }
                                        if (i50 == length7) {
                                            break;
                                        }
                                        i50++;
                                        i47 = i17;
                                        i48 = i18;
                                        jArr15 = jArr7;
                                        objArr9 = objArr3;
                                    }
                                } else {
                                    i17 = i47;
                                    i18 = i48;
                                }
                                z12 = o15.d();
                            } else {
                                str4 = str5;
                                jArr6 = jArr14;
                                i15 = length6;
                                i16 = i46;
                                i17 = i47;
                                i18 = i48;
                                C17542s.h(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                L0 l03 = (L0) obj5;
                                z12 = o12.a(l03) || o13.a(l03);
                            }
                            if (z12) {
                                d11.q(i49);
                            }
                        } else {
                            str4 = str5;
                            jArr6 = jArr14;
                            i15 = length6;
                            i16 = i46;
                            i17 = i47;
                            i18 = i48;
                        }
                        j16 >>= 8;
                        i48 = i18 + 1;
                        length6 = i15;
                        jArr14 = jArr6;
                        str5 = str4;
                        i46 = i16;
                        i47 = i17;
                    }
                    str3 = str5;
                    jArr5 = jArr14;
                    int i54 = length6;
                    int i55 = i46;
                    if (i47 != 8) {
                        break;
                    }
                    length6 = i54;
                    i14 = i55;
                } else {
                    str3 = str5;
                    jArr5 = jArr14;
                    i14 = i46;
                }
                if (i14 == length6) {
                    break;
                }
                i46 = i14 + 1;
                jArr14 = jArr5;
                str5 = str3;
            }
        }
        o12.m();
        B();
    }

    public final A G() {
        return this.f14151r;
    }

    public final void K(I<?> i10) {
        if (!this.f14140g.c(i10)) {
            this.f14143j.g(i10);
        }
    }

    public final void L(Object obj, L0 l02) {
        this.f14140g.f(obj, l02);
    }

    public void a(Object obj) {
        L0 G02;
        long[] jArr;
        long[] jArr2;
        int i10;
        Object obj2 = obj;
        if (!F() && (G02 = this.f14152s.G0()) != null) {
            G02.H(true);
            if (!G02.w(obj2)) {
                if (obj2 instanceof C5327H) {
                    ((C5327H) obj2).s(C5338g.a(1));
                }
                this.f14140g.a(obj2, G02);
                if (obj2 instanceof I) {
                    I i11 = (I) obj2;
                    I.a r10 = i11.r();
                    this.f14143j.g(obj2);
                    Q<C5326G> b10 = r10.b();
                    Object[] objArr = b10.f24552b;
                    long[] jArr3 = b10.f24551a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j10 = jArr3[i12];
                            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                int i13 = 8;
                                int i14 = 8 - ((~(i12 - length)) >>> 31);
                                int i15 = 0;
                                while (i15 < i14) {
                                    if ((j10 & 255) < 128) {
                                        C5326G g10 = (C5326G) objArr[(i12 << 3) + i15];
                                        if (g10 instanceof C5327H) {
                                            jArr2 = jArr3;
                                            ((C5327H) g10).s(C5338g.a(1));
                                        } else {
                                            jArr2 = jArr3;
                                        }
                                        this.f14143j.a(g10, obj2);
                                        i10 = 8;
                                    } else {
                                        jArr2 = jArr3;
                                        i10 = i13;
                                    }
                                    j10 >>= i10;
                                    i15++;
                                    i13 = i10;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i14 != i13) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i12 == length) {
                                break;
                            }
                            i12++;
                            jArr3 = jArr;
                        }
                    }
                    G02.v(i11, r10.a());
                }
            }
        }
    }

    public void b() {
        C4874f1 J10;
        synchronized (this.f14137d) {
            try {
                if (this.f14152s.P0()) {
                    C0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f14155v) {
                    this.f14155v = true;
                    this.f14156w = C4881i.f13992a.b();
                    V0.a H02 = this.f14152s.H0();
                    if (H02 != null) {
                        A(H02);
                    }
                    boolean z10 = this.f14139f.B() > 0;
                    if (z10 || !this.f14138e.isEmpty()) {
                        a aVar = new a(this.f14138e);
                        if (z10) {
                            this.f14135b.h();
                            J10 = this.f14139f.J();
                            C4895p.M(J10, aVar);
                            C16807N n10 = C16807N.f139792a;
                            J10.L(true);
                            this.f14135b.clear();
                            this.f14135b.e();
                            aVar.g();
                        }
                        aVar.f();
                    }
                    this.f14152s.s0();
                }
                C16807N n11 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f14134a.t(this);
    }

    public Z c(L0 l02, Object obj) {
        C4902t tVar;
        if (l02.k()) {
            l02.C(true);
        }
        C4866d i10 = l02.i();
        if (i10 == null || !i10.b()) {
            return Z.IGNORED;
        }
        if (this.f14139f.K(i10)) {
            return !l02.j() ? Z.IGNORED : H(l02, i10, obj);
        }
        synchronized (this.f14137d) {
            tVar = this.f14149p;
        }
        return (tVar == null || !tVar.N(l02, obj)) ? Z.IGNORED : Z.IMMINENT;
    }

    public void d() {
        synchronized (this.f14137d) {
            try {
                if (this.f14145l.d()) {
                    A(this.f14145l);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Exception e10) {
                try {
                    v();
                    throw e10;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                if (!this.f14138e.isEmpty()) {
                    new a(this.f14138e).f();
                }
                throw th3;
            }
        }
    }

    public void deactivate() {
        Object a10;
        C4874f1 J10;
        synchronized (this.f14137d) {
            try {
                boolean z10 = this.f14139f.B() > 0;
                if (!z10) {
                    if (!this.f14138e.isEmpty()) {
                    }
                    this.f14140g.b();
                    this.f14143j.b();
                    this.f14147n.b();
                    this.f14144k.a();
                    this.f14145l.a();
                    this.f14152s.r0();
                    C16807N n10 = C16807N.f139792a;
                }
                E1 e12 = E1.f13744a;
                a10 = e12.a("Compose:deactivate");
                a aVar = new a(this.f14138e);
                if (z10) {
                    this.f14135b.h();
                    J10 = this.f14139f.J();
                    C4895p.u(J10, aVar);
                    C16807N n11 = C16807N.f139792a;
                    J10.L(true);
                    this.f14135b.e();
                    aVar.g();
                }
                aVar.f();
                C16807N n12 = C16807N.f139792a;
                e12.b(a10);
                this.f14140g.b();
                this.f14143j.b();
                this.f14147n.b();
                this.f14144k.a();
                this.f14145l.a();
                this.f14152s.r0();
                C16807N n102 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(L0 l02) {
        this.f14148o = true;
    }

    public boolean f() {
        return this.f14155v;
    }

    public <R> R g(F f10, int i10, C17631a<? extends R> aVar) {
        if (f10 == null || C17542s.e(f10, this) || i10 < 0) {
            return aVar.invoke();
        }
        this.f14149p = (C4902t) f10;
        this.f14150q = i10;
        try {
            return aVar.invoke();
        } finally {
            this.f14149p = null;
            this.f14150q = 0;
        }
    }

    public void h(List<v<C4890m0, C4890m0>> list) {
        boolean z10 = true;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (!C17542s.e(((C4890m0) list.get(i10).c()).b(), this)) {
                z10 = false;
                break;
            } else {
                i10++;
            }
        }
        C4895p.Q(z10);
        try {
            this.f14152s.M0(list);
            C16807N n10 = C16807N.f139792a;
        } catch (Exception e10) {
            v();
            throw e10;
        } catch (Throwable th2) {
            if (!this.f14138e.isEmpty()) {
                new a(this.f14138e).f();
            }
            throw th2;
        }
    }

    public boolean i() {
        f<L0, Object> M10;
        boolean W02;
        synchronized (this.f14137d) {
            try {
                D();
                try {
                    M10 = M();
                    J();
                    W02 = this.f14152s.W0(M10);
                    if (!W02) {
                        E();
                    }
                } catch (Exception e10) {
                    this.f14147n = M10;
                    throw e10;
                } catch (Exception e11) {
                    v();
                    throw e11;
                } catch (Throwable th2) {
                    if (!this.f14138e.isEmpty()) {
                        new a(this.f14138e).f();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return W02;
    }

    public void j(C17631a<C16807N> aVar) {
        this.f14152s.U0(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(java.util.Set<? extends java.lang.Object> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof W0.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005c
            W0.d r15 = (W0.d) r15
            j0.Z r15 = r15.b()
            java.lang.Object[] r0 = r15.f24576b
            long[] r15 = r15.f24575a
            int r3 = r15.length
            int r3 = r3 + -2
            if (r3 < 0) goto L_0x007d
            r4 = r1
        L_0x0016:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0057
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L_0x0030:
            if (r9 >= r7) goto L_0x0055
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x0051
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            W0.f<java.lang.Object, U0.L0> r11 = r14.f14140g
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L_0x0050
            W0.f<java.lang.Object, U0.I<?>> r11 = r14.f14143j
            boolean r10 = r11.c(r10)
            if (r10 == 0) goto L_0x0051
        L_0x0050:
            return r2
        L_0x0051:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L_0x0030
        L_0x0055:
            if (r7 != r8) goto L_0x007d
        L_0x0057:
            if (r4 == r3) goto L_0x007d
            int r4 = r4 + 1
            goto L_0x0016
        L_0x005c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x0062:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r15.next()
            W0.f<java.lang.Object, U0.L0> r3 = r14.f14140g
            boolean r3 = r3.c(r0)
            if (r3 != 0) goto L_0x007c
            W0.f<java.lang.Object, U0.I<?>> r3 = r14.f14143j
            boolean r0 = r3.c(r0)
            if (r0 == 0) goto L_0x0062
        L_0x007c:
            return r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4902t.k(java.util.Set):boolean");
    }

    public void m(p<? super C4889m, ? super Integer, C16807N> pVar) {
        C(pVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(java.util.Set<? extends java.lang.Object> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r4.f14136c
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L_0x000b
            r2 = r1
            goto L_0x0013
        L_0x000b:
            java.lang.Object r2 = U0.C4904u.f14168a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r2)
        L_0x0013:
            if (r2 == 0) goto L_0x0017
            r2 = r5
            goto L_0x0034
        L_0x0017:
            boolean r2 = r0 instanceof java.util.Set
            if (r2 == 0) goto L_0x0024
            r2 = 2
            java.util.Set[] r2 = new java.util.Set[r2]
            r3 = 0
            r2[r3] = r0
            r2[r1] = r5
            goto L_0x0034
        L_0x0024:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            java.lang.Object[] r2 = YH.C16870n.G(r1, r5)
        L_0x0034:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r4.f14136c
            boolean r1 = d0.i.a(r1, r0, r2)
            if (r1 == 0) goto L_0x0000
            if (r0 != 0) goto L_0x004b
            java.lang.Object r5 = r4.f14137d
            monitor-enter(r5)
            r4.E()     // Catch:{ all -> 0x0048 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)
            goto L_0x004b
        L_0x0048:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x004b:
            return
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "corrupt pendingModifications: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r4.f14136c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4902t.o(java.util.Set):void");
    }

    public void p() {
        synchronized (this.f14137d) {
            try {
                A(this.f14144k);
                E();
                C16807N n10 = C16807N.f139792a;
            } catch (Exception e10) {
                try {
                    v();
                    throw e10;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                if (!this.f14138e.isEmpty()) {
                    new a(this.f14138e).f();
                }
                throw th3;
            }
        }
    }

    public boolean q() {
        return this.f14152s.P0();
    }

    public void r(Object obj) {
        synchronized (this.f14137d) {
            try {
                I(obj);
                Object c10 = this.f14143j.d().c(obj);
                if (c10 != null) {
                    if (c10 instanceof O) {
                        O o10 = (O) c10;
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
                                            I((I) objArr[(i10 << 3) + i12]);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    }
                                }
                                if (i10 == length) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    } else {
                        I((I) c10);
                    }
                }
                C16807N n10 = C16807N.f139792a;
            } finally {
            }
        }
    }

    public boolean s() {
        boolean z10;
        synchronized (this.f14137d) {
            z10 = this.f14147n.e() > 0;
        }
        return z10;
    }

    public void t(p<? super C4889m, ? super Integer, C16807N> pVar) {
        f<L0, Object> M10;
        try {
            synchronized (this.f14137d) {
                D();
                M10 = M();
                J();
                this.f14152s.m0(M10, pVar);
            }
        } catch (Exception e10) {
            this.f14147n = M10;
            throw e10;
        } catch (Exception e11) {
            v();
            throw e11;
        } catch (Throwable th2) {
            if (!this.f14138e.isEmpty()) {
                new a(this.f14138e).f();
            }
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public void u(C4888l0 l0Var) {
        a aVar = new a(this.f14138e);
        C4874f1 J10 = l0Var.a().J();
        try {
            C4895p.M(J10, aVar);
            C16807N n10 = C16807N.f139792a;
            J10.L(true);
            aVar.g();
        } catch (Throwable th2) {
            J10.L(false);
            throw th2;
        }
    }

    public void v() {
        this.f14136c.set((Object) null);
        this.f14144k.a();
        this.f14145l.a();
        if (!this.f14138e.isEmpty()) {
            new a(this.f14138e).f();
        }
    }

    public void w() {
        synchronized (this.f14137d) {
            try {
                this.f14152s.j0();
                if (!this.f14138e.isEmpty()) {
                    new a(this.f14138e).f();
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Exception e10) {
                try {
                    v();
                    throw e10;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                if (!this.f14138e.isEmpty()) {
                    new a(this.f14138e).f();
                }
                throw th3;
            }
        }
    }

    public void x(p<? super C4889m, ? super Integer, C16807N> pVar) {
        this.f14152s.q1();
        C(pVar);
        this.f14152s.x0();
    }

    public void y() {
        synchronized (this.f14137d) {
            try {
                for (Object obj : this.f14139f.C()) {
                    L0 l02 = obj instanceof L0 ? (L0) obj : null;
                    if (l02 != null) {
                        l02.invalidate();
                    }
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4902t(r rVar, C4872f fVar, C17168i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, fVar, (i10 & 4) != 0 ? null : iVar);
    }
}
