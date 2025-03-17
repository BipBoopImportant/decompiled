package l8;

import D8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Ll8/c;", "Ll8/d;", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "a", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l8.c  reason: case insensitive filesystem */
public final class C8539c extends C8540d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f54803e = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final String f54804d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll8/c$a;", "", "<init>", "()V", "", "EMPTY_VALUE", "Ljava/lang/String;", "", "MAX_LENGTH", "I", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l8.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8539c(String str, String str2) {
        super(str);
        String substring;
        C17542s.j(str, "key");
        C17542s.j(str2, "value");
        if (str2.length() == 0) {
            C8540d.f54805b.a().j("Dynamic Variable value is empty. Dynamic Variable is sent but the value is set to \"cs-empty\"");
            substring = "cs-empty";
        } else if (str2.length() > 255) {
            c a10 = C8540d.f54805b.a();
            a10.j("Dynamic Variable value is too long: the current input has a length of " + str2.length() + " while the limit is 255. Dynamic Variable is sent but the value truncated");
            substring = str2.substring(0, 255);
            C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            this.f54804d = str2;
            return;
        }
        this.f54804d = substring;
    }

    public final String c() {
        return this.f54804d;
    }
}
