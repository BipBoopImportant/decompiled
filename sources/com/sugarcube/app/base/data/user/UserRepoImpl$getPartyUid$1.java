package com.sugarcube.app.base.data.user;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.user.UserRepoImpl", f = "UserRepo.kt", l = {239}, m = "getPartyUid")
final class UserRepoImpl$getPartyUid$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UserRepoImpl$getPartyUid$1(UserRepoImpl userRepoImpl, C17164e<? super UserRepoImpl$getPartyUid$1> eVar) {
        super(eVar);
        this.this$0 = userRepoImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPartyUid(this);
    }
}
