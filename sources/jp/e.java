package jp;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b\"(\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00038F@FX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/widget/TextView;", "", "flag", "", "enabled", "LXH/N;", "a", "(Landroid/widget/TextView;IZ)V", "", "text", "b", "(Landroid/widget/TextView;Ljava/lang/CharSequence;)V", "value", "isUnderlined", "(Landroid/widget/TextView;)Z", "c", "(Landroid/widget/TextView;Z)V", "view_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    private static final void a(TextView textView, int i10, boolean z10) {
        int i11;
        if (z10) {
            i11 = i10 | textView.getPaintFlags();
        } else {
            i11 = (~i10) & textView.getPaintFlags();
        }
        textView.setPaintFlags(i11);
    }

    public static final void b(TextView textView, CharSequence charSequence) {
        C17542s.j(textView, "<this>");
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public static final void c(TextView textView, boolean z10) {
        C17542s.j(textView, "<this>");
        a(textView, 8, z10);
    }
}
