package oe;

import com.adjust.sdk.AdjustEvent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Loe/i;", "", "", "appToken", "environment", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "key", "value", "addSessionCallbackParameter", "Lcom/adjust/sdk/AdjustEvent;", "event", "trackEvent", "(Lcom/adjust/sdk/AdjustEvent;)V", "onResume", "()V", "onPause", "", "b", "()Z", "setEnabled", "(Z)V", "enabled", "adjust-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oe.i  reason: case insensitive filesystem */
public interface C10119i {
    void a(String str, String str2);

    void addSessionCallbackParameter(String str, String str2);

    boolean b();

    void onPause();

    void onResume();

    void setEnabled(boolean z10);

    void trackEvent(AdjustEvent adjustEvent);
}
