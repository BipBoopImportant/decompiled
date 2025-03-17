package com.sugarcube.app.base.data.source.remote;

import dI.C17164e;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.source.remote.CompositionRemoteDataSourceImpl", f = "CompositionRemoteDataSourceImpl.kt", l = {109, 111, 112, 113, 120}, m = "fetchCompiledComposition")
final class CompositionRemoteDataSourceImpl$fetchCompiledComposition$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CompositionRemoteDataSourceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionRemoteDataSourceImpl$fetchCompiledComposition$1(CompositionRemoteDataSourceImpl compositionRemoteDataSourceImpl, C17164e<? super CompositionRemoteDataSourceImpl$fetchCompiledComposition$1> eVar) {
        super(eVar);
        this.this$0 = compositionRemoteDataSourceImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchCompiledComposition((UUID) null, this);
    }
}
