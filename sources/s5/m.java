package S5;

import android.os.SystemClock;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LS5/m;", "", "<init>", "()V", "", "a", "()Z", "LS5/r;", "logger", "b", "(LS5/r;)Z", "Ljava/io/File;", "Ljava/io/File;", "fileDescriptorList", "", "c", "I", "decodesSinceLastFileDescriptorCheck", "", "d", "J", "lastFileDescriptorCheckTimestamp", "e", "Z", "hasAvailableFileDescriptors", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f39893a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static final File f39894b = new File("/proc/self/fd");

    /* renamed from: c  reason: collision with root package name */
    private static int f39895c = 30;

    /* renamed from: d  reason: collision with root package name */
    private static long f39896d = SystemClock.uptimeMillis();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f39897e = true;

    private m() {
    }

    private final boolean a() {
        int i10 = f39895c;
        f39895c = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f39896d + ((long) 30000);
    }

    public final synchronized boolean b(r rVar) {
        try {
            if (a()) {
                boolean z10 = false;
                f39895c = 0;
                f39896d = SystemClock.uptimeMillis();
                String[] list = f39894b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                if (length < 800) {
                    z10 = true;
                }
                f39897e = z10;
                if (!z10 && rVar != null && rVar.getLevel() <= 5) {
                    rVar.a("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, (Throwable) null);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return f39897e;
    }
}
