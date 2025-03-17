package UK;

import WK.C16770e;
import WK.C16771f;
import WK.C16773h;
import com.optimizely.ab.config.Group;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010,\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0014\u0010.\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010!R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0004\u0018\u0001098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"LUK/h;", "Ljava/io/Closeable;", "", "isClient", "LWK/f;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLWK/f;Ljava/util/Random;ZZJ)V", "", "opcode", "LWK/h;", "payload", "LXH/N;", "d", "(ILWK/h;)V", "f", "(LWK/h;)V", "g", "code", "reason", "c", "formatOpcode", "data", "e", "close", "()V", "a", "Z", "b", "LWK/f;", "getSink", "()LWK/f;", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "J", "LWK/e;", "LWK/e;", "messageBuffer", "h", "sinkBuffer", "i", "writerClosed", "LUK/a;", "j", "LUK/a;", "messageDeflater", "", "k", "[B", "maskKey", "LWK/e$a;", "l", "LWK/e$a;", "maskCursor", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: UK.h  reason: case insensitive filesystem */
public final class C16641h implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f139249a;

    /* renamed from: b  reason: collision with root package name */
    private final C16771f f139250b;

    /* renamed from: c  reason: collision with root package name */
    private final Random f139251c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f139252d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f139253e;

    /* renamed from: f  reason: collision with root package name */
    private final long f139254f;

    /* renamed from: g  reason: collision with root package name */
    private final C16770e f139255g = new C16770e();

    /* renamed from: h  reason: collision with root package name */
    private final C16770e f139256h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f139257i;

    /* renamed from: j  reason: collision with root package name */
    private C16634a f139258j;

    /* renamed from: k  reason: collision with root package name */
    private final byte[] f139259k;

    /* renamed from: l  reason: collision with root package name */
    private final C16770e.a f139260l;

    public C16641h(boolean z10, C16771f fVar, Random random, boolean z11, boolean z12, long j10) {
        C17542s.j(fVar, "sink");
        C17542s.j(random, Group.RANDOM_POLICY);
        this.f139249a = z10;
        this.f139250b = fVar;
        this.f139251c = random;
        this.f139252d = z11;
        this.f139253e = z12;
        this.f139254f = j10;
        this.f139256h = fVar.p();
        C16770e.a aVar = null;
        this.f139259k = z10 ? new byte[4] : null;
        this.f139260l = z10 ? new C16770e.a() : aVar;
    }

    private final void d(int i10, C16773h hVar) {
        if (!this.f139257i) {
            int W10 = hVar.W();
            if (((long) W10) <= 125) {
                this.f139256h.Z1(i10 | 128);
                if (this.f139249a) {
                    this.f139256h.Z1(W10 | 128);
                    Random random = this.f139251c;
                    byte[] bArr = this.f139259k;
                    C17542s.g(bArr);
                    random.nextBytes(bArr);
                    this.f139256h.f1(this.f139259k);
                    if (W10 > 0) {
                        long size = this.f139256h.size();
                        this.f139256h.j2(hVar);
                        C16770e eVar = this.f139256h;
                        C16770e.a aVar = this.f139260l;
                        C17542s.g(aVar);
                        eVar.f0(aVar);
                        this.f139260l.f(size);
                        C16639f.f139232a.b(this.f139260l, this.f139259k);
                        this.f139260l.close();
                    }
                } else {
                    this.f139256h.Z1(W10);
                    this.f139256h.j2(hVar);
                }
                this.f139250b.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public final void c(int i10, C16773h hVar) {
        C16773h hVar2 = C16773h.f139665e;
        if (!(i10 == 0 && hVar == null)) {
            if (i10 != 0) {
                C16639f.f139232a.c(i10);
            }
            C16770e eVar = new C16770e();
            eVar.J1(i10);
            if (hVar != null) {
                eVar.j2(hVar);
            }
            hVar2 = eVar.i0();
        }
        try {
            d(8, hVar2);
        } finally {
            this.f139257i = true;
        }
    }

    public void close() {
        C16634a aVar = this.f139258j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void e(int i10, C16773h hVar) {
        C17542s.j(hVar, "data");
        if (!this.f139257i) {
            this.f139255g.j2(hVar);
            int i11 = i10 | 128;
            if (this.f139252d && ((long) hVar.W()) >= this.f139254f) {
                C16634a aVar = this.f139258j;
                if (aVar == null) {
                    aVar = new C16634a(this.f139253e);
                    this.f139258j = aVar;
                }
                aVar.c(this.f139255g);
                i11 = i10 | 192;
            }
            long size = this.f139255g.size();
            this.f139256h.Z1(i11);
            int i12 = this.f139249a ? 128 : 0;
            if (size <= 125) {
                this.f139256h.Z1(i12 | ((int) size));
            } else if (size <= 65535) {
                this.f139256h.Z1(i12 | 126);
                this.f139256h.J1((int) size);
            } else {
                this.f139256h.Z1(i12 | 127);
                this.f139256h.b1(size);
            }
            if (this.f139249a) {
                Random random = this.f139251c;
                byte[] bArr = this.f139259k;
                C17542s.g(bArr);
                random.nextBytes(bArr);
                this.f139256h.f1(this.f139259k);
                if (size > 0) {
                    C16770e eVar = this.f139255g;
                    C16770e.a aVar2 = this.f139260l;
                    C17542s.g(aVar2);
                    eVar.f0(aVar2);
                    this.f139260l.f(0);
                    C16639f.f139232a.b(this.f139260l, this.f139259k);
                    this.f139260l.close();
                }
            }
            this.f139256h.s3(this.f139255g, size);
            this.f139250b.Z();
            return;
        }
        throw new IOException("closed");
    }

    public final void f(C16773h hVar) {
        C17542s.j(hVar, "payload");
        d(9, hVar);
    }

    public final void g(C16773h hVar) {
        C17542s.j(hVar, "payload");
        d(10, hVar);
    }
}
