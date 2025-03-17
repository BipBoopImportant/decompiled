package com.google.android.gms.internal.measurement;

public final class u7 implements r7 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f49091a;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        e10.d("measurement.client.sessions.background_sessions_enabled", true);
        f49091a = e10.d("measurement.client.sessions.enable_fix_background_engagement", false);
        e10.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        e10.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        e10.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e10.d("measurement.client.sessions.session_id_enabled", true);
        e10.b("measurement.id.client.sessions.enable_fix_background_engagement", 0);
    }

    public final boolean zza() {
        return f49091a.e().booleanValue();
    }
}
