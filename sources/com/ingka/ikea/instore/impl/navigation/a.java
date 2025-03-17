package com.ingka.ikea.instore.impl.navigation;

import C4.j;
import Ht.h;
import com.ingka.ikea.instore.impl.navigation.InstoreRoutes$StorePage;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import rw.b;
import x4.C8951o;
import x4.I;
import x4.v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/instore/impl/navigation/a;", "LZs/a;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "Lx4/o;", "navController", "LXH/N;", "b", "(Lx4/o;)V", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Zs.a {
    public String a() {
        String uri = InstoreRoutes$StorePage.a.b(InstoreRoutes$StorePage.Companion, h.OPEN_STORE_PAGE, (String) null, 2, (Object) null).toString();
        C17542s.i(uri, "toString(...)");
        return uri;
    }

    public void b(C8951o oVar) {
        C17542s.j(oVar, "navController");
        int g10 = j.g(InstoreRoutes$StorePage.Companion.serializer());
        if (C8951o.A(oVar, oVar.L(), g10, true, (v) null, 4, (Object) null) == null) {
            throw new IllegalArgumentException(("Destination with route " + P.b(InstoreRoutes$StorePage.class).f() + " cannot be found in navigation graph " + oVar.L()).toString());
        } else if (!oVar.m0(g10, false, false)) {
            C8951o.f0(oVar, new InstoreRoutes$StorePage((String) null, (String) null, 3, (DefaultConstructorMarker) null), b.a(oVar).a(), (I.a) null, 4, (Object) null);
        }
    }
}
