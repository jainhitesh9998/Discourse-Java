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
import java.time.Instant;

/**
 * A DoNotDisturbTimings.
 */
@Entity
@Table(name = "do_not_disturb_timings")
public class DoNotDisturbTimings extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "user_id", nullable = false)
    private String userId;

    @NotNull
    @Column(name = "starts_at", nullable = false)
    private Instant startsAt;

    @NotNull
    @Column(name = "ends_at", nullable = false)
    private Instant endsAt;

    @Column(name = "scheduled")
    private Boolean scheduled;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public DoNotDisturbTimings userId(String userId) {
        this.userId = userId;
        return this;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Instant getStartsAt() {
        return startsAt;
    }

    public DoNotDisturbTimings startsAt(Instant startsAt) {
        this.startsAt = startsAt;
        return this;
    }

    public void setStartsAt(Instant startsAt) {
        this.startsAt = startsAt;
    }

    public Instant getEndsAt() {
        return endsAt;
    }

    public DoNotDisturbTimings endsAt(Instant endsAt) {
        this.endsAt = endsAt;
        return this;
    }

    public void setEndsAt(Instant endsAt) {
        this.endsAt = endsAt;
    }

    public Boolean isScheduled() {
        return scheduled;
    }

    public DoNotDisturbTimings scheduled(Boolean scheduled) {
        this.scheduled = scheduled;
        return this;
    }

    public void setScheduled(Boolean scheduled) {
        this.scheduled = scheduled;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DoNotDisturbTimings)) {
            return false;
        }
        return id != null && id.equals(((DoNotDisturbTimings) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DoNotDisturbTimings{" +
            "id=" + getId() +
            ", userId='" + getUserId() + "'" +
            ", startsAt='" + getStartsAt() + "'" +
            ", endsAt='" + getEndsAt() + "'" +
            ", scheduled='" + isScheduled() + "'" +
            "}";
    }
}
