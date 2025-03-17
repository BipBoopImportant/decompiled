package com.sugarcube.app.base.di;

import GK.C15776D;
import GK.C15784c;
import GK.C15785d;
import GK.C15804w;
import GK.z;
import QL.y;
import TE.C13687b;
import TL.C16557a;
import VE.C13760b;
import VK.C16697a;
import android.content.Context;
import com.squareup.moshi.t;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.app.base.network.NetworkClientImpl;
import com.sugarcube.core.network.api.CatalogApi;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/di/NetworkApiModule;", "", "Lcom/sugarcube/app/base/network/NetworkClientImpl;", "impl", "Lcom/sugarcube/app/base/network/NetworkClient;", "bindNetworkClient", "(Lcom/sugarcube/app/base/network/NetworkClientImpl;)Lcom/sugarcube/app/base/network/NetworkClient;", "Companion", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NetworkApiModule {
    public static final a Companion = a.f123074a;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/app/base/di/NetworkApiModule$a;", "", "<init>", "()V", "LVK/a;", "h", "()LVK/a;", "LGK/w;", "c", "()LGK/w;", "Landroid/content/Context;", "context", "LGK/c;", "b", "(Landroid/content/Context;)LGK/c;", "cache", "LGK/z;", "f", "(LGK/c;)LGK/z;", "okHttpClient", "LVE/b;", "networkConfig", "Lcom/squareup/moshi/t;", "moshi", "LQL/y;", "g", "(LGK/z;LVE/b;Lcom/squareup/moshi/t;)LQL/y;", "retrofit", "Lcom/sugarcube/core/network/api/CatalogApi;", "e", "(LQL/y;)Lcom/sugarcube/core/network/api/CatalogApi;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f123074a = new a();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        /* renamed from: com.sugarcube.app.base.di.NetworkApiModule$a$a  reason: collision with other inner class name */
        public static final class C3030a implements C15804w {
            public final C15776D intercept(C15804w.a aVar) {
                C17542s.j(aVar, "chain");
                return aVar.b(aVar.t()).u().j("Cache-Control", "public, max-age=86400").c();
            }
        }

        private a() {
        }

        private final C15804w c() {
            return new C13687b();
        }

        /* access modifiers changed from: private */
        public static final C15776D d(C15804w.a aVar) {
            C17542s.j(aVar, "chain");
            return aVar.b(aVar.t()).u().j("Cache-Control", new C15785d.a().c(24, TimeUnit.HOURS).a().toString()).c();
        }

        private final C16697a h() {
            C16697a aVar = new C16697a((C16697a.b) null, 1, (DefaultConstructorMarker) null);
            aVar.b(C16697a.C3418a.HEADERS);
            return aVar;
        }

        @SugarcubeHttpCache
        public final C15784c b(Context context) {
            C17542s.j(context, "context");
            return new C15784c(new File(context.getCacheDir(), "sugarcube-http"), 209715200);
        }

        public final CatalogApi e(y yVar) {
            C17542s.j(yVar, "retrofit");
            Object b10 = yVar.b(CatalogApi.class);
            C17542s.i(b10, "create(...)");
            return (CatalogApi) b10;
        }

        public final z f(@SugarcubeHttpCache C15784c cVar) {
            C17542s.j(cVar, "cache");
            z.a b10 = new z.a().d(cVar).a(h()).a(c()).b(new C3030a());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return b10.f(30, timeUnit).R(30, timeUnit).U(30, timeUnit).c();
        }

        public final y g(z zVar, C13760b bVar, t tVar) {
            C17542s.j(zVar, "okHttpClient");
            C17542s.j(bVar, "networkConfig");
            C17542s.j(tVar, "moshi");
            y e10 = new y.b().d(bVar.d()).g(zVar).b(C16557a.g(tVar)).e();
            C17542s.i(e10, "build(...)");
            return e10;
        }
    }

    NetworkClient bindNetworkClient(NetworkClientImpl networkClientImpl);
}
