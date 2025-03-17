package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.sugarcube.core.logger.DslKt;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;
import u2.C6012a;

class a0 {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f68390a;

    static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f68391d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f68392a;

        /* renamed from: b  reason: collision with root package name */
        final String f68393b;

        /* renamed from: c  reason: collision with root package name */
        final long f68394c;

        private a(String str, String str2, long j10) {
            this.f68392a = str;
            this.f68393b = str2;
            this.f68394c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            return System.currentTimeMillis() > this.f68394c + f68391d || !str.equals(this.f68393b);
        }
    }

    public a0(Context context) {
        this.f68390a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(C6012a.i(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !f()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    c();
                }
            } catch (IOException e10) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
                }
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + DslKt.INDICATOR_SEPARATOR + Marker.ANY_MARKER;
    }

    public synchronized void c() {
        this.f68390a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b10 = b(str, str2);
        SharedPreferences.Editor edit = this.f68390a.edit();
        edit.remove(b10);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f68390a.getString(b(str, str2), (String) null));
    }

    public synchronized boolean f() {
        return this.f68390a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a10 = a.a(str3, str4, System.currentTimeMillis());
        if (a10 != null) {
            SharedPreferences.Editor edit = this.f68390a.edit();
            edit.putString(b(str, str2), a10);
            edit.commit();
        }
    }
}
