package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.provider.HttpUtils;
import com.oppwa.mobile.connect.utils.BaseTask;
import com.oppwa.mobile.connect.utils.TaskRunner;
import java.util.HashSet;
import java.util.Set;

public class ImageLoader {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f120971e = "com.oppwa.mobile.connect.checkout.dialog.ImageLoader";

    /* renamed from: f  reason: collision with root package name */
    private static ImageLoader f120972f;

    /* renamed from: a  reason: collision with root package name */
    private ImagesRequest f120973a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Listener> f120974b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private final Context f120975c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f120976d = new HashSet();

    public class DownloadImagesTask extends BaseTask<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private final String f120977a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f120978b;

        /* renamed from: c  reason: collision with root package name */
        private final String f120979c;

        DownloadImagesTask(Context context, String str, String str2) {
            this.f120978b = context;
            this.f120977a = str;
            this.f120979c = str2;
        }

        public void onError(Exception exc) {
            Log.d(ImageLoader.f120971e, exc.getMessage());
        }

        public Bitmap call() {
            try {
                return HttpUtils.downloadBitmap(this.f120979c);
            } catch (Exception e10) {
                Log.d(ImageLoader.f120971e, e10.getMessage());
                return null;
            }
        }

        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            if (bitmap != null) {
                ImageCache.getInstance().a(this.f120977a, bitmap);
                C14087m.a(this.f120978b, this.f120977a, bitmap);
            } else {
                ImageCache.getInstance().a(this.f120977a, ImageLoader.this.b(this.f120977a));
            }
            ImageLoader.this.f(this.f120977a);
        }
    }

    @FunctionalInterface
    public interface Listener {
        void onImageLoaded(String str);
    }

    ImageLoader(Context context) {
        this.f120975c = context.getApplicationContext();
    }

    private Bitmap c(String str) {
        return BitmapFactory.decodeResource(this.f120975c.getResources(), C14069g.a(this.f120975c, str));
    }

    private void e(String str) {
        if (!this.f120976d.contains(str)) {
            this.f120976d.add(str);
            new TaskRunner().executeAsync(new DownloadImagesTask(this.f120975c, str, this.f120973a.getImagesRequestMap().get(str).getUrl()));
        }
    }

    /* access modifiers changed from: private */
    public void f(String str) {
        for (Listener onImageLoaded : this.f120974b) {
            onImageLoaded.onImageLoaded(str);
        }
        this.f120976d.remove(str);
    }

    public static synchronized ImageLoader getInstance(Context context) {
        ImageLoader imageLoader;
        synchronized (ImageLoader.class) {
            try {
                if (f120972f == null) {
                    f120972f = new ImageLoader(context);
                }
                imageLoader = f120972f;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return imageLoader;
    }

    public void addListener(Listener listener) {
        this.f120974b.add(listener);
    }

    /* access modifiers changed from: package-private */
    public boolean d(String str) {
        ImagesRequest imagesRequest = this.f120973a;
        return !TextUtils.isEmpty((imagesRequest == null || imagesRequest.getImagesRequestMap() == null || !this.f120973a.getImagesRequestMap().containsKey(str)) ? null : this.f120973a.getImagesRequestMap().get(str).getUrl());
    }

    public Bitmap getImage(String str) {
        Bitmap a10 = ImageCache.getInstance().a(str);
        if (a10 == null) {
            a10 = C14087m.b(this.f120975c, str);
        }
        if (a10 != null) {
            ImageCache.getInstance().a(str, a10);
            return a10;
        } else if (!d(str)) {
            return b(str);
        } else {
            e(str);
            return a10;
        }
    }

    public void removeListener(Listener listener) {
        this.f120974b.remove(listener);
    }

    /* access modifiers changed from: private */
    public Bitmap b(String str) {
        Bitmap c10 = c(str);
        return c10 == null ? a(str) : c10;
    }

    /* access modifiers changed from: package-private */
    public void a(ImagesRequest imagesRequest) {
        if (imagesRequest != null) {
            ImagesRequest imagesRequest2 = this.f120973a;
            if (imagesRequest2 == null) {
                this.f120973a = imagesRequest;
            } else {
                imagesRequest2.addValues(imagesRequest);
            }
        }
    }

    private Bitmap a(String str) {
        Bitmap createBitmap = Bitmap.createBitmap(250, 250, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = this.f120975c.getResources().getDisplayMetrics().density;
        Paint paint = new Paint(1);
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setTextSize((float) ((int) (f10 * 14.0f)));
        paint.setShadowLayer(1.0f, 0.0f, 1.0f, -1);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, (float) ((createBitmap.getWidth() - rect.width()) / 2), (float) ((createBitmap.getHeight() + rect.height()) / 2), paint);
        return createBitmap;
    }
}
