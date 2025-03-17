package com.optimizely.ab.config.audience.match;

import FE.C12869a;
import java.util.ArrayList;
import java.util.Collections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public final class SemanticVersion {
    private static final String BUILD_SEPERATOR = "\\+";
    private static final String PRE_RELEASE_SEPERATOR = "-";
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) SemanticVersion.class);
    private final String version;

    public SemanticVersion(String str) {
        this.version = str;
    }

    public static int compare(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof String)) {
            try {
                return new SemanticVersion((String) obj).compare(new SemanticVersion((String) obj2));
            } catch (Exception e10) {
                logger.warn("Error comparing semantic versions", (Throwable) e10);
            }
        }
        throw new UnexpectedValueTypeException();
    }

    private int dotCount(String str) {
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            if (c10 == '.') {
                i10++;
            }
        }
        return i10;
    }

    private boolean isValidBuildMetadata() {
        int i10 = 0;
        for (char c10 : this.version.toCharArray()) {
            if (c10 == '+') {
                i10++;
            }
        }
        return i10 > 1;
    }

    public boolean isBuild() {
        int indexOf = this.version.indexOf(Marker.ANY_NON_NULL_MARKER);
        int indexOf2 = this.version.indexOf(PRE_RELEASE_SEPERATOR);
        if (indexOf2 < 0) {
            return indexOf > 0;
        }
        if (indexOf < 0) {
            return false;
        }
        return indexOf < indexOf2;
    }

    public boolean isPreRelease() {
        int indexOf = this.version.indexOf(Marker.ANY_NON_NULL_MARKER);
        int indexOf2 = this.version.indexOf(PRE_RELEASE_SEPERATOR);
        if (indexOf < 0) {
            return indexOf2 > 0;
        }
        if (indexOf2 < 0) {
            return false;
        }
        return indexOf2 < indexOf;
    }

    public String[] splitSemanticVersion() {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (this.version.contains(" ") || isValidBuildMetadata()) {
            throw new Exception("Invalid Semantic Version.");
        }
        if (isBuild() || isPreRelease()) {
            String[] split = this.version.split(isPreRelease() ? PRE_RELEASE_SEPERATOR : BUILD_SEPERATOR, 2);
            if (split.length > 1) {
                String str3 = split[0];
                str = split[1];
                str2 = str3;
            } else {
                throw new Exception("Invalid Semantic Version.");
            }
        } else {
            str2 = this.version;
            str = "";
        }
        String[] split2 = str2.split("\\.");
        if (split2.length > 3 || split2.length == 0 || dotCount(str2) >= split2.length) {
            throw new Exception("Invalid Semantic Version.");
        }
        int length = split2.length;
        int i10 = 0;
        while (i10 < length) {
            if (C12869a.b(split2[i10]) != null) {
                i10++;
            } else {
                throw new Exception("Invalid Semantic Version.");
            }
        }
        Collections.addAll(arrayList, split2);
        if (!C12869a.c(str)) {
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public int compare(SemanticVersion semanticVersion) {
        if (semanticVersion != null && !C12869a.c(semanticVersion.version)) {
            String[] splitSemanticVersion = semanticVersion.splitSemanticVersion();
            String[] splitSemanticVersion2 = splitSemanticVersion();
            int i10 = 0;
            while (i10 < splitSemanticVersion.length) {
                if (splitSemanticVersion2.length > i10) {
                    Integer b10 = C12869a.b(splitSemanticVersion[i10]);
                    Integer b11 = C12869a.b(splitSemanticVersion2[i10]);
                    if (b11 == null) {
                        int compareTo = splitSemanticVersion2[i10].compareTo(splitSemanticVersion[i10]);
                        if (compareTo < 0) {
                            if (!semanticVersion.isPreRelease() || isPreRelease()) {
                                return -1;
                            }
                            return 1;
                        } else if (compareTo > 0) {
                            if (semanticVersion.isPreRelease() || !isPreRelease()) {
                                return 1;
                            }
                            return -1;
                        }
                    } else if (b10 == null) {
                        return -1;
                    } else {
                        if (!b11.equals(b10)) {
                            if (b11.intValue() < b10.intValue()) {
                                return -1;
                            }
                            return 1;
                        }
                    }
                    i10++;
                } else if (semanticVersion.isPreRelease()) {
                    return 1;
                } else {
                    return -1;
                }
            }
            if (semanticVersion.isPreRelease() || !isPreRelease()) {
                return 0;
            }
            return -1;
        }
        return 0;
    }
}
