package com.sugarcube.app.base.external.interactions;

import TJ.C16519P;
import WE.C13796a;
import android.app.Activity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "", "LTJ/P;", "LWE/a;", "getUserData", "()LTJ/P;", "Landroid/app/Activity;", "activity", "LXH/N;", "navigateLogin", "(Landroid/app/Activity;)V", "navigateSignup", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AccountInteractions {
    C16519P<C13796a> getUserData();

    void navigateLogin(Activity activity);

    void navigateSignup(Activity activity);
}
