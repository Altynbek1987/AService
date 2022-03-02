package com.bacon.feature_sign.presentation.ui.fragments.sign.signup

import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bacon.common.base.BaseFragment
import com.bacon.common.data.local.preferences.PreferencesHelper
import com.bacon.common.extensions.setOnSingleClickListener
import com.bacon.feature_sign.R
import com.bacon.feature_sign.databinding.FragmentSignUpBinding
import com.bacon.feature_sign.presentation.ui.fragments.sign.SignViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignUpFragment : BaseFragment<FragmentSignUpBinding, SignViewModel>(
    R.layout.fragment_sign_up
) {
    override val binding by viewBinding(FragmentSignUpBinding::bind)
    override val viewModel: SignViewModel by hiltNavGraphViewModels(R.id.sign_graph)

    @Inject
    lateinit var preferences: PreferencesHelper
    override fun setupListeners() {
        clickSignIn()
        clickSignUp()
    }

    private fun clickSignIn() {
        binding.buttonSignIn.setOnSingleClickListener {
            preferences.isAuthorized = true
        }
    }

    private fun clickSignUp() {
        binding.buttonSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
        }
    }
}