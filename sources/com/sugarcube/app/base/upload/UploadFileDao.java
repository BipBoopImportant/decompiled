package com.sugarcube.app.base.upload;

import MF.C13208b;
import MF.C13209c;
import MF.C13210d;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/sugarcube/app/base/upload/UploadFileDao;", "", "", "localPath", "", "exists", "(Ljava/lang/String;)Z", "LMF/b;", "get", "(Ljava/lang/String;)LMF/b;", "Ljava/util/UUID;", "captureUUID", "", "getCaptureFiles", "(Ljava/util/UUID;)Ljava/util/List;", "getAllFiles", "()Ljava/util/List;", "file", "LXH/N;", "insert", "(LMF/b;)V", "uploadUrl", "updateUploadUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "LMF/c;", "localState", "updateLocalState", "(Ljava/lang/String;LMF/c;)V", "LMF/d;", "remoteState", "updateRemoteState", "(Ljava/lang/String;LMF/d;)V", "", "attempts", "updateUploadAttempts", "(Ljava/lang/String;I)V", "delete", "(Ljava/util/UUID;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UploadFileDao {
    void delete(UUID uuid);

    boolean exists(String str);

    C13208b get(String str);

    List<C13208b> getAllFiles();

    List<C13208b> getCaptureFiles(UUID uuid);

    void insert(C13208b bVar);

    void updateLocalState(String str, C13209c cVar);

    void updateRemoteState(String str, C13210d dVar);

    void updateUploadAttempts(String str, int i10);

    void updateUploadUrl(String str, String str2);
}
