package androidx.camera.core.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.l0  reason: case insensitive filesystem */
public final class C5033l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f16941a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Object, D> f16942b = new HashMap();

    public static D a(Object obj) {
        D d10;
        synchronized (f16941a) {
            d10 = f16942b.get(obj);
        }
        return d10 == null ? D.f16730a : d10;
    }
}
