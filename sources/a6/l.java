package a6;

import QJ.C0;
import T5.r;
import X5.C6722g;
import X5.C6723h;
import X5.C6724i;
import X5.s;
import Z5.o;
import dI.C17164e;
import dI.C17168i;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"La6/l;", "LX5/i;", "LX5/s;", "source", "Lk6/q;", "options", "", "enforceMinimumFrameDelay", "<init>", "(LX5/s;Lk6/q;Z)V", "LX5/g;", "a", "(LdI/e;)Ljava/lang/Object;", "LX5/s;", "b", "Lk6/q;", "c", "Z", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements C6724i {

    /* renamed from: a  reason: collision with root package name */
    private final s f41483a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f41484b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f41485c;

    public l(s sVar, C8450q qVar, boolean z10) {
        this.f41483a = sVar;
        this.f41484b = qVar;
        this.f41485c = z10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        lI.C17553a.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X5.C6722g c(a6.l r4) {
        /*
            X5.s r0 = r4.f41483a
            boolean r1 = r4.f41485c
            X5.s r0 = b6.C7071b.a(r0, r1)
            WK.g r1 = r0.k3()     // Catch:{ all -> 0x009c }
            java.io.InputStream r1 = r1.q3()     // Catch:{ all -> 0x009c }
            android.graphics.Movie r1 = android.graphics.Movie.decodeStream(r1)     // Catch:{ all -> 0x009c }
            r2 = 0
            lI.C17553a.a(r0, r2)
            if (r1 == 0) goto L_0x0094
            int r0 = r1.width()
            if (r0 <= 0) goto L_0x0094
            int r0 = r1.height()
            if (r0 <= 0) goto L_0x0094
            a6.n r0 = new a6.n
            boolean r2 = r1.isOpaque()
            if (r2 == 0) goto L_0x0039
            k6.q r2 = r4.f41484b
            boolean r2 = k6.C8444k.i(r2)
            if (r2 == 0) goto L_0x0039
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
            goto L_0x004e
        L_0x0039:
            k6.q r2 = r4.f41484b
            android.graphics.Bitmap$Config r2 = k6.C8444k.l(r2)
            boolean r2 = r6.C8694b.d(r2)
            if (r2 == 0) goto L_0x0048
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x004e
        L_0x0048:
            k6.q r2 = r4.f41484b
            android.graphics.Bitmap$Config r2 = k6.C8444k.l(r2)
        L_0x004e:
            k6.q r3 = r4.f41484b
            l6.f r3 = r3.j()
            r0.<init>(r1, r2, r3)
            k6.q r1 = r4.f41484b
            int r1 = a6.m.d(r1)
            r2 = -2
            if (r1 == r2) goto L_0x0069
            k6.q r1 = r4.f41484b
            int r1 = a6.m.d(r1)
            r0.e(r1)
        L_0x0069:
            k6.q r1 = r4.f41484b
            nI.a r1 = a6.m.c(r1)
            k6.q r2 = r4.f41484b
            nI.a r2 = a6.m.b(r2)
            if (r1 != 0) goto L_0x0079
            if (r2 == 0) goto L_0x0080
        L_0x0079:
            androidx.vectordrawable.graphics.drawable.b r1 = b6.C7074e.c(r1, r2)
            r0.c(r1)
        L_0x0080:
            k6.q r4 = r4.f41484b
            a6.i r4 = a6.m.a(r4)
            r0.d(r4)
            X5.g r4 = new X5.g
            T5.n r0 = T5.u.c(r0)
            r1 = 0
            r4.<init>(r0, r1)
            return r4
        L_0x0094:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to decode GIF."
            r4.<init>(r0)
            throw r4
        L_0x009c:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x009e }
        L_0x009e:
            r1 = move-exception
            lI.C17553a.a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.l.c(a6.l):X5.g");
    }

    public Object a(C17164e<? super C6722g> eVar) {
        return C0.c((C17168i) null, new k(this), eVar, 1, (Object) null);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"La6/l$a;", "LX5/i$a;", "", "enforceMinimumFrameDelay", "<init>", "(Z)V", "LZ5/o;", "result", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LX5/i;", "a", "(LZ5/o;Lk6/q;LT5/r;)LX5/i;", "Z", "getEnforceMinimumFrameDelay", "()Z", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C6724i.a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f41486a;

        public a(boolean z10) {
            this.f41486a = z10;
        }

        public C6724i a(o oVar, C8450q qVar, r rVar) {
            if (!j.c(C6723h.f40673a, oVar.c().k3())) {
                return null;
            }
            return new l(oVar.c(), qVar, this.f41486a);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }
}
