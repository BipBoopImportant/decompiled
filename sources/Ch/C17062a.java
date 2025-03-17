package cH;

import mH.C17598a;
import mH.C17599b;

/* renamed from: cH.a  reason: case insensitive filesystem */
public final class C17062a {
    public static <T> T a(Object obj, Class<T> cls) {
        if (obj instanceof C17598a) {
            return cls.cast(obj);
        }
        if (obj instanceof C17599b) {
            return a(((C17599b) obj).g0(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), C17598a.class, C17599b.class}));
    }
}
