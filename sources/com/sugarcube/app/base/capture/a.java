package com.sugarcube.app.base.capture;

import XH.t;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/app/base/capture/a;", "", "<init>", "(Ljava/lang/String;I)V", "", "b", "()Ljava/lang/String;", "Companion", "a", "ULTRAWIDE_LANDSCAPE", "HYBRID", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum a {
    ULTRAWIDE_LANDSCAPE,
    HYBRID;
    
    public static final C3024a Companion = null;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/capture/a$a;", "", "<init>", "()V", "", "name", "Lcom/sugarcube/app/base/capture/a;", "a", "(Ljava/lang/String;)Lcom/sugarcube/app/base/capture/a;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.capture.a$a  reason: collision with other inner class name */
    public static final class C3024a {
        public /* synthetic */ C3024a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            C17542s.j(str, "name");
            try {
                return a.valueOf(str);
            } catch (IllegalArgumentException unused) {
                return a.HYBRID;
            }
        }

        private C3024a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f122815a = null;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.sugarcube.app.base.capture.a[] r0 = com.sugarcube.app.base.capture.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.capture.a r1 = com.sugarcube.app.base.capture.a.ULTRAWIDE_LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.app.base.capture.a r1 = com.sugarcube.app.base.capture.a.HYBRID     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f122815a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.capture.a.b.<clinit>():void");
        }
    }

    static {
        a[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new C3024a((DefaultConstructorMarker) null);
    }

    public final String b() {
        int i10 = b.f122815a[ordinal()];
        if (i10 == 1) {
            return "Ultrawide";
        }
        if (i10 == 2) {
            return "Hybrid";
        }
        throw new t();
    }
}
