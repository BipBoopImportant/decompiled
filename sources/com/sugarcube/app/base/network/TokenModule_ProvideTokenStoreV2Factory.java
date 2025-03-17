package com.sugarcube.app.base.network;

import WH.C16729a;
import java.util.Optional;
import nH.C17624c;
import nH.C17627f;

public final class TokenModule_ProvideTokenStoreV2Factory implements C17624c<TokenStoreV2> {
    private final C16729a<Optional<ITokenStore>> iTokenStoreV1OptionalProvider;
    private final C16729a<Optional<ITokenStoreV2>> iTokenStoreV2OptionalProvider;

    public TokenModule_ProvideTokenStoreV2Factory(C16729a<Optional<ITokenStore>> aVar, C16729a<Optional<ITokenStoreV2>> aVar2) {
        this.iTokenStoreV1OptionalProvider = aVar;
        this.iTokenStoreV2OptionalProvider = aVar2;
    }

    public static TokenModule_ProvideTokenStoreV2Factory create(C16729a<Optional<ITokenStore>> aVar, C16729a<Optional<ITokenStoreV2>> aVar2) {
        return new TokenModule_ProvideTokenStoreV2Factory(aVar, aVar2);
    }

    public static TokenStoreV2 provideTokenStoreV2(Optional<ITokenStore> optional, Optional<ITokenStoreV2> optional2) {
        return (TokenStoreV2) C17627f.d(TokenModule.INSTANCE.provideTokenStoreV2(optional, optional2));
    }

    public TokenStoreV2 get() {
        return provideTokenStoreV2(this.iTokenStoreV1OptionalProvider.get(), this.iTokenStoreV2OptionalProvider.get());
    }
}
