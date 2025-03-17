package com.sugarcube.decorate_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NoThumbnails", "AllSmallThumbnails", "LastViewBestThumbnail", "View0BestThumbnail", "View1BestThumbnail", "View2BestThumbnail", "View3BestThumbnail", "View4BestThumbnail", "View5BestThumbnail", "View6BestThumbnail", "View7BestThumbnail", "Companion", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum LayoutThumbnailSpec {
    NoThumbnails(-3),
    AllSmallThumbnails(-2),
    LastViewBestThumbnail(-1),
    View0BestThumbnail(0),
    View1BestThumbnail(1),
    View2BestThumbnail(2),
    View3BestThumbnail(3),
    View4BestThumbnail(4),
    View5BestThumbnail(5),
    View6BestThumbnail(6),
    View7BestThumbnail(7);
    
    public static final Companion Companion = null;
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec$Companion;", "", "()V", "fromViewIndex", "Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec;", "viewIndex", "", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LayoutThumbnailSpec fromViewIndex(int i10) {
            LayoutThumbnailSpec layoutThumbnailSpec = null;
            if (i10 >= 0) {
                LayoutThumbnailSpec[] values = LayoutThumbnailSpec.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    LayoutThumbnailSpec layoutThumbnailSpec2 = values[i11];
                    if (layoutThumbnailSpec2.getValue() == i10) {
                        layoutThumbnailSpec = layoutThumbnailSpec2;
                        break;
                    }
                    i11++;
                }
            }
            return layoutThumbnailSpec == null ? LayoutThumbnailSpec.View0BestThumbnail : layoutThumbnailSpec;
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private LayoutThumbnailSpec(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
