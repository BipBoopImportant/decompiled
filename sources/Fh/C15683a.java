package FH;

import EH.C15618c;
import EH.C15638w;
import FH.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0016¨\u0006\u0018"}, d2 = {"LFH/a;", "LFH/d$a;", "", "bytes", "LEH/c;", "contentType", "LEH/w;", "status", "<init>", "([BLEH/c;LEH/w;)V", "e", "()[B", "a", "[B", "b", "LEH/c;", "()LEH/c;", "c", "LEH/w;", "d", "()LEH/w;", "", "()Ljava/lang/Long;", "contentLength", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: FH.a  reason: case insensitive filesystem */
public final class C15683a extends d.a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f134389a;

    /* renamed from: b  reason: collision with root package name */
    private final C15618c f134390b;

    /* renamed from: c  reason: collision with root package name */
    private final C15638w f134391c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15683a(byte[] bArr, C15618c cVar, C15638w wVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? null : wVar);
    }

    public Long a() {
        return Long.valueOf((long) this.f134389a.length);
    }

    public C15618c b() {
        return this.f134390b;
    }

    public C15638w d() {
        return this.f134391c;
    }

    public byte[] e() {
        return this.f134389a;
    }

    public C15683a(byte[] bArr, C15618c cVar, C15638w wVar) {
        C17542s.j(bArr, "bytes");
        this.f134389a = bArr;
        this.f134390b = cVar;
        this.f134391c = wVar;
    }
}
