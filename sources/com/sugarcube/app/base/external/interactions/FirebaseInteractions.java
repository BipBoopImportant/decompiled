package com.sugarcube.app.base.external.interactions;

import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "", "", "getFCMToken", "(LdI/e;)Ljava/lang/Object;", "getProjectId", "()Ljava/lang/String;", "message", "LXH/N;", "log", "(Ljava/lang/String;)V", "", "throwable", "recordException", "(Ljava/lang/Throwable;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FirebaseInteractions {
    Object getFCMToken(C17164e<? super String> eVar);

    String getProjectId();

    void log(String str);

    void recordException(Throwable th2);
}
