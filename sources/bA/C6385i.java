package Ba;

import L9.a;
import L9.c;
import L9.e;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: Ba.i  reason: case insensitive filesystem */
public final class C6385i extends a implements C6377a {
    public static final Parcelable.Creator<C6385i> CREATOR = new v();

    /* renamed from: a  reason: collision with root package name */
    String f33338a;

    /* renamed from: b  reason: collision with root package name */
    C6378b f33339b;

    /* renamed from: c  reason: collision with root package name */
    UserAddress f33340c;

    /* renamed from: d  reason: collision with root package name */
    C6387k f33341d;

    /* renamed from: e  reason: collision with root package name */
    String f33342e;

    /* renamed from: f  reason: collision with root package name */
    Bundle f33343f;

    /* renamed from: g  reason: collision with root package name */
    String f33344g;

    /* renamed from: h  reason: collision with root package name */
    Bundle f33345h;

    private C6385i() {
    }

    public static C6385i B(Intent intent) {
        return (C6385i) e.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    @Deprecated
    public C6387k F() {
        return this.f33341d;
    }

    @Deprecated
    public UserAddress J() {
        return this.f33340c;
    }

    public String U() {
        return this.f33344g;
    }

    public void q(Intent intent) {
        e.d(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f33338a, false);
        c.t(parcel, 2, this.f33339b, i10, false);
        c.t(parcel, 3, this.f33340c, i10, false);
        c.t(parcel, 4, this.f33341d, i10, false);
        c.u(parcel, 5, this.f33342e, false);
        c.e(parcel, 6, this.f33343f, false);
        c.u(parcel, 7, this.f33344g, false);
        c.e(parcel, 8, this.f33345h, false);
        c.b(parcel, a10);
    }

    @Deprecated
    public C6378b x() {
        return this.f33339b;
    }

    C6385i(String str, C6378b bVar, UserAddress userAddress, C6387k kVar, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f33338a = str;
        this.f33339b = bVar;
        this.f33340c = userAddress;
        this.f33341d = kVar;
        this.f33342e = str2;
        this.f33343f = bundle;
        this.f33344g = str3;
        this.f33345h = bundle2;
    }
}
