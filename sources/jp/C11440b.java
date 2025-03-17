package jp;

import android.os.Build;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/widget/TextView;", "", "isHeading", "LXH/N;", "a", "(Landroid/widget/TextView;Z)V", "view_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jp.b  reason: case insensitive filesystem */
public final class C11440b {
    public static final void a(TextView textView, boolean z10) {
        C17542s.j(textView, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setAccessibilityHeading(z10);
        }
    }
}
