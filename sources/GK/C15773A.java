package GK;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LGK/A;", "", "", "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.A  reason: case insensitive filesystem */
public enum C15773A {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final a Companion = null;
    /* access modifiers changed from: private */
    public final String protocol;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LGK/A$a;", "", "<init>", "()V", "", "protocol", "LGK/A;", "a", "(Ljava/lang/String;)LGK/A;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.A$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15773A a(String str) {
            C17542s.j(str, "protocol");
            C15773A a10 = C15773A.HTTP_1_0;
            if (!C17542s.e(str, a10.protocol)) {
                a10 = C15773A.HTTP_1_1;
                if (!C17542s.e(str, a10.protocol)) {
                    a10 = C15773A.H2_PRIOR_KNOWLEDGE;
                    if (!C17542s.e(str, a10.protocol)) {
                        a10 = C15773A.HTTP_2;
                        if (!C17542s.e(str, a10.protocol)) {
                            a10 = C15773A.SPDY_3;
                            if (!C17542s.e(str, a10.protocol)) {
                                a10 = C15773A.QUIC;
                                if (!C17542s.e(str, a10.protocol)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return a10;
        }

        private a() {
        }
    }

    static {
        Companion = new a((DefaultConstructorMarker) null);
    }

    private C15773A(String str) {
        this.protocol = str;
    }

    public String toString() {
        return this.protocol;
    }
}
