package com.sugarcube.app.base.data.preferences;

import TJ.C16533h;
import W2.g;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "LW2/f;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.preferences.PreferenceImpl$getPreference$1", f = "PreferenceImpl.kt", l = {59}, m = "invokeSuspend")
final class PreferenceImpl$getPreference$1 extends l implements q<C16533h<? super W2.f>, Throwable, C17164e<? super C16807N>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    PreferenceImpl$getPreference$1(C17164e<? super PreferenceImpl$getPreference$1> eVar) {
        super(3, eVar);
    }

    public final Object invoke(C16533h<? super W2.f> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
        PreferenceImpl$getPreference$1 preferenceImpl$getPreference$1 = new PreferenceImpl$getPreference$1(eVar);
        preferenceImpl$getPreference$1.L$0 = hVar;
        preferenceImpl$getPreference$1.L$1 = th2;
        return preferenceImpl$getPreference$1.invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            C16533h hVar = (C16533h) this.L$0;
            Throwable th2 = (Throwable) this.L$1;
            if (th2 instanceof IOException) {
                W2.f a10 = g.a();
                this.L$0 = hVar;
                this.L$1 = th2;
                this.label = 1;
                if (hVar.emit(a10, this) == f10) {
                    return f10;
                }
            } else {
                throw th2;
            }
        } else if (i10 == 1) {
            Throwable th3 = (Throwable) this.L$1;
            C16533h hVar2 = (C16533h) this.L$0;
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C16807N.f139792a;
    }
}
