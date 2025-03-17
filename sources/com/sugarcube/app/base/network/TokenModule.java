package com.sugarcube.app.base.network;

import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/app/base/network/TokenModule;", "", "<init>", "()V", "provideTokenStoreV2", "Lcom/sugarcube/app/base/network/TokenStoreV2;", "iTokenStoreV1Optional", "Ljava/util/Optional;", "Lcom/sugarcube/app/base/network/ITokenStore;", "iTokenStoreV2Optional", "Lcom/sugarcube/app/base/network/ITokenStoreV2;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TokenModule {
    public static final int $stable = 0;
    public static final TokenModule INSTANCE = new TokenModule();

    private TokenModule() {
    }

    public final TokenStoreV2 provideTokenStoreV2(Optional<ITokenStore> optional, Optional<ITokenStoreV2> optional2) {
        C17542s.j(optional, "iTokenStoreV1Optional");
        C17542s.j(optional2, "iTokenStoreV2Optional");
        if (optional2.isPresent()) {
            Log.d(AnyKt.SUGARCUBE_TAG, "iTokenStoreV2Optional provided");
            ITokenStoreV2 iTokenStoreV2 = optional2.get();
            C17542s.g(iTokenStoreV2);
            return iTokenStoreV2;
        } else if (optional.isPresent()) {
            Log.d(AnyKt.SUGARCUBE_TAG, "ITokenStore v1 provided, creating wrapper");
            ITokenStore iTokenStore = optional.get();
            C17542s.i(iTokenStore, "get(...)");
            return new TokenModule$provideTokenStoreV2$1(iTokenStore);
        } else {
            throw new RuntimeException("Host must provide either ITokenStore or ITokenStoreV2");
        }
    }
}
