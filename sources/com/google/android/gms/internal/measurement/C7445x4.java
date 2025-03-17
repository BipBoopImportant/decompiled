package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x4  reason: case insensitive filesystem */
public class C7445x4 {

    /* renamed from: b  reason: collision with root package name */
    private static volatile C7445x4 f49139b;

    /* renamed from: c  reason: collision with root package name */
    static final C7445x4 f49140c = new C7445x4(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, L4.d<?, ?>> f49141a;

    /* renamed from: com.google.android.gms.internal.measurement.x4$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f49142a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49143b;

        a(Object obj, int i10) {
            this.f49142a = obj;
            this.f49143b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f49142a == aVar.f49142a && this.f49143b == aVar.f49143b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f49142a) * 65535) + this.f49143b;
        }
    }

    C7445x4() {
        this.f49141a = new HashMap();
    }

    public static C7445x4 a() {
        C7445x4 x4Var = f49139b;
        if (x4Var != null) {
            return x4Var;
        }
        synchronized (C7445x4.class) {
            try {
                C7445x4 x4Var2 = f49139b;
                if (x4Var2 != null) {
                    return x4Var2;
                }
                C7445x4 b10 = K4.b(C7445x4.class);
                f49139b = b10;
                return b10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <ContainingType extends C7406s5> L4.d<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return this.f49141a.get(new a(containingtype, i10));
    }

    private C7445x4(boolean z10) {
        this.f49141a = Collections.emptyMap();
    }
}
