package com.sugarcube.decorate_engine;

import XH.C16824o;
import XH.C16825p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngineSupport;", "", "()V", "Companion", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DecorateEngineSupport {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final C16824o<Boolean> isDeviceSupported$delegate = C16825p.b(DecorateEngineSupport$Companion$isDeviceSupported$2.INSTANCE);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0007\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngineSupport$Companion;", "", "<init>", "()V", "", "isDeviceSupported$delegate", "LXH/o;", "isDeviceSupported", "()Z", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isDeviceSupported() {
            return ((Boolean) DecorateEngineSupport.isDeviceSupported$delegate.getValue()).booleanValue();
        }

        private Companion() {
        }
    }
}
