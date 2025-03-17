package androidx.room;

import Q4.e;
import Q4.f;
import Q4.g;
import Q4.h;
import Q4.j;
import Q4.k;
import XH.C16807N;
import XH.C16814e;
import YH.C16877v;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000f\u0013\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8WX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/room/d;", "LQ4/h;", "Landroidx/room/i;", "delegate", "Landroidx/room/c;", "autoCloser", "<init>", "(LQ4/h;Landroidx/room/c;)V", "", "enabled", "LXH/N;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "a", "LQ4/h;", "c", "()LQ4/h;", "b", "Landroidx/room/c;", "Landroidx/room/d$a;", "Landroidx/room/d$a;", "autoClosingDb", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LQ4/g;", "getWritableDatabase", "()LQ4/g;", "writableDatabase", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.d  reason: case insensitive filesystem */
public final class C7007d implements h, C7012i {

    /* renamed from: a  reason: collision with root package name */
    private final h f44274a;

    /* renamed from: b  reason: collision with root package name */
    public final C7006c f44275b;

    /* renamed from: c  reason: collision with root package name */
    private final a f44276c;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'JE\u0010,\u001a\u00020!2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010\t2\u0012\u0010+\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010*\u0018\u00010)H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J)\u00101\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u00100\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010*0)H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0014R\u0016\u00109\u001a\u0004\u0018\u00010\t8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00128WX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0014R(\u0010@\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0=\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/room/d$a;", "LQ4/g;", "Landroidx/room/c;", "autoCloser", "<init>", "(Landroidx/room/c;)V", "LXH/N;", "c", "()V", "", "sql", "LQ4/k;", "M1", "(Ljava/lang/String;)LQ4/k;", "P", "x0", "J0", "v0", "", "N2", "()Z", "query", "Landroid/database/Cursor;", "u2", "(Ljava/lang/String;)Landroid/database/Cursor;", "LQ4/j;", "l3", "(LQ4/j;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "s1", "(LQ4/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "x2", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "", "", "whereArgs", "l2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "T", "(Ljava/lang/String;)V", "bindArgs", "w0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "a", "Landroidx/room/c;", "isOpen", "m", "()Ljava/lang/String;", "path", "a3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "R", "()Ljava/util/List;", "attachedDbs", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.d$a */
    public static final class a implements Q4.g {

