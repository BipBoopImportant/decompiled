package org.maplibre.android.style.layers;

import androidx.annotation.Keep;

public class TransitionOptions {
    @Keep
    private long delay;
    @Keep
    private long duration;
    @Keep
    private boolean enablePlacementTransitions;

    public TransitionOptions(long j10, long j11) {
        this(j10, j11, true);
    }

    @Deprecated
    @Keep
    public static TransitionOptions fromTransitionOptions(long j10, long j11) {
        return new TransitionOptions(j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransitionOptions transitionOptions = (TransitionOptions) obj;
        if (this.duration == transitionOptions.duration && this.delay == transitionOptions.delay) {
            return this.enablePlacementTransitions == transitionOptions.enablePlacementTransitions;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.duration;
        long j11 = this.delay;
        return (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.enablePlacementTransitions ? 1 : 0);
    }

    public String toString() {
        return "TransitionOptions{duration=" + this.duration + ", delay=" + this.delay + ", enablePlacementTransitions=" + this.enablePlacementTransitions + '}';
    }

    public TransitionOptions(long j10, long j11, boolean z10) {
        this.duration = j10;
        this.delay = j11;
        this.enablePlacementTransitions = z10;
    }

    @Keep
    static TransitionOptions fromTransitionOptions(long j10, long j11, boolean z10) {
        return new TransitionOptions(j10, j11, z10);
    }
}
