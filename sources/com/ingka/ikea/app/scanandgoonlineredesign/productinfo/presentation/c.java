package com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation;

import Ej.G;
import XH.t;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.b;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/c;", "", "<init>", "()V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/e;", "loading", "LEj/G;", "productInfo", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/b;", "a", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/e;LEj/G;)Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {
    public final b a(e eVar, G g10) {
        Boolean bool;
        if (g10 != null) {
            bool = Boolean.valueOf(g10.c().a().a() && g10.d().a());
        } else {
            bool = null;
        }
        if (C17542s.e(eVar, e.a.f91765a)) {
            return new b(new b.C2023b(true, true), new b.c(false, false, 3, (DefaultConstructorMarker) null), false);
        }
        if (C17542s.e(eVar, e.C2024e.f91769a)) {
            return new b(new b.C2023b(false, false, 3, (DefaultConstructorMarker) null), new b.c(false, false, 3, (DefaultConstructorMarker) null), false);
        }
        if (C17542s.e(eVar, e.f.f91770a)) {
            return new b(new b.C2023b(false, false, 3, (DefaultConstructorMarker) null), new b.c(false, false, 3, (DefaultConstructorMarker) null), false);
        }
        if (eVar instanceof e.d) {
            return new b(new b.C2023b(true, true), (b.a) null, false, 2, (DefaultConstructorMarker) null);
        }
        if (C17542s.e(eVar, e.c.f91767a)) {
            return new b(new b.C2023b(true, true), (b.a) null, false, 2, (DefaultConstructorMarker) null);
        }
        if (C17542s.e(eVar, e.b.f91766a)) {
            return new b(new b.C2023b(false, false, 3, (DefaultConstructorMarker) null), new b.c(true, true), true);
        }
        if (eVar == null) {
            return new b(new b.C2023b(bool != null ? bool.booleanValue() : true, false), new b.c(true, false), true);
        }
        throw new t();
    }
}
