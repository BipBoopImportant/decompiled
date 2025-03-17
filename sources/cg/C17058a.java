package cG;

import android.widget.PopupWindow;
import com.sugarcube.decorate.v1.internal.v1.tooltip.DecorateToolbarTooltipObject;

/* renamed from: cG.a  reason: case insensitive filesystem */
public final /* synthetic */ class C17058a implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DecorateToolbarTooltipObject f141224a;

    public /* synthetic */ C17058a(DecorateToolbarTooltipObject decorateToolbarTooltipObject) {
        this.f141224a = decorateToolbarTooltipObject;
    }

    public final void onDismiss() {
        DecorateToolbarTooltipObject.j(this.f141224a);
    }
}
