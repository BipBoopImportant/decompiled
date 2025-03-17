package com.sugarcube.app.base.data.user;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.user.UserRepoImpl", f = "UserRepo.kt", l = {185, 200}, m = "fetchUserAndTokenFromApi")
final class UserRepoImpl$fetchUserAndTokenFromApi$1 extends d {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UserRepoImpl$fetchUserAndTokenFromApi$1(UserRepoImpl userRepoImpl, C17164e<? super UserRepoImpl$fetchUserAndTokenFromApi$1> eVar) {
        super(eVar);
        this.this$0 = userRepoImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchUserAndTokenFromApi((String) null, (String) null, this);
    }
}
