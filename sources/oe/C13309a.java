package OE;

import QJ.M;
import QJ.Q;
import android.content.Context;
import com.sugarcube.app.base.di.AppModule;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u0017\u0010#¨\u0006$"}, d2 = {"LOE/a;", "", "LQJ/Q;", "appScope", "LQJ/M;", "ioDispatcher", "Ljava/io/File;", "baseDir", "cacheDir", "Landroid/content/Context;", "appContext", "<init>", "(LQJ/Q;LQJ/M;Ljava/io/File;Ljava/io/File;Landroid/content/Context;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQJ/Q;", "b", "()LQJ/Q;", "LQJ/M;", "e", "()LQJ/M;", "c", "Ljava/io/File;", "()Ljava/io/File;", "d", "Landroid/content/Context;", "()Landroid/content/Context;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: OE.a  reason: case insensitive filesystem */
public final class C13309a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f112794f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Q f112795a;

    /* renamed from: b  reason: collision with root package name */
    private final M f112796b;

    /* renamed from: c  reason: collision with root package name */
    private final File f112797c;

    /* renamed from: d  reason: collision with root package name */
    private final File f112798d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f112799e;

    public C13309a(@AppModule.AppScope Q q10, @AppModule.IODispatcher M m10, @AppModule.BaseDir File file, @AppModule.CacheDir File file2, Context context) {
        C17542s.j(q10, "appScope");
        C17542s.j(m10, "ioDispatcher");
        C17542s.j(file, "baseDir");
        C17542s.j(file2, "cacheDir");
        C17542s.j(context, "appContext");
        this.f112795a = q10;
        this.f112796b = m10;
        this.f112797c = file;
        this.f112798d = file2;
        this.f112799e = context;
    }

    public final Context a() {
        return this.f112799e;
    }

    public final Q b() {
        return this.f112795a;
    }

    public final File c() {
        return this.f112797c;
    }

    public final File d() {
        return this.f112798d;
    }

    public final M e() {
        return this.f112796b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13309a)) {
            return false;
        }
        C13309a aVar = (C13309a) obj;
        return C17542s.e(this.f112795a, aVar.f112795a) && C17542s.e(this.f112796b, aVar.f112796b) && C17542s.e(this.f112797c, aVar.f112797c) && C17542s.e(this.f112798d, aVar.f112798d) && C17542s.e(this.f112799e, aVar.f112799e);
    }

    public int hashCode() {
        return (((((((this.f112795a.hashCode() * 31) + this.f112796b.hashCode()) * 31) + this.f112797c.hashCode()) * 31) + this.f112798d.hashCode()) * 31) + this.f112799e.hashCode();
    }

    public String toString() {
        Q q10 = this.f112795a;
        M m10 = this.f112796b;
        File file = this.f112797c;
        File file2 = this.f112798d;
        Context context = this.f112799e;
        return "AppEnvironment(appScope=" + q10 + ", ioDispatcher=" + m10 + ", baseDir=" + file + ", cacheDir=" + file2 + ", appContext=" + context + ")";
    }
}
