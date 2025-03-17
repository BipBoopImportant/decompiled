package JH;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17697e;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00028\u00018\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"LJH/p;", "Key", "Value", "", "key", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "getValue", "(Ljava/lang/Object;)V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class p<Key, Value> implements Map.Entry<Key, Value>, C17697e.a {

    /* renamed from: a  reason: collision with root package name */
    private final Key f135728a;

    /* renamed from: b  reason: collision with root package name */
    private Value f135729b;

    public p(Key key, Value value) {
        this.f135728a = key;
        this.f135729b = value;
    }

    public void b(Value value) {
        this.f135729b = value;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C17542s.e(entry.getKey(), getKey()) && C17542s.e(entry.getValue(), getValue());
    }

    public Key getKey() {
        return this.f135728a;
    }

    public Value getValue() {
        return this.f135729b;
    }

    public int hashCode() {
        Object key = getKey();
        C17542s.g(key);
        Object value = getValue();
        C17542s.g(value);
        return key.hashCode() + 527 + value.hashCode();
    }

    public Value setValue(Value value) {
        b(value);
        return getValue();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
