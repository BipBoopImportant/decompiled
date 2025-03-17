package com.sugarcube.app.base.di;

import android.content.Context;
import com.sugarcube.app.base.data.database.ScenesDatabase;
import nH.C17624c;
import nH.C17627f;

public final class i implements C17624c<ScenesDatabase> {
    public static ScenesDatabase a(Context context) {
        return (ScenesDatabase) C17627f.d(AppModule.f123073a.k(context));
    }
}
