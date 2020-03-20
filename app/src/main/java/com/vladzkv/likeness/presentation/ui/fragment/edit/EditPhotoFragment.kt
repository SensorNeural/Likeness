package com.vladzkv.likeness.presentation.ui.fragment.edit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vladzkv.likeness.R
import com.vladzkv.likeness.presentation.presenter.EditPhotoPresenter
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter


class EditPhotoFragment : MvpAppCompatFragment(), EditPhotoView {


    @InjectPresenter
    lateinit var presenter: EditPhotoPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_photo, container, false)
    }

}
