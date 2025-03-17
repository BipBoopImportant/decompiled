package Ej;

import android.view.View;
import android.widget.ImageButton;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment;

public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProductInfoPageFragment f80712a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f80713b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ImageButton f80714c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f80715d;

    public /* synthetic */ z(ProductInfoPageFragment productInfoPageFragment, int i10, ImageButton imageButton, int i11) {
        this.f80712a = productInfoPageFragment;
        this.f80713b = i10;
        this.f80714c = imageButton;
        this.f80715d = i11;
    }

    public final void onClick(View view) {
        ProductInfoPageFragment.T2(this.f80712a, this.f80713b, this.f80714c, this.f80715d, view);
    }
}