        /* renamed from: a  reason: collision with root package name */
        private final C7006c f44277a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LQ4/g;", "obj", "", "Landroid/util/Pair;", "", "a", "(LQ4/g;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$a  reason: collision with other inner class name */
        static final class C0755a extends C17544u implements C17642l<Q4.g, List<? extends Pair<String, String>>> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0755a f44278c = new C0755a();

            C0755a() {
                super(1);
            }

            /* renamed from: a */
            public final List<Pair<String, String>> invoke(Q4.g gVar) {
                C17542s.j(gVar, "obj");
                return gVar.R();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/g;", "db", "", "a", "(LQ4/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$b */
        static final class b extends C17544u implements C17642l<Q4.g, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f44279c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f44279c = str;
            }

            /* renamed from: a */
            public final Object invoke(Q4.g gVar) {
                C17542s.j(gVar, "db");
                gVar.T(this.f44279c);
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/g;", "db", "", "a", "(LQ4/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$c */
        static final class c extends C17544u implements C17642l<Q4.g, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f44280c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Object[] f44281d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f44280c = str;
                this.f44281d = objArr;
            }

            /* renamed from: a */
            public final Object invoke(Q4.g gVar) {
                C17542s.j(gVar, "db");
                gVar.w0(this.f44280c, this.f44281d);
                return null;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.d$a$d  reason: collision with other inner class name */
        /* synthetic */ class C0756d extends C17540p implements C17642l<Q4.g, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0756d f44282a = new C0756d();

            C0756d() {
                super(1, Q4.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            /* renamed from: t */
            public final Boolean invoke(Q4.g gVar) {
                C17542s.j(gVar, "p0");
                return Boolean.valueOf(gVar.N2());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/g;", "db", "", "a", "(LQ4/g;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$e */
        static final class e extends C17544u implements C17642l<Q4.g, Long> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f44283c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f44284d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ContentValues f44285e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(String str, int i10, ContentValues contentValues) {
                super(1);
                this.f44283c = str;
                this.f44284d = i10;
                this.f44285e = contentValues;
            }

            /* renamed from: a */
            public final Long invoke(Q4.g gVar) {
                C17542s.j(gVar, "db");
                return Long.valueOf(gVar.x2(this.f44283c, this.f44284d, this.f44285e));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/g;", "db", "", "a", "(LQ4/g;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$f */
        static final class f extends C17544u implements C17642l<Q4.g, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            public static final f f44286c = new f();

            f() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(Q4.g gVar) {
                C17542s.j(gVar, "db");
                return Boolean.valueOf(gVar.a3());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/g;", "obj", "", "a", "(LQ4/g;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$g */
        static final class g extends C17544u implements C17642l<Q4.g, String> {

            /* renamed from: c  reason: collision with root package name */
            public static final g f44287c = new g();

            g() {
                super(1);
            }

            /* renamed from: a */
            public final String invoke(Q4.g gVar) {
                C17542s.j(gVar, "obj");
                return gVar.m();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/g;", "it", "", "a", "(LQ4/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$h */
        static final class h extends C17544u implements C17642l<Q4.g, Object> {

            /* renamed from: c  reason: collision with root package name */
            public static final h f44288c = new h();

            h() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(Q4.g gVar) {
                C17542s.j(gVar, "it");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/g;", "db", "", "a", "(LQ4/g;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$a$i */
        static final class i extends C17544u implements C17642l<Q4.g, Integer> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f44289c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f44290d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ContentValues f44291e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f44292f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Object[] f44293g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            i(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f44289c = str;
                this.f44290d = i10;
                this.f44291e = contentValues;
                this.f44292f = str2;
                this.f44293g = objArr;
            }

            /* renamed from: a */
            public final Integer invoke(Q4.g gVar) {
                C17542s.j(gVar, "db");
                return Integer.valueOf(gVar.l2(this.f44289c, this.f44290d, this.f44291e, this.f44292f, this.f44293g));
            }
        }

        public a(C7006c cVar) {
            C17542s.j(cVar, "autoCloser");
            this.f44277a = cVar;
        }

        public void J0() {
            if (this.f44277a.h() != null) {
                try {
                    Q4.g h10 = this.f44277a.h();
                    C17542s.g(h10);
                    h10.J0();
                } finally {
                    this.f44277a.e();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
        }

        public k M1(String str) {
            C17542s.j(str, "sql");
            return new b(str, this.f44277a);
        }

        public boolean N2() {
            if (this.f44277a.h() == null) {
                return false;
            }
            return ((Boolean) this.f44277a.g(C0756d.f44282a)).booleanValue();
        }

        public void P() {
            try {
                this.f44277a.j().P();
            } catch (Throwable th2) {
                this.f44277a.e();
                throw th2;
            }
        }

        public List<Pair<String, String>> R() {
            return (List) this.f44277a.g(C0755a.f44278c);
        }

        public void T(String str) {
            C17542s.j(str, "sql");
            this.f44277a.g(new b(str));
        }

        public boolean a3() {
            return ((Boolean) this.f44277a.g(f.f44286c)).booleanValue();
        }

        public final void c() {
            this.f44277a.g(h.f44288c);
        }

        public void close() {
            this.f44277a.d();
        }

        public boolean isOpen() {
            Q4.g h10 = this.f44277a.h();
            if (h10 == null) {
                return false;
            }
            return h10.isOpen();
        }

        public int l2(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
            C17542s.j(str, "table");
            C17542s.j(contentValues, "values");
            return ((Number) this.f44277a.g(new i(str, i10, contentValues, str2, objArr))).intValue();
        }

        public Cursor l3(j jVar) {
            C17542s.j(jVar, "query");
            try {
                return new c(this.f44277a.j().l3(jVar), this.f44277a);
            } catch (Throwable th2) {
                this.f44277a.e();
                throw th2;
            }
        }

        public String m() {
            return (String) this.f44277a.g(g.f44287c);
        }

        public Cursor s1(j jVar, CancellationSignal cancellationSignal) {
            C17542s.j(jVar, "query");
            try {
                return new c(this.f44277a.j().s1(jVar, cancellationSignal), this.f44277a);
            } catch (Throwable th2) {
                this.f44277a.e();
                throw th2;
            }
        }

        public Cursor u2(String str) {
            C17542s.j(str, "query");
            try {
                return new c(this.f44277a.j().u2(str), this.f44277a);
            } catch (Throwable th2) {
                this.f44277a.e();
                throw th2;
            }
        }

        public void v0() {
            C16807N n10;
            Q4.g h10 = this.f44277a.h();
            if (h10 != null) {
                h10.v0();
                n10 = C16807N.f139792a;
            } else {
                n10 = null;
            }
            if (n10 == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        public void w0(String str, Object[] objArr) {
            C17542s.j(str, "sql");
            C17542s.j(objArr, "bindArgs");
            this.f44277a.g(new c(str, objArr));
        }

        public void x0() {
            try {
                this.f44277a.j().x0();
            } catch (Throwable th2) {
                this.f44277a.e();
                throw th2;
            }
        }

        public long x2(String str, int i10, ContentValues contentValues) {
            C17542s.j(str, "table");
            C17542s.j(contentValues, "values");
            return ((Number) this.f44277a.g(new e(str, i10, contentValues))).longValue();
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R(\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00130/j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013`08\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Landroidx/room/d$b;", "LQ4/k;", "", "sql", "Landroidx/room/c;", "autoCloser", "<init>", "(Ljava/lang/String;Landroidx/room/c;)V", "T", "Lkotlin/Function1;", "block", "f", "(LnI/l;)Ljava/lang/Object;", "supportSQLiteStatement", "LXH/N;", "e", "(LQ4/k;)V", "", "bindIndex", "", "value", "g", "(ILjava/lang/Object;)V", "close", "()V", "b0", "()I", "", "v1", "()J", "index", "I2", "(I)V", "i2", "(IJ)V", "", "g0", "(ID)V", "H", "(ILjava/lang/String;)V", "", "o2", "(I[B)V", "a", "Ljava/lang/String;", "b", "Landroidx/room/c;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "binds", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.d$b */
    private static final class b implements k {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f44294a;

        /* renamed from: b  reason: collision with root package name */
        private final C7006c f44295b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<Object> f44296c = new ArrayList<>();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/k;", "obj", "", "a", "(LQ4/k;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$b$a */
        static final class a extends C17544u implements C17642l<k, Long> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f44297c = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final Long invoke(k kVar) {
                C17542s.j(kVar, "obj");
                return Long.valueOf(kVar.v1());
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQ4/g;", "db", "a", "(LQ4/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$b$b  reason: collision with other inner class name */
        static final class C0757b extends C17544u implements C17642l<g, T> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f44298c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<k, T> f44299d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0757b(b bVar, C17642l<? super k, ? extends T> lVar) {
                super(1);
                this.f44298c = bVar;
                this.f44299d = lVar;
            }

            /* renamed from: a */
            public final T invoke(g gVar) {
                C17542s.j(gVar, "db");
                k M12 = gVar.M1(this.f44298c.f44294a);
                this.f44298c.e(M12);
                return this.f44299d.invoke(M12);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ4/k;", "obj", "", "a", "(LQ4/k;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.d$b$c */
        static final class c extends C17544u implements C17642l<k, Integer> {

            /* renamed from: c  reason: collision with root package name */
            public static final c f44300c = new c();

            c() {
                super(1);
            }

            /* renamed from: a */
            public final Integer invoke(k kVar) {
                C17542s.j(kVar, "obj");
                return Integer.valueOf(kVar.b0());
            }
        }

        public b(String str, C7006c cVar) {
            C17542s.j(str, "sql");
            C17542s.j(cVar, "autoCloser");
            this.f44294a = str;
            this.f44295b = cVar;
        }

        /* access modifiers changed from: private */
        public final void e(k kVar) {
            Iterator<T> it = this.f44296c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                Object obj = this.f44296c.get(i10);
                if (obj == null) {
                    kVar.I2(i11);
                } else if (obj instanceof Long) {
                    kVar.i2(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.g0(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.H(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.o2(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final <T> T f(C17642l<? super k, ? extends T> lVar) {
            return this.f44295b.g(new C0757b(this, lVar));
        }

        private final void g(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f44296c.size() && (size = this.f44296c.size()) <= i11) {
                while (true) {
                    this.f44296c.add((Object) null);
                    if (size == i11) {
                        break;
                    }
                    size++;
                }
            }
            this.f44296c.set(i11, obj);
        }

        public void H(int i10, String str) {
            C17542s.j(str, "value");
            g(i10, str);
        }

        public void I2(int i10) {
            g(i10, (Object) null);
        }

        public int b0() {
            return ((Number) f(c.f44300c)).intValue();
        }

        public void close() {
        }

        public void g0(int i10, double d10) {
            g(i10, Double.valueOf(d10));
        }

        public void i2(int i10, long j10) {
            g(i10, Long.valueOf(j10));
        }

        public void o2(int i10, byte[] bArr) {
            C17542s.j(bArr, "value");
            g(i10, bArr);
        }

        public long v1() {
            return ((Number) f(a.f44297c)).longValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\n \n*\u0004\u0018\u00010\u00110\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u00160\u0016H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u00160\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u0018J \u0010\u001a\u001a\n \n*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001d\u001a(\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00160\u0016 \n*\u0014\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u001c0\u001cH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u0018\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\n \n*\u0004\u0018\u00010#0#H\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007H\u0001¢\u0006\u0004\b.\u0010\u0015J\u0018\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b0\u00101J \u00102\u001a\n \n*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b2\u0010\u001bJ\u0018\u00103\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b3\u0010*J\u0010\u00105\u001a\u000204H\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000204H\u0001¢\u0006\u0004\b7\u00106J\u0010\u00108\u001a\u000204H\u0001¢\u0006\u0004\b8\u00106J\u0010\u00109\u001a\u000204H\u0001¢\u0006\u0004\b9\u00106J\u0010\u0010:\u001a\u000204H\u0001¢\u0006\u0004\b:\u00106J\u0010\u0010;\u001a\u000204H\u0001¢\u0006\u0004\b;\u00106J\u0018\u0010<\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b>\u0010=J\u0010\u0010?\u001a\u000204H\u0001¢\u0006\u0004\b?\u00106J\u0010\u0010@\u001a\u000204H\u0001¢\u0006\u0004\b@\u00106J\u0010\u0010A\u001a\u000204H\u0001¢\u0006\u0004\bA\u00106J\u0018\u0010B\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\bB\u0010=J\u0010\u0010C\u001a\u000204H\u0001¢\u0006\u0004\bC\u00106J \u0010E\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010D0DH\u0001¢\u0006\u0004\bE\u0010FJ \u0010H\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010G0GH\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u000204H\u0001¢\u0006\u0004\bJ\u00106J(\u0010K\u001a\n \n*\u0004\u0018\u00010#0#2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010#0#H\u0001¢\u0006\u0004\bK\u0010LJ0\u0010O\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010M0M2\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010N0NH\u0001¢\u0006\u0004\bO\u0010PJ \u0010Q\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010D0DH\u0001¢\u0006\u0004\bQ\u0010FJ \u0010R\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010G0GH\u0001¢\u0006\u0004\bR\u0010IJ\u000f\u0010S\u001a\u00020\fH\u0016¢\u0006\u0004\bS\u0010\u0010J%\u0010W\u001a\u00020\f2\u0006\u0010T\u001a\u00020M2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020N0UH\u0017¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020NH\u0017¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\b\u0012\u0004\u0012\u00020N0UH\u0017¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\f2\u0006\u0010]\u001a\u00020#H\u0017¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006d"}, d2 = {"Landroidx/room/d$c;", "Landroid/database/Cursor;", "delegate", "Landroidx/room/c;", "autoCloser", "<init>", "(Landroid/database/Cursor;Landroidx/room/c;)V", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "LXH/N;", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "deactivate", "()V", "", "getBlob", "(I)[B", "getColumnCount", "()I", "", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "(I)D", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "", "getFloat", "(I)F", "getInt", "(I)I", "", "getLong", "(I)J", "getPosition", "", "getShort", "(I)S", "getString", "getType", "", "getWantsAllOnMoveCalls", "()Z", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "(I)Z", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "requery", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "unregisterContentObserver", "unregisterDataSetObserver", "close", "cr", "", "uris", "setNotificationUris", "(Landroid/content/ContentResolver;Ljava/util/List;)V", "getNotificationUri", "()Landroid/net/Uri;", "getNotificationUris", "()Ljava/util/List;", "extras", "setExtras", "(Landroid/os/Bundle;)V", "a", "Landroid/database/Cursor;", "b", "Landroidx/room/c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.d$c */
    private static final class c implements Cursor {

        /* renamed from: a  reason: collision with root package name */
        private final Cursor f44301a;

        /* renamed from: b  reason: collision with root package name */
        private final C7006c f44302b;

        public c(Cursor cursor, C7006c cVar) {
            C17542s.j(cursor, "delegate");
            C17542s.j(cVar, "autoCloser");
            this.f44301a = cursor;
            this.f44302b = cVar;
        }

        public void close() {
            this.f44301a.close();
            this.f44302b.e();
        }

        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f44301a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @C16814e
        public void deactivate() {
            this.f44301a.deactivate();
        }

        public byte[] getBlob(int i10) {
            return this.f44301a.getBlob(i10);
        }

        public int getColumnCount() {
            return this.f44301a.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f44301a.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) {
            return this.f44301a.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i10) {
            return this.f44301a.getColumnName(i10);
        }

        public String[] getColumnNames() {
            return this.f44301a.getColumnNames();
        }

        public int getCount() {
            return this.f44301a.getCount();
        }

        public double getDouble(int i10) {
            return this.f44301a.getDouble(i10);
        }

        public Bundle getExtras() {
            return this.f44301a.getExtras();
        }

        public float getFloat(int i10) {
            return this.f44301a.getFloat(i10);
        }

        public int getInt(int i10) {
            return this.f44301a.getInt(i10);
        }

        public long getLong(int i10) {
            return this.f44301a.getLong(i10);
        }

        public Uri getNotificationUri() {
            return Q4.c.a(this.f44301a);
        }

        public List<Uri> getNotificationUris() {
            return f.a(this.f44301a);
        }

        public int getPosition() {
            return this.f44301a.getPosition();
        }

        public short getShort(int i10) {
            return this.f44301a.getShort(i10);
        }

        public String getString(int i10) {
            return this.f44301a.getString(i10);
        }

        public int getType(int i10) {
            return this.f44301a.getType(i10);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f44301a.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f44301a.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f44301a.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f44301a.isClosed();
        }

        public boolean isFirst() {
            return this.f44301a.isFirst();
        }

        public boolean isLast() {
            return this.f44301a.isLast();
        }

        public boolean isNull(int i10) {
            return this.f44301a.isNull(i10);
        }

        public boolean move(int i10) {
            return this.f44301a.move(i10);
        }

        public boolean moveToFirst() {
            return this.f44301a.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f44301a.moveToLast();
        }

        public boolean moveToNext() {
            return this.f44301a.moveToNext();
        }

        public boolean moveToPosition(int i10) {
            return this.f44301a.moveToPosition(i10);
        }

        public boolean moveToPrevious() {
            return this.f44301a.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f44301a.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f44301a.registerDataSetObserver(dataSetObserver);
        }

        @C16814e
        public boolean requery() {
            return this.f44301a.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f44301a.respond(bundle);
        }

        public void setExtras(Bundle bundle) {
            C17542s.j(bundle, "extras");
            e.a(this.f44301a, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f44301a.setNotificationUri(contentResolver, uri);
        }

        public void setNotificationUris(ContentResolver contentResolver, List<? extends Uri> list) {
            C17542s.j(contentResolver, "cr");
            C17542s.j(list, "uris");
            f.b(this.f44301a, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f44301a.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f44301a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C7007d(h hVar, C7006c cVar) {
        C17542s.j(hVar, "delegate");
        C17542s.j(cVar, "autoCloser");
        this.f44274a = hVar;
        this.f44275b = cVar;
        cVar.k(c());
        this.f44276c = new a(cVar);
    }

    public h c() {
        return this.f44274a;
    }

    public void close() {
        this.f44276c.close();
    }

    public String getDatabaseName() {
        return this.f44274a.getDatabaseName();
    }

    public g getWritableDatabase() {
        this.f44276c.c();
        return this.f44276c;
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f44274a.setWriteAheadLoggingEnabled(z10);
    }
}
