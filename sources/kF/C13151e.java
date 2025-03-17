package KF;

import LF.C13186b;
import LF.C13187c;
import MF.C13208b;
import MF.C13209c;
import MF.C13210d;
import MF.e;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.sugarcube.app.base.network.ApiResponse;
import com.sugarcube.app.base.upload.IUploadDatabase;
import com.sugarcube.app.base.upload.UploadFileDao;
import com.sugarcube.app.base.upload.UploadSetDao;
import com.sugarcube.app.base.upload.UploadTrackerDb;
import com.sugarcube.core.network.models.UploadSetState;
import com.sugarcube.core.network.models.UploadURL;
import dI.C17164e;
import eI.C17187b;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H@¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b'\u0010(J \u0010,\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H@¢\u0006\u0004\b,\u0010-J4\u00104\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0006\u00103\u001a\u000202H@¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206H@¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0013H@¢\u0006\u0004\b9\u00108J\u0018\u0010;\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\nH@¢\u0006\u0004\b;\u0010<J \u0010>\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010=\u001a\u00020\bH@¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u0002008\u0002XD¢\u0006\u0006\n\u0004\bF\u0010GR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8BX\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8BX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"LKF/e;", "Lcom/sugarcube/app/base/upload/IUploadDatabase;", "LLF/c;", "log", "Lcom/sugarcube/app/base/upload/UploadTrackerDb;", "db", "<init>", "(LLF/c;Lcom/sugarcube/app/base/upload/UploadTrackerDb;)V", "Ljava/util/UUID;", "captureUUID", "LMF/e;", "getUploadSet", "(Ljava/util/UUID;)LMF/e;", "", "getAllUploadSets", "()Ljava/util/List;", "sceneUUID", "getUploadSetForScene", "uploadSetDBO", "LXH/N;", "insertSet", "(LMF/e;)V", "Ljava/io/File;", "file", "", "exists", "(Ljava/io/File;)Z", "LMF/b;", "uploadFileDBO", "insertFile", "(LMF/b;)V", "getFilesInSet", "(Ljava/util/UUID;)Ljava/util/List;", "LMF/f;", "newState", "updateSetLocalState", "(Ljava/util/UUID;LMF/f;LdI/e;)Ljava/lang/Object;", "updateSetSceneCreated", "(Ljava/util/UUID;Ljava/util/UUID;)V", "resetUpload", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "fileDBO", "LMF/c;", "localState", "updateFileState", "(LMF/b;LMF/c;LdI/e;)Ljava/lang/Object;", "", "Lcom/sugarcube/core/network/models/UploadURL;", "", "remoteToLocalFileMap", "Lcom/sugarcube/core/network/models/UploadSetState;", "remoteState", "syncRemoteData", "(Ljava/util/UUID;Ljava/util/Map;Lcom/sugarcube/core/network/models/UploadSetState;LdI/e;)Ljava/lang/Object;", "LMF/a;", "validateStates", "(LdI/e;)Ljava/lang/Object;", "logCurrentState", "uploadSet", "deleteSet", "(LMF/e;LdI/e;)Ljava/lang/Object;", "originalCaptureUUID", "rememberCapture", "(Ljava/util/UUID;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "getRememberedCapture", "(Ljava/util/UUID;)Ljava/util/UUID;", "a", "LLF/c;", "b", "Lcom/sugarcube/app/base/upload/UploadTrackerDb;", "c", "Ljava/lang/String;", "TAG", "", "d", "Ljava/util/Map;", "rememberedCaptures", "Lcom/sugarcube/app/base/upload/UploadSetDao;", "f", "()Lcom/sugarcube/app/base/upload/UploadSetDao;", "setDao", "Lcom/sugarcube/app/base/upload/UploadFileDao;", "e", "()Lcom/sugarcube/app/base/upload/UploadFileDao;", "fileDao", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: KF.e  reason: case insensitive filesystem */
public final class C13151e implements IUploadDatabase {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C13187c f111668a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final UploadTrackerDb f111669b;

    /* renamed from: c  reason: collision with root package name */
    private final String f111670c = "UploadTracker";

