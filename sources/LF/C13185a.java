package LF;

import MF.C13207a;
import XH.C16796C;
import XH.v;
import YH.X;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\bB'\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0001\u0001\u000e¨\u0006\u000f"}, d2 = {"LLF/a;", "", "", "analyticEventName", "", "analyticProperties", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "LLF/a$a;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: LF.a  reason: case insensitive filesystem */
public abstract class C13185a {

    /* renamed from: a  reason: collision with root package name */
    private final String f111871a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f111872b;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u0001\f\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"LLF/a$a;", "LLF/a;", "", "analyticEventName", "", "", "prop", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "h", "k", "l", "j", "e", "i", "g", "b", "d", "f", "c", "LLF/a$a$a;", "LLF/a$a$b;", "LLF/a$a$c;", "LLF/a$a$d;", "LLF/a$a$e;", "LLF/a$a$f;", "LLF/a$a$g;", "LLF/a$a$h;", "LLF/a$a$i;", "LLF/a$a$j;", "LLF/a$a$k;", "LLF/a$a$l;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LF.a$a  reason: collision with other inner class name */
    public static abstract class C2736a extends C13185a {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LLF/a$a$a;", "LLF/a$a;", "LMF/e;", "captureSet", "", "LXH/v;", "", "", "fileSizeList", "<init>", "(LMF/e;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LMF/e;", "getCaptureSet", "()LMF/e;", "d", "Ljava/util/List;", "getFileSizeList", "()Ljava/util/List;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$a  reason: collision with other inner class name */
        public static final class C2737a extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final MF.e f111873c;

            /* renamed from: d  reason: collision with root package name */
            private final List<v<String, Long>> f111874d;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C2737a(MF.e r23, java.util.List<XH.v<java.lang.String, java.lang.Long>> r24) {
                /*
                    r22 = this;
                    r0 = r22
                    r1 = r23
                    r2 = r24
                    java.lang.String r3 = "captureSet"
                    kotlin.jvm.internal.C17542s.j(r1, r3)
                    java.lang.String r3 = "fileSizeList"
                    kotlin.jvm.internal.C17542s.j(r2, r3)
                    r3 = 2
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.String r4 = "UploadVersion"
                    XH.v r5 = XH.C16796C.a(r4, r3)
                    java.util.UUID r3 = r23.c()
                    java.lang.String r4 = "CaptureId"
                    XH.v r6 = XH.C16796C.a(r4, r3)
                    java.lang.String r3 = "UploadId"
                    java.util.UUID r4 = r23.i()
                    XH.v r7 = XH.C16796C.a(r3, r4)
                    java.lang.String r3 = "SceneId"
                    java.util.UUID r4 = r23.f()
                    XH.v r8 = XH.C16796C.a(r3, r4)
                    java.lang.String r3 = "CaptureType"
                    java.lang.String r4 = r23.b()
                    XH.v r9 = XH.C16796C.a(r3, r4)
                    java.lang.String r3 = "CaptureStrategy"
                    java.lang.String r4 = r23.a()
                    XH.v r10 = XH.C16796C.a(r3, r4)
                    java.lang.String r3 = "RoomType"
                    java.lang.String r4 = r23.e()
                    XH.v r11 = XH.C16796C.a(r3, r4)
                    java.lang.String r3 = "RoomName"
                    java.lang.String r4 = r23.d()
                    XH.v r12 = XH.C16796C.a(r3, r4)
                    int r3 = r23.h()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.String r4 = "UploadAttempts"
                    XH.v r13 = XH.C16796C.a(r4, r3)
                    java.lang.String r3 = "UploadSetCreatedTs"
                    java.lang.Long r4 = r23.j()
                    XH.v r14 = XH.C16796C.a(r3, r4)
                    MF.f r3 = r23.g()
                    java.lang.String r3 = r3.toString()
                    java.lang.String r4 = "InitialState"
                    XH.v r15 = XH.C16796C.a(r4, r3)
                    MF.f r3 = r23.g()
                    java.lang.String r3 = r3.toString()
                    java.lang.String r4 = "UploadState"
                    XH.v r16 = XH.C16796C.a(r4, r3)
                    java.lang.String r3 = r24.toString()
                    java.lang.String r4 = "FileSizeList"
                    XH.v r17 = XH.C16796C.a(r4, r3)
                    r3 = r2
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    java.util.Iterator r3 = r3.iterator()
                    r18 = 0
                L_0x00a8:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x00c1
                    java.lang.Object r4 = r3.next()
                    XH.v r4 = (XH.v) r4
                    java.lang.Object r4 = r4.d()
                    java.lang.Number r4 = (java.lang.Number) r4
                    long r20 = r4.longValue()
                    long r18 = r18 + r20
                    goto L_0x00a8
                L_0x00c1:
                    java.lang.String r3 = java.lang.String.valueOf(r18)
                    java.lang.String r4 = "FilesTotalSize"
                    XH.v r18 = XH.C16796C.a(r4, r3)
                    XH.v[] r3 = new XH.v[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
                    java.util.Map r3 = YH.X.m(r3)
                    r4 = 0
                    java.lang.String r5 = "Added"
                    r0.<init>(r5, r3, r4)
                    r0.f111873c = r1
                    r0.f111874d = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: LF.C13185a.C2736a.C2737a.<init>(MF.e, java.util.List):void");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2737a)) {
                    return false;
                }
                C2737a aVar = (C2737a) obj;
                return C17542s.e(this.f111873c, aVar.f111873c) && C17542s.e(this.f111874d, aVar.f111874d);
            }

            public int hashCode() {
                return (this.f111873c.hashCode() * 31) + this.f111874d.hashCode();
            }

            public String toString() {
                MF.e eVar = this.f111873c;
                List<v<String, Long>> list = this.f111874d;
                return "Added(captureSet=" + eVar + ", fileSizeList=" + list + ")";
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LLF/a$a$b;", "LLF/a$a;", "LMF/e;", "captureSet", "", "jobService", "success", "Ljava/util/UUID;", "sceneUuid", "<init>", "(LMF/e;ZZLjava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "LMF/e;", "getCaptureSet", "()LMF/e;", "d", "Z", "getJobService", "()Z", "e", "getSuccess", "f", "Ljava/util/UUID;", "getSceneUuid", "()Ljava/util/UUID;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$b */
        public static final class b extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final MF.e f111875c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f111876d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f111877e;

            /* renamed from: f  reason: collision with root package name */
            private final UUID f111878f;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ b(MF.e eVar, boolean z10, boolean z11, UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(eVar, z10, z11, (i10 & 8) != 0 ? null : uuid);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f111875c, bVar.f111875c) && this.f111876d == bVar.f111876d && this.f111877e == bVar.f111877e && C17542s.e(this.f111878f, bVar.f111878f);
            }

            public int hashCode() {
                int hashCode = ((((this.f111875c.hashCode() * 31) + Boolean.hashCode(this.f111876d)) * 31) + Boolean.hashCode(this.f111877e)) * 31;
                UUID uuid = this.f111878f;
                return hashCode + (uuid == null ? 0 : uuid.hashCode());
            }

            public String toString() {
                MF.e eVar = this.f111875c;
                boolean z10 = this.f111876d;
                boolean z11 = this.f111877e;
                UUID uuid = this.f111878f;
                return "CreateScene(captureSet=" + eVar + ", jobService=" + z10 + ", success=" + z11 + ", sceneUuid=" + uuid + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(MF.e eVar, boolean z10, boolean z11, UUID uuid) {
                super("CreateScene", X.m(C16796C.a("UploadVersion", 2), C16796C.a("JobService", Boolean.valueOf(z10)), C16796C.a("Success", Boolean.valueOf(z11)), C16796C.a("CaptureId", eVar.c()), C16796C.a("UploadId", eVar.i()), C16796C.a("SceneId", eVar.f()), C16796C.a("CaptureType", eVar.b()), C16796C.a("CaptureStrategy", eVar.a()), C16796C.a("RoomType", eVar.e()), C16796C.a("RoomName", eVar.d()), C16796C.a("UploadAttempts", Integer.valueOf(eVar.h())), C16796C.a("UploadSetCreatedTs", eVar.j()), C16796C.a("UploadState", eVar.g().toString())), (DefaultConstructorMarker) null);
                MF.e eVar2 = eVar;
                C17542s.j(eVar2, "captureSet");
                this.f111875c = eVar2;
                this.f111876d = z10;
                this.f111877e = z11;
                this.f111878f = uuid;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LLF/a$a$c;", "LLF/a$a;", "LMF/e;", "captureSet", "", "jobService", "<init>", "(LMF/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "LMF/e;", "getCaptureSet", "()LMF/e;", "d", "Z", "getJobService", "()Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$c */
        public static final class c extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final MF.e f111879c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f111880d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(MF.e eVar, boolean z10) {
                super("Deleted", X.m(C16796C.a("UploadVersion", 2), C16796C.a("JobService", Boolean.valueOf(z10)), C16796C.a("CaptureId", eVar.c()), C16796C.a("UploadId", eVar.i()), C16796C.a("SceneId", eVar.f()), C16796C.a("CaptureType", eVar.b()), C16796C.a("CaptureStrategy", eVar.a()), C16796C.a("RoomType", eVar.e()), C16796C.a("RoomName", eVar.d()), C16796C.a("UploadAttempts", Integer.valueOf(eVar.h())), C16796C.a("UploadSetCreatedTs", eVar.j()), C16796C.a("UploadState", eVar.g().toString())), (DefaultConstructorMarker) null);
                MF.e eVar2 = eVar;
                C17542s.j(eVar2, "captureSet");
                this.f111879c = eVar2;
                this.f111880d = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f111879c, cVar.f111879c) && this.f111880d == cVar.f111880d;
            }

            public int hashCode() {
                return (this.f111879c.hashCode() * 31) + Boolean.hashCode(this.f111880d);
            }

            public String toString() {
                MF.e eVar = this.f111879c;
                boolean z10 = this.f111880d;
                return "Deleted(captureSet=" + eVar + ", jobService=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"LLF/a$a$d;", "LLF/a$a;", "LMF/e;", "captureSet", "", "jobService", "success", "", "uploadError", "uploadErrorRaw", "<init>", "(LMF/e;ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "LMF/e;", "getCaptureSet", "()LMF/e;", "d", "Z", "getJobService", "()Z", "e", "getSuccess", "f", "Ljava/lang/String;", "getUploadError", "g", "getUploadErrorRaw", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$d */
        public static final class d extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final MF.e f111881c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f111882d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f111883e;

            /* renamed from: f  reason: collision with root package name */
            private final String f111884f;

            /* renamed from: g  reason: collision with root package name */
            private final String f111885g;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public d(MF.e r24, boolean r25, boolean r26, java.lang.String r27, java.lang.String r28) {
                /*
                    r23 = this;
                    r0 = r23
                    r1 = r24
                    r2 = r26
                    r3 = r27
                    r4 = r28
                    java.lang.String r5 = "captureSet"
                    kotlin.jvm.internal.C17542s.j(r1, r5)
                    r5 = 2
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    java.lang.String r6 = "UploadVersion"
                    XH.v r7 = XH.C16796C.a(r6, r5)
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r25)
                    java.lang.String r6 = "JobService"
                    XH.v r8 = XH.C16796C.a(r6, r5)
                    java.util.UUID r5 = r24.c()
                    java.lang.String r6 = "CaptureId"
                    XH.v r9 = XH.C16796C.a(r6, r5)
                    java.lang.String r5 = "UploadId"
                    java.util.UUID r6 = r24.i()
                    XH.v r10 = XH.C16796C.a(r5, r6)
                    java.lang.String r5 = "SceneId"
                    java.util.UUID r6 = r24.f()
                    XH.v r11 = XH.C16796C.a(r5, r6)
                    java.lang.String r5 = "CaptureType"
                    java.lang.String r6 = r24.b()
                    XH.v r12 = XH.C16796C.a(r5, r6)
                    java.lang.String r5 = "CaptureStrategy"
                    java.lang.String r6 = r24.a()
                    XH.v r13 = XH.C16796C.a(r5, r6)
                    java.lang.String r5 = "RoomType"
                    java.lang.String r6 = r24.e()
                    XH.v r14 = XH.C16796C.a(r5, r6)
                    java.lang.String r5 = "RoomName"
                    java.lang.String r6 = r24.d()
                    XH.v r15 = XH.C16796C.a(r5, r6)
                    int r5 = r24.h()
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    java.lang.String r6 = "UploadAttempts"
                    XH.v r16 = XH.C16796C.a(r6, r5)
                    java.lang.String r5 = "UploadSetCreatedTs"
                    java.lang.Long r1 = r24.j()
                    XH.v r17 = XH.C16796C.a(r5, r1)
                    MF.f r1 = r24.g()
                    java.lang.String r1 = r1.toString()
                    java.lang.String r5 = "UploadState"
                    XH.v r18 = XH.C16796C.a(r5, r1)
                    if (r2 == 0) goto L_0x0095
                    java.lang.String r1 = "Success"
                    goto L_0x0097
                L_0x0095:
                    java.lang.String r1 = "Failed"
                L_0x0097:
                    java.lang.String r5 = "Result"
                    XH.v r19 = XH.C16796C.a(r5, r1)
                    java.lang.String r1 = "UploadError"
                    XH.v r20 = XH.C16796C.a(r1, r3)
                    java.lang.String r1 = "UploadErrorRaw"
                    XH.v r21 = XH.C16796C.a(r1, r4)
                    int r1 = r24.h()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    XH.v r22 = XH.C16796C.a(r6, r1)
                    XH.v[] r1 = new XH.v[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}
                    java.util.Map r1 = YH.X.m(r1)
                    r5 = 0
                    java.lang.String r6 = "End"
                    r0.<init>(r6, r1, r5)
                    r1 = r24
                    r0.f111881c = r1
                    r1 = r25
                    r0.f111882d = r1
                    r0.f111883e = r2
                    r0.f111884f = r3
                    r0.f111885g = r4
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: LF.C13185a.C2736a.d.<init>(MF.e, boolean, boolean, java.lang.String, java.lang.String):void");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f111881c, dVar.f111881c) && this.f111882d == dVar.f111882d && this.f111883e == dVar.f111883e && C17542s.e(this.f111884f, dVar.f111884f) && C17542s.e(this.f111885g, dVar.f111885g);
            }

            public int hashCode() {
                int hashCode = ((((this.f111881c.hashCode() * 31) + Boolean.hashCode(this.f111882d)) * 31) + Boolean.hashCode(this.f111883e)) * 31;
                String str = this.f111884f;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f111885g;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                MF.e eVar = this.f111881c;
                boolean z10 = this.f111882d;
                boolean z11 = this.f111883e;
                String str = this.f111884f;
                String str2 = this.f111885g;
                return "End(captureSet=" + eVar + ", jobService=" + z10 + ", success=" + z11 + ", uploadError=" + str + ", uploadErrorRaw=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"LLF/a$a$e;", "LLF/a$a;", "", "jobService", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "message", "<init>", "(ZLjava/lang/Exception;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "getJobService", "()Z", "d", "Ljava/lang/Exception;", "getE", "()Ljava/lang/Exception;", "Ljava/lang/String;", "getMessage", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$e */
        public static final class e extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final boolean f111886c;

            /* renamed from: d  reason: collision with root package name */
            private final Exception f111887d;

            /* renamed from: e  reason: collision with root package name */
            private final String f111888e;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ e(boolean z10, Exception exc, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(z10, (i10 & 2) != 0 ? null : exc, (i10 & 4) != 0 ? null : str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f111886c == eVar.f111886c && C17542s.e(this.f111887d, eVar.f111887d) && C17542s.e(this.f111888e, eVar.f111888e);
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.f111886c) * 31;
                Exception exc = this.f111887d;
                int i10 = 0;
                int hashCode2 = (hashCode + (exc == null ? 0 : exc.hashCode())) * 31;
                String str = this.f111888e;
                if (str != null) {
                    i10 = str.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                boolean z10 = this.f111886c;
                Exception exc = this.f111887d;
                String str = this.f111888e;
                return "Error(jobService=" + z10 + ", e=" + exc + ", message=" + str + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(boolean z10, Exception exc, String str) {
                super("Error", X.m(C16796C.a("UploadVersion", 2), C16796C.a("JobService", Boolean.valueOf(z10)), C16796C.a("Exception", exc != null ? exc.getMessage() : null), C16796C.a("Message", str)), (DefaultConstructorMarker) null);
                this.f111886c = z10;
                this.f111887d = exc;
                this.f111888e = str;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010¨\u0006$"}, d2 = {"LLF/a$a$f;", "LLF/a$a;", "LMF/e;", "captureSet", "", "jobService", "Ljava/util/UUID;", "sceneUuid", "", "sceneId", "<init>", "(LMF/e;ZLjava/util/UUID;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "LMF/e;", "getCaptureSet", "()LMF/e;", "d", "Z", "getJobService", "()Z", "e", "Ljava/util/UUID;", "getSceneUuid", "()Ljava/util/UUID;", "f", "I", "getSceneId", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$f */
        public static final class f extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final MF.e f111889c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f111890d;

            /* renamed from: e  reason: collision with root package name */
            private final UUID f111891e;

            /* renamed from: f  reason: collision with root package name */
            private final int f111892f;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public f(MF.e r20, boolean r21, java.util.UUID r22, int r23) {
                /*
                    r19 = this;
                    r0 = r19
                    r1 = r20
                    r2 = r22
                    java.lang.String r3 = "captureSet"
                    kotlin.jvm.internal.C17542s.j(r1, r3)
                    java.lang.String r3 = "sceneUuid"
                    kotlin.jvm.internal.C17542s.j(r2, r3)
                    r3 = 2
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.String r4 = "UploadVersion"
                    XH.v r5 = XH.C16796C.a(r4, r3)
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r21)
                    java.lang.String r4 = "JobService"
                    XH.v r6 = XH.C16796C.a(r4, r3)
                    java.util.UUID r3 = r20.c()
                    java.lang.String r4 = "CaptureId"
                    XH.v r7 = XH.C16796C.a(r4, r3)
                    java.lang.String r3 = "UploadId"
                    java.util.UUID r4 = r20.i()
                    XH.v r8 = XH.C16796C.a(r3, r4)
                    java.lang.String r3 = "SceneId"
                    java.util.UUID r4 = r20.f()
                    XH.v r9 = XH.C16796C.a(r3, r4)
                    java.lang.String r3 = "CaptureType"
                    java.lang.String r4 = r20.b()
                    XH.v r10 = XH.C16796C.a(r3, r4)
                    java.lang.String r3 = "CaptureStrategy"
                    java.lang.String r4 = r20.a()
                    XH.v r11 = XH.C16796C.a(r3, r4)
                    java.lang.String r3 = "RoomType"
                    java.lang.String r4 = r20.e()
                    XH.v r12 = XH.C16796C.a(r3, r4)
                    java.lang.String r3 = "RoomName"
                    java.lang.String r4 = r20.d()
                    XH.v r13 = XH.C16796C.a(r3, r4)
                    int r3 = r20.h()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.String r4 = "UploadAttempts"
                    XH.v r14 = XH.C16796C.a(r4, r3)
                    java.lang.String r3 = "UploadSetCreatedTs"
                    java.lang.Long r4 = r20.j()
                    XH.v r15 = XH.C16796C.a(r3, r4)
                    MF.f r3 = r20.g()
                    java.lang.String r3 = r3.toString()
                    java.lang.String r4 = "UploadState"
                    XH.v r16 = XH.C16796C.a(r4, r3)
                    java.lang.String r3 = "RoomUUID"
                    XH.v r17 = XH.C16796C.a(r3, r2)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
                    java.lang.String r4 = "RoomId"
                    XH.v r18 = XH.C16796C.a(r4, r3)
                    XH.v[] r3 = new XH.v[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
                    java.util.Map r3 = YH.X.m(r3)
                    r4 = 0
                    java.lang.String r5 = "ReplacedWithScene"
                    r0.<init>(r5, r3, r4)
                    r0.f111889c = r1
                    r1 = r21
                    r0.f111890d = r1
                    r0.f111891e = r2
                    r1 = r23
                    r0.f111892f = r1
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: LF.C13185a.C2736a.f.<init>(MF.e, boolean, java.util.UUID, int):void");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return C17542s.e(this.f111889c, fVar.f111889c) && this.f111890d == fVar.f111890d && C17542s.e(this.f111891e, fVar.f111891e) && this.f111892f == fVar.f111892f;
            }

            public int hashCode() {
                return (((((this.f111889c.hashCode() * 31) + Boolean.hashCode(this.f111890d)) * 31) + this.f111891e.hashCode()) * 31) + Integer.hashCode(this.f111892f);
            }

            public String toString() {
                MF.e eVar = this.f111889c;
                boolean z10 = this.f111890d;
                UUID uuid = this.f111891e;
                int i10 = this.f111892f;
                return "ReplacedWithScene(captureSet=" + eVar + ", jobService=" + z10 + ", sceneUuid=" + uuid + ", sceneId=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LLF/a$a$g;", "LLF/a$a;", "LMF/e;", "captureSet", "", "jobService", "<init>", "(LMF/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "LMF/e;", "getCaptureSet", "()LMF/e;", "d", "Z", "getJobService", "()Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$g */
        public static final class g extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final MF.e f111893c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f111894d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public g(MF.e eVar, boolean z10) {
                super("Start", X.m(C16796C.a("UploadVersion", 2), C16796C.a("JobService", Boolean.valueOf(z10)), C16796C.a("CaptureId", eVar.c()), C16796C.a("UploadId", eVar.i()), C16796C.a("SceneId", eVar.f()), C16796C.a("CaptureType", eVar.b()), C16796C.a("CaptureStrategy", eVar.a()), C16796C.a("RoomType", eVar.e()), C16796C.a("RoomName", eVar.d()), C16796C.a("UploadAttempts", Integer.valueOf(eVar.h())), C16796C.a("UploadSetCreatedTs", eVar.j()), C16796C.a("UploadState", eVar.g().toString())), (DefaultConstructorMarker) null);
                MF.e eVar2 = eVar;
                C17542s.j(eVar2, "captureSet");
                this.f111893c = eVar2;
                this.f111894d = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return C17542s.e(this.f111893c, gVar.f111893c) && this.f111894d == gVar.f111894d;
            }

            public int hashCode() {
                return (this.f111893c.hashCode() * 31) + Boolean.hashCode(this.f111894d);
            }

            public String toString() {
                MF.e eVar = this.f111893c;
                boolean z10 = this.f111894d;
                return "Start(captureSet=" + eVar + ", jobService=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"LLF/a$a$h;", "LLF/a$a;", "", "jobService", "retry", "forcedRetry", "LMF/a;", "dataState", "", "reason", "<init>", "(ZZZLMF/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "getJobService", "()Z", "d", "getRetry", "e", "getForcedRetry", "f", "LMF/a;", "getDataState", "()LMF/a;", "g", "Ljava/lang/String;", "getReason", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$h */
        public static final class h extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final boolean f111895c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f111896d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f111897e;

            /* renamed from: f  reason: collision with root package name */
            private final C13207a f111898f;

            /* renamed from: g  reason: collision with root package name */
            private final String f111899g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public h(boolean z10, boolean z11, boolean z12, C13207a aVar, String str) {
                super("TasksScheduled", X.m(C16796C.a("UploadVersion", 2), C16796C.a("JobService", Boolean.valueOf(z10)), C16796C.a("Settled", aVar != null ? Boolean.valueOf(aVar.c()) : null), C16796C.a("NumUploadsPending", aVar != null ? Integer.valueOf(aVar.b()) : null), C16796C.a("NumUploadsFailed", aVar != null ? Integer.valueOf(aVar.a()) : null), C16796C.a("ForceRetry", Boolean.valueOf(z12)), C16796C.a("Reason", str)), (DefaultConstructorMarker) null);
                C17542s.j(str, "reason");
                this.f111895c = z10;
                this.f111896d = z11;
                this.f111897e = z12;
                this.f111898f = aVar;
                this.f111899g = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.f111895c == hVar.f111895c && this.f111896d == hVar.f111896d && this.f111897e == hVar.f111897e && C17542s.e(this.f111898f, hVar.f111898f) && C17542s.e(this.f111899g, hVar.f111899g);
            }

            public int hashCode() {
                int hashCode = ((((Boolean.hashCode(this.f111895c) * 31) + Boolean.hashCode(this.f111896d)) * 31) + Boolean.hashCode(this.f111897e)) * 31;
                C13207a aVar = this.f111898f;
                return ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f111899g.hashCode();
            }

            public String toString() {
                boolean z10 = this.f111895c;
                boolean z11 = this.f111896d;
                boolean z12 = this.f111897e;
                C13207a aVar = this.f111898f;
                String str = this.f111899g;
                return "TasksScheduled(jobService=" + z10 + ", retry=" + z11 + ", forcedRetry=" + z12 + ", dataState=" + aVar + ", reason=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LLF/a$a$i;", "LLF/a$a;", "", "jobService", "LMF/e;", "captureSet", "<init>", "(ZLMF/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "getJobService", "()Z", "d", "LMF/e;", "getCaptureSet", "()LMF/e;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$i */
        public static final class i extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final boolean f111900c;

            /* renamed from: d  reason: collision with root package name */
            private final MF.e f111901d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public i(boolean z10, MF.e eVar) {
                super("UploadReset", X.m(C16796C.a("UploadVersion", 2), C16796C.a("JobService", Boolean.valueOf(z10)), C16796C.a("CaptureId", eVar.c()), C16796C.a("UploadId", eVar.i()), C16796C.a("SceneId", eVar.f()), C16796C.a("CaptureType", eVar.b()), C16796C.a("CaptureStrategy", eVar.a()), C16796C.a("RoomType", eVar.e()), C16796C.a("RoomName", eVar.d()), C16796C.a("UploadAttempts", Integer.valueOf(eVar.h())), C16796C.a("UploadSetCreatedTs", eVar.j()), C16796C.a("UploadState", eVar.g().toString())), (DefaultConstructorMarker) null);
                MF.e eVar2 = eVar;
                C17542s.j(eVar2, "captureSet");
                this.f111900c = z10;
                this.f111901d = eVar2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return this.f111900c == iVar.f111900c && C17542s.e(this.f111901d, iVar.f111901d);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f111900c) * 31) + this.f111901d.hashCode();
            }

            public String toString() {
                boolean z10 = this.f111900c;
                MF.e eVar = this.f111901d;
                return "UploadReset(jobService=" + z10 + ", captureSet=" + eVar + ")";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LLF/a$a$j;", "LLF/a$a;", "", "jobService", "erred", "willRetry", "loggedIn", "LMF/a;", "dataState", "<init>", "(ZZZZLMF/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "getJobService", "()Z", "d", "getErred", "e", "getWillRetry", "f", "getLoggedIn", "g", "LMF/a;", "getDataState", "()LMF/a;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$j */
        public static final class j extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final boolean f111902c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f111903d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f111904e;

            /* renamed from: f  reason: collision with root package name */
            private final boolean f111905f;

            /* renamed from: g  reason: collision with root package name */
            private final C13207a f111906g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public j(boolean z10, boolean z11, boolean z12, boolean z13, C13207a aVar) {
                super("WorkEnded", X.m(C16796C.a("UploadVersion", 2), C16796C.a("JobService", Boolean.valueOf(z10)), C16796C.a("Erred", Boolean.valueOf(z11)), C16796C.a("WillRetry", Boolean.valueOf(z12)), C16796C.a("LoggedIn", Boolean.valueOf(z13)), C16796C.a("Settled", Boolean.valueOf(aVar.c())), C16796C.a("NumUploadsPending", Integer.valueOf(aVar.b())), C16796C.a("NumUploadsFailed", Integer.valueOf(aVar.a()))), (DefaultConstructorMarker) null);
                C17542s.j(aVar, "dataState");
                this.f111902c = z10;
                this.f111903d = z11;
                this.f111904e = z12;
                this.f111905f = z13;
                this.f111906g = aVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.f111902c == jVar.f111902c && this.f111903d == jVar.f111903d && this.f111904e == jVar.f111904e && this.f111905f == jVar.f111905f && C17542s.e(this.f111906g, jVar.f111906g);
            }

            public int hashCode() {
                return (((((((Boolean.hashCode(this.f111902c) * 31) + Boolean.hashCode(this.f111903d)) * 31) + Boolean.hashCode(this.f111904e)) * 31) + Boolean.hashCode(this.f111905f)) * 31) + this.f111906g.hashCode();
            }

            public String toString() {
                boolean z10 = this.f111902c;
                boolean z11 = this.f111903d;
                boolean z12 = this.f111904e;
                boolean z13 = this.f111905f;
                C13207a aVar = this.f111906g;
                return "WorkEnded(jobService=" + z10 + ", erred=" + z11 + ", willRetry=" + z12 + ", loggedIn=" + z13 + ", dataState=" + aVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"LLF/a$a$k;", "LLF/a$a;", "", "jobService", "", "reason", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "getJobService", "()Z", "d", "Ljava/lang/String;", "getReason", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$k */
        public static final class k extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final boolean f111907c;

            /* renamed from: d  reason: collision with root package name */
            private final String f111908d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public k(boolean z10, String str) {
                super("WorkSkipped", X.m(C16796C.a("UploadVersion", 2), C16796C.a("JobService", Boolean.valueOf(z10)), C16796C.a("Reason", str)), (DefaultConstructorMarker) null);
                C17542s.j(str, "reason");
                this.f111907c = z10;
                this.f111908d = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return this.f111907c == kVar.f111907c && C17542s.e(this.f111908d, kVar.f111908d);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f111907c) * 31) + this.f111908d.hashCode();
            }

            public String toString() {
                boolean z10 = this.f111907c;
                String str = this.f111908d;
                return "WorkSkipped(jobService=" + z10 + ", reason=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LLF/a$a$l;", "LLF/a$a;", "", "jobService", "forcedRetry", "", "runAttempts", "LMF/a;", "dataState", "<init>", "(ZZILMF/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "getJobService", "()Z", "d", "getForcedRetry", "e", "I", "getRunAttempts", "f", "LMF/a;", "getDataState", "()LMF/a;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: LF.a$a$l */
        public static final class l extends C2736a {

            /* renamed from: c  reason: collision with root package name */
            private final boolean f111909c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f111910d;

            /* renamed from: e  reason: collision with root package name */
            private final int f111911e;

            /* renamed from: f  reason: collision with root package name */
            private final C13207a f111912f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public l(boolean z10, boolean z11, int i10, C13207a aVar) {
                super("WorkStarted", X.m(C16796C.a("UploadVersion", 2), C16796C.a("JobService", Boolean.valueOf(z10)), C16796C.a("Settled", Boolean.valueOf(aVar.c())), C16796C.a("NumUploadsPending", Integer.valueOf(aVar.b())), C16796C.a("NumUploadsFailed", Integer.valueOf(aVar.a())), C16796C.a("RunAttempts", Integer.valueOf(i10)), C16796C.a("ForceRetry", Boolean.valueOf(z11))), (DefaultConstructorMarker) null);
                C17542s.j(aVar, "dataState");
                this.f111909c = z10;
                this.f111910d = z11;
                this.f111911e = i10;
                this.f111912f = aVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return this.f111909c == lVar.f111909c && this.f111910d == lVar.f111910d && this.f111911e == lVar.f111911e && C17542s.e(this.f111912f, lVar.f111912f);
            }

            public int hashCode() {
                return (((((Boolean.hashCode(this.f111909c) * 31) + Boolean.hashCode(this.f111910d)) * 31) + Integer.hashCode(this.f111911e)) * 31) + this.f111912f.hashCode();
            }

            public String toString() {
                boolean z10 = this.f111909c;
                boolean z11 = this.f111910d;
                int i10 = this.f111911e;
                C13207a aVar = this.f111912f;
                return "WorkStarted(jobService=" + z10 + ", forcedRetry=" + z11 + ", runAttempts=" + i10 + ", dataState=" + aVar + ")";
            }
        }

        public /* synthetic */ C2736a(String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, map);
        }

        private C2736a(String str, Map<String, ? extends Object> map) {
            super("Capture.Upload." + str, map, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C13185a(String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map);
    }

    public final String a() {
        return this.f111871a;
    }

    public final Map<String, Object> b() {
        return this.f111872b;
    }

    private C13185a(String str, Map<String, ? extends Object> map) {
        this.f111871a = str;
        this.f111872b = map;
    }
}
