package Ej;

import android.view.View;
import android.widget.ImageButton;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment;

/* renamed from: Ej.c  reason: case insensitive filesystem */
public final /* synthetic */ class C10708c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProductInfoPageFragment f80686a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f80687b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ImageButton f80688c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f80689d;

    public /* synthetic */ C10708c(ProductInfoPageFragment productInfoPageFragment, int i10, ImageButton imageButton, int i11) {
        this.f80686a = productInfoPageFragment;
        this.f80687b = i10;
        this.f80688c = imageButton;
        this.f80689d = i11;
    }

    public final void onClick(View view) {
        ProductInfoPageFragment.U2(this.f80686a, this.f80687b, this.f80688c, this.f80689d, view);
    }
}
