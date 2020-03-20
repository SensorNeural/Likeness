package com.vladzkv.likeness.presentation.adapter

import com.vladzkv.likeness.domain.entity.ProjectEntity

/**
 * Created by kirill on 20.03.2020.
 */
interface OnItemClick {
    fun onClickItem(item: ProjectEntity)
}