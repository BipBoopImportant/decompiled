package KJ;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import oI.C17694b;
import oI.C17698f;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000bJ#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LKJ/h;", "E", "LKJ/e;", "", "", "elements", "addAll", "(Ljava/util/Collection;)LKJ/h;", "LKJ/h$a;", "e", "()LKJ/h$a;", "a", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KJ.h  reason: case insensitive filesystem */
public interface C15992h<E> extends C15989e<E>, C15986b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LKJ/h$a;", "E", "", "", "LKJ/h;", "g", "()LKJ/h;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KJ.h$a */
    public interface a<E> extends Set<E>, Collection, C17694b, C17698f {
        C15992h<E> g();
    }

    C15992h<E> addAll(Collection<? extends E> collection);

    a<E> e();
}
