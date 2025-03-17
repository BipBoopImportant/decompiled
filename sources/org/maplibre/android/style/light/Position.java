package org.maplibre.android.style.light;

import androidx.annotation.Keep;

public class Position {
    @Keep
    private float azimuthalAngle;
    @Keep
    private float polarAngle;
    @Keep
    private float radialCoordinate;

    public Position(float f10, float f11, float f12) {
        this.radialCoordinate = f10;
        this.azimuthalAngle = f11;
        this.polarAngle = f12;
    }

    @Keep
    public static Position fromPosition(float f10, float f11, float f12) {
        return new Position(f10, f11, f12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Position position = (Position) obj;
        if (Float.compare(position.radialCoordinate, this.radialCoordinate) == 0 && Float.compare(position.azimuthalAngle, this.azimuthalAngle) == 0) {
            return Float.compare(position.polarAngle, this.polarAngle) == 0;
        }
        return false;
    }

    public int hashCode() {
        float f10 = this.radialCoordinate;
        int i10 = 0;
        int floatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
        float f11 = this.azimuthalAngle;
        int floatToIntBits2 = (floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
        float f12 = this.polarAngle;
        if (f12 != 0.0f) {
            i10 = Float.floatToIntBits(f12);
        }
        return floatToIntBits2 + i10;
    }

    public String toString() {
        return "Position{radialCoordinate=" + this.radialCoordinate + ", azimuthalAngle=" + this.azimuthalAngle + ", polarAngle=" + this.polarAngle + '}';
    }
}
