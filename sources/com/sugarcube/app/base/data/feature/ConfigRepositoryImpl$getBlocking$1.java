package com.sugarcube.app.base.data.feature;

import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import QJ.Q;
import QJ.k1;
import QJ.m1;
import XH.C16807N;
import XH.y;
import android.util.Log;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", "T", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.feature.ConfigRepositoryImpl$getBlocking$1", f = "ConfigRepository.kt", l = {283}, m = "invokeSuspend")
final class ConfigRepositoryImpl$getBlocking$1 extends l implements p<Q, C17164e<? super T>, Object> {
    final /* synthetic */ ConfigItem<T> $configItem;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ ConfigRepositoryImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", "T", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.data.feature.ConfigRepositoryImpl$getBlocking$1$1", f = "ConfigRepository.kt", l = {284}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.data.feature.ConfigRepositoryImpl$getBlocking$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p<Q, C17164e<? super T>, Object> {
        int label;

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new AnonymousClass1(configRepositoryImpl, configItem, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super T> eVar) {
            return ((AnonymousClass1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.label;
            if (i10 == 0) {
                y.b(obj);
                ConfigRepositoryImpl configRepositoryImpl = configRepositoryImpl;
                ConfigItem<T> configItem = configItem;
                this.label = 1;
                obj = configRepositoryImpl.currentValue(configItem, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object currentValue = ((ConfigState) obj).getCurrentValue();
            C17542s.h(currentValue, "null cannot be cast to non-null type T of com.sugarcube.app.base.data.feature.ConfigRepositoryImpl.getBlocking");
            return currentValue;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigRepositoryImpl$getBlocking$1(ConfigItem<? extends T> configItem, ConfigRepositoryImpl configRepositoryImpl, C17164e<? super ConfigRepositoryImpl$getBlocking$1> eVar) {
        super(2, eVar);
        this.$configItem = configItem;
        this.this$0 = configRepositoryImpl;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new ConfigRepositoryImpl$getBlocking$1(this.$configItem, this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super T> eVar) {
        return ((ConfigRepositoryImpl$getBlocking$1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            C15906b.a aVar = C15906b.f135496b;
            long s10 = C15908d.s(500, C15909e.MILLISECONDS);
            final ConfigRepositoryImpl configRepositoryImpl = this.this$0;
            final ConfigItem<T> configItem = this.$configItem;
            AnonymousClass1 r12 = new AnonymousClass1((C17164e<? super AnonymousClass1>) null);
            this.L$0 = aVar;
            this.I$0 = 500;
            this.label = 1;
            Object d10 = m1.d(s10, r12, this);
            return d10 == f10 ? f10 : d10;
        } else if (i10 == 1) {
            C15906b.a aVar2 = (C15906b.a) this.L$0;
            try {
                y.b(obj);
                return obj;
            } catch (k1 unused) {
                ConfigItem<T> configItem2 = this.$configItem;
                Log.w("ConfigRepoImpl", "using default value for " + configItem2);
                T defaultValue = this.$configItem.getDefaultValue();
                C17542s.h(defaultValue, "null cannot be cast to non-null type T of com.sugarcube.app.base.data.feature.ConfigRepositoryImpl.getBlocking");
                return defaultValue;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
