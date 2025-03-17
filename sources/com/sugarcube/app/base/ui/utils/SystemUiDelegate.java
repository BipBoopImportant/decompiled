package com.sugarcube.app.base.ui.utils;

import android.app.Activity;
import androidx.lifecycle.C5221y;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "LXH/N;", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SystemUiDelegate {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(SystemUiDelegate systemUiDelegate, Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    z10 = true;
                }
                boolean z12 = z10;
                if ((i10 & 8) != 0) {
                    z11 = false;
                }
                boolean z13 = z11;
                if ((i10 & 16) != 0) {
                    num = null;
                }
                systemUiDelegate.installSystemUiDelegate(activity, yVar, z12, z13, num);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: installSystemUiDelegate");
        }
    }

    void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num);
}
