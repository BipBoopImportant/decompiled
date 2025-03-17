package ia;

import java.util.Iterator;
import java.util.Map;

final class U5 extends Q5 {

    /* renamed from: c  reason: collision with root package name */
    private final transient P5 f53432c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f53433d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final transient int f53434e;

    U5(P5 p52, Object[] objArr, int i10, int i11) {
        this.f53432c = p52;
        this.f53433d = objArr;
        this.f53434e = i11;
    }

    /* access modifiers changed from: package-private */
    public final int b(Object[] objArr, int i10) {
        return m().b(objArr, 0);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f53432c.get(key));
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return m().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final N5 p() {
        return new T5(this);
    }

    public final int size() {
        return this.f53434e;
    }
}
