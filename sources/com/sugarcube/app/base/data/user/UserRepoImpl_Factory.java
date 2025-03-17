package com.sugarcube.app.base.data.user;

import OE.C13309a;
import WH.C16729a;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.app.base.network.TokenStoreV2;
import nH.C17624c;

public final class UserRepoImpl_Factory implements C17624c<UserRepoImpl> {
    private final C16729a<AccountInteractions> accountInteractionsProvider;
    private final C16729a<C13309a> appEnvironmentProvider;
    private final C16729a<NetworkClient> networkClientProvider;
    private final C16729a<TokenStoreV2> tokenStoreProvider;

    public UserRepoImpl_Factory(C16729a<C13309a> aVar, C16729a<TokenStoreV2> aVar2, C16729a<NetworkClient> aVar3, C16729a<AccountInteractions> aVar4) {
        this.appEnvironmentProvider = aVar;
        this.tokenStoreProvider = aVar2;
        this.networkClientProvider = aVar3;
        this.accountInteractionsProvider = aVar4;
    }

    public static UserRepoImpl_Factory create(C16729a<C13309a> aVar, C16729a<TokenStoreV2> aVar2, C16729a<NetworkClient> aVar3, C16729a<AccountInteractions> aVar4) {
        return new UserRepoImpl_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static UserRepoImpl newInstance(C13309a aVar, TokenStoreV2 tokenStoreV2, NetworkClient networkClient, AccountInteractions accountInteractions) {
        return new UserRepoImpl(aVar, tokenStoreV2, networkClient, accountInteractions);
    }

    public UserRepoImpl get() {
        return newInstance(this.appEnvironmentProvider.get(), this.tokenStoreProvider.get(), this.networkClientProvider.get(), this.accountInteractionsProvider.get());
    }
}
