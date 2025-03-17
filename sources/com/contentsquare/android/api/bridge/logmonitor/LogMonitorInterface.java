package com.contentsquare.android.api.bridge.logmonitor;

import S8.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJK\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/contentsquare/android/api/bridge/logmonitor/LogMonitorInterface;", "", "<init>", "()V", "", "description", "", "additionalContext", "LXH/N;", "warn", "(Ljava/lang/String;Ljava/util/Map;)V", "errorType", "errorMessage", "stacktrace", "error", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "crash", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LogMonitorInterface {
    public static /* synthetic */ void crash$default(LogMonitorInterface logMonitorInterface, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            map = null;
        }
        logMonitorInterface.crash(str, str2, map);
    }

    public static /* synthetic */ void error$default(LogMonitorInterface logMonitorInterface, String str, String str2, String str3, String str4, Map map, int i10, Object obj) {
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        String str7 = (i10 & 8) != 0 ? "" : str4;
        if ((i10 & 16) != 0) {
            map = null;
        }
        logMonitorInterface.error(str, str5, str6, str7, map);
    }

    public static /* synthetic */ void warn$default(LogMonitorInterface logMonitorInterface, String str, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        logMonitorInterface.warn(str, map);
    }

    public final void crash(String str, String str2, Map<String, ? extends Object> map) {
        C17542s.j(str, "description");
        C17542s.j(str2, "stacktrace");
        a.f39924a.a(str, str2, map);
    }

    public final void error(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        C17542s.j(str, "description");
        C17542s.j(str2, "errorType");
        C17542s.j(str3, "errorMessage");
        C17542s.j(str4, "stacktrace");
        a.f39924a.c(str, str2, str3, str4, map);
    }

    public final void warn(String str, Map<String, ? extends Object> map) {
        C17542s.j(str, "description");
        a.f39924a.e(str, map);
    }
}
