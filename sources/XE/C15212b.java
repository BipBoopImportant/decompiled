package xE;

import android.app.UiModeManager;
import android.content.Context;
import com.optimizely.ab.event.internal.payload.EventBatch;

/* renamed from: xE.b  reason: case insensitive filesystem */
public class C15212b {
    public static EventBatch.ClientEngine a(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? EventBatch.ClientEngine.ANDROID_SDK : EventBatch.ClientEngine.ANDROID_TV_SDK;
    }
}
