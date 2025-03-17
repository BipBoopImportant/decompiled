package com.google.firebase.messaging;

import L9.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.messaging.C9546d;
import java.util.Map;

public final class S extends a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* renamed from: a  reason: collision with root package name */
    Bundle f68350a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f68351b;

    public S(Bundle bundle) {
        this.f68350a = bundle;
    }

    public String B() {
        String string = this.f68350a.getString("google.message_id");
        return string == null ? this.f68350a.getString("message_id") : string;
    }

    public String F() {
        return this.f68350a.getString("message_type");
    }

    public long J() {
        Object obj = this.f68350a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0;
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        T.c(this, parcel, i10);
    }

    public Map<String, String> x() {
        if (this.f68351b == null) {
            this.f68351b = C9546d.a.a(this.f68350a);
        }
        return this.f68351b;
    }
}
