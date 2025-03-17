package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.checkout.uicomponent.meta.UiComponentType;
import com.oppwa.mobile.connect.checkout.uicomponent.meta.UiComponentsConfig;
import java.util.function.Function;

public final /* synthetic */ class p2 implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UiComponentType f121286a;

    public /* synthetic */ p2(UiComponentType uiComponentType) {
        this.f121286a = uiComponentType;
    }

    public final Object apply(Object obj) {
        return ((UiComponentsConfig) obj).getUiComponentClassName(this.f121286a);
    }
}
