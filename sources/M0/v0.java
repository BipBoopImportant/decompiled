package m0;

import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import U0.A1;
import U0.B;
import U0.C4884j0;
import U0.C4889m;
import U0.C4892n0;
import U0.C4895p;
import U0.C4896p0;
import U0.C4899r0;
import U0.D0;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.i1;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import g1.C5353v;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m0.C5549j0;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import pI.C17752b;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004DF,'B1\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0010\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u0012J\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\u0012J'\u0010$\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\rH\u0007¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u001a2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u001a2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b)\u0010(J)\u0010,\u001a\u00020\u001a2\u0018\u0010+\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030*R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b,\u0010-J)\u0010.\u001a\u00020\u00102\u0018\u0010+\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030*R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00102\u0006\u0010\"\u001a\u00028\u0000H\u0000¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00102\u0006\u0010\"\u001a\u00028\u0000H\u0001¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\rH\u0000¢\u0006\u0004\b4\u0010\u001fJ\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u0015H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0010H\u0000¢\u0006\u0004\b<\u0010\u0012J\u000f\u0010=\u001a\u00020\u0010H\u0000¢\u0006\u0004\b=\u0010\u0012J\u000f\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010?J)\u0010B\u001a\u00020\u00102\u0018\u0010A\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030@R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010J\u001a\u0004\bK\u0010?R+\u0010\"\u001a\u00028\u00002\u0006\u0010L\u001a\u00028\u00008F@@X\u0002¢\u0006\u0012\n\u0004\b'\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u00101R7\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000Q2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000Q8F@BX\u0002¢\u0006\u0012\n\u0004\b2\u0010M\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR+\u0010Z\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r8B@BX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010W\u001a\u0004\bX\u0010\u000f\"\u0004\bY\u0010\u001fR+\u0010]\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r8@@@X\u0002¢\u0006\u0012\n\u0004\b<\u0010W\u001a\u0004\b[\u0010\u000f\"\u0004\b\\\u0010\u001fR+\u0010c\u001a\u00020\u001a2\u0006\u0010L\u001a\u00020\u001a8B@BX\u0002¢\u0006\u0012\n\u0004\b^\u0010M\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR,\u0010g\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030*R\b\u0012\u0004\u0012\u00028\u00000\u00000d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001e\u0010i\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000d8\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010fR+\u0010l\u001a\u00020\u001a2\u0006\u0010L\u001a\u00020\u001a8G@AX\u0002¢\u0006\u0012\n\u0004\bK\u0010M\u001a\u0004\bj\u0010`\"\u0004\bk\u0010bR\"\u0010p\u001a\u00020\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bm\u0010\u000f\"\u0004\bo\u0010\u001fR\u001b\u0010t\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010\u000fR\u0011\u0010u\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\be\u0010OR\u0011\u0010w\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bv\u0010`R$\u0010#\u001a\u00020\r2\u0006\u0010x\u001a\u00020\r8G@GX\u000e¢\u0006\f\u001a\u0004\bq\u0010\u000f\"\u0004\bn\u0010\u001fR)\u0010{\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030*R\b\u0012\u0004\u0012\u00028\u00000\u00000y8F¢\u0006\u0006\u001a\u0004\b^\u0010zR\u001a\u0010}\u001a\u00020\u001a8GX\u0004¢\u0006\f\u0012\u0004\b|\u0010\u0012\u001a\u0004\bh\u0010`¨\u0006~"}, d2 = {"Lm0/v0;", "S", "", "Lm0/x0;", "transitionState", "parentTransition", "", "label", "<init>", "(Lm0/x0;Lm0/v0;Ljava/lang/String;)V", "(Lm0/x0;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "", "f", "()J", "LXH/N;", "F", "()V", "v", "frameTimeNanos", "", "durationScale", "x", "(JF)V", "scaledPlayTimeNanos", "", "scaleToEnd", "y", "(JZ)V", "A", "(J)V", "w", "z", "targetState", "playTimeNanos", "G", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "transition", "d", "(Lm0/v0;)Z", "D", "Lm0/v0$d;", "animation", "c", "(Lm0/v0$d;)Z", "C", "(Lm0/v0$d;)V", "R", "(Ljava/lang/Object;)V", "e", "(Ljava/lang/Object;LU0/m;I)V", "H", "Lm0/j0$b;", "animationState", "I", "(Lm0/j0$b;)V", "fraction", "E", "(F)V", "g", "Q", "toString", "()Ljava/lang/String;", "Lm0/v0$a;", "deferredAnimation", "B", "(Lm0/v0$a;)V", "a", "Lm0/x0;", "b", "Lm0/v0;", "getParentTransition", "()Lm0/v0;", "Ljava/lang/String;", "k", "<set-?>", "LU0/r0;", "p", "()Ljava/lang/Object;", "N", "Lm0/v0$b;", "n", "()Lm0/v0$b;", "L", "(Lm0/v0$b;)V", "segment", "LU0/p0;", "s", "P", "_playTimeNanos", "o", "M", "startTimeNanos", "h", "r", "()Z", "O", "(Z)V", "updateChildrenNeeded", "Lg1/v;", "i", "Lg1/v;", "_animations", "j", "_transitions", "u", "K", "isSeeking", "l", "J", "setLastSeekedTimeNanos$animation_core_release", "lastSeekedTimeNanos", "m", "LU0/A1;", "q", "totalDurationNanos", "currentState", "t", "isRunning", "value", "", "()Ljava/util/List;", "animations", "getHasInitialValueAnimations$annotations", "hasInitialValueAnimations", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v0<S> {

    /* renamed from: a  reason: collision with root package name */
    private final x0<S> f25945a;

    /* renamed from: b  reason: collision with root package name */
    private final v0<?> f25946b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25947c;

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f25948d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f25949e;

    /* renamed from: f  reason: collision with root package name */
    private final C4896p0 f25950f;

    /* renamed from: g  reason: collision with root package name */
    private final C4896p0 f25951g;

    /* renamed from: h  reason: collision with root package name */
    private final C4899r0 f25952h;

    /* renamed from: i  reason: collision with root package name */
    private final C5353v<v0<S>.defpackage.d<?, ?>> f25953i;

    /* renamed from: j  reason: collision with root package name */
    private final C5353v<v0<?>> f25954j;

    /* renamed from: k  reason: collision with root package name */
    private final C4899r0 f25955k;

    /* renamed from: l  reason: collision with root package name */
    private long f25956l;

    /* renamed from: m  reason: collision with root package name */
    private final A1 f25957m;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0011B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJG\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR{\u0010$\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001dR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001e2.\u0010\u001f\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001dR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001e8@@@X\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b \u0010#¨\u0006%"}, d2 = {"Lm0/v0$a;", "T", "Lm0/q;", "V", "", "Lm0/z0;", "typeConverter", "", "label", "<init>", "(Lm0/v0;Lm0/z0;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lm0/v0$b;", "Lm0/N;", "transitionSpec", "targetValueByState", "LU0/A1;", "a", "(LnI/l;LnI/l;)LU0/A1;", "LXH/N;", "d", "()V", "Lm0/z0;", "getTypeConverter", "()Lm0/z0;", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lm0/v0$a$a;", "Lm0/v0;", "<set-?>", "c", "LU0/r0;", "()Lm0/v0$a$a;", "(Lm0/v0$a$a;)V", "data", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a<T, V extends C5562q> {

        /* renamed from: a  reason: collision with root package name */
        private final z0<T, V> f25958a;

        /* renamed from: b  reason: collision with root package name */
        private final String f25959b;

        /* renamed from: c  reason: collision with root package name */
        private final C4899r0 f25960c = u1.e((Object) null, (o1) null, 2, (Object) null);

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004BY\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0011\u0010\u0012R-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R:\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0014\u0010\"\u001a\u00028\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lm0/v0$a$a;", "T", "Lm0/q;", "V", "LU0/A1;", "Lm0/v0$d;", "Lm0/v0;", "animation", "Lkotlin/Function1;", "Lm0/v0$b;", "Lm0/N;", "transitionSpec", "targetValueByState", "<init>", "(Lm0/v0$a;Lm0/v0$d;LnI/l;LnI/l;)V", "segment", "LXH/N;", "t", "(Lm0/v0$b;)V", "a", "Lm0/v0$d;", "d", "()Lm0/v0$d;", "b", "LnI/l;", "m", "()LnI/l;", "s", "(LnI/l;)V", "c", "i", "p", "getValue", "()Ljava/lang/Object;", "value", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: m0.v0$a$a  reason: collision with other inner class name */
        public final class C0414a<T, V extends C5562q> implements A1<T> {

            /* renamed from: a  reason: collision with root package name */
            private final v0<S>.defpackage.d<T, V> f25962a;

            /* renamed from: b  reason: collision with root package name */
            private C17642l<? super b<S>, ? extends N<T>> f25963b;

            /* renamed from: c  reason: collision with root package name */
            private C17642l<? super S, ? extends T> f25964c;

            public C0414a(v0<S>.defpackage.d<T, V> dVar, C17642l<? super b<S>, ? extends N<T>> lVar, C17642l<? super S, ? extends T> lVar2) {
                this.f25962a = dVar;
                this.f25963b = lVar;
                this.f25964c = lVar2;
            }

            public final v0<S>.defpackage.d<T, V> d() {
                return this.f25962a;
            }

            public T getValue() {
                t(v0.this.n());
                return this.f25962a.getValue();
            }

            public final C17642l<S, T> i() {
                return this.f25964c;
            }

            public final C17642l<b<S>, N<T>> m() {
                return this.f25963b;
            }

            public final void p(C17642l<? super S, ? extends T> lVar) {
                this.f25964c = lVar;
            }

            public final void s(C17642l<? super b<S>, ? extends N<T>> lVar) {
                this.f25963b = lVar;
            }

            public final void t(b<S> bVar) {
                Object invoke = this.f25964c.invoke(bVar.a());
                if (v0.this.u()) {
                    this.f25962a.K(this.f25964c.invoke(bVar.g()), invoke, (N) this.f25963b.invoke(bVar));
                    return;
                }
                this.f25962a.M(invoke, (N) this.f25963b.invoke(bVar));
            }
        }

        public a(z0<T, V> z0Var, String str) {
            this.f25958a = z0Var;
            this.f25959b = str;
        }

        public final A1<T> a(C17642l<? super b<S>, ? extends N<T>> lVar, C17642l<? super S, ? extends T> lVar2) {
            C0414a b10 = b();
            if (b10 == null) {
                v0<S> v0Var = v0.this;
                b10 = new C0414a(new d(lVar2.invoke(v0Var.i()), C5552l.i(this.f25958a, lVar2.invoke(v0.this.i())), this.f25958a, this.f25959b), lVar, lVar2);
                v0<S> v0Var2 = v0.this;
                c(b10);
                v0Var2.c(b10.d());
            }
            v0<S> v0Var3 = v0.this;
            b10.p(lVar2);
            b10.s(lVar);
            b10.t(v0Var3.n());
            return b10;
        }

        public final v0<S>.defpackage.a<T, V>.defpackage.a<T, V> b() {
            return (C0414a) this.f25960c.getValue();
        }

        public final void c(v0<S>.defpackage.a<T, V>.defpackage.a<T, V> aVar) {
            this.f25960c.setValue(aVar);
        }

        public final void d() {
            C0414a b10 = b();
            if (b10 != null) {
                v0<S> v0Var = v0.this;
                b10.d().K(b10.i().invoke(v0Var.n().g()), b10.i().invoke(v0Var.n().a()), (N) b10.m().invoke(v0Var.n()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lm0/v0$b;", "S", "", "targetState", "", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "g", "()Ljava/lang/Object;", "initialState", "a", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b<S> {
        S a();

        S g();

        boolean h(S s10, S s11) {
            return C17542s.e(s10, g()) && C17542s.e(s11, a());
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lm0/v0$c;", "S", "Lm0/v0$b;", "initialState", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "b", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c<S> implements b<S> {

        /* renamed from: a  reason: collision with root package name */
        private final S f25966a;

        /* renamed from: b  reason: collision with root package name */
        private final S f25967b;

        public c(S s10, S s11) {
            this.f25966a = s10;
            this.f25967b = s11;
        }

        public S a() {
            return this.f25967b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C17542s.e(g(), bVar.g()) && C17542s.e(a(), bVar.a());
            }
        }

        public S g() {
            return this.f25966a;
        }

        public int hashCode() {
            Object g10 = g();
            int i10 = 0;
            int hashCode = (g10 != null ? g10.hashCode() : 0) * 31;
            Object a10 = a();
            if (a10 != null) {
                i10 = a10.hashCode();
            }
            return hashCode + i10;
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b.\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0000¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J%\u0010*\u001a\u00020\u000f2\u0006\u0010'\u001a\u00028\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0000¢\u0006\u0004\b*\u0010+J-\u0010,\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010'\u001a\u00028\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0000¢\u0006\u0004\b,\u0010-R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010&R+\u0010'\u001a\u00028\u00012\u0006\u00105\u001a\u00028\u00018B@BX\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010<8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010=R7\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010(8F@BX\u0002¢\u0006\u0012\n\u0004\b?\u00107\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CRC\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020D2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020D8F@BX\u0002¢\u0006\u0012\n\u0004\bE\u00107\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010P\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010#R$\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR+\u0010X\u001a\u00020\r2\u0006\u00105\u001a\u00020\r8@@@X\u0002¢\u0006\u0012\n\u0004\bF\u00107\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010^\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u001c8@@@X\u0002¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010\u001fR\u0016\u0010a\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R+\u0010e\u001a\u00028\u00012\u0006\u00105\u001a\u00028\u00018V@PX\u0002¢\u0006\u0012\n\u0004\bb\u00107\u001a\u0004\bc\u00109\"\u0004\bd\u0010;R\u0016\u0010g\u001a\u00028\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010fR+\u0010m\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00128@@@X\u0002¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010\u0018R\u0016\u0010o\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010`R\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00010(8\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010p¨\u0006r"}, d2 = {"Lm0/v0$d;", "T", "Lm0/q;", "V", "LU0/A1;", "initialValue", "initialVelocityVector", "Lm0/z0;", "typeConverter", "", "label", "<init>", "(Lm0/v0;Ljava/lang/Object;Lm0/q;Lm0/z0;Ljava/lang/String;)V", "", "isInterrupted", "LXH/N;", "I", "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "scaleToEnd", "w", "(JZ)V", "z", "(J)V", "L", "()V", "x", "", "fraction", "y", "(F)V", "Lm0/j0$b;", "animationState", "E", "(Lm0/j0$b;)V", "d", "toString", "()Ljava/lang/String;", "targetValue", "Lm0/N;", "animationSpec", "M", "(Ljava/lang/Object;Lm0/N;)V", "K", "(Ljava/lang/Object;Ljava/lang/Object;Lm0/N;)V", "a", "Lm0/z0;", "getTypeConverter", "()Lm0/z0;", "b", "Ljava/lang/String;", "getLabel", "<set-?>", "c", "LU0/r0;", "u", "()Ljava/lang/Object;", "G", "(Ljava/lang/Object;)V", "Lm0/o0;", "Lm0/o0;", "defaultSpring", "e", "m", "()Lm0/N;", "B", "(Lm0/N;)V", "Lm0/u0;", "f", "i", "()Lm0/u0;", "A", "(Lm0/u0;)V", "animation", "g", "Lm0/j0$b;", "s", "()Lm0/j0$b;", "setInitialValueState$animation_core_release", "initialValueState", "h", "Lm0/u0;", "initialValueAnimation", "v", "()Z", "D", "(Z)V", "isFinished", "j", "LU0/n0;", "t", "()F", "F", "resetSnapValue", "k", "Z", "useOnlyInitialValue", "l", "getValue", "H", "value", "Lm0/q;", "velocityVector", "n", "LU0/p0;", "p", "()J", "C", "durationNanos", "o", "isSeeking", "Lm0/N;", "interruptionSpec", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class d<T, V extends C5562q> implements A1<T> {

        /* renamed from: a  reason: collision with root package name */
        private final z0<T, V> f25968a;

        /* renamed from: b  reason: collision with root package name */
        private final String f25969b;

        /* renamed from: c  reason: collision with root package name */
        private final C4899r0 f25970c;

        /* renamed from: d  reason: collision with root package name */
        private final C5559o0<T> f25971d;

        /* renamed from: e  reason: collision with root package name */
        private final C4899r0 f25972e;

        /* renamed from: f  reason: collision with root package name */
        private final C4899r0 f25973f;

        /* renamed from: g  reason: collision with root package name */
        private C5549j0.b f25974g;

        /* renamed from: h  reason: collision with root package name */
        private u0<T, V> f25975h;

        /* renamed from: i  reason: collision with root package name */
        private final C4899r0 f25976i = u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);

        /* renamed from: j  reason: collision with root package name */
        private final C4892n0 f25977j = D0.a(-1.0f);

        /* renamed from: k  reason: collision with root package name */
        private boolean f25978k;

        /* renamed from: l  reason: collision with root package name */
        private final C4899r0 f25979l;

        /* renamed from: m  reason: collision with root package name */
        private V f25980m;

        /* renamed from: n  reason: collision with root package name */
        private final C4896p0 f25981n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f25982o;

        /* renamed from: p  reason: collision with root package name */
        private final N<T> f25983p;

        public d(T t10, V v10, z0<T, V> z0Var, String str) {
            Object obj;
            this.f25968a = z0Var;
            this.f25969b = str;
            this.f25970c = u1.e(t10, (o1) null, 2, (Object) null);
            C5559o0<T> h10 = C5548j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
            this.f25971d = h10;
            this.f25972e = u1.e(h10, (o1) null, 2, (Object) null);
            this.f25973f = u1.e(new u0(m(), z0Var, t10, u(), v10), (o1) null, 2, (Object) null);
            this.f25979l = u1.e(t10, (o1) null, 2, (Object) null);
            this.f25980m = v10;
            this.f25981n = i1.a(i().d());
            Float f10 = (Float) P0.h().get(z0Var);
            if (f10 != null) {
                float floatValue = f10.floatValue();
                C5562q qVar = (C5562q) z0Var.a().invoke(t10);
                int b10 = qVar.b();
                for (int i10 = 0; i10 < b10; i10++) {
                    qVar.e(i10, floatValue);
                }
                obj = this.f25968a.b().invoke(qVar);
            } else {
                obj = null;
            }
            this.f25983p = C5548j.h(0.0f, 0.0f, obj, 3, (Object) null);
        }

        private final void A(u0<T, V> u0Var) {
            this.f25973f.setValue(u0Var);
        }

        private final void B(N<T> n10) {
            this.f25972e.setValue(n10);
        }

        private final void G(T t10) {
            this.f25970c.setValue(t10);
        }

        private final void I(T t10, boolean z10) {
            u0<T, V> u0Var = this.f25975h;
            if (C17542s.e(u0Var != null ? u0Var.g() : null, u())) {
                A(new u0(this.f25983p, this.f25968a, t10, t10, r.g(this.f25980m)));
                this.f25978k = true;
                C(i().d());
                return;
            }
            C5546i m10 = (!z10 || this.f25982o) ? m() : m() instanceof C5559o0 ? m() : this.f25983p;
            if (v0.this.m() > 0) {
                m10 = C5548j.c(m10, v0.this.m());
            }
            A(new u0(m10, this.f25968a, t10, u(), this.f25980m));
            C(i().d());
            this.f25978k = false;
            v0.this.v();
        }

        static /* synthetic */ void J(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.I(obj, z10);
        }

        private final T u() {
            return this.f25970c.getValue();
        }

        public final void C(long j10) {
            this.f25981n.o(j10);
        }

        public final void D(boolean z10) {
            this.f25976i.setValue(Boolean.valueOf(z10));
        }

        public final void E(C5549j0.b bVar) {
            if (!C17542s.e(i().g(), i().i())) {
                this.f25975h = i();
                this.f25974g = bVar;
            }
            A(new u0(this.f25983p, this.f25968a, getValue(), getValue(), r.g(this.f25980m)));
            C(i().d());
            this.f25978k = true;
        }

        public final void F(float f10) {
            this.f25977j.n(f10);
        }

        public void H(T t10) {
            this.f25979l.setValue(t10);
        }

        public final void K(T t10, T t11, N<T> n10) {
            G(t11);
            B(n10);
            if (!C17542s.e(i().i(), t10) || !C17542s.e(i().g(), t11)) {
                J(this, t10, false, 2, (Object) null);
            }
        }

        public final void L() {
            u0<T, V> u0Var;
            C5549j0.b bVar = this.f25974g;
            if (bVar != null && (u0Var = this.f25975h) != null) {
                long f10 = C17752b.f(((double) bVar.c()) * ((double) bVar.g()));
                T f11 = u0Var.f(f10);
                if (this.f25978k) {
                    i().k(f11);
                }
                i().j(f11);
                C(i().d());
                if (t() != -2.0f && !this.f25978k) {
                    z(v0.this.m());
                } else {
                    H(f11);
                }
                if (f10 >= bVar.c()) {
                    this.f25974g = null;
                    this.f25975h = null;
                    return;
                }
                bVar.k(false);
            }
        }

        public final void M(T t10, N<T> n10) {
            if (this.f25978k) {
                u0<T, V> u0Var = this.f25975h;
                if (C17542s.e(t10, u0Var != null ? u0Var.g() : null)) {
                    return;
                }
            }
            if (!C17542s.e(u(), t10) || t() != -1.0f) {
                G(t10);
                B(n10);
                boolean z10 = true;
                I(t() == -3.0f ? t10 : getValue(), !v());
                if (t() != -3.0f) {
                    z10 = false;
                }
                D(z10);
                if (t() >= 0.0f) {
                    H(i().f((long) (((float) i().d()) * t())));
                } else if (t() == -3.0f) {
                    H(t10);
                }
                this.f25978k = false;
                F(-1.0f);
            }
        }

        public final void d() {
            this.f25975h = null;
            this.f25974g = null;
            this.f25978k = false;
        }

        public T getValue() {
            return this.f25979l.getValue();
        }

        public final u0<T, V> i() {
            return (u0) this.f25973f.getValue();
        }

        public final N<T> m() {
            return (N) this.f25972e.getValue();
        }

        public final long p() {
            return this.f25981n.b();
        }

        public final C5549j0.b s() {
            return this.f25974g;
        }

        public final float t() {
            return this.f25977j.a();
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + u() + ", spec: " + m();
        }

        public final boolean v() {
            return ((Boolean) this.f25976i.getValue()).booleanValue();
        }

        public final void w(long j10, boolean z10) {
            if (z10) {
                j10 = i().d();
            }
            H(i().f(j10));
            this.f25980m = i().b(j10);
            if (i().c(j10)) {
                D(true);
            }
        }

        public final void x() {
            F(-2.0f);
        }

        public final void y(float f10) {
            int i10 = (f10 > -4.0f ? 1 : (f10 == -4.0f ? 0 : -1));
            if (i10 == 0 || f10 == -5.0f) {
                u0<T, V> u0Var = this.f25975h;
                if (u0Var != null) {
                    i().j(u0Var.g());
                    this.f25974g = null;
                    this.f25975h = null;
                }
                Object i11 = i10 == 0 ? i().i() : i().g();
                i().j(i11);
                i().k(i11);
                H(i11);
                C(i().d());
                return;
            }
            F(f10);
        }

        public final void z(long j10) {
            if (t() == -1.0f) {
                this.f25982o = true;
                if (C17542s.e(i().g(), i().i())) {
                    H(i().g());
                    return;
                }
                H(i().f(j10));
                this.f25980m = i().b(j10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f25985c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v0<S> f25986d;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1227}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            float f25987c;

            /* renamed from: d  reason: collision with root package name */
            int f25988d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f25989e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ v0<S> f25990f;

            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: m0.v0$e$a$a  reason: collision with other inner class name */
            static final class C0415a extends C17544u implements C17642l<Long, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ v0<S> f25991c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ float f25992d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0415a(v0<S> v0Var, float f10) {
                    super(1);
                    this.f25991c = v0Var;
                    this.f25992d = f10;
                }

                public final void a(long j10) {
                    if (!this.f25991c.u()) {
                        this.f25991c.x(j10, this.f25992d);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).longValue());
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(v0<S> v0Var, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f25990f = v0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f25990f, eVar);
                aVar.f25989e = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Q q10;
                float f10;
                Object f11 = C17187b.f();
                int i10 = this.f25988d;
                if (i10 == 0) {
                    y.b(obj);
                    Q q11 = (Q) this.f25989e;
                    f10 = t0.n(q11.getCoroutineContext());
                    q10 = q11;
                } else if (i10 == 1) {
                    f10 = this.f25987c;
                    q10 = (Q) this.f25989e;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                while (S.h(q10)) {
                    C0415a aVar = new C0415a(this.f25990f, f10);
                    this.f25989e = q10;
                    this.f25987c = f10;
                    this.f25988d = 1;
                    if (C4884j0.c(aVar, this) == f11) {
                        return f11;
                    }
                }
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m0/v0$e$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements L {
            public void b() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Q q10, v0<S> v0Var) {
            super(1);
            this.f25985c = q10;
            this.f25986d = v0Var;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            F0 unused = C16314k.d(this.f25985c, (C17168i) null, T.UNDISPATCHED, new a(this.f25986d, (C17164e<? super a>) null), 1, (Object) null);
            return new b();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<S> f25993c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ S f25994d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f25995e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(v0<S> v0Var, S s10, int i10) {
            super(2);
            this.f25993c = v0Var;
            this.f25994d = s10;
            this.f25995e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f25993c.e(this.f25994d, mVar, M0.a(this.f25995e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17631a<Long> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<S> f25996c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(v0<S> v0Var) {
            super(0);
            this.f25996c = v0Var;
        }

        /* renamed from: b */
        public final Long invoke() {
            return Long.valueOf(this.f25996c.f());
        }
    }

    public v0(x0<S> x0Var, v0<?> v0Var, String str) {
        this.f25945a = x0Var;
        this.f25946b = v0Var;
        this.f25947c = str;
        this.f25948d = u1.e(i(), (o1) null, 2, (Object) null);
        this.f25949e = u1.e(new c(i(), i()), (o1) null, 2, (Object) null);
        this.f25950f = i1.a(0);
        this.f25951g = i1.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f25952h = u1.e(bool, (o1) null, 2, (Object) null);
        this.f25953i = p1.f();
        this.f25954j = p1.f();
        this.f25955k = u1.e(bool, (o1) null, 2, (Object) null);
        this.f25957m = p1.e(new g(this));
        x0Var.f(this);
    }

    private final void F() {
        C5353v<v0<S>.defpackage.d<?, ?>> vVar = this.f25953i;
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) vVar.get(i10)).x();
        }
        C5353v<v0<?>> vVar2 = this.f25954j;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((v0) vVar2.get(i11)).F();
        }
    }

    private final void L(b<S> bVar) {
        this.f25949e.setValue(bVar);
    }

    private final void O(boolean z10) {
        this.f25952h.setValue(Boolean.valueOf(z10));
    }

    private final void P(long j10) {
        this.f25950f.o(j10);
    }

    /* access modifiers changed from: private */
    public final long f() {
        C5353v<v0<S>.defpackage.d<?, ?>> vVar = this.f25953i;
        int size = vVar.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = Math.max(j10, ((d) vVar.get(i10)).p());
        }
        C5353v<v0<?>> vVar2 = this.f25954j;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            j10 = Math.max(j10, ((v0) vVar2.get(i11)).f());
        }
        return j10;
    }

    private final boolean r() {
        return ((Boolean) this.f25952h.getValue()).booleanValue();
    }

    private final long s() {
        return this.f25950f.b();
    }

    /* access modifiers changed from: private */
    public final void v() {
        O(true);
        if (u()) {
            C5353v<v0<S>.defpackage.d<?, ?>> vVar = this.f25953i;
            int size = vVar.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) vVar.get(i10);
                j10 = Math.max(j10, dVar.p());
                dVar.z(this.f25956l);
            }
            O(false);
        }
    }

    public final void A(long j10) {
        M(j10);
        this.f25945a.e(true);
    }

    public final void B(v0<S>.defpackage.a<?, ?> aVar) {
        d<?, ?> d10;
        a.C0414a<?, ?> b10 = aVar.b();
        if (b10 != null && (d10 = b10.d()) != null) {
            C(d10);
        }
    }

    public final void C(v0<S>.defpackage.d<?, ?> dVar) {
        this.f25953i.remove((Object) dVar);
    }

    public final boolean D(v0<?> v0Var) {
        return this.f25954j.remove((Object) v0Var);
    }

    public final void E(float f10) {
        C5353v<v0<S>.defpackage.d<?, ?>> vVar = this.f25953i;
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) vVar.get(i10)).y(f10);
        }
        C5353v<v0<?>> vVar2 = this.f25954j;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((v0) vVar2.get(i11)).E(f10);
        }
    }

    public final void G(S s10, S s11, long j10) {
        M(Long.MIN_VALUE);
        this.f25945a.e(false);
        if (!u() || !C17542s.e(i(), s10) || !C17542s.e(p(), s11)) {
            if (!C17542s.e(i(), s10)) {
                x0<S> x0Var = this.f25945a;
                if (x0Var instanceof C5537d0) {
                    x0Var.d(s10);
                }
            }
            N(s11);
            K(true);
            L(new c(s10, s11));
        }
        C5353v<v0<?>> vVar = this.f25954j;
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            v0 v0Var = (v0) vVar.get(i10);
            C17542s.h(v0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (v0Var.u()) {
                v0Var.G(v0Var.i(), v0Var.p(), j10);
            }
        }
        C5353v<v0<S>.defpackage.d<?, ?>> vVar2 = this.f25953i;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((d) vVar2.get(i11)).z(j10);
        }
        this.f25956l = j10;
    }

    public final void H(long j10) {
        if (o() == Long.MIN_VALUE) {
            M(j10);
        }
        J(j10);
        O(false);
        C5353v<v0<S>.defpackage.d<?, ?>> vVar = this.f25953i;
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) vVar.get(i10)).z(j10);
        }
        C5353v<v0<?>> vVar2 = this.f25954j;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            v0 v0Var = (v0) vVar2.get(i11);
            if (!C17542s.e(v0Var.p(), v0Var.i())) {
                v0Var.H(j10);
            }
        }
    }

    public final void I(C5549j0.b bVar) {
        C5353v<v0<S>.defpackage.d<?, ?>> vVar = this.f25953i;
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) vVar.get(i10)).E(bVar);
        }
        C5353v<v0<?>> vVar2 = this.f25954j;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((v0) vVar2.get(i11)).I(bVar);
        }
    }

    public final void J(long j10) {
        if (this.f25946b == null) {
            P(j10);
        }
    }

    public final void K(boolean z10) {
        this.f25955k.setValue(Boolean.valueOf(z10));
    }

    public final void M(long j10) {
        this.f25951g.o(j10);
    }

    public final void N(S s10) {
        this.f25948d.setValue(s10);
    }

    public final void Q() {
        C5353v<v0<S>.defpackage.d<?, ?>> vVar = this.f25953i;
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) vVar.get(i10)).L();
        }
        C5353v<v0<?>> vVar2 = this.f25954j;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((v0) vVar2.get(i11)).Q();
        }
    }

    public final void R(S s10) {
        if (!C17542s.e(p(), s10)) {
            L(new c(p(), s10));
            if (!C17542s.e(i(), p())) {
                this.f25945a.d(p());
            }
            N(s10);
            if (!t()) {
                O(true);
            }
            F();
        }
    }

    public final boolean c(v0<S>.defpackage.d<?, ?> dVar) {
        return this.f25953i.add(dVar);
    }

    public final boolean d(v0<?> v0Var) {
        return this.f25954j.add(v0Var);
    }

    public final void e(S s10, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(s10) : k10.F(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(this) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (!u()) {
                k10.W(1822507602);
                R(s10);
                if (!C17542s.e(s10, i()) || t() || r()) {
                    k10.W(1822738893);
                    Object D10 = k10.D();
                    C4889m.a aVar = C4889m.f14007a;
                    if (D10 == aVar.a()) {
                        B b10 = new B(P.k(C17169j.f142968a, k10));
                        k10.u(b10);
                        D10 = b10;
                    }
                    Q a10 = ((B) D10).a();
                    int i12 = i11 & 112;
                    boolean F10 = (i12 == 32) | k10.F(a10);
                    Object D11 = k10.D();
                    if (F10 || D11 == aVar.a()) {
                        D11 = new e(a10, this);
                        k10.u(D11);
                    }
                    P.b(a10, this, (C17642l) D11, k10, i12);
                    k10.P();
                } else {
                    k10.W(1823982427);
                    k10.P();
                }
                k10.P();
            } else {
                k10.W(1823992347);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new f(this, s10, i10));
        }
    }

    public final void g() {
        C5353v<v0<S>.defpackage.d<?, ?>> vVar = this.f25953i;
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) vVar.get(i10)).d();
        }
        C5353v<v0<?>> vVar2 = this.f25954j;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((v0) vVar2.get(i11)).g();
        }
    }

    public final List<v0<S>.defpackage.d<?, ?>> h() {
        return this.f25953i;
    }

    public final S i() {
        return this.f25945a.a();
    }

    public final boolean j() {
        C5353v<v0<S>.defpackage.d<?, ?>> vVar = this.f25953i;
        int size = vVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                C5353v<v0<?>> vVar2 = this.f25954j;
                int size2 = vVar2.size();
                int i11 = 0;
                while (i11 < size2) {
                    if (!((v0) vVar2.get(i11)).j()) {
                        i11++;
                    }
                }
                return false;
            } else if (((d) vVar.get(i10)).s() != null) {
                break;
            } else {
                i10++;
            }
        }
        return true;
    }

    public final String k() {
        return this.f25947c;
    }

    public final long l() {
        return this.f25956l;
    }

    public final long m() {
        v0<?> v0Var = this.f25946b;
        return v0Var != null ? v0Var.m() : s();
    }

    public final b<S> n() {
        return (b) this.f25949e.getValue();
    }

    public final long o() {
        return this.f25951g.b();
    }

    public final S p() {
        return this.f25948d.getValue();
    }

    public final long q() {
        return ((Number) this.f25957m.getValue()).longValue();
    }

    public final boolean t() {
        return o() != Long.MIN_VALUE;
    }

    public String toString() {
        List<v0<S>.defpackage.d<?, ?>> h10 = h();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < h10.size(); i10++) {
            str = str + h10.get(i10) + ", ";
        }
        return str;
    }

    public final boolean u() {
        return ((Boolean) this.f25955k.getValue()).booleanValue();
    }

    public final void w() {
        z();
        this.f25945a.g();
    }

    public final void x(long j10, float f10) {
        if (o() == Long.MIN_VALUE) {
            A(j10);
        }
        long o10 = j10 - o();
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            o10 = C17752b.f(((double) o10) / ((double) f10));
        }
        J(o10);
        y(o10, i10 == 0);
    }

    public final void y(long j10, boolean z10) {
        boolean z11 = true;
        if (o() == Long.MIN_VALUE) {
            A(j10);
        } else if (!this.f25945a.c()) {
            this.f25945a.e(true);
        }
        O(false);
        C5353v<v0<S>.defpackage.d<?, ?>> vVar = this.f25953i;
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) vVar.get(i10);
            if (!dVar.v()) {
                dVar.w(j10, z10);
            }
            if (!dVar.v()) {
                z11 = false;
            }
        }
        C5353v<v0<?>> vVar2 = this.f25954j;
        int size2 = vVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            v0 v0Var = (v0) vVar2.get(i11);
            if (!C17542s.e(v0Var.p(), v0Var.i())) {
                v0Var.y(j10, z10);
            }
            if (!C17542s.e(v0Var.p(), v0Var.i())) {
                z11 = false;
            }
        }
        if (z11) {
            z();
        }
    }

    public final void z() {
        M(Long.MIN_VALUE);
        x0<S> x0Var = this.f25945a;
        if (x0Var instanceof C5537d0) {
            x0Var.d(p());
        }
        J(0);
        this.f25945a.e(false);
        C5353v<v0<?>> vVar = this.f25954j;
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((v0) vVar.get(i10)).z();
        }
    }

    public v0(x0<S> x0Var, String str) {
        this(x0Var, (v0<?>) null, str);
    }

    public v0(S s10, String str) {
        this(new C5537d0(s10), (v0<?>) null, str);
    }
}
