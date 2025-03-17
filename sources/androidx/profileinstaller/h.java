package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.f;
import com.google.ar.core.ImageMetadata;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final f<c> f43600a = f.O();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f43601b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static c f43602c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f43603a;

        /* renamed from: b  reason: collision with root package name */
        final int f43604b;

        /* renamed from: c  reason: collision with root package name */
        final long f43605c;

        /* renamed from: d  reason: collision with root package name */
        final long f43606d;

        b(int i10, int i11, long j10, long j11) {
            this.f43603a = i10;
            this.f43604b = i11;
            this.f43605c = j10;
            this.f43606d = j11;
        }

        static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f43603a);
                dataOutputStream.writeInt(this.f43604b);
                dataOutputStream.writeLong(this.f43605c);
                dataOutputStream.writeLong(this.f43606d);
                dataOutputStream.close();
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f43604b == bVar.f43604b && this.f43605c == bVar.f43605c && this.f43603a == bVar.f43603a && this.f43606d == bVar.f43606d;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f43604b), Long.valueOf(this.f43605c), Integer.valueOf(this.f43603a), Long.valueOf(this.f43606d)});
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f43607a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f43608b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f43609c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f43610d;

        c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f43607a = i10;
            this.f43609c = z11;
            this.f43608b = z10;
            this.f43610d = z12;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f43602c = cVar;
        f43600a.K(cVar);
        return f43602c;
    }

    static c c(Context context, boolean z10) {
        boolean z11;
        b bVar;
        b bVar2;
        AssetFileDescriptor openFd;
        Throwable th2;
        c cVar;
        if (!z10 && (cVar = f43602c) != null) {
            return cVar;
        }
        synchronized (f43601b) {
            if (!z10) {
                c cVar2 = f43602c;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            int i10 = 0;
            try {
                openFd = context.getAssets().openFd("dexopt/baseline.prof");
                z11 = openFd.getLength() > 0;
                openFd.close();
            } catch (IOException unused) {
                z11 = false;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                if (i11 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z12 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z13 = file2.exists() && length2 > 0;
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                bVar = b.a(file3);
                            } catch (IOException unused2) {
                                return b(131072, z12, z13, z11);
                            }
                        } else {
                            bVar = null;
                        }
                        if (bVar != null && bVar.f43605c == a10) {
                            int i12 = bVar.f43604b;
                            if (i12 != 2) {
                                i10 = i12;
                                if (z10 && z13 && i10 != 1) {
                                    i10 = 2;
                                }
                                if (bVar != null && bVar.f43604b == 2 && i10 == 1 && length < bVar.f43606d) {
                                    i10 = 3;
                                }
                                bVar2 = new b(1, i10, a10, length2);
                                if (bVar == null || !bVar.equals(bVar2)) {
                                    bVar2.b(file3);
                                }
                                c b10 = b(i10, z12, z13, z11);
                                return b10;
                            }
                        }
                        if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                        i10 = 2;
                        i10 = 3;
                        bVar2 = new b(1, i10, a10, length2);
                        try {
                            bVar2.b(file3);
                        } catch (IOException unused3) {
                            i10 = ImageMetadata.EDGE_MODE;
                        }
                        c b102 = b(i10, z12, z13, z11);
                        return b102;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        return b(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, z12, z13, z11);
                    }
                }
            }
            c b11 = b(262144, false, false, z11);
            return b11;
        }
        throw th2;
    }
}
