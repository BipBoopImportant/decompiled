package XH;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LXH/A;", "T", "LXH/o;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "", "lock", "<init>", "(LnI/a;Ljava/lang/Object;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "a", "LnI/a;", "b", "Ljava/lang/Object;", "_value", "c", "getValue", "()Ljava/lang/Object;", "value", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.A  reason: case insensitive filesystem */
final class C16794A<T> implements C16824o<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private C17631a<? extends T> f139765a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f139766b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f139767c;

    public C16794A(C17631a<? extends T> aVar, Object obj) {
        C17542s.j(aVar, "initializer");
        this.f139765a = aVar;
        this.f139766b = C16803J.f139786a;
        this.f139767c = obj == null ? this : obj;
    }

    public T getValue() {
        T t10;
        T t11 = this.f139766b;
        T t12 = C16803J.f139786a;
        if (t11 != t12) {
            return t11;
        }
        synchronized (this.f139767c) {
            t10 = this.f139766b;
            if (t10 == t12) {
                C17631a aVar = this.f139765a;
                C17542s.g(aVar);
                t10 = aVar.invoke();
                this.f139766b = t10;
                this.f139765a = null;
            }
        }
        return t10;
    }

    public boolean isInitialized() {
        return this.f139766b != C16803J.f139786a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16794A(C17631a aVar, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
