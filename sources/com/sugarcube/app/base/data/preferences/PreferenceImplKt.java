package com.sugarcube.app.base.data.preferences;

import QJ.Q;
import R2.h;
import S2.b;
import V2.a;
import W2.f;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17642l;
import qI.C17786c;
import uI.C18064m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008FX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroid/content/Context;", "LR2/h;", "LW2/f;", "dataStore$delegate", "LqI/c;", "getDataStore", "(Landroid/content/Context;)LR2/h;", "dataStore", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PreferenceImplKt {
    static final /* synthetic */ C18064m<Object>[] $$delegatedProperties = {P.h(new G(PreferenceImplKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final C17786c dataStore$delegate = a.b("preferences_storage", (b) null, (C17642l) null, (Q) null, 14, (Object) null);

    public static final h<f> getDataStore(Context context) {
        C17542s.j(context, "<this>");
        return (h) dataStore$delegate.a(context, $$delegatedProperties[0]);
    }
}
