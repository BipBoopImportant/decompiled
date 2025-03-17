package GK;

import GK.C15805x;
import HJ.C15838d;
import HK.C15864d;
import WK.C16771f;
import WK.C16773h;
import XH.C16814e;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"LGK/C;", "", "<init>", "()V", "LGK/x;", "b", "()LGK/x;", "", "a", "()J", "LWK/f;", "sink", "LXH/N;", "h", "(LWK/f;)V", "", "f", "()Z", "g", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.C  reason: case insensitive filesystem */
public abstract class C15775C {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134790a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u0007*\u00020\u00132\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LGK/C$a;", "", "<init>", "()V", "", "LGK/x;", "contentType", "LGK/C;", "g", "(Ljava/lang/String;LGK/x;)LGK/C;", "LWK/h;", "e", "(LWK/h;LGK/x;)LGK/C;", "", "", "offset", "byteCount", "h", "([BLGK/x;II)LGK/C;", "Ljava/io/File;", "f", "(Ljava/io/File;LGK/x;)LGK/C;", "content", "b", "(LGK/x;Ljava/lang/String;)LGK/C;", "a", "(LGK/x;LWK/h;)LGK/C;", "d", "(LGK/x;[BII)LGK/C;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.C$a */
    public static final class a {

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"GK/C$a$a", "LGK/C;", "LGK/x;", "b", "()LGK/x;", "", "a", "()J", "LWK/f;", "sink", "LXH/N;", "h", "(LWK/f;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: GK.C$a$a  reason: collision with other inner class name */
        public static final class C3317a extends C15775C {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C15805x f134791b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ File f134792c;

            C3317a(C15805x xVar, File file) {
                this.f134791b = xVar;
                this.f134792c = file;
            }

            public long a() {
                return this.f134792c.length();
            }

            public C15805x b() {
                return this.f134791b;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
                jI.C17416c.a(r0, r3);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void h(WK.C16771f r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "sink"
                    kotlin.jvm.internal.C17542s.j(r3, r0)
                    java.io.File r0 = r2.f134792c
                    WK.N r0 = WK.y.k(r0)
                    r3.Y(r0)     // Catch:{ all -> 0x0013 }
                    r3 = 0
                    jI.C17416c.a(r0, r3)
                    return
                L_0x0013:
                    r3 = move-exception
                    throw r3     // Catch:{ all -> 0x0015 }
                L_0x0015:
                    r1 = move-exception
                    jI.C17416c.a(r0, r3)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: GK.C15775C.a.C3317a.h(WK.f):void");
            }
        }

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"GK/C$a$b", "LGK/C;", "LGK/x;", "b", "()LGK/x;", "", "a", "()J", "LWK/f;", "sink", "LXH/N;", "h", "(LWK/f;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: GK.C$a$b */
        public static final class b extends C15775C {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C15805x f134793b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16773h f134794c;

            b(C15805x xVar, C16773h hVar) {
                this.f134793b = xVar;
                this.f134794c = hVar;
            }

            public long a() {
                return (long) this.f134794c.W();
            }

            public C15805x b() {
                return this.f134793b;
            }

            public void h(C16771f fVar) {
                C17542s.j(fVar, "sink");
                fVar.j2(this.f134794c);
            }
        }

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"GK/C$a$c", "LGK/C;", "LGK/x;", "b", "()LGK/x;", "", "a", "()J", "LWK/f;", "sink", "LXH/N;", "h", "(LWK/f;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: GK.C$a$c */
        public static final class c extends C15775C {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C15805x f134795b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f134796c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ byte[] f134797d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f134798e;

            c(C15805x xVar, int i10, byte[] bArr, int i11) {
                this.f134795b = xVar;
                this.f134796c = i10;
                this.f134797d = bArr;
                this.f134798e = i11;
            }

            public long a() {
                return (long) this.f134796c;
            }

            public C15805x b() {
                return this.f134795b;
            }

            public void h(C16771f fVar) {
                C17542s.j(fVar, "sink");
                fVar.L(this.f134797d, this.f134798e, this.f134796c);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C15775C i(a aVar, C15805x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.d(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ C15775C j(a aVar, C16773h hVar, C15805x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.e(hVar, xVar);
        }

        public static /* synthetic */ C15775C k(a aVar, byte[] bArr, C15805x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.h(bArr, xVar, i10, i11);
        }

        @C16814e
        public final C15775C a(C15805x xVar, C16773h hVar) {
            C17542s.j(hVar, "content");
            return e(hVar, xVar);
        }

        @C16814e
        public final C15775C b(C15805x xVar, String str) {
            C17542s.j(str, "content");
            return g(str, xVar);
        }

        @C16814e
        public final C15775C c(C15805x xVar, byte[] bArr) {
            C17542s.j(bArr, "content");
            return i(this, xVar, bArr, 0, 0, 12, (Object) null);
        }

        @C16814e
        public final C15775C d(C15805x xVar, byte[] bArr, int i10, int i11) {
            C17542s.j(bArr, "content");
            return h(bArr, xVar, i10, i11);
        }

        public final C15775C e(C16773h hVar, C15805x xVar) {
            C17542s.j(hVar, "<this>");
            return new b(xVar, hVar);
        }

        public final C15775C f(File file, C15805x xVar) {
            C17542s.j(file, "<this>");
            return new C3317a(xVar, file);
        }

        public final C15775C g(String str, C15805x xVar) {
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
            byte[] bytes = str.getBytes(charset);
            C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
            return h(bytes, xVar, 0, bytes.length);
        }

        public final C15775C h(byte[] bArr, C15805x xVar, int i10, int i11) {
            C17542s.j(bArr, "<this>");
            C15864d.l((long) bArr.length, (long) i10, (long) i11);
            return new c(xVar, i11, bArr, i10);
        }

        private a() {
        }
    }

    @C16814e
    public static final C15775C c(C15805x xVar, C16773h hVar) {
        return f134790a.a(xVar, hVar);
    }

    @C16814e
    public static final C15775C d(C15805x xVar, String str) {
        return f134790a.b(xVar, str);
    }

    @C16814e
    public static final C15775C e(C15805x xVar, byte[] bArr) {
        return f134790a.c(xVar, bArr);
    }

    public long a() {
        return -1;
    }

    public abstract C15805x b();

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract void h(C16771f fVar);
}
