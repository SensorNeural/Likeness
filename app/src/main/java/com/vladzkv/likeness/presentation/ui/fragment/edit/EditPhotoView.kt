package com.vladzkv.likeness.presentation.ui.fragment.edit

import moxy.MvpView
import moxy.viewstate.strategy.alias.Skip

/**
 * Created by kirill on 20.03.2020.
 */
interface EditPhotoView : MvpView {

    @Skip
    fun openGallery()
}