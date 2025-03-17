package Xe;

import Ae.r;
import XH.C16796C;
import YH.X;
import androidx.lifecycle.U;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LXe/g;", "LAe/r;", "<init>", "()V", "", "", "Lkotlin/Function1;", "Landroidx/lifecycle/U;", "a", "()Ljava/util/Map;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements r {
    /* access modifiers changed from: private */
    public static final String h(U u10) {
        C17542s.j(u10, "it");
        return "About";
    }

    /* access modifiers changed from: private */
    public static final String i(U u10) {
        C17542s.j(u10, "it");
        return "Policies";
    }

    /* access modifiers changed from: private */
    public static final String j(U u10) {
        C17542s.j(u10, "it");
        return "Help";
    }

    /* access modifiers changed from: private */
    public static final String k(U u10) {
        C17542s.j(u10, "it");
        return "DataPreferences";
    }

    /* access modifiers changed from: private */
    public static final String l(U u10) {
        C17542s.j(u10, "it");
        return "OpenSourceDisclaimers";
    }

    /* access modifiers changed from: private */
    public static final String m(U u10) {
        C17542s.j(u10, "it");
        return "LoginSignupPromotionBottomSheet";
    }

    public Map<String, C17642l<U, String>> a() {
        return X.m(C16796C.a("about", new a()), C16796C.a("policies", new b()), C16796C.a("help", new c()), C16796C.a("data_preferences", new d()), C16796C.a("open_source_disclaimer", new e()), C16796C.a("login_sign_up_promotion?promotion_mode={promotion_mode}", new f()));
    }
}
