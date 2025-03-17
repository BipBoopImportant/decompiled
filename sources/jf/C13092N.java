package JF;

import YH.C16877v;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "", "", "a", "(Ljava/util/List;)Ljava/lang/CharSequence;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: JF.N  reason: case insensitive filesystem */
public final class C13092N {
    public static final CharSequence a(List<String> list) {
        C17542s.j(list, "<this>");
        Iterable iterable = list;
        SpannableString spannableString = new SpannableString(C16877v.G0(iterable, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
        int i10 = 0;
        int i11 = 0;
        for (Object next : iterable) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            int length = ((String) next).length() + i11;
            int i13 = 1;
            if (i10 == list.size() - 1) {
                i13 = 0;
            }
            int i14 = length + i13;
            spannableString.setSpan(new BulletSpan(20), i11, i14, 0);
            i11 = i14;
            i10 = i12;
        }
        return spannableString;
    }
}
