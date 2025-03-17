package U6;

import HJ.C15854t;
import N6.d;
import WK.C16760C;
import WK.C16770e;
import WK.C16772g;
import WK.C16773h;
import WK.N;
import WK.O;
import WK.y;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00060\u0001j\u0002`\u0002:\u0003\u0013\u0015\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001c\u0010*\u001a\b\u0018\u00010(R\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"LU6/i;", "Ljava/io/Closeable;", "Lokio/Closeable;", "LWK/g;", "source", "", "boundary", "<init>", "(LWK/g;Ljava/lang/String;)V", "", "maxResult", "g", "(J)J", "LU6/i$b;", "h", "()LU6/i$b;", "LXH/N;", "close", "()V", "a", "LWK/g;", "b", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "LWK/h;", "c", "LWK/h;", "dashDashBoundary", "d", "crlfDashDashBoundary", "", "e", "I", "partCount", "", "f", "Z", "closed", "noMoreParts", "LU6/i$c;", "LU6/i$c;", "currentPart", "LWK/C;", "i", "LWK/C;", "afterBoundaryOptions", "j", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class i implements Closeable {

    /* renamed from: j  reason: collision with root package name */
    private static final a f40287j = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C16772g f40288a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40289b;

    /* renamed from: c  reason: collision with root package name */
    private final C16773h f40290c;

    /* renamed from: d  reason: collision with root package name */
    private final C16773h f40291d;

    /* renamed from: e  reason: collision with root package name */
    private int f40292e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40293f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f40294g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public c f40295h;

    /* renamed from: i  reason: collision with root package name */
    private final C16760C f40296i;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LU6/i$a;", "", "<init>", "()V", "LWK/g;", "source", "", "LN6/d;", "b", "(LWK/g;)Ljava/util/List;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final List<d> b(C16772g gVar) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String Z02 = gVar.Z0();
                if (Z02.length() == 0) {
                    return arrayList;
                }
                int r02 = C15854t.r0(Z02, ':', 0, false, 6, (Object) null);
                if (r02 != -1) {
                    String substring = Z02.substring(0, r02);
                    C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String obj = C15854t.z1(substring).toString();
                    String substring2 = Z02.substring(r02 + 1);
                    C17542s.i(substring2, "this as java.lang.String).substring(startIndex)");
                    arrayList.add(new d(obj, C15854t.z1(substring2).toString()));
                } else {
                    throw new IllegalStateException(("Unexpected header: " + Z02).toString());
                }
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LU6/i$b;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "LN6/d;", "headers", "LWK/g;", "body", "<init>", "(Ljava/util/List;LWK/g;)V", "LXH/N;", "close", "()V", "a", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "b", "LWK/g;", "c", "()LWK/g;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f40297a;

        /* renamed from: b  reason: collision with root package name */
        private final C16772g f40298b;

        public b(List<d> list, C16772g gVar) {
            C17542s.j(list, "headers");
            C17542s.j(gVar, "body");
            this.f40297a = list;
            this.f40298b = gVar;
        }

        public final C16772g c() {
            return this.f40298b;
        }

        public void close() {
            this.f40298b.close();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LU6/i$c;", "LWK/N;", "<init>", "(LU6/i;)V", "LXH/N;", "close", "()V", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "LWK/O;", "y", "()LWK/O;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class c implements N {
        public c() {
        }

        public void close() {
            if (C17542s.e(i.this.f40295h, this)) {
                i.this.f40295h = null;
            }
        }

        public long u0(C16770e eVar, long j10) {
            C17542s.j(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (C17542s.e(i.this.f40295h, this)) {
                long c10 = i.this.g(j10);
                if (c10 == 0) {
                    return -1;
                }
                return i.this.f40288a.u0(eVar, c10);
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public O y() {
            return i.this.f40288a.y();
        }
    }

    public i(C16772g gVar, String str) {
        C17542s.j(gVar, "source");
        C17542s.j(str, "boundary");
        this.f40288a = gVar;
        this.f40289b = str;
        this.f40290c = new C16770e().D0("--").D0(str).i0();
        this.f40291d = new C16770e().D0("\r\n--").D0(str).i0();
        C16760C.a aVar = C16760C.f139587d;
        C16773h.a aVar2 = C16773h.f139664d;
        this.f40296i = aVar.d(aVar2.d("\r\n--" + str + "--"), aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d("\t"));
    }

    /* access modifiers changed from: private */
    public final long g(long j10) {
        this.f40288a.t1((long) this.f40291d.W());
        long S12 = this.f40288a.p().S1(this.f40291d);
        return S12 == -1 ? Math.min(j10, (this.f40288a.p().size() - ((long) this.f40291d.W())) + 1) : Math.min(j10, S12);
    }

    public void close() {
        if (!this.f40293f) {
            this.f40293f = true;
            this.f40295h = null;
            this.f40288a.close();
        }
    }

    public final b h() {
        if (this.f40293f) {
            throw new IllegalStateException("closed");
        } else if (this.f40294g) {
            return null;
        } else {
            if (this.f40292e != 0 || !this.f40288a.h3(0, this.f40290c)) {
                while (true) {
                    long g10 = g(8192);
                    if (g10 == 0) {
                        break;
                    }
                    this.f40288a.M(g10);
                }
                this.f40288a.M((long) this.f40291d.W());
            } else {
                this.f40288a.M((long) this.f40290c.W());
            }
            boolean z10 = false;
            while (true) {
                int z12 = this.f40288a.z1(this.f40296i);
                if (z12 == -1) {
                    throw new S6.a("unexpected characters after boundary", (Throwable) null, 2, (DefaultConstructorMarker) null);
                } else if (z12 != 0) {
                    if (z12 == 1) {
                        this.f40292e++;
                        List a10 = f40287j.b(this.f40288a);
                        c cVar = new c();
                        this.f40295h = cVar;
                        return new b(a10, y.d(cVar));
                    } else if (z12 != 2) {
                        if (z12 == 3 || z12 == 4) {
                            z10 = true;
                        }
                    } else if (z10) {
                        throw new S6.a("unexpected characters after boundary", (Throwable) null, 2, (DefaultConstructorMarker) null);
                    } else if (this.f40292e != 0) {
                        this.f40294g = true;
                        return null;
                    } else {
                        throw new S6.a("expected at least 1 part", (Throwable) null, 2, (DefaultConstructorMarker) null);
                    }
                } else if (this.f40292e != 0) {
                    this.f40294g = true;
                    return null;
                } else {
                    throw new S6.a("expected at least 1 part", (Throwable) null, 2, (DefaultConstructorMarker) null);
                }
            }
        }
    }
}
