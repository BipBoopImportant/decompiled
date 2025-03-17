package vF;

import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.analytics.CardDetail;
import com.sugarcube.app.base.data.analytics.Destination;
import com.sugarcube.app.base.data.analytics.EntryType;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import com.sugarcube.app.base.external.entrypoint.TrackEntryPointUseCase;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JI\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LvF/b;", "Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "analytics", "<init>", "(Lcom/sugarcube/app/base/data/analytics/Analytics;)V", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "openingSource", "Lcom/sugarcube/app/base/data/analytics/EntryType;", "entryType", "Lcom/sugarcube/app/base/data/analytics/Destination;", "destination", "Ljava/util/UUID;", "sceneUuid", "compositionUuid", "", "deeplink", "LXH/N;", "execute", "(Lcom/sugarcube/app/base/data/analytics/OpeningSource;Lcom/sugarcube/app/base/data/analytics/EntryType;Lcom/sugarcube/app/base/data/analytics/Destination;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)V", "a", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "getAnalytics", "()Lcom/sugarcube/app/base/data/analytics/Analytics;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vF.b  reason: case insensitive filesystem */
public final class C15143b implements TrackEntryPointUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final Analytics f131558a;

    public C15143b(Analytics analytics) {
        C17542s.j(analytics, "analytics");
        this.f131558a = analytics;
    }

    public void execute(OpeningSource openingSource, EntryType entryType, Destination destination, UUID uuid, UUID uuid2, String str) {
        C17542s.j(openingSource, "openingSource");
        this.f131558a.kreativEntryOpen(openingSource, (C17542s.e(openingSource, OpeningSource.MembersOverview.INSTANCE) || C17542s.e(openingSource, OpeningSource.MembersList.INSTANCE)) ? (uuid == null || uuid2 == null) ? uuid != null ? CardDetail.ScanReady.INSTANCE : CardDetail.FTE.INSTANCE : CardDetail.LastDesign.INSTANCE : null, entryType, destination, uuid, uuid2, str);
    }
}
