package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class U {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Object> f144352a;

    public U(int i10) {
        this.f144352a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f144352a.add(obj);
    }

    public void b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f144352a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f144352a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f144352a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f144352a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f144352a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    public int c() {
        return this.f144352a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f144352a.toArray(objArr);
    }
}
