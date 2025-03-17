package L2;

import H2.i;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f9058a = new String[0];

    /* renamed from: L2.a$a  reason: collision with other inner class name */
    private static class C0127a {
        static void a(EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    private static class b {
        static void a(EditorInfo editorInfo, boolean z10) {
            editorInfo.setStylusHandwritingEnabled(z10);
        }
    }

    private static boolean a(CharSequence charSequence, int i10, int i11) {
        if (i11 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i10));
        }
        if (i11 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i10));
    }

    private static boolean b(int i10) {
        int i11 = i10 & 4095;
        return i11 == 129 || i11 == 225 || i11 == 18;
    }

    public static void c(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void d(EditorInfo editorInfo, CharSequence charSequence, int i10) {
        i.g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C0127a.a(editorInfo, charSequence, i10);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 - i10 : i11 - i10;
        int i14 = i11 > i12 ? i11 - i10 : i12 - i10;
        int length = charSequence.length();
        if (i10 < 0 || i13 < 0 || i14 > length) {
            g(editorInfo, (CharSequence) null, 0, 0);
        } else if (b(editorInfo.inputType)) {
            g(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            g(editorInfo, charSequence, i13, i14);
        } else {
            h(editorInfo, charSequence, i13, i14);
        }
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0127a.a(editorInfo, charSequence, 0);
        } else {
            d(editorInfo, charSequence, 0);
        }
    }

    public static void f(EditorInfo editorInfo, boolean z10) {
        if (D2.a.b()) {
            b.a(editorInfo, z10);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z10);
    }

    private static void g(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    private static void h(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        int i12 = i11 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int min = Math.min(charSequence.length() - i11, i14 - Math.min(i10, (int) (((double) i14) * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        if (a(charSequence, i15, 0)) {
            i15++;
            min2--;
        }
        if (a(charSequence, (i11 + min) - 1, 1)) {
            min--;
        }
        g(editorInfo, i13 != i12 ? TextUtils.concat(new CharSequence[]{charSequence.subSequence(i15, i15 + min2), charSequence.subSequence(i11, min + i11)}) : charSequence.subSequence(i15, min2 + i13 + min + i15), min2, i13 + min2);
    }
}
