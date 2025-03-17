package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    private final InternalRewinder f46571a;

    private static final class InternalRewinder {

        /* renamed from: a  reason: collision with root package name */
        private final ParcelFileDescriptor f46572a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f46572a = parcelFileDescriptor;
        }

        /* access modifiers changed from: package-private */
        public ParcelFileDescriptor rewind() {
            try {
                Os.lseek(this.f46572a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f46572a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    public static final class a implements e.a<ParcelFileDescriptor> {
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f46571a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    public void b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor a() {
        return this.f46571a.rewind();
    }
}
