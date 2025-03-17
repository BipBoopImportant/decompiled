package com.sugarcube.decorate_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate_engine/EraserPickId;", "", "id", "", "(I)V", "isAll", "", "()Z", "isNone", "rawId", "getRawId$decorate_engine_release", "()I", "component1", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EraserPickId {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final EraserPickId kAll = new EraserPickId(-1);
    private static final int kEraserPickIdAll = -1;
    private static final int kEraserPickIdNone = 0;
    /* access modifiers changed from: private */
    public static final EraserPickId kNone = new EraserPickId(0);

    /* renamed from: id  reason: collision with root package name */
    private final int f142946id;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/sugarcube/decorate_engine/EraserPickId$Companion;", "", "()V", "kAll", "Lcom/sugarcube/decorate_engine/EraserPickId;", "getKAll", "()Lcom/sugarcube/decorate_engine/EraserPickId;", "kEraserPickIdAll", "", "kEraserPickIdNone", "kNone", "getKNone", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EraserPickId getKAll() {
            return EraserPickId.kAll;
        }

        public final EraserPickId getKNone() {
            return EraserPickId.kNone;
        }

        private Companion() {
        }
    }

    public EraserPickId(int i10) {
        this.f142946id = i10;
    }

    private final int component1() {
        return this.f142946id;
    }

    public static /* synthetic */ EraserPickId copy$default(EraserPickId eraserPickId, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = eraserPickId.f142946id;
        }
        return eraserPickId.copy(i10);
    }

    public final EraserPickId copy(int i10) {
        return new EraserPickId(i10);
    }

    public boolean equals(Object obj) {
        return obj != null && C17542s.e(obj.getClass(), EraserPickId.class) && ((EraserPickId) obj).f142946id == this.f142946id;
    }

    public final int getRawId$decorate_engine_release() {
        return this.f142946id;
    }

    public int hashCode() {
        return this.f142946id;
    }

    public final boolean isAll() {
        return this.f142946id == -1;
    }

    public final boolean isNone() {
        return this.f142946id == 0;
    }

    public String toString() {
        if (isNone()) {
            return "EraserPickId:None";
        }
        if (isAll()) {
            return "EraserPickId:All";
        }
        int i10 = this.f142946id;
        return "EraserPickId:" + i10;
    }
}
