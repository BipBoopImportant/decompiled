package kotlin.jvm.internal;

import XH.C16818i;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nI.C17631a;
import nI.C17632b;
import nI.C17633c;
import nI.C17634d;
import nI.C17635e;
import nI.C17636f;
import nI.C17637g;
import nI.C17638h;
import nI.C17639i;
import nI.C17640j;
import nI.C17641k;
import nI.C17642l;
import nI.C17643m;
import nI.C17644n;
import nI.C17645o;
import nI.p;
import nI.q;
import nI.r;
import nI.s;
import nI.t;
import nI.u;
import nI.v;
import nI.w;
import oI.C17693a;
import oI.C17694b;
import oI.C17695c;
import oI.C17696d;
import oI.C17697e;
import oI.C17698f;

public class W {
    public static Collection a(Object obj) {
        if ((obj instanceof C17693a) && !(obj instanceof C17694b)) {
            v(obj, "kotlin.collections.MutableCollection");
        }
        return h(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof C17693a) && !(obj instanceof C17695c)) {
            v(obj, "kotlin.collections.MutableIterable");
        }
        return i(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof C17693a) && !(obj instanceof C17696d)) {
            v(obj, "kotlin.collections.MutableList");
        }
        return j(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof C17693a) && !(obj instanceof C17697e)) {
            v(obj, "kotlin.collections.MutableMap");
        }
        return k(obj);
    }

    public static Map.Entry e(Object obj) {
        if ((obj instanceof C17693a) && !(obj instanceof C17697e.a)) {
            v(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return l(obj);
    }

    public static Set f(Object obj) {
        if ((obj instanceof C17693a) && !(obj instanceof C17698f)) {
            v(obj, "kotlin.collections.MutableSet");
        }
        return m(obj);
    }

    public static Object g(Object obj, int i10) {
        if (obj != null && !o(obj, i10)) {
            v(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection h(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static Iterable i(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static List j(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static Map k(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static Map.Entry l(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static Set m(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static int n(Object obj) {
        if (obj instanceof C17538n) {
            return ((C17538n) obj).getArity();
        }
        if (obj instanceof C17631a) {
            return 0;
        }
        if (obj instanceof C17642l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof C17632b) {
            return 10;
        }
        if (obj instanceof C17633c) {
            return 11;
        }
        if (obj instanceof C17634d) {
            return 12;
        }
        if (obj instanceof C17635e) {
            return 13;
        }
        if (obj instanceof C17636f) {
            return 14;
        }
        if (obj instanceof C17637g) {
            return 15;
        }
        if (obj instanceof C17638h) {
            return 16;
        }
        if (obj instanceof C17639i) {
            return 17;
        }
        if (obj instanceof C17640j) {
            return 18;
        }
        if (obj instanceof C17641k) {
            return 19;
        }
        if (obj instanceof C17643m) {
            return 20;
        }
        if (obj instanceof C17644n) {
            return 21;
        }
        return obj instanceof C17645o ? 22 : -1;
    }

    public static boolean o(Object obj, int i10) {
        return (obj instanceof C16818i) && n(obj) == i10;
    }

    public static boolean p(Object obj) {
        return (obj instanceof List) && (!(obj instanceof C17693a) || (obj instanceof C17696d));
    }

    public static boolean q(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof C17693a) || (obj instanceof C17697e));
    }

    public static boolean r(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof C17693a) || (obj instanceof C17697e.a));
    }

    public static boolean s(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof C17693a) || (obj instanceof C17698f));
    }

    private static <T extends Throwable> T t(T t10) {
        return C17542s.q(t10, W.class.getName());
    }

    public static ClassCastException u(ClassCastException classCastException) {
        throw ((ClassCastException) t(classCastException));
    }

    public static void v(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        w(name + " cannot be cast to " + str);
    }

    public static void w(String str) {
        throw u(new ClassCastException(str));
    }
}
