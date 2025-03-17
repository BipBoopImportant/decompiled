package Vi;

import HJ.C15854t;
import YH.C16877v;
import Zo.b;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "searchText", "originalText", "Landroid/text/SpannableString;", "c", "(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;", "text", "spanText", "Landroid/text/style/StyleSpan;", "style", "Landroid/text/SpannableStringBuilder;", "a", "(Ljava/lang/String;Ljava/lang/String;Landroid/text/style/StyleSpan;)Landroid/text/SpannableStringBuilder;", "", "Landroid/text/style/CharacterStyle;", "styles", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannableStringBuilder;", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w0 {
    public static final SpannableStringBuilder a(String str, String str2, StyleSpan styleSpan) {
        C17542s.j(str, "text");
        C17542s.j(str2, "spanText");
        C17542s.j(styleSpan, "style");
        return b(str, str2, C16877v.e(styleSpan));
    }

    public static final SpannableStringBuilder b(String str, String str2, List<? extends CharacterStyle> list) {
        int s02;
        C17542s.j(str, "text");
        C17542s.j(str2, "spanText");
        C17542s.j(list, "styles");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (C15854t.v0(str) || C15854t.v0(str2) || (s02 = C15854t.s0(str, str2, 0, false, 6, (Object) null)) < 0) {
            return spannableStringBuilder;
        }
        int length = str2.length() + s02;
        for (CharacterStyle span : list) {
            spannableStringBuilder.setSpan(span, s02, length, 18);
        }
        return spannableStringBuilder;
    }

    public static final SpannableString c(String str, String str2) {
        C17542s.j(str, "searchText");
        C17542s.j(str2, "originalText");
        SpannableString spannableString = new SpannableString(str2);
        if (str.length() > 0 && str2.length() > 0) {
            b bVar = b.f90092a;
            String lowerCase = str2.toLowerCase(bVar.d());
            C17542s.i(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str.toLowerCase(bVar.d());
            C17542s.i(lowerCase2, "toLowerCase(...)");
            if (C15854t.d0(lowerCase, lowerCase2, false, 2, (Object) null)) {
                int s02 = C15854t.s0(lowerCase, lowerCase2, 0, false, 6, (Object) null);
                while (s02 >= 0) {
                    int min = Math.min(s02, str2.length());
                    int min2 = Math.min(s02 + str.length(), str2.length());
                    spannableString.setSpan(new UnderlineSpan(), min, min2, 33);
                    s02 = C15854t.s0(lowerCase, lowerCase2, min2, false, 4, (Object) null);
                }
            }
        }
        return spannableString;
    }
}
