package com.optimizely.ab.config;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicProjectConfigManager implements ProjectConfigManager {
    private final AtomicReference<ProjectConfig> projectConfigReference = new AtomicReference<>();

    public ProjectConfig getConfig() {
        return this.projectConfigReference.get();
    }

    public void setConfig(ProjectConfig projectConfig) {
        this.projectConfigReference.set(projectConfig);
    }
}
