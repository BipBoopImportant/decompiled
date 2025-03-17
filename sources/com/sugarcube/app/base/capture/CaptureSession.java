package com.sugarcube.app.base.capture;

import PE.C13339a;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.network.models.RoomType;
import java.time.Instant;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010$\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010'\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006("}, d2 = {"Lcom/sugarcube/app/base/capture/CaptureSession;", "Lcom/sugarcube/core/analytics/Trackable;", "LPE/a;", "captureRepository", "LXH/N;", "saveFiles", "(LPE/a;)V", "", "hasRequiredFiles", "(LPE/a;)Z", "Ljava/util/UUID;", "getSessionUuid", "()Ljava/util/UUID;", "sessionUuid", "getUuid", "uuid", "Ljava/time/Instant;", "getCreation", "()Ljava/time/Instant;", "creation", "", "getCaptureType", "()Ljava/lang/String;", "captureType", "getCaptureStrategy", "captureStrategy", "Lcom/sugarcube/core/network/models/RoomType;", "getRoomType", "()Lcom/sugarcube/core/network/models/RoomType;", "roomType", "getRoomTitle", "roomTitle", "getSaved", "()Z", "setSaved", "(Z)V", "saved", "getHasError", "setHasError", "hasError", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CaptureSession extends Trackable {
    String getCaptureStrategy();

    String getCaptureType();

    Instant getCreation();

    boolean getHasError();

    String getRoomTitle();

    RoomType getRoomType();

    boolean getSaved();

    UUID getSessionUuid();

    UUID getUuid();

    boolean hasRequiredFiles(C13339a aVar);

    void saveFiles(C13339a aVar);

    void setHasError(boolean z10);

    void setSaved(boolean z10);
}
