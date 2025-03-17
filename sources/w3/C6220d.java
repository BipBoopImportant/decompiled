package w3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import t3.N;

/* renamed from: w3.d  reason: case insensitive filesystem */
public final class C6220d extends C6218b {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f31416e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f31417f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f31418g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f31419h;

    /* renamed from: i  reason: collision with root package name */
    private long f31420i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f31421j;

    /* renamed from: w3.d$a */
    public static class a extends h {
        public a(IOException iOException, int i10) {
            super((Throwable) iOException, i10);
        }
    }

    public C6220d(Context context) {
        super(false);
        this.f31416e = context.getContentResolver();
    }

    public long b(k kVar) {
        AssetFileDescriptor assetFileDescriptor;
        k kVar2 = kVar;
        int i10 = 2000;
        try {
            Uri normalizeScheme = kVar2.f31433a.normalizeScheme();
            this.f31417f = normalizeScheme;
            r(kVar);
            if ("content".equals(normalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = this.f31416e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f31416e.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f31418g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f31419h = fileInputStream;
                int i11 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i11 != 0) {
                    if (kVar2.f31439g > length) {
                        throw new a((IOException) null, 2008);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long j10 = length;
                long skip = fileInputStream.skip(kVar2.f31439g + startOffset) - startOffset;
                if (skip == kVar2.f31439g) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f31420i = -1;
                        } else {
                            long position = size - channel.position();
                            this.f31420i = position;
                            if (position < 0) {
                                throw new a((IOException) null, 2008);
                            }
                        }
                    } else {
                        long j11 = j10 - skip;
                        this.f31420i = j11;
                        if (j11 < 0) {
                            throw new a((IOException) null, 2008);
                        }
                    }
                    long j12 = kVar2.f31440h;
                    if (j12 != -1) {
                        long j13 = this.f31420i;
                        if (j13 != -1) {
                            j12 = Math.min(j13, j12);
                        }
                        this.f31420i = j12;
                    }
                    this.f31421j = true;
                    s(kVar);
                    long j14 = kVar2.f31440h;
                    return j14 != -1 ? j14 : this.f31420i;
                }
                throw new a((IOException) null, 2008);
            }
            throw new a(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new a(e11, i10);
        }
    }

    public int c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f31420i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int read = ((FileInputStream) N.i(this.f31419h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f31420i;
        if (j11 != -1) {
            this.f31420i = j11 - ((long) read);
        }
        p(read);
        return read;
    }

    public void close() {
        this.f31417f = null;
        try {
            FileInputStream fileInputStream = this.f31419h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f31419h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f31418g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f31418g = null;
                if (this.f31421j) {
                    this.f31421j = false;
                    q();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            } catch (Throwable th2) {
                this.f31418g = null;
                if (this.f31421j) {
                    this.f31421j = false;
                    q();
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new a(e11, 2000);
        } catch (Throwable th3) {
            this.f31419h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f31418g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f31418g = null;
                if (this.f31421j) {
                    this.f31421j = false;
                    q();
                }
                throw th3;
            } catch (IOException e12) {
                throw new a(e12, 2000);
            } catch (Throwable th4) {
                this.f31418g = null;
                if (this.f31421j) {
                    this.f31421j = false;
                    q();
                }
                throw th4;
            }
        }
    }

    public Uri n() {
        return this.f31417f;
    }
}
