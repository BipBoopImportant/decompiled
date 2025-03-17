package F5;

import HJ.C15850p;
import HJ.C15854t;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import QJ.b1;
import WK.C16762E;
import WK.C16771f;
import WK.C16777l;
import WK.C16778m;
import WK.L;
import WK.y;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0005*\u0001^\b\u0000\u0018\u0000 a2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004=:;8B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J#\u0010!\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u001dR\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020\u001f2\n\u0010&\u001a\u00060%R\u00020\u0000H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\u0013J\u000f\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010\u0013J\u000f\u0010+\u001a\u00020\u001fH\u0002¢\u0006\u0004\b+\u0010$J\u000f\u0010,\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010\u0013J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u0010\u001aJ\r\u00100\u001a\u00020\u0011¢\u0006\u0004\b0\u0010\u0013J\u001e\u00102\u001a\b\u0018\u000101R\u00020\u00002\u0006\u0010.\u001a\u00020\u0017H\u0002¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\b\u0018\u00010\u001dR\u00020\u00002\u0006\u0010.\u001a\u00020\u0017¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010\u0013J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u00109R\u0014\u0010A\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u00109R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u00109R$\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u00060%R\u00020\u00000D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010#R\u0016\u0010O\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010<R\u0018\u0010R\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010Y\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010TR\u0016\u0010[\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010TR\u0016\u0010]\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010TR\u0014\u0010\u0005\u001a\u00020^8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, d2 = {"LF5/c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Ljava/io/Flushable;", "LWK/l;", "fileSystem", "LWK/E;", "directory", "LQJ/M;", "cleanupDispatcher", "", "maxSize", "", "appVersion", "valueCount", "<init>", "(LWK/l;LWK/E;LQJ/M;JII)V", "LXH/N;", "h0", "()V", "LWK/f;", "U", "()LWK/f;", "", "line", "i0", "(Ljava/lang/String;)V", "f0", "t0", "LF5/c$b;", "editor", "", "success", "w", "(LF5/c$b;Z)V", "J", "()Z", "LF5/c$c;", "entry", "j0", "(LF5/c$c;)Z", "v", "o0", "l0", "x", "N", "key", "p0", "F", "LF5/c$d;", "B", "(Ljava/lang/String;)LF5/c$d;", "z", "(Ljava/lang/String;)LF5/c$b;", "close", "flush", "a", "LWK/E;", "b", "c", "I", "d", "e", "journalFile", "f", "journalFileTmp", "g", "journalFileBackup", "Ljava/util/LinkedHashMap;", "h", "Ljava/util/LinkedHashMap;", "lruEntries", "LQJ/Q;", "i", "LQJ/Q;", "cleanupScope", "j", "size", "k", "operationsSinceRewrite", "l", "LWK/f;", "journalWriter", "m", "Z", "hasJournalErrors", "n", "initialized", "o", "closed", "p", "mostRecentTrimFailed", "q", "mostRecentRebuildFailed", "F5/c$e", "r", "LF5/c$e;", "s", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements Closeable, Flushable {

    /* renamed from: s  reason: collision with root package name */
    public static final a f35416s = new a((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    private static final C15850p f35417t = new C15850p("[a-z0-9_-]{1,120}");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C16762E f35418a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35419b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35420c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f35421d;

    /* renamed from: e  reason: collision with root package name */
    private final C16762E f35422e;

    /* renamed from: f  reason: collision with root package name */
    private final C16762E f35423f;

    /* renamed from: g  reason: collision with root package name */
    private final C16762E f35424g;

    /* renamed from: h  reason: collision with root package name */
    private final LinkedHashMap<String, C0571c> f35425h;

    /* renamed from: i  reason: collision with root package name */
    private final Q f35426i;

    /* renamed from: j  reason: collision with root package name */
    private long f35427j;

    /* renamed from: k  reason: collision with root package name */
    private int f35428k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public C16771f f35429l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f35430m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f35431n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f35432o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f35433p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f35434q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final e f35435r;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LF5/c$a;", "", "<init>", "()V", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "REMOVE", "READ", "LHJ/p;", "LEGAL_KEY_PATTERN", "LHJ/p;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LF5/c$b;", "", "LF5/c$c;", "LF5/c;", "entry", "<init>", "(LF5/c;LF5/c$c;)V", "", "success", "LXH/N;", "d", "(Z)V", "", "index", "LWK/E;", "f", "(I)LWK/E;", "e", "()V", "b", "LF5/c$d;", "c", "()LF5/c$d;", "a", "LF5/c$c;", "g", "()LF5/c$c;", "Z", "closed", "", "[Z", "h", "()[Z", "written", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C0571c f35436a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f35437b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean[] f35438c;

        public b(C0571c cVar) {
            this.f35436a = cVar;
            this.f35438c = new boolean[c.this.f35421d];
        }

        private final void d(boolean z10) {
            c cVar = c.this;
            synchronized (cVar) {
                try {
                    if (!this.f35437b) {
                        if (C17542s.e(this.f35436a.b(), this)) {
                            cVar.w(this, z10);
                        }
                        this.f35437b = true;
                        C16807N n10 = C16807N.f139792a;
                    } else {
                        throw new IllegalStateException("editor is closed");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d B10;
            c cVar = c.this;
            synchronized (cVar) {
                b();
                B10 = cVar.B(this.f35436a.d());
            }
            return B10;
        }

        public final void e() {
            if (C17542s.e(this.f35436a.b(), this)) {
                this.f35436a.m(true);
            }
        }

        public final C16762E f(int i10) {
            C16762E e10;
            c cVar = c.this;
            synchronized (cVar) {
                if (!this.f35437b) {
                    this.f35438c[i10] = true;
                    C16762E e11 = this.f35436a.c().get(i10);
                    S5.e.a(cVar.f35435r, e11);
                    e10 = e11;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            }
            return e10;
        }

        public final C0571c g() {
            return this.f35436a;
        }

        public final boolean[] h() {
            return this.f35438c;
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0013\u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b\u001f\u0010!R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R(\u00104\u001a\b\u0018\u00010/R\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u00100\u001a\u0004\b\u0018\u00101\"\u0004\b2\u00103R\"\u0010:\u001a\u0002058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u00106\u001a\u0004\b+\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"LF5/c$c;", "", "", "key", "<init>", "(LF5/c;Ljava/lang/String;)V", "", "strings", "LXH/N;", "j", "(Ljava/util/List;)V", "LWK/f;", "writer", "o", "(LWK/f;)V", "LF5/c$d;", "LF5/c;", "n", "()LF5/c$d;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "Ljava/util/ArrayList;", "LWK/E;", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "l", "(Z)V", "readable", "f", "h", "m", "zombie", "LF5/c$b;", "LF5/c$b;", "()LF5/c$b;", "i", "(LF5/c$b;)V", "currentEditor", "", "I", "()I", "k", "(I)V", "lockingSnapshotCount", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: F5.c$c  reason: collision with other inner class name */
    public final class C0571c {

        /* renamed from: a  reason: collision with root package name */
        private final String f35440a;

        /* renamed from: b  reason: collision with root package name */
        private final long[] f35441b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<C16762E> f35442c;

        /* renamed from: d  reason: collision with root package name */
        private final ArrayList<C16762E> f35443d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f35444e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f35445f;

        /* renamed from: g  reason: collision with root package name */
        private b f35446g;

        /* renamed from: h  reason: collision with root package name */
        private int f35447h;

        public C0571c(String str) {
            this.f35440a = str;
            this.f35441b = new long[c.this.f35421d];
            this.f35442c = new ArrayList<>(c.this.f35421d);
            this.f35443d = new ArrayList<>(c.this.f35421d);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = c.this.f35421d;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f35442c.add(c.this.f35418a.G(sb2.toString()));
                sb2.append(".tmp");
                this.f35443d.add(c.this.f35418a.G(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList<C16762E> a() {
            return this.f35442c;
        }

        public final b b() {
            return this.f35446g;
        }

        public final ArrayList<C16762E> c() {
            return this.f35443d;
        }

        public final String d() {
            return this.f35440a;
        }

        public final long[] e() {
            return this.f35441b;
        }

        public final int f() {
            return this.f35447h;
        }

        public final boolean g() {
            return this.f35444e;
        }

        public final boolean h() {
            return this.f35445f;
        }

        public final void i(b bVar) {
            this.f35446g = bVar;
        }

        public final void j(List<String> list) {
            if (list.size() == c.this.f35421d) {
                try {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        this.f35441b[i10] = Long.parseLong(list.get(i10));
                    }
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + list);
                }
            } else {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i10) {
            this.f35447h = i10;
        }

        public final void l(boolean z10) {
            this.f35444e = z10;
        }

        public final void m(boolean z10) {
            this.f35445f = z10;
        }

        public final d n() {
            if (!this.f35444e || this.f35446g != null || this.f35445f) {
                return null;
            }
            ArrayList<C16762E> arrayList = this.f35442c;
            c cVar = c.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!cVar.f35435r.o(arrayList.get(i10))) {
                    try {
                        boolean unused = cVar.j0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            this.f35447h++;
            return new d(this);
        }

        public final void o(C16771f fVar) {
            for (long u12 : this.f35441b) {
                fVar.Z1(32).u1(u12);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0005\u001a\u00060\u0003R\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LF5/c$d;", "Ljava/io/Closeable;", "Lokio/Closeable;", "LF5/c$c;", "LF5/c;", "entry", "<init>", "(LF5/c;LF5/c$c;)V", "", "index", "LWK/E;", "d", "(I)LWK/E;", "LXH/N;", "close", "()V", "LF5/c$b;", "c", "()LF5/c$b;", "a", "LF5/c$c;", "getEntry", "()LF5/c$c;", "", "b", "Z", "closed", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class d implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final C0571c f35449a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f35450b;

        public d(C0571c cVar) {
            this.f35449a = cVar;
        }

        public final b c() {
            b z10;
            c cVar = c.this;
            synchronized (cVar) {
                close();
                z10 = cVar.z(this.f35449a.d());
            }
            return z10;
        }

        public void close() {
            if (!this.f35450b) {
                this.f35450b = true;
                c cVar = c.this;
                synchronized (cVar) {
                    try {
                        C0571c cVar2 = this.f35449a;
                        cVar2.k(cVar2.f() - 1);
                        if (this.f35449a.f() == 0 && this.f35449a.h()) {
                            boolean unused = cVar.j0(this.f35449a);
                        }
                        C16807N n10 = C16807N.f139792a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final C16762E d(int i10) {
            if (!this.f35450b) {
                return this.f35449a.a().get(i10);
            }
            throw new IllegalStateException("snapshot is closed");
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"F5/c$e", "LWK/m;", "LWK/E;", "file", "", "mustCreate", "LWK/L;", "z", "(LWK/E;Z)LWK/L;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends C16778m {
        e(C16777l lVar) {
            super(lVar);
        }

        public L z(C16762E e10, boolean z10) {
            C16762E D10 = e10.D();
            if (D10 != null) {
                f(D10);
            }
            return super.z(e10, z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f35452c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f35453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f35453d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f35453d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:9|10|11|13|14|15|16|(1:18)) */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            F5.c.q(r3, true);
            F5.c.o(r3, WK.y.c(WK.y.b()));
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002e */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0040=Splitter:B:24:0x0040, B:13:0x0021=Splitter:B:13:0x0021, B:15:0x0024=Splitter:B:15:0x0024} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                eI.C17187b.f()
                int r0 = r2.f35452c
                if (r0 != 0) goto L_0x0046
                XH.y.b(r3)
                F5.c r3 = r2.f35453d
                monitor-enter(r3)
                boolean r0 = r3.f35431n     // Catch:{ all -> 0x001f }
                if (r0 == 0) goto L_0x0040
                boolean r0 = r3.f35432o     // Catch:{ all -> 0x001f }
                if (r0 == 0) goto L_0x001a
                goto L_0x0040
            L_0x001a:
                r0 = 1
                r3.o0()     // Catch:{ IOException -> 0x0021 }
                goto L_0x0024
            L_0x001f:
                r0 = move-exception
                goto L_0x0044
            L_0x0021:
                r3.f35433p = r0     // Catch:{ all -> 0x001f }
            L_0x0024:
                boolean r1 = r3.J()     // Catch:{ IOException -> 0x002e }
                if (r1 == 0) goto L_0x003c
                r3.t0()     // Catch:{ IOException -> 0x002e }
                goto L_0x003c
            L_0x002e:
                r3.f35434q = r0     // Catch:{ all -> 0x001f }
                WK.L r0 = WK.y.b()     // Catch:{ all -> 0x001f }
                WK.f r0 = WK.y.c(r0)     // Catch:{ all -> 0x001f }
                r3.f35429l = r0     // Catch:{ all -> 0x001f }
            L_0x003c:
                monitor-exit(r3)
                XH.N r3 = XH.C16807N.f139792a
                return r3
            L_0x0040:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x001f }
                monitor-exit(r3)
                return r0
            L_0x0044:
                monitor-exit(r3)
                throw r0
            L_0x0046:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: F5.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c(C16777l lVar, C16762E e10, M m10, long j10, int i10, int i11) {
        this.f35418a = e10;
        this.f35419b = j10;
        this.f35420c = i10;
        this.f35421d = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            this.f35422e = e10.G("journal");
            this.f35423f = e10.G("journal.tmp");
            this.f35424g = e10.G("journal.bkp");
            this.f35425h = new LinkedHashMap<>(0, 0.75f, true);
            this.f35426i = S.a(b1.b((F0) null, 1, (Object) null).plus(m10.K0(1)));
            this.f35435r = new e(lVar);
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: private */
    public final boolean J() {
        return this.f35428k >= 2000;
    }

    private final void N() {
        F0 unused = C16314k.d(this.f35426i, (C17168i) null, (T) null, new f(this, (C17164e<? super f>) null), 3, (Object) null);
    }

    private final C16771f U() {
        return y.c(new d(this.f35435r.c(this.f35422e), new b(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(c cVar, IOException iOException) {
        cVar.f35430m = true;
        return C16807N.f139792a;
    }

    private final void f0() {
        Iterator<C0571c> it = this.f35425h.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C0571c next = it.next();
            int i10 = 0;
            if (next.b() == null) {
                int i11 = this.f35421d;
                while (i10 < i11) {
                    j10 += next.e()[i10];
                    i10++;
                }
            } else {
                next.i((b) null);
                int i12 = this.f35421d;
                while (i10 < i12) {
                    this.f35435r.l(next.a().get(i10));
                    this.f35435r.l(next.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f35427j = j10;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|(1:20)(1:21)|22|(2:24|25)|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r10.f35428k = r0 - r10.f35425h.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r1.Y1() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        t0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r10.f35429l = U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r1 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r0 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0082=Splitter:B:28:0x0082, B:17:0x005d=Splitter:B:17:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h0() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            F5.c$e r1 = r10.f35435r
            WK.E r2 = r10.f35422e
            WK.N r1 = r1.B(r2)
            WK.g r1 = WK.y.d(r1)
            java.lang.String r2 = r1.Z0()     // Catch:{ all -> 0x005b }
            java.lang.String r3 = r1.Z0()     // Catch:{ all -> 0x005b }
            java.lang.String r4 = r1.Z0()     // Catch:{ all -> 0x005b }
            java.lang.String r5 = r1.Z0()     // Catch:{ all -> 0x005b }
            java.lang.String r6 = r1.Z0()     // Catch:{ all -> 0x005b }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r2)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0082
            java.lang.String r7 = "1"
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r3)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0082
            int r7 = r10.f35420c     // Catch:{ all -> 0x005b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r4)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0082
            int r7 = r10.f35421d     // Catch:{ all -> 0x005b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r5)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0082
            int r7 = r6.length()     // Catch:{ all -> 0x005b }
            if (r7 > 0) goto L_0x0082
            r0 = 0
        L_0x0051:
            java.lang.String r2 = r1.Z0()     // Catch:{ EOFException -> 0x005d }
            r10.i0(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0051
        L_0x005b:
            r0 = move-exception
            goto L_0x00b6
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, F5.c$c> r2 = r10.f35425h     // Catch:{ all -> 0x005b }
            int r2 = r2.size()     // Catch:{ all -> 0x005b }
            int r0 = r0 - r2
            r10.f35428k = r0     // Catch:{ all -> 0x005b }
            boolean r0 = r1.Y1()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0070
            r10.t0()     // Catch:{ all -> 0x005b }
            goto L_0x0076
        L_0x0070:
            WK.f r0 = r10.U()     // Catch:{ all -> 0x005b }
            r10.f35429l = r0     // Catch:{ all -> 0x005b }
        L_0x0076:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0080
            r1.close()     // Catch:{ all -> 0x007e }
            goto L_0x0080
        L_0x007e:
            r0 = move-exception
            goto L_0x00c0
        L_0x0080:
            r0 = 0
            goto L_0x00c0
        L_0x0082:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x005b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r8.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r9 = "unexpected journal header: ["
            r8.append(r9)     // Catch:{ all -> 0x005b }
            r8.append(r2)     // Catch:{ all -> 0x005b }
            r8.append(r0)     // Catch:{ all -> 0x005b }
            r8.append(r3)     // Catch:{ all -> 0x005b }
            r8.append(r0)     // Catch:{ all -> 0x005b }
            r8.append(r4)     // Catch:{ all -> 0x005b }
            r8.append(r0)     // Catch:{ all -> 0x005b }
            r8.append(r5)     // Catch:{ all -> 0x005b }
            r8.append(r0)     // Catch:{ all -> 0x005b }
            r8.append(r6)     // Catch:{ all -> 0x005b }
            r0 = 93
            r8.append(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x005b }
            r7.<init>(r0)     // Catch:{ all -> 0x005b }
            throw r7     // Catch:{ all -> 0x005b }
        L_0x00b6:
            if (r1 == 0) goto L_0x00c0
            r1.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00c0
        L_0x00bc:
            r1 = move-exception
            XH.C16816g.a(r0, r1)
        L_0x00c0:
            if (r0 != 0) goto L_0x00c3
            return
        L_0x00c3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.c.h0():void");
    }

    private final void i0(String str) {
        String str2;
        String str3 = str;
        int r02 = C15854t.r0(str, ' ', 0, false, 6, (Object) null);
        if (r02 != -1) {
            int i10 = r02 + 1;
            int r03 = C15854t.r0(str, ' ', i10, false, 4, (Object) null);
            if (r03 == -1) {
                str2 = str3.substring(i10);
                C17542s.i(str2, "substring(...)");
                if (r02 == 6 && C15854t.W(str3, "REMOVE", false, 2, (Object) null)) {
                    this.f35425h.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i10, r03);
                C17542s.i(str2, "substring(...)");
            }
            LinkedHashMap<String, C0571c> linkedHashMap = this.f35425h;
            C0571c cVar = linkedHashMap.get(str2);
            if (cVar == null) {
                cVar = new C0571c(str2);
                linkedHashMap.put(str2, cVar);
            }
            C0571c cVar2 = cVar;
            if (r03 != -1 && r02 == 5 && C15854t.W(str3, "CLEAN", false, 2, (Object) null)) {
                String substring = str3.substring(r03 + 1);
                C17542s.i(substring, "substring(...)");
                List X02 = C15854t.X0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                cVar2.l(true);
                cVar2.i((b) null);
                cVar2.j(X02);
            } else if (r03 == -1 && r02 == 5 && C15854t.W(str3, "DIRTY", false, 2, (Object) null)) {
                cVar2.i(new b(cVar2));
            } else if (r03 != -1 || r02 != 4 || !C15854t.W(str3, "READ", false, 2, (Object) null)) {
                throw new IOException("unexpected journal line: " + str3);
            }
        } else {
            throw new IOException("unexpected journal line: " + str3);
        }
    }

    /* access modifiers changed from: private */
    public final boolean j0(C0571c cVar) {
        C16771f fVar;
        if (cVar.f() > 0 && (fVar = this.f35429l) != null) {
            fVar.D0("DIRTY");
            fVar.Z1(32);
            fVar.D0(cVar.d());
            fVar.Z1(10);
            fVar.flush();
        }
        if (cVar.f() > 0 || cVar.b() != null) {
            cVar.m(true);
            return true;
        }
        int i10 = this.f35421d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35435r.l(cVar.a().get(i11));
            this.f35427j -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f35428k++;
        C16771f fVar2 = this.f35429l;
        if (fVar2 != null) {
            fVar2.D0("REMOVE");
            fVar2.Z1(32);
            fVar2.D0(cVar.d());
            fVar2.Z1(10);
        }
        this.f35425h.remove(cVar.d());
        if (J()) {
            N();
        }
        return true;
    }

    private final boolean l0() {
        for (C0571c next : this.f35425h.values()) {
            if (!next.h()) {
                j0(next);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void o0() {
        while (this.f35427j > this.f35419b) {
            if (!l0()) {
                return;
            }
        }
        this.f35433p = false;
    }

    private final void p0(String str) {
        if (!f35417t.i(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6 A[Catch:{ all -> 0x0075, all -> 0x009f, all -> 0x0009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1 A[SYNTHETIC, Splitter:B:40:0x00e1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void t0() {
        /*
            r7 = this;
            monitor-enter(r7)
            WK.f r0 = r7.f35429l     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x000c
            r0.close()     // Catch:{ all -> 0x0009 }
            goto L_0x000c
        L_0x0009:
            r0 = move-exception
            goto L_0x00e2
        L_0x000c:
            F5.c$e r0 = r7.f35435r     // Catch:{ all -> 0x0009 }
            WK.E r1 = r7.f35423f     // Catch:{ all -> 0x0009 }
            r2 = 0
            WK.L r0 = r0.z(r1, r2)     // Catch:{ all -> 0x0009 }
            WK.f r0 = WK.y.c(r0)     // Catch:{ all -> 0x0009 }
            java.lang.String r1 = "libcore.io.DiskLruCache"
            WK.f r1 = r0.D0(r1)     // Catch:{ all -> 0x0075 }
            r3 = 10
            r1.Z1(r3)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "1"
            WK.f r1 = r0.D0(r1)     // Catch:{ all -> 0x0075 }
            r1.Z1(r3)     // Catch:{ all -> 0x0075 }
            int r1 = r7.f35420c     // Catch:{ all -> 0x0075 }
            long r4 = (long) r1     // Catch:{ all -> 0x0075 }
            WK.f r1 = r0.u1(r4)     // Catch:{ all -> 0x0075 }
            r1.Z1(r3)     // Catch:{ all -> 0x0075 }
            int r1 = r7.f35421d     // Catch:{ all -> 0x0075 }
            long r4 = (long) r1     // Catch:{ all -> 0x0075 }
            WK.f r1 = r0.u1(r4)     // Catch:{ all -> 0x0075 }
            r1.Z1(r3)     // Catch:{ all -> 0x0075 }
            r0.Z1(r3)     // Catch:{ all -> 0x0075 }
            java.util.LinkedHashMap<java.lang.String, F5.c$c> r1 = r7.f35425h     // Catch:{ all -> 0x0075 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0075 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0075 }
        L_0x004e:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0075 }
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0075 }
            F5.c$c r4 = (F5.c.C0571c) r4     // Catch:{ all -> 0x0075 }
            F5.c$b r5 = r4.b()     // Catch:{ all -> 0x0075 }
            r6 = 32
            if (r5 == 0) goto L_0x0077
            java.lang.String r5 = "DIRTY"
            r0.D0(r5)     // Catch:{ all -> 0x0075 }
            r0.Z1(r6)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = r4.d()     // Catch:{ all -> 0x0075 }
            r0.D0(r4)     // Catch:{ all -> 0x0075 }
            r0.Z1(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x004e
        L_0x0075:
            r1 = move-exception
            goto L_0x0099
        L_0x0077:
            java.lang.String r5 = "CLEAN"
            r0.D0(r5)     // Catch:{ all -> 0x0075 }
            r0.Z1(r6)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = r4.d()     // Catch:{ all -> 0x0075 }
            r0.D0(r5)     // Catch:{ all -> 0x0075 }
            r4.o(r0)     // Catch:{ all -> 0x0075 }
            r0.Z1(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x004e
        L_0x008d:
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0097
            r0.close()     // Catch:{ all -> 0x0095 }
            goto L_0x0097
        L_0x0095:
            r0 = move-exception
            goto L_0x00a4
        L_0x0097:
            r0 = 0
            goto L_0x00a4
        L_0x0099:
            if (r0 == 0) goto L_0x00a3
            r0.close()     // Catch:{ all -> 0x009f }
            goto L_0x00a3
        L_0x009f:
            r0 = move-exception
            XH.C16816g.a(r1, r0)     // Catch:{ all -> 0x0009 }
        L_0x00a3:
            r0 = r1
        L_0x00a4:
            if (r0 != 0) goto L_0x00e1
            F5.c$e r0 = r7.f35435r     // Catch:{ all -> 0x0009 }
            WK.E r1 = r7.f35422e     // Catch:{ all -> 0x0009 }
            boolean r0 = r0.o(r1)     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x00ca
            F5.c$e r0 = r7.f35435r     // Catch:{ all -> 0x0009 }
            WK.E r1 = r7.f35422e     // Catch:{ all -> 0x0009 }
            WK.E r3 = r7.f35424g     // Catch:{ all -> 0x0009 }
            r0.e(r1, r3)     // Catch:{ all -> 0x0009 }
            F5.c$e r0 = r7.f35435r     // Catch:{ all -> 0x0009 }
            WK.E r1 = r7.f35423f     // Catch:{ all -> 0x0009 }
            WK.E r3 = r7.f35422e     // Catch:{ all -> 0x0009 }
            r0.e(r1, r3)     // Catch:{ all -> 0x0009 }
            F5.c$e r0 = r7.f35435r     // Catch:{ all -> 0x0009 }
            WK.E r1 = r7.f35424g     // Catch:{ all -> 0x0009 }
            r0.l(r1)     // Catch:{ all -> 0x0009 }
            goto L_0x00d3
        L_0x00ca:
            F5.c$e r0 = r7.f35435r     // Catch:{ all -> 0x0009 }
            WK.E r1 = r7.f35423f     // Catch:{ all -> 0x0009 }
            WK.E r3 = r7.f35422e     // Catch:{ all -> 0x0009 }
            r0.e(r1, r3)     // Catch:{ all -> 0x0009 }
        L_0x00d3:
            WK.f r0 = r7.U()     // Catch:{ all -> 0x0009 }
            r7.f35429l = r0     // Catch:{ all -> 0x0009 }
            r7.f35428k = r2     // Catch:{ all -> 0x0009 }
            r7.f35430m = r2     // Catch:{ all -> 0x0009 }
            r7.f35434q = r2     // Catch:{ all -> 0x0009 }
            monitor-exit(r7)
            return
        L_0x00e1:
            throw r0     // Catch:{ all -> 0x0009 }
        L_0x00e2:
            monitor-exit(r7)     // Catch:{ all -> 0x0009 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.c.t0():void");
    }

    private final void v() {
        if (this.f35432o) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0125, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void w(F5.c.b r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            F5.c$c r0 = r9.g()     // Catch:{ all -> 0x003c }
            F5.c$b r1 = r0.b()     // Catch:{ all -> 0x003c }
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r9)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0126
            r1 = 0
            if (r10 == 0) goto L_0x009f
            boolean r2 = r0.h()     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x009f
            int r2 = r8.f35421d     // Catch:{ all -> 0x003c }
            r3 = r1
        L_0x001b:
            if (r3 >= r2) goto L_0x0042
            boolean[] r4 = r9.h()     // Catch:{ all -> 0x003c }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x003f
            F5.c$e r4 = r8.f35435r     // Catch:{ all -> 0x003c }
            java.util.ArrayList r5 = r0.c()     // Catch:{ all -> 0x003c }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x003c }
            WK.E r5 = (WK.C16762E) r5     // Catch:{ all -> 0x003c }
            boolean r4 = r4.o(r5)     // Catch:{ all -> 0x003c }
            if (r4 != 0) goto L_0x003f
            r9.a()     // Catch:{ all -> 0x003c }
            monitor-exit(r8)
            return
        L_0x003c:
            r9 = move-exception
            goto L_0x012e
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0042:
            int r9 = r8.f35421d     // Catch:{ all -> 0x003c }
        L_0x0044:
            if (r1 >= r9) goto L_0x00b5
            java.util.ArrayList r2 = r0.c()     // Catch:{ all -> 0x003c }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x003c }
            WK.E r2 = (WK.C16762E) r2     // Catch:{ all -> 0x003c }
            java.util.ArrayList r3 = r0.a()     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            WK.E r3 = (WK.C16762E) r3     // Catch:{ all -> 0x003c }
            F5.c$e r4 = r8.f35435r     // Catch:{ all -> 0x003c }
            boolean r4 = r4.o(r2)     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x0068
            F5.c$e r4 = r8.f35435r     // Catch:{ all -> 0x003c }
            r4.e(r2, r3)     // Catch:{ all -> 0x003c }
            goto L_0x0077
        L_0x0068:
            F5.c$e r2 = r8.f35435r     // Catch:{ all -> 0x003c }
            java.util.ArrayList r4 = r0.a()     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x003c }
            WK.E r4 = (WK.C16762E) r4     // Catch:{ all -> 0x003c }
            S5.e.a(r2, r4)     // Catch:{ all -> 0x003c }
        L_0x0077:
            long[] r2 = r0.e()     // Catch:{ all -> 0x003c }
            r4 = r2[r1]     // Catch:{ all -> 0x003c }
            F5.c$e r2 = r8.f35435r     // Catch:{ all -> 0x003c }
            WK.k r2 = r2.s(r3)     // Catch:{ all -> 0x003c }
            java.lang.Long r2 = r2.d()     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x008e
            long r2 = r2.longValue()     // Catch:{ all -> 0x003c }
            goto L_0x0090
        L_0x008e:
            r2 = 0
        L_0x0090:
            long[] r6 = r0.e()     // Catch:{ all -> 0x003c }
            r6[r1] = r2     // Catch:{ all -> 0x003c }
            long r6 = r8.f35427j     // Catch:{ all -> 0x003c }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.f35427j = r6     // Catch:{ all -> 0x003c }
            int r1 = r1 + 1
            goto L_0x0044
        L_0x009f:
            int r9 = r8.f35421d     // Catch:{ all -> 0x003c }
        L_0x00a1:
            if (r1 >= r9) goto L_0x00b5
            F5.c$e r2 = r8.f35435r     // Catch:{ all -> 0x003c }
            java.util.ArrayList r3 = r0.c()     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            WK.E r3 = (WK.C16762E) r3     // Catch:{ all -> 0x003c }
            r2.l(r3)     // Catch:{ all -> 0x003c }
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00b5:
            r9 = 0
            r0.i(r9)     // Catch:{ all -> 0x003c }
            boolean r9 = r0.h()     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x00c4
            r8.j0(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)
            return
        L_0x00c4:
            int r9 = r8.f35428k     // Catch:{ all -> 0x003c }
            r1 = 1
            int r9 = r9 + r1
            r8.f35428k = r9     // Catch:{ all -> 0x003c }
            WK.f r9 = r8.f35429l     // Catch:{ all -> 0x003c }
            kotlin.jvm.internal.C17542s.g(r9)     // Catch:{ all -> 0x003c }
            r2 = 10
            r3 = 32
            if (r10 != 0) goto L_0x00f8
            boolean r10 = r0.g()     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x00dc
            goto L_0x00f8
        L_0x00dc:
            java.util.LinkedHashMap<java.lang.String, F5.c$c> r10 = r8.f35425h     // Catch:{ all -> 0x003c }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x003c }
            r10.remove(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = "REMOVE"
            r9.D0(r10)     // Catch:{ all -> 0x003c }
            r9.Z1(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = r0.d()     // Catch:{ all -> 0x003c }
            r9.D0(r10)     // Catch:{ all -> 0x003c }
            r9.Z1(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0110
        L_0x00f8:
            r0.l(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = "CLEAN"
            r9.D0(r10)     // Catch:{ all -> 0x003c }
            r9.Z1(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r10 = r0.d()     // Catch:{ all -> 0x003c }
            r9.D0(r10)     // Catch:{ all -> 0x003c }
            r0.o(r9)     // Catch:{ all -> 0x003c }
            r9.Z1(r2)     // Catch:{ all -> 0x003c }
        L_0x0110:
            r9.flush()     // Catch:{ all -> 0x003c }
            long r9 = r8.f35427j     // Catch:{ all -> 0x003c }
            long r0 = r8.f35419b     // Catch:{ all -> 0x003c }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0121
            boolean r9 = r8.J()     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x0124
        L_0x0121:
            r8.N()     // Catch:{ all -> 0x003c }
        L_0x0124:
            monitor-exit(r8)
            return
        L_0x0126:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003c }
            r10.<init>(r9)     // Catch:{ all -> 0x003c }
            throw r10     // Catch:{ all -> 0x003c }
        L_0x012e:
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.c.w(F5.c$b, boolean):void");
    }

    private final void x() {
        close();
        S5.e.b(this.f35435r, this.f35418a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized F5.c.d B(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.v()     // Catch:{ all -> 0x0042 }
            r3.p0(r4)     // Catch:{ all -> 0x0042 }
            r3.F()     // Catch:{ all -> 0x0042 }
            java.util.LinkedHashMap<java.lang.String, F5.c$c> r0 = r3.f35425h     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0042 }
            F5.c$c r0 = (F5.c.C0571c) r0     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0046
            F5.c$d r0 = r0.n()     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x001b
            goto L_0x0046
        L_0x001b:
            int r1 = r3.f35428k     // Catch:{ all -> 0x0042 }
            int r1 = r1 + 1
            r3.f35428k = r1     // Catch:{ all -> 0x0042 }
            WK.f r1 = r3.f35429l     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "READ"
            r1.D0(r2)     // Catch:{ all -> 0x0042 }
            r2 = 32
            r1.Z1(r2)     // Catch:{ all -> 0x0042 }
            r1.D0(r4)     // Catch:{ all -> 0x0042 }
            r4 = 10
            r1.Z1(r4)     // Catch:{ all -> 0x0042 }
            boolean r4 = r3.J()     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0044
            r3.N()     // Catch:{ all -> 0x0042 }
            goto L_0x0044
        L_0x0042:
            r4 = move-exception
            goto L_0x0049
        L_0x0044:
            monitor-exit(r3)
            return r0
        L_0x0046:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x0049:
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.c.B(java.lang.String):F5.c$d");
    }

    public final synchronized void F() {
        try {
            if (!this.f35431n) {
                this.f35435r.l(this.f35423f);
                if (this.f35435r.o(this.f35424g)) {
                    if (this.f35435r.o(this.f35422e)) {
                        this.f35435r.l(this.f35424g);
                    } else {
                        this.f35435r.e(this.f35424g, this.f35422e);
                    }
                }
                if (this.f35435r.o(this.f35422e)) {
                    h0();
                    f0();
                    this.f35431n = true;
                    return;
                }
                t0();
                this.f35431n = true;
            }
        } catch (IOException unused) {
            x();
            this.f35432o = false;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void close() {
        try {
            if (this.f35431n) {
                if (!this.f35432o) {
                    for (C0571c b10 : (C0571c[]) this.f35425h.values().toArray(new C0571c[0])) {
                        b b11 = b10.b();
                        if (b11 != null) {
                            b11.e();
                        }
                    }
                    o0();
                    S.e(this.f35426i, (CancellationException) null, 1, (Object) null);
                    C16771f fVar = this.f35429l;
                    C17542s.g(fVar);
                    fVar.close();
                    this.f35429l = null;
                    this.f35432o = true;
                    return;
                }
            }
            this.f35432o = true;
        } finally {
            while (true) {
            }
        }
    }

    public synchronized void flush() {
        if (this.f35431n) {
            v();
            o0();
            C16771f fVar = this.f35429l;
            C17542s.g(fVar);
            fVar.flush();
        }
    }

    public final synchronized b z(String str) {
        v();
        p0(str);
        F();
        C0571c cVar = this.f35425h.get(str);
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null) {
            if (cVar.f() != 0) {
                return null;
            }
        }
        if (!this.f35433p) {
            if (!this.f35434q) {
                C16771f fVar = this.f35429l;
                C17542s.g(fVar);
                fVar.D0("DIRTY");
                fVar.Z1(32);
                fVar.D0(str);
                fVar.Z1(10);
                fVar.flush();
                if (this.f35430m) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new C0571c(str);
                    this.f35425h.put(str, cVar);
                }
                b bVar = new b(cVar);
                cVar.i(bVar);
                return bVar;
            }
        }
        N();
        return null;
    }
}
