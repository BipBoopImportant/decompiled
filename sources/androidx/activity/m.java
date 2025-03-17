package androidx.activity;

import android.content.IntentSender;
import androidx.activity.j;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j.g f15287a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15288b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f15289c;

    public /* synthetic */ m(j.g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f15287a = gVar;
        this.f15288b = i10;
        this.f15289c = sendIntentException;
    }

    public final void run() {
        j.g.t(this.f15287a, this.f15288b, this.f15289c);
    }
}
