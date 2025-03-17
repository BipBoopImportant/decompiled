package y8;

import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.network.models.UploadKt;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b6\b\b\u0018\u00002\u00020\u0001B¡\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0000¢\u0006\u0004\b,\u0010-J¸\u0003\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00042\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00101R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\b8\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010+R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u00104R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b7\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bG\u0010A\u001a\u0004\bH\u0010CR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010FR%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bQ\u0010A\u001a\u0004\b9\u0010CR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bR\u0010A\u001a\u0004\b<\u0010CR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bS\u0010A\u001a\u0004\bS\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\bG\u0010CR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\b>\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010U\u001a\u0004\b@\u0010VR%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bW\u0010L\u001a\u0004\bW\u0010NR%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b=\u0010L\u001a\u0004\bX\u0010NR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u00106\u001a\u0004\bY\u00101R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bI\u0010\\R%\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010L\u001a\u0004\bQ\u0010NR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bT\u0010CR%\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010L\u001a\u0004\bR\u0010NR\u0019\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bY\u0010A\u001a\u0004\bZ\u0010CR%\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bM\u0010L\u001a\u0004\bK\u0010NR%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bO\u0010N¨\u0006]"}, d2 = {"Ly8/b;", "", "", "timestampMs", "", "httpMethod", "url", "", "statusCode", "requestTime", "responseTime", "", "requestBody", "requestBodySize", "responseBody", "responseBodySize", "", "standardRequestHeaders", "standardResponseHeaders", "customRequestHeaders", "customResponseHeaders", "queryParameters", "initializationVector", "encryptedSymmetricKey", "encryptionPublicKeyId", "requestHeaders", "responseHeaders", "source", "", "matchingBodyContents", "plainRequestBodyAttributes", "requestBodyAttributes", "plainResponseBodyAttributes", "responseBodyAttributes", "plainCustomRequestHeaders", "plainCustomResponseHeaders", "<init>", "(JLjava/lang/String;Ljava/lang/String;IJJ[BLjava/lang/Integer;[BLjava/lang/Integer;Ljava/util/Map;Ljava/util/Map;[B[B[B[B[BLjava/lang/Long;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;[BLjava/util/Map;[BLjava/util/Map;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "c", "()Ly8/b;", "a", "(JLjava/lang/String;Ljava/lang/String;IJJ[BLjava/lang/Integer;[BLjava/lang/Integer;Ljava/util/Map;Ljava/util/Map;[B[B[B[B[BLjava/lang/Long;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;[BLjava/util/Map;[BLjava/util/Map;Ljava/util/Map;)Ly8/b;", "toString", "()Ljava/lang/String;", "J", "D", "()J", "b", "Ljava/lang/String;", "h", "E", "d", "I", "C", "e", "t", "f", "y", "g", "[B", "p", "()[B", "Ljava/lang/Integer;", "r", "()Ljava/lang/Integer;", "i", "u", "j", "w", "k", "Ljava/util/Map;", "A", "()Ljava/util/Map;", "l", "B", "m", "n", "o", "q", "Ljava/lang/Long;", "()Ljava/lang/Long;", "s", "x", "z", "v", "Ljava/util/List;", "()Ljava/util/List;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y8.b  reason: case insensitive filesystem */
public final class C8993b {

    /* renamed from: A  reason: collision with root package name */
    private final Map<String, String> f57992A;

    /* renamed from: B  reason: collision with root package name */
    private final Map<String, String> f57993B;

    /* renamed from: a  reason: collision with root package name */
    private final long f57994a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57995b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57996c;

    /* renamed from: d  reason: collision with root package name */
    private final int f57997d;

    /* renamed from: e  reason: collision with root package name */
    private final long f57998e;

    /* renamed from: f  reason: collision with root package name */
    private final long f57999f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f58000g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f58001h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f58002i;

    /* renamed from: j  reason: collision with root package name */
    private final Integer f58003j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, String> f58004k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, String> f58005l;

    /* renamed from: m  reason: collision with root package name */
    private final byte[] f58006m;

    /* renamed from: n  reason: collision with root package name */
    private final byte[] f58007n;

    /* renamed from: o  reason: collision with root package name */
    private final byte[] f58008o;

    /* renamed from: p  reason: collision with root package name */
    private final byte[] f58009p;

    /* renamed from: q  reason: collision with root package name */
    private final byte[] f58010q;

    /* renamed from: r  reason: collision with root package name */
    private final Long f58011r;

    /* renamed from: s  reason: collision with root package name */
    private final Map<String, String> f58012s;

    /* renamed from: t  reason: collision with root package name */
    private final Map<String, String> f58013t;

    /* renamed from: u  reason: collision with root package name */
    private final String f58014u;

    /* renamed from: v  reason: collision with root package name */
    private final List<String> f58015v;

    /* renamed from: w  reason: collision with root package name */
    private final Map<String, String> f58016w;

    /* renamed from: x  reason: collision with root package name */
    private final byte[] f58017x;

    /* renamed from: y  reason: collision with root package name */
    private final Map<String, String> f58018y;

    /* renamed from: z  reason: collision with root package name */
    private final byte[] f58019z;

    public C8993b(long j10, String str, String str2, int i10, long j11, long j12, byte[] bArr, Integer num, byte[] bArr2, Integer num2, Map<String, String> map, Map<String, String> map2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, Long l10, Map<String, String> map3, Map<String, String> map4, String str3, List<String> list, Map<String, String> map5, byte[] bArr8, Map<String, String> map6, byte[] bArr9, Map<String, String> map7, Map<String, String> map8) {
        String str4 = str3;
        C17542s.j(str, "httpMethod");
        C17542s.j(str2, "url");
        C17542s.j(str4, "source");
        this.f57994a = j10;
        this.f57995b = str;
        this.f57996c = str2;
        this.f57997d = i10;
        this.f57998e = j11;
        this.f57999f = j12;
        this.f58000g = bArr;
        this.f58001h = num;
        this.f58002i = bArr2;
        this.f58003j = num2;
        this.f58004k = map;
        this.f58005l = map2;
        this.f58006m = bArr3;
        this.f58007n = bArr4;
        this.f58008o = bArr5;
        this.f58009p = bArr6;
        this.f58010q = bArr7;
        this.f58011r = l10;
        this.f58012s = map3;
        this.f58013t = map4;
        this.f58014u = str4;
        this.f58015v = list;
        this.f58016w = map5;
        this.f58017x = bArr8;
        this.f58018y = map6;
        this.f58019z = bArr9;
        this.f57992A = map7;
        this.f57993B = map8;
    }

    public static /* synthetic */ C8993b b(C8993b bVar, long j10, String str, String str2, int i10, long j11, long j12, byte[] bArr, Integer num, byte[] bArr2, Integer num2, Map map, Map map2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, Long l10, Map map3, Map map4, String str3, List list, Map map5, byte[] bArr8, Map map6, byte[] bArr9, Map map7, Map map8, int i11, Object obj) {
        C8993b bVar2 = bVar;
        int i12 = i11;
        return bVar.a((i12 & 1) != 0 ? bVar2.f57994a : j10, (i12 & 2) != 0 ? bVar2.f57995b : str, (i12 & 4) != 0 ? bVar2.f57996c : str2, (i12 & 8) != 0 ? bVar2.f57997d : i10, (i12 & 16) != 0 ? bVar2.f57998e : j11, (i12 & 32) != 0 ? bVar2.f57999f : j12, (i12 & 64) != 0 ? bVar2.f58000g : bArr, (i12 & 128) != 0 ? bVar2.f58001h : num, (i12 & 256) != 0 ? bVar2.f58002i : bArr2, (i12 & 512) != 0 ? bVar2.f58003j : num2, (i12 & 1024) != 0 ? bVar2.f58004k : map, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? bVar2.f58005l : map2, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? bVar2.f58006m : bArr3, (i12 & 8192) != 0 ? bVar2.f58007n : bArr4, (i12 & 16384) != 0 ? bVar2.f58008o : bArr5, (i12 & 32768) != 0 ? bVar2.f58009p : bArr6, (i12 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? bVar2.f58010q : bArr7, (i12 & 131072) != 0 ? bVar2.f58011r : l10, (i12 & 262144) != 0 ? bVar2.f58012s : map3, (i12 & ImageMetadata.LENS_APERTURE) != 0 ? bVar2.f58013t : map4, (i12 & ImageMetadata.SHADING_MODE) != 0 ? bVar2.f58014u : str3, (i12 & UploadKt.MAX_CHUNK_SIZE) != 0 ? bVar2.f58015v : list, (i12 & 4194304) != 0 ? bVar2.f58016w : map5, (i12 & 8388608) != 0 ? bVar2.f58017x : bArr8, (i12 & 16777216) != 0 ? bVar2.f58018y : map6, (i12 & 33554432) != 0 ? bVar2.f58019z : bArr9, (i12 & 67108864) != 0 ? bVar2.f57992A : map7, (i12 & 134217728) != 0 ? bVar2.f57993B : map8);
    }

    public final Map<String, String> A() {
        return this.f58004k;
    }

    public final Map<String, String> B() {
        return this.f58005l;
    }

    public final int C() {
        return this.f57997d;
    }

    public final long D() {
        return this.f57994a;
    }

    public final String E() {
        return this.f57996c;
    }

    public final C8993b a(long j10, String str, String str2, int i10, long j11, long j12, byte[] bArr, Integer num, byte[] bArr2, Integer num2, Map<String, String> map, Map<String, String> map2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, Long l10, Map<String, String> map3, Map<String, String> map4, String str3, List<String> list, Map<String, String> map5, byte[] bArr8, Map<String, String> map6, byte[] bArr9, Map<String, String> map7, Map<String, String> map8) {
        long j13 = j10;
        C17542s.j(str, "httpMethod");
        C17542s.j(str2, "url");
        C17542s.j(str3, "source");
        return new C8993b(j10, str, str2, i10, j11, j12, bArr, num, bArr2, num2, map, map2, bArr3, bArr4, bArr5, bArr6, bArr7, l10, map3, map4, str3, list, map5, bArr8, map6, bArr9, map7, map8);
    }

    public final C8993b c() {
        return b(this, 0, (String) null, (String) null, 0, 0, 0, (byte[]) null, (Integer) null, (byte[]) null, (Integer) null, (Map) null, (Map) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (Long) null, (Map) null, (Map) null, (String) null, (List) null, (Map) null, (byte[]) null, (Map) null, (byte[]) null, (Map) null, (Map) null, 267386943, (Object) null);
    }

    public final byte[] d() {
        return this.f58006m;
    }

    public final byte[] e() {
        return this.f58007n;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C8993b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type com.contentsquare.android.core.communication.error.analysis.NetworkEvent");
        C8993b bVar = (C8993b) obj;
        if (this.f57994a != bVar.f57994a || !C17542s.e(this.f57995b, bVar.f57995b) || !C17542s.e(this.f57996c, bVar.f57996c) || this.f57997d != bVar.f57997d || this.f57998e != bVar.f57998e || this.f57999f != bVar.f57999f || !C17542s.e(this.f58003j, bVar.f58003j) || !C17542s.e(this.f58001h, bVar.f58001h)) {
            return false;
        }
        byte[] bArr3 = this.f58000g;
        if (bArr3 != null) {
            byte[] bArr4 = bVar.f58000g;
            if (bArr4 == null || !Arrays.equals(bArr3, bArr4)) {
                return false;
            }
        } else if (bVar.f58000g != null) {
            return false;
        }
        byte[] bArr5 = this.f58002i;
        if (bArr5 != null) {
            byte[] bArr6 = bVar.f58002i;
            if (bArr6 == null || !Arrays.equals(bArr5, bArr6)) {
                return false;
            }
        } else if (bVar.f58002i != null) {
            return false;
        }
        if (!C17542s.e(this.f58004k, bVar.f58004k) || !C17542s.e(this.f58005l, bVar.f58005l)) {
            return false;
        }
        byte[] bArr7 = this.f58006m;
        if (bArr7 != null) {
            byte[] bArr8 = bVar.f58006m;
            if (bArr8 == null || !Arrays.equals(bArr7, bArr8)) {
                return false;
            }
        } else if (bVar.f58006m != null) {
            return false;
        }
        byte[] bArr9 = this.f58007n;
        if (bArr9 != null) {
            byte[] bArr10 = bVar.f58007n;
            if (bArr10 == null || !Arrays.equals(bArr9, bArr10)) {
                return false;
            }
        } else if (bVar.f58007n != null) {
            return false;
        }
        byte[] bArr11 = this.f58008o;
        if (bArr11 != null) {
            byte[] bArr12 = bVar.f58008o;
            if (bArr12 == null || !Arrays.equals(bArr11, bArr12)) {
                return false;
            }
        } else if (bVar.f58008o != null) {
            return false;
        }
        byte[] bArr13 = this.f58009p;
        if (bArr13 != null) {
            byte[] bArr14 = bVar.f58009p;
            if (bArr14 == null || !Arrays.equals(bArr13, bArr14)) {
                return false;
            }
        } else if (bVar.f58009p != null) {
            return false;
        }
        byte[] bArr15 = this.f58010q;
        if (bArr15 != null) {
            byte[] bArr16 = bVar.f58010q;
            if (bArr16 == null || !Arrays.equals(bArr15, bArr16)) {
                return false;
            }
        } else if (bVar.f58010q != null) {
            return false;
        }
        if (!C17542s.e(this.f58011r, bVar.f58011r) || !C17542s.e(this.f58012s, bVar.f58012s) || !C17542s.e(this.f58013t, bVar.f58013t) || !C17542s.e(this.f58014u, bVar.f58014u) || !C17542s.e(this.f58015v, bVar.f58015v) || !C17542s.e(this.f58016w, bVar.f58016w)) {
            return false;
        }
        byte[] bArr17 = this.f58017x;
        if ((bArr17 != null && ((bArr2 = bVar.f58017x) == null || !Arrays.equals(bArr17, bArr2))) || !C17542s.e(this.f58018y, bVar.f58018y)) {
            return false;
        }
        byte[] bArr18 = this.f58019z;
        return (bArr18 == null || ((bArr = bVar.f58019z) != null && Arrays.equals(bArr18, bArr))) && C17542s.e(this.f57992A, bVar.f57992A) && C17542s.e(this.f57993B, bVar.f57993B);
    }

    public final byte[] f() {
        return this.f58010q;
    }

    public final Long g() {
        return this.f58011r;
    }

    public final String h() {
        return this.f57995b;
    }

    public int hashCode() {
        int hashCode = (Long.hashCode(this.f57999f) + ((Long.hashCode(this.f57998e) + ((((this.f57996c.hashCode() + ((this.f57995b.hashCode() + (Long.hashCode(this.f57994a) * 31)) * 31)) * 31) + this.f57997d) * 31)) * 31)) * 31;
        byte[] bArr = this.f58000g;
        int i10 = 0;
        int hashCode2 = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        Integer num = this.f58001h;
        int intValue = (hashCode2 + (num != null ? num.intValue() : 0)) * 31;
        byte[] bArr2 = this.f58002i;
        int hashCode3 = (intValue + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31;
        Integer num2 = this.f58003j;
        int intValue2 = (hashCode3 + (num2 != null ? num2.intValue() : 0)) * 31;
        Map<String, String> map = this.f58004k;
        int hashCode4 = (intValue2 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.f58005l;
        int hashCode5 = (hashCode4 + (map2 != null ? map2.hashCode() : 0)) * 31;
        byte[] bArr3 = this.f58006m;
        int hashCode6 = (hashCode5 + (bArr3 != null ? Arrays.hashCode(bArr3) : 0)) * 31;
        byte[] bArr4 = this.f58007n;
        int hashCode7 = (hashCode6 + (bArr4 != null ? Arrays.hashCode(bArr4) : 0)) * 31;
        byte[] bArr5 = this.f58008o;
        int hashCode8 = (hashCode7 + (bArr5 != null ? Arrays.hashCode(bArr5) : 0)) * 31;
        byte[] bArr6 = this.f58009p;
        int hashCode9 = (hashCode8 + (bArr6 != null ? Arrays.hashCode(bArr6) : 0)) * 31;
        byte[] bArr7 = this.f58010q;
        int hashCode10 = (hashCode9 + (bArr7 != null ? Arrays.hashCode(bArr7) : 0)) * 31;
        Long l10 = this.f58011r;
        int hashCode11 = (hashCode10 + (l10 != null ? l10.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.f58012s;
        int hashCode12 = (hashCode11 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, String> map4 = this.f58013t;
        int hashCode13 = (this.f58014u.hashCode() + ((hashCode12 + (map4 != null ? map4.hashCode() : 0)) * 31)) * 31;
        List<String> list = this.f58015v;
        int hashCode14 = (hashCode13 + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, String> map5 = this.f58016w;
        int hashCode15 = (hashCode14 + (map5 != null ? map5.hashCode() : 0)) * 31;
        byte[] bArr8 = this.f58017x;
        int hashCode16 = (hashCode15 + (bArr8 != null ? Arrays.hashCode(bArr8) : 0)) * 31;
        Map<String, String> map6 = this.f58018y;
        int hashCode17 = (hashCode16 + (map6 != null ? map6.hashCode() : 0)) * 31;
        byte[] bArr9 = this.f58019z;
        int hashCode18 = (hashCode17 + (bArr9 != null ? Arrays.hashCode(bArr9) : 0)) * 31;
        Map<String, String> map7 = this.f57992A;
        int hashCode19 = (hashCode18 + (map7 != null ? map7.hashCode() : 0)) * 31;
        Map<String, String> map8 = this.f57993B;
        if (map8 != null) {
            i10 = map8.hashCode();
        }
        return hashCode19 + i10;
    }

    public final byte[] i() {
        return this.f58009p;
    }

    public final List<String> j() {
        return this.f58015v;
    }

    public final Map<String, String> k() {
        return this.f57992A;
    }

    public final Map<String, String> l() {
        return this.f57993B;
    }

    public final Map<String, String> m() {
        return this.f58016w;
    }

    public final Map<String, String> n() {
        return this.f58018y;
    }

    public final byte[] o() {
        return this.f58008o;
    }

    public final byte[] p() {
        return this.f58000g;
    }

    public final byte[] q() {
        return this.f58017x;
    }

    public final Integer r() {
        return this.f58001h;
    }

    public final Map<String, String> s() {
        return this.f58012s;
    }

    public final long t() {
        return this.f57998e;
    }

    public String toString() {
        return "NetworkEvent(timestampMs=" + this.f57994a + ", httpMethod=" + this.f57995b + ", url=" + this.f57996c + ", statusCode=" + this.f57997d + ", requestTime=" + this.f57998e + ", responseTime=" + this.f57999f + ", requestBody=" + Arrays.toString(this.f58000g) + ", requestBodySize=" + this.f58001h + ", responseBody=" + Arrays.toString(this.f58002i) + ", responseBodySize=" + this.f58003j + ", standardRequestHeaders=" + this.f58004k + ", standardResponseHeaders=" + this.f58005l + ", customRequestHeaders=" + Arrays.toString(this.f58006m) + ", customResponseHeaders=" + Arrays.toString(this.f58007n) + ", queryParameters=" + Arrays.toString(this.f58008o) + ", initializationVector=" + Arrays.toString(this.f58009p) + ", encryptedSymmetricKey=" + Arrays.toString(this.f58010q) + ", encryptionPublicKeyId=" + this.f58011r + ", requestHeaders=" + this.f58012s + ", responseHeaders=" + this.f58013t + ", source=" + this.f58014u + ", matchingBodyContents=" + this.f58015v + ", plainRequestBodyAttributes=" + this.f58016w + ", requestBodyAttributes=" + Arrays.toString(this.f58017x) + ", plainResponseBodyAttributes=" + this.f58018y + ", responseBodyAttributes=" + Arrays.toString(this.f58019z) + ", plainCustomRequestHeaders=" + this.f57992A + ", plainCustomResponseHeaders=" + this.f57993B + ')';
    }

    public final byte[] u() {
        return this.f58002i;
    }

    public final byte[] v() {
        return this.f58019z;
    }

    public final Integer w() {
        return this.f58003j;
    }

    public final Map<String, String> x() {
        return this.f58013t;
    }

    public final long y() {
        return this.f57999f;
    }

    public final String z() {
        return this.f58014u;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C8993b(long r36, java.lang.String r38, java.lang.String r39, int r40, long r41, long r43, byte[] r45, java.lang.Integer r46, byte[] r47, java.lang.Integer r48, java.util.Map r49, java.util.Map r50, byte[] r51, byte[] r52, byte[] r53, byte[] r54, byte[] r55, java.lang.Long r56, java.util.Map r57, java.util.Map r58, java.lang.String r59, java.util.List r60, java.util.Map r61, byte[] r62, java.util.Map r63, byte[] r64, java.util.Map r65, java.util.Map r66, int r67, kotlin.jvm.internal.DefaultConstructorMarker r68) {
        /*
            r35 = this;
            r0 = r67
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r13 = r2
            goto L_0x000b
        L_0x0009:
            r13 = r45
        L_0x000b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0011
            r14 = r2
            goto L_0x0013
        L_0x0011:
            r14 = r46
        L_0x0013:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0019
            r15 = r2
            goto L_0x001b
        L_0x0019:
            r15 = r47
        L_0x001b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0022
            r16 = r2
            goto L_0x0024
        L_0x0022:
            r16 = r48
        L_0x0024:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x002b
            r17 = r2
            goto L_0x002d
        L_0x002b:
            r17 = r49
        L_0x002d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0034
            r18 = r2
            goto L_0x0036
        L_0x0034:
            r18 = r50
        L_0x0036:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x003d
            r19 = r2
            goto L_0x003f
        L_0x003d:
            r19 = r51
        L_0x003f:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0046
            r20 = r2
            goto L_0x0048
        L_0x0046:
            r20 = r52
        L_0x0048:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x004f
            r21 = r2
            goto L_0x0051
        L_0x004f:
            r21 = r53
        L_0x0051:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005a
            r22 = r2
            goto L_0x005c
        L_0x005a:
            r22 = r54
        L_0x005c:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0064
            r23 = r2
            goto L_0x0066
        L_0x0064:
            r23 = r55
        L_0x0066:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x006e
            r24 = r2
            goto L_0x0070
        L_0x006e:
            r24 = r56
        L_0x0070:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0078
            r25 = r2
            goto L_0x007a
        L_0x0078:
            r25 = r57
        L_0x007a:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0082
            r26 = r2
            goto L_0x0084
        L_0x0082:
            r26 = r58
        L_0x0084:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008c
            r28 = r2
            goto L_0x008e
        L_0x008c:
            r28 = r60
        L_0x008e:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0096
            r29 = r2
            goto L_0x0098
        L_0x0096:
            r29 = r61
        L_0x0098:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a0
            r30 = r2
            goto L_0x00a2
        L_0x00a0:
            r30 = r62
        L_0x00a2:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00aa
            r31 = r2
            goto L_0x00ac
        L_0x00aa:
            r31 = r63
        L_0x00ac:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b4
            r32 = r2
            goto L_0x00b6
        L_0x00b4:
            r32 = r64
        L_0x00b6:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00be
            r33 = r2
            goto L_0x00c0
        L_0x00be:
            r33 = r65
        L_0x00c0:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00c8
            r34 = r2
            goto L_0x00ca
        L_0x00c8:
            r34 = r66
        L_0x00ca:
            r3 = r35
            r4 = r36
            r6 = r38
            r7 = r39
            r8 = r40
            r9 = r41
            r11 = r43
            r27 = r59
            r3.<init>(r4, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.C8993b.<init>(long, java.lang.String, java.lang.String, int, long, long, byte[], java.lang.Integer, byte[], java.lang.Integer, java.util.Map, java.util.Map, byte[], byte[], byte[], byte[], byte[], java.lang.Long, java.util.Map, java.util.Map, java.lang.String, java.util.List, java.util.Map, byte[], java.util.Map, byte[], java.util.Map, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
