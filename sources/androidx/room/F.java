package androidx.room;

import O4.b;
import O4.c;
import Q4.g;
import Q4.h;
import S4.a;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b'\u0010,R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Landroidx/room/F;", "LQ4/h;", "Landroidx/room/i;", "Landroid/content/Context;", "context", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILQ4/h;)V", "", "writable", "LXH/N;", "g", "(Z)V", "destinationFile", "d", "(Ljava/io/File;Z)V", "databaseFile", "e", "enabled", "setWriteAheadLoggingEnabled", "close", "()V", "Landroidx/room/h;", "databaseConfiguration", "f", "(Landroidx/room/h;)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "I", "LQ4/h;", "()LQ4/h;", "Landroidx/room/h;", "h", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LQ4/g;", "getWritableDatabase", "()LQ4/g;", "writableDatabase", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class F implements h, C7012i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f44231a;

    /* renamed from: b  reason: collision with root package name */
    private final String f44232b;

    /* renamed from: c  reason: collision with root package name */
    private final File f44233c;

    /* renamed from: d  reason: collision with root package name */
    private final Callable<InputStream> f44234d;

    /* renamed from: e  reason: collision with root package name */
    private final int f44235e;

    /* renamed from: f  reason: collision with root package name */
    private final h f44236f;

    /* renamed from: g  reason: collision with root package name */
    private C7011h f44237g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f44238h;

    public F(Context context, String str, File file, Callable<InputStream> callable, int i10, h hVar) {
        C17542s.j(context, "context");
        C17542s.j(hVar, "delegate");
        this.f44231a = context;
        this.f44232b = str;
        this.f44233c = file;
        this.f44234d = callable;
        this.f44235e = i10;
        this.f44236f = hVar;
    }

    private final void d(File file, boolean z10) {
        ReadableByteChannel readableByteChannel;
        if (this.f44232b != null) {
            readableByteChannel = Channels.newChannel(this.f44231a.getAssets().open(this.f44232b));
            C17542s.i(readableByteChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f44233c != null) {
            readableByteChannel = new FileInputStream(this.f44233c).getChannel();
            C17542s.i(readableByteChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.f44234d;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel(callable.call());
                    C17542s.i(readableByteChannel, "newChannel(inputStream)");
                } catch (Exception e10) {
                    throw new IOException("inputStreamCallable exception on call", e10);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f44231a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        C17542s.i(channel, "output");
        c.a(readableByteChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            C17542s.i(createTempFile, "intermediateFile");
            e(createTempFile, z10);
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
            }
            return;
        }
        throw new IOException("Failed to create directories for " + file.getAbsolutePath());
    }

    private final void e(File file, boolean z10) {
        C7011h hVar = this.f44237g;
        if (hVar == null) {
            C17542s.z("databaseConfiguration");
            hVar = null;
        }
        hVar.getClass();
    }

    private final void g(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.f44231a.getDatabasePath(databaseName);
            C7011h hVar = this.f44237g;
            C7011h hVar2 = null;
            if (hVar == null) {
                C17542s.z("databaseConfiguration");
                hVar = null;
            }
            a aVar = new a(databaseName, this.f44231a.getFilesDir(), hVar.f44352s);
            try {
                a.c(aVar, false, 1, (Object) null);
                if (!databasePath.exists()) {
                    C17542s.i(databasePath, "databaseFile");
                    d(databasePath, z10);
                    aVar.d();
                    return;
                }
                try {
                    C17542s.i(databasePath, "databaseFile");
                    int f10 = b.f(databasePath);
                    if (f10 == this.f44235e) {
                        aVar.d();
                        return;
                    }
                    C7011h hVar3 = this.f44237g;
                    if (hVar3 == null) {
                        C17542s.z("databaseConfiguration");
                    } else {
                        hVar2 = hVar3;
                    }
                    if (hVar2.a(f10, this.f44235e)) {
                        aVar.d();
                        return;
                    }
                    if (this.f44231a.deleteDatabase(databaseName)) {
                        try {
                            d(databasePath, z10);
                        } catch (IOException e10) {
                            Log.w("ROOM", "Unable to copy database file.", e10);
                        }
                    } else {
                        Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    aVar.d();
                } catch (IOException e11) {
                    Log.w("ROOM", "Unable to read database version.", e11);
                    aVar.d();
                }
            } catch (IOException e12) {
                throw new RuntimeException("Unable to copy database file.", e12);
            } catch (Throwable th2) {
                aVar.d();
                throw th2;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public h c() {
        return this.f44236f;
    }

    public synchronized void close() {
        c().close();
        this.f44238h = false;
    }

    public final void f(C7011h hVar) {
        C17542s.j(hVar, "databaseConfiguration");
        this.f44237g = hVar;
    }

    public String getDatabaseName() {
        return c().getDatabaseName();
    }

    public g getWritableDatabase() {
        if (!this.f44238h) {
            g(true);
            this.f44238h = true;
        }
        return c().getWritableDatabase();
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        c().setWriteAheadLoggingEnabled(z10);
    }
}
