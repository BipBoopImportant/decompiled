package com.sugarcube.app.base.data.feature;

import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper", f = "PreferencesDataStoreWrapper.kt", l = {80}, m = "readDataStore")
final class PreferencesDataStoreWrapper$readDataStore$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PreferencesDataStoreWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreferencesDataStoreWrapper$readDataStore$1(PreferencesDataStoreWrapper preferencesDataStoreWrapper, C17164e<? super PreferencesDataStoreWrapper$readDataStore$1> eVar) {
        super(eVar);
        this.this$0 = preferencesDataStoreWrapper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readDataStore((List<? extends ConfigItem<?>>) null, this);
    }
}
