package cG;

import android.widget.PopupWindow;
import com.sugarcube.decorate.v1.internal.v1.tooltip.DecorateToolbarTooltipObject;
import kotlin.jvm.internal.M;

/* renamed from: cG.b  reason: case insensitive filesystem */
public final /* synthetic */ class C17059b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PopupWindow f141225a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DecorateToolbarTooltipObject f141226b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ M f141227c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ M f141228d;

    public /* synthetic */ C17059b(PopupWindow popupWindow, DecorateToolbarTooltipObject decorateToolbarTooltipObject, M m10, M m11) {
        this.f141225a = popupWindow;
        this.f141226b = decorateToolbarTooltipObject;
        this.f141227c = m10;
        this.f141228d = m11;
    }

    public final void run() {
        DecorateToolbarTooltipObject.i(this.f141225a, this.f141226b, this.f141227c, this.f141228d);
    }
}
