package androidx.room;

import Q4.h;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/room/G;", "LQ4/h$c;", "", "mCopyFromAssetPath", "Ljava/io/File;", "mCopyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "mCopyFromInputStream", "mDelegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;LQ4/h$c;)V", "LQ4/h$b;", "configuration", "LQ4/h;", "a", "(LQ4/h$b;)LQ4/h;", "Ljava/lang/String;", "b", "Ljava/io/File;", "c", "Ljava/util/concurrent/Callable;", "d", "LQ4/h$c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class G implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f44239a;

    /* renamed from: b  reason: collision with root package name */
    private final File f44240b;

    /* renamed from: c  reason: collision with root package name */
    private final Callable<InputStream> f44241c;

    /* renamed from: d  reason: collision with root package name */
    private final h.c f44242d;

    public G(String str, File file, Callable<InputStream> callable, h.c cVar) {
        C17542s.j(cVar, "mDelegate");
        this.f44239a = str;
        this.f44240b = file;
        this.f44241c = callable;
        this.f44242d = cVar;
    }

    public h a(h.b bVar) {
        C17542s.j(bVar, "configuration");
        return new F(bVar.f39574a, this.f44239a, this.f44240b, this.f44241c, bVar.f39576c.f39572a, this.f44242d.a(bVar));
    }
}
