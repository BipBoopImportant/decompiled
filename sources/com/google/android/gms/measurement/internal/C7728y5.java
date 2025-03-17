package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.f;
import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.C7282e1;
import com.google.android.gms.internal.measurement.C7297f7;
import com.google.android.gms.internal.measurement.C7319i2;
import com.google.android.gms.internal.measurement.C7335k0;
import com.google.android.gms.internal.measurement.C7388q2;
import com.google.android.gms.internal.measurement.C7427v2;
import com.google.android.gms.internal.measurement.C7443x2;
import com.google.android.gms.internal.measurement.C7459z2;
import com.google.android.gms.internal.measurement.E2;
import com.google.android.gms.internal.measurement.F2;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.U4;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.measurement.internal.C7671q3;
import j0.C5445a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sa.E;
import sa.X;
import sa.Y;
import sa.k0;

/* renamed from: com.google.android.gms.measurement.internal.y5  reason: case insensitive filesystem */
public class C7728y5 implements C7657o3 {

    /* renamed from: K  reason: collision with root package name */
    private static volatile C7728y5 f50491K;

    /* renamed from: A  reason: collision with root package name */
    private long f50492A;

    /* renamed from: B  reason: collision with root package name */
    private final Map<String, C7671q3> f50493B;

    /* renamed from: C  reason: collision with root package name */
    private final Map<String, C> f50494C;

    /* renamed from: D  reason: collision with root package name */
    private final Map<String, c> f50495D;

    /* renamed from: E  reason: collision with root package name */
    private final Map<String, b> f50496E;

    /* renamed from: F  reason: collision with root package name */
    private C7630k4 f50497F;

    /* renamed from: G  reason: collision with root package name */
    private String f50498G;

    /* renamed from: H  reason: collision with root package name */
    private A f50499H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public long f50500I;

    /* renamed from: J  reason: collision with root package name */
    private final S5 f50501J;

    /* renamed from: a  reason: collision with root package name */
    private C2 f50502a;

    /* renamed from: b  reason: collision with root package name */
    private C7649n2 f50503b;

    /* renamed from: c  reason: collision with root package name */
    private C7660p f50504c;

    /* renamed from: d  reason: collision with root package name */
    private C7670q2 f50505d;

    /* renamed from: e  reason: collision with root package name */
    private C7659o5 f50506e;

    /* renamed from: f  reason: collision with root package name */
    private Y5 f50507f;

    /* renamed from: g  reason: collision with root package name */
    private final N5 f50508g;

    /* renamed from: h  reason: collision with root package name */
    private C7623j4 f50509h;

    /* renamed from: i  reason: collision with root package name */
    private Y4 f50510i;

    /* renamed from: j  reason: collision with root package name */
    private final C7714w5 f50511j;

    /* renamed from: k  reason: collision with root package name */
    private A2 f50512k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final P2 f50513l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f50514m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f50515n;

    /* renamed from: o  reason: collision with root package name */
    private long f50516o;

    /* renamed from: p  reason: collision with root package name */
    private List<Runnable> f50517p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Deque<String> f50518q;

    /* renamed from: r  reason: collision with root package name */
    private int f50519r;

    /* renamed from: s  reason: collision with root package name */
    private int f50520s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f50521t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f50522u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f50523v;

    /* renamed from: w  reason: collision with root package name */
    private FileLock f50524w;

    /* renamed from: x  reason: collision with root package name */
    private FileChannel f50525x;

    /* renamed from: y  reason: collision with root package name */
    private List<Long> f50526y;

    /* renamed from: z  reason: collision with root package name */
    private List<Long> f50527z;

    /* renamed from: com.google.android.gms.measurement.internal.y5$a */
    private class a implements C7680s {

        /* renamed from: a  reason: collision with root package name */
        A2 f50528a;

        /* renamed from: b  reason: collision with root package name */
        List<Long> f50529b;

        /* renamed from: c  reason: collision with root package name */
        List<C7427v2> f50530c;

        /* renamed from: d  reason: collision with root package name */
        private long f50531d;

        private static long c(C7427v2 v2Var) {
            return ((v2Var.U() / 1000) / 60) / 60;
        }

        public final void a(A2 a22) {
            C6620s.l(a22);
            this.f50528a = a22;
        }

        public final boolean b(long j10, C7427v2 v2Var) {
            C6620s.l(v2Var);
            if (this.f50530c == null) {
                this.f50530c = new ArrayList();
            }
            if (this.f50529b == null) {
                this.f50529b = new ArrayList();
            }
            if (!this.f50530c.isEmpty() && c(this.f50530c.get(0)) != c(v2Var)) {
                return false;
            }
            long a10 = this.f50531d + ((long) v2Var.a());
            C7728y5.this.r0();
            if (a10 >= ((long) Math.max(0, K.f49766j.a(null).intValue()))) {
                return false;
            }
            this.f50531d = a10;
            this.f50530c.add(v2Var);
            this.f50529b.add(Long.valueOf(j10));
            int size = this.f50530c.size();
            C7728y5.this.r0();
            return size < Math.max(1, K.f49768k.a(null).intValue());
        }

        private a() {
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.y5$b */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final C7728y5 f50533a;

        /* renamed from: b  reason: collision with root package name */
        private int f50534b = 1;

        /* renamed from: c  reason: collision with root package name */
        private long f50535c = c();

        public b(C7728y5 y5Var) {
            this.f50533a = y5Var;
        }

        private final long c() {
            C6620s.l(this.f50533a);
            long longValue = K.f49788u.a(null).longValue();
            long longValue2 = K.f49790v.a(null).longValue();
            for (int i10 = 1; i10 < this.f50534b; i10++) {
                longValue <<= 1;
                if (longValue >= longValue2) {
                    break;
                }
            }
            return this.f50533a.zzb().a() + Math.min(longValue, longValue2);
        }

        public final void a() {
            this.f50534b++;
            this.f50535c = c();
        }

        public final boolean b() {
            return this.f50533a.zzb().a() >= this.f50535c;
        }
    }

    private C7728y5(K5 k52) {
        this(k52, (P2) null);
    }

    private static Boolean A0(E5 e52) {
        Boolean bool = e52.f49612q;
        if (TextUtils.isEmpty(e52.f49593E)) {
            return bool;
        }
        int i10 = J5.f49689a[C7730z0.a(e52.f49593E).b().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return Boolean.FALSE;
            }
            if (i10 == 3) {
                return Boolean.TRUE;
            }
            if (i10 != 4) {
                return bool;
            }
        }
        return null;
    }

