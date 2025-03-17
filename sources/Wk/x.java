package WK;

import WK.C16762E;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LWK/x;", "LWK/w;", "<init>", "()V", "Ljava/nio/file/attribute/FileTime;", "", "e0", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "LWK/E;", "path", "LWK/k;", "t", "(LWK/E;)LWK/k;", "Ljava/nio/file/Path;", "nioPath", "U", "(Ljava/nio/file/Path;)LWK/k;", "source", "target", "LXH/N;", "e", "(LWK/E;LWK/E;)V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class x extends w {
    private final Long e0(FileTime fileTime) {
        Long valueOf = Long.valueOf(fileTime.toMillis());
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final C16776k U(Path path) {
        C17542s.j(path, "nioPath");
        Long l10 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            C16762E f10 = readSymbolicLink != null ? C16762E.a.f(C16762E.f139592b, readSymbolicLink, false, 1, (Object) null) : null;
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long e02 = creationTime != null ? e0(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long e03 = lastModifiedTime != null ? e0(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l10 = e0(lastAccessTime);
            }
            return new C16776k(isRegularFile, isDirectory, f10, valueOf, e02, e03, l10, (Map) null, 128, (DefaultConstructorMarker) null);
        } catch (FileSystemException | NoSuchFileException unused) {
            return null;
        }
    }

    public void e(C16762E e10, C16762E e11) {
        C17542s.j(e10, "source");
        C17542s.j(e11, "target");
        try {
            Files.move(e10.J(), e11.J(), new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        } catch (NoSuchFileException e12) {
            throw new FileNotFoundException(e12.getMessage());
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        }
    }

    public C16776k t(C16762E e10) {
        C17542s.j(e10, "path");
        return U(e10.J());
    }

    public String toString() {
        return "NioSystemFileSystem";
    }
}
