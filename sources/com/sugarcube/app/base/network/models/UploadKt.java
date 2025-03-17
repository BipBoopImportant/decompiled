package com.sugarcube.app.base.network.models;

import GK.C15774B;
import GK.C15775C;
import GK.C15776D;
import GK.C15805x;
import GK.z;
import HJ.C15854t;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.U;
import android.content.SharedPreferences;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.core.network.models.UploadURL;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\u001a;\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a=\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0014\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a=\u0010\u001a\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0004\b \u0010!\u001a5\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00120#2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010%\u001a/\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010*\u001a)\u0010+\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b+\u0010,\u001a\u001d\u0010-\u001a\u00020(2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010/\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u00100\u001a\u0018\u00102\u001a\u00020(2\u0006\u00101\u001a\u00020\u0012H\b¢\u0006\u0004\b2\u00103\"\u0014\u00105\u001a\u0002048\u0000XT¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/sugarcube/core/network/models/UploadURL;", "LGK/z;", "client", "Ljava/io/File;", "file", "", "zipped", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/sugarcube/app/base/network/models/UploadFileResult;", "upload", "(Lcom/sugarcube/core/network/models/UploadURL;LGK/z;Ljava/io/File;ZLcom/sugarcube/app/base/data/database/Scene;Landroid/content/SharedPreferences;)Lcom/sugarcube/app/base/network/models/UploadFileResult;", "uploadStandard", "(Lcom/sugarcube/core/network/models/UploadURL;LGK/z;Ljava/io/File;Z)Lcom/sugarcube/app/base/network/models/UploadFileResult;", "uploadResumable", "(Lcom/sugarcube/core/network/models/UploadURL;Landroid/content/SharedPreferences;LGK/z;Ljava/io/File;ZLcom/sugarcube/app/base/data/database/Scene;)Lcom/sugarcube/app/base/network/models/UploadFileResult;", "", "fileName", "findSessionUri", "(Lcom/sugarcube/core/network/models/UploadURL;Landroid/content/SharedPreferences;LGK/z;Lcom/sugarcube/app/base/data/database/Scene;Ljava/lang/String;Z)Ljava/lang/String;", "sessionUri", "uploadInOneChunk", "(Lcom/sugarcube/core/network/models/UploadURL;LGK/z;Ljava/io/File;ZLjava/lang/String;)Lcom/sugarcube/app/base/network/models/UploadFileResult;", "alreadyUploadedRange", "uploadResumableInChunks", "(Lcom/sugarcube/core/network/models/UploadURL;LGK/z;Ljava/io/File;ZLjava/lang/String;Ljava/lang/String;)Lcom/sugarcube/app/base/network/models/UploadFileResult;", "", "fileSize", "", "Lcom/sugarcube/app/base/network/models/Chunk;", "calculateChunksToUpload", "(JLjava/lang/String;)Ljava/util/List;", "totalSize", "LXH/v;", "checkUploadStatus", "(LGK/z;Ljava/lang/String;J)LXH/v;", "Ljava/util/UUID;", "sceneId", "LXH/N;", "writeGoogleSessionUri", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)V", "readGoogleSessionId", "(Landroid/content/SharedPreferences;Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;", "clearGoogleSessionIds", "(Landroid/content/SharedPreferences;Ljava/util/UUID;)V", "sessionIdKey", "(Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;", "string", "detailLog", "(Ljava/lang/String;)V", "", "MAX_CHUNK_SIZE", "I", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UploadKt {
    public static final int MAX_CHUNK_SIZE = 2097152;

    public static final List<Chunk> calculateChunksToUpload(long j10, String str) {
        C17974j w10 = C17978n.w(0, (int) Math.ceil(((double) j10) / 2097152.0d));
        ArrayList arrayList = new ArrayList(C16877v.y(w10, 10));
        Iterator it = w10.iterator();
        while (it.hasNext()) {
            int c10 = ((U) it).c();
            long j11 = ((long) c10) * 2097152;
            long min = Math.min(j10, ((long) (c10 + 1)) * 2097152) - 1;
            arrayList.add(new Chunk(c10, j11, min, (int) ((min - j11) + 1)));
        }
        if (str != null && C15854t.W(str, "bytes=0-", false, 2, (Object) null)) {
            try {
                String str2 = (String) C15854t.Y0((CharSequence) C15854t.Y0(str, new String[]{"-"}, false, 0, 6, (Object) null).get(1), new String[]{"/"}, false, 0, 6, (Object) null).get(0);
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    if (((Chunk) next).getStart() > Long.parseLong(str2)) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            } catch (Exception unused) {
            }
        }
        arrayList.toString();
        return arrayList;
    }

    private static final v<Boolean, String> checkUploadStatus(z zVar, String str, long j10) {
        C15775C i10 = C15775C.a.i(C15775C.f134790a, (C15805x) null, new byte[0], 0, 0, 12, (Object) null);
        C15776D execute = FirebasePerfOkHttpClient.execute(zVar.b(new C15774B.a().n(str).i(i10).e("Content-Length", "0").e("Content-Range", "bytes */" + j10).b()));
        int g10 = execute.g();
        if (g10 == 200 || g10 == 201) {
            return C16796C.a(Boolean.TRUE, null);
        }
        if (g10 == 308) {
            return C16796C.a(Boolean.FALSE, execute.n("Range", (String) null));
        }
        throw new RuntimeException("Unexpected response code " + g10);
    }

    public static final void clearGoogleSessionIds(SharedPreferences sharedPreferences, UUID uuid) {
        C17542s.j(sharedPreferences, "sharedPreferences");
        C17542s.j(uuid, "sceneId");
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : sharedPreferences.getAll().keySet()) {
            String str = (String) next;
            C17542s.g(str);
            if (C15854t.W(str, uuid + ":", false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : arrayList) {
            edit.remove(remove);
        }
        edit.apply();
    }

    private static final void detailLog(String str) {
    }

    private static final String findSessionUri(UploadURL uploadURL, SharedPreferences sharedPreferences, z zVar, Scene scene, String str, boolean z10) {
        String readGoogleSessionId = readGoogleSessionId(sharedPreferences, scene.getSceneUuid(), str);
        if (readGoogleSessionId != null && readGoogleSessionId.length() != 0) {
            return readGoogleSessionId;
        }
        String contentType = uploadURL.getContentType();
        if (contentType == null) {
            contentType = "";
        }
        C15775C i10 = C15775C.a.i(C15775C.f134790a, (C15805x) null, new byte[0], 0, 0, 12, (Object) null);
        C15774B.a aVar = new C15774B.a();
        String url = uploadURL.getUrl();
        C17542s.g(url);
        C15774B.a h10 = aVar.n(url).a("x-goog-resumable", "start").a("content-type", contentType).h(i10);
        if (z10) {
            h10.a("Content-Encoding", "gzip");
        }
        String b10 = FirebasePerfOkHttpClient.execute(zVar.b(h10.b())).q().b("location");
        C17542s.g(b10);
        writeGoogleSessionUri(sharedPreferences, b10, scene.getSceneUuid(), str);
        return b10;
    }

    static /* synthetic */ String findSessionUri$default(UploadURL uploadURL, SharedPreferences sharedPreferences, z zVar, Scene scene, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return findSessionUri(uploadURL, sharedPreferences, zVar, scene, str, z10);
    }

    private static final String readGoogleSessionId(SharedPreferences sharedPreferences, UUID uuid, String str) {
        Objects.toString(uuid);
        return sharedPreferences.getString(sessionIdKey(uuid, str), (String) null);
    }

    private static final String sessionIdKey(UUID uuid, String str) {
        return uuid + ":" + str;
    }

    public static final UploadFileResult upload(UploadURL uploadURL, z zVar, File file, boolean z10, Scene scene, SharedPreferences sharedPreferences) {
        C17542s.j(uploadURL, "<this>");
        C17542s.j(zVar, "client");
        C17542s.j(file, "file");
        C17542s.j(scene, "scene");
        C17542s.j(sharedPreferences, "sharedPreferences");
        return C17542s.e(uploadURL.getResumable(), Boolean.TRUE) ? uploadResumable(uploadURL, sharedPreferences, zVar, file, z10, scene) : uploadStandard(uploadURL, zVar, file, z10);
    }

    public static /* synthetic */ UploadFileResult upload$default(UploadURL uploadURL, z zVar, File file, boolean z10, Scene scene, SharedPreferences sharedPreferences, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return upload(uploadURL, zVar, file, z10, scene, sharedPreferences);
    }

    private static final UploadFileResult uploadInOneChunk(UploadURL uploadURL, z zVar, File file, boolean z10, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        String contentType = uploadURL.getContentType();
        if (contentType == null) {
            contentType = "";
        }
        String str2 = contentType;
        try {
            C15774B.a a10 = new C15774B.a().n(str).a("Content-Type", str2).a("Content-Length", String.valueOf(file.length()));
            C15775C.a aVar = C15775C.f134790a;
            C15805x.a aVar2 = C15805x.f135130e;
            V v10 = V.f144353a;
            String format = String.format(str2, Arrays.copyOf(new Object[0], 0));
            C17542s.i(format, "format(...)");
            C15805x a11 = aVar2.a(format);
            File file2 = file;
            C15774B.a i10 = a10.i(aVar.f(file, a11));
            if (z10) {
                i10.a("Content-Encoding", "gzip");
            }
            String contentMd5 = uploadURL.getContentMd5();
            if (contentMd5 != null) {
                i10.a("Content-MD5", contentMd5);
            }
            z zVar2 = zVar;
            C15776D execute = FirebasePerfOkHttpClient.execute(zVar.b(i10.b()));
            if (!execute.e1()) {
                return new UploadFileResult(false, execute, (Exception) null, false, 12, (DefaultConstructorMarker) null);
            }
            file.getName();
            return new UploadFileResult(true, (C15776D) null, (Exception) null, false, 14, (DefaultConstructorMarker) null);
        } catch (Exception e10) {
            return new UploadFileResult(false, (C15776D) null, new UploadFileException(e10, str2, System.currentTimeMillis() - currentTimeMillis), false, 10, (DefaultConstructorMarker) null);
        }
    }

    static /* synthetic */ UploadFileResult uploadInOneChunk$default(UploadURL uploadURL, z zVar, File file, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return uploadInOneChunk(uploadURL, zVar, file, z10, str);
    }

    private static final UploadFileResult uploadResumable(UploadURL uploadURL, SharedPreferences sharedPreferences, z zVar, File file, boolean z10, Scene scene) {
        z zVar2 = zVar;
        String contentType = uploadURL.getContentType();
        if (contentType == null) {
            contentType = "";
        }
        String str = contentType;
        long currentTimeMillis = System.currentTimeMillis();
        long length = file.length();
        try {
            file.getName();
            String name = file.getName();
            C17542s.i(name, "getName(...)");
            String findSessionUri = findSessionUri(uploadURL, sharedPreferences, zVar, scene, name, z10);
            v<Boolean, String> checkUploadStatus = checkUploadStatus(zVar2, findSessionUri, length);
            boolean booleanValue = checkUploadStatus.a().booleanValue();
            String b10 = checkUploadStatus.b();
            if (!booleanValue) {
                return ((double) length) > 3145728.0d ? uploadResumableInChunks(uploadURL, zVar, file, z10, findSessionUri, b10) : uploadInOneChunk(uploadURL, zVar2, file, z10, findSessionUri);
            }
            file.getName();
            return new UploadFileResult(true, (C15776D) null, (Exception) null, true, 6, (DefaultConstructorMarker) null);
        } catch (Exception e10) {
            throw new UploadFileException(e10, str, System.currentTimeMillis() - currentTimeMillis);
        }
    }

    static /* synthetic */ UploadFileResult uploadResumable$default(UploadURL uploadURL, SharedPreferences sharedPreferences, z zVar, File file, boolean z10, Scene scene, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return uploadResumable(uploadURL, sharedPreferences, zVar, file, z10, scene);
    }

    private static final UploadFileResult uploadResumableInChunks(UploadURL uploadURL, z zVar, File file, boolean z10, String str, String str2) {
        byte[] bArr = new byte[MAX_CHUNK_SIZE];
        String contentType = uploadURL.getContentType();
        if (contentType == null) {
            contentType = "";
        }
        file.getName();
        for (Chunk chunk : calculateChunksToUpload(file.length(), str2)) {
            file.getName();
            chunk.getIndex();
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.skip(chunk.getStart());
            int read = fileInputStream.read(bArr, 0, chunk.getLength());
            fileInputStream.close();
            C15775C.a aVar = C15775C.f134790a;
            C15805x.a aVar2 = C15805x.f135130e;
            V v10 = V.f144353a;
            String format = String.format(contentType, Arrays.copyOf(new Object[0], 0));
            C17542s.i(format, "format(...)");
            C15775C h10 = aVar.h(bArr, aVar2.a(format), 0, read);
            long start = chunk.getStart();
            long end = chunk.getEnd();
            long length = file.length();
            C15774B.a a10 = new C15774B.a().n(str).i(h10).a("Content-Type", contentType).a("Content-Length", String.valueOf(read)).a("Content-Range", "bytes " + start + "-" + end + "/" + length);
            if (z10) {
                a10.a("Content-Encoding", "gzip");
            }
            String contentMd5 = uploadURL.getContentMd5();
            if (contentMd5 != null) {
                a10.a("Content-MD5", contentMd5);
            }
            C15776D execute = FirebasePerfOkHttpClient.execute(zVar.b(a10.b()));
            int g10 = execute.g();
            if (g10 == 200 || g10 == 201) {
                file.getName();
                return new UploadFileResult(true, (C15776D) null, (Exception) null, false, 14, (DefaultConstructorMarker) null);
            } else if (g10 != 308) {
                return new UploadFileResult(false, execute, (Exception) null, false, 12, (DefaultConstructorMarker) null);
            } else {
                file.getName();
            }
        }
        return new UploadFileResult(false, (C15776D) null, new IllegalStateException("finished uploading without success code"), false, 10, (DefaultConstructorMarker) null);
    }

    public static final UploadFileResult uploadStandard(UploadURL uploadURL, z zVar, File file, boolean z10) {
        z zVar2 = zVar;
        File file2 = file;
        C17542s.j(uploadURL, "<this>");
        C17542s.j(zVar2, "client");
        C17542s.j(file2, "file");
        String contentType = uploadURL.getContentType();
        if (contentType == null) {
            contentType = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C15774B.a aVar = new C15774B.a();
            String url = uploadURL.getUrl();
            C17542s.g(url);
            C15774B.a a10 = aVar.n(url).a("Content-Type", contentType).a("Content-Length", String.valueOf(file.length()));
            C15775C.a aVar2 = C15775C.f134790a;
            C15805x.a aVar3 = C15805x.f135130e;
            V v10 = V.f144353a;
            String format = String.format(contentType, Arrays.copyOf(new Object[0], 0));
            C17542s.i(format, "format(...)");
            C15774B.a i10 = a10.i(aVar2.f(file2, aVar3.a(format)));
            if (z10) {
                i10.a("Content-Encoding", "gzip");
            }
            String contentMd5 = uploadURL.getContentMd5();
            if (contentMd5 != null) {
                i10.a("Content-MD5", contentMd5);
            }
            C15776D execute = FirebasePerfOkHttpClient.execute(zVar2.b(i10.b()));
            return execute.e1() ? new UploadFileResult(true, (C15776D) null, (Exception) null, false, 14, (DefaultConstructorMarker) null) : new UploadFileResult(false, execute, (Exception) null, false, 12, (DefaultConstructorMarker) null);
        } catch (Exception e10) {
            throw new UploadFileException(e10, contentType, System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public static /* synthetic */ UploadFileResult uploadStandard$default(UploadURL uploadURL, z zVar, File file, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return uploadStandard(uploadURL, zVar, file, z10);
    }

    private static final void writeGoogleSessionUri(SharedPreferences sharedPreferences, String str, UUID uuid, String str2) {
        Objects.toString(uuid);
        String sessionIdKey = sessionIdKey(uuid, str2);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(sessionIdKey, str);
        edit.apply();
    }
}
