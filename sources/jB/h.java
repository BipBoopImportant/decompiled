package jb;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public final class h {

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f74787a;

        /* renamed from: b  reason: collision with root package name */
        private final a f74788b;

        /* renamed from: c  reason: collision with root package name */
        private a f74789c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f74790d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f74791e;

        static class a {

            /* renamed from: a  reason: collision with root package name */
            String f74792a;

            /* renamed from: b  reason: collision with root package name */
            Object f74793b;

            /* renamed from: c  reason: collision with root package name */
            a f74794c;

            a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.f74789c.f74794c = aVar;
            this.f74789c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f74793b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof k ? !((k) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        public String toString() {
            boolean z10 = this.f74790d;
            boolean z11 = this.f74791e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f74787a);
            sb2.append('{');
            String str = "";
            for (a aVar = this.f74788b.f74794c; aVar != null; aVar = aVar.f74794c) {
                Object obj = aVar.f74793b;
                if (obj == null) {
                    if (z10) {
                    }
                } else if (z11 && d(obj)) {
                }
                sb2.append(str);
                String str2 = aVar.f74792a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb2.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append(deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb2.append('}');
            return sb2.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.f74788b = aVar;
            this.f74789c = aVar;
            this.f74790d = false;
            this.f74791e = false;
            this.f74787a = (String) l.j(str);
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
