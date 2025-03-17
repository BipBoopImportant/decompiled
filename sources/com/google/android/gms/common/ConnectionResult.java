package com.google.android.gms.common;

import K9.C6619q;
import L9.a;
import L9.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;

public final class ConnectionResult extends a {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new f();
    public static final int SUCCESS = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final ConnectionResult f47963e = new ConnectionResult(0);

    /* renamed from: a  reason: collision with root package name */
    final int f47964a;

    /* renamed from: b  reason: collision with root package name */
    private final int f47965b;

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f47966c;

    /* renamed from: d  reason: collision with root package name */
    private final String f47967d;

    ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f47964a = i10;
        this.f47965b = i11;
        this.f47966c = pendingIntent;
        this.f47967d = str;
    }

    static String t0(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                        return "API_DISABLED";
                    case BuildConfig.MIN_SDK_VERSION /*24*/:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public String B() {
        return this.f47967d;
    }

    public PendingIntent F() {
        return this.f47966c;
    }

    public boolean J() {
        return (this.f47965b == 0 || this.f47966c == null) ? false : true;
    }

    public boolean U() {
        return this.f47965b == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f47965b == connectionResult.f47965b && C6619q.b(this.f47966c, connectionResult.f47966c) && C6619q.b(this.f47967d, connectionResult.f47967d);
    }

    public int hashCode() {
        return C6619q.c(Integer.valueOf(this.f47965b), this.f47966c, this.f47967d);
    }

    public String toString() {
        C6619q.a d10 = C6619q.d(this);
        d10.a("statusCode", t0(this.f47965b));
        d10.a("resolution", this.f47966c);
        d10.a("message", this.f47967d);
        return d10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f47964a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.n(parcel, 2, x());
        c.t(parcel, 3, F(), i10, false);
        c.u(parcel, 4, B(), false);
        c.b(parcel, a10);
    }

    public int x() {
        return this.f47965b;
    }

    public ConnectionResult(int i10) {
        this(i10, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, (String) null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
