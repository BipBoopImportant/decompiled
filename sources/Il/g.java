package il;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lil/g;", "", "<init>", "()V", "", "article", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/MotionEvent;", "event", "Landroid/widget/EditText;", "editText", "", "b", "(Landroid/view/MotionEvent;Landroid/widget/EditText;)Z", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f98371a = new g();

    private g() {
    }

    public final String a(String str) {
        C17542s.j(str, "article");
        if (str.length() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (int i10 = 3; i10 < str.length(); i10 += 4) {
            sb2.insert(i10, ".");
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }

    public final boolean b(MotionEvent motionEvent, EditText editText) {
        C17542s.j(motionEvent, "event");
        C17542s.j(editText, "editText");
        Drawable drawable = editText.getCompoundDrawables()[2];
        return drawable != null && motionEvent.getRawX() >= ((float) (editText.getRight() - drawable.getBounds().width()));
    }
}
