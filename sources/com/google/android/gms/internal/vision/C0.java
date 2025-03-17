package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class C0 {

    /* renamed from: b  reason: collision with root package name */
    private static volatile C0 f49168b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile C0 f49169c;

    /* renamed from: d  reason: collision with root package name */
    private static final C0 f49170d = new C0(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, Q0.d<?, ?>> f49171a;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f49172a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49173b;

        a(Object obj, int i10) {
            this.f49172a = obj;
            this.f49173b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f49172a == aVar.f49172a && this.f49173b == aVar.f49173b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f49172a) * 65535) + this.f49173b;
        }
    }

    C0() {
        this.f49171a = new HashMap();
    }

    public static C0 b() {
        C0 c02 = f49168b;
        if (c02 == null) {
            synchronized (C0.class) {
                try {
                    c02 = f49168b;
                    if (c02 == null) {
                        c02 = f49170d;
                        f49168b = c02;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c02;
    }

    public static C0 c() {
        C0 c02 = f49169c;
        if (c02 != null) {
            return c02;
        }
        synchronized (C0.class) {
            try {
                C0 c03 = f49169c;
                if (c03 != null) {
                    return c03;
                }
                C0 b10 = N0.b(C0.class);
                f49169c = b10;
                return b10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <ContainingType extends A1> Q0.d<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return this.f49171a.get(new a(containingtype, i10));
    }

    private C0(boolean z10) {
        this.f49171a = Collections.emptyMap();
    }
}
