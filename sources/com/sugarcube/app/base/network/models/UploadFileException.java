package com.sugarcube.app.base.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/network/models/UploadFileException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "mimeType", "", "callDuration", "", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;J)V", "message", "getMessage", "()Ljava/lang/String;", "detailedMessage", "getDetailedMessage", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadFileException extends Exception {
    public static final int $stable = 0;
    private final String detailedMessage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UploadFileException(Exception exc, String str, long j10) {
        super(exc);
        C17542s.j(exc, "cause");
        C17542s.j(str, "mimeType");
        this.detailedMessage = "Duration: " + j10 + ", type: " + str;
    }

    public final String getDetailedMessage() {
        return this.detailedMessage;
    }

    public String getMessage() {
        Throwable cause = getCause();
        if (cause != null) {
            return cause.getMessage();
        }
        return null;
    }
}
