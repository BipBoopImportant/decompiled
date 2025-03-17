package KJ;

import java.util.Map;
import kotlin.Metadata;
import oI.C17697e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u000bJ1\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LKJ/g;", "K", "V", "LKJ/d;", "", "m", "putAll", "(Ljava/util/Map;)LKJ/g;", "LKJ/g$a;", "e", "()LKJ/g$a;", "a", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KJ.g  reason: case insensitive filesystem */
public interface C15991g<K, V> extends C15988d<K, V> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LKJ/g$a;", "K", "V", "", "LKJ/g;", "g", "()LKJ/g;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KJ.g$a */
    public interface a<K, V> extends Map<K, V>, C17697e {
        C15991g<K, V> g();
    }

    a<K, V> e();

    C15991g<K, V> putAll(Map<? extends K, ? extends V> map);
}
