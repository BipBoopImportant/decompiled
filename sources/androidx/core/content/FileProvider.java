package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import u2.C6012a;

public class FileProvider extends ContentProvider {

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f21147e = {"_display_name", "_size"};

    /* renamed from: f  reason: collision with root package name */
    private static final File f21148f = new File("/");

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, b> f21149g = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final Object f21150a;

    /* renamed from: b  reason: collision with root package name */
    private String f21151b;

    /* renamed from: c  reason: collision with root package name */
    private b f21152c;

    /* renamed from: d  reason: collision with root package name */
    private final int f21153d;

    static class a {
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface b {
        Uri a(File file);

        File b(Uri uri);
    }

    static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final String f21154a;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<String, File> f21155b = new HashMap<>();

        c(String str) {
            this.f21154a = str;
        }

        private boolean d(String str, String str2) {
            String a10 = FileProvider.k(str);
            String a11 = FileProvider.k(str2);
            if (!a10.equals(a11)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a11);
                sb2.append('/');
                return a10.startsWith(sb2.toString());
            }
        }

        public Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry next : this.f21155b.entrySet()) {
                    String path = ((File) next.getValue()).getPath();
                    if (d(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = next;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    String substring = path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1);
                    return new Uri.Builder().scheme("content").authority(this.f21154a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public File b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f21155b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (d(canonicalFile.getPath(), file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f21155b.put(str, file.getCanonicalFile());
                } catch (IOException e10) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    public FileProvider() {
        this(0);
    }

    private static File b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] c(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    private static String[] d(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    static XmlResourceParser e(Context context, String str, ProviderInfo providerInfo, int i10) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i10 != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i10);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    private b f() {
        b bVar;
        synchronized (this.f21150a) {
            try {
                H2.c.d(this.f21151b, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f21152c == null) {
                    this.f21152c = g(getContext(), this.f21151b, this.f21153d);
                }
                bVar = this.f21152c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    private static b g(Context context, String str, int i10) {
        b bVar;
        HashMap<String, b> hashMap = f21149g;
        synchronized (hashMap) {
            try {
                bVar = hashMap.get(str);
                if (bVar == null) {
                    bVar = j(context, str, i10);
                    hashMap.put(str, bVar);
                }
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
            } catch (XmlPullParserException e11) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static Uri h(Context context, String str, File file) {
        return g(context, str, 0).a(file);
    }

    private static int i(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static b j(Context context, String str, int i10) {
        c cVar = new c(str);
        XmlResourceParser e10 = e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i10);
        while (true) {
            int next = e10.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = e10.getName();
                File file = null;
                String attributeValue = e10.getAttributeValue((String) null, "name");
                String attributeValue2 = e10.getAttributeValue((String) null, "path");
                if ("root-path".equals(name)) {
                    file = f21148f;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] g10 = C6012a.g(context, (String) null);
                    if (g10.length > 0) {
                        file = g10[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] f10 = C6012a.f(context);
                    if (f10.length > 0) {
                        file = f10[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a10 = a.a(context);
                    if (a10.length > 0) {
                        file = a10[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, b(file, attributeValue2));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static String k(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + -1) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            synchronized (this.f21150a) {
                this.f21151b = str;
            }
            HashMap<String, b> hashMap = f21149g;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return f().b(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r3) {
        /*
            r2 = this;
            androidx.core.content.FileProvider$b r0 = r2.f()
            java.io.File r3 = r0.b(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0029
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0029
            return r3
        L_0x0029:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.getType(android.net.Uri):java.lang.String");
    }

    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(f().b(uri), i(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        File b10 = f().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f21147e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = queryParameter == null ? b10.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(b10.length());
            }
            i11 = i10;
        }
        String[] d10 = d(strArr3, i11);
        Object[] c10 = c(objArr, i11);
        MatrixCursor matrixCursor = new MatrixCursor(d10, 1);
        matrixCursor.addRow(c10);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected FileProvider(int i10) {
        this.f21150a = new Object();
        this.f21153d = i10;
    }
}
