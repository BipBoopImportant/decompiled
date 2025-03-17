package XH;

import androidx.concurrent.futures.b;
import com.sugarcube.core.logger.DslKt;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u000fB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00118\u0002X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"LXH/z;", "T", "LXH/o;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(LnI/a;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "a", "LnI/a;", "", "b", "Ljava/lang/Object;", "_value", "c", "getFinal$annotations", "()V", "final", "getValue", "()Ljava/lang/Object;", "value", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z<T> implements C16824o<T>, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final a f139815d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<z<?>, Object> f139816e = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, DslKt.INDICATOR_BACKGROUND);

    /* renamed from: a  reason: collision with root package name */
    private volatile C17631a<? extends T> f139817a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f139818b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f139819c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Rd\u0010\u0007\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LXH/z$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "LXH/z;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public z(C17631a<? extends T> aVar) {
        C17542s.j(aVar, "initializer");
        this.f139817a = aVar;
        C16803J j10 = C16803J.f139786a;
        this.f139818b = j10;
        this.f139819c = j10;
    }

    public T getValue() {
        T t10 = this.f139818b;
        T t11 = C16803J.f139786a;
        if (t10 != t11) {
            return t10;
        }
        C17631a<? extends T> aVar = this.f139817a;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (b.a(f139816e, this, t11, invoke)) {
                this.f139817a = null;
                return invoke;
            }
        }
        return this.f139818b;
    }

    public boolean isInitialized() {
        return this.f139818b != C16803J.f139786a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
