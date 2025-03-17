package com.optimizely.ab.config.audience.match;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MatchRegistry {
    public static final String EXACT = "exact";
    public static final String EXISTS = "exists";
    public static final String GREATER_THAN = "gt";
    public static final String GREATER_THAN_EQ = "ge";
    public static final String LEGACY = "legacy";
    public static final String LESS_THAN = "lt";
    public static final String LESS_THAN_EQ = "le";
    public static final String SEMVER_EQ = "semver_eq";
    public static final String SEMVER_GE = "semver_ge";
    public static final String SEMVER_GT = "semver_gt";
    public static final String SEMVER_LE = "semver_le";
    public static final String SEMVER_LT = "semver_lt";
    public static final String SUBSTRING = "substring";
    private static final Map<String, Match> registry = new ConcurrentHashMap();

    static {
        register(EXACT, new ExactMatch());
        register(EXISTS, new ExistsMatch());
        register(GREATER_THAN, new GTMatch());
        register(GREATER_THAN_EQ, new GEMatch());
        register(LEGACY, new DefaultMatchForLegacyAttributes());
        register(LESS_THAN, new LTMatch());
        register(LESS_THAN_EQ, new LEMatch());
        register(SEMVER_EQ, new SemanticVersionEqualsMatch());
        register(SEMVER_GE, new SemanticVersionGEMatch());
        register(SEMVER_GT, new SemanticVersionGTMatch());
        register(SEMVER_LE, new SemanticVersionLEMatch());
        register(SEMVER_LT, new SemanticVersionLTMatch());
        register(SUBSTRING, new SubstringMatch());
    }

    public static Match getMatch(String str) {
        Map<String, Match> map = registry;
        if (str == null) {
            str = LEGACY;
        }
        Match match = map.get(str);
        if (match != null) {
            return match;
        }
        throw new UnknownMatchTypeException();
    }

    public static void register(String str, Match match) {
        registry.put(str, match);
    }
}
