package T7;

import C7.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f40120a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f40121b = new HashMap();

    private static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f40122a;

        /* renamed from: b  reason: collision with root package name */
        final Class<R> f40123b;

        /* renamed from: c  reason: collision with root package name */
        final k<T, R> f40124c;

        public a(Class<T> cls, Class<R> cls2, k<T, R> kVar) {
            this.f40122a = cls;
            this.f40123b = cls2;
            this.f40124c = kVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f40122a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f40123b);
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> list;
        try {
            if (!this.f40120a.contains(str)) {
                this.f40120a.add(str);
            }
            list = this.f40121b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.f40121b.put(str, list);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return list;
    }

    public synchronized <T, R> void a(String str, k<T, R> kVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a(cls, cls2, kVar));
    }

    public synchronized <T, R> List<k<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f40120a) {
            List<a> list = this.f40121b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f40124c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f40120a) {
            List<a> list = this.f40121b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f40123b)) {
                        arrayList.add(aVar.f40123b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList<>(this.f40120a);
            this.f40120a.clear();
            for (String add : list) {
                this.f40120a.add(add);
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f40120a.add(str);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
