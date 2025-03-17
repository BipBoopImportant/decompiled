package com.sugarcube.app.base.data;

import XH.C16807N;
import com.sugarcube.app.base.data.SceneRepository;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.SceneRepository$2$2", f = "SceneRepository.kt", l = {159}, m = "emit")
final class SceneRepository$2$2$emit$1 extends d {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SceneRepository.AnonymousClass2.AnonymousClass2<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SceneRepository$2$2$emit$1(SceneRepository.AnonymousClass2.AnonymousClass2<? super T> r12, C17164e<? super SceneRepository$2$2$emit$1> eVar) {
        super(eVar);
        this.this$0 = r12;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(false, (C17164e<? super C16807N>) this);
    }
}
