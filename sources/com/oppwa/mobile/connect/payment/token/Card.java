package com.oppwa.mobile.connect.payment.token;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.utils.JsonUtils;
import java.util.Objects;
import java.util.Optional;
import org.json.JSONException;
import org.json.JSONObject;

public class Card implements Parcelable, Cloneable {
    public static final Parcelable.Creator<Card> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121951a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121952b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121953c;

    /* renamed from: d  reason: collision with root package name */
    private final String f121954d;

    class a implements Parcelable.Creator<Card> {
        a() {
        }

        /* renamed from: a */
        public Card createFromParcel(Parcel parcel) {
            return new Card(parcel);
        }

        /* renamed from: a */
        public Card[] newArray(int i10) {
            return new Card[i10];
        }
    }

    public Card(String str, String str2, String str3, String str4) {
        this.f121951a = str;
        this.f121952b = str2;
        this.f121953c = str3;
        this.f121954d = str4;
    }

    @Deprecated
    static Card a(JSONObject jSONObject) {
        return new Card(JsonUtils.getStringForKey(jSONObject, "holder"), (String) Optional.ofNullable(JsonUtils.getStringForKey(jSONObject, "last4Digits")).orElseThrow(new e()), (String) Optional.ofNullable(JsonUtils.getStringForKey(jSONObject, "expiryMonth")).orElseThrow(new f()), (String) Optional.ofNullable(JsonUtils.getStringForKey(jSONObject, "expiryYear")).orElseThrow(new g()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ JSONException b() {
        return new JSONException("Missing expiryMonth");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ JSONException c() {
        return new JSONException("Missing expiryYear");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException d() {
        return new IllegalArgumentException("The last 4 digits can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException e() {
        return new IllegalArgumentException("The expiry month can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException f() {
        return new IllegalArgumentException("The expiry year can't be null");
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
        Card card = (Card) obj;
        return Objects.equals(this.f121951a, card.f121951a) && Objects.equals(this.f121952b, card.f121952b) && Objects.equals(this.f121953c, card.f121953c) && Objects.equals(this.f121954d, card.f121954d);
    }

    public String getExpiryMonth() {
        return this.f121953c;
    }

    public String getExpiryYear() {
        return this.f121954d;
    }

    public String getHolder() {
        return this.f121951a;
    }

    public String getLast4Digits() {
        return this.f121952b;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121951a, this.f121952b, this.f121953c, this.f121954d});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121951a);
        parcel.writeString(this.f121952b);
        parcel.writeString(this.f121953c);
        parcel.writeString(this.f121954d);
    }

    public Card clone() {
        try {
            return (Card) super.clone();
        } catch (CloneNotSupportedException unused) {
            return new Card(this.f121951a, this.f121952b, this.f121953c, this.f121954d);
        }
    }

    protected Card(Parcel parcel) {
        this.f121951a = parcel.readString();
        this.f121952b = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new h());
        this.f121953c = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new i());
        this.f121954d = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new j());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ JSONException a() {
        return new JSONException("Missing last4Digits");
    }
}
