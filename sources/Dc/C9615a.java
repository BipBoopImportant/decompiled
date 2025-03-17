package dc;

import L9.a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dc.a  reason: case insensitive filesystem */
public class C9615a extends a {
    public static final Parcelable.Creator<C9615a> CREATOR = new C9616b();

    /* renamed from: a  reason: collision with root package name */
    private String f72371a;

    /* renamed from: b  reason: collision with root package name */
    private String f72372b;

    /* renamed from: c  reason: collision with root package name */
    private int f72373c;

    /* renamed from: d  reason: collision with root package name */
    private long f72374d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f72375e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f72376f;

    public C9615a(String str, String str2, int i10, long j10, Bundle bundle, Uri uri) {
        this.f72371a = str;
        this.f72372b = str2;
        this.f72373c = i10;
        this.f72374d = j10;
        this.f72375e = bundle;
        this.f72376f = uri;
    }

    public String B() {
        return this.f72372b;
    }

    public void E0(long j10) {
        this.f72374d = j10;
    }

    public String F() {
        return this.f72371a;
    }

    public Bundle J() {
        Bundle bundle = this.f72375e;
        return bundle == null ? new Bundle() : bundle;
    }

    public int U() {
        return this.f72373c;
    }

    public Uri t0() {
        return this.f72376f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C9616b.c(this, parcel, i10);
    }

    public long x() {
        return this.f72374d;
    }
}
