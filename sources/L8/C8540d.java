package l8;

import D8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b \u0018\u0000 \b2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll8/d;", "", "", "key", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l8.d  reason: case insensitive filesystem */
public abstract class C8540d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f54805b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static c f54806c = new c("DynamicVar");

    /* renamed from: a  reason: collision with root package name */
    private final String f54807a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll8/d$a;", "", "<init>", "()V", "LD8/c;", "logger", "LD8/c;", "a", "()LD8/c;", "setLogger$library_release", "(LD8/c;)V", "", "DEFAULT_KEY_VALUE", "Ljava/lang/String;", "", "KEY_MAX_LENGTH", "I", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l8.d$a */
    public static final class a {
        private a() {
        }

        public final c a() {
            return C8540d.f54806c;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C8540d(String str) {
        C17542s.j(str, "key");
        if (str.length() == 0) {
            f54806c.j("Dynamic Variable key is empty. Dynamic Variable is sent but the key is set to \"cs-empty\"");
            str = "cs-empty";
        } else if (str.length() > 512) {
            c cVar = f54806c;
            cVar.j("Dynamic Variable key is too long: the current input has a length of " + str.length() + " while the limit is 512. Dynamic Variable is sent but the key truncated");
            str = str.substring(0, 512);
            C17542s.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        this.f54807a = str;
    }

    public final String b() {
        return this.f54807a;
    }
}
