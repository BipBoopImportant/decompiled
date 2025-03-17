package w3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import t3.C5950a;
import t3.N;

public final class z extends C6218b {

    /* renamed from: e  reason: collision with root package name */
    private final Context f31515e;

    /* renamed from: f  reason: collision with root package name */
    private k f31516f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f31517g;

    /* renamed from: h  reason: collision with root package name */
    private InputStream f31518h;

    /* renamed from: i  reason: collision with root package name */
    private long f31519i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f31520j;

    public static class a extends h {
        @Deprecated
        public a(String str) {
            super(str, (Throwable) null, 2000);
        }

        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public z(Context context) {
        super(false);
        this.f31515e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static AssetFileDescriptor t(Context context, k kVar) {
        Resources resources;
        int i10;
        Uri normalizeScheme = kVar.f31433a.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                i10 = u(pathSegments.get(0));
            } else {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String str = (String) C5950a.e(normalizeScheme.getPath());
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resources = context.getResources();
            } else {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (str.matches("\\d+")) {
                i10 = u(str);
            } else {
                i10 = resources.getIdentifier(packageName + ":" + str, "raw", (String) null);
                if (i10 == 0) {
                    throw new a("Resource not found.", (Throwable) null, 2005);
                }
            }
        } else {
            throw new a("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only " + "android.resource" + " is supported.", (Throwable) null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i10);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new a("Resource is compressed: " + normalizeScheme, (Throwable) null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new a((String) null, e11, 2005);
        }
    }

    private static int u(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", (Throwable) null, 1004);
        }
    }

    public long b(k kVar) {
        this.f31516f = kVar;
        r(kVar);
        AssetFileDescriptor t10 = t(this.f31515e, kVar);
        this.f31517g = t10;
        long length = t10.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f31517g.getFileDescriptor());
        this.f31518h = fileInputStream;
        int i10 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        if (i10 != 0) {
            try {
                if (kVar.f31439g > length) {
                    throw new a((String) null, (Throwable) null, 2008);
                }
            } catch (a e10) {
                throw e10;
            } catch (IOException e11) {
                throw new a((String) null, e11, 2000);
            }
        }
        long startOffset = this.f31517g.getStartOffset();
        long skip = fileInputStream.skip(kVar.f31439g + startOffset) - startOffset;
        if (skip == kVar.f31439g) {
            if (i10 == 0) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f31519i = -1;
                } else {
                    long size = channel.size() - channel.position();
                    this.f31519i = size;
                    if (size < 0) {
                        throw new a((String) null, (Throwable) null, 2008);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f31519i = j10;
                if (j10 < 0) {
                    throw new h(2008);
                }
            }
            long j11 = kVar.f31440h;
            if (j11 != -1) {
                long j12 = this.f31519i;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f31519i = j11;
            }
            this.f31520j = true;
            s(kVar);
            long j13 = kVar.f31440h;
            return j13 != -1 ? j13 : this.f31519i;
        }
        throw new a((String) null, (Throwable) null, 2008);
    }

    public int c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f31519i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new a((String) null, e10, 2000);
            }
        }
        int read = ((InputStream) N.i(this.f31518h)).read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f31519i;
            if (j11 != -1) {
                this.f31519i = j11 - ((long) read);
            }
            p(read);
            return read;
        } else if (this.f31519i == -1) {
            return -1;
        } else {
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    public void close() {
        this.f31516f = null;
        try {
            InputStream inputStream = this.f31518h;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f31518h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f31517g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f31517g = null;
                if (this.f31520j) {
                    this.f31520j = false;
                    q();
                }
            } catch (IOException e10) {
                throw new a((String) null, e10, 2000);
            } catch (Throwable th2) {
                this.f31517g = null;
                if (this.f31520j) {
                    this.f31520j = false;
                    q();
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new a((String) null, e11, 2000);
        } catch (Throwable th3) {
            this.f31518h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f31517g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f31517g = null;
                if (this.f31520j) {
                    this.f31520j = false;
                    q();
                }
                throw th3;
            } catch (IOException e12) {
                throw new a((String) null, e12, 2000);
            } catch (Throwable th4) {
                this.f31517g = null;
                if (this.f31520j) {
                    this.f31520j = false;
                    q();
                }
                throw th4;
            }
        }
    }

    public Uri n() {
        k kVar = this.f31516f;
        if (kVar != null) {
            return kVar.f31433a;
        }
        return null;
    }
}
