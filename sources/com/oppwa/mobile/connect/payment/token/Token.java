package com.oppwa.mobile.connect.payment.token;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentContainer;
import java.util.Objects;
import java.util.Optional;
import org.json.JSONObject;

public class Token implements Parcelable, Cloneable {
    public static final Parcelable.Creator<Token> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121955a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121956b;

    /* renamed from: c  reason: collision with root package name */
    private final Card f121957c;

    /* renamed from: d  reason: collision with root package name */
    private final BankAccount f121958d;

    /* renamed from: e  reason: collision with root package name */
    private final VirtualAccount f121959e;

    class a implements Parcelable.Creator<Token> {
        a() {
        }

        /* renamed from: a */
        public Token createFromParcel(Parcel parcel) {
            return new Token(parcel, (a) null);
        }

        /* renamed from: a */
        public Token[] newArray(int i10) {
            return new Token[i10];
        }
    }

    /* synthetic */ Token(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException a() {
        return new IllegalArgumentException("The token id can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException b() {
        return new IllegalArgumentException("The brand can't be null");
    }

    @Deprecated
    public static Token createTokenFromJSON(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        String string2 = jSONObject.getString(PaymentDetailsUiComponentContainer.ARG_PAYMENT_BRAND);
        if (jSONObject.has("card")) {
            return new Token(string, string2, Card.a(jSONObject.getJSONObject("card")));
        }
        if (jSONObject.has("bankAccount")) {
            return new Token(string, string2, BankAccount.a(jSONObject.getJSONObject("bankAccount")));
        }
        if (jSONObject.has("virtualAccount")) {
            return new Token(string, string2, VirtualAccount.a(jSONObject.getJSONObject("virtualAccount")));
        }
        return null;
    }

    public Token copyToken(Token token) {
        return new Token(token);
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
        Token token = (Token) obj;
        return Objects.equals(this.f121955a, token.f121955a) && Objects.equals(this.f121956b, token.f121956b) && Objects.equals(this.f121957c, token.f121957c) && Objects.equals(this.f121958d, token.f121958d) && Objects.equals(this.f121959e, token.f121959e);
    }

    public BankAccount getBankAccount() {
        return this.f121958d;
    }

    public Card getCard() {
        return this.f121957c;
    }

    public String getPaymentBrand() {
        return this.f121956b;
    }

    public String getTokenId() {
        return this.f121955a;
    }

    public VirtualAccount getVirtualAccount() {
        return this.f121959e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121955a, this.f121956b, this.f121957c, this.f121958d, this.f121959e});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121955a);
        parcel.writeString(this.f121956b);
        parcel.writeParcelable(this.f121957c, i10);
        parcel.writeParcelable(this.f121958d, i10);
        parcel.writeParcelable(this.f121959e, i10);
    }

    public Token(String str, String str2, Card card) {
        this.f121955a = str;
        this.f121956b = str2;
        this.f121957c = card;
        this.f121958d = null;
        this.f121959e = null;
    }

    public Token clone() {
        try {
            return (Token) super.clone();
        } catch (CloneNotSupportedException unused) {
            return new Token(this);
        }
    }

    public Token(String str, String str2, BankAccount bankAccount) {
        this.f121955a = str;
        this.f121956b = str2;
        this.f121957c = null;
        this.f121958d = bankAccount;
        this.f121959e = null;
    }

    public Token(String str, String str2, VirtualAccount virtualAccount) {
        this.f121955a = str;
        this.f121956b = str2;
        this.f121957c = null;
        this.f121958d = null;
        this.f121959e = virtualAccount;
    }

    private Token(Parcel parcel) {
        this.f121955a = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new k());
        this.f121956b = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new l());
        this.f121957c = (Card) parcel.readParcelable(Card.class.getClassLoader());
        this.f121958d = (BankAccount) parcel.readParcelable(BankAccount.class.getClassLoader());
        this.f121959e = (VirtualAccount) parcel.readParcelable(VirtualAccount.class.getClassLoader());
    }

    private Token(Token token) {
        this.f121955a = token.getTokenId();
        this.f121956b = token.getPaymentBrand();
        this.f121957c = (Card) Optional.ofNullable(token.getCard()).map(new m()).orElse((Object) null);
        this.f121958d = (BankAccount) Optional.ofNullable(token.getBankAccount()).map(new n()).orElse((Object) null);
        this.f121959e = (VirtualAccount) Optional.ofNullable(token.getVirtualAccount()).map(new o()).orElse((Object) null);
    }
}
