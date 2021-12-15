/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service;

import com.infy.service.dto.PostActionTypesDTO;
import com.infy.service.model.CreatePostActionTypeRequest;
import com.infy.service.model.PostActionTypeResponse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.infy.domain.PostActionTypes}.
 */
public interface PostActionTypesService {

    /**
     * Save a postActionTypes.
     *
     * @param postActionTypesDTO the entity to save.
     * @return the persisted entity.
     */
    PostActionTypesDTO save(PostActionTypesDTO postActionTypesDTO);

    /**
     * Get all the postActionTypes.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<PostActionTypesDTO> findAll(Pageable pageable);


    /**
     * Get the "id" postActionTypes.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<PostActionTypesDTO> findOne(Long id);

    /**
     * Delete the "id" postActionTypes.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

    PostActionTypeResponse saveAndResponse(CreatePostActionTypeRequest createPostActionTypeRequest);
}
