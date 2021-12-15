/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * A DTO for the {@link com.infy.domain.SharedDrafts} entity.
 */
public class SharedDraftsDTO extends AbstractAuditingDTO implements Serializable {

    private Long id;

    @NotNull
    private Long topicId;

    @NotNull
    private Long categoryId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SharedDraftsDTO)) {
            return false;
        }

        return id != null && id.equals(((SharedDraftsDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SharedDraftsDTO{" +
            "id=" + getId() +
            ", topicId=" + getTopicId() +
            ", categoryId=" + getCategoryId() +
            "}";
    }
}
