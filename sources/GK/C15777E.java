package GK;

import GK.C15805x;
import HJ.C15838d;
import HK.C15864d;
import WK.C16770e;
import WK.C16772g;
import XH.C16807N;
import XH.C16814e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 !2\u00020\u0001:\u0002\u001e!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u0018\u0010 \u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"LGK/E;", "Ljava/io/Closeable;", "<init>", "()V", "Ljava/nio/charset/Charset;", "f", "()Ljava/nio/charset/Charset;", "LGK/x;", "h", "()LGK/x;", "", "g", "()J", "Ljava/io/InputStream;", "c", "()Ljava/io/InputStream;", "LWK/g;", "k3", "()LWK/g;", "", "d", "()[B", "Ljava/io/Reader;", "e", "()Ljava/io/Reader;", "", "l", "()Ljava/lang/String;", "LXH/N;", "close", "a", "Ljava/io/Reader;", "reader", "b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.E  reason: case insensitive filesystem */
public abstract class C15777E implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    public static final b f134826b = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private Reader f134827a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LGK/E$a;", "Ljava/io/Reader;", "LWK/g;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(LWK/g;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "LXH/N;", "close", "()V", "a", "LWK/g;", "b", "Ljava/nio/charset/Charset;", "", "c", "Z", "closed", "d", "Ljava/io/Reader;", "delegate", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.E$a */
    public static final class a extends Reader {

        /* renamed from: a  reason: collision with root package name */
        private final C16772g f134828a;

        /* renamed from: b  reason: collision with root package name */
        private final Charset f134829b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f134830c;

        /* renamed from: d  reason: collision with root package name */
        private Reader f134831d;

        public a(C16772g gVar, Charset charset) {
            C17542s.j(gVar, "source");
            C17542s.j(charset, "charset");
            this.f134828a = gVar;
            this.f134829b = charset;
        }

        public void close() {
            C16807N n10;
            this.f134830c = true;
            Reader reader = this.f134831d;
            if (reader != null) {
                reader.close();
                n10 = C16807N.f139792a;
            } else {
                n10 = null;
            }
            if (n10 == null) {
                this.f134828a.close();
            }
        }

        public int read(char[] cArr, int i10, int i11) {
            C17542s.j(cArr, "cbuf");
            if (!this.f134830c) {
                Reader reader = this.f134831d;
                if (reader == null) {
                    reader = new InputStreamReader(this.f134828a.q3(), C15864d.K(this.f134828a, this.f134829b));
                    this.f134831d = reader;
                }
                return reader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LGK/E$b;", "", "<init>", "()V", "", "LGK/x;", "contentType", "LGK/E;", "c", "(Ljava/lang/String;LGK/x;)LGK/E;", "", "d", "([BLGK/x;)LGK/E;", "LWK/g;", "", "contentLength", "b", "(LWK/g;LGK/x;J)LGK/E;", "content", "a", "(LGK/x;JLWK/g;)LGK/E;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.E$b */
    public static final class b {

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"GK/E$b$a", "LGK/E;", "LGK/x;", "h", "()LGK/x;", "", "g", "()J", "LWK/g;", "k3", "()LWK/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: GK.E$b$a */
        public static final class a extends C15777E {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C15805x f134832c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f134833d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16772g f134834e;

            a(C15805x xVar, long j10, C16772g gVar) {
                this.f134832c = xVar;
                this.f134833d = j10;
                this.f134834e = gVar;
            }

            public long g() {
                return this.f134833d;
            }

            public C15805x h() {
                return this.f134832c;
            }

            public C16772g k3() {
                return this.f134834e;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C15777E e(b bVar, byte[] bArr, C15805x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return bVar.d(bArr, xVar);
        }

        @C16814e
        public final C15777E a(C15805x xVar, long j10, C16772g gVar) {
            C17542s.j(gVar, "content");
            return b(gVar, xVar, j10);
        }

        public final C15777E b(C16772g gVar, C15805x xVar, long j10) {
            C17542s.j(gVar, "<this>");
            return new a(xVar, j10, gVar);
        }

        public final C15777E c(String str, C15805x xVar) {
            C17542s.j(str, "<this>");
            Charset charset = C15838d.f135279b;
            if (xVar != null) {
                Charset d10 = C15805x.d(xVar, (Charset) null, 1, (Object) null);
                if (d10 == null) {
                    C15805x.a aVar = C15805x.f135130e;
                    xVar = aVar.b(xVar + "; charset=utf-8");
                } else {
                    charset = d10;
                }
            }
            C16770e y12 = new C16770e().y1(str, charset);
            return b(y12, xVar, y12.size());
        }

        public final C15777E d(byte[] bArr, C15805x xVar) {
            C17542s.j(bArr, "<this>");
            return b(new C16770e().f1(bArr), xVar, (long) bArr.length);
        }

        private b() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.c(HJ.C15838d.f135279b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.nio.charset.Charset f() {
        /*
            r2 = this;
            GK.x r0 = r2.h()
            if (r0 == 0) goto L_0x000e
            java.nio.charset.Charset r1 = HJ.C15838d.f135279b
            java.nio.charset.Charset r0 = r0.c(r1)
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.nio.charset.Charset r0 = HJ.C15838d.f135279b
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: GK.C15777E.f():java.nio.charset.Charset");
    }

    @C16814e
    public static final C15777E i(C15805x xVar, long j10, C16772g gVar) {
        return f134826b.a(xVar, j10, gVar);
    }

    public final InputStream c() {
        return k3().q3();
    }

    public void close() {
        C15864d.m(k3());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        jI.C17416c.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] d() {
        /*
            r6 = this;
            long r0 = r6.g()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0050
            WK.g r2 = r6.k3()
            byte[] r3 = r2.R1()     // Catch:{ all -> 0x0049 }
            r4 = 0
            jI.C17416c.a(r2, r4)
            int r2 = r3.length
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0048
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0024
            goto L_0x0048
        L_0x0024:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0048:
            return r3
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            jI.C17416c.a(r2, r0)
            throw r1
        L_0x0050:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: GK.C15777E.d():byte[]");
    }

    public final Reader e() {
        Reader reader = this.f134827a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(k3(), f());
        this.f134827a = aVar;
        return aVar;
    }

    public abstract long g();

    public abstract C15805x h();

    public abstract C16772g k3();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        jI.C17416c.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String l() {
        /*
            r3 = this;
            WK.g r0 = r3.k3()
            java.nio.charset.Charset r1 = r3.f()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = HK.C15864d.K(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.w2(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            jI.C17416c.a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            jI.C17416c.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: GK.C15777E.l():java.lang.String");
    }
}
