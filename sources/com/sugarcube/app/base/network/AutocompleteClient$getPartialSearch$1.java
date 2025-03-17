package com.sugarcube.app.base.network;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.network.AutocompleteClient", f = "AutocompleteClient.kt", l = {33}, m = "getPartialSearch")
final class AutocompleteClient$getPartialSearch$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AutocompleteClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AutocompleteClient$getPartialSearch$1(AutocompleteClient autocompleteClient, C17164e<? super AutocompleteClient$getPartialSearch$1> eVar) {
        super(eVar);
        this.this$0 = autocompleteClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPartialSearch((String) null, this);
    }
}
