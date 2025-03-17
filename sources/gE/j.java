package Ge;

import HJ.C15850p;
import XH.C16807N;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/widget/TextView;", "", "enableStreetNumberButton", "", "addressName", "subAddressName", "Lkotlin/Function1;", "LXH/N;", "addStreetNumberClicked", "b", "(Landroid/widget/TextView;ZLjava/lang/String;Ljava/lang/String;LnI/l;)V", "addresspicker-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    public static final void b(TextView textView, boolean z10, String str, String str2, C17642l<? super String, C16807N> lVar) {
        C17542s.j(textView, "<this>");
        C17542s.j(lVar, "addStreetNumberClicked");
        if (!z10 || str == null || new C15850p(".*\\d.*").i(str)) {
            textView.setVisibility(8);
            return;
        }
        String string = textView.getResources().getString(m.f60636a);
        C17542s.i(string, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(string);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        textView.setText(new SpannedString(spannableStringBuilder));
        textView.setVisibility(0);
        textView.setOnClickListener(new i(lVar, str));
        textView.setContentDescription(string + " " + str + " " + str2);
    }

    /* access modifiers changed from: private */
    public static final void c(C17642l lVar, String str, View view) {
        lVar.invoke(str.toString());
    }
}
