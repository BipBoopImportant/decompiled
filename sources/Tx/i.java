package tx;

import android.view.View;
import com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton;
import com.ingka.ikea.productconfigurator.impl.content.ProductConfiguratorFragment;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoadingMaterialButton f131228a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProductConfiguratorFragment f131229b;

    public /* synthetic */ i(LoadingMaterialButton loadingMaterialButton, ProductConfiguratorFragment productConfiguratorFragment) {
        this.f131228a = loadingMaterialButton;
        this.f131229b = productConfiguratorFragment;
    }

    public final void onClick(View view) {
        ProductConfiguratorFragment.i1(this.f131228a, this.f131229b, view);
    }
}
