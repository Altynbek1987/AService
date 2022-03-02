package com.bacon.feature_sign.presentation.ui.fragments.sign.signin

import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bacon.common.base.BaseFragment
import com.bacon.feature_sign.R
import com.bacon.feature_sign.databinding.FragmentSignInBinding
import com.bacon.feature_sign.presentation.ui.fragments.sign.SignViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInFragment : BaseFragment<FragmentSignInBinding, SignViewModel>(
    R.layout.fragment_sign_in
) {
    override val binding by viewBinding(FragmentSignInBinding::bind)
    override val viewModel: SignViewModel by hiltNavGraphViewModels(R.id.sign_graph)

}