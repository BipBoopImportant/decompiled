package com.sugarcube.app.base.data.source;

import QJ.Q;
import XH.C16807N;
import XH.y;
import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)I"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.CompositionRepositorySource$clearCache$2", f = "CompositionRepositorySource.kt", l = {}, m = "invokeSuspend")
final class CompositionRepositorySource$clearCache$2 extends l implements p<Q, C17164e<? super Integer>, Object> {
    int label;
    final /* synthetic */ CompositionRepositorySource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionRepositorySource$clearCache$2(CompositionRepositorySource compositionRepositorySource, C17164e<? super CompositionRepositorySource$clearCache$2> eVar) {
        super(2, eVar);
        this.this$0 = compositionRepositorySource;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new CompositionRepositorySource$clearCache$2(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super Integer> eVar) {
        return ((CompositionRepositorySource$clearCache$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        C17187b.f();
        if (this.label == 0) {
            y.b(obj);
            this.this$0._allCompositions.postValue(new ArrayList());
            return b.e(Log.d(AnyKt.SUGARCUBE_TAG, "Clear all compositions in cache"));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
