package com.sugarcube.app.base.data.source;

import dI.C17164e;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.source.CompositionRepository", f = "CompositionRepository.kt", l = {44, 45, 46}, m = "deleteComposition")
final class CompositionRepository$deleteComposition$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CompositionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionRepository$deleteComposition$1(CompositionRepository compositionRepository, C17164e<? super CompositionRepository$deleteComposition$1> eVar) {
        super(eVar);
        this.this$0 = compositionRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteComposition((UUID) null, this);
    }
}
