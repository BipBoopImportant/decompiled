package LL;

import java.util.ArrayList;
import java.util.Arrays;
import org.maplibre.android.style.layers.d;

/* renamed from: LL.a  reason: case insensitive filesystem */
public class C16031a {

    /* renamed from: a  reason: collision with root package name */
    private final String f136219a;

    /* renamed from: b  reason: collision with root package name */
    private final C16031a[] f136220b;

    /* renamed from: LL.a$a  reason: collision with other inner class name */
    public static class C3347a extends C16031a implements b {

        /* renamed from: c  reason: collision with root package name */
        protected Object f136221c;

        public C3347a(Object obj) {
            if (obj instanceof String) {
                obj = f((String) obj);
            } else if (obj instanceof Number) {
                obj = Float.valueOf(((Number) obj).floatValue());
            }
            this.f136221c = obj;
        }

        private static String f(String str) {
            return (str.length() > 1 && str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') ? str.substring(1, str.length() - 1) : str;
        }

        public Object a() {
            Object obj = this.f136221c;
            if (!(obj instanceof d)) {
                return obj instanceof C3347a ? ((C3347a) obj).a() : obj;
            }
            throw new IllegalArgumentException("PropertyValue are not allowed as an expression literal, use value instead.");
        }

        public Object[] e() {
            return new Object[]{"literal", this.f136221c};
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !C16031a.super.equals(obj)) {
                return false;
            }
            Object obj2 = this.f136221c;
            Object obj3 = ((C3347a) obj).f136221c;
            return obj2 != null ? obj2.equals(obj3) : obj3 == null;
        }

        public int hashCode() {
            int hashCode = C16031a.super.hashCode() * 31;
            Object obj = this.f136221c;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        public String toString() {
            Object obj = this.f136221c;
            if (!(obj instanceof String)) {
                return obj.toString();
            }
            return "\"" + this.f136221c + "\"";
        }
    }

    /* renamed from: LL.a$b */
    private interface b {
        Object a();
    }

    C16031a() {
        this.f136219a = null;
        this.f136220b = null;
    }

    public static C16031a b(C16031a aVar) {
        return new C16031a("get", aVar);
    }

    public static C16031a c(String str) {
        return b(d(str));
    }

    public static C16031a d(String str) {
        return new C3347a(str);
    }

    public Object[] e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f136219a);
        C16031a[] aVarArr = this.f136220b;
        if (aVarArr != null) {
            for (C16031a aVar : aVarArr) {
                if (aVar instanceof b) {
                    arrayList.add(((b) aVar).a());
                } else {
                    arrayList.add(aVar.e());
                }
            }
        }
        return arrayList.toArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C16031a)) {
            return false;
        }
        C16031a aVar = (C16031a) obj;
        String str = this.f136219a;
        if (str == null ? aVar.f136219a == null : str.equals(aVar.f136219a)) {
            return Arrays.deepEquals(this.f136220b, aVar.f136220b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f136219a;
        return ((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.f136220b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[\"");
        sb2.append(this.f136219a);
        sb2.append("\"");
        C16031a[] aVarArr = this.f136220b;
        if (aVarArr != null) {
            for (C16031a obj : aVarArr) {
                sb2.append(", ");
                sb2.append(obj.toString());
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public C16031a(String str, C16031a... aVarArr) {
        this.f136219a = str;
        this.f136220b = aVarArr;
    }
}
