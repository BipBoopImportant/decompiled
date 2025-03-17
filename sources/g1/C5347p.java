package g1;

import U0.C4875g;
import U0.H1;
import U0.v1;
import XH.C16807N;
import XH.C16820k;
import YH.C16877v;
import g1.C5342k;
import g1.C5345n;
import j0.O;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0013\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aI\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a1\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$\u001a-\u0010%\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)\u001a'\u0010,\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-\u001a'\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101\u001a3\u00103\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u00020.2\u0006\u00102\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00107\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108\u001a\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0019\u0010<\u001a\u0004\u0018\u00010.2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b<\u0010=\u001a\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b\u001c\u0010>\u001a\u000f\u0010?\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010$\u001a\u0017\u0010@\u001a\u00020\u00072\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b@\u0010A\u001a-\u0010B\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\nH\u0001¢\u0006\u0004\bB\u0010C\u001a5\u0010E\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\n2\u0006\u0010D\u001a\u00028\u0000H\u0000¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\nH\u0000¢\u0006\u0004\bG\u0010C\u001a-\u0010H\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\bH\u0010C\u001a%\u0010I\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\bI\u00108\u001a\u001f\u0010J\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\bJ\u0010K\u001a5\u0010P\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.\u0018\u00010O2\u0006\u0010*\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u0002H\u0002¢\u0006\u0004\bP\u0010Q\u001a\u000f\u0010R\u001a\u000209H\u0002¢\u0006\u0004\bR\u0010;\u001a)\u0010S\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.2\u0006\u00102\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\nH\u0001¢\u0006\u0004\bS\u0010T\u001a!\u0010U\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.2\u0006\u00102\u001a\u00028\u0000H\u0001¢\u0006\u0004\bU\u0010V\u001a#\u0010Y\u001a\u00020\u0002*\u00020\u00022\u0006\u0010W\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u0000H\u0000¢\u0006\u0004\bY\u0010Z\" \u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\\"\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0^8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010`\" \u0010g\u001a\u00020\u000f8\u0000X\u0004¢\u0006\u0012\n\u0004\bb\u0010c\u0012\u0004\bf\u0010$\u001a\u0004\bd\u0010e\"\u0016\u0010j\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010i\"\u0016\u0010l\u001a\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bk\u0010d\"\u0014\u0010p\u001a\u00020m8\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010o\"\u001a\u0010t\u001a\b\u0012\u0004\u0012\u0002050q8\u0002X\u0004¢\u0006\u0006\n\u0004\br\u0010s\"4\u0010z\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0w\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070v0u8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bx\u0010y\"(\u0010|\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e0u8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010y\"8\u0010\u0001\u001a#\u0012\f\u0012\n *\u0004\u0018\u00010~0~0}j\u0011\u0012\f\u0012\n *\u0004\u0018\u00010~0~`\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001\"%\u0010\u0001\u001a\u00020\n8\u0000X\u0004¢\u0006\u0016\n\u0006\b\u0001\u0010\u0001\u0012\u0005\b\u0001\u0010$\u001a\u0005\b\u0001\u0010\f\"\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"", "id", "Lg1/n;", "invalid", "c0", "(ILg1/n;)I", "handle", "LXH/N;", "Y", "(I)V", "Lg1/k;", "H", "()Lg1/k;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "D", "(Lg1/k;LnI/l;Z)Lg1/k;", "parentObserver", "mergeReadObserver", "K", "(LnI/l;LnI/l;Z)LnI/l;", "writeObserver", "M", "(LnI/l;LnI/l;)LnI/l;", "T", "previousGlobalSnapshot", "block", "a0", "(Lg1/k;LnI/l;)Ljava/lang/Object;", "A", "(LnI/l;)Ljava/lang/Object;", "B", "()V", "b0", "(LnI/l;)Lg1/k;", "snapshot", "g0", "(Lg1/k;)V", "currentSnapshot", "candidateSnapshot", "e0", "(IILg1/n;)Z", "Lg1/I;", "data", "f0", "(Lg1/I;ILg1/n;)Z", "r", "W", "(Lg1/I;ILg1/n;)Lg1/I;", "Lg1/G;", "state", "X", "(Lg1/I;Lg1/G;)Lg1/I;", "", "V", "()Ljava/lang/Void;", "d0", "(Lg1/G;)Lg1/I;", "(Lg1/G;)Z", "C", "U", "(Lg1/G;)V", "h0", "(Lg1/I;Lg1/G;Lg1/k;)Lg1/I;", "candidate", "S", "(Lg1/I;Lg1/G;Lg1/k;Lg1/I;)Lg1/I;", "O", "P", "N", "Q", "(Lg1/k;Lg1/G;)V", "Lg1/c;", "applyingSnapshot", "invalidSnapshots", "", "R", "(Lg1/c;Lg1/c;Lg1/n;)Ljava/util/Map;", "Z", "G", "(Lg1/I;Lg1/k;)Lg1/I;", "F", "(Lg1/I;)Lg1/I;", "from", "until", "z", "(Lg1/n;II)Lg1/n;", "a", "LnI/l;", "emptyLambda", "LU0/v1;", "b", "LU0/v1;", "threadSnapshot", "c", "Ljava/lang/Object;", "I", "()Ljava/lang/Object;", "getLock$annotations", "lock", "d", "Lg1/n;", "openSnapshots", "e", "nextSnapshotId", "Lg1/m;", "f", "Lg1/m;", "pinningTable", "Lg1/A;", "g", "Lg1/A;", "extraStateObjects", "", "Lkotlin/Function2;", "", "h", "Ljava/util/List;", "applyObservers", "i", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Lg1/a;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "j", "Ljava/util/concurrent/atomic/AtomicReference;", "currentGlobalSnapshot", "k", "Lg1/k;", "J", "getSnapshotInitializer$annotations", "snapshotInitializer", "LU0/g;", "l", "LU0/g;", "pendingApplyObserverCount", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.p  reason: case insensitive filesystem */
public final class C5347p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C17642l<C5345n, C16807N> f23420a = b.f23433c;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final v1<C5342k> f23421b = new v1<>();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f23422c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static C5345n f23423d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static int f23424e;

    /* renamed from: f  reason: collision with root package name */
    private static final C5344m f23425f = new C5344m();

    /* renamed from: g  reason: collision with root package name */
    private static final C5320A<C5326G> f23426g = new C5320A<>();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static List<? extends p<? super Set<? extends Object>, ? super C5342k, C16807N>> f23427h = C16877v.n();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static List<? extends C17642l<Object, C16807N>> f23428i = C16877v.n();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReference<C5332a> f23429j;

    /* renamed from: k  reason: collision with root package name */
    private static final C5342k f23430k;

    /* renamed from: l  reason: collision with root package name */
    private static C4875g f23431l = new C4875g(0);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/n;", "it", "LXH/N;", "a", "(Lg1/n;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.p$a */
    static final class a extends C17544u implements C17642l<C5345n, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f23432c = new a();

        a() {
            super(1);
        }

        public final void a(C5345n nVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5345n) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/n;", "it", "LXH/N;", "a", "(Lg1/n;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.p$b */
    static final class b extends C17544u implements C17642l<C5345n, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f23433c = new b();

        b() {
            super(1);
        }

        public final void a(C5345n nVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5345n) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.p$c */
    static final class c extends C17544u implements C17642l<Object, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Object, C16807N> f23434c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Object, C16807N> f23435d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17642l<Object, C16807N> lVar, C17642l<Object, C16807N> lVar2) {
            super(1);
            this.f23434c = lVar;
            this.f23435d = lVar2;
        }

        public final void a(Object obj) {
            this.f23434c.invoke(obj);
            this.f23435d.invoke(obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.p$d */
    static final class d extends C17544u implements C17642l<Object, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Object, C16807N> f23436c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Object, C16807N> f23437d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17642l<Object, C16807N> lVar, C17642l<Object, C16807N> lVar2) {
            super(1);
            this.f23436c = lVar;
            this.f23437d = lVar2;
        }

        public final void a(Object obj) {
            this.f23436c.invoke(obj);
            this.f23437d.invoke(obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg1/k;", "T", "Lg1/n;", "invalid", "a", "(Lg1/n;)Lg1/k;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.p$e */
    static final class e extends C17544u implements C17642l<C5345n, T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C5345n, T> f23438c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17642l<? super C5345n, ? extends T> lVar) {
            super(1);
            this.f23438c = lVar;
        }

        /* renamed from: a */
        public final T invoke(C5345n nVar) {
            T t10 = (C5342k) this.f23438c.invoke(nVar);
            synchronized (C5347p.I()) {
                C5347p.f23423d = C5347p.f23423d.B(t10.f());
                C16807N n10 = C16807N.f139792a;
            }
            return t10;
        }
    }

    static {
        C5345n.a aVar = C5345n.f23408e;
        f23423d = aVar.a();
        f23424e = 2;
        int i10 = f23424e;
        f23424e = i10 + 1;
        C5332a aVar2 = new C5332a(i10, aVar.a());
        f23423d = f23423d.B(aVar2.f());
        AtomicReference<C5332a> atomicReference = new AtomicReference<>(aVar2);
        f23429j = atomicReference;
        f23430k = atomicReference.get();
    }

    /* access modifiers changed from: private */
    public static final <T> T A(C17642l<? super C5345n, ? extends T> lVar) {
        C5332a aVar;
        O<C5326G> E10;
        T a02;
        C5342k kVar = f23430k;
        C17542s.h(kVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        C5332a aVar2 = (C5332a) kVar;
        synchronized (I()) {
            try {
                aVar = f23429j.get();
                E10 = aVar.E();
                if (E10 != null) {
                    f23431l.a(1);
                }
                a02 = a0(aVar, lVar);
            } finally {
            }
        }
        if (E10 != null) {
            try {
                List<? extends p<? super Set<? extends Object>, ? super C5342k, C16807N>> list = f23427h;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p) list.get(i10)).invoke(W0.e.a(E10), aVar);
                }
            } finally {
                f23431l.a(-1);
            }
        }
        synchronized (I()) {
            try {
                C();
                if (E10 != null) {
                    Object[] objArr = E10.f24576b;
                    long[] jArr = E10.f24575a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j10 = jArr[i11];
                            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j10) < 128) {
                                        U((C5326G) objArr[(i11 << 3) + i13]);
                                    }
                                    j10 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                            }
                            if (i11 == length) {
                                break;
                            }
                            i11++;
                        }
                    }
                    C16807N n10 = C16807N.f139792a;
                }
            } finally {
            }
        }
        return a02;
    }

    /* access modifiers changed from: private */
    public static final void B() {
        A(a.f23432c);
    }

    /* access modifiers changed from: private */
    public static final void C() {
        C5320A<C5326G> a10 = f23426g;
        int e10 = a10.e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            Object obj = null;
            if (i10 >= e10) {
                break;
            }
            H1 h12 = a10.f()[i10];
            if (h12 != null) {
                obj = h12.get();
            }
            if (obj != null && T((C5326G) obj)) {
                if (i11 != i10) {
                    a10.f()[i11] = h12;
                    a10.d()[i11] = a10.d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < e10; i12++) {
            a10.f()[i12] = null;
            a10.d()[i12] = 0;
        }
        if (i11 != e10) {
            a10.g(i11);
        }
    }

    /* access modifiers changed from: private */
    public static final C5342k D(C5342k kVar, C17642l<Object, C16807N> lVar, boolean z10) {
        boolean z11 = kVar instanceof C5334c;
        if (!z11 && kVar != null) {
            return new C5331L(kVar, lVar, false, z10);
        }
        return new C5330K(z11 ? (C5334c) kVar : null, lVar, (C17642l<Object, C16807N>) null, false, z10);
    }

    static /* synthetic */ C5342k E(C5342k kVar, C17642l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return D(kVar, lVar, z10);
    }

    public static final <T extends C5328I> T F(T t10) {
        T W10;
        C5342k.a aVar = C5342k.f23395e;
        C5342k c10 = aVar.c();
        T W11 = W(t10, c10.f(), c10.g());
        if (W11 != null) {
            return W11;
        }
        synchronized (I()) {
            C5342k c11 = aVar.c();
            W10 = W(t10, c11.f(), c11.g());
        }
        if (W10 != null) {
            return W10;
        }
        V();
        throw new C16820k();
    }

    public static final <T extends C5328I> T G(T t10, C5342k kVar) {
        T W10 = W(t10, kVar.f(), kVar.g());
        if (W10 != null) {
            return W10;
        }
        V();
        throw new C16820k();
    }

    public static final C5342k H() {
        C5342k a10 = f23421b.a();
        return a10 == null ? f23429j.get() : a10;
    }

    public static final Object I() {
        return f23422c;
    }

    public static final C5342k J() {
        return f23430k;
    }

    /* access modifiers changed from: private */
    public static final C17642l<Object, C16807N> K(C17642l<Object, C16807N> lVar, C17642l<Object, C16807N> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new c(lVar, lVar2);
    }

    static /* synthetic */ C17642l L(C17642l lVar, C17642l lVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return K(lVar, lVar2, z10);
    }

    /* access modifiers changed from: private */
    public static final C17642l<Object, C16807N> M(C17642l<Object, C16807N> lVar, C17642l<Object, C16807N> lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new d(lVar, lVar2);
    }

    public static final <T extends C5328I> T N(T t10, C5326G g10) {
        T d02 = d0(g10);
        if (d02 != null) {
            d02.h(Integer.MAX_VALUE);
            return d02;
        }
        T d10 = t10.d();
        d10.h(Integer.MAX_VALUE);
        d10.g(g10.m());
        C17542s.h(d10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        g10.p(d10);
        C17542s.h(d10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return d10;
    }

    public static final <T extends C5328I> T O(T t10, C5326G g10, C5342k kVar) {
        T P10;
        synchronized (I()) {
            P10 = P(t10, g10, kVar);
        }
        return P10;
    }

    private static final <T extends C5328I> T P(T t10, C5326G g10, C5342k kVar) {
        T N10 = N(t10, g10);
        N10.c(t10);
        N10.h(kVar.f());
        return N10;
    }

    public static final void Q(C5342k kVar, C5326G g10) {
        kVar.w(kVar.j() + 1);
        C17642l<Object, C16807N> k10 = kVar.k();
        if (k10 != null) {
            k10.invoke(g10);
        }
    }

    /* access modifiers changed from: private */
    public static final Map<C5328I, C5328I> R(C5334c cVar, C5334c cVar2, C5345n nVar) {
        int i10;
        long[] jArr;
        HashMap hashMap;
        int i11;
        long[] jArr2;
        int i12;
        HashMap hashMap2;
        C5328I W10;
        O<C5326G> E10 = cVar2.E();
        int f10 = cVar.f();
        HashMap hashMap3 = null;
        if (E10 == null) {
            return null;
        }
        C5345n A10 = cVar2.g().B(cVar2.f()).A(cVar2.F());
        Object[] objArr = E10.f24576b;
        long[] jArr3 = E10.f24575a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            HashMap hashMap4 = null;
            int i13 = 0;
            while (true) {
                long j10 = jArr3[i13];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j10) < 128) {
                            C5326G g10 = (C5326G) objArr[(i13 << 3) + i16];
                            C5328I m10 = g10.m();
                            C5328I W11 = W(m10, f10, nVar);
                            if (W11 == null || (W10 = W(m10, f10, A10)) == null || C17542s.e(W11, W10)) {
                                jArr2 = jArr3;
                                i11 = f10;
                            } else {
                                jArr2 = jArr3;
                                i11 = f10;
                                C5328I W12 = W(m10, cVar2.f(), cVar2.g());
                                if (W12 != null) {
                                    C5328I i17 = g10.i(W10, W11, W12);
                                    if (i17 == null) {
                                        return null;
                                    }
                                    if (hashMap4 == null) {
                                        hashMap4 = new HashMap();
                                    }
                                    hashMap4.put(W11, i17);
                                    hashMap4 = hashMap4;
                                } else {
                                    V();
                                    throw new C16820k();
                                }
                            }
                            hashMap2 = null;
                            i12 = 8;
                        } else {
                            C5345n nVar2 = nVar;
                            jArr2 = jArr3;
                            i11 = f10;
                            hashMap2 = hashMap3;
                            i12 = i14;
                        }
                        j10 >>= i12;
                        i16++;
                        hashMap3 = hashMap2;
                        i14 = i12;
                        jArr3 = jArr2;
                        f10 = i11;
                    }
                    C5345n nVar3 = nVar;
                    jArr = jArr3;
                    i10 = f10;
                    hashMap = hashMap3;
                    if (i15 != i14) {
                        return hashMap4;
                    }
                } else {
                    C5345n nVar4 = nVar;
                    jArr = jArr3;
                    i10 = f10;
                    hashMap = hashMap3;
                }
                if (i13 == length) {
                    hashMap3 = hashMap4;
                    break;
                }
                i13++;
                hashMap3 = hashMap;
                jArr3 = jArr;
                f10 = i10;
            }
        }
        return hashMap3;
    }

    public static final <T extends C5328I> T S(T t10, C5326G g10, C5342k kVar, T t11) {
        T N10;
        if (kVar.i()) {
            kVar.p(g10);
        }
        int f10 = kVar.f();
        if (t11.f() == f10) {
            return t11;
        }
        synchronized (I()) {
            N10 = N(t10, g10);
        }
        N10.h(f10);
        if (t11.f() != 1) {
            kVar.p(g10);
        }
        return N10;
    }

    private static final boolean T(C5326G g10) {
        C5328I i10;
        int e10 = f23425f.e(f23424e);
        C5328I i11 = null;
        C5328I i12 = null;
        int i13 = 0;
        for (C5328I m10 = g10.m(); m10 != null; m10 = m10.e()) {
            int f10 = m10.f();
            if (f10 != 0) {
                if (f10 >= e10) {
                    i13++;
                } else if (i11 == null) {
                    i13++;
                    i11 = m10;
                } else {
                    if (m10.f() < i11.f()) {
                        i10 = i11;
                        i11 = m10;
                    } else {
                        i10 = m10;
                    }
                    if (i12 == null) {
                        i12 = g10.m();
                        C5328I i14 = i12;
                        while (true) {
                            if (i12 == null) {
                                i12 = i14;
                                break;
                            } else if (i12.f() >= e10) {
                                break;
                            } else {
                                if (i14.f() < i12.f()) {
                                    i14 = i12;
                                }
                                i12 = i12.e();
                            }
                        }
                    }
                    i11.h(0);
                    i11.c(i12);
                    i11 = i10;
                }
            }
        }
        return i13 > 1;
    }

    /* access modifiers changed from: private */
    public static final void U(C5326G g10) {
        if (T(g10)) {
            f23426g.a(g10);
        }
    }

    /* access modifiers changed from: private */
    public static final Void V() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* access modifiers changed from: private */
    public static final <T extends C5328I> T W(T t10, int i10, C5345n nVar) {
        T t11 = null;
        while (t10 != null) {
            if (f0(t10, i10, nVar) && (t11 == null || t11.f() < t10.f())) {
                t11 = t10;
            }
            t10 = t10.e();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    public static final <T extends C5328I> T X(T t10, C5326G g10) {
        T W10;
        C5342k.a aVar = C5342k.f23395e;
        C5342k c10 = aVar.c();
        C17642l<Object, C16807N> h10 = c10.h();
        if (h10 != null) {
            h10.invoke(g10);
        }
        T W11 = W(t10, c10.f(), c10.g());
        if (W11 != null) {
            return W11;
        }
        synchronized (I()) {
            C5342k c11 = aVar.c();
            C5328I m10 = g10.m();
            C17542s.h(m10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            W10 = W(m10, c11.f(), c11.g());
            if (W10 == null) {
                V();
                throw new C16820k();
            }
        }
        return W10;
    }

    public static final void Y(int i10) {
        f23425f.f(i10);
    }

    /* access modifiers changed from: private */
    public static final Void Z() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* access modifiers changed from: private */
    public static final <T> T a0(C5342k kVar, C17642l<? super C5345n, ? extends T> lVar) {
        T invoke = lVar.invoke(f23423d.s(kVar.f()));
        synchronized (I()) {
            int i10 = f23424e;
            f23424e = i10 + 1;
            f23423d = f23423d.s(kVar.f());
            f23429j.set(new C5332a(i10, f23423d));
            kVar.d();
            f23423d = f23423d.B(i10);
            C16807N n10 = C16807N.f139792a;
        }
        return invoke;
    }

    /* access modifiers changed from: private */
    public static final <T extends C5342k> T b0(C17642l<? super C5345n, ? extends T> lVar) {
        return (C5342k) A(new e(lVar));
    }

    public static final int c0(int i10, C5345n nVar) {
        int a10;
        int x10 = nVar.x(i10);
        synchronized (I()) {
            a10 = f23425f.a(x10);
        }
        return a10;
    }

    private static final C5328I d0(C5326G g10) {
        int e10 = f23425f.e(f23424e) - 1;
        C5345n a10 = C5345n.f23408e.a();
        C5328I i10 = null;
        for (C5328I m10 = g10.m(); m10 != null; m10 = m10.e()) {
            if (m10.f() == 0) {
                return m10;
            }
            if (f0(m10, e10, a10)) {
                if (i10 != null) {
                    return m10.f() < i10.f() ? m10 : i10;
                }
                i10 = m10;
            }
        }
        return null;
    }

    private static final boolean e0(int i10, int i11, C5345n nVar) {
        return i11 != 0 && i11 <= i10 && !nVar.t(i11);
    }

    private static final boolean f0(C5328I i10, int i11, C5345n nVar) {
        return e0(i11, i10.f(), nVar);
    }

    /* access modifiers changed from: private */
    public static final void g0(C5342k kVar) {
        int e10;
        if (!f23423d.t(kVar.f())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Snapshot is not open: id=");
            sb2.append(kVar.f());
            sb2.append(", disposed=");
            sb2.append(kVar.e());
            sb2.append(", applied=");
            C5334c cVar = kVar instanceof C5334c ? (C5334c) kVar : null;
            sb2.append(cVar != null ? Boolean.valueOf(cVar.D()) : "read-only");
            sb2.append(", lowestPin=");
            synchronized (I()) {
                e10 = f23425f.e(-1);
            }
            sb2.append(e10);
            throw new IllegalStateException(sb2.toString().toString());
        }
    }

    public static final <T extends C5328I> T h0(T t10, C5326G g10, C5342k kVar) {
        T W10;
        if (kVar.i()) {
            kVar.p(g10);
        }
        int f10 = kVar.f();
        T W11 = W(t10, f10, kVar.g());
        if (W11 == null) {
            V();
            throw new C16820k();
        } else if (W11.f() == kVar.f()) {
            return W11;
        } else {
            synchronized (I()) {
                W10 = W(g10.m(), f10, kVar.g());
                if (W10 == null) {
                    V();
                    throw new C16820k();
                } else if (W10.f() != f10) {
                    W10 = P(W10, g10, kVar);
                }
            }
            C17542s.h(W10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
            if (W11.f() != 1) {
                kVar.p(g10);
            }
            return W10;
        }
    }

    public static final C5345n z(C5345n nVar, int i10, int i11) {
        while (i10 < i11) {
            nVar = nVar.B(i10);
            i10++;
        }
        return nVar;
    }
}
