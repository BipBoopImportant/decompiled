package com.sugarcube.app.base.upload;

import GK.C15774B;
import GK.C15775C;
import GK.C15776D;
import GK.C15805x;
import GK.z;
import HJ.C15854t;
import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import KF.C13147a;
import KF.C13148b;
import KF.C13167u;
import KF.C13168v;
import KF.C13169w;
import KF.C13170x;
import KF.C13171y;
import LF.C13185a;
import LF.C13187c;
import MF.C13207a;
import MF.C13208b;
import OE.C13309a;
import OE.C13313e;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import WH.C16729a;
import XH.C16796C;
import XH.C16807N;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YE.C13867a;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import YH.g0;
import android.os.Build;
import bK.C17052a;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.database.Media;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.database.SceneState;
import com.sugarcube.app.base.data.feature.ConfigItems;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase;
import com.sugarcube.app.base.upload.UploadJobService;
import com.sugarcube.core.network.models.LoggedInUser;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.core.network.models.UploadSetState;
import com.sugarcube.core.network.models.UploadURL;
import dI.C17164e;
import eI.C17187b;
import jI.C17423j;
import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001By\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJd\u00101\u001a\u0002002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0'2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020#H@¢\u0006\u0004\b1\u00102J'\u00106\u001a\u0002002\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020,H\u0016¢\u0006\u0004\b6\u00107J\"\u0010;\u001a\u00020:2\u0006\u00103\u001a\u00020,2\b\u00109\u001a\u0004\u0018\u000108H@¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u0013H\u0001¢\u0006\u0004\bA\u0010BJ\u0013\u0010D\u001a\u000200*\u0004\u0018\u00010C¢\u0006\u0004\bD\u0010EJ3\u0010L\u001a\u00020K2\"\u0010J\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020G\u0012\n\u0012\b\u0012\u0004\u0012\u0002000H\u0012\u0006\u0012\u0004\u0018\u00010I0FH\u0002¢\u0006\u0004\bL\u0010MJ\u001e\u0010P\u001a\u0002002\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0'H@¢\u0006\u0004\bP\u0010QJ\u001e\u0010S\u001a\u0002002\f\u0010R\u001a\b\u0012\u0004\u0012\u00020N0'H@¢\u0006\u0004\bS\u0010QJ)\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020U0T0'2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u000200H@¢\u0006\u0004\bX\u0010YJ\u0018\u0010\\\u001a\u0002002\u0006\u0010[\u001a\u00020ZH@¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u0002002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020,H\u0002¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u000200H@¢\u0006\u0004\bd\u0010YJ\u0010\u0010e\u001a\u000200H@¢\u0006\u0004\be\u0010YJ\u0010\u0010f\u001a\u000200H@¢\u0006\u0004\bf\u0010YJ\u0010\u0010g\u001a\u000200H@¢\u0006\u0004\bg\u0010YJ\u0018\u0010h\u001a\u0002002\u0006\u0010[\u001a\u00020ZH@¢\u0006\u0004\bh\u0010]J\u0010\u0010i\u001a\u000200H@¢\u0006\u0004\bi\u0010YJ\u0018\u0010j\u001a\u00020,2\u0006\u0010 \u001a\u00020\u001fH@¢\u0006\u0004\bj\u0010kJ\u0018\u0010l\u001a\u0002002\u0006\u0010 \u001a\u00020\u001fH@¢\u0006\u0004\bl\u0010kJ\u0019\u0010n\u001a\u00020,2\b\u0010m\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\bn\u0010oJ#\u0010r\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020#0p2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\br\u0010sJ\u0018\u0010t\u001a\u0002002\u0006\u0010 \u001a\u00020\u001fH@¢\u0006\u0004\bt\u0010kJ \u0010u\u001a\u0002002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010>\u001a\u00020=H@¢\u0006\u0004\bu\u0010vJ\u0018\u0010w\u001a\u0002002\u0006\u0010 \u001a\u00020\u001fH@¢\u0006\u0004\bw\u0010kJ\u0018\u0010x\u001a\u0002002\u0006\u0010 \u001a\u00020\u001fH@¢\u0006\u0004\bx\u0010kJ\u001e\u0010z\u001a\u0002002\f\u0010y\u001a\b\u0012\u0004\u0012\u00020Z0'H@¢\u0006\u0004\bz\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0010\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R!\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010 \u0001R\u001b\u0010¤\u0001\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001¨\u0006©\u0001"}, d2 = {"Lcom/sugarcube/app/base/upload/g;", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "LLF/c;", "log", "LOE/a;", "appEnvironment", "LOE/e;", "installationConfig", "Lcom/sugarcube/app/base/upload/IUploadDatabase;", "database", "LKF/a;", "captureFiles", "LYE/a;", "eventLog", "Lcom/sugarcube/app/base/upload/IUploadApi;", "uploadApi", "Lcom/sugarcube/app/base/external/config/a;", "config", "LWH/a;", "LGK/z;", "fileUploadClientProvider", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepo", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepo", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "privacyPolicyConsentUseCase", "<init>", "(LLF/c;LOE/a;LOE/e;Lcom/sugarcube/app/base/upload/IUploadDatabase;LKF/a;LYE/a;Lcom/sugarcube/app/base/upload/IUploadApi;Lcom/sugarcube/app/base/external/config/a;LWH/a;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/data/SceneRepository;Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;)V", "Ljava/util/UUID;", "captureUUID", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "", "roomTitle", "Ljava/time/Instant;", "creation", "", "Lcom/sugarcube/app/base/data/database/Media;", "medias", "Lcom/sugarcube/app/base/data/database/Metadata;", "metas", "", "result", "captureType", "captureStrategy", "LXH/N;", "addUpload", "(Ljava/util/UUID;Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "retryFailures", "reason", "doTrack", "scheduleUploads", "(ZLjava/lang/String;Z)V", "Lcom/sugarcube/app/base/upload/UploadWorkerV2;", "workerV2", "Landroidx/work/x$a;", "startUploading", "(ZLcom/sugarcube/app/base/upload/UploadWorkerV2;LdI/e;)Ljava/lang/Object;", "LMF/b;", "fileDBO", "fileUploadClient", "LKF/b;", "f0", "(LMF/b;LGK/z;)LKF/b;", "Lcom/sugarcube/core/network/models/UploadSetState;", "L", "(Lcom/sugarcube/core/network/models/UploadSetState;)V", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "", "block", "LQJ/F0;", "K", "(LnI/p;)LQJ/F0;", "Lcom/sugarcube/app/base/data/database/Scene;", "realScenes", "S", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "scenes", "R", "LXH/v;", "", "U", "(Ljava/util/UUID;)Ljava/util/List;", "C", "(LdI/e;)Ljava/lang/Object;", "LMF/e;", "uploadSet", "T", "(LMF/e;LdI/e;)Ljava/lang/Object;", "LMF/f;", "newState", "e0", "(Ljava/util/UUID;LMF/f;)V", "I", "()Z", "a0", "O", "P", "Q", "Z", "c0", "b0", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "G", "timestamp", "J", "(Ljava/lang/Long;)Z", "", "Lcom/sugarcube/core/network/models/UploadURL;", "E", "(Ljava/util/UUID;)Ljava/util/Map;", "g0", "N", "(Ljava/util/UUID;LMF/b;LdI/e;)Ljava/lang/Object;", "d0", "D", "allConfirmedButUncreatedSets", "F", "a", "LLF/c;", "b", "LOE/a;", "c", "LOE/e;", "d", "Lcom/sugarcube/app/base/upload/IUploadDatabase;", "e", "LKF/a;", "f", "LYE/a;", "g", "Lcom/sugarcube/app/base/upload/IUploadApi;", "h", "Lcom/sugarcube/app/base/external/config/a;", "i", "LWH/a;", "j", "Lcom/sugarcube/app/base/data/user/UserRepo;", "k", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "l", "Lcom/sugarcube/app/base/data/SceneRepository;", "m", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "", "n", "LXH/o;", "H", "()I", "maxAttempts", "LbK/a;", "o", "LbK/a;", "working", "p", "Ljava/util/UUID;", "workerId", "q", "Ljava/lang/Long;", "workingStartedMs", "Ljava/util/concurrent/atomic/AtomicBoolean;", "r", "Ljava/util/concurrent/atomic/AtomicBoolean;", "userLoggedIn", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements IUploaderV2 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C13187c f125776a;

    /* renamed from: b  reason: collision with root package name */
    private final C13309a f125777b;

    /* renamed from: c  reason: collision with root package name */
    private final C13313e f125778c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final IUploadDatabase f125779d;

    /* renamed from: e  reason: collision with root package name */
    private final C13147a f125780e;

    /* renamed from: f  reason: collision with root package name */
    private final C13867a f125781f;

    /* renamed from: g  reason: collision with root package name */
    private final IUploadApi f125782g;

    /* renamed from: h  reason: collision with root package name */
    private final com.sugarcube.app.base.external.config.a f125783h;

    /* renamed from: i  reason: collision with root package name */
    private final C16729a<z> f125784i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final UserRepo f125785j;

    /* renamed from: k  reason: collision with root package name */
    private final ConfigRepository f125786k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final SceneRepository f125787l;

    /* renamed from: m  reason: collision with root package name */
    private final PrivacyPolicyConsentUseCase f125788m;

    /* renamed from: n  reason: collision with root package name */
    private final C16824o f125789n = C16825p.b(new C13167u(this));
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C17052a f125790o = bK.g.b(false, 1, (Object) null);

    /* renamed from: p  reason: collision with root package name */
    private UUID f125791p;

    /* renamed from: q  reason: collision with root package name */
    private Long f125792q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final AtomicBoolean f125793r = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2$1", f = "UploaderV2.kt", l = {143}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125794c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f125795d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.upload.g$a$a  reason: collision with other inner class name */
        static final class C3077a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f125796a;

            C3077a(g gVar) {
                this.f125796a = gVar;
            }

            /* renamed from: c */
            public final Object emit(LoggedInUser loggedInUser, C17164e<? super C16807N> eVar) {
                this.f125796a.f125776a.f(loggedInUser);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f125795d = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f125795d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125794c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<LoggedInUser> user = this.f125795d.f125785j.getUser();
                C3077a aVar = new C3077a(this.f125795d);
                this.f125794c = 1;
                if (user.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2$2", f = "UploaderV2.kt", l = {148}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125797c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f125798d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f125799a;

            a(g gVar) {
                this.f125799a = gVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f125799a.f125793r.set(z10);
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f125798d = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f125798d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125797c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<Boolean> isLoggedIn = this.f125798d.f125785j.isLoggedIn();
                a aVar = new a(this.f125798d);
                this.f125797c = 1;
                if (isLoggedIn.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2$3", f = "UploaderV2.kt", l = {154}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125800c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f125801d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f125802a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2$3$1", f = "UploaderV2.kt", l = {156, 159}, m = "emit")
            /* renamed from: com.sugarcube.app.base.upload.g$c$a$a  reason: collision with other inner class name */
            static final class C3078a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f125803c;

                /* renamed from: d  reason: collision with root package name */
                Object f125804d;

                /* renamed from: e  reason: collision with root package name */
                Object f125805e;

                /* renamed from: f  reason: collision with root package name */
                Object f125806f;

                /* renamed from: g  reason: collision with root package name */
                Object f125807g;

                /* renamed from: h  reason: collision with root package name */
                Object f125808h;

                /* renamed from: i  reason: collision with root package name */
                Object f125809i;

                /* renamed from: j  reason: collision with root package name */
                Object f125810j;

                /* renamed from: k  reason: collision with root package name */
                int f125811k;

                /* renamed from: l  reason: collision with root package name */
                int f125812l;

                /* renamed from: m  reason: collision with root package name */
                /* synthetic */ Object f125813m;

                /* renamed from: n  reason: collision with root package name */
                final /* synthetic */ a<T> f125814n;

                /* renamed from: o  reason: collision with root package name */
                int f125815o;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3078a(a<? super T> aVar, C17164e<? super C3078a> eVar) {
                    super(eVar);
                    this.f125814n = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f125813m = obj;
                    this.f125815o |= Integer.MIN_VALUE;
                    return this.f125814n.emit((List<Scene>) null, this);
                }
            }

            a(g gVar) {
                this.f125802a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0082  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00eb A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.util.List<com.sugarcube.app.base.data.database.Scene> r13, dI.C17164e<? super XH.C16807N> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.sugarcube.app.base.upload.g.c.a.C3078a
                    if (r0 == 0) goto L_0x0013
                    r0 = r14
                    com.sugarcube.app.base.upload.g$c$a$a r0 = (com.sugarcube.app.base.upload.g.c.a.C3078a) r0
                    int r1 = r0.f125815o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f125815o = r1
                    goto L_0x0018
                L_0x0013:
                    com.sugarcube.app.base.upload.g$c$a$a r0 = new com.sugarcube.app.base.upload.g$c$a$a
                    r0.<init>(r12, r14)
                L_0x0018:
                    java.lang.Object r1 = r0.f125813m
                    java.lang.Object r2 = eI.C17187b.f()
                    int r3 = r0.f125815o
                    r4 = 2
                    r5 = 1
                    if (r3 == 0) goto L_0x0082
                    if (r3 == r5) goto L_0x0055
                    if (r3 != r4) goto L_0x004d
                    java.lang.Object r13 = r0.f125810j
                    java.util.Iterator r13 = (java.util.Iterator) r13
                    java.lang.Object r13 = r0.f125809i
                    java.util.Collection r13 = (java.util.Collection) r13
                    java.lang.Object r13 = r0.f125808h
                    java.lang.Iterable r13 = (java.lang.Iterable) r13
                    java.lang.Object r13 = r0.f125807g
                    java.lang.Iterable r13 = (java.lang.Iterable) r13
                    java.lang.Object r13 = r0.f125806f
                    java.util.List r13 = (java.util.List) r13
                    java.lang.Object r13 = r0.f125805e
                    dI.e r13 = (dI.C17164e) r13
                    java.lang.Object r13 = r0.f125804d
                    java.util.List r13 = (java.util.List) r13
                    java.lang.Object r13 = r0.f125803c
                    com.sugarcube.app.base.upload.g$c$a r13 = (com.sugarcube.app.base.upload.g.c.a) r13
                    XH.y.b(r1)
                    goto L_0x00ec
                L_0x004d:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L_0x0055:
                    int r13 = r0.f125812l
                    int r14 = r0.f125811k
                    java.lang.Object r3 = r0.f125810j
                    java.util.Iterator r3 = (java.util.Iterator) r3
                    java.lang.Object r5 = r0.f125809i
                    java.util.Collection r5 = (java.util.Collection) r5
                    java.lang.Object r6 = r0.f125808h
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.lang.Object r7 = r0.f125807g
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.lang.Object r8 = r0.f125806f
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Object r9 = r0.f125805e
                    dI.e r9 = (dI.C17164e) r9
                    java.lang.Object r10 = r0.f125804d
                    java.util.List r10 = (java.util.List) r10
                    java.lang.Object r11 = r0.f125803c
                    com.sugarcube.app.base.upload.g$c$a r11 = (com.sugarcube.app.base.upload.g.c.a) r11
                    XH.y.b(r1)
                    r1 = r14
                    r14 = r9
                    r9 = r8
                    r8 = r13
                    r13 = r10
                    goto L_0x00cd
                L_0x0082:
                    XH.y.b(r1)
                    r6 = r13
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.Iterator r3 = r6.iterator()
                L_0x0091:
                    boolean r7 = r3.hasNext()
                    if (r7 == 0) goto L_0x00a8
                    java.lang.Object r7 = r3.next()
                    r8 = r7
                    com.sugarcube.app.base.data.database.Scene r8 = (com.sugarcube.app.base.data.database.Scene) r8
                    int r8 = r8.getSceneId()
                    if (r8 == 0) goto L_0x0091
                    r1.add(r7)
                    goto L_0x0091
                L_0x00a8:
                    com.sugarcube.app.base.upload.g r7 = r12.f125802a
                    r0.f125803c = r12
                    r0.f125804d = r13
                    r0.f125805e = r14
                    r0.f125806f = r1
                    r0.f125807g = r6
                    r0.f125808h = r6
                    r0.f125809i = r1
                    r0.f125810j = r3
                    r8 = 0
                    r0.f125811k = r8
                    r0.f125812l = r8
                    r0.f125815o = r5
                    java.lang.Object r5 = r7.S(r1, r0)
                    if (r5 != r2) goto L_0x00c8
                    return r2
                L_0x00c8:
                    r11 = r12
                    r5 = r1
                    r9 = r5
                    r7 = r6
                    r1 = r8
                L_0x00cd:
                    com.sugarcube.app.base.upload.g r10 = r11.f125802a
                    r0.f125803c = r11
                    r0.f125804d = r13
                    r0.f125805e = r14
                    r0.f125806f = r9
                    r0.f125807g = r7
                    r0.f125808h = r6
                    r0.f125809i = r5
                    r0.f125810j = r3
                    r0.f125811k = r1
                    r0.f125812l = r8
                    r0.f125815o = r4
                    java.lang.Object r13 = r10.R(r13, r0)
                    if (r13 != r2) goto L_0x00ec
                    return r2
                L_0x00ec:
                    XH.N r13 = XH.C16807N.f139792a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.c.a.emit(java.util.List, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f125801d = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f125801d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125800c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<List<Scene>> scenesFlow = this.f125801d.f125787l.getScenesFlow();
                a aVar = new a(this.f125801d);
                this.f125800c = 1;
                if (scenesFlow.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f125816a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                MF.f[] r0 = MF.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MF.f r1 = MF.f.Uploading     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                MF.f r1 = MF.f.Scheduled     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                MF.f r1 = MF.f.Failed     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                MF.f r1 = MF.f.Uploaded     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                MF.f r1 = MF.f.UploadConfirmed     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f125816a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.d.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2$addUpload$2", f = "UploaderV2.kt", l = {224, 1038}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f125817c;

        /* renamed from: d  reason: collision with root package name */
        Object f125818d;

        /* renamed from: e  reason: collision with root package name */
        Object f125819e;

        /* renamed from: f  reason: collision with root package name */
        Object f125820f;

        /* renamed from: g  reason: collision with root package name */
        Object f125821g;

        /* renamed from: h  reason: collision with root package name */
        Object f125822h;

        /* renamed from: i  reason: collision with root package name */
        Object f125823i;

        /* renamed from: j  reason: collision with root package name */
        boolean f125824j;

        /* renamed from: k  reason: collision with root package name */
        int f125825k;

        /* renamed from: l  reason: collision with root package name */
        int f125826l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f125827m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ UUID f125828n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ RoomType f125829o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f125830p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Instant f125831q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ List<Media> f125832r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ List<com.sugarcube.app.base.data.database.Metadata> f125833s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f125834t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ String f125835u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ String f125836v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar, UUID uuid, RoomType roomType, String str, Instant instant, List<Media> list, List<com.sugarcube.app.base.data.database.Metadata> list2, boolean z10, String str2, String str3, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f125827m = gVar;
            this.f125828n = uuid;
            this.f125829o = roomType;
            this.f125830p = str;
            this.f125831q = instant;
            this.f125832r = list;
            this.f125833s = list2;
            this.f125834t = z10;
            this.f125835u = str2;
            this.f125836v = str3;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f125827m, this.f125828n, this.f125829o, this.f125830p, this.f125831q, this.f125832r, this.f125833s, this.f125834t, this.f125835u, this.f125836v, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x00c0 A[Catch:{ all -> 0x00cd }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00cf A[Catch:{ all -> 0x00cd }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                r30 = this;
                r14 = r30
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f125826l
                r15 = 2
                r13 = 1
                r12 = 0
                if (r1 == 0) goto L_0x0047
                if (r1 == r13) goto L_0x0043
                if (r1 != r15) goto L_0x003b
                boolean r0 = r14.f125824j
                java.lang.Object r1 = r14.f125823i
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r2 = r14.f125822h
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r14.f125821g
                com.sugarcube.core.network.models.RoomType r3 = (com.sugarcube.core.network.models.RoomType) r3
                java.lang.Object r4 = r14.f125820f
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r5 = r14.f125819e
                java.util.UUID r5 = (java.util.UUID) r5
                java.lang.Object r6 = r14.f125818d
                com.sugarcube.app.base.upload.g r6 = (com.sugarcube.app.base.upload.g) r6
                java.lang.Object r7 = r14.f125817c
                bK.a r7 = (bK.C17052a) r7
                XH.y.b(r31)
                r27 = r1
                r26 = r2
                r24 = r4
                r9 = r12
                goto L_0x00b6
            L_0x003b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0043:
                XH.y.b(r31)
                goto L_0x007e
            L_0x0047:
                XH.y.b(r31)
                com.sugarcube.app.base.upload.g r1 = r14.f125827m
                com.sugarcube.app.base.data.SceneRepository r1 = r1.f125787l
                java.util.UUID r2 = r14.f125828n
                com.sugarcube.core.network.models.RoomType r3 = r14.f125829o
                java.lang.String r4 = r14.f125830p
                java.time.Instant r5 = r14.f125831q
                java.util.List<com.sugarcube.app.base.data.database.Media> r6 = r14.f125832r
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.List r6 = YH.C16877v.t1(r6)
                java.util.List<com.sugarcube.app.base.data.database.Metadata> r7 = r14.f125833s
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.List r7 = YH.C16877v.t1(r7)
                boolean r8 = r14.f125834t
                java.lang.String r9 = r14.f125835u
                java.lang.String r10 = r14.f125836v
                r14.f125826l = r13
                r11 = 0
                r16 = 1
                r12 = r16
                r13 = r30
                java.lang.Object r1 = r1.addCapture(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r1 != r0) goto L_0x007e
                return r0
            L_0x007e:
                com.sugarcube.app.base.upload.g r1 = r14.f125827m
                bK.a r7 = r1.f125790o
                com.sugarcube.app.base.upload.g r6 = r14.f125827m
                java.util.UUID r5 = r14.f125828n
                boolean r1 = r14.f125834t
                java.lang.String r4 = r14.f125830p
                com.sugarcube.core.network.models.RoomType r3 = r14.f125829o
                java.lang.String r2 = r14.f125835u
                java.lang.String r8 = r14.f125836v
                r14.f125817c = r7
                r14.f125818d = r6
                r14.f125819e = r5
                r14.f125820f = r4
                r14.f125821g = r3
                r14.f125822h = r2
                r14.f125823i = r8
                r14.f125824j = r1
                r9 = 0
                r14.f125825k = r9
                r14.f125826l = r15
                r9 = 0
                java.lang.Object r10 = r7.e(r9, r14)
                if (r10 != r0) goto L_0x00af
                return r0
            L_0x00af:
                r0 = r1
                r26 = r2
                r24 = r4
                r27 = r8
            L_0x00b6:
                com.sugarcube.app.base.upload.IUploadDatabase r1 = r6.f125779d     // Catch:{ all -> 0x00cd }
                MF.e r1 = r1.getUploadSet(r5)     // Catch:{ all -> 0x00cd }
                if (r1 == 0) goto L_0x00cf
                LF.c r0 = r6.f125776a     // Catch:{ all -> 0x00cd }
                java.lang.String r1 = "inserting upload that already existed"
                LF.C13187c.h(r0, r1, r9, r15, r9)     // Catch:{ all -> 0x00cd }
                java.util.List unused = r6.U(r5)     // Catch:{ all -> 0x00cd }
                goto L_0x010a
            L_0x00cd:
                r0 = move-exception
                goto L_0x0121
            L_0x00cf:
                if (r0 == 0) goto L_0x00d6
                MF.f r0 = MF.f.Scheduled     // Catch:{ all -> 0x00cd }
            L_0x00d3:
                r21 = r0
                goto L_0x00d9
            L_0x00d6:
                MF.f r0 = MF.f.Failed     // Catch:{ all -> 0x00cd }
                goto L_0x00d3
            L_0x00d9:
                MF.e r0 = new MF.e     // Catch:{ all -> 0x00cd }
                java.lang.String r25 = r3.toString()     // Catch:{ all -> 0x00cd }
                r28 = 54
                r29 = 0
                r19 = 0
                r20 = 0
                r22 = 0
                r23 = 0
                r17 = r0
                r18 = r5
                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x00cd }
                com.sugarcube.app.base.upload.IUploadDatabase r1 = r6.f125779d     // Catch:{ all -> 0x00cd }
                r1.insertSet(r0)     // Catch:{ all -> 0x00cd }
                java.util.List r1 = r6.U(r5)     // Catch:{ all -> 0x00cd }
                LF.c r2 = r6.f125776a     // Catch:{ all -> 0x00cd }
                LF.a$a$a r3 = new LF.a$a$a     // Catch:{ all -> 0x00cd }
                r3.<init>(r0, r1)     // Catch:{ all -> 0x00cd }
                r0 = 1
                r2.b(r3, r0)     // Catch:{ all -> 0x00cd }
            L_0x010a:
                java.lang.String r19 = "added"
                r21 = 5
                r22 = 0
                r18 = 0
                r20 = 0
                r17 = r6
                com.sugarcube.app.base.upload.IUploaderV2.a.a(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00cd }
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00cd }
                r7.d(r9)
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0121:
                r7.d(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {528}, m = "clearFailures")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125837c;

        /* renamed from: d  reason: collision with root package name */
        Object f125838d;

        /* renamed from: e  reason: collision with root package name */
        Object f125839e;

        /* renamed from: f  reason: collision with root package name */
        Object f125840f;

        /* renamed from: g  reason: collision with root package name */
        Object f125841g;

        /* renamed from: h  reason: collision with root package name */
        Object f125842h;

        /* renamed from: i  reason: collision with root package name */
        Object f125843i;

        /* renamed from: j  reason: collision with root package name */
        int f125844j;

        /* renamed from: k  reason: collision with root package name */
        int f125845k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f125846l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f125847m;

        /* renamed from: n  reason: collision with root package name */
        int f125848n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f125847m = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125846l = obj;
            this.f125848n |= Integer.MIN_VALUE;
            return this.f125847m.C(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {931}, m = "confirmSetWasUploaded")
    /* renamed from: com.sugarcube.app.base.upload.g$g  reason: collision with other inner class name */
    static final class C3079g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125849c;

        /* renamed from: d  reason: collision with root package name */
        Object f125850d;

        /* renamed from: e  reason: collision with root package name */
        Object f125851e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f125852f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f125853g;

        /* renamed from: h  reason: collision with root package name */
        int f125854h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3079g(g gVar, C17164e<? super C3079g> eVar) {
            super(eVar);
            this.f125853g = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125852f = obj;
            this.f125854h |= Integer.MIN_VALUE;
            return this.f125853g.D((UUID) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {946, 973}, m = "createScenes")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: A  reason: collision with root package name */
        Object f125855A;

        /* renamed from: B  reason: collision with root package name */
        Object f125856B;

        /* renamed from: C  reason: collision with root package name */
        Object f125857C;

        /* renamed from: D  reason: collision with root package name */
        Object f125858D;

        /* renamed from: E  reason: collision with root package name */
        Object f125859E;

        /* renamed from: F  reason: collision with root package name */
        Object f125860F;

        /* renamed from: G  reason: collision with root package name */
        Object f125861G;

        /* renamed from: H  reason: collision with root package name */
        Object f125862H;

        /* renamed from: I  reason: collision with root package name */
        int f125863I;

        /* renamed from: J  reason: collision with root package name */
        int f125864J;

        /* renamed from: K  reason: collision with root package name */
        int f125865K;

        /* renamed from: L  reason: collision with root package name */
        int f125866L;

        /* renamed from: M  reason: collision with root package name */
        /* synthetic */ Object f125867M;

        /* renamed from: N  reason: collision with root package name */
        final /* synthetic */ g f125868N;

        /* renamed from: O  reason: collision with root package name */
        int f125869O;

        /* renamed from: c  reason: collision with root package name */
        Object f125870c;

        /* renamed from: d  reason: collision with root package name */
        Object f125871d;

        /* renamed from: e  reason: collision with root package name */
        Object f125872e;

        /* renamed from: f  reason: collision with root package name */
        Object f125873f;

        /* renamed from: g  reason: collision with root package name */
        Object f125874g;

        /* renamed from: h  reason: collision with root package name */
        Object f125875h;

        /* renamed from: i  reason: collision with root package name */
        Object f125876i;

        /* renamed from: j  reason: collision with root package name */
        Object f125877j;

        /* renamed from: k  reason: collision with root package name */
        Object f125878k;

        /* renamed from: l  reason: collision with root package name */
        Object f125879l;

        /* renamed from: m  reason: collision with root package name */
        Object f125880m;

        /* renamed from: n  reason: collision with root package name */
        Object f125881n;

        /* renamed from: o  reason: collision with root package name */
        Object f125882o;

        /* renamed from: p  reason: collision with root package name */
        Object f125883p;

        /* renamed from: q  reason: collision with root package name */
        Object f125884q;

        /* renamed from: r  reason: collision with root package name */
        Object f125885r;

        /* renamed from: s  reason: collision with root package name */
        Object f125886s;

        /* renamed from: t  reason: collision with root package name */
        Object f125887t;

        /* renamed from: u  reason: collision with root package name */
        Object f125888u;

        /* renamed from: v  reason: collision with root package name */
        Object f125889v;

        /* renamed from: w  reason: collision with root package name */
        Object f125890w;

        /* renamed from: x  reason: collision with root package name */
        Object f125891x;

        /* renamed from: y  reason: collision with root package name */
        Object f125892y;

        /* renamed from: z  reason: collision with root package name */
        Object f125893z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f125868N = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125867M = obj;
            this.f125869O |= Integer.MIN_VALUE;
            return this.f125868N.F((List<MF.e>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {742, 752, 757}, m = "createUploadOnBackend")
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125894c;

        /* renamed from: d  reason: collision with root package name */
        Object f125895d;

        /* renamed from: e  reason: collision with root package name */
        Object f125896e;

        /* renamed from: f  reason: collision with root package name */
        Object f125897f;

        /* renamed from: g  reason: collision with root package name */
        Object f125898g;

        /* renamed from: h  reason: collision with root package name */
        Object f125899h;

        /* renamed from: i  reason: collision with root package name */
        Object f125900i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f125901j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g f125902k;

        /* renamed from: l  reason: collision with root package name */
        int f125903l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(g gVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f125902k = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125901j = obj;
            this.f125903l |= Integer.MIN_VALUE;
            return this.f125902k.G((UUID) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {891, 896}, m = "notifyBackendFileUploaded")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125904c;

        /* renamed from: d  reason: collision with root package name */
        Object f125905d;

        /* renamed from: e  reason: collision with root package name */
        Object f125906e;

        /* renamed from: f  reason: collision with root package name */
        Object f125907f;

        /* renamed from: g  reason: collision with root package name */
        Object f125908g;

        /* renamed from: h  reason: collision with root package name */
        Object f125909h;

        /* renamed from: i  reason: collision with root package name */
        Object f125910i;

        /* renamed from: j  reason: collision with root package name */
        Object f125911j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f125912k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ g f125913l;

        /* renamed from: m  reason: collision with root package name */
        int f125914m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f125913l = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125912k = obj;
            this.f125914m |= Integer.MIN_VALUE;
            return this.f125913l.N((UUID) null, (C13208b) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {603}, m = "postUploadCleanup")
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125915c;

        /* renamed from: d  reason: collision with root package name */
        Object f125916d;

        /* renamed from: e  reason: collision with root package name */
        Object f125917e;

        /* renamed from: f  reason: collision with root package name */
        Object f125918f;

        /* renamed from: g  reason: collision with root package name */
        Object f125919g;

        /* renamed from: h  reason: collision with root package name */
        Object f125920h;

        /* renamed from: i  reason: collision with root package name */
        Object f125921i;

        /* renamed from: j  reason: collision with root package name */
        int f125922j;

        /* renamed from: k  reason: collision with root package name */
        int f125923k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f125924l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f125925m;

        /* renamed from: n  reason: collision with root package name */
        int f125926n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(g gVar, C17164e<? super k> eVar) {
            super(eVar);
            this.f125925m = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125924l = obj;
            this.f125926n |= Integer.MIN_VALUE;
            return this.f125925m.O(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {612}, m = "postUploadConfirmUploads")
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125927c;

        /* renamed from: d  reason: collision with root package name */
        Object f125928d;

        /* renamed from: e  reason: collision with root package name */
        Object f125929e;

        /* renamed from: f  reason: collision with root package name */
        Object f125930f;

        /* renamed from: g  reason: collision with root package name */
        Object f125931g;

        /* renamed from: h  reason: collision with root package name */
        Object f125932h;

        /* renamed from: i  reason: collision with root package name */
        Object f125933i;

        /* renamed from: j  reason: collision with root package name */
        int f125934j;

        /* renamed from: k  reason: collision with root package name */
        int f125935k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f125936l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f125937m;

        /* renamed from: n  reason: collision with root package name */
        int f125938n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g gVar, C17164e<? super l> eVar) {
            super(eVar);
            this.f125937m = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125936l = obj;
            this.f125938n |= Integer.MIN_VALUE;
            return this.f125937m.P(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {194}, m = "removeUploadsForDeletedScenes")
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125939c;

        /* renamed from: d  reason: collision with root package name */
        Object f125940d;

        /* renamed from: e  reason: collision with root package name */
        Object f125941e;

        /* renamed from: f  reason: collision with root package name */
        Object f125942f;

        /* renamed from: g  reason: collision with root package name */
        Object f125943g;

        /* renamed from: h  reason: collision with root package name */
        Object f125944h;

        /* renamed from: i  reason: collision with root package name */
        Object f125945i;

        /* renamed from: j  reason: collision with root package name */
        Object f125946j;

        /* renamed from: k  reason: collision with root package name */
        Object f125947k;

        /* renamed from: l  reason: collision with root package name */
        Object f125948l;

        /* renamed from: m  reason: collision with root package name */
        int f125949m;

        /* renamed from: n  reason: collision with root package name */
        int f125950n;

        /* renamed from: o  reason: collision with root package name */
        int f125951o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f125952p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ g f125953q;

        /* renamed from: r  reason: collision with root package name */
        int f125954r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(g gVar, C17164e<? super m> eVar) {
            super(eVar);
            this.f125953q = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125952p = obj;
            this.f125954r |= Integer.MIN_VALUE;
            return this.f125953q.R((List<Scene>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {169, 173, 174}, m = "removeUploadsForScenes")
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125955c;

        /* renamed from: d  reason: collision with root package name */
        Object f125956d;

        /* renamed from: e  reason: collision with root package name */
        Object f125957e;

        /* renamed from: f  reason: collision with root package name */
        Object f125958f;

        /* renamed from: g  reason: collision with root package name */
        Object f125959g;

        /* renamed from: h  reason: collision with root package name */
        Object f125960h;

        /* renamed from: i  reason: collision with root package name */
        Object f125961i;

        /* renamed from: j  reason: collision with root package name */
        Object f125962j;

        /* renamed from: k  reason: collision with root package name */
        Object f125963k;

        /* renamed from: l  reason: collision with root package name */
        Object f125964l;

        /* renamed from: m  reason: collision with root package name */
        Object f125965m;

        /* renamed from: n  reason: collision with root package name */
        Object f125966n;

        /* renamed from: o  reason: collision with root package name */
        int f125967o;

        /* renamed from: p  reason: collision with root package name */
        int f125968p;

        /* renamed from: q  reason: collision with root package name */
        int f125969q;

        /* renamed from: r  reason: collision with root package name */
        int f125970r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f125971s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ g f125972t;

        /* renamed from: u  reason: collision with root package name */
        int f125973u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(g gVar, C17164e<? super n> eVar) {
            super(eVar);
            this.f125972t = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125971s = obj;
            this.f125973u |= Integer.MIN_VALUE;
            return this.f125972t.S((List<Scene>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {537}, m = "resetUpload")
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125974c;

        /* renamed from: d  reason: collision with root package name */
        Object f125975d;

        /* renamed from: e  reason: collision with root package name */
        Object f125976e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f125977f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f125978g;

        /* renamed from: h  reason: collision with root package name */
        int f125979h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(g gVar, C17164e<? super o> eVar) {
            super(eVar);
            this.f125978g = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125977f = obj;
            this.f125979h |= Integer.MIN_VALUE;
            return this.f125978g.T((MF.e) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {642, 644, 647, 649, 659, 659}, m = "startUploadSet")
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125980c;

        /* renamed from: d  reason: collision with root package name */
        Object f125981d;

        /* renamed from: e  reason: collision with root package name */
        Object f125982e;

        /* renamed from: f  reason: collision with root package name */
        Object f125983f;

        /* renamed from: g  reason: collision with root package name */
        Object f125984g;

        /* renamed from: h  reason: collision with root package name */
        Object f125985h;

        /* renamed from: i  reason: collision with root package name */
        int f125986i;

        /* renamed from: j  reason: collision with root package name */
        boolean f125987j;

        /* renamed from: k  reason: collision with root package name */
        boolean f125988k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f125989l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f125990m;

        /* renamed from: n  reason: collision with root package name */
        int f125991n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(g gVar, C17164e<? super p> eVar) {
            super(eVar);
            this.f125990m = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f125989l = obj;
            this.f125991n |= Integer.MIN_VALUE;
            return this.f125990m.Z((MF.e) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {1038, 427, 434, 437, 455, 458, 465, 465, 465}, m = "startUploading")
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f125992c;

        /* renamed from: d  reason: collision with root package name */
        Object f125993d;

        /* renamed from: e  reason: collision with root package name */
        Object f125994e;

        /* renamed from: f  reason: collision with root package name */
        Object f125995f;

        /* renamed from: g  reason: collision with root package name */
        Object f125996g;

        /* renamed from: h  reason: collision with root package name */
        Object f125997h;

        /* renamed from: i  reason: collision with root package name */
        Object f125998i;

        /* renamed from: j  reason: collision with root package name */
        Object f125999j;

        /* renamed from: k  reason: collision with root package name */
        Object f126000k;

        /* renamed from: l  reason: collision with root package name */
        Object f126001l;

        /* renamed from: m  reason: collision with root package name */
        Object f126002m;

        /* renamed from: n  reason: collision with root package name */
        boolean f126003n;

        /* renamed from: o  reason: collision with root package name */
        int f126004o;

        /* renamed from: p  reason: collision with root package name */
        int f126005p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f126006q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ g f126007r;

        /* renamed from: s  reason: collision with root package name */
        int f126008s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(g gVar, C17164e<? super q> eVar) {
            super(eVar);
            this.f126007r = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126006q = obj;
            this.f126008s |= Integer.MIN_VALUE;
            return this.f126007r.startUploading(false, (UploadWorkerV2) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {570, 578, 585, 588, 591, 585, 588, 591}, m = "startUploadingSets")
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126009c;

        /* renamed from: d  reason: collision with root package name */
        Object f126010d;

        /* renamed from: e  reason: collision with root package name */
        Object f126011e;

        /* renamed from: f  reason: collision with root package name */
        Object f126012f;

        /* renamed from: g  reason: collision with root package name */
        Object f126013g;

        /* renamed from: h  reason: collision with root package name */
        Object f126014h;

        /* renamed from: i  reason: collision with root package name */
        Object f126015i;

        /* renamed from: j  reason: collision with root package name */
        Object f126016j;

        /* renamed from: k  reason: collision with root package name */
        int f126017k;

        /* renamed from: l  reason: collision with root package name */
        int f126018l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f126019m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g f126020n;

        /* renamed from: o  reason: collision with root package name */
        int f126021o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(g gVar, C17164e<? super r> eVar) {
            super(eVar);
            this.f126020n = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126019m = obj;
            this.f126021o |= Integer.MIN_VALUE;
            return this.f126020n.a0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {699, 715, 721, 725}, m = "syncUploadSet")
    static final class s extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126022c;

        /* renamed from: d  reason: collision with root package name */
        Object f126023d;

        /* renamed from: e  reason: collision with root package name */
        Object f126024e;

        /* renamed from: f  reason: collision with root package name */
        Object f126025f;

        /* renamed from: g  reason: collision with root package name */
        Object f126026g;

        /* renamed from: h  reason: collision with root package name */
        Object f126027h;

        /* renamed from: i  reason: collision with root package name */
        Object f126028i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f126029j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g f126030k;

        /* renamed from: l  reason: collision with root package name */
        int f126031l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(g gVar, C17164e<? super s> eVar) {
            super(eVar);
            this.f126030k = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126029j = obj;
            this.f126031l |= Integer.MIN_VALUE;
            return this.f126030k.b0((UUID) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {680}, m = "throwIfNotUnableToUpload")
    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126032c;

        /* renamed from: d  reason: collision with root package name */
        Object f126033d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f126034e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f126035f;

        /* renamed from: g  reason: collision with root package name */
        int f126036g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(g gVar, C17164e<? super t> eVar) {
            super(eVar);
            this.f126035f = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126034e = obj;
            this.f126036g |= Integer.MIN_VALUE;
            return this.f126035f.c0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {925}, m = "updateLocalSetStateAfterUploads")
    static final class u extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126037c;

        /* renamed from: d  reason: collision with root package name */
        Object f126038d;

        /* renamed from: e  reason: collision with root package name */
        Object f126039e;

        /* renamed from: f  reason: collision with root package name */
        Object f126040f;

        /* renamed from: g  reason: collision with root package name */
        Object f126041g;

        /* renamed from: h  reason: collision with root package name */
        Object f126042h;

        /* renamed from: i  reason: collision with root package name */
        int f126043i;

        /* renamed from: j  reason: collision with root package name */
        int f126044j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f126045k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ g f126046l;

        /* renamed from: m  reason: collision with root package name */
        int f126047m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(g gVar, C17164e<? super u> eVar) {
            super(eVar);
            this.f126046l = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126045k = obj;
            this.f126047m |= Integer.MIN_VALUE;
            return this.f126046l.d0((UUID) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploaderV2", f = "UploaderV2.kt", l = {789, 791, 804, 811, 812, 817}, m = "uploadFilesInSet")
    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126048c;

        /* renamed from: d  reason: collision with root package name */
        Object f126049d;

        /* renamed from: e  reason: collision with root package name */
        Object f126050e;

        /* renamed from: f  reason: collision with root package name */
        Object f126051f;

        /* renamed from: g  reason: collision with root package name */
        Object f126052g;

        /* renamed from: h  reason: collision with root package name */
        Object f126053h;

        /* renamed from: i  reason: collision with root package name */
        Object f126054i;

        /* renamed from: j  reason: collision with root package name */
        Object f126055j;

        /* renamed from: k  reason: collision with root package name */
        Object f126056k;

        /* renamed from: l  reason: collision with root package name */
        Object f126057l;

        /* renamed from: m  reason: collision with root package name */
        int f126058m;

        /* renamed from: n  reason: collision with root package name */
        int f126059n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f126060o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g f126061p;

        /* renamed from: q  reason: collision with root package name */
        int f126062q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(g gVar, C17164e<? super v> eVar) {
            super(eVar);
            this.f126061p = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126060o = obj;
            this.f126062q |= Integer.MIN_VALUE;
            return this.f126061p.g0((UUID) null, this);
        }
    }

    public g(C13187c cVar, C13309a aVar, C13313e eVar, IUploadDatabase iUploadDatabase, C13147a aVar2, C13867a aVar3, IUploadApi iUploadApi, com.sugarcube.app.base.external.config.a aVar4, C16729a<z> aVar5, UserRepo userRepo, ConfigRepository configRepository, SceneRepository sceneRepository, PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase) {
        C17542s.j(cVar, "log");
        C17542s.j(aVar, "appEnvironment");
        C17542s.j(eVar, "installationConfig");
        C17542s.j(iUploadDatabase, "database");
        C17542s.j(aVar2, "captureFiles");
        C17542s.j(aVar3, "eventLog");
        C17542s.j(iUploadApi, "uploadApi");
        C17542s.j(aVar4, "config");
        C17542s.j(aVar5, "fileUploadClientProvider");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(configRepository, "configRepo");
        C17542s.j(sceneRepository, "sceneRepo");
        C17542s.j(privacyPolicyConsentUseCase, "privacyPolicyConsentUseCase");
        this.f125776a = cVar;
        this.f125777b = aVar;
        this.f125778c = eVar;
        this.f125779d = iUploadDatabase;
        this.f125780e = aVar2;
        this.f125781f = aVar3;
        this.f125782g = iUploadApi;
        this.f125783h = aVar4;
        this.f125784i = aVar5;
        this.f125785j = userRepo;
        this.f125786k = configRepository;
        this.f125787l = sceneRepository;
        this.f125788m = privacyPolicyConsentUseCase;
        K(new a(this, (C17164e<? super a>) null));
        K(new b(this, (C17164e<? super b>) null));
        K(new c(this, (C17164e<? super c>) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C(dI.C17164e<? super XH.C16807N> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.sugarcube.app.base.upload.g.f
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.sugarcube.app.base.upload.g$f r0 = (com.sugarcube.app.base.upload.g.f) r0
            int r1 = r0.f125848n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f125848n = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.upload.g$f r0 = new com.sugarcube.app.base.upload.g$f
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f125846l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f125848n
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004f
            if (r3 != r5) goto L_0x0047
            int r12 = r0.f125844j
            java.lang.Object r3 = r0.f125843i
            MF.e r3 = (MF.e) r3
            java.lang.Object r3 = r0.f125841g
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r6 = r0.f125840f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r7 = r0.f125839e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.f125838d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r0.f125837c
            com.sugarcube.app.base.upload.g r9 = (com.sugarcube.app.base.upload.g) r9
            XH.y.b(r1)
            r1 = r0
            r0 = r12
            r12 = r8
            goto L_0x0086
        L_0x0047:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x004f:
            XH.y.b(r1)
            com.sugarcube.app.base.upload.IUploadDatabase r1 = r11.f125779d
            java.util.List r1 = r1.getAllUploadSets()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0063:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x007c
            java.lang.Object r6 = r1.next()
            r7 = r6
            MF.e r7 = (MF.e) r7
            MF.f r7 = r7.g()
            MF.f r8 = MF.f.Failed
            if (r7 != r8) goto L_0x0063
            r3.add(r6)
            goto L_0x0063
        L_0x007c:
            java.util.Iterator r1 = r3.iterator()
            r9 = r11
            r6 = r3
            r7 = r6
            r3 = r1
            r1 = r0
            r0 = r4
        L_0x0086:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00ae
            java.lang.Object r8 = r3.next()
            r10 = r8
            MF.e r10 = (MF.e) r10
            r1.f125837c = r9
            r1.f125838d = r12
            r1.f125839e = r7
            r1.f125840f = r6
            r1.f125841g = r3
            r1.f125842h = r8
            r1.f125843i = r10
            r1.f125844j = r0
            r1.f125845k = r4
            r1.f125848n = r5
            java.lang.Object r8 = r9.T(r10, r1)
            if (r8 != r2) goto L_0x0086
            return r2
        L_0x00ae:
            XH.N r12 = XH.C16807N.f139792a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.C(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D(java.util.UUID r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.sugarcube.app.base.upload.g.C3079g
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.sugarcube.app.base.upload.g$g r0 = (com.sugarcube.app.base.upload.g.C3079g) r0
            int r1 = r0.f125854h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f125854h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.upload.g$g r0 = new com.sugarcube.app.base.upload.g$g
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f125852f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f125854h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r13 = r0.f125851e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f125850d
            java.util.UUID r13 = (java.util.UUID) r13
            java.lang.Object r14 = r0.f125849c
            com.sugarcube.app.base.upload.g r14 = (com.sugarcube.app.base.upload.g) r14
            XH.y.b(r1)
            goto L_0x006a
        L_0x0035:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003d:
            XH.y.b(r1)
            LF.c r5 = r12.f125776a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ">> confirming "
            r1.append(r3)
            r1.append(r13)
            java.lang.String r6 = r1.toString()
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            LF.C13187c.e(r5, r6, r7, r8, r9, r10)
            r0.f125849c = r12
            r0.f125850d = r13
            r0.f125851e = r14
            r0.f125854h = r4
            java.lang.Object r1 = r12.b0(r13, r0)
            if (r1 != r2) goto L_0x0069
            return r2
        L_0x0069:
            r14 = r12
        L_0x006a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x008f
            LF.c r1 = r14.f125776a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "<< confirming "
            r14.append(r0)
            r14.append(r13)
            java.lang.String r2 = r14.toString()
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            LF.C13187c.e(r1, r2, r3, r4, r5, r6)
            XH.N r13 = XH.C16807N.f139792a
            return r13
        L_0x008f:
            LF.c r0 = r14.f125776a
            r4 = 6
            r5 = 0
            java.lang.String r1 = ">> confirming failed somehow"
            r2 = 0
            r3 = 0
            LF.C13187c.e(r0, r1, r2, r3, r4, r5)
            KF.f r14 = new KF.f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "confirming failed "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r7 = r0.toString()
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.D(java.util.UUID, dI.e):java.lang.Object");
    }

    private final Map<UploadURL, String> E(UUID uuid) {
        Iterable<C13208b> filesInSet = this.f125779d.getFilesInSet(uuid);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(filesInSet, 10)), 16));
        for (C13208b bVar : filesInSet) {
            XH.v a10 = C16796C.a(this.f125780e.g(new File(bVar.e())), bVar.e());
            linkedHashMap.put(a10.c(), a10.d());
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: MF.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: KF.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: KF.f} */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F(java.util.List<MF.e> r31, dI.C17164e<? super XH.C16807N> r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            boolean r2 = r1 instanceof com.sugarcube.app.base.upload.g.h
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.app.base.upload.g$h r2 = (com.sugarcube.app.base.upload.g.h) r2
            int r3 = r2.f125869O
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f125869O = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.upload.g$h r2 = new com.sugarcube.app.base.upload.g$h
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f125867M
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f125869O
            r6 = 2
            r8 = 1
            if (r5 == 0) goto L_0x00ca
            if (r5 == r8) goto L_0x00b9
            if (r5 != r6) goto L_0x00b1
            int r1 = r2.f125863I
            java.lang.Object r5 = r2.f125862H
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r5 = r2.f125861G
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125860F
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125859E
            com.sugarcube.core.network.models.SessionMeta r5 = (com.sugarcube.core.network.models.SessionMeta) r5
            java.lang.Object r5 = r2.f125858D
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125857C
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125856B
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125855A
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125893z
            com.sugarcube.core.network.models.CreateSceneRequest r5 = (com.sugarcube.core.network.models.CreateSceneRequest) r5
            java.lang.Object r5 = r2.f125892y
            com.sugarcube.core.network.models.CreateSceneRequest r5 = (com.sugarcube.core.network.models.CreateSceneRequest) r5
            java.lang.Object r5 = r2.f125891x
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.lang.Object r5 = r2.f125890w
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r5 = r2.f125889v
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125888u
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125887t
            com.sugarcube.core.network.models.SessionMeta r5 = (com.sugarcube.core.network.models.SessionMeta) r5
            java.lang.Object r5 = r2.f125886s
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125885r
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125884q
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125883p
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125881n
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r5 = r2.f125880m
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r5 = r2.f125879l
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r5 = r2.f125878k
            com.sugarcube.core.network.models.SessionMeta r5 = (com.sugarcube.core.network.models.SessionMeta) r5
            java.lang.Object r5 = r2.f125877j
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r2.f125876i
            MF.e r5 = (MF.e) r5
            java.lang.Object r9 = r2.f125874g
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r2.f125873f
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r11 = r2.f125872e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r2.f125871d
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r2.f125870c
            com.sugarcube.app.base.upload.g r13 = (com.sugarcube.app.base.upload.g) r13
            XH.y.b(r3)
            r7 = r1
            r1 = r6
            r28 = r9
            r0 = 0
            r9 = r5
            goto L_0x0204
        L_0x00b1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x00b9:
            java.lang.Object r1 = r2.f125872e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f125871d
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r9 = r2.f125870c
            com.sugarcube.app.base.upload.g r9 = (com.sugarcube.app.base.upload.g) r9
            XH.y.b(r3)
            r3 = r5
            goto L_0x00ea
        L_0x00ca:
            XH.y.b(r3)
            LF.c r10 = r0.f125776a
            r14 = 6
            r15 = 0
            java.lang.String r11 = "createScenes"
            r12 = 0
            r13 = 0
            LF.C13187c.e(r10, r11, r12, r13, r14, r15)
            r2.f125870c = r0
            r3 = r31
            r2.f125871d = r3
            r2.f125872e = r1
            r2.f125869O = r8
            java.lang.Object r5 = r0.c0(r2)
            if (r5 != r4) goto L_0x00e9
            return r4
        L_0x00e9:
            r9 = r0
        L_0x00ea:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x00fb
            LF.c r10 = r9.f125776a
            r14 = 6
            r15 = 0
            java.lang.String r11 = "no scenes to create"
            r12 = 0
            r13 = 0
            LF.C13187c.e(r10, r11, r12, r13, r14, r15)
        L_0x00fb:
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r10 = r5.iterator()
            r11 = r1
            r12 = r3
            r13 = r9
            r9 = r10
            r1 = 0
            r10 = r5
        L_0x0108:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x02a8
            java.lang.Object r3 = r9.next()
            r5 = r3
            MF.e r5 = (MF.e) r5
            KF.a r14 = r13.f125780e
            java.util.UUID r15 = r5.c()
            com.sugarcube.core.network.models.SessionMeta r14 = r14.k(r15)
            if (r14 == 0) goto L_0x029b
            KF.a r15 = r13.f125780e
            java.util.UUID r8 = r5.c()
            java.lang.String r6 = "capture_meta.json"
            java.lang.String r6 = r15.h(r8, r6)
            java.util.UUID r8 = r5.i()
            if (r8 == 0) goto L_0x028e
            java.lang.String r15 = r5.d()
            java.lang.String r7 = r5.e()
            java.lang.String r0 = r14.getCaptureTimestamp()
            r26 = r4
            OE.e r4 = r13.f125778c
            java.lang.String r4 = r4.b()
            r31 = r1
            java.lang.String r1 = "com.ingka.ikea"
            r32 = r5
            r5 = 0
            r27 = r3
            r28 = r9
            r3 = 2
            r9 = 0
            boolean r1 = HJ.C15854t.W(r4, r1, r9, r3, r5)
            if (r1 == 0) goto L_0x015d
            java.lang.String r1 = "ikea"
            goto L_0x015e
        L_0x015d:
            r1 = r5
        L_0x015e:
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r13.f125786k
            com.sugarcube.app.base.data.feature.ConfigItems$CustomPipeline r4 = com.sugarcube.app.base.data.feature.ConfigItems.CustomPipeline.INSTANCE
            java.lang.Object r3 = r3.getBlocking(r4)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            int r9 = r4.length()
            if (r9 <= 0) goto L_0x0171
            r9 = 1
            goto L_0x0172
        L_0x0171:
            r9 = 0
        L_0x0172:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r9)
            boolean r16 = r9.booleanValue()
            if (r16 == 0) goto L_0x017d
            r5 = r3
        L_0x017d:
            java.lang.String r5 = (java.lang.String) r5
            r29 = r9
            com.sugarcube.core.network.models.CreateSceneRequest r9 = new com.sugarcube.core.network.models.CreateSceneRequest
            r25 = 0
            r16 = r9
            r17 = r8
            r18 = r15
            r19 = r7
            r20 = r14
            r21 = r6
            r22 = r0
            r23 = r1
            r24 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r16 = r5
            com.sugarcube.app.base.upload.IUploadApi r5 = r13.f125782g
            r2.f125870c = r13
            r2.f125871d = r12
            r2.f125872e = r11
            r2.f125873f = r10
            r17 = r10
            r10 = r28
            r2.f125874g = r10
            r10 = r27
            r2.f125875h = r10
            r10 = r32
            r2.f125876i = r10
            r2.f125877j = r6
            r2.f125878k = r14
            r2.f125879l = r8
            r2.f125880m = r8
            r2.f125881n = r8
            r2.f125882o = r3
            r2.f125883p = r4
            r2.f125884q = r1
            r2.f125885r = r0
            r2.f125886s = r6
            r2.f125887t = r14
            r2.f125888u = r7
            r2.f125889v = r15
            r2.f125890w = r8
            r3 = r29
            r2.f125891x = r3
            r2.f125892y = r9
            r2.f125893z = r9
            r3 = r16
            r2.f125855A = r3
            r2.f125856B = r1
            r2.f125857C = r0
            r2.f125858D = r6
            r2.f125859E = r14
            r2.f125860F = r7
            r2.f125861G = r15
            r2.f125862H = r8
            r7 = r31
            r2.f125863I = r7
            r0 = 0
            r2.f125864J = r0
            r2.f125865K = r0
            r2.f125866L = r0
            r1 = 2
            r2.f125869O = r1
            java.lang.Object r3 = r5.createScene(r9, r2)
            r4 = r26
            if (r3 != r4) goto L_0x0201
            return r4
        L_0x0201:
            r9 = r10
            r10 = r17
        L_0x0204:
            com.sugarcube.app.base.network.ApiResponse r3 = (com.sugarcube.app.base.network.ApiResponse) r3
            boolean r5 = r3 instanceof com.sugarcube.app.base.network.ApiResponse.Failure
            if (r5 == 0) goto L_0x0238
            LF.c r1 = r13.f125776a
            LF.a$a$b r2 = new LF.a$a$b
            java.util.UUID r4 = r13.f125791p
            if (r4 != 0) goto L_0x0214
            r10 = 1
            goto L_0x0215
        L_0x0214:
            r10 = r0
        L_0x0215:
            r13 = 8
            r14 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = 1
            r1.b(r2, r0)
            com.sugarcube.app.base.network.ApiResponse$Failure r3 = (com.sugarcube.app.base.network.ApiResponse.Failure) r3
            java.lang.Exception r0 = r3.getCause()
            if (r0 == 0) goto L_0x022b
            goto L_0x0237
        L_0x022b:
            KF.f r0 = new KF.f
            r5 = 6
            r6 = 0
            java.lang.String r2 = "API call to createScene failed"
            r3 = 0
            r4 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0237:
            throw r0
        L_0x0238:
            boolean r5 = r3 instanceof com.sugarcube.app.base.network.ApiResponse.Success
            if (r5 == 0) goto L_0x0288
            com.sugarcube.app.base.network.ApiResponse$Success r3 = (com.sugarcube.app.base.network.ApiResponse.Success) r3
            java.lang.Object r3 = r3.body()
            com.sugarcube.core.network.models.SceneResponse r3 = (com.sugarcube.core.network.models.SceneResponse) r3
            if (r3 == 0) goto L_0x0277
            com.sugarcube.app.base.upload.IUploadDatabase r5 = r13.f125779d
            java.util.UUID r6 = r9.c()
            java.util.UUID r8 = r3.getSceneUuid()
            r5.updateSetSceneCreated(r6, r8)
            LF.c r5 = r13.f125776a
            LF.a$a$b r6 = new LF.a$a$b
            java.util.UUID r8 = r13.f125791p
            if (r8 != 0) goto L_0x025d
            r8 = 1
            goto L_0x025e
        L_0x025d:
            r8 = r0
        L_0x025e:
            java.util.UUID r3 = r3.getSceneUuid()
            r14 = 1
            r6.<init>(r9, r8, r14, r3)
            r5.b(r6, r14)
            com.sugarcube.app.base.data.SceneRepository r3 = r13.f125787l
            r3.startSyncWorker()
            r0 = r30
            r6 = r1
            r1 = r7
            r8 = r14
            r9 = r28
            goto L_0x0108
        L_0x0277:
            KF.f r0 = new KF.f
            r19 = 6
            r20 = 0
            java.lang.String r16 = "API call to createScene - bad body"
            r17 = 0
            r18 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            throw r0
        L_0x0288:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x028e:
            KF.f r0 = new KF.f
            r5 = 6
            r6 = 0
            java.lang.String r2 = "uploadUuid missing"
            r3 = 0
            r4 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            throw r0
        L_0x029b:
            KF.f r0 = new KF.f
            r11 = 6
            r12 = 0
            java.lang.String r8 = "SessionMeta corrupt or missing"
            r9 = 0
            r10 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            throw r0
        L_0x02a8:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.F(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: dI.e<? super XH.N>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object G(java.util.UUID r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.sugarcube.app.base.upload.g.i
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.sugarcube.app.base.upload.g$i r0 = (com.sugarcube.app.base.upload.g.i) r0
            int r1 = r0.f125903l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f125903l = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.upload.g$i r0 = new com.sugarcube.app.base.upload.g$i
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f125901j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f125903l
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0082
            if (r3 == r6) goto L_0x0071
            if (r3 == r5) goto L_0x0054
            if (r3 != r4) goto L_0x004c
            java.lang.Object r14 = r0.f125900i
            com.sugarcube.core.network.models.UploadSetState r14 = (com.sugarcube.core.network.models.UploadSetState) r14
            java.lang.Object r14 = r0.f125899h
            com.sugarcube.app.base.network.ApiResponse r14 = (com.sugarcube.app.base.network.ApiResponse) r14
            java.lang.Object r14 = r0.f125898g
            com.sugarcube.core.network.models.CreateUploadSetRequest r14 = (com.sugarcube.core.network.models.CreateUploadSetRequest) r14
            java.lang.Object r14 = r0.f125897f
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r14 = r0.f125896e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f125895d
            java.util.UUID r14 = (java.util.UUID) r14
            java.lang.Object r14 = r0.f125894c
            com.sugarcube.app.base.upload.g r14 = (com.sugarcube.app.base.upload.g) r14
            XH.y.b(r1)
            goto L_0x0123
        L_0x004c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0054:
            java.lang.Object r14 = r0.f125899h
            com.sugarcube.core.network.models.SessionMeta r14 = (com.sugarcube.core.network.models.SessionMeta) r14
            java.lang.Object r14 = r0.f125898g
            com.sugarcube.core.network.models.CreateUploadSetRequest r14 = (com.sugarcube.core.network.models.CreateUploadSetRequest) r14
            java.lang.Object r15 = r0.f125897f
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r3 = r0.f125896e
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r5 = r0.f125895d
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r6 = r0.f125894c
            com.sugarcube.app.base.upload.g r6 = (com.sugarcube.app.base.upload.g) r6
            XH.y.b(r1)
            goto L_0x00fc
        L_0x0071:
            java.lang.Object r14 = r0.f125896e
            r15 = r14
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r14 = r0.f125895d
            java.util.UUID r14 = (java.util.UUID) r14
            java.lang.Object r3 = r0.f125894c
            com.sugarcube.app.base.upload.g r3 = (com.sugarcube.app.base.upload.g) r3
            XH.y.b(r1)
            goto L_0x00b3
        L_0x0082:
            XH.y.b(r1)
            LF.c r7 = r13.f125776a
            java.lang.String r1 = LF.C13186b.a(r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "create upload set for "
            r3.append(r8)
            r3.append(r1)
            java.lang.String r8 = r3.toString()
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            LF.C13187c.e(r7, r8, r9, r10, r11, r12)
            r0.f125894c = r13
            r0.f125895d = r14
            r0.f125896e = r15
            r0.f125903l = r6
            java.lang.Object r1 = r13.c0(r0)
            if (r1 != r2) goto L_0x00b2
            return r2
        L_0x00b2:
            r3 = r13
        L_0x00b3:
            java.util.Map r1 = r3.E(r14)
            com.sugarcube.core.network.models.CreateUploadSetRequest r7 = new com.sugarcube.core.network.models.CreateUploadSetRequest
            java.util.Set r8 = r1.keySet()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = YH.C16877v.t1(r8)
            java.lang.String r9 = r14.toString()
            KF.a r10 = r3.f125780e
            com.sugarcube.core.network.models.SessionMeta r10 = r10.k(r14)
            if (r10 == 0) goto L_0x00da
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            java.util.UUID r11 = r3.f125791p
            com.sugarcube.core.network.models.UploadProperties r6 = com.sugarcube.core.network.models.UploadModelsKt.toUploadProperties(r10, r6, r11)
            goto L_0x00db
        L_0x00da:
            r6 = 0
        L_0x00db:
            r11 = 0
            r7.<init>(r8, r9, r11, r6)
            com.sugarcube.app.base.upload.IUploadApi r6 = r3.f125782g
            r0.f125894c = r3
            r0.f125895d = r14
            r0.f125896e = r15
            r0.f125897f = r1
            r0.f125898g = r7
            r0.f125899h = r10
            r0.f125903l = r5
            java.lang.Object r5 = r6.createUploadSet(r7, r0)
            if (r5 != r2) goto L_0x00f6
            return r2
        L_0x00f6:
            r6 = r3
            r3 = r15
            r15 = r1
            r1 = r5
            r5 = r14
            r14 = r7
        L_0x00fc:
            r10 = r1
            com.sugarcube.app.base.network.ApiResponse r10 = (com.sugarcube.app.base.network.ApiResponse) r10
            java.lang.Object r1 = r10.body()
            com.sugarcube.core.network.models.UploadSetState r1 = (com.sugarcube.core.network.models.UploadSetState) r1
            r6.L(r1)
            if (r1 == 0) goto L_0x0126
            com.sugarcube.app.base.upload.IUploadDatabase r7 = r6.f125779d
            r0.f125894c = r6
            r0.f125895d = r5
            r0.f125896e = r3
            r0.f125897f = r15
            r0.f125898g = r14
            r0.f125899h = r10
            r0.f125900i = r1
            r0.f125903l = r4
            java.lang.Object r14 = r7.syncRemoteData(r5, r15, r1, r0)
            if (r14 != r2) goto L_0x0123
            return r2
        L_0x0123:
            XH.N r14 = XH.C16807N.f139792a
            return r14
        L_0x0126:
            KF.f r14 = new KF.f
            r11 = 2
            r12 = 0
            java.lang.String r8 = "createUploadSet"
            r9 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.G(java.util.UUID, dI.e):java.lang.Object");
    }

    private final int H() {
        return ((Number) this.f125789n.getValue()).intValue();
    }

    private final boolean I() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Object next : this.f125779d.getAllUploadSets()) {
                MF.e eVar = (MF.e) next;
                if (!eVar.g().b() && eVar.g() != MF.f.Failed) {
                    arrayList.add(next);
                }
            }
            return !arrayList.isEmpty();
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean J(Long l10) {
        if (l10 == null) {
            return true;
        }
        C15906b.a aVar = C15906b.f135496b;
        return System.currentTimeMillis() - l10.longValue() > C15906b.K(C15908d.s(2, C15909e.HOURS));
    }

    private final F0 K(nI.p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        return C16314k.d(this.f125777b.b(), this.f125777b.e(), (T) null, pVar, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final int M(g gVar) {
        return ((Integer) gVar.f125786k.getBlocking(ConfigItems.UploadV2SetRetryCount.INSTANCE)).intValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N(java.util.UUID r21, MF.C13208b r22, dI.C17164e<? super XH.C16807N> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            boolean r3 = r2 instanceof com.sugarcube.app.base.upload.g.j
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.sugarcube.app.base.upload.g$j r3 = (com.sugarcube.app.base.upload.g.j) r3
            int r4 = r3.f125914m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f125914m = r4
            goto L_0x001e
        L_0x0019:
            com.sugarcube.app.base.upload.g$j r3 = new com.sugarcube.app.base.upload.g$j
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f125912k
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f125914m
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x0083
            if (r6 == r8) goto L_0x005b
            if (r6 != r7) goto L_0x0053
            java.lang.Object r1 = r3.f125911j
            com.sugarcube.app.base.network.ApiResponse r1 = (com.sugarcube.app.base.network.ApiResponse) r1
            java.lang.Object r1 = r3.f125910i
            com.sugarcube.app.base.network.ApiResponse r1 = (com.sugarcube.app.base.network.ApiResponse) r1
            java.lang.Object r1 = r3.f125909h
            com.sugarcube.core.network.models.UploadURL r1 = (com.sugarcube.core.network.models.UploadURL) r1
            java.lang.Object r1 = r3.f125908g
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r3.f125907f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f125906e
            MF.b r1 = (MF.C13208b) r1
            java.lang.Object r1 = r3.f125905d
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r3.f125904c
            com.sugarcube.app.base.upload.g r1 = (com.sugarcube.app.base.upload.g) r1
            XH.y.b(r4)
            goto L_0x00ff
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005b:
            java.lang.Object r1 = r3.f125910i
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r3.f125909h
            com.sugarcube.core.network.models.UploadURL r1 = (com.sugarcube.core.network.models.UploadURL) r1
            java.lang.Object r2 = r3.f125908g
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r6 = r3.f125907f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r8 = r3.f125906e
            MF.b r8 = (MF.C13208b) r8
            java.lang.Object r9 = r3.f125905d
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.Object r10 = r3.f125904c
            com.sugarcube.app.base.upload.g r10 = (com.sugarcube.app.base.upload.g) r10
            XH.y.b(r4)
            r19 = r6
            r6 = r1
            r1 = r9
            r9 = r4
            r4 = r2
            r2 = r19
            goto L_0x00d7
        L_0x0083:
            XH.y.b(r4)
            com.sugarcube.app.base.upload.IUploadDatabase r4 = r0.f125779d
            MF.e r4 = r4.getUploadSet(r1)
            if (r4 == 0) goto L_0x0120
            java.util.UUID r4 = r4.i()
            if (r4 == 0) goto L_0x0120
            com.sugarcube.core.network.models.UploadURL r6 = new com.sugarcube.core.network.models.UploadURL
            java.lang.String r10 = r22.g()
            java.lang.String r11 = r22.c()
            java.lang.String r12 = r22.b()
            java.lang.String r13 = r22.j()
            MF.c r9 = r22.f()
            boolean r14 = r9.b()
            r17 = 96
            r18 = 0
            r15 = 0
            r16 = 0
            r9 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.sugarcube.app.base.upload.IUploadApi r9 = r0.f125782g
            r3.f125904c = r0
            r3.f125905d = r1
            r10 = r22
            r3.f125906e = r10
            r3.f125907f = r2
            r3.f125908g = r4
            r3.f125909h = r6
            r3.f125910i = r4
            r3.f125914m = r8
            java.lang.Object r8 = r9.uploadNotify(r6, r4, r3)
            if (r8 != r5) goto L_0x00d4
            return r5
        L_0x00d4:
            r9 = r8
            r8 = r10
            r10 = r0
        L_0x00d7:
            com.sugarcube.app.base.network.ApiResponse r9 = (com.sugarcube.app.base.network.ApiResponse) r9
            boolean r11 = r9 instanceof com.sugarcube.app.base.network.ApiResponse.Failure
            if (r11 != 0) goto L_0x0113
            boolean r11 = r9 instanceof com.sugarcube.app.base.network.ApiResponse.Success
            if (r11 == 0) goto L_0x010d
            com.sugarcube.app.base.upload.IUploadDatabase r11 = r10.f125779d
            MF.c r12 = MF.C13209c.UploadedAndNotified
            r3.f125904c = r10
            r3.f125905d = r1
            r3.f125906e = r8
            r3.f125907f = r2
            r3.f125908g = r4
            r3.f125909h = r6
            r3.f125910i = r9
            r3.f125911j = r9
            r3.f125914m = r7
            java.lang.Object r1 = r11.updateFileState(r8, r12, r3)
            if (r1 != r5) goto L_0x00fe
            return r5
        L_0x00fe:
            r1 = r10
        L_0x00ff:
            LF.c r2 = r1.f125776a
            r6 = 6
            r7 = 0
            java.lang.String r3 = "  << notified"
            r4 = 0
            r5 = 0
            LF.C13187c.e(r2, r3, r4, r5, r6, r7)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x010d:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0113:
            KF.f r1 = new KF.f
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Failed to notify file upload"
            r4 = 0
            r5 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            throw r1
        L_0x0120:
            KF.f r1 = new KF.f
            r12 = 6
            r13 = 0
            java.lang.String r9 = "notify: missing upload set"
            r10 = 0
            r11 = 0
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.N(java.util.UUID, MF.b, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(dI.C17164e<? super XH.C16807N> r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof com.sugarcube.app.base.upload.g.k
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.app.base.upload.g$k r2 = (com.sugarcube.app.base.upload.g.k) r2
            int r3 = r2.f125926n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f125926n = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.upload.g$k r2 = new com.sugarcube.app.base.upload.g$k
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f125924l
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f125926n
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0053
            if (r5 != r7) goto L_0x004b
            int r1 = r2.f125922j
            java.lang.Object r5 = r2.f125921i
            MF.e r5 = (MF.e) r5
            java.lang.Object r5 = r2.f125919g
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r8 = r2.f125918f
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r9 = r2.f125917e
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r2.f125916d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f125915c
            com.sugarcube.app.base.upload.g r11 = (com.sugarcube.app.base.upload.g) r11
            XH.y.b(r3)
            r3 = r2
            r2 = r1
            r1 = r10
            goto L_0x009d
        L_0x004b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0053:
            XH.y.b(r3)
            LF.c r8 = r0.f125776a
            r12 = 6
            r13 = 0
            java.lang.String r9 = "XXXX postUploadCleanup"
            r10 = 0
            r11 = 0
            LF.C13187c.e(r8, r9, r10, r11, r12, r13)
            com.sugarcube.app.base.upload.IUploadDatabase r3 = r0.f125779d
            java.util.List r3 = r3.getAllUploadSets()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0072:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0093
            java.lang.Object r8 = r3.next()
            r9 = r8
            MF.e r9 = (MF.e) r9
            MF.f r10 = r9.g()
            MF.f r11 = MF.f.UploadConfirmed
            if (r10 == r11) goto L_0x0072
            MF.f r9 = r9.g()
            MF.f r10 = MF.f.Failed
            if (r9 == r10) goto L_0x0072
            r5.add(r8)
            goto L_0x0072
        L_0x0093:
            java.util.Iterator r3 = r5.iterator()
            r11 = r0
            r8 = r5
            r9 = r8
            r5 = r3
            r3 = r2
            r2 = r6
        L_0x009d:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x00e6
            java.lang.Object r10 = r5.next()
            r12 = r10
            MF.e r12 = (MF.e) r12
            LF.c r13 = r11.f125776a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "unconfirmedSet: "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r14 = r14.toString()
            r17 = 6
            r18 = 0
            r15 = 0
            r16 = 0
            LF.C13187c.e(r13, r14, r15, r16, r17, r18)
            java.util.UUID r13 = r12.c()
            r3.f125915c = r11
            r3.f125916d = r1
            r3.f125917e = r9
            r3.f125918f = r8
            r3.f125919g = r5
            r3.f125920h = r10
            r3.f125921i = r12
            r3.f125922j = r2
            r3.f125923k = r6
            r3.f125926n = r7
            java.lang.Object r10 = r11.d0(r13, r3)
            if (r10 != r4) goto L_0x009d
            return r4
        L_0x00e6:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.O(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object P(dI.C17164e<? super XH.C16807N> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.sugarcube.app.base.upload.g.l
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sugarcube.app.base.upload.g$l r0 = (com.sugarcube.app.base.upload.g.l) r0
            int r1 = r0.f125938n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f125938n = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.upload.g$l r0 = new com.sugarcube.app.base.upload.g$l
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f125936l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f125938n
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004f
            if (r3 != r5) goto L_0x0047
            int r13 = r0.f125934j
            java.lang.Object r3 = r0.f125933i
            MF.e r3 = (MF.e) r3
            java.lang.Object r3 = r0.f125931g
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r6 = r0.f125930f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r7 = r0.f125929e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.f125928d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r0.f125927c
            com.sugarcube.app.base.upload.g r9 = (com.sugarcube.app.base.upload.g) r9
            XH.y.b(r1)
            r1 = r0
            r0 = r13
            r13 = r8
            goto L_0x0086
        L_0x0047:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x004f:
            XH.y.b(r1)
            com.sugarcube.app.base.upload.IUploadDatabase r1 = r12.f125779d
            java.util.List r1 = r1.getAllUploadSets()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0063:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x007c
            java.lang.Object r6 = r1.next()
            r7 = r6
            MF.e r7 = (MF.e) r7
            MF.f r7 = r7.g()
            MF.f r8 = MF.f.Uploaded
            if (r7 != r8) goto L_0x0063
            r3.add(r6)
            goto L_0x0063
        L_0x007c:
            java.util.Iterator r1 = r3.iterator()
            r9 = r12
            r6 = r3
            r7 = r6
            r3 = r1
            r1 = r0
            r0 = r4
        L_0x0086:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r3.next()
            r10 = r8
            MF.e r10 = (MF.e) r10
            java.util.UUID r11 = r10.c()
            r1.f125927c = r9
            r1.f125928d = r13
            r1.f125929e = r7
            r1.f125930f = r6
            r1.f125931g = r3
            r1.f125932h = r8
            r1.f125933i = r10
            r1.f125934j = r0
            r1.f125935k = r4
            r1.f125938n = r5
            java.lang.Object r8 = r9.D(r11, r1)
            if (r8 != r2) goto L_0x0086
            return r2
        L_0x00b2:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.P(dI.e):java.lang.Object");
    }

    private final Object Q(C17164e<? super C16807N> eVar) {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f125779d.getAllUploadSets()) {
            MF.e eVar2 = (MF.e) next;
            if (eVar2.g() == MF.f.UploadConfirmed && eVar2.f() == null) {
                arrayList.add(next);
            }
        }
        Object F10 = F(arrayList, eVar);
        return F10 == C17187b.f() ? F10 : C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: MF.e} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(java.util.List<com.sugarcube.app.base.data.database.Scene> r25, dI.C17164e<? super XH.C16807N> r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            boolean r2 = r1 instanceof com.sugarcube.app.base.upload.g.m
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.app.base.upload.g$m r2 = (com.sugarcube.app.base.upload.g.m) r2
            int r3 = r2.f125954r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f125954r = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.upload.g$m r2 = new com.sugarcube.app.base.upload.g$m
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f125952p
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f125954r
            r7 = 1
            if (r5 == 0) goto L_0x005d
            if (r5 != r7) goto L_0x0055
            int r1 = r2.f125949m
            java.lang.Object r5 = r2.f125948l
            com.sugarcube.app.base.data.database.Scene r5 = (com.sugarcube.app.base.data.database.Scene) r5
            java.lang.Object r5 = r2.f125947k
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r5 = r2.f125946j
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r5 = r2.f125945i
            MF.e r5 = (MF.e) r5
            java.lang.Object r8 = r2.f125943g
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r2.f125942f
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r10 = r2.f125941e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f125940d
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.f125939c
            com.sugarcube.app.base.upload.g r12 = (com.sugarcube.app.base.upload.g) r12
            XH.y.b(r3)
            r6 = 0
            goto L_0x00f8
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005d:
            XH.y.b(r3)
            com.sugarcube.app.base.upload.IUploadDatabase r3 = r0.f125779d
            java.util.List r3 = r3.getAllUploadSets()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r5 = r3.iterator()
            r12 = r0
            r9 = r3
            r8 = r5
            r3 = 0
            r5 = r2
            r2 = r1
            r1 = r25
        L_0x0074:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x013e
            java.lang.Object r10 = r8.next()
            r11 = r10
            MF.e r11 = (MF.e) r11
            r13 = r1
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r14 = r13.iterator()
        L_0x0088:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00a7
            java.lang.Object r15 = r14.next()
            r16 = r15
            com.sugarcube.app.base.data.database.Scene r16 = (com.sugarcube.app.base.data.database.Scene) r16
            java.util.UUID r7 = r16.getSceneUuid()
            java.util.UUID r6 = r11.c()
            boolean r6 = kotlin.jvm.internal.C17542s.e(r7, r6)
            if (r6 == 0) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            r7 = 1
            goto L_0x0088
        L_0x00a7:
            r15 = 0
        L_0x00a8:
            com.sugarcube.app.base.data.database.Scene r15 = (com.sugarcube.app.base.data.database.Scene) r15
            if (r15 != 0) goto L_0x010f
            LF.c r6 = r12.f125776a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "scene not found for uploadSet: "
            r7.append(r0)
            r7.append(r11)
            java.lang.String r19 = r7.toString()
            r22 = 6
            r23 = 0
            r20 = 0
            r21 = 0
            r18 = r6
            LF.C13187c.e(r18, r19, r20, r21, r22, r23)
            com.sugarcube.app.base.upload.IUploadDatabase r0 = r12.f125779d
            r5.f125939c = r12
            r5.f125940d = r1
            r5.f125941e = r2
            r5.f125942f = r9
            r5.f125943g = r8
            r5.f125944h = r10
            r5.f125945i = r11
            r5.f125946j = r13
            r5.f125947k = r14
            r5.f125948l = r15
            r5.f125949m = r3
            r6 = 0
            r5.f125950n = r6
            r5.f125951o = r6
            r7 = 1
            r5.f125954r = r7
            java.lang.Object r0 = r0.deleteSet(r11, r5)
            if (r0 != r4) goto L_0x00f3
            return r4
        L_0x00f3:
            r10 = r2
            r2 = r5
            r5 = r11
            r11 = r1
            r1 = r3
        L_0x00f8:
            LF.c r0 = r12.f125776a
            LF.a$a$c r3 = new LF.a$a$c
            java.util.UUID r7 = r12.f125791p
            if (r7 != 0) goto L_0x0102
            r7 = 1
            goto L_0x0103
        L_0x0102:
            r7 = r6
        L_0x0103:
            r3.<init>(r5, r7)
            r7 = 1
            r0.b(r3, r7)
            r3 = r1
            r5 = r2
            r2 = r10
            r1 = r11
            goto L_0x013a
        L_0x010f:
            r6 = 0
            r7 = 1
            LF.c r13 = r12.f125776a
            java.util.UUID r0 = r15.getSceneUuid()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "scene["
            r10.append(r14)
            r10.append(r0)
            java.lang.String r0 = "] for uploadSet: "
            r10.append(r0)
            r10.append(r11)
            java.lang.String r14 = r10.toString()
            r17 = 6
            r18 = 0
            r15 = 0
            r16 = 0
            LF.C13187c.e(r13, r14, r15, r16, r17, r18)
        L_0x013a:
            r0 = r24
            goto L_0x0074
        L_0x013e:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.R(java.util.List, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object S(java.util.List<com.sugarcube.app.base.data.database.Scene> r23, dI.C17164e<? super XH.C16807N> r24) {
        /*
            r22 = this;
            r0 = r24
            boolean r1 = r0 instanceof com.sugarcube.app.base.upload.g.n
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.sugarcube.app.base.upload.g$n r1 = (com.sugarcube.app.base.upload.g.n) r1
            int r2 = r1.f125973u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f125973u = r2
            r2 = r22
            goto L_0x001e
        L_0x0017:
            com.sugarcube.app.base.upload.g$n r1 = new com.sugarcube.app.base.upload.g$n
            r2 = r22
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r3 = r1.f125971s
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r1.f125973u
            r6 = 3
            r7 = 2
            r9 = 1
            if (r5 == 0) goto L_0x0120
            if (r5 == r9) goto L_0x00c9
            if (r5 == r7) goto L_0x006e
            if (r5 != r6) goto L_0x0066
            int r0 = r1.f125967o
            java.lang.Object r5 = r1.f125966n
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r5 = r1.f125965m
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r5 = r1.f125964l
            MF.e r5 = (MF.e) r5
            java.lang.Object r10 = r1.f125963k
            MF.e r10 = (MF.e) r10
            java.lang.Object r10 = r1.f125962j
            MF.e r10 = (MF.e) r10
            java.lang.Object r10 = r1.f125961i
            com.sugarcube.app.base.data.database.Scene r10 = (com.sugarcube.app.base.data.database.Scene) r10
            java.lang.Object r11 = r1.f125959g
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r1.f125958f
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r1.f125957e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r1.f125956d
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r1.f125955c
            com.sugarcube.app.base.upload.g r15 = (com.sugarcube.app.base.upload.g) r15
            XH.y.b(r3)
            r7 = r4
            r2 = r6
            goto L_0x0235
        L_0x0066:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x006e:
            int r0 = r1.f125970r
            int r5 = r1.f125969q
            int r10 = r1.f125968p
            int r11 = r1.f125967o
            java.lang.Object r12 = r1.f125966n
            java.util.UUID r12 = (java.util.UUID) r12
            java.lang.Object r13 = r1.f125965m
            java.util.UUID r13 = (java.util.UUID) r13
            java.lang.Object r14 = r1.f125964l
            MF.e r14 = (MF.e) r14
            java.lang.Object r15 = r1.f125963k
            MF.e r15 = (MF.e) r15
            java.lang.Object r6 = r1.f125962j
            MF.e r6 = (MF.e) r6
            java.lang.Object r7 = r1.f125961i
            com.sugarcube.app.base.data.database.Scene r7 = (com.sugarcube.app.base.data.database.Scene) r7
            java.lang.Object r9 = r1.f125960h
            java.lang.Object r8 = r1.f125959g
            java.util.Iterator r8 = (java.util.Iterator) r8
            r23 = r0
            java.lang.Object r0 = r1.f125958f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r24 = r0
            java.lang.Object r0 = r1.f125957e
            dI.e r0 = (dI.C17164e) r0
            r16 = r0
            java.lang.Object r0 = r1.f125956d
            java.util.List r0 = (java.util.List) r0
            r17 = r0
            java.lang.Object r0 = r1.f125955c
            com.sugarcube.app.base.upload.g r0 = (com.sugarcube.app.base.upload.g) r0
            XH.y.b(r3)
            r3 = r24
            r18 = r5
            r5 = r14
            r2 = r15
            r14 = r17
            r17 = r4
            r15 = r12
            r4 = r13
            r13 = r9
            r12 = r10
            r9 = r6
            r10 = r7
            r6 = r1
            r1 = r0
            r0 = r11
            r11 = r8
            r8 = r16
            r16 = r23
            goto L_0x01ff
        L_0x00c9:
            int r0 = r1.f125969q
            int r5 = r1.f125968p
            int r6 = r1.f125967o
            java.lang.Object r7 = r1.f125966n
            java.util.UUID r7 = (java.util.UUID) r7
            java.lang.Object r8 = r1.f125965m
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r9 = r1.f125964l
            MF.e r9 = (MF.e) r9
            java.lang.Object r10 = r1.f125963k
            MF.e r10 = (MF.e) r10
            java.lang.Object r11 = r1.f125962j
            MF.e r11 = (MF.e) r11
            java.lang.Object r12 = r1.f125961i
            com.sugarcube.app.base.data.database.Scene r12 = (com.sugarcube.app.base.data.database.Scene) r12
            java.lang.Object r13 = r1.f125960h
            java.lang.Object r14 = r1.f125959g
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r1.f125958f
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            r16 = r0
            java.lang.Object r0 = r1.f125957e
            dI.e r0 = (dI.C17164e) r0
            r23 = r0
            java.lang.Object r0 = r1.f125956d
            java.util.List r0 = (java.util.List) r0
            r24 = r0
            java.lang.Object r0 = r1.f125955c
            com.sugarcube.app.base.upload.g r0 = (com.sugarcube.app.base.upload.g) r0
            XH.y.b(r3)
            r18 = r8
            r21 = r10
            r19 = r14
            r20 = r15
            r8 = r6
            r15 = r7
            r10 = r9
            r9 = r11
            r14 = r12
            r7 = r16
            r6 = r1
            r11 = r3
            r12 = r5
            r5 = r23
            r1 = r24
            r3 = r0
            r0 = 1
            goto L_0x0199
        L_0x0120:
            XH.y.b(r3)
            r3 = r23
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r5 = r3.iterator()
            r15 = r3
            r14 = r5
            r6 = 0
            r5 = r1
            r3 = r2
            r1 = r0
            r0 = r23
        L_0x0133:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x0264
            java.lang.Object r7 = r14.next()
            r12 = r7
            com.sugarcube.app.base.data.database.Scene r12 = (com.sugarcube.app.base.data.database.Scene) r12
            com.sugarcube.app.base.upload.IUploadDatabase r8 = r3.f125779d
            java.util.UUID r9 = r12.getSceneUuid()
            MF.e r9 = r8.getUploadSetForScene(r9)
            if (r9 == 0) goto L_0x0257
            java.util.UUID r8 = r9.c()
            java.util.UUID r10 = r12.getUuid()
            com.sugarcube.app.base.data.SceneRepository r11 = r3.f125787l
            java.util.UUID r13 = r9.c()
            r5.f125955c = r3
            r5.f125956d = r0
            r5.f125957e = r1
            r5.f125958f = r15
            r5.f125959g = r14
            r5.f125960h = r7
            r5.f125961i = r12
            r5.f125962j = r9
            r5.f125963k = r9
            r5.f125964l = r9
            r5.f125965m = r8
            r5.f125966n = r10
            r5.f125967o = r6
            r16 = r0
            r0 = 0
            r5.f125968p = r0
            r5.f125969q = r0
            r0 = 1
            r5.f125973u = r0
            java.lang.Object r11 = r11.removeUploadedScene(r13, r5)
            if (r11 != r4) goto L_0x0185
            return r4
        L_0x0185:
            r13 = r7
            r18 = r8
            r21 = r9
            r19 = r14
            r20 = r15
            r7 = 0
            r8 = r6
            r15 = r10
            r14 = r12
            r12 = 0
            r6 = r5
            r10 = r21
            r5 = r1
            r1 = r16
        L_0x0199:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 == r0) goto L_0x01af
            LF.c r0 = r3.f125776a
            java.lang.String r2 = "removeScene failure"
            r17 = r4
            r4 = 0
            r23 = r11
            r11 = 2
            LF.C13187c.h(r0, r2, r4, r11, r4)
            goto L_0x01b3
        L_0x01af:
            r17 = r4
            r23 = r11
        L_0x01b3:
            com.sugarcube.app.base.upload.IUploadDatabase r0 = r3.f125779d
            r6.f125955c = r3
            r6.f125956d = r1
            r6.f125957e = r5
            r2 = r20
            r6.f125958f = r2
            r4 = r19
            r6.f125959g = r4
            r6.f125960h = r13
            r6.f125961i = r14
            r6.f125962j = r9
            r11 = r21
            r6.f125963k = r11
            r6.f125964l = r10
            r16 = r1
            r1 = r18
            r6.f125965m = r1
            r6.f125966n = r15
            r6.f125967o = r8
            r6.f125968p = r12
            r6.f125969q = r7
            r1 = r23
            r6.f125970r = r1
            r1 = 2
            r6.f125973u = r1
            java.lang.Object r0 = r0.deleteSet(r10, r6)
            r1 = r17
            if (r0 != r1) goto L_0x01ed
            return r1
        L_0x01ed:
            r17 = r1
            r1 = r3
            r0 = r8
            r3 = r2
            r8 = r5
            r5 = r10
            r2 = r11
            r10 = r14
            r14 = r16
            r16 = r23
            r11 = r4
            r4 = r18
            r18 = r7
        L_0x01ff:
            com.sugarcube.app.base.upload.IUploadDatabase r7 = r1.f125779d
            r6.f125955c = r1
            r6.f125956d = r14
            r6.f125957e = r8
            r6.f125958f = r3
            r6.f125959g = r11
            r6.f125960h = r13
            r6.f125961i = r10
            r6.f125962j = r9
            r6.f125963k = r2
            r6.f125964l = r5
            r6.f125965m = r4
            r6.f125966n = r15
            r6.f125967o = r0
            r6.f125968p = r12
            r2 = r18
            r6.f125969q = r2
            r2 = r16
            r6.f125970r = r2
            r2 = 3
            r6.f125973u = r2
            java.lang.Object r4 = r7.rememberCapture(r15, r4, r6)
            r7 = r17
            if (r4 != r7) goto L_0x0231
            return r7
        L_0x0231:
            r15 = r1
            r12 = r3
            r1 = r6
            r13 = r8
        L_0x0235:
            LF.c r3 = r15.f125776a
            LF.a$a$f r4 = new LF.a$a$f
            java.util.UUID r6 = r15.f125791p
            if (r6 != 0) goto L_0x023f
            r6 = 1
            goto L_0x0240
        L_0x023f:
            r6 = 0
        L_0x0240:
            java.util.UUID r8 = r10.getUuid()
            int r9 = r10.getSceneId()
            r4.<init>(r5, r6, r8, r9)
            r8 = 1
            r3.b(r4, r8)
            r6 = r0
            r5 = r1
            r1 = r13
            r0 = r14
            r3 = r15
            r14 = r11
            r15 = r12
            goto L_0x025f
        L_0x0257:
            r16 = r0
            r0 = r1
            r7 = r4
            r2 = 3
            r8 = 1
            r0 = r16
        L_0x025f:
            r2 = r22
            r4 = r7
            goto L_0x0133
        L_0x0264:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.S(java.util.List, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object T(MF.e r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sugarcube.app.base.upload.g.o
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sugarcube.app.base.upload.g$o r0 = (com.sugarcube.app.base.upload.g.o) r0
            int r1 = r0.f125979h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f125979h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.upload.g$o r0 = new com.sugarcube.app.base.upload.g$o
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f125977f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f125979h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r7 = r0.f125976e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f125975d
            MF.e r7 = (MF.e) r7
            java.lang.Object r8 = r0.f125974c
            com.sugarcube.app.base.upload.g r8 = (com.sugarcube.app.base.upload.g) r8
            XH.y.b(r1)
            goto L_0x0067
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            XH.y.b(r1)
            LF.c r1 = r6.f125776a
            LF.a$a$i r3 = new LF.a$a$i
            java.util.UUID r5 = r6.f125791p
            if (r5 != 0) goto L_0x004a
            r5 = r4
            goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            r3.<init>(r5, r7)
            r1.b(r3, r4)
            com.sugarcube.app.base.upload.IUploadDatabase r1 = r6.f125779d
            java.util.UUID r3 = r7.c()
            r0.f125974c = r6
            r0.f125975d = r7
            r0.f125976e = r8
            r0.f125979h = r4
            java.lang.Object r8 = r1.resetUpload(r3, r0)
            if (r8 != r2) goto L_0x0066
            return r2
        L_0x0066:
            r8 = r6
        L_0x0067:
            java.util.UUID r7 = r7.c()
            MF.f r0 = MF.f.Scheduled
            r8.e0(r7, r0)
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.T(MF.e, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final List<XH.v<String, Long>> U(UUID uuid) {
        try {
            File e10 = this.f125780e.e(uuid);
            if (e10.exists()) {
                File file = new File(e10, "automatic_log.txt");
                if (!file.exists() && !this.f125781f.b(file)) {
                    this.f125776a.b(new C13185a.C2736a.e(this.f125791p == null, (Exception) null, "failed to gather logs", 2, (DefaultConstructorMarker) null), true);
                }
                File[] listFiles = e10.listFiles();
                C17542s.i(listFiles, "listFiles(...)");
                List<File> l12 = C16870n.l1(listFiles);
                ArrayList<File> arrayList = new ArrayList<>();
                for (Object next : l12) {
                    File file2 = (File) next;
                    C17542s.g(file2);
                    if (C17542s.e(C17423j.s(file2), "zip")) {
                        arrayList.add(next);
                    }
                }
                for (File vVar : arrayList) {
                    l12.removeIf(new C13169w(new C13168v(vVar)));
                }
                l12.removeIf(new C13171y(new C13170x()));
                ArrayList arrayList2 = new ArrayList();
                for (File file3 : l12) {
                    IUploadDatabase iUploadDatabase = this.f125779d;
                    C17542s.g(file3);
                    if (!iUploadDatabase.exists(file3)) {
                        C13187c cVar = this.f125776a;
                        String absolutePath = file3.getAbsolutePath();
                        C13187c.e(cVar, "Adding file " + absolutePath, (C13187c.a) null, (Throwable) null, 6, (Object) null);
                        C13208b f10 = this.f125780e.f(file3, uuid);
                        this.f125779d.insertFile(f10);
                        File file4 = new File(f10.e());
                        arrayList2.add(new XH.v(file4.getName(), Long.valueOf(file4.length())));
                    } else {
                        C13187c cVar2 = this.f125776a;
                        String name = file3.getName();
                        C13187c.h(cVar2, "File already scanned " + name, (Throwable) null, 2, (Object) null);
                        arrayList2.add(new XH.v(file3.getName(), Long.valueOf(file3.length())));
                    }
                }
                File file5 = new File(e10, "mosaic.png");
                if (!file5.exists()) {
                    return arrayList2;
                }
                C17423j.q(file5, this.f125780e.j(uuid), false, 0, 6, (Object) null);
                return arrayList2;
            }
            throw new IllegalStateException("Capture Dir didn't exist");
        } catch (Exception e11) {
            C13187c cVar3 = this.f125776a;
            C13187c.h(cVar3, "scanForFiles " + e11, (Throwable) null, 2, (Object) null);
            return C16877v.n();
        }
    }

    /* access modifiers changed from: private */
    public static final boolean V(C17642l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final boolean W(File file, File file2) {
        String name = file2.getName();
        C17542s.g(file);
        return C17542s.e(name, C17423j.t(file));
    }

    /* access modifiers changed from: private */
    public static final boolean X(C17642l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final boolean Y(File file) {
        return g0.h("mosaic.png", "pano_alignment.jpg", "pano_alignment.heif").contains(file.getName());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0097, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        r3 = r6;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0102, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0103, code lost:
        r3 = r6;
        r6 = r2;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0 = ((java.lang.Boolean) r0).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0163, code lost:
        if (r0 != false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0165, code lost:
        r4.f125980c = r11;
        r4.f125981d = r2;
        r4.f125982e = r3;
        r4.f125983f = r10;
        r4.f125986i = r6;
        r4.f125987j = r0;
        r4.f125991n = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0178, code lost:
        if (r11.G(r10, r4) != r5) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017a, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x017b, code lost:
        r12 = r11;
        r11 = r2;
        r2 = r0;
        r16 = r10;
        r10 = r3;
        r3 = r6;
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0184, code lost:
        r0 = r2;
        r2 = r11;
        r11 = r12;
        r16 = r6;
        r6 = r3;
        r3 = r10;
        r10 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0191, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0194, code lost:
        r4.f125980c = r11;
        r4.f125981d = r2;
        r4.f125982e = r3;
        r4.f125983f = r10;
        r4.f125986i = r6;
        r4.f125987j = r0;
        r4.f125991n = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a7, code lost:
        if (r11.g0(r10, r4) != r5) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a9, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01aa, code lost:
        r4.f125980c = r11;
        r4.f125981d = r2;
        r4.f125982e = r3;
        r4.f125983f = r10;
        r4.f125986i = r6;
        r4.f125987j = r0;
        r4.f125991n = 4;
        r10 = r11.b0(r10, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01bd, code lost:
        if (r10 != r5) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01bf, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c0, code lost:
        r16 = r10;
        r10 = r0;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c5, code lost:
        r0 = ((java.lang.Boolean) r0).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01cb, code lost:
        r4.f125980c = r11;
        r4.f125981d = r2;
        r4.f125982e = r3;
        r4.f125986i = r6;
        r4.f125987j = r0;
        r4.f125988k = r10;
        r4.f125991n = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01de, code lost:
        if (r11.O(r4) != r5) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e0, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e1, code lost:
        r3 = r2;
        r2 = r6;
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e4, code lost:
        r0 = r4.f125779d.getUploadSet(r3.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ee, code lost:
        if (r0 != null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f0, code lost:
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f2, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f3, code lost:
        r0 = r4.f125776a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f9, code lost:
        if (r4.f125791p != null) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fb, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fd, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01fe, code lost:
        if (r2 == 0) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0200, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0202, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0203, code lost:
        r0.b(new LF.C13185a.C2736a.d(r10, r11, r12, (java.lang.String) null, (java.lang.String) null), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020e, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x007e, B:34:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097 A[ExcHandler: Exception (e java.lang.Exception), PHI: r6 r10 r11 
      PHI: (r6v28 dI.e<? super XH.N>) = (r6v18 dI.e<? super XH.N>), (r6v18 dI.e<? super XH.N>), (r6v32 dI.e<? super XH.N>), (r6v32 dI.e<? super XH.N>) binds: [B:34:0x00f7, B:35:?, B:14:0x007e, B:15:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v35 MF.e) = (r10v25 MF.e), (r10v25 MF.e), (r10v37 MF.e), (r10v37 MF.e) binds: [B:34:0x00f7, B:35:?, B:14:0x007e, B:15:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v33 com.sugarcube.app.base.upload.g) = (r11v22 com.sugarcube.app.base.upload.g), (r11v22 com.sugarcube.app.base.upload.g), (r11v35 com.sugarcube.app.base.upload.g), (r11v35 com.sugarcube.app.base.upload.g) binds: [B:34:0x00f7, B:35:?, B:14:0x007e, B:15:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:14:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x023d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z(MF.e r19, dI.C17164e<? super XH.C16807N> r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r0 = r3 instanceof com.sugarcube.app.base.upload.g.p
            if (r0 == 0) goto L_0x001a
            r0 = r3
            com.sugarcube.app.base.upload.g$p r0 = (com.sugarcube.app.base.upload.g.p) r0
            int r4 = r0.f125991n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r0.f125991n = r4
        L_0x0018:
            r4 = r0
            goto L_0x0020
        L_0x001a:
            com.sugarcube.app.base.upload.g$p r0 = new com.sugarcube.app.base.upload.g$p
            r0.<init>(r1, r3)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r4.f125989l
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r4.f125991n
            r7 = 0
            r8 = 1
            r9 = 0
            switch(r6) {
                case 0: goto L_0x0107;
                case 1: goto L_0x00e5;
                case 2: goto L_0x00cc;
                case 3: goto L_0x009c;
                case 4: goto L_0x006a;
                case 5: goto L_0x0057;
                case 6: goto L_0x0036;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0036:
            int r2 = r4.f125986i
            java.lang.Object r3 = r4.f125985h
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r5 = r4.f125984g
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r4.f125983f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r9 = r4.f125982e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r4.f125981d
            MF.e r9 = (MF.e) r9
            java.lang.Object r4 = r4.f125980c
            com.sugarcube.app.base.upload.g r4 = (com.sugarcube.app.base.upload.g) r4
            XH.y.b(r0)
            r14 = r5
            r13 = r6
            goto L_0x0244
        L_0x0057:
            int r2 = r4.f125986i
            java.lang.Object r3 = r4.f125982e
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r4.f125981d
            MF.e r3 = (MF.e) r3
            java.lang.Object r4 = r4.f125980c
            com.sugarcube.app.base.upload.g r4 = (com.sugarcube.app.base.upload.g) r4
            XH.y.b(r0)
            goto L_0x01e4
        L_0x006a:
            boolean r2 = r4.f125987j
            int r3 = r4.f125986i
            java.lang.Object r6 = r4.f125983f
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r6 = r4.f125982e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r10 = r4.f125981d
            MF.e r10 = (MF.e) r10
            java.lang.Object r11 = r4.f125980c
            com.sugarcube.app.base.upload.g r11 = (com.sugarcube.app.base.upload.g) r11
            XH.y.b(r0)     // Catch:{ Exception -> 0x0097, all -> 0x008d }
            r16 = r10
            r10 = r2
            r2 = r16
            r17 = r6
            r6 = r3
            r3 = r17
            goto L_0x01c5
        L_0x008d:
            r0 = move-exception
            r2 = r10
            r10 = r9
            r16 = r6
            r6 = r3
            r3 = r16
            goto L_0x0226
        L_0x0097:
            r0 = move-exception
            r3 = r6
            r2 = r10
            goto L_0x0216
        L_0x009c:
            boolean r2 = r4.f125987j
            int r3 = r4.f125986i
            java.lang.Object r6 = r4.f125983f
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r10 = r4.f125982e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r4.f125981d
            MF.e r11 = (MF.e) r11
            java.lang.Object r12 = r4.f125980c
            com.sugarcube.app.base.upload.g r12 = (com.sugarcube.app.base.upload.g) r12
            XH.y.b(r0)     // Catch:{ Exception -> 0x00c6, all -> 0x00be }
            r0 = r2
            r2 = r11
            r11 = r12
            r16 = r6
            r6 = r3
            r3 = r10
            r10 = r16
            goto L_0x01aa
        L_0x00be:
            r0 = move-exception
            r6 = r3
            r3 = r10
            r2 = r11
            r11 = r12
        L_0x00c3:
            r10 = r9
            goto L_0x0226
        L_0x00c6:
            r0 = move-exception
            r3 = r10
            r2 = r11
            r11 = r12
            goto L_0x0216
        L_0x00cc:
            boolean r2 = r4.f125987j
            int r3 = r4.f125986i
            java.lang.Object r6 = r4.f125983f
            java.util.UUID r6 = (java.util.UUID) r6
            java.lang.Object r10 = r4.f125982e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r4.f125981d
            MF.e r11 = (MF.e) r11
            java.lang.Object r12 = r4.f125980c
            com.sugarcube.app.base.upload.g r12 = (com.sugarcube.app.base.upload.g) r12
            XH.y.b(r0)     // Catch:{ Exception -> 0x00c6, all -> 0x00be }
            goto L_0x0184
        L_0x00e5:
            int r2 = r4.f125986i
            java.lang.Object r3 = r4.f125983f
            java.util.UUID r3 = (java.util.UUID) r3
            java.lang.Object r6 = r4.f125982e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r10 = r4.f125981d
            MF.e r10 = (MF.e) r10
            java.lang.Object r11 = r4.f125980c
            com.sugarcube.app.base.upload.g r11 = (com.sugarcube.app.base.upload.g) r11
            XH.y.b(r0)     // Catch:{ Exception -> 0x0097, all -> 0x0102 }
            r16 = r6
            r6 = r2
            r2 = r10
            r10 = r3
            r3 = r16
            goto L_0x015d
        L_0x0102:
            r0 = move-exception
            r3 = r6
            r6 = r2
            r2 = r10
            goto L_0x00c3
        L_0x0107:
            XH.y.b(r0)
            LF.c r0 = r1.f125776a
            LF.a$a$g r6 = new LF.a$a$g
            java.util.UUID r10 = r1.f125791p
            if (r10 != 0) goto L_0x0114
            r10 = r8
            goto L_0x0115
        L_0x0114:
            r10 = r7
        L_0x0115:
            r6.<init>(r2, r10)
            r0.b(r6, r8)
            java.util.UUID r0 = r19.c()     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            LF.c r10 = r1.f125776a     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            java.lang.String r6 = LF.C13186b.a(r0)     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            r11.<init>()     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            java.lang.String r12 = "starting upload for "
            r11.append(r12)     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            r11.append(r6)     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            r14 = 6
            r15 = 0
            r12 = 0
            r13 = 0
            LF.C13187c.e(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            com.sugarcube.app.base.data.SceneRepository r6 = r1.f125787l     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            java.util.UUID r10 = r1.f125791p     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            com.sugarcube.app.base.data.database.SceneState r11 = com.sugarcube.app.base.data.database.SceneState.UPLOADING     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            r6.setWorkerId(r0, r10, r11)     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            r4.f125980c = r1     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            r4.f125981d = r2     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            r4.f125982e = r3     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            r4.f125983f = r0     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            r4.f125986i = r8     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            r4.f125991n = r8     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            java.lang.Object r6 = r1.b0(r0, r4)     // Catch:{ Exception -> 0x0214, all -> 0x020f }
            if (r6 != r5) goto L_0x0159
            return r5
        L_0x0159:
            r10 = r0
            r11 = r1
            r0 = r6
            r6 = r8
        L_0x015d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            if (r0 != 0) goto L_0x0194
            r4.f125980c = r11     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125981d = r2     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125982e = r3     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125983f = r10     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125986i = r6     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125987j = r0     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r12 = 2
            r4.f125991n = r12     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            java.lang.Object r12 = r11.G(r10, r4)     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            if (r12 != r5) goto L_0x017b
            return r5
        L_0x017b:
            r12 = r11
            r11 = r2
            r2 = r0
            r16 = r10
            r10 = r3
            r3 = r6
            r6 = r16
        L_0x0184:
            r0 = r2
            r2 = r11
            r11 = r12
            r16 = r6
            r6 = r3
            r3 = r10
            r10 = r16
            goto L_0x0194
        L_0x018e:
            r0 = move-exception
            goto L_0x00c3
        L_0x0191:
            r0 = move-exception
            goto L_0x0216
        L_0x0194:
            r4.f125980c = r11     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125981d = r2     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125982e = r3     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125983f = r10     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125986i = r6     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125987j = r0     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r12 = 3
            r4.f125991n = r12     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            java.lang.Object r12 = r11.g0(r10, r4)     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            if (r12 != r5) goto L_0x01aa
            return r5
        L_0x01aa:
            r4.f125980c = r11     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125981d = r2     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125982e = r3     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125983f = r10     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125986i = r6     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125987j = r0     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r12 = 4
            r4.f125991n = r12     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            java.lang.Object r10 = r11.b0(r10, r4)     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            if (r10 != r5) goto L_0x01c0
            return r5
        L_0x01c0:
            r16 = r10
            r10 = r0
            r0 = r16
        L_0x01c5:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r4.f125980c = r11
            r4.f125981d = r2
            r4.f125982e = r3
            r4.f125986i = r6
            r4.f125987j = r0
            r4.f125988k = r10
            r0 = 5
            r4.f125991n = r0
            java.lang.Object r0 = r11.O(r4)
            if (r0 != r5) goto L_0x01e1
            return r5
        L_0x01e1:
            r3 = r2
            r2 = r6
            r4 = r11
        L_0x01e4:
            com.sugarcube.app.base.upload.IUploadDatabase r0 = r4.f125779d
            java.util.UUID r5 = r3.c()
            MF.e r0 = r0.getUploadSet(r5)
            if (r0 != 0) goto L_0x01f2
            r10 = r3
            goto L_0x01f3
        L_0x01f2:
            r10 = r0
        L_0x01f3:
            LF.c r0 = r4.f125776a
            LF.a$a$d r3 = new LF.a$a$d
            java.util.UUID r4 = r4.f125791p
            if (r4 != 0) goto L_0x01fd
            r11 = r8
            goto L_0x01fe
        L_0x01fd:
            r11 = r7
        L_0x01fe:
            if (r2 == 0) goto L_0x0202
            r12 = r8
            goto L_0x0203
        L_0x0202:
            r12 = r7
        L_0x0203:
            r13 = 0
            r14 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            r0.b(r3, r8)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x020f:
            r0 = move-exception
            r11 = r1
            r6 = r8
            goto L_0x00c3
        L_0x0214:
            r0 = move-exception
            r11 = r1
        L_0x0216:
            java.lang.String r6 = "Upload Error"
            java.lang.String r9 = r0.getMessage()     // Catch:{ all -> 0x021d }
            throw r0     // Catch:{ all -> 0x021d }
        L_0x021d:
            r0 = move-exception
            r10 = r9
            r9 = r6
            r6 = r7
            goto L_0x0226
        L_0x0222:
            r0 = move-exception
            r6 = r7
            goto L_0x00c3
        L_0x0226:
            r4.f125980c = r11
            r4.f125981d = r2
            r4.f125982e = r3
            r4.f125983f = r9
            r4.f125984g = r10
            r4.f125985h = r0
            r4.f125986i = r6
            r3 = 6
            r4.f125991n = r3
            java.lang.Object r3 = r11.O(r4)
            if (r3 != r5) goto L_0x023e
            return r5
        L_0x023e:
            r3 = r0
            r13 = r9
            r14 = r10
            r4 = r11
            r9 = r2
            r2 = r6
        L_0x0244:
            com.sugarcube.app.base.upload.IUploadDatabase r0 = r4.f125779d
            java.util.UUID r5 = r9.c()
            MF.e r0 = r0.getUploadSet(r5)
            if (r0 != 0) goto L_0x0252
            r10 = r9
            goto L_0x0253
        L_0x0252:
            r10 = r0
        L_0x0253:
            LF.c r0 = r4.f125776a
            LF.a$a$d r5 = new LF.a$a$d
            java.util.UUID r4 = r4.f125791p
            if (r4 != 0) goto L_0x025d
            r11 = r8
            goto L_0x025e
        L_0x025d:
            r11 = r7
        L_0x025e:
            if (r2 == 0) goto L_0x0262
            r12 = r8
            goto L_0x0263
        L_0x0262:
            r12 = r7
        L_0x0263:
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14)
            r0.b(r5, r8)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.Z(MF.e, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00e1, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1 = r10.f125779d.getAllUploadSets();
        r5 = new java.util.ArrayList();
        r3 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011f, code lost:
        if (r3.hasNext() == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0121, code lost:
        r6 = r3.next();
        r7 = (MF.e) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0130, code lost:
        if (r7.g().b() != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0138, code lost:
        if (r7.g() == MF.f.Failed) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013a, code lost:
        r5.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x013e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x013f, code lost:
        r9 = r13;
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0143, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0144, code lost:
        r9 = r13;
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014c, code lost:
        r9 = r13;
        r8 = r1;
        r13 = 0;
        r1 = r5;
        r6 = r1;
        r7 = r6;
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0157, code lost:
        if (r5.hasNext() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0159, code lost:
        r3 = r5.next();
        r1 = (MF.e) r3;
        r0.f126009c = r10;
        r0.f126010d = r9;
        r0.f126011e = r8;
        r0.f126012f = r7;
        r0.f126013g = r6;
        r0.f126014h = r5;
        r0.f126015i = r3;
        r0.f126016j = r1;
        r0.f126017k = r13;
        r0.f126018l = 0;
        r0.f126021o = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017b, code lost:
        if (r10.Z(r1, r0) != r2) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017e, code lost:
        r0.f126009c = r10;
        r0.f126010d = r9;
        r0.f126011e = r8;
        r0.f126012f = r7;
        r0.f126013g = r6;
        r0.f126014h = r5;
        r0.f126015i = r1;
        r0.f126017k = r13;
        r0.f126021o = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0195, code lost:
        if (r10.O(r0) != r2) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0197, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0198, code lost:
        r3 = r1;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019f, code lost:
        r0.f126009c = r9;
        r0.f126010d = r8;
        r0.f126011e = r7;
        r0.f126012f = r6;
        r0.f126013g = r5;
        r0.f126014h = r4;
        r0.f126015i = r3;
        r0.f126017k = r13;
        r0.f126021o = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b6, code lost:
        if (r9.P(r0) != r2) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01b8, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b9, code lost:
        r0.f126009c = r9;
        r0.f126010d = r8;
        r0.f126011e = r7;
        r0.f126012f = r6;
        r0.f126013g = r5;
        r0.f126014h = r4;
        r0.f126015i = r3;
        r0.f126017k = r13;
        r0.f126021o = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d0, code lost:
        if (r9.Q(r0) != r2) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d2, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01d5, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ed A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a0(dI.C17164e<? super XH.C16807N> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.sugarcube.app.base.upload.g.r
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sugarcube.app.base.upload.g$r r0 = (com.sugarcube.app.base.upload.g.r) r0
            int r1 = r0.f126021o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126021o = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.upload.g$r r0 = new com.sugarcube.app.base.upload.g$r
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f126019m
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126021o
            r4 = 0
            switch(r3) {
                case 0: goto L_0x00f7;
                case 1: goto L_0x00ea;
                case 2: goto L_0x00be;
                case 3: goto L_0x009d;
                case 4: goto L_0x007c;
                case 5: goto L_0x005f;
                case 6: goto L_0x004e;
                case 7: goto L_0x003d;
                case 8: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x002c:
            java.lang.Object r13 = r0.f126011e
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r2 = r0.f126010d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f126009c
            com.sugarcube.app.base.upload.g r0 = (com.sugarcube.app.base.upload.g) r0
            XH.y.b(r1)
            goto L_0x0211
        L_0x003d:
            java.lang.Object r13 = r0.f126011e
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r3 = r0.f126010d
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r4 = r0.f126009c
            com.sugarcube.app.base.upload.g r4 = (com.sugarcube.app.base.upload.g) r4
            XH.y.b(r1)
            goto L_0x0200
        L_0x004e:
            java.lang.Object r13 = r0.f126011e
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r3 = r0.f126010d
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r4 = r0.f126009c
            com.sugarcube.app.base.upload.g r4 = (com.sugarcube.app.base.upload.g) r4
            XH.y.b(r1)
            goto L_0x01f0
        L_0x005f:
            java.lang.Object r13 = r0.f126014h
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r13 = r0.f126013g
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f126012f
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f126011e
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f126010d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f126009c
            com.sugarcube.app.base.upload.g r13 = (com.sugarcube.app.base.upload.g) r13
            XH.y.b(r1)
            goto L_0x01d3
        L_0x007c:
            int r13 = r0.f126017k
            java.lang.Object r3 = r0.f126015i
            java.lang.Object r4 = r0.f126014h
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.f126013g
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r6 = r0.f126012f
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f126011e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.f126010d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r0.f126009c
            com.sugarcube.app.base.upload.g r9 = (com.sugarcube.app.base.upload.g) r9
            XH.y.b(r1)
            goto L_0x01b9
        L_0x009d:
            int r13 = r0.f126017k
            java.lang.Object r3 = r0.f126015i
            java.lang.Object r4 = r0.f126014h
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.f126013g
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r6 = r0.f126012f
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f126011e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.f126010d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r0.f126009c
            com.sugarcube.app.base.upload.g r9 = (com.sugarcube.app.base.upload.g) r9
            XH.y.b(r1)
            goto L_0x019f
        L_0x00be:
            int r13 = r0.f126017k
            java.lang.Object r3 = r0.f126016j
            MF.e r3 = (MF.e) r3
            java.lang.Object r3 = r0.f126015i
            java.lang.Object r5 = r0.f126014h
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f126013g
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r7 = r0.f126012f
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.f126011e
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.f126010d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r10 = r0.f126009c
            com.sugarcube.app.base.upload.g r10 = (com.sugarcube.app.base.upload.g) r10
            XH.y.b(r1)     // Catch:{ Exception -> 0x00e7 }
        L_0x00e1:
            r1 = r3
            goto L_0x0153
        L_0x00e4:
            r13 = move-exception
            goto L_0x01de
        L_0x00e7:
            r13 = move-exception
            goto L_0x01d6
        L_0x00ea:
            java.lang.Object r13 = r0.f126010d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r3 = r0.f126009c
            com.sugarcube.app.base.upload.g r3 = (com.sugarcube.app.base.upload.g) r3
            XH.y.b(r1)
            r10 = r3
            goto L_0x0109
        L_0x00f7:
            XH.y.b(r1)
            r0.f126009c = r12
            r0.f126010d = r13
            r1 = 1
            r0.f126021o = r1
            java.lang.Object r1 = r12.c0(r0)
            if (r1 != r2) goto L_0x0108
            return r2
        L_0x0108:
            r10 = r12
        L_0x0109:
            com.sugarcube.app.base.upload.IUploadDatabase r1 = r10.f125779d     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            java.util.List r1 = r1.getAllUploadSets()     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            r5.<init>()     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0143, all -> 0x013e }
        L_0x011b:
            boolean r6 = r3.hasNext()     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            if (r6 == 0) goto L_0x0148
            java.lang.Object r6 = r3.next()     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            r7 = r6
            MF.e r7 = (MF.e) r7     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            MF.f r8 = r7.g()     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            boolean r8 = r8.b()     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            if (r8 != 0) goto L_0x011b
            MF.f r7 = r7.g()     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            MF.f r8 = MF.f.Failed     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            if (r7 == r8) goto L_0x011b
            r5.add(r6)     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            goto L_0x011b
        L_0x013e:
            r1 = move-exception
            r9 = r13
            r13 = r1
            goto L_0x01de
        L_0x0143:
            r1 = move-exception
            r9 = r13
            r13 = r1
            goto L_0x01d6
        L_0x0148:
            java.util.Iterator r3 = r5.iterator()     // Catch:{ Exception -> 0x0143, all -> 0x013e }
            r9 = r13
            r8 = r1
            r13 = r4
            r1 = r5
            r6 = r1
            r7 = r6
            r5 = r3
        L_0x0153:
            boolean r3 = r5.hasNext()     // Catch:{ Exception -> 0x00e7 }
            if (r3 == 0) goto L_0x017e
            java.lang.Object r3 = r5.next()     // Catch:{ Exception -> 0x00e7 }
            r1 = r3
            MF.e r1 = (MF.e) r1     // Catch:{ Exception -> 0x00e7 }
            r0.f126009c = r10     // Catch:{ Exception -> 0x00e7 }
            r0.f126010d = r9     // Catch:{ Exception -> 0x00e7 }
            r0.f126011e = r8     // Catch:{ Exception -> 0x00e7 }
            r0.f126012f = r7     // Catch:{ Exception -> 0x00e7 }
            r0.f126013g = r6     // Catch:{ Exception -> 0x00e7 }
            r0.f126014h = r5     // Catch:{ Exception -> 0x00e7 }
            r0.f126015i = r3     // Catch:{ Exception -> 0x00e7 }
            r0.f126016j = r1     // Catch:{ Exception -> 0x00e7 }
            r0.f126017k = r13     // Catch:{ Exception -> 0x00e7 }
            r0.f126018l = r4     // Catch:{ Exception -> 0x00e7 }
            r11 = 2
            r0.f126021o = r11     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r1 = r10.Z(r1, r0)     // Catch:{ Exception -> 0x00e7 }
            if (r1 != r2) goto L_0x00e1
            return r2
        L_0x017e:
            r0.f126009c = r10
            r0.f126010d = r9
            r0.f126011e = r8
            r0.f126012f = r7
            r0.f126013g = r6
            r0.f126014h = r5
            r0.f126015i = r1
            r0.f126017k = r13
            r3 = 3
            r0.f126021o = r3
            java.lang.Object r3 = r10.O(r0)
            if (r3 != r2) goto L_0x0198
            return r2
        L_0x0198:
            r3 = r1
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
        L_0x019f:
            r0.f126009c = r9
            r0.f126010d = r8
            r0.f126011e = r7
            r0.f126012f = r6
            r0.f126013g = r5
            r0.f126014h = r4
            r0.f126015i = r3
            r0.f126017k = r13
            r1 = 4
            r0.f126021o = r1
            java.lang.Object r1 = r9.P(r0)
            if (r1 != r2) goto L_0x01b9
            return r2
        L_0x01b9:
            r0.f126009c = r9
            r0.f126010d = r8
            r0.f126011e = r7
            r0.f126012f = r6
            r0.f126013g = r5
            r0.f126014h = r4
            r0.f126015i = r3
            r0.f126017k = r13
            r13 = 5
            r0.f126021o = r13
            java.lang.Object r13 = r9.Q(r0)
            if (r13 != r2) goto L_0x01d3
            return r2
        L_0x01d3:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        L_0x01d6:
            LF.c r1 = r10.f125776a     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = "failure while uploading files"
            r1.g(r3, r13)     // Catch:{ all -> 0x00e4 }
            throw r13     // Catch:{ all -> 0x00e4 }
        L_0x01de:
            r0.f126009c = r10
            r0.f126010d = r9
            r0.f126011e = r13
            r1 = 6
            r0.f126021o = r1
            java.lang.Object r1 = r10.O(r0)
            if (r1 != r2) goto L_0x01ee
            return r2
        L_0x01ee:
            r3 = r9
            r4 = r10
        L_0x01f0:
            r0.f126009c = r4
            r0.f126010d = r3
            r0.f126011e = r13
            r1 = 7
            r0.f126021o = r1
            java.lang.Object r1 = r4.P(r0)
            if (r1 != r2) goto L_0x0200
            return r2
        L_0x0200:
            r0.f126009c = r4
            r0.f126010d = r3
            r0.f126011e = r13
            r1 = 8
            r0.f126021o = r1
            java.lang.Object r0 = r4.Q(r0)
            if (r0 != r2) goto L_0x0211
            return r2
        L_0x0211:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.a0(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b0(java.util.UUID r21, dI.C17164e<? super java.lang.Boolean> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof com.sugarcube.app.base.upload.g.s
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.app.base.upload.g$s r2 = (com.sugarcube.app.base.upload.g.s) r2
            int r3 = r2.f126031l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f126031l = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.upload.g$s r2 = new com.sugarcube.app.base.upload.g$s
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f126029j
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f126031l
            r6 = 0
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L_0x00a6
            if (r5 == r10) goto L_0x0095
            if (r5 == r9) goto L_0x007c
            if (r5 == r8) goto L_0x005c
            if (r5 != r7) goto L_0x0054
            java.lang.Object r1 = r2.f126028i
            com.sugarcube.core.network.models.UploadSetState r1 = (com.sugarcube.core.network.models.UploadSetState) r1
            java.lang.Object r1 = r2.f126027h
            com.sugarcube.app.base.network.ApiResponse r1 = (com.sugarcube.app.base.network.ApiResponse) r1
            java.lang.Object r1 = r2.f126026g
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r2.f126025f
            MF.e r1 = (MF.e) r1
            java.lang.Object r1 = r2.f126024e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f126023d
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r2.f126022c
            com.sugarcube.app.base.upload.g r1 = (com.sugarcube.app.base.upload.g) r1
            XH.y.b(r3)
            goto L_0x0154
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005c:
            java.lang.Object r1 = r2.f126026g
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r5 = r2.f126025f
            MF.e r5 = (MF.e) r5
            java.lang.Object r6 = r2.f126024e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r8 = r2.f126023d
            java.util.UUID r8 = (java.util.UUID) r8
            java.lang.Object r9 = r2.f126022c
            com.sugarcube.app.base.upload.g r9 = (com.sugarcube.app.base.upload.g) r9
            XH.y.b(r3)
            r19 = r6
            r6 = r1
            r1 = r9
            r9 = r8
            r8 = r19
            goto L_0x012d
        L_0x007c:
            java.lang.Object r1 = r2.f126026g
            MF.e r1 = (MF.e) r1
            java.lang.Object r1 = r2.f126025f
            MF.e r1 = (MF.e) r1
            java.lang.Object r1 = r2.f126024e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f126023d
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r1 = r2.f126022c
            com.sugarcube.app.base.upload.g r1 = (com.sugarcube.app.base.upload.g) r1
            XH.y.b(r3)
            goto L_0x0107
        L_0x0095:
            java.lang.Object r1 = r2.f126024e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f126023d
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r11 = r2.f126022c
            com.sugarcube.app.base.upload.g r11 = (com.sugarcube.app.base.upload.g) r11
            XH.y.b(r3)
            r3 = r5
            goto L_0x00bb
        L_0x00a6:
            XH.y.b(r3)
            r2.f126022c = r0
            r3 = r21
            r2.f126023d = r3
            r2.f126024e = r1
            r2.f126031l = r10
            java.lang.Object r5 = r0.c0(r2)
            if (r5 != r4) goto L_0x00ba
            return r4
        L_0x00ba:
            r11 = r0
        L_0x00bb:
            com.sugarcube.app.base.upload.IUploadDatabase r5 = r11.f125779d
            MF.e r5 = r5.getUploadSet(r3)
            if (r5 == 0) goto L_0x0171
            java.util.UUID r12 = r5.i()
            if (r12 != 0) goto L_0x00dc
            LF.c r13 = r11.f125776a
            r17 = 6
            r18 = 0
            java.lang.String r14 = "will create new upload set"
            r15 = 0
            r16 = 0
            LF.C13187c.e(r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r1
        L_0x00dc:
            java.lang.Long r12 = r5.j()
            boolean r12 = r11.J(r12)
            if (r12 == 0) goto L_0x010c
            LF.c r13 = r11.f125776a
            r17 = 6
            r18 = 0
            java.lang.String r14 = "too old, will re-create UploadSet"
            r15 = 0
            r16 = 0
            LF.C13187c.e(r13, r14, r15, r16, r17, r18)
            r2.f126022c = r11
            r2.f126023d = r3
            r2.f126024e = r1
            r2.f126025f = r5
            r2.f126026g = r5
            r2.f126031l = r9
            java.lang.Object r1 = r11.T(r5, r2)
            if (r1 != r4) goto L_0x0107
            return r4
        L_0x0107:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r1
        L_0x010c:
            java.util.Map r6 = r11.E(r3)
            com.sugarcube.app.base.upload.IUploadApi r9 = r11.f125782g
            java.util.UUID r12 = r5.i()
            r2.f126022c = r11
            r2.f126023d = r3
            r2.f126024e = r1
            r2.f126025f = r5
            r2.f126026g = r6
            r2.f126031l = r8
            java.lang.Object r8 = r9.getUploadSetState(r12, r2)
            if (r8 != r4) goto L_0x0129
            return r4
        L_0x0129:
            r9 = r3
            r3 = r8
            r8 = r1
            r1 = r11
        L_0x012d:
            r14 = r3
            com.sugarcube.app.base.network.ApiResponse r14 = (com.sugarcube.app.base.network.ApiResponse) r14
            java.lang.Object r3 = r14.body()
            com.sugarcube.core.network.models.UploadSetState r3 = (com.sugarcube.core.network.models.UploadSetState) r3
            if (r3 == 0) goto L_0x0164
            r1.L(r3)
            com.sugarcube.app.base.upload.IUploadDatabase r11 = r1.f125779d
            r2.f126022c = r1
            r2.f126023d = r9
            r2.f126024e = r8
            r2.f126025f = r5
            r2.f126026g = r6
            r2.f126027h = r14
            r2.f126028i = r3
            r2.f126031l = r7
            java.lang.Object r2 = r11.syncRemoteData(r9, r6, r3, r2)
            if (r2 != r4) goto L_0x0154
            return r4
        L_0x0154:
            LF.c r2 = r1.f125776a
            r6 = 6
            r7 = 0
            java.lang.String r3 = "UploadSet updated"
            r4 = 0
            r5 = 0
            LF.C13187c.e(r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r10)
            return r1
        L_0x0164:
            KF.f r1 = new KF.f
            r15 = 2
            r16 = 0
            java.lang.String r12 = "getUploadSetState failed"
            r13 = 0
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            throw r1
        L_0x0171:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Missing Upload "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r13 = r1.toString()
            LF.c r1 = r11.f125776a
            r2 = 0
            LF.C13187c.h(r1, r13, r2, r9, r2)
            KF.f r1 = new KF.f
            r16 = 6
            r17 = 0
            r14 = 0
            r15 = 0
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.b0(java.util.UUID, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c0(dI.C17164e<? super XH.C16807N> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.sugarcube.app.base.upload.g.t
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sugarcube.app.base.upload.g$t r0 = (com.sugarcube.app.base.upload.g.t) r0
            int r1 = r0.f126036g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126036g = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.upload.g$t r0 = new com.sugarcube.app.base.upload.g$t
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f126034e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126036g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r13 = r0.f126033d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f126032c
            com.sugarcube.app.base.upload.g r13 = (com.sugarcube.app.base.upload.g) r13
            XH.y.b(r1)
            goto L_0x0054
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0039:
            XH.y.b(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f125793r
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0087
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r1 = r12.f125788m
            r0.f126032c = r12
            r0.f126033d = r13
            r0.f126036g = r4
            java.lang.Object r1 = r1.allowCapturesToUpload(r0)
            if (r1 != r2) goto L_0x0053
            return r2
        L_0x0053:
            r13 = r12
        L_0x0054:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x007a
            com.sugarcube.app.base.external.config.a r0 = r13.f125783h
            boolean r0 = r0.getDebug()
            if (r0 == 0) goto L_0x0077
            com.sugarcube.app.base.data.feature.ConfigRepository r13 = r13.f125786k
            com.sugarcube.app.base.data.feature.FeatureFlags$UploadsV2Offline r0 = com.sugarcube.app.base.data.feature.FeatureFlags.UploadsV2Offline.INSTANCE
            boolean r13 = r13.isEnabledBlocking(r0)
            if (r13 != 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            java.net.NoRouteToHostException r13 = new java.net.NoRouteToHostException
            java.lang.String r0 = "Simulated offline"
            r13.<init>(r0)
            throw r13
        L_0x0077:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        L_0x007a:
            KF.f r13 = new KF.f
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Blocked by privacy policy"
            r2 = 0
            r3 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            throw r13
        L_0x0087:
            KF.f r13 = new KF.f
            r10 = 6
            r11 = 0
            java.lang.String r7 = "User not logged in"
            r8 = 0
            r9 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.c0(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d0(java.util.UUID r18, dI.C17164e<? super XH.C16807N> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.sugarcube.app.base.upload.g.u
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.sugarcube.app.base.upload.g$u r3 = (com.sugarcube.app.base.upload.g.u) r3
            int r4 = r3.f126047m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f126047m = r4
            goto L_0x001e
        L_0x0019:
            com.sugarcube.app.base.upload.g$u r3 = new com.sugarcube.app.base.upload.g$u
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f126045k
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f126047m
            r7 = 1
            if (r6 == 0) goto L_0x0052
            if (r6 != r7) goto L_0x004a
            java.lang.Object r1 = r3.f126042h
            MF.f r1 = (MF.f) r1
            java.lang.Object r2 = r3.f126041g
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r3.f126040f
            MF.e r2 = (MF.e) r2
            java.lang.Object r2 = r3.f126039e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f126038d
            java.util.UUID r2 = (java.util.UUID) r2
            java.lang.Object r3 = r3.f126037c
            com.sugarcube.app.base.upload.g r3 = (com.sugarcube.app.base.upload.g) r3
            XH.y.b(r4)
            r9 = r1
            r1 = r2
            goto L_0x00e2
        L_0x004a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0052:
            XH.y.b(r4)
            com.sugarcube.app.base.upload.IUploadDatabase r4 = r0.f125779d
            MF.e r4 = r4.getUploadSet(r1)
            if (r4 == 0) goto L_0x00e8
            com.sugarcube.app.base.upload.IUploadDatabase r6 = r0.f125779d
            java.util.List r6 = r6.getFilesInSet(r1)
            r8 = r6
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r9 = r8 instanceof java.util.Collection
            r10 = 0
            if (r9 == 0) goto L_0x0076
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0076
        L_0x0074:
            r8 = r7
            goto L_0x008f
        L_0x0076:
            java.util.Iterator r8 = r8.iterator()
        L_0x007a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0074
            java.lang.Object r9 = r8.next()
            MF.b r9 = (MF.C13208b) r9
            MF.c r9 = r9.f()
            MF.c r11 = MF.C13209c.UploadedAndNotified
            if (r9 == r11) goto L_0x007a
            r8 = r10
        L_0x008f:
            if (r8 == 0) goto L_0x0094
            MF.f r9 = MF.f.Uploaded
            goto L_0x00a3
        L_0x0094:
            int r9 = r4.h()
            int r11 = r17.H()
            if (r9 < r11) goto L_0x00a1
            MF.f r9 = MF.f.Failed
            goto L_0x00a3
        L_0x00a1:
            MF.f r9 = MF.f.Scheduled
        L_0x00a3:
            LF.c r11 = r0.f125776a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "XXXX post upload setting state: "
            r12.append(r13)
            r12.append(r1)
            java.lang.String r13 = " to "
            r12.append(r13)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            r15 = 6
            r16 = 0
            r13 = 0
            r14 = 0
            LF.C13187c.e(r11, r12, r13, r14, r15, r16)
            com.sugarcube.app.base.upload.IUploadDatabase r11 = r0.f125779d
            r3.f126037c = r0
            r3.f126038d = r1
            r3.f126039e = r2
            r3.f126040f = r4
            r3.f126041g = r6
            r3.f126042h = r9
            r3.f126043i = r8
            r3.f126044j = r10
            r3.f126047m = r7
            java.lang.Object r2 = r11.updateSetLocalState(r1, r9, r3)
            if (r2 != r5) goto L_0x00e1
            return r5
        L_0x00e1:
            r3 = r0
        L_0x00e2:
            r3.e0(r1, r9)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x00e8:
            KF.f r1 = new KF.f
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Missing upload set"
            r4 = 0
            r5 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.d0(java.util.UUID, dI.e):java.lang.Object");
    }

    private final void e0(UUID uuid, MF.f fVar) {
        SceneState sceneState;
        int i10 = d.f125816a[fVar.ordinal()];
        if (i10 == 1) {
            sceneState = SceneState.UPLOADING;
        } else if (i10 == 2) {
            sceneState = SceneState.NEW;
        } else if (i10 == 3) {
            sceneState = SceneState.NEW_FAILED;
        } else if (i10 == 4) {
            sceneState = SceneState.UPLOADED;
        } else if (i10 == 5) {
            sceneState = SceneState.PROCESSING;
        } else {
            throw new XH.t();
        }
        C13187c cVar = this.f125776a;
        C13187c.e(cVar, "XXXX Setting SceneState " + sceneState + " - " + uuid, (C13187c.a) null, (Throwable) null, 6, (Object) null);
        this.f125787l.updateSceneState(uuid, sceneState);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.util.List} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x012a, code lost:
        r5 = r6.f125779d;
        r7 = MF.f.Uploading;
        r2.f126048c = r6;
        r2.f126049d = r3;
        r2.f126050e = r1;
        r2.f126062q = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x013b, code lost:
        if (r5.updateSetLocalState(r3, r7, r2) != r4) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x013d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x013e, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x013f, code lost:
        r6.e0(r5, MF.f.Uploading);
        r7 = new java.util.ArrayList();
        r3 = r6.f125779d.getFilesInSet(r5).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0159, code lost:
        if (r3.hasNext() == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x015b, code lost:
        r8 = r3.next();
        r9 = (MF.C13208b) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0168, code lost:
        if (r9.f() != MF.C13209c.NotUploaded) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0170, code lost:
        if (r9.h() == MF.C13210d.Completed) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0172, code lost:
        r7.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x017a, code lost:
        if (r7.isEmpty() == false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x017c, code lost:
        LF.C13187c.e(r6.f125776a, "No files to upload", (LF.C13187c.a) null, (java.lang.Throwable) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0187, code lost:
        r3 = r6.f125784i.get();
        r9 = r7.iterator();
        r10 = 0;
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x019a, code lost:
        if (r9.hasNext() == false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x019c, code lost:
        r11 = r9.next();
        r12 = (MF.C13208b) r11;
        r13 = r6.f125779d;
        r14 = MF.C13209c.Uploading;
        r2.f126048c = r6;
        r2.f126049d = r5;
        r2.f126050e = r1;
        r2.f126051f = r7;
        r2.f126052g = r3;
        r2.f126053h = r8;
        r2.f126054i = r9;
        r2.f126055j = r11;
        r2.f126056k = r12;
        r2.f126058m = r10;
        r2.f126059n = 0;
        r2.f126062q = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01c5, code lost:
        if (r13.updateFileState(r12, r14, r2) != r4) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01c7, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c8, code lost:
        r13 = r5;
        r14 = r6;
        r5 = r7;
        r7 = r9;
        r9 = r8;
        r8 = r12;
        r12 = r1;
        r1 = r10;
        r10 = r3;
        r3 = r2;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01d3, code lost:
        r6 = r14.f125776a;
        r15 = r8.d();
        r0 = new java.lang.StringBuilder();
        r22 = r4;
        r0.append(">> uploadFile ");
        r0.append(r15);
        LF.C13187c.e(r6, r0.toString(), (LF.C13187c.a) null, (java.lang.Throwable) null, 6, (java.lang.Object) null);
        kotlin.jvm.internal.C17542s.g(r10);
        r0 = r14.f0(r8, r10);
        r4 = r14.f125776a;
        r6 = r8.d();
        r15 = new java.lang.StringBuilder();
        r26 = r2;
        r15.append("<< uploadFile ");
        r15.append(r6);
        LF.C13187c.e(r4, r15.toString(), (LF.C13187c.a) null, (java.lang.Throwable) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0222, code lost:
        if (r0.b() == false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0224, code lost:
        r2 = r14.f125779d;
        r4 = MF.C13209c.Uploaded;
        r3.f126048c = r14;
        r3.f126049d = r13;
        r3.f126050e = r12;
        r3.f126051f = r5;
        r3.f126052g = r10;
        r3.f126053h = r9;
        r3.f126054i = r7;
        r3.f126055j = r11;
        r3.f126056k = r8;
        r3.f126057l = r0;
        r3.f126058m = r1;
        r6 = r26;
        r3.f126059n = r6;
        r3.f126062q = 4;
        r2 = r2.updateFileState(r8, r4, r3);
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x024b, code lost:
        if (r2 != r4) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x024d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x024e, code lost:
        r2 = r3;
        r23 = r9;
        r9 = r5;
        r5 = r7;
        r7 = r23;
        r24 = r14;
        r14 = r12;
        r12 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x025a, code lost:
        r2.f126048c = r12;
        r2.f126049d = r13;
        r2.f126050e = r14;
        r2.f126051f = r9;
        r2.f126052g = r10;
        r2.f126053h = r7;
        r2.f126054i = r5;
        r2.f126055j = r11;
        r2.f126056k = r8;
        r2.f126057l = r0;
        r2.f126058m = r1;
        r2.f126059n = r6;
        r2.f126062q = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0279, code lost:
        if (r12.N(r13, r8, r2) != r4) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x027b, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x027c, code lost:
        r8 = r10;
        r11 = r13;
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x027f, code lost:
        r3 = r8;
        r6 = r12;
        r8 = r7;
        r7 = r9;
        r9 = r5;
        r5 = r11;
        r23 = r10;
        r10 = r1;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x028c, code lost:
        r6 = r26;
        r4 = r22;
        r2 = r14.f125776a;
        r15 = r8.e();
        r2.g("File upload failed - " + r15, r0.a());
        r2 = r14.f125779d;
        r4 = MF.C13209c.NotUploaded;
        r3.f126048c = r14;
        r3.f126049d = r13;
        r3.f126050e = r12;
        r3.f126051f = r5;
        r3.f126052g = r10;
        r3.f126053h = r9;
        r3.f126054i = r7;
        r3.f126055j = r11;
        r3.f126056k = r8;
        r3.f126057l = r0;
        r3.f126058m = r1;
        r3.f126059n = r26;
        r3.f126062q = 6;
        r2 = r2.updateFileState(r8, r4, r3);
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02d5, code lost:
        if (r2 != r4) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02d7, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02d8, code lost:
        r2 = r3;
        r8 = r9;
        r9 = r10;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r10 = r5;
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02e0, code lost:
        r0 = r5.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x02e4, code lost:
        if (r0 != null) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02e6, code lost:
        r3 = r9;
        r5 = r12;
        r6 = r13;
        r9 = r7;
        r7 = r10;
        r10 = r1;
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02ed, code lost:
        r0 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02f1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02f4, code lost:
        return XH.C16807N.f139792a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g0(java.util.UUID r26, dI.C17164e<? super XH.C16807N> r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            boolean r2 = r1 instanceof com.sugarcube.app.base.upload.g.v
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.app.base.upload.g$v r2 = (com.sugarcube.app.base.upload.g.v) r2
            int r3 = r2.f126062q
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f126062q = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.upload.g$v r2 = new com.sugarcube.app.base.upload.g$v
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f126060o
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f126062q
            switch(r5) {
                case 0: goto L_0x0114;
                case 1: goto L_0x0103;
                case 2: goto L_0x00f3;
                case 3: goto L_0x00c1;
                case 4: goto L_0x0085;
                case 5: goto L_0x005a;
                case 6: goto L_0x002f;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            int r1 = r2.f126058m
            java.lang.Object r5 = r2.f126057l
            KF.b r5 = (KF.C13148b) r5
            java.lang.Object r7 = r2.f126056k
            MF.b r7 = (MF.C13208b) r7
            java.lang.Object r7 = r2.f126054i
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r2.f126053h
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r9 = r2.f126052g
            GK.z r9 = (GK.z) r9
            java.lang.Object r10 = r2.f126051f
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.f126050e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r2.f126049d
            java.util.UUID r12 = (java.util.UUID) r12
            java.lang.Object r13 = r2.f126048c
            com.sugarcube.app.base.upload.g r13 = (com.sugarcube.app.base.upload.g) r13
            XH.y.b(r3)
            goto L_0x02e0
        L_0x005a:
            int r1 = r2.f126058m
            java.lang.Object r5 = r2.f126057l
            KF.b r5 = (KF.C13148b) r5
            java.lang.Object r5 = r2.f126056k
            MF.b r5 = (MF.C13208b) r5
            java.lang.Object r5 = r2.f126054i
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r7 = r2.f126053h
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r8 = r2.f126052g
            GK.z r8 = (GK.z) r8
            java.lang.Object r9 = r2.f126051f
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r2.f126050e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f126049d
            java.util.UUID r11 = (java.util.UUID) r11
            java.lang.Object r12 = r2.f126048c
            com.sugarcube.app.base.upload.g r12 = (com.sugarcube.app.base.upload.g) r12
            XH.y.b(r3)
            goto L_0x027f
        L_0x0085:
            int r1 = r2.f126059n
            int r5 = r2.f126058m
            java.lang.Object r7 = r2.f126057l
            KF.b r7 = (KF.C13148b) r7
            java.lang.Object r8 = r2.f126056k
            MF.b r8 = (MF.C13208b) r8
            java.lang.Object r9 = r2.f126055j
            java.lang.Object r10 = r2.f126054i
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r2.f126053h
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r12 = r2.f126052g
            GK.z r12 = (GK.z) r12
            java.lang.Object r13 = r2.f126051f
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r2.f126050e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r2.f126049d
            java.util.UUID r15 = (java.util.UUID) r15
            java.lang.Object r6 = r2.f126048c
            com.sugarcube.app.base.upload.g r6 = (com.sugarcube.app.base.upload.g) r6
            XH.y.b(r3)
            r0 = r7
            r7 = r11
            r11 = r9
            r9 = r13
            r13 = r15
            r23 = r6
            r6 = r1
            r1 = r5
            r5 = r10
            r10 = r12
            r12 = r23
            goto L_0x025a
        L_0x00c1:
            int r1 = r2.f126059n
            int r5 = r2.f126058m
            java.lang.Object r6 = r2.f126056k
            MF.b r6 = (MF.C13208b) r6
            java.lang.Object r7 = r2.f126055j
            java.lang.Object r8 = r2.f126054i
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r2.f126053h
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r10 = r2.f126052g
            GK.z r10 = (GK.z) r10
            java.lang.Object r11 = r2.f126051f
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.f126050e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r2.f126049d
            java.util.UUID r13 = (java.util.UUID) r13
            java.lang.Object r14 = r2.f126048c
            com.sugarcube.app.base.upload.g r14 = (com.sugarcube.app.base.upload.g) r14
            XH.y.b(r3)
            r3 = r2
            r2 = r1
            r1 = r5
            r5 = r11
            r11 = r7
            r7 = r8
            r8 = r6
            goto L_0x01d3
        L_0x00f3:
            java.lang.Object r1 = r2.f126050e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f126049d
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r6 = r2.f126048c
            com.sugarcube.app.base.upload.g r6 = (com.sugarcube.app.base.upload.g) r6
            XH.y.b(r3)
            goto L_0x013f
        L_0x0103:
            java.lang.Object r1 = r2.f126050e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f126049d
            java.util.UUID r5 = (java.util.UUID) r5
            java.lang.Object r6 = r2.f126048c
            com.sugarcube.app.base.upload.g r6 = (com.sugarcube.app.base.upload.g) r6
            XH.y.b(r3)
            r3 = r5
            goto L_0x012a
        L_0x0114:
            XH.y.b(r3)
            r2.f126048c = r0
            r3 = r26
            r2.f126049d = r3
            r2.f126050e = r1
            r5 = 1
            r2.f126062q = r5
            java.lang.Object r5 = r0.c0(r2)
            if (r5 != r4) goto L_0x0129
            return r4
        L_0x0129:
            r6 = r0
        L_0x012a:
            com.sugarcube.app.base.upload.IUploadDatabase r5 = r6.f125779d
            MF.f r7 = MF.f.Uploading
            r2.f126048c = r6
            r2.f126049d = r3
            r2.f126050e = r1
            r8 = 2
            r2.f126062q = r8
            java.lang.Object r5 = r5.updateSetLocalState(r3, r7, r2)
            if (r5 != r4) goto L_0x013e
            return r4
        L_0x013e:
            r5 = r3
        L_0x013f:
            MF.f r3 = MF.f.Uploading
            r6.e0(r5, r3)
            com.sugarcube.app.base.upload.IUploadDatabase r3 = r6.f125779d
            java.util.List r3 = r3.getFilesInSet(r5)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0155:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0176
            java.lang.Object r8 = r3.next()
            r9 = r8
            MF.b r9 = (MF.C13208b) r9
            MF.c r10 = r9.f()
            MF.c r11 = MF.C13209c.NotUploaded
            if (r10 != r11) goto L_0x0155
            MF.d r9 = r9.h()
            MF.d r10 = MF.C13210d.Completed
            if (r9 == r10) goto L_0x0155
            r7.add(r8)
            goto L_0x0155
        L_0x0176:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L_0x0187
            LF.c r8 = r6.f125776a
            r12 = 6
            r13 = 0
            java.lang.String r9 = "No files to upload"
            r10 = 0
            r11 = 0
            LF.C13187c.e(r8, r9, r10, r11, r12, r13)
        L_0x0187:
            WH.a<GK.z> r3 = r6.f125784i
            java.lang.Object r3 = r3.get()
            GK.z r3 = (GK.z) r3
            java.util.Iterator r8 = r7.iterator()
            r9 = r8
            r10 = 0
            r8 = r7
        L_0x0196:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x02f2
            java.lang.Object r11 = r9.next()
            r12 = r11
            MF.b r12 = (MF.C13208b) r12
            com.sugarcube.app.base.upload.IUploadDatabase r13 = r6.f125779d
            MF.c r14 = MF.C13209c.Uploading
            r2.f126048c = r6
            r2.f126049d = r5
            r2.f126050e = r1
            r2.f126051f = r7
            r2.f126052g = r3
            r2.f126053h = r8
            r2.f126054i = r9
            r2.f126055j = r11
            r2.f126056k = r12
            r2.f126058m = r10
            r15 = 0
            r2.f126059n = r15
            r15 = 3
            r2.f126062q = r15
            java.lang.Object r13 = r13.updateFileState(r12, r14, r2)
            if (r13 != r4) goto L_0x01c8
            return r4
        L_0x01c8:
            r13 = r5
            r14 = r6
            r5 = r7
            r7 = r9
            r9 = r8
            r8 = r12
            r12 = r1
            r1 = r10
            r10 = r3
            r3 = r2
            r2 = 0
        L_0x01d3:
            LF.c r6 = r14.f125776a
            java.lang.String r15 = r8.d()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r22 = r4
            java.lang.String r4 = ">> uploadFile "
            r0.append(r4)
            r0.append(r15)
            java.lang.String r17 = r0.toString()
            r20 = 6
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r6
            LF.C13187c.e(r16, r17, r18, r19, r20, r21)
            kotlin.jvm.internal.C17542s.g(r10)
            KF.b r0 = r14.f0(r8, r10)
            LF.c r4 = r14.f125776a
            java.lang.String r6 = r8.d()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r26 = r2
            java.lang.String r2 = "<< uploadFile "
            r15.append(r2)
            r15.append(r6)
            java.lang.String r17 = r15.toString()
            r16 = r4
            LF.C13187c.e(r16, r17, r18, r19, r20, r21)
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x028c
            com.sugarcube.app.base.upload.IUploadDatabase r2 = r14.f125779d
            MF.c r4 = MF.C13209c.Uploaded
            r3.f126048c = r14
            r3.f126049d = r13
            r3.f126050e = r12
            r3.f126051f = r5
            r3.f126052g = r10
            r3.f126053h = r9
            r3.f126054i = r7
            r3.f126055j = r11
            r3.f126056k = r8
            r3.f126057l = r0
            r3.f126058m = r1
            r6 = r26
            r3.f126059n = r6
            r15 = 4
            r3.f126062q = r15
            java.lang.Object r2 = r2.updateFileState(r8, r4, r3)
            r4 = r22
            if (r2 != r4) goto L_0x024e
            return r4
        L_0x024e:
            r2 = r3
            r23 = r9
            r9 = r5
            r5 = r7
            r7 = r23
            r24 = r14
            r14 = r12
            r12 = r24
        L_0x025a:
            r2.f126048c = r12
            r2.f126049d = r13
            r2.f126050e = r14
            r2.f126051f = r9
            r2.f126052g = r10
            r2.f126053h = r7
            r2.f126054i = r5
            r2.f126055j = r11
            r2.f126056k = r8
            r2.f126057l = r0
            r2.f126058m = r1
            r2.f126059n = r6
            r0 = 5
            r2.f126062q = r0
            java.lang.Object r0 = r12.N(r13, r8, r2)
            if (r0 != r4) goto L_0x027c
            return r4
        L_0x027c:
            r8 = r10
            r11 = r13
            r10 = r14
        L_0x027f:
            r3 = r8
            r6 = r12
            r8 = r7
            r7 = r9
            r9 = r5
            r5 = r11
            r23 = r10
            r10 = r1
            r1 = r23
            goto L_0x02ed
        L_0x028c:
            r6 = r26
            r4 = r22
            LF.c r2 = r14.f125776a
            java.lang.String r15 = r8.e()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "File upload failed - "
            r4.append(r6)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            java.lang.Exception r6 = r0.a()
            r2.g(r4, r6)
            com.sugarcube.app.base.upload.IUploadDatabase r2 = r14.f125779d
            MF.c r4 = MF.C13209c.NotUploaded
            r3.f126048c = r14
            r3.f126049d = r13
            r3.f126050e = r12
            r3.f126051f = r5
            r3.f126052g = r10
            r3.f126053h = r9
            r3.f126054i = r7
            r3.f126055j = r11
            r3.f126056k = r8
            r3.f126057l = r0
            r3.f126058m = r1
            r6 = r26
            r3.f126059n = r6
            r6 = 6
            r3.f126062q = r6
            java.lang.Object r2 = r2.updateFileState(r8, r4, r3)
            r4 = r22
            if (r2 != r4) goto L_0x02d8
            return r4
        L_0x02d8:
            r2 = r3
            r8 = r9
            r9 = r10
            r11 = r12
            r12 = r13
            r13 = r14
            r10 = r5
            r5 = r0
        L_0x02e0:
            java.lang.Exception r0 = r5.a()
            if (r0 != 0) goto L_0x02f1
            r3 = r9
            r5 = r12
            r6 = r13
            r9 = r7
            r7 = r10
            r10 = r1
            r1 = r11
        L_0x02ed:
            r0 = r25
            goto L_0x0196
        L_0x02f1:
            throw r0
        L_0x02f2:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.g0(java.util.UUID, dI.e):java.lang.Object");
    }

    public final void L(UploadSetState uploadSetState) {
        String str;
        UploadURL uploadURL;
        if (uploadSetState != null) {
            try {
                List<UploadURL> urls = uploadSetState.getUrls();
                if (!(urls == null || (uploadURL = (UploadURL) C16877v.w0(urls)) == null)) {
                    str = uploadURL.getUrl();
                    if (str == null) {
                    }
                    List Y02 = C15854t.Y0(str, new String[]{"/"}, false, 0, 6, (Object) null);
                    C13187c cVar = this.f125776a;
                    Object obj = Y02.get(Y02.indexOf("geomagical-upload-dev") + 1);
                    C13187c.e(cVar, "!! bucket: " + obj, (C13187c.a) null, (Throwable) null, 6, (Object) null);
                }
            } catch (Exception unused) {
                C13187c.h(this.f125776a, "no bucket", (Throwable) null, 2, (Object) null);
                return;
            }
        }
        str = "";
        List Y022 = C15854t.Y0(str, new String[]{"/"}, false, 0, 6, (Object) null);
        C13187c cVar2 = this.f125776a;
        Object obj2 = Y022.get(Y022.indexOf("geomagical-upload-dev") + 1);
        C13187c.e(cVar2, "!! bucket: " + obj2, (C13187c.a) null, (Throwable) null, 6, (Object) null);
    }

    public Object addUpload(UUID uuid, RoomType roomType, String str, Instant instant, List<Media> list, List<com.sugarcube.app.base.data.database.Metadata> list2, boolean z10, String str2, String str3, C17164e<? super C16807N> eVar) {
        K(new e(this, uuid, roomType, str, instant, list, list2, z10, str2, str3, (C17164e<? super e>) null));
        return C16807N.f139792a;
    }

    public final C13148b f0(C13208b bVar, z zVar) {
        z zVar2 = zVar;
        C17542s.j(bVar, "fileDBO");
        C17542s.j(zVar2, "fileUploadClient");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            File file = new File(bVar.e());
            String c10 = bVar.c();
            C15774B.a aVar = new C15774B.a();
            String j10 = bVar.j();
            C17542s.g(j10);
            C15774B.a a10 = aVar.n(j10).a("Content-Type", c10).a("Content-Length", String.valueOf(file.length()));
            C15775C.a aVar2 = C15775C.f134790a;
            C15805x.a aVar3 = C15805x.f135130e;
            V v10 = V.f144353a;
            String format = String.format(c10, Arrays.copyOf(new Object[0], 0));
            C17542s.i(format, "format(...)");
            C15774B.a i10 = a10.i(aVar2.f(file, aVar3.a(format)));
            String b10 = bVar.b();
            if (b10 != null) {
                i10.a("Content-MD5", b10);
            }
            if (C17542s.e(C17423j.s(file), "zip")) {
                i10.a("Content-Encoding", "gzip");
            }
            C15776D execute = FirebasePerfOkHttpClient.execute(zVar2.b(i10.b()));
            return execute.e1() ? new C13148b(true, System.currentTimeMillis() - currentTimeMillis, (C15776D) null, (Exception) null, false, 28, (DefaultConstructorMarker) null) : new C13148b(false, System.currentTimeMillis() - currentTimeMillis, execute, (Exception) null, false, 24, (DefaultConstructorMarker) null);
        } catch (Exception e10) {
            return new C13148b(false, System.currentTimeMillis() - currentTimeMillis, (C15776D) null, e10, false, 16, (DefaultConstructorMarker) null);
        }
    }

    public void scheduleUploads(boolean z10, String str, boolean z11) {
        boolean z12;
        boolean z13;
        C17542s.j(str, "reason");
        if (I()) {
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    z13 = UploadJobService.a.b(UploadJobService.f125730g, this.f125777b.a(), this.f125776a, z10, 0, 8, (Object) null);
                } catch (Throwable th2) {
                    this.f125776a.d("UploadJobService.startUploadJob error", C13187c.a.Warning, th2);
                    z13 = false;
                }
                if (!z13) {
                    C13187c.e(this.f125776a, "could not start UploadJobService, fallback to UploadWorkerV2", (C13187c.a) null, (Throwable) null, 6, (Object) null);
                }
                z12 = z13;
            } else {
                z12 = false;
            }
            if (!z12) {
                UploadWorkerV2.f125753e.b(this.f125777b.a(), z10);
            } else {
                boolean z14 = z10;
            }
            if (z11) {
                this.f125776a.b(new C13185a.C2736a.h(z12, false, z10, (C13207a) null, str), false);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v36, resolved type: kotlin.jvm.internal.K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v135, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v20, resolved type: dI.e<? super androidx.work.x$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v136, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v35, resolved type: com.sugarcube.app.base.upload.UploadWorkerV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v137, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v17, resolved type: com.sugarcube.app.base.upload.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v39, resolved type: kotlin.jvm.internal.K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v142, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v37, resolved type: kotlin.jvm.internal.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v19, resolved type: dI.e<? super androidx.work.x$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v12, resolved type: com.sugarcube.app.base.upload.UploadWorkerV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v145, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: com.sugarcube.app.base.upload.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v151, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v24, resolved type: dI.e<? super androidx.work.x$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v152, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v39, resolved type: com.sugarcube.app.base.upload.UploadWorkerV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v153, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v21, resolved type: com.sugarcube.app.base.upload.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v70, resolved type: bK.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v72, resolved type: bK.a} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r3 = r0.f125779d;
        r2.f125992c = r0;
        r2.f125993d = r15;
        r2.f125994e = r1;
        r2.f125995f = r14;
        r2.f125996g = r13;
        r2.f125997h = r12;
        r2.f125998i = r11;
        r2.f125999j = r10;
        r2.f126000k = r5;
        r2.f126003n = r8;
        r2.f126004o = r9;
        r2.f126005p = r6;
        r2.f126008s = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0438, code lost:
        if (r3.logCurrentState(r2) != r4) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x043a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x043b, code lost:
        r3 = r8;
        r8 = r9;
        r9 = r5;
        r5 = r6;
        r6 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r0 = r1.f125779d;
        r2.f125992c = r1;
        r2.f125993d = r15;
        r2.f125994e = r6;
        r2.f125995f = r14;
        r2.f125996g = r13;
        r2.f125997h = r12;
        r2.f125998i = r11;
        r2.f125999j = r10;
        r2.f126000k = r9;
        r2.f126001l = r11;
        r2.f126003n = r3;
        r2.f126004o = r8;
        r2.f126005p = r5;
        r2.f126008s = 4;
        r0 = r0.validateStates(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0464, code lost:
        if (r0 != r4) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0466, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0467, code lost:
        r16 = r4;
        r7 = r14;
        r4 = r1;
        r1 = r3;
        r14 = r10;
        r3 = r0;
        r10 = r9;
        r9 = r11;
        r24 = r15;
        r15 = r13;
        r13 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r9.f144348a = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x047f, code lost:
        if (r11.f144348a.c() != false) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0483, code lost:
        r17 = r5;
        r19 = r3;
        r18 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        LF.C13187c.h(r4.f125776a, "Uploads not in valid state at start!", (java.lang.Throwable) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0492, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0493, code lost:
        r5 = r0;
        r3 = r6;
        r0 = r11;
        r11 = r12;
        r9 = r14;
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x049a, code lost:
        r12 = r1;
        r14 = r7;
        r1 = r16;
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x04a0, code lost:
        r24 = r15;
        r15 = r13;
        r13 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x04a7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x04a8, code lost:
        r3 = r6;
        r5 = r10;
        r8 = r13;
        r6 = r17;
        r9 = r18;
        r10 = r7;
        r13 = r12;
        r12 = r1;
        r7 = r4;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x04b5, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x04b9, code lost:
        r18 = r8;
        r5 = r0;
        r3 = r6;
        r0 = r11;
        r11 = r12;
        r9 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x04c2, code lost:
        r18 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x04c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x04c6, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x04c9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x04ca, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x04cd, code lost:
        r19 = r3;
        r17 = r5;
        r18 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x04d5, code lost:
        if (r14.f144344a == false) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r0 = r4.f125776a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04db, code lost:
        if (r13 != null) goto L_0x04df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04dd, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x04df, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04e0, code lost:
        if (r13 == null) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04e2, code lost:
        r8 = r13.getRunAttemptCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04e6, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04e9, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04eb, code lost:
        r0.b(new LF.C13185a.C2736a.l(r5, r1, r8, r11.f144348a), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04f7, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04f9, code lost:
        if (r1 == false) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r2.f125992c = r4;
        r2.f125993d = r13;
        r2.f125994e = r6;
        r2.f125995f = r7;
        r2.f125996g = r15;
        r2.f125997h = r12;
        r2.f125998i = r11;
        r2.f125999j = r14;
        r2.f126000k = r10;
        r0 = r20;
        r2.f126001l = r0;
        r3 = r19;
        r2.f126002m = r3;
        r2.f126003n = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0517, code lost:
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0068, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r2.f126004o = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x051b, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r2.f126005p = r5;
        r2.f126008s = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0526, code lost:
        r17 = r1;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x052a, code lost:
        if (r4.C(r2) != r1) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x052c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x052d, code lost:
        r9 = r0;
        r0 = r3;
        r20 = r4;
        r18 = r6;
        r19 = r13;
        r13 = r12;
        r12 = r17;
        r17 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x053a, code lost:
        r3 = r11;
        r11 = r13;
        r7 = r17;
        r6 = r18;
        r13 = r19;
        r4 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0546, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0547, code lost:
        r17 = r1;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x054b, code lost:
        r3 = r6;
        r9 = r14;
        r14 = r7;
        r7 = r5;
        r5 = r0;
        r0 = r11;
        r11 = r12;
        r12 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0556, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0557, code lost:
        r17 = r1;
        r1 = r16;
        r3 = r6;
        r9 = r8;
        r8 = r13;
        r6 = r5;
        r5 = r10;
        r13 = r12;
        r12 = r17;
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0564, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0567, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0568, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x056b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x056c, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x056f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0570, code lost:
        r5 = r17;
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0575, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0576, code lost:
        r5 = r17;
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x057b, code lost:
        r5 = r17;
        r8 = r18;
        r17 = r1;
        r1 = r16;
        r9 = r20;
        r0 = r19;
        r3 = r11;
        r11 = r12;
        r12 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r2.f125992c = r4;
        r2.f125993d = r13;
        r2.f125994e = r6;
        r2.f125995f = r7;
        r2.f125996g = r15;
        r2.f125997h = r11;
        r2.f125998i = r3;
        r2.f125999j = r14;
        r2.f126000k = r10;
        r2.f126001l = r9;
        r2.f126002m = r0;
        r2.f126003n = r12;
        r2.f126004o = r8;
        r2.f126005p = r5;
        r2.f126008s = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05b0, code lost:
        if (r4.a0(r2) != r1) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05b2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05b3, code lost:
        r9 = r6;
        r6 = r5;
        r5 = r10;
        r10 = r7;
        r7 = r12;
        r12 = r11;
        r24 = r3;
        r3 = r0;
        r0 = r24;
        r25 = r15;
        r15 = r13;
        r13 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        r11 = r4.f125779d;
        r2.f125992c = r4;
        r2.f125993d = r15;
        r2.f125994e = r9;
        r2.f125995f = r10;
        r2.f125996g = r13;
        r2.f125997h = r12;
        r2.f125998i = r0;
        r2.f125999j = r14;
        r2.f126000k = r5;
        r2.f126001l = r0;
        r2.f126002m = r3;
        r2.f126003n = r7;
        r2.f126004o = r8;
        r2.f126005p = r6;
        r2.f126008s = 7;
        r3 = r11.validateStates(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x05e8, code lost:
        if (r3 != r1) goto L_0x05eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x05ea, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x05eb, code lost:
        r8 = r0;
        r2 = r4;
        r4 = r14;
        r14 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x05ef, code lost:
        r0.f144348a = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05f9, code lost:
        if (r8.f144348a.c() != false) goto L_0x0604;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x05fb, code lost:
        LF.C13187c.h(r2.f125776a, r23, (java.lang.Throwable) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x060c, code lost:
        if (r8.f144348a.a() <= 0) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x060e, code lost:
        LF.C13187c.j(r2.f125776a, r22, (java.lang.Throwable) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x061f, code lost:
        if (r8.f144348a.b() <= 0) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0621, code lost:
        r13.f144344a = true;
        r0 = r2.f125776a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0628, code lost:
        if (r15 != null) goto L_0x062d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x062a, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x062d, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x062f, code lost:
        r0.b(new LF.C13185a.C2736a.h(r17, true, false, r8.f144348a, "retry"), false);
        r14.f144348a = androidx.work.C7054x.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x064c, code lost:
        LF.C13187c.e(r2.f125776a, " @@@ success", (LF.C13187c.a) null, (java.lang.Throwable) null, 6, (java.lang.Object) null);
        r13.f144344a = false;
        r14.f144348a = androidx.work.C7054x.a.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0668, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0669, code lost:
        r16 = r3;
        r3 = r22;
        r9 = r23;
        r3 = r6;
        r9 = r14;
        r14 = r7;
        r7 = r5;
        r5 = r0;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0678, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0679, code lost:
        r16 = r3;
        r3 = r22;
        r9 = r23;
        r3 = r6;
        r6 = r5;
        r9 = r8;
        r5 = r10;
        r8 = r13;
        r10 = r7;
        r13 = r11;
        r11 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x068a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x068b, code lost:
        r5 = r17;
        r8 = r18;
        r3 = r22;
        r9 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0695, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0696, code lost:
        r5 = r17;
        r8 = r18;
        r3 = r22;
        r9 = r23;
        r17 = r1;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x06a2, code lost:
        r3 = r6;
        r6 = r5;
        r9 = r8;
        r5 = r10;
        r8 = r13;
        r10 = r7;
        r13 = r12;
        r12 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x06ad, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x06ae, code lost:
        r17 = r1;
        r1 = r16;
        r3 = r22;
        r9 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x06b8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x06b9, code lost:
        r17 = r1;
        r1 = r16;
        r3 = r22;
        r9 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x06c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x06c3, code lost:
        r7 = r1;
        r16 = r3;
        r1 = r4;
        r3 = r22;
        r4 = r23;
        r3 = r6;
        r4 = r7;
        r7 = r5;
        r5 = r0;
        r0 = r11;
        r11 = r12;
        r12 = r16;
        r24 = r10;
        r10 = r9;
        r9 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06da, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x06db, code lost:
        r7 = r1;
        r16 = r3;
        r1 = r4;
        r3 = r22;
        r4 = r23;
        r3 = r6;
        r4 = true;
        r6 = r5;
        r5 = r9;
        r9 = r8;
        r8 = r15;
        r15 = r13;
        r13 = r12;
        r12 = r16;
        r24 = r14;
        r14 = r10;
        r10 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r1 = r0.f125776a;
        r22 = "at least one fully-failed upload exists";
        r6 = new java.lang.StringBuilder();
        r23 = "Upload not in valid state at completion";
        r6.append("------ worker V2 started (");
        r6.append(r5);
        r6.append(") ------");
        LF.C13187c.e(r1, r6.toString(), (LF.C13187c.a) null, (java.lang.Throwable) null, 6, (java.lang.Object) null);
        r0.f125792q = kotlin.coroutines.jvm.internal.b.f(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0377, code lost:
        if (r15 == null) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0379, code lost:
        r1 = r15.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x037e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x037f, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0382, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0383, code lost:
        r0.f125791p = r1;
        r10.f144344a = r0.I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0391, code lost:
        if (r0.f125793r.get() != false) goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0395, code lost:
        if (r10.f144344a == false) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0397, code lost:
        r0 = r0.f125776a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x039b, code lost:
        if (r15 != null) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x039d, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x039f, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x03a0, code lost:
        r0.b(new LF.C13185a.C2736a.k(r9, "not logged in"), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x03a9, code lost:
        r0 = androidx.work.C7054x.a.c();
        kotlin.jvm.internal.C17542s.i(r0, "success(...)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x03b2, code lost:
        r8.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03b6, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r1 = r0.f125788m;
        r2.f125992c = r0;
        r2.f125993d = r15;
        r2.f125994e = r14;
        r2.f125995f = r13;
        r2.f125996g = r12;
        r2.f125997h = r11;
        r2.f125998i = r3;
        r2.f125999j = r10;
        r2.f126000k = r8;
        r2.f126003n = r5;
        r2.f126004o = r9;
        r2.f126005p = 0;
        r2.f126008s = 2;
        r1 = r1.allowCapturesToUpload(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03d9, code lost:
        if (r1 != r4) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x03db, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x03dc, code lost:
        r6 = 0;
        r24 = r3;
        r3 = r1;
        r1 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r24;
        r25 = r8;
        r8 = r5;
        r5 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x03f1, code lost:
        if (((java.lang.Boolean) r3).booleanValue() != false) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03f5, code lost:
        if (r10.f144344a == false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03f7, code lost:
        r0 = r0.f125776a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x03fb, code lost:
        if (r15 != null) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03fd, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03ff, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0400, code lost:
        r0.b(new LF.C13185a.C2736a.k(r9, "Blocked by privacy policy"), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0409, code lost:
        r0 = androidx.work.C7054x.a.b();
        kotlin.jvm.internal.C17542s.i(r0, "retry(...)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0412, code lost:
        r5.d((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0416, code lost:
        return r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x06fc A[Catch:{ all -> 0x082e }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x06ff A[Catch:{ all -> 0x082e }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x074a A[Catch:{ all -> 0x0068 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x074b A[Catch:{ all -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0863 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0864  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object startUploading(boolean r27, com.sugarcube.app.base.upload.UploadWorkerV2 r28, dI.C17164e<? super androidx.work.C7054x.a> r29) {
        /*
            r26 = this;
            r1 = r26
            r0 = r29
            boolean r2 = r0 instanceof com.sugarcube.app.base.upload.g.q
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.sugarcube.app.base.upload.g$q r2 = (com.sugarcube.app.base.upload.g.q) r2
            int r3 = r2.f126008s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f126008s = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.upload.g$q r2 = new com.sugarcube.app.base.upload.g$q
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f126006q
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f126008s
            java.lang.String r6 = "at least one fully-failed upload exists"
            java.lang.String r7 = "Upload not in valid state at completion"
            switch(r5) {
                case 0: goto L_0x02f5;
                case 1: goto L_0x02c3;
                case 2: goto L_0x0282;
                case 3: goto L_0x023f;
                case 4: goto L_0x01c2;
                case 5: goto L_0x0151;
                case 6: goto L_0x00d4;
                case 7: goto L_0x00a2;
                case 8: goto L_0x006c;
                case 9: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0033:
            java.lang.Object r0 = r2.f126002m
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            java.lang.Object r4 = r2.f126001l
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r2.f126000k
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r12 = r2.f125999j
            kotlin.jvm.internal.K r12 = (kotlin.jvm.internal.K) r12
            java.lang.Object r12 = r2.f125998i
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r13 = r2.f125997h
            kotlin.jvm.internal.K r13 = (kotlin.jvm.internal.K) r13
            java.lang.Object r13 = r2.f125996g
            kotlin.jvm.internal.K r13 = (kotlin.jvm.internal.K) r13
            java.lang.Object r14 = r2.f125995f
            kotlin.jvm.internal.O r14 = (kotlin.jvm.internal.O) r14
            java.lang.Object r15 = r2.f125994e
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r15 = r2.f125993d
            com.sugarcube.app.base.upload.UploadWorkerV2 r15 = (com.sugarcube.app.base.upload.UploadWorkerV2) r15
            java.lang.Object r2 = r2.f125992c
            com.sugarcube.app.base.upload.g r2 = (com.sugarcube.app.base.upload.g) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0068 }
            r22 = r6
            r23 = r7
            goto L_0x0868
        L_0x0068:
            r0 = move-exception
        L_0x0069:
            r1 = 0
            goto L_0x08d7
        L_0x006c:
            java.lang.Object r0 = r2.f126002m
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            java.lang.Object r4 = r2.f126001l
            java.lang.Exception r4 = (java.lang.Exception) r4
            java.lang.Object r4 = r2.f126000k
            r5 = r4
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r4 = r2.f125999j
            kotlin.jvm.internal.K r4 = (kotlin.jvm.internal.K) r4
            java.lang.Object r12 = r2.f125998i
            kotlin.jvm.internal.O r12 = (kotlin.jvm.internal.O) r12
            java.lang.Object r13 = r2.f125997h
            kotlin.jvm.internal.K r13 = (kotlin.jvm.internal.K) r13
            java.lang.Object r14 = r2.f125996g
            kotlin.jvm.internal.K r14 = (kotlin.jvm.internal.K) r14
            java.lang.Object r15 = r2.f125995f
            kotlin.jvm.internal.O r15 = (kotlin.jvm.internal.O) r15
            java.lang.Object r8 = r2.f125994e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r2.f125993d
            com.sugarcube.app.base.upload.UploadWorkerV2 r8 = (com.sugarcube.app.base.upload.UploadWorkerV2) r8
            java.lang.Object r2 = r2.f125992c
            com.sugarcube.app.base.upload.g r2 = (com.sugarcube.app.base.upload.g) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0068 }
            r22 = r6
            r23 = r7
            goto L_0x0751
        L_0x00a2:
            java.lang.Object r0 = r2.f126001l
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            java.lang.Object r4 = r2.f126000k
            r5 = r4
            bK.a r5 = (bK.C17052a) r5
            java.lang.Object r4 = r2.f125999j
            kotlin.jvm.internal.K r4 = (kotlin.jvm.internal.K) r4
            java.lang.Object r8 = r2.f125998i
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r12 = r2.f125997h
            kotlin.jvm.internal.K r12 = (kotlin.jvm.internal.K) r12
            java.lang.Object r13 = r2.f125996g
            kotlin.jvm.internal.K r13 = (kotlin.jvm.internal.K) r13
            java.lang.Object r14 = r2.f125995f
            kotlin.jvm.internal.O r14 = (kotlin.jvm.internal.O) r14
            java.lang.Object r15 = r2.f125994e
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r15 = r2.f125993d
            com.sugarcube.app.base.upload.UploadWorkerV2 r15 = (com.sugarcube.app.base.upload.UploadWorkerV2) r15
            java.lang.Object r2 = r2.f125992c
            com.sugarcube.app.base.upload.g r2 = (com.sugarcube.app.base.upload.g) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0068 }
            r22 = r6
            r23 = r7
            goto L_0x05ef
        L_0x00d4:
            int r5 = r2.f126005p
            int r8 = r2.f126004o
            boolean r12 = r2.f126003n
            java.lang.Object r0 = r2.f126002m
            java.lang.Object r13 = r2.f126001l
            kotlin.jvm.internal.O r13 = (kotlin.jvm.internal.O) r13
            java.lang.Object r13 = r2.f126000k
            bK.a r13 = (bK.C17052a) r13
            java.lang.Object r14 = r2.f125999j
            kotlin.jvm.internal.K r14 = (kotlin.jvm.internal.K) r14
            java.lang.Object r15 = r2.f125998i
            kotlin.jvm.internal.O r15 = (kotlin.jvm.internal.O) r15
            java.lang.Object r11 = r2.f125997h
            kotlin.jvm.internal.K r11 = (kotlin.jvm.internal.K) r11
            java.lang.Object r9 = r2.f125996g
            kotlin.jvm.internal.K r9 = (kotlin.jvm.internal.K) r9
            java.lang.Object r10 = r2.f125995f
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            r27 = r0
            java.lang.Object r0 = r2.f125994e
            r16 = r0
            dI.e r16 = (dI.C17164e) r16
            java.lang.Object r0 = r2.f125993d
            r17 = r0
            com.sugarcube.app.base.upload.UploadWorkerV2 r17 = (com.sugarcube.app.base.upload.UploadWorkerV2) r17
            java.lang.Object r0 = r2.f125992c
            r18 = r0
            com.sugarcube.app.base.upload.g r18 = (com.sugarcube.app.base.upload.g) r18
            XH.y.b(r3)     // Catch:{ Exception -> 0x013c, all -> 0x0124 }
            r3 = r27
            r1 = r4
            r22 = r6
            r23 = r7
            r7 = r12
            r0 = r15
            r15 = r17
            r4 = r18
            r6 = r5
            r12 = r11
            r5 = r13
            r13 = r9
            r9 = r16
            goto L_0x05c3
        L_0x0124:
            r0 = move-exception
            r1 = r4
            r22 = r6
            r23 = r7
            r3 = r16
            r4 = r18
            r7 = r5
            r5 = r0
            r0 = r15
            r15 = r17
            r24 = r13
            r13 = r9
            r9 = r14
            r14 = r10
            r10 = r24
            goto L_0x083b
        L_0x013c:
            r0 = move-exception
            r1 = r4
            r22 = r6
            r23 = r7
            r3 = r16
            r7 = r18
            r4 = 1
            r6 = r5
            r5 = r13
            r13 = r11
            r11 = r15
            r15 = r9
            r9 = r8
            r8 = r17
            goto L_0x06f2
        L_0x0151:
            int r5 = r2.f126005p
            int r8 = r2.f126004o
            boolean r12 = r2.f126003n
            java.lang.Object r0 = r2.f126002m
            java.lang.Object r9 = r2.f126001l
            kotlin.jvm.internal.O r9 = (kotlin.jvm.internal.O) r9
            java.lang.Object r10 = r2.f126000k
            bK.a r10 = (bK.C17052a) r10
            java.lang.Object r11 = r2.f125999j
            r14 = r11
            kotlin.jvm.internal.K r14 = (kotlin.jvm.internal.K) r14
            java.lang.Object r11 = r2.f125998i
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r13 = r2.f125997h
            kotlin.jvm.internal.K r13 = (kotlin.jvm.internal.K) r13
            java.lang.Object r15 = r2.f125996g
            kotlin.jvm.internal.K r15 = (kotlin.jvm.internal.K) r15
            r16 = r0
            java.lang.Object r0 = r2.f125995f
            r17 = r0
            kotlin.jvm.internal.O r17 = (kotlin.jvm.internal.O) r17
            java.lang.Object r0 = r2.f125994e
            r18 = r0
            dI.e r18 = (dI.C17164e) r18
            java.lang.Object r0 = r2.f125993d
            r19 = r0
            com.sugarcube.app.base.upload.UploadWorkerV2 r19 = (com.sugarcube.app.base.upload.UploadWorkerV2) r19
            java.lang.Object r0 = r2.f125992c
            r20 = r0
            com.sugarcube.app.base.upload.g r20 = (com.sugarcube.app.base.upload.g) r20
            XH.y.b(r3)     // Catch:{ Exception -> 0x01ae, all -> 0x0198 }
            r1 = r4
            r22 = r6
            r23 = r7
            r0 = r16
            goto L_0x053a
        L_0x0198:
            r0 = move-exception
            r1 = r4
            r22 = r6
            r23 = r7
            r9 = r14
            r14 = r17
            r3 = r18
            r4 = r20
            r7 = r5
            r5 = r0
            r0 = r11
            r11 = r13
            r13 = r15
            r15 = r19
            goto L_0x083b
        L_0x01ae:
            r0 = move-exception
            r1 = r4
            r22 = r6
            r23 = r7
            r9 = r8
            r3 = r18
            r8 = r19
            r7 = r20
            r4 = 1
            r6 = r5
            r5 = r10
            r10 = r17
            goto L_0x06f2
        L_0x01c2:
            int r5 = r2.f126005p
            int r8 = r2.f126004o
            boolean r12 = r2.f126003n
            java.lang.Object r0 = r2.f126001l
            kotlin.jvm.internal.O r0 = (kotlin.jvm.internal.O) r0
            java.lang.Object r9 = r2.f126000k
            bK.a r9 = (bK.C17052a) r9
            java.lang.Object r10 = r2.f125999j
            r14 = r10
            kotlin.jvm.internal.K r14 = (kotlin.jvm.internal.K) r14
            java.lang.Object r10 = r2.f125998i
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            java.lang.Object r11 = r2.f125997h
            kotlin.jvm.internal.K r11 = (kotlin.jvm.internal.K) r11
            java.lang.Object r13 = r2.f125996g
            kotlin.jvm.internal.K r13 = (kotlin.jvm.internal.K) r13
            java.lang.Object r15 = r2.f125995f
            kotlin.jvm.internal.O r15 = (kotlin.jvm.internal.O) r15
            r27 = r0
            java.lang.Object r0 = r2.f125994e
            r16 = r0
            dI.e r16 = (dI.C17164e) r16
            java.lang.Object r0 = r2.f125993d
            r17 = r0
            com.sugarcube.app.base.upload.UploadWorkerV2 r17 = (com.sugarcube.app.base.upload.UploadWorkerV2) r17
            java.lang.Object r0 = r2.f125992c
            r18 = r0
            com.sugarcube.app.base.upload.g r18 = (com.sugarcube.app.base.upload.g) r18
            XH.y.b(r3)     // Catch:{ Exception -> 0x0226, all -> 0x0212 }
            r22 = r6
            r23 = r7
            r1 = r12
            r7 = r15
            r6 = r16
            r16 = r4
            r12 = r11
            r15 = r13
            r13 = r17
            r4 = r18
            r11 = r10
            r10 = r9
            r9 = r27
            goto L_0x0475
        L_0x0212:
            r0 = move-exception
            r1 = r4
            r22 = r6
            r23 = r7
            r3 = r16
            r4 = r18
            r7 = r5
            r5 = r0
            r0 = r10
            r10 = r9
            r9 = r14
            r14 = r15
            r15 = r17
            goto L_0x083b
        L_0x0226:
            r0 = move-exception
            r1 = r4
            r22 = r6
            r23 = r7
            r3 = r16
            r7 = r18
            r4 = 1
            r6 = r5
            r5 = r9
            r9 = r8
            r8 = r17
            r24 = r11
            r11 = r10
            r10 = r15
            r15 = r13
            r13 = r24
            goto L_0x06f2
        L_0x023f:
            int r0 = r2.f126005p
            int r5 = r2.f126004o
            boolean r8 = r2.f126003n
            java.lang.Object r9 = r2.f126000k
            bK.a r9 = (bK.C17052a) r9
            java.lang.Object r10 = r2.f125999j
            kotlin.jvm.internal.K r10 = (kotlin.jvm.internal.K) r10
            java.lang.Object r11 = r2.f125998i
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r2.f125997h
            kotlin.jvm.internal.K r12 = (kotlin.jvm.internal.K) r12
            java.lang.Object r13 = r2.f125996g
            kotlin.jvm.internal.K r13 = (kotlin.jvm.internal.K) r13
            java.lang.Object r14 = r2.f125995f
            kotlin.jvm.internal.O r14 = (kotlin.jvm.internal.O) r14
            java.lang.Object r15 = r2.f125994e
            dI.e r15 = (dI.C17164e) r15
            r16 = r0
            java.lang.Object r0 = r2.f125993d
            com.sugarcube.app.base.upload.UploadWorkerV2 r0 = (com.sugarcube.app.base.upload.UploadWorkerV2) r0
            r27 = r0
            java.lang.Object r0 = r2.f125992c
            com.sugarcube.app.base.upload.g r0 = (com.sugarcube.app.base.upload.g) r0
            XH.y.b(r3)     // Catch:{ all -> 0x027e }
            r1 = r0
            r22 = r6
            r23 = r7
            r3 = r8
            r6 = r15
            r15 = r27
            r8 = r5
            r5 = r16
            goto L_0x0441
        L_0x027e:
            r0 = move-exception
            r5 = r9
            goto L_0x0069
        L_0x0282:
            int r0 = r2.f126005p
            int r5 = r2.f126004o
            boolean r8 = r2.f126003n
            java.lang.Object r9 = r2.f126000k
            bK.a r9 = (bK.C17052a) r9
            java.lang.Object r10 = r2.f125999j
            kotlin.jvm.internal.K r10 = (kotlin.jvm.internal.K) r10
            java.lang.Object r11 = r2.f125998i
            kotlin.jvm.internal.O r11 = (kotlin.jvm.internal.O) r11
            java.lang.Object r12 = r2.f125997h
            kotlin.jvm.internal.K r12 = (kotlin.jvm.internal.K) r12
            java.lang.Object r13 = r2.f125996g
            kotlin.jvm.internal.K r13 = (kotlin.jvm.internal.K) r13
            java.lang.Object r14 = r2.f125995f
            kotlin.jvm.internal.O r14 = (kotlin.jvm.internal.O) r14
            java.lang.Object r15 = r2.f125994e
            dI.e r15 = (dI.C17164e) r15
            r16 = r0
            java.lang.Object r0 = r2.f125993d
            com.sugarcube.app.base.upload.UploadWorkerV2 r0 = (com.sugarcube.app.base.upload.UploadWorkerV2) r0
            r27 = r0
            java.lang.Object r0 = r2.f125992c
            com.sugarcube.app.base.upload.g r0 = (com.sugarcube.app.base.upload.g) r0
            XH.y.b(r3)     // Catch:{ all -> 0x027e }
            r22 = r6
            r23 = r7
            r1 = r15
            r6 = r16
            r15 = r27
            r24 = r9
            r9 = r5
            r5 = r24
            goto L_0x03eb
        L_0x02c3:
            int r0 = r2.f126004o
            boolean r5 = r2.f126003n
            java.lang.Object r8 = r2.f126000k
            bK.a r8 = (bK.C17052a) r8
            java.lang.Object r9 = r2.f125999j
            kotlin.jvm.internal.K r9 = (kotlin.jvm.internal.K) r9
            java.lang.Object r10 = r2.f125998i
            kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
            java.lang.Object r11 = r2.f125997h
            kotlin.jvm.internal.K r11 = (kotlin.jvm.internal.K) r11
            java.lang.Object r12 = r2.f125996g
            kotlin.jvm.internal.K r12 = (kotlin.jvm.internal.K) r12
            java.lang.Object r13 = r2.f125995f
            kotlin.jvm.internal.O r13 = (kotlin.jvm.internal.O) r13
            java.lang.Object r14 = r2.f125994e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r2.f125993d
            com.sugarcube.app.base.upload.UploadWorkerV2 r15 = (com.sugarcube.app.base.upload.UploadWorkerV2) r15
            r16 = r0
            java.lang.Object r0 = r2.f125992c
            com.sugarcube.app.base.upload.g r0 = (com.sugarcube.app.base.upload.g) r0
            XH.y.b(r3)
            r3 = r10
            r10 = r9
            r9 = r16
            goto L_0x0344
        L_0x02f5:
            XH.y.b(r3)
            kotlin.jvm.internal.O r13 = new kotlin.jvm.internal.O
            r13.<init>()
            kotlin.jvm.internal.K r12 = new kotlin.jvm.internal.K
            r12.<init>()
            kotlin.jvm.internal.K r3 = new kotlin.jvm.internal.K
            r3.<init>()
            kotlin.jvm.internal.O r10 = new kotlin.jvm.internal.O
            r10.<init>()
            kotlin.jvm.internal.K r5 = new kotlin.jvm.internal.K
            r5.<init>()
            bK.a r8 = r1.f125790o
            r2.f125992c = r1
            r9 = r28
            r2.f125993d = r9
            r2.f125994e = r0
            r2.f125995f = r13
            r2.f125996g = r12
            r2.f125997h = r3
            r2.f125998i = r10
            r2.f125999j = r5
            r2.f126000k = r8
            r11 = r27
            r2.f126003n = r11
            r14 = 0
            r2.f126004o = r14
            r14 = 1
            r2.f126008s = r14
            r14 = 0
            java.lang.Object r15 = r8.e(r14, r2)
            if (r15 != r4) goto L_0x0339
            return r4
        L_0x0339:
            r14 = r0
            r0 = r1
            r15 = r9
            r9 = 0
            r24 = r11
            r11 = r3
            r3 = r10
            r10 = r5
            r5 = r24
        L_0x0344:
            LF.c r1 = r0.f125776a     // Catch:{ all -> 0x037e }
            r22 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x037e }
            r6.<init>()     // Catch:{ all -> 0x037e }
            r23 = r7
            java.lang.String r7 = "------ worker V2 started ("
            r6.append(r7)     // Catch:{ all -> 0x037e }
            r6.append(r5)     // Catch:{ all -> 0x037e }
            java.lang.String r7 = ") ------"
            r6.append(r7)     // Catch:{ all -> 0x037e }
            java.lang.String r17 = r6.toString()     // Catch:{ all -> 0x037e }
            r20 = 6
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r1
            LF.C13187c.e(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x037e }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x037e }
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.b.f(r6)     // Catch:{ all -> 0x037e }
            r0.f125792q = r1     // Catch:{ all -> 0x037e }
            if (r15 == 0) goto L_0x0382
            java.util.UUID r1 = r15.getId()     // Catch:{ all -> 0x037e }
            goto L_0x0383
        L_0x037e:
            r0 = move-exception
            r5 = r8
            goto L_0x0069
        L_0x0382:
            r1 = 0
        L_0x0383:
            r0.f125791p = r1     // Catch:{ all -> 0x037e }
            boolean r1 = r0.I()     // Catch:{ all -> 0x037e }
            r10.f144344a = r1     // Catch:{ all -> 0x037e }
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f125793r     // Catch:{ all -> 0x037e }
            boolean r1 = r1.get()     // Catch:{ all -> 0x037e }
            if (r1 != 0) goto L_0x03b7
            boolean r1 = r10.f144344a     // Catch:{ all -> 0x037e }
            if (r1 == 0) goto L_0x03a9
            LF.c r0 = r0.f125776a     // Catch:{ all -> 0x037e }
            LF.a$a$k r1 = new LF.a$a$k     // Catch:{ all -> 0x037e }
            if (r15 != 0) goto L_0x039f
            r9 = 1
            goto L_0x03a0
        L_0x039f:
            r9 = 0
        L_0x03a0:
            java.lang.String r2 = "not logged in"
            r1.<init>(r9, r2)     // Catch:{ all -> 0x037e }
            r2 = 0
            r0.b(r1, r2)     // Catch:{ all -> 0x037e }
        L_0x03a9:
            androidx.work.x$a r0 = androidx.work.C7054x.a.c()     // Catch:{ all -> 0x037e }
            java.lang.String r1 = "success(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)     // Catch:{ all -> 0x037e }
            r1 = 0
            r8.d(r1)
            return r0
        L_0x03b7:
            com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase r1 = r0.f125788m     // Catch:{ all -> 0x037e }
            r2.f125992c = r0     // Catch:{ all -> 0x037e }
            r2.f125993d = r15     // Catch:{ all -> 0x037e }
            r2.f125994e = r14     // Catch:{ all -> 0x037e }
            r2.f125995f = r13     // Catch:{ all -> 0x037e }
            r2.f125996g = r12     // Catch:{ all -> 0x037e }
            r2.f125997h = r11     // Catch:{ all -> 0x037e }
            r2.f125998i = r3     // Catch:{ all -> 0x037e }
            r2.f125999j = r10     // Catch:{ all -> 0x037e }
            r2.f126000k = r8     // Catch:{ all -> 0x037e }
            r2.f126003n = r5     // Catch:{ all -> 0x037e }
            r2.f126004o = r9     // Catch:{ all -> 0x037e }
            r6 = 0
            r2.f126005p = r6     // Catch:{ all -> 0x037e }
            r6 = 2
            r2.f126008s = r6     // Catch:{ all -> 0x037e }
            java.lang.Object r1 = r1.allowCapturesToUpload(r2)     // Catch:{ all -> 0x037e }
            if (r1 != r4) goto L_0x03dc
            return r4
        L_0x03dc:
            r6 = 0
            r24 = r3
            r3 = r1
            r1 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r24
            r25 = r8
            r8 = r5
            r5 = r25
        L_0x03eb:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0068 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x0417
            boolean r1 = r10.f144344a     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x0409
            LF.c r0 = r0.f125776a     // Catch:{ all -> 0x0068 }
            LF.a$a$k r1 = new LF.a$a$k     // Catch:{ all -> 0x0068 }
            if (r15 != 0) goto L_0x03ff
            r9 = 1
            goto L_0x0400
        L_0x03ff:
            r9 = 0
        L_0x0400:
            java.lang.String r2 = "Blocked by privacy policy"
            r1.<init>(r9, r2)     // Catch:{ all -> 0x0068 }
            r2 = 0
            r0.b(r1, r2)     // Catch:{ all -> 0x0068 }
        L_0x0409:
            androidx.work.x$a r0 = androidx.work.C7054x.a.b()     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "retry(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)     // Catch:{ all -> 0x0068 }
            r1 = 0
            r5.d(r1)
            return r0
        L_0x0417:
            com.sugarcube.app.base.upload.IUploadDatabase r3 = r0.f125779d     // Catch:{ all -> 0x0068 }
            r2.f125992c = r0     // Catch:{ all -> 0x0068 }
            r2.f125993d = r15     // Catch:{ all -> 0x0068 }
            r2.f125994e = r1     // Catch:{ all -> 0x0068 }
            r2.f125995f = r14     // Catch:{ all -> 0x0068 }
            r2.f125996g = r13     // Catch:{ all -> 0x0068 }
            r2.f125997h = r12     // Catch:{ all -> 0x0068 }
            r2.f125998i = r11     // Catch:{ all -> 0x0068 }
            r2.f125999j = r10     // Catch:{ all -> 0x0068 }
            r2.f126000k = r5     // Catch:{ all -> 0x0068 }
            r2.f126003n = r8     // Catch:{ all -> 0x0068 }
            r2.f126004o = r9     // Catch:{ all -> 0x0068 }
            r2.f126005p = r6     // Catch:{ all -> 0x0068 }
            r7 = 3
            r2.f126008s = r7     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = r3.logCurrentState(r2)     // Catch:{ all -> 0x0068 }
            if (r3 != r4) goto L_0x043b
            return r4
        L_0x043b:
            r3 = r8
            r8 = r9
            r9 = r5
            r5 = r6
            r6 = r1
            r1 = r0
        L_0x0441:
            com.sugarcube.app.base.upload.IUploadDatabase r0 = r1.f125779d     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f125992c = r1     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f125993d = r15     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f125994e = r6     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f125995f = r14     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f125996g = r13     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f125997h = r12     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f125998i = r11     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f125999j = r10     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f126000k = r9     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f126001l = r11     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f126003n = r3     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f126004o = r8     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r2.f126005p = r5     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            r7 = 4
            r2.f126008s = r7     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            java.lang.Object r0 = r0.validateStates(r2)     // Catch:{ Exception -> 0x06da, all -> 0x06c2 }
            if (r0 != r4) goto L_0x0467
            return r4
        L_0x0467:
            r16 = r4
            r7 = r14
            r4 = r1
            r1 = r3
            r14 = r10
            r3 = r0
            r10 = r9
            r9 = r11
            r24 = r15
            r15 = r13
            r13 = r24
        L_0x0475:
            r9.f144348a = r3     // Catch:{ Exception -> 0x06b8, all -> 0x06ad }
            T r0 = r11.f144348a     // Catch:{ Exception -> 0x06b8, all -> 0x06ad }
            MF.a r0 = (MF.C13207a) r0     // Catch:{ Exception -> 0x06b8, all -> 0x06ad }
            boolean r0 = r0.c()     // Catch:{ Exception -> 0x06b8, all -> 0x06ad }
            if (r0 != 0) goto L_0x04cd
            LF.c r0 = r4.f125776a     // Catch:{ Exception -> 0x04c9, all -> 0x04c5 }
            r17 = r5
            java.lang.String r5 = "Uploads not in valid state at start!"
            r19 = r3
            r18 = r8
            r3 = 0
            r8 = 2
            LF.C13187c.h(r0, r5, r3, r8, r3)     // Catch:{ Exception -> 0x04a7, all -> 0x0492 }
            goto L_0x04d3
        L_0x0492:
            r0 = move-exception
            r5 = r0
            r3 = r6
            r0 = r11
            r11 = r12
            r9 = r14
            r8 = r18
        L_0x049a:
            r12 = r1
            r14 = r7
            r1 = r16
            r7 = r17
        L_0x04a0:
            r24 = r15
            r15 = r13
            r13 = r24
            goto L_0x083b
        L_0x04a7:
            r0 = move-exception
        L_0x04a8:
            r3 = r6
            r5 = r10
            r8 = r13
            r6 = r17
            r9 = r18
            r10 = r7
            r13 = r12
            r12 = r1
            r7 = r4
            r1 = r16
        L_0x04b5:
            r4 = 1
            goto L_0x06f2
        L_0x04b8:
            r0 = move-exception
        L_0x04b9:
            r18 = r8
            r5 = r0
            r3 = r6
            r0 = r11
            r11 = r12
            r9 = r14
            goto L_0x049a
        L_0x04c1:
            r0 = move-exception
        L_0x04c2:
            r18 = r8
            goto L_0x04a8
        L_0x04c5:
            r0 = move-exception
            r17 = r5
            goto L_0x04b9
        L_0x04c9:
            r0 = move-exception
            r17 = r5
            goto L_0x04c2
        L_0x04cd:
            r19 = r3
            r17 = r5
            r18 = r8
        L_0x04d3:
            boolean r0 = r14.f144344a     // Catch:{ Exception -> 0x0695, all -> 0x068a }
            if (r0 == 0) goto L_0x04f7
            LF.c r0 = r4.f125776a     // Catch:{ Exception -> 0x04a7, all -> 0x0492 }
            LF.a$a$l r3 = new LF.a$a$l     // Catch:{ Exception -> 0x04a7, all -> 0x0492 }
            if (r13 != 0) goto L_0x04df
            r5 = 1
            goto L_0x04e0
        L_0x04df:
            r5 = 0
        L_0x04e0:
            if (r13 == 0) goto L_0x04e9
            int r8 = r13.getRunAttemptCount()     // Catch:{ Exception -> 0x04a7, all -> 0x0492 }
        L_0x04e6:
            r20 = r9
            goto L_0x04eb
        L_0x04e9:
            r8 = -1
            goto L_0x04e6
        L_0x04eb:
            T r9 = r11.f144348a     // Catch:{ Exception -> 0x04a7, all -> 0x0492 }
            MF.a r9 = (MF.C13207a) r9     // Catch:{ Exception -> 0x04a7, all -> 0x0492 }
            r3.<init>(r5, r1, r8, r9)     // Catch:{ Exception -> 0x04a7, all -> 0x0492 }
            r5 = 0
            r0.b(r3, r5)     // Catch:{ Exception -> 0x04a7, all -> 0x0492 }
            goto L_0x04f9
        L_0x04f7:
            r20 = r9
        L_0x04f9:
            if (r1 == 0) goto L_0x057b
            r2.f125992c = r4     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r2.f125993d = r13     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r2.f125994e = r6     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r2.f125995f = r7     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r2.f125996g = r15     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r2.f125997h = r12     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r2.f125998i = r11     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r2.f125999j = r14     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r2.f126000k = r10     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r0 = r20
            r2.f126001l = r0     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r3 = r19
            r2.f126002m = r3     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r2.f126003n = r1     // Catch:{ Exception -> 0x0575, all -> 0x056f }
            r8 = r18
            r2.f126004o = r8     // Catch:{ Exception -> 0x056b, all -> 0x0567 }
            r5 = r17
            r2.f126005p = r5     // Catch:{ Exception -> 0x0556, all -> 0x0546 }
            r9 = 5
            r2.f126008s = r9     // Catch:{ Exception -> 0x0556, all -> 0x0546 }
            java.lang.Object r9 = r4.C(r2)     // Catch:{ Exception -> 0x0556, all -> 0x0546 }
            r17 = r1
            r1 = r16
            if (r9 != r1) goto L_0x052d
            return r1
        L_0x052d:
            r9 = r0
            r0 = r3
            r20 = r4
            r18 = r6
            r19 = r13
            r13 = r12
            r12 = r17
            r17 = r7
        L_0x053a:
            r3 = r11
            r11 = r13
            r7 = r17
            r6 = r18
            r13 = r19
            r4 = r20
            goto L_0x058d
        L_0x0546:
            r0 = move-exception
        L_0x0547:
            r17 = r1
            r1 = r16
        L_0x054b:
            r3 = r6
            r9 = r14
            r14 = r7
            r7 = r5
            r5 = r0
            r0 = r11
            r11 = r12
            r12 = r17
            goto L_0x04a0
        L_0x0556:
            r0 = move-exception
        L_0x0557:
            r17 = r1
            r1 = r16
            r3 = r6
            r9 = r8
            r8 = r13
            r6 = r5
            r5 = r10
            r13 = r12
            r12 = r17
            r10 = r7
        L_0x0564:
            r7 = r4
            goto L_0x04b5
        L_0x0567:
            r0 = move-exception
            r5 = r17
            goto L_0x0547
        L_0x056b:
            r0 = move-exception
            r5 = r17
            goto L_0x0557
        L_0x056f:
            r0 = move-exception
            r5 = r17
            r8 = r18
            goto L_0x0547
        L_0x0575:
            r0 = move-exception
            r5 = r17
            r8 = r18
            goto L_0x0557
        L_0x057b:
            r5 = r17
            r8 = r18
            r3 = r19
            r0 = r20
            r17 = r1
            r1 = r16
            r9 = r0
            r0 = r3
            r3 = r11
            r11 = r12
            r12 = r17
        L_0x058d:
            r2.f125992c = r4     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f125993d = r13     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f125994e = r6     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f125995f = r7     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f125996g = r15     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f125997h = r11     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f125998i = r3     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f125999j = r14     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f126000k = r10     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f126001l = r9     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f126002m = r0     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f126003n = r12     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f126004o = r8     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r2.f126005p = r5     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            r9 = 6
            r2.f126008s = r9     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            java.lang.Object r9 = r4.a0(r2)     // Catch:{ Exception -> 0x0678, all -> 0x0668 }
            if (r9 != r1) goto L_0x05b3
            return r1
        L_0x05b3:
            r9 = r6
            r6 = r5
            r5 = r10
            r10 = r7
            r7 = r12
            r12 = r11
            r24 = r3
            r3 = r0
            r0 = r24
            r25 = r15
            r15 = r13
            r13 = r25
        L_0x05c3:
            com.sugarcube.app.base.upload.IUploadDatabase r11 = r4.f125779d     // Catch:{ all -> 0x0068 }
            r2.f125992c = r4     // Catch:{ all -> 0x0068 }
            r2.f125993d = r15     // Catch:{ all -> 0x0068 }
            r2.f125994e = r9     // Catch:{ all -> 0x0068 }
            r2.f125995f = r10     // Catch:{ all -> 0x0068 }
            r2.f125996g = r13     // Catch:{ all -> 0x0068 }
            r2.f125997h = r12     // Catch:{ all -> 0x0068 }
            r2.f125998i = r0     // Catch:{ all -> 0x0068 }
            r2.f125999j = r14     // Catch:{ all -> 0x0068 }
            r2.f126000k = r5     // Catch:{ all -> 0x0068 }
            r2.f126001l = r0     // Catch:{ all -> 0x0068 }
            r2.f126002m = r3     // Catch:{ all -> 0x0068 }
            r2.f126003n = r7     // Catch:{ all -> 0x0068 }
            r2.f126004o = r8     // Catch:{ all -> 0x0068 }
            r2.f126005p = r6     // Catch:{ all -> 0x0068 }
            r3 = 7
            r2.f126008s = r3     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = r11.validateStates(r2)     // Catch:{ all -> 0x0068 }
            if (r3 != r1) goto L_0x05eb
            return r1
        L_0x05eb:
            r8 = r0
            r2 = r4
            r4 = r14
            r14 = r10
        L_0x05ef:
            r0.f144348a = r3     // Catch:{ all -> 0x0068 }
            T r0 = r8.f144348a     // Catch:{ all -> 0x0068 }
            MF.a r0 = (MF.C13207a) r0     // Catch:{ all -> 0x0068 }
            boolean r0 = r0.c()     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0604
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            r9 = r23
            r1 = 2
            r3 = 0
            LF.C13187c.h(r0, r9, r3, r1, r3)     // Catch:{ all -> 0x0068 }
        L_0x0604:
            T r0 = r8.f144348a     // Catch:{ all -> 0x0068 }
            MF.a r0 = (MF.C13207a) r0     // Catch:{ all -> 0x0068 }
            int r0 = r0.a()     // Catch:{ all -> 0x0068 }
            if (r0 <= 0) goto L_0x0617
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            r1 = r22
            r3 = 2
            r6 = 0
            LF.C13187c.j(r0, r1, r6, r3, r6)     // Catch:{ all -> 0x0068 }
        L_0x0617:
            T r0 = r8.f144348a     // Catch:{ all -> 0x0068 }
            MF.a r0 = (MF.C13207a) r0     // Catch:{ all -> 0x0068 }
            int r0 = r0.b()     // Catch:{ all -> 0x0068 }
            if (r0 <= 0) goto L_0x064c
            r1 = 1
            r13.f144344a = r1     // Catch:{ all -> 0x0068 }
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            LF.a$a$h r1 = new LF.a$a$h     // Catch:{ all -> 0x0068 }
            if (r15 != 0) goto L_0x062d
            r17 = 1
            goto L_0x062f
        L_0x062d:
            r17 = 0
        L_0x062f:
            T r3 = r8.f144348a     // Catch:{ all -> 0x0068 }
            r20 = r3
            MF.a r20 = (MF.C13207a) r20     // Catch:{ all -> 0x0068 }
            java.lang.String r21 = "retry"
            r18 = 1
            r19 = 0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0068 }
            r3 = 0
            r0.b(r1, r3)     // Catch:{ all -> 0x0068 }
            androidx.work.x$a r0 = androidx.work.C7054x.a.b()     // Catch:{ all -> 0x0068 }
            r14.f144348a = r0     // Catch:{ all -> 0x0068 }
            goto L_0x07c5
        L_0x064c:
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            java.lang.String r17 = " @@@ success"
            r20 = 6
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r0
            LF.C13187c.e(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0068 }
            r1 = 0
            r13.f144344a = r1     // Catch:{ all -> 0x0068 }
            androidx.work.x$a r0 = androidx.work.C7054x.a.c()     // Catch:{ all -> 0x0068 }
            r14.f144348a = r0     // Catch:{ all -> 0x0068 }
            goto L_0x07c5
        L_0x0668:
            r0 = move-exception
            r16 = r3
            r3 = r22
            r9 = r23
            r3 = r6
            r9 = r14
            r14 = r7
            r7 = r5
            r5 = r0
            r0 = r16
            goto L_0x04a0
        L_0x0678:
            r0 = move-exception
            r16 = r3
            r3 = r22
            r9 = r23
            r3 = r6
            r6 = r5
            r9 = r8
            r5 = r10
            r8 = r13
            r10 = r7
            r13 = r11
            r11 = r16
            goto L_0x0564
        L_0x068a:
            r0 = move-exception
            r5 = r17
            r8 = r18
            r3 = r22
            r9 = r23
            goto L_0x0547
        L_0x0695:
            r0 = move-exception
            r5 = r17
            r8 = r18
            r3 = r22
            r9 = r23
            r17 = r1
            r1 = r16
        L_0x06a2:
            r3 = r6
            r6 = r5
            r9 = r8
            r5 = r10
            r8 = r13
            r10 = r7
            r13 = r12
            r12 = r17
            goto L_0x0564
        L_0x06ad:
            r0 = move-exception
            r17 = r1
            r1 = r16
            r3 = r22
            r9 = r23
            goto L_0x054b
        L_0x06b8:
            r0 = move-exception
            r17 = r1
            r1 = r16
            r3 = r22
            r9 = r23
            goto L_0x06a2
        L_0x06c2:
            r0 = move-exception
            r7 = r1
            r16 = r3
            r1 = r4
            r3 = r22
            r4 = r23
            r3 = r6
            r4 = r7
            r7 = r5
            r5 = r0
            r0 = r11
            r11 = r12
            r12 = r16
            r24 = r10
            r10 = r9
            r9 = r24
            goto L_0x083b
        L_0x06da:
            r0 = move-exception
            r7 = r1
            r16 = r3
            r1 = r4
            r3 = r22
            r4 = r23
            r3 = r6
            r4 = 1
            r6 = r5
            r5 = r9
            r9 = r8
            r8 = r15
            r15 = r13
            r13 = r12
            r12 = r16
            r24 = r14
            r14 = r10
            r10 = r24
        L_0x06f2:
            r13.f144344a = r4     // Catch:{ all -> 0x0839 }
            LF.c r4 = r7.f125776a     // Catch:{ all -> 0x0839 }
            r27 = r1
            LF.a$a$e r1 = new LF.a$a$e     // Catch:{ all -> 0x082e }
            if (r8 != 0) goto L_0x06ff
            r17 = 1
            goto L_0x0701
        L_0x06ff:
            r17 = 0
        L_0x0701:
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r1
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x082e }
            r16 = r6
            r6 = 1
            r4.b(r1, r6)     // Catch:{ all -> 0x080f }
            r0.printStackTrace()     // Catch:{ all -> 0x080f }
            LF.c r1 = r7.f125776a     // Catch:{ all -> 0x080f }
            java.lang.String r4 = "Upload did not finish"
            r1.g(r4, r0)     // Catch:{ all -> 0x080f }
            com.sugarcube.app.base.upload.IUploadDatabase r1 = r7.f125779d     // Catch:{ all -> 0x0068 }
            r2.f125992c = r7     // Catch:{ all -> 0x0068 }
            r2.f125993d = r8     // Catch:{ all -> 0x0068 }
            r2.f125994e = r3     // Catch:{ all -> 0x0068 }
            r2.f125995f = r10     // Catch:{ all -> 0x0068 }
            r2.f125996g = r15     // Catch:{ all -> 0x0068 }
            r2.f125997h = r13     // Catch:{ all -> 0x0068 }
            r2.f125998i = r11     // Catch:{ all -> 0x0068 }
            r2.f125999j = r14     // Catch:{ all -> 0x0068 }
            r2.f126000k = r5     // Catch:{ all -> 0x0068 }
            r2.f126001l = r0     // Catch:{ all -> 0x0068 }
            r2.f126002m = r11     // Catch:{ all -> 0x0068 }
            r2.f126003n = r12     // Catch:{ all -> 0x0068 }
            r2.f126004o = r9     // Catch:{ all -> 0x0068 }
            r4 = r16
            r2.f126005p = r4     // Catch:{ all -> 0x0068 }
            r0 = 8
            r2.f126008s = r0     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = r1.validateStates(r2)     // Catch:{ all -> 0x0068 }
            r1 = r27
            if (r3 != r1) goto L_0x074b
            return r1
        L_0x074b:
            r2 = r7
            r0 = r11
            r12 = r0
            r4 = r14
            r14 = r15
            r15 = r10
        L_0x0751:
            r0.f144348a = r3     // Catch:{ all -> 0x0068 }
            T r0 = r12.f144348a     // Catch:{ all -> 0x0068 }
            MF.a r0 = (MF.C13207a) r0     // Catch:{ all -> 0x0068 }
            boolean r0 = r0.c()     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0766
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            r6 = r23
            r1 = 2
            r3 = 0
            LF.C13187c.h(r0, r6, r3, r1, r3)     // Catch:{ all -> 0x0068 }
        L_0x0766:
            T r0 = r12.f144348a     // Catch:{ all -> 0x0068 }
            MF.a r0 = (MF.C13207a) r0     // Catch:{ all -> 0x0068 }
            int r0 = r0.a()     // Catch:{ all -> 0x0068 }
            if (r0 <= 0) goto L_0x0779
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            r1 = r22
            r3 = 2
            r6 = 0
            LF.C13187c.j(r0, r1, r6, r3, r6)     // Catch:{ all -> 0x0068 }
        L_0x0779:
            T r0 = r12.f144348a     // Catch:{ all -> 0x0068 }
            MF.a r0 = (MF.C13207a) r0     // Catch:{ all -> 0x0068 }
            int r0 = r0.b()     // Catch:{ all -> 0x0068 }
            if (r0 <= 0) goto L_0x07ad
            r1 = 1
            r14.f144344a = r1     // Catch:{ all -> 0x0068 }
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            LF.a$a$h r1 = new LF.a$a$h     // Catch:{ all -> 0x0068 }
            if (r8 != 0) goto L_0x078f
            r17 = 1
            goto L_0x0791
        L_0x078f:
            r17 = 0
        L_0x0791:
            T r3 = r12.f144348a     // Catch:{ all -> 0x0068 }
            r20 = r3
            MF.a r20 = (MF.C13207a) r20     // Catch:{ all -> 0x0068 }
            java.lang.String r21 = "retry"
            r18 = 1
            r19 = 0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0068 }
            r3 = 0
            r0.b(r1, r3)     // Catch:{ all -> 0x0068 }
            androidx.work.x$a r0 = androidx.work.C7054x.a.b()     // Catch:{ all -> 0x0068 }
            r15.f144348a = r0     // Catch:{ all -> 0x0068 }
            goto L_0x07c1
        L_0x07ad:
            LF.c r6 = r2.f125776a     // Catch:{ all -> 0x0068 }
            java.lang.String r7 = " @@@ success"
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            LF.C13187c.e(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0068 }
            r1 = 0
            r14.f144344a = r1     // Catch:{ all -> 0x0068 }
            androidx.work.x$a r0 = androidx.work.C7054x.a.c()     // Catch:{ all -> 0x0068 }
            r15.f144348a = r0     // Catch:{ all -> 0x0068 }
        L_0x07c1:
            r8 = r12
            r12 = r13
            r13 = r14
            r14 = r15
        L_0x07c5:
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            java.lang.String r17 = "------ workerV2 completed ------"
            r20 = 6
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r0
            LF.C13187c.e(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0068 }
            r1 = 0
            r2.f125792q = r1     // Catch:{ all -> 0x0068 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0068 }
            r5.d(r1)
            boolean r0 = r4.f144344a
            if (r0 == 0) goto L_0x080c
            LF.c r0 = r2.f125776a
            LF.a$a$j r1 = new LF.a$a$j
            java.util.UUID r3 = r2.f125791p
            if (r3 != 0) goto L_0x07ed
            r17 = 1
            goto L_0x07ef
        L_0x07ed:
            r17 = 0
        L_0x07ef:
            boolean r3 = r12.f144344a
            boolean r4 = r13.f144344a
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f125793r
            boolean r20 = r2.get()
            T r2 = r8.f144348a
            r21 = r2
            MF.a r21 = (MF.C13207a) r21
            r16 = r1
            r18 = r3
            r19 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            r2 = 0
            r0.b(r1, r2)
        L_0x080c:
            T r0 = r14.f144348a
            return r0
        L_0x080f:
            r0 = move-exception
            r1 = r27
            r4 = r16
            r6 = r23
            r16 = r3
            r3 = r22
        L_0x081a:
            r3 = r16
            r24 = r5
            r5 = r0
            r0 = r11
            r11 = r13
            r13 = r15
            r15 = r8
            r8 = r9
            r9 = r14
            r14 = r10
            r10 = r24
            r25 = r7
            r7 = r4
            r4 = r25
            goto L_0x083b
        L_0x082e:
            r0 = move-exception
            r1 = r27
        L_0x0831:
            r16 = r3
            r4 = r6
            r3 = r22
            r6 = r23
            goto L_0x081a
        L_0x0839:
            r0 = move-exception
            goto L_0x0831
        L_0x083b:
            com.sugarcube.app.base.upload.IUploadDatabase r6 = r4.f125779d     // Catch:{ all -> 0x08d3 }
            r2.f125992c = r4     // Catch:{ all -> 0x08d3 }
            r2.f125993d = r15     // Catch:{ all -> 0x08d3 }
            r2.f125994e = r3     // Catch:{ all -> 0x08d3 }
            r2.f125995f = r14     // Catch:{ all -> 0x08d3 }
            r2.f125996g = r13     // Catch:{ all -> 0x08d3 }
            r2.f125997h = r11     // Catch:{ all -> 0x08d3 }
            r2.f125998i = r0     // Catch:{ all -> 0x08d3 }
            r2.f125999j = r9     // Catch:{ all -> 0x08d3 }
            r2.f126000k = r10     // Catch:{ all -> 0x08d3 }
            r2.f126001l = r5     // Catch:{ all -> 0x08d3 }
            r2.f126002m = r0     // Catch:{ all -> 0x08d3 }
            r2.f126003n = r12     // Catch:{ all -> 0x08d3 }
            r2.f126004o = r8     // Catch:{ all -> 0x08d3 }
            r2.f126005p = r7     // Catch:{ all -> 0x08d3 }
            r3 = 9
            r2.f126008s = r3     // Catch:{ all -> 0x08d3 }
            java.lang.Object r3 = r6.validateStates(r2)     // Catch:{ all -> 0x08d3 }
            if (r3 != r1) goto L_0x0864
            return r1
        L_0x0864:
            r12 = r0
            r2 = r4
            r4 = r5
            r5 = r10
        L_0x0868:
            r0.f144348a = r3     // Catch:{ all -> 0x0068 }
            T r0 = r12.f144348a     // Catch:{ all -> 0x0068 }
            MF.a r0 = (MF.C13207a) r0     // Catch:{ all -> 0x0068 }
            boolean r0 = r0.c()     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x087d
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            r1 = r23
            r3 = 2
            r6 = 0
            LF.C13187c.h(r0, r1, r6, r3, r6)     // Catch:{ all -> 0x0068 }
        L_0x087d:
            T r0 = r12.f144348a     // Catch:{ all -> 0x0068 }
            MF.a r0 = (MF.C13207a) r0     // Catch:{ all -> 0x0068 }
            int r0 = r0.a()     // Catch:{ all -> 0x0068 }
            if (r0 <= 0) goto L_0x0890
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            r1 = r22
            r3 = 2
            r6 = 0
            LF.C13187c.j(r0, r1, r6, r3, r6)     // Catch:{ all -> 0x0068 }
        L_0x0890:
            T r0 = r12.f144348a     // Catch:{ all -> 0x0068 }
            MF.a r0 = (MF.C13207a) r0     // Catch:{ all -> 0x0068 }
            int r0 = r0.b()     // Catch:{ all -> 0x0068 }
            if (r0 <= 0) goto L_0x08be
            r1 = 1
            r13.f144344a = r1     // Catch:{ all -> 0x0068 }
            LF.c r0 = r2.f125776a     // Catch:{ all -> 0x0068 }
            LF.a$a$h r2 = new LF.a$a$h     // Catch:{ all -> 0x0068 }
            if (r15 != 0) goto L_0x08a5
            r7 = r1
            goto L_0x08a6
        L_0x08a5:
            r7 = 0
        L_0x08a6:
            T r1 = r12.f144348a     // Catch:{ all -> 0x0068 }
            r10 = r1
            MF.a r10 = (MF.C13207a) r10     // Catch:{ all -> 0x0068 }
            java.lang.String r11 = "retry"
            r8 = 1
            r9 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0068 }
            r1 = 0
            r0.b(r2, r1)     // Catch:{ all -> 0x0068 }
            androidx.work.x$a r0 = androidx.work.C7054x.a.b()     // Catch:{ all -> 0x0068 }
            r14.f144348a = r0     // Catch:{ all -> 0x0068 }
            goto L_0x08d2
        L_0x08be:
            LF.c r6 = r2.f125776a     // Catch:{ all -> 0x0068 }
            java.lang.String r7 = " @@@ success"
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            LF.C13187c.e(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0068 }
            r1 = 0
            r13.f144344a = r1     // Catch:{ all -> 0x0068 }
            androidx.work.x$a r0 = androidx.work.C7054x.a.c()     // Catch:{ all -> 0x0068 }
            r14.f144348a = r0     // Catch:{ all -> 0x0068 }
        L_0x08d2:
            throw r4     // Catch:{ all -> 0x0068 }
        L_0x08d3:
            r0 = move-exception
            r5 = r10
            goto L_0x0069
        L_0x08d7:
            r5.d(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.upload.g.startUploading(boolean, com.sugarcube.app.base.upload.UploadWorkerV2, dI.e):java.lang.Object");
    }
}
