package MF;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LMF/c;", "", "<init>", "(Ljava/lang/String;I)V", "", "b", "()Z", "NotUploaded", "Uploading", "Uploaded", "UploadedAndNotified", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: MF.c  reason: case insensitive filesystem */
public enum C13209c {
    NotUploaded,
    Uploading,
    Uploaded,
    UploadedAndNotified;

    static {
        C13209c[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public final boolean b() {
        return (this == NotUploaded || this == Uploading) ? false : true;
    }
}
