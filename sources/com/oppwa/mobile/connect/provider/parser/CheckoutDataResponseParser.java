package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.payment.Cart;
import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.payment.Customer;
import com.oppwa.mobile.connect.payment.Merchant;
import com.oppwa.mobile.connect.payment.ShippingAddress;
import com.oppwa.mobile.connect.provider.model.response.CheckoutDataResponse;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CheckoutDataResponseParser extends AbstractResponseParser<CheckoutData, CheckoutDataResponse> {
    /* access modifiers changed from: protected */
    public CheckoutData a(CheckoutDataResponse checkoutDataResponse) {
        CheckoutData.Builder builder = new CheckoutData.Builder();
        builder.setAmount(checkoutDataResponse.getAmount()).setCurrency(checkoutDataResponse.getCurrency()).setMerchantTransactionId(checkoutDataResponse.getMerchantTransactionId()).setTaxAmount(checkoutDataResponse.getTaxAmount());
        Optional.ofNullable(checkoutDataResponse.getBilling()).ifPresent(new C14187x(this, builder));
        Optional.ofNullable(checkoutDataResponse.getShipping()).ifPresent(new C14188y(this, builder));
        Optional.ofNullable(checkoutDataResponse.getCart()).ifPresent(new C14189z(this, builder));
        Optional.ofNullable(checkoutDataResponse.getMerchant()).ifPresent(new A(this, builder));
        return builder.build();
    }

    /* access modifiers changed from: private */
    public void a(CheckoutDataResponse.Merchant merchant, CheckoutData.Builder builder) {
        builder.setMerchant(new Merchant.Builder().setName(merchant.getName()).build());
    }

    /* access modifiers changed from: private */
    public void a(CheckoutDataResponse.Cart cart, CheckoutData.Builder builder) {
        Cart.Builder builder2 = new Cart.Builder();
        Optional.ofNullable(cart.getItems()).ifPresent(new C14186w(this, builder2));
        builder.setCart(builder2.build());
    }

    /* access modifiers changed from: private */
    public void a(List<CheckoutDataResponse.CartItem> list, Cart.Builder builder) {
        builder.setItems((List) list.stream().map(new C()).map(new D()).collect(Collectors.toList()));
    }

    /* access modifiers changed from: private */
    public void a(CheckoutDataResponse.ShippingAddress shippingAddress, CheckoutData.Builder builder) {
        ShippingAddress.Builder phone = new ShippingAddress.Builder().setStreet1(shippingAddress.getStreet1()).setStreet2(shippingAddress.getStreet2()).setCity(shippingAddress.getCity()).setState(shippingAddress.getState()).setPostcode(shippingAddress.getPostcode()).setCountry(shippingAddress.getCountry()).setCost(shippingAddress.getCost()).setPhone(shippingAddress.getPhone());
        Optional.ofNullable(shippingAddress.getCustomer()).ifPresent(new B(this, phone));
        builder.setShipping(phone.build());
    }

    /* access modifiers changed from: private */
    public void a(CheckoutDataResponse.Customer customer, ShippingAddress.Builder builder) {
        builder.setCustomer(new Customer.Builder().setGivenName(customer.getGivenName()).setSurname(customer.getSurname()).setEmail(customer.getEmail()).build());
    }

    /* access modifiers changed from: private */
    public void a(CheckoutDataResponse.BillingAddress billingAddress, CheckoutData.Builder builder) {
        builder.setBilling(new BillingAddress.Builder().setStreet1(billingAddress.getStreet1()).setStreet2(billingAddress.getStreet2()).setCity(billingAddress.getCity()).setState(billingAddress.getState()).setPostCode(billingAddress.getPostcode()).setCountry(billingAddress.getCountry()).build());
    }
}
