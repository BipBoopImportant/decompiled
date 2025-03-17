package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/sugarcube/core/network/models/ProductBuyingOptionModeAvailabilityJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/ProductBuyingOptionModeAvailability;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/ProductBuyingOptionModeAvailability;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/ProductBuyingOptionModeAvailability;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "Lcom/sugarcube/core/network/models/ProductBuyingOptionModeProbability;", "nullableProductBuyingOptionModeProbabilityAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductBuyingOptionModeAvailabilityJsonAdapter extends f<ProductBuyingOptionModeAvailability> {
    private volatile Constructor<ProductBuyingOptionModeAvailability> constructorRef;
    private final f<ProductBuyingOptionModeProbability> nullableProductBuyingOptionModeProbabilityAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;

    public ProductBuyingOptionModeAvailabilityJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("probability", "updateDateTime");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<ProductBuyingOptionModeProbability> f10 = tVar.f(ProductBuyingOptionModeProbability.class, g0.d(), "probability");
        C17542s.i(f10, "adapter(...)");
        this.nullableProductBuyingOptionModeProbabilityAdapter = f10;
        f<String> f11 = tVar.f(String.class, g0.d(), "updateDateTime");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(57);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ProductBuyingOptionModeAvailability");
        sb2.append(')');
        return sb2.toString();
    }

    public ProductBuyingOptionModeAvailability fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        ProductBuyingOptionModeProbability productBuyingOptionModeProbability = null;
        String str = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                productBuyingOptionModeProbability = this.nullableProductBuyingOptionModeProbabilityAdapter.fromJson(kVar);
                i10 &= -2;
            } else if (s10 == 1) {
                str = this.nullableStringAdapter.fromJson(kVar);
                i10 &= -3;
            }
        }
        kVar.f();
        if (i10 == -4) {
            return new ProductBuyingOptionModeAvailability(productBuyingOptionModeProbability, str);
        }
        Constructor<ProductBuyingOptionModeAvailability> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProductBuyingOptionModeAvailability.class.getDeclaredConstructor(new Class[]{ProductBuyingOptionModeProbability.class, String.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        ProductBuyingOptionModeAvailability newInstance = constructor.newInstance(new Object[]{productBuyingOptionModeProbability, str, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, ProductBuyingOptionModeAvailability productBuyingOptionModeAvailability) {
        C17542s.j(qVar, "writer");
        if (productBuyingOptionModeAvailability != null) {
            qVar.d();
            qVar.n("probability");
            this.nullableProductBuyingOptionModeProbabilityAdapter.toJson(qVar, productBuyingOptionModeAvailability.getProbability());
            qVar.n("updateDateTime");
            this.nullableStringAdapter.toJson(qVar, productBuyingOptionModeAvailability.getUpdateDateTime());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
