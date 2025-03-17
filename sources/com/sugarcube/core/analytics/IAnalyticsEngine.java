package com.sugarcube.core.analytics;

import com.sugarcube.core.analytics.entities.LoggedInUser;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/core/analytics/IAnalyticsEngine;", "", "", "trackAlways", "()Z", "Lcom/sugarcube/core/analytics/entities/LoggedInUser;", "user", "isNew", "LXH/N;", "associateUser", "(Lcom/sugarcube/core/analytics/entities/LoggedInUser;Z)V", "disassociateUser", "()V", "", "eventName", "", "properties", "track", "(Ljava/lang/String;Ljava/util/Map;)V", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IAnalyticsEngine {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void associateUser(IAnalyticsEngine iAnalyticsEngine, LoggedInUser loggedInUser, boolean z10) {
            C17542s.j(loggedInUser, "user");
        }

        public static void disassociateUser(IAnalyticsEngine iAnalyticsEngine) {
        }

        public static boolean trackAlways(IAnalyticsEngine iAnalyticsEngine) {
            return false;
        }
    }

    void associateUser(LoggedInUser loggedInUser, boolean z10);

    void disassociateUser();

    void track(String str, Map<String, ? extends Object> map);

    boolean trackAlways();
}
