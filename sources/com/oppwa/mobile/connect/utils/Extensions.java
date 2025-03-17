package com.oppwa.mobile.connect.utils;

import android.content.Intent;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/oppwa/mobile/connect/utils/Extensions;", "", "()V", "getParcelableExtraProvider", "T", "Landroid/content/Intent;", "key", "", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Object;", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Extensions {
    public static final Extensions INSTANCE = new Extensions();

    private Extensions() {
    }

    public final /* synthetic */ <T> T getParcelableExtraProvider(Intent intent, String str) {
        C17542s.j(intent, "<this>");
        C17542s.j(str, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            C17542s.o(4, "T");
            return intent.getParcelableExtra(str, Object.class);
        }
        T parcelableExtra = intent.getParcelableExtra(str);
        C17542s.o(2, "T");
        Object obj = (Object) parcelableExtra;
        return parcelableExtra;
    }
}
