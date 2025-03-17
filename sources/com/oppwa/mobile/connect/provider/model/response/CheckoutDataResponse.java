package com.oppwa.mobile.connect.provider.model.response;

import androidx.annotation.Keep;
import java.util.List;

@Keep
public class CheckoutDataResponse {
    private String amount;
    private BillingAddress billing;
    private Cart cart;
    private String currency;
    private Merchant merchant;
    private String merchantTransactionId;
    private ShippingAddress shipping;
    private String taxAmount;

    @Keep
    public static class BillingAddress {
        private String city;
        private String country;
        private String postcode;
        private String state;
        private String street1;
        private String street2;

        public String getCity() {
            return this.city;
        }

        public String getCountry() {
            return this.country;
        }

        public String getPostcode() {
            return this.postcode;
        }

        public String getState() {
            return this.state;
        }

        public String getStreet1() {
            return this.street1;
        }

        public String getStreet2() {
            return this.street2;
        }
    }

    @Keep
    public static class Cart {
        private List<CartItem> items;

        public List<CartItem> getItems() {
            return this.items;
        }
    }

    @Keep
    public static class CartItem {
        private String imageUrl;
        private String name;
        private String price;
        private String productUrl;
        private String quantity;
        private String sku;
        private String totalDiscountAmount;

        public String getImageUrl() {
            return this.imageUrl;
        }

        public String getName() {
            return this.name;
        }

        public String getPrice() {
            return this.price;
        }

        public String getProductUrl() {
            return this.productUrl;
        }

        public String getQuantity() {
            return this.quantity;
        }

        public String getSku() {
            return this.sku;
        }

        public String getTotalDiscountAmount() {
            return this.totalDiscountAmount;
        }
    }

    @Keep
    public static class Customer {
        private String email;
        private String givenName;
        private String surname;

        public String getEmail() {
            return this.email;
        }

        public String getGivenName() {
            return this.givenName;
        }

        public String getSurname() {
            return this.surname;
        }
    }

    @Keep
    public static class Merchant {
        private String name;

        public String getName() {
            return this.name;
        }
    }

    @Keep
    public static class ShippingAddress extends BillingAddress {
        private String cost;
        private Customer customer;
        private String phone;

        public String getCost() {
            return this.cost;
        }

        public Customer getCustomer() {
            return this.customer;
        }

        public String getPhone() {
            return this.phone;
        }
    }

    public String getAmount() {
        return this.amount;
    }

    public BillingAddress getBilling() {
        return this.billing;
    }

    public Cart getCart() {
        return this.cart;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Merchant getMerchant() {
        return this.merchant;
    }

    public String getMerchantTransactionId() {
        return this.merchantTransactionId;
    }

    public ShippingAddress getShipping() {
        return this.shipping;
    }

    public String getTaxAmount() {
        return this.taxAmount;
    }
}
