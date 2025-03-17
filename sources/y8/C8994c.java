package y8;

import HJ.C15838d;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 92\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J#\u0010\u001d\u001a\u00020\u00002\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u00020\u00002\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u0007J\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010\u0007J\u000f\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010*R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010+R\u0016\u0010-\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010,R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u00101R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u00101R$\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102R$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u00102R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u00102R$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010*R\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010*R\u001c\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b7\u0010*\u0012\u0004\b8\u0010\u0003¨\u0006:"}, d2 = {"Ly8/c;", "", "<init>", "()V", "", "url", "m", "(Ljava/lang/String;)Ly8/c;", "method", "d", "source", "i", "", "code", "e", "(I)Ly8/c;", "", "time", "g", "(J)Ly8/c;", "l", "", "requestBody", "f", "([B)Ly8/c;", "responseBody", "h", "", "standardRequestHeaders", "j", "(Ljava/util/Map;)Ly8/c;", "standardResponseHeaders", "k", "customRequestHeaders", "b", "customResponseHeaders", "c", "Ly8/b;", "a", "()Ly8/b;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "I", "J", "requestStartTimeMillis", "timeToRequestCompletedMillis", "timeToResponseInitiatedMillis", "timeToResponseCompletedMillis", "[B", "Ljava/util/Map;", "requestHeaders", "responseHeaders", "n", "o", "p", "getSource$annotations", "q", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y8.c  reason: case insensitive filesystem */
public final class C8994c {

    /* renamed from: q  reason: collision with root package name */
    public static final a f58020q = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private String f58021a;

    /* renamed from: b  reason: collision with root package name */
    private String f58022b;

    /* renamed from: c  reason: collision with root package name */
    private int f58023c;

    /* renamed from: d  reason: collision with root package name */
    private long f58024d;

    /* renamed from: e  reason: collision with root package name */
    private long f58025e;

    /* renamed from: f  reason: collision with root package name */
    private long f58026f;

    /* renamed from: g  reason: collision with root package name */
    private long f58027g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f58028h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f58029i;

    /* renamed from: j  reason: collision with root package name */
    private Map<String, String> f58030j;

    /* renamed from: k  reason: collision with root package name */
    private Map<String, String> f58031k;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, String> f58032l;

    /* renamed from: m  reason: collision with root package name */
    private Map<String, String> f58033m;

    /* renamed from: n  reason: collision with root package name */
    private String f58034n;

    /* renamed from: o  reason: collision with root package name */
    private String f58035o;

    /* renamed from: p  reason: collision with root package name */
    private String f58036p = "native";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly8/c$a;", "", "<init>", "()V", "Ly8/c;", "a", "()Ly8/c;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y8.c$a */
    public static final class a {
        private a() {
        }

        public final C8994c a() {
            return new C8994c();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C8993b a() {
        byte[] bArr;
        byte[] bArr2;
        String str = this.f58022b;
        String str2 = this.f58021a;
        if (str == null || str2 == null) {
            return null;
        }
        long j10 = this.f58024d;
        int i10 = this.f58023c;
        long j11 = this.f58027g;
        String str3 = this.f58036p;
        byte[] bArr3 = this.f58028h;
        Integer valueOf = bArr3 != null ? Integer.valueOf(bArr3.length) : null;
        byte[] bArr4 = this.f58029i;
        Integer valueOf2 = bArr4 != null ? Integer.valueOf(bArr4.length) : null;
        Map<String, String> map = this.f58030j;
        Map<String, String> map2 = this.f58031k;
        String str4 = str3;
        Map<String, String> map3 = this.f58032l;
        Map<String, String> map4 = this.f58033m;
        String str5 = this.f58035o;
        Map<String, String> map5 = map;
        Map<String, String> map6 = map2;
        if (str5 != null) {
            byte[] bytes = str5.getBytes(C15838d.f135279b);
            C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
            bArr = bytes;
        } else {
            bArr = null;
        }
        String str6 = this.f58034n;
        if (str6 != null) {
            byte[] bytes2 = str6.getBytes(C15838d.f135279b);
            C17542s.i(bytes2, "this as java.lang.String).getBytes(charset)");
            bArr2 = bytes2;
        } else {
            bArr2 = null;
        }
        return new C8993b(j10, str, str2, i10, j10, j11, bArr3, valueOf, bArr4, valueOf2, map3, map4, bArr2, bArr, (byte[]) null, (byte[]) null, (byte[]) null, (Long) null, map5, map6, str4, (List) null, (Map) null, (byte[]) null, (Map) null, (byte[]) null, (Map) null, (Map) null, 266584064, (DefaultConstructorMarker) null);
    }

    public final C8994c b(String str) {
        this.f58034n = str;
        return this;
    }

    public final C8994c c(String str) {
        this.f58035o = str;
        return this;
    }

    public final C8994c d(String str) {
        this.f58022b = str;
        return this;
    }

    public final C8994c e(int i10) {
        this.f58023c = i10;
        return this;
    }

    public final C8994c f(byte[] bArr) {
        C17542s.j(bArr, "requestBody");
        this.f58028h = bArr;
        return this;
    }

    public final C8994c g(long j10) {
        this.f58024d = j10;
        return this;
    }

    public final C8994c h(byte[] bArr) {
        C17542s.j(bArr, "responseBody");
        this.f58029i = bArr;
        return this;
    }

    public final C8994c i(String str) {
        C17542s.j(str, "source");
        this.f58036p = str;
        return this;
    }

    public final C8994c j(Map<String, String> map) {
        this.f58032l = map;
        return this;
    }

    public final C8994c k(Map<String, String> map) {
        this.f58033m = map;
        return this;
    }

    public final C8994c l(long j10) {
        this.f58027g = j10;
        return this;
    }

    public final C8994c m(String str) {
        this.f58021a = str;
        return this;
    }

    public String toString() {
        return "NetworkEventBuilder{url='" + this.f58021a + "', method='" + this.f58022b + "', code=" + this.f58023c + ", requestStartTimeMicros=" + this.f58024d + ", timeToRequestCompletedMicros=" + this.f58025e + ", timeToResponseInitiatedMicros=" + this.f58026f + ", timeToResponseCompletedMicros=" + this.f58027g + ", source=" + this.f58036p + ", requestBody=" + this.f58028h + ", responseBody=" + this.f58029i + ", requestHeaders=" + this.f58030j + ", responseHeaders=" + this.f58031k + '}';
    }
}
