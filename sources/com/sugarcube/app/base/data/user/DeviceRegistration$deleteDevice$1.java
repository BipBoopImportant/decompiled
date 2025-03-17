package com.sugarcube.app.base.data.user;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.user.DeviceRegistration", f = "DeviceRegistration.kt", l = {91}, m = "deleteDevice")
final class DeviceRegistration$deleteDevice$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceRegistration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeviceRegistration$deleteDevice$1(DeviceRegistration deviceRegistration, C17164e<? super DeviceRegistration$deleteDevice$1> eVar) {
        super(eVar);
        this.this$0 = deviceRegistration;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteDevice((String) null, this);
    }
}
