package s1;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ls1/E;", "", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s1.E  reason: case insensitive filesystem */
public final class C5885E {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28922a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f28923b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls1/E$a;", "", "<init>", "()V", "", "isRobolectric", "Z", "a", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s1.E$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return C5885E.f28923b;
        }

        private a() {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f28923b = C17542s.e(lowerCase, "robolectric");
    }
}
