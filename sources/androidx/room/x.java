package androidx.room;

import Q4.h;
import Q4.j;
import Q4.k;
import XH.C16814e;
import YH.C16877v;
import YH.X;
import YH.g0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o.C5647c;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b&\u0018\u0000 \u00012\u00020\u0001:\f\u0001\u0001\u0001\u0001\u0001\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u001a\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0005\u0012\u0004\u0012\u00020\u001a0\u0019H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0015H$¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H$¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u001c0\u0019H\u0015¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00050(H\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH'¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u000bH\u0017¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u000bH\u0017¢\u0006\u0004\b.\u0010\u0003J+\u00100\u001a\u0002032\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u000101H\u0016¢\u0006\u0004\b0\u00104J#\u00100\u001a\u0002032\u0006\u00100\u001a\u0002052\n\b\u0002\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b0\u00108J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020/H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000bH\u0017¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\u000bH\u0017¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u000bH\u0017¢\u0006\u0004\b?\u0010\u0003J\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ#\u0010B\u001a\u00028\u0000\"\u0004\b\u0000\u0010D2\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0016¢\u0006\u0004\bB\u0010FJ\u0017\u0010I\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020GH\u0014¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MR\u001e\u0010N\u001a\u0004\u0018\u00010G8\u0004@\u0004X\u000e¢\u0006\f\n\u0004\bN\u0010O\u0012\u0004\bP\u0010\u0003R\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bT\u0010SR\u0016\u0010U\u001a\u00020\u00078\u0002@\u0002X.¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020#8\u0016X\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010%R\u0016\u0010Z\u001a\u00020K8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020K8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R$\u0010^\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\u001c8\u0004@\u0004X\u000e¢\u0006\f\n\u0004\b^\u0010_\u0012\u0004\b`\u0010\u0003RR\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0005\u0012\u0004\u0012\u00020\u001a0a2\u001a\u0010b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0005\u0012\u0004\u0012\u00020\u001a0a8E@EX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010c\u001a\u0004\bd\u0010'\"\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020n0m8G¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR#\u0010s\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00010a8G¢\u0006\f\n\u0004\bs\u0010c\u001a\u0004\bt\u0010'R$\u0010u\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010a8\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010cR\u001a\u0010v\u001a\u00020K8VX\u0004¢\u0006\f\u0012\u0004\bw\u0010\u0003\u001a\u0004\bv\u0010MR\u0017\u0010x\u001a\u00020K8G¢\u0006\f\u0012\u0004\by\u0010\u0003\u001a\u0004\bx\u0010MR\u0014\u0010|\u001a\u00020Q8VX\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020Q8VX\u0004¢\u0006\u0006\u001a\u0004\b}\u0010{R\u0015\u0010\b\u001a\u00020\u00078VX\u0004¢\u0006\u0007\u001a\u0005\b\u0010\u0001R\u0016\u0010\u0001\u001a\u00020K8@X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010M¨\u0006\u0001"}, d2 = {"Landroidx/room/x;", "", "<init>", "()V", "T", "Ljava/lang/Class;", "clazz", "LQ4/h;", "openHelper", "unwrapOpenHelper", "(Ljava/lang/Class;LQ4/h;)Ljava/lang/Object;", "LXH/N;", "internalBeginTransaction", "internalEndTransaction", "Ljava/util/concurrent/locks/Lock;", "getCloseLock$room_runtime_release", "()Ljava/util/concurrent/locks/Lock;", "getCloseLock", "klass", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/room/h;", "configuration", "init", "(Landroidx/room/h;)V", "", "LN4/a;", "autoMigrationSpecs", "", "LN4/b;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "config", "createOpenHelper", "(Landroidx/room/h;)LQ4/h;", "Landroidx/room/r;", "createInvalidationTracker", "()Landroidx/room/r;", "getRequiredTypeConverters", "()Ljava/util/Map;", "", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "clearAllTables", "close", "assertNotMainThread", "assertNotSuspendingTransaction", "", "query", "", "args", "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "LQ4/j;", "Landroid/os/CancellationSignal;", "signal", "(LQ4/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "sql", "LQ4/k;", "compileStatement", "(Ljava/lang/String;)LQ4/k;", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "body", "runInTransaction", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "LQ4/g;", "db", "internalInitInvalidationTracker", "(LQ4/g;)V", "", "inTransaction", "()Z", "mDatabase", "LQ4/g;", "getMDatabase$annotations", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "internalOpenHelper", "LQ4/h;", "invalidationTracker", "Landroidx/room/r;", "getInvalidationTracker", "allowMainThreadQueries", "Z", "writeAheadLoggingEnabled", "Landroidx/room/x$b;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "", "<set-?>", "Ljava/util/Map;", "getAutoMigrationSpecs", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Landroidx/room/c;", "autoCloser", "Landroidx/room/c;", "Ljava/lang/ThreadLocal;", "", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "backingFieldMap", "getBackingFieldMap", "typeConverters", "isOpen", "isOpen$annotations", "isOpenInternal", "isOpenInternal$annotations", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()LQ4/h;", "isMainThread$room_runtime_release", "isMainThread", "Companion", "a", "b", "c", "d", "e", "f", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class x {
    public static final c Companion = new c((DefaultConstructorMarker) null);
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private C7006c autoCloser;
    private Map<Class<? extends N4.a>, N4.a> autoMigrationSpecs = new LinkedHashMap();
    private final Map<String, Object> backingFieldMap;
    private Q4.h internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    private final r invalidationTracker = createInvalidationTracker();
    protected List<? extends b> mCallbacks;
    protected volatile Q4.g mDatabase;
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0016J!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u001e\u001a\u00020\u001c\"\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020!0-8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030-8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010.R\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0018\u00104\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u00106R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u00109R\u0016\u0010F\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u00109R\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001d0S8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010S8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010,R\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006d"}, d2 = {"Landroidx/room/x$a;", "Landroidx/room/x;", "T", "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "LQ4/h$c;", "factory", "h", "(LQ4/h$c;)Landroidx/room/x$a;", "", "LN4/b;", "migrations", "b", "([LN4/b;)Landroidx/room/x$a;", "d", "()Landroidx/room/x$a;", "Ljava/util/concurrent/Executor;", "executor", "i", "(Ljava/util/concurrent/Executor;)Landroidx/room/x$a;", "f", "", "", "startVersions", "g", "([I)Landroidx/room/x$a;", "Landroidx/room/x$b;", "callback", "a", "(Landroidx/room/x$b;)Landroidx/room/x$a;", "typeConverter", "c", "(Ljava/lang/Object;)Landroidx/room/x$a;", "e", "()Landroidx/room/x;", "Landroid/content/Context;", "Ljava/lang/Class;", "Ljava/lang/String;", "", "Ljava/util/List;", "callbacks", "typeConverters", "LN4/a;", "autoMigrationSpecs", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "LQ4/h$c;", "", "j", "Z", "allowMainThreadQueries", "Landroidx/room/x$d;", "k", "Landroidx/room/x$d;", "journalMode", "Landroid/content/Intent;", "l", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "m", "requireMigration", "n", "allowDestructiveMigrationOnDowngrade", "", "o", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "p", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Landroidx/room/x$e;", "q", "Landroidx/room/x$e;", "migrationContainer", "", "r", "Ljava/util/Set;", "migrationsNotRequiredFrom", "s", "migrationStartAndEndVersions", "t", "copyFromAssetPath", "Ljava/io/File;", "u", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "v", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a<T extends x> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f44413a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f44414b;

        /* renamed from: c  reason: collision with root package name */
        private final String f44415c;

        /* renamed from: d  reason: collision with root package name */
        private final List<b> f44416d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final List<Object> f44417e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private List<N4.a> f44418f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private Executor f44419g;

        /* renamed from: h  reason: collision with root package name */
        private Executor f44420h;

        /* renamed from: i  reason: collision with root package name */
        private h.c f44421i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f44422j;

        /* renamed from: k  reason: collision with root package name */
        private d f44423k = d.AUTOMATIC;

        /* renamed from: l  reason: collision with root package name */
        private Intent f44424l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f44425m = true;

        /* renamed from: n  reason: collision with root package name */
        private boolean f44426n;

        /* renamed from: o  reason: collision with root package name */
        private long f44427o = -1;

        /* renamed from: p  reason: collision with root package name */
        private TimeUnit f44428p;

        /* renamed from: q  reason: collision with root package name */
        private final e f44429q = new e();

        /* renamed from: r  reason: collision with root package name */
        private Set<Integer> f44430r = new LinkedHashSet();

        /* renamed from: s  reason: collision with root package name */
        private Set<Integer> f44431s;

        /* renamed from: t  reason: collision with root package name */
        private String f44432t;

        /* renamed from: u  reason: collision with root package name */
        private File f44433u;

        /* renamed from: v  reason: collision with root package name */
        private Callable<InputStream> f44434v;

        public a(Context context, Class<T> cls, String str) {
            C17542s.j(context, "context");
            C17542s.j(cls, "klass");
            this.f44413a = context;
            this.f44414b = cls;
            this.f44415c = str;
        }

        public a<T> a(b bVar) {
            C17542s.j(bVar, "callback");
            this.f44416d.add(bVar);
            return this;
        }

        public a<T> b(N4.b... bVarArr) {
            C17542s.j(bVarArr, "migrations");
            if (this.f44431s == null) {
                this.f44431s = new HashSet();
            }
            for (N4.b bVar : bVarArr) {
                Set<Integer> set = this.f44431s;
                C17542s.g(set);
                set.add(Integer.valueOf(bVar.startVersion));
                Set<Integer> set2 = this.f44431s;
                C17542s.g(set2);
                set2.add(Integer.valueOf(bVar.endVersion));
            }
            this.f44429q.b((N4.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
            return this;
        }

        public a<T> c(Object obj) {
            C17542s.j(obj, "typeConverter");
            this.f44417e.add(obj);
            return this;
        }

        public a<T> d() {
            this.f44422j = true;
            return this;
        }

        public T e() {
            Executor executor = this.f44419g;
            if (executor == null && this.f44420h == null) {
                Executor g10 = C5647c.g();
                this.f44420h = g10;
                this.f44419g = g10;
            } else if (executor != null && this.f44420h == null) {
                this.f44420h = executor;
            } else if (executor == null) {
                this.f44419g = this.f44420h;
            }
            Set<Integer> set = this.f44431s;
            if (set != null) {
                C17542s.g(set);
                for (Integer intValue : set) {
                    int intValue2 = intValue.intValue();
                    if (this.f44430r.contains(Integer.valueOf(intValue2))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue2).toString());
                    }
                }
            }
            C7008e eVar = this.f44421i;
            if (eVar == null) {
                eVar = new R4.f();
            }
            if (eVar != null) {
                if (this.f44427o > 0) {
                    if (this.f44415c != null) {
                        long j10 = this.f44427o;
                        TimeUnit timeUnit = this.f44428p;
                        if (timeUnit != null) {
                            Executor executor2 = this.f44419g;
                            if (executor2 != null) {
                                eVar = new C7008e(eVar, new C7006c(j10, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                }
                String str = this.f44432t;
                if (!(str == null && this.f44433u == null && this.f44434v == null)) {
                    if (this.f44415c != null) {
                        int i10 = 0;
                        int i11 = str == null ? 0 : 1;
                        File file = this.f44433u;
                        int i12 = file == null ? 0 : 1;
                        Callable<InputStream> callable = this.f44434v;
                        if (callable != null) {
                            i10 = 1;
                        }
                        if (i11 + i12 + i10 == 1) {
                            eVar = new G(str, file, callable, eVar);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                }
            } else {
                eVar = null;
            }
            G g11 = eVar;
            if (g11 != null) {
                Context context = this.f44413a;
                String str2 = this.f44415c;
                e eVar2 = this.f44429q;
                List<b> list = this.f44416d;
                boolean z10 = this.f44422j;
                d j11 = this.f44423k.j(context);
                Executor executor3 = this.f44419g;
                if (executor3 != null) {
                    Executor executor4 = this.f44420h;
                    if (executor4 != null) {
                        C7011h hVar = new C7011h(context, str2, g11, eVar2, list, z10, j11, executor3, executor4, this.f44424l, this.f44425m, this.f44426n, this.f44430r, this.f44432t, this.f44433u, this.f44434v, (f) null, this.f44417e, this.f44418f);
                        T t10 = (x) w.b(this.f44414b, "_Impl");
                        t10.init(hVar);
                        return t10;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public a<T> f() {
            this.f44425m = false;
            this.f44426n = true;
            return this;
        }

        public a<T> g(int... iArr) {
            C17542s.j(iArr, "startVersions");
            for (int valueOf : iArr) {
                this.f44430r.add(Integer.valueOf(valueOf));
            }
            return this;
        }

        public a<T> h(h.c cVar) {
            this.f44421i = cVar;
            return this;
        }

        public a<T> i(Executor executor) {
            C17542s.j(executor, "executor");
            this.f44419g = executor;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/room/x$b;", "", "<init>", "()V", "LQ4/g;", "db", "LXH/N;", "a", "(LQ4/g;)V", "c", "b", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {
        public void a(Q4.g gVar) {
            C17542s.j(gVar, "db");
        }

        public void b(Q4.g gVar) {
            C17542s.j(gVar, "db");
        }

        public void c(Q4.g gVar) {
            C17542s.j(gVar, "db");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/x$c;", "", "<init>", "()V", "", "MAX_BIND_PARAMETER_CNT", "I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Landroidx/room/x$d;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/app/ActivityManager;", "activityManager", "", "b", "(Landroid/app/ActivityManager;)Z", "Landroid/content/Context;", "context", "j", "(Landroid/content/Context;)Landroidx/room/x$d;", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean b(ActivityManager activityManager) {
            return Q4.c.b(activityManager);
        }

        public final d j(Context context) {
            C17542s.j(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || b(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0013\"\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00170\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fR,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040!0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"¨\u0006#"}, d2 = {"Landroidx/room/x$e;", "", "<init>", "()V", "LN4/b;", "migration", "LXH/N;", "a", "(LN4/b;)V", "", "result", "", "upgrade", "", "start", "end", "", "e", "(Ljava/util/List;ZII)Ljava/util/List;", "", "migrations", "b", "([LN4/b;)V", "", "f", "()Ljava/util/Map;", "d", "(II)Ljava/util/List;", "startVersion", "endVersion", "c", "(II)Z", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Integer, TreeMap<Integer, N4.b>> f44435a = new LinkedHashMap();

        private final void a(N4.b bVar) {
            int i10 = bVar.startVersion;
            int i11 = bVar.endVersion;
            Map<Integer, TreeMap<Integer, N4.b>> map = this.f44435a;
            Integer valueOf = Integer.valueOf(i10);
            TreeMap<Integer, N4.b> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + bVar);
            }
            treeMap2.put(Integer.valueOf(i11), bVar);
        }

        private final List<N4.b> e(List<N4.b> list, boolean z10, int i10, int i11) {
            boolean z11;
            Integer num;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = this.f44435a.get(Integer.valueOf(i10));
                if (treeMap == null) {
                    return null;
                }
                Iterator it = (z10 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        continue;
                        break;
                    }
                    num = (Integer) it.next();
                    if (!z10) {
                        C17542s.i(num, "targetVersion");
                        int intValue = num.intValue();
                        if (i11 <= intValue && intValue < i10) {
                            break;
                        }
                    } else {
                        int i12 = i10 + 1;
                        C17542s.i(num, "targetVersion");
                        int intValue2 = num.intValue();
                        if (i12 <= intValue2 && intValue2 <= i11) {
                            break;
                        }
                    }
                }
                Object obj = treeMap.get(num);
                C17542s.g(obj);
                list.add(obj);
                i10 = num.intValue();
                z11 = true;
                continue;
            } while (z11);
            return null;
        }

        public void b(N4.b... bVarArr) {
            C17542s.j(bVarArr, "migrations");
            for (N4.b a10 : bVarArr) {
                a(a10);
            }
        }

        public final boolean c(int i10, int i11) {
            Map<Integer, Map<Integer, N4.b>> f10 = f();
            if (!f10.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map map = f10.get(Integer.valueOf(i10));
            if (map == null) {
                map = X.j();
            }
            return map.containsKey(Integer.valueOf(i11));
        }

        public List<N4.b> d(int i10, int i11) {
            if (i10 == i11) {
                return C16877v.n();
            }
            return e(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map<Integer, Map<Integer, N4.b>> f() {
            return this.f44435a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/x$f;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class f {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/g;", "it", "", "a", "(LQ4/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<Q4.g, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x f44436c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(x xVar) {
            super(1);
            this.f44436c = xVar;
        }

        /* renamed from: a */
        public final Object invoke(Q4.g gVar) {
            C17542s.j(gVar, "it");
            this.f44436c.internalBeginTransaction();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/g;", "it", "", "a", "(LQ4/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<Q4.g, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x f44437c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(x xVar) {
            super(1);
            this.f44437c = xVar;
        }

        /* renamed from: a */
        public final Object invoke(Q4.g gVar) {
            C17542s.j(gVar, "it");
            this.f44437c.internalEndTransaction();
            return null;
        }
    }

    public x() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C17542s.i(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    @C16814e
    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    @C16814e
    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    /* access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        Q4.g writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().x(writableDatabase);
        if (writableDatabase.a3()) {
            writableDatabase.x0();
        } else {
            writableDatabase.P();
        }
    }

    /* access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().J0();
        if (!inTransaction()) {
            getInvalidationTracker().o();
        }
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(x xVar, j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                cancellationSignal = null;
            }
            return xVar.query(jVar, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    private final <T> T unwrapOpenHelper(Class<T> cls, Q4.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof C7012i) {
            return unwrapOpenHelper(cls, ((C7012i) hVar).c());
        }
        return null;
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @C16814e
    public void beginTransaction() {
        assertNotMainThread();
        C7006c cVar = this.autoCloser;
        if (cVar == null) {
            internalBeginTransaction();
        } else {
            cVar.g(new g(this));
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            C17542s.i(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().u();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public k compileStatement(String str) {
        C17542s.j(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().M1(str);
    }

    /* access modifiers changed from: protected */
    public abstract r createInvalidationTracker();

    /* access modifiers changed from: protected */
    public abstract Q4.h createOpenHelper(C7011h hVar);

    @C16814e
    public void endTransaction() {
        C7006c cVar = this.autoCloser;
        if (cVar == null) {
            internalEndTransaction();
        } else {
            cVar.g(new h(this));
        }
    }

    /* access modifiers changed from: protected */
    public final Map<Class<? extends N4.a>, N4.a> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List<N4.b> getAutoMigrations(Map<Class<? extends N4.a>, N4.a> map) {
        C17542s.j(map, "autoMigrationSpecs");
        return C16877v.n();
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        C17542s.i(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public r getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public Q4.h getOpenHelper() {
        Q4.h hVar = this.internalOpenHelper;
        if (hVar != null) {
            return hVar;
        }
        C17542s.z("internalOpenHelper");
        return null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        C17542s.z("internalQueryExecutor");
        return null;
    }

    public Set<Class<? extends N4.a>> getRequiredAutoMigrationSpecs() {
        return g0.d();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return X.j();
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        C17542s.z("internalTransactionExecutor");
        return null;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        C17542s.j(cls, "klass");
        return this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().N2();
    }

    public void init(C7011h hVar) {
        C17542s.j(hVar, "configuration");
        this.internalOpenHelper = createOpenHelper(hVar);
        Set<Class<? extends N4.a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends N4.a>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class next = it.next();
                int size = hVar.f44351r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(hVar.f44351r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 >= 0) {
                    this.autoMigrationSpecs.put(next, hVar.f44351r.get(i10));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = hVar.f44351r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        } else if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (N4.b next2 : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!hVar.f44337d.c(next2.startVersion, next2.endVersion)) {
                        hVar.f44337d.b(next2);
                    }
                }
                F f10 = (F) unwrapOpenHelper(F.class, getOpenHelper());
                if (f10 != null) {
                    f10.f(hVar);
                }
                C7007d dVar = (C7007d) unwrapOpenHelper(C7007d.class, getOpenHelper());
                if (dVar != null) {
                    this.autoCloser = dVar.f44275b;
                    getInvalidationTracker().r(dVar.f44275b);
                }
                boolean z10 = hVar.f44340g == d.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z10);
                this.mCallbacks = hVar.f44338e;
                this.internalQueryExecutor = hVar.f44341h;
                this.internalTransactionExecutor = new K(hVar.f44342i);
                this.allowMainThreadQueries = hVar.f44339f;
                this.writeAheadLoggingEnabled = z10;
                if (hVar.f44343j != null) {
                    if (hVar.f44335b != null) {
                        getInvalidationTracker().s(hVar.f44334a, hVar.f44335b, hVar.f44343j);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry next3 : requiredTypeConverters.entrySet()) {
                    Class cls = (Class) next3.getKey();
                    Iterator it2 = ((List) next3.getValue()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Class cls2 = (Class) it2.next();
                            int size3 = hVar.f44350q.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i13 = size3 - 1;
                                    if (cls2.isAssignableFrom(hVar.f44350q.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i13 < 0) {
                                        break;
                                    } else {
                                        size3 = i13;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                                this.typeConverters.put(cls2, hVar.f44350q.get(size3));
                            } else {
                                throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                        }
                    }
                }
                int size4 = hVar.f44350q.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i14 = size4 - 1;
                        if (!bitSet2.get(size4)) {
                            throw new IllegalArgumentException("Unexpected type converter " + hVar.f44350q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        } else if (i14 >= 0) {
                            size4 = i14;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void internalInitInvalidationTracker(Q4.g gVar) {
        C17542s.j(gVar, "db");
        getInvalidationTracker().l(gVar);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean bool;
        boolean isOpen;
        C7006c cVar = this.autoCloser;
        if (cVar != null) {
            isOpen = cVar.l();
        } else {
            Q4.g gVar = this.mDatabase;
            if (gVar != null) {
                isOpen = gVar.isOpen();
            } else {
                bool = null;
                return C17542s.e(bool, Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return C17542s.e(bool, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        Q4.g gVar = this.mDatabase;
        return gVar != null && gVar.isOpen();
    }

    public final Cursor query(j jVar) {
        C17542s.j(jVar, "query");
        return query$default(this, jVar, (CancellationSignal) null, 2, (Object) null);
    }

    public void runInTransaction(Runnable runnable) {
        C17542s.j(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    /* access modifiers changed from: protected */
    public final void setAutoMigrationSpecs(Map<Class<? extends N4.a>, N4.a> map) {
        C17542s.j(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @C16814e
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().v0();
    }

    public Cursor query(String str, Object[] objArr) {
        C17542s.j(str, "query");
        return getOpenHelper().getWritableDatabase().l3(new Q4.a(str, objArr));
    }

    public Cursor query(j jVar, CancellationSignal cancellationSignal) {
        C17542s.j(jVar, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().s1(jVar, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().l3(jVar);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        C17542s.j(callable, "body");
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
