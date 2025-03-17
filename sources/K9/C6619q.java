package K9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: K9.q  reason: case insensitive filesystem */
public final class C6619q {

    /* renamed from: K9.q$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f37902a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final Object f37903b;

        /* synthetic */ a(Object obj, e0 e0Var) {
            C6620s.l(obj);
            this.f37903b = obj;
        }

        public a a(String str, Object obj) {
            C6620s.l(str);
            String valueOf = String.valueOf(obj);
            this.f37902a.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f37903b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f37902a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f37902a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String next : keySet) {
            if (!b(bundle.get(next), bundle2.get(next))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static int c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a d(Object obj) {
        return new a(obj, (e0) null);
    }
}
