package com.contentsquare.android.sdk;

import android.graphics.Point;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C17542s;

public final class l1 {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f47494a;

        /* renamed from: b  reason: collision with root package name */
        public final Point f47495b;

        public a(WeakReference<View> weakReference, Point point) {
            C17542s.j(weakReference, "scrollViewRef");
            C17542s.j(point, "scrollState");
            this.f47494a = weakReference;
            this.f47495b = point;
        }
    }
}
