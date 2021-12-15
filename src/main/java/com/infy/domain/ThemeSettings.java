/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;

/**
 * A ThemeSettings.
 */
@Entity
@Table(name = "theme_settings")
public class ThemeSettings extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "data_type", nullable = false)
    private Integer dataType;

    @Column(name = "value")
    private String value;

    @NotNull
    @Column(name = "theme_id", nullable = false)
    private Long themeId;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public ThemeSettings name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDataType() {
        return dataType;
    }

    public ThemeSettings dataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getValue() {
        return value;
    }

    public ThemeSettings value(String value) {
        this.value = value;
        return this;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getThemeId() {
        return themeId;
    }

    public ThemeSettings themeId(Long themeId) {
        this.themeId = themeId;
        return this;
    }

    public void setThemeId(Long themeId) {
        this.themeId = themeId;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThemeSettings)) {
            return false;
        }
        return id != null && id.equals(((ThemeSettings) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ThemeSettings{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", dataType=" + getDataType() +
            ", value='" + getValue() + "'" +
            ", themeId=" + getThemeId() +
            "}";
    }
}
