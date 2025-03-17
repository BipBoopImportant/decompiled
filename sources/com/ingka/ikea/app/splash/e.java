package com.ingka.ikea.app.splash;

import android.net.Uri;
import android.view.View;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ApplinkErrorDialog f92423a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Uri f92424b;

    public /* synthetic */ e(ApplinkErrorDialog applinkErrorDialog, Uri uri) {
        this.f92423a = applinkErrorDialog;
        this.f92424b = uri;
    }

    public final void onClick(View view) {
        ApplinkErrorDialog.A0(this.f92423a, this.f92424b, view);
    }
}
