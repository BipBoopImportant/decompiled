package com.google.firebase.remoteconfig;

import Fb.f;
import H9.C6529c;
import Ic.p;
import Jb.b;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.t;
import com.google.firebase.remoteconfig.internal.u;
import com.google.firebase.remoteconfig.internal.x;
import d0.i;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import mc.C10036b;
import xa.C8974o;

public class c implements Kc.a {

    /* renamed from: j  reason: collision with root package name */
    private static final e f68694j = h.d();

    /* renamed from: k  reason: collision with root package name */
    private static final Random f68695k = new Random();

    /* renamed from: l  reason: collision with root package name */
    private static final Map<String, a> f68696l = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f68697a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f68698b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f68699c;

    /* renamed from: d  reason: collision with root package name */
    private final f f68700d;

    /* renamed from: e  reason: collision with root package name */
    private final nc.e f68701e;

    /* renamed from: f  reason: collision with root package name */
    private final Gb.c f68702f;

    /* renamed from: g  reason: collision with root package name */
    private final C10036b<Ib.a> f68703g;

    /* renamed from: h  reason: collision with root package name */
    private final String f68704h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, String> f68705i;

    private static class a implements C6529c.a {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicReference<a> f68706a = new AtomicReference<>();

        private a() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f68706a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (i.a(atomicReference, (Object) null, aVar)) {
                    C6529c.c(application);
                    C6529c.b().a(aVar);
                }
            }
        }

        public void a(boolean z10) {
            c.r(z10);
        }
    }

    c(Context context, @b ScheduledExecutorService scheduledExecutorService, f fVar, nc.e eVar, Gb.c cVar, C10036b<Ib.a> bVar) {
        this(context, scheduledExecutorService, fVar, eVar, cVar, bVar, true);
    }

    private com.google.firebase.remoteconfig.internal.f f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.f.h(this.f68699c, u.c(this.f68698b, String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f68704h, str, str2})));
    }

    private o j(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new o(this.f68699c, fVar, fVar2);
    }

    private static x k(f fVar, String str, C10036b<Ib.a> bVar) {
        if (!p(fVar) || !str.equals("firebase")) {
            return null;
        }
        return new x(bVar);
    }

    private Jc.e m(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new Jc.e(fVar, Jc.a.a(fVar, fVar2), this.f68699c);
    }

    static t n(Context context, String str, String str2) {
        return new t(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    private static boolean o(f fVar, String str) {
        return str.equals("firebase") && p(fVar);
    }

    private static boolean p(f fVar) {
        return fVar.m().equals("[DEFAULT]");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Ib.a q() {
        return null;
    }

    /* access modifiers changed from: private */
    public static synchronized void r(boolean z10) {
        synchronized (c.class) {
            for (a p10 : f68696l.values()) {
                p10.p(z10);
            }
        }
    }

    public void a(String str, Lc.f fVar) {
        e(str).j().h(fVar);
    }

    /* access modifiers changed from: package-private */
    public synchronized a d(f fVar, String str, nc.e eVar, Gb.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, Jc.e eVar2) {
        a aVar;
        String str2 = str;
        synchronized (this) {
            try {
                if (!this.f68697a.containsKey(str2)) {
                    Context context = this.f68698b;
                    Gb.c cVar2 = o(fVar, str) ? cVar : null;
                    a aVar2 = r10;
                    a aVar3 = new a(context, fVar, eVar, cVar2, executor, fVar2, fVar3, fVar4, mVar, oVar, tVar, l(fVar, eVar, mVar, fVar3, this.f68698b, str, tVar), eVar2);
                    aVar2.q();
                    this.f68697a.put(str2, aVar2);
                    f68696l.put(str2, aVar2);
                }
                aVar = this.f68697a.get(str2);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return aVar;
    }

    public synchronized a e(String str) {
        com.google.firebase.remoteconfig.internal.f f10;
        com.google.firebase.remoteconfig.internal.f f11;
        com.google.firebase.remoteconfig.internal.f f12;
        t n10;
        o j10;
        String str2;
        try {
            f10 = f(str, "fetch");
            f11 = f(str, "activate");
            f12 = f(str, "defaults");
            n10 = n(this.f68698b, this.f68704h, str);
            j10 = j(f11, f12);
            x k10 = k(this.f68700d, str, this.f68703g);
            if (k10 != null) {
                j10.b(new Ic.o(k10));
            }
            str2 = str;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return d(this.f68700d, str2, this.f68701e, this.f68702f, this.f68699c, f10, f11, f12, h(str, f10, n10), j10, n10, m(f11, f12));
    }

    /* access modifiers changed from: package-private */
    public a g() {
        return e("firebase");
    }

    /* access modifiers changed from: package-private */
    public synchronized m h(String str, com.google.firebase.remoteconfig.internal.f fVar, t tVar) {
        nc.e eVar;
        C10036b<Ib.a> bVar;
        try {
            eVar = this.f68701e;
            if (p(this.f68700d)) {
                bVar = this.f68703g;
            } else {
                new p
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: CONSTRUCTOR  (r0v2 ? I:Ic.p) =  call: Ic.p.<init>():void type: CONSTRUCTOR in method: com.google.firebase.remoteconfig.c.h(java.lang.String, com.google.firebase.remoteconfig.internal.f, com.google.firebase.remoteconfig.internal.t):com.google.firebase.remoteconfig.internal.m, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v2 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 43 more
                    */
                /*
                    this = this;
                    monitor-enter(r11)
                    com.google.firebase.remoteconfig.internal.m r10 = new com.google.firebase.remoteconfig.internal.m     // Catch:{ all -> 0x0011 }
                    nc.e r1 = r11.f68701e     // Catch:{ all -> 0x0011 }
                    Fb.f r0 = r11.f68700d     // Catch:{ all -> 0x0011 }
                    boolean r0 = p(r0)     // Catch:{ all -> 0x0011 }
                    if (r0 == 0) goto L_0x0013
                    mc.b<Ib.a> r0 = r11.f68703g     // Catch:{ all -> 0x0011 }
                L_0x000f:
                    r2 = r0
                    goto L_0x0019
                L_0x0011:
                    r12 = move-exception
                    goto L_0x0037
                L_0x0013:
                    Ic.p r0 = new Ic.p     // Catch:{ all -> 0x0011 }
                    r0.<init>()     // Catch:{ all -> 0x0011 }
                    goto L_0x000f
                L_0x0019:
                    java.util.concurrent.ScheduledExecutorService r3 = r11.f68699c     // Catch:{ all -> 0x0011 }
                    com.google.android.gms.common.util.e r4 = f68694j     // Catch:{ all -> 0x0011 }
                    java.util.Random r5 = f68695k     // Catch:{ all -> 0x0011 }
                    Fb.f r0 = r11.f68700d     // Catch:{ all -> 0x0011 }
                    Fb.n r0 = r0.n()     // Catch:{ all -> 0x0011 }
                    java.lang.String r0 = r0.b()     // Catch:{ all -> 0x0011 }
                    com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r7 = r11.i(r0, r12, r14)     // Catch:{ all -> 0x0011 }
                    java.util.Map<java.lang.String, java.lang.String> r9 = r11.f68705i     // Catch:{ all -> 0x0011 }
                    r0 = r10
                    r6 = r13
                    r8 = r14
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0011 }
                    monitor-exit(r11)
                    return r10
                L_0x0037:
                    monitor-exit(r11)     // Catch:{ all -> 0x0011 }
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.c.h(java.lang.String, com.google.firebase.remoteconfig.internal.f, com.google.firebase.remoteconfig.internal.t):com.google.firebase.remoteconfig.internal.m");
            }

            /* access modifiers changed from: package-private */
            public ConfigFetchHttpClient i(String str, String str2, t tVar) {
                return new ConfigFetchHttpClient(this.f68698b, this.f68700d.n().c(), str, str2, tVar.c(), tVar.c());
            }

            /* access modifiers changed from: package-private */
            public synchronized com.google.firebase.remoteconfig.internal.p l(f fVar, nc.e eVar, m mVar, com.google.firebase.remoteconfig.internal.f fVar2, Context context, String str, t tVar) {
                com.google.firebase.remoteconfig.internal.p pVar;
                synchronized (this) {
                    pVar = new com.google.firebase.remoteconfig.internal.p(fVar, eVar, mVar, fVar2, context, str, tVar, this.f68699c);
                }
                return pVar;
            }

            protected c(Context context, ScheduledExecutorService scheduledExecutorService, f fVar, nc.e eVar, Gb.c cVar, C10036b<Ib.a> bVar, boolean z10) {
                this.f68697a = new HashMap();
                this.f68705i = new HashMap();
                this.f68698b = context;
                this.f68699c = scheduledExecutorService;
                this.f68700d = fVar;
                this.f68701e = eVar;
                this.f68702f = cVar;
                this.f68703g = bVar;
                this.f68704h = fVar.n().c();
                a.c(context);
                if (z10) {
                    C8974o.c(scheduledExecutorService, new b(this));
                }
            }
        }
