package com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation;

import HJ.C15854t;
import androidx.lifecycle.U;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/i;", "", "<init>", "()V", "Landroidx/lifecycle/U;", "savedStateHandle", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/g;", "a", "(Landroidx/lifecycle/U;)Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/g;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {
    public final g a(U u10) {
        C17542s.j(u10, "savedStateHandle");
        String str = (String) u10.f("barcode");
        if (str != null && (!C15854t.v0(str))) {
            return new g.b(str);
        }
        Integer num = (Integer) u10.f("format");
        String str2 = (String) u10.f("rawValue");
        return (num == null || str2 == null || str2.length() <= 0) ? g.c.f91805a : new g.a(num.intValue(), str2);
    }
}
