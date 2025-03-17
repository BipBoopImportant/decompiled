package com.sugarcube.app.base.upload;

import GK.z;
import KF.C13150d;
import KF.C13151e;
import KF.C13154h;
import LF.C13187c;
import OE.C13309a;
import VE.C13760b;
import VK.C16697a;
import WH.C16729a;
import XH.C16807N;
import android.content.Context;
import android.net.ConnectivityManager;
import androidx.room.w;
import androidx.work.C7054x;
import com.sugarcube.app.base.data.database.Media;
import com.sugarcube.app.base.data.feature.ConfigItems;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \f2\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/app/base/upload/UploadModule;", "", "LKF/d;", "impl", "Lcom/sugarcube/app/base/upload/IUploadApi;", "bindIUploadApi", "(LKF/d;)Lcom/sugarcube/app/base/upload/IUploadApi;", "LKF/e;", "provider", "Lcom/sugarcube/app/base/upload/IUploadDatabase;", "bindIUploadDb", "(LKF/e;)Lcom/sugarcube/app/base/upload/IUploadDatabase;", "Companion", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UploadModule {
    public static final a Companion = a.f125749a;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/app/base/upload/UploadModule$a;", "", "<init>", "()V", "LOE/a;", "appEnvironment", "Landroid/net/ConnectivityManager;", "a", "(LOE/a;)Landroid/net/ConnectivityManager;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LWH/a;", "Lcom/sugarcube/app/base/upload/g;", "provider", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "b", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;LWH/a;)Lcom/sugarcube/app/base/upload/IUploaderV2;", "Landroid/content/Context;", "applicationContext", "Lcom/sugarcube/app/base/upload/UploadTrackerDb;", "d", "(Landroid/content/Context;)Lcom/sugarcube/app/base/upload/UploadTrackerDb;", "Lcom/sugarcube/app/base/external/config/a;", "config", "LVE/b;", "networkConfig", "LLF/c;", "log", "LGK/z;", "c", "(Lcom/sugarcube/app/base/external/config/a;LVE/b;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LLF/c;)LGK/z;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f125749a = new a();

        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH@¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH@¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/sugarcube/app/base/upload/UploadModule$a$a;", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "<init>", "()V", "Ljava/util/UUID;", "captureUUID", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "", "roomTitle", "Ljava/time/Instant;", "creation", "", "Lcom/sugarcube/app/base/data/database/Media;", "medias", "Lcom/sugarcube/app/base/data/database/Metadata;", "metas", "", "result", "captureType", "captureStrategy", "LXH/N;", "addUpload", "(Ljava/util/UUID;Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "retryFailures", "reason", "doTrack", "scheduleUploads", "(ZLjava/lang/String;Z)V", "Lcom/sugarcube/app/base/upload/UploadWorkerV2;", "workerV2", "Landroidx/work/x$a;", "startUploading", "(ZLcom/sugarcube/app/base/upload/UploadWorkerV2;LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.upload.UploadModule$a$a  reason: collision with other inner class name */
        public static final class C3075a implements IUploaderV2 {
            public Object addUpload(UUID uuid, RoomType roomType, String str, Instant instant, List<Media> list, List<com.sugarcube.app.base.data.database.Metadata> list2, boolean z10, String str2, String str3, C17164e<? super C16807N> eVar) {
                return C16807N.f139792a;
            }

            public void scheduleUploads(boolean z10, String str, boolean z11) {
                C17542s.j(str, "reason");
            }

            public Object startUploading(boolean z10, UploadWorkerV2 uploadWorkerV2, C17164e<? super C7054x.a> eVar) {
                C7054x.a c10 = C7054x.a.c();
                C17542s.i(c10, "success(...)");
                return c10;
            }
        }

        private a() {
        }

        public final ConnectivityManager a(C13309a aVar) {
            C17542s.j(aVar, "appEnvironment");
            Object systemService = aVar.a().getSystemService("connectivity");
            C17542s.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            return (ConnectivityManager) systemService;
        }

        public final IUploaderV2 b(ConfigRepository configRepository, C16729a<g> aVar) {
            C17542s.j(configRepository, "configRepository");
            C17542s.j(aVar, "provider");
            if (!configRepository.isEnabledBlocking(FeatureFlags.UploadsV2.INSTANCE)) {
                return new C3075a();
            }
            g gVar = aVar.get();
            C17542s.g(gVar);
            return gVar;
        }

        public final z c(com.sugarcube.app.base.external.config.a aVar, C13760b bVar, ConfigRepository configRepository, C13187c cVar) {
            C17542s.j(aVar, "config");
            C17542s.j(bVar, "networkConfig");
            C17542s.j(configRepository, "configRepository");
            C17542s.j(cVar, "log");
            long longValue = ((Integer) configRepository.getBlocking(ConfigItems.UploadsV2CallTimeoutSec.INSTANCE)).longValue();
            z.a aVar2 = new z.a();
            C16697a aVar3 = new C16697a((C16697a.b) null, 1, (DefaultConstructorMarker) null);
            aVar3.d(bVar.b().d());
            z.a U10 = aVar2.a(aVar3).e(longValue, TimeUnit.SECONDS).U(2, TimeUnit.MINUTES);
            U10.a(new C13154h(aVar, configRepository, cVar));
            return U10.c();
        }

        public final UploadTrackerDb d(Context context) {
            C17542s.j(context, "applicationContext");
            return w.a(context, UploadTrackerDb.class, "upload-tracker").e();
        }
    }

    IUploadApi bindIUploadApi(C13150d dVar);

    IUploadDatabase bindIUploadDb(C13151e eVar);
}
