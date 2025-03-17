package com.bumptech.glide.load;

import L7.x;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class a {

    /* renamed from: com.bumptech.glide.load.a$a  reason: collision with other inner class name */
    class C0810a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f46561a;

        C0810a(InputStream inputStream) {
            this.f46561a = inputStream;
        }

        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.d(this.f46561a);
            } finally {
                this.f46561a.reset();
            }
        }
    }

    class b implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f46562a;

        b(ByteBuffer byteBuffer) {
            this.f46562a = byteBuffer;
        }

        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f46562a);
            } finally {
                Y7.a.d(this.f46562a);
            }
        }
    }

    class c implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f46563a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F7.b f46564b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, F7.b bVar) {
            this.f46563a = parcelFileDescriptorRewinder;
            this.f46564b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                L7.x r1 = new L7.x     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f46563a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                F7.b r3 = r4.f46564b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.d(r1)     // Catch:{ all -> 0x0024 }
                r1.e()
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f46563a
                r0.a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.e()
            L_0x002d:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f46563a
                r0.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.c.a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    class d implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f46565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F7.b f46566b;

        d(ByteBuffer byteBuffer, F7.b bVar) {
            this.f46565a = byteBuffer;
            this.f46566b = bVar;
        }

        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f46565a, this.f46566b);
            } finally {
                Y7.a.d(this.f46565a);
            }
        }
    }

    class e implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f46567a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F7.b f46568b;

        e(InputStream inputStream, F7.b bVar) {
            this.f46567a = inputStream;
            this.f46568b = bVar;
        }

        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f46567a, this.f46568b);
            } finally {
                this.f46567a.reset();
            }
        }
    }

    class f implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f46569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F7.b f46570b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, F7.b bVar) {
            this.f46569a = parcelFileDescriptorRewinder;
            this.f46570b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                L7.x r1 = new L7.x     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f46569a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                F7.b r3 = r4.f46570b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                F7.b r0 = r4.f46570b     // Catch:{ all -> 0x0026 }
                int r5 = r5.a(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.e()
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f46569a
                r0.a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.e()
            L_0x002f:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f46569a
                r0.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.f.a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, F7.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, F7.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, F7.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List<ImageHeaderParser> list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = gVar.a(list.get(i10));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, F7.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, InputStream inputStream, F7.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0810a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List<ImageHeaderParser> list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType a10 = hVar.a(list.get(i10));
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
