package com.ingka.ikea.app.productinformationpage.ui.sections;

import Oo.b;
import XH.C16824o;
import XH.C16825p;
import Xh.f;
import Yh.c;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/ui/sections/GoodToKnowFragment;", "Lcom/ingka/ikea/app/productinformationpage/ui/sections/SectionBaseFragment;", "<init>", "()V", "", "H0", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LkK/c;", "Y", "LkK/c;", "N0", "()LkK/c;", "setJson", "(LkK/c;)V", "json", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "Z", "LXH/o;", "O0", "()Lcom/ingka/ikea/core/model/product/ProductLarge;", "safeArgs", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GoodToKnowFragment extends b {

    /* renamed from: Y  reason: collision with root package name */
    public C17514c f72118Y;

    /* renamed from: Z  reason: collision with root package name */
    private final C16824o f72119Z = C16825p.b(new f(this));

    private final ProductLarge O0() {
        return (ProductLarge) this.f72119Z.getValue();
    }

    /* access modifiers changed from: private */
    public static final ProductLarge P0(GoodToKnowFragment goodToKnowFragment) {
        String string = goodToKnowFragment.requireArguments().getString("productLarge");
        if (string == null) {
            return null;
        }
        C17514c N02 = goodToKnowFragment.N0();
        N02.a();
        return (ProductLarge) N02.c(ProductLarge.Companion.serializer(), string);
    }

    /* access modifiers changed from: protected */
    public int H0() {
        return b.f84371F3;
    }

    public final C17514c N0() {
        C17514c cVar = this.f72118Y;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z(FeatureVariable.JSON_TYPE);
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = G0().f63241d;
        ProductLarge O02 = O0();
        recyclerView.setAdapter(O02 != null ? new c(O02) : null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
    }
}
