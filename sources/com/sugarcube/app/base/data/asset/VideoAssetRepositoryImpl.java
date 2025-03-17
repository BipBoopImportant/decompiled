package com.sugarcube.app.base.data.asset;

import HJ.C15854t;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import XH.C16807N;
import XH.t;
import YE.C13868b;
import YE.e;
import YH.X;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.work.B;
import androidx.work.C;
import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7042k;
import androidx.work.C7056z;
import androidx.work.S;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.di.AppModule;
import com.sugarcube.core.logger.Priority;
import dI.C17164e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012H@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH@¢\u0006\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R&\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100'0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/sugarcube/app/base/data/asset/VideoAssetRepositoryImpl;", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepository;", "Landroid/content/Context;", "context", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LQJ/Q;", "scope", "LQJ/M;", "dispatcher", "Lcom/sugarcube/app/base/data/asset/VideoAssetCache;", "videoAssetCache", "<init>", "(Landroid/content/Context;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LQJ/Q;LQJ/M;Lcom/sugarcube/app/base/data/asset/VideoAssetCache;)V", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "key", "Landroid/net/Uri;", "value", "LXH/N;", "updateMap", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;Landroid/net/Uri;)V", "asset", "get", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)Landroid/net/Uri;", "LTJ/g;", "getFlow", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)LTJ/g;", "startAssetSync", "(LdI/e;)Ljava/lang/Object;", "", "downloadUncachedVideos", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "LQJ/Q;", "LQJ/M;", "Lcom/sugarcube/app/base/data/asset/VideoAssetCache;", "LTJ/B;", "", "assetsFlow", "LTJ/B;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoAssetRepositoryImpl implements VideoAssetRepository {
    public static final int $stable = 8;
    private final C16505B<Map<VideoAsset, Uri>> assetsFlow = C16521S.a(new LinkedHashMap());
    private final ConfigRepository configRepository;
    private final Context context;
    private final M dispatcher;
    private final Q scope;
    /* access modifiers changed from: private */
    public final VideoAssetCache videoAssetCache;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.work.Q$c[] r0 = androidx.work.Q.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.work.Q$c r2 = androidx.work.Q.c.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.work.Q$c r2 = androidx.work.Q.c.RUNNING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                com.sugarcube.app.base.data.asset.VideoGroup[] r0 = com.sugarcube.app.base.data.asset.VideoGroup.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.data.asset.VideoGroup r2 = com.sugarcube.app.base.data.asset.VideoGroup.CAPTURE_HYBRID_UW     // Catch:{ NoSuchFieldError -> 0x002a }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl.WhenMappings.<clinit>():void");
        }
    }

    public VideoAssetRepositoryImpl(Context context2, ConfigRepository configRepository2, @AppModule.AppScope Q q10, @AppModule.IODispatcher M m10, VideoAssetCache videoAssetCache2) {
        C17542s.j(context2, "context");
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(q10, "scope");
        C17542s.j(m10, "dispatcher");
        C17542s.j(videoAssetCache2, "videoAssetCache");
        this.context = context2;
        this.configRepository = configRepository2;
        this.scope = q10;
        this.dispatcher = m10;
        this.videoAssetCache = videoAssetCache2;
    }

    /* access modifiers changed from: private */
    public final void updateMap(VideoAsset videoAsset, Uri uri) {
        Priority priority = Priority.DEBUG;
        String str = "VideoDownload: updating map with " + uri + " for " + videoAsset.getFilename();
        if (str == null) {
            str = "";
        }
        int i10 = VideoAssetRepositoryImpl$updateMap$$inlined$logDebug$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        Class<VideoAssetRepositoryImpl> cls = VideoAssetRepositoryImpl.class;
        if (i10 == 1) {
            String name = cls.getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o12.length() != 0) {
                name = C15854t.P0(o12, "Kt");
            }
            Log.v(name, str + " " + "");
        } else if (i10 == 2) {
            String name2 = cls.getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o13.length() != 0) {
                name2 = C15854t.P0(o13, "Kt");
            }
            Log.d(name2, str + " " + "");
        } else if (i10 == 3) {
            String name3 = cls.getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o14.length() != 0) {
                name3 = C15854t.P0(o14, "Kt");
            }
            Log.i(name3, str + " " + "");
        } else if (i10 == 4) {
            String name4 = cls.getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o15.length() != 0) {
                name4 = C15854t.P0(o15, "Kt");
            }
            Log.w(name4, str + " " + "");
        } else if (i10 == 5) {
            String name5 = cls.getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o16.length() != 0) {
                name5 = C15854t.P0(o16, "Kt");
            }
            Log.e(name5, str + " " + "");
        } else {
            throw new t();
        }
        Map z10 = X.z(this.assetsFlow.getValue());
        z10.put(videoAsset, uri);
        this.assetsFlow.setValue(z10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.sugarcube.app.base.data.asset.VideoAsset} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: boolean} */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:40|41|42|43|44|45|(1:47)(6:48|49|50|51|38|(1:58)(0))|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0179, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017a, code lost:
        r9 = r2;
        r15 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object downloadUncachedVideos(dI.C17164e<? super java.lang.Boolean> r19) {
        /*
            r18 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl$downloadUncachedVideos$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl$downloadUncachedVideos$1 r1 = (com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl$downloadUncachedVideos$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl$downloadUncachedVideos$1 r1 = new com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl$downloadUncachedVideos$1
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r1.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x009a
            if (r5 == r7) goto L_0x0069
            if (r5 != r6) goto L_0x0061
            int r5 = r1.I$0
            java.lang.Object r0 = r1.L$9
            com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl r0 = (com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl) r0
            java.lang.Object r7 = r1.L$8
            com.sugarcube.app.base.data.asset.VideoAsset r7 = (com.sugarcube.app.base.data.asset.VideoAsset) r7
            java.lang.Object r9 = r1.L$7
            com.sugarcube.app.base.data.asset.VideoAsset r9 = (com.sugarcube.app.base.data.asset.VideoAsset) r9
            java.lang.Object r10 = r1.L$5
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r1.L$4
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r12 = r1.L$3
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r1.L$2
            kotlin.jvm.internal.K r13 = (kotlin.jvm.internal.K) r13
            java.lang.Object r14 = r1.L$1
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r1.L$0
            com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl r15 = (com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl) r15
            XH.y.b(r3)     // Catch:{ Exception -> 0x005c }
            r2 = r7
            r7 = r4
            r4 = r6
            goto L_0x016f
        L_0x005c:
            r0 = move-exception
            r7 = r4
            r4 = r6
            goto L_0x0180
        L_0x0061:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0069:
            int r0 = r1.I$1
            int r5 = r1.I$0
            java.lang.Object r9 = r1.L$9
            com.sugarcube.app.base.data.asset.VideoGroup r9 = (com.sugarcube.app.base.data.asset.VideoGroup) r9
            java.lang.Object r9 = r1.L$8
            com.sugarcube.app.base.data.asset.VideoAsset r9 = (com.sugarcube.app.base.data.asset.VideoAsset) r9
            java.lang.Object r9 = r1.L$7
            java.lang.Object r10 = r1.L$6
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r1.L$5
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r12 = r1.L$4
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r1.L$3
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r1.L$2
            kotlin.jvm.internal.K r14 = (kotlin.jvm.internal.K) r14
            java.lang.Object r15 = r1.L$1
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r6 = r1.L$0
            com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl r6 = (com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl) r6
            XH.y.b(r3)
            r2 = r7
            r7 = r4
            goto L_0x0110
        L_0x009a:
            XH.y.b(r3)
            kotlin.jvm.internal.K r3 = new kotlin.jvm.internal.K
            r3.<init>()
            r3.f144344a = r7
            fI.a r5 = com.sugarcube.app.base.data.asset.VideoAsset.getEntries()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r9 = r5.iterator()
            r14 = r3
            r12 = r5
            r13 = r12
            r11 = r6
            r10 = r9
            r5 = 0
            r3 = r1
            r6 = r2
            r1 = 0
        L_0x00ba:
            boolean r9 = r10.hasNext()
            if (r9 == 0) goto L_0x0129
            java.lang.Object r9 = r10.next()
            r15 = r9
            com.sugarcube.app.base.data.asset.VideoAsset r15 = (com.sugarcube.app.base.data.asset.VideoAsset) r15
            com.sugarcube.app.base.data.asset.VideoGroup r8 = r15.getGroup()
            if (r8 != 0) goto L_0x00d2
            r16 = -1
        L_0x00cf:
            r2 = r16
            goto L_0x00db
        L_0x00d2:
            int[] r16 = com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl.WhenMappings.$EnumSwitchMapping$1
            int r17 = r8.ordinal()
            r16 = r16[r17]
            goto L_0x00cf
        L_0x00db:
            if (r2 != r7) goto L_0x011a
            com.sugarcube.app.base.data.feature.ConfigRepository r7 = r6.configRepository
            r17 = r4
            com.sugarcube.app.base.data.feature.FeatureFlags$UltrawideEnabled r4 = com.sugarcube.app.base.data.feature.FeatureFlags.UltrawideEnabled.INSTANCE
            r3.L$0 = r6
            r3.L$1 = r0
            r3.L$2 = r14
            r3.L$3 = r13
            r3.L$4 = r12
            r3.L$5 = r11
            r3.L$6 = r10
            r3.L$7 = r9
            r3.L$8 = r15
            r3.L$9 = r8
            r3.I$0 = r5
            r3.I$1 = r1
            r8 = 0
            r3.I$2 = r8
            r3.I$3 = r2
            r2 = 1
            r3.label = r2
            java.lang.Object r4 = r7.isEnabled(r4, r3)
            r7 = r17
            if (r4 != r7) goto L_0x010c
            return r7
        L_0x010c:
            r15 = r0
            r0 = r1
            r1 = r3
            r3 = r4
        L_0x0110:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = r1
            r1 = r0
            r0 = r15
            goto L_0x011e
        L_0x011a:
            r2 = r7
            r7 = r4
            r4 = r3
            r3 = r2
        L_0x011e:
            if (r3 == 0) goto L_0x0123
            r11.add(r9)
        L_0x0123:
            r3 = r4
            r4 = r7
            r7 = r2
            r2 = r18
            goto L_0x00ba
        L_0x0129:
            r7 = r4
            java.util.List r11 = (java.util.List) r11
            r1 = r11
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r1.iterator()
            r10 = r2
            r12 = r11
            r13 = r14
            r5 = 0
            r14 = r0
            r11 = r1
            r1 = r3
        L_0x013a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r0 = r10.next()
            r2 = r0
            com.sugarcube.app.base.data.asset.VideoAsset r2 = (com.sugarcube.app.base.data.asset.VideoAsset) r2
            com.sugarcube.app.base.data.asset.VideoAssetCache r3 = r6.videoAssetCache     // Catch:{ Exception -> 0x017d }
            r1.L$0 = r6     // Catch:{ Exception -> 0x017d }
            r1.L$1 = r14     // Catch:{ Exception -> 0x017d }
            r1.L$2 = r13     // Catch:{ Exception -> 0x017d }
            r1.L$3 = r12     // Catch:{ Exception -> 0x017d }
            r1.L$4 = r11     // Catch:{ Exception -> 0x017d }
            r1.L$5 = r10     // Catch:{ Exception -> 0x017d }
            r1.L$6 = r0     // Catch:{ Exception -> 0x017d }
            r1.L$7 = r2     // Catch:{ Exception -> 0x017d }
            r1.L$8 = r2     // Catch:{ Exception -> 0x017d }
            r1.L$9 = r6     // Catch:{ Exception -> 0x017d }
            r1.I$0 = r5     // Catch:{ Exception -> 0x017d }
            r4 = 0
            r1.I$1 = r4     // Catch:{ Exception -> 0x017d }
            r4 = 2
            r1.label = r4     // Catch:{ Exception -> 0x0179 }
            java.lang.Object r3 = r3.cacheAsset(r2, r1)     // Catch:{ Exception -> 0x0179 }
            if (r3 != r7) goto L_0x016c
            return r7
        L_0x016c:
            r9 = r2
            r0 = r6
            r15 = r0
        L_0x016f:
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ Exception -> 0x0177 }
            r0.updateMap(r2, r3)     // Catch:{ Exception -> 0x0177 }
            r6 = r15
            r2 = 0
            goto L_0x013a
        L_0x0177:
            r0 = move-exception
            goto L_0x0180
        L_0x0179:
            r0 = move-exception
        L_0x017a:
            r9 = r2
            r15 = r6
            goto L_0x0180
        L_0x017d:
            r0 = move-exception
            r4 = 2
            goto L_0x017a
        L_0x0180:
            YE.b r2 = YE.C13868b.f118106a
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "error "
            r3.append(r6)
            r3.append(r9)
            java.lang.String r6 = " "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            YE.e r3 = YE.e.Asset
            r2.b(r0, r3)
            r2 = 0
            r13.f144344a = r2
            r6 = r15
            goto L_0x013a
        L_0x01a9:
            boolean r0 = r13.f144344a
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl.downloadUncachedVideos(dI.e):java.lang.Object");
    }

    public Uri get(VideoAsset videoAsset) {
        C17542s.j(videoAsset, "asset");
        Uri findInCache = this.videoAssetCache.findInCache(videoAsset);
        if (findInCache != null) {
            return findInCache;
        }
        Uri downloadUri = this.videoAssetCache.getDownloadUri(videoAsset);
        C13868b bVar = C13868b.f118106a;
        bVar.b("asset uri=" + downloadUri, e.Asset);
        F0 unused = C16314k.d(this.scope, this.dispatcher, (T) null, new VideoAssetRepositoryImpl$get$2$1(this, videoAsset, (C17164e<? super VideoAssetRepositoryImpl$get$2$1>) null), 2, (Object) null);
        return downloadUri;
    }

    public final Context getContext() {
        return this.context;
    }

    public C16532g<Uri> getFlow(VideoAsset videoAsset) {
        C17542s.j(videoAsset, "asset");
        return new VideoAssetRepositoryImpl$getFlow$$inlined$map$1(this.assetsFlow, videoAsset, get(videoAsset));
    }

    public Object startAssetSync(C17164e<? super C16807N> eVar) {
        int i10;
        S a10 = S.f45094a.a(this.context);
        List<androidx.work.Q> list = a10.k(VideoAssetDownloadWorker.WORKER_TAG).get();
        C17542s.i(list, "get(...)");
        Iterator it = list.iterator();
        do {
            Class<VideoAssetRepositoryImpl> cls = VideoAssetRepositoryImpl.class;
            if (it.hasNext()) {
                androidx.work.Q q10 = (androidx.work.Q) it.next();
                Priority priority = Priority.INFO;
                String str = "startAssetSync existing worker " + q10.b();
                if (str == null) {
                    str = "";
                }
                int i11 = VideoAssetRepositoryImpl$startAssetSync$lambda$4$$inlined$logInfo$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
                if (i11 == 1) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    Log.v(name, str + " " + "");
                } else if (i11 == 2) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    Log.d(name2, str + " " + "");
                } else if (i11 == 3) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    Log.i(name3, str + " " + "");
                } else if (i11 == 4) {
                    String name4 = cls.getName();
                    C17542s.g(name4);
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    Log.w(name4, str + " " + "");
                } else if (i11 == 5) {
                    String name5 = cls.getName();
                    C17542s.g(name5);
                    String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o16.length() != 0) {
                        name5 = C15854t.P0(o16, "Kt");
                    }
                    Log.e(name5, str + " " + "");
                } else {
                    throw new t();
                }
                i10 = WhenMappings.$EnumSwitchMapping$0[q10.b().ordinal()];
                if (i10 == 1) {
                    break;
                }
            } else {
                C7036e a11 = new C7036e.a().c(false).d(false).e(false).b(C7056z.CONNECTED).a();
                B.a aVar = new B.a(VideoAssetDownloadWorker.class);
                C7032a aVar2 = C7032a.EXPONENTIAL;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C g10 = a10.g(VideoAssetDownloadWorker.WORKER_TAG, C7042k.REPLACE, (B) ((B.a) ((B.a) ((B.a) ((B.a) aVar.i(aVar2, 10000, timeUnit)).m(0, timeUnit)).n(C7037f.f45197c)).j(a11)).b());
                Priority priority2 = Priority.INFO;
                String str2 = "startAssetSync " + g10.a().get() + " " + g10.getState().getValue();
                if (str2 == null) {
                    str2 = "";
                }
                int i12 = VideoAssetRepositoryImpl$startAssetSync$$inlined$logInfo$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0[priority2.ordinal()];
                if (i12 == 1) {
                    String name6 = cls.getName();
                    C17542s.g(name6);
                    String o17 = C15854t.o1(C15854t.s1(name6, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o17.length() != 0) {
                        name6 = C15854t.P0(o17, "Kt");
                    }
                    Log.v(name6, str2 + " " + "");
                } else if (i12 == 2) {
                    String name7 = cls.getName();
                    C17542s.g(name7);
                    String o18 = C15854t.o1(C15854t.s1(name7, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o18.length() != 0) {
                        name7 = C15854t.P0(o18, "Kt");
                    }
                    Log.d(name7, str2 + " " + "");
                } else if (i12 == 3) {
                    String name8 = cls.getName();
                    C17542s.g(name8);
                    String o19 = C15854t.o1(C15854t.s1(name8, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o19.length() != 0) {
                        name8 = C15854t.P0(o19, "Kt");
                    }
                    Log.i(name8, str2 + " " + "");
                } else if (i12 == 4) {
                    String name9 = cls.getName();
                    C17542s.g(name9);
                    String o110 = C15854t.o1(C15854t.s1(name9, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o110.length() != 0) {
                        name9 = C15854t.P0(o110, "Kt");
                    }
                    Log.w(name9, str2 + " " + "");
                } else if (i12 == 5) {
                    String name10 = cls.getName();
                    C17542s.g(name10);
                    String o111 = C15854t.o1(C15854t.s1(name10, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o111.length() != 0) {
                        name10 = C15854t.P0(o111, "Kt");
                    }
                    Log.e(name10, str2 + " " + "");
                } else {
                    throw new t();
                }
                return C16807N.f139792a;
            }
        } while (i10 != 2);
        return C16807N.f139792a;
    }
}
