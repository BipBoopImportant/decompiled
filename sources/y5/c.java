package Y5;

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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import r6.C8695c;
import r6.C8697e;
import r6.E;
import r6.j;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0005*\u0001a\b\u0000\u0018\u0000 d2\u00060\u0001j\u0002`\u0002:\u0004;896B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0012J#\u0010 \u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u001cR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u001e2\n\u0010%\u001a\u00060$R\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010#J\u000f\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0012J\u000f\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0012J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u0019J\r\u0010/\u001a\u00020\u0010¢\u0006\u0004\b/\u0010\u0012J\u001e\u00101\u001a\b\u0018\u000100R\u00020\u00002\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010=\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00107R\u0014\u0010?\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u00107R\u0014\u0010A\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u00107R$\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060$R\u00020\u00000B8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010N\u001a\u00060Jj\u0002`K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010/R\u0016\u0010R\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010:R\u0018\u0010U\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\u0016\u0010\\\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010WR\u0016\u0010^\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010WR\u0016\u0010`\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010WR\u0014\u0010\u0004\u001a\u00020a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006e"}, d2 = {"LY5/c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "LWK/l;", "fileSystem", "LWK/E;", "directory", "LdI/i;", "cleanupCoroutineContext", "", "maxSize", "", "appVersion", "valueCount", "<init>", "(LWK/l;LWK/E;LdI/i;JII)V", "LXH/N;", "i0", "()V", "LWK/f;", "e0", "()LWK/f;", "", "line", "j0", "(Ljava/lang/String;)V", "h0", "A0", "LY5/c$b;", "editor", "", "success", "x", "(LY5/c$b;Z)V", "N", "()Z", "LY5/c$c;", "entry", "l0", "(LY5/c$c;)Z", "w", "p0", "o0", "z", "U", "key", "t0", "J", "LY5/c$d;", "F", "(Ljava/lang/String;)LY5/c$d;", "B", "(Ljava/lang/String;)LY5/c$b;", "close", "a", "LWK/E;", "b", "c", "I", "d", "e", "journalFile", "f", "journalFileTmp", "g", "journalFileBackup", "", "h", "Ljava/util/Map;", "lruEntries", "LQJ/Q;", "i", "LQJ/Q;", "cleanupScope", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "j", "Ljava/lang/Object;", "lock", "k", "size", "l", "operationsSinceRewrite", "m", "LWK/f;", "journalWriter", "n", "Z", "hasJournalErrors", "o", "initialized", "p", "closed", "q", "mostRecentTrimFailed", "r", "mostRecentRebuildFailed", "Y5/c$e", "s", "LY5/c$e;", "t", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements AutoCloseable {

    /* renamed from: t  reason: collision with root package name */
    public static final a f40830t = new a((DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    private static final C15850p f40831u = new C15850p("[a-z0-9_-]{1,120}");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C16762E f40832a;

    /* renamed from: b  reason: collision with root package name */
    private final long f40833b;

    /* renamed from: c  reason: collision with root package name */
    private final int f40834c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f40835d;

    /* renamed from: e  reason: collision with root package name */
    private final C16762E f40836e;

    /* renamed from: f  reason: collision with root package name */
    private final C16762E f40837f;

    /* renamed from: g  reason: collision with root package name */
    private final C16762E f40838g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, C0683c> f40839h;

    /* renamed from: i  reason: collision with root package name */
    private final Q f40840i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Object f40841j;

    /* renamed from: k  reason: collision with root package name */
    private long f40842k;

    /* renamed from: l  reason: collision with root package name */
    private int f40843l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public C16771f f40844m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f40845n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f40846o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f40847p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f40848q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f40849r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final e f40850s;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LY5/c$a;", "", "<init>", "()V", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "REMOVE", "READ", "LHJ/p;", "LEGAL_KEY_PATTERN", "LHJ/p;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LY5/c$b;", "", "LY5/c$c;", "LY5/c;", "entry", "<init>", "(LY5/c;LY5/c$c;)V", "", "success", "LXH/N;", "d", "(Z)V", "", "index", "LWK/E;", "f", "(I)LWK/E;", "e", "()V", "b", "LY5/c$d;", "c", "()LY5/c$d;", "a", "LY5/c$c;", "g", "()LY5/c$c;", "Z", "closed", "", "[Z", "h", "()[Z", "written", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C0683c f40851a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f40852b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean[] f40853c;

        public b(C0683c cVar) {
            this.f40851a = cVar;
            this.f40853c = new boolean[c.this.f40835d];
        }

        private final void d(boolean z10) {
            Object i10 = c.this.f40841j;
            c cVar = c.this;
            synchronized (i10) {
                try {
                    if (!this.f40852b) {
                        if (C17542s.e(this.f40851a.b(), this)) {
                            cVar.x(this, z10);
                        }
                        this.f40852b = true;
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
            d F10;
            Object i10 = c.this.f40841j;
            c cVar = c.this;
            synchronized (i10) {
                b();
                F10 = cVar.F(this.f40851a.d());
            }
            return F10;
        }

        public final void e() {
            if (C17542s.e(this.f40851a.b(), this)) {
                this.f40851a.m(true);
            }
        }

        public final C16762E f(int i10) {
            C16762E e10;
            Object i11 = c.this.f40841j;
            c cVar = c.this;
            synchronized (i11) {
                if (!this.f40852b) {
                    this.f40853c[i10] = true;
                    C16762E e11 = this.f40851a.c().get(i10);
                    j.b(cVar.f40850s, e11, false, 2, (Object) null);
                    e10 = e11;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            }
            return e10;
        }

        public final C0683c g() {
            return this.f40851a;
        }

        public final boolean[] h() {
            return this.f40853c;
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0013\u0010\"R'\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b \u0010\"R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R(\u00105\u001a\b\u0018\u000100R\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u00101\u001a\u0004\b\u0018\u00102\"\u0004\b3\u00104R\"\u0010;\u001a\u0002068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\b,\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"LY5/c$c;", "", "", "key", "<init>", "(LY5/c;Ljava/lang/String;)V", "", "strings", "LXH/N;", "j", "(Ljava/util/List;)V", "LWK/f;", "writer", "o", "(LWK/f;)V", "LY5/c$d;", "LY5/c;", "n", "()LY5/c$d;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "Ljava/util/ArrayList;", "LWK/E;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "l", "(Z)V", "readable", "f", "h", "m", "zombie", "LY5/c$b;", "LY5/c$b;", "()LY5/c$b;", "i", "(LY5/c$b;)V", "currentEditor", "", "I", "()I", "k", "(I)V", "lockingSnapshotCount", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Y5.c$c  reason: collision with other inner class name */
    public final class C0683c {

        /* renamed from: a  reason: collision with root package name */
        private final String f40855a;

        /* renamed from: b  reason: collision with root package name */
        private final long[] f40856b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<C16762E> f40857c;

        /* renamed from: d  reason: collision with root package name */
        private final ArrayList<C16762E> f40858d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f40859e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f40860f;

        /* renamed from: g  reason: collision with root package name */
        private b f40861g;

        /* renamed from: h  reason: collision with root package name */
        private int f40862h;

        public C0683c(String str) {
            this.f40855a = str;
            this.f40856b = new long[c.this.f40835d];
            this.f40857c = new ArrayList<>(c.this.f40835d);
            this.f40858d = new ArrayList<>(c.this.f40835d);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int l10 = c.this.f40835d;
            for (int i10 = 0; i10 < l10; i10++) {
                sb2.append(i10);
                this.f40857c.add(c.this.f40832a.G(sb2.toString()));
                sb2.append(".tmp");
                this.f40858d.add(c.this.f40832a.G(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList<C16762E> a() {
            return this.f40857c;
        }

        public final b b() {
            return this.f40861g;
        }

        public final ArrayList<C16762E> c() {
            return this.f40858d;
        }

        public final String d() {
            return this.f40855a;
        }

        public final long[] e() {
            return this.f40856b;
        }

        public final int f() {
            return this.f40862h;
        }

        public final boolean g() {
            return this.f40859e;
        }

        public final boolean h() {
            return this.f40860f;
        }

        public final void i(b bVar) {
            this.f40861g = bVar;
        }

        public final void j(List<String> list) {
            if (list.size() == c.this.f40835d) {
                try {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        this.f40856b[i10] = Long.parseLong(list.get(i10));
                    }
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + list);
                }
            } else {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i10) {
            this.f40862h = i10;
        }

        public final void l(boolean z10) {
            this.f40859e = z10;
        }

        public final void m(boolean z10) {
            this.f40860f = z10;
        }

        public final d n() {
            if (!this.f40859e || this.f40861g != null || this.f40860f) {
                return null;
            }
            ArrayList<C16762E> arrayList = this.f40857c;
            c cVar = c.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!cVar.f40850s.o(arrayList.get(i10))) {
                    try {
                        boolean unused = cVar.l0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            this.f40862h++;
            return new d(this);
        }

        public final void o(C16771f fVar) {
            for (long u12 : this.f40856b) {
                fVar.Z1(32).u1(u12);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0005\u001a\u00060\u0003R\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LY5/c$d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "LY5/c$c;", "LY5/c;", "entry", "<init>", "(LY5/c;LY5/c$c;)V", "", "index", "LWK/E;", "d", "(I)LWK/E;", "LXH/N;", "close", "()V", "LY5/c$b;", "c", "()LY5/c$b;", "a", "LY5/c$c;", "getEntry", "()LY5/c$c;", "", "b", "Z", "closed", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class d implements AutoCloseable {

        /* renamed from: a  reason: collision with root package name */
        private final C0683c f40864a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f40865b;

        public d(C0683c cVar) {
            this.f40864a = cVar;
        }

        public final b c() {
            b B10;
            Object i10 = c.this.f40841j;
            c cVar = c.this;
            synchronized (i10) {
                close();
                B10 = cVar.B(this.f40864a.d());
            }
            return B10;
        }

        public void close() {
            if (!this.f40865b) {
                this.f40865b = true;
                Object i10 = c.this.f40841j;
                c cVar = c.this;
                synchronized (i10) {
                    try {
                        C0683c cVar2 = this.f40864a;
                        cVar2.k(cVar2.f() - 1);
                        if (this.f40864a.f() == 0 && this.f40864a.h()) {
                            boolean unused = cVar.l0(this.f40864a);
                        }
                        C16807N n10 = C16807N.f139792a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final C16762E d(int i10) {
            if (!this.f40865b) {
                return this.f40864a.a().get(i10);
            }
            throw new IllegalStateException("snapshot is closed");
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Y5/c$e", "LWK/m;", "LWK/E;", "file", "", "mustCreate", "LWK/L;", "z", "(LWK/E;Z)LWK/L;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil3.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f40868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f40868d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f40868d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:9|10|11|13|14|15|16|(1:18)) */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            Y5.c.s(r0, true);
            Y5.c.q(r0, WK.y.c(WK.y.b()));
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0046=Splitter:B:24:0x0046, B:13:0x0027=Splitter:B:13:0x0027, B:15:0x002a=Splitter:B:15:0x002a} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                eI.C17187b.f()
                int r0 = r3.f40867c
                if (r0 != 0) goto L_0x004c
                XH.y.b(r4)
                Y5.c r4 = r3.f40868d
                java.lang.Object r4 = r4.f40841j
                Y5.c r0 = r3.f40868d
                monitor-enter(r4)
                boolean r1 = r0.f40846o     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0046
                boolean r1 = r0.f40847p     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0020
                goto L_0x0046
            L_0x0020:
                r1 = 1
                r0.p0()     // Catch:{ IOException -> 0x0027 }
                goto L_0x002a
            L_0x0025:
                r0 = move-exception
                goto L_0x004a
            L_0x0027:
                r0.f40848q = r1     // Catch:{ all -> 0x0025 }
            L_0x002a:
                boolean r2 = r0.N()     // Catch:{ IOException -> 0x0034 }
                if (r2 == 0) goto L_0x0042
                r0.A0()     // Catch:{ IOException -> 0x0034 }
                goto L_0x0042
            L_0x0034:
                r0.f40849r = r1     // Catch:{ all -> 0x0025 }
                WK.L r1 = WK.y.b()     // Catch:{ all -> 0x0025 }
                WK.f r1 = WK.y.c(r1)     // Catch:{ all -> 0x0025 }
                r0.f40844m = r1     // Catch:{ all -> 0x0025 }
            L_0x0042:
                monitor-exit(r4)
                XH.N r4 = XH.C16807N.f139792a
                return r4
            L_0x0046:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0025 }
                monitor-exit(r4)
                return r0
            L_0x004a:
                monitor-exit(r4)
                throw r0
            L_0x004c:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Y5.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c(C16777l lVar, C16762E e10, C17168i iVar, long j10, int i10, int i11) {
        this.f40832a = e10;
        this.f40833b = j10;
        this.f40834c = i10;
        this.f40835d = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            this.f40836e = e10.G("journal");
            this.f40837f = e10.G("journal.tmp");
            this.f40838g = e10.G("journal.bkp");
            this.f40839h = C8695c.b(0, 0.0f, 3, (Object) null);
            C17168i plus = iVar.plus(b1.b((F0) null, 1, (Object) null));
            M j11 = E.j(iVar);
            this.f40840i = S.a(plus.plus(M.O0(j11 == null ? C8697e.a() : j11, 1, (String) null, 2, (Object) null)));
            this.f40841j = new Object();
            this.f40850s = new e(lVar);
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8 A[Catch:{ all -> 0x0077, all -> 0x00a1, all -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5 A[SYNTHETIC, Splitter:B:41:0x00e5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f40841j
            monitor-enter(r0)
            WK.f r1 = r8.f40844m     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x000e
            r1.close()     // Catch:{ all -> 0x000b }
            goto L_0x000e
        L_0x000b:
            r1 = move-exception
            goto L_0x00e6
        L_0x000e:
            Y5.c$e r1 = r8.f40850s     // Catch:{ all -> 0x000b }
            WK.E r2 = r8.f40837f     // Catch:{ all -> 0x000b }
            r3 = 0
            WK.L r1 = r1.z(r2, r3)     // Catch:{ all -> 0x000b }
            WK.f r1 = WK.y.c(r1)     // Catch:{ all -> 0x000b }
            java.lang.String r2 = "libcore.io.DiskLruCache"
            WK.f r2 = r1.D0(r2)     // Catch:{ all -> 0x0077 }
            r4 = 10
            r2.Z1(r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r2 = "1"
            WK.f r2 = r1.D0(r2)     // Catch:{ all -> 0x0077 }
            r2.Z1(r4)     // Catch:{ all -> 0x0077 }
            int r2 = r8.f40834c     // Catch:{ all -> 0x0077 }
            long r5 = (long) r2     // Catch:{ all -> 0x0077 }
            WK.f r2 = r1.u1(r5)     // Catch:{ all -> 0x0077 }
            r2.Z1(r4)     // Catch:{ all -> 0x0077 }
            int r2 = r8.f40835d     // Catch:{ all -> 0x0077 }
            long r5 = (long) r2     // Catch:{ all -> 0x0077 }
            WK.f r2 = r1.u1(r5)     // Catch:{ all -> 0x0077 }
            r2.Z1(r4)     // Catch:{ all -> 0x0077 }
            r1.Z1(r4)     // Catch:{ all -> 0x0077 }
            java.util.Map<java.lang.String, Y5.c$c> r2 = r8.f40839h     // Catch:{ all -> 0x0077 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0077 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0077 }
        L_0x0050:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0077 }
            Y5.c$c r5 = (Y5.c.C0683c) r5     // Catch:{ all -> 0x0077 }
            Y5.c$b r6 = r5.b()     // Catch:{ all -> 0x0077 }
            r7 = 32
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = "DIRTY"
            r1.D0(r6)     // Catch:{ all -> 0x0077 }
            r1.Z1(r7)     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = r5.d()     // Catch:{ all -> 0x0077 }
            r1.D0(r5)     // Catch:{ all -> 0x0077 }
            r1.Z1(r4)     // Catch:{ all -> 0x0077 }
            goto L_0x0050
        L_0x0077:
            r2 = move-exception
            goto L_0x009b
        L_0x0079:
            java.lang.String r6 = "CLEAN"
            r1.D0(r6)     // Catch:{ all -> 0x0077 }
            r1.Z1(r7)     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = r5.d()     // Catch:{ all -> 0x0077 }
            r1.D0(r6)     // Catch:{ all -> 0x0077 }
            r5.o(r1)     // Catch:{ all -> 0x0077 }
            r1.Z1(r4)     // Catch:{ all -> 0x0077 }
            goto L_0x0050
        L_0x008f:
            XH.N r2 = XH.C16807N.f139792a     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x0099
            r1.close()     // Catch:{ all -> 0x0097 }
            goto L_0x0099
        L_0x0097:
            r1 = move-exception
            goto L_0x00a6
        L_0x0099:
            r1 = 0
            goto L_0x00a6
        L_0x009b:
            if (r1 == 0) goto L_0x00a5
            r1.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a5
        L_0x00a1:
            r1 = move-exception
            XH.C16816g.a(r2, r1)     // Catch:{ all -> 0x000b }
        L_0x00a5:
            r1 = r2
        L_0x00a6:
            if (r1 != 0) goto L_0x00e5
            Y5.c$e r1 = r8.f40850s     // Catch:{ all -> 0x000b }
            WK.E r2 = r8.f40836e     // Catch:{ all -> 0x000b }
            boolean r1 = r1.o(r2)     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x00cc
            Y5.c$e r1 = r8.f40850s     // Catch:{ all -> 0x000b }
            WK.E r2 = r8.f40836e     // Catch:{ all -> 0x000b }
            WK.E r4 = r8.f40838g     // Catch:{ all -> 0x000b }
            r1.e(r2, r4)     // Catch:{ all -> 0x000b }
            Y5.c$e r1 = r8.f40850s     // Catch:{ all -> 0x000b }
            WK.E r2 = r8.f40837f     // Catch:{ all -> 0x000b }
            WK.E r4 = r8.f40836e     // Catch:{ all -> 0x000b }
            r1.e(r2, r4)     // Catch:{ all -> 0x000b }
            Y5.c$e r1 = r8.f40850s     // Catch:{ all -> 0x000b }
            WK.E r2 = r8.f40838g     // Catch:{ all -> 0x000b }
            r1.l(r2)     // Catch:{ all -> 0x000b }
            goto L_0x00d5
        L_0x00cc:
            Y5.c$e r1 = r8.f40850s     // Catch:{ all -> 0x000b }
            WK.E r2 = r8.f40837f     // Catch:{ all -> 0x000b }
            WK.E r4 = r8.f40836e     // Catch:{ all -> 0x000b }
            r1.e(r2, r4)     // Catch:{ all -> 0x000b }
        L_0x00d5:
            WK.f r1 = r8.e0()     // Catch:{ all -> 0x000b }
            r8.f40844m = r1     // Catch:{ all -> 0x000b }
            r8.f40843l = r3     // Catch:{ all -> 0x000b }
            r8.f40845n = r3     // Catch:{ all -> 0x000b }
            r8.f40849r = r3     // Catch:{ all -> 0x000b }
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x000b }
            monitor-exit(r0)
            return
        L_0x00e5:
            throw r1     // Catch:{ all -> 0x000b }
        L_0x00e6:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.c.A0():void");
    }

    /* access modifiers changed from: private */
    public final boolean N() {
        return this.f40843l >= 2000;
    }

    private final void U() {
        F0 unused = C16314k.d(this.f40840i, (C17168i) null, (T) null, new f(this, (C17164e<? super f>) null), 3, (Object) null);
    }

    private final C16771f e0() {
        return y.c(new d(this.f40850s.c(this.f40836e), new b(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(c cVar, IOException iOException) {
        cVar.f40845n = true;
        return C16807N.f139792a;
    }

    private final void h0() {
        Iterator<C0683c> it = this.f40839h.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C0683c next = it.next();
            int i10 = 0;
            if (next.b() == null) {
                int i11 = this.f40835d;
                while (i10 < i11) {
                    j10 += next.e()[i10];
                    i10++;
                }
            } else {
                next.i((b) null);
                int i12 = this.f40835d;
                while (i10 < i12) {
                    this.f40850s.l(next.a().get(i10));
                    this.f40850s.l(next.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f40842k = j10;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|(1:20)(1:21)|22|(2:24|25)|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r10.f40843l = r0 - r10.f40839h.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r1.Y1() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        A0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r10.f40844m = e0();
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
    private final void i0() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            Y5.c$e r1 = r10.f40850s
            WK.E r2 = r10.f40836e
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
            int r7 = r10.f40834c     // Catch:{ all -> 0x005b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r4)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0082
            int r7 = r10.f40835d     // Catch:{ all -> 0x005b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r5)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0082
            int r7 = r6.length()     // Catch:{ all -> 0x005b }
            if (r7 > 0) goto L_0x0082
            r0 = 0
        L_0x0051:
            java.lang.String r2 = r1.Z0()     // Catch:{ EOFException -> 0x005d }
            r10.j0(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0051
        L_0x005b:
            r0 = move-exception
            goto L_0x00b6
        L_0x005d:
            java.util.Map<java.lang.String, Y5.c$c> r2 = r10.f40839h     // Catch:{ all -> 0x005b }
            int r2 = r2.size()     // Catch:{ all -> 0x005b }
            int r0 = r0 - r2
            r10.f40843l = r0     // Catch:{ all -> 0x005b }
            boolean r0 = r1.Y1()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0070
            r10.A0()     // Catch:{ all -> 0x005b }
            goto L_0x0076
        L_0x0070:
            WK.f r0 = r10.e0()     // Catch:{ all -> 0x005b }
            r10.f40844m = r0     // Catch:{ all -> 0x005b }
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
        throw new UnsupportedOperationException("Method not decompiled: Y5.c.i0():void");
    }

    private final void j0(String str) {
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
                    this.f40839h.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i10, r03);
                C17542s.i(str2, "substring(...)");
            }
            Map<String, C0683c> map = this.f40839h;
            C0683c cVar = map.get(str2);
            if (cVar == null) {
                cVar = new C0683c(str2);
                map.put(str2, cVar);
            }
            C0683c cVar2 = cVar;
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
    public final boolean l0(C0683c cVar) {
        C16771f fVar;
        if (cVar.f() > 0 && (fVar = this.f40844m) != null) {
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
        int i10 = this.f40835d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f40850s.l(cVar.a().get(i11));
            this.f40842k -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f40843l++;
        C16771f fVar2 = this.f40844m;
        if (fVar2 != null) {
            fVar2.D0("REMOVE");
            fVar2.Z1(32);
            fVar2.D0(cVar.d());
            fVar2.Z1(10);
            fVar2.flush();
        }
        this.f40839h.remove(cVar.d());
        if (N()) {
            U();
        }
        return true;
    }

    private final boolean o0() {
        for (C0683c next : this.f40839h.values()) {
            if (!next.h()) {
                l0(next);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void p0() {
        while (this.f40842k > this.f40833b) {
            if (!o0()) {
                return;
            }
        }
        this.f40848q = false;
    }

    private final void t0(String str) {
        if (!f40831u.i(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    private final void w() {
        if (this.f40847p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    public final void x(b bVar, boolean z10) {
        synchronized (this.f40841j) {
            C0683c g10 = bVar.g();
            if (C17542s.e(g10.b(), bVar)) {
                if (!z10 || g10.h()) {
                    int i10 = this.f40835d;
                    for (int i11 = 0; i11 < i10; i11++) {
                        this.f40850s.l(g10.c().get(i11));
                    }
                } else {
                    int i12 = this.f40835d;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (!bVar.h()[i13] || this.f40850s.o(g10.c().get(i13))) {
                            i13++;
                        } else {
                            bVar.a();
                            return;
                        }
                    }
                    int i14 = this.f40835d;
                    for (int i15 = 0; i15 < i14; i15++) {
                        C16762E e10 = g10.c().get(i15);
                        C16762E e11 = g10.a().get(i15);
                        if (this.f40850s.o(e10)) {
                            this.f40850s.e(e10, e11);
                        } else {
                            j.b(this.f40850s, g10.a().get(i15), false, 2, (Object) null);
                        }
                        long j10 = g10.e()[i15];
                        Long d10 = this.f40850s.s(e11).d();
                        long longValue = d10 != null ? d10.longValue() : 0;
                        g10.e()[i15] = longValue;
                        this.f40842k = (this.f40842k - j10) + longValue;
                    }
                }
                g10.i((b) null);
                if (g10.h()) {
                    l0(g10);
                    return;
                }
                this.f40843l++;
                C16771f fVar = this.f40844m;
                C17542s.g(fVar);
                if (!z10) {
                    if (!g10.g()) {
                        this.f40839h.remove(g10.d());
                        fVar.D0("REMOVE");
                        fVar.Z1(32);
                        fVar.D0(g10.d());
                        fVar.Z1(10);
                        fVar.flush();
                        if (this.f40842k > this.f40833b || N()) {
                            U();
                        }
                        C16807N n10 = C16807N.f139792a;
                        return;
                    }
                }
                g10.l(true);
                fVar.D0("CLEAN");
                fVar.Z1(32);
                fVar.D0(g10.d());
                g10.o(fVar);
                fVar.Z1(10);
                fVar.flush();
                U();
                C16807N n102 = C16807N.f139792a;
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    private final void z() {
        close();
        j.c(this.f40850s, this.f40832a);
    }

    public final b B(String str) {
        synchronized (this.f40841j) {
            w();
            t0(str);
            J();
            C0683c cVar = this.f40839h.get(str);
            if ((cVar != null ? cVar.b() : null) != null) {
                return null;
            }
            if (cVar != null) {
                if (cVar.f() != 0) {
                    return null;
                }
            }
            if (!this.f40848q) {
                if (!this.f40849r) {
                    C16771f fVar = this.f40844m;
                    C17542s.g(fVar);
                    fVar.D0("DIRTY");
                    fVar.Z1(32);
                    fVar.D0(str);
                    fVar.Z1(10);
                    fVar.flush();
                    if (this.f40845n) {
                        return null;
                    }
                    if (cVar == null) {
                        cVar = new C0683c(str);
                        this.f40839h.put(str, cVar);
                    }
                    b bVar = new b(cVar);
                    cVar.i(bVar);
                    return bVar;
                }
            }
            U();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Y5.c.d F(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f40841j
            monitor-enter(r0)
            r4.w()     // Catch:{ all -> 0x0047 }
            r4.t0(r5)     // Catch:{ all -> 0x0047 }
            r4.J()     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, Y5.c$c> r1 = r4.f40839h     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0047 }
            Y5.c$c r1 = (Y5.c.C0683c) r1     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x004b
            Y5.c$d r1 = r1.n()     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x001d
            goto L_0x004b
        L_0x001d:
            int r2 = r4.f40843l     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.f40843l = r2     // Catch:{ all -> 0x0047 }
            WK.f r2 = r4.f40844m     // Catch:{ all -> 0x0047 }
            kotlin.jvm.internal.C17542s.g(r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "READ"
            r2.D0(r3)     // Catch:{ all -> 0x0047 }
            r3 = 32
            r2.Z1(r3)     // Catch:{ all -> 0x0047 }
            r2.D0(r5)     // Catch:{ all -> 0x0047 }
            r5 = 10
            r2.Z1(r5)     // Catch:{ all -> 0x0047 }
            r2.flush()     // Catch:{ all -> 0x0047 }
            boolean r5 = r4.N()     // Catch:{ all -> 0x0047 }
            if (r5 == 0) goto L_0x0049
            r4.U()     // Catch:{ all -> 0x0047 }
            goto L_0x0049
        L_0x0047:
            r5 = move-exception
            goto L_0x004e
        L_0x0049:
            monitor-exit(r0)
            return r1
        L_0x004b:
            monitor-exit(r0)
            r5 = 0
            return r5
        L_0x004e:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.c.F(java.lang.String):Y5.c$d");
    }

    public final void J() {
        synchronized (this.f40841j) {
            try {
                if (!this.f40846o) {
                    this.f40850s.l(this.f40837f);
                    if (this.f40850s.o(this.f40838g)) {
                        if (this.f40850s.o(this.f40836e)) {
                            this.f40850s.l(this.f40838g);
                        } else {
                            this.f40850s.e(this.f40838g, this.f40836e);
                        }
                    }
                    if (this.f40850s.o(this.f40836e)) {
                        i0();
                        h0();
                        this.f40846o = true;
                        return;
                    }
                    A0();
                    this.f40846o = true;
                    C16807N n10 = C16807N.f139792a;
                }
            } catch (IOException unused) {
                z();
                this.f40847p = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized (this.f40841j) {
            try {
                if (this.f40846o) {
                    if (!this.f40847p) {
                        for (C0683c b10 : (C0683c[]) this.f40839h.values().toArray(new C0683c[0])) {
                            b b11 = b10.b();
                            if (b11 != null) {
                                b11.e();
                            }
                        }
                        p0();
                        S.e(this.f40840i, (CancellationException) null, 1, (Object) null);
                        C16771f fVar = this.f40844m;
                        C17542s.g(fVar);
                        fVar.close();
                        this.f40844m = null;
                        this.f40847p = true;
                        C16807N n10 = C16807N.f139792a;
                        return;
                    }
                }
                this.f40847p = true;
            } finally {
            }
        }
    }
}
