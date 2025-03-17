package WK;

import HJ.C15854t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0001*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0005*\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001c\u0010\u001f\u001a\u00020\u000e*\u00060\u001bj\u0002`\u001c8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ljava/io/OutputStream;", "LWK/L;", "e", "(Ljava/io/OutputStream;)LWK/L;", "Ljava/io/InputStream;", "LWK/N;", "i", "(Ljava/io/InputStream;)LWK/N;", "Ljava/net/Socket;", "f", "(Ljava/net/Socket;)LWK/L;", "j", "(Ljava/net/Socket;)LWK/N;", "Ljava/io/File;", "", "append", "d", "(Ljava/io/File;Z)LWK/L;", "b", "(Ljava/io/File;)LWK/L;", "h", "(Ljava/io/File;)LWK/N;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "a", "Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "c", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "okio/Okio")
final /* synthetic */ class z {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f139718a = Logger.getLogger("okio.Okio");

    public static final L b(File file) {
        C17542s.j(file, "<this>");
        return y.h(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        C17542s.j(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C15854t.d0(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    public static final L d(File file, boolean z10) {
        C17542s.j(file, "<this>");
        return y.h(new FileOutputStream(file, z10));
    }

    public static final L e(OutputStream outputStream) {
        C17542s.j(outputStream, "<this>");
        return new C16761D(outputStream, new O());
    }

    public static final L f(Socket socket) {
        C17542s.j(socket, "<this>");
        M m10 = new M(socket);
        OutputStream outputStream = socket.getOutputStream();
        C17542s.i(outputStream, "getOutputStream(...)");
        return m10.z(new C16761D(outputStream, m10));
    }

    public static /* synthetic */ L g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return y.g(file, z10);
    }

    public static final N h(File file) {
        C17542s.j(file, "<this>");
        return new u(new FileInputStream(file), O.f139626e);
    }

    public static final N i(InputStream inputStream) {
        C17542s.j(inputStream, "<this>");
        return new u(inputStream, new O());
    }

    public static final N j(Socket socket) {
        C17542s.j(socket, "<this>");
        M m10 = new M(socket);
        InputStream inputStream = socket.getInputStream();
        C17542s.i(inputStream, "getInputStream(...)");
        return m10.A(new u(inputStream, m10));
    }
}
