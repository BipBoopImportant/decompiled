package h6;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00060\u0003j\u0002`\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lh6/b;", "P", "T", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "Lkotlin/Function1;", "initializer", "<init>", "(LnI/l;)V", "parameter", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "LnI/l;", "b", "Ljava/lang/Object;", "_value", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: h6.b  reason: case insensitive filesystem */
public final class C7933b<P, T> {

    /* renamed from: a  reason: collision with root package name */
    private C17642l<? super P, ? extends T> f51650a;

    /* renamed from: b  reason: collision with root package name */
    private Object f51651b = C7935d.f51652a;

    public C7933b(C17642l<? super P, ? extends T> lVar) {
        this.f51650a = lVar;
    }

    public final T a(P p10) {
        T t10;
        T t11 = this.f51651b;
        T t12 = C7935d.f51652a;
        if (t11 != t12) {
            return t11;
        }
        synchronized (this) {
            t10 = this.f51651b;
            if (t10 == t12) {
                C17642l lVar = this.f51650a;
                C17542s.g(lVar);
                t10 = lVar.invoke(p10);
                this.f51651b = t10;
                this.f51650a = null;
            }
        }
        return t10;
    }
}
