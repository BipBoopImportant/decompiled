package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.impl.k0  reason: case insensitive filesystem */
public interface C5031k0 {

    /* renamed from: androidx.camera.core.impl.k0$a */
    public static abstract class a {
        public static a a(int i10, String str, int i11, int i12, int i13, int i14) {
            return new C5018e(i10, str, i11, i12, i13, i14);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract int f();

        public abstract int g();
    }

    /* renamed from: androidx.camera.core.impl.k0$b */
    public static abstract class b implements C5031k0 {
        public static b h(int i10, int i11, List<a> list, List<c> list2) {
            return new C5020f(i10, i11, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    /* renamed from: androidx.camera.core.impl.k0$c */
    public static abstract class c {
        public static c a(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            return new C5022g(i10, str, i11, i12, i13, i14, i15, i16, i17, i18);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract int f();

        public abstract int g();

        public abstract int h();

        public abstract String i();

        public abstract int j();

        public abstract int k();
    }

    static int c(int i10) {
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            return i10 != 5 ? -1 : 39;
        }
        return 5;
    }

    static String d(int i10) {
        switch (i10) {
            case 1:
                return "video/3gpp";
            case 2:
                return "video/avc";
            case 3:
                return "video/mp4v-es";
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return "video/hevc";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/dolby-vision";
            case 8:
                return "video/av01";
            default:
                return "video/none";
        }
    }

    static String g(int i10) {
        switch (i10) {
            case 1:
                return "audio/3gpp";
            case 2:
                return "audio/amr-wb";
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return "audio/opus";
            default:
                return "audio/none";
        }
    }

    int a();

    List<c> b();

    int e();

    List<a> f();
}