    /* renamed from: d  reason: collision with root package name */
    private final Map<UUID, UUID> f111671d = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploadDatabase$deleteSet$2", f = "UploadDatabase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: KF.e$a */
    static final class a extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111672c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13151e f111673d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f111674e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13151e eVar, e eVar2, C17164e<? super a> eVar3) {
            super(1, eVar3);
            this.f111673d = eVar;
            this.f111674e = eVar2;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new a(this.f111673d, this.f111674e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f111672c == 0) {
                y.b(obj);
                C13187c c10 = this.f111673d.f111668a;
                UUID c11 = this.f111674e.c();
                C13187c.e(c10, "delete uploadSet " + c11, (C13187c.a) null, (Throwable) null, 6, (Object) null);
                this.f111673d.f().delete(this.f111674e.c());
                this.f111673d.e().delete(this.f111674e.c());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploadDatabase$logCurrentState$2", f = "UploadDatabase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: KF.e$b */
    static final class b extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111675c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13151e f111676d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C13151e eVar, C17164e<? super b> eVar2) {
            super(1, eVar2);
            this.f111676d = eVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new b(this.f111676d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((b) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f111675c == 0) {
                y.b(obj);
                C13151e eVar = this.f111676d;
                for (e eVar2 : this.f111676d.f().getAll()) {
                    C13187c c10 = eVar.f111668a;
                    String a10 = C13186b.a(eVar2.c());
                    MF.f g10 = eVar2.g();
                    UUID f10 = eVar2.f();
                    C13187c.e(c10, "UploadSet: " + a10 + " - " + g10 + " - " + f10, (C13187c.a) null, (Throwable) null, 6, (Object) null);
                    for (C13208b bVar : eVar.e().getCaptureFiles(eVar2.c())) {
                        C13187c c11 = eVar.f111668a;
                        String d10 = bVar.d();
                        C13209c f11 = bVar.f();
                        C13187c.e(c11, "  File: " + d10 + " - " + f11, (C13187c.a) null, (Throwable) null, 6, (Object) null);
                        if (bVar.h() == C13210d.Completed && bVar.f() != C13209c.UploadedAndNotified) {
                            C13187c.h(eVar.f111668a, "  invalid local+remote state for file!", (Throwable) null, 2, (Object) null);
                        }
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploadDatabase$resetUpload$2", f = "UploadDatabase.kt", l = {148}, m = "invokeSuspend")
    /* renamed from: KF.e$c */
    static final class c extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f111677c;

        /* renamed from: d  reason: collision with root package name */
        Object f111678d;

        /* renamed from: e  reason: collision with root package name */
        Object f111679e;

        /* renamed from: f  reason: collision with root package name */
        Object f111680f;

        /* renamed from: g  reason: collision with root package name */
        Object f111681g;

        /* renamed from: h  reason: collision with root package name */
        int f111682h;

        /* renamed from: i  reason: collision with root package name */
        int f111683i;

        /* renamed from: j  reason: collision with root package name */
        int f111684j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C13151e f111685k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ UUID f111686l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C13151e eVar, UUID uuid, C17164e<? super c> eVar2) {
            super(1, eVar2);
            this.f111685k = eVar;
            this.f111686l = uuid;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new c(this.f111685k, this.f111686l, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((c) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Iterable iterable;
            C13151e eVar;
            Iterator it;
            int i10;
            Object f10 = C17187b.f();
            int i11 = this.f111684j;
            if (i11 == 0) {
                y.b(obj);
                this.f111685k.f().updateLocalState(this.f111686l, MF.f.Scheduled);
                this.f111685k.f().updateUploadUUID(this.f111686l, (UUID) null);
                Iterable captureFiles = this.f111685k.e().getCaptureFiles(this.f111686l);
                C13151e eVar2 = this.f111685k;
                it = captureFiles.iterator();
                iterable = captureFiles;
                eVar = eVar2;
                i10 = 0;
            } else if (i11 == 1) {
                i10 = this.f111682h;
                C13208b bVar = (C13208b) this.f111681g;
                it = (Iterator) this.f111679e;
                eVar = (C13151e) this.f111678d;
                iterable = (Iterable) this.f111677c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                Object next = it.next();
                C13208b bVar2 = (C13208b) next;
                C13209c cVar = C13209c.NotUploaded;
                this.f111677c = iterable;
                this.f111678d = eVar;
                this.f111679e = it;
                this.f111680f = next;
                this.f111681g = bVar2;
                this.f111682h = i10;
                this.f111683i = 0;
                this.f111684j = 1;
                if (eVar.updateFileState(bVar2, cVar, this) == f10) {
                    return f10;
                }
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploadDatabase$syncRemoteData$2", f = "UploadDatabase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: KF.e$d */
    static final class d extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111687c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ UploadSetState f111688d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13151e f111689e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UUID f111690f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Map<UploadURL, String> f111691g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UploadSetState uploadSetState, C13151e eVar, UUID uuid, Map<UploadURL, String> map, C17164e<? super d> eVar2) {
            super(1, eVar2);
            this.f111688d = uploadSetState;
            this.f111689e = eVar;
            this.f111690f = uuid;
            this.f111691g = map;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new d(this.f111688d, this.f111689e, this.f111690f, this.f111691g, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((d) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f111687c == 0) {
                y.b(obj);
                Map<UploadURL, String> map = this.f111691g;
                C13151e eVar = this.f111689e;
                for (UploadURL uploadURL : this.f111688d.getUrls()) {
                    for (UploadURL uploadURL2 : map.keySet()) {
                        if (C17542s.e(uploadURL2.getPath(), uploadURL.getPath())) {
                            String str = map.get(uploadURL2);
                            if (uploadURL.getUrl() == null) {
                                throw new C13152f("No upload URL", (Exception) null, (ApiResponse) null, 6, (DefaultConstructorMarker) null);
                            } else if (str != null) {
                                eVar.e().updateUploadUrl(str, String.valueOf(uploadURL.getUrl()));
                                if (uploadURL.getCompleted()) {
                                    eVar.e().updateRemoteState(str, C13210d.Completed);
                                }
                            } else {
                                throw new C13152f("No local path found", (Exception) null, (ApiResponse) null, 6, (DefaultConstructorMarker) null);
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                e eVar2 = this.f111689e.f().get(this.f111690f);
                if (eVar2 != null) {
                    if (!C17542s.e(eVar2.i(), this.f111688d.getUuid())) {
                        this.f111689e.f().updateUploadUUID(this.f111690f, this.f111688d.getUuid());
                        this.f111689e.f().updateCreatedTs(this.f111690f, System.currentTimeMillis());
                    }
                    if (this.f111688d.getCompleted()) {
                        C13187c.e(this.f111689e.f111668a, "set upload confirmed!", (C13187c.a) null, (Throwable) null, 6, (Object) null);
                        this.f111689e.f().updateLocalState(this.f111690f, MF.f.UploadConfirmed);
                    }
                    return C16807N.f139792a;
                }
                throw new C13152f("Missing set in syncRemoteData", (Exception) null, (ApiResponse) null, 6, (DefaultConstructorMarker) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploadDatabase$updateFileState$2", f = "UploadDatabase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: KF.e$e  reason: collision with other inner class name */
    static final class C2725e extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111692c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13151e f111693d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13208b f111694e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13209c f111695f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2725e(C13151e eVar, C13208b bVar, C13209c cVar, C17164e<? super C2725e> eVar2) {
            super(1, eVar2);
            this.f111693d = eVar;
            this.f111694e = bVar;
            this.f111695f = cVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C2725e(this.f111693d, this.f111694e, this.f111695f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((C2725e) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f111692c == 0) {
                y.b(obj);
                this.f111693d.e().updateLocalState(this.f111694e.e(), this.f111695f);
                C13209c cVar = this.f111695f;
                if (cVar == C13209c.NotUploaded || cVar == C13209c.Uploading) {
                    this.f111693d.e().updateRemoteState(this.f111694e.e(), C13210d.NotCompleted);
                }
                if (this.f111695f == C13209c.Uploading) {
                    this.f111693d.e().updateUploadAttempts(this.f111694e.e(), this.f111694e.i() + 1);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploadDatabase$updateSetLocalState$2", f = "UploadDatabase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: KF.e$f */
    static final class f extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111696c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13151e f111697d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UUID f111698e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ MF.f f111699f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C13151e eVar, UUID uuid, MF.f fVar, C17164e<? super f> eVar2) {
            super(1, eVar2);
            this.f111697d = eVar;
            this.f111698e = uuid;
            this.f111699f = fVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new f(this.f111697d, this.f111698e, this.f111699f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((f) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f111696c == 0) {
                y.b(obj);
                this.f111697d.f().updateLocalState(this.f111698e, this.f111699f);
                if (this.f111699f == MF.f.Uploading) {
                    e eVar = this.f111697d.f().get(this.f111698e);
                    this.f111697d.f().updateUploadAttempts(this.f111698e, eVar != null ? eVar.h() + 1 : -1);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploadDatabase", f = "UploadDatabase.kt", l = {240}, m = "validateStates")
    /* renamed from: KF.e$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111700c;

        /* renamed from: d  reason: collision with root package name */
        Object f111701d;

        /* renamed from: e  reason: collision with root package name */
        Object f111702e;

        /* renamed from: f  reason: collision with root package name */
        Object f111703f;

        /* renamed from: g  reason: collision with root package name */
        Object f111704g;

        /* renamed from: h  reason: collision with root package name */
        Object f111705h;

        /* renamed from: i  reason: collision with root package name */
        Object f111706i;

        /* renamed from: j  reason: collision with root package name */
        Object f111707j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f111708k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C13151e f111709l;

        /* renamed from: m  reason: collision with root package name */
        int f111710m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C13151e eVar, C17164e<? super g> eVar2) {
            super(eVar2);
            this.f111709l = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111708k = obj;
            this.f111710m |= Integer.MIN_VALUE;
            return this.f111709l.validateStates(this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.upload.UploadDatabase$validateStates$2", f = "UploadDatabase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: KF.e$h */
    static final class h extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111711c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13151e f111712d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ M f111713e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ M f111714f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Set<C13209c> f111715g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ K f111716h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Set<MF.f> f111717i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C13151e eVar, M m10, M m11, Set<? extends C13209c> set, K k10, Set<? extends MF.f> set2, C17164e<? super h> eVar2) {
            super(1, eVar2);
            this.f111712d = eVar;
            this.f111713e = m10;
            this.f111714f = m11;
            this.f111715g = set;
            this.f111716h = k10;
            this.f111717i = set2;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new h(this.f111712d, this.f111713e, this.f111714f, this.f111715g, this.f111716h, this.f111717i, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((h) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            int i11;
            C17187b.f();
            if (this.f111711c == 0) {
                y.b(obj);
                UploadSetDao b10 = this.f111712d.f111669b.b();
                Set<C13209c> set = this.f111715g;
                K k10 = this.f111716h;
                C13151e eVar = this.f111712d;
                Iterator it = this.f111712d.f111669b.a().getAllFiles().iterator();
                while (true) {
                    i10 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    C13208b bVar = (C13208b) it.next();
                    if (!set.contains(bVar.f())) {
                        k10.f144344a = false;
                        C13187c.h(eVar.f111668a, "bad state: " + bVar.d() + " - " + bVar.f(), (Throwable) null, 2, (Object) null);
                    }
                }
                Iterable<e> all = b10.getAll();
                Set<MF.f> set2 = this.f111717i;
                K k11 = this.f111716h;
                C13151e eVar2 = this.f111712d;
                for (e eVar3 : all) {
                    if (!set2.contains(eVar3.g())) {
                        k11.f144344a = false;
                        C13187c.h(eVar2.f111668a, "bad state: " + C13186b.a(eVar3.c()) + " - " + eVar3.g(), (Throwable) null, 2, (Object) null);
                    }
                }
                M m10 = this.f111713e;
                boolean z10 = all instanceof Collection;
                if (!z10 || !((Collection) all).isEmpty()) {
                    i11 = 0;
                    for (e eVar4 : all) {
                        if (eVar4.g() != MF.f.Failed && eVar4.f() == null && (i11 = i11 + 1) < 0) {
                            C16877v.w();
                        }
                    }
                } else {
                    i11 = 0;
                }
                m10.f144346a = i11;
                M m11 = this.f111714f;
                if (!z10 || !((Collection) all).isEmpty()) {
                    for (e g10 : all) {
                        if (g10.g() == MF.f.Failed && (i10 = i10 + 1) < 0) {
                            C16877v.w();
                        }
                    }
                }
                m11.f144346a = i10;
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C13151e(C13187c cVar, UploadTrackerDb uploadTrackerDb) {
        C17542s.j(cVar, "log");
        C17542s.j(uploadTrackerDb, "db");
        this.f111668a = cVar;
        this.f111669b = uploadTrackerDb;
    }

    /* access modifiers changed from: private */
    public final UploadFileDao e() {
        return this.f111669b.a();
    }

    /* access modifiers changed from: private */
    public final UploadSetDao f() {
        return this.f111669b.b();
    }

    public Object deleteSet(e eVar, C17164e<? super C16807N> eVar2) {
        Object c10 = this.f111669b.c(new a(this, eVar, (C17164e<? super a>) null), eVar2);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public boolean exists(File file) {
        C17542s.j(file, "file");
        UploadFileDao e10 = e();
        String absolutePath = file.getAbsolutePath();
        C17542s.i(absolutePath, "getAbsolutePath(...)");
        return e10.exists(absolutePath);
    }

    public List<e> getAllUploadSets() {
        return f().getAll();
    }

    public List<C13208b> getFilesInSet(UUID uuid) {
        C17542s.j(uuid, "captureUUID");
        return this.f111669b.a().getCaptureFiles(uuid);
    }

    public UUID getRememberedCapture(UUID uuid) {
        C17542s.j(uuid, "sceneUUID");
        return this.f111671d.get(uuid);
    }

    public e getUploadSet(UUID uuid) {
        C17542s.j(uuid, "captureUUID");
        return f().get(uuid);
    }

    public e getUploadSetForScene(UUID uuid) {
        C17542s.j(uuid, "sceneUUID");
        List<e> withSceneUUID = f().getWithSceneUUID(uuid);
        if (withSceneUUID.size() > 1) {
            C13187c.h(this.f111668a, "multiple Sets with same Scene ID", (Throwable) null, 2, (Object) null);
        }
        return (e) C16877v.y0(withSceneUUID);
    }

    public void insertFile(C13208b bVar) {
        C17542s.j(bVar, "uploadFileDBO");
        e().insert(bVar);
    }

    public void insertSet(e eVar) {
        C17542s.j(eVar, "uploadSetDBO");
        f().insert(eVar);
    }

    public Object logCurrentState(C17164e<? super C16807N> eVar) {
        Object c10 = this.f111669b.c(new b(this, (C17164e<? super b>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public Object rememberCapture(UUID uuid, UUID uuid2, C17164e<? super C16807N> eVar) {
        this.f111671d.put(uuid, uuid2);
        return C16807N.f139792a;
    }

    public Object resetUpload(UUID uuid, C17164e<? super C16807N> eVar) {
        Object c10 = this.f111669b.c(new c(this, uuid, (C17164e<? super c>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public Object syncRemoteData(UUID uuid, Map<UploadURL, String> map, UploadSetState uploadSetState, C17164e<? super C16807N> eVar) {
        Object c10 = this.f111669b.c(new d(uploadSetState, this, uuid, map, (C17164e<? super d>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public Object updateFileState(C13208b bVar, C13209c cVar, C17164e<? super C16807N> eVar) {
        Object c10 = this.f111669b.c(new C2725e(this, bVar, cVar, (C17164e<? super C2725e>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public Object updateSetLocalState(UUID uuid, MF.f fVar, C17164e<? super C16807N> eVar) {
        Object d10 = androidx.room.y.d(this.f111669b, new f(this, uuid, fVar, (C17164e<? super f>) null), eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    public void updateSetSceneCreated(UUID uuid, UUID uuid2) {
        C17542s.j(uuid, "captureUUID");
        C17542s.j(uuid2, "sceneUUID");
        f().updateSceneCreated(uuid, uuid2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object validateStates(dI.C17164e<? super MF.C13207a> r22) {
        /*
            r21 = this;
            r8 = r21
            r9 = r22
            boolean r0 = r9 instanceof KF.C13151e.g
            if (r0 == 0) goto L_0x0018
            r0 = r9
            KF.e$g r0 = (KF.C13151e.g) r0
            int r1 = r0.f111710m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.f111710m = r1
        L_0x0016:
            r10 = r0
            goto L_0x001e
        L_0x0018:
            KF.e$g r0 = new KF.e$g
            r0.<init>(r8, r9)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r10.f111708k
            java.lang.Object r11 = eI.C17187b.f()
            int r1 = r10.f111710m
            r12 = 1
            if (r1 == 0) goto L_0x0058
            if (r1 != r12) goto L_0x0050
            java.lang.Object r1 = r10.f111707j
            MF.f[] r1 = (MF.f[]) r1
            java.lang.Object r1 = r10.f111706i
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r1 = r10.f111705h
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r1 = r10.f111704g
            kotlin.jvm.internal.M r1 = (kotlin.jvm.internal.M) r1
            java.lang.Object r2 = r10.f111703f
            kotlin.jvm.internal.M r2 = (kotlin.jvm.internal.M) r2
            java.lang.Object r3 = r10.f111702e
            kotlin.jvm.internal.K r3 = (kotlin.jvm.internal.K) r3
            java.lang.Object r4 = r10.f111701d
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r4 = r10.f111700c
            KF.e r4 = (KF.C13151e) r4
            XH.y.b(r0)
            goto L_0x00c9
        L_0x0050:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0058:
            XH.y.b(r0)
            kotlin.jvm.internal.K r13 = new kotlin.jvm.internal.K
            r13.<init>()
            r13.f144344a = r12
            kotlin.jvm.internal.M r14 = new kotlin.jvm.internal.M
            r14.<init>()
            kotlin.jvm.internal.M r15 = new kotlin.jvm.internal.M
            r15.<init>()
            MF.c r0 = MF.C13209c.UploadedAndNotified
            MF.c r1 = MF.C13209c.NotUploaded
            MF.c[] r0 = new MF.C13209c[]{r0, r1}
            java.util.Set r7 = YH.g0.h(r0)
            MF.f r0 = MF.f.Scheduled
            MF.f r1 = MF.f.UploadConfirmed
            MF.f r2 = MF.f.Failed
            MF.f[] r6 = new MF.f[]{r0, r1, r2}
            java.util.Set r5 = YH.g0.h(r6)
            com.sugarcube.app.base.upload.UploadTrackerDb r4 = r8.f111669b
            KF.e$h r3 = new KF.e$h
            r16 = 0
            r0 = r3
            r1 = r21
            r2 = r14
            r17 = r3
            r3 = r15
            r18 = r4
            r4 = r7
            r19 = r5
            r5 = r13
            r12 = r6
            r6 = r19
            r20 = r11
            r11 = r7
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.f111700c = r8
            r10.f111701d = r9
            r10.f111702e = r13
            r10.f111703f = r14
            r10.f111704g = r15
            r10.f111705h = r11
            r0 = r19
            r10.f111706i = r0
            r10.f111707j = r12
            r0 = 1
            r10.f111710m = r0
            r1 = r17
            r0 = r18
            java.lang.Object r0 = r0.c(r1, r10)
            r1 = r20
            if (r0 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            r3 = r13
            r2 = r14
            r1 = r15
        L_0x00c9:
            MF.a r0 = new MF.a
            boolean r3 = r3.f144344a
            int r2 = r2.f144346a
            int r1 = r1.f144346a
            r0.<init>(r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: KF.C13151e.validateStates(dI.e):java.lang.Object");
    }
}
