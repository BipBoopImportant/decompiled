package EH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LEH/z;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "headerValue", "", "position", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "getHeaderValue", "()Ljava/lang/String;", "b", "I", "getPosition", "()I", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.z  reason: case insensitive filesystem */
public final class C15641z extends IllegalArgumentException {

    /* renamed from: a  reason: collision with root package name */
    private final String f134219a;

    /* renamed from: b  reason: collision with root package name */
    private final int f134220b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15641z(String str, int i10) {
        super("Header value '" + str + "' contains illegal character '" + str.charAt(i10) + "' (code " + (str.charAt(i10) & 255) + ')');
        C17542s.j(str, "headerValue");
        this.f134219a = str;
        this.f134220b = i10;
    }
}
