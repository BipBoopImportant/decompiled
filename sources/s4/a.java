package S4;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001b"}, d2 = {"LS4/a;", "", "", "name", "Ljava/io/File;", "lockDir", "", "processLock", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", "LXH/N;", "b", "(Z)V", "d", "()V", "a", "Z", "Ljava/io/File;", "lockFile", "Ljava/util/concurrent/locks/Lock;", "c", "Ljava/util/concurrent/locks/Lock;", "threadLock", "Ljava/nio/channels/FileChannel;", "Ljava/nio/channels/FileChannel;", "lockChannel", "e", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0651a f39869e = new C0651a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, Lock> f39870f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f39871a;

    /* renamed from: b  reason: collision with root package name */
    private final File f39872b;

    /* renamed from: c  reason: collision with root package name */
    private final Lock f39873c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f39874d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LS4/a$a;", "", "<init>", "()V", "", "key", "Ljava/util/concurrent/locks/Lock;", "b", "(Ljava/lang/String;)Ljava/util/concurrent/locks/Lock;", "TAG", "Ljava/lang/String;", "", "threadLocksMap", "Ljava/util/Map;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: S4.a$a  reason: collision with other inner class name */
    public static final class C0651a {
        public /* synthetic */ C0651a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f39870f) {
                try {
                    Map a10 = a.f39870f;
                    Object obj = a10.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        a10.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }

        private C0651a() {
        }
    }

    public a(String str, File file, boolean z10) {
        File file2;
        C17542s.j(str, "name");
        this.f39871a = z10;
        if (file != null) {
            file2 = new File(file, str + ".lck");
        } else {
            file2 = null;
        }
        this.f39872b = file2;
        this.f39873c = f39869e.b(str);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f39871a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f39873c.lock();
        if (z10) {
            try {
                File file = this.f39872b;
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(this.f39872b).getChannel();
                    channel.lock();
                    this.f39874d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e10) {
                this.f39874d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f39874d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f39873c.unlock();
    }
}
