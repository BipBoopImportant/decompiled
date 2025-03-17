package io.ktor.utils.io.jvm.javaio;

import QJ.C16283A;
import QJ.F0;
import QJ.I0;
import dI.C17164e;
import io.ktor.utils.io.g;
import io.ktor.utils.io.i;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001\u0019\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ)\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lio/ktor/utils/io/jvm/javaio/d;", "Ljava/io/InputStream;", "LQJ/F0;", "parent", "Lio/ktor/utils/io/g;", "channel", "<init>", "(LQJ/F0;Lio/ktor/utils/io/g;)V", "", "available", "()I", "read", "", "b", "off", "len", "([BII)I", "LXH/N;", "close", "()V", "a", "Lio/ktor/utils/io/g;", "LQJ/A;", "LQJ/A;", "context", "io/ktor/utils/io/jvm/javaio/d$a", "c", "Lio/ktor/utils/io/jvm/javaio/d$a;", "loop", "d", "[B", "single", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d extends InputStream {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f143805a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C16283A f143806b;

    /* renamed from: c  reason: collision with root package name */
    private final a f143807c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f143808d;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"io/ktor/utils/io/jvm/javaio/d$a", "Lio/ktor/utils/io/jvm/javaio/a;", "LXH/N;", "h", "(LdI/e;)Ljava/lang/Object;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends a {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f143809g;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1", f = "Blocking.kt", l = {319, 38}, m = "loop")
        /* renamed from: io.ktor.utils.io.jvm.javaio.d$a$a  reason: collision with other inner class name */
        static final class C3512a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f143810c;

            /* renamed from: d  reason: collision with root package name */
            Object f143811d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f143812e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a f143813f;

            /* renamed from: g  reason: collision with root package name */
            int f143814g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3512a(a aVar, C17164e<? super C3512a> eVar) {
                super(eVar);
                this.f143813f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f143812e = obj;
                this.f143814g |= Integer.MIN_VALUE;
                return this.f143813f.h(this);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(F0 f02, d dVar) {
            super(f02);
            this.f143809g = dVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0083 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
        protected java.lang.Object h(dI.C17164e<? super XH.C16807N> r10) {
            /*
                r9 = this;
                boolean r0 = r10 instanceof io.ktor.utils.io.jvm.javaio.d.a.C3512a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                io.ktor.utils.io.jvm.javaio.d$a$a r0 = (io.ktor.utils.io.jvm.javaio.d.a.C3512a) r0
                int r1 = r0.f143814g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f143814g = r1
                goto L_0x0018
            L_0x0013:
                io.ktor.utils.io.jvm.javaio.d$a$a r0 = new io.ktor.utils.io.jvm.javaio.d$a$a
                r0.<init>(r9, r10)
            L_0x0018:
                java.lang.Object r10 = r0.f143812e
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f143814g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0044
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r2 = r0.f143810c
                io.ktor.utils.io.jvm.javaio.d$a r2 = (io.ktor.utils.io.jvm.javaio.d.a) r2
                XH.y.b(r10)
                goto L_0x0084
            L_0x0030:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0038:
                java.lang.Object r2 = r0.f143811d
                io.ktor.utils.io.jvm.javaio.a r2 = (io.ktor.utils.io.jvm.javaio.a) r2
                java.lang.Object r2 = r0.f143810c
                io.ktor.utils.io.jvm.javaio.d$a r2 = (io.ktor.utils.io.jvm.javaio.d.a) r2
                XH.y.b(r10)
                goto L_0x0061
            L_0x0044:
                XH.y.b(r10)
                r10 = 0
                r2 = r9
            L_0x0049:
                r2.result = r10
                r0.f143810c = r2
                r0.f143811d = r2
                r0.f143814g = r4
                java.lang.Object r10 = r2.j(r0)
                java.lang.Object r5 = eI.C17187b.f()
                if (r10 != r5) goto L_0x005e
                kotlin.coroutines.jvm.internal.h.c(r0)
            L_0x005e:
                if (r10 != r1) goto L_0x0061
                return r1
            L_0x0061:
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.ByteArray"
                kotlin.jvm.internal.C17542s.h(r10, r5)
                byte[] r10 = (byte[]) r10
                io.ktor.utils.io.jvm.javaio.d r5 = r2.f143809g
                io.ktor.utils.io.g r5 = r5.f143805a
                int r6 = r2.f()
                int r7 = r2.e()
                r0.f143810c = r2
                r8 = 0
                r0.f143811d = r8
                r0.f143814g = r3
                java.lang.Object r10 = r5.j(r10, r6, r7, r0)
                if (r10 != r1) goto L_0x0084
                return r1
            L_0x0084:
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                r5 = -1
                if (r10 != r5) goto L_0x0049
                io.ktor.utils.io.jvm.javaio.d r0 = r2.f143809g
                QJ.A r0 = r0.f143806b
                r0.l()
                r2.d(r10)
                XH.N r10 = XH.C16807N.f139792a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.d.a.h(dI.e):java.lang.Object");
        }
    }

    public d(F0 f02, g gVar) {
        C17542s.j(gVar, "channel");
        this.f143805a = gVar;
        this.f143806b = I0.a(f02);
        this.f143807c = new a(f02, this);
    }

    public int available() {
        return this.f143805a.e();
    }

    public synchronized void close() {
        try {
            super.close();
            i.a(this.f143805a);
            if (!this.f143806b.h()) {
                F0.a.a(this.f143806b, (CancellationException) null, 1, (Object) null);
            }
            this.f143807c.k();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized int read() {
        try {
            byte[] bArr = this.f143808d;
            if (bArr == null) {
                bArr = new byte[1];
                this.f143808d = bArr;
            }
            int m10 = this.f143807c.m(bArr, 0, 1);
            if (m10 == -1) {
                return -1;
            }
            if (m10 == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + m10 + " bytes.").toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int read(byte[] bArr, int i10, int i11) {
        a aVar;
        aVar = this.f143807c;
        C17542s.g(bArr);
        return aVar.m(bArr, i10, i11);
    }
}
