package com.contentsquare.android.api.bridge.telemetry;

import U8.a;
import XH.C16814e;
import a9.C6858j4;
import a9.C6935t2;
import android.app.Application;
import com.contentsquare.android.internal.core.telemetry.event.ApiUsageEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u000f\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0010\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/contentsquare/android/api/bridge/telemetry/TelemetryInterface;", "", "<init>", "()V", "T", "", "name", "value", "LXH/N;", "telemetryCollect", "(Ljava/lang/String;Ljava/lang/Object;)V", "telemetrySetXPFVersion", "(Ljava/lang/Object;)V", "telemetrySetXPFType", "setXPFType", "setXPFVersion", "setXPFBridgeVersion", "apiName", "collectApiCall", "(Ljava/lang/String;)V", "Landroid/app/Application;", "application", "notifyPAisStarted", "(Landroid/app/Application;)V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TelemetryInterface {
    public final void collectApiCall(String str) {
        C17542s.j(str, "apiName");
        C6858j4 j10 = a.f40370a.j();
        if (j10 != null) {
            String str2 = "custom." + str;
            C17542s.j(str2, "name");
            j10.f42624e.b(new ApiUsageEvent(str2, 1));
        }
    }

    public final void notifyPAisStarted(Application application) {
        C17542s.j(application, "application");
        a.f40370a.l(application);
    }

    public final <T> void setXPFBridgeVersion(T t10) {
        C17542s.j(t10, "value");
        C6858j4 j10 = a.f40370a.j();
        if (j10 != null) {
            j10.d("xpf_bridge_version", t10);
        }
        C6935t2.f42868c = t10.toString();
    }

    public final <T> void setXPFType(T t10) {
        C17542s.j(t10, "value");
        C6858j4 j10 = a.f40370a.j();
        if (j10 != null) {
            j10.d("xpf_type", t10);
        }
        C6935t2.f42866a = t10.toString();
    }

    public final <T> void setXPFVersion(T t10) {
        C17542s.j(t10, "value");
        C6858j4 j10 = a.f40370a.j();
        if (j10 != null) {
            j10.d("xpf_version", t10);
        }
        C6935t2.f42867b = t10.toString();
    }

    public final <T> void telemetryCollect(String str, T t10) {
        C17542s.j(str, "name");
        C17542s.j(t10, "value");
        C6858j4 j10 = a.f40370a.j();
        if (j10 != null) {
            j10.d("custom." + str, t10);
        }
    }

    @C16814e
    public final <T> void telemetrySetXPFType(T t10) {
        C17542s.j(t10, "value");
        C6858j4 j10 = a.f40370a.j();
        if (j10 != null) {
            j10.d("xpf_type", t10);
        }
    }

    @C16814e
    public final <T> void telemetrySetXPFVersion(T t10) {
        C17542s.j(t10, "value");
        C6858j4 j10 = a.f40370a.j();
        if (j10 != null) {
            j10.d("xpf_version", t10);
        }
    }
}
