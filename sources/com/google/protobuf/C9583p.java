package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.p  reason: case insensitive filesystem */
public class C9583p {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f69363b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile C9583p f69364c;

    /* renamed from: d  reason: collision with root package name */
    static final C9583p f69365d = new C9583p(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, GeneratedMessageLite.e<?, ?>> f69366a;

    /* renamed from: com.google.protobuf.p$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f69367a;

        /* renamed from: b  reason: collision with root package name */
        private final int f69368b;

        a(Object obj, int i10) {
            this.f69367a = obj;
            this.f69368b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f69367a == aVar.f69367a && this.f69368b == aVar.f69368b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f69367a) * 65535) + this.f69368b;
        }
    }

    C9583p() {
        this.f69366a = new HashMap();
    }

    public static C9583p b() {
        if (!f69363b) {
            return f69365d;
        }
        C9583p pVar = f69364c;
        if (pVar == null) {
            synchronized (C9583p.class) {
                try {
                    pVar = f69364c;
                    if (pVar == null) {
                        pVar = C9582o.a();
                        f69364c = pVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return pVar;
    }

    public <ContainingType extends S> GeneratedMessageLite.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return this.f69366a.get(new a(containingtype, i10));
    }

    C9583p(boolean z10) {
        this.f69366a = Collections.emptyMap();
    }
}
