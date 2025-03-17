package com.sugarcube.app.base.data.user;

import com.sugarcube.core.network.models.LoggedInUser;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.user.DeviceRegistration", f = "DeviceRegistration.kt", l = {63, 71, 78}, m = "registerDevice")
final class DeviceRegistration$registerDevice$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceRegistration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeviceRegistration$registerDevice$1(DeviceRegistration deviceRegistration, C17164e<? super DeviceRegistration$registerDevice$1> eVar) {
        super(eVar);
        this.this$0 = deviceRegistration;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.registerDevice((LoggedInUser) null, this);
    }
}
