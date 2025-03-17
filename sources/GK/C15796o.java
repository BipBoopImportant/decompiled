package GK;

import WK.C16773h;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LGK/o;", "", "<init>", "()V", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.o  reason: case insensitive filesystem */
public final class C15796o {

    /* renamed from: a  reason: collision with root package name */
    public static final C15796o f135078a = new C15796o();

    private C15796o() {
    }

    public static final String a(String str, String str2, Charset charset) {
        C17542s.j(str, "username");
        C17542s.j(str2, "password");
        C17542s.j(charset, "charset");
        String a10 = C16773h.f139664d.c(str + ':' + str2, charset).a();
        return "Basic " + a10;
    }
}
