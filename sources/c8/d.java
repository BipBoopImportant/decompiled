package C8;

import HJ.C15838d;
import YH.X;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR4\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR$\u0010(\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b\u001f\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00101\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010*\u001a\u0004\b\u0011\u0010,\"\u0004\b0\u0010.R\u0011\u00102\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b\b\u0010,¨\u00063"}, d2 = {"LC8/d;", "", "<init>", "()V", "", "p", "()Z", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "endpoint", "", "", "b", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "l", "(Ljava/util/Map;)V", "headers", "", "I", "f", "()I", "m", "(I)V", "status", "d", "g", "n", "stringResponse", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "k", "(Ljava/lang/Throwable;)V", "exception", "", "J", "h", "()J", "o", "(J)V", "timeSpentMsec", "i", "dataSentBytes", "dataReceivedBytes", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private String f33762a = "";

    /* renamed from: b  reason: collision with root package name */
    private Map<String, ? extends List<String>> f33763b = X.j();

    /* renamed from: c  reason: collision with root package name */
    private int f33764c = -1;

    /* renamed from: d  reason: collision with root package name */
    private String f33765d;

    /* renamed from: e  reason: collision with root package name */
    private Throwable f33766e;

    /* renamed from: f  reason: collision with root package name */
    private long f33767f;

    /* renamed from: g  reason: collision with root package name */
    private long f33768g;

    public final long a() {
        String str = this.f33765d;
        if (str != null) {
            byte[] bytes = str.getBytes(C15838d.f135279b);
            C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes != null) {
                return (long) bytes.length;
            }
        }
        return 0;
    }

    public final long b() {
        return this.f33768g;
    }

    public final String c() {
        return this.f33762a;
    }

    public final Throwable d() {
        return this.f33766e;
    }

    public final Map<String, List<String>> e() {
        return this.f33763b;
    }

    public final int f() {
        return this.f33764c;
    }

    public final String g() {
        return this.f33765d;
    }

    public final long h() {
        return this.f33767f;
    }

    public final void i(long j10) {
        this.f33768g = j10;
    }

    public final void j(String str) {
        C17542s.j(str, "<set-?>");
        this.f33762a = str;
    }

    public final void k(Throwable th2) {
        this.f33766e = th2;
    }

    public final void l(Map<String, ? extends List<String>> map) {
        C17542s.j(map, "<set-?>");
        this.f33763b = map;
    }

    public final void m(int i10) {
        this.f33764c = i10;
    }

    public final void n(String str) {
        this.f33765d = str;
    }

    public final void o(long j10) {
        this.f33767f = j10;
    }

    public final boolean p() {
        return e.f33769a.a(this.f33764c) == f.SUCCESS;
    }
}
