package yd;

import HJ.C15838d;
import HJ.C15854t;
import QJ.Q;
import WK.C16771f;
import XH.C16807N;
import XH.y;
import YH.C16870n;
import android.content.Context;
import android.util.Log;
import com.ikea.kompassmap.model.store.MapMetadata;
import com.ikea.kompassmap.model.store.Store;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import dI.C17164e;
import eI.C17187b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH@¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0006H@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lyd/n;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "storeNo", "ruCode", "languageCode", "Lkotlin/Function1;", "Lyd/K;", "LXH/N;", "onLoad", "d", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LnI/l;LdI/e;)Ljava/lang/Object;", "", "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "Lcom/ikea/kompassmap/model/store/Store;", "store", "h", "(Landroid/content/Context;Lcom/ikea/kompassmap/model/store/Store;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "g", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: yd.n  reason: case insensitive filesystem */
public final class C10460n {

    /* renamed from: a  reason: collision with root package name */
    public static final C10460n f77928a = new C10460n();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @f(c = "com.ikea.kompassmap.KompassCache", f = "Cache.kt", l = {36}, m = "preloadMap")
    /* renamed from: yd.n$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f77929c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10460n f77930d;

        /* renamed from: e  reason: collision with root package name */
        int f77931e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C10460n nVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f77930d = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f77929c = obj;
            this.f77931e |= Integer.MIN_VALUE;
            return this.f77930d.d((Context) null, (String) null, (String) null, (String) null, (C17642l<? super C10440K, C16807N>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @f(c = "com.ikea.kompassmap.KompassCache", f = "Cache.kt", l = {116}, m = "readCacheData")
    /* renamed from: yd.n$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f77932c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10460n f77933d;

        /* renamed from: e  reason: collision with root package name */
        int f77934e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C10460n nVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f77933d = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f77932c = obj;
            this.f77934e |= Integer.MIN_VALUE;
            return this.f77933d.g((Context) null, (String) null, (String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/ikea/kompassmap/model/store/Store;", "<anonymous>", "(LQJ/Q;)Lcom/ikea/kompassmap/model/store/Store;"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.KompassCache$readCacheData$2", f = "Cache.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yd.n$c */
    static final class c extends l implements p<Q, C17164e<? super Store>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f77935c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f77936d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f77937e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f77938f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, String str, String str2, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f77936d = context;
            this.f77937e = str;
            this.f77938f = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f77936d, this.f77937e, this.f77938f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Store> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            File file;
            C17187b.f();
            if (this.f77935c == 0) {
                y.b(obj);
                File file2 = new File(this.f77936d.getCacheDir(), "kompassMap");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                File file3 = new File(file2 + '/' + this.f77937e + '_' + this.f77938f);
                if (!file3.exists()) {
                    file3.mkdirs();
                }
                File[] listFiles = file3.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    file = null;
                } else {
                    file = listFiles[0];
                    int n02 = C16870n.n0(listFiles);
                    if (n02 != 0) {
                        String name = file.getName();
                        C17542s.i(name, "getName(...)");
                        Long v10 = C15854t.v(name);
                        long longValue = v10 != null ? v10.longValue() : 0;
                        int i10 = 1;
                        if (1 <= n02) {
                            while (true) {
                                File file4 = listFiles[i10];
                                String name2 = file4.getName();
                                C17542s.i(name2, "getName(...)");
                                Long v11 = C15854t.v(name2);
                                long longValue2 = v11 != null ? v11.longValue() : 0;
                                if (longValue < longValue2) {
                                    file = file4;
                                    longValue = longValue2;
                                }
                                if (i10 == n02) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
                if (file != null && file.exists()) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), C15838d.f135279b), 8192);
                        Store store = (Store) zd.f.f78115a.c().l(bufferedReader, Store.class);
                        bufferedReader.close();
                        return store;
                    } catch (IOException e10) {
                        Log.e("readCacheData", "Error reading cache data: " + e10.getMessage(), e10);
                    } catch (com.google.gson.l e11) {
                        Log.e("readCacheData", "Error parsing cache data: " + e11.getMessage(), e11);
                    } catch (Exception e12) {
                        Log.e("readCacheData", "Unexpected error: " + e12.getMessage(), e12);
                    }
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @f(c = "com.ikea.kompassmap.KompassCache", f = "Cache.kt", l = {79}, m = "writeCacheData")
    /* renamed from: yd.n$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f77939c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10460n f77940d;

        /* renamed from: e  reason: collision with root package name */
        int f77941e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C10460n nVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f77940d = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f77939c = obj;
            this.f77941e |= Integer.MIN_VALUE;
            return this.f77940d.h((Context) null, (Store) null, (String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.KompassCache$writeCacheData$2", f = "Cache.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yd.n$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f77942c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f77943d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Store f77944e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f77945f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context, Store store, String str, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f77943d = context;
            this.f77944e = store;
            this.f77945f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f77943d, this.f77944e, this.f77945f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f77942c == 0) {
                y.b(obj);
                File file = new File(this.f77943d.getCacheDir(), "kompassMap");
                file.mkdirs();
                String str = this.f77944e.getData().getStoreNo() + '_' + this.f77945f;
                MapMetadata mapMetadata = this.f77944e.getData().getMapMetadata();
                String valueOf = String.valueOf(mapMetadata != null ? mapMetadata.getChangesLastSaved() : 0);
                File file2 = new File(file + '/' + str);
                if (file2.exists() && !file2.isDirectory()) {
                    file2.delete();
                }
                file2.mkdirs();
                File file3 = new File(file2 + '/' + valueOf);
                if (!file3.exists()) {
                    file3.createNewFile();
                }
                C16771f c10 = WK.y.c(z.g(file3, false, 1, (Object) null));
                String w10 = zd.f.f78115a.c().w(this.f77944e);
                C17542s.i(w10, "toJson(...)");
                c10.D0(w10);
                c10.close();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private C10460n() {
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, Store store) {
        C17542s.j(store, "it");
        lVar.invoke(C10440K.API);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Exception exc) {
        C17542s.j(exc, UiComponentContainer.RESULT_ERROR);
        Log.e("KompassMap getStore", exc.toString());
        return C16807N.f139792a;
    }

    public final boolean c(Context context, String str, String str2) {
        boolean z10;
        C17542s.j(context, "context");
        C17542s.j(str, "storeNo");
        C17542s.j(str2, "languageCode");
        try {
            File file = new File(context.getCacheDir(), "kompassMap");
            file.mkdirs();
            File file2 = new File(file + '/' + str + '_' + str2);
            String[] list = file2.list();
            if (list != null) {
                if (list.length != 0) {
                    z10 = false;
                    return file2.exists() && !z10;
                }
            }
            z10 = true;
            if (file2.exists()) {
                return false;
            }
        } catch (Exception e10) {
            Log.e("isCacheAvailable", "Error checking cache: " + e10.getClass().getSimpleName() + ", Message: " + e10.getMessage(), e10);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(android.content.Context r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, nI.C17642l<? super yd.C10440K, XH.C16807N> r23, dI.C17164e<? super XH.C16807N> r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r23
            r2 = r24
            java.lang.String r3 = ""
            boolean r4 = r2 instanceof yd.C10460n.a
            if (r4 == 0) goto L_0x001b
            r4 = r2
            yd.n$a r4 = (yd.C10460n.a) r4
            int r5 = r4.f77931e
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f77931e = r5
            goto L_0x0020
        L_0x001b:
            yd.n$a r4 = new yd.n$a
            r4.<init>(r1, r2)
        L_0x0020:
            java.lang.Object r2 = r4.f77929c
            java.lang.Object r15 = eI.C17187b.f()
            int r5 = r4.f77931e
            r6 = 1
            if (r5 == 0) goto L_0x003d
            if (r5 != r6) goto L_0x0035
            XH.y.b(r2)     // Catch:{ Exception -> 0x0032 }
            goto L_0x00d5
        L_0x0032:
            r0 = move-exception
            goto L_0x00bf
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003d:
            XH.y.b(r2)
            yd.b r2 = yd.C10449c.a(r19)
            r14 = r19
            r8 = r20
            r10 = r22
            boolean r5 = r1.c(r14, r8, r10)     // Catch:{ Exception -> 0x0032 }
            if (r5 == 0) goto L_0x0057
            yd.K r2 = yd.C10440K.CACHE     // Catch:{ Exception -> 0x0032 }
            r0.invoke(r2)     // Catch:{ Exception -> 0x0032 }
            goto L_0x00d5
        L_0x0057:
            Jd.a r5 = new Jd.a     // Catch:{ Exception -> 0x0032 }
            Bd.b r7 = new Bd.b     // Catch:{ Exception -> 0x0032 }
            zd.f r9 = zd.f.f78115a     // Catch:{ Exception -> 0x0032 }
            zd.b r9 = r9.d()     // Catch:{ Exception -> 0x0032 }
            r7.<init>(r9)     // Catch:{ Exception -> 0x0032 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r7 = "IKEA Shoppable App"
            java.lang.String r9 = "ingka-digital"
            if (r2 == 0) goto L_0x0073
            java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x0032 }
        L_0x0071:
            r11 = r2
            goto L_0x0075
        L_0x0073:
            r2 = 0
            goto L_0x0071
        L_0x0075:
            java.lang.String r12 = "IkeaApp"
            yd.h r2 = yd.C10454h.MAP     // Catch:{ Exception -> 0x0032 }
            java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x0032 }
            XH.v r2 = XH.C16796C.a(r2, r3)     // Catch:{ Exception -> 0x0032 }
            yd.h r13 = yd.C10454h.FREQUENTLY_ASKED_POINTS_OF_INTEREST     // Catch:{ Exception -> 0x0032 }
            java.lang.String r13 = r13.b()     // Catch:{ Exception -> 0x0032 }
            XH.v r13 = XH.C16796C.a(r13, r3)     // Catch:{ Exception -> 0x0032 }
            yd.h r16 = yd.C10454h.MAP_METADATA     // Catch:{ Exception -> 0x0032 }
            java.lang.String r6 = r16.b()     // Catch:{ Exception -> 0x0032 }
            XH.v r3 = XH.C16796C.a(r6, r3)     // Catch:{ Exception -> 0x0032 }
            XH.v[] r2 = new XH.v[]{r2, r13, r3}     // Catch:{ Exception -> 0x0032 }
            java.util.Map r13 = YH.X.m(r2)     // Catch:{ Exception -> 0x0032 }
            yd.l r2 = new yd.l     // Catch:{ Exception -> 0x0032 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            yd.m r16 = new yd.m     // Catch:{ Exception -> 0x0032 }
            r16.<init>()     // Catch:{ Exception -> 0x0032 }
            r0 = 1
            r4.f77931e = r0     // Catch:{ Exception -> 0x0032 }
            r6 = r7
            r7 = r9
            r8 = r20
            r9 = r21
            r10 = r22
            r14 = r19
            r0 = r15
            r15 = r2
            r17 = r4
            java.lang.Object r2 = r5.C(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0032 }
            if (r2 != r0) goto L_0x00d5
            return r0
        L_0x00bf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error preloading map: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "preloadMap"
            android.util.Log.e(r2, r0)
        L_0x00d5:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.C10460n.d(android.content.Context, java.lang.String, java.lang.String, java.lang.String, nI.l, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(android.content.Context r6, java.lang.String r7, java.lang.String r8, dI.C17164e<? super com.ikea.kompassmap.model.store.Store> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof yd.C10460n.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            yd.n$b r0 = (yd.C10460n.b) r0
            int r1 = r0.f77934e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f77934e = r1
            goto L_0x0018
        L_0x0013:
            yd.n$b r0 = new yd.n$b
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f77932c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f77934e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            XH.y.b(r9)     // Catch:{ Exception -> 0x002a }
            goto L_0x0049
        L_0x002a:
            r6 = move-exception
            goto L_0x004d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            XH.y.b(r9)
            QJ.M r9 = QJ.C16311i0.b()     // Catch:{ Exception -> 0x002a }
            yd.n$c r2 = new yd.n$c     // Catch:{ Exception -> 0x002a }
            r2.<init>(r6, r7, r8, r3)     // Catch:{ Exception -> 0x002a }
            r0.f77934e = r4     // Catch:{ Exception -> 0x002a }
            java.lang.Object r9 = QJ.C16310i.g(r9, r2, r0)     // Catch:{ Exception -> 0x002a }
            if (r9 != r1) goto L_0x0049
            return r1
        L_0x0049:
            com.ikea.kompassmap.model.store.Store r9 = (com.ikea.kompassmap.model.store.Store) r9     // Catch:{ Exception -> 0x002a }
            r3 = r9
            goto L_0x0077
        L_0x004d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Error readCacheData: "
            r7.append(r8)
            java.lang.Class r8 = r6.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r7.append(r8)
            java.lang.String r8 = ", Message: "
            r7.append(r8)
            java.lang.String r8 = r6.getMessage()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "readCacheData"
            android.util.Log.e(r8, r7, r6)
        L_0x0077:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.C10460n.g(android.content.Context, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(android.content.Context r6, com.ikea.kompassmap.model.store.Store r7, java.lang.String r8, dI.C17164e<java.lang.Object> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof yd.C10460n.d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            yd.n$d r0 = (yd.C10460n.d) r0
            int r1 = r0.f77941e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f77941e = r1
            goto L_0x0018
        L_0x0013:
            yd.n$d r0 = new yd.n$d
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f77939c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f77941e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            XH.y.b(r9)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0049
        L_0x0029:
            r6 = move-exception
            goto L_0x004c
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            XH.y.b(r9)
            QJ.M r9 = QJ.C16311i0.b()     // Catch:{ Exception -> 0x0029 }
            yd.n$e r2 = new yd.n$e     // Catch:{ Exception -> 0x0029 }
            r4 = 0
            r2.<init>(r6, r7, r8, r4)     // Catch:{ Exception -> 0x0029 }
            r0.f77941e = r3     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r6 = QJ.C16310i.g(r9, r2, r0)     // Catch:{ Exception -> 0x0029 }
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ Exception -> 0x0029 }
            goto L_0x007b
        L_0x004c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Error cacheData: "
            r7.append(r8)
            java.lang.Class r8 = r6.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r7.append(r8)
            java.lang.String r8 = ", Message: "
            r7.append(r8)
            java.lang.String r8 = r6.getMessage()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "cacheData"
            int r6 = android.util.Log.e(r8, r7, r6)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r6)
        L_0x007b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.C10460n.h(android.content.Context, com.ikea.kompassmap.model.store.Store, java.lang.String, dI.e):java.lang.Object");
    }
}
