package S1;

import R1.b;
import V1.s;
import V1.t;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"LS1/X;", "", "<init>", "()V", "LS1/W;", "typefaceRequest", "Lkotlin/Function1;", "LS1/Y;", "LXH/N;", "resolveTypeface", "LU0/A1;", "c", "(LS1/W;LnI/l;)LU0/A1;", "LV1/t;", "a", "LV1/t;", "b", "()LV1/t;", "lock", "LR1/b;", "LR1/b;", "resultCache", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class X {

    /* renamed from: a  reason: collision with root package name */
    private final t f13360a = s.a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b<W, Y> f13361b = new b<>(16);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LS1/Y;", "finalResult", "LXH/N;", "a", "(LS1/Y;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Y, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ X f13362c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ W f13363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(X x10, W w10) {
            super(1);
            this.f13362c = x10;
            this.f13363d = w10;
        }

        public final void a(Y y10) {
            t b10 = this.f13362c.b();
            X x10 = this.f13362c;
            W w10 = this.f13363d;
            synchronized (b10) {
                try {
                    if (y10.f()) {
                        x10.f13361b.e(w10, y10);
                    } else {
                        x10.f13361b.f(w10);
                    }
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Y) obj);
            return C16807N.f139792a;
        }
    }

    public final t b() {
        return this.f13360a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5 = (S1.Y) r5.invoke(new S1.X.a(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r0 = r3.f13360a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r3.f13361b.d(r4) != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r5.f() == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r3.f13361b.e(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r4 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        throw new java.lang.IllegalStateException("Could not load font", r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final U0.A1<java.lang.Object> c(S1.W r4, nI.C17642l<? super nI.C17642l<? super S1.Y, XH.C16807N>, ? extends S1.Y> r5) {
        /*
            r3 = this;
            V1.t r0 = r3.f13360a
            monitor-enter(r0)
            R1.b<S1.W, S1.Y> r1 = r3.f13361b     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = r1.d(r4)     // Catch:{ all -> 0x001e }
            S1.Y r1 = (S1.Y) r1     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0020
            boolean r2 = r1.f()     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x0015
            monitor-exit(r0)
            return r1
        L_0x0015:
            R1.b<S1.W, S1.Y> r1 = r3.f13361b     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = r1.f(r4)     // Catch:{ all -> 0x001e }
            S1.Y r1 = (S1.Y) r1     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r4 = move-exception
            goto L_0x0054
        L_0x0020:
            monitor-exit(r0)
            S1.X$a r0 = new S1.X$a     // Catch:{ Exception -> 0x004b }
            r0.<init>(r3, r4)     // Catch:{ Exception -> 0x004b }
            java.lang.Object r5 = r5.invoke(r0)     // Catch:{ Exception -> 0x004b }
            S1.Y r5 = (S1.Y) r5     // Catch:{ Exception -> 0x004b }
            V1.t r0 = r3.f13360a
            monitor-enter(r0)
            R1.b<S1.W, S1.Y> r1 = r3.f13361b     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = r1.d(r4)     // Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x0045
            boolean r1 = r5.f()     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0045
            R1.b<S1.W, S1.Y> r1 = r3.f13361b     // Catch:{ all -> 0x0043 }
            r1.e(r4, r5)     // Catch:{ all -> 0x0043 }
            goto L_0x0045
        L_0x0043:
            r4 = move-exception
            goto L_0x0049
        L_0x0045:
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)
            return r5
        L_0x0049:
            monitor-exit(r0)
            throw r4
        L_0x004b:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r5.<init>(r0, r4)
            throw r5
        L_0x0054:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.X.c(S1.W, nI.l):U0.A1");
    }
}
