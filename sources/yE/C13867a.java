package YE;

import OE.C13309a;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import eI.C17187b;
import jI.C17423j;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010 \u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"LYE/a;", "", "LOE/a;", "appEnvironment", "<init>", "(LOE/a;)V", "", "logStr", "LXH/N;", "e", "(Ljava/lang/String;)V", "message", "LYE/e;", "topic", "", "isDebuggable", "c", "(Ljava/lang/String;LYE/e;Z)V", "Ljava/io/File;", "target", "b", "(Ljava/io/File;)Z", "LQJ/Q;", "a", "LQJ/Q;", "scope", "LQJ/M;", "LQJ/M;", "ioDispatcher", "Ljava/io/File;", "cacheDir", "d", "logFile", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YE.a  reason: case insensitive filesystem */
public final class C13867a {

    /* renamed from: e  reason: collision with root package name */
    public static final C2929a f118097e = new C2929a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f118098f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Q f118099a;

    /* renamed from: b  reason: collision with root package name */
    private final M f118100b;

    /* renamed from: c  reason: collision with root package name */
    private final File f118101c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final File f118102d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LYE/a$a;", "", "<init>", "()V", "", "fileSizeLimit", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YE.a$a  reason: collision with other inner class name */
    public static final class C2929a {
        public /* synthetic */ C2929a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2929a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.log.EventLog$writeLog$1", f = "EventLog.kt", l = {}, m = "invokeSuspend")
    /* renamed from: YE.a$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118103c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13867a f118104d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f118105e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C13867a aVar, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f118104d = aVar;
            this.f118105e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f118104d, this.f118105e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118103c == 0) {
                y.b(obj);
                File a10 = this.f118104d.f118102d;
                C13867a aVar = this.f118104d;
                String str = this.f118105e;
                synchronized (a10) {
                    try {
                        if (!aVar.f118102d.exists() || aVar.f118102d.length() <= 5242880) {
                            C17423j.d(aVar.f118102d, str, (Charset) null, 2, (Object) null);
                        } else {
                            C17423j.l(aVar.f118102d, str, (Charset) null, 2, (Object) null);
                        }
                    } catch (Exception e10) {
                        Log.e(AnyKt.SUGARCUBE_TAG, String.valueOf(aVar.f118102d.getAbsolutePath()), e10);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C13867a(C13309a aVar) {
        C17542s.j(aVar, "appEnvironment");
        this.f118099a = aVar.b();
        this.f118100b = aVar.e();
        File d10 = aVar.d();
        this.f118101c = d10;
        File file = new File(d10, "sugarcube-log/debuglog.txt");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            try {
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
            } catch (Exception e10) {
                Log.e(AnyKt.SUGARCUBE_TAG, String.valueOf(file.getAbsolutePath()), e10);
            }
        }
        this.f118102d = file;
    }

    public static /* synthetic */ void d(C13867a aVar, String str, e eVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.c(str, eVar, z10);
    }

    private final void e(String str) {
        F0 unused = C16314k.d(this.f118099a, this.f118100b, (T) null, new b(this, str, (C17164e<? super b>) null), 2, (Object) null);
    }

    public final boolean b(File file) {
        boolean z10 = true;
        boolean z11 = false;
        C17542s.j(file, "target");
        synchronized (this.f118102d) {
            try {
                if (this.f118102d.exists()) {
                    Files.copy(this.f118102d.toPath(), file.toPath(), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
                } else {
                    z10 = false;
                }
                z11 = z10;
            } catch (Exception e10) {
                Log.e(AnyKt.SUGARCUBE_TAG, String.valueOf(this.f118102d.getAbsolutePath()), e10);
            }
        }
        return z11;
    }

    public final void c(String str, e eVar, boolean z10) {
        C17542s.j(str, "message");
        C17542s.j(eVar, "topic");
        String str2 = DateTimeFormatter.ISO_INSTANT.format(Instant.now()) + " [" + eVar.name() + "] " + str + "\n";
        if (z10) {
            Log.d("Sugarcube-log", str2);
        }
        e(str2);
    }
}
