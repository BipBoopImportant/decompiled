package Ej;

import android.view.View;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment;

public final /* synthetic */ class h implements View.OnScrollChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProductInfoPageFragment f80695a;

    public /* synthetic */ h(ProductInfoPageFragment productInfoPageFragment) {
        this.f80695a = productInfoPageFragment;
    }

    public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
        ProductInfoPageFragment.z2(this.f80695a, view, i10, i11, i12, i13);
    }
}
