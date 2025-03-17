package com.oppwa.mobile.connect.payment.token;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.utils.JsonUtils;
import java.util.Objects;
import java.util.Optional;
import org.json.JSONException;
import org.json.JSONObject;

public class BankAccount implements Parcelable, Cloneable {
    public static final Parcelable.Creator<BankAccount> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121949a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121950b;

    class a implements Parcelable.Creator<BankAccount> {
        a() {
        }

        /* renamed from: a */
        public BankAccount createFromParcel(Parcel parcel) {
            return new BankAccount(parcel, (a) null);
        }

        /* renamed from: a */
        public BankAccount[] newArray(int i10) {
            return new BankAccount[i10];
        }
    }

    /* synthetic */ BankAccount(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Deprecated
    static BankAccount a(JSONObject jSONObject) {
        return new BankAccount((String) Optional.ofNullable(JsonUtils.getStringForKey(jSONObject, "holder")).orElseThrow(new c()), (String) Optional.ofNullable(JsonUtils.getStringForKey(jSONObject, "iban")).orElseThrow(new d()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ JSONException b() {
        return new JSONException("Missing iban");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException c() {
        return new IllegalArgumentException("The holder can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException d() {
        return new IllegalArgumentException("The IBAN can't be null");
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
        BankAccount bankAccount = (BankAccount) obj;
        return Objects.equals(this.f121949a, bankAccount.f121949a) && Objects.equals(this.f121950b, bankAccount.f121950b);
    }

    public String getHolder() {
        return this.f121949a;
    }

    public String getIban() {
        return this.f121950b;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121949a, this.f121950b});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121949a);
        parcel.writeString(this.f121950b);
    }

    public BankAccount(String str, String str2) {
        this.f121949a = str;
        this.f121950b = str2;
    }

    public BankAccount clone() {
        try {
            return (BankAccount) super.clone();
        } catch (CloneNotSupportedException unused) {
            return new BankAccount(this.f121949a, this.f121950b);
        }
    }

    private BankAccount(Parcel parcel) {
        this.f121949a = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new a());
        this.f121950b = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ JSONException a() {
        return new JSONException("Missing holder");
    }
}
