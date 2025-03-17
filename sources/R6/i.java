package r6;

import android.os.SystemClock;
import java.io.File;
import kotlin.Metadata;
import r6.s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lr6/i;", "", "<init>", "()V", "", "a", "()Z", "Lr6/s;", "logger", "b", "(Lr6/s;)Z", "Ljava/io/File;", "Ljava/io/File;", "fileDescriptorList", "", "c", "I", "decodesSinceLastFileDescriptorCheck", "", "d", "J", "lastFileDescriptorCheckTimestamp", "e", "Z", "hasAvailableFileDescriptors", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f55699a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final File f55700b = new File("/proc/self/fd");

    /* renamed from: c  reason: collision with root package name */
    private static int f55701c = 30;

    /* renamed from: d  reason: collision with root package name */
    private static long f55702d = SystemClock.uptimeMillis();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f55703e = true;

    private i() {
    }

    private final boolean a() {
        int i10 = f55701c;
        f55701c = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f55702d + ((long) 30000);
    }

    public final synchronized boolean b(s sVar) {
        try {
            if (a()) {
                boolean z10 = false;
                f55701c = 0;
                f55702d = SystemClock.uptimeMillis();
                String[] list = f55700b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                if (length < 800) {
                    z10 = true;
                }
                f55703e = z10;
                if (!z10 && sVar != null) {
                    s.a aVar = s.a.Warn;
                    if (sVar.a().compareTo(aVar) <= 0) {
                        sVar.b("FileDescriptorCounter", aVar, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, (Throwable) null);
                    }
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return f55703e;
    }
}
