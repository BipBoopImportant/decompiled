package JH;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR,\u0010\u0011\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f8\u0014X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LJH/m;", "LJH/c;", "<init>", "()V", "", "T", "LJH/a;", "key", "Lkotlin/Function0;", "block", "b", "(LJH/a;LnI/a;)Ljava/lang/Object;", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "i", "()Ljava/util/concurrent/ConcurrentHashMap;", "map", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m extends C15956c {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<C15954a<?>, Object> f135721a = new ConcurrentHashMap<>();

    public <T> T b(C15954a<T> aVar, C17631a<? extends T> aVar2) {
        C17542s.j(aVar, "key");
        C17542s.j(aVar2, "block");
        T t10 = h().get(aVar);
        if (t10 != null) {
            return t10;
        }
        T invoke = aVar2.invoke();
        T putIfAbsent = h().putIfAbsent(aVar, invoke);
        if (putIfAbsent != null) {
            invoke = putIfAbsent;
        }
        C17542s.h(invoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return invoke;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public ConcurrentHashMap<C15954a<?>, Object> h() {
        return this.f135721a;
    }
}
