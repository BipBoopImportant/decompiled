package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import java.util.List;
import java.util.function.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Parcel f121884a;

    public /* synthetic */ p(Parcel parcel) {
        this.f121884a = parcel;
    }

    public final void accept(Object obj) {
        this.f121884a.writeList((List) obj);
    }
}
