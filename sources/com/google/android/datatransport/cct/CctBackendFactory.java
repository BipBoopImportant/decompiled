package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import m9.C8567d;
import m9.h;
import m9.m;

@Keep
public class CctBackendFactory implements C8567d {
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
