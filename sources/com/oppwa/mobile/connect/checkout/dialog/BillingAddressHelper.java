package com.oppwa.mobile.connect.checkout.dialog;

import android.text.TextUtils;
import com.oppwa.mobile.connect.payment.BillingAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class BillingAddressHelper {
    private static String a(String str) {
        if (str == null) {
            return null;
        }
        return C14072h.b().get(str);
    }

    public static boolean checkMandatoryFieldsArePreconfigured(BillingAddress billingAddress) {
        return isValid(billingAddress.isStreet1Required(), billingAddress.getStreet1()) && isValid(billingAddress.isStreet2Required(), billingAddress.getStreet2()) && isValid(billingAddress.isCityRequired(), billingAddress.getCity()) && isValid(billingAddress.isStateRequired(), billingAddress.getState()) && isValid(billingAddress.isPostCodeRequired(), billingAddress.getPostCode()) && isValid(billingAddress.isCountryRequired(), billingAddress.getCountry());
    }

    public static String getMergedBillingAddressData(BillingAddress billingAddress) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(billingAddress.getStreet1());
        arrayList.add(billingAddress.getStreet2());
        arrayList.add(mergeCityStatePostCode(billingAddress.getCity(), a(billingAddress.getCountry(), billingAddress.getState()), billingAddress.getPostCode()));
        arrayList.add(a(billingAddress.getCountry()));
        arrayList.removeAll(Arrays.asList(new String[]{null, ""}));
        return TextUtils.join("\n", arrayList);
    }

    public static boolean isValid(boolean z10, String str) {
        if (z10) {
            return !TextUtils.isEmpty(str);
        }
        return true;
    }

    public static String mergeCityStatePostCode(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.removeAll(Arrays.asList(new String[]{null, ""}));
        return TextUtils.join(", ", arrayList);
    }

    private static String a(String str, String str2) {
        Map<String, String> map;
        if (str != null) {
            if (CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY.equalsIgnoreCase(str)) {
                map = C14072h.c();
            } else {
                map = "CA".equalsIgnoreCase(str) ? C14072h.a() : null;
            }
            if (map != null && map.containsKey(str2)) {
                return map.get(str2);
            }
        }
        return str2;
    }
}
