package com.contentsquare.android.core.features.config.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/a;", "", "", "fps", "", "densityScaleDown", "<init>", "(Ljava/lang/String;IIF)V", "", "toString", "()Ljava/lang/String;", "I", "m", "()I", "F", "j", "()F", "Companion", "a", "LOW", "MEDIUM", "HIGH", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum a {
    LOW(5, 2.0f),
    MEDIUM(10, 1.5f),
    HIGH(10, 1.0f);
    
    public static final C0814a Companion = null;
    /* access modifiers changed from: private */
    public static final String DEFAULT_RECORDING_QUALITY = null;
    private final float densityScaleDown;
    private final int fps;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/contentsquare/android/core/features/config/model/a$a;", "", "<init>", "()V", "", "name", "Lcom/contentsquare/android/core/features/config/model/a;", "b", "(Ljava/lang/String;)Lcom/contentsquare/android/core/features/config/model/a;", "DEFAULT_RECORDING_QUALITY", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.contentsquare.android.core.features.config.model.a$a  reason: collision with other inner class name */
    public static final class C0814a {
        private C0814a() {
        }

        public final String a() {
            return a.DEFAULT_RECORDING_QUALITY;
        }

        public final a b(String str) {
            C17542s.j(str, "name");
            String upperCase = str.toUpperCase(Locale.ROOT);
            C17542s.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return a.valueOf(upperCase);
        }

        public /* synthetic */ C0814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Companion = new C0814a((DefaultConstructorMarker) null);
        String lowerCase = "MEDIUM".toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        DEFAULT_RECORDING_QUALITY = lowerCase;
    }

    private a(int i10, float f10) {
        this.fps = i10;
        this.densityScaleDown = f10;
    }

    public final float j() {
        return this.densityScaleDown;
    }

    public final int m() {
        return this.fps;
    }

    public String toString() {
        return name() + " (FPS=" + this.fps + " ImageQuality=" + this.densityScaleDown + '(' + ordinal() + "))";
    }
}
