package com.sugarcube.app.base.data.user;

import XH.C16807N;
import com.sugarcube.app.base.data.user.DeviceRegistration;
import com.sugarcube.core.network.models.LoggedInUser;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.user.DeviceRegistration$2$1", f = "DeviceRegistration.kt", l = {48, 53}, m = "emit")
final class DeviceRegistration$2$1$emit$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceRegistration.AnonymousClass2.AnonymousClass1<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeviceRegistration$2$1$emit$1(DeviceRegistration.AnonymousClass2.AnonymousClass1<? super T> r12, C17164e<? super DeviceRegistration$2$1$emit$1> eVar) {
        super(eVar);
        this.this$0 = r12;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((LoggedInUser) null, (C17164e<? super C16807N>) this);
    }
}
