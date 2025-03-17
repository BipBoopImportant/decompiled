package z5;

import Q4.h;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import android.content.Context;
import android.util.LruCache;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import w5.c;
import y5.C8978a;
import y5.C8979b;
import y5.C8980c;
import y5.C8981d;
import y5.C8982e;
import y5.C8983f;

@Metadata(d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001L\u0018\u00002\u00020\u0001:\u0001>B5\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBe\b\u0017\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u001aJc\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000 H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J+\u0010*\u001a\u00020\u000e2\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120&\"\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J+\u0010,\u001a\u00020\u000e2\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120&\"\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J#\u0010-\u001a\u00020\u000e2\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120&\"\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101JE\u00105\u001a\b\u0012\u0004\u0012\u00020\b042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00062\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010 H\u0016¢\u0006\u0004\b5\u00106Jk\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u001072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u00102\u001a\u00020\u00122\u0018\u00109\u001a\u0014\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000040 2\u0006\u00103\u001a\u00020\u00062\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010 H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010=R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020/0D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010\u0005\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020L8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010MR<\u0010S\u001a*\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0P0Oj\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0P`Q8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010R\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006T"}, d2 = {"Lz5/d;", "Ly5/d;", "LQ4/h;", "openHelper", "LQ4/g;", "database", "", "cacheSize", "", "windowSizeBytes", "<init>", "(LQ4/h;LQ4/g;ILjava/lang/Long;)V", "Ly5/f;", "Ly5/b$b;", "LXH/N;", "schema", "Landroid/content/Context;", "context", "", "name", "LQ4/h$c;", "factory", "LQ4/h$a;", "callback", "", "useNoBackupDirectory", "(Ly5/f;Landroid/content/Context;Ljava/lang/String;LQ4/h$c;LQ4/h$a;IZLjava/lang/Long;)V", "T", "identifier", "Lkotlin/Function0;", "Lz5/e;", "createStatement", "Lkotlin/Function1;", "Ly5/e;", "binders", "result", "f", "(Ljava/lang/Integer;LnI/a;LnI/l;LnI/l;)Ljava/lang/Object;", "", "queryKeys", "Lw5/c$a;", "listener", "A2", "([Ljava/lang/String;Lw5/c$a;)V", "j3", "k2", "([Ljava/lang/String;)V", "Lw5/f;", "X1", "()Lw5/f;", "sql", "parameters", "Ly5/b;", "V1", "(Ljava/lang/Integer;Ljava/lang/String;ILnI/l;)Ly5/b;", "R", "Ly5/c;", "mapper", "g", "(Ljava/lang/Integer;Ljava/lang/String;LnI/l;ILnI/l;)Ljava/lang/Object;", "close", "()V", "a", "LQ4/h;", "b", "I", "c", "Ljava/lang/Long;", "Ljava/lang/ThreadLocal;", "d", "Ljava/lang/ThreadLocal;", "transactions", "e", "LXH/o;", "h", "()LQ4/g;", "z5/d$g", "Lz5/d$g;", "statements", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "listeners", "sqldelight-android-driver_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z5.d  reason: case insensitive filesystem */
public final class C9015d implements C8981d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f58400a;

    /* renamed from: b  reason: collision with root package name */
    private final int f58401b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Long f58402c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<w5.f> f58403d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f58404e;

    /* renamed from: f  reason: collision with root package name */
    private final g f58405f;

    /* renamed from: g  reason: collision with root package name */
    private final LinkedHashMap<String, Set<c.a>> f58406g;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0017"}, d2 = {"Lz5/d$a;", "LQ4/h$a;", "Ly5/f;", "Ly5/b$b;", "LXH/N;", "schema", "", "Ly5/a;", "callbacks", "<init>", "(Ly5/f;[Ly5/a;)V", "LQ4/g;", "db", "d", "(LQ4/g;)V", "", "oldVersion", "newVersion", "g", "(LQ4/g;II)V", "c", "Ly5/f;", "[Ly5/a;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z5.d$a */
    public static class a extends h.a {

        /* renamed from: c  reason: collision with root package name */
        private final C8983f<C8979b.C0933b<C16807N>> f58407c;

        /* renamed from: d  reason: collision with root package name */
        private final C8978a[] f58408d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C8983f<C8979b.C0933b<C16807N>> fVar, C8978a... aVarArr) {
            super((int) fVar.getVersion());
            C17542s.j(fVar, "schema");
            C17542s.j(aVarArr, "callbacks");
            if (fVar.getVersion() <= 2147483647L) {
                this.f58407c = fVar;
                this.f58408d = aVarArr;
                return;
            }
            throw new IllegalStateException(("Schema version is larger than Int.MAX_VALUE: " + fVar.getVersion() + '.').toString());
        }

        public void d(Q4.g gVar) {
            C17542s.j(gVar, "db");
            this.f58407c.b(new C9015d((h) null, gVar, 1, (Long) null, 8, (DefaultConstructorMarker) null));
        }

        public void g(Q4.g gVar, int i10, int i11) {
            C17542s.j(gVar, "db");
            C8978a[] aVarArr = this.f58408d;
            this.f58407c.a(new C9015d((h) null, gVar, 1, (Long) null, 8, (DefaultConstructorMarker) null), (long) i10, (long) i11, (C8978a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LQ4/g;", "b", "()LQ4/g;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z5.d$b */
    static final class b extends C17544u implements C17631a<Q4.g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C9015d f58409c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Q4.g f58410d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C9015d dVar, Q4.g gVar) {
            super(0);
            this.f58409c = dVar;
            this.f58410d = gVar;
        }

        /* renamed from: b */
        public final Q4.g invoke() {
            Q4.g writableDatabase;
            h d10 = this.f58409c.f58400a;
            if (d10 != null && (writableDatabase = d10.getWritableDatabase()) != null) {
                return writableDatabase;
            }
            Q4.g gVar = this.f58410d;
            C17542s.g(gVar);
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz5/e;", "b", "()Lz5/e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z5.d$c */
    static final class c extends C17544u implements C17631a<C9016e> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C9015d f58411c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C9015d dVar, String str) {
            super(0);
            this.f58411c = dVar;
            this.f58412d = str;
        }

        /* renamed from: b */
        public final C9016e invoke() {
            return new C9013b(this.f58411c.h().M1(this.f58412d));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz5/e;", "", "a", "(Lz5/e;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z5.d$d  reason: collision with other inner class name */
    static final class C0952d extends C17544u implements C17642l<C9016e, Long> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0952d f58413c = new C0952d();

        C0952d() {
            super(1);
        }

        /* renamed from: a */
        public final Long invoke(C9016e eVar) {
            C17542s.j(eVar, "$this$execute");
            return Long.valueOf(eVar.execute());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lz5/e;", "b", "()Lz5/e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z5.d$e */
    static final class e extends C17544u implements C17631a<C9016e> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58414c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C9015d f58415d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f58416e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, C9015d dVar, int i10) {
            super(0);
            this.f58414c = str;
            this.f58415d = dVar;
            this.f58416e = i10;
        }

        /* renamed from: b */
        public final C9016e invoke() {
            return new C9014c(this.f58414c, this.f58415d.h(), this.f58416e, this.f58415d.f58402c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lz5/e;", "a", "(Lz5/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z5.d$f */
    static final class f extends C17544u implements C17642l<C9016e, R> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C8980c, C8979b<R>> f58417c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C17642l<? super C8980c, ? extends C8979b<R>> lVar) {
            super(1);
            this.f58417c = lVar;
        }

        /* renamed from: a */
        public final R invoke(C9016e eVar) {
            C17542s.j(eVar, "$this$execute");
            return eVar.a(this.f58417c);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"z5/d$g", "Landroid/util/LruCache;", "", "Lz5/e;", "", "evicted", "key", "oldValue", "newValue", "LXH/N;", "a", "(ZILz5/e;Lz5/e;)V", "sqldelight-android-driver_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z5.d$g */
    public static final class g extends LruCache<Integer, C9016e> {
        g(int i10) {
            super(i10);
        }

        /* access modifiers changed from: protected */
        public void a(boolean z10, int i10, C9016e eVar, C9016e eVar2) {
            C17542s.j(eVar, "oldValue");
            if (z10) {
                eVar.close();
            }
        }

        public /* bridge */ /* synthetic */ void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
            a(z10, ((Number) obj).intValue(), (C9016e) obj2, (C9016e) obj3);
        }
    }

    private C9015d(h hVar, Q4.g gVar, int i10, Long l10) {
        this.f58400a = hVar;
        this.f58401b = i10;
        this.f58402c = l10;
        if ((hVar != null) ^ (gVar != null)) {
            this.f58403d = new ThreadLocal<>();
            this.f58404e = C16825p.b(new b(this, gVar));
            this.f58405f = new g(i10);
            this.f58406g = new LinkedHashMap<>();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private final <T> Object f(Integer num, C17631a<? extends C9016e> aVar, C17642l<? super C8982e, C16807N> lVar, C17642l<? super C9016e, ? extends T> lVar2) {
        C9016e eVar = num != null ? (C9016e) this.f58405f.remove(num) : null;
        if (eVar == null) {
            eVar = (C9016e) aVar.invoke();
        }
        if (lVar != null) {
            try {
                lVar.invoke(eVar);
            } catch (Throwable th2) {
                if (num != null) {
                    C9016e eVar2 = (C9016e) this.f58405f.put(num, eVar);
                    if (eVar2 != null) {
                        eVar2.close();
                    }
                } else {
                    eVar.close();
                }
                throw th2;
            }
        }
        Object b10 = C8979b.C0933b.b(lVar2.invoke(eVar));
        if (num != null) {
            C9016e eVar3 = (C9016e) this.f58405f.put(num, eVar);
            if (eVar3 != null) {
                eVar3.close();
            }
        } else {
            eVar.close();
        }
        return b10;
    }

    /* access modifiers changed from: private */
    public final Q4.g h() {
        return (Q4.g) this.f58404e.getValue();
    }

    public void A2(String[] strArr, c.a aVar) {
        C17542s.j(strArr, "queryKeys");
        C17542s.j(aVar, "listener");
        synchronized (this.f58406g) {
            try {
                for (String str : strArr) {
                    LinkedHashMap<String, Set<c.a>> linkedHashMap = this.f58406g;
                    Set<c.a> set = linkedHashMap.get(str);
                    if (set == null) {
                        set = new LinkedHashSet<>();
                        linkedHashMap.put(str, set);
                    }
                    set.add(aVar);
                }
                C16807N n10 = C16807N.f139792a;
            } finally {
            }
        }
    }

    public /* bridge */ /* synthetic */ C8979b H0(Integer num, String str, C17642l lVar, int i10, C17642l lVar2) {
        return C8979b.C0933b.a(g(num, str, lVar, i10, lVar2));
    }

    public C8979b<Long> V1(Integer num, String str, int i10, C17642l<? super C8982e, C16807N> lVar) {
        C17542s.j(str, "sql");
        return C8979b.C0933b.a(f(num, new c(this, str), lVar, C0952d.f58413c));
    }

    public w5.f X1() {
        return this.f58403d.get();
    }

    public void close() {
        C16807N n10;
        this.f58405f.evictAll();
        h hVar = this.f58400a;
        if (hVar != null) {
            hVar.close();
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null) {
            h().close();
        }
    }

    public <R> Object g(Integer num, String str, C17642l<? super C8980c, ? extends C8979b<R>> lVar, int i10, C17642l<? super C8982e, C16807N> lVar2) {
        C17542s.j(str, "sql");
        C17542s.j(lVar, "mapper");
        return f(num, new e(str, this, i10), lVar2, new f(lVar));
    }

    public void j3(String[] strArr, c.a aVar) {
        C17542s.j(strArr, "queryKeys");
        C17542s.j(aVar, "listener");
        synchronized (this.f58406g) {
            try {
                for (String str : strArr) {
                    Set set = this.f58406g.get(str);
                    if (set != null) {
                        set.remove(aVar);
                    }
                }
                C16807N n10 = C16807N.f139792a;
            } finally {
            }
        }
    }

    public void k2(String... strArr) {
        C17542s.j(strArr, "queryKeys");
        LinkedHashSet<c.a> linkedHashSet = new LinkedHashSet<>();
        synchronized (this.f58406g) {
            try {
                for (String str : strArr) {
                    Set set = this.f58406g.get(str);
                    if (set != null) {
                        linkedHashSet.addAll(set);
                    }
                }
                C16807N n10 = C16807N.f139792a;
            } finally {
            }
        }
        for (c.a a10 : linkedHashSet) {
            a10.a();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C9015d(h hVar, Q4.g gVar, int i10, Long l10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : hVar, (i11 & 2) != 0 ? null : gVar, i10, (i11 & 8) != 0 ? null : l10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9015d(y5.C8983f r13, android.content.Context r14, java.lang.String r15, Q4.h.c r16, Q4.h.a r17, int r18, boolean r19, java.lang.Long r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000a
        L_0x0009:
            r6 = r15
        L_0x000a:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0015
            R4.f r1 = new R4.f
            r1.<init>()
            r7 = r1
            goto L_0x0017
        L_0x0015:
            r7 = r16
        L_0x0017:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x0026
            z5.d$a r1 = new z5.d$a
            y5.a[] r4 = new y5.C8978a[r3]
            r5 = r13
            r1.<init>(r13, r4)
            r8 = r1
            goto L_0x0029
        L_0x0026:
            r5 = r13
            r8 = r17
        L_0x0029:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0031
            r1 = 20
            r9 = r1
            goto L_0x0033
        L_0x0031:
            r9 = r18
        L_0x0033:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0039
            r10 = r3
            goto L_0x003b
        L_0x0039:
            r10 = r19
        L_0x003b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r20
        L_0x0043:
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.C9015d.<init>(y5.f, android.content.Context, java.lang.String, Q4.h$c, Q4.h$a, int, boolean, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9015d(C8983f<C8979b.C0933b<C16807N>> fVar, Context context, String str, h.c cVar, h.a aVar, int i10, boolean z10, Long l10) {
        this(cVar.a(h.b.f39573f.a(context).c(aVar).d(str).e(z10).b()), (Q4.g) null, i10, l10);
        C17542s.j(fVar, "schema");
        C17542s.j(context, "context");
        C17542s.j(cVar, "factory");
        C17542s.j(aVar, "callback");
    }
}
