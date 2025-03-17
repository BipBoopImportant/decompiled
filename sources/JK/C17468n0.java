package jK;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\f"}, d2 = {"LjK/n0;", "T", "", "<init>", "()V", "Lkotlin/Function0;", "factory", "a", "(LnI/a;)Ljava/lang/Object;", "Ljava/lang/ref/SoftReference;", "Ljava/lang/ref/SoftReference;", "reference", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.n0  reason: case insensitive filesystem */
final class C17468n0<T> {

    /* renamed from: a  reason: collision with root package name */
    public volatile SoftReference<T> f144141a = new SoftReference<>((Object) null);

    public final synchronized T a(C17631a<? extends T> aVar) {
        C17542s.j(aVar, "factory");
        T t10 = this.f144141a.get();
        if (t10 != null) {
            return t10;
        }
        T invoke = aVar.invoke();
        this.f144141a = new SoftReference<>(invoke);
        return invoke;
    }
}
