package com.sugarcube.app.base.data.feature;

import QJ.Q;
import XH.C16807N;
import XH.v;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.feature.ConfigRepositoryImpl$override$2", f = "ConfigRepository.kt", l = {310, 311}, m = "invokeSuspend")
final class ConfigRepositoryImpl$override$2 extends l implements p<Q, C17164e<? super C16807N>, Object> {
    final /* synthetic */ ConfigItem<T> $configItem;
    final /* synthetic */ T $newValue;
    Object L$0;
    int label;
    final /* synthetic */ ConfigRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigRepositoryImpl$override$2(ConfigItem<? extends T> configItem, T t10, ConfigRepositoryImpl configRepositoryImpl, C17164e<? super ConfigRepositoryImpl$override$2> eVar) {
        super(2, eVar);
        this.$configItem = configItem;
        this.$newValue = t10;
        this.this$0 = configRepositoryImpl;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new ConfigRepositoryImpl$override$2(this.$configItem, this.$newValue, this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
        return ((ConfigRepositoryImpl$override$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            str = this.$configItem.getMeta().getLocalKey();
            if (this.$newValue == null) {
                this.this$0.overriddenValues.remove(str);
            } else {
                this.this$0.overriddenValues.put(str, this.$newValue);
            }
            this.this$0.updateEnabledFeature((v<String, Boolean>) null);
            ConfigRepositoryImpl configRepositoryImpl = this.this$0;
            ConfigItem<T> configItem = this.$configItem;
            this.L$0 = str;
            this.label = 1;
            if (configRepositoryImpl.persistData(configItem, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            str = (String) this.L$0;
            y.b(obj);
        } else if (i10 == 2) {
            String str2 = (String) this.L$0;
            y.b(obj);
            return C16807N.f139792a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ConfigRepositoryImpl configRepositoryImpl2 = this.this$0;
        ConfigItem<T> configItem2 = this.$configItem;
        this.L$0 = str;
        this.label = 2;
        if (configRepositoryImpl2.emitCurrentValue(configItem2, this) == f10) {
            return f10;
        }
        return C16807N.f139792a;
    }
}
