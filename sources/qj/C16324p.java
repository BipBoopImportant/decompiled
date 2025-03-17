package QJ;

import QJ.C16318m;
import WJ.C16732A;
import WJ.C16735D;
import WJ.C16747h;
import XH.C16807N;
import XH.C16820k;
import androidx.concurrent.futures.b;
import com.sugarcube.app.base.data.source.CatalogRepository;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.q;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J[\u0010/\u001a\u0004\u0018\u00010\u001e\"\u0004\b\u0001\u0010(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b/\u00100JK\u00102\u001a\u0004\u0018\u000101\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0002042\b\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\rH\u0001¢\u0006\u0004\b:\u0010\u000fJ\u0011\u0010;\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b@\u0010\u0013J\u0017\u0010A\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020C2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bD\u0010EJC\u0010G\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u001e\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010F\u001a\u00028\u0001¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00102\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0011\u0010M\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bM\u0010<J\u000f\u0010N\u001a\u00020\u0016H\u0000¢\u0006\u0004\bN\u00108J\u001d\u0010Q\u001a\u00020\u00162\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000OH\u0016¢\u0006\u0004\bQ\u0010!J-\u0010S\u001a\u00020\u00162\u0006\u0010F\u001a\u00028\u00002\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010RH\u0016¢\u0006\u0004\bS\u0010TJC\u0010U\u001a\u00020\u0016\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010F\u001a\u00028\u00012 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bU\u0010VJ#\u0010X\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010W\u001a\u00020\tH\u0016¢\u0006\u0004\bX\u0010YJ)\u0010[\u001a\u00020\u00162\u0018\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00160Rj\u0002`ZH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020CH\u0000¢\u0006\u0004\b]\u0010^JI\u0010_\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2\"\b\u0002\u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0000¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0016H\u0000¢\u0006\u0004\ba\u00108JO\u0010b\u001a\u0004\u0018\u00010\u001e\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010F\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u001e2 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bb\u0010cJ\u0019\u0010e\u001a\u0004\u0018\u00010\u001e2\u0006\u0010d\u001a\u00020\u0010H\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010\u0001\u001a\u00020\u00162\u0006\u0010g\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u0001\u0010!J\u001b\u0010i\u001a\u00020\u0016*\u00020h2\u0006\u0010F\u001a\u00028\u0000H\u0016¢\u0006\u0004\bi\u0010jJ\u001f\u0010k\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bk\u0010lJ\u001b\u0010m\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bm\u0010nJ\u000f\u0010p\u001a\u00020oH\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020oH\u0014¢\u0006\u0004\br\u0010qR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0004¢\u0006\f\n\u0004\bX\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010y\u001a\u00020,8\u0016X\u0004¢\u0006\f\n\u0004\bm\u0010v\u001a\u0004\bw\u0010xR\u0016\u0010{\u001a\u0004\u0018\u00010\u001b8BX\u0004¢\u0006\u0006\u001a\u0004\bz\u0010\u001dR\u0014\u0010}\u001a\u00020o8BX\u0004¢\u0006\u0006\u001a\u0004\b|\u0010qR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001e8@X\u0004¢\u0006\u0006\u001a\u0004\b~\u0010<R\u0015\u0010\u0001\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u000fR\u0016\u0010\u0001\u001a\u00020\r8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010\u000fR\u0016\u0010\u0001\u001a\u00020\r8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010\u000fR\u001f\u0010\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\f\u0010\u0001\u001a\u00020\u001e8\u0002X\u0004R\u0014\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0004R\u0014\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001e8\u0002X\u0004¨\u0006\u0001"}, d2 = {"LQJ/p;", "T", "LQJ/f0;", "LQJ/n;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "LQJ/q1;", "LdI/e;", "delegate", "", "resumeMode", "<init>", "(LdI/e;I)V", "", "J", "()Z", "", "cause", "o", "(Ljava/lang/Throwable;)Z", "LWJ/A;", "segment", "LXH/N;", "n", "(LWJ/A;Ljava/lang/Throwable;)V", "Y", "W", "LQJ/k0;", "F", "()LQJ/k0;", "", "handler", "G", "(Ljava/lang/Object;)V", "state", "L", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", "s", "(I)V", "R", "LQJ/T0;", "proposedUpdate", "Lkotlin/Function3;", "LdI/i;", "onCancellation", "idempotent", "V", "(LQJ/T0;Ljava/lang/Object;ILnI/q;Ljava/lang/Object;)Ljava/lang/Object;", "LWJ/D;", "X", "(Ljava/lang/Object;Ljava/lang/Object;LnI/q;)LWJ/D;", "", "k", "(Ljava/lang/Object;)Ljava/lang/Void;", "r", "()V", "C", "Q", "i", "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "p", "N", "(Ljava/lang/Throwable;)V", "LQJ/m;", "l", "(LQJ/m;Ljava/lang/Throwable;)V", "value", "m", "(LnI/q;Ljava/lang/Throwable;Ljava/lang/Object;)V", "LQJ/F0;", "parent", "t", "(LQJ/F0;)Ljava/lang/Throwable;", "w", "O", "LXH/x;", "result", "resumeWith", "Lkotlin/Function1;", "I", "(Ljava/lang/Object;LnI/l;)V", "P", "(Ljava/lang/Object;LnI/q;)V", "index", "d", "(LWJ/A;I)V", "Lkotlinx/coroutines/CompletionHandler;", "K", "(LnI/l;)V", "H", "(LQJ/m;)V", "S", "(Ljava/lang/Object;ILnI/q;)V", "q", "u", "(Ljava/lang/Object;Ljava/lang/Object;LnI/q;)Ljava/lang/Object;", "exception", "D", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "LQJ/M;", "E", "(LQJ/M;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "M", "LdI/e;", "b", "()LdI/e;", "LdI/i;", "getContext", "()LdI/i;", "context", "v", "parentHandle", "y", "stateDebugRepresentation", "x", "c", "isActive", "h", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "_decisionAndIndex", "_state", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.p  reason: case insensitive filesystem */
public class C16324p<T> extends C16305f0<T> implements C16320n<T>, e, q1 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f137662f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f137663g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f137664h;
    private volatile /* synthetic */ int _decisionAndIndex$volatile = 536870911;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile = C16300d.f137613a;

    /* renamed from: d  reason: collision with root package name */
    private final C17164e<T> f137665d;

    /* renamed from: e  reason: collision with root package name */
    private final C17168i f137666e;

    static {
        Class<C16324p> cls = C16324p.class;
        f137662f = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex$volatile");
        Class<Object> cls2 = Object.class;
        f137663g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        f137664h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public C16324p(C17164e<? super T> eVar, int i10) {
        super(i10);
        this.f137665d = eVar;
        this.f137666e = eVar.getContext();
    }

    private final C16315k0 F() {
        F0 f02 = (F0) getContext().get(F0.f137562d0);
        if (f02 == null) {
            return null;
        }
        C16315k0 o10 = J0.o(f02, false, new C16331t(this), 1, (Object) null);
        b.a(f137664h, this, (Object) null, o10);
        return o10;
    }

    private final void G(Object obj) {
        Object obj2 = obj;
        AtomicReferenceFieldUpdater B10 = f137663g;
        while (true) {
            Object obj3 = B10.get(this);
            if (obj3 instanceof C16300d) {
                if (b.a(f137663g, this, obj3, obj2)) {
                    return;
                }
            } else if ((obj3 instanceof C16318m) || (obj3 instanceof C16732A)) {
                L(obj2, obj3);
            } else if (obj3 instanceof C16285C) {
                C16285C c10 = (C16285C) obj3;
                if (!c10.c()) {
                    L(obj2, obj3);
                }
                if (obj3 instanceof C16329s) {
                    Throwable th2 = null;
                    if (!(obj3 instanceof C16285C)) {
                        c10 = null;
                    }
                    if (c10 != null) {
                        th2 = c10.f137555a;
                    }
                    if (obj2 instanceof C16318m) {
                        l((C16318m) obj2, th2);
                        return;
                    }
                    C17542s.h(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                    n((C16732A) obj2, th2);
                    return;
                }
                return;
            } else if (obj3 instanceof C16284B) {
                C16284B b10 = (C16284B) obj3;
                if (b10.f137549b != null) {
                    L(obj2, obj3);
                }
                if (!(obj2 instanceof C16732A)) {
                    C17542s.h(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    C16318m mVar = (C16318m) obj2;
                    if (b10.c()) {
                        l(mVar, b10.f137552e);
                        return;
                    }
                    if (b.a(f137663g, this, obj3, C16284B.b(b10, (Object) null, mVar, (q) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!(obj2 instanceof C16732A)) {
                C17542s.h(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                if (b.a(f137663g, this, obj3, new C16284B(obj3, (C16318m) obj2, (q) null, (Object) null, (Throwable) null, 28, (DefaultConstructorMarker) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final boolean J() {
        if (C16307g0.c(this.f137629c)) {
            C17164e<T> eVar = this.f137665d;
            C17542s.h(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C16747h) eVar).o()) {
                return true;
            }
        }
        return false;
    }

    private final void L(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* access modifiers changed from: private */
    public static final C16807N R(C17642l lVar, Throwable th2, Object obj, C17168i iVar) {
        lVar.invoke(th2);
        return C16807N.f139792a;
    }

    public static /* synthetic */ void U(C16324p pVar, Object obj, int i10, q qVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                qVar = null;
            }
            pVar.S(obj, i10, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final <R> Object V(T0 t02, R r10, int i10, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar, Object obj) {
        if (r10 instanceof C16285C) {
            return r10;
        }
        if (!C16307g0.b(i10) && obj == null) {
            return r10;
        }
        if (qVar == null && !(t02 instanceof C16318m) && obj == null) {
            return r10;
        }
        return new C16284B(r10, t02 instanceof C16318m ? (C16318m) t02 : null, qVar, obj, (Throwable) null, 16, (DefaultConstructorMarker) null);
    }

    private final boolean W() {
        int i10;
        AtomicIntegerFieldUpdater z10 = f137662f;
        do {
            i10 = z10.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f137662f.compareAndSet(this, i10, CatalogRepository.FETCH_FLAG_SDB + (536870911 & i10)));
        return true;
    }

    private final <R> C16735D X(R r10, Object obj, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar) {
        Object obj2;
        AtomicReferenceFieldUpdater B10 = f137663g;
        do {
            obj2 = B10.get(this);
            if (obj2 instanceof T0) {
            } else if (!(obj2 instanceof C16284B) || obj == null || ((C16284B) obj2).f137551d != obj) {
                return null;
            } else {
                return C16326q.f137677a;
            }
        } while (!b.a(f137663g, this, obj2, V((T0) obj2, r10, this.f137629c, qVar, obj)));
        r();
        return C16326q.f137677a;
    }

    private final boolean Y() {
        int i10;
        AtomicIntegerFieldUpdater z10 = f137662f;
        do {
            i10 = z10.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f137662f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void n(C16732A<?> a10, Throwable th2) {
        int i10 = f137662f.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                a10.s(i10, th2, getContext());
            } catch (Throwable th3) {
                C17168i context = getContext();
                O.a(context, new C16286D("Exception in invokeOnCancellation handler for " + this, th3));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
    }

    private final boolean o(Throwable th2) {
        if (!J()) {
            return false;
        }
        C17164e<T> eVar = this.f137665d;
        C17542s.h(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C16747h) eVar).q(th2);
    }

    private final void r() {
        if (!J()) {
            q();
        }
    }

    private final void s(int i10) {
        if (!W()) {
            C16307g0.a(this, i10);
        }
    }

    private final C16315k0 v() {
        return (C16315k0) f137664h.get(this);
    }

    private final String y() {
        Object x10 = x();
        return x10 instanceof T0 ? "Active" : x10 instanceof C16329s ? "Cancelled" : "Completed";
    }

    public void C() {
        C16315k0 F10 = F();
        if (F10 != null && h()) {
            F10.b();
            f137664h.set(this, S0.f137600a);
        }
    }

    public Object D(Throwable th2) {
        return X(new C16285C(th2, false, 2, (DefaultConstructorMarker) null), (Object) null, (q) null);
    }

    public void E(M m10, T t10) {
        C17164e<T> eVar = this.f137665d;
        M m11 = null;
        C16747h hVar = eVar instanceof C16747h ? (C16747h) eVar : null;
        if (hVar != null) {
            m11 = hVar.f139551d;
        }
        U(this, t10, m11 == m10 ? 4 : this.f137629c, (q) null, 4, (Object) null);
    }

    public final void H(C16318m mVar) {
        G(mVar);
    }

    public void I(T t10, C17642l<? super Throwable, C16807N> lVar) {
        S(t10, this.f137629c, lVar != null ? new C16322o(lVar) : null);
    }

    public void K(C17642l<? super Throwable, C16807N> lVar) {
        r.c(this, new C16318m.a(lVar));
    }

    /* access modifiers changed from: protected */
    public String M() {
        return "CancellableContinuation";
    }

    public final void N(Throwable th2) {
        if (!o(th2)) {
            p(th2);
            r();
        }
    }

    public final void O() {
        Throwable s10;
        C17164e<T> eVar = this.f137665d;
        C16747h hVar = eVar instanceof C16747h ? (C16747h) eVar : null;
        if (hVar != null && (s10 = hVar.s(this)) != null) {
            q();
            p(s10);
        }
    }

    public <R extends T> void P(R r10, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar) {
        S(r10, this.f137629c, qVar);
    }

    public final boolean Q() {
        Object obj = f137663g.get(this);
        if (!(obj instanceof C16284B) || ((C16284B) obj).f137551d == null) {
            f137662f.set(this, 536870911);
            f137663g.set(this, C16300d.f137613a);
            return true;
        }
        q();
        return false;
    }

    public final <R> void S(R r10, int i10, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar) {
        Object obj;
        AtomicReferenceFieldUpdater B10 = f137663g;
        do {
            obj = B10.get(this);
            if (obj instanceof T0) {
            } else {
                if (obj instanceof C16329s) {
                    C16329s sVar = (C16329s) obj;
                    if (sVar.e()) {
                        if (qVar != null) {
                            m(qVar, sVar.f137555a, r10);
                            return;
                        }
                        return;
                    }
                }
                k(r10);
                throw new C16820k();
            }
        } while (!b.a(f137663g, this, obj, V((T0) obj, r10, i10, qVar, (Object) null)));
        r();
        s(i10);
    }

    public void T(Object obj) {
        s(this.f137629c);
    }

    public void a(Object obj, Throwable th2) {
        AtomicReferenceFieldUpdater B10 = f137663g;
        while (true) {
            Object obj2 = B10.get(this);
            if (obj2 instanceof T0) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof C16285C)) {
                if (obj2 instanceof C16284B) {
                    C16284B b10 = (C16284B) obj2;
                    if (!b10.c()) {
                        Throwable th3 = th2;
                        if (b.a(f137663g, this, obj2, C16284B.b(b10, (Object) null, (C16318m) null, (q) null, (Object) null, th2, 15, (Object) null))) {
                            b10.d(this, th3);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once");
                    }
                } else {
                    Throwable th4 = th2;
                    if (b.a(f137663g, this, obj2, new C16284B(obj2, (C16318m) null, (q) null, (Object) null, th2, 14, (DefaultConstructorMarker) null))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final C17164e<T> b() {
        return this.f137665d;
    }

    public boolean c() {
        return x() instanceof T0;
    }

    public void d(C16732A<?> a10, int i10) {
        int i11;
        AtomicIntegerFieldUpdater z10 = f137662f;
        do {
            i11 = z10.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!z10.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        G(a10);
    }

    public Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 != null) {
            return e10;
        }
        return null;
    }

    public <T> T f(Object obj) {
        return obj instanceof C16284B ? ((C16284B) obj).f137548a : obj;
    }

    public e getCallerFrame() {
        C17164e<T> eVar = this.f137665d;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public C17168i getContext() {
        return this.f137666e;
    }

    public boolean h() {
        return !(x() instanceof T0);
    }

    public Object i() {
        return x();
    }

    public boolean isCancelled() {
        return x() instanceof C16329s;
    }

    public final void l(C16318m mVar, Throwable th2) {
        try {
            mVar.b(th2);
        } catch (Throwable th3) {
            C17168i context = getContext();
            O.a(context, new C16286D("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final <R> void m(q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar, Throwable th2, R r10) {
        try {
            qVar.invoke(th2, r10, getContext());
        } catch (Throwable th3) {
            C17168i context = getContext();
            O.a(context, new C16286D("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public boolean p(Throwable th2) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater B10 = f137663g;
        do {
            obj = B10.get(this);
            z10 = false;
            if (!(obj instanceof T0)) {
                return false;
            }
            if ((obj instanceof C16318m) || (obj instanceof C16732A)) {
                z10 = true;
            }
        } while (!b.a(f137663g, this, obj, new C16329s(this, th2, z10)));
        T0 t02 = (T0) obj;
        if (t02 instanceof C16318m) {
            l((C16318m) obj, th2);
        } else if (t02 instanceof C16732A) {
            n((C16732A) obj, th2);
        }
        r();
        s(this.f137629c);
        return true;
    }

    public final void q() {
        C16315k0 v10 = v();
        if (v10 != null) {
            v10.b();
            f137664h.set(this, S0.f137600a);
        }
    }

    public void resumeWith(Object obj) {
        U(this, C16287E.c(obj, this), this.f137629c, (q) null, 4, (Object) null);
    }

    public Throwable t(F0 f02) {
        return f02.x();
    }

    public String toString() {
        return M() + '(' + V.c(this.f137665d) + "){" + y() + "}@" + V.b(this);
    }

    public <R extends T> Object u(R r10, Object obj, q<? super Throwable, ? super R, ? super C17168i, C16807N> qVar) {
        return X(r10, obj, qVar);
    }

    public final Object w() {
        F0 f02;
        boolean J10 = J();
        if (Y()) {
            if (v() == null) {
                F();
            }
            if (J10) {
                O();
            }
            return C17187b.f();
        }
        if (J10) {
            O();
        }
        Object x10 = x();
        if (x10 instanceof C16285C) {
            throw ((C16285C) x10).f137555a;
        } else if (!C16307g0.b(this.f137629c) || (f02 = (F0) getContext().get(F0.f137562d0)) == null || f02.c()) {
            return f(x10);
        } else {
            CancellationException x11 = f02.x();
            a(x10, x11);
            throw x11;
        }
    }

    public final Object x() {
        return f137663g.get(this);
    }
}
