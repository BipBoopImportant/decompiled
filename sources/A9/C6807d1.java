package a9;

import A8.b;
import D8.c;
import G8.d;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import QJ.f1;
import com.contentsquare.android.internal.features.srm.SrmKeysCache;
import dI.C17164e;
import dI.C17168i;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.d1  reason: case insensitive filesystem */
public final class C6807d1 {

    /* renamed from: a  reason: collision with root package name */
    public final C6901p f42498a;

    /* renamed from: b  reason: collision with root package name */
    public final SrmKeysCache f42499b;

    /* renamed from: c  reason: collision with root package name */
    public final Z6 f42500c;

    /* renamed from: d  reason: collision with root package name */
    public final int f42501d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final b f42502e;

    /* renamed from: f  reason: collision with root package name */
    public final c f42503f;

    /* renamed from: g  reason: collision with root package name */
    public final S f42504g;

    /* renamed from: h  reason: collision with root package name */
    public final Q f42505h;

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashSet f42506i;

    public C6807d1(C6901p pVar, SrmKeysCache srmKeysCache, Z6 z62, b bVar, d dVar) {
        C17542s.j(pVar, "srmHttpClient");
        C17542s.j(srmKeysCache, "srmKeysCache");
        C17542s.j(z62, "srmFileStorage");
        C17542s.j(bVar, "configuration");
        C17542s.j(dVar, "buildInformation");
        c cVar = new c("StaticResourceManager");
        S s10 = new S(dVar.d());
        C17542s.j(pVar, "srmHttpClient");
        C17542s.j(srmKeysCache, "srmKeysCache");
        C17542s.j(z62, "srmFileStorage");
        C17542s.j(bVar, "configuration");
        C17542s.j(dVar, "buildInformation");
        C17542s.j(cVar, "logger");
        C17542s.j(s10, "splitter");
        this.f42498a = pVar;
        this.f42499b = srmKeysCache;
        this.f42500c = z62;
        this.f42502e = bVar;
        this.f42503f = cVar;
        this.f42504g = s10;
        this.f42505h = S.a(f1.b("StaticResourceManager-BackgroundThread"));
        this.f42506i = new LinkedHashSet();
        F0 unused = C16314k.d(srmKeysCache.f46849h, (C17168i) null, (T) null, new C6948v(srmKeysCache, (C17164e<? super C6948v>) null), 3, (Object) null);
    }
}
