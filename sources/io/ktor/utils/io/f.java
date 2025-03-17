package io.ktor.utils.io;

import RH.C16368a;
import SH.C16416a;
import TH.C16492f;
import XH.C16807N;
import dI.C17164e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ#\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\nJ\u000f\u0010%\u001a\u00020\bH\u0004¢\u0006\u0004\b%\u0010\nJ\u001b\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J+\u00100\u001a\u00020\b2\u0006\u0010*\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0004¢\u0006\u0004\b2\u0010\u001fJ\u001b\u00103\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001b\u00107\u001a\u00020\u001c2\u0006\u00106\u001a\u000205H@ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u001c2\u0006\u00106\u001a\u00020)H@ø\u0001\u0000¢\u0006\u0004\b9\u0010,J+\u0010:\u001a\u00020\u001c2\u0006\u00106\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b:\u00101J\u001b\u0010<\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b<\u0010\"J\u0013\u0010=\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0004\b?\u0010\"J\u001b\u0010@\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b@\u00104J\u0019\u0010C\u001a\u00020\u00052\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\u00052\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bE\u0010DJ\u001f\u0010F\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0004¢\u0006\u0004\bH\u0010\u001fR\u001a\u0010L\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\u0007R\u001a\u0010Q\u001a\u00020\r8\u0004X\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010U\u001a\u00020\u00148\u0004X\u0004¢\u0006\f\n\u0004\b3\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010]\u001a\u00060\u0004j\u0002`Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010NR\u0014\u0010`\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u0007R$\u0010e\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\u00058D@DX\u000e¢\u0006\f\u001a\u0004\bb\u0010\u0007\"\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010fR\u0014\u0010i\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\bh\u0010fR\u0014\u0010k\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u0007R\u0014\u0010m\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u0007R(\u0010q\u001a\u0004\u0018\u00010A2\b\u0010a\u001a\u0004\u0018\u00010A8F@FX\u000e¢\u0006\f\u001a\u0004\bM\u0010n\"\u0004\bo\u0010p\u0002\u0004\n\u0002\b\u0019¨\u0006r"}, d2 = {"Lio/ktor/utils/io/f;", "Lio/ktor/utils/io/c;", "Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/j;", "", "", "I", "()Z", "LXH/N;", "J", "()V", "F", "G", "LRH/j;", "closeable", "H", "(LRH/j;)V", "builder", "", "limit", "LRH/k;", "U", "(LRH/j;JLdI/e;)Ljava/lang/Object;", "C", "max", "discarded0", "E", "(JJLdI/e;)Ljava/lang/Object;", "", "count", "s", "(I)V", "t", "z", "(ILdI/e;)Ljava/lang/Object;", "y", "flush", "P", "packet", "n", "(LRH/k;LdI/e;)Ljava/lang/Object;", "LRH/a;", "src", "k", "(LRH/a;LdI/e;)Ljava/lang/Object;", "", "offset", "length", "l", "([BIILdI/e;)Ljava/lang/Object;", "u", "d", "(JLdI/e;)Ljava/lang/Object;", "LSH/a;", "dst", "g", "(LSH/a;LdI/e;)Ljava/lang/Object;", "Q", "j", "atLeast", "w", "A", "(LdI/e;)Ljava/lang/Object;", "B", "i", "", "cause", "p", "(Ljava/lang/Throwable;)Z", "a", "X", "(Lio/ktor/utils/io/f;J)J", "v", "b", "Z", "o", "autoFlush", "c", "LRH/j;", "getWritable", "()LRH/j;", "writable", "LRH/k;", "getReadable", "()LRH/k;", "readable", "Lio/ktor/utils/io/internal/a;", "e", "Lio/ktor/utils/io/internal/a;", "slot", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "f", "Ljava/lang/Object;", "flushMutex", "flushBuffer", "O", "isCancelled", "<anonymous parameter 0>", "L", "setClosed", "(Z)V", "closed", "()I", "availableForRead", "K", "availableForWrite", "m", "isClosedForRead", "h", "isClosedForWrite", "()Ljava/lang/Throwable;", "setClosedCause", "(Ljava/lang/Throwable;)V", "closedCause", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class f implements c, g, j {

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f143641h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f143642i;

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f143643j;

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f143644k;

    /* renamed from: l  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f143645l;
    private volatile /* synthetic */ int _availableForRead;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _lastReadView;
    private volatile /* synthetic */ long _totalBytesRead;
    private volatile /* synthetic */ long _totalBytesWritten;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f143646b;

    /* renamed from: c  reason: collision with root package name */
    private final RH.j f143647c;
    private volatile /* synthetic */ int channelSize;

    /* renamed from: d  reason: collision with root package name */
    private final RH.k f143648d;

    /* renamed from: e  reason: collision with root package name */
    private final io.ktor.utils.io.internal.a f143649e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f143650f;

    /* renamed from: g  reason: collision with root package name */
    private final RH.j f143651g;
    private volatile /* synthetic */ int lastReadAvailable$delegate;
    private volatile /* synthetic */ Object lastReadView$delegate;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {88}, m = "awaitAtLeastNBytesAvailableForRead$ktor_io")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143652c;

        /* renamed from: d  reason: collision with root package name */
        int f143653d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143654e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f143655f;

        /* renamed from: g  reason: collision with root package name */
        int f143656g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f143655f = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143654e = obj;
            this.f143656g |= Integer.MIN_VALUE;
            return this.f143655f.y(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f143657c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f143658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, int i10) {
            super(0);
            this.f143657c = fVar;
            this.f143658d = i10;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(this.f143657c.e() < this.f143658d && !this.f143657c.m());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {81}, m = "awaitAtLeastNBytesAvailableForWrite$ktor_io")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143659c;

        /* renamed from: d  reason: collision with root package name */
        int f143660d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143661e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f143662f;

        /* renamed from: g  reason: collision with root package name */
        int f143663g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f143662f = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143661e = obj;
            this.f143663g |= Integer.MIN_VALUE;
            return this.f143662f.z(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f143664c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f143665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, int i10) {
            super(0);
            this.f143664c = fVar;
            this.f143665d = i10;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(this.f143664c.K() < this.f143665d && !this.f143664c.L());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {611}, m = "awaitSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143666c;

        /* renamed from: d  reason: collision with root package name */
        int f143667d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143668e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f143669f;

        /* renamed from: g  reason: collision with root package name */
        int f143670g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f143669f = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143668e = obj;
            this.f143670g |= Integer.MIN_VALUE;
            return this.f143669f.B(0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {673}, m = "discardSuspend")
    /* renamed from: io.ktor.utils.io.f$f  reason: collision with other inner class name */
    static final class C3507f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143671c;

        /* renamed from: d  reason: collision with root package name */
        long f143672d;

        /* renamed from: e  reason: collision with root package name */
        long f143673e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f143674f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f143675g;

        /* renamed from: h  reason: collision with root package name */
        int f143676h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3507f(f fVar, C17164e<? super C3507f> eVar) {
            super(eVar);
            this.f143675g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143674f = obj;
            this.f143676h |= Integer.MIN_VALUE;
            return this.f143675g.E(0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {486}, m = "readAvailable$ktor_io")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143677c;

        /* renamed from: d  reason: collision with root package name */
        Object f143678d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143679e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f143680f;

        /* renamed from: g  reason: collision with root package name */
        int f143681g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f143680f = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143679e = obj;
            this.f143681g |= Integer.MIN_VALUE;
            return this.f143680f.Q((C16368a) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {530}, m = "readAvailable$suspendImpl")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143682c;

        /* renamed from: d  reason: collision with root package name */
        Object f143683d;

        /* renamed from: e  reason: collision with root package name */
        int f143684e;

        /* renamed from: f  reason: collision with root package name */
        int f143685f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f143686g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f143687h;

        /* renamed from: i  reason: collision with root package name */
        int f143688i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f143687h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143686g = obj;
            this.f143688i |= Integer.MIN_VALUE;
            return f.S(this.f143687h, (byte[]) null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {425}, m = "readRemainingSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143689c;

        /* renamed from: d  reason: collision with root package name */
        Object f143690d;

        /* renamed from: e  reason: collision with root package name */
        long f143691e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f143692f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f143693g;

        /* renamed from: h  reason: collision with root package name */
        int f143694h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f143693g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143692f = obj;
            this.f143694h |= Integer.MIN_VALUE;
            return this.f143693g.U((RH.j) null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {193}, m = "writeFully$suspendImpl")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143695c;

        /* renamed from: d  reason: collision with root package name */
        Object f143696d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143697e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f143698f;

        /* renamed from: g  reason: collision with root package name */
        int f143699g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(f fVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f143698f = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143697e = obj;
            this.f143699g |= Integer.MIN_VALUE;
            return f.Y(this.f143698f, (C16368a) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {204}, m = "writeFully$suspendImpl")
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143700c;

        /* renamed from: d  reason: collision with root package name */
        Object f143701d;

        /* renamed from: e  reason: collision with root package name */
        int f143702e;

        /* renamed from: f  reason: collision with root package name */
        int f143703f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f143704g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f143705h;

        /* renamed from: i  reason: collision with root package name */
        int f143706i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(f fVar, C17164e<? super k> eVar) {
            super(eVar);
            this.f143705h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143704g = obj;
            this.f143706i |= Integer.MIN_VALUE;
            return f.Z(this.f143705h, (byte[]) null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {186}, m = "writePacket$suspendImpl")
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143707c;

        /* renamed from: d  reason: collision with root package name */
        Object f143708d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143709e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f143710f;

        /* renamed from: g  reason: collision with root package name */
        int f143711g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar, C17164e<? super l> eVar) {
            super(eVar);
            this.f143710f = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143709e = obj;
            this.f143711g |= Integer.MIN_VALUE;
            return f.a0(this.f143710f, (RH.k) null, this);
        }
    }

    static {
        Class<f> cls = f.class;
        f143641h = AtomicLongFieldUpdater.newUpdater(cls, "_totalBytesRead");
        f143642i = AtomicLongFieldUpdater.newUpdater(cls, "_totalBytesWritten");
        f143643j = AtomicIntegerFieldUpdater.newUpdater(cls, "_availableForRead");
        f143644k = AtomicIntegerFieldUpdater.newUpdater(cls, "channelSize");
        f143645l = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_closed");
    }

    private final void C() {
        C16416a N10 = N();
        int M10 = M() - (N10.k() - N10.i());
        if (N() != C16368a.f137958g.a()) {
            SH.g.a(this.f143648d, N());
        }
        if (M10 > 0) {
            u(M10);
        }
        V(0);
        W(C16416a.f138260j.a());
    }

    static /* synthetic */ Object D(f fVar, long j10, C17164e<? super Long> eVar) {
        long l10 = fVar.f143648d.l(j10);
        fVar.u((int) l10);
        if (l10 != j10 && !fVar.m()) {
            return fVar.E(j10, l10, eVar);
        }
        fVar.G();
        return kotlin.coroutines.jvm.internal.b.f(l10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if (r2.m() == false) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E(long r9, long r11, dI.C17164e<? super java.lang.Long> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof io.ktor.utils.io.f.C3507f
            if (r0 == 0) goto L_0x0013
            r0 = r13
            io.ktor.utils.io.f$f r0 = (io.ktor.utils.io.f.C3507f) r0
            int r1 = r0.f143676h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143676h = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.f$f r0 = new io.ktor.utils.io.f$f
            r0.<init>(r8, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f143674f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143676h
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            long r9 = r0.f143673e
            long r11 = r0.f143672d
            java.lang.Object r2 = r0.f143671c
            io.ktor.utils.io.f r2 = (io.ktor.utils.io.f) r2
            XH.y.b(r13)
            r6 = r9
            r9 = r11
            r11 = r6
            goto L_0x004f
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            XH.y.b(r13)
            r2 = r8
        L_0x0040:
            r0.f143671c = r2
            r0.f143672d = r9
            r0.f143673e = r11
            r0.f143676h = r3
            java.lang.Object r13 = r2.w(r3, r0)
            if (r13 != r1) goto L_0x004f
            return r1
        L_0x004f:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x006e
            RH.k r13 = r2.f143648d
            long r4 = r9 - r11
            long r4 = r13.l(r4)
            int r13 = (int) r4
            r2.u(r13)
            long r11 = r11 + r4
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x006e
            boolean r13 = r2.m()
            if (r13 == 0) goto L_0x0040
        L_0x006e:
            r2.G()
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.b.f(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.E(long, long, dI.e):java.lang.Object");
    }

    private final void F() {
        if (L()) {
            Throwable c10 = c();
            if (c10 == null) {
                c10 = new p("Channel " + this + " is already closed");
            }
            throw c10;
        }
    }

    private final void G() {
        Throwable c10 = c();
        if (c10 != null) {
            throw c10;
        }
    }

    private final void H(RH.j jVar) {
        Throwable c10 = c();
        if (c10 != null) {
            jVar.J();
            throw c10;
        }
    }

    private final boolean I() {
        if (this.f143647c.E0()) {
            this.f143649e.c();
            return false;
        }
        J();
        this.f143649e.c();
        return true;
    }

    private final void J() {
        synchronized (this.f143650f) {
            int A02 = this.f143647c.A0();
            C16416a U10 = this.f143647c.U();
            C17542s.g(U10);
            this.f143651g.e0(U10);
            f143643j.addAndGet(this, A02);
        }
    }

    private final int M() {
        return this.lastReadAvailable$delegate;
    }

    private final C16416a N() {
        return (C16416a) this.lastReadView$delegate;
    }

    private final boolean O() {
        n nVar = (n) this._closed;
        return (nVar != null ? nVar.a() : null) != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object S(io.ktor.utils.io.f r4, byte[] r5, int r6, int r7, dI.C17164e<? super java.lang.Integer> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.f.h
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.ktor.utils.io.f$h r0 = (io.ktor.utils.io.f.h) r0
            int r1 = r0.f143688i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143688i = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.f$h r0 = new io.ktor.utils.io.f$h
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f143686g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143688i
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r7 = r0.f143685f
            int r6 = r0.f143684e
            java.lang.Object r4 = r0.f143683d
            r5 = r4
            byte[] r5 = (byte[]) r5
            java.lang.Object r4 = r0.f143682c
            io.ktor.utils.io.f r4 = (io.ktor.utils.io.f) r4
            XH.y.b(r8)
            goto L_0x0078
        L_0x0036:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003e:
            XH.y.b(r8)
            java.lang.Throwable r8 = r4.c()
            if (r8 != 0) goto L_0x009c
            boolean r8 = r4.L()
            if (r8 == 0) goto L_0x0059
            int r8 = r4.e()
            if (r8 != 0) goto L_0x0059
            r4 = -1
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.e(r4)
            return r4
        L_0x0059:
            if (r7 != 0) goto L_0x0061
            r4 = 0
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.e(r4)
            return r4
        L_0x0061:
            int r8 = r4.e()
            if (r8 != 0) goto L_0x0078
            r0.f143682c = r4
            r0.f143683d = r5
            r0.f143684e = r6
            r0.f143685f = r7
            r0.f143688i = r3
            java.lang.Object r8 = r4.B(r3, r0)
            if (r8 != r1) goto L_0x0078
            return r1
        L_0x0078:
            RH.k r8 = r4.f143648d
            boolean r8 = r8.g()
            if (r8 != 0) goto L_0x0083
            r4.P()
        L_0x0083:
            long r7 = (long) r7
            RH.k r0 = r4.f143648d
            long r0 = r0.i0()
            long r7 = java.lang.Math.min(r7, r0)
            int r7 = (int) r7
            RH.k r8 = r4.f143648d
            RH.o.b(r8, r5, r6, r7)
            r4.u(r7)
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.e(r7)
            return r4
        L_0x009c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.S(io.ktor.utils.io.f, byte[], int, int, dI.e):java.lang.Object");
    }

    static /* synthetic */ Object T(f fVar, long j10, C17164e<? super RH.k> eVar) {
        fVar.G();
        RH.j jVar = new RH.j((C16492f) null, 1, (DefaultConstructorMarker) null);
        long min = Math.min(j10, fVar.f143648d.i0());
        jVar.h0(fVar.f143648d, min);
        fVar.u((int) min);
        if (j10 - ((long) jVar.A0()) != 0 && !fVar.m()) {
            return fVar.U(jVar, j10, eVar);
        }
        fVar.H(jVar);
        return jVar.t0();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object U(RH.j r11, long r12, dI.C17164e<? super RH.k> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.f.i
            if (r0 == 0) goto L_0x0013
            r0 = r14
            io.ktor.utils.io.f$i r0 = (io.ktor.utils.io.f.i) r0
            int r1 = r0.f143694h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143694h = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.f$i r0 = new io.ktor.utils.io.f$i
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f143692f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143694h
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            long r11 = r0.f143691e
            java.lang.Object r13 = r0.f143690d
            RH.j r13 = (RH.j) r13
            java.lang.Object r2 = r0.f143689c
            io.ktor.utils.io.f r2 = (io.ktor.utils.io.f) r2
            XH.y.b(r14)
            r8 = r11
            r11 = r13
            r12 = r8
            goto L_0x0042
        L_0x0036:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003e:
            XH.y.b(r14)
            r2 = r10
        L_0x0042:
            int r14 = r11.A0()
            long r4 = (long) r14
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x0085
            int r14 = r11.A0()
            long r4 = (long) r14
            long r4 = r12 - r4
            RH.k r14 = r2.f143648d
            long r6 = r14.i0()
            long r4 = java.lang.Math.min(r4, r6)
            RH.k r14 = r2.f143648d
            r11.h0(r14, r4)
            int r14 = (int) r4
            r2.u(r14)
            r2.H(r11)
            boolean r14 = r2.m()
            if (r14 != 0) goto L_0x0085
            int r14 = r11.A0()
            int r4 = (int) r12
            if (r14 != r4) goto L_0x0076
            goto L_0x0085
        L_0x0076:
            r0.f143689c = r2
            r0.f143690d = r11
            r0.f143691e = r12
            r0.f143694h = r3
            java.lang.Object r14 = r2.B(r3, r0)
            if (r14 != r1) goto L_0x0042
            return r1
        L_0x0085:
            r2.H(r11)
            RH.k r11 = r11.t0()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.U(RH.j, long, dI.e):java.lang.Object");
    }

    private final void V(int i10) {
        this.lastReadAvailable$delegate = i10;
    }

    private final void W(C16416a aVar) {
        this.lastReadView$delegate = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: RH.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object Y(io.ktor.utils.io.f r4, RH.C16368a r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.f.j
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.ktor.utils.io.f$j r0 = (io.ktor.utils.io.f.j) r0
            int r1 = r0.f143699g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143699g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.f$j r0 = new io.ktor.utils.io.f$j
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f143697e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143699g
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.f143696d
            r5 = r4
            RH.a r5 = (RH.C16368a) r5
            java.lang.Object r4 = r0.f143695c
            io.ktor.utils.io.f r4 = (io.ktor.utils.io.f) r4
            XH.y.b(r6)
            goto L_0x004a
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            XH.y.b(r6)
            r0.f143695c = r4
            r0.f143696d = r5
            r0.f143699g = r3
            java.lang.Object r6 = r4.z(r3, r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            int r6 = r5.k()
            int r0 = r5.i()
            int r6 = r6 - r0
            RH.j r0 = r4.f143647c
            r1 = 2
            r2 = 0
            r3 = 0
            RH.t.c(r0, r5, r3, r1, r2)
            r4.v(r6)
            XH.N r4 = XH.C16807N.f139792a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.Y(io.ktor.utils.io.f, RH.a, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object Z(io.ktor.utils.io.f r5, byte[] r6, int r7, int r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.f.k
            if (r0 == 0) goto L_0x0013
            r0 = r9
            io.ktor.utils.io.f$k r0 = (io.ktor.utils.io.f.k) r0
            int r1 = r0.f143706i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143706i = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.f$k r0 = new io.ktor.utils.io.f$k
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f143704g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143706i
            r3 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            int r5 = r0.f143703f
            int r6 = r0.f143702e
            java.lang.Object r7 = r0.f143701d
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.f143700c
            io.ktor.utils.io.f r8 = (io.ktor.utils.io.f) r8
            XH.y.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L_0x005c
        L_0x0038:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0040:
            XH.y.b(r9)
            int r8 = r8 + r7
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r4
        L_0x0049:
            if (r8 >= r5) goto L_0x0070
            r0.f143700c = r6
            r0.f143701d = r7
            r0.f143702e = r8
            r0.f143703f = r5
            r0.f143706i = r3
            java.lang.Object r9 = r6.z(r3, r0)
            if (r9 != r1) goto L_0x005c
            return r1
        L_0x005c:
            int r9 = r6.K()
            int r2 = r5 - r8
            int r9 = java.lang.Math.min(r9, r2)
            RH.j r2 = r6.f143647c
            RH.t.b(r2, r7, r8, r9)
            int r8 = r8 + r9
            r6.v(r9)
            goto L_0x0049
        L_0x0070:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.Z(io.ktor.utils.io.f, byte[], int, int, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: RH.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object a0(io.ktor.utils.io.f r4, RH.k r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.f.l
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.ktor.utils.io.f$l r0 = (io.ktor.utils.io.f.l) r0
            int r1 = r0.f143711g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143711g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.f$l r0 = new io.ktor.utils.io.f$l
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f143709e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143711g
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.f143708d
            r5 = r4
            RH.k r5 = (RH.k) r5
            java.lang.Object r4 = r0.f143707c
            io.ktor.utils.io.f r4 = (io.ktor.utils.io.f) r4
            XH.y.b(r6)
            goto L_0x004a
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            XH.y.b(r6)
            r0.f143707c = r4
            r0.f143708d = r5
            r0.f143711g = r3
            java.lang.Object r6 = r4.z(r3, r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            long r0 = r5.i0()
            int r6 = (int) r0
            RH.j r0 = r4.f143647c
            r0.f0(r5)
            r4.v(r6)
            XH.N r4 = XH.C16807N.f139792a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.a0(io.ktor.utils.io.f, RH.k, dI.e):java.lang.Object");
    }

    private final void s(int i10) {
        if (i10 >= 0) {
            int i11 = -i10;
            f143644k.getAndAdd(this, i11);
            f143641h.addAndGet(this, (long) i10);
            f143643j.getAndAdd(this, i11);
            if (this.channelSize < 0) {
                throw new IllegalStateException(("Readable bytes count is negative: " + e() + ", " + i10 + " in " + this).toString());
            } else if (e() < 0) {
                throw new IllegalStateException(("Readable bytes count is negative: " + e() + ", " + i10 + " in " + this).toString());
            }
        } else {
            throw new IllegalArgumentException(("Can't read negative amount of bytes: " + i10).toString());
        }
    }

    private final void t(int i10) {
        if (i10 >= 0) {
            f143644k.getAndAdd(this, i10);
            f143642i.addAndGet(this, (long) i10);
            if (this.channelSize < 0) {
                throw new IllegalStateException(("Readable bytes count is negative: " + this.channelSize + ", " + i10 + " in " + this).toString());
            }
            return;
        }
        throw new IllegalArgumentException(("Can't write negative amount of bytes: " + i10).toString());
    }

    static /* synthetic */ Object x(f fVar, int i10, C17164e<? super Boolean> eVar) {
        if (i10 >= 0) {
            long j10 = (long) i10;
            if (j10 <= 4088) {
                fVar.C();
                return i10 == 0 ? kotlin.coroutines.jvm.internal.b.a(!fVar.m()) : fVar.f143648d.i0() >= j10 ? kotlin.coroutines.jvm.internal.b.a(true) : fVar.B(i10, eVar);
            }
            throw new IllegalArgumentException(("atLeast parameter shouldn't be larger than max buffer size of 4088: " + i10).toString());
        }
        throw new IllegalArgumentException(("atLeast parameter shouldn't be negative: " + i10).toString());
    }

    public final Object A(C17164e<? super Boolean> eVar) {
        return !this.f143648d.J() ? kotlin.coroutines.jvm.internal.b.a(true) : B(1, eVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B(int r5, dI.C17164e<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.f.e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.ktor.utils.io.f$e r0 = (io.ktor.utils.io.f.e) r0
            int r1 = r0.f143670g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143670g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.f$e r0 = new io.ktor.utils.io.f$e
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f143668e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143670g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r5 = r0.f143667d
            java.lang.Object r0 = r0.f143666c
            io.ktor.utils.io.f r0 = (io.ktor.utils.io.f) r0
            XH.y.b(r6)
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            XH.y.b(r6)
            if (r5 < 0) goto L_0x0067
            r0.f143666c = r4
            r0.f143667d = r5
            r0.f143670g = r3
            java.lang.Object r6 = r4.y(r5, r0)
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r0 = r4
        L_0x004a:
            r0.P()
            java.lang.Throwable r6 = r0.c()
            if (r6 != 0) goto L_0x0066
            boolean r6 = r0.m()
            if (r6 != 0) goto L_0x0060
            int r6 = r0.e()
            if (r6 < r5) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = 0
        L_0x0061:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        L_0x0066:
            throw r6
        L_0x0067:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.B(int, dI.e):java.lang.Object");
    }

    public int K() {
        return Math.max(0, 4088 - this.channelSize);
    }

    /* access modifiers changed from: protected */
    public final boolean L() {
        return this._closed != null;
    }

    /* access modifiers changed from: protected */
    public final void P() {
        synchronized (this.f143650f) {
            SH.g.e(this.f143648d, this.f143651g);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Q(RH.C16368a r6, dI.C17164e<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.f.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.ktor.utils.io.f$g r0 = (io.ktor.utils.io.f.g) r0
            int r1 = r0.f143681g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143681g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.f$g r0 = new io.ktor.utils.io.f$g
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f143679e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143681g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.f143678d
            RH.a r6 = (RH.C16368a) r6
            java.lang.Object r0 = r0.f143677c
            io.ktor.utils.io.f r0 = (io.ktor.utils.io.f) r0
            XH.y.b(r7)
            goto L_0x0079
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            XH.y.b(r7)
            java.lang.Throwable r7 = r5.c()
            if (r7 != 0) goto L_0x00a6
            boolean r7 = r5.L()
            if (r7 == 0) goto L_0x0054
            int r7 = r5.e()
            if (r7 != 0) goto L_0x0054
            r6 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r6)
            return r6
        L_0x0054:
            int r7 = r6.g()
            int r2 = r6.k()
            int r7 = r7 - r2
            if (r7 != 0) goto L_0x0065
            r6 = 0
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r6)
            return r6
        L_0x0065:
            int r7 = r5.e()
            if (r7 != 0) goto L_0x0078
            r0.f143677c = r5
            r0.f143678d = r6
            r0.f143681g = r3
            java.lang.Object r7 = r5.B(r3, r0)
            if (r7 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r0 = r5
        L_0x0079:
            RH.k r7 = r0.f143648d
            boolean r7 = r7.g()
            if (r7 != 0) goto L_0x0084
            r0.P()
        L_0x0084:
            int r7 = r6.g()
            int r1 = r6.k()
            int r7 = r7 - r1
            long r1 = (long) r7
            RH.k r7 = r0.f143648d
            long r3 = r7.i0()
            long r1 = java.lang.Math.min(r1, r3)
            int r7 = (int) r1
            RH.k r1 = r0.f143648d
            RH.o.a(r1, r6, r7)
            r0.u(r7)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r7)
            return r6
        L_0x00a6:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.Q(RH.a, dI.e):java.lang.Object");
    }

    public final long X(f fVar, long j10) {
        C17542s.j(fVar, "dst");
        long i02 = this.f143648d.i0();
        if (i02 > j10) {
            return 0;
        }
        fVar.f143647c.f0(this.f143648d);
        int i10 = (int) i02;
        fVar.v(i10);
        u(i10);
        return i02;
    }

    public boolean a(Throwable th2) {
        if (!androidx.concurrent.futures.b.a(f143645l, this, (Object) null, th2 == null ? o.a() : new n(th2))) {
            return false;
        }
        if (th2 != null) {
            this.f143648d.O0();
            this.f143647c.J();
            this.f143651g.J();
        } else {
            flush();
            this.f143647c.J();
        }
        this.f143649e.b(th2);
        return true;
    }

    public final Throwable c() {
        n nVar = (n) this._closed;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }

    public Object d(long j10, C17164e<? super RH.k> eVar) {
        return T(this, j10, eVar);
    }

    public int e() {
        return this._availableForRead;
    }

    public void flush() {
        I();
    }

    public Object g(C16416a aVar, C17164e<? super Integer> eVar) {
        return C17542s.h(aVar, "null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
    }

    public boolean h() {
        return L();
    }

    public Object i(long j10, C17164e<? super Long> eVar) {
        return D(this, j10, eVar);
    }

    public Object j(byte[] bArr, int i10, int i11, C17164e<? super Integer> eVar) {
        return S(this, bArr, i10, i11, eVar);
    }

    public Object k(C16368a aVar, C17164e<? super C16807N> eVar) {
        return Y(this, aVar, eVar);
    }

    public Object l(byte[] bArr, int i10, int i11, C17164e<? super C16807N> eVar) {
        return Z(this, bArr, i10, i11, eVar);
    }

    public boolean m() {
        return O() || (L() && this.channelSize == 0);
    }

    public Object n(RH.k kVar, C17164e<? super C16807N> eVar) {
        return a0(this, kVar, eVar);
    }

    public boolean o() {
        return this.f143646b;
    }

    public boolean p(Throwable th2) {
        if (c() != null || L()) {
            return false;
        }
        if (th2 == null) {
            th2 = new CancellationException("Channel cancelled");
        }
        return a(th2);
    }

    /* access modifiers changed from: protected */
    public final void u(int i10) {
        s(i10);
        this.f143649e.c();
    }

    /* access modifiers changed from: protected */
    public final void v(int i10) {
        t(i10);
        if (L()) {
            this.f143647c.J();
            F();
        }
        if (o() || K() == 0) {
            flush();
        }
    }

    public Object w(int i10, C17164e<? super Boolean> eVar) {
        return x(this, i10, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(int r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.f.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.ktor.utils.io.f$a r0 = (io.ktor.utils.io.f.a) r0
            int r1 = r0.f143656g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143656g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.f$a r0 = new io.ktor.utils.io.f$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f143654e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143656g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r6 = r0.f143653d
            java.lang.Object r2 = r0.f143652c
            io.ktor.utils.io.f r2 = (io.ktor.utils.io.f) r2
            XH.y.b(r7)
            goto L_0x003b
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            XH.y.b(r7)
            r2 = r5
        L_0x003b:
            int r7 = r2.e()
            if (r7 >= r6) goto L_0x005b
            boolean r7 = r2.m()
            if (r7 != 0) goto L_0x005b
            io.ktor.utils.io.internal.a r7 = r2.f143649e
            io.ktor.utils.io.f$b r4 = new io.ktor.utils.io.f$b
            r4.<init>(r2, r6)
            r0.f143652c = r2
            r0.f143653d = r6
            r0.f143656g = r3
            java.lang.Object r7 = r7.d(r4, r0)
            if (r7 != r1) goto L_0x003b
            return r1
        L_0x005b:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.y(int, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(int r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.f.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.ktor.utils.io.f$c r0 = (io.ktor.utils.io.f.c) r0
            int r1 = r0.f143663g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143663g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.f$c r0 = new io.ktor.utils.io.f$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f143661e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143663g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r6 = r0.f143660d
            java.lang.Object r2 = r0.f143659c
            io.ktor.utils.io.f r2 = (io.ktor.utils.io.f) r2
            XH.y.b(r7)
            goto L_0x003b
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            XH.y.b(r7)
            r2 = r5
        L_0x003b:
            int r7 = r2.K()
            if (r7 >= r6) goto L_0x0061
            boolean r7 = r2.L()
            if (r7 != 0) goto L_0x0061
            boolean r7 = r2.I()
            if (r7 != 0) goto L_0x003b
            io.ktor.utils.io.internal.a r7 = r2.f143649e
            io.ktor.utils.io.f$d r4 = new io.ktor.utils.io.f$d
            r4.<init>(r2, r6)
            r0.f143659c = r2
            r0.f143660d = r6
            r0.f143663g = r3
            java.lang.Object r7 = r7.d(r4, r0)
            if (r7 != r1) goto L_0x003b
            return r1
        L_0x0061:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.z(int, dI.e):java.lang.Object");
    }
}
