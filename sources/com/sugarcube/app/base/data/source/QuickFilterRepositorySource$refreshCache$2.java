package com.sugarcube.app.base.data.source;

import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.source.QuickFilterRepositorySource$refreshCache$2", f = "QuickFilterRepositorySource.kt", l = {45}, m = "invokeSuspend")
final class QuickFilterRepositorySource$refreshCache$2 extends l implements p<Q, C17164e<? super Object>, Object> {
    int label;
    final /* synthetic */ QuickFilterRepositorySource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QuickFilterRepositorySource$refreshCache$2(QuickFilterRepositorySource quickFilterRepositorySource, C17164e<? super QuickFilterRepositorySource$refreshCache$2> eVar) {
        super(2, eVar);
        this.this$0 = quickFilterRepositorySource;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new QuickFilterRepositorySource$refreshCache$2(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<Object> eVar) {
        return ((QuickFilterRepositorySource$refreshCache$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            Log.d(AnyKt.SUGARCUBE_TAG, "QuickFilterRepositorySource::refreshCache");
            if (C17542s.e(this.this$0._isRefreshing.getValue(), b.a(true))) {
                return b.e(Log.d(AnyKt.SUGARCUBE_TAG, "Already refreshing, refreshCache ignored"));
            }
            Log.d(AnyKt.SUGARCUBE_TAG, "Starting refresh...");
            this.this$0._isRefreshing.postValue(b.a(true));
            QuickFilterRepositorySource quickFilterRepositorySource = this.this$0;
            this.label = 1;
            obj = quickFilterRepositorySource.fetch(this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        if (list != null) {
            this.this$0._allQuickFilters.postValue(C16877v.w1(list));
            int size = list.size();
            Log.d(AnyKt.SUGARCUBE_TAG, "Fetched all quick filters (" + size + " quick filters)");
        }
        this.this$0._isRefreshing.postValue(b.a(false));
        return C16807N.f139792a;
    }
}
