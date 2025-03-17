package jI;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LjI/g;", "Ljava/io/IOException;", "Ljava/io/File;", "file", "other", "", "reason", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "a", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "b", "getOther", "c", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jI.g  reason: case insensitive filesystem */
public class C17420g extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private final File f143976a;

    /* renamed from: b  reason: collision with root package name */
    private final File f143977b;

    /* renamed from: c  reason: collision with root package name */
    private final String f143978c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17420g(File file, File file2, String str) {
        super(C17417d.b(file, file2, str));
        C17542s.j(file, "file");
        this.f143976a = file;
        this.f143977b = file2;
        this.f143978c = str;
    }
}
