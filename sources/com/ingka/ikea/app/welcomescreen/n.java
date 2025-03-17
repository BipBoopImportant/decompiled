package com.ingka.ikea.app.welcomescreen;

import Ae.p;
import Ht.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import uI.C18055d;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LAe/p$a;", "", "route", "LAe/p;", "c", "(LAe/p$a;Ljava/lang/String;)LAe/p;", "LuI/d;", "d", "(LAe/p$a;LuI/d;)LAe/p;", "IKEA_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {
    /* access modifiers changed from: private */
    public static final p c(p.a aVar, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1380604278:
                    if (str.equals("browse")) {
                        return p.BROWSE;
                    }
                    break;
                case -1340241962:
                    if (str.equals("membership")) {
                        return p.PROFILE;
                    }
                    break;
                case 3046176:
                    if (str.equals("cart")) {
                        return p.CART;
                    }
                    break;
                case 273184745:
                    if (str.equals("discover")) {
                        return p.DISCOVER;
                    }
                    break;
            }
        }
        return p.BROWSE;
    }

    /* access modifiers changed from: private */
    public static final p d(p.a aVar, C18055d<?> dVar) {
        return C17542s.e(dVar, P.b(f.class)) ? p.INSTORE : p.BROWSE;
    }
}
