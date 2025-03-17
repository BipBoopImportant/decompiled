package KJ;

import KJ.C15987c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import oI.C17694b;
import oI.C17696d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000eJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LKJ/f;", "E", "LKJ/c;", "", "element", "add", "(Ljava/lang/Object;)LKJ/f;", "", "elements", "addAll", "(Ljava/util/Collection;)LKJ/f;", "LKJ/f$a;", "e", "()LKJ/f$a;", "a", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KJ.f  reason: case insensitive filesystem */
public interface C15990f<E> extends C15987c<E>, C15986b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LKJ/f$a;", "E", "", "", "LKJ/f;", "g", "()LKJ/f;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KJ.f$a */
    public interface a<E> extends List<E>, Collection, C17694b, C17696d {
        C15990f<E> g();
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KJ.f$b */
    public static final class b {
        public static <E> C15987c<E> a(C15990f<? extends E> fVar, int i10, int i11) {
            return C15987c.a.a(fVar, i10, i11);
        }
    }

    C15990f<E> add(E e10);

    C15990f<E> addAll(Collection<? extends E> collection);

    a<E> e();
}
