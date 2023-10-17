package org.thepalaceproject.theme.sandbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class SandboxActivity : AppCompatActivity(R.layout.sandbox) {

  private lateinit var bottomNavigationView: BottomNavigationView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val buttonsFragment =
      ButtonsFragment()
    val otherFragment =
      OtherFragment()
    val tabsFragment =
      TabsFragment()
    val tabbedButtonsFragment =
      TabbedButtonsFragment()

    if (savedInstanceState == null) {
      val fragmentTransaction: FragmentTransaction = this.supportFragmentManager.beginTransaction()
      fragmentTransaction.replace(R.id.sandboxFragmentContainer, buttonsFragment).commit()
    }

    this.bottomNavigationView =
      this.findViewById(R.id.sandboxBottomNavigation)

    this.bottomNavigationView.setOnItemSelectedListener { item ->
      val fragmentManager: FragmentManager = this.supportFragmentManager
      return@setOnItemSelectedListener when (item.itemId) {
        R.id.navButtons -> {
          val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
          fragmentTransaction.replace(R.id.sandboxFragmentContainer, buttonsFragment).commit()
          true
        }
        R.id.navOther -> {
          val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
          fragmentTransaction.replace(R.id.sandboxFragmentContainer, otherFragment).commit()
          true
        }
        R.id.navTabs -> {
          val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
          fragmentTransaction.replace(R.id.sandboxFragmentContainer, tabsFragment).commit()
          true
        }
        R.id.navTabbedButtons -> {
          val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
          fragmentTransaction.replace(R.id.sandboxFragmentContainer, tabbedButtonsFragment).commit()
          true
        }
        else -> {
          true
        }
      }
    }
  }
}
