package oe;

import android.content.Context;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Loe/j;", "Loe/i;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "appToken", "environment", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "key", "value", "addSessionCallbackParameter", "Lcom/adjust/sdk/AdjustEvent;", "event", "trackEvent", "(Lcom/adjust/sdk/AdjustEvent;)V", "onResume", "()V", "onPause", "Landroid/content/Context;", "", "b", "()Z", "setEnabled", "(Z)V", "enabled", "adjust-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oe.j  reason: case insensitive filesystem */
public final class C10120j implements C10119i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f75729a;

    public C10120j(Context context) {
        C17542s.j(context, "context");
        this.f75729a = context;
    }

    public void a(String str, String str2) {
        C17542s.j(str, "appToken");
        C17542s.j(str2, "environment");
        AdjustConfig adjustConfig = new AdjustConfig(this.f75729a, str, str2, true);
        adjustConfig.startEnabled = Boolean.TRUE;
        Adjust.onCreate(adjustConfig);
    }

    public void addSessionCallbackParameter(String str, String str2) {
        C17542s.j(str, "key");
        C17542s.j(str2, "value");
        Adjust.addSessionCallbackParameter(str, str2);
    }

    public boolean b() {
        return Adjust.isEnabled();
    }

    public void onPause() {
        Adjust.onResume();
    }

    public void onResume() {
        Adjust.onResume();
    }

    public void setEnabled(boolean z10) {
        Adjust.setEnabled(z10);
    }

    public void trackEvent(AdjustEvent adjustEvent) {
        C17542s.j(adjustEvent, "event");
        Adjust.trackEvent(adjustEvent);
    }
}
