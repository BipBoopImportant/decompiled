package com.oppwa.mobile.connect.provider;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Objects;
import java.util.Optional;

public class ThreeDS2Info implements Parcelable {
    public static final Parcelable.Creator<ThreeDS2Info> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final AuthStatus f121973a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121974b;

    /* renamed from: c  reason: collision with root package name */
    private String f121975c;

    /* renamed from: d  reason: collision with root package name */
    private String f121976d;

    /* renamed from: e  reason: collision with root package name */
    private String f121977e;

    /* renamed from: f  reason: collision with root package name */
    private String f121978f;

    /* renamed from: g  reason: collision with root package name */
    private String f121979g;

    /* renamed from: h  reason: collision with root package name */
    private String f121980h;

    /* renamed from: i  reason: collision with root package name */
    private String f121981i;

    /* renamed from: j  reason: collision with root package name */
    private String f121982j;

    /* renamed from: k  reason: collision with root package name */
    private ThreeDSFlow f121983k;

    public enum AuthStatus implements Parcelable {
        AUTHENTICATED,
        ATTEMPT_PROCESSING_PERFORMED,
        CHALLENGE_REQUIRED,
        DECOUPLED_CONFIRMED,
        DENIED,
        REJECTED,
        FAILED,
        INFORMATIONAL_ONLY,
        AUTH_PARAMS_REQUIRED;
        
        public static final Parcelable.Creator<AuthStatus> CREATOR = null;

        class a implements Parcelable.Creator<AuthStatus> {
            a() {
            }

            /* renamed from: a */
            public AuthStatus createFromParcel(Parcel parcel) {
                return AuthStatus.values()[parcel.readInt()];
            }

            /* renamed from: a */
            public AuthStatus[] newArray(int i10) {
                return new AuthStatus[i10];
            }
        }

        static {
            CREATOR = new a();
        }

