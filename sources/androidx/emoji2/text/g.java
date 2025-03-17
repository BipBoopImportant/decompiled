package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer.c f21578a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f.i f21579b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f21580c;

    public /* synthetic */ g(EmojiCompatInitializer.c cVar, f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f21578a = cVar;
        this.f21579b = iVar;
        this.f21580c = threadPoolExecutor;
    }

    public final void run() {
        this.f21578a.d(this.f21579b, this.f21580c);
    }
}
