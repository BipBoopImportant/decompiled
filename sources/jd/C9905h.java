package jd;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljd/h;", "E", "Ljd/c;", "", "", "delegate", "<init>", "(Ljava/util/Collection;)V", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: jd.h  reason: case insensitive filesystem */
public final class C9905h<E> extends C9900c<E> implements Set<E>, C17693a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9905h(Collection<? extends E> collection) {
        super(collection);
        C17542s.j(collection, "delegate");
    }
}
