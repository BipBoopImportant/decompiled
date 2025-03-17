package com.auth0.android.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.f;
import s.C5829h;
import u2.C6012a;

public class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f46344a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46345b;

    /* renamed from: c  reason: collision with root package name */
    private final d f46346c;

    class a implements Parcelable.Creator<i> {
        a() {
        }

        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        /* renamed from: b */
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f46347a = 0;

        /* renamed from: b  reason: collision with root package name */
        private boolean f46348b = false;

        /* renamed from: c  reason: collision with root package name */
        private d f46349c = d.d().a();

        b() {
        }

        public i a() {
            return new i(this.f46348b, this.f46347a, this.f46349c, (a) null);
        }

        public b b(boolean z10) {
            this.f46348b = z10;
            return this;
        }

        public b c(int i10) {
            this.f46347a = i10;
            return this;
        }
    }

    /* synthetic */ i(boolean z10, int i10, d dVar, a aVar) {
        this(z10, i10, dVar);
    }

    public static b c() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public String a(PackageManager packageManager) {
        return this.f46346c.a(packageManager);
    }

    /* access modifiers changed from: package-private */
    public boolean b(PackageManager packageManager) {
        return a(packageManager) != null;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ResourceType"})
    public Intent d(Context context, f fVar) {
        d.C0230d i10 = new d.C0230d(fVar).j(this.f46344a).i(2);
        if (this.f46345b > 0) {
            i10.d(new a.C0229a().b(C6012a.c(context, this.f46345b)).a());
        }
        return i10.a().f16598a;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ResourceType"})
    public C5829h e(Context context, Uri uri) {
        C5829h hVar = new C5829h(uri);
        if (this.f46345b > 0) {
            hVar.d(new a.C0229a().b(C6012a.c(context, this.f46345b)).a());
        }
        return hVar;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f46344a ? (byte) 1 : 0);
        parcel.writeInt(this.f46345b);
        parcel.writeParcelable(this.f46346c, i10);
    }

    private i(boolean z10, int i10, d dVar) {
        this.f46344a = z10;
        this.f46345b = i10;
        this.f46346c = dVar;
    }

    protected i(Parcel parcel) {
        this.f46344a = parcel.readByte() != 0;
        this.f46345b = parcel.readInt();
        this.f46346c = (d) parcel.readParcelable(d.class.getClassLoader());
    }
}
