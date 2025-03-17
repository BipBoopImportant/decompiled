package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.Display;
import android.widget.TextView;
import androidx.browser.customtabs.d;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.payment.token.Card;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Utils {
    private static SpannableString a(Context context, String str) {
        SpannableString valueOf = SpannableString.valueOf(Html.fromHtml(str));
        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
            int spanStart = valueOf.getSpanStart(uRLSpan);
            int spanEnd = valueOf.getSpanEnd(uRLSpan);
            valueOf.removeSpan(uRLSpan);
            valueOf.setSpan(new C14078j(context, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        return valueOf;
    }

    public static String createHtmlLinkTag(String str, String str2) {
        return String.format("<a target='_blank' href='%s'>%s</a>", new Object[]{str2, str});
    }

    public static void formatHtmlTextView(Context context, TextView textView, String str) {
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(a(context, str));
    }

    public static String formatPaymentBrandString(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split("_")) {
            if (str2.length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(' ');
                }
                if (str2.length() >= 2) {
                    sb2.append(str2.charAt(0));
                    sb2.append(str2.substring(1).toLowerCase());
                } else {
                    sb2.append(str2);
                }
            }
        }
        return sb2.toString();
    }

    public static d getCustomTabsIntent(Context context) {
        d.C0230d dVar = new d.C0230d();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.headerBackground, typedValue, true);
        dVar.l(typedValue.data);
        dVar.k(context, R.anim.opp_slide_in_right, R.anim.opp_slide_out_left);
        dVar.e(context, 17432578, 17432579);
        dVar.i(2);
        return dVar.a();
    }

    public static String getFormattedAmount(double d10, String str) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setCurrency(Currency.getInstance(str));
        currencyInstance.setMaximumFractionDigits(2);
        return currencyInstance.format(d10);
    }

    public static String getFormattedCardExpirationDate(Card card) {
        String expiryMonth = card.getExpiryMonth();
        String expiryYear = card.getExpiryYear();
        return expiryMonth + "/" + expiryYear.substring(expiryYear.length() - 2);
    }

    public static int getScreenWidth(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static boolean isScreenOrientationLandscape(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static String maskCardNumber(String str) {
        if (str.length() <= 4) {
            return "• " + str;
        }
        return "• " + str.substring(str.length() - 4);
    }

    public static String maskEmail(String str) {
        int indexOf;
        if (str.length() <= 0 || (indexOf = str.indexOf(64)) <= 0) {
            return str;
        }
        return str.charAt(0) + "***" + str.substring(indexOf);
    }

    public static String maskIban(String str) {
        if (str.length() <= 8) {
            return str;
        }
        return str.substring(0, 4) + " •••• " + str.substring(str.length() - 4);
    }

    public static void showCustomTabs(Context context, String str) {
        getCustomTabsIntent(context).a(context, Uri.parse(str));
    }
}
