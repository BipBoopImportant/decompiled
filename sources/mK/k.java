package MK;

import GK.C15773A;
import HJ.C15854t;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LMK/k;", "", "LGK/A;", "protocol", "", "code", "", "message", "<init>", "(LGK/A;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "LGK/A;", "b", "I", "c", "Ljava/lang/String;", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f136476d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final C15773A f136477a;

    /* renamed from: b  reason: collision with root package name */
    public final int f136478b;

    /* renamed from: c  reason: collision with root package name */
    public final String f136479c;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LMK/k$a;", "", "<init>", "()V", "", "statusLine", "LMK/k;", "a", "(Ljava/lang/String;)LMK/k;", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String str) {
            int i10;
            C15773A a10;
            String str2;
            C17542s.j(str, "statusLine");
            if (C15854t.W(str, "HTTP/1.", false, 2, (Object) null)) {
                i10 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    a10 = C15773A.HTTP_1_0;
                } else if (charAt == 1) {
                    a10 = C15773A.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (C15854t.W(str, "ICY ", false, 2, (Object) null)) {
                a10 = C15773A.HTTP_1_0;
                i10 = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i11) {
                        str2 = "";
                    } else if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                        C17542s.i(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new k(a10, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }

        private a() {
        }
    }

    public k(C15773A a10, int i10, String str) {
        C17542s.j(a10, "protocol");
        C17542s.j(str, "message");
        this.f136477a = a10;
        this.f136478b = i10;
        this.f136479c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f136477a == C15773A.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f136478b);
        sb2.append(' ');
        sb2.append(this.f136479c);
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
