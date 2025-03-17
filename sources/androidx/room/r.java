package androidx.room;

import HJ.C15854t;
import Q4.g;
import Q4.k;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import YH.g0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.lifecycle.F;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import jI.C17416c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.C5677b;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0005?C+-=BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0000¢\u0006\u0004\b(\u0010\u000fJ\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b-\u0010,J\u0017\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b.\u0010,J\u000f\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\u000fJ#\u00104\u001a\u00020\r2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005H\u0007¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H\u0000¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020\rH\u0000¢\u0006\u0004\b7\u0010\u000fJC\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<\"\u0004\b\u0000\u001082\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u0006\u00109\u001a\u00020/2\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000:H\u0017¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010DR&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00048\u0000X\u0004¢\u0006\f\n\u0004\b-\u0010D\u001a\u0004\bE\u0010FR\"\u0010K\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t8\u0000X\u0004¢\u0006\f\n\u0004\b=\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010LR\u001a\u0010R\u001a\u00020M8GX\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010SR$\u0010[\u001a\u0004\u0018\u00010U8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bN\u0010X\"\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010`R&\u0010f\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020c0b8\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u0010d\u001a\u0004\bV\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010hR\u0014\u0010k\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010jR\u0014\u0010l\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010jR\u001a\u0010p\u001a\u00020m8\u0006X\u0004¢\u0006\f\n\u0004\b.\u0010n\u0012\u0004\bo\u0010\u000f¨\u0006q"}, d2 = {"Landroidx/room/r;", "", "Landroidx/room/x;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/x;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "LXH/N;", "n", "()V", "LQ4/g;", "db", "", "tableId", "v", "(LQ4/g;I)V", "t", "y", "([Ljava/lang/String;)[Ljava/lang/String;", "names", "q", "Landroidx/room/c;", "autoCloser", "r", "(Landroidx/room/c;)V", "l", "(LQ4/g;)V", "Landroid/content/Context;", "context", "name", "Landroid/content/Intent;", "serviceIntent", "s", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "u", "Landroidx/room/r$c;", "observer", "c", "(Landroidx/room/r$c;)V", "d", "p", "", "f", "()Z", "o", "tables", "m", "([Ljava/lang/String;)V", "x", "w", "T", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/F;", "e", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/F;", "a", "Landroidx/room/x;", "h", "()Landroidx/room/x;", "b", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "tableIdLookup", "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "tablesNames", "Landroidx/room/c;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "Z", "initialized", "LQ4/k;", "i", "LQ4/k;", "()LQ4/k;", "setCleanupStatement$room_runtime_release", "(LQ4/k;)V", "cleanupStatement", "Landroidx/room/r$b;", "Landroidx/room/r$b;", "observedTableTracker", "Landroidx/room/p;", "Landroidx/room/p;", "invalidationLiveDataContainer", "Lp/b;", "Landroidx/room/r$d;", "Lp/b;", "()Lp/b;", "observerMap", "Landroidx/room/u;", "Landroidx/room/u;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "syncTriggersLock", "trackerLock", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "refreshRunnable", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class r {

    /* renamed from: q  reason: collision with root package name */
    public static final a f44362q = new a((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    private static final String[] f44363r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    private final x f44364a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f44365b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Set<String>> f44366c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Integer> f44367d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f44368e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public C7006c f44369f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f44370g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f44371h;

    /* renamed from: i  reason: collision with root package name */
    private volatile k f44372i;

    /* renamed from: j  reason: collision with root package name */
    private final b f44373j;

    /* renamed from: k  reason: collision with root package name */
    private final p f44374k;

    /* renamed from: l  reason: collision with root package name */
    private final C5677b<c, d> f44375l;

    /* renamed from: m  reason: collision with root package name */
    private u f44376m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f44377n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f44378o;

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f44379p;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/room/r$a;", "", "<init>", "()V", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LQ4/g;", "database", "LXH/N;", "a", "(LQ4/g;)V", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(g gVar) {
            C17542s.j(gVar, "database");
            if (gVar.a3()) {
                gVar.x0();
            } else {
                gVar.P();
            }
        }

        public final String b(String str, String str2) {
            C17542s.j(str, "tableName");
            C17542s.j(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/room/r$b;", "", "", "tableCount", "<init>", "(I)V", "", "tableIds", "", "b", "([I)Z", "c", "LXH/N;", "d", "()V", "a", "()[I", "", "[J", "getTableObservers", "()[J", "tableObservers", "", "[Z", "triggerStates", "[I", "triggerStateChanges", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "needsSync", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final a f44380e = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final long[] f44381a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean[] f44382b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f44383c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f44384d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/room/r$b$a;", "", "<init>", "()V", "", "ADD", "I", "NO_OP", "REMOVE", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(int i10) {
            this.f44381a = new long[i10];
            this.f44382b = new boolean[i10];
            this.f44383c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f44384d) {
                        return null;
                    }
                    long[] jArr = this.f44381a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f44382b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f44383c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f44383c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f44384d = false;
                    int[] iArr2 = (int[]) this.f44383c.clone();
                    return iArr2;
                } finally {
                }
            }
        }

        public final boolean b(int... iArr) {
            boolean z10;
            C17542s.j(iArr, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        long[] jArr = this.f44381a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            this.f44384d = true;
                            z10 = true;
                        }
                    }
                    C16807N n10 = C16807N.f139792a;
                } finally {
                }
            }
            return z10;
        }

        public final boolean c(int... iArr) {
            boolean z10;
            C17542s.j(iArr, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        long[] jArr = this.f44381a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            this.f44384d = true;
                            z10 = true;
                        }
                    }
                    C16807N n10 = C16807N.f139792a;
                } finally {
                }
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f44382b, false);
                this.f44384d = true;
                C16807N n10 = C16807N.f139792a;
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8PX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/room/r$c;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "", "LXH/N;", "c", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f44385a;

        public c(String[] strArr) {
            C17542s.j(strArr, "tables");
            this.f44385a = strArr;
        }

        public final String[] a() {
            return this.f44385a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> set);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/room/r$d;", "", "Landroidx/room/r$c;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/r$c;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "LXH/N;", "b", "(Ljava/util/Set;)V", "tables", "c", "([Ljava/lang/String;)V", "a", "Landroidx/room/r$c;", "getObserver$room_runtime_release", "()Landroidx/room/r$c;", "[I", "()[I", "[Ljava/lang/String;", "d", "Ljava/util/Set;", "singleTableSet", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final c f44386a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f44387b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f44388c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f44389d;

        public d(c cVar, int[] iArr, String[] strArr) {
            C17542s.j(cVar, "observer");
            C17542s.j(iArr, "tableIds");
            C17542s.j(strArr, "tableNames");
            this.f44386a = cVar;
            this.f44387b = iArr;
            this.f44388c = strArr;
            this.f44389d = !(strArr.length == 0) ? g0.c(strArr[0]) : g0.d();
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f44387b;
        }

        public final void b(Set<Integer> set) {
            Set<String> set2;
            C17542s.j(set, "invalidatedTablesIds");
            int[] iArr = this.f44387b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set b10 = g0.b();
                    int[] iArr2 = this.f44387b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i10]))) {
                            b10.add(this.f44388c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    set2 = g0.a(b10);
                } else {
                    set2 = set.contains(Integer.valueOf(iArr[0])) ? this.f44389d : g0.d();
                }
            } else {
                set2 = g0.d();
            }
            if (!set2.isEmpty()) {
                this.f44386a.c(set2);
            }
        }

        public final void c(String[] strArr) {
            Set<String> set;
            C17542s.j(strArr, "tables");
            int length = this.f44388c.length;
            if (length != 0) {
                if (length == 1) {
                    int length2 = strArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            set = g0.d();
                            break;
                        } else if (C15854t.H(strArr[i10], this.f44388c[0], true)) {
                            set = this.f44389d;
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else {
                    Set b10 = g0.b();
                    for (String str : strArr) {
                        for (String str2 : this.f44388c) {
                            if (C15854t.H(str2, str, true)) {
                                b10.add(str2);
                            }
                        }
                    }
                    set = g0.a(b10);
                }
            } else {
                set = g0.d();
            }
            if (!set.isEmpty()) {
                this.f44386a.c(set);
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/room/r$e;", "Landroidx/room/r$c;", "Landroidx/room/r;", "tracker", "delegate", "<init>", "(Landroidx/room/r;Landroidx/room/r$c;)V", "", "", "tables", "LXH/N;", "c", "(Ljava/util/Set;)V", "b", "Landroidx/room/r;", "getTracker", "()Landroidx/room/r;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "getDelegateRef", "()Ljava/lang/ref/WeakReference;", "delegateRef", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends c {

        /* renamed from: b  reason: collision with root package name */
        private final r f44390b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<c> f44391c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(r rVar, c cVar) {
            super(cVar.a());
            C17542s.j(rVar, "tracker");
            C17542s.j(cVar, "delegate");
            this.f44390b = rVar;
            this.f44391c = new WeakReference<>(cVar);
        }

        public void c(Set<String> set) {
            C17542s.j(set, "tables");
            c cVar = this.f44391c.get();
            if (cVar == null) {
                this.f44390b.p(this);
            } else {
                cVar.c(set);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/room/r$f", "Ljava/lang/Runnable;", "", "", "a", "()Ljava/util/Set;", "LXH/N;", "run", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f44392a;

        f(r rVar) {
            this.f44392a = rVar;
        }

        private final Set<Integer> a() {
            r rVar = this.f44392a;
            Set b10 = g0.b();
            Cursor query$default = x.query$default(rVar.h(), new Q4.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), (CancellationSignal) null, 2, (Object) null);
            while (query$default.moveToNext()) {
                try {
                    b10.add(Integer.valueOf(query$default.getInt(0)));
                } catch (Throwable th2) {
                    C17416c.a(query$default, th);
                    throw th2;
                }
            }
            C16807N n10 = C16807N.f139792a;
            C17416c.a(query$default, (Throwable) null);
            Set<Integer> a10 = g0.a(b10);
            if (!a10.isEmpty()) {
                if (this.f44392a.g() != null) {
                    k g10 = this.f44392a.g();
                    if (g10 != null) {
                        g10.b0();
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return a10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
            if (r0 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            r0.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
            if (r0 == null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
            if (r0 == null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
            if (r2.isEmpty() != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
            r0 = r4.f44392a.i();
            r1 = r4.f44392a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            r1 = r1.i().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00de, code lost:
            if (r1.hasNext() == false) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
            ((androidx.room.r.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f0, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f2, code lost:
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f4, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f7, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                androidx.room.r r0 = r4.f44392a
                androidx.room.x r0 = r0.h()
                java.util.concurrent.locks.Lock r0 = r0.getCloseLock$room_runtime_release()
                r0.lock()
                androidx.room.r r1 = r4.f44392a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                boolean r1 = r1.f()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 != 0) goto L_0x0024
                r0.unlock()
                androidx.room.r r0 = r4.f44392a
                androidx.room.c r0 = r0.f44369f
                if (r0 == 0) goto L_0x0023
                r0.e()
            L_0x0023:
                return
            L_0x0024:
                androidx.room.r r1 = r4.f44392a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.j()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r2 = 1
                r3 = 0
                boolean r1 = r1.compareAndSet(r2, r3)     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 != 0) goto L_0x0041
                r0.unlock()
                androidx.room.r r0 = r4.f44392a
                androidx.room.c r0 = r0.f44369f
                if (r0 == 0) goto L_0x0040
                r0.e()
            L_0x0040:
                return
            L_0x0041:
                androidx.room.r r1 = r4.f44392a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                androidx.room.x r1 = r1.h()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                boolean r1 = r1.inTransaction()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 == 0) goto L_0x005c
                r0.unlock()
                androidx.room.r r0 = r4.f44392a
                androidx.room.c r0 = r0.f44369f
                if (r0 == 0) goto L_0x005b
                r0.e()
            L_0x005b:
                return
            L_0x005c:
                androidx.room.r r1 = r4.f44392a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                androidx.room.x r1 = r1.h()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                Q4.h r1 = r1.getOpenHelper()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                Q4.g r1 = r1.getWritableDatabase()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r1.x0()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                java.util.Set r2 = r4.a()     // Catch:{ all -> 0x008d }
                r1.v0()     // Catch:{ all -> 0x008d }
                r1.J0()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r0.unlock()
                androidx.room.r r0 = r4.f44392a
                androidx.room.c r0 = r0.f44369f
                if (r0 == 0) goto L_0x00c0
            L_0x0082:
                r0.e()
                goto L_0x00c0
            L_0x0086:
                r1 = move-exception
                goto L_0x00f9
            L_0x0089:
                r1 = move-exception
                goto L_0x0092
            L_0x008b:
                r1 = move-exception
                goto L_0x00a9
            L_0x008d:
                r2 = move-exception
                r1.J0()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                throw r2     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
            L_0x0092:
                java.lang.String r2 = "ROOM"
                java.lang.String r3 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0086 }
                java.util.Set r2 = YH.g0.d()     // Catch:{ all -> 0x0086 }
                r0.unlock()
                androidx.room.r r0 = r4.f44392a
                androidx.room.c r0 = r0.f44369f
                if (r0 == 0) goto L_0x00c0
                goto L_0x0082
            L_0x00a9:
                java.lang.String r2 = "ROOM"
                java.lang.String r3 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0086 }
                java.util.Set r2 = YH.g0.d()     // Catch:{ all -> 0x0086 }
                r0.unlock()
                androidx.room.r r0 = r4.f44392a
                androidx.room.c r0 = r0.f44369f
                if (r0 == 0) goto L_0x00c0
                goto L_0x0082
            L_0x00c0:
                r0 = r2
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x00f8
                androidx.room.r r0 = r4.f44392a
                p.b r0 = r0.i()
                androidx.room.r r1 = r4.f44392a
                monitor-enter(r0)
                p.b r1 = r1.i()     // Catch:{ all -> 0x00f0 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00f0 }
            L_0x00da:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00f0 }
                if (r3 == 0) goto L_0x00f2
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00f0 }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00f0 }
                java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00f0 }
                androidx.room.r$d r3 = (androidx.room.r.d) r3     // Catch:{ all -> 0x00f0 }
                r3.b(r2)     // Catch:{ all -> 0x00f0 }
                goto L_0x00da
            L_0x00f0:
                r1 = move-exception
                goto L_0x00f6
            L_0x00f2:
                XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x00f0 }
                monitor-exit(r0)
                goto L_0x00f8
            L_0x00f6:
                monitor-exit(r0)
                throw r1
            L_0x00f8:
                return
            L_0x00f9:
                r0.unlock()
                androidx.room.r r0 = r4.f44392a
                androidx.room.c r0 = r0.f44369f
                if (r0 == 0) goto L_0x0107
                r0.e()
            L_0x0107:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.r.f.run():void");
        }
    }

    public r(x xVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        String str;
        C17542s.j(xVar, "database");
        C17542s.j(map, "shadowTablesMap");
        C17542s.j(map2, "viewTables");
        C17542s.j(strArr, "tableNames");
        this.f44364a = xVar;
        this.f44365b = map;
        this.f44366c = map2;
        this.f44373j = new b(strArr.length);
        this.f44374k = new p(xVar);
        this.f44375l = new C5677b<>();
        this.f44377n = new Object();
        this.f44378o = new Object();
        this.f44367d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Locale locale = Locale.US;
            C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
            String lowerCase = str2.toLowerCase(locale);
            C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f44367d.put(lowerCase, Integer.valueOf(i10));
            String str3 = this.f44365b.get(strArr[i10]);
            if (str3 != null) {
                C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                str = str3.toLowerCase(locale);
                C17542s.i(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i10] = lowerCase;
        }
        this.f44368e = strArr2;
        for (Map.Entry next : this.f44365b.entrySet()) {
            Locale locale2 = Locale.US;
            C17542s.i(locale2, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            C17542s.i(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f44367d.containsKey(lowerCase2)) {
                C17542s.i(locale2, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                C17542s.i(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.f44367d;
                map3.put(lowerCase3, X.k(map3, lowerCase2));
            }
        }
        this.f44379p = new f(this);
    }

    /* access modifiers changed from: private */
    public final void n() {
        synchronized (this.f44378o) {
            this.f44371h = false;
            this.f44373j.d();
            k kVar = this.f44372i;
            if (kVar != null) {
                kVar.close();
                C16807N n10 = C16807N.f139792a;
            }
        }
    }

    private final String[] q(String[] strArr) {
        Set b10 = g0.b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f44366c;
            Locale locale = Locale.US;
            C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
            String lowerCase = str.toLowerCase(locale);
            C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f44366c;
                C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                String lowerCase2 = str.toLowerCase(locale);
                C17542s.i(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                C17542s.g(set);
                b10.addAll(set);
            } else {
                b10.add(str);
            }
        }
        return (String[]) g0.a(b10).toArray(new String[0]);
    }

    private final void t(g gVar, int i10) {
        gVar.T("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f44368e[i10];
        for (String str2 : f44363r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f44362q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + "room_table_modification_log" + " SET " + "invalidated" + " = 1" + " WHERE " + "table_id" + " = " + i10 + " AND " + "invalidated" + " = 0" + "; END";
            C17542s.i(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.T(str3);
        }
    }

    private final void v(g gVar, int i10) {
        String str = this.f44368e[i10];
        for (String str2 : f44363r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f44362q.b(str, str2);
            C17542s.i(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.T(str3);
        }
    }

    private final String[] y(String[] strArr) {
        String[] q10 = q(strArr);
        int length = q10.length;
        int i10 = 0;
        while (i10 < length) {
            String str = q10[i10];
            Map<String, Integer> map = this.f44367d;
            Locale locale = Locale.US;
            C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
            String lowerCase = str.toLowerCase(locale);
            C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                i10++;
            } else {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return q10;
    }

    @SuppressLint({"RestrictedApi"})
    public void c(c cVar) {
        d p10;
        C17542s.j(cVar, "observer");
        String[] q10 = q(cVar.a());
        ArrayList arrayList = new ArrayList(q10.length);
        int length = q10.length;
        int i10 = 0;
        while (i10 < length) {
            String str = q10[i10];
            Map<String, Integer> map = this.f44367d;
            Locale locale = Locale.US;
            C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
            String lowerCase = str.toLowerCase(locale);
            C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num != null) {
                arrayList.add(num);
                i10++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        int[] s12 = C16877v.s1(arrayList);
        d dVar = new d(cVar, s12, q10);
        synchronized (this.f44375l) {
            p10 = this.f44375l.p(cVar, dVar);
        }
        if (p10 == null && this.f44373j.b(Arrays.copyOf(s12, s12.length))) {
            w();
        }
    }

    public void d(c cVar) {
        C17542s.j(cVar, "observer");
        c(new e(this, cVar));
    }

    public <T> F<T> e(String[] strArr, boolean z10, Callable<T> callable) {
        C17542s.j(strArr, "tableNames");
        C17542s.j(callable, "computeFunction");
        return this.f44374k.a(y(strArr), z10, callable);
    }

    public final boolean f() {
        if (!this.f44364a.isOpenInternal()) {
            return false;
        }
        if (!this.f44371h) {
            this.f44364a.getOpenHelper().getWritableDatabase();
        }
        if (this.f44371h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k g() {
        return this.f44372i;
    }

    public final x h() {
        return this.f44364a;
    }

    public final C5677b<c, d> i() {
        return this.f44375l;
    }

    public final AtomicBoolean j() {
        return this.f44370g;
    }

    public final Map<String, Integer> k() {
        return this.f44367d;
    }

    public final void l(g gVar) {
        C17542s.j(gVar, "database");
        synchronized (this.f44378o) {
            if (this.f44371h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.T("PRAGMA temp_store = MEMORY;");
            gVar.T("PRAGMA recursive_triggers='ON';");
            gVar.T("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            x(gVar);
            this.f44372i = gVar.M1("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f44371h = true;
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final void m(String... strArr) {
        C17542s.j(strArr, "tables");
        synchronized (this.f44375l) {
            try {
                Iterator<T> it = this.f44375l.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    C17542s.i(entry, "(observer, wrapper)");
                    d dVar = (d) entry.getValue();
                    if (!((c) entry.getKey()).b()) {
                        dVar.c(strArr);
                    }
                }
                C16807N n10 = C16807N.f139792a;
            } finally {
            }
        }
    }

    public void o() {
        if (this.f44370g.compareAndSet(false, true)) {
            C7006c cVar = this.f44369f;
            if (cVar != null) {
                cVar.j();
            }
            this.f44364a.getQueryExecutor().execute(this.f44379p);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void p(c cVar) {
        d q10;
        C17542s.j(cVar, "observer");
        synchronized (this.f44375l) {
            q10 = this.f44375l.q(cVar);
        }
        if (q10 != null) {
            b bVar = this.f44373j;
            int[] a10 = q10.a();
            if (bVar.c(Arrays.copyOf(a10, a10.length))) {
                w();
            }
        }
    }

    public final void r(C7006c cVar) {
        C17542s.j(cVar, "autoCloser");
        this.f44369f = cVar;
        cVar.m(new q(this));
    }

    public final void s(Context context, String str, Intent intent) {
        C17542s.j(context, "context");
        C17542s.j(str, "name");
        C17542s.j(intent, "serviceIntent");
        this.f44376m = new u(context, str, intent, this, this.f44364a.getQueryExecutor());
    }

    public final void u() {
        u uVar = this.f44376m;
        if (uVar != null) {
            uVar.o();
        }
        this.f44376m = null;
    }

    public final void w() {
        if (this.f44364a.isOpenInternal()) {
            x(this.f44364a.getOpenHelper().getWritableDatabase());
        }
    }

    public final void x(g gVar) {
        Lock closeLock$room_runtime_release;
        C17542s.j(gVar, "database");
        if (!gVar.N2()) {
            try {
                closeLock$room_runtime_release = this.f44364a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                synchronized (this.f44377n) {
                    int[] a10 = this.f44373j.a();
                    if (a10 == null) {
                        closeLock$room_runtime_release.unlock();
                        return;
                    }
                    f44362q.a(gVar);
                    try {
                        int length = a10.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = a10[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                t(gVar, i11);
                            } else if (i12 == 2) {
                                v(gVar, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        gVar.v0();
                        gVar.J0();
                        C16807N n10 = C16807N.f139792a;
                        closeLock$room_runtime_release.unlock();
                    } finally {
                        gVar.J0();
                    }
                }
            } catch (IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            } catch (SQLiteException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
            } catch (Throwable th2) {
                closeLock$room_runtime_release.unlock();
                throw th2;
            }
        }
    }
}