    private static boolean C0(E5 e52) {
        return !TextUtils.isEmpty(e52.f49597b) || !TextUtils.isEmpty(e52.f49611p);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011a A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128 A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014e A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0152 A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(java.lang.String r6, int r7, java.lang.Throwable r8, byte[] r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10) {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.J2 r0 = r5.q()
            r0.k()
            r5.L0()
            K9.C6620s.f(r6)
            r0 = 0
            if (r9 != 0) goto L_0x0016
            byte[] r9 = new byte[r0]     // Catch:{ all -> 0x0013 }
            goto L_0x0016
        L_0x0013:
            r6 = move-exception
            goto L_0x019d
        L_0x0016:
            com.google.android.gms.measurement.internal.h2 r1 = r5.f()     // Catch:{ all -> 0x0013 }
            com.google.android.gms.measurement.internal.i2 r1 = r1.I()     // Catch:{ all -> 0x0013 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r9.length     // Catch:{ all -> 0x0013 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0013 }
            r1.b(r2, r3)     // Catch:{ all -> 0x0013 }
            com.google.android.gms.measurement.internal.p r1 = r5.u0()     // Catch:{ all -> 0x0013 }
            r1.l1()     // Catch:{ all -> 0x0013 }
            com.google.android.gms.measurement.internal.p r1 = r5.u0()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.r2 r1 = r1.S0(r6)     // Catch:{ all -> 0x005d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            if (r7 == r2) goto L_0x0043
            r2 = 204(0xcc, float:2.86E-43)
            if (r7 == r2) goto L_0x0043
            if (r7 != r3) goto L_0x0047
        L_0x0043:
            if (r8 != 0) goto L_0x0047
            r2 = 1
            goto L_0x0048
        L_0x0047:
            r2 = r0
        L_0x0048:
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.h2 r7 = r5.f()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.i2 r7 = r7.J()     // Catch:{ all -> 0x005d }
            java.lang.String r8 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7607h2.t(r6)     // Catch:{ all -> 0x005d }
            r7.b(r8, r6)     // Catch:{ all -> 0x005d }
            goto L_0x0181
        L_0x005d:
            r6 = move-exception
            goto L_0x0195
        L_0x0060:
            r4 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00bc
            if (r7 != r4) goto L_0x0067
            goto L_0x00bc
        L_0x0067:
            com.google.android.gms.common.util.e r9 = r5.zzb()     // Catch:{ all -> 0x005d }
            long r9 = r9.a()     // Catch:{ all -> 0x005d }
            r1.t0(r9)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.p r9 = r5.u0()     // Catch:{ all -> 0x005d }
            r9.X(r1, r0, r0)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.h2 r9 = r5.f()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.i2 r9 = r9.I()     // Catch:{ all -> 0x005d }
            java.lang.String r10 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x005d }
            r9.c(r10, r1, r8)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.C2 r8 = r5.B0()     // Catch:{ all -> 0x005d }
            r8.T(r6)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.Y4 r6 = r5.f50510i     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.x2 r6 = r6.f50015i     // Catch:{ all -> 0x005d }
            com.google.android.gms.common.util.e r8 = r5.zzb()     // Catch:{ all -> 0x005d }
            long r8 = r8.a()     // Catch:{ all -> 0x005d }
            r6.b(r8)     // Catch:{ all -> 0x005d }
            r6 = 503(0x1f7, float:7.05E-43)
            if (r7 == r6) goto L_0x00a8
            r6 = 429(0x1ad, float:6.01E-43)
            if (r7 != r6) goto L_0x00b7
        L_0x00a8:
            com.google.android.gms.measurement.internal.Y4 r6 = r5.f50510i     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.x2 r6 = r6.f50013g     // Catch:{ all -> 0x005d }
            com.google.android.gms.common.util.e r7 = r5.zzb()     // Catch:{ all -> 0x005d }
            long r7 = r7.a()     // Catch:{ all -> 0x005d }
            r6.b(r7)     // Catch:{ all -> 0x005d }
        L_0x00b7:
            r5.Y()     // Catch:{ all -> 0x005d }
            goto L_0x0181
        L_0x00bc:
            java.lang.String r8 = "Last-Modified"
            java.lang.String r8 = n(r10, r8)     // Catch:{ all -> 0x005d }
            java.lang.String r2 = "ETag"
            java.lang.String r10 = n(r10, r2)     // Catch:{ all -> 0x005d }
            if (r7 == r4) goto L_0x00e4
            if (r7 != r3) goto L_0x00cd
            goto L_0x00e4
        L_0x00cd:
            com.google.android.gms.measurement.internal.C2 r2 = r5.B0()     // Catch:{ all -> 0x005d }
            boolean r8 = r2.F(r6, r9, r8, r10)     // Catch:{ all -> 0x005d }
            if (r8 != 0) goto L_0x0106
            com.google.android.gms.measurement.internal.p r6 = r5.u0()     // Catch:{ all -> 0x0013 }
            r6.o1()     // Catch:{ all -> 0x0013 }
            r5.f50521t = r0
            r5.V()
            return
        L_0x00e4:
            com.google.android.gms.measurement.internal.C2 r8 = r5.B0()     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.measurement.i2 r8 = r8.K(r6)     // Catch:{ all -> 0x005d }
            if (r8 != 0) goto L_0x0106
            com.google.android.gms.measurement.internal.C2 r8 = r5.B0()     // Catch:{ all -> 0x005d }
            r10 = 0
            boolean r8 = r8.F(r6, r10, r10, r10)     // Catch:{ all -> 0x005d }
            if (r8 != 0) goto L_0x0106
            com.google.android.gms.measurement.internal.p r6 = r5.u0()     // Catch:{ all -> 0x0013 }
            r6.o1()     // Catch:{ all -> 0x0013 }
            r5.f50521t = r0
            r5.V()
            return
        L_0x0106:
            com.google.android.gms.common.util.e r8 = r5.zzb()     // Catch:{ all -> 0x005d }
            long r2 = r8.a()     // Catch:{ all -> 0x005d }
            r1.S(r2)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.p r8 = r5.u0()     // Catch:{ all -> 0x005d }
            r8.X(r1, r0, r0)     // Catch:{ all -> 0x005d }
            if (r7 != r4) goto L_0x0128
            com.google.android.gms.measurement.internal.h2 r7 = r5.f()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.i2 r7 = r7.K()     // Catch:{ all -> 0x005d }
            java.lang.String r8 = "Config not found. Using empty config. appId"
            r7.b(r8, r6)     // Catch:{ all -> 0x005d }
            goto L_0x013e
        L_0x0128:
            com.google.android.gms.measurement.internal.h2 r6 = r5.f()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.i2 r6 = r6.I()     // Catch:{ all -> 0x005d }
            java.lang.String r8 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x005d }
            int r9 = r9.length     // Catch:{ all -> 0x005d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x005d }
            r6.c(r8, r7, r9)     // Catch:{ all -> 0x005d }
        L_0x013e:
            com.google.android.gms.measurement.internal.n2 r6 = r5.z0()     // Catch:{ all -> 0x005d }
            boolean r6 = r6.z()     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x0152
            boolean r6 = r5.Z()     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x0152
            r5.P0()     // Catch:{ all -> 0x005d }
            goto L_0x0181
        L_0x0152:
            com.google.android.gms.measurement.internal.i r6 = r5.r0()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.K.f49707I0     // Catch:{ all -> 0x005d }
            boolean r6 = r6.r(r7)     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x017e
            com.google.android.gms.measurement.internal.n2 r6 = r5.z0()     // Catch:{ all -> 0x005d }
            boolean r6 = r6.z()     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x017e
            com.google.android.gms.measurement.internal.p r6 = r5.u0()     // Catch:{ all -> 0x005d }
            java.lang.String r7 = r1.l()     // Catch:{ all -> 0x005d }
            boolean r6 = r6.m1(r7)     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x017e
            java.lang.String r6 = r1.l()     // Catch:{ all -> 0x005d }
            r5.t0(r6)     // Catch:{ all -> 0x005d }
            goto L_0x0181
        L_0x017e:
            r5.Y()     // Catch:{ all -> 0x005d }
        L_0x0181:
            com.google.android.gms.measurement.internal.p r6 = r5.u0()     // Catch:{ all -> 0x005d }
            r6.q1()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.p r6 = r5.u0()     // Catch:{ all -> 0x0013 }
            r6.o1()     // Catch:{ all -> 0x0013 }
            r5.f50521t = r0
            r5.V()
            return
        L_0x0195:
            com.google.android.gms.measurement.internal.p r7 = r5.u0()     // Catch:{ all -> 0x0013 }
            r7.o1()     // Catch:{ all -> 0x0013 }
            throw r6     // Catch:{ all -> 0x0013 }
        L_0x019d:
            r5.f50521t = r0
            r5.V()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7728y5.E(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    private final void F(String str, long j10) {
        boolean z10;
        boolean z11;
        String str2;
        String str3;
        C7735z5 z5Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        List<Pair<A2, Long>> list;
        E2 b10;
        boolean z15;
        String str4;
        String str5 = str;
        long j11 = j10;
        List<Pair<A2, Long>> R10 = u0().R(str5, r0().w(str5, K.f49762h), Math.max(0, r0().w(str5, K.f49764i)));
        if (!R10.isEmpty()) {
            if (b0(str).w()) {
                Iterator<Pair<A2, Long>> it = R10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str4 = null;
                        break;
                    }
                    A2 a22 = (A2) it.next().first;
                    if (!a22.n0().isEmpty()) {
                        str4 = a22.n0();
                        break;
                    }
                }
                if (str4 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= R10.size()) {
                            break;
                        }
                        A2 a23 = (A2) R10.get(i11).first;
                        if (!a23.n0().isEmpty() && !a23.n0().equals(str4)) {
                            R10 = R10.subList(0, i11);
                            break;
                        }
                        i11++;
                    }
                }
            }
            C7459z2.b P10 = C7459z2.P();
            int size = R10.size();
            ArrayList arrayList = new ArrayList(R10.size());
            boolean z16 = r0().N(str5) && b0(str).w();
            boolean w10 = b0(str).w();
            boolean x10 = b0(str).x();
            boolean z17 = n7.a() && r0().F(str5, K.f49705H0);
            C7735z5 s10 = this.f50511j.s(str5);
            int i12 = 0;
            while (i12 < size) {
                A2.a aVar = (A2.a) ((A2) R10.get(i12).first).A();
                arrayList.add((Long) R10.get(i12).second);
                r0();
                int i13 = i12;
                aVar.e1(114010).b1(j11).q0(false);
                if (!z16) {
                    aVar.U0();
                }
                if (!z11) {
                    aVar.m1();
                    aVar.g1();
                }
                if (!z10) {
                    aVar.G0();
                }
                H(str5, aVar);
                if (!z17) {
                    aVar.p1();
                }
                if (!z10) {
                    aVar.K0();
                }
                String S10 = aVar.S();
                if (TextUtils.isEmpty(S10) || S10.equals("00000000-0000-0000-0000-000000000000")) {
                    ArrayList arrayList2 = new ArrayList(aVar.T());
                    Iterator it2 = arrayList2.iterator();
                    list = R10;
                    i10 = size;
                    Long l10 = null;
                    Long l11 = null;
                    boolean z18 = false;
                    boolean z19 = false;
                    while (it2.hasNext()) {
                        boolean z20 = z16;
                        C7427v2 v2Var = (C7427v2) it2.next();
                        boolean z21 = z11;
                        boolean z22 = z10;
                        if ("_fx".equals(v2Var.X())) {
                            it2.remove();
                            z11 = z21;
                            z15 = z20;
                            z10 = z22;
                            z18 = true;
                            z19 = true;
                        } else {
                            if ("_f".equals(v2Var.X())) {
                                H0();
                                C7443x2 D10 = N5.D(v2Var, "_pfo");
                                if (D10 != null) {
                                    l10 = Long.valueOf(D10.V());
                                }
                                H0();
                                C7443x2 D11 = N5.D(v2Var, "_uwa");
                                if (D11 != null) {
                                    l11 = Long.valueOf(D11.V());
                                }
                                z19 = true;
                            }
                            z11 = z21;
                            z15 = z20;
                            z10 = z22;
                        }
                    }
                    z13 = z16;
                    z14 = z11;
                    z12 = z10;
                    if (z18) {
                        aVar.Z0();
                        aVar.c0(arrayList2);
                    }
                    if (z19) {
                        M(aVar.u1(), true, l10, l11);
                    }
                } else {
                    list = R10;
                    i10 = size;
                    z13 = z16;
                    z14 = z11;
                    z12 = z10;
                }
                if (aVar.f0() != 0) {
                    if (r0().F(str5, K.f49795x0)) {
                        aVar.b0(H0().y(((A2) ((L4) aVar.s())).l()));
                    }
                    if (r0().r(K.f49711K0) && (b10 = s10.b()) != null) {
                        aVar.M(b10);
                    }
                    P10.C(aVar);
                }
                i12 = i13 + 1;
                R10 = list;
                size = i10;
                w10 = z14;
                z16 = z13;
                x10 = z12;
            }
            if (P10.z() == 0) {
                N(arrayList);
                P(false, 204, (Throwable) null, (byte[]) null, str, Collections.emptyList());
                return;
            }
            C7459z2 z2Var = (C7459z2) ((L4) P10.s());
            ArrayList arrayList3 = new ArrayList();
            boolean z23 = r0().r(K.f49711K0) && s10.a() == X.SGTM_CLIENT;
            if (s10.a() == X.SGTM || z23) {
                Iterator<A2> it3 = ((C7459z2) ((L4) P10.s())).V().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (it3.next().R0()) {
                            str3 = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        str3 = null;
                        break;
                    }
                }
                C7459z2 z2Var2 = (C7459z2) ((L4) P10.s());
                q().k();
                L0();
                C7459z2.b J10 = C7459z2.J(z2Var2);
                if (!TextUtils.isEmpty(str3)) {
                    J10.E(str3);
                }
                String Q10 = B0().Q(str5);
                if (!TextUtils.isEmpty(Q10)) {
                    J10.I(Q10);
                }
                ArrayList arrayList4 = new ArrayList();
                for (A2 L10 : z2Var2.V()) {
                    A2.a L11 = A2.L(L10);
                    L11.U0();
                    arrayList4.add((A2) ((L4) L11.s()));
                }
                J10.H();
                J10.D(arrayList4);
                C7611i r02 = r0();
                Y1<Boolean> y12 = K.f49709J0;
                if (r02.r(y12)) {
                    f().I().b("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", TextUtils.isEmpty(str3) ? "null" : J10.K());
                } else {
                    f().I().a("[sgtm] Processed MeasurementBatch for sGTM.");
                }
                C7459z2 z2Var3 = (C7459z2) ((L4) J10.s());
                if (TextUtils.isEmpty(str3) || !r0().r(y12)) {
                    str2 = null;
                } else {
                    q().k();
                    L0();
                    C7459z2.b P11 = C7459z2.P();
                    f().I().b("Processing Google Signal, sgtmJoinId:", str3);
                    P11.E(str3);
                    for (A2 next : ((C7459z2) ((L4) P10.s())).V()) {
                        P11.C(A2.H2().T0(next.i0()).C0(next.s1()));
                    }
                    C7459z2 z2Var4 = (C7459z2) ((L4) P11.s());
                    String Q11 = this.f50511j.o().Q(str5);
                    if (!TextUtils.isEmpty(Q11)) {
                        Uri parse = Uri.parse(K.f49784s.a(null));
                        Uri.Builder buildUpon = parse.buildUpon();
                        buildUpon.authority(Q11 + "." + parse.getAuthority());
                        z5Var = new C7735z5(buildUpon.build().toString(), z23 ? X.GOOGLE_SIGNAL_PENDING : X.GOOGLE_SIGNAL);
                        str2 = null;
                    } else {
                        str2 = null;
                        z5Var = new C7735z5(K.f49784s.a(null), z23 ? X.GOOGLE_SIGNAL_PENDING : X.GOOGLE_SIGNAL);
                    }
                    arrayList3.add(Pair.create(z2Var4, z5Var));
                }
                if (z23) {
                    C7459z2.b bVar = (C7459z2.b) z2Var3.A();
                    for (int i14 = 0; i14 < z2Var3.m(); i14++) {
                        bVar.A(i14, ((A2.a) z2Var3.K(i14).A()).t1().G(j11));
                    }
                    arrayList3.add(Pair.create((C7459z2) ((L4) bVar.s()), s10));
                    N(arrayList);
                    P(false, 204, (Throwable) null, (byte[]) null, str, arrayList3);
                    if (w0(s10.c())) {
                        f().I().b("[sgtm] Sending sgtm batches available notification to app", str5);
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str5);
                        this.f50513l.zza().sendBroadcast(intent);
                        return;
                    }
                    return;
                }
                z2Var = z2Var3;
            } else {
                str2 = null;
            }
            String K10 = f().A(2) ? H0().K(z2Var) : str2;
            H0();
            byte[] l12 = z2Var.l();
            N(arrayList);
            this.f50510i.f50015i.b(j11);
            f().I().d("Uploading data. app, uncompressed size, data", str5, Integer.valueOf(l12.length), K10);
            this.f50522u = true;
            z0().w(str5, s10, z2Var, new D5(this, str5, arrayList3));
        }
    }

    private final void G(String str, C7443x2.a aVar, Bundle bundle, String str2) {
        List b10 = f.b("_o", "_sn", "_sc", "_si");
        long x10 = (long) ((Q5.E0(aVar.N()) || Q5.E0(str)) ? r0().x(str2, true) : r0().o(str2, true));
        long codePointCount = (long) aVar.O().codePointCount(0, aVar.O().length());
        I0();
        String N10 = aVar.N();
        r0();
        String H10 = Q5.H(N10, 40, true);
        if (codePointCount > x10 && !b10.contains(aVar.N())) {
            if ("_ev".equals(aVar.N())) {
                I0();
                bundle.putString("_ev", Q5.H(aVar.O(), r0().x(str2, true), true));
                return;
            }
            f().K().c("Param value is too long; discarded. Name, value length", H10, Long.valueOf(codePointCount));
            if (bundle.getLong("_err") == 0) {
                bundle.putLong("_err", 4);
                if (bundle.getString("_ev") == null) {
                    bundle.putString("_ev", H10);
                    bundle.putLong("_el", codePointCount);
                }
            }
            bundle.remove(aVar.N());
        }
    }

    private final void J(String str, C7671q3 q3Var) {
        q().k();
        L0();
        this.f50493B.put(str, q3Var);
        u0().M0(str, q3Var);
    }

    private final void M(String str, boolean z10, Long l10, Long l11) {
        C7676r2 S02 = u0().S0(str);
        if (S02 != null) {
            S02.U(z10);
            S02.e(l10);
            S02.I(l11);
            if (S02.B()) {
                u0().X(S02, false, false);
            }
        }
    }

    private final void N(List<Long> list) {
        C6620s.a(!list.isEmpty());
        if (this.f50526y != null) {
            f().E().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f50526y = new ArrayList(list);
        }
    }

    private final boolean Q(int i10, FileChannel fileChannel) {
        q().k();
        if (fileChannel == null || !fileChannel.isOpen()) {
            f().E().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i10);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                f().E().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e10) {
            f().E().b("Failed to write to channel", e10);
            return false;
        }
    }

    private final long Q0() {
        long a10 = zzb().a();
        Y4 y42 = this.f50510i;
        y42.s();
        y42.k();
        long a11 = y42.f50016j.a();
        if (a11 == 0) {
            a11 = ((long) y42.h().R0().nextInt(86400000)) + 1;
            y42.f50016j.b(a11);
        }
        return ((((a10 + a11) / 1000) / 60) / 60) / 24;
    }

    private final boolean R(C7427v2.a aVar, C7427v2.a aVar2) {
        C6620s.a("_e".equals(aVar.Q()));
        H0();
        C7443x2 D10 = N5.D((C7427v2) ((L4) aVar.s()), "_sc");
        String str = null;
        String a02 = D10 == null ? null : D10.a0();
        H0();
        C7443x2 D11 = N5.D((C7427v2) ((L4) aVar2.s()), "_pc");
        if (D11 != null) {
            str = D11.a0();
        }
        if (str == null || !str.equals(a02)) {
            return false;
        }
        C6620s.a("_e".equals(aVar.Q()));
        H0();
        C7443x2 D12 = N5.D((C7427v2) ((L4) aVar.s()), "_et");
        if (D12 == null || !D12.e0() || D12.V() <= 0) {
            return true;
        }
        long V10 = D12.V();
        H0();
        C7443x2 D13 = N5.D((C7427v2) ((L4) aVar2.s()), "_et");
        if (D13 != null && D13.V() > 0) {
            V10 += D13.V();
        }
        H0();
        N5.R(aVar2, "_et", Long.valueOf(V10));
        H0();
        N5.R(aVar, "_fr", 1L);
        return true;
    }

    private final A R0() {
        if (this.f50499H == null) {
            this.f50499H = new G5(this, this.f50513l);
        }
        return this.f50499H;
    }

    private final boolean S(String str, String str2) {
        G R02 = u0().R0(str, str2);
        return R02 == null || R02.f49630c < 1;
    }

    private final C7670q2 T() {
        C7670q2 q2Var = this.f50505d;
        if (q2Var != null) {
            return q2Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final C7659o5 U() {
        return (C7659o5) j(this.f50506e);
    }

    private final void V() {
        q().k();
        if (this.f50521t || this.f50522u || this.f50523v) {
            f().I().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f50521t), Boolean.valueOf(this.f50522u), Boolean.valueOf(this.f50523v));
            return;
        }
        f().I().a("Stopping uploading service(s)");
        List<Runnable> list = this.f50517p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) C6620s.l(this.f50517p)).clear();
        }
    }

    private final void W() {
        q().k();
        if (K.f49793w0.a(null).intValue() > 0) {
            X();
            return;
        }
        for (String next : this.f50518q) {
            if (C7297f7.a() && r0().F(next, K.f49723Q0)) {
                f().D().b("Notifying app that trigger URIs are available. App ID", next);
                Intent intent = new Intent();
                intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intent.setPackage(next);
                this.f50513l.zza().sendBroadcast(intent);
            }
        }
        this.f50518q.clear();
    }

    /* access modifiers changed from: private */
    public final void X() {
        q().k();
        if (!this.f50518q.isEmpty() && !R0().e()) {
            long max = Math.max(0, ((long) K.f49793w0.a(null).intValue()) - (zzb().c() - this.f50500I));
            f().I().b("Scheduling notify next app runnable, delay in ms", Long.valueOf(max));
            R0().b(max);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void Y() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.gms.measurement.internal.J2 r1 = r21.q()
            r1.k()
            r21.L0()
            long r1 = r0.f50516o
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004d
            com.google.android.gms.common.util.e r1 = r21.zzb()
            long r1 = r1.c()
            long r5 = r0.f50516o
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.h2 r1 = r21.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.I()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.q2 r1 = r21.T()
            r1.c()
            com.google.android.gms.measurement.internal.o5 r1 = r21.U()
            r1.x()
            return
        L_0x004b:
            r0.f50516o = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.P2 r1 = r0.f50513l
            boolean r1 = r1.s()
            if (r1 == 0) goto L_0x024e
            boolean r1 = r21.Z()
            if (r1 != 0) goto L_0x005d
            goto L_0x024e
        L_0x005d:
            com.google.android.gms.common.util.e r1 = r21.zzb()
            long r1 = r1.a()
            r21.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Long> r5 = com.google.android.gms.measurement.internal.K.f49710K
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.p r5 = r21.u0()
            boolean r5 = r5.r0()
            if (r5 != 0) goto L_0x0090
            com.google.android.gms.measurement.internal.p r5 = r21.u0()
            boolean r5 = r5.s1()
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r5 = 0
            goto L_0x0091
        L_0x0090:
            r5 = 1
        L_0x0091:
            if (r5 == 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.i r10 = r21.r0()
            java.lang.String r10 = r10.R()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bd
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bd
            r21.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Long> r10 = com.google.android.gms.measurement.internal.K.f49700F
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00bd:
            r21.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Long> r10 = com.google.android.gms.measurement.internal.K.f49698E
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00d1:
            r21.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Long> r10 = com.google.android.gms.measurement.internal.K.f49696D
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00e4:
            com.google.android.gms.measurement.internal.Y4 r12 = r0.f50510i
            com.google.android.gms.measurement.internal.x2 r12 = r12.f50014h
            long r12 = r12.a()
            com.google.android.gms.measurement.internal.Y4 r14 = r0.f50510i
            com.google.android.gms.measurement.internal.x2 r14 = r14.f50015i
            long r14 = r14.a()
            com.google.android.gms.measurement.internal.p r16 = r21.u0()
            r17 = r10
            long r9 = r16.x()
            com.google.android.gms.measurement.internal.p r11 = r21.u0()
            r19 = r7
            long r6 = r11.y()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0113
        L_0x0110:
            r10 = r3
            goto L_0x018d
        L_0x0113:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x0139
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0139
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x0139:
            com.google.android.gms.measurement.internal.N5 r5 = r21.H0()
            r12 = r17
            boolean r5 = r5.a0(r8, r12)
            if (r5 != 0) goto L_0x0147
            long r10 = r8 + r12
        L_0x0147:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018d
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x018d
            r5 = 0
        L_0x0150:
            r21.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Integer> r6 = com.google.android.gms.measurement.internal.K.f49714M
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r8 = 0
            int r6 = java.lang.Math.max(r8, r6)
            r9 = 20
            int r6 = java.lang.Math.min(r9, r6)
            if (r5 >= r6) goto L_0x0110
            r12 = 1
            long r12 = r12 << r5
            r21.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Long> r6 = com.google.android.gms.measurement.internal.K.f49712L
            java.lang.Object r6 = r6.a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            long r6 = java.lang.Math.max(r3, r6)
            long r6 = r6 * r12
            long r10 = r10 + r6
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x018a
            goto L_0x018d
        L_0x018a:
            int r5 = r5 + 1
            goto L_0x0150
        L_0x018d:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.h2 r1 = r21.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.I()
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            com.google.android.gms.measurement.internal.q2 r1 = r21.T()
            r1.c()
            com.google.android.gms.measurement.internal.o5 r1 = r21.U()
            r1.x()
            return
        L_0x01ad:
            com.google.android.gms.measurement.internal.n2 r1 = r21.z0()
            boolean r1 = r1.z()
            if (r1 != 0) goto L_0x01d3
            com.google.android.gms.measurement.internal.h2 r1 = r21.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.I()
            java.lang.String r2 = "No network"
            r1.a(r2)
            com.google.android.gms.measurement.internal.q2 r1 = r21.T()
            r1.b()
            com.google.android.gms.measurement.internal.o5 r1 = r21.U()
            r1.x()
            return
        L_0x01d3:
            com.google.android.gms.measurement.internal.Y4 r1 = r0.f50510i
            com.google.android.gms.measurement.internal.x2 r1 = r1.f50013g
            long r1 = r1.a()
            r21.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Long> r5 = com.google.android.gms.measurement.internal.K.f49692B
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.N5 r7 = r21.H0()
            boolean r7 = r7.a0(r1, r5)
            if (r7 != 0) goto L_0x01fe
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01fe:
            com.google.android.gms.measurement.internal.q2 r1 = r21.T()
            r1.c()
            com.google.android.gms.common.util.e r1 = r21.zzb()
            long r1 = r1.a()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0235
            r21.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Long> r1 = com.google.android.gms.measurement.internal.K.f49702G
            r2 = 0
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.Y4 r1 = r0.f50510i
            com.google.android.gms.measurement.internal.x2 r1 = r1.f50014h
            com.google.android.gms.common.util.e r2 = r21.zzb()
            long r2 = r2.a()
            r1.b(r2)
        L_0x0235:
            com.google.android.gms.measurement.internal.h2 r1 = r21.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.I()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.o5 r1 = r21.U()
            r1.w(r10)
            return
        L_0x024e:
            com.google.android.gms.measurement.internal.h2 r1 = r21.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.I()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            com.google.android.gms.measurement.internal.q2 r1 = r21.T()
            r1.c()
            com.google.android.gms.measurement.internal.o5 r1 = r21.U()
            r1.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7728y5.Y():void");
    }

    private final boolean Z() {
        q().k();
        L0();
        return u0().r1() || !TextUtils.isEmpty(u0().A());
    }

    private final int a(String str, C7646n nVar) {
        C7671q3.a aVar;
        E C10;
        if (this.f50502a.H(str) == null) {
            nVar.d(C7671q3.a.AD_PERSONALIZATION, C7639m.FAILSAFE);
            return 1;
        }
        C7676r2 S02 = u0().S0(str);
        if (S02 == null || C7730z0.a(S02.t()).b() != E.POLICY || (C10 = this.f50502a.C(str, aVar)) == E.UNINITIALIZED) {
            C7671q3.a aVar2 = C7671q3.a.AD_PERSONALIZATION;
            nVar.d(aVar2, C7639m.REMOTE_DEFAULT);
            return this.f50502a.L(str, aVar2) ? 0 : 1;
        }
        nVar.d((aVar = C7671q3.a.AD_PERSONALIZATION), C7639m.REMOTE_ENFORCED_DEFAULT);
        return C10 == E.GRANTED ? 0 : 1;
    }

    private final boolean a0() {
        q().k();
        FileLock fileLock = this.f50524w;
        if (fileLock == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(C7335k0.a().c(this.f50513l.zza().getFilesDir(), "google_app_measurement.db")), "rw").getChannel();
                this.f50525x = channel;
                FileLock tryLock = channel.tryLock();
                this.f50524w = tryLock;
                if (tryLock != null) {
                    f().I().a("Storage concurrent access okay");
                    return true;
                }
                f().E().a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e10) {
                f().E().b("Failed to acquire storage lock", e10);
                return false;
            } catch (IOException e11) {
                f().E().b("Failed to access storage lock file", e11);
                return false;
            } catch (OverlappingFileLockException e12) {
                f().J().b("Storage lock already acquired", e12);
                return false;
            }
        } else {
            f().I().a("Storage concurrent access okay");
            return true;
        }
    }

    private final int b(FileChannel fileChannel) {
        q().k();
        if (fileChannel == null || !fileChannel.isOpen()) {
            f().E().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    f().J().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e10) {
            f().E().b("Failed to read from channel", e10);
            return 0;
        }
    }

    private final Bundle d(String str, J j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", j10.f49673b.U("_sid").longValue());
        R5 U02 = u0().U0(str, "_sno");
        if (U02 != null) {
            Object obj = U02.f49946e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    private final C e(String str, C c10, C7671q3 q3Var, C7646n nVar) {
        E e10;
        C7671q3.a aVar;
        E C10;
        int i10 = 90;
        if (B0().H(str) == null) {
            if (c10.g() == E.DENIED) {
                i10 = c10.a();
                nVar.c(C7671q3.a.AD_USER_DATA, i10);
            } else {
                nVar.d(C7671q3.a.AD_USER_DATA, C7639m.FAILSAFE);
            }
            return new C(Boolean.FALSE, i10, Boolean.TRUE, "-");
        }
        E g10 = c10.g();
        E e11 = E.GRANTED;
        if (g10 == e11 || g10 == (e10 = E.DENIED)) {
            i10 = c10.a();
            nVar.c(C7671q3.a.AD_USER_DATA, i10);
        } else if (g10 != E.POLICY || (C10 = this.f50502a.C(str, aVar)) == E.UNINITIALIZED) {
            C2 c22 = this.f50502a;
            C7671q3.a aVar2 = C7671q3.a.AD_USER_DATA;
            C7671q3.a I10 = c22.I(str, aVar2);
            E r10 = q3Var.r();
            boolean z10 = r10 == e11 || r10 == e10;
            if (I10 != C7671q3.a.AD_STORAGE || !z10) {
                nVar.d(aVar2, C7639m.REMOTE_DEFAULT);
                g10 = this.f50502a.L(str, aVar2) ? e11 : e10;
            } else {
                nVar.d(aVar2, C7639m.REMOTE_DELEGATION);
                g10 = r10;
            }
        } else {
            nVar.d((aVar = C7671q3.a.AD_USER_DATA), C7639m.REMOTE_ENFORCED_DEFAULT);
            g10 = C10;
        }
        boolean X10 = this.f50502a.X(str);
        SortedSet<String> S10 = B0().S(str);
        if (g10 == E.DENIED || S10.isEmpty()) {
            return new C(Boolean.FALSE, i10, Boolean.valueOf(X10), "-");
        }
        Boolean bool = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(X10);
        String str2 = "";
        if (X10) {
            str2 = TextUtils.join(str2, S10);
        }
        return new C(bool, i10, valueOf, str2);
    }

    private final void g0(J j10, E5 e52) {
        C6620s.f(e52.f49596a);
        C7628k2 b10 = C7628k2.b(j10);
        I0().L(b10.f50206d, u0().O0(e52.f49596a));
        I0().U(b10, r0().v(e52.f49596a));
        J a10 = b10.a();
        if ("_cmp".equals(a10.f49672a) && "referrer API v2".equals(a10.f49673b.E0("_cis"))) {
            String E02 = a10.f49673b.E0("gclid");
            if (!TextUtils.isEmpty(E02)) {
                B(new P5("_lgclid", a10.f49675d, E02, "auto"), e52);
            }
        }
        v(a10, e52);
    }

    private final void h0(C7676r2 r2Var) {
        C5445a aVar;
        C5445a aVar2;
        q().k();
        if (!TextUtils.isEmpty(r2Var.q()) || !TextUtils.isEmpty(r2Var.j())) {
            String str = (String) C6620s.l(r2Var.l());
            f().I().b("Fetching remote configuration", str);
            C7319i2 K10 = B0().K(str);
            String P10 = B0().P(str);
            if (K10 != null) {
                if (!TextUtils.isEmpty(P10)) {
                    aVar2 = new C5445a();
                    aVar2.put("If-Modified-Since", P10);
                } else {
                    aVar2 = null;
                }
                String N10 = B0().N(str);
                if (!TextUtils.isEmpty(N10)) {
                    if (aVar2 == null) {
                        aVar2 = new C5445a();
                    }
                    aVar2.put("If-None-Match", N10);
                }
                aVar = aVar2;
            } else {
                aVar = null;
            }
            this.f50521t = true;
            C7649n2 z02 = z0();
            B5 b52 = new B5(this);
            z02.k();
            z02.s();
            C6620s.l(r2Var);
            C6620s.l(b52);
            Uri.Builder builder = new Uri.Builder();
            String q10 = r2Var.q();
            if (TextUtils.isEmpty(q10)) {
                q10 = r2Var.j();
            }
            builder.scheme(K.f49757f.a(null)).encodedAuthority(K.f49760g.a(null)).path("config/app/" + q10).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "114010").appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                z02.q().x(new C7656o2(z02, r2Var.l(), new URI(uri).toURL(), (byte[]) null, aVar, b52));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                z02.f().E().c("Failed to parse config URL. Not fetching. appId", C7607h2.t(r2Var.l()), uri);
            }
        } else {
            E((String) C6620s.l(r2Var.l()), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
        }
    }

    private static C7721x5 j(C7721x5 x5Var) {
        if (x5Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (x5Var.u()) {
            return x5Var;
        } else {
            String valueOf = String.valueOf(x5Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0235, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0236, code lost:
        r24 = "items";
        r4 = r0;
        r10 = r11;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x023c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x023d, code lost:
        r11 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r1 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r10 = r43;
        r24 = "items";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x035c, code lost:
        if (r11.equals("ecommerce_purchase") == false) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        r11 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045 A[Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }, ExcHandler: all (r0v8 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }]), Splitter:B:4:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0253 A[SYNTHETIC, Splitter:B:138:0x0253] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025a A[Catch:{ IOException -> 0x0216, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0624 A[Catch:{ IOException -> 0x0216, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x06e7 A[Catch:{ IOException -> 0x0216, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x073b A[Catch:{ IOException -> 0x0216, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x079d A[Catch:{ IOException -> 0x0216, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x08ad A[Catch:{ IOException -> 0x0216, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0e3e A[Catch:{ IOException -> 0x0216, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x0e63 A[Catch:{ IOException -> 0x0216, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x11ae A[SYNTHETIC, Splitter:B:618:0x11ae] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0115 A[Catch:{ SQLiteException -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012b A[SYNTHETIC, Splitter:B:74:0x012b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean j0(java.lang.String r43, long r44) {
        /*
            r42 = this;
            r1 = r42
            java.lang.String r2 = "_ai"
            java.lang.String r3 = "purchase"
            java.lang.String r4 = "items"
            com.google.android.gms.measurement.internal.p r5 = r42.u0()
            r5.l1()
            com.google.android.gms.measurement.internal.y5$a r5 = new com.google.android.gms.measurement.internal.y5$a     // Catch:{ all -> 0x0085 }
            r6 = 0
            r5.<init>()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r7 = r42.u0()     // Catch:{ all -> 0x0085 }
            long r8 = r1.f50492A     // Catch:{ all -> 0x0085 }
            K9.C6620s.l(r5)     // Catch:{ all -> 0x0085 }
            r7.k()     // Catch:{ all -> 0x0085 }
            r7.s()     // Catch:{ all -> 0x0085 }
            r11 = -1
            r13 = 1
            r14 = 0
            android.database.sqlite.SQLiteDatabase r15 = r7.z()     // Catch:{ SQLiteException -> 0x023c, all -> 0x0045 }
            boolean r16 = android.text.TextUtils.isEmpty(r43)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0045 }
            java.lang.String r17 = ""
            if (r16 == 0) goto L_0x00a2
            int r16 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r16 == 0) goto L_0x0053
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
            java.lang.String r10 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
            goto L_0x005b
        L_0x0045:
            r0 = move-exception
            r1 = r0
            r6 = 0
            goto L_0x11ac
        L_0x004a:
            r0 = move-exception
            r10 = r43
            r24 = r4
        L_0x004f:
            r6 = 0
        L_0x0050:
            r4 = r0
            goto L_0x0240
        L_0x0053:
            java.lang.String r6 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
        L_0x005b:
            if (r16 == 0) goto L_0x005f
            java.lang.String r17 = "rowid <= ? and "
        L_0x005f:
            r10 = r17
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
            java.lang.String r12 = "select app_id, metadata_fingerprint from raw_events where "
            r11.<init>(r12)     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
            r11.append(r10)     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
            java.lang.String r10 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r11.append(r10)     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
            java.lang.String r10 = r11.toString()     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
            android.database.Cursor r6 = r15.rawQuery(r10, r6)     // Catch:{ SQLiteException -> 0x004a, all -> 0x0045 }
            boolean r10 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x009e }
            if (r10 != 0) goto L_0x0089
            r6.close()     // Catch:{ all -> 0x0085 }
        L_0x0081:
            r24 = r4
            goto L_0x0256
        L_0x0085:
            r0 = move-exception
            r1 = r0
            goto L_0x11b2
        L_0x0089:
            java.lang.String r10 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x009e }
            java.lang.String r11 = r6.getString(r13)     // Catch:{ SQLiteException -> 0x009a }
            r6.close()     // Catch:{ SQLiteException -> 0x009a }
            goto L_0x00f4
        L_0x0096:
            r0 = move-exception
            r1 = r0
            goto L_0x11ac
        L_0x009a:
            r0 = move-exception
        L_0x009b:
            r24 = r4
            goto L_0x0050
        L_0x009e:
            r0 = move-exception
            r10 = r43
            goto L_0x009b
        L_0x00a2:
            r10 = r11
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00bb
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x00b7, all -> 0x0045 }
            r11 = r43
            java.lang.String[] r10 = new java.lang.String[]{r11, r10}     // Catch:{ SQLiteException -> 0x00b2, all -> 0x0045 }
            goto L_0x00c1
        L_0x00b2:
            r0 = move-exception
        L_0x00b3:
            r24 = r4
            r10 = r11
            goto L_0x004f
        L_0x00b7:
            r0 = move-exception
            r11 = r43
            goto L_0x00b3
        L_0x00bb:
            r11 = r43
            java.lang.String[] r10 = new java.lang.String[]{r43}     // Catch:{ SQLiteException -> 0x0235, all -> 0x0045 }
        L_0x00c1:
            if (r6 == 0) goto L_0x00c5
            java.lang.String r17 = " and rowid <= ?"
        L_0x00c5:
            r6 = r17
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0235, all -> 0x0045 }
            java.lang.String r13 = "select metadata_fingerprint from raw_events where app_id = ?"
            r12.<init>(r13)     // Catch:{ SQLiteException -> 0x0235, all -> 0x0045 }
            r12.append(r6)     // Catch:{ SQLiteException -> 0x0235, all -> 0x0045 }
            java.lang.String r6 = " order by rowid limit 1;"
            r12.append(r6)     // Catch:{ SQLiteException -> 0x0235, all -> 0x0045 }
            java.lang.String r6 = r12.toString()     // Catch:{ SQLiteException -> 0x0235, all -> 0x0045 }
            android.database.Cursor r6 = r15.rawQuery(r6, r10)     // Catch:{ SQLiteException -> 0x0235, all -> 0x0045 }
            boolean r10 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x022f }
            if (r10 != 0) goto L_0x00e8
            r6.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0081
        L_0x00e8:
            java.lang.String r10 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x022f }
            r6.close()     // Catch:{ SQLiteException -> 0x022f }
            r41 = r11
            r11 = r10
            r10 = r41
        L_0x00f4:
            java.lang.String r16 = "raw_events_metadata"
            java.lang.String r12 = "metadata"
            java.lang.String[] r17 = new java.lang.String[]{r12}     // Catch:{ SQLiteException -> 0x009a }
            java.lang.String r18 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r19 = new java.lang.String[]{r10, r11}     // Catch:{ SQLiteException -> 0x009a }
            java.lang.String r22 = "rowid"
            java.lang.String r23 = "2"
            r20 = 0
            r21 = 0
            r12 = r15
            android.database.Cursor r6 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x009a }
            boolean r13 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x009a }
            if (r13 != 0) goto L_0x012b
            com.google.android.gms.measurement.internal.h2 r8 = r7.f()     // Catch:{ SQLiteException -> 0x009a }
            com.google.android.gms.measurement.internal.i2 r8 = r8.E()     // Catch:{ SQLiteException -> 0x009a }
            java.lang.String r9 = "Raw event metadata record is missing. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r10)     // Catch:{ SQLiteException -> 0x009a }
            r8.b(r9, r11)     // Catch:{ SQLiteException -> 0x009a }
            r6.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0081
        L_0x012b:
            byte[] r13 = r6.getBlob(r14)     // Catch:{ SQLiteException -> 0x009a }
            com.google.android.gms.internal.measurement.A2$a r15 = com.google.android.gms.internal.measurement.A2.H2()     // Catch:{ IOException -> 0x0216 }
            com.google.android.gms.internal.measurement.v5 r13 = com.google.android.gms.measurement.internal.N5.E(r15, r13)     // Catch:{ IOException -> 0x0216 }
            com.google.android.gms.internal.measurement.A2$a r13 = (com.google.android.gms.internal.measurement.A2.a) r13     // Catch:{ IOException -> 0x0216 }
            com.google.android.gms.internal.measurement.s5 r13 = r13.s()     // Catch:{ IOException -> 0x0216 }
            com.google.android.gms.internal.measurement.L4 r13 = (com.google.android.gms.internal.measurement.L4) r13     // Catch:{ IOException -> 0x0216 }
            com.google.android.gms.internal.measurement.A2 r13 = (com.google.android.gms.internal.measurement.A2) r13     // Catch:{ IOException -> 0x0216 }
            boolean r15 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x009a }
            if (r15 == 0) goto L_0x015e
            com.google.android.gms.measurement.internal.h2 r15 = r7.f()     // Catch:{ SQLiteException -> 0x009a }
            com.google.android.gms.measurement.internal.i2 r15 = r15.J()     // Catch:{ SQLiteException -> 0x009a }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            r24 = r4
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7607h2.t(r10)     // Catch:{ SQLiteException -> 0x015b }
            r15.b(r14, r4)     // Catch:{ SQLiteException -> 0x015b }
            goto L_0x0160
        L_0x015b:
            r0 = move-exception
            goto L_0x0050
        L_0x015e:
            r24 = r4
        L_0x0160:
            r6.close()     // Catch:{ SQLiteException -> 0x015b }
            r5.a(r13)     // Catch:{ SQLiteException -> 0x015b }
            r13 = -1
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x017b
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String[] r8 = new java.lang.String[]{r10, r11, r8}     // Catch:{ SQLiteException -> 0x015b }
        L_0x0176:
            r18 = r4
            r19 = r8
            goto L_0x0182
        L_0x017b:
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[]{r10, r11}     // Catch:{ SQLiteException -> 0x015b }
            goto L_0x0176
        L_0x0182:
            java.lang.String r16 = "raw_events"
            java.lang.String r4 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r11 = "data"
            java.lang.String[] r17 = new java.lang.String[]{r4, r8, r9, r11}     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String r22 = "rowid"
            r23 = 0
            r20 = 0
            r21 = 0
            r15 = r12
            android.database.Cursor r4 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x015b }
            boolean r6 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            if (r6 != 0) goto L_0x01c2
            com.google.android.gms.measurement.internal.h2 r6 = r7.f()     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            com.google.android.gms.measurement.internal.i2 r6 = r6.J()     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C7607h2.t(r10)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            r6.b(r8, r9)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            r4.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0256
        L_0x01b9:
            r0 = move-exception
            r1 = r0
            r6 = r4
            goto L_0x11ac
        L_0x01be:
            r0 = move-exception
            r6 = r4
            goto L_0x0050
        L_0x01c2:
            r6 = 0
            long r8 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            r6 = 3
            byte[] r11 = r4.getBlob(r6)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            com.google.android.gms.internal.measurement.v2$a r6 = com.google.android.gms.internal.measurement.C7427v2.V()     // Catch:{ IOException -> 0x01f9 }
            com.google.android.gms.internal.measurement.v5 r6 = com.google.android.gms.measurement.internal.N5.E(r6, r11)     // Catch:{ IOException -> 0x01f9 }
            com.google.android.gms.internal.measurement.v2$a r6 = (com.google.android.gms.internal.measurement.C7427v2.a) r6     // Catch:{ IOException -> 0x01f9 }
            r11 = 1
            java.lang.String r12 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            com.google.android.gms.internal.measurement.v2$a r11 = r6.K(r12)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            r12 = 2
            long r12 = r4.getLong(r12)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            r11.M(r12)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            com.google.android.gms.internal.measurement.s5 r6 = r6.s()     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            com.google.android.gms.internal.measurement.L4 r6 = (com.google.android.gms.internal.measurement.L4) r6     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            com.google.android.gms.internal.measurement.v2 r6 = (com.google.android.gms.internal.measurement.C7427v2) r6     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            boolean r6 = r5.b(r8, r6)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            if (r6 != 0) goto L_0x020c
            r4.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0256
        L_0x01f9:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.h2 r8 = r7.f()     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            com.google.android.gms.measurement.internal.i2 r8 = r8.E()     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r10)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            r8.c(r9, r11, r6)     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
        L_0x020c:
            boolean r6 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01be, all -> 0x01b9 }
            if (r6 != 0) goto L_0x01c2
            r4.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0256
        L_0x0216:
            r0 = move-exception
            r24 = r4
            r4 = r0
            com.google.android.gms.measurement.internal.h2 r8 = r7.f()     // Catch:{ SQLiteException -> 0x015b }
            com.google.android.gms.measurement.internal.i2 r8 = r8.E()     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String r9 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r10)     // Catch:{ SQLiteException -> 0x015b }
            r8.c(r9, r11, r4)     // Catch:{ SQLiteException -> 0x015b }
            r6.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0256
        L_0x022f:
            r0 = move-exception
            r24 = r4
            r4 = r0
            r10 = r11
            goto L_0x0240
        L_0x0235:
            r0 = move-exception
        L_0x0236:
            r24 = r4
            r4 = r0
            r10 = r11
            r6 = 0
            goto L_0x0240
        L_0x023c:
            r0 = move-exception
            r11 = r43
            goto L_0x0236
        L_0x0240:
            com.google.android.gms.measurement.internal.h2 r7 = r7.f()     // Catch:{ all -> 0x0096 }
            com.google.android.gms.measurement.internal.i2 r7 = r7.E()     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C7607h2.t(r10)     // Catch:{ all -> 0x0096 }
            r7.c(r8, r9, r4)     // Catch:{ all -> 0x0096 }
            if (r6 == 0) goto L_0x0256
            r6.close()     // Catch:{ all -> 0x0085 }
        L_0x0256:
            java.util.List<com.google.android.gms.internal.measurement.v2> r4 = r5.f50530c     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x119c
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x0262
            goto L_0x119c
        L_0x0262:
            com.google.android.gms.internal.measurement.A2 r4 = r5.f50528a     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r4 = r4.A()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2$a r4 = (com.google.android.gms.internal.measurement.A2.a) r4     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2$a r4 = r4.Z0()     // Catch:{ all -> 0x0085 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = -1
            r14 = -1
        L_0x0276:
            java.util.List<com.google.android.gms.internal.measurement.v2> r15 = r5.f50530c     // Catch:{ all -> 0x0085 }
            int r15 = r15.size()     // Catch:{ all -> 0x0085 }
            java.lang.String r6 = "_fr"
            r16 = r7
            java.lang.String r7 = "_e"
            r44 = r12
            java.lang.String r12 = "_c"
            r17 = r13
            r18 = r14
            if (r11 >= r15) goto L_0x08d8
            java.util.List<com.google.android.gms.internal.measurement.v2> r15 = r5.f50530c     // Catch:{ all -> 0x0085 }
            java.lang.Object r15 = r15.get(r11)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r15 = (com.google.android.gms.internal.measurement.C7427v2) r15     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r15 = r15.A()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2$a r15 = (com.google.android.gms.internal.measurement.C7427v2.a) r15     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.C2 r13 = r42.B0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r14 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = r14.a0()     // Catch:{ all -> 0x0085 }
            r21 = r11
            java.lang.String r11 = r15.Q()     // Catch:{ all -> 0x0085 }
            boolean r11 = r13.O(r14, r11)     // Catch:{ all -> 0x0085 }
            java.lang.String r13 = "_err"
            if (r11 == 0) goto L_0x032e
            com.google.android.gms.measurement.internal.h2 r6 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r6 = r6.J()     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.A2 r11 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r11.a0()     // Catch:{ all -> 0x0085 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r11)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.P2 r12 = r1.f50513l     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.e2 r12 = r12.C()     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = r15.Q()     // Catch:{ all -> 0x0085 }
            java.lang.String r12 = r12.c(r14)     // Catch:{ all -> 0x0085 }
            r6.c(r7, r11, r12)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.C2 r6 = r42.B0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r7 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = r7.a0()     // Catch:{ all -> 0x0085 }
            boolean r6 = r6.W(r7)     // Catch:{ all -> 0x0085 }
            if (r6 != 0) goto L_0x031c
            com.google.android.gms.measurement.internal.C2 r6 = r42.B0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r7 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = r7.a0()     // Catch:{ all -> 0x0085 }
            boolean r6 = r6.Y(r7)     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x02f8
            goto L_0x031c
        L_0x02f8:
            java.lang.String r6 = r15.Q()     // Catch:{ all -> 0x0085 }
            boolean r6 = r13.equals(r6)     // Catch:{ all -> 0x0085 }
            if (r6 != 0) goto L_0x031c
            r42.I0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.S5 r6 = r1.f50501J     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r7 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r26 = r7.a0()     // Catch:{ all -> 0x0085 }
            java.lang.String r28 = "_ev"
            java.lang.String r29 = r15.Q()     // Catch:{ all -> 0x0085 }
            r30 = 0
            r27 = 11
            r25 = r6
            com.google.android.gms.measurement.internal.Q5.X(r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0085 }
        L_0x031c:
            r12 = r44
            r23 = r2
            r25 = r3
            r7 = r16
            r13 = r17
            r14 = r18
            r6 = r21
            r11 = r24
            goto L_0x08cd
        L_0x032e:
            boolean r11 = com.google.android.gms.internal.measurement.C7431v6.a()     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x0398
            com.google.android.gms.measurement.internal.i r11 = r42.r0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.K.f49747b1     // Catch:{ all -> 0x0085 }
            boolean r11 = r11.r(r14)     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x0398
            java.lang.String r11 = r15.Q()     // Catch:{ all -> 0x0085 }
            boolean r14 = r11.equals(r3)     // Catch:{ all -> 0x0085 }
            r45 = r8
            java.lang.String r8 = "ecommerce_purchase"
            r22 = r4
            java.lang.String r4 = "_iap"
            if (r14 != 0) goto L_0x035e
            boolean r14 = r11.equals(r4)     // Catch:{ all -> 0x0085 }
            if (r14 != 0) goto L_0x035e
            boolean r11 = r11.equals(r8)     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x039c
        L_0x035e:
            com.google.android.gms.internal.measurement.x2$a r11 = com.google.android.gms.internal.measurement.C7443x2.X()     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = "_cbs"
            com.google.android.gms.internal.measurement.x2$a r11 = r11.G(r14)     // Catch:{ all -> 0x0085 }
            if (r10 != 0) goto L_0x0385
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x0085 }
            boolean r14 = r1.S(r10, r3)     // Catch:{ all -> 0x0085 }
            if (r14 == 0) goto L_0x0385
            boolean r4 = r1.S(r10, r4)     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x0385
            boolean r4 = r1.S(r10, r8)     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x0385
            java.lang.String r4 = sa.F.f56079a     // Catch:{ all -> 0x0085 }
            goto L_0x0387
        L_0x0385:
            java.lang.String r4 = sa.F.f56080b     // Catch:{ all -> 0x0085 }
        L_0x0387:
            com.google.android.gms.internal.measurement.x2$a r4 = r11.I(r4)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r4 = r4.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r4 = (com.google.android.gms.internal.measurement.L4) r4     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r4 = (com.google.android.gms.internal.measurement.C7443x2) r4     // Catch:{ all -> 0x0085 }
            r15.H(r4)     // Catch:{ all -> 0x0085 }
            r10 = 1
            goto L_0x039c
        L_0x0398:
            r22 = r4
            r45 = r8
        L_0x039c:
            java.lang.String r4 = r15.Q()     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = sa.H.a(r2)     // Catch:{ all -> 0x0085 }
            boolean r4 = r4.equals(r8)     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x040a
            r15.K(r2)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.h2 r4 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r4 = r4.I()     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = "Renaming ad_impression to _ai"
            r4.a(r8)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.h2 r4 = r42.f()     // Catch:{ all -> 0x0085 }
            r8 = 5
            boolean r4 = r4.A(r8)     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x040a
            r4 = 0
        L_0x03c6:
            int r8 = r15.z()     // Catch:{ all -> 0x0085 }
            if (r4 >= r8) goto L_0x040a
            java.lang.String r8 = "ad_platform"
            com.google.android.gms.internal.measurement.x2 r11 = r15.N(r4)     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r11.Z()     // Catch:{ all -> 0x0085 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x0407
            com.google.android.gms.internal.measurement.x2 r8 = r15.N(r4)     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x0085 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0085 }
            if (r8 != 0) goto L_0x0407
            java.lang.String r8 = "admob"
            com.google.android.gms.internal.measurement.x2 r11 = r15.N(r4)     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r11.a0()     // Catch:{ all -> 0x0085 }
            boolean r8 = r8.equalsIgnoreCase(r11)     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x0407
            com.google.android.gms.measurement.internal.h2 r8 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r8 = r8.K()     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.a(r11)     // Catch:{ all -> 0x0085 }
        L_0x0407:
            int r4 = r4 + 1
            goto L_0x03c6
        L_0x040a:
            com.google.android.gms.measurement.internal.C2 r4 = r42.B0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r8 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r15.Q()     // Catch:{ all -> 0x0085 }
            boolean r4 = r4.M(r8, r11)     // Catch:{ all -> 0x0085 }
            if (r4 != 0) goto L_0x0445
            r42.H0()     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r15.Q()     // Catch:{ all -> 0x0085 }
            K9.C6620s.f(r8)     // Catch:{ all -> 0x0085 }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x0085 }
            r14 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r14) goto L_0x0432
            goto L_0x043b
        L_0x0432:
            java.lang.String r11 = "_ui"
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x043b
            goto L_0x0445
        L_0x043b:
            r23 = r2
            r25 = r3
            r26 = r9
            r27 = r10
            goto L_0x0622
        L_0x0445:
            r23 = r2
            r8 = 0
            r11 = 0
            r14 = 0
        L_0x044a:
            int r2 = r15.z()     // Catch:{ all -> 0x0085 }
            r25 = r3
            java.lang.String r3 = "_r"
            if (r14 >= r2) goto L_0x04bd
            com.google.android.gms.internal.measurement.x2 r2 = r15.N(r14)     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r2.Z()     // Catch:{ all -> 0x0085 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0483
            com.google.android.gms.internal.measurement.x2 r2 = r15.N(r14)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r2 = r2.A()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r2 = (com.google.android.gms.internal.measurement.C7443x2.a) r2     // Catch:{ all -> 0x0085 }
            r26 = r9
            r8 = 1
            com.google.android.gms.internal.measurement.x2$a r2 = r2.C(r8)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r2 = r2.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r2 = (com.google.android.gms.internal.measurement.L4) r2     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r2 = (com.google.android.gms.internal.measurement.C7443x2) r2     // Catch:{ all -> 0x0085 }
            r15.D(r14, r2)     // Catch:{ all -> 0x0085 }
            r27 = r10
            r8 = 1
            goto L_0x04b4
        L_0x0483:
            r26 = r9
            com.google.android.gms.internal.measurement.x2 r2 = r15.N(r14)     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r2.Z()     // Catch:{ all -> 0x0085 }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x04b2
            com.google.android.gms.internal.measurement.x2 r2 = r15.N(r14)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r2 = r2.A()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r2 = (com.google.android.gms.internal.measurement.C7443x2.a) r2     // Catch:{ all -> 0x0085 }
            r27 = r10
            r9 = 1
            com.google.android.gms.internal.measurement.x2$a r2 = r2.C(r9)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r2 = r2.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r2 = (com.google.android.gms.internal.measurement.L4) r2     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r2 = (com.google.android.gms.internal.measurement.C7443x2) r2     // Catch:{ all -> 0x0085 }
            r15.D(r14, r2)     // Catch:{ all -> 0x0085 }
            r11 = 1
            goto L_0x04b4
        L_0x04b2:
            r27 = r10
        L_0x04b4:
            int r14 = r14 + 1
            r3 = r25
            r9 = r26
            r10 = r27
            goto L_0x044a
        L_0x04bd:
            r26 = r9
            r27 = r10
            if (r8 != 0) goto L_0x04f1
            if (r4 == 0) goto L_0x04f1
            com.google.android.gms.measurement.internal.h2 r2 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.I()     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.P2 r9 = r1.f50513l     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.e2 r9 = r9.C()     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r15.Q()     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r9.c(r10)     // Catch:{ all -> 0x0085 }
            r2.b(r8, r9)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r2 = com.google.android.gms.internal.measurement.C7443x2.X()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r2 = r2.G(r12)     // Catch:{ all -> 0x0085 }
            r8 = 1
            com.google.android.gms.internal.measurement.x2$a r2 = r2.C(r8)     // Catch:{ all -> 0x0085 }
            r15.G(r2)     // Catch:{ all -> 0x0085 }
        L_0x04f1:
            if (r11 != 0) goto L_0x051f
            com.google.android.gms.measurement.internal.h2 r2 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.I()     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.P2 r9 = r1.f50513l     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.e2 r9 = r9.C()     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r15.Q()     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r9.c(r10)     // Catch:{ all -> 0x0085 }
            r2.b(r8, r9)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r2 = com.google.android.gms.internal.measurement.C7443x2.X()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r2 = r2.G(r3)     // Catch:{ all -> 0x0085 }
            r8 = 1
            com.google.android.gms.internal.measurement.x2$a r2 = r2.C(r8)     // Catch:{ all -> 0x0085 }
            r15.G(r2)     // Catch:{ all -> 0x0085 }
        L_0x051f:
            com.google.android.gms.measurement.internal.p r28 = r42.u0()     // Catch:{ all -> 0x0085 }
            long r29 = r42.Q0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r2 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r31 = r2.a0()     // Catch:{ all -> 0x0085 }
            r37 = 0
            r38 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 1
            com.google.android.gms.measurement.internal.q r2 = r28.J(r29, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0085 }
            long r8 = r2.f50291e     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i r2 = r42.r0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x0085 }
            int r2 = r2.z(r10)     // Catch:{ all -> 0x0085 }
            long r10 = (long) r2     // Catch:{ all -> 0x0085 }
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0558
            r(r15, r3)     // Catch:{ all -> 0x0085 }
            goto L_0x055a
        L_0x0558:
            r16 = 1
        L_0x055a:
            java.lang.String r2 = r15.Q()     // Catch:{ all -> 0x0085 }
            boolean r2 = com.google.android.gms.measurement.internal.Q5.G0(r2)     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0622
            if (r4 == 0) goto L_0x0622
            com.google.android.gms.measurement.internal.p r28 = r42.u0()     // Catch:{ all -> 0x0085 }
            long r29 = r42.Q0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r2 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r31 = r2.a0()     // Catch:{ all -> 0x0085 }
            r37 = 0
            r38 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r35 = 0
            r36 = 0
            com.google.android.gms.measurement.internal.q r2 = r28.J(r29, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0085 }
            long r2 = r2.f50289c     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i r8 = r42.r0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r9 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r9.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.K.f49776o     // Catch:{ all -> 0x0085 }
            int r8 = r8.w(r9, r10)     // Catch:{ all -> 0x0085 }
            long r8 = (long) r8     // Catch:{ all -> 0x0085 }
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0622
            com.google.android.gms.measurement.internal.h2 r2 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.J()     // Catch:{ all -> 0x0085 }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.A2 r8 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x0085 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0085 }
            r2.b(r3, r8)     // Catch:{ all -> 0x0085 }
            r2 = -1
            r3 = 0
            r8 = 0
            r9 = 0
        L_0x05b8:
            int r10 = r15.z()     // Catch:{ all -> 0x0085 }
            if (r9 >= r10) goto L_0x05e3
            com.google.android.gms.internal.measurement.x2 r10 = r15.N(r9)     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r10.Z()     // Catch:{ all -> 0x0085 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x05d5
            com.google.android.gms.internal.measurement.L4$a r2 = r10.A()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r2 = (com.google.android.gms.internal.measurement.C7443x2.a) r2     // Catch:{ all -> 0x0085 }
            r3 = r2
            r2 = r9
            goto L_0x05e0
        L_0x05d5:
            java.lang.String r10 = r10.Z()     // Catch:{ all -> 0x0085 }
            boolean r10 = r13.equals(r10)     // Catch:{ all -> 0x0085 }
            if (r10 == 0) goto L_0x05e0
            r8 = 1
        L_0x05e0:
            int r9 = r9 + 1
            goto L_0x05b8
        L_0x05e3:
            if (r8 == 0) goto L_0x05eb
            if (r3 == 0) goto L_0x05eb
            r15.A(r2)     // Catch:{ all -> 0x0085 }
            goto L_0x0622
        L_0x05eb:
            if (r3 == 0) goto L_0x060b
            java.lang.Object r3 = r3.clone()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r3 = (com.google.android.gms.internal.measurement.L4.a) r3     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r3 = (com.google.android.gms.internal.measurement.C7443x2.a) r3     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r3 = r3.G(r13)     // Catch:{ all -> 0x0085 }
            r8 = 10
            com.google.android.gms.internal.measurement.x2$a r3 = r3.C(r8)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r3 = r3.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r3 = (com.google.android.gms.internal.measurement.L4) r3     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r3 = (com.google.android.gms.internal.measurement.C7443x2) r3     // Catch:{ all -> 0x0085 }
            r15.D(r2, r3)     // Catch:{ all -> 0x0085 }
            goto L_0x0622
        L_0x060b:
            com.google.android.gms.measurement.internal.h2 r2 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.E()     // Catch:{ all -> 0x0085 }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.A2 r8 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x0085 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0085 }
            r2.b(r3, r8)     // Catch:{ all -> 0x0085 }
        L_0x0622:
            if (r4 == 0) goto L_0x0693
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0085 }
            java.util.List r3 = r15.R()     // Catch:{ all -> 0x0085 }
            r2.<init>(r3)     // Catch:{ all -> 0x0085 }
            r3 = 0
            r4 = -1
            r8 = -1
        L_0x0630:
            int r9 = r2.size()     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = "currency"
            java.lang.String r11 = "value"
            if (r3 >= r9) goto L_0x0660
            java.lang.Object r9 = r2.get(r3)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r9 = (com.google.android.gms.internal.measurement.C7443x2) r9     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r9.Z()     // Catch:{ all -> 0x0085 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0085 }
            if (r9 == 0) goto L_0x064c
            r4 = r3
            goto L_0x065d
        L_0x064c:
            java.lang.Object r9 = r2.get(r3)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r9 = (com.google.android.gms.internal.measurement.C7443x2) r9     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r9.Z()     // Catch:{ all -> 0x0085 }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x0085 }
            if (r9 == 0) goto L_0x065d
            r8 = r3
        L_0x065d:
            int r3 = r3 + 1
            goto L_0x0630
        L_0x0660:
            r3 = -1
            if (r4 == r3) goto L_0x0694
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r3 = (com.google.android.gms.internal.measurement.C7443x2) r3     // Catch:{ all -> 0x0085 }
            boolean r3 = r3.e0()     // Catch:{ all -> 0x0085 }
            if (r3 != 0) goto L_0x0696
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r3 = (com.google.android.gms.internal.measurement.C7443x2) r3     // Catch:{ all -> 0x0085 }
            boolean r3 = r3.c0()     // Catch:{ all -> 0x0085 }
            if (r3 != 0) goto L_0x0696
            com.google.android.gms.measurement.internal.h2 r2 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.K()     // Catch:{ all -> 0x0085 }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.a(r3)     // Catch:{ all -> 0x0085 }
            r15.A(r4)     // Catch:{ all -> 0x0085 }
            r(r15, r12)     // Catch:{ all -> 0x0085 }
            r2 = 18
            p(r15, r2, r11)     // Catch:{ all -> 0x0085 }
        L_0x0693:
            r3 = -1
        L_0x0694:
            r9 = 3
            goto L_0x06dd
        L_0x0696:
            r3 = -1
            if (r8 != r3) goto L_0x069b
            r9 = 3
            goto L_0x06be
        L_0x069b:
            java.lang.Object r2 = r2.get(r8)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r2 = (com.google.android.gms.internal.measurement.C7443x2) r2     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r2.a0()     // Catch:{ all -> 0x0085 }
            int r8 = r2.length()     // Catch:{ all -> 0x0085 }
            r9 = 3
            if (r8 == r9) goto L_0x06ad
            goto L_0x06be
        L_0x06ad:
            r8 = 0
        L_0x06ae:
            int r11 = r2.length()     // Catch:{ all -> 0x0085 }
            if (r8 >= r11) goto L_0x06dd
            int r11 = r2.codePointAt(r8)     // Catch:{ all -> 0x0085 }
            boolean r13 = java.lang.Character.isLetter(r11)     // Catch:{ all -> 0x0085 }
            if (r13 != 0) goto L_0x06d7
        L_0x06be:
            com.google.android.gms.measurement.internal.h2 r2 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.K()     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r8)     // Catch:{ all -> 0x0085 }
            r15.A(r4)     // Catch:{ all -> 0x0085 }
            r(r15, r12)     // Catch:{ all -> 0x0085 }
            r2 = 19
            p(r15, r2, r10)     // Catch:{ all -> 0x0085 }
            goto L_0x06dd
        L_0x06d7:
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0085 }
            int r8 = r8 + r11
            goto L_0x06ae
        L_0x06dd:
            java.lang.String r2 = r15.Q()     // Catch:{ all -> 0x0085 }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x073b
            r42.H0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r2 = r15.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r2 = (com.google.android.gms.internal.measurement.L4) r2     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r2 = (com.google.android.gms.internal.measurement.C7427v2) r2     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r2 = com.google.android.gms.measurement.internal.N5.D(r2, r6)     // Catch:{ all -> 0x0085 }
            if (r2 != 0) goto L_0x0734
            if (r26 == 0) goto L_0x072a
            long r6 = r26.O()     // Catch:{ all -> 0x0085 }
            long r10 = r15.O()     // Catch:{ all -> 0x0085 }
            long r6 = r6 - r10
            long r6 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0085 }
            r10 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x072a
            java.lang.Object r2 = r26.clone()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r2 = (com.google.android.gms.internal.measurement.L4.a) r2     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2$a r2 = (com.google.android.gms.internal.measurement.C7427v2.a) r2     // Catch:{ all -> 0x0085 }
            boolean r4 = r1.R(r15, r2)     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x072a
            r6 = r18
            r4 = r22
            r4.C(r6, r2)     // Catch:{ all -> 0x0085 }
            r14 = r6
            r13 = r17
        L_0x0725:
            r2 = 0
            r26 = 0
            goto L_0x0797
        L_0x072a:
            r6 = r18
            r4 = r22
            r13 = r44
            r14 = r6
            r2 = r15
            goto L_0x0797
        L_0x0734:
            r6 = r18
            r4 = r22
        L_0x0738:
            r7 = r17
            goto L_0x0793
        L_0x073b:
            r6 = r18
            r4 = r22
            java.lang.String r2 = "_vs"
            java.lang.String r7 = r15.Q()     // Catch:{ all -> 0x0085 }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0738
            r42.H0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r2 = r15.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r2 = (com.google.android.gms.internal.measurement.L4) r2     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r2 = (com.google.android.gms.internal.measurement.C7427v2) r2     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "_et"
            com.google.android.gms.internal.measurement.x2 r2 = com.google.android.gms.measurement.internal.N5.D(r2, r7)     // Catch:{ all -> 0x0085 }
            if (r2 != 0) goto L_0x0738
            if (r45 == 0) goto L_0x0789
            long r7 = r45.O()     // Catch:{ all -> 0x0085 }
            long r10 = r15.O()     // Catch:{ all -> 0x0085 }
            long r7 = r7 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0085 }
            r10 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x0789
            java.lang.Object r2 = r45.clone()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r2 = (com.google.android.gms.internal.measurement.L4.a) r2     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2$a r2 = (com.google.android.gms.internal.measurement.C7427v2.a) r2     // Catch:{ all -> 0x0085 }
            boolean r7 = r1.R(r2, r15)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0789
            r7 = r17
            r4.C(r7, r2)     // Catch:{ all -> 0x0085 }
            r14 = r6
            r13 = r7
            goto L_0x0725
        L_0x0789:
            r7 = r17
            r14 = r44
            r2 = r45
            r13 = r7
            r26 = r15
            goto L_0x0797
        L_0x0793:
            r2 = r45
            r14 = r6
            r13 = r7
        L_0x0797:
            int r6 = r15.z()     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x08ad
            r42.H0()     // Catch:{ all -> 0x0085 }
            java.util.List r6 = r15.R()     // Catch:{ all -> 0x0085 }
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.N5.z(r6)     // Catch:{ all -> 0x0085 }
            r7 = 0
        L_0x07a9:
            int r8 = r15.z()     // Catch:{ all -> 0x0085 }
            if (r7 >= r8) goto L_0x0859
            com.google.android.gms.internal.measurement.x2 r8 = r15.N(r7)     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r8.Z()     // Catch:{ all -> 0x0085 }
            r11 = r24
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x0085 }
            if (r10 == 0) goto L_0x0830
            java.util.List r10 = r8.b0()     // Catch:{ all -> 0x0085 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0085 }
            if (r10 != 0) goto L_0x0830
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x0085 }
            java.util.List r8 = r8.b0()     // Catch:{ all -> 0x0085 }
            int r12 = r8.size()     // Catch:{ all -> 0x0085 }
            android.os.Bundle[] r12 = new android.os.Bundle[r12]     // Catch:{ all -> 0x0085 }
            r3 = 0
        L_0x07da:
            int r9 = r8.size()     // Catch:{ all -> 0x0085 }
            if (r3 >= r9) goto L_0x082a
            java.lang.Object r9 = r8.get(r3)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r9 = (com.google.android.gms.internal.measurement.C7443x2) r9     // Catch:{ all -> 0x0085 }
            r42.H0()     // Catch:{ all -> 0x0085 }
            java.util.List r17 = r9.b0()     // Catch:{ all -> 0x0085 }
            r45 = r2
            android.os.Bundle r2 = com.google.android.gms.measurement.internal.N5.z(r17)     // Catch:{ all -> 0x0085 }
            java.util.List r9 = r9.b0()     // Catch:{ all -> 0x0085 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0085 }
        L_0x07fb:
            boolean r17 = r9.hasNext()     // Catch:{ all -> 0x0085 }
            if (r17 == 0) goto L_0x081f
            java.lang.Object r17 = r9.next()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r17 = (com.google.android.gms.internal.measurement.C7443x2) r17     // Catch:{ all -> 0x0085 }
            r18 = r8
            java.lang.String r8 = r15.Q()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r17 = r17.A()     // Catch:{ all -> 0x0085 }
            r19 = r9
            r9 = r17
            com.google.android.gms.internal.measurement.x2$a r9 = (com.google.android.gms.internal.measurement.C7443x2.a) r9     // Catch:{ all -> 0x0085 }
            r1.G(r8, r9, r2, r10)     // Catch:{ all -> 0x0085 }
            r8 = r18
            r9 = r19
            goto L_0x07fb
        L_0x081f:
            r18 = r8
            r12[r3] = r2     // Catch:{ all -> 0x0085 }
            int r3 = r3 + 1
            r2 = r45
            r8 = r18
            goto L_0x07da
        L_0x082a:
            r45 = r2
            r6.putParcelableArray(r11, r12)     // Catch:{ all -> 0x0085 }
            goto L_0x084f
        L_0x0830:
            r45 = r2
            java.lang.String r2 = r8.Z()     // Catch:{ all -> 0x0085 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0085 }
            if (r2 != 0) goto L_0x084f
            java.lang.String r2 = r15.Q()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r3 = r8.A()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r3 = (com.google.android.gms.internal.measurement.C7443x2.a) r3     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r8 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x0085 }
            r1.G(r2, r3, r6, r8)     // Catch:{ all -> 0x0085 }
        L_0x084f:
            int r7 = r7 + 1
            r2 = r45
            r24 = r11
            r3 = -1
            r9 = 3
            goto L_0x07a9
        L_0x0859:
            r45 = r2
            r11 = r24
            r15.P()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.N5 r2 = r42.H0()     // Catch:{ all -> 0x0085 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0085 }
            r3.<init>()     // Catch:{ all -> 0x0085 }
            java.util.Set r7 = r6.keySet()     // Catch:{ all -> 0x0085 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0085 }
        L_0x0871:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x089a
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r9 = com.google.android.gms.internal.measurement.C7443x2.X()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r9 = r9.G(r8)     // Catch:{ all -> 0x0085 }
            java.lang.Object r8 = r6.get(r8)     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x0871
            r2.S(r9, r8)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r8 = r9.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r8 = (com.google.android.gms.internal.measurement.L4) r8     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r8 = (com.google.android.gms.internal.measurement.C7443x2) r8     // Catch:{ all -> 0x0085 }
            r3.add(r8)     // Catch:{ all -> 0x0085 }
            goto L_0x0871
        L_0x089a:
            int r2 = r3.size()     // Catch:{ all -> 0x0085 }
            r6 = 0
        L_0x089f:
            if (r6 >= r2) goto L_0x08b1
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0085 }
            int r6 = r6 + 1
            com.google.android.gms.internal.measurement.x2 r7 = (com.google.android.gms.internal.measurement.C7443x2) r7     // Catch:{ all -> 0x0085 }
            r15.H(r7)     // Catch:{ all -> 0x0085 }
            goto L_0x089f
        L_0x08ad:
            r45 = r2
            r11 = r24
        L_0x08b1:
            java.util.List<com.google.android.gms.internal.measurement.v2> r2 = r5.f50530c     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r3 = r15.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r3 = (com.google.android.gms.internal.measurement.L4) r3     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r3 = (com.google.android.gms.internal.measurement.C7427v2) r3     // Catch:{ all -> 0x0085 }
            r6 = r21
            r2.set(r6, r3)     // Catch:{ all -> 0x0085 }
            int r12 = r44 + 1
            r4.K(r15)     // Catch:{ all -> 0x0085 }
            r8 = r45
            r7 = r16
            r9 = r26
            r10 = r27
        L_0x08cd:
            int r2 = r6 + 1
            r24 = r11
            r3 = r25
            r11 = r2
            r2 = r23
            goto L_0x0276
        L_0x08d8:
            r2 = 0
            r8 = r44
            r10 = r2
            r9 = 0
        L_0x08de:
            if (r9 >= r8) goto L_0x092d
            com.google.android.gms.internal.measurement.v2 r13 = r4.A(r9)     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = r13.X()     // Catch:{ all -> 0x0085 }
            boolean r14 = r7.equals(r14)     // Catch:{ all -> 0x0085 }
            if (r14 == 0) goto L_0x0900
            r42.H0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r14 = com.google.android.gms.measurement.internal.N5.D(r13, r6)     // Catch:{ all -> 0x0085 }
            if (r14 == 0) goto L_0x0900
            r4.a0(r9)     // Catch:{ all -> 0x0085 }
            int r8 = r8 + -1
            int r9 = r9 + -1
        L_0x08fe:
            r13 = 1
            goto L_0x092b
        L_0x0900:
            r42.H0()     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = "_et"
            com.google.android.gms.internal.measurement.x2 r13 = com.google.android.gms.measurement.internal.N5.D(r13, r14)     // Catch:{ all -> 0x0085 }
            if (r13 == 0) goto L_0x08fe
            boolean r14 = r13.e0()     // Catch:{ all -> 0x0085 }
            if (r14 == 0) goto L_0x091a
            long r13 = r13.V()     // Catch:{ all -> 0x0085 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0085 }
            goto L_0x091b
        L_0x091a:
            r13 = 0
        L_0x091b:
            if (r13 == 0) goto L_0x08fe
            long r14 = r13.longValue()     // Catch:{ all -> 0x0085 }
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x08fe
            long r13 = r13.longValue()     // Catch:{ all -> 0x0085 }
            long r10 = r10 + r13
            goto L_0x08fe
        L_0x092b:
            int r9 = r9 + r13
            goto L_0x08de
        L_0x092d:
            r6 = 0
            r1.s(r4, r10, r6)     // Catch:{ all -> 0x0085 }
            java.util.List r6 = r4.T()     // Catch:{ all -> 0x0085 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0085 }
        L_0x0939:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x095e
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r7 = (com.google.android.gms.internal.measurement.C7427v2) r7     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = "_s"
            java.lang.String r7 = r7.X()     // Catch:{ all -> 0x0085 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0939
            com.google.android.gms.measurement.internal.p r6 = r42.u0()     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = r4.u1()     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = "_se"
            r6.a1(r7, r8)     // Catch:{ all -> 0x0085 }
        L_0x095e:
            java.lang.String r6 = "_sid"
            int r6 = com.google.android.gms.measurement.internal.N5.w(r4, r6)     // Catch:{ all -> 0x0085 }
            if (r6 < 0) goto L_0x096b
            r6 = 1
            r1.s(r4, r10, r6)     // Catch:{ all -> 0x0085 }
            goto L_0x098d
        L_0x096b:
            java.lang.String r6 = "_se"
            int r6 = com.google.android.gms.measurement.internal.N5.w(r4, r6)     // Catch:{ all -> 0x0085 }
            if (r6 < 0) goto L_0x098d
            r4.g0(r6)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.h2 r6 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r6 = r6.E()     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.A2 r8 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x0085 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0085 }
            r6.b(r7, r8)     // Catch:{ all -> 0x0085 }
        L_0x098d:
            com.google.android.gms.internal.measurement.A2 r6 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r6 = r6.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.J2 r7 = r42.q()     // Catch:{ all -> 0x0085 }
            r7.k()     // Catch:{ all -> 0x0085 }
            r42.L0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r7 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.r2 r7 = r7.S0(r6)     // Catch:{ all -> 0x0085 }
            if (r7 != 0) goto L_0x09b9
            com.google.android.gms.measurement.internal.h2 r7 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r7 = r7.E()     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = "Cannot fix consent fields without appInfo. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7607h2.t(r6)     // Catch:{ all -> 0x0085 }
            r7.b(r8, r6)     // Catch:{ all -> 0x0085 }
            goto L_0x09bc
        L_0x09b9:
            r1.x(r7, r4)     // Catch:{ all -> 0x0085 }
        L_0x09bc:
            com.google.android.gms.internal.measurement.A2 r6 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r6 = r6.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.J2 r7 = r42.q()     // Catch:{ all -> 0x0085 }
            r7.k()     // Catch:{ all -> 0x0085 }
            r42.L0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r7 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.r2 r7 = r7.S0(r6)     // Catch:{ all -> 0x0085 }
            if (r7 != 0) goto L_0x09e8
            com.google.android.gms.measurement.internal.h2 r7 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r7 = r7.J()     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = "Cannot populate ad_campaign_info without appInfo. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7607h2.t(r6)     // Catch:{ all -> 0x0085 }
            r7.b(r8, r6)     // Catch:{ all -> 0x0085 }
            goto L_0x09eb
        L_0x09e8:
            r1.i0(r7, r4)     // Catch:{ all -> 0x0085 }
        L_0x09eb:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.gms.internal.measurement.A2$a r6 = r4.R0(r6)     // Catch:{ all -> 0x0085 }
            r7 = -9223372036854775808
            r6.z0(r7)     // Catch:{ all -> 0x0085 }
            r6 = 0
        L_0x09fa:
            int r7 = r4.f0()     // Catch:{ all -> 0x0085 }
            if (r6 >= r7) goto L_0x0a2d
            com.google.android.gms.internal.measurement.v2 r7 = r4.A(r6)     // Catch:{ all -> 0x0085 }
            long r8 = r7.U()     // Catch:{ all -> 0x0085 }
            long r10 = r4.x0()     // Catch:{ all -> 0x0085 }
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0a17
            long r8 = r7.U()     // Catch:{ all -> 0x0085 }
            r4.R0(r8)     // Catch:{ all -> 0x0085 }
        L_0x0a17:
            long r8 = r7.U()     // Catch:{ all -> 0x0085 }
            long r10 = r4.r0()     // Catch:{ all -> 0x0085 }
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0a2a
            long r7 = r7.U()     // Catch:{ all -> 0x0085 }
            r4.z0(r7)     // Catch:{ all -> 0x0085 }
        L_0x0a2a:
            int r6 = r6 + 1
            goto L_0x09fa
        L_0x0a2d:
            r4.r1()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r6 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r6 = r6.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.q3 r6 = r1.b0(r6)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r7 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = r7.f0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.q3 r7 = com.google.android.gms.measurement.internal.C7671q3.p(r7)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.q3 r6 = r6.d(r7)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r7 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r8 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.q3 r7 = r7.X0(r8)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r8 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r9 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r9.a0()     // Catch:{ all -> 0x0085 }
            r8.b0(r9, r6)     // Catch:{ all -> 0x0085 }
            boolean r8 = r6.x()     // Catch:{ all -> 0x0085 }
            if (r8 != 0) goto L_0x0a7d
            boolean r8 = r7.x()     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x0a7d
            com.google.android.gms.measurement.internal.p r7 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r8 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x0085 }
            r7.j1(r8)     // Catch:{ all -> 0x0085 }
            goto L_0x0a96
        L_0x0a7d:
            boolean r8 = r6.x()     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x0a96
            boolean r7 = r7.x()     // Catch:{ all -> 0x0085 }
            if (r7 != 0) goto L_0x0a96
            com.google.android.gms.measurement.internal.p r7 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r8 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x0085 }
            r7.k1(r8)     // Catch:{ all -> 0x0085 }
        L_0x0a96:
            boolean r7 = r6.w()     // Catch:{ all -> 0x0085 }
            if (r7 != 0) goto L_0x0aa5
            r4.m1()     // Catch:{ all -> 0x0085 }
            r4.g1()     // Catch:{ all -> 0x0085 }
            r4.U0()     // Catch:{ all -> 0x0085 }
        L_0x0aa5:
            boolean r7 = r6.x()     // Catch:{ all -> 0x0085 }
            if (r7 != 0) goto L_0x0ab1
            r4.G0()     // Catch:{ all -> 0x0085 }
            r4.p1()     // Catch:{ all -> 0x0085 }
        L_0x0ab1:
            boolean r7 = com.google.android.gms.internal.measurement.C7297f7.a()     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0cd4
            com.google.android.gms.measurement.internal.i r7 = r42.r0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r8 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.K.f49723Q0     // Catch:{ all -> 0x0085 }
            boolean r7 = r7.F(r8, r9)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0cd4
            r42.I0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r7 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = r7.a0()     // Catch:{ all -> 0x0085 }
            boolean r7 = com.google.android.gms.measurement.internal.Q5.B0(r7)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0cd4
            com.google.android.gms.internal.measurement.A2 r7 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = r7.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.q3 r7 = r1.b0(r7)     // Catch:{ all -> 0x0085 }
            boolean r7 = r7.w()     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0cd4
            com.google.android.gms.internal.measurement.A2 r7 = r5.f50528a     // Catch:{ all -> 0x0085 }
            boolean r7 = r7.u0()     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0cd4
            r7 = 0
        L_0x0af1:
            int r8 = r4.f0()     // Catch:{ all -> 0x0085 }
            if (r7 >= r8) goto L_0x0cd4
            com.google.android.gms.internal.measurement.v2 r8 = r4.A(r7)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r8 = r8.A()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2$a r8 = (com.google.android.gms.internal.measurement.C7427v2.a) r8     // Catch:{ all -> 0x0085 }
            java.util.List r9 = r8.R()     // Catch:{ all -> 0x0085 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0085 }
        L_0x0b09:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0085 }
            if (r10 == 0) goto L_0x0cd0
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r10 = (com.google.android.gms.internal.measurement.C7443x2) r10     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.Z()     // Catch:{ all -> 0x0085 }
            boolean r10 = r12.equals(r10)     // Catch:{ all -> 0x0085 }
            if (r10 == 0) goto L_0x0b09
            com.google.android.gms.internal.measurement.A2 r9 = r5.f50528a     // Catch:{ all -> 0x0085 }
            int r9 = r9.m()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i r10 = r42.r0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r11 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r11.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.K.f49761g0     // Catch:{ all -> 0x0085 }
            int r10 = r10.w(r11, r13)     // Catch:{ all -> 0x0085 }
            if (r9 < r10) goto L_0x0cc5
            com.google.android.gms.measurement.internal.i r9 = r42.r0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Integer> r11 = com.google.android.gms.measurement.internal.K.f49787t0     // Catch:{ all -> 0x0085 }
            int r9 = r9.w(r10, r11)     // Catch:{ all -> 0x0085 }
            if (r9 <= 0) goto L_0x0c2a
            com.google.android.gms.measurement.internal.p r24 = r42.u0()     // Catch:{ all -> 0x0085 }
            long r25 = r42.Q0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r27 = r10.a0()     // Catch:{ all -> 0x0085 }
            r33 = 0
            r34 = 1
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            com.google.android.gms.measurement.internal.q r10 = r24.J(r25, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0085 }
            long r10 = r10.f50293g     // Catch:{ all -> 0x0085 }
            long r13 = (long) r9     // Catch:{ all -> 0x0085 }
            int r9 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x0b8d
            com.google.android.gms.internal.measurement.x2$a r9 = com.google.android.gms.internal.measurement.C7443x2.X()     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = "_tnr"
            com.google.android.gms.internal.measurement.x2$a r9 = r9.G(r10)     // Catch:{ all -> 0x0085 }
            r10 = 1
            com.google.android.gms.internal.measurement.x2$a r9 = r9.C(r10)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r9 = r9.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r9 = (com.google.android.gms.internal.measurement.L4) r9     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r9 = (com.google.android.gms.internal.measurement.C7443x2) r9     // Catch:{ all -> 0x0085 }
            r8.H(r9)     // Catch:{ all -> 0x0085 }
            goto L_0x0cc5
        L_0x0b8d:
            com.google.android.gms.measurement.internal.i r9 = r42.r0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.K.f49727S0     // Catch:{ all -> 0x0085 }
            boolean r9 = r9.F(r10, r11)     // Catch:{ all -> 0x0085 }
            if (r9 == 0) goto L_0x0bc1
            com.google.android.gms.measurement.internal.Q5 r9 = r42.I0()     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r9.P0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r10 = com.google.android.gms.internal.measurement.C7443x2.X()     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = "_tu"
            com.google.android.gms.internal.measurement.x2$a r10 = r10.G(r11)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r10 = r10.I(r9)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r10 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r10 = (com.google.android.gms.internal.measurement.L4) r10     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r10 = (com.google.android.gms.internal.measurement.C7443x2) r10     // Catch:{ all -> 0x0085 }
            r8.H(r10)     // Catch:{ all -> 0x0085 }
            goto L_0x0bc2
        L_0x0bc1:
            r9 = 0
        L_0x0bc2:
            com.google.android.gms.internal.measurement.x2$a r10 = com.google.android.gms.internal.measurement.C7443x2.X()     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = "_tr"
            com.google.android.gms.internal.measurement.x2$a r10 = r10.G(r11)     // Catch:{ all -> 0x0085 }
            r13 = 1
            com.google.android.gms.internal.measurement.x2$a r10 = r10.C(r13)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r10 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r10 = (com.google.android.gms.internal.measurement.L4) r10     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r10 = (com.google.android.gms.internal.measurement.C7443x2) r10     // Catch:{ all -> 0x0085 }
            r8.H(r10)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.N5 r10 = r42.H0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r11 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r11.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.m5 r9 = r10.G(r11, r4, r8, r9)     // Catch:{ all -> 0x0085 }
            if (r9 == 0) goto L_0x0cc5
            com.google.android.gms.measurement.internal.h2 r10 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r10 = r10.I()     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = "Generated trigger URI. appId, uri"
            com.google.android.gms.internal.measurement.A2 r13 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r13 = r13.a0()     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = r9.f50239a     // Catch:{ all -> 0x0085 }
            r10.c(r11, r13, r14)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r10 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r11 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r11.a0()     // Catch:{ all -> 0x0085 }
            r10.p0(r11, r9)     // Catch:{ all -> 0x0085 }
            java.util.Deque<java.lang.String> r9 = r1.f50518q     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x0085 }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x0085 }
            if (r9 != 0) goto L_0x0cc5
            java.util.Deque<java.lang.String> r9 = r1.f50518q     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x0085 }
            r9.add(r10)     // Catch:{ all -> 0x0085 }
            goto L_0x0cc5
        L_0x0c2a:
            com.google.android.gms.measurement.internal.i r9 = r42.r0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.K.f49727S0     // Catch:{ all -> 0x0085 }
            boolean r9 = r9.F(r10, r11)     // Catch:{ all -> 0x0085 }
            if (r9 == 0) goto L_0x0c5e
            com.google.android.gms.measurement.internal.Q5 r9 = r42.I0()     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r9.P0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r10 = com.google.android.gms.internal.measurement.C7443x2.X()     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = "_tu"
            com.google.android.gms.internal.measurement.x2$a r10 = r10.G(r11)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2$a r10 = r10.I(r9)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r10 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r10 = (com.google.android.gms.internal.measurement.L4) r10     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r10 = (com.google.android.gms.internal.measurement.C7443x2) r10     // Catch:{ all -> 0x0085 }
            r8.H(r10)     // Catch:{ all -> 0x0085 }
            goto L_0x0c5f
        L_0x0c5e:
            r9 = 0
        L_0x0c5f:
            com.google.android.gms.internal.measurement.x2$a r10 = com.google.android.gms.internal.measurement.C7443x2.X()     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = "_tr"
            com.google.android.gms.internal.measurement.x2$a r10 = r10.G(r11)     // Catch:{ all -> 0x0085 }
            r13 = 1
            com.google.android.gms.internal.measurement.x2$a r10 = r10.C(r13)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r10 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r10 = (com.google.android.gms.internal.measurement.L4) r10     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r10 = (com.google.android.gms.internal.measurement.C7443x2) r10     // Catch:{ all -> 0x0085 }
            r8.H(r10)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.N5 r10 = r42.H0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r11 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r11.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.m5 r9 = r10.G(r11, r4, r8, r9)     // Catch:{ all -> 0x0085 }
            if (r9 == 0) goto L_0x0cc5
            com.google.android.gms.measurement.internal.h2 r10 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r10 = r10.I()     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = "Generated trigger URI. appId, uri"
            com.google.android.gms.internal.measurement.A2 r13 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r13 = r13.a0()     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = r9.f50239a     // Catch:{ all -> 0x0085 }
            r10.c(r11, r13, r14)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r10 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r11 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r11.a0()     // Catch:{ all -> 0x0085 }
            r10.p0(r11, r9)     // Catch:{ all -> 0x0085 }
            java.util.Deque<java.lang.String> r9 = r1.f50518q     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x0085 }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x0085 }
            if (r9 != 0) goto L_0x0cc5
            java.util.Deque<java.lang.String> r9 = r1.f50518q     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r10 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x0085 }
            r9.add(r10)     // Catch:{ all -> 0x0085 }
        L_0x0cc5:
            com.google.android.gms.internal.measurement.s5 r8 = r8.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r8 = (com.google.android.gms.internal.measurement.L4) r8     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r8 = (com.google.android.gms.internal.measurement.C7427v2) r8     // Catch:{ all -> 0x0085 }
            r4.D(r7, r8)     // Catch:{ all -> 0x0085 }
        L_0x0cd0:
            int r7 = r7 + 1
            goto L_0x0af1
        L_0x0cd4:
            com.google.android.gms.internal.measurement.A2$a r7 = r4.K0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.Y5 r8 = r42.l0()     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r4.u1()     // Catch:{ all -> 0x0085 }
            java.util.List r10 = r4.T()     // Catch:{ all -> 0x0085 }
            java.util.List r11 = r4.V()     // Catch:{ all -> 0x0085 }
            long r12 = r4.x0()     // Catch:{ all -> 0x0085 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0085 }
            long r13 = r4.r0()     // Catch:{ all -> 0x0085 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0085 }
            boolean r6 = r6.x()     // Catch:{ all -> 0x0085 }
            r14 = 1
            r6 = r6 ^ r14
            r14 = r6
            java.util.List r6 = r8.x(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0085 }
            r7.P(r6)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i r6 = r42.r0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r7 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = r7.a0()     // Catch:{ all -> 0x0085 }
            boolean r6 = r6.O(r7)     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x100e
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0085 }
            r6.<init>()     // Catch:{ all -> 0x0085 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0085 }
            r7.<init>()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.Q5 r8 = r42.I0()     // Catch:{ all -> 0x0085 }
            java.security.SecureRandom r8 = r8.R0()     // Catch:{ all -> 0x0085 }
            r9 = 0
        L_0x0d29:
            int r10 = r4.f0()     // Catch:{ all -> 0x0085 }
            if (r9 >= r10) goto L_0x0fd7
            com.google.android.gms.internal.measurement.v2 r10 = r4.A(r9)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4$a r10 = r10.A()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2$a r10 = (com.google.android.gms.internal.measurement.C7427v2.a) r10     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r10.Q()     // Catch:{ all -> 0x0085 }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0085 }
            java.lang.String r12 = "_sr"
            if (r11 == 0) goto L_0x0dc6
            r42.H0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r11 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r11 = (com.google.android.gms.internal.measurement.L4) r11     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r11 = (com.google.android.gms.internal.measurement.C7427v2) r11     // Catch:{ all -> 0x0085 }
            java.lang.String r13 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.N5.d0(r11, r13)     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0085 }
            java.lang.Object r13 = r6.get(r11)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.G r13 = (com.google.android.gms.measurement.internal.G) r13     // Catch:{ all -> 0x0085 }
            if (r13 != 0) goto L_0x0d7b
            com.google.android.gms.measurement.internal.p r13 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r14 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = r14.a0()     // Catch:{ all -> 0x0085 }
            java.lang.Object r15 = K9.C6620s.l(r11)     // Catch:{ all -> 0x0085 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.G r13 = r13.R0(r14, r15)     // Catch:{ all -> 0x0085 }
            if (r13 == 0) goto L_0x0d7b
            r6.put(r11, r13)     // Catch:{ all -> 0x0085 }
        L_0x0d7b:
            if (r13 == 0) goto L_0x0dba
            java.lang.Long r11 = r13.f49636i     // Catch:{ all -> 0x0085 }
            if (r11 != 0) goto L_0x0dba
            java.lang.Long r11 = r13.f49637j     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x0d97
            long r14 = r11.longValue()     // Catch:{ all -> 0x0085 }
            r17 = 1
            int r11 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r11 <= 0) goto L_0x0d97
            r42.H0()     // Catch:{ all -> 0x0085 }
            java.lang.Long r11 = r13.f49637j     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.N5.R(r10, r12, r11)     // Catch:{ all -> 0x0085 }
        L_0x0d97:
            java.lang.Boolean r11 = r13.f49638k     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x0daf
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x0daf
            r42.H0()     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = "_efs"
            r12 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.N5.R(r10, r11, r14)     // Catch:{ all -> 0x0085 }
        L_0x0daf:
            com.google.android.gms.internal.measurement.s5 r11 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r11 = (com.google.android.gms.internal.measurement.L4) r11     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r11 = (com.google.android.gms.internal.measurement.C7427v2) r11     // Catch:{ all -> 0x0085 }
            r7.add(r11)     // Catch:{ all -> 0x0085 }
        L_0x0dba:
            r4.C(r9, r10)     // Catch:{ all -> 0x0085 }
        L_0x0dbd:
            r1 = r4
            r15 = r5
            r45 = r8
            r2 = r9
            r8 = 1
            goto L_0x0fca
        L_0x0dc6:
            com.google.android.gms.measurement.internal.C2 r11 = r42.B0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r13 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r13 = r13.a0()     // Catch:{ all -> 0x0085 }
            long r13 = r11.w(r13)     // Catch:{ all -> 0x0085 }
            r42.I0()     // Catch:{ all -> 0x0085 }
            long r2 = r10.O()     // Catch:{ all -> 0x0085 }
            long r2 = com.google.android.gms.measurement.internal.Q5.w(r2, r13)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r11 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r11 = (com.google.android.gms.internal.measurement.L4) r11     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r11 = (com.google.android.gms.internal.measurement.C7427v2) r11     // Catch:{ all -> 0x0085 }
            java.lang.String r15 = "_dbg"
            r17 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0085 }
            boolean r17 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0085 }
            if (r17 != 0) goto L_0x0e29
            java.util.List r11 = r11.Y()     // Catch:{ all -> 0x0085 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0085 }
        L_0x0dfd:
            boolean r17 = r11.hasNext()     // Catch:{ all -> 0x0085 }
            if (r17 == 0) goto L_0x0e29
            java.lang.Object r17 = r11.next()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.x2 r17 = (com.google.android.gms.internal.measurement.C7443x2) r17     // Catch:{ all -> 0x0085 }
            r45 = r11
            java.lang.String r11 = r17.Z()     // Catch:{ all -> 0x0085 }
            boolean r11 = r15.equals(r11)     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x0e26
            long r17 = r17.V()     // Catch:{ all -> 0x0085 }
            java.lang.Long r11 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0085 }
            boolean r1 = r1.equals(r11)     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x0e24
            goto L_0x0e29
        L_0x0e24:
            r11 = 1
            goto L_0x0e3c
        L_0x0e26:
            r11 = r45
            goto L_0x0dfd
        L_0x0e29:
            com.google.android.gms.measurement.internal.C2 r1 = r42.B0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r11 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r11.a0()     // Catch:{ all -> 0x0085 }
            java.lang.String r15 = r10.Q()     // Catch:{ all -> 0x0085 }
            int r1 = r1.G(r11, r15)     // Catch:{ all -> 0x0085 }
            r11 = r1
        L_0x0e3c:
            if (r11 > 0) goto L_0x0e63
            com.google.android.gms.measurement.internal.h2 r1 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r1 = r1.J()     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "Sample rate must be positive. event, rate"
            java.lang.String r3 = r10.Q()     // Catch:{ all -> 0x0085 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0085 }
            r1.c(r2, r3, r11)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r1 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r1 = (com.google.android.gms.internal.measurement.L4) r1     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r1 = (com.google.android.gms.internal.measurement.C7427v2) r1     // Catch:{ all -> 0x0085 }
            r7.add(r1)     // Catch:{ all -> 0x0085 }
            r4.C(r9, r10)     // Catch:{ all -> 0x0085 }
            goto L_0x0dbd
        L_0x0e63:
            java.lang.String r1 = r10.Q()     // Catch:{ all -> 0x0085 }
            java.lang.Object r1 = r6.get(r1)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.G r1 = (com.google.android.gms.measurement.internal.G) r1     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x0ec2
            com.google.android.gms.measurement.internal.p r1 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r15 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r15 = r15.a0()     // Catch:{ all -> 0x0085 }
            r17 = r13
            java.lang.String r13 = r10.Q()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.G r1 = r1.R0(r15, r13)     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x0ec4
            com.google.android.gms.measurement.internal.h2 r1 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r1 = r1.J()     // Catch:{ all -> 0x0085 }
            java.lang.String r13 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.A2 r14 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = r14.a0()     // Catch:{ all -> 0x0085 }
            java.lang.String r15 = r10.Q()     // Catch:{ all -> 0x0085 }
            r1.c(r13, r14, r15)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.G r1 = new com.google.android.gms.measurement.internal.G     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r13 = r5.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r25 = r13.a0()     // Catch:{ all -> 0x0085 }
            java.lang.String r26 = r10.Q()     // Catch:{ all -> 0x0085 }
            long r33 = r10.O()     // Catch:{ all -> 0x0085 }
            r39 = 0
            r40 = 0
            r27 = 1
            r29 = 1
            r31 = 1
            r35 = 0
            r37 = 0
            r38 = 0
            r24 = r1
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x0085 }
            goto L_0x0ec4
        L_0x0ec2:
            r17 = r13
        L_0x0ec4:
            r42.H0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r13 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r13 = (com.google.android.gms.internal.measurement.L4) r13     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r13 = (com.google.android.gms.internal.measurement.C7427v2) r13     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = "_eid"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.N5.d0(r13, r14)     // Catch:{ all -> 0x0085 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x0085 }
            if (r13 == 0) goto L_0x0edc
            r14 = 1
        L_0x0eda:
            r15 = 1
            goto L_0x0ede
        L_0x0edc:
            r14 = 0
            goto L_0x0eda
        L_0x0ede:
            if (r11 != r15) goto L_0x0f0a
            com.google.android.gms.internal.measurement.s5 r2 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r2 = (com.google.android.gms.internal.measurement.L4) r2     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r2 = (com.google.android.gms.internal.measurement.C7427v2) r2     // Catch:{ all -> 0x0085 }
            r7.add(r2)     // Catch:{ all -> 0x0085 }
            if (r14 == 0) goto L_0x0f05
            java.lang.Long r2 = r1.f49636i     // Catch:{ all -> 0x0085 }
            if (r2 != 0) goto L_0x0ef9
            java.lang.Long r2 = r1.f49637j     // Catch:{ all -> 0x0085 }
            if (r2 != 0) goto L_0x0ef9
            java.lang.Boolean r2 = r1.f49638k     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0f05
        L_0x0ef9:
            r2 = 0
            com.google.android.gms.measurement.internal.G r1 = r1.c(r2, r2, r2)     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r10.Q()     // Catch:{ all -> 0x0085 }
            r6.put(r2, r1)     // Catch:{ all -> 0x0085 }
        L_0x0f05:
            r4.C(r9, r10)     // Catch:{ all -> 0x0085 }
            goto L_0x0dbd
        L_0x0f0a:
            int r15 = r8.nextInt(r11)     // Catch:{ all -> 0x0085 }
            if (r15 != 0) goto L_0x0f4c
            r42.H0()     // Catch:{ all -> 0x0085 }
            r22 = r4
            r15 = r5
            long r4 = (long) r11     // Catch:{ all -> 0x0085 }
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.N5.R(r10, r12, r11)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r11 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r11 = (com.google.android.gms.internal.measurement.L4) r11     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r11 = (com.google.android.gms.internal.measurement.C7427v2) r11     // Catch:{ all -> 0x0085 }
            r7.add(r11)     // Catch:{ all -> 0x0085 }
            if (r14 == 0) goto L_0x0f34
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0085 }
            r5 = 0
            com.google.android.gms.measurement.internal.G r1 = r1.c(r5, r4, r5)     // Catch:{ all -> 0x0085 }
        L_0x0f34:
            java.lang.String r4 = r10.Q()     // Catch:{ all -> 0x0085 }
            long r11 = r10.O()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.G r1 = r1.b(r11, r2)     // Catch:{ all -> 0x0085 }
            r6.put(r4, r1)     // Catch:{ all -> 0x0085 }
            r45 = r8
            r2 = r9
            r1 = r22
            r8 = 1
            goto L_0x0fc7
        L_0x0f4c:
            r22 = r4
            r15 = r5
            java.lang.Long r4 = r1.f49635h     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x0f5c
            long r4 = r4.longValue()     // Catch:{ all -> 0x0085 }
            r45 = r8
            r21 = r9
            goto L_0x0f6d
        L_0x0f5c:
            r42.I0()     // Catch:{ all -> 0x0085 }
            long r4 = r10.L()     // Catch:{ all -> 0x0085 }
            r45 = r8
            r21 = r9
            r8 = r17
            long r4 = com.google.android.gms.measurement.internal.Q5.w(r4, r8)     // Catch:{ all -> 0x0085 }
        L_0x0f6d:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0fb6
            r42.H0()     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "_efs"
            r8 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.N5.R(r10, r4, r5)     // Catch:{ all -> 0x0085 }
            r42.H0()     // Catch:{ all -> 0x0085 }
            long r4 = (long) r11     // Catch:{ all -> 0x0085 }
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.N5.R(r10, r12, r11)     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r11 = r10.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r11 = (com.google.android.gms.internal.measurement.L4) r11     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.v2 r11 = (com.google.android.gms.internal.measurement.C7427v2) r11     // Catch:{ all -> 0x0085 }
            r7.add(r11)     // Catch:{ all -> 0x0085 }
            if (r14 == 0) goto L_0x0fa2
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0085 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0085 }
            r11 = 0
            com.google.android.gms.measurement.internal.G r1 = r1.c(r11, r4, r5)     // Catch:{ all -> 0x0085 }
        L_0x0fa2:
            java.lang.String r4 = r10.Q()     // Catch:{ all -> 0x0085 }
            long r11 = r10.O()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.G r1 = r1.b(r11, r2)     // Catch:{ all -> 0x0085 }
            r6.put(r4, r1)     // Catch:{ all -> 0x0085 }
        L_0x0fb1:
            r2 = r21
            r1 = r22
            goto L_0x0fc7
        L_0x0fb6:
            r8 = 1
            if (r14 == 0) goto L_0x0fb1
            java.lang.String r2 = r10.Q()     // Catch:{ all -> 0x0085 }
            r3 = 0
            com.google.android.gms.measurement.internal.G r1 = r1.c(r13, r3, r3)     // Catch:{ all -> 0x0085 }
            r6.put(r2, r1)     // Catch:{ all -> 0x0085 }
            goto L_0x0fb1
        L_0x0fc7:
            r1.C(r2, r10)     // Catch:{ all -> 0x0085 }
        L_0x0fca:
            int r2 = r2 + 1
            r8 = r45
            r4 = r1
            r9 = r2
            r5 = r15
            r2 = 0
            r1 = r42
            goto L_0x0d29
        L_0x0fd7:
            r1 = r4
            r15 = r5
            int r2 = r7.size()     // Catch:{ all -> 0x0085 }
            int r3 = r1.f0()     // Catch:{ all -> 0x0085 }
            if (r2 >= r3) goto L_0x0fea
            com.google.android.gms.internal.measurement.A2$a r2 = r1.Z0()     // Catch:{ all -> 0x0085 }
            r2.c0(r7)     // Catch:{ all -> 0x0085 }
        L_0x0fea:
            java.util.Set r2 = r6.entrySet()     // Catch:{ all -> 0x0085 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0085 }
        L_0x0ff2:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x100c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0085 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r4 = r42.u0()     // Catch:{ all -> 0x0085 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.G r3 = (com.google.android.gms.measurement.internal.G) r3     // Catch:{ all -> 0x0085 }
            r4.W(r3)     // Catch:{ all -> 0x0085 }
            goto L_0x0ff2
        L_0x100c:
            r2 = r15
            goto L_0x1010
        L_0x100e:
            r1 = r4
            r2 = r5
        L_0x1010:
            com.google.android.gms.internal.measurement.A2 r3 = r2.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r3 = r3.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r4 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.r2 r4 = r4.S0(r3)     // Catch:{ all -> 0x0085 }
            if (r4 != 0) goto L_0x1038
            com.google.android.gms.measurement.internal.h2 r4 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r4 = r4.E()     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.A2 r6 = r2.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r6 = r6.a0()     // Catch:{ all -> 0x0085 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7607h2.t(r6)     // Catch:{ all -> 0x0085 }
            r4.b(r5, r6)     // Catch:{ all -> 0x0085 }
            goto L_0x10a1
        L_0x1038:
            int r5 = r1.f0()     // Catch:{ all -> 0x0085 }
            if (r5 <= 0) goto L_0x10a1
            long r5 = r4.E0()     // Catch:{ all -> 0x0085 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x104c
            r1.I0(r5)     // Catch:{ all -> 0x0085 }
            goto L_0x104f
        L_0x104c:
            r1.i1()     // Catch:{ all -> 0x0085 }
        L_0x104f:
            long r7 = r4.I0()     // Catch:{ all -> 0x0085 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x105a
            goto L_0x105b
        L_0x105a:
            r5 = r7
        L_0x105b:
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x1063
            r1.M0(r5)     // Catch:{ all -> 0x0085 }
            goto L_0x1066
        L_0x1063:
            r1.k1()     // Catch:{ all -> 0x0085 }
        L_0x1066:
            int r5 = r1.f0()     // Catch:{ all -> 0x0085 }
            long r5 = (long) r5     // Catch:{ all -> 0x0085 }
            r4.c(r5)     // Catch:{ all -> 0x0085 }
            long r5 = r4.C0()     // Catch:{ all -> 0x0085 }
            int r5 = (int) r5     // Catch:{ all -> 0x0085 }
            r1.C0(r5)     // Catch:{ all -> 0x0085 }
            long r5 = r4.G0()     // Catch:{ all -> 0x0085 }
            int r5 = (int) r5     // Catch:{ all -> 0x0085 }
            r1.y0(r5)     // Catch:{ all -> 0x0085 }
            long r5 = r1.x0()     // Catch:{ all -> 0x0085 }
            r4.D0(r5)     // Catch:{ all -> 0x0085 }
            long r5 = r1.r0()     // Catch:{ all -> 0x0085 }
            r4.z0(r5)     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = r4.k()     // Catch:{ all -> 0x0085 }
            if (r5 == 0) goto L_0x1096
            r1.h1(r5)     // Catch:{ all -> 0x0085 }
            goto L_0x1099
        L_0x1096:
            r1.d1()     // Catch:{ all -> 0x0085 }
        L_0x1099:
            com.google.android.gms.measurement.internal.p r5 = r42.u0()     // Catch:{ all -> 0x0085 }
            r6 = 0
            r5.X(r4, r6, r6)     // Catch:{ all -> 0x0085 }
        L_0x10a1:
            int r4 = r1.f0()     // Catch:{ all -> 0x0085 }
            if (r4 <= 0) goto L_0x1100
            com.google.android.gms.measurement.internal.C2 r4 = r42.B0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r5 = r2.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = r5.a0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.i2 r4 = r4.K(r5)     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x10c6
            boolean r5 = r4.c0()     // Catch:{ all -> 0x0085 }
            if (r5 != 0) goto L_0x10be
            goto L_0x10c6
        L_0x10be:
            long r4 = r4.N()     // Catch:{ all -> 0x0085 }
            r1.h0(r4)     // Catch:{ all -> 0x0085 }
            goto L_0x10ef
        L_0x10c6:
            com.google.android.gms.internal.measurement.A2 r4 = r2.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = r4.J()     // Catch:{ all -> 0x0085 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x10d8
            r4 = -1
            r1.h0(r4)     // Catch:{ all -> 0x0085 }
            goto L_0x10ef
        L_0x10d8:
            com.google.android.gms.measurement.internal.h2 r4 = r42.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r4 = r4.J()     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.A2 r6 = r2.f50528a     // Catch:{ all -> 0x0085 }
            java.lang.String r6 = r6.a0()     // Catch:{ all -> 0x0085 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7607h2.t(r6)     // Catch:{ all -> 0x0085 }
            r4.b(r5, r6)     // Catch:{ all -> 0x0085 }
        L_0x10ef:
            com.google.android.gms.measurement.internal.p r4 = r42.u0()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.s5 r1 = r1.s()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.L4 r1 = (com.google.android.gms.internal.measurement.L4) r1     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.A2 r1 = (com.google.android.gms.internal.measurement.A2) r1     // Catch:{ all -> 0x0085 }
            r7 = r16
            r4.h0(r1, r7)     // Catch:{ all -> 0x0085 }
        L_0x1100:
            com.google.android.gms.measurement.internal.p r1 = r42.u0()     // Catch:{ all -> 0x0085 }
            java.util.List<java.lang.Long> r2 = r2.f50529b     // Catch:{ all -> 0x0085 }
            K9.C6620s.l(r2)     // Catch:{ all -> 0x0085 }
            r1.k()     // Catch:{ all -> 0x0085 }
            r1.s()     // Catch:{ all -> 0x0085 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = "rowid in ("
            r4.<init>(r5)     // Catch:{ all -> 0x0085 }
            r14 = 0
        L_0x1117:
            int r5 = r2.size()     // Catch:{ all -> 0x0085 }
            if (r14 >= r5) goto L_0x1134
            if (r14 == 0) goto L_0x1124
            java.lang.String r5 = ","
            r4.append(r5)     // Catch:{ all -> 0x0085 }
        L_0x1124:
            java.lang.Object r5 = r2.get(r14)     // Catch:{ all -> 0x0085 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0085 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0085 }
            r4.append(r5)     // Catch:{ all -> 0x0085 }
            int r14 = r14 + 1
            goto L_0x1117
        L_0x1134:
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x0085 }
            android.database.sqlite.SQLiteDatabase r5 = r1.z()     // Catch:{ all -> 0x0085 }
            java.lang.String r6 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0085 }
            r7 = 0
            int r4 = r5.delete(r6, r4, r7)     // Catch:{ all -> 0x0085 }
            int r5 = r2.size()     // Catch:{ all -> 0x0085 }
            if (r4 == r5) goto L_0x1167
            com.google.android.gms.measurement.internal.h2 r1 = r1.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r1 = r1.E()     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0085 }
            int r2 = r2.size()     // Catch:{ all -> 0x0085 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0085 }
            r1.c(r5, r4, r2)     // Catch:{ all -> 0x0085 }
        L_0x1167:
            com.google.android.gms.measurement.internal.p r1 = r42.u0()     // Catch:{ all -> 0x0085 }
            android.database.sqlite.SQLiteDatabase r2 = r1.z()     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            java.lang.String[] r5 = new java.lang.String[]{r3, r3}     // Catch:{ SQLiteException -> 0x1179 }
            r2.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x1179 }
            goto L_0x118c
        L_0x1179:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.h2 r1 = r1.f()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.i2 r1 = r1.E()     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7607h2.t(r3)     // Catch:{ all -> 0x0085 }
            r1.c(r4, r3, r2)     // Catch:{ all -> 0x0085 }
        L_0x118c:
            com.google.android.gms.measurement.internal.p r1 = r42.u0()     // Catch:{ all -> 0x0085 }
            r1.q1()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r1 = r42.u0()
            r1.o1()
            r1 = 1
            return r1
        L_0x119c:
            com.google.android.gms.measurement.internal.p r1 = r42.u0()     // Catch:{ all -> 0x0085 }
            r1.q1()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.measurement.internal.p r1 = r42.u0()
            r1.o1()
            r1 = 0
            return r1
        L_0x11ac:
            if (r6 == 0) goto L_0x11b1
            r6.close()     // Catch:{ all -> 0x0085 }
        L_0x11b1:
            throw r1     // Catch:{ all -> 0x0085 }
        L_0x11b2:
            com.google.android.gms.measurement.internal.p r2 = r42.u0()
            r2.o1()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7728y5.j0(java.lang.String, long):boolean");
    }

    public static C7728y5 k(Context context) {
        C6620s.l(context);
        C6620s.l(context.getApplicationContext());
        if (f50491K == null) {
            synchronized (C7728y5.class) {
                try {
                    if (f50491K == null) {
                        f50491K = new C7728y5((K5) C6620s.l(new K5(context)));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f50491K;
    }

    private final E5 k0(String str) {
        String str2 = str;
        C7676r2 S02 = u0().S0(str2);
        if (S02 == null || TextUtils.isEmpty(S02.o())) {
            f().D().b("No app data available; dropping", str2);
            return null;
        }
        Boolean l10 = l(S02);
        if (l10 == null || l10.booleanValue()) {
            return new E5(str, S02.q(), S02.o(), S02.V(), S02.n(), S02.A0(), S02.u0(), (String) null, S02.A(), false, S02.p(), 0, 0, S02.z(), false, S02.j(), S02.L0(), S02.w0(), S02.w(), (String) null, b0(str).v(), "", (String) null, S02.C(), S02.K0(), b0(str).b(), p0(str).j(), S02.a(), S02.Y(), S02.v(), S02.t(), 0, S02.F());
        }
        f().E().b("App version does not match; dropping. appId", C7607h2.t(str));
        return null;
    }

    private final Boolean l(C7676r2 r2Var) {
        try {
            if (r2Var.V() != -2147483648L) {
                if (r2Var.V() == ((long) S9.c.a(this.f50513l.zza()).e(r2Var.l(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = S9.c.a(this.f50513l.zza()).e(r2Var.l(), 0).versionName;
                String o10 = r2Var.o();
                if (o10 != null && o10.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final String m(C7671q3 q3Var) {
        if (!q3Var.x()) {
            return null;
        }
        byte[] bArr = new byte[16];
        I0().R0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x04b9: MOVE  (r5v20 java.lang.String) = (r27v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x04d1 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0361 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04dd A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0518 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x058d A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x05d9 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x05e6 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x05f3 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0600 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x060e A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x061f A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0677 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0713 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0725 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x076b A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x07ab A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x07be A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0821 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x083a A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x089c A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x08c4 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x08e2 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0958 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x09b4 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a8 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0221 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02e0 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0182 }] */
    private final void m0(com.google.android.gms.measurement.internal.J r38, com.google.android.gms.measurement.internal.E5 r39) {
        /*
            r37 = this;
            r1 = r37
            r2 = r38
            r3 = r39
            java.lang.String r4 = "_fx"
            java.lang.String r5 = "_sno"
            K9.C6620s.l(r39)
            java.lang.String r6 = r3.f49596a
            K9.C6620s.f(r6)
            long r6 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.J2 r8 = r37.q()
            r8.k()
            r37.L0()
            java.lang.String r8 = r3.f49596a
            r37.H0()
            boolean r9 = com.google.android.gms.measurement.internal.N5.b0(r38, r39)
            if (r9 != 0) goto L_0x002c
            return
        L_0x002c:
            boolean r9 = r3.f49603h
            if (r9 != 0) goto L_0x0034
            r1.g(r3)
            return
        L_0x0034:
            com.google.android.gms.measurement.internal.C2 r9 = r37.B0()
            java.lang.String r10 = r2.f49672a
            boolean r9 = r9.O(r8, r10)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r9 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.h2 r3 = r37.f()
            com.google.android.gms.measurement.internal.i2 r3 = r3.J()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7607h2.t(r8)
            com.google.android.gms.measurement.internal.P2 r5 = r1.f50513l
            com.google.android.gms.measurement.internal.e2 r5 = r5.C()
            java.lang.String r6 = r2.f49672a
            java.lang.String r5 = r5.c(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.c(r6, r4, r5)
            com.google.android.gms.measurement.internal.C2 r3 = r37.B0()
            boolean r3 = r3.W(r8)
            if (r3 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.C2 r3 = r37.B0()
            boolean r3 = r3.Y(r8)
            if (r3 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r3 = 0
            goto L_0x0078
        L_0x0077:
            r3 = 1
        L_0x0078:
            if (r3 != 0) goto L_0x0095
            java.lang.String r4 = r2.f49672a
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x0095
            r37.I0()
            com.google.android.gms.measurement.internal.S5 r9 = r1.f50501J
            java.lang.String r13 = r2.f49672a
            r2 = 0
            r11 = 11
            java.lang.String r12 = "_ev"
            r10 = r8
            r4 = r14
            r14 = r2
            com.google.android.gms.measurement.internal.Q5.X(r9, r10, r11, r12, r13, r14)
            goto L_0x0096
        L_0x0095:
            r4 = r14
        L_0x0096:
            if (r3 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.p r2 = r37.u0()
            com.google.android.gms.measurement.internal.r2 r2 = r2.S0(r8)
            if (r2 == 0) goto L_0x00de
            long r5 = r2.y0()
            long r7 = r2.b0()
            long r5 = java.lang.Math.max(r5, r7)
            com.google.android.gms.common.util.e r3 = r37.zzb()
            long r7 = r3.a()
            long r7 = r7 - r5
            long r5 = java.lang.Math.abs(r7)
            r37.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Long> r3 = com.google.android.gms.measurement.internal.K.f49708J
            java.lang.Object r3 = r3.a(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.h2 r3 = r37.f()
            com.google.android.gms.measurement.internal.i2 r3 = r3.D()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.a(r4)
            r1.h0(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.k2 r2 = com.google.android.gms.measurement.internal.C7628k2.b(r38)
            com.google.android.gms.measurement.internal.Q5 r9 = r37.I0()
            com.google.android.gms.measurement.internal.i r10 = r37.r0()
            int r10 = r10.v(r8)
            r9.U(r2, r10)
            com.google.android.gms.measurement.internal.i r9 = r37.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.K.f49746b0
            r11 = 10
            r12 = 35
            int r9 = r9.n(r8, r10, r11, r12)
            java.util.TreeSet r10 = new java.util.TreeSet
            android.os.Bundle r11 = r2.f50206d
            java.util.Set r11 = r11.keySet()
            r10.<init>(r11)
            java.util.Iterator r10 = r10.iterator()
        L_0x010f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0131
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "items"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.Q5 r12 = r37.I0()
            android.os.Bundle r13 = r2.f50206d
            android.os.Parcelable[] r11 = r13.getParcelableArray(r11)
            r12.Z(r11, r9)
            goto L_0x010f
        L_0x0131:
            com.google.android.gms.measurement.internal.J r2 = r2.a()
            com.google.android.gms.measurement.internal.h2 r9 = r37.f()
            r10 = 2
            boolean r9 = r9.A(r10)
            if (r9 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.h2 r9 = r37.f()
            com.google.android.gms.measurement.internal.i2 r9 = r9.I()
            com.google.android.gms.measurement.internal.P2 r10 = r1.f50513l
            com.google.android.gms.measurement.internal.e2 r10 = r10.C()
            java.lang.String r10 = r10.b(r2)
            java.lang.String r11 = "Logging event"
            r9.b(r11, r10)
        L_0x0157:
            com.google.android.gms.measurement.internal.p r9 = r37.u0()
            r9.l1()
            r1.g(r3)     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r10 = r2.f49672a     // Catch:{ all -> 0x0182 }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x0186
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f49672a     // Catch:{ all -> 0x0182 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0182 }
            if (r9 != 0) goto L_0x0186
            java.lang.String r9 = r2.f49672a     // Catch:{ all -> 0x0182 }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x0180
            goto L_0x0186
        L_0x0180:
            r9 = 0
            goto L_0x0187
        L_0x0182:
            r0 = move-exception
            r2 = r0
            goto L_0x09ff
        L_0x0186:
            r9 = 1
        L_0x0187:
            java.lang.String r11 = "_iap"
            java.lang.String r12 = r2.f49672a     // Catch:{ all -> 0x0182 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0182 }
            java.lang.String r13 = "value"
            if (r11 != 0) goto L_0x019e
            if (r9 == 0) goto L_0x0196
            goto L_0x019e
        L_0x0196:
            r24 = r6
            r27 = r13
            r7 = r15
        L_0x019b:
            r6 = 1
            goto L_0x0316
        L_0x019e:
            com.google.android.gms.measurement.internal.F r11 = r2.f49673b     // Catch:{ all -> 0x0182 }
            java.lang.String r12 = "currency"
            java.lang.String r11 = r11.E0(r12)     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x020f
            com.google.android.gms.measurement.internal.F r9 = r2.f49673b     // Catch:{ all -> 0x0182 }
            java.lang.Double r9 = r9.F(r13)     // Catch:{ all -> 0x0182 }
            double r18 = r9.doubleValue()     // Catch:{ all -> 0x0182 }
            r20 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r18 = r18 * r20
            r22 = 0
            int r9 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r9 != 0) goto L_0x01cf
            com.google.android.gms.measurement.internal.F r9 = r2.f49673b     // Catch:{ all -> 0x0182 }
            java.lang.Long r9 = r9.U(r13)     // Catch:{ all -> 0x0182 }
            r22 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0182 }
            double r14 = (double) r14     // Catch:{ all -> 0x0182 }
            double r18 = r14 * r20
            goto L_0x01d1
        L_0x01cf:
            r22 = r15
        L_0x01d1:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r9 > 0) goto L_0x01eb
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r9 < 0) goto L_0x01eb
            long r14 = java.lang.Math.round(r18)     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r2.f49672a     // Catch:{ all -> 0x0182 }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x021b
            long r14 = -r14
            goto L_0x021b
        L_0x01eb:
            com.google.android.gms.measurement.internal.h2 r2 = r37.f()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.J()     // Catch:{ all -> 0x0182 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0182 }
            java.lang.Double r5 = java.lang.Double.valueOf(r18)     // Catch:{ all -> 0x0182 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r2 = r37.u0()     // Catch:{ all -> 0x0182 }
            r2.q1()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r2 = r37.u0()
            r2.o1()
            return
        L_0x020f:
            r22 = r15
            com.google.android.gms.measurement.internal.F r9 = r2.f49673b     // Catch:{ all -> 0x0182 }
            java.lang.Long r9 = r9.U(r13)     // Catch:{ all -> 0x0182 }
            long r14 = r9.longValue()     // Catch:{ all -> 0x0182 }
        L_0x021b:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0182 }
            if (r9 != 0) goto L_0x030e
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = "[A-Z]{3}"
            boolean r10 = r9.matches(r10)     // Catch:{ all -> 0x0182 }
            if (r10 == 0) goto L_0x030e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0182 }
            java.lang.String r11 = "_ltv_"
            r10.<init>(r11)     // Catch:{ all -> 0x0182 }
            r10.append(r9)     // Catch:{ all -> 0x0182 }
            java.lang.String r12 = r10.toString()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r9 = r37.u0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.R5 r9 = r9.U0(r8, r12)     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x024d
            java.lang.Object r9 = r9.f49946e     // Catch:{ all -> 0x0182 }
            boolean r10 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0182 }
            if (r10 != 0) goto L_0x0255
        L_0x024d:
            r24 = r6
            r27 = r13
            r7 = r22
            r6 = 1
            goto L_0x0280
        L_0x0255:
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0182 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.R5 r18 = new com.google.android.gms.measurement.internal.R5     // Catch:{ all -> 0x0182 }
            java.lang.String r11 = r2.f49674c     // Catch:{ all -> 0x0182 }
            com.google.android.gms.common.util.e r19 = r37.zzb()     // Catch:{ all -> 0x0182 }
            long r19 = r19.a()     // Catch:{ all -> 0x0182 }
            long r9 = r9 + r14
            java.lang.Long r15 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0182 }
            r9 = r18
            r10 = r8
            r14 = 0
            r24 = r6
            r27 = r13
            r6 = 1
            r7 = 0
            r13 = r19
            r7 = r22
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0182 }
        L_0x027d:
            r9 = r18
            goto L_0x02d6
        L_0x0280:
            com.google.android.gms.measurement.internal.p r9 = r37.u0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i r10 = r37.r0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Integer> r11 = com.google.android.gms.measurement.internal.K.f49720P     // Catch:{ all -> 0x0182 }
            int r10 = r10.w(r8, r11)     // Catch:{ all -> 0x0182 }
            int r10 = r10 - r6
            K9.C6620s.f(r8)     // Catch:{ all -> 0x0182 }
            r9.k()     // Catch:{ all -> 0x0182 }
            r9.s()     // Catch:{ all -> 0x0182 }
            android.database.sqlite.SQLiteDatabase r11 = r9.z()     // Catch:{ SQLiteException -> 0x02aa }
            java.lang.String r13 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);"
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x02aa }
            java.lang.String[] r10 = new java.lang.String[]{r8, r8, r10}     // Catch:{ SQLiteException -> 0x02aa }
            r11.execSQL(r13, r10)     // Catch:{ SQLiteException -> 0x02aa }
            goto L_0x02bd
        L_0x02aa:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.h2 r9 = r9.f()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i2 r9 = r9.E()     // Catch:{ all -> 0x0182 }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0182 }
            r9.c(r11, r13, r10)     // Catch:{ all -> 0x0182 }
        L_0x02bd:
            com.google.android.gms.measurement.internal.R5 r18 = new com.google.android.gms.measurement.internal.R5     // Catch:{ all -> 0x0182 }
            java.lang.String r11 = r2.f49674c     // Catch:{ all -> 0x0182 }
            com.google.android.gms.common.util.e r9 = r37.zzb()     // Catch:{ all -> 0x0182 }
            long r16 = r9.a()     // Catch:{ all -> 0x0182 }
            java.lang.Long r15 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0182 }
            r9 = r18
            r10 = r8
            r13 = r16
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0182 }
            goto L_0x027d
        L_0x02d6:
            com.google.android.gms.measurement.internal.p r10 = r37.u0()     // Catch:{ all -> 0x0182 }
            boolean r10 = r10.k0(r9)     // Catch:{ all -> 0x0182 }
            if (r10 != 0) goto L_0x0316
            com.google.android.gms.measurement.internal.h2 r10 = r37.f()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i2 r10 = r10.E()     // Catch:{ all -> 0x0182 }
            java.lang.String r11 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.P2 r13 = r1.f50513l     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.e2 r13 = r13.C()     // Catch:{ all -> 0x0182 }
            java.lang.String r14 = r9.f49944c     // Catch:{ all -> 0x0182 }
            java.lang.String r13 = r13.g(r14)     // Catch:{ all -> 0x0182 }
            java.lang.Object r9 = r9.f49946e     // Catch:{ all -> 0x0182 }
            r10.d(r11, r12, r13, r9)     // Catch:{ all -> 0x0182 }
            r37.I0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.S5 r9 = r1.f50501J     // Catch:{ all -> 0x0182 }
            r13 = 0
            r14 = 0
            r11 = 9
            r12 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.Q5.X(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0182 }
            goto L_0x0316
        L_0x030e:
            r24 = r6
            r27 = r13
            r7 = r22
            goto L_0x019b
        L_0x0316:
            java.lang.String r9 = r2.f49672a     // Catch:{ all -> 0x0182 }
            boolean r22 = com.google.android.gms.measurement.internal.Q5.G0(r9)     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r2.f49672a     // Catch:{ all -> 0x0182 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0182 }
            r37.I0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.F r9 = r2.f49673b     // Catch:{ all -> 0x0182 }
            long r9 = com.google.android.gms.measurement.internal.Q5.y(r9)     // Catch:{ all -> 0x0182 }
            r13 = 1
            long r15 = r9 + r13
            com.google.android.gms.measurement.internal.p r9 = r37.u0()     // Catch:{ all -> 0x0182 }
            long r10 = r37.Q0()     // Catch:{ all -> 0x0182 }
            r20 = 0
            r21 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r12 = r8
            r13 = r15
            r15 = r17
            r16 = r22
            r17 = r18
            r18 = r7
            com.google.android.gms.measurement.internal.q r9 = r9.I(r10, r12, r13, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0182 }
            long r10 = r9.f50288b     // Catch:{ all -> 0x0182 }
            r37.r0()     // Catch:{ all -> 0x0182 }
            long r12 = com.google.android.gms.measurement.internal.C7611i.K()     // Catch:{ all -> 0x0182 }
            long r10 = r10 - r12
            r14 = 0
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r12 <= 0) goto L_0x038f
            long r10 = r10 % r16
            r12 = 1
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0380
            com.google.android.gms.measurement.internal.h2 r2 = r37.f()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.E()     // Catch:{ all -> 0x0182 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0182 }
            long r5 = r9.f50288b     // Catch:{ all -> 0x0182 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0182 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0182 }
        L_0x0380:
            com.google.android.gms.measurement.internal.p r2 = r37.u0()     // Catch:{ all -> 0x0182 }
            r2.q1()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r2 = r37.u0()
            r2.o1()
            return
        L_0x038f:
            r12 = 1
            if (r22 == 0) goto L_0x03e9
            long r10 = r9.f50287a     // Catch:{ all -> 0x0182 }
            r37.r0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Integer> r6 = com.google.android.gms.measurement.internal.K.f49774n     // Catch:{ all -> 0x0182 }
            r12 = 0
            java.lang.Object r6 = r6.a(r12)     // Catch:{ all -> 0x0182 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0182 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0182 }
            long r12 = (long) r6     // Catch:{ all -> 0x0182 }
            long r10 = r10 - r12
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x03e9
            long r10 = r10 % r16
            r3 = 1
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x03ca
            com.google.android.gms.measurement.internal.h2 r3 = r37.f()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0182 }
            long r6 = r9.f50287a     // Catch:{ all -> 0x0182 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0182 }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x0182 }
        L_0x03ca:
            r37.I0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.S5 r9 = r1.f50501J     // Catch:{ all -> 0x0182 }
            java.lang.String r12 = "_ev"
            java.lang.String r13 = r2.f49672a     // Catch:{ all -> 0x0182 }
            r14 = 0
            r11 = 16
            r10 = r8
            com.google.android.gms.measurement.internal.Q5.X(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r2 = r37.u0()     // Catch:{ all -> 0x0182 }
            r2.q1()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r2 = r37.u0()
            r2.o1()
            return
        L_0x03e9:
            if (r7 == 0) goto L_0x0437
            long r6 = r9.f50290d     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i r10 = r37.r0()     // Catch:{ all -> 0x0182 }
            java.lang.String r11 = r3.f49596a     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.K.f49772m     // Catch:{ all -> 0x0182 }
            int r10 = r10.w(r11, r12)     // Catch:{ all -> 0x0182 }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x0182 }
            r13 = 0
            int r10 = java.lang.Math.max(r13, r10)     // Catch:{ all -> 0x0182 }
            long r10 = (long) r10     // Catch:{ all -> 0x0182 }
            long r6 = r6 - r10
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x0438
            r10 = 1
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0428
            com.google.android.gms.measurement.internal.h2 r2 = r37.f()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.E()     // Catch:{ all -> 0x0182 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0182 }
            long r5 = r9.f50290d     // Catch:{ all -> 0x0182 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0182 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0182 }
        L_0x0428:
            com.google.android.gms.measurement.internal.p r2 = r37.u0()     // Catch:{ all -> 0x0182 }
            r2.q1()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r2 = r37.u0()
            r2.o1()
            return
        L_0x0437:
            r13 = 0
        L_0x0438:
            com.google.android.gms.measurement.internal.F r6 = r2.f49673b     // Catch:{ all -> 0x0182 }
            android.os.Bundle r6 = r6.J()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.Q5 r7 = r37.I0()     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = "_o"
            java.lang.String r10 = r2.f49674c     // Catch:{ all -> 0x0182 }
            r7.M(r6, r9, r10)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.Q5 r7 = r37.I0()     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r3.f49592D     // Catch:{ all -> 0x0182 }
            boolean r7 = r7.C0(r8, r9)     // Catch:{ all -> 0x0182 }
            java.lang.String r12 = "_r"
            if (r7 == 0) goto L_0x0472
            com.google.android.gms.measurement.internal.Q5 r7 = r37.I0()     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = "_dbg"
            r16 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0182 }
            r7.M(r6, r9, r10)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.Q5 r7 = r37.I0()     // Catch:{ all -> 0x0182 }
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0182 }
            r7.M(r6, r12, r9)     // Catch:{ all -> 0x0182 }
            goto L_0x0474
        L_0x0472:
            r16 = 1
        L_0x0474:
            java.lang.String r7 = "_s"
            java.lang.String r9 = r2.f49672a     // Catch:{ all -> 0x0182 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0182 }
            if (r7 == 0) goto L_0x0499
            com.google.android.gms.measurement.internal.p r7 = r37.u0()     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r3.f49596a     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.R5 r7 = r7.U0(r9, r5)     // Catch:{ all -> 0x0182 }
            if (r7 == 0) goto L_0x0499
            java.lang.Object r9 = r7.f49946e     // Catch:{ all -> 0x0182 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x0499
            com.google.android.gms.measurement.internal.Q5 r9 = r37.I0()     // Catch:{ all -> 0x0182 }
            java.lang.Object r7 = r7.f49946e     // Catch:{ all -> 0x0182 }
            r9.M(r6, r5, r7)     // Catch:{ all -> 0x0182 }
        L_0x0499:
            com.google.android.gms.measurement.internal.i r5 = r37.r0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.K.f49750c1     // Catch:{ all -> 0x0182 }
            boolean r5 = r5.r(r7)     // Catch:{ all -> 0x0182 }
            if (r5 == 0) goto L_0x04d1
            java.lang.String r5 = r2.f49674c     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = "am"
            boolean r5 = java.util.Objects.equals(r5, r7)     // Catch:{ all -> 0x0182 }
            if (r5 == 0) goto L_0x04d1
            java.lang.String r5 = r2.f49672a     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = "_ai"
            boolean r5 = java.util.Objects.equals(r5, r7)     // Catch:{ all -> 0x0182 }
            if (r5 == 0) goto L_0x04d1
            r5 = r27
            java.lang.Object r7 = r6.get(r5)     // Catch:{ all -> 0x0182 }
            if (r7 == 0) goto L_0x04d1
            boolean r9 = r7 instanceof java.lang.String     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x04d1
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x04d1 }
            double r9 = java.lang.Double.parseDouble(r7)     // Catch:{ NumberFormatException -> 0x04d1 }
            r6.remove(r5)     // Catch:{ NumberFormatException -> 0x04d1 }
            r6.putDouble(r5, r9)     // Catch:{ NumberFormatException -> 0x04d1 }
        L_0x04d1:
            com.google.android.gms.measurement.internal.p r5 = r37.u0()     // Catch:{ all -> 0x0182 }
            long r9 = r5.E(r8)     // Catch:{ all -> 0x0182 }
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x04f2
            com.google.android.gms.measurement.internal.h2 r5 = r37.f()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i2 r5 = r5.J()     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0182 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0182 }
            r5.c(r7, r11, r9)     // Catch:{ all -> 0x0182 }
        L_0x04f2:
            com.google.android.gms.measurement.internal.D r5 = new com.google.android.gms.measurement.internal.D     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.P2 r10 = r1.f50513l     // Catch:{ all -> 0x0182 }
            java.lang.String r11 = r2.f49674c     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = r2.f49672a     // Catch:{ all -> 0x0182 }
            long r14 = r2.f49675d     // Catch:{ all -> 0x0182 }
            r20 = 0
            r9 = r5
            r2 = r12
            r12 = r8
            r26 = r2
            r2 = r13
            r13 = r7
            r16 = r20
            r18 = r6
            r9.<init>((com.google.android.gms.measurement.internal.P2) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (long) r14, (long) r16, (android.os.Bundle) r18)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r6 = r37.u0()     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = r5.f49567b     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.G r6 = r6.R0(r8, r7)     // Catch:{ all -> 0x0182 }
            if (r6 != 0) goto L_0x058d
            com.google.android.gms.measurement.internal.p r6 = r37.u0()     // Catch:{ all -> 0x0182 }
            long r6 = r6.E0(r8)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i r9 = r37.r0()     // Catch:{ all -> 0x0182 }
            int r9 = r9.m(r8)     // Catch:{ all -> 0x0182 }
            long r9 = (long) r9     // Catch:{ all -> 0x0182 }
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x056e
            if (r22 == 0) goto L_0x056e
            com.google.android.gms.measurement.internal.h2 r2 = r37.f()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.E()     // Catch:{ all -> 0x0182 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7607h2.t(r8)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.P2 r6 = r1.f50513l     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.e2 r6 = r6.C()     // Catch:{ all -> 0x0182 }
            java.lang.String r5 = r5.f49567b     // Catch:{ all -> 0x0182 }
            java.lang.String r5 = r6.c(r5)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i r6 = r37.r0()     // Catch:{ all -> 0x0182 }
            int r6 = r6.m(r8)     // Catch:{ all -> 0x0182 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0182 }
            r2.d(r3, r4, r5, r6)     // Catch:{ all -> 0x0182 }
            r37.I0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.S5 r9 = r1.f50501J     // Catch:{ all -> 0x0182 }
            r13 = 0
            r14 = 0
            r11 = 8
            r12 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.Q5.X(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r2 = r37.u0()
            r2.o1()
            return
        L_0x056e:
            com.google.android.gms.measurement.internal.G r6 = new com.google.android.gms.measurement.internal.G     // Catch:{ all -> 0x0182 }
            java.lang.String r11 = r5.f49567b     // Catch:{ all -> 0x0182 }
            long r14 = r5.f49569d     // Catch:{ all -> 0x0182 }
            r22 = 0
            r23 = 0
            r12 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r9 = r6
            r10 = r8
            r7 = r14
            r14 = r16
            r16 = r7
            r9.<init>(r10, r11, r12, r14, r16, r18, r20, r21, r22, r23)     // Catch:{ all -> 0x0182 }
            goto L_0x059b
        L_0x058d:
            com.google.android.gms.measurement.internal.P2 r7 = r1.f50513l     // Catch:{ all -> 0x0182 }
            long r8 = r6.f49633f     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.D r5 = r5.a(r7, r8)     // Catch:{ all -> 0x0182 }
            long r7 = r5.f49569d     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.G r6 = r6.a(r7)     // Catch:{ all -> 0x0182 }
        L_0x059b:
            com.google.android.gms.measurement.internal.p r7 = r37.u0()     // Catch:{ all -> 0x0182 }
            r7.W(r6)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.J2 r6 = r37.q()     // Catch:{ all -> 0x0182 }
            r6.k()     // Catch:{ all -> 0x0182 }
            r37.L0()     // Catch:{ all -> 0x0182 }
            K9.C6620s.l(r5)     // Catch:{ all -> 0x0182 }
            K9.C6620s.l(r39)     // Catch:{ all -> 0x0182 }
            java.lang.String r6 = r5.f49566a     // Catch:{ all -> 0x0182 }
            K9.C6620s.f(r6)     // Catch:{ all -> 0x0182 }
            java.lang.String r6 = r5.f49566a     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = r3.f49596a     // Catch:{ all -> 0x0182 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0182 }
            K9.C6620s.a(r6)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.internal.measurement.A2$a r6 = com.google.android.gms.internal.measurement.A2.H2()     // Catch:{ all -> 0x0182 }
            r7 = 1
            com.google.android.gms.internal.measurement.A2$a r6 = r6.H0(r7)     // Catch:{ all -> 0x0182 }
            java.lang.String r8 = "android"
            com.google.android.gms.internal.measurement.A2$a r6 = r6.l1(r8)     // Catch:{ all -> 0x0182 }
            java.lang.String r8 = r3.f49596a     // Catch:{ all -> 0x0182 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0182 }
            if (r8 != 0) goto L_0x05de
            java.lang.String r8 = r3.f49596a     // Catch:{ all -> 0x0182 }
            r6.d0(r8)     // Catch:{ all -> 0x0182 }
        L_0x05de:
            java.lang.String r8 = r3.f49599d     // Catch:{ all -> 0x0182 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0182 }
            if (r8 != 0) goto L_0x05eb
            java.lang.String r8 = r3.f49599d     // Catch:{ all -> 0x0182 }
            r6.p0(r8)     // Catch:{ all -> 0x0182 }
        L_0x05eb:
            java.lang.String r8 = r3.f49598c     // Catch:{ all -> 0x0182 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0182 }
            if (r8 != 0) goto L_0x05f8
            java.lang.String r8 = r3.f49598c     // Catch:{ all -> 0x0182 }
            r6.w0(r8)     // Catch:{ all -> 0x0182 }
        L_0x05f8:
            java.lang.String r8 = r3.f49618w     // Catch:{ all -> 0x0182 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0182 }
            if (r8 != 0) goto L_0x0605
            java.lang.String r8 = r3.f49618w     // Catch:{ all -> 0x0182 }
            r6.q1(r8)     // Catch:{ all -> 0x0182 }
        L_0x0605:
            long r8 = r3.f49605j     // Catch:{ all -> 0x0182 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x0612
            int r8 = (int) r8     // Catch:{ all -> 0x0182 }
            r6.s0(r8)     // Catch:{ all -> 0x0182 }
        L_0x0612:
            long r8 = r3.f49600e     // Catch:{ all -> 0x0182 }
            r6.D0(r8)     // Catch:{ all -> 0x0182 }
            java.lang.String r8 = r3.f49597b     // Catch:{ all -> 0x0182 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0182 }
            if (r8 != 0) goto L_0x0624
            java.lang.String r8 = r3.f49597b     // Catch:{ all -> 0x0182 }
            r6.f1(r8)     // Catch:{ all -> 0x0182 }
        L_0x0624:
            java.lang.String r8 = r3.f49596a     // Catch:{ all -> 0x0182 }
            java.lang.Object r8 = K9.C6620s.l(r8)     // Catch:{ all -> 0x0182 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.q3 r8 = r1.b0(r8)     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r3.f49616u     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.q3 r9 = com.google.android.gms.measurement.internal.C7671q3.p(r9)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.q3 r8 = r8.d(r9)     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r8.u()     // Catch:{ all -> 0x0182 }
            r6.F0(r9)     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r6.y1()     // Catch:{ all -> 0x0182 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x0658
            java.lang.String r9 = r3.f49611p     // Catch:{ all -> 0x0182 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0182 }
            if (r9 != 0) goto L_0x0658
            java.lang.String r9 = r3.f49611p     // Catch:{ all -> 0x0182 }
            r6.Q(r9)     // Catch:{ all -> 0x0182 }
        L_0x0658:
            boolean r9 = com.google.android.gms.internal.measurement.C7297f7.a()     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x070b
            com.google.android.gms.measurement.internal.i r9 = r37.r0()     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = r3.f49596a     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.K.f49723Q0     // Catch:{ all -> 0x0182 }
            boolean r9 = r9.F(r10, r11)     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x070b
            r37.I0()     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r3.f49596a     // Catch:{ all -> 0x0182 }
            boolean r9 = com.google.android.gms.measurement.internal.Q5.B0(r9)     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x070b
            int r9 = r3.f49590B     // Catch:{ all -> 0x0182 }
            r6.m0(r9)     // Catch:{ all -> 0x0182 }
            long r9 = r3.f49591C     // Catch:{ all -> 0x0182 }
            boolean r8 = r8.w()     // Catch:{ all -> 0x0182 }
            r11 = 32
            r13 = 0
            if (r8 != 0) goto L_0x0692
            int r8 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x0692
            r15 = -2
            long r8 = r9 & r15
            long r9 = r8 | r11
        L_0x0692:
            r7 = 1
            int r15 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x069a
            r15 = 1
            goto L_0x069b
        L_0x069a:
            r15 = r2
        L_0x069b:
            r6.R(r15)     // Catch:{ all -> 0x0182 }
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x070d
            com.google.android.gms.internal.measurement.s2$a r15 = com.google.android.gms.internal.measurement.C7403s2.J()     // Catch:{ all -> 0x0182 }
            long r18 = r9 & r7
            int r16 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x06ae
            r7 = 1
            goto L_0x06af
        L_0x06ae:
            r7 = r2
        L_0x06af:
            r15.C(r7)     // Catch:{ all -> 0x0182 }
            r7 = 2
            long r7 = r7 & r9
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x06bb
            r7 = 1
            goto L_0x06bc
        L_0x06bb:
            r7 = r2
        L_0x06bc:
            r15.E(r7)     // Catch:{ all -> 0x0182 }
            r7 = 4
            long r7 = r7 & r9
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x06c8
            r7 = 1
            goto L_0x06c9
        L_0x06c8:
            r7 = r2
        L_0x06c9:
            r15.G(r7)     // Catch:{ all -> 0x0182 }
            r7 = 8
            long r7 = r7 & r9
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x06d5
            r7 = 1
            goto L_0x06d6
        L_0x06d5:
            r7 = r2
        L_0x06d6:
            r15.H(r7)     // Catch:{ all -> 0x0182 }
            r7 = 16
            long r7 = r7 & r9
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x06e2
            r7 = 1
            goto L_0x06e3
        L_0x06e2:
            r7 = r2
        L_0x06e3:
            r15.A(r7)     // Catch:{ all -> 0x0182 }
            long r7 = r9 & r11
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x06ee
            r7 = 1
            goto L_0x06ef
        L_0x06ee:
            r7 = r2
        L_0x06ef:
            r15.z(r7)     // Catch:{ all -> 0x0182 }
            r7 = 64
            long r7 = r7 & r9
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x06fb
            r7 = 1
            goto L_0x06fc
        L_0x06fb:
            r7 = r2
        L_0x06fc:
            r15.D(r7)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.internal.measurement.s5 r7 = r15.s()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.internal.measurement.L4 r7 = (com.google.android.gms.internal.measurement.L4) r7     // Catch:{ all -> 0x0182 }
            com.google.android.gms.internal.measurement.s2 r7 = (com.google.android.gms.internal.measurement.C7403s2) r7     // Catch:{ all -> 0x0182 }
            r6.I(r7)     // Catch:{ all -> 0x0182 }
            goto L_0x070d
        L_0x070b:
            r13 = 0
        L_0x070d:
            long r7 = r3.f49601f     // Catch:{ all -> 0x0182 }
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0716
            r6.n0(r7)     // Catch:{ all -> 0x0182 }
        L_0x0716:
            long r7 = r3.f49613r     // Catch:{ all -> 0x0182 }
            r6.u0(r7)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.N5 r7 = r37.H0()     // Catch:{ all -> 0x0182 }
            java.util.List r7 = r7.i0()     // Catch:{ all -> 0x0182 }
            if (r7 == 0) goto L_0x0728
            r6.i0(r7)     // Catch:{ all -> 0x0182 }
        L_0x0728:
            java.lang.String r7 = r3.f49596a     // Catch:{ all -> 0x0182 }
            java.lang.Object r7 = K9.C6620s.l(r7)     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.q3 r7 = r1.b0(r7)     // Catch:{ all -> 0x0182 }
            java.lang.String r8 = r3.f49616u     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.q3 r8 = com.google.android.gms.measurement.internal.C7671q3.p(r8)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.q3 r7 = r7.d(r8)     // Catch:{ all -> 0x0182 }
            boolean r8 = r7.w()     // Catch:{ all -> 0x0182 }
            if (r8 == 0) goto L_0x07d8
            boolean r8 = r3.f49609n     // Catch:{ all -> 0x0182 }
            if (r8 == 0) goto L_0x07d8
            com.google.android.gms.measurement.internal.Y4 r8 = r1.f50510i     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r3.f49596a     // Catch:{ all -> 0x0182 }
            android.util.Pair r8 = r8.x(r9, r7)     // Catch:{ all -> 0x0182 }
            if (r8 == 0) goto L_0x07d8
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x0182 }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x0182 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0182 }
            if (r9 != 0) goto L_0x07d8
            boolean r9 = r3.f49609n     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x07d8
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0182 }
            r6.n1(r9)     // Catch:{ all -> 0x0182 }
            java.lang.Object r9 = r8.second     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x0774
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0182 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0182 }
            r6.k0(r9)     // Catch:{ all -> 0x0182 }
        L_0x0774:
            java.lang.String r9 = r5.f49567b     // Catch:{ all -> 0x0182 }
            boolean r9 = r9.equals(r4)     // Catch:{ all -> 0x0182 }
            if (r9 != 0) goto L_0x07d8
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x0182 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = "00000000-0000-0000-0000-000000000000"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0182 }
            if (r8 != 0) goto L_0x07d8
            com.google.android.gms.measurement.internal.p r8 = r37.u0()     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r3.f49596a     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.r2 r8 = r8.S0(r9)     // Catch:{ all -> 0x0182 }
            if (r8 == 0) goto L_0x07d8
            boolean r9 = r8.D()     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x07d8
            java.lang.String r9 = r3.f49596a     // Catch:{ all -> 0x0182 }
            r10 = 0
            r1.M(r9, r2, r10, r10)     // Catch:{ all -> 0x0182 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x0182 }
            r9.<init>()     // Catch:{ all -> 0x0182 }
            java.lang.Long r10 = r8.M0()     // Catch:{ all -> 0x0182 }
            if (r10 == 0) goto L_0x07b8
            java.lang.String r11 = "_pfo"
            long r2 = r10.longValue()     // Catch:{ all -> 0x0182 }
            long r2 = java.lang.Math.max(r13, r2)     // Catch:{ all -> 0x0182 }
            r9.putLong(r11, r2)     // Catch:{ all -> 0x0182 }
        L_0x07b8:
            java.lang.Long r2 = r8.N0()     // Catch:{ all -> 0x0182 }
            if (r2 == 0) goto L_0x07c7
            java.lang.String r3 = "_uwa"
            long r10 = r2.longValue()     // Catch:{ all -> 0x0182 }
            r9.putLong(r3, r10)     // Catch:{ all -> 0x0182 }
        L_0x07c7:
            r8 = r26
            r2 = 1
            r9.putLong(r8, r2)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.S5 r2 = r1.f50501J     // Catch:{ all -> 0x0182 }
            r3 = r39
            java.lang.String r10 = r3.f49596a     // Catch:{ all -> 0x0182 }
            r2.a(r10, r4, r9)     // Catch:{ all -> 0x0182 }
            goto L_0x07da
        L_0x07d8:
            r8 = r26
        L_0x07da:
            com.google.android.gms.measurement.internal.P2 r2 = r1.f50513l     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.E r2 = r2.z()     // Catch:{ all -> 0x0182 }
            r2.m()     // Catch:{ all -> 0x0182 }
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ all -> 0x0182 }
            com.google.android.gms.internal.measurement.A2$a r2 = r6.O0(r2)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.P2 r4 = r1.f50513l     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.E r4 = r4.z()     // Catch:{ all -> 0x0182 }
            r4.m()     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0182 }
            com.google.android.gms.internal.measurement.A2$a r2 = r2.j1(r4)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.P2 r4 = r1.f50513l     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.E r4 = r4.z()     // Catch:{ all -> 0x0182 }
            long r9 = r4.s()     // Catch:{ all -> 0x0182 }
            int r4 = (int) r9     // Catch:{ all -> 0x0182 }
            com.google.android.gms.internal.measurement.A2$a r2 = r2.Q0(r4)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.P2 r4 = r1.f50513l     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.E r4 = r4.z()     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = r4.t()     // Catch:{ all -> 0x0182 }
            r2.s1(r4)     // Catch:{ all -> 0x0182 }
            long r9 = r3.f49620y     // Catch:{ all -> 0x0182 }
            r6.V0(r9)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.P2 r2 = r1.f50513l     // Catch:{ all -> 0x0182 }
            boolean r2 = r2.o()     // Catch:{ all -> 0x0182 }
            if (r2 == 0) goto L_0x082e
            r6.u1()     // Catch:{ all -> 0x0182 }
            r2 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0182 }
            if (r4 != 0) goto L_0x082e
            r6.T0(r2)     // Catch:{ all -> 0x0182 }
        L_0x082e:
            com.google.android.gms.measurement.internal.p r2 = r37.u0()     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = r3.f49596a     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.r2 r2 = r2.S0(r4)     // Catch:{ all -> 0x0182 }
            if (r2 != 0) goto L_0x089c
            com.google.android.gms.measurement.internal.r2 r2 = new com.google.android.gms.measurement.internal.r2     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.P2 r4 = r1.f50513l     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r3.f49596a     // Catch:{ all -> 0x0182 }
            r2.<init>(r4, r9)     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = r1.m(r7)     // Catch:{ all -> 0x0182 }
            r2.J(r4)     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = r3.f49606k     // Catch:{ all -> 0x0182 }
            r2.X(r4)     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = r3.f49597b     // Catch:{ all -> 0x0182 }
            r2.a0(r4)     // Catch:{ all -> 0x0182 }
            boolean r4 = r7.w()     // Catch:{ all -> 0x0182 }
            if (r4 == 0) goto L_0x0867
            com.google.android.gms.measurement.internal.Y4 r4 = r1.f50510i     // Catch:{ all -> 0x0182 }
            java.lang.String r9 = r3.f49596a     // Catch:{ all -> 0x0182 }
            boolean r10 = r3.f49609n     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = r4.y(r9, r10)     // Catch:{ all -> 0x0182 }
            r2.g0(r4)     // Catch:{ all -> 0x0182 }
        L_0x0867:
            r2.B0(r13)     // Catch:{ all -> 0x0182 }
            r2.D0(r13)     // Catch:{ all -> 0x0182 }
            r2.z0(r13)     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = r3.f49598c     // Catch:{ all -> 0x0182 }
            r2.T(r4)     // Catch:{ all -> 0x0182 }
            long r9 = r3.f49605j     // Catch:{ all -> 0x0182 }
            r2.H(r9)     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = r3.f49599d     // Catch:{ all -> 0x0182 }
            r2.O(r4)     // Catch:{ all -> 0x0182 }
            long r9 = r3.f49600e     // Catch:{ all -> 0x0182 }
            r2.v0(r9)     // Catch:{ all -> 0x0182 }
            long r9 = r3.f49601f     // Catch:{ all -> 0x0182 }
            r2.o0(r9)     // Catch:{ all -> 0x0182 }
            boolean r4 = r3.f49603h     // Catch:{ all -> 0x0182 }
            r2.K(r4)     // Catch:{ all -> 0x0182 }
            long r9 = r3.f49613r     // Catch:{ all -> 0x0182 }
            r2.r0(r9)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r4 = r37.u0()     // Catch:{ all -> 0x0182 }
            r9 = 0
            r4.X(r2, r9, r9)     // Catch:{ all -> 0x0182 }
            goto L_0x089d
        L_0x089c:
            r9 = 0
        L_0x089d:
            boolean r4 = r7.x()     // Catch:{ all -> 0x0182 }
            if (r4 == 0) goto L_0x08ba
            java.lang.String r4 = r2.m()     // Catch:{ all -> 0x0182 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0182 }
            if (r4 != 0) goto L_0x08ba
            java.lang.String r4 = r2.m()     // Catch:{ all -> 0x0182 }
            java.lang.Object r4 = K9.C6620s.l(r4)     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0182 }
            r6.j0(r4)     // Catch:{ all -> 0x0182 }
        L_0x08ba:
            java.lang.String r4 = r2.p()     // Catch:{ all -> 0x0182 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0182 }
            if (r4 != 0) goto L_0x08d1
            java.lang.String r4 = r2.p()     // Catch:{ all -> 0x0182 }
            java.lang.Object r4 = K9.C6620s.l(r4)     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0182 }
            r6.c1(r4)     // Catch:{ all -> 0x0182 }
        L_0x08d1:
            com.google.android.gms.measurement.internal.p r4 = r37.u0()     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = r3.f49596a     // Catch:{ all -> 0x0182 }
            java.util.List r4 = r4.f1(r7)     // Catch:{ all -> 0x0182 }
            r12 = r9
        L_0x08dc:
            int r7 = r4.size()     // Catch:{ all -> 0x0182 }
            if (r12 >= r7) goto L_0x0940
            com.google.android.gms.internal.measurement.F2$a r7 = com.google.android.gms.internal.measurement.F2.V()     // Catch:{ all -> 0x0182 }
            java.lang.Object r10 = r4.get(r12)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.R5 r10 = (com.google.android.gms.measurement.internal.R5) r10     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = r10.f49944c     // Catch:{ all -> 0x0182 }
            com.google.android.gms.internal.measurement.F2$a r7 = r7.D(r10)     // Catch:{ all -> 0x0182 }
            java.lang.Object r10 = r4.get(r12)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.R5 r10 = (com.google.android.gms.measurement.internal.R5) r10     // Catch:{ all -> 0x0182 }
            long r10 = r10.f49945d     // Catch:{ all -> 0x0182 }
            com.google.android.gms.internal.measurement.F2$a r7 = r7.G(r10)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.N5 r10 = r37.H0()     // Catch:{ all -> 0x0182 }
            java.lang.Object r11 = r4.get(r12)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.R5 r11 = (com.google.android.gms.measurement.internal.R5) r11     // Catch:{ all -> 0x0182 }
            java.lang.Object r11 = r11.f49946e     // Catch:{ all -> 0x0182 }
            r10.T(r7, r11)     // Catch:{ all -> 0x0182 }
            r6.N(r7)     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = "_sid"
            java.lang.Object r10 = r4.get(r12)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.R5 r10 = (com.google.android.gms.measurement.internal.R5) r10     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = r10.f49944c     // Catch:{ all -> 0x0182 }
            boolean r7 = r7.equals(r10)     // Catch:{ all -> 0x0182 }
            if (r7 == 0) goto L_0x093d
            long r10 = r2.J0()     // Catch:{ all -> 0x0182 }
            int r7 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x093d
            com.google.android.gms.measurement.internal.N5 r7 = r37.H0()     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = r3.f49618w     // Catch:{ all -> 0x0182 }
            long r10 = r7.x(r10)     // Catch:{ all -> 0x0182 }
            long r15 = r2.J0()     // Catch:{ all -> 0x0182 }
            int r7 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x093d
            r6.p1()     // Catch:{ all -> 0x0182 }
        L_0x093d:
            int r12 = r12 + 1
            goto L_0x08dc
        L_0x0940:
            com.google.android.gms.measurement.internal.p r2 = r37.u0()     // Catch:{ IOException -> 0x09b7 }
            com.google.android.gms.internal.measurement.s5 r3 = r6.s()     // Catch:{ IOException -> 0x09b7 }
            com.google.android.gms.internal.measurement.L4 r3 = (com.google.android.gms.internal.measurement.L4) r3     // Catch:{ IOException -> 0x09b7 }
            com.google.android.gms.internal.measurement.A2 r3 = (com.google.android.gms.internal.measurement.A2) r3     // Catch:{ IOException -> 0x09b7 }
            long r2 = r2.C(r3)     // Catch:{ IOException -> 0x09b7 }
            com.google.android.gms.measurement.internal.p r4 = r37.u0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.F r6 = r5.f49571f     // Catch:{ all -> 0x0182 }
            if (r6 == 0) goto L_0x09ae
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0182 }
        L_0x095c:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0182 }
            if (r7 == 0) goto L_0x0970
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0182 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0182 }
            if (r7 == 0) goto L_0x095c
        L_0x096e:
            r9 = 1
            goto L_0x09ae
        L_0x0970:
            com.google.android.gms.measurement.internal.C2 r6 = r37.B0()     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = r5.f49566a     // Catch:{ all -> 0x0182 }
            java.lang.String r8 = r5.f49567b     // Catch:{ all -> 0x0182 }
            boolean r6 = r6.M(r7, r8)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r26 = r37.u0()     // Catch:{ all -> 0x0182 }
            long r27 = r37.Q0()     // Catch:{ all -> 0x0182 }
            java.lang.String r7 = r5.f49566a     // Catch:{ all -> 0x0182 }
            r35 = 0
            r36 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r29 = r7
            com.google.android.gms.measurement.internal.q r7 = r26.J(r27, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0182 }
            if (r6 == 0) goto L_0x09ae
            long r6 = r7.f50291e     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i r8 = r37.r0()     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = r5.f49566a     // Catch:{ all -> 0x0182 }
            int r8 = r8.z(r10)     // Catch:{ all -> 0x0182 }
            long r10 = (long) r8     // Catch:{ all -> 0x0182 }
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x09ae
            goto L_0x096e
        L_0x09ae:
            boolean r2 = r4.j0(r5, r2, r9)     // Catch:{ all -> 0x0182 }
            if (r2 == 0) goto L_0x09ce
            r1.f50516o = r13     // Catch:{ all -> 0x0182 }
            goto L_0x09ce
        L_0x09b7:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.h2 r3 = r37.f()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ all -> 0x0182 }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r6.u1()     // Catch:{ all -> 0x0182 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7607h2.t(r5)     // Catch:{ all -> 0x0182 }
            r3.c(r4, r5, r2)     // Catch:{ all -> 0x0182 }
        L_0x09ce:
            com.google.android.gms.measurement.internal.p r2 = r37.u0()     // Catch:{ all -> 0x0182 }
            r2.q1()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.p r2 = r37.u0()
            r2.o1()
            r37.Y()
            com.google.android.gms.measurement.internal.h2 r2 = r37.f()
            com.google.android.gms.measurement.internal.i2 r2 = r2.I()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r24
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x09ff:
            com.google.android.gms.measurement.internal.p r3 = r37.u0()
            r3.o1()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7728y5.m0(com.google.android.gms.measurement.internal.J, com.google.android.gms.measurement.internal.E5):void");
    }

    private static String n(Map<String, List<String>> map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry next : map.entrySet()) {
            if (str.equalsIgnoreCase((String) next.getKey())) {
                if (((List) next.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) next.getValue()).get(0);
            }
        }
        return null;
    }

    private static void p(C7427v2.a aVar, int i10, String str) {
        List<C7443x2> R10 = aVar.R();
        int i11 = 0;
        while (i11 < R10.size()) {
            if (!"_err".equals(R10.get(i11).Z())) {
                i11++;
            } else {
                return;
            }
        }
        aVar.H((C7443x2) ((L4) C7443x2.X().G("_err").C((long) i10).s())).H((C7443x2) ((L4) C7443x2.X().G("_ev").I(str).s()));
    }

    private final C p0(String str) {
        q().k();
        L0();
        C c10 = this.f50494C.get(str);
        if (c10 != null) {
            return c10;
        }
        C V02 = u0().V0(str);
        this.f50494C.put(str, V02);
        return V02;
    }

    private static void r(C7427v2.a aVar, String str) {
        List<C7443x2> R10 = aVar.R();
        for (int i10 = 0; i10 < R10.size(); i10++) {
            if (str.equals(R10.get(i10).Z())) {
                aVar.A(i10);
                return;
            }
        }
    }

    private final void s(A2.a aVar, long j10, boolean z10) {
        String str = z10 ? "_se" : "_lte";
        R5 U02 = u0().U0(aVar.u1(), str);
        R5 r52 = (U02 == null || U02.f49946e == null) ? new R5(aVar.u1(), "auto", str, zzb().a(), Long.valueOf(j10)) : new R5(aVar.u1(), "auto", str, zzb().a(), Long.valueOf(((Long) U02.f49946e).longValue() + j10));
        F2 f22 = (F2) ((L4) F2.V().D(str).G(zzb().a()).C(((Long) r52.f49946e).longValue()).s());
        int w10 = N5.w(aVar, str);
        if (w10 >= 0) {
            aVar.E(w10, f22);
        } else {
            aVar.O(f22);
        }
        if (j10 > 0) {
            u0().k0(r52);
            f().I().c("Updated engagement user property. scope, value", z10 ? "session-scoped" : "lifetime", r52.f49946e);
        }
    }

    private final void t0(String str) {
        q().k();
        L0();
        this.f50523v = true;
        try {
            Boolean a02 = this.f50513l.K().a0();
            if (a02 == null) {
                f().J().a("Upload data called on the client side before use of service was decided");
            } else if (a02.booleanValue()) {
                f().E().a("Upload called in the client side when service should be used");
                this.f50523v = false;
                V();
            } else if (this.f50516o > 0) {
                Y();
                this.f50523v = false;
                V();
            } else if (!z0().z()) {
                f().I().a("Network not connected, ignoring upload request");
                Y();
                this.f50523v = false;
                V();
            } else if (!u0().m1(str)) {
                f().I().b("Upload queue has no batches for appId", str);
                this.f50523v = false;
                V();
            } else {
                M5 b12 = u0().b1(str);
                if (b12 == null) {
                    this.f50523v = false;
                    V();
                    return;
                }
                C7459z2 d10 = b12.d();
                if (d10 == null) {
                    this.f50523v = false;
                    V();
                    return;
                }
                byte[] l10 = d10.l();
                if (f().A(2)) {
                    f().I().d("Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(l10.length), H0().K(d10));
                }
                this.f50522u = true;
                z0().w(str, b12.c(), d10, new C5(this, str, b12));
                this.f50523v = false;
                V();
            }
        } finally {
            this.f50523v = false;
            V();
        }
    }

    private final boolean w0(String str) {
        b bVar = this.f50496E.get(str);
        if (bVar == null) {
            return true;
        }
        return bVar.b();
    }

    static /* synthetic */ void z(C7728y5 y5Var, K5 k52) {
        y5Var.q().k();
        y5Var.f50512k = new A2(y5Var);
        C7660p pVar = new C7660p(y5Var);
        pVar.t();
        y5Var.f50504c = pVar;
        y5Var.r0().p((C7625k) C6620s.l(y5Var.f50502a));
        Y4 y42 = new Y4(y5Var);
        y42.t();
        y5Var.f50510i = y42;
        Y5 y52 = new Y5(y5Var);
        y52.t();
        y5Var.f50507f = y52;
        C7623j4 j4Var = new C7623j4(y5Var);
        j4Var.t();
        y5Var.f50509h = j4Var;
        C7659o5 o5Var = new C7659o5(y5Var);
        o5Var.t();
        y5Var.f50506e = o5Var;
        y5Var.f50505d = new C7670q2(y5Var);
        if (y5Var.f50519r != y5Var.f50520s) {
            y5Var.f().E().c("Not all upload components initialized", Integer.valueOf(y5Var.f50519r), Integer.valueOf(y5Var.f50520s));
        }
        y5Var.f50514m = true;
    }

    /* access modifiers changed from: package-private */
    public final void B(P5 p52, E5 e52) {
        R5 U02;
        long j10;
        q().k();
        L0();
        if (C0(e52)) {
            if (!e52.f49603h) {
                g(e52);
                return;
            }
            int p02 = I0().p0(p52.f49912b);
            int i10 = 0;
            if (p02 != 0) {
                I0();
                String str = p52.f49912b;
                r0();
                String H10 = Q5.H(str, 24, true);
                String str2 = p52.f49912b;
                int length = str2 != null ? str2.length() : 0;
                I0();
                Q5.X(this.f50501J, e52.f49596a, p02, "_ev", H10, length);
                return;
            }
            int u10 = I0().u(p52.f49912b, p52.x());
            if (u10 != 0) {
                I0();
                String str3 = p52.f49912b;
                r0();
                String H11 = Q5.H(str3, 24, true);
                Object x10 = p52.x();
                if (x10 != null && ((x10 instanceof String) || (x10 instanceof CharSequence))) {
                    i10 = String.valueOf(x10).length();
                }
                I0();
                Q5.X(this.f50501J, e52.f49596a, u10, "_ev", H11, i10);
                return;
            }
            Object y02 = I0().y0(p52.f49912b, p52.x());
            if (y02 != null) {
                if ("_sid".equals(p52.f49912b)) {
                    long j11 = p52.f49913c;
                    String str4 = p52.f49916f;
                    String str5 = (String) C6620s.l(e52.f49596a);
                    R5 U03 = u0().U0(str5, "_sno");
                    if (U03 != null) {
                        Object obj = U03.f49946e;
                        if (obj instanceof Long) {
                            j10 = ((Long) obj).longValue();
                            B(new P5("_sno", j11, Long.valueOf(j10 + 1), str4), e52);
                        }
                    }
                    if (U03 != null) {
                        f().J().b("Retrieved last session number from database does not contain a valid (long) value", U03.f49946e);
                    }
                    G R02 = u0().R0(str5, "_s");
                    if (R02 != null) {
                        j10 = R02.f49630c;
                        f().I().b("Backfill the session number. Last used session number", Long.valueOf(j10));
                    } else {
                        j10 = 0;
                    }
                    B(new P5("_sno", j11, Long.valueOf(j10 + 1), str4), e52);
                }
                R5 r52 = new R5((String) C6620s.l(e52.f49596a), (String) C6620s.l(p52.f49916f), p52.f49912b, p52.f49913c, y02);
                f().I().c("Setting user property", this.f50513l.C().g(r52.f49944c), y02);
                u0().l1();
                try {
                    if ("_id".equals(r52.f49944c) && (U02 = u0().U0(e52.f49596a, "_id")) != null && !r52.f49946e.equals(U02.f49946e)) {
                        u0().a1(e52.f49596a, "_lair");
                    }
                    g(e52);
                    boolean k02 = u0().k0(r52);
                    if ("_sid".equals(p52.f49912b)) {
                        long x11 = H0().x(e52.f49618w);
                        C7676r2 S02 = u0().S0(e52.f49596a);
                        if (S02 != null) {
                            S02.F0(x11);
                            if (S02.B()) {
                                u0().X(S02, false, false);
                            }
                        }
                    }
                    u0().q1();
                    if (!k02) {
                        f().E().c("Too many unique user properties are set. Ignoring user property", this.f50513l.C().g(r52.f49944c), r52.f49946e);
                        I0();
                        Q5.X(this.f50501J, e52.f49596a, 9, (String) null, (String) null, 0);
                    }
                    u0().o1();
                } catch (Throwable th2) {
                    u0().o1();
                    throw th2;
                }
            }
        }
    }

    public final C2 B0() {
        return (C2) j(this.f50502a);
    }

    /* access modifiers changed from: package-private */
    public final void C(Runnable runnable) {
        q().k();
        if (this.f50517p == null) {
            this.f50517p = new ArrayList();
        }
        this.f50517p.add(runnable);
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.lang.String] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, com.google.android.gms.measurement.internal.M5 r8) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.J2 r0 = r3.q()
            r0.k()
            r3.L0()
            r0 = 0
            if (r7 != 0) goto L_0x0013
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x0010 }
            goto L_0x0013
        L_0x0010:
            r4 = move-exception
            goto L_0x00aa
        L_0x0013:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L_0x001b
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L_0x0067
        L_0x001b:
            if (r6 != 0) goto L_0x0067
            if (r8 == 0) goto L_0x002e
            com.google.android.gms.measurement.internal.p r6 = r3.u0()     // Catch:{ all -> 0x0010 }
            long r7 = r8.a()     // Catch:{ all -> 0x0010 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0010 }
            r6.Y(r7)     // Catch:{ all -> 0x0010 }
        L_0x002e:
            com.google.android.gms.measurement.internal.h2 r6 = r3.f()     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.i2 r6 = r6.I()     // Catch:{ all -> 0x0010 }
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0010 }
            r6.c(r7, r4, r5)     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.i r5 = r3.r0()     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.K.f49707I0     // Catch:{ all -> 0x0010 }
            boolean r5 = r5.r(r6)     // Catch:{ all -> 0x0010 }
            if (r5 == 0) goto L_0x0063
            com.google.android.gms.measurement.internal.n2 r5 = r3.z0()     // Catch:{ all -> 0x0010 }
            boolean r5 = r5.z()     // Catch:{ all -> 0x0010 }
            if (r5 == 0) goto L_0x0063
            com.google.android.gms.measurement.internal.p r5 = r3.u0()     // Catch:{ all -> 0x0010 }
            boolean r5 = r5.m1(r4)     // Catch:{ all -> 0x0010 }
            if (r5 == 0) goto L_0x0063
            r3.t0(r4)     // Catch:{ all -> 0x0010 }
            goto L_0x00a4
        L_0x0063:
            r3.Y()     // Catch:{ all -> 0x0010 }
            goto L_0x00a4
        L_0x0067:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0010 }
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0010 }
            r1.<init>(r7, r2)     // Catch:{ all -> 0x0010 }
            int r7 = r1.length()     // Catch:{ all -> 0x0010 }
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x0010 }
            java.lang.String r7 = r1.substring(r0, r7)     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.h2 r1 = r3.f()     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.i2 r1 = r1.K()     // Catch:{ all -> 0x0010 }
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0010 }
            if (r6 != 0) goto L_0x008d
            r6 = r7
        L_0x008d:
            r1.d(r2, r4, r5, r6)     // Catch:{ all -> 0x0010 }
            if (r8 == 0) goto L_0x00a1
            com.google.android.gms.measurement.internal.p r4 = r3.u0()     // Catch:{ all -> 0x0010 }
            long r5 = r8.a()     // Catch:{ all -> 0x0010 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0010 }
            r4.L0(r5)     // Catch:{ all -> 0x0010 }
        L_0x00a1:
            r3.Y()     // Catch:{ all -> 0x0010 }
        L_0x00a4:
            r3.f50522u = r0
            r3.V()
            return
        L_0x00aa:
            r3.f50522u = r0
            r3.V()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7728y5.D(java.lang.String, int, java.lang.Throwable, byte[], com.google.android.gms.measurement.internal.M5):void");
    }

    /* access modifiers changed from: package-private */
    public final P2 D0() {
        return this.f50513l;
    }

    public final C7623j4 E0() {
        return (C7623j4) j(this.f50509h);
    }

    public final Y4 F0() {
        return this.f50510i;
    }

    public final C7714w5 G0() {
        return this.f50511j;
    }

    /* access modifiers changed from: package-private */
    public final void H(String str, A2.a aVar) {
        int w10;
        int indexOf;
        Set<String> R10 = B0().R(str);
        if (R10 != null) {
            aVar.o0(R10);
        }
        if (B0().a0(str)) {
            aVar.P0();
        }
        if (B0().d0(str)) {
            String z12 = aVar.z1();
            if (!TextUtils.isEmpty(z12) && (indexOf = z12.indexOf(".")) != -1) {
                aVar.j1(z12.substring(0, indexOf));
            }
        }
        if (B0().e0(str) && (w10 = N5.w(aVar, "_id")) != -1) {
            aVar.g0(w10);
        }
        if (B0().c0(str)) {
            aVar.U0();
        }
        if (B0().Z(str)) {
            aVar.G0();
            if (b0(str).x()) {
                c cVar = this.f50495D.get(str);
                if (cVar == null || cVar.f50537b + r0().A(str, K.f49758f0) < zzb().c()) {
                    cVar = new c();
                    this.f50495D.put(str, cVar);
                }
                aVar.W0(cVar.f50536a);
            }
        }
        if (B0().b0(str)) {
            aVar.p1();
        }
    }

    public final N5 H0() {
        return (N5) j(this.f50508g);
    }

    /* access modifiers changed from: package-private */
    public final void I(String str, C7583e eVar) {
        C7611i r02 = r0();
        Y1<Boolean> y12 = K.f49711K0;
        if (r02.r(y12)) {
            q().k();
            L0();
            M5 M10 = u0().M(eVar.f50114a);
            if (M10 == null) {
                f().J().c("Queued batch doesn't exist. appId, rowId", str, Long.valueOf(eVar.f50114a));
                return;
            }
            String e10 = M10.e();
            if (eVar.f50115b == Y.SUCCESS.zza()) {
                if (this.f50496E.containsKey(e10)) {
                    this.f50496E.remove(e10);
                }
                u0().Y(Long.valueOf(eVar.f50114a));
                if (eVar.f50116c > 0) {
                    C7660p u02 = u0();
                    long j10 = eVar.f50116c;
                    if (u02.a().r(y12)) {
                        u02.k();
                        u02.s();
                        C6620s.l(Long.valueOf(j10));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("upload_type", Integer.valueOf(X.GOOGLE_SIGNAL.zza()));
                        contentValues.put("creation_timestamp", Long.valueOf(u02.zzb().a()));
                        try {
                            if (((long) u02.z().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j10), str, String.valueOf(X.GOOGLE_SIGNAL_PENDING.zza())})) != 1) {
                                u02.f().J().c("Google Signal pending batch not updated. appId, rowId", str, Long.valueOf(j10));
                            }
                        } catch (SQLiteException e11) {
                            u02.f().E().d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j10), e11);
                            throw e11;
                        }
                    }
                }
            } else {
                b bVar = this.f50496E.get(e10);
                if (bVar == null) {
                    this.f50496E.put(e10, new b(this));
                } else {
                    bVar.a();
                }
                u0().L0(Long.valueOf(eVar.f50114a));
            }
        }
    }

    public final Q5 I0() {
        return ((P2) C6620s.l(this.f50513l)).M();
    }

    public final void J0() {
        q().k();
    }

    public final void K(String str, C7630k4 k4Var) {
        q().k();
        String str2 = this.f50498G;
        if (str2 == null || str2.equals(str) || k4Var != null) {
            this.f50498G = str;
            this.f50497F = k4Var;
        }
    }

    /* access modifiers changed from: package-private */
    public final void K0() {
        q().k();
        L0();
        if (!this.f50515n) {
            this.f50515n = true;
            if (a0()) {
                int b10 = b(this.f50525x);
                int C10 = this.f50513l.A().C();
                q().k();
                if (b10 > C10) {
                    f().E().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(b10), Integer.valueOf(C10));
                } else if (b10 >= C10) {
                } else {
                    if (Q(C10, this.f50525x)) {
                        f().I().c("Storage version upgraded. Previous, current version", Integer.valueOf(b10), Integer.valueOf(C10));
                    } else {
                        f().E().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(b10), Integer.valueOf(C10));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void L(String str, E5 e52) {
        q().k();
        L0();
        if (C0(e52)) {
            if (!e52.f49603h) {
                g(e52);
                return;
            }
            Boolean A02 = A0(e52);
            if (!"_npa".equals(str) || A02 == null) {
                f().D().b("Removing user property", this.f50513l.C().g(str));
                u0().l1();
                try {
                    g(e52);
                    if ("_id".equals(str)) {
                        u0().a1((String) C6620s.l(e52.f49596a), "_lair");
                    }
                    u0().a1((String) C6620s.l(e52.f49596a), str);
                    u0().q1();
                    f().D().b("User property removed", this.f50513l.C().g(str));
                    u0().o1();
                } catch (Throwable th2) {
                    u0().o1();
                    throw th2;
                }
            } else {
                f().D().a("Falling back to manifest metadata value for ad personalization");
                B(new P5("_npa", zzb().a(), Long.valueOf(A02.booleanValue() ? 1 : 0), "auto"), e52);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void L0() {
        if (!this.f50514m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    public final void M0() {
        this.f50520s++;
    }

    /* access modifiers changed from: package-private */
    public final void N0() {
        this.f50519r++;
    }

    /* access modifiers changed from: package-private */
    public final void O(boolean z10) {
        Y();
    }

    /* access modifiers changed from: protected */
    public final void O0() {
        int delete;
        q().k();
        u0().p1();
        C7660p u02 = u0();
        u02.k();
        u02.s();
        if (u02.s0()) {
            Y1<Long> y12 = K.f49781q0;
            if (y12.a(null).longValue() != 0 && (delete = u02.z().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(u02.zzb().a()), String.valueOf(y12.a(null))})) > 0) {
                u02.f().I().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
            }
        }
        if (this.f50510i.f50014h.a() == 0) {
            this.f50510i.f50014h.b(zzb().a());
        }
        Y();
    }

    /* access modifiers changed from: package-private */
    public final void P(boolean z10, int i10, Throwable th2, byte[] bArr, String str, List<Pair<C7459z2, C7735z5>> list) {
        byte[] bArr2;
        long j10;
        C7660p u02;
        int i11 = i10;
        Throwable th3 = th2;
        String str2 = str;
        q().k();
        L0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (SQLiteException e10) {
                f().E().b("Database error while trying to delete uploaded bundles", e10);
                this.f50516o = zzb().c();
                f().I().b("Disable upload, time", Long.valueOf(this.f50516o));
            } catch (Throwable th4) {
                this.f50522u = false;
                V();
                throw th4;
            }
        } else {
            bArr2 = bArr;
        }
        List<Long> list2 = (List) C6620s.l(this.f50526y);
        this.f50526y = null;
        if (z10) {
            if ((i11 != 200 && i11 != 204) || th3 != null) {
                String str3 = new String(bArr2, StandardCharsets.UTF_8);
                f().K().d("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th3, str3.substring(0, Math.min(32, str3.length())));
                this.f50510i.f50015i.b(zzb().a());
                if (i11 == 503 || i11 == 429) {
                    this.f50510i.f50013g.b(zzb().a());
                }
                u0().f0(list2);
                Y();
                this.f50522u = false;
                V();
            }
        }
        f().I().c("Network upload successful with code, uploadAttempted", Integer.valueOf(i10), Boolean.valueOf(z10));
        if (z10) {
            this.f50510i.f50014h.b(zzb().a());
        }
        this.f50510i.f50015i.b(0);
        Y();
        if (z10) {
            f().I().c("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr2.length));
        } else {
            f().I().a("Purged empty bundles");
        }
        u0().l1();
        long j11 = -1;
        if (!r0().r(K.f49707I0)) {
            j10 = -1;
        } else if (r0().r(K.f49711K0)) {
            HashMap hashMap = new HashMap();
            for (Pair next : list) {
                C7459z2 z2Var = (C7459z2) next.first;
                C7735z5 z5Var = (C7735z5) next.second;
                if (z5Var.a() != X.SGTM_CLIENT) {
                    long j12 = j11;
                    long F10 = u0().F(str, z2Var, z5Var.c(), z5Var.d(), z5Var.a(), (Long) null);
                    if (z5Var.a() == X.GOOGLE_SIGNAL_PENDING && F10 != j12 && !z2Var.T().isEmpty()) {
                        hashMap.put(z2Var.T(), Long.valueOf(F10));
                    }
                    j11 = j12;
                }
            }
            j10 = j11;
            for (Pair next2 : list) {
                C7459z2 z2Var2 = (C7459z2) next2.first;
                C7735z5 z5Var2 = (C7735z5) next2.second;
                if (z5Var2.a() == X.SGTM_CLIENT) {
                    u0().F(str, z2Var2, z5Var2.c(), z5Var2.d(), z5Var2.a(), (Long) hashMap.get(z2Var2.T()));
                }
            }
        } else {
            j10 = -1;
            for (Pair next3 : list) {
                C7735z5 z5Var3 = (C7735z5) next3.second;
                u0().F(str, (C7459z2) next3.first, z5Var3.c(), z5Var3.d(), z5Var3.a(), (Long) null);
            }
        }
        for (Long l10 : list2) {
            try {
                u02 = u0();
                long longValue = l10.longValue();
                u02.k();
                u02.s();
                if (u02.z().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                }
            } catch (SQLiteException e11) {
                u02.f().E().b("Failed to delete a bundle in a queue table", e11);
                throw e11;
            } catch (SQLiteException e12) {
                List<Long> list3 = this.f50527z;
                if (list3 == null || !list3.contains(l10)) {
                    throw e12;
                }
            }
        }
        u0().q1();
        u0().o1();
        this.f50527z = null;
        if (z0().z() && Z()) {
            P0();
        } else if (!r0().r(K.f49707I0) || !z0().z() || !u0().m1(str2)) {
            this.f50492A = j10;
            Y();
        } else {
            t0(str2);
        }
        this.f50516o = 0;
        this.f50522u = false;
        V();
    }

    /* access modifiers changed from: package-private */
    public final void P0() {
        C7676r2 S02;
        q().k();
        L0();
        this.f50523v = true;
        try {
            Boolean a02 = this.f50513l.K().a0();
            if (a02 == null) {
                f().J().a("Upload data called on the client side before use of service was decided");
            } else if (a02.booleanValue()) {
                f().E().a("Upload called in the client side when service should be used");
                this.f50523v = false;
                V();
            } else if (this.f50516o > 0) {
                Y();
                this.f50523v = false;
                V();
            } else {
                q().k();
                if (this.f50526y != null) {
                    f().I().a("Uploading requested multiple times");
                    this.f50523v = false;
                    V();
                } else if (!z0().z()) {
                    f().I().a("Network not connected, ignoring upload request");
                    Y();
                    this.f50523v = false;
                    V();
                } else {
                    long a10 = zzb().a();
                    int w10 = r0().w((String) null, K.f49752d0);
                    r0();
                    long I10 = a10 - C7611i.I();
                    for (int i10 = 0; i10 < w10 && j0((String) null, I10); i10++) {
                    }
                    if (C7297f7.a()) {
                        W();
                    }
                    long a11 = this.f50510i.f50014h.a();
                    if (a11 != 0) {
                        f().D().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a10 - a11)));
                    }
                    String A10 = u0().A();
                    if (!TextUtils.isEmpty(A10)) {
                        if (this.f50492A == -1) {
                            this.f50492A = u0().w();
                        }
                        F(A10, a10);
                    } else {
                        this.f50492A = -1;
                        C7660p u02 = u0();
                        r0();
                        String I02 = u02.I0(a10 - C7611i.I());
                        if (!TextUtils.isEmpty(I02) && (S02 = u0().S0(I02)) != null) {
                            h0(S02);
                        }
                    }
                    this.f50523v = false;
                    V();
                }
            }
        } finally {
            this.f50523v = false;
            V();
        }
    }

    /* access modifiers changed from: package-private */
    public final C7671q3 b0(String str) {
        q().k();
        L0();
        C7671q3 q3Var = this.f50493B.get(str);
        if (q3Var == null) {
            q3Var = u0().Z0(str);
            if (q3Var == null) {
                q3Var = C7671q3.f50297c;
            }
            J(str, q3Var);
        }
        return q3Var;
    }

    /* access modifiers changed from: package-private */
    public final Bundle c(String str) {
        q().k();
        L0();
        if (B0().H(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        C7671q3 b02 = b0(str);
        bundle.putAll(b02.n());
        bundle.putAll(e(str, p0(str), b02, new C7646n()).f());
        R5 U02 = u0().U0(str, "_npa");
        bundle.putString("ad_personalization", (U02 != null ? U02.f49946e.equals(1L) : a(str, new C7646n())) == 1 ? "denied" : "granted");
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final String c0(E5 e52) {
        try {
            return (String) q().u(new F5(this, e52)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            f().E().c("Failed to get app instance id. appId", C7607h2.t(e52.f49596a), e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void e0(C7597g gVar) {
        E5 k02 = k0((String) C6620s.l(gVar.f50134a));
        if (k02 != null) {
            f0(gVar, k02);
        }
    }

    public final C7607h2 f() {
        return ((P2) C6620s.l(this.f50513l)).f();
    }

    /* access modifiers changed from: package-private */
    public final void f0(C7597g gVar, E5 e52) {
        boolean z10;
        C6620s.l(gVar);
        C6620s.f(gVar.f50134a);
        C6620s.l(gVar.f50135b);
        C6620s.l(gVar.f50136c);
        C6620s.f(gVar.f50136c.f49912b);
        q().k();
        L0();
        if (C0(e52)) {
            if (!e52.f49603h) {
                g(e52);
                return;
            }
            C7597g gVar2 = new C7597g(gVar);
            boolean z11 = false;
            gVar2.f50138e = false;
            u0().l1();
            try {
                C7597g P02 = u0().P0((String) C6620s.l(gVar2.f50134a), gVar2.f50136c.f49912b);
                if (P02 != null && !P02.f50135b.equals(gVar2.f50135b)) {
                    f().J().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f50513l.C().g(gVar2.f50136c.f49912b), gVar2.f50135b, P02.f50135b);
                }
                if (P02 != null && (z10 = P02.f50138e)) {
                    gVar2.f50135b = P02.f50135b;
                    gVar2.f50137d = P02.f50137d;
                    gVar2.f50141h = P02.f50141h;
                    gVar2.f50139f = P02.f50139f;
                    gVar2.f50142i = P02.f50142i;
                    gVar2.f50138e = z10;
                    P5 p52 = gVar2.f50136c;
                    gVar2.f50136c = new P5(p52.f49912b, P02.f50136c.f49913c, p52.x(), P02.f50136c.f49916f);
                } else if (TextUtils.isEmpty(gVar2.f50139f)) {
                    P5 p53 = gVar2.f50136c;
                    gVar2.f50136c = new P5(p53.f49912b, gVar2.f50137d, p53.x(), gVar2.f50136c.f49916f);
                    z11 = true;
                    gVar2.f50138e = true;
                }
                if (gVar2.f50138e) {
                    P5 p54 = gVar2.f50136c;
                    R5 r52 = new R5((String) C6620s.l(gVar2.f50134a), gVar2.f50135b, p54.f49912b, p54.f49913c, C6620s.l(p54.x()));
                    if (u0().k0(r52)) {
                        f().D().d("User property updated immediately", gVar2.f50134a, this.f50513l.C().g(r52.f49944c), r52.f49946e);
                    } else {
                        f().E().d("(2)Too many active user properties, ignoring", C7607h2.t(gVar2.f50134a), this.f50513l.C().g(r52.f49944c), r52.f49946e);
                    }
                    if (z11 && gVar2.f50142i != null) {
                        m0(new J(gVar2.f50142i, gVar2.f50137d), e52);
                    }
                }
                if (u0().i0(gVar2)) {
                    f().D().d("Conditional property added", gVar2.f50134a, this.f50513l.C().g(gVar2.f50136c.f49912b), gVar2.f50136c.x());
                } else {
                    f().E().d("Too many conditional properties, ignoring", C7607h2.t(gVar2.f50134a), this.f50513l.C().g(gVar2.f50136c.f49912b), gVar2.f50136c.x());
                }
                u0().q1();
                u0().o1();
            } catch (Throwable th2) {
                u0().o1();
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C7676r2 g(com.google.android.gms.measurement.internal.E5 r13) {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.J2 r0 = r12.q()
            r0.k()
            r12.L0()
            K9.C6620s.l(r13)
            java.lang.String r0 = r13.f49596a
            K9.C6620s.f(r0)
            java.lang.String r0 = r13.f49617v
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0029
            java.util.Map<java.lang.String, com.google.android.gms.measurement.internal.y5$c> r0 = r12.f50495D
            java.lang.String r2 = r13.f49596a
            com.google.android.gms.measurement.internal.y5$c r3 = new com.google.android.gms.measurement.internal.y5$c
            java.lang.String r4 = r13.f49617v
            r3.<init>(r4)
            r0.put(r2, r3)
        L_0x0029:
            com.google.android.gms.measurement.internal.p r0 = r12.u0()
            java.lang.String r2 = r13.f49596a
            com.google.android.gms.measurement.internal.r2 r0 = r0.S0(r2)
            java.lang.String r2 = r13.f49596a
            com.google.android.gms.measurement.internal.q3 r2 = r12.b0(r2)
            java.lang.String r3 = r13.f49616u
            com.google.android.gms.measurement.internal.q3 r3 = com.google.android.gms.measurement.internal.C7671q3.p(r3)
            com.google.android.gms.measurement.internal.q3 r2 = r2.d(r3)
            boolean r3 = r2.w()
            if (r3 == 0) goto L_0x0054
            com.google.android.gms.measurement.internal.Y4 r3 = r12.f50510i
            java.lang.String r4 = r13.f49596a
            boolean r5 = r13.f49609n
            java.lang.String r3 = r3.y(r4, r5)
            goto L_0x0056
        L_0x0054:
            java.lang.String r3 = ""
        L_0x0056:
            r4 = 0
            if (r0 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.r2 r0 = new com.google.android.gms.measurement.internal.r2
            com.google.android.gms.measurement.internal.P2 r5 = r12.f50513l
            java.lang.String r6 = r13.f49596a
            r0.<init>(r5, r6)
            boolean r5 = r2.x()
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = r12.m(r2)
            r0.J(r5)
        L_0x006f:
            boolean r2 = r2.w()
            if (r2 == 0) goto L_0x0078
            r0.g0(r3)
        L_0x0078:
            r2 = r4
            goto L_0x0130
        L_0x007b:
            boolean r5 = r2.w()
            if (r5 == 0) goto L_0x0117
            if (r3 == 0) goto L_0x0117
            java.lang.String r5 = r0.s()
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0117
            java.lang.String r5 = r0.s()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r0.g0(r3)
            boolean r3 = r13.f49609n
            if (r3 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.Y4 r3 = r12.f50510i
            java.lang.String r6 = r13.f49596a
            android.util.Pair r3 = r3.x(r6, r2)
            java.lang.Object r3 = r3.first
            java.lang.String r6 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x00fe
            if (r5 != 0) goto L_0x00fe
            boolean r3 = r2.x()
            if (r3 == 0) goto L_0x00bf
            java.lang.String r2 = r12.m(r2)
            r0.J(r2)
            r2 = r4
            goto L_0x00c0
        L_0x00bf:
            r2 = 1
        L_0x00c0:
            com.google.android.gms.measurement.internal.p r3 = r12.u0()
            java.lang.String r5 = r13.f49596a
            java.lang.String r6 = "_id"
            com.google.android.gms.measurement.internal.R5 r3 = r3.U0(r5, r6)
            if (r3 == 0) goto L_0x0130
            com.google.android.gms.measurement.internal.p r3 = r12.u0()
            java.lang.String r5 = r13.f49596a
            java.lang.String r6 = "_lair"
            com.google.android.gms.measurement.internal.R5 r3 = r3.U0(r5, r6)
            if (r3 != 0) goto L_0x0130
            com.google.android.gms.common.util.e r3 = r12.zzb()
            long r9 = r3.a()
            com.google.android.gms.measurement.internal.R5 r3 = new com.google.android.gms.measurement.internal.R5
            java.lang.String r6 = r13.f49596a
            r7 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "auto"
            java.lang.String r8 = "_lair"
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r11)
            com.google.android.gms.measurement.internal.p r5 = r12.u0()
            r5.k0(r3)
            goto L_0x0130
        L_0x00fe:
            java.lang.String r3 = r0.m()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0078
            boolean r3 = r2.x()
            if (r3 == 0) goto L_0x0078
            java.lang.String r2 = r12.m(r2)
            r0.J(r2)
            goto L_0x0078
        L_0x0117:
            java.lang.String r3 = r0.m()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0078
            boolean r3 = r2.x()
            if (r3 == 0) goto L_0x0078
            java.lang.String r2 = r12.m(r2)
            r0.J(r2)
            goto L_0x0078
        L_0x0130:
            java.lang.String r3 = r13.f49597b
            r0.a0(r3)
            java.lang.String r3 = r13.f49611p
            r0.f(r3)
            java.lang.String r3 = r13.f49606k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0147
            java.lang.String r3 = r13.f49606k
            r0.X(r3)
        L_0x0147:
            long r5 = r13.f49600e
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0152
            r0.v0(r5)
        L_0x0152:
            java.lang.String r3 = r13.f49598c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x015f
            java.lang.String r3 = r13.f49598c
            r0.T(r3)
        L_0x015f:
            long r5 = r13.f49605j
            r0.H(r5)
            java.lang.String r3 = r13.f49599d
            if (r3 == 0) goto L_0x016b
            r0.O(r3)
        L_0x016b:
            long r5 = r13.f49601f
            r0.o0(r5)
            boolean r3 = r13.f49603h
            r0.K(r3)
            java.lang.String r3 = r13.f49602g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0182
            java.lang.String r3 = r13.f49602g
            r0.d0(r3)
        L_0x0182:
            boolean r3 = r13.f49609n
            r0.h(r3)
            java.lang.Boolean r3 = r13.f49612q
            r0.d(r3)
            long r5 = r13.f49613r
            r0.r0(r5)
            java.lang.String r3 = r13.f49618w
            r0.m0(r3)
            boolean r3 = com.google.android.gms.internal.measurement.N6.a()
            if (r3 == 0) goto L_0x01ae
            com.google.android.gms.measurement.internal.i r3 = r12.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.K.f49703G0
            boolean r3 = r3.r(r5)
            if (r3 == 0) goto L_0x01ae
            java.util.List<java.lang.String> r1 = r13.f49614s
            r0.g(r1)
            goto L_0x01c3
        L_0x01ae:
            boolean r3 = com.google.android.gms.internal.measurement.N6.a()
            if (r3 == 0) goto L_0x01c3
            com.google.android.gms.measurement.internal.i r3 = r12.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.K.f49701F0
            boolean r3 = r3.r(r5)
            if (r3 == 0) goto L_0x01c3
            r0.g(r1)
        L_0x01c3:
            boolean r1 = r13.f49619x
            r0.P(r1)
            java.lang.String r1 = r13.f49592D
            r0.p0(r1)
            boolean r1 = com.google.android.gms.internal.measurement.C7297f7.a()
            if (r1 == 0) goto L_0x01e4
            com.google.android.gms.measurement.internal.i r1 = r12.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.K.f49723Q0
            boolean r1 = r1.r(r3)
            if (r1 == 0) goto L_0x01e4
            int r1 = r13.f49590B
            r0.b(r1)
        L_0x01e4:
            long r5 = r13.f49620y
            r0.H0(r5)
            java.lang.String r1 = r13.f49593E
            r0.j0(r1)
            com.google.android.gms.measurement.internal.i r1 = r12.r0()
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.K.f49711K0
            boolean r1 = r1.r(r3)
            if (r1 == 0) goto L_0x01ff
            int r13 = r13.f49595G
            r0.G(r13)
        L_0x01ff:
            boolean r13 = r0.B()
            if (r13 != 0) goto L_0x0207
            if (r2 == 0) goto L_0x020e
        L_0x0207:
            com.google.android.gms.measurement.internal.p r13 = r12.u0()
            r13.X(r0, r2, r4)
        L_0x020e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7728y5.g(com.google.android.gms.measurement.internal.E5):com.google.android.gms.measurement.internal.r2");
    }

    /* access modifiers changed from: package-private */
    public final C7707v5 i(String str, k0 k0Var) {
        if (!r0().r(K.f49711K0)) {
            return new C7707v5(Collections.emptyList());
        }
        q().k();
        L0();
        List<M5> T10 = u0().T(str, k0Var, K.f49794x.a(null).intValue());
        ArrayList arrayList = new ArrayList();
        for (M5 next : T10) {
            if (w0(next.e())) {
                C7693t5 b10 = next.b();
                try {
                    C7459z2.b bVar = (C7459z2.b) N5.E(C7459z2.P(), b10.f50428b);
                    for (int i10 = 0; i10 < bVar.z(); i10++) {
                        bVar.A(i10, ((A2.a) bVar.G(i10).A()).b1(zzb().a()));
                    }
                    b10.f50428b = ((C7459z2) ((L4) bVar.s())).l();
                    if (f().A(2)) {
                        b10.f50433g = H0().K((C7459z2) ((L4) bVar.s()));
                    }
                    arrayList.add(b10);
                } catch (U4 unused) {
                    f().J().b("Failed to parse queued batch. appId", str);
                }
            }
        }
        return new C7707v5(arrayList);
    }

    /* access modifiers changed from: package-private */
    public final void i0(C7676r2 r2Var, A2.a aVar) {
        q().k();
        L0();
        C7388q2.a R10 = C7388q2.R();
        byte[] E10 = r2Var.E();
        if (E10 != null) {
            try {
                R10 = (C7388q2.a) N5.E(R10, E10);
            } catch (U4 unused) {
                f().J().b("Failed to parse locally stored ad campaign info. appId", C7607h2.t(r2Var.l()));
            }
        }
        for (C7427v2 next : aVar.T()) {
            if (next.X().equals("_cmp")) {
                String str = (String) N5.H(next, "gclid", "");
                String str2 = (String) N5.H(next, "gbraid", "");
                String str3 = (String) N5.H(next, "gad_source", "");
                if (!str.isEmpty() || !str2.isEmpty()) {
                    long longValue = ((Long) N5.H(next, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = next.U();
                    }
                    if ("referrer API v2".equals(N5.d0(next, "_cis"))) {
                        if (longValue > R10.D()) {
                            if (str.isEmpty()) {
                                R10.R();
                            } else {
                                R10.P(str);
                            }
                            if (str2.isEmpty()) {
                                R10.Q();
                            } else {
                                R10.N(str2);
                            }
                            if (str3.isEmpty()) {
                                R10.O();
                            } else {
                                R10.L(str3);
                            }
                            R10.E(longValue);
                        }
                    } else if (longValue > R10.z()) {
                        if (str.isEmpty()) {
                            R10.M();
                        } else {
                            R10.I(str);
                        }
                        if (str2.isEmpty()) {
                            R10.K();
                        } else {
                            R10.G(str2);
                        }
                        if (str3.isEmpty()) {
                            R10.H();
                        } else {
                            R10.C(str3);
                        }
                        R10.A(longValue);
                    }
                }
            }
        }
        if (!((C7388q2) ((L4) R10.s())).equals(C7388q2.X())) {
            aVar.H((C7388q2) ((L4) R10.s()));
        }
        r2Var.i(((C7388q2) ((L4) R10.s())).l());
        if (r2Var.B()) {
            u0().X(r2Var, false, false);
        }
    }

    public final Y5 l0() {
        return (Y5) j(this.f50507f);
    }

    /* access modifiers changed from: package-private */
    public final List<C7645m5> o(E5 e52, Bundle bundle) {
        q().k();
        if (!C7297f7.a() || !r0().F(e52.f49596a, K.f49723Q0) || e52.f49596a == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    f().E().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C7660p u02 = u0();
                        String str = e52.f49596a;
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        C6620s.f(str);
                        u02.k();
                        u02.s();
                        try {
                            int delete = u02.z().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            C7614i2 I10 = u02.f().I();
                            I10.d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            u02.f().E().c("Error pruning trigger URIs. appId", C7607h2.t(str), e10);
                        }
                    }
                }
            }
        }
        return u0().d1(e52.f49596a);
    }

    /* access modifiers changed from: package-private */
    public final void o0(E5 e52) {
        q().k();
        L0();
        C6620s.l(e52);
        C6620s.f(e52.f49596a);
        int i10 = 0;
        if (r0().r(K.f49789u0)) {
            long a10 = zzb().a();
            int w10 = r0().w((String) null, K.f49752d0);
            r0();
            long I10 = a10 - C7611i.I();
            while (i10 < w10 && j0((String) null, I10)) {
                i10++;
            }
        } else {
            r0();
            long K10 = C7611i.K();
            while (((long) i10) < K10 && j0(e52.f49596a, 0)) {
                i10++;
            }
        }
        if (r0().r(K.f49791v0)) {
            W();
        }
        if (r0().r(K.f49713L0) && this.f50511j.t(e52.f49596a, E2.a.a(e52.f49595G))) {
            F(e52.f49596a, zzb().a());
        }
    }

    public final J2 q() {
        return ((P2) C6620s.l(this.f50513l)).q();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03b2 A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03dd A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03f4 A[SYNTHETIC, Splitter:B:131:0x03f4] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x048d A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04aa A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0516 A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010e A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01cd A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x022a A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0237 A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x024a A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q0(com.google.android.gms.measurement.internal.E5 r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "com.android.vending"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            com.google.android.gms.measurement.internal.J2 r9 = r23.q()
            r9.k()
            r23.L0()
            K9.C6620s.l(r24)
            java.lang.String r9 = r2.f49596a
            K9.C6620s.f(r9)
            boolean r9 = C0(r24)
            if (r9 != 0) goto L_0x002b
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.p r9 = r23.u0()
            java.lang.String r10 = r2.f49596a
            com.google.android.gms.measurement.internal.r2 r9 = r9.S0(r10)
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L_0x005f
            java.lang.String r13 = r9.q()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x005f
            java.lang.String r13 = r2.f49597b
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x005f
            r9.S(r11)
            com.google.android.gms.measurement.internal.p r13 = r23.u0()
            r13.X(r9, r10, r10)
            com.google.android.gms.measurement.internal.C2 r9 = r23.B0()
            java.lang.String r13 = r2.f49596a
            r9.U(r13)
        L_0x005f:
            boolean r9 = r2.f49603h
            if (r9 != 0) goto L_0x0067
            r23.g(r24)
            return
        L_0x0067:
            long r13 = r2.f49607l
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0075
            com.google.android.gms.common.util.e r9 = r23.zzb()
            long r13 = r9.a()
        L_0x0075:
            com.google.android.gms.measurement.internal.P2 r9 = r1.f50513l
            com.google.android.gms.measurement.internal.E r9 = r9.z()
            r9.k()
            int r9 = r2.f49608m
            r15 = 1
            if (r9 == 0) goto L_0x009d
            if (r9 == r15) goto L_0x009d
            com.google.android.gms.measurement.internal.h2 r16 = r23.f()
            com.google.android.gms.measurement.internal.i2 r15 = r16.J()
            java.lang.String r11 = r2.f49596a
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r12 = "Incorrect app type, assuming installed app. appId, appType"
            r15.c(r12, r11, r9)
            r9 = r10
        L_0x009d:
            com.google.android.gms.measurement.internal.p r11 = r23.u0()
            r11.l1()
            com.google.android.gms.measurement.internal.p r11 = r23.u0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r12 = r2.f49596a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.R5 r11 = r11.U0(r12, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Boolean r12 = A0(r24)     // Catch:{ all -> 0x00c5 }
            r21 = r3
            r22 = r4
            if (r11 == 0) goto L_0x00c8
            java.lang.String r15 = "auto"
            java.lang.String r10 = r11.f49943b     // Catch:{ all -> 0x00c5 }
            boolean r10 = r15.equals(r10)     // Catch:{ all -> 0x00c5 }
            if (r10 == 0) goto L_0x00c3
            goto L_0x00c8
        L_0x00c3:
            r10 = 1
            goto L_0x00fc
        L_0x00c5:
            r0 = move-exception
            goto L_0x0544
        L_0x00c8:
            if (r12 == 0) goto L_0x00f6
            com.google.android.gms.measurement.internal.P5 r0 = new com.google.android.gms.measurement.internal.P5     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_npa"
            boolean r10 = r12.booleanValue()     // Catch:{ all -> 0x00c5 }
            if (r10 == 0) goto L_0x00d7
            r18 = 1
            goto L_0x00d9
        L_0x00d7:
            r18 = 0
        L_0x00d9:
            java.lang.Long r19 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r10 = 1
            r15 = r0
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            if (r11 == 0) goto L_0x00f2
            java.lang.Object r11 = r11.f49946e     // Catch:{ all -> 0x00c5 }
            java.lang.Long r12 = r0.f49914d     // Catch:{ all -> 0x00c5 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x00c5 }
            if (r11 != 0) goto L_0x00fc
        L_0x00f2:
            r1.B(r0, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x00fc
        L_0x00f6:
            r10 = 1
            if (r11 == 0) goto L_0x00fc
            r1.L(r0, r2)     // Catch:{ all -> 0x00c5 }
        L_0x00fc:
            com.google.android.gms.measurement.internal.p r0 = r23.u0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = r2.f49596a     // Catch:{ all -> 0x00c5 }
            java.lang.Object r11 = K9.C6620s.l(r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.r2 r0 = r0.S0(r11)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x01cb
            r23.I0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r12 = r2.f49597b     // Catch:{ all -> 0x00c5 }
            java.lang.String r15 = r0.q()     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = r2.f49611p     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r0.j()     // Catch:{ all -> 0x00c5 }
            boolean r3 = com.google.android.gms.measurement.internal.Q5.k0(r12, r15, r11, r3)     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x01cb
            com.google.android.gms.measurement.internal.h2 r3 = r23.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r3 = r3.J()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r11 = r0.l()     // Catch:{ all -> 0x00c5 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r11)     // Catch:{ all -> 0x00c5 }
            r3.b(r4, r11)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.p r3 = r23.u0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = r0.l()     // Catch:{ all -> 0x00c5 }
            r3.s()     // Catch:{ all -> 0x00c5 }
            r3.k()     // Catch:{ all -> 0x00c5 }
            K9.C6620s.f(r4)     // Catch:{ all -> 0x00c5 }
            android.database.sqlite.SQLiteDatabase r0 = r3.z()     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String[] r11 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String r12 = "events"
            int r12 = r0.delete(r12, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String r15 = "user_attributes"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "apps"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "consent_settings"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "default_event_params"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "trigger_uris"
            int r0 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r0
            if (r12 <= 0) goto L_0x01ca
            com.google.android.gms.measurement.internal.h2 r0 = r3.f()     // Catch:{ SQLiteException -> 0x01b8 }
            com.google.android.gms.measurement.internal.i2 r0 = r0.I()     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String r8 = "Deleted application data. app, records"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x01b8 }
            r0.c(r8, r4, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            goto L_0x01ca
        L_0x01b8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h2 r3 = r3.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = "Error deleting application data. appId, error"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7607h2.t(r4)     // Catch:{ all -> 0x00c5 }
            r3.c(r8, r4, r0)     // Catch:{ all -> 0x00c5 }
        L_0x01ca:
            r0 = 0
        L_0x01cb:
            if (r0 == 0) goto L_0x0225
            long r3 = r0.V()     // Catch:{ all -> 0x00c5 }
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x01e4
            long r3 = r0.V()     // Catch:{ all -> 0x00c5 }
            long r10 = r2.f49605j     // Catch:{ all -> 0x00c5 }
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x01e4
            r3 = 1
            goto L_0x01e5
        L_0x01e4:
            r3 = 0
        L_0x01e5:
            java.lang.String r4 = r0.o()     // Catch:{ all -> 0x00c5 }
            long r10 = r0.V()     // Catch:{ all -> 0x00c5 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            java.lang.String r0 = r2.f49598c     // Catch:{ all -> 0x00c5 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x0200
            r15 = 1
            goto L_0x0201
        L_0x0200:
            r15 = 0
        L_0x0201:
            r0 = r3 | r15
            if (r0 == 0) goto L_0x0225
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "_pv"
            r0.putString(r3, r4)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.J r3 = new com.google.android.gms.measurement.internal.J     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_au"
            com.google.android.gms.measurement.internal.F r4 = new com.google.android.gms.measurement.internal.F     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.v(r3, r2)     // Catch:{ all -> 0x00c5 }
        L_0x0225:
            r23.g(r24)     // Catch:{ all -> 0x00c5 }
            if (r9 != 0) goto L_0x0237
            com.google.android.gms.measurement.internal.p r0 = r23.u0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r2.f49596a     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.G r0 = r0.R0(r3, r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0248
        L_0x0237:
            r3 = 1
            if (r9 != r3) goto L_0x0247
            com.google.android.gms.measurement.internal.p r0 = r23.u0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r2.f49596a     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.G r0 = r0.R0(r3, r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0248
        L_0x0247:
            r0 = 0
        L_0x0248:
            if (r0 != 0) goto L_0x0516
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r10 = r13 / r3
            r15 = 1
            long r10 = r10 + r15
            long r10 = r10 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r12 = "_r"
            java.lang.String r15 = "_c"
            if (r9 != 0) goto L_0x04c7
            com.google.android.gms.measurement.internal.P5 r0 = new com.google.android.gms.measurement.internal.P5     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_fot"
            java.lang.Long r19 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r9 = r15
            r15 = r0
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            r1.B(r0, r2)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.J2 r0 = r23.q()     // Catch:{ all -> 0x00c5 }
            r0.k()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.A2 r0 = r1.f50512k     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = K9.C6620s.l(r0)     // Catch:{ all -> 0x00c5 }
            r10 = r0
            com.google.android.gms.measurement.internal.A2 r10 = (com.google.android.gms.measurement.internal.A2) r10     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r2.f49596a     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0373
            boolean r11 = r0.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r11 == 0) goto L_0x028d
            goto L_0x0373
        L_0x028d:
            com.google.android.gms.measurement.internal.P2 r11 = r10.f49520a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.J2 r11 = r11.q()     // Catch:{ all -> 0x00c5 }
            r11.k()     // Catch:{ all -> 0x00c5 }
            boolean r11 = r10.b()     // Catch:{ all -> 0x00c5 }
            if (r11 != 0) goto L_0x02ad
            com.google.android.gms.measurement.internal.P2 r0 = r10.f49520a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.h2 r0 = r0.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r0 = r0.H()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Install Referrer Reporter is not available"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x02ad:
            com.google.android.gms.measurement.internal.z2 r11 = new com.google.android.gms.measurement.internal.z2     // Catch:{ all -> 0x00c5 }
            r11.<init>(r10, r0)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.P2 r0 = r10.f49520a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.J2 r0 = r0.q()     // Catch:{ all -> 0x00c5 }
            r0.k()     // Catch:{ all -> 0x00c5 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x00c5 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x00c5 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r6, r8)     // Catch:{ all -> 0x00c5 }
            r0.setComponent(r15)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.P2 r8 = r10.f49520a     // Catch:{ all -> 0x00c5 }
            android.content.Context r8 = r8.zza()     // Catch:{ all -> 0x00c5 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ all -> 0x00c5 }
            if (r8 != 0) goto L_0x02e9
            com.google.android.gms.measurement.internal.P2 r0 = r10.f49520a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.h2 r0 = r0.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r0 = r0.L()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x02e9:
            r15 = 0
            java.util.List r8 = r8.queryIntentServices(r0, r15)     // Catch:{ all -> 0x00c5 }
            if (r8 == 0) goto L_0x0363
            boolean r16 = r8.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r16 != 0) goto L_0x0363
            java.lang.Object r8 = r8.get(r15)     // Catch:{ all -> 0x00c5 }
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8     // Catch:{ all -> 0x00c5 }
            android.content.pm.ServiceInfo r8 = r8.serviceInfo     // Catch:{ all -> 0x00c5 }
            if (r8 == 0) goto L_0x0382
            java.lang.String r15 = r8.packageName     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = r8.name     // Catch:{ all -> 0x00c5 }
            if (r8 == 0) goto L_0x0353
            boolean r6 = r6.equals(r15)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0353
            boolean r6 = r10.b()     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0353
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x00c5 }
            r6.<init>(r0)     // Catch:{ all -> 0x00c5 }
            Q9.b r0 = Q9.b.b()     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.P2 r8 = r10.f49520a     // Catch:{ RuntimeException -> 0x0337 }
            android.content.Context r8 = r8.zza()     // Catch:{ RuntimeException -> 0x0337 }
            r15 = 1
            boolean r0 = r0.a(r8, r6, r11, r15)     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.P2 r6 = r10.f49520a     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.i2 r6 = r6.I()     // Catch:{ RuntimeException -> 0x0337 }
            java.lang.String r11 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x0339
            java.lang.String r0 = "available"
            goto L_0x033b
        L_0x0337:
            r0 = move-exception
            goto L_0x033f
        L_0x0339:
            java.lang.String r0 = "not available"
        L_0x033b:
            r6.b(r11, r0)     // Catch:{ RuntimeException -> 0x0337 }
            goto L_0x0382
        L_0x033f:
            com.google.android.gms.measurement.internal.P2 r6 = r10.f49520a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r6 = r6.E()     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00c5 }
            r6.b(r10, r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x0353:
            com.google.android.gms.measurement.internal.P2 r0 = r10.f49520a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.h2 r0 = r0.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r0 = r0.J()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x0363:
            com.google.android.gms.measurement.internal.P2 r0 = r10.f49520a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.h2 r0 = r0.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r0 = r0.H()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x0373:
            com.google.android.gms.measurement.internal.P2 r0 = r10.f49520a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.h2 r0 = r0.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r0 = r0.L()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Install Referrer Reporter was called with invalid app package name"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
        L_0x0382:
            com.google.android.gms.measurement.internal.J2 r0 = r23.q()     // Catch:{ all -> 0x00c5 }
            r0.k()     // Catch:{ all -> 0x00c5 }
            r23.L0()     // Catch:{ all -> 0x00c5 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r6.<init>()     // Catch:{ all -> 0x00c5 }
            r10 = 1
            r6.putLong(r9, r10)     // Catch:{ all -> 0x00c5 }
            r6.putLong(r12, r10)     // Catch:{ all -> 0x00c5 }
            r8 = 0
            r6.putLong(r7, r8)     // Catch:{ all -> 0x00c5 }
            r6.putLong(r5, r8)     // Catch:{ all -> 0x00c5 }
            r12 = r22
            r6.putLong(r12, r8)     // Catch:{ all -> 0x00c5 }
            r15 = r21
            r6.putLong(r15, r8)     // Catch:{ all -> 0x00c5 }
            r6.putLong(r4, r10)     // Catch:{ all -> 0x00c5 }
            boolean r0 = r2.f49610o     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x03b5
            r6.putLong(r3, r10)     // Catch:{ all -> 0x00c5 }
        L_0x03b5:
            java.lang.String r0 = r2.f49596a     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = K9.C6620s.l(r0)     // Catch:{ all -> 0x00c5 }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.p r0 = r23.u0()     // Catch:{ all -> 0x00c5 }
            K9.C6620s.f(r3)     // Catch:{ all -> 0x00c5 }
            r0.k()     // Catch:{ all -> 0x00c5 }
            r0.s()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "first_open_count"
            long r8 = r0.F0(r3, r4)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.P2 r0 = r1.f50513l     // Catch:{ all -> 0x00c5 }
            android.content.Context r0 = r0.zza()     // Catch:{ all -> 0x00c5 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x03f4
            com.google.android.gms.measurement.internal.h2 r0 = r23.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r0 = r0.E()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7607h2.t(r3)     // Catch:{ all -> 0x00c5 }
            r0.b(r4, r3)     // Catch:{ all -> 0x00c5 }
            r21 = r5
        L_0x03f0:
            r3 = 0
            goto L_0x04a6
        L_0x03f4:
            com.google.android.gms.measurement.internal.P2 r0 = r1.f50513l     // Catch:{ NameNotFoundException -> 0x0404 }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x0404 }
            S9.b r0 = S9.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0404 }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.e(r3, r4)     // Catch:{ NameNotFoundException -> 0x0404 }
            goto L_0x0417
        L_0x0404:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h2 r4 = r23.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r4 = r4.E()     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r3)     // Catch:{ all -> 0x00c5 }
            r4.c(r10, r11, r0)     // Catch:{ all -> 0x00c5 }
            r0 = 0
        L_0x0417:
            if (r0 == 0) goto L_0x0465
            long r10 = r0.firstInstallTime     // Catch:{ all -> 0x00c5 }
            r16 = 0
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0465
            r21 = r5
            long r4 = r0.lastUpdateTime     // Catch:{ all -> 0x00c5 }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0448
            com.google.android.gms.measurement.internal.i r0 = r23.r0()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.K.f49697D0     // Catch:{ all -> 0x00c5 }
            boolean r0 = r0.r(r4)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0441
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0446
            r4 = 1
            r6.putLong(r7, r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0446
        L_0x0441:
            r4 = 1
            r6.putLong(r7, r4)     // Catch:{ all -> 0x00c5 }
        L_0x0446:
            r0 = 0
            goto L_0x0449
        L_0x0448:
            r0 = 1
        L_0x0449:
            com.google.android.gms.measurement.internal.P5 r4 = new com.google.android.gms.measurement.internal.P5     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_fi"
            if (r0 == 0) goto L_0x0452
            r10 = 1
            goto L_0x0454
        L_0x0452:
            r10 = 0
        L_0x0454:
            java.lang.Long r19 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r5 = r15
            r15 = r4
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            r1.B(r4, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x0468
        L_0x0465:
            r21 = r5
            r5 = r15
        L_0x0468:
            com.google.android.gms.measurement.internal.P2 r0 = r1.f50513l     // Catch:{ NameNotFoundException -> 0x0478 }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x0478 }
            S9.b r0 = S9.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0478 }
            r4 = 0
            android.content.pm.ApplicationInfo r11 = r0.c(r3, r4)     // Catch:{ NameNotFoundException -> 0x0478 }
            goto L_0x048b
        L_0x0478:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h2 r4 = r23.f()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.i2 r4 = r4.E()     // Catch:{ all -> 0x00c5 }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7607h2.t(r3)     // Catch:{ all -> 0x00c5 }
            r4.c(r7, r3, r0)     // Catch:{ all -> 0x00c5 }
            r11 = 0
        L_0x048b:
            if (r11 == 0) goto L_0x03f0
            int r0 = r11.flags     // Catch:{ all -> 0x00c5 }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0499
            r3 = 1
            r6.putLong(r12, r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x049b
        L_0x0499:
            r3 = 1
        L_0x049b:
            int r0 = r11.flags     // Catch:{ all -> 0x00c5 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03f0
            r6.putLong(r5, r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x03f0
        L_0x04a6:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04af
            r3 = r21
            r6.putLong(r3, r8)     // Catch:{ all -> 0x00c5 }
        L_0x04af:
            com.google.android.gms.measurement.internal.J r0 = new com.google.android.gms.measurement.internal.J     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_f"
            com.google.android.gms.measurement.internal.F r3 = new com.google.android.gms.measurement.internal.F     // Catch:{ all -> 0x00c5 }
            r3.<init>(r6)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r0
            r17 = r3
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.g0(r0, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x0535
        L_0x04c7:
            r6 = r15
            r5 = 1
            if (r9 != r5) goto L_0x0535
            com.google.android.gms.measurement.internal.P5 r0 = new com.google.android.gms.measurement.internal.P5     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_fvt"
            java.lang.Long r19 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r15 = r0
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            r1.B(r0, r2)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.J2 r0 = r23.q()     // Catch:{ all -> 0x00c5 }
            r0.k()     // Catch:{ all -> 0x00c5 }
            r23.L0()     // Catch:{ all -> 0x00c5 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x00c5 }
            r0.putLong(r12, r7)     // Catch:{ all -> 0x00c5 }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x00c5 }
            boolean r4 = r2.f49610o     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x04ff
            r0.putLong(r3, r7)     // Catch:{ all -> 0x00c5 }
        L_0x04ff:
            com.google.android.gms.measurement.internal.J r3 = new com.google.android.gms.measurement.internal.J     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_v"
            com.google.android.gms.measurement.internal.F r4 = new com.google.android.gms.measurement.internal.F     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.g0(r3, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x0535
        L_0x0516:
            boolean r0 = r2.f49604i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0535
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.J r3 = new com.google.android.gms.measurement.internal.J     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_cd"
            com.google.android.gms.measurement.internal.F r4 = new com.google.android.gms.measurement.internal.F     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.g0(r3, r2)     // Catch:{ all -> 0x00c5 }
        L_0x0535:
            com.google.android.gms.measurement.internal.p r0 = r23.u0()     // Catch:{ all -> 0x00c5 }
            r0.q1()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.p r0 = r23.u0()
            r0.o1()
            return
        L_0x0544:
            com.google.android.gms.measurement.internal.p r2 = r23.u0()
            r2.o1()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7728y5.q0(com.google.android.gms.measurement.internal.E5):void");
    }

    public final C7611i r0() {
        return ((P2) C6620s.l(this.f50513l)).y();
    }

    /* access modifiers changed from: package-private */
    public final void s0(E5 e52) {
        if (this.f50526y != null) {
            ArrayList arrayList = new ArrayList();
            this.f50527z = arrayList;
            arrayList.addAll(this.f50526y);
        }
        C7660p u02 = u0();
        String str = (String) C6620s.l(e52.f49596a);
        C6620s.f(str);
        u02.k();
        u02.s();
        try {
            SQLiteDatabase z10 = u02.z();
            String[] strArr = {str};
            int delete = z10.delete("apps", "app_id=?", strArr) + z10.delete("events", "app_id=?", strArr) + z10.delete("events_snapshot", "app_id=?", strArr) + z10.delete("user_attributes", "app_id=?", strArr) + z10.delete("conditional_properties", "app_id=?", strArr) + z10.delete("raw_events", "app_id=?", strArr) + z10.delete("raw_events_metadata", "app_id=?", strArr) + z10.delete("queue", "app_id=?", strArr) + z10.delete("audience_filter_values", "app_id=?", strArr) + z10.delete("main_event_params", "app_id=?", strArr) + z10.delete("default_event_params", "app_id=?", strArr) + z10.delete("trigger_uris", "app_id=?", strArr) + z10.delete("upload_queue", "app_id=?", strArr);
            if (delete > 0) {
                u02.f().I().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            u02.f().E().c("Error resetting analytics data. appId, error", C7607h2.t(str), e10);
        }
        if (e52.f49603h) {
            q0(e52);
        }
    }

    /* access modifiers changed from: package-private */
    public final void t(C7597g gVar) {
        E5 k02 = k0((String) C6620s.l(gVar.f50134a));
        if (k02 != null) {
            u(gVar, k02);
        }
    }

    /* access modifiers changed from: package-private */
    public final void u(C7597g gVar, E5 e52) {
        C6620s.l(gVar);
        C6620s.f(gVar.f50134a);
        C6620s.l(gVar.f50136c);
        C6620s.f(gVar.f50136c.f49912b);
        q().k();
        L0();
        if (C0(e52)) {
            if (!e52.f49603h) {
                g(e52);
                return;
            }
            u0().l1();
            try {
                g(e52);
                String str = (String) C6620s.l(gVar.f50134a);
                C7597g P02 = u0().P0(str, gVar.f50136c.f49912b);
                if (P02 != null) {
                    f().D().c("Removing conditional user property", gVar.f50134a, this.f50513l.C().g(gVar.f50136c.f49912b));
                    u0().B(str, gVar.f50136c.f49912b);
                    if (P02.f50138e) {
                        u0().a1(str, gVar.f50136c.f49912b);
                    }
                    J j10 = gVar.f50144k;
                    if (j10 != null) {
                        F f10 = j10.f49673b;
                        m0((J) C6620s.l(I0().F(str, ((J) C6620s.l(gVar.f50144k)).f49672a, f10 != null ? f10.J() : null, P02.f50135b, gVar.f50144k.f49675d, true, true)), e52);
                    }
                } else {
                    f().J().c("Conditional user property doesn't exist", C7607h2.t(gVar.f50134a), this.f50513l.C().g(gVar.f50136c.f49912b));
                }
                u0().q1();
                u0().o1();
            } catch (Throwable th2) {
                u0().o1();
                throw th2;
            }
        }
    }

    public final C7660p u0() {
        return (C7660p) j(this.f50504c);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0030, code lost:
        r6 = r1.f50498G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(com.google.android.gms.measurement.internal.J r24, com.google.android.gms.measurement.internal.E5 r25) {
        /*
            r23 = this;
            r1 = r23
            r0 = r25
            java.lang.String r2 = "_s"
            java.lang.String r3 = "_sid"
            K9.C6620s.l(r25)
            java.lang.String r4 = r0.f49596a
            K9.C6620s.f(r4)
            com.google.android.gms.measurement.internal.J2 r4 = r23.q()
            r4.k()
            r23.L0()
            java.lang.String r4 = r0.f49596a
            r5 = r24
            long r12 = r5.f49675d
            com.google.android.gms.measurement.internal.k2 r5 = com.google.android.gms.measurement.internal.C7628k2.b(r24)
            com.google.android.gms.measurement.internal.J2 r6 = r23.q()
            r6.k()
            com.google.android.gms.measurement.internal.k4 r6 = r1.f50497F
            r7 = 0
            if (r6 == 0) goto L_0x003e
            java.lang.String r6 = r1.f50498G
            if (r6 == 0) goto L_0x003e
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x003b
            goto L_0x003e
        L_0x003b:
            com.google.android.gms.measurement.internal.k4 r6 = r1.f50497F
            goto L_0x003f
        L_0x003e:
            r6 = r7
        L_0x003f:
            android.os.Bundle r8 = r5.f50206d
            r14 = 0
            com.google.android.gms.measurement.internal.Q5.V(r6, r8, r14)
            com.google.android.gms.measurement.internal.J r5 = r5.a()
            r23.H0()
            boolean r6 = com.google.android.gms.measurement.internal.N5.b0(r5, r0)
            if (r6 != 0) goto L_0x0053
            return
        L_0x0053:
            boolean r6 = r0.f49603h
            if (r6 != 0) goto L_0x005b
            r1.g(r0)
            return
        L_0x005b:
            java.util.List<java.lang.String> r6 = r0.f49614s
            if (r6 == 0) goto L_0x00a3
            java.lang.String r8 = r5.f49672a
            boolean r6 = r6.contains(r8)
            if (r6 == 0) goto L_0x0091
            com.google.android.gms.measurement.internal.F r6 = r5.f49673b
            android.os.Bundle r6 = r6.J()
            java.lang.String r8 = "ga_safelisted"
            r9 = 1
            r6.putLong(r8, r9)
            com.google.android.gms.measurement.internal.J r8 = new com.google.android.gms.measurement.internal.J
            java.lang.String r9 = r5.f49672a
            com.google.android.gms.measurement.internal.F r10 = new com.google.android.gms.measurement.internal.F
            r10.<init>(r6)
            java.lang.String r6 = r5.f49674c
            r21 = r12
            long r11 = r5.f49675d
            r15 = r8
            r16 = r9
            r17 = r10
            r18 = r6
            r19 = r11
            r15.<init>(r16, r17, r18, r19)
            r12 = r8
            goto L_0x00a6
        L_0x0091:
            com.google.android.gms.measurement.internal.h2 r0 = r23.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.D()
            java.lang.String r2 = r5.f49672a
            java.lang.String r3 = r5.f49674c
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r0.d(r5, r4, r2, r3)
            return
        L_0x00a3:
            r21 = r12
            r12 = r5
        L_0x00a6:
            com.google.android.gms.measurement.internal.p r5 = r23.u0()
            r5.l1()
            boolean r5 = com.google.android.gms.internal.measurement.C7360m7.a()     // Catch:{ all -> 0x0117 }
            r8 = 0
            if (r5 == 0) goto L_0x0127
            com.google.android.gms.measurement.internal.i r5 = r23.r0()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.K.f49759f1     // Catch:{ all -> 0x0117 }
            boolean r5 = r5.r(r6)     // Catch:{ all -> 0x0117 }
            if (r5 == 0) goto L_0x0127
            java.lang.String r5 = r12.f49672a     // Catch:{ all -> 0x0117 }
            boolean r5 = r2.equals(r5)     // Catch:{ all -> 0x0117 }
            if (r5 == 0) goto L_0x0127
            com.google.android.gms.measurement.internal.p r5 = r23.u0()     // Catch:{ all -> 0x0117 }
            boolean r2 = r5.c1(r4, r2)     // Catch:{ all -> 0x0117 }
            if (r2 != 0) goto L_0x0127
            com.google.android.gms.measurement.internal.F r2 = r12.f49673b     // Catch:{ all -> 0x0117 }
            java.lang.Long r2 = r2.U(r3)     // Catch:{ all -> 0x0117 }
            long r5 = r2.longValue()     // Catch:{ all -> 0x0117 }
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0127
            com.google.android.gms.measurement.internal.p r2 = r23.u0()     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = "_f"
            boolean r2 = r2.c1(r4, r5)     // Catch:{ all -> 0x0117 }
            if (r2 != 0) goto L_0x011a
            com.google.android.gms.measurement.internal.p r2 = r23.u0()     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = "_v"
            boolean r2 = r2.c1(r4, r5)     // Catch:{ all -> 0x0117 }
            if (r2 == 0) goto L_0x00fa
            goto L_0x011a
        L_0x00fa:
            com.google.android.gms.measurement.internal.p r2 = r23.u0()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.common.util.e r5 = r23.zzb()     // Catch:{ all -> 0x0117 }
            long r5 = r5.a()     // Catch:{ all -> 0x0117 }
            r10 = 15000(0x3a98, double:7.411E-320)
            long r5 = r5 - r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0117 }
            java.lang.String r6 = r0.f49596a     // Catch:{ all -> 0x0117 }
            android.os.Bundle r6 = r1.d(r6, r12)     // Catch:{ all -> 0x0117 }
            r2.c0(r4, r5, r3, r6)     // Catch:{ all -> 0x0117 }
            goto L_0x0127
        L_0x0117:
            r0 = move-exception
            goto L_0x0374
        L_0x011a:
            com.google.android.gms.measurement.internal.p r2 = r23.u0()     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = r0.f49596a     // Catch:{ all -> 0x0117 }
            android.os.Bundle r5 = r1.d(r5, r12)     // Catch:{ all -> 0x0117 }
            r2.c0(r4, r7, r3, r5)     // Catch:{ all -> 0x0117 }
        L_0x0127:
            com.google.android.gms.measurement.internal.p r2 = r23.u0()     // Catch:{ all -> 0x0117 }
            K9.C6620s.f(r4)     // Catch:{ all -> 0x0117 }
            r2.k()     // Catch:{ all -> 0x0117 }
            r2.s()     // Catch:{ all -> 0x0117 }
            int r3 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0152
            com.google.android.gms.measurement.internal.h2 r2 = r2.f()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.J()     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = "Invalid time querying timed out conditional properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7607h2.t(r4)     // Catch:{ all -> 0x0117 }
            java.lang.Long r7 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0117 }
            r2.c(r5, r6, r7)     // Catch:{ all -> 0x0117 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0117 }
            goto L_0x0160
        L_0x0152:
            java.lang.String r5 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.lang.String r6 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x0117 }
            java.lang.String[] r6 = new java.lang.String[]{r4, r6}     // Catch:{ all -> 0x0117 }
            java.util.List r2 = r2.U(r5, r6)     // Catch:{ all -> 0x0117 }
        L_0x0160:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0117 }
        L_0x0164:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0117 }
            if (r5 == 0) goto L_0x01b6
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.g r5 = (com.google.android.gms.measurement.internal.C7597g) r5     // Catch:{ all -> 0x0117 }
            if (r5 == 0) goto L_0x0164
            com.google.android.gms.measurement.internal.h2 r6 = r23.f()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.i2 r6 = r6.I()     // Catch:{ all -> 0x0117 }
            java.lang.String r7 = "User property timed out"
            java.lang.String r8 = r5.f50134a     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P2 r9 = r1.f50513l     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.e2 r9 = r9.C()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P5 r10 = r5.f50136c     // Catch:{ all -> 0x0117 }
            java.lang.String r10 = r10.f49912b     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r9.g(r10)     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P5 r10 = r5.f50136c     // Catch:{ all -> 0x0117 }
            java.lang.Object r10 = r10.x()     // Catch:{ all -> 0x0117 }
            r6.d(r7, r8, r9, r10)     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.J r6 = r5.f50140g     // Catch:{ all -> 0x0117 }
            if (r6 == 0) goto L_0x01a6
            com.google.android.gms.measurement.internal.J r6 = new com.google.android.gms.measurement.internal.J     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.J r7 = r5.f50140g     // Catch:{ all -> 0x0117 }
            r9 = r21
            r6.<init>(r7, r9)     // Catch:{ all -> 0x0117 }
            r1.m0(r6, r0)     // Catch:{ all -> 0x0117 }
            goto L_0x01a8
        L_0x01a6:
            r9 = r21
        L_0x01a8:
            com.google.android.gms.measurement.internal.p r6 = r23.u0()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P5 r5 = r5.f50136c     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = r5.f49912b     // Catch:{ all -> 0x0117 }
            r6.B(r4, r5)     // Catch:{ all -> 0x0117 }
            r21 = r9
            goto L_0x0164
        L_0x01b6:
            r9 = r21
            com.google.android.gms.measurement.internal.p r2 = r23.u0()     // Catch:{ all -> 0x0117 }
            K9.C6620s.f(r4)     // Catch:{ all -> 0x0117 }
            r2.k()     // Catch:{ all -> 0x0117 }
            r2.s()     // Catch:{ all -> 0x0117 }
            if (r3 >= 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.h2 r2 = r2.f()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.i2 r2 = r2.J()     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = "Invalid time querying expired conditional properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7607h2.t(r4)     // Catch:{ all -> 0x0117 }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0117 }
            r2.c(r5, r6, r7)     // Catch:{ all -> 0x0117 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0117 }
            goto L_0x01ef
        L_0x01e1:
            java.lang.String r5 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String[] r6 = new java.lang.String[]{r4, r6}     // Catch:{ all -> 0x0117 }
            java.util.List r2 = r2.U(r5, r6)     // Catch:{ all -> 0x0117 }
        L_0x01ef:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0117 }
            int r6 = r2.size()     // Catch:{ all -> 0x0117 }
            r5.<init>(r6)     // Catch:{ all -> 0x0117 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0117 }
        L_0x01fc:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0117 }
            if (r6 == 0) goto L_0x024b
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.g r6 = (com.google.android.gms.measurement.internal.C7597g) r6     // Catch:{ all -> 0x0117 }
            if (r6 == 0) goto L_0x01fc
            com.google.android.gms.measurement.internal.h2 r7 = r23.f()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.i2 r7 = r7.I()     // Catch:{ all -> 0x0117 }
            java.lang.String r8 = "User property expired"
            java.lang.String r11 = r6.f50134a     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P2 r13 = r1.f50513l     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.e2 r13 = r13.C()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P5 r15 = r6.f50136c     // Catch:{ all -> 0x0117 }
            java.lang.String r15 = r15.f49912b     // Catch:{ all -> 0x0117 }
            java.lang.String r13 = r13.g(r15)     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P5 r15 = r6.f50136c     // Catch:{ all -> 0x0117 }
            java.lang.Object r15 = r15.x()     // Catch:{ all -> 0x0117 }
            r7.d(r8, r11, r13, r15)     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.p r7 = r23.u0()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P5 r8 = r6.f50136c     // Catch:{ all -> 0x0117 }
            java.lang.String r8 = r8.f49912b     // Catch:{ all -> 0x0117 }
            r7.a1(r4, r8)     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.J r7 = r6.f50144k     // Catch:{ all -> 0x0117 }
            if (r7 == 0) goto L_0x023f
            r5.add(r7)     // Catch:{ all -> 0x0117 }
        L_0x023f:
            com.google.android.gms.measurement.internal.p r7 = r23.u0()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P5 r6 = r6.f50136c     // Catch:{ all -> 0x0117 }
            java.lang.String r6 = r6.f49912b     // Catch:{ all -> 0x0117 }
            r7.B(r4, r6)     // Catch:{ all -> 0x0117 }
            goto L_0x01fc
        L_0x024b:
            int r2 = r5.size()     // Catch:{ all -> 0x0117 }
            r6 = r14
        L_0x0250:
            if (r6 >= r2) goto L_0x0263
            java.lang.Object r7 = r5.get(r6)     // Catch:{ all -> 0x0117 }
            int r6 = r6 + 1
            com.google.android.gms.measurement.internal.J r7 = (com.google.android.gms.measurement.internal.J) r7     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.J r8 = new com.google.android.gms.measurement.internal.J     // Catch:{ all -> 0x0117 }
            r8.<init>(r7, r9)     // Catch:{ all -> 0x0117 }
            r1.m0(r8, r0)     // Catch:{ all -> 0x0117 }
            goto L_0x0250
        L_0x0263:
            com.google.android.gms.measurement.internal.p r2 = r23.u0()     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = r12.f49672a     // Catch:{ all -> 0x0117 }
            K9.C6620s.f(r4)     // Catch:{ all -> 0x0117 }
            K9.C6620s.f(r5)     // Catch:{ all -> 0x0117 }
            r2.k()     // Catch:{ all -> 0x0117 }
            r2.s()     // Catch:{ all -> 0x0117 }
            if (r3 >= 0) goto L_0x0299
            com.google.android.gms.measurement.internal.h2 r3 = r2.f()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.i2 r3 = r3.J()     // Catch:{ all -> 0x0117 }
            java.lang.String r6 = "Invalid time querying triggered conditional properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C7607h2.t(r4)     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.e2 r2 = r2.d()     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = r2.c(r5)     // Catch:{ all -> 0x0117 }
            java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0117 }
            r3.d(r6, r4, r2, r5)     // Catch:{ all -> 0x0117 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0117 }
            goto L_0x02a7
        L_0x0299:
            java.lang.String r3 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch:{ all -> 0x0117 }
            java.util.List r2 = r2.U(r3, r4)     // Catch:{ all -> 0x0117 }
        L_0x02a7:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0117 }
            int r4 = r2.size()     // Catch:{ all -> 0x0117 }
            r3.<init>(r4)     // Catch:{ all -> 0x0117 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0117 }
        L_0x02b4:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0117 }
            if (r4 == 0) goto L_0x0345
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.g r4 = (com.google.android.gms.measurement.internal.C7597g) r4     // Catch:{ all -> 0x0117 }
            if (r4 == 0) goto L_0x02b4
            com.google.android.gms.measurement.internal.P5 r5 = r4.f50136c     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.R5 r13 = new com.google.android.gms.measurement.internal.R5     // Catch:{ all -> 0x0117 }
            java.lang.String r6 = r4.f50134a     // Catch:{ all -> 0x0117 }
            java.lang.Object r6 = K9.C6620s.l(r6)     // Catch:{ all -> 0x0117 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0117 }
            java.lang.String r7 = r4.f50135b     // Catch:{ all -> 0x0117 }
            java.lang.String r8 = r5.f49912b     // Catch:{ all -> 0x0117 }
            java.lang.Object r5 = r5.x()     // Catch:{ all -> 0x0117 }
            java.lang.Object r11 = K9.C6620s.l(r5)     // Catch:{ all -> 0x0117 }
            r5 = r13
            r21 = r9
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.p r5 = r23.u0()     // Catch:{ all -> 0x0117 }
            boolean r5 = r5.k0(r13)     // Catch:{ all -> 0x0117 }
            if (r5 == 0) goto L_0x0308
            com.google.android.gms.measurement.internal.h2 r5 = r23.f()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.i2 r5 = r5.I()     // Catch:{ all -> 0x0117 }
            java.lang.String r6 = "User property triggered"
            java.lang.String r7 = r4.f50134a     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P2 r8 = r1.f50513l     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.e2 r8 = r8.C()     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r13.f49944c     // Catch:{ all -> 0x0117 }
            java.lang.String r8 = r8.g(r9)     // Catch:{ all -> 0x0117 }
            java.lang.Object r9 = r13.f49946e     // Catch:{ all -> 0x0117 }
            r5.d(r6, r7, r8, r9)     // Catch:{ all -> 0x0117 }
            goto L_0x0329
        L_0x0308:
            com.google.android.gms.measurement.internal.h2 r5 = r23.f()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.i2 r5 = r5.E()     // Catch:{ all -> 0x0117 }
            java.lang.String r6 = "Too many active user properties, ignoring"
            java.lang.String r7 = r4.f50134a     // Catch:{ all -> 0x0117 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C7607h2.t(r7)     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.P2 r8 = r1.f50513l     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.e2 r8 = r8.C()     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r13.f49944c     // Catch:{ all -> 0x0117 }
            java.lang.String r8 = r8.g(r9)     // Catch:{ all -> 0x0117 }
            java.lang.Object r9 = r13.f49946e     // Catch:{ all -> 0x0117 }
            r5.d(r6, r7, r8, r9)     // Catch:{ all -> 0x0117 }
        L_0x0329:
            com.google.android.gms.measurement.internal.J r5 = r4.f50142i     // Catch:{ all -> 0x0117 }
            if (r5 == 0) goto L_0x0330
            r3.add(r5)     // Catch:{ all -> 0x0117 }
        L_0x0330:
            com.google.android.gms.measurement.internal.P5 r5 = new com.google.android.gms.measurement.internal.P5     // Catch:{ all -> 0x0117 }
            r5.<init>(r13)     // Catch:{ all -> 0x0117 }
            r4.f50136c = r5     // Catch:{ all -> 0x0117 }
            r5 = 1
            r4.f50138e = r5     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.p r5 = r23.u0()     // Catch:{ all -> 0x0117 }
            r5.i0(r4)     // Catch:{ all -> 0x0117 }
            r9 = r21
            goto L_0x02b4
        L_0x0345:
            r21 = r9
            r1.m0(r12, r0)     // Catch:{ all -> 0x0117 }
            int r2 = r3.size()     // Catch:{ all -> 0x0117 }
        L_0x034e:
            if (r14 >= r2) goto L_0x0365
            java.lang.Object r4 = r3.get(r14)     // Catch:{ all -> 0x0117 }
            int r14 = r14 + 1
            com.google.android.gms.measurement.internal.J r4 = (com.google.android.gms.measurement.internal.J) r4     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.J r5 = new com.google.android.gms.measurement.internal.J     // Catch:{ all -> 0x0117 }
            r6 = r21
            r5.<init>(r4, r6)     // Catch:{ all -> 0x0117 }
            r1.m0(r5, r0)     // Catch:{ all -> 0x0117 }
            r21 = r6
            goto L_0x034e
        L_0x0365:
            com.google.android.gms.measurement.internal.p r0 = r23.u0()     // Catch:{ all -> 0x0117 }
            r0.q1()     // Catch:{ all -> 0x0117 }
            com.google.android.gms.measurement.internal.p r0 = r23.u0()
            r0.o1()
            return
        L_0x0374:
            com.google.android.gms.measurement.internal.p r2 = r23.u0()
            r2.o1()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7728y5.v(com.google.android.gms.measurement.internal.J, com.google.android.gms.measurement.internal.E5):void");
    }

    /* access modifiers changed from: package-private */
    public final void v0(E5 e52) {
        E5 e53 = e52;
        q().k();
        L0();
        C6620s.f(e53.f49596a);
        C c10 = C.c(e53.f49589A);
        f().I().c("Setting DMA consent for package", e53.f49596a, c10);
        String str = e53.f49596a;
        q().k();
        L0();
        E g10 = C.b(c(str), 100).g();
        this.f50494C.put(str, c10);
        u0().Z(str, c10);
        E g11 = C.b(c(str), 100).g();
        q().k();
        L0();
        E e10 = E.DENIED;
        boolean z10 = false;
        boolean z11 = g10 == e10 && g11 == E.GRANTED;
        if (g10 == E.GRANTED && g11 == e10) {
            z10 = true;
        }
        if (z11 || z10) {
            f().I().b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (u0().J(Q0(), str, false, false, false, false, false, false, false).f50292f < ((long) r0().w(str, K.f49763h0))) {
                bundle.putLong("_r", 1);
                f().I().c("_dcu realtime event count", str, Long.valueOf(u0().J(Q0(), str, false, false, false, false, false, true, false).f50292f));
            }
            this.f50501J.a(str, "_dcu", bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public final void w(J j10, String str) {
        J j11 = j10;
        String str2 = str;
        C7676r2 S02 = u0().S0(str2);
        if (S02 == null || TextUtils.isEmpty(S02.o())) {
            f().D().b("No app data available; dropping event", str2);
            return;
        }
        Boolean l10 = l(S02);
        if (l10 == null) {
            if (!"_ui".equals(j11.f49672a)) {
                f().J().b("Could not find package. appId", C7607h2.t(str));
            }
        } else if (!l10.booleanValue()) {
            f().E().b("App version does not match; dropping event. appId", C7607h2.t(str));
            return;
        }
        E5 e52 = r2;
        E5 e53 = new E5(str, S02.q(), S02.o(), S02.V(), S02.n(), S02.A0(), S02.u0(), (String) null, S02.A(), false, S02.p(), 0, 0, S02.z(), false, S02.j(), S02.L0(), S02.w0(), S02.w(), (String) null, b0(str2).v(), "", (String) null, S02.C(), S02.K0(), b0(str2).b(), p0(str2).j(), S02.a(), S02.Y(), S02.v(), S02.t(), 0, S02.F());
        g0(j11, e52);
    }

    /* access modifiers changed from: package-private */
    public final void x(C7676r2 r2Var, A2.a aVar) {
        F2 f22;
        q().k();
        L0();
        C7646n b10 = C7646n.b(aVar.w1());
        String l10 = r2Var.l();
        q().k();
        L0();
        C7671q3 b02 = b0(l10);
        int[] iArr = J5.f49689a;
        int i10 = iArr[b02.r().ordinal()];
        if (i10 == 1) {
            b10.d(C7671q3.a.AD_STORAGE, C7639m.REMOTE_ENFORCED_DEFAULT);
        } else if (i10 == 2 || i10 == 3) {
            b10.c(C7671q3.a.AD_STORAGE, b02.b());
        } else {
            b10.d(C7671q3.a.AD_STORAGE, C7639m.FAILSAFE);
        }
        int i11 = iArr[b02.t().ordinal()];
        if (i11 == 1) {
            b10.d(C7671q3.a.ANALYTICS_STORAGE, C7639m.REMOTE_ENFORCED_DEFAULT);
        } else if (i11 == 2 || i11 == 3) {
            b10.c(C7671q3.a.ANALYTICS_STORAGE, b02.b());
        } else {
            b10.d(C7671q3.a.ANALYTICS_STORAGE, C7639m.FAILSAFE);
        }
        String l11 = r2Var.l();
        q().k();
        L0();
        C e10 = e(l11, p0(l11), b0(l11), b10);
        aVar.e0(((Boolean) C6620s.l(e10.h())).booleanValue());
        if (!TextUtils.isEmpty(e10.i())) {
            aVar.J0(e10.i());
        }
        q().k();
        L0();
        Iterator<F2> it = aVar.V().iterator();
        while (true) {
            if (!it.hasNext()) {
                f22 = null;
                break;
            }
            f22 = it.next();
            if ("_npa".equals(f22.X())) {
                break;
            }
        }
        if (f22 != null) {
            C7671q3.a aVar2 = C7671q3.a.AD_PERSONALIZATION;
            if (b10.a(aVar2) == C7639m.UNSET) {
                R5 U02 = u0().U0(r2Var.l(), "_npa");
                if (U02 == null) {
                    Boolean L02 = r2Var.L0();
                    if (L02 == null || ((L02 == Boolean.TRUE && f22.S() != 1) || (L02 == Boolean.FALSE && f22.S() != 0))) {
                        b10.d(aVar2, C7639m.API);
                    } else {
                        b10.d(aVar2, C7639m.MANIFEST);
                    }
                } else if ("tcf".equals(U02.f49943b)) {
                    b10.d(aVar2, C7639m.TCF);
                } else if ("app".equals(U02.f49943b)) {
                    b10.d(aVar2, C7639m.API);
                } else {
                    b10.d(aVar2, C7639m.MANIFEST);
                }
            }
        } else {
            int a10 = a(r2Var.l(), b10);
            aVar.O((F2) ((L4) F2.V().D("_npa").G(zzb().a()).C((long) a10).s()));
            f().I().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(a10));
        }
        aVar.A0(b10.toString());
        boolean X10 = this.f50502a.X(r2Var.l());
        List<C7427v2> T10 = aVar.T();
        int i12 = 0;
        for (int i13 = 0; i13 < T10.size(); i13++) {
            if ("_tcf".equals(T10.get(i13).X())) {
                C7427v2.a aVar3 = (C7427v2.a) T10.get(i13).A();
                List<C7443x2> R10 = aVar3.R();
                while (true) {
                    if (i12 >= R10.size()) {
                        break;
                    } else if ("_tcfd".equals(R10.get(i12).Z())) {
                        aVar3.C(i12, C7443x2.X().G("_tcfd").I(C7631k5.d(R10.get(i12).a0(), X10)));
                        break;
                    } else {
                        i12++;
                    }
                }
                aVar.C(i13, aVar3);
                return;
            }
        }
    }

    public final C7586e2 x0() {
        return this.f50513l.C();
    }

    /* access modifiers changed from: package-private */
    public final void y0(E5 e52) {
        q().k();
        L0();
        C6620s.f(e52.f49596a);
        C7671q3 e10 = C7671q3.e(e52.f49616u, e52.f49621z);
        b0(e52.f49596a);
        f().I().c("Setting storage consent for package", e52.f49596a, e10);
        J(e52.f49596a, e10);
    }

    public final C7649n2 z0() {
        return (C7649n2) j(this.f50503b);
    }

    public final Context zza() {
        return this.f50513l.zza();
    }

    public final e zzb() {
        return ((P2) C6620s.l(this.f50513l)).zzb();
    }

    public final C7590f zzd() {
        return this.f50513l.zzd();
    }

    /* renamed from: com.google.android.gms.measurement.internal.y5$c */
    private class c {

        /* renamed from: a  reason: collision with root package name */
        final String f50536a;

        /* renamed from: b  reason: collision with root package name */
        long f50537b;

        private c(C7728y5 y5Var) {
            this(y5Var, y5Var.I0().P0());
        }

        private c(C7728y5 y5Var, String str) {
            this.f50536a = str;
            this.f50537b = y5Var.zzb().c();
        }
    }

    private C7728y5(K5 k52, P2 p22) {
        this.f50514m = false;
        this.f50518q = new LinkedList();
        this.f50496E = new HashMap();
        this.f50501J = new I5(this);
        C6620s.l(k52);
        this.f50513l = P2.a(k52.f49808a, (C7282e1) null, (Long) null);
        this.f50492A = -1;
        this.f50511j = new C7714w5(this);
        N5 n52 = new N5(this);
        n52.t();
        this.f50508g = n52;
        C7649n2 n2Var = new C7649n2(this);
        n2Var.t();
        this.f50503b = n2Var;
        C2 c22 = new C2(this);
        c22.t();
        this.f50502a = c22;
        this.f50493B = new HashMap();
        this.f50494C = new HashMap();
        this.f50495D = new HashMap();
        q().B(new A5(this, k52));
    }
}
