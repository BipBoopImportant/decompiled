package com.google.android.gms.measurement;

import K9.C6620s;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C7282e1;
import com.google.android.gms.measurement.internal.P2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sa.D;
import sa.W;

@Deprecated
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    private static volatile AppMeasurement f49508b;

    /* renamed from: a  reason: collision with root package name */
    private final a f49509a;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            C6620s.l(bundle);
            Class cls = String.class;
            this.mAppId = (String) D.a(bundle, "app_id", cls, null);
            this.mOrigin = (String) D.a(bundle, "origin", cls, null);
            this.mName = (String) D.a(bundle, "name", cls, null);
            this.mValue = D.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) D.a(bundle, "trigger_event_name", cls, null);
            Class cls2 = Long.class;
            this.mTriggerTimeout = ((Long) D.a(bundle, "trigger_timeout", cls2, 0L)).longValue();
            this.mTimedOutEventName = (String) D.a(bundle, "timed_out_event_name", cls, null);
            Class cls3 = Bundle.class;
            this.mTimedOutEventParams = (Bundle) D.a(bundle, "timed_out_event_params", cls3, null);
            this.mTriggeredEventName = (String) D.a(bundle, "triggered_event_name", cls, null);
            this.mTriggeredEventParams = (Bundle) D.a(bundle, "triggered_event_params", cls3, null);
            this.mTimeToLive = ((Long) D.a(bundle, "time_to_live", cls2, 0L)).longValue();
            this.mExpiredEventName = (String) D.a(bundle, "expired_event_name", cls, null);
            this.mExpiredEventParams = (Bundle) D.a(bundle, "expired_event_params", cls3, null);
            this.mActive = ((Boolean) D.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) D.a(bundle, "creation_timestamp", cls2, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) D.a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        }
    }

    private static abstract class a implements W {
        private a() {
        }
    }

    private AppMeasurement(P2 p22) {
        this.f49509a = new b(p22);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f49508b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f49508b == null) {
                        W b10 = b(context, (Bundle) null);
                        if (b10 != null) {
                            f49508b = new AppMeasurement(b10);
                        } else {
                            f49508b = new AppMeasurement(P2.a(context, new C7282e1(0, 0, true, (String) null, (String) null, (String) null, (Bundle) null, (String) null), (Long) null));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f49508b;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static sa.W b(android.content.Context r4, android.os.Bundle r5) {
        /*
            r5 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r0 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r1 = "getScionFrontendApiImplementation"
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{  }
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch:{  }
            java.lang.Object r4 = r0.invoke(r5, r4)     // Catch:{  }
            sa.W r4 = (sa.W) r4     // Catch:{  }
            return r4
        L_0x001c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.b(android.content.Context, android.os.Bundle):sa.W");
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return a(context, (String) null, (String) null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f49509a.zzb(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f49509a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f49509a.j(str);
    }

    @Keep
    public long generateEventId() {
        return this.f49509a.i();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f49509a.e();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> c10 = this.f49509a.c(str, str2);
        ArrayList arrayList = new ArrayList(c10 == null ? 0 : c10.size());
        for (Bundle conditionalUserProperty : c10) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f49509a.zzh();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f49509a.b();
    }

    @Keep
    public String getGmpAppId() {
        return this.f49509a.f();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f49509a.zza(str);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f49509a.g(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f49509a.d(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C6620s.l(conditionalUserProperty);
        a aVar = this.f49509a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            D.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.o(bundle);
    }

    private AppMeasurement(W w10) {
        this.f49509a = new a(w10);
    }
}
