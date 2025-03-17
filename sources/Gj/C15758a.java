package GJ;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR.\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \n*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LGJ/a;", "T", "LGJ/h;", "sequence", "<init>", "(LGJ/h;)V", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "sequenceRef", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GJ.a  reason: case insensitive filesystem */
public final class C15758a<T> implements C15765h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<C15765h<T>> f134722a;

    public C15758a(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "sequence");
        this.f134722a = new AtomicReference<>(hVar);
    }

    public Iterator<T> iterator() {
        C15765h andSet = this.f134722a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
