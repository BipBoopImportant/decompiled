package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C9541y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.p  reason: case insensitive filesystem */
public class C9533p {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f68072b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile C9533p f68073c;

    /* renamed from: d  reason: collision with root package name */
    static final C9533p f68074d = new C9533p(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, C9541y.e<?, ?>> f68075a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f68076a;

        /* renamed from: b  reason: collision with root package name */
        private final int f68077b;

        a(Object obj, int i10) {
            this.f68076a = obj;
            this.f68077b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f68076a == aVar.f68076a && this.f68077b == aVar.f68077b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f68076a) * 65535) + this.f68077b;
        }
    }

    C9533p() {
        this.f68075a = new HashMap();
    }

    public static C9533p b() {
        C9533p pVar = f68073c;
        if (pVar == null) {
            synchronized (C9533p.class) {
                try {
                    pVar = f68073c;
                    if (pVar == null) {
                        pVar = f68072b ? C9532o.a() : f68074d;
                        f68073c = pVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return pVar;
    }

    public <ContainingType extends S> C9541y.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return this.f68075a.get(new a(containingtype, i10));
    }

    C9533p(boolean z10) {
        this.f68075a = Collections.emptyMap();
    }
}
