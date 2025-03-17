package com.oppwa.mobile.connect.payment.processor.affirm;

import android.text.TextUtils;
import com.affirm.android.model.Address;
import com.affirm.android.model.Billing;
import com.affirm.android.model.Checkout;
import com.affirm.android.model.Currency;
import com.affirm.android.model.Discount;
import com.affirm.android.model.Item;
import com.affirm.android.model.Shipping;
import com.oppwa.mobile.connect.checkout.meta.m;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.payment.CartItem;
import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.payment.Customer;
import com.oppwa.mobile.connect.payment.ShippingAddress;
import com.oppwa.mobile.connect.utils.Logger;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/* renamed from: com.oppwa.mobile.connect.payment.processor.affirm.a  reason: case insensitive filesystem */
class C14128a {
    C14128a() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str) {
        return !TextUtils.isEmpty(str);
    }

    public Checkout a(CheckoutData checkoutData) {
        try {
            Checkout.Builder builder = Checkout.builder();
            Optional map = Optional.ofNullable(checkoutData.getShipping()).map(new H(this));
            Objects.requireNonNull(builder);
            map.ifPresent(new P(builder));
            Optional.ofNullable(checkoutData.getBilling()).map(new Q(this, checkoutData)).ifPresent(new S(builder));
            Optional.ofNullable(checkoutData.getCart()).map(new T()).ifPresent(new U(this, builder));
            return builder.setShipping(a(checkoutData.getShipping())).setBilling(a(checkoutData.getBilling(), checkoutData.getShipping())).setTaxAmount(a(checkoutData.getTaxAmount())).setOrderId(checkoutData.getMerchantTransactionId()).setShippingAmount(a(checkoutData.getShipping().getCost())).setCurrency(Currency.valueOf(checkoutData.getCurrency())).setTotal(new BigDecimal(checkoutData.getAmount())).build();
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new PaymentException(PaymentError.getAffirmError("Failed to create affirm checkout."));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String c(String str) {
        return " " + str;
    }

    private Map<String, Item> b(List<CartItem> list) {
        return (Map) list.stream().map(new E()).collect(new m(), new F(), new C());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Billing a(CheckoutData checkoutData, BillingAddress billingAddress) {
        return a(billingAddress, checkoutData.getShipping());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Checkout.Builder builder, List list) {
        builder.setItems(b((List<CartItem>) list));
        Optional.ofNullable(a((List<CartItem>) list)).filter(new G()).ifPresent(new I(builder));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Map map) {
        return !map.isEmpty();
    }

    private Map<String, Discount> a(List<CartItem> list) {
        return (Map) list.stream().map(new X()).filter(new C14150x()).map(new y()).filter(new z()).map(new A()).collect(new m(), new B(), new C());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Double d10) {
        return d10.doubleValue() > 0.0d;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Item a(CartItem cartItem) {
        Item.Builder url = Item.builder().setDisplayName(cartItem.getName()).setSku(cartItem.getSku()).setUnitPrice(new BigDecimal(cartItem.getPrice())).setImageUrl(cartItem.getImageUrl()).setUrl(cartItem.getProductUrl());
        Optional map = Optional.ofNullable(cartItem.getQuantity()).map(new K());
        Objects.requireNonNull(url);
        map.ifPresent(new L(url));
        return url.build();
    }

    private static BigDecimal a(String str) {
        return (BigDecimal) Optional.ofNullable(str).map(new C14149w()).orElse(new BigDecimal(0));
    }

    private Billing a(BillingAddress billingAddress, ShippingAddress shippingAddress) {
        Billing.Builder address = Billing.builder().setAddress(Address.builder().setStreet1(billingAddress.getStreet1()).setStreet2(billingAddress.getStreet2()).setCity(billingAddress.getCity()).setCountry(billingAddress.getCountry()).setPostalCode(billingAddress.getPostCode()).setRegion1Code(billingAddress.getState()).build());
        Optional.ofNullable(shippingAddress).map(new M()).map(new N(this)).ifPresent(new O(address));
        return address.build();
    }

    /* access modifiers changed from: private */
    public Shipping a(ShippingAddress shippingAddress) {
        Shipping.Builder phoneNumber = Shipping.builder().setAddress(Address.builder().setStreet1(shippingAddress.getStreet1()).setStreet2(shippingAddress.getStreet2()).setCity(shippingAddress.getCity()).setCountry(shippingAddress.getCountry()).setPostalCode(shippingAddress.getPostcode()).setRegion1Code(shippingAddress.getState()).build()).setPhoneNumber(shippingAddress.getPhone());
        Optional.ofNullable(shippingAddress.getCustomer()).ifPresent(new J(this, phoneNumber));
        return phoneNumber.build();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Shipping.Builder builder, Customer customer) {
        builder.setEmail(customer.getEmail());
        Optional.ofNullable(a(customer)).ifPresent(new V(builder));
    }

    /* access modifiers changed from: private */
    public String a(Customer customer) {
        return (String) Optional.ofNullable(customer.getGivenName()).map(new W(customer)).orElse((Object) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(Customer customer, String str) {
        return str + ((String) Optional.ofNullable(customer.getSurname()).map(new D()).orElse(""));
    }
}
