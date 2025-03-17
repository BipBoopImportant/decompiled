package com.sugarcube.app.base.data.user;

import com.sugarcube.core.network.models.LoggedInUser;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0004"}, d2 = {"isSameUserAs", "", "Lcom/sugarcube/core/network/models/LoggedInUser;", "otherUser", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UserRepoKt {
    /* access modifiers changed from: private */
    public static final boolean isSameUserAs(LoggedInUser loggedInUser, LoggedInUser loggedInUser2) {
        if (loggedInUser == null || loggedInUser2 == null) {
            return false;
        }
        return (loggedInUser.getWid() == loggedInUser2.getWid() || loggedInUser2.getWid() == -1) && C17542s.e(loggedInUser.getEmail(), loggedInUser2.getEmail()) && C17542s.e(loggedInUser.getServer(), loggedInUser2.getServer()) && C17542s.e(loggedInUser.getPartyUid(), loggedInUser2.getPartyUid());
    }
}
