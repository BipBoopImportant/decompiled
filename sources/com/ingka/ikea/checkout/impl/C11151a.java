package com.ingka.ikea.checkout.impl;

import Mn.b;
import Mn.c;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/checkout/impl/a;", "LMn/b;", "<init>", "()V", "Landroid/content/Context;", "context", "LMn/c;", "checkoutData", "Landroid/content/Intent;", "a", "(Landroid/content/Context;LMn/c;)Landroid/content/Intent;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.ingka.ikea.checkout.impl.a  reason: case insensitive filesystem */
public final class C11151a implements b {
    public Intent a(Context context, c cVar) {
        C17542s.j(context, "context");
        C17542s.j(cVar, "checkoutData");
        return OnlineCheckoutActivity.f94301O0.a(context, cVar);
    }
}
