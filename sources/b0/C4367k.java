package B0;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import kotlin.Metadata;
import y1.C6256d;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"LB0/k;", "", "<init>", "()V", "Ly1/b;", "event", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "Ljava/lang/Integer;", "deadKeyCode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B0.k  reason: case insensitive filesystem */
public final class C4367k {

    /* renamed from: a  reason: collision with root package name */
    private Integer f5097a;

    public final Integer a(KeyEvent keyEvent) {
        int c10 = C6256d.c(keyEvent);
        Integer num = null;
        if ((Integer.MIN_VALUE & c10) != 0) {
            this.f5097a = Integer.valueOf(c10 & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.f5097a;
        if (num2 == null) {
            return Integer.valueOf(c10);
        }
        this.f5097a = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), c10));
        if (valueOf.intValue() != 0) {
            num = valueOf;
        }
        return num == null ? Integer.valueOf(c10) : num;
    }
}
