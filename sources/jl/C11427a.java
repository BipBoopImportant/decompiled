package jl;

import android.view.View;
import com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton;

/* renamed from: jl.a  reason: case insensitive filesystem */
public final /* synthetic */ class C11427a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoadingMaterialButton f98582a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f98583b;

    public /* synthetic */ C11427a(LoadingMaterialButton loadingMaterialButton, View.OnClickListener onClickListener) {
        this.f98582a = loadingMaterialButton;
        this.f98583b = onClickListener;
    }

    public final void onClick(View view) {
        LoadingMaterialButton.m(this.f98582a, this.f98583b, view);
    }
}
