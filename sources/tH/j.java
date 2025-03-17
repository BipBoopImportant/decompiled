package tH;

import GK.C15775C;
import GK.C15805x;
import io.ktor.utils.io.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LtH/j;", "LGK/C;", "", "contentLength", "Lkotlin/Function0;", "Lio/ktor/utils/io/g;", "block", "<init>", "(Ljava/lang/Long;LnI/a;)V", "LGK/x;", "b", "()LGK/x;", "LWK/f;", "sink", "LXH/N;", "h", "(LWK/f;)V", "a", "()J", "", "g", "()Z", "Ljava/lang/Long;", "c", "LnI/a;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends C15775C {

    /* renamed from: b  reason: collision with root package name */
    private final Long f147310b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<g> f147311c;

    public j(Long l10, C17631a<? extends g> aVar) {
        C17542s.j(aVar, "block");
        this.f147310b = l10;
        this.f147311c = aVar;
    }

    public long a() {
        Long l10 = this.f147310b;
        if (l10 != null) {
            return l10.longValue();
        }
        return -1;
    }

    public C15805x b() {
        return null;
    }

    public boolean g() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c A[Catch:{ IOException -> 0x0035, all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[Catch:{ IOException -> 0x0035, all -> 0x0033 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(WK.C16771f r7) {
        /*
            r6 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            nI.a<io.ktor.utils.io.g> r0 = r6.f147311c     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            io.ktor.utils.io.g r0 = (io.ktor.utils.io.g) r0     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r1 = 1
            r2 = 0
            java.io.InputStream r0 = io.ktor.utils.io.jvm.javaio.b.d(r0, r2, r1, r2)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            WK.N r0 = WK.y.l(r0)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            long r3 = r7.Y(r0)     // Catch:{ all -> 0x0027 }
            java.lang.Long r7 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x003a
            r0.close()     // Catch:{ all -> 0x0025 }
            goto L_0x003a
        L_0x0025:
            r2 = move-exception
            goto L_0x003a
        L_0x0027:
            r7 = move-exception
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ all -> 0x002e }
            goto L_0x0037
        L_0x002e:
            r0 = move-exception
            XH.C16816g.a(r7, r0)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r7 = move-exception
            goto L_0x0041
        L_0x0035:
            r7 = move-exception
            goto L_0x0047
        L_0x0037:
            r5 = r2
            r2 = r7
            r7 = r5
        L_0x003a:
            if (r2 != 0) goto L_0x0040
            kotlin.jvm.internal.C17542s.g(r7)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            return
        L_0x0040:
            throw r2     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
        L_0x0041:
            tH.i r0 = new tH.i
            r0.<init>(r7)
            throw r0
        L_0x0047:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tH.j.h(WK.f):void");
    }
}
