package A1;

import G1.C4508k;
import QJ.C16320n;
import QJ.C16324p;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.x;
import XH.y;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.w1;
import c2.r;
import dI.C17164e;
import dI.C17166g;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import o1.C5673m;
import o1.C5674n;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001PBY\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J[\u0010\u0016\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0000¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J*\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0018J:\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010!2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH@¢\u0006\u0004\b$\u0010%R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\"\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R2\u0010-\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\"\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000306R\u00020\u0000058\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000306R\u00020\u0000058\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u00103R\u001c\u0010@\u001a\u00020\u001c8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010?R\\\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\"\u0010A\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n8V@VX\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020F8VX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010O\u001a\u00020L8VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010R\u001a\u00020\u001c8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\u00020S8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bT\u0010Q\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"LA1/X;", "Landroidx/compose/ui/d$c;", "LA1/W;", "LA1/K;", "Lc2/d;", "", "key1", "key2", "", "keys", "Lkotlin/Function2;", "LdI/e;", "LXH/N;", "pointerInputHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;LnI/p;)V", "LA1/p;", "pointerEvent", "LA1/r;", "pass", "F2", "(LA1/p;LA1/r;)V", "H2", "n2", "()V", "z1", "R1", "W0", "Lc2/r;", "bounds", "T1", "(LA1/p;LA1/r;J)V", "s1", "R", "LA1/c;", "block", "t1", "(LnI/p;LdI/e;)Ljava/lang/Object;", "n", "Ljava/lang/Object;", "o", "p", "[Ljava/lang/Object;", "q", "LnI/p;", "_pointerInputHandler", "LQJ/F0;", "r", "LQJ/F0;", "pointerInputJob", "s", "LA1/p;", "currentEvent", "LW0/b;", "LA1/X$a;", "t", "LW0/b;", "pointerHandlers", "u", "dispatchingPointerHandlers", "v", "lastPointerEvent", "w", "J", "boundsSize", "value", "G2", "()LnI/p;", "setPointerInputHandler", "(LnI/p;)V", "", "getDensity", "()F", "density", "D1", "fontScale", "Landroidx/compose/ui/platform/w1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/w1;", "viewConfiguration", "a", "()J", "size", "Lo1/m;", "G0", "extendedTouchPadding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class X extends d.c implements W, K, c2.d {

    /* renamed from: n  reason: collision with root package name */
    private Object f4365n;

    /* renamed from: o  reason: collision with root package name */
    private Object f4366o;

    /* renamed from: p  reason: collision with root package name */
    private Object[] f4367p;

    /* renamed from: q  reason: collision with root package name */
    private p<? super K, ? super C17164e<? super C16807N>, ? extends Object> f4368q;

    /* renamed from: r  reason: collision with root package name */
    private F0 f4369r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public C4349p f4370s = U.f4363a;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final W0.b<a<?>> f4371t = new W0.b<>(new a[16], 0);

    /* renamed from: u  reason: collision with root package name */
    private final W0.b<a<?>> f4372u = new W0.b<>(new a[16], 0);

    /* renamed from: v  reason: collision with root package name */
    private C4349p f4373v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public long f4374w = r.f23053b.a();

    @Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t*\u00020\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t*\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b*\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\b*\u00020\tH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u0011*\u00020\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u0016*\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\f*\u00020\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\f*\u00020\u0011H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u001a\u0010 \u001a\u00020\f*\u00020\tH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001d\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020&2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H@¢\u0006\u0004\b1\u00102JD\u00109\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u001032\u0006\u00105\u001a\u0002042\"\u00108\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010706H@¢\u0006\u0004\b9\u0010:JB\u0010;\u001a\u00028\u0001\"\u0004\b\u0001\u001032\u0006\u00105\u001a\u0002042\"\u00108\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010706H@¢\u0006\u0004\b;\u0010:R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010J\u001a\u00020E8\u0016X\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u00118\u0016X\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00118\u0016X\u0005¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0014\u0010R\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\u00020S8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b<\u0010TR\u0014\u0010Y\u001a\u00020V8VX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001a\u0010[\u001a\u00020\u00168VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bZ\u0010T\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"LA1/X$a;", "R", "LA1/c;", "Lc2/d;", "LdI/e;", "completion", "<init>", "(LA1/X;LdI/e;)V", "Lc2/h;", "", "K0", "(F)I", "Lc2/v;", "K1", "(J)I", "q", "(J)F", "", "x1", "(F)F", "H", "(I)F", "Lo1/m;", "Lc2/k;", "X", "(J)J", "H1", "O0", "O", "W", "(F)J", "t", "l0", "(I)J", "LA1/p;", "event", "LA1/r;", "pass", "LXH/N;", "V", "(LA1/p;LA1/r;)V", "", "cause", "J", "(Ljava/lang/Throwable;)V", "LXH/x;", "result", "resumeWith", "(Ljava/lang/Object;)V", "B1", "(LA1/r;LdI/e;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "block", "w1", "(JLnI/p;LdI/e;)Ljava/lang/Object;", "S", "a", "LdI/e;", "LQJ/n;", "c", "LQJ/n;", "pointerAwaiter", "d", "LA1/r;", "awaitPass", "LdI/i;", "e", "LdI/i;", "getContext", "()LdI/i;", "context", "getDensity", "()F", "density", "D1", "fontScale", "b1", "()LA1/p;", "currentEvent", "Lc2/r;", "()J", "size", "Landroidx/compose/ui/platform/w1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/w1;", "viewConfiguration", "G0", "extendedTouchPadding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a<R> implements C4336c, c2.d, C17164e<R> {

        /* renamed from: a  reason: collision with root package name */
        private final C17164e<R> f4375a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ X f4376b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public C16320n<? super C4349p> f4377c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public r f4378d = r.Main;

        /* renamed from: e  reason: collision with root package name */
        private final C17168i f4379e = C17169j.f142968a;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {782}, m = "withTimeout")
        /* renamed from: A1.X$a$a  reason: collision with other inner class name */
        static final class C0001a<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f4381c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f4382d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a<R> f4383e;

            /* renamed from: f  reason: collision with root package name */
            int f4384f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0001a(a<R> aVar, C17164e<? super C0001a> eVar) {
                super(eVar);
                this.f4383e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f4382d = obj;
                this.f4384f |= Integer.MIN_VALUE;
                return this.f4383e.S(0, (p) null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {774, 775}, m = "invokeSuspend")
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f4385c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f4386d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a<R> f4387e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(long j10, a<R> aVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f4386d = j10;
                this.f4387e = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f4386d, this.f4387e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r8.f4385c
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L_0x0020
                    if (r1 == r5) goto L_0x001c
                    if (r1 != r4) goto L_0x0014
                    XH.y.b(r9)
                    goto L_0x0038
                L_0x0014:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L_0x001c:
                    XH.y.b(r9)
                    goto L_0x002f
                L_0x0020:
                    XH.y.b(r9)
                    long r6 = r8.f4386d
                    long r6 = r6 - r2
                    r8.f4385c = r5
                    java.lang.Object r9 = QJ.C16297b0.b(r6, r8)
                    if (r9 != r0) goto L_0x002f
                    return r0
                L_0x002f:
                    r8.f4385c = r4
                    java.lang.Object r9 = QJ.C16297b0.b(r2, r8)
                    if (r9 != r0) goto L_0x0038
                    return r0
                L_0x0038:
                    A1.X$a<R> r9 = r8.f4387e
                    QJ.n r9 = r9.f4377c
                    if (r9 == 0) goto L_0x0054
                    XH.x$a r0 = XH.x.f139812b
                    A1.s r0 = new A1.s
                    long r1 = r8.f4386d
                    r0.<init>(r1)
                    java.lang.Object r0 = XH.y.a(r0)
                    java.lang.Object r0 = XH.x.b(r0)
                    r9.resumeWith(r0)
                L_0x0054:
                    XH.N r9 = XH.C16807N.f139792a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: A1.X.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {753}, m = "withTimeoutOrNull")
        static final class c<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f4388c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a<R> f4389d;

            /* renamed from: e  reason: collision with root package name */
            int f4390e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(a<R> aVar, C17164e<? super c> eVar) {
                super(eVar);
                this.f4389d = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f4388c = obj;
                this.f4390e |= Integer.MIN_VALUE;
                return this.f4389d.w1(0, (p) null, this);
            }
        }

        public a(C17164e<? super R> eVar) {
            this.f4375a = eVar;
            this.f4376b = X.this;
        }

        public Object B1(r rVar, C17164e<? super C4349p> eVar) {
            C16324p pVar = new C16324p(C17187b.c(eVar), 1);
            pVar.C();
            this.f4378d = rVar;
            this.f4377c = pVar;
            Object w10 = pVar.w();
            if (w10 == C17187b.f()) {
                h.c(eVar);
            }
            return w10;
        }

        public float D1() {
            return this.f4376b.D1();
        }

        public long G0() {
            return X.this.G0();
        }

        public float H(int i10) {
            return this.f4376b.H(i10);
        }

        public float H1(float f10) {
            return this.f4376b.H1(f10);
        }

        public final void J(Throwable th2) {
            C16320n<? super C4349p> nVar = this.f4377c;
            if (nVar != null) {
                nVar.p(th2);
            }
            this.f4377c = null;
        }

        public int K0(float f10) {
            return this.f4376b.K0(f10);
        }

        public int K1(long j10) {
            return this.f4376b.K1(j10);
        }

        public long O(long j10) {
            return this.f4376b.O(j10);
        }

        public float O0(long j10) {
            return this.f4376b.O0(j10);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object S(long r11, nI.p<? super A1.C4336c, ? super dI.C17164e<? super T>, ? extends java.lang.Object> r13, dI.C17164e<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof A1.X.a.C0001a
                if (r0 == 0) goto L_0x0013
                r0 = r14
                A1.X$a$a r0 = (A1.X.a.C0001a) r0
                int r1 = r0.f4384f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f4384f = r1
                goto L_0x0018
            L_0x0013:
                A1.X$a$a r0 = new A1.X$a$a
                r0.<init>(r10, r14)
            L_0x0018:
                java.lang.Object r14 = r0.f4382d
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f4384f
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r11 = r0.f4381c
                QJ.F0 r11 = (QJ.F0) r11
                XH.y.b(r14)     // Catch:{ all -> 0x002d }
                goto L_0x0075
            L_0x002d:
                r12 = move-exception
                goto L_0x007b
            L_0x002f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0037:
                XH.y.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L_0x0056
                QJ.n<? super A1.p> r14 = r10.f4377c
                if (r14 == 0) goto L_0x0056
                XH.x$a r2 = XH.x.f139812b
                A1.s r2 = new A1.s
                r2.<init>(r11)
                java.lang.Object r2 = XH.y.a(r2)
                java.lang.Object r2 = XH.x.b(r2)
                r14.resumeWith(r2)
            L_0x0056:
                A1.X r14 = A1.X.this
                QJ.Q r4 = r14.c2()
                A1.X$a$b r7 = new A1.X$a$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                QJ.F0 r11 = QJ.C16314k.d(r4, r5, r6, r7, r8, r9)
                r0.f4381c = r11     // Catch:{ all -> 0x002d }
                r0.f4384f = r3     // Catch:{ all -> 0x002d }
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch:{ all -> 0x002d }
                if (r14 != r1) goto L_0x0075
                return r1
            L_0x0075:
                A1.d r12 = A1.C4337d.f4397a
                r11.i(r12)
                return r14
            L_0x007b:
                A1.d r13 = A1.C4337d.f4397a
                r11.i(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: A1.X.a.S(long, nI.p, dI.e):java.lang.Object");
        }

        public final void V(C4349p pVar, r rVar) {
            C16320n<? super C4349p> nVar;
            if (rVar == this.f4378d && (nVar = this.f4377c) != null) {
                this.f4377c = null;
                nVar.resumeWith(x.b(pVar));
            }
        }

        public long W(float f10) {
            return this.f4376b.W(f10);
        }

        public long X(long j10) {
            return this.f4376b.X(j10);
        }

        public long a() {
            return X.this.f4374w;
        }

        public C4349p b1() {
            return X.this.f4370s;
        }

        public C17168i getContext() {
            return this.f4379e;
        }

        public float getDensity() {
            return this.f4376b.getDensity();
        }

        public w1 getViewConfiguration() {
            return X.this.getViewConfiguration();
        }

        public long l0(int i10) {
            return this.f4376b.l0(i10);
        }

        public float q(long j10) {
            return this.f4376b.q(j10);
        }

        public void resumeWith(Object obj) {
            W0.b E22 = X.this.f4371t;
            X x10 = X.this;
            synchronized (E22) {
                x10.f4371t.y(this);
                C16807N n10 = C16807N.f139792a;
            }
            this.f4375a.resumeWith(obj);
        }

        public long t(float f10) {
            return this.f4376b.t(f10);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object w1(long r5, nI.p<? super A1.C4336c, ? super dI.C17164e<? super T>, ? extends java.lang.Object> r7, dI.C17164e<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof A1.X.a.c
                if (r0 == 0) goto L_0x0013
                r0 = r8
                A1.X$a$c r0 = (A1.X.a.c) r0
                int r1 = r0.f4390e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f4390e = r1
                goto L_0x0018
            L_0x0013:
                A1.X$a$c r0 = new A1.X$a$c
                r0.<init>(r4, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f4388c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f4390e
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                XH.y.b(r8)     // Catch:{ s -> 0x003d }
                goto L_0x003e
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                XH.y.b(r8)
                r0.f4390e = r3     // Catch:{ s -> 0x003d }
                java.lang.Object r8 = r4.S(r5, r7, r0)     // Catch:{ s -> 0x003d }
                if (r8 != r1) goto L_0x003e
                return r1
            L_0x003d:
                r8 = 0
            L_0x003e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: A1.X.a.w1(long, nI.p, dI.e):java.lang.Object");
        }

        public float x1(float f10) {
            return this.f4376b.x1(f10);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4391a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                A1.r[] r0 = A1.r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                A1.r r1 = A1.r.Initial     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                A1.r r1 = A1.r.Final     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                A1.r r1 = A1.r.Main     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f4391a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: A1.X.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a<R> f4392c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.f4392c = aVar;
        }

        public final void a(Throwable th2) {
            this.f4392c.J(th2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {616}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f4393c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ X f4394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(X x10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f4394d = x10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f4394d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f4393c;
            if (i10 == 0) {
                y.b(obj);
                p<K, C17164e<? super C16807N>, Object> G22 = this.f4394d.G2();
                X x10 = this.f4394d;
                this.f4393c = 1;
                if (G22.invoke(x10, this) == f10) {
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

    public X(Object obj, Object obj2, Object[] objArr, p<? super K, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        this.f4365n = obj;
        this.f4366o = obj2;
        this.f4367p = objArr;
        this.f4368q = pVar;
    }

    private final void F2(C4349p pVar, r rVar) {
        synchronized (this.f4371t) {
            W0.b<a<?>> bVar = this.f4372u;
            bVar.e(bVar.r(), this.f4371t);
        }
        try {
            int i10 = b.f4391a[rVar.ordinal()];
            if (i10 == 1 || i10 == 2) {
                W0.b<a<?>> bVar2 = this.f4372u;
                int r10 = bVar2.r();
                if (r10 > 0) {
                    Object[] q10 = bVar2.q();
                    int i11 = 0;
                    do {
                        ((a) q10[i11]).V(pVar, rVar);
                        i11++;
                    } while (i11 < r10);
                }
            } else if (i10 == 3) {
                W0.b<a<?>> bVar3 = this.f4372u;
                int r11 = bVar3.r();
                if (r11 > 0) {
                    int i12 = r11 - 1;
                    Object[] q11 = bVar3.q();
                    do {
                        ((a) q11[i12]).V(pVar, rVar);
                        i12--;
                    } while (i12 >= 0);
                }
            }
        } finally {
            this.f4372u.k();
        }
    }

    public float D1() {
        return C4508k.m(this).N().D1();
    }

    public long G0() {
        long O10 = O(getViewConfiguration().e());
        long a10 = a();
        return C5674n.a(Math.max(0.0f, C5673m.l(O10) - ((float) r.h(a10))) / 2.0f, Math.max(0.0f, C5673m.i(O10) - ((float) r.g(a10))) / 2.0f);
    }

    public p<K, C17164e<? super C16807N>, Object> G2() {
        return this.f4368q;
    }

    public final void H2(Object obj, Object obj2, Object[] objArr, p<? super K, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        boolean z10 = true;
        boolean z11 = !C17542s.e(this.f4365n, obj);
        this.f4365n = obj;
        if (!C17542s.e(this.f4366o, obj2)) {
            z11 = true;
        }
        this.f4366o = obj2;
        Object[] objArr2 = this.f4367p;
        if (objArr2 != null && objArr == null) {
            z11 = true;
        }
        if (objArr2 == null && objArr != null) {
            z11 = true;
        }
        if (objArr2 == null || objArr == null || Arrays.equals(objArr, objArr2)) {
            z10 = z11;
        }
        this.f4367p = objArr;
        if (z10) {
            W0();
        }
        this.f4368q = pVar;
    }

    public void R1() {
        W0();
    }

    public void T1(C4349p pVar, r rVar, long j10) {
        this.f4374w = j10;
        if (rVar == r.Initial) {
            this.f4370s = pVar;
        }
        if (this.f4369r == null) {
            this.f4369r = C16314k.d(c2(), (C17168i) null, T.UNDISPATCHED, new d(this, (C17164e<? super d>) null), 1, (Object) null);
        }
        F2(pVar, rVar);
        List<B> c10 = pVar.c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!C4350q.d(c10.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            pVar = null;
        }
        this.f4373v = pVar;
    }

    public void W0() {
        F0 f02 = this.f4369r;
        if (f02 != null) {
            f02.i(new J());
            this.f4369r = null;
        }
    }

    public long a() {
        return this.f4374w;
    }

    public float getDensity() {
        return C4508k.m(this).N().getDensity();
    }

    public w1 getViewConfiguration() {
        return C4508k.m(this).t0();
    }

    public void n2() {
        W0();
        super.n2();
    }

    public void s1() {
        C4349p pVar = this.f4373v;
        if (pVar != null) {
            List<B> c10 = pVar.c();
            int size = c10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (c10.get(i10).i()) {
                    List<B> c11 = pVar.c();
                    ArrayList arrayList = new ArrayList(c11.size());
                    int size2 = c11.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        B b10 = c11.get(i11);
                        arrayList.add(new B(b10.f(), b10.o(), b10.h(), false, b10.j(), b10.o(), b10.h(), b10.i(), b10.i(), 0, 0, 1536, (DefaultConstructorMarker) null));
                    }
                    C4349p pVar2 = new C4349p(arrayList);
                    this.f4370s = pVar2;
                    F2(pVar2, r.Initial);
                    F2(pVar2, r.Main);
                    F2(pVar2, r.Final);
                    this.f4373v = null;
                    return;
                }
            }
        }
    }

    public <R> Object t1(p<? super C4336c, ? super C17164e<? super R>, ? extends Object> pVar, C17164e<? super R> eVar) {
        C16324p pVar2 = new C16324p(C17187b.c(eVar), 1);
        pVar2.C();
        a aVar = new a(pVar2);
        synchronized (this.f4371t) {
            this.f4371t.b(aVar);
            C17164e<C16807N> a10 = C17166g.a(pVar, aVar, aVar);
            x.a aVar2 = x.f139812b;
            a10.resumeWith(x.b(C16807N.f139792a));
        }
        pVar2.K(new c(aVar));
        Object w10 = pVar2.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }

    public void z1() {
        W0();
    }
}
