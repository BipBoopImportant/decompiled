package com.sugarcube.app.base.data.feature;

import W2.c;
import W2.h;
import XH.C16807N;
import XH.y;
import YH.X;
import android.util.Log;
import com.sugarcube.app.base.data.feature.ConfigItem;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.feature.PreferencesDataStoreWrapper$writeToDataStore$2", f = "PreferencesDataStoreWrapper.kt", l = {}, m = "invokeSuspend")
final class PreferencesDataStoreWrapper$writeToDataStore$2 extends l implements p<c, C17164e<? super C16807N>, Object> {
    final /* synthetic */ Map<String, Object> $valueMap;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreferencesDataStoreWrapper$writeToDataStore$2(Map<String, ? extends Object> map, C17164e<? super PreferencesDataStoreWrapper$writeToDataStore$2> eVar) {
        super(2, eVar);
        this.$valueMap = map;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        PreferencesDataStoreWrapper$writeToDataStore$2 preferencesDataStoreWrapper$writeToDataStore$2 = new PreferencesDataStoreWrapper$writeToDataStore$2(this.$valueMap, eVar);
        preferencesDataStoreWrapper$writeToDataStore$2.L$0 = obj;
        return preferencesDataStoreWrapper$writeToDataStore$2;
    }

    public final Object invoke(c cVar, C17164e<? super C16807N> eVar) {
        return ((PreferencesDataStoreWrapper$writeToDataStore$2) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        C17187b.f();
        if (this.label == 0) {
            y.b(obj);
            c cVar = (c) this.L$0;
            cVar.f();
            for (Map.Entry next : X.x(this.$valueMap).entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value instanceof Boolean) {
                    cVar.j(h.a("bool:" + str), value);
                } else if (value instanceof Double) {
                    cVar.j(h.c("double:" + str), value);
                } else if (value instanceof String) {
                    cVar.j(h.g("string:" + str), value);
                } else if (value instanceof Integer) {
                    cVar.j(h.e("int:" + str), b.e(((Integer) value).intValue()));
                } else if (value instanceof ConfigItem.ObjectListValue) {
                    cVar.j(h.g("objectList:" + str), ((ConfigItem.ObjectListValue) value).getName());
                } else {
                    b.e(Log.w("DataStore", "unable to persist type of " + str + " = " + value));
                }
            }
            return C16807N.f139792a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
