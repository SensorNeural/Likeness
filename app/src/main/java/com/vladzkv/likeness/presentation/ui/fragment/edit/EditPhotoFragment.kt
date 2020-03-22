package com.vladzkv.likeness.presentation.ui.fragment.edit

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.vladzkv.likeness.R
import com.vladzkv.likeness.domain.openGalleryForPickingImage
import com.vladzkv.likeness.presentation.presenter.EditPhotoPresenter
import kotlinx.android.synthetic.main.fragment_edit_photo.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter


class EditPhotoFragment : MvpAppCompatFragment(), EditPhotoView {

    @InjectPresenter
    lateinit var presenter: EditPhotoPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_edit_photo, container, false)
    }

    override fun openGallery() {
        openGalleryForPickingImage(1000)
    }

}
