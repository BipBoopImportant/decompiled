package com.sugarcube.decorate_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class DecorateEngine$Companion$isDeviceSupported$2 extends C17544u implements C17631a<Boolean> {
    public static final DecorateEngine$Companion$isDeviceSupported$2 INSTANCE = new DecorateEngine$Companion$isDeviceSupported$2();

    DecorateEngine$Companion$isDeviceSupported$2() {
        super(0);
    }

    public final Boolean invoke() {
        return Boolean.valueOf(DecorateEngine.Companion.loadLib());
    }
}
