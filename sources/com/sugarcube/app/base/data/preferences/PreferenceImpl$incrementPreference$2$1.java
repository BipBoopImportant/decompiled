package com.sugarcube.app.base.data.preferences;

import W2.c;
import W2.f;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "it", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.preferences.PreferenceImpl$incrementPreference$2$1", f = "PreferenceImpl.kt", l = {}, m = "invokeSuspend")
final class PreferenceImpl$incrementPreference$2$1 extends l implements p<c, C17164e<? super C16807N>, Object> {
    final /* synthetic */ int $current;
    final /* synthetic */ f.a<Integer> $preferenceKey;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreferenceImpl$incrementPreference$2$1(f.a<Integer> aVar, int i10, C17164e<? super PreferenceImpl$incrementPreference$2$1> eVar) {
        super(2, eVar);
        this.$preferenceKey = aVar;
        this.$current = i10;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        PreferenceImpl$incrementPreference$2$1 preferenceImpl$incrementPreference$2$1 = new PreferenceImpl$incrementPreference$2$1(this.$preferenceKey, this.$current, eVar);
        preferenceImpl$incrementPreference$2$1.L$0 = obj;
        return preferenceImpl$incrementPreference$2$1;
    }

    public final Object invoke(c cVar, C17164e<? super C16807N> eVar) {
        return ((PreferenceImpl$incrementPreference$2$1) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        C17187b.f();
        if (this.label == 0) {
            y.b(obj);
            ((c) this.L$0).j(this.$preferenceKey, b.e(this.$current + 1));
            return C16807N.f139792a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
