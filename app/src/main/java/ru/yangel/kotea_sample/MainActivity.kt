package ru.yangel.kotea_sample

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import ru.yangel.kotea_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View {
        binding.button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .show(FirstFragment())
                .commit()
        }
        return binding.root
    }


}