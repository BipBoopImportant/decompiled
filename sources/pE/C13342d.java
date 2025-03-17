package PE;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sugarcube.app.base.capture.UploadWorker;

/* renamed from: PE.d  reason: case insensitive filesystem */
public final class C13342d {
    public static UploadWorker a(Context context, WorkerParameters workerParameters) {
        return new UploadWorker(context, workerParameters);
    }
}
