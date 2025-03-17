package com.sugarcube.app.base.external.entrypoint;

import com.sugarcube.app.base.data.analytics.Destination;
import com.sugarcube.app.base.data.analytics.EntryType;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JM\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;", "", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "openingSource", "Lcom/sugarcube/app/base/data/analytics/EntryType;", "entryType", "Lcom/sugarcube/app/base/data/analytics/Destination;", "destination", "Ljava/util/UUID;", "sceneUuid", "compositionUuid", "", "deeplink", "LXH/N;", "execute", "(Lcom/sugarcube/app/base/data/analytics/OpeningSource;Lcom/sugarcube/app/base/data/analytics/EntryType;Lcom/sugarcube/app/base/data/analytics/Destination;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface TrackEntryPointUseCase {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(TrackEntryPointUseCase trackEntryPointUseCase, OpeningSource openingSource, EntryType entryType, Destination destination, UUID uuid, UUID uuid2, String str, int i10, Object obj) {
            if (obj == null) {
                trackEntryPointUseCase.execute(openingSource, entryType, destination, (i10 & 8) != 0 ? null : uuid, (i10 & 16) != 0 ? null : uuid2, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
    }

    void execute(OpeningSource openingSource, EntryType entryType, Destination destination, UUID uuid, UUID uuid2, String str);
}
