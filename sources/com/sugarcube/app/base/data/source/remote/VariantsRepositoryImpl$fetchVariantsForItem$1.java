package com.sugarcube.app.base.data.source.remote;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl", f = "VariantsRepositoryImpl.kt", l = {43, 44}, m = "fetchVariantsForItem-gIAlu-s")
final class VariantsRepositoryImpl$fetchVariantsForItem$1 extends d {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VariantsRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VariantsRepositoryImpl$fetchVariantsForItem$1(VariantsRepositoryImpl variantsRepositoryImpl, C17164e<? super VariantsRepositoryImpl$fetchVariantsForItem$1> eVar) {
        super(eVar);
        this.this$0 = variantsRepositoryImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r22 = this.this$0.m29fetchVariantsForItemgIAlus(0, this);
        return r22 == C17187b.f() ? r22 : x.a(r22);
    }
}
