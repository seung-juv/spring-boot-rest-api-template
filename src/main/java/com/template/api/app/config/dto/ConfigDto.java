package com.template.api.app.config.dto;

import lombok.Getter;
import lombok.Setter;

public class ConfigDto {

    @Getter
    @Setter
    public static class Update {
        private String appLang;
        private String appTitle;
        private String appDescription;
        private String appCopyright;
        private String appOgLocale;
        private String appOgTitle;
        private String appOgDescription;
        private String appOgSiteName;
        private String appOgType;
        private String appOgImage;
        private String githubUrl;
        private String facebookUrl;
        private String instagramUrl;
        private String googleUrl;
    }

    @Getter
    @Setter
    public static class Response {
        private String appLang;
        private String appTitle;
        private String appDescription;
        private String appCopyright;
        private String appOgLocale;
        private String appOgTitle;
        private String appOgDescription;
        private String appOgSiteName;
        private String appOgType;
        private String appOgImage;
        private String githubUrl;
        private String facebookUrl;
        private String instagramUrl;
        private String googleUrl;
    }

}
