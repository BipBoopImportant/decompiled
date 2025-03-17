package dI;

import XH.x;
import androidx.concurrent.futures.b;
import eI.C17186a;
import eI.C17187b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u000fB!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"LdI/k;", "T", "LdI/e;", "Lkotlin/coroutines/jvm/internal/e;", "delegate", "", "initialResult", "<init>", "(LdI/e;Ljava/lang/Object;)V", "(LdI/e;)V", "LXH/x;", "result", "LXH/N;", "resumeWith", "(Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "LdI/e;", "Ljava/lang/Object;", "LdI/i;", "getContext", "()LdI/i;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dI.k  reason: case insensitive filesystem */
public final class C17170k<T> implements C17164e<T>, e {

    /* renamed from: b  reason: collision with root package name */
    private static final a f142969b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<C17170k<?>, Object> f142970c = AtomicReferenceFieldUpdater.newUpdater(C17170k.class, Object.class, "result");

    /* renamed from: a  reason: collision with root package name */
    private final C17164e<T> f142971a;
    private volatile Object result;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdI/k$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dI.k$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C17170k(C17164e<? super T> eVar, Object obj) {
        C17542s.j(eVar, "delegate");
        this.f142971a = eVar;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        C17186a aVar = C17186a.UNDECIDED;
        if (obj == aVar) {
            if (b.a(f142970c, this, aVar, C17187b.f())) {
                return C17187b.f();
            }
            obj = this.result;
        }
        if (obj == C17186a.RESUMED) {
            return C17187b.f();
        }
        if (!(obj instanceof x.b)) {
            return obj;
        }
        throw ((x.b) obj).f139814a;
    }

    public e getCallerFrame() {
        C17164e<T> eVar = this.f142971a;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public C17168i getContext() {
        return this.f142971a.getContext();
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            C17186a aVar = C17186a.UNDECIDED;
            if (obj2 == aVar) {
                if (b.a(f142970c, this, aVar, obj)) {
                    return;
                }
            } else if (obj2 != C17187b.f()) {
                throw new IllegalStateException("Already resumed");
            } else if (b.a(f142970c, this, C17187b.f(), C17186a.RESUMED)) {
                this.f142971a.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f142971a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17170k(C17164e<? super T> eVar) {
        this(eVar, C17186a.UNDECIDED);
        C17542s.j(eVar, "delegate");
    }
}
