package com.sugarcube.app.base.data.user;

import WE.C13796a;
import XH.C16807N;
import XH.v;
import com.sugarcube.app.base.data.user.UserRepoImpl;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.user.UserRepoImpl$1$2", f = "UserRepo.kt", l = {78, 79, 85, 89, 90, 93, 95, 96, 99, 100, 102, 103}, m = "emit")
final class UserRepoImpl$1$2$emit$1 extends d {
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
    final /* synthetic */ UserRepoImpl.AnonymousClass1.AnonymousClass2<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UserRepoImpl$1$2$emit$1(UserRepoImpl.AnonymousClass1.AnonymousClass2<? super T> r12, C17164e<? super UserRepoImpl$1$2$emit$1> eVar) {
        super(eVar);
        this.this$0 = r12;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((v<String, C13796a>) null, (C17164e<? super C16807N>) this);
    }
}
