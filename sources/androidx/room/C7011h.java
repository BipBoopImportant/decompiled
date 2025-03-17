package androidx.room;

import N4.a;
import Q4.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.x;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0016\u0018\u00002\u00020\u0001BÏ\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b*\u0010,R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0004¢\u0006\u0006\n\u0004\b>\u00106R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0004¢\u0006\u0006\n\u0004\b?\u00106R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\bB\u0010.R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0004¢\u0006\u0006\n\u0004\bG\u00104R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006X\u0004¢\u0006\u0006\n\u0004\bH\u00104R\u0014\u0010J\u001a\u00020\r8\u0006X\u0004¢\u0006\u0006\n\u0004\bI\u00106¨\u0006K"}, d2 = {"Landroidx/room/h;", "", "Landroid/content/Context;", "context", "", "name", "LQ4/h$c;", "sqliteOpenHelperFactory", "Landroidx/room/x$e;", "migrationContainer", "", "Landroidx/room/x$b;", "callbacks", "", "allowMainThreadQueries", "Landroidx/room/x$d;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Landroidx/room/x$f;", "prepackagedDatabaseCallback", "typeConverters", "LN4/a;", "autoMigrationSpecs", "<init>", "(Landroid/content/Context;Ljava/lang/String;LQ4/h$c;Landroidx/room/x$e;Ljava/util/List;ZLandroidx/room/x$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/x$f;Ljava/util/List;Ljava/util/List;)V", "fromVersion", "toVersion", "a", "(II)Z", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "LQ4/h$c;", "d", "Landroidx/room/x$e;", "e", "Ljava/util/List;", "f", "Z", "g", "Landroidx/room/x$d;", "h", "Ljava/util/concurrent/Executor;", "i", "j", "Landroid/content/Intent;", "k", "l", "m", "Ljava/util/Set;", "n", "o", "Ljava/io/File;", "p", "Ljava/util/concurrent/Callable;", "q", "r", "s", "multiInstanceInvalidation", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.h  reason: case insensitive filesystem */
public class C7011h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f44334a;

    /* renamed from: b  reason: collision with root package name */
    public final String f44335b;

    /* renamed from: c  reason: collision with root package name */
    public final h.c f44336c;

    /* renamed from: d  reason: collision with root package name */
    public final x.e f44337d;

    /* renamed from: e  reason: collision with root package name */
    public final List<x.b> f44338e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f44339f;

    /* renamed from: g  reason: collision with root package name */
    public final x.d f44340g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f44341h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f44342i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f44343j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f44344k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f44345l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<Integer> f44346m;

    /* renamed from: n  reason: collision with root package name */
    public final String f44347n;

    /* renamed from: o  reason: collision with root package name */
    public final File f44348o;

    /* renamed from: p  reason: collision with root package name */
    public final Callable<InputStream> f44349p;

    /* renamed from: q  reason: collision with root package name */
    public final List<Object> f44350q;

    /* renamed from: r  reason: collision with root package name */
    public final List<a> f44351r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f44352s;

    @SuppressLint({"LambdaLast"})
    public C7011h(Context context, String str, h.c cVar, x.e eVar, List<? extends x.b> list, boolean z10, x.d dVar, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, x.f fVar, List<? extends Object> list2, List<? extends a> list3) {
        x.d dVar2 = dVar;
        Executor executor3 = executor;
        Executor executor4 = executor2;
        Intent intent2 = intent;
        List<? extends Object> list4 = list2;
        List<? extends a> list5 = list3;
        C17542s.j(context, "context");
        C17542s.j(cVar, "sqliteOpenHelperFactory");
        C17542s.j(eVar, "migrationContainer");
        C17542s.j(dVar2, "journalMode");
        C17542s.j(executor3, "queryExecutor");
        C17542s.j(executor4, "transactionExecutor");
        C17542s.j(list4, "typeConverters");
        C17542s.j(list5, "autoMigrationSpecs");
        this.f44334a = context;
        this.f44335b = str;
        this.f44336c = cVar;
        this.f44337d = eVar;
        this.f44338e = list;
        this.f44339f = z10;
        this.f44340g = dVar2;
        this.f44341h = executor3;
        this.f44342i = executor4;
        this.f44343j = intent2;
        this.f44344k = z11;
        this.f44345l = z12;
        this.f44346m = set;
        this.f44347n = str2;
        this.f44348o = file;
        this.f44349p = callable;
        this.f44350q = list4;
        this.f44351r = list5;
        this.f44352s = intent2 != null;
    }

    public boolean a(int i10, int i11) {
        if ((i10 > i11 && this.f44345l) || !this.f44344k) {
            return false;
        }
        Set<Integer> set = this.f44346m;
        return set == null || !set.contains(Integer.valueOf(i10));
    }
}
