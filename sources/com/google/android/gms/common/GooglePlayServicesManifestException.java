package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    private final int f47971a;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f47971a = i10;
    }
}