        public static AuthStatus fromString(String str) {
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case 65:
                    if (str.equals("A")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 67:
                    if (str.equals("C")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 68:
                    if (str.equals("D")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 73:
                    if (str.equals("I")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 78:
                    if (str.equals("N")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 82:
                    if (str.equals("R")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 85:
                    if (str.equals("U")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 89:
                    if (str.equals("Y")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return ATTEMPT_PROCESSING_PERFORMED;
                case 1:
                    return CHALLENGE_REQUIRED;
                case 2:
                    return DECOUPLED_CONFIRMED;
                case 3:
                    return INFORMATIONAL_ONLY;
                case 4:
                    return DENIED;
                case 5:
                    return REJECTED;
                case 6:
                    return FAILED;
                case 7:
                    return AUTHENTICATED;
                default:
                    return null;
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(ordinal());
        }
    }

    public enum ThreeDSFlow implements Parcelable {
        APP,
        APPONLY,
        WEB,
        DISABLED;
        
        public static final Parcelable.Creator<ThreeDSFlow> CREATOR = null;

        class a implements Parcelable.Creator<ThreeDSFlow> {
            a() {
            }

            /* renamed from: a */
            public ThreeDSFlow createFromParcel(Parcel parcel) {
                return ThreeDSFlow.values()[parcel.readInt()];
            }

            /* renamed from: a */
            public ThreeDSFlow[] newArray(int i10) {
                return new ThreeDSFlow[i10];
            }
        }

        static {
            CREATOR = new a();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(ordinal());
        }
    }

    class a implements Parcelable.Creator<ThreeDS2Info> {
        a() {
        }

        /* renamed from: a */
        public ThreeDS2Info createFromParcel(Parcel parcel) {
            return new ThreeDS2Info(parcel);
        }

        /* renamed from: a */
        public ThreeDS2Info[] newArray(int i10) {
            return new ThreeDS2Info[i10];
        }
    }

    public ThreeDS2Info(AuthStatus authStatus, String str) {
        this.f121973a = authStatus;
        this.f121974b = str;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException a() {
        return new PaymentException(PaymentError.getThreeDS2Error("AuthResponse can't be null"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException b() {
        return new PaymentException(PaymentError.getThreeDS2Error("CallbackUrl can't be null"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException c() {
        return new PaymentException(PaymentError.getThreeDS2Error("DsCert can't be null"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException d() {
        return new PaymentException(PaymentError.getThreeDS2Error("DsRefId can't be null"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException e() {
        return new PaymentException(PaymentError.getThreeDS2Error("DsRootCa can't be null"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException f() {
        return new PaymentException(PaymentError.getThreeDS2Error("ProtocolVersion can't be null"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException g() {
        return new PaymentException(PaymentError.getThreeDS2Error("ThreeDSFlow can't be null"));
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
        ThreeDS2Info threeDS2Info = (ThreeDS2Info) obj;
        return this.f121973a == threeDS2Info.f121973a && Objects.equals(this.f121974b, threeDS2Info.f121974b) && Objects.equals(this.f121980h, threeDS2Info.f121980h) && Objects.equals(this.f121981i, threeDS2Info.f121981i) && Objects.equals(this.f121982j, threeDS2Info.f121982j) && Objects.equals(this.f121983k, threeDS2Info.f121983k) && Objects.equals(this.f121975c, threeDS2Info.f121975c) && Objects.equals(this.f121976d, threeDS2Info.f121976d) && Objects.equals(this.f121977e, threeDS2Info.f121977e) && Objects.equals(this.f121978f, threeDS2Info.f121978f) && Objects.equals(this.f121979g, threeDS2Info.f121979g);
    }

    public String getAuthResponse() {
        return this.f121974b;
    }

    public AuthStatus getAuthStatus() {
        return this.f121973a;
    }

    public String getBrand() {
        return this.f121976d;
    }

    public String getCallbackUrl() {
        return this.f121978f;
    }

    public String getCardHolderInfo() {
        return this.f121975c;
    }

    public String getChallengeCompletionCallbackUrl() {
        return this.f121979g;
    }

    public String getDsCert() {
        return this.f121981i;
    }

    public String getDsRefId() {
        return this.f121980h;
    }

    public String getDsRootCa() {
        return this.f121982j;
    }

    public String getProtocolVersion() {
        return this.f121977e;
    }

    public ThreeDSFlow getThreeDSFlow() {
        return this.f121983k;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121973a, this.f121974b, this.f121980h, this.f121981i, this.f121982j, this.f121983k, this.f121975c, this.f121976d, this.f121977e, this.f121978f, this.f121979g});
    }

    public boolean isAuthParamsRequired() {
        return AuthStatus.AUTH_PARAMS_REQUIRED.equals(this.f121973a);
    }

    public boolean isChallengeRequired() {
        return AuthStatus.CHALLENGE_REQUIRED.equals(this.f121973a);
    }

    public String requireAuthResponse() {
        return (String) Optional.ofNullable(this.f121974b).orElseThrow(new v());
    }

    public String requireCallbackUrl() {
        return (String) Optional.ofNullable(this.f121978f).orElseThrow(new A());
    }

    public String requireDsCert() {
        return (String) Optional.ofNullable(this.f121981i).orElseThrow(new x());
    }

    public String requireDsRefId() {
        return (String) Optional.ofNullable(this.f121980h).orElseThrow(new w());
    }

    public String requireDsRootCa() {
        return (String) Optional.ofNullable(this.f121982j).orElseThrow(new z());
    }

    public String requireProtocolVersion() {
        return (String) Optional.ofNullable(this.f121977e).orElseThrow(new B());
    }

    public ThreeDSFlow requireThreeDSFlow() {
        return (ThreeDSFlow) Optional.ofNullable(this.f121983k).orElseThrow(new y());
    }

    public void setBrand(String str) {
        this.f121976d = str;
    }

    public void setCallbackUrl(String str) {
        this.f121978f = str;
    }

    public void setCardHolderInfo(String str) {
        this.f121975c = str;
    }

    public void setChallengeCompletionCallbackUrl(String str) {
        this.f121979g = str;
    }

    public void setDsCert(String str) {
        this.f121981i = str;
    }

    public void setDsRefId(String str) {
        this.f121980h = str;
    }

    public void setDsRootCa(String str) {
        this.f121982j = str;
    }

    public void setProtocolVersion(String str) {
        this.f121977e = str;
    }

    public void setThreeDSFlow(ThreeDSFlow threeDSFlow) {
        this.f121983k = threeDSFlow;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f121973a, 0);
        parcel.writeString(this.f121974b);
        parcel.writeString(this.f121980h);
        parcel.writeString(this.f121981i);
        parcel.writeString(this.f121982j);
        parcel.writeParcelable(this.f121983k, 0);
        parcel.writeString(this.f121975c);
        parcel.writeString(this.f121976d);
        parcel.writeString(this.f121977e);
        parcel.writeString(this.f121978f);
        parcel.writeString(this.f121979g);
    }

    public ThreeDS2Info(Parcel parcel) {
        this.f121973a = (AuthStatus) parcel.readParcelable(AuthStatus.class.getClassLoader());
        this.f121974b = parcel.readString();
        this.f121980h = parcel.readString();
        this.f121981i = parcel.readString();
        this.f121982j = parcel.readString();
        this.f121983k = (ThreeDSFlow) parcel.readParcelable(ThreeDSFlow.class.getClassLoader());
        this.f121975c = parcel.readString();
        this.f121976d = parcel.readString();
        this.f121977e = parcel.readString();
        this.f121978f = parcel.readString();
        this.f121979g = parcel.readString();
    }
}
