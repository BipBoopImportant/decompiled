package v0;

import E1.n0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lv0/v;", "LE1/n0;", "Lv0/r;", "factory", "<init>", "(Lv0/r;)V", "LE1/n0$a;", "slotIds", "LXH/N;", "a", "(LE1/n0$a;)V", "", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lv0/r;", "", "", "Ljava/util/Map;", "countPerType", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class v implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final r f30937a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Object, Integer> f30938b = new LinkedHashMap();

    public v(r rVar) {
        this.f30937a = rVar;
    }

    public void a(n0.a aVar) {
        this.f30938b.clear();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object c10 = this.f30937a.c(it.next());
            Integer num = this.f30938b.get(c10);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                this.f30938b.put(c10, Integer.valueOf(intValue + 1));
            }
        }
    }

    public boolean b(Object obj, Object obj2) {
        return C17542s.e(this.f30937a.c(obj), this.f30937a.c(obj2));
    }
}
