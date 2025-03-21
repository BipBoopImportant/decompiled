package com.sugarcube.app.base.capture;

import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J1\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/app/base/capture/UploadProgressListener;", "", "", "total", "LXH/N;", "totalBytes", "(J)V", "newBytes", "writeBytes", "Ljava/util/UUID;", "uuid", "", "type", "captureStrategy", "", "resumable", "uploadCreated", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UploadProgressListener {
    void totalBytes(long j10);

    void uploadCreated(UUID uuid, String str, String str2, Boolean bool);

    void writeBytes(long j10);
}
