package com.example.aservice.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bacon.common.data.local.preferences.PreferencesHelper
import com.example.aservice.R
import com.example.aservice.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding by viewBinding(ActivityMainBinding::bind)
    private lateinit var navController: NavController

    @Inject
    lateinit var preferences: PreferencesHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpNavigation()
    }

    private fun setUpNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container_app) as NavHostFragment
        navController = navHostFragment.navController

        val navGraph = navController.navInflater.inflate(R.navigation.nav_application)
        if (preferences.isAuthorized) {
            navGraph.setStartDestination(R.id.mainFlowFragment)
        } else {
            navGraph.setStartDestination(R.id.authFlowFragment)
        }
        navController.graph = navGraph
    }
}