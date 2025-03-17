package com.oppwa.mobile.connect.payment.googlepay;

import androidx.annotation.Keep;
import java.util.Objects;

@Keep
public class GooglePayPaymentData {
    private Integer apiVersion;
    private Integer apiVersionMinor;
    private String email;
    private PaymentMethodData paymentMethodData;
    private Address shippingAddress;

    @Keep
    public static class Address {
        private String address1;
        private String address2;
        private String address3;
        private String administrativeArea;
        private String countryCode;
        private String locality;
        private String name;
        private String phoneNumber;
        private String postalCode;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Address address = (Address) obj;
            return Objects.equals(this.name, address.name) && Objects.equals(this.postalCode, address.postalCode) && Objects.equals(this.countryCode, address.countryCode) && Objects.equals(this.phoneNumber, address.phoneNumber) && Objects.equals(this.address1, address.address1) && Objects.equals(this.address2, address.address2) && Objects.equals(this.address3, address.address3) && Objects.equals(this.locality, address.locality) && Objects.equals(this.administrativeArea, address.administrativeArea);
        }

        public String getAddress1() {
            return this.address1;
        }

        public String getAddress2() {
            return this.address2;
        }

        public String getAddress3() {
            return this.address3;
        }

        public String getAdministrativeArea() {
            return this.administrativeArea;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public String getLocality() {
            return this.locality;
        }

        public String getName() {
            return this.name;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getPostalCode() {
            return this.postalCode;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.name, this.postalCode, this.countryCode, this.phoneNumber, this.address1, this.address2, this.address3, this.locality, this.administrativeArea});
        }

        public Address setAddress1(String str) {
            this.address1 = str;
            return this;
        }

        public Address setAddress2(String str) {
            this.address2 = str;
            return this;
        }

        public Address setAddress3(String str) {
            this.address3 = str;
            return this;
        }

        public Address setAdministrativeArea(String str) {
            this.administrativeArea = str;
            return this;
        }

        public Address setCountryCode(String str) {
            this.countryCode = str;
            return this;
        }

        public Address setLocality(String str) {
            this.locality = str;
            return this;
        }

        public Address setName(String str) {
            this.name = str;
            return this;
        }

        public Address setPhoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }

        public Address setPostalCode(String str) {
            this.postalCode = str;
            return this;
        }
    }

    @Keep
    public static class CardInfo {
        private Address billingAddress;
        private String cardNetwork;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CardInfo cardInfo = (CardInfo) obj;
            return Objects.equals(this.cardNetwork, cardInfo.cardNetwork) && Objects.equals(this.billingAddress, cardInfo.billingAddress);
        }

        public Address getBillingAddress() {
            return this.billingAddress;
        }

        public String getCardNetwork() {
            return this.cardNetwork;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.cardNetwork, this.billingAddress});
        }

        public CardInfo setBillingAddress(Address address) {
            this.billingAddress = address;
            return this;
        }

        public CardInfo setCardNetwork(String str) {
            this.cardNetwork = str;
            return this;
        }
    }

    @Keep
    public static class PaymentMethodData {
        private CardInfo info;
        private PaymentMethodToken tokenizationData;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PaymentMethodData paymentMethodData = (PaymentMethodData) obj;
            return Objects.equals(this.info, paymentMethodData.info) && Objects.equals(this.tokenizationData, paymentMethodData.tokenizationData);
        }

        public CardInfo getInfo() {
            return this.info;
        }

        public PaymentMethodToken getTokenizationData() {
            return this.tokenizationData;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.info, this.tokenizationData});
        }

        public PaymentMethodData setInfo(CardInfo cardInfo) {
            this.info = cardInfo;
            return this;
        }

        public PaymentMethodData setTokenizationData(PaymentMethodToken paymentMethodToken) {
            this.tokenizationData = paymentMethodToken;
            return this;
        }
    }

    @Keep
    public static class PaymentMethodToken {
        private String token;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.token, ((PaymentMethodToken) obj).token);
        }

        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.token});
        }

        public PaymentMethodToken setToken(String str) {
            this.token = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GooglePayPaymentData googlePayPaymentData = (GooglePayPaymentData) obj;
        return Objects.equals(this.apiVersion, googlePayPaymentData.apiVersion) && Objects.equals(this.apiVersionMinor, googlePayPaymentData.apiVersionMinor) && Objects.equals(this.paymentMethodData, googlePayPaymentData.paymentMethodData) && Objects.equals(this.email, googlePayPaymentData.email) && Objects.equals(this.shippingAddress, googlePayPaymentData.shippingAddress);
    }

    public Integer getApiVersion() {
        return this.apiVersion;
    }

    public Integer getApiVersionMinor() {
        return this.apiVersionMinor;
    }

    public String getEmail() {
        return this.email;
    }

    public PaymentMethodData getPaymentMethodData() {
        return this.paymentMethodData;
    }

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.apiVersion, this.apiVersionMinor, this.paymentMethodData, this.email, this.shippingAddress});
    }

    public GooglePayPaymentData setApiVersion(Integer num) {
        this.apiVersion = num;
        return this;
    }

    public GooglePayPaymentData setApiVersionMinor(Integer num) {
        this.apiVersionMinor = num;
        return this;
    }

    public GooglePayPaymentData setEmail(String str) {
        this.email = str;
        return this;
    }

    public GooglePayPaymentData setPaymentMethodData(PaymentMethodData paymentMethodData2) {
        this.paymentMethodData = paymentMethodData2;
        return this;
    }

    public GooglePayPaymentData setShippingAddress(Address address) {
        this.shippingAddress = address;
        return this;
    }
}
