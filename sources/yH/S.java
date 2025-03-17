package YH;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005H\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LYH/S;", "T", "", "LYH/Q;", "Lkotlin/Function0;", "", "iteratorFactory", "<init>", "(LnI/a;)V", "iterator", "()Ljava/util/Iterator;", "a", "LnI/a;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class S<T> implements Iterable<Q<? extends T>>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<Iterator<T>> f140423a;

    public S(C17631a<? extends Iterator<? extends T>> aVar) {
        C17542s.j(aVar, "iteratorFactory");
        this.f140423a = aVar;
    }

    public Iterator<Q<T>> iterator() {
        return new T(this.f140423a.invoke());
    }
}
