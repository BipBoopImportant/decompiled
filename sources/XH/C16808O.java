package XH;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LXH/O;", "T", "LXH/o;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(LnI/a;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "a", "LnI/a;", "", "b", "Ljava/lang/Object;", "_value", "getValue", "()Ljava/lang/Object;", "value", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.O  reason: case insensitive filesystem */
public final class C16808O<T> implements C16824o<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private C17631a<? extends T> f139793a;

    /* renamed from: b  reason: collision with root package name */
    private Object f139794b = C16803J.f139786a;

    public C16808O(C17631a<? extends T> aVar) {
        C17542s.j(aVar, "initializer");
        this.f139793a = aVar;
    }

    public T getValue() {
        if (this.f139794b == C16803J.f139786a) {
            C17631a<? extends T> aVar = this.f139793a;
            C17542s.g(aVar);
            this.f139794b = aVar.invoke();
            this.f139793a = null;
        }
        return this.f139794b;
    }

    public boolean isInitialized() {
        return this.f139794b != C16803J.f139786a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
