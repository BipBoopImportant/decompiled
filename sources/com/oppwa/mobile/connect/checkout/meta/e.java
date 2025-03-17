package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import java.util.function.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Parcel f121458a;

    public /* synthetic */ e(Parcel parcel) {
        this.f121458a = parcel;
    }

    public final void accept(Object obj) {
        this.f121458a.writeParcelable((GooglePaySubmitType) obj, 0);
    }
}
