package com.vladzkv.likeness.presentation.presenter

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.fragment.app.Fragment
import com.vladzkv.likeness.domain.openGalleryForPickingImage
import com.vladzkv.likeness.presentation.ui.MainActivity
import com.vladzkv.likeness.presentation.ui.fragment.main.MainView
import moxy.InjectViewState
import moxy.MvpPresenter


/**
 * Created by kirill on 20.03.2020.
 */

@InjectViewState
class MainFragmentPresenter : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
    }


}