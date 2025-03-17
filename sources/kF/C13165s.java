package KF;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.sugarcube.app.base.upload.UploadWorkerV2;

/* renamed from: KF.s  reason: case insensitive filesystem */
public final class C13165s {
    public static UploadWorkerV2 a(Context context, WorkerParameters workerParameters) {
        return new UploadWorkerV2(context, workerParameters);
    }
}
