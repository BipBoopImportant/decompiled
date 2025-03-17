package com.sugarcube.app.base.data.user;

import TJ.C16519P;
import XH.C16807N;
import com.sugarcube.core.network.models.LoggedInUser;
import com.sugarcube.core.network.models.MobileDevice;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/app/base/data/user/UserRepo;", "", "", "acknowledgePrivacyPolicy", "(LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/MobileDevice;", "mobileDevice", "LXH/N;", "updateMobileDevice", "(Lcom/sugarcube/core/network/models/MobileDevice;LdI/e;)Ljava/lang/Object;", "LTJ/P;", "Lcom/sugarcube/core/network/models/LoggedInUser;", "getUser", "()LTJ/P;", "user", "isLoggedIn", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UserRepo {
    Object acknowledgePrivacyPolicy(C17164e<? super Boolean> eVar);

    C16519P<LoggedInUser> getUser();

    C16519P<Boolean> isLoggedIn();

    Object updateMobileDevice(MobileDevice mobileDevice, C17164e<? super C16807N> eVar);
}
