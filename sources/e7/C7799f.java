package e7;

import XH.C16807N;
import XH.y;
import c7.C7100a;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import dI.C17164e;
import eI.C17187b;
import j7.C8410d;
import jI.C17415b;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import r7.C8704f;
import r7.C8708j;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\t\u0010\nJ6\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Le7/f;", "Lc7/a;", "Lr7/j;", "Lr7/f;", "logListService", "<init>", "(Lr7/f;)V", "", "logListZip", "h", "([BLdI/e;)Ljava/lang/Object;", "tooBig", "Lkotlin/Function1;", "LdI/e;", "", "lambda", "Le7/f$b;", "k", "(Lr7/j;LnI/l;LdI/e;)Ljava/lang/Object;", "a", "(LdI/e;)Ljava/lang/Object;", "Lr7/f;", "b", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: e7.f  reason: case insensitive filesystem */
public final class C7799f implements C7100a<C8708j> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50855b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C8704f f50856a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Le7/f$a;", "", "<init>", "()V", "", "LOG_LIST_JSON_MAX_SIZE", "J", "LOG_LIST_SIG_MAX_SIZE", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: e7.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Le7/f$b;", "", "b", "a", "Le7/f$b$a;", "Le7/f$b$b;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: e7.f$b */
    private interface b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Le7/f$b$a;", "Le7/f$b;", "Lr7/j;", "error", "<init>", "(Lr7/j;)V", "a", "Lr7/j;", "()Lr7/j;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: e7.f$b$a */
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            private final C8708j f50857a;

            public a(C8708j jVar) {
                C17542s.j(jVar, UiComponentContainer.RESULT_ERROR);
                this.f50857a = jVar;
            }

            public final C8708j a() {
                return this.f50857a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Le7/f$b$b;", "Le7/f$b;", "", "bytes", "<init>", "([B)V", "a", "[B", "()[B", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: e7.f$b$b  reason: collision with other inner class name */
        public static final class C0836b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final byte[] f50858a;

            public C0836b(byte[] bArr) {
                C17542s.j(bArr, "bytes");
                this.f50858a = bArr;
            }

            public final byte[] a() {
                return this.f50858a;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.appmattus.certificatetransparency.internal.loglist.LogListZipNetworkDataSource", f = "LogListZipNetworkDataSource.kt", l = {35, 36}, m = "get")
    /* renamed from: e7.f$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f50859c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f50860d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C7799f f50861e;

        /* renamed from: f  reason: collision with root package name */
        int f50862f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C7799f fVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f50861e = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f50860d = obj;
            this.f50862f |= Integer.MIN_VALUE;
            return this.f50861e.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0012\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.appmattus.certificatetransparency.internal.loglist.LogListZipNetworkDataSource$get$logListZip$1", f = "LogListZipNetworkDataSource.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: e7.f$d */
    static final class d extends l implements C17642l<C17164e<? super byte[]>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f50863c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C7799f f50864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C7799f fVar, C17164e<? super d> eVar) {
            super(1, eVar);
            this.f50864d = fVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new d(this.f50864d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super byte[]> eVar) {
            return ((d) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f50863c;
            if (i10 == 0) {
                y.b(obj);
                C8704f e10 = this.f50864d.f50856a;
                this.f50863c = 1;
                obj = e10.a(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.appmattus.certificatetransparency.internal.loglist.LogListZipNetworkDataSource", f = "LogListZipNetworkDataSource.kt", l = {48, 53}, m = "readZip")
    /* renamed from: e7.f$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f50865c;

        /* renamed from: d  reason: collision with root package name */
        Object f50866d;

        /* renamed from: e  reason: collision with root package name */
        Object f50867e;

        /* renamed from: f  reason: collision with root package name */
        Object f50868f;

        /* renamed from: g  reason: collision with root package name */
        Object f50869g;

        /* renamed from: h  reason: collision with root package name */
        Object f50870h;

        /* renamed from: i  reason: collision with root package name */
        Object f50871i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f50872j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C7799f f50873k;

        /* renamed from: l  reason: collision with root package name */
        int f50874l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C7799f fVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f50873k = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f50872j = obj;
            this.f50874l |= Integer.MIN_VALUE;
            return this.f50873k.h((byte[]) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0012\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.appmattus.certificatetransparency.internal.loglist.LogListZipNetworkDataSource$readZip$2$3$1", f = "LogListZipNetworkDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e7.f$f  reason: collision with other inner class name */
    static final class C0837f extends l implements C17642l<C17164e<? super byte[]>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f50875c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ZipInputStream f50876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0837f(ZipInputStream zipInputStream, C17164e<? super C0837f> eVar) {
            super(1, eVar);
            this.f50876d = zipInputStream;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C0837f(this.f50876d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super byte[]> eVar) {
            return ((C0837f) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f50875c == 0) {
                y.b(obj);
                return C17415b.c(new C8410d(this.f50876d, 1048576));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0012\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.appmattus.certificatetransparency.internal.loglist.LogListZipNetworkDataSource$readZip$2$3$2", f = "LogListZipNetworkDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e7.f$g */
    static final class g extends l implements C17642l<C17164e<? super byte[]>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f50877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ZipInputStream f50878d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ZipInputStream zipInputStream, C17164e<? super g> eVar) {
            super(1, eVar);
            this.f50878d = zipInputStream;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new g(this.f50878d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super byte[]> eVar) {
            return ((g) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f50877c == 0) {
                y.b(obj);
                return C17415b.c(new C8410d(this.f50878d, 512));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.appmattus.certificatetransparency.internal.loglist.LogListZipNetworkDataSource", f = "LogListZipNetworkDataSource.kt", l = {76}, m = "wrap")
    /* renamed from: e7.f$h */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f50879c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f50880d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C7799f f50881e;

        /* renamed from: f  reason: collision with root package name */
        int f50882f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C7799f fVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f50881e = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f50880d = obj;
            this.f50882f |= Integer.MIN_VALUE;
            return this.f50881e.k((C8708j) null, (C17642l<? super C17164e<? super byte[]>, ? extends Object>) null, this);
        }
    }

    public C7799f(C8704f fVar) {
        C17542s.j(fVar, "logListService");
        this.f50856a = fVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016b, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016c, code lost:
        jI.C17416c.a(r6, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016f, code lost:
        throw r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af A[Catch:{ all -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011c A[Catch:{ all -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(byte[] r13, dI.C17164e<? super r7.C8708j> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof e7.C7799f.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            e7.f$e r0 = (e7.C7799f.e) r0
            int r1 = r0.f50874l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f50874l = r1
            goto L_0x0018
        L_0x0013:
            e7.f$e r0 = new e7.f$e
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f50872j
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f50874l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r4) goto L_0x0054
            if (r2 != r3) goto L_0x004c
            java.lang.Object r13 = r0.f50871i
            kotlin.jvm.internal.O r13 = (kotlin.jvm.internal.O) r13
            java.lang.Object r2 = r0.f50870h
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.f50869g
            java.util.zip.ZipInputStream r5 = (java.util.zip.ZipInputStream) r5
            java.lang.Object r6 = r0.f50868f
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r7 = r0.f50867e
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r8 = r0.f50866d
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r9 = r0.f50865c
            e7.f r9 = (e7.C7799f) r9
            XH.y.b(r14)     // Catch:{ all -> 0x0049 }
            goto L_0x0115
        L_0x0049:
            r13 = move-exception
            goto L_0x016a
        L_0x004c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0054:
            java.lang.Object r13 = r0.f50871i
            kotlin.jvm.internal.O r13 = (kotlin.jvm.internal.O) r13
            java.lang.Object r2 = r0.f50870h
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.f50869g
            java.util.zip.ZipInputStream r5 = (java.util.zip.ZipInputStream) r5
            java.lang.Object r6 = r0.f50868f
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r7 = r0.f50867e
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r8 = r0.f50866d
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r9 = r0.f50865c
            e7.f r9 = (e7.C7799f) r9
            XH.y.b(r14)     // Catch:{ all -> 0x0049 }
            goto L_0x00ea
        L_0x0075:
            XH.y.b(r14)
            kotlin.jvm.internal.O r14 = new kotlin.jvm.internal.O
            r14.<init>()
            kotlin.jvm.internal.O r2 = new kotlin.jvm.internal.O
            r2.<init>()
            java.util.zip.ZipInputStream r6 = new java.util.zip.ZipInputStream
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r13)
            r6.<init>(r5)
            e7.d r13 = new e7.d     // Catch:{ all -> 0x0049 }
            r13.<init>(r6)     // Catch:{ all -> 0x0049 }
            GJ.h r13 = GJ.C15768k.r(r13)     // Catch:{ all -> 0x0049 }
            e7.e r5 = new e7.e     // Catch:{ all -> 0x0049 }
            r5.<init>()     // Catch:{ all -> 0x0049 }
            GJ.h r13 = GJ.C15768k.H(r13, r5)     // Catch:{ all -> 0x0049 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0049 }
            r9 = r12
            r8 = r14
            r5 = r6
            r11 = r2
            r2 = r13
            r13 = r11
        L_0x00a8:
            boolean r14 = r2.hasNext()     // Catch:{ all -> 0x0049 }
            r7 = 0
            if (r14 == 0) goto L_0x011c
            java.lang.Object r14 = r2.next()     // Catch:{ all -> 0x0049 }
            java.util.zip.ZipEntry r14 = (java.util.zip.ZipEntry) r14     // Catch:{ all -> 0x0049 }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0049 }
            java.lang.String r14 = r14.getName()     // Catch:{ all -> 0x0049 }
            r10.<init>(r14)     // Catch:{ all -> 0x0049 }
            java.lang.String r14 = r10.getName()     // Catch:{ all -> 0x0049 }
            java.lang.String r10 = "log_list.json"
            boolean r10 = kotlin.jvm.internal.C17542s.e(r14, r10)     // Catch:{ all -> 0x0049 }
            if (r10 == 0) goto L_0x00ee
            e7.h r14 = e7.C7801h.f50884a     // Catch:{ all -> 0x0049 }
            e7.f$f r10 = new e7.f$f     // Catch:{ all -> 0x0049 }
            r10.<init>(r5, r7)     // Catch:{ all -> 0x0049 }
            r0.f50865c = r9     // Catch:{ all -> 0x0049 }
            r0.f50866d = r8     // Catch:{ all -> 0x0049 }
            r0.f50867e = r13     // Catch:{ all -> 0x0049 }
            r0.f50868f = r6     // Catch:{ all -> 0x0049 }
            r0.f50869g = r5     // Catch:{ all -> 0x0049 }
            r0.f50870h = r2     // Catch:{ all -> 0x0049 }
            r0.f50871i = r8     // Catch:{ all -> 0x0049 }
            r0.f50874l = r4     // Catch:{ all -> 0x0049 }
            java.lang.Object r14 = r9.k(r14, r10, r0)     // Catch:{ all -> 0x0049 }
            if (r14 != r1) goto L_0x00e8
            return r1
        L_0x00e8:
            r7 = r13
            r13 = r8
        L_0x00ea:
            r13.f144348a = r14     // Catch:{ all -> 0x0049 }
        L_0x00ec:
            r13 = r7
            goto L_0x0118
        L_0x00ee:
            java.lang.String r10 = "log_list.sig"
            boolean r14 = kotlin.jvm.internal.C17542s.e(r14, r10)     // Catch:{ all -> 0x0049 }
            if (r14 == 0) goto L_0x0118
            e7.k r14 = e7.C7804k.f50887a     // Catch:{ all -> 0x0049 }
            e7.f$g r10 = new e7.f$g     // Catch:{ all -> 0x0049 }
            r10.<init>(r5, r7)     // Catch:{ all -> 0x0049 }
            r0.f50865c = r9     // Catch:{ all -> 0x0049 }
            r0.f50866d = r8     // Catch:{ all -> 0x0049 }
            r0.f50867e = r13     // Catch:{ all -> 0x0049 }
            r0.f50868f = r6     // Catch:{ all -> 0x0049 }
            r0.f50869g = r5     // Catch:{ all -> 0x0049 }
            r0.f50870h = r2     // Catch:{ all -> 0x0049 }
            r0.f50871i = r13     // Catch:{ all -> 0x0049 }
            r0.f50874l = r3     // Catch:{ all -> 0x0049 }
            java.lang.Object r14 = r9.k(r14, r10, r0)     // Catch:{ all -> 0x0049 }
            if (r14 != r1) goto L_0x0114
            return r1
        L_0x0114:
            r7 = r13
        L_0x0115:
            r13.f144348a = r14     // Catch:{ all -> 0x0049 }
            goto L_0x00ec
        L_0x0118:
            r5.closeEntry()     // Catch:{ all -> 0x0049 }
            goto L_0x00a8
        L_0x011c:
            XH.N r14 = XH.C16807N.f139792a     // Catch:{ all -> 0x0049 }
            jI.C17416c.a(r6, r7)
            T r14 = r8.f144348a
            if (r14 != 0) goto L_0x0128
            e7.g r13 = e7.C7800g.f50883a
            goto L_0x0169
        L_0x0128:
            T r0 = r13.f144348a
            if (r0 != 0) goto L_0x012f
            e7.j r13 = e7.C7803j.f50886a
            goto L_0x0169
        L_0x012f:
            boolean r1 = r14 instanceof e7.C7799f.b.a
            java.lang.String r2 = "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.loglist.LogListZipNetworkDataSource.Data.Invalid"
            if (r1 == 0) goto L_0x013f
            kotlin.jvm.internal.C17542s.h(r14, r2)
            e7.f$b$a r14 = (e7.C7799f.b.a) r14
            r7.j r13 = r14.a()
            goto L_0x0169
        L_0x013f:
            boolean r1 = r0 instanceof e7.C7799f.b.a
            if (r1 == 0) goto L_0x014d
            kotlin.jvm.internal.C17542s.h(r0, r2)
            e7.f$b$a r0 = (e7.C7799f.b.a) r0
            r7.j r13 = r0.a()
            goto L_0x0169
        L_0x014d:
            r7.j$b r0 = new r7.j$b
            java.lang.String r1 = "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.loglist.LogListZipNetworkDataSource.Data.Valid"
            kotlin.jvm.internal.C17542s.h(r14, r1)
            e7.f$b$b r14 = (e7.C7799f.b.C0836b) r14
            byte[] r14 = r14.a()
            T r13 = r13.f144348a
            kotlin.jvm.internal.C17542s.h(r13, r1)
            e7.f$b$b r13 = (e7.C7799f.b.C0836b) r13
            byte[] r13 = r13.a()
            r0.<init>(r14, r13)
            r13 = r0
        L_0x0169:
            return r13
        L_0x016a:
            throw r13     // Catch:{ all -> 0x016b }
        L_0x016b:
            r14 = move-exception
            jI.C17416c.a(r6, r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.C7799f.h(byte[], dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final ZipEntry i(ZipInputStream zipInputStream) {
        return zipInputStream.getNextEntry();
    }

    /* access modifiers changed from: private */
    public static final boolean j(ZipEntry zipEntry) {
        C17542s.j(zipEntry, "it");
        return !zipEntry.isDirectory();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(r7.C8708j r5, nI.C17642l<? super dI.C17164e<? super byte[]>, ? extends java.lang.Object> r6, dI.C17164e<? super e7.C7799f.b> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof e7.C7799f.h
            if (r0 == 0) goto L_0x0013
            r0 = r7
            e7.f$h r0 = (e7.C7799f.h) r0
            int r1 = r0.f50882f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f50882f = r1
            goto L_0x0018
        L_0x0013:
            e7.f$h r0 = new e7.f$h
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f50880d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f50882f
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.f50879c
            r7.j r5 = (r7.C8708j) r5
            XH.y.b(r7)     // Catch:{ Exception -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r6 = move-exception
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            XH.y.b(r7)
            r0.f50879c = r5     // Catch:{ Exception -> 0x002d }
            r0.f50882f = r3     // Catch:{ Exception -> 0x002d }
            java.lang.Object r7 = r6.invoke(r0)     // Catch:{ Exception -> 0x002d }
            if (r7 != r1) goto L_0x0045
            return r1
        L_0x0045:
            byte[] r7 = (byte[]) r7     // Catch:{ Exception -> 0x002d }
            e7.f$b$b r6 = new e7.f$b$b     // Catch:{ Exception -> 0x002d }
            r6.<init>(r7)     // Catch:{ Exception -> 0x002d }
            goto L_0x0064
        L_0x004d:
            boolean r7 = j7.C8411e.a(r6)
            if (r7 == 0) goto L_0x0059
            e7.f$b$a r6 = new e7.f$b$a
            r6.<init>(r5)
            goto L_0x0064
        L_0x0059:
            e7.f$b$a r5 = new e7.f$b$a
            e7.i r7 = new e7.i
            r7.<init>(r6)
            r5.<init>(r7)
            r6 = r5
        L_0x0064:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.C7799f.k(r7.j, nI.l, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super r7.C8708j> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof e7.C7799f.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            e7.f$c r0 = (e7.C7799f.c) r0
            int r1 = r0.f50862f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f50862f = r1
            goto L_0x0018
        L_0x0013:
            e7.f$c r0 = new e7.f$c
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f50860d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f50862f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r5) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            XH.y.b(r7)
            goto L_0x006a
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            java.lang.Object r2 = r0.f50859c
            e7.f r2 = (e7.C7799f) r2
            XH.y.b(r7)
            goto L_0x0053
        L_0x003d:
            XH.y.b(r7)
            e7.l r7 = e7.C7805l.f50888a
            e7.f$d r2 = new e7.f$d
            r2.<init>(r6, r3)
            r0.f50859c = r6
            r0.f50862f = r5
            java.lang.Object r7 = r6.k(r7, r2, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r6
        L_0x0053:
            e7.f$b r7 = (e7.C7799f.b) r7
            boolean r5 = r7 instanceof e7.C7799f.b.C0836b
            if (r5 == 0) goto L_0x006b
            e7.f$b$b r7 = (e7.C7799f.b.C0836b) r7
            byte[] r7 = r7.a()
            r0.f50859c = r3
            r0.f50862f = r4
            java.lang.Object r7 = r2.h(r7, r0)
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x006a:
            return r7
        L_0x006b:
            boolean r0 = r7 instanceof e7.C7799f.b.a
            if (r0 == 0) goto L_0x0076
            e7.f$b$a r7 = (e7.C7799f.b.a) r7
            r7.j r7 = r7.a()
            return r7
        L_0x0076:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.C7799f.a(dI.e):java.lang.Object");
    }
}
