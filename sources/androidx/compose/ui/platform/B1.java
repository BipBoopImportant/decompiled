package androidx.compose.ui.platform;

import W0.b;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/B1;", "T", "", "<init>", "()V", "LXH/N;", "a", "element", "c", "(Ljava/lang/Object;)V", "b", "()Ljava/lang/Object;", "LW0/b;", "Ljava/lang/ref/Reference;", "LW0/b;", "values", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class B1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b<Reference<T>> f19154a = new b<>(new Reference[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<T> f19155b = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> poll;
        do {
            poll = this.f19155b.poll();
            if (poll != null) {
                this.f19154a.y(poll);
                continue;
            }
        } while (poll != null);
    }

    public final T b() {
        a();
        while (this.f19154a.v()) {
            b<Reference<T>> bVar = this.f19154a;
            T t10 = bVar.B(bVar.r() - 1).get();
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public final void c(T t10) {
        a();
        this.f19154a.b(new WeakReference(t10, this.f19155b));
    }
}
