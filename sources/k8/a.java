package K8;

import I8.f;
import L8.b;
import L8.c;
import L8.d;
import L8.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x8.C8958b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LK8/a;", "LI8/f;", "LL8/e;", "urlProcessor", "LL8/b;", "eventConfigurator", "LL8/d;", "piiAnonymizer", "LL8/a;", "eventCompressor", "LL8/c;", "encryptor", "Lx8/b;", "libraryInterface", "<init>", "(LL8/e;LL8/b;LL8/d;LL8/a;LL8/c;Lx8/b;)V", "Ly8/b;", "rawEvent", "a", "(Ly8/b;)Ly8/b;", "LL8/e;", "b", "LL8/b;", "c", "LL8/d;", "d", "LL8/a;", "e", "LL8/c;", "f", "Lx8/b;", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final e f37750a;

    /* renamed from: b  reason: collision with root package name */
    private final b f37751b;

    /* renamed from: c  reason: collision with root package name */
    private final d f37752c;

    /* renamed from: d  reason: collision with root package name */
    private final L8.a f37753d;

    /* renamed from: e  reason: collision with root package name */
    private final c f37754e;

    /* renamed from: f  reason: collision with root package name */
    private final C8958b f37755f;

    public a(e eVar, b bVar, d dVar, L8.a aVar, c cVar, C8958b bVar2) {
        C17542s.j(eVar, "urlProcessor");
        C17542s.j(bVar, "eventConfigurator");
        C17542s.j(dVar, "piiAnonymizer");
        C17542s.j(aVar, "eventCompressor");
        C17542s.j(cVar, "encryptor");
        C17542s.j(bVar2, "libraryInterface");
        this.f37750a = eVar;
        this.f37751b = bVar;
        this.f37752c = dVar;
        this.f37753d = aVar;
        this.f37754e = cVar;
        this.f37755f = bVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y8.C8993b a(y8.C8993b r4) {
        /*
            r3 = this;
            java.lang.String r0 = "rawEvent"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            int r0 = r4.C()
            r1 = 400(0x190, float:5.6E-43)
            r2 = 0
            if (r0 >= r1) goto L_0x000f
            return r2
        L_0x000f:
            x8.b r0 = r3.f37755f
            A8.b r0 = r0.a()
            if (r0 == 0) goto L_0x0022
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r0 = r0.b()
            if (r0 == 0) goto L_0x0022
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors r0 = r0.b()
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            L8.e r1 = r3.f37750a
            y8.b r4 = r1.a(r4)
            L8.b r1 = r3.f37751b
            y8.b r4 = r1.a(r4, r0)
            L8.d r1 = r3.f37752c
            y8.b r4 = r1.a(r4)
            L8.a r1 = r3.f37753d
            y8.b r4 = r1.a(r4)
            if (r0 == 0) goto L_0x0041
            java.util.List r2 = r0.g()
        L_0x0041:
            boolean r0 = I8.e.b(r4, r2)
            if (r0 == 0) goto L_0x004e
            L8.c r0 = r3.f37754e
            y8.b r4 = r0.a(r4)
            goto L_0x0052
        L_0x004e:
            y8.b r4 = r4.c()
        L_0x0052:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K8.a.a(y8.b):y8.b");
    }
}
