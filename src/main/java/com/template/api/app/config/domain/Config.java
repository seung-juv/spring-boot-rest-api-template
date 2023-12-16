package com.template.api.app.config.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "config")
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 255)
    @NotNull
    @Column(name = "app_lang", nullable = false)
    private String appLang;

    @Size(max = 255)
    @NotNull
    @Column(name = "app_title", nullable = false)
    private String appTitle;

    @Size(max = 255)
    @NotNull
    @Column(name = "app_description", nullable = false)
    private String appDescription;

    @Size(max = 255)
    @NotNull
    @Column(name = "app_copyright", nullable = false)
    private String appCopyright;

    @Size(max = 255)
    @NotNull
    @Column(name = "app_og_locale", nullable = false)
    private String appOgLocale;

    @Size(max = 255)
    @NotNull
    @Column(name = "app_og_title", nullable = false)
    private String appOgTitle;

    @Size(max = 255)
    @NotNull
    @Column(name = "app_og_description", nullable = false)
    private String appOgDescription;

    @Size(max = 255)
    @NotNull
    @Column(name = "app_og_site_name", nullable = false)
    private String appOgSiteName;

    @Size(max = 255)
    @NotNull
    @Column(name = "app_og_type", nullable = false)
    private String appOgType;

    @Size(max = 255)
    @NotNull
    @Column(name = "app_og_image", nullable = false)
    private String appOgImage;

}
