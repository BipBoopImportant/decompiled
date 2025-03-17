package FH;

import EH.C15618c;
import EH.C15620e;
import EH.C15638w;
import FH.d;
import HJ.C15838d;
import HJ.C15854t;
import QH.C16246a;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001c¨\u0006\u001e"}, d2 = {"LFH/e;", "LFH/d$a;", "", "text", "LEH/c;", "contentType", "LEH/w;", "status", "<init>", "(Ljava/lang/String;LEH/c;LEH/w;)V", "", "e", "()[B", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getText", "b", "LEH/c;", "()LEH/c;", "c", "LEH/w;", "d", "()LEH/w;", "[B", "bytes", "", "()Ljava/lang/Long;", "contentLength", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends d.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f134397a;

    /* renamed from: b  reason: collision with root package name */
    private final C15618c f134398b;

    /* renamed from: c  reason: collision with root package name */
    private final C15638w f134399c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f134400d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, C15618c cVar, C15638w wVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, (i10 & 4) != 0 ? null : wVar);
    }

    public Long a() {
        return Long.valueOf((long) this.f134400d.length);
    }

    public C15618c b() {
        return this.f134398b;
    }

    public C15638w d() {
        return this.f134399c;
    }

    public byte[] e() {
        return this.f134400d;
    }

    public String toString() {
        return "TextContent[" + b() + "] \"" + C15854t.K1(this.f134397a, 30) + '\"';
    }

    public e(String str, C15618c cVar, C15638w wVar) {
        byte[] bArr;
        C17542s.j(str, "text");
        C17542s.j(cVar, "contentType");
        this.f134397a = str;
        this.f134398b = cVar;
        this.f134399c = wVar;
        Charset a10 = C15620e.a(b());
        a10 = a10 == null ? C15838d.f135279b : a10;
        if (C17542s.e(a10, C15838d.f135279b)) {
            bArr = C15854t.E(str);
        } else {
            CharsetEncoder newEncoder = a10.newEncoder();
            C17542s.i(newEncoder, "charset.newEncoder()");
            bArr = C16246a.g(newEncoder, str, 0, str.length());
        }
        this.f134400d = bArr;
    }
}
