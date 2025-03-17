package KF;

import HJ.C15854t;
import LF.C13187c;
import MF.C13208b;
import MF.C13209c;
import MF.C13210d;
import OE.C13309a;
import XH.C16796C;
import XH.v;
import YH.X;
import YH.g0;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.app.base.network.ApiResponse;
import com.sugarcube.core.network.models.UploadURL;
import jI.C17423j;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\"$B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b#\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010&¨\u0006'"}, d2 = {"LKF/a;", "", "LOE/a;", "appEnvironment", "LLF/c;", "uploadLogger", "<init>", "(LOE/a;LLF/c;)V", "Ljava/io/File;", "c", "()Ljava/io/File;", "d", "file", "i", "(Ljava/io/File;)Ljava/io/File;", "inFile", "Ljava/util/UUID;", "captureUuid", "LMF/b;", "f", "(Ljava/io/File;Ljava/util/UUID;)LMF/b;", "Lcom/sugarcube/core/network/models/UploadURL;", "g", "(Ljava/io/File;)Lcom/sugarcube/core/network/models/UploadURL;", "", "fileName", "h", "(Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;", "Lcom/sugarcube/core/network/models/SessionMeta;", "k", "(Ljava/util/UUID;)Lcom/sugarcube/core/network/models/SessionMeta;", "uuid", "j", "(Ljava/util/UUID;)Ljava/io/File;", "b", "e", "a", "LOE/a;", "LLF/c;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: KF.a  reason: case insensitive filesystem */
public final class C13147a {

    /* renamed from: c  reason: collision with root package name */
    public static final C2721a f111634c = new C2721a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f111635d = 8;

    /* renamed from: e  reason: collision with root package name */
    private static final String f111636e = "sugarcube-capture/";
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, b> f111637f;

    /* renamed from: a  reason: collision with root package name */
    private final C13309a f111638a;

    /* renamed from: b  reason: collision with root package name */
    private final C13187c f111639b;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00068\u0002XD¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b#\u0010\u0015R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"LKF/a$a;", "", "<init>", "()V", "Ljava/io/File;", "file", "", "i", "(Ljava/io/File;)Ljava/lang/String;", "LKF/a$b;", "g", "(Ljava/io/File;)LKF/a$b;", "h", "e", "inFile", "outFile", "LXH/N;", "j", "(Ljava/io/File;Ljava/io/File;)V", "f", "VIDEO_FILE_NAME", "Ljava/lang/String;", "CAPTURE_META_FILE_NAME", "PANO_META_FILE_NAME", "QUALITY_META_FILE_NAME", "SESSION_META_FILE_NAME", "VIDEO_META_FILE_NAME", "PANO_PREVIEW_FILE_NAME", "PANO_ALIGNMENT_HEIF_FILE_NAME", "PANO_ALIGNMENT_JPG_FILE_NAME", "MOSAIC_FILE_NAME", "AUTOMATIC_LOG_FILE_NAME", "COLOR_PANO_0_FILE", "COLOR_PANO_1_FILE", "BASE_CAPTURE_DIR_NAME", "BASE_MOSAIC_DIR_NAME", "", "fileToFolder", "Ljava/util/Map;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: KF.a$a  reason: collision with other inner class name */
    public static final class C2721a {
        public /* synthetic */ C2721a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String e(File file) {
            String s10 = C17542s.e(C17423j.s(file), "zip") ? C17423j.s(new File(C17423j.t(file))) : C17423j.s(file);
            switch (s10.hashCode()) {
                case 105441:
                    if (s10.equals("jpg")) {
                        return "image/jpeg";
                    }
                    break;
                case 108273:
                    if (s10.equals("mp4")) {
                        return "video/mp4";
                    }
                    break;
                case 111145:
                    if (s10.equals("png")) {
                        return "image/png";
                    }
                    break;
                case 115312:
                    if (s10.equals("txt")) {
                        return "application/txt";
                    }
                    break;
                case 3198682:
                    if (s10.equals("heif")) {
                        return "image/heif";
                    }
                    break;
                case 3271912:
                    if (s10.equals(FeatureVariable.JSON_TYPE)) {
                        return "application/json";
                    }
                    break;
                case 3645340:
                    if (s10.equals("webp")) {
                        return "image/webp";
                    }
                    break;
            }
            String name = file.getName();
            throw new C13152f("Unknown file type " + name, (Exception) null, (ApiResponse) null, 6, (DefaultConstructorMarker) null);
        }

        private final b g(File file) {
            b bVar = (b) C13147a.f111637f.get(C17542s.e(C17423j.s(file), "zip") ? C17423j.t(file) : file.getName());
            if (bVar != null) {
                return bVar;
            }
            String name = file.getName();
            C17542s.i(name, "getName(...)");
            if (C15854t.W(name, "colorPano_0", false, 2, (Object) null)) {
                return b.C2723b.f111642b;
            }
            String name2 = file.getName();
            C17542s.i(name2, "getName(...)");
            if (C15854t.W(name2, "colorPano_1", false, 2, (Object) null)) {
                return b.c.f111643b;
            }
            String name3 = file.getName();
            throw new C13152f("Unknown file " + name3, (Exception) null, (ApiResponse) null, 6, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public final String h(File file) {
            String t10 = C17542s.e(C17423j.s(file), "zip") ? C17423j.t(file) : file.getName();
            b g10 = g(file);
            if (g10.a() != null) {
                String a10 = g10.a();
                return a10 + "/" + t10;
            }
            C17542s.g(t10);
            return t10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Throwable} */
        /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Throwable] */
        /* JADX WARNING: type inference failed for: r7v7 */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x004e A[SYNTHETIC, Splitter:B:25:0x004e] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String i(java.io.File r7) {
            /*
                r6 = this;
                WK.s$a r0 = WK.C16783s.f139708d
                WK.L r1 = WK.y.b()
                WK.s r0 = r0.b(r1)
                r1 = 0
                WK.l r2 = WK.C16777l.f139691b     // Catch:{ all -> 0x003e }
                WK.E$a r3 = WK.C16762E.f139592b     // Catch:{ all -> 0x003e }
                r4 = 0
                r5 = 1
                WK.E r7 = WK.C16762E.a.d(r3, r7, r4, r5, r1)     // Catch:{ all -> 0x003e }
                WK.N r7 = r2.B(r7)     // Catch:{ all -> 0x003e }
                WK.g r7 = WK.y.d(r7)     // Catch:{ all -> 0x003e }
                r7.L2(r0)     // Catch:{ all -> 0x0032 }
                WK.h r2 = r0.c()     // Catch:{ all -> 0x0032 }
                java.lang.String r2 = r2.G()     // Catch:{ all -> 0x0032 }
                if (r7 == 0) goto L_0x0030
                r7.close()     // Catch:{ all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r7 = move-exception
                goto L_0x0042
            L_0x0030:
                r7 = r1
                goto L_0x0042
            L_0x0032:
                r2 = move-exception
                if (r7 == 0) goto L_0x0040
                r7.close()     // Catch:{ all -> 0x0039 }
                goto L_0x0040
            L_0x0039:
                r7 = move-exception
                XH.C16816g.a(r2, r7)     // Catch:{ all -> 0x003e }
                goto L_0x0040
            L_0x003e:
                r7 = move-exception
                goto L_0x004f
            L_0x0040:
                r7 = r2
                r2 = r1
            L_0x0042:
                if (r7 != 0) goto L_0x004e
                if (r0 == 0) goto L_0x004b
                r0.close()     // Catch:{ all -> 0x004a }
                goto L_0x004b
            L_0x004a:
                r1 = move-exception
            L_0x004b:
                r7 = r1
                r1 = r2
                goto L_0x0059
            L_0x004e:
                throw r7     // Catch:{ all -> 0x003e }
            L_0x004f:
                if (r0 == 0) goto L_0x0059
                r0.close()     // Catch:{ all -> 0x0055 }
                goto L_0x0059
            L_0x0055:
                r0 = move-exception
                XH.C16816g.a(r7, r0)
            L_0x0059:
                if (r7 != 0) goto L_0x005c
                return r1
            L_0x005c:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: KF.C13147a.C2721a.i(java.io.File):java.lang.String");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003f A[Catch:{ all -> 0x0029, all -> 0x0038, all -> 0x0047 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x004a A[SYNTHETIC, Splitter:B:29:0x004a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(java.io.File r5, java.io.File r6) {
            /*
                r4 = this;
                java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
                java.io.FileInputStream r1 = new java.io.FileInputStream
                r1.<init>(r5)
                r0.<init>(r1)
                java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0047 }
                java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0047 }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0047 }
                r2.<init>(r6)     // Catch:{ all -> 0x0047 }
                r1.<init>(r2)     // Catch:{ all -> 0x0047 }
                r6 = 8192(0x2000, float:1.14794E-41)
                r5.<init>(r1, r6)     // Catch:{ all -> 0x0047 }
                r1 = 0
                byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0029 }
            L_0x001e:
                int r2 = r0.read(r6)     // Catch:{ all -> 0x0029 }
                if (r2 <= 0) goto L_0x002b
                r3 = 0
                r5.write(r6, r3, r2)     // Catch:{ all -> 0x0029 }
                goto L_0x001e
            L_0x0029:
                r6 = move-exception
                goto L_0x0034
            L_0x002b:
                XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x0029 }
                r5.close()     // Catch:{ all -> 0x0032 }
                r5 = r1
                goto L_0x003d
            L_0x0032:
                r5 = move-exception
                goto L_0x003d
            L_0x0034:
                r5.close()     // Catch:{ all -> 0x0038 }
                goto L_0x003c
            L_0x0038:
                r5 = move-exception
                XH.C16816g.a(r6, r5)     // Catch:{ all -> 0x0047 }
            L_0x003c:
                r5 = r6
            L_0x003d:
                if (r5 != 0) goto L_0x004a
                XH.N r5 = XH.C16807N.f139792a     // Catch:{ all -> 0x0047 }
                r0.close()     // Catch:{ all -> 0x0045 }
                goto L_0x0053
            L_0x0045:
                r1 = move-exception
                goto L_0x0053
            L_0x0047:
                r5 = move-exception
                r1 = r5
                goto L_0x004b
            L_0x004a:
                throw r5     // Catch:{ all -> 0x0047 }
            L_0x004b:
                r0.close()     // Catch:{ all -> 0x004f }
                goto L_0x0053
            L_0x004f:
                r5 = move-exception
                XH.C16816g.a(r1, r5)
            L_0x0053:
                if (r1 != 0) goto L_0x0056
                return
            L_0x0056:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: KF.C13147a.C2721a.j(java.io.File, java.io.File):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Throwable} */
        /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Throwable] */
        /* JADX WARNING: type inference failed for: r7v7 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[SYNTHETIC, Splitter:B:25:0x0053] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String f(java.io.File r7) {
            /*
                r6 = this;
                java.lang.String r0 = "file"
                kotlin.jvm.internal.C17542s.j(r7, r0)
                WK.s$a r0 = WK.C16783s.f139708d
                WK.L r1 = WK.y.b()
                WK.s r0 = r0.a(r1)
                r1 = 0
                WK.l r2 = WK.C16777l.f139691b     // Catch:{ all -> 0x0043 }
                WK.E$a r3 = WK.C16762E.f139592b     // Catch:{ all -> 0x0043 }
                r4 = 0
                r5 = 1
                WK.E r7 = WK.C16762E.a.d(r3, r7, r4, r5, r1)     // Catch:{ all -> 0x0043 }
                WK.N r7 = r2.B(r7)     // Catch:{ all -> 0x0043 }
                WK.g r7 = WK.y.d(r7)     // Catch:{ all -> 0x0043 }
                r7.L2(r0)     // Catch:{ all -> 0x0037 }
                WK.h r2 = r0.c()     // Catch:{ all -> 0x0037 }
                java.lang.String r2 = r2.a()     // Catch:{ all -> 0x0037 }
                if (r7 == 0) goto L_0x0035
                r7.close()     // Catch:{ all -> 0x0033 }
                goto L_0x0035
            L_0x0033:
                r7 = move-exception
                goto L_0x0047
            L_0x0035:
                r7 = r1
                goto L_0x0047
            L_0x0037:
                r2 = move-exception
                if (r7 == 0) goto L_0x0045
                r7.close()     // Catch:{ all -> 0x003e }
                goto L_0x0045
            L_0x003e:
                r7 = move-exception
                XH.C16816g.a(r2, r7)     // Catch:{ all -> 0x0043 }
                goto L_0x0045
            L_0x0043:
                r7 = move-exception
                goto L_0x0054
            L_0x0045:
                r7 = r2
                r2 = r1
            L_0x0047:
                if (r7 != 0) goto L_0x0053
                if (r0 == 0) goto L_0x0050
                r0.close()     // Catch:{ all -> 0x004f }
                goto L_0x0050
            L_0x004f:
                r1 = move-exception
            L_0x0050:
                r7 = r1
                r1 = r2
                goto L_0x005e
            L_0x0053:
                throw r7     // Catch:{ all -> 0x0043 }
            L_0x0054:
                if (r0 == 0) goto L_0x005e
                r0.close()     // Catch:{ all -> 0x005a }
                goto L_0x005e
            L_0x005a:
                r0 = move-exception
                XH.C16816g.a(r7, r0)
            L_0x005e:
                if (r7 != 0) goto L_0x0061
                return r1
            L_0x0061:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: KF.C13147a.C2721a.f(java.io.File):java.lang.String");
        }

        private C2721a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0006\t\n\u000b\fB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LKF/a$b;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "e", "d", "LKF/a$b$a;", "LKF/a$b$b;", "LKF/a$b$c;", "LKF/a$b$d;", "LKF/a$b$e;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: KF.a$b */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f111640a;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKF/a$b$a;", "LKF/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: KF.a$b$a  reason: collision with other inner class name */
        public static final class C2722a extends b {

            /* renamed from: b  reason: collision with root package name */
            public static final C2722a f111641b = new C2722a();

            private C2722a() {
                super("Info", (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2722a);
            }

            public int hashCode() {
                return -1388972994;
            }

            public String toString() {
                return "Info";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKF/a$b$b;", "LKF/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: KF.a$b$b  reason: collision with other inner class name */
        public static final class C2723b extends b {

            /* renamed from: b  reason: collision with root package name */
            public static final C2723b f111642b = new C2723b();

            private C2723b() {
                super("Pano_0", (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2723b);
            }

            public int hashCode() {
                return -102404754;
            }

            public String toString() {
                return "Pano0";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKF/a$b$c;", "LKF/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: KF.a$b$c */
        public static final class c extends b {

            /* renamed from: b  reason: collision with root package name */
            public static final c f111643b = new c();

            private c() {
                super("Pano_1", (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -102404753;
            }

            public String toString() {
                return "Pano1";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKF/a$b$d;", "LKF/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: KF.a$b$d */
        public static final class d extends b {

            /* renamed from: b  reason: collision with root package name */
            public static final d f111644b = new d();

            private d() {
                super((String) null, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1388703630;
            }

            public String toString() {
                return "Root";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKF/a$b$e;", "LKF/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: KF.a$b$e */
        public static final class e extends b {

            /* renamed from: b  reason: collision with root package name */
            public static final e f111645b = new e();

            private e() {
                super("Video", (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -96635157;
            }

            public String toString() {
                return "Video";
            }
        }

        public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String a() {
            return this.f111640a;
        }

        private b(String str) {
            this.f111640a = str;
        }
    }

    static {
        b.C2722a aVar = b.C2722a.f111641b;
        v a10 = C16796C.a("capture_meta.json", aVar);
        v a11 = C16796C.a("session_meta.json", aVar);
        v a12 = C16796C.a("video_meta.json", aVar);
        v a13 = C16796C.a("quality_meta.json", aVar);
        b.d dVar = b.d.f111644b;
        f111637f = X.m(a10, a11, a12, a13, C16796C.a("mosaic.png", dVar), C16796C.a("rgb.mp4", b.e.f111645b), C16796C.a("pano_preview.jpg", dVar), C16796C.a("pano_alignment.heif", dVar), C16796C.a("pano_alignment.jpg", dVar), C16796C.a("pano_0_meta.json", aVar), C16796C.a("automatic_log.txt", aVar));
    }

    public C13147a(C13309a aVar, C13187c cVar) {
        C17542s.j(aVar, "appEnvironment");
        C17542s.j(cVar, "uploadLogger");
        this.f111638a = aVar;
        this.f111639b = cVar;
    }

    private final File c() {
        File file = new File(this.f111638a.d(), f111636e);
        file.mkdirs();
        return file;
    }

    private final File d() {
        File file = new File(this.f111638a.c(), f111636e);
        file.mkdirs();
        return file;
    }

    private final File i(File file) {
        if (!g0.h(FeatureVariable.JSON_TYPE, "txt").contains(C17423j.s(file))) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        File file2 = new File(absolutePath + ".zip");
        try {
            f111634c.j(file, file2);
            if (file2.exists()) {
                return file2;
            }
            return null;
        } catch (Exception e10) {
            String name = file.getName();
            throw new C13152f("Zip " + name + " failed", e10, (ApiResponse) null, 4, (DefaultConstructorMarker) null);
        }
    }

    public final File b(UUID uuid) {
        C17542s.j(uuid, "uuid");
        File c10 = c();
        File file = new File(c10, uuid + "/");
        file.mkdirs();
        return file;
    }

    public final File e(UUID uuid) {
        C17542s.j(uuid, "uuid");
        File d10 = d();
        File file = new File(d10, uuid + "/");
        file.mkdirs();
        return file;
    }

    public final C13208b f(File file, UUID uuid) {
        C17542s.j(file, "inFile");
        C17542s.j(uuid, "captureUuid");
        File i10 = i(file);
        if (i10 != null) {
            file = i10;
        }
        String absolutePath = file.getAbsolutePath();
        C17542s.i(absolutePath, "getAbsolutePath(...)");
        String name = file.getName();
        C17542s.i(name, "getName(...)");
        C2721a aVar = f111634c;
        return new C13208b(absolutePath, name, (C13209c) null, (C13210d) null, uuid, aVar.h(file), aVar.e(file), aVar.f(file), (String) null, 0, 780, (DefaultConstructorMarker) null);
    }

    public final UploadURL g(File file) {
        C17542s.j(file, "inFile");
        File i10 = i(file);
        if (i10 != null) {
            file = i10;
        }
        C2721a aVar = f111634c;
        return new UploadURL(aVar.h(file), aVar.e(file), aVar.f(file), (String) null, false, (Boolean) null, (Boolean) null, 120, (DefaultConstructorMarker) null);
    }

    public final String h(UUID uuid, String str) {
        C17542s.j(uuid, "captureUuid");
        C17542s.j(str, "fileName");
        return f111634c.i(new File(e(uuid), str));
    }

    public final File j(UUID uuid) {
        C17542s.j(uuid, "uuid");
        File file = new File(d(), "mosaic/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, uuid + ".png");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Throwable} */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.core.network.models.SessionMeta k(java.util.UUID r5) {
        /*
            r4 = this;
            java.lang.String r0 = "captureUuid"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.io.File r0 = new java.io.File
            java.io.File r5 = r4.e(r5)
            java.lang.String r1 = "session_meta.json"
            r0.<init>(r5, r1)
            com.squareup.moshi.t$b r5 = new com.squareup.moshi.t$b     // Catch:{ Exception -> 0x0052 }
            r5.<init>()     // Catch:{ Exception -> 0x0052 }
            NE.b r1 = new NE.b     // Catch:{ Exception -> 0x0052 }
            r1.<init>()     // Catch:{ Exception -> 0x0052 }
            com.squareup.moshi.t$b r5 = r5.a(r1)     // Catch:{ Exception -> 0x0052 }
            com.squareup.moshi.t r5 = r5.d()     // Catch:{ Exception -> 0x0052 }
            WK.N r0 = WK.y.k(r0)     // Catch:{ Exception -> 0x0052 }
            WK.g r0 = WK.y.d(r0)     // Catch:{ Exception -> 0x0052 }
            com.squareup.moshi.k r0 = com.squareup.moshi.k.l(r0)     // Catch:{ Exception -> 0x0052 }
            r1 = 0
            java.lang.Class<com.sugarcube.core.network.models.SessionMeta> r2 = com.sugarcube.core.network.models.SessionMeta.class
            com.squareup.moshi.f r5 = r5.c(r2)     // Catch:{ all -> 0x0046 }
            java.lang.Object r5 = r5.fromJson((com.squareup.moshi.k) r0)     // Catch:{ all -> 0x0046 }
            com.sugarcube.core.network.models.SessionMeta r5 = (com.sugarcube.core.network.models.SessionMeta) r5     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0042
            r0.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0042
        L_0x0041:
            r1 = move-exception
        L_0x0042:
            r3 = r1
            r1 = r5
            r5 = r3
            goto L_0x0054
        L_0x0046:
            r5 = move-exception
            if (r0 == 0) goto L_0x0054
            r0.close()     // Catch:{ all -> 0x004d }
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            XH.C16816g.a(r5, r0)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0054
        L_0x0052:
            r5 = move-exception
            goto L_0x0058
        L_0x0054:
            if (r5 != 0) goto L_0x0057
            return r1
        L_0x0057:
            throw r5     // Catch:{ Exception -> 0x0052 }
        L_0x0058:
            LF.c r0 = r4.f111639b
            java.lang.String r1 = "meta file"
            r0.g(r1, r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: KF.C13147a.k(java.util.UUID):com.sugarcube.core.network.models.SessionMeta");
    }
}
