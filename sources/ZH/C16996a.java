package ZH;

import YH.C16866j;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"LZH/a;", "", "E", "K", "V", "LYH/j;", "<init>", "()V", "element", "", "b", "(Ljava/util/Map$Entry;)Z", "i", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZH.a  reason: case insensitive filesystem */
public abstract class C16996a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C16866j<E> {
    public final boolean b(E e10) {
        C17542s.j(e10, "element");
        return i(e10);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return b((Map.Entry) obj);
    }

    public abstract boolean i(Map.Entry<? extends K, ? extends V> entry);

    public abstract /* bridge */ boolean k(Map.Entry<?, ?> entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return k((Map.Entry) obj);
    }
}
