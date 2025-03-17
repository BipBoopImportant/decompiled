package R2;

import QJ.C16310i;
import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import QJ.Q;
import R2.A;
import R2.p;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import bK.C17052a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u00136Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\u000b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tH@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH@¢\u0006\u0004\b\u001d\u0010\u001cJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H@¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tH@¢\u0006\u0004\b&\u0010\u001cJ\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H@¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00028\u0000H@¢\u0006\u0004\b(\u0010\u001cJ<\u0010+\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00062\u0006\u0010*\u001a\u00020)H@¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010-\u001a\u00020\u0016H@¢\u0006\u0004\b/\u0010!JI\u00103\u001a\u00028\u0001\"\u0004\b\u0001\u001002\u0006\u0010-\u001a\u00020\u00162\u001c\u00102\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n01H@\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000:8\u0016X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010R\u001a\f0OR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000T0S8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0002¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010[R \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0]8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R!\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000T8@X\u0002¢\u0006\f\u001a\u0004\ba\u0010b*\u0004\bc\u0010d¨\u0006g"}, d2 = {"LR2/j;", "T", "LR2/h;", "LR2/w;", "storage", "", "Lkotlin/Function2;", "LR2/m;", "LdI/e;", "LXH/N;", "", "initTasksList", "LR2/d;", "corruptionHandler", "LQJ/Q;", "scope", "<init>", "(LR2/w;Ljava/util/List;LR2/d;LQJ/Q;)V", "transform", "a", "(LnI/p;LdI/e;)Ljava/lang/Object;", "newData", "", "updateCache", "", "B", "(Ljava/lang/Object;ZLdI/e;)Ljava/lang/Object;", "u", "(LdI/e;)Ljava/lang/Object;", "p", "requireLock", "LR2/v;", "z", "(ZLdI/e;)Ljava/lang/Object;", "LR2/p$a;", "update", "t", "(LR2/p$a;LdI/e;)Ljava/lang/Object;", "v", "w", "x", "LdI/i;", "callerContext", "A", "(LnI/p;LdI/i;LdI/e;)Ljava/lang/Object;", "hasWriteFileLock", "LR2/e;", "y", "R", "Lkotlin/Function1;", "block", "q", "(ZLnI/l;LdI/e;)Ljava/lang/Object;", "LR2/w;", "b", "LR2/d;", "c", "LQJ/Q;", "LTJ/g;", "d", "LTJ/g;", "getData", "()LTJ/g;", "data", "LbK/a;", "e", "LbK/a;", "collectorMutex", "f", "I", "collectorCounter", "LQJ/F0;", "g", "LQJ/F0;", "collectorJob", "LR2/k;", "h", "LR2/k;", "inMemoryCache", "LR2/j$b;", "i", "LR2/j$b;", "readAndInit", "LXH/o;", "LR2/x;", "j", "LXH/o;", "storageConnectionDelegate", "LR2/n;", "k", "r", "()LR2/n;", "coordinator", "LR2/t;", "l", "LR2/t;", "writeActor", "s", "()LR2/x;", "getStorageConnection$datastore_core_release$delegate", "(LR2/j;)Ljava/lang/Object;", "storageConnection", "m", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j<T> implements h<T> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f12317m = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final w<T> f12318a;

    /* renamed from: b  reason: collision with root package name */
    private final d<T> f12319b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f12320c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<T> f12321d = C16534i.H(new d(this, (C17164e<? super d>) null));

    /* renamed from: e  reason: collision with root package name */
    private final C17052a f12322e = bK.g.b(false, 1, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    private int f12323f;

    /* renamed from: g  reason: collision with root package name */
    private F0 f12324g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final k<T> f12325h = new k<>();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final j<T>.defpackage.b f12326i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final C16824o<x<T>> f12327j;

    /* renamed from: k  reason: collision with root package name */
    private final C16824o f12328k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final t<p.a<T>> f12329l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LR2/j$a;", "", "<init>", "()V", "", "BUG_MESSAGE", "Ljava/lang/String;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\u000f\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LR2/j$b;", "LR2/s;", "", "Lkotlin/Function2;", "LR2/m;", "LdI/e;", "LXH/N;", "", "initTasksList", "<init>", "(LR2/j;Ljava/util/List;)V", "b", "(LdI/e;)Ljava/lang/Object;", "c", "Ljava/util/List;", "initTasks", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends s {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public List<? extends nI.p<? super m<T>, ? super C17164e<? super C16807N>, ? extends Object>> f12330c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j<T> f12331d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f12332c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f12333d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ j<T>.defpackage.b f12334e;

            /* renamed from: f  reason: collision with root package name */
            int f12335f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j<T>.defpackage.b bVar, C17164e<? super a> eVar) {
                super(eVar);
                this.f12334e = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f12333d = obj;
                this.f12335f |= Integer.MIN_VALUE;
                return this.f12334e.b(this);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LR2/e;", "<anonymous>", "()LR2/e;"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
        /* renamed from: R2.j$b$b  reason: collision with other inner class name */
        static final class C0192b extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super e<T>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f12336c;

            /* renamed from: d  reason: collision with root package name */
            Object f12337d;

            /* renamed from: e  reason: collision with root package name */
            Object f12338e;

            /* renamed from: f  reason: collision with root package name */
            Object f12339f;

            /* renamed from: g  reason: collision with root package name */
            Object f12340g;

            /* renamed from: h  reason: collision with root package name */
            int f12341h;

            /* renamed from: i  reason: collision with root package name */
            int f12342i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ j<T> f12343j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ j<T>.defpackage.b f12344k;

            @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"R2/j$b$b$a", "LR2/m;", "Lkotlin/Function2;", "LdI/e;", "", "transform", "a", "(LnI/p;LdI/e;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: R2.j$b$b$a */
            public static final class a implements m<T> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C17052a f12345a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ K f12346b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ O<T> f12347c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ j<T> f12348d;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
                /* renamed from: R2.j$b$b$a$a  reason: collision with other inner class name */
                static final class C0193a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    Object f12349c;

                    /* renamed from: d  reason: collision with root package name */
                    Object f12350d;

                    /* renamed from: e  reason: collision with root package name */
                    Object f12351e;

                    /* renamed from: f  reason: collision with root package name */
                    Object f12352f;

                    /* renamed from: g  reason: collision with root package name */
                    Object f12353g;

                    /* renamed from: h  reason: collision with root package name */
                    /* synthetic */ Object f12354h;

                    /* renamed from: i  reason: collision with root package name */
                    final /* synthetic */ a f12355i;

                    /* renamed from: j  reason: collision with root package name */
                    int f12356j;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0193a(a aVar, C17164e eVar) {
                        super(eVar);
                        this.f12355i = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f12354h = obj;
                        this.f12356j |= Integer.MIN_VALUE;
                        return this.f12355i.a((nI.p) null, this);
                    }
                }

                a(C17052a aVar, K k10, O<T> o10, j<T> jVar) {
                    this.f12345a = aVar;
                    this.f12346b = k10;
                    this.f12347c = o10;
                    this.f12348d = jVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[Catch:{ all -> 0x00d8 }] */
                /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba A[Catch:{ all -> 0x0056 }] */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1 A[Catch:{ all -> 0x003b }] */
                /* JADX WARNING: Removed duplicated region for block: B:49:0x00db  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object a(nI.p<? super T, ? super dI.C17164e<? super T>, ? extends java.lang.Object> r11, dI.C17164e<? super T> r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof R2.j.b.C0192b.a.C0193a
                        if (r0 == 0) goto L_0x0013
                        r0 = r12
                        R2.j$b$b$a$a r0 = (R2.j.b.C0192b.a.C0193a) r0
                        int r1 = r0.f12356j
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f12356j = r1
                        goto L_0x0018
                    L_0x0013:
                        R2.j$b$b$a$a r0 = new R2.j$b$b$a$a
                        r0.<init>(r10, r12)
                    L_0x0018:
                        java.lang.Object r12 = r0.f12354h
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f12356j
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        r6 = 0
                        if (r2 == 0) goto L_0x0076
                        if (r2 == r5) goto L_0x005a
                        if (r2 == r4) goto L_0x0046
                        if (r2 != r3) goto L_0x003e
                        java.lang.Object r11 = r0.f12351e
                        java.lang.Object r1 = r0.f12350d
                        kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                        java.lang.Object r0 = r0.f12349c
                        bK.a r0 = (bK.C17052a) r0
                        XH.y.b(r12)     // Catch:{ all -> 0x003b }
                        goto L_0x00cd
                    L_0x003b:
                        r11 = move-exception
                        goto L_0x00e3
                    L_0x003e:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L_0x0046:
                        java.lang.Object r11 = r0.f12351e
                        R2.j r11 = (R2.j) r11
                        java.lang.Object r2 = r0.f12350d
                        kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
                        java.lang.Object r4 = r0.f12349c
                        bK.a r4 = (bK.C17052a) r4
                        XH.y.b(r12)     // Catch:{ all -> 0x0056 }
                        goto L_0x00b2
                    L_0x0056:
                        r11 = move-exception
                        r0 = r4
                        goto L_0x00e3
                    L_0x005a:
                        java.lang.Object r11 = r0.f12353g
                        R2.j r11 = (R2.j) r11
                        java.lang.Object r2 = r0.f12352f
                        kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
                        java.lang.Object r5 = r0.f12351e
                        kotlin.jvm.internal.K r5 = (kotlin.jvm.internal.K) r5
                        java.lang.Object r7 = r0.f12350d
                        bK.a r7 = (bK.C17052a) r7
                        java.lang.Object r8 = r0.f12349c
                        nI.p r8 = (nI.p) r8
                        XH.y.b(r12)
                        r12 = r7
                        r9 = r8
                        r8 = r11
                        r11 = r9
                        goto L_0x0096
                    L_0x0076:
                        XH.y.b(r12)
                        bK.a r12 = r10.f12345a
                        kotlin.jvm.internal.K r2 = r10.f12346b
                        kotlin.jvm.internal.O<T> r7 = r10.f12347c
                        R2.j<T> r8 = r10.f12348d
                        r0.f12349c = r11
                        r0.f12350d = r12
                        r0.f12351e = r2
                        r0.f12352f = r7
                        r0.f12353g = r8
                        r0.f12356j = r5
                        java.lang.Object r5 = r12.e(r6, r0)
                        if (r5 != r1) goto L_0x0094
                        return r1
                    L_0x0094:
                        r5 = r2
                        r2 = r7
                    L_0x0096:
                        boolean r5 = r5.f144344a     // Catch:{ all -> 0x00d8 }
                        if (r5 != 0) goto L_0x00db
                        T r5 = r2.f144348a     // Catch:{ all -> 0x00d8 }
                        r0.f12349c = r12     // Catch:{ all -> 0x00d8 }
                        r0.f12350d = r2     // Catch:{ all -> 0x00d8 }
                        r0.f12351e = r8     // Catch:{ all -> 0x00d8 }
                        r0.f12352f = r6     // Catch:{ all -> 0x00d8 }
                        r0.f12353g = r6     // Catch:{ all -> 0x00d8 }
                        r0.f12356j = r4     // Catch:{ all -> 0x00d8 }
                        java.lang.Object r11 = r11.invoke(r5, r0)     // Catch:{ all -> 0x00d8 }
                        if (r11 != r1) goto L_0x00af
                        return r1
                    L_0x00af:
                        r4 = r12
                        r12 = r11
                        r11 = r8
                    L_0x00b2:
                        T r5 = r2.f144348a     // Catch:{ all -> 0x0056 }
                        boolean r5 = kotlin.jvm.internal.C17542s.e(r12, r5)     // Catch:{ all -> 0x0056 }
                        if (r5 != 0) goto L_0x00d1
                        r0.f12349c = r4     // Catch:{ all -> 0x0056 }
                        r0.f12350d = r2     // Catch:{ all -> 0x0056 }
                        r0.f12351e = r12     // Catch:{ all -> 0x0056 }
                        r0.f12356j = r3     // Catch:{ all -> 0x0056 }
                        r3 = 0
                        java.lang.Object r11 = r11.B(r12, r3, r0)     // Catch:{ all -> 0x0056 }
                        if (r11 != r1) goto L_0x00ca
                        return r1
                    L_0x00ca:
                        r11 = r12
                        r1 = r2
                        r0 = r4
                    L_0x00cd:
                        r1.f144348a = r11     // Catch:{ all -> 0x003b }
                        r2 = r1
                        goto L_0x00d2
                    L_0x00d1:
                        r0 = r4
                    L_0x00d2:
                        T r11 = r2.f144348a     // Catch:{ all -> 0x003b }
                        r0.d(r6)
                        return r11
                    L_0x00d8:
                        r11 = move-exception
                        r0 = r12
                        goto L_0x00e3
                    L_0x00db:
                        java.lang.String r11 = "InitializerApi.updateData should not be called after initialization is complete."
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d8 }
                        r0.<init>(r11)     // Catch:{ all -> 0x00d8 }
                        throw r0     // Catch:{ all -> 0x00d8 }
                    L_0x00e3:
                        r0.d(r6)
                        throw r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: R2.j.b.C0192b.a.a(nI.p, dI.e):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0192b(j<T> jVar, j<T>.defpackage.b bVar, C17164e<? super C0192b> eVar) {
                super(1, eVar);
                this.f12343j = jVar;
                this.f12344k = bVar;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new C0192b(this.f12343j, this.f12344k, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super e<T>> eVar) {
                return ((C0192b) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX INFO: finally extract failed */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x00b0  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00e6 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x00e7  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00f3  */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x010d A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x010e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r12.f12342i
                    r2 = 0
                    r3 = 4
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    r7 = 0
                    if (r1 == 0) goto L_0x0064
                    if (r1 == r6) goto L_0x0050
                    if (r1 == r5) goto L_0x0038
                    if (r1 == r4) goto L_0x0027
                    if (r1 != r3) goto L_0x001f
                    int r0 = r12.f12341h
                    java.lang.Object r1 = r12.f12336c
                    XH.y.b(r13)
                    goto L_0x010f
                L_0x001f:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L_0x0027:
                    java.lang.Object r1 = r12.f12338e
                    bK.a r1 = (bK.C17052a) r1
                    java.lang.Object r4 = r12.f12337d
                    kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
                    java.lang.Object r5 = r12.f12336c
                    kotlin.jvm.internal.K r5 = (kotlin.jvm.internal.K) r5
                    XH.y.b(r13)
                    goto L_0x00e8
                L_0x0038:
                    java.lang.Object r1 = r12.f12340g
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r8 = r12.f12339f
                    R2.j$b$b$a r8 = (R2.j.b.C0192b.a) r8
                    java.lang.Object r9 = r12.f12338e
                    kotlin.jvm.internal.O r9 = (kotlin.jvm.internal.O) r9
                    java.lang.Object r10 = r12.f12337d
                    kotlin.jvm.internal.K r10 = (kotlin.jvm.internal.K) r10
                    java.lang.Object r11 = r12.f12336c
                    bK.a r11 = (bK.C17052a) r11
                    XH.y.b(r13)
                    goto L_0x00aa
                L_0x0050:
                    java.lang.Object r1 = r12.f12339f
                    kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                    java.lang.Object r8 = r12.f12338e
                    kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
                    java.lang.Object r9 = r12.f12337d
                    kotlin.jvm.internal.K r9 = (kotlin.jvm.internal.K) r9
                    java.lang.Object r10 = r12.f12336c
                    bK.a r10 = (bK.C17052a) r10
                    XH.y.b(r13)
                    goto L_0x0089
                L_0x0064:
                    XH.y.b(r13)
                    bK.a r10 = bK.g.b(r2, r6, r7)
                    kotlin.jvm.internal.K r9 = new kotlin.jvm.internal.K
                    r9.<init>()
                    kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
                    r1.<init>()
                    R2.j<T> r13 = r12.f12343j
                    r12.f12336c = r10
                    r12.f12337d = r9
                    r12.f12338e = r1
                    r12.f12339f = r1
                    r12.f12342i = r6
                    java.lang.Object r13 = r13.y(r6, r12)
                    if (r13 != r0) goto L_0x0088
                    return r0
                L_0x0088:
                    r8 = r1
                L_0x0089:
                    R2.e r13 = (R2.e) r13
                    java.lang.Object r13 = r13.c()
                    r1.f144348a = r13
                    R2.j$b$b$a r13 = new R2.j$b$b$a
                    R2.j<T> r1 = r12.f12343j
                    r13.<init>(r10, r9, r8, r1)
                    R2.j<T>$b r1 = r12.f12344k
                    java.util.List r1 = r1.f12330c
                    if (r1 == 0) goto L_0x00cd
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.Iterator r1 = r1.iterator()
                    r11 = r10
                    r10 = r9
                    r9 = r8
                    r8 = r13
                L_0x00aa:
                    boolean r13 = r1.hasNext()
                    if (r13 == 0) goto L_0x00c9
                    java.lang.Object r13 = r1.next()
                    nI.p r13 = (nI.p) r13
                    r12.f12336c = r11
                    r12.f12337d = r10
                    r12.f12338e = r9
                    r12.f12339f = r8
                    r12.f12340g = r1
                    r12.f12342i = r5
                    java.lang.Object r13 = r13.invoke(r8, r12)
                    if (r13 != r0) goto L_0x00aa
                    return r0
                L_0x00c9:
                    r8 = r9
                    r5 = r10
                    r1 = r11
                    goto L_0x00cf
                L_0x00cd:
                    r5 = r9
                    r1 = r10
                L_0x00cf:
                    R2.j<T>$b r13 = r12.f12344k
                    r13.f12330c = r7
                    r12.f12336c = r5
                    r12.f12337d = r8
                    r12.f12338e = r1
                    r12.f12339f = r7
                    r12.f12340g = r7
                    r12.f12342i = r4
                    java.lang.Object r13 = r1.e(r7, r12)
                    if (r13 != r0) goto L_0x00e7
                    return r0
                L_0x00e7:
                    r4 = r8
                L_0x00e8:
                    r5.f144344a = r6     // Catch:{ all -> 0x011b }
                    XH.N r13 = XH.C16807N.f139792a     // Catch:{ all -> 0x011b }
                    r1.d(r7)
                    T r1 = r4.f144348a
                    if (r1 == 0) goto L_0x00f7
                    int r2 = r1.hashCode()
                L_0x00f7:
                    R2.j<T> r13 = r12.f12343j
                    R2.n r13 = r13.r()
                    r12.f12336c = r1
                    r12.f12337d = r7
                    r12.f12338e = r7
                    r12.f12341h = r2
                    r12.f12342i = r3
                    java.lang.Object r13 = r13.e(r12)
                    if (r13 != r0) goto L_0x010e
                    return r0
                L_0x010e:
                    r0 = r2
                L_0x010f:
                    java.lang.Number r13 = (java.lang.Number) r13
                    int r13 = r13.intValue()
                    R2.e r2 = new R2.e
                    r2.<init>(r1, r0, r13)
                    return r2
                L_0x011b:
                    r13 = move-exception
                    r1.d(r7)
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: R2.j.b.C0192b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(j jVar, List<? extends nI.p<? super m<T>, ? super C17164e<? super C16807N>, ? extends Object>> list) {
            C17542s.j(list, "initTasksList");
            this.f12331d = jVar;
            this.f12330c = C16877v.t1(list);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object b(dI.C17164e<? super XH.C16807N> r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof R2.j.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                R2.j$b$a r0 = (R2.j.b.a) r0
                int r1 = r0.f12335f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f12335f = r1
                goto L_0x0018
            L_0x0013:
                R2.j$b$a r0 = new R2.j$b$a
                r0.<init>(r6, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f12333d
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f12335f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r0 = r0.f12332c
                R2.j$b r0 = (R2.j.b) r0
                XH.y.b(r7)
                goto L_0x006b
            L_0x0030:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0038:
                java.lang.Object r0 = r0.f12332c
                R2.j$b r0 = (R2.j.b) r0
                XH.y.b(r7)
                goto L_0x007d
            L_0x0040:
                XH.y.b(r7)
                java.util.List<? extends nI.p<? super R2.m<T>, ? super dI.e<? super XH.N>, ? extends java.lang.Object>> r7 = r6.f12330c
                if (r7 == 0) goto L_0x006e
                kotlin.jvm.internal.C17542s.g(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x0051
                goto L_0x006e
            L_0x0051:
                R2.j<T> r7 = r6.f12331d
                R2.n r7 = r7.r()
                R2.j$b$b r2 = new R2.j$b$b
                R2.j<T> r4 = r6.f12331d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.f12332c = r6
                r0.f12335f = r3
                java.lang.Object r7 = r7.c(r2, r0)
                if (r7 != r1) goto L_0x006a
                return r1
            L_0x006a:
                r0 = r6
            L_0x006b:
                R2.e r7 = (R2.e) r7
                goto L_0x007f
            L_0x006e:
                R2.j<T> r7 = r6.f12331d
                r0.f12332c = r6
                r0.f12335f = r4
                r2 = 0
                java.lang.Object r7 = r7.y(r2, r0)
                if (r7 != r1) goto L_0x007c
                return r1
            L_0x007c:
                r0 = r6
            L_0x007d:
                R2.e r7 = (R2.e) r7
            L_0x007f:
                R2.j<T> r0 = r0.f12331d
                R2.k r0 = r0.f12325h
                r0.c(r7)
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: R2.j.b.b(dI.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LR2/n;", "b", "()LR2/n;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j<T> f12357c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j<T> jVar) {
            super(0);
            this.f12357c = jVar;
        }

        /* renamed from: b */
        public final n invoke() {
            return this.f12357c.s().e();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<C16533h<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f12358c;

        /* renamed from: d  reason: collision with root package name */
        int f12359d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f12360e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j<T> f12361f;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LTJ/h;", "LR2/v;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<C16533h<? super v<T>>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f12362c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ j<T> f12363d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j<T> jVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f12363d = jVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f12363d, eVar);
            }

            public final Object invoke(C16533h<? super v<T>> hVar, C17164e<? super C16807N> eVar) {
                return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f12362c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    j<T> jVar = this.f12363d;
                    this.f12362c = 1;
                    if (jVar.u(this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    XH.y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LR2/v;", "it", "", "<anonymous>", "(LR2/v;)Z"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<v<T>, C17164e<? super Boolean>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f12364c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f12365d;

            b(C17164e<? super b> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(eVar);
                bVar.f12365d = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(v<T> vVar, C17164e<? super Boolean> eVar) {
                return ((b) create(vVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f12364c == 0) {
                    XH.y.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(!(((v) this.f12365d) instanceof l));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LR2/v;", "it", "", "<anonymous>", "(LR2/v;)Z"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<v<T>, C17164e<? super Boolean>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f12366c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f12367d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ v<T> f12368e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(v<T> vVar, C17164e<? super c> eVar) {
                super(2, eVar);
                this.f12368e = vVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                c cVar = new c(this.f12368e, eVar);
                cVar.f12367d = obj;
                return cVar;
            }

            /* renamed from: i */
            public final Object invoke(v<T> vVar, C17164e<? super Boolean> eVar) {
                return ((c) create(vVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f12366c == 0) {
                    XH.y.b(obj);
                    v vVar = (v) this.f12367d;
                    return kotlin.coroutines.jvm.internal.b.a((vVar instanceof e) && vVar.a() <= this.f12368e.a());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: R2.j$d$d  reason: collision with other inner class name */
        static final class C0194d extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super T>, Throwable, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f12369c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ j<T> f12370d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0194d(j<T> jVar, C17164e<? super C0194d> eVar) {
                super(3, eVar);
                this.f12370d = jVar;
            }

            public final Object invoke(C16533h<? super T> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
                return new C0194d(this.f12370d, eVar).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f12369c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    j<T> jVar = this.f12370d;
                    this.f12369c = 1;
                    if (jVar.p(this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    XH.y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements C16532g<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f12371a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f12372a;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                /* renamed from: R2.j$d$e$a$a  reason: collision with other inner class name */
                public static final class C0195a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f12373c;

                    /* renamed from: d  reason: collision with root package name */
                    int f12374d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ a f12375e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0195a(a aVar, C17164e eVar) {
                        super(eVar);
                        this.f12375e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f12373c = obj;
                        this.f12374d |= Integer.MIN_VALUE;
                        return this.f12375e.emit((Object) null, this);
                    }
                }

                public a(C16533h hVar) {
                    this.f12372a = hVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof R2.j.d.e.a.C0195a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        R2.j$d$e$a$a r0 = (R2.j.d.e.a.C0195a) r0
                        int r1 = r0.f12374d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f12374d = r1
                        goto L_0x0018
                    L_0x0013:
                        R2.j$d$e$a$a r0 = new R2.j$d$e$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f12373c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f12374d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x004f
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f12372a
                        R2.v r5 = (R2.v) r5
                        boolean r2 = r5 instanceof R2.q
                        if (r2 != 0) goto L_0x0069
                        boolean r2 = r5 instanceof R2.e
                        if (r2 == 0) goto L_0x0052
                        R2.e r5 = (R2.e) r5
                        java.lang.Object r5 = r5.c()
                        r0.f12374d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x004f
                        return r1
                    L_0x004f:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    L_0x0052:
                        boolean r6 = r5 instanceof R2.l
                        if (r6 == 0) goto L_0x0057
                        goto L_0x0059
                    L_0x0057:
                        boolean r3 = r5 instanceof R2.z
                    L_0x0059:
                        if (r3 == 0) goto L_0x0063
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L_0x0063:
                        XH.t r5 = new XH.t
                        r5.<init>()
                        throw r5
                    L_0x0069:
                        R2.q r5 = (R2.q) r5
                        java.lang.Throwable r5 = r5.b()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: R2.j.d.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public e(C16532g gVar) {
                this.f12371a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f12371a.collect(new a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j<T> jVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f12361f = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f12361f, eVar);
            dVar.f12360e = obj;
            return dVar;
        }

        public final Object invoke(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f12359d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0032
                if (r1 == r4) goto L_0x002a
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                XH.y.b(r9)
                goto L_0x00bd
            L_0x0016:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001e:
                java.lang.Object r1 = r8.f12358c
                R2.v r1 = (R2.v) r1
                java.lang.Object r3 = r8.f12360e
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r9)
                goto L_0x0066
            L_0x002a:
                java.lang.Object r1 = r8.f12360e
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r9)
                goto L_0x004a
            L_0x0032:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f12360e
                TJ.h r9 = (TJ.C16533h) r9
                R2.j<T> r1 = r8.f12361f
                r8.f12360e = r9
                r8.f12359d = r4
                r4 = 0
                java.lang.Object r1 = r1.z(r4, r8)
                if (r1 != r0) goto L_0x0047
                return r0
            L_0x0047:
                r7 = r1
                r1 = r9
                r9 = r7
            L_0x004a:
                R2.v r9 = (R2.v) r9
                boolean r4 = r9 instanceof R2.e
                if (r4 == 0) goto L_0x0069
                r4 = r9
                R2.e r4 = (R2.e) r4
                java.lang.Object r4 = r4.c()
                r8.f12360e = r1
                r8.f12358c = r9
                r8.f12359d = r3
                java.lang.Object r3 = r1.emit(r4, r8)
                if (r3 != r0) goto L_0x0064
                return r0
            L_0x0064:
                r3 = r1
                r1 = r9
            L_0x0066:
                r9 = r1
                r1 = r3
                goto L_0x0078
            L_0x0069:
                boolean r3 = r9 instanceof R2.z
                if (r3 != 0) goto L_0x00c7
                boolean r3 = r9 instanceof R2.q
                if (r3 != 0) goto L_0x00c0
                boolean r3 = r9 instanceof R2.l
                if (r3 == 0) goto L_0x0078
                XH.N r9 = XH.C16807N.f139792a
                return r9
            L_0x0078:
                R2.j<T> r3 = r8.f12361f
                R2.k r3 = r3.f12325h
                TJ.g r3 = r3.b()
                R2.j$d$a r4 = new R2.j$d$a
                R2.j<T> r5 = r8.f12361f
                r6 = 0
                r4.<init>(r5, r6)
                TJ.g r3 = TJ.C16534i.S(r3, r4)
                R2.j$d$b r4 = new R2.j$d$b
                r4.<init>(r6)
                TJ.g r3 = TJ.C16534i.f0(r3, r4)
                R2.j$d$c r4 = new R2.j$d$c
                r4.<init>(r9, r6)
                TJ.g r9 = TJ.C16534i.v(r3, r4)
                R2.j$d$e r3 = new R2.j$d$e
                r3.<init>(r9)
                R2.j$d$d r9 = new R2.j$d$d
                R2.j<T> r4 = r8.f12361f
                r9.<init>(r4, r6)
                TJ.g r9 = TJ.C16534i.Q(r3, r9)
                r8.f12360e = r6
                r8.f12358c = r6
                r8.f12359d = r2
                java.lang.Object r9 = TJ.C16534i.x(r1, r9, r8)
                if (r9 != r0) goto L_0x00bd
                return r0
            L_0x00bd:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            L_0x00c0:
                R2.q r9 = (R2.q) r9
                java.lang.Throwable r9 = r9.b()
                throw r9
            L_0x00c7:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: R2.j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f12376c;

        /* renamed from: d  reason: collision with root package name */
        Object f12377d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f12378e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j<T> f12379f;

        /* renamed from: g  reason: collision with root package name */
        int f12380g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(j<T> jVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f12379f = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12378e = obj;
            this.f12380g |= Integer.MIN_VALUE;
            return this.f12379f.p(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {416}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super R>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f12381c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super R>, Object> f12382d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super f> eVar) {
            super(1, eVar);
            this.f12382d = lVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new f(this.f12382d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super R> eVar) {
            return ((f) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f12381c;
            if (i10 == 0) {
                XH.y.b(obj);
                C17642l<C17164e<? super R>, Object> lVar = this.f12382d;
                this.f12381c = 1;
                obj = lVar.invoke(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f12383c;

        /* renamed from: d  reason: collision with root package name */
        Object f12384d;

        /* renamed from: e  reason: collision with root package name */
        Object f12385e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f12386f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j<T> f12387g;

        /* renamed from: h  reason: collision with root package name */
        int f12388h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(j<T> jVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f12387g = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12386f = obj;
            this.f12388h |= Integer.MIN_VALUE;
            return this.f12387g.t((p.a) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f12389c;

        /* renamed from: d  reason: collision with root package name */
        Object f12390d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f12391e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j<T> f12392f;

        /* renamed from: g  reason: collision with root package name */
        int f12393g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(j<T> jVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f12392f = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12391e = obj;
            this.f12393g |= Integer.MIN_VALUE;
            return this.f12392f.u(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f12394c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j<T> f12395d;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXH/N;", "it", "c", "(LXH/N;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j<T> f12396a;

            a(j<T> jVar) {
                this.f12396a = jVar;
            }

            /* renamed from: c */
            public final Object emit(C16807N n10, C17164e<? super C16807N> eVar) {
                if (this.f12396a.f12325h.a() instanceof l) {
                    return C16807N.f139792a;
                }
                Object l10 = this.f12396a.w(true, eVar);
                return l10 == C17187b.f() ? l10 : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j<T> jVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f12395d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f12395d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f12394c;
            if (i10 == 0) {
                XH.y.b(obj);
                b e10 = this.f12395d.f12326i;
                this.f12394c = 1;
                if (e10.a(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else if (i10 == 2) {
                XH.y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16532g<C16807N> o10 = C16534i.o(this.f12395d.r().b());
            a aVar = new a(this.f12395d);
            this.f12394c = 2;
            if (o10.collect(aVar, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: R2.j$j  reason: collision with other inner class name */
    static final class C0196j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f12397c;

        /* renamed from: d  reason: collision with root package name */
        int f12398d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f12399e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j<T> f12400f;

        /* renamed from: g  reason: collision with root package name */
        int f12401g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0196j(j<T> jVar, C17164e<? super C0196j> eVar) {
            super(eVar);
            this.f12400f = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12399e = obj;
            this.f12401g |= Integer.MIN_VALUE;
            return this.f12400f.v(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f12402c;

        /* renamed from: d  reason: collision with root package name */
        Object f12403d;

        /* renamed from: e  reason: collision with root package name */
        boolean f12404e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f12405f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j<T> f12406g;

        /* renamed from: h  reason: collision with root package name */
        int f12407h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(j<T> jVar, C17164e<? super k> eVar) {
            super(eVar);
            this.f12406g = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12405f = obj;
            this.f12407h |= Integer.MIN_VALUE;
            return this.f12406g.w(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LXH/v;", "LR2/v;", "", "<anonymous>", "()LXH/v;"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super XH.v<? extends v<T>, ? extends Boolean>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f12408c;

        /* renamed from: d  reason: collision with root package name */
        int f12409d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j<T> f12410e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(j<T> jVar, C17164e<? super l> eVar) {
            super(1, eVar);
            this.f12410e = jVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new l(this.f12410e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super XH.v<? extends v<T>, Boolean>> eVar) {
            return ((l) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            v vVar;
            Throwable th2;
            Object f10 = C17187b.f();
            int i10 = this.f12409d;
            if (i10 == 0) {
                XH.y.b(obj);
                j<T> jVar = this.f12410e;
                this.f12409d = 1;
                obj = jVar.y(true, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    XH.y.b(obj);
                } catch (Throwable th3) {
                    n c10 = this.f12410e.r();
                    this.f12408c = th3;
                    this.f12409d = 2;
                    Object e10 = c10.e(this);
                    if (e10 == f10) {
                        return f10;
                    }
                    th2 = th3;
                    obj = e10;
                }
            } else if (i10 == 2) {
                th2 = (Throwable) this.f12408c;
                XH.y.b(obj);
                vVar = new q(th2, ((Number) obj).intValue());
                return C16796C.a(vVar, kotlin.coroutines.jvm.internal.b.a(true));
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (v) obj;
            return C16796C.a(vVar, kotlin.coroutines.jvm.internal.b.a(true));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "locked", "LXH/v;", "LR2/v;", "<anonymous>", "(Z)LXH/v;"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super XH.v<? extends v<T>, ? extends Boolean>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f12411c;

        /* renamed from: d  reason: collision with root package name */
        int f12412d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f12413e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j<T> f12414f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f12415g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(j<T> jVar, int i10, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f12414f = jVar;
            this.f12415g = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            m mVar = new m(this.f12414f, this.f12415g, eVar);
            mVar.f12413e = ((Boolean) obj).booleanValue();
            return mVar;
        }

        public final Object i(boolean z10, C17164e<? super XH.v<? extends v<T>, Boolean>> eVar) {
            return ((m) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            v vVar;
            boolean z10;
            int i10;
            Throwable th2;
            boolean z11;
            Object f10 = C17187b.f();
            int i11 = this.f12412d;
            if (i11 == 0) {
                XH.y.b(obj);
                z10 = this.f12413e;
                j<T> jVar = this.f12414f;
                this.f12413e = z10;
                this.f12412d = 1;
                obj = jVar.y(z10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i11 == 1) {
                z10 = this.f12413e;
                try {
                    XH.y.b(obj);
                } catch (Throwable th3) {
                    if (z10) {
                        n c10 = this.f12414f.r();
                        this.f12411c = th3;
                        this.f12413e = z10;
                        this.f12412d = 2;
                        Object e10 = c10.e(this);
                        if (e10 == f10) {
                            return f10;
                        }
                        z11 = z10;
                        th2 = th3;
                        obj = e10;
                    } else {
                        boolean z12 = z10;
                        th2 = th3;
                        i10 = this.f12415g;
                        z11 = z12;
                    }
                }
            } else if (i11 == 2) {
                z11 = this.f12413e;
                th2 = (Throwable) this.f12411c;
                XH.y.b(obj);
                i10 = ((Number) obj).intValue();
                q qVar = new q(th2, i10);
                z10 = z11;
                vVar = qVar;
                return C16796C.a(vVar, kotlin.coroutines.jvm.internal.b.a(z10));
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (v) obj;
            return C16796C.a(vVar, kotlin.coroutines.jvm.internal.b.a(z10));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f12416c;

        /* renamed from: d  reason: collision with root package name */
        Object f12417d;

        /* renamed from: e  reason: collision with root package name */
        Object f12418e;

        /* renamed from: f  reason: collision with root package name */
        Object f12419f;

        /* renamed from: g  reason: collision with root package name */
        boolean f12420g;

        /* renamed from: h  reason: collision with root package name */
        int f12421h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f12422i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ j<T> f12423j;

        /* renamed from: k  reason: collision with root package name */
        int f12424k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(j<T> jVar, C17164e<? super n> eVar) {
            super(eVar);
            this.f12423j = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12422i = obj;
            this.f12424k |= Integer.MIN_VALUE;
            return this.f12423j.y(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "LR2/e;", "<anonymous>", "(Z)LR2/e;"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super e<T>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f12425c;

        /* renamed from: d  reason: collision with root package name */
        int f12426d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f12427e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j<T> f12428f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f12429g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(j<T> jVar, int i10, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f12428f = jVar;
            this.f12429g = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            o oVar = new o(this.f12428f, this.f12429g, eVar);
            oVar.f12427e = ((Boolean) obj).booleanValue();
            return oVar;
        }

        public final Object i(boolean z10, C17164e<? super e<T>> eVar) {
            return ((o) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f12426d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                java.lang.Object r0 = r5.f12425c
                XH.y.b(r6)
                goto L_0x0049
            L_0x0014:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001c:
                boolean r1 = r5.f12427e
                XH.y.b(r6)
                goto L_0x0034
            L_0x0022:
                XH.y.b(r6)
                boolean r1 = r5.f12427e
                R2.j<T> r6 = r5.f12428f
                r5.f12427e = r1
                r5.f12426d = r3
                java.lang.Object r6 = r6.x(r5)
                if (r6 != r0) goto L_0x0034
                return r0
            L_0x0034:
                if (r1 == 0) goto L_0x0050
                R2.j<T> r1 = r5.f12428f
                R2.n r1 = r1.r()
                r5.f12425c = r6
                r5.f12426d = r2
                java.lang.Object r1 = r1.e(r5)
                if (r1 != r0) goto L_0x0047
                return r0
            L_0x0047:
                r0 = r6
                r6 = r1
            L_0x0049:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L_0x0055
            L_0x0050:
                int r0 = r5.f12429g
                r4 = r0
                r0 = r6
                r6 = r4
            L_0x0055:
                R2.e r1 = new R2.e
                if (r0 == 0) goto L_0x005e
                int r2 = r0.hashCode()
                goto L_0x005f
            L_0x005e:
                r2 = 0
            L_0x005f:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: R2.j.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f12430c;

        /* renamed from: d  reason: collision with root package name */
        int f12431d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ O<T> f12432e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j<T> f12433f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ M f12434g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(O<T> o10, j<T> jVar, M m10, C17164e<? super p> eVar) {
            super(1, eVar);
            this.f12432e = o10;
            this.f12433f = jVar;
            this.f12434g = m10;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new p(this.f12432e, this.f12433f, this.f12434g, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((p) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(T t10) {
            M m10;
            M m11;
            O<T> o10;
            T f10 = C17187b.f();
            int i10 = this.f12431d;
            if (i10 == 0) {
                XH.y.b(t10);
                o10 = this.f12432e;
                j<T> jVar = this.f12433f;
                this.f12430c = o10;
                this.f12431d = 1;
                t10 = jVar.x(this);
                if (t10 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                o10 = (O) this.f12430c;
                XH.y.b(t10);
            } else if (i10 == 2) {
                m11 = (M) this.f12430c;
                try {
                    XH.y.b(t10);
                    m11.f144346a = ((Number) t10).intValue();
                } catch (c unused) {
                    M m12 = this.f12434g;
                    j<T> jVar2 = this.f12433f;
                    T t11 = this.f12432e.f144348a;
                    this.f12430c = m12;
                    this.f12431d = 3;
                    T B10 = jVar2.B(t11, true, this);
                    if (B10 == f10) {
                        return f10;
                    }
                    m10 = m12;
                    t10 = B10;
                }
                return C16807N.f139792a;
            } else if (i10 == 3) {
                m10 = (M) this.f12430c;
                XH.y.b(t10);
                m10.f144346a = ((Number) t10).intValue();
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o10.f144348a = t10;
            m11 = this.f12434g;
            n c10 = this.f12433f.r();
            this.f12430c = m11;
            this.f12431d = 2;
            t10 = c10.e(this);
            if (t10 == f10) {
                return f10;
            }
            m11.f144346a = ((Number) t10).intValue();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LR2/v;", "<anonymous>", "(LQJ/Q;)LR2/v;"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super v<T>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f12435c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j<T> f12436d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f12437e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(j<T> jVar, boolean z10, C17164e<? super q> eVar) {
            super(2, eVar);
            this.f12436d = jVar;
            this.f12437e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new q(this.f12436d, this.f12437e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super v<T>> eVar) {
            return ((q) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f12435c;
            if (i10 == 0) {
                XH.y.b(obj);
                if (this.f12436d.f12325h.a() instanceof l) {
                    return this.f12436d.f12325h.a();
                }
                j<T> jVar = this.f12436d;
                this.f12435c = 1;
                if (jVar.v(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    XH.y.b(obj);
                } catch (Throwable th2) {
                    return new q(th2, -1);
                }
            } else if (i10 == 2) {
                XH.y.b(obj);
                return (v) obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j<T> jVar2 = this.f12436d;
            boolean z10 = this.f12437e;
            this.f12435c = 2;
            obj = jVar2.w(z10, this);
            if (obj == f10) {
                return f10;
            }
            return (v) obj;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LR2/x;", "b", "()LR2/x;"}, k = 3, mv = {1, 8, 0})
    static final class r extends C17544u implements C17631a<x<T>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j<T> f12438c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(j<T> jVar) {
            super(0);
            this.f12438c = jVar;
        }

        /* renamed from: b */
        public final x<T> invoke() {
            return this.f12438c.f12318a.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    static final class s extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super T>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f12439c;

        /* renamed from: d  reason: collision with root package name */
        int f12440d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j<T> f12441e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17168i f12442f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ nI.p<T, C17164e<? super T>, Object> f12443g;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"T", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super T>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f12444c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ nI.p<T, C17164e<? super T>, Object> f12445d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ e<T> f12446e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(nI.p<? super T, ? super C17164e<? super T>, ? extends Object> pVar, e<T> eVar, C17164e<? super a> eVar2) {
                super(2, eVar2);
                this.f12445d = pVar;
                this.f12446e = eVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f12445d, this.f12446e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super T> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f12444c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    nI.p<T, C17164e<? super T>, Object> pVar = this.f12445d;
                    T c10 = this.f12446e.c();
                    this.f12444c = 1;
                    obj = pVar.invoke(c10, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    XH.y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(j<T> jVar, C17168i iVar, nI.p<? super T, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super s> eVar) {
            super(1, eVar);
            this.f12441e = jVar;
            this.f12442f = iVar;
            this.f12443g = pVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new s(this.f12441e, this.f12442f, this.f12443g, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super T> eVar) {
            return ((s) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f12440d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 == r4) goto L_0x0027
                if (r1 == r3) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                java.lang.Object r0 = r8.f12439c
                XH.y.b(r9)
                goto L_0x006c
            L_0x0017:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001f:
                java.lang.Object r1 = r8.f12439c
                R2.e r1 = (R2.e) r1
                XH.y.b(r9)
                goto L_0x0051
            L_0x0027:
                XH.y.b(r9)
                goto L_0x0039
            L_0x002b:
                XH.y.b(r9)
                R2.j<T> r9 = r8.f12441e
                r8.f12440d = r4
                java.lang.Object r9 = r9.y(r4, r8)
                if (r9 != r0) goto L_0x0039
                return r0
            L_0x0039:
                r1 = r9
                R2.e r1 = (R2.e) r1
                dI.i r9 = r8.f12442f
                R2.j$s$a r5 = new R2.j$s$a
                nI.p<T, dI.e<? super T>, java.lang.Object> r6 = r8.f12443g
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f12439c = r1
                r8.f12440d = r3
                java.lang.Object r9 = QJ.C16310i.g(r9, r5, r8)
                if (r9 != r0) goto L_0x0051
                return r0
            L_0x0051:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r9)
                if (r1 != 0) goto L_0x006d
                R2.j<T> r1 = r8.f12441e
                r8.f12439c = r9
                r8.f12440d = r2
                java.lang.Object r1 = r1.B(r9, r4, r8)
                if (r1 != r0) goto L_0x006b
                return r0
            L_0x006b:
                r0 = r9
            L_0x006c:
                r9 = r0
            L_0x006d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: R2.j.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"T", "LQJ/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    static final class t extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super T>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f12447c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f12448d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j<T> f12449e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ nI.p<T, C17164e<? super T>, Object> f12450f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(j<T> jVar, nI.p<? super T, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super t> eVar) {
            super(2, eVar);
            this.f12449e = jVar;
            this.f12450f = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            t tVar = new t(this.f12449e, this.f12450f, eVar);
            tVar.f12448d = obj;
            return tVar;
        }

        public final Object invoke(Q q10, C17164e<? super T> eVar) {
            return ((t) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f12447c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16339x b10 = C16343z.b((F0) null, 1, (Object) null);
                this.f12449e.f12329l.e(new p.a(this.f12450f, b10, this.f12449e.f12325h.a(), ((Q) this.f12448d).getCoroutineContext()));
                this.f12447c = 1;
                obj = b10.f(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class u extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j<T> f12451c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(j<T> jVar) {
            super(1);
            this.f12451c = jVar;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                this.f12451c.f12325h.c(new l(th2));
            }
            if (this.f12451c.f12327j.isInitialized()) {
                this.f12451c.s().close();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "LR2/p$a;", "msg", "", "ex", "LXH/N;", "a", "(LR2/p$a;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class v extends C17544u implements nI.p<p.a<T>, Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final v f12452c = new v();

        v() {
            super(2);
        }

        public final void a(p.a<T> aVar, Throwable th2) {
            C17542s.j(aVar, "msg");
            C16339x<T> a10 = aVar.a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            a10.g(th2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p.a) obj, (Throwable) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LR2/p$a;", "msg", "LXH/N;", "<anonymous>", "(LR2/p$a;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
    static final class w extends kotlin.coroutines.jvm.internal.l implements nI.p<p.a<T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f12453c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f12454d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j<T> f12455e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(j<T> jVar, C17164e<? super w> eVar) {
            super(2, eVar);
            this.f12455e = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            w wVar = new w(this.f12455e, eVar);
            wVar.f12454d = obj;
            return wVar;
        }

        /* renamed from: i */
        public final Object invoke(p.a<T> aVar, C17164e<? super C16807N> eVar) {
            return ((w) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f12453c;
            if (i10 == 0) {
                XH.y.b(obj);
                j<T> jVar = this.f12455e;
                this.f12453c = 1;
                if (jVar.t((p.a) this.f12454d, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f12456c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f12457d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j<T> f12458e;

        /* renamed from: f  reason: collision with root package name */
        int f12459f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(j<T> jVar, C17164e<? super x> eVar) {
            super(eVar);
            this.f12458e = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12457d = obj;
            this.f12459f |= Integer.MIN_VALUE;
            return this.f12458e.B(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LR2/B;", "LXH/N;", "<anonymous>", "(LR2/B;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
    static final class y extends kotlin.coroutines.jvm.internal.l implements nI.p<B<T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f12460c;

        /* renamed from: d  reason: collision with root package name */
        int f12461d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f12462e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ M f12463f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j<T> f12464g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ T f12465h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f12466i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(M m10, j<T> jVar, T t10, boolean z10, C17164e<? super y> eVar) {
            super(2, eVar);
            this.f12463f = m10;
            this.f12464g = jVar;
            this.f12465h = t10;
            this.f12466i = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            y yVar = new y(this.f12463f, this.f12464g, this.f12465h, this.f12466i, eVar);
            yVar.f12462e = obj;
            return yVar;
        }

        /* renamed from: i */
        public final Object invoke(B<T> b10, C17164e<? super C16807N> eVar) {
            return ((y) create(b10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f12461d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r7)
                goto L_0x005d
            L_0x0012:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001a:
                java.lang.Object r1 = r6.f12460c
                kotlin.jvm.internal.M r1 = (kotlin.jvm.internal.M) r1
                java.lang.Object r3 = r6.f12462e
                R2.B r3 = (R2.B) r3
                XH.y.b(r7)
                goto L_0x0045
            L_0x0026:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f12462e
                R2.B r7 = (R2.B) r7
                kotlin.jvm.internal.M r1 = r6.f12463f
                R2.j<T> r4 = r6.f12464g
                R2.n r4 = r4.r()
                r6.f12462e = r7
                r6.f12460c = r1
                r6.f12461d = r3
                java.lang.Object r3 = r4.d(r6)
                if (r3 != r0) goto L_0x0042
                return r0
            L_0x0042:
                r5 = r3
                r3 = r7
                r7 = r5
            L_0x0045:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f144346a = r7
                T r7 = r6.f12465h
                r1 = 0
                r6.f12462e = r1
                r6.f12460c = r1
                r6.f12461d = r2
                java.lang.Object r7 = r3.a(r7, r6)
                if (r7 != r0) goto L_0x005d
                return r0
            L_0x005d:
                boolean r7 = r6.f12466i
                if (r7 == 0) goto L_0x007d
                R2.j<T> r7 = r6.f12464g
                R2.k r7 = r7.f12325h
                R2.e r0 = new R2.e
                T r1 = r6.f12465h
                if (r1 == 0) goto L_0x0072
                int r2 = r1.hashCode()
                goto L_0x0073
            L_0x0072:
                r2 = 0
            L_0x0073:
                kotlin.jvm.internal.M r3 = r6.f12463f
                int r3 = r3.f144346a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L_0x007d:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: R2.j.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(w<T> wVar, List<? extends nI.p<? super m<T>, ? super C17164e<? super C16807N>, ? extends Object>> list, d<T> dVar, Q q10) {
        C17542s.j(wVar, PlaceTypes.STORAGE);
        C17542s.j(list, "initTasksList");
        C17542s.j(dVar, "corruptionHandler");
        C17542s.j(q10, "scope");
        this.f12318a = wVar;
        this.f12319b = dVar;
        this.f12320c = q10;
        this.f12326i = new b(this, list);
        this.f12327j = C16825p.b(new r(this));
        this.f12328k = C16825p.b(new c(this));
        this.f12329l = new t<>(q10, new u(this), v.f12452c, new w(this, (C17164e<? super w>) null));
    }

    private final Object A(nI.p<? super T, ? super C17164e<? super T>, ? extends Object> pVar, C17168i iVar, C17164e<? super T> eVar) {
        return r().c(new s(this, iVar, pVar, (C17164e<? super s>) null), eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[Catch:{ all -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(dI.C17164e<? super XH.C16807N> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof R2.j.e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            R2.j$e r0 = (R2.j.e) r0
            int r1 = r0.f12380g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12380g = r1
            goto L_0x0018
        L_0x0013:
            R2.j$e r0 = new R2.j$e
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f12378e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12380g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.f12377d
            bK.a r1 = (bK.C17052a) r1
            java.lang.Object r0 = r0.f12376c
            R2.j r0 = (R2.j) r0
            XH.y.b(r6)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003a:
            XH.y.b(r6)
            bK.a r6 = r5.f12322e
            r0.f12376c = r5
            r0.f12377d = r6
            r0.f12380g = r3
            java.lang.Object r0 = r6.e(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
            r1 = r6
        L_0x004e:
            int r6 = r0.f12323f     // Catch:{ all -> 0x005e }
            int r6 = r6 + -1
            r0.f12323f = r6     // Catch:{ all -> 0x005e }
            if (r6 != 0) goto L_0x0062
            QJ.F0 r6 = r0.f12324g     // Catch:{ all -> 0x005e }
            if (r6 == 0) goto L_0x0060
            QJ.F0.a.a(r6, r4, r3, r4)     // Catch:{ all -> 0x005e }
            goto L_0x0060
        L_0x005e:
            r6 = move-exception
            goto L_0x006a
        L_0x0060:
            r0.f12324g = r4     // Catch:{ all -> 0x005e }
        L_0x0062:
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x005e }
            r1.d(r4)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x006a:
            r1.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.j.p(dI.e):java.lang.Object");
    }

    private final <R> Object q(boolean z10, C17642l<? super C17164e<? super R>, ? extends Object> lVar, C17164e<? super R> eVar) {
        return z10 ? lVar.invoke(eVar) : r().c(new f(lVar, (C17164e<? super f>) null), eVar);
    }

    /* access modifiers changed from: private */
    public final n r() {
        return (n) this.f12328k.getValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(R2.p.a<T> r9, dI.C17164e<? super XH.C16807N> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof R2.j.g
            if (r0 == 0) goto L_0x0013
            r0 = r10
            R2.j$g r0 = (R2.j.g) r0
            int r1 = r0.f12388h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12388h = r1
            goto L_0x0018
        L_0x0013:
            R2.j$g r0 = new R2.j$g
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f12386f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12388h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x0051
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r9 = r0.f12383c
            QJ.x r9 = (QJ.C16339x) r9
        L_0x002f:
            XH.y.b(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x00bc
        L_0x0034:
            r10 = move-exception
            goto L_0x00de
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            java.lang.Object r9 = r0.f12385e
            QJ.x r9 = (QJ.C16339x) r9
            java.lang.Object r2 = r0.f12384d
            R2.j r2 = (R2.j) r2
            java.lang.Object r4 = r0.f12383c
            R2.p$a r4 = (R2.p.a) r4
            XH.y.b(r10)     // Catch:{ all -> 0x0034 }
            r10 = r9
            r9 = r4
            goto L_0x00a4
        L_0x0051:
            java.lang.Object r9 = r0.f12383c
            QJ.x r9 = (QJ.C16339x) r9
            goto L_0x002f
        L_0x0056:
            XH.y.b(r10)
            QJ.x r10 = r9.a()
            XH.x$a r2 = XH.x.f139812b     // Catch:{ all -> 0x0080 }
            R2.k<T> r2 = r8.f12325h     // Catch:{ all -> 0x0080 }
            R2.v r2 = r2.a()     // Catch:{ all -> 0x0080 }
            boolean r6 = r2 instanceof R2.e     // Catch:{ all -> 0x0080 }
            if (r6 == 0) goto L_0x0085
            nI.p r2 = r9.d()     // Catch:{ all -> 0x0080 }
            dI.i r9 = r9.b()     // Catch:{ all -> 0x0080 }
            r0.f12383c = r10     // Catch:{ all -> 0x0080 }
            r0.f12388h = r5     // Catch:{ all -> 0x0080 }
            java.lang.Object r9 = r8.A(r2, r9, r0)     // Catch:{ all -> 0x0080 }
            if (r9 != r1) goto L_0x007c
            return r1
        L_0x007c:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00bc
        L_0x0080:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00de
        L_0x0085:
            boolean r6 = r2 instanceof R2.q     // Catch:{ all -> 0x0080 }
            if (r6 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            boolean r5 = r2 instanceof R2.z     // Catch:{ all -> 0x0080 }
        L_0x008c:
            if (r5 == 0) goto L_0x00cd
            R2.v r5 = r9.c()     // Catch:{ all -> 0x0080 }
            if (r2 != r5) goto L_0x00c1
            r0.f12383c = r9     // Catch:{ all -> 0x0080 }
            r0.f12384d = r8     // Catch:{ all -> 0x0080 }
            r0.f12385e = r10     // Catch:{ all -> 0x0080 }
            r0.f12388h = r4     // Catch:{ all -> 0x0080 }
            java.lang.Object r2 = r8.v(r0)     // Catch:{ all -> 0x0080 }
            if (r2 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            r2 = r8
        L_0x00a4:
            nI.p r4 = r9.d()     // Catch:{ all -> 0x0080 }
            dI.i r9 = r9.b()     // Catch:{ all -> 0x0080 }
            r0.f12383c = r10     // Catch:{ all -> 0x0080 }
            r5 = 0
            r0.f12384d = r5     // Catch:{ all -> 0x0080 }
            r0.f12385e = r5     // Catch:{ all -> 0x0080 }
            r0.f12388h = r3     // Catch:{ all -> 0x0080 }
            java.lang.Object r9 = r2.A(r4, r9, r0)     // Catch:{ all -> 0x0080 }
            if (r9 != r1) goto L_0x007c
            return r1
        L_0x00bc:
            java.lang.Object r10 = XH.x.b(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x00e8
        L_0x00c1:
            java.lang.String r9 = "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>"
            kotlin.jvm.internal.C17542s.h(r2, r9)     // Catch:{ all -> 0x0080 }
            R2.q r2 = (R2.q) r2     // Catch:{ all -> 0x0080 }
            java.lang.Throwable r9 = r2.b()     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0080 }
        L_0x00cd:
            boolean r9 = r2 instanceof R2.l     // Catch:{ all -> 0x0080 }
            if (r9 == 0) goto L_0x00d8
            R2.l r2 = (R2.l) r2     // Catch:{ all -> 0x0080 }
            java.lang.Throwable r9 = r2.b()     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0080 }
        L_0x00d8:
            XH.t r9 = new XH.t     // Catch:{ all -> 0x0080 }
            r9.<init>()     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0080 }
        L_0x00de:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r10 = XH.y.a(r10)
            java.lang.Object r10 = XH.x.b(r10)
        L_0x00e8:
            QJ.C16343z.c(r9, r10)
            XH.N r9 = XH.C16807N.f139792a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.j.t(R2.p$a, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[Catch:{ all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(dI.C17164e<? super XH.C16807N> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof R2.j.h
            if (r0 == 0) goto L_0x0013
            r0 = r12
            R2.j$h r0 = (R2.j.h) r0
            int r1 = r0.f12393g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12393g = r1
            goto L_0x0018
        L_0x0013:
            R2.j$h r0 = new R2.j$h
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f12391e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12393g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.f12390d
            bK.a r1 = (bK.C17052a) r1
            java.lang.Object r0 = r0.f12389c
            R2.j r0 = (R2.j) r0
            XH.y.b(r12)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003a:
            XH.y.b(r12)
            bK.a r12 = r11.f12322e
            r0.f12389c = r11
            r0.f12390d = r12
            r0.f12393g = r3
            java.lang.Object r0 = r12.e(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r11
            r1 = r12
        L_0x004e:
            int r12 = r0.f12323f     // Catch:{ all -> 0x0067 }
            int r12 = r12 + r3
            r0.f12323f = r12     // Catch:{ all -> 0x0067 }
            if (r12 != r3) goto L_0x0069
            QJ.Q r5 = r0.f12320c     // Catch:{ all -> 0x0067 }
            R2.j$i r8 = new R2.j$i     // Catch:{ all -> 0x0067 }
            r8.<init>(r0, r4)     // Catch:{ all -> 0x0067 }
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            QJ.F0 r12 = QJ.C16314k.d(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0067 }
            r0.f12324g = r12     // Catch:{ all -> 0x0067 }
            goto L_0x0069
        L_0x0067:
            r12 = move-exception
            goto L_0x0071
        L_0x0069:
            XH.N r12 = XH.C16807N.f139792a     // Catch:{ all -> 0x0067 }
            r1.d(r4)
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x0071:
            r1.d(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.j.u(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(dI.C17164e<? super XH.C16807N> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof R2.j.C0196j
            if (r0 == 0) goto L_0x0013
            r0 = r6
            R2.j$j r0 = (R2.j.C0196j) r0
            int r1 = r0.f12401g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12401g = r1
            goto L_0x0018
        L_0x0013:
            R2.j$j r0 = new R2.j$j
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f12399e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12401g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            int r1 = r0.f12398d
            java.lang.Object r0 = r0.f12397c
            R2.j r0 = (R2.j) r0
            XH.y.b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x006c
        L_0x0032:
            r6 = move-exception
            goto L_0x0073
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003c:
            java.lang.Object r2 = r0.f12397c
            R2.j r2 = (R2.j) r2
            XH.y.b(r6)
            goto L_0x0057
        L_0x0044:
            XH.y.b(r6)
            R2.n r6 = r5.r()
            r0.f12397c = r5
            r0.f12401g = r4
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r5
        L_0x0057:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            R2.j<T>$b r4 = r2.f12326i     // Catch:{ all -> 0x006f }
            r0.f12397c = r2     // Catch:{ all -> 0x006f }
            r0.f12398d = r6     // Catch:{ all -> 0x006f }
            r0.f12401g = r3     // Catch:{ all -> 0x006f }
            java.lang.Object r6 = r4.c(r0)     // Catch:{ all -> 0x006f }
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x006f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L_0x0073:
            R2.k<T> r0 = r0.f12325h
            R2.q r2 = new R2.q
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.j.v(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(boolean r10, dI.C17164e<? super R2.v<T>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof R2.j.k
            if (r0 == 0) goto L_0x0013
            r0 = r11
            R2.j$k r0 = (R2.j.k) r0
            int r1 = r0.f12407h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12407h = r1
            goto L_0x0018
        L_0x0013:
            R2.j$k r0 = new R2.j$k
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f12405f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12407h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r10 = r0.f12402c
            R2.j r10 = (R2.j) r10
            XH.y.b(r11)
            goto L_0x00c3
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003c:
            java.lang.Object r10 = r0.f12402c
            R2.j r10 = (R2.j) r10
            XH.y.b(r11)
            goto L_0x00aa
        L_0x0045:
            boolean r10 = r0.f12404e
            java.lang.Object r2 = r0.f12403d
            R2.v r2 = (R2.v) r2
            java.lang.Object r5 = r0.f12402c
            R2.j r5 = (R2.j) r5
            XH.y.b(r11)
            r8 = r11
            r11 = r10
            r10 = r5
            r5 = r2
            r2 = r8
            goto L_0x007c
        L_0x0058:
            XH.y.b(r11)
            R2.k<T> r11 = r9.f12325h
            R2.v r2 = r11.a()
            boolean r11 = r2 instanceof R2.z
            if (r11 != 0) goto L_0x00dd
            R2.n r11 = r9.r()
            r0.f12402c = r9
            r0.f12403d = r2
            r0.f12404e = r10
            r0.f12407h = r5
            java.lang.Object r11 = r11.e(r0)
            if (r11 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r5 = r2
            r2 = r11
            r11 = r10
            r10 = r9
        L_0x007c:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            boolean r6 = r5 instanceof R2.e
            if (r6 == 0) goto L_0x008b
            int r7 = r5.a()
            goto L_0x008c
        L_0x008b:
            r7 = -1
        L_0x008c:
            if (r6 == 0) goto L_0x0091
            if (r2 != r7) goto L_0x0091
            return r5
        L_0x0091:
            r2 = 0
            if (r11 == 0) goto L_0x00ad
            R2.n r11 = r10.r()
            R2.j$l r3 = new R2.j$l
            r3.<init>(r10, r2)
            r0.f12402c = r10
            r0.f12403d = r2
            r0.f12407h = r4
            java.lang.Object r11 = r11.c(r3, r0)
            if (r11 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            XH.v r11 = (XH.v) r11
            goto L_0x00c5
        L_0x00ad:
            R2.n r11 = r10.r()
            R2.j$m r4 = new R2.j$m
            r4.<init>(r10, r7, r2)
            r0.f12402c = r10
            r0.f12403d = r2
            r0.f12407h = r3
            java.lang.Object r11 = r11.a(r4, r0)
            if (r11 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            XH.v r11 = (XH.v) r11
        L_0x00c5:
            java.lang.Object r0 = r11.a()
            R2.v r0 = (R2.v) r0
            java.lang.Object r11 = r11.b()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00dc
            R2.k<T> r10 = r10.f12325h
            r10.c(r0)
        L_0x00dc:
            return r0
        L_0x00dd:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.j.w(boolean, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object x(C17164e<? super T> eVar) {
        return y.a(s(), eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        if (r12 == null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r2 = r12.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        r12 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        r3 = r6.r();
        r0.f12416c = r6;
        r0.f12417d = r12;
        r0.f12420g = r11;
        r0.f12421h = r2;
        r0.f12424k = 2;
        r3 = r3.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
        if (r3 != r1) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c7, code lost:
        r8 = r2;
        r2 = r11;
        r11 = r8;
        r9 = r3;
        r3 = r12;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r12 = ((java.lang.Number) r12).intValue();
        r3 = r2.r();
        r6 = new R2.j.o(r2, r12, (dI.C17164e<? super R2.j.o>) null);
        r0.f12416c = r2;
        r0.f12420g = r11;
        r0.f12424k = 4;
        r12 = r3.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0109, code lost:
        if (r12 != r1) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012b, code lost:
        r6 = r12;
        r12 = r3;
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012e, code lost:
        r3.f144348a = r12;
        r12 = new kotlin.jvm.internal.M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r3 = new R2.j.p(r2, r7, r12, (dI.C17164e<? super R2.j.p>) null);
        r0.f12416c = r6;
        r0.f12417d = r2;
        r0.f12418e = r12;
        r0.f12419f = null;
        r0.f12424k = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0149, code lost:
        if (r7.q(r11, r3, r0) == r1) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014c, code lost:
        r11 = r12;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014e, code lost:
        r0 = r1.f144348a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0152, code lost:
        if (r0 != null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0154, code lost:
        r5 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015d, code lost:
        return new R2.e(r0, r5, r11.f144346a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015e, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015f, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0160, code lost:
        XH.C16816g.a(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0163, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return (R2.e) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return new R2.e(r3, r11, ((java.lang.Number) r12).intValue());
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(boolean r11, dI.C17164e<? super R2.e<T>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof R2.j.n
            if (r0 == 0) goto L_0x0013
            r0 = r12
            R2.j$n r0 = (R2.j.n) r0
            int r1 = r0.f12424k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12424k = r1
            goto L_0x0018
        L_0x0013:
            R2.j$n r0 = new R2.j$n
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f12422i
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12424k
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r2) {
                case 0: goto L_0x0094;
                case 1: goto L_0x0089;
                case 2: goto L_0x0076;
                case 3: goto L_0x006b;
                case 4: goto L_0x005c;
                case 5: goto L_0x0042;
                case 6: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002e:
            java.lang.Object r11 = r0.f12418e
            kotlin.jvm.internal.M r11 = (kotlin.jvm.internal.M) r11
            java.lang.Object r1 = r0.f12417d
            kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
            java.lang.Object r0 = r0.f12416c
            R2.c r0 = (R2.c) r0
            XH.y.b(r12)     // Catch:{ all -> 0x003f }
            goto L_0x014e
        L_0x003f:
            r11 = move-exception
            goto L_0x0160
        L_0x0042:
            boolean r11 = r0.f12420g
            java.lang.Object r2 = r0.f12419f
            kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
            java.lang.Object r3 = r0.f12418e
            kotlin.jvm.internal.O r3 = (kotlin.jvm.internal.O) r3
            java.lang.Object r6 = r0.f12417d
            R2.c r6 = (R2.c) r6
            java.lang.Object r7 = r0.f12416c
            R2.j r7 = (R2.j) r7
            XH.y.b(r12)
            r8 = r3
            r3 = r2
            r2 = r8
            goto L_0x012e
        L_0x005c:
            boolean r11 = r0.f12420g
            java.lang.Object r2 = r0.f12416c
            R2.j r2 = (R2.j) r2
            XH.y.b(r12)     // Catch:{ c -> 0x0067 }
            goto L_0x010c
        L_0x0067:
            r12 = move-exception
            r7 = r2
            goto L_0x0110
        L_0x006b:
            boolean r11 = r0.f12420g
            java.lang.Object r2 = r0.f12416c
            R2.j r2 = (R2.j) r2
            XH.y.b(r12)     // Catch:{ c -> 0x0067 }
            goto L_0x00ef
        L_0x0076:
            int r11 = r0.f12421h
            boolean r2 = r0.f12420g
            java.lang.Object r3 = r0.f12417d
            java.lang.Object r6 = r0.f12416c
            R2.j r6 = (R2.j) r6
            XH.y.b(r12)     // Catch:{ c -> 0x0084 }
            goto L_0x00cd
        L_0x0084:
            r12 = move-exception
            r11 = r2
        L_0x0086:
            r7 = r6
            goto L_0x0110
        L_0x0089:
            boolean r11 = r0.f12420g
            java.lang.Object r2 = r0.f12416c
            R2.j r2 = (R2.j) r2
            XH.y.b(r12)     // Catch:{ c -> 0x0067 }
            r6 = r2
            goto L_0x00a7
        L_0x0094:
            XH.y.b(r12)
            if (r11 == 0) goto L_0x00dc
            r0.f12416c = r10     // Catch:{ c -> 0x00d9 }
            r0.f12420g = r11     // Catch:{ c -> 0x00d9 }
            r0.f12424k = r3     // Catch:{ c -> 0x00d9 }
            java.lang.Object r12 = r10.x(r0)     // Catch:{ c -> 0x00d9 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            r6 = r10
        L_0x00a7:
            if (r12 == 0) goto L_0x00b0
            int r2 = r12.hashCode()     // Catch:{ c -> 0x00ae }
            goto L_0x00b1
        L_0x00ae:
            r12 = move-exception
            goto L_0x0086
        L_0x00b0:
            r2 = r5
        L_0x00b1:
            R2.n r3 = r6.r()     // Catch:{ c -> 0x00ae }
            r0.f12416c = r6     // Catch:{ c -> 0x00ae }
            r0.f12417d = r12     // Catch:{ c -> 0x00ae }
            r0.f12420g = r11     // Catch:{ c -> 0x00ae }
            r0.f12421h = r2     // Catch:{ c -> 0x00ae }
            r7 = 2
            r0.f12424k = r7     // Catch:{ c -> 0x00ae }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ c -> 0x00ae }
            if (r3 != r1) goto L_0x00c7
            return r1
        L_0x00c7:
            r8 = r2
            r2 = r11
            r11 = r8
            r9 = r3
            r3 = r12
            r12 = r9
        L_0x00cd:
            java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ c -> 0x0084 }
            int r12 = r12.intValue()     // Catch:{ c -> 0x0084 }
            R2.e r7 = new R2.e     // Catch:{ c -> 0x0084 }
            r7.<init>(r3, r11, r12)     // Catch:{ c -> 0x0084 }
            goto L_0x010f
        L_0x00d9:
            r12 = move-exception
            r7 = r10
            goto L_0x0110
        L_0x00dc:
            R2.n r12 = r10.r()     // Catch:{ c -> 0x00d9 }
            r0.f12416c = r10     // Catch:{ c -> 0x00d9 }
            r0.f12420g = r11     // Catch:{ c -> 0x00d9 }
            r2 = 3
            r0.f12424k = r2     // Catch:{ c -> 0x00d9 }
            java.lang.Object r12 = r12.e(r0)     // Catch:{ c -> 0x00d9 }
            if (r12 != r1) goto L_0x00ee
            return r1
        L_0x00ee:
            r2 = r10
        L_0x00ef:
            java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ c -> 0x0067 }
            int r12 = r12.intValue()     // Catch:{ c -> 0x0067 }
            R2.n r3 = r2.r()     // Catch:{ c -> 0x0067 }
            R2.j$o r6 = new R2.j$o     // Catch:{ c -> 0x0067 }
            r6.<init>(r2, r12, r4)     // Catch:{ c -> 0x0067 }
            r0.f12416c = r2     // Catch:{ c -> 0x0067 }
            r0.f12420g = r11     // Catch:{ c -> 0x0067 }
            r12 = 4
            r0.f12424k = r12     // Catch:{ c -> 0x0067 }
            java.lang.Object r12 = r3.a(r6, r0)     // Catch:{ c -> 0x0067 }
            if (r12 != r1) goto L_0x010c
            return r1
        L_0x010c:
            r7 = r12
            R2.e r7 = (R2.e) r7     // Catch:{ c -> 0x0067 }
        L_0x010f:
            return r7
        L_0x0110:
            kotlin.jvm.internal.O r2 = new kotlin.jvm.internal.O
            r2.<init>()
            R2.d<T> r3 = r7.f12319b
            r0.f12416c = r7
            r0.f12417d = r12
            r0.f12418e = r2
            r0.f12419f = r2
            r0.f12420g = r11
            r6 = 5
            r0.f12424k = r6
            java.lang.Object r3 = r3.a(r12, r0)
            if (r3 != r1) goto L_0x012b
            return r1
        L_0x012b:
            r6 = r12
            r12 = r3
            r3 = r2
        L_0x012e:
            r3.f144348a = r12
            kotlin.jvm.internal.M r12 = new kotlin.jvm.internal.M
            r12.<init>()
            R2.j$p r3 = new R2.j$p     // Catch:{ all -> 0x015e }
            r3.<init>(r2, r7, r12, r4)     // Catch:{ all -> 0x015e }
            r0.f12416c = r6     // Catch:{ all -> 0x015e }
            r0.f12417d = r2     // Catch:{ all -> 0x015e }
            r0.f12418e = r12     // Catch:{ all -> 0x015e }
            r0.f12419f = r4     // Catch:{ all -> 0x015e }
            r4 = 6
            r0.f12424k = r4     // Catch:{ all -> 0x015e }
            java.lang.Object r11 = r7.q(r11, r3, r0)     // Catch:{ all -> 0x015e }
            if (r11 != r1) goto L_0x014c
            return r1
        L_0x014c:
            r11 = r12
            r1 = r2
        L_0x014e:
            R2.e r12 = new R2.e
            T r0 = r1.f144348a
            if (r0 == 0) goto L_0x0158
            int r5 = r0.hashCode()
        L_0x0158:
            int r11 = r11.f144346a
            r12.<init>(r0, r5, r11)
            return r12
        L_0x015e:
            r11 = move-exception
            r0 = r6
        L_0x0160:
            XH.C16816g.a(r0, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.j.y(boolean, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object z(boolean z10, C17164e<? super v<T>> eVar) {
        return C16310i.g(this.f12320c.getCoroutineContext(), new q(this, z10, (C17164e<? super q>) null), eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B(T r12, boolean r13, dI.C17164e<? super java.lang.Integer> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof R2.j.x
            if (r0 == 0) goto L_0x0013
            r0 = r14
            R2.j$x r0 = (R2.j.x) r0
            int r1 = r0.f12459f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12459f = r1
            goto L_0x0018
        L_0x0013:
            R2.j$x r0 = new R2.j$x
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f12457d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12459f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r12 = r0.f12456c
            kotlin.jvm.internal.M r12 = (kotlin.jvm.internal.M) r12
            XH.y.b(r14)
            goto L_0x0058
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            XH.y.b(r14)
            kotlin.jvm.internal.M r14 = new kotlin.jvm.internal.M
            r14.<init>()
            R2.x r2 = r11.s()
            R2.j$y r10 = new R2.j$y
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f12456c = r14
            r0.f12459f = r3
            java.lang.Object r12 = r2.d(r10, r0)
            if (r12 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r12 = r14
        L_0x0058:
            int r12 = r12.f144346a
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.b.e(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.j.B(java.lang.Object, boolean, dI.e):java.lang.Object");
    }

    public Object a(nI.p<? super T, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super T> eVar) {
        A a10 = (A) eVar.getContext().get(A.a.C0189a.f12294a);
        if (a10 != null) {
            a10.a(this);
        }
        return C16310i.g(new A(a10, this), new t(this, pVar, (C17164e<? super t>) null), eVar);
    }

    public C16532g<T> getData() {
        return this.f12321d;
    }

    public final x<T> s() {
        return this.f12327j.getValue();
    }
}
