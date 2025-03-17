package com.oppwa.mobile.connect.payment.token;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.utils.JsonUtils;
import java.util.Objects;
import java.util.Optional;
import org.json.JSONException;
import org.json.JSONObject;

public class VirtualAccount implements Parcelable, Cloneable {
    public static final Parcelable.Creator<VirtualAccount> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121962a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121963b;

    class a implements Parcelable.Creator<VirtualAccount> {
        a() {
        }

        /* renamed from: a */
        public VirtualAccount createFromParcel(Parcel parcel) {
            return new VirtualAccount(parcel);
        }

        /* renamed from: a */
        public VirtualAccount[] newArray(int i10) {
            return new VirtualAccount[i10];
        }
    }

    public VirtualAccount(String str, String str2) {
        this.f121963b = str;
        this.f121962a = str2;
    }

    @Deprecated
    static VirtualAccount a(JSONObject jSONObject) {
        return new VirtualAccount(JsonUtils.getStringForKey(jSONObject, "holder"), (String) Optional.ofNullable(JsonUtils.getStringForKey(jSONObject, "accountId")).orElseThrow(new p()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException b() {
        return new IllegalArgumentException("The account id can't be null");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VirtualAccount virtualAccount = (VirtualAccount) obj;
        return Objects.equals(this.f121962a, virtualAccount.f121962a) && Objects.equals(this.f121963b, virtualAccount.f121963b);
    }

    public String getAccountId() {
        return this.f121962a;
    }

    public String getHolder() {
        return this.f121963b;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121962a, this.f121963b});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121963b);
        parcel.writeString(this.f121962a);
    }

    public VirtualAccount clone() {
        try {
            return (VirtualAccount) super.clone();
        } catch (CloneNotSupportedException unused) {
            return new VirtualAccount(this.f121963b, this.f121962a);
        }
    }

    public VirtualAccount(Parcel parcel) {
        this.f121963b = parcel.readString();
        this.f121962a = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new q());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ JSONException a() {
        return new JSONException("Missing accountId");
    }

    public VirtualAccount(VirtualAccount virtualAccount) {
        this.f121963b = virtualAccount.f121963b;
        this.f121962a = virtualAccount.f121962a;
    }
}
